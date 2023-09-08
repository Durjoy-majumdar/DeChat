package com.tencent.p014mm.plugin.taskbar.p110ui.section.weapp;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp3.C79760s;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68685a;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68688d;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.C68691e;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.DragFeatureView;
import com.tencent.p014mm.plugin.appbrand.widget.desktop.DragRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import gy2.C76079e;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ky2.C10432i;
import nj3.C76879j;
import p235sm.C77731f0;
import p235sm.C77732g0;
import p910lj.C76701a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView */
public class TaskBarSectionWeAppRecyclerView extends DragRecyclerView {

    /* renamed from: B1 */
    public List<C68691e.C68692a> f206637B1 = new ArrayList();

    /* renamed from: C1 */
    public List<C68691e.C68692a> f206638C1 = new ArrayList();

    /* renamed from: D1 */
    public RecyclerView.C16613e f206639D1 = null;

    /* renamed from: E1 */
    public C76079e f206640E1;

    /* renamed from: F1 */
    public boolean f206641F1 = false;

    /* renamed from: G1 */
    public C71348e f206642G1;

    /* renamed from: H1 */
    public int f206643H1 = 0;

    /* renamed from: I1 */
    public Toast f206644I1;

    /* renamed from: J1 */
    public C68688d f206645J1;

    /* renamed from: K1 */
    public int f206646K1 = 1;

    /* renamed from: L1 */
    public C68688d.C68689a f206647L1 = new C71343b();

    /* renamed from: M1 */
    public C68688d.C68690b f206648M1 = new C71344c();

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$a */
    public class C71342a extends GridLayoutManager {
        public C71342a(TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView, Context context, int i, int i2, boolean z) {
            super(context, i, i2, z);
        }

        public boolean canScrollVertically() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$b */
    public class C71343b implements C68688d.C68689a {
        public C71343b() {
        }

        /* renamed from: a */
        public void mo94423a(float f, float f2) {
            TaskBarSectionWeAppRecyclerView.this.mo98287D1(f, f2);
        }

