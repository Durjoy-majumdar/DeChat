package wg1;

import cl1.C54991o;
import cl1.C54994o1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import o40.C61926c;
import qg1.C47826f;
import rx3.C13598b0;
import te3.C50415mk1;

/* renamed from: wg1.n0 */
public final class C66062n0 implements C47826f.C47827a {

    /* renamed from: a */
    public final /* synthetic */ C66045m0 f189918a;

    /* renamed from: b */
    public final /* synthetic */ boolean f189919b;

    /* renamed from: wg1.n0$a */
    public static final class C66063a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189920d;

        /* renamed from: e */
        public final /* synthetic */ boolean f189921e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66063a(C66045m0 m0Var, boolean z) {
            super(0);
            this.f189920d = m0Var;
            this.f189921e = z;
        }

        public Object invoke() {
            ((C54994o1) this.f189920d.f189882f.mo71262a(C54994o1.class)).f154402i.postValue(Boolean.valueOf(!this.f189921e));
            MMSwitchBtn mMSwitchBtn = this.f189920d.f189891r;
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setCheck(!this.f189921e);
            }
            this.f189920d.f189883g.mo90054q1(!this.f189921e);
            C76912y0.m92767f(this.f189920d.f189880d.getContext(), this.f189920d.f189880d.getContext().getResources().getString(C0966R.string.mby));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wg1.n0$b */
    public static final class C66064b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66045m0 f189922d;

        /* renamed from: e */
        public final /* synthetic */ boolean f189923e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66064b(C66045m0 m0Var, boolean z) {
            super(0);
            this.f189922d = m0Var;
            this.f189923e = z;
        }

        public Object invoke() {
            Class cls = C54991o.class;
            ((C54991o) this.f189922d.f189882f.mo71262a(cls)).mo75982R4((long) ((C54991o) this.f189922d.f189882f.mo71262a(cls)).f154354q);
            ((C54994o1) this.f189922d.f189882f.mo71262a(C54994o1.class)).f154402i.postValue(Boolean.valueOf(this.f189923e));
            return C13598b0.f38549a;
        }
    }

    public C66062n0(C66045m0 m0Var, boolean z) {
        this.f189918a = m0Var;
        this.f189919b = z;
    }

    /* renamed from: a */
    public void mo9151a(int i, long j, C50415mk1 mk12) {
    }

    /* renamed from: b */
    public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
    }

    /* renamed from: c */
    public void mo9153c(int i, long j) {
        C61926c.m72668M(new C66064b(this.f189918a, this.f189919b));
    }

    /* renamed from: d */
    public void mo9154d(int i, int i2, String str, int i3) {
        C61926c.m72668M(new C66063a(this.f189918a, this.f189919b));
    }
}
