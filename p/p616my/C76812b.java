package p616my;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.sdk.platformtools.Log;
import de3.C45335p;
import de3.C75354a;
import de3.C75355a0;
import de3.C75359b0;
import de3.C75362d0;
import de3.C75365k;
import de3.C75366l;
import de3.C75367m;
import de3.C75368n;
import de3.C75370s;
import de3.C75374t;
import di3.C86301e;
import ei3.C86522b;
import go3.C76003c;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import p629ny.C76976e;
import p629ny.C76978g;
import p629ny.C76979h;
import q90.C101062d;
import sx3.C64197v;

@C86522b
/* renamed from: my.b */
public class C76812b extends C86301e implements C76979h, C76978g {
    public C75359b0 Co0(String str, int i, int i2, boolean z, C75367m mVar) {
        return new C75370s.C75373c(str, i, i2, z, mVar);
    }

    public CharSequence D60(Context context, CharSequence charSequence, int i) {
        return C75370s.m90375a(context, charSequence, i);
    }

    public SpannableString Dv0(Context context, CharSequence charSequence, int i, int i2) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = true;
        d0Var.f221551e = true;
        d0Var.f221552f = true;
        d0Var.f221554h = C75370s.f221607b;
        d0Var.f221568v = i2;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221571y = false;
        d0Var.mo105698f((TextView) null);
        d0Var.f221546D = null;
        d0Var.f221572z = null;
        if (i2 == 1) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i2 == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
        }
        return d0Var.mo105696d(charSequence, i, true);
    }

    public SpannableString Eb0(Context context, CharSequence charSequence, float f, int i) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221556j = false;
        d0Var.f221557k = false;
        d0Var.f221551e = false;
        d0Var.f221552f = false;
        d0Var.f221559m = false;
        d0Var.f221568v = i;
        d0Var.f221555i = false;
        d0Var.f221571y = false;
        SpannableString d = d0Var.mo105696d(charSequence, 0, true);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) d.getSpans(0, d.length(), ClickableSpan.class);
        for (ClickableSpan removeSpan : clickableSpanArr) {
            d.removeSpan(removeSpan);
        }
        return d;
    }

    public SpannableString F10(TextView textView) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        return C75370s.m90387m(textView.getContext(), textView, (int) textView.getTextSize(), (Object) null, (C76976e) null, 0);
    }

    public SpannableString Fv0(TextView textView, int i, int i2, Object obj) {
        return C75370s.m90384j(textView, i, i2, obj, (C76976e) null, true, true);
    }

    /* renamed from: GG */
    public void mo107047GG(Context context, List<String> list, String str, List<String> list2, TextView textView) {
        C75370s.m90389o(context, list, str, list2, Boolean.TRUE, textView);
    }

    public SpannableStringBuilder Ii0(Context context, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z) {
        return C75370s.m90376b(context, charSequence, charSequence2, drawable, z, true);
    }

    /* renamed from: Jh */
    public SpannableString mo107049Jh(Context context, CharSequence charSequence, int i, int i2) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = false;
        d0Var.f221551e = true;
        d0Var.f221552f = false;
        d0Var.f221554h = C75370s.f221607b;
        d0Var.f221564r = false;
        d0Var.f221568v = i2;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.f221557k = false;
        d0Var.f221560n = false;
        return d0Var.mo105696d(charSequence, i, true);
    }

    /* renamed from: Jo */
    public SpannableString mo107050Jo(Context context, CharSequence charSequence, int i, int i2, Object obj) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = true;
        d0Var.f221551e = true;
        d0Var.f221552f = true;
        d0Var.f221554h = C75370s.f221607b;
        d0Var.f221564r = true;
        d0Var.f221568v = i2;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.f221546D = obj;
        if (i2 == 1) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i2 == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
        }
        return d0Var.mo105696d(charSequence, i, true);
    }

    /* renamed from: Lq */
    public SpannableString mo107051Lq(Context context, CharSequence charSequence, int i, int i2, Object obj) {
        return C75370s.m90382h(context, charSequence, i, i2, obj, false);
    }

    /* renamed from: M6 */
    public SpannableString mo107052M6(TextView textView, int i, boolean z, Object obj) {
        return C75370s.m90385k(textView, i, z, obj);
    }

    public SpannableString N70(Context context, CharSequence charSequence, int i, int i2, Object obj, C76976e eVar) {
        return C75370s.m90381g(context, true, charSequence, i, i2, obj, eVar, -1);
    }

    /* renamed from: PB */
    public SpannableStringBuilder mo107054PB(Context context, CharSequence charSequence, Drawable drawable, boolean z) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(" ");
        if (!z) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        spannableStringBuilder.setSpan(new C76003c(drawable, 1), 0, 1, 17);
        spannableStringBuilder.append(" ");
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: Rj */
    public SpannableString mo107055Rj(TextView textView, int i, int i2, Object obj, C76976e eVar, boolean z) {
        return C75370s.m90384j(textView, i, i2, obj, eVar, z, true);
    }

    /* renamed from: S3 */
    public void mo107056S3(TextView textView, Spannable spannable) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        textView.setOnTouchListener(new C75374t(spannable, textView));
    }

    /* renamed from: T1 */
    public SpannableString mo107057T1(Context context, CharSequence charSequence) {
        return C75370s.m90380f(context, charSequence);
    }

    public <T> void T90(TextView textView, String str, List<C75365k<T>> list) {
        C87412m.m108594g(textView, "textView");
        C87412m.m108594g(str, "content");
        C87412m.m108594g(list, "objList");
        SpannableString spannableString = new SpannableString(str);
        int i = 0;
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C75365k kVar = (C75365k) next;
                spannableString.setSpan(new C75366l(i, kVar), kVar.f221576b, kVar.f221577c, 17);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        textView.setText(spannableString);
        textView.setOnTouchListener(new C75368n(spannableString, textView));
    }

    public SpannableString Te0(Context context, CharSequence charSequence, float f) {
        return C75370s.m90383i(context, charSequence, (int) f, false);
    }

    public void Wf0(Context context, List<String> list, String str, List<String> list2, Boolean bool, TextView textView) {
        C75370s.m90389o(context, list, str, list2, bool, textView);
    }

    /* renamed from: Zz */
    public SpannableString mo107061Zz(Context context, CharSequence charSequence, int i, int i2, Object obj, String str, int i3, C76976e eVar, boolean z) {
        return C75370s.m90388n(context, charSequence, i, i2, obj, str, i3, eVar, z);
    }

    public void bj0(C45335p pVar) {
        C75370s.f221606a.remove(pVar);
    }

    public CharSequence c80(Context context, CharSequence charSequence, Drawable drawable, boolean z) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        int length = charSequence.length();
        int i = length + 1;
        spannableStringBuilder.append(" ");
        if (!z) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        spannableStringBuilder.setSpan(new C76003c(drawable, 1), length, i, 18);
        return spannableStringBuilder;
    }

    public void clearCache() {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        Log.m105924i("MicroMsg.MMSpanManager", "clear MMSpanManager cache");
        ((C101062d) C75362d0.f221541E).clear();
    }

    public SpannableString d90(Context context, CharSequence charSequence, int i, int i2, Object obj, String str, int i3, C76976e eVar) {
        return C75370s.m90388n(context, charSequence, i, i2, obj, str, i3, eVar, true);
    }

    /* renamed from: eo */
    public SpannableString mo107066eo(Context context, CharSequence charSequence, int i, boolean z, int i2, Object obj) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221562p = true;
        d0Var.f221551e = true;
        d0Var.f221564r = true;
        d0Var.f221568v = i2;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.mo105698f((TextView) null);
        if (i2 == 1) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i2 == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
        }
        if (obj != null) {
            d0Var.f221546D = obj;
        }
        return d0Var.mo105696d(charSequence, i, z);
    }

    /* renamed from: gL */
    public String mo107067gL(String str) {
        return C75370s.m90378d(str);
    }

    public SpannableString hv0(Context context, CharSequence charSequence, int i, int i2, Object obj, boolean z) {
        return C75370s.m90382h(context, charSequence, i, i2, obj, z);
    }

    /* renamed from: iE */
    public SpannableStringBuilder mo107069iE(Context context, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z, boolean z2) {
        return C75370s.m90376b(context, charSequence, charSequence2, drawable, z, z2);
    }

    /* renamed from: jH */
    public SpannableString mo107070jH(Context context, CharSequence charSequence, float f, boolean z) {
        return C75370s.m90379e(context, charSequence, (int) f, z);
    }

    public void k30(C45335p pVar) {
        C75370s.f221606a.add(pVar);
    }

    public SpannableString k80(TextView textView, int i, int i2, Object obj, C76976e eVar, boolean z, boolean z2) {
        return C75370s.m90384j(textView, i, i2, obj, eVar, z, z2);
    }

    /* renamed from: mM */
    public SpannableString mo107073mM(Context context, CharSequence charSequence, int i, int i2, Object obj) {
        return C75370s.m90381g(context, true, charSequence, i, i2, obj, (C76976e) null, -1);
    }

    public SpannableString mt0(TextView textView, int i, int i2, C75354a aVar, int i3, Object obj) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
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
        d0Var.f221554h = C75370s.f221607b;
        d0Var.f221568v = i;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221561o = C75370s.m90377c(i);
        d0Var.f221571y = true;
        d0Var.f221546D = obj;
        d0Var.mo105698f(textView);
        d0Var.f221543A = i2;
        d0Var.f221544B = aVar;
        d0Var.f221545C = i3;
        if (i == 1) {
            d0Var.f221557k = true;
            d0Var.f221560n = true;
        } else if (i == 2) {
            d0Var.f221557k = false;
            d0Var.f221560n = false;
        }
        return d0Var.mo105696d(textView.getText(), textSize, true);
    }

    public SpannableString o80(Context context, CharSequence charSequence, int i, int i2, Object obj, String str, boolean z) {
        return C75370s.m90388n(context, charSequence, i, i2, obj, str, 0, (C76976e) null, z);
    }

    /* renamed from: oL */
    public SpannableString mo107076oL(TextView textView, int i, Object obj) {
        return C75370s.m90385k(textView, i, true, obj);
    }

    public SpannableString op0(Context context, CharSequence charSequence, int i) {
        return C75370s.m90383i(context, charSequence, 0, true);
    }

    /* renamed from: or */
    public SpannableString mo107078or(Context context, CharSequence charSequence, int i, int i2, Object obj, String str) {
        return C75370s.m90388n(context, charSequence, i, i2, obj, str, 0, (C76976e) null, true);
    }

    /* renamed from: pD */
    public SpannableString mo107079pD(TextView textView, int i) {
        return C75370s.m90384j(textView, i, 0, (Object) null, (C76976e) null, true, true);
    }

    /* renamed from: qH */
    public SpannableString mo107080qH(Context context, CharSequence charSequence, int i) {
        return C75370s.m90379e(context, charSequence, i, true);
    }

    /* renamed from: qu */
    public SpannableString mo107081qu(Context context, CharSequence charSequence, int i) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
        C75362d0 d0Var = new C75362d0(context);
        d0Var.f221555i = false;
        d0Var.f221551e = true;
        d0Var.f221552f = true;
        d0Var.f221553g = false;
        d0Var.f221562p = false;
        d0Var.f221563q = false;
        d0Var.f221564r = false;
        d0Var.f221568v = 1;
        d0Var.f221556j = false;
        d0Var.f221559m = false;
        d0Var.f221557k = false;
        d0Var.f221560n = false;
        d0Var.f221571y = true;
        return d0Var.mo105696d(charSequence, i, true);
    }

    /* renamed from: uA */
    public SpannableString mo107082uA(Context context, boolean z, CharSequence charSequence, int i, int i2, Object obj, C76976e eVar, int i3) {
        return C75370s.m90381g(context, z, charSequence, i, i2, obj, eVar, i3);
    }

    /* renamed from: uC */
    public void mo107083uC(C76979h.C76981b bVar) {
        C75370s.f221609d = bVar;
    }

    /* renamed from: wk */
    public SpannableString mo107084wk(TextView textView, int i, int i2) {
        return C75370s.m90384j(textView, i, i2, (Object) null, (C76976e) null, true, true);
    }

    /* renamed from: xb */
    public SpannableString mo107085xb(TextView textView, int i, Object obj, String str, C76976e eVar) {
        LinkedList<C45335p> linkedList = C75370s.f221606a;
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
        d0Var.f221554h = C75370s.f221607b;
        d0Var.f221568v = i;
        d0Var.f221556j = true;
        d0Var.f221559m = false;
        d0Var.f221571y = true;
        d0Var.mo105698f(textView);
        d0Var.f221546D = obj;
        d0Var.f221572z = str;
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
        return d0Var.mo105696d(textView.getText(), textSize, true);
    }

    public View.OnTouchListener y40(Context context) {
        return new C75355a0();
    }

    public SpannableString yp0(Context context, CharSequence charSequence, float f) {
        return C75370s.m90383i(context, charSequence, 0, true);
    }
}
