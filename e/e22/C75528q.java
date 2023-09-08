package e22;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelEditUI;

/* renamed from: e22.q */
public class C75528q implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelEditUI f221908d;

    public C75528q(ContactLabelEditUI contactLabelEditUI) {
        this.f221908d = contactLabelEditUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f221908d.setResult(0);
        this.f221908d.finish();
    }
}
