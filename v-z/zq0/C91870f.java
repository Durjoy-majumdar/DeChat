package zq0;

import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gk0.C87237e;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.List;
import lp3.C88631d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import p224ra.C89909e;
import pe3.C89349b;
import rx3.C13598b0;
import te3.C49713hj2;
import te3.C90423kk2;
import te3.C90426lk2;
import te3.C90429p4;
import te3.C90437rw3;
import z04.C119027c;
import zp0.C16377l;

/* renamed from: zq0.f */
public final class C91870f {

    /* renamed from: a */
    public final String f263032a;

    /* renamed from: b */
    public final String f263033b;

    /* renamed from: c */
    public final boolean f263034c;

    /* renamed from: zq0.f$a */
    public static final class C91871a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32229r<Boolean, String, List<PhoneItem>, C87237e.C87238a, C13598b0> f263035a;

        public C91871a(C32229r<? super Boolean, ? super String, ? super List<PhoneItem>, ? super C87237e.C87238a, C13598b0> rVar) {
            this.f263035a = rVar;
        }

        public Object call(Object obj) {
            C90426lk2 lk22 = (C90426lk2) obj;
            Log.m105924i("Luggage.FULL.CgiPhoneNumber", "getPhoneNumber success");
            C49713hj2 hj22 = lk22.f259669d;
            int i = hj22.f134688d;
            String str = hj22.f134689e;
            if (i != 0) {
                Log.m105920e("Luggage.FULL.CgiPhoneNumber", "jsErrcode:" + i + ", jsErrmsg:" + str);
                C32229r<Boolean, String, List<PhoneItem>, C87237e.C87238a, C13598b0> rVar = this.f263035a;
                if (rVar != null) {
                    Boolean bool = Boolean.FALSE;
                    if (str == null) {
                        str = "";
                    }
                    rVar.mo162I(bool, str, null, null);
                }
            } else {
                JSONObject jSONObject = new JSONObject(lk22.f259670e.mo123705h());
                ArrayList arrayList = new ArrayList();
                PhoneItem.C84013a aVar = PhoneItem.f245270q;
                String optString = jSONObject.optString("wx_phone");
                C87412m.m108593f(optString, "phoneItemsJsonObj.optString(\"wx_phone\")");
                PhoneItem a = aVar.mo116667a(optString);
                if (a != null) {
                    a.f245278n = true;
                    arrayList.add(a);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("custom_phone_list");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        PhoneItem.C84013a aVar2 = PhoneItem.f245270q;
                        String string = optJSONArray.getString(i2);
                        C87412m.m108593f(string, "customPhoneItemsObjArray.getString(i)");
                        PhoneItem a2 = aVar2.mo116667a(string);
                        if (a2 != null) {
                            arrayList.add(a2);
                        }
                    }
                }
                C32229r<Boolean, String, List<PhoneItem>, C87237e.C87238a, C13598b0> rVar2 = this.f263035a;
                if (rVar2 != null) {
                    Boolean bool2 = Boolean.TRUE;
                    C90437rw3 rw32 = lk22.f259671f;
                    C90429p4 p4Var = lk22.f259680r;
                    String str2 = lk22.f259678p;
                    if (str2 == null) {
                        str2 = "";
                    }
                    rVar2.mo162I(bool2, "", arrayList, new C87237e.C87238a(rw32, p4Var, str2, lk22.f259681s));
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.f$b */
    public static final class C91872b<T> implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ C32229r<Boolean, String, List<PhoneItem>, C87237e.C87238a, C13598b0> f263036a;

        public C91872b(C32229r<? super Boolean, ? super String, ? super List<PhoneItem>, ? super C87237e.C87238a, C13598b0> rVar) {
            this.f263036a = rVar;
        }

        /* renamed from: a */
        public final void mo1720a(Object obj) {
            Log.m105920e("Luggage.FULL.CgiPhoneNumber", "getPhoneNumber fail");
            if (obj instanceof Exception) {
                Log.m105920e("Luggage.FULL.CgiPhoneNumber", "CgiGetAllPhone " + ((Exception) obj).getMessage());
            }
            C32229r<Boolean, String, List<PhoneItem>, C87237e.C87238a, C13598b0> rVar = this.f263036a;
            if (rVar != null) {
                rVar.mo162I(Boolean.FALSE, "cgi fail", null, null);
            }
        }
    }

    public C91870f(String str, String str2, boolean z) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "apiName");
        this.f263032a = str;
        this.f263033b = str2;
        this.f263034c = z;
    }

    /* renamed from: a */
    public final void mo125700a(C32229r<? super Boolean, ? super String, ? super List<PhoneItem>, ? super C87237e.C87238a, C13598b0> rVar) {
        String str = this.f263033b;
        boolean z = this.f263034c;
        JSONStringer jSONStringer = new JSONStringer();
        try {
            jSONStringer.object();
            jSONStringer.key("api_name");
            jSONStringer.value(str);
            jSONStringer.key("with_credentials");
            jSONStringer.value(z);
            jSONStringer.endObject();
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.JsApiGetPhoneNumberNew", e, "", new Object[0]);
        }
        String jSONStringer2 = jSONStringer.toString();
        C87412m.m108593f(jSONStringer2, "jsonStringer.toString()");
        C90423kk2 kk22 = new C90423kk2();
        kk22.f259643d = this.f263032a;
        byte[] bytes = jSONStringer2.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        kk22.f259644e = new C89349b(bytes, 0, bytes.length);
        ((C16377l) C89909e.m112436a(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/getallphone", this.f263032a, kk22, C90426lk2.class).mo123061d(new C91871a(rVar)).mo123065b(new C91872b(rVar));
    }
}
