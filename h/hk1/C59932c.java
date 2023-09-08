package hk1;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b50.C54425k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.videocomposition.effect.EffectRenderView;
import com.tencent.rtmp.TXLivePlayConfig;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import di3.C7335d;
import di3.C86312j;
import dj1.C45366h0;
import f50.C58915a;
import go3.C59600d;
import gy3.C87412m;
import ht1.C60167f1;
import j20.C117292a;
import java.util.Map;
import jp3.C9487b;
import k20.C60958c;
import k20.C9556a;
import nc3.C34767b;
import p182kk.C61104a;
import p564iq.C87790d;
import p565ir.C60606n;
import q00.C62571i;
import te3.C50429mo2;
import te3.C64273c21;
import te3.C64623p81;
import uz2.C65488a0;
import uz2.C65490m;

/* renamed from: hk1.c */
public final class C59932c extends C59600d {

    /* renamed from: e */
    public final Map<String, C64273c21> f171040e;

    /* renamed from: f */
    public int f171041f;

    /* renamed from: g */
    public C64623p81 f171042g;

    /* renamed from: h */
    public TXLivePlayer f171043h;

    /* renamed from: i */
    public SurfaceTexture f171044i;

    /* renamed from: j */
    public C59934b f171045j = new C59934b(this);

    /* renamed from: n */
    public final EffectRenderView f171046n;

    /* renamed from: o */
    public boolean f171047o;

    /* renamed from: p */
    public C34767b.C34768c f171048p;

    /* renamed from: hk1.c$a */
    public static final class C59933a implements C60606n.C60609c {

        /* renamed from: a */
        public final /* synthetic */ View f171049a;

        public C59933a(View view) {
            this.f171049a = view;
        }

