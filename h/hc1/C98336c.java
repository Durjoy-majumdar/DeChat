package hc1;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import oc1.C100324a;
import p640ox.C77049b;
import pb1.C62251b1;
import te3.C101825od0;

@C86522b
/* renamed from: hc1.c */
public final class C98336c extends C86301e implements C62251b1 {
    /* renamed from: En */
    public void mo87305En(Intent intent, String str, long j, int i) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "searchId");
        C101825od0 od02 = new C101825od0();
        try {
            od02.parseFrom(intent.getByteArrayExtra("key_fav_search_report_obj"));
            C100324a aVar = new C100324a();
            if (aVar.mo139617d(od02)) {
                aVar.f293911g = str;
                aVar.f293905a = i;
                aVar.f293908d = ((int) (System.currentTimeMillis() - j)) / 1000;
                aVar.mo139616b();
                return;
            }
            Log.m105924i("MicroMsg.ReportSearchCTR", "this FavSearchReportObj is null");
        } catch (Exception unused) {
        }
    }

    public void e40(Context context, String str, long j, int i) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "searchId");
        C100324a aVar = new C100324a();
        if (aVar.mo139617d((C101825od0) ((C77049b) C86312j.m106911c(C77049b.class)).mo72356fq(context, 1, 17, C101825od0.class))) {
            aVar.f293911g = str;
            aVar.f293905a = i;
            aVar.f293908d = ((int) (System.currentTimeMillis() - j)) / 1000;
            aVar.mo139616b();
            return;
        }
        Log.m105924i("MicroMsg.ReportSearchCTR", "this page is not open from fav search");
    }

    /* renamed from: uj */
    public String mo87307uj() {
        String a = C100324a.m131159a();
        C87412m.m108593f(a, "getSearchId()");
        return a;
    }
}
