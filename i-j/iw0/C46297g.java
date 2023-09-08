package iw0;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.biz.scheme.BizComSchIntermediateUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p239sv.C13782a;
import p239sv.C77792p;
import p239sv.C77793t;
import pe3.C89349b;
import qo3.C89779i0;
import te3.C50727ot;

/* renamed from: iw0.g */
public final class C46297g extends C46290a {

    /* renamed from: a */
    public final String f124744a = "MicroMsg.BizSchemeWWProfile";

    /* renamed from: iw0.g$a */
    public static final class C46298a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C13782a f124745d;

        /* renamed from: e */
        public final /* synthetic */ BizComSchIntermediateUI f124746e;

        public C46298a(C13782a aVar, BizComSchIntermediateUI bizComSchIntermediateUI) {
            this.f124745d = aVar;
            this.f124746e = bizComSchIntermediateUI;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f124745d.cancel();
            this.f124746e.finish();
        }
    }

    /* renamed from: iw0.g$b */
    public static final class C46299b implements C77793t {

        /* renamed from: a */
        public final /* synthetic */ WeakReference<BizComSchIntermediateUI> f124747a;

        /* renamed from: b */
        public final /* synthetic */ C46297g f124748b;

        public C46299b(WeakReference<BizComSchIntermediateUI> weakReference, C46297g gVar) {
            this.f124747a = weakReference;
            this.f124748b = gVar;
        }

        public final void onResult(boolean z, String str, String str2) {
            C89779i0 i0Var;
            BizComSchIntermediateUI bizComSchIntermediateUI = this.f124747a.get();
            if (!(bizComSchIntermediateUI == null || (i0Var = bizComSchIntermediateUI.f108999h) == null)) {
                i0Var.dismiss();
            }
            if (z) {
                Log.m105924i(this.f124748b.f124744a, "jumpToProfile success!");
                return;
            }
            BizComSchIntermediateUI bizComSchIntermediateUI2 = this.f124747a.get();
            if (bizComSchIntermediateUI2 != null) {
                bizComSchIntermediateUI2.mo63447N7();
            }
        }
    }

    /* renamed from: a */
    public boolean mo71703a(BizComSchIntermediateUI bizComSchIntermediateUI, C89349b bVar, C89349b bVar2, String str) {
        C87412m.m108594g(bizComSchIntermediateUI, "ui");
        C87412m.m108594g(bVar, "actionBuffer");
        C50727ot otVar = new C50727ot();
        try {
            otVar.parseFrom(bVar.mo123703f());
            C13782a AB = ((C77792p) C86312j.m106911c(C77792p.class)).mo107726AB(bizComSchIntermediateUI.getContext(), otVar.f139356d, 1, (byte[]) null, new C46299b(new WeakReference(bizComSchIntermediateUI), this));
            C89779i0 i0Var = bizComSchIntermediateUI.f108999h;
            if (i0Var == null) {
                return true;
            }
            i0Var.setOnCancelListener(new C46298a(AB, bizComSchIntermediateUI));
            return true;
        } catch (IOException e) {
            String str2 = this.f124744a;
            Log.m105920e(str2, "e = " + e.getMessage());
            return false;
        }
    }
}
