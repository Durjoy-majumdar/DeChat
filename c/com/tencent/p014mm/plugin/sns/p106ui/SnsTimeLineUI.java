package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.ActionBar;
import bd2.C79690d;
import bv2.C92312b;
import bv2.C92313c;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.ActiveStatusChangedForDataReportEvent;
import com.tencent.p014mm.autogen.events.CheckSnsAutoPlayEvent;
import com.tencent.p014mm.autogen.events.ConfigurationChangedEvent;
import com.tencent.p014mm.autogen.events.GalleryPhotoInfoEvent;
import com.tencent.p014mm.autogen.events.NewNotificationEvent;
import com.tencent.p014mm.autogen.events.NotifyExposeAdEvent;
import com.tencent.p014mm.autogen.events.NotifyTimelineFpEvent;
import com.tencent.p014mm.autogen.events.NotifyTimelineListEvent;
import com.tencent.p014mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsExposeItemNotifyEvent;
import com.tencent.p014mm.autogen.events.SnsFavFeedForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToChatRoomForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToSingleChatForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsForwardFeedToSnsForDataReportEvent;
import com.tencent.p014mm.autogen.events.SnsLuckyPayNotifyEvent;
import com.tencent.p014mm.autogen.events.SnsPermissionNotifyEvent;
import com.tencent.p014mm.autogen.events.SnsRetryEditTipExpiredEvent;
import com.tencent.p014mm.autogen.events.SnsShowStoryHeadViewEvent;
import com.tencent.p014mm.autogen.events.SnsTimelineUIStatusEvent;
import com.tencent.p014mm.autogen.events.SnsUploadPostDoneEvent;
import com.tencent.p014mm.autogen.events.UpdateSnsHeaderNotiftyListEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SecondCutShareSnsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsEditDraftStruct;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.component.api.jumper.UICustomParam;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.QFadeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1795c0;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager;
import com.tencent.p014mm.plugin.sns.abtest.SellerABTestManager;
import com.tencent.p014mm.plugin.sns.model.C94847c1;
import com.tencent.p014mm.plugin.sns.model.C94850d0;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.model.C94885j2;
import com.tencent.p014mm.plugin.sns.model.C94886k0;
import com.tencent.p014mm.plugin.sns.model.C94891k2;
import com.tencent.p014mm.plugin.sns.model.C94892l2;
import com.tencent.p014mm.plugin.sns.model.C94895m2;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94916o0;
import com.tencent.p014mm.plugin.sns.model.C94921o2;
import com.tencent.p014mm.plugin.sns.model.C94955u2;
import com.tencent.p014mm.plugin.sns.model.C94969x1;
import com.tencent.p014mm.plugin.sns.model.C94970y;
import com.tencent.p014mm.plugin.sns.model.C94974y1;
import com.tencent.p014mm.plugin.sns.model.C94979z1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUIAction;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.item.C95929m;
import com.tencent.p014mm.plugin.sns.p106ui.item.improve.click.TimelineItemClickEventCenter;
import com.tencent.p014mm.plugin.sns.p106ui.listener.C96014c;
import com.tencent.p014mm.plugin.sns.p106ui.listener.TimelineClickListener;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsJankActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.statistics.C94988a;
import com.tencent.p014mm.plugin.sns.statistics.C94992f;
import com.tencent.p014mm.plugin.sns.statistics.C95006y;
import com.tencent.p014mm.plugin.sns.statistics.SnsBrowseInfoHelper;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.ScreenShotUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vending.base.Vending;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.util.FrequentLimiter;
import com.tencent.xweb.util.MD5;
import d62.C75339i;
import di3.C86312j;
import dm2.C45420d;
import ds2.C31280k;
import ds2.C97535h;
import ds2.C97540j;
import eb0.C31543z5;
import eb0.C75592q0;
import eb0.C97624e3;
import ep3.C97683a;
import ex0.C45696d;
import f40.C86709a0;
import f40.C86737h0;
import f62.C75700k0;
import fs2.C32163a;
import ft2.C97979c;
import fy3.C32224a;
import gt2.C98211b;
import gt2.C98212c;
import gv2.C98241o;
import gv2.C98242p;
import gv2.C98249r;
import gy3.C87412m;
import h81.C32735h;
import h81.C59774i;
import hi2.C46072b;
import ht1.C60168f2;
import ht1.C60200t1;
import ht1.C98519c2;
import ht2.C98524a;
import ht2.C98525b;
import ht2.C98527d;
import in3.C87771d;
import in3.C87773e;
import ir2.C98784a;
import iv2.C33418b;
import iv2.C33419c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import jp2.C98963o;
import jr2.C76440q;
import jr2.C99014h;
import js2.C99020a;
import js2.C99021b;
import jv2.C99056a;
import jv2.C99059b;
import jv2.C99063c;
import jv2.C99064d;
import k20.C9556a;
import ks2.C99181f;
import ks2.C99198r;
import ks2.C99204x;
import l31.C61212e;
import l40.C99336c;
import lp3.C88633e;
import lp3.C88643g;
import mp3.C88817b;
import mp3.C88819d;
import ms2.C99967m;
import ms2.C99968n;
import mt2.C47101a;
import nj3.C76879j;
import nq2.C100151a;
import o31.C11345b;
import o31.C76986a;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import os2.C35285a0;
import p1029rf.C89940c;
import p182kk.C61104a;
import p232rw.C77572l;
import p232rw.C77574q;
import p232rw.C77575r;
import p447aw.C103918d;
import p640ox.C77049b;
import p646pn.C110234e;
import p680ru.C77570i;
import p761yd.C38993b;
import p761yd.C91441c;
import p995kf.C88146a;
import pt2.C100905b;
import pu2.C100930m;
import pu2.C62508a;
import qo3.C77407n;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13604l;
import sf0.C90188n0;
import sp2.C101690c;
import te3.C101783gu2;
import te3.C101789j00;
import te3.m64;
import te3.w64;
import th2.C110992d;
import u73.C101980n;
import vo3.C90852c;
import vr2.C102236a0;
import xt2.C102723a;
import yn2.C102882s0;
import zn2.C16343b;
import zt3.C119157j;

@C86737h0
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI */
public class SnsTimeLineUI extends SnsJankActivity implements C97624e3, C11385n, C96317y0, C76440q.C76441a {

    /* renamed from: T1 */
    public static Boolean f278611T1 = null;

    /* renamed from: U1 */
    public static int f278612U1 = 0;

    /* renamed from: V1 */
    public static int f278613V1 = 2;

    /* renamed from: W1 */
    public static int f278614W1 = 2;

    /* renamed from: X1 */
    public static final Boolean f278615X1 = Boolean.FALSE;

    /* renamed from: A */
    public LinearLayout f278616A;

    /* renamed from: A1 */
    public long f278617A1;

    /* renamed from: B */
    public QFadeImageView f278618B;

    /* renamed from: B1 */
    public boolean f278619B1;

    /* renamed from: C */
    public boolean f278620C;

    /* renamed from: C1 */
    public int f278621C1;

    /* renamed from: D */
    public boolean f278622D;

    /* renamed from: D1 */
    public Runnable f278623D1;

    /* renamed from: E */
    public boolean f278624E;

    /* renamed from: E1 */
    public Runnable f278625E1;

    /* renamed from: F */
    public BaseTimeLine f278626F;

    /* renamed from: F1 */
    public Handler f278627F1;

    /* renamed from: G */
    public int f278628G;

    /* renamed from: G1 */
    public Runnable f278629G1;

    /* renamed from: H */
    public SnsTimeLineUI$$y0 f278630H;

    /* renamed from: H1 */
    public SnsUIAction.C95669n f278631H1;

    /* renamed from: I */
    public TestTimeForSns f278632I;

    /* renamed from: I1 */
    public C97683a.C75650e f278633I1;

    /* renamed from: J */
    public int f278634J;

    /* renamed from: J1 */
    public int f278635J1;

    /* renamed from: K */
    public boolean f278636K;

    /* renamed from: K1 */
    public boolean f278637K1;

    /* renamed from: L */
    public C94988a f278638L;

    /* renamed from: L1 */
    public long f278639L1;

    /* renamed from: M */
    public C98963o f278640M;

    /* renamed from: M1 */
    public long f278641M1;

    /* renamed from: N */
    public C94921o2 f278642N;

    /* renamed from: N1 */
    public long f278643N1;

    /* renamed from: O1 */
    public ScreenShotUtil.ScreenShotCallback f278644O1;

    /* renamed from: P */
    public C94892l2 f278645P;

    /* renamed from: P1 */
    public int f278646P1;

    /* renamed from: Q */
    public int f278647Q;

    /* renamed from: Q0 */
    public volatile boolean f278648Q0;

    /* renamed from: Q1 */
    public MenuItem.OnMenuItemClickListener f278649Q1;

    /* renamed from: R */
    public String f278650R;

    /* renamed from: R0 */
    public int f278651R0;

    /* renamed from: R1 */
    public long f278652R1;

    /* renamed from: S */
    public String f278653S;

    /* renamed from: S0 */
    public int f278654S0;

    /* renamed from: S1 */
    public boolean f278655S1;

    /* renamed from: T */
    public boolean f278656T;

    /* renamed from: T0 */
    public int f278657T0;

    /* renamed from: U */
    public boolean f278658U;

    /* renamed from: U0 */
    public int f278659U0;

    /* renamed from: V */
    public int f278660V;

    /* renamed from: V0 */
    public C77407n f278661V0;

    /* renamed from: W */
    public String f278662W;

    /* renamed from: W0 */
    public boolean f278663W0;

    /* renamed from: X */
    public String f278664X;

    /* renamed from: X0 */
    public volatile int f278665X0;

    /* renamed from: Y */
    public boolean f278666Y;

    /* renamed from: Y0 */
    public C100905b f278667Y0;

    /* renamed from: Z */
    public SnsTimeLineUI$$a1 f278668Z;

    /* renamed from: Z0 */
    public final int f278669Z0;

    /* renamed from: a1 */
    public final long f278670a1;

    /* renamed from: b1 */
    public final long f278671b1;

    /* renamed from: c1 */
    public Runnable f278672c1;

    /* renamed from: d1 */
    public IListener f278673d1;

    /* renamed from: e1 */
    public Vending.C97302l f278674e1;

    /* renamed from: f1 */
    public boolean f278675f1;

    /* renamed from: g1 */
    public boolean f278676g1;

    /* renamed from: h1 */
    public IListener f278677h1;

    /* renamed from: i1 */
    public IListener f278678i1;

    /* renamed from: j1 */
    public IListener f278679j1;

    /* renamed from: k1 */
    public IListener f278680k1;

    /* renamed from: l1 */
    public IListener f278681l1;

    /* renamed from: m1 */
    public IListener f278682m1;
    private ActionBar mActionBar;
    private C87771d.C46280b mStatusBarHeightCallback;
    private SnsUIAction mUIAction;

    /* renamed from: n1 */
    public IListener f278683n1;

    /* renamed from: o1 */
    public IListener f278684o1;

    /* renamed from: p0 */
    public C95741b5 f278685p0;

    /* renamed from: p1 */
    public IListener f278686p1;

    /* renamed from: q1 */
    public IListener f278687q1;

    /* renamed from: r1 */
    public IListener f278688r1;

    /* renamed from: s1 */
    public IListener f278689s1;

    /* renamed from: t1 */
    public IListener f278690t1;

    /* renamed from: u1 */
    public IListener f278691u1;

    /* renamed from: v */
    public C99059b f278692v;

    /* renamed from: v1 */
    public IListener f278693v1;

    /* renamed from: w */
    public C99056a f278694w;

    /* renamed from: w1 */
    public IListener f278695w1;

    /* renamed from: x */
    public C98212c f278696x;

    /* renamed from: x0 */
    public ViewGroup f278697x0;

    /* renamed from: x1 */
    public IListener f278698x1;

    /* renamed from: y */
    public C97979c f278699y;

    /* renamed from: y0 */
    public long f278700y0;

    /* renamed from: y1 */
    public C32224a<C13598b0> f278701y1;

    /* renamed from: z */
    public LinearLayout f278702z;

    /* renamed from: z1 */
    public View f278703z1;

