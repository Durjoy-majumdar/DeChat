package com.tencent.p014mm.game.report;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import f40.C86709a0;
import f40.C86718e;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import q20.C89449a;
import u10.C52416b;

/* renamed from: com.tencent.mm.game.report.f */
public class C40311f {

    /* renamed from: a */
    public static LinkedList<C52416b> f108382a = new LinkedList<>();

    /* renamed from: b */
    public static boolean f108383b;

    /* renamed from: c */
    public static String f108384c = "log_id";

    /* renamed from: d */
    public static String f108385d = "log_ext";

    /* renamed from: com.tencent.mm.game.report.f$a */
    public class C40312a implements l0$$e {
        /* renamed from: a */
        public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            Log.m105925i("MicroMsg.ReportService", "tryDoScene, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
            C40311f.f108383b = false;
            C40311f.m43480b();
            return 0;
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.game.report.f$b */
    public static class C40313b implements C80883e<Bundle, Bundle> {
        private C40313b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C40311f.m43479a(new C52416b(bundle.getInt(C40311f.f108384c), bundle.getString(C40311f.f108385d)));
            gVar.mo894a(null);
        }
    }

    /* renamed from: a */
    public static void m43479a(C52416b bVar) {
        if (MMApplicationContext.isMMProcess()) {
            synchronized (C40311f.class) {
                if (!C86709a0.m107523b().mo121114l() || C86718e.m107551r()) {
                    Log.m105928w("MicroMsg.ReportService", "report, account not ready");
                } else if (bVar != null) {
                    f108382a.add(bVar);
                    m43480b();
                }
            }
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt(f108384c, bVar.f146497a);
            bundle.putString(f108385d, bVar.f146498b);
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C40313b.class, (C1256g) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m43480b() {
        /*
            java.lang.Class<com.tencent.mm.game.report.f> r0 = com.tencent.p014mm.game.report.C40311f.class
            monitor-enter(r0)
            boolean r1 = f108383b     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = "MicroMsg.ReportService"
            java.lang.String r2 = "tryDoScene isBusy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x007e }
            monitor-exit(r0)
            return
        L_0x0010:
            java.util.LinkedList<u10.b> r1 = f108382a     // Catch:{ all -> 0x007e }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0021
            java.lang.String r1 = "MicroMsg.ReportService"
            java.lang.String r2 = "waitingList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x007e }
            monitor-exit(r0)
            return
        L_0x0021:
            java.util.LinkedList<u10.b> r1 = f108382a     // Catch:{ all -> 0x007e }
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ all -> 0x007e }
            u10.b r1 = (u10.C52416b) r1     // Catch:{ all -> 0x007e }
            if (r1 == 0) goto L_0x0079
            r3 = 1
            f108383b = r3     // Catch:{ all -> 0x007e }
            ob0.c$b r3 = new ob0.c$b     // Catch:{ all -> 0x007e }
            r3.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "/cgi-bin/micromsg-bin/gamereportkv"
            r3.f127068c = r4     // Catch:{ all -> 0x007e }
            r4 = 427(0x1ab, float:5.98E-43)
            r3.f127069d = r4     // Catch:{ all -> 0x007e }
            r3.f127070e = r2     // Catch:{ all -> 0x007e }
            r3.f127071f = r2     // Catch:{ all -> 0x007e }
            x10.c r4 = new x10.c     // Catch:{ all -> 0x007e }
            r4.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r5 = qe3.C89625d.f257837c     // Catch:{ all -> 0x007e }
            r4.f148861d = r5     // Catch:{ all -> 0x007e }
            java.lang.String r5 = qe3.C89625d.f257836b     // Catch:{ all -> 0x007e }
            r4.f148862e = r5     // Catch:{ all -> 0x007e }
            java.lang.String r5 = qe3.C89625d.f257839e     // Catch:{ all -> 0x007e }
            r4.f148863f = r5     // Catch:{ all -> 0x007e }
            java.lang.String r5 = p156gj.C87200o.f252873f     // Catch:{ all -> 0x007e }
            r4.f148864g = r5     // Catch:{ all -> 0x007e }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()     // Catch:{ all -> 0x007e }
            r4.f148865h = r5     // Catch:{ all -> 0x007e }
            int r5 = r1.f146497a     // Catch:{ all -> 0x007e }
            r4.f148866i = r5     // Catch:{ all -> 0x007e }
            java.lang.String r1 = r1.f146498b     // Catch:{ all -> 0x007e }
            r4.f148867j = r1     // Catch:{ all -> 0x007e }
            r3.f127066a = r4     // Catch:{ all -> 0x007e }
            x10.d r1 = new x10.d     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            r3.f127067b = r1     // Catch:{ all -> 0x007e }
            ob0.c r1 = r3.mo72403a()     // Catch:{ all -> 0x007e }
            com.tencent.mm.game.report.f$a r3 = new com.tencent.mm.game.report.f$a     // Catch:{ all -> 0x007e }
            r3.<init>()     // Catch:{ all -> 0x007e }
            ob0.C89144l0.m111429e(r1, r3, r2)     // Catch:{ all -> 0x007e }
            goto L_0x007c
        L_0x0079:
            m43480b()     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r0)
            return
        L_0x007e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.game.report.C40311f.m43480b():void");
    }
}
