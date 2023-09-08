package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import lg3.C76697h;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$l0 */
public class MsgHandler$$l0 implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ MsgHandler f22819d;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$l0$a */
    public class C6190a implements DialogInterface.OnClickListener {
        public C6190a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MsgHandler$$l0.this.f22819d.f22700g.cancel();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$l0$b */
    public class C6191b implements DialogInterface.OnClickListener {
        public C6191b(MsgHandler$$l0 msgHandler$$l0) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public MsgHandler$$l0(MsgHandler msgHandler) {
        this.f22819d = msgHandler;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Context context = this.f22819d.f22697d;
        C76879j.m92717K(context, true, C76697h.m92348a(context).getString(C0966R.string.lg_), "", C76697h.m92348a(this.f22819d.f22697d).getString(C0966R.string.lg6), C76697h.m92348a(this.f22819d.f22697d).getString(C0966R.string.lg7), new C6190a(), new C6191b(this));
        return true;
    }
}
