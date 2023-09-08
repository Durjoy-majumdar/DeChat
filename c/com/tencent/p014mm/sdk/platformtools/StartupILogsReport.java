package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.os.Process;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.xweb.file.XVFSFile;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.tencent.mm.sdk.platformtools.StartupILogsReport */
public final class StartupILogsReport {
    private static final int KVSTAT_ID = 21381;
    public static final int MARK_GC_SEMISPACE_TRIM_ENABLED = 1;
    public static final int MARK_GC_SEMISPACE_TRIM_FAILURE = 3;
    public static final int MARK_GC_SEMISPACE_TRIM_SUCCESS = 2;
    public static final int MARK_PATRONS_ENABLED = 1;
    public static final int MARK_PATRONS_FAILURE = 3;
    public static final int MARK_PATRONS_SUCCESS = 2;
    public static final int MARK_RUNTIME_VERIFY_MUTE_ENABLED = 1;
    public static final int MARK_RUNTIME_VERIFY_MUTE_FAILURE = 3;
    public static final int MARK_RUNTIME_VERIFY_MUTE_SUCCESS = 2;
    public static final int MARK_WV_RESERVED_SPACE_SHRINKER_ENABLED = 1;
    public static final int MARK_WV_RESERVED_SPACE_SHRINKER_FAILURE = 3;
    public static final int MARK_WV_RESERVED_SPACE_SHRINKER_SUCCESS = 2;
    private static final String TAG = "MicroMsg.StartupILogsReport";
    public static final int TYPEID_FIRST_UI_SHOWN_COLD = 65541;
    public static final int TYPEID_FIRST_UI_SHOWN_INCLUDE_TINKER_LOAD_MISC_JSON = 131077;
    public static final int TYPEID_FIRST_UI_SHOWN_MISC_JSON = 131073;
    public static final int TYPEID_FIRST_UI_SHOWN_WARM = 65542;
    public static final int TYPEID_GC_SEMISPACE_TRIM_STATUS = -536739836;
    public static final int TYPEID_PATRONS_STATUS = -536739837;
    public static final int TYPEID_RUNTIME_VERIFY_MUTE_STATUS = -536739835;
    public static final int TYPEID_TINKER_LOAD_COST_MISC_JSON = 131076;
    public static final int TYPEID_WV_RESERVED_SPACE_SHRINKER_STATUS = -536739839;

    @SafeVarargs
    public static String buildJson(Map.Entry<String, Object>... entryArr) {
        StringBuilder sb = new StringBuilder(64);
        boolean z = true;
        for (Map.Entry<String, Object> entry : entryArr) {
            if (z) {
                z = false;
            } else {
                sb.append(';');
            }
            sb.append('\"');
            sb.append(entry.getKey());
            sb.append('\"');
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            Object value = entry.getValue();
            if (shouldBeQuotedInJson(value)) {
                sb.append('\"');
                sb.append(value);
                sb.append('\"');
            } else {
                sb.append(value);
            }
        }
        return '{' + sb.toString() + '}';
    }

    private static String getCurrentProcessName(Context context) {
        return Util.nullAsNil(Util.getProcessNameByPid(context, Process.myPid()));
    }

    @SafeVarargs
    public static void reportJsonValue(Context context, int i, Map.Entry<String, Object>... entryArr) {
        Objects.requireNonNull(entryArr, "kvPairs is null.");
        reportStringValue(context, i, buildJson(entryArr));
    }

    public static void reportNumericValue(Context context, int i, Number number) {
        C80611s0.m98247e(TAG, "reportNumericValue: typeId:%s, value:%s", Integer.valueOf(i), number);
        C80611s0.m98244b(KVSTAT_ID, Integer.valueOf(i), getCurrentProcessName(context), number);
    }

    public static void reportStringValue(Context context, int i, String str) {
        String replace = str.replace(',', ';');
        C80611s0.m98247e(TAG, "reportStringValue: typeId:%s, value:%s", Integer.valueOf(i), replace);
        C80611s0.m98244b(KVSTAT_ID, Integer.valueOf(i), getCurrentProcessName(context), 0, replace);
    }

    private static boolean shouldBeQuotedInJson(Object obj) {
        if (obj == null || (obj instanceof Boolean) || (obj instanceof Number)) {
            return false;
        }
        return !(obj instanceof String) || !((String) obj).startsWith("%");
    }
}
