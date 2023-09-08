package bg3;

import com.tencent.xweb.WCWebUpdater;
import hg3.C108247a;
import java.util.List;
import kf3.C61080b;
import kf3.C61082e;
import sx3.C64197v;

/* renamed from: bg3.a */
public final class C104081a extends C61080b {
    /* renamed from: a */
    public String mo54531a() {
        return "RepairerConfig_VOIP_ForceHardCameraInit_Int";
    }

    /* renamed from: b */
    public String mo54532b() {
        return "强制camera使用分辨率";
    }

    /* renamed from: d */
    public Class<? extends C61082e> mo54533d() {
        return C108247a.class;
    }

    /* renamed from: k */
    public List<String> mo59751k() {
        return C64197v.m75537f("默认", "360P", "480P", "720P", "1080P");
    }

    /* renamed from: l */
    public List<String> mo59752l() {
        return C64197v.m75537f("0", "1", "2", "3", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
    }
}
