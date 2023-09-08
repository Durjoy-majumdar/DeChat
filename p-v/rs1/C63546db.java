package rs1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: rs1.db */
public final class C63546db extends C87413o implements C32226l<C59670o2, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ Context f180226d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f180227e;

    /* renamed from: f */
    public final /* synthetic */ FinderVideoRecycler f180228f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63546db(Context context, C8478d0 d0Var, FinderVideoRecycler finderVideoRecycler) {
        super(1);
        this.f180226d = context;
        this.f180227e = d0Var;
        this.f180228f = finderVideoRecycler;
    }

    public Object invoke(Object obj) {
        C59670o2 o2Var = (C59670o2) obj;
        C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
        boolean z = true;
        if (o2Var.getContextTag() == this.f180226d.hashCode()) {
            this.f180227e.f27483d++;
            o2Var.mo78608c();
            o2Var.mo78609d();
            this.f180228f.mo80084k3(o2Var.getVideoView());
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
