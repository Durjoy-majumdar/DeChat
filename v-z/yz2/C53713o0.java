package yz2;

import android.content.DialogInterface;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDetailActivity;
import f40.C86709a0;
import gy3.C87412m;
import lz2.C46919a;
import nj3.C11184p0;
import nj3.C76879j;
import rz2.C48201c;
import vz2.C78501d;

/* renamed from: yz2.o0 */
public final class C53713o0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDetailActivity f150820d;

    /* renamed from: e */
    public final /* synthetic */ String f150821e;

    public C53713o0(TextStatusDetailActivity textStatusDetailActivity, String str) {
        this.f150820d = textStatusDetailActivity;
        this.f150821e = str;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == C0966R.C0970id.grz) {
            TextStatusDetailActivity textStatusDetailActivity = this.f150820d;
            textStatusDetailActivity.f206762p = C76879j.m92723Q(textStatusDetailActivity.getContext(), this.f150820d.getResources().getString(C0966R.string.jzl), this.f150820d.getResources().getString(C0966R.string.jzl), false, false, (DialogInterface.OnCancelListener) null);
            String str = this.f150821e;
            C87412m.m108593f(str, "statusId");
            C46919a aVar = new C46919a(str, 2);
            C86709a0.m107524d().mo123455a(5967, this.f150820d);
            C86709a0.m107524d().mo123460f(aVar);
            C78501d dVar = C78501d.f229945a;
            AppCompatActivity context = this.f150820d.getContext();
            C87412m.m108593f(context, "context");
            C78501d.m94806h(dVar, context, 43, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
        }
    }
}
