package com.tencent.p014mm.p136ui.contact;

import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.contact.o3 */
public class C6895o3 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f24530d;

    /* renamed from: e */
    public final /* synthetic */ SelectContactUI f24531e;

    public C6895o3(SelectContactUI selectContactUI, String str) {
        this.f24531e = selectContactUI;
        this.f24530d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.m105924i("MicroMsg.SelectContactUI", "return the result,and create new label");
        Intent intent = new Intent();
        intent.putExtra("Select_Contact", this.f24530d);
        intent.putExtra("Select_Conv_User", this.f24530d);
        intent.putExtra("Select_Contact", this.f24530d);
        intent.putExtra("Select_Contacts_To_Create_New_Label", this.f24530d);
        this.f24531e.setResult(-1, intent);
        this.f24531e.finish();
    }
}
