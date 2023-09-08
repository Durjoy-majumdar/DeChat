package fs0;

import com.tencent.p014mm.plugin.appbrand.p026ui.record.WAGameRecordShareUI;
import de3.C75367m;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: fs0.f */
public final class C97973f implements C75367m {

    /* renamed from: a */
    public final /* synthetic */ WAGameRecordShareUI f287340a;

    public C97973f(WAGameRecordShareUI wAGameRecordShareUI) {
        this.f287340a = wAGameRecordShareUI;
    }

    /* renamed from: a */
    public final void mo12741a(String str) {
        WAGameRecordShareUI wAGameRecordShareUI = this.f287340a;
        String str2 = wAGameRecordShareUI.f267611f.f38917a;
        String format = String.format("https://game.weixin.qq.com/cgi-bin/h5/static/gamelife/localvideo.html?wechat_pkgid=gamelife_localvideo&wechat_immersive=1&immersivePageBgIsDark=1&tab_type=1&sub_tab_type=1&ssid=30&s_uia=1004&s_pid=2&s_cid=%s&game_tab_key=%s", Arrays.copyOf(new Object[]{str2, str2}, 2));
        C87412m.m108593f(format, "format(format, *args)");
        WAGameRecordShareUI.m117228H7(wAGameRecordShareUI, format);
    }
}
