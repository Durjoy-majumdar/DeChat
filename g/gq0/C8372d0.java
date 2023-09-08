package gq0;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: gq0.d0 */
public final class C8372d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextView f27358d;

    /* renamed from: e */
    public final /* synthetic */ C8373l0 f27359e;

    public C8372d0(TextView textView, C8373l0 l0Var) {
        this.f27358d = textView;
        this.f27359e = l0Var;
    }

    public final void run() {
        int i;
        String str;
        int width = (this.f27358d.getWidth() - this.f27358d.getPaddingLeft()) - this.f27358d.getPaddingRight();
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "setText, lineWidth: " + width);
        TextPaint paint = this.f27358d.getPaint();
        C87412m.m108593f(paint, "paint");
        StaticLayout staticLayout = new StaticLayout(this.f27359e.f27360a, paint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        if (staticLayout.getLineCount() <= 0) {
            Log.m105928w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "getFirstLineEndPos, lineCount(" + staticLayout.getLineCount() + ") is illegal");
            i = 0;
        } else {
            i = staticLayout.getLineEnd(0);
        }
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "setText, firstLineEndPos: " + i);
        if (!(1 <= i && i <= this.f27359e.f27360a.length())) {
            this.f27358d.setText(this.f27359e.f27363d);
            return;
        }
        if (i == this.f27359e.f27360a.length()) {
            str = this.f27359e.f27360a;
        } else {
            StringBuilder sb = new StringBuilder();
            String substring = this.f27359e.f27360a.substring(0, i - 1);
            C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(8230);
            str = sb.toString();
        }
        String str2 = str + 10 + this.f27359e.f27361b;
        Log.m105918d("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "setText, functionName2Show: " + str2);
        this.f27358d.setText(str2);
    }
}
