package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import f40.C86709a0;
import f63.C75726p;
import pv2.C77290d;
import qo3.C77390c0;
import tt1.C78092f;
import tt1.C78101i;
import vt1.C78473a;
import yt3.C23319f;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog */
public class WcPayCashierFingerprintDialog extends C77390c0 implements C0124r {

    /* renamed from: d */
    public ViewGroup f210468d;

    /* renamed from: e */
    public ImageView f210469e;

    /* renamed from: f */
    public TextView f210470f;

    /* renamed from: g */
    public ImageView f210471g;

    /* renamed from: h */
    public TextView f210472h;

    /* renamed from: i */
    public C72360c f210473i;

    /* renamed from: j */
    public C72361d f210474j;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$a */
    public class C72358a implements DialogInterface.OnCancelListener {
        public C72358a() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C72361d dVar = WcPayCashierFingerprintDialog.this.f210474j;
            if (dVar != null) {
                C72368e eVar = (C72368e) dVar;
                eVar.getClass();
                Log.m105924i("MicroMsg.WcPayCashierDialog", "verify canceled");
                WcPayCashierDialog wcPayCashierDialog = eVar.f210505a;
                wcPayCashierDialog.f210425Q = true;
                int i = 0;
                wcPayCashierDialog.f210435d.setVisibility(0);
                WcPayCashierDialog wcPayCashierDialog2 = eVar.f210505a;
                wcPayCashierDialog2.f210414E = null;
                PayInfo payInfo = wcPayCashierDialog2.f210421L;
                if (payInfo != null) {
                    i = payInfo.f212587e;
                }
                C75155x0.m90135a(i, payInfo == null ? "" : payInfo.f212592j, 24, "");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$b */
    public class C72359b implements DialogInterface.OnDismissListener {
        public C72359b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WcPayCashierFingerprintDialog", "dialog dismiss");
            C72360c cVar = WcPayCashierFingerprintDialog.this.f210473i;
            if (cVar != null) {
                Log.m105924i("MicroMsg.WcPayCashierFingerprintDialog", "release fingerprint");
                cVar.f210480d.cancel();
                C23319f.m27817c().mo36811b();
                cVar.f210480d = null;
                WcPayCashierFingerprintDialog.this.f210473i = null;
            }
            WcPayCashierFingerprintDialog.this.f210474j = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$c */
    public class C72360c {

        /* renamed from: a */
        public String f210477a;

        /* renamed from: b */
        public String f210478b;

        /* renamed from: c */
        public C78473a f210479c = ((C78473a) C86709a0.m107533q(C78473a.class));

        /* renamed from: d */
        public C78101i f210480d = ((C78101i) C86709a0.m107533q(C78101i.class));

        /* renamed from: e */
        public int f210481e;

        public C72360c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierFingerprintDialog$d */
    public interface C72361d {
    }

    public WcPayCashierFingerprintDialog(Context context) {
        super(context, C0966R.style.a66);
        mo99721c();
    }

    /* renamed from: c */
    public final void mo99721c() {
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C0966R.C0971layout.ch9, (ViewGroup) null);
        this.f210468d = viewGroup;
        this.f210469e = (ImageView) viewGroup.findViewById(C0966R.C0970id.lsc);
        this.f210470f = (TextView) this.f210468d.findViewById(C0966R.C0970id.lsd);
        this.f210471g = (ImageView) this.f210468d.findViewById(C0966R.C0970id.lsf);
        this.f210472h = (TextView) this.f210468d.findViewById(C0966R.C0970id.lse);
        this.f210469e.setOnClickListener(new C75726p(this));
        setContentView(this.f210468d);
        setCanceledOnTouchOutside(false);
        this.f210473i = new C72360c();
        setOnCancelListener(new C72358a());
        setOnDismissListener(new C72359b());
    }

    /* renamed from: d */
    public void mo99722d() {
        this.f210471g.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_outlined_pay_fingerprint_android, getContext().getResources().getColor(C0966R.color.FG_2)));
        this.f210472h.setTextColor(getContext().getResources().getColor(C0966R.color.f3552xi));
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onActivityDestroy() {
        Log.m105924i("MicroMsg.WcPayCashierFingerprintDialog", "activity destroy");
        C72360c cVar = this.f210473i;
        if (cVar != null) {
            Log.m105924i("MicroMsg.WcPayCashierFingerprintDialog", "release fingerprint");
            cVar.f210480d.cancel();
            C23319f.m27817c().mo36811b();
            cVar.f210480d = null;
            this.f210473i = null;
        }
        this.f210469e = null;
        this.f210474j = null;
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onActivityPause() {
        Log.m105924i("MicroMsg.WcPayCashierFingerprintDialog", "activity paused, release and dismiss");
        cancel();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72360c cVar = this.f210473i;
        cVar.getClass();
        Log.m105924i("MicroMsg.WcPayCashierFingerprintDialog", "req fingerprint auth 2");
        C77290d.m93104b();
        C115669n.INSTANCE.mo175911u(1104, 38);
        C78092f fVar = new C78092f(cVar.f210478b, 1);
        fVar.f228896c = cVar.f210477a;
        ((C78101i) C86709a0.m107533q(C78101i.class)).mo108084rn(MMApplicationContext.getContext(), fVar, new C72370g(cVar));
    }

    public WcPayCashierFingerprintDialog(Context context, int i) {
        super(context, C0966R.style.a66);
        mo99721c();
    }
}
