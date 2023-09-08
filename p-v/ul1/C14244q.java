package ul1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ke3.C88144b;
import p213oh.C11412b;

/* renamed from: ul1.q */
public final class C14244q extends ClickableSpan {

    /* renamed from: d */
    public final WeakReference<Activity> f39769d;

    public C14244q(WeakReference<Activity> weakReference) {
        C87412m.m108594g(weakReference, "rActivity");
        this.f39769d = weakReference;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/create/LotteryCreateLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        Activity activity = this.f39769d.get();
        if (activity == null) {
            int i = C11412b.f33577a;
            Log.m105921e("LotteryCreateLicenseSpanClick", "on click but activity is null!", (Object[]) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/LotteryCreateLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/3qn8dN8csoj0w1d2");
        C88144b.m109791i(activity, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/create/LotteryCreateLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(Color.parseColor("#7D90A9"));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
