package com.tencent.p014mm.live.view;

import a60.C53979a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import b50.C54408d;
import b50.C54410e;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.core.view.LivePreviewView;
import com.tencent.p014mm.live.core.view.LiveVideoView;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.xweb.FileReaderX5;
import d50.C58110d;
import d50.C58113g;
import d50.C58114h;
import d50.C58115i;
import d60.C45268h1;
import d60.C45272n;
import d60.C58121a;
import d60.C58124b;
import d60.C58128c1;
import d60.C58134f1;
import d60.C58152h0;
import d60.C58187m0;
import d60.C58192o0;
import d60.C58197p0;
import d60.C58213u;
import d60.C58215u0;
import d60.C58219v;
import d60.C58221v1;
import d60.C58234z;
import d60.C7173b1;
import d60.C7174c;
import d60.C7182d1;
import d60.C7195g1;
import d60.C7202k0;
import d60.C7219q0;
import d60.C7226t0;
import d60.C7228w;
import d60.C7230x;
import d60.C7232x0;
import d60.C7233y;
import e60.C58532b;
import eb0.C31543z5;
import eb0.C97621e;
import f40.C86709a0;
import f50.C58924d;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h60.C59767s;
import h60.C59768t;
import h60.C59769u;
import h60.C59770v;
import h60.C59771w;
import h60.C59772x;
import h60.C8489y;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p50.C62195b;
import p50.C62197e;
import qo3.C77426q;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s50.C63703d0;
import t50.C64204a;
import te3.C49317ep2;
import y50.C53496k;
import y50.C66516i;
import y50.C66519j0;
import z04.C112550d0;
import z50.C16103b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/live/view/LiveVisitorPluginLayout;", "Lcom/tencent/mm/live/view/RoomBaseLivePluginLayout;", "Lob0/n;", "Lb50/e;", "", "getRenderMode", "getRelativeLayoutId", "getLiveRole", "Lcom/tencent/mm/live/view/RoomLiveMiniView;", "L", "Lrx3/g;", "getMiniView", "()Lcom/tencent/mm/live/view/RoomLiveMiniView;", "miniView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout */
public final class LiveVisitorPluginLayout extends RoomBaseLivePluginLayout implements C11385n, C54410e {

    /* renamed from: P */
    public static final /* synthetic */ int f157315P = 0;

    /* renamed from: A */
    public C58213u f157316A;

    /* renamed from: B */
    public C7230x f157317B;

    /* renamed from: C */
    public C7233y f157318C;

    /* renamed from: D */
    public boolean f157319D;

    /* renamed from: E */
    public boolean f157320E = true;

    /* renamed from: F */
    public int f157321F = 0;

    /* renamed from: G */
    public final ArrayList<C58121a> f157322G = new ArrayList<>();

    /* renamed from: H */
    public C62197e f157323H;

    /* renamed from: I */
    public boolean f157324I;

    /* renamed from: J */
    public final C97621e f157325J = new C97621e();

    /* renamed from: K */
    public int f157326K = 1;

    /* renamed from: L */
    public final C13601g f157327L;

    /* renamed from: M */
    public final C32224a<C13598b0> f157328M;

    /* renamed from: N */
    public MTimerHandler f157329N;

    /* renamed from: f */
    public C58221v1 f157330f;

    /* renamed from: g */
    public C58128c1 f157331g;

    /* renamed from: h */
    public C7232x0 f157332h;

    /* renamed from: i */
    public C7182d1 f157333i;

    /* renamed from: j */
    public C58234z f157334j;

    /* renamed from: n */
    public C58152h0 f157335n;

    /* renamed from: o */
    public C45268h1 f157336o;

    /* renamed from: p */
    public C45272n f157337p;

    /* renamed from: q */
    public C7174c f157338q;

    /* renamed from: r */
    public C7228w f157339r;

    /* renamed from: s */
    public C58192o0 f157340s;

    /* renamed from: t */
    public C7219q0 f157341t;

    /* renamed from: u */
    public C58187m0 f157342u;

    /* renamed from: v */
    public C7226t0 f157343v;

    /* renamed from: w */
    public C58134f1 f157344w;

    /* renamed from: x */
    public C58197p0 f157345x;

    /* renamed from: y */
    public C7202k0 f157346y;

