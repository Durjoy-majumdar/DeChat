package p661qj;

import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import yc3.C38992a;

/* renamed from: qj.i */
public class C89678i implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f257922a = 0;

    static {
        C30650a.m39147b(new C89678i(), "//assert", "//netassert", "//jniassert", "//jnipushassert", "//pushassert", "//anrassert");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(android.content.Context r4, java.lang.String[] r5, java.lang.String r6) {
        /*
            r3 = this;
            r4 = 0
            r5 = r5[r4]
            r5.getClass()
            int r6 = r5.hashCode()
            r0 = 2
            r1 = -1
            r2 = 1
            switch(r6) {
                case -2061874877: goto L_0x0049;
                case -1869906331: goto L_0x003e;
                case -1794206389: goto L_0x0033;
                case 918688960: goto L_0x0028;
                case 985580427: goto L_0x001d;
                case 1957466406: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            r5 = -1
            goto L_0x0053
        L_0x0012:
            java.lang.String r6 = "//assert"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x001b
            goto L_0x0010
        L_0x001b:
            r5 = 5
            goto L_0x0053
        L_0x001d:
            java.lang.String r6 = "//anrassert"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0026
            goto L_0x0010
        L_0x0026:
            r5 = 4
            goto L_0x0053
        L_0x0028:
            java.lang.String r6 = "//pushassert"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0031
            goto L_0x0010
        L_0x0031:
            r5 = 3
            goto L_0x0053
        L_0x0033:
            java.lang.String r6 = "//jniassert"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x003c
            goto L_0x0010
        L_0x003c:
            r5 = 2
            goto L_0x0053
        L_0x003e:
            java.lang.String r6 = "//jnipushassert"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0047
            goto L_0x0010
        L_0x0047:
            r5 = 1
            goto L_0x0053
        L_0x0049:
            java.lang.String r6 = "//netassert"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0052
            goto L_0x0010
        L_0x0052:
            r5 = 0
        L_0x0053:
            switch(r5) {
                case 0: goto L_0x0090;
                case 1: goto L_0x008c;
                case 2: goto L_0x0088;
                case 3: goto L_0x0084;
                case 4: goto L_0x007e;
                case 5: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            return r4
        L_0x0057:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "test errlog "
            r5.append(r6)
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            r6.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r6 = r6.format(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            junit.framework.Assert.assertTrue(r5, r4)
            return r2
        L_0x007e:
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Thread.sleep(r4)     // Catch:{ InterruptedException -> 0x0083 }
        L_0x0083:
            return r2
        L_0x0084:
            com.tencent.p014mm.modelstat.WatchDogPushReceiver.m98924c(r2)
            return r2
        L_0x0088:
            com.tencent.p014mm.protocal.MMProtocalJni.setClientPackVersion(r1)
            return r2
        L_0x008c:
            com.tencent.p014mm.modelstat.WatchDogPushReceiver.m98924c(r0)
            return r2
        L_0x0090:
            java.lang.String r5 = "NetsceneQueue forbid in "
            junit.framework.Assert.assertTrue(r5, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p661qj.C89678i.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }
}
