package p661qj;

import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import yc3.C38992a;

/* renamed from: qj.h */
public class C89677h implements C38992a {

    /* renamed from: a */
    public static final /* synthetic */ int f257921a = 0;

    static {
        C30650a.m39147b(new C89677h(), "//recovery");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r5.equals("testmmonline") == false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(android.content.Context r5, java.lang.String[] r6, java.lang.String r7) {
        /*
            r4 = this;
            int r5 = com.tencent.p014mm.sdk.platformtools.Log.getLogLevel()
            r7 = 0
            r0 = 1
            if (r5 <= r0) goto L_0x0009
            return r7
        L_0x0009:
            int r5 = r6.length
            r1 = 2
            if (r5 >= r1) goto L_0x000e
            return r0
        L_0x000e:
            r5 = r6[r0]
            r5.getClass()
            r6 = -1
            int r2 = r5.hashCode()
            r3 = 3
            switch(r2) {
                case -1421107579: goto L_0x0041;
                case -1145939284: goto L_0x0035;
                case -877169230: goto L_0x0029;
                case 107332: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            r7 = -1
            goto L_0x004b
        L_0x001e:
            java.lang.String r7 = "log"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0027
            goto L_0x001c
        L_0x0027:
            r7 = 3
            goto L_0x004b
        L_0x0029:
            java.lang.String r7 = "testmm"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x0033
            goto L_0x001c
        L_0x0033:
            r7 = 2
            goto L_0x004b
        L_0x0035:
            java.lang.String r7 = "testpush"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L_0x003f
            goto L_0x001c
        L_0x003f:
            r7 = 1
            goto L_0x004b
        L_0x0041:
            java.lang.String r2 = "testmmonline"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x004b
            goto L_0x001c
        L_0x004b:
            switch(r7) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0069;
                case 2: goto L_0x005c;
                case 3: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x00a7
        L_0x004f:
            com.tencent.mm.autogen.events.RecoveryTestEvent r5 = new com.tencent.mm.autogen.events.RecoveryTestEvent
            r5.<init>()
            com.tencent.mm.autogen.events.RecoveryTestEvent$a r6 = r5.f236265d
            r6.f236266a = r1
            r5.publish()
            goto L_0x00a7
        L_0x005c:
            com.tencent.mm.autogen.events.RecoveryTestEvent r5 = new com.tencent.mm.autogen.events.RecoveryTestEvent
            r5.<init>()
            com.tencent.mm.autogen.events.RecoveryTestEvent$a r6 = r5.f236265d
            r6.f236266a = r0
            r5.publish()
            goto L_0x00a7
        L_0x0069:
            java.lang.String r5 = com.tencent.p014mm.modelstat.WatchDogPushReceiver.f237959a
            boolean r5 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            if (r5 != 0) goto L_0x0072
            goto L_0x00a7
        L_0x0072:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "com.tencent.mm.WatchDogPushReceiver"
            r5.setAction(r6)
            android.content.ComponentName r6 = new android.content.ComponentName
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getPackageName()
            java.lang.String r1 = com.tencent.p014mm.modelstat.WatchDogPushReceiver.m98922a()
            r6.<init>(r7, r1)
            r5.setComponent(r6)
            r6 = 7
            java.lang.String r7 = "type"
            r5.putExtra(r7, r6)
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6.sendBroadcast(r5)
            goto L_0x00a7
        L_0x009b:
            com.tencent.mm.autogen.events.RecoveryTestEvent r5 = new com.tencent.mm.autogen.events.RecoveryTestEvent
            r5.<init>()
            com.tencent.mm.autogen.events.RecoveryTestEvent$a r6 = r5.f236265d
            r6.f236266a = r3
            r5.publish()
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p661qj.C89677h.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }
}
