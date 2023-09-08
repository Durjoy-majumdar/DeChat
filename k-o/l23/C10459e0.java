package l23;

import android.view.View;
import com.google.android.material.bottomsheet.C104428a;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: l23.e0 */
public final class C10459e0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C104428a f31694d;

    public C10459e0(C104428a aVar) {
        this.f31694d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin$helpDialog$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f31694d.hide();
        C117292a.m165361g(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditPostPreviewPlugin$helpDialog$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
