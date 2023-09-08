package ul2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanSharedMaskView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ul2.k0 */
public final class C78228k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanSharedMaskView f229190d;

    public C78228k0(ScanSharedMaskView scanSharedMaskView) {
        this.f229190d = scanSharedMaskView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View.OnClickListener onClickListener = this.f229190d.f53817t;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/ui/widget/ScanSharedMaskView$init$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
