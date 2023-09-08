package qj1;

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

/* renamed from: qj1.eh */
public final class C12375eh extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C12271ch f35635d;

    public C12375eh(C12271ch chVar) {
        this.f35635d = chVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$setLicenseText$secondClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://weixin.qq.com/cgi-bin/readtemplate?t=finder_live_up_privacy");
        C88144b.m109791i(this.f35635d.f166287d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorLinkMicLisencePlugin$setLicenseText$secondClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(Color.parseColor("#7D90A9"));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
