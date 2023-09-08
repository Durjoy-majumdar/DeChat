package com.tencent.p014mm.plugin.appbrand.debugger.console;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import java.util.LinkedList;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.u */
public final class C81718u extends AppCompatTextView {

    /* renamed from: g */
    public final LinkedList<String> f239833g = new LinkedList<>();

    /* renamed from: h */
    public SpannableStringBuilder f239834h = new SpannableStringBuilder();

    /* renamed from: com.tencent.mm.plugin.appbrand.debugger.console.u$a */
    public static final class C81719a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81718u f239835d;

        public C81719a(C81718u uVar) {
            this.f239835d = uVar;
        }

        public final void run() {
            int lineTop = this.f239835d.getLayout().getLineTop(this.f239835d.getLineCount()) - this.f239835d.getHeight();
            if (lineTop > 0) {
                this.f239835d.scrollTo(0, lineTop);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81718u(Context context) {
        super(context, (AttributeSet) null);
        C87412m.m108594g(context, "context");
        setTextSize(0, (float) C76577a.m92155f(context, C0966R.dimen.f3962lk));
        setVerticalScrollBarEnabled(true);
        setMovementMethod(new ScrollingMovementMethod());
    }

    /* renamed from: a */
    public final void mo114084a(String str, int i) {
        if (1000 <= this.f239833g.size()) {
            this.f239834h.delete(0, this.f239833g.removeFirst().length());
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str.length(), 33);
        this.f239834h.append(spannableString);
        setText(this.f239834h);
        post(new C81719a(this));
        this.f239833g.addLast(str);
    }
}
