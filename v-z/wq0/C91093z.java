package wq0;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import gt0.C87325b;
import gt0.C87375o0;
import gy3.C87412m;

/* renamed from: wq0.z */
public final class C91093z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82554k f261278d;

    /* renamed from: e */
    public final /* synthetic */ WeChatBrands.Business.AvailabilityAlertSupplier f261279e;

    /* renamed from: wq0.z$a */
    public static final class C91094a implements DialogInterface.OnDismissListener {

        /* renamed from: d */
        public final /* synthetic */ WeChatBrands.Business.AvailabilityAlertSupplier f261280d;

        public C91094a(WeChatBrands.Business.AvailabilityAlertSupplier availabilityAlertSupplier) {
            this.f261280d = availabilityAlertSupplier;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f261280d.getOnDismissListener() != null) {
                this.f261280d.getOnDismissListener().onClick(dialogInterface, -2);
            }
        }
    }

    public C91093z(C82554k kVar, WeChatBrands.Business.AvailabilityAlertSupplier availabilityAlertSupplier) {
        this.f261278d = kVar;
        this.f261279e = availabilityAlertSupplier;
    }

    public final void run() {
        Context context = this.f261278d.getContext();
        if (context != null && this.f261278d.getDialogContainer() != null) {
            C87325b bVar = new C87325b(context);
            bVar.setTitle((CharSequence) this.f261279e.getTilte());
            bVar.mo107533r(this.f261279e.getBody());
            String negativeBtnText = this.f261279e.getNegativeBtnText();
            if (!(negativeBtnText == null || negativeBtnText.length() == 0)) {
                bVar.mo107539t(this.f261279e.getNegativeBtnText(), true, this.f261279e.getOnNegativeClickListener());
            }
            bVar.mo107542x(this.f261279e.getPositiveBtnText(), true, this.f261279e.getOnPositiveClickListener());
            bVar.setOnDismissListener(new C91094a(this.f261279e));
            C87375o0 dialogContainer = this.f261278d.getDialogContainer();
            C87412m.m108591d(dialogContainer);
            dialogContainer.mo121778b(bVar);
        }
    }
}
