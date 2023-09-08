package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsTextProgressBar;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.statemachine.LogStateTransitionState;
import com.tencent.p014mm.sdk.statemachine.State;
import com.tencent.p014mm.sdk.statemachine.StateMachine;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import eu3.C58834h;
import eu3.C97749e;
import j20.C117292a;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import jp2.C98961m;
import ke3.C88144b;
import lo2.C34318c;
import lo2.C99525b0;
import lo2.C99552l;
import nj3.C76879j;
import p680ru.C77570i;
import qs2.C101256b;
import rq2.C63505q;
import te3.C101863wr;
import te3.C52157yr;
import vr2.C102239c;
import vr2.C102240d;
import vr2.C102259p;
import vr2.C102260r;
import wr2.C91098a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 */
public class C95144m0 extends C95098h0 implements Serializable {

    /* renamed from: A */
    public boolean f276148A;

    /* renamed from: B */
    public boolean f276149B = true;

    /* renamed from: C */
    public String f276150C = "";

    /* renamed from: D */
    public String f276151D = "";

    /* renamed from: E */
    public String f276152E = "";

    /* renamed from: F */
    public String f276153F = "";

    /* renamed from: G */
    public volatile boolean f276154G = false;

    /* renamed from: H */
    public String f276155H = "";

    /* renamed from: I */
    public String f276156I = "";

    /* renamed from: J */
    public int f276157J;

    /* renamed from: K */
    public String f276158K = "";

    /* renamed from: L */
    public String f276159L = "";

    /* renamed from: M */
    public int f276160M = 2;

    /* renamed from: N */
    public boolean f276161N = false;

    /* renamed from: P */
    public View.OnClickListener f276162P = new C95145a();

    /* renamed from: Q */
    public AdLandingPagesProxy.C94830p f276163Q = new C95146b();

    /* renamed from: u */
    public View f276164u;

    /* renamed from: v */
    public Button f276165v;

    /* renamed from: w */
    public SnsTextProgressBar f276166w;

    /* renamed from: x */
    public C95148d f276167x;

    /* renamed from: y */
    public HandlerThread f276168y;

    /* renamed from: z */
    public C95178e f276169z;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$a */
    public class C95145a implements View.OnClickListener {
        public C95145a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$1");
            C95144m0.m121065K(C95144m0.this).sendMessage(0);
            C95144m0.this.mo131612E();
            C95144m0.this.mo131613G();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageDownloadApkBtnComp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$b */
    public class C95146b implements AdLandingPagesProxy.C94830p {
        public C95146b() {
        }

        /* renamed from: a */
        public void mo10855a(Object obj) {
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$2");
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$2");
        }

