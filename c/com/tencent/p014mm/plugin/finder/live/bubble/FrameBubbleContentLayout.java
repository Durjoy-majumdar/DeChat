package com.tencent.p014mm.plugin.finder.live.bubble;

import a14.C53916l;
import a14.C53921m;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.transition.C103834d;
import androidx.transition.C67095c;
import androidx.transition.Transition;
import com.tencent.p014mm.sdk.platformtools.Log;
import eg1.C58591p0;
import gy3.C8480h;
import gy3.C87412m;
import jk1.C108754b;
import jk1.C108755c;
import kotlin.Metadata;
import kotlin.Result;
import o40.C61926c;
import og1.C62010c;
import og1.C62011e;
import og1.C62012f;
import p853i4.C60244h;
import wx3.C15601d;
import xx3.C66447b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B#\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010#\u001a\u00020\u0005¢\u0006\u0004\b!\u0010$J\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\n\u001a\u00020\tR\u001a\u0010\u000f\u001a\u00020\u00008\u0004X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0019\u001a\u00020\u00188B@\u0002X\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006%"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/bubble/FrameBubbleContentLayout;", "Landroid/widget/FrameLayout;", "", "Li4/h;", "getTargetScene", "", "visibility", "Lrx3/b0;", "setVisibility", "Landroid/view/ViewGroup;", "getTargetLayout", "o", "Lcom/tencent/mm/plugin/finder/live/bubble/FrameBubbleContentLayout;", "getSceneRoot", "()Lcom/tencent/mm/plugin/finder/live/bubble/FrameBubbleContentLayout;", "sceneRoot", "Log1/c;", "p", "Log1/c;", "getSceneStateListener", "()Log1/c;", "setSceneStateListener", "(Log1/c;)V", "sceneStateListener", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout */
public class FrameBubbleContentLayout extends FrameLayout {

    /* renamed from: d */
    public C60244h f159267d;

    /* renamed from: e */
    public C60244h f159268e;

    /* renamed from: f */
    public String f159269f;

    /* renamed from: g */
    public Bundle f159270g;

    /* renamed from: h */
    public Bundle f159271h;

    /* renamed from: i */
    public int f159272i;

    /* renamed from: j */
    public ViewGroup f159273j;

    /* renamed from: n */
    public ViewGroup f159274n;

    /* renamed from: o */
    public final FrameBubbleContentLayout f159275o;

    /* renamed from: p */
    public C62010c f159276p;

    /* renamed from: com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout$a */
    public static final class C55898a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FrameBubbleContentLayout f159277d;

        public C55898a(FrameBubbleContentLayout frameBubbleContentLayout) {
            this.f159277d = frameBubbleContentLayout;
        }

