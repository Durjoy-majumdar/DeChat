package com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import bv2.C92311a;
import bv2.C92312b;
import com.tencent.p014mm.autogen.events.SnsOldItemContactEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateStartEvent;
import com.tencent.p014mm.autogen.events.SnsUnTranslateEvent;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import eu2.C97709g;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87412m;
import gy3.C87413o;
import iu2.C98799a;
import jq3.C60905o;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import tt2.C101926a;
import ut2.C102107v;
import wx3.C15601d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0018J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/compatibility/OldVersionItemView;", "Landroid/widget/FrameLayout;", "Leu2/g;", "Lbv2/a;", "Ltt2/a;", "", "getPosition", "Lgu2/b;", "getSnsInfo", "Landroid/graphics/Rect;", "getDisplayRect", "Lut2/v;", "p", "Lrx3/g;", "getUicHolder", "()Lut2/v;", "uicHolder", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView */
public final class OldVersionItemView extends FrameLayout implements C97709g, C92311a, C101926a {

    /* renamed from: q */
    public static final /* synthetic */ int f279619q = 0;

    /* renamed from: d */
    public final C0125s f279620d;

    /* renamed from: e */
    public final IListener<SnsOldItemContactEvent> f279621e;

    /* renamed from: f */
    public final IListener<SnsTranslateStartEvent> f279622f;

    /* renamed from: g */
    public final IListener<SnsTranslateFinishEvent> f279623g;

    /* renamed from: h */
    public final IListener<SnsUnTranslateEvent> f279624h;

    /* renamed from: i */
    public C98799a f279625i;

    /* renamed from: j */
    public String f279626j = "";

    /* renamed from: n */
    public View f279627n;

    /* renamed from: o */
    public C60905o f279628o;

    /* renamed from: p */
    public final C13601g f279629p = C36568h.m40985a(new C95820a(this));

    /* renamed from: com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$a */
    public static final class C95820a extends C87413o implements C32224a<C102107v> {

