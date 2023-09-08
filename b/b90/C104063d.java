package b90;

import android.util.Range;
import c90.C104325a;
import com.tencent.p014mm.sdk.platformtools.Log;
import d90.C107026a;
import e90.C107267a;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: b90.d */
public final class C104063d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C104064e f307777d;

    /* renamed from: e */
    public final /* synthetic */ C32228q<ArrayList<C104325a>, ArrayList<C107026a>, ArrayList<C107267a>, C13598b0> f307778e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104063d(C104064e eVar, C32228q<? super ArrayList<C104325a>, ? super ArrayList<C107026a>, ? super ArrayList<C107267a>, C13598b0> qVar) {
        super(0);
        this.f307777d = eVar;
        this.f307778e = qVar;
    }

    public Object invoke() {
        String str = this.f307777d.f307780b;
        Log.m105924i(str, "available request: tag value : " + this.f307777d.f307782d + ' ');
        String str2 = this.f307777d.f307780b;
        Log.m105924i(str2, "available result: tag value : " + this.f307777d.f307783e + ' ');
        String str3 = this.f307777d.f307780b;
        Log.m105924i(str3, "available sessionType: tag value : " + this.f307777d.f307784f + ' ');
        JSONArray jSONArray = this.f307777d.f307782d;
        int length = jSONArray != null ? jSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            C104325a aVar = new C104325a();
            JSONArray jSONArray2 = this.f307777d.f307782d;
            C87412m.m108591d(jSONArray2);
            JSONObject optJSONObject = jSONArray2.optJSONObject(i);
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                C87412m.m108593f(keys, "params.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (C87412m.m108589b(next, aVar.f308787a)) {
                        aVar.f308795i = Integer.valueOf(optJSONObject.optInt(next));
                    } else if (C87412m.m108589b(next, aVar.f308788b)) {
                        aVar.f308794h = optJSONObject.optString(next);
                    } else if (C87412m.m108589b(next, aVar.f308789c)) {
                        aVar.f308797k = optJSONObject.optString(next);
                    } else if (C87412m.m108589b(next, aVar.f308790d)) {
                        aVar.f308799m = optJSONObject.optString(next);
                    } else if (C87412m.m108589b(next, aVar.f308791e)) {
                        String optString = optJSONObject.optString(next);
                        C87412m.m108593f(optString, "params.optString(it)");
                        List U = C112550d0.m153785U(optString, new String[]{","}, false, 0, 6, (Object) null);
                        Range range = null;
                        String str4 = (String) U.get(0);
                        if (C87412m.m108589b(str4, "range")) {
                            range = new Range(Integer.valueOf(Integer.parseInt((String) U.get(1))), Integer.valueOf(Integer.parseInt((String) U.get(2))));
                        } else if (C87412m.m108589b(str4, "array")) {
                            Object obj = aVar.f308796j;
                            if (obj instanceof Boolean) {
                                ArrayList arrayList = new ArrayList();
                                for (String parseBoolean : U.subList(1, U.size())) {
                                    arrayList.add(Boolean.valueOf(Boolean.parseBoolean(parseBoolean)));
                                }
                                range = arrayList;
                            } else if (obj instanceof String) {
                                ArrayList arrayList2 = new ArrayList();
                                for (String add : U.subList(1, U.size())) {
                                    arrayList2.add(add);
                                }
                                range = arrayList2;
                            } else if (obj instanceof Integer) {
                                ArrayList arrayList3 = new ArrayList();
                                for (String parseInt : U.subList(1, U.size())) {
                                    arrayList3.add(Integer.valueOf(Integer.parseInt(parseInt)));
                                }
                                range = arrayList3;
                            }
                        }
                        aVar.f308798l = range;
                    } else if (C87412m.m108589b(next, aVar.f308793g)) {
                        aVar.f308796j = optJSONObject.opt(next);
                    } else if (C87412m.m108589b(next, aVar.f308792f)) {
                        aVar.f308800n = Integer.valueOf(optJSONObject.optInt(next));
                    }
                }
            }
            Objects.toString(aVar.f308796j);
            Object obj2 = aVar.f308798l;
            if (obj2 instanceof Range) {
                C87412m.m108592e(obj2, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
                Objects.toString(((Range) obj2).getLower());
                Object obj3 = aVar.f308798l;
                C87412m.m108592e(obj3, "null cannot be cast to non-null type android.util.Range<kotlin.Int>");
                Objects.toString(((Range) obj3).getUpper());
            } else if (obj2 instanceof ArrayList) {
                C87412m.m108592e(obj2, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                for (Object objects : (ArrayList) obj2) {
                    Objects.toString(objects);
                }
            }
            this.f307777d.f307785g.add(aVar);
        }
        JSONArray jSONArray3 = this.f307777d.f307783e;
        int length2 = jSONArray3 != null ? jSONArray3.length() : 0;
        for (int i2 = 0; i2 < length2; i2++) {
            C107026a aVar2 = new C107026a();
            JSONArray jSONArray4 = this.f307777d.f307783e;
            C87412m.m108591d(jSONArray4);
            JSONObject optJSONObject2 = jSONArray4.optJSONObject(i2);
            if (optJSONObject2 != null) {
                Iterator<String> keys2 = optJSONObject2.keys();
                C87412m.m108593f(keys2, "params.keys()");
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (C87412m.m108589b(next2, aVar2.f320419a)) {
                        aVar2.f320425g = Integer.valueOf(optJSONObject2.optInt(next2));
                    } else if (C87412m.m108589b(next2, aVar2.f320420b)) {
                        aVar2.f320424f = optJSONObject2.optString(next2);
                    } else if (C87412m.m108589b(next2, aVar2.f320421c)) {
                        aVar2.f320426h = optJSONObject2.optString(next2);
                    } else if (C87412m.m108589b(next2, aVar2.f320422d)) {
                        aVar2.f320427i = Integer.valueOf(optJSONObject2.optInt(next2));
                    } else if (C87412m.m108589b(next2, aVar2.f320423e)) {
                        aVar2.f320428j = optJSONObject2.optString(next2);
                    }
                }
            }
            this.f307777d.f307786h.add(aVar2);
        }
        JSONArray jSONArray5 = this.f307777d.f307784f;
        int length3 = jSONArray5 != null ? jSONArray5.length() : 0;
        for (int i3 = 0; i3 < length3; i3++) {
            C107267a aVar3 = new C107267a();
            JSONArray jSONArray6 = this.f307777d.f307784f;
            C87412m.m108591d(jSONArray6);
            JSONObject optJSONObject3 = jSONArray6.optJSONObject(i3);
            if (optJSONObject3 != null) {
                Iterator<String> keys3 = optJSONObject3.keys();
                C87412m.m108593f(keys3, "params.keys()");
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    if (C87412m.m108589b(next3, aVar3.f320933a)) {
                        optJSONObject3.optString(next3);
                    } else if (C87412m.m108589b(next3, aVar3.f320934b)) {
                        aVar3.f320936d = optJSONObject3.optInt(next3);
                    } else if (C87412m.m108589b(next3, aVar3.f320935c)) {
                        String optString2 = optJSONObject3.optString(next3);
                        C87412m.m108593f(optString2, "params.optString(it)");
                        List U2 = C112550d0.m153785U(optString2, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList<String> arrayList4 = new ArrayList<>();
                        if (C87412m.m108589b((String) U2.get(0), "array")) {
                            for (String add2 : U2.subList(1, U2.size())) {
                                arrayList4.add(add2);
                            }
                        }
                        aVar3.f320937e = arrayList4;
                    }
                }
            }
            this.f307777d.f307787i.add(aVar3);
        }
        C32228q<ArrayList<C104325a>, ArrayList<C107026a>, ArrayList<C107267a>, C13598b0> qVar = this.f307778e;
        C104064e eVar = this.f307777d;
        qVar.invoke(eVar.f307785g, eVar.f307786h, eVar.f307787i);
        return C13598b0.f38549a;
    }
}
