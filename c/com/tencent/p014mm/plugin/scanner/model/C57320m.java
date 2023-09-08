package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C50460mw3;
import te3.C50745ow3;
import te3.C51378td;
import te3.C51528ud;
import te3.C51957xd;
import te3.C64593nw3;
import te3.C64799wd;
import te3.C64852yd;

/* renamed from: com.tencent.mm.plugin.scanner.model.m */
public final class C57320m extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f164198d;

    /* renamed from: e */
    public final C47350c f164199e;

    /* renamed from: f */
    public long f164200f;

    /* renamed from: g */
    public ArrayList<Integer> f164201g = new ArrayList<>();

    public C57320m(byte[] bArr, int i, int i2, int i3, int i4, long j, ScanProductInfo scanProductInfo, C64799wd wdVar, C51957xd xdVar, C64852yd ydVar) {
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        long j2 = j;
        C87412m.m108594g(bArr2, "imageData");
        C87412m.m108594g(scanProductInfo, "scanProductInfo");
        this.f164200f = j2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64593nw3();
        bVar.f127067b = new C50745ow3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/mmbizscan_v2_upload";
        bVar.f127069d = 5105;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        MultiProcessMMKV multiProcessMMKV = C19021i0.f53459e;
        bVar.f127074i = multiProcessMMKV != null ? multiProcessMMKV.getInt("scan_config_upload_timeout", 5000) : 5000;
        C47350c a = bVar.mo72403a();
        this.f164199e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ScanV2UploadRequest");
        C64593nw3 nw32 = (C64593nw3) aVar;
        nw32.f184567e = i7;
        nw32.f184566d = j2;
        nw32.f184568f = System.currentTimeMillis() / ((long) 1000);
        nw32.f184569g = i4;
        nw32.f184570h = false;
        LinkedList<C50460mw3> linkedList = nw32.f184571i;
        C50460mw3 mw32 = new C50460mw3();
        mw32.f138251f = C89349b.m111674a(bArr);
        LinkedList<C51378td> linkedList2 = mw32.f138250e;
        C51378td tdVar = new C51378td();
        this.f164201g.add(Integer.valueOf(scanProductInfo.getId()));
        tdVar.f142124d = scanProductInfo.getId();
        GoodsObject goodsObject = new GoodsObject();
        goodsObject.relative_minx = 0.0f;
        goodsObject.relative_miny = 0.0f;
        goodsObject.relative_maxx = (float) i5;
        goodsObject.relative_maxy = (float) i6;
        tdVar.f142125e = goodsObject;
        tdVar.f142126f = scanProductInfo.getProb();
        linkedList2.add(tdVar);
        linkedList.add(mw32);
        nw32.f184573n = wdVar;
        nw32.f184574o = xdVar;
        nw32.f184572j = ydVar;
        Log.m105924i("MicroMsg.NetSceneAiScanImageV2", "alvinluo NetSceneAiScanImageV2 imageSize: " + bArr2.length + ", mode; " + i7 + ", prob: " + scanProductInfo.getProb() + ", trackId: " + scanProductInfo.getId() + ", isPreload: " + nw32.f184570h + ", sessionId: " + j2 + ", mode: " + nw32.f184567e + ", imageWidth: " + i5 + ", imageHeight: " + i6 + ", send_srv_time: " + nw32.f184568f);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C87412m.m108594g(gVar, "dispatcher");
        C87412m.m108594g(nVar, "callback");
        this.f164198d = nVar;
        return dispatch(gVar, this.f164199e, this);
    }

    public int getType() {
        return 5105;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        LinkedList<C51378td> linkedList;
        C51378td tdVar;
        Log.m105924i("MicroMsg.NetSceneAiScanImageV2", "onGYNetEnd errType: " + i2 + ", errCode: " + i3 + ", errMsg: " + str + ", type: " + 5105);
        C11385n nVar = this.f164198d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        C47465a aVar = this.f164199e.f127056b.f127083a;
        String str2 = null;
        C50745ow3 ow32 = aVar != null ? (C50745ow3) aVar : null;
        if (ow32 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onGYNetEnd reqKey: ");
            LinkedList<C51528ud> linkedList2 = ow32.f139407d;
            C87412m.m108593f(linkedList2, "resp.mark_results");
            C51528ud udVar = (C51528ud) C110818d0.m150916N(linkedList2);
            if (!(udVar == null || (linkedList = udVar.f142782h) == null || (tdVar = (C51378td) C110818d0.m150916N(linkedList)) == null)) {
                str2 = tdVar.f142127g;
            }
            sb.append(str2);
            Log.m105924i("MicroMsg.NetSceneAiScanImageV2", sb.toString());
        }
    }
}
