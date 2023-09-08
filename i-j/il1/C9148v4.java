package il1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: il1.v4 */
public final class C9148v4 extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C9128u4 f28814d;

    public C9148v4(C9128u4 u4Var) {
        this.f28814d = u4Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLicensePanelWidget$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_privacy");
        C88144b.m109791i(this.f28814d.f28755a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLicensePanelWidget$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(Color.parseColor("#7D90A9"));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
