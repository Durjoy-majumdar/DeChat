package ai0;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import java.util.Map;

public final /* synthetic */ class q$$a implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C79575q f233342d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f233343e;

    public /* synthetic */ q$$a(C79575q qVar, ViewGroup viewGroup) {
        this.f233342d = qVar;
        this.f233343e = viewGroup;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        C79575q qVar = this.f233342d;
        ViewGroup viewGroup = this.f233343e;
        qVar.getClass();
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        if ((i == i5 && i2 == i6 && i3 == i7 && i4 == i8) ? false : true) {
            int height = viewGroup.getHeight();
            int width = viewGroup.getWidth();
            AppBrandRuntimeWC appBrandRuntimeWC = qVar.f233331b;
            if (appBrandRuntimeWC != null && (i9 = qVar.f233334e) != 9 && i9 != 0) {
                appBrandRuntimeWC.f238295w1.mo113817f(new q$$b(qVar, width, height));
            }
        }
    }
}
