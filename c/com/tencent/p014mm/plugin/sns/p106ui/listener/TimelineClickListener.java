package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import br2.C54550e;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SnsAdLivingStreamJumpEvent;
import com.tencent.p014mm.autogen.events.TimelinePlayBackAnimEvent;
import com.tencent.p014mm.autogen.events.TimelinePlayClickAnimEvent;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94851d1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.C96066m2;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.C96235u4;
import com.tencent.p014mm.plugin.sns.p106ui.MaskImageView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.TagImageView;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95911b;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95917e;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95933n;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95944p;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.sheet.SnsGroupDialog;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.LinkedList;
import jp2.C98963o;
import k20.C9556a;
import kt2.C99208a;
import kt2.C99209b;
import kt2.C99210c;
import kt2.C99214d;
import kt2.C99218e;
import kt2.C99221f;
import kt2.C99224g;
import kt2.C99229h;
import kt2.C99234i;
import kt2.C99238j;
import lc3.C10485b;
import lq2.C99578a;
import lt2.C99593a;
import lt2.C99594b;
import lt2.C99596c;
import lt2.C99601d;
import lt2.C99606e;
import lt2.C99611f;
import lt2.C99616g;
import lt2.C99619h;
import lt2.C99623i;
import lt2.C99627j;
import lt2.C99632k;
import lt2.C99637l;
import lt2.C99642m;
import nq2.C100151a;
import nt2.C100165c;
import nt2.C100167e;
import nt2.C100173h;
import nt2.C100177j;
import nt2.C100180k;
import nt2.C100189m;
import os2.C100416r;
import p214om.C11502f;
import p749xh.C102646h;
import p763ym.C79138l;
import ps2.C100894u;
import rq2.C101425k;
import te3.C101779g1;
import te3.C101799k1;
import te3.C101804kv2;
import up2.C102062c;
import up2.C102064e;
import vr2.C102236a0;
import vr2.C102260r;
import wc3.C102431y;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener */
public abstract class TimelineClickListener {

    /* renamed from: A */
    public C96049p0 f280345A;

    /* renamed from: B */
    public C96049p0 f280346B;

    /* renamed from: C */
    public C96049p0 f280347C;

    /* renamed from: D */
    public C96049p0 f280348D;

    /* renamed from: E */
    public C96049p0 f280349E;

    /* renamed from: F */
    public C96049p0 f280350F;

    /* renamed from: G */
    public View.OnClickListener f280351G;

    /* renamed from: H */
    public View.OnClickListener f280352H;

    /* renamed from: I */
    public View.OnClickListener f280353I;

    /* renamed from: J */
    public View.OnClickListener f280354J;

    /* renamed from: K */
    public View.OnClickListener f280355K;

    /* renamed from: L */
    public View.OnClickListener f280356L;

    /* renamed from: M */
    public View.OnClickListener f280357M;

    /* renamed from: N */
    public View.OnClickListener f280358N;

    /* renamed from: O */
    public View.OnClickListener f280359O;

    /* renamed from: P */
    public View.OnClickListener f280360P;

    /* renamed from: Q */
    public AdapterView.OnItemClickListener f280361Q;

    /* renamed from: R */
    public AdapterView.OnItemClickListener f280362R;

    /* renamed from: S */
    public View.OnClickListener f280363S = new TimelineClickListener$$c(this);

    /* renamed from: T */
    public View.OnClickListener f280364T = new TimelineClickListener$$d(this);

    /* renamed from: U */
    public View.OnClickListener f280365U;

    /* renamed from: V */
    public SnsTimeLineBaseAdapter.C95633j f280366V;

    /* renamed from: W */
    public int f280367W;

    /* renamed from: X */
    public IListener<TimelinePlayClickAnimEvent> f280368X;

    /* renamed from: Y */
    public IListener<TimelinePlayBackAnimEvent> f280369Y;

    /* renamed from: Z */
    public View.OnClickListener f280370Z;

    /* renamed from: a */
    public int f280371a = 0;

    /* renamed from: b */
    public Activity f280372b;

    /* renamed from: c */
    public C94851d1 f280373c;

    /* renamed from: d */
    public volatile C99594b f280374d;

    /* renamed from: e */
    public volatile C99593a f280375e;

    /* renamed from: f */
    public volatile C99209b f280376f;

