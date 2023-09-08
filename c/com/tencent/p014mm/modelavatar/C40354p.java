package com.tencent.p014mm.modelavatar;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p206nj.C76861g;
import te3.C49537gb;
import te3.C49682hb;
import te3.C51163rv3;
import te3.C52265zh2;

/* renamed from: com.tencent.mm.modelavatar.p */
public class C40354p extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f108448d;

    /* renamed from: e */
    public LinkedList<C51163rv3> f108449e;

    /* renamed from: f */
    public LinkedList<C52265zh2> f108450f = null;

    public C40354p(LinkedList<C51163rv3> linkedList) {
        this.f108449e = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        LinkedList<C51163rv3> linkedList = this.f108449e;
        if (linkedList == null || linkedList.size() <= 0) {
            Log.m105920e("MicroMsg.NetSceneBatchGetHeadImg", C76861g.m92660c() + "doScene ReqSize==0");
            return -1;
        }
        this.f108448d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49537gb();
        bVar.f127067b = new C49682hb();
        bVar.f127068c = "/cgi-bin/micromsg-bin/batchgetheadimg";
        bVar.f127069d = 123;
        bVar.f127070e = 15;
        bVar.f127071f = 1000000015;
        C47350c a = bVar.mo72403a();
        C49537gb gbVar = (C49537gb) a.f127055a.f127080a;
        LinkedList<C51163rv3> linkedList2 = this.f108449e;
        gbVar.f133947e = linkedList2;
        gbVar.f133946d = linkedList2.size();
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 123;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneBatchGetHeadImg", "errType:" + i2 + " errCode:" + i3);
        this.f108450f = ((C49682hb) ((C47350c) uVar).f127056b.f127083a).f134536e;
        this.f108448d.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 20;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
