package com.tencent.p014mm.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import eb0.C116734h6;
import ke3.C88144b;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.app.i1 */
public final class C17667i1 {

    /* renamed from: a */
    public static volatile boolean f48064a;

    /* renamed from: com.tencent.mm.app.i1$a */
    public class C17668a extends WeChatBrands.Business.AvailabilityAlertSupplier {

        /* renamed from: a */
        public C77398g f48065a;

        /* renamed from: com.tencent.mm.app.i1$a$a */
        public class C17669a implements DialogInterface.OnDismissListener {
            public C17669a() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                C17668a.this.getOnDismissListener().onClick(dialogInterface, -2);
                C17668a.this.f48065a = null;
            }
        }

        /* renamed from: com.tencent.mm.app.i1$a$b */
        public class C17670b implements DialogInterface.OnCancelListener {
            public C17670b() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C17668a.this.getOnDismissListener().onClick(dialogInterface, -2);
                C17668a.this.f48065a = null;
            }
        }

        public void showDialog(Context context) {
            Context context2;
            C77398g gVar = this.f48065a;
            if (!(gVar == null || !gVar.isShowing() || (context2 = this.f48065a.getContext()) == null)) {
                if (context2 == context) {
                    return;
                }
                if ((context2 instanceof ContextWrapper) && ((ContextWrapper) context2).getBaseContext() == context) {
                    return;
                }
            }
            C77389a aVar = new C77389a();
            aVar.f225644a = getTilte();
            aVar.f225660q = getBody();
            aVar.f225663t = getPositiveBtnText();
            aVar.f225620C = getOnPositiveClickListener();
            aVar.f225664u = getNegativeBtnText();
            aVar.f225668y = true;
            aVar.f225669z = false;
            aVar.f225621D = getOnNegativeClickListener();
            aVar.f225622E = new C17670b();
            aVar.f225623F = new C17669a();
            C77398g gVar2 = new C77398g(context, C0966R.style.a66);
            gVar2.mo107525e(aVar);
            this.f48065a = gVar2;
            gVar2.show();
        }
    }

    /* renamed from: com.tencent.mm.app.i1$b */
    public class C17671b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeChatBrands.Business.AvailabilityAlertSupplier f48068d;

        public C17671b(WeChatBrands.Business.AvailabilityAlertSupplier availabilityAlertSupplier) {
            this.f48068d = availabilityAlertSupplier;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f48068d.getCallback() != null) {
                this.f48068d.getCallback().accept(-1);
            }
        }
    }

    /* renamed from: com.tencent.mm.app.i1$c */
    public class C17672c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ WeChatBrands.Business.AvailabilityAlertSupplier f48069d;

        public C17672c(WeChatBrands.Business.AvailabilityAlertSupplier availabilityAlertSupplier) {
            this.f48069d = availabilityAlertSupplier;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f48069d.getCallback() != null) {
                this.f48069d.getCallback().accept(1);
            }
        }
    }

    /* renamed from: com.tencent.mm.app.i1$d */
    public class C17673d implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f48070d;

        /* renamed from: e */
        public final /* synthetic */ Context f48071e;

        /* renamed from: f */
        public final /* synthetic */ WeChatBrands.Business.AvailabilityAlertSupplier f48072f;

        public C17673d(String str, Context context, WeChatBrands.Business.AvailabilityAlertSupplier availabilityAlertSupplier) {
            this.f48070d = str;
            this.f48071e = context;
            this.f48072f = availabilityAlertSupplier;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.putExtra("rawUrl", this.f48070d);
            C88144b.m109791i(this.f48071e, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            if (this.f48072f.getCallback() != null) {
                this.f48072f.getCallback().accept(0);
            }
        }
    }

    /* renamed from: a */
    public static void m17971a(Context context) {
        C17668a aVar = new C17668a();
        String r = C116734h6.m164662r("funcs_title");
        String str = null;
        if (r.equals("funcs_title")) {
            r = null;
        }
        String r2 = C116734h6.m164662r("funcs_content");
        if (r2.equals("funcs_content")) {
            r2 = null;
        }
        String r3 = C116734h6.m164662r("funcs_url");
        if (!r3.equals("funcs_url")) {
            str = r3;
        }
        if (r == null) {
            r = context.getString(C0966R.string.atd);
        }
        WeChatBrands.Business.AvailabilityAlertSupplier tilte = aVar.setTilte(r);
        if (r2 == null) {
            r2 = context.getString(C0966R.string.ata);
        }
        tilte.setBody(r2).setPositiveBtnText(context.getString(C0966R.string.atc)).setOnPositiveClickListener(new C17672c(aVar)).setOnDismissListener(new C17671b(aVar));
        if (!TextUtils.isEmpty(str)) {
            aVar.setNegativeBtnText(context.getString(C0966R.string.atb)).setOnNegativeClickListener(new C17673d(str, context, aVar));
        }
        WeChatBrands.updateBizRestrictAlertSupplier(aVar);
    }
}
