package com.tencent.p014mm.plugin.multitask.p079ui.p888bg;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.dynamicbackground.model.DynamicBackgroundNative;
import com.tencent.p014mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView;
import com.tencent.p014mm.dynamicbackground.view.GameGLSurfaceView;
import com.tencent.p014mm.dynamicbackground.view.GradientColorBackgroundView;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p206nj.C88956h;
import p917pk.C77103a;
import p917pk.C77105c;
import s92.C77636b;
import s92.C77637c;
import wx2.C66204d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010$\u001a\u00020#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010'\u001a\u00020\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001f\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016@VX\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/bg/DynamicBgContainer;", "Landroid/widget/FrameLayout;", "Ls92/b;", "", "visibility", "Lrx3/b0;", "setVisibility", "", "d", "Z", "getReleased", "()Z", "setReleased", "(Z)V", "released", "Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "e", "Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "getDynamicBgSurfaceView", "()Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;", "setDynamicBgSurfaceView", "(Lcom/tencent/mm/dynamicbackground/view/DynamicBackgroundGLSurfaceView;)V", "dynamicBgSurfaceView", "Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "value", "f", "Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "getGradientBgView", "()Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;", "setGradientBgView", "(Lcom/tencent/mm/dynamicbackground/view/GradientColorBackgroundView;)V", "gradientBgView", "g", "getBottomGradientBgView", "bottomGradientBgView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer */
public final class DynamicBgContainer extends FrameLayout implements C77636b {

    /* renamed from: h */
    public static boolean f201583h;

    /* renamed from: d */
    public boolean f201584d;

    /* renamed from: e */
    public DynamicBackgroundGLSurfaceView f201585e;

    /* renamed from: f */
    public GradientColorBackgroundView f201586f;

    /* renamed from: g */
    public final GradientColorBackgroundView f201587g;

