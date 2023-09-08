package p171il;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import ke3.C88144b;
import qo3.C47883u;

/* renamed from: il.g */
public final class C8927g implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f28233a;

    public C8927g(Context context) {
        this.f28233a = context;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("key_emoji_panel_type", 1);
            C88144b.m109791i(this.f28233a, "emoji", ".ui.EmojiCustomUI", intent, (Bundle) null);
        }
    }
}
