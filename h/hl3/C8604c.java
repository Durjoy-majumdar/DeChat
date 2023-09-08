package hl3;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.privacy.ContactMgrUIBase;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: hl3.c */
public class C8604c implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ ContactMgrUIBase f27707d;

    public C8604c(ContactMgrUIBase contactMgrUIBase) {
        this.f27707d = contactMgrUIBase;
    }

    public void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.mo107144g(0, this.f27707d.getString(C0966R.string.f7432g4), C0966R.C0969drawable.bze);
        e0Var.mo107144g(1, this.f27707d.getString(C0966R.string.hm9), C0966R.C0969drawable.bze);
        e0Var.mo107144g(2, this.f27707d.getString(C0966R.string.f7431g3), C0966R.C0969drawable.bze);
    }
}
