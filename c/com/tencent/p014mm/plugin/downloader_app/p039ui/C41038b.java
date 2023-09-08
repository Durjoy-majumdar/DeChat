package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.view.View;
import c51.C39890a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader_app.model.C40983c;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.model.C41000n;
import com.tencent.p014mm.plugin.downloader_app.model.C41001o;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.vfs.C86013q1;
import g51.C45880a;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.b */
public class C41038b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TaskItemView f110499d;

    public C41038b(TaskItemView taskItemView) {
        this.f110499d = taskItemView;
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TaskItemView.C41028a aVar = this.f110499d.f110456C;
        if (aVar == null || !((DownloadMainUI.C41023d) aVar).mo64061a(view2, 3)) {
            TaskItemView taskItemView = this.f110499d;
            C40990e0 e0Var = taskItemView.f110454A;
            if (e0Var.f110332c == 6) {
                Context context = taskItemView.getContext();
                C40990e0 e0Var2 = this.f110499d.f110454A;
                if (C72688j0.m85020f(context, e0Var2.f110342m.f147350e)) {
                    C39890a.m42669b(context, e0Var2.f110345p, e0Var2.f110335f, e0Var2.f110338i);
                    C45880a.m51163b(10, C45880a.m51162a(e0Var2.f110332c), e0Var2.f110333d, 22, e0Var2.f110335f, "", "");
                } else {
                    C76879j.m92709C(context, context.getString(C0966R.string.a3n), context.getString(C0966R.string.a3o), context.getString(C0966R.string.i47), context.getString(C0966R.string.jvd), false, new C41000n(context, e0Var2), new C41001o());
                }
            } else {
                C53736a d = C40933j.m44315d(e0Var.f110335f);
                if (d == null) {
                    C40983c.m44420b(this.f110499d.getContext(), this.f110499d.f110454A, false);
                } else if (!this.f110499d.f110465o.getText().equals(this.f110499d.getResources().getString(C0966R.string.gqe))) {
                    C40983c.m44420b(this.f110499d.getContext(), this.f110499d.f110454A, false);
                } else if (!C86013q1.m106450k(d.field_filePath)) {
                    C40983c.m44420b(this.f110499d.getContext(), this.f110499d.f110454A, false);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/downloader_app/ui/TaskItemView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
