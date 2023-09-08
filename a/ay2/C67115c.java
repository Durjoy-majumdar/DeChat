package ay2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ay2.C67113b;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import p261wl.C38166b;
import vx2.C37866s;
import vx2.C65900i;
import vx2.C78494v;
import wx2.C66204d;

/* renamed from: ay2.c */
public final class C67115c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.C16631z f192714d;

    /* renamed from: e */
    public final /* synthetic */ C67113b f192715e;

    public C67115c(RecyclerView.C16631z zVar, C67113b bVar) {
        this.f192714d = zVar;
        this.f192715e = bVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int j = this.f192714d.mo17363j();
        if (j < 0 || j >= ((ArrayList) this.f192715e.getViewModel().f192729d).size()) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        TaskBarView taskBarView = (TaskBarView) this.f192715e.getCallback();
        taskBarView.f206492Z1 = this.f192715e.mo91217d(j);
        taskBarView.f206491Y1 = true;
        C67113b.C67114a callback = this.f192715e.getCallback();
        MultiTaskInfo multiTaskInfo = (MultiTaskInfo) ((ArrayList) this.f192715e.getViewModel().f192729d).get(j);
        TaskBarViewPresenter taskBarViewPresenter = ((TaskBarView) callback).f206512z1;
        taskBarViewPresenter.getClass();
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked type:%d,pos:%d", Integer.valueOf(multiTaskInfo.field_type), Integer.valueOf(j));
        int a = taskBarViewPresenter.f206534m.mo53503a(multiTaskInfo.field_type);
        taskBarViewPresenter.f206538q = a;
        taskBarViewPresenter.f206534m.mo53507e(a, j, multiTaskInfo.field_id, 1, (String) null);
        MultiTaskInfo multiTaskInfo2 = (MultiTaskInfo) ((ArrayList) this.f192715e.f192712h.f192729d).get(j);
        ((C65900i) C86312j.m106911c(C65900i.class)).getClass();
        C87412m.m108594g(multiTaskInfo2, "multiTaskInfo");
        C78494v vVar = (C78494v) C86312j.m106911c(C78494v.class);
        vVar.getClass();
        Log.m105924i("MicroMsg.TaskBarViewService", "notifyClick " + multiTaskInfo2.mo80305m2().f183752e + ' ' + multiTaskInfo2.field_id + ' ' + multiTaskInfo2.field_type);
        HashSet<C66204d.C66205b> hashSet = vVar.f229931d.get(multiTaskInfo2.field_type);
        if (hashSet != null) {
            for (C66204d.C66205b Q0 : hashSet) {
                Q0.mo90307Q0(multiTaskInfo2);
            }
        }
        C38166b.m41756c(C66204d.C38350a.class, Integer.valueOf(multiTaskInfo2.field_type), new C37866s(multiTaskInfo2));
        C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
