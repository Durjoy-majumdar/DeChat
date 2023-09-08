package j51;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.model.C41008v;
import com.tencent.p014mm.plugin.downloader_app.p039ui.C41040d;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import g51.C45880a;
import java.util.Iterator;
import java.util.List;
import sx1.C48496d;

/* renamed from: j51.s */
public class C46418s implements MRecyclerView.C40584e {

    /* renamed from: a */
    public final /* synthetic */ TaskListView f125024a;

    public C46418s(TaskListView taskListView) {
        this.f125024a = taskListView;
    }

    /* renamed from: a */
    public boolean mo23457a(RecyclerView recyclerView, View view, int i, long j) {
        C48496d<C40990e0> dVar;
        if (!this.f125024a.f110489N1) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if ((viewGroup.getChildAt(0) instanceof TaskItemView) && (dVar = this.f125024a.f110478C1.f110501d) != null) {
            Iterator<C40990e0> it = dVar.iterator();
            while (it.hasNext()) {
                it.next().f110330a = true;
            }
            ((TaskItemView) viewGroup.getChildAt(0)).setSelected(true);
            TaskListView taskListView = this.f125024a;
            taskListView.f110481F1 = true;
            C48496d<C40990e0> dVar2 = taskListView.f110478C1.f110501d;
            if (Util.isNullOrNil((List) dVar2)) {
                Log.m105924i("MicroMsg.TaskListView", "enterTaskManagerView, list is nil");
            } else {
                taskListView.f110481F1 = true;
                Iterator<C40990e0> it4 = dVar2.iterator();
                while (it4.hasNext()) {
                    it4.next().f110330a = true;
                }
                DownloadMainUI.C41027f fVar = taskListView.f110480E1;
                if (fVar != null) {
                    ((DownloadMainUI.C41022c) fVar).mo64060a(true);
                }
                C41040d dVar3 = taskListView.f110478C1;
                dVar3.f110507j = false;
                dVar3.notifyDataSetChanged();
                taskListView.f110489N1 = false;
                C41008v.m44442b(true);
                C45880a.m51163b(11, 0, 0, 1, "", "", "");
                C45880a.m51163b(11, 0, 0, 1, "", "", "");
            }
        }
        return true;
    }
}
