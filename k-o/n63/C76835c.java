package n63;

/* renamed from: n63.c */
public class C76835c {

    /* renamed from: a */
    public int f224657a;

    /* renamed from: b */
    public String f224658b;

    public C76835c(int i, String str) {
        this.f224657a = i;
        this.f224658b = str;
    }

    /* renamed from: a */
    public static C76835c m92624a(int i) {
        return m92625b(i, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r0 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r0 = 100000002;
        r2 = com.tencent.p014mm.C0966R.string.lon;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static n63.C76835c m92625b(int r4, java.lang.String r5) {
        /*
            r0 = 3
            r1 = 6
            r2 = 2131840338(0x7f114d52, float:1.9313953E38)
            r3 = -15001(0xffffffffffffc567, float:NaN)
            if (r4 > r3) goto L_0x000b
        L_0x0009:
            r0 = r4
            goto L_0x0053
        L_0x000b:
            if (r4 == 0) goto L_0x004f
            r3 = 1
            if (r4 == r3) goto L_0x004b
            if (r4 == r0) goto L_0x0048
            if (r4 == r1) goto L_0x0042
            r3 = 7
            if (r4 == r3) goto L_0x004b
            r3 = 8
            if (r4 == r3) goto L_0x003e
            switch(r4) {
                case 103: goto L_0x0037;
                case 104: goto L_0x0037;
                case 105: goto L_0x0048;
                case 106: goto L_0x0035;
                default: goto L_0x001e;
            }
        L_0x001e:
            switch(r4) {
                case 109: goto L_0x0031;
                case 110: goto L_0x002d;
                case 111: goto L_0x0029;
                case 112: goto L_0x0025;
                case 113: goto L_0x0009;
                default: goto L_0x0021;
            }
        L_0x0021:
            switch(r4) {
                case 100000001: goto L_0x0035;
                case 100000002: goto L_0x0037;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0035
        L_0x0025:
            r2 = 2131840341(0x7f114d55, float:1.931396E38)
            goto L_0x0009
        L_0x0029:
            r2 = 2131840343(0x7f114d57, float:1.9313963E38)
            goto L_0x0009
        L_0x002d:
            r2 = 2131840342(0x7f114d56, float:1.9313961E38)
            goto L_0x0009
        L_0x0031:
            r2 = 2131840340(0x7f114d54, float:1.9313957E38)
            goto L_0x0009
        L_0x0035:
            r0 = 6
            goto L_0x0053
        L_0x0037:
            r0 = 100000002(0x5f5e102, float:2.3122344E-35)
            r2 = 2131840335(0x7f114d4f, float:1.9313947E38)
            goto L_0x0053
        L_0x003e:
            r2 = 2131840336(0x7f114d50, float:1.9313949E38)
            goto L_0x0009
        L_0x0042:
            n63.c r4 = new n63.c
            r4.<init>(r1, r5)
            return r4
        L_0x0048:
            java.lang.String r5 = "Google Play not install"
            goto L_0x0053
        L_0x004b:
            r2 = 2131840339(0x7f114d53, float:1.9313955E38)
            goto L_0x0009
        L_0x004f:
            r2 = 2131840337(0x7f114d51, float:1.931395E38)
            goto L_0x0009
        L_0x0053:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "code : "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r4 = ", errMsg : "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = ", convert to errCode : "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "MicroMsg.IapResult"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r4 == 0) goto L_0x008d
            n63.c r4 = new n63.c
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = r5.getString(r2)
            r4.<init>(r0, r5)
            return r4
        L_0x008d:
            n63.c r4 = new n63.c
            r4.<init>(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n63.C76835c.m92625b(int, java.lang.String):n63.c");
    }

    /* renamed from: c */
    public boolean mo107104c() {
        int i = this.f224657a;
        if (i == 0) {
            return false;
        }
        return !(i == 104 || i == 100000002);
    }

    public String toString() {
        return "IapResult: " + this.f224658b;
    }
}
