package com.tencent.p014mm.plugin.sns.p106ui;

import ad0.C91998s;
import ad0.C91999u;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import c30.C104289g;
import c30.C79923f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.SightSendResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SecondCutShareSnsStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsBeforePostImageInfoStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsVideoPublishLogStruct;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.QImageView;
import com.tencent.p014mm.plugin.mmsight.SightCaptureResult;
import com.tencent.p014mm.plugin.mmsight.SightParams;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.jumper.VideoCaptureReportInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.decode.p1077ui.SightPlayImageView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94942r1;
import com.tencent.p014mm.plugin.sns.model.C94945s2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C43043o;
import com.tencent.p014mm.plugin.sns.statistics.C57354l;
import com.tencent.p014mm.plugin.sns.statistics.C94992f;
import com.tencent.p014mm.plugin.sns.statistics.C95005x;
import com.tencent.p014mm.plugin.sns.statistics.C95006y;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96892t1;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.MD5;
import da0.C58247e;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f72.C97842b;
import fv2.C98047a;
import g34.C116918i;
import gy3.C87412m;
import h81.C32735h;
import hd0.C98398h0;
import hf3.C98449c;
import hi2.C46075u;
import hi2.C98453h;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k21.C60960c;
import kg3.C76577a;
import kr2.C76634a;
import nj3.C76879j;
import os2.C100417r0;
import ot2.C100426a;
import ot2.C100433b;
import p159gw.C8462g;
import p166hy.C98567o0;
import p232rw.C77572l;
import p232rw.C77574q;
import p232rw.C77575r;
import p914oj.C89231c;
import pt2.C62497i;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C101783gu2;
import te3.C101802kr2;
import te3.e94;
import te3.f94;
import vr2.C102236a0;
import xb0.C102609h;
import yn2.C102882s0;
import zg2.C103020m;
import zg2.C53784a;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.ui.NewSightWidget */
public class NewSightWidget extends C96157q implements C98047a.C98048a, C95712a1 {

    /* renamed from: A */
    public int f277011A;

    /* renamed from: B */
    public int f277012B;

    /* renamed from: C */
    public Pair<Integer, Integer> f277013C;

    /* renamed from: D */
    public Bitmap f277014D;

    /* renamed from: E */
    public boolean f277015E;

    /* renamed from: F */
    public boolean f277016F;

    /* renamed from: G */
    public C98047a f277017G;

    /* renamed from: H */
    public C89779i0 f277018H;

    /* renamed from: I */
    public int f277019I;

    /* renamed from: J */
    public String f277020J;

    /* renamed from: K */
    public C104289g f277021K;

    /* renamed from: L */
    public boolean f277022L;

    /* renamed from: M */
    public boolean f277023M;

    /* renamed from: N */
    public boolean f277024N;

    /* renamed from: O */
    public String f277025O;

    /* renamed from: P */
    public SightWidgetBackgroundVideoHandler f277026P;

    /* renamed from: Q */
    public C100433b f277027Q;

    /* renamed from: R */
    public View f277028R;

    /* renamed from: S */
    public TextView f277029S;

    /* renamed from: T */
    public C62497i.C62498a f277030T;

    /* renamed from: U */
    public IListener f277031U;

    /* renamed from: V */
    public C94945s2 f277032V;

    /* renamed from: W */
    public String f277033W;

    /* renamed from: X */
    public ProgressDialog f277034X;

    /* renamed from: Y */
    public int f277035Y;

    /* renamed from: Z */
    public int f277036Z;

    /* renamed from: a0 */
    public C116918i f277037a0;

    /* renamed from: b0 */
    public String f277038b0;

    /* renamed from: c */
    public MMActivity f277039c;

    /* renamed from: c0 */
    public List<String> f277040c0;

    /* renamed from: d */
    public View f277041d = null;

    /* renamed from: d0 */
    public C101802kr2 f277042d0;

    /* renamed from: e */
    public SightPlayImageView f277043e;

    /* renamed from: e0 */
    public LinkedList<Long> f277044e0;

    /* renamed from: f */
    public ImageView f277045f = null;

    /* renamed from: f0 */
    public int f277046f0;

    /* renamed from: g */
    public String f277047g = "";

    /* renamed from: g0 */
    public boolean f277048g0;

    /* renamed from: h */
    public String f277049h = "";

    /* renamed from: h0 */
    public List<String> f277050h0;

    /* renamed from: i */
    public String f277051i = "";

    /* renamed from: i0 */
    public PInt f277052i0;

    /* renamed from: j */
    public boolean f277053j = false;

    /* renamed from: j0 */
    public String f277054j0;

    /* renamed from: k */
    public int f277055k;

    /* renamed from: k0 */
    public int f277056k0;

    /* renamed from: l */
    public C91998s f277057l = null;

    /* renamed from: l0 */
    public int f277058l0;

    /* renamed from: m */
    public C101783gu2 f277059m = new C101783gu2();

    /* renamed from: m0 */
    public Runnable f277060m0;

    /* renamed from: n */
    public String f277061n;

    /* renamed from: n0 */
    public Runnable f277062n0;

    /* renamed from: o */
    public String f277063o;

    /* renamed from: p */
    public String f277064p;

    /* renamed from: q */
    public String f277065q;

    /* renamed from: r */
    public boolean f277066r = false;

    /* renamed from: s */
    public boolean f277067s = false;

    /* renamed from: t */
    public WXMediaMessage f277068t = null;

    /* renamed from: u */
    public String f277069u;

    /* renamed from: v */
    public String f277070v;

    /* renamed from: w */
    public boolean f277071w = false;

    /* renamed from: x */
    public boolean f277072x = false;

    /* renamed from: y */
    public int f277073y = 0;

    /* renamed from: z */
    public int f277074z;

    public NewSightWidget(MMActivity mMActivity) {
        new C89231c();
        this.f277074z = 0;
        this.f277011A = 0;
        this.f277012B = 90;
        this.f277013C = null;
        this.f277014D = null;
        this.f277015E = false;
        this.f277016F = false;
        this.f277019I = 1;
        this.f277020J = "";
        this.f277022L = true;
        this.f277023M = false;
        this.f277024N = false;
        this.f277025O = "";
        this.f277026P = null;
        this.f277027Q = null;
        this.f277028R = null;
        this.f277029S = null;
        this.f277030T = null;
        this.f277031U = new IListener<SightSendResultEvent>(C40008f.f107254d) {
            {
                this.__eventId = 2027183784;
            }

            public boolean callback(IEvent iEvent) {
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSightWidget$1");
                SightSendResultEvent sightSendResultEvent = (SightSendResultEvent) iEvent;
                SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSightWidget$1");
                Log.m105925i("MicroMsg.SightWidget", "on sight send result callback, type %d", Integer.valueOf(sightSendResultEvent.f265103d.f265105a));
                if (sightSendResultEvent.f265103d.f265105a == 1) {
                    Log.m105924i("MicroMsg.SightWidget", "come event done");
                    NewSightWidget newSightWidget = NewSightWidget.this;
                    sightSendResultEvent.f265103d.getClass();
                    SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    newSightWidget.f277049h = null;
                    SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    NewSightWidget newSightWidget2 = NewSightWidget.this;
                    sightSendResultEvent.f265103d.getClass();
                    SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    newSightWidget2.f277051i = null;
                    SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    NewSightWidget newSightWidget3 = NewSightWidget.this;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    ProgressDialog progressDialog = newSightWidget3.f277034X;
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    if (progressDialog != null) {
                        NewSightWidget newSightWidget4 = NewSightWidget.this;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                        ProgressDialog progressDialog2 = newSightWidget4.f277034X;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                        progressDialog2.dismiss();
                    }
                    if (sightSendResultEvent.f265103d.f265106b) {
                        NewSightWidget newSightWidget5 = NewSightWidget.this;
                        if (newSightWidget5.f277032V != null) {
                            NewSightWidget.m121575l(newSightWidget5);
                        }
                    }
                    sightSendResultEvent.f265103d.getClass();
                    sightSendResultEvent.f265103d.getClass();
                    NewSightWidget newSightWidget6 = NewSightWidget.this;
                    SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    String str = newSightWidget6.f277051i;
                    SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
                    Log.m105925i("MicroMsg.SightWidget", "mux finish %B videoPath %s %d md5 %s", Boolean.valueOf(sightSendResultEvent.f265103d.f265106b), null, Long.valueOf(C86013q1.m106451l((String) null)), str);
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSightWidget$1");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.NewSightWidget$1");
                return false;
            }
        };
        this.f277032V = null;
        this.f277033W = "";
        this.f277034X = null;
        this.f277060m0 = new NewSightWidget$$l(this);
        this.f277062n0 = new NewSightWidget$$m(this);
        this.f277039c = mMActivity;
        this.f277017G = new C98047a(mMActivity, this);
    }

