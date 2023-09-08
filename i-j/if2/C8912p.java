package if2;

import a14.C53895h;
import a14.C53934p0;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1694g2;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1701i2;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.p014mm.plugin.profile.p088ui.newbizinfo.auth.NewBizInfoAuthMainUI;
import ke3.C88144b;
import nj3.C11184p0;
import rx3.C36570n;
import t83.C13844c;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: if2.p */
public final class C8912p implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C8908n f28196d;

    public C8912p(C8908n nVar) {
        this.f28196d = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C8908n nVar = this.f28196d;
            nVar.getClass();
            Intent intent = new Intent();
            intent.putExtra("rawUrl", "https://stream.weixin.qq.com/jsapidemo/static/index.html#/index");
            C88144b.m109791i(nVar.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } else if (itemId == 1) {
            C13844c.f38985a = true;
        } else if (itemId == 2) {
            C13844c.f38985a = false;
        } else if (itemId == 3) {
            C8908n nVar2 = this.f28196d;
            C53895h.m60466d(((NewBizInfoAuthMainUI) ((C36570n) nVar2.f28192d).getValue()).getUICScope(), (C66212f) null, (C53934p0) null, new C8913q(new String[]{JsApiChooseImage.NAME, C1701i2.NAME, C1694g2.NAME, "chooseCard", "editAddress"}, "wxf8b4f85f3a794e77", nVar2, (C15601d<? super C8913q>) null), 3, (Object) null);
        }
    }
}
