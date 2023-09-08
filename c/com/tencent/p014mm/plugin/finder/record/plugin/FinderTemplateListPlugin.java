package com.tencent.p014mm.plugin.finder.record.plugin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.maas.MJMaasCore;
import com.tencent.maas.model.MJTemplateMetadata;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.view.InterceptRecyclerView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.BaseScopePluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ej3.C45662a;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C9556a;
import kg3.C76577a;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64197v;
import te3.C51754vy;
import te3.pr4;
import to1.C64986t;
import to1.C64987u;
import to1.C64989v;
import to1.C64990y;

/* renamed from: com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin */
public final class FinderTemplateListPlugin implements C109344g0, MJMaasCore.TemplateServiceProvider {

    /* renamed from: d */
    public BaseScopePluginLayout f160695d;

    /* renamed from: e */
    public final List<pr4> f160696e;

    /* renamed from: f */
    public final View f160697f = this.f160695d.findViewById(C0966R.C0970id.m7v);

    /* renamed from: g */
    public final InterceptRecyclerView f160698g;

    /* renamed from: h */
    public final C64990y f160699h;

    /* renamed from: i */
    public final C64987u f160700i;

    /* renamed from: j */
    public boolean f160701j;

    /* renamed from: n */
    public final C64989v f160702n;

    /* renamed from: o */
    public final GestureDetector f160703o;

    /* renamed from: p */
    public int f160704p;

    /* renamed from: q */
    public String f160705q;

    /* renamed from: r */
    public final int f160706r;

    /* renamed from: com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin$a */
    public static final class C56239a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTemplateListPlugin f160707d;

        /* renamed from: e */
        public final /* synthetic */ InterceptRecyclerView f160708e;

        public C56239a(FinderTemplateListPlugin finderTemplateListPlugin, InterceptRecyclerView interceptRecyclerView) {
            this.f160707d = finderTemplateListPlugin;
            this.f160708e = interceptRecyclerView;
        }

