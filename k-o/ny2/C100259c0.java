package ny2;

import android.view.View;
import com.tencent.p014mm.plugin.teenmode.p111ui.TeenModePrivatePwdUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ny2.c0 */
public final class C100259c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TeenModePrivatePwdUI f293735d;

    public C100259c0(TeenModePrivatePwdUI teenModePrivatePwdUI) {
        this.f293735d = teenModePrivatePwdUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f293735d.hideTenpayKB();
        C117292a.m165361g(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
