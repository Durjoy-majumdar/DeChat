package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.view.View;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.AdViewComponent */
public abstract class AdViewComponent<Model> {

    /* renamed from: a */
    public final C0125s f281407a;

    /* renamed from: b */
    public final View f281408b;

    /* renamed from: c */
    public final String f281409c;

    /* renamed from: d */
    public Model f281410d;

    /* renamed from: e */
    public boolean f281411e;

    /* renamed from: f */
    public boolean f281412f;

    /* renamed from: g */
    public List<AdViewComponent<Model>> f281413g;

    /* renamed from: h */
    public boolean f281414h;

    /* renamed from: i */
    public boolean f281415i;

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$a */
    public static final class C96278a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ AdViewComponent<Model> f281416d;

        public C96278a(AdViewComponent<Model> adViewComponent) {
            this.f281416d = adViewComponent;
        }

        public void onViewAttachedToWindow(View view) {
            SnsMethodCalculate.markStartTimeMs("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$onAttachStateChangeListener$1");
            SnsMethodCalculate.markEndTimeMs("onViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$onAttachStateChangeListener$1");
        }

        public void onViewDetachedFromWindow(View view) {
            SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$onAttachStateChangeListener$1");
            String e = this.f281416d.mo133972e();
            Log.m105924i(e, "onViewDetachedFromWindow() called with: v = " + view);
            AdViewComponent<Model> adViewComponent = this.f281416d;
            adViewComponent.getClass();
            SnsMethodCalculate.markStartTimeMs("setHasBindAfterDetach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            adViewComponent.f281412f = false;
            SnsMethodCalculate.markEndTimeMs("setHasBindAfterDetach", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            AdViewComponent<Model> adViewComponent2 = this.f281416d;
            SnsMethodCalculate.markStartTimeMs("access$setAttachStateChangeListenerHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            adViewComponent2.f281415i = false;
            SnsMethodCalculate.markEndTimeMs("access$setAttachStateChangeListenerHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            AdViewComponent<Model> adViewComponent3 = this.f281416d;
            adViewComponent3.getClass();
            SnsMethodCalculate.markStartTimeMs("getViewContainer", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            View view2 = adViewComponent3.f281408b;
            SnsMethodCalculate.markEndTimeMs("getViewContainer", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(this);
            }
            SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$onAttachStateChangeListener$1");
        }
    }

    public AdViewComponent(String str, C0125s sVar, View view) {
        this.f281407a = sVar;
        this.f281408b = view;
        StringBuilder sb = new StringBuilder();
        sb.append("AdViewComponent.");
        sb.append(str == null ? "" : str);
        this.f281409c = sb.toString();
        this.f281411e = true;
    }

    /* renamed from: a */
    public void mo133411a(Model model) {
        SnsMethodCalculate.markStartTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        SnsMethodCalculate.markEndTimeMs("bindComponentDataOnEveryFillItem", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    /* renamed from: b */
    public abstract void mo133412b(Model model);

    /* renamed from: c */
    public final void mo133970c(Model model) {
        SnsMethodCalculate.markStartTimeMs("bindSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        List<AdViewComponent<Model>> list = this.f281413g;
        if (list != null) {
            for (AdViewComponent d : list) {
                d.mo133971d(model);
            }
        }
        SnsMethodCalculate.markEndTimeMs("bindSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r2 = r2.getLifecycle();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo133971d(Model r10) {
        /*
            r9 = this;
            java.lang.String r0 = "bindView"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r10 != 0) goto L_0x000d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x000d:
            androidx.lifecycle.s r2 = r9.f281407a
            r3 = 0
            if (r2 == 0) goto L_0x001d
            androidx.lifecycle.j r2 = r2.getLifecycle()
            if (r2 == 0) goto L_0x001d
            androidx.lifecycle.j$c r2 = r2.getCurrentState()
            goto L_0x001e
        L_0x001d:
            r2 = r3
        L_0x001e:
            androidx.lifecycle.j$c r4 = androidx.lifecycle.C39623j.C39626c.DESTROYED
            if (r2 != r4) goto L_0x002d
            java.lang.String r10 = r9.f281409c
            java.lang.String r2 = "bind view on DESTROYED!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x002d:
            boolean r2 = r9.mo133413f(r10)
            if (r2 != 0) goto L_0x0069
            java.lang.String r10 = "resetSubComponents"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            java.util.List<com.tencent.mm.plugin.sns.ui.widget.AdViewComponent<Model>> r2 = r9.f281413g
            if (r2 == 0) goto L_0x0056
            sx3.t0 r3 = new sx3.t0
            r3.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L_0x0046:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()
            com.tencent.mm.plugin.sns.ui.widget.AdViewComponent r3 = (com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent) r3
            r3.mo133973i()
            goto L_0x0046
        L_0x0056:
            java.util.List<com.tencent.mm.plugin.sns.ui.widget.AdViewComponent<Model>> r2 = r9.f281413g
            if (r2 == 0) goto L_0x005f
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
        L_0x005f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            r9.mo133973i()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x0069:
            Model r2 = r9.f281410d
            r5 = 0
            if (r2 != 0) goto L_0x0070
            r2 = 0
            goto L_0x0074
        L_0x0070:
            boolean r2 = r9.mo133414g(r2, r10)
        L_0x0074:
            if (r2 == 0) goto L_0x007e
            boolean r6 = r9.f281415i
            if (r6 == 0) goto L_0x007e
            boolean r6 = r9.f281412f
            if (r6 != 0) goto L_0x00fa
        L_0x007e:
            java.lang.String r6 = r9.f281409c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "isSameContent = "
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = " ,attachStateChangeListenerHasSet = "
            r7.append(r2)
            boolean r2 = r9.f281415i
            r7.append(r2)
            java.lang.String r2 = " ,hasBindAfterDetach = "
            r7.append(r2)
            boolean r2 = r9.f281412f
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            r9.f281410d = r10
            com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$a r2 = new com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$a
            r2.<init>(r9)
            android.view.View r6 = r9.f281408b
            r7 = 1
            if (r6 == 0) goto L_0x00c3
            boolean r8 = r9.f281415i
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r6 = r3
        L_0x00bc:
            if (r6 == 0) goto L_0x00c3
            r9.f281415i = r7
            r6.addOnAttachStateChangeListener(r2)
        L_0x00c3:
            androidx.lifecycle.s r6 = r9.f281407a
            if (r6 == 0) goto L_0x00e9
            androidx.lifecycle.j r6 = r6.getLifecycle()
            if (r6 == 0) goto L_0x00e9
            androidx.lifecycle.j$c r8 = r6.getCurrentState()
            if (r8 == r4) goto L_0x00d9
            boolean r4 = r9.f281414h
            if (r4 != 0) goto L_0x00d9
            r4 = 1
            goto L_0x00da
        L_0x00d9:
            r4 = 0
        L_0x00da:
            if (r4 == 0) goto L_0x00dd
            r3 = r6
        L_0x00dd:
            if (r3 == 0) goto L_0x00e9
            r9.f281414h = r7
            com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$5 r4 = new com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$5
            r4.<init>(r9, r2, r10)
            r3.addObserver(r4)
        L_0x00e9:
            r9.mo133973i()
            r9.mo133412b(r10)
            java.lang.String r2 = r9.f281409c
            java.lang.String r3 = "bindComponentDataOnExposeFirst"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r9.f281411e = r5
            r9.f281412f = r7
        L_0x00fa:
            r9.mo133411a(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent.mo133971d(java.lang.Object):void");
    }

    /* renamed from: e */
    public final String mo133972e() {
        SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        String str = this.f281409c;
        SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        return str;
    }

    /* renamed from: f */
    public abstract boolean mo133413f(Model model);

    /* renamed from: g */
    public abstract boolean mo133414g(Model model, Model model2);

    /* renamed from: h */
    public void mo133888h(Model model) {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    /* renamed from: i */
    public final void mo133973i() {
        SnsMethodCalculate.markStartTimeMs("resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (!this.f281411e) {
            mo133415j();
            this.f281411e = true;
        }
        SnsMethodCalculate.markEndTimeMs("resetComponent", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }

    /* renamed from: j */
    public abstract void mo133415j();

    /* renamed from: k */
    public final void mo133974k(List<? extends AdViewComponent<Model>> list) {
        SnsMethodCalculate.markStartTimeMs("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
        if (list == null) {
            SnsMethodCalculate.markEndTimeMs("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            return;
        }
        if (this.f281413g == null) {
            this.f281413g = new ArrayList();
        }
        List<AdViewComponent<Model>> list2 = this.f281413g;
        if (list2 != null) {
            list2.clear();
        }
        List<AdViewComponent<Model>> list3 = this.f281413g;
        if (list3 != null) {
            list3.addAll(list);
        }
        SnsMethodCalculate.markEndTimeMs("setSubComponents", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
    }
}
