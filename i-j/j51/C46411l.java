package j51;

import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45547h;
import g51.C45880a;
import j20.C117292a;
import java.util.ArrayList;
import v41.C52743b;

/* renamed from: j51.l */
public class C46411l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TaskItemView f125018d;

    public C46411l(TaskItemView taskItemView) {
        this.f125018d = taskItemView;
    }

    public void onClick(View view) {
        C52743b bVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C40990e0 e0Var = this.f125018d.f110454A;
        if (!(e0Var == null || (bVar = e0Var.f110344o) == null || Util.isNullOrNil(bVar.f147348g))) {
            Bundle bundle = new Bundle();
            bundle.putString("rawUrl", this.f125018d.f110454A.f110344o.f147348g);
            ((C45547h) C86312j.m106911c(C45547h.class)).mo70790RH(this.f125018d.getContext(), bundle);
            C40990e0 e0Var2 = this.f125018d.f110454A;
            C45880a.m51163b(10, 1006, e0Var2.f110333d, 40, e0Var2.f110335f, "", "");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
