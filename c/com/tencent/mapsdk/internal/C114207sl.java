package com.tencent.mapsdk.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.sl */
public final class C114207sl {

    /* renamed from: a */
    public static final String f341929a = "txmapengine";

    /* renamed from: b */
    public static String f341930b = "release";

    /* renamed from: c */
    public static String f341931c = "undefined";

    /* renamed from: d */
    public static boolean f341932d = false;

    /* renamed from: e */
    public static boolean f341933e = false;

    /* renamed from: f */
    public static boolean f341934f = false;

    /* renamed from: g */
    public static boolean f341935g = false;

    /* renamed from: h */
    public static boolean f341936h = false;

    /* renamed from: i */
    public static int f341937i = 0;

    /* renamed from: j */
    public static String f341938j = "";

    /* renamed from: k */
    public static String f341939k = "";

    /* renamed from: l */
    public static String f341940l = "";

    /* renamed from: m */
    public static String f341941m = "";

    /* renamed from: n */
    public static String f341942n = "tms";

    /* renamed from: o */
    public static String f341943o = "undefined";

    /* renamed from: p */
    public static List<C114209b> f341944p = new ArrayList(10);

    /* renamed from: com.tencent.mapsdk.internal.sl$c */
    public interface C104572c {
        /* renamed from: a */
        byte[] mo147913a();
    }

    /* renamed from: com.tencent.mapsdk.internal.sl$a */
    public interface C114208a {
        /* renamed from: a */
        void mo172880a(Context context, String str);

        /* renamed from: i */
        void mo172881i();
    }

    /* renamed from: com.tencent.mapsdk.internal.sl$b */
    public enum C114209b {
        PLUGIN("shell.adapter.LocPluginModular"),
        BUGLY("bugly.TMSBugly"),
        BEACON("beacon.TMSBeaconReport");
        

        /* renamed from: d */
        public String f341949d;

