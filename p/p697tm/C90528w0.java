package p697tm;

import com.tencent.p014mm.autogen.events.CollectAppBrandDesktopShortcutInfoEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;

/* renamed from: tm.w0 */
public class C90528w0 extends IStaticListener<CollectAppBrandDesktopShortcutInfoEvent> {
    public boolean callback(IEvent iEvent) {
        WxaAttributes LL;
        CollectAppBrandDesktopShortcutInfoEvent collectAppBrandDesktopShortcutInfoEvent = (CollectAppBrandDesktopShortcutInfoEvent) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        if (!Util.isNullOrNil(collectAppBrandDesktopShortcutInfoEvent.f236167d.f236169a) && C86709a0.m107523b().f251765p && (LL = C81161g2.Cx0().mo114000LL(collectAppBrandDesktopShortcutInfoEvent.f236167d.f236169a, "roundedSquareIconURL", "brandIconURL", "bigHeadURL", "appId", "nickname")) != null) {
            CollectAppBrandDesktopShortcutInfoEvent.C80711b bVar = collectAppBrandDesktopShortcutInfoEvent.f236168e;
            bVar.f236172c = new String[]{LL.field_roundedSquareIconURL, LL.field_brandIconURL, LL.field_bigHeadURL};
            bVar.f236170a = LL.field_appId;
            bVar.f236171b = LL.field_nickname;
        }
        return true;
    }
}
