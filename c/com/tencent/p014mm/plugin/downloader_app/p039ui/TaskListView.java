package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.p014mm.plugin.downloader.model.C40933j;
import com.tencent.p014mm.plugin.downloader_app.model.C29855f0;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.model.C41008v;
import com.tencent.p014mm.plugin.downloader_app.model.v$$b;
import com.tencent.p014mm.plugin.downloader_app.model.v$$c;
import com.tencent.p014mm.plugin.downloader_app.model.v$$e;
import com.tencent.p014mm.plugin.downloader_app.model.v$$f;
import com.tencent.p014mm.plugin.downloader_app.model.v$$h;
import com.tencent.p014mm.plugin.downloader_app.model.v$$i;
import com.tencent.p014mm.plugin.downloader_app.p039ui.DownloadMainUI;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j51.C46414o;
import j51.C46415p;
import j51.C46416q;
import j51.C46417r;
import j51.C46418s;
import j51.C46419t;
import j51.C46420u;
import j51.C9281k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import nj3.C76879j;
import sx1.C48496d;
import wq3.C111847h;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskListView */
public class TaskListView extends MRecyclerView implements C111847h {

    /* renamed from: O1 */
    public static final /* synthetic */ int f110477O1 = 0;

    /* renamed from: C1 */
    public C41040d f110478C1;

    /* renamed from: D1 */
    public Map<String, C40990e0> f110479D1 = new HashMap();

    /* renamed from: E1 */
    public DownloadMainUI.C41027f f110480E1;

    /* renamed from: F1 */
    public boolean f110481F1;

    /* renamed from: G1 */
    public TaskItemView.C41028a f110482G1;

    /* renamed from: H1 */
    public v$$e f110483H1 = new C41029a();

    /* renamed from: I1 */
    public v$$b f110484I1 = new C41030b();

    /* renamed from: J1 */
    public v$$c f110485J1 = new C41031c();

    /* renamed from: K1 */
    public v$$h f110486K1 = new C41032d();

    /* renamed from: L1 */
    public v$$f f110487L1 = new C41033e();

    /* renamed from: M1 */
    public v$$i f110488M1 = new C41034f();

    /* renamed from: N1 */
    public boolean f110489N1 = true;

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskListView$a */
    public class C41029a implements v$$e {
        public C41029a() {
        }

