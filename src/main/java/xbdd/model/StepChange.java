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
package xbdd.model;

public class StepChange {

	private String id;
	private String curr;
	private String prev;

	public String getId() {
		return this.id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getCurr() {
		return this.curr;
	}

	public void setCurr(final String curr) {
		this.curr = curr;
	}

	public String getPrev() {
		return this.prev;
	}

	public void setPrev(final String prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return "StepChange [id=" + this.id + ", curr=" + this.curr + ", prev=" + this.prev + "]";
	}
}