package rs1;

import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import k03.C60931a;

/* renamed from: rs1.ab */
public final class C63544ab extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ Class<? extends C59670o2> f180222d;

    /* renamed from: e */
    public final /* synthetic */ Class<? extends C60931a> f180223e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f180224f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63544ab(Class<? extends C59670o2> cls, Class<? extends C60931a> cls2, C8478d0 d0Var) {
        super(1);
        this.f180222d = cls;
        this.f180223e = cls2;
        this.f180224f = d0Var;
    }

    public Object invoke(Object obj) {
        Class<? extends C60931a> cls;
        C60931a renderView;
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        Class<? extends C59670o2> cls2 = this.f180222d;
        if ((cls2 == null || cls2.isAssignableFrom(o2Var.getClass())) && (cls = this.f180223e) != null) {
            Class<?> cls3 = null;
            FinderThumbPlayerProxy finderThumbPlayerProxy = o2Var instanceof FinderThumbPlayerProxy ? (FinderThumbPlayerProxy) o2Var : null;
            if (!(finderThumbPlayerProxy == null || (renderView = finderThumbPlayerProxy.getRenderView()) == null)) {
                cls3 = renderView.getClass();
            }
            if (cls.isAssignableFrom(cls3)) {
                this.f180224f.f27483d++;
            }
        }
        return Boolean.FALSE;
    }
}
