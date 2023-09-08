package zk1;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import com.tencent.p014mm.C0966R;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;
import nj3.C76912y0;
import z04.C112550d0;

/* renamed from: zk1.c0 */
public final class C16221c0 implements InputFilter {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43444d;

    public C16221c0(C16229h hVar) {
        this.f43444d = hVar;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Editable text = this.f43444d.mo14765g3().getText();
        if (!charSequence.toString().contentEquals("\n")) {
            return null;
        }
        C87412m.m108593f(text, MimeTypes.BASE_TYPE_TEXT);
        if (!C112550d0.m153805y(text, "\n", false, 2, (Object) null)) {
            int i5 = 0;
            for (int i6 = 0; i6 < text.length(); i6++) {
                if (text.charAt(i6) == 10) {
                    i5++;
                }
            }
            if (i5 < 4) {
                return charSequence;
            }
            C76912y0.m92773l(this.f43444d.getActivity(), this.f43444d.getActivity().getString(C0966R.string.dzn));
        }
        return "";
    }
}
