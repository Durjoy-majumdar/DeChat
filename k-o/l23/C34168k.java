package l23;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import h81.C32735h;

/* renamed from: l23.k */
public final class C34168k {

    /* renamed from: a */
    public static final C34168k f92165a = new C34168k();

    /* renamed from: a */
    public final boolean mo59471a() {
        int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_video_3_4_ratio_enable, 0);
        int i = MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_VIDEO_RATIO_3_4_INT_SYNC", 0);
        Log.m105924i("MicroMsg.FinderVideoCropLocalConfig", "init, isEnable43RatioVideo:" + Qe + ", localConfig:" + i);
        return i != 0 ? i == 1 : Qe == 1;
    }
}
