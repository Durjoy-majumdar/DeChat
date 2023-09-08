package a10;

import a10.C112726y;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.flutter.p837ui.FlutterPageInfo;
import com.tencent.p014mm.flutter.p837ui.FlutterPageStyle;
import com.tencent.p014mm.flutter.p837ui.FlutterViewEngine;
import fy3.C32224a;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: a10.a0 */
public final class C112711a0 implements C112724v, C112726y.C112727a {

    /* renamed from: d */
    public final ViewGroup f337450d;

    /* renamed from: e */
    public final C39623j f337451e;

    /* renamed from: f */
    public final FlutterPageStyle f337452f;

    /* renamed from: g */
    public C32224a<C13598b0> f337453g;

    /* renamed from: h */
    public final FlutterPageInfo f337454h;

    /* renamed from: i */
    public final FlutterViewEngine f337455i;

    public C112711a0(C112726y yVar, ViewGroup viewGroup, C39623j jVar, FlutterPageStyle flutterPageStyle) {
        C87412m.m108594g(yVar, "instance");
        C87412m.m108594g(viewGroup, "parent");
        C87412m.m108594g(jVar, "flutterLifeCycle");
        C87412m.m108594g(flutterPageStyle, "style");
        this.f337450d = viewGroup;
        this.f337451e = jVar;
        this.f337452f = flutterPageStyle;
        this.f337454h = new FlutterPageInfo(yVar.f337506c, yVar.f337504a.f337470d, yVar.f337505b, "");
        FlutterViewEngine flutterViewEngine = new FlutterViewEngine(this);
        this.f337455i = flutterViewEngine;
        flutterViewEngine.mo174307e();
    }

    /* renamed from: B2 */
    public void mo164446B2(C112726y.C112727a aVar) {
        C87412m.m108594g(aVar, "host");
        this.f337455i.onDestroy();
        C32224a<C13598b0> aVar2 = this.f337453g;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    /* renamed from: E3 */
    public FlutterPageInfo mo164447E3() {
        return this.f337454h;
    }

    /* renamed from: E5 */
    public ViewGroup mo164448E5() {
        return this.f337450d;
    }

    /* renamed from: G2 */
    public FlutterPageStyle mo164449G2() {
        return this.f337452f;
    }

    /* renamed from: M3 */
    public void mo164450M3(boolean z) {
    }

    public AppCompatActivity getActivity() {
        return null;
    }

    public void pop() {
    }

    /* renamed from: w7 */
    public C39623j mo164453w7() {
        return this.f337451e;
    }
}
