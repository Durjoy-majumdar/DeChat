package com.tencent.p014mm.plugin.sns.p106ui.item;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bv2.C92312b;
import bv2.C92313c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.p104ad.widget.adsocial.C94753a;
import com.tencent.p014mm.plugin.sns.p106ui.BaseTimeLine;
import com.tencent.p014mm.plugin.sns.p106ui.C96275w6;
import com.tencent.p014mm.plugin.sns.p106ui.C96311x2;
import com.tencent.p014mm.plugin.sns.p106ui.OfflineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdCardVideoEndView;
import com.tencent.p014mm.plugin.sns.p106ui.widget.p804ad.AdRoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tav.core.AssetExtension;
import j20.C117292a;
import java.util.ArrayList;
import jp2.C98957g;
import jp2.C98963o;
import jq2.C60890q;
import kg3.C76577a;
import lu2.C99647f;
import nq2.C100151a;
import nu2.C100207g;
import p749xh.C66261f3;
import te3.C101789j00;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C37817q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.item.e */
public class C95917e extends BaseTimeLineItem implements C92312b, C98957g {

    /* renamed from: A */
    public C100151a.C100156e f280063A;

    /* renamed from: B */
    public C100207g f280064B;

    /* renamed from: q */
    public Handler f280065q = new Handler(Looper.getMainLooper());

    /* renamed from: r */
    public C95922e f280066r;

    /* renamed from: s */
    public volatile boolean f280067s = false;

    /* renamed from: t */
    public boolean f280068t = false;

    /* renamed from: u */
    public SnsInfo f280069u;

    /* renamed from: v */
    public int f280070v;

    /* renamed from: w */
    public C100151a f280071w;

    /* renamed from: x */
    public ADXml.C95018g f280072x;

    /* renamed from: y */
    public View.OnClickListener f280073y;

