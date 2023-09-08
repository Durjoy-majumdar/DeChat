package qo3;

import android.view.View;
import fy3.C32224a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;

public class w$$b implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ View f36946d;

    /* renamed from: e */
    public final /* synthetic */ w$$c f36947e;

    /* renamed from: f */
    public final /* synthetic */ C12925w f36948f;

    public w$$b(C12925w wVar, View view, w$$c w__c) {
        this.f36948f = wVar;
        this.f36946d = view;
        this.f36947e = w__c;
    }

    public Object invoke() {
        View view = this.f36946d;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$4", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/widget/dialog/MMCustomHalfBottomDialog$4", "invoke", "()Lkotlin/Unit;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f36947e.mo4872b();
        w$$c w__c = this.f36947e;
        w__c.f36949a = null;
        this.f36948f.f36923D.remove(w__c);
        this.f36948f.f36922C.removeView(this.f36946d);
        return C13598b0.f38549a;
    }
}
