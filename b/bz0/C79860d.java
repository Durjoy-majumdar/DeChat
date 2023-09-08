package bz0;

import android.text.Editable;
import android.widget.TextView;
import bz0.C79856a;
import go3.C87283v;
import gy3.C87412m;
import sx3.C110823p;

/* renamed from: bz0.d */
public final class C79860d extends C87283v {

    /* renamed from: d */
    public final /* synthetic */ C79856a f234008d;

    public C79860d(C79856a aVar) {
        this.f234008d = aVar;
    }

    public void afterTextChanged(Editable editable) {
        C79856a aVar = this.f234008d;
        TextView[] textViewArr = aVar.f234007f;
        if (textViewArr != null) {
            aVar.f234005d = C110823p.m150987M(textViewArr, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C67331j.f193172d, 30, (Object) null);
            C79865i iVar = new C79865i(aVar);
            int length = aVar.f234005d.length();
            boolean z = true;
            if (!(7 <= length && length < 9) || !((Boolean) iVar.invoke()).booleanValue()) {
                z = false;
            }
            C79856a.C79857a aVar2 = aVar.f234004c;
            if (aVar2 != null) {
                aVar2.mo110036a(aVar.f234005d, z);
                return;
            }
            return;
        }
        C87412m.m108603p("charViews");
        throw null;
    }
}
