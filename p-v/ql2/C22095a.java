package ql2;

import android.graphics.RectF;
import com.tencent.p014mm.plugin.scanner.model.C19021i0;
import com.tencent.p014mm.plugin.scanner.model.C57321o;
import com.tencent.p014mm.sdk.platformtools.Log;
import dl2.C20468d;
import dl2.C20469e;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import nl2.C109753o;
import nl2.C21668f;
import nl2.C21670h;
import nl2.C21680p;
import nl2.C21683r;
import ql2.C22101b;
import ql2.C22107e;
import rx3.C13598b0;
import sx3.C110818d0;
import te3.C64852yd;

/* renamed from: ql2.a */
public final class C22095a implements C22105d {

    /* renamed from: d */
    public final C21670h f62490d;

    /* renamed from: e */
    public final C22096a f62491e;

    /* renamed from: f */
    public C22101b f62492f;

    /* renamed from: g */
    public C22107e f62493g;

    /* renamed from: h */
    public C22098c f62494h = new C22098c(this);

    /* renamed from: i */
    public C22097b f62495i = new C22097b(this);

    /* renamed from: ql2.a$a */
    public interface C22096a extends C22107e.C22108a, C22101b.C22102a {
        /* renamed from: b */
        void mo33920b(C21683r rVar, C32226l<? super Boolean, C13598b0> lVar);
    }

    /* renamed from: ql2.a$b */
    public static final class C22097b implements C22101b.C22102a {

        /* renamed from: a */
        public final /* synthetic */ C22095a f62496a;

        public C22097b(C22095a aVar) {
            this.f62496a = aVar;
        }

        /* renamed from: a */
        public void mo33919a(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
        }

        /* renamed from: c */
        public void mo33921c(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
        }

        /* renamed from: d */
        public void mo33922d(C21680p pVar, int i, long j, int i2, String str) {
            C87412m.m108594g(pVar, "result");
            Log.m105920e("MicroMsg.AiScanImageGetProductTask", "getProductTask onRetrievalFailed source: " + i + ", session: " + j + ", errCode: " + i2 + ", errMsg: " + str);
            this.f62496a.f62491e.mo33922d(pVar, i, j, i2, str);
            C22095a aVar = this.f62496a;
            aVar.f62491e.mo33921c(aVar);
        }

        /* renamed from: h */
        public void mo33926h(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
            C22095a aVar = this.f62496a;
            aVar.f62491e.mo33926h(aVar);
        }

        /* renamed from: j */
        public void mo33928j(C21668f fVar) {
            C87412m.m108594g(fVar, "request");
            this.f62496a.f62491e.mo33928j(fVar);
        }

        /* renamed from: k */
        public void mo33929k(C21680p pVar) {
            C87412m.m108594g(pVar, "result");
            Log.m105924i("MicroMsg.AiScanImageGetProductTask", "getProductTask onRetrievalSuccess");
            this.f62496a.f62491e.mo33929k(pVar);
            C22095a aVar = this.f62496a;
            aVar.f62491e.mo33921c(aVar);
        }
    }

    /* renamed from: ql2.a$c */
    public static final class C22098c implements C22107e.C22108a {

        /* renamed from: a */
        public final /* synthetic */ C22095a f62497a;

        /* renamed from: ql2.a$c$a */
        public static final class C22099a implements C20469e.C20473d {

            /* renamed from: a */
            public final /* synthetic */ C21680p f62498a;

            /* renamed from: b */
            public final /* synthetic */ C22095a f62499b;

            /* renamed from: ql2.a$c$a$a */
            public static final class C22100a extends C87413o implements C32226l<Boolean, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C22095a f62500d;

                /* renamed from: e */
                public final /* synthetic */ C21680p f62501e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C22100a(C22095a aVar, C21680p pVar) {
                    super(1);
                    this.f62500d = aVar;
                    this.f62501e = pVar;
                }

                public Object invoke(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    Log.m105925i("MicroMsg.AiScanImageGetProductTask", "addScanProductResultForFullImage success: %s", Boolean.valueOf(booleanValue));
                    if (booleanValue) {
                        C22095a.m25508a(this.f62500d, this.f62501e);
                    } else {
                        C22095a aVar = this.f62500d;
                        aVar.f62491e.mo33921c(aVar);
                    }
                    return C13598b0.f38549a;
                }
            }

