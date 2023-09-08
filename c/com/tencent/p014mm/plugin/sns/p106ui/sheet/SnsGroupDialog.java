package com.tencent.p014mm.plugin.sns.p106ui.sheet;

import a22.C67001a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.RecyclerView;
import av2.C54353m;
import av2.C54354n;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.GetSnsObjectDetailEvent;
import com.tencent.p014mm.autogen.events.ReturnSnsObjectDetailEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.NewSnsLabelUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44668u3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import kotlin.Metadata;
import nl3.C47276a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vr2.C102236a0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB'\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog;", "Lnl3/a;", "Landroidx/lifecycle/r;", "Lrx3/b0;", "refreshDataOnContextResume", "checkDismissOnContextDestroy", "Landroid/content/Context;", "uiContext", "", "mLocalId", "exposeScene", "scene", "<init>", "(Landroid/content/Context;III)V", "SnsObjectDetailEventListener", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog */
public final class SnsGroupDialog extends C47276a implements C0124r {

    /* renamed from: N */
    public static final /* synthetic */ int f164478N = 0;

    /* renamed from: A */
    public final C13601g f164479A = C36568h.m40985a(new C57429k(this));

    /* renamed from: B */
    public final C13601g f164480B = C36568h.m40985a(new C57423c(this));

    /* renamed from: C */
    public final C13601g f164481C = C36568h.m40985a(new C57428j(this));

    /* renamed from: D */
    public final C13601g f164482D = C36568h.m40985a(new C57424d(this));

    /* renamed from: E */
    public final C13601g f164483E = C36568h.m40985a(new C57425e(this));

    /* renamed from: F */
    public final C13601g f164484F = C36568h.m40985a(new C57427i(this));

    /* renamed from: G */
    public final C13601g f164485G = C36568h.m40985a(C57422b.f164503d);

    /* renamed from: H */
    public SnsObjectDetailEventListener f164486H;

    /* renamed from: I */
    public boolean f164487I;

    /* renamed from: J */
    public final ArrayList<String> f164488J = new ArrayList<>();

    /* renamed from: K */
    public final ArrayList<C54353m> f164489K = new ArrayList<>();

    /* renamed from: L */
    public boolean f164490L;

    /* renamed from: M */
    public final C13601g f164491M = C36568h.m40985a(new C57421a(this));

    /* renamed from: s */
    public final Context f164492s;

    /* renamed from: t */
    public int f164493t;

    /* renamed from: u */
    public final int f164494u;

    /* renamed from: v */
    public final int f164495v;

    /* renamed from: w */
    public SnsObject f164496w;

    /* renamed from: x */
    public int f164497x;

    /* renamed from: y */
    public int f164498y;

    /* renamed from: z */
    public final C13601g f164499z = C36568h.m40985a(new C57430l(this));

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$f */
    public static final class C5483f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f21253d;

