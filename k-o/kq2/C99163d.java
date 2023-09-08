package kq2;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import br2.C54550e;
import bv2.C92312b;
import bv2.C92313c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMPinProgressBtn;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.core.AssetExtension;
import com.tencent.tencentmap.mapsdk.maps.TencentMapServiceProtocol;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98957g;
import jp2.C98963o;
import jq2.C99000r;
import jq2.C99008w;
import kg3.C76577a;
import qq2.C101238e;
import te3.C101804kv2;

/* renamed from: kq2.d */
public class C99163d extends BaseTimeLineItem implements C92312b, C98957g {

    /* renamed from: q */
    public boolean f290766q = true;

    /* renamed from: r */
    public String f290767r = "";

    /* renamed from: s */
    public boolean f290768s = false;

    /* renamed from: t */
    public SnsInfo f290769t;

    /* renamed from: u */
    public C99165b f290770u;

    /* renamed from: v */
    public View f290771v = null;

    /* renamed from: w */
    public C99000r f290772w;

    /* renamed from: x */
    public C54550e f290773x;

    /* renamed from: y */
    public View.OnClickListener f290774y = new C99164a();

    /* renamed from: kq2.d$a */
    public class C99164a implements View.OnClickListener {
        public C99164a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$2");
            Log.m105924i("SnsAd.AdSightTimeLineItem", "ProxySightClickListener onClick");
            try {
                C99163d dVar = C99163d.this;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = dVar.f279906g;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                if (snsTimeLineBaseAdapter.f278568b.mo132093o() == 0) {
                    C99163d dVar2 = C99163d.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = dVar2.f279906g;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    snsTimeLineBaseAdapter2.f278572f.f280353I.onClick(view);
                } else {
                    C99163d dVar3 = C99163d.this;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    SnsTimeLineBaseAdapter snsTimeLineBaseAdapter3 = dVar3.f279906g;
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    if (snsTimeLineBaseAdapter3.f278568b.mo132093o() == 1) {
                        C99163d dVar4 = C99163d.this;
                        SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter4 = dVar4.f279906g;
                        SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                        snsTimeLineBaseAdapter4.f278572f.f280353I.onClick(view);
                    }
                }
                C99163d dVar5 = C99163d.this;
                SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                dVar5.f290768s = true;
                SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            } catch (Exception e) {
                Log.m105920e("SnsAd.AdSightTimeLineItem", "ProxySightClickListener onClick, exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem$2");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kq2.d$b */
    public static class C99165b extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public ViewStub f290776F0;

        /* renamed from: G0 */
        public AdLivingStreamContainer f290777G0;
    }

