package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C100420w;
import sf0.C48374j0;
import te3.q74;
import te3.r74;
import vr2.C65874b0;

/* renamed from: com.tencent.mm.plugin.sns.model.f0 */
public class C43036f0 extends C117747y implements C1311n {

    /* renamed from: j */
    public static List<Long> f116492j = new Vector();

    /* renamed from: d */
    public C47350c f116493d;

    /* renamed from: e */
    public long f116494e;

    /* renamed from: f */
    public C11385n f116495f;

    /* renamed from: g */
    public boolean f116496g = false;

    /* renamed from: h */
    public C100420w f116497h = null;

    /* renamed from: i */
    public boolean f116498i = false;

    public C43036f0(long j) {
        this.f116494e = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new q74();
        bVar.f127067b = new r74();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsobjectdetail";
        bVar.f127069d = 210;
        bVar.f127070e = 101;
        bVar.f127071f = 1000000101;
        C47350c a = bVar.mo72403a();
        this.f116493d = a;
        ((q74) a.f127055a.f127080a).f140174d = j;
        SnsMethodCalculate.markStartTimeMs("doGetNameList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        ((q74) this.f116493d.f127055a.f127080a).f140175e = 1;
        SnsMethodCalculate.markEndTimeMs("doGetNameList", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        Log.m105918d("MicroMsg.NetSceneSnsObjectDetial", "req snsId " + j);
    }

    /* renamed from: j1 */
    public static boolean m46671j1(long j) {
        SnsMethodCalculate.markStartTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        if (((Vector) f116492j).contains(Long.valueOf(j))) {
            SnsMethodCalculate.markEndTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            return false;
        }
        ((Vector) f116492j).add(Long.valueOf(j));
        SnsMethodCalculate.markEndTimeMs("addDetailReq", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return true;
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        this.f116495f = nVar;
        int dispatch = dispatch(gVar, this.f116493d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return 210;
    }

    /* renamed from: k1 */
    public SnsObject mo67229k1() {
        SnsMethodCalculate.markStartTimeMs("getRespSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        SnsObject snsObject = ((r74) this.f116493d.f127056b.f127083a).f140749d;
        SnsMethodCalculate.markEndTimeMs("getRespSnsObject", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        return snsObject;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
        if (i2 == 0 && i3 == 0) {
            r74 r74 = (r74) this.f116493d.f127056b.f127083a;
            SnsObject snsObject = r74.f140749d;
            if (snsObject != null) {
                C65874b0.f189421a.mo89928g("MicroMsg.NetSceneSnsObjectDetial", snsObject, false);
                Log.m105924i("MicroMsg.NetSceneSnsObjectDetial", "snsdetail xml " + C48374j0.m53717f(snsObject.ObjectDesc));
                SnsObject snsObject2 = new SnsObject();
                try {
                    snsObject2.parseFrom(snsObject.toByteArray());
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneSnsObjectDetial", e, "SnsObject parseFrom error", new Object[0]);
                }
                C94897n1.m120377o(snsObject2);
            }
            this.f116495f.onSceneEnd(i2, i3, str, this);
            if (r74.f140750e == 0) {
                long j = this.f116494e;
                SnsMethodCalculate.markStartTimeMs("removeDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
                ((Vector) f116492j).remove(Long.valueOf(j));
                SnsMethodCalculate.markEndTimeMs("removeDetailId", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            }
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
            return;
        }
        this.f116495f.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectDetial");
    }
}
