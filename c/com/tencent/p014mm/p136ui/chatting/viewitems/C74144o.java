package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.o */
public class C74144o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74103m f217651d;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.o$a */
    public class C74145a implements DialogInterface.OnCancelListener {
        public C74145a(C74144o oVar) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public C74144o(C74103m mVar) {
        this.f217651d = mVar;
    }

    public void run() {
        C74103m mVar = this.f217651d;
        if (mVar.f217502F == null) {
            mVar.f217502F = C76879j.m92722P(mVar.f217504w.mo91565f(), this.f217651d.f217504w.mo91565f().getString(C0966R.string.a3h), 3, this.f217651d.f217504w.mo91565f().getString(C0966R.string.hd_), true, false, new C74145a(this));
        }
        this.f217651d.f217502F.show();
    }
}