    public SnsTimeLineUI() {
        C99056a aVar;
        Class cls = C32735h.class;
        C99059b bVar = (C99059b) this.f195332d.mo136940b(this, C99059b.class);
        this.f278692v = bVar;
        if (bVar != null) {
            SnsMethodCalculate.markStartTimeMs("originalApi", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi");
            aVar = bVar.f290372a;
            SnsMethodCalculate.markEndTimeMs("originalApi", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi");
        } else {
            aVar = null;
        }
        this.f278694w = aVar;
        this.f278696x = new C98212c();
        this.f278620C = false;
        this.f278622D = false;
        this.f278624E = false;
        this.f278628G = 800;
        this.f278634J = 0;
        this.f278636K = false;
        this.f278638L = new C94988a();
        this.f278640M = new C98963o(0);
        this.f278642N = new C94921o2();
        this.f278645P = new C94892l2();
        this.f278666Y = false;
        this.f278668Z = new SnsTimeLineUI$$a1(this, (SnsTimeLineUI$$d) null);
        this.f278685p0 = new C95741b5();
        this.f278697x0 = null;
        this.f278700y0 = 0;
        this.f278648Q0 = false;
        this.f278651R0 = 0;
        this.f278654S0 = 0;
        this.f278657T0 = 0;
        this.f278659U0 = 2;
        this.f278663W0 = false;
        this.f278669Z0 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32738b.clicfg_sns_ws_un_fold_click_max_count, 2);
        this.f278670a1 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32738b.clicfg_sns_ws_un_fold_click_feed_time_interval, FrequentLimiter.WEEK_MILLS);
        this.f278671b1 = ((C32735h) C86312j.m106911c(cls)).mo58777He(C32735h.C32738b.clicfg_sns_ws_un_fold_time_out, 259200000);
        this.f278672c1 = new SnsTimeLineUI$$d(this);
        C40008f fVar = C40008f.f107254d;
        this.f278673d1 = new IListener<UpdateSnsHeaderNotiftyListEvent>(fVar) {
            {
                this.__eventId = -1783950925;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$2");
                UpdateSnsHeaderNotiftyListEvent updateSnsHeaderNotiftyListEvent = (UpdateSnsHeaderNotiftyListEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$2");
                SnsTimeLineUI.this.mo93528H7().mo136934f(C99064d.class);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$2");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$2");
                return false;
            }
        };
        new IListener<SnsShowStoryHeadViewEvent>(fVar) {
            {
                this.__eventId = 1693113157;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3");
                SnsShowStoryHeadViewEvent snsShowStoryHeadViewEvent = (SnsShowStoryHeadViewEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3");
                if (SnsTimeLineUI.this.getContext() == null || SnsTimeLineUI.this.getContext().isFinishing()) {
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3");
                } else {
                    snsShowStoryHeadViewEvent.f154880d.getClass();
                    ((C88633e) C88643g.m110546d()).mo123064p(new C96007l6(this));
                    SnsTimeLineUI snsTimeLineUI = SnsTimeLineUI.this;
                    Boolean bool = SnsTimeLineUI.f278611T1;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    snsTimeLineUI.mo132960z8(true);
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$3");
                return false;
            }
        };
        this.f278674e1 = new SnsTimeLineUI$$u(this);
        this.f278675f1 = false;
        this.f278676g1 = false;
        this.f278677h1 = new IListener<NotifyTimelineFpEvent>(fVar) {
            {
                this.__eventId = 347136438;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$5");
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$5");
                Log.m105918d("MicroMsg.SnsTimeLineUI", "notifyTimelineFpListener callback");
                if (((NotifyTimelineFpEvent) iEvent) instanceof NotifyTimelineFpEvent) {
                    SnsTimeLineUI snsTimeLineUI = SnsTimeLineUI.this;
                    Boolean bool = SnsTimeLineUI.f278611T1;
                    SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    snsTimeLineUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("checkPermission", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    snsTimeLineUI.f278696x.mo137501a(((SnsTimeLineUI$$p) snsTimeLineUI.f278631H1).getType(), snsTimeLineUI.f278650R, snsTimeLineUI.f278656T, snsTimeLineUI.f278658U, snsTimeLineUI.f278660V);
                    SnsMethodCalculate.markEndTimeMs("checkPermission", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    SnsTimeLineUI.m122282J7(SnsTimeLineUI.this).mo137295j().notifyVendingDataChange();
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$5");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$5");
                return false;
            }
        };
        this.f278678i1 = new IListener<NotifyTimelineListEvent>(fVar) {
            {
                this.__eventId = -895014686;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$6");
                NotifyTimelineListEvent notifyTimelineListEvent = (NotifyTimelineListEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$6");
                SnsTimeLineUI.m122282J7(SnsTimeLineUI.this).mo137295j().notifyVendingDataChange();
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$6");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$6");
                return false;
            }
        };
        this.f278679j1 = new IListener<NewNotificationEvent>(fVar) {
            {
                this.__eventId = -1755589409;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$7");
                NewNotificationEvent newNotificationEvent = (NewNotificationEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$7");
                SnsTimeLineUI snsTimeLineUI = SnsTimeLineUI.this;
                Boolean bool = SnsTimeLineUI.f278611T1;
                SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                snsTimeLineUI.f278675f1 = true;
                SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$7");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$7");
                return false;
            }
        };
        this.f278680k1 = new IListener<NotifyExposeAdEvent>(fVar) {
            {
                this.__eventId = -1860235558;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$8");
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$8");
                SnsTimeLineUI snsTimeLineUI = SnsTimeLineUI.this;
                Boolean bool = SnsTimeLineUI.f278611T1;
                SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                snsTimeLineUI.f278676g1 = true;
                SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                SnsTimeLineUI snsTimeLineUI2 = SnsTimeLineUI.this;
                SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                C94988a aVar = snsTimeLineUI2.f278638L;
                SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                SnsTimeLineUI snsTimeLineUI3 = SnsTimeLineUI.this;
                SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                boolean z = snsTimeLineUI3.f278676g1;
                SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setHasAdShow", "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper");
                SnsMethodCalculate.markEndTimeMs("setHasAdShow", "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper");
                SnsTimeLineUI.m122283K7(SnsTimeLineUI.this, ((NotifyExposeAdEvent) iEvent).f264940d.f264941a);
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$8");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$8");
                return false;
            }
        };
        this.f278681l1 = new IListener<SnsUploadPostDoneEvent>(fVar) {
            {
                this.__eventId = 497662095;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$9");
                SnsUploadPostDoneEvent snsUploadPostDoneEvent = (SnsUploadPostDoneEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$9");
                if (SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) != null) {
                    SnsBrowseInfoHelper a = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                    a.getClass();
                    SnsMethodCalculate.markStartTimeMs("onPostFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    a.f275453g++;
                    SnsMethodCalculate.markEndTimeMs("onPostFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a().mo131331r(false);
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$9");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$9");
                return false;
            }
        };
        this.f278682m1 = new IListener<SnsExposeItemNotifyEvent>(fVar) {
            {
                this.__eventId = 70537970;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$10");
                SnsExposeItemNotifyEvent snsExposeItemNotifyEvent = (SnsExposeItemNotifyEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$10");
                if (SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) != null) {
                    SnsBrowseInfoHelper a = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                    snsExposeItemNotifyEvent.f154875d.getClass();
                    snsExposeItemNotifyEvent.f154875d.getClass();
                    a.getClass();
                    SnsMethodCalculate.markStartTimeMs("onExposeFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    a.f275398H0.add((Object) null);
                    a.f275414P0.add((Object) null);
                    a.f275414P0.size();
                    SnsMethodCalculate.markEndTimeMs("onExposeFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$10");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$10");
                return false;
            }
        };
        this.f278683n1 = new IListener<SnsPermissionNotifyEvent>(fVar) {
            {
                this.__eventId = 26482458;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$11");
                SnsPermissionNotifyEvent snsPermissionNotifyEvent = (SnsPermissionNotifyEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$11");
                if (SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) != null) {
                    if (snsPermissionNotifyEvent.f107766d.f107767a) {
                        SnsBrowseInfoHelper a = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                        String str = snsPermissionNotifyEvent.f107766d.f107769c;
                        a.getClass();
                        SnsMethodCalculate.markStartTimeMs("onBlackListFriend", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                        a.f275418R0.add(str);
                        a.f275456h = a.f275418R0.size();
                        SnsMethodCalculate.markEndTimeMs("onBlackListFriend", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    } else {
                        SnsBrowseInfoHelper a2 = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                        String str2 = snsPermissionNotifyEvent.f107766d.f107769c;
                        a2.getClass();
                        SnsMethodCalculate.markStartTimeMs("onOutsiderFriend", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                        a2.f275420S0.add(str2);
                        a2.f275459i = a2.f275420S0.size();
                        SnsMethodCalculate.markEndTimeMs("onOutsiderFriend", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$11");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$11");
                return false;
            }
        };
        this.f278684o1 = new IListener<SnsLuckyPayNotifyEvent>(fVar) {
            {
                this.__eventId = -702066263;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$12");
                SnsLuckyPayNotifyEvent snsLuckyPayNotifyEvent = (SnsLuckyPayNotifyEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$12");
                SnsTimeLineUI.m122282J7(SnsTimeLineUI.this).mo133186F0("");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$12");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$12");
                return false;
            }
        };
        this.f278686p1 = new IListener<GalleryPhotoInfoEvent>(fVar) {
            {
                this.__eventId = 1036677180;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$13");
                GalleryPhotoInfoEvent galleryPhotoInfoEvent = (GalleryPhotoInfoEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$13");
                GalleryPhotoInfoEvent.C92522a aVar = galleryPhotoInfoEvent.f264882d;
                int i = aVar.f264885b;
                int i2 = aVar.f264884a;
                SnsTimeLineUI snsTimeLineUI = SnsTimeLineUI.this;
                Boolean bool = SnsTimeLineUI.f278611T1;
                SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                snsTimeLineUI.getClass();
                SnsMethodCalculate.markStartTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                int firstVisiblePosition = snsTimeLineUI.f278626F.f276698e.getFirstVisiblePosition();
                int headerViewsCount = snsTimeLineUI.f278626F.f276698e.getHeaderViewsCount();
                SnsInfo i3 = snsTimeLineUI.f278626F.f276707q.mo132919i(i2);
                View childAt = snsTimeLineUI.f278626F.f276698e.getChildAt((i2 - firstVisiblePosition) + headerViewsCount);
                if (childAt != null) {
                    if (childAt instanceof C62508a) {
                        C62508a aVar2 = (C62508a) childAt;
                        SnsMethodCalculate.markStartTimeMs("getViewPosition", "com.tencent.mm.plugin.sns.ui.item.improve.BasePositionTimelineItem");
                        View G = aVar2.mo87535G(i);
                        int[] iArr = new int[2];
                        if (G != null) {
                            G.getLocationOnScreen(iArr);
                        }
                        int width = G != null ? G.getWidth() : 0;
                        int height = G != null ? G.getHeight() : 0;
                        aVar2.mo140441m("MicroMsg.Improve.BasePositionTimelineItem", "position:" + i + " location:" + iArr[0] + ' ' + iArr[1] + " width:" + width + " height:" + height);
                        Point point = new Point(iArr[0], iArr[1]);
                        Size size = new Size(width, height);
                        SnsMethodCalculate.markEndTimeMs("getViewPosition", "com.tencent.mm.plugin.sns.ui.item.improve.BasePositionTimelineItem");
                        GalleryPhotoInfoEvent.C92523b bVar = galleryPhotoInfoEvent.f264883e;
                        bVar.f264888a = point.x;
                        bVar.f264889b = point.y;
                        bVar.f264890c = size.getWidth();
                        galleryPhotoInfoEvent.f264883e.f264891d = size.getHeight();
                    } else if (childAt.getTag() != null && (childAt.getTag() instanceof BaseTimeLineItem.BaseViewHolder)) {
                        if (i3 != null) {
                            C101789j00 j002 = i3.getTimeLine().ContentObj;
                            if (j002.f298424e == 1 && j002.f298427h.size() == 4 && i > 1) {
                                i++;
                            }
                        } else {
                            Log.m105920e("MicroMsg.SnsTimeLineUI", "snsInfo is null");
                        }
                        BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) childAt.getTag();
                        TagImageView tagImageView = null;
                        PhotosContent photosContent = baseViewHolder.f279936S;
                        if (photosContent != null) {
                            tagImageView = photosContent.mo132426b(i);
                        } else if (baseViewHolder.f279949c0 != null) {
                            tagImageView = baseViewHolder.f279982t;
                        }
                        if (tagImageView != null) {
                            int[] iArr2 = new int[2];
                            tagImageView.getLocationOnScreen(iArr2);
                            GalleryPhotoInfoEvent.C92523b bVar2 = galleryPhotoInfoEvent.f264883e;
                            bVar2.f264888a = iArr2[0];
                            bVar2.f264889b = iArr2[1];
                            bVar2.f264890c = tagImageView.getWidth();
                            galleryPhotoInfoEvent.f264883e.f264891d = tagImageView.getHeight();
                        }
                    }
                }
                SnsMethodCalculate.markEndTimeMs("getPhotoInfo", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$13");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$13");
                return false;
            }
        };
        this.f278687q1 = new IListener<ActiveStatusChangedForDataReportEvent>(fVar) {
            {
                this.__eventId = 1179123103;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$14");
                ActiveStatusChangedForDataReportEvent activeStatusChangedForDataReportEvent = (ActiveStatusChangedForDataReportEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$14");
                if (!(SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) == null || SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g == null)) {
                    SnsBrowseInfoHelper a = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                    ActiveStatusChangedForDataReportEvent.C80698a aVar = activeStatusChangedForDataReportEvent.f236120d;
                    boolean z = aVar.f236121a;
                    String str = aVar.f236122b;
                    a.getClass();
                    SnsMethodCalculate.markStartTimeMs("handleActivityStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    SnsMethodCalculate.markStartTimeMs("isSnsSceneUI", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    boolean z2 = true;
                    if (str.toLowerCase().indexOf("sns") >= 0) {
                        SnsMethodCalculate.markEndTimeMs("isSnsSceneUI", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    } else if (str.toLowerCase().indexOf("sightuploadui") >= 0) {
                        SnsMethodCalculate.markEndTimeMs("isSnsSceneUI", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    } else if (str.contains("WebViewUI")) {
                        SnsMethodCalculate.markEndTimeMs("isSnsSceneUI", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    } else {
                        SnsMethodCalculate.markEndTimeMs("isSnsSceneUI", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                        z2 = false;
                    }
                    if (!z2) {
                        Log.m105918d("MicroMsg.SnsBrowseInfoHelper", "handleActivityStatusChanged, not sns scene, className" + str + ",_active=" + z);
                        SnsMethodCalculate.markEndTimeMs("handleActivityStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    } else {
                        if (!z) {
                            a.f275409N = System.currentTimeMillis();
                        } else if (a.f275409N > 0) {
                            a.f275407M += System.currentTimeMillis() - a.f275409N;
                            a.f275409N = 0;
                        }
                        SnsMethodCalculate.markEndTimeMs("handleActivityStatusChanged", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$14");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$14");
                return false;
            }
        };
        this.f278688r1 = new IListener<SnsAdLongVideoBrowseStatusChangedForDataReportEvent>(fVar) {
            {
                this.__eventId = -1833188841;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$15");
                SnsAdLongVideoBrowseStatusChangedForDataReportEvent snsAdLongVideoBrowseStatusChangedForDataReportEvent = (SnsAdLongVideoBrowseStatusChangedForDataReportEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$15");
                if (!(SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) == null || SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g == null)) {
                    SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a().mo131321h(true);
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$15");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$15");
                return false;
            }
        };
        this.f278689s1 = new IListener<SnsFavFeedForDataReportEvent>(fVar) {
            {
                this.__eventId = -1614598524;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$16");
                SnsFavFeedForDataReportEvent snsFavFeedForDataReportEvent = (SnsFavFeedForDataReportEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$16");
                if (!(SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) == null || SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g == null)) {
                    SnsBrowseInfoHelper a = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                    SnsFavFeedForDataReportEvent.C92574a aVar = snsFavFeedForDataReportEvent.f265135d;
                    a.mo131337x(aVar.f265137b, aVar.f265136a);
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$16");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$16");
                return false;
            }
        };
        this.f278690t1 = new IListener<SnsForwardFeedToChatRoomForDataReportEvent>(fVar) {
            {
                this.__eventId = 1078309244;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$17");
                SnsForwardFeedToChatRoomForDataReportEvent snsForwardFeedToChatRoomForDataReportEvent = (SnsForwardFeedToChatRoomForDataReportEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$17");
                if (!(SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) == null || SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g == null)) {
                    SnsBrowseInfoHelper a = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                    String str = snsForwardFeedToChatRoomForDataReportEvent.f265152d.f265153a;
                    a.getClass();
                    SnsMethodCalculate.markStartTimeMs("onForwardToChatRoomContact", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    a.f275410N0.add(str);
                    SnsMethodCalculate.markEndTimeMs("onForwardToChatRoomContact", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$17");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$17");
                return false;
            }
        };
        this.f278691u1 = new IListener<SnsForwardFeedToSingleChatForDataReportEvent>(fVar) {
            {
                this.__eventId = 1100082729;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$18");
                SnsForwardFeedToSingleChatForDataReportEvent snsForwardFeedToSingleChatForDataReportEvent = (SnsForwardFeedToSingleChatForDataReportEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$18");
                if (!(SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) == null || SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g == null)) {
                    SnsBrowseInfoHelper a = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                    String str = snsForwardFeedToSingleChatForDataReportEvent.f265155d.f265156a;
                    a.getClass();
                    SnsMethodCalculate.markStartTimeMs("onForwardToSingleContact", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    a.f275408M0.add(str);
                    SnsMethodCalculate.markEndTimeMs("onForwardToSingleContact", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$18");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$18");
                return false;
            }
        };
        this.f278693v1 = new IListener<SnsForwardFeedToSnsForDataReportEvent>(fVar) {
            {
                this.__eventId = -374645387;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$19");
                SnsForwardFeedToSnsForDataReportEvent snsForwardFeedToSnsForDataReportEvent = (SnsForwardFeedToSnsForDataReportEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$19");
                if (!(SnsTimeLineUI.m122284L7(SnsTimeLineUI.this) == null || SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g == null)) {
                    SnsBrowseInfoHelper a = SnsTimeLineUI.m122284L7(SnsTimeLineUI.this).f276700g.mo130970a();
                    String str = snsForwardFeedToSnsForDataReportEvent.f9512d.f9513a;
                    a.getClass();
                    SnsMethodCalculate.markStartTimeMs("onForwardToSns", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                    a.f275402J0.add(str);
                    SnsMethodCalculate.markEndTimeMs("onForwardToSns", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$19");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$19");
                return false;
            }
        };
        this.f278695w1 = new IListener<CheckSnsAutoPlayEvent>(fVar) {
            {
                this.__eventId = -1893593801;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$20");
                CheckSnsAutoPlayEvent checkSnsAutoPlayEvent = (CheckSnsAutoPlayEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$20");
                Log.m105924i("MicroMsg.SnsTimeLineUI", "checkSnsAutoPlay event");
                SnsTimeLineUI snsTimeLineUI = SnsTimeLineUI.this;
                Boolean bool = SnsTimeLineUI.f278611T1;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                snsTimeLineUI.mo132960z8(true);
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$20");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$20");
                return true;
            }
        };
        this.f278698x1 = new IListener<SnsRetryEditTipExpiredEvent>(fVar) {
            {
                this.__eventId = 1335526630;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$21");
                SnsRetryEditTipExpiredEvent snsRetryEditTipExpiredEvent = (SnsRetryEditTipExpiredEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$21");
                Log.m105924i("MicroMsg.SnsTimeLineUI", "SnsRetryEditTipExpired event");
                SnsTimeLineUI.this.runOnUiThread(new C95814i6(this));
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$21");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$21");
                return true;
            }
        };
        this.f278701y1 = new SnsTimeLineUI$$e(this);
        this.f278617A1 = 0;
        this.f278619B1 = false;
        this.f278621C1 = 0;
        this.f278623D1 = new SnsTimeLineUI$$l(this);
        this.f278625E1 = new SnsTimeLineUI$$m(this);
        this.f278627F1 = ((C88817b) C88819d.LOGIC.f256230a).f256218a;
        this.f278629G1 = new SnsTimeLineUI$$n(this);
        this.f278631H1 = new SnsTimeLineUI$$p(this);
        this.f278633I1 = new SnsTimeLineUI$$q(this);
        this.f278635J1 = 0;
        this.f278637K1 = true;
        this.f278639L1 = 0;
        this.f278641M1 = 0;
        this.f278643N1 = 0;
        this.f278644O1 = new SnsTimeLineUI$$c0(this);
        this.f278646P1 = 0;
        this.f278649Q1 = new SnsTimeLineUI$$p0(this);
        this.f278652R1 = 0;
        this.f278655S1 = false;
    }

    /* renamed from: B8 */
    public static void m122280B8(boolean z, int i, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("report20838", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C115669n.INSTANCE.mo160131h(20838, Long.valueOf(C31543z5.m39453c()), Integer.valueOf(f278613V1), Integer.valueOf(f278612U1), C102236a0.m134754l(), Integer.valueOf(f278614W1), Integer.valueOf(i), Integer.valueOf(z ? 1 : 2), Integer.valueOf(z2 ? 1 : 2));
        SnsMethodCalculate.markEndTimeMs("report20838", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: C8 */
    public static void m122281C8(int i, int i2, String str, C117747y yVar, Context context) {
        SnsMethodCalculate.markStartTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (yVar == null) {
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else if (yVar.getType() != 213 && yVar.getType() != 682) {
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else if (!((C101980n) C86312j.m106911c(C101980n.class)).mo134684EO()) {
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else if (i == 0 && i2 == 0) {
            boolean z = yVar instanceof C94850d0;
            if (z || (yVar instanceof C94970y)) {
                if (z) {
                    if (context instanceof SnsTimeLineUI) {
                        SnsMethodCalculate.markStartTimeMs("getSendSource", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
                        int i3 = ((C94850d0) yVar).f274810n;
                        SnsMethodCalculate.markEndTimeMs("getSendSource", "com.tencent.mm.plugin.sns.model.NetSceneSnsComment");
                        if (i3 != 0) {
                            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                            return;
                        }
                    }
                } else if ((yVar instanceof C94970y) && (context instanceof SnsTimeLineUI)) {
                    SnsMethodCalculate.markStartTimeMs("getScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                    int i4 = ((C94970y) yVar).f275323n;
                    SnsMethodCalculate.markEndTimeMs("getScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdComment");
                    if (i4 != 0) {
                        SnsMethodCalculate.markEndTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                        return;
                    }
                }
                ((C119157j) C119157j.f356862d).mo183876g(new SnsTimeLineUI$$u0(yVar, context, (long) C31543z5.m39455e()), "WebSearchReportLogic.TagSearchReport");
                SnsMethodCalculate.markEndTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                return;
            }
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            SnsMethodCalculate.markEndTimeMs("reportTagSearchOnCommentSend", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
    }

    /* renamed from: J7 */
    public static /* synthetic */ C97979c m122282J7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C97979c cVar = snsTimeLineUI.f278699y;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return cVar;
    }

    /* renamed from: K7 */
    public static void m122283K7(SnsTimeLineUI snsTimeLineUI, int i) {
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.getClass();
        SnsMethodCalculate.markStartTimeMs("onExposeAd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C91998s.m115550d(507);
        int lastVisiblePosition = snsTimeLineUI.mUIAction.f278851d.getLastVisiblePosition() - 1;
        int count = snsTimeLineUI.f278699y.getCount();
        for (int firstVisiblePosition = snsTimeLineUI.mUIAction.f278851d.getFirstVisiblePosition() - 1; firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
            if (firstVisiblePosition < count && firstVisiblePosition >= 0 && firstVisiblePosition != i) {
                if (i > firstVisiblePosition) {
                    C102236a0.m134728W(snsTimeLineUI.f278626F.f276707q.mo132919i(firstVisiblePosition));
                } else {
                    C102236a0.m134728W(snsTimeLineUI.f278626F.f276707q.mo132919i(firstVisiblePosition));
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onExposeAd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: L7 */
    public static /* synthetic */ BaseTimeLine m122284L7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        BaseTimeLine baseTimeLine = snsTimeLineUI.f278626F;
        SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return baseTimeLine;
    }

    /* renamed from: M7 */
    public static /* synthetic */ SnsTimeLineUI$$y0 m122285M7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI$$y0 snsTimeLineUI$$y0 = snsTimeLineUI.f278630H;
        SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return snsTimeLineUI$$y0;
    }

    /* renamed from: N7 */
    public static /* synthetic */ SnsUIAction.C95669n m122286N7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsUIAction.C95669n nVar = snsTimeLineUI.f278631H1;
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return nVar;
    }

    /* renamed from: O7 */
    public static /* synthetic */ String m122287O7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        String str = snsTimeLineUI.f278650R;
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return str;
    }

    /* renamed from: P7 */
    public static /* synthetic */ boolean m122288P7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = snsTimeLineUI.f278656T;
        SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return z;
    }

    /* renamed from: Q7 */
    public static /* synthetic */ boolean m122289Q7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = snsTimeLineUI.f278658U;
        SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return z;
    }

    /* renamed from: R7 */
    public static /* synthetic */ C98212c m122290R7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C98212c cVar = snsTimeLineUI.f278696x;
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return cVar;
    }

    /* renamed from: S7 */
    public static /* synthetic */ QFadeImageView m122291S7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        QFadeImageView qFadeImageView = snsTimeLineUI.f278618B;
        SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return qFadeImageView;
    }

    /* renamed from: T7 */
    public static void m122292T7(SnsTimeLineUI snsTimeLineUI, int i, int i2) {
        String str;
        String str2;
        int i3;
        int i4;
        int i5;
        SnsTimeLineUI snsTimeLineUI2 = snsTimeLineUI;
        String str3 = "access$2900";
        SnsMethodCalculate.markStartTimeMs(str3, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.getClass();
        SnsMethodCalculate.markStartTimeMs("handleCurRange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (!snsTimeLineUI2.f278666Y) {
            C96254a d = C96254a.m123394d();
            d.getClass();
            SnsMethodCalculate.markStartTimeMs("clearCurVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
            if (d.f281270e != null) {
                d.mo133938k();
                d.f281270e = null;
                d.f281269d = "";
            }
            SnsMethodCalculate.markEndTimeMs("clearCurVideoView", "com.tencent.mm.plugin.sns.ui.video.SnsVideoViewMgr");
        }
        int headerViewsCount = i - snsTimeLineUI2.mUIAction.f278851d.getHeaderViewsCount();
        int i6 = i2 - (-snsTimeLineUI2.mUIAction.f278851d.getHeaderViewsCount());
        long currentTimeMillis = System.currentTimeMillis();
        SnsMethodCalculate.markStartTimeMs("selectAutoPlayItem", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i7 = headerViewsCount;
        while (i7 <= i6 && (i4 = i7 - headerViewsCount) < snsTimeLineUI2.mUIAction.f278851d.getChildCount()) {
            View childAt = snsTimeLineUI2.mUIAction.f278851d.getChildAt(i4);
            if (childAt == null || childAt.getTag() == null) {
                i5 = headerViewsCount;
            } else {
                i5 = headerViewsCount;
                if ((childAt.getTag() instanceof BaseTimeLineItem.BaseViewHolder) && !(childAt instanceof C100930m)) {
                    BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) childAt.getTag();
                    if (baseViewHolder.f279965k0 instanceof C92312b) {
                        if (baseViewHolder.isAd || snsTimeLineUI2.f278666Y) {
                            Log.m105924i("MicroMsg.SnsTimeLineUI", "onListViewScoll hasPlayItem");
                            C92312b bVar = (C92312b) baseViewHolder.f279965k0;
                            if (snsTimeLineUI2.mo132953o8(bVar)) {
                                arrayList2.add(baseViewHolder);
                                arrayList.add(bVar);
                                arrayList3.add(Integer.valueOf(i7));
                            }
                        } else {
                            Log.m105924i("MicroMsg.SnsTimeLineUI", "onListViewScoll, not ad , not autoPlay");
                        }
                    }
                    i7++;
                    headerViewsCount = i5;
                }
            }
            if (childAt instanceof C100930m) {
                if (!snsTimeLineUI2.f278666Y) {
                    Log.m105924i("MicroMsg.SnsTimeLineUI", "onListViewScoll, not ad , not autoPlay");
                } else {
                    C92312b bVar2 = (C92312b) childAt;
                    if (snsTimeLineUI2.mo132953o8(bVar2)) {
                        arrayList2.add(new C95929m.C95932c());
                        arrayList.add(bVar2);
                        arrayList3.add(Integer.valueOf(i7));
                    }
                }
            }
            i7++;
            headerViewsCount = i5;
        }
        if (arrayList.isEmpty()) {
            C96254a.m123394d().mo133938k();
            C92313c.m116089a().mo126301d();
            str = str3;
        } else {
            int i8 = Integer.MAX_VALUE;
            int i9 = 0;
            int i15 = 0;
            while (i9 < arrayList.size()) {
                SnsMethodCalculate.markStartTimeMs("disToPlayLine", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                Rect displayRect = ((C92312b) arrayList.get(i9)).getDisplayRect();
                if (displayRect == null) {
                    SnsMethodCalculate.markEndTimeMs("disToPlayLine", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    str2 = str3;
                    i3 = Integer.MAX_VALUE;
                } else {
                    str2 = str3;
                    i3 = Math.abs(displayRect.top - snsTimeLineUI2.f278628G);
                    SnsMethodCalculate.markEndTimeMs("disToPlayLine", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                }
                if (i3 < i8) {
                    i8 = i3;
                    i15 = i9;
                }
                i9++;
                str3 = str2;
            }
            str = str3;
            ((C92312b) arrayList.get(i15)).mo126295e((BaseTimeLineItem.BaseViewHolder) arrayList2.get(i15), ((Integer) arrayList3.get(i15)).intValue());
            Log.m105925i("MicroMsg.SnsTimeLineUI", "onListViewScoll play %s, minDis:%s", arrayList3.get(i15), Integer.valueOf(i8));
            if (snsTimeLineUI.isPaused()) {
                Log.m105918d("MicroMsg.SnsTimeLineUI", "autoPlayItem.playing is refused by activity has been paused.");
                C96254a.m123394d().mo133938k();
            }
        }
        SnsMethodCalculate.markEndTimeMs("selectAutoPlayItem", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105925i("MicroMsg.SnsTimeLineUI", "lxl select play item cost:%s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("handleCurRange", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: U7 */
    public static /* synthetic */ int m122293U7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        int i = snsTimeLineUI.f278660V;
        SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return i;
    }

    /* renamed from: V7 */
    public static /* synthetic */ Handler m122294V7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Handler handler = snsTimeLineUI.f278627F1;
        SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return handler;
    }

    /* renamed from: W7 */
    public static /* synthetic */ Runnable m122295W7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Runnable runnable = snsTimeLineUI.f278672c1;
        SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return runnable;
    }

    /* renamed from: X7 */
    public static /* synthetic */ LinearLayout m122296X7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        LinearLayout linearLayout = snsTimeLineUI.f278702z;
        SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return linearLayout;
    }

    /* renamed from: Y7 */
    public static /* synthetic */ LinearLayout m122297Y7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        LinearLayout linearLayout = snsTimeLineUI.f278616A;
        SnsMethodCalculate.markEndTimeMs("access$4000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return linearLayout;
    }

    /* renamed from: Z7 */
    public static /* synthetic */ TestTimeForSns m122298Z7(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$4200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        TestTimeForSns testTimeForSns = snsTimeLineUI.f278632I;
        SnsMethodCalculate.markEndTimeMs("access$4200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return testTimeForSns;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0155  */
    /* renamed from: a8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m122299a8(com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI r21) {
        /*
            r8 = r21
            java.lang.String r9 = "access$4600"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            r21.getClass()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_DRAFT_LAST_SESSIONID_STRING
            java.lang.String r12 = "selectImageOrVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r10)
            k21.c$a r0 = k21.C60960c.f173618a
            java.lang.String r1 = "SnsPublishProcess"
            r0.mo85918a(r1)
            java.lang.String r1 = vr2.C102236a0.m134754l()
            java.lang.String r2 = "RecordMediaReporter"
            java.lang.String r3 = "moment_sessionid_"
            r0.mo85926j(r2, r3, r1)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = eb0.C75592q0.m90789s()
            r1.append(r2)
            java.lang.String r13 = "_"
            r1.append(r13)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f275523Q = r1
            os2.b0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
            r14 = 0
            r0.mo60187jo(r14)
            os2.b0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
            java.lang.String r15 = "draft_normal"
            os2.a0 r0 = r0.mo60188qq(r15)
            r7 = 1
            if (r0 == 0) goto L_0x011f
            java.lang.String r1 = "MicroMsg.SnsTimeLineUI"
            java.lang.String r2 = "directly goto SnsUploadUI with draftInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            byte[] r0 = r0.field_draft
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r1 != 0) goto L_0x011f
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.String r6 = ""
            java.lang.Object r1 = r1.mo119685f(r11, r6)
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.mm.autogen.mmdata.rpt.SnsEditDraftStruct r2 = new com.tencent.mm.autogen.mmdata.rpt.SnsEditDraftStruct
            r2.<init>()
            r2.mo126630s()
            java.lang.String r3 = "SessionId"
            java.lang.String r3 = r2.mo86045b(r3, r1, r7)
            r2.f266008d = r3
            r2.mo86054n()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            int r3 = r0.length
            r2.unmarshall(r0, r14, r3)
            r2.setDataPosition(r14)
            android.os.Parcelable$Creator r0 = android.content.Intent.CREATOR     // Catch:{ Exception -> 0x0102 }
            java.lang.Object r0 = r0.createFromParcel(r2)     // Catch:{ Exception -> 0x0102 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x0102 }
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsUploadUI> r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.class
            r0.setClass(r8, r2)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = "KSessionID"
            r0.putExtra(r2, r1)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = "Kis_from_sns_drafg_stg"
            r0.putExtra(r1, r7)     // Catch:{ Exception -> 0x0102 }
            k20.a r5 = new k20.a     // Catch:{ Exception -> 0x0102 }
            r5.<init>()     // Catch:{ Exception -> 0x0102 }
            r5.mo10233c(r0)     // Catch:{ Exception -> 0x0102 }
            java.lang.Object[] r1 = r5.mo10232b()     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI"
            java.lang.String r3 = "selectImageOrVideo"
            java.lang.String r4 = "()V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r0 = r21
            r19 = r9
            r9 = r5
            r5 = r16
            r20 = r6
            r6 = r17
            r7 = r18
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r0 = r9.mo10231a(r14)     // Catch:{ Exception -> 0x0106 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Exception -> 0x0106 }
            r8.startActivity(r0)     // Catch:{ Exception -> 0x0106 }
            java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI"
            java.lang.String r2 = "selectImageOrVideo"
            java.lang.String r3 = "()V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r21
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0106 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            goto L_0x0151
        L_0x0102:
            r20 = r6
            r19 = r9
        L_0x0106:
            os2.b0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
            r1 = 0
            r0.mo60186Yt(r15, r1, r14)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = r20
            r0.mo119677K(r11, r1)
            goto L_0x0121
        L_0x011f:
            r19 = r9
        L_0x0121:
            java.lang.String r0 = "setCameraIconRedDotVisibility"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r10)
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r0 = r8.f278626F
            if (r0 == 0) goto L_0x013b
            com.tencent.mm.plugin.sns.model.m2 r0 = r0.f276700g
            if (r0 == 0) goto L_0x013b
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r0 = r0.mo130970a()
            r1 = 1
            r0.mo131331r(r1)
            goto L_0x013c
        L_0x013b:
            r1 = 1
        L_0x013c:
            r0 = 705(0x2c1, float:9.88E-43)
            ad0.s r0 = ad0.C91998s.m115550d(r0)
            java.lang.System.currentTimeMillis()
            boolean r2 = m122313w8()
            if (r2 == 0) goto L_0x0155
            r8.mo132959y8(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
        L_0x0151:
            r0 = r19
            goto L_0x01df
        L_0x0155:
            qo3.n r2 = r8.f278661V0
            if (r2 != 0) goto L_0x0179
            qo3.n r2 = new qo3.n
            androidx.appcompat.app.AppCompatActivity r3 = r21.getContext()
            r2.<init>((android.content.Context) r3, (int) r1, (boolean) r14)
            r8.f278661V0 = r2
            com.tencent.mm.plugin.sns.ui.p6 r3 = new com.tencent.mm.plugin.sns.ui.p6
            r3.<init>(r8)
            r2.f225771i = r3
            com.tencent.mm.plugin.sns.ui.q6 r3 = new com.tencent.mm.plugin.sns.ui.q6
            r3.<init>(r8, r0)
            r2.f225782p = r3
            com.tencent.mm.plugin.sns.ui.r6 r0 = new com.tencent.mm.plugin.sns.ui.r6
            r0.<init>(r8)
            r2.f225761d = r0
        L_0x0179:
            qo3.n r0 = r8.f278661V0
            r0.mo107573q()
            com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$a1 r0 = r8.f278668Z
            r0.getClass()
            java.lang.String r2 = "entrance"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$WeishiReportScene"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            boolean r4 = r0.f278723a
            if (r4 != 0) goto L_0x0192
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x01da
        L_0x0192:
            r0.mo132964d()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4.append(r5)
            r4.append(r13)
            r5 = 5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.getRandomString(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.f278724b = r4
            r0.f278725c = r1
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f278726d = r4
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WEISHI_EXPOSE_COUNT_INT_SYNC
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            java.lang.Object r1 = r1.mo119685f(r4, r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f278727e = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x01da:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r10)
            goto L_0x0151
        L_0x01df:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122299a8(com.tencent.mm.plugin.sns.ui.SnsTimeLineUI):void");
    }

    /* renamed from: b8 */
    public static boolean m122300b8(SnsTimeLineUI snsTimeLineUI) {
        C94895m2 m2Var;
        SnsTimeLineUI snsTimeLineUI2 = snsTimeLineUI;
        SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.getClass();
        SnsMethodCalculate.markStartTimeMs("doLongeClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        BaseTimeLine baseTimeLine = snsTimeLineUI2.f278626F;
        if (!(baseTimeLine == null || (m2Var = baseTimeLine.f276700g) == null)) {
            m2Var.mo130970a().mo131331r(true);
        }
        C86709a0.m107528h();
        boolean booleanValue = ((Boolean) C86709a0.m107535s().mo121142i().mo119684e(7490, Boolean.TRUE)).booleanValue();
        C94866e1.Wx0().mo60187jo(true);
        C35285a0 qq = C94866e1.Wx0().mo60188qq("draft_text");
        if (qq != null) {
            byte[] bArr = qq.field_draft;
            if (!Util.isNullOrNil(bArr)) {
                C86709a0.m107528h();
                SnsEditDraftStruct snsEditDraftStruct = new SnsEditDraftStruct();
                snsEditDraftStruct.mo126630s();
                snsEditDraftStruct.f266008d = snsEditDraftStruct.mo86045b("SessionId", (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_DRAFT_NEWTEXT_LAST_SESSIONID_STRING, ""), true);
                snsEditDraftStruct.mo86054n();
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    Intent intent = (Intent) Intent.CREATOR.createFromParcel(obtain);
                    SnsMethodCalculate.markStartTimeMs("checkTextIntent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    boolean z = intent != null && intent.getIntExtra("Ksnsupload_type", 0) == 9;
                    SnsMethodCalculate.markEndTimeMs("checkTextIntent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    if (z) {
                        snsTimeLineUI2.startActivityForResult(intent, 9);
                        SnsMethodCalculate.markEndTimeMs("doLongeClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                        SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                        return true;
                    }
                    C94866e1.Wx0().mo60186Yt("draft_text", (byte[]) null, 0);
                } catch (Exception unused) {
                    C94866e1.Wx0().mo60186Yt("draft_text", (byte[]) null, 0);
                }
            }
        }
        if (!booleanValue) {
            Intent intent2 = new Intent();
            intent2.setClass(snsTimeLineUI2, SnsUploadUI.class);
            intent2.putExtra("KSnsPostManu", true);
            intent2.putExtra("KTouchCameraTime", Util.nowSecond());
            intent2.putExtra("sns_comment_type", 1);
            intent2.putExtra("Ksnsupload_type", 9);
            C91998s d = C91998s.m115550d(705);
            System.currentTimeMillis();
            C95006y.f275639b.mo131396a(d);
            d.mo125842g(intent2);
            snsTimeLineUI2.startActivityForResult(intent2, 9);
        } else {
            Intent intent3 = new Intent().setClass(snsTimeLineUI2, SnsLongMsgUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent3);
            C117292a.m165358d(snsTimeLineUI, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI", "doLongeClick", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            snsTimeLineUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(snsTimeLineUI, "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI", "doLongeClick", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(7490, Boolean.FALSE);
        }
        SnsMethodCalculate.markEndTimeMs("doLongeClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return true;
    }

    /* renamed from: c8 */
    public static void m122301c8(SnsTimeLineUI snsTimeLineUI) {
        BaseTimeLineItem.BaseViewHolder baseViewHolder;
        SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.getClass();
        SnsMethodCalculate.markStartTimeMs("doScreenShotReport", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        try {
            int headerViewsCount = snsTimeLineUI.mUIAction.f278851d.getHeaderViewsCount();
            Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "getHeaderViewsCount: " + headerViewsCount);
            int firstVisiblePosition = snsTimeLineUI.mUIAction.f278851d.getFirstVisiblePosition();
            int lastVisiblePosition = snsTimeLineUI.mUIAction.f278851d.getLastVisiblePosition();
            Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "firstVisiblePosition = " + firstVisiblePosition + ", lastVisiblePosition = " + lastVisiblePosition);
            for (int i = firstVisiblePosition; i <= lastVisiblePosition; i++) {
                View childAt = snsTimeLineUI.mUIAction.f278851d.getChildAt(i - firstVisiblePosition);
                if (!(childAt == null || childAt.getTag() == null || !(childAt.getTag() instanceof BaseTimeLineItem.BaseViewHolder) || (baseViewHolder = (BaseTimeLineItem.BaseViewHolder) childAt.getTag()) == null)) {
                    Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "In ListView, current visible position = " + i + ", nickNameTv = " + baseViewHolder.f279964k.getText().toString() + ", descCollapTv = " + baseViewHolder.f279968m.getContent());
                    if (baseViewHolder.isAd) {
                        if (snsTimeLineUI.mo132954p8(childAt)) {
                            Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "Use eyes, real current visible position = " + i + ", nickNameTv = " + baseViewHolder.f279964k.getText().toString() + ", descCollapTv = " + baseViewHolder.f279968m.getContent());
                            SnsInfo i2 = snsTimeLineUI.f278626F.f276707q.mo132919i(i - headerViewsCount);
                            if (i2 != null) {
                                String nullAsNil = Util.nullAsNil(i2.getAdInfo().uxInfo);
                                Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "uxInfo = " + nullAsNil);
                                String a = C98784a.m128574a(String.valueOf(1), nullAsNil, "");
                                Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "reportScreenShotParams = " + a);
                                C115669n.INSTANCE.kvStat(19213, a);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsTimeLineUI.ScreenShot", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("doScreenShotReport", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: d8 */
    public static /* synthetic */ SnsUIAction m122302d8(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsUIAction snsUIAction = snsTimeLineUI.mUIAction;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return snsUIAction;
    }

    /* renamed from: e8 */
    public static void m122303e8(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.getClass();
        SnsMethodCalculate.markStartTimeMs("checkTip", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (snsTimeLineUI.f278634J > 3) {
            SnsMethodCalculate.markEndTimeMs("checkTip", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            int firstVisiblePosition = snsTimeLineUI.mUIAction.f278851d.getFirstVisiblePosition();
            if (System.currentTimeMillis() - snsTimeLineUI.f278617A1 > 1000 || firstVisiblePosition > snsTimeLineUI.f278621C1) {
                snsTimeLineUI.f278617A1 = 0;
                snsTimeLineUI.f278621C1 = snsTimeLineUI.mUIAction.f278851d.getFirstVisiblePosition();
            }
            snsTimeLineUI.f278617A1 = System.currentTimeMillis();
            if (snsTimeLineUI.f278621C1 - firstVisiblePosition >= 10 && firstVisiblePosition > 10) {
                SnsMethodCalculate.markStartTimeMs("showTopTip", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                Log.m105925i("MicroMsg.SnsTimeLineUI", "showTopTip %d", Integer.valueOf(snsTimeLineUI.f278634J));
                if (snsTimeLineUI.f278634J > 3) {
                    SnsMethodCalculate.markEndTimeMs("showTopTip", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                } else if (snsTimeLineUI.isSingleTitleView()) {
                    SnsMethodCalculate.markEndTimeMs("showTopTip", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                } else {
                    snsTimeLineUI.setMMSingleTitle(snsTimeLineUI.getString(C0966R.string.jba), AnimationUtils.loadAnimation(snsTimeLineUI.getContext(), C0966R.C0968anim.f2468ds));
                    snsTimeLineUI.removeAllOptionMenu();
                    snsTimeLineUI.removeOptionMenu(16908332);
                    SnsMethodCalculate.markStartTimeMs("setTitleBarDoubleClickAction", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    snsTimeLineUI.setTitleBarDoubleClickListener(new C96102o6(snsTimeLineUI));
                    SnsMethodCalculate.markEndTimeMs("setTitleBarDoubleClickAction", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    snsTimeLineUI.f278634J++;
                    C94866e1.ly0().removeCallbacks(snsTimeLineUI.f278629G1);
                    C94866e1.ly0().postDelayed(snsTimeLineUI.f278629G1, 4000);
                    SnsMethodCalculate.markEndTimeMs("showTopTip", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkTip", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
        SnsMethodCalculate.markEndTimeMs("access$5100", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
        r3 = r3.f278852e;
     */
    /* renamed from: f8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m122304f8(com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI r3) {
        /*
            java.lang.String r0 = "access$5200"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r3.getClass()
            java.lang.String r2 = "isPullDownFp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            com.tencent.mm.plugin.sns.ui.SnsUIAction r3 = r3.mUIAction
            if (r3 == 0) goto L_0x0020
            com.tencent.mm.ui.base.MMOverScrollView r3 = r3.f278852e
            if (r3 == 0) goto L_0x0020
            int r3 = r3.getScrollY()
            if (r3 >= 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.m122304f8(com.tencent.mm.plugin.sns.ui.SnsTimeLineUI):boolean");
    }

    /* renamed from: g8 */
    public static void m122305g8(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$5300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.getClass();
        SnsMethodCalculate.markStartTimeMs("doubleClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105925i("MicroMsg.SnsTimeLineUI", "double click, first visible:%s", Integer.valueOf(snsTimeLineUI.mUIAction.f278851d.getFirstVisiblePosition()));
        if (snsTimeLineUI.mUIAction.mo133036n()) {
            Log.m105924i("MicroMsg.SnsTimeLineUI", "double click, in pullDownMode");
            C94866e1.Xx0().mo139784bF("@__weixintimtline", "");
            snsTimeLineUI.mUIAction.mo133028D(false);
            if (snsTimeLineUI.f278626F != null) {
                snsTimeLineUI.f278627F1.removeCallbacks(snsTimeLineUI.f278672c1);
                snsTimeLineUI.f278627F1.postDelayed(snsTimeLineUI.f278672c1, 3000);
            }
        }
        ListView listView = snsTimeLineUI.mUIAction.f278851d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(listView);
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI", "doubleClick", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        BackwardSupportUtil.SmoothScrollFactory.scrollToTop((ListView) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/mm/plugin/sns/ui/SnsTimeLineUI", "doubleClick", "()V", "com/tencent/mm/sdk/platformtools/BackwardSupportUtil$SmoothScrollFactory_EXEC_", "scrollToTop", "(Landroid/widget/ListView;)V");
        snsTimeLineUI.mo132948F8(0);
        if (snsTimeLineUI.mUIAction.f278851d.getFirstVisiblePosition() != 0) {
            ((SnsTimeLineUI$$n) snsTimeLineUI.f278629G1).run();
        }
        snsTimeLineUI.f278626F.mo132087i();
        snsTimeLineUI.mo132950a1();
        new MMHandler().postDelayed(new C96239u6(snsTimeLineUI), 300);
        SnsMethodCalculate.markEndTimeMs("doubleClick", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("access$5300", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: i8 */
    public static /* synthetic */ SnsTimeLineUI$$a1 m122306i8(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsTimeLineUI$$a1 snsTimeLineUI$$a1 = snsTimeLineUI.f278668Z;
        SnsMethodCalculate.markEndTimeMs("access$5600", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return snsTimeLineUI$$a1;
    }

    /* renamed from: j8 */
    public static /* synthetic */ void m122307j8(SnsTimeLineUI snsTimeLineUI, SnsTimeLineUI$$a1 snsTimeLineUI$$a1) {
        SnsMethodCalculate.markStartTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        snsTimeLineUI.mo132946D8(snsTimeLineUI$$a1);
        SnsMethodCalculate.markEndTimeMs("access$5700", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: k8 */
    public static /* synthetic */ long m122308k8(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        long j = snsTimeLineUI.f278652R1;
        SnsMethodCalculate.markEndTimeMs("access$5800", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return j;
    }

    /* renamed from: l8 */
    public static /* synthetic */ int m122309l8(SnsTimeLineUI snsTimeLineUI) {
        SnsMethodCalculate.markStartTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        int r8 = snsTimeLineUI.mo132955r8();
        SnsMethodCalculate.markEndTimeMs("access$5900", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return r8;
    }

    /* renamed from: m8 */
    public static /* synthetic */ int m122310m8() {
        SnsMethodCalculate.markStartTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        int i = f278612U1;
        SnsMethodCalculate.markEndTimeMs("access$6000", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return i;
    }

    /* renamed from: q8 */
    public static void m122311q8(MMActivity mMActivity, Boolean bool) {
        MMActivity mMActivity2 = mMActivity;
        SnsMethodCalculate.markStartTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (C61104a.m71665u(mMActivity)) {
            SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else if (C61104a.m71649e(mMActivity)) {
            SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            boolean z1 = ((C103918d) C86312j.m106911c(C103918d.class)).mo125788z1(mMActivity, "android.permission.CAMERA", 18, "", "");
            Log.m105925i("MicroMsg.SnsTimeLineUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", Boolean.valueOf(z1), Util.getStack(), mMActivity2);
            if (!z1) {
                SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                return;
            }
            long c = C31543z5.m39453c();
            String l = C102236a0.m134754l();
            Log.m105925i("MicroMsg.SnsTimeLineUI", "doCpatureMMSight sessionID:%s", l);
            C115669n.INSTANCE.mo160131h(13822, 1, 2, l, Long.valueOf(c));
            C77572l lVar = (C77572l) C86312j.m106911c(C77572l.class);
            boolean booleanValue = bool.booleanValue();
            SnsMethodCalculate.markStartTimeMs("getProvider", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            SightParams sightParams = new SightParams(2, 0);
            C13604l<String, String> b = C33419c.f90549a.mo59134b();
            Log.m105925i("MicroMsg.SnsTimeLineUI", "record video path:%s thumb path:%s", b.f38555d, b.f38556e);
            VideoTransPara videoTransPara = sightParams.f248452f;
            RecordConfigProvider a = C94992f.f275600a.mo131399a((String) b.f38555d, (String) b.f38556e, videoTransPara, videoTransPara.f267170h * 1000, 49);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_ignore_remux_without_edit, false)) {
                a.f272919d = 2;
            }
            VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
            videoCaptureReportInfo.f272940d = 1;
            a.f272908I = videoCaptureReportInfo;
            UICustomParam uICustomParam = new UICustomParam();
            Map<String, Boolean> map = uICustomParam.f266575h;
            Boolean bool2 = Boolean.TRUE;
            ((HashMap) map).put("plugin_filter", bool2);
            ((HashMap) uICustomParam.f266575h).put("plugin_tip", bool2);
            ((HashMap) uICustomParam.f266575h).put("plugin_poi", bool2);
            ((HashMap) uICustomParam.f266575h).put("plugin_menu", bool2);
            a.f272927o = uICustomParam;
            a.f272932t = Boolean.valueOf(booleanValue);
            SnsMethodCalculate.markEndTimeMs("getProvider", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            lVar.mo107612ZM(mMActivity2, a, new SnsTimeLineUI$$s0(mMActivity2));
            SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
    }

    /* renamed from: t8 */
    public static void m122312t8(MMActivity mMActivity, Object obj) {
        Object obj2 = obj;
        SnsMethodCalculate.markStartTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (obj2 instanceof C77575r) {
            C77575r rVar = (C77575r) obj2;
            if (rVar.f226147b == -1 && rVar.f226148c == 0) {
                C77574q qVar = rVar.f226149d;
                Intent intent = new Intent();
                intent.putExtra("key_extra_data", rVar.f226150e);
                if (qVar.mo107739a()) {
                    intent.putExtra("key_req_result", new SightCaptureResult(true, qVar.f226143b));
                } else {
                    C101783gu2 gu22 = new C101783gu2();
                    gu22.f298309e = true;
                    gu22.f298308d = false;
                    String str = qVar.f226143b;
                    intent.putExtra("key_req_result", new SightCaptureResult(true, str, qVar.f226144c, C86013q1.m106457r(str), MD5.getMD5(str), (int) (qVar.f226145d / 1000), gu22));
                }
                mMActivity.triggerActivityResult(17, rVar.f226147b, intent);
            }
        }
        SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: w8 */
    public static boolean m122313w8() {
        SnsMethodCalculate.markStartTimeMs("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean e = C38993b.m41995e("clicfg_sns_cancel_camera_sheet", false);
        SnsMethodCalculate.markEndTimeMs("isCancelCameraSheet", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return e;
    }

    /* renamed from: x8 */
    public static void m122314x8(Activity activity) {
        SnsMethodCalculate.markStartTimeMs("onClickSecondCut", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean b = C46072b.f124220a.mo71508b(activity, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        C76879j.m92739j(activity, b ? C0966R.string.f7988yg : C0966R.string.f7987yf, C0966R.string.a3h, C0966R.string.a18, C0966R.string.f7926wf, new SnsTimeLineUI$$a(b, activity), new SnsTimeLineUI$$b(b));
        SnsMethodCalculate.markEndTimeMs("onClickSecondCut", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: A8 */
    public final void mo132945A8(int i) {
        SnsMethodCalculate.markStartTimeMs("report20838", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C115669n.INSTANCE.mo160131h(20838, Long.valueOf(C31543z5.m39453c()), Integer.valueOf(f278613V1), Integer.valueOf(f278612U1), C102236a0.m134754l(), Integer.valueOf(f278614W1), Integer.valueOf(i), Integer.valueOf(C46072b.f124220a.mo71508b(this, "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF") ? 1 : 2));
        SnsMethodCalculate.markEndTimeMs("report20838", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: B0 */
    public void mo96527B0(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105924i("MicroMsg.SnsTimeLineUI", "onFpSetSize: ");
        this.f278627F1.removeCallbacks(this.f278672c1);
        this.mUIAction.mo133046x();
        ((C88633e) C88643g.m110546d()).mo123064p(new SnsTimeLineUI$$g(this, hVar, str)).mo123062e(new SnsTimeLineUI$$f(this, hVar, i));
        SnsMethodCalculate.markEndTimeMs("onFpSetSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: D8 */
    public final void mo132946D8(SnsTimeLineUI$$a1 snsTimeLineUI$$a1) {
        SnsMethodCalculate.markStartTimeMs("reportWeishi", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (snsTimeLineUI$$a1.f278723a) {
            Log.m105919d("MicroMsg.SnsTimeLineUI", "report weishi: %s", snsTimeLineUI$$a1.toString());
            C115669n.INSTANCE.kvStat(15827, snsTimeLineUI$$a1.toString());
        }
        SnsMethodCalculate.markEndTimeMs("reportWeishi", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: E8 */
    public void mo132947E8(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setPlayAnimation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (this.f278699y != null) {
            Log.m105925i("MicroMsg.SnsTimeLineUI", "set play animation %s", Boolean.valueOf(z));
            C97979c cVar = this.f278699y;
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setPlayAnimation", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            cVar.f287351g = z;
            if (!z) {
                cVar.notifyDataSetChanged();
            }
            SnsMethodCalculate.markEndTimeMs("setPlayAnimation", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("setPlayAnimation", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: F8 */
    public final void mo132948F8(int i) {
        SnsMethodCalculate.markStartTimeMs("setRefreshAnimVisible", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (f278615X1.booleanValue()) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(i == 0);
            objArr[1] = Util.getStack().toString();
            Log.m105925i("MicroMsg.SnsTimeLineUI", "setRefreshAnimVisible %s %s", objArr);
        }
        this.f278618B.setVisibility(i);
        SnsMethodCalculate.markEndTimeMs("setRefreshAnimVisible", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: H3 */
    public boolean mo132949H3(View view) {
        SnsMethodCalculate.markStartTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        this.f278626F.f276716z.mo133177c();
        this.f278626F.f276691B.mo67390c();
        boolean a = this.f278626F.f276715y.mo133668a(view);
        SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return a;
    }

    /* renamed from: N0 */
    public void mo25887N0(m64 m64) {
        SnsMethodCalculate.markStartTimeMs("notifyComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (m64 != null) {
            C98242p.m126942d(m64.f298787u, 8);
        }
        mo93528H7().mo136934f(C99064d.class);
        SnsMethodCalculate.markEndTimeMs("notifyComment", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: R6 */
    public void mo96528R6(String str, boolean z, int i, C99014h hVar) {
        SnsMethodCalculate.markStartTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105924i("MicroMsg.SnsTimeLineUI", "onNpAddSize: ");
        this.f278627F1.removeCallbacks(this.f278672c1);
        this.mUIAction.mo133046x();
        BaseTimeLine baseTimeLine = this.f278626F;
        if (baseTimeLine == null) {
            Log.m105921e("MicroMsg.SnsTimeLineUI", "baseTimeLine is null,onNpAddSize respMinSeq:%s isOnRecentErr:%b recentErrType:%d", str, Boolean.valueOf(z), Integer.valueOf(i));
            SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return;
        }
        SnsBrowseInfoHelper a = baseTimeLine.f276700g.mo130970a();
        a.getClass();
        SnsMethodCalculate.markStartTimeMs("statNextPageCount", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        a.f275388C0++;
        SnsMethodCalculate.markEndTimeMs("statNextPageCount", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
        ((C88633e) C88643g.m110546d()).mo123064p(new SnsTimeLineUI$$i(this, str)).mo123062e(new SnsTimeLineUI$$h(this, hVar, z, i));
        SnsMethodCalculate.markEndTimeMs("onNpAddSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: W0 */
    public void mo96529W0(String str, String str2, boolean z, int i, C99014h hVar, boolean z2) {
        SnsMethodCalculate.markStartTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105925i("MicroMsg.SnsTimeLineUI", "onOtherAddSize respMaxSeq:%s, respMinSeq:%s", str, str2);
        this.f278627F1.removeCallbacks(this.f278672c1);
        this.mUIAction.mo133046x();
        ((C88633e) C88643g.m110546d()).mo123064p(new SnsTimeLineUI$$k(this)).mo123062e(new SnsTimeLineUI$$j(this, hVar));
        SnsMethodCalculate.markEndTimeMs("onOtherAddSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: a1 */
    public boolean mo132950a1() {
        C43155u8 u8Var;
        C43162z1 z1Var;
        C95733b bVar;
        SnsMethodCalculate.markStartTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        BaseTimeLine baseTimeLine = this.f278626F;
        if (baseTimeLine == null || baseTimeLine.f276715y == null) {
            SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return false;
        }
        Log.m105924i("MicroMsg.SnsTimeLineUI", "removeCommentView: ");
        SnsMethodCalculate.markStartTimeMs("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        BaseTimeLine baseTimeLine2 = this.f278626F;
        if (baseTimeLine2 == null || (bVar = baseTimeLine2.f276716z) == null) {
            SnsMethodCalculate.markEndTimeMs("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            bVar.mo133177c();
            SnsMethodCalculate.markEndTimeMs("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
        SnsMethodCalculate.markStartTimeMs("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        BaseTimeLine baseTimeLine3 = this.f278626F;
        if (baseTimeLine3 == null || (z1Var = baseTimeLine3.f276691B) == null) {
            SnsMethodCalculate.markEndTimeMs("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            z1Var.mo67390c();
            SnsMethodCalculate.markEndTimeMs("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
        SnsMethodCalculate.markStartTimeMs("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        BaseTimeLine baseTimeLine4 = this.f278626F;
        if (baseTimeLine4 == null || (u8Var = baseTimeLine4.f276692C) == null) {
            SnsMethodCalculate.markEndTimeMs("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            u8Var.mo67375b();
            SnsMethodCalculate.markEndTimeMs("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
        IListener iListener = NotInteresetABTestManager.f273611b;
        SnsMethodCalculate.markStartTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        SnsMethodCalculate.markEndTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        boolean d = this.f278626F.f276715y.mo133671d();
        SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return d;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = false;
        Log.m105925i("MicroMsg.SnsTimeLineUI", "dispatchKeyEvent %s", keyEvent.toString());
        int keyboardState = keyboardState();
        BaseTimeLine baseTimeLine = this.f278626F;
        baseTimeLine.getClass();
        SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        if (keyEvent.getKeyCode() == 4 && baseTimeLine.f276708r.getVisibility() == 0) {
            baseTimeLine.f276708r.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            z = true;
        } else {
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        }
        if (!z || keyboardState != 2) {
            boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
            SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return dispatchKeyEvent;
        }
        SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return true;
    }

    public void finalize() {
        SnsMethodCalculate.markStartTimeMs("finalize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105918d("MicroMsg.SnsTimeLineUI", "finalize");
        super.finalize();
        SnsMethodCalculate.markEndTimeMs("finalize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public int getLayoutId() {
        SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return C0966R.C0971layout.c4t;
    }

    public void initView() {
        String str;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        bindJankView(findViewById(C0966R.C0970id.iwc));
        this.mUIAction.f278860p.setDrawingCacheEnabled(false);
        this.f278626F.f276709s = (FrameLayout) findViewById(C0966R.C0970id.kl8);
        C95790g2 Kx0 = C94866e1.Kx0();
        Kx0.getClass();
        SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        int i = Kx0.f279536h;
        SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
        AdListView adListView = (AdListView) this.mUIAction.getSnsListView();
        SnsUIAction snsUIAction = this.mUIAction;
        snsUIAction.getClass();
        SnsMethodCalculate.markStartTimeMs("setExtScrollListener", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction.f278839N = this;
        SnsMethodCalculate.markEndTimeMs("setExtScrollListener", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        C98963o oVar = this.f278640M;
        adListView.getClass();
        SnsMethodCalculate.markStartTimeMs("addStatistic", "com.tencent.mm.plugin.sns.ui.AdListView");
        adListView.f276616d = oVar;
        SnsMethodCalculate.markEndTimeMs("addStatistic", "com.tencent.mm.plugin.sns.ui.AdListView");
        adListView.setTimelineStat(this.f278642N);
        adListView.setTimelineEvent(this.f278645P);
        this.f278645P.mo131075c(C94866e1.Px0());
        Log.m105925i("MicroMsg.SnsTimeLineUI", "oncreate firstPosition %d isToResume: " + this.f278624E, Integer.valueOf(i));
        QFadeImageView qFadeImageView = (QFadeImageView) findViewById(C0966R.C0970id.jvi);
        this.f278618B = qFadeImageView;
        qFadeImageView.setImageResource(C0966R.raw.friendactivity_refresh);
        SnsTimeLineUI$$y0 snsTimeLineUI$$y0 = new SnsTimeLineUI$$y0(this, this.mUIAction.getSnsListView());
        this.f278630H = snsTimeLineUI$$y0;
        snsTimeLineUI$$y0.setInterpolator(new LinearInterpolator());
        this.f278630H.setAnimationListener(new SnsTimeLineUI$$e0(this));
        C98527d dVar = null;
        if (this.f278646P1 == 1) {
            this.f278622D = true;
            dVar = new C98527d(this.f278650R, this.f278658U);
        }
        C94866e1.ny0(this);
        ListView snsListView = this.mUIAction.getSnsListView();
        BaseTimeLine baseTimeLine = this.f278626F;
        this.f278699y = new C97979c(this, snsListView, baseTimeLine.f276693D, baseTimeLine, 10, this.f278653S, dVar, this.f278674e1);
        TimelineClickListener timelineClickListener = this.f278626F.f276693D;
        SnsTimeLineUI$$f0 snsTimeLineUI$$f0 = new SnsTimeLineUI$$f0(this);
        timelineClickListener.getClass();
        SnsMethodCalculate.markStartTimeMs("setOnPostErrorCallback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        timelineClickListener.f280366V = snsTimeLineUI$$f0;
        SnsMethodCalculate.markEndTimeMs("setOnPostErrorCallback", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        this.f278626F.f276707q = this.f278699y.mo137288g();
        this.f278699y.mo137295j().f286196g = new SnsTimeLineUI$$g0(this);
        TestTimeForSns testTimeForSns = (TestTimeForSns) this.f278626F.f276709s;
        this.f278632I = testTimeForSns;
        testTimeForSns.setListener(new SnsTimeLineUI$$h0(this));
        ListView listView = this.mUIAction.f278851d;
        float[] fArr = {0.0f};
        float[] fArr2 = {0.0f};
        if ((listView instanceof AdListView) && this.f278699y.mo137288g().f278568b.mo132094p()) {
            ((AdListView) listView).setOnDispatchTouchListener(new SnsTimeLineUI$$i0(this, fArr, fArr2));
        }
        this.mUIAction.f278851d.setOnTouchListener(new SnsTimeLineUI$$j0(this));
        this.mUIAction.f278851d.post(new SnsTimeLineUI$$k0(this));
        this.mUIAction.f278854g.mo137550f(new SnsTimeLineUI$$l0(this));
        this.f278626F.f276708r = (SnsCommentFooter) findViewById(C0966R.C0970id.bjo);
        this.f278667Y0 = new C100905b(this, this.f278626F.f276708r);
        this.f278626F.f276708r.post(new SnsTimeLineUI$$m0(this));
        BaseTimeLine baseTimeLine2 = this.f278626F;
        baseTimeLine2.f276710t = new C96116p8(this.mUIAction.f278851d, baseTimeLine2.f276708r);
        LinearLayout linearLayout = (LinearLayout) this.mUIAction.f278860p.findViewById(C0966R.C0970id.jux);
        this.f278702z = linearLayout;
        linearLayout.findViewById(C0966R.C0970id.jut).setOnClickListener(new SnsTimeLineUI$$n0(this));
        this.f278616A = (LinearLayout) this.mUIAction.f278860p.findViewById(C0966R.C0970id.juy);
        this.f278626F.f276711u = new C96227t4(this);
        mo132952n8();
        mo132958v8();
        SnsMethodCalculate.markStartTimeMs("initNormalOperate", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (this.f278646P1 == 0) {
            setMMTitle((int) C0966R.string.jj4);
            SnsMethodCalculate.markEndTimeMs("initNormalOperate", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            SnsMethodCalculate.markStartTimeMs("initUserPageMMTitle", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            if (this.f278658U) {
                setMMTitle((int) C0966R.string.jfy);
            } else {
                Log.m105919d("MicroMsg.SnsTimeLineUI", "SnsUserUI, userName:%s, title:%s", this.f278650R, this.mUIAction.f278855h);
                C72996z1 z1Var = C94866e1.Jx0().get(this.f278650R);
                if (z1Var != null) {
                    Log.m105918d("MicroMsg.SnsTimeLineUI", "SnsUserUI, contact is not null");
                    str = z1Var.mo62898f();
                } else {
                    Log.m105919d("MicroMsg.SnsTimeLineUI", "SnsUserUI, contact is null, title:%s", this.mUIAction.f278855h);
                    str = this.mUIAction.f278855h;
                }
                setMMTitle(C102236a0.m134771t0(str));
            }
            SnsMethodCalculate.markEndTimeMs("initUserPageMMTitle", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            mo132948F8(8);
            SnsMethodCalculate.markEndTimeMs("initNormalOperate", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
        SnsMethodCalculate.markStartTimeMs("getGpuMaxTextureSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105925i("MicroMsg.SnsTimeLineUI", "getGpuMaxTextureSize %s", Boolean.valueOf(BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG));
        SnsMethodCalculate.markEndTimeMs("getGpuMaxTextureSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        ForceGpuUtil.setMaxTextureGet(true);
        int maxTextureSize = ForceGpuUtil.getMaxTextureSize();
        if (maxTextureSize <= 2048) {
            C115669n.INSTANCE.mo175911u(1198, 7);
        } else if (maxTextureSize <= 4096) {
            C115669n.INSTANCE.mo175911u(1198, 8);
        } else if (maxTextureSize <= 6144) {
            C115669n.INSTANCE.mo175911u(1198, 9);
        } else if (maxTextureSize <= 8192) {
            C115669n.INSTANCE.mo175911u(1198, 10);
        } else {
            C115669n.INSTANCE.mo175911u(1198, 11);
        }
        SnsMethodCalculate.markStartTimeMs("setupSnsUnreadFloatBtn", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.jwz);
        this.f278697x0 = viewGroup;
        viewGroup.setOnClickListener(new C96083n6(this));
        this.f278697x0.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = C74942w4.m89784a(getContext(), 24) + C75044y4.m89989a(getContext()) + C75044y4.m89994f(getContext());
        layoutParams.addRule(14);
        this.f278697x0.setLayoutParams(layoutParams);
        SnsMethodCalculate.markEndTimeMs("setupSnsUnreadFloatBtn", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public boolean isCallSuperOnSaveInstanceState() {
        SnsMethodCalculate.markStartTimeMs("isCallSuperOnSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = true;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_media_opt_saveinstance, true);
        boolean z2 = C85875k4.m106157N() || C85875k4.m106210y();
        if (!wf || !z2) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isCallSuperOnSaveInstanceState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return z;
    }

    /* renamed from: j2 */
    public void mo96540j2(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public int keyboardState() {
        SnsMethodCalculate.markStartTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C100905b bVar = this.f278667Y0;
        if (bVar == null || !bVar.mo140370b()) {
            int keyboardState = super.keyboardState();
            SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return keyboardState;
        }
        int c = this.f278667Y0.mo140371c();
        SnsMethodCalculate.markEndTimeMs("keyboardState", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return c;
    }

    /* renamed from: l4 */
    public void mo25910l4(long j) {
        SnsMethodCalculate.markStartTimeMs("notifyHbReward", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (this.f278655S1) {
            SnsMethodCalculate.markEndTimeMs("notifyHbReward", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return;
        }
        Log.m105926v("MicroMsg.SnsTimeLineUI", "notifyHbReward imp");
        this.f278655S1 = true;
        C94866e1.ly0().postDelayed(new SnsTimeLineUI$$t0(this), 1000);
        SnsMethodCalculate.markEndTimeMs("notifyHbReward", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: n8 */
    public final void mo132952n8() {
        BaseTimeLine baseTimeLine;
        SnsCommentFooter snsCommentFooter;
        BaseTimeLine baseTimeLine2;
        SnsCommentFooter snsCommentFooter2;
        SnsMethodCalculate.markStartTimeMs("addOpotionMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (this.f278646P1 == 1) {
            if (!this.f278658U) {
                enableOptionMenu(false);
            } else {
                addIconOptionMenu(0, getString(C0966R.string.f361382jf2), (int) C0966R.raw.actionbar_list_icon, (MenuItem.OnMenuItemClickListener) new SnsTimeLineUI$$x(this));
            }
            SnsMethodCalculate.markEndTimeMs("addOpotionMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return;
        }
        addIconOptionMenu(0, (int) C0966R.string.j97, (int) C0966R.raw.icons_filled_camera, (MenuItem.OnMenuItemClickListener) new SnsTimeLineUI$$y(this), (View.OnLongClickListener) new SnsTimeLineUI$$z(this));
        boolean booleanExtra = getIntent().getBooleanExtra("sns_timeline_NeedShowPushlistDialog", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("sns_timeline_NeedShowPulistText", false);
        if (!(!booleanExtra || (baseTimeLine2 = this.f278626F) == null || (snsCommentFooter2 = baseTimeLine2.f276708r) == null)) {
            snsCommentFooter2.postDelayed(new SnsTimeLineUI$$a0(this), 150);
        }
        if (!(!booleanExtra2 || (baseTimeLine = this.f278626F) == null || (snsCommentFooter = baseTimeLine.f276708r) == null)) {
            snsCommentFooter.postDelayed(new SnsTimeLineUI$$b0(this), 200);
        }
        SnsMethodCalculate.markEndTimeMs("addOpotionMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: o8 */
    public final boolean mo132953o8(C92312b bVar) {
        SnsMethodCalculate.markStartTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Rect displayRect = bVar.getDisplayRect();
        if (displayRect == null) {
            SnsMethodCalculate.markEndTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return false;
        }
        int l = this.mActionBar.mo91101l() + C85875k4.m106200p(this);
        Log.m105925i("MicroMsg.SnsTimeLineUI", "lxl checkItemVisible actionbar height:%s, total height:%s, screenHeight:%s, top:%s, bottom:%s", Integer.valueOf(this.mActionBar.mo91101l()), Integer.valueOf(l), Integer.valueOf(getResources().getDisplayMetrics().heightPixels), Integer.valueOf(displayRect.top), Integer.valueOf(displayRect.bottom));
        int i = displayRect.bottom;
        if (i > l && i > l + ((i - displayRect.top) / 2)) {
            int i2 = getResources().getDisplayMetrics().heightPixels;
            int i3 = displayRect.top;
            if (i2 - i3 > (displayRect.bottom - i3) / 2) {
                SnsMethodCalculate.markEndTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkItemVisible", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        TimelineClickListener timelineClickListener;
        C96014c cVar;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105927v("MicroMsg.SnsTimeLineUI", "on ActivityResult, requestCode %d, resultCode %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 15) {
            BaseTimeLine baseTimeLine = this.f278626F;
            if (!(baseTimeLine == null || (timelineClickListener = baseTimeLine.f276693D) == null || (cVar = timelineClickListener.f280381k) == null)) {
                cVar.mo133563k(i, i2, intent);
                MMHandlerThread.postToMainThreadDelayed(new SnsTimeLineUI$$v0(this), 300);
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else if (i == 16) {
            Log.m105924i("MicroMsg.SnsTimeLineUI", "REQUEST_CODE_FOR_FULLSCREEN");
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            if (i == 2333 && intent != null) {
                String stringExtra = intent.getStringExtra("Select_Contact");
                if (!Util.isNullOrNil(stringExtra)) {
                    String[] split = stringExtra.split(",");
                    if (split.length > 0) {
                        this.f278626F.f276708r.mo132681C();
                        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(split[0]);
                        if (!Util.isNullOrNil(displayName)) {
                            this.f278626F.f276708r.mo132696p();
                            SnsCommentFooter snsCommentFooter = this.f278626F.f276708r;
                            snsCommentFooter.setText("@" + displayName + " ");
                            SnsCommentFooter snsCommentFooter2 = this.f278626F.f276708r;
                            snsCommentFooter2.setCommentAtPrefix("@" + displayName + " ");
                            this.f278626F.f276708r.setCommentInfo(new w64());
                            this.f278626F.f276708r.getCommentInfo().f299703d = split[0];
                            this.f278626F.f276708r.setCommentFlag(8);
                        }
                    }
                }
            }
            super.onActivityResult(i, i2, intent);
            this.mUIAction.mo133039q(i, i2, intent);
            if (i == 11) {
                this.f278696x.mo137501a(((SnsTimeLineUI$$p) this.f278631H1).getType(), this.f278650R, this.f278656T, this.f278658U, this.f278660V);
                SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                return;
            }
            SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
    }

    public void onBackPressed() {
        SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (!this.mUIAction.mo133040r()) {
            finish();
        }
        SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onConfigurationChanged(Configuration configuration) {
        SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        super.onConfigurationChanged(configuration);
        Log.m105924i("MicroMsg.SnsTimeLineUI", "onConfigurationChanged");
        new ConfigurationChangedEvent().publish();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Point point = new Point();
        point.x = displayMetrics.widthPixels;
        point.y = displayMetrics.heightPixels;
        C94866e1.uy0(point);
        C98249r.m126976a();
        C98249r.f288050e.mo137554e();
        C98241o.m126934a();
        C98241o.f288030d.mo137542d();
        C99336c.f291266b.mo138731a();
        SnsTimeLineBaseAdapter g = this.f278699y.mo137288g();
        g.getClass();
        SnsMethodCalculate.markStartTimeMs("cleanAboutConfig", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        g.f278584r.clear();
        g.f278585s.clear();
        SnsMethodCalculate.markEndTimeMs("cleanAboutConfig", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        this.f278699y.mo137295j().resolvedClear();
        SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onCreate(Bundle bundle) {
        C13598b0 b0Var;
        Class cls;
        String str;
        boolean z;
        Class<C99063c> cls2;
        C99063c cVar;
        SnsHeader snsHeader;
        C94895m2 m2Var;
        C94895m2 m2Var2;
        C99056a aVar;
        int i;
        String[] strArr;
        Bundle bundle2 = bundle;
        Class<C99063c> cls3 = C99063c.class;
        Class cls4 = C45696d.class;
        Class cls5 = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C85875k4.m106195m0(this);
        ArrayList<IListener<?>> arrayList = TimelineItemClickEventCenter.f280079a;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        TimelineItemClickEventCenter.f280080b = this;
        Iterator<IListener<?>> it = TimelineItemClickEventCenter.f280079a.iterator();
        while (it.hasNext()) {
            it.next().alive();
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter");
        C97540j.f286244a.mo136811c();
        C94891k2 k2Var = C94891k2.f274975a;
        int i2 = this.f278669Z0;
        k2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("wsUnFoldClickCountMax", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        Log.m105924i("MicroMsg.SnsWsFoldManager", "set wsUnFoldClickCountMax = " + i2);
        C94891k2.f274977c = i2;
        SnsMethodCalculate.markEndTimeMs("wsUnFoldClickCountMax", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        long j = this.f278670a1;
        SnsMethodCalculate.markStartTimeMs("secondClickWsFriendFeedTimeInterval", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        Log.m105924i("MicroMsg.SnsWsFoldManager", "set secondClickWsFriendFeedTimeInterval = " + j);
        C94891k2.f274978d = j;
        SnsMethodCalculate.markEndTimeMs("secondClickWsFriendFeedTimeInterval", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        long j2 = this.f278671b1;
        SnsMethodCalculate.markStartTimeMs("wsUnFoldTimeOutTimeInterval", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        Log.m105924i("MicroMsg.SnsWsFoldManager", "set wsUnFoldTimeOutTimeInterval = " + j2);
        C94891k2.f274979e = j2;
        SnsMethodCalculate.markEndTimeMs("wsUnFoldTimeOutTimeInterval", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        SnsMethodCalculate.markStartTimeMs("loadUnFoldWsUserName", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        String[] allKeys = C94891k2.f274976b.allKeys();
        C94891k2.f274980f.clear();
        if (allKeys != null) {
            int length = allKeys.length;
            int i3 = 0;
            while (i3 < length) {
                String str2 = allKeys[i3];
                String string = C94891k2.f274976b.getString(str2, "");
                if (!TextUtils.isEmpty(string)) {
                    C94955u2 a = C94955u2.f275271e.mo131291a(string);
                    long currentTimeMillis = System.currentTimeMillis();
                    SnsMethodCalculate.markStartTimeMs("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    strArr = allKeys;
                    i = length;
                    long j3 = a.f275273b;
                    SnsMethodCalculate.markEndTimeMs("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    long j4 = currentTimeMillis - j3;
                    SnsMethodCalculate.markStartTimeMs("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    long j5 = a.f275273b;
                    SnsMethodCalculate.markEndTimeMs("getLastUnFoldTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                    if (j5 != -1 && j4 <= C94891k2.f274979e) {
                        CopyOnWriteArrayList<String> copyOnWriteArrayList = C94891k2.f274980f;
                        SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        String str3 = a.f275272a;
                        SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        copyOnWriteArrayList.add(str3);
                    } else if (j4 > C94891k2.f274979e) {
                        a.mo131287b(-1);
                        SnsMethodCalculate.markStartTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        a.f275275d = 0;
                        SnsMethodCalculate.markEndTimeMs("setClickFeedCount", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        SnsMethodCalculate.markStartTimeMs("setLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        a.f275274c = 0;
                        SnsMethodCalculate.markEndTimeMs("setLastClickFeedTime", "com.tencent.mm.plugin.sns.model.WsFoldData");
                        ((C119157j) C119157j.f356862d).mo183875f(new C94885j2(str2, a));
                    }
                } else {
                    strArr = allKeys;
                    i = length;
                }
                i3++;
                allKeys = strArr;
                length = i;
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.SnsWsFoldManager", "[loadUnFoldWsUserName] allKeys empty");
        }
        SnsMethodCalculate.markEndTimeMs("loadUnFoldWsUserName", "com.tencent.mm.plugin.sns.model.SnsWsFoldManager");
        Boolean bool = f278611T1;
        if (bool == null) {
            f278611T1 = Boolean.valueOf(C85875k4.m106211z());
            C98249r.m126977f();
        } else if (bool.booleanValue() != C85875k4.m106211z()) {
            Log.m105924i("MicroMsg.SnsTimeLineUI", "dancy test UIMode change!!");
            f278611T1 = Boolean.valueOf(C85875k4.m106211z());
            C98249r.m126977f();
        }
        C32163a.m39642c();
        C94866e1.hy0().mo131034t(true);
        C94974y1 fy02 = C94866e1.fy0();
        fy02.getClass();
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        C32735h.C32737c cVar2 = C32735h.C32737c.clicfg_timeline_unread_jump_indicator_expose_interval_android;
        C32735h.C32737c cVar3 = C32735h.C32737c.clicfg_timeline_unread_jump_read_continuous_feeds_android;
        C32735h.C32737c cVar4 = C32735h.C32737c.clicfg_timeline_unread_jump_indicator_index_offset_android;
        C32735h.C32737c cVar5 = C32735h.C32737c.clicfg_timeline_unread_jump_not_ws_percent_android;
        C32735h.C32737c cVar6 = C32735h.C32737c.clicfg_timeline_unread_jump_max_interval_android;
        C32735h.C32737c cVar7 = C32735h.C32737c.clicfg_timeline_unread_jump_min_skip_feeds_android;
        C32735h.C32737c cVar8 = C32735h.C32737c.clicfg_timeline_unread_jump_min_feeds_android;
        C32735h.C32737c cVar9 = C32735h.C32737c.clicfg_timeline_unread_jump_min_interval_android;
        Class<C99063c> cls6 = cls3;
        SnsMethodCalculate.markStartTimeMs("updateConfig", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (BuildInfo.DEBUG) {
            fy02.f275347b = true;
            fy02.f275348c = 1;
            fy02.f275349d = 86400;
            fy02.f275350e = 1;
            fy02.f275351f = 1;
            fy02.f275352g = 50;
            fy02.f275354i = 2;
            fy02.f275353h = 3;
            fy02.f275355j = 0;
            cls = cls4;
            str = "updateConfig";
        } else if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            cls = cls4;
            str = "updateConfig";
            fy02.f275347b = true;
            fy02.f275348c = (long) ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar9, 3600);
            fy02.f275350e = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar8, 5);
            fy02.f275351f = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar7, 10);
            fy02.f275349d = ((C32735h) C86312j.m106911c(cls5)).mo58777He(cVar6, 86400);
            fy02.f275352g = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar5, 0);
            fy02.f275354i = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar4, 1);
            fy02.f275353h = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar3, 2);
            fy02.f275355j = (long) ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar2, 14400);
        } else {
            cls = cls4;
            fy02.f275347b = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(C32735h.C32737c.clicfg_timeline_unread_jump_switch_android, 1) == 1;
            str = "updateConfig";
            fy02.f275348c = (long) ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar9, 3600);
            fy02.f275350e = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar8, 5);
            fy02.f275351f = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar7, 10);
            fy02.f275349d = ((C32735h) C86312j.m106911c(cls5)).mo58777He(cVar6, 86400);
            fy02.f275352g = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar5, 0);
            fy02.f275354i = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar4, 1);
            fy02.f275353h = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar3, 2);
            fy02.f275355j = (long) ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(cVar2, 14400);
        }
        Log.m105925i("MicroMsg.SnsUnreadTipManager", "jumpEnable:%s, jumpMinInterval:%s, jumpMaxInterval:%s, jumpMinFeedsCount:%s, jumpMinFeedsGapCount:%s, jumpNotWsPercent:%s, jumpIndicatorIndexOffset:%s, jumpReadContinuousCount:%s, jumpIndicatorExposeInterval:%s", Boolean.valueOf(fy02.f275347b), Long.valueOf(fy02.f275348c), Long.valueOf(fy02.f275349d), Integer.valueOf(fy02.f275350e), Integer.valueOf(fy02.f275351f), Integer.valueOf(fy02.f275352g), Integer.valueOf(fy02.f275354i), Integer.valueOf(fy02.f275353h), Long.valueOf(fy02.f275355j));
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        SnsMethodCalculate.markStartTimeMs("prepareLastUnreadTipFaultReadCache", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (fy02.f275347b) {
            String str4 = C94866e1.m120262YO() + "snsUnread.proto";
            fy02.f275346a = str4;
            try {
                byte[] O = C86013q1.m106433O(str4, 0, -1);
                if (O != null && O.length > 0) {
                    fy02.f275366u.parseFrom(O);
                    int e = C31543z5.m39455e();
                    Log.m105925i("MicroMsg.SnsUnreadTipManager", "unreadSnsIdList.indicatorExposeTime:%s, now:%s, jumpIndicatorExposeInterval:%s", Long.valueOf(fy02.f275366u.f292915f), Integer.valueOf(e), Long.valueOf(fy02.f275355j));
                    C99967m mVar = fy02.f275366u;
                    long j6 = mVar.f292915f;
                    int i4 = (j6 > 0 ? 1 : (j6 == 0 ? 0 : -1));
                    if (i4 > 0 && ((long) e) - j6 > fy02.f275355j) {
                        mVar.f292915f = 0;
                    } else if (i4 < 0) {
                        mVar.f292915f = 0;
                    }
                    fy02.f275371z = mVar.f292915f;
                    SnsMethodCalculate.markStartTimeMs("genExposeBtnId", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    C94866e1.my0().post(new C94979z1(fy02));
                    SnsMethodCalculate.markEndTimeMs("genExposeBtnId", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                }
            } catch (Exception e2) {
                Log.m105929w("MicroMsg.SnsUnreadTipManager", "Exception:%s", e2.getMessage());
            }
            SnsMethodCalculate.markStartTimeMs("removeDepreatFault", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            if (!Util.isNullOrNil((List) fy02.f275366u.f292913d)) {
                Iterator<C99968n> it4 = fy02.f275366u.f292913d.iterator();
                while (it4.hasNext()) {
                    C99968n next = it4.next();
                    SnsMethodCalculate.markStartTimeMs("isFaultDepreated", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    boolean z2 = Util.secondsToNow(next.f292917e) > fy02.f275349d;
                    SnsMethodCalculate.markEndTimeMs("isFaultDepreated", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
                    if (z2) {
                        Log.m105925i("MicroMsg.SnsUnreadTipManager", "prepareLastUnreadTipFaultReadCache remove invalid fault:[%s, %s]", Long.valueOf(next.f292917e), Integer.valueOf(next.f292916d.size()));
                        it4.remove();
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("removeDepreatFault", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
            fy02.mo131305f();
            Log.m105925i("MicroMsg.SnsUnreadTipManager", "firstUnreadId:%s unreadSnsIdList.lastSnsId:%s", Long.valueOf(fy02.f275358m), Long.valueOf(fy02.f275366u.f292914e));
        }
        SnsMethodCalculate.markEndTimeMs("prepareLastUnreadTipFaultReadCache", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        SnsMethodCalculate.markStartTimeMs("dumpUnreadFault", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        if (fy02.f275347b) {
            Log.m105924i("MicroMsg.SnsUnreadTipManager", "==============dumpSnsUnreadFault==============");
            if (Util.isNullOrNil((List) fy02.f275366u.f292913d)) {
                Log.m105924i("MicroMsg.SnsUnreadTipManager", "** unread fault is null **");
            } else {
                Log.m105925i("MicroMsg.SnsUnreadTipManager", "** unread fault count:%s **", Integer.valueOf(fy02.f275366u.f292913d.size()));
                Iterator<C99968n> it5 = fy02.f275366u.f292913d.iterator();
                while (it5.hasNext()) {
                    C99968n next2 = it5.next();
                    int i5 = 1;
                    Log.m105925i("MicroMsg.SnsUnreadTipManager", "** [%s, %s] **", Long.valueOf(next2.f292917e), Integer.valueOf(next2.f292916d.size()));
                    Iterator<Long> it6 = next2.f292916d.iterator();
                    while (it6.hasNext()) {
                        Object[] objArr = new Object[i5];
                        objArr[0] = it6.next();
                        Log.m105925i("MicroMsg.SnsUnreadTipManager", "|__ snsId:%s", objArr);
                        i5 = 1;
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("dumpUnreadFault", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        fy02.f275337A = ((C59774i) C86312j.m106911c(C59774i.class)).hm0();
        C94969x1 x1Var = fy02.f275343G;
        x1Var.getClass();
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.model.SnsUnreadPreloader");
        C86709a0.m107529k().f251779b.mo123455a(211, x1Var);
        int Qe = ((C32735h) C86312j.m106911c(cls5)).mo58779Qe(C32735h.C32737c.clicfg_timeline_unread_jump_preload_max_count_android, 50);
        x1Var.f275315f = Qe;
        Log.m105925i("MicroMsg.SnsUnreadPreloader", "onCreate PRELOAD_MAX_COUNT:%s", Integer.valueOf(Qe));
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.model.SnsUnreadPreloader");
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        C94866e1.cy0().mo131279c();
        if (C86709a0.m107533q(cls) != null) {
            ((C45696d) C86709a0.m107533q(cls)).Xe0("__sns_timeline__");
        }
        MMActivityController mMActivityController = this.mController;
        if (mMActivityController != null) {
            mMActivityController.f348089b0 = 2;
            z = true;
            mMActivityController.f348091c0 = true;
        } else {
            z = true;
        }
        getIntent().setExtrasClassLoader(getClass().getClassLoader());
        supportRequestWindowFeature(109);
        customfixStatusbar(z);
        Bundle bundle3 = bundle;
        if (bundle3 != null) {
            ((C77572l) C86312j.m106911c(C77572l.class)).mo107611FI(this, bundle3, new SnsTimeLineUI$$c(this));
        }
        super.onCreate(bundle);
        if (!C86709a0.m107523b().mo121114l()) {
            finish();
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return;
        }
        MultiProcessMMKV.getMMKV("SnsMMKV").encode("SnsMMKVSnsUI", true);
        SnsMethodCalculate.markStartTimeMs("fixActionBarStuff", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        View findViewById = findViewById(C0966R.C0970id.f5383do);
        this.f278703z1 = findViewById;
        if (findViewById == null || !C87771d.f254121g) {
            SnsMethodCalculate.markEndTimeMs("fixActionBarStuff", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        } else {
            C87771d b = C87771d.m109203b(this);
            C96002k6 k6Var = new C96002k6(this);
            this.mStatusBarHeightCallback = k6Var;
            b.mo122180d(k6Var);
            getWindow().getDecorView().requestApplyInsets();
            C87773e.m109211d(getWindow());
            SnsMethodCalculate.markEndTimeMs("fixActionBarStuff", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        C74779i.m89536a(this, defaultPreference != null ? defaultPreference.getBoolean("Main_need_read_top_margin", false) : false);
        this.f278628G = (int) (((double) getResources().getDisplayMetrics().heightPixels) * 0.4d);
        setActionbarColor(getContext().getResources().getColor(C0966R.color.ahf));
        hideActionbarLine();
        setNavigationbarColor(getContext().getResources().getColor(C0966R.color.f2929c));
        this.f278646P1 = getIntent().getIntExtra("sns_adapter_type", 0);
        this.f278622D = getIntent().getBooleanExtra("sns_timeline_NeedFirstLoadint", false);
        this.mActionBar = getSupportActionBar();
        SnsMethodCalculate.markStartTimeMs("updateAbTestCfg", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        C100151a.m130851l(1);
        SnsMethodCalculate.markEndTimeMs("updateAbTestCfg", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        C95741b5 b5Var = this.f278685p0;
        SnsTimeLineUI$$r snsTimeLineUI$$r = new SnsTimeLineUI$$r(this);
        b5Var.getClass();
        SnsMethodCalculate.markStartTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        b5Var.f279253a = snsTimeLineUI$$r;
        SnsMethodCalculate.markEndTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        this.f278666Y = C33418b.f90548a.mo59132a(this.f278685p0);
        ((C119157j) C119157j.f356862d).mo183875f(new SnsTimeLineUI$$s(this));
        this.f278694w.mo136931a(C99064d.class, this.f278633I1);
        C98212c cVar10 = this.f278696x;
        int i6 = this.f278646P1;
        ((SnsTimeLineUI$$p) this.f278631H1).getType();
        Intent intent = getIntent();
        C99059b bVar = this.f278692v;
        cVar10.getClass();
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        cVar10.f287957c = i6;
        cVar10.f287958d = true;
        if (i6 == 0) {
            C98211b bVar2 = cVar10.f287955a;
            bVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("setmSnsInteractorGlueApi", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            bVar2.f287953a = bVar;
            if (bVar != null) {
                SnsMethodCalculate.markStartTimeMs("originalApi", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi");
                aVar = bVar.f290372a;
                SnsMethodCalculate.markEndTimeMs("originalApi", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractorGlueApi");
            } else {
                aVar = null;
            }
            bVar2.f287954b = aVar;
            SnsMethodCalculate.markEndTimeMs("setmSnsInteractorGlueApi", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            C98211b bVar3 = cVar10.f287955a;
            bVar3.getClass();
            SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            C99056a aVar2 = bVar3.f287954b;
            aVar2.getClass();
            SnsMethodCalculate.markStartTimeMs("setSnsServerCallback", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            aVar2.f290367v = C94866e1.dy0();
            cls2 = cls6;
            aVar2.f290369x = this;
            aVar2.f290367v.mo6423t(1, ((C99063c) aVar2.mo136933c(cls2)).f290379a, aVar2.f290369x);
            SnsMethodCalculate.markEndTimeMs("setSnsServerCallback", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
            SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        } else {
            cls2 = cls6;
            C99063c cVar11 = new C99063c();
            cVar10.f287956b = cVar11;
            cVar11.f290379a = intent.getStringExtra("sns_userName");
            cVar10.f287956b.f290380b = C75592q0.m90789s();
            C99063c cVar12 = cVar10.f287956b;
            C86709a0.m107528h();
            cVar12.f290383e = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69724s3(cVar10.f287956b.f290379a);
            String s = C75592q0.m90789s();
            C99063c cVar13 = cVar10.f287956b;
            cVar13.f290384f = s.equals(cVar13.f290379a);
            cVar10.f287956b.f290385g = intent.getIntExtra("sns_source", 0);
            cVar10.f287956b.f290381c = Util.nullAs(intent.getStringExtra("sns_nickName"), "");
            cVar10.f287956b.f290382d = Util.nullAs(intent.getStringExtra("sns_signature"), "");
            SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        }
        C98212c cVar14 = this.f278696x;
        cVar14.getClass();
        SnsMethodCalculate.markStartTimeMs("getHeaderInfoStruct", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        if (cVar14.f287957c == 0) {
            C98211b bVar4 = cVar14.f287955a;
            bVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("getHeaderInfoStruct", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            cVar = (C99063c) bVar4.f287954b.mo136933c(cls2);
            SnsMethodCalculate.markEndTimeMs("getHeaderInfoStruct", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager");
            SnsMethodCalculate.markEndTimeMs("getHeaderInfoStruct", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        } else {
            cVar = cVar14.f287956b;
            SnsMethodCalculate.markEndTimeMs("getHeaderInfoStruct", "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository");
        }
        this.f278650R = cVar.f290379a;
        this.f278653S = cVar.f290380b;
        this.f278656T = cVar.f290383e;
        this.f278658U = cVar.f290384f;
        this.f278660V = cVar.f290385g;
        String str5 = cVar.f290381c;
        String str6 = cVar.f290382d;
        this.f278662W = C74928u.m89762a("123");
        this.f278664X = String.valueOf(System.currentTimeMillis());
        SnsUIAction snsUIAction = new SnsUIAction(this);
        this.mUIAction = snsUIAction;
        snsUIAction.f278834I = false;
        String str7 = this.f278662W;
        SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction.f278835J = str7;
        SnsHeader snsHeader2 = snsUIAction.f278860p;
        if (snsHeader2 != null) {
            snsHeader2.setSessionId(str7);
        }
        SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsUIAction snsUIAction2 = this.mUIAction;
        String str8 = this.f278664X;
        snsUIAction2.getClass();
        SnsMethodCalculate.markStartTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction2.f278836K = str8;
        SnsMethodCalculate.markEndTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        SnsUIAction snsUIAction3 = this.mUIAction;
        SnsUIAction.C95669n nVar = this.f278631H1;
        snsUIAction3.getClass();
        SnsMethodCalculate.markStartTimeMs("setUIActionCallback", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction3.f278868x = nVar;
        SnsMethodCalculate.markEndTimeMs("setUIActionCallback", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.mUIAction.mo133027C(this.mActionBar.mo91099j());
        ((MMNotification) ((C79690d) C86312j.m106911c(C79690d.class)).mo109806kA()).mo93208f(2);
        C98249r.m126976a();
        C98249r rVar = C98249r.f288050e;
        rVar.mo137554e();
        C98241o.m126934a();
        C98241o oVar = C98241o.f288030d;
        oVar.mo137542d();
        C98249r.m126976a();
        rVar.mo137555g(this);
        C98241o.m126934a();
        oVar.mo137543e(this);
        BaseTimeLine baseTimeLine = new BaseTimeLine(this, getIntent().getBooleanExtra("is_sns_notify_open", true) ? 1 : 0, Util.nullAs(getIntent().getStringExtra("new_feed_id"), ""), getIntent().getIntExtra("sns_unread_count", 0), this.f278664X);
        this.f278626F = baseTimeLine;
        SnsTimeLineUI$$t snsTimeLineUI$$t = new SnsTimeLineUI$$t(this);
        SnsMethodCalculate.markStartTimeMs("setUnreadTipClickListener", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        baseTimeLine.f276703j = snsTimeLineUI$$t;
        SnsMethodCalculate.markEndTimeMs("setUnreadTipClickListener", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f278624E = getIntent().getBooleanExtra("sns_resume_state", true);
        if (C94866e1.qy0()) {
            this.f278624E = false;
        } else if (this.f278624E) {
            this.f278624E = C94866e1.Kx0().mo133243f();
        }
        this.f278620C = this.f278624E;
        SnsUIAction snsUIAction4 = this.mUIAction;
        String str9 = this.f278653S;
        String str10 = this.f278650R;
        boolean z3 = this.f278658U;
        snsUIAction4.getClass();
        SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction4.f278843S = str9;
        snsUIAction4.f278844T = str10;
        snsUIAction4.f278845U = str5;
        snsUIAction4.f278846V = str6;
        snsUIAction4.f278847W = z3;
        SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.mUIAction.mo133041s(true);
        C94866e1.Px0().mo138366d();
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(213, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(C1795c0.CTRL_INDEX, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(218, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(211, this);
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(683, this);
        C101690c.f297710a.mo141143j(this.f278701y1);
        C96254a.m123394d().mo133935h();
        SnsMethodCalculate.markStartTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        ((C77049b) C86312j.m106911c(C77049b.class)).Kn0(this, new C45420d(1));
        SnsMethodCalculate.markEndTimeMs("registerReporterData", "com.tencent.mm.plugin.sns.reportflow.SnsTagSearchSpanClickReportFlow$Companion");
        initView();
        C99021b Px0 = C94866e1.Px0();
        ListView listView = this.mUIAction.f278851d;
        this.f278699y.mo137288g();
        Px0.getClass();
        SnsMethodCalculate.markStartTimeMs("initListView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        Px0.getClass();
        SnsMethodCalculate.markEndTimeMs("initListView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        C99021b Px02 = C94866e1.Px0();
        Px02.getClass();
        SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        C86709a0.m107528h();
        C86709a0.m107529k().f251779b.mo123455a(291, Px02);
        SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        if (C94866e1.qy0()) {
            this.f278624E = false;
        } else if (this.f278624E) {
            this.f278624E = C94866e1.Kx0().mo133243f();
        }
        C99056a aVar3 = this.f278694w;
        C98525b j7 = this.f278699y.mo137295j();
        aVar3.getClass();
        SnsMethodCalculate.markStartTimeMs("setSnsTimelineVending", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
        aVar3.f290368w = j7;
        aVar3.f286518e.keep(aVar3.f290368w);
        SnsMethodCalculate.markEndTimeMs("setSnsTimelineVending", "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor");
        if (!this.f278624E || this.f278646P1 != 0) {
            this.mUIAction.f278851d.setAdapter(this.f278699y);
            mo132948F8(0);
            C97979c cVar15 = this.f278699y;
            cVar15.getClass();
            SnsMethodCalculate.markStartTimeMs("load", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            if (cVar15.f287350f) {
                SnsMethodCalculate.markEndTimeMs("load", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            } else {
                cVar15.f287350f = true;
                cVar15.f287349e.notifyVendingDataChangeSynchronize();
                SnsMethodCalculate.markEndTimeMs("load", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            }
        } else {
            this.f278622D = false;
            C95790g2 Kx0 = C94866e1.Kx0();
            Kx0.getClass();
            SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            int i7 = Kx0.f279536h;
            SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            C98525b j8 = this.f278699y.mo137295j();
            C95790g2 Kx02 = C94866e1.Kx0();
            Kx02.getClass();
            SnsMethodCalculate.markStartTimeMs("getLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            String str11 = Kx02.f279530b;
            SnsMethodCalculate.markEndTimeMs("getLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            C98524a aVar4 = (C98524a) j8;
            aVar4.getClass();
            SnsMethodCalculate.markStartTimeMs("setLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            synchronized (aVar4.f288919A) {
                try {
                    aVar4.f288931w = str11;
                } catch (Throwable th) {
                    while (true) {
                        SnsMethodCalculate.markEndTimeMs("setLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
                        throw th;
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("setLimitSeq", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            this.f278699y.mo137295j().mo137878r(C94866e1.Kx0().mo133242e());
            C98524a aVar5 = (C98524a) this.f278699y.mo137295j();
            aVar5.getClass();
            SnsMethodCalculate.markStartTimeMs("setHasGetNp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            aVar5.f288934z = true;
            SnsMethodCalculate.markEndTimeMs("setHasGetNp", "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending");
            C98525b j9 = this.f278699y.mo137295j();
            C95790g2 Kx03 = C94866e1.Kx0();
            Kx03.getClass();
            SnsMethodCalculate.markStartTimeMs("getUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            String str12 = Kx03.f279534f;
            SnsMethodCalculate.markEndTimeMs("getUpLimitSeq", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            j9.mo137881u(str12);
            this.f278699y.mo137295j().mo137879s(C94866e1.Kx0().mo133240c());
            this.f278699y.mo137295j().mo137880t(C94866e1.Kx0().mo133241d());
            this.mUIAction.mo133028D(C94866e1.Kx0().mo133239b());
            C97979c cVar16 = this.f278699y;
            cVar16.getClass();
            SnsMethodCalculate.markStartTimeMs("load", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            if (cVar16.f287350f) {
                SnsMethodCalculate.markEndTimeMs("load", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            } else {
                cVar16.f287350f = true;
                cVar16.f287349e.notifyVendingDataChangeSynchronize();
                SnsMethodCalculate.markEndTimeMs("load", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            }
            if (i7 >= this.f278699y.getCount()) {
                i7 = this.f278699y.getCount() - 1;
                Log.m105921e("MicroMsg.SnsTimeLineUI", "error position %s", Integer.valueOf(this.f278699y.getCount()));
            }
            this.mUIAction.f278851d.setAdapter(this.f278699y);
            C95790g2 Kx04 = C94866e1.Kx0();
            Kx04.getClass();
            SnsMethodCalculate.markStartTimeMs("getTopY", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            int i8 = Kx04.f279537i;
            SnsMethodCalculate.markEndTimeMs("getTopY", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            Log.m105919d("MicroMsg.SnsTimeLineUI", "resume position %s", Integer.valueOf(i8));
            ListView listView2 = this.mUIAction.f278851d;
            C95790g2 Kx05 = C94866e1.Kx0();
            Kx05.getClass();
            SnsMethodCalculate.markStartTimeMs("getTopY", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            int i9 = Kx05.f279537i;
            SnsMethodCalculate.markEndTimeMs("getTopY", "com.tencent.mm.plugin.sns.ui.ResumeSnsControl");
            listView2.setSelectionFromTop(i7, i9);
            mo132948F8(4);
        }
        mo132960z8(true);
        int count = this.f278699y.getCount();
        int firstVisiblePosition = this.mUIAction.f278851d.getFirstVisiblePosition();
        if (firstVisiblePosition < count) {
            C102236a0.m134728W(this.f278699y.getItem(firstVisiblePosition));
        }
        C86709a0.m107528h();
        this.f278634J = ((Integer) C86709a0.m107535s().mo121142i().mo119684e(327776, 0)).intValue();
        this.f278626F.f276715y = new C96104o8(this, this.f278699y.mo137288g(), this.f278626F.f276709s, (View) null);
        this.f278626F.f276690A = new C99020a(this, this.f278699y.mo137288g().f278572f, this.f278626F.f276709s, (View) null);
        BaseTimeLine baseTimeLine2 = this.f278626F;
        TimelineClickListener timelineClickListener = this.f278699y.mo137288g().f278572f;
        BaseTimeLine baseTimeLine3 = this.f278626F;
        baseTimeLine2.f276716z = new C95733b(this, timelineClickListener, baseTimeLine3.f276709s, (View) null, baseTimeLine3.f276690A);
        C95733b bVar5 = this.f278626F.f276716z;
        C98963o oVar2 = this.f278640M;
        bVar5.getClass();
        SnsMethodCalculate.markStartTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        bVar5.f279211d = oVar2;
        SnsMethodCalculate.markEndTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        this.f278626F.f276691B = new C43162z1((Context) this, this.f278699y.mo137288g().f278572f, this.f278626F.f276709s, (View) null);
        this.f278626F.f276692C = new C43155u8(this, this.f278699y.mo137288g().f278572f, this.f278626F.f276709s, (View) null);
        C94892l2 l2Var = this.f278645P;
        if (l2Var != null) {
            l2Var.mo131075c(this.f278626F.f276690A);
        }
        if (count > 0) {
            SnsInfo item = this.f278699y.getItem(0);
            C94895m2 m2Var3 = this.f278626F.f276700g;
            if (!(m2Var3 == null || m2Var3.mo130970a() == null)) {
                this.f278626F.f276700g.mo130970a().mo131314A(item.field_snsId);
            }
            SnsReportHelper.f275506m0.mo131378k();
        }
        C115669n.INSTANCE.kvStat(13312, "1," + Util.nowMilliSecond());
        this.f278673d1.alive();
        if (getIntent().getBooleanExtra("is_need_resend_sns", false)) {
            MMHandlerThread.postToMainThreadDelayed(new SnsTimeLineUI$$v(this), 500);
            getIntent().putExtra("is_need_resend_sns", false);
        }
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119676J(589825, Boolean.FALSE);
        }
        this.f278626F.mo132092n(this.f278640M);
        this.f278640M.mo138319z(this.mUIAction.f278866v, this.mActionBar.mo91099j(), this);
        this.f278679j1.alive();
        this.f278680k1.alive();
        this.f278681l1.alive();
        this.f278682m1.alive();
        this.f278683n1.alive();
        this.f278686p1.alive();
        this.f278684o1.alive();
        this.f278687q1.alive();
        this.f278688r1.alive();
        this.f278689s1.alive();
        this.f278691u1.alive();
        this.f278690t1.alive();
        this.f278693v1.alive();
        this.f278698x1.alive();
        SellerABTestManager.m46659a();
        NotInteresetABTestManager.m119628c(this, this.f278626F.f276709s);
        C94988a aVar6 = this.f278638L;
        if (aVar6 != null) {
            SnsUIAction snsUIAction5 = this.mUIAction;
            aVar6.mo131395a(snsUIAction5.f278851d, snsUIAction5.f278860p);
        }
        BaseTimeLine baseTimeLine4 = this.f278626F;
        if (!(baseTimeLine4 == null || (m2Var2 = baseTimeLine4.f276700g) == null)) {
            m2Var2.mo130970a().mo131338y();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("enter_by_red", false);
        BaseTimeLine baseTimeLine5 = this.f278626F;
        if (!(baseTimeLine5 == null || (m2Var = baseTimeLine5.f276700g) == null)) {
            m2Var.mo130970a().mo131339z(booleanExtra);
        }
        C94901o Fx0 = C94866e1.Fx0();
        Fx0.getClass();
        SnsMethodCalculate.markStartTimeMs("cleanShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Fx0.f275004j.clear();
        SnsMethodCalculate.markEndTimeMs("cleanShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        SnsUIAction snsUIAction6 = this.mUIAction;
        if (!(snsUIAction6 == null || (snsHeader = snsUIAction6.f278860p) == null)) {
            snsHeader.setStoryAction(new SnsTimeLineUI$$w(this));
        }
        ((C60168f2) C86312j.m106911c(C60168f2.class)).mo8599Wt(3);
        mo132957u8();
        C94847c1.m120220h();
        SnsMethodCalculate.markStartTimeMs("updateNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        C47101a.f126572a = ((C32735h) C86312j.m106911c(cls5)).mo58784wf(C32735h.C32737c.clicfg_sns_group_dynamic_label_enable, true);
        Log.m105924i("MicroMsg.SnsLabelRangeConfig", "updateNewLabelRangeControl enableNewGroupUI:" + C47101a.f126572a);
        SnsMethodCalculate.markEndTimeMs("updateNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.SnsTimeLineUI).mo86179qs(this, C76986a.Moments);
        C31280k kVar = C31280k.f83760a;
        if (kVar.mo58046a() && kVar.mo58048c() == 1) {
            C97535h.f286229a.mo136807g();
        }
        C102882s0.f303681a.mo142598j();
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0720  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0778  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0791  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x06f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r20 = this;
            r1 = r20
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            java.lang.String r0 = "onDestroy"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            java.lang.String r0 = "SnsMMKV"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r3 = "SnsMMKVSnsUI"
            r4 = 0
            r0.encode((java.lang.String) r3, (boolean) r4)
            java.util.ArrayList<com.tencent.mm.sdk.event.IListener<?>> r0 = com.tencent.p014mm.plugin.sns.p106ui.item.improve.click.TimelineItemClickEventCenter.f280079a
            java.lang.String r0 = "onDestroy"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.improve.click.TimelineItemClickEventCenter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            r4 = 0
            com.tencent.p014mm.plugin.sns.p106ui.item.improve.click.TimelineItemClickEventCenter.f280080b = r4
            java.util.ArrayList<com.tencent.mm.sdk.event.IListener<?>> r5 = com.tencent.p014mm.plugin.sns.p106ui.item.improve.click.TimelineItemClickEventCenter.f280079a
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x003b
            java.lang.Object r6 = r5.next()
            com.tencent.mm.sdk.event.IListener r6 = (com.tencent.p014mm.sdk.event.IListener) r6
            r6.dead()
            goto L_0x002b
        L_0x003b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            tu2.d r0 = tu2.C101931d.f300107a
            java.lang.String r0 = "release"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineItemViewPool"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            java.util.HashMap<java.lang.String, java.util.ArrayList<android.view.View>> r5 = tu2.C101931d.f300108b
            r5.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            yn2.s0 r0 = yn2.C102882s0.f303681a
            r0.mo142591c()
            r0 = 1
            r1.f278636K = r0
            com.tencent.mm.plugin.sns.ui.b5 r3 = r1.f278685p0
            r3.getClass()
            java.lang.String r5 = "onUIDestroy"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            java.lang.String r7 = "unregisterBroadcastReceiver"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r6)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ IllegalArgumentException -> 0x0075 }
            android.content.BroadcastReceiver r9 = r3.f279255c     // Catch:{ IllegalArgumentException -> 0x0075 }
            r8.unregisterReceiver(r9)     // Catch:{ IllegalArgumentException -> 0x0075 }
            goto L_0x0076
        L_0x0075:
        L_0x0076:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r6)
            r3.f279253a = r4
            r3.f279254b = r0
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            com.tencent.mm.plugin.sns.ui.video.a r0 = com.tencent.p014mm.plugin.sns.p106ui.video.C96254a.m123394d()
            r0.mo133936i(r1)
            bv2.c r0 = bv2.C92313c.m116089a()
            r0.mo126299b()
            java.lang.String r0 = "MicroMsg.SnsTimeLineUI"
            java.lang.String r3 = "timeline on destroy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            com.tencent.mm.sdk.event.IListener r0 = r1.f278679j1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278680k1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278681l1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278682m1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278683n1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278686p1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278684o1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278687q1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278688r1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278689s1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278690t1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278691u1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278693v1
            r0.dead()
            com.tencent.mm.sdk.event.IListener r0 = r1.f278698x1
            r0.dead()
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r0 = r1.f278626F
            if (r0 == 0) goto L_0x00fa
            com.tencent.mm.plugin.sns.model.m2 r0 = r0.f276700g
            if (r0 == 0) goto L_0x00fa
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r0 = r0.mo130970a()
            boolean r3 = r1.f278675f1
            r0.getClass()
            java.lang.String r5 = "setHasNewChatMsgWhenExit"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            r0.f275468l = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
        L_0x00fa:
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.mo131380m()
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r3 = 68377(0x10b19, float:9.5817E-41)
            java.lang.Object r0 = r0.mo119684e(r3, r4)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r0 = r1.f278626F
            if (r0 == 0) goto L_0x0182
            com.tencent.mm.plugin.sns.model.m2 r0 = r0.f276700g
            if (r0 == 0) goto L_0x0182
            com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper r0 = r0.mo130970a()
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r3 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            int r3 = r3.f275549i
            r0.getClass()
            java.lang.String r4 = "onTimelineDestroy"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.String r6 = "MicroMsg.SnsBrowseInfoHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = r0.f275467k1
            long r7 = r7 - r9
            long r9 = r0.f275438b
            long r9 = r9 + r7
            r0.f275438b = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onTimelineEns passedtime: "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = " BrowseTime: "
            r9.append(r7)
            long r7 = r0.f275438b
            r9.append(r7)
            java.lang.String r7 = "BackgroundTime: "
            r9.append(r7)
            long r7 = r0.f275407M
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            java.lang.String r6 = "report"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            java.util.concurrent.ExecutorService r7 = com.tencent.p014mm.plugin.sns.model.C94866e1.ky0()
            if (r7 == 0) goto L_0x017c
            com.tencent.mm.plugin.sns.statistics.i r8 = new com.tencent.mm.plugin.sns.statistics.i
            r8.<init>(r0, r3)
            r7.execute(r8)
        L_0x017c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x0182:
            r0 = 704(0x2c0, float:9.87E-43)
            ad0.C91998s.m115550d(r0)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r3 = -1
            r0.f275549i = r3
            java.lang.String r3 = "0"
            r0.f275547h = r3
            com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = r1.mUIAction
            android.widget.ListView r0 = r0.getSnsListView()
            com.tencent.mm.plugin.sns.ui.AdListView r0 = (com.tencent.p014mm.plugin.sns.p106ui.AdListView) r0
            com.tencent.mm.plugin.sns.model.l2 r3 = r1.f278645P
            r3.getClass()
            java.lang.String r4 = "clean"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.TimelineAREvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.util.List<java.lang.ref.WeakReference<com.tencent.mm.plugin.sns.model.m>> r3 = r3.f274981d
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            r3.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            js2.b r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Px0()
            r3.getClass()
            java.lang.String r4 = "clean"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r3.getClass()
            java.lang.String r6 = "report"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            java.util.HashSet<java.lang.Long> r7 = r3.f290299e
            if (r7 == 0) goto L_0x020a
            java.util.Iterator r7 = r7.iterator()
        L_0x01cd:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x020a
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            com.tencent.mm.plugin.sns.model.g0 r15 = new com.tencent.mm.plugin.sns.model.g0
            long r10 = r8.longValue()
            r12 = 0
            r13 = 0
            r14 = 0
            r9 = r15
            r9.<init>((long) r10, (int) r12, (int) r13, (java.lang.String) r14)
            f40.C86709a0.m107528h()
            f40.g r9 = f40.C86709a0.m107529k()
            ob0.b0 r9 = r9.f251779b
            r9.mo123460f(r15)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "report id "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "MicroMsg.SnSABTestMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            goto L_0x01cd
        L_0x020a:
            java.util.HashMap<java.lang.Long, js2.b$a> r7 = r3.f290300f
            if (r7 == 0) goto L_0x0236
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x0216:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0231
            java.lang.Object r8 = r7.next()
            js2.b$a r8 = (js2.C99021b.C33658a) r8
            java.lang.String r9 = "report"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            r8.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            goto L_0x0216
        L_0x0231:
            java.util.HashMap<java.lang.Long, js2.b$a> r3 = r3.f290300f
            r3.clear()
        L_0x0236:
            java.lang.String r3 = "listToFile"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            jp2.q r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Zx0()
            r3.getClass()
            java.lang.String r4 = "trigerSave"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.model.SnsLogMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.util.concurrent.ExecutorService r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.ky0()
            jp2.t r7 = new jp2.t
            r7.<init>(r3)
            r6.execute(r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r0.getClass()
            java.lang.String r3 = "removeStatistic"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.AdListView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            jp2.h r5 = r0.f276616d
            jp2.o r5 = (jp2.C98963o) r5
            r5.mo138302i()
            r5 = 0
            r0.f276616d = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.lang.String r3 = "removeTimelineStat"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.AdListView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.model.n r5 = r0.f276617e
            com.tencent.mm.plugin.sns.model.o2 r5 = (com.tencent.p014mm.plugin.sns.model.C94921o2) r5
            r5.getClass()
            java.lang.String r6 = "reportAll"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            zt3.t r8 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.sns.model.n2 r9 = new com.tencent.mm.plugin.sns.model.n2
            r9.<init>(r5)
            zt3.j r8 = (zt3.C119157j) r8
            r8.mo183884o(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            r5 = 0
            r0.f276617e = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            java.util.List<eb0.e3> r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.f274960h
            java.lang.String r3 = "listToFile"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.NetSceneSnsSync"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            ms2.b r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.f274961i
            if (r0 != 0) goto L_0x02ba
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            goto L_0x0341
        L_0x02ba:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            java.lang.String r7 = r7.f251807e
            r0.append(r7)
            java.lang.String r7 = "ad_1100007"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "listToFile to list  "
            r0.append(r8)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r8 = "MicroMsg.NetSceneNewSyncAlbum"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            ms2.b r0 = com.tencent.p014mm.plugin.sns.model.C94886k0.f274961i     // Catch:{ Exception -> 0x0325 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0325 }
            int r9 = r0.length     // Catch:{ Exception -> 0x0325 }
            r10 = 0
            com.tencent.p014mm.vfs.C86013q1.m106438T(r7, r0, r10, r9)     // Catch:{ Exception -> 0x0325 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0325 }
            r0.<init>()     // Catch:{ Exception -> 0x0325 }
            java.lang.String r9 = "listTofile "
            r0.append(r9)     // Catch:{ Exception -> 0x0325 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0325 }
            long r9 = r9 - r5
            r0.append(r9)     // Catch:{ Exception -> 0x0325 }
            java.lang.String r5 = " igNoreAbTestId "
            r0.append(r5)     // Catch:{ Exception -> 0x0325 }
            ms2.b r5 = com.tencent.p014mm.plugin.sns.model.C94886k0.f274961i     // Catch:{ Exception -> 0x0325 }
            java.util.LinkedList<java.lang.Long> r5 = r5.f126556d     // Catch:{ Exception -> 0x0325 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0325 }
            r0.append(r5)     // Catch:{ Exception -> 0x0325 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0325 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)     // Catch:{ Exception -> 0x0325 }
            goto L_0x033e
        L_0x0325:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "listToFile failed: "
            r5.append(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r5, r6)
        L_0x033e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x0341:
            boolean r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r0 != 0) goto L_0x034e
            android.os.Handler r0 = r1.f278627F1
            java.lang.Runnable r3 = r1.f278672c1
            r0.removeCallbacks(r3)
        L_0x034e:
            f40.C86709a0.m107528h()
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121114l()
            r3 = 211(0xd3, float:2.96E-43)
            if (r0 == 0) goto L_0x03cb
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r4 = 213(0xd5, float:2.98E-43)
            r0.mo123470p(r4, r1)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r4 = 682(0x2aa, float:9.56E-43)
            r0.mo123470p(r4, r1)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r4 = 218(0xda, float:3.05E-43)
            r0.mo123470p(r4, r1)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r0.mo123470p(r3, r1)
            f40.C86709a0.m107528h()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r4 = 683(0x2ab, float:9.57E-43)
            r0.mo123470p(r4, r1)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r4 = 327776(0x50060, float:4.59312E-40)
            int r5 = r1.f278634J
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.mo119676J(r4, r5)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r4 = 589825(0x90001, float:8.26521E-40)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r0.mo119676J(r4, r5)
        L_0x03cb:
            sp2.c r0 = sp2.C101690c.f297710a
            fy3.a<rx3.b0> r0 = r1.f278701y1
            java.lang.String r4 = "unRegisterOnAdPullListener"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.util.List<fy3.a<rx3.b0>> r4 = sp2.C101690c.f297714e
            monitor-enter(r4)
            java.util.Collection r5 = gy3.C24564k0.m30737a(r4)     // Catch:{ all -> 0x0a7d }
            r5.remove(r0)     // Catch:{ all -> 0x0a7d }
            java.lang.String r0 = "AdPullRequestHelper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a7d }
            r5.<init>()     // Catch:{ all -> 0x0a7d }
            java.lang.String r6 = "unRegisterOnAdPullListener called adPullFunctions.size = "
            r5.append(r6)     // Catch:{ all -> 0x0a7d }
            r6 = r4
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0a7d }
            int r6 = r6.size()     // Catch:{ all -> 0x0a7d }
            r5.append(r6)     // Catch:{ all -> 0x0a7d }
            r6 = 32
            r5.append(r6)     // Catch:{ all -> 0x0a7d }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0a7d }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)     // Catch:{ all -> 0x0a7d }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0a7d }
            monitor-exit(r4)
            java.lang.String r0 = "unRegisterOnAdPullListener"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            com.tencent.mm.plugin.sns.ui.BaseTimeLine r0 = r1.f278626F
            if (r0 == 0) goto L_0x0416
            r0.mo132082d()
        L_0x0416:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.ly0()
            java.lang.Runnable r4 = r1.f278629G1
            r0.removeCallbacks(r4)
            com.tencent.mm.plugin.sns.model.y1 r4 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r4.getClass()
            java.lang.String r0 = "onDestroy"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            ms2.n r0 = r4.f275339C
            if (r0 == 0) goto L_0x0435
            r4.mo131304e()
        L_0x0435:
            java.lang.String r5 = "flushUnreadTipFaultWriteCache"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            boolean r0 = r4.f275347b
            if (r0 == 0) goto L_0x0462
            ms2.m r0 = r4.f275366u     // Catch:{ Exception -> 0x0450 }
            long r7 = r4.f275371z     // Catch:{ Exception -> 0x0450 }
            r0.f292915f = r7     // Catch:{ Exception -> 0x0450 }
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x0450 }
            java.lang.String r7 = r4.f275346a     // Catch:{ Exception -> 0x0450 }
            com.tencent.p014mm.vfs.C86013q1.m106437S(r7, r0)     // Catch:{ Exception -> 0x0450 }
            goto L_0x0462
        L_0x0450:
            r0 = move-exception
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r8 = 0
            r7[r8] = r0
            java.lang.String r0 = "MicroMsg.SnsUnreadTipManager"
            java.lang.String r8 = "flushUnreadTipFaultWriteCache error:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r8, r7)
        L_0x0462:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            ms2.m r0 = r4.f275366u
            java.util.LinkedList<ms2.n> r0 = r0.f292913d
            r0.clear()
            r0 = 0
            r4.f275367v = r0
            r4.f275368w = r0
            r5 = 0
            r4.f275369x = r5
            r4.f275361p = r5
            java.util.Map<java.lang.Long, java.lang.Integer> r7 = r4.f275357l
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.clear()
            com.tencent.p014mm.plugin.sns.model.C94974y1.f275336J = r0
            r4.f275358m = r5
            r7 = 0
            r4.f275363r = r7
            r4.f275339C = r0
            r4.f275340D = r0
            r0 = 2
            r4.f275362q = r0
            r4.f275341E = r7
            r4.f275338B = r5
            r4.f275371z = r5
            r4.f275342F = r5
            java.util.List<java.lang.Long> r5 = r4.f275359n
            monitor-enter(r5)
            java.util.List<java.lang.Long> r0 = r4.f275359n     // Catch:{ all -> 0x0a72 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0a72 }
            r0.clear()     // Catch:{ all -> 0x0a72 }
            monitor-exit(r5)     // Catch:{ all -> 0x0a72 }
            com.tencent.mm.plugin.sns.model.x1 r0 = r4.f275343G
            r0.getClass()
            java.lang.String r4 = "onDestroy"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsUnreadPreloader"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            java.lang.String r6 = "reset"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            java.util.List<java.lang.Long> r7 = r0.f275313d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r7.clear()
            r7 = 0
            r0.f275314e = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            f40.g r6 = f40.C86709a0.m107529k()
            ob0.b0 r6 = r6.f251779b
            r6.mo123470p(r3, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r0 = "onDestroy"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            com.tencent.mm.plugin.sns.model.t1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.cy0()
            r0.getClass()
            java.lang.String r3 = "onDestroy"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.lang.String r5 = "MicroMsg.SnsRetryEditTipManager"
            java.lang.String r6 = "destroy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.Runnable r0 = r0.f275252e
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            ft2.c r0 = r1.f278699y
            if (r0 == 0) goto L_0x07a1
            com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = r1.mUIAction
            android.widget.ListView r0 = r0.f278851d
            int r0 = r0.getFirstVisiblePosition()
            r3 = 0
            r4 = 0
        L_0x04ff:
            com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = r1.mUIAction
            android.widget.ListView r5 = r5.f278851d
            int r5 = r5.getCount()
            if (r3 >= r5) goto L_0x054d
            com.tencent.mm.plugin.sns.ui.SnsUIAction r5 = r1.mUIAction
            android.widget.ListView r5 = r5.f278851d
            android.view.View r5 = r5.getChildAt(r3)
            if (r5 != 0) goto L_0x0514
            goto L_0x054a
        L_0x0514:
            com.tencent.mm.plugin.sns.ui.SnsUIAction r6 = r1.mUIAction
            android.widget.ListView r6 = r6.f278851d
            int r6 = r6.getPositionForView(r5)
            if (r6 != r0) goto L_0x054a
            r4 = 2
            int[] r4 = new int[r4]
            r5.getLocationInWindow(r4)
            java.lang.String r5 = "MicroMsg.SnsTimeLineUI"
            java.lang.String r7 = "this is the pos for view %d x %d y %d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 0
            r8[r9] = r6
            r6 = r4[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 1
            r8[r9] = r6
            r6 = r4[r9]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10 = 2
            r8[r10] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r7, r8)
            r4 = r4[r9]
        L_0x054a:
            int r3 = r3 + 1
            goto L_0x04ff
        L_0x054d:
            android.content.res.Resources r3 = r20.getResources()
            r5 = 2131167221(0x7f0707f5, float:1.794871E38)
            int r3 = r3.getDimensionPixelSize(r5)
            boolean r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r5 != 0) goto L_0x06b9
            jv2.a r5 = r1.f278694w
            r5.getClass()
            java.lang.String r6 = "getSnsServer"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            com.tencent.mm.plugin.sns.model.p1$a r5 = r5.f290367v
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            if (r5 == 0) goto L_0x06b9
            int r5 = r1.f278646P1
            if (r5 != 0) goto L_0x06b9
            com.tencent.mm.plugin.sns.ui.g2 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Kx0()
            r5.getClass()
            java.lang.String r6 = "containsUnfold"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.ResumeSnsControl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            java.util.HashSet<java.lang.String> r5 = r5.f279541m
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x058d
            r5 = 1
            goto L_0x058e
        L_0x058d:
            r5 = 0
        L_0x058e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            if (r5 != 0) goto L_0x06b9
            com.tencent.mm.plugin.sns.ui.g2 r5 = com.tencent.p014mm.plugin.sns.model.C94866e1.Kx0()
            ft2.c r6 = r1.f278699y
            ht2.b r6 = r6.mo137295j()
            java.lang.String r6 = r6.mo137875l()
            ft2.c r7 = r1.f278699y
            ht2.b r7 = r7.mo137295j()
            ht2.a r7 = (ht2.C98524a) r7
            r7.getClass()
            java.lang.String r8 = "getRespMinSeq"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            java.lang.String r7 = r7.f288928t
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            jv2.a r8 = r1.f278694w
            r8.getClass()
            java.lang.String r9 = "getSnsServer"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            com.tencent.mm.plugin.sns.model.p1$a r8 = r8.f290367v
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            r8.getClass()
            java.lang.String r9 = "getTimeLastId"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            long r11 = r8.f21141i
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            int r8 = r4 - r3
            ft2.c r9 = r1.f278699y
            ht2.b r9 = r9.mo137295j()
            ht2.a r9 = (ht2.C98524a) r9
            r9.getClass()
            java.lang.String r10 = "getUnreadBottomSeq"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)
            java.lang.String r9 = r9.f288929u
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)
            ft2.c r10 = r1.f278699y
            ht2.b r10 = r10.mo137295j()
            ht2.a r10 = (ht2.C98524a) r10
            r10.getClass()
            java.lang.String r13 = "getUnreadTopSeq"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.adapter.vending.BaseSnsVending"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            java.lang.String r10 = r10.f288930v
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            jv2.a r13 = r1.f278694w
            r13.getClass()
            java.lang.String r14 = "getSnsServer"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.vending.SnsTimelineInteractor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            com.tencent.mm.plugin.sns.model.p1$a r13 = r13.f290367v
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
            r13.getClass()
            java.lang.String r14 = "getTimeFirstId"
            java.lang.String r15 = "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
            r16 = r2
            r17 = r3
            long r2 = r13.f21142j
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
            ft2.c r13 = r1.f278699y
            ht2.b r13 = r13.mo137295j()
            java.lang.String r13 = r13.mo137876n()
            com.tencent.mm.plugin.sns.ui.SnsUIAction r14 = r1.mUIAction
            boolean r14 = r14.mo133036n()
            r5.getClass()
            java.lang.String r15 = "pauseEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.ResumeSnsControl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r1)
            r18 = r14
            r19 = r15
            long r14 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r5.f279529a = r14
            r5.f279530b = r6
            r5.f279531c = r7
            r5.f279538j = r11
            r5.f279536h = r0
            r5.f279537i = r8
            r5.f279534f = r13
            r5.f279532d = r9
            r5.f279533e = r10
            r5.f279539k = r2
            r8 = r18
            r5.f279540l = r8
            r18 = r4
            r4 = 11
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r15 = 0
            r4[r15] = r14
            r14 = 1
            r4[r14] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Long r6 = java.lang.Long.valueOf(r11)
            r7 = 3
            r4[r7] = r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = 4
            r4[r6] = r0
            int r0 = r5.f279537i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 5
            r4[r5] = r0
            r0 = 6
            r4[r0] = r9
            r0 = 7
            r4[r0] = r10
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r2 = 8
            r4[r2] = r0
            r0 = 9
            r4[r0] = r13
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r2 = 10
            r4[r2] = r0
            java.lang.String r0 = "MicroMsg.ResumeSnsControl"
            java.lang.String r2 = "lastSnsTime %s limitSeq %s respMinSeq %s timeLastId %s position %s topy %s, unreadBottomSeq:%s, unreadTopSeq:%s, timeFirstId:%s, upLimitSeq:%s, isPullDownMode:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
            r0 = r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            goto L_0x06bf
        L_0x06b9:
            r16 = r2
            r17 = r3
            r18 = r4
        L_0x06bf:
            java.lang.String r0 = "MicroMsg.SnsTimeLineUI"
            java.lang.String r1 = "top h %d"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r4 = r18 - r17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r4 = 0
            r2[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r2)
            r1 = r20
            ft2.c r0 = r1.f278699y
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r0 = r0.mo137288g()
            r0.getClass()
            java.lang.String r0 = "closePlayer"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            boolean r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.qy0()
            if (r3 == 0) goto L_0x06f7
            java.lang.String r3 = "MicroMsg.SnsTimeLineBaseAdapter"
            java.lang.String r4 = "is invalid to getSnsInfoStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x070b
        L_0x06f7:
            com.tencent.mm.plugin.sns.model.o r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r3.getClass()
            java.lang.String r3 = "idleStop"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L_0x070b:
            ft2.c r0 = r1.f278699y
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r0 = r0.mo137288g()
            r0.getClass()
            java.lang.String r2 = "releaseClickable"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.r r0 = r0.f278588v
            if (r0 == 0) goto L_0x072e
            java.lang.String r4 = "releaseCallBack"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.ClickableCallBack"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            r6 = 0
            r0.f280963a = r6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
        L_0x072e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            ft2.c r0 = r1.f278699y
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r0 = r0.mo137288g()
            r0.getClass()
            java.lang.String r0 = "clearDownloadCallBack"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            ft2.c r0 = r1.f278699y
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r0 = r0.mo137288g()
            r0.getClass()
            java.lang.String r2 = "removeLikedCallback"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$i> r0 = r0.f278586t
            r0.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            ft2.c r0 = r1.f278699y
            com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter r0 = r0.mo137288g()
            r0.getClass()
            java.lang.String r2 = "clean"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.LinkedList<com.tencent.mm.plugin.sns.ui.widget.SnsCommentCollapseLayout> r4 = r0.f278569c
            if (r4 == 0) goto L_0x0774
            r4.clear()
        L_0x0774:
            java.util.HashMap<java.lang.Integer, java.lang.Class<? extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder>> r4 = r0.f278554F
            if (r4 == 0) goto L_0x077b
            r4.clear()
        L_0x077b:
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            r4.clearCache()
            l40.c r4 = l40.C99336c.f291266b
            r4.mo138731a()
            com.tencent.mm.pointers.PBool r0 = r0.f278580n
            boolean r0 = r0.value
            if (r0 == 0) goto L_0x079d
            di3.d r0 = di3.C86312j.m106911c(r16)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_sns_like_collapse_enable
            r5 = 0
            r0.mo58779Qe(r4, r5)
        L_0x079d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L_0x07a3
        L_0x07a1:
            r16 = r2
        L_0x07a3:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.f281690a
            java.lang.Class<com.tencent.mm.plugin.sns.ui.x6> r2 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.class
            monitor-enter(r2)
            java.lang.String r0 = "clean"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)     // Catch:{ all -> 0x0a6f }
            java.util.HashMap<java.lang.Long, java.lang.Long> r0 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.f281691b     // Catch:{ all -> 0x0a6f }
            r0.clear()     // Catch:{ all -> 0x0a6f }
            java.util.HashMap<java.lang.Long, java.lang.String> r0 = com.tencent.p014mm.plugin.sns.p106ui.C96315x6.f281692c     // Catch:{ all -> 0x0a6f }
            r0.clear()     // Catch:{ all -> 0x0a6f }
            java.lang.String r0 = "clean"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsTimeUtil"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch:{ all -> 0x0a6f }
            monitor-exit(r2)
            com.tencent.mm.sdk.event.IListener r0 = r1.f278673d1
            r0.dead()
            f40.C86709a0.m107528h()
            f40.e r0 = f40.C86709a0.m107523b()
            boolean r0 = r0.mo121114l()
            if (r0 == 0) goto L_0x07e9
            com.tencent.mm.plugin.sns.model.o r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Fx0()
            r0.getClass()
            java.lang.String r2 = "cleanShowPlay"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r0.f275004j
            r0.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x07e9:
            ft2.c r0 = r1.f278699y
            ht2.b r0 = r0.mo137295j()
            com.tencent.mm.vending.base.Vending$l r2 = r1.f278674e1
            r0.removeVendingDataChangedCallback(r2)
            r0 = 0
            r1.f278674e1 = r0
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            ft2.c r2 = r1.f278699y
            int r2 = r2.getCount()
            r0.getClass()
            java.lang.String r3 = "reportWsFoldExpose"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            java.util.Map<java.lang.Long, com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct> r5 = r0.f275534a0
            java.util.concurrent.ConcurrentHashMap r5 = (java.util.concurrent.ConcurrentHashMap) r5
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x0816:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x082b
            java.lang.Object r6 = r5.next()
            com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct r6 = (com.tencent.p014mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct) r6
            if (r6 == 0) goto L_0x0816
            long r7 = (long) r2
            r6.f266184j = r7
            r6.mo86054n()
            goto L_0x0816
        L_0x082b:
            java.util.Map<java.lang.Long, com.tencent.mm.autogen.mmdata.rpt.SnsTimelineWeiShangeFoldExposeStruct> r0 = r0.f275534a0
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            r0 = 0
            r1.f278699y = r0
            r1.f278626F = r0
            java.lang.String r0 = "reportBigPicClick"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = com.tencent.p014mm.plugin.sns.model.C94866e1.my0()
            ft2.g r4 = new ft2.g
            r4.<init>()
            r3.post(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            java.util.Set<java.lang.Long> r0 = com.tencent.p014mm.plugin.sns.abtest.SellerABTestManager.f116470a
            java.lang.String r0 = "endABTestWhenExitTimeline"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.abtest.SellerABTestManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            com.tencent.mm.sdk.event.IListener r3 = com.tencent.p014mm.plugin.sns.abtest.SellerABTestManager.f116471b
            r3.dead()
            java.util.Set<java.lang.Long> r3 = com.tencent.p014mm.plugin.sns.abtest.SellerABTestManager.f116470a
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            js2.b r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Px0()
            r0.getClass()
            java.lang.String r2 = "stop"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            f40.C86709a0.m107528h()
            f40.g r4 = f40.C86709a0.m107529k()
            ob0.b0 r4 = r4.f251779b
            r5 = 291(0x123, float:4.08E-43)
            r4.mo123470p(r5, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.sdk.event.IListener r0 = com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager.f273611b
            java.lang.String r0 = "clean"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            r3 = 0
            com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager.f273610a = r3
            com.tencent.mm.sdk.event.IListener r3 = com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager.f273611b
            com.tencent.mm.sdk.event.IListener r3 = com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager.f273611b
            r3.dead()
            com.tencent.mm.sdk.event.IListener r3 = com.tencent.p014mm.plugin.sns.abtest.NotInteresetABTestManager.f273612c
            r3.dead()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            com.tencent.mm.plugin.sns.ui.SnsUIAction r0 = r1.mUIAction
            r0.mo133042t()
            super.onDestroy()
            l40.c r0 = l40.C99336c.f291266b
            r0.mo138731a()
            gt2.c r0 = r1.f278696x
            r0.getClass()
            java.lang.String r2 = "onRelease"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineRepository"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            gt2.b r4 = r0.f287955a
            r4.getClass()
            java.lang.String r4 = "release"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.adapter.data.SnsTimeLineNetworkManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r4 = 0
            r0.f287956b = r4
            r4 = 0
            r0.f287958d = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            jp2.v r0 = jp2.C98974v.f290191c
            r0.getClass()
            java.lang.String r2 = "cleanCache"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.model.SnsTimelineAdResourceMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            q90.j<java.lang.String, android.graphics.Bitmap> r5 = r0.f290192a
            r5.clear()
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            com.tencent.mm.sdk.platformtools.MMStack r6 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r5[r4] = r6
            java.lang.String r4 = "MicroMsg.SnsTimelineAdResourceMgr"
            java.lang.String r6 = "clean cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r5)
            boolean r4 = r0.mo138334a()     // Catch:{ all -> 0x0905 }
            if (r4 == 0) goto L_0x0906
            com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r0.f290193b     // Catch:{ all -> 0x0905 }
            r0.evictAll()     // Catch:{ all -> 0x0905 }
            goto L_0x0906
        L_0x0905:
        L_0x0906:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.model.e r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
            r0.getClass()
            java.lang.String r2 = "clearReporter"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.sns.model.e$j> r4 = r0.f274831r
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0924
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.sns.model.e$j> r0 = r0.f274831r
            r0.clear()
        L_0x0924:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.model.e r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.Vx0()
            r0.getClass()
            java.lang.String r2 = "clearMediaList"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r4 = r0.f274832s
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0942
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r0 = r0.f274832s
            r0.clear()
        L_0x0942:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.model.y1 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.fy0()
            r2 = 0
            r0.f275364s = r2
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.getClass()
            java.lang.String r2 = "clearRptCache"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$c> r4 = r0.f275560q
            java.util.HashMap r4 = (java.util.HashMap) r4
            r4.clear()
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.statistics.SnsReportHelper$b> r0 = r0.f275561r
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.clear()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r0 = r0.mo131346G()
            long r2 = r0.f266439k
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0997
            com.tencent.mm.plugin.sns.statistics.SnsReportHelper r0 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
            r0.getClass()
            java.lang.String r2 = "reportExposeReEditStruct"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.SnsReportHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r4 = r0.f275521O
            r5 = 1
            r4.f266432d = r5
            r4.mo86054n()
            com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.TimelineTrashReEditStruct
            r4.<init>()
            r0.f275521O = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x0997:
            os2.n r0 = os2.C62173n.f176771a
            java.lang.String r2 = "clearTask"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.mo87230a()
            r4 = 1
            r0.removeMessages(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            r2 = 3
            r0.Di0(r2)
            k21.c$a r0 = k21.C60960c.f173618a
            java.lang.String r2 = "MomentsTogetherTailActionTimeline"
            java.lang.Class<com.tencent.mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct> r3 = com.tencent.p014mm.autogen.mmdata.rpt.MomentsTogetherTailActionStruct.class
            java.lang.String r3 = r3.getCanonicalName()
            r0.mo85919c(r2, r3, r4)
            gv2.C98249r.m126976a()
            gv2.r r0 = gv2.C98249r.f288050e
            r2 = 0
            r0.mo137555g(r2)
            gv2.C98241o.m126934a()
            gv2.o r0 = gv2.C98241o.f288030d
            r0.mo137543e(r2)
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_sns_destory_recycle_bitmap
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 != 0) goto L_0x09e4
            boolean r2 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r2 == 0) goto L_0x09e2
            goto L_0x09e4
        L_0x09e2:
            r2 = 0
            goto L_0x09e5
        L_0x09e4:
            r2 = 1
        L_0x09e5:
            boolean r0 = p761yd.C38993b.m41993c(r0, r2)
            if (r0 == 0) goto L_0x09f0
            com.tencent.mm.memory.c r0 = com.tencent.p014mm.memory.C92704c.f266809e
            r0.mo126892c()
        L_0x09f0:
            l03.e r0 = l03.C34152e.f92126a
            java.lang.String r0 = "MicroMsg.SnsPredictDataReport"
            java.lang.String r2 = "clear"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = l03.C34152e.f92127b
            r0.clear()
            ds2.k r0 = ds2.C31280k.f83760a
            boolean r2 = r0.mo58046a()
            if (r2 == 0) goto L_0x0a22
            int r0 = r0.mo58048c()
            r2 = 1
            if (r0 != r2) goto L_0x0a22
            ds2.h r0 = ds2.C97535h.f286229a
            java.lang.String r0 = "stopKaraPredict"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model.config.SnsKaraOptionConfig"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            java.lang.String r3 = "MicroMsg.SnsKaraOptionConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r3 = 0
            ds2.C97535h.f286238j = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L_0x0a22:
            java.lang.String r0 = "triggerClean"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.clean.SnsPostMediaCleanManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r2)
            di3.d r3 = di3.C86312j.m106911c(r16)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_sns_post_media_clean_enable
            r5 = 1
            boolean r3 = r3.mo58784wf(r4, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "triggerClean enable:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.SnsPostMediaCleanManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            if (r3 != 0) goto L_0x0a54
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            goto L_0x0a66
        L_0x0a54:
            java.lang.String r3 = "triggerClean start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            zt3.t r3 = zt3.C119157j.f356862d
            mr2.c r4 = mr2.C34651c.f93173d
            zt3.j r3 = (zt3.C119157j) r3
            r3.mo183875f(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
        L_0x0a66:
            java.lang.String r0 = "onDestroy"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r2)
            return
        L_0x0a6f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0a72:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0a72 }
            java.lang.String r2 = "onDestroy"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r0
        L_0x0a7d:
            r0 = move-exception
            monitor-exit(r4)
            java.lang.String r2 = "unRegisterOnAdPullListener"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.asyncpull.AdPullRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI.onDestroy():void");
    }

    public void onDrag() {
        SnsMethodCalculate.markStartTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        super.onDrag();
        SnsMethodCalculate.markEndTimeMs("onDrag", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onKeyboardStateChanged() {
        BaseTimeLine baseTimeLine;
        SnsCommentFooter snsCommentFooter;
        SnsMethodCalculate.markStartTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        super.onKeyboardStateChanged();
        Log.m105918d("MicroMsg.SnsTimeLineUI", "onKeyboardStateChanged: ");
        MMHandlerThread.postToMainThread(new SnsTimeLineUI$$o0(this));
        if (keyboardState() == 2) {
            BaseTimeLine baseTimeLine2 = this.f278626F;
            if (!(baseTimeLine2 == null || (snsCommentFooter = baseTimeLine2.f276708r) == null || snsCommentFooter.mo132700s())) {
                Log.m105924i("MicroMsg.SnsTimeLineUI", "onKeyBoardStateChange find");
            }
        } else if (keyboardState() == 1 && (baseTimeLine = this.f278626F) != null) {
            baseTimeLine.mo132086h();
        }
        SnsMethodCalculate.markEndTimeMs("onKeyboardStateChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onNewIntent(Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        super.onNewIntent(intent);
        Bundle bundleExtra = intent.getBundleExtra("key_finder_bundle_info");
        if (bundleExtra != null) {
            Intent intent2 = new Intent();
            String string = bundleExtra.getString("key_context_id");
            long j = bundleExtra.getLong("key_finder_post_local_id");
            intent2.putExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", true);
            intent2.putExtra("key_finder_post_local_id", j);
            intent2.putExtra("KEY_POST_DIRECTLY_FROM_SNS", true);
            if (!Util.isNullOrNil(string)) {
                intent2.putExtra("key_context_id", string);
            }
            ((C60200t1) C86312j.m106911c(C60200t1.class)).Hm0(getContext(), intent2);
            finish();
        }
        SnsMethodCalculate.markEndTimeMs("onNewIntent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onPause() {
        C89940c cVar;
        C94895m2 m2Var;
        C98963o oVar;
        Class cls = C110234e.class;
        Class cls2 = C88146a.class;
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        try {
            ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
            this.f278648Q0 = false;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsTimeLineUI.ScreenShot", th.toString());
        }
        this.f278618B.clearAnimation();
        C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcSNSScrollEnable(), this.f278647Q);
        this.f278647Q = 0;
        List<C97624e3> list = C94886k0.f274960h;
        SnsMethodCalculate.markStartTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        ((LinkedList) C94886k0.f274960h).remove(this);
        SnsMethodCalculate.markEndTimeMs("removeNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
        C94901o Fx0 = C94866e1.Fx0();
        Fx0.getClass();
        SnsMethodCalculate.markStartTimeMs("setIvirtualItem", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        Fx0.f275006l = null;
        SnsMethodCalculate.markEndTimeMs("setIvirtualItem", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        C97979c cVar2 = this.f278699y;
        if (cVar2 != null) {
            cVar2.mo137288g().mo132926u();
        }
        BaseTimeLine baseTimeLine = this.f278626F;
        if (!(baseTimeLine == null || (oVar = baseTimeLine.f276699f) == null)) {
            oVar.mo138313t();
        }
        BaseTimeLine baseTimeLine2 = this.f278626F;
        if (!(baseTimeLine2 == null || (m2Var = baseTimeLine2.f276700g) == null)) {
            m2Var.mo130970a().mo131330q(false);
        }
        ((C77570i) C86312j.m106911c(C77570i.class)).Ge0("SnsTimeLineUI", this.f278639L1, Util.nowSecond());
        this.mUIAction.mo133047y();
        super.onPause();
        C100905b bVar = this.f278667Y0;
        if (bVar != null) {
            bVar.mo140369a();
        }
        C98519c2 c2Var = (C98519c2) C86312j.m106911c(C98519c2.class);
        if (c2Var != null) {
            c2Var.mo57045H5();
        }
        C96254a.m123394d().mo133937j();
        C92313c.m116089a().mo126300c();
        this.f278678i1.dead();
        this.f278677h1.dead();
        this.f278695w1.dead();
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls2) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls2)).f254918n) == null)) {
            this.f278641M1 = Math.max(0, ((long) ((int) cVar.f258449e)) - this.f278641M1);
        }
        this.f278643N1 = Util.nowSecond() > this.f278643N1 ? Util.nowSecond() - this.f278643N1 : 1;
        C40318k.m43492a().reportFPS(701, C40318k.m43492a().getHcSNSScrollAction(), 1, this.f278641M1, this.f278643N1);
        this.f278641M1 = 0;
        this.f278643N1 = 0;
        if (((C110234e) C86312j.m106911c(cls)).mo161398Zc() != null) {
            ((C110234e) C86312j.m106911c(cls)).mo161398Zc().mo22761a(101, false, false);
        }
        SnsTimelineUIStatusEvent snsTimelineUIStatusEvent = new SnsTimelineUIStatusEvent();
        snsTimelineUIStatusEvent.f79003d.f79004a = Boolean.FALSE;
        snsTimelineUIStatusEvent.asyncPublish(Looper.getMainLooper());
        C99181f fVar = C99181f.f290857a;
        SnsMethodCalculate.markStartTimeMs("reportAll", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C61926c.m72661F("MicroMsg.Image.SnsImageLoadReporter", C99198r.f290892d);
        SnsMethodCalculate.markEndTimeMs("reportAll", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.SnsTimeLineUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return;
        }
        Log.m105925i("MicroMsg.SnsTimeLineUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 18) {
            if (iArr[0] == 0) {
                SnsMethodCalculate.markStartTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                m122311q8(this, Boolean.TRUE);
                SnsMethodCalculate.markEndTimeMs("doCpatureMMSight", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            } else {
                int i2 = "android.permission.CAMERA".equals(strArr[0]) ? C0966R.string.hhq : C0966R.string.f361130hi2;
                if (iArr[0] != 0) {
                    C76879j.m92709C(this, getString(i2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new SnsTimeLineUI$$w0(this), new SnsTimeLineUI$$x0(this));
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onResume() {
        C94895m2 m2Var;
        C98963o oVar;
        SnsInfo item;
        C89940c cVar;
        Class cls = C88146a.class;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C99181f fVar = C99181f.f290857a;
        SnsMethodCalculate.markStartTimeMs("startSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C61926c.m72661F("SnsImageLoadReporter", C99204x.f290901d);
        SnsMethodCalculate.markEndTimeMs("startSession", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        C94974y1 fy02 = C94866e1.fy0();
        fy02.getClass();
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        fy02.f275362q = 2;
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        C95741b5 b5Var = this.f278685p0;
        b5Var.getClass();
        SnsMethodCalculate.markStartTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        b5Var.f279254b = b5Var.mo133184b();
        SnsMethodCalculate.markEndTimeMs("onUIResume", "com.tencent.mm.plugin.sns.ui.SnsNetworkMgr");
        this.f278643N1 = Util.nowSecond();
        if (!(!C91441c.m114729c() || C91441c.m114730d().mo125377a(cls) == null || (cVar = ((C88146a) C91441c.m114730d().mo125377a(cls)).f254918n) == null)) {
            this.f278641M1 = (long) ((int) cVar.f258449e);
        }
        try {
            if (!this.f278648Q0) {
                Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "onResume callback");
                ScreenShotUtil.setScreenShotCallback(this, this.f278644O1);
                this.f278648Q0 = true;
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsTimeLineUI.ScreenShot", th.toString());
        }
        this.mUIAction.mo133048z();
        super.onResume();
        C100905b bVar = this.f278667Y0;
        if (bVar != null) {
            bVar.mo140372d();
        }
        C98519c2 c2Var = (C98519c2) C86312j.m106911c(C98519c2.class);
        if (c2Var == null || !c2Var.mo57046b2(this)) {
            boolean a = C33418b.f90548a.mo59132a(this.f278685p0);
            this.f278666Y = a;
            mo132960z8(a);
            this.f278639L1 = Util.nowSecond();
            SnsMethodCalculate.markStartTimeMs("reportFristIn", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            if (!this.f278637K1) {
                SnsMethodCalculate.markEndTimeMs("reportFristIn", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            } else {
                this.f278637K1 = false;
                int count = this.f278699y.getCount();
                if (getIntent().getIntExtra("sns_enter_scene", -1) == 1) {
                    Intent intent = getIntent();
                    int i = C91998s.f263358l;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("enter_log");
                    if (!((byteArrayExtra == null ? null : C91998s.m115548b(byteArrayExtra)) == null || count <= 0 || (item = this.f278699y.getItem(0)) == null)) {
                        C102236a0.m134765q0(item.field_snsId);
                    }
                }
                SnsMethodCalculate.markEndTimeMs("reportFristIn", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            }
            SnsMethodCalculate.markStartTimeMs("initScreenSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            if (this.f278635J1 != 0) {
                SnsMethodCalculate.markEndTimeMs("initScreenSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                this.f278635J1 = displayMetrics.widthPixels;
                C94988a aVar = this.f278638L;
                aVar.getClass();
                SnsMethodCalculate.markStartTimeMs("setScreen", "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper");
                aVar.getClass();
                aVar.getClass();
                SnsMethodCalculate.markEndTimeMs("setScreen", "com.tencent.mm.plugin.sns.statistics.CaptureSnsHelper");
                SnsMethodCalculate.markEndTimeMs("initScreenSize", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            }
            if (C94866e1.qy0()) {
                finish();
            }
            C94901o Fx0 = C94866e1.Fx0();
            SnsTimeLineBaseAdapter g = this.f278699y.mo137288g();
            Fx0.getClass();
            SnsMethodCalculate.markStartTimeMs("setIvirtualItem", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            Fx0.f275006l = g;
            SnsMethodCalculate.markEndTimeMs("setIvirtualItem", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            mo93528H7().mo136934f(C99064d.class);
            List<C97624e3> list = C94886k0.f274960h;
            SnsMethodCalculate.markStartTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            if (!((LinkedList) C94886k0.f274960h).contains(this)) {
                ((LinkedList) C94886k0.f274960h).add(this);
            }
            SnsMethodCalculate.markEndTimeMs("addNotifyListener", "com.tencent.mm.plugin.sns.model.NetSceneSnsSync");
            if (this.f278622D) {
                this.f278618B.post(new SnsTimeLineUI$$d0(this));
            } else {
                SnsTimeLineUI$$y0 snsTimeLineUI$$y0 = this.f278630H;
                snsTimeLineUI$$y0.getClass();
                SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
                if (m122291S7(snsTimeLineUI$$y0.f278791A).getVisibility() != 0) {
                    SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
                } else {
                    snsTimeLineUI$$y0.mo133006a();
                    AbsoluteLayout.LayoutParams layoutParams = (AbsoluteLayout.LayoutParams) m122291S7(snsTimeLineUI$$y0.f278791A).getLayoutParams();
                    layoutParams.y = (int) snsTimeLineUI$$y0.f278795g;
                    m122291S7(snsTimeLineUI$$y0.f278791A).setLayoutParams(layoutParams);
                    m122291S7(snsTimeLineUI$$y0.f278791A).invalidate();
                    SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
                }
            }
            BaseTimeLine baseTimeLine = this.f278626F;
            if (!(baseTimeLine == null || (oVar = baseTimeLine.f276699f) == null)) {
                oVar.mo138315v();
            }
            C97979c cVar2 = this.f278699y;
            if (cVar2 != null) {
                cVar2.mo137288g().mo132927v();
            }
            BaseTimeLine baseTimeLine2 = this.f278626F;
            if (!(baseTimeLine2 == null || (m2Var = baseTimeLine2.f276700g) == null)) {
                m2Var.mo130970a().mo131330q(true);
                this.f278626F.f276700g.mo130970a().mo131328o(false);
                this.f278626F.f276700g.mo130970a().mo131329p(false);
                this.f278626F.f276700g.mo130970a().mo131326m(false);
                this.f278626F.f276700g.mo130970a().mo131321h(false);
                SnsBrowseInfoHelper a2 = this.f278626F.f276700g.mo130970a();
                a2.getClass();
                SnsMethodCalculate.markStartTimeMs("handleExitClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
                a2.mo131320g(false);
                a2.mo131322i(false);
                a2.mo131323j(false);
                a2.mo131317d(false);
                a2.mo131324k(false);
                a2.mo131317d(false);
                a2.mo131319f(false);
                a2.mo131325l(false);
                a2.mo131317d(false);
                a2.mo131316c(false);
                a2.mo131332s(false);
                a2.mo131318e(false);
                a2.mo131327n(false);
                SnsMethodCalculate.markEndTimeMs("handleExitClickFeed", "com.tencent.mm.plugin.sns.statistics.SnsBrowseInfoHelper");
            }
            C94901o Fx02 = C94866e1.Fx0();
            Fx02.getClass();
            SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            Fx02.f275008n = 0;
            Fx02.f275009o = 0;
            SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            this.f278678i1.alive();
            this.f278677h1.alive();
            this.f278695w1.alive();
            SnsTimelineUIStatusEvent snsTimelineUIStatusEvent = new SnsTimelineUIStatusEvent();
            snsTimelineUIStatusEvent.f79003d.f79004a = Boolean.TRUE;
            snsTimelineUIStatusEvent.asyncPublish(Looper.getMainLooper());
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return;
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C89779i0 i0Var;
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        Log.m105924i("MicroMsg.SnsTimeLineUI", "uionSceneEnd: errType = " + i + " errCode = " + i2 + " errMsg = " + str + " type = " + yVar.getType());
        if (yVar.getType() == 218) {
            C94877g0 g0Var = (C94877g0) yVar;
            if ((g0Var.mo131050m1() == 1 || g0Var.mo131050m1() == 6 || g0Var.mo131050m1() == 4) && (i0Var = this.f278626F.f276694E) != null) {
                i0Var.dismiss();
            }
            if (g0Var.mo131050m1() == 11) {
                this.mUIAction.getClass();
            }
        }
        C97979c cVar = this.f278699y;
        if (cVar != null) {
            cVar.mo133186F0("");
        }
        if (yVar.getType() == 211) {
            if (((C94916o0) yVar).mo131165Z0()) {
                C91998s.m115550d(727);
                this.f278699y.getCount();
            } else {
                C91998s.m115550d(728);
                this.f278699y.getCount();
            }
            SnsTimeLineUI$$y0 snsTimeLineUI$$y0 = this.f278630H;
            if (snsTimeLineUI$$y0 != null) {
                this.f278622D = false;
                snsTimeLineUI$$y0.mo133008b();
            }
        }
        m122281C8(i, i2, str, yVar, this);
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onStart() {
        SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C98519c2 c2Var = (C98519c2) C86312j.m106911c(C98519c2.class);
        if (c2Var != null) {
            c2Var.mo57047w2();
        }
        super.onStart();
        SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onStop() {
        SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        super.onStop();
        SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void onWindowFocusChanged(boolean z) {
        SnsMethodCalculate.markStartTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        super.onWindowFocusChanged(z);
        Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "hasFocus = " + z);
        if (!z) {
            try {
                ScreenShotUtil.setScreenShotCallback(this, (ScreenShotUtil.ScreenShotCallback) null);
                this.f278648Q0 = false;
            } catch (Throwable th) {
                Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "hasFocus = " + z);
                Log.m105920e("MicroMsg.SnsTimeLineUI.ScreenShot", th.toString());
            }
        } else if (!this.f278648Q0) {
            Log.m105924i("MicroMsg.SnsTimeLineUI.ScreenShot", "onWindowFocusChanged callback");
            ScreenShotUtil.setScreenShotCallback(this, this.f278644O1);
            this.f278648Q0 = true;
        }
        C100905b bVar = this.f278667Y0;
        if (bVar != null && z) {
            bVar.mo140372d();
        }
        SnsMethodCalculate.markEndTimeMs("onWindowFocusChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: p8 */
    public final boolean mo132954p8(View view) {
        SnsMethodCalculate.markStartTimeMs("checkItemVisibleInScreen", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = false;
        try {
            if (getContext() != null) {
                if (!getContext().isFinishing()) {
                    Rect rect = new Rect();
                    view.getGlobalVisibleRect(rect);
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    getContext().getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                    int i = displayMetrics.heightPixels;
                    int l = this.mActionBar.mo91101l() + C85875k4.m106200p(this);
                    Log.m105925i("MicroMsg.SnsTimeLineUI.ScreenShot", "lxl checkItemVisible actionbar height:%s, total height:%s, screenHeight:%s, top:%s, bottom:%s", Integer.valueOf(this.mActionBar.mo91101l()), Integer.valueOf(l), Integer.valueOf(i), Integer.valueOf(rect.top), Integer.valueOf(rect.bottom));
                    if (rect.bottom > l && i > rect.top) {
                        z = true;
                    }
                    SnsMethodCalculate.markEndTimeMs("checkItemVisibleInScreen", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                    return z;
                }
            }
            SnsMethodCalculate.markEndTimeMs("checkItemVisibleInScreen", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return false;
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.SnsTimeLineUI.ScreenShot", th.toString());
            SnsMethodCalculate.markEndTimeMs("checkItemVisibleInScreen", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
            return false;
        }
    }

    /* renamed from: r8 */
    public final int mo132955r8() {
        SnsMethodCalculate.markStartTimeMs("getExposeMaxCountByFinderStatus", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        int i = this.f278659U0;
        int i2 = i == 0 ? this.f278651R0 : i == 1 ? this.f278654S0 : this.f278657T0;
        SnsMethodCalculate.markEndTimeMs("getExposeMaxCountByFinderStatus", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return i2;
    }

    /* renamed from: s8 */
    public C98963o mo132956s8() {
        SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        C98963o oVar = this.f278640M;
        SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return oVar;
    }

    public void setActionbarColor(int i) {
        SnsMethodCalculate.markStartTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        super.setActionbarColor(i);
        View view = this.f278703z1;
        if (view != null) {
            view.setBackgroundColor(getWindow().getStatusBarColor());
            C87773e.m109211d(getWindow());
        }
        SnsMethodCalculate.markEndTimeMs("setActionbarColor", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        SnsMethodCalculate.markStartTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        super.superImportUIComponents(hashSet);
        hashSet.add(C102723a.class);
        hashSet.add(C16343b.class);
        SnsMethodCalculate.markEndTimeMs("superImportUIComponents", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    public boolean supportNavigationSwipeBack() {
        SnsMethodCalculate.markStartTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean supportNavigationSwipeBack = super.supportNavigationSwipeBack();
        SnsMethodCalculate.markEndTimeMs("supportNavigationSwipeBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        return supportNavigationSwipeBack;
    }

    /* renamed from: t1 */
    public void mo25924t1(SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("notifyObject", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        SnsMethodCalculate.markEndTimeMs("notifyObject", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: u8 */
    public final void mo132957u8() {
        C32735h.C32737c cVar = C32735h.C32737c.clicfg_clip_page_finder_promotion_entrance;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("initFinderEntranceConfig", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (Util.isNullOrNil(C75592q0.m90778h())) {
            this.f278659U0 = 0;
        } else if (!((C60200t1) C86312j.m106911c(C60200t1.class)).u60()) {
            this.f278659U0 = 1;
        } else {
            this.f278659U0 = 2;
        }
        String Y60 = (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) ? ((C32735h) C86312j.m106911c(cls)).Y60(cVar, "{\"enable\":2,\"max_count_no_user\":0,\"max_count_no_feed\":0,\"max_count_normal\":0}") : ((C32735h) C86312j.m106911c(cls)).Y60(cVar, "");
        if (!Util.isNullOrNil(Y60)) {
            try {
                JSONObject jSONObject = new JSONObject(Y60);
                f278612U1 = jSONObject.getInt("enable");
                this.f278651R0 = jSONObject.getInt("max_count_no_user");
                this.f278654S0 = jSONObject.getInt("max_count_no_feed");
                this.f278657T0 = jSONObject.getInt("max_count_normal");
            } catch (Exception e) {
                Log.m105929w("MicroMsg.SnsTimeLineUI", "parse SnsFinderEntranceConfig fail. %s", e.getMessage());
            }
        }
        int i = C90188n0.f258927U;
        if (i > 0) {
            f278612U1 = i;
            if (i == 1) {
                this.f278651R0 = -1;
                this.f278654S0 = -1;
                this.f278657T0 = -1;
            }
        }
        Log.m105925i("MicroMsg.SnsTimeLineUI", "curFinderStatus:%s, finderEntranceEnable:%s, finderEntranceMaxCountNoUser:%s, finderEntranceMaxCountNoFeed:%s, finderEntranceMaxCountNormal:%s", Integer.valueOf(this.f278659U0), Integer.valueOf(f278612U1), Integer.valueOf(this.f278651R0), Integer.valueOf(this.f278654S0), Integer.valueOf(this.f278657T0));
        SnsMethodCalculate.markEndTimeMs("initFinderEntranceConfig", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: v8 */
    public final void mo132958v8() {
        SnsMethodCalculate.markStartTimeMs("initOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        setTitleBarClickListener(new SnsTimeLineUI$$q0(this), new SnsTimeLineUI$$r0(this));
        setBackBtn(this.f278649Q1, C0966R.raw.actionbar_icon_dark_back);
        SnsMethodCalculate.markEndTimeMs("initOptionMenu", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: y0 */
    public void mo25929y0() {
        SnsMethodCalculate.markStartTimeMs("notifyCommentChnage", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        mo93528H7().mo136934f(C99064d.class);
        SnsMethodCalculate.markEndTimeMs("notifyCommentChnage", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: y8 */
    public final void mo132959y8(C91998s sVar) {
        C91998s sVar2 = sVar;
        SnsMethodCalculate.markStartTimeMs("openMMGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        long c = C31543z5.m39453c();
        String l = C102236a0.m134754l();
        C110992d dVar = C110992d.f332425a;
        C87412m.m108594g(l, "sessionId");
        C110992d.f332433i = l;
        C110992d.f332434j = l;
        SecondCutShareSnsStruct A = SnsReportHelper.f275506m0.mo131340A();
        A.f265826g = A.mo86045b("MonmentSessionId", l, true);
        C115669n.INSTANCE.mo160131h(13822, 2, 2, l, Long.valueOf(c));
        C95006y.f275639b.mo131396a(sVar2);
        sVar.getClass();
        SnsUIAction snsUIAction = this.mUIAction;
        snsUIAction.getClass();
        SnsMethodCalculate.markStartTimeMs("set_701_right_btn_oplog", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        snsUIAction.f278848X = sVar2;
        SnsMethodCalculate.markEndTimeMs("set_701_right_btn_oplog", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
        this.mUIAction.mo133026B(1, 1);
        this.f278668Z.mo132961a(2);
        mo132946D8(this.f278668Z);
        if (this.f278652R1 != 0) {
            SnsReportHelper.f275506m0.mo131354O(1, getString(C0966R.string.c38), 2, mo132955r8(), this.f278652R1, f278612U1);
            this.f278652R1 = 0;
        }
        mo132945A8(2);
        SnsMethodCalculate.markEndTimeMs("openMMGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }

    /* renamed from: z8 */
    public final void mo132960z8(boolean z) {
        SnsMethodCalculate.markStartTimeMs("postCheckAutoPlay", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        this.mUIAction.f278851d.postDelayed(new SnsTimeLineUI$$o(this, z), 15);
        SnsMethodCalculate.markEndTimeMs("postCheckAutoPlay", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
    }
}