        /* renamed from: f */
        public void mo64029f(int i, long j) {
            C53736a c = C40933j.m44314c(j);
            if (c != null) {
                TaskListView taskListView = TaskListView.this;
                String str = c.field_appId;
                if (((HashMap) taskListView.f110479D1).containsKey(str)) {
                    C40990e0 e0Var = (C40990e0) ((HashMap) taskListView.f110479D1).get(str);
                    if (i == 9) {
                        e0Var.f110332c = 6;
                        taskListView.mo64077C1(e0Var);
                    } else if (e0Var.f110332c == 6) {
                        e0Var.f110332c = 2;
                        taskListView.mo64077C1(e0Var);
                    } else {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) taskListView.getLayoutManager();
                        int childCount = linearLayoutManager.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            if (linearLayoutManager.getChildAt(i2) != null) {
                                View childAt = ((ViewGroup) linearLayoutManager.getChildAt(i2)).getChildAt(0);
                                if (childAt.getVisibility() == 0 && (childAt instanceof TaskItemView)) {
                                    TaskItemView taskItemView = (TaskItemView) childAt;
                                    Log.m105925i("MicroMsg.TaskItemView", "refreshDownloadStatus, event = %s, appId: %s", Integer.valueOf(i), str);
                                    if (!(taskItemView.f110457d.getVisibility() == 0 || !str.equals(taskItemView.f110454A.f110335f) || C40933j.m44315d(taskItemView.f110454A.f110335f) == null)) {
                                        if (!(i == 1 || i == 7)) {
                                            taskItemView.f110455B = false;
                                        }
                                        taskItemView.mo64068b();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskListView$b */
    public class C41030b implements v$$b {
        public C41030b() {
        }

        /* renamed from: a */
        public void mo64026a(boolean z) {
            TaskListView taskListView = TaskListView.this;
            Iterator<C40990e0> it = taskListView.f110478C1.f110501d.iterator();
            while (it.hasNext()) {
                C40990e0 next = it.next();
                int i = next.f110332c;
                if (i == 2 || i == 4 || i == 6) {
                    next.f110331b = z;
                }
            }
            taskListView.f110478C1.notifyDataSetChanged();
            C41008v.m44442b(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskListView$c */
    public class C41031c implements v$$c {
        public C41031c() {
        }

        /* renamed from: a */
        public void mo64027a() {
            TaskListView taskListView = TaskListView.this;
            C76879j.m92707A(taskListView.getContext(), taskListView.getContext().getString(C0966R.string.byg), "", taskListView.getContext().getString(C0966R.string.jve), taskListView.getContext().getString(C0966R.string.jvd), new C46420u(taskListView), new C46417r(taskListView));
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskListView$d */
    public class C41032d implements v$$h {
        public C41032d() {
        }

        /* renamed from: a */
        public void mo64032a(String str) {
            TaskListView taskListView = TaskListView.this;
            C40990e0 e0Var = (C40990e0) ((HashMap) taskListView.f110479D1).get(str);
            if (e0Var != null) {
                if (e0Var.f110332c == 6) {
                    e0Var.f110332c = 2;
                    taskListView.mo64077C1(e0Var);
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) taskListView.getLayoutManager();
                int childCount = linearLayoutManager.getChildCount();
                for (int i = 0; i <= childCount; i++) {
                    if (linearLayoutManager.getChildAt(i) != null) {
                        View childAt = ((ViewGroup) linearLayoutManager.getChildAt(i)).getChildAt(0);
                        if (childAt.getVisibility() == 0 && (childAt instanceof TaskItemView)) {
                            TaskItemView taskItemView = (TaskItemView) childAt;
                            if (taskItemView.f110454A.f110335f.equals(str)) {
                                Log.m105925i("MicroMsg.TaskItemView", "onTaskPreStartDownload, appId: %s", str);
                                taskItemView.f110455B = true;
                                taskItemView.post(new C46414o(taskItemView));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskListView$e */
    public class C41033e implements v$$f {
        public C41033e() {
        }

        /* renamed from: a */
        public void mo64030a(String str) {
            TaskListView taskListView = TaskListView.this;
            int i = TaskListView.f110477O1;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) taskListView.getLayoutManager();
            int childCount = linearLayoutManager.getChildCount();
            for (int i2 = 0; i2 <= childCount; i2++) {
                if (linearLayoutManager.getChildAt(i2) != null) {
                    View childAt = ((ViewGroup) linearLayoutManager.getChildAt(i2)).getChildAt(0);
                    if (childAt.getVisibility() == 0 && (childAt instanceof TaskItemView)) {
                        TaskItemView taskItemView = (TaskItemView) childAt;
                        if (taskItemView.f110454A.f110335f.equals(str)) {
                            Log.m105925i("MicroMsg.TaskItemView", "onOrderWifiDownload, appId: %s", str);
                            taskItemView.f110455B = false;
                            taskItemView.post(new C46415p(taskItemView));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskListView$f */
    public class C41034f implements v$$i {
        public C41034f() {
        }

        /* renamed from: a */
        public void mo64033a(String str) {
            TaskListView taskListView = TaskListView.this;
            int i = TaskListView.f110477O1;
            taskListView.getClass();
            LinkedList linkedList = new LinkedList();
            int i2 = 0;
            Iterator<C40990e0> it = taskListView.f110478C1.f110501d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C40990e0 next = it.next();
                if (next.f110335f.equals(str)) {
                    linkedList.add(next);
                    C29855f0.m38894e(next.f110335f);
                    break;
                }
                i2++;
            }
            if (linkedList.size() != 0) {
                taskListView.f110478C1.mo64084F4(linkedList);
                taskListView.f110478C1.notifyItemRemoved(i2);
            }
        }
    }

    public TaskListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: B1 */
    public void mo64076B1() {
        this.f110481F1 = false;
        DownloadMainUI.C41027f fVar = this.f110480E1;
        if (fVar != null) {
            ((DownloadMainUI.C41022c) fVar).mo64060a(false);
        }
        C48496d<C40990e0> dVar = this.f110478C1.f110501d;
        if (dVar.size() <= 5) {
            ((DownloadMainUI) getContext()).mo64057J7(true);
            return;
        }
        Iterator<C40990e0> it = dVar.iterator();
        while (it.hasNext()) {
            C40990e0 next = it.next();
            next.f110330a = false;
            next.f110331b = false;
        }
        C41040d dVar2 = this.f110478C1;
        dVar2.f110507j = true;
        dVar2.notifyDataSetChanged();
        this.f110489N1 = true;
    }

    /* renamed from: C1 */
    public final void mo64077C1(C40990e0 e0Var) {
        C41040d dVar = this.f110478C1;
        dVar.f110501d.remove(e0Var);
        C48496d<C40990e0> dVar2 = dVar.f110501d;
        synchronized (dVar2.f129701d) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= dVar2.size()) {
                    i = 0;
                    break;
                } else if (e0Var.mo64012a(dVar2.get(i)) <= 0) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                i = dVar2.size();
            }
            dVar2.add(i, e0Var);
        }
        C40319a0.m43495c(true, new C46416q(dVar));
    }

    public int getSize() {
        return this.f110478C1.f110501d.size();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v$$e v__e = this.f110483H1;
        if (!C41008v.f110380f.contains(v__e)) {
            C41008v.f110380f.add(v__e);
        }
        C41008v.f110375a.add(this.f110484I1);
        C41008v.f110376b.add(this.f110485J1);
        C41008v.f110378d.add(this.f110486K1);
        v$$f v__f = this.f110487L1;
        if (!C41008v.f110379e.contains(v__f)) {
            C41008v.f110379e.add(v__f);
        }
        v$$i v__i = this.f110488M1;
        if (!C41008v.f110381g.contains(v__i)) {
            C41008v.f110381g.add(v__i);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C41008v.f110380f.remove(this.f110483H1);
        C41008v.f110375a.remove(this.f110484I1);
        C41008v.f110376b.remove(this.f110485J1);
        C41008v.f110378d.remove(this.f110486K1);
        C41008v.f110379e.remove(this.f110487L1);
        C41008v.f110381g.remove(this.f110488M1);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Log.m105918d("MicroMsg.TaskListView", "onFinishInflate");
        setLayoutManager(new LinearLayoutManager(getContext()));
        C41040d dVar = new C41040d(getContext());
        this.f110478C1 = dVar;
        dVar.f110508n = this.f110482G1;
        setAdapter(dVar);
        mo17085h0(new C9281k(getResources()));
        setOnItemLongClickListener(new C46418s(this));
        setOnItemClickListener(new C46419t(this));
    }

    public void setData(LinkedList<C40990e0> linkedList) {
        Iterator<C40990e0> it = linkedList.iterator();
        while (it.hasNext()) {
            C40990e0 next = it.next();
            if (!Util.isNullOrNil(next.f110335f)) {
                ((HashMap) this.f110479D1).put(next.f110335f, next);
            }
        }
        C41040d dVar = this.f110478C1;
        dVar.f110501d.clear();
        C48496d<C40990e0> dVar2 = dVar.f110501d;
        dVar2.getClass();
        for (C40990e0 h : linkedList) {
            dVar2.mo73126h(h);
        }
        dVar.f110501d.mo73126h(new C40990e0(1));
        dVar.f110501d.mo73126h(new C40990e0(3));
        dVar.f110501d.mo73126h(new C40990e0(5));
        dVar.f110501d.mo73126h(new C40990e0(7));
        dVar.notifyDataSetChanged();
    }

    public void setOnItemButtonClickListener(TaskItemView.C41028a aVar) {
        this.f110482G1 = aVar;
        C41040d dVar = this.f110478C1;
        if (dVar != null) {
            dVar.f110508n = aVar;
        }
    }
}
