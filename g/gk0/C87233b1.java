package gk0;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: gk0.b1 */
public abstract class C87233b1 extends LinkMovementMethod {
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
        int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
        int scrollX = x + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y + textView.getScrollY()), (float) scrollX);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
        if (uRLSpanArr.length != 0) {
            String url = uRLSpanArr[0].getURL();
            Log.m105925i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, onLinkClick url:%s", url);
            C87235d dVar = new C87235d();
            dVar.f252920i = url;
            C83780d1 d1Var = ((C87249m0) this).f252954a;
            HashMap hashMap = new HashMap();
            hashMap.put("url", dVar.f252920i);
            Log.m105925i("MicroMsg.JsApiEventTextViewLinkClick", "onTextViewLinkClick, url:%s", dVar.f252920i);
            dVar.mo115165o(hashMap);
            dVar.mo115161k(d1Var);
            dVar.mo115158h();
        }
        return true;
    }
}
