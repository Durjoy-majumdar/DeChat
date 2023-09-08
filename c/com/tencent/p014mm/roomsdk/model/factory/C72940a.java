package com.tencent.p014mm.roomsdk.model.factory;

import android.content.Context;
import android.content.DialogInterface;
import pg3.C77084b;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.roomsdk.model.factory.a */
public abstract class C72940a {

    /* renamed from: a */
    public boolean f212612a = true;

    /* renamed from: b */
    public C77084b f212613b;

    /* renamed from: c */
    public C77084b f212614c;

    /* renamed from: d */
    public C77084b f212615d;

    /* renamed from: e */
    public C89779i0 f212616e;

    /* renamed from: a */
    public C72940a mo100868a(C77084b bVar) {
        this.f212615d = bVar;
        return this;
    }

    /* renamed from: c */
    public abstract void mo100865c();

    public abstract void cancel();

    /* renamed from: d */
    public abstract void mo100867d(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener);
}
