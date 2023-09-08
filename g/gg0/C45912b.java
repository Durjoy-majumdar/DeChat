package gg0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindGoogleContactUI;

/* renamed from: gg0.b */
public class C45912b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f123888d;

    /* renamed from: e */
    public final /* synthetic */ BindGoogleContactUI f123889e;

    public C45912b(BindGoogleContactUI bindGoogleContactUI, String str) {
        this.f123889e = bindGoogleContactUI;
        this.f123888d = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        BindGoogleContactUI bindGoogleContactUI = this.f123889e;
        String str = this.f123888d;
        int i2 = BindGoogleContactUI.f108550s;
        bindGoogleContactUI.f108554g = str;
        bindGoogleContactUI.mo63131I7(0);
    }
}
