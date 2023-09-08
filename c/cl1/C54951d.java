package cl1;

import android.content.Context;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.camera.core.FocusMeteringAction;
import cb0.C54711a;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.plugin.mmplayer.player.view.MMVideoFrameLayout;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import f50.C58924d;
import f50.C58925e;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32227p;
import gg1.C32444a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o40.C61926c;
import p50.C62197e;
import p501dz.C58466h;
import r50.C63363c;
import rx3.C13598b0;
import te3.C50516na1;
import tf0.C64918r1;
import u62.C22583d;
import u62.C22597f;
import z04.C112550d0;
import z62.C66735c;

/* renamed from: cl1.d */
public final class C54951d extends C39970c<C45795b> {

    /* renamed from: u */
    public static final C28606b f153999u = new C28606b((C8480h) null);

    /* renamed from: v */
    public static final ConcurrentHashMap<String, Boolean> f154000v = new ConcurrentHashMap<>();

    /* renamed from: f */
    public LiveMutableData<Long> f154001f = new LiveMutableData<>();

    /* renamed from: g */
    public CopyOnWriteArrayList<C54955e> f154002g = new CopyOnWriteArrayList<>();

    /* renamed from: h */
    public LiveMutableData<C28607f> f154003h = new LiveMutableData<>();

    /* renamed from: i */
    public C54954d f154004i = C54954d.DEFAULT;

    /* renamed from: j */
    public LiveMutableData<Integer> f154005j = new LiveMutableData<>();

    /* renamed from: n */
    public String f154006n = "";

    /* renamed from: o */
    public LiveMutableData<C54952a> f154007o;

    /* renamed from: p */
    public C54953c f154008p;

    /* renamed from: q */
    public int f154009q;

    /* renamed from: r */
    public int f154010r;

    /* renamed from: s */
    public final C58925e f154011s;

    /* renamed from: t */
    public final C32227p<Integer, Integer, C13598b0> f154012t;

    /* renamed from: cl1.d$b */
    public static final class C28606b {
        public C28606b(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo56083a(String str) {
            boolean z;
            C87412m.m108594g(str, "liveId");
            Iterator<Map.Entry<String, Boolean>> it = C54951d.f154000v.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C112550d0.m153803w((CharSequence) it.next().getKey(), str, false, 2, (Object) null)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                C32444a aVar = C32444a.f86121a;
                if (C32444a.f86134d0.mo60266n().intValue() == 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo56084b(String str) {
            C87412m.m108594g(str, "liveId_adId");
            Boolean bool = C54951d.f154000v.get(str);
            if (!(bool == null ? false : bool.booleanValue())) {
                return false;
            }
            C32444a aVar = C32444a.f86121a;
            return C32444a.f86134d0.mo60266n().intValue() == 0;
        }
    }

    /* renamed from: cl1.d$f */
    public static final class C28607f {

        /* renamed from: a */
        public long f78498a;

        /* renamed from: b */
        public long f78499b;

        public C28607f(long j, long j2) {
            this.f78498a = j;
            this.f78499b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C28607f)) {
                return false;
            }
            C28607f fVar = (C28607f) obj;
            return this.f78498a == fVar.f78498a && this.f78499b == fVar.f78499b;
        }

        public int hashCode() {
            long j = this.f78498a;
            long j2 = this.f78499b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "LivingAdVideoProgress(progressMs=" + this.f78498a + ", durationMs=" + this.f78499b + ')';
        }
    }

    /* renamed from: cl1.d$a */
    public enum C54952a {
        IDLE(1),
        STARTUP_VIDEO_PLAYING(2),
        STARTUP_VIDEO_COMPLETE(3),
        LIVING_VIDEO_PLAYING(4),
        LIVING_VIDEO_COMPLETE(5),
        STARTUP_VIDEO_PLAYING_FIRST_FRAME(6);

        /* access modifiers changed from: public */
        C54952a(int i) {
        }
    }

    /* renamed from: cl1.d$c */
    public static final class C54953c extends MMVideoFrameLayout<C22597f> {

        /* renamed from: A */
        public C50516na1 f154020A;

        /* renamed from: B */
        public long f154021B;

        /* renamed from: C */
        public long f154022C;

        /* renamed from: t */
        public C32227p<? super Integer, ? super Integer, C13598b0> f154023t;

        /* renamed from: u */
        public C32224a<C13598b0> f154024u;

        /* renamed from: v */
        public C32227p<? super Long, ? super Long, C13598b0> f154025v;

