package j04;

import b04.C23643b;
import b04.C23649g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import n04.C25143j0;
import wy3.C26448e0;

/* renamed from: j04.n */
public final class C24767n extends C23643b {

    /* renamed from: c */
    public final C25143j0 f70652c;

    /* renamed from: j04.n$a */
    public static final class C24768a extends C87413o implements C32226l<C26448e0, C25143j0> {

        /* renamed from: d */
        public final /* synthetic */ C25143j0 f70653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24768a(C25143j0 j0Var) {
            super(1);
            this.f70653d = j0Var;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C26448e0) obj, LocaleUtil.ITALIAN);
            return this.f70653d;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24767n(List<? extends C23649g<?>> list, C25143j0 j0Var) {
        super(list, new C24768a(j0Var));
        C87412m.m108594g(list, "value");
        C87412m.m108594g(j0Var, "type");
        this.f70652c = j0Var;
    }
}
