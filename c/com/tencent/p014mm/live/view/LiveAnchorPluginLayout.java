package com.tencent.p014mm.live.view;

import a60.C53979a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b50.C54410e;
import c50.C54654a;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.xweb.FileReaderX5;
import com.tencent.xweb.file.XVFSFile;
import d50.C58113g;
import d50.C58115i;
import d60.C45272n;
import d60.C58121a;
import d60.C58124b;
import d60.C58130e0;
import d60.C58133f0;
import d60.C58140g0;
import d60.C58141h;
import d60.C58187m0;
import d60.C58192o0;
import d60.C58197p0;
import d60.C58213u;
import d60.C58215u0;
import d60.C58219v;
import d60.C58220v0;
import d60.C58224w0;
import d60.C58229y0;
import d60.C7174c;
import d60.C7182d1;
import d60.C7184e;
import d60.C7187e1;
import d60.C7197i;
import d60.C7204l;
import d60.C7219q0;
import d60.C7226t0;
import d60.C7230x;
import d60.C7232x0;
import d60.C7233y;
import di3.C86312j;
import e60.C58532b;
import eb0.C31543z5;
import eb0.C97621e;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h60.C59756g;
import h60.C59757h;
import h60.C59758i;
import h60.C59759j;
import h60.C59760k;
import h60.C59763o;
import i72.C98607d;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k50.C60971a;
import kotlin.Metadata;
import m50.C61438b;
import nj3.C76912y0;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import p50.C62197e;
import p625nu.C61901d;
import p625nu.C61903f;
import qo3.C47883u;
import qo3.C77426q;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C49317ep2;
import y50.C15936n0;
import y50.C53496k;
import y50.C66516i;
import y50.C66519j0;
import y50.C66524m;
import y80.C112405g;
import y80.C66557b;
import z04.C112550d0;
import z50.C16103b;
import z50.C16110p;
import z50.C16112u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/live/view/LiveAnchorPluginLayout;", "Lcom/tencent/mm/live/view/RoomBaseLivePluginLayout;", "Lob0/n;", "Lnu/d$a;", "Lb50/e;", "", "getRelativeLayoutId", "getLiveRole", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout */
public final class LiveAnchorPluginLayout extends RoomBaseLivePluginLayout implements C11385n, C61901d.C61902a, C54410e {

    /* renamed from: T */
    public static final /* synthetic */ int f157266T = 0;

    /* renamed from: A */
    public C7226t0 f157267A;

    /* renamed from: B */
    public C58187m0 f157268B;

    /* renamed from: C */
    public C58197p0 f157269C;

    /* renamed from: D */
    public C7184e f157270D;

    /* renamed from: E */
    public C7230x f157271E;

    /* renamed from: F */
    public C58124b.C58125b f157272F = C58124b.C58125b.BEFORE_LIVE;

    /* renamed from: G */
    public C61901d f157273G;

    /* renamed from: H */
    public int f157274H = 1;

    /* renamed from: I */
    public final ArrayList<C58121a> f157275I = new ArrayList<>();

    /* renamed from: J */
    public boolean f157276J = true;

    /* renamed from: K */
    public boolean f157277K;

    /* renamed from: L */
    public final C97621e f157278L = new C97621e();

    /* renamed from: M */
    public int f157279M = -1;

    /* renamed from: N */
    public boolean f157280N;

    /* renamed from: P */
    public C54654a f157281P;

    /* renamed from: Q */
    public C32224a<C13598b0> f157282Q = new C55237g(this);

    /* renamed from: R */
    public int f157283R;

    /* renamed from: S */
    public MTimerHandler f157284S = new MTimerHandler("LiveCommonInfoPlugin::Timer", (MTimerHandler.CallBack) new C55241k(this), true);

    /* renamed from: f */
    public final String f157285f = "MicroMsg.LiveAnchorPluginLayout";

    /* renamed from: g */
    public C7187e1 f157286g;

    /* renamed from: h */
    public C7233y f157287h;

    /* renamed from: i */
    public C7204l f157288i;

    /* renamed from: j */
    public C7174c f157289j;

    /* renamed from: n */
    public C58220v0 f157290n;

    /* renamed from: o */
    public C7232x0 f157291o;

    /* renamed from: p */
    public C45272n f157292p;

    /* renamed from: q */
    public C58224w0 f157293q;

    /* renamed from: r */
    public C7182d1 f157294r;

    /* renamed from: s */
    public C7219q0 f157295s;

    /* renamed from: t */
    public C58130e0 f157296t;

    /* renamed from: u */
    public C58141h f157297u;

    /* renamed from: v */
    public C7197i f157298v;

    /* renamed from: w */
    public C58213u f157299w;

    /* renamed from: x */
    public C58215u0 f157300x;

    /* renamed from: y */
    public C58229y0 f157301y;