    /* renamed from: z */
    public boolean f280074z;

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.e$a */
    public class C95918a implements Runnable {
        public C95918a(C95917e eVar) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$1");
            C115669n.INSTANCE.mo175911u(1697, 2);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.e$b */
    public class C95919b implements Runnable {
        public C95919b(C95917e eVar) {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$2");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.e$c */
    public class C95920c implements View.OnClickListener {
        public C95920c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/item/FullCardAdTimeLineItemNew$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
            Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "ProxyCardClickListener onClick");
            try {
                C95917e.this.f279906g.f278572f.f280365U.onClick(view);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.FullCardAdTimeLineItemNew", "ProxyCardClickListener onClick, exp=" + e.toString());
            }
            C95917e eVar = C95917e.this;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            boolean z = eVar.f280068t;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            if (z) {
                SnsAdCardVideoEndView.m123450e(C95917e.this.f280069u, 1);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$3");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/item/FullCardAdTimeLineItemNew$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.e$d */
    public class C95921d implements C100151a.C100156e {
        public C95921d() {
        }

        /* renamed from: a */
        public void mo133435a(int i, boolean z) {
            String str;
            String str2;
            BaseTimeLine baseTimeLine;
            SnsAdCardVideoEndView snsAdCardVideoEndView;
            boolean z2 = z;
            SnsMethodCalculate.markStartTimeMs(C66261f3.COL_UPDATETIME, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
            int duration = z2 ? C95917e.this.f280066r.f280077F0.f293376u.getDuration() / 1000 : C95917e.this.f280066r.f280077F0.f293368m.f280504g.getDurationMs() / 1000;
            C95917e eVar = C95917e.this;
            long j = eVar.f280069u.field_snsId;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            ADXml.C95018g gVar = eVar.f280072x;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            SnsInfo snsInfo = C95917e.this.f280069u;
            long j2 = (long) i;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            SnsMethodCalculate.markStartTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = eVar.f279906g;
            if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || baseTimeLine.f276699f == null || snsInfo == null) {
                str2 = C66261f3.COL_UPDATETIME;
                str = "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6";
                SnsMethodCalculate.markEndTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            } else {
                if ((gVar == null || gVar.f275695k == null) && (snsAdCardVideoEndView = eVar.f280066r.f280077F0.f293369n) != null && snsAdCardVideoEndView.getVisibility() == 0) {
                    eVar.f280066r.f280077F0.f293369n.mo134011c(false);
                }
                C98963o oVar = eVar.f279906g.f278568b.f276699f;
                str2 = C66261f3.COL_UPDATETIME;
                str = "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6";
                oVar.mo138316w(snsInfo.field_snsId);
                eVar.f279906g.f278568b.f276699f.mo138318y(snsInfo.field_snsId, j2);
                if (!eVar.f279906g.f278568b.f276699f.mo138310q(j)) {
                    eVar.f279906g.f278568b.f276699f.mo138286A(j, Util.currentTicks());
                    eVar.f279906g.f278568b.f276699f.mo138288C(j, duration, true);
                    eVar.f279906g.f278568b.f276699f.mo138298e(j, j);
                }
                Log.m105918d("MicroMsg.FullCardAdTimeLineItemNew", "doOnVideoPlaying, currentTime=" + j2 + ", duration=" + duration + ", isOnlineVideo=" + z2);
                int i2 = (int) j2;
                C100151a.C100155d dVar = eVar.f280066r.f280077F0;
                C60890q.m71304c(gVar, i2, dVar.f293366k, dVar.f293367l);
                C94753a.m119991c(i2, eVar.f280066r.f280077F0, snsInfo);
                SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                C100207g gVar2 = eVar.f280064B;
                if (gVar2 != null) {
                    gVar2.mo139502g(j2, duration);
                }
                SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                SnsMethodCalculate.markEndTimeMs("doOnVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            }
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            SnsMethodCalculate.markEndTimeMs(str2, str);
        }

        /* renamed from: b */
        public void mo133436b(int i, boolean z) {
            SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
            Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "onStart, isOnlineVideoView=" + z + ", duration=" + i + ", hash=" + C95917e.this.hashCode());
            SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
        }

        /* renamed from: c */
        public void mo133437c() {
            SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
            C95917e eVar = C95917e.this;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            eVar.mo133430F();
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
        }

        /* renamed from: d */
        public void mo133438d(boolean z) {
            boolean z2;
            BaseTimeLine baseTimeLine;
            C98963o oVar;
            SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
            Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "onCompletion, isOnlineVideoView=" + z + ", hash=" + C95917e.this.hashCode());
            C95917e eVar = C95917e.this;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            ADXml.C95018g gVar = eVar.f280072x;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            SnsMethodCalculate.markStartTimeMs("isNeedReplayVideo", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            if (!eVar.f280067s || gVar == null || gVar.f275695k != null) {
                z2 = false;
                SnsMethodCalculate.markEndTimeMs("isNeedReplayVideo", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            } else {
                z2 = true;
                SnsMethodCalculate.markEndTimeMs("isNeedReplayVideo", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            }
            if (z2) {
                C95917e.this.f280071w.mo139448i(z);
            }
            C95917e eVar2 = C95917e.this;
            SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = eVar2.f279906g;
            long j = eVar2.f280069u.field_snsId;
            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            ADXml.C95018g gVar2 = eVar2.f280072x;
            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            SnsMethodCalculate.markStartTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "doOnVideoCompletion, ret=0");
            if (snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null) {
                SnsMethodCalculate.markEndTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            } else {
                oVar.mo138295b(j);
                MMHandlerThread.postToMainThread(new C99647f(eVar2, gVar2));
                SnsMethodCalculate.markEndTimeMs("doOnVideoCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            }
            SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.item.e$e */
    public static class C95922e extends BaseTimeLineItem.BaseViewHolder {

        /* renamed from: F0 */
        public C100151a.C100155d f280077F0;
    }

    public C95917e() {
        SnsMethodCalculate.markStartTimeMs("getFullCardAdWrapper", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        C100151a aVar = new C100151a();
        SnsMethodCalculate.markEndTimeMs("getFullCardAdWrapper", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        this.f280071w = aVar;
        this.f280073y = new C95920c();
        this.f280074z = false;
        this.f280063A = new C95921d();
    }

    /* renamed from: C */
    public boolean mo133427C() {
        BaseTimeLine baseTimeLine;
        C98963o oVar;
        SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        int i = this.f280066r.timeLineObject.ContentObj.f298424e;
        if (i == 5 || i == 15) {
            Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "doPause, hash=" + hashCode());
            C95922e eVar = this.f280066r;
            if (eVar != null) {
                C100151a.C100155d dVar = eVar.f280077F0;
                if (dVar.f293368m != null) {
                    C100151a aVar = this.f280071w;
                    boolean z = dVar.f293355K.f293342c;
                    aVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                    aVar.mo139447h(z, false);
                    SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                    SnsInfo snsInfo = this.f280069u;
                    SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                    SnsTimeLineBaseAdapter snsTimeLineBaseAdapter = this.f279906g;
                    if (!(snsTimeLineBaseAdapter == null || (baseTimeLine = snsTimeLineBaseAdapter.f278568b) == null || (oVar = baseTimeLine.f276699f) == null || snsInfo == null)) {
                        oVar.mo138314u(snsInfo.field_snsId);
                    }
                    SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                    SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                    C100207g gVar = this.f280064B;
                    if (gVar != null) {
                        gVar.onVideoPause();
                    }
                    SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
                }
            }
            this.f280067s = false;
            SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return false;
    }

    /* renamed from: D */
    public void mo133428D() {
        SnsMethodCalculate.markStartTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        SnsMethodCalculate.markEndTimeMs("onEndViewShow", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    /* renamed from: E */
    public C100207g mo133429E() {
        SnsMethodCalculate.markStartTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        SnsMethodCalculate.markEndTimeMs("onNewFullCardBusiness", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return null;
    }

    /* renamed from: F */
    public final void mo133430F() {
        SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        SnsInfo snsInfo = this.f280069u;
        boolean z = snsInfo != null && (snsInfo.isBreakFrameAd() || this.f280069u.isAdIpInteractVideo());
        Log.m105918d("MicroMsg.FullCardAdTimeLineItemNew", "try show play btn");
        C95922e eVar = this.f280066r;
        if (eVar != null && eVar.f280077F0.f293368m != null && !this.f280067s && !this.f280066r.f280077F0.f293355K.f293341b && !z) {
            Log.m105918d("MicroMsg.FullCardAdTimeLineItemNew", "show play btn");
            this.f280066r.f280077F0.f293368m.f280506i.setVisibility(0);
            this.f280066r.f280077F0.f293368m.f280507j.setVisibility(8);
            this.f280066r.f280077F0.f293368m.f280506i.setImageDrawable(C76577a.m92158i(this.f279904e, C0966R.raw.shortvideo_play_btn));
            this.f280066r.f280077F0.f293368m.f280506i.setContentDescription(this.f279904e.getString(C0966R.string.f361136hk0));
        }
        SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    /* renamed from: G */
    public boolean mo133431G(ADXml aDXml) {
        SnsMethodCalculate.markStartTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        boolean m = C100151a.m130852m(aDXml);
        if (!this.f280074z) {
            this.f280074z = true;
            C115669n.INSTANCE.mo175911u(1697, m ? 4 : 3);
        }
        SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return m;
    }

    /* renamed from: b */
    public void mo126294b() {
        SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "onUIPause");
        mo133427C();
        SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    /* renamed from: d */
    public void mo133425d(String str) {
        SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        C100207g gVar = this.f280064B;
        if (gVar != null) {
            gVar.mo139488b();
        }
        SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    /* renamed from: e */
    public void mo126295e(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i) {
        SnsAdCardVideoEndView snsAdCardVideoEndView;
        SnsMethodCalculate.markStartTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        int i2 = baseViewHolder.timeLineObject.ContentObj.f298424e;
        if (i2 == 5 || i2 == 15) {
            Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "play: hash=" + hashCode() + ", pos=" + i + ", isEndViewShow=" + this.f280068t + ", isPlayingSight=" + this.f280067s);
            C96254a.m123394d().mo133938k();
            C92313c.m116089a().mo126302e(this);
            if (!this.f280068t && (baseViewHolder instanceof C95922e)) {
                this.f280071w.mo139450k(((C95922e) baseViewHolder).f280077F0.f293355K.f293342c);
                C100207g gVar = this.f280064B;
                if (gVar != null) {
                    gVar.mo139491e();
                }
            }
            SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            Log.m105918d("MicroMsg.FullCardAdTimeLineItemNew", "try hide play btn");
            C95922e eVar = this.f280066r;
            if (!(eVar == null || eVar.f280077F0.f293368m == null)) {
                Log.m105918d("MicroMsg.FullCardAdTimeLineItemNew", "hide play btn");
                this.f280066r.f280077F0.f293368m.f280506i.setVisibility(8);
                this.f280066r.f280077F0.f293368m.f280507j.setVisibility(8);
            }
            SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            this.f280067s = true;
            if (baseViewHolder instanceof C95922e) {
                ((C95922e) baseViewHolder).f280077F0.f293355K.f293341b = false;
            }
            if (!this.f280068t && (snsAdCardVideoEndView = this.f280066r.f280077F0.f293369n) != null && snsAdCardVideoEndView.getVisibility() == 0) {
                this.f280066r.f280077F0.f293369n.mo134011c(true);
            }
        }
        SnsMethodCalculate.markEndTimeMs(AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public Rect getDisplayRect() {
        View view;
        SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        C95922e eVar = this.f280066r;
        if (eVar == null || (view = eVar.f280077F0.f293379x) == null) {
            SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Rect rect = new Rect(i, i2, this.f280066r.f280077F0.f293379x.getMeasuredWidth() + i, this.f280066r.f280077F0.f293379x.getMeasuredHeight() + i2);
        SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return rect;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00d1  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo81014h(android.view.ViewStub r9, com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.BaseViewHolder r10) {
        /*
            r8 = this;
            java.lang.String r9 = "buildContent"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r0)
            java.lang.System.currentTimeMillis()
            r1 = r10
            com.tencent.mm.plugin.sns.ui.item.e$e r1 = (com.tencent.p014mm.plugin.sns.p106ui.item.C95917e.C95922e) r1
            r8.f280066r = r1
            android.view.ViewStub r1 = com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.m122773q(r10)
            r2 = 1
            if (r1 == 0) goto L_0x002f
            android.view.ViewStub r1 = com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.m122773q(r10)
            r3 = 2131497743(0x7f0c130f, float:1.8619088E38)
            r1.setLayoutResource(r3)
            boolean r1 = r10.f279976q
            if (r1 != 0) goto L_0x003f
            android.view.ViewStub r1 = com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem.m122773q(r10)
            android.view.View r1 = r1.inflate()
            r10.f279976q = r2
            goto L_0x0040
        L_0x002f:
            boolean r1 = r10.f279976q
            if (r1 != 0) goto L_0x003f
            android.view.View r1 = r10.f279960i
            r3 = 2131305283(0x7f092343, float:1.8228732E38)
            android.view.View r1 = r1.findViewById(r3)
            r10.f279976q = r2
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            com.tencent.mm.plugin.sns.ui.item.e$e r10 = r8.f280066r
            android.view.View r2 = r10.f279960i
            nq2.a$d r2 = nq2.C100151a.m130850g(r2)
            r10.f280077F0 = r2
            com.tencent.mm.plugin.sns.ui.item.e$e r10 = r8.f280066r
            nq2.a$d r2 = r10.f280077F0
            r2.f293379x = r1
            nq2.a$c r1 = r2.f293355K
            r3 = 0
            r1.f293340a = r3
            android.view.View r1 = r10.f279983t0
            r2.f293377v = r1
            android.view.ViewGroup r1 = r10.f279987v0
            r2.f293378w = r1
            com.tencent.mm.plugin.sns.ui.m2 r1 = r2.f293368m
            r10.f279953e0 = r1
            java.lang.String r10 = "getAdDisplayWidth"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r0)
            android.app.Activity r1 = r8.f279904e
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r2 = r1.getDefaultDisplay()
            int r2 = r2.getWidth()
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getHeight()
            int r1 = java.lang.Math.min(r2, r1)
            android.app.Activity r2 = r8.f279904e
            r3 = 56
            int r2 = kg3.C76577a.m92151b(r2, r3)
            android.app.Activity r3 = r8.f279904e
            r4 = 14
            int r3 = kg3.C76577a.m92151b(r3, r4)
            android.app.Activity r4 = r8.f279904e
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165590(0x7f070196, float:1.7945401E38)
            int r4 = r4.getDimensionPixelSize(r5)
            int r1 = r1 - r2
            int r1 = r1 - r3
            int r1 = r1 - r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)
            r8.f280070v = r1
            nq2.a r10 = r8.f280071w
            nq2.a$e r1 = r8.f280063A
            r10.getClass()
            java.lang.String r2 = "setWraperInterface"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r10.f293337i = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            nq2.a r10 = r8.f280071w
            com.tencent.mm.plugin.sns.ui.item.e$e r1 = r8.f280066r
            nq2.a$d r1 = r1.f280077F0
            r10.mo139446f(r1)
            java.lang.String r10 = "onBuildSubItemContent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r0)
            nu2.g r1 = r8.f280064B
            if (r1 != 0) goto L_0x00ec
            nu2.g r2 = r8.mo133429E()
            r8.f280064B = r2
            if (r2 == 0) goto L_0x00ec
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r1 = r8.f279906g
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r1 = r1.f278568b
            jp2.o r4 = r1.f276699f
            android.app.Activity r3 = r8.f279904e
            com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener r5 = r1.f276693D
            com.tencent.mm.plugin.sns.ui.item.e$e r1 = r8.f280066r
            nq2.a$d r6 = r1.f280077F0
            nq2.a r7 = r8.f280071w
            r2.mo139487a(r3, r4, r5, r6, r7)
        L_0x00ec:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)
            com.tencent.mm.plugin.sns.ui.item.e$e r10 = r8.f280066r
            nq2.a$d r10 = r10.f280077F0
            nq2.a$c r10 = r10.f293355K
            nu2.g r1 = r8.f280064B
            r10.f293344e = r1
            java.lang.System.currentTimeMillis()
            zt3.t r10 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.ui.item.e$a r1 = new com.tencent.mm.plugin.sns.ui.item.e$a
            r1.<init>(r8)
            zt3.j r10 = (zt3.C119157j) r10
            r10.mo183875f(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C95917e.mo81014h(android.view.ViewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder):void");
    }

    /* renamed from: o */
    public void mo81015o(BaseTimeLineItem.BaseViewHolder baseViewHolder, int i, C96275w6 w6Var, TimeLineObject timeLineObject, int i2, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        ADXml aDXml;
        String str;
        boolean z;
        SnsInfo snsInfo;
        int i3 = i;
        C96275w6 w6Var2 = w6Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter2 = snsTimeLineBaseAdapter;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        System.currentTimeMillis();
        Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "ad fillItem, fullCardAd, pos=" + i3 + ", snsId=" + timeLineObject2.f283893Id + ", hash=" + hashCode());
        C95922e eVar = (C95922e) baseViewHolder;
        if (eVar.f280077F0.f293355K.f293343d) {
            Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "holder is busy");
            SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            return;
        }
        SnsInfo snsInfo2 = w6Var2.f281367a;
        this.f280069u = snsInfo2;
        String q0 = snsInfo2 == null ? "" : C102236a0.m134765q0(snsInfo2.field_snsId);
        this.f280072x = null;
        if (snsInfo2 == null || snsInfo2.getAdXml() == null) {
            aDXml = null;
        } else {
            aDXml = snsInfo2.getAdXml();
            this.f280072x = aDXml.adFullCardInfo;
        }
        eVar.f280077F0.f293355K.f293342c = mo133431G(aDXml);
        Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "ad fillItem, useOnlineVideo=" + eVar.f280077F0.f293355K.f293342c);
        C100151a aVar = this.f280071w;
        C100151a.C100155d dVar = eVar.f280077F0;
        ADXml.C95018g gVar = this.f280072x;
        String str2 = "";
        Activity activity = this.f279904e;
        String str3 = "fillItem";
        C98963o oVar = snsTimeLineBaseAdapter2.f278568b.f276699f;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        aVar.f293329a = dVar;
        aVar.f293330b = gVar;
        aVar.f293331c = snsInfo2;
        aVar.f293332d = activity;
        aVar.f293333e = oVar;
        aVar.f293334f = timeLineObject2;
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        C100151a.C100155d dVar2 = eVar.f280077F0;
        View view = dVar2.f293379x;
        if (view instanceof AdRoundedCornerFrameLayout) {
            AdRoundedCornerFrameLayout adRoundedCornerFrameLayout = (AdRoundedCornerFrameLayout) view;
            adRoundedCornerFrameLayout.setIsReportTouchDownPositon(true);
            adRoundedCornerFrameLayout.mo134108c(this.f280069u, 1);
        }
        C94753a.m119990b(dVar2, snsInfo2, snsTimeLineBaseAdapter2.f278572f, eVar);
        dVar2.f293368m.f280504g.setVideoCallback((OfflineVideoView.C95361h) null);
        SnsTimelineVideoView snsTimelineVideoView = dVar2.f293376u;
        if (snsTimelineVideoView != null) {
            snsTimelineVideoView.setVideoCallback((OnlineVideoView.IVideoViewCallback) null);
        }
        if (this.f280072x != null) {
            ViewGroup.LayoutParams c = this.f280071w.mo139443c(this.f280070v);
            SnsAdCardVideoEndView snsAdCardVideoEndView = dVar2.f293369n;
            if (snsAdCardVideoEndView != null) {
                C96311x2 x2Var = this.f280072x.f275695k;
                SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
                if (x2Var == null) {
                    snsAdCardVideoEndView.mo134011c(false);
                }
                snsAdCardVideoEndView.f281455d = x2Var;
                snsAdCardVideoEndView.f281466r = 1;
                SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.widget.SnsAdCardVideoEndView");
                if (snsInfo2 != null && dVar2.f293369n.mo134009a(snsInfo2)) {
                    this.f280065q.removeCallbacksAndMessages((Object) null);
                    this.f280068t = false;
                }
            }
            SnsMethodCalculate.markStartTimeMs("onFillSubItem", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
            C98963o oVar2 = this.f279906g.f278568b.f276699f;
            if (!(oVar2 == null || (snsInfo = this.f280069u) == null)) {
                String q05 = C102236a0.m134765q0(snsInfo.field_snsId);
                if (!TextUtils.isEmpty(q05)) {
                    oVar2.mo138294a(q05, this);
                }
            }
            C100207g gVar2 = this.f280064B;
            if (gVar2 != null) {
                gVar2.mo139490d(i3, this.f280069u, this.f280072x, c);
            }
            SnsMethodCalculate.markEndTimeMs("onFillSubItem", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        } else {
            if (snsInfo2 != null) {
                z = snsInfo2.isFullCardAd();
                str = snsInfo2.getUxinfo();
            } else {
                str = str2;
                z = false;
            }
            Log.m105920e("MicroMsg.FullCardAdTimeLineItemNew", "invalid full card info, snsId=" + q0);
            C37817q.m41545a("fullcard_info_null", q0, 1, z ? 1 : 0, str);
        }
        C94901o Fx0 = C94866e1.Fx0();
        TimeLineObject timeLineObject3 = dVar2.f293368m.f280498a;
        if (timeLineObject3 != null && !Util.isEqual(timeLineObject3.f283893Id, timeLineObject2.f283893Id)) {
            Log.m105925i("MicroMsg.FullCardAdTimeLineItemNew", "need clear sightView %s", dVar2.f293368m.f280498a.f283893Id);
            if (!eVar.f280077F0.f293355K.f293342c) {
                Fx0.mo131115f(dVar2.f293368m.f280504g, -1, this.f279904e.hashCode(), i3);
            }
        }
        C96275w6 w6Var3 = w6Var;
        dVar2.f293368m.mo133598a(timeLineObject2, i3, w6Var3.f281381h, w6Var3.f281391r);
        dVar2.f293368m.f280508k.setVisibility(8);
        C101789j00 j002 = timeLineObject2.ContentObj;
        C101804kv2 kv22 = (j002 == null || j002.f298427h.size() < 1) ? null : timeLineObject2.ContentObj.f298427h.get(0);
        if (kv22 != null) {
            this.f280071w.mo139445e(kv22, Fx0, i3, eVar.f280077F0.f293355K.f293342c);
            int i4 = timeLineObject2.ContentObj.f298424e;
            if (i4 == 1) {
                dVar2.f293358c.setTag(baseViewHolder);
                dVar2.f293358c.setOnClickListener(this.f280073y);
            } else {
                BaseTimeLineItem.BaseViewHolder baseViewHolder2 = baseViewHolder;
                if (i4 == 15 || i4 == 5) {
                    dVar2.f293368m.f280501d.setTag(baseViewHolder2);
                    dVar2.f293375t.setTag(baseViewHolder2);
                    dVar2.f293368m.f280501d.setOnClickListener(this.f280073y);
                    dVar2.f293375t.setOnClickListener(this.f280073y);
                }
            }
        } else {
            if (eVar.f280077F0.f293355K.f293342c) {
                SnsTimelineVideoView snsTimelineVideoView2 = dVar2.f293376u;
                if (snsTimelineVideoView2 != null) {
                    snsTimelineVideoView2.setVideoCallback((OnlineVideoView.IVideoViewCallback) null);
                }
            } else {
                Fx0.mo131115f(dVar2.f293368m.f280504g, -1, this.f279904e.hashCode(), i3);
                dVar2.f293368m.f280504g.setVideoCallback((OfflineVideoView.C95361h) null);
            }
            dVar2.f293368m.f280509l.setVisibility(8);
            Log.m105920e("MicroMsg.FullCardAdTimeLineItemNew", "invalid full card media, snsId=" + q0);
        }
        System.currentTimeMillis();
        ((C119157j) C119157j.f356862d).mo183875f(new C95919b(this));
        mo133391g(w6Var3, 3);
        SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    public void pause() {
        SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        Log.m105924i("MicroMsg.FullCardAdTimeLineItemNew", "pause");
        if (mo133427C()) {
            mo133430F();
        }
        SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0027, code lost:
        r2 = r2.f280077F0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r4 = this;
            java.lang.String r0 = "stop"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "stop, hash="
            r2.append(r3)
            int r3 = r4.hashCode()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.FullCardAdTimeLineItemNew"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.sns.ui.item.e$e r2 = r4.f280066r
            if (r2 == 0) goto L_0x0049
            nq2.a$d r2 = r2.f280077F0
            com.tencent.mm.plugin.sns.ui.m2 r3 = r2.f293368m
            if (r3 == 0) goto L_0x0049
            nq2.a$c r2 = r2.f293355K
            boolean r2 = r2.f293342c
            if (r2 == 0) goto L_0x0034
            goto L_0x0039
        L_0x0034:
            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView r2 = r3.f280504g
            r2.mo134051v()
        L_0x0039:
            java.lang.String r2 = "onUIDestroy"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            nu2.g r3 = r4.f280064B
            if (r3 == 0) goto L_0x0046
            r3.mo139489c()
        L_0x0046:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
        L_0x0049:
            r2 = 0
            r4.f280067s = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.item.C95917e.stop():void");
    }

    /* renamed from: t */
    public String mo81016t() {
        SnsMethodCalculate.markStartTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        SnsMethodCalculate.markEndTimeMs("name", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew");
        return "FullCardAdTimeLineItemNew";
    }
}
