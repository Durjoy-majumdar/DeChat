package tf3;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import gg3.C107803k;
import kf3.C61082e;
import kf3.C99143g;

/* renamed from: tf3.a */
public final class C37065a extends C99143g {
    /* renamed from: a */
    public String mo54531a() {
        return "RepairerConfig_SendAlbumPreload";
    }

    /* renamed from: b */
    public String mo54532b() {
        return "合集图片预加载";
    }

    /* renamed from: d */
    public Class<? extends C61082e> mo54533d() {
        return C107803k.class;
    }

    /* renamed from: g */
    public Object mo54534g() {
        return Integer.valueOf((BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) ? 1 : 0);
    }

    /* renamed from: i */
    public String mo54535i() {
        return "clicfg_albummsg_enable_send_preload";
    }
}