    /* renamed from: z */
    public C58192o0 f157302z;

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$a */
    public static final class C55231a extends C87413o implements C32229r<Integer, String, C58113g, TRTCCloudDef.TRTCParams, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55231a(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            super(4);
            this.f157303d = liveAnchorPluginLayout;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            int intValue = ((Number) obj).intValue();
            String str = (String) obj2;
            C87412m.m108594g(str, "errMsg");
            C87412m.m108594g((C58113g) obj3, "liveRoomInfo");
            C87412m.m108594g((TRTCCloudDef.TRTCParams) obj4, "trtcParams");
            LiveAnchorPluginLayout.m62848l(this.f157303d, intValue, str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$b */
    public static final class C55232b implements C47883u {

        /* renamed from: a */
        public static final C55232b f157304a = new C55232b();

        /* renamed from: a */
        public final void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$c */
    public static final class C55233c implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157305d;

        public C55233c(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            this.f157305d = liveAnchorPluginLayout;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C58124b.C7172a.m7372a(this.f157305d, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$d */
    public static final class C55234d extends C87413o implements C32227p<Float, Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157306d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55234d(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            super(2);
            this.f157306d = liveAnchorPluginLayout;
        }

        public Object invoke(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            float floatValue2 = ((Number) obj2).floatValue();
            C54654a aVar = this.f157306d.f157281P;
            if (aVar != null) {
                aVar.mo75220r(floatValue, floatValue2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$e */
    public static final class C55235e extends C87413o implements C32227p<Float, Float, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55235e(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            super(2);
            this.f157307d = liveAnchorPluginLayout;
        }

        public Object invoke(Object obj, Object obj2) {
            float floatValue = ((Number) obj).floatValue();
            float floatValue2 = ((Number) obj2).floatValue();
            LiveAnchorPluginLayout liveAnchorPluginLayout = this.f157307d;
            String str = liveAnchorPluginLayout.f157285f;
            Log.m105924i(str, "toggleShowPlugins, pluginShow:" + liveAnchorPluginLayout.f157276J);
            RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
            if (!dVar.f157224a && !dVar.f157226c && dVar.f157225b) {
                C59763o oVar = new C59763o(liveAnchorPluginLayout);
                C7232x0 x0Var = liveAnchorPluginLayout.f157291o;
                Rect[] x0 = x0Var != null ? x0Var.mo8399x0() : null;
                int i = 0;
                if (x0 != null) {
                    int length = x0.length;
                    int i2 = 0;
                    while (i < length) {
                        if (x0[i].contains((int) floatValue, (int) floatValue2)) {
                            i2 = 1;
                        }
                        i++;
                    }
                    i = i2;
                }
                if (i == 0) {
                    oVar.invoke();
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$f */
    public static final class C55236f extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55236f(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            super(1);
            this.f157308d = liveAnchorPluginLayout;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            String str = this.f157308d.f157285f;
            Log.m105924i(str, "receive close sys msg:" + longValue);
            if (longValue == RoomLiveService.f157197h.f133050d) {
                C7174c cVar = this.f157308d.f157289j;
                boolean z = false;
                if (cVar != null && cVar.mo14483f0() == 0) {
                    z = true;
                }
                if (!z) {
                    C61926c.m72668M(new C55254a(this.f157308d));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$g */
    public static final class C55237g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55237g(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            super(0);
            this.f157309d = liveAnchorPluginLayout;
        }

        public Object invoke() {
            C61926c.m72668M(new C55255b(this.f157309d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$h */
    public static final class C55238h implements Runnable {

        /* renamed from: d */
        public static final C55238h f157310d = new C55238h();

        public final void run() {
            C66519j0 j0Var = C66519j0.f191358d;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            j0Var.mo90604h(RoomLiveService.f157192c);
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$i */
    public static final class C55239i implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157311d;

        public C55239i(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            this.f157311d = liveAnchorPluginLayout;
        }

        public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C54654a aVar;
            C58115i iVar;
            C58115i iVar2;
            boolean z = true;
            yVar.setHasCallbackToQueue(true);
            if (i == 0 && i2 == 0) {
                C49317ep2 j1 = ((C16103b) yVar).mo14699j1();
                if (j1 != null && j1.f133053g == 0) {
                    RoomLiveService roomLiveService = RoomLiveService.f157190a;
                    if (!RoomLiveService.f157209t.f157224a) {
                        C58220v0 v0Var = this.f157311d.f157290n;
                        if (v0Var != null) {
                            v0Var.mo82962x0();
                        }
                        LiveAnchorPluginLayout liveAnchorPluginLayout = this.f157311d;
                        C58220v0 v0Var2 = liveAnchorPluginLayout.f157290n;
                        C54654a aVar2 = liveAnchorPluginLayout.f157281P;
                        if ((aVar2 == null || (iVar2 = ((C60735a) aVar2).f172989A) == null || !iVar2.mo82886h()) ? false : true) {
                            C54654a aVar3 = this.f157311d.f157281P;
                            if (aVar3 == null || (iVar = ((C60735a) aVar3).f172989A) == null || !iVar.mo82883e(Long.valueOf(RoomLiveService.f157197h.f133050d))) {
                                z = false;
                            }
                            if (z && (aVar = this.f157311d.f157281P) != null) {
                                ((C54655b) aVar).mo75212E();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$j */
    public static final class C55240j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157312d;

        public C55240j(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            this.f157312d = liveAnchorPluginLayout;
        }

        public final void run() {
            C58192o0 o0Var = this.f157312d.f157302z;
            if (o0Var != null) {
                o0Var.f166287d.setVisibility(8);
            }
        }
    }

    /* renamed from: com.tencent.mm.live.view.LiveAnchorPluginLayout$k */
    public static final class C55241k implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ LiveAnchorPluginLayout f157313d;

        public C55241k(LiveAnchorPluginLayout liveAnchorPluginLayout) {
            this.f157313d = liveAnchorPluginLayout;
        }

        public final boolean onTimerExpired() {
            int i;
            C58213u uVar = this.f157313d.f157299w;
            if (uVar != null && uVar.mo14483f0() == 0) {
                C58213u uVar2 = this.f157313d.f157299w;
                if (uVar2 != null) {
                    int i2 = RoomLiveService.f157197h.f133052f;
                    if (C86709a0.m107523b().mo121114l()) {
                        uVar2.f166711u = C15936n0.C15937a.m14866a(C15936n0.f42815a, C31543z5.m39455e() - i2, XVFSFile.PATH_SEPARATOR, false, false, false, 28, (Object) null);
                    }
                }
                C58213u uVar3 = this.f157313d.f157299w;
                if (uVar3 != null) {
                    if (uVar3.f166712v) {
                        if (C54655b.f153178f1 == null) {
                            C54655b.f153178f1 = new C54655b();
                        }
                        C54655b bVar = C54655b.f153178f1;
                        C87412m.m108591d(bVar);
                        i = bVar.f172989A.f166265l;
                    } else {
                        if (C62197e.f176819i1 == null) {
                            C62197e.f176819i1 = new C62197e();
                        }
                        C62197e eVar = C62197e.f176819i1;
                        C87412m.m108591d(eVar);
                        i = eVar.f172989A.f166265l;
                    }
                    uVar3.f166710t = i;
                }
                C58213u uVar4 = this.f157313d.f157299w;
                if (uVar4 != null) {
                    C49317ep2 ep22 = RoomLiveService.f157197h;
                    uVar4.f166287d.post(new C58219v(uVar4, ep22.f133055i, ep22.f133057n));
                }
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveAnchorPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: l */
    public static final void m62848l(LiveAnchorPluginLayout liveAnchorPluginLayout, int i, String str) {
        String str2 = liveAnchorPluginLayout.f157285f;
        Log.m105924i(str2, "join live room errCode:" + i + " errMsg:" + str);
        switch (i) {
            case -100069:
                if (Util.isNullOrNil(str)) {
                    str = liveAnchorPluginLayout.getContext().getResources().getString(C0966R.string.g8y);
                }
                C77426q qVar = new C77426q(liveAnchorPluginLayout.getContext());
                qVar.mo107595g(str);
                qVar.mo107601m(C0966R.string.f8028zq);
                qVar.mo107600l(C59758i.f170651a);
                qVar.mo107593e(new C59759j(liveAnchorPluginLayout));
                qVar.mo107603o();
                return;
            case -100068:
            case -100045:
                Bundle bundle = new Bundle();
                String string = liveAnchorPluginLayout.getContext().getResources().getString(C0966R.string.g76);
                C87412m.m108593f(string, "context.resources.getStr…eption_desc_forbid_visit)");
                SpannableString spannableString = new SpannableString(string);
                int E = C112550d0.m153769E(spannableString, "《", 0, false, 6, (Object) null);
                if (E != -1) {
                    spannableString.setSpan(new ForegroundColorSpan(liveAnchorPluginLayout.getContext().getResources().getColor(C0966R.color.f2958ae)), E, spannableString.length(), 0);
                    spannableString.setSpan(new C59760k(liveAnchorPluginLayout), E, spannableString.length(), 0);
                }
                bundle.putString("PARAM_LIVE_EXCEPTION_TITLE", liveAnchorPluginLayout.getContext().getResources().getString(C0966R.string.g77));
                bundle.putCharSequence("PARAM_LIVE_EXCEPTION_DESC", spannableString);
                bundle.putInt("PARAM_LIVE_EXCEPTION_ICON_RES", C0966R.raw.icons_filled_live_err_red);
                liveAnchorPluginLayout.statusChange(C58124b.C58125b.LIVE_STATUS_EXCEPTION, bundle);
                return;
            case -100065:
                liveAnchorPluginLayout.mo76509m();
                return;
            case -100038:
                C58124b.C7172a.m7372a(liveAnchorPluginLayout, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
                return;
            case FileReaderX5.ERR_CODE_NOT_SUPPORT:
                C77426q qVar2 = new C77426q(liveAnchorPluginLayout.getContext());
                qVar2.mo107595g(liveAnchorPluginLayout.getContext().getResources().getString(C0966R.string.g7r));
                qVar2.mo107601m(C0966R.string.f8028zq);
                qVar2.mo107600l(C59756g.f170649a);
                qVar2.mo107593e(new C59757h(liveAnchorPluginLayout));
                qVar2.mo107603o();
                return;
            default:
                C58124b.C7172a.m7372a(liveAnchorPluginLayout, C58124b.C58125b.LIVE_STATUS_DISCONNECT, (Bundle) null, 2, (Object) null);
                return;
        }
    }

    public void callback(int i, Bundle bundle) {
        String str;
        String str2;
        C58115i iVar;
        C58115i iVar2;
        C58115i iVar3;
        C58115i iVar4;
        C58115i iVar5;
        int i2 = i;
        Bundle bundle2 = bundle;
        if (i2 == 0) {
            C58124b.C7172a.m7372a(this, C58124b.C58125b.RENDERING, (Bundle) null, 2, (Object) null);
            C58141h hVar = this.f157297u;
            if (hVar != null) {
                hVar.mo82908A0();
                return;
            }
            return;
        }
        int i3 = 1;
        int i4 = 0;
        if (i2 == 5) {
            C54654a aVar = this.f157281P;
            if (aVar == null || (iVar5 = ((C60735a) aVar).f172989A) == null || !iVar5.mo82884f()) {
                i3 = 0;
            }
            if (i3 != 0) {
                C54654a aVar2 = this.f157281P;
                if (!(aVar2 == null || (iVar4 = ((C60735a) aVar2).f172989A) == null)) {
                    iVar4.f166256c = C58115i.C58116a.AUDIO_LINK_MIC;
                }
                C58141h hVar2 = this.f157297u;
                if (hVar2 != null) {
                    hVar2.mo82910y0();
                }
            }
        } else if (i2 == 1) {
            if (bundle2 != null) {
                String string = bundle2.getString("live_user_id");
                bundle2.getString("live_user_exit_reason");
                String str3 = this.f157285f;
                StringBuilder sb = new StringBuilder();
                sb.append("EVT_ROOM_USER_EXIT sdkUid:");
                sb.append(string);
                sb.append(" micUid:");
                C53979a.C53980a aVar3 = RoomLiveService.f157185Q.f151234i;
                sb.append(aVar3 != null ? aVar3.f151240e : null);
                Log.m105924i(str3, sb.toString());
                C53979a.C53980a aVar4 = RoomLiveService.f157185Q.f151234i;
                if (C87412m.m108589b(string, aVar4 != null ? aVar4.f151240e : null)) {
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STOP_MIC, (Bundle) null, 2, (Object) null);
                    C53979a aVar5 = RoomLiveService.f157185Q;
                    C53979a.C53980a aVar6 = aVar5.f151234i;
                    if (aVar6 != null) {
                        aVar5.mo74654d(aVar6.f151236a, aVar6.f151238c, aVar6.f151237b);
                    }
                }
            }
        } else if (i2 == 2) {
            if (bundle2 != null) {
                String string2 = bundle2.getString("live_user_id");
                boolean z = bundle2.getBoolean("live_media_enable");
                C53979a.C53980a aVar7 = RoomLiveService.f157185Q.f151234i;
                if (!C87412m.m108589b(string2, aVar7 != null ? aVar7.f151240e : null)) {
                    return;
                }
                if (z) {
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_START_MIC_SDK, (Bundle) null, 2, (Object) null);
                    return;
                }
                C58141h hVar3 = this.f157297u;
                if (hVar3 != null) {
                    hVar3.f166562t.mo76459b((C32227p<? super Integer, ? super Integer, C13598b0>) null);
                }
            }
        } else if (i2 == 3) {
            int i5 = this.f157274H;
            C54654a aVar8 = this.f157281P;
            if (!(aVar8 == null || (iVar3 = ((C60735a) aVar8).f172989A) == null)) {
                i3 = iVar3.f166265l;
            }
            this.f157274H = i3;
            if (i5 != 3 && i3 == 3) {
                C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_DISCONNECT, (Bundle) null, 2, (Object) null);
            } else if (i5 == 3 && i3 != 3) {
                C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_CONNECT_SUCC, (Bundle) null, 2, (Object) null);
                C86709a0.m107529k().f251779b.mo123460f(new C16103b(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
            }
        } else {
            String str4 = "";
            if (i2 == 4) {
                C54654a aVar9 = this.f157281P;
                if ((aVar9 == null || (iVar2 = ((C60735a) aVar9).f172989A) == null || !iVar2.mo82882d()) ? false : true) {
                    i4 = 1;
                } else {
                    C54654a aVar10 = this.f157281P;
                    if (aVar10 == null || (iVar = ((C60735a) aVar10).f172989A) == null || !iVar.mo82884f()) {
                        i3 = 0;
                    }
                    if (i3 != 0) {
                        i4 = 2;
                    }
                }
                String str5 = RoomLiveService.f157192c;
                long j = RoomLiveService.f157197h.f133050d;
                C53979a.C53980a aVar11 = RoomLiveService.f157185Q.f151234i;
                if (aVar11 == null || (str2 = aVar11.f151237b) == null) {
                    str2 = str4;
                }
                C58532b.m67945a(str5, j, str2, RoomLiveService.f157199j, i4, 0, i);
            } else if (i2 == 6) {
                long j2 = RoomLiveService.f157197h.f133050d;
                String str6 = RoomLiveService.f157192c;
                String str7 = RoomLiveService.f157197h.f133051e;
                C87412m.m108593f(str7, "RoomLiveService.liveInfo.live_name");
                new C66516i(j2, str6, str7, false, 8, (C8480h) null).mo90593a(new C55231a(this));
            } else if (i2 == 7) {
                String str8 = this.f157285f;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("EVENT_RENDER_FIRST_I_FRAME, userId:");
                if (bundle2 == null || (str = bundle2.getString("live_user_id")) == null) {
                    str = str4;
                }
                sb4.append(str);
                Log.m105924i(str8, sb4.toString());
                if (!Util.isNullOrNil(bundle2 != null ? bundle2.getString("live_user_id") : null)) {
                    RoomLiveService.C55212c cVar = RoomLiveService.f157212w;
                    String string3 = bundle2 != null ? bundle2.getString("live_user_id") : null;
                    if (string3 != null) {
                        str4 = string3;
                    }
                    cVar.getClass();
                    cVar.f157220a = str4;
                    RoomLiveService.f157212w.f157221b = bundle2 != null ? bundle2.getInt("live_stream_type") : 0;
                    RoomLiveService.f157212w.f157222c = bundle2 != null ? bundle2.getInt("live_first_frame_width") : 0;
                    RoomLiveService.C55212c cVar2 = RoomLiveService.f157212w;
                    if (bundle2 != null) {
                        i4 = bundle2.getInt("live_first_frame_height");
                    }
                    cVar2.f157223d = i4;
                    C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_STATUS_FIRST_I_FRAME, (Bundle) null, 2, (Object) null);
                }
            }
        }
    }

    public int getLiveRole() {
        return 1;
    }

    public int getRelativeLayoutId() {
        return C0966R.C0971layout.b6e;
    }

    public void initLogic(LiveConfig liveConfig, boolean z) {
        LiveConfig liveConfig2 = liveConfig;
        C87412m.m108594g(liveConfig2, "config");
        this.f157280N = false;
        this.f157273G = ((C61903f) C86312j.m106911c(C61903f.class)).mo86831zZ(getContext(), 2);
        if (C54655b.f153178f1 == null) {
            C54655b.f153178f1 = new C54655b();
        }
        C54655b bVar = C54655b.f153178f1;
        C87412m.m108591d(bVar);
        this.f157281P = bVar;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        bVar.f173028o.mo88277g(new RoomLiveMiniView(context));
        C54654a aVar = this.f157281P;
        if (aVar != null) {
            ((C60735a) aVar).f173038x = this;
        }
        C66519j0.f191358d.mo90606j();
        long j = liveConfig2.f157064e;
        if (j != 0) {
            RoomLiveService.f157197h.f133050d = j;
        }
        if (!Util.isNullOrNil(liveConfig2.f157065f)) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            String str = liveConfig2.f157065f;
            C87412m.m108593f(str, "config.hostRoomId");
            RoomLiveService.f157192c = str;
        }
        RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
        String str2 = liveConfig2.f157069j;
        C87412m.m108593f(str2, "config.anchorUsername");
        RoomLiveService.f157199j = str2;
        View findViewById = findViewById(C0966R.C0970id.f358597g04);
        C87412m.m108593f(findViewById, "findViewById(R.id.live_verify_ui_root)");
        this.f157286g = new C7187e1((RelativeLayout) findViewById, this);
        View findViewById2 = findViewById(C0966R.C0970id.ftu);
        C87412m.m108593f(findViewById2, "findViewById(R.id.live_face_verify_ui_root)");
        this.f157287h = new C7233y((RelativeLayout) findViewById2, this);
        View findViewById3 = findViewById(C0966R.C0970id.fs7);
        C87412m.m108593f(findViewById3, "findViewById(R.id.live_before_ui_root)");
        this.f157288i = new C7204l((RelativeLayout) findViewById3, this);
        View findViewById4 = findViewById(C0966R.C0970id.fra);
        C87412m.m108593f(findViewById4, "findViewById(R.id.live_after_ui_root)");
        this.f157289j = new C7174c((RelativeLayout) findViewById4, this);
        View findViewById5 = findViewById(C0966R.C0970id.fwz);
        C87412m.m108593f(findViewById5, "findViewById(R.id.live_preview_ui_root)");
        this.f157290n = new C58220v0((ViewGroup) findViewById5, this);
        View findViewById6 = findViewById(C0966R.C0970id.fyi);
        C87412m.m108593f(findViewById6, "findViewById(R.id.live_shadow_ui_root)");
        this.f157291o = new C7232x0((ViewGroup) findViewById6, this);
        View findViewById7 = findViewById(C0966R.C0970id.fsz);
        C87412m.m108593f(findViewById7, "findViewById(R.id.live_comment_ui_root)");
        this.f157292p = new C45272n((ViewGroup) findViewById7, this);
        View findViewById8 = findViewById(C0966R.C0970id.fx5);
        C87412m.m108593f(findViewById8, "findViewById(R.id.live_ready_ui_root)");
        this.f157293q = new C58224w0((ViewGroup) findViewById8, this);
        View findViewById9 = findViewById(C0966R.C0970id.fzn);
        C87412m.m108593f(findViewById9, "findViewById(R.id.live_title_ui_root)");
        this.f157294r = new C7182d1((ViewGroup) findViewById9, this);
        View findViewById10 = findViewById(C0966R.C0970id.fyd);
        C87412m.m108593f(findViewById10, "findViewById(R.id.live_right_panel_ui_root)");
        this.f157296t = new C58130e0((ViewGroup) findViewById10, this);
        View findViewById11 = findViewById(C0966R.C0970id.fy6);
        C87412m.m108593f(findViewById11, "findViewById(R.id.live_right_panel_btn4_parent)");
        this.f157297u = new C58141h((ViewGroup) findViewById11, this);
        View findViewById12 = findViewById(C0966R.C0970id.fvw);
        C87412m.m108593f(findViewById12, "findViewById(R.id.live_members_list_ui_root)");
        this.f157295s = new C7219q0((ViewGroup) findViewById12, this);
        View findViewById13 = findViewById(C0966R.C0970id.frv);
        C87412m.m108593f(findViewById13, "findViewById(R.id.live_ban_comment_ui_root)");
        this.f157298v = new C7197i((ViewGroup) findViewById13, this);
        View findViewById14 = findViewById(C0966R.C0970id.ftd);
        C87412m.m108593f(findViewById14, "findViewById(R.id.live_common_info_ui_root)");
        this.f157299w = new C58213u((ViewGroup) findViewById14, this);
        View findViewById15 = findViewById(C0966R.C0970id.fwv);
        C87412m.m108593f(findViewById15, "findViewById(R.id.live_minimize_ui_root)");
        this.f157300x = new C58215u0((ViewGroup) findViewById15, this);
        View findViewById16 = findViewById(C0966R.C0970id.fyy);
        C87412m.m108593f(findViewById16, "findViewById(R.id.live_share_rooms_ui_root)");
        this.f157301y = new C58229y0((ViewGroup) findViewById16, this);
        View findViewById17 = findViewById(C0966R.C0970id.fv9);
        C87412m.m108593f(findViewById17, "findViewById(R.id.live_loading_view_root)");
        this.f157302z = new C58192o0((ViewGroup) findViewById17, this);
        View findViewById18 = findViewById(C0966R.C0970id.fwn);
        C87412m.m108593f(findViewById18, "findViewById(R.id.live_mic_visitor_header_root)");
        this.f157267A = new C7226t0((ViewGroup) findViewById18, this);
        View findViewById19 = findViewById(C0966R.C0970id.fuw);
        C87412m.m108593f(findViewById19, "findViewById(R.id.live_like_confetti_ui_root)");
        this.f157268B = new C58187m0((ViewGroup) findViewById19, this);
        View findViewById20 = findViewById(C0966R.C0970id.fw_);
        C87412m.m108593f(findViewById20, "findViewById(R.id.live_members_profile_ui_root)");
        this.f157269C = new C58197p0((ViewGroup) findViewById20, this);
        View findViewById21 = findViewById(C0966R.C0970id.frf);
        C87412m.m108593f(findViewById21, "findViewById(R.id.live_anchor_close_ui_root)");
        this.f157270D = new C7184e((ViewGroup) findViewById21, this);
        View findViewById22 = findViewById(C0966R.C0970id.ftq);
        C87412m.m108593f(findViewById22, "findViewById(R.id.live_exception_ui_root)");
        this.f157271E = new C7230x((ViewGroup) findViewById22, this);
        if (this.f157290n != null) {
            new C55234d(this);
        }
        boolean z2 = true;
        C66519j0.f191359e = liveConfig2.f157063d == 0;
        C58130e0 e0Var = this.f157296t;
        if (e0Var != null) {
            e0Var.f166524g.setVisibility(0);
            e0Var.f166526i.setVisibility(0);
            ImageView imageView = e0Var.f166524g;
            Drawable drawable = e0Var.f166287d.getResources().getDrawable(C0966R.raw.icons_filled_share);
            C74933u4.m89769f(drawable, -1);
            imageView.setImageDrawable(drawable);
            ImageView imageView2 = e0Var.f166526i;
            Drawable drawable2 = e0Var.f166287d.getResources().getDrawable(C0966R.raw.icons_filled_camera_switch);
            C74933u4.m89769f(drawable2, -1);
            imageView2.setImageDrawable(drawable2);
            e0Var.f166525h.setOnClickListener(new C58133f0(e0Var));
            e0Var.f166527j.setOnClickListener(new C58140g0(e0Var));
            e0Var.f166525h.setVisibility(8);
            e0Var.f166528n.setVisibility(8);
            View view = e0Var.f166529o;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/live/plugin/LiveHostRightPanelPlugin", "setupForHost", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/live/plugin/LiveHostRightPanelPlugin", "setupForHost", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C7219q0 q0Var = this.f157295s;
        if (q0Var != null) {
            q0Var.mo8394x0(liveConfig2);
        }
        C58187m0 m0Var = this.f157268B;
        if (m0Var != null) {
            m0Var.mo82949x0(liveConfig2);
        }
        C7174c cVar = this.f157289j;
        if (cVar != null) {
            cVar.f25155r.setVisibility(8);
            cVar.f25154q.setVisibility(0);
        }
        C58197p0 p0Var = this.f157269C;
        if (p0Var != null) {
            p0Var.f166680x = liveConfig2.f157063d == 0;
        }
        C58213u uVar = this.f157299w;
        if (uVar != null) {
            uVar.mo82958y0(liveConfig2);
        }
        C7184e eVar = this.f157270D;
        if (eVar != null) {
            eVar.mo10792g(8);
        }
        C7187e1 e1Var = this.f157286g;
        if (e1Var != null) {
            e1Var.mo10792g(8);
        }
        C7233y yVar = this.f157287h;
        if (yVar != null) {
            yVar.mo10792g(8);
        }
        C7204l lVar = this.f157288i;
        if (lVar != null) {
            lVar.mo10792g(0);
        }
        C58220v0 v0Var = this.f157290n;
        if (v0Var != null) {
            v0Var.mo10792g(0);
        }
        C7232x0 x0Var = this.f157291o;
        if (x0Var != null) {
            x0Var.mo10792g(8);
        }
        C7174c cVar2 = this.f157289j;
        if (cVar2 != null) {
            cVar2.mo10792g(4);
        }
        C45272n nVar = this.f157292p;
        if (nVar != null) {
            nVar.mo10792g(8);
        }
        C58224w0 w0Var = this.f157293q;
        if (w0Var != null) {
            w0Var.mo10792g(8);
        }
        C7182d1 d1Var = this.f157294r;
        if (d1Var != null) {
            d1Var.mo10792g(8);
        }
        C7219q0 q0Var2 = this.f157295s;
        if (q0Var2 != null) {
            q0Var2.mo10792g(8);
        }
        C58130e0 e0Var2 = this.f157296t;
        if (e0Var2 != null) {
            e0Var2.mo10792g(8);
        }
        C7197i iVar = this.f157298v;
        if (iVar != null) {
            iVar.mo10792g(8);
        }
        C58213u uVar2 = this.f157299w;
        if (uVar2 != null) {
            uVar2.mo10792g(8);
        }
        C58215u0 u0Var = this.f157300x;
        if (u0Var != null) {
            u0Var.mo10792g(8);
        }
        C58229y0 y0Var = this.f157301y;
        if (y0Var != null) {
            y0Var.mo10792g(8);
        }
        C58192o0 o0Var = this.f157302z;
        if (o0Var != null) {
            o0Var.mo82950x0(RoomLiveService.f157199j);
        }
        C58197p0 p0Var2 = this.f157269C;
        if (p0Var2 != null) {
            p0Var2.mo10792g(8);
        }
        C7230x xVar = this.f157271E;
        if (xVar != null) {
            xVar.mo10792g(8);
        }
        C58220v0 v0Var2 = this.f157290n;
        if (v0Var2 != null) {
            v0Var2.f166727i.setPreviewTouchListener(new C55235e(this));
        }
        Long l = null;
        if (z) {
            C49317ep2 ep22 = RoomLiveService.f157197h;
            ep22.f133051e = liveConfig2.f157066g;
            ep22.f133050d = liveConfig2.f157064e;
            String str3 = liveConfig2.f157065f;
            C87412m.m108593f(str3, "config.hostRoomId");
            RoomLiveService.f157192c = str3;
            C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
            C61901d dVar = this.f157273G;
            if (dVar != null) {
                ((C98607d) dVar).f289116g = null;
            }
            if (dVar != null) {
                dVar.disable();
            }
            this.f157273G = null;
        } else {
            C49317ep2 ep23 = RoomLiveService.f157197h;
            if ((ep23 != null && ep23.f133050d == 0) || Util.isNullOrNil(RoomLiveService.f157192c)) {
                Log.m105924i(this.f157285f, "init logic from directly start");
                RoomLiveService.f157197h.f133050d = 0;
                this.f157272F = C58124b.C58125b.BEFORE_LIVE;
            } else {
                String str4 = this.f157285f;
                StringBuilder sb = new StringBuilder();
                sb.append("init anchor plugin with live data, liveId:");
                C49317ep2 ep24 = RoomLiveService.f157197h;
                if (ep24 != null) {
                    l = Long.valueOf(ep24.f133050d);
                }
                sb.append(l);
                sb.append(", liveName:");
                sb.append(liveConfig2.f157066g);
                sb.append(", roomId:");
                sb.append(liveConfig2.f157065f);
                Log.m105924i(str4, sb.toString());
                C7182d1 d1Var2 = this.f157294r;
                if (d1Var2 != null) {
                    String str5 = RoomLiveService.f157197h.f133051e;
                    if (str5 == null) {
                        str5 = "";
                    }
                    d1Var2.mo8366x0(str5, RoomLiveService.f157199j);
                }
                this.f157272F = C58124b.C58125b.LIVE_STATUS_CREATE_LIVE;
            }
            if (this.f157286g == null || !MultiProcessMMKV.getSingleMMKV("tag_live_core").getBoolean("anchor_verify", false)) {
                z2 = false;
            }
            if (z2) {
                statusChange(this.f157272F, new Bundle());
            } else {
                C7187e1 e1Var2 = this.f157286g;
                if (e1Var2 != null) {
                    e1Var2.mo10792g(0);
                }
                C7233y yVar2 = this.f157287h;
                if (yVar2 != null) {
                    yVar2.mo10792g(8);
                }
                C7174c cVar3 = this.f157289j;
                if (cVar3 != null) {
                    cVar3.mo10792g(4);
                }
                C45272n nVar2 = this.f157292p;
                if (nVar2 != null) {
                    nVar2.mo10792g(8);
                }
                C58130e0 e0Var3 = this.f157296t;
                if (e0Var3 != null) {
                    e0Var3.mo10792g(8);
                }
                C7182d1 d1Var3 = this.f157294r;
                if (d1Var3 != null) {
                    d1Var3.mo10792g(8);
                }
                C7232x0 x0Var2 = this.f157291o;
                if (x0Var2 != null) {
                    x0Var2.mo10792g(8);
                }
                C7197i iVar2 = this.f157298v;
                if (iVar2 != null) {
                    iVar2.mo10792g(8);
                }
                C58192o0 o0Var2 = this.f157302z;
                if (o0Var2 != null) {
                    o0Var2.mo10792g(8);
                }
                statusChange(C58124b.C58125b.START_LIVE_VERIFY, new Bundle());
            }
        }
        C53496k.f150436a.mo74171d(name(), this.f157282Q);
        RoomLiveService.f157185Q.f151228c = new C55236f(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = ((j50.C60735a) r0).f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isLiving() {
        /*
            r3 = this;
            c50.a r0 = r3.f157281P
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0013
            j50.a r0 = (j50.C60735a) r0
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.mo82885g()
            if (r0 != r1) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveAnchorPluginLayout.isLiving():boolean");
    }

    /* renamed from: m */
    public final void mo76509m() {
        C77426q qVar = new C77426q(getContext());
        qVar.mo107606r(getContext().getResources().getString(C0966R.string.g6w));
        qVar.mo107601m(C0966R.string.f8028zq);
        qVar.mo107600l(C55232b.f157304a);
        qVar.mo107593e(new C55233c(this));
        qVar.mo107603o();
    }

    public void mount() {
        super.mount();
        C86709a0.m107529k().f251779b.mo123455a(3806, this);
        C86709a0.m107529k().f251779b.mo123455a(3559, this);
        C86709a0.m107529k().f251779b.mo123455a(3557, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo76510n() {
        /*
            r4 = this;
            com.tencent.mm.live.model.RoomLiveService r0 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r0 = r0.f157225b
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L_0x001c
            b60.c r0 = b60.C54428c.f152656a
            te3.no2 r0 = r0.mo75240a()
            int r0 = r0.f184524f
            if (r0 == r3) goto L_0x0027
            int r3 = r4.getCurrentOrientation()
            if (r0 == r3) goto L_0x0027
            goto L_0x0028
        L_0x001c:
            int r0 = com.tencent.p014mm.live.model.RoomLiveService.f157205p
            if (r0 == r3) goto L_0x0027
            int r3 = r4.getCurrentOrientation()
            if (r0 == r3) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveAnchorPluginLayout.mo76510n():boolean");
    }

    public boolean onBackPress() {
        boolean onBackPress = super.onBackPress();
        if (onBackPress) {
            return onBackPress;
        }
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
        if (dVar.f157226c || !dVar.f157225b) {
            return onBackPress;
        }
        C58124b.C7172a.m7372a(this, C58124b.C58125b.CLOSE_LIVE, (Bundle) null, 2, (Object) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r1 = ((j50.C60735a) r1).f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallStateChanged(int r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r0 = "incomingNumber"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r8 = r6.f157285f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCallStateChanged state:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", isFloatMode:"
            r0.append(r1)
            c50.a r1 = r6.f157281P
            r2 = 0
            if (r1 == 0) goto L_0x002d
            j50.a r1 = (j50.C60735a) r1
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x002d
            boolean r1 = r1.mo82881c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            r8 = 1
            r0 = 0
            if (r7 == 0) goto L_0x00af
            r1 = 2
            if (r7 == r1) goto L_0x0041
            goto L_0x00fb
        L_0x0041:
            te3.oo2 r7 = new te3.oo2
            r7.<init>()
            long r3 = (long) r1
            r7.f139284e = r3
            long r3 = eb0.C31543z5.m39453c()
            r7.f139283d = r3
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            z50.g r3 = new z50.g
            te3.ep2 r4 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r4 = r4.f133050d
            r3.<init>(r4, r7)
            r1.mo123460f(r3)
            c50.a r7 = r6.f157281P
            if (r7 == 0) goto L_0x0073
            j50.a r7 = (j50.C60735a) r7
            d50.i r7 = r7.f172989A
            if (r7 == 0) goto L_0x0073
            boolean r7 = r7.mo82881c()
            if (r7 != r8) goto L_0x0073
            r7 = 1
            goto L_0x0074
        L_0x0073:
            r7 = 0
        L_0x0074:
            if (r7 == 0) goto L_0x0088
            com.tencent.mm.live.model.RoomLiveService r7 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.p014mm.live.model.RoomLiveService.f157204o = r8
            c50.a r8 = r6.f157281P
            if (r8 == 0) goto L_0x0083
            j50.a r8 = (j50.C60735a) r8
            r8.mo85702u0()
        L_0x0083:
            r7.mo76444b()
            goto L_0x00fb
        L_0x0088:
            c50.a r7 = r6.f157281P
            if (r7 == 0) goto L_0x0091
            j50.a r7 = (j50.C60735a) r7
            r7.mo85702u0()
        L_0x0091:
            c50.a r7 = r6.f157281P
            if (r7 == 0) goto L_0x00fb
            c50.b r7 = (c50.C54655b) r7
            s50.k r8 = r7.f173031q
            r8.mo162267b(r2)
            com.tencent.trtc.TRTCCloud r8 = r7.mo85679W()
            r8.enableCustomVideoCapture(r0)
            k50.c r8 = r7.f173025i
            if (r8 == 0) goto L_0x00ac
            com.tencent.trtc.TRTCCloud r8 = r8.f173671a
            r8.stopLocalAudio()
        L_0x00ac:
            r7.f172990B = r0
            goto L_0x00fb
        L_0x00af:
            te3.oo2 r7 = new te3.oo2
            r7.<init>()
            long r1 = (long) r0
            r7.f139284e = r1
            long r1 = eb0.C31543z5.m39453c()
            r7.f139283d = r1
            f40.g r1 = f40.C86709a0.m107529k()
            ob0.b0 r1 = r1.f251779b
            z50.g r2 = new z50.g
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r3 = r3.f133050d
            r2.<init>(r3, r7)
            r1.mo123460f(r2)
            c50.a r7 = r6.f157281P
            if (r7 == 0) goto L_0x00e8
            j50.a r7 = (j50.C60735a) r7
            d50.i r7 = r7.f172989A
            if (r7 == 0) goto L_0x00e8
            te3.ep2 r1 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r1 = r1.f133050d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r7 = r7.mo82883e(r1)
            if (r7 != r8) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r8 = 0
        L_0x00e9:
            if (r8 == 0) goto L_0x00fb
            d60.v0 r7 = r6.f157290n
            if (r7 == 0) goto L_0x00f2
            r7.mo82962x0()
        L_0x00f2:
            c50.a r7 = r6.f157281P
            if (r7 == 0) goto L_0x00fb
            c50.b r7 = (c50.C54655b) r7
            r7.mo75212E()
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveAnchorPluginLayout.onCallStateChanged(int, java.lang.String):void");
    }

    public void onOrientationChange(int i) {
        C60735a aVar;
        C112405g gVar;
        C66557b m;
        int i2 = this.f157279M;
        if (i2 == -1 || i2 != i) {
            String str = this.f157285f;
            Log.m105924i(str, "onOrientationChange orientation:" + i);
            this.f157279M = i;
            Log.m105924i(this.f157285f, "refreshCamera");
            C54654a aVar2 = this.f157281P;
            if (aVar2 != null && (gVar = aVar.f173034t) != null && (m = gVar.mo143174m()) != null) {
                C61438b b = C60971a.C60973b.f173670a.mo85945b();
                C112405g gVar2 = (aVar = (C60735a) aVar2).f173034t;
                b.f174704a = gVar2 != null ? gVar2.mo143180s() : 0;
                aVar.f173031q.mo148310m(m);
            }
        }
    }

    public void onRotationSwitchChange(boolean z) {
        this.f157277K = z;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f157285f;
        Log.m105924i(str2, "errType:" + i + " errCode:" + i2);
        int i3 = 0;
        if (yVar instanceof C16103b) {
            if (i == 0 && i2 == 0) {
                RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
                if (!dVar.f157224a && !dVar.f157226c) {
                    C7197i iVar = this.f157298v;
                    if (iVar != null) {
                        iVar.f25206p = RoomLiveService.f157197h.f133060q;
                    }
                    if (iVar != null) {
                        iVar.mo8375x0();
                    }
                    if (!RoomLiveService.f157197h.f133060q) {
                        i3 = C31543z5.m39455e();
                    }
                    RoomLiveService.f157200k = i3;
                    if (RoomLiveService.f157197h.f133053g > 0) {
                        C58124b.C7172a.m7372a(this, C58124b.C58125b.LIVE_HAS_FINISHED, (Bundle) null, 2, (Object) null);
                    }
                }
            }
        } else if (yVar instanceof C16110p) {
            C7219q0 q0Var = this.f157295s;
            if (q0Var != null) {
                if (i == 0 && i2 == 0) {
                    i3 = 1;
                }
                C89779i0 i0Var = q0Var.f25268w;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                if (i3 != 0) {
                    C76912y0.m92768g(q0Var.f166287d.getContext(), q0Var.f166287d.getContext().getResources().getString(C0966R.string.g87));
                } else {
                    C76912y0.m92767f(q0Var.f166287d.getContext(), q0Var.f166287d.getContext().getResources().getString(C0966R.string.g86));
                }
            }
        } else if (!(yVar instanceof C16112u)) {
        } else {
            if (i != 0 || i2 != 0) {
                int i4 = this.f157283R;
                String str3 = C66524m.f191363a;
                if (i4 < C66524m.f191365c) {
                    this.f157283R = i4 + 1;
                    String str4 = this.f157285f;
                    Log.m105924i(str4, "will retry share live, delay:" + (((long) this.f157283R) * 1000));
                    postDelayed(C55238h.f157310d, ((long) this.f157283R) * 1000);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pause() {
        /*
            r4 = this;
            super.pause()
            boolean r0 = r4.mo76510n()
            java.lang.String r1 = r4.f157285f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "pause orientationChanged:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ", currentOrientation:"
            r2.append(r3)
            int r3 = r4.getCurrentOrientation()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r1 = 0
            if (r0 != 0) goto L_0x006b
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r2 = r0.f157226c
            if (r2 != 0) goto L_0x006b
            boolean r2 = r0.f157224a
            if (r2 != 0) goto L_0x006b
            boolean r2 = r0.f157227d
            if (r2 != 0) goto L_0x006b
            boolean r0 = r0.f157225b
            if (r0 == 0) goto L_0x006b
            boolean r0 = com.tencent.p014mm.live.model.RoomLiveService.f157204o
            if (r0 != 0) goto L_0x006b
            boolean r0 = r4.f157280N
            if (r0 != 0) goto L_0x006b
            java.lang.Class<aw.d> r0 = p447aw.C103918d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            aw.d r0 = (p447aw.C103918d) r0
            android.content.Context r2 = r4.getContext()
            r3 = 21
            boolean r0 = r0.mo125776TW(r2, r3)
            if (r0 == 0) goto L_0x006b
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2 = 3
            java.lang.String r3 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            r0.putInt(r3, r2)
            d60.b$b r2 = d60.C58124b.C58125b.MINI_WINDOW
            r4.statusChange(r2, r0)
            goto L_0x00ab
        L_0x006b:
            c50.a r0 = r4.f157281P
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x007e
            j50.a r0 = (j50.C60735a) r0
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.mo82886h()
            if (r0 != r2) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r2 = 0
        L_0x007f:
            if (r2 == 0) goto L_0x00ab
            boolean r0 = r4.f157280N
            if (r0 != 0) goto L_0x00ab
            c50.a r0 = r4.f157281P
            if (r0 == 0) goto L_0x008e
            j50.a r0 = (j50.C60735a) r0
            r0.mo85702u0()
        L_0x008e:
            c50.a r0 = r4.f157281P
            if (r0 == 0) goto L_0x00ab
            c50.b r0 = (c50.C54655b) r0
            s50.k r2 = r0.f173031q
            r2.mo162267b(r1)
            com.tencent.trtc.TRTCCloud r2 = r0.mo85679W()
            r2.enableCustomVideoCapture(r3)
            k50.c r2 = r0.f173025i
            if (r2 == 0) goto L_0x00a9
            com.tencent.trtc.TRTCCloud r2 = r2.f173671a
            r2.stopLocalAudio()
        L_0x00a9:
            r0.f172990B = r3
        L_0x00ab:
            nu.d r0 = r4.f157273G
            if (r0 == 0) goto L_0x00b2
            r0.disable()
        L_0x00b2:
            nu.d r0 = r4.f157273G
            if (r0 == 0) goto L_0x00ba
            i72.d r0 = (i72.C98607d) r0
            r0.f289116g = r1
        L_0x00ba:
            r4.f157273G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveAnchorPluginLayout.pause():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0062, code lost:
        r2 = ((j50.C60735a) r2).f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resume() {
        /*
            r7 = this;
            super.resume()
            java.lang.String r0 = r7.f157285f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "resume curRotation:"
            r1.append(r2)
            int r2 = r7.getCurrentOrientation()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            com.tencent.mm.live.model.RoomLiveService r0 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r0 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r1 = 0
            r0.f157227d = r1
            te3.ep2 r0 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r2 = r0.f133050d
            r4 = 0
            r0 = 1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0057
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r2 = r2.f157224a
            if (r2 != 0) goto L_0x0057
            ob0.b0 r2 = f40.C86709a0.m107524d()
            com.tencent.mm.network.g r2 = r2.f256809d
            if (r2 == 0) goto L_0x0099
            z50.b r2 = new z50.b
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r3 = r3.f133050d
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r2.<init>(r3, r5, r0)
            ob0.b0 r3 = f40.C86709a0.m107524d()
            com.tencent.mm.network.g r3 = r3.f256809d
            com.tencent.mm.live.view.LiveAnchorPluginLayout$i r4 = new com.tencent.mm.live.view.LiveAnchorPluginLayout$i
            r4.<init>(r7)
            r2.doScene(r3, r4)
            goto L_0x0099
        L_0x0057:
            d60.v0 r2 = r7.f157290n
            if (r2 == 0) goto L_0x005e
            r2.mo82962x0()
        L_0x005e:
            c50.a r2 = r7.f157281P
            if (r2 == 0) goto L_0x0070
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0070
            boolean r2 = r2.mo82886h()
            if (r2 != r0) goto L_0x0070
            r2 = 1
            goto L_0x0071
        L_0x0070:
            r2 = 0
        L_0x0071:
            if (r2 == 0) goto L_0x0099
            c50.a r2 = r7.f157281P
            if (r2 == 0) goto L_0x008d
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x008d
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r3 = r3.f133050d
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r2 = r2.mo82883e(r3)
            if (r2 != r0) goto L_0x008d
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            if (r2 == 0) goto L_0x0099
            c50.a r2 = r7.f157281P
            if (r2 == 0) goto L_0x0099
            c50.b r2 = (c50.C54655b) r2
            r2.mo75212E()
        L_0x0099:
            c50.a r2 = r7.f157281P
            if (r2 == 0) goto L_0x00a9
            r3 = r2
            j50.a r3 = (j50.C60735a) r3
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x00a9
            boolean r3 = r3.f166254a
            if (r3 != 0) goto L_0x00a9
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            if (r0 == 0) goto L_0x00b4
            if (r2 == 0) goto L_0x00be
            c50.b r2 = (c50.C54655b) r2
            r2.mo75580f0()
            goto L_0x00be
        L_0x00b4:
            if (r2 == 0) goto L_0x00be
            j50.a r2 = (j50.C60735a) r2
            d50.i r0 = r2.f172989A
            if (r0 == 0) goto L_0x00be
            r0.f166254a = r1
        L_0x00be:
            int r0 = r7.getCurrentOrientation()
            com.tencent.p014mm.live.model.RoomLiveService.f157205p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveAnchorPluginLayout.resume():void");
    }

    public void start() {
        super.start();
        C86709a0.m107529k().f251779b.mo123460f(new C16103b(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
        if (RoomLiveService.f157197h.f133050d == 0 && this.f157277K) {
            RoomLiveService.C55213d dVar = RoomLiveService.f157209t;
            if (!dVar.f157224a && !dVar.f157227d && !dVar.f157226c) {
                Context context = getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).setRequestedOrientation(4);
            }
        }
        this.f157284S.stopTimer();
        this.f157284S.startTimer(1000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028c, code lost:
        if (r2 != 3) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        r2 = ((j50.C60735a) r2).f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void statusChange(d60.C58124b.C58125b r31, android.os.Bundle r32) {
        /*
            r30 = this;
            r0 = r30
            r1 = r32
            java.lang.String r2 = "status"
            r3 = r31
            gy3.C87412m.m108594g(r3, r2)
            java.lang.String r2 = r0.f157285f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "statusChange:"
            r4.append(r5)
            java.lang.String r5 = r31.name()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            int r2 = r31.ordinal()
            java.lang.String r4 = ""
            r5 = 4
            r6 = 5
            r8 = 0
            r9 = 2
            java.lang.String r10 = "null cannot be cast to non-null type android.app.Activity"
            if (r2 == r9) goto L_0x07b4
            r11 = 9
            if (r2 == r11) goto L_0x07a1
            r11 = 13
            if (r2 == r11) goto L_0x078f
            r11 = 16
            if (r2 == r11) goto L_0x0772
            r11 = 30
            if (r2 == r11) goto L_0x0744
            r11 = 62
            if (r2 == r11) goto L_0x070e
            if (r2 == r6) goto L_0x06ce
            r11 = 6
            java.lang.String r13 = "RoomLiveService.liveInfo.live_name"
            if (r2 == r11) goto L_0x06b9
            r11 = 7
            java.lang.String r14 = ", liveName:"
            java.lang.String r15 = ", roomId:"
            r18 = r13
            if (r2 == r11) goto L_0x05a2
            r11 = 26
            if (r2 == r11) goto L_0x0591
            r11 = 27
            java.lang.String r12 = "MicroMsg.LiveCoreAnchor"
            if (r2 == r11) goto L_0x052e
            r11 = 40
            if (r2 == r11) goto L_0x050a
            r11 = 41
            if (r2 == r11) goto L_0x0501
            r11 = 51
            java.lang.String r13 = "context.resources.getStr…_local_network_error_tip)"
            if (r2 == r11) goto L_0x04a6
            r11 = 52
            if (r2 == r11) goto L_0x048f
            java.lang.String r11 = "markAnchorMaximumView"
            java.lang.String r6 = "context"
            java.lang.String r7 = "MicroMsg.LiveAnchorIDKeyStat"
            switch(r2) {
                case 21: goto L_0x00cc;
                case 22: goto L_0x009f;
                case 23: goto L_0x0086;
                case 24: goto L_0x0591;
                default: goto L_0x007e;
            }
        L_0x007e:
            switch(r2) {
                case 54: goto L_0x01ae;
                case 55: goto L_0x014b;
                case 56: goto L_0x0137;
                default: goto L_0x0081;
            }
        L_0x0081:
            switch(r2) {
                case 58: goto L_0x0432;
                case 59: goto L_0x03ef;
                case 60: goto L_0x0234;
                default: goto L_0x0084;
            }
        L_0x0084:
            goto L_0x06ca
        L_0x0086:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x087b
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x087b
            d50.i$d r4 = d50.C58115i.C58119d.PERMISSION_MODE
            r2.f166258e = r4
            java.lang.String r2 = "MicroMsg.LiveStatus"
            java.lang.String r4 = "liveStatusModeChange changeToPermissionMode"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x009f:
            java.lang.String r12 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r13 = r2.f133050d
            java.lang.String r15 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r16 = 2
            r17 = 0
            r18 = 0
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r2 = r2.f133055i
            r20 = 32
            r21 = 0
            r19 = r2
            e60.C58532b.m67948d(r12, r13, r15, r16, r17, r18, r19, r20, r21)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 1380(0x564, double:6.82E-321)
            r25 = 11
            r27 = 1
            r22.mo175913w(r23, r25, r27)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x00cc:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x00de
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x00de
            boolean r2 = r2.mo82881c()
            if (r2 != 0) goto L_0x00de
            r12 = 1
            goto L_0x00df
        L_0x00de:
            r12 = 0
        L_0x00df:
            if (r12 == 0) goto L_0x0133
            if (r1 == 0) goto L_0x00eb
            java.lang.String r2 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            int r8 = r1.getInt(r2, r8)
            r13 = r8
            goto L_0x00ec
        L_0x00eb:
            r13 = 0
        L_0x00ec:
            c50.a r9 = r0.f157281P
            if (r9 == 0) goto L_0x0106
            android.content.Context r10 = r30.getContext()
            gy3.C87412m.m108593f(r10, r6)
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 246(0xf6, float:3.45E-43)
            r19 = 0
            b50.C54408d.C54409a.m61121a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0106:
            java.lang.String r20 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r4 = r2.f133050d
            java.lang.String r23 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r24 = 2
            r25 = 1
            r26 = 0
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r2 = r2.f133055i
            r28 = 32
            r29 = 0
            r21 = r4
            r27 = r2
            e60.C58532b.m67948d(r20, r21, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r2 = "markAnchorMinimumView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1380(0x564, double:6.82E-321)
            r11 = 10
            r13 = 1
            r8.mo175913w(r9, r11, r13)
        L_0x0133:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x0137:
            boolean r2 = r0.f157277K
            if (r2 == 0) goto L_0x0147
            android.content.Context r2 = r30.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.setRequestedOrientation(r5)
        L_0x0147:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x014b:
            boolean r2 = com.tencent.p014mm.live.model.RoomLiveService.f157170B
            if (r2 == 0) goto L_0x0152
            r23 = 4
            goto L_0x0154
        L_0x0152:
            r23 = 5
        L_0x0154:
            java.lang.String r17 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            boolean r18 = com.tencent.p014mm.live.model.RoomLiveService.f157214y
            boolean r19 = com.tencent.p014mm.live.model.RoomLiveService.f157215z
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r2 = r2.f133051e
            boolean r21 = com.tencent.p014mm.live.model.RoomLiveService.f157213x
            android.content.Context r4 = r30.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            r24 = 0
            r25 = 128(0x80, float:1.794E-43)
            r26 = 0
            r20 = r2
            r22 = r4
            e60.C58532b.m67951g(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            android.content.Context r2 = r30.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.orientation
            if (r2 != r9) goto L_0x019c
            java.lang.String r2 = "markAnchorLanscapeLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1380(0x564, double:6.82E-321)
            r11 = 12
            r13 = 1
            r8.mo175913w(r9, r11, r13)
            goto L_0x01aa
        L_0x019c:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r11)
            com.tencent.mm.plugin.report.service.n r15 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r16 = 1380(0x564, double:6.82E-321)
            r18 = 13
            r20 = 1
            r15.mo175913w(r16, r18, r20)
        L_0x01aa:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x01ae:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r4 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r4 = r4.f157224a
            if (r4 != 0) goto L_0x0205
            d60.w0 r4 = r0.f157293q
            r5 = 8
            if (r4 == 0) goto L_0x01c1
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x01c1:
            d60.v0 r4 = r0.f157290n
            if (r4 == 0) goto L_0x01ca
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x01ca:
            d60.e1 r4 = r0.f157286g
            if (r4 == 0) goto L_0x01d3
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x01d3:
            d60.y r4 = r0.f157287h
            if (r4 == 0) goto L_0x01dc
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x01dc:
            d60.l r4 = r0.f157288i
            if (r4 == 0) goto L_0x01e5
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x01e5:
            d60.o0 r4 = r0.f157302z
            if (r4 == 0) goto L_0x0202
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            android.content.Context r6 = r30.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131832052(0x7f112cf4, float:1.9297147E38)
            java.lang.String r6 = r6.getString(r7)
            gy3.C87412m.m108593f(r6, r13)
            r4.mo82951y0(r5, r6)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0202:
            r2.mo76446d()
        L_0x0205:
            java.lang.String r9 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            boolean r10 = com.tencent.p014mm.live.model.RoomLiveService.f157214y
            boolean r11 = com.tencent.p014mm.live.model.RoomLiveService.f157215z
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r12 = r2.f133051e
            boolean r13 = com.tencent.p014mm.live.model.RoomLiveService.f157213x
            android.content.Context r2 = r30.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r14 = r2.orientation
            r15 = 6
            if (r1 == 0) goto L_0x022b
            java.lang.String r2 = "live_user_exit_reason"
            int r8 = r1.getInt(r2)
            r16 = r8
            goto L_0x022d
        L_0x022b:
            r16 = 0
        L_0x022d:
            e60.C58532b.m67950f(r9, r10, r11, r12, r13, r14, r15, r16)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x0234:
            nu.d r2 = r0.f157273G
            if (r2 == 0) goto L_0x023d
            r2.disable()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x023d:
            nu.d r2 = r0.f157273G
            if (r2 == 0) goto L_0x0249
            i72.d r2 = (i72.C98607d) r2
            r5 = 0
            r2.f289116g = r5
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x024a
        L_0x0249:
            r5 = 0
        L_0x024a:
            r0.f157273G = r5
            b60.c r2 = b60.C54428c.f152656a
            te3.no2 r2 = r2.mo75240a()
            java.lang.String r5 = r0.f157285f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "lockOrientation liveRotation:"
            r7.append(r11)
            int r11 = r2.f184524f
            r7.append(r11)
            java.lang.String r11 = ", curRotation:"
            r7.append(r11)
            int r11 = r30.getCurrentOrientation()
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r7)
            int r5 = r2.f184524f
            r7 = -1
            if (r5 == r7) goto L_0x02ad
            int r7 = r30.getCurrentOrientation()
            if (r5 != r7) goto L_0x0282
            goto L_0x02ad
        L_0x0282:
            int r2 = r2.f184524f
            r5 = 1
            if (r2 == 0) goto L_0x029e
            if (r2 == r5) goto L_0x028f
            if (r2 == r9) goto L_0x029e
            r7 = 3
            if (r2 == r7) goto L_0x028f
            goto L_0x02bb
        L_0x028f:
            r0.f157280N = r5
            android.content.Context r2 = r30.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.setRequestedOrientation(r8)
            goto L_0x02bb
        L_0x029e:
            r0.f157280N = r5
            android.content.Context r2 = r30.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.setRequestedOrientation(r5)
            goto L_0x02bb
        L_0x02ad:
            android.content.Context r2 = r30.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r5 = 14
            r2.setRequestedOrientation(r5)
        L_0x02bb:
            k50.a r2 = k50.C60971a.C60973b.f173670a
            m50.e r5 = r2.mo85947d()
            android.content.Context r7 = r30.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            int r7 = r7.orientation
            r9 = 1
            if (r7 != r9) goto L_0x02d3
            r8 = 1
        L_0x02d3:
            r5.f174721q = r8
            java.lang.String r5 = r0.f157285f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "create live, isVideoVertical:"
            r7.append(r8)
            m50.e r2 = r2.mo85947d()
            boolean r2 = r2.f174721q
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            if (r1 == 0) goto L_0x02ff
            java.lang.String r5 = "PARAM_START_LIVE_TITLE"
            java.lang.String r5 = r1.getString(r5)
            if (r5 != 0) goto L_0x02fe
            goto L_0x02ff
        L_0x02fe:
            r4 = r5
        L_0x02ff:
            r2.f133051e = r4
            te3.ep2 r2 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r2 = r2.f133051e
            r4 = r18
            gy3.C87412m.m108593f(r2, r4)
            te3.ep2 r4 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r4 = r4.f133050d
            java.lang.String r7 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            java.lang.String r8 = r0.f157285f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "startLive, name:"
            r9.append(r10)
            r9.append(r2)
            r9.append(r15)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0396
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r8 != 0) goto L_0x0396
            java.lang.String r6 = r0.f157285f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "try resume live, liveId:"
            r8.append(r9)
            r8.append(r4)
            r8.append(r14)
            r8.append(r2)
            r8.append(r15)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
            d50.h r10 = com.tencent.p014mm.live.model.RoomLiveService.f157201l
            if (r10 != 0) goto L_0x037c
            y50.i r6 = new y50.i
            r26 = 0
            r27 = 8
            r28 = 0
            r21 = r6
            r22 = r4
            r24 = r7
            r25 = r2
            r21.<init>(r22, r24, r25, r26, r27, r28)
            h60.q r2 = new h60.q
            r2.<init>(r0)
            r6.mo90593a(r2)
            goto L_0x03e2
        L_0x037c:
            c50.a r9 = r0.f157281P
            if (r9 == 0) goto L_0x0387
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            b50.C54408d.C54409a.m61122b(r9, r10, r11, r12, r13, r14)
        L_0x0387:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x03e2
            h60.r r4 = new h60.r
            r4.<init>(r0)
            c50.b r2 = (c50.C54655b) r2
            r2.mo75218i(r4)
            goto L_0x03e2
        L_0x0396:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "createNewLive, liveName:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = ", wechatRoomId:"
            r4.append(r5)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
            y50.j r4 = new y50.j
            android.content.Context r5 = r30.getContext()
            gy3.C87412m.m108593f(r5, r6)
            r4.<init>(r2, r7, r5)
            h60.f r2 = new h60.f
            r2.<init>(r0)
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            r6 = 3501(0xdad, float:4.906E-42)
            r5.mo123455a(r6, r4)
            z50.l r5 = new z50.l
            java.lang.String r6 = r4.f191353d
            java.lang.String r7 = r4.f191354e
            r5.<init>(r6, r7)
            f40.g r6 = f40.C86709a0.m107529k()
            ob0.b0 r6 = r6.f251779b
            r6.mo123460f(r5)
            r4.f191356g = r2
        L_0x03e2:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x03eb
            c50.b r2 = (c50.C54655b) r2
            r2.mo75212E()
        L_0x03eb:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x03ef:
            r4 = r18
            y50.j r2 = new y50.j
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r5 = r5.f133051e
            gy3.C87412m.m108593f(r5, r4)
            java.lang.String r4 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            android.content.Context r7 = r30.getContext()
            gy3.C87412m.m108593f(r7, r6)
            r2.<init>(r5, r4, r7)
            h60.m r4 = new h60.m
            r4.<init>(r0)
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            r6 = 3797(0xed5, float:5.321E-42)
            r5.mo123455a(r6, r2)
            z50.o r5 = new z50.o
            te3.ep2 r6 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r6 = r6.f133050d
            java.lang.String r8 = r2.f191354e
            byte[] r9 = com.tencent.p014mm.live.model.RoomLiveService.f157196g
            r5.<init>(r6, r8, r9)
            f40.g r6 = f40.C86709a0.m107529k()
            ob0.b0 r6 = r6.f251779b
            r6.mo123460f(r5)
            r2.f191357h = r4
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x0432:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r4 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r4 = r4.f157224a
            if (r4 != 0) goto L_0x048b
            d60.w0 r4 = r0.f157293q
            r5 = 8
            if (r4 == 0) goto L_0x0445
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0445:
            d60.v0 r4 = r0.f157290n
            if (r4 == 0) goto L_0x044e
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x044e:
            d60.e1 r4 = r0.f157286g
            if (r4 == 0) goto L_0x0457
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0457:
            d60.y r4 = r0.f157287h
            if (r4 == 0) goto L_0x0460
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0460:
            d60.l r4 = r0.f157288i
            if (r4 == 0) goto L_0x0469
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0469:
            d60.o0 r4 = r0.f157302z
            if (r4 == 0) goto L_0x0472
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0472:
            d60.x r4 = r0.f157271E
            if (r4 == 0) goto L_0x047b
            r4.mo10792g(r8)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x047b:
            r2.mo76446d()
            android.content.Context r2 = r30.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r4 = 1
            r2.setRequestedOrientation(r4)
        L_0x048b:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x048f:
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r2 = r2.f157224a
            if (r2 != 0) goto L_0x04a2
            d60.v0 r2 = r0.f157290n
            if (r2 == 0) goto L_0x049e
            r2.mo10792g(r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x049e:
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r2.f157226c = r8
        L_0x04a2:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x04a6:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r4 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            boolean r4 = r4.f157224a
            if (r4 != 0) goto L_0x04fd
            d60.w0 r4 = r0.f157293q
            r5 = 8
            if (r4 == 0) goto L_0x04b9
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04b9:
            d60.v0 r4 = r0.f157290n
            if (r4 == 0) goto L_0x04c2
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04c2:
            d60.e1 r4 = r0.f157286g
            if (r4 == 0) goto L_0x04cb
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04cb:
            d60.y r4 = r0.f157287h
            if (r4 == 0) goto L_0x04d4
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04d4:
            d60.l r4 = r0.f157288i
            if (r4 == 0) goto L_0x04dd
            r4.mo10792g(r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04dd:
            d60.o0 r4 = r0.f157302z
            if (r4 == 0) goto L_0x04fa
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            android.content.Context r6 = r30.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131832052(0x7f112cf4, float:1.9297147E38)
            java.lang.String r6 = r6.getString(r7)
            gy3.C87412m.m108593f(r6, r13)
            r4.mo82951y0(r5, r6)
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x04fa:
            r2.mo76446d()
        L_0x04fd:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x0501:
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r4 = 1
            r2.f157227d = r4
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x050a:
            if (r1 == 0) goto L_0x0516
            java.lang.String r2 = "PARAM_LIVE_KICK_USERNAME"
            java.lang.String r2 = r1.getString(r2)
            if (r2 != 0) goto L_0x0515
            goto L_0x0516
        L_0x0515:
            r4 = r2
        L_0x0516:
            f40.g r2 = f40.C86709a0.m107529k()
            ob0.b0 r2 = r2.f251779b
            z50.p r5 = new z50.p
            te3.ep2 r6 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r6 = r6.f133050d
            java.lang.String r8 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            r5.<init>(r6, r8, r4)
            r2.mo123460f(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x052e:
            d60.h r2 = r0.f157297u
            if (r2 == 0) goto L_0x0541
            g60.h r4 = r2.f166563u
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L_0x053f
            g60.h r2 = r2.f166563u
            r2.dismiss()
        L_0x053f:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0541:
            d60.o0 r2 = r0.f157302z
            if (r2 == 0) goto L_0x054c
            r4 = 8
            r2.mo10792g(r4)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x054c:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x0557
            j50.a r2 = (j50.C60735a) r2
            r2.mo85693l0()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0557:
            java.lang.String r2 = "stopLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x056b
            h60.n r4 = new h60.n
            r4.<init>()
            j50.a r2 = (j50.C60735a) r2
            r2.mo85676R(r4)
        L_0x056b:
            com.tencent.mm.live.model.RoomLiveService r2 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            com.tencent.mm.live.model.RoomLiveService$d r2 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r4 = 1
            r2.f157224a = r4
            r2.f157225b = r8
            y50.j0 r2 = y50.C66519j0.f191358d
            r2.mo90597a(r8)
            r2.mo90599c()
            r2.mo90606j()
            y50.k r2 = y50.C53496k.f150436a
            r2.mo74173f()
            b60.c r2 = b60.C54428c.f152656a
            te3.ep2 r4 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r4 = r4.f133050d
            r2.mo75241b(r4)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x0591:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x087b
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x087b
            r2.mo82879a()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x05a2:
            eb0.e r2 = r0.f157278L
            r5 = 0
            r2.mo136892d(r5)
            d60.o0 r2 = r0.f157302z
            if (r2 == 0) goto L_0x05b3
            r5 = 8
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x05b3:
            com.tencent.mm.live.view.LiveAnchorPluginLayout$j r2 = new com.tencent.mm.live.view.LiveAnchorPluginLayout$j
            r2.<init>(r0)
            r5 = 300(0x12c, double:1.48E-321)
            r7 = 50
            long r9 = (long) r7
            long r9 = r9 + r5
            r0.postDelayed(r2, r9)
            y50.j0 r2 = y50.C66519j0.f191358d
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            r6 = 3767(0xeb7, float:5.279E-42)
            r5.mo123455a(r6, r2)
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            r6 = 589(0x24d, float:8.25E-43)
            r5.mo123455a(r6, r2)
            y50.j0$a r5 = y50.C66519j0.C53494a.f150434d
            java.util.regex.Pattern r6 = o40.C61926c.f176038a
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.removeRunnable(r5)
            r6 = 0
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r5, r6)
            com.tencent.mm.live.model.RoomLiveService r5 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r6 = r5.f133052f
            if (r6 != 0) goto L_0x05f3
            int r6 = eb0.C31543z5.m39455e()
            r5.f133052f = r6
        L_0x05f3:
            b60.c r5 = b60.C54428c.f152656a
            te3.no2 r5 = r5.mo75240a()
            long r5 = r5.f184522d
            r9 = 0
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0603
            r5 = 1
            goto L_0x0604
        L_0x0603:
            r5 = 0
        L_0x0604:
            if (r5 != 0) goto L_0x069f
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r5 = r5.f133050d
            java.lang.String r7 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            int r9 = r30.getCurrentOrientation()
            te3.ep2 r10 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r10 = r10.f133051e
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 == 0) goto L_0x0621
            te3.ep2 r10 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r10 = r10.f133066w
            if (r10 != 0) goto L_0x0628
            goto L_0x0629
        L_0x0621:
            te3.ep2 r10 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r10 = r10.f133051e
            if (r10 != 0) goto L_0x0628
            goto L_0x0629
        L_0x0628:
            r4 = r10
        L_0x0629:
            te3.ep2 r10 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            int r10 = r10.f133052f
            java.lang.String r11 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            java.lang.String r12 = "roomId"
            gy3.C87412m.m108594g(r7, r12)
            java.lang.String r12 = "anchorName"
            gy3.C87412m.m108594g(r11, r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "liveStart liveId:"
            r12.append(r13)
            r12.append(r5)
            r12.append(r15)
            r12.append(r7)
            java.lang.String r13 = ", rotation:"
            r12.append(r13)
            r12.append(r9)
            r12.append(r14)
            r12.append(r4)
            java.lang.String r13 = ", createTime:"
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "MicroMsg.LiveAnchorStorage"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r12)
            java.lang.String r12 = b60.C54428c.f152657b
            boolean r13 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)
            if (r13 != 0) goto L_0x0676
            com.tencent.p014mm.vfs.C86013q1.m106461v(r12)
        L_0x0676:
            te3.no2 r13 = new te3.no2
            r13.<init>()
            r13.f184522d = r5
            r13.f184523e = r7
            r13.f184524f = r9
            r13.f184525g = r4
            r13.f184526h = r10
            r13.f184527i = r11
            byte[] r4 = r13.toByteArray()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r12)
            java.lang.String r6 = b60.C54428c.f152658c
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.vfs.C86013q1.m106437S(r5, r4)
        L_0x069f:
            com.tencent.mm.live.model.RoomLiveService$d r4 = com.tencent.p014mm.live.model.RoomLiveService.f157209t
            r5 = 1
            r4.f157225b = r5
            r4.f157224a = r8
            r2.mo90603g(r8)
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r0.f157284S
            r2.stopTimer()
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = r0.f157284S
            r4 = 1000(0x3e8, double:4.94E-321)
            r2.startTimer(r4)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x06b9:
            r4 = r13
            d60.d1 r2 = r0.f157294r
            if (r2 == 0) goto L_0x087b
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r5 = r5.f133051e
            gy3.C87412m.m108593f(r5, r4)
            java.lang.String r4 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r2.mo8366x0(r5, r4)
        L_0x06ca:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x06ce:
            d60.o0 r2 = r0.f157302z
            if (r2 == 0) goto L_0x06d9
            r4 = 8
            r2.mo10792g(r4)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x06d9:
            nu.d r2 = r0.f157273G
            if (r2 == 0) goto L_0x06e4
            r4 = r2
            i72.d r4 = (i72.C98607d) r4
            r4.f289116g = r0
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x06e4:
            if (r2 == 0) goto L_0x06ed
            i72.d r2 = (i72.C98607d) r2
            r2.enable()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x06ed:
            com.tencent.mm.live.model.RoomLiveService$b r2 = com.tencent.p014mm.live.model.RoomLiveService.f157210u
            boolean r2 = r2.f10322a
            if (r2 == 0) goto L_0x070a
            d60.y r2 = r0.f157287h
            if (r2 == 0) goto L_0x06fc
            r2.mo10792g(r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x06fc:
            d60.b$b r2 = d60.C58124b.C58125b.START_FACE_VERIFY
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r0.statusChange(r2, r4)
            com.tencent.mm.live.model.RoomLiveService$b r2 = com.tencent.p014mm.live.model.RoomLiveService.f157210u
            r2.f10322a = r8
        L_0x070a:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x070e:
            k50.a r2 = k50.C60971a.C60973b.f173670a
            m50.e r2 = r2.mo85947d()
            com.tencent.mm.live.model.RoomLiveService$c r4 = com.tencent.p014mm.live.model.RoomLiveService.f157212w
            int r5 = r4.f157222c
            int r4 = r4.f157223d
            if (r5 <= r4) goto L_0x071d
            r8 = 1
        L_0x071d:
            r4 = 1
            r4 = r4 ^ r8
            r2.f174723s = r4
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x072d
            r4 = 0
            j50.a r2 = (j50.C60735a) r2
            r2.mo75220r(r4, r4)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x072d:
            d60.v0 r2 = r0.f157290n
            if (r2 == 0) goto L_0x087b
            com.tencent.mm.live.model.RoomLiveService$c r2 = com.tencent.p014mm.live.model.RoomLiveService.f157212w
            r2.getClass()
            com.tencent.mm.live.model.RoomLiveService$c r2 = com.tencent.p014mm.live.model.RoomLiveService.f157212w
            java.lang.String r2 = r2.f157220a
            java.lang.String r4 = "userId"
            gy3.C87412m.m108594g(r2, r4)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x0744:
            d60.v0 r2 = r0.f157290n
            if (r2 == 0) goto L_0x074a
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x074a:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x075c
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x075c
            boolean r2 = r2.mo82882d()
            r4 = 1
            if (r2 != r4) goto L_0x075c
            r8 = 1
        L_0x075c:
            if (r8 == 0) goto L_0x076e
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x076e
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x076e
            d50.i$a r4 = d50.C58115i.C58116a.VIDEO_LINK_MIC
            r2.f166256c = r4
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x076e:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x0772:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x0782
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x0782
            d50.i$a r4 = d50.C58115i.C58116a.NO_LINK_MIC
            r2.f166256c = r4
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0782:
            d60.t0 r2 = r0.f157267A
            if (r2 == 0) goto L_0x078b
            java.util.ArrayList<d60.a> r4 = r0.f157275I
            r4.remove(r2)
        L_0x078b:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x078f:
            c50.a r2 = r0.f157281P
            if (r2 == 0) goto L_0x087b
            j50.a r2 = (j50.C60735a) r2
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x087b
            d50.i$a r4 = d50.C58115i.C58116a.AUDIO_LINK_MIC
            r2.f166256c = r4
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x07a1:
            r2 = 1
            com.tencent.p014mm.live.model.RoomLiveService.f157204o = r2
            android.content.Context r2 = r30.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.finishAndRemoveTask()
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x07b4:
            boolean r2 = r0.f157277K
            if (r2 == 0) goto L_0x07c4
            android.content.Context r2 = r30.getContext()
            gy3.C87412m.m108592e(r2, r10)
            android.app.Activity r2 = (android.app.Activity) r2
            r2.setRequestedOrientation(r5)
        L_0x07c4:
            d60.b$b r2 = r0.f157272F
            int r2 = r2.ordinal()
            r5 = 5
            if (r2 == r5) goto L_0x086f
            r5 = 60
            if (r2 == r5) goto L_0x07d3
            goto L_0x0879
        L_0x07d3:
            te3.oo2 r2 = new te3.oo2
            r2.<init>()
            long r5 = (long) r8
            r2.f139284e = r5
            long r5 = eb0.C31543z5.m39453c()
            r2.f139283d = r5
            f40.g r5 = f40.C86709a0.m107529k()
            ob0.b0 r5 = r5.f251779b
            z50.g r6 = new z50.g
            te3.ep2 r7 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r9 = r7.f133050d
            r6.<init>(r9, r2)
            r5.mo123460f(r6)
            d60.v0 r2 = r0.f157290n
            if (r2 == 0) goto L_0x07fc
            r2.mo10792g(r8)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x07fc:
            d60.e1 r2 = r0.f157286g
            r5 = 8
            if (r2 == 0) goto L_0x0807
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0807:
            d60.y r2 = r0.f157287h
            if (r2 == 0) goto L_0x0810
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0810:
            d60.l r2 = r0.f157288i
            if (r2 == 0) goto L_0x0819
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0819:
            d60.c r2 = r0.f157289j
            if (r2 == 0) goto L_0x0822
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0822:
            d60.n r2 = r0.f157292p
            if (r2 == 0) goto L_0x082b
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x082b:
            d60.e0 r2 = r0.f157296t
            if (r2 == 0) goto L_0x0834
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0834:
            d60.d1 r2 = r0.f157294r
            if (r2 == 0) goto L_0x083d
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x083d:
            d60.x0 r2 = r0.f157291o
            if (r2 == 0) goto L_0x0846
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0846:
            d60.i r2 = r0.f157298v
            if (r2 == 0) goto L_0x084f
            r2.mo10792g(r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x084f:
            d60.d1 r2 = r0.f157294r
            if (r2 == 0) goto L_0x0862
            te3.ep2 r5 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            java.lang.String r5 = r5.f133051e
            if (r5 != 0) goto L_0x085a
            goto L_0x085b
        L_0x085a:
            r4 = r5
        L_0x085b:
            java.lang.String r5 = com.tencent.p014mm.live.model.RoomLiveService.f157199j
            r2.mo8366x0(r4, r5)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0862:
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_STATUS_CREATE_LIVE
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r0.statusChange(r2, r4)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x087b
        L_0x086f:
            d60.b$b r2 = d60.C58124b.C58125b.BEFORE_LIVE
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r0.statusChange(r2, r4)
        L_0x0879:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x087b:
            super.statusChange(r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveAnchorPluginLayout.statusChange(d60.b$b, android.os.Bundle):void");
    }

    public void stop() {
        super.stop();
        this.f157284S.stopTimer();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r1 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        r0 = ((j50.C60735a) r0).f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unMount() {
        /*
            r12 = this;
            super.unMount()
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 3806(0xede, float:5.333E-42)
            r0.mo123470p(r1, r12)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 3559(0xde7, float:4.987E-42)
            r0.mo123470p(r1, r12)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            r1 = 3557(0xde5, float:4.984E-42)
            r0.mo123470p(r1, r12)
            boolean r0 = r12.mo76510n()
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r12.f157280N
            if (r0 != 0) goto L_0x00d6
            c50.a r0 = r12.f157281P
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0042
            j50.a r0 = (j50.C60735a) r0
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.mo82882d()
            if (r0 != r2) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = 0
        L_0x0043:
            if (r0 != 0) goto L_0x0058
            c50.a r0 = r12.f157281P
            if (r0 == 0) goto L_0x0056
            j50.a r0 = (j50.C60735a) r0
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x0056
            boolean r0 = r0.mo82884f()
            if (r0 != r2) goto L_0x0056
            r1 = 1
        L_0x0056:
            if (r1 == 0) goto L_0x0091
        L_0x0058:
            d60.h r0 = r12.f157297u
            if (r0 == 0) goto L_0x0091
            com.tencent.mm.live.ui.dialog.LiveAnchorMicUserListView r0 = r0.f166562t
            a60.a$a r0 = r0.getSelectUser()
            if (r0 == 0) goto L_0x0091
            java.lang.String r8 = r0.f151237b
            java.lang.String r9 = r0.f151240e
            java.lang.String r0 = "micId"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "sdkUid"
            gy3.C87412m.m108594g(r9, r0)
            f40.g r0 = f40.C86709a0.m107529k()
            ob0.b0 r0 = r0.f251779b
            z50.k r1 = new z50.k
            com.tencent.mm.live.model.RoomLiveService r3 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            te3.ep2 r3 = com.tencent.p014mm.live.model.RoomLiveService.f157197h
            long r4 = r3.f133050d
            java.lang.String r6 = com.tencent.p014mm.live.model.RoomLiveService.f157192c
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = java.lang.String.valueOf(r10)
            r3 = r1
            r3.<init>(r4, r6, r7, r8, r9)
            r0.mo123460f(r1)
        L_0x0091:
            y50.j0 r0 = y50.C66519j0.f191358d
            r0.mo90603g(r2)
            java.lang.String r1 = "MicroMsg.LiveCoreAnchor"
            java.lang.String r2 = "stopLive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            c50.a r2 = r12.f157281P
            if (r2 == 0) goto L_0x00ac
            h60.n r3 = new h60.n
            r3.<init>()
            j50.a r2 = (j50.C60735a) r2
            r2.mo85676R(r3)
        L_0x00ac:
            r0.mo90606j()
            y50.k r0 = y50.C53496k.f150436a
            r0.mo74173f()
            c50.a r0 = r12.f157281P
            if (r0 == 0) goto L_0x00bd
            j50.a r0 = (j50.C60735a) r0
            r0.mo85693l0()
        L_0x00bd:
            java.lang.String r0 = "releaseInstance: onlyResetReference:false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            c50.b r0 = c50.C54655b.f153178f1
            if (r0 == 0) goto L_0x00c9
            r0.mo75581i0()
        L_0x00c9:
            r0 = 0
            c50.C54655b.f153178f1 = r0
            com.tencent.mm.live.model.RoomLiveService r0 = com.tencent.p014mm.live.model.RoomLiveService.f157190a
            r0.mo76447e()
            eb0.e r0 = r12.f157278L
            r0.mo136889a()
        L_0x00d6:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r12.f157284S
            r0.stopTimer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.live.view.LiveAnchorPluginLayout.unMount():void");
    }
}
