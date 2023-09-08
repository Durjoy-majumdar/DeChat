package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import ob0.C117747y;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI */
public class WcPayRealnameVerifySuccessUI extends WalletBaseUI {

    /* renamed from: d */
    public Button f209261d;

    /* renamed from: e */
    public Button f209262e;

    /* renamed from: f */
    public TextView f209263f;

    /* renamed from: g */
    public TextView f209264g;

    /* renamed from: h */
    public ImageView f209265h;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI$a */
    public class C72137a implements MenuItem.OnMenuItemClickListener {
        public C72137a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C79143a.m95764c(WcPayRealnameVerifySuccessUI.this.getContext(), WcPayRealnameVerifySuccessUI.this.getInput(), 0);
            return false;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chi;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.f2932f));
        hideActionbarLine();
        showHomeBtn(false);
        setMMTitle("");
        this.f209263f = (TextView) findViewById(C0966R.C0970id.lti);
        this.f209264g = (TextView) findViewById(C0966R.C0970id.lth);
        this.f209265h = (ImageView) findViewById(C0966R.C0970id.ltj);
        this.f209261d = (Button) findViewById(C0966R.C0970id.ltf);
        this.f209262e = (Button) findViewById(C0966R.C0970id.ltg);
        if (getInput().getInt("realname_verify_process_finish_err_jump") == 1) {
            this.f209261d.setVisibility(0);
            this.f209262e.setVisibility(0);
            this.f209265h.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_error1, getResources().getColor(C0966R.color.Red_100)));
            String string = getInput().getString("realname_verify_process_finish_page");
            if (!Util.isNullOrNil(string)) {
                this.f209261d.setText(string);
            }
            this.f209262e.setText(C0966R.string.f7926wf);
            this.f209261d.setOnClickListener(new C72142c0(this));
            this.f209262e.setOnClickListener(new C72143d0(this));
        } else {
            this.f209261d.setVisibility(8);
            this.f209262e.setVisibility(0);
            this.f209265h.setImageResource(C0966R.raw.realname_done);
            String string2 = getInput().getString("realname_verify_process_finish_page");
            if (!Util.isNullOrNil(string2)) {
                this.f209262e.setText(string2);
            }
            this.f209262e.setOnClickListener(new C72145e0(this));
        }
        String string3 = getInput().getString("realname_verify_process_finish_title");
        String string4 = getInput().getString("realname_verify_process_finish_desc");
        if (!Util.isNullOrNil(string3)) {
            this.f209263f.setText(string3);
        }
        if (!Util.isNullOrNil(string4)) {
            this.f209264g.setText(string4);
            this.f209264g.setVisibility(0);
        }
        setBackBtn(new C72137a());
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
