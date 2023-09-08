package com.tencent.p014mm.plugin.finder.live.view;

import a14.C53930o0;
import ak1.C0073g0;
import ak1.C54108o;
import al1.C54127h;
import al1.C54130j;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import b50.C54410e;
import b50.C54421g;
import b50.C54424j;
import bl3.C39818r;
import ci1.C39952a;
import cj1.C54757f4;
import cj1.C54773i5;
import cj1.C54792m4;
import cj1.C54795n5;
import cj1.C54847z3;
import cl1.C39981t0;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C54997r;
import cl1.C55001u;
import cl1.C55002v;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.view.BaseLivePluginLayout;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import d50.C58111e;
import d60.C58121a;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dk1.C58312g;
import dp1.C58393n0;
import dp1.C58396o0;
import dp1.C58397p0;
import er1.C58713e5;
import er1.C58730g5;
import er1.C58739j4;
import er1.C7919x;
import f40.C86709a0;
import fh1.C59079s2;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gg1.C32444a;
import gh1.C59441d;
import gh1.C59442e;
import gh1.C59443f;
import gh1.C59444g;
import gh1.C59445h;
import gh1.C59447j;
import gh1.C59452m;
import gh1.C59454q;
import gh1.C59455r;
import gh1.C59456s;
import gh1.C59457t;
import gh1.C59458u;
import gh1.C59459v;
import gh1.C8321l;
import gh1.C8323o;
import gi1.C32458d;
import gi1.C32459e;
import gi1.C59463a;
import gi1.C59464c;
import gi1.C59465f;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hh1.C59897d;
import ht1.C60200t1;
import ht1.C8777j5;
import i72.C98607d;
import ig1.C33319f;
import ii1.C60290d;
import ii1.C60291e;
import ij1.C60298a;
import ij1.C60299b;
import ik1.C33343g;
import il1.C46261j6;
import il1.C60351b9;
import il1.C60357c5;
import il1.C60385d5;
import il1.C60391e5;
import il1.C8976f5;
import il1.C8992g5;
import il1.C9015h5;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ky2.C10432i;
import l60.C99342a;
import l60.C99344b;
import ll1.C61304a;
import mi1.C61482c;
import nj3.C76912y0;
import o40.C61926c;
import ok1.C62042e;
import org.json.JSONArray;
import org.json.JSONObject;
import p165hr.C60106t;
import p204mr.C34647n;
import p50.C62197e;
import p625nu.C61901d;
import p625nu.C61903f;
import pe3.C89349b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import pt1.C35640b;
import qj1.C62660c;
import qo3.C12925w;
import qo3.C47883u;
import qo3.C77398g;
import qo3.C77426q;
import qo3.w$$d;
import rl1.C13022d0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C26236u;
import te3.C49372f31;
import te3.C49765hx0;
import te3.C50593nu0;
import te3.C52013xs0;
import te3.C64273c21;
import te3.C64370fp1;
import te3.C64429ht0;
import te3.C64510l21;
import te3.C64698s41;
import up1.C27696y;
import w50.C53075a;
import y50.C38964c;
import y50.C38965d;
import y50.C38966e;
import y50.C38970o0;
import y50.C66505a;
import y50.C66507b;
import y50.C66512f;
import y50.C66517i0;
import y50.C66521k0;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.finder.live.view.b */
public abstract class C56032b extends BaseLivePluginLayout implements C3206b2, C61901d.C61902a, C60298a, C0125s {
    public static final C56033a Companion;
    /* access modifiers changed from: private */
    public static final String TAG;
    private final long CLEAR_RECOVERY_SCREEN_DURATION;
    private final C55908a activityScope;
    private C77398g alertDialog;
    private boolean audienPreloadCDNLiveConfig;
    /* access modifiers changed from: private */
    public C12925w bottomSheet;
    public C45795b buContext;
    private boolean checkMiniWin;
    private final ViewGroup commonTopContentRoot;
    private C61304a confettiBitmapManager;
    private int curNetworkQuality;
    private int curNetworkType;
    private String currentAppId = "";
    private JSONObject currentMicData;
    public C54127h data;
    private final C13601g emptyReuseFrameLayout$delegate;
    private C3204b externalCallback;
    private boolean finishActivityNotReleaseLive;
    private boolean isManualClosed;
    private boolean isScreenClear;
    private int lastLiveState;
    /* access modifiers changed from: private */
    public LinkedList<C59463a> lastMicCoverData;
    private JSONObject lastMicData;
    private final ArrayList<C54130j> lastMicUserList;
    private int lastOrientation;
    private C54130j lastPkMicUser;
    private JSONArray lastRoomPkMicUserList;
    private C32458d lastSEIMicCoverData;
    private int lastUIState;
    private final C13601g lazyInitPluginMap$delegate = C36568h.m40985a(C56040i.f159847d);
    private C103766u lifeCycleRegistry;
    private final C60357c5 loadingTipWidget;
    private boolean miniWinPermission;
    private final C56042k onNetworkChange;
    private C61901d orientationEventListener;
    private final RelativeLayout previewRoot;
    private C54792m4 rotationHelper;
    private ValueAnimator screenClearAnim;
    private ValueAnimator screenRecoveryAnim;
    private C39952a securityDataScope;
    private C46261j6 statisticsWidget;
    private final Fragment uicFragment;
    private C55908a viewScope;
    private final C13601g warnningCountWidget$delegate;

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$b */
    public interface C3204b {
        /* renamed from: a */
        void mo3372a(C58124b.C58125b bVar, Bundle bundle);
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$t */
    public static final class C29967t extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C29967t f81134d = new C29967t();

        public C29967t() {
            super(0);
        }

