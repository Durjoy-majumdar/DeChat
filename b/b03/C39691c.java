package b03;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C9493c;
import lz2.C46922e;
import qy2.C63347a;
import rz2.C48201c;
import uz2.C52669b0;
import uz2.C52676d1;
import uz2.C52678e0;
import uz2.C52679e1;
import uz2.C52716t0;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: b03.c */
public abstract class C39691c {

    /* renamed from: b03.c$a */
    public /* synthetic */ class C39692a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f106487a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f106488b;

        static {
            int[] iArr = new int[C63347a.C47891b.values().length];
            iArr[1] = 1;
            iArr[3] = 2;
            iArr[2] = 3;
            iArr[7] = 4;
            iArr[6] = 5;
            iArr[8] = 6;
            iArr[9] = 7;
            iArr[5] = 8;
            iArr[10] = 9;
            int[] iArr2 = new int[C63347a.C47893d.values().length];
            iArr2[1] = 1;
            f106487a = iArr2;
            int[] iArr3 = new int[C63347a.C47892c.values().length];
            iArr3[10] = 1;
            iArr3[7] = 2;
            iArr3[8] = 3;
            f106488b = iArr3;
        }
    }

    /* renamed from: S */
    public static /* synthetic */ void m42340S(C39691c cVar, ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar2, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            cVar.mo62288R(imageView, str, (i & 4) != 0 ? C63347a.C47893d.FILLED : dVar, (i & 8) != 0 ? C63347a.C47891b.DEFAULT : bVar, (i & 16) != 0 ? null : cVar2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIcon");
    }

    /* renamed from: A */
    public abstract boolean mo62271A();

    /* renamed from: B */
    public abstract boolean mo62272B();

    /* renamed from: C */
    public abstract boolean mo62273C();

    /* renamed from: D */
    public abstract boolean mo62274D();

    /* renamed from: E */
    public abstract boolean mo62275E();

    /* renamed from: F */
    public abstract boolean mo62276F();

    /* renamed from: G */
    public abstract boolean mo62277G();

    /* renamed from: H */
    public abstract boolean mo62278H();

    /* renamed from: I */
    public abstract boolean mo62279I();

    /* renamed from: J */
    public abstract boolean mo62280J(String str);

    /* renamed from: K */
    public void mo62281K() {
        IStatusIconHelperKt.f82192b.alive();
        IStatusIconHelperKt.f82193c.alive();
    }

    /* renamed from: L */
    public void mo62282L() {
        IStatusIconHelperKt.f82192b.dead();
        IStatusIconHelperKt.f82193c.dead();
    }

    /* renamed from: M */
    public final CharSequence mo62283M(View view, String str, CharSequence charSequence, int i, C63347a.C47893d dVar, C63347a.C47892c cVar) {
        String str2 = str;
        CharSequence charSequence2 = charSequence;
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(cVar, "iconScene");
        boolean z = true;
        if (str2 == null || C112551y.m153811k(str)) {
            return null;
        }
        if (charSequence2 == null || charSequence.length() == 0) {
            return null;
        }
        C48201c n0 = C39674e.f106452d.mo62253n0(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
        C39715n[] nVarArr = (C39715n[]) spannableStringBuilder.getSpans(0, charSequence2 != null ? charSequence.length() : 0, C39715n.class);
        C87412m.m108593f(nVarArr, "imgSpans");
        int length = nVarArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            spannableStringBuilder.removeSpan(nVarArr[i2]);
            i2++;
            z2 = true;
        }
        if (n0 != null) {
            ImageSpan k = IStatusIconHelperKt.m39109a().mo62299k(view, n0.field_IconID, dVar, n0.mo72947p2() ? C63347a.C47891b.GREY : C63347a.C47891b.DEFAULT, cVar, i, n0);
            if (!C112550d0.m153804x(spannableStringBuilder, 8199, false, 2, (Object) null)) {
                spannableStringBuilder.append(8199);
            }
            spannableStringBuilder.setSpan(k, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
        } else {
            z = z2;
        }
        if (z) {
            return spannableStringBuilder;
        }
        return null;
    }

    /* renamed from: N */
    public abstract void mo62284N(Integer num);

    /* renamed from: O */
    public abstract void mo62285O(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar);

    /* renamed from: P */
    public abstract void mo62286P(long j);

    /* renamed from: Q */
    public abstract void mo62287Q(String str);

    /* renamed from: R */
    public abstract void mo62288R(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C48201c cVar, boolean z, boolean z2);

    /* renamed from: a */
    public abstract boolean mo62289a(String str);

    /* renamed from: b */
    public abstract C52679e1 mo62290b();

    /* renamed from: c */
    public abstract String mo62291c(C52678e0 e0Var, int i, String str, int i2);

    /* renamed from: d */
    public abstract C52679e1 mo62292d();

    /* renamed from: e */
    public abstract String mo62293e();

    /* renamed from: f */
    public abstract String mo62294f();

    /* renamed from: g */
    public abstract ArrayList<C9493c> mo62295g();

    /* renamed from: h */
    public abstract ArrayList<C9493c> mo62296h();

    /* renamed from: i */
    public final Drawable mo62297i(Bitmap bitmap, boolean z, C63347a.C47893d dVar, C63347a.C47891b bVar) {
        int i;
        C87412m.m108594g(dVar, "iconType");
        C87412m.m108594g(bVar, "iconColor");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        if (z) {
            return bitmapDrawable;
        }
        if (C39692a.f106487a[dVar.ordinal()] == 1) {
            switch (bVar.ordinal()) {
                case 1:
                    i = -1;
                    break;
                case 2:
                    i = MMApplicationContext.getResources().getColor(C0966R.color.f2959af);
                    break;
                case 3:
                    i = MMApplicationContext.getResources().getColor(C0966R.color.f2939n);
                    break;
                case 5:
                    i = MMApplicationContext.getResources().getColor(C0966R.color.BW_0_Alpha_0_2);
                    break;
                case 6:
                    i = MMApplicationContext.getResources().getColor(C0966R.color.FG_1);
                    break;
                case 7:
                    i = MMApplicationContext.getResources().getColor(C0966R.color.FG_0);
                    break;
                case 8:
                    i = MMApplicationContext.getResources().getColor(C0966R.color.FG_2);
                    break;
                case 9:
                    i = MMApplicationContext.getResources().getColor(C0966R.color.FG_3);
                    break;
                default:
                    i = MMApplicationContext.getResources().getColor(C0966R.color.f2971b1);
                    break;
            }
            int alpha = Color.alpha(i);
            if (alpha != 0) {
                bitmapDrawable.setAlpha(alpha);
            }
            C74933u4.m89769f(bitmapDrawable, (i & 16777215) | -16777216);
        } else {
            int ordinal = bVar.ordinal();
            C74933u4.m89769f(bitmapDrawable, ordinal != 6 ? ordinal != 10 ? MMApplicationContext.getResources().getColor(C0966R.color.f2975b6) : MMApplicationContext.getResources().getColor(C0966R.color.a7f) : MMApplicationContext.getResources().getColor(C0966R.color.FG_1));
        }
        return bitmapDrawable;
    }

    /* renamed from: j */
    public abstract C52676d1 mo62298j(String str);

    /* renamed from: k */
    public abstract ImageSpan mo62299k(View view, String str, C63347a.C47893d dVar, C63347a.C47891b bVar, C63347a.C47892c cVar, int i, C48201c cVar2);

    /* renamed from: l */
    public abstract String mo62300l(String str);

    /* renamed from: m */
    public abstract String mo62301m(C52678e0 e0Var);

    /* renamed from: n */
    public abstract long mo62302n();

    /* renamed from: o */
    public abstract C52669b0 mo62303o();

    /* renamed from: p */
    public abstract void mo62304p(C52716t0 t0Var);

    /* renamed from: q */
    public abstract void mo62305q(C52716t0 t0Var);

    /* renamed from: r */
    public abstract void mo62306r(C52716t0 t0Var);

    /* renamed from: s */
    public abstract boolean mo62307s(C52716t0 t0Var, C46922e eVar);

    /* renamed from: t */
    public abstract void mo62308t();

    /* renamed from: u */
    public abstract boolean mo62309u();

    /* renamed from: v */
    public abstract boolean mo62310v();

    /* renamed from: w */
    public abstract boolean mo62311w();

    /* renamed from: x */
    public abstract boolean mo62312x();

    /* renamed from: y */
    public abstract boolean mo62313y(String str);

    /* renamed from: z */
    public abstract boolean mo62314z(C48201c cVar);
}