        public final void run() {
            Log.m105924i(this.f159277d.getTAG(), "source scene enter");
            FrameBubbleContentLayout frameBubbleContentLayout = this.f159277d;
            frameBubbleContentLayout.f159272i = 1;
            C62010c sceneStateListener = frameBubbleContentLayout.getSceneStateListener();
            if (sceneStateListener != null) {
                sceneStateListener.mo86892m0(this.f159277d.f159271h);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout$b */
    public static final class C55899b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FrameBubbleContentLayout f159278d;

        public C55899b(FrameBubbleContentLayout frameBubbleContentLayout) {
            this.f159278d = frameBubbleContentLayout;
        }

        public final void run() {
            Log.m105924i(this.f159278d.getTAG(), "source scene exit");
            FrameBubbleContentLayout frameBubbleContentLayout = this.f159278d;
            C62010c sceneStateListener = frameBubbleContentLayout.getSceneStateListener();
            frameBubbleContentLayout.f159270g = sceneStateListener != null ? sceneStateListener.mo86895y() : null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout$c */
    public static final class C55900c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FrameBubbleContentLayout f159279d;

        public C55900c(FrameBubbleContentLayout frameBubbleContentLayout) {
            this.f159279d = frameBubbleContentLayout;
        }

        public final void run() {
            Log.m105924i(this.f159279d.getTAG(), "target scene enter");
            FrameBubbleContentLayout frameBubbleContentLayout = this.f159279d;
            frameBubbleContentLayout.f159272i = 2;
            C62010c sceneStateListener = frameBubbleContentLayout.getSceneStateListener();
            if (sceneStateListener != null) {
                sceneStateListener.mo86885D(this.f159279d.f159270g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout$d */
    public static final class C55901d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FrameBubbleContentLayout f159280d;

        public C55901d(FrameBubbleContentLayout frameBubbleContentLayout) {
            this.f159280d = frameBubbleContentLayout;
        }

        public final void run() {
            Log.m105924i(this.f159280d.getTAG(), "target scene exit");
            FrameBubbleContentLayout frameBubbleContentLayout = this.f159280d;
            C62010c sceneStateListener = frameBubbleContentLayout.getSceneStateListener();
            frameBubbleContentLayout.f159271h = sceneStateListener != null ? sceneStateListener.mo86890Z() : null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout$e */
    public static final class C55902e extends C67095c {

        /* renamed from: d */
        public final /* synthetic */ C53916l<Boolean> f159281d;

        public C55902e(C53916l<? super Boolean> lVar) {
            this.f159281d = lVar;
        }

        /* renamed from: b */
        public void mo77557b(Transition transition) {
            C87412m.m108594g(transition, "transition");
            C53916l<Boolean> lVar = this.f159281d;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FrameBubbleContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* access modifiers changed from: private */
    public final String getTAG() {
        return "FrameBubbleContentLayout_" + this.f159269f + '@' + hashCode();
    }

    /* renamed from: b */
    public void mo77541b() {
        String tag = getTAG();
        Log.m105924i(tag, "requestBubbleHide: " + getVisibility());
        ViewParent parent = getParent();
        LinearBubbleAnimateContainer linearBubbleAnimateContainer = parent instanceof LinearBubbleAnimateContainer ? (LinearBubbleAnimateContainer) parent : null;
        if (linearBubbleAnimateContainer != null) {
            C61926c.m72668M(new C62011e(this, linearBubbleAnimateContainer));
        }
    }

    /* renamed from: c */
    public void mo77542c() {
        String tag = getTAG();
        Log.m105924i(tag, "requestBubbleShow: " + getVisibility());
        ViewParent parent = getParent();
        LinearBubbleAnimateContainer linearBubbleAnimateContainer = parent instanceof LinearBubbleAnimateContainer ? (LinearBubbleAnimateContainer) parent : null;
        if (linearBubbleAnimateContainer != null) {
            C61926c.m72668M(new C62012f(this, linearBubbleAnimateContainer));
        }
    }

    /* renamed from: d */
    public final void mo77543d() {
        String tag = getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("setToSourceScene: ");
        sb.append(this.f159272i);
        sb.append(" visibility: ");
        ViewGroup viewGroup = this.f159274n;
        if (viewGroup != null) {
            sb.append(viewGroup.getVisibility());
            Log.m105924i(tag, sb.toString());
            if (this.f159272i != 1) {
                ViewGroup viewGroup2 = this.f159273j;
                if (viewGroup2 != null) {
                    ViewGroup viewGroup3 = this.f159274n;
                    if (viewGroup3 != null) {
                        viewGroup2.setVisibility(viewGroup3.getVisibility());
                        C60244h hVar = this.f159267d;
                        if (hVar != null) {
                            C103834d.m138409c(hVar, new C108754b(0, 1, (C8480h) null));
                        } else {
                            C87412m.m108603p("sourceScene");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("targetLayout");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("sourceLayout");
                    throw null;
                }
            }
        } else {
            C87412m.m108603p("targetLayout");
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo77544e() {
        String tag = getTAG();
        StringBuilder sb = new StringBuilder();
        sb.append("setToTargetScene: ");
        sb.append(this.f159272i);
        sb.append(" visibility: ");
        ViewGroup viewGroup = this.f159273j;
        if (viewGroup != null) {
            sb.append(viewGroup.getVisibility());
            Log.m105924i(tag, sb.toString());
            if (this.f159272i != 2) {
                ViewGroup viewGroup2 = this.f159274n;
                if (viewGroup2 != null) {
                    ViewGroup viewGroup3 = this.f159273j;
                    if (viewGroup3 != null) {
                        viewGroup2.setVisibility(viewGroup3.getVisibility());
                        C60244h hVar = this.f159268e;
                        if (hVar != null) {
                            C108755c cVar = new C108755c((C67095c) null);
                            cVar.mo145349V(0);
                            C103834d.m138409c(hVar, cVar);
                            return;
                        }
                        C87412m.m108603p("targetScene");
                        throw null;
                    }
                    C87412m.m108603p("sourceLayout");
                    throw null;
                }
                C87412m.m108603p("targetLayout");
                throw null;
            }
            return;
        }
        C87412m.m108603p("sourceLayout");
        throw null;
    }

    /* renamed from: f */
    public final Object mo77545f(C15601d<? super Boolean> dVar) {
        C62010c cVar = this.f159276p;
        if (!(cVar != null && cVar.mo86893v())) {
            return Boolean.FALSE;
        }
        C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
        mVar.mo74609p();
        ViewGroup viewGroup = this.f159274n;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            Log.m105924i(getTAG(), "startTransition");
            C60244h hVar = this.f159268e;
            if (hVar != null) {
                C103834d.m138409c(hVar, new C108755c(new C55902e(mVar)));
                return mVar.mo74608o();
            }
            C87412m.m108603p("targetScene");
            throw null;
        }
        C87412m.m108603p("targetLayout");
        throw null;
    }

    public final FrameBubbleContentLayout getSceneRoot() {
        return this.f159275o;
    }

    public final C62010c getSceneStateListener() {
        return this.f159276p;
    }

    public final ViewGroup getTargetLayout() {
        ViewGroup viewGroup = this.f159274n;
        if (viewGroup != null) {
            return viewGroup;
        }
        C87412m.m108603p("targetLayout");
        throw null;
    }

    public final C60244h getTargetScene() {
        C60244h hVar = this.f159268e;
        if (hVar != null) {
            return hVar;
        }
        C87412m.m108603p("targetScene");
        throw null;
    }

    public final void setSceneStateListener(C62010c cVar) {
        this.f159276p = cVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        String tag = getTAG();
        Log.m105924i(tag, "setVisibility visibility: " + i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("bubbleName: ");
        sb.append(this.f159269f);
        sb.append(" sceneMode: ");
        sb.append(this.f159272i);
        sb.append(" visibility: ");
        sb.append(getVisibility());
        sb.append(" sourceVisibility: ");
        ViewGroup viewGroup = this.f159273j;
        if (viewGroup != null) {
            sb.append(viewGroup.getVisibility());
            sb.append(" targetVisibility: ");
            ViewGroup viewGroup2 = this.f159274n;
            if (viewGroup2 != null) {
                sb.append(viewGroup2.getVisibility());
                return sb.toString();
            }
            C87412m.m108603p("targetLayout");
            throw null;
        }
        C87412m.m108603p("sourceLayout");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FrameBubbleContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f159269f = "";
        this.f159275o = this;
        setClipChildren(false);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C58591p0.f167754f, i, 0);
            C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…ontentLayout, defAttr, 0)");
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(2, -1);
            String string = obtainStyledAttributes.getString(0);
            this.f159269f = string == null ? "Default" : string;
            View inflate = LayoutInflater.from(context).inflate(resourceId, this, false);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) inflate;
            this.f159273j = viewGroup;
            viewGroup.setVisibility(8);
            View inflate2 = LayoutInflater.from(context).inflate(resourceId2, this, false);
            C87412m.m108592e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate2;
            this.f159274n = viewGroup2;
            viewGroup2.setVisibility(8);
            ViewGroup viewGroup3 = this.f159273j;
            if (viewGroup3 != null) {
                C60244h hVar = new C60244h(this, viewGroup3);
                hVar.f171772e = new C55898a(this);
                hVar.f171773f = new C55899b(this);
                this.f159267d = hVar;
                ViewGroup viewGroup4 = this.f159274n;
                if (viewGroup4 != null) {
                    C60244h hVar2 = new C60244h(this, viewGroup4);
                    hVar2.f171772e = new C55900c(this);
                    hVar2.f171773f = new C55901d(this);
                    this.f159268e = hVar2;
                    obtainStyledAttributes.recycle();
                } else {
                    C87412m.m108603p("targetLayout");
                    throw null;
                }
            } else {
                C87412m.m108603p("sourceLayout");
                throw null;
            }
        }
        setVisibility(8);
        mo77543d();
    }
}
