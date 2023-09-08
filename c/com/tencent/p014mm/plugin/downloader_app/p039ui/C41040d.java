package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C40319a0;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import com.tencent.p014mm.plugin.downloader_app.p039ui.TaskItemView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import sx1.C48496d;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.d */
public class C41040d extends RecyclerView.C16613e<C41043c> {

    /* renamed from: d */
    public C48496d<C40990e0> f110501d = new C48496d<>();

    /* renamed from: e */
    public Context f110502e;

    /* renamed from: f */
    public boolean f110503f = true;

    /* renamed from: g */
    public boolean f110504g = false;

    /* renamed from: h */
    public boolean f110505h = false;

    /* renamed from: i */
    public boolean f110506i = false;

    /* renamed from: j */
    public boolean f110507j = true;

    /* renamed from: n */
    public TaskItemView.C41028a f110508n;

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.d$a */
    public class C41041a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f110509d;

        public C41041a(int i) {
            this.f110509d = i;
        }

        public void run() {
            C41040d.this.notifyItemRemoved(this.f110509d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.d$b */
    public class C41042b implements Runnable {
        public C41042b() {
        }

        public void run() {
            C41040d.this.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.downloader_app.ui.d$c */
    public static class C41043c extends RecyclerView.C16631z {

        /* renamed from: z */
        public View f110512z;

        public C41043c(View view) {
            super(view);
            this.f110512z = ((ViewGroup) view).getChildAt(0);
        }
    }

    public C41040d(Context context) {
        this.f110502e = context;
    }

    /* renamed from: F4 */
    public void mo64084F4(LinkedList<C40990e0> linkedList) {
        if (!Util.isNullOrNil((List) linkedList)) {
            if (linkedList.size() == 1) {
                int indexOf = this.f110501d.indexOf(linkedList.get(0));
                this.f110501d.remove(indexOf);
                C40319a0.m43495c(true, new C41041a(indexOf));
                return;
            }
            this.f110501d.removeAll(linkedList);
            C40319a0.m43495c(true, new C41042b());
        }
    }

    public int getItemCount() {
        return this.f110501d.size();
    }

    public int getItemViewType(int i) {
        return this.f110501d.get(i).f110332c;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2;
        int i3 = i;
        C41043c cVar = (C41043c) zVar;
        Log.m105918d("MicroMsg.TaskListAdapter", "onBindViewHolder");
        C40990e0 e0Var = this.f110501d.get(i3);
        cVar.f44854d.setClickable(this.f110503f);
        boolean z = false;
        switch (e0Var.f110332c) {
            case 1:
                if (this.f110501d.mo73125f(2) != 0) {
                    this.f110504g = true;
                    View view = cVar.f110512z;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((TaskHeaderView) cVar.f110512z).mo2094a(e0Var, false);
                    break;
                } else {
                    this.f110504g = false;
                    View view3 = cVar.f110512z;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(8);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 2:
            case 4:
                ((TaskItemView) cVar.f110512z).setData(e0Var);
                break;
            case 3:
                int f = this.f110501d.mo73125f(4);
                if (f != 0) {
                    this.f110505h = true;
                    View view5 = cVar.f110512z;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    e0Var.f110341l = f;
                    ((TaskHeaderView) cVar.f110512z).mo2094a(e0Var, this.f110504g);
                    break;
                } else {
                    this.f110505h = false;
                    View view6 = cVar.f110512z;
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                    aVar4.mo10233c(8);
                    View view7 = view6;
                    C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view7, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 5:
                if (this.f110501d.mo73125f(6) != 0) {
                    View view8 = cVar.f110512z;
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view9 = view8;
                    C117292a.m165358d(view9, aVar5.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    TaskHeaderView taskHeaderView = (TaskHeaderView) cVar.f110512z;
                    if (this.f110504g || this.f110505h) {
                        z = true;
                    }
                    taskHeaderView.mo2094a(e0Var, z);
                    break;
                } else {
                    View view10 = cVar.f110512z;
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar6.mo10233c(8);
                    View view11 = view10;
                    C117292a.m165358d(view11, aVar6.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view10.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 6:
                if (!this.f110506i && i3 >= 3 && this.f110501d.get(i3 - 3).f110332c == 6) {
                    View view12 = cVar.f110512z;
                    C9556a aVar7 = new C9556a();
                    ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                    aVar7.mo10233c(8);
                    View view13 = view12;
                    C117292a.m165358d(view13, aVar7.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view12.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view13, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                } else {
                    ((TaskItemView) cVar.f110512z).setData(e0Var);
                    break;
                }
            case 7:
                if (!this.f110506i) {
                    if (Util.isNullOrNil((List) this.f110501d)) {
                        i2 = 0;
                    } else {
                        Iterator<C40990e0> it = this.f110501d.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            if (it.next().f110332c == 6) {
                                i2++;
                            }
                        }
                    }
                    if (i2 > 3) {
                        View view14 = cVar.f110512z;
                        C9556a aVar8 = new C9556a();
                        ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                        aVar8.mo10233c(0);
                        View view15 = view14;
                        C117292a.m165358d(view15, aVar8.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view14.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                        C117292a.m165359e(view15, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        break;
                    }
                }
                View view16 = cVar.f110512z;
                C9556a aVar9 = new C9556a();
                ThreadLocal<C9556a> threadLocal9 = C60958c.f173611a;
                aVar9.mo10233c(8);
                C117292a.m165358d(view16, aVar9.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view16, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                break;
            case 8:
                if (this.f110507j) {
                    ((BottomEntranceView) cVar.f110512z).setData(e0Var.f110343n);
                    break;
                } else {
                    View view17 = cVar.f110512z;
                    C9556a aVar10 = new C9556a();
                    ThreadLocal<C9556a> threadLocal10 = C60958c.f173611a;
                    aVar10.mo10233c(8);
                    View view18 = view17;
                    C117292a.m165358d(view18, aVar10.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view17.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                    C117292a.m165359e(view18, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
        }
        View view19 = cVar.f110512z;
        if (view19 instanceof TaskItemView) {
            ((TaskItemView) view19).setOnItemOpButtonClickListener(this.f110508n);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log.m105918d("MicroMsg.TaskListAdapter", "onCreateViewHolder");
        View view = new View(this.f110502e);
        switch (i) {
            case 1:
            case 3:
            case 5:
                view = LayoutInflater.from(this.f110502e).inflate(C0966R.C0971layout.f7149zt, viewGroup, false);
                break;
            case 2:
            case 4:
            case 6:
                view = LayoutInflater.from(this.f110502e).inflate(C0966R.C0971layout.f7151zv, viewGroup, false);
                break;
            case 7:
                view = LayoutInflater.from(this.f110502e).inflate(C0966R.C0971layout.f7148zs, viewGroup, false);
                break;
            case 8:
                view = LayoutInflater.from(this.f110502e).inflate(C0966R.C0971layout.f7146zq, viewGroup, false);
                break;
        }
        return new C41043c(view);
    }
}