        public final void run() {
            FinderTemplateListPlugin finderTemplateListPlugin = this.f160707d;
            C64989v vVar = finderTemplateListPlugin.f160702n;
            InterceptRecyclerView interceptRecyclerView = this.f160708e;
            C13604l<Integer, Integer> lVar = new C13604l<>(Integer.valueOf(finderTemplateListPlugin.f160706r), Integer.valueOf((interceptRecyclerView.getBottom() + interceptRecyclerView.getTop()) / 2));
            vVar.getClass();
            vVar.f187109d = lVar;
            vVar.f187110e = C76577a.m92157h(finderTemplateListPlugin.f160695d.getContext(), C0966R.dimen.agd) / 2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin$b */
    public static final class C56240b implements RecyclerView.C16622o {

        /* renamed from: d */
        public final /* synthetic */ FinderTemplateListPlugin f160709d;

        public C56240b(FinderTemplateListPlugin finderTemplateListPlugin) {
            this.f160709d = finderTemplateListPlugin;
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin$1$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "e");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin$1$3", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            View.OnTouchListener onTouchListener;
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "e");
            C64989v vVar = this.f160709d.f160702n;
            vVar.getClass();
            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 2 || motionEvent.getAction() == 3) && vVar.f187112g && (onTouchListener = vVar.f187111f) != null) {
                onTouchListener.onTouch((View) null, motionEvent);
            }
            GestureDetector gestureDetector = this.f160709d.f160703o;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin$1$3", "onInterceptTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin$1$3", "onInterceptTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin$c */
    public static final class C56241c extends C87413o implements C32227p<View, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTemplateListPlugin f160710d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56241c(FinderTemplateListPlugin finderTemplateListPlugin) {
            super(2);
            this.f160710d = finderTemplateListPlugin;
        }

        public Object invoke(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Number) obj2).intValue();
            C87412m.m108594g(view, "view");
            if (this.f160710d.f160701j) {
                FinderTemplateListPlugin finderTemplateListPlugin = this.f160710d;
                int right = ((view.getRight() + view.getLeft()) / 2) - finderTemplateListPlugin.f160706r;
                if (right != 0) {
                    InterceptRecyclerView interceptRecyclerView = finderTemplateListPlugin.f160698g;
                    interceptRecyclerView.f162153y1 = false;
                    interceptRecyclerView.mo17122s1(right, 0, (Interpolator) null);
                }
                this.f160710d.mo78563c(intValue);
            }
            return C13598b0.f38549a;
        }
    }

    public FinderTemplateListPlugin(BaseScopePluginLayout baseScopePluginLayout) {
        C87412m.m108594g(baseScopePluginLayout, "pluginLayout");
        this.f160695d = baseScopePluginLayout;
        pr4 pr4 = new pr4();
        pr4.f139919d = "loading";
        C51754vy vyVar = new C51754vy();
        vyVar.f143760d = "";
        pr4.f139922g = vyVar;
        List<pr4> h = C64197v.m75539h(pr4, pr4);
        this.f160696e = h;
        InterceptRecyclerView interceptRecyclerView = (InterceptRecyclerView) this.f160695d.findViewById(C0966R.C0970id.kgq);
        this.f160698g = interceptRecyclerView;
        C64990y yVar = new C64990y();
        yVar.f187113d.clear();
        yVar.f187113d.addAll(h);
        this.f160699h = yVar;
        C64989v vVar = new C64989v();
        this.f160702n = vVar;
        this.f160703o = new GestureDetector(this.f160695d.getContext(), vVar);
        this.f160705q = "";
        int i = C85875k4.m106184h(MMApplicationContext.getContext()).x;
        int h2 = (((i - C76577a.m92157h(this.f160695d.getContext(), C0966R.dimen.agd)) / 2) / 2) + C76577a.m92157h(this.f160695d.getContext(), C0966R.dimen.f3749d0);
        int i2 = (i / 2) - h2;
        this.f160706r = i2;
        Context context = this.f160695d.getContext();
        C87412m.m108593f(context, "pluginLayout.context");
        C64987u uVar = new C64987u(context, i2);
        this.f160700i = uVar;
        Log.m105924i("MicroMsg.FinderTemplateListPlugin", "alignDistance:" + i2);
        ViewGroup.LayoutParams layoutParams = interceptRecyclerView.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(h2);
        interceptRecyclerView.setLayoutParams(layoutParams2);
        interceptRecyclerView.setAdapter(yVar);
        interceptRecyclerView.setLayoutManager(new FinderTemplateListPlugin$1$1(this, this.f160695d.getContext(), i2));
        interceptRecyclerView.post(new C56239a(this, interceptRecyclerView));
        interceptRecyclerView.mo17092j0(new C56240b(this));
        uVar.mo75025b(interceptRecyclerView);
        yVar.f187114e = new C56241c(this);
        uVar.f187106i = new C64986t(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058 A[Catch:{ Exception -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m64383a(com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin r6, java.lang.String r7, wx3.C15601d r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof to1.C64981q
            if (r0 == 0) goto L_0x0016
            r0 = r8
            to1.q r0 = (to1.C64981q) r0
            int r1 = r0.f187094g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f187094g = r1
            goto L_0x001b
        L_0x0016:
            to1.q r0 = new to1.q
            r0.<init>(r6, r8)
        L_0x001b:
            java.lang.Object r8 = r0.f187092e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187094g
            java.lang.String r3 = "MicroMsg.FinderTemplateListPlugin"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f187091d
            com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin r6 = (com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin) r6
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x0051
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "requestTemplateList start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)     // Catch:{ Exception -> 0x00b5 }
            r6.f160701j = r5     // Catch:{ Exception -> 0x00b5 }
            qa0.b r8 = qa0.C62586b.f177739a     // Catch:{ Exception -> 0x00b5 }
            r2 = 2
            r0.f187091d = r6     // Catch:{ Exception -> 0x00b5 }
            r0.f187094g = r4     // Catch:{ Exception -> 0x00b5 }
            java.lang.Object r8 = r8.mo87644d(r7, r2, r0)     // Catch:{ Exception -> 0x00b5 }
            if (r8 != r1) goto L_0x0051
            goto L_0x00bf
        L_0x0051:
            te3.pr4 r8 = (te3.pr4) r8     // Catch:{ Exception -> 0x00b5 }
            if (r8 != 0) goto L_0x0058
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00bf
        L_0x0058:
            java.util.List<te3.pr4> r7 = r6.f160696e     // Catch:{ Exception -> 0x00b5 }
            r7.clear()     // Catch:{ Exception -> 0x00b5 }
            java.util.List<te3.pr4> r7 = r6.f160696e     // Catch:{ Exception -> 0x00b5 }
            r7.add(r8)     // Catch:{ Exception -> 0x00b5 }
            java.util.List<te3.pr4> r6 = r6.f160696e     // Catch:{ Exception -> 0x00b5 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00b5 }
            r7 = 0
        L_0x0069:
            boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x00b5 }
            if (r8 == 0) goto L_0x00bd
            java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x00b5 }
            int r0 = r7 + 1
            if (r7 < 0) goto L_0x00b0
            te3.pr4 r8 = (te3.pr4) r8     // Catch:{ Exception -> 0x00b5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b5 }
            r1.<init>()     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r2 = "template["
            r1.append(r2)     // Catch:{ Exception -> 0x00b5 }
            r1.append(r7)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = "],id:"
            r1.append(r7)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = r8.f139919d     // Catch:{ Exception -> 0x00b5 }
            r1.append(r7)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = " type:"
            r1.append(r7)     // Catch:{ Exception -> 0x00b5 }
            int r7 = r8.f139920e     // Catch:{ Exception -> 0x00b5 }
            r1.append(r7)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = " name:"
            r1.append(r7)     // Catch:{ Exception -> 0x00b5 }
            te3.vy r7 = r8.f139922g     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = r7.f143760d     // Catch:{ Exception -> 0x00b5 }
            r1.append(r7)     // Catch:{ Exception -> 0x00b5 }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x00b5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)     // Catch:{ Exception -> 0x00b5 }
            r7 = r0
            goto L_0x0069
        L_0x00b0:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x00b5 }
            r6 = 0
            throw r6     // Catch:{ Exception -> 0x00b5 }
        L_0x00b5:
            r6 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r8 = "requestTemplateList error:"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r6, r8, r7)
        L_0x00bd:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00bf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin.m64383a(com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053 A[Catch:{ Exception -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[Catch:{ Exception -> 0x00e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m64384b(com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin r7, wx3.C15601d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof to1.C64985s
            if (r0 == 0) goto L_0x0016
            r0 = r8
            to1.s r0 = (to1.C64985s) r0
            int r1 = r0.f187102g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f187102g = r1
            goto L_0x001b
        L_0x0016:
            to1.s r0 = new to1.s
            r0.<init>(r7, r8)
        L_0x001b:
            java.lang.Object r8 = r0.f187100e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f187102g
            java.lang.String r3 = "MicroMsg.FinderTemplateListPlugin"
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r7 = r0.f187099d
            com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin r7 = (com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin) r7
            kotlin.ResultKt.throwOnFailure(r8)     // Catch:{ Exception -> 0x00e5 }
            goto L_0x004f
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "requestTemplateList start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)     // Catch:{ Exception -> 0x00e5 }
            qa0.b r8 = qa0.C62586b.f177739a     // Catch:{ Exception -> 0x00e5 }
            r0.f187099d = r7     // Catch:{ Exception -> 0x00e5 }
            r0.f187102g = r4     // Catch:{ Exception -> 0x00e5 }
            java.lang.Object r8 = r8.mo87643c(r0)     // Catch:{ Exception -> 0x00e5 }
            if (r8 != r1) goto L_0x004f
            goto L_0x00ef
        L_0x004f:
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00e5 }
            if (r8 != 0) goto L_0x0057
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00ef
        L_0x0057:
            r7.f160701j = r4     // Catch:{ Exception -> 0x00e5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e5 }
            r0.<init>()     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r1 = "requestTemplateList finish,size:"
            r0.append(r1)     // Catch:{ Exception -> 0x00e5 }
            int r1 = r8.size()     // Catch:{ Exception -> 0x00e5 }
            r0.append(r1)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x00e5 }
            java.util.List<te3.pr4> r0 = r7.f160696e     // Catch:{ Exception -> 0x00e5 }
            r0.clear()     // Catch:{ Exception -> 0x00e5 }
            java.util.List<te3.pr4> r0 = r7.f160696e     // Catch:{ Exception -> 0x00e5 }
            r0.addAll(r8)     // Catch:{ Exception -> 0x00e5 }
            java.util.List<te3.pr4> r7 = r7.f160696e     // Catch:{ Exception -> 0x00e5 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x00e5 }
            r8 = 0
        L_0x0082:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x00e5 }
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x00e5 }
            int r1 = r8 + 1
            r2 = 0
            if (r8 < 0) goto L_0x00e1
            te3.pr4 r0 = (te3.pr4) r0     // Catch:{ Exception -> 0x00e5 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e5 }
            r4.<init>()     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r6 = "template["
            r4.append(r6)     // Catch:{ Exception -> 0x00e5 }
            r4.append(r8)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r8 = "],id:"
            r4.append(r8)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r8 = r0.f139919d     // Catch:{ Exception -> 0x00e5 }
            r4.append(r8)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r8 = " type:"
            r4.append(r8)     // Catch:{ Exception -> 0x00e5 }
            int r8 = r0.f139920e     // Catch:{ Exception -> 0x00e5 }
            r4.append(r8)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r8 = " name:"
            r4.append(r8)     // Catch:{ Exception -> 0x00e5 }
            te3.vy r8 = r0.f139922g     // Catch:{ Exception -> 0x00e5 }
            if (r8 == 0) goto L_0x00c1
            java.lang.String r8 = r8.f143760d     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00c2
        L_0x00c1:
            r8 = r2
        L_0x00c2:
            r4.append(r8)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r8 = " version:"
            r4.append(r8)     // Catch:{ Exception -> 0x00e5 }
            te3.vy r8 = r0.f139922g     // Catch:{ Exception -> 0x00e5 }
            if (r8 == 0) goto L_0x00d5
            int r8 = r8.f143766j     // Catch:{ Exception -> 0x00e5 }
            java.lang.Integer r2 = new java.lang.Integer     // Catch:{ Exception -> 0x00e5 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x00e5 }
        L_0x00d5:
            r4.append(r2)     // Catch:{ Exception -> 0x00e5 }
            java.lang.String r8 = r4.toString()     // Catch:{ Exception -> 0x00e5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r8)     // Catch:{ Exception -> 0x00e5 }
            r8 = r1
            goto L_0x0082
        L_0x00e1:
            sx3.C64197v.m75542k()     // Catch:{ Exception -> 0x00e5 }
            throw r2     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            r7 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.String r0 = "requestTemplateList error:"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r7, r0, r8)
        L_0x00ed:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.record.plugin.FinderTemplateListPlugin.m64384b(com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo78563c(int i) {
        if (this.f160697f.getVisibility() == 0) {
            C64990y yVar = this.f160699h;
            String str = null;
            pr4 pr4 = yVar.f187113d.size() > i ? yVar.f187113d.get(i) : null;
            if ((pr4 != null ? pr4.f139919d : null) == null || C87412m.m108589b(pr4.f139919d, "loading") || this.f160699h.getItemCount() <= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("value not valid,id:");
                if (pr4 != null) {
                    str = pr4.f139919d;
                }
                sb.append(str);
                sb.append(" count:");
                sb.append(this.f160699h.getItemCount());
                Log.m105920e("MicroMsg.FinderTemplateListPlugin", sb.toString());
            } else if (this.f160704p != i || !C87412m.m108589b(this.f160705q, pr4.f139919d)) {
                this.f160704p = i;
                String str2 = pr4.f139919d;
                if (str2 == null) {
                    str2 = "";
                }
                this.f160705q = str2;
                Log.printInfoStack("MicroMsg.FinderTemplateListPlugin", "item " + i + " selected, id " + pr4.f139919d, new Object[0]);
                BaseScopePluginLayout baseScopePluginLayout = this.f160695d;
                C101198e.C101199b bVar = C101198e.C101199b.RECORD_SWITCH_TEMPLATE;
                Bundle bundle = new Bundle();
                bundle.putByteArray("PARAM_1_BYTEARRAY", pr4.toByteArray());
                C13598b0 b0Var = C13598b0.f38549a;
                baseScopePluginLayout.mo14585p(bVar, bundle);
            } else {
                Log.m105920e("MicroMsg.FinderTemplateListPlugin", "same index,jump select");
            }
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        return false;
    }

    public String name() {
        return FinderTemplateListPlugin.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public MJTemplateMetadata onRequestTemplateMetadata(String str) {
        T t;
        C87412m.m108594g(str, "p0");
        Iterator<T> it = this.f160696e.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((pr4) t).f139919d, str)) {
                break;
            }
        }
        pr4 pr4 = (pr4) t;
        if (pr4 == null) {
            return null;
        }
        C51754vy vyVar = pr4.f139922g;
        String str2 = vyVar.f143765i;
        int i = pr4.f139929q.f145471d;
        return new MJTemplateMetadata(pr4.f139919d, (long) vyVar.f143766j, str2, (long) i, (long) i);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public void setVisibility(int i) {
        int i2;
        if (i == 0) {
            View view = this.f160697f;
            C87412m.m108593f(view, "templateLayout");
            C45662a.m50855a(view, 0.0f, 0, (C32224a) null, 7, (Object) null);
        } else {
            View view2 = this.f160697f;
            C87412m.m108593f(view2, "templateLayout");
            C45662a.m50856b(view2, 0, 0, (C32224a) null, 7, (Object) null);
        }
        if (i == 0 && (i2 = this.f160704p) >= 0) {
            mo78563c(i2);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
