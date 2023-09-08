package com.tencent.p014mm.modelsimple;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.p014mm.network.C114766b;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C116728e2;
import eb0.C116746l3;
import eb0.C7627m3;
import f40.C86709a0;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import p823sg.C77710q;
import qe3.C118186n;
import qe3.C118187o;
import qe3.C89625d;
import te3.C118420aa;
import te3.C118442l8;
import te3.C49227e33;
import te3.C49510g33;
import te3.C49569gj3;
import te3.C50270lj;
import te3.C50366m8;
import te3.C51018qv3;
import te3.C52114yg2;
import te3.C64572n8;
import te3.C64604o8;
import te3.ay4;
import te3.i45;
import te3.xk4;

/* renamed from: com.tencent.mm.modelsimple.j */
public class C114743j extends C117747y implements C1311n {

    /* renamed from: d */
    public final C114799u f344009d;

    /* renamed from: e */
    public C11385n f344010e;

    public C114743j() {
        C114744k kVar = new C114744k();
        this.f344009d = kVar;
        C118186n nVar = (C118186n) kVar.getReqObj();
        C118187o oVar = (C118187o) kVar.getRespObj();
        C118442l8 l8Var = new C118442l8();
        C64604o8 o8Var = new C64604o8();
        C64572n8 n8Var = nVar.f353307a;
        n8Var.f184444d = o8Var;
        n8Var.f184445e = l8Var;
        l8Var.f354114w = new C49569gj3();
        String a = C114766b.f344135e.mo174416a();
        if (!TextUtils.isEmpty(a)) {
            C49569gj3 gj32 = l8Var.f354114w;
            C114766b bVar = C114766b.f344135e;
            bVar.mo174417b();
            gj32.f134078d = bVar.f344136a.f134078d;
            C49569gj3 gj33 = l8Var.f354114w;
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(a.getBytes(StandardCharsets.ISO_8859_1));
            gj33.f134079e = qv32;
            Log.m105924i("MicroMsg.MMDisasterAuth", "disaster auth add public key , length " + a.length());
        } else {
            C49569gj3 gj34 = l8Var.f354114w;
            gj34.f134078d = 0;
            C51018qv3 qv33 = new C51018qv3();
            qv33.mo73350k(new byte[0]);
            gj34.f134079e = qv33;
            Log.m105920e("MicroMsg.MMDisasterAuth", "get sign key failed");
        }
        SharedPreferences a2 = C7627m3.m7760a();
        String string = a2.getString("_auth_key", "");
        Object[] objArr = new Object[1];
        int i = -1;
        objArr[0] = Integer.valueOf(string == null ? -1 : string.length());
        Log.m105925i("MicroMsg.MMDisasterAuth", "disasterauths KEY_SP_SUFFIX keyStr[%s]", objArr);
        byte[] decodeHexString = Util.decodeHexString(string);
        C50366m8 m8Var = new C50366m8();
        if (!Util.isNullOrNil(decodeHexString)) {
            C51018qv3 qv34 = new C51018qv3();
            qv34.mo73350k(decodeHexString);
            l8Var.f354099e = qv34;
            Log.m105925i("MicroMsg.MMDisasterAuth", "disasterauths keyBuf[%s, %s]", Integer.valueOf(qv34.f140574f.f257327a.length), Integer.valueOf(decodeHexString.length));
            try {
                m8Var.parseFrom(decodeHexString);
            } catch (IOException e) {
                C117407d.INSTANCE.idkeyStat(148, 15, 1, false);
                Log.printErrStackTrace("MicroMsg.MMDisasterAuth", e, "summerauthkey Failed parse autoauthkey buf", new Object[0]);
            }
        } else {
            C117407d.INSTANCE.idkeyStat(148, 16, 1, false);
            C51018qv3 qv35 = new C51018qv3();
            qv35.mo73350k(new byte[0]);
            l8Var.f354099e = qv35;
        }
        C51018qv3 qv36 = m8Var.f137897d;
        if (qv36 != null) {
            o8Var.f184632d = qv36;
            Log.m105929w("MicroMsg.MMDisasterAuth", "disasterauths AesEncryptKey [%s][%s]", Integer.valueOf(qv36.f140574f.f257327a.length), Util.dumpHex(m8Var.f137897d.f140574f.f257327a));
        } else {
            C117407d.INSTANCE.idkeyStat(148, 17, 1, false);
            C51018qv3 qv37 = new C51018qv3();
            qv37.mo73350k(new byte[0]);
            o8Var.f184632d = qv37;
            Log.m105928w("MicroMsg.MMDisasterAuth", "disasterauths AesEncryptKey null!");
        }
        C86709a0.m107528h();
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(2, (Object) null));
        C86709a0.m107528h();
        C77710q qVar = new C77710q(Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null), 0));
        nullAsNil = Util.isNullOrNil(nullAsNil) ? qVar.toString() : nullAsNil;
        Log.m105919d("MicroMsg.MMDisasterAuth", "disasterauths updateVersion:%d, clientVersion:%d", Integer.valueOf(a2.getInt("key_auth_update_version", 0)), Integer.valueOf(C89625d.f257841g));
        nVar.setSceneStatus(2);
        C118420aa aaVar = new C118420aa();
        aaVar.f353910i = 1;
        C51018qv3 qv38 = new C51018qv3();
        qv38.mo73350k(new byte[0]);
        aaVar.f353909h = qv38;
        C51018qv3 qv39 = new C51018qv3();
        qv39.mo73350k(new byte[0]);
        aaVar.f353908g = qv39;
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
            Log.m105920e("MicroMsg.MMDisasterAuth", "disasterauths build autoauth Req  , failed  acc not ready");
            return;
        }
        C86709a0.m107528h();
        byte[] d = C86709a0.m107523b().mo121113k().mo182474d(qVar.longValue(), "", false);
        l8Var.f354113v = MMApplicationContext.getApplicationId();
        Object[] objArr2 = new Object[5];
        objArr2[0] = nullAsNil;
        objArr2[1] = qVar;
        objArr2[2] = Integer.valueOf(d != null ? d.length : i);
        objArr2[3] = d == null ? "null" : Util.secPrint(Util.dumpHex(d));
        objArr2[4] = l8Var.f354113v;
        Log.m105925i("MicroMsg.MMDisasterAuth", "disasterauths loginbuf username:%s, qq:%s, len:%d, content:[%s], AndroidPackageName:%s", objArr2);
        C51018qv3 qv310 = new C51018qv3();
        qv310.mo73350k(Util.isNullOrNil(d) ? new byte[0] : d);
        aaVar.f353905d = qv310;
        l8Var.f354098d = aaVar;
        nVar.f353308b = nullAsNil;
        C114766b.C114767a aVar = new C114766b.C114767a();
        aVar.f344141b = C114766b.f344135e.mo174416a();
        C114766b bVar2 = C114766b.f344135e;
        bVar2.mo174417b();
        aVar.f344140a = bVar2.f344137b;
        nVar.setCGiVerifyKey(aVar);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f344010e = nVar;
        C117407d.INSTANCE.idkeyStat(148, 126, 1, false);
        return dispatch(gVar, this.f344009d, this);
    }

    public int getType() {
        ((C114744k) this.f344009d).getClass();
        return 3941;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C50270lj ljVar;
        C49227e33 e332;
        C52114yg2 yg22;
        int i4 = i2;
        int i5 = i3;
        xk4 xk4 = ((C118187o) uVar.getRespObj()).f353309a;
        if (xk4 != null) {
            C49510g33 g332 = xk4.f354540g;
            if (!(g332 == null || (ljVar = g332.f133828f) == null || (e332 = g332.f133827e) == null || (yg22 = g332.f133826d) == null)) {
                C116746l3.m164676c(false, ljVar, e332, yg22, false, 0);
            }
            C116728e2.m164638a(xk4.f354541h);
            C116728e2.m164640c(xk4.f354542i);
        }
        this.f344010e.onSceneEnd(i4, i5, str, this);
        if (i5 == 0 && i4 == 0) {
            C117407d.INSTANCE.idkeyStat(148, 127, 1, false);
        } else {
            C117407d.INSTANCE.idkeyStat(148, 128, 1, false);
        }
    }
}
