package co1;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.WCWebUpdater;
import gy3.C87412m;
import te3.C64850yb1;

/* renamed from: co1.g */
public final class C55051g {
    /* renamed from: a */
    public static final String m62152a(C64850yb1 yb12) {
        C87412m.m108594g(yb12, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("Spec[");
        sb.append(yb12.f186466d);
        sb.append(' ');
        sb.append(C87412m.m108589b(yb12.f186469g, "h266") ? WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN : C87412m.m108589b(yb12.f186469g, "h264") ? WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL : WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
        sb.append("  ");
        sb.append(Util.getSizeKB((long) yb12.f186467e));
        sb.append(' ');
        sb.append(yb12.f186468f);
        sb.append("  ");
        sb.append(yb12.f186479t);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: b */
    public static final String m62153b(C64850yb1 yb12) {
        C87412m.m108594g(yb12, "<this>");
        return "Spec[" + yb12.f186466d + ' ' + yb12.f186469g + ' ' + Util.getSizeKB((long) yb12.f186467e) + ' ' + yb12.f186468f + ' ' + yb12.f186472j + ' ' + yb12.f186473n + ' ' + yb12.f186479t + ']';
    }
}
