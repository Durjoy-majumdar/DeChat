package ql2;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import nl2.C109753o;
import nl2.C21680p;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49900iu3;
import te3.C50320lw3;

/* renamed from: ql2.c */
public final class C22104c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C22101b f62512d;

    /* renamed from: e */
    public final /* synthetic */ C50320lw3 f62513e;

    /* renamed from: f */
    public final /* synthetic */ int f62514f;

    public C22104c(C22101b bVar, C50320lw3 lw32, int i) {
        this.f62512d = bVar;
        this.f62513e = lw32;
        this.f62514f = i;
    }

    public final void run() {
        C21680p pVar = this.f62512d.f62503f.f61323g;
        C50320lw3 lw32 = this.f62513e;
        pVar.getClass();
        C87412m.m108594g(lw32, "response");
        LinkedList<C49900iu3> linkedList = lw32.f137684d;
        C87412m.m108593f(linkedList, "response.results");
        Iterator<T> it = linkedList.iterator();
        int i = 0;
        while (true) {
            int i2 = 4;
            if (it.hasNext()) {
                T next = it.next();
                int i3 = i + 1;
                if (i >= 0) {
                    C49900iu3 iu32 = (C49900iu3) next;
                    C109753o oVar = (C109753o) C110818d0.m150917O(pVar.f61356d, i);
                    if (oVar != null) {
                        String str = iu32.f135679d;
                        String str2 = "";
                        if (str == null) {
                            str = str2;
                        }
                        oVar.f328505l = str;
                        String str3 = iu32.f135680e;
                        if (str3 != null) {
                            str2 = str3;
                        }
                        oVar.f328506m = str2;
                        int i4 = iu32.f135681f;
                        if (i4 == 0) {
                            i2 = 1;
                        } else if (i4 == 1) {
                            i2 = 2;
                        } else if (i4 == 2) {
                            i2 = 3;
                        } else if (i4 != 3) {
                            i2 = 0;
                        }
                        oVar.f328507n = i2;
                        oVar.f328508o = iu32.f135682g;
                        Log.m105924i("MicroMsg.ScanProductRecognizeResult", "updateFromRetrievalResponse scanImageType: " + oVar.f328496c + ", " + oVar);
                    }
                    i = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            } else {
                ArrayList<C109753o> arrayList = pVar.f61356d;
                C22101b bVar = this.f62512d;
                for (C109753o oVar2 : arrayList) {
                    bVar.mo35186a(bVar.f62503f, oVar2);
                    oVar2.f328500g = 4;
                }
                Log.m105925i("MicroMsg.AiScanImageRetrievalTask", "alvinluo onRetrievalSuccess source: %d, isCancelled: %b, requestTrackIdList: %s", Integer.valueOf(this.f62514f), Boolean.valueOf(this.f62512d.f62506i), C110818d0.m150921S(this.f62512d.f62507j, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
                C22101b bVar2 = this.f62512d;
                if (!bVar2.f62506i) {
                    bVar2.f62504g.mo33929k(pVar);
                    return;
                }
                return;
            }
        }
    }
}
