package com.tencent.p014mm.p136ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.ui.conversation.g2 */
public class C6962g2 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SharedPreferences f24667d;

    /* renamed from: e */
    public final /* synthetic */ Context f24668e;

    public C6962g2(SharedPreferences sharedPreferences, Context context) {
        this.f24667d = sharedPreferences;
        this.f24668e = context;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f24667d.edit().putInt("show_rating_flag", 1).commit();
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        C6964i2.f24671a = null;
        C6964i2.m7232b(this.f24668e, true);
        Log.m105918d("MicroMsg.MainUI.RatingDialogHelper", "[oneliang]show rating dialog from enjoy app dialog.");
    }
}
