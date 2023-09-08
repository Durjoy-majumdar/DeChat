package com.tencent.p014mm.plugin.dbbackup;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.vfs.C86013q1;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.dbbackup.b$$c */
public final /* synthetic */ class b$$c implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f12187d;

    /* renamed from: e */
    public final /* synthetic */ Context f12188e;

    public /* synthetic */ b$$c(String str, Context context) {
        this.f12187d = str;
        this.f12188e = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.f12187d;
        Context context = this.f12188e;
        C86013q1.m106445f(str);
        C76701a.makeText(context, (CharSequence) "Corruption test database cleared.", 0).show();
    }
}
