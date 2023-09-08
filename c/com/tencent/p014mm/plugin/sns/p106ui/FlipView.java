package com.tencent.p014mm.plugin.sns.p106ui;

import a14.C53884f2;
import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import av2.C92094a;
import av2.C92102e;
import av2.C92115f;
import av2.C92116g;
import av2.C92118i;
import av2.C92121j;
import av2.C92123k;
import av2.C92124l;
import av2.C92125p;
import av2.C92126r;
import c00.C0405n;
import c00.C92330r;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DealQBarStrEvent;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.autogen.events.NotifyDealQBarStrResultEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileFailedEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.scanner.C94468m;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.sns.model.C94853e;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94897n1;
import com.tencent.p014mm.plugin.sns.p106ui.GalleryTitleManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import gy3.C87412m;
import hh2.C8532a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import ke3.C88144b;
import os2.C100417r0;
import p200lx.C46897s;
import p200lx.C46900z;
import p823sg.C90193h;
import qo3.C77407n;
import rx3.C13604l;
import te3.C101804kv2;
import u73.C101980n;
import vr2.C102236a0;
import wx3.C15601d;
import wx3.C66212f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView */
public abstract class FlipView extends LinearLayout implements C94853e.C94861h {

    /* renamed from: S */
    public static final /* synthetic */ int f276772S = 0;

    /* renamed from: A */
    public C96983o3 f276773A = C96983o3.f284139k;

    /* renamed from: B */
    public int f276774B = 0;

    /* renamed from: C */
    public FlipView$$n f276775C;

    /* renamed from: D */
    public View.OnLongClickListener f276776D;

    /* renamed from: E */
    public FlipView$$o f276777E;

    /* renamed from: F */
    public Long f276778F = 0L;

    /* renamed from: G */
    public Long f276779G = 0L;

    /* renamed from: H */
    public Long f276780H = 0L;

    /* renamed from: I */
    public FlipView$$j f276781I = new FlipView$$j(this);

    /* renamed from: J */
    public IListener f276782J;

    /* renamed from: K */
    public IListener<RecogQBarOfImageFileFailedEvent> f276783K;

    /* renamed from: L */
    public IListener f276784L;

    /* renamed from: M */
    public String f276785M;

    /* renamed from: N */
    public C101804kv2 f276786N;

    /* renamed from: P */
    public List<FlipView$$m> f276787P;

    /* renamed from: Q */
    public List<FlipView$$k> f276788Q;

    /* renamed from: R */
    public List<FlipView$$l> f276789R;

    /* renamed from: d */
    public double f276790d = 0.0d;

    /* renamed from: e */
    public double f276791e = 0.0d;

    /* renamed from: f */
    public long f276792f = 0;

    /* renamed from: g */
    public C96327z0 f276793g;

    /* renamed from: h */
    public GalleryTitleManager.C95343c f276794h;

    /* renamed from: i */
    public MMHandler f276795i;

    /* renamed from: j */
    public int f276796j;

    /* renamed from: n */
    public Context f276797n;

    /* renamed from: o */
    public boolean f276798o = false;

    /* renamed from: p */
    public long f276799p = 0;

    /* renamed from: q */
    public boolean f276800q = false;

    /* renamed from: r */
    public boolean f276801r = false;

    /* renamed from: s */
    public boolean f276802s = false;

    /* renamed from: t */
    public C92126r f276803t;

    /* renamed from: u */
    public String f276804u;

    /* renamed from: v */
    public String f276805v;

    /* renamed from: w */
    public String f276806w;

    /* renamed from: x */
    public long f276807x;

    /* renamed from: y */
    public ArrayList<ImageQBarDataBean> f276808y = new ArrayList<>();

    /* renamed from: z */
    public ImageQBarDataBean f276809z = null;

