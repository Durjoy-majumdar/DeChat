package de3;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import go3.C76003c;
import i21.C33191e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import p629ny.C76976e;
import p629ny.C76979h;

/* renamed from: de3.s */
public class C75370s {

    /* renamed from: a */
    public static final LinkedList<C45335p> f221606a = C45336q.f122803e;

    /* renamed from: b */
    public static boolean f221607b = Util.isOverseasUser(MMApplicationContext.getContext());

    /* renamed from: c */
    public static final C76976e f221608c = C76979h.f224926w0;

    /* renamed from: d */
    public static C76979h.C76981b f221609d = new C75371a();

    /* renamed from: de3.s$a */
    public class C75371a implements C76979h.C76981b {
        /* renamed from: a */
        public boolean mo1519a() {
            return false;
        }
    }

    /* renamed from: de3.s$b */
    public class C75372b implements C75367m {

        /* renamed from: a */
        public final /* synthetic */ Context f221610a;

        public C75372b(Context context) {
            this.f221610a = context;
        }

        /* renamed from: a */
        public void mo12741a(String str) {
            Log.m105925i("MicroMsg.MMSpanManager", "click %s", str);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C88144b.m109791i(this.f221610a, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    /* renamed from: de3.s$c */
    public static class C75373c extends C75359b0 {

        /* renamed from: d */
        public boolean f221611d = true;

        /* renamed from: e */
        public boolean f221612e;

        /* renamed from: f */
        public String f221613f;

        /* renamed from: g */
        public C75367m f221614g;

        public C75373c(String str, int i, int i2, boolean z, C75367m mVar) {
            super(i, i2);
            this.f221612e = z;
            this.f221613f = str;
            this.f221614g = mVar;
        }

        public void onClick(View view) {
            C75367m mVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/span/MMSpanManager$LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f221611d && (mVar = this.f221614g) != null) {
                mVar.mo12741a(this.f221613f);
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/span/MMSpanManager$LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void setColor(int i, int i2) {
            super.setColor(i, i2);
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            if (this.f221612e) {
                C85875k4.m106189j0(textPaint, 0.8f);
            }
        }
    }

    /* renamed from: a */
    public static CharSequence m90375a(Context context, CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        int length = charSequence.length();
        spannableStringBuilder.append(" ");
        Drawable drawable = context.getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        C76003c cVar = new C76003c(drawable, 1);
        cVar.f222858d = 0;
        spannableStringBuilder.setSpan(cVar, length, length + 1, 18);
        return spannableStringBuilder;
    }

    /* renamed from: b */
    public static SpannableStringBuilder m90376b(Context context, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        int length = charSequence.length();
        int i = length + 1;
        if (z2) {
            spannableStringBuilder.append("  ");
        } else {
            spannableStringBuilder.append(" ");
        }
        spannableStringBuilder.append(m90380f(context, charSequence2));
        if (!z) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        spannableStringBuilder.setSpan(new C76003c(drawable, 1), length, i, 17);
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public static boolean m90377c(int i) {
        if (i != 2) {
        }
        C33191e eVar = (C33191e) C86312j.m106911c(C33191e.class);
        return eVar == null || !eVar.mo59011e();
    }

    /* renamed from: d */
    public static String m90378d(String str) {
        if (Util.isNullOrNil(str)) {
            return str;
        }
        C75362d0 d0Var = new C75362d0(MMApplicationContext.getContext());
        d0Var.f221555i = false;
        d0Var.f221551e = true;
        d0Var.f221552f = true;
        d0Var.f221562p = true;
        d0Var.f221563q = true;
        d0Var.f221564r = true;
        d0Var.f221568v = 1;
        d0Var.f221556j = false;
        d0Var.f221559m = false;
        d0Var.f221557k = false;
        d0Var.f221560n = false;
        d0Var.f221565s = false;
        d0Var.f221571y = false;
        return d0Var.mo105696d(str, 0, false).toString();
    }

    /* renamed from: e */
    public static SpannableString m90379e(Context context, CharSequence charSequence, int i, boolean z) {
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = false;
        d0Var.f221551e = true;
        d0Var.f221552f = true;
        d0Var.f221562p = true;
        d0Var.f221563q = z;
        d0Var.f221564r = true;
        d0Var.f221568v = 1;
        d0Var.f221556j = false;
        d0Var.f221559m = false;
        d0Var.f221557k = false;
        d0Var.f221560n = false;
        d0Var.f221571y = false;
        return d0Var.mo105696d(charSequence, i, true);
    }

    /* renamed from: f */
    public static SpannableString m90380f(Context context, CharSequence charSequence) {
        return m90383i(context, charSequence, 0, true);
    }

    /* renamed from: g */
    public static SpannableString m90381g(Context context, boolean z, CharSequence charSequence, int i, int i2, Object obj, C76976e eVar, int i3) {
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = z;
        d0Var.f221551e = z;
        d0Var.f221552f = z;
        d0Var.f221554h = f221607b && z;
        d0Var.f221568v = i2;
        d0Var.f221556j = z;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.f221561o = m90377c(i2) && z;
        d0Var.f221546D = obj;
        if (i2 == 1) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i2 == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
            if (i3 == -1) {
                i3 = 2;
            }
            d0Var.f221543A = i3;
        }
        if (eVar != null) {
            ((C76979h.C76980a) eVar).mo107302a(d0Var);
        }
        return d0Var.mo105696d(charSequence, i, true);
    }

    /* renamed from: h */
    public static SpannableString m90382h(Context context, CharSequence charSequence, int i, int i2, Object obj, boolean z) {
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = true;
        d0Var.f221551e = true;
        d0Var.f221552f = true;
        d0Var.f221554h = f221607b;
        d0Var.f221564r = true;
        d0Var.f221568v = i2;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.f221546D = obj;
        d0Var.f221567u = z;
        if (i2 == 1) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i2 == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
        }
        return d0Var.mo105696d(charSequence, i, false);
    }

    /* renamed from: i */
    public static SpannableString m90383i(Context context, CharSequence charSequence, int i, boolean z) {
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221556j = false;
        d0Var.f221557k = false;
        d0Var.f221551e = false;
        d0Var.f221552f = false;
        d0Var.f221559m = false;
        d0Var.f221555i = false;
        d0Var.f221571y = false;
        SpannableString d = d0Var.mo105696d(charSequence, i, z);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) d.getSpans(0, d.length(), ClickableSpan.class);
        for (ClickableSpan removeSpan : clickableSpanArr) {
            d.removeSpan(removeSpan);
        }
        return d;
    }

    /* renamed from: j */
    public static SpannableString m90384j(TextView textView, int i, int i2, Object obj, C76976e eVar, boolean z, boolean z2) {
        if (textView == null) {
            Log.m105920e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
            return new SpannableString("");
        }
        Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = true;
        d0Var.f221551e = true;
        d0Var.f221552f = z;
        d0Var.f221554h = f221607b;
        d0Var.f221568v = i;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221561o = m90377c(i);
        d0Var.f221571y = true;
        d0Var.f221546D = obj;
        d0Var.mo105698f(textView);
        d0Var.f221543A = i2;
        if (i == 1) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
        }
        if (eVar != null) {
            ((C76979h.C76980a) eVar).mo107302a(d0Var);
        }
        return d0Var.mo105696d(textView.getText(), textSize, z2);
    }

