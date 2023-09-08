package ey2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ay2.C67113b;
import ay2.C67115c;
import ay2.C67116d;
import by2.C54599a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.plugin.taskbar.p110ui.C71350z;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarView;
import com.tencent.p014mm.plugin.taskbar.p110ui.TaskBarViewPresenter;
import com.tencent.p014mm.plugin.taskbar.p110ui.section.other.TaskBarSectionOtherView$layoutManager$1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cy2.C58001a;
import di3.C86312j;
import dy2.C58459a;
import ey2.C58854c;
import fy2.C59336a;
import gy3.C87412m;
import h81.C32735h;
import hy2.C60230a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kg3.C76577a;
import n60.C100075f;
import rx3.C13604l;
import sx3.C90364q0;
import uo3.C78253a;
import vx2.C37860g;
import vx2.C65900i;

/* renamed from: ey2.a */
public final class C75665a extends C67113b implements C58854c.C58855a {

    /* renamed from: p */
    public static final int f222260p = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3749d0);

    /* renamed from: q */
    public static final int f222261q = C76577a.m92155f(MMApplicationContext.getContext(), C0966R.dimen.f3723cd);

    /* renamed from: j */
    public final C100075f f222262j;

    /* renamed from: n */
    public final C75666a f222263n;

    /* renamed from: o */
    public final HashMap<Integer, C58854c> f222264o = C90364q0.m113146e(new C13604l(2, new C60230a(this)), new C13604l(6, new C58459a(this)), new C13604l(21, new C58001a(this)), new C13604l(3, new C54599a(this)), new C13604l(4, new C54599a(this)), new C13604l(22, new C59336a(this)));

    /* renamed from: ey2.a$b */
    public static final class C58851b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final ImageView f168472A;

        /* renamed from: B */
        public final TextView f168473B;

        /* renamed from: C */
        public final TextView f168474C;

        /* renamed from: D */
        public final ImageView f168475D;

        /* renamed from: E */
        public final View f168476E;

        /* renamed from: F */
        public final View f168477F;

        /* renamed from: G */
        public final ImageView f168478G;

        /* renamed from: z */
        public final ImageView f168479z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58851b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f168479z = (ImageView) view.findViewById(C0966R.C0970id.f357834c01);
            this.f168472A = (ImageView) view.findViewById(C0966R.C0970id.f39);
            this.f168473B = (TextView) view.findViewById(C0966R.C0970id.knx);
            this.f168474C = (TextView) view.findViewById(C0966R.C0970id.k9m);
            this.f168475D = (ImageView) view.findViewById(C0966R.C0970id.bec);
            this.f168476E = view.findViewById(C0966R.C0970id.dnt);
            this.f168477F = view.findViewById(C0966R.C0970id.dke);
            this.f168478G = (ImageView) view.findViewById(C0966R.C0970id.hwy);
        }
    }

    /* renamed from: ey2.a$c */
    public final class C58852c extends RecyclerView {

        /* renamed from: y1 */
        public int f168480y1;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58852c(C75665a aVar, Context context) {
            super(context, (AttributeSet) null);
            C87412m.m108594g(context, "context");
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            setClipChildren(false);
            View rootView = getRootView();
            ViewParent parent = getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            while (view != rootView && (view instanceof ViewGroup)) {
                ((ViewGroup) view).setClipChildren(false);
                if (!(view instanceof RecyclerView)) {
                    ViewParent parent2 = view.getParent();
                    C87412m.m108592e(parent2, "null cannot be cast to non-null type android.view.View");
                    view = (View) parent2;
                } else {
                    return;
                }
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (getMeasuredWidth() != this.f168480y1) {
                this.f168480y1 = getMeasuredWidth();
                Context context = getContext();
                C87412m.m108593f(context, "context");
                while (getItemDecorationCount() > 0) {
                    mo17095k1(0);
                }
                mo17085h0(new C58853b(context));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75665a(Context context, C67113b.C67114a aVar, int i) {
        super(context, aVar, i, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(aVar, "callback");
        C100075f.C100076a aVar2 = new C100075f.C100076a();
        aVar2.f293176b = true;
        aVar2.f293175a = true;
        this.f222262j = aVar2.mo139398a();
        C58852c cVar = new C58852c(this, context);
        TaskBarSectionOtherView$layoutManager$1 taskBarSectionOtherView$layoutManager$1 = new TaskBarSectionOtherView$layoutManager$1(context);
        C75666a aVar3 = new C75666a();
        this.f222263n = aVar3;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i2 = f222260p - (f222261q / 2);
        layoutParams.setMargins(i2, 0, i2, 0);
        getContainerView().addView(cVar, layoutParams);
        cVar.setLayoutManager(taskBarSectionOtherView$layoutManager$1);
        cVar.setAdapter(aVar3);
        cVar.setOverScrollMode(2);
    }

    /* renamed from: a */
    public boolean mo91214a(int i) {
        int i2 = ((MultiTaskInfo) ((ArrayList) getViewModel().f192729d).get(i)).field_type;
        return (i2 == 6 || i2 == 21 || i2 == 22) ? false : true;
    }

    /* renamed from: b */
    public void mo91215b() {
        TextView title = getTitle();
        if (title != null) {
            title.setText(mo91216c());
        }
        this.f222263n.notifyDataSetChanged();
    }

    /* renamed from: c */
    public String mo91216c() {
        int floor = (int) Math.floor(((double) (((C32735h) C86312j.m106911c(C32735h.class)).mo58777He(C32735h.C32737c.clicfg_taskbar_recent_timeout, 3600) * ((long) 1000))) / 3600000.0d);
        String q = C76577a.m92166q(getContext(), floor > 1 ? C0966R.string.f7895vg : C0966R.string.f7896vh);
        C87412m.m108593f(q, "getString(context,\n     …bar_section_other_single)");
        String format = String.format(q, Arrays.copyOf(new Object[]{Integer.valueOf(floor)}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        return format;
    }

    /* renamed from: d */
    public boolean mo91217d(int i) {
        int i2 = ((MultiTaskInfo) ((ArrayList) getViewModel().f192729d).get(i)).field_type;
        return i2 == 2 || i2 == 4;
    }

    public final C100075f getThumbLoaderOption() {
        return this.f222262j;
    }

    public void removeItem(int i) {
        if (i < 0 || i >= ((ArrayList) getViewModel().f192729d).size()) {
            Log.m105924i("MicroMsg.TaskBarSectionOtherView", "remove item outOfBounds " + i + ' ' + ((ArrayList) getViewModel().f192729d).size());
            return;
        }
        MultiTaskInfo multiTaskInfo = (MultiTaskInfo) ((ArrayList) getViewModel().f192729d).remove(i);
        Log.m105924i("MicroMsg.TaskBarSectionOtherView", "remove item " + i + ' ' + multiTaskInfo.mo80305m2().f183752e + ' ' + multiTaskInfo.field_id);
        ((C65900i) C86312j.m106911c(C65900i.class)).yx0(multiTaskInfo);
        ((C37860g) C86312j.m106911c(C37860g.class)).mo61365E1(multiTaskInfo.field_id, true, 3);
        if (((ArrayList) getViewModel().f192729d).size() != 0) {
            this.f222263n.notifyItemRemoved(i);
            C75666a aVar = this.f222263n;
            aVar.notifyItemRangeChanged(0, aVar.getItemCount(), Boolean.TRUE);
        }
        C67113b.C67114a callback = getCallback();
        int sectionType = getSectionType();
        TaskBarView taskBarView = (TaskBarView) callback;
        if (sectionType != 4 || taskBarView.f206468B1.indexOf(Integer.valueOf(sectionType)) == -1 || !((ArrayList) taskBarView.f206512z1.mo98231a(4).f192729d).isEmpty()) {
            taskBarView.getAdapter().notifyItemChanged(taskBarView.f206468B1.indexOf(Integer.valueOf(sectionType)), Boolean.TRUE);
            return;
        }
        Log.m105924i("MicroMsg.TaskBarView", "other last item removed");
        TaskBarViewPresenter taskBarViewPresenter = taskBarView.f206512z1;
        taskBarViewPresenter.mo98234d(taskBarViewPresenter.mo98231a(4));
        taskBarView.post(new C71350z(taskBarView, 4));
    }

    /* renamed from: ey2.a$a */
    public final class C75666a extends RecyclerView.C16613e<C58851b> {
        public C75666a() {
        }

        public int getItemCount() {
            return ((ArrayList) C75665a.this.getViewModel().f192729d).size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            int i2 = i;
            C58851b bVar = (C58851b) zVar;
            C87412m.m108594g(bVar, "viewHolder");
            long currentTimeMillis = System.currentTimeMillis();
            MultiTaskInfo multiTaskInfo = (MultiTaskInfo) ((ArrayList) C75665a.this.getViewModel().f192729d).get(i2);
            C75665a aVar = C75665a.this;
            aVar.getClass();
            boolean z = false;
            Log.m105925i("MicroMsg.TaskBarSectionBaseView", "configItemViewHolderOnBind %d %d", Integer.valueOf(bVar.mo17363j()), Integer.valueOf(aVar.f192709e));
            View view = bVar.f44854d;
            view.setTag(C0966R.C0970id.c3_, new C78253a(aVar.getContext(), view));
            view.setOnClickListener(new C67115c(bVar, aVar));
            view.setOnLongClickListener(new C67116d(aVar, bVar));
            C75665a aVar2 = C75665a.this;
            MultiTaskInfo multiTaskInfo2 = (MultiTaskInfo) ((ArrayList) aVar2.getViewModel().f192729d).get(i2);
            C87412m.m108594g(multiTaskInfo2, "multiTaskInfo");
            TaskBarView taskBarView = (TaskBarView) aVar2.f192708d;
            if (!taskBarView.f206486T1) {
                TaskBarViewPresenter taskBarViewPresenter = taskBarView.f206512z1;
                taskBarViewPresenter.getClass();
                Log.m105925i("MicroMsg.TaskBarViewPresenter", "reportOnItemAppear type:%d,multiTaskId:%s", Integer.valueOf(multiTaskInfo2.field_type), multiTaskInfo2.field_id);
                int a = taskBarViewPresenter.f206534m.mo53503a(multiTaskInfo2.field_type);
                TaskBarViewPresenter.C30482a aVar3 = taskBarViewPresenter.f206522a;
                if (aVar3 != null && ((TaskBarView) aVar3).f206483Q1) {
                    z = true;
                }
                if (z) {
                    taskBarViewPresenter.f206534m.mo53506d(2, a, multiTaskInfo2.field_id, 1, "");
                } else {
                    TaskBarViewPresenter.C71315b bVar2 = new TaskBarViewPresenter.C71315b();
                    bVar2.f206543a = 1;
                    bVar2.f206544b = a;
                    bVar2.f206545c = multiTaskInfo2.field_id;
                    bVar2.f206546d = multiTaskInfo2;
                    taskBarViewPresenter.f206537p.add(bVar2);
                }
            }
            C58854c cVar = C75665a.this.f222264o.get(Integer.valueOf(multiTaskInfo.field_type));
            if (cVar != null) {
                cVar.mo75505d(i2, bVar, C75665a.this.getViewModel());
            }
            View view2 = bVar.f44854d;
            StringBuilder sb = new StringBuilder();
            sb.append(bVar.f168474C.getText());
            sb.append(',');
            sb.append(bVar.f168473B.getText());
            view2.setContentDescription(sb.toString());
            Log.m105924i("MicroMsg.TaskBarSectionOtherView", "onBindViewHolder end " + multiTaskInfo.field_type + ' ' + (System.currentTimeMillis() - currentTimeMillis) + ' ' + multiTaskInfo.mo80305m2().f183752e);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "p0");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.c8a, viewGroup, false);
            C87412m.m108593f(inflate, "from(p0.context).inflate…ar_other_item, p0, false)");
            return new C58851b(inflate);
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
            C58851b bVar = (C58851b) zVar;
            C87412m.m108594g(bVar, "holder");
            C87412m.m108594g(list, "payloads");
            if (list.isEmpty()) {
                super.onBindViewHolder(bVar, i, list);
            }
        }
    }
}
