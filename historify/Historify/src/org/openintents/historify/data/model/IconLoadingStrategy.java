/* 
 * Copyright (C) 2011 OpenIntents.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openintents.historify.data.model;

/**
 * The icon loading strategy defines that timeline icons for a particular
 * source should be loaded from the source itself, or the custom icon of the
 * event should be used.
 */
public enum IconLoadingStrategy {
	
	useSourceIcon, useEventIcon;

	public static IconLoadingStrategy parseString(String string) {
		for(IconLoadingStrategy value : values()) {
			if(value.toString().equals(string)) return value;
		}
		return null;
	}
}