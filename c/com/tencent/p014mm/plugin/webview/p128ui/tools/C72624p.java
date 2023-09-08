package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import te3.C64282cc0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.p */
public final class C72624p extends ClickableSpan {

    /* renamed from: d */
    public final /* synthetic */ C64282cc0 f211266d;

    /* renamed from: e */
    public final /* synthetic */ OpenSdkFaceDetectInfoLayout f211267e;

    public C72624p(C64282cc0 cc02, OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        this.f211266d = cc02;
        this.f211267e = openSdkFaceDetectInfoLayout;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$initPrompt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        C87412m.m108594g(view, "v");
        if (!Util.isNullOrNil(this.f211266d.f182460e)) {
            OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout = this.f211267e;
            String str = this.f211266d.f182460e;
            C87412m.m108593f(str, "prompt.url");
            int i = OpenSdkFaceDetectInfoLayout.f211208n;
            openSdkFaceDetectInfoLayout.getClass();
            if (Util.isNullOrNil(str)) {
                Log.m105920e("MicroMsg.OpenSdkFaceDetectInfoLayout", "jumpToWebView url is null");
            } else {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("showShare", false);
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                C88144b.m109791i(openSdkFaceDetectInfoLayout.getActivityContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        } else {
            Log.m105920e("MicroMsg.OpenSdkFaceDetectInfoLayout", "promptInfo url is null");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout$initPrompt$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void updateDrawState(TextPaint textPaint) {
        C87412m.m108594g(textPaint, "textPaint");
        textPaint.setColor(this.f211267e.getResources().getColor(C0966R.color.a1d));
    }
}
