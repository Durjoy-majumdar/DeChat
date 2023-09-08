package com.tencent.p014mm.smiley;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96940i;
import com.tencent.p014mm.smiley.C96961p;
import com.tencent.p014mm.smiley.C96965r;
import de3.C58258h;
import di3.C86301e;
import ei3.C86522b;
import go3.C76003c;
import gy3.C8479f0;
import gy3.C87412m;
import p008bq.C54531o1;
import pl3.C100822b;

@C86522b(creator = C30715q0.class)
/* renamed from: com.tencent.mm.smiley.p0 */
public class C96963p0 extends C86301e implements C58258h, C54531o1 {

    /* renamed from: e */
    public static C96963p0 f284062e;

    /* renamed from: d */
    public int f284063d = 300;

    public static C96963p0 wx0() {
        if (f284062e == null) {
            f284062e = new C96963p0();
        }
        return f284062e;
    }

    /* renamed from: L3 */
    public boolean mo83003L3(CharSequence charSequence) {
        C96931e a = C96931e.m124499a();
        String charSequence2 = charSequence.toString();
        a.getClass();
        boolean z = C96965r.f284067d;
        C96965r.C44649c.f121057a.getClass();
        if (charSequence2 != null) {
            if (!(charSequence2.length() == 0)) {
                C96940i iVar = C96940i.C96942b.f283995a;
                int length = charSequence2.length();
                C96951l lVar = new C96951l(iVar.f283994e);
                C8479f0 f0Var = new C8479f0();
                lVar.mo135537a(charSequence2, 0, length, new C96949k(f0Var));
                C96974x xVar = (C96974x) f0Var.f27484d;
                return xVar != null && (xVar instanceof C96973t0);
            }
        }
    }

    /* renamed from: M */
    public SpannableString mo83004M(Context context, CharSequence charSequence) {
        if (charSequence == null || Util.isNullOrNil(charSequence.toString())) {
            return new SpannableString("");
        }
        SpannableString spannableString = charSequence instanceof SpannableString ? (SpannableString) charSequence : new SpannableString(charSequence);
        if (Util.isNullOrNil(spannableString.toString())) {
            return new SpannableString("");
        }
        PInt pInt = new PInt();
        pInt.value = this.f284063d;
        C96931e a = C96931e.m124499a();
        int length = spannableString.length();
        a.getClass();
        if (spannableString.length() != 0) {
            C96935g gVar = new C96935g(a, new PInt(0), pInt.value, new C96933f(a, spannableString));
            C96961p pVar = C96961p.C96962a.f284061a;
            pVar.getClass();
            new C96951l(pVar.f284060a).mo135537a(spannableString, 0, length, gVar);
        }
        vx0(spannableString, 0, spannableString.length(), 1);
        return spannableString;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /* renamed from: R2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo83005R2(java.lang.CharSequence r6) {
        /*
            r5 = this;
            com.tencent.mm.smiley.j0 r0 = com.tencent.p014mm.smiley.C96945j0.m124519b()
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "source"
            gy3.C87412m.m108594g(r6, r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r6)
            r2 = 0
            if (r1 == 0) goto L_0x0016
            goto L_0x003b
        L_0x0016:
            com.tencent.mm.smiley.g0 r0 = r0.f284016q
            int r1 = r6.length()
            com.tencent.mm.smiley.l r3 = new com.tencent.mm.smiley.l
            com.tencent.mm.smiley.o0 r0 = r0.f283975a
            r3.<init>(r0)
            gy3.f0 r0 = new gy3.f0
            r0.<init>()
            com.tencent.mm.smiley.i0 r4 = new com.tencent.mm.smiley.i0
            r4.<init>(r0)
            r3.mo135537a(r6, r2, r1, r4)
            T r6 = r0.f27484d
            com.tencent.mm.smiley.x r6 = (com.tencent.p014mm.smiley.C96974x) r6
            boolean r0 = r6 instanceof com.tencent.p014mm.smiley.C96932e0
            if (r0 == 0) goto L_0x003b
            com.tencent.mm.smiley.e0 r6 = (com.tencent.p014mm.smiley.C96932e0) r6
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            if (r6 == 0) goto L_0x003f
            r2 = 1
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.smiley.C96963p0.mo83005R2(java.lang.CharSequence):boolean");
    }

    public void vx0(Spannable spannable, int i, int i2, int i3) {
        if (spannable != null && ((C76003c[]) spannable.getSpans(i, i2, C76003c.class)).length > 0) {
            for (C100822b removeSpan : (C100822b[]) spannable.getSpans(i, i2, C100822b.class)) {
                spannable.removeSpan(removeSpan);
            }
            C100822b bVar = new C100822b(i, i2, i3);
            CharSequence subSequence = spannable.subSequence(i, i2);
            C87412m.m108594g(subSequence, "<set-?>");
            bVar.f295335b = subSequence;
            spannable.setSpan(bVar, i, i2, 33);
        }
    }
}