    /* renamed from: g */
    public volatile C99208a f280377g;

    /* renamed from: h */
    public C98963o f280378h;

    /* renamed from: i */
    public SnsGroupDialog f280379i;

    /* renamed from: j */
    public C102064e f280380j;

    /* renamed from: k */
    public C96014c f280381k;

    /* renamed from: l */
    public View.OnClickListener f280382l;

    /* renamed from: m */
    public View.OnLongClickListener f280383m;

    /* renamed from: n */
    public C96049p0 f280384n;

    /* renamed from: o */
    public View.OnClickListener f280385o;

    /* renamed from: p */
    public View.OnClickListener f280386p;

    /* renamed from: q */
    public View.OnClickListener f280387q;

    /* renamed from: r */
    public View.OnClickListener f280388r;

    /* renamed from: s */
    public View.OnClickListener f280389s;

    /* renamed from: t */
    public View.OnClickListener f280390t;

    /* renamed from: u */
    public View.OnClickListener f280391u;

    /* renamed from: v */
    public View.OnClickListener f280392v;

    /* renamed from: w */
    public View.OnClickListener f280393w;

    /* renamed from: x */
    public C96049p0 f280394x;

    /* renamed from: y */
    public C96049p0 f280395y;

    /* renamed from: z */
    public C96049p0 f280396z;

