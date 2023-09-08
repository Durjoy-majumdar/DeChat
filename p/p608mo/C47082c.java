package p608mo;

import android.content.Context;
import com.tencent.p014mm.autogen.events.BizPreSearchEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import fx0.C45831k;
import fx0.C45841u;

/* renamed from: mo.c */
public class C47082c extends IStaticListener<BizPreSearchEvent> {
    public boolean callback(IEvent iEvent) {
        BizPreSearchEvent bizPreSearchEvent = (BizPreSearchEvent) iEvent;
        if (bizPreSearchEvent == null) {
            return false;
        }
        BizPreSearchEvent.C40042a aVar = bizPreSearchEvent.f107375d;
        int i = aVar.f107381e;
        if (i != 1) {
            Log.m105919d("MicroMsg.BrandService.BrandServiceLogic", "Do not support the action(%d).", Integer.valueOf(i));
            return false;
        }
        Context context = aVar.f107377a;
        String str = aVar.f107379c;
        String str2 = aVar.f107382f;
        int i2 = aVar.f107378b;
        long j = aVar.f107380d;
        if (context == null || Util.isNullOrNil(str)) {
            Log.m105921e("MicroMsg.BrandService.BrandServiceLogic", "context(%s) or keyword(%s) is null or nil.", context, str);
            return false;
        }
        C86709a0.m107524d().mo123455a(WXWebReporter.WXWEB_IDKEY_FR_PDF_ID, new C45831k.C45832a(context, str, j, 0, i2, str2, false, bizPreSearchEvent));
        C86709a0.m107524d().mo123460f(new C45841u(str, j, 0, i2, ""));
        return true;
    }
}
