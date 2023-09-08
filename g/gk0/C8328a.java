package gk0;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: gk0.a */
public class C8328a extends ClickableSpan {

    /* renamed from: d */
    public String f27287d;

    /* renamed from: e */
    public int f27288e = MMApplicationContext.getContext().getResources().getColor(C0966R.color.f2958ae);

    public C8328a(String str) {
        this.f27287d = str;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/ExposeSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        if (Util.isNullOrNil(this.f27287d)) {
            Log.m105920e("MicroMsg.ExposeSpan", "exposeUrl is null, return");
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/ExposeSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.f27287d);
        intent.putExtra("forceHideShare", true);
        C88144b.m109791i(view.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        Log.m105919d("MicroMsg.ExposeSpan", "expose click, exposeUrl:%s", this.f27287d);
        C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/ExposeSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f27288e);
        textPaint.setUnderlineText(false);
    }
}
