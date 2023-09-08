package gs3;

import a14.C0000n0;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fs3.C59316c;
import fs3.C59318d;
import fy3.C32227p;
import hs3.C60149a;
import java.util.Map;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.plugin.finder.detector.api.detect.FinderEventDetector$realReport$3", mo125469f = "FinderEventDetector.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: gs3.b */
public final class C59697b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C60149a f170539d;

    /* renamed from: e */
    public final /* synthetic */ Map.Entry<String, C59316c<C59318d>> f170540e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59697b(C60149a aVar, Map.Entry<String, C59316c<C59318d>> entry, C15601d<? super C59697b> dVar) {
        super(2, dVar);
        this.f170539d = aVar;
        this.f170540e = entry;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C59697b(this.f170539d, this.f170540e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C59697b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Context context = MMApplicationContext.getContext();
        C76912y0.m92770i(context, "Debug播放器泄漏：" + this.f170539d.f171695a + "\n trace: " + this.f170540e.getValue().f169614b);
        return C13598b0.f38549a;
    }
}
