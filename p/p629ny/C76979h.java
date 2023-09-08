package p629ny;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import de3.C75354a;
import de3.C75362d0;
import de3.C75370s;
import di3.C7335d;
import java.util.List;

/* renamed from: ny.h */
public interface C76979h extends C7335d {

    /* renamed from: w0 */
    public static final C76976e f224926w0 = new C76980a();

    /* renamed from: ny.h$a */
    public class C76980a implements C76976e {
        /* renamed from: a */
        public void mo107302a(C76977f fVar) {
            C75362d0 d0Var = (C75362d0) fVar;
            d0Var.getClass();
            d0Var.f221566t = C75370s.f221609d.mo1519a();
        }
    }

    /* renamed from: ny.h$b */
    public interface C76981b {
        /* renamed from: a */
        boolean mo1519a();
    }

    CharSequence D60(Context context, CharSequence charSequence, int i);

    SpannableString Dv0(Context context, CharSequence charSequence, int i, int i2);

    SpannableString Eb0(Context context, CharSequence charSequence, float f, int i);

    SpannableString F10(TextView textView);

    SpannableString Fv0(TextView textView, int i, int i2, Object obj);

    /* renamed from: GG */
    void mo107047GG(Context context, List<String> list, String str, List<String> list2, TextView textView);

    SpannableStringBuilder Ii0(Context context, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z);

    /* renamed from: Jh */
    SpannableString mo107049Jh(Context context, CharSequence charSequence, int i, int i2);

    /* renamed from: Jo */
    SpannableString mo107050Jo(Context context, CharSequence charSequence, int i, int i2, Object obj);

    /* renamed from: Lq */
    SpannableString mo107051Lq(Context context, CharSequence charSequence, int i, int i2, Object obj);

    /* renamed from: M6 */
    SpannableString mo107052M6(TextView textView, int i, boolean z, Object obj);

    SpannableString N70(Context context, CharSequence charSequence, int i, int i2, Object obj, C76976e eVar);

    /* renamed from: PB */
    SpannableStringBuilder mo107054PB(Context context, CharSequence charSequence, Drawable drawable, boolean z);

    /* renamed from: Rj */
    SpannableString mo107055Rj(TextView textView, int i, int i2, Object obj, C76976e eVar, boolean z);

    /* renamed from: S3 */
    void mo107056S3(TextView textView, Spannable spannable);

    /* renamed from: T1 */
    SpannableString mo107057T1(Context context, CharSequence charSequence);

    SpannableString Te0(Context context, CharSequence charSequence, float f);

    void Wf0(Context context, List<String> list, String str, List<String> list2, Boolean bool, TextView textView);

    /* renamed from: Zz */
    SpannableString mo107061Zz(Context context, CharSequence charSequence, int i, int i2, Object obj, String str, int i3, C76976e eVar, boolean z);

    CharSequence c80(Context context, CharSequence charSequence, Drawable drawable, boolean z);

    void clearCache();

    SpannableString d90(Context context, CharSequence charSequence, int i, int i2, Object obj, String str, int i3, C76976e eVar);

    /* renamed from: eo */
    SpannableString mo107066eo(Context context, CharSequence charSequence, int i, boolean z, int i2, Object obj);

    /* renamed from: gL */
    String mo107067gL(String str);

    SpannableString hv0(Context context, CharSequence charSequence, int i, int i2, Object obj, boolean z);

    /* renamed from: iE */
    SpannableStringBuilder mo107069iE(Context context, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z, boolean z2);

    /* renamed from: jH */
    SpannableString mo107070jH(Context context, CharSequence charSequence, float f, boolean z);

    SpannableString k80(TextView textView, int i, int i2, Object obj, C76976e eVar, boolean z, boolean z2);

    /* renamed from: mM */
    SpannableString mo107073mM(Context context, CharSequence charSequence, int i, int i2, Object obj);

    SpannableString mt0(TextView textView, int i, int i2, C75354a aVar, int i3, Object obj);

    SpannableString o80(Context context, CharSequence charSequence, int i, int i2, Object obj, String str, boolean z);

    /* renamed from: oL */
    SpannableString mo107076oL(TextView textView, int i, Object obj);

    @Deprecated
    SpannableString op0(Context context, CharSequence charSequence, int i);

    /* renamed from: or */
    SpannableString mo107078or(Context context, CharSequence charSequence, int i, int i2, Object obj, String str);

    /* renamed from: pD */
    SpannableString mo107079pD(TextView textView, int i);

    /* renamed from: qH */
    SpannableString mo107080qH(Context context, CharSequence charSequence, int i);

    /* renamed from: qu */
    SpannableString mo107081qu(Context context, CharSequence charSequence, int i);

    /* renamed from: uA */
    SpannableString mo107082uA(Context context, boolean z, CharSequence charSequence, int i, int i2, Object obj, C76976e eVar, int i3);

    /* renamed from: uC */
    void mo107083uC(C76981b bVar);

    /* renamed from: wk */
    SpannableString mo107084wk(TextView textView, int i, int i2);

    /* renamed from: xb */
    SpannableString mo107085xb(TextView textView, int i, Object obj, String str, C76976e eVar);

    @Deprecated
    SpannableString yp0(Context context, CharSequence charSequence, float f);
}
