package com.tencent.p014mm.plugin.wallet_payu.order.p808ui;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import ob0.C117747y;
import te3.C51090rc3;
import w63.C53086c;

/* renamed from: com.tencent.mm.plugin.wallet_payu.order.ui.PayUMallOrderDetailUI */
public class PayUMallOrderDetailUI extends WalletBaseUI {

    /* renamed from: d */
    public String f117411d = "";

    /* renamed from: e */
    public C51090rc3 f117412e;

    /* renamed from: f */
    public LinearLayout f117413f;

    /* renamed from: g */
    public LinearLayout f117414g;

    /* renamed from: h */
    public LinearLayout f117415h;

    /* renamed from: i */
    public LinearLayout f117416i;

    /* renamed from: j */
    public LinearLayout f117417j;

    /* renamed from: n */
    public LinearLayout f117418n;

    /* renamed from: o */
    public TextView f117419o;

    /* renamed from: p */
    public TextView f117420p;

    /* renamed from: q */
    public TextView f117421q;

    /* renamed from: r */
    public TextView f117422r;

    /* renamed from: s */
    public TextView f117423s;

    /* renamed from: t */
    public TextView f117424t;

    /* renamed from: u */
    public TextView f117425u;

    /* renamed from: H7 */
    public final void mo67615H7() {
        C51090rc3 rc32 = this.f117412e;
        if (rc32 != null) {
            if (!Util.isNullOrNil(rc32.f140817d)) {
                this.f117413f.setVisibility(0);
                this.f117419o.setText(this.f117412e.f140817d);
            } else {
                this.f117413f.setVisibility(8);
            }
            if (!Util.isNullOrNil(this.f117412e.f140828r)) {
                this.f117414g.setVisibility(0);
                this.f117420p.setText(this.f117412e.f140828r);
            } else {
                this.f117414g.setVisibility(8);
            }
            if (!Util.isNullOrNil(this.f117412e.f140819f)) {
                this.f117415h.setVisibility(0);
                this.f117421q.setText(this.f117412e.f140819f);
            } else {
                this.f117415h.setVisibility(8);
            }
            if (!Util.isNullOrNil(this.f117412e.f140823j)) {
                this.f117416i.setVisibility(0);
                TextView textView = this.f117422r;
                C51090rc3 rc33 = this.f117412e;
                textView.setText(C75228t.m90258m(((double) rc33.f140818e) / 100.0d, rc33.f140823j));
            } else {
                this.f117416i.setVisibility(8);
            }
            if (this.f117412e.f140820g >= 0) {
                this.f117417j.setVisibility(0);
                this.f117423s.setText(C75228t.m90262o(this.f117412e.f140820g));
            } else {
                this.f117417j.setVisibility(8);
            }
            if (!Util.isNullOrNil(this.f117412e.f140821h)) {
                this.f117418n.setVisibility(0);
                this.f117424t.setText(this.f117412e.f140821h);
            } else {
                this.f117418n.setVisibility(8);
            }
            int i = this.f117412e.f140825o;
            if (i == 3) {
                this.f117425u.setText(C0966R.string.klo);
            } else if (i != 5) {
                this.f117425u.setText(C0966R.string.l4y);
            } else {
                this.f117425u.setText(C0966R.string.kug);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bmf;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1520);
        String string = getInput().getString("key_trans_id");
        this.f117411d = string;
        if (Util.isNullOrNil(string)) {
            Log.m105920e("MicroMsg.PayUMallOrderDetailUI", "hy: trans id is null");
            finish();
        }
        doSceneProgress(new C53086c(this.f117411d));
        this.f117413f = (LinearLayout) findViewById(C0966R.C0970id.f357856c40);
        this.f117414g = (LinearLayout) findViewById(C0966R.C0970id.c3b);
        this.f117415h = (LinearLayout) findViewById(C0966R.C0970id.c3l);
        this.f117416i = (LinearLayout) findViewById(C0966R.C0970id.c3r);
        this.f117417j = (LinearLayout) findViewById(C0966R.C0970id.c3y);
        this.f117418n = (LinearLayout) findViewById(C0966R.C0970id.c3t);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f357859c43);
        this.f117419o = (TextView) findViewById(C0966R.C0970id.f357857c41);
        this.f117420p = (TextView) findViewById(C0966R.C0970id.c3c);
        this.f117421q = (TextView) findViewById(C0966R.C0970id.c3m);
        this.f117422r = (TextView) findViewById(C0966R.C0970id.c3s);
        this.f117423s = (TextView) findViewById(C0966R.C0970id.c3z);
        this.f117424t = (TextView) findViewById(C0966R.C0970id.c3u);
        this.f117425u = (TextView) findViewById(C0966R.C0970id.c44);
        mo67615H7();
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1520);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i != 0 || i2 != 0) {
            return false;
        }
        if (!(yVar instanceof C53086c)) {
            return true;
        }
        this.f117412e = ((C53086c) yVar).f148160f;
        mo67615H7();
        return true;
    }
}
