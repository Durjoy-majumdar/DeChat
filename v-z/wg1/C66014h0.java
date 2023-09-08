package wg1;

import cl1.C54994o1;
import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C45377n;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13598b0;
import te3.C50708oo0;
import te3.t94;

/* renamed from: wg1.h0 */
public final class C66014h0 implements C45377n.C45378a {

    /* renamed from: a */
    public final /* synthetic */ C66010g0 f189785a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<Integer, C13598b0> f189786b;

    /* renamed from: wg1.h0$a */
    public static final class C66015a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f189787d;

        /* renamed from: e */
        public final /* synthetic */ int f189788e;

        /* renamed from: f */
        public final /* synthetic */ C66010g0 f189789f;

        /* renamed from: g */
        public final /* synthetic */ C50708oo0 f189790g;

        /* renamed from: h */
        public final /* synthetic */ C32226l<Integer, C13598b0> f189791h;

        /* renamed from: i */
        public final /* synthetic */ String f189792i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66015a(int i, int i2, C66010g0 g0Var, C50708oo0 oo02, C32226l<? super Integer, C13598b0> lVar, String str) {
            super(0);
            this.f189787d = i;
            this.f189788e = i2;
            this.f189789f = g0Var;
            this.f189790g = oo02;
            this.f189791h = lVar;
            this.f189792i = str;
        }

        public Object invoke() {
            int i = 0;
            if (this.f189787d == 0 && this.f189788e == 0) {
                ((C54994o1) this.f189789f.f189771e.mo71262a(C54994o1.class)).f154399f.mo75661d(this.f189790g, this.f189789f.f189770d);
                C32226l<Integer, C13598b0> lVar = this.f189791h;
                LinkedList<t94> linkedList = this.f189790g.f139275d;
                if (linkedList != null) {
                    i = linkedList.size();
                }
                lVar.invoke(Integer.valueOf(i));
            } else {
                Log.m105924i("FinderLiveAnchorMusicSingSongPresenter", "cgi getSingSongList failed errType: " + this.f189787d + ", errCode: " + this.f189788e + ", errMsg: " + this.f189792i);
                this.f189791h.invoke(0);
            }
            return C13598b0.f38549a;
        }
    }

    public C66014h0(C66010g0 g0Var, C32226l<? super Integer, C13598b0> lVar) {
        this.f189785a = g0Var;
        this.f189786b = lVar;
    }

    /* renamed from: a */
    public void mo70893a(int i, int i2, String str, C50708oo0 oo02) {
        C87412m.m108594g(oo02, "resp");
        C61926c.m72668M(new C66015a(i, i2, this.f189785a, oo02, this.f189786b, str));
    }
}
