package com.tencent.p014mm.pluginsdk.model.app;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ld2.C46848g;
import p763ym.C53539k;

/* renamed from: com.tencent.mm.pluginsdk.model.app.i */
public class C44557i implements C53539k {

    /* renamed from: a */
    public MMHandler f120833a;

    /* renamed from: b */
    public List<C44581s0> f120834b;

    /* renamed from: c */
    public List<C44581s0> f120835c;

    /* renamed from: d */
    public ConcurrentHashMap<String, Integer> f120836d;

    /* renamed from: e */
    public MTimerHandler f120837e;

    /* renamed from: com.tencent.mm.pluginsdk.model.app.i$a */
    public class C44558a implements MTimerHandler.CallBack {
        public C44558a() {
        }

        public boolean onTimerExpired() {
            C44557i.this.f120836d.clear();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.i$b */
    public class C44559b extends MMHandler {
        public C44559b(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r7) {
            /*
                r6 = this;
                java.lang.Object r7 = r7.obj
                com.tencent.mm.pluginsdk.model.app.z0 r7 = (com.tencent.p014mm.pluginsdk.model.app.C44588z0) r7
                com.tencent.mm.pluginsdk.model.app.s0 r0 = new com.tencent.mm.pluginsdk.model.app.s0
                java.lang.String r1 = r7.f120891a
                int r2 = r7.f120892b
                r0.<init>(r1, r2)
                com.tencent.mm.pluginsdk.model.app.i r1 = com.tencent.p014mm.pluginsdk.model.app.C44557i.this
                java.util.List<com.tencent.mm.pluginsdk.model.app.s0> r1 = r1.f120834b
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                boolean r1 = r1.contains(r0)
                r2 = 0
                if (r1 == 0) goto L_0x00a2
                com.tencent.mm.pluginsdk.model.app.i r1 = com.tencent.p014mm.pluginsdk.model.app.C44557i.this
                java.util.List<com.tencent.mm.pluginsdk.model.app.s0> r1 = r1.f120834b
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                r1.remove(r0)
                com.tencent.mm.pluginsdk.model.app.p r0 = ld2.C46848g.Bx0()
                java.lang.String r1 = r7.f120891a
                byte[] r3 = r7.f120893c
                int r7 = r7.f120892b
                r0.getClass()
                java.lang.String r4 = "MicroMsg.AppInfoStorage"
                if (r1 == 0) goto L_0x0092
                int r5 = r1.length()
                if (r5 == 0) goto L_0x0092
                if (r3 == 0) goto L_0x0092
                int r5 = r3.length
                if (r5 != 0) goto L_0x0040
                goto L_0x0092
            L_0x0040:
                java.lang.String r7 = r0.mo69377t2(r1, r7)
                if (r7 != 0) goto L_0x004d
                java.lang.String r7 = "saveIcon fail, iconPath is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r7)
                goto L_0x0098
            L_0x004d:
                com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
                r5.<init>((java.lang.String) r7)
                boolean r7 = r5.mo119967g()
                if (r7 == 0) goto L_0x005b
                r5.mo119966f()
            L_0x005b:
                r7 = 0
                java.io.OutputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106426H(r5)     // Catch:{ Exception -> 0x006b }
                r7.write(r3)     // Catch:{ Exception -> 0x006b }
                r7.close()     // Catch:{ Exception -> 0x006b }
                r0.doNotify(r1)     // Catch:{ Exception -> 0x006b }
                r7 = 1
                goto L_0x0099
            L_0x006b:
                r0 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r2]
                java.lang.String r3 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r3, r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "saveIcon, exception, e = "
                r1.append(r3)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
                if (r7 == 0) goto L_0x0098
                r7.close()     // Catch:{ IOException -> 0x0098 }
                goto L_0x0098
            L_0x0092:
                java.lang.String r7 = "saveIcon, invalid argument"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r7)
            L_0x0098:
                r7 = 0
            L_0x0099:
                if (r7 != 0) goto L_0x00a2
                java.lang.String r7 = "MicroMsg.AppIconService"
                java.lang.String r0 = "handleMessage, saveIcon fail"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            L_0x00a2:
                com.tencent.mm.pluginsdk.model.app.i r7 = com.tencent.p014mm.pluginsdk.model.app.C44557i.this
                java.util.List<com.tencent.mm.pluginsdk.model.app.s0> r7 = r7.f120835c
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                int r7 = r7.size()
                if (r7 <= 0) goto L_0x00cb
                com.tencent.mm.pluginsdk.model.app.i r7 = com.tencent.p014mm.pluginsdk.model.app.C44557i.this
                java.util.List<com.tencent.mm.pluginsdk.model.app.s0> r7 = r7.f120835c
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                java.lang.Object r7 = r7.remove(r2)
                com.tencent.mm.pluginsdk.model.app.s0 r7 = (com.tencent.p014mm.pluginsdk.model.app.C44581s0) r7
                com.tencent.mm.pluginsdk.model.app.i r0 = com.tencent.p014mm.pluginsdk.model.app.C44557i.this
                boolean r0 = r0.mo69353b(r7)
                if (r0 == 0) goto L_0x00a2
                com.tencent.mm.pluginsdk.model.app.i r0 = com.tencent.p014mm.pluginsdk.model.app.C44557i.this
                java.util.List<com.tencent.mm.pluginsdk.model.app.s0> r0 = r0.f120834b
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r7)
            L_0x00cb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C44557i.C44559b.handleMessage(android.os.Message):void");
        }
    }

    public C44557i() {
        this.f120834b = null;
        this.f120835c = null;
        this.f120836d = null;
        this.f120837e = new MTimerHandler("AppIconServiceTimer", (MTimerHandler.CallBack) new C44558a(), false);
        this.f120833a = new C44559b(C86709a0.m107525e().getLooper());
        this.f120834b = new ArrayList();
        this.f120835c = new ArrayList();
        this.f120836d = new ConcurrentHashMap<>();
        this.f120837e.startTimer(600000);
    }

    /* renamed from: a */
    public void mo69352a(String str, int i) {
        if (str == null || str.length() == 0) {
            Log.m105920e("MicroMsg.AppIconService", "push fail, appId is null");
            return;
        }
        C44581s0 s0Var = new C44581s0(str, i);
        if (((ArrayList) this.f120834b).contains(s0Var)) {
            Log.m105924i("MicroMsg.AppIconService", "push, appId = " + str + ", iconType = " + i + " already in running list");
        } else if (((ArrayList) this.f120834b).size() >= 5) {
            Log.m105924i("MicroMsg.AppIconService", "running list has reached the max count");
            if (!((ArrayList) this.f120835c).contains(s0Var)) {
                ((ArrayList) this.f120835c).add(s0Var);
            }
        } else if (mo69353b(s0Var)) {
            ((ArrayList) this.f120834b).add(s0Var);
        }
    }

    /* renamed from: b */
    public final boolean mo69353b(C44581s0 s0Var) {
        boolean z;
        String str;
        if (s0Var == null) {
            Log.m105920e("MicroMsg.AppIconService", "startDownload fail, geticoninfo is null");
            return false;
        }
        Integer valueOf = Integer.valueOf(Util.nullAs(this.f120836d.get(s0Var.toString()), 0));
        if (valueOf.intValue() >= 5) {
            Log.m105920e("MicroMsg.AppIconService", "increaseCounter fail, has reached the max try count");
            z = false;
        } else {
            this.f120836d.put(s0Var.toString(), Integer.valueOf(valueOf.intValue() + 1));
            z = true;
        }
        if (!z) {
            Log.m105920e("MicroMsg.AppIconService", "increaseCounter fail");
            return false;
        }
        C44561j Lo = C46848g.Bx0().mo69371Lo(s0Var.f120883a);
        if (Lo == null) {
            Log.m105920e("MicroMsg.AppIconService", "push, appinfo does not exist, appId = " + s0Var.f120883a);
            return false;
        }
        int i = s0Var.f120884b;
        if (i == 1) {
            String str2 = Lo.field_appIconUrl;
            if (str2 == null || str2.length() == 0) {
                Log.m105920e("MicroMsg.AppIconService", "push, appIconUrl is null, appId = " + s0Var.f120883a);
                return false;
            }
            str = Lo.field_appIconUrl;
        } else if (i == 2) {
            String str3 = Lo.field_appWatermarkUrl;
            if (str3 == null || str3.length() == 0) {
                Log.m105920e("MicroMsg.AppIconService", "push, appWatermarkUrl is null, appId = " + s0Var.f120883a);
                return false;
            }
            str = Lo.field_appWatermarkUrl;
        } else if (i == 3) {
            String str4 = Lo.f149248Q;
            if (str4 == null || str4.length() == 0) {
                Log.m105920e("MicroMsg.AppIconService", "push, appSuggestionIconUrl is null, appId = " + s0Var.f120883a);
                return false;
            }
            str = Lo.f149248Q;
        } else if (i == 4) {
            String str5 = Lo.f149279x0;
            if (str5 == null || str5.length() == 0) {
                Log.m105920e("MicroMsg.AppIconService", "push, servicePanelIconUrl is null, appId = " + s0Var.f120883a);
                return false;
            }
            str = Lo.f149279x0;
        } else if (i != 5) {
            Log.m105920e("MicroMsg.AppIconService", "push, unknown iconType = " + s0Var.f120884b);
            return false;
        } else {
            String str6 = Lo.f149281y0;
            if (str6 == null || str6.length() == 0) {
                Log.m105920e("MicroMsg.AppIconService", "push, serviceListIconUrl is null, appId = " + s0Var.f120883a);
                return false;
            }
            str = Lo.f149281y0;
        }
        Log.m105924i("MicroMsg.AppIconService", "appIconUrl = " + str);
        ThreadPool.post(new C44582t0(this.f120833a, s0Var.f120883a, s0Var.f120884b, str), "AppIconService_getIcon");
        return true;
    }
}
