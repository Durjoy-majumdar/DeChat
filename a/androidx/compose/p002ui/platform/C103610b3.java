package androidx.compose.p002ui.platform;

import android.view.View;
import android.view.ViewParent;
import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C87413o;
import java.util.Set;
import p175j0.C108502g1;
import p175j0.C108504h;
import p175j0.C108513w;
import p175j0.C60655g0;
import p415q0.C110261c;
import p708u0.C111062b;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: androidx.compose.ui.platform.b3 */
public final class C103610b3 extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ WrappedComposition f306059d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<C108504h, Integer, C13598b0> f306060e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103610b3(WrappedComposition wrappedComposition, C32227p<? super C108504h, ? super Integer, C13598b0> pVar) {
        super(2);
        this.f306059d = wrappedComposition;
        this.f306060e = pVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            Object tag = this.f306059d.f306042d.getTag(C0966R.C0970id.f84);
            Set set = C24564k0.m30745i(tag) ? (Set) tag : null;
            if (set == null) {
                ViewParent parent = this.f306059d.f306042d.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(C0966R.C0970id.f84) : null;
                set = C24564k0.m30745i(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(hVar.mo51558I());
                hVar.mo51600n();
            }
            WrappedComposition wrappedComposition = this.f306059d;
            C60655g0.m70932c(wrappedComposition.f306042d, new C103710y2(wrappedComposition, (C15601d<? super C103710y2>) null), hVar, 8);
            WrappedComposition wrappedComposition2 = this.f306059d;
            C60655g0.m70932c(wrappedComposition2.f306042d, new C103712z2(wrappedComposition2, (C15601d<? super C103712z2>) null), hVar, 8);
            C108513w.m147056a(new C108502g1[]{C111062b.f332589a.mo159370b(set)}, C110261c.m149878b(hVar, -1193460702, true, new C103606a3(this.f306059d, this.f306060e)), hVar, 56);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
