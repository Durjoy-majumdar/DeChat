package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C11765l0;
import te3.m84;
import te3.r84;
import te3.s84;

/* renamed from: com.tencent.mm.plugin.sns.model.n0 */
public class C43041n0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f116510d;

    /* renamed from: e */
    public int f116511e;

    /* renamed from: f */
    public long f116512f = 0;

    /* renamed from: g */
    public C11385n f116513g;

    public C43041n0(int i, long j, String str) {
        Log.m105918d("MicroMsg.NetSceneSnsTagOption", "opcode " + i + " snsTagId " + j + " tagName " + str);
        this.f116512f = j;
        this.f116511e = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new r84();
        bVar.f127067b = new s84();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnstagoption";
        bVar.f127069d = C82086j.CTRL_INDEX;
        bVar.f127070e = 114;
        bVar.f127071f = 1000000114;
        C47350c a = bVar.mo72403a();
        this.f116510d = a;
        r84 r84 = (r84) a.f127055a.f127080a;
        r84.f140764d = i;
        r84.f140765e = j;
        r84.f140766f = str;
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        this.f116513g = nVar;
        int dispatch = dispatch(gVar, this.f116510d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        return C82086j.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
        Log.m105918d("MicroMsg.NetSceneSnsTagOption", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            m84 m84 = ((s84) ((C47350c) uVar).f127056b.f127083a).f141377d;
            Log.m105918d("MicroMsg.NetSceneSnsTagOption", m84.toString());
            int i4 = this.f116511e;
            if (i4 == 1 || i4 == 2) {
                C11765l0 qq = C94866e1.ey0().mo11657qq(m84.f137907d);
                qq.field_tagId = m84.f137907d;
                qq.field_tagName = Util.nullAs(m84.f137908e, "");
                qq.field_count = m84.f137909f;
                qq.mo11649l2(m84.f137910g);
                C94866e1.ey0().mo11652SE(qq);
            } else if (i4 == 3) {
                int jo = C94866e1.ey0().mo11655jo(this.f116512f);
                Log.m105918d("MicroMsg.NetSceneSnsTagOption", "MM_SNS_TAG_DEL " + jo);
            }
            this.f116513g.onSceneEnd(i2, i3, str, this);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
            return;
        }
        this.f116513g.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagOption");
    }
}
