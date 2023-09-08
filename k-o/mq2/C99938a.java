package mq2;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import bv2.C92312b;
import bv2.C92313c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jp2.C98963o;
import jq2.C99008w;
import mq2.C99945b;
import os2.C100403f;
import qq2.C101237d;
import qq2.C101238e;
import rq2.C101432s;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101789j00;
import te3.C101804kv2;

/* renamed from: mq2.a */
public final class C99938a extends BaseTimeLineItem implements C92312b {

    /* renamed from: q */
    public C99939a f292840q;

    /* renamed from: r */
    public SnsInfo f292841r;

    /* renamed from: s */
    public boolean f292842s;

    /* renamed from: t */
    public final C13601g f292843t = C36568h.m40985a(new C99943e(this));

    /* renamed from: u */
    public final C13601g f292844u = C36568h.m40985a(new C99942d(this));

    /* renamed from: v */
    public String f292845v = "";

    /* renamed from: w */
    public C99945b f292846w;

    /* renamed from: mq2.a$a */
    public static final class C99939a extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public ViewGroup f292847F0;

        /* renamed from: G0 */
        public boolean f292848G0;
    }

    /* renamed from: mq2.a$b */
    public static final class C99940b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ BaseTimeLineItem.BaseViewHolder f292849d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99940b(BaseTimeLineItem.BaseViewHolder baseViewHolder) {
            super(0);
            this.f292849d = baseViewHolder;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$1");
            C99939a aVar = (C99939a) this.f292849d;
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("isForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
            boolean z = aVar.f292848G0;
            SnsMethodCalculate.markEndTimeMs("isForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
            Boolean valueOf = Boolean.valueOf(z);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$1");
            return valueOf;
        }
    }

    /* renamed from: mq2.a$c */
    public static final class C99941c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C99938a f292850d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99941c(C99938a aVar) {
            super(0);
            this.f292850d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$2");
            C99938a aVar = this.f292850d;
            SnsMethodCalculate.markStartTimeMs("access$isPlayingSight$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            boolean z = aVar.f292842s;
            SnsMethodCalculate.markEndTimeMs("access$isPlayingSight$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            Boolean valueOf = Boolean.valueOf(z);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$fillItem$2");
            return valueOf;
        }
    }

    /* renamed from: mq2.a$d */
    public static final class C99942d extends C87413o implements C32224a<ImageView> {

        /* renamed from: d */
        public final /* synthetic */ C99938a f292851d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99942d(C99938a aVar) {
            super(0);
            this.f292851d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mMainImage$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mMainImage$2");
            ViewGroup G = this.f292851d.mo139293G();
            ImageView imageView = G != null ? (ImageView) G.findViewById(C0966R.C0970id.npw) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mMainImage$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mMainImage$2");
            return imageView;
        }
    }

    /* renamed from: mq2.a$e */
    public static final class C99943e extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C99938a f292852d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99943e(C99938a aVar) {
            super(0);
            this.f292852d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mVideoContainer$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mVideoContainer$2");
            ViewGroup G = this.f292852d.mo139293G();
            ViewGroup viewGroup = G != null ? (ViewGroup) G.findViewById(C0966R.C0970id.f359245nq0) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mVideoContainer$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$mVideoContainer$2");
            return viewGroup;
        }
    }

    /* renamed from: mq2.a$f */
    public static final class C99944f implements SnsTimelineVideoView.C96253d {

        /* renamed from: a */
        public final /* synthetic */ C99938a f292853a;

        public C99944f(C99938a aVar) {
            this.f292853a = aVar;
        }

        /* renamed from: O3 */
        public final void mo133426O3(String str) {
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$play$1");
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$Companion");
            StringBuilder sb = new StringBuilder();
            sb.append("timelineVideoView setUICallback onDestroy, the tlId is ");
            sb.append(str);
            sb.append(", the timelineId is ");
            C99938a aVar = this.f292853a;
            SnsMethodCalculate.markStartTimeMs("access$getMTimelineId$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            String str2 = aVar.f292845v;
            SnsMethodCalculate.markEndTimeMs("access$getMTimelineId$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            sb.append(str2);
            Log.m105928w("AdCombineGridCardItem", sb.toString());
            if (!Util.isNullOrNil(str)) {
                C99938a aVar2 = this.f292853a;
                SnsMethodCalculate.markStartTimeMs("access$getMTimelineId$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                String str3 = aVar2.f292845v;
                SnsMethodCalculate.markEndTimeMs("access$getMTimelineId$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                if (C87412m.m108589b(str, str3)) {
                    C99938a aVar3 = this.f292853a;
                    SnsMethodCalculate.markStartTimeMs("access$setPlayingSight$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                    aVar3.f292842s = false;
                    SnsMethodCalculate.markEndTimeMs("access$setPlayingSight$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                    C99938a aVar4 = this.f292853a;
                    SnsMethodCalculate.markStartTimeMs("access$getMViewLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                    C99945b bVar = aVar4.f292846w;
                    SnsMethodCalculate.markEndTimeMs("access$getMViewLogic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                    if (bVar != null) {
                        bVar.mo139300h(C99945b.C99946a.Pause);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$play$1");
        }
    }

    /* renamed from: C */
    public final boolean mo139289C() {
        BaseTimeLine baseTimeLine;
        C98963o oVar;
        SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if (mo139290D() == 5 || mo139290D() == 15) {
            Log.m105925i("AdCombineGridCardItem", "%s GridCardAd doPause", this);
            SnsInfo snsInfo = this.f292841r;
            SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f279906g;
            if (!(snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null || snsInfo == null)) {
                oVar.mo138314u(snsInfo.field_snsId);
            }
            SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            this.f292842s = false;
            SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r2 = (r2 = r2.timeLineObject).ContentObj;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo139290D() {
        /*
            r3 = this;
            java.lang.String r0 = "getMContentStyle"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            mq2.a$a r2 = r3.f292840q
            if (r2 == 0) goto L_0x0016
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r2.timeLineObject
            if (r2 == 0) goto L_0x0016
            te3.j00 r2 = r2.ContentObj
            if (r2 == 0) goto L_0x0016
            int r2 = r2.f298424e
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mq2.C99938a.mo139290D():int");
    }

    /* renamed from: E */
    public final ImageView mo139291E() {
        SnsMethodCalculate.markStartTimeMs("getMMainImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        ImageView imageView = (ImageView) ((C36570n) this.f292844u).getValue();
        SnsMethodCalculate.markEndTimeMs("getMMainImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return imageView;
    }

    /* renamed from: F */
    public final ViewGroup mo139292F() {
        SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        ViewGroup viewGroup = (ViewGroup) ((C36570n) this.f292843t).getValue();
        SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return viewGroup;
    }

    /* renamed from: G */
    public final ViewGroup mo139293G() {
        ViewGroup viewGroup;
        SnsMethodCalculate.markStartTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        C99939a aVar = this.f292840q;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
            viewGroup = aVar.f292847F0;
            SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
        } else {
            viewGroup = null;
        }
        SnsMethodCalculate.markEndTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return viewGroup;
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        Log.m105924i("AdCombineGridCardItem", "onUIPause");
        mo139289C();
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if (baseViewHolder == null) {
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return;
        }
        if (mo139290D() == 5 || mo139290D() == 15) {
            C92313c.m116089a().mo126301d();
            Log.m105929w("AdCombineGridCardItem", "%s GridCardAd autoPlay pos %d", this, Integer.valueOf(i));
            SnsInfo snsInfo = this.f292841r;
            C101804kv2 a = C99008w.m128937a(baseViewHolder);
            String c = C99008w.m128939c(baseViewHolder);
            C98963o b = C99008w.m128938b(this.f279906g);
            ViewGroup F = mo139292F();
            String str = baseViewHolder.f279956g;
            if (!(snsInfo == null || a == null || F == null)) {
                Log.m105928w("AdCombineGridCardItem", "the sns info is " + snsInfo + " the media is " + a);
                C101238e eVar = new C101238e("AdCombineGridCardItem");
                SnsMethodCalculate.markStartTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar.f296440e = F;
                SnsMethodCalculate.markEndTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar.f296439d = a;
                SnsMethodCalculate.markEndTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar.f296438c = snsInfo;
                SnsMethodCalculate.markEndTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar.f296442g = str;
                SnsMethodCalculate.markEndTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs("timelineId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar.f296441f = c;
                SnsMethodCalculate.markEndTimeMs("timelineId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                SnsMethodCalculate.markStartTimeMs(TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar.f296437b = b;
                SnsMethodCalculate.markEndTimeMs(TencentMapServiceProtocol.SERVICE_NAME_STATISTIC, "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                eVar.mo140703a(4, new C99944f(this));
            }
            C99945b bVar = this.f292846w;
            if (bVar != null) {
                bVar.mo139300h(C99945b.C99946a.Playing);
            }
            this.f292842s = true;
            C99939a aVar = this.f292840q;
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("setForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                aVar.f292848G0 = false;
                SnsMethodCalculate.markEndTimeMs("setForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
            }
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    public Rect getDisplayRect() {
        ViewGroup F;
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if ((mo139290D() == 5 || mo139290D() == 15) && (F = mo139292F()) != null) {
            int[] iArr = new int[2];
            F.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, F.getMeasuredWidth() + i, F.getMeasuredHeight() + i2);
            SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return rect;
        }
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return null;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        Log.m105924i("AdCombineGridCardItem", "AdCombineGridCardItemHolder build content is called");
        if (!(baseViewHolder instanceof C99939a)) {
            Log.m105920e("AdCombineGridCardItem", "buildContent::the holder is not type of AdCombineGridCardItemHolder!!!");
            SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
            return;
        }
        this.f292840q = (C99939a) baseViewHolder;
        try {
            if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
                BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.d35);
                if (!((C99939a) baseViewHolder).f279976q) {
                    C99939a aVar = this.f292840q;
                    if (aVar != null) {
                        View inflate = BaseTimeLineItem.m122773q(baseViewHolder).inflate();
                        C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                        SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                        aVar.f292847F0 = (ViewGroup) inflate;
                        SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                    }
                    ((C99939a) baseViewHolder).f279976q = true;
                }
            } else if (!((C99939a) baseViewHolder).f279976q) {
                C99939a aVar2 = this.f292840q;
                if (aVar2 != null) {
                    SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                    aVar2.f292847F0 = (ViewGroup) ((C99939a) baseViewHolder).f279960i.findViewById(C0966R.C0970id.npm);
                    SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem$AdCombineGridCardItemHolder");
                }
                ((C99939a) baseViewHolder).f279976q = true;
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        BaseTimeLine baseTimeLine;
        BaseTimeLine baseTimeLine2;
        BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        if (!(baseViewHolder2 instanceof C99939a)) {
            Log.m105924i("AdCombineGridCardItem", "holder is null!");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        } else if (w6Var2 == null || this.f279904e == null) {
            Log.m105920e("AdCombineGridCardItem", "fillItem::the struct or mActivity is null!!!");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        } else {
            SnsInfo snsInfo = w6Var2.f281367a;
            if (snsInfo == null) {
                SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                return;
            }
            C87412m.m108591d(timeLineObject);
            C101789j00 j002 = timeLineObject2.ContentObj;
            C101804kv2 kv22 = (j002 == null || j002.f298427h.size() < 1) ? null : timeLineObject2.ContentObj.f298427h.get(0);
            C100403f fVar = snsInfo.getAdXml().adCombinedGridInfo;
            if (fVar == null) {
                SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
                return;
            }
            Integer valueOf = kv22 != null ? Integer.valueOf(kv22.f298690e) : null;
            C99939a aVar = (C99939a) baseViewHolder2;
            aVar.f279985u0 = true;
            String str = timeLineObject2.f283893Id;
            if (str == null) {
                str = "";
            }
            this.f292845v = str;
            this.f292841r = snsInfo;
            Log.m105924i("AdCombineGridCardItem", "ad fillItem, gridCardAd, pos=" + i + ", snsId=" + this.f292845v + ", hash=" + hashCode());
            String str2 = aVar.f279956g;
            ImageView E = mo139291E();
            Object tag = E != null ? E.getTag() : null;
            if (!(tag instanceof String)) {
                C101432s.m133132n(mo139291E(), false);
                ImageView E2 = mo139291E();
                if (E2 != null) {
                    E2.setImageDrawable((Drawable) null);
                }
            } else if (Util.isNullOrNil((String) tag) || !C87412m.m108589b(tag, this.f292845v)) {
                C101432s.m133132n(mo139291E(), false);
                ImageView E3 = mo139291E();
                if (E3 != null) {
                    E3.setImageDrawable((Drawable) null);
                }
            }
            ViewGroup G = mo139293G();
            Activity activity = this.f279904e;
            C87412m.m108593f(activity, "mActivity");
            String str3 = "fillItem";
            this.f292846w = new C99945b(G, activity, this.f292841r, (snsTimeLineBaseAdapter2 == null || (baseTimeLine2 = snsTimeLineBaseAdapter2.f278568b) == null) ? null : baseTimeLine2.f276699f, 0, new C99940b(baseViewHolder2), new C99941c(this), (snsTimeLineBaseAdapter2 == null || (baseTimeLine = snsTimeLineBaseAdapter2.f278568b) == null) ? null : baseTimeLine.f276700g);
            if (mo139290D() == 5 || mo139290D() == 15) {
                C101237d dVar = new C101237d("AdCombineGridCardItem");
                ViewGroup F = mo139292F();
                SnsMethodCalculate.markStartTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                dVar.f296432b = F;
                SnsMethodCalculate.markEndTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                SnsMethodCalculate.markStartTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                dVar.f296434d = kv22;
                SnsMethodCalculate.markEndTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                SnsMethodCalculate.markStartTimeMs("timelineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                dVar.f296433c = timeLineObject2;
                SnsMethodCalculate.markEndTimeMs("timelineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                SnsMethodCalculate.markStartTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                dVar.f296435e = str2;
                SnsMethodCalculate.markEndTimeMs("snsLocalId", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                SnsMethodCalculate.markStartTimeMs("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
                try {
                    dVar.mo140702a();
                } catch (Throwable unused) {
                }
                SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
            }
            C99945b bVar = this.f292846w;
            if (bVar != null) {
                bVar.mo139299g(fVar, valueOf, snsInfo, kv22, timeLineObject, str2);
            }
            aVar.f279985u0 = false;
            SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        }
    }

    public void pause() {
        C99945b bVar;
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        Log.m105924i("AdCombineGridCardItem", "pause");
        if (mo139289C() && (bVar = this.f292846w) != null) {
            bVar.mo139300h(C99945b.C99946a.Pause);
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    public void stop() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        Log.m105925i("AdCombineGridCardItem", "%s GridCardAd stop", this);
        this.f292842s = false;
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardItem");
        return "AdCombineGridCardItem";
    }
}
