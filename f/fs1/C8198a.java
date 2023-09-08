package fs1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import ke3.C88144b;
import kotlin.Result;
import qo3.C12925w;
import qo3.w$$d;
import rx3.C13598b0;
import sx3.C64186f0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import z04.C112550d0;
import zp3.C79406f;

/* renamed from: fs1.a */
public final class C8198a extends FrameLayout {

    /* renamed from: d */
    public View f27122d;

    /* renamed from: e */
    public C12925w f27123e;

    /* renamed from: fs1.a$b */
    public static final class C8200b extends ClickableSpan {

        /* renamed from: d */
        public final /* synthetic */ String f27127d;

        /* renamed from: e */
        public final /* synthetic */ C8198a f27128e;

        public C8200b(String str, C8198a aVar) {
            this.f27127d = str;
            this.f27128e = aVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C87412m.m108594g(view, "widget");
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f27127d);
            C88144b.m109791i(this.f27128e.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/license/FinderLawLicensePopupView$setLicenseText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            C87412m.m108594g(textPaint, "ds");
            textPaint.setColor(Color.parseColor("#7D90A9"));
            textPaint.setUnderlineText(false);
            textPaint.clearShadowLayer();
        }
    }

    /* renamed from: fs1.a$c */
    public static final class C8201c implements w$$d {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C15601d<Boolean>> f27129a;

        public C8201c(C8479f0<C15601d<Boolean>> f0Var) {
            this.f27129a = f0Var;
        }

        public final void onDismiss() {
            Log.m105924i("FinderLawLicensePopupView", "#dialog on dismiss");
            C15601d dVar = (C15601d) this.f27129a.f27484d;
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            }
            this.f27129a.f27484d = null;
        }
    }

    /* renamed from: fs1.a$d */
    public static final class C8202d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<C15601d<Boolean>> f27130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8202d(C8479f0<C15601d<Boolean>> f0Var) {
            super(0);
            this.f27130d = f0Var;
        }

        public Object invoke() {
            C15601d dVar = (C15601d) this.f27130d.f27484d;
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            }
            this.f27130d.f27484d = null;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8198a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo9240a(TextView textView, String str, String str2, String str3) {
        boolean z = true;
        if (!(str2.length() == 0)) {
            if (str3.length() != 0) {
                z = false;
            }
            if (!z) {
                int E = C112550d0.m153769E(str, str2, 0, false, 6, (Object) null);
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new C8200b(str3, this), E, str2.length() + E, 33);
                textView.setHighlightColor(getContext().getResources().getColor(17170445));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(spannableString);
                return;
            }
        }
        textView.setText(str);
    }

    /* renamed from: b */
    public final Object mo9241b(C8199a aVar, List<C8199a> list, C15601d<? super Boolean> dVar) {
        TextView textView;
        Button button;
        Button button2;
        T hVar = new C66218h(C66447b.m78392b(dVar));
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = hVar;
        C12925w wVar = new C12925w(getContext());
        wVar.f36937s = new C8201c(f0Var);
        if (list == null) {
            list = C64186f0.f181907d;
        }
        C8202d dVar2 = new C8202d(f0Var);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.czn, this, false);
        this.f27122d = inflate;
        if (!(inflate == null || (button2 = (Button) inflate.findViewById(C0966R.C0970id.azx)) == null)) {
            button2.setOnClickListener(new C8203b(this));
        }
        View view = this.f27122d;
        if (!(view == null || (button = (Button) view.findViewById(C0966R.C0970id.azy)) == null)) {
            button.setOnClickListener(new C8204c(this, dVar2));
        }
        View view2 = this.f27122d;
        if (!(view2 == null || (textView = (TextView) view2.findViewById(C0966R.C0970id.f3p)) == null)) {
            mo9240a(textView, aVar.f27124a, aVar.f27125b, aVar.f27126c);
        }
        View view3 = this.f27122d;
        LinearLayout linearLayout = view3 != null ? (LinearLayout) view3.findViewById(C0966R.C0970id.nfy) : null;
        for (C8199a next : list) {
            TextView textView2 = new TextView(getContext());
            textView2.setTextSize(15.0f);
            textView2.setPadding(0, C79406f.m96347a(MMApplicationContext.getContext(), 8.0f), 0, 0);
            textView2.setTextColor(getContext().getResources().getColor(C0966R.color.FG_1));
            mo9240a(textView2, next.f27124a, next.f27125b, next.f27126c);
            if (linearLayout != null) {
                linearLayout.addView(textView2);
            }
        }
        wVar.mo12471k(this.f27122d);
        wVar.mo5086o();
        this.f27123e = wVar;
        return hVar.mo90314b();
    }

    public final View getRoot() {
        return this.f27122d;
    }

    public final void setRoot(View view) {
        this.f27122d = view;
    }

    /* renamed from: fs1.a$a */
    public static final class C8199a {

        /* renamed from: a */
        public final String f27124a;

        /* renamed from: b */
        public final String f27125b;

        /* renamed from: c */
        public final String f27126c;

        public C8199a(String str, String str2, String str3) {
            C87412m.m108594g(str, "content");
            C87412m.m108594g(str2, "highLightInContent");
            C87412m.m108594g(str3, "url");
            this.f27124a = str;
            this.f27125b = str2;
            this.f27126c = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8199a)) {
                return false;
            }
            C8199a aVar = (C8199a) obj;
            return C87412m.m108589b(this.f27124a, aVar.f27124a) && C87412m.m108589b(this.f27125b, aVar.f27125b) && C87412m.m108589b(this.f27126c, aVar.f27126c);
        }

        public int hashCode() {
            return (((this.f27124a.hashCode() * 31) + this.f27125b.hashCode()) * 31) + this.f27126c.hashCode();
        }

        public String toString() {
            return "LawData(content=" + this.f27124a + ", highLightInContent=" + this.f27125b + ", url=" + this.f27126c + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C8199a(String str, String str2, String str3, int i, C8480h hVar) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }
    }
}