    /* renamed from: k */
    public static SpannableString m90385k(TextView textView, int i, boolean z, Object obj) {
        if (textView == null) {
            Log.m105920e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
            return new SpannableString("");
        }
        Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = true;
        d0Var.f221551e = true;
        d0Var.f221552f = true;
        d0Var.f221562p = true;
        d0Var.f221564r = true;
        d0Var.f221568v = i;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.mo105698f(textView);
        if (i == 1) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
        }
        if (obj != null) {
            d0Var.f221546D = obj;
        }
        return d0Var.mo105696d(textView.getText(), textSize, z);
    }

    /* renamed from: l */
    public static SpannableString m90386l(TextView textView, Object obj, C76976e eVar, int i) {
        if (textView == null) {
            Log.m105920e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
            return new SpannableString("");
        }
        return m90387m(textView.getContext(), textView, (int) textView.getTextSize(), obj, eVar, i);
    }

    /* renamed from: m */
    public static SpannableString m90387m(Context context, TextView textView, int i, Object obj, C76976e eVar, int i2) {
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = false;
        d0Var.f221551e = false;
        d0Var.f221552f = true;
        d0Var.f221554h = false;
        d0Var.f221556j = false;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.mo105698f(textView);
        d0Var.f221546D = obj;
        d0Var.f221568v = 1;
        d0Var.f221557k = false;
        d0Var.f221560n = false;
        d0Var.f221543A = i2;
        if (eVar != null) {
            ((C76979h.C76980a) eVar).mo107302a(d0Var);
        }
        return d0Var.mo105696d(textView.getText(), i, false);
    }

    /* renamed from: n */
    public static SpannableString m90388n(Context context, CharSequence charSequence, int i, int i2, Object obj, String str, int i3, C76976e eVar, boolean z) {
        C75362d0 p = m90390p(context, z, i2, obj, str);
        p.f221543A = i3;
        if (eVar != null) {
            ((C76979h.C76980a) eVar).mo107302a(p);
        }
        return p.mo105696d(charSequence, i, true);
    }

    /* renamed from: o */
    public static void m90389o(Context context, List<String> list, String str, List<String> list2, Boolean bool, TextView textView) {
        String str2 = str;
        TextView textView2 = textView;
        SpannableString spannableString = new SpannableString(str2);
        for (int i = 0; i < list2.size(); i++) {
            String str3 = list2.get(i);
            int indexOf = str2.indexOf(str3);
            int length = str3.length() + indexOf;
            if (indexOf < 0 || length > str.length()) {
                Context context2 = context;
                List<String> list3 = list;
            } else {
                spannableString.setSpan(new C75373c(list.get(i), MMApplicationContext.getContext().getResources().getColor(C0966R.color.a1d), MMApplicationContext.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_2), bool.booleanValue(), new C75372b(context)), indexOf, length, 17);
            }
        }
        if (textView2 != null) {
            textView2.setText(spannableString);
            textView2.setOnTouchListener(new C75374t(spannableString, textView2));
        }
    }

    /* renamed from: p */
    public static C75362d0 m90390p(Context context, boolean z, int i, Object obj, String str) {
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = z;
        d0Var.f221551e = z;
        d0Var.f221552f = z;
        boolean z2 = false;
        d0Var.f221554h = f221607b && z;
        d0Var.f221568v = i;
        d0Var.f221556j = z;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.mo105698f((TextView) null);
        d0Var.f221546D = obj;
        d0Var.f221572z = str;
        if (i == 1 || i == 4) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
        }
        if ("zh_CN".equals(LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()))) {
            d0Var.f221558l = z;
        }
        if (m90377c(i) && z) {
            z2 = true;
        }
        d0Var.f221561o = z2;
        return d0Var;
    }
}
