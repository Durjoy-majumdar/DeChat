package ql2;

import android.graphics.RectF;
import com.tencent.p014mm.protocal.protobuf.GoodsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import nl2.C109753o;
import nl2.C21680p;
import sx3.C110818d0;
import te3.C50745ow3;
import te3.C51378td;
import te3.C51528ud;

/* renamed from: ql2.f */
public final class C22110f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f62525d;

    /* renamed from: e */
    public final /* synthetic */ C22107e f62526e;

    /* renamed from: f */
    public final /* synthetic */ C50745ow3 f62527f;

    /* renamed from: g */
    public final /* synthetic */ List<Integer> f62528g;

    /* renamed from: h */
    public final /* synthetic */ String f62529h;

    public C22110f(int i, C22107e eVar, C50745ow3 ow32, List<Integer> list, String str) {
        this.f62525d = i;
        this.f62526e = eVar;
        this.f62527f = ow32;
        this.f62528g = list;
        this.f62529h = str;
    }

    public final void run() {
        LinkedList<C51378td> linkedList;
        int i = this.f62525d;
        C22107e eVar = this.f62526e;
        C21680p pVar = new C21680p(i, eVar.f62515e, eVar.f62516f.f61327g);
        C50745ow3 ow32 = this.f62527f;
        C87412m.m108594g(ow32, "response");
        pVar.f61356d.clear();
        LinkedList<C51528ud> linkedList2 = ow32.f139407d;
        if (linkedList2 != null) {
            for (C51528ud udVar : linkedList2) {
                if (!(udVar == null || (linkedList = udVar.f142782h) == null)) {
                    for (C51378td tdVar : linkedList) {
                        if (tdVar != null) {
                            ArrayList<C109753o> arrayList = pVar.f61356d;
                            C109753o oVar = new C109753o();
                            oVar.f328496c = pVar.f61355c;
                            String str = tdVar.f142127g;
                            if (str == null) {
                                str = "";
                            }
                            oVar.f328502i = str;
                            oVar.f328501h = tdVar.f142124d;
                            oVar.f328504k = ow32.f139409f;
                            GoodsObject goodsObject = tdVar.f142125e;
                            if (goodsObject != null) {
                                oVar.f328503j = new RectF(goodsObject.relative_minx, goodsObject.relative_miny, goodsObject.relative_maxx, goodsObject.relative_maxy);
                            }
                            Log.m105925i("MicroMsg.ScanProductRecognizeResult", "convertFromUploadResponse reqKey: %s, trackId: %s, scanImageType: %s, goodsRect: %s, needPoi: %s", oVar.f328502i, Integer.valueOf(oVar.f328501h), Integer.valueOf(oVar.f328496c), oVar.f328503j, Boolean.valueOf(ow32.f139409f));
                            arrayList.add(oVar);
                        }
                    }
                }
            }
        }
        pVar.f61357e = this.f62526e.f62516f.f61326f.f61364g;
        if (!pVar.f61356d.isEmpty()) {
            ArrayList<C109753o> arrayList2 = pVar.f61356d;
            C22107e eVar2 = this.f62526e;
            for (C109753o oVar2 : arrayList2) {
                eVar2.mo35190a(eVar2.f62516f, oVar2);
                oVar2.f328500g = 2;
            }
            Log.m105925i("MicroMsg.AiScanImageUploadTask", "alvinluo onUploadSuccess source: %d, scanImageType: %s, requestTrackIdList: %s, isCancelled: %b", Integer.valueOf(this.f62525d), Integer.valueOf(this.f62526e.f62516f.f61327g), C110818d0.m150921S(this.f62528g, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null), Boolean.valueOf(this.f62526e.f62518h));
            C22107e eVar3 = this.f62526e;
            if (!eVar3.f62518h) {
                eVar3.f62517g.mo33925g(pVar);
                return;
            }
            return;
        }
        List<Integer> list = this.f62528g;
        C22107e eVar4 = this.f62526e;
        for (Number intValue : list) {
            int intValue2 = intValue.intValue();
            ArrayList<C109753o> arrayList3 = pVar.f61356d;
            C109753o oVar3 = new C109753o();
            eVar4.mo35190a(eVar4.f62516f, oVar3);
            oVar3.f328501h = intValue2;
            oVar3.f328500g = 3;
            arrayList3.add(oVar3);
        }
        Log.m105921e("MicroMsg.AiScanImageUploadTask", "alvinluo onUploadSuccessWrapper failed because of no req key, source: %d, scanImageType: %s, requestTrackIdList: %s", Integer.valueOf(this.f62525d), Integer.valueOf(this.f62526e.f62516f.f61327g), C110818d0.m150921S(this.f62528g, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
        C22107e eVar5 = this.f62526e;
        if (!eVar5.f62518h) {
            eVar5.f62517g.mo33927i(pVar, this.f62525d, eVar5.f62515e, 4, -1, this.f62529h);
        }
    }
}
