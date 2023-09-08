package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C1500a;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import kr0.C76629w0;
import qo3.C47883u;
import qo3.C77426q;
import te3.pa4;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.o1 */
public final class C41359o1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ pa4 f111348d;

    /* renamed from: e */
    public final /* synthetic */ SportHistoryUI f111349e;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.o1$a */
    public static final class C41360a implements C76629w0.C61144a {

        /* renamed from: a */
        public final /* synthetic */ SportHistoryUI f111350a;

        /* renamed from: b */
        public final /* synthetic */ pa4 f111351b;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.o1$a$a */
        public static final class C41361a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ WxaAttributes f111352a;

            /* renamed from: b */
            public final /* synthetic */ pa4 f111353b;

            public C41361a(WxaAttributes wxaAttributes, pa4 pa4) {
                this.f111352a = wxaAttributes;
                this.f111353b = pa4;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                if (z) {
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                    aVar.f9526a = this.f111352a.field_username;
                    aVar.f9527b = this.f111353b.f139684j;
                    aVar.f9529d = C1500a.CTRL_INDEX;
                    startAppBrandUIFromOuterEvent.publish();
                }
            }
        }

        public C41360a(SportHistoryUI sportHistoryUI, pa4 pa4) {
            this.f111350a = sportHistoryUI;
            this.f111351b = pa4;
        }

        /* renamed from: a */
        public final void mo21208a(WxaAttributes wxaAttributes) {
            if (wxaAttributes != null) {
                SportHistoryUI sportHistoryUI = this.f111350a;
                pa4 pa4 = this.f111351b;
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(sportHistoryUI.getString(C0966R.string.k4e, new Object[]{wxaAttributes.field_nickname}));
                qVar.mo107589a(true);
                qVar.mo107601m(C0966R.string.f7564js);
                qVar.mo107590b(new C41361a(wxaAttributes, pa4));
                qVar.mo107603o();
            }
        }
    }

    public C41359o1(pa4 pa4, SportHistoryUI sportHistoryUI) {
        this.f111348d = pa4;
        this.f111349e = sportHistoryUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pa4 pa4 = this.f111348d;
        ((C76629w0) C86312j.m106911c(C76629w0.class)).Ws0(pa4.f139678d, new C41360a(this.f111349e, pa4));
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/SportHistoryUI$HistoryItemConvert$onBindViewHolder$2$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
