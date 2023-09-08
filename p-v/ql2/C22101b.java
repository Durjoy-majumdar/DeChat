package ql2;

import com.tencent.p014mm.plugin.scanner.model.C57321o;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import nl2.C109753o;
import nl2.C21668f;
import nl2.C21680p;
import nl2.C21681q;
import ob0.C11385n;
import ob0.C117747y;
import pe3.C47465a;
import ql2.C22105d;
import sx3.C110818d0;
import te3.C50320lw3;
import zt3.C119157j;

/* renamed from: ql2.b */
public final class C22101b extends C22111g<C21668f> implements C11385n {

    /* renamed from: e */
    public final long f62502e;

    /* renamed from: f */
    public final C21668f f62503f;

    /* renamed from: g */
    public final C22102a f62504g;

    /* renamed from: h */
    public final int f62505h;

    /* renamed from: i */
    public boolean f62506i;

    /* renamed from: j */
    public final ArrayList<Integer> f62507j = new ArrayList<>();

    /* renamed from: ql2.b$a */
    public interface C22102a extends C22105d.C22106a {
        /* renamed from: d */
        void mo33922d(C21680p pVar, int i, long j, int i2, String str);

        /* renamed from: j */
        void mo33928j(C21668f fVar);

        /* renamed from: k */
        void mo33929k(C21680p pVar);
    }

    /* renamed from: ql2.b$b */
    public static final class C22103b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f62508d;

        /* renamed from: e */
        public final /* synthetic */ C22101b f62509e;

        /* renamed from: f */
        public final /* synthetic */ int f62510f;

        /* renamed from: g */
        public final /* synthetic */ String f62511g;

        public C22103b(int i, C22101b bVar, int i2, String str) {
            this.f62508d = i;
            this.f62509e = bVar;
            this.f62510f = i2;
            this.f62511g = str;
        }

        public final void run() {
            int i = this.f62508d;
            C22101b bVar = this.f62509e;
            C21680p pVar = new C21680p(i, bVar.f62502e, bVar.f62503f.f61282a);
            C22101b bVar2 = this.f62509e;
            pVar.f61357e = bVar2.f62503f.f61322f.f61364g;
            for (Number intValue : bVar2.f62507j) {
                int intValue2 = intValue.intValue();
                ArrayList<C109753o> arrayList = pVar.f61356d;
                C109753o oVar = new C109753o();
                bVar2.mo35186a(bVar2.f62503f, oVar);
                oVar.f328501h = intValue2;
                oVar.f328500g = 5;
                arrayList.add(oVar);
            }
            Log.m105921e("MicroMsg.AiScanImageRetrievalTask", "alvinluo onRetrievalFailed source: %d, requestTrackIdList: %s", Integer.valueOf(this.f62508d), C110818d0.m150921S(this.f62509e.f62507j, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
            C22101b bVar3 = this.f62509e;
            bVar3.f62504g.mo33922d(pVar, this.f62508d, bVar3.f62502e, this.f62510f, this.f62511g);
        }
    }

    public C22101b(long j, C21668f fVar, C22102a aVar) {
        C87412m.m108594g(fVar, "request");
        C87412m.m108594g(aVar, "callback");
        this.f62502e = j;
        this.f62503f = fVar;
        this.f62504g = aVar;
        this.f62505h = fVar.f61284c;
    }

    /* renamed from: a */
    public void mo35186a(C21668f fVar, C109753o oVar) {
        C87412m.m108594g(fVar, "request");
        C87412m.m108594g(oVar, "productItem");
        oVar.f328494a = fVar.f61284c;
        oVar.f328495b = fVar.f61283b;
        oVar.f328496c = fVar.mo33918a();
        C21681q qVar = fVar.f61322f;
        oVar.f328497d = qVar;
        Log.m105927v("MicroMsg.AiScanImageRetrievalTask", "fillBaseInfo %s", qVar);
    }

    /* renamed from: b */
    public final void mo35187b(int i, int i2, String str) {
        ((C119157j) C119157j.f356862d).mo183895z(new C22103b(i, this, i2, str));
        this.f62504g.mo33921c(this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C50320lw3 lw32 = null;
        Integer valueOf = yVar != null ? Integer.valueOf(yVar.hashCode()) : null;
        C117747y yVar2 = this.f62503f.f61286e;
        if (C87412m.m108589b(valueOf, yVar2 != null ? Integer.valueOf(yVar2.hashCode()) : null)) {
            boolean z = true;
            this.f62530d = true;
            StringBuilder sb = new StringBuilder();
            sb.append("retrieval onSceneEnd errType: ");
            sb.append(i);
            sb.append(", errCode: ");
            sb.append(i2);
            sb.append(", errMsg: ");
            sb.append(str);
            sb.append(", type: ");
            sb.append(yVar != null ? Integer.valueOf(yVar.getType()) : null);
            Log.m105924i("MicroMsg.AiScanImageRetrievalTask", sb.toString());
            C86709a0.m107524d().mo123470p(5057, this);
            if (yVar == null || yVar.getType() != 5057) {
                z = false;
            }
            if (!z) {
                return;
            }
            if (i == 0 && i2 == 0) {
                C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.model.NetSceneBizAiScanImageRetrievalV2");
                C47465a aVar = ((C57321o) yVar).f164203e.f127056b.f127083a;
                if (aVar != null) {
                    lw32 = (C50320lw3) aVar;
                }
                if (lw32 != null) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C22104c(this, lw32, this.f62505h));
                    this.f62504g.mo33921c(this);
                    return;
                }
                Log.m105928w("MicroMsg.AiScanImageRetrievalTask", "alvinluo AiScanImage onSceneEnd success resp null");
                mo35187b(this.f62505h, i2, str);
                return;
            }
            mo35187b(this.f62505h, i2, str);
        }
    }
}
