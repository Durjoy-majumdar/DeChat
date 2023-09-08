package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceExpireUI */
public class ExdeviceExpireUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceExpireUI$a */
    public class C18734a implements MenuItem.OnMenuItemClickListener {
        public C18734a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ExdeviceExpireUI.this.finish();
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a49;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cfb);
        setBackBtn(new C18734a());
    }
}
