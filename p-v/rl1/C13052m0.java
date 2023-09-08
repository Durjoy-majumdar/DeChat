package rl1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import ke3.C88144b;
import p213oh.C11412b;

/* renamed from: rl1.m0 */
public final class C13052m0 extends ClickableSpan {

    /* renamed from: d */
    public final WeakReference<Context> f37174d;

    public C13052m0(WeakReference<Context> weakReference) {
        C87412m.m108594g(weakReference, "rContext");
        this.f37174d = weakReference;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/lottery/LotteryLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "widget");
        Context context = this.f37174d.get();
        if (context == null) {
            int i = C11412b.f33577a;
            Log.m105921e("LotteryLicenseSpanClick", "on click but rContext is null!", (Object[]) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/LotteryLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/3qn8dN8csoj0w1d2");
        intent.putExtra("convertActivityFromTranslucent", true);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/lottery/LotteryLicenseSpanClick", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "ds");
        textPaint.setColor(MMApplicationContext.getContext().getResources().getColor(C0966R.color.Link_100));
        textPaint.setUnderlineText(false);
        textPaint.clearShadowLayer();
    }
}
