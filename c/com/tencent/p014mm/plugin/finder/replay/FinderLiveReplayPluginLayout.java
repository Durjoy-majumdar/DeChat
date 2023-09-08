package com.tencent.p014mm.plugin.finder.replay;

import al1.C54127h;
import al1.C54130j;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import bp1.C54519d;
import cl1.C0668l;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.plugin.view.audio.FinderLiveAudioWaveRootView;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57952m;
import cp1.C57957o;
import cp1.C57959q;
import d60.C58124b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ii1.C60291e;
import il1.C60351b9;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import o40.C61926c;
import p871zj.C66843h;
import qj1.C12322e5;
import qj1.C12399ff;
import qj1.C12669t4;
import qj1.C62632a6;
import qj1.C62660c;
import qj1.C62979sf;
import qj1.C63081w3;
import qj1.C63163zd;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51343t41;
import te3.C52013xs0;
import te3.C64321dp2;
import te3.C64674r41;
import vo1.C14920r;
import vo1.C14921s;
import vo1.C65770a0;
import vo1.C65796h;
import vo1.C65799i0;
import vo1.C65814p;
import vo1.C65816q0;
import vo1.C65820t;
import vo1.C65826v;
import wo1.C66154f;
import wo1.C66158l;
import wo1.C66161s;
import y50.C38964c;
import y50.C38965d;
import y50.C38970o0;
import y50.C53496k;
import y50.C66505a;
import y50.C66507b;
import y50.C66517i0;
import yg1.C16004c;
import zo1.C16344b0;
import zo1.C66917d;
import zo1.C66925j0;
import zo1.C66939o0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\u0006\u0010&\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(B\u0019\b\u0016\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b'\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b \u0010!¨\u0006*"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/replay/FinderLiveReplayPluginLayout;", "Lcom/tencent/mm/plugin/finder/live/view/b;", "Lcp1/o;", "", "getRelativeLayoutId", "getLiveRole", "Landroid/content/Context;", "getUIContext", "Lcp1/q;", "listener", "Lrx3/b0;", "setUIClickListener", "Lvo1/q0;", "h", "Lrx3/g;", "getSeiProcessViewCallbackProxy", "()Lvo1/q0;", "seiProcessViewCallbackProxy", "Lwo1/s;", "i", "getVideoPlayLifecycleProxy", "()Lwo1/s;", "videoPlayLifecycleProxy", "j", "Lcp1/q;", "getUiClickListener", "()Lcp1/q;", "setUiClickListener", "(Lcp1/q;)V", "uiClickListener", "Lvo1/v;", "n", "getHelper", "()Lvo1/v;", "helper", "context", "Landroid/util/AttributeSet;", "attr", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout */
public final class FinderLiveReplayPluginLayout extends C56032b implements C57957o {

    /* renamed from: d */
    public final C65796h f160712d;

    /* renamed from: e */
    public final C65820t f160713e;

    /* renamed from: f */
    public C32224a<C13598b0> f160714f;

    /* renamed from: g */
    public C32224a<C13598b0> f160715g;

    /* renamed from: h */
    public final C13601g f160716h;

    /* renamed from: i */
    public final C13601g f160717i;

    /* renamed from: j */
    public C57959q f160718j;

    /* renamed from: n */
    public final C13601g f160719n;

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$a */
    public static final class C56242a extends C87413o implements C32226l<C13604l<? extends LinkedList<C64674r41>, ? extends LinkedList<C52013xs0>>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayPluginLayout f160720d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56242a(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
            super(1);
            this.f160720d = finderLiveReplayPluginLayout;
        }

        public Object invoke(Object obj) {
            C13604l lVar = (C13604l) obj;
            C87412m.m108594g(lVar, "pair");
            C56032b.Companion.getClass();
            C61926c.m72659D(C56032b.TAG, false, new C56259a(this.f160720d, lVar), 2, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$b */
    public static final class C56243b extends C87413o implements C32224a<C65826v> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayPluginLayout f160721d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56243b(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
            super(0);
            this.f160721d = finderLiveReplayPluginLayout;
        }

        public Object invoke() {
            return new C65826v(this.f160721d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$c */
    public static final class C56244c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayPluginLayout f160722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56244c(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
            super(0);
            this.f160722d = finderLiveReplayPluginLayout;
        }

        public Object invoke() {
            if (!((C54519d) this.f160722d.business(C54519d.class)).f152846f) {
                C65820t tVar = this.f160722d.f160713e;
                tVar.getClass();
                CommonKt.uiThread(new C65814p(tVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$d */
    public static final class C56245d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayPluginLayout f160723d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56245d(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
            super(0);
            this.f160723d = finderLiveReplayPluginLayout;
        }

        public Object invoke() {
            if (!((C54519d) this.f160723d.business(C54519d.class)).f152846f) {
                C65820t tVar = this.f160723d.f160713e;
                tVar.getClass();
                C61926c.m72668M(new C14920r(tVar));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$e */
    public static final class C56246e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveThumbPlayerProxy f160724d;

        /* renamed from: e */
        public final /* synthetic */ FinderLiveReplayPluginLayout f160725e;

        public C56246e(FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy, FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
            this.f160724d = finderLiveThumbPlayerProxy;
            this.f160725e = finderLiveReplayPluginLayout;
        }

        public final void run() {
            int[] iArr = new int[2];
            this.f160724d.getLocationOnScreen(iArr);
            int height = iArr[1] + this.f160724d.getHeight();
            C62979sf sfVar = (C62979sf) this.f160725e.getPlugin(C62979sf.class);
            if (sfVar != null) {
                C62979sf.m74202c1(sfVar, height, 0, 2, (Object) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$f */
    public static final class C56247f extends C87413o implements C32227p<Long, C57952m, C13604l<? extends C57952m, ? extends Boolean>> {

        /* renamed from: d */
        public static final C56247f f160726d = new C56247f();

        public C56247f() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            return C65770a0.f189184r.mo89819a().mo89809j(((Number) obj).longValue(), (C57952m) obj2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$g */
    public static final class C56248g extends C87413o implements C32224a<C65816q0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayPluginLayout f160727d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56248g(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
            super(0);
            this.f160727d = finderLiveReplayPluginLayout;
        }

        public Object invoke() {
            return new C65816q0(new WeakReference(this.f160727d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$h */
    public static final class C56249h extends C87413o implements C32224a<C66161s> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveReplayPluginLayout f160728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56249h(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout) {
            super(0);
            this.f160728d = finderLiveReplayPluginLayout;
        }

        public Object invoke() {
            return new C66161s(new WeakReference(this.f160728d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveReplayPluginLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (Fragment) null, attributeSet);
        C87412m.m108594g(context, "context");
        MMActivity mMActivity = (MMActivity) context;
        this.f160712d = new C65796h(mMActivity, C56247f.f160726d);
        this.f160713e = new C65820t(mMActivity);
        this.f160714f = new C56244c(this);
        this.f160715g = new C56245d(this);
        this.f160716h = C36568h.m40985a(new C56248g(this));
        this.f160717i = C36568h.m40985a(new C56249h(this));
        this.f160719n = C36568h.m40985a(new C56243b(this));
    }

    private final C65826v getHelper() {
        return (C65826v) ((C36570n) this.f160719n).getValue();
    }

    private final C65816q0 getSeiProcessViewCallbackProxy() {
        return (C65816q0) ((C36570n) this.f160716h).getValue();
    }

    private final C66161s getVideoPlayLifecycleProxy() {
        return (C66161s) ((C36570n) this.f160717i).getValue();
    }

    /* renamed from: m */
    public static void m64391m(FinderLiveReplayPluginLayout finderLiveReplayPluginLayout, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        finderLiveReplayPluginLayout.f160713e.mo89857k(z, z2, z3);
    }

    /* renamed from: a */
    public void mo78577a(boolean z, List<? extends C51343t41> list, List<? extends C52013xs0> list2) {
        C66154f fVar;
        C66843h hVar;
        C66917d dVar = (C66917d) getPlugin(C66917d.class);
        if (dVar != null && list != null) {
            if (!(!z || (fVar = dVar.f192281u) == null || (hVar = ((C66158l) fVar).mo90203k().f192019d.f191990h) == null)) {
                hVar.mo90839b();
            }
            C66154f fVar2 = dVar.f192281u;
            if (fVar2 != null) {
                ((C66158l) fVar2).mo90200h(list, "onBulletIncrease");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0245  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void activate(al1.C54127h r12, boolean r13, boolean r14) {
        /*
            r11 = this;
            java.lang.Class<bp1.d> r14 = bp1.C54519d.class
            java.lang.String r0 = "config"
            gy3.C87412m.m108594g(r12, r0)
            com.tencent.mm.plugin.finder.live.view.b$a r12 = com.tencent.p014mm.plugin.finder.live.view.C56032b.Companion
            r12.getClass()
            java.lang.String r12 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "activate isFromFloat:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", bgInfo:"
            r0.append(r1)
            java.lang.String r1 = r11.getBgInfo()
            r0.append(r1)
            r1 = 33
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            vo1.a0$b r12 = vo1.C65770a0.f189184r
            vo1.a0 r0 = r12.mo89819a()
            vo1.q0 r1 = r11.getSeiProcessViewCallbackProxy()
            r0.mo89810k(r1)
            vo1.a0 r0 = r12.mo89819a()
            wo1.s r1 = r11.getVideoPlayLifecycleProxy()
            java.lang.String r2 = "proxy"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "registerVideoLifecycleProxy:"
            r2.append(r3)
            int r3 = r1.hashCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderLiveReplayService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            java.util.HashSet<wo1.t> r0 = r0.f189197k
            r0.add(r1)
            vo1.a0 r2 = r12.mo89819a()
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            vo1.C65770a0.m77403t(r2, r3, r4, r5, r6, r7)
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            te3.c21 r12 = r12.mo75372e3()
            int r12 = r12.f182366L
            r0 = 4
            r1 = 1
            r2 = 0
            if (r12 != r0) goto L_0x008d
            r12 = 1
            goto L_0x008e
        L_0x008d:
            r12 = 0
        L_0x008e:
            r0 = 6
            r3 = 2
            if (r12 == 0) goto L_0x00a6
            java.lang.String r12 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
            java.lang.String r4 = "activate to replay but not privilege!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            vo1.t r5 = r11.f160713e
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 7
            r10 = 0
            vo1.C65820t.m77534l(r5, r6, r7, r8, r9, r10)
            goto L_0x00f3
        L_0x00a6:
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            te3.c21 r12 = r12.mo75372e3()
            int r12 = r12.f182366L
            if (r12 != r3) goto L_0x00b6
            r12 = 1
            goto L_0x00b7
        L_0x00b6:
            r12 = 0
        L_0x00b7:
            if (r12 == 0) goto L_0x00cd
            java.lang.String r12 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
            java.lang.String r4 = "activate to replay but replay delete!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            vo1.t r5 = r11.f160713e
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            vo1.C65820t.m77534l(r5, r6, r7, r8, r9, r10)
            goto L_0x00f3
        L_0x00cd:
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            te3.c21 r12 = r12.mo75372e3()
            int r12 = r12.f182366L
            if (r12 != r0) goto L_0x00dd
            r12 = 1
            goto L_0x00de
        L_0x00dd:
            r12 = 0
        L_0x00de:
            if (r12 == 0) goto L_0x00f5
            java.lang.String r12 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
            java.lang.String r4 = "activate to replay but replay expired!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            vo1.t r5 = r11.f160713e
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 5
            r10 = 0
            vo1.C65820t.m77534l(r5, r6, r7, r8, r9, r10)
        L_0x00f3:
            r12 = 0
            goto L_0x00f6
        L_0x00f5:
            r12 = 1
        L_0x00f6:
            if (r12 == 0) goto L_0x0199
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            r12.getClass()
            java.lang.Class<ls3.g> r4 = ls3.C61397g.class
            di3.d r5 = di3.C86312j.m106911c(r4)
            ls3.g r5 = (ls3.C61397g) r5
            te3.c21 r6 = r12.mo75372e3()
            boolean r0 = r5.mo83479QW(r0, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "replayTransition source:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r7 = ", enable:"
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "MMFinder.LiveReplaySlice"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            if (r0 == 0) goto L_0x015e
            di3.d r0 = di3.C86312j.m106911c(r4)
            ls3.g r0 = (ls3.C61397g) r0
            te3.c21 r4 = r12.mo75372e3()
            boolean r0 = r0.Da0(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r1)
            java.lang.String r5 = ", replayReady:"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            if (r0 != 0) goto L_0x015d
            r0 = 1
            goto L_0x015e
        L_0x015d:
            r0 = 0
        L_0x015e:
            r12.mo75364J3(r0)
            vo1.h r12 = r11.f160712d
            androidx.lifecycle.i0 r0 = r11.business(r14)
            bp1.d r0 = (bp1.C54519d) r0
            boolean r0 = r0.f152846f
            r12.mo89841i(r13, r0)
            vo1.t r12 = r11.f160713e
            androidx.lifecycle.i0 r0 = r11.business(r14)
            bp1.d r0 = (bp1.C54519d) r0
            boolean r0 = r0.f152846f
            r12.mo89855i(r13, r0)
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            boolean r12 = r12.f152861x
            if (r12 != 0) goto L_0x01a6
            vo1.v r12 = r11.getHelper()
            fj1.b r0 = r11.getBuContext()
            androidx.lifecycle.i0 r4 = r11.business(r14)
            bp1.d r4 = (bp1.C54519d) r4
            boolean r4 = r4.f152846f
            r12.mo89862c(r0, r2, r4)
            goto L_0x01a6
        L_0x0199:
            zo1.j0$a r12 = zo1.C66925j0.f192298t
            al1.h r0 = r11.getData()
            com.tencent.mm.live.api.LiveConfig r0 = r0.f151977d
            long r4 = r0.f157075s
            r12.mo90919a(r4, r11)
        L_0x01a6:
            android.os.Bundle r12 = new android.os.Bundle
            r12.<init>()
            androidx.lifecycle.i0 r0 = r11.business(r14)
            bp1.d r0 = (bp1.C54519d) r0
            d50.i$b r0 = r0.f152852o
            d50.i$b r4 = d50.C58115i.C58117b.AUDIO_MODE
            if (r0 != r4) goto L_0x01b9
            r0 = 1
            goto L_0x01ba
        L_0x01b9:
            r0 = 0
        L_0x01ba:
            java.lang.String r4 = "PARAM_FINDER_LIVE_AUDIO_MODE"
            r12.putBoolean(r4, r0)
            androidx.lifecycle.i0 r0 = r11.business(r14)
            bp1.d r0 = (bp1.C54519d) r0
            boolean r0 = r0.f152853p
            java.lang.String r4 = "PARAM_FINDER_LIVE_IS_SHARE_MODE"
            r12.putBoolean(r4, r0)
            d60.b$b r0 = d60.C58124b.C58125b.FINDER_LIVE_MODE_SWITCH
            r11.statusChange(r0, r12)
            if (r13 == 0) goto L_0x0245
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            int r12 = r12.f152850j
            if (r12 == r3) goto L_0x022e
            r13 = 3
            if (r12 == r13) goto L_0x0217
            java.lang.Class<zo1.j0> r12 = zo1.C66925j0.class
            qj1.c r12 = r11.getPlugin(r12)
            zo1.j0 r12 = (zo1.C66925j0) r12
            if (r12 == 0) goto L_0x01f1
            boolean r12 = r12.mo90915a1()
            if (r12 != r1) goto L_0x01f1
            goto L_0x01f2
        L_0x01f1:
            r1 = 0
        L_0x01f2:
            if (r1 == 0) goto L_0x0200
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            int r12 = r12.f152854q
            r11.mo78580e(r12)
            goto L_0x0252
        L_0x0200:
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            int r12 = r12.f152854q
            androidx.lifecycle.i0 r13 = r11.business(r14)
            bp1.d r13 = (bp1.C54519d) r13
            int r13 = r13.f152855r
            r11.mo78579d(r12, r13)
            r11.mo78587j()
            goto L_0x0252
        L_0x0217:
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            int r12 = r12.f152854q
            androidx.lifecycle.i0 r13 = r11.business(r14)
            bp1.d r13 = (bp1.C54519d) r13
            int r13 = r13.f152855r
            r11.mo78579d(r12, r13)
            r11.mo78578c(r2)
            goto L_0x0252
        L_0x022e:
            androidx.lifecycle.i0 r12 = r11.business(r14)
            bp1.d r12 = (bp1.C54519d) r12
            int r12 = r12.f152854q
            androidx.lifecycle.i0 r13 = r11.business(r14)
            bp1.d r13 = (bp1.C54519d) r13
            int r13 = r13.f152855r
            r11.mo78579d(r12, r13)
            r11.mo78581f(r2)
            goto L_0x0252
        L_0x0245:
            vo1.t r12 = r11.f160713e
            r12.getClass()
            vo1.s r13 = new vo1.s
            r13.<init>(r12)
            com.tencent.p014mm.sdk.p134kt.CommonKt.uiThread(r13)
        L_0x0252:
            java.lang.Class<cl1.a1> r12 = cl1.C54943a1.class
            androidx.lifecycle.i0 r12 = r11.business(r12)
            cl1.a1 r12 = (cl1.C54943a1) r12
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$a r13 = new com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout$a
            r13.<init>(r11)
            r12.getClass()
            r12.f153976g = r13
            y50.k r12 = y50.C53496k.f150436a
            r12.mo74170c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout.activate(al1.h, boolean, boolean):void");
    }

    public void bindData(C54127h hVar) {
        C87412m.m108594g(hVar, "data");
        if (((C55001u) hVar.f151978e.mo71262a(C55001u.class)).f154416j == 0) {
            C65799i0.f189246a.mo89848c(hVar, 2);
        }
        super.bindData(hVar);
        C56032b.fillBlurBg$default(this, ((C54991o) business(C54991o.class)).f154345o, false, 2, (Object) null);
        showBlurBg();
        ((C16004c) business(C16004c.class)).mo14630d3();
        this.f160712d.mo89843k(this);
        this.f160713e.mo89856j(this);
        C56032b.Companion.getClass();
        String access$getTAG$cp = C56032b.TAG;
        Log.m105924i(access$getTAG$cp, "bindData bgInfo:" + getBgInfo() + '!');
    }

    /* renamed from: c */
    public void mo78578c(int i) {
        C66925j0 j0Var;
        C57952m mVar;
        C60291e eVar;
        C62979sf sfVar;
        Class cls = C60291e.class;
        Class cls2 = C62979sf.class;
        boolean z = true;
        if (((C0668l) business(C0668l.class)).mo631g3()) {
            getWarnningCountWidget().mo85316b();
            showBlurBg();
            fillBlurBg(((C54991o) business(C54991o.class)).f154345o, true);
            C62979sf sfVar2 = (C62979sf) getPlugin(cls2);
            if ((sfVar2 != null && sfVar2.mo14483f0() == 0) && (sfVar = (C62979sf) getPlugin(cls2)) != null) {
                sfVar.mo10792g(8);
            }
            C60291e eVar2 = (C60291e) getPlugin(cls);
            if (eVar2 == null || eVar2.mo14483f0() != 0) {
                z = false;
            }
            if (z && (eVar = (C60291e) getPlugin(cls)) != null) {
                eVar.mo10792g(8);
            }
        } else {
            if (!(i != 1 || (j0Var = (C66925j0) getPlugin(C66925j0.class)) == null || (mVar = j0Var.f192301r) == null)) {
                mVar.f165852a.mo78603H();
            }
            C65820t tVar = this.f160713e;
            tVar.getClass();
            CommonKt.uiThread(new C14921s(tVar));
        }
        C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var != null) {
            o0Var.mo90925a1();
        }
        C63081w3 w3Var = (C63081w3) getPlugin(C63081w3.class);
        if (w3Var != null) {
            w3Var.mo88017d1();
        }
    }

    /* renamed from: d */
    public void mo78579d(int i, int i2) {
        Class cls = C54519d.class;
        if (!((C54519d) business(cls)).f152846f) {
            C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
            if (o0Var != null) {
                o0Var.mo90928d1(i);
            }
            if (((C0668l) business(C0668l.class)).mo631g3()) {
                C12669t4 t4Var = (C12669t4) getPlugin(C12669t4.class);
                if (t4Var != null) {
                    C64321dp2 dp22 = new C64321dp2();
                    dp22.f182791d = 1;
                    int k3 = C54519d.m61244k3((C54519d) business(cls), 0, 1, (Object) null);
                    dp22.f182793f = k3;
                    if (k3 > i2) {
                        k3 = i2;
                    }
                    int i3 = k3 - i;
                    dp22.f182792e = i3;
                    if (t4Var.f36279C || i <= 0 || i2 <= 0 || i3 > 0 || t4Var.mo87688G0()) {
                        t4Var.mo12256l1(dp22);
                    } else {
                        C56032b.Companion.getClass();
                        String access$getTAG$cp = C56032b.TAG;
                        Log.m105924i(access$getTAG$cp, "updatePlayProgress offset:" + i + ",total:" + i2 + ",time_limit:" + dp22.f182793f);
                        C58124b.C7172a.m7372a(this, C58124b.C58125b.FINDER_LIVE_CHARGE_FREE_TIME_OVER, (Bundle) null, 2, (Object) null);
                    }
                }
                int k35 = C54519d.m61244k3((C54519d) business(cls), 0, 1, (Object) null);
                if (((C54519d) business(cls)).f152855r >= k35) {
                    C60351b9 warnningCountWidget = getWarnningCountWidget();
                    if (k35 <= i2) {
                        i2 = k35;
                    }
                    warnningCountWidget.mo85315a(i2 - i);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo78580e(int i) {
        C12669t4 t4Var;
        hideLoadingLayer(false);
        C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var != null) {
            o0Var.mo90928d1(i);
        }
        C66939o0 o0Var2 = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var2 != null) {
            o0Var2.mo90926b1();
        }
        C63081w3 w3Var = (C63081w3) getPlugin(C63081w3.class);
        if (w3Var != null) {
            FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy = w3Var.f179017t;
            FinderLiveAudioWaveRootView finderLiveAudioWaveRootView = null;
            if (finderLiveThumbPlayerProxy != null) {
                if (!(finderLiveThumbPlayerProxy.f160768n == 6)) {
                    finderLiveThumbPlayerProxy = null;
                }
                if (finderLiveThumbPlayerProxy != null) {
                    finderLiveThumbPlayerProxy.play();
                }
            }
            FinderLiveAudioWaveRootView finderLiveAudioWaveRootView2 = w3Var.f179018u;
            if (finderLiveAudioWaveRootView2.isShown()) {
                finderLiveAudioWaveRootView = finderLiveAudioWaveRootView2;
            }
            if (finderLiveAudioWaveRootView != null) {
                finderLiveAudioWaveRootView.f159495g.setWaveStart(true, false);
                finderLiveAudioWaveRootView.f159496h.setWaveStart(true, true);
            }
        }
        if (((C0668l) business(C0668l.class)).mo631g3() && (t4Var = (C12669t4) getPlugin(C12669t4.class)) != null && i <= 0 && t4Var.mo14483f0() == 0) {
            t4Var.mo12250d1(true);
        }
    }

    /* renamed from: f */
    public void mo78581f(int i) {
        C66925j0 j0Var;
        C57952m mVar;
        if (((C0668l) business(C0668l.class)).mo631g3()) {
            getWarnningCountWidget().mo85316b();
        }
        C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var != null) {
            o0Var.mo90925a1();
        }
        if (!(i != 1 || (j0Var = (C66925j0) getPlugin(C66925j0.class)) == null || (mVar = j0Var.f192301r) == null)) {
            mVar.f165852a.mo78603H();
        }
        C65820t tVar = this.f160713e;
        tVar.getClass();
        CommonKt.uiThread(new C14921s(tVar));
        C63081w3 w3Var = (C63081w3) getPlugin(C63081w3.class);
        if (w3Var != null) {
            w3Var.mo88017d1();
        }
    }

    /* renamed from: g */
    public <T extends C62660c> T mo78582g(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        return super.getPlugin(cls);
    }

    public int getLiveRole() {
        return 0;
    }

    public int getRelativeLayoutId() {
        return C0966R.C0971layout.cwx;
    }

    public Context getUIContext() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        return context;
    }

    public final C57959q getUiClickListener() {
        return this.f160718j;
    }

    /* renamed from: h */
    public void mo78585h() {
        C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var != null) {
            o0Var.mo90926b1();
        }
    }

    /* renamed from: i */
    public void mo78586i() {
        C56032b.fillBlurBg$default(this, ((C54991o) business(C54991o.class)).f154345o, false, 2, (Object) null);
    }

    /* renamed from: j */
    public void mo78587j() {
        C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var != null) {
            WeImageView weImageView = o0Var.f192324s;
            Drawable drawable = o0Var.f166287d.getContext().getDrawable(C0966R.raw.icons_filled_play);
            C74933u4.m89769f(drawable, -1);
            weImageView.setImageDrawable(drawable);
            o0Var.mo90927c1();
        }
        C63081w3 w3Var = (C63081w3) getPlugin(C63081w3.class);
        if (w3Var != null) {
            w3Var.mo88017d1();
        }
    }

    /* renamed from: k */
    public void mo78588k(int i, int i2) {
        C62979sf sfVar;
        C57952m mVar;
        FinderLiveThumbPlayerProxy finderLiveThumbPlayerProxy;
        Class cls = C66925j0.class;
        this.f160712d.mo89844l(i, i2);
        C66925j0 j0Var = (C66925j0) getPlugin(cls);
        if (j0Var != null) {
            j0Var.mo90914Z0();
        }
        C66925j0 j0Var2 = (C66925j0) getPlugin(cls);
        if (!(j0Var2 == null || (mVar = j0Var2.f192301r) == null || (finderLiveThumbPlayerProxy = mVar.f165852a) == null)) {
            finderLiveThumbPlayerProxy.postDelayed(new C56246e(finderLiveThumbPlayerProxy, this), 100);
        }
        if (((C54519d) business(C54519d.class)).f152850j != 3 && (sfVar = (C62979sf) getPlugin(C62979sf.class)) != null) {
            sfVar.mo87915d1(((C54991o) business(C54991o.class)).mo75966J4());
        }
    }

    /* renamed from: l */
    public final void mo78589l() {
        LinkedList<View.OnTouchListener> linkedList;
        this.f160712d.mo89842j();
        C65820t tVar = this.f160713e;
        C63163zd zdVar = tVar.f189285r;
        if (!(zdVar == null || (linkedList = zdVar.f179229t) == null)) {
            linkedList.clear();
        }
        C12669t4 t4Var = tVar.f189286s;
        if (t4Var != null) {
            t4Var.mo10792g(8);
        }
        C66917d dVar = tVar.f189287t;
        if (dVar != null) {
            dVar.mo10792g(8);
        }
        C16344b0 b0Var = tVar.f189289v;
        if (b0Var != null) {
            b0Var.mo10792g(8);
        }
        C12322e5 e5Var = tVar.f189284q;
        if (e5Var != null) {
            e5Var.mo10792g(8);
        }
        C62632a6 a6Var = tVar.f189282o;
        if (a6Var != null) {
            a6Var.mo10792g(8);
        }
        C62979sf sfVar = tVar.f189280j;
        if (sfVar != null) {
            sfVar.mo10792g(8);
        }
        C12399ff ffVar = tVar.f189279i;
        if (ffVar != null) {
            ffVar.mo10792g(8);
        }
        C65770a0.C65771b bVar = C65770a0.f189184r;
        bVar.mo89819a().mo89818s(getSeiProcessViewCallbackProxy());
        C65770a0 a = bVar.mo89819a();
        C66161s videoPlayLifecycleProxy = getVideoPlayLifecycleProxy();
        C87412m.m108594g(videoPlayLifecycleProxy, "proxy");
        Log.m105924i("FinderLiveReplayService", "unregisterVideoLifecycleProxy:" + videoPlayLifecycleProxy.hashCode());
        a.f189197k.remove(videoPlayLifecycleProxy);
    }

    public void mount() {
        super.mount();
        C53496k kVar = C53496k.f150436a;
        kVar.mo74171d(name(), this.f160714f);
        kVar.mo74172e(name(), this.f160715g);
    }

    public void onAcceptLiveMic(C66505a aVar) {
        C87412m.m108594g(aVar, "info");
        Class cls = C54963d0.class;
        C56032b.Companion.getClass();
        String access$getTAG$cp = C56032b.TAG;
        Log.m105924i(access$getTAG$cp, "onAcceptLinkMicOthers curLinkState:" + ((C54963d0) business(cls)).f154078u + " curLiveUser:" + ((C54963d0) business(cls)).f154073p + " audienceLinkMicUserList:" + ((C54963d0) business(cls)).f154074q + " audienceMode:" + ((C54991o) business(C54991o.class)).mo75996d3());
        C54130j jVar = ((C54963d0) business(cls)).f154073p;
        if (jVar != null && jVar.f152004h) {
            C56032b.notifyPKMicUserChange$default(this, false, 1, (Object) null);
            C58124b.C7172a.m7372a(this, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ADD_BOTTOM_BAR, (Bundle) null, 2, (Object) null);
        }
    }

    public void onAnchorCallInterruption(boolean z) {
    }

    public void onAnchorConnectionChange(boolean z) {
    }

    public void onApplyLiveMic(C66507b bVar) {
        C87412m.m108594g(bVar, "info");
    }

    public void onBanLiveComment(C38964c cVar) {
        C87412m.m108594g(cVar, "info");
    }

    public void onBattleApply() {
    }

    public void onBattleClose() {
    }

    public void onBattleDismiss() {
    }

    public void onBattleEnd() {
    }

    public void onBattleStart() {
    }

    public void onCallStateChanged(int i, String str) {
        C87412m.m108594g(str, "incomingNumber");
    }

    public void onCloseApplyLiveMic(C38965d dVar) {
        C87412m.m108594g(dVar, "info");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b1 A[LOOP:0: B:22:0x00b1->B:25:0x00cd, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCloseLiveMic(y50.C66512f r7) {
        /*
            r6 = this;
            java.lang.String r0 = "info"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r1 = cl1.C54963d0.class
            androidx.lifecycle.i0 r2 = r6.business(r1)
            cl1.d0 r2 = (cl1.C54963d0) r2
            al1.j r2 = r2.f154073p
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001b
            boolean r2 = r2.f152004h
            if (r2 != r3) goto L_0x001b
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 == 0) goto L_0x0028
            androidx.lifecycle.i0 r2 = r6.business(r1)
            cl1.d0 r2 = (cl1.C54963d0) r2
            boolean r2 = r2.f154053G
            if (r2 == 0) goto L_0x00d4
        L_0x0028:
            androidx.lifecycle.i0 r2 = r6.business(r0)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.mo76015n4()
            java.lang.String r5 = r7.f191337d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r5)
            if (r2 == 0) goto L_0x0068
            int r7 = r7.f191338e
            com.tencent.mm.plugin.finder.live.view.b$a r0 = com.tencent.p014mm.plugin.finder.live.view.C56032b.Companion
            r0.getClass()
            java.lang.String r0 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "onCloseLinkMicSelf micType:"
            r2.append(r5)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            androidx.lifecycle.i0 r7 = r6.business(r1)
            cl1.d0 r7 = (cl1.C54963d0) r7
            boolean r7 = r7.f154053G
            if (r7 != 0) goto L_0x00d4
            r7 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r6, r4, r3, r7)
            goto L_0x00d4
        L_0x0068:
            int r7 = r7.f191338e
            com.tencent.mm.plugin.finder.live.view.b$a r2 = com.tencent.p014mm.plugin.finder.live.view.C56032b.Companion
            r2.getClass()
            java.lang.String r2 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "onCloseLinkMicOthers micType:"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            androidx.lifecycle.i0 r7 = r6.business(r0)
            cl1.o r7 = (cl1.C54991o) r7
            int r7 = r7.mo75996d3()
            if (r7 == 0) goto L_0x00d4
            androidx.lifecycle.i0 r7 = r6.business(r0)
            cl1.o r7 = (cl1.C54991o) r7
            int r7 = r7.mo75996d3()
            if (r7 != r3) goto L_0x00d4
            androidx.lifecycle.i0 r7 = r6.business(r1)
            cl1.d0 r7 = (cl1.C54963d0) r7
            java.util.List<al1.j> r7 = r7.f154074q
            java.lang.String r1 = "business(\n              …).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r7, r1)
            monitor-enter(r7)
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x00d1 }
        L_0x00b1:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x00cf
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d1 }
            al1.j r2 = (al1.C54130j) r2     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = r2.f151997a     // Catch:{ all -> 0x00d1 }
            androidx.lifecycle.i0 r3 = r6.business(r0)     // Catch:{ all -> 0x00d1 }
            cl1.o r3 = (cl1.C54991o) r3     // Catch:{ all -> 0x00d1 }
            java.lang.String r3 = r3.mo76015n4()     // Catch:{ all -> 0x00d1 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x00b1
        L_0x00cf:
            monitor-exit(r7)
            goto L_0x00d4
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout.onCloseLiveMic(y50.f):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
    }

    public void onLiveEventCallback(int i, Bundle bundle) {
    }

    public void onLiveMicSucc(C66517i0 i0Var) {
        C87412m.m108594g(i0Var, "info");
    }

    public void onOnlineLiveList(C38970o0 o0Var) {
        C87412m.m108594g(o0Var, "info");
    }

    public void onRotationSwitchChange(boolean z) {
    }

    /* renamed from: q */
    public void mo78590q() {
        finish();
    }

    public void release() {
    }

    public void setUIClickListener(C57959q qVar) {
        C87412m.m108594g(qVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f160718j = qVar;
    }

    public final void setUiClickListener(C57959q qVar) {
        this.f160718j = qVar;
    }

    public void statusChange(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        super.statusChange(bVar, bundle);
        int ordinal = bVar.ordinal();
        boolean z = false;
        if (ordinal == 124) {
            if (bundle != null) {
                z = bundle.getBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR");
            }
            onScreenClear(z);
        } else if (ordinal == 206) {
            getHelper().mo89862c(getBuContext(), true, false);
            C56032b.hideLoadingLayer$default(this, false, 1, (Object) null);
        } else if (ordinal == 207) {
            mo78578c(0);
            C66925j0 j0Var = (C66925j0) getPlugin(C66925j0.class);
            if (j0Var != null) {
                j0Var.mo90918d1();
            }
        }
    }

    public void unMount() {
        super.unMount();
        C53496k.f150436a.mo74173f();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveReplayPluginLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attr");
    }
}
