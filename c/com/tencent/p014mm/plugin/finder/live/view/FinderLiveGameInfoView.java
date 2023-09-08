package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.magicbrush.plugin.scl.view.MagicSclViewContainer;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import g70.C59376g;
import g70.C87164i;
import gj1.C59468c;
import gy3.C87412m;
import i70.C87667c;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGameInfoView;", "Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;", "Lcl1/o;", "data", "Lrx3/b0;", "setup", "", "getFrameSetName", "Lgj1/c;", "p", "Lgj1/c;", "getSurfaceMgr", "()Lgj1/c;", "setSurfaceMgr", "(Lgj1/c;)V", "surfaceMgr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGameInfoView */
public final class FinderLiveGameInfoView extends MagicSclViewContainer {

    /* renamed from: q */
    public static long f159763q = MMSlotKt.now();

    /* renamed from: n */
    public String f159764n;

    /* renamed from: o */
    public boolean f159765o;

    /* renamed from: p */
    public C59468c f159766p;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FinderLiveGameInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: f */
    public final void mo77940f(String str) {
        C87667c<?, ?>.a aVar;
        Log.m105924i("MicroMsg.FinderLiveGameInfoView", "notifyGameData:" + str);
        C59468c cVar = this.f159766p;
        if (cVar != null && (aVar = cVar.f169940c) != null) {
            aVar.mo122099a(str, (String) null);
        }
    }

    public final String getFrameSetName() {
        return "portrait_game_outfits";
    }

    public final C59468c getSurfaceMgr() {
        return this.f159766p;
    }

    public void onAttachedToWindow() {
        Log.m105924i("MicroMsg.FinderLiveGameInfoView", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        Log.m105924i("MicroMsg.FinderLiveGameInfoView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        this.f159765o = false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Log.m105918d("MicroMsg.FinderLiveGameInfoView", "onInterceptTouchEvent");
        if (motionEvent != null && motionEvent.getActionMasked() == 1) {
            C115669n.INSTANCE.mo175911u(1740, 3);
            Log.m105926v("FinderLiveGameReporter", "info card on click");
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Log.m105918d("MicroMsg.FinderLiveGameInfoView", "onLayout changed:" + z + ", left:" + i + ", top:" + i2 + ", right:" + i3 + ", bottom:" + i4);
        super.onLayout(z, i, i2, i3, i4);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Log.m105918d("MicroMsg.FinderLiveGameInfoView", "onMeasure:" + getMeasuredHeight() + ", " + getMeasuredWidth());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.m105918d("MicroMsg.FinderLiveGameInfoView", "onTouchEvent");
        return super.onTouchEvent(motionEvent);
    }

    public void requestLayout() {
        Log.m105918d("MicroMsg.FinderLiveGameInfoView", "requestLayout");
        super.requestLayout();
    }

    public final void setSurfaceMgr(C59468c cVar) {
        this.f159766p = cVar;
    }

    public final void setup(C54991o oVar) {
        C13598b0 b0Var;
        C87667c<?, ?>.a aVar;
        C87412m.m108594g(oVar, "data");
        if (this.f159765o) {
            Log.m105918d("MicroMsg.FinderLiveGameInfoView", "setuped");
            return;
        }
        this.f159765o = true;
        f159763q = MMSlotKt.now();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(23423, "wx9e221f7828fa7482", 1, Long.valueOf(MMSlotKt.now()), Long.valueOf(f159763q));
        String frameSetName = getFrameSetName();
        C87412m.m108594g(frameSetName, "name");
        this.f157377h = frameSetName;
        C87164i iVar = this.f157373d;
        if (iVar != null) {
            iVar.f252794j = false;
            C61926c.m72668M(new C59376g(iVar, false));
        }
        C59468c cVar = this.f159766p;
        if (cVar != null) {
            Context context = getContext();
            C87412m.m108593f(context, "this.context");
            cVar.mo84569a(context, oVar.f154345o, ((C55001u) oVar.business(C55001u.class)).f154416j);
        }
        C59468c cVar2 = this.f159766p;
        if (cVar2 == null || (aVar = cVar2.f169940c) == null) {
            b0Var = null;
        } else {
            mo76544a(aVar);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            Log.m105928w("MicroMsg.FinderLiveGameInfoView", "root is null");
        }
        String str = this.f159764n;
        if (str != null) {
            mo77940f(str);
        }
        nVar.mo175911u(1740, 1);
        Log.m105926v("FinderLiveGameReporter", "info card setup");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveGameInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
    }
}
