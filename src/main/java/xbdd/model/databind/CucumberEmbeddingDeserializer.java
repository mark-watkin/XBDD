/**
 * Copyright (C) 2015 Orion Health (Orchestral Development Ltd)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xbdd.model.databind;

import java.io.IOException;

import xbdd.model.cucumber.CucumberEmbedding;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class CucumberEmbeddingDeserializer extends JsonDeserializer<CucumberEmbedding> {

	@Override
	public CucumberEmbedding deserialize(final JsonParser jp, final DeserializationContext ctxt) throws IOException,
			JsonProcessingException {
		final CucumberEmbedding embedding = new CucumberEmbedding();
		if (JsonToken.START_OBJECT.equals(jp.getCurrentToken())) {
			final EmbededReference ref = jp.readValueAs(EmbededReference.class);
			embedding.setFilename(ref.getFilename());
			embedding.setMimeType(ref.getMimeType());
		} else {
			// backwards compatibility for embeddings that were saved only as a filename reference
			embedding.setFilename(jp.getValueAsString());
		}
		return embedding;
	}

}