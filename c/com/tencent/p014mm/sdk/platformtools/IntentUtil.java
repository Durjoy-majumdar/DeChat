package com.tencent.p014mm.sdk.platformtools;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.sdk.platformtools.IntentUtil */
public class IntentUtil {
    private static final String TAG = "MicroMsg.IntentUtil";

    public static boolean checkIntentSafe(Intent intent) {
        if (intent != null) {
            try {
                intent.hasExtra(String.format("%s_wx", new Object[]{Long.valueOf(System.currentTimeMillis())}));
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
                return false;
            }
        }
        return true;
    }

    public static boolean getBoolean(Bundle bundle, String str, boolean z) {
        if (bundle == null) {
            return z;
        }
        try {
            return bundle.getBoolean(str, z);
        } catch (Exception e) {
            Log.m105921e(TAG, "getBooleanExtra exception:%s", e.getMessage());
            return z;
        }
    }

    public static boolean getBooleanExtra(Intent intent, String str, boolean z) {
        if (intent == null) {
            return z;
        }
        try {
            return intent.getBooleanExtra(str, z);
        } catch (Exception e) {
            Log.m105921e(TAG, "getBooleanExtra exception:%s", e.getMessage());
            return z;
        }
    }

    public static byte[] getByteArray(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getByteArray(str);
        } catch (Exception e) {
            Log.m105921e(TAG, "getByteArrayExtra exception:%s", e.getMessage());
            return null;
        }
    }

    public static byte[] getByteArrayExtra(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getByteArrayExtra(str);
        } catch (Exception e) {
            Log.m105921e(TAG, "getByteArrayExtra exception:%s", e.getMessage());
            return null;
        }
    }

    public static Bundle getExtras(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getExtras();
        } catch (Exception e) {
            Log.m105921e(TAG, "getExtras exception:%s", e.getMessage());
            return null;
        }
    }

    public static int getInt(Bundle bundle, String str, int i) {
        if (bundle == null) {
            return i;
        }
        try {
            return bundle.getInt(str, i);
        } catch (Exception e) {
            Log.m105921e(TAG, "getIntExtra exception:%s", e.getMessage());
            return i;
        }
    }

    public static int getIntExtra(Intent intent, String str, int i) {
        if (intent == null) {
            return i;
        }
        try {
            return intent.getIntExtra(str, i);
        } catch (Exception e) {
            Log.m105921e(TAG, "getIntExtra exception:%s", e.getMessage());
            return i;
        }
    }

    public static long getLong(Bundle bundle, String str, long j) {
        if (bundle == null) {
            return j;
        }
        try {
            return bundle.getLong(str, j);
        } catch (Exception e) {
            Log.m105921e(TAG, "getIntExtra exception:%s", e.getMessage());
            return j;
        }
    }

    public static long getLongExtra(Intent intent, String str, long j) {
        if (intent == null) {
            return j;
        }
        try {
            return intent.getLongExtra(str, j);
        } catch (Exception e) {
            Log.m105921e(TAG, "getIntExtra exception:%s", e.getMessage());
            return j;
        }
    }

    public static Parcelable getParcelableExtra(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getParcelableExtra(str);
        } catch (Exception e) {
            Log.m105921e(TAG, "getParcelableExtra exception:%s", e.getMessage());
            return null;
        }
    }

    public static String getString(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            Log.m105921e(TAG, "getStringExtra exception:%s", e.getMessage());
            return null;
        }
    }

    public static String getStringExtra(Intent intent, String str) {
        if (intent == null) {
            return null;
        }
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            Log.m105921e(TAG, "getStringExtra exception:%s", e.getMessage());
            return null;
        }
    }

    public static void putExtra(Intent intent, String str, boolean z) {
        try {
            intent.putExtra(str, z);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void putExtra(Intent intent, String str, int i) {
        try {
            intent.putExtra(str, i);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }
}