    /* renamed from: com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer$a */
    public static final class C69866a implements DynamicBackgroundGLSurfaceView.C68018b {
        public void finish() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DynamicBgContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (C8480h) null);
        C87412m.m108594g(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DynamicBgContainer(Context context, AttributeSet attributeSet, int i, int i2, C8480h hVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static final void setIsInMultiWindowMode(boolean z) {
        f201583h = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo96166a() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "MicroMsg.DynamicBgContainer."
            java.lang.String r1 = "activeDynamicBg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00bc }
            boolean r0 = r6.f201584d     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r6)
            return
        L_0x000e:
            com.tencent.mm.autogen.events.PreloadToolsProcessEvent r0 = new com.tencent.mm.autogen.events.PreloadToolsProcessEvent     // Catch:{ all -> 0x00bc }
            r0.<init>()     // Catch:{ all -> 0x00bc }
            r0.publish()     // Catch:{ all -> 0x00bc }
            r0 = 0
            r6.setVisibility(r0)     // Catch:{ all -> 0x00bc }
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView r1 = r6.getGradientBgView()     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x0021
            goto L_0x0024
        L_0x0021:
            r1.setVisibility(r0)     // Catch:{ all -> 0x00bc }
        L_0x0024:
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView r1 = r6.getGradientBgView()     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)     // Catch:{ all -> 0x00bc }
        L_0x0030:
            java.lang.Class<wx2.d> r1 = wx2.C66204d.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ all -> 0x00bc }
            wx2.d r1 = (wx2.C66204d) r1     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x0043
            java.lang.String r0 = "MicroMsg.DynamicBgContainer."
            java.lang.String r1 = "addDynamicBackgroundView service is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x00bc }
            monitor-exit(r6)
            return
        L_0x0043:
            boolean r2 = r1.mo90302jV()     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x00ba
            boolean r2 = r1.mo90305zD()     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x00ba
            boolean r2 = f201583h     // Catch:{ all -> 0x00bc }
            if (r2 != 0) goto L_0x00ba
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x00bc }
            r3 = -1
            r2.<init>(r3, r3)     // Catch:{ all -> 0x00bc }
            android.content.Context r3 = r6.getContext()     // Catch:{ all -> 0x00bc }
            android.view.View r1 = r1.wo0(r3)     // Catch:{ all -> 0x00bc }
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r1 = (com.tencent.p014mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView) r1     // Catch:{ all -> 0x00bc }
            r6.f201585e = r1     // Catch:{ all -> 0x00bc }
            r6.mo96169d()     // Catch:{ all -> 0x00bc }
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r1 = r6.f201585e     // Catch:{ all -> 0x00bc }
            r3 = 0
            if (r1 == 0) goto L_0x0072
            android.view.ViewParent r1 = r1.getParent()     // Catch:{ all -> 0x00bc }
            goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            com.tencent.mm.plugin.multitask.ui.bg.DynamicBgContainer r1 = (com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer) r1     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x0089
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r4 = r1.f201585e     // Catch:{ all -> 0x00bc }
            if (r4 == 0) goto L_0x0089
            java.lang.String r4 = "MicroMsg.DynamicBgContainer."
            java.lang.String r5 = "removed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x00bc }
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r4 = r1.f201585e     // Catch:{ all -> 0x00bc }
            r1.removeView(r4)     // Catch:{ all -> 0x00bc }
            r1.f201585e = r3     // Catch:{ all -> 0x00bc }
        L_0x0089:
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r1 = r6.f201585e     // Catch:{ all -> 0x00bc }
            r6.addView(r1, r2)     // Catch:{ all -> 0x00bc }
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r1 = r6.f201585e     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x009c
            com.tencent.mm.dynamicbackground.view.GradientColorBackgroundView r2 = r6.getGradientBgView()     // Catch:{ all -> 0x00bc }
            gy3.C87412m.m108591d(r2)     // Catch:{ all -> 0x00bc }
            r1.setGradientBackgroundView(r2)     // Catch:{ all -> 0x00bc }
        L_0x009c:
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r1 = r6.f201585e     // Catch:{ all -> 0x00bc }
            if (r1 == 0) goto L_0x00a3
            r1.setShowGradientView(r0)     // Catch:{ all -> 0x00bc }
        L_0x00a3:
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r1 = r6.f201585e     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r1.setVisibility(r0)     // Catch:{ all -> 0x00bc }
        L_0x00ab:
            com.tencent.mm.dynamicbackground.view.DynamicBackgroundGLSurfaceView r0 = r6.f201585e     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00b2
            r0.mo93414c()     // Catch:{ all -> 0x00bc }
        L_0x00b2:
            java.lang.String r0 = "MicroMsg.DynamicBgContainer."
            java.lang.String r1 = "virbg: added"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00bc }
        L_0x00ba:
            monitor-exit(r6)
            return
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.multitask.p079ui.p888bg.DynamicBgContainer.mo96166a():void");
    }

    /* renamed from: b */
    public final synchronized void mo96167b() {
        Log.m105924i("MicroMsg.DynamicBgContainer.", "stopDynamicBg");
        GradientColorBackgroundView gradientBgView = getGradientBgView();
        if (gradientBgView != null) {
            gradientBgView.setVisibility(0);
        }
        GradientColorBackgroundView gradientBgView2 = getGradientBgView();
        if (gradientBgView2 != null) {
            gradientBgView2.setAlpha(1.0f);
        }
        DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView = this.f201585e;
        if (dynamicBackgroundGLSurfaceView != null) {
            C66204d dVar = (C66204d) C86312j.m106911c(C66204d.class);
            if (dVar != null) {
                dVar.mo90299Fs();
            }
            Log.m105924i("MicroMsg.DynamicBgContainer.", "stop dynamicBg");
            dynamicBackgroundGLSurfaceView.mo93446b();
            dynamicBackgroundGLSurfaceView.setVisibility(8);
            DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView2 = this.f201585e;
            if (dynamicBackgroundGLSurfaceView2 != null) {
                C69866a aVar = new C69866a();
                GameGLSurfaceView.C68025i iVar = dynamicBackgroundGLSurfaceView2.f195206f;
                iVar.f195221d = new C77103a(dynamicBackgroundGLSurfaceView2, aVar);
                if (iVar.f195223f.isAlive()) {
                    iVar.f195224g.sendEmptyMessage(5);
                }
            }
            removeView(this.f201585e);
            this.f201585e = null;
        }
    }

    /* renamed from: c */
    public final void mo96168c() {
        if (Build.VERSION.SDK_INT < 23 || C88956h.m111064e()) {
            setVisibility(4);
            GradientColorBackgroundView gradientBgView = getGradientBgView();
            if (gradientBgView != null) {
                gradientBgView.setVisibility(4);
            }
        }
    }

    /* renamed from: d */
    public final void mo96169d() {
        DynamicBackgroundNative dynamicBackgroundNative;
        Log.m105924i("MicroMsg.MultiTaskViewBgParticleColorConfig", "getColorConfig " + C85875k4.m106211z());
        C77637c cVar = C85875k4.m106211z() ? C77637c.f226350f : C77637c.f226351g;
        DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView = this.f201585e;
        if (dynamicBackgroundGLSurfaceView != null) {
            int i = cVar.f226352a;
            int i2 = cVar.f226353b;
            int i3 = cVar.f226354c;
            int i4 = cVar.f226355d;
            int i5 = cVar.f226356e;
            DynamicBackgroundGLSurfaceView.C68012a aVar = dynamicBackgroundGLSurfaceView.f195179t;
            if (aVar != null) {
                aVar.f195191k = new DynamicBackgroundGLSurfaceView.C68012a.C68013a(i, i2, i3, i4, i5);
                if (aVar.f195192l && (dynamicBackgroundNative = aVar.f195181a) != null) {
                    long j = dynamicBackgroundNative.f195177a;
                    if (j > 0) {
                        dynamicBackgroundNative.setColor(j, i, i2, i3, i4, i5);
                    }
                }
            }
        }
        GradientColorBackgroundView gradientBgView = getGradientBgView();
        if (gradientBgView != null) {
            gradientBgView.post(new C77105c(gradientBgView, cVar.f226355d, cVar.f226356e));
        }
        GradientColorBackgroundView gradientBgView2 = getGradientBgView();
        if (gradientBgView2 != null) {
            gradientBgView2.setUpdateMode(1);
        }
        GradientColorBackgroundView gradientColorBackgroundView = this.f201587g;
        int i6 = cVar.f226355d;
        int i7 = cVar.f226356e;
        gradientColorBackgroundView.getClass();
        gradientColorBackgroundView.post(new C77105c(gradientColorBackgroundView, i6, i7));
        this.f201587g.setUpdateMode(1);
    }

    public final GradientColorBackgroundView getBottomGradientBgView() {
        return this.f201587g;
    }

    public final DynamicBackgroundGLSurfaceView getDynamicBgSurfaceView() {
        return this.f201585e;
    }

    public GradientColorBackgroundView getGradientBgView() {
        return this.f201586f;
    }

    public final boolean getReleased() {
        return this.f201584d;
    }

    public final void setDynamicBgSurfaceView(DynamicBackgroundGLSurfaceView dynamicBackgroundGLSurfaceView) {
        this.f201585e = dynamicBackgroundGLSurfaceView;
    }

    public void setGradientBgView(GradientColorBackgroundView gradientColorBackgroundView) {
        this.f201586f = gradientColorBackgroundView;
        mo96169d();
    }

    public final void setReleased(boolean z) {
        this.f201584d = z;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        Log.m105924i("MicroMsg.DynamicBgContainer.", "virbg: set visibility " + i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicBgContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108593f(context2, "getContext()");
        GradientColorBackgroundView gradientColorBackgroundView = new GradientColorBackgroundView(context2);
        this.f201587g = gradientColorBackgroundView;
        addView(gradientColorBackgroundView, 0, new FrameLayout.LayoutParams(-1, -1));
        C66204d dVar = (C66204d) C86312j.m106911c(C66204d.class);
        if (dVar != null) {
            dVar.L90();
        }
    }
}
