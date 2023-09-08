package com.tencent.p014mm.modelimage;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75569c4;
import f40.C86709a0;
import f62.C75700k0;
import f62.C75707s0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p1081gi.C98121d;
import p158gt.C98205r;
import p215oo.C77032h;
import pc0.C100760a0;
import pc0.C77068x;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.on4;
import te3.pn4;

/* renamed from: com.tencent.mm.modelimage.e0 */
public class C92825e0 extends C117747y implements C1311n, C98205r, C100760a0.C100762d {

    /* renamed from: d */
    public C11385n f267328d;

    /* renamed from: e */
    public final C47350c f267329e;

    /* renamed from: f */
    public C92836k f267330f;

    /* renamed from: g */
    public C100760a0.C100764f f267331g;

    /* renamed from: h */
    public C98205r.C98206a f267332h;

    public C92825e0(int i, on4 on4, C92836k kVar, C98121d dVar, C98205r.C98206a aVar, long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new on4();
        bVar.f127067b = new pn4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/uploadmsgimg";
        bVar.f127069d = 110;
        bVar.f127070e = 9;
        bVar.f127071f = 1000000009;
        C47350c a = bVar.mo72403a();
        this.f267329e = a;
        this.f267332h = aVar;
        this.f267330f = kVar;
        on4 on42 = (on4) a.f127055a.f127080a;
        on42.f299056e = on4.f299056e;
        on42.f299057f = on4.f299057f;
        on42.f299055d = on4.f299055d;
        on42.f299062n = on4.f299062n;
        on42.f299063o = on4.f299063o;
        on42.f299042H = on4.f299042H;
        BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(C92837k0.Bx0().mo127174TY(kVar.f267380g, "", "", true));
        on42.f299037C = imageOptions != null ? imageOptions.outWidth : 0;
        on42.f299036B = imageOptions != null ? imageOptions.outHeight : 0;
        on42.f299074z = dVar.field_fileId;
        int i2 = dVar.field_thumbimgLength;
        on42.f299035A = i2;
        on42.f299058g = i2;
        on42.f299059h = 0;
        on42.f299060i = i2;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(new byte[0]);
        on42.f299061j = qv32;
        on42.f299044J = on4.f299044J;
        on42.f299047M = on4.f299047M;
        on42.f299045K = on4.f299045K;
        on42.f299046L = on4.f299046L;
        on42.f299071w = 1;
        on42.f299050Q = null;
        on42.f299053T = on4.f299053T;
        if (dVar.mo137409b()) {
            Log.m105925i("MicroMsg.NetSceneUploadMsgImgForCdn", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s]", Boolean.valueOf(dVar.field_upload_by_safecdn), Integer.valueOf(dVar.field_UploadHitCacheType), Integer.valueOf(dVar.field_filecrc), dVar.field_aesKey);
            on42.f299043I = 1;
            on42.f299070v = "";
            on42.f299038D = "";
        } else {
            String str = dVar.field_aesKey;
            on42.f299070v = str;
            on42.f299038D = str;
        }
        on42.f299064p = on4.f299064p;
        if (on4.f299064p == 1) {
            on42.f299072x = (int) dVar.field_fileLength;
            on42.f299073y = dVar.field_midimgLength;
            String str2 = dVar.field_fileId;
            on42.f299068t = str2;
            on42.f299069u = str2;
        } else {
            on42.f299072x = 0;
            on42.f299073y = (int) dVar.field_fileLength;
            on42.f299068t = "";
            on42.f299069u = dVar.field_fileId;
        }
        on42.f299041G = dVar.field_filecrc;
        on42.f299040F = dVar.field_filemd5;
        if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(C48374j0.m53718g(on4.f299057f))) {
            on42.f299048N = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69662L3(C48374j0.m53718g(on4.f299057f));
        }
        if (j > 0) {
            on42.f299054U = (int) j;
        }
        Log.m105925i("MicroMsg.NetSceneUploadMsgImgForCdn", "summersafecdn NetSceneUploadMsgImgForCdn MsgForwardType[%d], hitmd5[%d], key[%s], crc[%d]", Integer.valueOf(on42.f299042H), Integer.valueOf(on42.f299043I), Util.secPrint(on42.f299070v), Integer.valueOf(on42.f299041G));
    }

    public void cancel() {
        super.cancel();
        Log.m105920e("MicroMsg.NetSceneUploadMsgImgForCdn", "cancel");
        C98205r.C98206a aVar = this.f267332h;
        if (aVar != null) {
            aVar.mo103302a(0, 0, 3, -1, "");
        }
    }

    /* renamed from: d1 */
    public void mo127073d1(C100760a0.C100764f fVar) {
        this.f267331g = fVar;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Class cls = C77032h.class;
        this.f267328d = nVar;
        if (this.f267331g != null) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f267330f.f267387n);
            ((C77032h) C86312j.m106911c(cls)).mo107356AR(b002, this.f267331g.f295206t);
            ((C77032h) C86312j.m106911c(cls)).mo107357DR();
            ((on4) this.f267329e.f127055a.f127080a).f299063o = b002.f230724G;
        }
        Log.m105925i("MicroMsg.NetSceneUploadMsgImgForCdn", "cdntra req[%s]", ((on4) this.f267329e.f127055a.f127080a).toString());
        Log.m105919d("MicroMsg.NetSceneUploadMsgImgForCdn", "Req MsgSource %s", ((on4) this.f267329e.f127055a.f127080a).f299063o);
        return dispatch(gVar, this.f267329e, this);
    }

    public int getDispatchInterceptRet(C114770g gVar, C114799u uVar, C1311n nVar) {
        if (C77068x.m92996a(this.f267330f.f267387n, this)) {
            return -126;
        }
        return super.getDispatchInterceptRet(gVar, uVar, nVar);
    }

    public int getType() {
        return 110;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneUploadMsgImgForCdn", "onGYNetEnd errtype:" + i2 + " errcode:" + i3);
        pn4 pn4 = (pn4) ((C47350c) uVar).f127056b.f127083a;
        Log.m105925i("MicroMsg.NetSceneUploadMsgImgForCdn", "onGYNetEnd createtime:%d msgId:%d ", Integer.valueOf(pn4.f139852n), Long.valueOf(pn4.f139853o));
        if (i2 == 4 || (i2 == 0 && i3 == 0)) {
            ((C75707s0) C86312j.m106911c(C75707s0.class)).mo96077Vq(pn4.f139857s);
        }
        if (this.f267332h != null) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f267330f.f267387n);
            C75569c4.m90666L(b002, pn4.f139856r, false);
            this.f267332h.mo103302a(pn4.f139853o, pn4.f139852n, i2, i3, b002.f230724G);
        }
        this.f267328d.onSceneEnd(0, 0, "", this);
    }
}
