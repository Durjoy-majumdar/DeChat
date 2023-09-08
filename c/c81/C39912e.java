package c81;

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

/* renamed from: c81.e */
public final class C39912e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ pa4 f107021d;

    /* renamed from: e */
    public final /* synthetic */ C39904a f107022e;

    /* renamed from: c81.e$a */
    public static final class C39913a implements C76629w0.C61144a {

        /* renamed from: a */
        public final /* synthetic */ C39904a f107023a;

        /* renamed from: b */
        public final /* synthetic */ pa4 f107024b;

        /* renamed from: c81.e$a$a */
        public static final class C39914a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ WxaAttributes f107025a;

            /* renamed from: b */
            public final /* synthetic */ pa4 f107026b;

            public C39914a(WxaAttributes wxaAttributes, pa4 pa4) {
                this.f107025a = wxaAttributes;
                this.f107026b = pa4;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                if (z) {
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                    aVar.f9526a = this.f107025a.field_username;
                    aVar.f9527b = this.f107026b.f139684j;
                    aVar.f9529d = C1500a.CTRL_INDEX;
                    startAppBrandUIFromOuterEvent.publish();
                }
            }
        }

        public C39913a(C39904a aVar, pa4 pa4) {
            this.f107023a = aVar;
            this.f107024b = pa4;
        }

        /* renamed from: a */
        public final void mo21208a(WxaAttributes wxaAttributes) {
            if (wxaAttributes != null) {
                C39904a aVar = this.f107023a;
                pa4 pa4 = this.f107024b;
                C77426q qVar = new C77426q(MMApplicationContext.getContext());
                qVar.mo107595g(aVar.getActivity().getString(C0966R.string.k4e, new Object[]{wxaAttributes.field_nickname}));
                qVar.mo107589a(true);
                qVar.mo107601m(C0966R.string.f7564js);
                qVar.mo107590b(new C39914a(wxaAttributes, pa4));
                qVar.mo107603o();
            }
        }
    }

    public C39912e(pa4 pa4, C39904a aVar) {
        this.f107021d = pa4;
        this.f107022e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pa4 pa4 = this.f107021d;
        ((C76629w0) C86312j.m106911c(C76629w0.class)).Ws0(pa4.f139678d, new C39913a(this.f107022e, pa4));
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
