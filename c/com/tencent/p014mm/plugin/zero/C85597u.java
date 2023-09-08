package com.tencent.p014mm.plugin.zero;

import android.app.Service;
import android.content.Context;
import bp3.C79757o;
import com.tencent.mars.Mars;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.p468mm.AppCallBack;
import com.tencent.mars.sdt.SdtLogic;
import com.tencent.p014mm.app.C80595i;
import com.tencent.p014mm.autogen.events.CoreAccountInitializationNotifiedEvent;
import com.tencent.p014mm.booter.NotifyReceiver;
import com.tencent.p014mm.sdk.platformtools.ApplicationGlobal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86301e;
import ei3.C86522b;
import f40.C75681p0;
import f40.C86709a0;
import f40.C86718e;
import f40.C86723g;
import f40.C86744o;
import g40.C87134f;
import gp3.C87315b;
import h40.C87422a;
import h40.C87424c;
import jc3.C117344c;
import jc3.C33536g;
import jc3.C87946d;
import jc3.C87947e;
import jc3.C87948i;
import k40.C88080e;
import kp3.C88253a;
import lc3.C10485b;
import mp3.C88816a;
import mp3.C88824h;
import mp3.C88825i;
import nr3.C89055a;
import nr3.C89057c;
import nr3.C89061h;
import ob0.C89137b0;
import ob0.b0$$h;
import p206nj.C88957l;
import p261wl.C38166b;
import qh3.C89661b;

@C86522b
/* renamed from: com.tencent.mm.plugin.zero.u */
public class C85597u extends C86301e implements C87948i {

    /* renamed from: i */
    public static final int[] f249510i = {6, 6, 0, 1, 2, 3, 4, 5};

    /* renamed from: d */
    public C44544a f249511d = new C44544a();

    /* renamed from: e */
    public final C80595i f249512e = new C80595i();

    /* renamed from: f */
    public C87946d f249513f;

    /* renamed from: g */
    public final C85600d f249514g = new C85600d();

    /* renamed from: h */
    public final C85601c f249515h = new C85601c();

    /* renamed from: com.tencent.mm.plugin.zero.u$a */
    public class C85598a implements C87134f {
        public C85598a(C85597u uVar) {
        }

        /* renamed from: e */
        public void mo1180e() {
            C87422a.m108608a("onStartupDone", new Object[0]);
        }

        /* renamed from: g */
        public void mo1181g(boolean z) {
            if (z) {
                C75681p0.m90934a(ApplicationGlobal.context(), true);
                C75681p0.m90935b(ApplicationGlobal.context(), true);
            }
            Log.appenderFlush();
        }
    }

    /* renamed from: com.tencent.mm.plugin.zero.u$b */
    public class C85599b implements b0$$h {
        public C85599b() {
        }

        /* renamed from: a */
        public void mo72832a(C89137b0 b0Var, boolean z) {
        }

        /* renamed from: k */
        public void mo72833k(C89137b0 b0Var) {
            C85597u.this.f249512e.mo112309b(ApplicationGlobal.context());
        }
    }

    /* renamed from: com.tencent.mm.plugin.zero.u$d */
    public static final class C85600d extends C89055a<C87947e> implements C87947e {
        /* renamed from: W1 */
        public void mo119070W1(NotifyReceiver.NotifyService notifyService, int i, byte[] bArr, byte[] bArr2, long j) {
            NotifyReceiver.NotifyService notifyService2 = notifyService;
            int i2 = i;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            long j2 = j;
            mo123416n(new u$d$$b(this, notifyService2, i2, bArr3, bArr4, j2));
            C38166b.m41755b(C33536g.class, new u$d$$a(notifyService2, i2, bArr3, bArr4, j2));
        }
    }

    /* renamed from: com.tencent.mm.plugin.zero.u$c */
    public static final class C85601c extends C89055a<C117344c> implements C117344c {

        /* renamed from: com.tencent.mm.plugin.zero.u$c$a */
        public class C85602a implements C89055a.C89056a<C117344c> {

            /* renamed from: a */
            public final /* synthetic */ Service f249517a;

