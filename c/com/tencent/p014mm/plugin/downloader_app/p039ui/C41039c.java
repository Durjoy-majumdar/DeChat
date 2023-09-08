package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.view.View;
import com.tencent.p014mm.plugin.downloader_app.model.C40983c;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.c */
public class C41039c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TaskItemView f110500d;

    public C41039c(TaskItemView taskItemView) {
        this.f110500d = taskItemView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TaskItemView.C41028a aVar = this.f110500d.f110456C;
        if (aVar == null || !((DownloadMainUI.C41023d) aVar).mo64061a(view, 2)) {
            C40983c.m44422d(this.f110500d.getContext(), this.f110500d.f110454A);
            C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