        public Object invoke() {
            boolean z;
            C33319f fVar;
            C33343g Ax0 = ((C60106t) C86312j.m106911c(C60106t.class)).Ax0();
            for (Map.Entry next : Ax0.f90384f.entrySet()) {
                long longValue = ((Number) next.getKey()).longValue();
                Set set = (Set) next.getValue();
                Log.m105924i("Finder.FinderLiveLuckyMoneyStorage", "saveCacheInternal: liveId:" + longValue);
                Cursor rawQuery = Ax0.f90383e.rawQuery("SELECT * FROM FinderLiveLuckyMoneyInfo where FinderLiveLuckyMoneyInfo.liveId=" + C61926c.m72691p(longValue), (String[]) null, 2);
                boolean z2 = true;
                if (rawQuery.moveToNext()) {
                    fVar = new C33319f();
                    fVar.convertFrom(rawQuery);
                    z = false;
                } else {
                    C33319f fVar2 = new C33319f();
                    fVar2.field_liveId = C61926c.m72691p(longValue);
                    fVar2.field_luckyMoneyData = new C49372f31().toByteArray();
                    Log.m105924i("Finder.FinderLiveLuckyMoneyStorage", "create new luckyMoneyInfo:" + fVar2);
                    fVar = fVar2;
                    z = true;
                }
                C49372f31 f312 = new C49372f31();
                byte[] bArr = fVar.field_luckyMoneyData;
                if (bArr != null) {
                    try {
                        f312.parseFrom(bArr);
                    } catch (Exception e) {
                        Log.printDebugStack("safeParser", "", e);
                    }
                }
                f312.f133263e.addAll(set);
                fVar.field_luckyMoneyData = f312.toByteArray();
                rawQuery.close();
                if (z) {
                    if (Ax0.f90383e.insert("FinderLiveLuckyMoneyInfo", "liveId", fVar.convertTo()) <= 0) {
                        z2 = false;
                    }
                } else {
                    z2 = Ax0.replace(fVar);
                }
                Log.m105924i("Finder.FinderLiveLuckyMoneyStorage", "saveCache result:" + z2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$q */
    public static final class C41466q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56032b f111672d;

        /* renamed from: e */
        public final /* synthetic */ String f111673e;

        /* renamed from: f */
        public final /* synthetic */ int f111674f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41466q(C56032b bVar, String str, int i) {
            super(0);
            this.f111672d = bVar;
            this.f111673e = str;
            this.f111674f = i;
        }

        public Object invoke() {
            C76912y0.m92766e(this.f111672d.getContext(), this.f111673e, new C41467c(this.f111674f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$a */
    public static final class C56033a {
        public C56033a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$c */
    public static final class C56034c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159840d;

        public C56034c(C56032b bVar) {
            this.f159840d = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f159840d.onScreenClearEnd();
        }

        public void onAnimationStart(Animator animator) {
            this.f159840d.onScreenClearStart();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$d */
    public static final class C56035d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159841d;

        public C56035d(C56032b bVar) {
            this.f159841d = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C56032b bVar = this.f159841d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            bVar.dispatchValueAnimator(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$e */
    public static final class C56036e extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159842d;

        public C56036e(C56032b bVar) {
            this.f159842d = bVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f159842d.onScreenRecoveryEnd();
        }

        public void onAnimationStart(Animator animator) {
            this.f159842d.onScreenRecoveryStart();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$f */
    public static final class C56037f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159843d;

        public C56037f(C56032b bVar) {
            this.f159843d = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C56032b bVar = this.f159843d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            bVar.dispatchValueAnimator(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$g */
    public static final class C56038g extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ Context f159844d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56038g(Context context) {
            super(0);
            this.f159844d = context;
        }

        public Object invoke() {
            return new FrameLayout(this.f159844d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$h */
    public static final class C56039h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f159845d;

        /* renamed from: e */
        public final /* synthetic */ C56032b f159846e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56039h(int i, C56032b bVar) {
            super(0);
            this.f159845d = i;
            this.f159846e = bVar;
        }

        public Object invoke() {
            C56032b.Companion.getClass();
            String access$getTAG$cp = C56032b.TAG;
            Log.m105924i(access$getTAG$cp, "handleRecvLuckyMoneyErr errCode:" + this.f159845d);
            int i = this.f159845d;
            if (i == 1) {
                Bundle bundle = new Bundle();
                C56032b bVar = this.f159846e;
                bundle.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 1);
                bVar.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_BOTTOM_TIP_PANEL, bundle);
            } else if (i == 2) {
                Bundle bundle2 = new Bundle();
                C56032b bVar2 = this.f159846e;
                bundle2.putInt("PARAM_FINDER_BOTTOM_TIP_SCENE", 2);
                bVar2.statusChange(C58124b.C58125b.FINDER_LIVE_SHOW_BOTTOM_TIP_PANEL, bundle2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$i */
    public static final class C56040i extends C87413o implements C32224a<HashMap<String, C32224a<? extends C62660c>>> {

        /* renamed from: d */
        public static final C56040i f159847d = new C56040i();

        public C56040i() {
            super(0);
        }

        public Object invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$j */
    public static final class C56041j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159848d;

        /* renamed from: e */
        public final /* synthetic */ JSONObject f159849e;

        /* renamed from: f */
        public final /* synthetic */ JSONArray f159850f;

        /* renamed from: g */
        public final /* synthetic */ C13604l<Integer, Integer> f159851g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56041j(C56032b bVar, JSONObject jSONObject, JSONArray jSONArray, C13604l<Integer, Integer> lVar) {
            super(0);
            this.f159848d = bVar;
            this.f159849e = jSONObject;
            this.f159850f = jSONArray;
            this.f159851g = lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0147  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r14 = this;
                java.lang.Class<cl1.u> r0 = cl1.C55001u.class
                com.tencent.mm.plugin.finder.live.view.b r1 = r14.f159848d
                androidx.lifecycle.i0 r1 = r1.business(r0)
                cl1.u r1 = (cl1.C55001u) r1
                te3.bq2 r1 = r1.f154419p
                java.lang.String r1 = r1.f182319n
                if (r1 != 0) goto L_0x0020
                com.tencent.mm.plugin.finder.live.view.b$a r0 = com.tencent.p014mm.plugin.finder.live.view.C56032b.Companion
                r0.getClass()
                java.lang.String r0 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
                java.lang.String r1 = "notifyRoomPKMicUserChange: sdk_create_user_id is null in uiThread, skip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                goto L_0x01e8
            L_0x0020:
                org.json.JSONObject r1 = r14.f159849e
                java.lang.String r2 = "m"
                int r1 = r1.optInt(r2)
                org.json.JSONObject r2 = r14.f159849e
                java.lang.String r3 = "a"
                java.lang.String r2 = r2.optString(r3)
                java.lang.String r3 = "micData.optString(SEIMsg.A)"
                gy3.C87412m.m108593f(r2, r3)
                java.lang.Float r2 = z04.C66730w.m78730d(r2)
                if (r2 == 0) goto L_0x0040
                float r2 = r2.floatValue()
                goto L_0x0041
            L_0x0040:
                r2 = 0
            L_0x0041:
                com.tencent.mm.plugin.finder.live.view.b r3 = r14.f159848d
                org.json.JSONArray r4 = r14.f159850f
                r9 = 0
                if (r4 == 0) goto L_0x004d
                int r4 = r4.length()
                goto L_0x004e
            L_0x004d:
                r4 = 0
            L_0x004e:
                rx3.l<java.lang.Integer, java.lang.Integer> r5 = r14.f159851g
                android.graphics.Rect r10 = r3.getPlayerViewRect(r4, r1, r5)
                int r3 = r10.width()
                if (r3 == 0) goto L_0x01da
                int r3 = r10.height()
                if (r3 != 0) goto L_0x0062
                goto L_0x01da
            L_0x0062:
                com.tencent.mm.plugin.finder.live.view.b r3 = r14.f159848d
                org.json.JSONArray r3 = r3.getLastRoomPkMicUserList()
                if (r3 == 0) goto L_0x006f
                int r3 = r3.length()
                goto L_0x0070
            L_0x006f:
                r3 = 0
            L_0x0070:
                r11 = 0
                r4 = 2
                if (r3 != 0) goto L_0x0083
                com.tencent.mm.plugin.finder.live.view.b r3 = r14.f159848d
                java.lang.Class<cl1.o> r5 = cl1.C54991o.class
                androidx.lifecycle.i0 r5 = r3.business(r5)
                cl1.o r5 = (cl1.C54991o) r5
                java.lang.String r5 = r5.f154345o
                com.tencent.p014mm.plugin.finder.live.view.C56032b.fillBlurBg$default(r3, r5, r9, r4, r11)
            L_0x0083:
                com.tencent.mm.plugin.finder.live.view.b$a r3 = com.tencent.p014mm.plugin.finder.live.view.C56032b.Companion
                r3.getClass()
                java.lang.String r3 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "notifyRoomPKMicUserChange mode: "
                r5.append(r6)
                r5.append(r1)
                java.lang.String r6 = " videoRate: "
                r5.append(r6)
                r5.append(r2)
                java.lang.String r6 = " lastMicData: "
                r5.append(r6)
                com.tencent.mm.plugin.finder.live.view.b r6 = r14.f159848d
                org.json.JSONObject r6 = r6.getLastMicData()
                r5.append(r6)
                java.lang.String r6 = "  curMicData: "
                r5.append(r6)
                org.json.JSONObject r6 = r14.f159849e
                r5.append(r6)
                java.lang.String r6 = " playerViewRect:"
                r5.append(r6)
                r5.append(r10)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                com.tencent.mm.plugin.finder.live.view.b r3 = r14.f159848d
                org.json.JSONArray r5 = r14.f159850f
                r3.setLastRoomPkMicUserList(r5)
                com.tencent.mm.plugin.finder.live.view.b r3 = r14.f159848d
                org.json.JSONObject r5 = r14.f159849e
                r3.setLastMicData(r5)
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                r12 = 1
                if (r1 == 0) goto L_0x00f4
                if (r1 == r12) goto L_0x00f4
                if (r1 == r4) goto L_0x00e6
                r4 = 3
                if (r1 == r4) goto L_0x00e6
                goto L_0x0101
            L_0x00e6:
                com.tencent.mm.plugin.finder.live.view.b r3 = r14.f159848d
                org.json.JSONObject r4 = r14.f159849e
                rx3.l<java.lang.Integer, java.lang.Integer> r8 = r14.f159851g
                r5 = r1
                r6 = r2
                r7 = r10
                java.util.LinkedHashMap r3 = r3.onSeiGrabModeHandle(r4, r5, r6, r7, r8)
                goto L_0x0101
            L_0x00f4:
                com.tencent.mm.plugin.finder.live.view.b r3 = r14.f159848d
                org.json.JSONObject r4 = r14.f159849e
                rx3.l<java.lang.Integer, java.lang.Integer> r8 = r14.f159851g
                r5 = r1
                r6 = r2
                r7 = r10
                java.util.LinkedHashMap r3 = r3.onSeiNormalModeHandle(r4, r5, r6, r7, r8)
            L_0x0101:
                r13 = r3
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r0 = r3.mo77630e(r0)
                cl1.u r0 = (cl1.C55001u) r0
                if (r0 == 0) goto L_0x014a
                te3.bq2 r0 = r0.f154419p
                if (r0 == 0) goto L_0x014a
                pe3.b r3 = r0.f182318j
                if (r3 != 0) goto L_0x011d
                java.lang.String r0 = "Finder.FinderLiveService"
                java.lang.String r3 = "updateVideoParamsByMic: sdk_params is null, skip"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                goto L_0x014a
            L_0x011d:
                te3.cq2 r3 = new te3.cq2
                r3.<init>()
                pe3.b r0 = r0.f182318j
                byte[] r0 = r0.f257327a
                if (r0 != 0) goto L_0x0129
                goto L_0x0139
            L_0x0129:
                r3.parseFrom(r0)     // Catch:{ Exception -> 0x012d }
                goto L_0x013a
            L_0x012d:
                r0 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r12]
                r3[r9] = r0
                java.lang.String r0 = "safeParser"
                java.lang.String r4 = ""
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r0, r4, r3)
            L_0x0139:
                r3 = r11
            L_0x013a:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                if (r3 == 0) goto L_0x0140
                te3.dq2 r11 = r3.f182554d
            L_0x0140:
                r0.mo77604E(r11)
                j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
                if (r0 == 0) goto L_0x014a
                r0.mo85673A0()
            L_0x014a:
                java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
                r5.<init>()
                com.tencent.mm.plugin.finder.live.view.b r0 = r14.f159848d
                java.util.LinkedList r0 = r0.lastMicCoverData
                if (r0 == 0) goto L_0x0171
                java.util.Iterator r0 = r0.iterator()
            L_0x015b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x0171
                java.lang.Object r3 = r0.next()
                gi1.a r3 = (gi1.C59463a) r3
                java.lang.String r4 = r3.mo84561a()
                gi1.f r3 = r3.f169895b
                r5.put(r4, r3)
                goto L_0x015b
            L_0x0171:
                com.tencent.mm.plugin.finder.live.view.b r0 = r14.f159848d
                java.lang.Class<cl1.c0> r3 = cl1.C54949c0.class
                androidx.lifecycle.i0 r0 = r0.business(r3)
                cl1.c0 r0 = (cl1.C54949c0) r0
                java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
                androidx.lifecycle.i0 r3 = r0.business(r3)
                cl1.d0 r3 = (cl1.C54963d0) r3
                com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<gi1.c> r3 = r3.f154077t
                java.lang.Object r3 = r3.getValue()
                gi1.c r3 = (gi1.C59464c) r3
                if (r3 == 0) goto L_0x018f
                int r9 = r3.f169898c
            L_0x018f:
                if (r3 == 0) goto L_0x0199
                java.util.LinkedList<gi1.a> r3 = r3.f169896a
                if (r3 == 0) goto L_0x0199
                int r12 = r3.size()
            L_0x0199:
                dl1.a r3 = r0.mo75863d3(r9, r12)
                r0.f153997g = r3
                com.tencent.mm.plugin.finder.live.view.b r0 = r14.f159848d
                al1.h r0 = r0.getData()
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r0.f151979f
                gi1.b r9 = new gi1.b
                r3 = r9
                r4 = r13
                r6 = r10
                r7 = r1
                r8 = r2
                r3.<init>(r4, r5, r6, r7, r8)
                java.lang.String r1 = "<this>"
                gy3.C87412m.m108594g(r0, r1)
                gh1.j r1 = gh1.C59447j.f169870a
                hh1.c r2 = new hh1.c
                r2.<init>(r0, r9)
                r1.mo84557i(r0, r2)
                com.tencent.mm.plugin.finder.live.view.b r0 = r14.f159848d
                java.util.concurrent.CopyOnWriteArrayList r0 = r0.getPluginList()
                java.util.Iterator r0 = r0.iterator()
            L_0x01ca:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x01e8
                java.lang.Object r1 = r0.next()
                d60.a r1 = (d60.C58121a) r1
                r1.mo11992m0(r13)
                goto L_0x01ca
            L_0x01da:
                com.tencent.mm.plugin.finder.live.view.b$a r0 = com.tencent.p014mm.plugin.finder.live.view.C56032b.Companion
                r0.getClass()
                java.lang.String r0 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
                java.lang.String r1 = "playerViewRect size = 0"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x01e8:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.C56041j.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$k */
    public static final class C56042k extends C29060q.C29061a {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159852d;

        public C56042k(C56032b bVar) {
            this.f159852d = bVar;
        }

        public void onNetworkChange(int i) {
            C56032b.Companion.getClass();
            String access$getTAG$cp = C56032b.TAG;
            Log.m105924i(access$getTAG$cp, "onNetworkChange status:" + i + '!');
            this.f159852d.networkChange(i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$l */
    public static final class C56043l extends C87413o implements C32226l<String, C54130j> {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159853d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56043l(C56032b bVar) {
            super(1);
            this.f159853d = bVar;
        }

        public Object invoke(Object obj) {
            T t;
            String str = (String) obj;
            C87412m.m108594g(str, DownloadInfo.UID);
            List<C54130j> l3 = ((C54963d0) this.f159853d.business(C54963d0.class)).mo75929l3();
            C87412m.m108593f(l3, "business(LiveLinkMicSlic….java).allLinkMicUserList");
            synchronized (l3) {
                Iterator<T> it = l3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C54130j) t).f151997a, str)) {
                        break;
                    }
                }
            }
            return (C54130j) t;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$m */
    public static final class C56044m extends C87413o implements C32226l<String, C54130j> {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159854d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56044m(C56032b bVar) {
            super(1);
            this.f159854d = bVar;
        }

        public Object invoke(Object obj) {
            T t;
            String str = (String) obj;
            C87412m.m108594g(str, DownloadInfo.UID);
            List<C54130j> l3 = ((C54963d0) this.f159854d.business(C54963d0.class)).mo75929l3();
            C87412m.m108593f(l3, "business(LiveLinkMicSlic….java).allLinkMicUserList");
            synchronized (l3) {
                Iterator<T> it = l3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C54130j) t).f151997a, str)) {
                        break;
                    }
                }
            }
            return (C54130j) t;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$n */
    public static final class C56045n implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ boolean f159855a;

        public C56045n(boolean z) {
            this.f159855a = z;
        }

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
            if (z && this.f159855a) {
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.ALERT_INFO, "2", (String) null, 4, (Object) null);
            }
            C56032b.Companion.getClass();
            String access$getTAG$cp = C56032b.TAG;
            Log.m105924i(access$getTAG$cp, "showAlertDialog click bOk:" + z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$o */
    public static final class C56046o implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159856d;

        public C56046o(C56032b bVar) {
            this.f159856d = bVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout$showBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12925w access$getBottomSheet$p = this.f159856d.bottomSheet;
            if (access$getBottomSheet$p != null) {
                access$getBottomSheet$p.mo5085n();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout$showBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$p */
    public static final class C56047p implements w$$d {

        /* renamed from: a */
        public final /* synthetic */ C56032b f159857a;

        public C56047p(C56032b bVar) {
            this.f159857a = bVar;
        }

        public final void onDismiss() {
            C54991o oVar = (C54991o) this.f159857a.business(C54991o.class);
            oVar.getClass();
            C61926c.m72668M(new C54997r(oVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$r */
    public static final class C56048r implements C58396o0 {

        /* renamed from: a */
        public final /* synthetic */ C56032b f159858a;

        /* renamed from: b */
        public final /* synthetic */ C58111e f159859b;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.b$r$a */
        public static final class C56049a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C58393n0 f159860d;

            /* renamed from: e */
            public final /* synthetic */ C56032b f159861e;

            /* renamed from: f */
            public final /* synthetic */ C58111e f159862f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56049a(C58393n0 n0Var, C56032b bVar, C58111e eVar) {
                super(0);
                this.f159860d = n0Var;
                this.f159861e = bVar;
                this.f159862f = eVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0104, code lost:
                r5 = r5.f176822Y0;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r15 = this;
                    dp1.n0 r0 = r15.f159860d
                    java.lang.String r1 = "memoryInfo"
                    gy3.C87412m.m108594g(r0, r1)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = ""
                    r1.<init>(r2)
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "TotalPss:"
                    r3.append(r4)
                    int r4 = r0.f167302a
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    r1.append(r3)
                    java.lang.String r3 = " | "
                    r1.append(r3)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "DalvikPss:"
                    r4.append(r5)
                    int r5 = r0.f167303b
                    r4.append(r5)
                    java.lang.String r4 = r4.toString()
                    r1.append(r4)
                    r1.append(r3)
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "NativePss:"
                    r3.append(r4)
                    int r0 = r0.f167304c
                    r3.append(r0)
                    java.lang.String r0 = r3.toString()
                    r1.append(r0)
                    java.lang.String r0 = "\n"
                    r1.append(r0)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r3 = "memoryInfoStr.toString()"
                    gy3.C87412m.m108593f(r1, r3)
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>(r2)
                    dp1.d0$a r4 = dp1.C58358d0.f167118d
                    if (r4 == 0) goto L_0x00d1
                    long r5 = r4.f167124b
                    long r7 = r4.f167123a
                    long r9 = r5 - r7
                    r11 = 0
                    int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r13 >= 0) goto L_0x007c
                    r9 = r11
                L_0x007c:
                    long r13 = r4.f167125c
                    long r7 = r13 - r7
                    int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                    if (r4 >= 0) goto L_0x0085
                    r7 = r11
                L_0x0085:
                    long r5 = r5 - r13
                    int r4 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
                    if (r4 >= 0) goto L_0x008b
                    goto L_0x008c
                L_0x008b:
                    r11 = r5
                L_0x008c:
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "FirstFrameTime:"
                    r4.append(r5)
                    r4.append(r9)
                    java.lang.String r4 = r4.toString()
                    r3.append(r4)
                    r3.append(r0)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "StartPlayTime:"
                    r4.append(r5)
                    r4.append(r7)
                    java.lang.String r4 = r4.toString()
                    r3.append(r4)
                    r3.append(r0)
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "StartPlayToFrameTime:"
                    r4.append(r5)
                    r4.append(r11)
                    java.lang.String r4 = r4.toString()
                    r3.append(r4)
                    r3.append(r0)
                L_0x00d1:
                    java.lang.String r3 = r3.toString()
                    java.lang.String r4 = "timeStr.toString()"
                    gy3.C87412m.m108593f(r3, r4)
                    ok1.e r4 = ok1.C62042e.f176370a
                    boolean r5 = r4.mo87030O0()
                    if (r5 == 0) goto L_0x00fc
                    c50.b r5 = c50.C54655b.f153178f1
                    if (r5 != 0) goto L_0x00ee
                    c50.b r5 = new c50.b
                    r5.<init>()
                    c50.C54655b.f153178f1 = r5
                L_0x00ee:
                    c50.b r5 = c50.C54655b.f153178f1
                    gy3.C87412m.m108591d(r5)
                    int r5 = r5.hashCode()
                    java.lang.String r5 = java.lang.String.valueOf(r5)
                    goto L_0x010e
                L_0x00fc:
                    com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                    p50.e r5 = r5.mo77631e0()
                    if (r5 == 0) goto L_0x010d
                    b50.g r5 = r5.f176822Y0
                    if (r5 == 0) goto L_0x010d
                    java.lang.String r5 = r5.mo75227a()
                    goto L_0x010e
                L_0x010d:
                    r5 = r2
                L_0x010e:
                    com.tencent.mm.plugin.finder.live.view.b r6 = r15.f159861e
                    java.lang.Class<cl1.v> r7 = cl1.C55002v.class
                    androidx.lifecycle.i0 r6 = r6.business(r7)
                    cl1.v r6 = (cl1.C55002v) r6
                    boolean r4 = r4.mo87030O0()
                    java.lang.String r4 = r6.mo76045c3(r4, r5)
                    com.tencent.mm.plugin.finder.live.view.b r5 = r15.f159861e
                    java.lang.Class<cl1.a1> r6 = cl1.C54943a1.class
                    androidx.lifecycle.i0 r5 = r5.business(r6)
                    cl1.a1 r5 = (cl1.C54943a1) r5
                    r5.getClass()
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r7 = "CommentConfig:\ninterval="
                    r6.append(r7)
                    te3.lp2 r7 = r5.f153975f
                    int r7 = r7.f184140q
                    r6.append(r7)
                    java.lang.String r7 = ",perSize="
                    r6.append(r7)
                    te3.lp2 r7 = r5.f153975f
                    int r7 = r7.f184141r
                    r6.append(r7)
                    java.lang.String r7 = ",moveDur:"
                    r6.append(r7)
                    te3.lp2 r5 = r5.f153975f
                    int r5 = r5.f184142s
                    r6.append(r5)
                    java.lang.String r5 = r6.toString()
                    android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>(r2)
                    r7.append(r4)
                    r7.append(r1)
                    r7.append(r3)
                    r7.append(r5)
                    java.lang.String r5 = r7.toString()
                    r6.<init>(r5)
                    android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
                    com.tencent.mm.plugin.finder.live.view.b r7 = r15.f159861e
                    android.content.Context r7 = r7.getContext()
                    android.content.res.Resources r7 = r7.getResources()
                    r8 = 2131099941(0x7f060125, float:1.781225E38)
                    int r7 = r7.getColor(r8)
                    r5.<init>(r7)
                    int r7 = r4.length()
                    int r8 = r4.length()
                    int r9 = r1.length()
                    int r8 = r8 + r9
                    r9 = 33
                    r6.setSpan(r5, r7, r8, r9)
                    android.text.style.ForegroundColorSpan r5 = new android.text.style.ForegroundColorSpan
                    com.tencent.mm.plugin.finder.live.view.b r7 = r15.f159861e
                    android.content.Context r7 = r7.getContext()
                    android.content.res.Resources r7 = r7.getResources()
                    r8 = 2131099810(0x7f0600a2, float:1.7811984E38)
                    int r7 = r7.getColor(r8)
                    r5.<init>(r7)
                    int r7 = r4.length()
                    int r8 = r1.length()
                    int r7 = r7 + r8
                    int r4 = r4.length()
                    int r1 = r1.length()
                    int r4 = r4 + r1
                    int r1 = r3.length()
                    int r4 = r4 + r1
                    r6.setSpan(r5, r7, r4, r9)
                    com.tencent.mm.plugin.finder.live.view.b r1 = r15.f159861e
                    il1.j6 r1 = r1.getStatisticsWidget()
                    if (r1 != 0) goto L_0x01e9
                    com.tencent.mm.plugin.finder.live.view.b r1 = r15.f159861e
                    il1.j6 r3 = new il1.j6
                    android.content.Context r4 = r1.getContext()
                    java.lang.String r5 = "context"
                    gy3.C87412m.m108593f(r4, r5)
                    com.tencent.mm.plugin.finder.live.view.b r5 = r15.f159861e
                    r3.<init>(r4, r5)
                    r1.setStatisticsWidget(r3)
                L_0x01e9:
                    com.tencent.mm.plugin.finder.live.view.b r1 = r15.f159861e
                    il1.j6 r1 = r1.getStatisticsWidget()
                    if (r1 == 0) goto L_0x01fd
                    com.tencent.mm.plugin.finder.live.view.b r3 = r15.f159861e
                    com.tencent.mm.plugin.finder.live.view.d r4 = new com.tencent.mm.plugin.finder.live.view.d
                    r4.<init>(r3, r1)
                    com.tencent.mm.ui.widget.imageview.WeImageView r1 = r1.f124705b
                    r1.setOnClickListener(r4)
                L_0x01fd:
                    com.tencent.mm.plugin.finder.live.view.b r1 = r15.f159861e
                    il1.j6 r1 = r1.getStatisticsWidget()
                    r3 = 0
                    if (r1 == 0) goto L_0x0215
                    android.widget.TextView r4 = r1.f124704a
                    r4.setVisibility(r3)
                    com.tencent.mm.ui.widget.imageview.WeImageView r4 = r1.f124705b
                    r4.setVisibility(r3)
                    android.widget.TextView r1 = r1.f124704a
                    r1.setText(r6)
                L_0x0215:
                    com.tencent.mm.plugin.finder.live.view.b$a r1 = com.tencent.p014mm.plugin.finder.live.view.C56032b.Companion
                    r1.getClass()
                    java.lang.String r1 = com.tencent.p014mm.plugin.finder.live.view.C56032b.TAG
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r5 = "showStatistics:"
                    r4.append(r5)
                    nk1.d r5 = nk1.C61790n.f175672c
                    if (r5 == 0) goto L_0x0297
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.util.ArrayList<nk1.p> r5 = r5.f175611a
                    java.util.Iterator r5 = r5.iterator()
                L_0x0238:
                    boolean r7 = r5.hasNext()
                    if (r7 == 0) goto L_0x028d
                    java.lang.Object r7 = r5.next()
                    nk1.p r7 = (nk1.C61792p) r7
                    java.util.ArrayList<nk1.e> r7 = r7.f175677d
                    if (r7 == 0) goto L_0x0289
                    java.util.Iterator r7 = r7.iterator()
                L_0x024c:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L_0x0289
                    java.lang.Object r8 = r7.next()
                    nk1.e r8 = (nk1.C61778e) r8
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    r10 = 123(0x7b, float:1.72E-43)
                    r9.append(r10)
                    java.lang.String r10 = r8.f175625a
                    r9.append(r10)
                    r10 = 40
                    r9.append(r10)
                    int r10 = r8.f175626b
                    r9.append(r10)
                    java.lang.String r10 = "):"
                    r9.append(r10)
                    int r8 = r8.f175627c
                    r9.append(r8)
                    java.lang.String r8 = "};"
                    r9.append(r8)
                    java.lang.String r8 = r9.toString()
                    r6.append(r8)
                    goto L_0x024c
                L_0x0289:
                    r6.append(r0)
                    goto L_0x0238
                L_0x028d:
                    java.lang.String r0 = r6.toString()
                    java.lang.String r5 = "sb.toString()"
                    gy3.C87412m.m108593f(r0, r5)
                    goto L_0x0298
                L_0x0297:
                    r0 = 0
                L_0x0298:
                    r4.append(r0)
                    java.lang.String r0 = r4.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                    d50.e r0 = r15.f159862f
                    r1 = 1
                    if (r0 == 0) goto L_0x02ac
                    int r0 = r0.f166202c
                    if (r0 != r1) goto L_0x02ac
                    r3 = 1
                L_0x02ac:
                    if (r3 == 0) goto L_0x02c8
                    com.tencent.mm.plugin.finder.live.view.b r0 = r15.f159861e
                    il1.j6 r0 = r0.getStatisticsWidget()
                    if (r0 == 0) goto L_0x02c8
                    com.tencent.mm.plugin.finder.live.model.FinderLiveService r1 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                    p50.e r1 = r1.mo77631e0()
                    if (r1 == 0) goto L_0x02c6
                    b50.g r1 = r1.f176822Y0
                    if (r1 == 0) goto L_0x02c6
                    java.lang.String r2 = r1.mo75227a()
                L_0x02c6:
                    r0.f124706c = r2
                L_0x02c8:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.C56048r.C56049a.invoke():java.lang.Object");
            }
        }

        public C56048r(C56032b bVar, C58111e eVar) {
            this.f159858a = bVar;
            this.f159859b = eVar;
        }

        /* renamed from: a */
        public void mo78147a(C58393n0 n0Var) {
            C87412m.m108594g(n0Var, "memoryInfo");
            C61926c.m72668M(new C56049a(n0Var, this.f159858a, this.f159859b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$s */
    public static final class C56050s extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159863d;

        /* renamed from: e */
        public final /* synthetic */ C58124b.C58125b f159864e;

        /* renamed from: f */
        public final /* synthetic */ Bundle f159865f;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.b$s$a */
        public /* synthetic */ class C56051a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f159866a;

            static {
                int[] iArr = new int[C58124b.C58125b.values().length];
                C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
                iArr[67] = 1;
                f159866a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56050s(C56032b bVar, C58124b.C58125b bVar2, Bundle bundle) {
            super(0);
            this.f159863d = bVar;
            this.f159864e = bVar2;
            this.f159865f = bundle;
        }

        public Object invoke() {
            C64273c21 c212;
            C64273c21 c213;
            Class cls = C55001u.class;
            Class cls2 = C54991o.class;
            C56032b.Companion.getClass();
            Log.m105924i(C56032b.TAG, "this:" + this.f159863d + " isDestroy:" + this.f159863d.isDestroyed() + " lastUIState:" + this.f159863d.getLastUIState());
            if (!this.f159863d.isDestroyed()) {
                C3204b externalCallback = this.f159863d.getExternalCallback();
                if (externalCallback != null) {
                    externalCallback.mo3372a(this.f159864e, this.f159865f);
                }
                C56032b.super.statusChange(this.f159864e, this.f159865f);
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                C45795b buContext = this.f159863d.getBuContext();
                C62042e eVar = C62042e.f176370a;
                C56032b bVar = this.f159863d;
                eVar.getClass();
                int i = 0;
                finderLiveService.mo77623Z(buContext, (bVar instanceof C56061i) || (bVar instanceof C56074k), this.f159864e, this.f159865f, ((C55001u) this.f159863d.business(cls)).f154420q.f182392d);
                boolean z = this.f159863d.getLastLiveState() != ((C54991o) this.f159863d.business(cls2)).f154295b1;
                boolean z2 = this.f159863d.getLastUIState() != ((C54991o) this.f159863d.business(cls2)).f154291a1;
                if (z || z2) {
                    C56032b bVar2 = this.f159863d;
                    bVar2.setLastUIState(((C54991o) bVar2.business(cls2)).f154291a1);
                    C56032b bVar3 = this.f159863d;
                    bVar3.setLastLiveState(((C54991o) bVar3.business(cls2)).f154295b1);
                    C56032b bVar4 = this.f159863d;
                    bVar4.applyState(((C54991o) bVar4.business(cls2)).f154295b1, z, ((C54991o) this.f159863d.business(cls2)).f154291a1, z2, this.f159865f);
                }
                if (z || z2) {
                    String access$getTAG$cp = C56032b.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("statusChange lastLiveState:");
                    sb.append(this.f159863d.getLastLiveState());
                    sb.append(",lastUIState:");
                    sb.append(this.f159863d.getLastUIState());
                    sb.append(",set status:");
                    sb.append(this.f159864e.name());
                    sb.append(",liveId:");
                    C45795b buContext2 = this.f159863d.getBuContext();
                    sb.append((buContext2 == null || (c213 = ((C55001u) buContext2.mo71262a(cls)).f154420q) == null) ? null : Long.valueOf(c213.f182392d));
                    sb.append(",service liveId:");
                    C45795b bVar5 = C45795b.f123698n;
                    sb.append((bVar5 == null || (c212 = ((C55001u) bVar5.mo71262a(cls)).f154420q) == null) ? null : Long.valueOf(c212.f182392d));
                    Log.m105924i(access$getTAG$cp, sb.toString());
                }
                if (this.f159864e == C58124b.C58125b.LIVE_STATUS_CONNECT_SUCC) {
                    C58730g5.m68220e(C58730g5.f168158a, "RV_VISITOR_" + this.f159863d.getData().f151977d.f157064e, C58713e5.f168084l.f168101b, (C89349b) null, false, true, false, 44, (Object) null);
                }
                if (this.f159864e == C58124b.C58125b.LIVE_HAS_FINISHED) {
                    C58730g5.f168158a.mo83649c("RV_VISITOR_" + this.f159863d.getData().f151977d.f157064e);
                }
                if (this.f159864e == C58124b.C58125b.FINDER_LIVE_STATISTC_EVENT) {
                    C54991o oVar = (C54991o) this.f159863d.business(cls2);
                    Bundle bundle = this.f159865f;
                    oVar.f154329j1 = bundle != null ? bundle.getString("DUMP_STATISTIC") : null;
                    Log.m105924i(C56032b.TAG, "printStatistics:" + ((C54991o) this.f159863d.business(cls2)).f154329j1);
                    C54424j jVar = C54424j.f152652a;
                    Bundle bundle2 = this.f159865f;
                    synchronized (jVar) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("markQosInfo qosInfoQueue.size:");
                        LinkedList<C58111e> linkedList = C54424j.f152653b;
                        sb4.append(linkedList.size());
                        sb4.append(' ');
                        sb4.append(bundle2);
                        Log.m105924i("MicroMsg.LiveWatchDog", sb4.toString());
                        linkedList.add(jVar.mo75238b(bundle2));
                        if (bundle2 != null) {
                            i = bundle2.getInt(TXLiveConstants.NET_STATUS_VIDEO_BITRATE);
                        }
                        if (i <= 0) {
                            C54424j.f152654c++;
                        }
                    }
                    ((C55002v) this.f159863d.business(C55002v.class)).f154430f = jVar.mo75237a();
                    this.f159863d.showStatistics();
                }
                if (this.f159864e == C58124b.C58125b.FINDER_LIVE_SHOW_ALERT_DIALOG) {
                    Bundle bundle3 = this.f159865f;
                    String string = bundle3 != null ? bundle3.getString("PARAM_FINDER_LIVE_ALERT_DIALOG_TITLE", "") : null;
                    Bundle bundle4 = this.f159865f;
                    String string2 = bundle4 != null ? bundle4.getString("PARAM_FINDER_LIVE_ALERT_DIALOG_CONTENT", "") : null;
                    Context context = this.f159863d.getContext();
                    MMActivity mMActivity = context instanceof MMActivity ? (MMActivity) context : null;
                    if (mMActivity != null) {
                        C56032b.showAlertDialog$default(this.f159863d, mMActivity, string, string2, "", false, 16, (Object) null);
                    }
                }
                if (this.f159864e == C58124b.C58125b.LIVE_STATUS_DISCONNECT) {
                    this.f159863d.setLastRoomPkMicUserList((JSONArray) null);
                    this.f159863d.setLastPkMicUser((C54130j) null);
                    this.f159863d.getLastMicUserList().clear();
                }
            }
            if (C56051a.f159866a[this.f159864e.ordinal()] == 1) {
                C59447j jVar2 = C59447j.f169870a;
                LiveRoomControllerStore liveRoomControllerStore = this.f159863d.getData().f151979f;
                Bundle bundle5 = this.f159865f;
                C87412m.m108594g(liveRoomControllerStore, "<this>");
                jVar2.mo84557i(liveRoomControllerStore, new C59452m(bundle5, liveRoomControllerStore));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$u */
    public static final class C56052u extends C87413o implements C32227p<Boolean, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56052u(C56032b bVar) {
            super(2);
            this.f159867d = bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            if (booleanValue) {
                C59447j.f169870a.mo84554f(this.f159867d.getData().f151979f);
                C58124b.C7172a.m7372a(this.f159867d, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE, (Bundle) null, 2, (Object) null);
            } else {
                C59447j.f169870a.mo84555g(this.f159867d.getData().f151979f);
                C58124b.C7172a.m7372a(this.f159867d, C58124b.C58125b.FINDER_LIVE_ANCHOR_PAUSE_RECOVERY, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.b$v */
    public static final class C56053v extends C87413o implements C32224a<C60351b9> {

        /* renamed from: d */
        public final /* synthetic */ C56032b f159868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56053v(C56032b bVar) {
            super(0);
            this.f159868d = bVar;
        }

        public Object invoke() {
            return new C60351b9(this.f159868d);
        }
    }

    static {
        C56033a aVar = new C56033a((C8480h) null);
        Companion = aVar;
        TAG = "Finder.FinderBaseLivePluginLayout@" + aVar.hashCode();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56032b(Context context, Fragment fragment, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.uicFragment = fragment;
        boolean z = true;
        this.curNetworkQuality = 1;
        this.curNetworkType = -1;
        this.lastOrientation = -1;
        this.loadingTipWidget = new C60357c5(this);
        View findViewById = findViewById(C0966R.C0970id.dwj);
        C87412m.m108593f(findViewById, "findViewById(R.id.finder_live_preview_root)");
        this.previewRoot = (RelativeLayout) findViewById;
        this.commonTopContentRoot = (ViewGroup) findViewById(C0966R.C0970id.apq);
        this.warnningCountWidget$delegate = C36568h.m40985a(new C56053v(this));
        this.lifeCycleRegistry = new C103766u(this);
        this.activityScope = new C55908a((MMActivity) context, "activityScope");
        this.viewScope = new C55908a(this, "viewScope");
        this.securityDataScope = new C39952a(this, "securityDataScope");
        this.lastMicUserList = new ArrayList<>();
        C32444a aVar = C32444a.f86121a;
        this.audienPreloadCDNLiveConfig = C32444a.f86080M0.mo60266n().intValue() != 0 ? false : z;
        this.lastLiveState = -1;
        this.lastUIState = -1;
        this.rotationHelper = new C54792m4(new WeakReference((MMFinderUI) context));
        this.CLEAR_RECOVERY_SCREEN_DURATION = 300;
        this.emptyReuseFrameLayout$delegate = C36568h.m40985a(new C56038g(context));
        this.onNetworkChange = new C56042k(this);
    }

    private final void checkAndResetLifeCycle() {
        if (this.lifeCycleRegistry.f306531b == C39623j.C39626c.DESTROYED) {
            this.lifeCycleRegistry = new C103766u(this);
            this.viewScope = new C55908a(this, "viewScope");
        }
        this.lifeCycleRegistry.mo145138f(C39623j.C39626c.RESUMED);
    }

    /* access modifiers changed from: private */
    public final void dispatchValueAnimator(float f) {
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                C62660c cVar = (C62660c) aVar;
                if (cVar.mo3200b()) {
                    cVar.mo12123N0(f);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
            C87412m.m108594g(liveRoomControllerStore, "<this>");
            C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59455r(liveRoomControllerStore, f));
        }
    }

    private final void doScreenClearAnimation() {
        if (this.screenClearAnim == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(this.CLEAR_RECOVERY_SCREEN_DURATION);
            duration.addListener(new C56034c(this));
            duration.addUpdateListener(new C56035d(this));
            duration.setInterpolator(new DecelerateInterpolator());
            this.screenClearAnim = duration;
        }
        ValueAnimator valueAnimator = this.screenClearAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.screenClearAnim;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    private final void doScreenRecoveryAnimation() {
        if (this.screenRecoveryAnim == null) {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(this.CLEAR_RECOVERY_SCREEN_DURATION);
            duration.addListener(new C56036e(this));
            duration.addUpdateListener(new C56037f(this));
            ValueAnimator valueAnimator = this.screenRecoveryAnim;
            if (valueAnimator != null) {
                valueAnimator.setInterpolator(new AccelerateInterpolator());
            }
            this.screenRecoveryAnim = duration;
        }
        ValueAnimator valueAnimator2 = this.screenRecoveryAnim;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.screenRecoveryAnim;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    public static /* synthetic */ boolean fillBlurBg$default(C56032b bVar, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return bVar.fillBlurBg(str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillBlurBg");
    }

    private final LinkedHashMap<String, Rect> genMicRectMap(LinkedList<C59463a> linkedList, Rect rect) {
        LinkedHashMap<String, Rect> linkedHashMap = new LinkedHashMap<>();
        int width = rect.width();
        int height = rect.height();
        int i = rect.top;
        if ((linkedList != null ? linkedList.size() : 0) > 0) {
            if (linkedList != null) {
                for (C59463a aVar : linkedList) {
                    C59465f fVar = aVar.f169895b;
                    float f = fVar.f165729a;
                    float f2 = fVar.f165730b;
                    float f3 = (float) width;
                    float f4 = (float) i;
                    float f5 = (float) height;
                    linkedHashMap.put(aVar.mo84561a(), new Rect((int) (f * f3), (int) ((f2 * f5) + f4), (int) ((f + fVar.f165731c) * f3), (int) (f4 + ((f2 + fVar.f165732d) * f5))));
                }
            }
        } else {
            String str = ((C55001u) business(C55001u.class)).f154419p.f182319n;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put(str, new Rect(0, 0, width, height));
        }
        String str2 = TAG;
        Log.m105924i(str2, "genMicRectMap rectMap:" + linkedHashMap);
        return linkedHashMap;
    }

    private final Rect getCDNPlayerViewRect() {
        Class cls = C54991o.class;
        ViewGroup.LayoutParams layoutParams = this.previewRoot.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Integer valueOf = Integer.valueOf(marginLayoutParams.width);
        boolean z = true;
        Integer num = null;
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : C75044y4.m89990b(getContext()).x;
        Integer valueOf2 = Integer.valueOf(marginLayoutParams.height);
        if (valueOf2.intValue() <= 0) {
            z = false;
        }
        if (z) {
            num = valueOf2;
        }
        int intValue2 = num != null ? num.intValue() : C75044y4.m89990b(getContext()).y;
        int i = ((C54991o) business(cls)).f154335l1;
        int i2 = ((C54991o) business(cls)).f154338m1;
        int videoSpaceHeight = getVideoSpaceHeight();
        Log.m105924i(TAG, "getCDNPlayerViewRect videoSpaceHeight: " + videoSpaceHeight + " viewWidth: " + intValue + " viewHeight: " + intValue2 + " videoWidth: " + i + " videoHeight: " + i2 + " topMargin: " + marginLayoutParams.topMargin);
        if (intValue == 0 || intValue2 == 0 || i2 == 0 || i == 0) {
            return new Rect();
        }
        int i3 = videoSpaceHeight + marginLayoutParams.topMargin;
        int i4 = marginLayoutParams.leftMargin;
        return new Rect(i4, i3, intValue + i4, intValue2 + i3);
    }

    private final Rect getFocusedViewRect(C13604l<Integer, Integer> lVar) {
        ViewGroup viewGroup;
        int intValue = lVar != null ? lVar.f38555d.intValue() : C75044y4.m89990b(MMApplicationContext.getContext()).x;
        int intValue2 = lVar != null ? lVar.f38556e.intValue() : C75044y4.m89990b(MMApplicationContext.getContext()).y;
        ViewGroup.LayoutParams layoutParams = this.previewRoot.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = null;
        RelativeLayout.LayoutParams layoutParams3 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams3 != null) {
            layoutParams3.height = intValue2;
            layoutParams3.topMargin = 0;
            layoutParams3.width = intValue;
        }
        C60291e eVar = (C60291e) getPlugin(C60291e.class);
        ViewGroup.LayoutParams layoutParams4 = (eVar == null || (viewGroup = eVar.f166287d) == null) ? null : viewGroup.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams5 = layoutParams4 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams4 : null;
        if (layoutParams5 != null) {
            layoutParams5.height = intValue2;
            layoutParams5.topMargin = 0;
            layoutParams5.width = intValue;
        }
        ViewGroup viewGroup2 = this.commonTopContentRoot;
        ViewGroup.LayoutParams layoutParams6 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
            layoutParams2 = (RelativeLayout.LayoutParams) layoutParams6;
        }
        if (layoutParams2 != null) {
            layoutParams2.height = intValue2;
            layoutParams2.topMargin = 0;
            layoutParams2.width = intValue;
        }
        String str = TAG;
        Log.m105924i(str, "getFocusedViewRect width: " + intValue + " height: " + intValue2);
        return new Rect(0, 0, intValue, intValue2);
    }

    public static /* synthetic */ Rect getFocusedViewRect$default(C56032b bVar, C13604l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            return bVar.getFocusedViewRect(lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFocusedViewRect");
    }

    private final HashMap<String, C32224a<C62660c>> getLazyInitPluginMap() {
        return (HashMap) this.lazyInitPluginMap$delegate.getValue();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r4 != false) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Rect getPlayerViewRect(int r7, int r8, rx3.C13604l<java.lang.Integer, java.lang.Integer> r9) {
        /*
            r6 = this;
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.mo85682Z()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getPlayerViewRect isInLinkMic: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " LiveAnchorTRTCCore: "
            r2.append(r3)
            c50.b r3 = c50.C54655b.f153178f1
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002f
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            r2.append(r3)
            java.lang.String r3 = " LiveSecondaryDeviceTRTCCore: "
            r2.append(r3)
            i50.a r3 = i50.C60251a.f171781k1
            if (r3 == 0) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            i50.a r1 = i50.C60251a.f171781k1
            if (r1 == 0) goto L_0x004f
            r1 = 1
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 != 0) goto L_0x006d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 != 0) goto L_0x0061
            c50.b r0 = c50.C54655b.f153178f1
            if (r0 == 0) goto L_0x005f
            r4 = 1
        L_0x005f:
            if (r4 == 0) goto L_0x006d
        L_0x0061:
            if (r8 != r5) goto L_0x0068
            android.graphics.Rect r7 = r6.getFocusedViewRect(r9)
            goto L_0x0071
        L_0x0068:
            android.graphics.Rect r7 = r6.getTrtcPlayerViewRect(r7, r8, r9)
            goto L_0x0071
        L_0x006d:
            android.graphics.Rect r7 = r6.getCDNPlayerViewRect()
        L_0x0071:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.getPlayerViewRect(int, int, rx3.l):android.graphics.Rect");
    }

    public static /* synthetic */ Rect getPlayerViewRect$default(C56032b bVar, int i, int i2, C13604l lVar, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                lVar = null;
            }
            return bVar.getPlayerViewRect(i, i2, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlayerViewRect");
    }

    private final Rect getTrtcPlayerViewRect(int i, int i2, C13604l<Integer, Integer> lVar) {
        float f;
        float f2;
        Class cls = C54963d0.class;
        int i3 = C75044y4.m89990b(MMApplicationContext.getContext()).y;
        int i4 = C75044y4.m89990b(MMApplicationContext.getContext()).x;
        if (lVar != null) {
            i4 = lVar.f38555d.intValue();
        }
        int videoSpaceHeight = getVideoSpaceHeight();
        RelativeLayout.LayoutParams layoutParams = null;
        int k0 = C62042e.m72807k0(C62042e.f176370a, 0, 0, 3, (Object) null);
        String str = TAG;
        Log.m105924i(str, "getTrtcPlayerViewRect mode: " + i2 + " seiListSize: " + i + " screenSize: " + lVar + " videoSpaceHeight: " + videoSpaceHeight);
        ViewGroup.LayoutParams layoutParams2 = this.previewRoot.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams2 : null;
        if (layoutParams3 != null) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 == 2) {
                    f2 = (float) i4;
                    f = 1.0866141f;
                } else if (i2 == 3) {
                    f2 = (float) i4;
                    f = 1.125f;
                } else if (i != 0) {
                    if (i == 1) {
                        f2 = (float) i4;
                        f = 1.2244898f;
                    } else {
                        if (4 > i || i >= 6) {
                            z = false;
                        }
                        if (z && ((C54963d0) business(cls)).f154073p == null) {
                            f2 = (float) i4;
                            f = 1.5f;
                        } else if (i < 6 || ((C54963d0) business(cls)).f154073p != null) {
                            f2 = (float) i4;
                            f = 1.0843374f;
                        } else {
                            f2 = (float) i4;
                            f = 1.0f;
                        }
                    }
                }
                i3 = (int) (f2 / f);
                layoutParams3.height = i3;
                layoutParams3.topMargin = k0;
                layoutParams3.width = i4;
            }
            k0 = 0;
            layoutParams3.height = i3;
            layoutParams3.topMargin = k0;
            layoutParams3.width = i4;
        }
        ViewGroup viewGroup = this.commonTopContentRoot;
        ViewGroup.LayoutParams layoutParams4 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        RelativeLayout.LayoutParams layoutParams5 = layoutParams4 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams4 : null;
        if (layoutParams5 != null) {
            layoutParams5.height = i3;
            layoutParams5.topMargin = k0;
            layoutParams5.width = i4;
        }
        C60291e eVar = (C60291e) getPlugin(C60291e.class);
        ViewGroup viewGroup2 = eVar != null ? eVar.f166287d : null;
        if (viewGroup2 != null) {
            RelativeLayout relativeLayout = this.previewRoot;
            ViewGroup.LayoutParams layoutParams6 = relativeLayout != null ? relativeLayout.getLayoutParams() : null;
            if (layoutParams6 instanceof RelativeLayout.LayoutParams) {
                layoutParams = (RelativeLayout.LayoutParams) layoutParams6;
            }
            viewGroup2.setLayoutParams(layoutParams);
        }
        Log.m105924i(str, "getTrtcPlayerViewRect topMargin:" + k0 + " width:" + i4 + " height:" + i3);
        int i5 = k0 + videoSpaceHeight;
        return new Rect(0, i5, i4, i3 + i5);
    }

    public static /* synthetic */ Rect getTrtcPlayerViewRect$default(C56032b bVar, int i, int i2, C13604l lVar, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                lVar = null;
            }
            return bVar.getTrtcPlayerViewRect(i, i2, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrtcPlayerViewRect");
    }

    public static /* synthetic */ void hideLoadingLayer$default(C56032b bVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            bVar.hideLoadingLayer(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideLoadingLayer");
    }

    /* access modifiers changed from: private */
    public final void networkChange(int i) {
        C53075a.f148139a.mo73765e("NetWorkChange");
        for (C58121a n0 : getPluginList()) {
            n0.mo12054n0(i);
        }
        C62197e e0 = FinderLiveService.f159376d.mo77631e0();
        if (e0 != null) {
            boolean isLiveStarted = isLiveStarted();
            boolean z = ((C55004v1) business(C55004v1.class)).f154438i.size() > 0;
            int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
            Log.m105924i("MicroMsg.LiveCoreVisitor", "onNetworkChange status:" + i + ",isLiveStart:" + isLiveStarted + ",haveMultiStream:" + z + ", netType:" + netType);
            if (isLiveStarted && !e0.f176822Y0.mo75229c() && netType != -1 && !z) {
                C54421g gVar = e0.f176822Y0;
                gVar.mo75233i(e0.f176824a1, gVar.mo75227a());
                C54410e eVar = e0.f173038x;
                if (eVar != null) {
                    C54410e.C54411a.m61124a(eVar, 11, (Bundle) null, 2, (Object) null);
                }
            }
        }
    }

    public static /* synthetic */ void notifyAudienceMicUserChange$default(C56032b bVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            bVar.notifyAudienceMicUserChange(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyAudienceMicUserChange");
    }

    public static /* synthetic */ void notifyPKMicUserChange$default(C56032b bVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            bVar.notifyPKMicUserChange(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyPKMicUserChange");
    }

    public static /* synthetic */ boolean notifySEIMicUserChange$default(C56032b bVar, JSONObject jSONObject, boolean z, C13604l lVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                lVar = null;
            }
            return bVar.notifySEIMicUserChange(jSONObject, z, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifySEIMicUserChange");
    }

    private final void onLandscapeActionImpl(int i, int i2, Bundle bundle, Object obj) {
        Class cls = C54991o.class;
        int i3 = 0;
        ((C54991o) business(cls)).mo76021s4(false);
        boolean z = true;
        ((C54991o) business(cls)).f154350p0 = true;
        if (bundle == null || !bundle.containsKey("ACTION_POST_LANDSCAPE_DELAY")) {
            z = false;
        }
        if (z) {
            i3 = bundle.getInt("ACTION_POST_LANDSCAPE_DELAY");
        }
        String str = TAG;
        Log.m105924i(str, "onLandscapeAction action:" + bundle + ", orientation:" + getContext().getResources().getConfiguration().orientation + ",delayMs:" + i3);
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                if (i3 > 0) {
                    ((C62660c) aVar).mo87692R0(bundle, (long) i3);
                } else {
                    ((C62660c) aVar).mo12018Q0(bundle);
                }
            }
        }
    }

    private final void onPortraitActionImpl(int i, int i2, Bundle bundle, Object obj) {
        Class cls = C54991o.class;
        int i3 = 0;
        ((C54991o) business(cls)).mo76021s4(false);
        boolean z = true;
        ((C54991o) business(cls)).f154350p0 = true;
        if (bundle == null || !bundle.containsKey("ACTION_POST_PORTRAIT_DELAY")) {
            z = false;
        }
        if (z) {
            i3 = bundle.getInt("ACTION_POST_PORTRAIT_DELAY");
        }
        String str = TAG;
        Log.m105924i(str, "onPortraitAction action:" + bundle + ", orientation:" + getContext().getResources().getConfiguration().orientation + ",delayMs:" + i3);
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                if (i3 > 0) {
                    ((C62660c) aVar).mo12022e(bundle, obj, (long) i3);
                } else {
                    ((C62660c) aVar).mo11982T0(bundle, obj);
                }
            }
        }
        onPortscapeActionWithNoPlugin(bundle, obj);
    }

    private final void onPortscapeActionWithNoPlugin(Bundle bundle, Object obj) {
        Bundle bundle2 = null;
        String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        if (obj instanceof Bundle) {
            bundle2 = (Bundle) obj;
        }
        if (C87412m.m108589b(string, "PORTRAIT_ACTION_PRODUCT_REPLAY_VIEW") && bundle2 != null) {
            long j = bundle2.getLong("KEY_PROMOTE_ID", 0);
            C64370fp1 fp12 = new C64370fp1();
            fp12.parseFrom(bundle2.getByteArray("KEY_PROMOTE_ITEM"));
            int i = bundle2.getInt("KEY_PROMOTE_SOURCE", 0);
            String string2 = bundle2.getString("KEY_PROMOTE_JUMP_ID", "");
            String str = string2 == null ? "" : string2;
            C62042e eVar = C62042e.f176370a;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            eVar.mo87003F0(context, getBuContext(), j, fp12, i, "", str);
        }
    }

    /* access modifiers changed from: private */
    public final void onScreenClearEnd() {
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                C62660c cVar = (C62660c) aVar;
                cVar.mo87674K0(true);
                if (cVar.mo3200b()) {
                    cVar.mo87690J0(true);
                }
            }
        }
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59456s(liveRoomControllerStore));
    }

    /* access modifiers changed from: private */
    public final void onScreenClearStart() {
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                C62660c cVar = (C62660c) aVar;
                cVar.mo87675M0(true);
                if (cVar.mo3200b()) {
                    cVar.mo87691L0(true);
                }
            }
        }
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59457t(liveRoomControllerStore));
    }

    /* access modifiers changed from: private */
    public final void onScreenRecoveryEnd() {
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                C62660c cVar = (C62660c) aVar;
                cVar.mo87674K0(false);
                if (cVar.mo3200b()) {
                    cVar.mo87690J0(false);
                }
            }
        }
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59458u(liveRoomControllerStore));
    }

    /* access modifiers changed from: private */
    public final void onScreenRecoveryStart() {
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                C62660c cVar = (C62660c) aVar;
                cVar.mo87675M0(false);
                if (cVar.mo3200b()) {
                    cVar.mo87691L0(false);
                }
            }
        }
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59459v(liveRoomControllerStore));
    }

    /* access modifiers changed from: private */
    public final LinkedHashMap<String, Rect> onSeiGrabModeHandle(JSONObject jSONObject, int i, float f, Rect rect, C13604l<Integer, Integer> lVar) {
        Class cls = C54963d0.class;
        C61482c cVar = C61482c.f174809a;
        LinkedList<C59463a> e = cVar.mo86458e(jSONObject, ((C54963d0) business(cls)).mo75930m3(), new C56043l(this));
        LinkedList<C32459e> f2 = cVar.mo86459f(jSONObject);
        this.lastSEIMicCoverData = new C32458d(e, i, f);
        ((C54963d0) business(cls)).f154077t.setValue(new C59464c(e, rect, i, f, f2));
        this.lastMicCoverData = e;
        return genMicRectMap(e, rect);
    }

    /* access modifiers changed from: private */
    public final LinkedHashMap<String, Rect> onSeiNormalModeHandle(JSONObject jSONObject, int i, float f, Rect rect, C13604l<Integer, Integer> lVar) {
        Class cls = C54963d0.class;
        C61482c cVar = C61482c.f174809a;
        LinkedList<C59463a> g = cVar.mo86460g(jSONObject, ((C54963d0) business(cls)).mo75930m3(), new C56044m(this));
        LinkedList<C32459e> f2 = cVar.mo86459f(jSONObject);
        this.lastSEIMicCoverData = new C32458d(g, i, f);
        if (i != 0) {
            if (!(f == 0.0f)) {
                int i2 = C75044y4.m89990b(MMApplicationContext.getContext()).x;
                int i3 = C75044y4.m89990b(MMApplicationContext.getContext()).y;
                if (lVar != null) {
                    i2 = ((Number) lVar.f38555d).intValue();
                }
                if (lVar != null) {
                    i3 = ((Number) lVar.f38556e).intValue();
                }
                Point point = new Point(i2, i3);
                LinkedHashMap<String, Rect> c = cVar.mo86456c(getBuContext(), point, g, f);
                LinkedList<C59463a> a = cVar.mo86454a(point, g, c);
                ((C54963d0) business(cls)).f154077t.setValue(new C59464c(a, rect, i, f, f2));
                this.lastMicCoverData = a;
                return c;
            }
        }
        ((C54963d0) business(cls)).f154077t.setValue(new C59464c(g, rect, i, f, f2));
        this.lastMicCoverData = g;
        return genMicRectMap(g, rect);
    }

    public static /* synthetic */ boolean showAlertDialog$default(C56032b bVar, Activity activity, String str, String str2, String str3, boolean z, int i, Object obj) {
        if (obj == null) {
            return bVar.showAlertDialog(activity, str, str2, str3, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlertDialog");
    }

    public static /* synthetic */ void showProgressWithBlurBg$default(C56032b bVar, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "";
            }
            bVar.showProgressWithBlurBg(str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgressWithBlurBg");
    }

    /* access modifiers changed from: private */
    public final void showStatistics() {
        Class cls = C55002v.class;
        C58111e eVar = ((C55002v) business(cls)).f154430f;
        if (C58739j4.f168176a.mo83692U() && eVar != null) {
            ((C55002v) business(cls)).getClass();
            if (C55002v.f154429h) {
                C56048r rVar = new C56048r(this, eVar);
                ((C119157j) C119157j.f356862d).mo183875f(new C58397p0(rVar));
                return;
            }
            hideStatistics();
        }
    }

    public static /* synthetic */ void showTipWithBlurBg$default(C56032b bVar, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "";
            }
            bVar.showTipWithBlurBg(str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTipWithBlurBg");
    }

    public static /* synthetic */ void showTipWithBlurBgAction$default(C56032b bVar, String str, String str2, String str3, C32224a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                aVar = null;
            }
            bVar.showTipWithBlurBgAction(str, str2, str3, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTipWithBlurBgAction");
    }

    public static /* synthetic */ void showVerificationLayerInfo$default(C56032b bVar, String str, String str2, String str3, boolean z, boolean z2, C32226l lVar, int i, Object obj) {
        if (obj == null) {
            C32226l lVar2 = null;
            String str4 = (i & 2) != 0 ? null : str2;
            String str5 = (i & 4) != 0 ? null : str3;
            boolean z3 = (i & 8) != 0 ? false : z;
            boolean z4 = (i & 16) != 0 ? true : z2;
            if ((i & 32) == 0) {
                lVar2 = lVar;
            }
            bVar.showVerificationLayerInfo(str, str4, str5, z3, z4, lVar2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showVerificationLayerInfo");
    }

    private final void startPauseTime() {
        this.loadingTipWidget.mo85325f();
    }

    public void activate(C54127h hVar, boolean z, boolean z2) {
        C87412m.m108594g(hVar, "config");
        this.checkMiniWin = false;
    }

    public final void applyLiveScene(int i) {
        String str = TAG;
        Log.m105924i(str, "applyLiveScene liveScene:" + i);
        ((C54991o) business(C54991o.class)).mo75955C4(i);
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                aVar.mo10792g(((C62660c) aVar).f177938i);
            }
        }
    }

    public void applyState(int i, boolean z, int i2, boolean z2, Bundle bundle) {
        for (C58121a b0 : getPluginList()) {
            b0.mo11966b0(i, i2, bundle);
        }
    }

    public void bindData(C54127h hVar) {
        C87412m.m108594g(hVar, "data");
        String str = TAG;
        Log.m105924i(str, "bind view:" + hashCode() + "  liveId:" + hVar.f151977d.f157064e);
        setData(hVar);
        setBuContext(hVar.f151978e);
        checkAndResetLifeCycle();
        C54991o oVar = (C54991o) business(C54991o.class);
        oVar.getClass();
        boolean z = false;
        oVar.f154308e2 = C32444a.f86106V.mo60266n().intValue() == 1;
        if (C32444a.f86109W.mo60266n().intValue() == 1) {
            z = true;
        }
        oVar.f154313f2 = z;
        ((C13022d0) business(C13022d0.class)).mo12536K3();
        C60357c5 c5Var = this.loadingTipWidget;
        C45795b buContext2 = getBuContext();
        c5Var.getClass();
        C87412m.m108594g(buContext2, "liveData");
        c5Var.f172082m = buContext2;
    }

    public <T extends C39622i0> T business(Class<T> cls) {
        C87412m.m108594g(cls, "bu");
        return getBuContext().mo71262a(cls);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        r3 = (r3 = r3.getResources()).getConfiguration();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean changeScreenToLandscape() {
        /*
            r12 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r0 = r12.business(r0)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75966J4()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00b7
            cj1.m4 r0 = r12.rotationHelper
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r3 = r0.f153609a
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r3 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r3
            r4 = 0
            if (r3 == 0) goto L_0x0030
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x0030
            android.content.res.Configuration r3 = r3.getConfiguration()
            if (r3 == 0) goto L_0x0030
            int r3 = r3.orientation
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0031
        L_0x0030:
            r3 = r4
        L_0x0031:
            if (r3 != 0) goto L_0x0035
            goto L_0x00b7
        L_0x0035:
            int r5 = r3.intValue()
            if (r5 != r1) goto L_0x00b7
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r5 = r0.f153609a
            java.lang.Object r5 = r5.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r5 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r5
            if (r5 == 0) goto L_0x00b7
            java.lang.Class<aw.d> r6 = p447aw.C103918d.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            aw.d r6 = (p447aw.C103918d) r6
            r7 = 21
            boolean r6 = r6.mo125776TW(r5, r7)
            if (r6 == 0) goto L_0x009d
            r5.mo79124M7(r1)
            r5.setRequestedOrientation(r2)
            java.lang.String r5 = r0.f153610b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "changeScreenToLandscape curOrientation:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = ",requestOrientation:"
            r6.append(r3)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r3 = r0.f153609a
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r3 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r3
            if (r3 == 0) goto L_0x0081
            int r3 = r3.getRequestedOrientation()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L_0x0081:
            r6.append(r4)
            java.lang.String r3 = ",change:"
            r6.append(r3)
            r6.append(r1)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            java.lang.String r3 = r0.f153610b
            java.lang.String r4 = "disableAutoRotation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r0.f153611c = r2
            goto L_0x00b8
        L_0x009d:
            java.lang.String r1 = r0.f153610b
            java.lang.String r3 = "changeScreenToLandscape requestPermission"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            com.tencent.mm.sdk.coroutines.LifecycleScope r6 = r5.getUICScope()
            r7 = 0
            r8 = 0
            cj1.j4 r9 = new cj1.j4
            r9.<init>(r0, r5, r4)
            r10 = 3
            r11 = 0
            a14.z1 r1 = a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            r0.f153612d = r1
        L_0x00b7:
            r1 = 0
        L_0x00b8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.changeScreenToLandscape():boolean");
    }

    public final boolean changeScreenToPortrait() {
        if (((C54991o) business(C54991o.class)).mo75966J4()) {
            return this.rotationHelper.mo75696b();
        }
        return false;
    }

    public final C39952a checkActiveAndGet() {
        if (!C53930o0.m60560g(this.securityDataScope)) {
            C39952a aVar = this.securityDataScope;
            this.securityDataScope = new C39952a(aVar.f159310d, aVar.f159311e);
        }
        return this.securityDataScope;
    }

    public boolean checkFinishWhenDiffTask(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (!(getContext() instanceof MMFinderUI) || C87412m.m108589b(getContext().getClass(), activity.getClass())) {
            return false;
        }
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        MMFinderUI mMFinderUI = (MMFinderUI) context;
        if (mMFinderUI.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED) {
            this.finishActivityNotReleaseLive = true;
            mMFinderUI.finish();
        }
        return true;
    }

    public final void checkPauseStateWhenLiveStart() {
        Class cls = C54991o.class;
        C64510l21 l212 = ((C54991o) business(cls)).f154293a3;
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("checkPauseStateWhenLiveStart FinderLiveLayerShowInfo:");
        sb.append(l212 != null ? Integer.valueOf(l212.f184023d) : null);
        sb.append(", ");
        sb.append(l212 != null ? Integer.valueOf(l212.f184025f) : null);
        sb.append('!');
        Log.m105920e(str, sb.toString());
        if (l212 != null) {
            updateLayerShowInfo(l212, true);
            ((C54991o) business(cls)).f154293a3 = null;
        }
    }

    public final void clearMicData() {
        this.lastRoomPkMicUserList = null;
        this.lastPkMicUser = null;
        this.lastMicUserList.clear();
        setCurrentMicData(new JSONObject());
        notifyAudienceMicUserChange(false);
    }

    public final void disableRatation() {
        Log.m105924i(TAG, "disableOritation");
        C61901d dVar = this.orientationEventListener;
        if (dVar != null) {
            dVar.disable();
        }
        C61901d dVar2 = this.orientationEventListener;
        if (dVar2 != null) {
            ((C98607d) dVar2).f289116g = null;
        }
        this.orientationEventListener = null;
    }

    public final void enableAutoRotation() {
        if (((C54991o) business(C54991o.class)).mo75966J4()) {
            C54792m4 m4Var = this.rotationHelper;
            Log.m105924i(m4Var.f153610b, "enableAutoRotation");
            m4Var.f153611c = true;
        }
    }

    public final void enableRotation() {
        Log.m105924i(TAG, "enableOritation");
        if (((C54991o) business(C54991o.class)).mo75966J4()) {
            if (this.orientationEventListener == null) {
                this.orientationEventListener = ((C61903f) C86312j.m106911c(C61903f.class)).mo86831zZ(getContext(), 2);
            }
            C61901d dVar = this.orientationEventListener;
            if (dVar != null) {
                ((C98607d) dVar).f289116g = this;
            }
            if (dVar != null) {
                ((C98607d) dVar).enable();
            }
        }
    }

    public final boolean fillBlurBg(String str, boolean z) {
        return this.loadingTipWidget.mo85322b(str, z);
    }

    public void finish() {
        if (getContext() instanceof MMFinderUI) {
            this.isManualClosed = true;
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            ((MMFinderUI) context).finish();
        }
    }

    public final void forceScreenToLandscape() {
        Class cls = C54991o.class;
        if (changeScreenToLandscape()) {
            disableRatation();
            ((C54991o) business(cls)).mo76021s4(true);
            ((C54991o) business(cls)).f154350p0 = false;
        }
    }

    public final void forceScreenToPortrait() {
        Class cls = C54991o.class;
        disableRatation();
        if (changeScreenToPortrait()) {
            ((C54991o) business(cls)).mo76021s4(true);
            ((C54991o) business(cls)).f154350p0 = false;
        }
    }

    public View genRootViewByStub(int i, View view) {
        C87412m.m108594g(view, "root");
        View inflate = ((ViewStub) view.findViewById(i)).inflate();
        C87412m.m108593f(inflate, "stub.inflate()");
        return inflate;
    }

    public final C55908a getActivityScope() {
        return this.activityScope;
    }

    public final boolean getAudienPreloadCDNLiveConfig() {
        return this.audienPreloadCDNLiveConfig;
    }

    public final String getBgInfo() {
        C60357c5 c5Var = this.loadingTipWidget;
        c5Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("blurBgView:");
        sb.append(c5Var.f172073d.getElevation());
        sb.append('-');
        boolean z = false;
        sb.append(c5Var.f172073d.getVisibility() == 0);
        sb.append(";loading:");
        sb.append(c5Var.f172083n.getElevation());
        sb.append('-');
        sb.append(c5Var.f172083n.getVisibility() == 0);
        sb.append(",root:");
        sb.append(c5Var.f172070a.getAlpha());
        sb.append("-root:");
        if (c5Var.f172070a.getVisibility() == 0) {
            z = true;
        }
        sb.append(z);
        return sb.toString();
    }

    public final C45795b getBuContext() {
        C45795b bVar = this.buContext;
        if (bVar != null) {
            return bVar;
        }
        C87412m.m108603p("buContext");
        throw null;
    }

    public final boolean getCheckMiniWin() {
        return this.checkMiniWin;
    }

    public final ViewGroup getCommonTopContentRoot() {
        return this.commonTopContentRoot;
    }

    public final C61304a getConfettiBitmapManager() {
        return this.confettiBitmapManager;
    }

    public <T extends LiveRoomController> T getController(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        return getData().f151979f.controller(cls);
    }

    public final int getCurNetworkQuality() {
        return this.curNetworkQuality;
    }

    public final int getCurNetworkType() {
        return this.curNetworkType;
    }

    public final String getCurrentAppId() {
        return this.currentAppId;
    }

    public final JSONObject getCurrentMicData() {
        return this.currentMicData;
    }

    public final C54127h getData() {
        C54127h hVar = this.data;
        if (hVar != null) {
            return hVar;
        }
        C87412m.m108603p("data");
        throw null;
    }

    public final FrameLayout getEmptyReuseFrameLayout() {
        return (FrameLayout) this.emptyReuseFrameLayout$delegate.getValue();
    }

    public final C3204b getExternalCallback() {
        return this.externalCallback;
    }

    public C54795n5 getFinderLiveAssistant() {
        FinderLiveService.f159376d.getClass();
        return FinderLiveService.f159396y;
    }

    public final boolean getFinishActivityNotReleaseLive() {
        return this.finishActivityNotReleaseLive;
    }

    public final int getLastLiveState() {
        return this.lastLiveState;
    }

    public final JSONObject getLastMicData() {
        return this.lastMicData;
    }

    public final ArrayList<C54130j> getLastMicUserList() {
        return this.lastMicUserList;
    }

    public final int getLastOrientation() {
        return this.lastOrientation;
    }

    public final C54130j getLastPkMicUser() {
        return this.lastPkMicUser;
    }

    public final JSONArray getLastRoomPkMicUserList() {
        return this.lastRoomPkMicUserList;
    }

    public final int getLastUIState() {
        return this.lastUIState;
    }

    public final C103766u getLifeCycleRegistry() {
        return this.lifeCycleRegistry;
    }

    public C39623j getLifecycle() {
        return this.lifeCycleRegistry;
    }

    public abstract /* synthetic */ int getLiveRole();

    public final C60357c5 getLoadingTipWidget() {
        return this.loadingTipWidget;
    }

    public final boolean getMiniWinPermission() {
        return this.miniWinPermission;
    }

    public final C61901d getOrientationEventListener() {
        return this.orientationEventListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends qj1.C62660c> T getPlugin(java.lang.Class<T> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "modelClass"
            gy3.C87412m.m108594g(r6, r0)
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.getPluginList()
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.getPluginList()     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0012:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00a6 }
            d60.a r2 = (d60.C58121a) r2     // Catch:{ all -> 0x00a6 }
            boolean r3 = r6.isInstance(r2)     // Catch:{ all -> 0x00a6 }
            if (r3 == 0) goto L_0x0012
            qj1.c r2 = (qj1.C62660c) r2     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)
            return r2
        L_0x0028:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "Finder.Live:"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = r6.getCanonicalName()     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            java.util.HashMap r2 = r5.getLazyInitPluginMap()     // Catch:{ all -> 0x00a6 }
            boolean r2 = r2.containsKey(r1)     // Catch:{ all -> 0x00a6 }
            if (r2 == 0) goto L_0x00a3
            java.util.HashMap r2 = r5.getLazyInitPluginMap()     // Catch:{ all -> 0x00a6 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00a6 }
            fy3.a r2 = (fy3.C32224a) r2     // Catch:{ all -> 0x00a6 }
            if (r2 == 0) goto L_0x00a3
            java.lang.Object r2 = r2.invoke()     // Catch:{ all -> 0x00a6 }
            qj1.c r2 = (qj1.C62660c) r2     // Catch:{ all -> 0x00a6 }
            if (r2 == 0) goto L_0x00a3
            java.util.HashMap r3 = r5.getLazyInitPluginMap()     // Catch:{ all -> 0x00a6 }
            r3.remove(r1)     // Catch:{ all -> 0x00a6 }
            boolean r6 = r6.isInstance(r2)     // Catch:{ all -> 0x00a6 }
            if (r6 == 0) goto L_0x0086
            java.util.concurrent.CopyOnWriteArrayList r6 = r5.getPluginList()     // Catch:{ all -> 0x00a6 }
            r6.add(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r6 = TAG     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r3.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = "lazy init plugin with key:"
            r3.append(r4)     // Catch:{ all -> 0x00a6 }
            r3.append(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)     // Catch:{ all -> 0x00a6 }
            goto L_0x00a1
        L_0x0086:
            java.lang.String r6 = TAG     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r3.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r4 = "lazy init plugin with key:"
            r3.append(r4)     // Catch:{ all -> 0x00a6 }
            r3.append(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = " create error!"
            r3.append(r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00a6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r1)     // Catch:{ all -> 0x00a6 }
        L_0x00a1:
            monitor-exit(r0)
            return r2
        L_0x00a3:
            r6 = 0
            monitor-exit(r0)
            return r6
        L_0x00a6:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.getPlugin(java.lang.Class):qj1.c");
    }

    public final List<C58121a> getPlugins() {
        return getPluginList();
    }

    public final RelativeLayout getPreviewRoot() {
        return this.previewRoot;
    }

    public final C39952a getSecurityDataScope() {
        return this.securityDataScope;
    }

    public final C46261j6 getStatisticsWidget() {
        return this.statisticsWidget;
    }

    public final Fragment getUicFragment() {
        return this.uicFragment;
    }

    public final int getVideoSpaceHeight() {
        C59079s2 s2Var = (C59079s2) getData().f151979f.controller(C59079s2.class);
        if (s2Var != null) {
            return s2Var.f169029p;
        }
        return 0;
    }

    public final C55908a getViewScope() {
        return this.viewScope;
    }

    public final C60351b9 getWarnningCountWidget() {
        return (C60351b9) this.warnningCountWidget$delegate.getValue();
    }

    public final void goGetLuckMoney(Activity activity, String str, boolean z) {
        Class cls = C55001u.class;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e() || !z) {
            String str2 = TAG;
            Log.m105928w(str2, "goGetLuckMoney redPacketId:" + str + " enableGetLuckMoney:" + z + " return for isTeenMode");
            return;
        }
        String str3 = TAG;
        Log.m105924i(str3, "goGetLuckMoney redPacketId:" + str);
        if (str != null) {
            int i = C62042e.f176370a.mo87027N0() ? 1 : 2;
            C54795n5 finderLiveAssistant = getFinderLiveAssistant();
            if (finderLiveAssistant != null) {
                finderLiveAssistant.mo75743k(((C55001u) business(cls)).f154420q.f182392d, ((C55001u) business(cls)).f154416j, ((C55001u) business(cls)).f154423t, ((C55001u) business(cls)).f154417n, i, C26236u.m33719b(str), new GetLuckMoneyCallback(new WeakReference(this), new WeakReference(activity)));
            }
        }
    }

    public final void handleRecvLuckyMoneyErr(int i) {
        C61926c.m72668M(new C56039h(i, this));
    }

    public void hideLoadingLayer(boolean z) {
        C60357c5 c5Var = this.loadingTipWidget;
        c5Var.f172074e.removeCallbacks(c5Var.f172084o);
        C45795b bVar = c5Var.f172082m;
        c5Var.mo85322b(bVar != null ? ((C54991o) bVar.mo71262a(C54991o.class)).f154345o : null, false);
        if (c5Var.f172072c == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            c5Var.f172072c = ofFloat;
            if (ofFloat != null) {
                ofFloat.addUpdateListener(new C60385d5(c5Var));
                ofFloat.addListener(new C60391e5(c5Var));
            }
        }
        if (z) {
            ValueAnimator valueAnimator = c5Var.f172072c;
            if (valueAnimator != null) {
                valueAnimator.start();
                return;
            }
            return;
        }
        c5Var.mo85323c();
        C60357c5.m70622d(c5Var, false, 1, (Object) null);
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad7));
        c5Var.f172076g.setVisibility(8);
        c5Var.f172078i.setVisibility(8);
        c5Var.f172079j.setVisibility(8);
        TextView textView = c5Var.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        c5Var.f172083n.setVisibility(8);
        c5Var.f172083n.setBackgroundColor(Color.parseColor("#99000000"));
        c5Var.f172083n.setClickable(false);
    }

    public final void hideProgress() {
        this.loadingTipWidget.mo85323c();
    }

    public final void hideStatistics() {
        C46261j6 j6Var = this.statisticsWidget;
        if (j6Var != null) {
            j6Var.f124704a.setVisibility(8);
            j6Var.f124705b.setVisibility(8);
        }
    }

    public void hideTimeCount() {
        C60357c5.m70622d(this.loadingTipWidget, false, 1, (Object) null);
    }

    public void initLogic(LiveConfig liveConfig, boolean z) {
        C87412m.m108594g(liveConfig, "config");
    }

    public final boolean isDestroyed() {
        if (getContext() == null || !(getContext() instanceof Activity)) {
            return false;
        }
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((Activity) context).isDestroyed();
    }

    public final boolean isInLinkMic() {
        Class cls = C54963d0.class;
        JSONArray jSONArray = this.lastRoomPkMicUserList;
        int length = jSONArray != null ? jSONArray.length() : 0;
        int size = ((C54963d0) business(cls)).f154074q.size();
        boolean z = ((C54963d0) business(cls)).f154073p != null;
        String str = TAG;
        Log.m105924i(str, "isInLinkMic size roomPkUserList: " + length + " audienceListSize: " + size + " curLinkMicUser: " + z);
        return length > 0 || size > 0 || z;
    }

    public final boolean isLiveFinished() {
        return ((C54991o) business(C54991o.class)).mo75997d4();
    }

    public final boolean isLiveStarted() {
        return ((C54991o) business(C54991o.class)).mo75999e4();
    }

    public final boolean isManualClosed() {
        return this.isManualClosed;
    }

    public final boolean isScreenClear() {
        return this.isScreenClear;
    }

    public boolean isSwipeBack() {
        C35640b bVar = C35640b.f95284a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        Class cls = C34647n.class;
        if (C86312j.m106916h(cls)) {
            return ((C34647n) C86312j.m106911c(cls)).Db0(context);
        }
        return false;
    }

    public void keyboardChange(boolean z, int i) {
        for (C58121a aVar : getPluginList()) {
            if (aVar.mo14483f0() == 0) {
                aVar.mo8378h0(z, i);
            }
        }
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59441d(liveRoomControllerStore, z, i));
    }

    public void mount() {
        super.mount();
        checkAndResetLifeCycle();
        C86709a0.m107529k().mo121126a(this.onNetworkChange);
        C66521k0.f191361a = this;
        C60299b bVar = C60299b.f171929a;
        C60299b.f171936h = new WeakReference<>(this);
        C59447j jVar = C59447j.f169870a;
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        jVar.mo84557i(liveRoomControllerStore, new C8321l(liveRoomControllerStore, this));
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        if (((C58312g) rVar.mo62443b(context).mo75002a(C58312g.class)).f166967e) {
            LiveRoomControllerStore liveRoomControllerStore2 = getData().f151979f;
            C87412m.m108594g(liveRoomControllerStore2, "<this>");
            jVar.mo84557i(liveRoomControllerStore2, new C59454q(liveRoomControllerStore2));
        }
    }

    public final boolean needMiniWindow() {
        return ((C54991o) business(C54991o.class)).f154350p0;
    }

    public final boolean needRemoveActivity() {
        return ((C54991o) business(C54991o.class)).f154383x0;
    }

    public void notifyAudienceMicUserChange(boolean z) {
    }

    public void notifyPKMicUserChange(boolean z) {
    }

    public boolean notifySEIMicUserChange(JSONObject jSONObject, boolean z, C13604l<Integer, Integer> lVar) {
        Class cls = C55001u.class;
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59897d(liveRoomControllerStore, jSONObject));
        if (jSONObject == null) {
            Log.m105924i(TAG, "notifyRoomPKMicUserChange: micData is null!");
            return false;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("list");
        String str = ((C55001u) business(cls)).f154419p.f182319n;
        if (str == null) {
            str = "";
        }
        boolean b = C61482c.f174809a.mo86455b(str, jSONObject, this.lastSEIMicCoverData);
        String str2 = TAG;
        Log.m105924i(str2, "notifyRoomPKMicUserChange diffSeiDataChange: " + b + " forceUpdate:" + z + ", micData: " + jSONObject + " lastMicData:" + this.lastMicData);
        if ((!b && !z) || ((C55001u) business(cls)).f154419p.f182319n == null) {
            return false;
        }
        C61926c.m72668M(new C56041j(this, jSONObject, optJSONArray, lVar));
        return true;
    }

    public void onAcceptBattleTimeout() {
    }

    public void onAcceptLiveMic(C66505a aVar) {
        C87412m.m108594g(aVar, "info");
    }

    public void onAcceptLiveMicSizeCheck(C66505a aVar) {
        Class cls = C54963d0.class;
        Class cls2 = C54991o.class;
        C87412m.m108594g(aVar, "info");
        String str = TAG;
        Log.m105924i(str, "onAcceptLiveMicSizeCheck: self: " + ((C54991o) business(cls2)).mo76015n4() + " userId: " + aVar.f191310c + " audienceSize: " + ((C54963d0) business(cls)).f154074q.size());
        if (Util.isEqual(((C54991o) business(cls2)).mo76015n4(), aVar.f191310c) && ((C54963d0) business(cls)).f154074q.size() == 0 && C87412m.m108589b(((C39981t0) business(C39981t0.class)).f107198j.getValue(), Boolean.FALSE)) {
            RelativeLayout.LayoutParams layoutParams = null;
            int k0 = C62042e.m72807k0(C62042e.f176370a, 0, 0, 3, (Object) null);
            int i = C75044y4.m89990b(MMApplicationContext.getContext()).x;
            int width = (int) (((float) getWidth()) / 1.2244898f);
            ViewGroup.LayoutParams layoutParams2 = this.previewRoot.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.height = width;
                layoutParams3.topMargin = k0;
                layoutParams3.width = i;
            }
            ViewGroup viewGroup = this.commonTopContentRoot;
            ViewGroup.LayoutParams layoutParams4 = viewGroup != null ? viewGroup.getLayoutParams() : null;
            if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                layoutParams = (RelativeLayout.LayoutParams) layoutParams4;
            }
            if (layoutParams != null) {
                layoutParams.height = width;
                layoutParams.topMargin = k0;
                layoutParams.width = i;
            }
        }
    }

    public void onAcceptMicPkTimeout() {
    }

    public void onAcceptMicTimeout(String str) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = TAG;
        Log.m105924i(str, "onActivityResult,requestCode:" + i + ",resultCode:" + i2);
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59442e(liveRoomControllerStore, i, i2, intent));
    }

    public void onAnchorCallInterruption(boolean z) {
        C54773i5 i5Var = C54773i5.f153520a;
        Log.m105924i("Finder.FinderLiveSysMsgCallback", "notify anchor call interruption change: " + z);
        for (Map.Entry<String, C32226l<Boolean, C13598b0>> value : C54773i5.f153527h.entrySet()) {
            ((C32226l) value.getValue()).invoke(Boolean.valueOf(z));
        }
    }

    public void onAnchorConnectionChange(boolean z) {
        C54773i5 i5Var = C54773i5.f153520a;
        Log.m105924i("Finder.FinderLiveSysMsgCallback", "notify anchor connection change");
        for (Map.Entry<String, C32226l<Boolean, C13598b0>> value : C54773i5.f153526g.entrySet()) {
            ((C32226l) value.getValue()).invoke(Boolean.valueOf(z));
        }
    }

    public void onApplyBattleTimeout() {
    }

    public void onApplyLiveMic(C66507b bVar) {
        C87412m.m108594g(bVar, "info");
    }

    public void onApplyMicPkTimeout() {
    }

    public void onApplyMicTimeout() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1 = rx3.C13598b0.f38549a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onBackPress() {
        /*
            r5 = this;
            boolean r0 = super.onBackPress()
            if (r0 != 0) goto L_0x0041
            al1.h r0 = r5.getData()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r0.f151979f
            java.lang.String r1 = "<this>"
            gy3.C87412m.m108594g(r0, r1)
            monitor-enter(r0)
            java.util.HashSet r1 = r0.getControllers()     // Catch:{ all -> 0x003e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x003e }
        L_0x001a:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003e }
            r3 = 0
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003e }
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r2 = (com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController) r2     // Catch:{ all -> 0x003e }
            boolean r4 = r2 instanceof gh1.C59440c     // Catch:{ all -> 0x003e }
            if (r4 == 0) goto L_0x002e
            gh1.c r2 = (gh1.C59440c) r2     // Catch:{ all -> 0x003e }
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.mo9121e()     // Catch:{ all -> 0x003e }
        L_0x0035:
            if (r3 == 0) goto L_0x001a
            r3 = 1
            monitor-exit(r0)
            goto L_0x003d
        L_0x003a:
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003e }
            monitor-exit(r0)
        L_0x003d:
            return r3
        L_0x003e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.onBackPress():boolean");
    }

    public void onBanLiveComment(C38964c cVar) {
        C87412m.m108594g(cVar, "info");
    }

    public void onCloseApplyLiveMic(C38965d dVar) {
        C87412m.m108594g(dVar, "info");
    }

    public void onCloseLive(C38966e eVar) {
        C87412m.m108594g(eVar, "info");
        if (((C55001u) business(C55001u.class)).f154420q.f182392d == eVar.f104982a) {
            C54773i5 i5Var = C54773i5.f153520a;
            Log.m105924i("Finder.FinderLiveSysMsgCallback", "notify close live");
            for (Map.Entry<String, C32224a<C13598b0>> value : C54773i5.f153524e.entrySet()) {
                ((C32224a) value.getValue()).invoke();
            }
        }
    }

    public void onCloseLiveMic(C66512f fVar) {
        C87412m.m108594g(fVar, "info");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        for (C58121a aVar : getPluginList()) {
            C62660c cVar = aVar instanceof C62660c ? (C62660c) aVar : null;
            if (cVar != null) {
                cVar.mo12017O0(configuration);
            }
        }
    }

    public final void onLandscapeAction(int i, int i2, Bundle bundle, Object obj) {
        if (!isLandscape()) {
            forceScreenToLandscape();
        } else {
            onLandscapeActionImpl(i, i2, bundle, obj);
        }
    }

    public abstract void onLiveEventCallback(int i, Bundle bundle);

    public void onLiveMicSucc(C66517i0 i0Var) {
        C87412m.m108594g(i0Var, "info");
    }

    public void onNewIntent(Intent intent) {
        for (C58121a aVar : getPluginList()) {
            C62660c cVar = aVar instanceof C62660c ? (C62660c) aVar : null;
            if (cVar != null) {
                cVar.mo87693S0(intent);
            }
        }
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59443f(liveRoomControllerStore, intent));
    }

    public void onOnlineLiveList(C38970o0 o0Var) {
        C87412m.m108594g(o0Var, "info");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOrientationChange(int r13) {
        /*
            r12 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r12.business(r0)
            cl1.o r1 = (cl1.C54991o) r1
            int r1 = r1.f154351p1
            r2 = -1
            if (r1 == r2) goto L_0x000f
            if (r1 == r13) goto L_0x0039
        L_0x000f:
            r12.enableAutoRotation()
            java.lang.String r2 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onOrientationChange lastRotationFromSensor:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ",cur orientation:"
            r3.append(r1)
            r3.append(r13)
            java.lang.String r1 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            androidx.lifecycle.i0 r0 = r12.business(r0)
            cl1.o r0 = (cl1.C54991o) r0
            r0.mo76025w4(r13)
        L_0x0039:
            cj1.m4 r0 = r12.rotationHelper
            boolean r1 = r0.f153611c
            if (r1 == 0) goto L_0x0139
            r1 = 1
            r2 = 0
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0053 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0053 }
            java.lang.String r4 = "accelerometer_rotation"
            int r3 = android.provider.Settings.System.getInt(r3, r4)     // Catch:{ all -> 0x0053 }
            if (r3 != r1) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x0053:
            r3 = move-exception
            java.lang.String r4 = r0.f153610b
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = "checkSystemAutoRotation"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r3, r6, r5)
        L_0x005d:
            r3 = 0
        L_0x005e:
            if (r3 == 0) goto L_0x0139
            a14.z1 r3 = r0.f153612d
            if (r3 == 0) goto L_0x006e
            a14.a r3 = (a14.C53851a) r3
            boolean r3 = r3.mo74466a()
            if (r3 != r1) goto L_0x006e
            r3 = 1
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            if (r3 == 0) goto L_0x007a
            java.lang.String r13 = r0.f153610b
            java.lang.String r0 = "onOrientationChange permissionJob isActive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            goto L_0x0139
        L_0x007a:
            r3 = 90
            if (r13 == r3) goto L_0x0087
            r4 = 270(0x10e, float:3.78E-43)
            if (r13 == r4) goto L_0x0087
            r0.mo75696b()
            goto L_0x0139
        L_0x0087:
            if (r13 != r3) goto L_0x008b
            r13 = 1
            goto L_0x008c
        L_0x008b:
            r13 = 0
        L_0x008c:
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r3 = r0.f153609a
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r3 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r3
            r4 = 0
            if (r3 == 0) goto L_0x00aa
            android.content.res.Resources r3 = r3.getResources()
            if (r3 == 0) goto L_0x00aa
            android.content.res.Configuration r3 = r3.getConfiguration()
            if (r3 == 0) goto L_0x00aa
            int r3 = r3.orientation
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00ab
        L_0x00aa:
            r3 = r4
        L_0x00ab:
            if (r3 != 0) goto L_0x00af
            goto L_0x0139
        L_0x00af:
            int r5 = r3.intValue()
            if (r5 != r1) goto L_0x0139
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r5 = r0.f153609a
            java.lang.Object r5 = r5.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r5 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r5
            if (r5 == 0) goto L_0x0139
            java.lang.Class<aw.d> r6 = p447aw.C103918d.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            aw.d r6 = (p447aw.C103918d) r6
            r7 = 21
            boolean r6 = r6.mo125776TW(r5, r7)
            if (r6 == 0) goto L_0x011f
            r5.mo79124M7(r1)
            if (r13 == 0) goto L_0x00da
            r13 = 8
            r5.setRequestedOrientation(r13)
            goto L_0x00dd
        L_0x00da:
            r5.setRequestedOrientation(r2)
        L_0x00dd:
            java.lang.String r13 = r0.f153610b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "changeScreenToUserLandscape curOrientation:"
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = ",requestOrientation:"
            r5.append(r3)
            java.lang.ref.WeakReference<com.tencent.mm.plugin.finder.ui.MMFinderUI> r3 = r0.f153609a
            java.lang.Object r3 = r3.get()
            com.tencent.mm.plugin.finder.ui.MMFinderUI r3 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r3
            if (r3 == 0) goto L_0x0103
            int r3 = r3.getRequestedOrientation()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L_0x0103:
            r5.append(r4)
            java.lang.String r3 = ",change:"
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            java.lang.String r13 = r0.f153610b
            java.lang.String r1 = "disableAutoRotation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            r0.f153611c = r2
            goto L_0x0139
        L_0x011f:
            java.lang.String r13 = r0.f153610b
            java.lang.String r1 = "changeScreenToUserLandscape requestPermission"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r1)
            com.tencent.mm.sdk.coroutines.LifecycleScope r6 = r5.getUICScope()
            r7 = 0
            r8 = 0
            cj1.k4 r9 = new cj1.k4
            r9.<init>(r0, r5, r4)
            r10 = 3
            r11 = 0
            a14.z1 r13 = a14.C53895h.m60466d(r6, r7, r8, r9, r10, r11)
            r0.f153612d = r13
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.onOrientationChange(int):void");
    }

    public void onPkMicLiveRoomImgChanged(C49765hx0 hx02) {
        C87412m.m108594g(hx02, "contract");
        C60291e eVar = (C60291e) getPlugin(C60291e.class);
        if (eVar != null) {
            if (!(eVar.mo14483f0() == 0)) {
                eVar = null;
            }
            if (eVar != null) {
                C61926c.m72668M(new C60290d(eVar, hx02));
            }
        }
    }

    public final void onPortraitAction(int i, int i2, Bundle bundle, Object obj) {
        if (isLandscape()) {
            forceScreenToPortrait();
        } else {
            onPortraitActionImpl(i, i2, bundle, obj);
        }
    }

    public void onRandomMatchTimeout() {
    }

    public void onRandomMicAccept(C52013xs0 xs02, C64429ht0 ht02) {
        C87412m.m108594g(xs02, "appMsg");
        C87412m.m108594g(ht02, "info");
    }

    public void onRandomMicApply(C50593nu0 nu02) {
        C87412m.m108594g(nu02, "info");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59444g(liveRoomControllerStore, i, strArr, iArr));
    }

    public void onScreenClear(boolean z) {
        for (C58121a aVar : getPluginList()) {
            if ((aVar instanceof C62660c) && ((C62660c) aVar).mo3200b()) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append(aVar.mo82894j0());
                sb.append(" screen switch, visibility:");
                sb.append(aVar.f166287d.getVisibility());
                sb.append(", cacheVisibility:");
                C62660c cVar = (C62660c) aVar;
                sb.append(cVar.f177938i);
                sb.append(", clear:");
                sb.append(z);
                Log.m105924i(str, sb.toString());
                cVar.f177939j = z ? 8 : 65535;
            }
        }
        if (z) {
            this.isScreenClear = true;
            doScreenClearAnimation();
            return;
        }
        this.isScreenClear = false;
        doScreenRecoveryAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = rx3.C13598b0.f38549a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSwipeBack() {
        /*
            r5 = this;
            boolean r0 = super.onSwipeBack()
            r1 = 0
            if (r0 != 0) goto L_0x0043
            al1.h r0 = r5.getData()
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r0.f151979f
            java.lang.String r2 = "<this>"
            gy3.C87412m.m108594g(r0, r2)
            monitor-enter(r0)
            java.util.HashSet r2 = r0.getControllers()     // Catch:{ all -> 0x0040 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0040 }
        L_0x001b:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0040 }
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r3 = (com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController) r3     // Catch:{ all -> 0x0040 }
            boolean r4 = r3 instanceof gh1.C59440c     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x002e
            gh1.c r3 = (gh1.C59440c) r3     // Catch:{ all -> 0x0040 }
            goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            if (r3 == 0) goto L_0x0036
            boolean r3 = r3.onSwipeBack()     // Catch:{ all -> 0x0040 }
            goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x001b
            r1 = 1
            monitor-exit(r0)
            goto L_0x003f
        L_0x003c:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0040 }
            monitor-exit(r0)
        L_0x003f:
            return r1
        L_0x0040:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.onSwipeBack():boolean");
    }

    public final void processFinderLiveLayerShowInfo(C64510l21 l212) {
        Class cls = C54991o.class;
        boolean e4 = ((C54991o) business(cls)).mo75999e4();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("processFinderLiveLayerShowInfo FinderLiveLayerShowInfo:");
        Integer num = null;
        sb.append(l212 != null ? Integer.valueOf(l212.f184023d) : null);
        sb.append(", ");
        if (l212 != null) {
            num = Integer.valueOf(l212.f184025f);
        }
        sb.append(num);
        sb.append(", liveStart:");
        sb.append(e4);
        Log.m105924i(str, sb.toString());
        if (l212 == null) {
            return;
        }
        if (e4) {
            updateLayerShowInfo(l212, true);
        } else {
            ((C54991o) business(cls)).f154293a3 = l212;
        }
    }

    public void registerLazyInitPluginTask(String str, C32224a<? extends C62660c> aVar) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(aVar, "task");
        if (getLazyInitPluginMap().containsKey(str)) {
            String str2 = TAG;
            Log.m105924i(str2, str + " has been register!");
            return;
        }
        getLazyInitPluginMap().put(str, aVar);
    }

    public abstract void release();

    public void reset(boolean z) {
        if (!z) {
            C58124b.C7172a.m7372a(this, C58124b.C58125b.FINDER_LIVE_IDLE, (Bundle) null, 2, (Object) null);
        }
    }

    public void resume() {
        Class cls = C54991o.class;
        super.resume();
        this.checkMiniWin = false;
        ((C54991o) business(cls)).f154350p0 = true;
        ((C54991o) business(cls)).f154383x0 = false;
        ((C54991o) business(cls)).mo76021s4(false);
        ((C54991o) business(cls)).f154334k3 = false;
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59445h(liveRoomControllerStore));
    }

    public final void setAudienPreloadCDNLiveConfig(boolean z) {
        this.audienPreloadCDNLiveConfig = z;
    }

    public final void setBuContext(C45795b bVar) {
        C87412m.m108594g(bVar, "<set-?>");
        this.buContext = bVar;
    }

    public final void setCheckMiniWin(boolean z) {
        this.checkMiniWin = z;
    }

    public final void setConfettiBitmapManager(C61304a aVar) {
        this.confettiBitmapManager = aVar;
    }

    public final void setCurNetworkQuality(int i) {
        this.curNetworkQuality = i;
    }

    public final void setCurNetworkType(int i) {
        this.curNetworkType = i;
    }

    public final void setCurrentAppId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.currentAppId = str;
    }

    public final void setCurrentMicData(JSONObject jSONObject) {
        this.currentMicData = jSONObject;
    }

    public final void setData(C54127h hVar) {
        C87412m.m108594g(hVar, "<set-?>");
        this.data = hVar;
    }

    public final void setExternalCallback(C3204b bVar) {
        this.externalCallback = bVar;
    }

    public final void setFinishActivityNotReleaseLive(boolean z) {
        this.finishActivityNotReleaseLive = z;
    }

    public final void setLastLiveState(int i) {
        this.lastLiveState = i;
    }

    public final void setLastMicData(JSONObject jSONObject) {
        this.lastMicData = jSONObject;
    }

    public final void setLastOrientation(int i) {
        this.lastOrientation = i;
    }

    public final void setLastPkMicUser(C54130j jVar) {
        this.lastPkMicUser = jVar;
    }

    public final void setLastRoomPkMicUserList(JSONArray jSONArray) {
        this.lastRoomPkMicUserList = jSONArray;
    }

    public final void setLastUIState(int i) {
        this.lastUIState = i;
    }

    public final void setLifeCycleRegistry(C103766u uVar) {
        C87412m.m108594g(uVar, "<set-?>");
        this.lifeCycleRegistry = uVar;
    }

    public final void setManualClosed(boolean z) {
        this.isManualClosed = z;
    }

    public final void setMiniWinPermission(boolean z) {
        this.miniWinPermission = z;
    }

    public final void setOrientationEventListener(C61901d dVar) {
        this.orientationEventListener = dVar;
    }

    public final void setSecurityDataScope(C39952a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.securityDataScope = aVar;
    }

    public final void setStatisticsWidget(C46261j6 j6Var) {
        this.statisticsWidget = j6Var;
    }

    public final void setViewScope(C55908a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.viewScope = aVar;
    }

    public final boolean showAlertDialog(Activity activity, String str, String str2, String str3, boolean z) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C77398g gVar = this.alertDialog;
        boolean z2 = false;
        if (!C87412m.m108589b(gVar != null ? Boolean.valueOf(gVar.isShowing()) : null, Boolean.TRUE) && !isDestroyed()) {
            C54991o oVar = (C54991o) business(C54991o.class);
            oVar.getClass();
            C61926c.m72668M(new C54997r(oVar));
            if (str2 != null) {
                C77426q qVar = new C77426q(activity);
                if (str == null || str.length() == 0) {
                    qVar.mo107595g(str2);
                } else {
                    qVar.mo107606r(str);
                    qVar.mo107595g(str2);
                }
                String string = activity.getResources().getString(C0966R.string.f360528df1);
                C87412m.m108593f(string, "activity.resources.getSt…ive_alert_dialog_btn_txt)");
                if (str3 == null || str3.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    str3 = string;
                }
                qVar.mo107602n(str3);
                qVar.mo107600l(new C56045n(z));
                qVar.mo107603o();
                if (z) {
                    C7335d c = C86312j.m106911c(C54108o.class);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.ALERT_INFO, "1", (String) null, 4, (Object) null);
                }
                this.alertDialog = qVar.f225839c;
                return true;
            }
        }
        return false;
    }

    public final void showAlertInfo(Activity activity) {
        Class cls = C54991o.class;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C64698s41 s412 = ((C54991o) business(cls)).f154272W0;
        String str = null;
        Integer valueOf = s412 != null ? Integer.valueOf(s412.f185335d) : null;
        String str2 = s412 != null ? s412.f185337f : null;
        String str3 = s412 != null ? s412.f185338g : null;
        String str4 = s412 != null ? s412.f185339h : null;
        String str5 = s412 != null ? s412.f185336e : null;
        if (s412 != null) {
            str = s412.f185340i;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            String str6 = TAG;
            Log.m105924i(str6, "showAlertInfo type:" + valueOf + ",title:" + str2 + ",content:" + str3 + ",buttonTitle:" + str4);
            showAlertDialog(activity, str2, str3, str4, true);
        } else if (valueOf != null && valueOf.intValue() == 0) {
            String str7 = TAG;
            Log.m105924i(str7, "showAlertInfo type:" + valueOf + ",title:" + str2 + ",content:" + str3 + ",buttonTitle:" + str4 + ",iconName:" + str5);
            if (str2 != null) {
                try {
                    int identifier = getContext().getResources().getIdentifier(str5, "drawable", getContext().getPackageName());
                    int identifier2 = getContext().getResources().getIdentifier(str5, ShareConstants.DEXMODE_RAW, getContext().getPackageName());
                    if (identifier2 != 0) {
                        identifier = identifier2;
                    }
                    if (identifier != 0) {
                        showCenterCustomizeToast(str2, identifier);
                        C54991o oVar = (C54991o) business(cls);
                        oVar.getClass();
                        C61926c.m72668M(new C54997r(oVar));
                    } else {
                        showToast(activity, str2);
                    }
                    C7335d c = C86312j.m106911c(C54108o.class);
                    C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                    C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.ALERT_INFO, "1", (String) null, 4, (Object) null);
                } catch (Exception e) {
                    String str8 = TAG;
                    Log.m105924i(str8, "showAlertInfo exception:" + e.getMessage());
                    showToast(activity, str2);
                }
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            String str9 = TAG;
            Log.m105924i(str9, "showBottomSheet type:" + valueOf + ",title:" + str2 + ",content:" + str3 + ",buttonTitle:" + str4 + ", iconUrl:" + str);
            showBottomSheet(activity, str3, str4, str);
        }
    }

    public final void showBlurBg() {
        ValueAnimator valueAnimator;
        C60357c5 c5Var = this.loadingTipWidget;
        ValueAnimator valueAnimator2 = c5Var.f172072c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = c5Var.f172072c) != null) {
            valueAnimator.end();
        }
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad8));
        c5Var.f172076g.setVisibility(8);
        c5Var.f172078i.setVisibility(8);
        c5Var.f172079j.setVisibility(8);
        TextView textView = c5Var.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C60357c5.m70622d(c5Var, false, 1, (Object) null);
    }

    public void showBlurBgWithTimeCount(String str, String str2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "tip");
        this.loadingTipWidget.mo85324e(str, str2);
    }

    public final void showBottomSheet(Activity activity, String str, String str2, String str3) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C12925w wVar = this.bottomSheet;
        Boolean valueOf = wVar != null ? Boolean.valueOf(wVar.mo12466f()) : null;
        Boolean bool = Boolean.TRUE;
        if (!C87412m.m108589b(valueOf, bool) && !isDestroyed()) {
            C12925w wVar2 = new C12925w(getContext());
            this.bottomSheet = wVar2;
            wVar2.mo12469i(true);
            C12925w wVar3 = this.bottomSheet;
            if (wVar3 != null) {
                wVar3.mo12472l(bool);
            }
            View inflate = View.inflate(getContext(), C0966R.C0971layout.f359713d43, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout");
            RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) inflate;
            TextView textView = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.f358110nu1);
            ImageView imageView = (ImageView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.f358109nu0);
            TextView textView2 = (TextView) roundedCornerFrameLayout.findViewById(C0966R.C0970id.ntz);
            if (str == null) {
                str = "";
            }
            textView.setText(str);
            C7919x.m8091a(textView);
            if (str2 == null) {
                str2 = "";
            }
            textView2.setText(str2);
            C7919x.m8091a(textView2);
            C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            if (str3 == null) {
                str3 = "";
            }
            C99344b<C100810g0, Bitmap> b = f2.mo85956b(new C11984n0(str3, C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.TIMELINE));
            C87412m.m108593f(imageView, "iconView");
            ((C99342a) b).mo85954d(imageView);
            textView2.setOnClickListener(new C56046o(this));
            C12925w wVar4 = this.bottomSheet;
            if (wVar4 != null) {
                wVar4.f36937s = new C56047p(this);
            }
            if (wVar4 != null) {
                wVar4.mo12471k(roundedCornerFrameLayout);
            }
            C12925w wVar5 = this.bottomSheet;
            if (wVar5 != null) {
                wVar5.mo5086o();
            }
        }
    }

    public final void showCenterCustomizeToast(String str, int i) {
        C87412m.m108594g(str, "msg");
        C61926c.m72668M(new C41466q(this, str, i));
    }

    public final void showDebugToast(String str) {
        C87412m.m108594g(str, "content");
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            C76912y0.makeText(getContext(), (CharSequence) str, 0).show();
        }
    }

    public final void showProgress() {
        C60357c5 c5Var = this.loadingTipWidget;
        c5Var.f172083n.setVisibility(0);
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad7));
        View view = c5Var.f172074e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c5Var.f172075f.setVisibility(8);
        c5Var.f172076g.setVisibility(8);
        c5Var.f172078i.setVisibility(8);
        c5Var.f172079j.setVisibility(8);
        TextView textView = c5Var.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C60357c5.m70622d(c5Var, false, 1, (Object) null);
        c5Var.f172070a.requestLayout();
    }

    public final void showProgressWithBlurBg(String str) {
        C60357c5 c5Var = this.loadingTipWidget;
        c5Var.f172083n.setVisibility(0);
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad8));
        View view = c5Var.f172074e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgressWithBlurBg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgressWithBlurBg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c5Var.f172075f.setVisibility(8);
        c5Var.f172076g.setVisibility(8);
        c5Var.f172078i.setVisibility(8);
        c5Var.f172079j.setVisibility(8);
        TextView textView = c5Var.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C60357c5.m70622d(c5Var, false, 1, (Object) null);
        c5Var.f172070a.requestLayout();
    }

    public final void showProgressWithTips(String str) {
        C87412m.m108594g(str, "tips");
        C60357c5 c5Var = this.loadingTipWidget;
        c5Var.getClass();
        c5Var.f172083n.setVisibility(0);
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad7));
        View view = c5Var.f172074e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgressWithTips", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgressWithTips", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c5Var.f172075f.setVisibility(0);
        c5Var.f172075f.setText(str);
        c5Var.f172076g.setVisibility(8);
        c5Var.f172078i.setVisibility(8);
        c5Var.f172079j.setVisibility(8);
        TextView textView = c5Var.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C60357c5.m70622d(c5Var, false, 1, (Object) null);
        c5Var.f172070a.requestLayout();
    }

    public final void showTipWithBlurBg(String str, String str2) {
        ValueAnimator valueAnimator;
        C87412m.m108594g(str2, "tip");
        C60357c5 c5Var = this.loadingTipWidget;
        c5Var.getClass();
        ValueAnimator valueAnimator2 = c5Var.f172072c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = c5Var.f172072c) != null) {
            valueAnimator.end();
        }
        c5Var.f172083n.setVisibility(0);
        c5Var.mo85322b(str, true);
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad8));
        View view = c5Var.f172074e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showTipWithBlurBg", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showTipWithBlurBg", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c5Var.f172075f.setVisibility(8);
        c5Var.f172079j.setVisibility(8);
        TextView textView = c5Var.f172080k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        c5Var.f172076g.setVisibility(0);
        c5Var.f172076g.setText(str2);
        c5Var.f172078i.setVisibility(8);
        C60357c5.m70622d(c5Var, false, 1, (Object) null);
        c5Var.f172070a.requestLayout();
    }

    public void showTipWithBlurBgAction(String str, String str2, String str3, C32224a<C13598b0> aVar) {
        C45795b buContext2;
        ValueAnimator valueAnimator;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C87412m.m108594g(str4, "username");
        C87412m.m108594g(str5, "tip");
        C87412m.m108594g(str6, "actionTxt");
        C60357c5 c5Var = this.loadingTipWidget;
        c5Var.getClass();
        ValueAnimator valueAnimator2 = c5Var.f172072c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = c5Var.f172072c) != null) {
            valueAnimator.end();
        }
        c5Var.f172083n.setVisibility(0);
        c5Var.mo85322b(str4, true);
        c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad8));
        View view = c5Var.f172074e;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showTipWithBlurBgAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showTipWithBlurBgAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c5Var.f172075f.setVisibility(8);
        c5Var.f172076g.setVisibility(0);
        c5Var.f172076g.setText(str5);
        c5Var.f172079j.setVisibility(8);
        TextView textView = c5Var.f172080k;
        if (textView != null) {
            textView.setOnClickListener(new C8976f5(aVar));
        }
        TextView textView2 = c5Var.f172080k;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        TextView textView3 = c5Var.f172080k;
        if (textView3 != null) {
            textView3.setText(str6);
        }
        c5Var.mo85325f();
        c5Var.f172078i.setVisibility(8);
        c5Var.f172083n.setClickable(false);
        c5Var.f172070a.requestLayout();
        FinderLiveService.f159376d.getClass();
        C56032b bVar = FinderLiveService.f159379g;
        if ((bVar == null || (buContext2 = bVar.getBuContext()) == null || !C62042e.f176370a.mo87035Q0(buContext2)) ? false : true) {
            c5Var.f172083n.setBackground((Drawable) null);
        }
    }

    public final void showToast(Context context, String str) {
        C87412m.m108594g(context, "context");
        C54991o oVar = (C54991o) business(C54991o.class);
        oVar.getClass();
        C61926c.m72668M(new C54997r(oVar));
        if (str != null) {
            C76912y0.makeText(context, (CharSequence) str, 1).show();
        }
    }

    public final void showVerificationLayerInfo(String str, String str2, String str3, boolean z, boolean z2, C32226l<? super Boolean, C13598b0> lVar) {
        TextView textView;
        ValueAnimator valueAnimator;
        C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C60357c5 c5Var = this.loadingTipWidget;
        c5Var.getClass();
        ValueAnimator valueAnimator2 = c5Var.f172072c;
        boolean z3 = true;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = c5Var.f172072c) != null) {
            valueAnimator.end();
        }
        c5Var.f172083n.setVisibility(0);
        c5Var.mo85323c();
        if (z2) {
            c5Var.mo85322b((String) null, true);
            c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad8));
        } else {
            c5Var.f172073d.setElevation((float) c5Var.f172070a.getContext().getResources().getDimensionPixelSize(C0966R.dimen.ad7));
        }
        c5Var.f172076g.setVisibility(0);
        c5Var.f172076g.setText(str);
        if (str2 == null || str2.length() == 0) {
            c5Var.f172078i.setVisibility(8);
        } else {
            c5Var.f172078i.setVisibility(0);
            c5Var.f172078i.setText(str2);
        }
        C60357c5.m70622d(c5Var, false, 1, (Object) null);
        if (!(str3 == null || str3.length() == 0)) {
            z3 = false;
        }
        if (z3) {
            TextView textView2 = c5Var.f172080k;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        } else {
            TextView textView3 = c5Var.f172080k;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            TextView textView4 = c5Var.f172080k;
            if (textView4 != null) {
                textView4.setText(str3);
            }
        }
        if (!(lVar == null || (textView = c5Var.f172080k) == null)) {
            textView.setOnClickListener(new C8992g5(lVar));
        }
        if (z) {
            c5Var.f172083n.setOnClickListener(C9015h5.f28486d);
        } else {
            c5Var.f172083n.setClickable(false);
        }
        c5Var.f172070a.requestLayout();
        if (C62042e.f176370a.mo87027N0()) {
            c5Var.mo85321a();
        }
    }

    public void start() {
        Class cls = C54991o.class;
        ((C54991o) business(cls)).f154350p0 = true;
        ((C54991o) business(cls)).f154383x0 = false;
        ((C54991o) business(cls)).mo76021s4(false);
        ((C54991o) business(cls)).f154334k3 = false;
    }

    public void statusChange(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        C61926c.m72668M(new C56050s(this, bVar, bundle));
    }

    public void stop() {
        super.stop();
        C61926c.m72658C((String) null, C29967t.f81134d, 1, (Object) null);
    }

    public void unMount() {
        C59447j jVar = C59447j.f169870a;
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        jVar.mo84557i(liveRoomControllerStore, new C8323o(liveRoomControllerStore, this));
        super.unMount();
        this.lifeCycleRegistry.mo145138f(C39623j.C39626c.DESTROYED);
        C66521k0.f191361a = null;
        FinderLiveService.f159376d.getClass();
        C54847z3 z3Var = FinderLiveService.f159383n;
        z3Var.f153758g.post(new C54757f4(z3Var));
        C86709a0.m107529k().mo121129d(this.onNetworkChange);
        String str = TAG;
        Log.m105924i(str, "unMount " + getBuContext());
        C77398g gVar = this.alertDialog;
        if (gVar != null) {
            gVar.dismiss();
        }
        C12925w wVar = this.bottomSheet;
        if (wVar != null) {
            wVar.mo5085n();
        }
        C60357c5 c5Var = this.loadingTipWidget;
        MTimerHandler mTimerHandler = c5Var.f172085p;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        c5Var.f172083n.setVisibility(8);
        c5Var.f172083n.setBackgroundColor(Color.parseColor("#99000000"));
        release();
    }

    public <T extends C62660c> void unregisterPlugin(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        synchronized (getPluginList()) {
            CopyOnWriteArrayList<C58121a> pluginList = getPluginList();
            C62660c cVar = null;
            if (!(!pluginList.isEmpty())) {
                pluginList = null;
            }
            if (pluginList != null) {
                Iterator<T> it = pluginList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C58121a aVar = (C58121a) it.next();
                    if (cls.isInstance(aVar)) {
                        cVar = (C62660c) aVar;
                        break;
                    }
                }
            }
            getPluginList().remove(cVar);
        }
    }

    public final void updateLayerShowInfo(C64510l21 l212, boolean z) {
        C87412m.m108594g(l212, "layerShowInfo");
        ((C54991o) business(C54991o.class)).mo75978P4(l212, z, new C56052u(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateVerificationButtonState(java.lang.CharSequence r4, boolean r5) {
        /*
            r3 = this;
            il1.c5 r0 = r3.loadingTipWidget
            r1 = 0
            if (r4 == 0) goto L_0x0011
            r0.getClass()
            int r2 = r4.length()
            if (r2 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            if (r2 == 0) goto L_0x001f
            android.widget.TextView r4 = r0.f172080k
            if (r4 != 0) goto L_0x0019
            goto L_0x0037
        L_0x0019:
            r5 = 8
            r4.setVisibility(r5)
            goto L_0x0037
        L_0x001f:
            android.widget.TextView r2 = r0.f172080k
            if (r2 != 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            r2.setVisibility(r1)
        L_0x0027:
            android.widget.TextView r1 = r0.f172080k
            if (r1 != 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            r1.setText(r4)
        L_0x002f:
            android.widget.TextView r4 = r0.f172080k
            if (r4 != 0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            r4.setEnabled(r5)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.updateVerificationButtonState(java.lang.CharSequence, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateVerificationCountDownTip(java.lang.CharSequence r4) {
        /*
            r3 = this;
            il1.c5 r0 = r3.loadingTipWidget
            r1 = 0
            if (r4 == 0) goto L_0x0011
            r0.getClass()
            int r2 = r4.length()
            if (r2 != 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r2 = 0
            goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            if (r2 == 0) goto L_0x001c
            android.widget.TextView r4 = r0.f172079j
            r0 = 8
            r4.setVisibility(r0)
            goto L_0x0026
        L_0x001c:
            android.widget.TextView r2 = r0.f172079j
            r2.setVisibility(r1)
            android.widget.TextView r0 = r0.f172079j
            r0.setText(r4)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56032b.updateVerificationCountDownTip(java.lang.CharSequence):void");
    }
}
