package vs1;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: vs1.j */
public final class C14995j implements InputFilter {

    /* renamed from: d */
    public final /* synthetic */ C14974a f41107d;

    public C14995j(C14974a aVar) {
        this.f41107d = aVar;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence.toString().contentEquals("\n")) {
            this.f41107d.f41049t = false;
        } else if (charSequence.toString().contentEquals(" ")) {
            C14974a aVar = this.f41107d;
            if (!aVar.f41049t) {
                aVar.f41049t = true;
                return null;
            }
        } else {
            this.f41107d.f41049t = false;
            return null;
        }
        return "";
    }
}
