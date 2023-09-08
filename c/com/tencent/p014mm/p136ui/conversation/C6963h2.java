package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.conversation.h2 */
public class C6963h2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SharedPreferences f24669d;

    /* renamed from: e */
    public final /* synthetic */ Context f24670e;

    public C6963h2(SharedPreferences sharedPreferences, Context context) {
        this.f24669d = sharedPreferences;
        this.f24670e = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f24669d.edit().putInt("show_rating_flag", 2).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        C6964i2.f24671a = null;
        C6964i2.m7231a(this.f24670e);
        Log.m105918d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show feedback dialog.");
    }
}
