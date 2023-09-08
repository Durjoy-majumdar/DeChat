package to1;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: to1.o */
public final class C14061o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Runnable f39452d;

    public C14061o(Runnable runnable) {
        this.f39452d = runnable;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f39452d.run();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/record/plugin/FinderRecordControlPlugin$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