        public C5483f(SnsGroupDialog snsGroupDialog) {
            this.f21253d = snsGroupDialog;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initContentView$1");
            this.f21253d.cancel();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initContentView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$g */
    public static final class C5484g extends RecyclerView.C0129l {

        /* renamed from: d */
        public final Paint f21254d;

        /* renamed from: e */
        public final int f21255e = 1;

        /* renamed from: f */
        public final /* synthetic */ SnsGroupDialog f21256f;

        public C5484g(SnsGroupDialog snsGroupDialog) {
            this.f21256f = snsGroupDialog;
            Paint paint = new Paint();
            this.f21254d = paint;
            paint.setColor(C76577a.m92153d(snsGroupDialog.getContext(), C0966R.color.BW_0_Alpha_0_1));
        }

        /* renamed from: h */
        public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            RecyclerView recyclerView2 = recyclerView;
            SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initContentView$2");
            C87412m.m108594g(canvas, "c");
            C87412m.m108594g(recyclerView2, "parent");
            C87412m.m108594g(wVar, "state");
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView2.getChildAt(i);
                int N0 = recyclerView2.mo17029N0(childAt);
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                boolean z = true;
                if (!(adapter != null && adapter.getItemViewType(N0) == 1)) {
                    RecyclerView.C16613e adapter2 = recyclerView.getAdapter();
                    if (!(adapter2 != null && adapter2.getItemViewType(N0) == 3)) {
                        RecyclerView.C16613e adapter3 = recyclerView.getAdapter();
                        if (!(adapter3 != null && adapter3.getItemViewType(N0) == 4)) {
                            RecyclerView.C16613e adapter4 = recyclerView.getAdapter();
                            if (!(adapter4 != null && adapter4.getItemViewType(N0) == 6)) {
                                int bottom = childAt.getBottom() - this.f21255e;
                                RecyclerView.C16613e adapter5 = recyclerView.getAdapter();
                                if (adapter5 == null || adapter5.getItemViewType(N0) != 2) {
                                    z = false;
                                }
                                canvas.drawRect((float) (recyclerView.getPaddingLeft() + (z ? C76577a.m92157h(this.f21256f.getContext(), C0966R.dimen.f3736cp) : C76577a.m92157h(this.f21256f.getContext(), C0966R.dimen.avw))), (float) bottom, (float) (recyclerView.getWidth() - recyclerView.getPaddingRight()), (float) childAt.getBottom(), this.f21254d);
                            }
                        }
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initContentView$2");
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$SnsObjectDetailEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/ReturnSnsObjectDetailEvent;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog;", "weakRef", "<init>", "(Ljava/lang/ref/WeakReference;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener */
    public static final class SnsObjectDetailEventListener extends IListener<ReturnSnsObjectDetailEvent> {

        /* renamed from: d */
        public final WeakReference<SnsGroupDialog> f164500d;

        /* renamed from: e */
        public final String f164501e = ("MicroMsg.SnsObjectDetailEventListener[" + hashCode() + ']');

        public SnsObjectDetailEventListener(WeakReference<SnsGroupDialog> weakReference) {
            super(C40008f.f107254d);
            this.f164500d = weakReference;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
            if (r3 != false) goto L_0x006d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean callback(com.tencent.p014mm.sdk.event.IEvent r11) {
            /*
                r10 = this;
                java.lang.String r0 = "callback"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent r11 = (com.tencent.p014mm.autogen.events.ReturnSnsObjectDetailEvent) r11
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.String r2 = "event"
                gy3.C87412m.m108594g(r11, r2)
                java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog> r2 = r10.f164500d
                r3 = 0
                r4 = 1
                if (r2 != 0) goto L_0x0023
                java.lang.String r11 = r10.f164501e
                java.lang.String r2 = "callback: snsGroupDialog weakRef null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                goto L_0x00d1
            L_0x0023:
                java.lang.Object r2 = r2.get()
                com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog r2 = (com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog) r2
                if (r2 != 0) goto L_0x0037
                java.lang.String r11 = r10.f164501e
                java.lang.String r2 = "callback: snsGroupDialog had destroy"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                goto L_0x00d1
            L_0x0037:
                com.tencent.mm.autogen.events.ReturnSnsObjectDetailEvent$a r11 = r11.f9459d
                com.tencent.mm.protocal.protobuf.SnsObject r11 = r11.f9460a
                if (r11 == 0) goto L_0x00ae
                java.lang.String r5 = r10.f164501e
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "returnSnsObjectDetailEventListener snsid:"
                r6.append(r7)
                long r7 = r11.f283891Id
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
                com.tencent.mm.protocal.protobuf.SnsObject r5 = com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog.m66162M(r2)
                if (r5 == 0) goto L_0x006d
                com.tencent.mm.protocal.protobuf.SnsObject r5 = com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog.m66162M(r2)
                if (r5 == 0) goto L_0x006b
                long r5 = r5.f283891Id
                long r7 = r11.f283891Id
                int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r9 != 0) goto L_0x006b
                r3 = 1
            L_0x006b:
                if (r3 == 0) goto L_0x00cd
            L_0x006d:
                java.lang.String r3 = r10.f164501e
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "ReturnSnsObjectDetailEvent snsObject id:"
                r5.append(r6)
                com.tencent.mm.protocal.protobuf.SnsObject r6 = com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog.m66162M(r2)
                if (r6 == 0) goto L_0x0086
                long r6 = r6.f283891Id
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                goto L_0x0088
            L_0x0086:
                java.lang.String r6 = "-1"
            L_0x0088:
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                java.lang.String r3 = "access$setMSnsObject$p"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
                r2.f164496w = r11
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
                com.tencent.mm.protocal.protobuf.SnsObject r11 = com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog.m66162M(r2)
                java.lang.String r3 = "access$initView"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
                r2.mo81022Q(r11)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
                goto L_0x00cd
            L_0x00ae:
                com.tencent.mm.protocal.protobuf.SnsObject r11 = com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog.m66162M(r2)
                if (r11 != 0) goto L_0x00cd
                android.content.Context r11 = r2.getContext()
                android.content.Context r3 = r2.getContext()
                r5 = 2131836966(0x7f114026, float:1.9307114E38)
                java.lang.String r3 = kg3.C76577a.m92166q(r3, r5)
                com.tencent.mm.plugin.sns.ui.sheet.a r5 = new com.tencent.mm.plugin.sns.ui.sheet.a
                r5.<init>(r2)
                java.lang.String r2 = ""
                nj3.C76879j.m92749t(r11, r3, r2, r5)
            L_0x00cd:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                r3 = 1
            L_0x00d1:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog.SnsObjectDetailEventListener.callback(com.tencent.mm.sdk.event.IEvent):boolean");
        }

        public void dead() {
            SnsMethodCalculate.markStartTimeMs("dead", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener");
            Log.m105924i(this.f164501e, "dead: ");
            super.dead();
            SnsMethodCalculate.markEndTimeMs("dead", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$SnsObjectDetailEventListener");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$a */
    public static final class C57421a extends C87413o implements C32224a<C57432b> {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164502d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57421a(SnsGroupDialog snsGroupDialog) {
            super(0);
            this.f164502d = snsGroupDialog;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2");
            C57432b bVar = new C57432b(this.f164502d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2");
            return bVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$b */
    public static final class C57422b extends C87413o implements C32224a<C44668u3> {

        /* renamed from: d */
        public static final C57422b f164503d = new C57422b();

        public C57422b() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$cstg$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$cstg$2");
            C44668u3 Ni = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni();
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$cstg$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$cstg$2");
            return Ni;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$c */
    public static final class C57423c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164504d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57423c(SnsGroupDialog snsGroupDialog) {
            super(0);
            this.f164504d = snsGroupDialog;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$editGroup$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$editGroup$2");
            View view = this.f164504d.f126905i;
            View findViewById = view != null ? view.findViewById(C0966R.C0970id.nkp) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$editGroup$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$editGroup$2");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$d */
    public static final class C57424d extends C87413o implements C32224a<LinearLayout> {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57424d(SnsGroupDialog snsGroupDialog) {
            super(0);
            this.f164505d = snsGroupDialog;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyContainer$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyContainer$2");
            View view = this.f164505d.f126905i;
            LinearLayout linearLayout = view != null ? (LinearLayout) view.findViewById(C0966R.C0970id.f359254nq1) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyContainer$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyContainer$2");
            return linearLayout;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$e */
    public static final class C57425e extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164506d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57425e(SnsGroupDialog snsGroupDialog) {
            super(0);
            this.f164506d = snsGroupDialog;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyTv$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyTv$2");
            View view = this.f164506d.f126905i;
            TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.f359255nq2) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyTv$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$emptyTv$2");
            return textView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$h */
    public static final class C57426h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164507d;

        public C57426h(SnsGroupDialog snsGroupDialog) {
            this.f164507d = snsGroupDialog;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initView$1");
            SnsGroupDialog snsGroupDialog = this.f164507d;
            int i = SnsGroupDialog.f164478N;
            SnsMethodCalculate.markStartTimeMs("access$jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            snsGroupDialog.getClass();
            SnsMethodCalculate.markStartTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            snsGroupDialog.f164487I = true;
            Log.m105924i("MicroMsg.SnsGroupDialog", "jumpToSnsLabelUI mLocalId:" + snsGroupDialog.f164493t);
            NewSnsLabelUI.m121602Z7(snsGroupDialog.getContext(), snsGroupDialog.f164493t, snsGroupDialog.f164495v);
            SnsMethodCalculate.markEndTimeMs("jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            SnsMethodCalculate.markEndTimeMs("access$jumpToSnsLabelUI", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$initView$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$i */
    public static final class C57427i extends C87413o implements C32224a<WxLinearLayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164508d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57427i(SnsGroupDialog snsGroupDialog) {
            super(0);
            this.f164508d = snsGroupDialog;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$layoutManager$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$layoutManager$2");
            WxLinearLayoutManager wxLinearLayoutManager = new WxLinearLayoutManager(this.f164508d.getContext());
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$layoutManager$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$layoutManager$2");
            return wxLinearLayoutManager;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$j */
    public static final class C57428j extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164509d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57428j(SnsGroupDialog snsGroupDialog) {
            super(0);
            this.f164509d = snsGroupDialog;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$progress$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$progress$2");
            View view = this.f164509d.f126905i;
            View findViewById = view != null ? view.findViewById(C0966R.C0970id.nq4) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$progress$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$progress$2");
            return findViewById;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$k */
    public static final class C57429k extends C87413o implements C32224a<WxRecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164510d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57429k(SnsGroupDialog snsGroupDialog) {
            super(0);
            this.f164510d = snsGroupDialog;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$recyclerView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$recyclerView$2");
            View view = this.f164510d.f126905i;
            WxRecyclerView wxRecyclerView = view != null ? (WxRecyclerView) view.findViewById(C0966R.C0970id.f359256nq3) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$recyclerView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$recyclerView$2");
            return wxRecyclerView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$l */
    public static final class C57430l extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ SnsGroupDialog f164511d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57430l(SnsGroupDialog snsGroupDialog) {
            super(0);
            this.f164511d = snsGroupDialog;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$titleView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$titleView$2");
            View view = this.f164511d.f126905i;
            TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.kpm) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$titleView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$titleView$2");
            return textView;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsGroupDialog(Context context, int i, int i2, int i3) {
        super(context);
        C87412m.m108594g(context, "uiContext");
        this.f164492s = context;
        this.f164493t = i;
        this.f164494u = i2;
        this.f164495v = i3;
        C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
        if (sVar != null) {
            Log.m105924i("MicroMsg.SnsGroupDialog", "init: addObserver to " + context);
            sVar.getLifecycle().addObserver(this);
        }
    }

    /* renamed from: L */
    public static final /* synthetic */ ArrayList m66161L(SnsGroupDialog snsGroupDialog) {
        SnsMethodCalculate.markStartTimeMs("access$getItems$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        ArrayList<C54353m> arrayList = snsGroupDialog.f164489K;
        SnsMethodCalculate.markEndTimeMs("access$getItems$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return arrayList;
    }

    /* renamed from: M */
    public static final /* synthetic */ SnsObject m66162M(SnsGroupDialog snsGroupDialog) {
        SnsMethodCalculate.markStartTimeMs("access$getMSnsObject$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        SnsObject snsObject = snsGroupDialog.f164496w;
        SnsMethodCalculate.markEndTimeMs("access$getMSnsObject$p", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return snsObject;
    }

    /* renamed from: G */
    public View mo6265G() {
        SnsMethodCalculate.markStartTimeMs("inflateContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d2w, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…t.sns_group_dialog, null)");
        SnsMethodCalculate.markEndTimeMs("inflateContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return inflate;
    }

    /* renamed from: H */
    public void mo6266H() {
        WxRecyclerView P;
        View findViewById;
        SnsMethodCalculate.markStartTimeMs("initContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        super.mo6266H();
        Log.m105924i("MicroMsg.SnsGroupDialog", '[' + hashCode() + "] initContentView");
        if (this.f164486H == null) {
            Log.m105924i("MicroMsg.SnsGroupDialog", "initContentView: create SnsObjectDetailEventListener");
            this.f164486H = new SnsObjectDetailEventListener(new WeakReference(this));
        }
        SnsObjectDetailEventListener snsObjectDetailEventListener = this.f164486H;
        if (snsObjectDetailEventListener != null) {
            snsObjectDetailEventListener.alive();
        }
        View view = this.f126905i;
        if (!(view == null || (findViewById = view.findViewById(C0966R.C0970id.bec)) == null)) {
            findViewById.setOnClickListener(new C5483f(this));
        }
        WxRecyclerView P2 = mo81021P();
        if (P2 != null) {
            SnsMethodCalculate.markStartTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            SnsMethodCalculate.markEndTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            P2.setLayoutManager((WxLinearLayoutManager) ((C36570n) this.f164484F).getValue());
        }
        WxRecyclerView P3 = mo81021P();
        if ((P3 != null ? P3.getAdapter() : null) == null && (P = mo81021P()) != null) {
            SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            P.setAdapter((C57432b) ((C36570n) this.f164491M).getValue());
        }
        WxRecyclerView P4 = mo81021P();
        if (P4 != null) {
            P4.mo17085h0(new C5484g(this));
        }
        SnsMethodCalculate.markStartTimeMs("initSnsObject", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        Log.m105924i("MicroMsg.SnsGroupDialog", "initSnsObject mLocalId:" + this.f164493t);
        GetSnsObjectDetailEvent getSnsObjectDetailEvent = new GetSnsObjectDetailEvent();
        getSnsObjectDetailEvent.f9304d.f9306a = this.f164493t;
        getSnsObjectDetailEvent.publish();
        this.f164496w = getSnsObjectDetailEvent.f9305e.f9307a;
        StringBuilder sb = new StringBuilder();
        sb.append("initSnsObject try find snsObject localId:");
        sb.append(this.f164493t);
        sb.append(", snsObject id:");
        SnsObject snsObject = this.f164496w;
        sb.append(snsObject != null ? Long.valueOf(snsObject.f283891Id) : "null");
        Log.m105924i("MicroMsg.SnsGroupDialog", sb.toString());
        SnsMethodCalculate.markEndTimeMs("initSnsObject", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        mo81022Q(this.f164496w);
        SnsMethodCalculate.markEndTimeMs("initContentView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    /* renamed from: J */
    public void mo68876J() {
        SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        super.mo68876J();
        Log.m105924i("MicroMsg.SnsGroupDialog", '[' + hashCode() + "] onDismiss");
        SnsObjectDetailEventListener snsObjectDetailEventListener = this.f164486H;
        if (snsObjectDetailEventListener != null) {
            snsObjectDetailEventListener.dead();
        }
        Context context = this.f164492s;
        C0125s sVar = context instanceof C0125s ? (C0125s) context : null;
        if (sVar != null) {
            Log.m105924i("MicroMsg.SnsGroupDialog", "onDismiss: removeObserver to " + this.f164492s);
            sVar.getLifecycle().removeObserver(this);
        }
        View N = mo81019N();
        boolean z = false;
        if (N != null && N.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            SnsObject snsObject = this.f164496w;
            SnsReportHelper.f275506m0.mo131351L(this.f164494u, this.f164487I, C102236a0.m134763p0(snsObject != null ? snsObject.f283891Id : 0));
        }
        SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    /* renamed from: N */
    public final View mo81019N() {
        SnsMethodCalculate.markStartTimeMs("getEditGroup", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        View view = (View) ((C36570n) this.f164480B).getValue();
        SnsMethodCalculate.markEndTimeMs("getEditGroup", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return view;
    }

    /* renamed from: O */
    public final C54353m mo81020O(int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("getLabelItem", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        String h = ((C67001a) C28250a.m38138a()).mo90970h(String.valueOf(i));
        if (h == null) {
            h = "";
        }
        List k = ((C67001a) C28250a.m38138a()).mo90973k(String.valueOf(i));
        C54353m mVar = new C54353m(z ? 3 : 2, (String) null, new C54354n(i, h, k != null ? k.size() : 0), (C72996z1) null, 10, (C8480h) null);
        SnsMethodCalculate.markEndTimeMs("getLabelItem", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return mVar;
    }

    /* renamed from: P */
    public final WxRecyclerView mo81021P() {
        SnsMethodCalculate.markStartTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        WxRecyclerView wxRecyclerView = (WxRecyclerView) ((C36570n) this.f164479A).getValue();
        SnsMethodCalculate.markEndTimeMs("getRecyclerView", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        return wxRecyclerView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x06e5  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x06e7  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0727  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0356  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81022Q(com.tencent.p014mm.protocal.protobuf.SnsObject r37) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            java.lang.String r2 = "initView"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "initContentView:"
            r4.append(r5)
            int r5 = r0.f164493t
            r4.append(r5)
            java.lang.String r5 = " mSnsObject is null["
            r4.append(r5)
            r5 = 0
            r6 = 1
            if (r1 != 0) goto L_0x0025
            r7 = 1
            goto L_0x0026
        L_0x0025:
            r7 = 0
        L_0x0026:
            r4.append(r7)
            java.lang.String r7 = "], snsObject.Id="
            r4.append(r7)
            r7 = 0
            if (r1 == 0) goto L_0x0035
            long r9 = r1.f283891Id
            goto L_0x0036
        L_0x0035:
            r9 = r7
        L_0x0036:
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            java.lang.String r9 = "MicroMsg.SnsGroupDialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            java.lang.String r4 = "handleDataResult"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            r10 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.lang.String r13 = "getProgress"
            if (r1 != 0) goto L_0x00f3
            android.view.View r7 = r36.mo81019N()
            if (r7 != 0) goto L_0x005b
            goto L_0x0097
        L_0x005b:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r8.mo10233c(r11)
            java.lang.Object[] r15 = r8.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r17 = "handleDataResult"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r7
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r16 = "handleDataResult"
            java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0097:
            com.tencent.mm.view.recyclerview.WxRecyclerView r7 = r36.mo81021P()
            if (r7 != 0) goto L_0x009e
            goto L_0x00a1
        L_0x009e:
            r7.setVisibility(r10)
        L_0x00a1:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r3)
            rx3.g r7 = r0.f164481C
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            android.view.View r7 = (android.view.View) r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r3)
            if (r7 != 0) goto L_0x00b5
            goto L_0x021e
        L_0x00b5:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r8.mo10233c(r12)
            java.lang.Object[] r15 = r8.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r17 = "handleDataResult"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r7
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r16 = "handleDataResult"
            java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x021e
        L_0x00f3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r3)
            rx3.g r14 = r0.f164481C
            rx3.n r14 = (rx3.C36570n) r14
            java.lang.Object r14 = r14.getValue()
            android.view.View r14 = (android.view.View) r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r3)
            if (r14 != 0) goto L_0x0106
            goto L_0x0142
        L_0x0106:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r15 = k20.C60958c.f173611a
            r13.mo10233c(r11)
            java.lang.Object[] r16 = r13.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r18 = "handleDataResult"
            java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r14
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r13 = r13.mo10231a(r5)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r14.setVisibility(r13)
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r17 = "handleDataResult"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
        L_0x0142:
            com.tencent.mm.view.recyclerview.WxRecyclerView r13 = r36.mo81021P()
            if (r13 != 0) goto L_0x0149
            goto L_0x014c
        L_0x0149:
            r13.setVisibility(r5)
        L_0x014c:
            long r13 = r1.f283891Id
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 == 0) goto L_0x01da
            java.lang.String r7 = "enableNewLabelRangeControl"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            f40.o r13 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r13 = r13.mo121142i()
            com.tencent.mm.storage.y1$a r14 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_GROUP_INT_SYNC
            int r13 = r13.mo119689j(r14, r5)
            if (r13 == 0) goto L_0x018e
            r14 = 2
            java.lang.String r15 = "MicroMsg.SnsLabelRangeConfig"
            if (r13 == r14) goto L_0x017e
            boolean r13 = mt2.C47101a.f126572a
            if (r13 == 0) goto L_0x0179
            java.lang.String r13 = "enableNewLabelRangeControl false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)
            mt2.C47101a.f126572a = r5
        L_0x0179:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            r13 = 0
            goto L_0x0193
        L_0x017e:
            boolean r13 = mt2.C47101a.f126572a
            if (r13 != 0) goto L_0x0189
            java.lang.String r13 = "enableNewLabelRangeControl true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r13)
            mt2.C47101a.f126572a = r6
        L_0x0189:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            r13 = 1
            goto L_0x0193
        L_0x018e:
            boolean r13 = mt2.C47101a.f126572a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x0193:
            if (r13 == 0) goto L_0x01da
            android.view.View r7 = r36.mo81019N()
            if (r7 != 0) goto L_0x019d
            goto L_0x021e
        L_0x019d:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r8.mo10233c(r12)
            java.lang.Object[] r15 = r8.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r17 = "handleDataResult"
            java.lang.String r18 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r7
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r15 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r16 = "handleDataResult"
            java.lang.String r17 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            goto L_0x021e
        L_0x01da:
            android.view.View r7 = r36.mo81019N()
            if (r7 != 0) goto L_0x01e1
            goto L_0x021e
        L_0x01e1:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r12 = k20.C60958c.f173611a
            r8.mo10233c(r11)
            java.lang.Object[] r22 = r8.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r24 = "handleDataResult"
            java.lang.String r25 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r7
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            java.lang.Object r8 = r8.mo10231a(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.setVisibility(r8)
            java.lang.String r22 = "com/tencent/mm/plugin/sns/ui/sheet/SnsGroupDialog"
            java.lang.String r23 = "handleDataResult"
            java.lang.String r24 = "(Lcom/tencent/mm/protocal/protobuf/SnsObject;)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
        L_0x021e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            if (r1 != 0) goto L_0x0227
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0227:
            java.util.ArrayList<java.lang.String> r4 = r0.f164488J
            r4.clear()
            java.util.ArrayList<av2.m> r4 = r0.f164489K
            r4.clear()
            r0.f164497x = r5
            r0.f164498y = r5
            vr2.b0$a r4 = vr2.C65874b0.f189421a
            boolean r7 = r4.mo89926e(r1)
            java.lang.String r8 = "getTitleView"
            if (r7 == 0) goto L_0x027d
            java.lang.String r4 = "sns obj has white list"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            rx3.g r4 = r0.f164499z
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            if (r4 == 0) goto L_0x025d
            r7 = 2131837190(0x7f114106, float:1.9307568E38)
            r4.setText(r7)
        L_0x025d:
            java.util.LinkedList<te3.rv3> r4 = r1.GroupUser
            java.util.Iterator r4 = r4.iterator()
            java.lang.String r7 = "snsObject.GroupUser.iterator()"
            gy3.C87412m.m108593f(r4, r7)
        L_0x0269:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x02c1
            java.util.ArrayList<java.lang.String> r7 = r0.f164488J
            java.lang.Object r8 = r4.next()
            te3.rv3 r8 = (te3.C51163rv3) r8
            java.lang.String r8 = r8.f141175d
            r7.add(r8)
            goto L_0x0269
        L_0x027d:
            boolean r4 = r4.mo89924c(r1)
            if (r4 == 0) goto L_0x02c1
            java.lang.String r4 = "sns obj has black list"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            rx3.g r4 = r0.f164499z
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            if (r4 == 0) goto L_0x02a1
            r7 = 2131837169(0x7f1140f1, float:1.9307525E38)
            r4.setText(r7)
        L_0x02a1:
            java.util.LinkedList<te3.rv3> r4 = r1.BlackList
            java.util.Iterator r4 = r4.iterator()
            java.lang.String r7 = "snsObject.BlackList.iterator()"
            gy3.C87412m.m108593f(r4, r7)
        L_0x02ad:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x02c1
            java.util.ArrayList<java.lang.String> r7 = r0.f164488J
            java.lang.Object r8 = r4.next()
            te3.rv3 r8 = (te3.C51163rv3) r8
            java.lang.String r8 = r8.f141175d
            r7.add(r8)
            goto L_0x02ad
        L_0x02c1:
            vr2.b0$a r4 = vr2.C65874b0.f189421a
            r4.mo89928g(r9, r1, r5)
            java.lang.String r7 = "loadLabelData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            boolean r8 = r4.mo89927f(r1)
            java.lang.String r11 = " label id:"
            java.lang.String r12 = " skip, memberCount=0"
            java.lang.String r13 = "i"
            java.lang.String r14 = "getCount"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.sheet.LabelInfo"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.sheet.ItemInfo"
            java.lang.String r15 = "setType"
            r20 = 0
            if (r8 == 0) goto L_0x03f4
            java.util.ArrayList<av2.m> r4 = r0.f164489K
            int r4 = r4.size()
            java.util.LinkedList<java.lang.Integer> r8 = r1.GroupContactTagIdList
            java.lang.String r6 = "snsObject.GroupContactTagIdList"
            gy3.C87412m.m108593f(r8, r6)
            java.util.Iterator r6 = r8.iterator()
            r8 = 0
        L_0x02f6:
            boolean r22 = r6.hasNext()
            if (r22 == 0) goto L_0x0389
            java.lang.Object r22 = r6.next()
            int r23 = r8 + 1
            if (r8 < 0) goto L_0x0385
            r24 = r6
            r6 = r22
            java.lang.Integer r6 = (java.lang.Integer) r6
            gy3.C87412m.m108593f(r6, r13)
            r22 = r2
            int r2 = r6.intValue()
            r25 = r7
            java.util.LinkedList<java.lang.Integer> r7 = r1.GroupContactTagIdList
            int r7 = r7.size()
            r21 = 1
            int r7 = r7 + -1
            if (r8 != r7) goto L_0x0323
            r7 = 1
            goto L_0x0324
        L_0x0323:
            r7 = 0
        L_0x0324:
            av2.m r2 = r0.mo81020O(r2, r7)
            av2.n r7 = r2.mo75121a()
            if (r7 == 0) goto L_0x033a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r5)
            int r7 = r7.f152521c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r5)
            if (r7 != 0) goto L_0x033a
            r7 = 1
            goto L_0x033b
        L_0x033a:
            r7 = 0
        L_0x033b:
            if (r7 == 0) goto L_0x0356
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "[loadLabelData] GroupContactTagIdList labelId:"
            r2.append(r7)
            r2.append(r6)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            r6 = 1
            goto L_0x037b
        L_0x0356:
            java.util.ArrayList<av2.m> r7 = r0.f164489K
            r7.add(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "GroupTag index:"
            r2.append(r7)
            r2.append(r8)
            r2.append(r11)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            int r2 = r0.f164497x
            r6 = 1
            int r2 = r2 + r6
            r0.f164497x = r2
        L_0x037b:
            r2 = r22
            r8 = r23
            r6 = r24
            r7 = r25
            goto L_0x02f6
        L_0x0385:
            sx3.C64197v.m75542k()
            throw r20
        L_0x0389:
            r22 = r2
            r25 = r7
            r6 = 1
            int r2 = r0.f164497x
            if (r2 <= 0) goto L_0x03b4
            java.util.ArrayList<av2.m> r2 = r0.f164489K
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r6
            if (r2 == 0) goto L_0x03b4
            java.util.ArrayList<av2.m> r2 = r0.f164489K
            int r5 = r2.size()
            int r5 = r5 - r6
            java.lang.Object r2 = r2.get(r5)
            av2.m r2 = (av2.C54353m) r2
            r2.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r10)
            r5 = 3
            r2.f152515a = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r10)
        L_0x03b4:
            int r2 = r0.f164497x
            if (r2 <= 0) goto L_0x051a
            java.util.ArrayList<av2.m> r2 = r0.f164489K
            av2.m r5 = new av2.m
            r27 = 1
            android.content.Context r6 = r36.getContext()
            r7 = 2131836970(0x7f11402a, float:1.9307122E38)
            java.lang.String r28 = kg3.C76577a.m92166q(r6, r7)
            r33 = 0
            r30 = 0
            r31 = 12
            r6 = 0
            r29 = 0
            r32 = 0
            r26 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r2.add(r4, r5)
            java.util.ArrayList<av2.m> r2 = r0.f164489K
            av2.m r4 = new av2.m
            r30 = 4
            r31 = 0
            r34 = 14
            r35 = 0
            r29 = r4
            r32 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r2.add(r4)
            goto L_0x051a
        L_0x03f4:
            r22 = r2
            r25 = r7
            boolean r2 = r4.mo89925d(r1)
            if (r2 == 0) goto L_0x051a
            java.util.ArrayList<av2.m> r2 = r0.f164489K
            int r2 = r2.size()
            java.util.LinkedList<java.lang.Integer> r4 = r1.BlackContactTagIdList
            java.lang.String r6 = "snsObject.BlackContactTagIdList"
            gy3.C87412m.m108593f(r4, r6)
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
        L_0x0411:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x04b5
            java.lang.Object r7 = r4.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x04b1
            java.lang.Integer r7 = (java.lang.Integer) r7
            gy3.C87412m.m108593f(r7, r13)
            r23 = r4
            int r4 = r7.intValue()
            r24 = r8
            java.lang.String r8 = "getLabelItem$default"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r3)
            r26 = r13
            r13 = 0
            av2.m r4 = r0.mo81020O(r4, r13)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r3)
            av2.n r8 = r4.mo75121a()
            if (r8 == 0) goto L_0x044d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r5)
            int r8 = r8.f152521c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r5)
            if (r8 != 0) goto L_0x044d
            r8 = 1
            goto L_0x044e
        L_0x044d:
            r8 = 0
        L_0x044e:
            if (r8 != 0) goto L_0x0492
            av2.n r8 = r4.mo75121a()
            if (r8 == 0) goto L_0x0461
            java.lang.String r13 = "getName"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r5)
            java.lang.String r8 = r8.f152520b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r5)
            goto L_0x0463
        L_0x0461:
            r8 = r20
        L_0x0463:
            java.lang.String r13 = ""
            boolean r8 = gy3.C87412m.m108589b(r8, r13)
            if (r8 == 0) goto L_0x046c
            goto L_0x0492
        L_0x046c:
            java.util.ArrayList<av2.m> r8 = r0.f164489K
            r8.add(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "BlackTag index:"
            r4.append(r8)
            r4.append(r6)
            r4.append(r11)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            int r4 = r0.f164497x
            r6 = 1
            int r4 = r4 + r6
            r0.f164497x = r4
            goto L_0x04a9
        L_0x0492:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "[loadLabelData] BlackContactTagIdList labelId:"
            r4.append(r6)
            r4.append(r7)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
        L_0x04a9:
            r4 = r23
            r6 = r24
            r13 = r26
            goto L_0x0411
        L_0x04b1:
            sx3.C64197v.m75542k()
            throw r20
        L_0x04b5:
            int r4 = r0.f164497x
            if (r4 <= 0) goto L_0x04dc
            java.util.ArrayList<av2.m> r4 = r0.f164489K
            boolean r4 = r4.isEmpty()
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x04dc
            java.util.ArrayList<av2.m> r4 = r0.f164489K
            int r6 = r4.size()
            int r6 = r6 - r5
            java.lang.Object r4 = r4.get(r6)
            av2.m r4 = (av2.C54353m) r4
            r4.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r10)
            r5 = 3
            r4.f152515a = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r10)
        L_0x04dc:
            int r4 = r0.f164497x
            if (r4 <= 0) goto L_0x051a
            java.util.ArrayList<av2.m> r4 = r0.f164489K
            av2.m r5 = new av2.m
            r27 = 1
            android.content.Context r6 = r36.getContext()
            r7 = 2131836970(0x7f11402a, float:1.9307122E38)
            java.lang.String r28 = kg3.C76577a.m92166q(r6, r7)
            r33 = 0
            r30 = 0
            r31 = 12
            r6 = 0
            r29 = 0
            r32 = 0
            r26 = r5
            r26.<init>(r27, r28, r29, r30, r31, r32)
            r4.add(r2, r5)
            java.util.ArrayList<av2.m> r2 = r0.f164489K
            av2.m r4 = new av2.m
            r30 = 4
            r31 = 0
            r34 = 14
            r35 = 0
            r29 = r4
            r32 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35)
            r2.add(r4)
        L_0x051a:
            r2 = r25
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.String r2 = "loadContactData"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mUserNames size:"
            r4.append(r5)
            java.util.ArrayList<java.lang.String> r5 = r0.f164488J
            int r5 = r5.size()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r4)
            java.util.ArrayList<java.lang.String> r4 = r0.f164488J
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x054f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r21 = 1
            goto L_0x061e
        L_0x054f:
            java.util.ArrayList<av2.m> r4 = r0.f164489K
            int r4 = r4.size()
            java.util.ArrayList<java.lang.String> r5 = r0.f164488J
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x055c:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x05c8
            java.lang.Object r7 = r5.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L_0x05c4
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r6 = "getCstg"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            rx3.g r11 = r0.f164485G
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            com.tencent.mm.storage.u3 r11 = (com.tencent.p014mm.storage.C44668u3) r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            com.tencent.mm.storage.z1 r27 = r11.get(r7)
            boolean r6 = r27.mo62927s3()
            if (r6 != 0) goto L_0x05a4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "[loadContactData] name:"
            r6.append(r11)
            r6.append(r7)
            java.lang.String r7 = " skip, isContact:false"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            r21 = 1
            goto L_0x05c2
        L_0x05a4:
            java.util.ArrayList<av2.m> r6 = r0.f164489K
            av2.m r7 = new av2.m
            r24 = 5
            r25 = 0
            r26 = 0
            r28 = 6
            r29 = 0
            r23 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r6.add(r7)
            int r6 = r0.f164498y
            r21 = 1
            int r6 = r6 + 1
            r0.f164498y = r6
        L_0x05c2:
            r6 = r8
            goto L_0x055c
        L_0x05c4:
            sx3.C64197v.m75542k()
            throw r20
        L_0x05c8:
            r21 = 1
            int r5 = r0.f164498y
            if (r5 <= 0) goto L_0x05f2
            java.util.ArrayList<av2.m> r5 = r0.f164489K
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x05f2
            java.util.ArrayList<av2.m> r5 = r0.f164489K
            int r6 = r5.size()
            int r6 = r6 + -1
            java.lang.Object r5 = r5.get(r6)
            av2.m r5 = (av2.C54353m) r5
            r6 = 6
            r5.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r10)
            r5.f152515a = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r10)
        L_0x05f2:
            int r5 = r0.f164497x
            if (r5 <= 0) goto L_0x061b
            int r5 = r0.f164498y
            if (r5 <= 0) goto L_0x061b
            java.util.ArrayList<av2.m> r5 = r0.f164489K
            av2.m r6 = new av2.m
            r24 = 1
            android.content.Context r7 = r36.getContext()
            r8 = 2131836968(0x7f114028, float:1.9307118E38)
            java.lang.String r25 = kg3.C76577a.m92166q(r7, r8)
            r26 = 0
            r27 = 0
            r28 = 12
            r29 = 0
            r23 = r6
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r5.add(r4, r6)
        L_0x061b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x061e:
            java.lang.String r2 = "checkEnableShowContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            int r4 = r0.f164497x
            java.lang.String r5 = "getEmptyContainer"
            if (r4 != 0) goto L_0x06a3
            int r4 = r0.f164498y
            if (r4 != 0) goto L_0x06a3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            rx3.g r4 = r0.f164482D
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            if (r4 != 0) goto L_0x0640
            goto L_0x0644
        L_0x0640:
            r5 = 0
            r4.setVisibility(r5)
        L_0x0644:
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r36.mo81021P()
            if (r4 != 0) goto L_0x064b
            goto L_0x064f
        L_0x064b:
            r5 = 4
            r4.setVisibility(r5)
        L_0x064f:
            vr2.b0$a r4 = vr2.C65874b0.f189421a
            boolean r5 = r4.mo89926e(r1)
            java.lang.String r6 = "getEmptyTv"
            if (r5 == 0) goto L_0x067b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            rx3.g r4 = r0.f164483E
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            if (r4 != 0) goto L_0x066c
            goto L_0x06c1
        L_0x066c:
            android.content.Context r5 = r36.getContext()
            r6 = 2131836972(0x7f11402c, float:1.9307126E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setText(r5)
            goto L_0x06c1
        L_0x067b:
            boolean r4 = r4.mo89924c(r1)
            if (r4 == 0) goto L_0x06c1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            rx3.g r4 = r0.f164483E
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            if (r4 != 0) goto L_0x0694
            goto L_0x06c1
        L_0x0694:
            android.content.Context r5 = r36.getContext()
            r6 = 2131836971(0x7f11402b, float:1.9307124E38)
            java.lang.String r5 = r5.getString(r6)
            r4.setText(r5)
            goto L_0x06c1
        L_0x06a3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            rx3.g r4 = r0.f164482D
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            if (r4 != 0) goto L_0x06b6
            goto L_0x06bb
        L_0x06b6:
            r5 = 8
            r4.setVisibility(r5)
        L_0x06bb:
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r36.mo81021P()
            if (r4 != 0) goto L_0x06c3
        L_0x06c1:
            r5 = 0
            goto L_0x06c7
        L_0x06c3:
            r5 = 0
            r4.setVisibility(r5)
        L_0x06c7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.String r2 = "isDidLabelChosen"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            vr2.b0$a r4 = vr2.C65874b0.f189421a
            java.lang.String r6 = "checkHaveSetTagVisibility"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            boolean r8 = r4.mo89927f(r1)
            if (r8 != 0) goto L_0x06e7
            boolean r1 = r4.mo89925d(r1)
            if (r1 == 0) goto L_0x06e5
            goto L_0x06e7
        L_0x06e5:
            r1 = 0
            goto L_0x06e8
        L_0x06e7:
            r1 = 1
        L_0x06e8:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            if (r1 == 0) goto L_0x06f2
            int r1 = r0.f164497x
            if (r1 <= 0) goto L_0x06f2
            r5 = 1
        L_0x06f2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r0.f164490L = r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[initView] enableShowLabelCount:"
            r1.append(r2)
            int r2 = r0.f164497x
            r1.append(r2)
            java.lang.String r2 = ", enableShowContactCount:"
            r1.append(r2)
            int r2 = r0.f164498y
            r1.append(r2)
            java.lang.String r2 = ", haveLabelChosen:"
            r1.append(r2)
            boolean r2 = r0.f164490L
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            android.view.View r1 = r36.mo81019N()
            if (r1 == 0) goto L_0x072f
            com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$h r2 = new com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$h
            r2.<init>(r0)
            r1.setOnClickListener(r2)
        L_0x072f:
            r1 = r22
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog.mo81022Q(com.tencent.mm.protocal.protobuf.SnsObject):void");
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void checkDismissOnContextDestroy() {
        SnsMethodCalculate.markStartTimeMs("checkDismissOnContextDestroy", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        Log.m105924i("MicroMsg.SnsGroupDialog", "checkDismissWhenContextDestroy: dialog lifecycle state:" + ((C103766u) getLifecycle()).f306531b.name());
        if (((C103766u) getLifecycle()).f306531b != C39623j.C39626c.DESTROYED) {
            mo68876J();
        }
        SnsMethodCalculate.markEndTimeMs("checkDismissOnContextDestroy", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void refreshDataOnContextResume() {
        SnsMethodCalculate.markStartTimeMs("refreshDataOnContextResume", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
        Log.m105924i("MicroMsg.SnsGroupDialog", "refreshDataOnContextResume: dialog lifecycle state:" + ((C103766u) getLifecycle()).f306531b.name());
        if (((C103766u) getLifecycle()).f306531b == C39623j.C39626c.RESUMED) {
            SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            SnsObject snsObject = this.f164496w;
            if (snsObject == null) {
                SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            } else {
                SnsInfo SE = C94866e1.Yx0().mo139806SE(snsObject.f283891Id);
                String str = null;
                boolean z = false;
                try {
                    SnsObject snsObject2 = (SnsObject) new SnsObject().parseFrom(SE != null ? SE.field_attrBuf : null);
                    if (snsObject2 == null) {
                        snsObject2 = this.f164496w;
                    }
                    this.f164496w = snsObject2;
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.SnsGroupDialog", e, "", new Object[0]);
                }
                if (SE != null) {
                    SnsObject snsObject3 = this.f164496w;
                    int i = snsObject3 != null ? snsObject3.ExtFlag : 0;
                    SnsMethodCalculate.markStartTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    boolean z2 = (i & 3) == 3 || (i & 5) == 5 || (i & 1025) == 1025 || (i & 513) == 513;
                    SnsMethodCalculate.markEndTimeMs("checkEnableShowGroupByExtFlag", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    boolean z3 = (SE.getLocalPrivate() & 1) != 0;
                    boolean z4 = SE.field_pravited == 0 && !z2;
                    if (z3 || z4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("refresh private:");
                        sb.append(SE.getLocalPrivate() & 1);
                        sb.append(" public:");
                        if (SE.field_pravited == 0) {
                            z = true;
                        }
                        sb.append(z);
                        Log.m105924i("MicroMsg.SnsGroupDialog", sb.toString());
                        dismiss();
                        SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("refresh id:");
                if (SE != null) {
                    str = SE.getSnsId();
                }
                sb4.append(str);
                Log.m105924i("MicroMsg.SnsGroupDialog", sb4.toString());
                mo81022Q(this.f164496w);
                SnsMethodCalculate.markStartTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                SnsMethodCalculate.markEndTimeMs("getAdapter", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
                ((C57432b) ((C36570n) this.f164491M).getValue()).notifyDataSetChanged();
                SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
            }
        }
        SnsMethodCalculate.markEndTimeMs("refreshDataOnContextResume", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog");
    }
}