        private C114209b(String str) {
            this.f341949d = str;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m159649a(android.content.Context r9) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r1 = r9.getPackageName()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r0.append(r1)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r1 = "_ShellConfig"
            r0.append(r1)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r0 = com.tencent.mapsdk.internal.C113801hf.m157138a(r9, r0)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = "TMS_ShellConfig"
            java.lang.String r0 = com.tencent.mapsdk.internal.C113801hf.m157138a(r9, r0)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r1 == 0) goto L_0x0046
            java.util.Properties r0 = new java.util.Properties     // Catch:{ IOException -> 0x0044 }
            r0.<init>()     // Catch:{ IOException -> 0x0044 }
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch:{ IOException -> 0x0044 }
            java.lang.String r1 = "tencentmap/mapsdk_vector/sdkconfig.dat"
            java.io.InputStream r9 = r9.open(r1)     // Catch:{ IOException -> 0x0044 }
            r0.load(r9)     // Catch:{ IOException -> 0x0044 }
            java.lang.String r9 = "classname"
            java.lang.String r0 = r0.getProperty(r9)     // Catch:{ IOException -> 0x0044 }
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "com.tencent.mapsdk.BuildConfig"
        L_0x0046:
            java.lang.Class r9 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.reflect.Field[] r0 = r9.getDeclaredFields()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            int r1 = r0.length     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r2 = 0
            r3 = 0
        L_0x0051:
            if (r3 >= r1) goto L_0x0280
            r4 = r0[r3]     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r5 = 1
            r4.setAccessible(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r6 = r4.getName()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r7 = -1
            int r8 = r6.hashCode()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            switch(r8) {
                case -2051118828: goto L_0x00f1;
                case -2050804302: goto L_0x00e7;
                case -1781919750: goto L_0x00dd;
                case -1256894524: goto L_0x00d2;
                case -783990306: goto L_0x00c7;
                case -758346991: goto L_0x00bd;
                case -368721951: goto L_0x00b2;
                case 44249739: goto L_0x00a7;
                case 64921139: goto L_0x009d;
                case 196363279: goto L_0x0093;
                case 1766588577: goto L_0x0089;
                case 2076249758: goto L_0x007e;
                case 2095911147: goto L_0x0073;
                case 2107919841: goto L_0x0067;
                default: goto L_0x0065;
            }     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
        L_0x0065:
            goto L_0x00fc
        L_0x0067:
            java.lang.String r5 = "BUGLY_KEY_SHARE"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 11
            goto L_0x00fd
        L_0x0073:
            java.lang.String r5 = "REPO_VERSION"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 6
            goto L_0x00fd
        L_0x007e:
            java.lang.String r5 = "FLAVOR"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 2
            goto L_0x00fd
        L_0x0089:
            java.lang.String r8 = "BUGLY_ENABLE"
            boolean r6 = r6.equals(r8)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r6 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x0093:
            java.lang.String r5 = "PLUGIN_ENABLE"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 4
            goto L_0x00fd
        L_0x009d:
            java.lang.String r5 = "DEBUG"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 0
            goto L_0x00fd
        L_0x00a7:
            java.lang.String r5 = "BUILD_TYPE"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 13
            goto L_0x00fd
        L_0x00b2:
            java.lang.String r5 = "BUGLY_KEY"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 10
            goto L_0x00fd
        L_0x00bd:
            java.lang.String r5 = "SHEET_PROJECT_NAME"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 5
            goto L_0x00fd
        L_0x00c7:
            java.lang.String r5 = "BEACON_ENABLE"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 8
            goto L_0x00fd
        L_0x00d2:
            java.lang.String r5 = "BEACON_KEY"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 9
            goto L_0x00fd
        L_0x00dd:
            java.lang.String r5 = "SEARCH_ENABLE"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 3
            goto L_0x00fd
        L_0x00e7:
            java.lang.String r5 = "VERSION_NAME"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 7
            goto L_0x00fd
        L_0x00f1:
            java.lang.String r5 = "VERSION_CODE"
            boolean r5 = r6.equals(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r5 == 0) goto L_0x00fc
            r5 = 12
            goto L_0x00fd
        L_0x00fc:
            r5 = -1
        L_0x00fd:
            java.lang.String r6 = "TSL"
            switch(r5) {
                case 0: goto L_0x025d;
                case 1: goto L_0x0234;
                case 2: goto L_0x0218;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01ce;
                case 5: goto L_0x01c4;
                case 6: goto L_0x01a7;
                case 7: goto L_0x018a;
                case 8: goto L_0x0160;
                case 9: goto L_0x0156;
                case 10: goto L_0x014c;
                case 11: goto L_0x0142;
                case 12: goto L_0x0121;
                case 13: goto L_0x0104;
                default: goto L_0x0102;
            }
        L_0x0102:
            goto L_0x027c
        L_0x0104:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341930b = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[BUILD_TYPE]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = f341930b     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x0121:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            int r4 = r4.intValue()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341937i = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[VER_CODE]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            int r5 = f341937i     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x0142:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341941m = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x014c:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341940l = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x0156:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341939k = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x0160:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r4 = r4.booleanValue()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341936h = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r4 == 0) goto L_0x0175
            java.util.List<com.tencent.mapsdk.internal.sl$b> r4 = f341944p     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.sl$b r5 = com.tencent.mapsdk.internal.C114207sl.C114209b.BEACON     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.add(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
        L_0x0175:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[BEACON]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r5 = f341936h     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x018a:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341938j = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[VER]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = f341938j     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x01a7:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341943o = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[REPO]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = f341943o     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x01c4:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341942n = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x01ce:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r4 = r4.booleanValue()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341935g = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r4 == 0) goto L_0x01e3
            java.util.List<com.tencent.mapsdk.internal.sl$b> r4 = f341944p     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.sl$b r5 = com.tencent.mapsdk.internal.C114207sl.C114209b.PLUGIN     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.add(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
        L_0x01e3:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[PLUGIN]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r5 = f341935g     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x01f8:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r4 = r4.booleanValue()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341934f = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[SEARCH]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r5 = f341934f     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x0218:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341931c = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[FLAVOR]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = f341931c     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x0234:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r4 = r4.booleanValue()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341933e = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            if (r4 == 0) goto L_0x0249
            java.util.List<com.tencent.mapsdk.internal.sl$b> r4 = f341944p     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.sl$b r5 = com.tencent.mapsdk.internal.C114207sl.C114209b.BUGLY     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.add(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
        L_0x0249:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[BUGLY]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r5 = f341933e     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            goto L_0x027c
        L_0x025d:
            java.lang.Object r4 = r4.get(r9)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r4 = r4.booleanValue()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            f341932d = r4     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r5 = "[DEBUG]:"
            r4.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            boolean r5 = f341932d     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            r4.append(r5)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            java.lang.String r4 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
            com.tencent.mapsdk.internal.C113889km.m157545b((java.lang.String) r6, (java.lang.String) r4)     // Catch:{ ClassNotFoundException -> 0x028a, IllegalAccessException -> 0x0281 }
        L_0x027c:
            int r3 = r3 + 1
            goto L_0x0051
        L_0x0280:
            return
        L_0x0281:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            com.tencent.mapsdk.internal.C113889km.m157540a((java.lang.String) r0, (java.lang.Throwable) r9)
            return
        L_0x028a:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            com.tencent.mapsdk.internal.C113889km.m157540a((java.lang.String) r0, (java.lang.Throwable) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114207sl.m159649a(android.content.Context):void");
    }

    /* renamed from: b */
    private static String m159650b() {
        return f341931c + "-" + f341930b;
    }

    /* renamed from: a */
    private static String m159647a() {
        return f341938j + "-" + f341943o;
    }

    /* renamed from: a */
    private static String m159648a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f341931c + "-" + f341930b);
        sb.append("!");
        sb.append(str);
        return sb.toString();
    }
}
