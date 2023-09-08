package cj1;

import al1.C54130j;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87413o;

/* renamed from: cj1.a5 */
public final class C0516a5 extends C87413o implements C32226l<C54130j, Boolean> {

    /* renamed from: d */
    public static final C0516a5 f1254d = new C0516a5();

    public C0516a5() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = ((C54130j) obj).f151997a;
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        return Boolean.valueOf(Util.isEqual(str, oVar != null ? oVar.mo76015n4() : null));
    }
}
