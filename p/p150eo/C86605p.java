package p150eo;

import com.tencent.p014mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import fy3.C32224a;
import gy3.C87413o;
import i70.C87667c;
import rx3.C13598b0;

/* renamed from: eo.p */
public final class C86605p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C86596j f251557d;

    /* renamed from: e */
    public final /* synthetic */ String f251558e;

    /* renamed from: f */
    public final /* synthetic */ String f251559f;

    /* renamed from: g */
    public final /* synthetic */ String f251560g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86605p(C86596j jVar, String str, String str2, String str3) {
        super(0);
        this.f251557d = jVar;
        this.f251558e = str;
        this.f251559f = str2;
        this.f251560g = str3;
    }

    public Object invoke() {
        C86596j jVar = this.f251557d;
        C87667c<?, ?>.a aVar = jVar.f251537q;
        if (aVar != null) {
            String str = this.f251558e;
            String str2 = this.f251559f;
            String str3 = this.f251560g;
            Log.m105924i("MicroMsg.MagicBrandBaseBiz", "preLayout from native " + aVar + ".id frameSet:" + str + " data:" + str2.length() + " ext:" + str3);
            jVar.f251534n.mo121181s(aVar.f253930e, str, str2, C19636w0.f55627d ? MagicSclBrandReporter.PreloadScene.InBox : MagicSclBrandReporter.PreloadScene.OutBox, str3, C7771o.f26266d);
        }
        return C13598b0.f38549a;
    }
}
