package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.v2 */
public class C19422v2 implements DialogInterface.OnKeyListener {

    /* renamed from: d */
    public final /* synthetic */ Context f54849d;

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.v2$a */
    public class C19423a implements DialogInterface.OnClickListener {
        public C19423a(C19422v2 v2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            LuggageUploadMediaFileManager.f69723g.cancel();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.v2$b */
    public class C19424b implements DialogInterface.OnClickListener {
        public C19424b(C19422v2 v2Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public C19422v2(Context context) {
        this.f54849d = context;
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        Context context = this.f54849d;
        C76879j.m92717K(context, true, context.getString(C0966R.string.lg_), "", this.f54849d.getString(C0966R.string.lg6), this.f54849d.getString(C0966R.string.lg7), new C19423a(this), new C19424b(this));
        return true;
    }
}
