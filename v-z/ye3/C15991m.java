package ye3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ke3.C88144b;

/* renamed from: ye3.m */
public final class C15991m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public static final C15991m f43037d = new C15991m();

    public final void onClick(DialogInterface dialogInterface, int i) {
        C88144b.m109791i(MMApplicationContext.getContext(), "setting", ".ui.setting.SettingsAccountInfoUI", new Intent(), (Bundle) null);
    }
}
