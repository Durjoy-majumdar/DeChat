package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C11765l0;
import te3.C51163rv3;
import te3.m84;
import te3.p84;
import te3.q84;

/* renamed from: com.tencent.mm.plugin.sns.model.m0 */
public class C43040m0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f116506d;

    /* renamed from: e */
    public int f116507e;

    /* renamed from: f */
    public C11385n f116508f;

    /* renamed from: g */
    public int f116509g = 0;

    public C43040m0(int i, long j, String str, int i2, List<String> list, int i3) {
        Log.m105918d("MicroMsg.NetSceneSnsTagMemberOption", "opCode " + i + " tagName " + str + " memberList " + list.size() + " scene " + i3);
        this.f116507e = i;
        this.f116509g = i3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new p84();
        bVar.f127067b = new q84();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnstagmemberoption";
        bVar.f127069d = 291;
        bVar.f127070e = 115;
        bVar.f127071f = 1000000115;
        C47350c a = bVar.mo72403a();
        this.f116506d = a;
        p84 p84 = (p84) a.f127055a.f127080a;
        p84.f139640d = i;
        p84.f139641e = j;
        p84.f139642f = str;
        p84.f139643g = i2;
        p84.f139645i = this.f116509g;
        LinkedList<C51163rv3> linkedList = new LinkedList<>();
        for (String str2 : list) {
            C51163rv3 rv32 = new C51163rv3();
            rv32.f141175d = str2;
            rv32.f141176e = true;
            linkedList.add(rv32);
        }
        p84.f139644h = linkedList;
        Log.m105918d("MicroMsg.NetSceneSnsTagMemberOption", "rr.req.rImpl " + p84.toString());
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        this.f116508f = nVar;
        int dispatch = dispatch(gVar, this.f116506d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        return 291;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
        Log.m105918d("MicroMsg.NetSceneSnsTagMemberOption", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (i2 == 0 && i3 == 0) {
            m84 m84 = ((q84) ((C47350c) uVar).f127056b.f127083a).f140186d;
            Log.m105918d("MicroMsg.NetSceneSnsTagMemberOption", "Resp.rImpl " + m84.toString());
            C11765l0 qq = C94866e1.ey0().mo11657qq(m84.f137907d);
            qq.field_tagId = m84.f137907d;
            qq.field_tagName = Util.nullAs(m84.f137908e, "");
            int i4 = this.f116507e;
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                qq.field_count = m84.f137909f;
                qq.mo11649l2(m84.f137910g);
            }
            C94866e1.ey0().mo11652SE(qq);
            this.f116508f.onSceneEnd(i2, i3, str, this);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
            return;
        }
        this.f116508f.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsTagMemberOption");
    }
}
