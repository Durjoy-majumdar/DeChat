package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import a14.C53895h;
import a14.C53934p0;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.C54208j0;
import cx1.C45220b;
import mx1.C47127f;
import mx1.C47137m;
import wx3.C15601d;
import wx3.C66212f;
import z04.C112550d0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.i */
public final class C41726i implements TextWatcher {

    /* renamed from: d */
    public final /* synthetic */ C47127f f112305d;

    /* renamed from: e */
    public final /* synthetic */ C41730m f112306e;

    public C41726i(C47127f fVar, C41730m mVar) {
        this.f112305d = fVar;
        this.f112306e = mVar;
    }

    public void afterTextChanged(Editable editable) {
        String obj = C112550d0.m153799i0(String.valueOf(editable)).toString();
        if ((obj.length() == 0) || !(!C112551y.m153811k(obj))) {
            C45220b value = this.f112305d.f126627d.getValue();
            if (value != null) {
                C41729l.m45220a(C41729l.f112309a, value, this.f112306e, false);
                return;
            }
            return;
        }
        C47127f fVar = this.f112305d;
        fVar.getClass();
        String str = fVar.f126629f;
        if (str != null) {
            C53895h.m60466d(C54208j0.m60899a(fVar), (C66212f) fVar.f126634n.getValue(), (C53934p0) null, new C47137m(fVar, obj, str, (C15601d<? super C47137m>) null), 2, (Object) null);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
