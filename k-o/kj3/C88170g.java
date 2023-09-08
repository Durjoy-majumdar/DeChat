package kj3;

import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import kj3.C88158f;
import nj3.C11184p0;

/* renamed from: kj3.g */
public class C88170g implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C88158f f254963d;

    public C88170g(C88158f fVar) {
        this.f254963d = fVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C88158f.C88169i iVar = this.f254963d.f254946c;
        if (iVar == null) {
            Log.m105920e("MicroMsg.AppBrandServiceActionSheet", "resetOnCreateMenuListener, state is null");
        } else {
            iVar.onMMMenuItemSelected(menuItem, i);
        }
    }
}
