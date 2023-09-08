package p683s0;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C60690y0;

/* renamed from: s0.c */
public final class C110674c extends C87413o implements C32224a<Object> {

    /* renamed from: d */
    public final /* synthetic */ C60690y0<C36601l<Object, Object>> f331083d;

    /* renamed from: e */
    public final /* synthetic */ Object f331084e;

    /* renamed from: f */
    public final /* synthetic */ C110688i f331085f;

    /* renamed from: s0.c$a */
    public static final class C110675a implements C36606n {

        /* renamed from: a */
        public final /* synthetic */ C110688i f331086a;

        public C110675a(C110688i iVar) {
            this.f331086a = iVar;
        }

        /* renamed from: a */
        public final boolean mo60751a(Object obj) {
            C87412m.m108594g(obj, LocaleUtil.ITALIAN);
            return this.f331086a.mo60744a(obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110674c(C60690y0<C36601l<Object, Object>> y0Var, Object obj, C110688i iVar) {
        super(0);
        this.f331083d = y0Var;
        this.f331084e = obj;
        this.f331085f = iVar;
    }

    public final Object invoke() {
        return this.f331083d.getValue().mo60749a(new C110675a(this.f331085f), this.f331084e);
    }
}
