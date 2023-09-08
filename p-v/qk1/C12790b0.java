package qk1;

import android.text.Spanned;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import ok1.C62042e;

/* renamed from: qk1.b0 */
public final class C12790b0 extends C45078p0 {

    /* renamed from: f */
    public final /* synthetic */ int f36612f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12790b0(int i, C45078p0.C45079a aVar) {
        super(i, aVar);
        this.f36612f = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        C45078p0.C45079a aVar = C45078p0.C45079a.MODE_CHINESE_AS_2;
        if ((spanned != null ? spanned.length() : 0) > i3) {
            i5 = C45078p0.m49926e(String.valueOf(spanned != null ? spanned.subSequence(0, i3) : null), aVar);
        } else {
            i5 = C45078p0.m49926e(String.valueOf(spanned), aVar);
        }
        int e = (spanned == null || spanned.length() <= i4) ? 0 : C45078p0.m49926e(spanned.subSequence(i4, spanned.length()).toString(), aVar);
        int e2 = C45078p0.m49926e(String.valueOf(charSequence), aVar);
        int i6 = (this.f36612f - i5) - e;
        return e2 > i6 ? C62042e.f176370a.mo86997D0(String.valueOf(charSequence), i6, false) : charSequence == null ? "" : charSequence;
    }
}
