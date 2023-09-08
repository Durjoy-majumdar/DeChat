package j51;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import di3.C86312j;
import e51.C45547h;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: j51.n */
public class C46413n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TaskItemView f125020d;

    public C46413n(TaskItemView taskItemView) {
        this.f125020d = taskItemView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Bundle bundle = new Bundle();
        bundle.putString("rawUrl", this.f125020d.f110454A.f110342m.f147366x);
        ((C45547h) C86312j.m106911c(C45547h.class)).mo70790RH(this.f125020d.getContext(), bundle);
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