        /* renamed from: d */
        public final /* synthetic */ OldVersionItemView f279630d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95820a(OldVersionItemView oldVersionItemView) {
            super(0);
            this.f279630d = oldVersionItemView;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$uicHolder$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$uicHolder$2");
            C39818r rVar = C39818r.f106831a;
            Context context = this.f279630d.getContext();
            C87412m.m108593f(context, "context");
            C39622i0 a = rVar.mo62443b(context).mo75002a(C102107v.class);
            C87412m.m108593f(a, "UICProvider.of(context).…ldVersionUIC::class.java)");
            C102107v vVar = (C102107v) a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$uicHolder$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView$uicHolder$2");
            return vVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OldVersionItemView(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        C0125s sVar = (C0125s) context2;
        this.f279620d = sVar;
        this.f279621e = new OldVersionItemView$oldItemContactListener$1(this, sVar);
        this.f279622f = new OldVersionItemView$translateStartListener$1(this, sVar);
        this.f279623g = new OldVersionItemView$translateFinishListener$1(this, sVar);
        this.f279624h = new OldVersionItemView$unTranslateListener$1(this, sVar);
    }

    private final C102107v getUicHolder() {
        SnsMethodCalculate.markStartTimeMs("getUicHolder", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        C102107v vVar = (C102107v) this.f279629p.getValue();
        SnsMethodCalculate.markEndTimeMs("getUicHolder", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return vVar;
    }

    /* renamed from: i */
    public static final /* synthetic */ C60905o m122684i(OldVersionItemView oldVersionItemView) {
        SnsMethodCalculate.markStartTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        C60905o oVar = oldVersionItemView.f279628o;
        SnsMethodCalculate.markEndTimeMs("access$getHolder$p", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return oVar;
    }

    /* renamed from: j */
    public static final /* synthetic */ void m122685j(OldVersionItemView oldVersionItemView, int i) {
        SnsMethodCalculate.markStartTimeMs("access$loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        oldVersionItemView.mo133281k(i);
        SnsMethodCalculate.markEndTimeMs("access$loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* renamed from: a */
    public boolean mo126293a(boolean z) {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("enable", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        C98799a aVar = this.f279625i;
        if (aVar == null || (b = aVar.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("enable", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return false;
        } else if (b.isAd() || z) {
            View view = this.f279627n;
            BaseTimeLineItem baseTimeLineItem = null;
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
            if (baseViewHolder != null) {
                baseTimeLineItem = baseViewHolder.f279965k0;
            }
            boolean z2 = baseTimeLineItem instanceof C92312b;
            SnsMethodCalculate.markEndTimeMs("enable", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return z2;
        } else {
            SnsMethodCalculate.markEndTimeMs("enable", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return false;
        }
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        View view = this.f279627n;
        BaseTimeLineItem baseTimeLineItem = null;
        BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if (baseViewHolder != null) {
            baseTimeLineItem = baseViewHolder.f279965k0;
        }
        if (baseTimeLineItem instanceof C92312b) {
            BaseTimeLineItem baseTimeLineItem2 = baseViewHolder.f279965k0;
            C87412m.m108592e(baseTimeLineItem2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            ((C92312b) baseTimeLineItem2).mo126294b();
        }
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* renamed from: c */
    public void mo133276c() {
        SnsMethodCalculate.markStartTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        SnsMethodCalculate.markEndTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* renamed from: d */
    public void mo133277d() {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        View view = this.f279627n;
        BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if (baseViewHolder == null) {
            SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return;
        }
        C98799a aVar = this.f279625i;
        if (aVar == null || (b = aVar.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return;
        }
        baseViewHolder.f279915B.setText(b.mo137508F2());
        SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        int i2 = (baseViewHolder != null ? baseViewHolder.f279948c : 0) - 1;
        Object obj = null;
        if (getContext() instanceof Activity) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Activity activity = (Activity) context;
            if (activity.isDestroyed() || activity.isFinishing()) {
                StringBuilder sb = new StringBuilder();
                sb.append("play position:");
                sb.append(i2);
                sb.append(' ');
                C98799a aVar = this.f279625i;
                if (aVar != null) {
                    obj = aVar.mo138170b();
                }
                sb.append(obj);
                Log.m105920e("MicroMsg.Improve.OldItem", sb.toString());
                SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                return;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("play position:");
        sb4.append(i2);
        sb4.append(' ');
        C98799a aVar2 = this.f279625i;
        sb4.append(aVar2 != null ? aVar2.mo138170b() : null);
        Log.m105924i("MicroMsg.Improve.OldItem", sb4.toString());
        View view = this.f279627n;
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = (BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if (baseViewHolder2 != null) {
            obj = baseViewHolder2.f279965k0;
        }
        if (obj instanceof C92312b) {
            BaseTimeLineItem baseTimeLineItem = baseViewHolder2.f279965k0;
            C87412m.m108592e(baseTimeLineItem, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            ((C92312b) baseTimeLineItem).mo126295e(baseViewHolder2, i2);
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0025, code lost:
        r4 = r4.mo138170b();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo133278f(jq3.C60905o r6, iu2.C98799a r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "measure"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "holder"
            gy3.C87412m.m108594g(r6, r2)
            java.lang.String r2 = "item"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r2 = "isItemChanged"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            gu2.b r3 = r7.mo138170b()
            java.lang.String r3 = r3.mo137504B2()
            iu2.a r4 = r5.f279625i
            if (r4 == 0) goto L_0x0030
            gu2.b r4 = r4.mo138170b()
            if (r4 == 0) goto L_0x0030
            java.lang.String r4 = r4.mo137504B2()
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            r3 = r3 ^ 1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            r5.f279628o = r6
            r5.f279625i = r7
            gu2.b r6 = r7.mo138170b()
            java.lang.String r6 = r6.mo137504B2()
            r5.f279626j = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = 91
            r6.append(r7)
            int r7 = r5.hashCode()
            r6.append(r7)
            java.lang.String r7 = "]onBindViewHolder pos:"
            r6.append(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.Improve.OldItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            int r8 = r8 + -1
            r5.mo133281k(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            z31.b r6 = z31.C102972b.f303874a
            r7 = 12076(0x2f2c, float:1.6922E-41)
            java.lang.String r8 = r5.f279626j
            java.lang.String r0 = "BrowseAdFeedCount"
            r6.mo142713g(r7, r0, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView.mo133278f(jq3.o, iu2.a, int):boolean");
    }

    /* renamed from: g */
    public Object mo81006g(C60905o oVar, C98799a aVar, int i, boolean z, C15601d<? super C13598b0> dVar) {
        SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        Log.m105924i("MicroMsg.Improve.OldItem", '[' + hashCode() + "] onBindViewHolder: ");
        this.f279622f.alive();
        this.f279623g.alive();
        this.f279624h.alive();
        this.f279621e.alive();
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return b0Var;
    }

    public Rect getDisplayRect() {
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        View view = this.f279627n;
        C98214b bVar = null;
        BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if ((baseViewHolder != null ? baseViewHolder.f279965k0 : null) instanceof C92312b) {
            BaseTimeLineItem baseTimeLineItem = baseViewHolder.f279965k0;
            C87412m.m108592e(baseTimeLineItem, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            Rect displayRect = ((C92312b) baseTimeLineItem).getDisplayRect();
            if (displayRect == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("getDisplayRect null rect! info:");
                C98799a aVar = this.f279625i;
                if (aVar != null) {
                    bVar = aVar.mo138170b();
                }
                sb.append(bVar);
                Log.m105920e("MicroMsg.Improve.OldItem", sb.toString());
                displayRect = new Rect();
            }
            SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
            return displayRect;
        }
        Rect rect = new Rect();
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return rect;
    }

    public int getPosition() {
        SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        C60905o oVar = this.f279628o;
        int j = (oVar != null ? oVar.mo17363j() : 0) - 1;
        SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return j;
    }

    public C98214b getSnsInfo() {
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        C98799a aVar = this.f279625i;
        C98214b b = aVar != null ? aVar.mo138170b() : null;
        SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return b;
    }

    /* renamed from: h */
    public void mo81008h() {
        SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        Log.m105924i("MicroMsg.Improve.OldItem", '[' + hashCode() + "]onViewRecycled");
        this.f279622f.dead();
        this.f279623g.dead();
        this.f279624h.dead();
        this.f279621e.dead();
        SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* renamed from: k */
    public final void mo133281k(int i) {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        C98799a aVar = this.f279625i;
        if (aVar == null || (b = aVar.mo138170b()) == null) {
            SnsMethodCalculate.markEndTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        } else if (i < 0) {
            Log.m105920e("MicroMsg.Improve.OldItem", "invalid position:" + i);
            SnsMethodCalculate.markEndTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        } else {
            int p = SnsTimeLineBaseAdapter.m122254p(b.mo137505C2());
            Log.m105924i("MicroMsg.Improve.OldItem", '[' + hashCode() + "]loadView pos:" + i + " type:" + p);
            C102107v uicHolder = getUicHolder();
            View view = this.f279627n;
            uicHolder.getClass();
            SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = uicHolder.f300670e;
            ViewParent viewParent = null;
            View c = snsTimeLineBaseAdapter != null ? snsTimeLineBaseAdapter.mo132915c(b.mo137505C2(), i, p, view) : null;
            SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            this.f279627n = c;
            if (c == null) {
                Log.m105928w("MicroMsg.Improve.OldItem", "loadView is null");
                SnsMethodCalculate.markEndTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                return;
            }
            if (c != null) {
                viewParent = c.getParent();
            }
            if (viewParent == null) {
                removeAllViews();
                addView(this.f279627n);
            }
            SnsMethodCalculate.markEndTimeMs("loadView", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        }
    }

    public String name() {
        C98214b b;
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        StringBuilder sb = new StringBuilder("Old");
        C98799a aVar = this.f279625i;
        if (!(aVar == null || (b = aVar.mo138170b()) == null)) {
            View view = this.f279627n;
            String str = null;
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
            if ((baseViewHolder != null ? baseViewHolder.f279965k0 : null) != null) {
                sb.append("-");
                BaseTimeLineItem baseTimeLineItem = baseViewHolder.f279965k0;
                if (baseTimeLineItem != null) {
                    str = baseTimeLineItem.mo81016t();
                }
                sb.append(str);
            } else {
                if (b.isAd()) {
                    sb.append("-ad");
                }
                int p = SnsTimeLineBaseAdapter.m122254p(b.mo137505C2());
                sb.append("-type:" + p);
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "builder.toString()");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        return sb4;
    }

    public void onAttachedToWindow() {
        SnsMethodCalculate.markStartTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        super.onAttachedToWindow();
        int position = getPosition();
        Log.m105924i("MicroMsg.Improve.OldItem", '[' + hashCode() + "]onAttachedToWindow position:" + position);
        mo133281k(position);
        SnsMethodCalculate.markEndTimeMs("onAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r3 = r3.mo138170b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDetachedFromWindow() {
        /*
            r4 = this;
            java.lang.String r0 = "onDetachedFromWindow"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 91
            r2.append(r3)
            int r3 = r4.hashCode()
            r2.append(r3)
            java.lang.String r3 = "]onDetachedFromWindow id:"
            r2.append(r3)
            iu2.a r3 = r4.f279625i
            if (r3 == 0) goto L_0x002d
            gu2.b r3 = r3.mo138170b()
            if (r3 == 0) goto L_0x002d
            java.lang.String r3 = r3.mo137504B2()
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.Improve.OldItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            super.onDetachedFromWindow()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.improve.compatibility.OldVersionItemView.onDetachedFromWindow():void");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        View view = this.f279627n;
        BaseTimeLineItem baseTimeLineItem = null;
        BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if (baseViewHolder != null) {
            baseTimeLineItem = baseViewHolder.f279965k0;
        }
        if (baseTimeLineItem instanceof C92312b) {
            BaseTimeLineItem baseTimeLineItem2 = baseViewHolder.f279965k0;
            C87412m.m108592e(baseTimeLineItem2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            ((C92312b) baseTimeLineItem2).pause();
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
        View view = this.f279627n;
        BaseTimeLineItem baseTimeLineItem = null;
        BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) (view != null ? view.getTag() : null);
        if (baseViewHolder != null) {
            baseTimeLineItem = baseViewHolder.f279965k0;
        }
        if (baseTimeLineItem instanceof C92312b) {
            BaseTimeLineItem baseTimeLineItem2 = baseViewHolder.f279965k0;
            C87412m.m108592e(baseTimeLineItem2, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.video.ISnsAutoPlayItem");
            ((C92312b) baseTimeLineItem2).stop();
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OldVersionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        C0125s sVar = (C0125s) context2;
        this.f279620d = sVar;
        this.f279621e = new OldVersionItemView$oldItemContactListener$1(this, sVar);
        this.f279622f = new OldVersionItemView$translateStartListener$1(this, sVar);
        this.f279623g = new OldVersionItemView$translateFinishListener$1(this, sVar);
        this.f279624h = new OldVersionItemView$unTranslateListener$1(this, sVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OldVersionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        Context context2 = getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        C0125s sVar = (C0125s) context2;
        this.f279620d = sVar;
        this.f279621e = new OldVersionItemView$oldItemContactListener$1(this, sVar);
        this.f279622f = new OldVersionItemView$translateStartListener$1(this, sVar);
        this.f279623g = new OldVersionItemView$translateFinishListener$1(this, sVar);
        this.f279624h = new OldVersionItemView$unTranslateListener$1(this, sVar);
    }
}
