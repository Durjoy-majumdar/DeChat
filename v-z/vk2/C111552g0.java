package vk2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.box.ScanOCRDialogBackgroundOpView;
import j20.C117292a;
import java.util.ArrayList;
import vk2.C111550g;

/* renamed from: vk2.g0 */
public final class C111552g0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ScanOCRDialogBackgroundOpView f333971d;

    public C111552g0(ScanOCRDialogBackgroundOpView scanOCRDialogBackgroundOpView) {
        this.f333971d = scanOCRDialogBackgroundOpView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C111550g.C111551a aVar = this.f333971d.f315796d;
        if (aVar != null) {
            aVar.onClick(view);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/box/ScanOCRDialogBackgroundOpView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
