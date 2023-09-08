package o52;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54219z;
import c14.C54624g;
import com.tencent.p014mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView;
import d14.C58017a1;
import d14.C58085t0;
import d14.C58100z0;
import java.util.List;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;

/* renamed from: o52.e */
public final class C61944e extends C39622i0 {

    /* renamed from: d */
    public final C58085t0<Object> f176075d = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);

    /* renamed from: e */
    public final C54219z<List<C61943d>> f176076e = new C54219z<>();

    /* renamed from: c3 */
    public final Object mo86857c3(MagicBrushSclDemoView magicBrushSclDemoView, C15601d<? super C13598b0> dVar) {
        Object emit = ((C58100z0) this.f176075d).emit(new C35106a(magicBrushSclDemoView), dVar);
        return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
    }

    /* renamed from: d3 */
    public final Object mo86858d3(String str, String str2, C15601d<? super C13598b0> dVar) {
        Object emit = ((C58100z0) this.f176075d).emit(new C11353b(str, str2), dVar);
        return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
    }

    /* renamed from: e3 */
    public final Object mo86859e3(String str, C15601d<? super C13598b0> dVar) {
        Object emit = ((C58100z0) this.f176075d).emit(new C11354h(str), dVar);
        return emit == C15911a.COROUTINE_SUSPENDED ? emit : C13598b0.f38549a;
    }
}
