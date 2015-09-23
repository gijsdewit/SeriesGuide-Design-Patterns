/*
 * Copyright 2015 Uwe Trottmann
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

package com.battlelancer.seriesguide.settings;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Settings related to the Now tab.
 */
public class NowSettings {

    public static final String KEY_DISPLAY_RELEASED_TODAY
            = "com.battlelancer.seriesguide.now.releasedtoday";

    /**
     * Whether the Now tab should display episodes released today.
     */
    public static boolean isDisplayingReleasedToday(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getBoolean(KEY_DISPLAY_RELEASED_TODAY, true);
    }
}
