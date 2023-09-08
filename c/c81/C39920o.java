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

/* renamed from: c81.o */
public final class C39920o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ pa4 f107044d;

    /* renamed from: e */
    public final /* synthetic */ C0435q f107045e;

    /* renamed from: c81.o$a */
    public static final class C39921a implements C76629w0.C61144a {

        /* renamed from: a */
        public final /* synthetic */ C0435q f107046a;

        /* renamed from: b */
        public final /* synthetic */ pa4 f107047b;

        /* renamed from: c81.o$a$a */
        public static final class C39922a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ WxaAttributes f107048a;

            /* renamed from: b */
            public final /* synthetic */ pa4 f107049b;

            public C39922a(WxaAttributes wxaAttributes, pa4 pa4) {
                this.f107048a = wxaAttributes;
                this.f107049b = pa4;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                if (z) {
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                    aVar.f9526a = this.f107048a.field_username;
                    aVar.f9527b = this.f107049b.f139684j;
                    aVar.f9529d = C1500a.CTRL_INDEX;
                    startAppBrandUIFromOuterEvent.publish();
                }
            }
        }

        public C39921a(C0435q qVar, pa4 pa4) {
            this.f107046a = qVar;
            this.f107047b = pa4;
        }

        /* renamed from: a */
        public final void mo21208a(WxaAttributes wxaAttributes) {
            if (wxaAttributes != null) {
                C0435q qVar = this.f107046a;
                pa4 pa4 = this.f107047b;
                C77426q qVar2 = new C77426q(MMApplicationContext.getContext());
                qVar2.mo107595g(qVar.getActivity().getString(C0966R.string.k4e, new Object[]{wxaAttributes.field_nickname}));
                qVar2.mo107589a(true);
                qVar2.mo107601m(C0966R.string.f7564js);
                qVar2.mo107590b(new C39922a(wxaAttributes, pa4));
                qVar2.mo107603o();
            }
        }
    }

    public C39920o(pa4 pa4, C0435q qVar) {
        this.f107044d = pa4;
        this.f107045e = qVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pa4 pa4 = this.f107044d;
        ((C76629w0) C86312j.m106911c(C76629w0.class)).Ws0(pa4.f139678d, new C39921a(this.f107045e, pa4));
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
