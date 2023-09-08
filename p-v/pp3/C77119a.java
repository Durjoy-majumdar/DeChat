package pp3;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C75057b1;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp3.a */
public final class C77119a extends C87413o implements C32226l<C75057b1, C13598b0> {

    /* renamed from: d */
    public static final C77119a f225228d = new C77119a();

    public C77119a() {
        super(1);
    }

    public Object invoke(Object obj) {
        C75057b1 b1Var = (C75057b1) obj;
        C87412m.m108594g(b1Var, "$this$storage");
        String name = SharePatchFileUtil.getPatchDirectory(MMApplicationContext.getContext()).getName();
        C87412m.m108593f(name, "getPatchDirectory(MMAppl…ontext.getContext()).name");
        b1Var.f220825b = name;
        b1Var.mo104652h("${data}/${dir}");
        b1Var.f220830g = Boolean.FALSE;
        b1Var.mo104651g();
        return C13598b0.f38549a;
    }
}