        public void onLiveStatusCallback(long j, int i, Object obj) {
            if (i == 2) {
                View view = this.f171049a;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/status/LivePullDownView$1$1", "onLiveStatusCallback", "(JILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/status/LivePullDownView$1$1", "onLiveStatusCallback", "(JILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: hk1.c$b */
    public static final class C59934b extends C58915a {

        /* renamed from: d */
        public final /* synthetic */ C59932c f171050d;

        public C59934b(C59932c cVar) {
            this.f171050d = cVar;
        }

        public void onNetStatus(Bundle bundle) {
        }

        public void onPlayEvent(int i, Bundle bundle) {
            super.onPlayEvent(i, bundle);
            if (i == 2009) {
                int i2 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
                int i3 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
                TXLivePlayer tXLivePlayer = this.f171050d.f171043h;
                if (tXLivePlayer != null) {
                    tXLivePlayer.setSurfaceSize(i2, i3);
                }
                SurfaceTexture surfaceTexture = this.f171050d.f171044i;
                if (surfaceTexture != null) {
                    surfaceTexture.setDefaultBufferSize(i2, i3);
                }
                this.f171050d.f171046n.mo82358a(i2, i3, 0);
                Log.m105924i("AbsTXLivePlayListener", "PLAY_EVT_CHANGE_RESOLUTION width:" + i2 + " height:" + i3);
            }
        }
    }

    static {
        ((C62571i) C86312j.m106911c(C62571i.class)).mo87569Ra();
    }

    public C59932c(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar, Map<String, C64273c21> map) {
        String str2;
        Map<String, String> parseXml;
        FrameLayout frameLayout2 = frameLayout;
        C65488a0 a0Var2 = a0Var;
        C65490m mVar2 = mVar;
        Map<String, C64273c21> map2 = map;
        C87412m.m108594g(map2, "liveInfoCache");
        this.f171040e = map2;
        Integer num = null;
        View inflate = View.inflate(MMApplicationContext.getContext(), C0966R.C0971layout.ajd, (ViewGroup) null);
        View findViewById = inflate.findViewById(C0966R.C0970id.dxv);
        C87412m.m108593f(findViewById, "livePullDownView.findVie…_view_player_effect_view)");
        EffectRenderView effectRenderView = (EffectRenderView) findViewById;
        this.f171046n = effectRenderView;
        if (frameLayout2 != null) {
            frameLayout2.addView(inflate);
        }
        mo84849k();
        String str3 = "";
        if (!(a0Var2 == null || (parseXml = XmlParser.parseXml(a0Var2.f188441f, "finderLive", (String) null)) == null)) {
            this.f171042g = C60167f1.m70153k(str3, parseXml);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tryGetLiveInfo anchorUsername:");
        C64623p81 p812 = this.f171042g;
        sb.append(p812 != null ? p812.f184779e : null);
        sb.append(" liveId:");
        C64623p81 p813 = this.f171042g;
        sb.append(p813 != null ? p813.f184778d : null);
        Log.m105924i("LivePullDownView", sb.toString());
        C64623p81 p814 = this.f171042g;
        if (p814 != null) {
            C64273c21 c212 = map2.get(p814.f184778d);
            if (c212 == null || c212.f182394f != 2) {
                String str4 = p814.f184779e;
                new C45366h0(str4 != null ? str4 : str3, new C59936e(this)).mo9225i();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("tryGetLiveInfo cacheLiveStatus:");
            C64273c21 c213 = map2.get(p814.f184778d);
            sb4.append(c213 != null ? Integer.valueOf(c213.f182394f) : null);
            Log.m105924i("LivePullDownView", sb4.toString());
        }
        this.f171043h = new TXLivePlayer(MMApplicationContext.getContext());
        TXLivePlayConfig tXLivePlayConfig = new TXLivePlayConfig();
        boolean z = false;
        tXLivePlayConfig.setAutoAdjustCacheTime(false);
        tXLivePlayConfig.setMaxAutoAdjustCacheTime(5.0f);
        tXLivePlayConfig.setMinAutoAdjustCacheTime(5.0f);
        tXLivePlayConfig.setCacheTime(5.0f);
        TXLivePlayer tXLivePlayer = this.f171043h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setPlayerView((TXCloudVideoView) null);
        }
        TXLivePlayer tXLivePlayer2 = this.f171043h;
        if (tXLivePlayer2 != null) {
            tXLivePlayer2.setPlayListener(this.f171045j);
        }
        TXLivePlayer tXLivePlayer3 = this.f171043h;
        if (tXLivePlayer3 != null) {
            tXLivePlayer3.enableHardwareDecode(true);
        }
        C54425k.f152655a.mo75239a("LivePullDownView");
        TXLivePlayer tXLivePlayer4 = this.f171043h;
        if (tXLivePlayer4 != null) {
            tXLivePlayer4.setConfig(tXLivePlayConfig);
        }
        TXLivePlayer tXLivePlayer5 = this.f171043h;
        if (tXLivePlayer5 != null) {
            tXLivePlayer5.setRenderMode(0);
        }
        num = mVar2 != null ? Integer.valueOf(mVar2.f188446e) : num;
        if (num != null && num.intValue() == 0) {
            z = true;
        }
        this.f171047o = z;
        effectRenderView.getEffectManager().mo154924d();
        effectRenderView.setSurfaceCallback(new C59935d(this));
        C64623p81 p815 = this.f171042g;
        if (p815 != null && (str2 = p815.f184778d) != null) {
            C7335d c = C86312j.m106911c(C60606n.class);
            C87412m.m108593f(c, "getService(IFinderLiveFeatureService::class.java)");
            C60606n.C60607a.m70857a((C60606n) c, Util.safeParseLong(str2), false, (C9487b) null, new C59933a(inflate), 0, (String) null, (C50429mo2) null, 118, (Object) null);
        }
    }

    /* renamed from: e */
    public void mo79961e() {
        this.f170310d = false;
        mo84849k();
    }

    /* renamed from: f */
    public void mo79962f() {
        this.f170310d = true;
        boolean z = false;
        if (!(this.f171047o || C61104a.m71668x() || C61104a.m71642B(MMApplicationContext.getContext(), false))) {
            C34767b.C34768c el = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34774j.f93457c, new C59937f(this));
            this.f171048p = el;
            if (el != null && el.mo34198a()) {
                z = true;
            }
        } else {
            mo84848j();
        }
        TXLivePlayer tXLivePlayer = this.f171043h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setMute(true ^ z);
        }
        mo84850l();
    }

    /* renamed from: g */
    public void mo79963g() {
    }

    public String getTag() {
        return "LivePullDownView";
    }

    /* renamed from: h */
    public void mo79964h() {
    }

    /* renamed from: i */
    public void mo79965i(float f) {
    }

    /* renamed from: j */
    public final void mo84848j() {
        C34767b.C34768c cVar = this.f171048p;
        if (cVar != null) {
            ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
        }
        this.f171048p = null;
    }

    /* renamed from: k */
    public final void mo84849k() {
        StringBuilder sb = new StringBuilder();
        sb.append("switchToImage liveId:");
        C64623p81 p812 = this.f171042g;
        sb.append(p812 != null ? p812.f184778d : null);
        Log.m105924i("LivePullDownView", sb.toString());
        this.f171041f = 0;
        TXLivePlayer tXLivePlayer = this.f171043h;
        if (tXLivePlayer != null) {
            tXLivePlayer.stopPlay(true);
        }
        mo84848j();
    }

    /* renamed from: l */
    public final void mo84850l() {
        StringBuilder sb = new StringBuilder();
        sb.append("switchToVideo liveId:");
        C64623p81 p812 = this.f171042g;
        String str = null;
        sb.append(p812 != null ? p812.f184778d : null);
        Log.m105924i("LivePullDownView", sb.toString());
        C64623p81 p813 = this.f171042g;
        if (p813 != null) {
            this.f171041f = 1;
            C64273c21 c212 = this.f171040e.get(p813.f184778d);
            if (!(c212 == null || c212.f182394f == 2)) {
                if (((C87790d) C86312j.m106911c(C87790d.class)).W90()) {
                    TXLivePlayer tXLivePlayer = this.f171043h;
                    if (tXLivePlayer != null) {
                        tXLivePlayer.startPlay(c212.f182395g, 1);
                    }
                } else {
                    Log.m105924i("LivePullDownView", "switchToVideo fail, expansions not installed");
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("switchToVideo streamUrl:");
            if (c212 != null) {
                str = c212.f182395g;
            }
            sb4.append(str);
            Log.m105924i("LivePullDownView", sb4.toString());
        }
    }

    public void onDestroy() {
        mo84848j();
    }

    public void onPause() {
    }

    public void onResume() {
    }
}
