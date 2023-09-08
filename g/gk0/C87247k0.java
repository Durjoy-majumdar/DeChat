package gk0;

import android.text.Html;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.autofill.URLSpanNoUnderline;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87362k;
import te3.C52225z7;

/* renamed from: gk0.k0 */
public class C87247k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f252946d;

    /* renamed from: e */
    public final /* synthetic */ int f252947e;

    /* renamed from: f */
    public final /* synthetic */ C52225z7 f252948f;

    /* renamed from: g */
    public final /* synthetic */ String f252949g;

    /* renamed from: h */
    public final /* synthetic */ C45931t0 f252950h;

    public C87247k0(C45931t0 t0Var, C83780d1 d1Var, int i, C52225z7 z7Var, String str) {
        this.f252950h = t0Var;
        this.f252946d = d1Var;
        this.f252947e = i;
        this.f252948f = z7Var;
        this.f252949g = str;
    }

    public void run() {
        C45931t0 t0Var = this.f252950h;
        C83780d1 d1Var = this.f252946d;
        int i = this.f252947e;
        C52225z7 z7Var = this.f252948f;
        String str = this.f252949g;
        t0Var.getClass();
        View inflate = ((LayoutInflater) d1Var.getContext().getSystemService("layout_inflater")).inflate(C0966R.C0971layout.f6385de, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.a1f);
        Button button = (Button) inflate.findViewById(C0966R.C0970id.a1e);
        Button button2 = (Button) inflate.findViewById(C0966R.C0970id.a1g);
        textView.setText(Html.fromHtml(str));
        SpannableString spannableString = new SpannableString(textView.getText());
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        int i2 = 0;
        while (i2 < length) {
            URLSpan uRLSpan = uRLSpanArr[i2];
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new URLSpanNoUnderline(uRLSpan.getURL()), spanStart, spanEnd, 0);
            i2++;
        }
        textView.setText(spannableString);
        textView.setMovementMethod(new C87249m0(t0Var, d1Var));
        button.setOnClickListener(new C45925n0(t0Var, z7Var, d1Var, i));
        button2.setOnClickListener(new C45926o0(t0Var, z7Var, d1Var, i));
        Log.m105924i("MicroMsg.JsApiRequestAuthUserAutoFillData", "showAlertImplNew, show the new bottom dialog!");
        C87231a1 a1Var = new C87231a1(d1Var.getContext());
        t0Var.f123930g = a1Var;
        a1Var.setContentView(inflate);
        t0Var.f123930g.setCancelable(false);
        t0Var.f123930g.setCanceledOnTouchOutside(false);
        C87362k kVar = d1Var.getRuntime().f238157v;
        if (kVar != null) {
            kVar.mo121778b(t0Var.f123930g);
        }
    }
}
