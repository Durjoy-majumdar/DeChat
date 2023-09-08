package com.tencent.p014mm.plugin.finder.replay.shopping;

import al1.C54127h;
import al1.C54130j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import ap1.C54283d;
import bp1.C54515a;
import bp1.C54519d;
import cl1.C54963d0;
import cl1.C54991o;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import cp1.C57952m;
import cp1.C57957o;
import cp1.C57959q;
import d60.C58124b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ii1.C60291e;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;
import qj1.C62660c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51343t41;
import te3.C52013xs0;
import vo1.C65768a;
import vo1.C65770a0;
import vo1.C65779b;
import vo1.C65816q0;
import y50.C66505a;
import yo1.C39143f;
import zo1.C66925j0;
import zo1.C66939o0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R$\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/replay/shopping/FinderLiveShoppingReplayPluginLayout;", "Lap1/d;", "Lcp1/o;", "", "getRelativeLayoutId", "getLiveRole", "Landroid/content/Context;", "getUIContext", "Lcp1/q;", "listener", "Lrx3/b0;", "setUIClickListener", "Lvo1/q0;", "g", "Lrx3/g;", "getSeiProcessViewCallbackProxy", "()Lvo1/q0;", "seiProcessViewCallbackProxy", "h", "Lcp1/q;", "getUiClickListener", "()Lcp1/q;", "setUiClickListener", "(Lcp1/q;)V", "uiClickListener", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout */
public final class FinderLiveShoppingReplayPluginLayout extends C54283d implements C57957o {

    /* renamed from: g */
    public final C13601g f160798g = C36568h.m40985a(new C56260a(this));

    /* renamed from: h */
    public C57959q f160799h;

    /* renamed from: com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout$a */
    public static final class C56260a extends C87413o implements C32224a<C65816q0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveShoppingReplayPluginLayout f160800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56260a(FinderLiveShoppingReplayPluginLayout finderLiveShoppingReplayPluginLayout) {
            super(0);
            this.f160800d = finderLiveShoppingReplayPluginLayout;
        }

