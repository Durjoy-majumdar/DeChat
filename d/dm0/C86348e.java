package dm0;

import android.util.SparseIntArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import p284zb.C91635f;
import te3.C49895it3;

/* renamed from: dm0.e */
public class C86348e implements C87581a<Object, C49895it3> {

    /* renamed from: a */
    public final /* synthetic */ C91635f f251050a;

    /* renamed from: b */
    public final /* synthetic */ int f251051b;

    /* renamed from: c */
    public final /* synthetic */ String f251052c;

    /* renamed from: d */
    public final /* synthetic */ C86349f f251053d;

    public C86348e(C86349f fVar, C91635f fVar2, int i, String str) {
        this.f251053d = fVar;
        this.f251050a = fVar2;
        this.f251051b = i;
        this.f251052c = str;
    }

    public Object call(Object obj) {
        C49895it3 it32 = (C49895it3) obj;
        if (it32 == null) {
            Log.m105920e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, null response");
            this.f251050a.mo109647a(this.f251051b, this.f251053d.mo115109j("fail:cgi fail"));
            return null;
        }
        int i = it32.BaseResponse.f135955d;
        if (i != 0) {
            Log.m105921e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, errCode = %d, errMsg = %s", Integer.valueOf(i), it32.BaseResponse.f135956e);
            this.f251050a.mo109647a(this.f251051b, this.f251053d.mo115109j("fail:cgi fail"));
            return null;
        }
        String str = this.f251052c;
        int i2 = it32.f135656d;
        SparseIntArray sparseIntArray = C86345b.f251046a;
        if (!Util.isNullOrNil(str)) {
            SparseIntArray sparseIntArray2 = C86345b.f251046a;
            synchronized (sparseIntArray2) {
                sparseIntArray2.put(str.hashCode(), i2);
            }
        }
        this.f251050a.mo109647a(this.f251051b, this.f251053d.mo115109j("ok"));
        return null;
    }
}