            public C85602a(C85601c cVar, Service service) {
                this.f249517a = service;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C117344c) obj).mo119072i(this.f249517a);
            }
        }

        /* renamed from: com.tencent.mm.plugin.zero.u$c$b */
        public class C85603b implements C89055a.C89056a<C117344c> {

            /* renamed from: a */
            public final /* synthetic */ Service f249518a;

            public C85603b(C85601c cVar, Service service) {
                this.f249518a = service;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C117344c) obj).mo119071b(this.f249518a);
            }
        }

        /* renamed from: b */
        public void mo119071b(Service service) {
            mo123416n(new C85603b(this, service));
        }

        /* renamed from: i */
        public void mo119072i(Service service) {
            mo123416n(new C85602a(this, service));
        }
    }

    public void Mm0(C87946d dVar) {
        this.f249513f = dVar;
    }

    /* renamed from: bM */
    public C87315b mo119064bM(C117344c cVar) {
        return this.f249515h.add(cVar);
    }

    public C87315b ee0(C87947e eVar) {
        Log.m105925i("MicroMsg.FeatureZeroService", "addNotifyReceiverCallback this %s delegate %s ", this, eVar);
        return this.f249514g.add(eVar);
    }

    /* renamed from: fT */
    public C85601c mo119066fT() {
        return this.f249515h;
    }

    public C85600d ja0() {
        return this.f249514g;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        new CoreAccountInitializationNotifiedEvent().publish();
    }

    public void onCreate(Context context) {
        Class<C85597u> cls = C85597u.class;
        try {
            vx0();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FeatureZeroService", e, "what happened?", new Object[0]);
        }
        C87422a.m108608a("configure [%s], setup broken library handler...", this);
        com.tencent.stubs.logger.Log.setLogger(new C85604v(this));
        C88253a.f255069a = new C85605w(this);
        if (MMApplicationContext.isMainProcess()) {
            C87422a.m108608a("configure [%s], for process[%s]...", this, MMApplicationContext.getProcessName());
            C88080e eVar = new C88080e(this.f249511d);
            C86709a0.m107528h();
            C86709a0.m107530l().f251797a.mo122504a(C10485b.class, eVar);
            C87422a.m108608a("configure [%s], make worker core...", this);
            C86709a0 h = C86709a0.m107528h();
            if (!h.f251735l) {
                h.f251727d = new C86744o();
                h.f251728e = new C86718e(C87424c.f253334g);
                h.f251729f = new C86723g(h.f251731h, h.f251732i);
                h.f251730g = new C89661b(MMApplicationContext.getContext());
                h.f251735l = true;
            }
            NotifyReceiver.m98644b();
            C86709a0.m107528h().mo121097c(new C85598a(this));
            C86709a0.m107528h();
            C88825i iVar = new C88825i((C88816a) new C89057c(C86709a0.m107525e().getWorkerHandler()), "WeChat.WORKER");
            C89061h.f256712a = iVar;
            C88824h.m110908b("WeChat.WORKER", iVar);
        }
        if (C79757o.m96896a(MMApplicationContext.getContext()).endsWith(":push")) {
            AppLogic.setCallBack(new AppCallBack(MMApplicationContext.getContext()));
            C88957l.m111079o(Mars.libMarsBase, cls.getClassLoader());
            C88957l.m111079o(Mars.libMarsNetwork, cls.getClassLoader());
            C88957l.m111079o(Mars.libMarsMM, cls.getClassLoader());
            SdtLogic.setHttpNetcheckCGI("/mmnetcheck");
        }
        if (MMApplicationContext.isMainProcess()) {
            C86709a0.m107528h().f251731h.add(new C85599b());
            NotifyReceiver.m98645c();
        }
    }

    /* renamed from: rS */
    public C87946d mo119068rS() {
        return this.f249513f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void vx0() {
        /*
            r15 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.tencent.p014mm.storage.C72994y1.f212832a
            r0.append(r1)
            java.lang.String r1 = "SdcardInfo.cfg"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r2 = r0.getPath()
            r3 = 0
            if (r2 == 0) goto L_0x0038
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r3, r3)
            java.lang.String r4 = r0.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0038
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r2)
            android.net.Uri r0 = r0.build()
        L_0x0038:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r4 = 0
            com.tencent.mm.vfs.f0$h r0 = r2.mo177799l(r0, r4)
            boolean r2 = r0.mo177810a()
            if (r2 != 0) goto L_0x0047
            r0 = 0
            goto L_0x004f
        L_0x0047:
            com.tencent.mm.vfs.FileSystem$c r2 = r0.f348991a
            java.lang.String r0 = r0.f348992b
            boolean r0 = r2.mo119948x(r0)
        L_0x004f:
            java.lang.String r2 = "MicroMsg.FeatureZeroService"
            r5 = 1
            if (r0 != 0) goto L_0x0063
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = a70.C112760b.m154217Y()
            r0[r3] = r1
            java.lang.String r1 = "summermount initSdCardPath sdcard info file not existed use[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            return
        L_0x0063:
            java.lang.String r0 = a70.C112760b.m154217Y()
            com.tencent.mm.storage.u1 r6 = new com.tencent.mm.storage.u1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = com.tencent.p014mm.storage.C72994y1.f212832a
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r6.<init>(r1)
            java.lang.String r1 = ""
            java.lang.Object r1 = r6.mo119661b(r5, r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r8 = 2
            java.lang.Object r7 = r6.mo119661b(r8, r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r9 = android.os.Build.VERSION.SDK_INT
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r10 == 0) goto L_0x00a9
            r6.mo119664f(r5, r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r6.mo119664f(r8, r10)
            r10 = r0
            r11 = 0
            goto L_0x00ab
        L_0x00a9:
            r10 = r1
            r11 = 1
        L_0x00ab:
            r12 = 5
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r3] = r1
            r12[r5] = r10
            r12[r8] = r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r13 = 3
            r12[r13] = r1
            r1 = 4
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            r12[r1] = r14
            java.lang.String r1 = "initSdCardPath cfgSdcardRoot[%s], initSdcardRoot[%s], primarySD[%s], ver[%d], sdk[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r12)
            a70.C112760b.m154238j0(r10, r3)
            if (r7 == r9) goto L_0x0175
            boolean r1 = p206nj.C88955f.m111058b()
            if (r1 != 0) goto L_0x0175
            java.lang.String r1 = p206nj.C88956h.m111062c()
            java.lang.String r7 = "mounted"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x015a
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r7 = r1.getPath()
            if (r7 == 0) goto L_0x0102
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r3, r3)
            java.lang.String r11 = r1.getPath()
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0102
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r7)
            android.net.Uri r1 = r1.build()
        L_0x0102:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r7.mo177799l(r1, r4)
            boolean r4 = r1.mo177810a()
            if (r4 != 0) goto L_0x0110
        L_0x010e:
            r1 = 0
            goto L_0x0132
        L_0x0110:
            com.tencent.mm.vfs.FileSystem$c r4 = r1.f348991a
            int r7 = r4.mo119936f()
            r7 = r7 & r5
            if (r7 != 0) goto L_0x011a
            goto L_0x010e
        L_0x011a:
            java.lang.String r7 = r1.f348992b
            java.lang.String r7 = r4.mo119947w(r7, r5)
            if (r7 == 0) goto L_0x012c
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r1 = r1.canWrite()
            goto L_0x0132
        L_0x012c:
            java.lang.String r1 = r1.f348992b
            boolean r1 = r4.mo119948x(r1)
        L_0x0132:
            if (r1 == 0) goto L_0x015a
            r6.mo119664f(r5, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r6.mo119664f(r8, r1)
            a70.C112760b.m154238j0(r0, r3)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r4 = a70.C112760b.m154230f0()
            r1[r3] = r4
            boolean r4 = p206nj.C88955f.m111058b()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1[r5] = r4
            java.lang.String r4 = "summermount initSdCardPath ver change and old not avail reset SDCARD_ROOT[%s][%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            goto L_0x0176
        L_0x015a:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r4 = a70.C112760b.m154230f0()
            r1[r3] = r4
            boolean r4 = p206nj.C88955f.m111058b()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r1[r5] = r4
            r1[r8] = r0
            java.lang.String r4 = "summermount initSdCardPath ver change but neither primarySD nor old avail keep do nothing[%s][%b][%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            goto L_0x0176
        L_0x0175:
            r3 = r11
        L_0x0176:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.isMainProcess()
            if (r1 == 0) goto L_0x0196
            if (r3 == 0) goto L_0x0196
            r4 = 1315(0x523, double:6.497E-321)
            r6 = 140(0x8c, double:6.9E-322)
            r8 = 1
            com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.m105904c(r4, r6, r8)
            boolean r0 = r0.equals(r10)
            if (r0 != 0) goto L_0x0196
            r1 = 1315(0x523, double:6.497E-321)
            r3 = 141(0x8d, double:6.97E-322)
            r5 = 1
            com.tencent.p014mm.sdcard_migrate.ExtStorageMigrateMonitor.m105904c(r1, r3, r5)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.zero.C85597u.vx0():void");
    }
}