        /* renamed from: w */
        public C32227p<? super Integer, ? super Integer, C13598b0> f154026w;

        /* renamed from: x */
        public C32224a<C13598b0> f154027x;

        /* renamed from: y */
        public C32224a<C13598b0> f154028y;

        /* renamed from: z */
        public C32224a<C13598b0> f154029z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54953c(Context context) {
            super(context);
            C87412m.m108594g(context, "context");
        }

        /* renamed from: d */
        public void mo23982d(String str) {
            C32224a<C13598b0> aVar = this.f154029z;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: e */
        public void mo23983e() {
            C32224a<C13598b0> aVar = this.f154027x;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: f */
        public void mo23984f(C22583d dVar, int i, int i2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            super.mo23984f(dVar, i, i2);
            C32224a<C13598b0> aVar = this.f154028y;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        /* renamed from: g */
        public void mo23985g(String str, int i) {
            C87412m.m108594g(str, "invokeSource");
            super.mo23985g(str, i);
            C32224a<C13598b0> aVar = this.f154024u;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        public final C50516na1 getCurLiveAdInfo() {
            return this.f154020A;
        }

        public final long getCurStartPlayTime() {
            return this.f154021B;
        }

        public final C32224a<C13598b0> getOnFirstFrameRendered() {
            return this.f154024u;
        }

        public final C32227p<Long, Long, C13598b0> getOnProgressChange() {
            return this.f154025v;
        }

        public final C32227p<Integer, Integer, C13598b0> getOnStateChange() {
            return this.f154026w;
        }

        public final C32224a<C13598b0> getOnVideoBufferingStart() {
            return this.f154029z;
        }

        public final C32224a<C13598b0> getOnVideoComplete() {
            return this.f154027x;
        }

        public final C32224a<C13598b0> getOnVideoError() {
            return this.f154028y;
        }

        public final C32227p<Integer, Integer, C13598b0> getOnVideoSizeChange() {
            return this.f154023t;
        }

        public final long getVideoTotalTime() {
            return this.f154022C;
        }

        /* renamed from: h */
        public void mo23995h(C22583d dVar, long j, long j2) {
            C87412m.m108594g(dVar, WeChatBrands.Business.GROUP_MP);
            C32227p<? super Long, ? super Long, C13598b0> pVar = this.f154025v;
            if (pVar != null) {
                pVar.invoke(Long.valueOf(j), Long.valueOf(j2));
            }
        }

        /* renamed from: j */
        public void mo23997j(int i, int i2) {
            C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f154023t;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
            }
        }

        /* renamed from: p */
        public void mo24000p() {
            super.mo24000p();
            this.f154023t = null;
            this.f154024u = null;
            this.f154025v = null;
            this.f154026w = null;
            this.f154027x = null;
            this.f154028y = null;
            this.f154029z = null;
        }

        /* renamed from: q */
        public final boolean mo75883q(C50516na1 na12, long j, C32224a<C13598b0> aVar) {
            C50516na1 na13 = na12;
            C87412m.m108594g(aVar, "onCreateView");
            if (na13 == null) {
                Log.m105928w("LiveAdVideoSlice", "loadVideo return for loadVideo:" + na12);
                return false;
            }
            String str = na13.f138507g;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                Log.m105928w("LiveAdVideoSlice", "loadVideo return for url:" + str);
                return false;
            }
            Log.m105924i("LiveAdVideoSlice", "loadVideo start play startPositionMs:" + j + " duration:" + na13.f138506f + " url:" + str);
            C22597f fVar = new C22597f();
            String mD5String = MD5Util.getMD5String(str);
            String a = C54711a.f153346a.mo75606a("", mD5String, str);
            C66735c.C66736a aVar2 = C66735c.f191767d;
            C87412m.m108593f(mD5String, "mediaId");
            C66735c cVar = new C66735c(mD5String, str, aVar2.mo90768a(mD5String, str, a));
            fVar.mo35706g(cVar, ((C58466h) C86312j.m106911c(C58466h.class)).mo31869LK(fVar, cVar, mD5String, mD5String));
            aVar.invoke();
            this.f154020A = na13;
            mo23980b(fVar, cVar);
            MMVideoFrameLayout.m19908l(this, true, 0, 0, 0, 0, (Rect) null, 62, (Object) null);
            MMVideoFrameLayout.m19909n(this, (String) null, j, 1, (Object) null);
            return true;
        }

        public final void setCurLiveAdInfo(C50516na1 na12) {
            this.f154020A = na12;
        }

        public final void setCurStartPlayTime(long j) {
            this.f154021B = j;
        }

        public final void setMute(boolean z) {
            getPlayer().setOutputMute(z);
        }

        public final void setOnFirstFrameRendered(C32224a<C13598b0> aVar) {
            this.f154024u = aVar;
        }

        public final void setOnProgressChange(C32227p<? super Long, ? super Long, C13598b0> pVar) {
            this.f154025v = pVar;
        }

        public final void setOnStateChange(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
            this.f154026w = pVar;
        }

        public final void setOnVideoBufferingStart(C32224a<C13598b0> aVar) {
            this.f154029z = aVar;
        }

        public final void setOnVideoComplete(C32224a<C13598b0> aVar) {
            this.f154027x = aVar;
        }

        public final void setOnVideoError(C32224a<C13598b0> aVar) {
            this.f154028y = aVar;
        }

        public final void setOnVideoSizeChange(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
            this.f154023t = pVar;
        }

        public final void setVideoTotalTime(long j) {
            this.f154022C = j;
        }
    }

    /* renamed from: cl1.d$d */
    public enum C54954d {
        DEFAULT(1),
        MIN(2),
        MAX(3),
        SQAURE_MODE(4);

        /* access modifiers changed from: public */
        C54954d(int i) {
        }
    }

    /* renamed from: cl1.d$e */
    public static final class C54955e {

        /* renamed from: a */
        public C54956g f154035a;

        /* renamed from: b */
        public C50516na1 f154036b;

        public C54955e(C54956g gVar, C50516na1 na12) {
            C87412m.m108594g(gVar, "playState");
            C87412m.m108594g(na12, "adVideoInfo");
            this.f154035a = gVar;
            this.f154036b = na12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54955e)) {
                return false;
            }
            C54955e eVar = (C54955e) obj;
            return this.f154035a == eVar.f154035a && C87412m.m108589b(this.f154036b, eVar.f154036b);
        }

