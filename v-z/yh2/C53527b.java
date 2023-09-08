package yh2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: yh2.b */
public final class C53527b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C102864a f150495d;

    public C53527b(C102864a aVar) {
        this.f150495d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView$captionLoadingLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ViewParent parent = this.f150495d.getParent();
        C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(this.f150495d);
        C32226l<View, C13598b0> clearCaptionListener = this.f150495d.getClearCaptionListener();
        if (clearCaptionListener != null) {
            clearCaptionListener.invoke(this.f150495d);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView$captionLoadingLayout$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
