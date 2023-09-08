package ql2;

import com.tencent.p014mm.plugin.scanner.model.C57320m;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import nl2.C109753o;
import nl2.C21670h;
import nl2.C21680p;
import nl2.C21681q;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import ql2.C22105d;
import sx3.C110818d0;
import te3.C50745ow3;
import zt3.C119157j;

/* renamed from: ql2.e */
public final class C22107e extends C22111g<C21670h> implements C11385n {

    /* renamed from: e */
    public final long f62515e;

    /* renamed from: f */
    public final C21670h f62516f;

    /* renamed from: g */
    public final C22108a f62517g;

    /* renamed from: h */
    public boolean f62518h;

    /* renamed from: ql2.e$a */
    public interface C22108a extends C22105d.C22106a {
        /* renamed from: f */
        void mo33924f(C21670h hVar);

        /* renamed from: g */
        void mo33925g(C21680p pVar);

        /* renamed from: i */
        void mo33927i(C21680p pVar, int i, long j, int i2, int i3, String str);
    }

    /* renamed from: ql2.e$b */
    public static final class C22109b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f62519d;

        /* renamed from: e */
        public final /* synthetic */ C22107e f62520e;

        /* renamed from: f */
        public final /* synthetic */ List<Integer> f62521f;

        /* renamed from: g */
        public final /* synthetic */ int f62522g;

        /* renamed from: h */
        public final /* synthetic */ int f62523h;

        /* renamed from: i */
        public final /* synthetic */ String f62524i;

        public C22109b(int i, C22107e eVar, List<Integer> list, int i2, int i3, String str) {
            this.f62519d = i;
            this.f62520e = eVar;
            this.f62521f = list;
            this.f62522g = i2;
            this.f62523h = i3;
            this.f62524i = str;
        }

        public final void run() {
            int i = this.f62519d;
            C22107e eVar = this.f62520e;
            C21680p pVar = new C21680p(i, eVar.f62515e, eVar.f62516f.f61327g);
            C22107e eVar2 = this.f62520e;
            List<Integer> list = this.f62521f;
            pVar.f61357e = eVar2.f62516f.f61326f.f61364g;
            for (Number intValue : list) {
                int intValue2 = intValue.intValue();
                ArrayList<C109753o> arrayList = pVar.f61356d;
                C109753o oVar = new C109753o();
                eVar2.mo35190a(eVar2.f62516f, oVar);
                oVar.f328501h = intValue2;
                oVar.f328500g = 3;
                arrayList.add(oVar);
            }
            Log.m105921e("MicroMsg.AiScanImageUploadTask", "alvinluo onUploadFailed source: %d, scanImageType: %s, requestTrackIdList: %s", Integer.valueOf(this.f62519d), Integer.valueOf(this.f62520e.f62516f.f61327g), C110818d0.m150921S(this.f62521f, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
            C22107e eVar3 = this.f62520e;
            eVar3.f62517g.mo33927i(pVar, this.f62519d, eVar3.f62515e, this.f62522g, this.f62523h, this.f62524i);
        }
    }

    public C22107e(long j, C21670h hVar, C22108a aVar) {
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(aVar, "callback");
        this.f62515e = j;
        this.f62516f = hVar;
        this.f62517g = aVar;
    }

    /* renamed from: a */
    public void mo35190a(C21670h hVar, C109753o oVar) {
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(oVar, "productItem");
        oVar.f328494a = hVar.f61284c;
        oVar.f328495b = hVar.f61283b;
        oVar.f328496c = hVar.mo33918a();
        C21681q qVar = hVar.f61326f;
        oVar.f328497d = qVar;
        Log.m105927v("MicroMsg.AiScanImageUploadTask", "fillBaseInfo %s", qVar);
    }

    /* renamed from: b */
    public final void mo35191b(int i, int i2, int i3, String str, List<Integer> list) {
        ((C119157j) C119157j.f356862d).mo183895z(new C22109b(i, this, list, i2, i3, str));
        this.f62517g.mo33921c(this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ArrayList<Integer> arrayList;
        C50745ow3 ow32 = null;
        Integer valueOf = yVar != null ? Integer.valueOf(yVar.hashCode()) : null;
        C117747y yVar2 = this.f62516f.f61286e;
        if (C87412m.m108589b(valueOf, yVar2 != null ? Integer.valueOf(yVar2.hashCode()) : null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("uploadImage onSceneEnd errType: ");
            sb.append(i);
            sb.append(", errCode: ");
            sb.append(i2);
            sb.append(", errMsg: ");
            sb.append(str);
            sb.append(", type: ");
            sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
            Log.m105924i("MicroMsg.AiScanImageUploadTask", sb.toString());
            C86709a0.m107524d().mo123470p(5105, this);
            if (yVar != null && yVar.getType() == 5105) {
                this.f62530d = true;
                C57320m mVar = yVar instanceof C57320m ? (C57320m) yVar : null;
                if (mVar == null || (arrayList = mVar.f164201g) == null) {
                    arrayList = new ArrayList<>();
                }
                ArrayList<Integer> arrayList2 = arrayList;
                if (i == 0 && i2 == 0) {
                    C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneAiScanImageV2");
                    C57320m mVar2 = (C57320m) yVar;
                    C47465a aVar = mVar2.f164199e.f127056b.f127083a;
                    if (aVar != null) {
                        ow32 = (C50745ow3) aVar;
                    }
                    C50745ow3 ow33 = ow32;
                    if (ow33 != null) {
                        Log.m105919d("MicroMsg.AiScanImageUploadTask", "alvinluo AiScanImage onSceneEnd sessionId: %s", Long.valueOf(mVar2.f164200f));
                        ((C119157j) C119157j.f356862d).mo183895z(new C22110f(this.f62516f.f61284c, this, ow33, arrayList2, str));
                        this.f62517g.mo33921c(this);
                        return;
                    }
                    Log.m105928w("MicroMsg.AiScanImageUploadTask", "alvinluo AiScanImage onSceneEnd success resp null");
                    mo35191b(this.f62516f.f61284c, i, i2, str, arrayList2);
                    return;
                }
                mo35191b(this.f62516f.f61284c, i, i2, str, arrayList2);
            }
        }
    }
}