        public int hashCode() {
            return (this.f154035a.hashCode() * 31) + this.f154036b.hashCode();
        }

        public String toString() {
            return "LivingAdVideoInfo(playState=" + this.f154035a + ", adVideoInfo=" + this.f154036b + ')';
        }
    }

    /* renamed from: cl1.d$g */
    public enum C54956g {
        IDLE(1),
        PLAYING(2);

        /* access modifiers changed from: public */
        C54956g(int i) {
        }
    }

    /* renamed from: cl1.d$h */
    public static final class C54957h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54951d f154040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54957h(C54951d dVar) {
            super(0);
            this.f154040d = dVar;
        }

        public Object invoke() {
            C54951d dVar = this.f154040d;
            C54951d.m61904c3(dVar, dVar.f154006n);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cl1.d$i */
    public static final class C54958i extends C87413o implements C32227p<Long, Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54951d f154041d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54958i(C54951d dVar) {
            super(2);
            this.f154041d = dVar;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).longValue();
            long longValue = ((Number) obj2).longValue();
            C54953c cVar = this.f154041d.f154008p;
            if (cVar != null) {
                cVar.setVideoTotalTime(longValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cl1.d$j */
    public static final class C54959j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54951d f154042d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54959j(C54951d dVar) {
            super(0);
            this.f154042d = dVar;
        }

        public Object invoke() {
            C54951d dVar = this.f154042d;
            C54951d.m61904c3(dVar, dVar.f154006n);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cl1.d$k */
    public static final class C54960k implements C58925e {

        /* renamed from: d */
        public final /* synthetic */ C54951d f154043d;

        public C54960k(C54951d dVar) {
            this.f154043d = dVar;
        }

        /* renamed from: X2 */
        public void mo75898X2() {
            C54953c cVar;
            C54953c cVar2 = this.f154043d.f154008p;
            boolean z = true;
            if (cVar2 == null || !cVar2.getPlayer().isPlaying()) {
                z = false;
            }
            if (z && (cVar = this.f154043d.f154008p) != null) {
                cVar.mo23998m();
            }
        }

        /* renamed from: s */
        public void mo75899s() {
            C50516na1 curLiveAdInfo;
            C54951d dVar = this.f154043d;
            C54953c cVar = dVar.f154008p;
            if (cVar != null && (curLiveAdInfo = cVar.getCurLiveAdInfo()) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long curStartPlayTime = currentTimeMillis - cVar.getCurStartPlayTime();
                Long valueOf = Long.valueOf(cVar.getVideoTotalTime());
                if (!(valueOf.longValue() != 0)) {
                    valueOf = null;
                }
                long longValue = valueOf != null ? valueOf.longValue() : curLiveAdInfo.f138506f;
                Log.m105924i("LiveAdVideoSlice", "onLive PlayerResume startPos: " + curStartPlayTime + " curTime: " + currentTimeMillis + " startTime: " + curLiveAdInfo.f138505e + " duration: " + longValue + " curStartPlayTime: " + cVar.getCurStartPlayTime() + " live_ad_id: " + curLiveAdInfo.f138504d);
                if (curStartPlayTime > longValue) {
                    String str = curLiveAdInfo.f138504d;
                    if (str == null) {
                        str = "";
                    }
                    C54951d.m61904c3(dVar, str);
                    return;
                }
                int state = cVar.getPlayer().getState();
                if (state != 0) {
                    if (!(state == 1 || state == 2)) {
                        switch (state) {
                            case 6:
                                cVar.getPlayer().start();
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                break;
                            case 11:
                                break;
                        }
                    }
                    String fTPPTag = cVar.getFTPPTag();
                    Log.m105924i(fTPPTag, "pause return for state:" + state);
                    cVar.getPlayer().seekTo(curStartPlayTime);
                }
                if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
                    String fTPPTag2 = cVar.getFTPPTag();
                    Log.m105924i(fTPPTag2, "pause return for error state:" + state);
                }
                cVar.getPlayer().seekTo(curStartPlayTime);
            }
        }
    }

    /* renamed from: cl1.d$l */
    public static final class C54961l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54951d f154044d;

        /* renamed from: e */
        public final /* synthetic */ long f154045e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54961l(C54951d dVar, long j) {
            super(0);
            this.f154044d = dVar;
            this.f154045e = j;
        }

        public Object invoke() {
            C54955e eVar;
            C54955e eVar2;
            boolean z;
            boolean z2;
            C58924d dVar;
            C54951d dVar2 = this.f154044d;
            long j = this.f154045e;
            dVar2.getClass();
            Class cls = C54951d.class;
            Class cls2 = C64918r1.class;
            C54956g gVar = C54956g.IDLE;
            if (j > 0) {
                C60735a iV = ((C64918r1) C86312j.m106911c(cls2)).mo89057iV();
                C62197e eVar3 = iV instanceof C62197e ? (C62197e) iV : null;
                if (!(eVar3 == null || (dVar = eVar3.f176822Y0.f152627a) == null || dVar.mo84123l(dVar2.f154011s))) {
                    dVar.mo84120h(dVar2.f154011s);
                }
                C54954d dVar3 = dVar2.f154004i;
                if (dVar3 == C54954d.MIN || dVar3 == C54954d.SQAURE_MODE) {
                    CopyOnWriteArrayList<C54955e> copyOnWriteArrayList = ((C54951d) dVar2.business(cls)).f154002g;
                    ArrayList arrayList = new ArrayList();
                    Iterator<C54955e> it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        C54955e next = it.next();
                        if (next.f154035a == gVar) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        C54955e eVar4 = (C54955e) it4.next();
                        Log.m105924i("LiveAdVideoSlice", "checkPlayInLivingInMiniMode id:" + eVar4.f154036b.f138504d + " diff:" + (eVar4.f154036b.f138505e - j) + " state:" + eVar4.f154035a + " anchorT:" + j + " statT:" + eVar4.f154036b.f138505e);
                    }
                    Iterator<C54955e> it5 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            eVar = null;
                            break;
                        }
                        C54955e next2 = it5.next();
                        C54955e eVar5 = next2;
                        C50516na1 na12 = eVar5.f154036b;
                        long j2 = na12.f138505e;
                        C54955e eVar6 = next2;
                        long j3 = (na12.f138506f + j2) - j;
                        if (j <= j2 || j3 <= FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION || eVar5.f154035a != gVar) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            eVar = eVar6;
                            break;
                        }
                    }
                    C54955e eVar7 = eVar;
                    if (eVar7 != null) {
                        C50516na1 na13 = eVar7.f154036b;
                        long j4 = na13.f138505e;
                        long j5 = na13.f138506f;
                        long j6 = (j4 + j5) - j;
                        long j7 = j5 - j6;
                        Log.m105928w("LiveAdVideoSlice", "startPlayLivingAdVideoInMiniMode id:" + eVar7.f154036b.f138504d + " left" + j6 + "  startPos:" + j7 + " duration:" + eVar7.f154036b.f138506f);
                        C50516na1 na14 = eVar7.f154036b;
                        if (na14 == null) {
                            Log.m105928w("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for loadVideo:" + na14);
                        } else {
                            C54953c cVar = dVar2.f154008p;
                            if (cVar != null && cVar.getPlayer().isPlaying()) {
                                Log.m105928w("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for playing.");
                            } else {
                                C63363c.C63364a aVar = C63363c.C63364a.f179734a;
                                if (!C63363c.C63364a.f179735b.f179732a.mo90534J().f311693n.f311706d) {
                                    Log.m105924i("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for isBallPlaying is false.");
                                } else {
                                    String str = na14.f138507g;
                                    String str2 = "";
                                    if (str == null) {
                                        str = str2;
                                    }
                                    if (str.length() == 0) {
                                        Log.m105928w("LiveAdVideoSlice", "loadLivingVideoInMiniMode return for url:" + str);
                                    } else {
                                        String str3 = na14.f138504d;
                                        if (str3 != null) {
                                            str2 = str3;
                                        }
                                        dVar2.f154006n = str2;
                                        Log.m105924i("LiveAdVideoSlice", "loadLivingVideoInMiniMode start play startPositionMs:" + j7 + " duration:" + na14.f138506f + " url:" + str);
                                        if (dVar2.f154008p == null) {
                                            Context context = MMApplicationContext.getContext();
                                            C87412m.m108593f(context, "getContext()");
                                            ((C54951d) dVar2.business(cls)).f154008p = new C54953c(context);
                                        }
                                        C54953c cVar2 = dVar2.f154008p;
                                        if (cVar2 != null ? cVar2.mo75883q(na14, j7, new C54977h(dVar2, na14)) : false) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("handleOnMiniVideoViewStart liveAdId:");
                                            C50516na1 na15 = eVar7.f154036b;
                                            sb.append(na15 != null ? na15.f138504d : null);
                                            Log.m105924i("LiveAdVideoSlice", sb.toString());
                                            C60735a iV2 = ((C64918r1) C86312j.m106911c(cls2)).mo89057iV();
                                            C62197e eVar8 = iV2 instanceof C62197e ? (C62197e) iV2 : null;
                                            if (eVar8 != null) {
                                                eVar8.mo87273O0(true);
                                            }
                                            dVar2.f154007o.setValue(C54952a.LIVING_VIDEO_PLAYING);
                                            eVar7.f154035a = C54956g.PLAYING;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        Iterator<C54955e> it6 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                eVar2 = null;
                                break;
                            }
                            C54955e next3 = it6.next();
                            C54955e eVar9 = next3;
                            long j8 = eVar9.f154036b.f138505e - j;
                            if (!(1000 <= j8 && j8 < 5001) || eVar9.f154035a != gVar) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                eVar2 = next3;
                                break;
                            }
                        }
                        C54955e eVar10 = eVar2;
                        if (eVar10 != null) {
                            long j9 = eVar10.f154036b.f138505e - j;
                            Log.m105928w("LiveAdVideoSlice", "startPlayAnimationInMiniMode id:" + eVar10.f154036b.f138504d + " animationDurationMs:" + j9);
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cl1.d$m */
    public static final class C54962m extends C87413o implements C32227p<Integer, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54951d f154046d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54962m(C54951d dVar) {
            super(2);
            this.f154046d = dVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            Class cls = C54951d.class;
            ((C54951d) this.f154046d.business(cls)).f154009q = intValue;
            ((C54951d) this.f154046d.business(cls)).f154010r = intValue2;
            Log.m105924i("LiveUtil", "validVideoSize videoWidth:" + intValue + ",videoHeight:" + intValue2);
            boolean z = intValue > 0 && intValue2 > 0;
            Log.m105924i("LiveUtil", "isLandscapeVideo validVideoSize:" + z);
            if (z && intValue >= intValue2) {
                C54953c cVar = this.f154046d.f154008p;
                if (cVar != null) {
                    cVar.setScaleType(1);
                }
            } else {
                C54953c cVar2 = this.f154046d.f154008p;
                if (cVar2 != null) {
                    cVar2.setScaleType(0);
                }
            }
            Log.m105924i("LiveAdVideoSlice", "onVideoSizeChange [" + intValue + " x " + intValue2 + ']');
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54951d(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        LiveMutableData<C54952a> liveMutableData = new LiveMutableData<>();
        liveMutableData.setValue(C54952a.IDLE);
        this.f154007o = liveMutableData;
        this.f154011s = new C54960k(this);
        this.f154012t = new C54962m(this);
    }

    /* renamed from: c3 */
    public static final void m61904c3(C54951d dVar, String str) {
        dVar.getClass();
        Log.m105924i("LiveAdVideoSlice", "handleOnMiniVideoViewStop liveAdId:" + str);
        C60735a iV = ((C64918r1) C86312j.m106911c(C64918r1.class)).mo89057iV();
        ViewGroup viewGroup = null;
        C62197e eVar = iV instanceof C62197e ? (C62197e) iV : null;
        if (eVar != null) {
            eVar.mo87273O0(false);
        }
        dVar.f154007o.setValue(C54952a.LIVING_VIDEO_PLAYING);
        C54953c cVar = dVar.f154008p;
        ViewParent parent = cVar != null ? cVar.getParent() : null;
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        }
        if (viewGroup != null) {
            viewGroup.removeView(dVar.f154008p);
        }
        dVar.mo75872i3();
    }

    /* renamed from: d3 */
    public final MMVideoFrameLayout<C22597f> mo75868d3() {
        C54952a value = this.f154007o.getValue();
        if (value != C54952a.LIVING_VIDEO_PLAYING && value != C54952a.LIVING_VIDEO_COMPLETE) {
            return null;
        }
        Log.m105924i("LiveAdVideoSlice", "getLivingVideoViewToMiniWindow state:" + value + " videoView:" + this.f154008p);
        C54953c cVar = this.f154008p;
        if (cVar != null) {
            cVar.setOnVideoError(new C54957h(this));
        }
        C54953c cVar2 = this.f154008p;
        if (cVar2 != null) {
            cVar2.setOnProgressChange(new C54958i(this));
        }
        C54953c cVar3 = this.f154008p;
        if (cVar3 != null) {
            cVar3.setOnVideoComplete(new C54959j(this));
        }
        C54953c cVar4 = this.f154008p;
        if (cVar4 != null) {
            cVar4.setOnProgressChange((C32227p<? super Long, ? super Long, C13598b0>) null);
        }
        C54953c cVar5 = this.f154008p;
        if (cVar5 != null) {
            cVar5.setOnFirstFrameRendered((C32224a<C13598b0>) null);
        }
        return this.f154008p;
    }

    /* renamed from: e3 */
    public final boolean mo75869e3() {
        if (!mo75870f3()) {
            return this.f154007o.getValue() == C54952a.LIVING_VIDEO_PLAYING;
        }
    }

    /* renamed from: f3 */
    public final boolean mo75870f3() {
        C54952a value = this.f154007o.getValue();
        return value == C54952a.STARTUP_VIDEO_PLAYING || value == C54952a.STARTUP_VIDEO_PLAYING_FIRST_FRAME;
    }

    /* renamed from: g3 */
    public final void mo75871g3(long j) {
        this.f154001f.postValue(Long.valueOf(j));
        C61926c.m72668M(new C54961l(this, j));
    }

    /* renamed from: i3 */
    public final void mo75872i3() {
        Log.m105924i("LiveAdVideoSlice", "stopPlayer state:" + this.f154007o.getValue() + " videoView:" + this.f154008p);
        if (this.f154008p != null) {
            Log.m105924i("LiveAdVideoSlice", "stopPlayer videoView release.");
            C54953c cVar = this.f154008p;
            if (cVar != null) {
                cVar.mo24000p();
            }
        }
        this.f154007o.setValue(C54952a.IDLE);
    }

    public void onCleared() {
        C58924d dVar;
        Class cls = C64918r1.class;
        Log.m105924i("LiveAdVideoSlice", "stopPolling");
        ((C64918r1) C86312j.m106911c(cls)).mo89066t9(16);
        mo75872i3();
        C60735a iV = ((C64918r1) C86312j.m106911c(cls)).mo89057iV();
        C62197e eVar = iV instanceof C62197e ? (C62197e) iV : null;
        if (!(eVar == null || (dVar = eVar.f176822Y0.f152627a) == null)) {
            dVar.mo84122k(this.f154011s);
        }
        C54953c cVar = this.f154008p;
        if (cVar != null) {
            cVar.mo24000p();
            cVar.getPlayer().release();
        }
        this.f154008p = null;
    }
}
