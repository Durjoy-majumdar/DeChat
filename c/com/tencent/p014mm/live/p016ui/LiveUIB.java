package com.tencent.p014mm.live.p016ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveEnterReplayStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveReplayOpStruct;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.view.LiveReplayVideoView;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import e60.C58532b;
import e60.C7599a;
import eb0.C75592q0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p380r7.C22210h;
import p396x6.C23023u;
import p629ny.C76979h;
import rx3.C13598b0;
import te3.C49317ep2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/live/ui/LiveUIB;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-logic_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.live.ui.LiveUIB */
public final class LiveUIB extends MMActivity {

    /* renamed from: d */
    public final String f266770d = "MicroMsg.LiveUIB";

    /* renamed from: e */
    public LiveReplayVideoView f266771e;

    /* renamed from: f */
    public int f266772f;

    /* renamed from: g */
    public int f266773g;

    /* renamed from: com.tencent.mm.live.ui.LiveUIB$a */
    public static final class C1272a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ LiveUIB f10326d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1272a(LiveUIB liveUIB) {
            super(1);
            this.f10326d = liveUIB;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            this.f10326d.finish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.live.ui.LiveUIB$b */
    public static final class C1273b extends C87413o implements C32224a {

        /* renamed from: d */
        public final /* synthetic */ LiveUIB f10327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1273b(LiveUIB liveUIB) {
            super(0);
            this.f10327d = liveUIB;
        }

        public Object invoke() {
            if (C87412m.m108589b(RoomLiveService.f157199j, C75592q0.m90789s())) {
                Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markAnchorDragTimeLineWhilePlaying");
                C115669n.INSTANCE.mo175913w(1385, 3, 1);
            } else {
                Log.m105924i("MicroMsg.LiveReplayIDKeyStat", "markVisitorDragTimeLineWhilePlaying");
                C115669n.INSTANCE.mo175913w(1385, 12, 1);
            }
            LiveReplayVideoView liveReplayVideoView = this.f10327d.f266771e;
            if (liveReplayVideoView != null) {
                liveReplayVideoView.setVideoSeekBarDragCallback((C32224a<C13598b0>) null);
            }
            return null;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b79;
    }

    public void onCreate(Bundle bundle) {
        String str = this.f266770d;
        Log.m105924i(str, "onCreate (" + hashCode() + ')');
        setTheme(C0966R.style.f8236a4);
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().addFlags(67108864);
        getWindow().clearFlags(67108864);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().addFlags(Integer.MIN_VALUE);
        boolean z = false;
        getWindow().setStatusBarColor(0);
        getWindow().setFormat(-3);
        getWindow().setSoftInputMode(3);
        this.f266773g = getIntent().getIntExtra("FROM_SENCE", 2);
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        this.f266772f = RoomLiveService.f157197h.f133062s ? 1 : 0;
        LiveReplayVideoView liveReplayVideoView = (LiveReplayVideoView) findViewById(C0966R.C0970id.fxr);
        this.f266771e = liveReplayVideoView;
        if (liveReplayVideoView != null) {
            liveReplayVideoView.setOnCloseClickListener(new C1272a(this));
        }
        LiveReplayVideoView liveReplayVideoView2 = this.f266771e;
        if (liveReplayVideoView2 != null) {
            String str2 = RoomLiveService.f157197h.f133058o;
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = liveReplayVideoView2.f266780j;
            if (redesignVideoPlayerSeekBar != null) {
                redesignVideoPlayerSeekBar.setIsPlay(true);
            }
            C23023u uVar = liveReplayVideoView2.f266775e;
            if (uVar != null) {
                uVar.mo36327l(0);
            }
            C23023u uVar2 = liveReplayVideoView2.f266775e;
            if (uVar2 != null) {
                uVar2.mo36262a(false);
            }
            liveReplayVideoView2.f266784q = false;
            liveReplayVideoView2.f266777g.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(liveReplayVideoView2.getContext(), RoomLiveService.f157197h.f133051e));
            liveReplayVideoView2.setVisibility(0);
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                C22210h hVar = new C22210h(Uri.parse(str2), liveReplayVideoView2.f266783p, liveReplayVideoView2.f266782o, new LiveReplayVideoView.C92696e());
                C23023u uVar3 = liveReplayVideoView2.f266775e;
                if (uVar3 != null) {
                    uVar3.mo36325j(hVar);
                }
                C23023u uVar4 = liveReplayVideoView2.f266775e;
                if (uVar4 != null) {
                    uVar4.mo36262a(true);
                }
                liveReplayVideoView2.mo126877a();
            }
        }
        LiveReplayVideoView liveReplayVideoView3 = this.f266771e;
        if (liveReplayVideoView3 != null) {
            liveReplayVideoView3.setVideoSeekBarDragCallback(new C1273b(this));
        }
    }

