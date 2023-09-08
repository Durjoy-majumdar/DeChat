package com.tencent.p014mm.p136ui.transmit;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.smiley.C96963p0;

/* renamed from: com.tencent.mm.ui.transmit.RetransmitPreviewUI */
public class RetransmitPreviewUI extends MMActivity {

    /* renamed from: d */
    public String f165484d = null;

    /* renamed from: com.tencent.mm.ui.transmit.RetransmitPreviewUI$a */
    public class C57851a implements MenuItem.OnMenuItemClickListener {
        public C57851a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RetransmitPreviewUI.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6920s9;
    }

    public final void init() {
        setMMTitle("");
        this.f165484d = getIntent().getStringExtra("Retr_Msg_content");
        ((TextView) findViewById(C0966R.C0970id.f358336eh2)).setText(C96963p0.wx0().mo83004M(getContext(), this.f165484d));
        setBackBtn(new C57851a());
    }

    public void onBackPressed() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        init();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
