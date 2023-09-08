package c81;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76630x0;
import tv2.C14096e;

/* renamed from: c81.g */
public final class C0430g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C39904a f1054d;

    public C0430g(C39904a aVar) {
        this.f1054d = aVar;
    }

    public final void onClick(View view) {
        Class cls = C32735h.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C14096e.m13447a(8);
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.f245533f = 1063;
        AppCompatActivity activity = this.f1054d.getActivity();
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_wesports_appbrand_path_appid_and, "wxff244f6b82a094d2");
        this.f1054d.getClass();
        String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_wesports_appbrand_path_profile_and, "pages/whole/match/main.html?spm=59.2486.2570");
        C87412m.m108593f(Y602, "getService(IExptService:…ON_APPBRAND_PATH_PROFILE)");
        ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(activity, (String) null, Y60, 0, 0, Y602, appBrandStatObject);
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
