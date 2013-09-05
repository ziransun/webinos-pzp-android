/*******************************************************************************
*  Code contributed to the webinos project
*
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
*
* Copyright 2011-2012 Paddy Byers
*
******************************************************************************/

package org.webinos.android.app.wrt.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ProgressEventReceiver extends BroadcastReceiver {
    
	private static final String TAG = ProgressEventReceiver.class.getSimpleName();
    @Override
    public void onReceive(Context ctx, Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if(extras!=null){
                String status = extras.getString("status");
                if(status.equals("progress"))
                	WidgetListActivity.onProgress(1);
            }
        }
        catch (Exception e){
            Log.v(TAG, "PZPEventReceiver - onReceive exception "+e.getMessage());
        }
    }
}


