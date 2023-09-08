package com.tencent.p014mm.plugin.ipcall.model;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.plugin.ipcall.C105379e;
import com.tencent.p014mm.plugin.ipcall.IPCallManager;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105403d2;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105420i2;
import com.tencent.p014mm.plugin.ipcall.p065ui.C105431u1;
import com.tencent.p014mm.plugin.ipcall.p065ui.IPCallTalkUI;
import com.tencent.p014mm.plugin.voip.model.C106343f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j12.C108528a;
import java.util.Iterator;
import java.util.LinkedList;
import k12.C108824b;
import k12.C108828c;
import k12.C108829d;
import k12.C60939a;
import m12.C109468b;
import m12.C109470c;
import nj3.C76879j;
import p12.C47421h;
import p12.C47422k;
import p12.C47424n;
import p12.C62186a;
import p12.C62187i;
import p12.C62188o;
import p910lj.C76701a;
import r12.C110487a;
import r12.C110488c;
import r12.C110489d;
import r12.C110490f;
import r12.C110491g;
import r12.C110492h;
import r12.C110493i;
import r12.C63355e;
import sf0.C48374j0;
import t12.C110899d;
import te3.C101851uq3;
import te3.C101858vq3;
import te3.C110972vi3;
import te3.C50550ni3;
import te3.C52122yi3;
import te3.C64343ej3;
import te3.C64367fj3;
import te3.C64804wi3;
import te3.wt4;
import z33.C112597j;

/* renamed from: com.tencent.mm.plugin.ipcall.model.f */
public class C105382f implements C60939a.C60940a, C108824b.C108827c {

    /* renamed from: d */
    public int f313246d = 0;

    /* renamed from: e */
    public int f313247e = 0;

    /* renamed from: f */
    public int f313248f = 0;

    /* renamed from: g */
    public boolean f313249g = false;

    /* renamed from: h */
    public boolean f313250h = false;

    /* renamed from: i */
    public C105384b f313251i;

    /* renamed from: j */
    public C110489d f313252j = new C110489d();

    /* renamed from: n */
    public C110493i f313253n = new C110493i();

    /* renamed from: o */
    public C110487a f313254o = new C110487a();

    /* renamed from: p */
    public C110492h f313255p = new C110492h();

    /* renamed from: q */
    public C110488c f313256q = new C110488c();

    /* renamed from: r */
    public C63355e f313257r = new C63355e();

    /* renamed from: s */
    public C110491g f313258s = new C110491g();

    /* renamed from: t */
    public C110490f f313259t = new C110490f();

    /* renamed from: u */
    public C108828c f313260u;

    /* renamed from: v */
    public boolean f313261v = false;

    /* renamed from: w */
    public boolean f313262w = false;

    /* renamed from: x */
    public boolean f313263x = false;

    /* renamed from: y */
    public C29060q f313264y = new C105383a();

