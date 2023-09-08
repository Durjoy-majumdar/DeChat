package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.p136ui.MMActivity;
import fo1.C59264a;
import gy3.C87412m;
import jp3.C9486a;
import jp3.C9487b;
import jq3.C9500j;
import on1.C11530i0;
import on1.C11548q;

/* renamed from: kf1.n */
public abstract class C9864n<T extends C0740i2> implements C59264a<C9897o<T>>, C9487b<C9486a> {

    /* renamed from: d */
    public final MMActivity f30442d;

    /* renamed from: e */
    public final C11548q<T> f30443e;

    /* renamed from: f */
    public C9897o<T> f30444f;

    /* renamed from: g */
    public C11530i0<T> f30445g;

    public C9864n(MMActivity mMActivity, int i, int i2, C11548q<T> qVar) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(qVar, "feedLoader");
        this.f30442d = mMActivity;
        this.f30443e = qVar;
    }

    /* renamed from: U */
    public abstract C9500j mo2476U();

    public void keep(C9486a aVar) {
    }

    /* renamed from: o */
    public abstract void mo2478o();

    public void onDetach() {
        this.f30443e.f33893n = null;
    }

    public abstract void requestRefresh();
}
