package fs0;

import com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareUI;
import de3.C75367m;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: fs0.e */
public final class C97972e implements C75367m {

    /* renamed from: a */
    public final /* synthetic */ WAGameRecordShareUI f287339a;

    public C97972e(WAGameRecordShareUI wAGameRecordShareUI) {
        this.f287339a = wAGameRecordShareUI;
    }

    /* renamed from: a */
    public final void mo12741a(String str) {
        WAGameRecordShareUI wAGameRecordShareUI = this.f287339a;
        String format = String.format("https://game.weixin.qq.com/cgi-bin/h5/static/gamelife/homepage.html?wechat_pkgid=gamelife_homepage&wechat_immersive=1&immersivePageBgIsDark=1&immersiveUIStyle=1&ssid=30&&s_uia=1004&s_pid=3&s_cid=%s", Arrays.copyOf(new Object[]{wAGameRecordShareUI.f267611f.f38917a}, 1));
        C87412m.m108593f(format, "format(format, *args)");
        WAGameRecordShareUI.m117228H7(wAGameRecordShareUI, format);
    }
}
