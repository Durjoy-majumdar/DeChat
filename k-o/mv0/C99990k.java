package mv0;

import a70.C112760b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import com.tencent.p014mm.autogen.events.PCManagerBakEvent;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.C92943c;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.C92946d;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.C92947e;
import com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.C92948f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import gv0.C20842c;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import k20.C9556a;
import nv0.C21693a;
import nv0.C47301e;
import ov0.C100546d;
import p156gj.C87203t;
import p196ln.C10579k;
import p196ln.C76706g;
import p206nj.C88955f;
import pe3.C89349b;
import pv0.C100965f0;
import pv0.C100967t;
import pv0.C62560e0;
import pv0.C62568v;
import qe3.C89625d;
import yu0.C102910f;
import zt3.C119157j;

/* renamed from: mv0.k */
public class C99990k implements C20842c.C20846e {

    /* renamed from: d */
    public C99993c f292959d;

    /* renamed from: e */
    public C99991a f292960e;

    /* renamed from: f */
    public C99994d f292961f;

    /* renamed from: g */
    public C99995e f292962g;

    /* renamed from: h */
    public C99984g f292963h = new C99984g();

    /* renamed from: i */
    public C99996l f292964i = new C99996l();

    /* renamed from: j */
    public C47301e f292965j;

    /* renamed from: n */
    public int f292966n = -1;

    /* renamed from: o */
    public String f292967o;

    /* renamed from: p */
    public String f292968p;

    /* renamed from: q */
    public int f292969q = -1;

    /* renamed from: r */
    public int f292970r = 1;

    /* renamed from: s */
    public boolean f292971s = false;

    /* renamed from: mv0.k$a */
    public interface C99991a extends C99992b {
    }

    /* renamed from: mv0.k$b */
    public interface C99992b {
        /* renamed from: d */
        void mo127331d(int i);
    }

    /* renamed from: mv0.k$c */
    public interface C99993c extends C99992b {
    }

    /* renamed from: mv0.k$d */
    public interface C99994d extends C99992b {
        /* renamed from: P */
        void mo127335P();

        /* renamed from: W2 */
        void mo127336W2();

        /* renamed from: a2 */
        void mo127337a2();

        /* renamed from: m4 */
        void mo127338m4(int i);

        /* renamed from: o1 */
        void mo127339o1(int i);
    }

    /* renamed from: mv0.k$e */
    public interface C99995e extends C99992b {
    }

    /* renamed from: c */
    public static String m130656c(int i) {
        switch (i) {
            case -1:
                return "COMMAND_NOT_SUPPORT";
            case 0:
                return "AUTHORIZE";
            case 1:
                return "BACKUP_INFO";
            case 2:
                return "RESTORE_INFO";
            case 3:
                return "BACKUP_START";
            case 4:
                return "BACKUP_CANCEL";
            case 5:
                return "BACKUP_FINISH";
            case 6:
                return "RESTORE_START";
            case 7:
                return "RESTORE_CANCE";
            case 8:
                return "RESTORE_FINISH";
            case 9:
                return "BACKUP_PAUSE";
            case 10:
                return "RESTORE_PAUSE";
            case 11:
                return "BACKUP_RESUME";
            case 12:
                return "RESTORE_RESUME";
            case 13:
                return "MERGE_PROGRESS";
            case 14:
                return "LOGOFF";
            case 15:
                return "EXIT";
            case 16:
                return "SHOW_BACKUP_RESTORE";
            case 17:
                return "COMMAND_WECHAT_LEAVE";
            default:
                return "" + i;
        }
    }

    /* renamed from: f */
    public static void m130657f() {
        new PCManagerBakEvent().publish();
    }