    /* renamed from: com.tencent.mm.plugin.ipcall.model.f$a */
    public class C105383a extends C29060q.C29061a {
        public C105383a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
            r6 = r5.f313265d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNetworkChange(int r6) {
            /*
                r5 = this;
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r3 = 0
                r1[r3] = r2
                java.lang.String r2 = "MicroMsg.IPCallSvrLogic"
                java.lang.String r4 = "onNetworkChange, st: %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
                m12.b r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.zx0()
                boolean r1 = r1.f327643d
                if (r1 == 0) goto L_0x0036
                com.tencent.mm.plugin.ipcall.model.e r1 = com.tencent.p014mm.plugin.ipcall.model.C105385g.Fx0()
                int r1 = r1.f313245a
                r2 = 4
                if (r1 == r2) goto L_0x0027
                r4 = 5
                if (r1 != r4) goto L_0x0026
                goto L_0x0027
            L_0x0026:
                r0 = 0
            L_0x0027:
                if (r0 == 0) goto L_0x0036
                if (r6 != r2) goto L_0x0036
                com.tencent.mm.plugin.ipcall.model.f r6 = com.tencent.p014mm.plugin.ipcall.model.C105382f.this
                r12.f r0 = r6.f313259t
                if (r0 == 0) goto L_0x0036
                k12.c r6 = r6.f313260u
                r0.mo85903j(r6)
            L_0x0036:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.model.C105382f.C105383a.onNetworkChange(int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ipcall.model.f$b */
    public interface C105384b {
    }

    /* renamed from: a */
    public void mo85904a(int i, Object obj, int i2, int i3) {
        if (mo150094i(i, obj, i2, i3)) {
            Log.m105924i("MicroMsg.IPCallSvrLogic", "onServiceFailed different room ignore");
        } else if (i == 1) {
            mo150091f(false);
        } else if (i == 6) {
            mo150093h(false);
        } else if (i == 8) {
            mo150092g(false);
        } else if (i == 3) {
            mo150089d(false, i3);
        } else if (i == 4) {
            mo150097l(false, i3);
        }
    }

    /* renamed from: b */
    public void mo85905b(int i, Object obj, int i2, int i3) {
        if (mo150094i(i, obj, i2, i3)) {
            Log.m105924i("MicroMsg.IPCallSvrLogic", "onServiceResult different room ignore");
        } else if (i == 1) {
            mo150091f(true);
        } else if (i == 6) {
            mo150093h(true);
        } else if (i == 8) {
            mo150092g(true);
        } else if (i == 3) {
            mo150089d(true, i3);
        } else if (i == 4) {
            mo150097l(true, i3);
        }
    }

    /* renamed from: c */
    public void mo150088c() {
        if (this.f313260u.f325895M) {
            Log.m105920e("MicroMsg.IPCallSvrLogic", "cancelIPCall, already accept");
        }
        this.f313249g = true;
        Log.m105925i("MicroMsg.IPCallSvrLogic", "cancelIPCall, roomId: %d, inviteId: %d", Integer.valueOf(this.f313260u.f325896a), Integer.valueOf(this.f313260u.f325899d));
        this.f313256q.mo159934p();
        this.f313253n.mo159934p();
        this.f313254o.mo85903j(this.f313260u);
        this.f313258s.mo85903j(this.f313260u);
    }

    /* renamed from: d */
    public final void mo150089d(boolean z, int i) {
        int i2;
        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleCancel, success: %b", Boolean.valueOf(z));
        if (!z && i < 0 && (i2 = this.f313248f) < 1) {
            int i3 = i2 + 1;
            this.f313248f = i3;
            Log.m105925i("MicroMsg.IPCallSvrLogic", "cancel failed, retry count: %d", Integer.valueOf(i3));
            this.f313254o.mo85903j(this.f313260u);
        }
    }

    /* renamed from: e */
    public final void mo150090e(boolean z) {
        C105384b bVar;
        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleHeartbeat, success: %b", Boolean.valueOf(z));
        if (!z) {
            int i = this.f313246d + 1;
            this.f313246d = i;
            if (i >= 2) {
                Log.m105920e("MicroMsg.IPCallSvrLogic", "heartbeat failed twice!");
                this.f313256q.mo159934p();
                if (C105385g.Fx0().mo150085c() && (bVar = this.f313251i) != null) {
                    IPCallManager iPCallManager = (IPCallManager) bVar;
                    iPCallManager.getClass();
                    Log.m105924i("MicroMsg.IPCallManager", "onHeartbeatFailed");
                    if (iPCallManager.mo150067j(7, 29)) {
                        iPCallManager.mo150066i(7, (String) null, MMApplicationContext.getContext().getString(C0966R.string.au8), 1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f313246d = 0;
    }

    /* renamed from: f */
    public final void mo150091f(boolean z) {
        boolean z2 = false;
        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleInvite, success: %b, isLaunchCancel: %b, isLaunchShutdown: %b", Boolean.valueOf(z), Boolean.valueOf(this.f313249g), Boolean.valueOf(this.f313250h));
        if (this.f313249g || this.f313250h) {
            Log.m105924i("MicroMsg.IPCallSvrLogic", "handleInvite, ignore this");
        } else if (z) {
            C105384b bVar = this.f313251i;
            if (bVar != null) {
                C108828c cVar = this.f313260u;
                if (!cVar.f325914s) {
                    ((IPCallManager) bVar).mo150065h(cVar.f325902g, cVar.f325905j, cVar.f325903h, cVar.f325904i, cVar.f325910o);
                } else {
                    IPCallManager iPCallManager = (IPCallManager) bVar;
                    iPCallManager.getClass();
                    Log.m105924i("MicroMsg.IPCallManager", "onInviteSuccess");
                    if (C105385g.Fx0().mo150087f(3)) {
                        C109470c Dx0 = C105385g.Dx0();
                        Dx0.getClass();
                        Log.m105918d("MicroMsg.IPCallReportHelper", "markStartInvite");
                        if (Dx0.f327670r == 0) {
                            Dx0.f327670r = System.currentTimeMillis();
                        }
                        C108828c cVar2 = C105385g.Gx0().f313260u;
                        C109470c Dx02 = C105385g.Dx0();
                        int i = cVar2.f325899d;
                        String str = cVar2.f325891I;
                        String str2 = cVar2.f325892J;
                        int i2 = cVar2.f325896a;
                        long j = cVar2.f325897b;
                        long j2 = cVar2.f325898c;
                        Dx02.f327663k = i;
                        Dx02.f327669q = str;
                        Dx02.f327667o = str2;
                        Dx02.f327664l = i2;
                        Dx02.f327665m = j;
                        Dx02.f327666n = j2;
                        C105379e eVar = iPCallManager.f313219d;
                        if (eVar != null) {
                            C105420i2 i2Var = (C105420i2) eVar;
                            Log.m105924i("MicroMsg.TalkUIController", "onInviteSuccess");
                            String str3 = C105385g.Gx0().f313260u.f325892J;
                            String str4 = C105385g.Gx0().f313260u.f325893K;
                            if (!Util.isNullOrNil(str3) && !Util.isNullOrNil(str4) && !str3.equals(str4)) {
                                Log.m105925i("MicroMsg.TalkUIController", "toPhoneNumber:%s,serverRetPhoneNumber:%s", str3, str4);
                                i2Var.mo150166h(str4);
                            }
                            Log.m105924i("MicroMsg.TalkUIController", "callFlag:" + C105385g.Gx0().f313260u.f325915t);
                            int i3 = C105385g.Gx0().f313260u.f325915t;
                            if ((i3 & 1) > 0 && (i3 & 2) > 0 && (i3 & 8) <= 0) {
                                z2 = true;
                            }
                            if (z2) {
                                Log.m105924i("MicroMsg.TalkUIController", "isNotFree");
                                C76879j.m92740k(i2Var.f313450w, C0966R.string.fvy, C0966R.string.fvz, C0966R.string.fvx, C0966R.string.fvw, true, (DialogInterface.OnClickListener) null, new C105403d2(i2Var));
                            }
                            i2Var.mo150165g(3);
                        }
                    }
                }
            }
            Log.m105924i("MicroMsg.IPCallSvrLogic", "start sync");
            this.f313253n.mo85903j(this.f313260u);
        } else {
            C105384b bVar2 = this.f313251i;
            if (bVar2 != null) {
                C108828c cVar3 = this.f313260u;
                if (cVar3.f325911p) {
                    ((IPCallManager) bVar2).mo150062e(cVar3.f325902g, cVar3.f325905j, cVar3.f325903h, cVar3.f325904i);
                } else if (cVar3.f325912q) {
                    int i4 = cVar3.f325902g;
                    String str5 = cVar3.f325905j;
                    String str6 = cVar3.f325903h;
                    int i5 = cVar3.f325904i;
                    IPCallManager iPCallManager2 = (IPCallManager) bVar2;
                    iPCallManager2.getClass();
                    Log.m105925i("MicroMsg.IPCallManager", "onCallRestricted, currentState: %s", C105385g.Fx0().mo150083a());
                    if (iPCallManager2.mo150067j(10, 0)) {
                        iPCallManager2.mo150066i(10, str5, str6, i5);
                    }
                } else if (cVar3.f325913r) {
                    ((IPCallManager) bVar2).mo150063f(cVar3.f325902g, cVar3.f325905j, cVar3.f325903h, cVar3.f325904i);
                } else if (!cVar3.f325914s) {
                    ((IPCallManager) bVar2).mo150065h(cVar3.f325902g, cVar3.f325905j, cVar3.f325903h, cVar3.f325904i, cVar3.f325910o);
                } else {
                    int i6 = cVar3.f325902g;
                    String str7 = cVar3.f325905j;
                    String str8 = cVar3.f325903h;
                    int i7 = cVar3.f325904i;
                    IPCallManager iPCallManager3 = (IPCallManager) bVar2;
                    iPCallManager3.getClass();
                    Log.m105925i("MicroMsg.IPCallManager", "onInviteFailed, currentState: %s", C105385g.Fx0().mo150083a());
                    if (iPCallManager3.mo150067j(2, 0)) {
                        iPCallManager3.mo150066i(2, str7, str8, i7);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo150092g(boolean z) {
        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleNotify, success: %b", Boolean.valueOf(z));
        if (z && C105385g.zx0().f327643d) {
            C105385g.zx0().mo160704c(this.f313260u.f325920y);
        }
        C108828c cVar = this.f313260u;
        if (cVar != null && z) {
            int a = cVar.mo159937a();
            if (a == 2 || a == 1) {
                if (!this.f313263x) {
                    C108828c cVar2 = this.f313260u;
                    C97625j3.m125815e().mo123460f(new C62188o(cVar2.f325896a, cVar2.f325897b, cVar2.mo159938b(), this.f313260u.f325898c, false));
                } else {
                    Log.m105924i("MicroMsg.IPCallSvrLogic", "current status has jni accepted, ignore notify accept");
                    return;
                }
            }
            mo150096k(this.f313260u.mo159937a());
        }
    }

    /* renamed from: h */
    public final void mo150093h(boolean z) {
        int AddNewRelayConns;
        LinkedList<C50550ni3> linkedList;
        LinkedList<C50550ni3> linkedList2;
        LinkedList<C50550ni3> linkedList3;
        LinkedList<C50550ni3> linkedList4;
        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleRedirect, isSuccess: %b", Boolean.valueOf(z));
        if (z) {
            C109468b zx02 = C105385g.zx0();
            C108828c cVar = this.f313260u;
            zx02.getClass();
            Log.m105924i("MicroMsg.IPCallEngineManager", "redirectSvrAddr");
            if (!(cVar == null || (linkedList4 = cVar.f325884B) == null || linkedList4.size() <= 0)) {
                C110899d.m151194h(cVar.f325884B);
            }
            if (!(cVar == null || (linkedList3 = cVar.f325885C) == null || linkedList3.size() <= 0)) {
                C110899d.m151194h(cVar.f325885C);
            }
            C101858vq3 vq32 = new C101858vq3();
            C101851uq3 uq32 = new C101851uq3();
            uq32.f299626d = 0;
            uq32.f299627e = "";
            uq32.f299628f = "";
            uq32.f299629g = 4;
            uq32.f299630h = 4;
            uq32.f299631i = 2;
            uq32.f299632j = new wt4();
            uq32.f299633n = new wt4();
            if (!(cVar == null || (linkedList2 = cVar.f325884B) == null || linkedList2.size() <= 0)) {
                uq32.f299632j = C110899d.m151194h(cVar.f325884B);
            }
            if (!(cVar == null || (linkedList = cVar.f325885C) == null || linkedList.size() <= 0)) {
                uq32.f299633n = C110899d.m151194h(cVar.f325885C);
            }
            vq32.f299683e.add(uq32);
            vq32.f299682d = 1;
            byte[] bArr = null;
            try {
                bArr = vq32.toByteArray();
            } catch (Exception unused) {
                Log.m105920e("MicroMsg.IPCallEngineManager", "conn info to byte array fail..");
            }
            if (bArr != null && (AddNewRelayConns = zx02.f327640a.AddNewRelayConns(bArr, bArr.length, 1, false)) != 0) {
                C112597j.m153937b("MicroMsg.IPCallEngineManager", "redirect relay conns fail ret:" + AddNewRelayConns);
            }
        }
    }

    /* renamed from: i */
    public boolean mo150094i(int i, Object obj, int i2, int i3) {
        C108828c cVar = this.f313260u;
        if (cVar == null || obj == null) {
            Log.m105920e("MicroMsg.IPCallSvrLogic", "callInfo = null or result = null");
            return true;
        }
        switch (i) {
            case 1:
                if (obj instanceof C62187i) {
                    C62187i iVar = (C62187i) obj;
                    C110972vi3 vi32 = iVar.f176806f;
                    int i4 = cVar.f325899d;
                    if (i4 == iVar.f176805e.f185746h) {
                        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished invite id:%d", Integer.valueOf(i4));
                        C109470c Dx0 = C105385g.Dx0();
                        if (Dx0.f327663k == this.f313260u.f325899d) {
                            Log.m105919d("MicroMsg.IPCallReportHelper", "setInviteCgiRet: %d", Integer.valueOf(i3));
                            Dx0.f327668p = i3;
                        }
                        if (i2 != 0 || i3 != 0) {
                            Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invite failed");
                            if (vi32.BaseResponse == null) {
                                C108828c cVar2 = this.f313260u;
                                cVar2.f325905j = "";
                                cVar2.f325904i = 2;
                                cVar2.f325903h = MMApplicationContext.getContext().getString(C0966R.string.aud);
                                this.f313260u.f325902g = i3;
                                break;
                            } else {
                                if (i3 == 433) {
                                    Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo account overdue");
                                    this.f313260u.f325911p = true;
                                } else if (i3 == 434) {
                                    Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo restrict call");
                                    this.f313260u.f325912q = true;
                                } else if (i3 == 435) {
                                    Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo phonenumber invalid");
                                    this.f313260u.f325913r = true;
                                }
                                int i5 = vi32.f332301q;
                                if (i5 > 0) {
                                    C108828c cVar3 = this.f313260u;
                                    cVar3.f325914s = false;
                                    cVar3.f325910o = i5;
                                } else {
                                    C108828c cVar4 = this.f313260u;
                                    cVar4.f325914s = true;
                                    cVar4.f325910o = 0;
                                }
                                C108828c cVar5 = this.f313260u;
                                cVar5.f325905j = vi32.f332303s;
                                cVar5.f325904i = vi32.f332302r;
                                cVar5.f325902g = i3;
                                if (vi32.getBaseResponse() != null) {
                                    this.f313260u.f325903h = Util.nullAsNil(C48374j0.m53718g(vi32.BaseResponse.f135956e));
                                    Log.m105919d("MicroMsg.IPCallSvrLogic", "ErrLevel:%d,ErrCode:%d,ErrMsg:%s", Integer.valueOf(vi32.f332302r), Integer.valueOf(i3), this.f313260u.f325903h);
                                    break;
                                }
                            }
                        } else {
                            C108828c cVar6 = this.f313260u;
                            if (cVar6 != null) {
                                cVar6.f325896a = vi32.f332291d;
                                cVar6.f325897b = vi32.f332292e;
                                cVar6.f325898c = vi32.f332298n;
                                cVar6.f325906k = vi32.f332293f;
                                cVar6.f325909n = vi32.f332295h * 1000;
                                cVar6.f325916u = vi32.f332296i;
                                cVar6.f325917v = vi32.f332297j;
                                cVar6.f325884B = vi32.f332294g;
                                cVar6.f325885C = vi32.f332305u;
                                cVar6.f325893K = vi32.f332307w;
                                int i6 = vi32.f332306v;
                                if (i6 > 0) {
                                    cVar6.f325886D = i6;
                                }
                                cVar6.f325918w = vi32.f332299o;
                                cVar6.f325919x = vi32.f332300p;
                                cVar6.f325915t = vi32.f332309y;
                                int i7 = vi32.f332304t;
                                if (i7 > 0) {
                                    cVar6.f325921z = i7 - 1;
                                    Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got encryptStrategy[" + this.f313260u.f325921z + "] from Invite resp");
                                } else {
                                    Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo zhengxue[ENCRYPT] got no encryptStrategy from Invite resp");
                                    this.f313260u.f325921z = 2;
                                }
                                this.f313260u.f325883A = vi32.f332308x;
                                Log.m105919d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo NextInvite:%d", Integer.valueOf(vi32.f332301q));
                                int i8 = vi32.f332301q;
                                if (i8 > 0) {
                                    C108828c cVar7 = this.f313260u;
                                    cVar7.f325914s = false;
                                    cVar7.f325910o = i8;
                                } else {
                                    C108828c cVar8 = this.f313260u;
                                    cVar8.f325914s = true;
                                    cVar8.f325910o = 0;
                                }
                                C108828c cVar9 = this.f313260u;
                                cVar9.f325905j = vi32.f332303s;
                                cVar9.f325904i = vi32.f332302r;
                                cVar9.f325902g = i3;
                                cVar9.f325903h = Util.nullAsNil(C48374j0.m53718g(vi32.BaseResponse.f135956e));
                                break;
                            }
                        }
                    } else {
                        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", Integer.valueOf(i4), Integer.valueOf(iVar.f176805e.f185746h));
                        return true;
                    }
                } else {
                    Log.m105920e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo invited result error");
                    return true;
                }
                break;
            case 2:
                if (obj instanceof C62188o) {
                    Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished errType:%d,errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
                    C62188o oVar = (C62188o) obj;
                    C64343ej3 ej32 = oVar.f176810f;
                    int i9 = this.f313260u.f325896a;
                    if (i9 == oVar.f176809e.f182756e) {
                        if (i2 == 0 && i3 == 0) {
                            Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync roomId: %d, status: %d, memberId: %d, syncKey: %d", Integer.valueOf(ej32.f182983d), Integer.valueOf(ej32.f182985f), Integer.valueOf(ej32.f182988i), Integer.valueOf(ej32.f182986g));
                            int i15 = ej32.f182983d;
                            C108828c cVar10 = this.f313260u;
                            if (i15 == cVar10.f325896a && ej32.f182984e == cVar10.f325897b) {
                                if (ej32.f182988i == cVar10.f325906k) {
                                    Log.m105918d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync update self status");
                                    int i16 = ej32.f182986g;
                                    C108828c cVar11 = this.f313260u;
                                    if (i16 > cVar11.f325907l) {
                                        cVar11.f325907l = i16;
                                        int i17 = ej32.f182985f;
                                        if (i17 != 0) {
                                            cVar11.f325908m = i17;
                                        }
                                    }
                                } else {
                                    Log.m105918d("MicroMsg.IPCallSvrLogic", " handleServiceResultCallInfosync update others status");
                                    Iterator<C108829d> it = this.f313260u.f325887E.iterator();
                                    boolean z = false;
                                    while (it.hasNext()) {
                                        C108829d next = it.next();
                                        if (next.f325924c == ej32.f182988i) {
                                            int i18 = ej32.f182986g;
                                            if (i18 > next.f325923b) {
                                                next.f325923b = i18;
                                                int i19 = ej32.f182985f;
                                                if (i19 != 0) {
                                                    next.f325922a = i19;
                                                }
                                            }
                                            z = true;
                                        }
                                    }
                                    if (!z) {
                                        C108829d dVar = new C108829d();
                                        dVar.f325924c = ej32.f182988i;
                                        dVar.f325922a = ej32.f182985f;
                                        dVar.f325923b = ej32.f182986g;
                                        this.f313260u.f325887E.add(dVar);
                                    }
                                }
                                int i25 = ej32.f182989j;
                                if (i25 == 404 || i25 == 484) {
                                    Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync phonenumber invalid");
                                    this.f313260u.f325913r = true;
                                }
                                C108828c cVar12 = this.f313260u;
                                cVar12.f325903h = ej32.f182990n;
                                cVar12.f325902g = ej32.f182989j;
                                cVar12.f325904i = ej32.f182991o;
                                cVar12.f325905j = ej32.f182992p;
                                cVar12.f325920y = ej32.f182987h;
                                break;
                            }
                        }
                    } else {
                        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync finished but room id not the same, now room roomId:%d, before room roomId:%d", Integer.valueOf(i9), Integer.valueOf(oVar.f176809e.f182756e));
                        return true;
                    }
                } else {
                    Log.m105920e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo sync result error");
                    return true;
                }
            case 3:
                if (!(obj instanceof C62186a)) {
                    Log.m105920e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel result error");
                    return true;
                }
                Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished errType:%d,errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
                C62186a aVar = (C62186a) obj;
                int i26 = this.f313260u.f325899d;
                if (i26 != aVar.f176802e.f184665h) {
                    Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo cancel finished but invite id not the same, now room inviteId:%d, before room inviteId:%d", Integer.valueOf(i26), Integer.valueOf(aVar.f176802e.f184665h));
                    return true;
                }
                break;
            case 4:
                if (obj instanceof C47424n) {
                    C47424n nVar = (C47424n) obj;
                    int i27 = cVar.f325896a;
                    if (i27 == nVar.f127220e.f131152e) {
                        if (i2 != 0 || i3 != 0) {
                            Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown failed");
                            break;
                        } else {
                            Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown success!");
                            this.f313260u.f325908m = 5;
                            break;
                        }
                    } else {
                        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", Integer.valueOf(i27), Integer.valueOf(nVar.f127220e.f131152e));
                        return true;
                    }
                } else {
                    Log.m105920e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown result error");
                    return true;
                }
            case 5:
                if (!(obj instanceof C47421h)) {
                    Log.m105920e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat result error");
                    return true;
                }
                Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished errType:%d,errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
                C47421h hVar = (C47421h) obj;
                int i28 = this.f313260u.f325896a;
                if (i28 != hVar.f127210e.f141540d) {
                    Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo heartbeat finished but room id not the same, now room roomId:%d, before room roomId:%d", Integer.valueOf(i28), Integer.valueOf(hVar.f127210e.f141540d));
                    return true;
                }
                break;
            case 6:
                if (obj instanceof C47422k) {
                    C47422k kVar = (C47422k) obj;
                    C52122yi3 yi32 = kVar.f127214f;
                    int i29 = cVar.f325896a;
                    if (i29 == kVar.f127213e.f144690d) {
                        if (i2 != 0 || i3 != 0) {
                            Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect failed");
                            break;
                        } else {
                            Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect success");
                            C108828c cVar13 = this.f313260u;
                            cVar13.f325884B = yi32.f145315f;
                            cVar13.f325885C = yi32.f145316g;
                            break;
                        }
                    } else {
                        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect finished but room id not the same, now room roomId:%d, before room roomId:%d", Integer.valueOf(i29), Integer.valueOf(kVar.f127213e.f144690d));
                        return true;
                    }
                } else {
                    Log.m105920e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo redirect result error");
                    return true;
                }
            case 8:
                if (obj instanceof C64804wi3) {
                    Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify finished");
                    C64804wi3 wi32 = (C64804wi3) obj;
                    C108828c cVar14 = this.f313260u;
                    int i35 = cVar14.f325896a;
                    if (i35 == wi32.f186123d) {
                        if (i2 == 0 && i3 == 0) {
                            cVar14.f325920y = wi32.f186126g;
                            Log.m105919d("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo updateNotifyCallInfo, UserStatuslist.size: %d", Integer.valueOf(wi32.f186125f.size()));
                            Iterator<C64367fj3> it4 = wi32.f186125f.iterator();
                            while (it4.hasNext()) {
                                C64367fj3 next2 = it4.next();
                                int i36 = this.f313260u.f325906k;
                                int i37 = next2.f183143f;
                                if (i36 == i37) {
                                    Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update self userStatus, memberId: %d, status: %d, syncKey: %d", Integer.valueOf(i36), Integer.valueOf(next2.f183141d), Integer.valueOf(next2.f183142e));
                                    int i38 = next2.f183142e;
                                    C108828c cVar15 = this.f313260u;
                                    if (i38 > cVar15.f325907l) {
                                        cVar15.f325907l = i38;
                                        int i39 = next2.f183141d;
                                        if (i39 != 0) {
                                            cVar15.f325908m = i39;
                                        }
                                    }
                                } else {
                                    Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo update others userStatus, memberId: %d, status: %d, syncKey: %d", Integer.valueOf(i37), Integer.valueOf(next2.f183141d), Integer.valueOf(next2.f183142e));
                                    Iterator<C108829d> it5 = this.f313260u.f325887E.iterator();
                                    boolean z2 = false;
                                    while (it5.hasNext()) {
                                        C108829d next3 = it5.next();
                                        if (next3.f325924c == next2.f183143f) {
                                            int i44 = next2.f183142e;
                                            if (i44 > next3.f325923b) {
                                                next3.f325923b = i44;
                                                int i45 = next2.f183141d;
                                                if (i45 != 0) {
                                                    next3.f325922a = i45;
                                                }
                                            }
                                            z2 = true;
                                        }
                                    }
                                    if (!z2) {
                                        C108829d dVar2 = new C108829d();
                                        dVar2.f325924c = next2.f183143f;
                                        dVar2.f325922a = next2.f183141d;
                                        dVar2.f325923b = next2.f183142e;
                                        this.f313260u.f325887E.add(dVar2);
                                    }
                                }
                                int i46 = next2.f183144g;
                                if (i46 == 404 || i46 == 484) {
                                    Log.m105924i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify phonenumber invalid");
                                    this.f313260u.f325913r = true;
                                }
                                C108828c cVar16 = this.f313260u;
                                cVar16.f325903h = next2.f183145h;
                                cVar16.f325902g = next2.f183144g;
                                cVar16.f325904i = next2.f183146i;
                                cVar16.f325905j = next2.f183147j;
                            }
                            break;
                        }
                    } else {
                        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo shutdown finished but room id not the same, now room roomId:%d, before room roomId:%d", Integer.valueOf(i35), Integer.valueOf(wi32.f186123d));
                        return true;
                    }
                } else {
                    Log.m105920e("MicroMsg.IPCallSvrLogic", "handleServiceResultCallInfo notify result error");
                    return true;
                }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo150095j(boolean z) {
        C105384b bVar;
        boolean z2 = true;
        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleSync, success: %b", Boolean.valueOf(z));
        if (z && C105385g.zx0().f327643d) {
            C105385g.zx0().mo160704c(this.f313260u.f325920y);
        }
        if (!z) {
            Log.m105920e("MicroMsg.IPCallSvrLogic", "sync failed!");
            this.f313253n.mo159934p();
            if (C105385g.Fx0().f313245a != 3) {
                z2 = false;
            }
            if (z2 && (bVar = this.f313251i) != null) {
                C108828c cVar = this.f313260u;
                int i = cVar.f325902g;
                String str = cVar.f325903h;
                int i2 = cVar.f325904i;
                IPCallManager iPCallManager = (IPCallManager) bVar;
                iPCallManager.getClass();
                Log.m105924i("MicroMsg.IPCallManager", "onSyncFailed");
                if (iPCallManager.mo150067j(7, 35)) {
                    iPCallManager.mo150066i(7, (String) null, str, i2);
                    return;
                }
                return;
            }
            return;
        }
        C108828c cVar2 = this.f313260u;
        if (cVar2 != null && z) {
            mo150096k(cVar2.mo159937a());
        }
    }

    /* renamed from: k */
    public final boolean mo150096k(int i) {
        switch (i) {
            case 1:
                Log.m105924i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user ringing");
                if (!this.f313261v) {
                    this.f313261v = true;
                    C105384b bVar = this.f313251i;
                    if (bVar != null) {
                        IPCallManager iPCallManager = (IPCallManager) bVar;
                        Log.m105925i("MicroMsg.IPCallManager", "onStartRing, currentState: %s", C105385g.Fx0().mo150083a());
                        if (C105385g.Fx0().mo150087f(4)) {
                            C109470c Dx0 = C105385g.Dx0();
                            Dx0.getClass();
                            Log.m105918d("MicroMsg.IPCallReportHelper", "markStartRing");
                            if (Dx0.f327671s == 0) {
                                long currentTimeMillis = System.currentTimeMillis();
                                Dx0.f327671s = currentTimeMillis;
                                long j = currentTimeMillis - Dx0.f327670r;
                                Dx0.f327658f = j;
                                Log.m105919d("MicroMsg.IPCallReportHelper", "ringTime: %d", Long.valueOf(j));
                            }
                            C105385g.zx0().mo160703b();
                            C109470c Dx02 = C105385g.Dx0();
                            Dx02.getClass();
                            Log.m105924i("MicroMsg.IPCallReportHelper", "startRing");
                            Dx02.f327653a = 1;
                            C105379e eVar = iPCallManager.f313219d;
                            if (eVar != null) {
                                C105420i2 i2Var = (C105420i2) eVar;
                                Log.m105918d("MicroMsg.TalkUIController", "onStartRing");
                                if (C105385g.Fx0().mo150084b()) {
                                    boolean a = i2Var.f313435h.mo150113a();
                                    C108528a wx02 = C105385g.wx0();
                                    if (wx02 != null) {
                                        wx02.f324872q = a;
                                    }
                                    boolean a2 = i2Var.f313435h.mo150113a();
                                    C108528a wx03 = C105385g.wx0();
                                    if (wx03 != null) {
                                        wx03.f324873r = a2;
                                    }
                                    C105385g.yx0().mo160364b(i2Var.f313435h.mo150113a());
                                }
                            }
                        }
                    }
                }
                return true;
            case 2:
                Log.m105925i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user accept, isLaunchCancel: %b, isLaunchShutdown: %b", Boolean.valueOf(this.f313249g), Boolean.valueOf(this.f313250h));
                if (!this.f313249g && !this.f313250h) {
                    this.f313253n.mo159934p();
                    if (!this.f313262w) {
                        this.f313262w = true;
                        C108828c cVar = this.f313260u;
                        if (cVar != null) {
                            cVar.f325895M = true;
                        }
                        C105384b bVar2 = this.f313251i;
                        if (bVar2 != null) {
                            IPCallManager iPCallManager2 = (IPCallManager) bVar2;
                            Log.m105925i("MicroMsg.IPCallManager", "onAccept, currentState: %s", C105385g.Fx0().mo150083a());
                            if (C105385g.Fx0().mo150087f(5)) {
                                C109470c Dx03 = C105385g.Dx0();
                                Dx03.getClass();
                                Log.m105918d("MicroMsg.IPCallReportHelper", "markUserAccept");
                                if (Dx03.f327672t == 0) {
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    Dx03.f327672t = currentTimeMillis2;
                                    long j2 = currentTimeMillis2 - Dx03.f327670r;
                                    Dx03.f327659g = j2;
                                    Log.m105919d("MicroMsg.IPCallReportHelper", "answerTime: %d", Long.valueOf(j2));
                                }
                                C105385g.zx0().mo160703b();
                                C109470c Dx04 = C105385g.Dx0();
                                Dx04.getClass();
                                Log.m105924i("MicroMsg.IPCallReportHelper", "userAccept");
                                Dx04.f327654b = 1;
                                IPCallManager.f313218v.removeCallbacks(iPCallManager2.f313228p);
                                C105385g.Ex0().mo143090f();
                                IPCallManager.f313218v.removeCallbacks(iPCallManager2.f313229q);
                                C105385g.yx0().mo160365c();
                                if (C105385g.zx0().f327643d && !iPCallManager2.f313221f) {
                                    C109470c Dx05 = C105385g.Dx0();
                                    Dx05.getClass();
                                    Log.m105924i("MicroMsg.IPCallReportHelper", "channelConnect");
                                    Dx05.f327660h = 1;
                                    C109470c Dx06 = C105385g.Dx0();
                                    Dx06.getClass();
                                    Log.m105918d("MicroMsg.IPCallReportHelper", "markStartTalk");
                                    if (Dx06.f327673u == 0) {
                                        Dx06.f327673u = System.currentTimeMillis();
                                    }
                                    iPCallManager2.f313221f = true;
                                    iPCallManager2.f313232t = Util.nowSecond();
                                    iPCallManager2.mo150071n();
                                    C109468b zx02 = C105385g.zx0();
                                    zx02.getClass();
                                    Log.m105918d("MicroMsg.IPCallEngineManager", "setChannelActiveAfterAccept");
                                    if (!zx02.f327643d) {
                                        Log.m105918d("MicroMsg.IPCallEngineManager", "channel not connect now");
                                    }
                                    zx02.f327640a.setActive();
                                    C105379e eVar2 = iPCallManager2.f313219d;
                                    if (eVar2 != null) {
                                        ((C105420i2) eVar2).mo150164f();
                                    }
                                    C105385g.Dx0().mo160705a();
                                    C106343f0.m143231a().mo152577d();
                                    C106343f0.m143231a().mo152575b(iPCallManager2);
                                }
                            }
                        }
                        this.f313256q.mo85903j(this.f313260u);
                    }
                }
                return true;
            case 3:
                Log.m105924i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user busy");
                this.f313253n.mo159934p();
                this.f313256q.mo159934p();
                C105384b bVar3 = this.f313251i;
                if (bVar3 != null) {
                    C108828c cVar2 = this.f313260u;
                    int i2 = cVar2.f325902g;
                    String str = cVar2.f325903h;
                    int i3 = cVar2.f325904i;
                    IPCallManager iPCallManager3 = (IPCallManager) bVar3;
                    Log.m105925i("MicroMsg.IPCallManager", "onBusy, currentState: %s", C105385g.Fx0().mo150083a());
                    if (iPCallManager3.mo150067j(1, 4)) {
                        iPCallManager3.mo150066i(1, (String) null, str, i3);
                    }
                }
                return true;
            case 4:
            case 7:
            case 8:
                Log.m105924i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, user unavailable");
                C108828c cVar3 = this.f313260u;
                if (cVar3.f325913r) {
                    C105384b bVar4 = this.f313251i;
                    if (bVar4 != null) {
                        ((IPCallManager) bVar4).mo150063f(cVar3.f325902g, cVar3.f325905j, cVar3.f325903h, cVar3.f325904i);
                    }
                } else {
                    C105384b bVar5 = this.f313251i;
                    if (bVar5 != null) {
                        String str2 = cVar3.f325903h;
                        int i4 = cVar3.f325904i;
                        IPCallManager iPCallManager4 = (IPCallManager) bVar5;
                        Log.m105925i("MicroMsg.IPCallManager", "onUnAvaliable, currentState: %s", C105385g.Fx0().mo150083a());
                        if (iPCallManager4.mo150067j(3, 5)) {
                            iPCallManager4.mo150066i(3, (String) null, str2, i4);
                        }
                    }
                }
                return true;
            case 5:
                Log.m105924i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, other side user shutdown");
                C105384b bVar6 = this.f313251i;
                if (bVar6 != null) {
                    IPCallManager iPCallManager5 = (IPCallManager) bVar6;
                    Log.m105925i("MicroMsg.IPCallManager", "onShutdownByOtherSide, currentState: %s", C105385g.Fx0().mo150083a());
                    if (iPCallManager5.mo150060c(10, 0, 32)) {
                        C105379e eVar3 = iPCallManager5.f313219d;
                        if (eVar3 != null) {
                            C105420i2 i2Var2 = (C105420i2) eVar3;
                            Log.m105918d("MicroMsg.TalkUIController", "onOthersideShutdown");
                            i2Var2.mo150160b();
                            i2Var2.mo150165g(10);
                            ((MMNotification) C97625j3.m125816f()).mo93207e(42);
                            C105420i2.C105422b bVar7 = i2Var2.f313453z;
                            if (bVar7 != null) {
                                MMHandlerThread.postToMainThreadDelayed(new C105431u1((IPCallTalkUI) bVar7), 3000);
                            }
                        } else {
                            C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.fvm), 1).show();
                        }
                    }
                }
                return true;
            case 6:
                Log.m105924i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, shutdown overdue");
                C108828c cVar4 = this.f313260u;
                cVar4.f325911p = true;
                C105384b bVar8 = this.f313251i;
                if (bVar8 != null) {
                    ((IPCallManager) bVar8).mo150062e(cVar4.f325902g, cVar4.f325905j, cVar4.f325903h, cVar4.f325904i);
                }
                return true;
            default:
                Log.m105925i("MicroMsg.IPCallSvrLogic", "handleSyncStatus, do nothing:%d", Integer.valueOf(i));
                return false;
        }
    }

    /* renamed from: l */
    public final void mo150097l(boolean z, int i) {
        int i2;
        Log.m105925i("MicroMsg.IPCallSvrLogic", "handleUserSelfShutdown, success: %b, isFromNotify: %b", Boolean.valueOf(z), Boolean.valueOf(this.f313255p.f330393g));
        if (!z && i < 0 && (i2 = this.f313247e) < 1) {
            int i3 = i2 + 1;
            this.f313247e = i3;
            Log.m105925i("MicroMsg.IPCallSvrLogic", "shutdown failed, retry count: %d, isFromNotify: %b", Integer.valueOf(i3), Boolean.valueOf(this.f313255p.f330393g));
            this.f313255p.mo85903j(this.f313260u);
        }
    }

    /* renamed from: m */
    public void mo150098m(int i) {
        if (!this.f313260u.f325895M) {
            Log.m105920e("MicroMsg.IPCallSvrLogic", "shutdownIPCall, user not accept");
        }
        Log.m105925i("MicroMsg.IPCallSvrLogic", "shutdownIPCall, roomId: %d, inviteId: %d", Integer.valueOf(this.f313260u.f325896a), Integer.valueOf(this.f313260u.f325899d));
        this.f313250h = true;
        this.f313256q.mo159934p();
        this.f313253n.mo159934p();
        C110492h hVar = this.f313255p;
        hVar.f330393g = false;
        hVar.f330392f = i;
        hVar.mo85903j(this.f313260u);
        this.f313258s.mo85903j(this.f313260u);
    }
}
