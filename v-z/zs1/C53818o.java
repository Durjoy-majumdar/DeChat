package zs1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ExpandableScrollFrameLayout;
import com.tencent.p014mm.plugin.finder.webview.p800ad.ScrollFrameLayout;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zs1.o */
public final class C53818o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53815m f151034d;

    public C53818o(C53815m mVar) {
        this.f151034d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C53815m mVar = this.f151034d;
        ScrollFrameLayout scrollFrameLayout = mVar.f151029l;
        if (scrollFrameLayout instanceof ExpandableScrollFrameLayout) {
            ((ExpandableScrollFrameLayout) scrollFrameLayout).mo64809m();
        } else {
            mVar.f151018a.mo64703a().dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
