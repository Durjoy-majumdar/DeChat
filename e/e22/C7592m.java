package e22;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;

/* renamed from: e22.m */
public final class C7592m implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactEditLabel f25861d;

    public C7592m(ContactEditLabel contactEditLabel) {
        this.f25861d = contactEditLabel;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f25861d.setResult(0);
        this.f25861d.finish();
    }
}
