package rd1;

import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import je1.C9385w3;
import nj3.C11184p0;
import rs1.C13442s8;
import te3.C49712hj1;
import te3.C52271zj0;

/* renamed from: rd1.d */
public final class C12979d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C12974b f37009d;

    public C12979d(C12974b bVar) {
        this.f37009d = bVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        String str;
        if (menuItem.getItemId() == 10001) {
            C12974b bVar = this.f37009d;
            C52271zj0 zj02 = bVar.f37003g;
            if (zj02 != null) {
                FinderContact finderContact = zj02.f146006e;
                if (finderContact == null || (str = finderContact.username) == null) {
                    str = "";
                }
                C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62444c(bVar.f32250d).mo75002a(C13442s8.class)).mo12861q3();
                C9385w3 w3Var = new C9385w3(1, Long.valueOf(zj02.f146005d), str, (Long) null, q3);
                AppCompatActivity appCompatActivity = bVar.f32250d;
                w3Var.mo85584j1(appCompatActivity, appCompatActivity.getResources().getString(C0966R.string.ett), 500);
                C86709a0.m107524d().mo123460f(new C9385w3(1, Long.valueOf(zj02.f146005d), str, (Long) null, q3));
                return;
            }
            Log.m105924i("FinderActivityShareHandler", "closeActivity invalid eventInfo null");
        }
    }
}
