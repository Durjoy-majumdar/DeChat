package j51;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.p039ui.C41040d;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import e51.C45547h;
import g51.C45880a;
import sx1.C48496d;

/* renamed from: j51.t */
public class C46419t implements MRecyclerView.C40583d {

    /* renamed from: a */
    public final /* synthetic */ TaskListView f125025a;

    public C46419t(TaskListView taskListView) {
        this.f125025a = taskListView;
    }

    /* renamed from: a */
    public void mo23073a(RecyclerView recyclerView, View view, int i, long j) {
        Log.m105918d("MicroMsg.TaskListView", "onItemClick");
        View childAt = ((ViewGroup) view).getChildAt(0);
        C48496d<C40990e0> dVar = this.f125025a.f110478C1.f110501d;
        if (i >= 0 && i < dVar.size()) {
            C40990e0 e0Var = dVar.get(i);
            if (e0Var.f110332c == 7) {
                C41040d dVar2 = this.f125025a.f110478C1;
                if (!dVar2.f110506i) {
                    dVar2.f110506i = true;
                    dVar2.notifyDataSetChanged();
                }
                C45880a.m51163b(10, 1004, 101, 2, "", "", "");
            } else if (!this.f125025a.f110489N1) {
                childAt.setSelected(!e0Var.f110331b);
            } else if (!Util.isNullOrNil(e0Var.f110339j)) {
                Bundle bundle = new Bundle();
                bundle.putString("rawUrl", e0Var.f110339j);
                ((C45547h) C86312j.m106911c(C45547h.class)).mo70790RH(this.f125025a.getContext(), bundle);
                C45880a.m51163b(10, C45880a.m51162a(e0Var.f110332c), e0Var.f110333d, 40, e0Var.f110335f, "", "");
            }
        }
    }
}
