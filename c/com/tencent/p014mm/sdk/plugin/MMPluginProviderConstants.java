package com.tencent.p014mm.sdk.plugin;

import android.content.ContentValues;
import android.net.Uri;
import android.provider.BaseColumns;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.sdk.plugin.MMPluginProviderConstants */
public class MMPluginProviderConstants {
    public static final String AUTHORITY = "com.tencent.mm.sdk.plugin.provider";
    public static final String PLUGIN_PACKAGE_PATTERN = "com.tencent.mm.plugin";
    public static final int TYPE_BOOLEAN = 4;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_INT = 1;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_UNKNOWN = 0;

    /* renamed from: com.tencent.mm.sdk.plugin.MMPluginProviderConstants$PluginIntent */
    public static class PluginIntent {
        public static final String ACCESS_TOKEN = "com.tencent.mm.sdk.plugin.Intent.ACCESS_TOKEN";
        public static final String ACTION_QRCODE_SCANNED = "com.tencent.mm.sdk.plugin.Intent.ACTION_QRCODE_SCANNED";
        public static final String ACTION_REQUEST_TOKEN = "com.tencent.mm.sdk.plugin.Intent.ACTION_REQUEST_TOKEN";
        public static final String ACTION_RESPONSE = "com.tencent.mm.sdk.plugin.Intent.ACTION_RESPONSE";
        public static final String APP_PACKAGE_PATTERN = "com.tencent.mm";
        public static final String AUTH_KEY = "com.tencent.mm.sdk.plugin.Intent.AUTHKEY";
        public static final String NAME = "com.tencent.mm.sdk.plugin.Intent.NAME";
        public static final String PACKAGE = "com.tencent.mm.sdk.plugin.Intent.PACKAGE";
        public static final String PERMISSIONS = "com.tencent.mm.sdk.plugin.Intent.PERMISSIONS";
        public static final String PLUGIN_PACKAGE_PATTERN = "com.tencent.mm.plugin";
        public static final String REQUEST_TOKEN = "com.tencent.mm.sdk.plugin.Intent.REQUEST_TOKEN";
    }

    /* renamed from: com.tencent.mm.sdk.plugin.MMPluginProviderConstants$Resolver */
    public static final class Resolver {
        private static final String TAG = "MicroMsg.SDK.PluginProvider.Resolver";

        private Resolver() {
        }

        public static int getType(Object obj) {
            if (obj == null) {
                Log.m105920e(TAG, "unresolve failed, null value");
                return 0;
            } else if (obj instanceof Integer) {
                return 1;
            } else {
                if (obj instanceof Long) {
                    return 2;
                }
                if (obj instanceof String) {
                    return 3;
                }
                if (obj instanceof Boolean) {
                    return 4;
                }
                if (obj instanceof Float) {
                    return 5;
                }
                if (obj instanceof Double) {
                    return 6;
                }
                Log.m105920e(TAG, "unresolve failed, unknown type=" + obj.getClass().toString());
                return 0;
            }
        }

        public static Object resolveObj(int i, String str) {
            switch (i) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    try {
                        return Double.valueOf(str);
                    } catch (Exception e) {
                        Log.printErrStackTrace(TAG, e, "", new Object[0]);
                        return null;
                    }
                default:
                    Log.m105920e(TAG, "unknown type");
                    return null;
            }
        }

        public static boolean unresolveObj(ContentValues contentValues, Object obj) {
            int type = getType(obj);
            if (type == 0) {
                return false;
            }
            contentValues.put("type", Integer.valueOf(type));
            contentValues.put("value", obj.toString());
            return true;
        }
    }

    /* renamed from: com.tencent.mm.sdk.plugin.MMPluginProviderConstants$SharedPref */
    public static final class SharedPref implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.parse("content://com.tencent.mm.sdk.plugin.provider/sharedpref");
        public static final String KEY = "key";
        public static final String TYPE = "type";
        public static final String VALUE = "value";

        private SharedPref() {
        }
    }
}
