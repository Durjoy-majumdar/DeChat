package us2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import qo3.C101218e0;
import rx3.C13598b0;

/* renamed from: us2.a */
public final class C14381a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f39949d;

    /* renamed from: e */
    public final /* synthetic */ C32227p<Boolean, Map<String, ? extends Object>, C13598b0> f39950e;

    public C14381a(C101218e0 e0Var, C32227p<? super Boolean, ? super Map<String, ? extends Object>, C13598b0> pVar) {
        this.f39949d = e0Var;
        this.f39950e = pVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$1");
        this.f39949d.mo140680z();
        HashMap hashMap = new HashMap();
        hashMap.put("ret", "0");
        hashMap.put("err_msg", "cancel");
        this.f39950e.invoke(Boolean.FALSE, hashMap);
        Log.m105924i("AdHfRequestNumberDialogHelper", "handleBindPhoneNumber, cancel");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