    public FlipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C40008f fVar = C40008f.f107254d;
        this.f276782J = new IListener<RecogQBarOfImageFileResultEvent>(fVar) {
            {
                this.__eventId = 812146647;
            }

            public boolean callback(IEvent iEvent) {
                ArrayList<ImageQBarDataBean> arrayList;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                FlipView flipView = FlipView.this;
                int i = FlipView.f276772S;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                boolean z = flipView.f276800q;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z) {
                    Log.m105924i("MicroMsg.FlipView", "no need to scan image");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                } else if (FlipView.m121476d(FlipView.this) == null || FlipView.m121475c(FlipView.this) == null) {
                    Log.m105920e("MicroMsg.FlipView", "not in recoging");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                } else if (recogQBarOfImageFileResultEvent == null) {
                    Log.m105920e("MicroMsg.FlipView", "receive invalid callbak");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                } else if (!recogQBarOfImageFileResultEvent.f265015d.f265016a.equals(FlipView.m121475c(FlipView.this))) {
                    Log.m105920e("MicroMsg.FlipView", "not same filepath");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                } else {
                    FlipView.this.f276778F = Long.valueOf(System.currentTimeMillis());
                    FlipView flipView2 = FlipView.this;
                    long currentTimeMillis = System.currentTimeMillis();
                    FlipView flipView3 = FlipView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.FlipView");
                    Long l = flipView3.f276780H;
                    SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView2.f276779G = Long.valueOf(currentTimeMillis - l.longValue());
                    FlipView.this.f276808y = C96874n1.f283849a.mo135192a(recogQBarOfImageFileResultEvent);
                    Log.m105924i("MicroMsg.FlipView", "recog result: " + FlipView.this.f276808y.size());
                    FlipView flipView4 = FlipView.this;
                    FlipView.m121473a(flipView4, FlipView.m121475c(flipView4), FlipView.this.f276808y);
                    if (!Util.isNullOrNil((List) FlipView.this.f276808y)) {
                        if (FlipView.m121476d(FlipView.this) != null) {
                            C92126r d = FlipView.m121476d(FlipView.this);
                            View currentImageView = FlipView.this.getCurrentImageView();
                            FlipView flipView5 = FlipView.this;
                            ArrayList<ImageQBarDataBean> arrayList2 = flipView5.f276808y;
                            SnsInfo b = FlipView.m121474b(flipView5);
                            SnsMethodCalculate.markStartTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            C87412m.m108594g(d, "<this>");
                            C87412m.m108594g(arrayList2, "imageQBarDataList");
                            ImageQBarDataBean b2 = C92121j.m115793b(d, currentImageView, arrayList2);
                            if (b2 != null) {
                                String str = b2.f273113d;
                                C46897s.C46898a aVar = new C46897s.C46898a(str);
                                if (b != null) {
                                    String userName = b.getUserName();
                                    arrayList = arrayList2;
                                    String valueOf = String.valueOf(b.field_snsId);
                                    C46897s.C46898a aVar2 = new C46897s.C46898a(str);
                                    aVar2.f126106b = 3;
                                    aVar2.f126107c = userName;
                                    aVar2.f126108d = valueOf;
                                    aVar = aVar2;
                                } else {
                                    arrayList = arrayList2;
                                }
                                ((ScanCodeSheetItemLogic) d.mo126102e()).mo67080k(b2.f273114e, aVar, new C92123k(d, currentImageView, arrayList));
                                SnsMethodCalculate.markEndTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            } else {
                                ArrayList<ImageQBarDataBean> arrayList3 = arrayList2;
                                int size = arrayList3.size();
                                if (size == 1) {
                                    ImageQBarDataBean imageQBarDataBean = arrayList3.get(0);
                                    C87412m.m108593f(imageQBarDataBean, "imageQBarDataList[0]");
                                    ImageQBarDataBean imageQBarDataBean2 = imageQBarDataBean;
                                    C46900z e = d.mo126102e();
                                    String str2 = imageQBarDataBean2.f273113d;
                                    C46897s.C46898a aVar3 = new C46897s.C46898a(str2);
                                    if (b != null) {
                                        String userName2 = b.getUserName();
                                        String valueOf2 = String.valueOf(b.field_snsId);
                                        C46897s.C46898a aVar4 = new C46897s.C46898a(str2);
                                        aVar4.f126106b = 3;
                                        aVar4.f126107c = userName2;
                                        aVar4.f126108d = valueOf2;
                                        aVar3 = aVar4;
                                    }
                                    ((ScanCodeSheetItemLogic) e).mo67080k(imageQBarDataBean2.f273114e, aVar3, new C92124l(d, currentImageView, arrayList3));
                                } else if (size > 1 && d.mo126101d().mo107563h()) {
                                    SnsMethodCalculate.markStartTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                                    d.f263723e = true;
                                    SnsMethodCalculate.markEndTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                                    C92121j.m115792a(d, currentImageView, arrayList3);
                                    d.mo126109l();
                                }
                                SnsMethodCalculate.markEndTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            }
                        }
                        FlipView flipView6 = FlipView.this;
                        String c = FlipView.m121475c(flipView6);
                        FlipView flipView7 = FlipView.this;
                        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.FlipView");
                        String str3 = flipView7.f276805v;
                        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.FlipView");
                        FlipView flipView8 = FlipView.this;
                        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.FlipView");
                        String str4 = flipView8.f276806w;
                        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.FlipView");
                        flipView6.mo132156q(c, str3, str4, false);
                    }
                    FlipView flipView9 = FlipView.this;
                    SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView9.f276804u = null;
                    SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                return false;
            }
        };
        this.f276783K = new IListener<RecogQBarOfImageFileFailedEvent>(fVar) {
            {
                this.__eventId = 1700407223;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                FlipView flipView = FlipView.this;
                int i = FlipView.f276772S;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                boolean z = flipView.f276800q;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z) {
                    Log.m105924i("MicroMsg.FlipView", "no need to scan image");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                } else if (FlipView.m121476d(FlipView.this) == null || FlipView.m121475c(FlipView.this) == null) {
                    Log.m105920e("MicroMsg.FlipView", "not in recoging");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                } else if (!recogQBarOfImageFileFailedEvent.f107738d.f107739a.equals(FlipView.m121475c(FlipView.this))) {
                    Log.m105920e("MicroMsg.FlipView", "not same filepath");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                } else {
                    FlipView flipView2 = FlipView.this;
                    FlipView.m121473a(flipView2, FlipView.m121475c(flipView2), (List) null);
                    FlipView flipView3 = FlipView.this;
                    SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView3.f276804u = null;
                    SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                return false;
            }
        };
        this.f276784L = new IListener<NotifyDealQBarStrResultEvent>(fVar) {
            {
                this.__eventId = 1280295539;
            }

            public boolean callback(IEvent iEvent) {
                ImageQBarDataBean imageQBarDataBean;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent = (NotifyDealQBarStrResultEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                FlipView flipView = FlipView.this;
                int i = FlipView.f276772S;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                boolean z = flipView.f276800q;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z) {
                    Log.m105924i("MicroMsg.FlipView", "no need to scan image");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                } else if (notifyDealQBarStrResultEvent != null) {
                    Log.m105925i("MicroMsg.FlipView", "notify Event: %d", Integer.valueOf(notifyDealQBarStrResultEvent.f264935d.f264938c));
                    Activity activity = notifyDealQBarStrResultEvent.f264935d.f264937b;
                    FlipView flipView2 = FlipView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.FlipView");
                    Context context = flipView2.f276797n;
                    SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.FlipView");
                    if (activity != ((Activity) context) || (imageQBarDataBean = FlipView.this.f276809z) == null || !notifyDealQBarStrResultEvent.f264935d.f264936a.equals(imageQBarDataBean.f273113d)) {
                        Log.m105920e("MicroMsg.FlipView", "not the same");
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                    } else {
                        if (notifyDealQBarStrResultEvent.f264935d.f264938c == 3) {
                            FlipView flipView3 = FlipView.this;
                            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.FlipView");
                            Context context2 = flipView3.f276797n;
                            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.FlipView");
                            ((Activity) context2).finish();
                        }
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                    }
                } else {
                    Log.m105920e("MicroMsg.FlipView", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                return false;
            }
        };
        this.f276785M = null;
        this.f276786N = null;
        this.f276787P = null;
        this.f276788Q = null;
        this.f276789R = null;
        mo132151m(context);
    }

    /* renamed from: a */
    public static void m121473a(FlipView flipView, String str, List list) {
        SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.FlipView");
        flipView.getClass();
        SnsMethodCalculate.markStartTimeMs("dispatchCodeScanned", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView$$c flipView$$c = new FlipView$$c(flipView, str, list);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            flipView$$c.run();
        }
        ((C119157j) C119157j.f356862d).mo183895z(flipView$$c);
        SnsMethodCalculate.markEndTimeMs("dispatchCodeScanned", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    /* renamed from: b */
    public static /* synthetic */ SnsInfo m121474b(FlipView flipView) {
        SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsInfo snsInfo = flipView.getSnsInfo();
        SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.FlipView");
        return snsInfo;
    }

    /* renamed from: c */
    public static /* synthetic */ String m121475c(FlipView flipView) {
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.FlipView");
        String str = flipView.f276804u;
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.FlipView");
        return str;
    }

    /* renamed from: d */
    public static /* synthetic */ C92126r m121476d(FlipView flipView) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.FlipView");
        C92126r rVar = flipView.f276803t;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.FlipView");
        return rVar;
    }

    private String getMediaPath() {
        SnsMethodCalculate.markStartTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.FlipView");
        String b = C92125p.m115797b(this.f276785M, this.f276786N);
        SnsMethodCalculate.markEndTimeMs("getMediaPath", "com.tencent.mm.plugin.sns.ui.FlipView");
        return b;
    }

    private ImageQBarDataBean getQBarDataOnCurrentDisplay() {
        SnsMethodCalculate.markStartTimeMs("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.FlipView");
        C13604l<ArrayList<ImageQBarDataBean>, ArrayList<PointF>> a = C94468m.m119493a(this.f276797n, getCurrentImageView(), this.f276808y, 0);
        ImageQBarDataBean imageQBarDataBean = ((ArrayList) a.f38555d).size() == 1 ? (ImageQBarDataBean) ((ArrayList) a.f38555d).get(0) : null;
        SnsMethodCalculate.markEndTimeMs("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.FlipView");
        return imageQBarDataBean;
    }

    private SnsInfo getSnsInfo() {
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (this instanceof SnsInfoFlip) {
            if (((SnsInfoFlip) this).getFromScene().f284144a.equals("timeline")) {
                SnsInfo DN = C94866e1.Yx0().mo139798DN(this.f276805v);
                SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
                return DN;
            }
            Log.m105920e("MicroMsg.FlipView", "getFetchCodeInfoParam of SnsInfoFlip, getSnsInfo failed: " + Util.nullAsNil(this.f276805v));
        }
        SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m121477k(java.lang.String r14, android.content.Context r15) {
        /*
            java.lang.String r0 = "MicroMsg.FlipView"
            java.lang.String r1 = "getImagePath"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.FlipView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 0
            if (r14 == 0) goto L_0x00c5
            java.lang.String r4 = ""
            boolean r5 = r14.equals(r4)
            if (r5 != 0) goto L_0x00c5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = a70.C112760b.m154240l()
            r5.append(r6)
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "image"
            r8 = 0
            r6[r8] = r7
            int r7 = r14.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            r6[r9] = r7
            r7 = 2
            java.lang.String r10 = "jpg"
            r6[r7] = r10
            java.lang.String r7 = "%s%d.%s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r7 = r7.getCacheDir()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "tmp"
            r10.append(r11)
            long r11 = java.lang.System.currentTimeMillis()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r6.<init>((java.io.File) r7, (java.lang.String) r10)
            java.lang.String r6 = r6.mo119971i()
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106443d(r14, r6, r8)
            r12 = 0
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 >= 0) goto L_0x007b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x007b:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.isProgressive(r6)
            if (r7 == 0) goto L_0x00af
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.MMNativeJpeg.decodeAsBitmap(r6)     // Catch:{ FileNotFoundException -> 0x009e, OutOfMemoryError -> 0x0097 }
            if (r7 == 0) goto L_0x0090
            com.tencent.mm.plugin.sns.ui.FlipView$$i r10 = new com.tencent.mm.plugin.sns.ui.FlipView$$i     // Catch:{ FileNotFoundException -> 0x009e, OutOfMemoryError -> 0x0097 }
            r10.<init>(r7)     // Catch:{ FileNotFoundException -> 0x009e, OutOfMemoryError -> 0x0097 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageWriteOutputStream((java.lang.String) r5, (com.tencent.p014mm.sdk.platformtools.BitmapUtil.ImageWriteOSCallback) r10)     // Catch:{ FileNotFoundException -> 0x009e, OutOfMemoryError -> 0x0097 }
            goto L_0x0091
        L_0x0090:
            r9 = 0
        L_0x0091:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            goto L_0x00b0
        L_0x0095:
            r14 = move-exception
            goto L_0x00a8
        L_0x0097:
            r7 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0095 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r4, r9)     // Catch:{ all -> 0x0095 }
            goto L_0x00a4
        L_0x009e:
            r7 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x0095 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r7, r4, r9)     // Catch:{ all -> 0x0095 }
        L_0x00a4:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            goto L_0x00af
        L_0x00a8:
            com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            throw r14
        L_0x00af:
            r9 = 0
        L_0x00b0:
            if (r9 != 0) goto L_0x00be
            long r6 = com.tencent.p014mm.vfs.C86013q1.m106443d(r14, r5, r8)
            int r14 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x00be
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        L_0x00be:
            com.tencent.p014mm.sdk.system.AndroidMediaUtil.refreshMediaScanner(r5, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r5
        L_0x00c5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.FlipView.m121477k(java.lang.String, android.content.Context):java.lang.String");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (motionEvent.getAction() == 0) {
            Log.m105918d("MicroMsg.FlipView", "onTouchEvent down");
            this.f276790d = (double) motionEvent.getX();
            this.f276791e = (double) motionEvent.getY();
            this.f276792f = System.currentTimeMillis();
            if (motionEvent.getPointerCount() == 1) {
                this.f276798o = false;
            }
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f276798o = true;
        }
        if (motionEvent.getAction() == 1 && !this.f276798o) {
            Log.m105918d("MicroMsg.FlipView", "onTouchEvent up " + (System.currentTimeMillis() - this.f276792f));
            long currentTicks = Util.currentTicks();
            Log.m105918d("MicroMsg.FlipView", "deltTime: " + (currentTicks - this.f276799p));
            if (currentTicks - this.f276799p < 300) {
                this.f276795i.removeCallbacks(this.f276781I);
                this.f276795i.post(new FlipView$$d(this));
                boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
                return dispatchTouchEvent;
            }
            this.f276799p = currentTicks;
            if (System.currentTimeMillis() - this.f276792f < 500 && Math.abs(((double) motionEvent.getX()) - this.f276790d) <= 10.0d && Math.abs(((double) motionEvent.getY()) - this.f276791e) <= 10.0d && motionEvent.getY() > 110.0f && motionEvent.getY() < ((float) (this.f276796j - 100))) {
                FlipView$$j flipView$$j = this.f276781I;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                flipView$$j.getClass();
                SnsMethodCalculate.markStartTimeMs("setXY", "com.tencent.mm.plugin.sns.ui.FlipView$ClickRunnable");
                flipView$$j.f276830d = x;
                flipView$$j.f276831e = y;
                SnsMethodCalculate.markEndTimeMs("setXY", "com.tencent.mm.plugin.sns.ui.FlipView$ClickRunnable");
                this.f276795i.postDelayed(this.f276781I, 10);
            }
        }
        boolean dispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
        return dispatchTouchEvent2;
    }

    /* renamed from: e */
    public void mo132135e(FlipView$$l flipView$$l) {
        SnsMethodCalculate.markStartTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (this.f276789R == null) {
            this.f276789R = new ArrayList();
        }
        this.f276789R.add(flipView$$l);
        SnsMethodCalculate.markEndTimeMs("addMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    /* renamed from: f */
    public void mo132136f(ImageQBarDataBean imageQBarDataBean, SnsInfo snsInfo, String str) {
        SnsMethodCalculate.markStartTimeMs("dealWithCode", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276809z = imageQBarDataBean;
        Log.m105924i("MicroMsg.FlipView", "request deal QBAR string");
        if (imageQBarDataBean == null) {
            SnsMethodCalculate.markEndTimeMs("dealWithCode", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        DealQBarStrEvent dealQBarStrEvent = new DealQBarStrEvent();
        DealQBarStrEvent.C92468a aVar = dealQBarStrEvent.f264648d;
        aVar.f264650b = (Activity) this.f276797n;
        aVar.f264649a = imageQBarDataBean.f273113d;
        aVar.f264651c = imageQBarDataBean.f273114e;
        aVar.f264652d = imageQBarDataBean.f273115f;
        aVar.f264661m = imageQBarDataBean.f273121o;
        C101804kv2 d = C94897n1.m120366d(snsInfo, str);
        if (d != null) {
            DealQBarStrEvent.C92468a aVar2 = dealQBarStrEvent.f264648d;
            aVar2.f264658j = d.f298692g;
            aVar2.f264659k = d.f298676I;
        }
        DealQBarStrEvent.C92468a aVar3 = dealQBarStrEvent.f264648d;
        aVar3.f264657i = 38;
        Context context = this.f276797n;
        if (context instanceof Activity) {
            aVar3.f264660l = ((Activity) context).getIntent().getBundleExtra("_stat_obj");
        }
        SnsMethodCalculate.markStartTimeMs("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.FlipView");
        Bundle bundle = dealQBarStrEvent.f264648d.f264660l;
        if (bundle == null) {
            Log.m105924i("MicroMsg.FlipView", "addStatInfo4AppBrand, statObj is null");
            bundle = new Bundle();
            dealQBarStrEvent.f264648d.f264660l = bundle;
        }
        Log.m105924i("MicroMsg.FlipView", "addStatInfo4AppBrand, from sns");
        bundle.putInt("LaunchCodeScene_ScanScene", 2);
        SnsMethodCalculate.markEndTimeMs("addStatInfo4AppBrand", "com.tencent.mm.plugin.sns.ui.FlipView");
        dealQBarStrEvent.f264648d.f264660l.putString("stat_chat_talker_username", Util.nullAs(snsInfo.field_userName, ""));
        if (this instanceof SnsInfoFlip) {
            SnsInfoFlip snsInfoFlip = (SnsInfoFlip) this;
            C96983o3 fromScene = snsInfoFlip.getFromScene();
            Log.m105919d("MicroMsg.FlipView", "from Scene: %s", fromScene.f284144a);
            if (fromScene.f284144a.equals("album_friend") || fromScene.f284144a.equals("album_self") || fromScene.f284144a.equals("album_stranger")) {
                dealQBarStrEvent.f264648d.f264653e = 5;
                if (Util.isNullOrNil(snsInfoFlip.f278166k1)) {
                    Log.m105924i("MicroMsg.FlipView", "empty username");
                    snsInfoFlip.f278166k1 = "";
                }
                dealQBarStrEvent.f264648d.f264654f = snsInfoFlip.f278166k1;
            } else if (fromScene.f284144a.equals("timeline")) {
                dealQBarStrEvent.f264648d.f264653e = 3;
            } else {
                Log.m105925i("MicroMsg.FlipView", "other scene_from: %s", fromScene.f284144a);
            }
        }
        dealQBarStrEvent.publish();
        SnsMethodCalculate.markEndTimeMs("dealWithCode", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    /* renamed from: g */
    public final void mo132137g(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        FlipView$$b flipView$$b = new FlipView$$b(this, str, z);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            flipView$$b.run();
            SnsMethodCalculate.markEndTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        ((C119157j) C119157j.f356862d).mo183895z(flipView$$b);
        SnsMethodCalculate.markEndTimeMs("dispatchDownloadFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public C77407n getBottomSheet() {
        SnsMethodCalculate.markStartTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
        C92126r rVar = this.f276803t;
        if (rVar == null) {
            Log.m105924i("MicroMsg.FlipView", "getBottomSheet, mShareSheet is null");
            SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
            return null;
        }
        C77407n d = rVar.mo126101d();
        SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.FlipView");
        return d;
    }

    public C101804kv2 getCntMedia() {
        SnsMethodCalculate.markStartTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsMethodCalculate.markEndTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.FlipView");
        return null;
    }

    public View getCurrentImageView() {
        SnsMethodCalculate.markStartTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsMethodCalculate.markEndTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.FlipView");
        return null;
    }

    public C92094a.C92097e getCurrentMaterialInfo() {
        SnsMethodCalculate.markStartTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
        String str = this.f276785M;
        C101804kv2 kv22 = this.f276786N;
        C92094a aVar = C92094a.f263646a;
        SnsMethodCalculate.markStartTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        C92094a.C92097e a = C92094a.m115772a(C92125p.m115799d(str), kv22);
        SnsMethodCalculate.markEndTimeMs("buildMaterialInfo", "com.tencent.mm.plugin.sns.ui.sheet.AppBrandOpenMaterials");
        SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.FlipView");
        return a;
    }

    public String getCurrentMaterialPath() {
        SnsMethodCalculate.markStartTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.FlipView");
        String mediaPath = getMediaPath();
        SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.FlipView");
        return mediaPath;
    }

    public abstract MMViewPager getGallery();

    public abstract int getPosition();

    public abstract String getSelectedMediaId();

    public abstract long getSnsId();

    /* renamed from: h */
    public abstract boolean mo132147h(float f, float f2);

    /* renamed from: i */
    public List<ImageQBarDataBean> mo132148i(String str) {
        SnsMethodCalculate.markStartTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.FlipView");
        String mediaPath = getMediaPath();
        if (!str.equals(mediaPath)) {
            Log.m105925i("MicroMsg.FlipView", "getCodeScanResult, mediaPath: %s, curMediaPath: %s", str, mediaPath);
            SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.FlipView");
            return null;
        } else if (this.f276804u != null) {
            Log.m105924i("MicroMsg.FlipView", "getCodeScanResult, recognizingFilePath not null");
            SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.FlipView");
            return null;
        } else {
            ArrayList<ImageQBarDataBean> arrayList = this.f276808y;
            SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.FlipView");
            return arrayList;
        }
    }

    /* renamed from: j */
    public boolean mo132149j(String str) {
        SnsMethodCalculate.markStartTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.FlipView");
        String mediaPath = getMediaPath();
        if (!str.equals(mediaPath)) {
            Log.m105925i("MicroMsg.FlipView", "getDownloadResult, mediaPath: %s, curMediaPath: %s", str, mediaPath);
            SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.FlipView");
            return false;
        }
        boolean k = C86013q1.m106450k(str);
        SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.FlipView");
        return k;
    }

    /* renamed from: l */
    public void mo132150l(String str) {
        SnsMethodCalculate.markStartTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
        if (C86013q1.m106450k(str)) {
            RecordConfigProvider b = RecordConfigProvider.m119432b(str, "");
            if (this.f276773A != null) {
                VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
                videoCaptureReportInfo.f272940d = -1;
                b.f272908I = videoCaptureReportInfo;
            }
            b.f272912M.putBoolean("key_edit_enable_emoji_search", true);
            C8532a.f27585a.mo9446e(getContext(), 0, C0966R.C0968anim.f2492eg, -1, b, 1, 2);
        }
        SnsMethodCalculate.markEndTimeMs("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    /* renamed from: m */
    public final void mo132151m(Context context) {
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276797n = context;
        this.f276795i = new MMHandler();
        SnsMethodCalculate.markStartTimeMs("initDM", "com.tencent.mm.plugin.sns.ui.FlipView");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) this.f276797n).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f276796j = displayMetrics.heightPixels;
        SnsMethodCalculate.markEndTimeMs("initDM", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276782J.alive();
        this.f276783K.alive();
        this.f276784L.alive();
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    /* renamed from: n */
    public abstract boolean mo132152n();

    /* renamed from: o */
    public void mo132153o(FlipView$$k flipView$$k) {
        SnsMethodCalculate.markStartTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        List<FlipView$$k> list = this.f276788Q;
        if (list == null) {
            SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        list.remove(flipView$$k);
        if (this.f276788Q.isEmpty()) {
            this.f276788Q = null;
        }
        SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void onImageFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        mo132137g(C92125p.m115796a(str), z);
        SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void onSetbg() {
        SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void onSightFinish(String str, boolean z) {
        SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        mo132137g(C92125p.m115796a(str), z);
        SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void onThumbFinish(String str) {
        SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
        SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.FlipView");
        return true;
    }

    /* renamed from: p */
    public void mo132155p(FlipView$$l flipView$$l) {
        SnsMethodCalculate.markStartTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        List<FlipView$$l> list = this.f276789R;
        if (list == null) {
            SnsMethodCalculate.markEndTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        list.remove(flipView$$l);
        if (this.f276789R.isEmpty()) {
            this.f276789R = null;
        }
        SnsMethodCalculate.markEndTimeMs("removeMediaChangeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    /* renamed from: q */
    public void mo132156q(String str, String str2, String str3, boolean z) {
        HashSet hashSet;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        SnsMethodCalculate.markStartTimeMs("showAlertSave", "com.tencent.mm.plugin.sns.ui.FlipView");
        ArrayList arrayList = new ArrayList();
        SnsInfo DN = C94866e1.Yx0().mo139798DN(str5);
        if (DN == null) {
            Log.m105920e("MicroMsg.FlipView", "error!!show long click Alert snsInfo is null!!");
            SnsMethodCalculate.markEndTimeMs("showAlertSave", "com.tencent.mm.plugin.sns.ui.FlipView");
            return;
        }
        int i = DN.getTypeFlag() == 21 ? 1 : 0;
        if (this.f276803t == null) {
            this.f276803t = new C92126r((Activity) this.f276797n, 4, false, i);
        }
        this.f276803t.mo126099b(DN, getCntMedia());
        SnsMethodCalculate.markStartTimeMs("initMenuItem", "com.tencent.mm.plugin.sns.ui.FlipView");
        ArrayList arrayList2 = new ArrayList();
        if (DN.getTypeFlag() != 21) {
            arrayList2.add(1003);
            C88144b.m109788f("favorite");
            arrayList2.add(1006);
            if (DN.field_type == 1 && ((C101980n) C86312j.m106911c(C101980n.class)).mo134693tB() && C102236a0.m134755l0(this.f276774B) && !((C0405n) C86312j.m106911c(C0405n.class)).mo279e()) {
                arrayList2.add(1010);
                C92126r rVar = this.f276803t;
                rVar.getClass();
                SnsMethodCalculate.markStartTimeMs("getShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                boolean z2 = rVar.f263723e;
                SnsMethodCalculate.markEndTimeMs("getShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                if (!z2) {
                    ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
                    chatImageWebSearchActionStruct.mo126611w("");
                    chatImageWebSearchActionStruct.mo126609u(C102236a0.m134765q0(getSnsId()));
                    chatImageWebSearchActionStruct.f265370f = C102236a0.m134715J(this.f276774B);
                    chatImageWebSearchActionStruct.f265369e = 1;
                    chatImageWebSearchActionStruct.f265371g = 81;
                    chatImageWebSearchActionStruct.mo126608t("");
                    chatImageWebSearchActionStruct.mo126607s("");
                    chatImageWebSearchActionStruct.mo126610v(C90193h.m112876d(str));
                    chatImageWebSearchActionStruct.f265377m = System.currentTimeMillis();
                    chatImageWebSearchActionStruct.mo86054n();
                    ((C92330r) C86312j.m106911c(C92330r.class)).Ec0(chatImageWebSearchActionStruct);
                }
            }
        } else if (!DN.getUserName().equals(C75592q0.m90789s())) {
            arrayList2.add(1004);
        }
        SnsMethodCalculate.markEndTimeMs("initMenuItem", "com.tencent.mm.plugin.sns.ui.FlipView");
        ArrayList arrayList3 = new ArrayList();
        arrayList.addAll(arrayList2);
        if (i == 0) {
            SnsMethodCalculate.markStartTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.FlipView");
            ArrayList arrayList4 = new ArrayList();
            int i2 = DN.field_type;
            if (i2 == 15 || i2 == 5) {
                arrayList4.add(1002);
            } else if (i2 == 1) {
                arrayList4.add(1002);
                if (!C100417r0.m131416e(str2)) {
                    arrayList4.add(1012);
                }
                if (this.f276801r) {
                    arrayList4.add(1009);
                    GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
                    galleryTranslateReportStruct.f265619e = 2;
                    if (mo132152n()) {
                        galleryTranslateReportStruct.f265620f = 6;
                    } else {
                        galleryTranslateReportStruct.f265620f = 7;
                    }
                    C101804kv2 cntMedia = getCntMedia();
                    if (cntMedia != null) {
                        galleryTranslateReportStruct.mo126621t(cntMedia.f298692g);
                    }
                    galleryTranslateReportStruct.mo86054n();
                }
                if (this.f276802s) {
                    arrayList4.add(1011);
                }
            } else {
                arrayList4.add(1014);
            }
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236181b = str5;
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                arrayList4.add(1008);
            }
            SnsMethodCalculate.markEndTimeMs("initSecondMenu", "com.tencent.mm.plugin.sns.ui.FlipView");
            arrayList.addAll(arrayList4);
            if (!Util.isNullOrNil((List) this.f276808y)) {
                C92121j.m115792a(this.f276803t, getCurrentImageView(), this.f276808y);
            }
            arrayList3 = arrayList4;
        }
        if (DN.getTimeLine() != null && DN.getTimeLine().isExcerpt) {
            Context context = this.f276797n;
            if (context instanceof MMActivity) {
                C92118i.m115791a(this.f276803t, (MMActivity) context, DN.getTimeLine().snsExcerptUrl, DN.field_snsId);
            }
        }
        this.f276803t.mo126110m(arrayList2, arrayList3, new FlipView$$e(this));
        this.f276803t.mo126107j(new FlipView$$f(this));
        this.f276803t.mo126106i(new FlipView$$g(this, str5, str6));
        this.f276803t.mo126108k(new FlipView$$h(this, str5, str4, str6));
        this.f276803t.mo126109l();
        FlipView$$n flipView$$n = this.f276775C;
        if (flipView$$n != null) {
            flipView$$n.mo132170b(arrayList);
        }
        if (this.f276800q && z) {
            C86709a0.m107528h();
            if (C86709a0.m107529k().f251779b.mo123467m() != 0) {
                this.f276804u = str4;
                this.f276805v = str5;
                this.f276806w = str6;
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                long currentTimeMillis = System.currentTimeMillis();
                this.f276807x = currentTimeMillis;
                RecogQBarOfImageFileEvent.C40158a aVar = recogQBarOfImageFileEvent.f107731d;
                aVar.f107732a = currentTimeMillis;
                aVar.f107733b = str4;
                aVar.f107737f = 2;
                aVar.f107736e = true;
                recogQBarOfImageFileEvent.publish();
                this.f276780H = Long.valueOf(System.currentTimeMillis());
            }
        }
        if (i == 0) {
            SnsMethodCalculate.markStartTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            C77407n bottomSheet = getBottomSheet();
            if (bottomSheet == null) {
                Log.m105928w("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, bottomSheet is null");
                SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
            } else {
                C92094a.C92097e currentMaterialInfo = getCurrentMaterialInfo();
                if (currentMaterialInfo == null) {
                    Log.m105928w("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
                    SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
                } else {
                    int hashCode = bottomSheet.hashCode() + currentMaterialInfo.hashCode();
                    Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + currentMaterialInfo + ", token: " + hashCode);
                    SnsMethodCalculate.markStartTimeMs("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
                    WeakHashMap<FlipView, HashSet<Integer>> weakHashMap = C92116g.f263698a;
                    boolean contains = (weakHashMap == null || (hashSet = weakHashMap.get(this)) == null) ? false : hashSet.contains(Integer.valueOf(hashCode));
                    SnsMethodCalculate.markEndTimeMs("isTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
                    if (contains) {
                        Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "tryEnableOpenMaterialsForCurrentMaterial, duplicate");
                        SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
                    } else {
                        SnsMethodCalculate.markStartTimeMs("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
                        Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "markTokenInProgress, token: " + hashCode);
                        WeakHashMap<FlipView, HashSet<Integer>> weakHashMap2 = C92116g.f263698a;
                        if (weakHashMap2 == null) {
                            weakHashMap2 = new WeakHashMap<>();
                            C92116g.f263698a = weakHashMap2;
                        }
                        HashSet<Integer> hashSet2 = weakHashMap2.get(this);
                        if (hashSet2 == null) {
                            hashSet2 = new HashSet<>();
                            weakHashMap2.put(this, hashSet2);
                        }
                        hashSet2.add(Integer.valueOf(hashCode));
                        SnsMethodCalculate.markEndTimeMs("markTokenInProgress", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
                        ((C53884f2) C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((View) this), (C66212f) null, (C53934p0) null, new C92102e(this, currentMaterialInfo, bottomSheet, (C15601d<? super C92102e>) null), 3, (Object) null)).mo74515E(new C92115f(this, hashCode));
                        SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials");
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("showAlertSave", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    /* renamed from: r */
    public boolean mo132157r(String str) {
        SnsMethodCalculate.markStartTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
        Log.m105925i("MicroMsg.FlipView", "startDownloadVideo, mediaPath: %s", str);
        MMViewPager gallery = getGallery();
        if (gallery == null) {
            Log.m105928w("MicroMsg.FlipView", "startDownloadVideo, viewPager is null");
            SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
            return false;
        }
        View selectedView = gallery.getSelectedView();
        if (!(selectedView instanceof OnlineVideoView)) {
            Log.m105928w("MicroMsg.FlipView", "startDownloadVideo, curView not OnlineVideoView");
            SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
            return false;
        }
        boolean T = ((OnlineVideoView) selectedView).mo132328T(str);
        SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.FlipView");
        return T;
    }

    public void setNeedOCRImg(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setNeedOCRImg", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276802s = z;
        SnsMethodCalculate.markEndTimeMs("setNeedOCRImg", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setNeedScanImage(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setNeedScanImage", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276800q = z;
        SnsMethodCalculate.markEndTimeMs("setNeedScanImage", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setNeedTranslationImg(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setNeedTranslationImg", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276801r = z;
        SnsMethodCalculate.markEndTimeMs("setNeedTranslationImg", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        SnsMethodCalculate.markStartTimeMs("setOnLongClickListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276776D = onLongClickListener;
        SnsMethodCalculate.markEndTimeMs("setOnLongClickListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setOnMenuShowListener(FlipView$$n flipView$$n) {
        SnsMethodCalculate.markStartTimeMs("setOnMenuShowListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276775C = flipView$$n;
        SnsMethodCalculate.markEndTimeMs("setOnMenuShowListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public void setOnMultiCodeListener(FlipView$$o flipView$$o) {
        SnsMethodCalculate.markStartTimeMs("setOnMultiCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f276777E = flipView$$o;
        SnsMethodCalculate.markEndTimeMs("setOnMultiCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
    }

    public FlipView(Context context) {
        super(context);
        C40008f fVar = C40008f.f107254d;
        this.f276782J = new IListener<RecogQBarOfImageFileResultEvent>(fVar) {
            {
                this.__eventId = 812146647;
            }

            public boolean callback(IEvent iEvent) {
                ArrayList<ImageQBarDataBean> arrayList;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                FlipView flipView = FlipView.this;
                int i = FlipView.f276772S;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                boolean z = flipView.f276800q;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z) {
                    Log.m105924i("MicroMsg.FlipView", "no need to scan image");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                } else if (FlipView.m121476d(FlipView.this) == null || FlipView.m121475c(FlipView.this) == null) {
                    Log.m105920e("MicroMsg.FlipView", "not in recoging");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                } else if (recogQBarOfImageFileResultEvent == null) {
                    Log.m105920e("MicroMsg.FlipView", "receive invalid callbak");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                } else if (!recogQBarOfImageFileResultEvent.f265015d.f265016a.equals(FlipView.m121475c(FlipView.this))) {
                    Log.m105920e("MicroMsg.FlipView", "not same filepath");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                } else {
                    FlipView.this.f276778F = Long.valueOf(System.currentTimeMillis());
                    FlipView flipView2 = FlipView.this;
                    long currentTimeMillis = System.currentTimeMillis();
                    FlipView flipView3 = FlipView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.FlipView");
                    Long l = flipView3.f276780H;
                    SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView2.f276779G = Long.valueOf(currentTimeMillis - l.longValue());
                    FlipView.this.f276808y = C96874n1.f283849a.mo135192a(recogQBarOfImageFileResultEvent);
                    Log.m105924i("MicroMsg.FlipView", "recog result: " + FlipView.this.f276808y.size());
                    FlipView flipView4 = FlipView.this;
                    FlipView.m121473a(flipView4, FlipView.m121475c(flipView4), FlipView.this.f276808y);
                    if (!Util.isNullOrNil((List) FlipView.this.f276808y)) {
                        if (FlipView.m121476d(FlipView.this) != null) {
                            C92126r d = FlipView.m121476d(FlipView.this);
                            View currentImageView = FlipView.this.getCurrentImageView();
                            FlipView flipView5 = FlipView.this;
                            ArrayList<ImageQBarDataBean> arrayList2 = flipView5.f276808y;
                            SnsInfo b = FlipView.m121474b(flipView5);
                            SnsMethodCalculate.markStartTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            C87412m.m108594g(d, "<this>");
                            C87412m.m108594g(arrayList2, "imageQBarDataList");
                            ImageQBarDataBean b2 = C92121j.m115793b(d, currentImageView, arrayList2);
                            if (b2 != null) {
                                String str = b2.f273113d;
                                C46897s.C46898a aVar = new C46897s.C46898a(str);
                                if (b != null) {
                                    String userName = b.getUserName();
                                    arrayList = arrayList2;
                                    String valueOf = String.valueOf(b.field_snsId);
                                    C46897s.C46898a aVar2 = new C46897s.C46898a(str);
                                    aVar2.f126106b = 3;
                                    aVar2.f126107c = userName;
                                    aVar2.f126108d = valueOf;
                                    aVar = aVar2;
                                } else {
                                    arrayList = arrayList2;
                                }
                                ((ScanCodeSheetItemLogic) d.mo126102e()).mo67080k(b2.f273114e, aVar, new C92123k(d, currentImageView, arrayList));
                                SnsMethodCalculate.markEndTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            } else {
                                ArrayList<ImageQBarDataBean> arrayList3 = arrayList2;
                                int size = arrayList3.size();
                                if (size == 1) {
                                    ImageQBarDataBean imageQBarDataBean = arrayList3.get(0);
                                    C87412m.m108593f(imageQBarDataBean, "imageQBarDataList[0]");
                                    ImageQBarDataBean imageQBarDataBean2 = imageQBarDataBean;
                                    C46900z e = d.mo126102e();
                                    String str2 = imageQBarDataBean2.f273113d;
                                    C46897s.C46898a aVar3 = new C46897s.C46898a(str2);
                                    if (b != null) {
                                        String userName2 = b.getUserName();
                                        String valueOf2 = String.valueOf(b.field_snsId);
                                        C46897s.C46898a aVar4 = new C46897s.C46898a(str2);
                                        aVar4.f126106b = 3;
                                        aVar4.f126107c = userName2;
                                        aVar4.f126108d = valueOf2;
                                        aVar3 = aVar4;
                                    }
                                    ((ScanCodeSheetItemLogic) e).mo67080k(imageQBarDataBean2.f273114e, aVar3, new C92124l(d, currentImageView, arrayList3));
                                } else if (size > 1 && d.mo126101d().mo107563h()) {
                                    SnsMethodCalculate.markStartTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                                    d.f263723e = true;
                                    SnsMethodCalculate.markEndTimeMs("setShowQbar", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
                                    C92121j.m115792a(d, currentImageView, arrayList3);
                                    d.mo126109l();
                                }
                                SnsMethodCalculate.markEndTimeMs("fetchCodeInfo", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
                            }
                        }
                        FlipView flipView6 = FlipView.this;
                        String c = FlipView.m121475c(flipView6);
                        FlipView flipView7 = FlipView.this;
                        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.FlipView");
                        String str3 = flipView7.f276805v;
                        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.FlipView");
                        FlipView flipView8 = FlipView.this;
                        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.FlipView");
                        String str4 = flipView8.f276806w;
                        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.FlipView");
                        flipView6.mo132156q(c, str3, str4, false);
                    }
                    FlipView flipView9 = FlipView.this;
                    SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView9.f276804u = null;
                    SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$9");
                return false;
            }
        };
        this.f276783K = new IListener<RecogQBarOfImageFileFailedEvent>(fVar) {
            {
                this.__eventId = 1700407223;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                RecogQBarOfImageFileFailedEvent recogQBarOfImageFileFailedEvent = (RecogQBarOfImageFileFailedEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                FlipView flipView = FlipView.this;
                int i = FlipView.f276772S;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                boolean z = flipView.f276800q;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z) {
                    Log.m105924i("MicroMsg.FlipView", "no need to scan image");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                } else if (FlipView.m121476d(FlipView.this) == null || FlipView.m121475c(FlipView.this) == null) {
                    Log.m105920e("MicroMsg.FlipView", "not in recoging");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                } else if (!recogQBarOfImageFileFailedEvent.f107738d.f107739a.equals(FlipView.m121475c(FlipView.this))) {
                    Log.m105920e("MicroMsg.FlipView", "not same filepath");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                } else {
                    FlipView flipView2 = FlipView.this;
                    FlipView.m121473a(flipView2, FlipView.m121475c(flipView2), (List) null);
                    FlipView flipView3 = FlipView.this;
                    SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
                    flipView3.f276804u = null;
                    SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.FlipView");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$10");
                return false;
            }
        };
        this.f276784L = new IListener<NotifyDealQBarStrResultEvent>(fVar) {
            {
                this.__eventId = 1280295539;
            }

            public boolean callback(IEvent iEvent) {
                ImageQBarDataBean imageQBarDataBean;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                NotifyDealQBarStrResultEvent notifyDealQBarStrResultEvent = (NotifyDealQBarStrResultEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                FlipView flipView = FlipView.this;
                int i = FlipView.f276772S;
                SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                boolean z = flipView.f276800q;
                SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (!z) {
                    Log.m105924i("MicroMsg.FlipView", "no need to scan image");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                } else if (notifyDealQBarStrResultEvent != null) {
                    Log.m105925i("MicroMsg.FlipView", "notify Event: %d", Integer.valueOf(notifyDealQBarStrResultEvent.f264935d.f264938c));
                    Activity activity = notifyDealQBarStrResultEvent.f264935d.f264937b;
                    FlipView flipView2 = FlipView.this;
                    SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.FlipView");
                    Context context = flipView2.f276797n;
                    SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.FlipView");
                    if (activity != ((Activity) context) || (imageQBarDataBean = FlipView.this.f276809z) == null || !notifyDealQBarStrResultEvent.f264935d.f264936a.equals(imageQBarDataBean.f273113d)) {
                        Log.m105920e("MicroMsg.FlipView", "not the same");
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                    } else {
                        if (notifyDealQBarStrResultEvent.f264935d.f264938c == 3) {
                            FlipView flipView3 = FlipView.this;
                            SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.FlipView");
                            Context context2 = flipView3.f276797n;
                            SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.FlipView");
                            ((Activity) context2).finish();
                        }
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                    }
                } else {
                    Log.m105920e("MicroMsg.FlipView", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$11");
                return false;
            }
        };
        this.f276785M = null;
        this.f276786N = null;
        this.f276787P = null;
        this.f276788Q = null;
        this.f276789R = null;
        mo132151m(context);
    }
}