    /* renamed from: z */
    public C7195g1 f157347z;

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$a */
    public static final class C55242a extends C87413o implements C32229r<Integer, String, C58113g, TRTCCloudDef.TRTCParams, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157348d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55242a(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(4);
            this.f157348d = liveVisitorPluginLayout;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "errMsg");
            C87412m.m108594g((C58113g) obj3, "liveRoomInfo");
            C87412m.m108594g((TRTCCloudDef.TRTCParams) obj4, "trtcParams");
            LiveVisitorPluginLayout.m62853l(this.f157348d, intValue, str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$b */
    public static final class C55243b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f157349d;

        /* renamed from: e */
        public final /* synthetic */ LiveVisitorPluginLayout f157350e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55243b(boolean z, LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(1);
            this.f157349d = z;
            this.f157350e = liveVisitorPluginLayout;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_LIVE_START_BY_ORIENTATION_CHANGE", this.f157349d);
                this.f157350e.statusChange(C58124b.C58125b.START_LIVE, bundle);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$c */
    public static final class C55244c extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f157351d;

        /* renamed from: e */
        public final /* synthetic */ LiveVisitorPluginLayout f157352e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55244c(boolean z, LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(1);
            this.f157351d = z;
            this.f157352e = liveVisitorPluginLayout;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("PARAM_LIVE_START_BY_ORIENTATION_CHANGE", this.f157351d);
                this.f157352e.statusChange(C58124b.C58125b.START_LIVE, bundle);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$d */
    public static final class C55245d extends C87413o implements C32229r<Integer, String, C58113g, TRTCCloudDef.TRTCParams, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55245d(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(4);
            this.f157353d = liveVisitorPluginLayout;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            C58113g gVar = (C58113g) obj3;
            TRTCCloudDef.TRTCParams tRTCParams = (TRTCCloudDef.TRTCParams) obj4;
            C87412m.m108594g(str, "errMsg");
            C87412m.m108594g(gVar, "liveRoomInfo");
            C87412m.m108594g(tRTCParams, "trtcParams");
            if (intValue == 0) {
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                C58114h hVar = new C58114h(tRTCParams, gVar, new C58110d("com.tencent.mm.live.ui.LiveUIA"));
                RoomLiveService.f157201l = hVar;
                TRTCCloudDef.TRTCParams tRTCParams2 = hVar.f166250a;
                if (tRTCParams2 != null) {
                    tRTCParams2.role = 21;
                }
                LiveVisitorPluginLayout liveVisitorPluginLayout = this.f157353d;
                int i = gVar.f166233c;
                liveVisitorPluginLayout.f157321F = i;
                long j = gVar.f166232b;
                C64204a.f181932a = i;
                C64204a.f181933b = j;
                Log.m105924i("MicroMsg.LiveCoreVisitor", "audienceMode:" + this.f157353d.f157321F);
                this.f157353d.mo76522n(false);
            } else {
                LiveVisitorPluginLayout.m62853l(this.f157353d, intValue, str);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$e */
    public static final class C55246e extends C87413o implements C32227p<Float, Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55246e(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(2);
            this.f157354d = liveVisitorPluginLayout;
        }

        public Object invoke(Object obj, Object obj2) {
            LiveVisitorPluginLayout.m62854m(this.f157354d, ((Number) obj).floatValue(), ((Number) obj2).floatValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$f */
    public static final class C55247f extends C87413o implements C32227p<Float, Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157355d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55247f(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(2);
            this.f157355d = liveVisitorPluginLayout;
        }

        public Object invoke(Object obj, Object obj2) {
            LiveVisitorPluginLayout.m62854m(this.f157355d, ((Number) obj).floatValue(), ((Number) obj2).floatValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$g */
    public static final class C55248g extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55248g(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(1);
            this.f157356d = liveVisitorPluginLayout;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            Log.m105924i("MicroMsg.LiveCoreVisitor", "receive close sys msg:" + longValue);
            if (longValue == RoomLiveService.f157197h.f133050d) {
                MMHandlerThread.postToMainThread(new C55256c(this.f157356d));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$h */
    public static final class C55249h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55249h(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(0);
            this.f157357d = liveVisitorPluginLayout;
        }

        public Object invoke() {
            C61926c.m72668M(new C55257d(this.f157357d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$i */
    public static final class C55250i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157358d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55250i(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(0);
            this.f157358d = liveVisitorPluginLayout;
        }

        public Object invoke() {
            if (RoomLiveService.f157174F == -1) {
                int i = RoomLiveService.f157197h.f133055i - 1;
                if (i < 0) {
                    i = 0;
                }
                RoomLiveService.f157174F = i;
            }
            C61926c.m72668M(new C55258e(this.f157358d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$j */
    public static final class C55251j extends C87413o implements C32224a<RoomLiveMiniView> {

        /* renamed from: d */
        public final /* synthetic */ Context f157359d;

        /* renamed from: e */
        public final /* synthetic */ LiveVisitorPluginLayout f157360e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55251j(Context context, LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(0);
            this.f157359d = context;
            this.f157360e = liveVisitorPluginLayout;
        }

        public Object invoke() {
            RoomLiveMiniView roomLiveMiniView = new RoomLiveMiniView(this.f157359d);
            C55259f fVar = new C55259f(this.f157360e);
            View findViewById = roomLiveMiniView.findViewById(C0966R.C0970id.f357653b13);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/live/view/RoomLiveMiniView", "enableCloseBtn", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/live/view/RoomLiveMiniView", "enableCloseBtn", "(Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            roomLiveMiniView.findViewById(C0966R.C0970id.f357652b12).setOnClickListener(new C8489y(fVar));
            return roomLiveMiniView;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$k */
    public static final class C55252k extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157361d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55252k(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            super(1);
            this.f157361d = liveVisitorPluginLayout;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                LiveVisitorPluginLayout liveVisitorPluginLayout = this.f157361d;
                int i = LiveVisitorPluginLayout.f157315P;
                liveVisitorPluginLayout.getClass();
                if (C62197e.f176819i1 == null) {
                    C62197e.f176819i1 = new C62197e();
                }
                C62197e eVar = C62197e.f176819i1;
                C87412m.m108591d(eVar);
                eVar.mo87276S0((LivePreviewView) null);
                Log.m105924i("MicroMsg.LiveCoreVisitor", "requestLinkMic ret:0");
            } else {
                Log.m105928w("MicroMsg.LiveCoreVisitor", "enterRoom fail! stop link mic");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveVisitorPluginLayout$l */
    public static final class C55253l implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ LiveVisitorPluginLayout f157362d;

        public C55253l(LiveVisitorPluginLayout liveVisitorPluginLayout) {
            this.f157362d = liveVisitorPluginLayout;
        }

        public final boolean onTimerExpired() {
            C58213u uVar;
            C58213u uVar2 = this.f157362d.f157316A;
            if ((uVar2 != null && uVar2.mo14483f0() == 0) && (uVar = this.f157362d.f157316A) != null) {
                C49317ep2 ep22 = RoomLiveService.f157197h;
                uVar.f166287d.post(new C58219v(uVar, ep22.f133055i, ep22.f133057n));
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveVisitorPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f157327L = C36568h.m40985a(new C55251j(context, this));
        this.f157328M = new C55250i(this);
        this.f157329N = new MTimerHandler("LiveCommonInfoPlugin::Timer", (MTimerHandler.CallBack) new C55253l(this), true);
    }

    private final RoomLiveMiniView getMiniView() {
        return (RoomLiveMiniView) ((C36570n) this.f157327L).getValue();
    }

    private final int getRenderMode() {
        return isLandscape() ? 1 : 0;
    }

    /* renamed from: l */
    public static final void m62853l(LiveVisitorPluginLayout liveVisitorPluginLayout, int i, String str) {
        liveVisitorPluginLayout.getClass();
        Log.m105924i("MicroMsg.LiveCoreVisitor", "join live room errCode:" + i + " errMsg:" + str);
        switch (i) {
            case -100069:
                if (Util.isNullOrNil(str)) {
                    str = liveVisitorPluginLayout.getContext().getResources().getString(C0966R.string.g8y);
                }
                C77426q qVar = new C77426q(liveVisitorPluginLayout.getContext());
                qVar.mo107595g(str);
                qVar.mo107601m(C0966R.string.f8028zq);
                qVar.mo107600l(C59769u.f170662a);
                qVar.mo107593e(new C59770v(liveVisitorPluginLayout));
                qVar.mo107603o();
                return;
            case -100068:
            case -100045:
                Bundle bundle = new Bundle();
                String string = liveVisitorPluginLayout.getContext().getResources().getString(C0966R.string.g76);
                C87412m.m108593f(string, "context.resources.getStr…eption_desc_forbid_visit)");
                SpannableString spannableString = new SpannableString(string);
                int E = C112550d0.m153769E(spannableString, "《", 0, false, 6, (Object) null);
                if (E != -1) {
                    spannableString.setSpan(new C59771w(liveVisitorPluginLayout), E, spannableString.length(), 0);
                }
                bundle.putString("PARAM_LIVE_EXCEPTION_TITLE", liveVisitorPluginLayout.getContext().getResources().getString(C0966R.string.g77));
                bundle.putCharSequence("PARAM_LIVE_EXCEPTION_DESC", spannableString);
                bundle.putInt("PARAM_LIVE_EXCEPTION_ICON_RES", C0966R.raw.icons_filled_live_err_red);
                liveVisitorPluginLayout.statusChange(C58124b.C58125b.LIVE_STATUS_EXCEPTION, bundle);
                return;
            case -100056:
                C58124b.C7172a.m7372a(liveVisitorPluginLayout, C58124b.C58125b.LIVE_STATUS_VISITOR_KICKED, (Bundle) null, 2, (Object) null);
                return;
            case -100038:
                C58124b.C7172a.m7372a(liveVisitorPluginLayout, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
                return;
            case FileReaderX5.ERR_CODE_NOT_SUPPORT:
                C77426q qVar2 = new C77426q(liveVisitorPluginLayout.getContext());
                qVar2.mo107606r(liveVisitorPluginLayout.getContext().getResources().getString(C0966R.string.g7r));
                qVar2.mo107601m(C0966R.string.f8028zq);
                qVar2.mo107600l(C59767s.f170660a);
                qVar2.mo107593e(new C59768t(liveVisitorPluginLayout));
                qVar2.mo107603o();
                return;
            default:
                C76912y0.makeText(liveVisitorPluginLayout.getContext(), (CharSequence) C76577a.m92166q(liveVisitorPluginLayout.getContext(), C0966R.string.g_2), 0).show();
                C58124b.C7172a.m7372a(liveVisitorPluginLayout, C58124b.C58125b.LIVE_STATUS_DISCONNECT, (Bundle) null, 2, (Object) null);
                return;
        }
    }

    /* renamed from: m */
    public static final void m62854m(LiveVisitorPluginLayout liveVisitorPluginLayout, float f, float f2) {
        liveVisitorPluginLayout.getClass();
        Log.m105924i("MicroMsg.LiveCoreVisitor", "toggleShowPlugins, pluginShow:" + liveVisitorPluginLayout.f157320E);
        RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
        if (!dVar.f157224a && !dVar.f157226c && dVar.f157225b) {
            C59772x xVar = new C59772x(liveVisitorPluginLayout);
            C7232x0 x0Var = liveVisitorPluginLayout.f157332h;
            Rect[] x0 = x0Var != null ? x0Var.mo8399x0() : null;
            int i = 0;
            if (x0 != null) {
                int length = x0.length;
                int i2 = 0;
                while (i < length) {
                    if (x0[i].contains((int) f, (int) f2)) {
                        i2 = 1;
                    }
                    i++;
                }
                i = i2;
            }
            if (i == 0) {
                xVar.invoke();
            }
        }
    }

    public void callback(int i, Bundle bundle) {
        C58115i iVar;
        String string;
        int i2;
        String str;
        C58115i iVar2;
        C32224a<C13598b0> aVar;
        C53979a.C53980a aVar2;
        LivePreviewView livePreviewView;
        int i3 = i;
        Bundle bundle2 = bundle;
        Log.m105924i("MicroMsg.LiveCoreVisitor", "callback:" + i3);
        String str2 = null;
        if (i3 == 0) {
            C58124b.C7172a.m7372a(this, C58124b.C58125b.RENDERING, (Bundle) null, 2, (Object) null);
            return;
        }
        int i4 = 1;
        if (i3 == 1) {
            if (bundle2 != null) {
                String string2 = bundle2.getString("live_user_id");
                bundle2.getString("live_user_exit_reason");
                StringBuilder sb = new StringBuilder();
                sb.append("EVT_ROOM_USER_EXIT sdkUid:");
                sb.append(string2);
                sb.append(" micUid:");
                C53979a.C53980a aVar3 = RoomLiveService.f157185Q.f151234i;
                sb.append(aVar3 != null ? aVar3.f151240e : null);
                Log.m105924i("MicroMsg.LiveCoreAnchor", sb.toString());
                C53979a.C53980a aVar4 = RoomLiveService.f157185Q.f151234i;
                if ((C87412m.m108589b(string2, aVar4 != null ? aVar4.f151240e : null) || C87412m.m108589b(string2, RoomLiveService.f157197h.f133064u)) && (aVar2 = RoomLiveService.f157185Q.f151234i) != null) {
                    C58221v1 v1Var = this.f157330f;
                    if (!(v1Var == null || (livePreviewView = v1Var.f166731i) == null)) {
                        livePreviewView.clearAnimation();
                    }
                    RoomLiveService.f157185Q.mo74654d(aVar2.f151236a, aVar2.f151238c, aVar2.f151237b);
                }
                if (C87412m.m108589b(string2, RoomLiveService.f157197h.f133064u)) {
                    this.f157319D = true;
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_ANCHOR_EXCEPTION, (Bundle) null, 2, (Object) null);
                }
            }
        } else if (i3 != 2) {
            int i5 = 0;
            if (i3 == 3) {
                int i6 = this.f157326K;
                C62197e eVar = this.f157323H;
                if (!(eVar == null || (iVar2 = eVar.f172989A) == null)) {
                    i4 = iVar2.f166265l;
                }
                this.f157326K = i4;
                if (i6 != 3 && i4 == 3) {
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_DISCONNECT, (Bundle) null, 2, (Object) null);
                } else if (i6 == 3 && i4 != 3) {
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_CONNECT_SUCC, (Bundle) null, 2, (Object) null);
                    C58221v1 v1Var2 = this.f157330f;
                    if (v1Var2 != null) {
                        v1Var2.mo3209s0();
                    }
                    C86709a0.m107529k().f251779b.mo123460f(new C16103b(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
                }
            } else {
                String str3 = "";
                if (i3 == 4) {
                    C62197e eVar2 = this.f157323H;
                    if (eVar2 != null && eVar2.f172989A.mo82882d()) {
                        i2 = 1;
                    } else {
                        C62197e eVar3 = this.f157323H;
                        i2 = eVar3 != null && eVar3.f172989A.mo82884f() ? 2 : 0;
                    }
                    int i7 = this.f157321F;
                    if (i7 == 0) {
                        i5 = 2;
                    } else if (i7 == 1) {
                        i5 = 1;
                    }
                    String str4 = RoomLiveService.f157192c;
                    long j = RoomLiveService.f157197h.f133050d;
                    C53979a.C53980a aVar5 = RoomLiveService.f157185Q.f151234i;
                    if (aVar5 == null || (str = aVar5.f151237b) == null) {
                        str = str3;
                    }
                    C58532b.m67945a(str4, j, str, RoomLiveService.f157199j, i2, i5, i);
                } else if (i3 == 6) {
                    long j2 = RoomLiveService.f157197h.f133050d;
                    String str5 = RoomLiveService.f157192c;
                    String str6 = RoomLiveService.f157197h.f133051e;
                    C87412m.m108593f(str6, "RoomLiveService.liveInfo.live_name");
                    new C66516i(j2, str5, str6, false, 8, (C8480h) null).mo90593a(new C55242a(this));
                } else if (i3 == 7) {
                    if (!(bundle2 == null || (string = bundle2.getString("live_user_id")) == null)) {
                        str3 = string;
                    }
                    C62197e eVar4 = this.f157323H;
                    if (!Util.isEqual(str3, (eVar4 == null || (iVar = eVar4.f172989A) == null) ? null : iVar.f166260g)) {
                        RoomLiveService.C55212c cVar = RoomLiveService.f157212w;
                        cVar.getClass();
                        cVar.f157220a = str3;
                        RoomLiveService.f157212w.f157221b = bundle2 != null ? bundle2.getInt("live_stream_type") : 0;
                        RoomLiveService.f157212w.f157222c = bundle2 != null ? bundle2.getInt("live_first_frame_width") : 0;
                        RoomLiveService.C55212c cVar2 = RoomLiveService.f157212w;
                        if (bundle2 != null) {
                            i5 = bundle2.getInt("live_first_frame_height");
                        }
                        cVar2.f157223d = i5;
                        C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_FIRST_I_FRAME, (Bundle) null, 2, (Object) null);
                        return;
                    }
                    this.f157319D = false;
                } else if (i3 == 11) {
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.START_LIVE, (Bundle) null, 2, (Object) null);
                } else if (i3 == 13) {
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_CONNECT_SUCC, (Bundle) null, 2, (Object) null);
                } else if (i3 == 14) {
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_RECONNECT, (Bundle) null, 2, (Object) null);
                } else if (i3 == 15) {
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_DISCONNECT, (Bundle) null, 2, (Object) null);
                }
            }
        } else if (bundle2 != null) {
            String string3 = bundle2.getString("live_user_id");
            if (bundle2.getBoolean("live_media_enable")) {
                C53979a aVar6 = RoomLiveService.f157185Q;
                C53979a.C53980a aVar7 = aVar6.f151234i;
                if (aVar7 != null) {
                    str2 = aVar7.f151240e;
                }
                if (C87412m.m108589b(string3, str2) && !aVar6.mo74651a() && (aVar = aVar6.f151231f) != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STOP_MIC, (Bundle) null, 2, (Object) null);
        }
    }

    public int getLiveRole() {
        return 0;
    }

    public int getRelativeLayoutId() {
        return C0966R.C0971layout.b7s;
    }

    public void initLogic(LiveConfig liveConfig, boolean z) {
        C58113g gVar;
        C58115i iVar;
        C58115i iVar2;
        C7174c cVar;
        C60735a aVar;
        C87412m.m108594g(liveConfig, "config");
        if (C62197e.f176819i1 == null) {
            C62197e.f176819i1 = new C62197e();
        }
        C62197e eVar = C62197e.f176819i1;
        C87412m.m108591d(eVar);
        this.f157323H = eVar;
        eVar.f173028o.mo88277g(getMiniView());
        C62197e eVar2 = this.f157323H;
        if (eVar2 != null) {
            eVar2.f173038x = this;
        }
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        String str = liveConfig.f157065f;
        C87412m.m108593f(str, "config.hostRoomId");
        RoomLiveService.f157192c = str;
        C49317ep2 ep22 = new C49317ep2();
        RoomLiveService.f157197h = ep22;
        ep22.f133050d = liveConfig.f157064e;
        String str2 = liveConfig.f157069j;
        C87412m.m108593f(str2, "config.anchorUsername");
        RoomLiveService.f157199j = str2;
        RoomLiveService.f157197h.f133060q = true;
        View findViewById = findViewById(C0966R.C0970id.fyd);
        C87412m.m108593f(findViewById, "findViewById(R.id.live_right_panel_ui_root)");
        this.f157334j = new C58234z((ViewGroup) findViewById, this);
        View findViewById2 = findViewById(C0966R.C0970id.fzn);
        C87412m.m108593f(findViewById2, "findViewById(R.id.live_title_ui_root)");
        this.f157333i = new C7182d1((ViewGroup) findViewById2, this);
        View findViewById3 = findViewById(C0966R.C0970id.g0i);
        C87412m.m108593f(findViewById3, "findViewById(R.id.live_visitor_comment_root)");
        this.f157336o = new C45268h1((ViewGroup) findViewById3, this);
        View findViewById4 = findViewById(C0966R.C0970id.fup);
        C87412m.m108593f(findViewById4, "findViewById(R.id.live_input_ui_root)");
        this.f157335n = new C58152h0((ViewGroup) findViewById4, this);
        View findViewById5 = findViewById(C0966R.C0970id.fra);
        C87412m.m108593f(findViewById5, "findViewById(R.id.live_after_ui_root)");
        this.f157338q = new C7174c((RelativeLayout) findViewById5, this);
        View findViewById6 = findViewById(C0966R.C0970id.fud);
        C87412m.m108593f(findViewById6, "findViewById(R.id.live_input_debug_view_root)");
        this.f157339r = new C7228w((ViewGroup) findViewById6, this);
        View findViewById7 = findViewById(C0966R.C0970id.fv9);
        C87412m.m108593f(findViewById7, "findViewById(R.id.live_loading_view_root)");
        this.f157340s = new C58192o0((ViewGroup) findViewById7, this);
        View findViewById8 = findViewById(C0966R.C0970id.fsz);
        C87412m.m108593f(findViewById8, "findViewById(R.id.live_comment_ui_root)");
        this.f157337p = new C45272n((ViewGroup) findViewById8, this);
        View findViewById9 = findViewById(C0966R.C0970id.fvw);
        C87412m.m108593f(findViewById9, "findViewById(R.id.live_members_list_ui_root)");
        this.f157341t = new C7219q0((ViewGroup) findViewById9, this);
        View findViewById10 = findViewById(C0966R.C0970id.fuw);
        C87412m.m108593f(findViewById10, "findViewById(R.id.live_like_confetti_ui_root)");
        this.f157342u = new C58187m0((ViewGroup) findViewById10, this);
        View findViewById11 = findViewById(C0966R.C0970id.fwn);
        C87412m.m108593f(findViewById11, "findViewById(R.id.live_mic_visitor_header_root)");
        this.f157343v = new C7226t0((ViewGroup) findViewById11, this);
        View findViewById12 = findViewById(C0966R.C0970id.fwz);
        C87412m.m108593f(findViewById12, "findViewById(R.id.live_preview_ui_root)");
        this.f157330f = new C58221v1((ViewGroup) findViewById12, this);
        View findViewById13 = findViewById(C0966R.C0970id.fzq);
        C87412m.m108593f(findViewById13, "findViewById(R.id.live_tx_live_player_ui_root)");
        this.f157331g = new C58128c1((ViewGroup) findViewById13, this);
        View findViewById14 = findViewById(C0966R.C0970id.fyi);
        C87412m.m108593f(findViewById14, "findViewById(R.id.live_shadow_ui_root)");
        this.f157332h = new C7232x0((ViewGroup) findViewById14, this);
        View findViewById15 = findViewById(C0966R.C0970id.g0b);
        C87412m.m108593f(findViewById15, "findViewById(R.id.live_video_mic_ui_root)");
        this.f157344w = new C58134f1((ViewGroup) findViewById15, this);
        View findViewById16 = findViewById(C0966R.C0970id.fw_);
        C87412m.m108593f(findViewById16, "findViewById(R.id.live_members_profile_ui_root)");
        this.f157345x = new C58197p0((ViewGroup) findViewById16, this);
        View findViewById17 = findViewById(C0966R.C0970id.fuu);
        C87412m.m108593f(findViewById17, "findViewById(R.id.live_kicked_ui_root)");
        this.f157346y = new C7202k0((ViewGroup) findViewById17, this);
        View findViewById18 = findViewById(C0966R.C0970id.g0h);
        C87412m.m108593f(findViewById18, "findViewById(R.id.live_visitor_close_ui_root)");
        this.f157347z = new C7195g1((ViewGroup) findViewById18, this);
        View findViewById19 = findViewById(C0966R.C0970id.ftd);
        C87412m.m108593f(findViewById19, "findViewById(R.id.live_common_info_ui_root)");
        this.f157316A = new C58213u((ViewGroup) findViewById19, this);
        View findViewById20 = findViewById(C0966R.C0970id.ftq);
        C87412m.m108593f(findViewById20, "findViewById(R.id.live_exception_ui_root)");
        this.f157317B = new C7230x((ViewGroup) findViewById20, this);
        View findViewById21 = findViewById(C0966R.C0970id.ftu);
        C87412m.m108593f(findViewById21, "findViewById(R.id.live_face_verify_ui_root)");
        this.f157318C = new C7233y((RelativeLayout) findViewById21, this);
        View findViewById22 = findViewById(C0966R.C0970id.fwv);
        C87412m.m108593f(findViewById22, "findViewById(R.id.live_minimize_ui_root)");
        new C58215u0((ViewGroup) findViewById22, this);
        C58221v1 v1Var = this.f157330f;
        if (v1Var != null) {
            C58134f1 f1Var = this.f157344w;
            v1Var.f166732j = f1Var != null ? new C63703d0(f1Var.f166543n.getHolder()) : null;
        }
        C66519j0.f191359e = liveConfig.f157063d == 0;
        C58187m0 m0Var = this.f157342u;
        if (m0Var != null) {
            m0Var.mo82949x0(liveConfig);
        }
        C7182d1 d1Var = this.f157333i;
        String str3 = "";
        if (d1Var != null) {
            String str4 = RoomLiveService.f157197h.f133051e;
            if (str4 == null) {
                str4 = str3;
            }
            d1Var.mo8366x0(str4, RoomLiveService.f157199j);
        }
        C7219q0 q0Var = this.f157341t;
        if (q0Var != null) {
            q0Var.mo8394x0(liveConfig);
        }
        C58197p0 p0Var = this.f157345x;
        if (p0Var != null) {
            p0Var.f166680x = liveConfig.f157063d == 0;
        }
        C58213u uVar = this.f157316A;
        if (uVar != null) {
            uVar.mo82958y0(liveConfig);
        }
        C58128c1 c1Var = this.f157331g;
        if (c1Var != null) {
            if (C62197e.f176819i1 == null) {
                C62197e.f176819i1 = new C62197e();
            }
            C62197e eVar3 = C62197e.f176819i1;
            C87412m.m108591d(eVar3);
            c1Var.f166519j = eVar3;
        }
        C58134f1 f1Var2 = this.f157344w;
        if (f1Var2 != null) {
            if (liveConfig.f157063d == 0) {
                if (C54655b.f153178f1 == null) {
                    C54655b.f153178f1 = new C54655b();
                }
                aVar = C54655b.f153178f1;
                C87412m.m108591d(aVar);
            } else {
                if (C62197e.f176819i1 == null) {
                    C62197e.f176819i1 = new C62197e();
                }
                aVar = C62197e.f176819i1;
                C87412m.m108591d(aVar);
            }
            f1Var2.f166544o = aVar;
        }
        C58213u uVar2 = this.f157316A;
        if (uVar2 != null) {
            uVar2.mo10792g(8);
        }
        C7195g1 g1Var = this.f157347z;
        if (g1Var != null) {
            g1Var.mo10792g(8);
        }
        C7174c cVar2 = this.f157338q;
        if (cVar2 != null) {
            cVar2.mo10792g(8);
        }
        C45268h1 h1Var = this.f157336o;
        if (h1Var != null) {
            h1Var.mo10792g(8);
        }
        C58152h0 h0Var = this.f157335n;
        if (h0Var != null) {
            h0Var.mo10792g(8);
        }
        C58234z zVar = this.f157334j;
        if (zVar != null) {
            zVar.mo10792g(8);
        }
        C7219q0 q0Var2 = this.f157341t;
        if (q0Var2 != null) {
            q0Var2.mo10792g(8);
        }
        C58192o0 o0Var = this.f157340s;
        if (o0Var != null) {
            o0Var.mo82950x0(liveConfig.f157069j);
        }
        C58221v1 v1Var2 = this.f157330f;
        if (v1Var2 != null) {
            v1Var2.mo10792g(0);
        }
        C58128c1 c1Var2 = this.f157331g;
        if (c1Var2 != null) {
            c1Var2.mo10792g(8);
        }
        C7232x0 x0Var = this.f157332h;
        if (x0Var != null) {
            x0Var.mo10792g(8);
        }
        C58134f1 f1Var3 = this.f157344w;
        if (f1Var3 != null) {
            f1Var3.mo10792g(8);
        }
        C58197p0 p0Var2 = this.f157345x;
        if (p0Var2 != null) {
            p0Var2.mo10792g(8);
        }
        C7202k0 k0Var = this.f157346y;
        if (k0Var != null) {
            k0Var.mo10792g(8);
        }
        C7230x xVar = this.f157317B;
        if (xVar != null) {
            xVar.mo10792g(8);
        }
        C7233y yVar = this.f157318C;
        if (yVar != null) {
            yVar.mo10792g(8);
        }
        C58221v1 v1Var3 = this.f157330f;
        if (v1Var3 != null) {
            C55246e eVar4 = new C55246e(this);
            LivePreviewView livePreviewView = v1Var3.f166731i;
            if (livePreviewView != null) {
                livePreviewView.setPreviewTouchListener(eVar4);
            }
        }
        C58128c1 c1Var3 = this.f157331g;
        if (c1Var3 != null) {
            c1Var3.f166517h.setPreviewTouchListener(new C55247f(this));
        }
        if (liveConfig.f157070n == 1 && (cVar = this.f157338q) != null) {
            cVar.f25155r.setVisibility(8);
            cVar.f25154q.setVisibility(0);
        }
        RoomLiveService.f157185Q.f151228c = new C55248g(this);
        C53496k kVar = C53496k.f150436a;
        Class<LiveVisitorPluginLayout> cls = LiveVisitorPluginLayout.class;
        C53496k.f150437b.put("LiveVisitorPluginLayout", new C55249h(this));
        if (BuildInfo.DEBUG ? false : LiveConfig.f157042V) {
            View findViewById23 = findViewById(C0966R.C0970id.ftu);
            C87412m.m108593f(findViewById23, "findViewById(R.id.live_face_verify_ui_root)");
            this.f157318C = new C7233y((RelativeLayout) findViewById23, this);
            statusChange(C58124b.C58125b.VISITOR_NOT_BIND_MOBILE, new Bundle());
            LiveConfig.f157042V = false;
        } else if (C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_LIVE_VISITOR_CUSTOM_ROOM_ID_INT_SYNC, 0) == 1) {
            C7228w wVar = this.f157339r;
            if (wVar != null) {
                wVar.mo10792g(0);
            }
        } else {
            int i = RoomLiveService.f157205p;
            if (i != -1) {
                Object systemService = getContext().getSystemService("window");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                if (i != ((WindowManager) systemService).getDefaultDisplay().getRotation()) {
                    if (RoomLiveService.f157209t.f157224a) {
                        C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
                    } else {
                        C62197e eVar5 = this.f157323H;
                        if (!((eVar5 == null || (iVar2 = eVar5.f172989A) == null || !iVar2.mo82884f()) ? false : true)) {
                            C62197e eVar6 = this.f157323H;
                            if (!((eVar6 == null || (iVar = eVar6.f172989A) == null || !iVar.mo82882d()) ? false : true)) {
                                C58114h hVar = RoomLiveService.f157201l;
                                this.f157321F = (hVar == null || (gVar = hVar.f166251b) == null) ? 1 : gVar.f166233c;
                                mo76522n(true);
                                if (RoomLiveService.f157210u.f10322a) {
                                    C7233y yVar2 = this.f157318C;
                                    if (yVar2 != null) {
                                        yVar2.mo10792g(0);
                                    }
                                    statusChange(C58124b.C58125b.START_FACE_VERIFY, new Bundle());
                                    RoomLiveService.f157210u.f10322a = false;
                                }
                            }
                        }
                        C58124b.C7172a.m7372a(this, C58124b.C58125b.START_LIVE, (Bundle) null, 2, (Object) null);
                    }
                }
            }
            C49317ep2 ep23 = RoomLiveService.f157197h;
            String str5 = ep23.f133051e;
            if (str5 != null) {
                str3 = str5;
            }
            mo76523o(str3, ep23.f133050d, RoomLiveService.f157192c);
        }
        Class<LiveVisitorPluginLayout> cls2 = LiveVisitorPluginLayout.class;
        kVar.mo74171d("LiveVisitorPluginLayout", this.f157328M);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isLiving() {
        /*
            r3 = this;
            p50.e r0 = r3.f157323H
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.mo82885g()
            if (r0 != r1) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveVisitorPluginLayout.isLiving():boolean");
    }

    public void keyboardChange(boolean z, int i) {
        super.keyboardChange(z, i);
    }

    public void mount() {
        super.mount();
        C86709a0.m107529k().f251779b.mo123455a(3806, this);
    }

    /* renamed from: n */
    public final void mo76522n(boolean z) {
        C58924d dVar;
        boolean z2 = z;
        Log.m105924i("MicroMsg.LiveCoreVisitor", "audienceMode:" + this.f157321F);
        int i = this.f157321F;
        if (i == 0) {
            Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorPlayUseTRTC");
            C115669n.INSTANCE.mo175913w(1381, 13, 1);
            C58221v1 v1Var = this.f157330f;
            if (v1Var != null) {
                RoomLiveService roomLiveService = RoomLiveService.f157190a;
                C58114h hVar = RoomLiveService.f157201l;
                C87412m.m108591d(hVar);
                v1Var.mo82963x0(hVar, new C55243b(z2, this));
            }
            C58221v1 v1Var2 = this.f157330f;
            if (v1Var2 != null) {
                v1Var2.mo10792g(0);
            }
        } else if (i == 1) {
            Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorPlayUseCdn");
            C115669n.INSTANCE.mo175913w(1381, 12, 1);
            C62197e eVar = this.f157323H;
            if (eVar != null) {
                RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
                C58114h hVar2 = RoomLiveService.f157201l;
                C87412m.m108591d(hVar2);
                C54408d.C54409a.m61122b(eVar, hVar2, false, false, 6, (Object) null);
            }
            C62197e eVar2 = this.f157323H;
            if (eVar2 != null) {
                RoomLiveService roomLiveService3 = RoomLiveService.f157190a;
                C58114h hVar3 = RoomLiveService.f157201l;
                C87412m.m108591d(hVar3);
                eVar2.mo87274Q0(hVar3.f166251b);
            }
            C58128c1 c1Var = this.f157331g;
            LiveVideoView liveVideoView = null;
            if (c1Var != null) {
                int renderMode = getRenderMode();
                C55244c cVar = new C55244c(z2, this);
                C62197e eVar3 = c1Var.f166519j;
                if (eVar3 != null) {
                    Context context = c1Var.f166287d.getContext();
                    C87412m.m108593f(context, "root.context");
                    dVar = eVar3.mo87268G0(context, (TXLivePlayConfig) null, (C62195b) null, false);
                } else {
                    dVar = null;
                }
                c1Var.f166518i = dVar;
                C62197e eVar4 = c1Var.f166519j;
                if (eVar4 != null && eVar4.f173000L == 0) {
                    if (dVar != null) {
                        dVar.setRenderMode(1);
                    }
                } else if (dVar != null) {
                    dVar.setRenderMode(renderMode);
                }
                Log.m105924i(c1Var.f166516g, "startPlay, type:" + 1 + ", rederMode:" + renderMode);
                c1Var.f166520n = 1;
                C62197e eVar5 = c1Var.f166519j;
                if (eVar5 != null) {
                    eVar5.mo87255B0(1, c1Var.f166517h, new C7173b1(cVar));
                }
            }
            C58128c1 c1Var2 = this.f157331g;
            if (c1Var2 != null) {
                c1Var2.mo10792g(0);
            }
            C62197e eVar6 = this.f157323H;
            if (eVar6 != null) {
                RoomLiveService roomLiveService4 = RoomLiveService.f157190a;
                long j = RoomLiveService.f157197h.f133050d;
                C58128c1 c1Var3 = this.f157331g;
                C58924d dVar2 = c1Var3 != null ? c1Var3.f166518i : null;
                if (c1Var3 != null) {
                    liveVideoView = c1Var3.f166517h;
                    C87412m.m108593f(liveVideoView, "txLivePlayerPreview");
                }
                eVar6.mo87270J0(j, dVar2, liveVideoView);
            }
        }
    }

    public String name() {
        Class<LiveVisitorPluginLayout> cls = LiveVisitorPluginLayout.class;
        return "LiveVisitorPluginLayout";
    }

    /* renamed from: o */
    public final void mo76523o(String str, long j, String str2) {
        Log.m105924i("MicroMsg.LiveCoreVisitor", "join, name:" + str + ", roomID:" + j);
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        new C66516i(RoomLiveService.f157197h.f133050d, str2, str, false, 8, (C8480h) null).mo90593a(new C55245d(this));
    }

    public boolean onBackPress() {
        boolean onBackPress = super.onBackPress();
        if (onBackPress) {
            return onBackPress;
        }
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
        if (!dVar.f157225b) {
            return onBackPress;
        }
        dVar.f157225b = false;
        C58124b.C7172a.m7372a(this, C58124b.C58125b.CLOSE_LIVE, (Bundle) null, 2, (Object) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
        r0 = r0.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallStateChanged(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "incomingNumber"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "onCallStateChanged state:"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", isFloatMode:"
            r6.append(r0)
            p50.e r0 = r4.f157323H
            if (r0 == 0) goto L_0x0028
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.mo82881c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "MicroMsg.LiveCoreVisitor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            r6 = 2
            if (r5 == r6) goto L_0x0039
            goto L_0x006c
        L_0x0039:
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            z50.m r6 = new z50.m
            te3.ep2 r0 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r0 = r0.f133050d
            java.lang.String r2 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r3 = 1
            r6.<init>(r0, r2, r3)
            r5.mo123460f(r6)
            com.tencent.mm.live.model.RoomLiveService r5 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.p014mm.live.model.RoomLiveService.f157204o = r3
            p50.e r6 = r4.f157323H
            if (r6 == 0) goto L_0x005f
            d50.i r6 = r6.f172989A
            boolean r6 = r6.mo82884f()
            if (r6 != r3) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            if (r3 == 0) goto L_0x0069
            p50.e r6 = r4.f157323H
            if (r6 == 0) goto L_0x0069
            r6.mo85702u0()
        L_0x0069:
            r5.mo76444b()
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveVisitorPluginLayout.onCallStateChanged(int, java.lang.String):void");
    }

    public void onRotationSwitchChange(boolean z) {
        this.f157324I = z;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.LiveCoreVisitor", "errType:" + i + " errCode:" + i2);
        if ((yVar instanceof C16103b) && i == 0 && i2 == 0) {
            C45268h1 h1Var = this.f157336o;
            if (h1Var != null) {
                h1Var.mo70805x0();
            }
            C7182d1 d1Var = this.f157333i;
            if (d1Var != null) {
                String str2 = RoomLiveService.f157197h.f133051e;
                if (str2 == null) {
                    str2 = "";
                }
                d1Var.mo8366x0(str2, RoomLiveService.f157199j);
            }
            RoomLiveService.f157200k = !RoomLiveService.f157197h.f133060q ? C31543z5.m39455e() : 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009f, code lost:
        r0 = r0.f172989A;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pause() {
        /*
            r7 = this;
            super.pause()
            com.tencent.mm.live.model.RoomLiveService r0 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            int r0 = com.tencent.p014mm.live.model.RoomLiveService.f157205p
            r1 = -1
            java.lang.String r2 = "null cannot be cast to non-null type android.view.WindowManager"
            java.lang.String r3 = "window"
            r4 = 1
            r5 = 0
            if (r0 == r1) goto L_0x002a
            android.content.Context r1 = r7.getContext()
            java.lang.Object r1 = r1.getSystemService(r3)
            gy3.C87412m.m108592e(r1, r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            int r1 = r1.getRotation()
            if (r0 == r1) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "orientationChanged:"
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = ", "
            r1.append(r6)
            android.content.Context r6 = r7.getContext()
            java.lang.Object r3 = r6.getSystemService(r3)
            gy3.C87412m.m108592e(r3, r2)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r2 = r3.getDefaultDisplay()
            int r2 = r2.getRotation()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.LiveCoreVisitor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r0 != 0) goto L_0x009b
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r1 = r0.f157224a
            if (r1 != 0) goto L_0x009b
            boolean r1 = r0.f157226c
            if (r1 != 0) goto L_0x009b
            boolean r1 = r0.f157227d
            if (r1 != 0) goto L_0x009b
            boolean r0 = r0.f157225b
            if (r0 == 0) goto L_0x009b
            boolean r0 = com.tencent.p014mm.live.model.RoomLiveService.f157204o
            if (r0 != 0) goto L_0x009b
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            android.content.Context r1 = r7.getContext()
            r2 = 21
            boolean r0 = r0.mo125776TW(r1, r2)
            if (r0 == 0) goto L_0x009b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 3
            java.lang.String r2 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            r0.putInt(r2, r1)
            d60.b$b r1 = d60.C58124b.C58125b.MINI_WINDOW
            r7.statusChange(r1, r0)
            goto L_0x00b5
        L_0x009b:
            p50.e r0 = r7.f157323H
            if (r0 == 0) goto L_0x00ab
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r0.mo82886h()
            if (r0 != r4) goto L_0x00ab
            r0 = 1
            goto L_0x00ac
        L_0x00ab:
            r0 = 0
        L_0x00ac:
            if (r0 == 0) goto L_0x00b5
            p50.e r0 = r7.f157323H
            if (r0 == 0) goto L_0x00b5
            r0.mo87271L0()
        L_0x00b5:
            p50.e r0 = r7.f157323H
            if (r0 == 0) goto L_0x00c4
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r0.mo82884f()
            if (r0 != r4) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            if (r4 == 0) goto L_0x00ce
            p50.e r0 = r7.f157323H
            if (r0 == 0) goto L_0x00ce
            r0.mo85702u0()
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveVisitorPluginLayout.pause():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0047, code lost:
        r2 = r2.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resume() {
        /*
            r8 = this;
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r1 = 0
            r0.f157227d = r1
            android.content.Context r0 = r8.getContext()
            java.lang.String r2 = "window"
            java.lang.Object r0 = r0.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.WindowManager"
            gy3.C87412m.m108592e(r0, r2)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            int r0 = r0.getRotation()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "curOrientation:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", lastOrientation:"
            r2.append(r3)
            int r3 = com.tencent.p014mm.live.model.RoomLiveService.f157205p
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.LiveCoreVisitor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            super.resume()
            p50.e r2 = r8.f157323H
            r3 = 1
            if (r2 == 0) goto L_0x0053
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0053
            boolean r2 = r2.mo82886h()
            if (r2 != r3) goto L_0x0053
            r2 = 1
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            if (r2 == 0) goto L_0x005d
            p50.e r2 = r8.f157323H
            if (r2 == 0) goto L_0x005d
            r2.mo87272N0()
        L_0x005d:
            int r2 = com.tencent.p014mm.live.model.RoomLiveService.f157205p
            r4 = -1
            r5 = 0
            if (r2 == r4) goto L_0x00f2
            if (r0 == r2) goto L_0x00f2
            p50.e r2 = r8.f157323H
            if (r2 == 0) goto L_0x006c
            r2.mo75580f0()
        L_0x006c:
            p50.e r2 = r8.f157323H
            if (r2 == 0) goto L_0x00e1
            d50.i r4 = r2.f172989A
            java.lang.String r4 = r4.f166260g
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x009c
            n50.d r4 = r2.mo85680X()
            d50.i r6 = r2.f172989A
            java.lang.String r6 = r6.f166260g
            com.tencent.mm.live.core.view.LivePreviewView r7 = r2.f173033s
            if (r7 == 0) goto L_0x008b
            com.tencent.rtmp.ui.TXCloudVideoView r7 = r7.mo76418a(r6, r1)
            goto L_0x008c
        L_0x008b:
            r7 = r5
        L_0x008c:
            r4.mo86568k(r6, r1, r7)
            n50.d r4 = r2.mo85680X()
            d50.i r6 = r2.f172989A
            java.lang.String r6 = r6.f166260g
            com.tencent.trtc.TRTCCloud r4 = r4.f175236b
            r4.muteRemoteAudio(r6, r1)
        L_0x009c:
            d50.i r4 = r2.f172989A
            java.lang.String r4 = r4.f166261h
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x00c8
            n50.d r4 = r2.mo85680X()
            d50.i r6 = r2.f172989A
            java.lang.String r6 = r6.f166261h
            com.tencent.mm.live.core.view.LivePreviewView r7 = r2.f173033s
            if (r7 == 0) goto L_0x00b7
            com.tencent.rtmp.ui.TXCloudVideoView r7 = r7.mo76418a(r6, r1)
            goto L_0x00b8
        L_0x00b7:
            r7 = r5
        L_0x00b8:
            r4.mo86568k(r6, r1, r7)
            n50.d r4 = r2.mo85680X()
            d50.i r6 = r2.f172989A
            java.lang.String r6 = r6.f166260g
            com.tencent.trtc.TRTCCloud r4 = r4.f175236b
            r4.muteRemoteAudio(r6, r1)
        L_0x00c8:
            d50.i r4 = r2.f172989A
            boolean r4 = r4.mo82884f()
            if (r4 == 0) goto L_0x00e1
            com.tencent.mm.live.core.view.LivePreviewView r4 = r2.f173033s
            if (r4 == 0) goto L_0x00e1
            p50.f r6 = new p50.f
            r6.<init>(r2)
            p50.g r7 = new p50.g
            r7.<init>(r2)
            r4.mo76421d(r6, r7)
        L_0x00e1:
            d60.v1 r2 = r8.f157330f
            if (r2 == 0) goto L_0x0111
            com.tencent.mm.live.model.RoomLiveService$c r2 = com.tencent.p014mm.live.model.RoomLiveService.f157212w
            int r4 = r2.f157222c
            java.lang.String r2 = r2.f157220a
            java.lang.String r4 = "userId"
            gy3.C87412m.m108594g(r2, r4)
            goto L_0x0111
        L_0x00f2:
            p50.e r2 = r8.f157323H
            if (r2 == 0) goto L_0x0100
            d50.i r4 = r2.f172989A
            if (r4 == 0) goto L_0x0100
            boolean r4 = r4.f166254a
            if (r4 != 0) goto L_0x0100
            r4 = 1
            goto L_0x0101
        L_0x0100:
            r4 = 0
        L_0x0101:
            if (r4 == 0) goto L_0x0109
            if (r2 == 0) goto L_0x0111
            r2.mo75580f0()
            goto L_0x0111
        L_0x0109:
            if (r2 == 0) goto L_0x0111
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0111
            r2.f166254a = r1
        L_0x0111:
            p50.e r2 = r8.f157323H
            if (r2 == 0) goto L_0x0120
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0120
            boolean r2 = r2.mo82884f()
            if (r2 != r3) goto L_0x0120
            r1 = 1
        L_0x0120:
            if (r1 == 0) goto L_0x0138
            d60.v1 r1 = r8.f157330f
            if (r1 == 0) goto L_0x0129
            r1.mo82964y0()
        L_0x0129:
            d60.v1 r1 = r8.f157330f
            if (r1 == 0) goto L_0x0138
            p50.e r2 = r1.f166730h
            if (r2 == 0) goto L_0x0138
            com.tencent.mm.live.core.view.LivePreviewView r1 = r1.f166731i
            s50.a r3 = com.tencent.p014mm.live.model.RoomLiveService.f157191b
            r2.mo85700s0(r1, r3, r5)
        L_0x0138:
            com.tencent.p014mm.live.model.RoomLiveService.f157205p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveVisitorPluginLayout.resume():void");
    }

    public void start() {
        super.start();
        boolean z = false;
        C86709a0.m107529k().f251779b.mo123460f(new C16103b(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
        C62197e eVar = this.f157323H;
        if (eVar != null && eVar.f172989A.mo82884f()) {
            z = true;
        }
        if (!z && this.f157324I) {
            RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
            if (!dVar.f157224a && !dVar.f157226c) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).setRequestedOrientation(4);
            }
        }
        this.f157329N.stopTimer();
        this.f157329N.startTimer(1000);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: d50.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: s50.d0} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: type inference failed for: r7v20 */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v23 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0318, code lost:
        r2 = r0.f157323H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x031a, code lost:
        if (r2 == null) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x031c, code lost:
        r2 = r2.f172989A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x031e, code lost:
        if (r2 == null) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0320, code lost:
        r2.mo82879a();
        r2 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void statusChange(d60.C58124b.C58125b r35, android.os.Bundle r36) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            java.lang.Class<wo.b> r2 = p740wo.C53193b.class
            java.lang.String r3 = "status"
            r4 = r35
            gy3.C87412m.m108594g(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "statusChange:"
            r3.append(r5)
            java.lang.String r5 = r35.name()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MicroMsg.LiveCoreVisitor"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            int r3 = r35.ordinal()
            r6 = 3
            if (r3 == r6) goto L_0x0757
            r6 = 13
            r7 = 0
            r8 = 1
            r9 = 0
            if (r3 == r6) goto L_0x071c
            r5 = 16
            r6 = 4
            java.lang.String r10 = "null cannot be cast to non-null type android.app.Activity"
            java.lang.String r11 = "MicroMsg.LiveCdnPlayerManager"
            if (r3 == r5) goto L_0x06b4
            r5 = 32
            if (r3 == r5) goto L_0x06ab
            r5 = 39
            r12 = 2
            if (r3 == r5) goto L_0x060a
            r5 = 51
            if (r3 == r5) goto L_0x05d6
            r5 = 53
            if (r3 == r5) goto L_0x05a7
            r5 = 62
            if (r3 == r5) goto L_0x0593
            r5 = 64
            if (r3 == r5) goto L_0x0572
            r5 = 66
            if (r3 == r5) goto L_0x052f
            r5 = 18
            if (r3 == r5) goto L_0x0522
            r5 = 19
            if (r3 == r5) goto L_0x0502
            r5 = 46
            java.lang.String r12 = "MicroMsg.LiveVisitorIDKeyStat"
            if (r3 == r5) goto L_0x04ce
            r5 = 47
            r13 = 8
            if (r3 == r5) goto L_0x03ce
            r5 = 57
            if (r3 == r5) goto L_0x03c3
            r5 = 58
            if (r3 == r5) goto L_0x0384
            r5 = 1000(0x3e8, float:1.401E-42)
            switch(r3) {
                case 6: goto L_0x0176;
                case 7: goto L_0x0101;
                case 8: goto L_0x00a3;
                case 9: goto L_0x0089;
                default: goto L_0x007e;
            }
        L_0x007e:
            switch(r3) {
                case 21: goto L_0x01c5;
                case 22: goto L_0x0196;
                case 23: goto L_0x0181;
                case 24: goto L_0x0318;
                default: goto L_0x0081;
            }
        L_0x0081:
            switch(r3) {
                case 26: goto L_0x0318;
                case 27: goto L_0x02ec;
                case 28: goto L_0x0277;
                case 29: goto L_0x0261;
                case 30: goto L_0x0229;
                default: goto L_0x0084;
            }
        L_0x0084:
            switch(r3) {
                case 41: goto L_0x037c;
                case 42: goto L_0x035b;
                case 43: goto L_0x0340;
                case 44: goto L_0x0327;
                default: goto L_0x0087;
            }
        L_0x0087:
            goto L_0x06b0
        L_0x0089:
            y50.k r2 = y50.C53496k.f150436a
            r2.mo74173f()
            y50.j0 r2 = y50.C66519j0.f191358d
            r2.mo90606j()
            android.content.Context r2 = r34.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.finishAndRemoveTask()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x00a3:
            b60.e r3 = b60.C28260e.m38144jo()
            java.lang.String r6 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r3.mo55885Lo(r6)
            com.tencent.mm.autogen.mmdata.rpt.LiveVisitorEnterLiveStruct r3 = e60.C58532b.f167567b
            long r6 = java.lang.System.currentTimeMillis()
            r3.f156465r = r6
            com.tencent.mm.autogen.mmdata.rpt.LiveVisitorEnterLiveStruct r3 = e60.C58532b.f167567b
            long r6 = r3.f156465r
            long r11 = r3.f156464q
            long r6 = r6 - r11
            long r11 = (long) r5
            long r6 = r6 / r11
            r3.f156463p = r6
            di3.d r2 = di3.C86312j.m106911c(r2)
            wo.b r2 = (p740wo.C53193b) r2
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            int r2 = r2.mo73729p1(r5)
            long r5 = (long) r2
            r3.f156466s = r5
            java.lang.String r11 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r12 = r2.f133050d
            int r14 = com.tencent.p014mm.live.model.RoomLiveService.f157172D
            int r15 = com.tencent.p014mm.live.model.RoomLiveService.f157174F
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r2 = r2.f133055i
            int r17 = com.tencent.p014mm.live.model.RoomLiveService.f157175G
            int r18 = com.tencent.p014mm.live.model.RoomLiveService.f157176H
            int r19 = com.tencent.p014mm.live.model.RoomLiveService.f157177I
            int r20 = com.tencent.p014mm.live.model.RoomLiveService.f157178J
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r3 = r3.f133065v
            r16 = r2
            r21 = r3
            e60.C58532b.m67949e(r11, r12, r14, r15, r16, r17, r18, r19, r20, r21)
            com.tencent.p014mm.live.model.RoomLiveService.f157204o = r8
            android.content.Context r2 = r34.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.finishAndRemoveTask()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0101:
            if (r1 == 0) goto L_0x010e
            java.lang.String r2 = "PARAM_LIVE_START_BY_ORIENTATION_CHANGE"
            boolean r2 = r1.getBoolean(r2, r9)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x010f
        L_0x010e:
            r2 = r7
        L_0x010f:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r2 = gy3.C87412m.m108589b(r2, r3)
            if (r2 == 0) goto L_0x0154
            eb0.e r2 = r0.f157325J
            r2.mo136892d(r7)
            y50.j0 r2 = y50.C66519j0.f191358d
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r5 = 3767(0xeb7, float:5.279E-42)
            r3.mo123455a(r5, r2)
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r5 = 589(0x24d, float:8.25E-43)
            r3.mo123455a(r5, r2)
            r2 = 0
            y50.j0$a r5 = y50.C66519j0.C53494a.f150434d
            java.util.regex.Pattern r6 = o40.C61926c.f176038a
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r5)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r5, r2)
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            z50.e r3 = new z50.e
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r5 = r5.f133050d
            java.lang.String r7 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r3.<init>(r5, r7)
            r2.mo123460f(r3)
        L_0x0154:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r2.f157225b = r8
            r2.f157224a = r9
            com.tencent.p014mm.live.model.RoomLiveService.f157179K = r9
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r0.f157329N
            r2.stopTimer()
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r0.f157329N
            r5 = 1000(0x3e8, double:4.94E-321)
            r2.startTimer(r5)
            com.tencent.mm.autogen.mmdata.rpt.LiveVisitorEnterLiveStruct r2 = e60.C58532b.f167567b
            long r5 = java.lang.System.currentTimeMillis()
            r2.f156464q = r5
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0176:
            d60.d1 r2 = r0.f157333i
            if (r2 == 0) goto L_0x0759
            r2.mo10792g(r6)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0181:
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x0759
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0759
            d50.i$d r3 = d50.C58115i.C58119d.PERMISSION_MODE
            r2.f166258e = r3
            java.lang.String r2 = "MicroMsg.LiveStatus"
            java.lang.String r3 = "liveStatusModeChange changeToPermissionMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            goto L_0x0757
        L_0x0196:
            java.lang.String r13 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r14 = r2.f133050d
            java.lang.String r16 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r17 = 2
            r18 = 0
            r19 = 0
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r2 = r2.f133055i
            r21 = 32
            r22 = 0
            r20 = r2
            e60.C58532b.m67948d(r13, r14, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = "markVisitorMaximumView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1381(0x565, double:6.823E-321)
            r8 = 6
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x01c5:
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x01d4
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x01d4
            boolean r2 = r2.mo82881c()
            if (r2 != 0) goto L_0x01d4
            goto L_0x01d5
        L_0x01d4:
            r8 = 0
        L_0x01d5:
            if (r8 == 0) goto L_0x0225
            p50.e r13 = r0.f157323H
            if (r13 == 0) goto L_0x01f8
            android.content.Context r14 = r34.getContext()
            java.lang.String r2 = "context"
            gy3.C87412m.m108593f(r14, r2)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 254(0xfe, float:3.56E-43)
            r23 = 0
            b50.C54408d.C54409a.m61121a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x01f8:
            java.lang.String r24 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r2 = r2.f133050d
            java.lang.String r27 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r28 = 2
            r29 = 1
            r30 = 0
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r5 = r5.f133055i
            r32 = 32
            r33 = 0
            r25 = r2
            r31 = r5
            e60.C58532b.m67948d(r24, r25, r27, r28, r29, r30, r31, r32, r33)
            java.lang.String r2 = "markVisitorMinimumView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1381(0x565, double:6.823E-321)
            r8 = 5
            r10 = 1
            r5.mo175913w(r6, r8, r10)
        L_0x0225:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0229:
            d60.v1 r2 = r0.f157330f
            if (r2 == 0) goto L_0x0232
            r2.mo10792g(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0232:
            d60.v1 r2 = r0.f157330f
            if (r2 == 0) goto L_0x023b
            r2.mo82964y0()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x023b:
            d60.c1 r2 = r0.f157331g
            if (r2 == 0) goto L_0x0244
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0244:
            d60.c1 r2 = r0.f157331g
            if (r2 == 0) goto L_0x0759
            p50.e r2 = r2.f166519j
            if (r2 == 0) goto L_0x025d
            b50.g r2 = r2.f176822Y0
            r2.getClass()
            java.lang.String r3 = "pausePlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            f50.d r2 = r2.f152627a
            if (r2 == 0) goto L_0x025d
            r2.pause()
        L_0x025d:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0261:
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r2 = r2.f133051e
            java.lang.String r3 = "RoomLiveService.liveInfo.live_name"
            gy3.C87412m.m108593f(r2, r3)
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r5 = r3.f133050d
            java.lang.String r3 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r0.mo76523o(r2, r5, r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0277:
            b60.e r3 = b60.C28260e.m38144jo()
            com.tencent.mm.live.model.RoomLiveService r6 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            java.lang.String r6 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r3.mo55885Lo(r6)
            com.tencent.mm.autogen.mmdata.rpt.LiveVisitorEnterLiveStruct r3 = e60.C58532b.f167567b
            long r6 = java.lang.System.currentTimeMillis()
            r3.f156465r = r6
            com.tencent.mm.autogen.mmdata.rpt.LiveVisitorEnterLiveStruct r3 = e60.C58532b.f167567b
            long r6 = r3.f156465r
            long r10 = r3.f156464q
            long r6 = r6 - r10
            long r10 = (long) r5
            long r6 = r6 / r10
            r3.f156463p = r6
            di3.d r2 = di3.C86312j.m106911c(r2)
            wo.b r2 = (p740wo.C53193b) r2
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            int r2 = r2.mo73729p1(r5)
            long r5 = (long) r2
            r3.f156466s = r5
            java.lang.String r10 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r11 = r2.f133050d
            int r13 = com.tencent.p014mm.live.model.RoomLiveService.f157172D
            int r14 = com.tencent.p014mm.live.model.RoomLiveService.f157174F
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r15 = r2.f133055i
            int r16 = com.tencent.p014mm.live.model.RoomLiveService.f157175G
            int r17 = com.tencent.p014mm.live.model.RoomLiveService.f157176H
            int r18 = com.tencent.p014mm.live.model.RoomLiveService.f157177I
            int r19 = com.tencent.p014mm.live.model.RoomLiveService.f157178J
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r2 = r2.f133065v
            r20 = r2
            e60.C58532b.m67949e(r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x02cc
            r2.mo85693l0()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x02cc:
            com.tencent.p014mm.live.model.RoomLiveService.f157204o = r8
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r2.f157224a = r8
            r2.f157225b = r9
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            z50.b r3 = new z50.b
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r5 = r5.f133050d
            java.lang.String r7 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r3.<init>(r5, r7, r9)
            r2.mo123460f(r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x02ec:
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x02f5
            r2.mo85693l0()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x02f5:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r2.f157224a = r8
            r2.f157225b = r9
            b60.e r2 = b60.C28260e.m38144jo()
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r5 = r3.f133050d
            r2.mo55889d(r5)
            android.content.Context r2 = r34.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.setRequestedOrientation(r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0318:
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x0759
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0759
            r2.mo82879a()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0327:
            android.content.Context r2 = r34.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r3 = 14
            r2.setRequestedOrientation(r3)
            com.tencent.mm.live.view.RoomLiveMiniView r2 = r34.getMiniView()
            r2.mo76542e(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0340:
            boolean r2 = r0.f157324I
            if (r2 == 0) goto L_0x0350
            android.content.Context r2 = r34.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.setRequestedOrientation(r6)
        L_0x0350:
            com.tencent.mm.live.view.RoomLiveMiniView r2 = r34.getMiniView()
            r2.mo76542e(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x035b:
            d60.v1 r2 = r0.f157330f
            if (r2 != 0) goto L_0x0360
            goto L_0x0371
        L_0x0360:
            d60.f1 r3 = r0.f157344w
            if (r3 == 0) goto L_0x036f
            s50.d0 r7 = new s50.d0
            android.view.SurfaceView r3 = r3.f166543n
            android.view.SurfaceHolder r3 = r3.getHolder()
            r7.<init>(r3)
        L_0x036f:
            r2.f166732j = r7
        L_0x0371:
            com.tencent.mm.live.view.RoomLiveMiniView r2 = r34.getMiniView()
            r2.mo76542e(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x037c:
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r2.f157227d = r8
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0384:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r3 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r3 = r3.f157224a
            if (r3 != 0) goto L_0x03bf
            d60.v1 r3 = r0.f157330f
            if (r3 == 0) goto L_0x0395
            r3.mo10792g(r13)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0395:
            d60.y r3 = r0.f157318C
            if (r3 == 0) goto L_0x039e
            r3.mo10792g(r13)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x039e:
            d60.o0 r3 = r0.f157340s
            if (r3 == 0) goto L_0x03a7
            r3.mo10792g(r13)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x03a7:
            d60.x r3 = r0.f157317B
            if (r3 == 0) goto L_0x03b0
            r3.mo10792g(r9)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x03b0:
            r2.mo76446d()
            android.content.Context r2 = r34.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.setRequestedOrientation(r8)
        L_0x03bf:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x03c3:
            d60.o0 r2 = r0.f157340s
            if (r2 == 0) goto L_0x0759
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x03ce:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            r2.mo76446d()
            y50.j0 r2 = y50.C66519j0.f191358d
            r2.mo90605i()
            y50.k r3 = y50.C53496k.f150436a
            r3.mo74173f()
            r2.mo90606j()
            d60.d1 r2 = r0.f157333i
            if (r2 == 0) goto L_0x03e9
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x03e9:
            d60.x0 r2 = r0.f157332h
            if (r2 == 0) goto L_0x03f2
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x03f2:
            d60.c r2 = r0.f157338q
            if (r2 == 0) goto L_0x03fb
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x03fb:
            d60.h1 r2 = r0.f157336o
            if (r2 == 0) goto L_0x0404
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0404:
            d60.h0 r2 = r0.f157335n
            if (r2 == 0) goto L_0x040d
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x040d:
            d60.z r2 = r0.f157334j
            if (r2 == 0) goto L_0x0416
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0416:
            d60.q0 r2 = r0.f157341t
            if (r2 == 0) goto L_0x041f
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x041f:
            d60.o0 r2 = r0.f157340s
            if (r2 == 0) goto L_0x0428
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0428:
            d60.v1 r2 = r0.f157330f
            if (r2 == 0) goto L_0x0431
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0431:
            d60.c1 r2 = r0.f157331g
            if (r2 == 0) goto L_0x043a
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x043a:
            d60.f1 r2 = r0.f157344w
            if (r2 == 0) goto L_0x0443
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0443:
            d60.p0 r2 = r0.f157345x
            if (r2 == 0) goto L_0x044c
            r2.mo10792g(r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x044c:
            d60.k0 r2 = r0.f157346y
            if (r2 == 0) goto L_0x0455
            r2.mo10792g(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0455:
            d60.k0 r2 = r0.f157346y
            if (r2 == 0) goto L_0x047f
            java.lang.String r3 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            android.view.ViewGroup r5 = r2.f166287d
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131100897(0x7f0604e1, float:1.7814188E38)
            int r5 = r5.getColor(r6)
            d60.l0 r6 = new d60.l0
            r6.<init>(r2)
            zt3.t r2 = zt3.C119157j.f356862d
            c60.c r7 = new c60.c
            r7.<init>(r3, r6, r5)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183875f(r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x047f:
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x048d
            d50.i r2 = r2.f172989A
            boolean r2 = r2.mo82884f()
            if (r2 != r8) goto L_0x048d
            r2 = 1
            goto L_0x048e
        L_0x048d:
            r2 = 0
        L_0x048e:
            if (r2 != 0) goto L_0x04af
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x049d
            d50.i r2 = r2.f172989A
            boolean r2 = r2.mo82882d()
            if (r2 != r8) goto L_0x049d
            goto L_0x049e
        L_0x049d:
            r8 = 0
        L_0x049e:
            if (r8 != 0) goto L_0x04af
            int r2 = r0.f157321F
            if (r2 != 0) goto L_0x04a5
            goto L_0x04af
        L_0x04a5:
            d60.c1 r2 = r0.f157331g
            if (r2 == 0) goto L_0x04ca
            r2.mo82898x0(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x04ca
        L_0x04af:
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x04b8
            r2.mo87271L0()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x04b8:
            d60.v1 r2 = r0.f157330f
            if (r2 == 0) goto L_0x04ca
            p50.e r2 = r2.f166730h
            if (r2 == 0) goto L_0x04c8
            d60.w1 r3 = new d60.w1
            r3.<init>()
            r2.mo85676R(r3)
        L_0x04c8:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x04ca:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x04ce:
            java.lang.String r13 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r14 = r2.f133050d
            java.lang.String r16 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r17 = 8
            r18 = 1
            java.lang.String r2 = eb0.C75592q0.m90789s()
            java.lang.String r3 = "getUsernameFromUserInfo()"
            gy3.C87412m.m108593f(r2, r3)
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r3 = r3.f133055i
            r19 = r2
            r20 = r3
            e60.C58532b.m67947c(r13, r14, r16, r17, r18, r19, r20)
            java.lang.String r2 = "markClickAnchorAvatar"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 1381(0x565, double:6.823E-321)
            r8 = 3
            r10 = 1
            r5.mo175913w(r6, r8, r10)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0502:
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r3 = r2.f157224a
            if (r3 != 0) goto L_0x051e
            boolean r2 = r2.f157226c
            if (r2 != 0) goto L_0x051e
            d60.q0 r2 = r0.f157341t
            if (r2 == 0) goto L_0x0515
            r2.mo10792g(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0515:
            d60.q0 r2 = r0.f157341t
            if (r2 == 0) goto L_0x051e
            r2.mo8395y0()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x051e:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0522:
            d60.t0 r2 = r0.f157343v
            if (r2 == 0) goto L_0x052b
            java.util.ArrayList<d60.a> r3 = r0.f157322G
            r3.remove(r2)
        L_0x052b:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x052f:
            boolean r2 = r34.isLandscape()
            if (r2 != 0) goto L_0x056e
            d60.h0 r2 = r0.f157335n
            if (r2 == 0) goto L_0x0540
            int r2 = r2.mo14483f0()
            if (r2 != 0) goto L_0x0540
            goto L_0x0541
        L_0x0540:
            r8 = 0
        L_0x0541:
            if (r8 == 0) goto L_0x056e
            if (r1 == 0) goto L_0x054b
            java.lang.String r2 = "PARAM_LIVE_COMMENT_OFFSET_HEIGHT"
            int r9 = r1.getInt(r2)
        L_0x054b:
            d60.n r2 = r0.f157337p
            if (r2 == 0) goto L_0x0557
            android.view.ViewGroup r2 = r2.f166287d
            if (r2 == 0) goto L_0x0557
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
        L_0x0557:
            if (r7 == 0) goto L_0x056e
            boolean r2 = r7 instanceof android.widget.RelativeLayout.LayoutParams
            if (r2 == 0) goto L_0x056e
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            r7.bottomMargin = r9
            d60.n r2 = r0.f157337p
            if (r2 == 0) goto L_0x056e
            android.view.ViewGroup r2 = r2.f166287d
            if (r2 == 0) goto L_0x056e
            r2.requestLayout()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x056e:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0572:
            p50.e r2 = r0.f157323H
            if (r2 == 0) goto L_0x057d
            boolean r2 = r2.mo85682Z()
            if (r2 != r8) goto L_0x057d
            r9 = 1
        L_0x057d:
            if (r9 != 0) goto L_0x058f
            b60.e r2 = b60.C28260e.m38144jo()
            com.tencent.mm.live.model.RoomLiveService r3 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r2.mo55885Lo(r5)
            com.tencent.p014mm.live.model.RoomLiveService.f157204o = r8
            r3.mo76444b()
        L_0x058f:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0593:
            d60.v1 r2 = r0.f157330f
            if (r2 == 0) goto L_0x0759
            com.tencent.mm.live.model.RoomLiveService$c r2 = com.tencent.p014mm.live.model.RoomLiveService.f157212w
            int r3 = r2.f157222c
            java.lang.String r2 = r2.f157220a
            java.lang.String r3 = "userId"
            gy3.C87412m.m108594g(r2, r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x05a7:
            com.tencent.p014mm.live.model.RoomLiveService.f157172D = r8
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r3 = r2.f157224a
            if (r3 != 0) goto L_0x05d2
            boolean r2 = r2.f157226c
            if (r2 != 0) goto L_0x05d2
            d60.o0 r2 = r0.f157340s
            if (r2 == 0) goto L_0x05d2
            java.lang.String r3 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            android.content.Context r5 = r34.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131831989(0x7f112cb5, float:1.929702E38)
            java.lang.String r5 = r5.getString(r6)
            java.lang.String r6 = "context.resources.getStr…ive_anchor_exception_tip)"
            gy3.C87412m.m108593f(r5, r6)
            r2.mo82951y0(r3, r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x05d2:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x05d6:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.p014mm.live.model.RoomLiveService.f157172D = r12
            com.tencent.mm.live.model.RoomLiveService$d r3 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r5 = r3.f157224a
            if (r5 != 0) goto L_0x0606
            boolean r3 = r3.f157226c
            if (r3 != 0) goto L_0x0606
            d60.o0 r3 = r0.f157340s
            if (r3 == 0) goto L_0x0603
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            android.content.Context r6 = r34.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131832052(0x7f112cf4, float:1.9297147E38)
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "context.resources.getStr…_local_network_error_tip)"
            gy3.C87412m.m108593f(r6, r7)
            r3.mo82951y0(r5, r6)
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0603:
            r2.mo76446d()
        L_0x0606:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x060a:
            boolean r2 = r34.isLandscape()
            java.lang.String r3 = "PARAM_IS_ENTERING_COMMENT"
            if (r2 != 0) goto L_0x0688
            if (r1 == 0) goto L_0x061b
            boolean r2 = r1.getBoolean(r3)
            if (r2 != r8) goto L_0x061b
            goto L_0x061c
        L_0x061b:
            r8 = 0
        L_0x061c:
            r2 = 12
            if (r8 == 0) goto L_0x064a
            d60.n r3 = r0.f157337p
            if (r3 == 0) goto L_0x062c
            android.view.ViewGroup r3 = r3.f166287d
            if (r3 == 0) goto L_0x062c
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
        L_0x062c:
            if (r7 == 0) goto L_0x06a7
            boolean r3 = r7 instanceof android.widget.RelativeLayout.LayoutParams
            if (r3 == 0) goto L_0x06a7
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            r7.removeRule(r12)
            r7.addRule(r2)
            r7.bottomMargin = r9
            d60.n r2 = r0.f157337p
            if (r2 == 0) goto L_0x06a7
            android.view.ViewGroup r2 = r2.f166287d
            if (r2 == 0) goto L_0x06a7
            r2.requestLayout()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x06a7
        L_0x064a:
            d60.n r3 = r0.f157337p
            if (r3 == 0) goto L_0x0656
            android.view.ViewGroup r3 = r3.f166287d
            if (r3 == 0) goto L_0x0656
            android.view.ViewGroup$LayoutParams r7 = r3.getLayoutParams()
        L_0x0656:
            if (r7 == 0) goto L_0x06a7
            boolean r3 = r7 instanceof android.widget.RelativeLayout.LayoutParams
            if (r3 == 0) goto L_0x06a7
            android.widget.RelativeLayout$LayoutParams r7 = (android.widget.RelativeLayout.LayoutParams) r7
            r7.removeRule(r2)
            d60.h1 r3 = r0.f157336o
            if (r3 == 0) goto L_0x066d
            android.view.ViewGroup r3 = r3.f166287d
            if (r3 == 0) goto L_0x066d
            int r9 = r3.getId()
        L_0x066d:
            r7.addRule(r12, r9)
            android.content.Context r3 = r34.getContext()
            int r2 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r3, r2)
            r7.bottomMargin = r2
            d60.n r2 = r0.f157337p
            if (r2 == 0) goto L_0x06a7
            android.view.ViewGroup r2 = r2.f166287d
            if (r2 == 0) goto L_0x06a7
            r2.requestLayout()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x06a7
        L_0x0688:
            if (r1 == 0) goto L_0x0691
            boolean r2 = r1.getBoolean(r3)
            if (r2 != r8) goto L_0x0691
            goto L_0x0692
        L_0x0691:
            r8 = 0
        L_0x0692:
            if (r8 == 0) goto L_0x069e
            d60.n r2 = r0.f157337p
            if (r2 == 0) goto L_0x06a7
            r2.mo10792g(r6)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x06a7
        L_0x069e:
            d60.n r2 = r0.f157337p
            if (r2 == 0) goto L_0x06a7
            r2.mo10792g(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x06a7:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x06ab:
            int r2 = com.tencent.p014mm.live.model.RoomLiveService.f157176H
            int r2 = r2 + r8
            com.tencent.p014mm.live.model.RoomLiveService.f157176H = r2
        L_0x06b0:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x06b4:
            com.tencent.mm.live.view.RoomLiveMiniView r2 = r34.getMiniView()
            r2.mo76542e(r8)
            d50.h r2 = com.tencent.p014mm.live.model.RoomLiveService.f157201l
            if (r2 == 0) goto L_0x06c1
            d50.f r7 = r2.f166253d
        L_0x06c1:
            if (r7 != 0) goto L_0x06c4
            goto L_0x06c6
        L_0x06c4:
            r7.f166227b = r8
        L_0x06c6:
            boolean r2 = r0.f157324I
            if (r2 == 0) goto L_0x06d6
            android.content.Context r2 = r34.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.setRequestedOrientation(r6)
        L_0x06d6:
            int r2 = r0.f157321F
            if (r2 != r8) goto L_0x0710
            d60.v1 r2 = r0.f157330f
            if (r2 == 0) goto L_0x06ec
            p50.e r2 = r2.f166730h
            if (r2 == 0) goto L_0x06ea
            d60.w1 r3 = new d60.w1
            r3.<init>()
            r2.mo85676R(r3)
        L_0x06ea:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x06ec:
            d60.c1 r2 = r0.f157331g
            if (r2 == 0) goto L_0x06f5
            r2.mo10792g(r9)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x06f5:
            d60.c1 r2 = r0.f157331g
            if (r2 == 0) goto L_0x0710
            p50.e r2 = r2.f166519j
            if (r2 == 0) goto L_0x070e
            b50.g r2 = r2.f176822Y0
            r2.getClass()
            java.lang.String r3 = "resumePlay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            f50.d r2 = r2.f152627a
            if (r2 == 0) goto L_0x070e
            r2.resume()
        L_0x070e:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0710:
            d60.t0 r2 = r0.f157343v
            if (r2 == 0) goto L_0x0719
            java.util.ArrayList<d60.a> r3 = r0.f157322G
            r3.remove(r2)
        L_0x0719:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x071c:
            com.tencent.mm.live.view.RoomLiveMiniView r2 = r34.getMiniView()
            r2.mo76542e(r9)
            int r2 = r0.f157321F
            if (r2 != 0) goto L_0x0740
            p50.e r2 = p50.C62197e.f176819i1
            if (r2 != 0) goto L_0x0732
            p50.e r2 = new p50.e
            r2.<init>()
            p50.C62197e.f176819i1 = r2
        L_0x0732:
            p50.e r2 = p50.C62197e.f176819i1
            gy3.C87412m.m108591d(r2)
            r2.mo87276S0(r7)
            java.lang.String r2 = "requestLinkMic ret:0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            goto L_0x0754
        L_0x0740:
            if (r2 != r8) goto L_0x0754
            d50.h r2 = com.tencent.p014mm.live.model.RoomLiveService.f157201l
            if (r2 == 0) goto L_0x0754
            d60.v1 r3 = r0.f157330f
            if (r3 == 0) goto L_0x0754
            com.tencent.mm.live.view.LiveVisitorPluginLayout$k r5 = new com.tencent.mm.live.view.LiveVisitorPluginLayout$k
            r5.<init>(r0)
            r3.mo82963x0(r2, r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0754:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0759
        L_0x0757:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0759:
            super.statusChange(r35, r36)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveVisitorPluginLayout.statusChange(d60.b$b, android.os.Bundle):void");
    }

    public void stop() {
        super.stop();
        this.f157329N.stopTimer();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unMount() {
        /*
            r6 = this;
            super.unMount()
            com.tencent.mm.live.model.RoomLiveService r0 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            int r1 = com.tencent.p014mm.live.model.RoomLiveService.f157205p
            r2 = 1
            r3 = 0
            r4 = -1
            if (r1 == r4) goto L_0x002a
            android.content.Context r4 = r6.getContext()
            java.lang.String r5 = "window"
            java.lang.Object r4 = r4.getSystemService(r5)
            java.lang.String r5 = "null cannot be cast to non-null type android.view.WindowManager"
            gy3.C87412m.m108592e(r4, r5)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            android.view.Display r4 = r4.getDefaultDisplay()
            int r4 = r4.getRotation()
            if (r1 == r4) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            if (r1 != 0) goto L_0x00b7
            d60.c1 r1 = r6.f157331g
            if (r1 == 0) goto L_0x0034
            r1.mo82898x0(r3)
        L_0x0034:
            y50.k r1 = y50.C53496k.f150436a
            r1.mo74173f()
            y50.j0 r1 = y50.C66519j0.f191358d
            r1.mo90605i()
            r1.mo90606j()
            p50.e r4 = r6.f157323H
            if (r4 == 0) goto L_0x0048
            r4.mo85693l0()
        L_0x0048:
            p50.e r4 = r6.f157323H
            if (r4 == 0) goto L_0x0056
            d50.i r4 = r4.f172989A
            boolean r4 = r4.mo82882d()
            if (r4 != r2) goto L_0x0056
            r4 = 1
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r4 != 0) goto L_0x0089
            p50.e r4 = r6.f157323H
            if (r4 == 0) goto L_0x0067
            d50.i r4 = r4.f172989A
            boolean r4 = r4.mo82884f()
            if (r4 != r2) goto L_0x0067
            r4 = 1
            goto L_0x0068
        L_0x0067:
            r4 = 0
        L_0x0068:
            if (r4 == 0) goto L_0x006b
            goto L_0x0089
        L_0x006b:
            d60.z r4 = r6.f157334j
            if (r4 == 0) goto L_0x0076
            d60.j1 r4 = r4.f166760g
            boolean r4 = r4.f166622y
            if (r4 != r2) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            if (r2 == 0) goto L_0x00a5
            a60.a r2 = com.tencent.p014mm.live.model.RoomLiveService.f157185Q
            java.lang.String r2 = r2.f151235j
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r3 = r3.f133063t
            if (r3 != 0) goto L_0x0085
            java.lang.String r3 = ""
        L_0x0085:
            r1.mo90598b(r2, r3)
            goto L_0x00a5
        L_0x0089:
            a60.a r3 = com.tencent.p014mm.live.model.RoomLiveService.f157185Q
            a60.a$a r3 = r3.f151234i
            if (r3 == 0) goto L_0x0096
            java.lang.String r4 = r3.f151237b
            java.lang.String r3 = r3.f151240e
            r1.mo90598b(r4, r3)
        L_0x0096:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "PARAM_HANGUP_SELF"
            r1.putBoolean(r3, r2)
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STOP_MIC
            r6.statusChange(r2, r1)
        L_0x00a5:
            r0.mo76447e()
            p50.e r0 = p50.C62197e.f176819i1
            if (r0 == 0) goto L_0x00af
            r0.mo75581i0()
        L_0x00af:
            r0 = 0
            p50.C62197e.f176819i1 = r0
            eb0.e r0 = r6.f157325J
            r0.mo136889a()
        L_0x00b7:
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 3806(0xede, float:5.333E-42)
            r0.mo123470p(r1, r6)
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r6.f157329N
            r0.stopTimer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveVisitorPluginLayout.unMount():void");
    }
}
