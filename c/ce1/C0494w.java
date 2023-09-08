package ce1;

import android.text.Editable;
import android.widget.CompoundButton;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import gy3.C87412m;

/* renamed from: ce1.w */
public final class C0494w implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0479p f1218a;

    public C0494w(C0479p pVar) {
        this.f1218a = pVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C0479p pVar = this.f1218a;
        MMEditText mMEditText = pVar.f1183e;
        if (mMEditText != null) {
            Editable text = mMEditText.getText();
            int i = 0;
            int length = text != null ? text.length() : 0;
            MMEditText mMEditText2 = this.f1218a.f1184f;
            if (mMEditText2 != null) {
                Editable text2 = mMEditText2.getText();
                if (text2 != null) {
                    i = text2.length();
                }
                C0479p.m421d3(pVar, length, i);
                return;
            }
            C87412m.m108603p("descEdit");
            throw null;
        }
        C87412m.m108603p("nameEdit");
        throw null;
    }
}