            public C22099a(C21680p pVar, C22095a aVar) {
                this.f62498a = pVar;
                this.f62499b = aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
                if ((r2 == null || r2.isEmpty()) != false) goto L_0x0014;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo24327a(nl2.C21683r r10) {
                /*
                    r9 = this;
                    r0 = 1
                    r1 = 0
                    if (r10 == 0) goto L_0x0014
                    java.util.ArrayList<nl2.q> r2 = r10.f61383d
                    if (r2 == 0) goto L_0x0011
                    boolean r2 = r2.isEmpty()
                    if (r2 == 0) goto L_0x000f
                    goto L_0x0011
                L_0x000f:
                    r2 = 0
                    goto L_0x0012
                L_0x0011:
                    r2 = 1
                L_0x0012:
                    if (r2 == 0) goto L_0x001d
                L_0x0014:
                    r2 = 24
                    nl2.p r3 = r9.f62498a
                    com.tencent.mm.plugin.scanner.model.d$a r3 = r3.f61357e
                    com.tencent.p014mm.plugin.scanner.model.C19011d.m20064a(r2, r3)
                L_0x001d:
                    com.tencent.p014mm.plugin.scanner.model.C19021i0.f53458d = r1
                    if (r10 == 0) goto L_0x0042
                    java.util.ArrayList<nl2.q> r2 = r10.f61383d
                    if (r2 == 0) goto L_0x0042
                    ql2.a r3 = r9.f62499b
                    java.util.Iterator r2 = r2.iterator()
                L_0x002b:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x0042
                    java.lang.Object r4 = r2.next()
                    nl2.q r4 = (nl2.C21681q) r4
                    nl2.h r5 = r3.f62490d
                    byte[] r6 = r5.f61328h
                    r4.f61360c = r6
                    int r5 = r5.f61329i
                    r4.f61361d = r5
                    goto L_0x002b
                L_0x0042:
                    nl2.p r2 = r9.f62498a
                    java.util.ArrayList<nl2.o> r2 = r2.f61356d
                    java.util.Iterator r2 = r2.iterator()
                    r3 = 0
                L_0x004b:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x00a1
                    java.lang.Object r4 = r2.next()
                    int r5 = r3 + 1
                    if (r3 < 0) goto L_0x009c
                    nl2.o r4 = (nl2.C109753o) r4
                    if (r10 == 0) goto L_0x009a
                    java.util.ArrayList<nl2.q> r6 = r10.f61383d
                    if (r6 == 0) goto L_0x009a
                    java.lang.Object r3 = sx3.C110818d0.m150917O(r6, r3)
                    nl2.q r3 = (nl2.C21681q) r3
                    if (r3 == 0) goto L_0x009a
                    r6 = 3
                    java.lang.Object[] r6 = new java.lang.Object[r6]
                    int r7 = r4.f328501h
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    r6[r1] = r7
                    com.tencent.mm.plugin.scanner.model.ScanProductInfo r7 = r3.f61358a
                    int r7 = r7.getId()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    r6[r0] = r7
                    r7 = 2
                    int r8 = r3.hashCode()
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                    r6[r7] = r8
                    java.lang.String r7 = "MicroMsg.AiScanImageGetProductTask"
                    java.lang.String r8 = "getProductTask uploadFullImage success set origin trackId: %s, trackId: %s, hashCode: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
                    com.tencent.mm.plugin.scanner.model.ScanProductInfo r3 = r3.f61358a
                    int r3 = r3.getId()
                    r4.f328501h = r3
                L_0x009a:
                    r3 = r5
                    goto L_0x004b
                L_0x009c:
                    sx3.C64197v.m75542k()
                    r10 = 0
                    throw r10
                L_0x00a1:
                    ql2.a r0 = r9.f62499b
                    ql2.a$a r1 = r0.f62491e
                    ql2.a$c$a$a r2 = new ql2.a$c$a$a
                    nl2.p r3 = r9.f62498a
                    r2.<init>(r0, r3)
                    r1.mo33920b(r10, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: ql2.C22095a.C22098c.C22099a.mo24327a(nl2.r):void");
            }
        }

        public C22098c(C22095a aVar) {
            this.f62497a = aVar;
        }

        /* renamed from: a */
        public void mo33919a(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
            C22095a aVar = this.f62497a;
            aVar.f62491e.mo33919a(aVar);
        }

        /* renamed from: c */
        public void mo33921c(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
        }

        /* renamed from: f */
        public void mo33924f(C21670h hVar) {
            C87412m.m108594g(hVar, "request");
            this.f62497a.f62491e.mo33924f(hVar);
        }

        /* renamed from: g */
        public void mo33925g(C21680p pVar) {
            C87412m.m108594g(pVar, "result");
            Log.m105924i("MicroMsg.AiScanImageGetProductTask", "getProductTask onUploadSuccess and run imageRetrievalTask");
            this.f62497a.f62491e.mo33925g(pVar);
            C22095a aVar = this.f62497a;
            if (!aVar.f62490d.f61332l) {
                aVar.f62491e.mo33921c(aVar);
            } else if (pVar.f61355c == 1) {
                C22095a.m25508a(aVar, pVar);
            } else {
                C109753o oVar = (C109753o) C110818d0.m150916N(pVar.f61356d);
                RectF rectF = oVar != null ? oVar.f328503j : null;
                if (rectF != null) {
                    C20469e eVar = C20469e.f57530v;
                    C22095a aVar2 = this.f62497a;
                    int i = aVar2.f62490d.f61333m;
                    C22099a aVar3 = new C22099a(pVar, aVar2);
                    if (!eVar.f57537e) {
                        Log.m105920e("MicroMsg.ReIdAiScanImageDecodeQueue", "decodeFullImage is not working");
                    } else {
                        C20469e.m22085e(new C20468d(eVar, i, rectF, aVar3));
                    }
                } else {
                    Log.m105920e("MicroMsg.AiScanImageGetProductTask", "getProductTask uploadFullImage success but no goodsObject");
                    C19021i0.f53458d = false;
                    this.f62497a.f62491e.mo33927i(pVar, pVar.f61353a, pVar.f61354b, 4, -1, "upload full image no goodsObject");
                    C22095a aVar4 = this.f62497a;
                    aVar4.f62491e.mo33921c(aVar4);
                }
            }
        }

        /* renamed from: h */
        public void mo33926h(C22105d dVar) {
            C87412m.m108594g(dVar, "task");
            C22095a aVar = this.f62497a;
            aVar.f62491e.mo33926h(aVar);
        }

        /* renamed from: i */
        public void mo33927i(C21680p pVar, int i, long j, int i2, int i3, String str) {
            C87412m.m108594g(pVar, "result");
            this.f62497a.f62491e.mo33927i(pVar, i, j, i2, i3, str);
            C22095a aVar = this.f62497a;
            aVar.f62491e.mo33921c(aVar);
            if (pVar.f61355c != 1) {
                C19021i0.f53458d = false;
            }
        }
    }

    public C22095a(C21670h hVar, C22096a aVar) {
        C87412m.m108594g(hVar, "request");
        C87412m.m108594g(aVar, "getProductCallback");
        this.f62490d = hVar;
        this.f62491e = aVar;
    }

    /* renamed from: a */
    public static final void m25508a(C22095a aVar, C21680p pVar) {
        C21670h hVar = aVar.f62490d;
        long j = hVar.f61283b;
        C21668f fVar = new C21668f(hVar.f61326f, pVar);
        C21670h hVar2 = aVar.f62490d;
        fVar.f61283b = hVar2.f61283b;
        fVar.f61284c = hVar2.f61284c;
        fVar.f61285d = hVar2.f61285d;
        C13598b0 b0Var = C13598b0.f38549a;
        C22101b bVar = new C22101b(j, fVar, aVar.f62495i);
        Log.m105918d("MicroMsg.AiScanImageRetrievalTask", "runImageRetrievalTask");
        bVar.f62504g.mo33919a(bVar);
        bVar.f62530d = false;
        C86709a0.m107524d().mo123455a(5057, bVar);
        long j2 = bVar.f62502e;
        C21668f fVar2 = bVar.f62503f;
        int i = fVar2.f61284c;
        Log.m105925i("MicroMsg.AiScanImageRetrievalTask", "doRetrieval session: %d, source: %d, reqKey size: %s", Long.valueOf(j2), Integer.valueOf(i), Integer.valueOf(fVar2.f61323g.f61356d.size()));
        if (i == 3 || i == 4) {
            ArrayList arrayList = new ArrayList();
            Iterator<C109753o> it = fVar2.f61323g.f61356d.iterator();
            while (it.hasNext()) {
                C109753o next = it.next();
                next.f328500g = 2;
                bVar.f62507j.add(Integer.valueOf(next.f328501h));
                arrayList.add(next.f328502i);
            }
            C57321o oVar = new C57321o(arrayList, false, (C64852yd) null);
            fVar2.f61286e = oVar;
            C86709a0.m107524d().mo123460f(oVar);
            bVar.f62504g.mo33928j(fVar2);
        } else {
            bVar.mo35187b(i, -1, "invalid source: " + i);
        }
        aVar.f62492f = bVar;
    }

    /* renamed from: b */
    public void mo35185b() {
        Log.m105926v("MicroMsg.AiScanImageGetProductTask", "getProductTask cancel");
        C22107e eVar = this.f62493g;
        if (eVar != null) {
            Log.m105918d("MicroMsg.AiScanImageUploadTask", "cancelImageUploadTask isFinished: " + eVar.f62530d);
            eVar.f62518h = true;
            if (!eVar.f62530d) {
                eVar.f62517g.mo33926h(eVar);
            }
            C86709a0.m107524d().mo123470p(5105, eVar);
            C86709a0.m107524d().mo123458d(eVar.f62516f.f61286e);
        }
        C22101b bVar = this.f62492f;
        if (bVar != null) {
            Log.m105918d("MicroMsg.AiScanImageRetrievalTask", "cancelImageRetrievalTask isFinished: " + bVar.f62530d);
            bVar.f62506i = true;
            if (!bVar.f62530d) {
                bVar.f62504g.mo33926h(bVar);
            }
            C86709a0.m107524d().mo123470p(5057, bVar);
            C86709a0.m107524d().mo123458d(bVar.f62503f.f61286e);
        }
        if (this.f62493g == null && this.f62492f == null) {
            this.f62491e.mo33926h(this);
        }
    }
}
