package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import f63.C75713a;
import f63.C75714b;
import java.util.ArrayList;
import java.util.List;
import qo3.C77390c0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.a */
public class C72362a extends C77390c0 {

    /* renamed from: d */
    public ViewGroup f210483d;

    /* renamed from: e */
    public ImageView f210484e;

    /* renamed from: f */
    public ViewGroup f210485f;

    /* renamed from: g */
    public TextView f210486g;

    /* renamed from: h */
    public List<WcPayCashierBankcardItemLayout> f210487h = new ArrayList();

    /* renamed from: i */
    public Context f210488i;

    /* renamed from: j */
    public PayInfo f210489j = new PayInfo();

    /* renamed from: n */
    public Orders f210490n = new Orders();

    /* renamed from: o */
    public FavorPayInfo f210491o;

    /* renamed from: p */
    public Bankcard f210492p;

    /* renamed from: q */
    public int f210493q;

    /* renamed from: r */
    public boolean f210494r;

    /* renamed from: s */
    public int f210495s;

    /* renamed from: t */
    public boolean f210496t = true;

    /* renamed from: u */
    public BankcardLogoHelper f210497u;

    /* renamed from: v */
    public C72364b f210498v;

    /* renamed from: w */
    public WcPayCashierDialog.C72357j f210499w = new C72363a();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.a$a */
    public class C72363a implements WcPayCashierDialog.C72357j {
        public C72363a() {
        }

        /* renamed from: a */
        public void mo99720a() {
            Log.m105924i("MicroMsg.WcPayCashierBankcardDialog", "cashier dialog has dismissed");
            C72362a.this.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.a$b */
    public interface C72364b {
    }

    public C72362a(Context context) {
        super(context, C0966R.style.a66);
        this.f210488i = context;
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C0966R.C0971layout.f360067ch3, (ViewGroup) null);
        this.f210483d = viewGroup;
        this.f210484e = (ImageView) viewGroup.findViewById(C0966R.C0970id.lrp);
        this.f210485f = (ViewGroup) this.f210483d.findViewById(C0966R.C0970id.lrm);
        this.f210486g = (TextView) this.f210483d.findViewById(C0966R.C0970id.lrr);
        ImageView imageView = this.f210484e;
        int i = WcPayCashierDialog.f210409y0;
        Util.expandViewTouchArea(imageView, i, i, i, i);
        this.f210484e.setOnClickListener(new C75714b(this));
        setContentView(this.f210483d);
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new C72365b(this));
        setOnDismissListener(new C75713a(this));
        this.f210497u = new BankcardLogoHelper();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f210489j == null) {
            Log.m105928w("MicroMsg.WcPayCashierBankcardDialog", "pay info is null!!");
            dismiss();
        }
        C75136r0.m90122d(7, 0);
    }
}
