package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51344t43;
import te3.C51495u43;

/* renamed from: com.tencent.mm.plugin.sns.model.x */
public class C30418x extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f82046d;

    /* renamed from: e */
    public C11385n f82047e;

    /* renamed from: f */
    public final int f82048f;

    public C30418x(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51344t43();
        bVar.f127067b = new C51495u43();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_checkgrant";
        bVar.f127069d = 2842;
        this.f82048f = i;
        C47350c a = bVar.mo72403a();
        this.f82046d = a;
        C51344t43 t432 = (C51344t43) a.f127055a.f127080a;
        C86709a0.m107528h();
        int g = C86709a0.m107523b().mo121110g();
        t432.f141955d = g;
        t432.f141956e = i;
        Log.m105925i("MicroMsg.NetSceneOauthCheckGrant", "init useruin:%d, bizuin:%d", Integer.valueOf(g), Integer.valueOf(t432.f141956e));
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        this.f82047e = nVar;
        int dispatch = dispatch(gVar, this.f82046d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        return 2842;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
        Log.m105924i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            C51495u43 u432 = (C51495u43) ((C47350c) uVar).f127056b.f127083a;
            boolean z = false;
            Log.m105925i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd bizUin:%d, status:%d", Integer.valueOf(this.f82048f), Integer.valueOf(u432.f142595d));
            if (this.f82048f == -1216949095) {
                C86709a0.m107528h();
                C85801v1 i4 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_WEISHI_BOOLEAN_SYNC;
                if (u432.f142595d == 1) {
                    z = true;
                }
                i4.mo119677K(aVar, Boolean.valueOf(z));
            }
        }
        this.f82047e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneOauthCheckGrant");
    }
}