        /* renamed from: b */
        public void mo94424b(int i, int i2, Object obj) {
            boolean z;
            C71348e eVar;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_weapp_reorder, 1) != 1) {
                Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder forbidden");
            } else if (i == i2) {
                Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder false start = end");
            } else {
                Log.m105925i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorderCollection %d", 0);
                Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob before reorder showlist " + mo98303g(TaskBarSectionWeAppRecyclerView.this.f206638C1));
                Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob before reorder datalist " + mo98303g(TaskBarSectionWeAppRecyclerView.this.f206637B1));
                TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = TaskBarSectionWeAppRecyclerView.this;
                taskBarSectionWeAppRecyclerView.getClass();
                if (!(taskBarSectionWeAppRecyclerView instanceof TaskBarSectionMyWeAppRecyclerView)) {
                    Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorder false");
                } else {
                    ArrayList arrayList = new ArrayList();
                    int size = TaskBarSectionWeAppRecyclerView.this.f206637B1.size();
                    if (size >= 8) {
                        size = 8;
                    }
                    List<C68691e.C68692a> subList = TaskBarSectionWeAppRecyclerView.this.f206637B1.subList(0, size);
                    if (((ArrayList) TaskBarSectionWeAppRecyclerView.this.f206638C1).size() >= 8) {
                        TaskBarSectionWeAppRecyclerView.this.f206637B1.removeAll(subList);
                        TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView2 = TaskBarSectionWeAppRecyclerView.this;
                        taskBarSectionWeAppRecyclerView2.f206637B1.addAll(0, taskBarSectionWeAppRecyclerView2.f206638C1);
                        LinkedHashSet linkedHashSet = new LinkedHashSet(TaskBarSectionWeAppRecyclerView.this.f206637B1);
                        TaskBarSectionWeAppRecyclerView.this.f206637B1.clear();
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            TaskBarSectionWeAppRecyclerView.this.f206637B1.add((C68691e.C68692a) it.next());
                        }
                    } else {
                        TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView3 = TaskBarSectionWeAppRecyclerView.this;
                        taskBarSectionWeAppRecyclerView3.f206637B1 = taskBarSectionWeAppRecyclerView3.f206638C1;
                    }
                    Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob after reorder showlist " + mo98303g(TaskBarSectionWeAppRecyclerView.this.f206638C1));
                    Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob after reorder datalist " + mo98303g(TaskBarSectionWeAppRecyclerView.this.f206637B1));
                    for (int i3 = 0; i3 < TaskBarSectionWeAppRecyclerView.this.f206637B1.size(); i3++) {
                        LocalUsageInfo localUsageInfo = TaskBarSectionWeAppRecyclerView.this.f206637B1.get(i3).f197340a;
                        if (localUsageInfo != null) {
                            arrayList.add(localUsageInfo);
                        }
                    }
                    C68585h1 SJ = ((C77731f0) C86312j.m106911c(C77731f0.class)).mo107697SJ();
                    if (SJ != null) {
                        z = SJ.Fq0(arrayList, 0);
                        if (!z) {
                            Log.m105920e("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob reorederCollection failed, needProcessResult: %b");
                        }
                        Log.m105925i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob collection reorderCollection result: %b, startPos: %d, endPos: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
                        C68691e.C68692a aVar = (C68691e.C68692a) obj;
                        if (!(i == i2 || (eVar = TaskBarSectionWeAppRecyclerView.this.f206642G1) == null || !z)) {
                            eVar.mo98219b(aVar.f197340a, i, i2);
                        }
                        TaskBarSectionWeAppRecyclerView.this.mo98291A1();
                    }
                }
                z = false;
                Log.m105925i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob collection reorderCollection result: %b, startPos: %d, endPos: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
                C68691e.C68692a aVar2 = (C68691e.C68692a) obj;
                eVar.mo98219b(aVar2.f197340a, i, i2);
                TaskBarSectionWeAppRecyclerView.this.mo98291A1();
            }
        }

        /* renamed from: c */
        public void mo94425c(int i, boolean z, boolean z2) {
            TaskBarSectionWeAppRecyclerView.this.mo98286C1(i, z, z2);
        }

        /* renamed from: d */
        public void mo94426d(Object obj, int i) {
            if (obj instanceof C68691e.C68692a) {
                TaskBarSectionWeAppRecyclerView.this.mo98292G1(i);
            }
        }

        /* renamed from: e */
        public void mo94427e(Object obj, int i) {
            if (obj instanceof C68691e.C68692a) {
                TaskBarSectionWeAppRecyclerView.this.mo98292G1(i);
            }
        }

        /* renamed from: f */
        public void mo94428f(Object obj) {
        }

        /* renamed from: g */
        public final String mo98303g(List<C68691e.C68692a> list) {
            String str = "";
            for (C68691e.C68692a aVar : list) {
                str = str + aVar.f197340a.f239044h + " ";
            }
            return str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$c */
    public class C71344c implements C68688d.C68690b {
        public C71344c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$d */
    public class C71345d extends RecyclerView.C16613e<C68685a> {

        /* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$d$a */
        public class C71346a implements View.OnClickListener {
            public C71346a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                TaskBarSectionWeAppRecyclerView.this.mo98288E1();
                C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$d$b */
        public class C71347b implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C68685a f206653d;

            /* renamed from: e */
            public final /* synthetic */ C68691e.C68692a f206654e;

            public C71347b(C68685a aVar, C68691e.C68692a aVar2) {
                this.f206653d = aVar;
                this.f206654e = aVar2;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                if (TaskBarSectionWeAppRecyclerView.this.f206642G1 != null) {
                    if (!WeChatBrands.Business.Entries.HomeAppbrandDrawer.checkAvailable(view.getContext())) {
                        C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = TaskBarSectionWeAppRecyclerView.this;
                    C68685a aVar = this.f206653d;
                    taskBarSectionWeAppRecyclerView.mo98285B1(aVar, view, this.f206654e, aVar.mo17363j());
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView$ItemAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C71345d() {
        }

        /* renamed from: F4 */
        public void onBindViewHolder(C68685a aVar, int i) {
            TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView;
            if (aVar != null) {
                TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView2 = TaskBarSectionWeAppRecyclerView.this;
                C68691e.C68692a aVar2 = i >= ((ArrayList) taskBarSectionWeAppRecyclerView2.f206638C1).size() ? null : (C68691e.C68692a) ((ArrayList) taskBarSectionWeAppRecyclerView2.f206638C1).get(i);
                if (aVar2 != null) {
                    aVar.f197328z = aVar2;
                    if (aVar.f44859i == 2) {
                        aVar.mo94474z(new C71346a(), (View.OnLongClickListener) null);
                        return;
                    }
                    aVar.mo94473y(new C71347b(aVar, aVar2), (View.OnLongClickListener) null);
                    TaskBarSectionWeAppRecyclerView.this.mo98289F1(aVar);
                    C68688d dVar = TaskBarSectionWeAppRecyclerView.this.f206645J1;
                    if (dVar != null && dVar.getRecyclerView() == (taskBarSectionWeAppRecyclerView = TaskBarSectionWeAppRecyclerView.this)) {
                        taskBarSectionWeAppRecyclerView.f206645J1.mo94479c(aVar, i);
                    }
                }
            }
        }

        public int getItemCount() {
            int size = ((ArrayList) TaskBarSectionWeAppRecyclerView.this.f206638C1).size();
            TaskBarSectionWeAppRecyclerView.this.getClass();
            return size + 0;
        }

        public int getItemViewType(int i) {
            TaskBarSectionWeAppRecyclerView.this.getClass();
            return 1;
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            return ((C77731f0) C86312j.m106911c(C77731f0.class)).mo107702wV(C85868k2.m106137b(TaskBarSectionWeAppRecyclerView.this.getContext()).inflate(C0966R.C0971layout.f6515gy, viewGroup, false));
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
            C68685a aVar = (C68685a) zVar;
            if (list.size() == 0) {
                onBindViewHolder(aVar, i);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView$e */
    public interface C71348e {
        /* renamed from: a */
        boolean mo98218a(float f, float f2);

        /* renamed from: b */
        void mo98219b(LocalUsageInfo localUsageInfo, int i, int i2);

        /* renamed from: c */
        void mo98220c(C68691e.C68692a aVar, boolean z);

        /* renamed from: d */
        void mo98221d(C68691e.C68692a aVar, int i);

        /* renamed from: e */
        void mo98222e(float f);

        /* renamed from: f */
        void mo98223f();

        /* renamed from: g */
        void mo98224g(int i, C68691e.C68692a aVar);

        /* renamed from: h */
        void mo98225h();

        /* renamed from: i */
        View mo98226i();

        /* renamed from: j */
        void mo98227j(boolean z);

        /* renamed from: k */
        void mo98228k(RecyclerView.C16631z zVar, View view, C68691e.C68692a aVar, int i, boolean z);

        /* renamed from: l */
        void mo98229l(C68691e.C68692a aVar, int i);
    }

    public TaskBarSectionWeAppRecyclerView(Context context) {
        super(context);
        m83844y1(context);
    }

    /* renamed from: y1 */
    private void m83844y1(Context context) {
        try {
            C79760s.m96908a("TaskBarSectionWeAppRecyclerView.init()");
            setLayoutManager(new C71342a(this, context, 4, 1, false));
            C71345d dVar = new C71345d();
            this.f206639D1 = dVar;
            setAdapter(dVar);
            this.f206640E1 = new C76079e();
            setItemAnimator(this.f206640E1);
            mo98294I1(context, C76577a.m92145A(getContext()));
        } finally {
            C79760s.m96909b();
        }
    }

    /* renamed from: A1 */
    public void mo98291A1() {
        Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "notifyDataChanged");
        getAdapter().notifyDataSetChanged();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView", "notifyDataChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
        mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(this, "com/tencent/mm/plugin/taskbar/ui/section/weapp/TaskBarSectionWeAppRecyclerView", "notifyDataChanged", "()V", "Undefined", "scrollToPosition", "(I)V");
    }

    /* renamed from: B1 */
    public void mo98285B1(RecyclerView.C16631z zVar, View view, C68691e.C68692a aVar, int i) {
        C71348e eVar = this.f206642G1;
        if (eVar != null) {
            eVar.mo98228k(zVar, view, aVar, i, false);
        }
    }

    /* renamed from: C1 */
    public void mo98286C1(int i, boolean z, boolean z2) {
        Log.m105925i("MicroMsg.TaskBarSectionWeAppRecyclerView", "onDragStateChange %d %b %b", Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2));
        if (!mo98302z1()) {
            C71348e eVar = this.f206642G1;
            if (eVar != null) {
                eVar.mo98227j(z);
            }
            if (!z && !z2 && this.f206641F1) {
                C68691e.C68692a aVar = (C68691e.C68692a) ((ArrayList) this.f206638C1).get(i);
                C68585h1 SJ = ((C77731f0) C86312j.m106911c(C77731f0.class)).mo107697SJ();
                LocalUsageInfo localUsageInfo = aVar.f197340a;
                if (!(SJ == null || localUsageInfo == null)) {
                    Log.m105925i("MicroMsg.TaskBarSectionWeAppRecyclerView", "addStar %d %s", Integer.valueOf(i), localUsageInfo.f239044h);
                    int rg02 = SJ.rg0(localUsageInfo.f239040d, localUsageInfo.f239042f);
                    if (rg02 == 0) {
                        Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "jacob add ok");
                        mo98293H1(true);
                        this.f206642G1.mo98224g(i, new C68691e.C68692a(aVar));
                    } else if (rg02 == -2) {
                        int Tk = ((C68585h1) C86312j.m106911c(C68585h1.class)).mo94241Tk();
                        C77398g y = C76879j.m92754y(getContext(), getContext().getResources().getString(C0966R.string.f7659my, new Object[]{Integer.valueOf(Tk)}), "", getContext().getResources().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                        if (y != null) {
                            y.mo107530l(true);
                            y.setCanceledOnTouchOutside(false);
                            y.show();
                        }
                    } else if (rg02 == -3) {
                        C77398g y2 = C76879j.m92754y(getContext(), getContext().getResources().getString(C0966R.string.f7600kw), "", getContext().getResources().getString(C0966R.string.a18), (DialogInterface.OnClickListener) null);
                        if (y2 != null) {
                            y2.mo107530l(true);
                            y2.setCanceledOnTouchOutside(false);
                            y2.show();
                        }
                    } else {
                        C76701a.makeText(getContext(), (CharSequence) getContext().getString(C0966R.string.f7639ma), 0).show();
                    }
                }
            }
            this.f206641F1 = false;
        }
    }

    /* renamed from: D1 */
    public void mo98287D1(float f, float f2) {
        C71348e eVar;
        if (!mo98302z1() && (eVar = this.f206642G1) != null) {
            this.f206641F1 = eVar.mo98218a(f, f2);
        }
    }

    /* renamed from: E1 */
    public void mo98288E1() {
        C71348e eVar = this.f206642G1;
        if (eVar != null) {
            eVar.mo98225h();
        }
    }

    /* renamed from: F1 */
    public void mo98289F1(C68685a aVar) {
        this.f206642G1.mo98220c(this.f206637B1.get(aVar.mo17363j()), false);
    }

    /* renamed from: G1 */
    public void mo98292G1(int i) {
        int i2 = 1;
        Log.m105925i("MicroMsg.TaskBarSectionWeAppRecyclerView", "remove item %d", Integer.valueOf(i));
        mo98293H1(false);
        ((ArrayList) this.f206638C1).remove(i);
        C68691e.C68692a remove = this.f206637B1.remove(i);
        if (this.f206637B1.size() > ((ArrayList) this.f206638C1).size()) {
            ArrayList arrayList = (ArrayList) this.f206638C1;
            arrayList.add(this.f206637B1.get(arrayList.size()));
        }
        this.f206639D1.notifyItemRemoved(i);
        if (this.f206637B1.size() >= 8) {
            this.f206639D1.notifyItemInserted(7);
        }
        RecyclerView.C16613e eVar = this.f206639D1;
        eVar.notifyItemRangeChanged(0, eVar.getItemCount(), Boolean.TRUE);
        mo98290x1(i, remove);
        if (((ArrayList) this.f206638C1).size() > 3) {
            i2 = 2;
        }
        this.f206646K1 = i2;
    }

    /* renamed from: H1 */
    public final void mo98293H1(boolean z) {
        Toast toast = this.f206644I1;
        if (toast != null) {
            toast.cancel();
        }
        this.f206644I1 = C76701a.makeText(getContext(), (CharSequence) "", 0);
        View inflate = View.inflate(getContext(), C0966R.C0971layout.f6796os, (ViewGroup) null);
        this.f206644I1.setGravity(17, 0, 0);
        this.f206644I1.setView(inflate);
        ((TextView) this.f206644I1.getView().findViewById(C0966R.C0970id.kpy)).setText(z ? C0966R.string.f7909vy : C0966R.string.f7664n6);
        this.f206644I1.show();
    }

    /* renamed from: I1 */
    public final void mo98294I1(Context context, int i) {
        float tr02 = ((C77732g0) C86312j.m106911c(C77732g0.class)).tr0(this, (float) C76577a.m92155f(context, C0966R.dimen.f3749d0), i, C76577a.m92155f(context, C0966R.dimen.f3766df), 0, 0);
        C71348e eVar = this.f206642G1;
        if (eVar != null) {
            eVar.mo98222e(tr02);
        }
    }

    public boolean canScrollHorizontally(int i) {
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (this.f206645J1 == null) {
                View rootView = getRootView();
                if (rootView != null) {
                    this.f206645J1 = (C68688d) rootView.findViewById(C0966R.C0970id.c_w);
                }
            }
            Log.m105924i("MicroMsg.TaskBarSectionWeAppRecyclerView", "configDragFeatureView");
            this.f206645J1.setRecyclerView(this);
            this.f206645J1.setList(this.f206638C1);
            this.f206645J1.setAppBrandDragCallback(this.f206647L1);
            this.f206645J1.setViewWidth(this.f206643H1);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_weapp_reorder, 1) == 1) {
                this.f206645J1.setCanMyWeAppMove(true);
            } else {
                this.f206645J1.setCanMyWeAppMove(false);
            }
            this.f206645J1.mo94478b(false);
            this.f206645J1.setShouldDoDeleteAnimation(false);
            this.f206645J1.setSectionCallback(this.f206648M1);
            this.f197327z1 = (DragFeatureView) this.f206645J1;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public List<C68691e.C68692a> getDataList() {
        return this.f206637B1;
    }

    public int getShowCount() {
        return this.f206638C1.size();
    }

    public int getShowLines() {
        return this.f206646K1;
    }

    public List<C68691e.C68692a> getShowList() {
        return this.f206638C1;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setClipChildren(false);
        View rootView = getRootView();
        View view = (View) getParent();
        while (view != rootView && (view instanceof ViewGroup)) {
            ((ViewGroup) view).setClipChildren(false);
            if (!(view instanceof RecyclerView)) {
                view = (View) view.getParent();
            } else {
                return;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != this.f206643H1) {
            int measuredWidth = getMeasuredWidth();
            this.f206643H1 = measuredWidth;
            C68688d dVar = this.f206645J1;
            if (dVar != null) {
                dVar.setViewWidth(measuredWidth);
            }
            mo98294I1(getContext(), this.f206643H1);
        }
    }

    public void setDataList(List<C68691e.C68692a> list) {
        int i = 1;
        Log.m105925i("MicroMsg.TaskBarSectionWeAppRecyclerView", "setDateList now:%d showing:%d new:%d", Integer.valueOf(this.f206637B1.size()), Integer.valueOf(((ArrayList) this.f206638C1).size()), Integer.valueOf(list.size()));
        this.f206637B1 = new ArrayList(list);
        ((ArrayList) this.f206638C1).clear();
        if (((ArrayList) this.f206638C1).size() > 3) {
            i = 2;
        }
        this.f206646K1 = i;
        int min = Math.min(this.f206637B1.size(), 8);
        for (int i2 = 0; i2 < min; i2++) {
            ((ArrayList) this.f206638C1).add(this.f206637B1.get(i2));
        }
    }

    public void setWeAppCallback(C71348e eVar) {
        this.f206642G1 = eVar;
    }

    /* renamed from: x1 */
    public void mo98290x1(int i, C68691e.C68692a aVar) {
        this.f206642G1.mo98229l(aVar, i);
    }

    /* renamed from: z1 */
    public final boolean mo98302z1() {
        Class cls = C10432i.class;
        return ((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).Oh0() != 1;
    }

    public TaskBarSectionWeAppRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m83844y1(context);
    }

    public TaskBarSectionWeAppRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m83844y1(context);
    }
}
