package a71;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;

/* renamed from: a71.l */
public final class C0015l implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f16d;

    public C0015l(Context context) {
        this.f16d = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent();
        intent.putExtra("key_emoji_panel_type", 1);
        C88144b.m109791i(this.f16d, "emoji", ".ui.EmojiCustomUI", intent, (Bundle) null);
    }
}
