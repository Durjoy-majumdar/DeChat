package vd3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileMobilePhoneView;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C9556a;
import nj3.C11184p0;
import p910lj.C76701a;

/* renamed from: vd3.v */
public class C14439v implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f40052d;

    /* renamed from: e */
    public final /* synthetic */ ProfileMobilePhoneView f40053e;

    public C14439v(ProfileMobilePhoneView profileMobilePhoneView, String str) {
        this.f40053e = profileMobilePhoneView;
        this.f40052d = str;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (i == 0) {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setFlags(268435456);
            intent.setData(Uri.parse("tel:" + this.f40052d));
            try {
                Context context = this.f40053e.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context, "com/tencent/mm/pluginsdk/ui/ProfileMobilePhoneView$3", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (ActivityNotFoundException unused) {
                Log.m105920e("MicroMsg.ProfileMobilePhoneView", "ActivityNotFoundException!");
            }
        } else if (i == 1) {
            ClipboardHelper.setText(this.f40053e.getContext(), (CharSequence) null, this.f40052d);
            C76701a.makeText(this.f40053e.getContext(), (CharSequence) this.f40053e.getResources().getString(C0966R.string.f7938wv), 0).show();
        }
    }
}
