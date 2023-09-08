package ob0;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114783m;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C114800v;
import com.tencent.p014mm.network.C26879f;
import com.tencent.p014mm.pointers.PByteArray;
import com.tencent.p014mm.protocal.MMProtocalJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116734h6;
import eb0.C116746l3;
import eb0.C7627m3;
import eb0.l3$$a;
import eb0.l3$$b;
import f40.C86709a0;
import java.io.IOException;
import kj2.C117407d;
import p261wl.C38166b;
import p823sg.C77710q;
import qe3.C101127f;
import qe3.C118180j;
import qe3.C118181k;
import qe3.C118184l;
import qe3.C118185m;
import qe3.C118188q;
import qe3.C118189r;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118194t0;
import qe3.C118195u0;
import qe3.C89625d;
import qe3.C89626p;
import sf0.C48374j0;
import te3.C118420aa;
import te3.C118422c1;
import te3.C118442l8;
import te3.C118458pu2;
import te3.C118481y7;
import te3.C49510g33;
import te3.C50366m8;
import te3.C51018qv3;
import te3.C64306d60;
import te3.C64572n8;
import te3.C64604o8;
import te3.C64666qu2;
import te3.C64691ru2;
import te3.C64819wy3;
import te3.ay4;
import te3.i45;
import te3.xk4;

/* renamed from: ob0.j0 */
public class C117739j0 extends C114800v.C114801a {

    /* renamed from: e */
    public C114799u f352092e;

    /* renamed from: f */
    public C118180j f352093f;

    /* renamed from: g */
    public C118181k f352094g;

    /* renamed from: h */
    public MMHandler f352095h;

    /* renamed from: ob0.j0$a */
    public class C117740a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f352096d;

        /* renamed from: e */
        public final /* synthetic */ int f352097e;

        /* renamed from: f */
        public final /* synthetic */ String f352098f;

        public C117740a(int i, int i2, String str) {
            this.f352096d = i;
            this.f352097e = i2;
            this.f352098f = str;
        }