    public TimelineClickListener(int i, Activity activity, C94851d1 d1Var) {
        C40008f fVar = C40008f.f107254d;
        this.f280368X = new IListener<TimelinePlayClickAnimEvent>(fVar) {
            {
                this.__eventId = 730732294;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
                TimelinePlayClickAnimEvent timelinePlayClickAnimEvent = (TimelinePlayClickAnimEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
                Log.m105924i("MicroMsg.TimelineClickListener", "receive timeline play click anim event");
                TimelineClickListener timelineClickListener = TimelineClickListener.this;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                C99594b bVar = timelineClickListener.f280374d;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                boolean z = true;
                if (bVar != null) {
                    MMHandlerThread.postToMainThread(new C96054v(this, timelinePlayClickAnimEvent.f265241d.f265242a));
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
                } else {
                    TimelineClickListener timelineClickListener2 = TimelineClickListener.this;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    C99209b bVar2 = timelineClickListener2.f280376f;
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    if (bVar2 != null) {
                        MMHandlerThread.postToMainThread(new C96056w(this, timelinePlayClickAnimEvent.f265241d.f265242a));
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
                    } else {
                        z = false;
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$3");
                return z;
            }
        };
        this.f280369Y = new IListener<TimelinePlayBackAnimEvent>(fVar) {
            {
                this.__eventId = -548976483;
            }

            public boolean callback(IEvent iEvent) {
                boolean z;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
                TimelinePlayBackAnimEvent timelinePlayBackAnimEvent = (TimelinePlayBackAnimEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
                Log.m105924i("MicroMsg.TimelineClickListener", "receive timeline back anim event");
                if (TimelineClickListener.m122987i(TimelineClickListener.this) != null) {
                    MMHandlerThread.postToMainThread(new C96028g0(this, timelinePlayBackAnimEvent.f265239d.f265240a));
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
                } else {
                    TimelineClickListener timelineClickListener = TimelineClickListener.this;
                    SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    C99208a aVar = timelineClickListener.f280377g;
                    SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    if (aVar != null) {
                        MMHandlerThread.postToMainThread(new C96031h0(this, timelinePlayBackAnimEvent.f265239d.f265240a));
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
                    } else {
                        z = false;
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
                        return z;
                    }
                }
                z = true;
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$4");
                return z;
            }
        };
        this.f280370Z = new TimelineClickListener$$e(this);
        this.f280371a = i;
        this.f280372b = activity;
        this.f280373c = d1Var;
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        int i2 = Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SnsPOICommentFeedNewUrlSwitch"), 0);
        this.f280367W = i2;
        Log.m105925i("MicroMsg.TimelineClickListener", "init POIComment_FeedNewUrl_Switch:%d", Integer.valueOf(i2));
        this.f280381k = new C96014c(this.f280372b, this.f280371a, this.f280373c);
        this.f280392v = new C96037k0(this);
        this.f280352H = new C96039l0(this);
        this.f280356L = new C96044m0(this);
        this.f280357M = new C96046n0(this);
        this.f280382l = new C96048o0(this);
        this.f280383m = new C96019d(this);
        this.f280384n = new C96024e(this);
        new C96026f(this);
        this.f280347C = new C96027g(this);
        this.f280396z = new C96030h(this);
        this.f280349E = new C96033i(this);
        this.f280395y = new C96035j(this);
        this.f280346B = new C96036k(this);
        this.f280385o = new C96038l(this);
        this.f280386p = new C96041m(this);
        this.f280387q = new C96045n(this);
        this.f280393w = new C96047o(this);
        this.f280388r = new C43127p(this);
        this.f280389s = new C43128q(this);
        this.f280390t = new C96050r(this);
        this.f280391u = new TimelineClickListener$$a(this);
        this.f280394x = new C96051s(this);
        this.f280351G = new C96052t(this);
        this.f280354J = new C96053u(this);
        this.f280353I = new C96058x(this);
        this.f280345A = new C96060y(this);
        this.f280355K = new C96061z(this);
        this.f280361Q = new C96012a0(this);
        this.f280362R = new C96013b0(this);
        this.f280365U = new C96018c0(this);
        this.f280350F = new C96023d0(this);
        this.f280348D = new C96025e0(this);
        this.f280358N = new C43125f0(this);
        this.f280359O = new C96034i0(this);
        this.f280360P = new C43126j0(this);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: D */
    public static void m122978D(Context context, TimeLineObject timeLineObject) {
        C101799k1 k1Var;
        TimeLineObject timeLineObject2 = timeLineObject;
        Class cls = C11502f.class;
        SnsMethodCalculate.markStartTimeMs("reportGameVideo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (!(timeLineObject2 == null || (k1Var = timeLineObject2.actionInfo) == null || k1Var.f298580j == null || !((C79138l) C86312j.m106911c(C79138l.class)).mo74006a3(timeLineObject2.actionInfo.f298580j.f298271d))) {
            C101799k1 k1Var2 = timeLineObject2.actionInfo;
            String CP = ((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93137CP(k1Var2.f298580j.f298271d, false);
            C102431y Sr = ((C11502f) C86312j.m106911c(cls)).mo11461Sr();
            C101779g1 g1Var = k1Var2.f298580j;
            Sr.mo93162s5(context, g1Var.f298271d, CP, timeLineObject2.UserName, 38, 19, 10, g1Var.f298272e, 0, timeLineObject2.f283893Id);
        }
        SnsMethodCalculate.markEndTimeMs("reportGameVideo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: a */
    public static SnsInfo m122979a(TimelineClickListener timelineClickListener, View view) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("getSnsInfoFromTag", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        SnsInfo snsInfo = null;
        if (view.getTag() instanceof C96235u4) {
            snsInfo = C100416r.m131409b(((C96235u4) view.getTag()).f281206a);
        } else if (view.getTag() instanceof MaskImageView) {
            MaskImageView maskImageView = (MaskImageView) view.getTag();
            if (maskImageView.getTag() instanceof C96235u4) {
                snsInfo = C100416r.m131409b(((C96235u4) maskImageView.getTag()).f281206a);
            }
        } else if (view.getTag() instanceof C96066m2) {
            snsInfo = C94866e1.Yx0().mo139798DN(((C96066m2) view.getTag()).f280499b);
        } else if (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder) {
            snsInfo = C100416r.m131408a(((BaseTimeLineItem.BaseViewHolder) view.getTag()).f279950d);
        } else if (view.getTag() instanceof C100165c) {
            snsInfo = ((C100165c) view.getTag()).f293412e;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsInfoFromTag", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return snsInfo;
    }

    /* renamed from: b */
    public static void m122980b(TimelineClickListener timelineClickListener, View view, SnsInfo snsInfo, int i, String str, boolean z) {
        TimelineClickListener timelineClickListener2 = timelineClickListener;
        SnsInfo snsInfo2 = snsInfo;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C96066m2 m2Var = view.getTag() instanceof C96066m2 ? (C96066m2) view.getTag() : null;
        if (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder) {
            m2Var = ((BaseTimeLineItem.BaseViewHolder) view.getTag()).f279953e0;
        }
        if (view.getTag() instanceof C100165c) {
            m2Var = ((C100165c) view.getTag()).f293415h;
        }
        if (snsInfo2 == null || m2Var == null) {
            SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            if (C96085n8.m123089H(timelineClickListener2.f280373c)) {
                timelineClickListener2.f280373c.mo130970a().mo131335v(snsInfo2);
            }
            boolean isAd = snsInfo.isAd();
            TimeLineObject timeLine = snsInfo.getTimeLine();
            LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
            if (linkedList == null || linkedList.size() == 0) {
                Log.m105920e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
                SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            } else {
                boolean z2 = false;
                C101804kv2 kv22 = timeLine.ContentObj.f298427h.get(0);
                if (isAd && !C94866e1.Fx0().mo131141x(kv22)) {
                    C115669n.INSTANCE.mo175911u(1910, 4);
                }
                if (C54550e.m61296a(snsInfo)) {
                    SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new SnsAdLivingStreamJumpEvent();
                    snsAdLivingStreamJumpEvent.f154872d.f154873a = C102236a0.m134728W(snsInfo);
                    snsAdLivingStreamJumpEvent.publish();
                }
                if (!(snsInfo.isAd() && snsInfo.getAdXml().isLandingPagesAd() && C100894u.m132239s(str)) && isAd && C94866e1.Fx0().mo131143z(kv22)) {
                    C94866e1.Fx0().mo131122i0(kv22);
                    m2Var.f280506i.setVisibility(8);
                    m2Var.f280507j.setVisibility(8);
                    C115669n.INSTANCE.mo175911u(1910, 7);
                }
                int[] iArr = new int[2];
                m2Var.f280505h.getLocationInWindow(iArr);
                int width = m2Var.f280505h.getWidth();
                int height = m2Var.f280505h.getHeight();
                if (C102260r.m134836E(timelineClickListener2.f280372b, snsInfo, timelineClickListener2.mo133545n(snsInfo2), timelineClickListener2.f280371a, timelineClickListener2.f280378h, i, 0)) {
                    SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                } else {
                    if (i != 1001 ? !(!snsInfo.isAd() || !C100894u.m132242v(snsInfo.getAdXml(), str2)) : !(!snsInfo.isAd() || !C100894u.m132241u(snsInfo.getAdXml(), str2))) {
                        z2 = true;
                    }
                    if (z2) {
                        timelineClickListener.mo133542F(view, snsInfo, i, str, z, 1, iArr, width, height);
                    } else {
                        timelineClickListener.mo133541E(view, snsInfo, i);
                    }
                    SnsMethodCalculate.markEndTimeMs("cardSelectSightCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: c */
    public static void m122981c(TimelineClickListener timelineClickListener, Intent intent, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (timelineClickListener.f280378h == null || intent == null || snsInfo == null) {
            Log.m105920e("MicroMsg.TimelineClickListener", "snsAdStatistic or intent or info is null");
            SnsMethodCalculate.markEndTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            if (SnsTimeLineBaseAdapter.m122254p(snsInfo) != 9 && SnsTimeLineBaseAdapter.m122254p(snsInfo) != 19) {
                Log.m105924i("MicroMsg.TimelineClickListener", "viewType is not TYPE_SIGHT and is not TYPE_AD_SIGHT");
            } else if (snsInfo.getAdXml().adVideoContinuePlay) {
                long l = timelineClickListener.f280378h.mo138305l(snsInfo.field_snsId);
                Log.m105924i("MicroMsg.TimelineClickListener", "snsId = " + snsInfo.field_snsId + ", adSightVideoSeekTime = " + l);
                intent.putExtra("sns_landing_page_sight_video_seek_time", l);
            }
            SnsMethodCalculate.markEndTimeMs("createContinuePlayIntent", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: d */
    public static boolean m122982d(TimelineClickListener timelineClickListener, ADInfo aDInfo, SnsInfo snsInfo, boolean z) {
        boolean z2;
        String str;
        String str2;
        ADInfo.C95009b bVar;
        SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (aDInfo == null) {
            z2 = false;
            SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            String str3 = "";
            if (z && snsInfo.getAdXml().adTurnInfo.f275718b != null) {
                str3 = snsInfo.getAdXml().adTurnInfo.f275718b;
                str2 = snsInfo.getAdXml().adTurnInfo.f275719c;
                str = snsInfo.getAdXml().adTurnInfo.f275720d;
            } else if (z || aDInfo.adActionType != 4 || (bVar = aDInfo.actionExtWeApp) == null) {
                str2 = str3;
                str = str2;
            } else {
                str3 = bVar.f275645a;
                String str4 = bVar.f275646b;
                str = bVar.f275647c;
                str2 = str4;
            }
            z2 = m122991o(str3, str2, str, snsInfo, timelineClickListener.f280371a);
            SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return z2;
    }

    /* renamed from: e */
    public static /* synthetic */ C94851d1 m122983e(TimelineClickListener timelineClickListener) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C94851d1 d1Var = timelineClickListener.f280373c;
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return d1Var;
    }

    /* renamed from: f */
    public static void m122984f(TimelineClickListener timelineClickListener, View view, SnsInfo snsInfo, ADInfo aDInfo, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            Log.m105920e("MicroMsg.TimelineClickListener", "snsInfo is null");
            SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else if (aDInfo == null) {
            Log.m105920e("MicroMsg.TimelineClickListener", "adInfo is null");
            SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else if (C101425k.m133097a(aDInfo.adClickActionInfoList)) {
            Log.m105920e("MicroMsg.TimelineClickListener", "adClickActionInfoList is null");
            SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            try {
                AdClickActionInfo adClickActionInfo = aDInfo.adClickActionInfoList.get(i);
                if (adClickActionInfo != null) {
                    C102064e eVar = timelineClickListener.f280380j;
                    if (eVar != null) {
                        adClickActionInfo.f273639a = i2;
                        eVar.mo141561j(new C102062c(adClickActionInfo, snsInfo, i, timelineClickListener.f280373c));
                        timelineClickListener.f280380j.mo141556e(view);
                        SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    }
                }
                Log.m105920e("MicroMsg.TimelineClickListener", "adClickActionInfo or adClickActionHandler is null");
                SnsMethodCalculate.markEndTimeMs("clickActionIndexJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            } catch (Throwable th) {
                Log.m105920e("MicroMsg.TimelineClickListener", th.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: g */
    public static /* synthetic */ SnsTimeLineBaseAdapter.C95633j m122985g(TimelineClickListener timelineClickListener) {
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        SnsTimeLineBaseAdapter.C95633j jVar = timelineClickListener.f280366V;
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return jVar;
    }

    /* renamed from: h */
    public static void m122986h(TimelineClickListener timelineClickListener, View view, SnsInfo snsInfo, int i, String str, boolean z) {
        View view2;
        TimelineClickListener timelineClickListener2 = timelineClickListener;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("cardSelectPicCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        boolean z2 = false;
        if (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder) {
            BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
            view2 = baseViewHolder instanceof C95911b.C95915d ? ((C95911b.C95915d) baseViewHolder).f280037I0 : baseViewHolder.f279936S.mo132426b(0);
        } else {
            view2 = view.getTag() instanceof MaskImageView ? (MaskImageView) view.getTag() : view.getTag() instanceof C100167e ? ((C100167e) view.getTag()).f293453w : (TagImageView) view;
        }
        if (C102260r.m134836E(timelineClickListener2.f280372b, snsInfo, timelineClickListener2.mo133545n(snsInfo), timelineClickListener2.f280371a, timelineClickListener2.f280378h, i, 0)) {
            SnsMethodCalculate.markEndTimeMs("cardSelectPicCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            if (i != 1001 ? !(!snsInfo.isAd() || !C100894u.m132242v(snsInfo.getAdXml(), str2)) : !(!snsInfo.isAd() || !C100894u.m132241u(snsInfo.getAdXml(), str2))) {
                z2 = true;
            }
            if (z2) {
                int[] iArr = new int[2];
                if (C85875k4.m106208w()) {
                    view2.getLocationOnScreen(iArr);
                } else {
                    view2.getLocationInWindow(iArr);
                }
                timelineClickListener.mo133542F(view, snsInfo, i, str, z, 2, iArr, view2.getWidth(), view2.getHeight());
            } else {
                timelineClickListener.mo133541E(view, snsInfo, i);
            }
            SnsMethodCalculate.markEndTimeMs("cardSelectPicCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: i */
    public static /* synthetic */ C99593a m122987i(TimelineClickListener timelineClickListener) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        C99593a aVar = timelineClickListener.f280375e;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return aVar;
    }

    /* renamed from: j */
    public static /* synthetic */ Activity m122988j(TimelineClickListener timelineClickListener) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        Activity activity = timelineClickListener.f280372b;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return activity;
    }

    /* renamed from: k */
    public static /* synthetic */ int m122989k(TimelineClickListener timelineClickListener) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        int i = timelineClickListener.f280371a;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return i;
    }

    /* renamed from: l */
    public static /* synthetic */ ADInfo m122990l(TimelineClickListener timelineClickListener, SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        ADInfo n = timelineClickListener.mo133545n(snsInfo);
        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return n;
    }

    /* renamed from: o */
    public static boolean m122991o(String str, String str2, String str3, SnsInfo snsInfo, int i) {
        int i2 = i;
        SnsMethodCalculate.markStartTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        try {
            if (!Util.isNullOrNil(str)) {
                ADInfo atAdInfo = i2 == 2 ? snsInfo.getAtAdInfo() : snsInfo.getAdInfo();
                if (atAdInfo == null) {
                    Log.m105920e("MicroMsg.TimelineClickListener", "jumpWeApp adInfo==null");
                    SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                    return false;
                }
                C102236a0.m134761o0(str, C102260r.m134860b(str2, atAdInfo.addClickTimeToWeAppPath), str3, snsInfo.getAid(), snsInfo.getTraceid(), C102236a0.m134765q0(snsInfo.field_snsId) + XVFSFile.PATH_SEPARATOR + atAdInfo.uxInfo + XVFSFile.PATH_SEPARATOR + C94866e1.Mx0() + XVFSFile.PATH_SEPARATOR + System.currentTimeMillis(), atAdInfo.uxInfo, i2 == 0 ? 1045 : 1046);
                SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
                return true;
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.TimelineClickListener", "jumpWeApp exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("jumpWeApp", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        return false;
    }

    /* renamed from: A */
    public void mo133538A(C100165c cVar) {
        SnsMethodCalculate.markStartTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        SnsMethodCalculate.markStartTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (this.f280376f != null) {
            Log.m105928w("MicroMsg.TimelineClickListener", "has already prepare detail click animation");
            SnsMethodCalculate.markEndTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            if (cVar instanceof C100167e) {
                this.f280376f = new C99214d((MMActivity) this.f280372b, cVar);
                this.f280377g = new C99210c((MMActivity) this.f280372b, cVar);
            } else if (cVar instanceof C100173h) {
                C100173h hVar = (C100173h) cVar;
                hVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getWrapViewHolder", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                C100151a.C100155d dVar = hVar.f293468s;
                SnsMethodCalculate.markEndTimeMs("getWrapViewHolder", "com.tencent.mm.plugin.sns.ui.detail.item.FullCardAdDetailItemNew");
                mo133539B(dVar, (Bundle) null);
            } else if (cVar instanceof C100189m) {
                this.f280376f = new C99238j((MMActivity) this.f280372b, cVar);
                this.f280377g = new C99234i((MMActivity) this.f280372b, cVar);
            } else if (cVar instanceof C100180k) {
                this.f280376f = new C99229h((MMActivity) this.f280372b, cVar);
                this.f280377g = new C99224g((MMActivity) this.f280372b, cVar);
            } else if (cVar instanceof C100177j) {
                this.f280376f = new C99221f((MMActivity) this.f280372b, cVar);
                this.f280377g = new C99218e((MMActivity) this.f280372b, cVar);
            }
            SnsMethodCalculate.markEndTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        SnsMethodCalculate.markEndTimeMs("prepareDetailClickAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: B */
    public void mo133539B(C100151a.C100155d dVar, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        SnsMethodCalculate.markStartTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (this.f280374d != null) {
            Log.m105928w("MicroMsg.TimelineClickListener", "preapre FullCardAnim, timelineClickAnimation!=null");
            SnsMethodCalculate.markEndTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        boolean z4 = false;
        if (bundle != null) {
            z3 = bundle.getBoolean("ad_no_click_anim", false);
            z2 = bundle.getBoolean("ad_no_back_anim", false);
            boolean z5 = bundle.getBoolean("isSimpleTwistAnim", false);
            z = bundle.getBoolean("isTwistClockwise", false);
            z4 = z5;
        } else {
            z = false;
            z3 = false;
            z2 = false;
        }
        if (z4) {
            this.f280374d = new C99616g((MMActivity) this.f280372b, dVar, z);
        } else if (!z3) {
            this.f280374d = new C99611f((MMActivity) this.f280372b, dVar);
        }
        if (!z2) {
            this.f280375e = new C99606e((MMActivity) this.f280372b, dVar);
        }
        dVar.f293355K.f293341b = true;
        SnsMethodCalculate.markEndTimeMs("prepareFullCardAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: C */
    public void mo133540C(BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        SnsMethodCalculate.markStartTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        SnsMethodCalculate.markStartTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (this.f280374d != null) {
            Log.m105928w("MicroMsg.TimelineClickListener", "has already prepare click animation");
            SnsMethodCalculate.markEndTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            if (baseViewHolder instanceof C95911b.C95915d) {
                this.f280374d = new C99601d((MMActivity) this.f280372b, baseViewHolder);
                this.f280375e = new C99596c((MMActivity) this.f280372b, baseViewHolder);
                ((C95911b.C95915d) baseViewHolder).f280052X0 = true;
            } else if (baseViewHolder instanceof C95917e.C95922e) {
                mo133539B(((C95917e.C95922e) baseViewHolder).f280077F0, (Bundle) null);
            } else if (baseViewHolder instanceof C95944p.C95951g) {
                this.f280374d = new C99642m((MMActivity) this.f280372b, baseViewHolder);
                this.f280375e = new C99637l((MMActivity) this.f280372b, baseViewHolder);
            } else if (baseViewHolder instanceof C95933n.C95941e) {
                this.f280374d = new C99632k((MMActivity) this.f280372b, baseViewHolder);
                this.f280375e = new C99627j((MMActivity) this.f280372b, baseViewHolder);
            } else if (baseViewHolder instanceof C99578a.C99582d) {
                this.f280374d = new C99623i((MMActivity) this.f280372b, baseViewHolder);
                this.f280375e = new C99619h((MMActivity) this.f280372b, baseViewHolder);
            }
            SnsMethodCalculate.markEndTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        }
        SnsMethodCalculate.markEndTimeMs("prepareTimelineAnimation", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: E */
    public final void mo133541E(View view, SnsInfo snsInfo, int i) {
        C102064e eVar;
        SnsMethodCalculate.markStartTimeMs("selectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            Log.m105920e("MicroMsg.TimelineClickListener", "snsInfo is null");
            SnsMethodCalculate.markEndTimeMs("selectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        ADXml.C95021h adSelectInfo = snsInfo.getAdXml().getAdSelectInfo();
        if (adSelectInfo == null || (eVar = this.f280380j) == null) {
            Log.m105920e("MicroMsg.TimelineClickListener", "adSelectInfo or adClickActionHandler is null");
            SnsMethodCalculate.markEndTimeMs("selectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return;
        }
        AdClickActionInfo adClickActionInfo = null;
        if (i == 1001) {
            adClickActionInfo = adSelectInfo.f275707c;
        } else if (i == 1002) {
            adClickActionInfo = adSelectInfo.f275708d;
        }
        if (adClickActionInfo != null) {
            eVar.mo141559h(adClickActionInfo, snsInfo);
            this.f280380j.mo141556e(view);
        }
        SnsMethodCalculate.markEndTimeMs("selectCardActionJump", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: F */
    public final void mo133542F(View view, SnsInfo snsInfo, int i, String str, boolean z, int i2, int[] iArr, int i3, int i4) {
        SnsInfo snsInfo2 = snsInfo;
        int i5 = i2;
        SnsMethodCalculate.markStartTimeMs("selectCardBtnJumpCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        try {
            if (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder) {
                mo133540C((BaseTimeLineItem.BaseViewHolder) view.getTag());
            } else if (view.getTag() instanceof C100165c) {
                mo133538A((C100165c) view.getTag());
            }
            String a = C100894u.m132221a(snsInfo);
            if (!Util.isNullOrNil(a)) {
                snsInfo.getAdSnsInfo().field_adxml = a;
            }
            int i6 = this.f280371a;
            SnsAdClick snsAdClick = new SnsAdClick(i6, i6 == 0 ? 1 : 2, snsInfo2.field_snsId, i, z ? 22 : 21);
            C102260r.m134864d(snsAdClick, this.f280378h, snsInfo2, i);
            C102236a0.m134773u0(snsAdClick);
            Intent intent = new Intent();
            intent.putExtra("img_gallery_left", iArr[0]);
            intent.putExtra("img_gallery_top", iArr[1]);
            intent.putExtra("img_gallery_width", i3);
            intent.putExtra("img_gallery_height", i4);
            intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
            intent.putExtra("sns_landing_pages_rawSnsId", snsInfo.getTimeLine().f283893Id);
            intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
            if (i5 == 2) {
                intent.putExtra("sns_landing_pages_aid", snsInfo.getAid());
                intent.putExtra("sns_landing_pages_traceid", snsInfo.getTraceid());
            } else if (i5 == 1) {
                intent.putExtra("sns_landing_is_native_sight_ad", true);
            }
            TimeLineObject timeLine = snsInfo.getTimeLine();
            if (timeLine != null) {
                LinkedList<C101804kv2> linkedList = timeLine.ContentObj.f298427h;
                if (linkedList.size() > 0) {
                    intent.putExtra("sns_landing_pages_share_thumb_url", linkedList.get(0).f298694i);
                }
            }
            intent.setClass(this.f280372b, SnsAdNativeLandingPagesUI.class);
            int i7 = this.f280371a;
            intent.putExtra("sns_landig_pages_from_source", i7 == 2 ? 16 : i7 == 1 ? 2 : 1);
            intent.putExtra("sns_landing_pages_xml", str);
            intent.putExtra("sns_landing_pages_rec_src", snsInfo.getAdRecSrc());
            intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
            intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
            intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
            Activity activity = this.f280372b;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "selectCardBtnJumpCanvas", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;ILjava/lang/String;ZI[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "selectCardBtnJumpCanvas", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;ILjava/lang/String;ZI[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            this.f280372b.overridePendingTransition(0, 0);
            if (i5 == 2 && C96085n8.m123089H(this.f280373c)) {
                this.f280373c.mo130970a().mo131335v(snsInfo2);
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.TimelineClickListener", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("selectCardBtnJumpCanvas", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: G */
    public void mo133543G(C98963o oVar) {
        SnsMethodCalculate.markStartTimeMs("setSnsAdStatic", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f280378h = oVar;
        C96014c cVar = this.f280381k;
        if (cVar != null) {
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setSnsAdStatic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            cVar.f280413o = oVar;
            SnsMethodCalculate.markEndTimeMs("setSnsAdStatic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        }
        SnsMethodCalculate.markStartTimeMs("initActionHandler", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f280380j = new C102064e(this.f280372b, this.f280371a, this.f280378h, (C102064e.C102068b) null, (C102064e.C102069c) null);
        SnsMethodCalculate.markEndTimeMs("initActionHandler", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        SnsMethodCalculate.markEndTimeMs("setSnsAdStatic", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: m */
    public void mo133544m(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (this.f280371a == 0) {
            C102236a0.m134732a(intent, 81);
        } else {
            C102236a0.m134732a(intent, 82);
        }
        SnsMethodCalculate.markEndTimeMs("appendAdGetA8KeySceneExtra", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
    }

    /* renamed from: n */
    public final ADInfo mo133545n(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return null;
        } else if (this.f280371a == 2) {
            ADInfo atAdInfo = snsInfo.getAtAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return atAdInfo;
        } else {
            ADInfo adInfo = snsInfo.getAdInfo();
            SnsMethodCalculate.markEndTimeMs("getAdInfo", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            return adInfo;
        }
    }

    /* renamed from: p */
    public abstract void mo132095p(View view);

    /* renamed from: q */
    public abstract void mo132096q(View view);

    /* renamed from: r */
    public abstract void mo132097r(View view);

    /* renamed from: s */
    public abstract void mo132098s();

    /* renamed from: t */
    public abstract void mo132099t(View view);

    /* renamed from: u */
    public abstract void mo132100u(View view);

    /* renamed from: v */
    public abstract void mo132101v(Object obj);

    /* renamed from: w */
    public abstract void mo132102w(View view);

    /* renamed from: x */
    public abstract void mo132103x(View view);

    /* renamed from: y */
    public abstract void mo132104y(View view);

    /* renamed from: z */
    public abstract void mo132105z(View view);
}
