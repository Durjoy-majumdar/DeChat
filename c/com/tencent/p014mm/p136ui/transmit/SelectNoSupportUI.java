package com.tencent.p014mm.p136ui.transmit;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.transmit.SelectNoSupportUI */
public class SelectNoSupportUI extends MMActivity {

    /* renamed from: d */
    public String f24777d = "friend";

    /* renamed from: e */
    public TextView f24778e;

    /* renamed from: f */
    public TextView f24779f;

    /* renamed from: com.tencent.mm.ui.transmit.SelectNoSupportUI$a */
    public class C7023a implements MenuItem.OnMenuItemClickListener {
        public C7023a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectNoSupportUI selectNoSupportUI = SelectNoSupportUI.this;
            selectNoSupportUI.hideVKB();
            selectNoSupportUI.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bfh;
    }

    public void initView() {
        setMMTitle(getString(C0966R.string.ijb));
        this.f24778e = (TextView) findViewById(C0966R.C0970id.hgz);
        this.f24779f = (TextView) findViewById(C0966R.C0970id.hgy);
        this.f24778e.setText(getString(C0966R.string.ijm));
        if (!Util.isNullOrNil(this.f24777d)) {
            String str = this.f24777d;
            str.getClass();
            if (str.equals("friend")) {
                this.f24779f.setText(getString(C0966R.string.ijn));
            } else if (str.equals("sns")) {
                this.f24779f.setText(getString(C0966R.string.ijo));
            }
        }
        setBackBtn(new C7023a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SelectNoSupportUI", "onCreate!");
        this.f24777d = getIntent().getStringExtra("sharePictureTo");
        Log.m105924i("MicroMsg.SelectNoSupportUI", "initData done!");
        initView();
        Log.m105924i("MicroMsg.SelectNoSupportUI", "initView done!");
    }
}
