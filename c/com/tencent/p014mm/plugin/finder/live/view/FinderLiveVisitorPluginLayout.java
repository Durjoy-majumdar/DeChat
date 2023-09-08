package com.tencent.p014mm.plugin.finder.live.view;

import a14.C53895h;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54101n0;
import ak1.C54116w;
import al1.C54127h;
import al1.C54129i;
import al1.C54130j;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import cj1.C0581o5;
import cj1.C0639y1;
import cj1.C54795n5;
import cj1.C54843w3;
import cl1.C0668l;
import cl1.C0702z0;
import cl1.C54963d0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import d60.C58121a;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import dk1.C58312g;
import er1.C58739j4;
import f40.C86709a0;
import f50.C58924d;
import fh1.C59079s2;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gh1.C59447j;
import gh1.C59454q;
import gh1.C59460w;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import hl1.C59960c3;
import hl1.C59961c4;
import hl1.C59964d3;
import hl1.C59974g;
import hl1.C59988k;
import hl1.C60030t;
import hl1.C60033t3;
import hl1.C60038v2;
import hl1.C60041w2;
import hl1.C60044x3;
import hl1.C8541b;
import hl1.C8582s;
import hl1.C8591w;
import hl1.C8593x;
import hq1.C60084c;
import hq1.C60085d;
import ht1.C60172g4;
import ig1.C8916d;
import ij1.C60299b;
import il1.C60357c5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jj1.C60874a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l31.C61212e;
import nk1.C11207i;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ok1.C62042e;
import p50.C62193a;
import p50.C62197e;
import pe3.C47465a;
import qj1.C12282d7;
import qj1.C12322e5;
import qj1.C12399ff;
import qj1.C12499l7;
import qj1.C12738xf;
import qj1.C47844c7;
import qj1.C62647ba;
import qj1.C62660c;
import qj1.C62712dd;
import qj1.C62741dg;
import qj1.C62766eg;
import qj1.C62777fg;
import qj1.C62795gh;
import qj1.C62833je;
import qj1.C62886mg;
import qj1.C62927ph;
import qj1.C62966ri;
import qj1.C62983sh;
import qj1.C63118y3;
import qj1.C63170ze;
import qt1.C63329b;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;
import sl1.C64039c;
import te3.C49299el0;
import te3.C49712hj1;
import te3.C50217l51;
import te3.C50355m51;
import te3.C52294zq0;
import te3.C64311db1;
import tf0.C64916p1;
import vk1.C65762c;
import wg1.C66110y2;
import wx3.C15601d;
import wx3.C66212f;
import y50.C53496k;
import y50.C66505a;
import yg1.C16004c;
import yg1.C66636e;
import yk1.C66662a;
import zh0.C16196b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010r\u001a\u00020q\u0012\b\u0010t\u001a\u0004\u0018\u00010s\u0012\b\u0010v\u001a\u0004\u0018\u00010u\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010b¢\u0006\u0004\bw\u0010xJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0011\u001a\u00020\u0005J \u0010\u0013\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J=\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0005H\u0016J\b\u0010&\u001a\u00020\u0005H\u0016J\b\u0010'\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u0005H\u0016J\b\u0010*\u001a\u00020\u0005H\u0016J\b\u0010+\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u0005H\u0016J\u001a\u00105\u001a\u00020\u00052\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000103H\u0016J2\u0010;\u001a\u00020\u00052\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\u00032\b\u0010:\u001a\u0004\u0018\u000103H\u0016J,\u0010A\u001a\u00020\u00052\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u00162\b\u0010@\u001a\u0004\u0018\u00010?H\u0016J\u001a\u0010C\u001a\u00020\u00052\u0006\u0010B\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u000103H\u0016J\u0010\u0010F\u001a\u00020\u00052\u0006\u0010E\u001a\u00020DH\u0016J\u0010\u0010I\u001a\u00020\u00052\u0006\u0010H\u001a\u00020GH\u0016J\u0010\u0010K\u001a\u00020\u00052\u0006\u0010H\u001a\u00020JH\u0016J\b\u0010L\u001a\u00020\u0005H\u0016J\u0018\u0010O\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u0016H\u0016J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010P\u001a\u00020\u0003H\u0016J\b\u0010R\u001a\u00020\u0005H\u0016J\b\u0010T\u001a\u0004\u0018\u00010SJ/\u0010Z\u001a\u00020\u00052\u0006\u0010U\u001a\u00020\n2\u000e\u0010W\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160V2\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[J\u0006\u0010\\\u001a\u00020\u0005J\u0006\u0010^\u001a\u00020]J\u0006\u0010_\u001a\u00020\u0005J\u0006\u0010`\u001a\u00020\u0005J\u0006\u0010a\u001a\u00020\u0003R\u0019\u0010c\u001a\u0004\u0018\u00010b8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010g\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00050i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00050i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bl\u0010kR\u001d\u0010m\u001a\b\u0012\u0004\u0012\u0002010V8\u0006¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006y"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveVisitorPluginLayout;", "Lvk1/c;", "Lob0/n;", "", "restart", "Lrx3/b0;", "tryShowRoleChangeTips", "tryReportJoinLiveWaitResp", "tryReportPauseRecovery", "tryReportPause", "", "getRelativeLayoutId", "Lal1/h;", "data", "bindData", "isHistoryGuide", "showFinderNewGuide", "hideFinderNewGuide", "isFromFloat", "activate", "", "liveId", "", "streamUrl", "audienceMode", "mute", "withAnim", "preloadLive", "(JLjava/lang/String;Ljava/lang/Integer;ZZ)V", "preloadNextLive", "(JLjava/lang/String;Ljava/lang/Integer;)Z", "state", "incomingNumber", "onCallStateChanged", "rotationEnable", "onRotationSwitchChange", "name", "start", "stop", "resume", "pause", "mount", "release", "getLiveRole", "onBattleStart", "onBattleEnd", "onBattleDismiss", "onBattleApply", "onBattleClose", "Ld60/b$b;", "status", "Landroid/os/Bundle;", "param", "statusChange", "liveState", "liveStateChange", "uiState", "uiStateChange", "extraMsg", "applyState", "errType", "errCode", "errMsg", "Lob0/y;", "scene", "onSceneEnd", "errorCode", "onLiveEventCallback", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Ly50/a;", "info", "onAcceptLiveMic", "Ly50/f;", "onCloseLiveMic", "onApplyMicTimeout", "username", "tip", "showBlurBgWithTimeCount", "withAnimation", "hideLoadingLayer", "hideTimeCount", "Ljj1/a;", "getIFinderLiveCommonAdapter", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "checkMiniWindow", "", "getBlurBgElevation", "clearForSideBar", "showFromSideBar", "isInputMode", "Lte3/hj1;", "reportObj", "Lte3/hj1;", "getReportObj", "()Lte3/hj1;", "TAG", "Ljava/lang/String;", "Lkotlin/Function0;", "liveMessageCallback", "Lfy3/a;", "liveSlowMessageCallback", "skipStatus", "[Ld60/b$b;", "getSkipStatus", "()[Ld60/b$b;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/Fragment;", "uicFragment", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/Fragment;Landroid/util/AttributeSet;Lte3/hj1;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout */
public final class FinderLiveVisitorPluginLayout extends C65762c implements C11385n {
    private final String TAG;
    private C32224a<C13598b0> liveMessageCallback;
    private C32224a<C13598b0> liveSlowMessageCallback;
    private final C49712hj1 reportObj;
    private final C58124b.C58125b[] skipStatus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorPluginLayout(Context context, Fragment fragment, AttributeSet attributeSet, C49712hj1 hj12) {
        super(context, fragment, attributeSet);
        C87412m.m108594g(context, "context");
        this.reportObj = hj12;
        this.TAG = "Finder.LiveVisitorPluginLayout@" + hashCode();
        this.liveMessageCallback = new FinderLiveVisitorPluginLayout$liveMessageCallback$1(this);
        this.liveSlowMessageCallback = new FinderLiveVisitorPluginLayout$liveSlowMessageCallback$1(this);
        this.skipStatus = new C58124b.C58125b[]{C58124b.C58125b.FINDER_LIVE_LINK_MIC_ADD_BOTTOM_BAR, C58124b.C58125b.FINDER_LIVE_LOTTERY_UPDATE_COUNTDOWN, C58124b.C58125b.FINDER_LIVE_STATISTC_EVENT, C58124b.C58125b.FINDER_LIVE_UPDATE_LIVE_MSG};
    }

