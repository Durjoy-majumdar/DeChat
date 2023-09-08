package com.tencent.p014mm.p136ui.contact;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.contact.p3 */
public class C6896p3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f24532d;

    /* renamed from: e */
    public final /* synthetic */ SelectContactUI f24533e;

    public C6896p3(SelectContactUI selectContactUI, String str) {
        this.f24533e = selectContactUI;
        this.f24532d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.SelectContactUI", "return the result");
        Intent intent = new Intent();
        intent.putExtra("Select_Contact", this.f24532d);
        intent.putExtra("Select_Conv_User", this.f24532d);
        intent.putExtra("Select_Contact", this.f24532d);
        this.f24533e.setResult(-1, intent);
        this.f24533e.finish();
    }
}