        public Object invoke() {
            return new C65816q0(new WeakReference(this.f160800d));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingReplayPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, (Fragment) null, attributeSet);
        C87412m.m108594g(context, "context");
    }

    private final C65816q0 getSeiProcessViewCallbackProxy() {
        return (C65816q0) ((C36570n) this.f160798g).getValue();
    }

    /* renamed from: a */
    public void mo78577a(boolean z, List<? extends C51343t41> list, List<? extends C52013xs0> list2) {
    }

    public void bindData(C54127h hVar) {
        C87412m.m108594g(hVar, "data");
        super.bindData(hVar);
        C56032b.fillBlurBg$default(this, ((C54991o) business(C54991o.class)).f154345o, false, 2, (Object) null);
        getShoppingReplayBaseUIC().mo89843k(this);
        getShoppingReplayDecorateUIC().mo75083j(this);
    }

    /* renamed from: c */
    public void mo78578c(int i) {
        mo78686n(i);
    }

    /* renamed from: d */
    public void mo78579d(int i, int i2) {
        C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var != null) {
            o0Var.mo90928d1(i);
        }
    }

    /* renamed from: e */
    public void mo78580e(int i) {
        hideLoadingLayer(false);
        C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var != null) {
            o0Var.mo90928d1(i);
        }
        C66939o0 o0Var2 = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var2 != null) {
            o0Var2.mo90926b1();
        }
    }

    /* renamed from: f */
    public void mo78581f(int i) {
        mo78686n(i);
    }

    /* renamed from: g */
    public <T extends C62660c> T mo78582g(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        return super.getPlugin(cls);
    }

    public int getLiveRole() {
        return 2;
    }

    public int getRelativeLayoutId() {
        return C0966R.C0971layout.f359753ak1;
    }

    public Context getUIContext() {
        Context context = getContext();
        C87412m.m108593f(context, "context");
        return context;
    }

    public final C57959q getUiClickListener() {
        return this.f160799h;
    }

    /* renamed from: h */
    public void mo78585h() {
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
    }

    /* renamed from: k */
    public void mo78588k(int i, int i2) {
        getShoppingReplayBaseUIC().mo89844l(i, i2);
        C66925j0 j0Var = (C66925j0) getPlugin(C66925j0.class);
        if (j0Var != null) {
            j0Var.mo90914Z0();
        }
    }

    /* renamed from: l */
    public final void mo78684l(boolean z) {
        Class cls = C54519d.class;
        C65770a0.C65771b bVar = C65770a0.f189184r;
        bVar.mo89819a().mo89810k(getSeiProcessViewCallbackProxy());
        C65770a0.m77403t(bVar.mo89819a(), -1, (JSONObject) null, false, 6, (Object) null);
        if (((C54519d) business(cls)).f152849i > 0) {
            ((C54515a) business(C54515a.class)).mo75358f3(((C54519d) business(cls)).f152849i);
            C65770a0 a = bVar.mo89819a();
            C65768a aVar = (C65768a) ((C36570n) new C65779b(bVar.mo89819a(), new C39143f(3)).f189214c).getValue();
            C87412m.m108594g(aVar, "liveMsgOffsetProcess");
            a.f189202p = aVar;
        }
        getShoppingReplayBaseUIC().mo89841i(z, false);
        getShoppingReplayDecorateUIC().mo75082i(z, false);
    }

    /* renamed from: m */
    public final void mo78685m() {
        getShoppingReplayBaseUIC().mo89842j();
        getShoppingReplayDecorateUIC().getClass();
        C65770a0.f189184r.mo89819a().mo89818s(getSeiProcessViewCallbackProxy());
    }

    /* renamed from: n */
    public final void mo78686n(int i) {
        C60291e eVar;
        C66925j0 j0Var;
        C57952m mVar;
        Class cls = C60291e.class;
        C66939o0 o0Var = (C66939o0) getPlugin(C66939o0.class);
        if (o0Var != null) {
            o0Var.mo90925a1();
        }
        boolean z = true;
        if (!(i != 1 || (j0Var = (C66925j0) getPlugin(C66925j0.class)) == null || (mVar = j0Var.f192301r) == null)) {
            mVar.f165852a.mo78603H();
        }
        C60291e eVar2 = (C60291e) getPlugin(cls);
        if (eVar2 == null || eVar2.mo14483f0() != 0) {
            z = false;
        }
        if (z && (eVar = (C60291e) getPlugin(cls)) != null) {
            eVar.mo10792g(8);
        }
    }

    public void onAcceptLiveMic(C66505a aVar) {
        C87412m.m108594g(aVar, "info");
        Class cls = C54963d0.class;
        String tag = getTAG();
        Log.m105924i(tag, "onAcceptLinkMicOthers curLinkState:" + ((C54963d0) business(cls)).f154078u + " curLiveUser:" + ((C54963d0) business(cls)).f154073p + " audienceLinkMicUserList:" + ((C54963d0) business(cls)).f154074q + " audienceMode:" + ((C54991o) business(C54991o.class)).mo75996d3());
        C54130j jVar = ((C54963d0) business(cls)).f154073p;
        if (jVar != null && jVar.f152004h) {
            C56032b.notifyPKMicUserChange$default(this, false, 1, (Object) null);
            C58124b.C7172a.m7372a(this, C58124b.C58125b.FINDER_LIVE_LINK_MIC_ADD_BOTTOM_BAR, (Bundle) null, 2, (Object) null);
        }
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

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a7 A[LOOP:0: B:22:0x00a7->B:25:0x00c3, LOOP_START] */
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
            if (r2 == 0) goto L_0x00ca
        L_0x0028:
            androidx.lifecycle.i0 r2 = r6.business(r0)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.mo76015n4()
            java.lang.String r5 = r7.f191337d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r5)
            if (r2 == 0) goto L_0x0063
            int r7 = r7.f191338e
            java.lang.String r0 = r6.getTAG()
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
            if (r7 != 0) goto L_0x00ca
            r7 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r6, r4, r3, r7)
            goto L_0x00ca
        L_0x0063:
            int r7 = r7.f191338e
            java.lang.String r2 = r6.getTAG()
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
            if (r7 == 0) goto L_0x00ca
            androidx.lifecycle.i0 r7 = r6.business(r0)
            cl1.o r7 = (cl1.C54991o) r7
            int r7 = r7.mo75996d3()
            if (r7 != r3) goto L_0x00ca
            androidx.lifecycle.i0 r7 = r6.business(r1)
            cl1.d0 r7 = (cl1.C54963d0) r7
            java.util.List<al1.j> r7 = r7.f154074q
            java.lang.String r1 = "business(\n              …).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r7, r1)
            monitor-enter(r7)
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x00c7 }
        L_0x00a7:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00c5
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00c7 }
            al1.j r2 = (al1.C54130j) r2     // Catch:{ all -> 0x00c7 }
            java.lang.String r2 = r2.f151997a     // Catch:{ all -> 0x00c7 }
            androidx.lifecycle.i0 r3 = r6.business(r0)     // Catch:{ all -> 0x00c7 }
            cl1.o r3 = (cl1.C54991o) r3     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = r3.mo76015n4()     // Catch:{ all -> 0x00c7 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x00a7
        L_0x00c5:
            monitor-exit(r7)
            goto L_0x00ca
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout.onCloseLiveMic(y50.f):void");
    }

    public void onLiveEventCallback(int i, Bundle bundle) {
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
        this.f160799h = qVar;
    }

    public final void setUiClickListener(C57959q qVar) {
        this.f160799h = qVar;
    }

    public void unMount() {
        super.unMount();
    }
}
