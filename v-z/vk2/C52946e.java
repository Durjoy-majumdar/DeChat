package vk2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vk2.e */
public final class C52946e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseBoxDialogView f147790d;

    public C52946e(BaseBoxDialogView baseBoxDialogView) {
        this.f147790d = baseBoxDialogView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/box/BaseBoxDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        BaseBoxDialogView baseBoxDialogView = this.f147790d;
        if (!baseBoxDialogView.f315747T0) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        baseBoxDialogView.mo151551c(3);
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView$initDialogBg$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