    public static /* synthetic */ void preloadLive$default(FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout, long j, String str, Integer num, boolean z, boolean z2, int i, Object obj) {
        finderLiveVisitorPluginLayout.preloadLive(j, str, num, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    private final void tryReportJoinLiveWaitResp() {
        C39818r rVar = C39818r.f106831a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C39622i0 a = rVar.mo62443b(context).mo75002a(C58312g.class);
        C87412m.m108593f(a, "UICProvider.of(context).…veSideBarUIC::class.java)");
        C58312g gVar = (C58312g) a;
        Context context2 = getContext();
        C87412m.m108593f(context2, "context");
        String z3 = ((C60172g4) rVar.mo62443b(context2).mo62447c(C60172g4.class)).mo12868z3();
        String str = "";
        if (gVar.f166967e) {
            C13604l<Boolean, String> b = gVar.f166971i.mo83064b();
            boolean booleanValue = ((Boolean) b.f38555d).booleanValue();
            z3 = (String) b.f38556e;
            if (booleanValue) {
                str = "temp_33";
            }
        }
        C66662a aVar = (C66662a) business(C66662a.class);
        int i = getContext().getResources().getConfiguration().orientation;
        C66662a.m78644c3(aVar, i, str, z3, true, (Map) null, 16, (Object) null);
    }

    private final void tryReportPause() {
        TextView textView = getLoadingTipWidget().f172077h;
        boolean z = false;
        if (textView != null && textView.getVisibility() == 0) {
            z = true;
        }
        if (!z) {
            C66110y2.m77912b(C66110y2.f190024a, 1, ((C54991o) business(C54991o.class)).f154284Y2, 0, false, 12, (Object) null);
        }
    }

    private final void tryReportPauseRecovery() {
        TextView textView = getLoadingTipWidget().f172077h;
        boolean z = false;
        if (textView != null && textView.getVisibility() == 0) {
            z = true;
        }
        if (z && getLoadingTipWidget().f172081l > 0) {
            C66110y2.m77912b(C66110y2.f190024a, 2, getLoadingTipWidget().f172081l, 0, false, 12, (Object) null);
        }
    }

    private final void tryShowRoleChangeTips(boolean z) {
        if (z && !tryShowRoleChangeTips$isPayForChargeLive(this)) {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.e_p);
            C87412m.m108593f(string, "getContext().resources.g…sitor_role_changing_tips)");
            showProgressWithTips(string);
            C59988k livingUIC = getLivingUIC();
            if (livingUIC != null) {
                Log.m105924i(livingUIC.f171222i, "resetBgmPlayState!");
                livingUIC.f171189T1 = 0;
                livingUIC.f171192U1 = 0;
                C62927ph phVar = (C62927ph) ((C36570n) livingUIC.f171150B1).getValue();
                if (phVar != null) {
                    phVar.f178561r = 0;
                    phVar.f178562s = 0;
                }
            }
        }
    }

    private static final boolean tryShowRoleChangeTips$isPayForChargeLive(FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout) {
        Class cls = C0668l.class;
        boolean z = true;
        if (((C0668l) finderLiveVisitorPluginLayout.business(cls)).f1573f != 1) {
            z = false;
        }
        ((C0668l) finderLiveVisitorPluginLayout.business(cls)).mo633j3(0);
        if (z) {
            String str = finderLiveVisitorPluginLayout.TAG;
            Log.m105924i(str, "activate isChargeLive:" + z + " but change normal mode now!");
        }
        return z;
    }

    /* JADX WARNING: type inference failed for: r8v177, types: [qj1.c] */
    /* JADX WARNING: type inference failed for: r9v105, types: [qj1.c] */
    /* JADX WARNING: type inference failed for: r9v114, types: [qj1.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void activate(al1.C54127h r32, boolean r33, boolean r34) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.Class<cl1.u> r5 = cl1.C55001u.class
            java.lang.String r6 = "data"
            gy3.C87412m.m108594g(r1, r6)
            super.activate(r32, r33, r34)
            r0.tryShowRoleChangeTips(r3)
            qt1.b r6 = qt1.C63329b.f179694a
            java.lang.String r7 = r0.TAG
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "activate "
            r8.append(r9)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r6.mo88233d(r7, r1)
            java.lang.Class<yg1.c> r1 = yg1.C16004c.class
            androidx.lifecycle.i0 r1 = r0.business(r1)
            yg1.c r1 = (yg1.C16004c) r1
            r1.mo14630d3()
            if (r2 != 0) goto L_0x0073
            java.lang.Class<ak1.w> r1 = ak1.C54116w.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ak1.w r1 = (ak1.C54116w) r1
            androidx.lifecycle.i0 r6 = r0.business(r5)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r6 = r6.f182392d
            r1.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "#markBeginEnterLive "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveCdnUserEnterLiveTimeCostStruct r1 = r1.xx0(r6)
            r1.f155490e = r6
            long r6 = eb0.C31543z5.m39453c()
            r1.f155491f = r6
        L_0x0073:
            p50.e r1 = r31.getLiveCore()
            r6 = 1
            if (r1 == 0) goto L_0x007d
            r1.mo85698q0(r6)
        L_0x007d:
            hl1.x3 r1 = r31.getLivePrepareUIC()
            if (r1 == 0) goto L_0x008c
            androidx.lifecycle.i0 r1 = r1.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            r1.mo75989X3()
        L_0x008c:
            hl1.k r1 = r31.getLivingUIC()
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup"
            if (r1 == 0) goto L_0x0829
            qt1.c r10 = nk1.C61794r.f175689a
            java.lang.String r11 = "LivingUIC onSelected start"
            r10.mo12481a(r11)
            java.lang.String r11 = r1.f171222i
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "onSelected thisCode: "
            r12.append(r13)
            int r13 = r1.hashCode()
            r12.append(r13)
            java.lang.String r13 = " isLandscape: "
            r12.append(r13)
            vk1.c r14 = r1.f166848f
            if (r14 == 0) goto L_0x00c0
            boolean r14 = r14.isLandscape()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            goto L_0x00c1
        L_0x00c0:
            r14 = 0
        L_0x00c1:
            r12.append(r14)
            java.lang.String r14 = " context: "
            r12.append(r14)
            androidx.appcompat.app.AppCompatActivity r15 = r1.f166847e
            r12.append(r15)
            java.lang.String r15 = " contextLandScape: "
            r12.append(r15)
            androidx.appcompat.app.AppCompatActivity r6 = r1.f166847e
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r8 = 2
            if (r6 != r8) goto L_0x00e4
            r6 = 1
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            r12.append(r6)
            r6 = 32
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r6)
            java.lang.String r6 = "lazyInitPlugins start"
            r10.mo12481a(r6)
            vk1.c r6 = r1.f166848f
            if (r6 == 0) goto L_0x0728
            java.lang.String r12 = r1.f171222i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "lazyInitPlugins thisCode: "
            r9.append(r11)
            int r11 = r1.hashCode()
            r9.append(r11)
            r9.append(r13)
            boolean r11 = r6.isLandscape()
            r9.append(r11)
            r9.append(r14)
            androidx.appcompat.app.AppCompatActivity r11 = r1.f166847e
            r9.append(r11)
            java.lang.String r11 = " basePlugin: "
            r9.append(r11)
            r9.append(r6)
            java.lang.String r11 = " configuration: "
            r9.append(r11)
            androidx.appcompat.app.AppCompatActivity r11 = r1.f166847e
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            r9.append(r11)
            java.lang.String r11 = " hashCode: "
            r9.append(r11)
            androidx.appcompat.app.AppCompatActivity r11 = r1.f166847e
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            int r11 = r11.hashCode()
            r9.append(r11)
            r9.append(r15)
            androidx.appcompat.app.AppCompatActivity r11 = r1.f166847e
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            int r11 = r11.orientation
            if (r11 != r8) goto L_0x0165
            r8 = 1
            goto L_0x0166
        L_0x0165:
            r8 = 0
        L_0x0166:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            r8 = 2131307626(0x7f092c6a, float:1.8233485E38)
            android.view.View r8 = r6.findViewById(r8)
            if (r8 == 0) goto L_0x0181
            hl1.s1 r9 = new hl1.s1
            r9.<init>(r1)
            r8.setOnClickListener(r9)
        L_0x0181:
            qj1.a0 r8 = r1.f171206Z0
            if (r8 != 0) goto L_0x0199
            hl1.d2 r8 = new hl1.d2
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.a0 r8 = (qj1.C12238a0) r8
            r1.f171206Z0 = r8
            if (r8 == 0) goto L_0x0199
            r9 = 8
            r8.mo10792g(r9)
        L_0x0199:
            qj1.b0 r8 = r1.f171208a1
            if (r8 != 0) goto L_0x01b1
            hl1.k2 r8 = new hl1.k2
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.b0 r8 = (qj1.C62638b0) r8
            r1.f171208a1 = r8
            if (r8 == 0) goto L_0x01b1
            r9 = 8
            r8.mo10792g(r9)
        L_0x01b1:
            qj1.c0 r8 = r1.f171210b1
            if (r8 != 0) goto L_0x01c9
            hl1.l2 r8 = new hl1.l2
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.c0 r8 = (qj1.C12264c0) r8
            r1.f171210b1 = r8
            if (r8 == 0) goto L_0x01c9
            r9 = 8
            r8.mo10792g(r9)
        L_0x01c9:
            qj1.zd r8 = r1.f171181R
            if (r8 != 0) goto L_0x01e7
            r8 = 2131303488(0x7f091c40, float:1.8225092E38)
            r1.mo83050m(r8, r6)
            hl1.m2 r8 = new hl1.m2
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.zd r8 = (qj1.C63163zd) r8
            r1.f171181R = r8
            if (r8 == 0) goto L_0x01e7
            r9 = 8
            r8.mo10792g(r9)
        L_0x01e7:
            qj1.d7 r8 = r1.f171199X
            if (r8 != 0) goto L_0x0205
            qj1.d7 r8 = new qj1.d7
            r9 = 2131303581(0x7f091c9d, float:1.822528E38)
            android.view.View r9 = r1.mo83046i(r9, r6)
            r17 = r9
            android.view.ViewGroup r17 = (android.view.ViewGroup) r17
            r19 = 0
            r20 = 4
            r21 = 0
            r16 = r8
            r18 = r6
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x0205:
            r1.f171199X = r8
            r9 = 8
            r8.mo10792g(r9)
            r8 = 0
            r1.f171184S = r8
            r1.mo84871F()
            r8 = 2131303253(0x7f091b55, float:1.8224615E38)
            android.view.View r8 = r6.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r8 = 2131304377(0x7f091fb9, float:1.8226895E38)
            android.view.View r8 = r6.findViewById(r8)
            androidx.constraintlayout.widget.ConstraintLayout r8 = (androidx.constraintlayout.widget.ConstraintLayout) r8
            r1.f171232o1 = r8
            qj1.da r8 = r1.f171182R0
            if (r8 != 0) goto L_0x023e
            hl1.n2 r8 = new hl1.n2
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.da r8 = (qj1.C62705da) r8
            r1.f171182R0 = r8
            if (r8 == 0) goto L_0x023e
            r9 = 8
            r8.mo10792g(r9)
        L_0x023e:
            qj1.ba r8 = r1.f171185S0
            if (r8 != 0) goto L_0x025f
            r8 = 2131304092(0x7f091e9c, float:1.8226317E38)
            android.view.View r8 = r6.findViewById(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            hl1.p2 r9 = new hl1.p2
            r9.<init>(r8, r6)
            qj1.c r8 = r1.mo84880O(r9)
            qj1.ba r8 = (qj1.C62647ba) r8
            r1.f171185S0 = r8
            if (r8 == 0) goto L_0x025f
            r9 = 8
            r8.mo10792g(r9)
        L_0x025f:
            qj1.ba r8 = r1.f171188T0
            if (r8 != 0) goto L_0x0280
            r8 = 2131303251(0x7f091b53, float:1.8224611E38)
            android.view.View r8 = r6.findViewById(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            hl1.r2 r9 = new hl1.r2
            r9.<init>(r8, r6)
            qj1.c r8 = r1.mo84880O(r9)
            qj1.ba r8 = (qj1.C62647ba) r8
            r1.f171188T0 = r8
            if (r8 == 0) goto L_0x0280
            r9 = 8
            r8.mo10792g(r9)
        L_0x0280:
            qj1.a6 r8 = r1.f171246v
            if (r8 == 0) goto L_0x0286
            goto L_0x0416
        L_0x0286:
            r8 = 2131307547(0x7f092c1b, float:1.8233324E38)
            android.view.View r8 = r1.mo83050m(r8, r6)
            if (r8 == 0) goto L_0x02c0
            java.lang.String r9 = r1.f171222i
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "initCommonInfoPlugin isLandscape = "
            r11.append(r12)
            boolean r12 = r6.isLandscape()
            r11.append(r12)
            java.lang.String r12 = " commonInfoPlugin: "
            r11.append(r12)
            qj1.a6 r12 = r1.f171246v
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r11)
            qj1.a6 r9 = r1.f171246v
            if (r9 != 0) goto L_0x02be
            qj1.a6 r9 = new qj1.a6
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r9.<init>(r8, r6)
        L_0x02be:
            r1.f171246v = r9
        L_0x02c0:
            gy3.f0 r8 = new gy3.f0
            r8.<init>()
            boolean r9 = r6.isLandscape()
            if (r9 == 0) goto L_0x02da
            java.lang.String r9 = r1.f171222i
            java.lang.String r11 = "initCommonInfoPlugin finder_live_visitor_lanscape_header_content_ui"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r11)
            r9 = 2131304391(0x7f091fc7, float:1.8226923E38)
            android.view.View r9 = r1.mo83050m(r9, r6)
            goto L_0x02e2
        L_0x02da:
            qj1.a6 r9 = r1.f171246v
            if (r9 == 0) goto L_0x02e1
            android.view.ViewGroup r9 = r9.f166287d
            goto L_0x02e2
        L_0x02e1:
            r9 = 0
        L_0x02e2:
            r8.f27484d = r9
            if (r9 != 0) goto L_0x02ef
            java.lang.String r8 = r1.f171222i
            java.lang.String r9 = "initCommonInfoPlugin rootview = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
            goto L_0x0416
        L_0x02ef:
            r11 = 2131304199(0x7f091f07, float:1.8226534E38)
            android.view.View r9 = r9.findViewById(r11)
            if (r9 != 0) goto L_0x0316
            ft1.a r22 = ft1.C59319a.f169618b
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 60
            r30 = 0
            java.lang.String r23 = "safetyInflateException"
            o40.C11348f.C11349a.m11178b(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r8 = r1.f171222i
            java.lang.String r9 = "initCommonInfoPlugin bannerView = null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
            goto L_0x0416
        L_0x0316:
            qj1.xd r9 = r1.f171220g1
            if (r9 != 0) goto L_0x0325
            hl1.d0 r9 = new hl1.d0
            r9.<init>(r8, r6)
            qj1.c r9 = r1.mo84880O(r9)
            qj1.xd r9 = (qj1.C63108xd) r9
        L_0x0325:
            r1.f171220g1 = r9
            qj1.x3 r9 = r1.f171251x0
            if (r9 != 0) goto L_0x0336
            hl1.e0 r9 = new hl1.e0
            r9.<init>(r8, r6)
            qj1.c r9 = r1.mo84880O(r9)
            qj1.x3 r9 = (qj1.C12733x3) r9
        L_0x0336:
            r1.f171251x0 = r9
            qj1.gi r9 = r1.f171161H
            if (r9 != 0) goto L_0x0347
            hl1.f0 r9 = new hl1.f0
            r9.<init>(r8, r6)
            qj1.c r9 = r1.mo84880O(r9)
            qj1.gi r9 = (qj1.C12429gi) r9
        L_0x0347:
            r1.f171161H = r9
            T r9 = r8.f27484d
            android.view.View r9 = (android.view.View) r9
            r11 = 2131302979(0x7f091a43, float:1.822406E38)
            android.view.View r9 = r9.findViewById(r11)
            boolean r11 = r9 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x035b
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L_0x035c
        L_0x035b:
            r9 = 0
        L_0x035c:
            if (r9 == 0) goto L_0x0370
            qj1.w r11 = r1.f171233p
            if (r11 != 0) goto L_0x036e
            hl1.g0 r11 = new hl1.g0
            r11.<init>(r9, r6)
            qj1.c r9 = r1.mo84880O(r11)
            r11 = r9
            qj1.w r11 = (qj1.C63064w) r11
        L_0x036e:
            r1.f171233p = r11
        L_0x0370:
            qj1.qe r9 = r1.f171241s1
            if (r9 != 0) goto L_0x037f
            hl1.h0 r9 = new hl1.h0
            r9.<init>(r8, r6)
            qj1.c r9 = r1.mo84880O(r9)
            qj1.qe r9 = (qj1.C12625qe) r9
        L_0x037f:
            r1.f171241s1 = r9
            qj1.a6 r9 = r1.f171246v
            if (r9 == 0) goto L_0x0393
            android.view.ViewGroup r9 = r9.f166287d
            if (r9 == 0) goto L_0x0393
            r11 = 2131296614(0x7f090166, float:1.821115E38)
            android.view.View r9 = r9.findViewById(r11)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L_0x0394
        L_0x0393:
            r9 = 0
        L_0x0394:
            boolean r11 = r9 instanceof android.view.ViewGroup
            if (r11 == 0) goto L_0x0399
            goto L_0x039a
        L_0x0399:
            r9 = 0
        L_0x039a:
            if (r9 == 0) goto L_0x03ae
            hq1.d r11 = r1.f171245u1
            if (r11 != 0) goto L_0x03ac
            hl1.i0 r11 = new hl1.i0
            r11.<init>(r9, r6)
            qj1.c r9 = r1.mo84880O(r11)
            r11 = r9
            hq1.d r11 = (hq1.C60085d) r11
        L_0x03ac:
            r1.f171245u1 = r11
        L_0x03ae:
            qj1.o2 r9 = r1.f171248w
            if (r9 != 0) goto L_0x03be
            qj1.o2 r9 = new qj1.o2
            T r11 = r8.f27484d
            gy3.C87412m.m108592e(r11, r7)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r9.<init>(r11, r6)
        L_0x03be:
            r1.f171248w = r9
            qj1.t9 r9 = r1.f171254y0
            if (r9 != 0) goto L_0x03cf
            hl1.j0 r9 = new hl1.j0
            r9.<init>(r8, r6)
            qj1.c r9 = r1.mo84880O(r9)
            qj1.t9 r9 = (qj1.C62993t9) r9
        L_0x03cf:
            r1.f171254y0 = r9
            qj1.c7 r9 = r1.f171212c1
            if (r9 != 0) goto L_0x03e0
            hl1.k0 r9 = new hl1.k0
            r9.<init>(r6, r1)
            qj1.c r9 = r1.mo84880O(r9)
            qj1.c7 r9 = (qj1.C47844c7) r9
        L_0x03e0:
            r1.f171212c1 = r9
            sl1.c r9 = r1.f171194V0
            if (r9 != 0) goto L_0x03f1
            hl1.a0 r9 = new hl1.a0
            r9.<init>(r8, r6)
            qj1.c r9 = r1.mo84880O(r9)
            sl1.c r9 = (sl1.C64039c) r9
        L_0x03f1:
            r1.f171194V0 = r9
            xs1.d r9 = r1.f171200X0
            if (r9 != 0) goto L_0x0402
            hl1.b0 r9 = new hl1.b0
            r9.<init>(r8, r6)
            qj1.c r9 = r1.mo84880O(r9)
            xs1.d r9 = (xs1.C66420d) r9
        L_0x0402:
            r1.f171200X0 = r9
            ii1.e r9 = r1.f171252x1
            if (r9 != 0) goto L_0x0414
            hl1.c0 r9 = new hl1.c0
            r9.<init>(r1, r6, r8)
            qj1.c r8 = r1.mo84880O(r9)
            r9 = r8
            ii1.e r9 = (ii1.C60291e) r9
        L_0x0414:
            r1.f171252x1 = r9
        L_0x0416:
            qj1.y3 r8 = r1.f171156E1
            if (r8 != 0) goto L_0x0430
            r8 = 2131303164(0x7f091afc, float:1.8224435E38)
            android.view.View r8 = r1.mo83050m(r8, r6)
            if (r8 == 0) goto L_0x0430
            hl1.s2 r9 = new hl1.s2
            r9.<init>(r8, r6)
            qj1.c r8 = r1.mo84880O(r9)
            qj1.y3 r8 = (qj1.C63118y3) r8
            r1.f171156E1 = r8
        L_0x0430:
            qj1.fg r8 = r1.f171191U0
            if (r8 != 0) goto L_0x044d
            r8 = 2131304383(0x7f091fbf, float:1.8226907E38)
            android.view.View r8 = r1.mo83050m(r8, r6)
            boolean r9 = r8 instanceof android.view.ViewGroup
            if (r9 == 0) goto L_0x0442
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L_0x0443
        L_0x0442:
            r8 = 0
        L_0x0443:
            if (r8 == 0) goto L_0x044c
            qj1.fg r9 = new qj1.fg
            r9.<init>(r8, r6)
            r8 = r9
            goto L_0x044d
        L_0x044c:
            r8 = 0
        L_0x044d:
            r1.f171191U0 = r8
            qj1.ea r8 = r1.f171237q1
            if (r8 != 0) goto L_0x0467
            hl1.j1 r8 = new hl1.j1
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.ea r8 = (qj1.C62758ea) r8
            r1.f171237q1 = r8
            if (r8 == 0) goto L_0x0467
            r9 = 8
            r8.mo10792g(r9)
        L_0x0467:
            qj1.mf r8 = r1.f171234p0
            if (r8 != 0) goto L_0x047f
            hl1.k1 r8 = new hl1.k1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.mf r8 = (qj1.C12522mf) r8
            r1.f171234p0 = r8
            if (r8 == 0) goto L_0x047f
            r9 = 8
            r8.mo10792g(r9)
        L_0x047f:
            qj1.jc r8 = r1.f171256z
            if (r8 != 0) goto L_0x0496
            hl1.l1 r8 = new hl1.l1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.jc r8 = (qj1.C12475jc) r8
            r1.f171256z = r8
            if (r8 == 0) goto L_0x0496
            r9 = 4
            r8.mo10792g(r9)
        L_0x0496:
            qj1.c4 r8 = r1.f171147A
            if (r8 != 0) goto L_0x04a7
            hl1.m1 r8 = new hl1.m1
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.c4 r8 = (qj1.C62668c4) r8
            r1.f171147A = r8
        L_0x04a7:
            qj1.u1 r8 = r1.f171169L
            if (r8 != 0) goto L_0x04bf
            hl1.n1 r8 = new hl1.n1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.u1 r8 = (qj1.C12690u1) r8
            r1.f171169L = r8
            if (r8 == 0) goto L_0x04bf
            r9 = 8
            r8.mo10792g(r9)
        L_0x04bf:
            qj1.v9 r8 = r1.f171155E
            if (r8 != 0) goto L_0x04d5
            hl1.o1 r8 = new hl1.o1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.v9 r8 = (qj1.C63049v9) r8
            r1.f171155E = r8
            if (r8 == 0) goto L_0x04d5
            r8.mo87990e1()
        L_0x04d5:
            qj1.sg r8 = r1.f171196W
            if (r8 != 0) goto L_0x04ed
            hl1.p1 r8 = new hl1.p1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.sg r8 = (qj1.C62981sg) r8
            r1.f171196W = r8
            if (r8 == 0) goto L_0x04ed
            r9 = 8
            r8.mo10792g(r9)
        L_0x04ed:
            qj1.q7 r8 = r1.f171202Y
            if (r8 != 0) goto L_0x0505
            hl1.q1 r8 = new hl1.q1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.q7 r8 = (qj1.C12611q7) r8
            r1.f171202Y = r8
            if (r8 == 0) goto L_0x0505
            r9 = 8
            r8.mo10792g(r9)
        L_0x0505:
            qj1.gh r8 = r1.f171214d1
            if (r8 != 0) goto L_0x051d
            hl1.r1 r8 = new hl1.r1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.gh r8 = (qj1.C62795gh) r8
            r1.f171214d1 = r8
            if (r8 == 0) goto L_0x051d
            r9 = 8
            r8.mo10792g(r9)
        L_0x051d:
            vi1.n r8 = r1.f171216e1
            if (r8 != 0) goto L_0x0540
            r8 = 2131303930(0x7f091dfa, float:1.8225988E38)
            android.view.View r8 = r6.findViewById(r8)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            if (r8 == 0) goto L_0x0540
            hl1.t1 r9 = new hl1.t1
            r9.<init>(r8, r6)
            qj1.c r8 = r1.mo84880O(r9)
            vi1.n r8 = (vi1.C52931n) r8
            r1.f171216e1 = r8
            if (r8 == 0) goto L_0x0540
            r9 = 8
            r8.mo10792g(r9)
        L_0x0540:
            vi1.a r8 = r1.f171218f1
            if (r8 != 0) goto L_0x0567
            androidx.constraintlayout.widget.ConstraintLayout r8 = r1.f171232o1
            if (r8 == 0) goto L_0x0567
            r8 = 2131303927(0x7f091df7, float:1.8225982E38)
            android.view.View r8 = r6.findViewById(r8)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            if (r8 == 0) goto L_0x0567
            hl1.u1 r9 = new hl1.u1
            r9.<init>(r8, r6, r1)
            qj1.c r8 = r1.mo84880O(r9)
            vi1.a r8 = (vi1.C65750a) r8
            r1.f171218f1 = r8
            if (r8 == 0) goto L_0x0567
            r9 = 8
            r8.mo10792g(r9)
        L_0x0567:
            qj1.zc r8 = r1.f171221h1
            if (r8 != 0) goto L_0x058a
            r8 = 2131304078(0x7f091e8e, float:1.8226288E38)
            android.view.View r8 = r6.findViewById(r8)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            if (r8 == 0) goto L_0x058a
            hl1.v1 r9 = new hl1.v1
            r9.<init>(r8, r6)
            qj1.c r8 = r1.mo84880O(r9)
            qj1.zc r8 = (qj1.C12772zc) r8
            r1.f171221h1 = r8
            if (r8 == 0) goto L_0x058a
            r9 = 8
            r8.mo10792g(r9)
        L_0x058a:
            qj1.yc r8 = r1.f171223i1
            if (r8 != 0) goto L_0x05ad
            r8 = 2131304077(0x7f091e8d, float:1.8226286E38)
            android.view.View r8 = r6.findViewById(r8)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            if (r8 == 0) goto L_0x05ad
            hl1.w1 r9 = new hl1.w1
            r9.<init>(r8, r6)
            qj1.c r8 = r1.mo84880O(r9)
            qj1.yc r8 = (qj1.C63129yc) r8
            r1.f171223i1 = r8
            if (r8 == 0) goto L_0x05ad
            r9 = 8
            r8.mo10792g(r9)
        L_0x05ad:
            qj1.dg r8 = r1.f171228m1
            if (r8 != 0) goto L_0x05c5
            hl1.x1 r8 = new hl1.x1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.dg r8 = (qj1.C62741dg) r8
            r1.f171228m1 = r8
            if (r8 == 0) goto L_0x05c5
            r9 = 8
            r8.mo10792g(r9)
        L_0x05c5:
            qj1.w6 r8 = r1.f171230n1
            if (r8 != 0) goto L_0x05dd
            hl1.y1 r8 = new hl1.y1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.w6 r8 = (qj1.C63084w6) r8
            r1.f171230n1 = r8
            if (r8 == 0) goto L_0x05dd
            r9 = 8
            r8.mo10792g(r9)
        L_0x05dd:
            qj1.di r8 = r1.f171164I1
            if (r8 != 0) goto L_0x05f5
            hl1.z1 r8 = new hl1.z1
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.di r8 = (qj1.C62750di) r8
            r1.f171164I1 = r8
            if (r8 == 0) goto L_0x05f5
            r9 = 8
            r8.mo10792g(r9)
        L_0x05f5:
            qj1.db r8 = r1.f171166J1
            if (r8 != 0) goto L_0x060d
            hl1.a2 r8 = new hl1.a2
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.db r8 = (qj1.C62707db) r8
            r1.f171166J1 = r8
            if (r8 == 0) goto L_0x060d
            r9 = 8
            r8.mo10792g(r9)
        L_0x060d:
            qj1.ue r8 = r1.f171154D1
            if (r8 != 0) goto L_0x061c
            hl1.b2 r8 = new hl1.b2
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.ue r8 = (qj1.C63032ue) r8
        L_0x061c:
            r1.f171154D1 = r8
            if (r8 == 0) goto L_0x0625
            r9 = 8
            r8.mo10792g(r9)
        L_0x0625:
            qj1.u7 r8 = r1.f171227l1
            if (r8 != 0) goto L_0x0634
            hl1.c2 r8 = new hl1.c2
            r8.<init>(r6, r1)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.u7 r8 = (qj1.C63006u7) r8
        L_0x0634:
            r1.f171227l1 = r8
            if (r8 == 0) goto L_0x063d
            r9 = 8
            r8.mo10792g(r9)
        L_0x063d:
            qj1.e8 r8 = r1.f171205Z
            if (r8 != 0) goto L_0x064c
            hl1.e2 r8 = new hl1.e2
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.e8 r8 = (qj1.C12360e8) r8
        L_0x064c:
            r1.f171205Z = r8
            r9 = 8
            if (r8 == 0) goto L_0x0655
            r8.mo10792g(r9)
        L_0x0655:
            qj1.dd r8 = r1.f171171M
            if (r8 != 0) goto L_0x066b
            hl1.f2 r8 = new hl1.f2
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            qj1.dd r8 = (qj1.C62712dd) r8
            r1.f171171M = r8
            if (r8 == 0) goto L_0x066b
            r8.mo10792g(r9)
        L_0x066b:
            hl1.g2 r8 = new hl1.g2
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            wj1.a r8 = (wj1.C15410a) r8
            r1.f171159G = r8
            hl1.h2 r8 = new hl1.h2
            r8.<init>(r1, r6)
            qj1.c r8 = r1.mo84880O(r8)
            ug1.b r8 = (ug1.C65348b) r8
            r1.f171157F = r8
            vk1.c r8 = r1.f166848f
            if (r8 == 0) goto L_0x069a
            qj1.ii r9 = r1.f171163I
            if (r9 != 0) goto L_0x069a
            hl1.g1 r9 = new hl1.g1
            r9.<init>(r8)
            qj1.c r8 = r1.mo84880O(r9)
            qj1.ii r8 = (qj1.C12453ii) r8
            r1.f171163I = r8
        L_0x069a:
            vk1.c r8 = r1.f166848f
            if (r8 == 0) goto L_0x06af
            qj1.qh r9 = r1.f171239r1
            if (r9 != 0) goto L_0x06af
            hl1.m0 r9 = new hl1.m0
            r9.<init>(r8)
            qj1.c r8 = r1.mo84880O(r9)
            qj1.qh r8 = (qj1.C62943qh) r8
            r1.f171239r1 = r8
        L_0x06af:
            vk1.c r8 = r1.f166848f
            if (r8 == 0) goto L_0x06c4
            qj1.yg r9 = r1.f171243t1
            if (r9 != 0) goto L_0x06c4
            hl1.l0 r9 = new hl1.l0
            r9.<init>(r8)
            qj1.c r8 = r1.mo84880O(r9)
            qj1.yg r8 = (qj1.C63144yg) r8
            r1.f171243t1 = r8
        L_0x06c4:
            vk1.c r8 = r1.f166848f
            if (r8 == 0) goto L_0x06f8
            androidx.appcompat.app.AppCompatActivity r9 = r1.f166847e
            boolean r9 = r9 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r9 != 0) goto L_0x06d6
            java.lang.String r8 = r1.f171222i
            java.lang.String r9 = "initBoxPlugin context is not !"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r9)
            goto L_0x06f8
        L_0x06d6:
            qj1.k4 r9 = r1.f171240s
            if (r9 != 0) goto L_0x06e7
            hl1.y r9 = new hl1.y
            r9.<init>(r8, r1)
            qj1.c r9 = r1.mo84880O(r9)
            qj1.k4 r9 = (qj1.C47851k4) r9
            r1.f171240s = r9
        L_0x06e7:
            lg1.e r9 = r1.f171211b2
            if (r9 != 0) goto L_0x06f8
            hl1.z r9 = new hl1.z
            r9.<init>(r1, r8)
            qj1.c r8 = r1.mo84880O(r9)
            lg1.e r8 = (lg1.C10509e) r8
            r1.f171211b2 = r8
        L_0x06f8:
            xs1.o r8 = r1.f171203Y0
            if (r8 != 0) goto L_0x0710
            hl1.i2 r8 = new hl1.i2
            r8.<init>(r6)
            qj1.c r8 = r1.mo84880O(r8)
            xs1.o r8 = (xs1.C15883o) r8
            r1.f171203Y0 = r8
            if (r8 == 0) goto L_0x0710
            r9 = 8
            r8.mo10792g(r9)
        L_0x0710:
            qj1.h6 r8 = r1.f171172M1
            if (r8 != 0) goto L_0x0728
            hl1.j2 r8 = new hl1.j2
            r8.<init>(r1, r6)
            qj1.c r6 = r1.mo84880O(r8)
            qj1.h6 r6 = (qj1.C62804h6) r6
            r1.f171172M1 = r6
            if (r6 == 0) goto L_0x0728
            r8 = 8
            r6.mo10792g(r8)
        L_0x0728:
            java.lang.String r6 = "lazyInitPlugins end"
            r10.mo11310b(r6)
            vk1.c r6 = r1.f166848f
            if (r6 == 0) goto L_0x076d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Finder.Live:"
            r8.append(r9)
            java.lang.Class<qj1.zh> r11 = qj1.C12786zh.class
            java.lang.String r11 = r11.getCanonicalName()
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            hl1.u3 r11 = new hl1.u3
            r11.<init>(r6)
            r6.registerLazyInitPluginTask(r8, r11)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            java.lang.Class<qj1.e4> r9 = qj1.C12317e4.class
            java.lang.String r9 = r9.getCanonicalName()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            hl1.v3 r9 = new hl1.v3
            r9.<init>(r6)
            r6.registerLazyInitPluginTask(r8, r9)
        L_0x076d:
            rx3.g r6 = r1.f171213c2
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x077a
            goto L_0x07be
        L_0x077a:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r8.mo10233c(r11)
            java.lang.Object[] r23 = r8.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC"
            java.lang.String r25 = "onSelected"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r6
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r9 = 0
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC"
            java.lang.String r24 = "onSelected"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x07be:
            rx3.g r6 = r1.f171215d2
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            if (r6 != 0) goto L_0x07cb
            goto L_0x080f
        L_0x07cb:
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.mo10233c(r9)
            java.lang.Object[] r23 = r8.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC"
            java.lang.String r25 = "onSelected"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r6
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r9 = 0
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r23 = "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC"
            java.lang.String r24 = "onSelected"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x080f:
            qj1.ff r6 = r1.f171244u
            if (r6 == 0) goto L_0x081a
            r8 = 3
            r9 = 0
            r11 = 0
            qj1.C12399ff.m11974v1(r6, r11, r9, r8, r11)
            goto L_0x081c
        L_0x081a:
            r9 = 0
            r11 = 0
        L_0x081c:
            qj1.og r1 = r1.f171151C
            if (r1 == 0) goto L_0x0823
            r1.mo10792g(r9)
        L_0x0823:
            java.lang.String r1 = "LivingUIC onSelected end"
            r10.mo11310b(r1)
            goto L_0x082a
        L_0x0829:
            r11 = 0
        L_0x082a:
            hl1.x3 r1 = r31.getLivePrepareUIC()
            if (r1 == 0) goto L_0x099a
            zc1.b r6 = zc1.C66785b.f191882e
            bd1.e r6 = r6.mo90673n0()
            int r6 = r6.f131584h
            java.lang.String r8 = r1.f171363i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "prepareLive liveFinish:"
            r9.append(r10)
            androidx.lifecycle.i0 r10 = r1.mo83051g(r4)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.f154266V
            r9.append(r10)
            java.lang.String r10 = ", needFetchFeedObject:"
            r9.append(r10)
            androidx.lifecycle.i0 r10 = r1.mo83051g(r4)
            cl1.o r10 = (cl1.C54991o) r10
            boolean r10 = r10.f154200F2
            r9.append(r10)
            java.lang.String r10 = ", isFromFloat:"
            r9.append(r10)
            r9.append(r2)
            java.lang.String r10 = ", restart:"
            r9.append(r10)
            r9.append(r3)
            java.lang.String r3 = "liveId:"
            r9.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r5)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            if (r3 == 0) goto L_0x0885
            long r10 = r3.f182392d
            java.lang.Long r3 = java.lang.Long.valueOf(r10)
            goto L_0x0886
        L_0x0885:
            r3 = r11
        L_0x0886:
            r9.append(r3)
            java.lang.String r3 = ", anchorName:"
            r9.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
            r9.append(r3)
            java.lang.String r3 = ",cache visitorRole:"
            r9.append(r3)
            androidx.lifecycle.i0 r3 = r1.mo83051g(r4)
            cl1.o r3 = (cl1.C54991o) r3
            te3.fs0 r3 = r3.mo75986U3()
            int r3 = r3.f183215f
            r9.append(r3)
            java.lang.String r3 = ",lastVisitorRoleType:"
            r9.append(r3)
            r9.append(r6)
            java.lang.String r3 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r3)
            if (r2 == 0) goto L_0x08e8
            androidx.lifecycle.i0 r2 = r1.mo83051g(r4)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.f154266V
            if (r2 == 0) goto L_0x08de
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "PARAM_KEY_LIVE_END_WITH_ANIMATION"
            r4 = 0
            r2.putBoolean(r3, r4)
            vk1.c r1 = r1.f166848f
            if (r1 == 0) goto L_0x099a
            d60.b$b r3 = d60.C58124b.C58125b.LIVE_HAS_FINISHED
            r1.statusChange(r3, r2)
            goto L_0x099a
        L_0x08de:
            vk1.c r1 = r1.f166848f
            if (r1 == 0) goto L_0x099a
            r2 = 1
            r1.prepareToStart(r2)
            goto L_0x099a
        L_0x08e8:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_ALIAS_GUIDE_SHOW_BOOLEAN_SYNC
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Object r2 = r2.mo119685f(r3, r4)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r2, r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = r1.f171363i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "activate haveShowVisitorRoleGuide:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            if (r2 == 0) goto L_0x0920
            r1.mo84913n()
            goto L_0x099a
        L_0x0920:
            ok1.e r2 = ok1.C62042e.f176370a
            boolean r2 = r2.mo87095m()
            java.lang.String r3 = r1.f171363i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "activate enableVisitorRoleEntrance:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            if (r2 == 0) goto L_0x0997
            vk1.c r2 = r1.f166848f
            if (r2 == 0) goto L_0x0983
            qj1.wh r3 = r1.f171364j
            if (r3 != 0) goto L_0x0983
            android.content.Context r3 = r2.getContext()
            java.lang.String r4 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r3, r4)
            android.app.Activity r3 = (android.app.Activity) r3
            r4 = 2131303420(0x7f091bfc, float:1.8224954E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            android.view.LayoutInflater r5 = r3.getLayoutInflater()
            r6 = 2131495281(0x7f0c0971, float:1.8614094E38)
            r8 = 0
            android.view.View r5 = r5.inflate(r6, r4, r8)
            gy3.C87412m.m108592e(r5, r7)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x0970
            r4.addView(r5)
        L_0x0970:
            r2.hideProgress()
            qj1.wh r4 = new qj1.wh
            te3.hj1 r6 = r1.f166850h
            r4.<init>(r5, r2, r3, r6)
            r1.f171364j = r4
            hl1.z3 r3 = new hl1.z3
            r3.<init>(r2, r1)
            r4.f179051u = r3
        L_0x0983:
            qj1.wh r2 = r1.f171364j
            if (r2 == 0) goto L_0x0993
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r3 = r2.f179049s
            if (r3 == 0) goto L_0x0993
            qj1.xh r4 = new qj1.xh
            r4.<init>(r2)
            r3.post(r4)
        L_0x0993:
            r2 = 1
            r1.f171365n = r2
            goto L_0x099a
        L_0x0997:
            r1.mo84913n()
        L_0x099a:
            cj1.i5 r1 = cj1.C54773i5.f153520a
            java.lang.String r2 = r31.name()
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$1 r3 = new com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$1
            r3.<init>(r0)
            r1.mo75678a(r2, r3)
            java.lang.String r1 = r31.name()
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$2 r2 = new com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$2
            r2.<init>(r0)
            java.lang.String r3 = "key"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r4 = "Finder.FinderLiveSysMsgCallback"
            java.lang.String r5 = "register kicked callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.HashMap<java.lang.String, fy3.a<rx3.b0>> r5 = cj1.C54773i5.f153525f
            java.lang.Object r6 = r5.get(r1)
            if (r6 != 0) goto L_0x09c8
            r5.put(r1, r2)
        L_0x09c8:
            java.lang.String r1 = r31.name()
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$3 r2 = new com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$3
            r2.<init>(r0)
            gy3.C87412m.m108594g(r1, r3)
            java.lang.String r5 = "register anchor connection change callback"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.HashMap<java.lang.String, fy3.l<java.lang.Boolean, rx3.b0>> r6 = cj1.C54773i5.f153526g
            java.lang.Object r7 = r6.get(r1)
            if (r7 != 0) goto L_0x09e4
            r6.put(r1, r2)
        L_0x09e4:
            java.lang.String r1 = r31.name()
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$4 r2 = new com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout$activate$4
            r2.<init>(r0)
            gy3.C87412m.m108594g(r1, r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            java.util.HashMap<java.lang.String, fy3.l<java.lang.Boolean, rx3.b0>> r3 = cj1.C54773i5.f153527h
            java.lang.Object r4 = r3.get(r1)
            if (r4 != 0) goto L_0x09fe
            r3.put(r1, r2)
        L_0x09fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout.activate(al1.h, boolean, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [cp1.o] */
    /* JADX WARNING: type inference failed for: r0v115, types: [cp1.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void applyState(int r29, boolean r30, int r31, boolean r32, android.os.Bundle r33) {
        /*
            r28 = this;
            r1 = r28
            r2 = r33
            java.lang.Class<cl1.u> r0 = cl1.C55001u.class
            java.lang.Class<ak1.w> r3 = ak1.C54116w.class
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            java.lang.String r5 = r1.TAG
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "applyState liveState:"
            r6.append(r7)
            r7 = r29
            r6.append(r7)
            java.lang.String r8 = ",liveStateChange:"
            r6.append(r8)
            r8 = r30
            r6.append(r8)
            java.lang.String r9 = ",uiState:"
            r6.append(r9)
            r9 = r31
            r6.append(r9)
            java.lang.String r10 = ",uiStateChange:"
            r6.append(r10)
            r10 = r32
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            androidx.lifecycle.i0 r5 = r1.business(r4)
            cl1.o r5 = (cl1.C54991o) r5
            int r5 = r5.f154295b1
            r6 = 1
            r11 = 0
            if (r5 != 0) goto L_0x004e
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            r12 = 8
            if (r5 == 0) goto L_0x007b
            r28.showBlurBg()
            hl1.k r0 = r28.getLivingUIC()
            if (r0 == 0) goto L_0x0069
            r0.mo84870E()
            qj1.e5 r3 = r0.f171250x
            if (r3 == 0) goto L_0x0066
            r3.mo12030m1()
        L_0x0066:
            r0.mo84897u()
        L_0x0069:
            hl1.g r0 = r28.getLiveEndUIC()
            if (r0 == 0) goto L_0x0076
            qj1.xf r0 = r0.f171121i
            if (r0 == 0) goto L_0x0076
            r0.mo10792g(r12)
        L_0x0076:
            super.applyState(r29, r30, r31, r32, r33)
            goto L_0x0ab7
        L_0x007b:
            androidx.lifecycle.i0 r5 = r1.business(r4)
            cl1.o r5 = (cl1.C54991o) r5
            int r5 = r5.f154295b1
            if (r5 != r6) goto L_0x0087
            r5 = 1
            goto L_0x0088
        L_0x0087:
            r5 = 0
        L_0x0088:
            if (r5 == 0) goto L_0x008f
            super.applyState(r29, r30, r31, r32, r33)
            goto L_0x0ab7
        L_0x008f:
            androidx.lifecycle.i0 r5 = r1.business(r4)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo75997d4()
            java.lang.String r13 = ""
            java.lang.String r14 = "getService(HellLiveVisitorReoprter::class.java)"
            r15 = 0
            if (r5 == 0) goto L_0x0401
            java.lang.Class<l31.e> r2 = l31.C61212e.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            l31.e r2 = (l31.C61212e) r2
            android.content.Context r5 = r28.getContext()
            o31.b r7 = o31.C11345b.FinderLiveVisitorWithoutAffinityUI_End
            l31.e r2 = r2.mo86178qr(r5, r7)
            android.content.Context r5 = r28.getContext()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "page_type"
            r2.y50(r5, r8, r7)
            r28.forceScreenToPortrait()
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r1, r11, r6, r15)
            di3.d r2 = di3.C86312j.m106911c(r3)
            gy3.C87412m.m108593f(r2, r14)
            r16 = r2
            ak1.w r16 = (ak1.C54116w) r16
            android.content.Context r17 = r28.getContext()
            ak1.f0$q0 r18 = ak1.C54067f0.C54079q0.CloseTypeLiveOver
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            al1.i r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r2 == 0) goto L_0x00e4
            android.os.Bundle r2 = r2.f151996k
            r19 = r2
            goto L_0x00e6
        L_0x00e4:
            r19 = r15
        L_0x00e6:
            r20 = 0
            r21 = 8
            r22 = 0
            ak1.C54116w.wy0(r16, r17, r18, r19, r20, r21, r22)
            hl1.k r2 = r28.getLivingUIC()
            if (r2 == 0) goto L_0x0105
            r2.mo84870E()
            qj1.m4 r2 = r2.f171255y1
            if (r2 == 0) goto L_0x0105
            wg1.c1 r2 = r2.f178420q
            if (r2 == 0) goto L_0x0105
            wg1.e1 r2 = (wg1.C65992e1) r2
            r2.mo90018K()
        L_0x0105:
            hl1.g r2 = r28.getLiveEndUIC()
            if (r2 == 0) goto L_0x0ab7
            java.lang.Class<ls3.g> r5 = ls3.C61397g.class
            java.lang.Class<kq.g> r7 = p185kq.C61130g.class
            di3.d r8 = di3.C86312j.m106911c(r7)
            kq.g r8 = (p185kq.C61130g) r8
            java.lang.String r9 = "temp_30"
            r8.mo33246ry(r9)
            java.lang.Class<ht1.v4> r8 = ht1.C8808v4.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            ht1.v4 r8 = (ht1.C8808v4) r8
            boolean r8 = r8.mo9635e()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onLiveEnd isTeenMode "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "Finder.FinderLiveVisitorEndUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
            di3.d r9 = di3.C86312j.m106911c(r5)
            ls3.g r9 = (ls3.C61397g) r9
            r14 = 5
            androidx.lifecycle.i0 r16 = r2.mo83051g(r0)
            r12 = r16
            cl1.u r12 = (cl1.C55001u) r12
            te3.c21 r12 = r12.f154420q
            boolean r9 = r9.mo83479QW(r14, r12)
            if (r9 == 0) goto L_0x01ec
            if (r8 != 0) goto L_0x01ec
            java.lang.String r3 = "onLiveEnd have replay transition,so go to replay ui!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            androidx.lifecycle.i0 r7 = r2.mo83051g(r4)
            cl1.o r7 = (cl1.C54991o) r7
            r7.f154350p0 = r11
            vk1.c r7 = r2.f166848f
            if (r7 == 0) goto L_0x0171
            android.content.Context r7 = r7.getContext()
            goto L_0x0172
        L_0x0171:
            r7 = r15
        L_0x0172:
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L_0x0179
            android.app.Activity r7 = (android.app.Activity) r7
            goto L_0x017a
        L_0x0179:
            r7 = r15
        L_0x017a:
            if (r7 == 0) goto L_0x0187
            android.content.Intent r7 = r7.getIntent()
            if (r7 == 0) goto L_0x0187
            java.lang.String r8 = "LAUNCH_WITH_ANIM"
            r7.putExtra(r8, r6)
        L_0x0187:
            androidx.lifecycle.i0 r7 = r2.mo83051g(r0)
            cl1.u r7 = (cl1.C55001u) r7
            long r7 = r7.f154416j
            java.lang.String r10 = "CURRENT_FEED_ID"
            r3.putExtra(r10, r7)
            di3.d r5 = di3.C86312j.m106911c(r5)
            r16 = r5
            ls3.g r16 = (ls3.C61397g) r16
            androidx.lifecycle.i0 r5 = r2.mo83051g(r0)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            androidx.appcompat.app.AppCompatActivity r7 = r2.f166847e
            androidx.lifecycle.i0 r8 = r2.mo83051g(r0)
            cl1.u r8 = (cl1.C55001u) r8
            long r10 = r8.f154416j
            androidx.lifecycle.i0 r8 = r2.mo83051g(r0)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            long r12 = r8.f182392d
            androidx.lifecycle.i0 r4 = r2.mo83051g(r4)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154345o
            androidx.lifecycle.i0 r8 = r2.mo83051g(r0)
            cl1.u r8 = (cl1.C55001u) r8
            java.lang.String r8 = r8.f154423t
            androidx.lifecycle.i0 r0 = r2.mo83051g(r0)
            cl1.u r0 = (cl1.C55001u) r0
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r0 = r0.f154422s
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = r0.description
            r26 = r0
            goto L_0x01d9
        L_0x01d7:
            r26 = r15
        L_0x01d9:
            r17 = r5
            r18 = r3
            r19 = r7
            r20 = r10
            r22 = r12
            r24 = r4
            r25 = r8
            r16.mo83484bR(r17, r18, r19, r20, r22, r24, r25, r26)
            goto L_0x03ad
        L_0x01ec:
            qj1.xf r0 = r2.f171121i
            if (r0 == 0) goto L_0x0206
            a14.h0 r5 = a14.C53872d1.f151117a
            a14.k2 r19 = f14.C58901s.f168555a
            r20 = 0
            hl1.a r5 = new hl1.a
            r5.<init>(r2, r15)
            r22 = 2
            r23 = 0
            r18 = r0
            r21 = r5
            nk1.C11207i.m11072h(r18, r19, r20, r21, r22, r23)
        L_0x0206:
            qj1.xf r0 = r2.f171121i
            if (r0 == 0) goto L_0x03ad
            java.lang.Class<cl1.b> r2 = cl1.C0654b.class
            boolean r5 = r0.f36498M
            r10 = 0
            if (r5 == 0) goto L_0x022c
            android.view.ViewGroup r5 = r0.f166287d
            android.view.ViewPropertyAnimator r5 = r5.animate()
            android.view.ViewPropertyAnimator r5 = r5.translationX(r10)
            r29 = r7
            r6 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r5 = r5.setDuration(r6)
            qj1.cg r6 = new qj1.cg
            r6.<init>(r0)
            r5.withStartAction(r6)
            goto L_0x0236
        L_0x022c:
            r29 = r7
            android.view.ViewGroup r5 = r0.f166287d
            r5.setTranslationX(r10)
            r0.mo10792g(r11)
        L_0x0236:
            android.view.ViewGroup r5 = r0.f166287d
            android.content.Context r5 = r5.getContext()
            java.lang.String r6 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r5, r6)
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.Window r5 = r5.getWindow()
            if (r5 == 0) goto L_0x0254
            android.view.View r5 = r5.getDecorView()
            if (r5 == 0) goto L_0x0254
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setBackgroundColor(r6)
        L_0x0254:
            com.tencent.mm.plugin.finder.live.view.b r5 = r0.mo14482F0()
            if (r5 != 0) goto L_0x025b
            goto L_0x0260
        L_0x025b:
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r6)
        L_0x0260:
            di3.d r5 = di3.C86312j.m106911c(r3)
            ak1.w r5 = (ak1.C54116w) r5
            r5.getClass()
            zk1.s0 r5 = ak1.C54117x.m60830a()
            if (r5 == 0) goto L_0x0276
            boolean r5 = r5.f192141n
            r6 = 1
            if (r5 != r6) goto L_0x0276
            r5 = 1
            goto L_0x0277
        L_0x0276:
            r5 = 0
        L_0x0277:
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct r6 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct
            r6.<init>()
            java.lang.Class<kq.h> r7 = p185kq.C10383h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            kq.h r7 = (p185kq.C10383h) r7
            java.lang.String r7 = r7.mo10696E()
            if (r7 != 0) goto L_0x028b
            r7 = r13
        L_0x028b:
            r6.mo1021t(r7)
            java.lang.String r7 = "1002"
            r6.mo1022u(r7)
            if (r5 == 0) goto L_0x0298
            java.lang.String r13 = "194"
            goto L_0x02a6
        L_0x0298:
            di3.d r10 = di3.C86312j.m106911c(r29)
            kq.g r10 = (p185kq.C61130g) r10
            java.lang.String r10 = r10.mo33244gK()
            if (r10 != 0) goto L_0x02a5
            goto L_0x02a6
        L_0x02a5:
            r13 = r10
        L_0x02a6:
            r6.mo1020s(r13)
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            java.lang.String r13 = "is_scan"
            org.json.JSONObject r5 = r10.put(r13, r5)
            java.lang.String r5 = r5.toString()
            r6.mo1023v(r5)
            r6.mo86054n()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "report22946, contextid = "
            r5.append(r10)
            java.lang.String r10 = r6.f9761i
            r5.append(r10)
            java.lang.String r10 = ", page_id = "
            r5.append(r10)
            java.lang.String r10 = r6.f9757e
            r5.append(r10)
            java.lang.String r10 = ", commentScene = "
            r5.append(r10)
            java.lang.String r6 = r6.f9766n
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            long r13 = java.lang.System.currentTimeMillis()
            r0.f36496K = r13
            androidx.lifecycle.i0 r5 = r0.mo87696x0(r2)
            cl1.b r5 = (cl1.C0654b) r5
            boolean r5 = r5.f1544f
            if (r5 == 0) goto L_0x0303
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r2)
            cl1.b r2 = (cl1.C0654b) r2
            java.lang.String r2 = r2.f1545g
            goto L_0x030b
        L_0x0303:
            androidx.lifecycle.i0 r2 = r0.mo87696x0(r4)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.f154345o
        L_0x030b:
            di3.d r3 = di3.C86312j.m106911c(r3)
            ak1.w r3 = (ak1.C54116w) r3
            r3.getClass()
            java.lang.String r3 = "userName"
            gy3.C87412m.m108594g(r2, r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "page_id"
            r3.put(r4, r7)
            java.lang.String r5 = "username"
            r3.put(r5, r2)
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ak1.o r2 = (ak1.C54108o) r2
            ak1.f0$n r7 = ak1.C54067f0.C0066n.LIVE_END_PROFILE
            r2.mo9602Jz(r7, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "report23057, page_id = "
            r2.append(r7)
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = ", username = "
            r2.append(r4)
            java.lang.Object r3 = r3.get(r5)
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
            if (r8 == 0) goto L_0x03ad
            android.view.ViewGroup r2 = r0.f36494I
            r3 = 8
            r2.setVisibility(r3)
            android.view.View r0 = r0.f36510w
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r17 = r2.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin"
            java.lang.String r19 = "show"
            java.lang.String r20 = "(Z)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r0
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r2 = r2.mo10231a(r11)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setVisibility(r2)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin"
            java.lang.String r18 = "show"
            java.lang.String r19 = "(Z)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
        L_0x03ad:
            vo1.a0$b r0 = vo1.C65770a0.f189184r
            vo1.a0 r0 = vo1.C65770a0.f189185s
            if (r0 != 0) goto L_0x03b5
            goto L_0x0ab7
        L_0x03b5:
            if (r9 == 0) goto L_0x03da
            cp1.o r0 = r0.f189191e
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout
            if (r2 == 0) goto L_0x03c0
            r15 = r0
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r15 = (com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout) r15
        L_0x03c0:
            r2 = r15
            if (r2 == 0) goto L_0x0ab7
            java.lang.Class<zo1.j0> r0 = zo1.C66925j0.class
            qj1.c r0 = r2.getPlugin(r0)
            zo1.j0 r0 = (zo1.C66925j0) r0
            if (r0 == 0) goto L_0x03d0
            r0.mo90918d1()
        L_0x03d0:
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 3
            r7 = 0
            com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout.m64391m(r2, r3, r4, r5, r6, r7)
            goto L_0x0ab7
        L_0x03da:
            cp1.o r2 = r0.f189191e
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout
            if (r3 == 0) goto L_0x03e3
            r15 = r2
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout r15 = (com.tencent.p014mm.plugin.finder.replay.FinderLiveReplayPluginLayout) r15
        L_0x03e3:
            if (r15 == 0) goto L_0x03e8
            r15.finish()
        L_0x03e8:
            r2 = 9
            java.lang.Class<bp1.d> r3 = bp1.C54519d.class
            androidx.lifecycle.i0 r3 = r0.mo89804e(r3)
            bp1.d r3 = (bp1.C54519d) r3
            if (r3 == 0) goto L_0x03f9
            long r3 = r3.mo75371d3()
            goto L_0x03fb
        L_0x03f9:
            r3 = 0
        L_0x03fb:
            r5 = 1
            r0.mo89811l(r2, r3, r5)
            goto L_0x0ab7
        L_0x0401:
            androidx.lifecycle.i0 r5 = r1.business(r4)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.mo75999e4()
            if (r5 == 0) goto L_0x0ab7
            ok1.e r5 = ok1.C62042e.f176370a
            boolean r6 = r5.mo87116s1()
            r12 = 2
            if (r6 == 0) goto L_0x0434
            java.lang.Class<cl1.l> r6 = cl1.C0668l.class
            androidx.lifecycle.i0 r6 = r1.business(r6)
            cl1.l r6 = (cl1.C0668l) r6
            boolean r6 = r6.mo631g3()
            r16 = 1
            r6 = r6 ^ 1
            r1.hideLoadingLayer(r6)
            androidx.lifecycle.i0 r6 = r1.business(r4)
            cl1.o r6 = (cl1.C54991o) r6
            java.lang.String r6 = r6.f154345o
            com.tencent.p014mm.plugin.finder.live.view.C56032b.fillBlurBg$default(r1, r6, r11, r12, r15)
        L_0x0434:
            hl1.k r6 = r28.getLivingUIC()
            if (r6 == 0) goto L_0x0aa5
            java.lang.Class<cl1.d0> r12 = cl1.C54963d0.class
            androidx.lifecycle.i0 r19 = r6.mo83051g(r4)
            r11 = r19
            cl1.o r11 = (cl1.C54991o) r11
            int r11 = r11.f154291a1
            r15 = 524288(0x80000, float:7.34684E-40)
            boolean r11 = o40.C61926c.m72696u(r11, r15)
            if (r11 == 0) goto L_0x0458
            vk1.c r11 = r6.f166848f
            if (r11 == 0) goto L_0x0455
            r11.forceScreenToPortrait()
        L_0x0455:
            r6.mo84881P()
        L_0x0458:
            hl1.h r11 = hl1.C59977h.f171128a
            r11.mo84861b(r6)
            cj1.n5 r11 = r6.mo83048k()
            if (r11 == 0) goto L_0x0466
            r11.mo75712P()
        L_0x0466:
            qj1.ff r11 = r6.f171244u
            r15 = 3
            if (r11 == 0) goto L_0x0470
            r1 = 0
            r7 = 0
            qj1.C12399ff.m11974v1(r11, r1, r7, r15, r1)
        L_0x0470:
            qj1.ff r1 = r6.f171244u
            if (r1 == 0) goto L_0x0477
            r1.mo12093s1()
        L_0x0477:
            vk1.c r1 = r6.f166848f
            if (r1 == 0) goto L_0x0483
            boolean r1 = r1.getAudienPreloadCDNLiveConfig()
            if (r1 != 0) goto L_0x0483
            r1 = 1
            goto L_0x0484
        L_0x0483:
            r1 = 0
        L_0x0484:
            if (r1 == 0) goto L_0x048f
            qj1.ff r1 = r6.f171244u
            if (r1 == 0) goto L_0x048f
            r7 = 0
            r1.mo10792g(r7)
            goto L_0x0490
        L_0x048f:
            r7 = 0
        L_0x0490:
            qj1.e5 r1 = r6.f171250x
            if (r1 == 0) goto L_0x0497
            r1.mo10792g(r7)
        L_0x0497:
            qj1.a6 r1 = r6.f171246v
            if (r1 == 0) goto L_0x049e
            r1.mo10792g(r7)
        L_0x049e:
            qj1.je r1 = r6.f171242t
            if (r1 == 0) goto L_0x04a5
            r1.mo10792g(r7)
        L_0x04a5:
            qj1.jc r1 = r6.f171256z
            if (r1 == 0) goto L_0x04ac
            r1.mo10792g(r7)
        L_0x04ac:
            qj1.og r1 = r6.f171151C
            if (r1 == 0) goto L_0x04b3
            r1.mo10792g(r7)
        L_0x04b3:
            qj1.oh r1 = r6.f171153D
            if (r1 == 0) goto L_0x04ba
            r1.mo10792g(r7)
        L_0x04ba:
            qj1.v9 r1 = r6.f171155E
            if (r1 == 0) goto L_0x04c1
            r1.mo10792g(r7)
        L_0x04c1:
            fj1.b r1 = r6.f166851d
            java.lang.Class<cl1.h1> r7 = cl1.C54979h1.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r7)
            cl1.h1 r1 = (cl1.C54979h1) r1
            cm1.i2 r1 = r1.f154147v
            if (r1 == 0) goto L_0x04d8
            di3.d r1 = di3.C86312j.m106911c(r3)
            ak1.w r1 = (ak1.C54116w) r1
            r7 = 1
            r1.f151906J = r7
        L_0x04d8:
            qj1.zd r7 = r6.f171181R
            if (r7 == 0) goto L_0x04e0
            r11 = 0
            r7.mo10792g(r11)
        L_0x04e0:
            qj1.x6 r7 = r6.f171184S
            if (r7 == 0) goto L_0x04e7
            r7.mo88032Z0()
        L_0x04e7:
            qj1.v6 r7 = r6.f171187T
            if (r7 == 0) goto L_0x04ee
            r7.mo87928Z0()
        L_0x04ee:
            qj1.u6 r7 = r6.f171190U
            if (r7 == 0) goto L_0x04f5
            r7.mo87928Z0()
        L_0x04f5:
            qj1.dg r7 = r6.f171228m1
            if (r7 == 0) goto L_0x0518
            androidx.lifecycle.i0 r11 = r7.mo87696x0(r4)
            cl1.o r11 = (cl1.C54991o) r11
            boolean r11 = r11.f154190D
            if (r11 != 0) goto L_0x0518
            java.lang.Class<cl1.j> r11 = cl1.C39975j.class
            androidx.lifecycle.i0 r11 = r7.mo87696x0(r11)
            cl1.j r11 = (cl1.C39975j) r11
            boolean r11 = r11.mo62578e3()
            if (r11 == 0) goto L_0x0512
            goto L_0x0518
        L_0x0512:
            il1.h8 r7 = r7.f178125t
            r11 = 0
            r7.mo10792g(r11)
        L_0x0518:
            qj1.dg r7 = r6.f171228m1
            r1 = 1
            if (r7 == 0) goto L_0x0520
            r7.mo87749b1(r1)
        L_0x0520:
            qj1.w6 r7 = r6.f171230n1
            if (r7 == 0) goto L_0x0528
            r11 = 0
            r7.mo10792g(r11)
        L_0x0528:
            vk1.c r7 = r6.f166848f
            if (r7 == 0) goto L_0x0534
            boolean r7 = r7.isLandscape()
            if (r7 != r1) goto L_0x0534
            r7 = 1
            goto L_0x0535
        L_0x0534:
            r7 = 0
        L_0x0535:
            if (r7 == 0) goto L_0x0548
            qj1.ff r7 = r6.f171244u
            if (r7 == 0) goto L_0x0558
            android.view.ViewGroup r7 = r7.f166287d
            if (r7 == 0) goto L_0x0558
            hl1.z2 r11 = new hl1.z2
            r11.<init>(r6)
            r7.post(r11)
            goto L_0x0558
        L_0x0548:
            qj1.a6 r7 = r6.f171246v
            if (r7 == 0) goto L_0x0558
            android.view.ViewGroup r7 = r7.f166287d
            if (r7 == 0) goto L_0x0558
            hl1.a3 r11 = new hl1.a3
            r11.<init>(r6)
            r7.post(r11)
        L_0x0558:
            androidx.lifecycle.i0 r7 = r6.mo83051g(r12)
            cl1.d0 r7 = (cl1.C54963d0) r7
            cj1.a1 r7 = r7.f154051E
            if (r7 == 0) goto L_0x056b
            qj1.y3 r7 = r6.f171156E1
            if (r7 == 0) goto L_0x0574
            r11 = 0
            r7.mo10792g(r11)
            goto L_0x0574
        L_0x056b:
            qj1.y3 r7 = r6.f171156E1
            if (r7 == 0) goto L_0x0574
            r11 = 8
            r7.mo10792g(r11)
        L_0x0574:
            sl1.c r7 = r6.f171194V0
            if (r7 == 0) goto L_0x057b
            r7.mo88792f1()
        L_0x057b:
            xs1.d r7 = r6.f171200X0
            if (r7 == 0) goto L_0x0582
            r7.mo90516c1()
        L_0x0582:
            androidx.lifecycle.i0 r7 = r6.mo83051g(r4)
            cl1.o r7 = (cl1.C54991o) r7
            al1.d r7 = r7.f154321h1
            java.lang.String r7 = r7.f77099a
            androidx.lifecycle.i0 r11 = r6.mo83051g(r4)
            cl1.o r11 = (cl1.C54991o) r11
            al1.d r11 = r11.f154321h1
            android.os.Bundle r11 = r11.f77100b
            androidx.lifecycle.i0 r16 = r6.mo83051g(r4)
            r1 = r16
            cl1.o r1 = (cl1.C54991o) r1
            al1.d r1 = r1.f154321h1
            java.lang.Object r1 = r1.f77101c
            if (r7 != 0) goto L_0x05a5
            goto L_0x0619
        L_0x05a5:
            java.lang.String r15 = r6.f171222i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "parseInjectEvent injectEvent:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r8)
            java.lang.String r8 = "EVENT_POST_PORTRAIT_ACTION"
            boolean r8 = gy3.C87412m.m108589b(r7, r8)
            if (r8 == 0) goto L_0x05db
            vk1.c r7 = r6.f166848f
            if (r7 == 0) goto L_0x05fa
            androidx.lifecycle.i0 r8 = r6.mo83051g(r4)
            cl1.o r8 = (cl1.C54991o) r8
            int r8 = r8.f154295b1
            androidx.lifecycle.i0 r9 = r6.mo83051g(r4)
            cl1.o r9 = (cl1.C54991o) r9
            int r9 = r9.f154291a1
            r7.onPortraitAction(r8, r9, r11, r1)
            goto L_0x05fa
        L_0x05db:
            java.lang.String r8 = "EVENT_POST_LANDSCAPE_ACTION"
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x05fa
            vk1.c r7 = r6.f166848f
            if (r7 == 0) goto L_0x05fa
            androidx.lifecycle.i0 r8 = r6.mo83051g(r4)
            cl1.o r8 = (cl1.C54991o) r8
            int r8 = r8.f154295b1
            androidx.lifecycle.i0 r9 = r6.mo83051g(r4)
            cl1.o r9 = (cl1.C54991o) r9
            int r9 = r9.f154291a1
            r7.onLandscapeAction(r8, r9, r11, r1)
        L_0x05fa:
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            al1.d r1 = r1.f154321h1
            r7 = 0
            r1.f77099a = r7
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            al1.d r1 = r1.f154321h1
            r1.f77100b = r7
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            al1.d r1 = r1.f154321h1
            r1.f77101c = r7
        L_0x0619:
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.mo76007j4()
            if (r1 == 0) goto L_0x06ee
            qj1.di r1 = r6.f171164I1
            if (r1 == 0) goto L_0x06ee
            androidx.appcompat.app.AppCompatActivity r7 = r6.f166847e
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131829047(0x7f112137, float:1.9291052E38)
            java.lang.String r7 = r7.getString(r8)
            com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_LIVE_VR_TIP_GUIDE_BOOLEAN_SYNC
            androidx.lifecycle.i0 r9 = r1.mo87696x0(r4)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.f154190D
            if (r9 == 0) goto L_0x0644
            goto L_0x06ee
        L_0x0644:
            java.lang.Class<qj1.dd> r9 = qj1.C62712dd.class
            qj1.c r9 = r1.mo87687E0(r9)
            qj1.dd r9 = (qj1.C62712dd) r9
            if (r9 == 0) goto L_0x0656
            int r9 = r9.mo14483f0()
            if (r9 != 0) goto L_0x0656
            r9 = 1
            goto L_0x0657
        L_0x0656:
            r9 = 0
        L_0x0657:
            java.lang.String r11 = "FinderLiveVisitorCommonBubblePlugin"
            if (r9 == 0) goto L_0x0662
            java.lang.String r1 = "FinderLivePromoteBubblePlugin is showing, return "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            goto L_0x06ee
        L_0x0662:
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            java.lang.Object r9 = r9.mo119685f(r8, r15)
            java.lang.String r15 = "null cannot be cast to non-null type kotlin.Boolean"
            gy3.C87412m.m108592e(r9, r15)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r15 = 1
            r9 = r9 ^ r15
            if (r9 == 0) goto L_0x06cb
            f40.o r21 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r15 = r21.mo121142i()
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r15.mo119677K(r8, r10)
            int r8 = r1.mo14483f0()
            if (r8 == 0) goto L_0x06a0
            di3.d r8 = di3.C86312j.m106911c(r3)
            ak1.w r8 = (ak1.C54116w) r8
            r10 = 3
            java.lang.String r15 = java.lang.String.valueOf(r10)
            r8.Cy0(r15)
        L_0x06a0:
            r8 = 0
            r1.mo10792g(r8)
            android.widget.TextView r8 = r1.f178143s
            if (r7 == 0) goto L_0x06a9
            goto L_0x06aa
        L_0x06a9:
            r7 = r13
        L_0x06aa:
            r8.setText(r7)
            int r7 = r1.mo14483f0()
            if (r7 != 0) goto L_0x06bd
            android.view.ViewGroup r7 = r1.f166287d
            qj1.ei r8 = new qj1.ei
            r8.<init>(r1)
            r7.post(r8)
        L_0x06bd:
            java.lang.Class<qj1.db> r7 = qj1.C62707db.class
            qj1.c r1 = r1.mo87687E0(r7)
            qj1.db r1 = (qj1.C62707db) r1
            if (r1 == 0) goto L_0x06d0
            r1.mo87720b1()
            goto L_0x06d0
        L_0x06cb:
            r7 = 8
            r1.mo10792g(r7)
        L_0x06d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "showBubbleTip scene:"
            r1.append(r7)
            r7 = 0
            r1.append(r7)
            java.lang.String r7 = " showTip:"
            r1.append(r7)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
        L_0x06ee:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r0)
            cl1.u r0 = (cl1.C55001u) r0
            te3.c21 r0 = r0.f154420q
            long r0 = r0.f182392d
            fj1.b r7 = r6.f166851d
            boolean r5 = r5.mo87090j1(r7)
            if (r5 == 0) goto L_0x0716
            java.util.Set<java.lang.Long> r5 = qj1.C63108xd.f179095r
            java.util.Set<java.lang.Long> r5 = qj1.C63108xd.f179095r
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x0716
            qj1.xd r0 = r6.f171220g1
            if (r0 == 0) goto L_0x0716
            r1 = 0
            r0.mo10792g(r1)
        L_0x0716:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r1 = 128(0x80, float:1.794E-43)
            boolean r0 = o40.C61926c.m72696u(r0, r1)
            java.lang.String r1 = "showKickedMemberTip anchorUserName:"
            java.lang.String r5 = "anchorUserName"
            if (r0 == 0) goto L_0x07be
            di3.d r0 = di3.C86312j.m106911c(r3)
            ak1.w r0 = (ak1.C54116w) r0
            ak1.f0$q0 r9 = ak1.C54067f0.C54079q0.CloseTypeKickedOut
            r0.Gy0(r9)
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x073d
            r0.forceScreenToPortrait()
        L_0x073d:
            cj1.i5 r0 = cj1.C54773i5.f153520a
            r0.mo75679b()
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x074d
            r7 = 0
            r8 = 1
            r10 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r0, r10, r8, r7)
            goto L_0x074e
        L_0x074d:
            r10 = 0
        L_0x074e:
            r6.mo84870E()
            r6.mo84866A()
            qj1.sg r0 = r6.f171196W
            if (r0 == 0) goto L_0x075b
            r0.mo10792g(r10)
        L_0x075b:
            qj1.sg r0 = r6.f171196W
            if (r0 == 0) goto L_0x079b
            androidx.lifecycle.i0 r4 = r6.mo83051g(r4)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154345o
            gy3.C87412m.m108594g(r4, r5)
            java.lang.String r5 = r0.f178706q
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            r0.mo87917Z0(r4)
            il1.f2 r1 = r0.f178707r
            if (r1 == 0) goto L_0x079b
            r21 = 6
            r22 = 0
            r23 = 0
            qj1.qg r4 = new qj1.qg
            r4.<init>(r0)
            r25 = 6
            r26 = 0
            r20 = r1
            r24 = r4
            il1.C8968f2.m8755d(r20, r21, r22, r23, r24, r25, r26)
        L_0x079b:
            di3.d r0 = di3.C86312j.m106911c(r3)
            gy3.C87412m.m108593f(r0, r14)
            r7 = r0
            ak1.w r7 = (ak1.C54116w) r7
            androidx.appcompat.app.AppCompatActivity r8 = r6.f166847e
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            al1.i r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r0 == 0) goto L_0x07b4
            android.os.Bundle r15 = r0.f151996k
            r10 = r15
            goto L_0x07b5
        L_0x07b4:
            r10 = 0
        L_0x07b5:
            r11 = 0
            r12 = 8
            r13 = 0
            ak1.C54116w.wy0(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0aa5
        L_0x07be:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r8 = 256(0x100, float:3.59E-43)
            boolean r0 = o40.C61926c.m72696u(r0, r8)
            if (r0 == 0) goto L_0x082e
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x07d5
            r0.forceScreenToPortrait()
        L_0x07d5:
            cj1.i5 r0 = cj1.C54773i5.f153520a
            r0.mo75679b()
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x07e4
            r1 = 0
            r3 = 1
            r7 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r0, r7, r3, r1)
        L_0x07e4:
            r6.mo84870E()
            qj1.sg r0 = r6.f171196W
            if (r0 == 0) goto L_0x0821
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
            gy3.C87412m.m108594g(r1, r5)
            java.lang.String r3 = r0.f178706q
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "showPrivateCount anchorUserName:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r0.mo87917Z0(r1)
            il1.f2 r7 = r0.f178707r
            if (r7 == 0) goto L_0x0821
            r8 = 5
            r9 = 0
            r10 = 0
            qj1.rg r11 = new qj1.rg
            r11.<init>(r0)
            r12 = 6
            r13 = 0
            il1.C8968f2.m8755d(r7, r8, r9, r10, r11, r12, r13)
        L_0x0821:
            qj1.sg r0 = r6.f171196W
            if (r0 == 0) goto L_0x0829
            r1 = 0
            r0.mo10792g(r1)
        L_0x0829:
            r6.mo84866A()
            goto L_0x0aa5
        L_0x082e:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r8 = 1048576(0x100000, float:1.469368E-39)
            boolean r0 = o40.C61926c.m72696u(r0, r8)
            if (r0 == 0) goto L_0x08c7
            te3.ay0 r3 = new te3.ay0
            r3.<init>()
            if (r2 == 0) goto L_0x084c
            java.lang.String r0 = "PARAM_FINDER_LIVE_JOIN_ERR_PAGE"
            byte[] r0 = r2.getByteArray(r0)
            goto L_0x084d
        L_0x084c:
            r0 = 0
        L_0x084d:
            if (r0 != 0) goto L_0x0850
            goto L_0x0861
        L_0x0850:
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x0854 }
            goto L_0x0861
        L_0x0854:
            r0 = move-exception
            r8 = r0
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 0
            r0[r7] = r8
            java.lang.String r7 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r13, r0)
        L_0x0861:
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0868
            r0.forceScreenToPortrait()
        L_0x0868:
            cj1.i5 r0 = cj1.C54773i5.f153520a
            r0.mo75679b()
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0877
            r7 = 0
            r8 = 1
            r9 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r0, r9, r8, r7)
        L_0x0877:
            r6.mo84870E()
            qj1.sg r0 = r6.f171196W
            if (r0 == 0) goto L_0x08ba
            androidx.lifecycle.i0 r4 = r6.mo83051g(r4)
            cl1.o r4 = (cl1.C54991o) r4
            java.lang.String r4 = r4.f154345o
            gy3.C87412m.m108594g(r4, r5)
            java.lang.String r5 = r0.f178706q
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            r0.mo87917Z0(r4)
            il1.f2 r1 = r0.f178707r
            if (r1 == 0) goto L_0x08ba
            r22 = 8
            r24 = 0
            qj1.pg r4 = new qj1.pg
            r4.<init>(r0)
            r26 = 4
            r27 = 0
            r21 = r1
            r23 = r3
            r25 = r4
            il1.C8968f2.m8755d(r21, r22, r23, r24, r25, r26, r27)
        L_0x08ba:
            qj1.sg r0 = r6.f171196W
            if (r0 == 0) goto L_0x08c2
            r1 = 0
            r0.mo10792g(r1)
        L_0x08c2:
            r6.mo84866A()
            goto L_0x0aa5
        L_0x08c7:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r5 = 32
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            java.lang.String r5 = "context.resources.getStr…er_live_anchor_exception)"
            r7 = 2131826980(0x7f111924, float:1.928686E38)
            if (r0 == 0) goto L_0x0904
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x08e3
            r0.forceScreenToPortrait()
        L_0x08e3:
            r6.mo84869D()
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0aa5
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
            androidx.appcompat.app.AppCompatActivity r3 = r6.f166847e
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r7)
            gy3.C87412m.m108593f(r3, r5)
            r0.showBlurBgWithTimeCount(r1, r3)
            goto L_0x0aa5
        L_0x0904:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r8 = 64
            boolean r0 = o40.C61926c.m72696u(r0, r8)
            if (r0 == 0) goto L_0x0954
            androidx.lifecycle.i0 r0 = r6.mo83051g(r12)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0aa5
            androidx.lifecycle.i0 r0 = r6.mo83051g(r12)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 != 0) goto L_0x0aa5
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0933
            r0.forceScreenToPortrait()
        L_0x0933:
            r6.mo84869D()
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0aa5
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
            androidx.appcompat.app.AppCompatActivity r3 = r6.f166847e
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r7)
            gy3.C87412m.m108593f(r3, r5)
            r0.showBlurBgWithTimeCount(r1, r3)
            goto L_0x0aa5
        L_0x0954:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r8 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = o40.C61926c.m72696u(r0, r8)
            if (r0 == 0) goto L_0x09b2
            if (r2 == 0) goto L_0x096e
            java.lang.String r0 = "PARAM_LIVE_ANCHOR_STATUS_EXCEPTION_SECNE"
            int r11 = r2.getInt(r0)
            r0 = 2
            goto L_0x0970
        L_0x096e:
            r0 = 2
            r11 = 0
        L_0x0970:
            if (r11 != r0) goto L_0x0aa5
            androidx.lifecycle.i0 r0 = r6.mo83051g(r12)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r0 = r0.f154074q
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0aa5
            androidx.lifecycle.i0 r0 = r6.mo83051g(r12)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 != 0) goto L_0x0aa5
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0991
            r0.forceScreenToPortrait()
        L_0x0991:
            r6.mo84869D()
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0aa5
            androidx.lifecycle.i0 r1 = r6.mo83051g(r4)
            cl1.o r1 = (cl1.C54991o) r1
            java.lang.String r1 = r1.f154345o
            androidx.appcompat.app.AppCompatActivity r3 = r6.f166847e
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r7)
            gy3.C87412m.m108593f(r3, r5)
            r0.showBlurBgWithTimeCount(r1, r3)
            goto L_0x0aa5
        L_0x09b2:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r5 = 512(0x200, float:7.175E-43)
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            if (r0 == 0) goto L_0x09cb
            vk1.c r0 = r6.f166848f
            if (r0 == 0) goto L_0x0aa5
            r0.showProgress()
            goto L_0x0aa5
        L_0x09cb:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r5 = 32768(0x8000, float:4.5918E-41)
            boolean r0 = o40.C61926c.m72696u(r0, r5)
            if (r0 == 0) goto L_0x0a0f
            rx3.g r0 = r6.f171226k1
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            qj1.ch r0 = (qj1.C12271ch) r0
            r1 = 0
            if (r0 == 0) goto L_0x09ec
            r0.mo10792g(r1)
        L_0x09ec:
            if (r2 == 0) goto L_0x09f3
            java.lang.String r0 = "PARAM_FINDER_LIVE_LINK_MIC_POSITION"
            r2.getInt(r0, r1)
        L_0x09f3:
            rx3.g r0 = r6.f171226k1
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            qj1.ch r0 = (qj1.C12271ch) r0
            if (r0 == 0) goto L_0x0aa5
            int r1 = r0.f35366x
            r0.f35366x = r1
            com.tencent.mm.ui.widget.LiveBottomSheetPanel r1 = r0.f35364v
            qj1.fh r3 = new qj1.fh
            r3.<init>(r0)
            r1.post(r3)
            goto L_0x0aa5
        L_0x0a0f:
            androidx.lifecycle.i0 r0 = r6.mo83051g(r4)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r4 = 65536(0x10000, float:9.18355E-41)
            boolean r0 = o40.C61926c.m72696u(r0, r4)
            if (r0 == 0) goto L_0x0aa5
            di3.d r0 = di3.C86312j.m106911c(r3)
            ak1.w r0 = (ak1.C54116w) r0
            ak1.j0 r3 = ak1.C0076j0.CLICK_GIFT_BOARD_ENTRY_START_GIFT_BOARD
            r4 = 0
            r0.nv0(r3, r13, r4)
            if (r2 == 0) goto L_0x0a34
            java.lang.String r0 = "PARAM_FINDER_LIVE_SING_SONG_NAME"
            java.lang.String r0 = r2.getString(r0)
            goto L_0x0a35
        L_0x0a34:
            r0 = 0
        L_0x0a35:
            if (r2 == 0) goto L_0x0a3e
            java.lang.String r3 = "PARAM_FINDER_LIVE_LINK_USERNAME"
            java.lang.String r3 = r2.getString(r3)
            goto L_0x0a3f
        L_0x0a3e:
            r3 = 0
        L_0x0a3f:
            if (r2 == 0) goto L_0x0a48
            java.lang.String r4 = "PARAM_FINDER_LIVE_LINK_NICKNAME"
            java.lang.String r4 = r2.getString(r4)
            goto L_0x0a49
        L_0x0a48:
            r4 = 0
        L_0x0a49:
            if (r2 == 0) goto L_0x0a52
            java.lang.String r5 = "PARAM_FINDER_LIVE_LINK_AVATAR"
            java.lang.String r5 = r2.getString(r5)
            goto L_0x0a53
        L_0x0a52:
            r5 = 0
        L_0x0a53:
            java.lang.String r7 = r6.f171222i
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "UI_STATE_GIFT targetUsername:"
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " targetNickname:"
            r8.append(r9)
            r8.append(r4)
            java.lang.String r9 = " targetAvatar:"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r7 != 0) goto L_0x0a8c
            qj1.d7$d r1 = new qj1.d7$d
            r1.<init>(r3, r4, r5)
            qj1.d7 r3 = r6.f171199X
            if (r3 == 0) goto L_0x0aa5
            r3.mo11994o1(r1, r0)
            goto L_0x0aa5
        L_0x0a8c:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0a9c
            qj1.d7 r3 = r6.f171199X
            if (r3 == 0) goto L_0x0aa5
            r1 = 0
            r4 = 1
            qj1.C12282d7.m11835p1(r3, r1, r0, r4, r1)
            goto L_0x0aa5
        L_0x0a9c:
            r1 = 0
            qj1.d7 r0 = r6.f171199X
            if (r0 == 0) goto L_0x0aa5
            r3 = 3
            qj1.C12282d7.m11835p1(r0, r1, r1, r3, r1)
        L_0x0aa5:
            hl1.g r0 = r28.getLiveEndUIC()
            if (r0 == 0) goto L_0x0ab4
            qj1.xf r0 = r0.f171121i
            if (r0 == 0) goto L_0x0ab4
            r1 = 8
            r0.mo10792g(r1)
        L_0x0ab4:
            super.applyState(r29, r30, r31, r32, r33)
        L_0x0ab7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout.applyState(int, boolean, int, boolean, android.os.Bundle):void");
    }

    public void bindData(C54127h hVar) {
        C87412m.m108594g(hVar, "data");
        super.bindData(hVar);
        C63329b bVar = C63329b.f179694a;
        String str = this.TAG;
        bVar.mo88233d(str, "bindData " + hVar);
        ((C16004c) business(C16004c.class)).mo14630d3();
        C60044x3 livePrepareUIC = getLivePrepareUIC();
        if (livePrepareUIC != null) {
            livePrepareUIC.mo83049l(this, this.reportObj);
        }
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            livingUIC.mo83049l(this, this.reportObj);
        }
        C59974g liveEndUIC = getLiveEndUIC();
        if (liveEndUIC != null) {
            liveEndUIC.mo83049l(this, this.reportObj);
        }
        getLoadingTipWidget().mo85323c();
    }

    public final void checkMiniWindow() {
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            livingUIC.mo84900x();
        }
    }

    public final void clearForSideBar() {
        for (C58121a aVar : getPluginList()) {
            boolean z = aVar instanceof C62660c;
            if (z && ((C62660c) aVar).mo3206h()) {
                C56032b.Companion.getClass();
                String access$getTAG$cp = C56032b.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("clearForSideBar ");
                sb.append(aVar.mo82894j0());
                sb.append(" screen switch, visibility:");
                sb.append(aVar.f166287d.getVisibility());
                sb.append(", cacheVisibility:");
                C62660c cVar = (C62660c) aVar;
                sb.append(cVar.f177938i);
                Log.m105924i(access$getTAG$cp, sb.toString());
                cVar.f177939j = 8;
                aVar.mo10792g(cVar.f177938i);
                cVar.mo12076I0(true);
            } else if (z) {
                C62660c cVar2 = (C62660c) aVar;
                if (!cVar2.mo3206h()) {
                    cVar2.mo12076I0(true);
                }
            }
        }
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59454q(liveRoomControllerStore));
    }

    public final float getBlurBgElevation() {
        return getLoadingTipWidget().f172073d.getElevation();
    }

    public final C60874a getIFinderLiveCommonAdapter() {
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            return livingUIC;
        }
        return null;
    }

    public int getLiveRole() {
        return 0;
    }

    public int getRelativeLayoutId() {
        return C0966R.C0971layout.cx5;
    }

    public final C49712hj1 getReportObj() {
        return this.reportObj;
    }

    public final C58124b.C58125b[] getSkipStatus() {
        return this.skipStatus;
    }

    public final void hideFinderNewGuide() {
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            View view = (View) ((C36570n) livingUIC.f171213c2).getValue();
            View view2 = null;
            if (view != null) {
                if (!view.isShown()) {
                    view = null;
                }
                if (view != null) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setAnimationListener(new C8591w(view));
                    alphaAnimation.setDuration(500);
                    view.startAnimation(alphaAnimation);
                }
            }
            View view3 = (View) ((C36570n) livingUIC.f171215d2).getValue();
            if (view3 != null) {
                if (view3.isShown()) {
                    view2 = view3;
                }
                if (view2 != null) {
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation2.setAnimationListener(new C8593x(view2));
                    alphaAnimation2.setDuration(500);
                    view2.startAnimation(alphaAnimation2);
                }
            }
        }
    }

    public void hideLoadingLayer(boolean z) {
        tryReportPauseRecovery();
        super.hideLoadingLayer(z);
    }

    public void hideTimeCount() {
        Log.m105924i(this.TAG, "hideTimeCount");
        TextView textView = getLoadingTipWidget().f172077h;
        boolean z = false;
        if (textView != null && textView.getVisibility() == 0) {
            z = true;
        }
        if (z) {
            tryReportPauseRecovery();
            TextView textView2 = getLoadingTipWidget().f172077h;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            MTimerHandler mTimerHandler = getLoadingTipWidget().f172085p;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
        }
    }

    public final boolean isInputMode() {
        View findViewById = findViewById(C0966R.C0970id.fuj);
        if (findViewById != null) {
            return findViewById.isShown();
        }
        return false;
    }

    public void mount() {
        C54795n5 k;
        super.mount();
        String str = this.TAG;
        Log.m105924i(str, "mount " + getBuContext());
        C53496k kVar = C53496k.f150436a;
        kVar.mo74171d(name(), this.liveMessageCallback);
        kVar.mo74172e(name(), this.liveSlowMessageCallback);
        C86709a0.m107529k().f251779b.mo123455a(3736, this);
        C86709a0.m107529k().f251779b.mo123455a(3867, this);
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            C65762c cVar = livingUIC.f166848f;
            boolean z = false;
            if (cVar != null && !cVar.getAudienPreloadCDNLiveConfig()) {
                z = true;
            }
            if (z && (k = livingUIC.mo83048k()) != null) {
                k.mo75710N(((C54991o) livingUIC.mo83051g(C54991o.class)).f154345o);
            }
            C65762c cVar2 = livingUIC.f166848f;
            if (cVar2 != null) {
                cVar2.post(new C59960c3(livingUIC));
            }
            C65762c cVar3 = livingUIC.f166848f;
            C65762c cVar4 = cVar3 instanceof C56032b ? cVar3 : null;
            if (cVar4 != null) {
                C11207i.m11070f(cVar4, (C66212f) null, (C53934p0) null, new C59964d3(livingUIC, (C15601d<? super C59964d3>) null), 3, (Object) null);
            }
            AppCompatActivity appCompatActivity = livingUIC.f166847e;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
            C65762c cVar5 = livingUIC.f166848f;
            if (cVar5 != null) {
                C11207i.m11070f(cVar5, (C66212f) null, (C53934p0) null, new C59961c4(livingUIC, appCompatActivity, (C15601d<? super C59961c4>) null), 3, (Object) null);
            }
        }
        getLiveEndUIC();
    }

    public String name() {
        Class<FinderLiveVisitorPluginLayout> cls = FinderLiveVisitorPluginLayout.class;
        return "FinderLiveVisitorPluginLayout";
    }

    public void onAcceptLiveMic(C66505a aVar) {
        C62197e a1;
        C54127h data;
        LiveRoomControllerStore liveRoomControllerStore;
        C59079s2 s2Var;
        Class cls = C54991o.class;
        C87412m.m108594g(aVar, "info");
        String str = this.TAG;
        Log.m105924i(str, "onAcceptLiveMic self:" + ((C54991o) business(cls)).mo76015n4() + " acceptInfo:" + aVar);
        onAcceptLiveMicSizeCheck(aVar);
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            String str2 = livingUIC.f171222i;
            Log.m105924i(str2, "onAcceptLiveMic self:" + ((C54991o) livingUIC.mo83051g(cls)).mo76015n4() + " acceptInfo:" + aVar);
            if (Util.isEqual(((C54991o) livingUIC.mo83051g(cls)).mo76015n4(), aVar.f191310c)) {
                Class cls2 = C54963d0.class;
                String str3 = livingUIC.f171222i;
                Log.m105924i(str3, "onAcceptLinkMicSelf curLinkState:" + ((C54963d0) livingUIC.mo83051g(cls2)).f154078u + " curLiveUser:" + ((C54963d0) livingUIC.mo83051g(cls2)).f154073p + " audienceMode:" + ((C54991o) livingUIC.mo83051g(cls)).mo75996d3() + " pmk:" + aVar.f191315h);
                C60299b.f171929a.mo85289e();
                C65762c cVar = livingUIC.f166848f;
                if (!(cVar == null || (data = cVar.getData()) == null || (liveRoomControllerStore = data.f151979f) == null || (s2Var = (C59079s2) liveRoomControllerStore.controller(C59079s2.class)) == null)) {
                    C59079s2.m69007m3(s2Var, false, true, false, 5, (Object) null);
                }
                if (((C54991o) livingUIC.mo83051g(cls)).mo75996d3() == 0) {
                    C61926c.m72668M(new C60038v2(livingUIC, aVar));
                } else {
                    C62983sh shVar = livingUIC.f171229n;
                    if (!(shVar == null || (a1 = shVar.mo87920a1()) == null)) {
                        a1.f173033s = shVar.f178711r;
                    }
                    C61926c.m72668M(new C60041w2(livingUIC, aVar));
                }
                C62741dg dgVar = livingUIC.f171228m1;
                if (dgVar != null) {
                    C61926c.m72668M(new C62766eg(dgVar));
                }
                C65762c cVar2 = livingUIC.f166848f;
                if (cVar2 != null) {
                    cVar2.announceForAccessibility(livingUIC.f166847e.getString(C0966R.string.nd8));
                }
                C62777fg fgVar = livingUIC.f171191U0;
                if (fgVar != null) {
                    Integer num = aVar.f191318k;
                    if (num != null) {
                        num.intValue();
                    }
                    C61926c.m72668M(new C62886mg(fgVar));
                    return;
                }
                return;
            }
            livingUIC.mo84874I(aVar.f191318k);
        }
    }

    public void onApplyMicTimeout() {
        T t;
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            Class cls = C54963d0.class;
            Log.m105924i(livingUIC.f171222i, "apply link mic timeout, will auto cancel. curLinkUser:" + ((C54963d0) livingUIC.mo83051g(cls)).f154073p + " liveData.business(LiveCommonSlice::class.java).audienceLinkMicUserList:" + ((C54963d0) livingUIC.mo83051g(cls)).f154074q);
            List<C54130j> list = ((C54963d0) livingUIC.mo83051g(cls)).f154074q;
            C87412m.m108593f(list, "business(LiveLinkMicSlic…).audienceLinkMicUserList");
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Util.isEqual(((C54130j) t).f151997a, ((C54991o) livingUIC.mo83051g(C54991o.class)).mo76015n4())) {
                    break;
                }
            }
            if (t == null) {
                C62795gh ghVar = livingUIC.f171214d1;
                if (ghVar != null) {
                    ghVar.mo87788a1();
                }
                ((C54963d0) livingUIC.mo83051g(cls)).f154078u = 0;
                livingUIC.mo84878M();
            }
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.oy0((C54116w) c, C54067f0.C54085u0.TIMEOUT_NO_LINK_HUNG_UP, (C54067f0.C54068a0) null, 0, 6, (Object) null);
            ((C61212e) C86312j.m106911c(C61212e.class)).mo86153W7("finder_live_apply_for_link_time_out", livingUIC.f166848f, (Map<String, Object>) null, 25561);
        }
    }

    public void onBattleApply() {
    }

    public void onBattleClose() {
    }

    public void onBattleDismiss() {
        C63118y3 y3Var;
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null && (y3Var = livingUIC.f171156E1) != null) {
            y3Var.mo88046c1();
        }
    }

    public void onBattleEnd() {
        C65762c cVar;
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null && (cVar = livingUIC.f166848f) != null) {
            C58124b.C7172a.m7372a(cVar, C58124b.C58125b.FINDER_LIVE_BATTLE_END, (Bundle) null, 2, (Object) null);
        }
    }

    public void onBattleStart() {
        C65762c cVar;
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null && (cVar = livingUIC.f166848f) != null) {
            C58124b.C7172a.m7372a(cVar, C58124b.C58125b.FINDER_LIVE_BATTLE_START, (Bundle) null, 2, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0024, code lost:
        r3 = r3.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCallStateChanged(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Class<cl1.d0> r0 = cl1.C54963d0.class
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            java.lang.String r2 = "incomingNumber"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r7 = r5.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "onCallStateChanged state:"
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ", isFloatMode:"
            r2.append(r3)
            p50.e r3 = r5.getLiveCore()
            r4 = 0
            if (r3 == 0) goto L_0x0031
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.mo82881c()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            goto L_0x0032
        L_0x0031:
            r3 = r4
        L_0x0032:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            if (r6 == 0) goto L_0x009b
            r7 = 2
            if (r6 == r7) goto L_0x0043
            goto L_0x00f3
        L_0x0043:
            androidx.lifecycle.i0 r6 = r5.business(r1)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75997d4()
            if (r6 != 0) goto L_0x00f3
            androidx.lifecycle.i0 r6 = r5.business(r0)
            cl1.d0 r6 = (cl1.C54963d0) r6
            java.util.List<al1.j> r6 = r6.f154074q
            java.lang.String r7 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r6, r7)
            monitor-enter(r6)
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x0098 }
        L_0x0061:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0098 }
            r2 = r0
            al1.j r2 = (al1.C54130j) r2     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = r2.f151997a     // Catch:{ all -> 0x0098 }
            androidx.lifecycle.i0 r3 = r5.business(r1)     // Catch:{ all -> 0x0098 }
            cl1.o r3 = (cl1.C54991o) r3     // Catch:{ all -> 0x0098 }
            java.lang.String r3 = r3.mo76015n4()     // Catch:{ all -> 0x0098 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x0098 }
            if (r2 == 0) goto L_0x0061
            r4 = r0
        L_0x0081:
            monitor-exit(r6)
            if (r4 == 0) goto L_0x00f3
            p50.e r6 = r5.getLiveCore()
            r7 = 1
            if (r6 == 0) goto L_0x008e
            r6.mo85686c0(r7)
        L_0x008e:
            p50.e r6 = r5.getLiveCore()
            if (r6 == 0) goto L_0x00f3
            r6.mo85684b0(r7)
            goto L_0x00f3
        L_0x0098:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x009b:
            androidx.lifecycle.i0 r6 = r5.business(r1)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75997d4()
            if (r6 != 0) goto L_0x00f3
            androidx.lifecycle.i0 r6 = r5.business(r0)
            cl1.d0 r6 = (cl1.C54963d0) r6
            java.util.List<al1.j> r6 = r6.f154074q
            java.lang.String r7 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r6, r7)
            monitor-enter(r6)
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x00f0 }
        L_0x00b9:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x00f0 }
            r2 = r0
            al1.j r2 = (al1.C54130j) r2     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = r2.f151997a     // Catch:{ all -> 0x00f0 }
            androidx.lifecycle.i0 r3 = r5.business(r1)     // Catch:{ all -> 0x00f0 }
            cl1.o r3 = (cl1.C54991o) r3     // Catch:{ all -> 0x00f0 }
            java.lang.String r3 = r3.mo76015n4()     // Catch:{ all -> 0x00f0 }
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x00b9
            r4 = r0
        L_0x00d9:
            monitor-exit(r6)
            if (r4 == 0) goto L_0x00f3
            p50.e r6 = r5.getLiveCore()
            r7 = 0
            if (r6 == 0) goto L_0x00e6
            r6.mo85686c0(r7)
        L_0x00e6:
            p50.e r6 = r5.getLiveCore()
            if (r6 == 0) goto L_0x00f3
            r6.mo85684b0(r7)
            goto L_0x00f3
        L_0x00f0:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout.onCallStateChanged(int, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a2 A[LOOP:0: B:43:0x01a2->B:46:0x01be, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCloseLiveMic(y50.C66512f r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.Class<cl1.d0> r3 = cl1.C54963d0.class
            java.lang.String r4 = "info"
            gy3.C87412m.m108594g(r0, r4)
            java.lang.String r4 = r1.TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onCloseLiveMic self:"
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r1.business(r2)
            cl1.o r6 = (cl1.C54991o) r6
            java.lang.String r6 = r6.mo76015n4()
            r5.append(r6)
            java.lang.String r6 = " closeInfo:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = " curLinkMicUser:"
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r1.business(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            al1.j r6 = r6.f154073p
            r5.append(r6)
            java.lang.String r6 = " audienceLinkMicUserList:"
            r5.append(r6)
            androidx.lifecycle.i0 r6 = r1.business(r3)
            cl1.d0 r6 = (cl1.C54963d0) r6
            java.util.List<al1.j> r6 = r6.f154074q
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            hl1.k r4 = r18.getLivingUIC()
            if (r4 == 0) goto L_0x01c5
            androidx.lifecycle.i0 r5 = r4.mo83051g(r3)
            cl1.d0 r5 = (cl1.C54963d0) r5
            al1.j r5 = r5.f154073p
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x006d
            boolean r5 = r5.f152004h
            if (r5 != r6) goto L_0x006d
            r5 = 1
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 == 0) goto L_0x007a
            androidx.lifecycle.i0 r5 = r4.mo83051g(r3)
            cl1.d0 r5 = (cl1.C54963d0) r5
            boolean r5 = r5.f154053G
            if (r5 == 0) goto L_0x01c5
        L_0x007a:
            androidx.lifecycle.i0 r5 = r4.mo83051g(r2)
            cl1.o r5 = (cl1.C54991o) r5
            java.lang.String r5 = r5.mo76015n4()
            java.lang.String r8 = r0.f191337d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r8)
            if (r5 == 0) goto L_0x0160
            int r0 = r0.f191338e
            java.lang.Class<l31.e> r2 = l31.C61212e.class
            java.lang.Class<ak1.w> r5 = ak1.C54116w.class
            java.lang.String r8 = r4.f171222i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onCloseLinkMicSelf micType:"
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            r8 = 25561(0x63d9, float:3.5819E-41)
            java.lang.String r9 = "link_type"
            java.lang.String r10 = "finder_live_close_link_event"
            java.lang.String r11 = "getService(HellLiveVisitorReoprter::class.java)"
            if (r0 == r6) goto L_0x00f6
            r12 = 2
            if (r0 == r12) goto L_0x00b7
            goto L_0x0132
        L_0x00b7:
            p50.e r0 = r4.mo84868C()
            if (r0 == 0) goto L_0x00c0
            r0.mo85702u0()
        L_0x00c0:
            di3.d r0 = di3.C86312j.m106911c(r5)
            ak1.w r0 = (ak1.C54116w) r0
            r0.f151919T0 = r7
            di3.d r0 = di3.C86312j.m106911c(r5)
            gy3.C87412m.m108593f(r0, r11)
            r12 = r0
            ak1.w r12 = (ak1.C54116w) r12
            ak1.f0$u0 r13 = ak1.C54067f0.C54085u0.ACTIVE_STOP_VIDEO_LINKMIC
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            ak1.C54116w.oy0(r12, r13, r14, r15, r16, r17)
            di3.d r0 = di3.C86312j.m106911c(r2)
            l31.e r0 = (l31.C61212e) r0
            vk1.c r2 = r4.f166848f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            rx3.l r11 = new rx3.l
            r11.<init>(r9, r5)
            java.util.Map r5 = sx3.C90363p0.m113143b(r11)
            r0.mo86153W7(r10, r2, r5, r8)
            goto L_0x0132
        L_0x00f6:
            qj1.gh r0 = r4.f171214d1
            if (r0 == 0) goto L_0x00fd
            r0.mo87788a1()
        L_0x00fd:
            di3.d r0 = di3.C86312j.m106911c(r5)
            ak1.w r0 = (ak1.C54116w) r0
            r0.f151919T0 = r7
            di3.d r0 = di3.C86312j.m106911c(r5)
            gy3.C87412m.m108593f(r0, r11)
            r12 = r0
            ak1.w r12 = (ak1.C54116w) r12
            ak1.f0$u0 r13 = ak1.C54067f0.C54085u0.ACTIVE_STOP_AUDIO_LINKMIC
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            ak1.C54116w.oy0(r12, r13, r14, r15, r16, r17)
            di3.d r0 = di3.C86312j.m106911c(r2)
            l31.e r0 = (l31.C61212e) r0
            vk1.c r2 = r4.f166848f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            rx3.l r11 = new rx3.l
            r11.<init>(r9, r5)
            java.util.Map r5 = sx3.C90363p0.m113143b(r11)
            r0.mo86153W7(r10, r2, r5, r8)
        L_0x0132:
            androidx.lifecycle.i0 r0 = r4.mo83051g(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.f154053G
            if (r0 != 0) goto L_0x014e
            vk1.c r0 = r4.f166848f
            if (r0 == 0) goto L_0x0144
            r2 = 0
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r0, r7, r6, r2)
        L_0x0144:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r9 = 2
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r8, r9, r10, r11, r12, r13)
        L_0x014e:
            qj1.dg r0 = r4.f171228m1
            if (r0 == 0) goto L_0x0155
            r0.mo87748a1()
        L_0x0155:
            r4.f171207Z1 = r7
            hl1.y2 r0 = new hl1.y2
            r0.<init>(r4)
            o40.C61926c.m72668M(r0)
            goto L_0x01c5
        L_0x0160:
            int r0 = r0.f191338e
            java.lang.String r5 = r4.f171222i
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onCloseLinkMicOthers micType:"
            r7.append(r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            androidx.lifecycle.i0 r0 = r4.mo83051g(r2)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.mo75996d3()
            if (r0 == 0) goto L_0x01c5
            androidx.lifecycle.i0 r0 = r4.mo83051g(r2)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.mo75996d3()
            if (r0 != r6) goto L_0x01c5
            androidx.lifecycle.i0 r0 = r4.mo83051g(r3)
            cl1.d0 r0 = (cl1.C54963d0) r0
            java.util.List<al1.j> r3 = r0.f154074q
            java.lang.String r0 = "business(LiveLinkMicSlic…).audienceLinkMicUserList"
            gy3.C87412m.m108593f(r3, r0)
            monitor-enter(r3)
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x01c2 }
        L_0x01a2:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x01c2 }
            if (r5 == 0) goto L_0x01c0
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x01c2 }
            al1.j r5 = (al1.C54130j) r5     // Catch:{ all -> 0x01c2 }
            java.lang.String r5 = r5.f151997a     // Catch:{ all -> 0x01c2 }
            androidx.lifecycle.i0 r6 = r4.mo83051g(r2)     // Catch:{ all -> 0x01c2 }
            cl1.o r6 = (cl1.C54991o) r6     // Catch:{ all -> 0x01c2 }
            java.lang.String r6 = r6.mo76015n4()     // Catch:{ all -> 0x01c2 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x01c2 }
            if (r5 == 0) goto L_0x01a2
        L_0x01c0:
            monitor-exit(r3)
            goto L_0x01c5
        L_0x01c2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout.onCloseLiveMic(y50.f):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        C58924d c1;
        Class cls = C54991o.class;
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null && C85875k4.m106157N()) {
            int i = C75044y4.m89990b(livingUIC.f166847e).x;
            int i2 = C85875k4.m106184h(livingUIC.f166847e).x;
            String str = livingUIC.f171222i;
            StringBuilder sb = new StringBuilder();
            sb.append("onConfigurationChanged folder screenWidth: ");
            sb.append(i);
            sb.append(" realScreenWidth: ");
            sb.append(i2);
            sb.append(" baseRouterWidth: ");
            C65762c cVar = livingUIC.f166848f;
            sb.append(cVar != null ? Integer.valueOf(cVar.getWidth()) : null);
            Log.m105924i(str, sb.toString());
            C59988k.m69861q(livingUIC, new C13604l(Integer.valueOf(i2), Integer.valueOf(C75044y4.m89990b(livingUIC.f166847e).y)), false, 2, (Object) null);
            C63170ze zeVar = livingUIC.f171224j;
            if (!(zeVar == null || (c1 = zeVar.mo88091c1()) == null)) {
                C62042e eVar = C62042e.f176370a;
                C45795b bVar = livingUIC.f166851d;
                C65762c cVar2 = livingUIC.f166848f;
                c1.setRenderMode(eVar.mo87123v0(bVar, cVar2 != null ? cVar2.isLandscape() : false, livingUIC.f171186S1));
            }
        }
        String str2 = this.TAG;
        Log.m105924i(str2, "onConfigurationChanged lastOrientation:" + getLastOrientation() + ",orientation:" + Integer.valueOf(configuration.orientation));
        int lastOrientation = getLastOrientation();
        int i3 = configuration.orientation;
        if (lastOrientation != i3) {
            setLastOrientation(i3);
        }
        if ((getContext() instanceof MMActivity) && C85875k4.m106197n0()) {
            Context context = getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (C85875k4.m106154K(((MMActivity) context).getTaskId())) {
                Integer valueOf = Integer.valueOf(configuration.screenWidthDp);
                Integer valueOf2 = Integer.valueOf(configuration.screenHeightDp);
                C13604l<Integer, Integer> lVar = new C13604l<>(valueOf, valueOf2);
                if (((Number) ((C54991o) business(cls)).f154395z3.f38555d).intValue() == 0 && ((Number) ((C54991o) business(cls)).f154395z3.f38556e).intValue() == 0) {
                    C54991o oVar = (C54991o) business(cls);
                    oVar.getClass();
                    oVar.f154395z3 = lVar;
                } else if (((Number) ((C54991o) business(cls)).f154395z3.f38556e).intValue() == valueOf2.intValue() && ((Number) ((C54991o) business(cls)).f154395z3.f38555d).intValue() != valueOf.intValue()) {
                    C54991o oVar2 = (C54991o) business(cls);
                    oVar2.getClass();
                    oVar2.f154395z3 = lVar;
                    ((C54991o) business(cls)).f154334k3 = false;
                }
            }
        }
        ((C54991o) business(cls)).f154260T3 = true;
    }

    public void onLiveEventCallback(int i, Bundle bundle) {
        String str = this.TAG;
        Log.m105924i(str, "sdk callback errorCode:" + i);
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            livingUIC.mo84875J(i, bundle);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                aVar.mo8379p0(i, strArr, iArr);
            }
        }
    }

    public void onRotationSwitchChange(boolean z) {
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C12738xf xfVar;
        List<C58121a> plugins;
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        Class cls = C54991o.class;
        String str2 = this.TAG;
        Log.m105924i(str2, "onSceneEnd errType:" + i3 + ", errCode:" + i4 + ", scene:" + yVar2);
        C59988k livingUIC = getLivingUIC();
        String str3 = null;
        if (livingUIC != null) {
            Integer valueOf = yVar2 != null ? Integer.valueOf(yVar.getType()) : null;
            if (valueOf != null && valueOf.intValue() == 3736) {
                if (yVar2 instanceof C16196b) {
                    C16196b bVar = (C16196b) yVar2;
                    FinderContact P0 = bVar.mo10101P0();
                    if (bVar.mo10103X0() && P0 != null && C87412m.m108589b(bVar.mo10105c1(), ((C54991o) livingUIC.mo83051g(cls)).f154345o)) {
                        C12399ff ffVar = livingUIC.f171244u;
                        if (ffVar != null) {
                            String str4 = P0.username;
                            if (str4 == null) {
                                str4 = "";
                            }
                            ffVar.mo12095u1(str4, true);
                        }
                        C12399ff ffVar2 = livingUIC.f171244u;
                        if (ffVar2 != null) {
                            ffVar2.mo12093s1();
                        }
                        ((C54991o) livingUIC.mo83051g(cls)).f154247R0 = bVar.mo10104Y0();
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == 3867 && i3 == 0 && i4 == 0) {
                C114799u reqResp = yVar.getReqResp();
                C47350c cVar = reqResp instanceof C47350c ? (C47350c) reqResp : null;
                C47465a aVar = cVar != null ? cVar.f127056b.f127083a : null;
                C49299el0 el02 = aVar instanceof C49299el0 ? (C49299el0) aVar : null;
                if (el02 != null) {
                    FinderContact finderContact = el02.f132993d;
                    String str5 = finderContact != null ? finderContact.username : null;
                    String str6 = livingUIC.f171222i;
                    Log.m105924i(str6, "MMFunc_FinderFollow,anchorUsername:" + str5);
                    if (C87412m.m108589b(str5, ((C54991o) livingUIC.mo83051g(cls)).f154345o)) {
                        boolean AV = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76650AV(((C54991o) livingUIC.mo83051g(cls)).f154345o);
                        C65762c cVar2 = livingUIC.f166848f;
                        if (!(cVar2 == null || (plugins = cVar2.getPlugins()) == null)) {
                            ArrayList arrayList = new ArrayList();
                            for (T next : plugins) {
                                if (next instanceof C62660c) {
                                    arrayList.add(next);
                                }
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((C62660c) it.next()).mo12077P0(yVar2, AV);
                            }
                        }
                    }
                }
            }
        }
        C59974g liveEndUIC = getLiveEndUIC();
        if (liveEndUIC != null) {
            Log.m105924i("Finder.FinderLiveVisitorEndUIC", "onSceneEnd errType:" + i3 + ", errCode:" + i4 + ", scene:" + yVar2);
            if (!(yVar2 instanceof C16196b)) {
                return;
            }
            if (!((C54991o) liveEndUIC.mo83051g(cls)).mo75997d4()) {
                Log.m105924i("Finder.FinderLiveVisitorEndUIC", "onSceneEnd always living! ignore");
                return;
            }
            C12738xf xfVar2 = liveEndUIC.f171121i;
            if (!C87412m.m108589b(yVar2, xfVar2 != null ? xfVar2.f36499N : null)) {
                Log.m105924i("Finder.FinderLiveVisitorEndUIC", "onSceneEnd not current page netscene, ignore");
                return;
            }
            C8477a0 a0Var = new C8477a0();
            C8477a0 a0Var2 = new C8477a0();
            C16196b bVar2 = (C16196b) yVar2;
            FinderContact P02 = bVar2.mo10101P0();
            StringBuilder sb = new StringBuilder();
            sb.append("update bg,user page isOnlyFetchUserInfo:");
            sb.append(bVar2.mo10103X0());
            sb.append(", local username:");
            sb.append(((C54991o) liveEndUIC.mo83051g(cls)).f154345o);
            sb.append(",contact username:");
            if (P02 != null) {
                str3 = P02.username;
            }
            sb.append(str3);
            Log.m105924i("Finder.FinderLiveVisitorEndUIC", sb.toString());
            if (C87412m.m108589b(bVar2.mo10105c1(), ((C54991o) liveEndUIC.mo83051g(cls)).f154345o) && (xfVar = liveEndUIC.f171121i) != null) {
                C11207i.m11072h(xfVar, (C66212f) null, (C53934p0) null, new C8541b(P02, liveEndUIC, a0Var, yVar, a0Var2, (C15601d<? super C8541b>) null), 3, (Object) null);
            }
        }
    }

    public void pause() {
        super.pause();
        disableRatation();
    }

    public final void preloadLive(long j, String str, Integer num, boolean z, boolean z2) {
        C59988k livingUIC;
        C65762c cVar;
        String str2;
        C50355m51 m512;
        C64311db1 db12;
        C50355m51 m513;
        C64311db1 db13;
        C50355m51 m514;
        C50355m51 m515;
        C50217l51 l512;
        C52294zq0 zq02;
        C50355m51 m516;
        long j2 = j;
        String str3 = str;
        Integer num2 = num;
        Class cls = C54991o.class;
        C60357c5 loadingTipWidget = getLoadingTipWidget();
        loadingTipWidget.f172074e.postDelayed(loadingTipWidget.f172084o, 500);
        C59988k livingUIC2 = getLivingUIC();
        if (livingUIC2 != null) {
            Class cls2 = C55001u.class;
            C54991o oVar = (C54991o) livingUIC2.mo83051g(cls);
            C65762c cVar2 = livingUIC2.f166848f;
            oVar.f154364s2 = (cVar2 != null && cVar2.getAudienPreloadCDNLiveConfig()) && !Util.isNullOrNil(str) && num2 != null && num.intValue() == 1;
            String str4 = livingUIC2.f171222i;
            StringBuilder sb = new StringBuilder();
            sb.append("checkPreloadLive:");
            sb.append(((C54991o) livingUIC2.mo83051g(cls)).f154364s2);
            sb.append(",config:");
            C65762c cVar3 = livingUIC2.f166848f;
            sb.append(cVar3 != null ? Boolean.valueOf(cVar3.getAudienPreloadCDNLiveConfig()) : null);
            sb.append(", enablePreloadLive streamUrl:");
            sb.append(str3);
            sb.append(" audienMode:");
            sb.append(num2);
            Log.m105924i(str4, sb.toString());
            boolean z3 = ((C54991o) livingUIC2.mo83051g(cls)).f154364s2;
            boolean t = livingUIC2.mo84896t(j2);
            boolean u = C61926c.m72696u(((C54991o) livingUIC2.mo83051g(cls)).f154354q, 256);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("preloadLive ");
            sb4.append(j2);
            sb4.append(" enablePreload:");
            sb4.append(z3);
            sb4.append(",canPreload:");
            sb4.append(t);
            sb4.append(", mute:");
            sb4.append(z);
            sb4.append(", preloadLive:");
            sb4.append(((C54991o) livingUIC2.mo83051g(cls)).f154364s2);
            sb4.append(" isAudioMode:");
            sb4.append(u);
            sb4.append(", streamUrl:");
            sb4.append(str3);
            sb4.append(", liveSdkInfo is empty:");
            sb4.append(((C55001u) livingUIC2.mo83051g(cls2)).f154419p == null);
            Log.m105924i(livingUIC2.f171222i, sb4.toString());
            C63329b bVar = C63329b.f179694a;
            String str5 = livingUIC2.f171222i;
            bVar.mo88233d(str5, "preloadLive enablePreload:" + z3 + ",canPreload:" + t + ' ' + ((C55001u) livingUIC2.mo83051g(cls2)).mo76038i3());
            if (!z3 || !t) {
                C54101n0 n0Var = C54101n0.f151856a;
                n0Var.mo74799f("enter_" + z3 + '_' + t, j2, ((C55001u) livingUIC2.mo83051g(cls2)).f154425v);
            } else {
                if (str3 == null) {
                    str3 = "";
                }
                C53895h.m60468f((C66212f) null, new C60033t3(livingUIC2.mo84895s(j2, str3, num2 != null ? num.intValue() : 1), livingUIC2, z, u, (C15601d<? super C60033t3>) null), 1, (Object) null);
                C65762c cVar4 = livingUIC2.f166848f;
                if (cVar4 != null) {
                    C56032b.hideLoadingLayer$default(cVar4, false, 1, (Object) null);
                }
            }
        }
        C59988k livingUIC3 = getLivingUIC();
        if (livingUIC3 != null) {
            Class cls3 = C0702z0.class;
            FinderLiveService.f159376d.getClass();
            C54129i iVar = FinderLiveService.f159398z;
            if (iVar == null || (m516 = iVar.f151995j) == null) {
                str2 = null;
            } else {
                C54991o oVar2 = (C54991o) livingUIC3.mo83051g(cls);
                C50217l51 l513 = m516.f137842d;
                oVar2.f154328j = l513 != null ? l513.f137181d : null;
                ((C54991o) livingUIC3.mo83051g(cls)).f154252S0 = m516.f137843e;
                ((C54991o) livingUIC3.mo83051g(cls)).f154368t2 = m516.f137844f;
                C54843w3 w3Var = C54843w3.f153747a;
                w3Var.mo75792g(livingUIC3.f166851d);
                str2 = null;
                w3Var.mo75793h(livingUIC3.f166851d, (String) null);
                w3Var.mo75788c(livingUIC3.f166851d);
                List<C0581o5> list = ((C0702z0) livingUIC3.mo83051g(cls3)).f1672f;
                C87412m.m108593f(list, "business(LiveMsgSlice::class.java).msgList");
                if (!list.isEmpty()) {
                    C12322e5 e5Var = livingUIC3.f171250x;
                    if (e5Var != null) {
                        e5Var.mo10792g(0);
                    }
                    C12322e5 e5Var2 = livingUIC3.f171250x;
                    if (e5Var2 != null) {
                        List<C0581o5> list2 = ((C0702z0) livingUIC3.mo83051g(cls3)).f1672f;
                        C87412m.m108593f(list2, "business(LiveMsgSlice::class.java).msgList");
                        C12322e5.m11877s1(e5Var2, list2, false, false, 4, (Object) null);
                    }
                }
            }
            String str6 = livingUIC3.f171222i;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("lawTip:");
            C54129i iVar2 = FinderLiveService.f159398z;
            sb5.append((iVar2 == null || (m515 = iVar2.f151995j) == null || (l512 = m515.f137842d) == null || (zq02 = l512.f137181d) == null) ? str2 : zq02.f146179d);
            sb5.append(" welcomeTip:");
            C54129i iVar3 = FinderLiveService.f159398z;
            sb5.append((iVar3 == null || (m514 = iVar3.f151995j) == null) ? str2 : m514.f137843e);
            sb5.append(" location:");
            C54129i iVar4 = FinderLiveService.f159398z;
            sb5.append((iVar4 == null || (m513 = iVar4.f151995j) == null || (db13 = m513.f137844f) == null) ? str2 : db13.f182663f);
            sb5.append('.');
            C54129i iVar5 = FinderLiveService.f159398z;
            sb5.append((iVar5 == null || (m512 = iVar5.f151995j) == null || (db12 = m512.f137844f) == null) ? str2 : db12.f182664g);
            sb5.append(" msgList.size:");
            sb5.append(((C0702z0) livingUIC3.mo83051g(cls3)).f1672f.size());
            sb5.append(" commentPlugin:");
            sb5.append(livingUIC3.f171250x);
            Log.m105924i(str6, sb5.toString());
        }
        if (z2 && (livingUIC = getLivingUIC()) != null && (cVar = livingUIC.f166848f) != null) {
            View findViewById = cVar.findViewById(C0966R.C0970id.e1u);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC", "enterLiveAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC", "enterLiveAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById.post(new C8582s(findViewById));
            View findViewById2 = cVar.findViewById(C0966R.C0970id.e16);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(Float.valueOf(0.0f));
            C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC", "enterLiveAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
            C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC", "enterLiveAnim", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            findViewById2.post(new C60030t(findViewById2));
            C62833je jeVar = livingUIC.f171242t;
            if (jeVar != null) {
                jeVar.mo87800Z0();
            }
        }
    }

    public final boolean preloadNextLive(long j, String str, Integer num) {
        C59988k livingUIC;
        if (!(num == null || num.intValue() != 1 || (livingUIC = getLivingUIC()) == null)) {
            Class cls = C55001u.class;
            if (livingUIC.mo84896t(j)) {
                StringBuilder sb = new StringBuilder();
                sb.append("preloadNextLive, liveId:");
                sb.append(j);
                sb.append(", streamUrl:");
                sb.append(str);
                sb.append(", liveSdkInfo is empty:");
                sb.append(((C55001u) livingUIC.mo83051g(cls)).f154419p == null);
                Log.m105924i(livingUIC.f171222i, sb.toString());
                C63329b bVar = C63329b.f179694a;
                String str2 = livingUIC.f171222i;
                bVar.mo88233d(str2, "preloadNextLive " + ((C55001u) livingUIC.mo83051g(cls)).mo76038i3());
                if (str == null) {
                    str = "";
                }
                C62193a.f176816k1.mo87261b(livingUIC.mo84895s(j, str, num.intValue()).f166232b);
                C62042e.f176370a.mo87064a2(false, false);
                C59988k.m69862z(livingUIC, false, true, 1, (Object) null);
                C65762c cVar = livingUIC.f166848f;
                if (cVar != null) {
                    C58124b.C7172a.m7372a(cVar, C58124b.C58125b.FINDER_LIVE_PRELOAD_LIVE, (Bundle) null, 2, (Object) null);
                }
                C65762c cVar2 = livingUIC.f166848f;
                if (cVar2 == null) {
                    return true;
                }
                C56032b.hideLoadingLayer$default(cVar2, false, 1, (Object) null);
                return true;
            }
            Log.m105924i(livingUIC.f171222i, "preloadNextLive can't preload!");
            C54101n0.f151856a.mo74799f("scroll", j, ((C55001u) livingUIC.mo83051g(cls)).f154425v);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.f172989A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r15 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            p50.e r1 = r15.getLiveCore()
            r2 = 0
            if (r1 == 0) goto L_0x0012
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x0012
            boolean r1 = r1.mo82888j()
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            java.lang.String r3 = r15.TAG
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "release liveId:"
            r4.append(r5)
            al1.h r5 = r15.getData()
            com.tencent.mm.live.api.LiveConfig r5 = r5.f151977d
            long r5 = r5.f157064e
            r4.append(r5)
            java.lang.String r5 = ",isFloatMode:"
            r4.append(r5)
            p50.e r5 = r15.getLiveCore()
            r6 = 0
            if (r5 == 0) goto L_0x0043
            d50.i r5 = r5.f172989A
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo82881c()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            goto L_0x0044
        L_0x0043:
            r5 = r6
        L_0x0044:
            r4.append(r5)
            java.lang.String r5 = ",isSquareMode: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " ,miniWinPermission:"
            r4.append(r5)
            boolean r5 = r15.getMiniWinPermission()
            r4.append(r5)
            java.lang.String r5 = " finishActivityNotReleaseLive: "
            r4.append(r5)
            boolean r5 = r15.getFinishActivityNotReleaseLive()
            r4.append(r5)
            java.lang.String r5 = ",releaseUIKeepData: "
            r4.append(r5)
            androidx.lifecycle.i0 r5 = r15.business(r0)
            cl1.o r5 = (cl1.C54991o) r5
            boolean r5 = r5.f154334k3
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            hl1.k r3 = r15.getLivingUIC()
            if (r3 == 0) goto L_0x008d
            r3.f171183R1 = r6
            r3.f171186S1 = r2
            com.tencent.mm.sdk.platformtools.MTimerHandler r3 = r3.f171201X1
            r3.stopTimer()
        L_0x008d:
            r15.getLiveEndUIC()
            y50.k r3 = y50.C53496k.f150436a
            r3.mo74173f()
            cj1.i5 r3 = cj1.C54773i5.f153520a
            r3.mo75679b()
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r4 = 3736(0xe98, float:5.235E-42)
            r3.mo123470p(r4, r15)
            f40.g r3 = f40.C86709a0.m107529k()
            ob0.b0 r3 = r3.f251779b
            r4 = 3867(0xf1b, float:5.419E-42)
            r3.mo123470p(r4, r15)
            android.view.ViewGroup r3 = r15.getParent()
            if (r3 == 0) goto L_0x00b9
            r3.removeView(r15)
        L_0x00b9:
            if (r1 != 0) goto L_0x0131
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            boolean r1 = r7.mo77644r()
            if (r1 != 0) goto L_0x0131
            p50.e r1 = r15.getLiveCore()
            if (r1 == 0) goto L_0x00d5
            d50.i r1 = r1.f172989A
            if (r1 == 0) goto L_0x00d5
            boolean r1 = r1.mo82881c()
            if (r1 != 0) goto L_0x00d5
            r1 = 1
            goto L_0x00d6
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            if (r1 == 0) goto L_0x0131
            boolean r1 = r15.getMiniWinPermission()
            if (r1 != 0) goto L_0x0131
            boolean r1 = r15.getFinishActivityNotReleaseLive()
            if (r1 != 0) goto L_0x0131
            androidx.lifecycle.i0 r1 = r15.business(r0)
            cl1.o r1 = (cl1.C54991o) r1
            boolean r1 = r1.f154334k3
            if (r1 != 0) goto L_0x0131
            p50.e r1 = r15.getLiveCore()
            if (r1 == 0) goto L_0x00f7
            r1.mo85693l0()
        L_0x00f7:
            androidx.lifecycle.i0 r0 = r15.business(r0)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154355q1
            if (r0 != 0) goto L_0x0131
            r15.tryReportJoinLiveWaitResp()
            ij1.b r0 = ij1.C60299b.f171929a
            ij1.C60299b.f171936h = r6
            r15.disableRatation()
            al1.p r1 = al1.C54134p.f152045a
            r1.mo74957a(r6, r2)
            r0.mo85289e()
            y50.C66521k0.f191361a = r6
            p50.e r0 = r15.getLiveCore()
            if (r0 == 0) goto L_0x011e
            r0.mo85702u0()
        L_0x011e:
            r9 = 0
            boolean r10 = r15.getMiniWinPermission()
            r11 = 0
            boolean r12 = r15.getFinishActivityNotReleaseLive()
            r13 = 10
            r14 = 0
            java.lang.String r8 = "visitorRelease"
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63767I(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0131:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout.release():void");
    }

    public void resume() {
        C63170ze zeVar;
        C58924d c1;
        C62966ri riVar;
        super.resume();
        boolean z = false;
        if (!isManualClosed() && isLiveStarted() && !isLiveFinished()) {
            ((C54116w) C86312j.m106911c(C54116w.class)).Zx0(false, C54067f0.C54084t.LIVE_FLOAT_ACTION_MAXIMIZE);
        }
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            C47844c7 c7Var = livingUIC.f171212c1;
            if (c7Var != null) {
                c7Var.onResume();
            }
            C62647ba baVar = livingUIC.f171185S0;
            if (baVar != null) {
                baVar.onResume();
            }
            C62647ba baVar2 = livingUIC.f171188T0;
            if (baVar2 != null) {
                baVar2.onResume();
            }
            C60085d dVar = livingUIC.f171245u1;
            if (dVar != null && dVar.mo84950b1() && dVar.mo84949a1() > 0) {
                C60084c cVar = new C60084c(dVar, ((long) dVar.mo84949a1()) * 1000);
                dVar.f171455w = cVar;
                cVar.start();
            }
            ((C66636e) livingUIC.mo83051g(C66636e.class)).mo90686c3();
            C62712dd ddVar = livingUIC.f171171M;
            if (!(ddVar == null || (riVar = ddVar.f178065u) == null)) {
                riVar.onResume();
            }
            if (!(!C85875k4.m106157N() || (zeVar = livingUIC.f171224j) == null || (c1 = zeVar.mo88091c1()) == null)) {
                C62042e eVar = C62042e.f176370a;
                C45795b bVar = livingUIC.f166851d;
                C65762c cVar2 = livingUIC.f166848f;
                c1.setRenderMode(eVar.mo87123v0(bVar, cVar2 != null ? cVar2.isLandscape() : false, livingUIC.f171186S1));
            }
            C12282d7 d7Var = livingUIC.f171199X;
            if (d7Var != null) {
                if (d7Var.f166287d.isShown() && d7Var.f35420u.isShown()) {
                    Map<String, C8916d> map = C0639y1.f1519j;
                    C87412m.m108593f(map, "FinderLiveGiftLoader.pkgGiftCache");
                    if (!map.isEmpty()) {
                        FinderLiveGiftTagView finderLiveGiftTagView = d7Var.f35420u;
                        if (finderLiveGiftTagView.f15188j == finderLiveGiftTagView.getRv().getChildCount() - 1) {
                            z = true;
                        }
                        if (z) {
                            d7Var.mo11984c1("onResume");
                        }
                    }
                }
                if (d7Var.f35426y0) {
                    d7Var.f166287d.post(new C12499l7(d7Var));
                }
            }
        }
    }

    public void showBlurBgWithTimeCount(String str, String str2) {
        C87412m.m108594g(str, "username");
        C87412m.m108594g(str2, "tip");
        tryReportPause();
        super.showBlurBgWithTimeCount(str, str2);
    }

    public final void showFinderNewGuide(boolean z) {
        View view;
        View view2;
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            String str = livingUIC.f171222i;
            Log.m105924i(str, "#showFinderNewGuide isHistoryGuide=" + z);
            if (z) {
                int intValue = C32444a.f86091Q.mo60266n().intValue();
                C58739j4.f168176a.getClass();
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_REAL_HISTORY_GUIDE_BOOLEAN_SYNC, Boolean.FALSE);
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) f).booleanValue();
                String str2 = livingUIC.f171222i;
                Log.m105924i(str2, "#showFinderNewGuide, isEnable=" + intValue + ", wasShowed=" + booleanValue);
                if (intValue == 1 && !booleanValue && (view2 = (View) ((C36570n) livingUIC.f171215d2).getValue()) != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC", "showFinderNewGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC", "showFinderNewGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            int intValue2 = C32444a.f86088P.mo60266n().intValue();
            C58739j4.f168176a.getClass();
            Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_HAS_SHOW_LIVE_GUIDE_SERVER_FLAG_BOOLEAN_SYNC, Boolean.FALSE);
            C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue2 = ((Boolean) f2).booleanValue();
            String str3 = livingUIC.f171222i;
            Log.m105924i(str3, "#showFinderNewGuide, isEnable=" + intValue2 + ", isHasShowFlag=" + booleanValue2);
            if (intValue2 == 1 && booleanValue2 && (view = (View) ((C36570n) livingUIC.f171213c2).getValue()) != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC", "showFinderNewGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/viewmodel/state/visitor/FinderLiveVisitorLivingUIC", "showFinderNewGuide", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void showFromSideBar() {
        for (C58121a aVar : getPluginList()) {
            if (aVar instanceof C62660c) {
                C56032b.Companion.getClass();
                String access$getTAG$cp = C56032b.TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("showForSideBar ");
                sb.append(aVar.mo82894j0());
                sb.append(" screen switch, visibility:");
                sb.append(aVar.f166287d.getVisibility());
                sb.append(", cacheVisibility:");
                C62660c cVar = (C62660c) aVar;
                sb.append(cVar.f177938i);
                Log.m105924i(access$getTAG$cp, sb.toString());
                cVar.f177939j = 65535;
                aVar.mo10792g(cVar.f177938i);
                cVar.mo12076I0(false);
            }
        }
        LiveRoomControllerStore liveRoomControllerStore = getData().f151979f;
        C87412m.m108594g(liveRoomControllerStore, "<this>");
        C59447j.f169870a.mo84557i(liveRoomControllerStore, new C59460w(liveRoomControllerStore));
    }

    public void start() {
        super.start();
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            livingUIC.mo84883R();
            livingUIC.mo84884S();
            C64039c cVar = livingUIC.f171194V0;
            if (cVar != null) {
                cVar.mo88787a1();
            }
            C65762c cVar2 = livingUIC.f166848f;
            if (cVar2 != null) {
                C58124b.C7172a.m7372a(cVar2, C58124b.C58125b.MINI_WINDOW_DISMISS, (Bundle) null, 2, (Object) null);
            }
            C65762c cVar3 = livingUIC.f166848f;
            if (cVar3 != null) {
                cVar3.setCheckMiniWin(true);
            }
        }
        getLivePrepareUIC();
        getLiveEndUIC();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02de, code lost:
        if (r6 == false) goto L_0x02e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0821, code lost:
        r0 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0864, code lost:
        if (r6 != false) goto L_0x0866;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a51, code lost:
        r0 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04ac  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void statusChange(d60.C58124b.C58125b r26, android.os.Bundle r27) {
        /*
            r25 = this;
            r1 = r25
            r0 = r26
            r2 = r27
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            java.lang.String r5 = "status"
            gy3.C87412m.m108594g(r0, r5)
            d60.b$b[] r5 = r1.skipStatus
            boolean r5 = sx3.C110823p.m151009y(r5, r0)
            r6 = 0
            java.lang.String r7 = "statusChange "
            r8 = 32
            if (r5 == 0) goto L_0x0070
            qt1.b r5 = qt1.C63329b.f179694a
            java.lang.String r9 = r1.TAG
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r0)
            r10.append(r8)
            java.lang.String r7 = r26.name()
            r10.append(r7)
            r10.append(r8)
            r10.append(r2)
            java.lang.String r7 = r10.toString()
            java.lang.String r10 = "tag"
            gy3.C87412m.m108594g(r9, r10)
            java.lang.String r10 = "msg"
            gy3.C87412m.m108594g(r7, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r9 = 58
            r10.append(r9)
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = r5.mo88230a()
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.lang.String r8 = "Finder.TooOftenLiveTracker"
            r5.mo88232c(r8, r7, r6)
            goto L_0x0096
        L_0x0070:
            qt1.b r5 = qt1.C63329b.f179694a
            java.lang.String r9 = r1.TAG
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r7)
            r10.append(r0)
            r10.append(r8)
            java.lang.String r7 = r26.name()
            r10.append(r7)
            r10.append(r8)
            r10.append(r2)
            java.lang.String r7 = r10.toString()
            r5.mo88233d(r9, r7)
        L_0x0096:
            super.statusChange(r26, r27)
            hl1.g r5 = r25.getLiveEndUIC()
            r7 = 2
            if (r5 == 0) goto L_0x0104
            int r8 = r26.ordinal()
            r9 = 8
            if (r8 == r9) goto L_0x00fe
            r9 = 27
            if (r8 == r9) goto L_0x00ad
            goto L_0x0104
        L_0x00ad:
            vk1.c r8 = r5.f166848f
            if (r8 != 0) goto L_0x00b2
            goto L_0x00b5
        L_0x00b2:
            r8.setMiniWinPermission(r6)
        L_0x00b5:
            qj1.xf r8 = r5.f171121i
            if (r8 != 0) goto L_0x00ba
            goto L_0x00c6
        L_0x00ba:
            if (r2 == 0) goto L_0x00c3
            java.lang.String r9 = "PARAM_KEY_LIVE_END_WITH_ANIMATION"
            boolean r9 = r2.getBoolean(r9)
            goto L_0x00c4
        L_0x00c3:
            r9 = 0
        L_0x00c4:
            r8.f36498M = r9
        L_0x00c6:
            androidx.lifecycle.i0 r8 = r5.mo83051g(r3)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.mo75997d4()
            if (r8 == 0) goto L_0x00ef
            ok1.e r9 = ok1.C62042e.f176370a
            androidx.lifecycle.i0 r8 = r5.mo83051g(r4)
            cl1.u r8 = (cl1.C55001u) r8
            te3.c21 r8 = r8.f154420q
            long r10 = r8.f182392d
            androidx.lifecycle.i0 r8 = r5.mo83051g(r3)
            cl1.o r8 = (cl1.C54991o) r8
            java.lang.String r12 = r8.f154345o
            r13 = 2
            r14 = 0
            r15 = 8
            r16 = 0
            ok1.C62042e.m72809u1(r9, r10, r12, r13, r14, r15, r16)
        L_0x00ef:
            cj1.r0 r8 = cj1.C54804r0.f153631a
            androidx.appcompat.app.AppCompatActivity r9 = r5.f166847e
            fj1.b r5 = r5.f166851d
            r8.mo75762c(r9, r5, r7)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r5 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r5.mo77646t()
            goto L_0x0104
        L_0x00fe:
            androidx.lifecycle.i0 r5 = r5.mo83051g(r4)
            cl1.u r5 = (cl1.C55001u) r5
        L_0x0104:
            hl1.k r5 = r25.getLivingUIC()
            if (r5 == 0) goto L_0x0a53
            java.lang.Class<cl1.j> r8 = cl1.C39975j.class
            java.lang.Class<ak1.w> r9 = ak1.C54116w.class
            java.lang.Class<cl1.z0> r10 = cl1.C0702z0.class
            java.lang.Class<cl1.d0> r11 = cl1.C54963d0.class
            int r0 = r26.ordinal()
            java.lang.String r12 = "PARAM_FINDER_LIVE_LINK_MIC_POSITION"
            r13 = 0
            r14 = 1
            switch(r0) {
                case 7: goto L_0x0957;
                case 8: goto L_0x091c;
                case 9: goto L_0x091c;
                case 21: goto L_0x08c5;
                case 24: goto L_0x083a;
                case 26: goto L_0x083a;
                case 27: goto L_0x0825;
                case 32: goto L_0x0821;
                case 33: goto L_0x0767;
                case 39: goto L_0x070b;
                case 64: goto L_0x06f6;
                case 67: goto L_0x059a;
                case 80: goto L_0x0546;
                case 118: goto L_0x04ff;
                case 124: goto L_0x04ec;
                case 129: goto L_0x04c7;
                case 132: goto L_0x0462;
                case 147: goto L_0x03da;
                case 151: goto L_0x03ce;
                case 158: goto L_0x03bd;
                case 163: goto L_0x033c;
                case 173: goto L_0x02f9;
                case 174: goto L_0x02a5;
                case 175: goto L_0x01a3;
                case 186: goto L_0x0180;
                case 187: goto L_0x015d;
                case 206: goto L_0x0154;
                case 207: goto L_0x011f;
                default: goto L_0x011d;
            }
        L_0x011d:
            goto L_0x0a51
        L_0x011f:
            qj1.ze r0 = r5.f171224j
            if (r0 == 0) goto L_0x0128
            r0.mo88095h1(r14)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0128:
            androidx.lifecycle.i0 r0 = r5.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154291a1
            r2 = 524288(0x80000, float:7.34684E-40)
            boolean r0 = o40.C61926c.m72696u(r0, r2)
            if (r0 != 0) goto L_0x0150
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0141
            r0.showBlurBg()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0141:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0150
            androidx.lifecycle.i0 r2 = r5.mo83051g(r3)
            cl1.o r2 = (cl1.C54991o) r2
            java.lang.String r2 = r2.f154345o
            r0.fillBlurBg(r2, r14)
        L_0x0150:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x0154:
            hl1.h r0 = hl1.C59977h.f171128a
            r0.mo84862c(r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x015d:
            lg1.h r0 = r5.f171209a2
            if (r0 == 0) goto L_0x0168
            int r0 = r0.mo14483f0()
            if (r0 != 0) goto L_0x0168
            r6 = 1
        L_0x0168:
            if (r6 == 0) goto L_0x016c
            goto L_0x0a53
        L_0x016c:
            qj1.e5 r0 = r5.f171250x
            if (r0 == 0) goto L_0x017c
            android.view.ViewGroup r2 = r0.f166287d
            if (r2 == 0) goto L_0x017c
            hl1.j3 r3 = new hl1.j3
            r3.<init>(r5, r0)
            r2.post(r3)
        L_0x017c:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x0180:
            lg1.h r0 = r5.f171209a2
            if (r0 == 0) goto L_0x018b
            int r0 = r0.mo14483f0()
            if (r0 != 0) goto L_0x018b
            r6 = 1
        L_0x018b:
            if (r6 == 0) goto L_0x018f
            goto L_0x0a53
        L_0x018f:
            qj1.e5 r0 = r5.f171250x
            if (r0 == 0) goto L_0x019f
            android.view.ViewGroup r2 = r0.f166287d
            if (r2 == 0) goto L_0x019f
            hl1.i3 r3 = new hl1.i3
            r3.<init>(r5, r0)
            r2.post(r3)
        L_0x019f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x01a3:
            java.lang.String r0 = r5.f171222i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "FINDER_LIVE_ANCHOR_PAUSE_RECOVERY size: "
            r2.append(r7)
            androidx.lifecycle.i0 r7 = r5.mo83051g(r11)
            cl1.d0 r7 = (cl1.C54963d0) r7
            java.util.List<al1.j> r7 = r7.f154074q
            int r7 = r7.size()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x01d6
            p50.e r0 = r0.getLiveCore()
            if (r0 == 0) goto L_0x01d6
            boolean r0 = r0.mo85682Z()
            if (r0 != r14) goto L_0x01d6
            goto L_0x01d7
        L_0x01d6:
            r14 = 0
        L_0x01d7:
            if (r14 != 0) goto L_0x02a1
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            boolean r2 = r0 instanceof p50.C62197e
            if (r2 == 0) goto L_0x01e7
            p50.e r0 = (p50.C62197e) r0
            goto L_0x01e8
        L_0x01e7:
            r0 = r13
        L_0x01e8:
            if (r0 == 0) goto L_0x01ef
            r0.mo87273O0(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x01ef:
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            boolean r2 = r0 instanceof p50.C62197e
            if (r2 == 0) goto L_0x01f8
            p50.e r0 = (p50.C62197e) r0
            goto L_0x01f9
        L_0x01f8:
            r0 = r13
        L_0x01f9:
            if (r0 == 0) goto L_0x020f
            fj1.b r2 = r5.f166851d
            androidx.lifecycle.i0 r2 = r2.mo71262a(r4)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r7 = r2.f182392d
            boolean r0 = r0.mo87264x(r7)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
        L_0x020f:
            fj1.b r0 = r5.f166851d
            androidx.lifecycle.i0 r0 = r0.mo71262a(r3)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75999e4()
            sk1.a r2 = sk1.C63947a.f181274a
            fj1.b r3 = r5.f166851d
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = r5.f171222i
            r4.append(r7)
            java.lang.String r7 = "_pause_recovery"
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            boolean r2 = r2.mo88733s(r3, r4)
            java.lang.String r3 = r5.f171222i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "FINDER_LIVE_ANCHOR_PAUSE_RECOVERY isPlaying:"
            r4.append(r7)
            r4.append(r13)
            java.lang.String r7 = ",isLiveStarted:"
            r4.append(r7)
            r4.append(r0)
            java.lang.String r7 = ",liveCanPlay:"
            r4.append(r7)
            r4.append(r2)
            r7 = 33
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = gy3.C87412m.m108589b(r13, r3)
            if (r3 != 0) goto L_0x029c
            if (r0 == 0) goto L_0x029c
            if (r2 == 0) goto L_0x029c
            qj1.ze r7 = r5.f171224j
            if (r7 == 0) goto L_0x029c
            r8 = 0
            ok1.e r0 = ok1.C62042e.f176370a
            com.tencent.rtmp.TXLivePlayConfig r9 = r0.mo87034Q()
            fj1.b r2 = r5.f166851d
            vk1.c r3 = r5.f166848f
            if (r3 == 0) goto L_0x028b
            boolean r3 = r3.isLandscape()
            goto L_0x028c
        L_0x028b:
            r3 = 0
        L_0x028c:
            r12 = 0
            int r10 = r0.mo87123v0(r2, r3, r6)
            r11 = 0
            hl1.m3 r13 = hl1.C8569m3.f27652d
            r14 = 9
            r15 = 0
            qj1.C63170ze.m74522g1(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x029c:
            hl1.h r0 = hl1.C59977h.f171128a
            r0.mo84861b(r5)
        L_0x02a1:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x02a5:
            java.lang.String r0 = r5.f171222i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "FINDER_LIVE_ANCHOR_PAUSE size "
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r5.mo83051g(r11)
            cl1.d0 r4 = (cl1.C54963d0) r4
            java.util.List<al1.j> r4 = r4.f154074q
            int r4 = r4.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r5.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.mo75996d3()
            if (r0 != r14) goto L_0x02e0
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x02de
            boolean r0 = r0.isInLinkMic()
            if (r0 != r14) goto L_0x02de
            r6 = 1
        L_0x02de:
            if (r6 != 0) goto L_0x02f5
        L_0x02e0:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            boolean r2 = r0 instanceof p50.C62197e
            if (r2 == 0) goto L_0x02ee
            r13 = r0
            p50.e r13 = (p50.C62197e) r13
        L_0x02ee:
            if (r13 == 0) goto L_0x02f5
            r13.mo87273O0(r14)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x02f5:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x02f9:
            if (r2 == 0) goto L_0x0302
            java.lang.String r0 = "PARAM_FINDER_LIVE_IS_MUTE_MIC"
            boolean r0 = r2.getBoolean(r0, r6)
            goto L_0x0303
        L_0x0302:
            r0 = 0
        L_0x0303:
            if (r2 == 0) goto L_0x030c
            java.lang.String r4 = "PARAM_FINDER_LIVE_IS_NEED_SET_MUTE_MIC"
            boolean r2 = r2.getBoolean(r4, r14)
            goto L_0x030d
        L_0x030c:
            r2 = 1
        L_0x030d:
            if (r2 == 0) goto L_0x0317
            androidx.lifecycle.i0 r2 = r5.mo83051g(r3)
            cl1.o r2 = (cl1.C54991o) r2
            r2.f154274W2 = r0
        L_0x0317:
            if (r0 == 0) goto L_0x0329
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0338
            p50.e r0 = r0.getLiveCore()
            if (r0 == 0) goto L_0x0338
            r0.mo85687d0(r14)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0338
        L_0x0329:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0338
            p50.e r0 = r0.getLiveCore()
            if (r0 == 0) goto L_0x0338
            r0.mo85687d0(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0338:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x033c:
            if (r2 == 0) goto L_0x0348
            java.lang.String r0 = "PARAM_FINDER_BOTTOM_TIP_SCENE"
            int r0 = r2.getInt(r0, r6)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x0348:
            java.lang.String r0 = r5.f171222i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "FINDER_LIVE_SHOW_BOTTOM_TIP_PANEL scene:"
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            if (r13 != 0) goto L_0x0361
            goto L_0x0387
        L_0x0361:
            int r0 = r13.intValue()
            if (r0 != 0) goto L_0x0387
            if (r2 == 0) goto L_0x036d
            int r6 = r2.getInt(r12, r6)
        L_0x036d:
            qj1.d4 r0 = r5.mo84867B()
            if (r0 == 0) goto L_0x03b9
            int r2 = r13.intValue()
            hl1.q3 r3 = new hl1.q3
            r3.<init>(r5)
            hl1.f3 r4 = new hl1.f3
            r4.<init>(r5, r6)
            r0.mo87714b1(r2, r3, r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x03b9
        L_0x0387:
            if (r13 != 0) goto L_0x038a
            goto L_0x0391
        L_0x038a:
            int r0 = r13.intValue()
            if (r0 != r7) goto L_0x0391
            goto L_0x039c
        L_0x0391:
            if (r13 != 0) goto L_0x0394
            goto L_0x039b
        L_0x0394:
            int r0 = r13.intValue()
            if (r0 != r14) goto L_0x039b
            goto L_0x039c
        L_0x039b:
            r14 = 0
        L_0x039c:
            if (r14 == 0) goto L_0x03b9
            qj1.d4 r0 = r5.mo84867B()
            if (r0 == 0) goto L_0x03b9
            if (r13 == 0) goto L_0x03aa
            int r6 = r13.intValue()
        L_0x03aa:
            hl1.g3 r2 = new hl1.g3
            r2.<init>(r5, r13)
            hl1.h3 r3 = new hl1.h3
            r3.<init>(r5, r13)
            r0.mo87714b1(r6, r2, r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x03b9:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x03bd:
            if (r2 == 0) goto L_0x03c3
            int r6 = r2.getInt(r12, r6)
        L_0x03c3:
            qj1.dg r0 = r5.f171228m1
            if (r0 == 0) goto L_0x0a53
            r0.mo87750c1(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x03ce:
            ij1.b r0 = ij1.C60299b.f171929a
            r0.mo85289e()
            r5.mo84878M()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x03da:
            if (r2 == 0) goto L_0x03e3
            java.lang.String r0 = "PARAM_FINDER_LIVE_LINK_MIC_TYPE"
            int r0 = r2.getInt(r0, r6)
            goto L_0x03e4
        L_0x03e3:
            r0 = 0
        L_0x03e4:
            if (r2 == 0) goto L_0x03ea
            int r6 = r2.getInt(r12, r6)
        L_0x03ea:
            te3.hx0 r2 = new te3.hx0
            r2.<init>()
            com.tencent.mm.protocal.protobuf.FinderContact r7 = new com.tencent.mm.protocal.protobuf.FinderContact
            r7.<init>()
            androidx.lifecycle.i0 r3 = r5.mo83051g(r3)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
            r7.username = r3
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r2.f134919d = r7
            cj1.n5 r13 = r5.mo83048k()
            if (r13 == 0) goto L_0x0442
            androidx.lifecycle.i0 r3 = r5.mo83051g(r4)
            cl1.u r3 = (cl1.C55001u) r3
            te3.c21 r3 = r3.f154420q
            long r14 = r3.f182392d
            androidx.lifecycle.i0 r3 = r5.mo83051g(r4)
            cl1.u r3 = (cl1.C55001u) r3
            long r7 = r3.f154416j
            androidx.lifecycle.i0 r3 = r5.mo83051g(r4)
            cl1.u r3 = (cl1.C55001u) r3
            java.lang.String r3 = r3.f154423t
            androidx.lifecycle.i0 r4 = r5.mo83051g(r4)
            cl1.u r4 = (cl1.C55001u) r4
            byte[] r4 = r4.f154417n
            r20 = 2
            hl1.n3 r9 = new hl1.n3
            r9.<init>(r5, r0)
            r16 = r7
            r18 = r3
            r19 = r4
            r21 = r2
            r22 = r0
            r23 = r6
            r24 = r9
            r13.mo75731e(r14, r16, r18, r19, r20, r21, r22, r23, r24)
        L_0x0442:
            java.lang.String r2 = r5.f171222i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "apply link mic type:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " seatPosition: "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x0a53
        L_0x0462:
            if (r2 == 0) goto L_0x0483
            java.lang.String r0 = "PARAM_FINDER_LIVE_ERROR_PAGE"
            byte[] r0 = r2.getByteArray(r0)
            if (r0 == 0) goto L_0x0483
            te3.ay0 r4 = new te3.ay0
            r4.<init>()
            r4.parseFrom(r0)     // Catch:{ all -> 0x0475 }
            goto L_0x0484
        L_0x0475:
            r0 = move-exception
            r4 = r0
            java.lang.String r0 = r5.f171222i
            java.lang.Object[] r7 = new java.lang.Object[r14]
            r7[r6] = r4
            java.lang.String r4 = "statusChange:"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r7)
        L_0x0483:
            r4 = r13
        L_0x0484:
            if (r2 == 0) goto L_0x048d
            java.lang.String r0 = "PARAM_FINDER_LIVE_ERROR_CODE"
            int r0 = r2.getInt(r0)
            goto L_0x048e
        L_0x048d:
            r0 = 0
        L_0x048e:
            vk1.c r2 = r5.f166848f
            if (r2 == 0) goto L_0x0497
            r2.forceScreenToPortrait()
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0497:
            cj1.i5 r2 = cj1.C54773i5.f153520a
            r2.mo75679b()
            vk1.c r2 = r5.f166848f
            if (r2 == 0) goto L_0x04a5
            com.tencent.p014mm.plugin.finder.live.view.C56032b.hideLoadingLayer$default(r2, r6, r14, r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x04a5:
            r5.mo84870E()
            qj1.sg r2 = r5.f171196W
            if (r2 == 0) goto L_0x04b9
            androidx.lifecycle.i0 r3 = r5.mo83051g(r3)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
            r2.mo87918a1(r3, r4, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04b9:
            qj1.sg r0 = r5.f171196W
            if (r0 == 0) goto L_0x04c2
            r0.mo10792g(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04c2:
            r5.mo84866A()
            goto L_0x0a51
        L_0x04c7:
            if (r2 == 0) goto L_0x0a53
            java.lang.String r0 = "PARAM_FINDER_LIVE_TOP_COMMENT"
            byte[] r0 = r2.getByteArray(r0)
            if (r0 == 0) goto L_0x0a53
            te3.r41 r2 = new te3.r41
            r2.<init>()
            r2.parseFrom(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r2)
            qj1.mf r2 = r5.f171234p0
            if (r2 == 0) goto L_0x0a53
            r2.mo12155e1(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x04ec:
            if (r2 == 0) goto L_0x04f4
            java.lang.String r0 = "PARAM_FINDER_LIVE_SCREEN_CLEAR"
            boolean r6 = r2.getBoolean(r0)
        L_0x04f4:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0a53
            r0.onScreenClear(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x04ff:
            androidx.lifecycle.i0 r0 = r5.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154281Y
            if (r0 == 0) goto L_0x0514
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0514
            d60.b$b r2 = d60.C58124b.C58125b.LIVE_HAS_FINISHED
            d60.C58124b.C7172a.m7372a(r0, r2, r13, r7, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0514:
            qj1.dg r0 = r5.f171228m1
            if (r0 == 0) goto L_0x051d
            r0.mo87749b1(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x051d:
            qj1.di r0 = r5.f171164I1
            if (r0 == 0) goto L_0x0533
            int r2 = r0.mo14483f0()
            if (r2 != 0) goto L_0x0531
            android.view.ViewGroup r2 = r0.f166287d
            qj1.ei r3 = new qj1.ei
            r3.<init>(r0)
            r2.post(r3)
        L_0x0531:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0533:
            qj1.sf r0 = r5.f171179Q0
            if (r0 == 0) goto L_0x0a53
            qj1.ze r2 = r5.f171224j
            if (r2 == 0) goto L_0x053f
            com.tencent.rtmp.ui.TXCloudVideoView r13 = r2.mo88092d1()
        L_0x053f:
            r0.mo87913a1(r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x0546:
            qj1.fa r0 = r5.f171235p1
            if (r0 == 0) goto L_0x0552
            int r0 = r0.mo14483f0()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x0552:
            if (r2 == 0) goto L_0x055b
            java.lang.String r0 = "PARAM_FINDER_LIVE_MEMBER_LIST_AUTOREFRESH_VALUE"
            int r0 = r2.getInt(r0)
            goto L_0x055c
        L_0x055b:
            r0 = 0
        L_0x055c:
            java.lang.String r2 = r5.f171222i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "FINDER_LIVE_MEMBERS_AUTO_REFRESH memberListPluginVisibility:"
            r3.append(r4)
            r3.append(r13)
            java.lang.String r4 = ", delayTime:"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            qj1.fa r2 = r5.f171235p1
            if (r2 == 0) goto L_0x0585
            int r2 = r2.mo14483f0()
            if (r2 != 0) goto L_0x0585
            r6 = 1
        L_0x0585:
            if (r6 == 0) goto L_0x0596
            if (r0 < 0) goto L_0x0596
            zt3.t r2 = zt3.C119157j.f356862d
            hl1.p3 r3 = new hl1.p3
            r3.<init>(r5)
            long r4 = (long) r0
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183878i(r3, r4)
        L_0x0596:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x059a:
            java.lang.String r0 = r5.f171222i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "param:"
            r4.append(r8)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            androidx.lifecycle.i0 r0 = r5.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            if (r2 == 0) goto L_0x05bf
            java.lang.String r4 = "EVT_PARAM1"
            int r4 = r2.getInt(r4)
            goto L_0x05c0
        L_0x05bf:
            r4 = 0
        L_0x05c0:
            r0.f154335l1 = r4
            androidx.lifecycle.i0 r0 = r5.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            if (r2 == 0) goto L_0x05d1
            java.lang.String r4 = "EVT_PARAM2"
            int r2 = r2.getInt(r4)
            goto L_0x05d2
        L_0x05d1:
            r2 = 0
        L_0x05d2:
            r0.f154338m1 = r2
            qj1.ze r0 = r5.f171224j
            if (r0 == 0) goto L_0x0618
            f50.d r0 = r0.mo88091c1()
            if (r0 == 0) goto L_0x0618
            boolean r2 = r5.mo84872G()
            if (r2 != 0) goto L_0x0612
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            j50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r2 == 0) goto L_0x05f9
            d50.i r2 = r2.f172989A
            if (r2 == 0) goto L_0x05f9
            boolean r2 = r2.mo82888j()
            if (r2 != r14) goto L_0x05f9
            r2 = 1
            goto L_0x05fa
        L_0x05f9:
            r2 = 0
        L_0x05fa:
            if (r2 == 0) goto L_0x05fd
            goto L_0x0612
        L_0x05fd:
            ok1.e r2 = ok1.C62042e.f176370a
            fj1.b r4 = r5.f166851d
            vk1.c r8 = r5.f166848f
            if (r8 == 0) goto L_0x060a
            boolean r8 = r8.isLandscape()
            goto L_0x060b
        L_0x060a:
            r8 = 0
        L_0x060b:
            boolean r9 = r5.f171186S1
            int r2 = r2.mo87123v0(r4, r8, r9)
            goto L_0x0613
        L_0x0612:
            r2 = 0
        L_0x0613:
            r0.setRenderMode(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0618:
            java.lang.String r0 = r5.f171222i
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "LIVE_STATUS_RESOLUTION videoWidth:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r5.mo83051g(r3)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.f154335l1
            r2.append(r4)
            java.lang.String r4 = ",videoHeight:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r5.mo83051g(r3)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.f154338m1
            r2.append(r4)
            java.lang.String r4 = ", audienceMode:"
            r2.append(r4)
            androidx.lifecycle.i0 r4 = r5.mo83051g(r3)
            cl1.o r4 = (cl1.C54991o) r4
            int r4 = r4.mo75996d3()
            r2.append(r4)
            java.lang.String r4 = ", renderMode:"
            r2.append(r4)
            ok1.e r15 = ok1.C62042e.f176370a
            fj1.b r4 = r5.f166851d
            vk1.c r8 = r5.f166848f
            if (r8 == 0) goto L_0x0665
            boolean r8 = r8.isLandscape()
            r17 = r8
            goto L_0x0667
        L_0x0665:
            r17 = 0
        L_0x0667:
            r18 = 0
            r19 = 4
            r20 = 0
            r16 = r4
            int r4 = ok1.C62042e.m72810w0(r15, r16, r17, r18, r19, r20)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            androidx.lifecycle.i0 r0 = r5.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75993b4()
            if (r0 != 0) goto L_0x06af
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0694
            d60.b$b r2 = d60.C58124b.C58125b.FINDER_LIVE_LINK_MIC_REMOVE_BOTTOM_BAR
            d60.C58124b.C7172a.m7372a(r0, r2, r13, r7, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0694:
            qj1.dg r0 = r5.f171228m1
            if (r0 == 0) goto L_0x069d
            r0.mo87748a1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x069d:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r15 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r16 = 3
            org.json.JSONObject r17 = new org.json.JSONObject
            r17.<init>()
            r18 = 0
            r19 = 4
            r20 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r15, r16, r17, r18, r19, r20)
        L_0x06af:
            androidx.lifecycle.i0 r0 = r5.mo83051g(r11)
            cl1.d0 r0 = (cl1.C54963d0) r0
            boolean r0 = r0.f154053G
            if (r0 != 0) goto L_0x06ee
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x06c2
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyAudienceMicUserChange$default(r0, r6, r14, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06c2:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x06cb
            com.tencent.p014mm.plugin.finder.live.view.C56032b.notifyPKMicUserChange$default(r0, r6, r14, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06cb:
            androidx.lifecycle.i0 r0 = r5.mo83051g(r11)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 == 0) goto L_0x06e0
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8 = 1
            r9 = 0
            r10 = 0
            r11 = 6
            r12 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r7, r8, r9, r10, r11, r12)
            goto L_0x06ee
        L_0x06e0:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r14 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r15 = 2
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63769b0(r14, r15, r16, r17, r18, r19)
        L_0x06ee:
            r0 = 3
            hl1.C59988k.m69861q(r5, r13, r6, r0, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x06f6:
            vk1.c r0 = r5.f166848f
            if (r0 != 0) goto L_0x06fb
            goto L_0x06fe
        L_0x06fb:
            r0.setManualClosed(r14)
        L_0x06fe:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0a53
            d60.b$b r2 = d60.C58124b.C58125b.CLOSE_LIVE
            d60.C58124b.C7172a.m7372a(r0, r2, r13, r7, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x070b:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0717
            boolean r0 = r0.isLandscape()
            if (r0 != 0) goto L_0x0717
            r0 = 1
            goto L_0x0718
        L_0x0717:
            r0 = 0
        L_0x0718:
            if (r0 == 0) goto L_0x073c
            lg1.h r0 = r5.f171209a2
            if (r0 == 0) goto L_0x0725
            int r0 = r0.mo14483f0()
            if (r0 != 0) goto L_0x0725
            goto L_0x0726
        L_0x0725:
            r14 = 0
        L_0x0726:
            if (r14 == 0) goto L_0x072c
            r5.mo84893p(r2)
            goto L_0x073c
        L_0x072c:
            qj1.e5 r0 = r5.f171250x
            if (r0 == 0) goto L_0x073c
            android.view.ViewGroup r3 = r0.f166287d
            if (r3 == 0) goto L_0x073c
            hl1.l3 r4 = new hl1.l3
            r4.<init>(r2, r5, r0)
            r3.post(r4)
        L_0x073c:
            if (r2 == 0) goto L_0x0744
            java.lang.String r0 = "PARAM_IS_ENTERING_COMMENT"
            boolean r6 = r2.getBoolean(r0)
        L_0x0744:
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r5.f166847e
            bl3.r$a r0 = r0.mo62444c(r2)
            java.lang.Class<dk1.g> r2 = dk1.C58312g.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r2)
            dk1.g r0 = (dk1.C58312g) r0
            com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r0 = r0.f166968f
            if (r0 == 0) goto L_0x0a53
            java.lang.String r2 = "ENTERING_COMMENT"
            if (r6 == 0) goto L_0x0760
            r0.mo77734a(r2)
            goto L_0x0763
        L_0x0760:
            r0.mo77738e(r2)
        L_0x0763:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x0767:
            androidx.lifecycle.i0 r0 = r5.mo83051g(r10)
            cl1.z0 r0 = (cl1.C0702z0) r0
            java.util.List<cj1.o5> r0 = r0.f1672f
            java.lang.String r2 = "business(LiveMsgSlice::class.java).msgList"
            gy3.C87412m.m108593f(r0, r2)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r14
            if (r0 == 0) goto L_0x0821
            ok1.e r0 = ok1.C62042e.f176370a
            vk1.c r4 = r5.f166848f
            if (r4 == 0) goto L_0x0790
            fj1.b r4 = r4.getBuContext()
            if (r4 == 0) goto L_0x0790
            androidx.lifecycle.i0 r4 = r4.mo71262a(r3)
            cl1.o r4 = (cl1.C54991o) r4
            java.util.LinkedList<te3.aw0> r4 = r4.f154320h
            goto L_0x0791
        L_0x0790:
            r4 = r13
        L_0x0791:
            int r4 = r0.mo87023M(r4)
            vk1.c r7 = r5.f166848f
            if (r7 == 0) goto L_0x07a7
            fj1.b r7 = r7.getBuContext()
            if (r7 == 0) goto L_0x07a7
            androidx.lifecycle.i0 r3 = r7.mo71262a(r3)
            cl1.o r3 = (cl1.C54991o) r3
            java.util.LinkedList<te3.aw0> r13 = r3.f154320h
        L_0x07a7:
            java.lang.String r18 = r0.mo87026N(r13)
            di3.d r0 = di3.C86312j.m106911c(r9)
            r15 = r0
            ak1.w r15 = (ak1.C54116w) r15
            androidx.lifecycle.i0 r0 = r5.mo83051g(r10)
            cl1.z0 r0 = (cl1.C0702z0) r0
            java.util.List<cj1.o5> r0 = r0.f1672f
            gy3.C87412m.m108593f(r0, r2)
            java.lang.Object r0 = sx3.C110818d0.m150923U(r0)
            cj1.o5 r0 = (cj1.C0581o5) r0
            java.lang.String r16 = r0.getContent()
            java.lang.String r0 = ""
            if (r4 <= 0) goto L_0x07df
            androidx.appcompat.app.AppCompatActivity r3 = r5.f166847e
            r7 = 2131828165(0x7f111dc5, float:1.9289263E38)
            java.lang.Object[] r9 = new java.lang.Object[r14]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9[r6] = r4
            java.lang.String r3 = r3.getString(r7, r9)
            r17 = r3
            goto L_0x07e1
        L_0x07df:
            r17 = r0
        L_0x07e1:
            androidx.lifecycle.i0 r3 = r5.mo83051g(r10)
            cl1.z0 r3 = (cl1.C0702z0) r3
            java.util.List<cj1.o5> r3 = r3.f1672f
            gy3.C87412m.m108593f(r3, r2)
            java.lang.Object r2 = sx3.C110818d0.m150923U(r3)
            cj1.o5 r2 = (cj1.C0581o5) r2
            int r2 = r2.getType()
            java.lang.Integer r19 = java.lang.Integer.valueOf(r2)
            androidx.lifecycle.i0 r2 = r5.mo83051g(r8)
            cl1.j r2 = (cl1.C39975j) r2
            boolean r20 = r2.mo62578e3()
            androidx.lifecycle.i0 r2 = r5.mo83051g(r8)
            cl1.j r2 = (cl1.C39975j) r2
            androidx.lifecycle.z<te3.lw0> r2 = r2.f107170j
            java.lang.Object r2 = r2.getValue()
            te3.lw0 r2 = (te3.C50317lw0) r2
            if (r2 == 0) goto L_0x081c
            java.lang.String r2 = r2.f137677e
            if (r2 != 0) goto L_0x0819
            goto L_0x081c
        L_0x0819:
            r21 = r2
            goto L_0x081e
        L_0x081c:
            r21 = r0
        L_0x081e:
            r15.yy0(r16, r17, r18, r19, r20, r21)
        L_0x0821:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x0825:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0a53
            java.lang.Class<fh1.a> r2 = fh1.C58989a.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r0.getController(r2)
            fh1.a r0 = (fh1.C58989a) r0
            if (r0 == 0) goto L_0x0a53
            r0.mo84225o3()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x083a:
            androidx.appcompat.app.AppCompatActivity r0 = r5.f166847e
            boolean r2 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x0843
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            goto L_0x0844
        L_0x0843:
            r0 = r13
        L_0x0844:
            if (r0 == 0) goto L_0x084e
            boolean r0 = r0.isFinishing()
            if (r0 != r14) goto L_0x084e
            r0 = 1
            goto L_0x084f
        L_0x084e:
            r0 = 0
        L_0x084f:
            if (r0 != 0) goto L_0x0866
            androidx.appcompat.app.AppCompatActivity r0 = r5.f166847e
            boolean r2 = r0 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r2 == 0) goto L_0x085a
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            goto L_0x085b
        L_0x085a:
            r0 = r13
        L_0x085b:
            if (r0 == 0) goto L_0x0864
            boolean r0 = r0.isDestroyed()
            if (r0 != r14) goto L_0x0864
            r6 = 1
        L_0x0864:
            if (r6 == 0) goto L_0x08c1
        L_0x0866:
            di3.d r0 = di3.C86312j.m106911c(r9)
            ak1.w r0 = (ak1.C54116w) r0
            ak1.f0$q0 r2 = ak1.C54067f0.C54079q0.CloseTypeFloat
            r0.Gy0(r2)
            di3.d r0 = di3.C86312j.m106911c(r9)
            java.lang.String r3 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r3)
            r14 = r0
            ak1.w r14 = (ak1.C54116w) r14
            androidx.appcompat.app.AppCompatActivity r15 = r5.f166847e
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            al1.i r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r3 == 0) goto L_0x088a
            android.os.Bundle r13 = r3.f151996k
        L_0x088a:
            r17 = r13
            r3 = 0
            r19 = 8
            r4 = 0
            r18 = 0
            r20 = 0
            r16 = r2
            ak1.C54116w.wy0(r14, r15, r16, r17, r18, r19, r20)
            r19 = 0
            r21 = 0
            r22 = 30
            r23 = 0
            java.lang.String r17 = "visitorEnd"
            r16 = r0
            r18 = r3
            r20 = r4
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63767I(r16, r17, r18, r19, r20, r21, r22, r23)
            p50.a$a r0 = p50.C62193a.f176816k1
            r0.mo87260a()
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x08c1
            p50.e r0 = r0.getLiveCore()
            if (r0 == 0) goto L_0x08c1
            r0.mo85693l0()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x08c1:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x08c5:
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            if (r2 == 0) goto L_0x08d6
            java.lang.String r3 = "PARAM_FINDER_LIVE_FORCE_TASK"
            boolean r3 = r2.getBoolean(r3, r14)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
        L_0x08d6:
            r0.f27484d = r13
            gy3.a0 r3 = new gy3.a0
            r3.<init>()
            if (r2 == 0) goto L_0x08e6
            java.lang.String r4 = "PARAM_FINDER_LIVE_FLUENT_EXIT"
            boolean r4 = r2.getBoolean(r4, r6)
            goto L_0x08e7
        L_0x08e6:
            r4 = 0
        L_0x08e7:
            r3.f27482d = r4
            if (r2 == 0) goto L_0x08f1
            java.lang.String r4 = "PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE"
            int r6 = r2.getInt(r4, r6)
        L_0x08f1:
            boolean r2 = r5.mo84872G()
            if (r2 != 0) goto L_0x0918
            hl1.r3 r2 = new hl1.r3
            r2.<init>(r5, r0, r6, r3)
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.p1 r0 = (tf0.C64916p1) r0
            boolean r0 = r0.mo76723ty()
            if (r0 == 0) goto L_0x0915
            hl1.k$x r0 = new hl1.k$x
            r0.<init>(r2)
            r2 = 200(0xc8, double:9.9E-322)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r0, r2)
            goto L_0x0918
        L_0x0915:
            r2.invoke()
        L_0x0918:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x091c:
            vk1.c r0 = r5.f166848f
            if (r0 != 0) goto L_0x0921
            goto L_0x0924
        L_0x0921:
            r0.setMiniWinPermission(r6)
        L_0x0924:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0933
            p50.e r0 = r0.getLiveCore()
            if (r0 == 0) goto L_0x0933
            r0.mo85693l0()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0933:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x093c
            r0.finish()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x093c:
            er1.j4 r0 = er1.C58739j4.f168176a
            boolean r0 = r0.mo83692U()
            if (r0 == 0) goto L_0x0953
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.v> r2 = cl1.C55002v.class
            androidx.lifecycle.i0 r0 = r0.mo77630e(r2)
            cl1.v r0 = (cl1.C55002v) r0
            if (r0 != 0) goto L_0x0951
            goto L_0x0953
        L_0x0951:
            cl1.C55002v.f154429h = r6
        L_0x0953:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x0957:
            r5.mo84898v()
            java.lang.String r0 = "PARAM_FINDER_LIVE_START_BY_MINI_WINDOW"
            if (r2 == 0) goto L_0x0963
            boolean r4 = r2.getBoolean(r0)
            goto L_0x0964
        L_0x0963:
            r4 = 0
        L_0x0964:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r8 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r8.mo77647u()
            sl1.c r8 = r5.f171194V0
            if (r8 == 0) goto L_0x0977
            sl1.d r9 = new sl1.d
            r9.<init>(r8)
            o40.C61926c.m72668M(r9)
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x0977:
            xs1.d r8 = r5.f171200X0
            if (r8 == 0) goto L_0x098c
            boolean r9 = r8.mo90514a1()
            if (r9 == 0) goto L_0x0982
            goto L_0x098a
        L_0x0982:
            xs1.c r9 = new xs1.c
            r9.<init>(r8)
            o40.C61926c.m72668M(r9)
        L_0x098a:
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x098c:
            qj1.ea r8 = r5.f171237q1
            if (r8 == 0) goto L_0x0995
            r8.mo87760d1()
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x0995:
            r5.mo84884S()
            java.lang.String r8 = r5.f171222i
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "START_LIVE byMiniWin:"
            r9.append(r10)
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r4)
            if (r2 == 0) goto L_0x09b7
            boolean r0 = r2.getBoolean(r0)
            if (r0 != r14) goto L_0x09b7
            r6 = 1
        L_0x09b7:
            if (r6 == 0) goto L_0x09d1
            androidx.lifecycle.i0 r0 = r5.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154286Z
            if (r0 == 0) goto L_0x09d1
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x09d1
            hl1.k3 r2 = new hl1.k3
            r2.<init>(r5)
            r8 = 300(0x12c, double:1.48E-321)
            r0.postDelayed(r2, r8)
        L_0x09d1:
            androidx.lifecycle.i0 r0 = r5.mo83051g(r11)
            cl1.d0 r0 = (cl1.C54963d0) r0
            al1.j r0 = r0.f154073p
            if (r0 == 0) goto L_0x09f8
            ii1.e r2 = r5.f171252x1
            if (r2 == 0) goto L_0x09e6
            java.lang.String r0 = r0.f151997a
            r2.mo85280d1(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x09e6:
            qj1.o2 r0 = r5.f171248w
            if (r0 == 0) goto L_0x09ef
            r0.mo87850a1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x09ef:
            qj1.o2 r0 = r5.f171248w
            if (r0 == 0) goto L_0x09f8
            r0.mo87851b1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x09f8:
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0a01
            r0.checkPauseStateWhenLiveStart()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a01:
            qj1.ue r0 = r5.f171154D1
            if (r0 == 0) goto L_0x0a0a
            r0.mo87970b1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a0a:
            qj1.u1 r0 = r5.f171169L
            if (r0 == 0) goto L_0x0a13
            r0.mo12263b1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a13:
            androidx.lifecycle.i0 r0 = r5.mo83051g(r3)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.f154190D
            if (r0 == 0) goto L_0x0a26
            qj1.v9 r0 = r5.f171155E
            if (r0 == 0) goto L_0x0a26
            r0.mo87988c1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a26:
            qj1.r8 r0 = r5.f171149B
            if (r0 == 0) goto L_0x0a2d
            qj1.e5 r0 = r0.f178624D
            goto L_0x0a2e
        L_0x0a2d:
            r0 = r13
        L_0x0a2e:
            if (r0 == 0) goto L_0x0a3b
            vk1.c r0 = r5.f166848f
            if (r0 == 0) goto L_0x0a3b
            d60.b$b r2 = d60.C58124b.C58125b.ENTERING_COMMENT
            d60.C58124b.C7172a.m7372a(r0, r2, r13, r7, r13)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a3b:
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r5.f166847e
            bl3.r$a r0 = r0.mo62444c(r2)
            java.lang.Class<ht1.x4> r2 = ht1.C8815x4.class
            bl3.c r0 = r0.mo62447c(r2)
            ht1.x4 r0 = (ht1.C8815x4) r0
            r0.mo9641e1()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0a53
        L_0x0a51:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0a53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout.statusChange(d60.b$b, android.os.Bundle):void");
    }

    public void stop() {
        super.stop();
        C59988k livingUIC = getLivingUIC();
        if (livingUIC != null) {
            livingUIC.mo84900x();
        }
        getLivePrepareUIC();
        getLiveEndUIC();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinderLiveVisitorPluginLayout(Context context, Fragment fragment, AttributeSet attributeSet, C49712hj1 hj12, int i, C8480h hVar) {
        this(context, fragment, attributeSet, (i & 8) != 0 ? null : hj12);
    }
}
