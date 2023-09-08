package wk2;

import android.content.Context;
import bh3.C113177k;
import com.tencent.p014mm.plugin.appbrand.jsapi.address.AddressSelectorContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ek0.C7727h;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import rx3.C13598b0;
import sx3.C110818d0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;

/* renamed from: wk2.w */
public final class C15503w extends C15805b {

    /* renamed from: f */
    public static final C15503w f42042f = new C15503w();

    /* renamed from: g */
    public static final String f42043g = C7727h.NAME;

    /* renamed from: wk2.w$a */
    public static final class C15504a extends C87413o implements C32226l<AddressSelectorContract.SelectResponse, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HashMap<String, Object> f42044d;

        /* renamed from: e */
        public final /* synthetic */ C13855j f42045e;

        /* renamed from: f */
        public final /* synthetic */ C13851h1 f42046f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15504a(HashMap<String, Object> hashMap, C13855j jVar, C13851h1 h1Var) {
            super(1);
            this.f42044d = hashMap;
            this.f42045e = jVar;
            this.f42046f = h1Var;
        }

        public Object invoke(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            AddressSelectorContract.SelectResponse selectResponse = (AddressSelectorContract.SelectResponse) obj;
            C87412m.m108594g(selectResponse, "response");
            Log.m105919d("MicroMsg.JsApiShowAddressPickerView", "showAddressPickerView onSelected postCode: " + selectResponse.f11051e + ", result: %s", C110818d0.m150921S(selectResponse.f11050d, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C15502v.f42041d, 30, (Object) null));
            this.f42044d.put("retCode", 0);
            HashMap<String, Object> hashMap = this.f42044d;
            AddressSelectorContract.AddressNode addressNode = (AddressSelectorContract.AddressNode) C110818d0.m150917O(selectResponse.f11050d, 0);
            String str6 = "";
            if (addressNode == null || (str = addressNode.f11045d) == null) {
                str = str6;
            }
            hashMap.put("province", str);
            HashMap<String, Object> hashMap2 = this.f42044d;
            AddressSelectorContract.AddressNode addressNode2 = (AddressSelectorContract.AddressNode) C110818d0.m150917O(selectResponse.f11050d, 1);
            if (addressNode2 == null || (str2 = addressNode2.f11045d) == null) {
                str2 = str6;
            }
            hashMap2.put("city", str2);
            HashMap<String, Object> hashMap3 = this.f42044d;
            AddressSelectorContract.AddressNode addressNode3 = (AddressSelectorContract.AddressNode) C110818d0.m150917O(selectResponse.f11050d, 2);
            if (addressNode3 == null || (str3 = addressNode3.f11045d) == null) {
                str3 = str6;
            }
            hashMap3.put("district", str3);
            HashMap<String, Object> hashMap4 = this.f42044d;
            AddressSelectorContract.AddressNode addressNode4 = (AddressSelectorContract.AddressNode) C110818d0.m150917O(selectResponse.f11050d, 3);
            if (addressNode4 == null || (str4 = addressNode4.f11045d) == null) {
                str4 = str6;
            }
            hashMap4.put("street", str4);
            HashMap<String, Object> hashMap5 = this.f42044d;
            C15503w wVar = C15503w.f42042f;
            ArrayList<AddressSelectorContract.AddressNode> arrayList = selectResponse.f11050d;
            wVar.getClass();
            int size = arrayList.size() - 1;
            while (true) {
                if (-1 >= size) {
                    str5 = null;
                    break;
                }
                AddressSelectorContract.AddressNode addressNode5 = (AddressSelectorContract.AddressNode) C110818d0.m150917O(arrayList, size);
                if (addressNode5 != null) {
                    str5 = String.valueOf(addressNode5.f11046e);
                    break;
                }
                size--;
            }
            if (str5 != null) {
                str6 = str5;
            }
            hashMap5.put("nationalCode", str6);
            C13849g gVar = this.f42045e.f39001d;
            String str7 = this.f42046f.f38990c;
            StringBuilder sb = new StringBuilder();
            C15503w.f42042f.getClass();
            sb.append(C15503w.f42043g);
            sb.append(":ok");
            gVar.mo10774a(str7, sb.toString(), this.f42044d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wk2.w$b */
    public static final class C15505b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HashMap<String, Object> f42047d;

        /* renamed from: e */
        public final /* synthetic */ C13855j f42048e;

        /* renamed from: f */
        public final /* synthetic */ C13851h1 f42049f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15505b(HashMap<String, Object> hashMap, C13855j jVar, C13851h1 h1Var) {
            super(0);
            this.f42047d = hashMap;
            this.f42048e = jVar;
            this.f42049f = h1Var;
        }

        public Object invoke() {
            this.f42047d.put("retCode", 1);
            Log.m105924i("MicroMsg.JsApiShowAddressPickerView", "showAddressPickerView user cancel");
            C13849g gVar = this.f42048e.f39001d;
            String str = this.f42049f.f38990c;
            StringBuilder sb = new StringBuilder();
            C15503w.f42042f.getClass();
            sb.append(C15503w.f42043g);
            sb.append(":cancel");
            gVar.mo10774a(str, sb.toString(), (Map<String, Object>) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        boolean z;
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        String str = (String) h1Var2.f38983a.get("current");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        ArrayList arrayList = new ArrayList();
        if (str.length() > 0) {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (string == null) {
                    string = str2;
                }
                arrayList.add(string);
            }
        }
        try {
            Object obj = h1Var2.f38983a.get("mode");
            String str3 = obj instanceof String ? (String) obj : null;
            if (str3 != null) {
                str2 = str3;
            }
            String str4 = "showAddressPickerView current: %s, mode: " + str2;
            z = true;
            try {
                Object[] objArr = new Object[1];
                objArr[0] = C110818d0.m150921S(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
                Log.m105925i("MicroMsg.JsApiShowAddressPickerView", str4, objArr);
                HashMap hashMap = new HashMap();
                AddressSelectorContract addressSelectorContract = (AddressSelectorContract) C86312j.m106911c(AddressSelectorContract.class);
                Context context = jVar2.f38998a;
                AddressSelectorContract.C1582a a = AddressSelectorContract.C1582a.f11052e.mo1619a(str2);
                if (a == null) {
                    a = AddressSelectorContract.C1582a.REGION;
                }
                addressSelectorContract.mu0(context, new AddressSelectorContract.SelectRequest(a, arrayList, ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.SCAN)), new C15504a(hashMap, jVar2, h1Var2), new C15505b(hashMap, jVar2, h1Var2));
            } catch (Exception e) {
                e = e;
                Log.printErrStackTrace("MicroMsg.JsApiShowAddressPickerView", e, "showAddressPickerView exception", new Object[0]);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("retCode", Integer.valueOf(z ? 1 : 0));
                jVar2.f39001d.mo10774a(h1Var2.f38990c, f42043g + ":fail", hashMap2);
                return z;
            }
        } catch (Exception e2) {
            e = e2;
            z = true;
            Log.printErrStackTrace("MicroMsg.JsApiShowAddressPickerView", e, "showAddressPickerView exception", new Object[0]);
            HashMap hashMap22 = new HashMap();
            hashMap22.put("retCode", Integer.valueOf(z ? 1 : 0));
            jVar2.f39001d.mo10774a(h1Var2.f38990c, f42043g + ":fail", hashMap22);
            return z;
        }
        return z;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42043g;
    }
}
