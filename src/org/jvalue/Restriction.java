/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jvalue;

/**
 * A Restriction specifies some type constraint on the allowed values of a value object.
 * It is called restriction in alignment with XML Schema terminology.
 */
public abstract class Restriction<T> {

	/**
	 * 
	 */
	public abstract boolean isSatisfiedBy(T value);
	
	/**
	 * 
	 */
	public Restriction<T> and(Restriction<T> other) {
		return new BooleanRestriction.And<T>(this, other);
	}
	
	/**
	 * 
	 */
	public Restriction<T> or(Restriction<T> other) {
		return new BooleanRestriction.Or<T>(this, other);
	}
	
}
