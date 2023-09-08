package gr1;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import o40.C61926c;
import p914oj.C89231c;
import rx3.C13598b0;
import sp3.C36777d;
import te3.C64689rq2;

/* renamed from: gr1.v0 */
public final class C98181v0 implements C36777d {

    /* renamed from: a */
    public final String f287848a = "MicroMsg.FinderVideoThumbFetcherFactory";

    /* renamed from: b */
    public C89231c f287849b;

    /* renamed from: gr1.v0$a */
    public static final class C98182a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<Long> f287850d;

        /* renamed from: e */
        public final /* synthetic */ C98181v0 f287851e;

        /* renamed from: f */
        public final /* synthetic */ C32227p<Long, Bitmap, C13598b0> f287852f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98182a(List<Long> list, C98181v0 v0Var, C32227p<? super Long, ? super Bitmap, C13598b0> pVar) {
            super(0);
            this.f287850d = list;
            this.f287851e = v0Var;
            this.f287852f = pVar;
        }

        public Object invoke() {
            List<Long> list = this.f287850d;
            C98181v0 v0Var = this.f287851e;
            C32227p<Long, Bitmap, C13598b0> pVar = this.f287852f;
            Bitmap bitmap = null;
            for (Number longValue : list) {
                long longValue2 = longValue.longValue();
                C89231c cVar = v0Var.f287849b;
                Bitmap frameAtTime = cVar != null ? cVar.getFrameAtTime(((long) 1000) * longValue2, 2) : null;
                if (frameAtTime != null) {
                    bitmap = frameAtTime;
                }
                pVar.invoke(Long.valueOf(longValue2), bitmap);
            }
            return C13598b0.f38549a;
        }
    }

    public C98181v0(C64689rq2 rq22) {
        C87412m.m108594g(rq22, "media");
        C89231c cVar = new C89231c();
        this.f287849b = cVar;
        try {
            cVar.setDataSource(rq22.f185266d);
        } catch (Exception e) {
            Log.printErrStackTrace(this.f287848a, e, "", new Object[0]);
        }
    }

    /* renamed from: C */
    public void mo58663C(int i, int i2) {
    }

    /* renamed from: a */
    public void mo58664a(long j) {
    }

    /* renamed from: b */
    public void mo58665b(List<Long> list, C32227p<? super Long, ? super Bitmap, C13598b0> pVar) {
        C87412m.m108594g(list, "times");
        C87412m.m108594g(pVar, "callback");
        C61926c.m72657B("FinderNormalVideoThumbFetcher_requestFrames", true, new C98182a(list, this, pVar));
    }

    public void destroy() {
        C89231c cVar = this.f287849b;
        if (cVar != null) {
            cVar.release();
        }
        this.f287849b = null;
    }
}
