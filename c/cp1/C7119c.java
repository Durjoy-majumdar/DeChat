package cp1;

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

/* renamed from: cp1.c */
public final class C7119c extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C7120d f25073d;

    public C7119c(C7120d dVar) {
        this.f25073d = dVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f25073d.f25074d ? "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/BsB5Jid0M6gtMOz8" : "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/JsWXJcUX5dlJhfUW");
        C88144b.m109791i(this.f25073d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveChargeLicenseWidget$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(Color.parseColor("#7D90A9"));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
