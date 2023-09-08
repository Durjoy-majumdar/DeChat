package nt2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jp2.C98963o;
import mq2.C99945b;
import os2.C100403f;
import qq2.C101235b;
import rq2.C101432s;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101804kv2;

/* renamed from: nt2.a */
public final class C100159a extends C100165c {

    /* renamed from: o */
    public final TimeLineObject f293385o;

    /* renamed from: p */
    public final SnsInfo f293386p;

    /* renamed from: q */
    public final C98963o f293387q;

    /* renamed from: r */
    public final Activity f293388r;

    /* renamed from: s */
    public final int f293389s;

    /* renamed from: t */
    public final C94851d1 f293390t;

    /* renamed from: u */
    public ViewGroup f293391u;

    /* renamed from: v */
    public final C13601g f293392v = C36568h.m40985a(new C100161d(this));

    /* renamed from: w */
    public SnsTimelineVideoView f293393w;

    /* renamed from: x */
    public boolean f293394x;

    /* renamed from: y */
    public C99945b f293395y;

    /* renamed from: nt2.a$b */
    public static final class C61898b extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C61898b f175999d = new C61898b();

        public C61898b() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$2");
            Boolean bool = Boolean.FALSE;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$2");
            return bool;
        }
    }

    /* renamed from: nt2.a$c */
    public static final class C61899c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C61899c f176000d = new C61899c();

        public C61899c() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$3");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$3");
            Boolean bool = Boolean.TRUE;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$3");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$3");
            return bool;
        }
    }

    /* renamed from: nt2.a$a */
    public static final class C100160a implements SnsTimelineVideoView.C96253d {

        /* renamed from: a */
        public final /* synthetic */ C100159a f293396a;

        public C100160a(C100159a aVar) {
            this.f293396a = aVar;
        }

        /* renamed from: O3 */
        public final void mo133426O3(String str) {
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$1");
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$Companion");
            Log.m105928w("AdCombineGridDetailItem", "timelineVideoView setUICallback onDestroy, the tlId is " + str + ", the timelineId is " + this.f293396a.f293411d.f283893Id);
            if (!Util.isNullOrNil(str) && C87412m.m108589b(str, this.f293396a.f293411d.f283893Id)) {
                C100159a aVar = this.f293396a;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setMHasPlayedVideo", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                aVar.f293394x = false;
                SnsMethodCalculate.markEndTimeMs("setMHasPlayedVideo", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$initView$1");
        }
    }

    /* renamed from: nt2.a$d */
    public static final class C100161d extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C100159a f293397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100161d(C100159a aVar) {
            super(0);
            this.f293397d = aVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$mVideoContainer$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$mVideoContainer$2");
            C100159a aVar = this.f293397d;
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            ViewGroup viewGroup = aVar.f293391u;
            SnsMethodCalculate.markEndTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            ViewGroup viewGroup2 = viewGroup != null ? (ViewGroup) viewGroup.findViewById(C0966R.C0970id.f359245nq0) : null;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$mVideoContainer$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem$mVideoContainer$2");
            return viewGroup2;
        }
    }

    public C100159a(TimeLineObject timeLineObject, SnsInfo snsInfo, TimelineClickListener timelineClickListener, C98963o oVar, Activity activity, int i, C94851d1 d1Var) {
        C87412m.m108594g(activity, "mActivity");
        this.f293385o = timeLineObject;
        this.f293386p = snsInfo;
        this.f293387q = oVar;
        this.f293388r = activity;
        this.f293389s = i;
        this.f293390t = d1Var;
    }

    /* renamed from: a */
    public void mo139451a(View view, View view2) {
        View view3 = view;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        String str = null;
        this.f293391u = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
        this.f293412e = this.f293386p;
        TimeLineObject timeLineObject = this.f293385o;
        this.f293411d = timeLineObject;
        if ((timeLineObject != null ? timeLineObject.f283893Id : null) != null) {
            if (timeLineObject != null) {
                str = timeLineObject.f283893Id;
            }
            C87412m.m108593f(str, "tlObj?.Id");
        }
        mo139456i();
        if (mo139455h() == 5 || mo139455h() == 15) {
            SnsTimelineVideoView snsTimelineVideoView = new SnsTimelineVideoView((Context) this.f293388r, true);
            this.f293393w = snsTimelineVideoView;
            snsTimelineVideoView.mo132372y(false);
            SnsTimelineVideoView snsTimelineVideoView2 = this.f293393w;
            if (snsTimelineVideoView2 != null) {
                snsTimelineVideoView2.setVideoScaleType(C96814a.C96817e.COVER);
            }
            SnsTimelineVideoView snsTimelineVideoView3 = this.f293393w;
            if (snsTimelineVideoView3 != null) {
                snsTimelineVideoView3.setThumbViewScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            C101432s.m133131m(this.f293393w, -1, -1);
            C101432s.m133132n(this.f293393w, true);
            SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            C101432s.m133120b((ViewGroup) ((C36570n) this.f293392v).getValue(), this.f293393w, 0);
            SnsTimelineVideoView snsTimelineVideoView4 = this.f293393w;
            if (snsTimelineVideoView4 != null) {
                snsTimelineVideoView4.setUICallback(new C100160a(this));
            }
            SnsTimelineVideoView snsTimelineVideoView5 = this.f293393w;
            if (snsTimelineVideoView5 != null) {
                snsTimelineVideoView5.setVideoCallback(new C101235b(this.f293412e, snsTimelineVideoView5, this.f293387q, 4));
            }
        }
        this.f293395y = new C99945b(this.f293391u, this.f293388r, this.f293386p, this.f293387q, this.f293389s, C61898b.f175999d, C61899c.f176000d, this.f293390t);
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    /* renamed from: b */
    public void mo139452b() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        super.mo139452b();
        if (this.f293394x) {
            SnsTimelineVideoView snsTimelineVideoView = this.f293393w;
            if (snsTimelineVideoView != null) {
                snsTimelineVideoView.mo132317G();
            }
            C98963o oVar = this.f293387q;
            if (oVar != null) {
                SnsInfo snsInfo = this.f293386p;
                oVar.mo138314u(snsInfo != null ? snsInfo.field_snsId : 0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    /* renamed from: e */
    public void mo139453e() {
        SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        super.mo139453e();
        SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
    }

    /* renamed from: g */
    public void mo139454g() {
        SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        SnsInfo snsInfo = this.f293386p;
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            return;
        }
        C100403f fVar = snsInfo.getAdXml().adCombinedGridInfo;
        if (fVar == null) {
            SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        } else if (this.f293385o == null) {
            SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        } else {
            C101804kv2 i = mo139456i();
            Integer valueOf = i != null ? Integer.valueOf(i.f298690e) : null;
            this.f293394x = false;
            C99945b bVar = this.f293395y;
            if (bVar != null) {
                bVar.mo139299g(fVar, valueOf, snsInfo, mo139456i(), this.f293385o, snsInfo.getLocalid());
            }
            if (mo139455h() == 5 || mo139455h() == 15) {
                this.f293394x = true;
                SnsTimelineVideoView snsTimelineVideoView = this.f293393w;
                if (snsTimelineVideoView != null) {
                    snsTimelineVideoView.setMute(true);
                }
                SnsTimelineVideoView snsTimelineVideoView2 = this.f293393w;
                if (snsTimelineVideoView2 != null) {
                    snsTimelineVideoView2.mo132324P(mo139456i(), snsInfo.getLocalid(), this.f293385o.CreateTime);
                }
                SnsTimelineVideoView snsTimelineVideoView3 = this.f293393w;
                if (snsTimelineVideoView3 != null) {
                    snsTimelineVideoView3.mo132334a();
                }
                SnsTimelineVideoView snsTimelineVideoView4 = this.f293393w;
                if (snsTimelineVideoView4 != null) {
                    snsTimelineVideoView4.mo132370w();
                }
                SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
                Log.m105924i("AdCombineGridDetailItem", "startPlay");
                SnsTimelineVideoView snsTimelineVideoView5 = this.f293393w;
                if (snsTimelineVideoView5 != null) {
                    if (snsTimelineVideoView5.mo132371x() || snsTimelineVideoView5.mo133919h0()) {
                        Log.m105924i("AdCombineGridDetailItem", "onlineVideo, resumePlay, hash=" + hashCode());
                        snsTimelineVideoView5.mo130404K();
                    } else {
                        Log.m105924i("AdCombineGridDetailItem", "onlineVideo, onResume, hash=" + hashCode());
                        snsTimelineVideoView5.mo130403E();
                    }
                }
                SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
            }
            SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r2.ContentObj;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo139455h() {
        /*
            r3 = this;
            java.lang.String r0 = "getMContentStyle"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r3.f293385o
            if (r2 == 0) goto L_0x0012
            te3.j00 r2 = r2.ContentObj
            if (r2 == 0) goto L_0x0012
            int r2 = r2.f298424e
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.C100159a.mo139455h():int");
    }

    /* renamed from: i */
    public final C101804kv2 mo139456i() {
        SnsMethodCalculate.markStartTimeMs("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        TimeLineObject timeLineObject = this.f293385o;
        C101804kv2 kv22 = null;
        if ((timeLineObject != null ? timeLineObject.ContentObj : null) != null && timeLineObject.ContentObj.f298427h.size() >= 1) {
            kv22 = this.f293385o.ContentObj.f298427h.get(0);
        }
        SnsMethodCalculate.markEndTimeMs("getMMedia", "com.tencent.mm.plugin.sns.ui.detail.item.AdCombineGridDetailItem");
        return kv22;
    }
}
