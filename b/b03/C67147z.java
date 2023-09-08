package b03;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: b03.z */
public final class C67147z implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ TextView f192799d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<CharSequence, C13598b0> f192800e;

    /* renamed from: f */
    public final /* synthetic */ C67133s f192801f;

    /* renamed from: g */
    public final /* synthetic */ CharSequence f192802g;

    /* renamed from: h */
    public final /* synthetic */ CharSequence f192803h;

    /* renamed from: i */
    public final /* synthetic */ int f192804i;

    /* renamed from: j */
    public final /* synthetic */ C32228q<String, CharSequence, Integer, CharSequence> f192805j;

    /* renamed from: n */
    public final /* synthetic */ CharSequence f192806n;

    /* renamed from: o */
    public final /* synthetic */ C32226l<CharSequence, C13598b0> f192807o;

    /* renamed from: b03.z$a */
    public static final class C67148a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67133s f192808d;

        /* renamed from: e */
        public final /* synthetic */ CharSequence f192809e;

        /* renamed from: f */
        public final /* synthetic */ CharSequence f192810f;

        /* renamed from: g */
        public final /* synthetic */ int f192811g;

        /* renamed from: h */
        public final /* synthetic */ C32228q<String, CharSequence, Integer, CharSequence> f192812h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<CharSequence, C13598b0> f192813i;

        /* renamed from: j */
        public final /* synthetic */ CharSequence f192814j;

        /* renamed from: n */
        public final /* synthetic */ TextView f192815n;

        /* renamed from: o */
        public final /* synthetic */ C32226l<CharSequence, C13598b0> f192816o;

        public C67148a(C67133s sVar, CharSequence charSequence, CharSequence charSequence2, int i, C32228q<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar, C32226l<? super CharSequence, C13598b0> lVar, CharSequence charSequence3, TextView textView, C32226l<? super CharSequence, C13598b0> lVar2) {
            this.f192808d = sVar;
            this.f192809e = charSequence;
            this.f192810f = charSequence2;
            this.f192811g = i;
            this.f192812h = qVar;
            this.f192813i = lVar;
            this.f192814j = charSequence3;
            this.f192815n = textView;
            this.f192816o = lVar2;
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C32226l<CharSequence, C13598b0> lVar = this.f192813i;
            CharSequence charSequence = this.f192814j;
            TextView textView = this.f192815n;
            CharSequence charSequence2 = this.f192809e;
            CharSequence charSequence3 = this.f192810f;
            C32228q<String, CharSequence, Integer, CharSequence> qVar = this.f192812h;
            C32226l<CharSequence, C13598b0> lVar2 = this.f192816o;
            C67133s sVar = this.f192808d;
            C67133s.m79392h(lVar, charSequence, textView, charSequence2, charSequence3, qVar, lVar2, sVar.mo91241a(sVar.f192747a, charSequence2, charSequence3, this.f192811g, qVar));
            long currentTimeMillis2 = System.currentTimeMillis();
            C67127b0.m79385a(">>>>>performance: " + (currentTimeMillis2 - currentTimeMillis) + LocaleUtil.MALAY);
        }
    }

    public C67147z(TextView textView, C32226l<? super CharSequence, C13598b0> lVar, C67133s sVar, CharSequence charSequence, CharSequence charSequence2, int i, C32228q<? super String, ? super CharSequence, ? super Integer, ? extends CharSequence> qVar, CharSequence charSequence3, C32226l<? super CharSequence, C13598b0> lVar2) {
        this.f192799d = textView;
        this.f192800e = lVar;
        this.f192801f = sVar;
        this.f192802g = charSequence;
        this.f192803h = charSequence2;
        this.f192804i = i;
        this.f192805j = qVar;
        this.f192806n = charSequence3;
        this.f192807o = lVar2;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f192799d.removeOnLayoutChangeListener(this);
        if (this.f192799d.getLayout() == null) {
            C32226l<CharSequence, C13598b0> lVar = this.f192800e;
            CharSequence text = this.f192799d.getText();
            C87412m.m108593f(text, "textview.text");
            lVar.invoke(text);
            return;
        }
        TextView textView = this.f192799d;
        textView.post(new C67148a(this.f192801f, this.f192802g, this.f192803h, this.f192804i, this.f192805j, this.f192800e, this.f192806n, textView, this.f192807o));
    }
}
