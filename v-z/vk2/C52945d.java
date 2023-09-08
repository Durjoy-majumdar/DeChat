package vk2;

import android.view.View;
import com.tencent.p014mm.plugin.scanner.box.BaseBoxDialogView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vk2.d */
public final class C52945d implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseBoxDialogView f147789d;

    public C52945d(BaseBoxDialogView baseBoxDialogView) {
        this.f147789d = baseBoxDialogView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/scanner/box/BaseBoxDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f147789d.mo151551c(4);
        C117292a.m165361g(this, "com/tencent/mm/plugin/scanner/box/BaseBoxDialogView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
