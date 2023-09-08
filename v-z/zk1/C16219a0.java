package zk1;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import qn3.C77382c;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: zk1.a0 */
public final class C16219a0 implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43442d;

    public C16219a0(C16229h hVar) {
        this.f43442d = hVar;
    }

    public void afterTextChanged(Editable editable) {
        C16229h hVar = this.f43442d;
        String obj = hVar.mo14765g3().getText().toString();
        if (C112550d0.m153803w(obj, "\n\n", false, 2, (Object) null)) {
            int selectionEnd = hVar.mo14765g3().getSelectionEnd();
            hVar.mo14765g3().setText(C112551y.m153816p(obj, "\n\n", "\n", false, 4, (Object) null));
            MMEditText g3 = hVar.mo14765g3();
            int i = selectionEnd - 1;
            if (i < 0) {
                i = 0;
            }
            g3.setSelection(i);
        } else if (C112551y.m153820t(obj, "\n", false, 2, (Object) null)) {
            int selectionEnd2 = hVar.mo14765g3().getSelectionEnd();
            hVar.mo14765g3().setText(C112550d0.m153777M(obj, "\n"));
            MMEditText g35 = hVar.mo14765g3();
            int i2 = selectionEnd2 - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            g35.setSelection(i2);
        }
        C16229h hVar2 = this.f43442d;
        C77382c b = C77382c.m93286b(hVar2.mo14765g3());
        int i3 = hVar2.f43475R;
        b.f225611e = 0;
        b.f225610d = i3;
        b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_2;
        b.f225607a = true;
        b.mo107499d(new C16265k(hVar2));
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
