package zs1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: zs1.p */
public final class C53819p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C53815m f151035d;

    public C53819p(C53815m mVar) {
        this.f151035d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f151035d.f151028k;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.f151035d.mo74432a();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/webview/ad/ScrollWebViewDialogHelper$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