        /* renamed from: b */
        public void mo10856b(int i, int i2, Object obj) {
            String str;
            SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$2");
            Log.m105924i("MicroMsg.AdLandingPageDownloadApkBtnComp", " AdLandingPagesProxy.Callback, errType=" + i + ", errNo=" + i2);
            if (i == 0 && i2 == 0) {
                C52157yr yrVar = new C52157yr();
                try {
                    yrVar.parseFrom((byte[]) obj);
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.AdLandingPageDownloadApkBtnComp", Util.stackTraceToString(e));
                }
                if (!TextUtils.isEmpty(yrVar.f145476e)) {
                    Log.m105924i("MicroMsg.AdLandingPageDownloadApkBtnComp", "opening url " + yrVar.f145476e);
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", yrVar.f145476e);
                    intent.putExtra("showShare", true);
                    C88144b.m109791i(C95144m0.this.f276579d, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    C95144m0.m121065K(C95144m0.this).sendMessage(10);
                    C115669n.INSTANCE.mo175911u(1958, 26);
                } else if (yrVar.f145475d != null) {
                    if (C95144m0.m121066M(C95144m0.this).f296527f0) {
                        C115669n nVar = C115669n.INSTANCE;
                        nVar.mo175911u(1958, 27);
                        C95144m0.m121066M(C95144m0.this).f296528g0 = yrVar.f145475d.f299807u;
                        C95144m0.m121066M(C95144m0.this).f296522a0 = yrVar.f145475d.f299805s;
                        C95144m0.m121066M(C95144m0.this).f296521Z = yrVar.f145475d.f299806t;
                        C101256b M = C95144m0.m121066M(C95144m0.this);
                        C101863wr wrVar = yrVar.f145475d;
                        M.f296526e0 = (long) wrVar.f299808v;
                        str = wrVar.f299804r;
                        if (TextUtils.isEmpty(C95144m0.m121066M(C95144m0.this).f296522a0) || TextUtils.isEmpty(C95144m0.m121066M(C95144m0.this).f296521Z) || C95144m0.m121066M(C95144m0.this).f296526e0 == 0) {
                            C95144m0.m121066M(C95144m0.this).f296527f0 = false;
                            Log.m105920e("MicroMsg.AdLandingPageDownloadApkBtnComp", "[DoNetSceneState], useGameDownloadWidget, but wxAppInfo is empty");
                            nVar.mo175911u(1958, 28);
                        }
                    } else {
                        str = "";
                    }
                    if (!C95144m0.m121066M(C95144m0.this).f296527f0) {
                        C95144m0.m121066M(C95144m0.this).f296528g0 = yrVar.f145475d.f299796g;
                        C95144m0.m121066M(C95144m0.this).f296522a0 = yrVar.f145475d.f299794e;
                        C95144m0.m121066M(C95144m0.this).f296521Z = yrVar.f145475d.f299795f;
                        C95144m0.m121066M(C95144m0.this).f296526e0 = (long) yrVar.f145475d.f299799j;
                        str = yrVar.f145475d.f299793d + "";
                    }
                    C95144m0.m121065K(C95144m0.this).sendMessage(6);
                    Log.m105924i("MicroMsg.AdLandingPageDownloadApkBtnComp", "[DoNetSceneState] PkgInfoResp, name=" + C95144m0.m121066M(C95144m0.this).f296528g0 + ", useGameDownloadWidget=" + C95144m0.m121066M(C95144m0.this).f296527f0 + ", fileSize=" + C95144m0.m121066M(C95144m0.this).f296526e0 + ", apkId=" + str + ", url=" + C95144m0.m121066M(C95144m0.this).f296521Z);
                } else {
                    Log.m105920e("MicroMsg.AdLandingPageDownloadApkBtnComp", "resp is null");
                    C95144m0.m121065K(C95144m0.this).sendMessage(5);
                }
            } else {
                C95144m0.m121065K(C95144m0.this).sendMessage(5);
                C115669n.INSTANCE.mo175911u(1958, 25);
            }
            SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$2");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$c */
    public static class C95147c implements Serializable {

        /* renamed from: d */
        public String f276172d;

        /* renamed from: e */
        public int f276173e;

        /* renamed from: f */
        public String f276174f;

        /* renamed from: g */
        public String f276175g;

        /* renamed from: h */
        public int f276176h;

        public C95147c(String str, int i, String str2, String str3, int i2) {
            this.f276172d = str;
            this.f276173e = i;
            this.f276174f = str2;
            this.f276175g = str3;
            this.f276176h = i2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d */
    public class C95148d extends StateMachine implements Serializable {

        /* renamed from: d */
        public State f276177d = new C95152c();

        /* renamed from: e */
        public State f276178e = new C95166g();

        /* renamed from: f */
        public State f276179f = new C95161e();

        /* renamed from: g */
        public State f276180g = new C95174h();

        /* renamed from: h */
        public State f276181h = new C95176i();

        /* renamed from: i */
        public State f276182i = new C95164f();

        /* renamed from: j */
        public State f276183j = new C95151b();

        /* renamed from: n */
        public State f276184n = new C95149a();

        /* renamed from: o */
        public State f276185o = new C95160d();

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$a */
        public class C95149a extends LogStateTransitionState {

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$a$a */
            public class C95150a implements Runnable {
                public C95150a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DisableUnsupportPlatformState$1");
                    C95144m0.m121079d0(C95144m0.this).setVisibility(8);
                    C95144m0.m121080e0(C95144m0.this).setEnabled(false);
                    C95144m0.m121080e0(C95144m0.this).setText(!TextUtils.isEmpty(C95144m0.m121066M(C95144m0.this).f296532k0) ? C95144m0.m121066M(C95144m0.this).f296532k0 : "暂不支持安卓手机");
                    if (!C95144m0.m121081g0(C95144m0.this)) {
                        C95144m0.m121080e0(C95144m0.this).setVisibility(0);
                    }
                    C95144m0 m0Var = C95144m0.this;
                    C99525b0.m129881d(m0Var.f276579d, C95144m0.m121066M(m0Var), C95144m0.m121080e0(C95144m0.this));
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DisableUnsupportPlatformState$1");
                }
            }

            public C95149a() {
            }

            public void enter() {
                SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DisableUnsupportPlatformState");
                super.enter();
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "DisableUnsupportPlatformState enter, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                MMHandlerThread.postToMainThread(new C95150a());
                SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DisableUnsupportPlatformState");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$b */
        public class C95151b extends LogStateTransitionState {

            /* renamed from: d */
            public long f276189d = 0;

            public C95151b() {
            }

            public void enter() {
                SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
                super.enter();
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "DoNetSceneState enter, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                this.f276189d = System.currentTimeMillis();
                String R = C95144m0.m121071R(C95144m0.this);
                String V = C95144m0.m121073V(C95144m0.this);
                int W = C95144m0.m121074W(C95144m0.this);
                String U = C95144m0.m121072U(C95144m0.this);
                String X = C95144m0.m121075X(C95144m0.this);
                String Y = C95144m0.m121076Y(C95144m0.this);
                String b0 = C95144m0.m121077b0(C95144m0.this);
                ArrayList<Integer> arrayList = C99552l.f291829a;
                SnsMethodCalculate.markStartTimeMs("reportDoNetSceneBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                try {
                    C102240d.C102242b bVar = new C102240d.C102242b();
                    bVar.mo141803k(4001021);
                    bVar.mo141805m(R);
                    bVar.mo141797e(V);
                    bVar.mo141802j(W);
                    bVar.mo141795c(U);
                    bVar.mo141806n(X);
                    bVar.mo141804l(Y);
                    bVar.mo141807o(b0);
                    bVar.mo141801i(4);
                    C63505q.m74843b(bVar.mo141793a());
                } catch (Throwable th) {
                    Log.m105920e("AdConversionOnlineReportHelper", "reportDoNetSceneBeforeDownload, exp is " + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("reportDoNetSceneBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
                String str = C95144m0.m121066M(C95144m0.this).f296529h0;
                String str2 = C95144m0.m121066M(C95144m0.this).f296525d0;
                C95144m0 m0Var = C95144m0.this;
                instance.doAdChannelScene(str, str2, m0Var.f276163Q, C95144m0.m121066M(m0Var).f296527f0);
                C115669n.INSTANCE.mo175911u(1958, 24);
                Log.m105924i(LogStateTransitionState.TAG, "[DoNetSceneState], appid=" + C95144m0.m121066M(C95144m0.this).f296523b0 + ", pkg=" + C95144m0.m121066M(C95144m0.this).f296529h0 + ", channelId=" + C95144m0.m121066M(C95144m0.this).f296525d0 + ", useGameDownloadWidget=" + C95144m0.m121066M(C95144m0.this).f296527f0 + ", hash=" + hashCode());
                SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
            }

            public boolean processMessage(Message message) {
                SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "DoNetSceneState msg=" + message.what + ", idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append("[DoNetSceneState]recv msg.what ");
                sb.append(message.what);
                Log.m105924i(LogStateTransitionState.TAG, sb.toString());
                if (AdLandingPagesProxy.getInstance().isApkExist(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                    C95148d dVar = C95148d.this;
                    State state = dVar.f276180g;
                    SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar.transitionTo(state);
                    SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
                    return true;
                }
                int i = message.what;
                if (i == 5) {
                    C95148d dVar2 = C95148d.this;
                    C95148d.m121092e(dVar2, C95144m0.this.f276579d.getString(C0966R.string.j_0));
                    C95148d dVar3 = C95148d.this;
                    State state2 = dVar3.f276182i;
                    SnsMethodCalculate.markStartTimeMs("access$3800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar3.transitionTo(state2);
                    SnsMethodCalculate.markEndTimeMs("access$3800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
                    return true;
                } else if (i == 6) {
                    int currentTimeMillis = (int) (System.currentTimeMillis() - this.f276189d);
                    C95148d dVar4 = C95148d.this;
                    State state3 = dVar4.f276178e;
                    SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar4.transitionTo(state3);
                    SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    String R = C95144m0.m121071R(C95144m0.this);
                    String V = C95144m0.m121073V(C95144m0.this);
                    int W = C95144m0.m121074W(C95144m0.this);
                    String U = C95144m0.m121072U(C95144m0.this);
                    String X = C95144m0.m121075X(C95144m0.this);
                    String Y = C95144m0.m121076Y(C95144m0.this);
                    String b0 = C95144m0.m121077b0(C95144m0.this);
                    SnsMethodCalculate.markStartTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    SnsMethodCalculate.markEndTimeMs("setCostTime", "com.tencent.mm.plugin.sns.data.AdConversionOnlineParams");
                    ArrayList<Integer> arrayList = C99552l.f291829a;
                    SnsMethodCalculate.markStartTimeMs("reportDoNetSceneSuccBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    try {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        bVar.mo141803k(4001022);
                        bVar.mo141805m(R);
                        bVar.mo141797e(V);
                        bVar.mo141802j(W);
                        bVar.mo141795c(U);
                        bVar.mo141806n(X);
                        bVar.mo141804l(Y);
                        bVar.mo141807o(b0);
                        bVar.mo141801i(4);
                        bVar.mo141798f(currentTimeMillis);
                        C63505q.m74843b(bVar.mo141793a());
                    } catch (Throwable th) {
                        Log.m105920e("AdConversionOnlineReportHelper", "reportDoNetSceneSuccBeforeDownload, exp is " + th.toString());
                    }
                    SnsMethodCalculate.markEndTimeMs("reportDoNetSceneSuccBeforeDownload", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    this.f276189d = 0;
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
                    return true;
                } else if (i != 10) {
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
                    return false;
                } else {
                    C95148d dVar5 = C95148d.this;
                    State state4 = dVar5.f276178e;
                    SnsMethodCalculate.markStartTimeMs("access$3900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar5.transitionTo(state4);
                    SnsMethodCalculate.markEndTimeMs("access$3900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DoNetSceneState");
                    return true;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$c */
        public class C95152c extends LogStateTransitionState {

            /* renamed from: d */
            public AdLandingPagesProxy.C94827l f276191d;

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$c$a */
            public class C95153a implements Runnable {
                public C95153a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$1");
                    C95144m0.m121080e0(C95144m0.this).setVisibility(8);
                    C95144m0.m121079d0(C95144m0.this).setVisibility(0);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$1");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$c$b */
            public class C95154b implements Runnable {
                public C95154b() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$2");
                    C95144m0.m121079d0(C95144m0.this).setProgress(AdLandingPagesProxy.getInstance().getTaskProgress(C95144m0.m121066M(C95144m0.this).f296523b0));
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$2");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$c$c */
            public class C95155c implements Runnable {
                public C95155c() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$3");
                    C95144m0.m121079d0(C95144m0.this).setProgress(100);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$3");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$c$d */
            public class C95156d implements DialogInterface.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ C95147c f276196d;

                public C95156d(C95147c cVar) {
                    this.f276196d = cVar;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$4");
                    Log.m105924i(LogStateTransitionState.TAG, "tip dialog, continue download, resumeTask");
                    AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
                    String str = C95144m0.m121066M(C95144m0.this).f296523b0;
                    C95152c cVar = C95152c.this;
                    instance.resumeTask(str, cVar.f276191d, C95144m0.this.mo131854m().mo140735b(), C95144m0.this.mo131854m().mo140743j(), C95144m0.this.mo131854m().mo140745l(), this.f276196d);
                    String R = C95144m0.m121071R(C95144m0.this);
                    String V = C95144m0.m121073V(C95144m0.this);
                    int W = C95144m0.m121074W(C95144m0.this);
                    String U = C95144m0.m121072U(C95144m0.this);
                    String X = C95144m0.m121075X(C95144m0.this);
                    String Y = C95144m0.m121076Y(C95144m0.this);
                    String b0 = C95144m0.m121077b0(C95144m0.this);
                    int N = C95144m0.m121067N(C95144m0.this);
                    ArrayList<Integer> arrayList = C99552l.f291829a;
                    SnsMethodCalculate.markStartTimeMs("reportPauseDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    try {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        bVar.mo141803k(4001008);
                        bVar.mo141805m(R);
                        bVar.mo141797e(V);
                        bVar.mo141802j(W);
                        bVar.mo141795c(U);
                        bVar.mo141806n(X);
                        bVar.mo141804l(Y);
                        bVar.mo141807o(b0);
                        bVar.mo141801i(4);
                        bVar.mo141796d(N);
                        C63505q.m74843b(bVar.mo141793a());
                    } catch (Throwable th) {
                        Log.m105920e("AdConversionOnlineReportHelper", "reportPauseDialogConfirm, exp is " + th.toString());
                    }
                    SnsMethodCalculate.markEndTimeMs("reportPauseDialogConfirm", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$4");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$c$e */
            public class C95157e implements DialogInterface.OnClickListener {
                public C95157e() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$5");
                    Log.m105924i(LogStateTransitionState.TAG, "tip dialog, confirm cancel");
                    C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), 1, 5, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$5");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$c$f */
            public class C95158f implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ int f276199d;

                public C95158f(int i) {
                    this.f276199d = i;
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$6");
                    if (this.f276199d >= 0) {
                        C95144m0.m121079d0(C95144m0.this).setProgress(this.f276199d);
                    }
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$6");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$c$g */
            public class C95159g implements AdLandingPagesProxy.C94827l {
                public C95159g(C95145a aVar) {
                }

                /* renamed from: a */
                public void mo130929a() {
                    SnsMethodCalculate.markStartTimeMs(StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                    Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.callback", "succeed, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                    C95144m0.m121065K(C95144m0.this).sendMessage(9);
                    SnsMethodCalculate.markEndTimeMs(StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                }

                /* renamed from: b */
                public void mo130930b() {
                    SnsMethodCalculate.markStartTimeMs("resumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                    Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.callback", "resumed, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                    C95144m0.m121065K(C95144m0.this).sendMessage(13);
                    SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                }

                /* renamed from: c */
                public void mo130931c(int i) {
                    SnsMethodCalculate.markStartTimeMs("progress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                    if (i % 20 == 0) {
                        Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.callback", "progress:" + i + ", idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                    }
                    C95144m0.m121065K(C95144m0.this).sendMessage(1, i);
                    SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                }

                /* renamed from: d */
                public void mo130932d() {
                    SnsMethodCalculate.markStartTimeMs(StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                    Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.callback", "failed, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                    C95144m0.m121065K(C95144m0.this).sendMessage(8);
                    SnsMethodCalculate.markEndTimeMs(StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                }

                /* renamed from: e */
                public void mo130933e() {
                    SnsMethodCalculate.markStartTimeMs("paused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                    Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.callback", "paused, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                    C95144m0.m121065K(C95144m0.this).sendMessage(7);
                    SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                }

                /* renamed from: f */
                public void mo130934f() {
                    SnsMethodCalculate.markStartTimeMs("stopped", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                    Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.callback", "stopped, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                    C95144m0.m121065K(C95144m0.this).sendMessage(14);
                    SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                }

                public void start() {
                    SnsMethodCalculate.markStartTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                    Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.callback", "start, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                    SnsMethodCalculate.markEndTimeMs(IXWebBroadcastListener.STAGE_START, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState$MyDownloadCallback");
                }
            }

            public C95152c() {
            }

            public void enter() {
                String str;
                SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                super.enter();
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "DownloadingState enter, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                MMHandlerThread.postToMainThread(new C95153a());
                C95147c cVar = new C95147c(C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this));
                if (AdLandingPagesProxy.getInstance().isPaused(C95144m0.m121066M(C95144m0.this).f296523b0) || AdLandingPagesProxy.getInstance().isDownloading(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                    str = "enter";
                    if (this.f276191d == null) {
                        this.f276191d = new C95159g((C95145a) null);
                    }
                    MMHandlerThread.postToMainThread(new C95154b());
                    if (!AdLandingPagesProxy.getInstance().resumeTask(C95144m0.m121066M(C95144m0.this).f296523b0, this.f276191d, C95144m0.this.mo131854m().mo140735b(), C95144m0.this.mo131854m().mo140743j(), C95144m0.this.mo131854m().mo140745l(), cVar)) {
                        AdLandingPagesProxy.getInstance().stopTask(C95144m0.m121066M(C95144m0.this).f296523b0);
                        C95148d dVar = C95148d.this;
                        State state = dVar.f276177d;
                        SnsMethodCalculate.markStartTimeMs("access$4100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                        dVar.transitionTo(state);
                        SnsMethodCalculate.markEndTimeMs("access$4100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    } else {
                        C115669n.INSTANCE.mo175911u(1958, 15);
                    }
                } else if (TextUtils.isEmpty(C95144m0.m121066M(C95144m0.this).f296521Z)) {
                    C95148d dVar2 = C95148d.this;
                    State state2 = dVar2.f276183j;
                    SnsMethodCalculate.markStartTimeMs("access$4200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar2.transitionTo(state2);
                    SnsMethodCalculate.markEndTimeMs("access$4200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return;
                } else if (AdLandingPagesProxy.getInstance().isApkExist(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                    MMHandlerThread.postToMainThread(new C95155c());
                    C95148d dVar3 = C95148d.this;
                    State state3 = dVar3.f276180g;
                    SnsMethodCalculate.markStartTimeMs("access$4300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar3.transitionTo(state3);
                    SnsMethodCalculate.markEndTimeMs("access$4300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return;
                } else {
                    AdLandingPagesProxy.getInstance().stopTask(C95144m0.m121066M(C95144m0.this).f296523b0);
                    this.f276191d = new C95159g((C95145a) null);
                    C115669n.INSTANCE.mo175911u(1958, 13);
                    str = "enter";
                    AdLandingPagesProxy.getInstance().startDownload(C95144m0.m121066M(C95144m0.this).f296523b0, C95144m0.m121066M(C95144m0.this).f296524c0, C95144m0.m121066M(C95144m0.this).f296529h0, C95144m0.m121066M(C95144m0.this).f296522a0, C95144m0.m121066M(C95144m0.this).f296521Z, C95144m0.m121066M(C95144m0.this).f296528g0, C95144m0.m121066M(C95144m0.this).f296530i0, this.f276191d, C95144m0.this.mo131854m().mo140735b(), C95144m0.this.mo131854m().mo140743j(), C95144m0.this.mo131854m().mo140745l(), C95144m0.m121066M(C95144m0.this).f296527f0, cVar);
                }
                SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
            }

            public boolean processMessage(Message message) {
                Message message2 = message;
                SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                if (message2.what != 1) {
                    Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "DownloadingState, msg=" + message2.what + ", idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                }
                Log.m105924i(LogStateTransitionState.TAG, hashCode() + "[DownloadingState] recv msg.what " + message2.what);
                int i = message2.what;
                if (i == 0) {
                    C115669n.INSTANCE.mo175911u(1958, 14);
                    if (AdLandingPagesProxy.getInstance().pauseTask(C95144m0.m121066M(C95144m0.this).f296523b0) && AdLandingPagesProxy.getInstance().isPaused(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                        C95148d dVar = C95148d.this;
                        State state = dVar.f276179f;
                        SnsMethodCalculate.markStartTimeMs("access$4400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                        dVar.transitionTo(state);
                        SnsMethodCalculate.markEndTimeMs("access$4400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    }
                    C95147c cVar = new C95147c(C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this));
                    String R = C95144m0.m121071R(C95144m0.this);
                    String V = C95144m0.m121073V(C95144m0.this);
                    int W = C95144m0.m121074W(C95144m0.this);
                    String U = C95144m0.m121072U(C95144m0.this);
                    String X = C95144m0.m121075X(C95144m0.this);
                    String Y = C95144m0.m121076Y(C95144m0.this);
                    String b0 = C95144m0.m121077b0(C95144m0.this);
                    int N = C95144m0.m121067N(C95144m0.this);
                    ArrayList<Integer> arrayList = C99552l.f291829a;
                    SnsMethodCalculate.markStartTimeMs("reportPauseDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    try {
                        C102240d.C102242b bVar = new C102240d.C102242b();
                        bVar.mo141803k(4001007);
                        bVar.mo141805m(R);
                        bVar.mo141797e(V);
                        bVar.mo141802j(W);
                        bVar.mo141795c(U);
                        bVar.mo141806n(X);
                        bVar.mo141804l(Y);
                        bVar.mo141807o(b0);
                        bVar.mo141801i(4);
                        bVar.mo141796d(N);
                        C63505q.m74843b(bVar.mo141793a());
                    } catch (Throwable th) {
                        Log.m105920e("AdConversionOnlineReportHelper", "reportPauseDialogShow, exp is " + th.toString());
                    }
                    SnsMethodCalculate.markEndTimeMs("reportPauseDialogShow", "com.tencent.mm.plugin.sns.ad.helper.AdConversionOnlineReportHelper");
                    C76879j.m92740k(C95144m0.this.f276579d, C0966R.string.j9x, C0966R.string.j9y, C0966R.string.j_3, C0966R.string.j_7, false, new C95156d(cVar), new C95157e());
                    C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), 0, 5, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return true;
                } else if (i == 1) {
                    MMHandlerThread.postToMainThread(new C95158f(message2.arg1));
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return true;
                } else if (i == 3) {
                    C95148d dVar2 = C95148d.this;
                    State state2 = dVar2.f276181h;
                    SnsMethodCalculate.markStartTimeMs("access$4500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar2.transitionTo(state2);
                    SnsMethodCalculate.markEndTimeMs("access$4500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return true;
                } else if (i == 14) {
                    C95144m0.m121079d0(C95144m0.this).setProgress(0);
                    C95148d dVar3 = C95148d.this;
                    State state3 = dVar3.f276178e;
                    SnsMethodCalculate.markStartTimeMs("access$4900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar3.transitionTo(state3);
                    SnsMethodCalculate.markEndTimeMs("access$4900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return true;
                } else if (i == 7) {
                    C95148d dVar4 = C95148d.this;
                    State state4 = dVar4.f276179f;
                    SnsMethodCalculate.markStartTimeMs("access$4600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar4.transitionTo(state4);
                    SnsMethodCalculate.markEndTimeMs("access$4600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return true;
                } else if (i == 8) {
                    C95148d dVar5 = C95148d.this;
                    C95148d.m121092e(dVar5, C95144m0.this.f276579d.getString(C0966R.string.j_0));
                    C95148d dVar6 = C95148d.this;
                    State state5 = dVar6.f276182i;
                    SnsMethodCalculate.markStartTimeMs("access$4700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar6.transitionTo(state5);
                    SnsMethodCalculate.markEndTimeMs("access$4700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return true;
                } else if (i != 9) {
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return false;
                } else {
                    C95144m0 m0Var = C95144m0.this;
                    m0Var.getClass();
                    SnsMethodCalculate.markStartTimeMs("deferredDeepLink", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                    Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp", "writing deferred deep link");
                    AdLandingPagesProxy.getInstance().writeDeferredDeepLink(m0Var.mo131670i0().f296529h0, m0Var.mo131670i0().f296542u0);
                    C34318c.m40323b(m0Var.mo131670i0().f296529h0, m0Var.mo131670i0().f296542u0);
                    SnsMethodCalculate.markEndTimeMs("deferredDeepLink", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                    C95148d dVar7 = C95148d.this;
                    State state6 = dVar7.f276180g;
                    SnsMethodCalculate.markStartTimeMs("access$4800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar7.transitionTo(state6);
                    SnsMethodCalculate.markEndTimeMs("access$4800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$DownloadingState");
                    return true;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$d */
        public class C95160d extends LogStateTransitionState {
            public C95160d() {
            }

            public void enter() {
                SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$InitState");
                super.enter();
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "InitState enter, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                C101256b M = C95144m0.m121066M(C95144m0.this);
                M.getClass();
                SnsMethodCalculate.markStartTimeMs("isSupportAndroid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdDownloadApkBtnInfo");
                int i = M.f296531j0;
                boolean z = i == 0 || i == 2;
                SnsMethodCalculate.markEndTimeMs("isSupportAndroid", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdDownloadApkBtnInfo");
                if (!z) {
                    C95148d dVar = C95148d.this;
                    State state = dVar.f276184n;
                    SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar.transitionTo(state);
                    SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                } else if (AdLandingPagesProxy.getInstance().isApkExist(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                    C95148d dVar2 = C95148d.this;
                    State state2 = dVar2.f276180g;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar2.transitionTo(state2);
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                } else if (AdLandingPagesProxy.getInstance().isPkgInstalled(C95144m0.m121066M(C95144m0.this).f296529h0)) {
                    C95148d dVar3 = C95148d.this;
                    State state3 = dVar3.f276181h;
                    SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar3.transitionTo(state3);
                    SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                } else {
                    C95148d dVar4 = C95148d.this;
                    State state4 = dVar4.f276183j;
                    SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar4.transitionTo(state4);
                    SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                }
                SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$InitState");
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$e */
        public class C95161e extends LogStateTransitionState {

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$e$a */
            public class C95162a implements Runnable {
                public C95162a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState$1");
                    C95144m0.m121079d0(C95144m0.this).setVisibility(8);
                    if (!C95144m0.m121081g0(C95144m0.this)) {
                        C95144m0.m121080e0(C95144m0.this).setVisibility(0);
                    }
                    C95144m0.m121080e0(C95144m0.this).setText(C0966R.string.j9z);
                    C95144m0 m0Var = C95144m0.this;
                    C99525b0.m129881d(m0Var.f276579d, C95144m0.m121066M(m0Var), C95144m0.m121080e0(C95144m0.this));
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState$1");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$e$b */
            public class C95163b implements DialogInterface.OnClickListener {
                public C95163b() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState$2");
                    C95148d.this.sendMessage(12);
                    C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), 1, 1, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
                    C99552l.m129931g(new C102239c(C95144m0.m121071R(C95144m0.this), C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this), 102));
                    ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "AdLandingPageDownloadApkBtnComp_PAUSE_MSG_BTN_CLICK", C95161e.this.hashCode());
                    SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState$2");
                }
            }

            public C95161e() {
            }

            public void enter() {
                SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
                super.enter();
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "PauseState enter, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                MMHandlerThread.postToMainThread(new C95162a());
                SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
            }

            public boolean processMessage(Message message) {
                Message message2 = message;
                SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "PauseState, msg=" + message2.what + ", idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append("[PauseState] recv msg.what ");
                sb.append(message2.what);
                Log.m105924i(LogStateTransitionState.TAG, sb.toString());
                int i = message2.what;
                if (i == 0) {
                    if (AdLandingPagesProxy.getInstance().isDownloading(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                        C95148d dVar = C95148d.this;
                        C95148d.m121092e(dVar, C95144m0.this.f276579d.getString(C0966R.string.j9w));
                    } else if (C95144m0.m121078c0(C95144m0.this)) {
                        Log.m105924i(LogStateTransitionState.TAG, "download not in wifi!");
                        C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), 0, 1, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
                        C99552l.m129932h(new C102239c(C95144m0.m121071R(C95144m0.this), C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this), 102));
                        C76879j.m92743n(C95144m0.this.f276579d, C0966R.string.lfa, C0966R.string.lfb, new C95163b(), (DialogInterface.OnClickListener) null);
                    } else {
                        int i2 = C95144m0.m121066M(C95144m0.this).f296545x0;
                        Log.m105924i("MicroMsg.AdLandingPageDownloadApkBtnComp.GroceryDownload", "showDownloadTip = " + i2);
                        if (i2 == 1) {
                            C95148d.m121093k(C95148d.this, 1);
                        } else {
                            C95148d.this.sendMessage(12);
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
                    return true;
                } else if (i == 3) {
                    C95148d dVar2 = C95148d.this;
                    State state = dVar2.f276181h;
                    SnsMethodCalculate.markStartTimeMs("access$5000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar2.transitionTo(state);
                    SnsMethodCalculate.markEndTimeMs("access$5000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
                    return true;
                } else if (i == 8) {
                    C95148d dVar3 = C95148d.this;
                    C95148d.m121092e(dVar3, C95144m0.this.f276579d.getString(C0966R.string.j_0));
                    C95148d dVar4 = C95148d.this;
                    State state2 = dVar4.f276182i;
                    SnsMethodCalculate.markStartTimeMs("access$5100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar4.transitionTo(state2);
                    SnsMethodCalculate.markEndTimeMs("access$5100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
                    return true;
                } else if (i == 12) {
                    C95148d dVar5 = C95148d.this;
                    State state3 = dVar5.f276177d;
                    SnsMethodCalculate.markStartTimeMs("access$5200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar5.transitionTo(state3);
                    SnsMethodCalculate.markEndTimeMs("access$5200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
                    return true;
                } else if (i != 13) {
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
                    return false;
                } else {
                    C95148d dVar6 = C95148d.this;
                    State state4 = dVar6.f276177d;
                    SnsMethodCalculate.markStartTimeMs("access$5300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar6.transitionTo(state4);
                    SnsMethodCalculate.markEndTimeMs("access$5300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$PauseState");
                    return true;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$f */
        public class C95164f extends LogStateTransitionState {

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$f$a */
            public class C95165a implements Runnable {
                public C95165a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ReDownloadState$1");
                    C95144m0.m121079d0(C95144m0.this).setVisibility(8);
                    if (!C95144m0.m121081g0(C95144m0.this)) {
                        C95144m0.m121080e0(C95144m0.this).setVisibility(0);
                    }
                    C95144m0.m121080e0(C95144m0.this).setText(C0966R.string.j_6);
                    C95144m0 m0Var = C95144m0.this;
                    C99525b0.m129881d(m0Var.f276579d, C95144m0.m121066M(m0Var), C95144m0.m121080e0(C95144m0.this));
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ReDownloadState$1");
                }
            }

            public C95164f() {
            }

            public void enter() {
                SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ReDownloadState");
                super.enter();
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "ReDownloadState enter, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                MMHandlerThread.postToMainThread(new C95165a());
                SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ReDownloadState");
            }

            public boolean processMessage(Message message) {
                SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ReDownloadState");
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "ReDownloadState, msg=" + message.what + ", idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append("[ReDownloadState] recv msg.what ");
                sb.append(message.what);
                Log.m105924i(LogStateTransitionState.TAG, sb.toString());
                if (message.what != 0) {
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ReDownloadState");
                    return false;
                }
                C95144m0.m121068O(C95144m0.this, 2);
                C95148d dVar = C95148d.this;
                State state = dVar.f276183j;
                SnsMethodCalculate.markStartTimeMs("access$6100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                dVar.transitionTo(state);
                SnsMethodCalculate.markEndTimeMs("access$6100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                C115669n.INSTANCE.mo175911u(1958, 17);
                SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ReDownloadState");
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g */
        public class C95166g extends LogStateTransitionState {

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$a */
            public class C95167a implements Runnable {
                public C95167a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$1");
                    C95144m0 m0Var = C95144m0.this;
                    SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                    C95178e eVar = m0Var.f276169z;
                    SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                    if (eVar == null) {
                        C95144m0 m0Var2 = C95144m0.this;
                        C95178e eVar2 = new C95178e((C95145a) null);
                        SnsMethodCalculate.markStartTimeMs("access$902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                        m0Var2.f276169z = eVar2;
                        SnsMethodCalculate.markEndTimeMs("access$902", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                        intentFilter.addDataScheme("package");
                        C95144m0 m0Var3 = C95144m0.this;
                        Context context = m0Var3.f276579d;
                        SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                        C95178e eVar3 = m0Var3.f276169z;
                        SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
                        context.registerReceiver(eVar3, intentFilter);
                    }
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$1");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$b */
            public class C95168b implements Runnable {
                public C95168b() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$2");
                    C95144m0.m121079d0(C95144m0.this).setVisibility(8);
                    if (!C95144m0.m121081g0(C95144m0.this)) {
                        C95144m0.m121080e0(C95144m0.this).setVisibility(0);
                    }
                    C95144m0.m121080e0(C95144m0.this).setText(C95144m0.m121066M(C95144m0.this).f296714z);
                    C95144m0 m0Var = C95144m0.this;
                    C99525b0.m129881d(m0Var.f276579d, C95144m0.m121066M(m0Var), C95144m0.m121080e0(C95144m0.this));
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$2");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$c */
            public class C95169c implements Runnable {

                /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$c$a */
                public class C95170a implements DialogInterface.OnClickListener {
                    public C95170a() {
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$3$1");
                        C95144m0.m121068O(C95144m0.this, 1);
                        C95144m0.m121065K(C95144m0.this).sendMessage(0);
                        C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), 1, 0, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
                        C99552l.m129931g(new C102239c(C95144m0.m121071R(C95144m0.this), C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this), 101));
                        C115669n.INSTANCE.mo175911u(1958, 20);
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$3$1");
                    }
                }

                public C95169c() {
                }

                public void run() {
                    String string;
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$3");
                    try {
                        C115669n.INSTANCE.mo175911u(1958, 19);
                        double d = (double) ((((float) C95144m0.m121066M(C95144m0.this).f296526e0) / 1024.0f) / 1024.0f);
                        if (Util.isNullOrNil(C95144m0.m121066M(C95144m0.this).f296528g0)) {
                            string = C95144m0.this.f276579d.getString(C0966R.string.j9c);
                        } else if (d > 0.0d) {
                            String format = String.format("%.1f", new Object[]{Double.valueOf(d)});
                            C95144m0 m0Var = C95144m0.this;
                            string = m0Var.f276579d.getString(C0966R.string.j9e, new Object[]{C95144m0.m121066M(m0Var).f296528g0, format});
                        } else {
                            C95144m0 m0Var2 = C95144m0.this;
                            string = m0Var2.f276579d.getString(C0966R.string.j9d, new Object[]{C95144m0.m121066M(m0Var2).f296528g0});
                        }
                        String str = string;
                        C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), 0, 0, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
                        C99552l.m129932h(new C102239c(C95144m0.m121071R(C95144m0.this), C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this), 1, 101));
                        C76879j.m92707A(C95144m0.this.f276579d, str, "", "是", "否", new C95170a(), (DialogInterface.OnClickListener) null);
                    } catch (Exception e) {
                        Log.m105920e(LogStateTransitionState.TAG, "showAutoDownloadDialog exp=" + e.toString());
                    }
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$3");
                }
            }

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$d */
            public class C95171d implements Runnable {

                /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$d$a */
                public class C95172a implements DialogInterface.OnClickListener {
                    public C95172a() {
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$4$1");
                        C95144m0.m121065K(C95144m0.this).sendMessage(12);
                        C99552l.m129931g(new C102239c(C95144m0.m121071R(C95144m0.this), C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this), 102));
                        C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), 1, 0, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
                        ((C77570i) C86312j.m106911c(C77570i.class)).mo107725zI(10, "AdLandingPageDownloadApkBtnComp_TODOWLOAD_MSG_BTN_CLICK", C95166g.this.hashCode());
                        C115669n.INSTANCE.mo175911u(1958, 22);
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$4$1");
                    }
                }

                /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$d$b */
                public class C95173b implements DialogInterface.OnClickListener {
                    public C95173b() {
                    }

                    public void onClick(DialogInterface dialogInterface, int i) {
                        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$4$2");
                        C95144m0.m121068O(C95144m0.this, 2);
                        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$4$2");
                    }
                }

                public C95171d() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$4");
                    if (C95144m0.m121078c0(C95144m0.this)) {
                        C115669n.INSTANCE.mo175911u(1958, 21);
                        Log.m105924i(LogStateTransitionState.TAG, "download not in wifi!");
                        C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), 0, 0, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
                        C99552l.m129932h(new C102239c(C95144m0.m121071R(C95144m0.this), C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this), C95144m0.m121067N(C95144m0.this), 102));
                        C76879j.m92743n(C95144m0.this.f276579d, C0966R.string.lfa, C0966R.string.lfb, new C95172a(), new C95173b());
                    } else {
                        int i = C95144m0.m121066M(C95144m0.this).f296545x0;
                        Log.m105924i("MicroMsg.AdLandingPageDownloadApkBtnComp.GroceryDownload", "showDownloadTip = " + i);
                        if (i != 1) {
                            C95144m0.m121065K(C95144m0.this).sendMessage(12);
                        } else if (AdLandingPagesProxy.getInstance().isPaused(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                            C95148d.m121093k(C95148d.this, 1);
                        } else {
                            C95148d.m121093k(C95148d.this, 0);
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState$4");
                }
            }

            public C95166g() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:22:0x0121  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void enter() {
                /*
                    r11 = this;
                    java.lang.String r0 = "enter"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    super.enter()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "ToDownloadState enter, idx="
                    r2.append(r3)
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    qs2.b r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.m121066M(r3)
                    int r3 = r3.f296543v0
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "MicroMsg.AdLandingPageDownloadApkBtnComp.state"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r2)
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$a r2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$a
                    r2.<init>()
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r2 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    qs2.b r3 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.m121066M(r3)
                    java.lang.String r3 = r3.f296529h0
                    boolean r2 = r2.isPkgInstalled(r3)
                    java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine"
                    if (r2 == 0) goto L_0x0059
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.sdk.statemachine.State r4 = r2.f276181h
                    java.lang.String r5 = "access$1100"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
                    r2.transitionTo(r4)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
                    goto L_0x01ab
                L_0x0059:
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r2 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    qs2.b r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.m121066M(r4)
                    java.lang.String r4 = r4.f296523b0
                    boolean r2 = r2.isApkExist(r4)
                    if (r2 == 0) goto L_0x007e
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.sdk.statemachine.State r4 = r2.f276180g
                    java.lang.String r5 = "access$1200"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
                    r2.transitionTo(r4)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
                    goto L_0x01ab
                L_0x007e:
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r2 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    qs2.b r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.m121066M(r4)
                    java.lang.String r4 = r4.f296523b0
                    boolean r2 = r2.isDownloading(r4)
                    if (r2 == 0) goto L_0x00a3
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.sdk.statemachine.State r4 = r2.f276177d
                    java.lang.String r5 = "access$1300"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
                    r2.transitionTo(r4)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
                    goto L_0x01ab
                L_0x00a3:
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r2 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    qs2.b r4 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.m121066M(r4)
                    java.lang.String r4 = r4.f296523b0
                    boolean r2 = r2.isPaused(r4)
                    if (r2 == 0) goto L_0x00c8
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.sdk.statemachine.State r4 = r2.f276179f
                    java.lang.String r5 = "access$1400"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
                    r2.transitionTo(r4)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
                    goto L_0x01ab
                L_0x00c8:
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$b r2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$b
                    r2.<init>()
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r2)
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    r3 = 2
                    com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.m121068O(r2, r3)
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    java.lang.String r3 = "access$1600"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    boolean r2 = r2.f276148A
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    r3 = 1
                    r5 = 0
                    if (r2 == 0) goto L_0x011e
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    qs2.i0 r2 = r2.mo131854m()
                    r2.getClass()
                    java.lang.String r6 = "hasFloatBar"
                    java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageData"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
                    boolean r2 = r2.f296626k
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
                    if (r2 == 0) goto L_0x0110
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    qs2.b r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.m121066M(r2)
                    boolean r2 = r2.f296544w0
                    goto L_0x011f
                L_0x0110:
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    qs2.b r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.m121066M(r2)
                    int r2 = r2.f296543v0
                    if (r2 != 0) goto L_0x011e
                    r2 = 1
                    goto L_0x011f
                L_0x011e:
                    r2 = 0
                L_0x011f:
                    if (r2 == 0) goto L_0x01ab
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    java.lang.String r6 = "access$1700"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
                    boolean r2 = r2.f276149B
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
                    if (r2 == 0) goto L_0x01ab
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    java.lang.String r6 = "access$1800"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
                    r2.getClass()
                    java.lang.String r2 = "MicroMsg.AdLandingPageDownloadApkBtnComp"
                    java.lang.String r7 = "isExptAutoDownload"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
                    java.lang.Class<h81.h> r8 = h81.C32735h.class
                    di3.d r8 = di3.C86312j.m106911c(r8)     // Catch:{ all -> 0x0170 }
                    h81.h r8 = (h81.C32735h) r8     // Catch:{ all -> 0x0170 }
                    h81.h$c r9 = h81.C32735h.C32737c.clicfg_ad_landingpage_auto_download     // Catch:{ all -> 0x0170 }
                    int r8 = r8.mo58779Qe(r9, r3)     // Catch:{ all -> 0x0170 }
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
                    r9.<init>()     // Catch:{ all -> 0x0170 }
                    java.lang.String r10 = "isExptAutoDownload, expt="
                    r9.append(r10)     // Catch:{ all -> 0x0170 }
                    r9.append(r8)     // Catch:{ all -> 0x0170 }
                    java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0170 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)     // Catch:{ all -> 0x0170 }
                    if (r8 <= 0) goto L_0x016b
                    goto L_0x016c
                L_0x016b:
                    r3 = 0
                L_0x016c:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
                    goto L_0x018e
                L_0x0170:
                    r3 = move-exception
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r9 = "isExptAutoDownload, exp="
                    r8.append(r9)
                    java.lang.String r3 = r3.toString()
                    r8.append(r3)
                    java.lang.String r3 = r8.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
                    r3 = 0
                L_0x018e:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
                    if (r3 == 0) goto L_0x01ab
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.this
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0 r2 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.this
                    java.lang.String r3 = "access$1702"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    r2.f276149B = r5
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$c r2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$g$c
                    r2.<init>()
                    r3 = 800(0x320, double:3.953E-321)
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r2, r3)
                L_0x01ab:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95144m0.C95148d.C95166g.enter():void");
            }

            public boolean processMessage(Message message) {
                SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState");
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "ToDownloadState, msg=" + message.what + ", idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append("[ToDownloadState]recv msg.what ");
                sb.append(message.what);
                Log.m105924i(LogStateTransitionState.TAG, sb.toString());
                int i = message.what;
                if (i == 0) {
                    if (AdLandingPagesProxy.getInstance().isDownloading(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                        C95148d dVar = C95148d.this;
                        C95148d.m121092e(dVar, C95144m0.this.f276579d.getString(C0966R.string.j9w));
                    } else {
                        MMHandlerThread.postToMainThread(new C95171d());
                    }
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState");
                    return true;
                } else if (i == 3) {
                    C95148d dVar2 = C95148d.this;
                    State state = dVar2.f276181h;
                    SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar2.transitionTo(state);
                    SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState");
                    return true;
                } else if (i == 11) {
                    C95148d dVar3 = C95148d.this;
                    State state2 = dVar3.f276178e;
                    SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar3.transitionTo(state2);
                    SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState");
                    return true;
                } else if (i != 12) {
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState");
                    return false;
                } else {
                    C95148d dVar4 = C95148d.this;
                    State state3 = dVar4.f276177d;
                    SnsMethodCalculate.markStartTimeMs("access$3300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar4.transitionTo(state3);
                    SnsMethodCalculate.markEndTimeMs("access$3300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToDownloadState");
                    return true;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$h */
        public class C95174h extends LogStateTransitionState {

            /* renamed from: d */
            public boolean f276216d;

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$h$a */
            public class C95175a implements Runnable {
                public C95175a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState$1");
                    C95144m0.m121079d0(C95144m0.this).setVisibility(8);
                    if (!C95144m0.m121081g0(C95144m0.this)) {
                        C95144m0.m121080e0(C95144m0.this).setVisibility(0);
                    }
                    C95144m0.m121080e0(C95144m0.this).setText(C0966R.string.j_1);
                    C95144m0 m0Var = C95144m0.this;
                    C99525b0.m129881d(m0Var.f276579d, C95144m0.m121066M(m0Var), C95144m0.m121080e0(C95144m0.this));
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState$1");
                }
            }

            public C95174h() {
            }

            public void enter() {
                SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "ToInstallState enter, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                super.enter();
                if (!AdLandingPagesProxy.getInstance().isApkExist(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                    C95148d dVar = C95148d.this;
                    State state = dVar.f276178e;
                    SnsMethodCalculate.markStartTimeMs("access$5400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar.transitionTo(state);
                    SnsMethodCalculate.markEndTimeMs("access$5400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
                    return;
                }
                MMHandlerThread.postToMainThread(new C95175a());
                this.f276216d = true;
                SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
            }

            public boolean processMessage(Message message) {
                SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "ToInstallState, msg=" + message.what + ", idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append("[ToInstallState] recv msg.what ");
                sb.append(message.what);
                Log.m105924i(LogStateTransitionState.TAG, sb.toString());
                int i = message.what;
                if (i == 0) {
                    C115669n.INSTANCE.mo175911u(1958, 16);
                    AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
                    C95144m0 m0Var = C95144m0.this;
                    if (instance.installApp(m0Var.f276579d, C95144m0.m121066M(m0Var).f296523b0, C95144m0.m121066M(C95144m0.this).f296529h0, C95144m0.m121066M(C95144m0.this).f296522a0, C95144m0.m121066M(C95144m0.this).f296521Z)) {
                        this.f276216d = true;
                        SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
                        return true;
                    }
                    C95148d dVar = C95148d.this;
                    C95148d.m121092e(dVar, C95144m0.this.f276579d.getString(C0966R.string.j_2));
                    C95148d dVar2 = C95148d.this;
                    State state = dVar2.f276182i;
                    SnsMethodCalculate.markStartTimeMs("access$5500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar2.transitionTo(state);
                    SnsMethodCalculate.markEndTimeMs("access$5500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
                    return true;
                } else if (i == 2) {
                    if (!AdLandingPagesProxy.getInstance().isApkExist(C95144m0.m121066M(C95144m0.this).f296523b0)) {
                        C95148d dVar3 = C95148d.this;
                        State state2 = dVar3.f276178e;
                        SnsMethodCalculate.markStartTimeMs("access$5600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                        dVar3.transitionTo(state2);
                        SnsMethodCalculate.markEndTimeMs("access$5600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    }
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
                    return true;
                } else if (i != 3) {
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
                    return false;
                } else {
                    if (this.f276216d) {
                        this.f276216d = false;
                    }
                    C95148d dVar4 = C95148d.this;
                    State state3 = dVar4.f276181h;
                    SnsMethodCalculate.markStartTimeMs("access$5700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar4.transitionTo(state3);
                    SnsMethodCalculate.markEndTimeMs("access$5700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToInstallState");
                    return true;
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$i */
        public class C95176i extends LogStateTransitionState {

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$d$i$a */
            public class C95177a implements Runnable {
                public C95177a() {
                }

                public void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState$1");
                    C95144m0.m121079d0(C95144m0.this).setVisibility(8);
                    if (!C95144m0.m121081g0(C95144m0.this)) {
                        C95144m0.m121080e0(C95144m0.this).setVisibility(0);
                    }
                    if (Util.isNullOrNil(C95144m0.m121066M(C95144m0.this).f296520A0)) {
                        C95144m0.m121080e0(C95144m0.this).setText(C0966R.string.j_4);
                    } else {
                        C95144m0.m121080e0(C95144m0.this).setText(C95144m0.m121066M(C95144m0.this).f296520A0);
                    }
                    C95144m0 m0Var = C95144m0.this;
                    C99525b0.m129881d(m0Var.f276579d, C95144m0.m121066M(m0Var), C95144m0.m121080e0(C95144m0.this));
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState$1");
                }
            }

            public C95176i() {
            }

            public void enter() {
                SnsMethodCalculate.markStartTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
                super.enter();
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "ToOpenState enter, idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                if (AdLandingPagesProxy.getInstance().isPkgInstalled(C95144m0.m121066M(C95144m0.this).f296529h0)) {
                    MMHandlerThread.postToMainThread(new C95177a());
                } else {
                    C95148d dVar = C95148d.this;
                    State state = dVar.f276180g;
                    SnsMethodCalculate.markStartTimeMs("access$5800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar.transitionTo(state);
                    SnsMethodCalculate.markEndTimeMs("access$5800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                }
                SnsMethodCalculate.markEndTimeMs("enter", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
            }

            public boolean processMessage(Message message) {
                Message message2 = message;
                SnsMethodCalculate.markStartTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
                Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "ToOpenState, msg=" + message2.what + ", idx=" + C95144m0.m121066M(C95144m0.this).f296543v0);
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode());
                sb.append("[ToOpenState] recv msg.what ");
                sb.append(message2.what);
                Log.m105924i(LogStateTransitionState.TAG, sb.toString());
                int i = message2.what;
                if (i == 0) {
                    C115669n.INSTANCE.mo175911u(1958, 12);
                    C98961m mVar = new C98961m(C95144m0.m121073V(C95144m0.this), C95144m0.m121074W(C95144m0.this), C95144m0.m121075X(C95144m0.this), C95144m0.m121076Y(C95144m0.this), C95144m0.m121077b0(C95144m0.this));
                    C95144m0 m0Var = C95144m0.this;
                    if (C102260r.m134849R(m0Var.f276579d, C95144m0.m121066M(m0Var).f296523b0, C95144m0.m121066M(C95144m0.this).f296529h0, "", C95144m0.m121066M(C95144m0.this).f296542u0, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), C95144m0.m121069P(C95144m0.this), 1, 2, mVar)) {
                        SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
                        return true;
                    }
                    C95148d dVar = C95148d.this;
                    C95148d.m121092e(dVar, C95144m0.this.f276579d.getString(C0966R.string.j_5));
                    C95148d dVar2 = C95148d.this;
                    State state = dVar2.f276181h;
                    SnsMethodCalculate.markStartTimeMs("access$5900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar2.transitionTo(state);
                    SnsMethodCalculate.markEndTimeMs("access$5900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
                    return true;
                } else if (i != 4) {
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
                    return false;
                } else {
                    C95148d dVar3 = C95148d.this;
                    State state2 = dVar3.f276178e;
                    SnsMethodCalculate.markStartTimeMs("access$6000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    dVar3.transitionTo(state2);
                    SnsMethodCalculate.markEndTimeMs("access$6000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
                    SnsMethodCalculate.markEndTimeMs("processMessage", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$ToOpenState");
                    return true;
                }
            }
        }

        public C95148d(String str, Looper looper) {
            super(str, looper);
            addState(this.f276178e);
            addState(this.f276177d);
            addState(this.f276179f);
            addState(this.f276180g);
            addState(this.f276181h);
            addState(this.f276182i);
            addState(this.f276183j);
            addState(this.f276184n);
            addState(this.f276185o);
            setInitialState(this.f276185o);
        }

        /* renamed from: e */
        public static void m121092e(C95148d dVar, String str) {
            SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("showToast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            MMHandlerThread.postToMainThread(new C95196o0(dVar, str));
            SnsMethodCalculate.markEndTimeMs("showToast", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
        }

        /* renamed from: k */
        public static void m121093k(C95148d dVar, int i) {
            SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("showGroceryDownloadDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            MMHandlerThread.postToMainThread(new C95190n0(dVar, i));
            SnsMethodCalculate.markEndTimeMs("showGroceryDownloadDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
        }

        /* renamed from: l */
        public static String m121094l(C95148d dVar, int i, double d) {
            String str;
            SnsMethodCalculate.markStartTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("updateDialogText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            String str2 = C95144m0.m121066M(C95144m0.this).f296528g0;
            if (i != 0) {
                if (i != 1) {
                    str = "";
                } else if (Util.isNullOrNil(str2)) {
                    str = C95144m0.this.f276579d.getString(C0966R.string.j9h);
                } else {
                    str = C95144m0.this.f276579d.getString(C0966R.string.j9i, new Object[]{str2});
                }
            } else if (Util.isNullOrNil(str2)) {
                str = C95144m0.this.f276579d.getString(C0966R.string.j9c);
            } else if (d > 0.0d) {
                String format = String.format("%.1f", new Object[]{Double.valueOf(d)});
                str = C95144m0.this.f276579d.getString(C0966R.string.j9e, new Object[]{str2, format});
            } else {
                str = C95144m0.this.f276579d.getString(C0966R.string.j9d, new Object[]{str2});
            }
            SnsMethodCalculate.markEndTimeMs("updateDialogText", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            SnsMethodCalculate.markEndTimeMs("access$3400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            return str;
        }

        /* renamed from: o */
        public static void m121095o(C95148d dVar, int i, int i2) {
            SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("groceryDownloadReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            C102259p.m134831d(C95144m0.m121069P(C95144m0.this), C95144m0.m121070Q(C95144m0.this), i2, i, C95144m0.m121071R(C95144m0.this), C95144m0.m121072U(C95144m0.this), 1);
            SnsMethodCalculate.markEndTimeMs("groceryDownloadReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
            SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.m0$e */
    public class C95178e extends BroadcastReceiver implements Serializable {
        public C95178e(C95145a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            SnsMethodCalculate.markStartTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$PkgUpdateReceiver");
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                    if (!TextUtils.isEmpty(schemeSpecificPart) && schemeSpecificPart.equals(C95144m0.m121066M(C95144m0.this).f296529h0)) {
                        C95144m0.m121065K(C95144m0.this).sendMessage(3);
                    }
                } else if ("android.intent.action.PACKAGE_REMOVED".equals(action)) {
                    String schemeSpecificPart2 = intent.getData().getSchemeSpecificPart();
                    if (!TextUtils.isEmpty(schemeSpecificPart2) && schemeSpecificPart2.equals(C95144m0.m121066M(C95144m0.this).f296529h0)) {
                        C95144m0.m121065K(C95144m0.this).sendMessage(4);
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("onReceive", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$PkgUpdateReceiver");
        }
    }

    public C95144m0(Context context, C101256b bVar, ViewGroup viewGroup) {
        super(context, bVar, viewGroup);
        Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "component create, new BtnStateMachine");
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("apkStateMachine", 5);
        this.f276168y = a;
        a.start();
        this.f276167x = new C95148d("apkStateMachine", this.f276168y.getLooper());
        if (context instanceof Activity) {
            this.f276148A = ((Activity) context).getIntent().getBooleanExtra("sns_landing_pages_auto_download_for_action_btn", false);
            this.f276149B = true;
            Log.m105924i("MicroMsg.AdLandingPageDownloadApkBtnComp", "autoDownloadFromActionBtn=" + this.f276148A + ", activity=" + context + ", idx=" + mo131670i0().f296543v0 + ", appId=" + mo131670i0().f296523b0 + ", wxAppid=" + mo131670i0().f296524c0 + ", useGameDownloader=" + mo131670i0().f296527f0 + ", pkg=" + mo131670i0().f296529h0);
        }
        this.f276010t.mo90728b("platform", (long) bVar.f296531j0);
        this.f276010t.mo90729c("appid", bVar.f296523b0);
        this.f276010t.mo90729c(AssistantStore.DownloadInfos.DownloadInfoColumns.CHANNELID, bVar.f296525d0);
        this.f276010t.mo90729c("pkg", bVar.f296529h0);
        this.f276010t.mo90729c("appPageUrlAndroid", bVar.f296542u0);
        try {
            this.f276150C = Util.nullAsNil(mo131670i0().f296523b0);
            this.f276151D = Util.nullAsNil(mo131854m().mo140745l());
            this.f276152E = Util.nullAsNil(mo131854m().mo140734a());
            this.f276153F = mo131854m().mo140741h();
            this.f276155H = Util.nullAsNil(mo131854m().mo140735b());
            this.f276156I = Util.nullAsNil(mo131854m().mo140746m());
            this.f276157J = mo131854m().mo140742i();
            this.f276158K = Util.nullAsNil(mo131854m().mo140743j());
            this.f276159L = Util.nullAsNil(mo131854m().mo140737d());
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageDownloadApkBtnComp.DownloadToastReport", th.toString());
        }
    }

    /* renamed from: K */
    public static /* synthetic */ C95148d m121065K(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        C95148d dVar = m0Var.f276167x;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return dVar;
    }

    /* renamed from: M */
    public static /* synthetic */ C101256b m121066M(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        C101256b i0 = m0Var.mo131670i0();
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i0;
    }

    /* renamed from: N */
    public static /* synthetic */ int m121067N(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        int i = m0Var.f276160M;
        SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i;
    }

    /* renamed from: O */
    public static /* synthetic */ int m121068O(C95144m0 m0Var, int i) {
        SnsMethodCalculate.markStartTimeMs("access$1502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        m0Var.f276160M = i;
        SnsMethodCalculate.markEndTimeMs("access$1502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i;
    }

    /* renamed from: P */
    public static /* synthetic */ String m121069P(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        String str = m0Var.f276153F;
        SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: Q */
    public static /* synthetic */ String m121070Q(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        String str = m0Var.f276150C;
        SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: R */
    public static /* synthetic */ String m121071R(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        String str = m0Var.f276151D;
        SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: U */
    public static /* synthetic */ String m121072U(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        String str = m0Var.f276152E;
        SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: V */
    public static /* synthetic */ String m121073V(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        String str = m0Var.f276159L;
        SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: W */
    public static /* synthetic */ int m121074W(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        int i = m0Var.f276157J;
        SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return i;
    }

    /* renamed from: X */
    public static /* synthetic */ String m121075X(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        String str = m0Var.f276155H;
        SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: Y */
    public static /* synthetic */ String m121076Y(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        String str = m0Var.f276158K;
        SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: b0 */
    public static /* synthetic */ String m121077b0(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        String str = m0Var.f276156I;
        SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: c0 */
    public static boolean m121078c0(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        m0Var.getClass();
        SnsMethodCalculate.markStartTimeMs("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        boolean z = false;
        try {
            boolean isWifi = NetStatusUtil.isWifi(m0Var.f276579d);
            SnsMethodCalculate.markStartTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            boolean isFreeSimCard = AdLandingPagesProxy.getInstance().isFreeSimCard();
            SnsMethodCalculate.markEndTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            Log.m105924i("MicroMsg.AdLandingPageDownloadApkBtnComp", "isNeedShowNetworkTip, isWifi=" + isWifi + ", isFreeSimCard=" + isFreeSimCard);
            if (isWifi) {
                C115669n.INSTANCE.mo175911u(1612, 2);
            } else if (isFreeSimCard) {
                C115669n.INSTANCE.mo175911u(1612, 3);
            } else {
                C115669n.INSTANCE.mo175911u(1612, 4);
            }
            if (!isWifi && !isFreeSimCard) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.AdLandingPageDownloadApkBtnComp", "isNeedShowNetworkTip exp=" + th.toString());
            SnsMethodCalculate.markEndTimeMs("isNeedShowNetworkTip", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        }
        SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return z;
    }

    /* renamed from: d0 */
    public static /* synthetic */ SnsTextProgressBar m121079d0(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        SnsTextProgressBar snsTextProgressBar = m0Var.f276166w;
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return snsTextProgressBar;
    }

    /* renamed from: e0 */
    public static /* synthetic */ Button m121080e0(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        Button button = m0Var.f276165v;
        SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return button;
    }

    /* renamed from: g0 */
    public static /* synthetic */ boolean m121081g0(C95144m0 m0Var) {
        SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        boolean z = m0Var.f276154G;
        SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return z;
    }

    /* renamed from: B */
    public void mo124360B() {
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        super.mo124360B();
        Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "viewWillAppear, sendMsg=2");
        this.f276167x.sendMessage(2);
        AdLandingPagesProxy.getInstance().addReportInfo(mo131670i0().f296523b0, mo131854m().mo140735b(), mo131854m().mo140743j(), mo131854m().mo140745l(), new C95147c(this.f276159L, this.f276157J, this.f276152E, this.f276156I, this.f276160M));
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        super.mo67235C();
        Log.m105924i("MicroMsg.AdLandingPageDownloadApkBtnComp", "view destroy");
        this.f276168y.quit();
        C95178e eVar = this.f276169z;
        if (eVar != null) {
            this.f276579d.unregisterReceiver(eVar);
            this.f276169z = null;
        }
        C115669n.INSTANCE.mo175913w(1958, 33, (long) mo131851j());
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    /* renamed from: e */
    public void mo67238e() {
        SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        mo131615I(0);
        View view = this.f276586n;
        this.f276164u = view.findViewById(C0966R.C0970id.c_o);
        Button button = (Button) view.findViewById(C0966R.C0970id.c9o);
        this.f276165v = button;
        button.setOnClickListener(this.f276162P);
        SnsTextProgressBar snsTextProgressBar = (SnsTextProgressBar) view.findViewById(C0966R.C0970id.c_b);
        this.f276166w = snsTextProgressBar;
        snsTextProgressBar.setProgress(0);
        this.f276166w.setVisibility(8);
        this.f276166w.setOnClickListener(this.f276162P);
        Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "createView, BtnStateMachine start");
        this.f276167x.start();
        SnsMethodCalculate.markStartTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        try {
            C101256b i0 = mo131670i0();
            if (i0.f296546y0 > 0) {
                if (C91098a.m114281e(i0.f296547z0)) {
                    C95217u.m121172h0(mo131854m(), 4, "0", "");
                } else {
                    C95217u.m121172h0(mo131854m(), 4, "1", "");
                }
                C95217u.m121172h0(mo131854m(), 1, "1", "");
            }
        } catch (Exception unused) {
            Log.m105928w("MicroMsg.AdLandingPageDownloadApkBtnComp", "report19790 has something wrong");
        }
        SnsMethodCalculate.markEndTimeMs("report19790", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
    }

    /* renamed from: g */
    public void mo67240g() {
        int i;
        SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        SnsMethodCalculate.markStartTimeMs("configDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        SnsMethodCalculate.markStartTimeMs("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        HashMap hashMap = new HashMap();
        hashMap.put("fontNormalColor", mo131671k0(mo131670i0().f296539r0, "#FFFFFF"));
        hashMap.put("fontDisableColor", mo131671k0(mo131670i0().f296540s0, "#4CFFFFFF"));
        hashMap.put("fontPressedColor", mo131671k0(mo131670i0().f296541t0, "#99FFFFFF"));
        hashMap.put("NormalColor", mo131671k0(mo131670i0().f296533l0, "#1AAD19"));
        hashMap.put("PressedColor", mo131671k0(mo131670i0().f296535n0, "#179B16"));
        hashMap.put("DisableColor", mo131671k0(mo131670i0().f296534m0, "#661AAD19"));
        hashMap.put("borderNormalColor", mo131671k0(mo131670i0().f296536o0, "#179E16"));
        hashMap.put("borderPressedColor", mo131671k0(mo131670i0().f296538q0, "#158E14"));
        hashMap.put("borderDisableColor", mo131671k0(mo131670i0().f296537p0, "#00179E16"));
        SnsMethodCalculate.markEndTimeMs("presetDownloadBtnStyles", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        int parseColor = Color.parseColor((String) hashMap.get("fontNormalColor"));
        int parseColor2 = Color.parseColor((String) hashMap.get("fontDisableColor"));
        int parseColor3 = Color.parseColor((String) hashMap.get("fontPressedColor"));
        int parseColor4 = Color.parseColor((String) hashMap.get("NormalColor"));
        int parseColor5 = Color.parseColor((String) hashMap.get("PressedColor"));
        int parseColor6 = Color.parseColor((String) hashMap.get("DisableColor"));
        int i2 = (int) mo131670i0().f296693E;
        int parseColor7 = Color.parseColor((String) hashMap.get("borderNormalColor"));
        int parseColor8 = Color.parseColor((String) hashMap.get("borderPressedColor"));
        int parseColor9 = Color.parseColor((String) hashMap.get("borderDisableColor"));
        int dimensionPixelSize = this.f276579d.getResources().getDimensionPixelSize(C0966R.dimen.f3642a0);
        if (mo131670i0().f296706R > 0.0f) {
            dimensionPixelSize = (int) mo131670i0().f296706R;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        String str = "fillItem";
        gradientDrawable.setShape(0);
        float f = (float) dimensionPixelSize;
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(parseColor6);
        gradientDrawable.setStroke(i2, parseColor9);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(f);
        gradientDrawable2.setColor(parseColor5);
        gradientDrawable2.setStroke(i2, parseColor8);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(f);
        gradientDrawable3.setColor(parseColor4);
        gradientDrawable3.setStroke(i2, parseColor7);
        StateListDrawable stateListDrawable = new StateListDrawable();
        String str2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp";
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable);
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable3);
        this.f276165v.setBackground(stateListDrawable);
        int[] iArr = {parseColor2, parseColor3, parseColor};
        this.f276165v.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842919}, new int[]{16842910}}, iArr));
        if (mo131670i0().f296692D > 0.0f) {
            i = 0;
            this.f276165v.setTextSize(0, mo131670i0().f296692D);
        } else {
            i = 0;
        }
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setShape(i);
        gradientDrawable4.setCornerRadius(f);
        gradientDrawable4.setColor(parseColor5);
        gradientDrawable4.setStroke(i2, parseColor8);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setShape(i);
        gradientDrawable5.setCornerRadius(f);
        gradientDrawable5.setColor(parseColor4);
        ClipDrawable clipDrawable = new ClipDrawable(gradientDrawable5, 3, 1);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setShape(i);
        gradientDrawable6.setCornerRadius(f);
        gradientDrawable6.setColor(parseColor4);
        ClipDrawable clipDrawable2 = new ClipDrawable(gradientDrawable6, 3, 1);
        Drawable[] drawableArr = new Drawable[3];
        drawableArr[i] = gradientDrawable4;
        drawableArr[1] = clipDrawable;
        drawableArr[2] = clipDrawable2;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        layerDrawable.setId(i, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.f276166w.setProgressDrawable(layerDrawable);
        this.f276166w.setPaintColor(mo131670i0().f296541t0);
        String str3 = str2;
        SnsMethodCalculate.markEndTimeMs("configDownloadBtnStyles", str3);
        if (mo131670i0().f296508n > 0.0f) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f276164u.getLayoutParams();
            layoutParams.height = (int) mo131670i0().f296508n;
            this.f276164u.setLayoutParams(layoutParams);
        }
        this.f276165v.setText(mo131670i0().f296714z);
        C99525b0.m129881d(this.f276579d, mo131670i0(), this.f276165v);
        Log.m105918d("MicroMsg.AdLandingPageDownloadApkBtnComp.state", "fillItem, sendMsg=11");
        this.f276167x.sendMessage(11);
        SnsMethodCalculate.markEndTimeMs(str, str3);
    }

    /* renamed from: h0 */
    public Button mo131669h0() {
        SnsMethodCalculate.markStartTimeMs("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        Button button = this.f276165v;
        SnsMethodCalculate.markEndTimeMs("getBtn", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return button;
    }

    /* renamed from: i0 */
    public final C101256b mo131670i0() {
        SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        C101256b bVar = (C101256b) this.f276580e;
        SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return bVar;
    }

    /* renamed from: k0 */
    public final String mo131671k0(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            return str2;
        }
        if (!str.matches("#[0-9A-Fa-f]{6}([0-9A-Fa-f]{2})?")) {
            str = str2;
        }
        SnsMethodCalculate.markEndTimeMs("validColorDefaultAs", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return str;
    }

    /* renamed from: n */
    public int mo118819n() {
        SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        if (this.f276161N) {
            SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
            return C0966R.C0971layout.ctz;
        }
        SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp");
        return C0966R.C0971layout.c0n;
    }
}
