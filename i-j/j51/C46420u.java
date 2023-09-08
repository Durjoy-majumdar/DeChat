package j51;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader_app.model.C29855f0;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.model.C41008v;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskListView;
import di3.C86312j;
import g51.C45880a;
import java.util.Iterator;
import java.util.LinkedList;
import p237sp.C13754y;
import z41.C53736a;

/* renamed from: j51.u */
public class C46420u implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TaskListView f125026d;

    public C46420u(TaskListView taskListView) {
        this.f125026d = taskListView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        TaskListView taskListView = this.f125026d;
        taskListView.getClass();
        LinkedList linkedList = new LinkedList();
        Iterator<C40990e0> it = taskListView.f110478C1.f110501d.iterator();
        while (it.hasNext()) {
            C40990e0 next = it.next();
            if (next.f110331b) {
                linkedList.add(next);
                C29855f0.m38894e(next.f110335f);
                C53736a d = C40933j.m44315d(next.f110335f);
                if (d != null) {
                    ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63970r(d.field_downloadId);
                }
                C45880a.m51163b(11, C45880a.m51162a(next.f110332c), next.f110333d, 81, next.f110335f, "", "");
                int i2 = next.f110332c;
                C45880a.m51163b(11, i2 != 2 ? i2 != 4 ? i2 != 6 ? 0 : 1103 : 1102 : 1101, next.f110333d, 81, next.f110335f, "", "");
            }
        }
        if (linkedList.size() != 0) {
            taskListView.f110478C1.mo64084F4(linkedList);
            if (taskListView.f110478C1.f110501d.size() <= 5) {
                taskListView.mo64076B1();
            }
        }
        C41008v.m44442b(false);
    }
}
