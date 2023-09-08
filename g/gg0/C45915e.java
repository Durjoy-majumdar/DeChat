package gg0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindGoogleContactUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.CookieManager;

/* renamed from: gg0.e */
public class C45915e implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BindGoogleContactUI f123894d;

    public C45915e(BindGoogleContactUI bindGoogleContactUI) {
        this.f123894d = bindGoogleContactUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        BindGoogleContactUI bindGoogleContactUI = this.f123894d;
        int i2 = BindGoogleContactUI.f108550s;
        bindGoogleContactUI.getClass();
        try {
            CookieManager.getInstance().removeAllCookie();
        } catch (Exception unused) {
            Log.m105918d("Google Login", "Clear cookie failed");
        }
        this.f123894d.mo63133K7();
    }
}
