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

package org.openintents.historify.ui;

import org.openintents.historify.ui.fragments.ContactsListFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * 
 * Contacts list view. Contains a fragment for displaying the list of contacts.
 * 
 * @author berke.andras
 */
public class ContactsActivity extends FragmentActivity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		if (savedInstanceState == null) {

			ContactsListFragment fragment = new ContactsListFragment();
			Bundle arguments = getIntent().getExtras();
			fragment.setArguments(arguments == null ? new Bundle() : arguments);
			getSupportFragmentManager().beginTransaction().add(
					android.R.id.content, fragment).commit();
		}
	}

}