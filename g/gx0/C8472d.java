package gx0;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.BrandServiceIndexUI;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import ke3.C88144b;
import nj3.C11184p0;
import p274xx.C15907f;
import u73.C14135q;

/* renamed from: gx0.d */
public class C8472d implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BrandServiceIndexUI f27475d;

    public C8472d(BrandServiceIndexUI brandServiceIndexUI) {
        this.f27475d = brandServiceIndexUI;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 1) {
            BrandServiceIndexUI brandServiceIndexUI = this.f27475d;
            int i2 = BrandServiceIndexUI.f12040h;
            brandServiceIndexUI.getClass();
            if (C43471q.m46984h(0)) {
                ((C14135q) C86312j.m106911c(C14135q.class)).mo13549kN(MMApplicationContext.getContext(), new C8473e(brandServiceIndexUI));
            } else {
                Log.m105920e("MicroMsg.BrandService.BrandServiceIndexUI", "fts h5 template not avail");
            }
        } else if (menuItem.getItemId() == 2) {
            BrandServiceIndexUI brandServiceIndexUI2 = this.f27475d;
            int i3 = BrandServiceIndexUI.f12040h;
            brandServiceIndexUI2.getClass();
            C88144b.m109791i(brandServiceIndexUI2, "brandservice", ".ui.userinfo.ui.BrandServiceUserInfoManageUI", new Intent(), (Bundle) null);
        } else if (menuItem.getItemId() == 3) {
            BrandServiceIndexUI brandServiceIndexUI3 = this.f27475d;
            int i4 = BrandServiceIndexUI.f12040h;
            ((C15907f) C86312j.m106911c(C15907f.class)).mo14554FQ(brandServiceIndexUI3, brandServiceIndexUI3.getContext().getResources().getString(C0966R.string.m2s), brandServiceIndexUI3.getContext().getResources().getString(C0966R.string.m3z), brandServiceIndexUI3.getContext().getResources().getString(C0966R.string.m2t), new C8474f(brandServiceIndexUI3));
        }
    }
}