    /* renamed from: a */
    public void mo17669a(boolean z, int i, byte[] bArr, int i2) {
        if (z && bArr != null) {
            mo139330b(i, new String(bArr));
        }
        if (i == 10001 || i == 10002) {
            C99980a.m130643h().mo139321j().f292933b = 1;
            new C21693a(C99980a.m130643h().f303743c, C99980a.m130643h().f303744d, C102910f.f303739h, C99980a.m130643h().f303742b, 0, -1).mo32547o1();
        }
        if (i == 3) {
            this.f292966n = -1;
            C62560e0 e0Var = new C62560e0();
            try {
                e0Var.parseFrom(bArr);
                Log.m105925i("MicroMsg.BakPcProcessMgr", "recv cmd:%d (%s)", Integer.valueOf(e0Var.f177686d), m130656c(e0Var.f177686d));
                int i3 = e0Var.f177686d;
                switch (i3) {
                    case 0:
                        if (!C97625j3.m125811a()) {
                            Log.m105928w("MicroMsg.BakPcProcessMgr", "acc is not ready, not support pcmgr's auth");
                            mo139335i(e0Var.f177686d, 1, (C62568v) null);
                            return;
                        }
                        this.f292966n = e0Var.f177686d;
                        C99991a aVar = this.f292960e;
                        if (aVar != null) {
                            BakToPcUI bakToPcUI = (BakToPcUI) aVar;
                            bakToPcUI.f267683e = 0;
                            bakToPcUI.f267684f.setVisibility(0);
                            bakToPcUI.f267685g.setVisibility(0);
                            new MMHandler(Looper.getMainLooper()).post(new C92947e(bakToPcUI));
                        } else {
                            Log.m105924i("MicroMsg.BakPcProcessMgr", "authCallback is null");
                            mo139338l();
                        }
                        this.f292969q = 0;
                        this.f292970r = 1;
                        return;
                    case 1:
                        C99980a.m130643h().mo139320i().mo123242h();
                        C99980a.m130643h().mo139321j().mo139323a();
                        mo139330b(-1, (String) null);
                        Log.m105920e("MicroMsg.BakPcProcessMgr", "summerback new version not support old pc backup request toast upgrade pc");
                        return;
                    case 3:
                        this.f292970r = 2;
                        this.f292969q = 3;
                        m130657f();
                        mo139334h(e0Var.f177686d);
                        C99984g gVar = this.f292963h;
                        gVar.getClass();
                        ((C119157j) C119157j.f356862d).mo183884o(new C99982e(gVar));
                        return;
                    case 4:
                        this.f292969q = -1;
                        this.f292970r = 1;
                        m130657f();
                        mo139334h(e0Var.f177686d);
                        C47301e eVar = this.f292965j;
                        if (eVar != null) {
                            eVar.cancel();
                            this.f292965j = null;
                        }
                        C99984g gVar2 = this.f292963h;
                        if (gVar2 != null) {
                            gVar2.mo139325a();
                        }
                        C99994d dVar = this.f292961f;
                        if (dVar != null) {
                            dVar.mo127337a2();
                            return;
                        }
                        return;
                    case 6:
                        this.f292969q = 5;
                        this.f292970r = 4;
                        m130657f();
                        int i4 = e0Var.f177686d;
                        this.f292966n = i4;
                        C99993c cVar = this.f292959d;
                        if (cVar != null) {
                            BakWaitingUI bakWaitingUI = (BakWaitingUI) cVar;
                            bakWaitingUI.f267691e = i4;
                            bakWaitingUI.f267693g.post(new C92948f(bakWaitingUI));
                        } else {
                            Log.m105924i("MicroMsg.BakPcProcessMgr", "callback is null");
                        }
                        C99980a.m130643h().mo139321j().f292936e++;
                        C100546d.m131563g().mo139993e(new C99985h(this), false, -1);
                        return;
                    case 7:
                        this.f292969q = -1;
                        this.f292970r = 1;
                        m130657f();
                        mo139334h(e0Var.f177686d);
                        C47301e eVar2 = this.f292965j;
                        if (eVar2 != null) {
                            eVar2.cancel();
                            this.f292965j = null;
                        }
                        C99996l lVar = this.f292964i;
                        if (lVar != null) {
                            lVar.mo139340c();
                        }
                        C99994d dVar2 = this.f292961f;
                        if (dVar2 != null) {
                            dVar2.mo127337a2();
                            return;
                        }
                        return;
                    case 9:
                        mo139334h(i3);
                        C99984g gVar3 = this.f292963h;
                        if (gVar3 != null) {
                            Log.m105924i("MicroMsg.BakPCServer", "pause");
                            gVar3.f292943f = true;
                            return;
                        }
                        return;
                    case 10:
                        mo139334h(i3);
                        C99996l lVar2 = this.f292964i;
                        if (lVar2 != null) {
                            Log.m105924i("MicroMsg.RecoverPCServer", "pause");
                            lVar2.f292975g = true;
                            return;
                        }
                        return;
                    case 11:
                        mo139334h(i3);
                        C99984g gVar4 = this.f292963h;
                        if (gVar4 != null) {
                            Log.m105924i("MicroMsg.BakPCServer", "resume");
                            gVar4.f292943f = false;
                            synchronized (gVar4.f292941d) {
                                gVar4.f292941d.notifyAll();
                            }
                            return;
                        }
                        return;
                    case 12:
                        mo139334h(i3);
                        C99996l lVar3 = this.f292964i;
                        if (lVar3 != null) {
                            Log.m105924i("MicroMsg.RecoverPCServer", "resume");
                            lVar3.f292975g = false;
                            synchronized (lVar3.f292974f) {
                                lVar3.f292974f.notifyAll();
                            }
                            return;
                        }
                        return;
                    case 15:
                        C99980a.m130643h().mo139320i().mo123242h();
                        C99980a.m130643h().mo139321j().mo139323a();
                        mo139330b(15, (String) null);
                        return;
                    case 16:
                        mo139334h(i3);
                        C99995e eVar3 = this.f292962g;
                        if (eVar3 != null) {
                            BakFinishUI bakFinishUI = (BakFinishUI) eVar3;
                            bakFinishUI.f267654f.post(new C92946d(bakFinishUI));
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BakPcProcessMgr", e, "buf to PacketCommandReq error", new Object[0]);
            }
            Log.printErrStackTrace("MicroMsg.BakPcProcessMgr", e, "buf to PacketCommandReq error", new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo139330b(int r8, java.lang.String r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "MicroMsg.BakPcProcessMgr"
            java.lang.String r1 = "callbackErr type:%d,  %s"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x00fd }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00fd }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x00fd }
            r4 = 1
            r3[r4] = r9     // Catch:{ all -> 0x00fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r3)     // Catch:{ all -> 0x00fd }
            r9 = 10006(0x2716, float:1.4021E-41)
            r0 = -1
            if (r8 == r9) goto L_0x001e
            r9 = 10008(0x2718, float:1.4024E-41)
            if (r8 != r9) goto L_0x0063
        L_0x001e:
            java.lang.String r9 = "MicroMsg.BakPcProcessMgr"
            java.lang.String r1 = "callbackErr socketClose"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r1)     // Catch:{ all -> 0x00fd }
            r7.f292969q = r0     // Catch:{ all -> 0x00fd }
            r7.f292970r = r4     // Catch:{ all -> 0x00fd }
            m130657f()     // Catch:{ all -> 0x00fd }
            mv0.a r9 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x00fd }
            mv0.d r9 = r9.mo139321j()     // Catch:{ all -> 0x00fd }
            r9.f292933b = r2     // Catch:{ all -> 0x00fd }
            mv0.a r9 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x00fd }
            mv0.d r9 = r9.mo139321j()     // Catch:{ all -> 0x00fd }
            r9.mo139323a()     // Catch:{ all -> 0x00fd }
            mv0.k$c r9 = r7.f292959d     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x004a
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI r9 = (com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI) r9     // Catch:{ all -> 0x00fd }
            r9.mo127331d(r8)     // Catch:{ all -> 0x00fd }
        L_0x004a:
            mv0.k$a r9 = r7.f292960e     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x0053
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI r9 = (com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI) r9     // Catch:{ all -> 0x00fd }
            r9.mo127331d(r8)     // Catch:{ all -> 0x00fd }
        L_0x0053:
            mv0.k$d r9 = r7.f292961f     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x005a
            r9.mo127331d(r8)     // Catch:{ all -> 0x00fd }
        L_0x005a:
            mv0.k$e r9 = r7.f292962g     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x0063
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI r9 = (com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakFinishUI) r9     // Catch:{ all -> 0x00fd }
            r9.mo127331d(r8)     // Catch:{ all -> 0x00fd }
        L_0x0063:
            r9 = 10009(0x2719, float:1.4026E-41)
            if (r8 == r9) goto L_0x00d4
            r9 = 10004(0x2714, float:1.4019E-41)
            if (r8 != r9) goto L_0x006c
            goto L_0x00d4
        L_0x006c:
            java.lang.String r9 = "MicroMsg.BakPcProcessMgr"
            java.lang.String r1 = "summerbak errtype:%d, authcallback[%s], operatorcallback[%s], eventCallback[%s]"
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x00fd }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00fd }
            r3[r5] = r6     // Catch:{ all -> 0x00fd }
            mv0.k$a r5 = r7.f292960e     // Catch:{ all -> 0x00fd }
            r3[r4] = r5     // Catch:{ all -> 0x00fd }
            mv0.k$d r4 = r7.f292961f     // Catch:{ all -> 0x00fd }
            r3[r2] = r4     // Catch:{ all -> 0x00fd }
            r2 = 3
            mv0.k$c r4 = r7.f292959d     // Catch:{ all -> 0x00fd }
            r3[r2] = r4     // Catch:{ all -> 0x00fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r1, r3)     // Catch:{ all -> 0x00fd }
            r9 = 15
            if (r8 != r9) goto L_0x00ae
            mv0.k$a r9 = r7.f292960e     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x0097
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI r9 = (com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI) r9     // Catch:{ all -> 0x00fd }
            r9.mo127331d(r8)     // Catch:{ all -> 0x00fd }
        L_0x0097:
            mv0.k$d r9 = r7.f292961f     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x009e
            r9.mo127331d(r8)     // Catch:{ all -> 0x00fd }
        L_0x009e:
            mv0.k$c r9 = r7.f292959d     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x00ae
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI r9 = (com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI) r9     // Catch:{ all -> 0x00fd }
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r9.f267693g     // Catch:{ all -> 0x00fd }
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.g r2 = new com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.g     // Catch:{ all -> 0x00fd }
            r2.<init>(r9, r8)     // Catch:{ all -> 0x00fd }
            r1.post(r2)     // Catch:{ all -> 0x00fd }
        L_0x00ae:
            if (r8 != r0) goto L_0x00d2
            mv0.k$a r9 = r7.f292960e     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x00ba
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI r9 = (com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakToPcUI) r9     // Catch:{ all -> 0x00fd }
            r9.mo127331d(r8)     // Catch:{ all -> 0x00fd }
            goto L_0x00d2
        L_0x00ba:
            mv0.k$d r9 = r7.f292961f     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x00c2
            r9.mo127331d(r8)     // Catch:{ all -> 0x00fd }
            goto L_0x00d2
        L_0x00c2:
            mv0.k$c r9 = r7.f292959d     // Catch:{ all -> 0x00fd }
            if (r9 == 0) goto L_0x00d2
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI r9 = (com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui.BakWaitingUI) r9     // Catch:{ all -> 0x00fd }
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r9.f267693g     // Catch:{ all -> 0x00fd }
            com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.g r1 = new com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.g     // Catch:{ all -> 0x00fd }
            r1.<init>(r9, r8)     // Catch:{ all -> 0x00fd }
            r0.post(r1)     // Catch:{ all -> 0x00fd }
        L_0x00d2:
            monitor-exit(r7)
            return
        L_0x00d4:
            java.lang.String r9 = "MicroMsg.BakPcProcessMgr"
            java.lang.String r0 = "callbackErr ip not match or connect failed: %d"
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x00fd }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00fd }
            r1[r5] = r8     // Catch:{ all -> 0x00fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r9, r0, r1)     // Catch:{ all -> 0x00fd }
            mv0.a r8 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x00fd }
            mv0.d r8 = r8.mo139321j()     // Catch:{ all -> 0x00fd }
            r8.f292933b = r2     // Catch:{ all -> 0x00fd }
            mv0.a r8 = mv0.C99980a.m130643h()     // Catch:{ all -> 0x00fd }
            mv0.d r8 = r8.mo139321j()     // Catch:{ all -> 0x00fd }
            r8.mo139323a()     // Catch:{ all -> 0x00fd }
            r7.mo139337k()     // Catch:{ all -> 0x00fd }
            monitor-exit(r7)
            return
        L_0x00fd:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mv0.C99990k.mo139330b(int, java.lang.String):void");
    }

    /* renamed from: d */
    public int mo139331d() {
        Log.m105925i("MicroMsg.BakPcProcessMgr", "getPCProgressPercent now progress:%d", Integer.valueOf(this.f292970r));
        int i = this.f292970r;
        if (i == 2 || i == 3) {
            this.f292963h.getClass();
            return 0;
        } else if (i == 4 || i == 5) {
            return this.f292964i.f292986u;
        } else {
            if (i == 6 || i == 7) {
                return this.f292964i.f292981p;
            }
            Log.m105928w("MicroMsg.BakPcProcessMgr", "wrong operatorStatus");
            return 0;
        }
    }

    /* renamed from: e */
    public void mo139332e(int i) {
        byte[] bArr;
        int i2 = i;
        Class cls = C76706g.class;
        if (i2 == 0) {
            this.f292969q = 1;
        } else {
            this.f292969q = -1;
        }
        if (i2 == 1) {
            C100965f0 f0Var = new C100965f0();
            f0Var.f295649d = 0;
            f0Var.f295650e = i2;
            try {
                Log.m105925i("MicroMsg.BakPcProcessMgr", "send auth cmd resp, status:%d", Integer.valueOf(i));
                C20842c.m22885v1(f0Var.toByteArray(), 4);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.BakPcProcessMgr", e, "buf to PacketCommandResponse err", new Object[0]);
            }
        } else {
            C100967t tVar = new C100967t();
            tVar.f295666h = 0;
            tVar.f295668j = Build.MANUFACTURER;
            tVar.f295669n = C87203t.m108275k();
            tVar.f295667i = 0;
            tVar.f295670o = Build.VERSION.RELEASE;
            String str = C72994y1.f212832a;
            Uri n = C116299g2.m163858n(C112760b.m154230f0());
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var2 = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var2.mo177799l(n, (C116281f0.C116288h) null);
            if ((!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) && C88955f.m111058b()) {
                Uri n2 = C116299g2.m163858n(C112760b.m154195C());
                String path2 = n2.getPath();
                if (path2 != null) {
                    String k2 = C116299g2.m163855k(path2, false, false);
                    if (!n2.getPath().equals(k2)) {
                        n2 = n2.buildUpon().path(k2).build();
                    }
                }
                C116281f0.C116288h l2 = f0Var2.mo177799l(n2, (C116281f0.C116288h) null);
                if (!(!l2.mo177810a() ? false : l2.f348991a.mo119948x(l2.f348992b))) {
                    C116281f0.C116288h l3 = f0Var2.mo177799l(n2, l2);
                    if (!l3.mo177810a() ? false : l3.f348991a.mo119937g(l3.f348992b)) {
                        str = C112760b.m154195C();
                    }
                } else {
                    str = C112760b.m154195C();
                }
            }
            tVar.f295665g = str;
            tVar.f295664f = C75592q0.m90783m();
            tVar.f295663e = C75592q0.m90789s();
            tVar.f295662d = "" + C89625d.f257841g;
            try {
                PackageInfo packageInfo = MMApplicationContext.getContext().getPackageManager().getPackageInfo(MMApplicationContext.getContext().getPackageName(), 0);
                tVar.f295662d = packageInfo.versionName + ";" + packageInfo.versionCode + ";" + C89625d.f257841g;
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.BakPcProcessMgr", e2, "get packageInfo failed", new Object[0]);
            }
            C10579k RE = ((C76706g) C86312j.m106911c(cls)).mo106826RE();
            String str2 = tVar.f295663e;
            Bitmap f = AvatarStorage.m80444f(((AvatarStorage) RE).mo93559h(str2, false), str2, false);
            if (f != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                f.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                } catch (Exception e3) {
                    Log.printErrStackTrace("MicroMsg.BakPcProcessMgr", e3, "close", new Object[0]);
                }
            } else {
                bArr = null;
            }
            String g = ((AvatarStorage) ((C76706g) C86312j.m106911c(cls)).mo106826RE()).mo93558g(tVar.f295663e, true, false);
            Object[] objArr = new Object[2];
            objArr[0] = g;
            objArr[1] = Integer.valueOf(bArr == null ? 0 : bArr.length);
            Log.m105925i("MicroMsg.BakPcProcessMgr", ", bmHDPath:%s, bm.buf.len:%d", objArr);
            if (!Util.isNullOrNil(bArr)) {
                tVar.f295671p = new C89349b(bArr);
            }
            byte[] O = C86013q1.m106433O(g, 0, -1);
            if (!Util.isNullOrNil(O)) {
                tVar.f295672q = new C89349b(O);
            }
            C100965f0 f0Var3 = new C100965f0();
            f0Var3.f295649d = 0;
            f0Var3.f295650e = i2;
            f0Var3.f295651f = tVar;
            try {
                Log.m105925i("MicroMsg.BakPcProcessMgr", "send auth cmd resp, status:%d", Integer.valueOf(i));
                C20842c.m22885v1(f0Var3.toByteArray(), 4);
            } catch (Exception e4) {
                Log.printErrStackTrace("MicroMsg.BakPcProcessMgr", e4, "buf to PacketCommandResponse err", new Object[0]);
            }
        }
    }

    /* renamed from: g */
    public void mo139333g(int i) {
        C62560e0 e0Var = new C62560e0();
        e0Var.f177686d = i;
        try {
            Log.m105925i("MicroMsg.BakPcProcessMgr", "sendNormalReq cmd :%d (%s)", Integer.valueOf(i), m130656c(i));
            C20842c.m22885v1(e0Var.toByteArray(), 3);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BakPcProcessMgr", e, "buf to PacketCommandRequest err", new Object[0]);
        }
    }

    /* renamed from: h */
    public final void mo139334h(int i) {
        mo139335i(i, 0, (C62568v) null);
    }

    /* renamed from: i */
    public void mo139335i(int i, int i2, C62568v vVar) {
        C100965f0 f0Var = new C100965f0();
        f0Var.f295649d = i;
        f0Var.f295650e = i2;
        f0Var.f295654i = vVar;
        try {
            Log.m105925i("MicroMsg.BakPcProcessMgr", "send cmd resp, status:%d, cmd:%d (%s)", Integer.valueOf(i2), Integer.valueOf(i), m130656c(i));
            C20842c.m22885v1(f0Var.toByteArray(), 4);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.BakPcProcessMgr", e, "buf to PacketCommandResponse err", new Object[0]);
        }
    }

    /* renamed from: j */
    public synchronized void mo139336j(C99994d dVar) {
        if (dVar == null) {
            if (this.f292961f instanceof C92943c) {
                Log.m105918d("MicroMsg.BakPcProcessMgr", "setOperatorCallbck BakchatBannerView null ilegal, fking return");
                return;
            }
        }
        Log.m105919d("MicroMsg.BakPcProcessMgr", "setOperatorCallbck:%s", dVar);
        this.f292961f = dVar;
        this.f292963h.f292947j = dVar;
        this.f292964i.f292980o = dVar;
    }

    /* renamed from: k */
    public void mo139337k() {
        Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
        className.addFlags(335544320);
        className.putExtra("nofification_type", "back_to_pcmgr_error_notification");
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(className);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakPcProcessMgr", "skipToBakErrorUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakPcProcessMgr", "skipToBakErrorUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: l */
    public void mo139338l() {
        Intent className = new Intent().setClassName(MMApplicationContext.getContext(), "com.tencent.mm.ui.LauncherUI");
        className.addFlags(335544320);
        className.putExtra("nofification_type", "back_to_pcmgr_notification");
        className.putExtra("newPCBackup", false);
        Context context = MMApplicationContext.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(className);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakPcProcessMgr", "skipToBakToPcUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/BakPcProcessMgr", "skipToBakToPcUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: m */
    public void mo139339m() {
        C99996l lVar = this.f292964i;
        if (lVar.f292982q) {
            lVar.getClass();
            Log.m105924i("MicroMsg.RecoverPCServer", "startMerge");
            if (lVar.f292983r) {
                Log.m105924i("MicroMsg.RecoverPCServer", "hasStartMerge , return");
                return;
            }
            lVar.f292987v = 0;
            C99980a.m130643h().mo139322k().f292970r = 6;
            lVar.f292983r = true;
            C100546d.m131563g().mo139993e(new C100001o(lVar), false, -1);
            return;
        }
        Log.m105920e("MicroMsg.BakPcProcessMgr", "startMerge err state");
    }
}