    public void onDestroy() {
        String str;
        String str2 = this.f266770d;
        Log.m105924i(str2, "onDestroy (" + hashCode() + ')');
        LiveReplayVideoView liveReplayVideoView = this.f266771e;
        if (liveReplayVideoView != null) {
            String str3 = RoomLiveService.f157192c;
            C49317ep2 ep22 = RoomLiveService.f157197h;
            long j = ep22.f133050d;
            String str4 = ep22.f133051e;
            String str5 = RoomLiveService.f157199j;
            C23023u uVar = liveReplayVideoView.f266775e;
            long j2 = 0;
            long duration = uVar != null ? uVar.getDuration() : 0;
            C23023u uVar2 = liveReplayVideoView.f266775e;
            if (uVar2 != null) {
                j2 = uVar2.getCurrentPosition();
            }
            String str6 = C58532b.f167566a;
            C87412m.m108594g(str3, "roomId");
            C87412m.m108594g(str5, "liveUserName");
            LiveReplayOpStruct liveReplayOpStruct = new LiveReplayOpStruct();
            str = "liveUserName";
            liveReplayOpStruct.f265655d = liveReplayOpStruct.mo86045b("roomid", str3, true);
            liveReplayOpStruct.f265656e = j;
            liveReplayOpStruct.f265657f = liveReplayOpStruct.mo86045b("topic", str4, true);
            liveReplayOpStruct.f265658g = liveReplayOpStruct.mo86045b("liveusername", str5, true);
            liveReplayOpStruct.f265661j = duration;
            liveReplayOpStruct.f265662k = j2;
            C7599a.C7600a aVar = C7599a.f25866a;
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            liveReplayOpStruct.f265659h = (long) aVar.mo8729c(s, str5);
            String s2 = C75592q0.m90789s();
            C87412m.m108593f(s2, "getUsernameFromUserInfo()");
            liveReplayOpStruct.f265660i = (long) aVar.mo8728b(s2, str3);
            liveReplayOpStruct.mo86054n();
        } else {
            str = "liveUserName";
        }
        super.onDestroy();
        RoomLiveService roomLiveService = RoomLiveService.f157190a;
        String str7 = RoomLiveService.f157192c;
        C49317ep2 ep23 = RoomLiveService.f157197h;
        long j3 = ep23.f133050d;
        String str8 = ep23.f133051e;
        String str9 = RoomLiveService.f157199j;
        int i = this.f266773g;
        boolean z = RoomLiveService.f157197h.f133062s;
        int i2 = this.f266772f;
        String str10 = C58532b.f167566a;
        C87412m.m108594g(str7, "roomId");
        C87412m.m108594g(str9, str);
        LiveEnterReplayStruct liveEnterReplayStruct = new LiveEnterReplayStruct();
        liveEnterReplayStruct.f265646d = liveEnterReplayStruct.mo86045b("roomid", str7, true);
        liveEnterReplayStruct.f265647e = j3;
        C7599a.C7600a aVar2 = C7599a.f25866a;
        String s3 = C75592q0.m90789s();
        C87412m.m108593f(s3, "getUsernameFromUserInfo()");
        liveEnterReplayStruct.f265651i = (long) aVar2.mo8729c(s3, str9);
        liveEnterReplayStruct.f265650h = (long) i;
        liveEnterReplayStruct.f265649g = liveEnterReplayStruct.mo86045b("liveusername", str9, true);
        liveEnterReplayStruct.f265648f = liveEnterReplayStruct.mo86045b("topic", str8, true);
        liveEnterReplayStruct.f265653k = z ? 1 : 0;
        liveEnterReplayStruct.f265654l = (long) i2;
        String s4 = C75592q0.m90789s();
        C87412m.m108593f(s4, "getUsernameFromUserInfo()");
        liveEnterReplayStruct.f265652j = (long) aVar2.mo8728b(s4, str7);
        liveEnterReplayStruct.mo86054n();
        LiveReplayVideoView liveReplayVideoView2 = this.f266771e;
        if (liveReplayVideoView2 != null) {
            liveReplayVideoView2.f266786s.removeCallbacks(liveReplayVideoView2.f266788u);
            C23023u uVar3 = liveReplayVideoView2.f266775e;
            if (uVar3 != null) {
                uVar3.release();
            }
            C23023u uVar4 = liveReplayVideoView2.f266775e;
            if (uVar4 != null) {
                uVar4.mo36265d(liveReplayVideoView2);
            }
            liveReplayVideoView2.f266775e = null;
        }
    }

    public void onNewIntent(Intent intent) {
        String str = this.f266770d;
        Log.m105924i(str, "onNewIntent (" + hashCode() + ')');
        super.onNewIntent(intent);
    }

    public void onPause() {
        String str = this.f266770d;
        Log.m105924i(str, "onPause (" + hashCode() + ')');
        super.onPause();
    }

    public void onResume() {
        String str = this.f266770d;
        Log.m105924i(str, "onResume (" + hashCode() + ')');
        super.onResume();
    }
}
