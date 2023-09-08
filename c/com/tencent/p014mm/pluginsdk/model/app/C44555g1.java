package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ld2.C46848g;
import ob0.C47350c;
import p141db.C86219d;
import te3.C50786p6;
import te3.C50919q6;
import te3.C51878wu1;
import te3.C52022xu1;

/* renamed from: com.tencent.mm.pluginsdk.model.app.g1 */
public class C44555g1 extends C44549d1 {

    /* renamed from: e */
    public List<String> f120831e;

    public C44555g1(List<String> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51878wu1();
        bVar.f127067b = new C52022xu1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getappsetting";
        bVar.f127069d = C86219d.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f120809d = bVar.mo72403a();
        this.f120831e = list;
        Log.m105918d("MicroMsg.NetSceneGetAppSetting", "<init>, appIdList size = " + list.size());
        LinkedList<C50919q6> linkedList = new LinkedList<>();
        for (String next : list) {
            if (next != null && next.length() > 0) {
                C50919q6 q6Var = new C50919q6();
                q6Var.f140161d = next;
                linkedList.add(q6Var);
            }
        }
        if (linkedList.size() == 0) {
            Log.m105920e("MicroMsg.NetSceneGetAppSetting", "doScene fail, reqList is empty");
        }
        C51878wu1 wu12 = (C51878wu1) this.f120809d.f127055a.f127080a;
        wu12.f144293e = linkedList;
        wu12.f144292d = linkedList.size();
    }

    /* renamed from: a */
    public void mo69337a(byte[] bArr) {
        if (bArr == null) {
            Log.m105920e("MicroMsg.NetSceneGetAppSetting", "buf is null");
            return;
        }
        try {
            this.f120809d.f127056b.fromProtoBuf(bArr);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetAppSetting", "bufToResp error: " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", e, "", new Object[0]);
        }
    }

    /* renamed from: b */
    public int mo69338b() {
        return 1;
    }

    /* renamed from: c */
    public byte[] mo69339c() {
        try {
            return ((C47350c.C47353c) this.f120809d.getReqObj()).toProtoBuf();
        } catch (Exception e) {
            Log.m105920e("MicroMsg.NetSceneGetAppSetting", "toProtBuf error: " + e.getMessage());
            Log.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", e, "", new Object[0]);
            return null;
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetAppSetting", "errType = " + i2 + ", errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C52022xu1 xu12 = (C52022xu1) this.f120809d.f127056b.f127083a;
            Log.m105918d("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, resp appCount = " + xu12.f144973d);
            LinkedList<C50786p6> linkedList = xu12.f144974e;
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105920e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, settingList is empty");
                return;
            }
            C44579p Bx0 = C46848g.Bx0();
            Iterator<C50786p6> it = linkedList.iterator();
            while (it.hasNext()) {
                C50786p6 next = it.next();
                C44561j i4 = C44565l.m48989i(next.f139593d, false, false);
                if (i4 != null) {
                    i4.field_authFlag = next.f139594e;
                    i4.field_openId = next.f139595f;
                    boolean Ow = Bx0.update(i4, new String[0]);
                    Log.m105918d("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, update ret = " + Ow + ", appId = " + next.f139593d);
                }
            }
            return;
        }
        Log.m105920e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, errType = " + i2 + ", errCode = " + i3);
    }
}
