package vs2;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import at2.C92090b;
import at2.C92091c;
import at2.C92092d;
import bt2.C92304c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95136l;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kg3.C76577a;
import org.json.JSONArray;
import org.json.JSONObject;
import qo3.C101218e0;
import us2.C102077f;

/* renamed from: vs2.c */
public final class C102274c {

    /* renamed from: vs2.c$a */
    public static final class C102275a implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C102077f f301235a;

        /* renamed from: b */
        public final /* synthetic */ String f301236b;

        /* renamed from: c */
        public final /* synthetic */ C101218e0 f301237c;

        public C102275a(C102077f fVar, String str, C101218e0 e0Var) {
            this.f301235a = fVar;
            this.f301236b = str;
            this.f301237c = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$1");
            HashMap hashMap = new HashMap();
            hashMap.put("ret", -1);
            ((C95136l) this.f301235a).mo131653O(this.f301236b, "user canceled", hashMap);
            this.f301237c.mo140680z();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$1");
        }
    }

    /* renamed from: vs2.c$b */
    public static final class C102276b implements C101218e0.C12907m {

        /* renamed from: a */
        public final /* synthetic */ C92090b f301238a;

        /* renamed from: b */
        public final /* synthetic */ C102077f f301239b;

        /* renamed from: c */
        public final /* synthetic */ String f301240c;

        /* renamed from: d */
        public final /* synthetic */ C101218e0 f301241d;

        public C102276b(C92090b bVar, C102077f fVar, String str, C101218e0 e0Var) {
            this.f301238a = bVar;
            this.f301239b = fVar;
            this.f301240c = str;
            this.f301241d = e0Var;
        }

        /* renamed from: a */
        public final void mo2001a() {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$2");
            HashMap hashMap = new HashMap();
            hashMap.put("ret", 0);
            try {
                JSONArray jSONArray = new JSONArray();
                for (C92092d next : this.f301238a.mo126079a()) {
                    JSONObject jSONObject = new JSONObject();
                    next.getClass();
                    SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                    String str = next.f263641a;
                    SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                    jSONObject.put("k", str);
                    SnsMethodCalculate.markStartTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                    String str2 = next.f263642b;
                    SnsMethodCalculate.markEndTimeMs("getLabel", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                    jSONObject.put("v", str2);
                    jSONArray.put(jSONObject);
                }
                hashMap.put("jsapi_callback_json_special_key", "result");
                String jSONArray2 = jSONArray.toString();
                C87412m.m108593f(jSONArray2, "ary.toString()");
                hashMap.put("result", jSONArray2);
            } catch (Exception unused) {
            }
            ((C95136l) this.f301239b).mo131653O(this.f301240c, "ok", hashMap);
            this.f301241d.mo140680z();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller$handleOpenWheelPicker$2");
        }
    }

    /* renamed from: a */
    public static final void m134909a(Context context, String str, JSONObject jSONObject, C102077f fVar) {
        String str2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        C92091c cVar;
        T t;
        Iterator<T> it;
        boolean z;
        Context context2 = context;
        String str3 = str;
        JSONObject jSONObject2 = jSONObject;
        C102077f fVar2 = fVar;
        String str4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.WheelPickerCaller";
        SnsMethodCalculate.markStartTimeMs("handleOpenWheelPicker", str4);
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(str3, "callbackId");
        C87412m.m108594g(jSONObject2, "paramsJson");
        C87412m.m108594g(fVar2, "callbackInterface");
        if (!(context2 instanceof Activity)) {
            Log.m105928w("WheelPickerCaller", "handleOpenWheelPicker error");
            SnsMethodCalculate.markEndTimeMs("handleOpenWheelPicker", str4);
            return;
        }
        try {
            JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("pickerParams"));
            String optString = jSONObject3.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            if (optString == null) {
                optString = "";
            }
            SnsMethodCalculate.markStartTimeMs("parseJson", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
            int optInt = jSONObject3.optInt("deep");
            JSONArray optJSONArray = jSONObject3.optJSONArray("default");
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            String str5 = "";
            String str6 = "k";
            String str7 = "handleOpenWheelPicker";
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                arrayList = arrayList5;
                int i = 0;
                while (i < length) {
                    int i2 = length;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    JSONArray jSONArray = optJSONArray;
                    String optString2 = optJSONObject != null ? optJSONObject.optString(str6) : null;
                    String str8 = str4;
                    String str9 = optString2 == null ? str5 : optString2;
                    String optString3 = optJSONObject != null ? optJSONObject.optString("v") : null;
                    if (optString3 == null) {
                        optString3 = str5;
                    }
                    arrayList6.add(new C92092d(str9, optString3));
                    i++;
                    length = i2;
                    optJSONArray = jSONArray;
                    str4 = str8;
                }
                str2 = str4;
            } else {
                str2 = str4;
                arrayList = arrayList5;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONArray optJSONArray2 = jSONObject3.optJSONArray("transferTable");
            if (optJSONArray2 != null) {
                int length2 = optJSONArray2.length();
                int i3 = 0;
                while (i3 < length2) {
                    int i4 = length2;
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                    String optString4 = optJSONObject2.optString(str6);
                    JSONArray jSONArray2 = optJSONArray2;
                    String str10 = optString4 == null ? str5 : optString4;
                    String optString5 = optJSONObject2.optString("v");
                    C87412m.m108593f(optString5, "jsonObj.optString(\"v\")");
                    linkedHashMap.put(str10, optString5);
                    i3++;
                    length2 = i4;
                    str6 = str6;
                    optJSONArray2 = jSONArray2;
                }
            }
            JSONArray optJSONArray3 = jSONObject3.optJSONArray("data");
            ArrayList arrayList7 = new ArrayList();
            C92091c cVar2 = new C92091c("root", "root", arrayList7, (C92091c) null);
            if (optJSONArray3 != null) {
                arrayList2 = arrayList6;
                ArrayList arrayList8 = arrayList7;
                arrayList3 = arrayList;
                C102273b.f301234a.mo141838a(optJSONArray3, arrayList8, cVar2, 0, optInt, linkedHashMap);
            } else {
                arrayList2 = arrayList6;
                arrayList3 = arrayList;
            }
            C92091c cVar3 = cVar2;
            int i5 = 0;
            while (i5 < optInt) {
                List<C92091c> a = cVar3.mo126080a();
                if (a != null) {
                    Iterator<T> it4 = a.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList4 = arrayList2;
                            cVar = cVar3;
                            t = null;
                            break;
                        }
                        t = it4.next();
                        C92091c cVar4 = (C92091c) t;
                        if (arrayList2.size() > i5) {
                            String b = cVar4.mo126081b();
                            ArrayList arrayList9 = arrayList2;
                            cVar = cVar3;
                            C92092d dVar = (C92092d) arrayList9.get(i5);
                            dVar.getClass();
                            it = it4;
                            arrayList4 = arrayList9;
                            SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                            String str11 = dVar.f263641a;
                            SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.wheelpickerview.PickItem");
                            z = C87412m.m108589b(b, str11);
                        } else {
                            arrayList4 = arrayList2;
                            cVar = cVar3;
                            it = it4;
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                        cVar3 = cVar;
                        it4 = it;
                        arrayList2 = arrayList4;
                    }
                    C92091c cVar5 = (C92091c) t;
                    if (cVar5 != null) {
                        arrayList3.add(cVar5);
                        cVar3 = cVar5;
                        i5++;
                        arrayList2 = arrayList4;
                    }
                } else {
                    arrayList4 = arrayList2;
                    cVar = cVar3;
                }
                cVar3 = cVar;
                i5++;
                arrayList2 = arrayList4;
            }
            C102272a aVar = new C102272a(optInt, cVar2, arrayList3);
            SnsMethodCalculate.markEndTimeMs("parseJson", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.wheelpicker.JsDataMapper");
            C92304c cVar6 = new C92304c(context2, aVar);
            C101218e0 e0Var = new C101218e0(context2, 1, 2);
            e0Var.mo140667n(context2.getString(C0966R.string.f7926wf), context2.getString(C0966R.string.a18));
            e0Var.mo140668o(0);
            C102275a aVar2 = new C102275a(fVar2, str3, e0Var);
            C102276b bVar = new C102276b(cVar6, fVar2, str3, e0Var);
            e0Var.f296373D = aVar2;
            e0Var.f296374E = bVar;
            LinearLayout linearLayout = new LinearLayout(context2);
            TextView textView = new TextView(context2);
            textView.setGravity(17);
            int h = C76577a.m92157h(context2, C0966R.dimen.ao5);
            textView.setText(optString);
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            textView.setTextColor(C76577a.m92153d(context2, C0966R.color.f3307n6));
            textView.setTextSize(0, (float) h);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, C76577a.m92155f(context2, C0966R.dimen.anz)));
            linearLayout.setGravity(17);
            e0Var.mo140672r(linearLayout);
            RelativeLayout relativeLayout = new RelativeLayout(context2);
            relativeLayout.addView(cVar6.mo126288b(), -1, C76577a.m92155f(context2, C0966R.dimen.any));
            e0Var.mo140663j(relativeLayout);
            e0Var.mo140655A();
            SnsMethodCalculate.markEndTimeMs(str7, str2);
        } catch (Exception unused) {
            Log.m105928w("WheelPickerCaller", "handleOpenWheelPicker error params");
            SnsMethodCalculate.markEndTimeMs("handleOpenWheelPicker", str4);
        }
    }
}