        public void run() {
            C118481y7 y7Var;
            Log.m105919d("MicroMsg.RemoteReqResp", "summerauth doAutoAuthEnd type:%d, stack[%s]", Integer.valueOf(C117739j0.this.f352092e.getType()), Util.getStack());
            C118191s sVar = (C118191s) C117739j0.this.f352092e.getReqObj();
            C118193t tVar = (C118193t) C117739j0.this.f352092e.getRespObj();
            if (tVar == null) {
                Log.m105922f("MicroMsg.RemoteReqResp", "null auth.resp");
                return;
            }
            C89626p pVar = C89626p.C89627a.f257849a;
            int i = this.f352096d;
            int i2 = this.f352097e;
            String str = this.f352098f;
            ((C116746l3) pVar).getClass();
            if (!C86709a0.m107522a()) {
                Log.m105920e("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd but account not ready");
                return;
            }
            xk4 xk4 = tVar.f353315a;
            if (xk4 == null || (y7Var = xk4.f354538e) == null) {
                Log.m105925i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto not set as ret:%s", Integer.valueOf(tVar.getRetCode()));
            } else {
                int i3 = y7Var.f354602z;
                Log.m105925i("MicroMsg.MMReqRespAuth", "summerauth mmtls auto:%s", Integer.valueOf(i3));
                C86709a0.m107528h();
                C86709a0.m107535s().f251803a.mo119664f(47, Integer.valueOf(i3));
                C114770g gVar = C86709a0.m107529k().f251779b.f256809d;
                if (gVar != null) {
                    gVar.mo55468b3((i3 & 1) == 0);
                }
            }
            Log.m105925i("MicroMsg.MMReqRespAuth", "summerauth onAutoAuthEnd errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C118422c1 c1Var = xk4.f354539f;
                if (c1Var != null) {
                    C116734h6.m164660p(c1Var.f353945w);
                    C116734h6.m164658n(xk4.f354539f.f353946x);
                    C116734h6.m164654j(xk4.f354539f.f353947y);
                }
                C38166b.m41755b(l3$$b.class, new l3$$a(sVar, tVar));
            } else if (i == 4 && i2 == -301) {
                C117407d.INSTANCE.idkeyStat(148, 18, 1, false);
                Log.m105924i("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC");
                if (xk4 == null || xk4.f354540g == null) {
                    Log.m105928w("MicroMsg.MMReqRespAuth", "dkidc onAutoAuthEnd RedirectIDC but NetworkSectResp is null");
                    return;
                }
                C49510g33 g332 = tVar.f353315a.f354540g;
                C116746l3.m164676c(true, g332.f133828f, g332.f133827e, g332.f133826d, true, g332.f133829g);
            } else {
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(148, C101127f.f296015a ? 119 : 120, 1, false);
                dVar.idkeyStat(148, C101127f.f296016b ? 121 : 122, 1, false);
            }
        }
    }

    /* renamed from: ob0.j0$b */
    public class C117741b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C114783m f352100d;

        /* renamed from: e */
        public final /* synthetic */ int f352101e;

        /* renamed from: f */
        public final /* synthetic */ int f352102f;

        public C117741b(C114783m mVar, int i, int i2) {
            this.f352100d = mVar;
            this.f352101e = i;
            this.f352102f = i2;
        }

        public void run() {
            char c;
            int i = C7627m3.m7760a().getInt("key_auth_update_version", 0);
            int i2 = i <= 637665332 ? C101127f.f296015a ? 252 : 701 : C101127f.f296015a ? 763 : 702;
            if (i == 0) {
                SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences("ticket_prefs", 4);
                if (Util.isNullOrNil(sharedPreferences.getString("_auth_ticket", ""))) {
                    i2 = C101127f.f296015a ? 763 : 702;
                    Log.m105924i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth revise to autoauth");
                    C117407d.INSTANCE.idkeyStat(148, 50, 1, true);
                } else {
                    C117407d.INSTANCE.idkeyStat(148, 49, 1, true);
                    Log.m105925i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth keep manual as old [%s]", Util.secPrint(sharedPreferences.getString("_auth_ticket", "")));
                }
            }
            Log.m105925i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth updateVersion:%d, clientVersion:%d WLOGIN_BUG_VERSION:%d, newAuthType:%d", Integer.valueOf(i), Integer.valueOf(C89625d.f257841g), 637665332, Integer.valueOf(i2));
            if (i2 == 252 || i2 == 701) {
                C117407d dVar = C117407d.INSTANCE;
                dVar.idkeyStat(148, 48, 1, true);
                dVar.idkeyStat(148, C101127f.f296015a ? 115 : 116, 1, true);
                dVar.idkeyStat(148, C101127f.f296016b ? 117 : 118, 1, true);
            } else {
                C117407d dVar2 = C117407d.INSTANCE;
                dVar2.idkeyStat(148, C101127f.f296015a ? 111 : 112, 1, true);
                dVar2.idkeyStat(148, C101127f.f296016b ? 113 : 114, 1, true);
            }
            int i3 = ((C117739j0.this.f352092e.getType() == 702 || C117739j0.this.f352092e.getType() == 701 || C117739j0.this.f352092e.getType() == 763 || C117739j0.this.f352092e.getType() == 252) && ((C118193t) C117739j0.this.f352092e.getRespObj()).f353321g == 2) ? 1 : 0;
            Log.m105925i("MicroMsg.RemoteReqResp", "summerauth dealWithAutoAuth old type:%d new auth type:%d, reqFlag:%d", Integer.valueOf(C117739j0.this.f352092e.getType()), Integer.valueOf(i2), Integer.valueOf(i3));
            ((C116746l3) C89626p.C89627a.f257849a).getClass();
            C116746l3 l3Var = new C116746l3(i2);
            Log.m105925i("MicroMsg.MMReqRespAuth", "summerauth autoAuthReq authReqFlag:%d, this:%d, stack:%s", Integer.valueOf(i3), Integer.valueOf(l3Var.hashCode()), Util.getStack());
            C118191s sVar = (C118191s) l3Var.getReqObj();
            C118193t tVar = l3Var.f350049c;
            SharedPreferences a = C7627m3.m7760a();
            int i4 = a.getInt("key_auth_update_version", 0);
            Log.m105919d("MicroMsg.MMReqRespAuth", "summerauth updateVersion:%d, clientVersion:%d", Integer.valueOf(i4), Integer.valueOf(C89625d.f257841g));
            if (i4 < C89625d.f257841g) {
                int i5 = l3Var.f350047a;
                sVar.setSceneStatus((i5 == 702 || i5 == 763) ? 12 : 16);
                C117407d.INSTANCE.idkeyStat(148, l3Var.f350047a == 702 ? 14 : 13, 1, false);
            } else {
                int i6 = l3Var.f350047a;
                sVar.setSceneStatus((i6 == 702 || i6 == 763) ? 2 : 1);
            }
            C118420aa aaVar = new C118420aa();
            aaVar.f353910i = i3;
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(new byte[0]);
            aaVar.f353909h = qv32;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(new byte[0]);
            aaVar.f353908g = qv33;
            ay4 ay4 = new ay4();
            aaVar.f353906e = ay4;
            ay4.f297891e = "";
            ay4.f297890d = "";
            ay4.f297892f = "";
            i45 i45 = new i45();
            aaVar.f353907f = i45;
            i45.f332071e = "";
            i45.f332070d = "";
            if (!C86709a0.m107522a()) {
                Log.m105920e("MicroMsg.MMReqRespAuth", "autoAuthReq build autoauth Req  , failed  acc not ready");
                l3Var = null;
            } else {
                C86709a0.m107528h();
                String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
                C86709a0.m107528h();
                C77710q qVar = new C77710q(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null), 0));
                if (Util.isNullOrNil(nullAsNil)) {
                    nullAsNil = qVar.toString();
                }
                String str = nullAsNil;
                C86709a0.m107528h();
                C117744o0 k = C86709a0.m107523b().mo121113k();
                String str2 = str;
                long longValue = qVar.longValue();
                int i7 = l3Var.f350047a;
                byte[] d = k.mo182474d(longValue, "", i7 == 252 || i7 == 701);
                Object[] objArr = new Object[4];
                objArr[0] = str2;
                objArr[1] = qVar;
                objArr[2] = Integer.valueOf(d == null ? -1 : d.length);
                objArr[3] = d == null ? "null" : Util.secPrint(Util.dumpHex(d));
                Log.m105925i("MicroMsg.MMReqRespAuth", "summerauth loginbuf username:%s, qq:%s, len:%d, content:[%s]", objArr);
                C51018qv3 qv34 = new C51018qv3();
                if (Util.isNullOrNil(d)) {
                    d = new byte[0];
                }
                qv34.mo73350k(d);
                aaVar.f353905d = qv34;
                int i8 = l3Var.f350047a;
                if (i8 == 702 || i8 == 763) {
                    String str3 = str2;
                    C118184l lVar = (C118184l) sVar;
                    C118185m mVar = (C118185m) tVar;
                    C118442l8 l8Var = new C118442l8();
                    C64604o8 o8Var = new C64604o8();
                    C64572n8 n8Var = lVar.f353305b;
                    n8Var.f184444d = o8Var;
                    n8Var.f184445e = l8Var;
                    String string = a.getString("_auth_key", "");
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = Integer.valueOf(string == null ? -1 : string.length());
                    Log.m105925i("MicroMsg.MMReqRespAuth", "summerauths KEY_SP_SUFFIX keyStr[%s]", objArr2);
                    byte[] decodeHexString = Util.decodeHexString(string);
                    C50366m8 m8Var = new C50366m8();
                    if (!Util.isNullOrNil(decodeHexString)) {
                        C51018qv3 qv35 = new C51018qv3();
                        qv35.mo73350k(decodeHexString);
                        l8Var.f354099e = qv35;
                        Log.m105925i("MicroMsg.MMReqRespAuth", "summerauths keyBuf[%s, %s]", Integer.valueOf(qv35.f140574f.f257327a.length), Integer.valueOf(decodeHexString.length));
                        try {
                            m8Var.parseFrom(decodeHexString);
                        } catch (IOException e) {
                            C117407d.INSTANCE.idkeyStat(148, 15, 1, false);
                            Log.printErrStackTrace("MicroMsg.MMReqRespAuth", e, "summerauthkey Failed parse autoauthkey buf", new Object[0]);
                        }
                    } else {
                        C117407d.INSTANCE.idkeyStat(148, 16, 1, false);
                        C51018qv3 qv36 = new C51018qv3();
                        qv36.mo73350k(new byte[0]);
                        l8Var.f354099e = qv36;
                    }
                    C51018qv3 qv37 = m8Var.f137897d;
                    if (qv37 != null) {
                        o8Var.f184632d = qv37;
                        Log.m105929w("MicroMsg.MMReqRespAuth", "summerauthkey AesEncryptKey [%s][%s]", Integer.valueOf(qv37.f140574f.f257327a.length), Util.dumpHex(m8Var.f137897d.f140574f.f257327a));
                        c = 0;
                    } else {
                        C117407d.INSTANCE.idkeyStat(148, 17, 1, false);
                        C51018qv3 qv38 = new C51018qv3();
                        c = 0;
                        qv38.mo73350k(new byte[0]);
                        o8Var.f184632d = qv38;
                        Log.m105928w("MicroMsg.MMReqRespAuth", "summerauthkey AesEncryptKey null!");
                    }
                    l8Var.f354098d = aaVar;
                    String applicationId = MMApplicationContext.getApplicationId();
                    l8Var.f354113v = applicationId;
                    Object[] objArr3 = new Object[1];
                    objArr3[c] = applicationId;
                    Log.m105925i("MicroMsg.MMReqRespAuth", "aesReq.AndroidPackageName [%s]", objArr3);
                    lVar.f353306c = str3;
                    mVar.f353316b = str3;
                } else {
                    C118189r rVar = (C118189r) tVar;
                    C64691ru2 ru22 = new C64691ru2();
                    C118458pu2 pu22 = new C118458pu2();
                    C64666qu2 qu22 = ((C118188q) sVar).f353310b;
                    qu22.f185080d = ru22;
                    qu22.f185081e = pu22;
                    pu22.f354269z = 2;
                    pu22.f354250d = aaVar;
                    ru22.f185297f = str2;
                    C86709a0.m107528h();
                    String nullAsNil2 = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(3, (Object) null));
                    C86709a0.m107528h();
                    ru22.f185298g = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(19, (Object) null));
                    ru22.f185299h = nullAsNil2;
                }
            }
            try {
                this.f352100d.mo174439jM(l3Var == null ? null : new C117739j0(l3Var, C117739j0.this.f352095h), this.f352101e, this.f352102f, "");
            } catch (RemoteException e2) {
                Log.m105921e("MicroMsg.RemoteReqResp", "exception:%s", Util.stackTraceToString(e2));
            }
        }
    }

    /* renamed from: ob0.j0$c */
    public class C117742c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C114783m f352104d;

        /* renamed from: e */
        public final /* synthetic */ int f352105e;

        /* renamed from: f */
        public final /* synthetic */ int f352106f;

        public C117742c(C114783m mVar, int i, int i2) {
            this.f352104d = mVar;
            this.f352105e = i;
            this.f352106f = i2;
        }

        public void run() {
            try {
                this.f352104d.mo174439jM(new C117739j0(new C47356x(), C117739j0.this.f352095h), this.f352105e, this.f352106f, "");
            } catch (RemoteException e) {
                Log.m105921e("MicroMsg.RemoteReqResp", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C117739j0(C114799u uVar) {
        this(uVar, Looper.myLooper() == null ? new MMHandler(Looper.getMainLooper()) : new MMHandler());
    }

    /* renamed from: FG */
    public void mo174463FG(C114783m mVar, int i, int i2) {
        this.f352095h.post(new C117741b(mVar, i, i2));
    }

    /* renamed from: YQ */
    public void mo174464YQ(C114783m mVar, int i, int i2, String str) {
        this.f352095h.post(new C117740a(i, i2, str));
    }

    public boolean getIsLongPolling() {
        return this.f352092e.getIsLongPolling();
    }

    public boolean getIsUserCmd() {
        return this.f352092e.getIsUserCmd();
    }

    public int getLongPollingTimeout() {
        return this.f352092e.getLongPollingTimeout();
    }

    public int getNewExtFlags() {
        return this.f352092e.getNewExtFlags();
    }

    public int getOptions() {
        return this.f352092e.getOptions();
    }

    public C118180j getReqObj() {
        return this.f352093f;
    }

    public C118181k getRespObj() {
        return this.f352094g;
    }

    public int getTimeOut() {
        return this.f352092e.getTimeOut();
    }

    public byte[] getTransHeader() {
        return this.f352092e.getTransHeader();
    }

    public int getType() {
        return this.f352092e.getType();
    }

    public String getUri() {
        return this.f352092e.getUri();
    }

    public String h30() {
        return this.f352092e.getReqObj().getCgiVerifyPrivateKey();
    }

    public boolean isSingleSession() {
        return this.f352092e.isSingleSession();
    }

    /* renamed from: kD */
    public void mo174478kD(C26879f fVar, C114783m mVar, int i, int i2) {
        this.f352095h.post(new C117742c(mVar, i, i2));
    }

    /* renamed from: o8 */
    public int mo174479o8() {
        return this.f352092e.hashCode();
    }

    public String pr0() {
        return this.f352092e.getReqObj().getCgiVerifyPublicKey();
    }

    public void setEncryptAlgo(int i) {
        this.f352092e.setEncryptAlgo(i);
    }

    public void setReqHost(String str) {
        this.f352092e.setReqHost(str);
    }

    public void setSingleSession(boolean z) {
        this.f352092e.setSingleSession(z);
    }

    /* renamed from: uw */
    public boolean mo174484uw() {
        return this.f352092e.keepAlive();
    }

    /* renamed from: zy */
    public int mo174485zy() {
        int i;
        int type = getType();
        Log.m105919d("MicroMsg.RemoteReqResp", "summerauth decodeAndRetriveAccInfo type:%d", Integer.valueOf(type));
        if (type == 126) {
            C114799u uVar = this.f352092e;
            C118194t0 t0Var = (C118194t0) uVar.getReqObj();
            C118195u0 u0Var = (C118195u0) uVar.getRespObj();
            t0Var.getClass();
            Log.m105925i("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo type:%d, stack[%s]", 126, Util.getStack());
            int i2 = u0Var.f353329f;
            if (i2 != 0) {
                Log.m105919d("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo resp just decoded and ret result:%d", Integer.valueOf(i2));
                i = u0Var.f353329f;
            } else {
                C64819wy3 wy32 = u0Var.f353324a.f354409J;
                if (wy32 != null) {
                    int i3 = wy32.f186238g;
                    C64306d60 d602 = wy32.f186236e;
                    byte[] d = C48374j0.m53715d(wy32.f186239h);
                    byte[] d2 = C48374j0.m53715d(wy32.f186240i);
                    byte[] d3 = C48374j0.m53715d(wy32.f186237f);
                    Object[] objArr = new Object[6];
                    objArr[0] = Integer.valueOf(d602.f182635e.f140572d);
                    objArr[1] = Integer.valueOf(d602.f182634d);
                    objArr[2] = Integer.valueOf(d3 == null ? -1 : d3.length);
                    objArr[3] = Util.secPrint(Util.dumpHex(d3));
                    objArr[4] = Util.secPrint(Util.dumpHex(d));
                    objArr[5] = Util.secPrint(Util.dumpHex(d2));
                    Log.m105919d("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key len:%d, nid:%d sessionKey len:%d, sessionKey：%s, clientSession[%s], serverSession[%s]", objArr);
                    byte[] d4 = C48374j0.m53715d(d602.f182635e);
                    byte[] bArr = t0Var.f353323b;
                    byte[] bArr2 = null;
                    if (!Util.isNullOrNil(d4)) {
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = Integer.valueOf(d4.length);
                        objArr2[1] = Util.secPrint(Util.dumpHex(d4));
                        objArr2[2] = Integer.valueOf(bArr == null ? -1 : bArr.length);
                        objArr2[3] = Util.secPrint(Util.dumpHex(bArr));
                        Log.m105919d("MicroMsg.MMReqRespReg2", "summerauth svrPubKey len:%d value:%s prikey len:%d, values:%s", objArr2);
                        PByteArray pByteArray = new PByteArray();
                        int computerKeyWithAllStr = MMProtocalJni.computerKeyWithAllStr(d602.f182634d, d4, bArr, pByteArray, 0);
                        bArr2 = pByteArray.value;
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = Integer.valueOf(computerKeyWithAllStr);
                        objArr3[1] = Integer.valueOf(bArr2 == null ? -1 : bArr2.length);
                        objArr3[2] = Util.secPrint(Util.dumpHex(bArr2));
                        Log.m105925i("MicroMsg.MMReqRespReg2", "summerauth ComputerKeyWithAllStr ret:%d, agreedECDHKey len: %d, values:%s", objArr3);
                    } else {
                        Log.m105928w("MicroMsg.MMReqRespReg2", "summerauth svr ecdh key is null!");
                    }
                    u0Var.f353325b = bArr2 != null ? bArr2 : new byte[0];
                    if ((i3 & 4) != 0) {
                        Log.m105918d("MicroMsg.MMReqRespReg2", "summerauth must decode session key");
                        if (!Util.isNullOrNil(bArr2)) {
                            byte[] aesDecrypt = MMProtocalJni.aesDecrypt(d3, bArr2);
                            Object[] objArr4 = new Object[4];
                            objArr4[0] = Integer.valueOf(d3 == null ? -1 : d3.length);
                            objArr4[1] = Util.dumpHex(d3);
                            objArr4[2] = Integer.valueOf(aesDecrypt == null ? -1 : aesDecrypt.length);
                            objArr4[3] = Util.secPrint(Util.dumpHex(aesDecrypt));
                            Log.m105919d("MicroMsg.MMReqRespReg2", "summerauth aesDecrypt sessionKey len:%d, value:%s, session len:%d, value:%s", objArr4);
                            if (!Util.isNullOrNil(aesDecrypt)) {
                                Log.m105919d("MicroMsg.MMReqRespReg2", "summerauth decode session key succ session:%s", Util.secPrint(Util.dumpHex(aesDecrypt)));
                                u0Var.mo182991b(aesDecrypt, d, d2);
                                u0Var.f353329f = 1;
                            } else {
                                Log.m105918d("MicroMsg.MMReqRespReg2", "summerauth decode session key failed ret null!");
                                u0Var.mo182991b(new byte[0], d, d2);
                                u0Var.f353329f = 2;
                            }
                        } else {
                            Log.m105918d("MicroMsg.MMReqRespReg2", "summerauth decode session key failed as agreedECDHKey is null!");
                            u0Var.mo182991b(new byte[0], d, d2);
                            u0Var.f353329f = 2;
                        }
                    } else {
                        Log.m105918d("MicroMsg.MMReqRespReg2", "summerauth not need decode session key");
                        u0Var.mo182991b(d3, d, d2);
                        u0Var.f353329f = 1;
                    }
                } else {
                    Log.m105918d("MicroMsg.MMReqRespReg2", "summerauth decodeAndRetriveAccInfo sect null and decode failed!");
                    u0Var.mo182991b(new byte[0], new byte[0], new byte[0]);
                    u0Var.f353329f = 2;
                }
                i = u0Var.f353329f;
            }
            return i;
        } else if (type == 252 || type == 763 || type == 701 || type == 702) {
            return C116746l3.m164675a(this.f352092e);
        } else {
            return -1;
        }
    }

    public C117739j0(C114799u uVar, MMHandler mMHandler) {
        this.f352092e = uVar;
        this.f352093f = new C100321i0(uVar.getReqObj(), uVar.getType());
        this.f352094g = new C117743k0(uVar.getRespObj(), uVar.getType());
        this.f352095h = mMHandler;
    }
}