    /* renamed from: C */
    public void mo138529C() {
        BaseTimeLine baseTimeLine;
        C98963o oVar;
        SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        Log.m105925i("SnsAd.AdSightTimeLineItem", "doPause: %s Ad Video doPause", this);
        if (C54550e.m61296a(this.f290769t)) {
            C54550e eVar = this.f290773x;
            if (eVar != null) {
                eVar.mo75432g();
            }
        } else {
            C99165b bVar = this.f290770u;
            if (!(bVar == null || bVar.f279953e0 == null)) {
                SnsInfo snsInfo = this.f290769t;
                SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f279906g;
                if (!(snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null || snsInfo == null)) {
                    oVar.mo138314u(snsInfo.field_snsId);
                }
                SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            }
        }
        SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    /* renamed from: D */
    public final void mo138530D(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, boolean z) {
        SnsMethodCalculate.markStartTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        Log.m105924i("SnsAd.AdSightTimeLineItem", "setVideoStatusIvVisibility: setVideoStatusIvVisibility is " + i + ", isPlaying is " + z);
        if (z) {
            Log.m105925i("SnsAd.AdSightTimeLineItem", "setVideoStatusIvVisibility: %s, but isPlaying", Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return;
        }
        baseViewHolder.f279953e0.f280506i.setVisibility(i);
        SnsMethodCalculate.markEndTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    /* renamed from: E */
    public void mo138531E() {
        SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        Log.m105924i("SnsAd.AdSightTimeLineItem", "showPlayBtn: try show play btn, isPlayingSight is false");
        C99165b bVar = this.f290770u;
        if (!(bVar == null || bVar.f279953e0 == null)) {
            Log.m105924i("SnsAd.AdSightTimeLineItem", "showPlayBtn: show play btn");
            this.f290770u.f279953e0.f280506i.setVisibility(0);
            this.f290770u.f279953e0.f280507j.setVisibility(8);
            this.f290770u.f279953e0.f280506i.setImageDrawable(C76577a.m92158i(this.f279904e, C0966R.raw.shortvideo_play_btn));
            this.f290770u.f279953e0.f280506i.setContentDescription(this.f279904e.getString(C0966R.string.f361136hk0));
        }
        SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        Log.m105924i("SnsAd.AdSightTimeLineItem", "onUIPause");
        mo138529C();
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        C54550e eVar;
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        if (C54550e.m61296a(this.f290769t) && (eVar = this.f290773x) != null) {
            eVar.mo75427b();
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        if (C54550e.m61296a(this.f290769t)) {
            if (this.f290773x != null) {
                C96254a.m123394d().mo133938k();
                C92313c.m116089a().mo126302e(this);
                this.f290773x.mo75434i();
            }
            SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return;
        }
        if (this.f290766q) {
            Log.m105918d("SnsAd.AdSightTimeLineItem", "play: the new video  item is online video");
            SnsMethodCalculate.markStartTimeMs("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            if (baseViewHolder == null) {
                Log.m105920e("SnsAd.AdSightTimeLineItem", "playOnlineVideo: the holder is null");
                SnsMethodCalculate.markEndTimeMs("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            } else {
                C101804kv2 a = C99008w.m128937a(baseViewHolder);
                String c = C99008w.m128939c(baseViewHolder);
                SnsInfo DN = C94866e1.Yx0().mo139798DN(baseViewHolder.f279956g);
                C98963o b = C99008w.m128938b(this.f279906g);
                String str = baseViewHolder.f279956g;
                if (a == null || c == null || DN == null) {
                    Log.m105920e("SnsAd.AdSightTimeLineItem", "playOnlineVideo: the media, timelineId, sns info is null");
                    SnsMethodCalculate.markEndTimeMs("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                } else {
                    C92313c.m116089a().mo126301d();
                    SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    Log.m105924i("SnsAd.AdSightTimeLineItem", "hidePlayBtn: try hide play btn");
                    C99165b bVar = this.f290770u;
                    if (!(bVar == null || bVar.f279953e0 == null)) {
                        Log.m105924i("SnsAd.AdSightTimeLineItem", "hidePlayBtn: hide play btn");
                        this.f290770u.f279953e0.f280506i.setVisibility(8);
                        this.f290770u.f279953e0.f280507j.setVisibility(8);
                    }
                    SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                    Log.m105924i("SnsAd.AdSightTimeLineItem", "playOnlineVideo: position is " + i + ", timelineId is " + c);
                    C101238e eVar = new C101238e("SnsAd.AdSightTimeLineItem");
                    SnsMethodCalculate.markStartTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                    eVar.f296440e = (FrameLayout) baseViewHolder.f279953e0.f280501d.findViewById(C0966R.C0970id.jxc);
                    SnsMethodCalculate.markEndTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                    SnsMethodCalculate.markStartTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                    eVar.f296439d = a;
                    SnsMethodCalculate.markEndTimeMs("mediaObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                    SnsMethodCalculate.markStartTimeMs("snsInfo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoPlayBuilder");
                    eVar.f296438c = DN;
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
                    eVar.mo140703a(1, new C99162c(this));
                    SnsMethodCalculate.markEndTimeMs("playOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    public Rect getDisplayRect() {
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        View view = this.f290771v;
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            Rect rect = new Rect(i, i2, this.f290771v.getMeasuredWidth() + i, this.f290771v.getMeasuredHeight() + i2);
            SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
            return rect;
        }
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        return null;
    }

    /* renamed from: h */
    public void mo81014h(ViewStub viewStub, BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        this.f279904e.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        this.f290770u = (C99165b) baseViewHolder;
        if (BaseTimeLineItem.m122773q(baseViewHolder) != null) {
            BaseTimeLineItem.m122773q(baseViewHolder).setLayoutResource(C0966R.C0971layout.c3k);
            ViewStub viewStub2 = (ViewStub) baseViewHolder.f279960i.findViewById(C0966R.C0970id.f5g);
            if (!baseViewHolder.f279951d0) {
                baseViewHolder.f279953e0.f280501d = viewStub2.inflate();
                baseViewHolder.f279951d0 = true;
            }
        } else {
            baseViewHolder.f279953e0.f280501d = baseViewHolder.f279960i.findViewById(C0966R.C0970id.jua);
            baseViewHolder.f279951d0 = true;
        }
        C96066m2 m2Var = baseViewHolder.f279953e0;
        m2Var.f280505h = m2Var.f280501d.findViewById(C0966R.C0970id.b47);
        C96066m2 m2Var2 = baseViewHolder.f279953e0;
        m2Var2.f280503f = (ImageView) m2Var2.f280505h.findViewById(C0966R.C0970id.kk6);
        baseViewHolder.f279953e0.f280505h.setOnClickListener(this.f290774y);
        C96066m2 m2Var3 = baseViewHolder.f279953e0;
        m2Var3.f280506i = (ImageView) m2Var3.f280501d.findViewById(C0966R.C0970id.k17);
        C96066m2 m2Var4 = baseViewHolder.f279953e0;
        m2Var4.f280507j = (MMPinProgressBtn) m2Var4.f280501d.findViewById(C0966R.C0970id.i7j);
        C96066m2 m2Var5 = baseViewHolder.f279953e0;
        m2Var5.f280509l = (TextView) m2Var5.f280501d.findViewById(C0966R.C0970id.f357936ck1);
        C96066m2 m2Var6 = baseViewHolder.f279953e0;
        m2Var6.f280508k = (TextView) m2Var6.f280501d.findViewById(C0966R.C0970id.ckr);
        C96066m2 m2Var7 = baseViewHolder.f279953e0;
        m2Var7.f280510m = (ImageView) m2Var7.f280501d.findViewById(C0966R.C0970id.jvp);
        this.f290770u.f290776F0 = (ViewStub) baseViewHolder.f279953e0.f280501d.findViewById(C0966R.C0970id.oop);
        SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0610  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0617  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x06be  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81015o(com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r37, int r38, com.tencent.p014mm.plugin.sns.p106ui.C96275w6 r39, com.tencent.p014mm.protocal.protobuf.TimeLineObject r40, int r41, com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter r42) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r42
            java.lang.String r6 = "fillItem"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            java.lang.String r8 = "computeVideoPlayer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r7)
            r9 = 1
            r0.f290766q = r9
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r7)
            if (r4 == 0) goto L_0x0026
            java.lang.String r8 = r4.f283893Id
            if (r8 == 0) goto L_0x0026
            r0.f290767r = r8
        L_0x0026:
            te3.j00 r8 = r4.ContentObj
            r10 = 0
            r11 = 0
            if (r8 == 0) goto L_0x003f
            java.util.LinkedList<te3.kv2> r8 = r8.f298427h
            int r8 = r8.size()
            if (r8 < r9) goto L_0x003f
            te3.j00 r8 = r4.ContentObj
            java.util.LinkedList<te3.kv2> r8 = r8.f298427h
            java.lang.Object r8 = r8.get(r11)
            te3.kv2 r8 = (te3.C101804kv2) r8
            goto L_0x0040
        L_0x003f:
            r8 = r10
        L_0x0040:
            boolean r12 = r3.f281391r
            if (r12 == 0) goto L_0x004d
            boolean r12 = r0.f290766q
            if (r12 == 0) goto L_0x004d
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r3.f281367a
            lo2.C99556n.m129940c(r12, r8)
        L_0x004d:
            com.tencent.mm.plugin.sns.ui.m2 r12 = r1.f279953e0
            android.widget.ImageView r12 = r12.f280503f
            java.lang.Object r12 = r12.getTag()
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0078
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r13 != 0) goto L_0x0069
            java.lang.String r13 = r0.f290767r
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0086
        L_0x0069:
            com.tencent.mm.plugin.sns.ui.m2 r12 = r1.f279953e0
            android.widget.ImageView r12 = r12.f280503f
            rq2.C101432s.m133132n(r12, r11)
            com.tencent.mm.plugin.sns.ui.m2 r12 = r1.f279953e0
            android.widget.ImageView r12 = r12.f280503f
            r12.setImageDrawable(r10)
            goto L_0x0086
        L_0x0078:
            com.tencent.mm.plugin.sns.ui.m2 r12 = r1.f279953e0
            android.widget.ImageView r12 = r12.f280503f
            rq2.C101432s.m133132n(r12, r11)
            com.tencent.mm.plugin.sns.ui.m2 r12 = r1.f279953e0
            android.widget.ImageView r12 = r12.f280503f
            r12.setImageDrawable(r10)
        L_0x0086:
            com.tencent.mm.plugin.sns.storage.SnsInfo r12 = r3.f281367a
            r0.f290769t = r12
            com.tencent.mm.plugin.sns.ui.video.a r12 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r13 = r4.f283893Id
            boolean r12 = r12.mo133933f(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "ad fillItem, videoItem, pos="
            r13.append(r14)
            r13.append(r2)
            java.lang.String r14 = ", snsId="
            r13.append(r14)
            java.lang.String r14 = r4.f283893Id
            r13.append(r14)
            java.lang.String r14 = ", isPlayingVideo="
            r13.append(r14)
            r13.append(r12)
            java.lang.String r14 = ", hash="
            r13.append(r14)
            int r14 = r36.hashCode()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "SnsAd.AdSightTimeLineItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            com.tencent.mm.plugin.sns.ui.m2 r13 = r1.f279953e0
            android.widget.ImageView r13 = r13.f280506i
            com.tencent.mm.plugin.sns.model.o r13 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.m2 r15 = r1.f279953e0
            java.lang.String r10 = r3.f281381h
            boolean r11 = r3.f281391r
            r15.mo133598a(r4, r2, r10, r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.TextView r10 = r10.f280508k
            r11 = 8
            r10.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280510m
            r10.setVisibility(r11)
            te3.j00 r10 = r4.ContentObj
            if (r10 == 0) goto L_0x08b8
            java.util.LinkedList<te3.kv2> r10 = r10.f298427h
            int r10 = r10.size()
            if (r10 < r9) goto L_0x08b8
            long r16 = java.lang.System.nanoTime()
            boolean r10 = r13.mo131141x(r8)
            long r19 = java.lang.System.nanoTime()
            long r19 = r19 - r16
            r15 = 2
            java.lang.Object[] r11 = new java.lang.Object[r15]
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r10)
            r18 = 0
            r11[r18] = r21
            java.lang.Long r19 = java.lang.Long.valueOf(r19)
            r11[r9] = r19
            java.lang.String r15 = "fillItem: isMediaSightExist %b duration %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r11)
            r15 = 2131834031(0x7f1134af, float:1.930116E38)
            r9 = 2131756957(0x7f10079d, float:1.9144836E38)
            r11 = 5
            if (r10 != 0) goto L_0x01da
            boolean r10 = r13.mo131140w(r8)
            if (r10 == 0) goto L_0x013e
            r10 = 8
            r0.mo138530D(r1, r10, r12)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r9 = r9.f280507j
            r10 = 0
            r9.setVisibility(r10)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r9 = r9.f280507j
            r9.mo153891a()
            goto L_0x025f
        L_0x013e:
            boolean r10 = r3.f281391r
            if (r10 == 0) goto L_0x0163
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r3.f281367a
            int r10 = r13.mo131133p(r10)
            if (r10 != r11) goto L_0x0163
            r13.mo131097Q(r8)
            r9 = 8
            r0.mo138530D(r1, r9, r12)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r9 = r9.f280507j
            r10 = 0
            r9.setVisibility(r10)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r9 = r9.f280507j
            r9.mo153891a()
            goto L_0x025f
        L_0x0163:
            boolean r10 = r13.mo131137t(r8)
            if (r10 == 0) goto L_0x0182
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r9 = r9.f280507j
            r10 = 8
            r9.setVisibility(r10)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.widget.ImageView r9 = r9.f280506i
            r13 = 2131756959(0x7f10079f, float:1.914484E38)
            r9.setImageResource(r13)
            r9 = 0
            r0.mo138530D(r1, r9, r12)
            goto L_0x025f
        L_0x0182:
            r10 = 8
            r11 = 0
            r13.mo131098R(r8)
            r0.mo138530D(r1, r11, r12)
            com.tencent.mm.plugin.sns.ui.m2 r11 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r11 = r11.f280507j
            r11.setVisibility(r10)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r11 = r0.f279904e
            android.graphics.drawable.Drawable r9 = kg3.C76577a.m92158i(r11, r9)
            r10.setImageDrawable(r9)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.widget.ImageView r9 = r9.f280506i
            android.app.Activity r10 = r0.f279904e
            java.lang.String r10 = r10.getString(r15)
            r9.setContentDescription(r10)
            boolean r9 = r3.f281391r
            if (r9 != 0) goto L_0x01c3
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r3.f281367a
            int r9 = r13.mo131135r(r9)
            r10 = 4
            if (r9 != r10) goto L_0x01c4
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.widget.TextView r9 = r9.f280508k
            r11 = 0
            r9.setVisibility(r11)
            goto L_0x025f
        L_0x01c3:
            r10 = 4
        L_0x01c4:
            r11 = 0
            boolean r9 = r3.f281391r
            if (r9 == 0) goto L_0x025f
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r3.f281367a
            int r9 = r13.mo131133p(r9)
            if (r9 != r10) goto L_0x025f
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.widget.TextView r9 = r9.f280508k
            r9.setVisibility(r11)
            goto L_0x025f
        L_0x01da:
            r11 = 0
            boolean r10 = r13.mo131143z(r8)
            if (r10 == 0) goto L_0x0208
            r0.mo138530D(r1, r11, r12)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r11 = 8
            r10.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r11 = r0.f279904e
            android.graphics.drawable.Drawable r9 = kg3.C76577a.m92158i(r11, r9)
            r10.setImageDrawable(r9)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.widget.ImageView r9 = r9.f280506i
            android.app.Activity r10 = r0.f279904e
            java.lang.String r10 = r10.getString(r15)
            r9.setContentDescription(r10)
            goto L_0x025f
        L_0x0208:
            boolean r10 = r13.mo131139v(r8)
            if (r10 == 0) goto L_0x021b
            r10 = 8
            r0.mo138530D(r1, r10, r12)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r9 = r9.f280507j
            r9.setVisibility(r10)
            goto L_0x025f
        L_0x021b:
            boolean r10 = r3.f281391r
            if (r10 == 0) goto L_0x0235
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r3.f281367a
            int r10 = r13.mo131133p(r10)
            r11 = 5
            if (r10 > r11) goto L_0x0235
            boolean r9 = r0.f290768s
            if (r9 != 0) goto L_0x025f
            java.lang.String r9 = "fillItem: mIsForbidShowPlayBtn is false and showPlayBtn"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r9)
            r36.mo138531E()
            goto L_0x025f
        L_0x0235:
            r13.mo131098R(r8)
            r10 = 0
            r0.mo138530D(r1, r10, r12)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r10 = r10.f280507j
            r11 = 8
            r10.setVisibility(r11)
            com.tencent.mm.plugin.sns.ui.m2 r10 = r1.f279953e0
            android.widget.ImageView r10 = r10.f280506i
            android.app.Activity r11 = r0.f279904e
            android.graphics.drawable.Drawable r9 = kg3.C76577a.m92158i(r11, r9)
            r10.setImageDrawable(r9)
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.widget.ImageView r9 = r9.f280506i
            android.app.Activity r10 = r0.f279904e
            java.lang.String r10 = r10.getString(r15)
            r9.setContentDescription(r10)
        L_0x025f:
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r1.timeLineObject
            boolean r9 = vr2.C102260r.m134846O(r9)
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x02cb
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r0.f290769t
            if (r9 == 0) goto L_0x0274
            com.tencent.mm.plugin.sns.storage.ADXml r9 = r9.getAdXml()
            int r9 = r9.verticalVideoDisplayType
            goto L_0x0275
        L_0x0274:
            r9 = 0
        L_0x0275:
            r11 = 1
            if (r9 != r11) goto L_0x0285
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.view.View r9 = r9.f280505h
            android.content.Context r9 = r9.getContext()
            android.util.Pair r9 = ad0.C91999u.m115568n(r9)
            goto L_0x0294
        L_0x0285:
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r1.timeLineObject
            com.tencent.mm.plugin.sns.ui.m2 r11 = r1.f279953e0
            android.view.View r11 = r11.f280505h
            android.content.Context r11 = r11.getContext()
            r13 = 0
            android.util.Pair r9 = ad0.C91999u.m115566l(r9, r11, r13)
        L_0x0294:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "fillItem: isVerticalAdVideo is true, snsId is "
            r11.append(r13)
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r3.f281367a
            r15 = r12
            if (r13 != 0) goto L_0x02a5
            r12 = r10
            goto L_0x02ab
        L_0x02a5:
            long r12 = r13.field_snsId
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
        L_0x02ab:
            r11.append(r12)
            java.lang.String r12 = ", showW is "
            r11.append(r12)
            java.lang.Object r12 = r9.first
            r11.append(r12)
            java.lang.String r12 = ", showH is "
            r11.append(r12)
            java.lang.Object r12 = r9.second
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r11)
            r11 = 1
            goto L_0x02dd
        L_0x02cb:
            r15 = r12
            com.tencent.mm.protocal.protobuf.TimeLineObject r9 = r1.timeLineObject
            com.tencent.mm.plugin.sns.ui.m2 r11 = r1.f279953e0
            android.view.View r11 = r11.f280505h
            android.content.Context r11 = r11.getContext()
            boolean r12 = r3.f281391r
            android.util.Pair r9 = ad0.C91999u.m115566l(r9, r11, r12)
            r11 = 0
        L_0x02dd:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "fillItem: set value to pair first time, isVerticalAdVideo is "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r13 = ", snsId is "
            r12.append(r13)
            r22 = r10
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r3.f281367a
            if (r10 != 0) goto L_0x02f8
            r4 = r22
            goto L_0x02fe
        L_0x02f8:
            long r4 = r10.field_snsId
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L_0x02fe:
            r12.append(r4)
            java.lang.String r4 = ", pair first is "
            r12.append(r4)
            java.lang.Object r5 = r9.first
            r12.append(r5)
            java.lang.String r5 = ", pair second is "
            r12.append(r5)
            java.lang.Object r10 = r9.second
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            com.tencent.mm.plugin.sns.storage.SnsInfo r10 = r3.f281367a
            com.tencent.mm.plugin.sns.storage.ADXml r12 = r10.getAdXml()
            r23 = r9
            android.app.Activity r9 = r0.f279904e
            r24 = r6
            java.lang.String r6 = "window"
            java.lang.Object r6 = r9.getSystemService(r6)
            android.view.WindowManager r6 = (android.view.WindowManager) r6
            android.view.Display r6 = r6.getDefaultDisplay()
            int r6 = r6.getWidth()
            if (r12 == 0) goto L_0x04a3
            float r9 = r12.adMediaDisplayWidth
            r25 = 0
            int r26 = (r9 > r25 ? 1 : (r9 == r25 ? 0 : -1))
            if (r26 <= 0) goto L_0x04a3
            float r2 = r12.adMediaDisplayHeight
            int r2 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x04a3
            r2 = r8
            double r8 = (double) r9
            r25 = r15
            int r15 = r12.adBasicRemWidth
            r26 = r2
            int r2 = r12.adBasicRootFontSize
            r27 = r7
            r7 = 1
            float r2 = ps2.C100894u.m132234n(r8, r7, r15, r2)
            float r8 = r12.adMediaDisplayHeight
            double r8 = (double) r8
            int r15 = r12.adBasicRemWidth
            r28 = r10
            int r10 = r12.adBasicRootFontSize
            float r8 = ps2.C100894u.m132234n(r8, r7, r15, r10)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "fillItem: set value to pair second time previously, isVerticalAdVideo is "
            r7.append(r9)
            r7.append(r11)
            r7.append(r13)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r3.f281367a
            if (r9 != 0) goto L_0x037e
            r9 = r22
            goto L_0x0384
        L_0x037e:
            long r9 = r9.field_snsId
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
        L_0x0384:
            r7.append(r9)
            java.lang.String r9 = ", adMediaWidth is "
            r7.append(r9)
            r7.append(r2)
            java.lang.String r9 = ", adMediaHeight is "
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r7)
            int r7 = r12.adMediaDisplayMode
            r9 = 50
            r10 = 12
            if (r7 != 0) goto L_0x03f0
            android.app.Activity r7 = r0.f279904e
            int r7 = kg3.C76577a.m92151b(r7, r9)
            int r7 = r6 - r7
            android.app.Activity r15 = r0.f279904e
            int r15 = kg3.C76577a.m92151b(r15, r10)
            int r7 = r7 - r15
            android.app.Activity r15 = r0.f279904e
            int r15 = kg3.C76577a.m92151b(r15, r10)
            int r7 = r7 - r15
            float r7 = (float) r7
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x03e0
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r9)
            int r6 = r6 - r2
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r10)
            int r6 = r6 - r2
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r10)
            int r6 = r6 - r2
            float r2 = (float) r6
            float r6 = r12.adMediaDisplayHeight
            float r6 = r6 * r2
            float r7 = r12.adMediaDisplayWidth
            float r6 = r6 / r7
            int r6 = (int) r6
            float r8 = (float) r6
        L_0x03e0:
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r6 = (int) r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.Pair r9 = android.util.Pair.create(r2, r6)
            goto L_0x046b
        L_0x03f0:
            r2 = 1
            if (r7 != r2) goto L_0x0430
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r9)
            int r6 = r6 - r2
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r9)
            int r6 = r6 - r2
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r10)
            int r6 = r6 - r2
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r10)
            int r6 = r6 - r2
            float r2 = (float) r6
            float r7 = r12.adMediaDisplayHeight
            float r2 = r2 * r7
            float r7 = r12.adMediaDisplayWidth
            float r2 = r2 / r7
            int r2 = (int) r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r9 = android.util.Pair.create(r7, r2)
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r2 = r1.f279968m
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r7.<init>(r6, r8)
            r2.setLayoutParams(r7)
            goto L_0x046b
        L_0x0430:
            r2 = 2
            if (r7 != r2) goto L_0x0469
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r9)
            int r6 = r6 - r2
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r10)
            int r6 = r6 - r2
            android.app.Activity r2 = r0.f279904e
            int r2 = kg3.C76577a.m92151b(r2, r10)
            int r6 = r6 - r2
            float r2 = (float) r6
            float r7 = r12.adMediaDisplayHeight
            float r2 = r2 * r7
            float r7 = r12.adMediaDisplayWidth
            float r2 = r2 / r7
            int r2 = (int) r2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            android.util.Pair r9 = android.util.Pair.create(r7, r2)
            com.tencent.mm.plugin.sns.ui.AsyncNormalTextView r2 = r1.f279968m
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r7.<init>(r6, r8)
            r2.setLayoutParams(r7)
            goto L_0x046b
        L_0x0469:
            r9 = r23
        L_0x046b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "fillItem: set value to pair second time, isVerticalAdVideo is "
            r2.append(r6)
            r2.append(r11)
            r2.append(r13)
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r3.f281367a
            if (r6 != 0) goto L_0x0482
            r6 = r22
            goto L_0x0488
        L_0x0482:
            long r6 = r6.field_snsId
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
        L_0x0488:
            r2.append(r6)
            r2.append(r4)
            java.lang.Object r4 = r9.first
            r2.append(r4)
            r2.append(r5)
            java.lang.Object r4 = r9.second
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            goto L_0x04ad
        L_0x04a3:
            r27 = r7
            r26 = r8
            r28 = r10
            r25 = r15
            r9 = r23
        L_0x04ad:
            com.tencent.mm.plugin.sns.storage.ADInfo r2 = r28.getAdInfo()
            jq2.r r4 = r0.f290772w
            if (r4 != 0) goto L_0x04bc
            jq2.r r4 = new jq2.r
            r4.<init>()
            r0.f290772w = r4
        L_0x04bc:
            if (r2 == 0) goto L_0x050f
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r28.getAdXml()
            boolean r4 = r4.isLandingPagesAd()
            if (r4 != 0) goto L_0x050f
            jq2.r r4 = r0.f290772w
            if (r4 == 0) goto L_0x050f
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f290769t
            boolean r4 = r4.mo138357b(r5)
            if (r4 != 0) goto L_0x050f
            r4 = 0
            boolean r5 = r2.checkCurIndexCanJump(r4)
            r6 = 2131235646(0x7f08133e, float:1.8087492E38)
            if (r5 == 0) goto L_0x04fb
            java.util.List<com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo> r5 = r2.adClickActionInfoList
            java.lang.Object r5 = r5.get(r4)
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = (com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo) r5
            boolean r2 = r2.isWeApp(r5)
            if (r2 == 0) goto L_0x050f
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.widget.ImageView r2 = r2.f280510m
            r2.setVisibility(r4)
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.widget.ImageView r2 = r2.f280510m
            r2.setImageResource(r6)
            goto L_0x050f
        L_0x04fb:
            boolean r2 = r2.isWeapp()
            if (r2 == 0) goto L_0x050f
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.widget.ImageView r2 = r2.f280510m
            r2.setVisibility(r4)
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.widget.ImageView r2 = r2.f280510m
            r2.setImageResource(r6)
        L_0x050f:
            java.lang.Object r2 = r9.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r4 = r9.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "fillItem: isVerticalAdVideo is "
            r5.append(r6)
            r5.append(r11)
            r5.append(r13)
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r3.f281367a
            if (r6 != 0) goto L_0x0536
            r10 = r22
            goto L_0x053c
        L_0x0536:
            long r6 = r6.field_snsId
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
        L_0x053c:
            r5.append(r10)
            java.lang.String r6 = ", smallSide is "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", smallHeight is "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f279953e0
            android.widget.TextView r5 = r5.f280509l
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            r5.width = r2
            r5.height = r4
            com.tencent.mm.plugin.sns.ui.m2 r6 = r1.f279953e0
            android.widget.TextView r6 = r6.f280509l
            r6.setLayoutParams(r5)
            com.tencent.mm.plugin.sns.ui.m2 r6 = r1.f279953e0
            android.view.View r6 = r6.f280501d
            r7 = 2131314162(0x7f0945f2, float:1.8246741E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r7 = (android.widget.FrameLayout.LayoutParams) r7
            r7.width = r2
            r7.height = r4
            r6.setLayoutParams(r7)
            com.tencent.mm.plugin.sns.ui.m2 r7 = r1.f279953e0
            android.view.View r7 = r7.f280501d
            r8 = 2131315202(0x7f094a02, float:1.824885E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r5)
            r7.setLayoutParams(r8)
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r8 = 4
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.mo10233c(r8)
            java.lang.Object[] r29 = r5.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem"
            java.lang.String r31 = "fillItem"
            java.lang.String r32 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r7
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r8 = 0
            java.lang.Object r5 = r5.mo10231a(r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7.setVisibility(r5)
            java.lang.String r29 = "com/tencent/mm/plugin/sns/ad/timeline/item/AdNormalSightTimeLineItem"
            java.lang.String r30 = "fillItem"
            java.lang.String r31 = "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineVendingStruct;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;ILcom/tencent/mm/plugin/sns/ui/SnsTimeLineBaseAdapter;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f279953e0
            android.view.View r5 = r5.f280505h
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            r7 = -2
            r5.width = r7
            r5.height = r7
            com.tencent.mm.plugin.sns.ui.m2 r7 = r1.f279953e0
            android.view.View r7 = r7.f280505h
            r7.setLayoutParams(r5)
            r0.f290771v = r6
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f290769t
            java.lang.String r7 = "addOnRemovedListener"
            r8 = r27
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = "getSnsAdStatistic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            r10 = r42
            if (r10 == 0) goto L_0x060a
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r11 = r10.f278568b
            if (r11 == 0) goto L_0x060a
            jp2.o r11 = r11.f276699f
            if (r11 == 0) goto L_0x060a
            goto L_0x0618
        L_0x060a:
            android.app.Activity r11 = r0.f279904e
            boolean r12 = r11 instanceof com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI
            if (r12 == 0) goto L_0x0617
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI r11 = (com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI) r11
            jp2.o r11 = r11.mo132956s8()
            goto L_0x0618
        L_0x0617:
            r11 = 0
        L_0x0618:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            if (r11 == 0) goto L_0x0632
            java.lang.String r5 = vr2.C102236a0.m134728W(r5)
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 != 0) goto L_0x0632
            java.lang.String r9 = "0"
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x0632
            r11.mo138294a(r5, r0)
        L_0x0632:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f290769t
            boolean r5 = br2.C54550e.m61296a(r5)
            if (r5 == 0) goto L_0x06be
            jq2.r r5 = r0.f290772w
            if (r5 == 0) goto L_0x064d
            android.app.Activity r6 = r0.f279904e
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r0.f290769t
            com.tencent.mm.plugin.sns.ui.m2 r9 = r1.f279953e0
            android.view.View r9 = r9.f280501d
            r10 = 0
            r5.mo138356a(r6, r7, r9, r10)
        L_0x064d:
            com.tencent.mm.plugin.sns.storage.SnsInfo r13 = r0.f290769t
            java.lang.String r5 = "fillAdLivingStreamViewInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r8)
            boolean r6 = r1 instanceof kq2.C99163d.C99165b
            if (r6 == 0) goto L_0x06b8
            r6 = r1
            kq2.d$b r6 = (kq2.C99163d.C99165b) r6
            android.view.ViewStub r7 = r6.f290776F0
            if (r7 == 0) goto L_0x066b
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r9 = r6.f290777G0
            if (r9 != 0) goto L_0x066b
            android.view.View r7 = rq2.C101432s.m133125g(r7)
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r7 = (com.tencent.p014mm.plugin.sns.p104ad.widget.living.AdLivingStreamContainer) r7
            r6.f290777G0 = r7
        L_0x066b:
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r7 = r6.f290777G0
            if (r7 != 0) goto L_0x0674
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x08bb
        L_0x0674:
            com.tencent.mm.plugin.sns.ui.m2 r7 = r6.f279953e0
            android.widget.ImageView r7 = r7.f280506i
            r9 = 8
            r7.setVisibility(r9)
            com.tencent.mm.plugin.sns.ui.m2 r7 = r6.f279953e0
            com.tencent.mm.ui.widget.MMPinProgressBtn r7 = r7.f280507j
            r7.setVisibility(r9)
            com.tencent.mm.plugin.sns.ui.m2 r7 = r6.f279953e0
            android.view.View r9 = r7.f280505h
            r9.setTag(r7)
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r7 = r6.f290777G0
            rq2.C101432s.m133131m(r7, r2, r4)
            com.tencent.mm.plugin.sns.ui.m2 r7 = r6.f279953e0
            android.view.View r7 = r7.f280505h
            rq2.C101432s.m133131m(r7, r2, r4)
            br2.e r7 = r0.f290773x
            if (r7 != 0) goto L_0x06a4
            br2.e r7 = new br2.e
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r6 = r6.f290777G0
            r7.<init>(r6)
            r0.f290773x = r7
        L_0x06a4:
            br2.e r12 = r0.f290773x
            r14 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r4)
            r7 = 3
            r15 = r26
            r16 = r2
            r12.mo75429d(r13, r14, r15, r16, r17)
            goto L_0x06b9
        L_0x06b8:
            r7 = 3
        L_0x06b9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r8)
            goto L_0x08bc
        L_0x06be:
            r7 = 3
            kq2.d$b r5 = r0.f290770u
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer r5 = r5.f290777G0
            if (r5 == 0) goto L_0x06ca
            r9 = 8
            r5.setVisibility(r9)
        L_0x06ca:
            br2.e r5 = r0.f290773x
            if (r5 == 0) goto L_0x06d1
            r5.mo75433h()
        L_0x06d1:
            com.tencent.mm.plugin.sns.ui.video.a r5 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r9 = r40
            java.lang.String r11 = r9.f283893Id
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r5 = r5.mo133930b(r11)
            java.lang.Object[] r11 = new java.lang.Object[r7]
            java.lang.String r12 = r9.f283893Id
            r13 = 0
            r11[r13] = r12
            r12 = 1
            r11[r12] = r5
            int r15 = r6.getChildCount()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r16 = 2
            r11[r16] = r15
            java.lang.String r15 = "fillItem: fill item view check videoView reAttach, tlObjId:%s, vv:%s, count:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r11)
            int r11 = r6.getChildCount()
            if (r11 != r12) goto L_0x0714
            android.view.View r11 = r6.getChildAt(r13)
            boolean r11 = r11 instanceof android.widget.ImageView
            if (r11 == 0) goto L_0x0714
            r6.removeAllViews()
            java.lang.Object[] r11 = new java.lang.Object[r12]
            java.lang.String r15 = r9.f283893Id
            r11[r13] = r15
            java.lang.String r15 = "fillItem: find thumbView then remove it %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r11)
        L_0x0714:
            int r11 = r6.getChildCount()
            if (r11 != r12) goto L_0x0746
            android.view.View r11 = r6.getChildAt(r13)
            boolean r11 = r11 instanceof com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView
            if (r11 == 0) goto L_0x0746
            android.view.View r11 = r6.getChildAt(r13)
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r11 = (com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView) r11
            java.lang.String r12 = r9.f283893Id
            java.lang.String r15 = r11.f281251K1
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L_0x0746
            r6.removeAllViews()
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.String r15 = r9.f283893Id
            r12[r13] = r15
            java.lang.String r11 = r11.f281251K1
            r13 = 1
            r12[r13] = r11
            java.lang.String r11 = "fillItem: find diff id then remove it %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r11, r12)
        L_0x0746:
            if (r5 == 0) goto L_0x077f
            int r11 = r6.getChildCount()
            if (r11 != 0) goto L_0x077f
            android.view.ViewParent r11 = r5.getParent()
            if (r11 == 0) goto L_0x07af
            android.view.ViewParent r11 = r5.getParent()
            if (r11 == r6) goto L_0x07af
            r11 = 1
            r5.f281255O1 = r11
            android.view.ViewParent r11 = r5.getParent()
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r11.removeView(r5)
            r11 = 0
            r5.setVisibility(r11)
            com.tencent.mm.pluginsdk.ui.a$e r11 = com.tencent.p014mm.pluginsdk.p133ui.C96814a.C96817e.COVER
            r5.setVideoScaleType(r11)
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r12 = -1
            r13 = -1
            r11.<init>(r12, r13)
            r6.addView(r5, r11)
            java.lang.String r6 = "fillItem: reAttach success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            goto L_0x07af
        L_0x077f:
            if (r25 != 0) goto L_0x07af
            int r11 = r6.getChildCount()
            if (r11 <= 0) goto L_0x07af
            com.tencent.mm.plugin.sns.ui.video.a r11 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            java.lang.String r12 = r9.f283893Id
            boolean r11 = r11.mo133932e(r12)
            if (r11 != 0) goto L_0x07af
            long r11 = java.lang.System.currentTimeMillis()
            r13 = 0
            r6.removeViewAt(r13)
            r6 = 1
            java.lang.Object[] r15 = new java.lang.Object[r6]
            long r16 = java.lang.System.currentTimeMillis()
            long r16 = r16 - r11
            java.lang.Long r6 = java.lang.Long.valueOf(r16)
            r15[r13] = r6
            java.lang.String r6 = "fillItem: item remove video view cost:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r6, r15)
        L_0x07af:
            if (r5 == 0) goto L_0x07e3
            java.lang.String r6 = r1.f279956g
            com.tencent.mm.protocal.protobuf.TimeLineObject r11 = r1.timeLineObject
            if (r11 != 0) goto L_0x07bb
            r15 = r26
            r11 = 0
            goto L_0x07bf
        L_0x07bb:
            int r11 = r11.CreateTime
            r15 = r26
        L_0x07bf:
            r5.mo132324P(r15, r6, r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "fillItem: videoView setVideoData, position is "
            r5.append(r6)
            r6 = r38
            r5.append(r6)
            java.lang.String r6 = ", tlObj Id is "
            r5.append(r6)
            java.lang.String r6 = r9.f283893Id
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)
            goto L_0x0805
        L_0x07e3:
            r6 = r38
            r15 = r26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "fillItem: SnsVideoViewMgr can not return video view, position is "
            r5.append(r11)
            r5.append(r6)
            java.lang.String r6 = ", tlObj Id is "
            r5.append(r6)
            java.lang.String r6 = r9.f283893Id
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r5)
        L_0x0805:
            com.tencent.mm.plugin.sns.ui.m2 r5 = r1.f279953e0
            android.widget.ImageView r5 = r5.f280503f
            rq2.C101432s.m133131m(r5, r2, r4)
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.widget.ImageView r2 = r2.f280503f
            r2.requestLayout()
            com.tencent.mm.plugin.sns.model.o r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.widget.ImageView r14 = r2.f280503f
            r2 = -1
            android.app.Activity r4 = r0.f279904e
            int r16 = r4.hashCode()
            com.tencent.mm.storage.o3 r4 = com.tencent.p014mm.storage.C96983o3.m124651c()
            int r5 = r9.CreateTime
            r4.f284145b = r5
            r13 = r15
            r5 = r15
            r15 = r2
            r17 = r4
            r12.mo131114e0(r13, r14, r15, r16, r17)
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.widget.ImageView r2 = r2.f280503f
            java.lang.String r4 = r0.f290767r
            r2.setTag(r4)
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.widget.ImageView r2 = r2.f280503f
            r4 = 1
            rq2.C101432s.m133132n(r2, r4)
            com.tencent.mm.plugin.sns.ui.m2 r2 = r1.f279953e0
            android.view.View r4 = r2.f280505h
            r4.setTag(r2)
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.m120262YO()
            java.lang.String r4 = r5.f298689d
            java.lang.String r2 = com.tencent.p014mm.plugin.sns.model.C94938q1.m120518e(r2, r4)
            java.lang.String r4 = vr2.C102236a0.m134725T(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = r6.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x087e
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r2 = r10.f278568b
            jp2.o r2 = r2.f276699f
            long r11 = r3.f281383j
            float r4 = r5.f298684R
            int r4 = (int) r4
            r5 = 1
            r2.mo138292G(r11, r4, r5)
            lo2.C99556n.m129942e()
            goto L_0x088b
        L_0x087e:
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r2 = r10.f278568b
            jp2.o r2 = r2.f276699f
            long r11 = r3.f281383j
            float r4 = r5.f298684R
            int r4 = (int) r4
            r5 = 0
            r2.mo138292G(r11, r4, r5)
        L_0x088b:
            boolean r2 = r3.f281391r
            if (r2 == 0) goto L_0x089d
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r4 = r3.f281367a
            int r2 = r2.mo131133p(r4)
            r4 = 5
            if (r2 != r4) goto L_0x08ac
            goto L_0x08aa
        L_0x089d:
            r4 = 5
            com.tencent.mm.plugin.sns.model.o r2 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r3.f281367a
            int r2 = r2.mo131135r(r5)
            if (r2 != r4) goto L_0x08ac
        L_0x08aa:
            r2 = 1
            goto L_0x08ad
        L_0x08ac:
            r2 = 0
        L_0x08ad:
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r4 = r10.f278568b
            jp2.o r4 = r4.f276699f
            long r5 = r3.f281383j
            r9 = 1
            r4.mo138290E(r5, r2, r9)
            goto L_0x08bc
        L_0x08b8:
            r24 = r6
            r8 = r7
        L_0x08bb:
            r7 = 3
        L_0x08bc:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r0.f290769t
            boolean r2 = br2.C54550e.m61296a(r2)
            if (r2 != 0) goto L_0x08d4
            jq2.r r2 = r0.f290772w
            if (r2 == 0) goto L_0x08d4
            android.app.Activity r4 = r0.f279904e
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r0.f290769t
            com.tencent.mm.plugin.sns.ui.m2 r1 = r1.f279953e0
            android.view.View r1 = r1.f280501d
            r6 = 0
            r2.mo138356a(r4, r5, r1, r6)
        L_0x08d4:
            r0.mo133391g(r3, r7)
            r1 = r24
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kq2.C99163d.mo81015o(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.w6, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter):void");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        Log.m105924i("SnsAd.AdSightTimeLineItem", "pause");
        mo138529C();
        if (!C54550e.m61296a(this.f290769t)) {
            mo138531E();
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    public void stop() {
        C54550e eVar;
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        Log.m105925i("SnsAd.AdSightTimeLineItem", "stop: %s Ad Video stop", this);
        if (C54550e.m61296a(this.f290769t) && (eVar = this.f290773x) != null) {
            eVar.mo75431f();
        }
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ad.timeline.item.AdNormalSightTimeLineItem");
        return "AdNormalSightTimeLineItem";
    }
}
