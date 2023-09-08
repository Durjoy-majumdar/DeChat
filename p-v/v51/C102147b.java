package v51;

import android.content.Context;
import android.text.SpannableString;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.smiley.C96931e;
import com.tencent.p014mm.smiley.C96945j0;
import com.tencent.p014mm.smiley.C96953l0;
import com.tencent.p014mm.smiley.C96963p0;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.smiley.C96973t0;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8478d0;
import gy3.C87412m;
import p629ny.C76979h;
import z51.C79305f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: v51.b */
public class C102147b extends C86301e implements C79305f {
    /* renamed from: IF */
    public String mo109308IF(String str) {
        C96931e.m124499a().getClass();
        boolean z = C96965r.f284067d;
        C96965r rVar = C96965r.C44649c.f121057a;
        rVar.getClass();
        C87412m.m108594g(str, "content");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            C96973t0 e = rVar.mo135553e(codePointAt);
            if (e != null) {
                for (int appendCodePoint : e.f284096b) {
                    sb.appendCodePoint(appendCodePoint);
                }
            } else {
                sb.appendCodePoint(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "builder.toString()");
        return sb4;
    }

    /* renamed from: L3 */
    public boolean mo109309L3(CharSequence charSequence) {
        return C96963p0.wx0().mo83003L3(charSequence);
    }

    /* renamed from: M */
    public SpannableString mo109310M(Context context, CharSequence charSequence) {
        return C96963p0.wx0().mo83004M(context, charSequence);
    }

    /* renamed from: R2 */
    public boolean mo109311R2(CharSequence charSequence) {
        return C96963p0.wx0().mo83005R2(charSequence);
    }

    /* renamed from: T1 */
    public SpannableString mo109312T1(Context context, CharSequence charSequence) {
        return ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(context, charSequence);
    }

    /* renamed from: YP */
    public String mo109313YP(String str, String str2) {
        C96963p0.wx0().getClass();
        C96945j0 b = C96945j0.m124519b();
        C87412m.m108594g(str, "content");
        C87412m.m108594g(str2, "replacement");
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        C8478d0 d0Var = new C8478d0();
        b.f284016q.mo135529b(str, 0, length, new C96953l0(sb, str, d0Var, str2));
        int i = d0Var.f27483d;
        if (i < length) {
            sb.append(str, i, length);
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }
}