    /* renamed from: k */
    public static /* synthetic */ boolean m121574k(NewSightWidget newSightWidget, boolean z) {
        SnsMethodCalculate.markStartTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        newSightWidget.f277053j = z;
        SnsMethodCalculate.markEndTimeMs("access$1702", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return z;
    }

    /* renamed from: l */
    public static void m121575l(NewSightWidget newSightWidget) {
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        newSightWidget.getClass();
        SnsMethodCalculate.markStartTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        C94945s2 s2Var = newSightWidget.f277032V;
        if (s2Var == null) {
            SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        } else {
            int i = s2Var.mo131252i();
            C102882s0.f303681a.mo142600l(C100417r0.m131421j("sns_table_", (long) i), newSightWidget.f277042d0, newSightWidget.f277039c.getIntent(), newSightWidget.f277066r && newSightWidget.f277061n.equals("wxa5e0de08d96cc09d"));
            if (newSightWidget.f277066r && newSightWidget.f277061n.equals("wxa5e0de08d96cc09d")) {
                SnsReportHelper.f275506m0.f275528V = i;
            }
            ProgressDialog progressDialog = newSightWidget.f277034X;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            Log.m105924i("MicroMsg.SightWidget", "commitDone");
            SightSendResultEvent sightSendResultEvent = new SightSendResultEvent();
            SightSendResultEvent.C92563a aVar = sightSendResultEvent.f265103d;
            aVar.f265105a = 0;
            aVar.f265106b = true;
            sightSendResultEvent.publish();
            newSightWidget.f277053j = true;
            C91998s sVar = newSightWidget.f277057l;
            if (sVar != null) {
                sVar.mo125840a(i);
                C95006y.f275639b.mo131398c(newSightWidget.f277057l);
            }
            C94866e1.Kx0().mo133238a();
            if (newSightWidget.f277039c.getIntent() != null && newSightWidget.f277039c.getIntent().getBooleanExtra("K_go_to_SnsTimeLineUI", false)) {
                C98567o0.C76249a aVar2 = new C98567o0.C76249a();
                aVar2.f223351g = false;
                aVar2.f223345a = true;
                ((C98567o0) C86312j.m106911c(C98567o0.class)).yb0(newSightWidget.f277039c, (Intent) null, 7, aVar2);
            }
            newSightWidget.f277039c.setResult(-1, new Intent());
            newSightWidget.f277039c.finish();
            C94866e1.gy0().mo131192c();
            SnsMethodCalculate.markEndTimeMs("commitDone", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        }
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: m */
    public static /* synthetic */ MMActivity m121576m(NewSightWidget newSightWidget) {
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        MMActivity mMActivity = newSightWidget.f277039c;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return mMActivity;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* renamed from: a */
    public View mo132124a() {
        String str;
        SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        View inflate = View.inflate(this.f277039c, C0966R.C0971layout.cb5, (ViewGroup) null);
        this.f277041d = inflate;
        this.f277043e = (SightPlayImageView) inflate.findViewById(C0966R.C0970id.kk6);
        this.f277045f = (ImageView) this.f277041d.findViewById(C0966R.C0970id.k17);
        this.f277028R = this.f277041d.findViewById(C0966R.C0970id.n4r);
        this.f277029S = (TextView) this.f277041d.findViewById(C0966R.C0970id.myo);
        this.f277039c.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        this.f277011A = C76577a.m92151b(this.f277039c, 100);
        this.f277074z = C76577a.m92151b(this.f277039c, 100);
        SnsMethodCalculate.markStartTimeMs("loadThumbBitmap", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        ? r8 = 0;
        if (!TextUtils.isEmpty(this.f277047g) && C86013q1.m106450k(this.f277047g)) {
            Log.m105925i("MicroMsg.SightWidget", "getBitmapNative thumbPath:%s", this.f277047g);
            this.f277014D = BitmapUtil.getBitmapNative(this.f277047g);
            mo132261u("isPreviewExit", 1);
        }
        if (this.f277014D == null) {
            mo132261u("isPreviewExit", 0);
            Log.m105925i("MicroMsg.SightWidget", "getVideoThumb videoPath:%s", this.f277049h);
            this.f277014D = C97842b.m126300q(this.f277049h);
        }
        Bitmap bitmap = this.f277014D;
        if (bitmap != null) {
            this.f277011A = bitmap.getHeight();
            int width = this.f277014D.getWidth();
            this.f277074z = width;
            Bitmap bitmap2 = this.f277014D;
            int i = this.f277011A;
            SnsMethodCalculate.markStartTimeMs("isBitmapBlack", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            int i2 = width / 4;
            int i3 = i / 4;
            int i4 = i / 3;
            str = "initView";
            int i5 = width / 3;
            boolean z = bitmap2.getPixel(i2, i3) == -16777216 && bitmap2.getPixel(i2, i4) == -16777216 && bitmap2.getPixel(i5, i4) == -16777216 && bitmap2.getPixel(i5, i3) == -16777216 && bitmap2.getPixel(width / 2, i / 2) == -16777216;
            SnsMethodCalculate.markEndTimeMs("isBitmapBlack", "com.tencent.mm.plugin.sns.bitmap.SnsBitmapUtil");
            mo132261u("isPreviewBlack", Integer.valueOf(z ? 1 : 0));
            r8 = 0;
            Log.m105925i("MicroMsg.SightWidget", "isPreviewBitmapBlack:%b", Boolean.valueOf(z));
            Log.m105925i("MicroMsg.SightWidget", "mSightHeight:%s", Integer.valueOf(this.f277011A));
            Log.m105925i("MicroMsg.SightWidget", "mSightWidth:%s", Integer.valueOf(this.f277074z));
        } else {
            str = "initView";
        }
        SnsMethodCalculate.markEndTimeMs("loadThumbBitmap", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        this.f277013C = C91999u.m115565k(this.f277074z, this.f277011A, this.f277039c, r8);
        Object[] objArr = new Object[5];
        objArr[r8] = Integer.valueOf(this.f277074z);
        objArr[1] = Integer.valueOf(this.f277011A);
        Pair<Integer, Integer> pair = this.f277013C;
        objArr[2] = pair.first;
        objArr[3] = pair.second;
        objArr[4] = Integer.valueOf(this.f277012B);
        Log.m105919d("MicroMsg.SightWidget", "rawWidth=%s rawHeight=%s fixWidth=%s fixHeight=%s rotation=%s", objArr);
        mo132263w();
        this.f277043e.setScaleType(QImageView.C97274a.CENTER_CROP);
        this.f277043e.f273547P = true;
        this.f277029S.setOnClickListener(new NewSightWidget$$b(this));
        this.f277043e.setOnClickListener(new NewSightWidget$$h(this));
        Log.m105924i("MicroMsg.SightWidget", "videoPath " + this.f277049h + " thumbPath " + this.f277047g + " " + C86013q1.m106451l(this.f277049h) + " " + C86013q1.m106451l(this.f277047g));
        if (C86013q1.m106450k(this.f277049h)) {
            Log.m105925i("MicroMsg.SightWidget", "videopath exist videopath %s md5 %s", this.f277049h, this.f277051i);
        }
        SnsMethodCalculate.markStartTimeMs("reportSecondCupJson", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        C104289g gVar = this.f277021K;
        if (gVar != null) {
            SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
            snsReportHelper.getClass();
            SnsMethodCalculate.markStartTimeMs("setSighWidgetJson", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int optInt = gVar.optInt("page");
            try {
                snsReportHelper.f275529W.f265823d = Long.parseLong(gVar.optString("from"));
            } catch (NumberFormatException unused) {
                Log.m105920e("MicroMsg.SnsReportHelper", "SecondCut set report shareType error");
            }
            SecondCutShareSnsStruct secondCutShareSnsStruct = snsReportHelper.f275529W;
            secondCutShareSnsStruct.f265827h = (long) optInt;
            secondCutShareSnsStruct.f265828i = (long) gVar.optInt("isPreviewExit");
            snsReportHelper.f275529W.f265829j = (long) gVar.optInt("isPreviewBlack");
            SnsMethodCalculate.markEndTimeMs("setSighWidgetJson", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            this.f277021K = null;
        }
        SnsMethodCalculate.markEndTimeMs("reportSecondCupJson", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        View view = this.f277041d;
        SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return view;
    }

    /* renamed from: b */
    public void mo132253b(boolean z) {
        Class cls = C98449c.class;
        SnsMethodCalculate.markStartTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        Log.m105925i("MicroMsg.SightWidget", "handleExitAndNeedSave >> isNeedSave: %b, backgroundRemuxWorkId: %s", Boolean.valueOf(z), this.f277025O);
        if (!this.f277025O.isEmpty()) {
            if (z) {
                ((C98449c) C86312j.m106911c(cls)).lp0(this.f277025O, 6);
            } else {
                ((C98449c) C86312j.m106911c(cls)).lp0(this.f277025O, 5);
            }
        }
        SnsMethodCalculate.markEndTimeMs("handleExitAndNeedSave", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: c */
    public boolean mo132125c() {
        SnsMethodCalculate.markStartTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        SnsMethodCalculate.markEndTimeMs("beforeCommit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x04bf A[Catch:{ f -> 0x04c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0375 A[SYNTHETIC, Splitter:B:65:0x0375] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0461  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo132126d(android.os.Bundle r25) {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "handlerOnCreate"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            ad0.s r0 = ad0.C91998s.m115551f(r0)
            r1.f277057l = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r4 = "KSightCdnUrl"
            java.lang.String r0 = r0.getStringExtra(r4)
            java.lang.String r4 = ""
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r1.f277069u = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KSightCdnThumbUrl"
            java.lang.String r0 = r0.getStringExtra(r5)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r1.f277070v = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "Ksnsupload_appid"
            java.lang.String r0 = r0.getStringExtra(r5)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r1.f277061n = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "Ksnsupload_appname"
            java.lang.String r0 = r0.getStringExtra(r5)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r1.f277063o = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KThrid_app"
            r6 = 0
            boolean r0 = r0.getBooleanExtra(r5, r6)
            r1.f277066r = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KSnsAction"
            boolean r0 = r0.getBooleanExtra(r5, r6)
            r1.f277067s = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "Kis_take_photo"
            boolean r0 = r0.getBooleanExtra(r5, r6)
            r1.f277071w = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KBlockAdd"
            boolean r0 = r0.getBooleanExtra(r5, r6)
            r1.f277015E = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "Ksnsupload_source"
            int r0 = r0.getIntExtra(r5, r6)
            r1.f277055k = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "reportSessionId"
            java.lang.String r0 = r0.getStringExtra(r5)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r1.f277064p = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KSessionID"
            java.lang.String r0 = r0.getStringExtra(r5)
            r1.f277065q = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r5 = "KSnsUploadFromSkipCompress"
            boolean r0 = r0.getBooleanExtra(r5, r6)
            r1.f277016F = r0
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7[r6] = r0
            java.lang.String r0 = r1.f277061n
            r8 = 1
            r7[r8] = r0
            java.lang.String r9 = "MicroMsg.SightWidget"
            java.lang.String r0 = "mIsFromSkipCompress:%s, appId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r0, r7)
            fv2.a r0 = r1.f277017G
            com.tencent.mm.ui.MMActivity r7 = r1.f277039c
            r0.getClass()
            java.lang.String r10 = "resetFakeData"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            java.lang.String r12 = "MicroMsg.SnsFakeVLogHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)
            android.content.Intent r13 = r7.getIntent()
            java.lang.String r14 = "key_extra_data"
            android.os.Bundle r13 = r13.getBundleExtra(r14)
            java.lang.String r15 = "KSightPath"
            java.lang.String r5 = "KSightThumbPath"
            if (r13 == 0) goto L_0x02d7
            java.lang.String r8 = "key_bg_generate_pb"
            boolean r16 = r13.containsKey(r8)
            if (r16 == 0) goto L_0x02d7
            java.lang.String r6 = "key_bg_generate_extra_config"
            boolean r17 = r13.containsKey(r6)
            if (r17 != 0) goto L_0x0124
            goto L_0x02d7
        L_0x0124:
            r17 = r2
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r2 = r2.getStringExtra(r5)
            r18 = r3
            android.content.Intent r3 = r7.getIntent()
            java.lang.String r3 = r3.getStringExtra(r15)
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r2 == 0) goto L_0x0156
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)
            if (r2 == 0) goto L_0x0156
            java.lang.String r0 = "jump generate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            r2 = r4
            r20 = r9
            r23 = r14
            r21 = r15
            goto L_0x02e5
        L_0x0156:
            java.lang.String r2 = "SnsFakeVLogHelper go bg generate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            r2 = 0
            r0.f287472f = r2
            zg2.a r2 = zg2.C53784a.f150949a
            android.util.SparseArray<java.util.Set<zg2.d>> r2 = zg2.C53784a.f150950b
            r3 = 7
            java.lang.Object r12 = r2.get(r3)
            java.util.Set r12 = (java.util.Set) r12
            if (r12 != 0) goto L_0x0173
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r2.put(r3, r12)
        L_0x0173:
            r12.add(r0)
            byte[] r2 = r13.getByteArray(r8)
            byte[] r6 = r13.getByteArray(r6)
            te3.e70 r8 = new te3.e70     // Catch:{ IOException -> 0x01a1 }
            r8.<init>()     // Catch:{ IOException -> 0x01a1 }
            pe3.a r8 = r8.parseFrom(r2)     // Catch:{ IOException -> 0x01a1 }
            te3.e70 r8 = (te3.C101773e70) r8     // Catch:{ IOException -> 0x01a1 }
            r0.f287468b = r8     // Catch:{ IOException -> 0x01a1 }
            java.lang.String r8 = "key_bg_generate_mix_config"
            android.os.Parcelable r8 = r13.getParcelable(r8)     // Catch:{ IOException -> 0x01a1 }
            com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig r8 = (com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.MixConfig) r8     // Catch:{ IOException -> 0x01a1 }
            r0.f287469c = r8     // Catch:{ IOException -> 0x01a1 }
            te3.gb0 r8 = new te3.gb0     // Catch:{ IOException -> 0x01a1 }
            r8.<init>()     // Catch:{ IOException -> 0x01a1 }
            pe3.a r8 = r8.parseFrom(r6)     // Catch:{ IOException -> 0x01a1 }
            te3.gb0 r8 = (te3.C101781gb0) r8     // Catch:{ IOException -> 0x01a1 }
        L_0x01a1:
            android.content.Intent r7 = r7.getIntent()
            te3.e70 r8 = r0.f287468b
            java.lang.String r8 = r8.f298163i
            r7.putExtra(r5, r8)
            com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig r7 = r0.f287469c
            java.lang.String r8 = "initBackgroundVLogGenerate"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r11)
            zg2.m r12 = zg2.C103020m.f303985a
            java.lang.String r13 = "MicroMsg.mix_background.VideoEditStorageUtil"
            java.lang.String r0 = "baseItemData"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "mixConfig"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "extraConfig"
            gy3.C87412m.m108594g(r6, r0)
            r19 = r4
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02c6 }
            r20 = r9
            zg2.f r9 = new zg2.f     // Catch:{ Exception -> 0x02c2 }
            r9.<init>()     // Catch:{ Exception -> 0x02c2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c2 }
            r0.<init>()     // Catch:{ Exception -> 0x02c2 }
            int r21 = r9.hashCode()     // Catch:{ Exception -> 0x02c2 }
            r22 = 2147483647(0x7fffffff, float:NaN)
            r23 = r14
            r14 = r21 & r22
            r0.append(r14)     // Catch:{ Exception -> 0x02be }
            r14 = 35
            r0.append(r14)     // Catch:{ Exception -> 0x02be }
            r0.append(r3)     // Catch:{ Exception -> 0x02be }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02be }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)     // Catch:{ Exception -> 0x02be }
            r9.field_taskId = r0     // Catch:{ Exception -> 0x02be }
            r9.field_timeStamp = r3     // Catch:{ Exception -> 0x02be }
            r14 = 0
            r9.field_mixRetryTime = r14     // Catch:{ Exception -> 0x02be }
            te3.e70 r0 = new te3.e70     // Catch:{ Exception -> 0x02be }
            r0.<init>()     // Catch:{ Exception -> 0x02be }
            r0.parseFrom(r2)     // Catch:{ Exception -> 0x020b }
            r21 = r15
            r2 = r19
            goto L_0x021e
        L_0x020b:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "safeParser"
            r21 = r15
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x02ba }
            r14 = 0
            r15[r14] = r2     // Catch:{ Exception -> 0x02ba }
            r2 = r19
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r2, r15)     // Catch:{ Exception -> 0x022b }
            r0 = 0
        L_0x021e:
            if (r0 == 0) goto L_0x022e
            r0.f298174w = r3     // Catch:{ Exception -> 0x022b }
            zg2.m r3 = zg2.C103020m.f303985a     // Catch:{ Exception -> 0x022b }
            te3.wb4 r3 = r3.mo142737e(r0)     // Catch:{ Exception -> 0x022b }
            r0.f298149A = r3     // Catch:{ Exception -> 0x022b }
            goto L_0x022e
        L_0x022b:
            r0 = move-exception
            goto L_0x02ca
        L_0x022e:
            if (r0 == 0) goto L_0x0235
            byte[] r0 = r0.toByteArray()     // Catch:{ Exception -> 0x022b }
            goto L_0x0236
        L_0x0235:
            r0 = 0
        L_0x0236:
            r9.field_baseItemData = r0     // Catch:{ Exception -> 0x022b }
            r3 = 1
            r9.field_status = r3     // Catch:{ Exception -> 0x022b }
            r3 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            r9.field_expiredTime = r3     // Catch:{ Exception -> 0x022b }
            int r0 = r7.f272876d     // Catch:{ Exception -> 0x022b }
            r9.field_targetWidth = r0     // Catch:{ Exception -> 0x022b }
            int r0 = r7.f272877e     // Catch:{ Exception -> 0x022b }
            r9.field_targetHeight = r0     // Catch:{ Exception -> 0x022b }
            int r0 = r7.f272878f     // Catch:{ Exception -> 0x022b }
            r9.field_videoBitrate = r0     // Catch:{ Exception -> 0x022b }
            int r0 = r7.f272879g     // Catch:{ Exception -> 0x022b }
            r9.field_audioBitrate = r0     // Catch:{ Exception -> 0x022b }
            int r0 = r7.f272880h     // Catch:{ Exception -> 0x022b }
            r9.field_audioSampleRate = r0     // Catch:{ Exception -> 0x022b }
            int r0 = r7.f272881i     // Catch:{ Exception -> 0x022b }
            r9.field_audioChannelCount = r0     // Catch:{ Exception -> 0x022b }
            int r0 = r7.f272882j     // Catch:{ Exception -> 0x022b }
            r9.field_frameRate = r0     // Catch:{ Exception -> 0x022b }
            int r0 = r7.f272883n     // Catch:{ Exception -> 0x022b }
            r9.field_videoRotate = r0     // Catch:{ Exception -> 0x022b }
            r9.field_extraConfig = r6     // Catch:{ Exception -> 0x022b }
            th2.d r0 = th2.C110992d.f332425a     // Catch:{ Exception -> 0x022b }
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r0 = r0.mo162676j()     // Catch:{ Exception -> 0x022b }
            r0.getClass()     // Catch:{ Exception -> 0x022b }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x022b }
            java.util.HashMap r0 = r0.f272939d     // Catch:{ Exception -> 0x022b }
            r3.<init>(r0)     // Catch:{ Exception -> 0x022b }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x022b }
            r9.field_reportInfo = r0     // Catch:{ Exception -> 0x022b }
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c     // Catch:{ Exception -> 0x022b }
            android.os.Bundle r0 = r0.f272892b     // Catch:{ Exception -> 0x022b }
            java.lang.String r0 = r12.mo142734b(r0)     // Catch:{ Exception -> 0x022b }
            r9.field_userData = r0     // Catch:{ Exception -> 0x022b }
            r9.field_blurBgPath = r2     // Catch:{ Exception -> 0x022b }
            r3 = 7
            r9.field_fromScene = r3     // Catch:{ Exception -> 0x022b }
            zg2.g r0 = zg2.C103020m.f303986b     // Catch:{ Exception -> 0x022b }
            boolean r0 = r0.insert(r9)     // Catch:{ Exception -> 0x022b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x022b }
            r3.<init>()     // Catch:{ Exception -> 0x022b }
            java.lang.String r4 = "insertRemuxTask:"
            r3.append(r4)     // Catch:{ Exception -> 0x022b }
            r3.append(r7)     // Catch:{ Exception -> 0x022b }
            java.lang.String r4 = ", ret:"
            r3.append(r4)     // Catch:{ Exception -> 0x022b }
            r3.append(r0)     // Catch:{ Exception -> 0x022b }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x022b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)     // Catch:{ Exception -> 0x022b }
            zg2.a r0 = zg2.C53784a.f150949a     // Catch:{ Exception -> 0x022b }
            java.lang.String r3 = r9.field_taskId     // Catch:{ Exception -> 0x022b }
            java.lang.String r4 = "videoEditorData.field_taskId"
            gy3.C87412m.m108593f(r3, r4)     // Catch:{ Exception -> 0x022b }
            r4 = 7
            r0.mo74352b(r4, r3)     // Catch:{ Exception -> 0x022b }
            goto L_0x02d0
        L_0x02ba:
            r0 = move-exception
        L_0x02bb:
            r2 = r19
            goto L_0x02ca
        L_0x02be:
            r0 = move-exception
        L_0x02bf:
            r21 = r15
            goto L_0x02bb
        L_0x02c2:
            r0 = move-exception
        L_0x02c3:
            r23 = r14
            goto L_0x02bf
        L_0x02c6:
            r0 = move-exception
            r20 = r9
            goto L_0x02c3
        L_0x02ca:
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r13, r0, r2, r4)
        L_0x02d0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            goto L_0x02e5
        L_0x02d7:
            r17 = r2
            r18 = r3
            r2 = r4
            r20 = r9
            r23 = r14
            r21 = r15
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
        L_0x02e5:
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "Ksnsupload_timeline"
            android.os.Bundle r0 = r0.getBundleExtra(r3)
            if (r0 == 0) goto L_0x02fc
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r3 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req
            r3.<init>(r0)
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r3.message
            r1.f277068t = r0
        L_0x02fc:
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r0 = r0.getStringExtra(r5)
            r1.f277047g = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            r3 = r21
            java.lang.String r0 = r0.getStringExtra(r3)
            r1.f277049h = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "KSightDeleted"
            r4 = 0
            boolean r0 = r0.getBooleanExtra(r3, r4)
            r1.f277072x = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "sight_md5"
            java.lang.String r0 = r0.getStringExtra(r3)
            r1.f277051i = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "Kis_from_sns_drafg_stg"
            boolean r0 = r0.getBooleanExtra(r3, r4)
            r1.f277024N = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            r3 = r23
            android.os.Bundle r0 = r0.getBundleExtra(r3)
            if (r0 == 0) goto L_0x0363
            java.lang.String r3 = "key_is_background_video"
            boolean r3 = r0.getBoolean(r3, r4)
            r1.f277023M = r3
            java.lang.String r3 = "key_background_remux_work_id"
            java.lang.String r0 = r0.getString(r3, r2)
            r1.f277025O = r0
            goto L_0x0367
        L_0x0363:
            r1.f277023M = r4
            r1.f277025O = r2
        L_0x0367:
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "KMMSightExtInfo"
            byte[] r0 = r0.getByteArrayExtra(r3)
            if (r0 == 0) goto L_0x038e
            te3.gu2 r3 = r1.f277059m     // Catch:{ Exception -> 0x037b }
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x037b }
            goto L_0x038e
        L_0x037b:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r0 = r0.getMessage()
            r3 = 0
            r4[r3] = r0
            java.lang.String r0 = "error %s"
            r3 = r20
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r4)
            goto L_0x0390
        L_0x038e:
            r3 = r20
        L_0x0390:
            te3.gu2 r0 = r1.f277059m
            if (r0 != 0) goto L_0x039f
            te3.gu2 r0 = new te3.gu2
            r0.<init>()
            r1.f277059m = r0
            boolean r4 = r1.f277071w
            r0.f298309e = r4
        L_0x039f:
            te3.gu2 r0 = r1.f277059m
            java.lang.String r4 = r1.f277064p
            r0.f298314j = r4
            boolean r4 = r1.f277016F
            r0.f298315n = r4
            java.lang.String r4 = r1.f277061n
            r0.f298316o = r4
            com.tencent.mm.autogen.events.SightSendResultEvent r0 = new com.tencent.mm.autogen.events.SightSendResultEvent
            r0.<init>()
            com.tencent.mm.autogen.events.SightSendResultEvent$a r4 = r0.f265103d
            r5 = 2
            r4.f265105a = r5
            r0.publish()
            java.lang.String r4 = r1.f277049h
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x03da
            com.tencent.mm.autogen.events.SightSendResultEvent$b r4 = r0.f265104e
            r4.getClass()
            r4 = 0
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r2)
            r1.f277049h = r5
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r4 = 0
            r6[r4] = r5
            java.lang.String r4 = "videoPath is null %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r6)
        L_0x03da:
            java.lang.String r4 = r1.f277051i
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x03ed
            com.tencent.mm.autogen.events.SightSendResultEvent$b r0 = r0.f265104e
            r0.getClass()
            r4 = 0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r2)
            goto L_0x03ef
        L_0x03ed:
            java.lang.String r0 = r1.f277051i
        L_0x03ef:
            r1.f277051i = r0
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = r1.f277047g
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = r1.f277049h
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r0
            java.lang.String r0 = "oncreate thumb path %s videopath %s md5 %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r0, r5)
            com.tencent.mm.sdk.event.IListener r0 = r1.f277031U
            r0.alive()
            int r0 = r1.f277073y
            if (r0 != 0) goto L_0x044b
            os2.j0 r0 = com.tencent.p014mm.plugin.sns.model.C94866e1.ay0()
            int r0 = r0.mo139868TO()
            if (r0 != 0) goto L_0x0422
            r5 = r17
            r6 = r18
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x0422:
            r5 = r17
            r6 = r18
            com.tencent.mm.ui.MMActivity r7 = r1.f277039c
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131167225(0x7f0707f9, float:1.7948718E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r7 = r7 * 4
            int r0 = r0 - r7
            com.tencent.mm.ui.MMActivity r7 = r1.f277039c
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165556(0x7f070174, float:1.7945332E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 2
            int r7 = r7 * 2
            int r0 = r0 - r7
            int r0 = r0 / r4
            r1.f277073y = r0
            goto L_0x044f
        L_0x044b:
            r5 = r17
            r6 = r18
        L_0x044f:
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r4 = "SendAppMessageWrapper_TokenValid"
            r7 = 1
            boolean r0 = r0.getBooleanExtra(r4, r7)
            if (r0 == 0) goto L_0x0461
            r1.f277019I = r7
            goto L_0x0464
        L_0x0461:
            r4 = 0
            r1.f277019I = r4
        L_0x0464:
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r4 = "SendAppMessageWrapper_PkgName"
            java.lang.String r0 = r0.getStringExtra(r4)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r2)
            r1.f277020J = r0
            com.tencent.mm.ui.MMActivity r0 = r1.f277039c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r2 = "KSnsUploadShowAppName"
            r4 = 1
            boolean r0 = r0.getBooleanExtra(r2, r4)
            r1.f277022L = r0
            java.lang.String r0 = "miaojianExtInfo"
            java.lang.String r2 = "handlerSecondCutShare"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r6)
            java.lang.String r4 = r1.f277061n
            java.lang.String r7 = "wxa5e0de08d96cc09d"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x04fb
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r4 = r1.f277068t
            if (r4 == 0) goto L_0x04fb
            java.lang.String r4 = r4.messageExt
            c30.g r7 = new c30.g     // Catch:{ f -> 0x04c2 }
            r7.<init>((java.lang.String) r4)     // Catch:{ f -> 0x04c2 }
            pt2.i r4 = pt2.C62497i.f177536a     // Catch:{ f -> 0x04c2 }
            boolean r8 = r4.mo87529a()     // Catch:{ f -> 0x04c2 }
            if (r8 != 0) goto L_0x04bb
            boolean r8 = r7.has(r0)     // Catch:{ f -> 0x04c2 }
            if (r8 == 0) goto L_0x04bb
            java.lang.String r0 = r7.getString(r0)     // Catch:{ f -> 0x04c2 }
            pt2.i$a r0 = r4.mo87531c(r0)     // Catch:{ f -> 0x04c2 }
            r1.f277030T = r0     // Catch:{ f -> 0x04c2 }
        L_0x04bb:
            boolean r0 = r1.f277066r     // Catch:{ f -> 0x04c2 }
            if (r0 == 0) goto L_0x04c7
            r1.f277021K = r7     // Catch:{ f -> 0x04c2 }
            goto L_0x04c7
        L_0x04c2:
            java.lang.String r0 = "get SecondCut JSON Error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x04c7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "SecondCut thumbPath: "
            r0.append(r4)
            java.lang.String r4 = r1.f277047g
            r0.append(r4)
            java.lang.String r4 = ">>cdnThumbPath:"
            r0.append(r4)
            java.lang.String r4 = r1.f277070v
            r0.append(r4)
            java.lang.String r4 = ">>videoPath:"
            r0.append(r4)
            java.lang.String r4 = r1.f277049h
            r0.append(r4)
            java.lang.String r4 = ">>cdnPath:"
            r0.append(r4)
            java.lang.String r4 = r1.f277069u
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x04fb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r6)
            java.lang.String r0 = "handleBackgroundVideo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r6)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r4 = r1.f277023M
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r7 = 0
            r2[r7] = r4
            java.lang.String r4 = r1.f277025O
            r7 = 1
            r2[r7] = r4
            java.lang.String r4 = "handleBackgroundVideo >> isBackground: %b, workId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            boolean r2 = r1.f277023M
            if (r2 == 0) goto L_0x05bb
            java.lang.String r2 = r1.f277025O
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x05bb
            com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler r2 = r1.f277026P
            if (r2 != 0) goto L_0x05bb
            com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler r2 = new com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler
            r2.<init>()
            r1.f277026P = r2
            com.tencent.mm.plugin.sns.statistics.x r2 = com.tencent.p014mm.plugin.sns.statistics.C95005x.f275632a
            r4 = 1
            r2.mo131409d(r4)
            com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler r2 = r1.f277026P
            com.tencent.mm.plugin.sns.ui.NewSightWidget$$c r4 = new com.tencent.mm.plugin.sns.ui.NewSightWidget$$c
            r4.<init>(r1)
            r2.getClass()
            java.lang.String r7 = "aliveRemuxEventListener"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = "MicroMsg.SightWidgetBackgroundVideoHandler"
            java.lang.String r10 = "alive event listener"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VideoBackgroundRemuxResultEventEvent> r10 = r2.f277480a
            r10.alive()
            r2.f277481b = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            boolean r2 = r1.f277024N
            if (r2 == 0) goto L_0x05bb
            java.lang.String r2 = r1.f277049h
            long r10 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            r12 = 0
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x057d
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = r1.f277049h
            r7 = 0
            r2[r7] = r4
            java.lang.String r4 = "isVideoFromDraftVideo and isBackground video >> output video is exist >> %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            r24.mo132258r()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
            goto L_0x05be
        L_0x057d:
            com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler r2 = r1.f277026P
            java.lang.String r3 = r1.f277025O
            com.tencent.mm.plugin.sns.ui.NewSightWidget$$d r4 = new com.tencent.mm.plugin.sns.ui.NewSightWidget$$d
            r4.<init>(r1)
            r2.getClass()
            java.lang.String r2 = "getRemuxVideoWork"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r8)
            java.lang.String r7 = "workTagId"
            gy3.C87412m.m108594g(r3, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = "getRemuxVideoWork >> workTagId: "
            r7.append(r10)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            java.lang.Class<hf3.c> r7 = hf3.C98449c.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            hf3.c r7 = (hf3.C98449c) r7
            com.tencent.mm.plugin.sns.ui.n2 r9 = new com.tencent.mm.plugin.sns.ui.n2
            r9.<init>(r4, r3)
            r7.mo136674PD(r3, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r8)
        L_0x05bb:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r6)
        L_0x05be:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget.mo132126d(android.os.Bundle):void");
    }

    /* renamed from: e */
    public boolean mo132127e(int i, int i2, C116918i iVar, String str, List<String> list, C101802kr2 kr22, LinkedList<Long> linkedList, int i3, boolean z, List<String> list2, PInt pInt, String str2, int i4, int i5) {
        String str3;
        String str4;
        String str5;
        boolean z2;
        WXMediaMessage wXMediaMessage;
        List<String> list3;
        int i6 = i;
        int i7 = i2;
        String str6 = str;
        List<String> list4 = list;
        C101802kr2 kr23 = kr22;
        int i8 = i3;
        boolean z3 = z;
        List<String> list5 = list2;
        PInt pInt2 = pInt;
        SnsMethodCalculate.markStartTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        C98047a aVar = this.f277017G;
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("existingFakeVideo", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        boolean z4 = !aVar.f287472f;
        SnsMethodCalculate.markEndTimeMs("existingFakeVideo", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        if (z4) {
            MMActivity mMActivity = this.f277039c;
            this.f277018H = C76879j.m92723Q(mMActivity, "", mMActivity.getString(C0966R.string.i3k), true, true, (DialogInterface.OnCancelListener) null);
            this.f277035Y = i6;
            this.f277036Z = i7;
            this.f277037a0 = iVar;
            this.f277038b0 = str6;
            this.f277040c0 = list4;
            this.f277044e0 = linkedList;
            this.f277046f0 = i8;
            this.f277048g0 = z3;
            this.f277050h0 = list5;
            this.f277052i0 = pInt2;
            this.f277054j0 = str2;
            this.f277056k0 = i4;
            this.f277058l0 = i5;
            SnsUploadUI snsUploadUI = (SnsUploadUI) this.f277039c;
            snsUploadUI.getClass();
            SnsMethodCalculate.markStartTimeMs("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            snsUploadUI.f278910G = false;
            SnsMethodCalculate.markEndTimeMs("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            return false;
        }
        this.f277042d0 = kr23;
        if (!C86013q1.m106450k(this.f277049h) && !this.f277023M) {
            MMHandlerThread.postToMainThread(new NewSightWidget$$i(this));
            SnsUploadUI snsUploadUI2 = (SnsUploadUI) this.f277039c;
            snsUploadUI2.getClass();
            SnsMethodCalculate.markStartTimeMs("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            snsUploadUI2.f278910G = false;
            SnsMethodCalculate.markEndTimeMs("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            return false;
        } else if (this.f277032V != null) {
            SnsUploadUI snsUploadUI3 = (SnsUploadUI) this.f277039c;
            snsUploadUI3.getClass();
            SnsMethodCalculate.markStartTimeMs("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            snsUploadUI3.f278910G = false;
            SnsMethodCalculate.markEndTimeMs("setHasCommited", "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            return false;
        } else if (this.f277053j) {
            SnsMethodCalculate.markEndTimeMs("commit", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            return true;
        } else {
            this.f277053j = true;
            this.f277033W = str6;
            LinkedList linkedList2 = new LinkedList();
            if (list4 != null) {
                new LinkedList();
                List<String> gt = ((C8462g) C86312j.m106911c(C8462g.class)).mo9266gt();
                for (String next : list) {
                    if (gt == null || gt.contains(next)) {
                        list3 = gt;
                    } else {
                        list3 = gt;
                        f94 f94 = new f94();
                        f94.f298255d = next;
                        linkedList2.add(f94);
                    }
                    gt = list3;
                }
            }
            C94945s2 s2Var = new C94945s2(15, this.f277039c);
            this.f277032V = s2Var;
            pInt2.value = s2Var.mo131253j();
            if (i8 > C76634a.f224255a) {
                this.f277032V.mo131261r(1, 3);
            }
            C94945s2 s2Var2 = this.f277032V;
            s2Var2.mo131260q(str6);
            s2Var2.mo131262s(new LinkedList());
            s2Var2.mo131265v(kr23);
            s2Var2.mo131243Q(linkedList2);
            s2Var2.mo131228B(i6);
            s2Var2.mo131239M(i7);
            s2Var2.mo131263t(list5);
            if (z3) {
                this.f277032V.mo131264u(1);
            } else {
                this.f277032V.mo131264u(0);
            }
            this.f277032V.mo131269z(this.f277019I, this.f277020J);
            this.f277032V.mo131263t(list5);
            this.f277032V.mo131234H(this.f277055k);
            mo133779j(this.f277032V);
            if (this.f277039c.getIntent().hasExtra("KSnsVideoTempalteInfo")) {
                e94 e94 = new e94();
                str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                byte[] byteArrayExtra = this.f277039c.getIntent().getByteArrayExtra("KSnsVideoTempalteInfo");
                if (byteArrayExtra != null && byteArrayExtra.length > 0) {
                    try {
                        e94.parseFrom(byteArrayExtra);
                        if (!TextUtils.isEmpty(e94.f182943e)) {
                            C94945s2 s2Var3 = this.f277032V;
                            s2Var3.getClass();
                            SnsMethodCalculate.markStartTimeMs("setVideoTemplateInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                            s2Var3.f275199f.videoTemplate = e94;
                            SnsMethodCalculate.markEndTimeMs("setVideoTemplateInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                            this.f277059m.f298317p = true;
                            C60960c.C60961a aVar2 = C60960c.f173618a;
                            aVar2.mo85926j("SnsPublishProcess", "egID", e94.f182943e);
                            String str7 = e94.f182944f;
                            if (str7 == null) {
                                str7 = "";
                            }
                            aVar2.mo85926j("SnsPublishProcess", "musicID", str7);
                            Log.m105924i("MicroMsg.SightWidget", "set video template info: " + e94.f182943e);
                        } else {
                            Log.m105920e("MicroMsg.SightWidget", "get template info error");
                        }
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.SightWidget", e, "parse error", new Object[0]);
                    }
                }
            } else {
                str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
            }
            C94945s2 s2Var4 = this.f277032V;
            C101783gu2 gu22 = this.f277059m;
            s2Var4.getClass();
            SnsMethodCalculate.markStartTimeMs("setSightExtInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            s2Var4.f275204k = gu22;
            SnsMethodCalculate.markEndTimeMs("setSightExtInfo", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
            this.f277032V.mo131235I((String) null, (String) null, (String) null, i4, i5);
            this.f277032V.mo131232F(this.f277064p);
            if (!Util.isNullOrNil(this.f277061n) && this.f277022L) {
                this.f277032V.mo131231E(this.f277061n);
            }
            if (!Util.isNullOrNil(this.f277063o) && this.f277022L) {
                this.f277032V.mo131230D(Util.nullAs(this.f277063o, ""));
            }
            if (this.f277066r) {
                this.f277032V.mo131234H(5);
            }
            if (this.f277067s && (wXMediaMessage = this.f277068t) != null) {
                this.f277032V.mo131238L(wXMediaMessage.mediaTagName);
                C94945s2 s2Var5 = this.f277032V;
                String str8 = this.f277061n;
                WXMediaMessage wXMediaMessage2 = this.f277068t;
                s2Var5.mo131240N(str8, wXMediaMessage2.messageExt, wXMediaMessage2.messageAction);
            }
            boolean z5 = this.f277039c.getIntent().getIntExtra("KSnsFrom", 0) == 17;
            boolean z6 = this.f277039c.getIntent().getIntExtra("KSnsFrom", 0) == 14;
            C57354l.C57355a aVar3 = C57354l.f164333a;
            int i9 = z5 ? 1 : z6 ? 2 : 3;
            String str9 = this.f277049h;
            SnsMethodCalculate.markStartTimeMs("setMediaSourceSight", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            C87412m.m108594g(str9, "videoPath");
            C60960c.C60961a aVar4 = C60960c.f173618a;
            String str10 = "videoPath";
            aVar4.mo85926j("SnsPublishProcess", "mediaSource_", String.valueOf(i9));
            aVar4.mo85935t("SnsPublishProcess", "mediaMD5_", new C43043o(str9));
            aVar4.mo85926j("SnsPublishProcess", "firstEditPageMedia", 1);
            aVar4.mo85926j("SnsPublishProcess", "endSessionMedia", 1);
            SnsMethodCalculate.markEndTimeMs("setMediaSourceSight", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            if (!this.f277023M || this.f277025O.isEmpty()) {
                str4 = "commit";
                str5 = str3;
                z2 = true;
                MMHandlerThread.postToMainThreadDelayed(this.f277062n0, 700);
                ThreadPool.post(new NewSightWidget$$k(this), "sight_send_ready");
            } else {
                Object[] objArr = new Object[1];
                objArr[0] = Boolean.valueOf(this.f277027Q == null);
                Log.m105925i("MicroMsg.SightWidget", "commit fake video >> fakeUploader is null: %b", objArr);
                SnsInfo k = this.f277032V.mo131254k();
                C100433b bVar = new C100433b();
                this.f277027Q = bVar;
                C101783gu2 gu23 = this.f277059m;
                SnsMethodCalculate.markStartTimeMs("setExtInfo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
                C87412m.m108594g(gu23, "extInfo");
                bVar.f294222a = gu23;
                SnsMethodCalculate.markEndTimeMs("setExtInfo", "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader");
                C100433b bVar2 = this.f277027Q;
                String str11 = this.f277025O;
                String str12 = this.f277049h;
                String str13 = this.f277047g;
                String str14 = str12;
                SnsInfo snsInfo = k;
                C100433b bVar3 = bVar2;
                z2 = true;
                str5 = str3;
                String str15 = "com.tencent.mm.plugin.sns.ui.fake.BackgroundVideoFakeUploader";
                str4 = "commit";
                NewSightWidget$$j newSightWidget$$j = new NewSightWidget$$j(this, i, i2, iVar, str, list, kr22, linkedList, i3, z, list2, pInt, str2, i4, i5);
                bVar3.getClass();
                SnsMethodCalculate.markStartTimeMs("commitFakeVideo", str15);
                String str16 = str11;
                C87412m.m108594g(str16, "workTagId");
                SnsInfo snsInfo2 = snsInfo;
                C87412m.m108594g(snsInfo2, "snsInfo");
                String str17 = str14;
                C87412m.m108594g(str17, str10);
                String str18 = str13;
                C87412m.m108594g(str18, "thumbPath");
                C87412m.m108594g(str, "desc");
                Log.m105924i("MicroMsg.BackgroundVideoFakeUploader", "commitFakeVideo >> workTagId: " + str16);
                ((C119157j) C119157j.f356862d).mo183876g(new C100426a(str16, bVar3, snsInfo2, str17, str18, str, newSightWidget$$j), "sns_background_thread");
                SnsMethodCalculate.markEndTimeMs("commitFakeVideo", str15);
            }
            SnsMethodCalculate.markEndTimeMs(str4, str5);
            return z2;
        }
    }

    /* renamed from: f */
    public boolean mo132128f() {
        SnsMethodCalculate.markStartTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        SnsMethodCalculate.markEndTimeMs("needAutoDraft", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return true;
    }

    /* renamed from: g */
    public boolean mo132129g() {
        SnsMethodCalculate.markStartTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        ProgressDialog progressDialog = this.f277034X;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f277031U.dead();
        if (!C102236a0.m134740e((Bitmap) null)) {
            C98047a aVar = this.f277017G;
            aVar.getClass();
            SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
            Log.m105924i("MicroMsg.SnsFakeVLogHelper", "release");
            C53784a.f150949a.mo74353c(7, aVar);
            SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
            mo132259s(false);
            SightWidgetBackgroundVideoHandler sightWidgetBackgroundVideoHandler = this.f277026P;
            if (sightWidgetBackgroundVideoHandler != null) {
                sightWidgetBackgroundVideoHandler.getClass();
                SnsMethodCalculate.markStartTimeMs("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
                Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "destroy event listener");
                sightWidgetBackgroundVideoHandler.f277480a.dead();
                sightWidgetBackgroundVideoHandler.f277481b = null;
                SnsMethodCalculate.markEndTimeMs("destroyRemuxEventListener", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
                this.f277026P = null;
            }
            SnsMethodCalculate.markEndTimeMs("handleronDestroy", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            return false;
        }
        throw null;
    }

    /* renamed from: h */
    public boolean mo132130h() {
        SnsMethodCalculate.markStartTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        boolean z = !this.f277072x;
        SnsMethodCalculate.markEndTimeMs("enableNext", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        return z;
    }

    /* renamed from: i */
    public void mo132131i(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        SnsMethodCalculate.markEndTimeMs("hanlerOnSave", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: n */
    public void mo132254n(Object obj) {
        Object obj2 = obj;
        SnsMethodCalculate.markStartTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (obj2 instanceof C77575r) {
            C77575r rVar = (C77575r) obj2;
            if (rVar.f226147b == -1 && rVar.f226148c == 0) {
                C101783gu2 gu22 = new C101783gu2();
                gu22.f298309e = true;
                gu22.f298308d = false;
                C77574q qVar = rVar.f226149d;
                C94942r1.f275179a.mo131224c(qVar.f226143b, rVar.f226150e, "key_edit_safe_strategy_emotion_info_list");
                if (qVar.mo107740b()) {
                    String r = C86013q1.m106457r(qVar.f226143b);
                    String str = qVar.f226143b;
                    SightCaptureResult sightCaptureResult = new SightCaptureResult(true, str, qVar.f226144c, r, MD5.getMD5(str), (int) (qVar.f226145d / 1000), gu22);
                    this.f277039c.getIntent().putExtra("key_extra_data", rVar.f226150e);
                    mo132255o(sightCaptureResult);
                } else {
                    String str2 = qVar.f226143b;
                    this.f277072x = true;
                    this.f277039c.getIntent().putExtra("KSightDeleted", this.f277072x);
                    MMActivity mMActivity = this.f277039c;
                    if (mMActivity instanceof SnsUploadUI) {
                        ((SnsUploadUI) mMActivity).mo133089b8(str2, true, 0, (ArrayList<String>) null, (ArrayList<String>) null, this.f277055k);
                        ((SnsUploadUI) this.f277039c).mo133085X7((Bundle) null);
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: o */
    public final void mo132255o(SightCaptureResult sightCaptureResult) {
        SnsMethodCalculate.markStartTimeMs("captureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        this.f277072x = false;
        this.f277039c.getIntent().putExtra("KSightDeleted", this.f277072x);
        MMActivity mMActivity = this.f277039c;
        if (mMActivity instanceof SnsUploadUI) {
            ((SnsUploadUI) mMActivity).mo133087Z7(sightCaptureResult);
        }
        SnsMethodCalculate.markEndTimeMs("captureVideo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i3 = i;
        Intent intent2 = intent;
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (i3 == 9) {
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
            Log.m105924i("MicroMsg.SightWidget", "onActivityResult: CONTEXT_MENU_IMAGE_FROM_MMGALLERY");
            if (intent2.hasExtra("key_video_template_info")) {
                this.f277039c.getIntent().putExtra("KSnsVideoTempalteInfo", intent2.getByteArrayExtra("key_video_template_info"));
            }
            Bundle bundleExtra = intent2.getBundleExtra("key_extra_data");
            if (bundleExtra == null || bundleExtra.getByteArray("key_bg_generate_pb") == null || bundleExtra.getByteArray("key_bg_generate_extra_config") == null) {
                ArrayList<String> stringArrayListExtra = intent2.getStringArrayListExtra("key_select_video_list");
                if ((stringArrayListExtra == null || stringArrayListExtra.size() <= 0) && Util.isNullOrNil(intent2.getStringExtra("K_SEGMENTVIDEOPATH"))) {
                    SightCaptureResult sightCaptureResult = (SightCaptureResult) intent2.getParcelableExtra("key_req_result");
                    if (sightCaptureResult == null || sightCaptureResult.f201515e) {
                        this.f277072x = true;
                        this.f277039c.getIntent().putExtra("KSightDeleted", this.f277072x);
                        ArrayList<String> stringArrayListExtra2 = intent2.getStringArrayListExtra("CropImage_OutputPath_List");
                        if (stringArrayListExtra2 == null || stringArrayListExtra2.size() == 0) {
                            Log.m105924i("MicroMsg.SightWidget", "no image selected");
                            SnsMethodCalculate.markEndTimeMs(str, str2);
                            return false;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> it = stringArrayListExtra2.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                        }
                        boolean booleanExtra = intent2.getBooleanExtra("isTakePhoto", false);
                        int intExtra = intent2.getIntExtra("CropImage_filterId", 0);
                        MMActivity mMActivity = this.f277039c;
                        if (mMActivity instanceof SnsUploadUI) {
                            ((SnsUploadUI) mMActivity).mo133089b8((String) null, booleanExtra, intExtra, stringArrayListExtra2, arrayList, this.f277055k);
                            ((SnsUploadUI) this.f277039c).mo133085X7((Bundle) null);
                        }
                    } else {
                        mo132255o(sightCaptureResult);
                        SnsMethodCalculate.markEndTimeMs(str, str2);
                        return true;
                    }
                } else {
                    this.f277072x = false;
                    this.f277039c.getIntent().putExtra("KSightDeleted", this.f277072x);
                    String stringExtra = (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) ? intent2.getStringExtra("K_SEGMENTVIDEOPATH") : stringArrayListExtra.get(0);
                    this.f277039c.getIntent().putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                    this.f277039c.getIntent().putExtra("Kis_from_sns_drafg_stg", false);
                    String stringExtra2 = intent2.getStringExtra("KSEGMENTVIDEOTHUMBPATH");
                    if (Util.isNullOrNil(stringExtra2) || !C86013q1.m106450k(stringExtra2)) {
                        String str6 = C94866e1.m120263iU() + C86013q1.m106456q(stringExtra);
                        C89231c cVar = new C89231c();
                        try {
                            cVar.setDataSource(stringExtra);
                            Bitmap frameAtTime = cVar.getFrameAtTime(0);
                            if (frameAtTime == null) {
                                Log.m105920e("MicroMsg.SightWidget", "get bitmap error");
                                try {
                                    cVar.release();
                                } catch (Exception unused) {
                                }
                            } else {
                                Log.m105925i("MicroMsg.SightWidget", "getBitmap1 %d %d", Integer.valueOf(frameAtTime.getWidth()), Integer.valueOf(frameAtTime.getHeight()));
                                BitmapUtil.saveBitmapToImage(frameAtTime, 80, Bitmap.CompressFormat.JPEG, str6, true);
                                BitmapFactory.Options imageOptions = BitmapUtil.getImageOptions(str6);
                                Log.m105925i("MicroMsg.SightWidget", "getBitmap2 %d %d", Integer.valueOf(imageOptions.outWidth), Integer.valueOf(imageOptions.outHeight));
                                try {
                                    cVar.release();
                                } catch (Exception unused2) {
                                }
                                str3 = str6;
                            }
                        } catch (Exception e) {
                            Log.m105921e("MicroMsg.SightWidget", "savebitmap error %s", e.getMessage());
                        } catch (Throwable th) {
                            try {
                                cVar.release();
                            } catch (Exception unused3) {
                            }
                            SnsMethodCalculate.markEndTimeMs(str, str2);
                            throw th;
                        }
                    } else {
                        str3 = stringExtra2;
                    }
                    this.f277051i = C86013q1.m106456q(stringExtra);
                    Log.m105925i("MicroMsg.SightWidget", "video path %s thumb path %s and %s %s ", stringExtra, str3, Long.valueOf(C86013q1.m106451l(stringExtra)), Long.valueOf(C86013q1.m106451l(str3)));
                    C94942r1.f275179a.mo131224c(stringExtra, intent2.getBundleExtra("key_extra_data"), "key_edit_safe_strategy_emotion_info_list");
                    MMActivity mMActivity2 = this.f277039c;
                    if (mMActivity2 instanceof SnsUploadUI) {
                        ((SnsUploadUI) mMActivity2).mo133090c8(stringExtra, str3, this.f277051i, (byte[]) null, false, false);
                        ((SnsUploadUI) this.f277039c).mo133085X7((Bundle) null);
                    }
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                    return true;
                }
            } else {
                Log.m105924i("MicroMsg.SightWidget", "goto vlog mode");
                this.f277039c.getIntent().getExtras().clear();
                this.f277039c.getIntent().putExtra("Kis_take_photo", false);
                this.f277039c.getIntent().putExtra("KSnsPostManu", true);
                this.f277039c.getIntent().putExtra("Ksnsupload_type", 14);
                this.f277039c.getIntent().putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                C46075u.f124225a.mo71513a(this.f277039c.getIntent(), intent2);
                ((SnsUploadUI) this.f277039c).mo133085X7((Bundle) null);
                SnsMethodCalculate.markEndTimeMs(str, str2);
                return true;
            }
        } else if (i3 != 11) {
            if (i3 == 12) {
                Log.m105924i("MicroMsg.SightWidget", "onActivityResult: PREVIEW_NEW_SIGHT");
                if (intent2 != null) {
                    C95005x xVar = C95005x.f275632a;
                    long currentTimeMillis = System.currentTimeMillis();
                    SnsMethodCalculate.markStartTimeMs("updateEditPagePlayStopTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                    Log.m105924i("MicroMsg.SnsVideoPublishReporter", "sessionId: " + C95005x.f275633b + ", startPlayTimeStamp: " + C95005x.f275638g + ", stopTimeStamp: " + currentTimeMillis);
                    long j = C95005x.f275638g;
                    if (j == 0 || currentTimeMillis == 0) {
                        str5 = "onActivityResult";
                        str4 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                    } else {
                        long j2 = currentTimeMillis - j;
                        SnsMethodCalculate.markStartTimeMs("updateEditPagePlayTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                        SnsVideoPublishLogStruct snsVideoPublishLogStruct = C95005x.f275634c;
                        long j3 = snsVideoPublishLogStruct.f266243j;
                        str5 = "onActivityResult";
                        str4 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                        snsVideoPublishLogStruct.f266243j = j3 + j2;
                        Log.m105924i("MicroMsg.SnsVideoPublishReporter", "updateEditPagePlayTime >> sessionId: " + C95005x.f275634c.f266237d + ", time: " + j2 + ", lastPlayTime: " + j3 + ", currentTime: " + C95005x.f275634c.f266243j);
                        SnsMethodCalculate.markEndTimeMs("updateEditPagePlayTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                        C95005x.f275638g = 0;
                    }
                    SnsMethodCalculate.markEndTimeMs("updateEditPagePlayStopTime", "com.tencent.mm.plugin.sns.statistics.SnsVideoPublishReporter");
                    this.f277072x = intent2.getBooleanExtra("sns_update_preview_video_del", false);
                    this.f277039c.getIntent().putExtra("KSightDeleted", this.f277072x);
                    if (this.f277072x) {
                        C98047a aVar = this.f277017G;
                        aVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("cancelAndDelete", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
                        Log.m105924i("MicroMsg.SnsFakeVLogHelper", "cancelAndDelete");
                        C53784a.f150949a.mo74353c(7, aVar);
                        if (!TextUtils.isEmpty(aVar.f287470d)) {
                            C103020m.f303985a.mo142733a(aVar.f287470d);
                        }
                        SnsMethodCalculate.markEndTimeMs("cancelAndDelete", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
                        mo132264x();
                        mo132259s(true);
                        SightWidgetBackgroundVideoHandler sightWidgetBackgroundVideoHandler = this.f277026P;
                        if (sightWidgetBackgroundVideoHandler != null) {
                            String str7 = this.f277025O;
                            sightWidgetBackgroundVideoHandler.getClass();
                            SnsMethodCalculate.markStartTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
                            C87412m.m108594g(str7, "workTagId");
                            Log.m105924i("MicroMsg.SightWidgetBackgroundVideoHandler", "deleteWork >> " + str7);
                            if (str7.length() == 0) {
                                Log.m105920e("MicroMsg.SightWidgetBackgroundVideoHandler", "deleteWork tagId is empty");
                                SnsMethodCalculate.markEndTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
                            } else {
                                ((C98449c) C86312j.m106911c(C98449c.class)).mo136685sw(str7);
                                SnsMethodCalculate.markEndTimeMs("deleteWork", "com.tencent.mm.plugin.sns.ui.SightWidgetBackgroundVideoHandler");
                            }
                            this.f277025O = "";
                            this.f277023M = false;
                            xVar.mo131409d(false);
                            if (this.f277028R.getVisibility() == 0) {
                                View view = this.f277028R;
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar2.mo10233c(8);
                                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/NewSightWidget", "onActivityResult", "(IILandroid/content/Intent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/ui/NewSightWidget", "onActivityResult", "(IILandroid/content/Intent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs(str5, str4);
                        return true;
                    }
                    String str8 = str5;
                    String str9 = str4;
                    boolean z = this.f277028R.getVisibility() != 0;
                    SnsMethodCalculate.markEndTimeMs(str8, str9);
                    return z;
                }
            }
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
        } else {
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
            Log.m105924i("MicroMsg.SightWidget", "onActivityResult: MMSIGHT_CAPTURE");
            SightCaptureResult sightCaptureResult2 = (SightCaptureResult) intent2.getParcelableExtra("key_req_result");
            if (sightCaptureResult2 != null) {
                if (!sightCaptureResult2.f201515e) {
                    this.f277039c.getIntent().putExtra("key_extra_data", intent2.getBundleExtra("key_extra_data"));
                    mo132255o(sightCaptureResult2);
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                    return true;
                }
                this.f277072x = true;
                this.f277039c.getIntent().putExtra("KSightDeleted", this.f277072x);
                int intExtra2 = intent2.getIntExtra("CropImage_filterId", 0);
                String str10 = sightCaptureResult2.f201523p;
                MMActivity mMActivity3 = this.f277039c;
                if (mMActivity3 instanceof SnsUploadUI) {
                    ((SnsUploadUI) mMActivity3).mo133089b8(str10, true, intExtra2, (ArrayList<String>) null, (ArrayList<String>) null, this.f277055k);
                    ((SnsUploadUI) this.f277039c).mo133085X7((Bundle) null);
                }
                SnsMethodCalculate.markEndTimeMs(str, str2);
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
        return false;
    }

    /* renamed from: p */
    public void mo132256p() {
        SnsMethodCalculate.markStartTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        mo132260t(1);
        long c = C31543z5.m39453c();
        C115669n.INSTANCE.mo160131h(13822, 1, 2, C102236a0.m134754l(), Long.valueOf(c));
        SightParams sightParams = new SightParams(2, 0);
        String l = C97842b.m126295l(C98398h0.wx0().ca0());
        String n = C97842b.m126297n(l);
        C94992f fVar = C94992f.f275600a;
        VideoTransPara videoTransPara = sightParams.f248452f;
        RecordConfigProvider a = fVar.mo131399a(l, n, videoTransPara, videoTransPara.f267170h * 1000, 49);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_ignore_remux_without_edit, false)) {
            a.f272919d = 2;
        }
        VideoCaptureReportInfo videoCaptureReportInfo = new VideoCaptureReportInfo();
        videoCaptureReportInfo.f272940d = 7;
        a.f272908I = videoCaptureReportInfo;
        ((C77572l) C86312j.m106911c(C77572l.class)).mo107612ZM(this.f277039c, a, new NewSightWidget$$g(this));
        SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: q */
    public final void mo132257q() {
        int i;
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        String string = this.f277039c.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).getString("gallery", "1");
        C115669n.INSTANCE.mo160131h(13822, 2, 2, C102236a0.m134754l(), Long.valueOf(C31543z5.m39453c()));
        if (string.equalsIgnoreCase("0")) {
            C96892t1.m124463c(this.f277039c, 2, 1, 0, 1, SnsTimeLineUI.m122313w8(), (Intent) null);
        } else {
            Intent intent = new Intent();
            intent.putExtra("key_edit_video_max_time_length", C102609h.Fx0().Gx0().f267170h);
            intent.putExtra("key_can_select_video_and_pic", !(C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_enable_vlog, false)));
            intent.putExtra("key_check_third_party_video", true);
            if (((C58247e) C86312j.m106911c(C58247e.class)).ni0().mo72159a()) {
                intent.putExtra("key_sns_publish_template", true);
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_publish_template_media_num, 20);
                Log.m105924i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + Qe);
                i = Qe;
            } else {
                i = 9;
            }
            intent.putExtra("key_can_select_video_and_pic", false);
            C96892t1.m124463c(this.f277039c, 9, i, 4, 3, SnsTimeLineUI.m122313w8(), intent);
        }
        mo132260t(2);
        SnsMethodCalculate.markEndTimeMs("openGallery", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: r */
    public final void mo132258r() {
        SnsMethodCalculate.markStartTimeMs("replaceBackgroundInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (!this.f277023M || this.f277053j) {
            SnsMethodCalculate.markEndTimeMs("replaceBackgroundInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            return;
        }
        this.f277051i = C86013q1.m106456q(this.f277049h);
        this.f277023M = false;
        this.f277039c.getIntent().putExtra("KSightThumbPath", this.f277047g);
        this.f277039c.getIntent().putExtra("KSightPath", this.f277049h);
        this.f277039c.getIntent().putExtra("sight_md5", this.f277051i);
        this.f277039c.getIntent().getBundleExtra("key_extra_data").putBoolean("key_is_background_video", false);
        SnsMethodCalculate.markEndTimeMs("replaceBackgroundInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: s */
    public final void mo132259s(boolean z) {
        SnsMethodCalculate.markStartTimeMs("resetStatus", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        this.f277049h = "";
        this.f277047g = "";
        this.f277072x = z;
        if (z) {
            this.f277039c.getIntent().putExtra("KSightThumbPath", this.f277047g);
            this.f277039c.getIntent().putExtra("KSightPath", this.f277049h);
        }
        this.f277039c.getIntent().putExtra("KSightDeleted", this.f277072x);
        this.f277012B = 90;
        if (C102236a0.m134740e(this.f277014D)) {
            this.f277014D.recycle();
            this.f277014D = null;
        }
        SnsMethodCalculate.markEndTimeMs("resetStatus", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: t */
    public final void mo132260t(int i) {
        SnsMethodCalculate.markStartTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        SnsBeforePostImageInfoStruct snsBeforePostImageInfoStruct = new SnsBeforePostImageInfoStruct();
        long nowMilliSecond = Util.nowMilliSecond();
        snsBeforePostImageInfoStruct.f265951f = nowMilliSecond;
        snsBeforePostImageInfoStruct.mo86048e("ClickTimeStampMs", nowMilliSecond);
        snsBeforePostImageInfoStruct.f265949d = (long) i;
        snsBeforePostImageInfoStruct.f265950e = snsBeforePostImageInfoStruct.mo86045b("SessionId", this.f277065q, true);
        snsBeforePostImageInfoStruct.mo86054n();
        SnsMethodCalculate.markEndTimeMs("rptPostImageInfo", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: u */
    public final void mo132261u(String str, Object obj) {
        SnsMethodCalculate.markStartTimeMs("setReportValueToSecondCut", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        C104289g gVar = this.f277021K;
        if (gVar != null) {
            try {
                gVar.mo145967r(str, obj);
            } catch (C79923f unused) {
                Log.m105920e("MicroMsg.SightWidget", "put SecondCut JSON Error");
            }
        }
        SnsMethodCalculate.markEndTimeMs("setReportValueToSecondCut", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: v */
    public final void mo132262v() {
        SnsMethodCalculate.markStartTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        try {
            C77407n nVar = new C77407n((Context) this.f277039c, 1, false);
            nVar.f225771i = new NewSightWidget$$e(this);
            nVar.f225782p = new NewSightWidget$$f(this);
            nVar.mo107573q();
        } catch (Exception unused) {
        }
        SnsMethodCalculate.markEndTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: w */
    public final void mo132263w() {
        SnsMethodCalculate.markStartTimeMs("showPreviewView", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        Bitmap bitmap = this.f277014D;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f277043e.setImageBitmap(this.f277014D);
            this.f277043e.mo130072c(((Integer) this.f277013C.first).intValue(), ((Integer) this.f277013C.second).intValue());
        }
        SnsMethodCalculate.markEndTimeMs("showPreviewView", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: x */
    public final void mo132264x() {
        SnsMethodCalculate.markStartTimeMs("showSightCapture", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        this.f277045f.setVisibility(8);
        this.f277043e.clear();
        this.f277043e.mo130072c(C76577a.m92151b(this.f277039c, 100), C76577a.m92151b(this.f277039c, 100));
        this.f277043e.setBackgroundResource(C0966R.color.adw);
        this.f277043e.setImageResource(C0966R.raw.album_post_add_picture_btn);
        SightPlayImageView sightPlayImageView = this.f277043e;
        sightPlayImageView.setContentDescription(sightPlayImageView.getContext().getString(C0966R.string.jal));
        int b = (C76577a.m92151b(this.f277039c, 100) * 35) / 100;
        this.f277043e.setPadding(b, b, b, b);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_clear_sns_tmp_file, true)) {
            C98453h hVar = C98453h.f288774a;
            hVar.mo137812j(this.f277049h);
            hVar.mo137812j(this.f277047g);
        }
        SnsMethodCalculate.markEndTimeMs("showSightCapture", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }

    /* renamed from: y */
    public final void mo132265y() {
        SnsMethodCalculate.markStartTimeMs("updateFakeViewError", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
        if (this.f277053j) {
            SnsMethodCalculate.markEndTimeMs("updateFakeViewError", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            return;
        }
        Log.m105924i("MicroMsg.SightWidget", "updateFakeViewError ");
        View view = this.f277028R;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/NewSightWidget", "updateFakeViewError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/NewSightWidget", "updateFakeViewError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        MMActivity mMActivity = this.f277039c;
        if (mMActivity instanceof SnsUploadUI) {
            mMActivity.enableOptionMenu(false);
        }
        SnsMethodCalculate.markEndTimeMs("updateFakeViewError", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
    }
}
