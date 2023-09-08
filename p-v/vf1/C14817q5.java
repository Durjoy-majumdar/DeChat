package vf1;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderTopicFeedUI;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import gy3.C87412m;
import java.util.Arrays;
import ke3.C88144b;
import kf1.C9965rb;
import nj3.C11184p0;

/* renamed from: vf1.q5 */
public final class C14817q5 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFeedUI f40811d;

    public C14817q5(FinderTopicFeedUI finderTopicFeedUI) {
        this.f40811d = finderTopicFeedUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 10004) {
            FinderTopicFeedUI finderTopicFeedUI = this.f40811d;
            C9965rb rbVar = finderTopicFeedUI.f14887q;
            if (rbVar != null) {
                String str = rbVar.f30630F;
                if (str != null) {
                    C87412m.m108594g(finderTopicFeedUI, "context");
                    String format = String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&wechat_real_lang=%s&topic_wording=%s", Arrays.copyOf(new Object[]{64, LocaleUtil.getApplicationLanguage(), str}, 3));
                    C87412m.m108593f(format, "format(format, *args)");
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", format);
                    C88144b.m109791i(finderTopicFeedUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                    return;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
