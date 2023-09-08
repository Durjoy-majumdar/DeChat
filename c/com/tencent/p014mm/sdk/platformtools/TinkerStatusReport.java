package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.app.C80611s0;
import com.tencent.xweb.file.XVFSFile;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.platformtools.TinkerStatusReport */
public final class TinkerStatusReport {
    private static final int KVSTAT_ID = 19725;
    public static final int KVSTAT_TYPE_ID_FIX_OTA_ODEX_DIR_STATUS = 257;
    public static final int KVSTAT_TYPE_ID_PATCH_STATUS = 258;
    public static final int KVSTAT_TYPE_ID_TINKER_EXCEPTION = 259;
    private static final String TAG = "MicroMsg.TinkerStatusReport";

    /* renamed from: com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs */
    public static final class Pairs implements Iterable<Map.Entry<String, Object>> {
        private final List<Map.Entry<String, Object>> mPairs;

        /* renamed from: com.tencent.mm.sdk.platformtools.TinkerStatusReport$Pairs$Builder */
        public static final class Builder {
            private final List<Map.Entry<String, Object>> mPairs = new ArrayList();

            public Builder add(String str, Object obj) {
                this.mPairs.add(new AbstractMap.SimpleImmutableEntry(str, obj));
                return this;
            }

            public Pairs build() {
                return new Pairs(this.mPairs);
            }
        }

        public boolean isEmpty() {
            return this.mPairs.isEmpty();
        }

        public Iterator<Map.Entry<String, Object>> iterator() {
            return this.mPairs.iterator();
        }

        private Pairs(List<Map.Entry<String, Object>> list) {
            this.mPairs = Collections.unmodifiableList(new ArrayList(list));
        }
    }

    private TinkerStatusReport() {
        throw new UnsupportedOperationException();
    }

    public static void reportKVPairValues(String str, int i, Pairs pairs) {
        StringBuilder sb = new StringBuilder(64);
        sb.append('{');
        if (!pairs.isEmpty()) {
            boolean z = true;
            Iterator<Map.Entry<String, Object>> it = pairs.iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!z) {
                    sb.append(',');
                } else {
                    z = false;
                }
                sb.append('\"');
                sb.append((String) next.getKey());
                sb.append('\"');
                sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
                Object value = next.getValue();
                if (shouldBeQuotedInJson(value)) {
                    sb.append('\"');
                    sb.append(value);
                    sb.append('\"');
                } else {
                    sb.append(value);
                }
            }
        }
        sb.append('}');
        reportKVStringValue(str, i, sb.toString());
    }

    public static void reportKVStringValue(String str, int i, String str2) {
        C80611s0.m98244b(KVSTAT_ID, Integer.valueOf(i), str, str2.replace(',', ';'));
    }

    private static boolean shouldBeQuotedInJson(Object obj) {
        return obj != null && !(obj instanceof Boolean) && !(obj instanceof Number);
    }
}
