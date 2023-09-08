package yl0;

import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.util.Base64;
import bm0.C0328a;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82560l0;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82863k;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import js0.C88016e;
import org.json.JSONArray;
import org.json.JSONObject;
import p224ra.C89909e;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C64197v;
import sx3.C90364q0;
import zl0.C91774e;
import zl0.C91789o;

/* renamed from: yl0.q */
public final class C91504q extends C82268c<C82381f> {
    public static final int CTRL_INDEX = 793;
    public static final String NAME = "writeNdefMessage";

    /* renamed from: yl0.q$a */
    public static final class C91505a extends C87413o implements C32226l<C91789o<C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82381f f262315d;

        /* renamed from: e */
        public final /* synthetic */ int f262316e;

        /* renamed from: f */
        public final /* synthetic */ C91504q f262317f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91505a(C82381f fVar, int i, C91504q qVar) {
            super(1);
            this.f262315d = fVar;
            this.f262316e = i;
            this.f262317f = qVar;
        }

        public Object invoke(Object obj) {
            C91789o oVar = (C91789o) obj;
            C87412m.m108594g(oVar, "result");
            Log.m105918d("MicroMsg.AppBrand.JsApiWriteNdefMessage", "writeNdefMessage, result: " + oVar);
            if (oVar instanceof C91789o.C91791b) {
                this.f262315d.mo109647a(this.f262316e, C82863k.m101618a(this.f262317f, 0, "ok", (Map<String, ? extends Object>) null));
            } else if (oVar instanceof C91789o.C91790a) {
                C82381f fVar = this.f262315d;
                int i = this.f262316e;
                C91504q qVar = this.f262317f;
                C91789o.C91790a aVar = (C91789o.C91790a) oVar;
                int i2 = aVar.f262869a;
                fVar.mo109647a(i, C82863k.m101618a(qVar, i2, "fail:" + aVar.f262870b, C90364q0.m113146e(new C13604l("errCode", Integer.valueOf(aVar.f262869a)))));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yl0.q$b */
    public static final class C91506b extends C87413o implements C32226l<Object, Object> {

        /* renamed from: d */
        public static final C91506b f262318d = new C91506b();

        public C91506b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            C87412m.m108594g(obj, LocaleUtil.ITALIAN);
            return obj;
        }
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        NdefRecord ndefRecord;
        String str;
        String str2;
        C82381f fVar2 = fVar;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        if (fVar2 == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiWriteNdefMessage", "invoke, env is null");
        } else if (jSONObject2 == null) {
            Log.m105928w("MicroMsg.AppBrand.JsApiWriteNdefMessage", "invoke, data is null");
            fVar2.mo109647a(i2, C82863k.m101618a(this, 13011, "fail:invalid parameter", C90364q0.m113146e(new C13604l("errCode", 13011))));
        } else {
            C82560l0 l0Var = (C82560l0) C89909e.m112436a(C82560l0.class);
            if (l0Var == null || l0Var.mo56895eO()) {
                C91774e a = C91774e.f262832c.mo125637a(fVar2);
                C91505a aVar = new C91505a(fVar2, i2, this);
                Log.m105918d("MicroMsg.AppBrand.JsApiWriteNdefMessage", "invoke, appId: " + fVar.getAppId() + ", data: " + jSONObject2);
                String str3 = "get(index)";
                String str4 = "fail:invalid parameter";
                NdefMessage ndefMessage = null;
                String str5 = "MicroMsg.AppBrand.JsApiWriteNdefMessage";
                if (jSONObject2.has("uris")) {
                    try {
                        Object obj = jSONObject2.get("uris");
                        C87412m.m108592e(obj, "null cannot be cast to non-null type org.json.JSONArray");
                        JSONArray jSONArray = (JSONArray) obj;
                        ArrayList<String> arrayList = new ArrayList<>(jSONArray.length());
                        int length = jSONArray.length();
                        for (int i3 = 0; i3 < length; i3++) {
                            Object obj2 = jSONArray.get(i3);
                            C87412m.m108593f(obj2, str3);
                            arrayList.add(obj2.toString());
                        }
                        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                        for (String createUri : arrayList) {
                            try {
                                arrayList2.add(NdefRecord.createUri(createUri));
                            } catch (Exception e) {
                                Log.m105928w("MicroMsg.AppBrand.NdefMessageConverter", "createUri failed since " + e);
                            }
                        }
                        Object[] array = arrayList2.toArray(new NdefRecord[0]);
                        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        try {
                            ndefMessage = new NdefMessage((NdefRecord[]) array);
                        } catch (Exception e2) {
                            Log.m105928w("MicroMsg.AppBrand.NdefMessageConverter", "create NdefMessage failed since " + e2);
                        }
                        NdefMessage ndefMessage2 = ndefMessage;
                        if (ndefMessage2 == null) {
                            fVar2.mo109647a(i2, C82863k.m101618a(this, 13012, "fail:parse NdefMessage failed", C90364q0.m113146e(new C13604l("errCode", 13012))));
                        } else {
                            a.mo125636c(ndefMessage2, aVar);
                        }
                    } catch (Exception e3) {
                        Log.m105928w(str5, "parse uris failed since " + e3);
                        fVar2.mo109647a(i2, C82863k.m101618a(this, 13011, str4, C90364q0.m113146e(new C13604l("errCode", 13011))));
                    }
                } else {
                    String str6 = str4;
                    String str7 = str5;
                    if (jSONObject2.has("texts")) {
                        try {
                            Object obj3 = jSONObject2.get("texts");
                            C87412m.m108592e(obj3, "null cannot be cast to non-null type org.json.JSONArray");
                            JSONArray jSONArray2 = (JSONArray) obj3;
                            ArrayList arrayList3 = new ArrayList(jSONArray2.length());
                            int length2 = jSONArray2.length();
                            C91774e eVar = a;
                            int i4 = 0;
                            while (i4 < length2) {
                                int i5 = length2;
                                Object obj4 = jSONArray2.get(i4);
                                C87412m.m108593f(obj4, str3);
                                JSONArray jSONArray3 = jSONArray2;
                                JSONObject jSONObject3 = obj4 instanceof JSONObject ? (JSONObject) obj4 : null;
                                if (jSONObject3 == null) {
                                    Log.m105928w(str7, "parse texts failed since convert jsonObject failed");
                                    fVar2.mo109647a(i2, C82863k.m101618a(this, 13011, str6, C90364q0.m113146e(new C13604l("errCode", 13011))));
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                String str8 = str3;
                                Iterator<String> keys = jSONObject3.keys();
                                str = str6;
                                try {
                                    C87412m.m108593f(keys, "keys()");
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        Iterator<String> it = keys;
                                        C87412m.m108593f(next, LocaleUtil.ITALIAN);
                                        Object obj5 = jSONObject3.get(next);
                                        C87412m.m108593f(obj5, "get(it)");
                                        hashMap.put(next, obj5.toString());
                                        keys = it;
                                        jSONObject3 = jSONObject3;
                                    }
                                    arrayList3.add(hashMap);
                                    i4++;
                                    length2 = i5;
                                    jSONArray2 = jSONArray3;
                                    str3 = str8;
                                    str6 = str;
                                } catch (Exception e4) {
                                    e = e4;
                                    Log.m105928w(str7, "parse texts failed since " + e);
                                    fVar2.mo109647a(i2, C82863k.m101618a(this, 13011, str, C90364q0.m113146e(new C13604l("errCode", 13011))));
                                }
                            }
                            ArrayList arrayList4 = new ArrayList(C36907w.m41090l(arrayList3, 10));
                            Iterator it4 = arrayList3.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    Map map = (Map) it4.next();
                                    String str9 = (String) map.get(MimeTypes.BASE_TYPE_TEXT);
                                    if (str9 == null || (str2 = (String) map.get(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE)) == null) {
                                        break;
                                    }
                                    try {
                                        arrayList4.add(NdefRecord.createTextRecord(str2, str9));
                                    } catch (Exception e5) {
                                        Log.m105928w("MicroMsg.AppBrand.NdefMessageConverter", "createTextRecord failed since " + e5);
                                    }
                                } else {
                                    Object[] array2 = arrayList4.toArray(new NdefRecord[0]);
                                    C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                    try {
                                        ndefMessage = new NdefMessage((NdefRecord[]) array2);
                                        break;
                                    } catch (Exception e6) {
                                        Log.m105928w("MicroMsg.AppBrand.NdefMessageConverter", "create NdefMessage failed since " + e6);
                                    }
                                }
                            }
                            NdefMessage ndefMessage3 = ndefMessage;
                            if (ndefMessage3 == null) {
                                fVar2.mo109647a(i2, C82863k.m101618a(this, 13012, "fail:parse NdefMessage failed", C90364q0.m113146e(new C13604l("errCode", 13012))));
                            } else {
                                eVar.mo125636c(ndefMessage3, aVar);
                            }
                        } catch (Exception e7) {
                            e = e7;
                            str = str6;
                            Log.m105928w(str7, "parse texts failed since " + e);
                            fVar2.mo109647a(i2, C82863k.m101618a(this, 13011, str, C90364q0.m113146e(new C13604l("errCode", 13011))));
                        }
                    } else {
                        C91774e eVar2 = a;
                        Map<String, Object> b = C0328a.m269b(jSONObject2, C91506b.f262318d);
                        Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "map2Message, messageMap: " + b);
                        HashMap hashMap2 = (HashMap) b;
                        Object obj6 = hashMap2.get("records");
                        List list = obj6 instanceof List ? (List) obj6 : null;
                        if (list != null) {
                            ArrayList arrayList5 = new ArrayList(C36907w.m41090l(list, 10));
                            Iterator it5 = list.iterator();
                            int i6 = 0;
                            while (true) {
                                if (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    int i7 = i6 + 1;
                                    if (i6 >= 0) {
                                        Map map2 = (Map) next2;
                                        Iterator it6 = it5;
                                        StringBuilder sb = new StringBuilder();
                                        int i8 = i7;
                                        sb.append("map2Message, index: ");
                                        sb.append(i6);
                                        sb.append(", map: ");
                                        sb.append(map2);
                                        Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", sb.toString());
                                        Object obj7 = hashMap2.get("payload-" + i6);
                                        ByteBuffer byteBuffer = obj7 instanceof ByteBuffer ? (ByteBuffer) obj7 : null;
                                        if (byteBuffer == null) {
                                            break;
                                        }
                                        Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "map2Message, byteBuffer: " + byteBuffer);
                                        C13604l lVar = new C13604l(map2, byteBuffer);
                                        StringBuilder sb4 = new StringBuilder();
                                        HashMap hashMap3 = hashMap2;
                                        sb4.append("recordMap2Record, recordMap: ");
                                        sb4.append(lVar);
                                        Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", sb4.toString());
                                        Object obj8 = map2.get("tnf");
                                        Integer num = obj8 instanceof Integer ? (Integer) obj8 : null;
                                        if (num != null) {
                                            int intValue = num.intValue();
                                            Object obj9 = map2.get("type");
                                            String str10 = obj9 instanceof String ? (String) obj9 : null;
                                            byte[] decode = str10 != null ? Base64.decode(str10, 2) : null;
                                            Object obj10 = map2.get("id");
                                            String str11 = obj10 instanceof String ? (String) obj10 : null;
                                            try {
                                                ndefRecord = new NdefRecord((short) intValue, decode, str11 != null ? Base64.decode(str11, 2) : null, C88016e.m109544a(byteBuffer));
                                            } catch (Exception e8) {
                                                Log.m105928w("MicroMsg.AppBrand.NdefMessageConverter", "recordMap2Record failed since " + e8);
                                            }
                                            arrayList5.add(ndefRecord);
                                            it5 = it6;
                                            i6 = i8;
                                            hashMap2 = hashMap3;
                                        }
                                        ndefRecord = null;
                                        arrayList5.add(ndefRecord);
                                        it5 = it6;
                                        i6 = i8;
                                        hashMap2 = hashMap3;
                                    } else {
                                        C64197v.m75542k();
                                        throw null;
                                    }
                                } else {
                                    Log.m105918d("MicroMsg.AppBrand.NdefMessageConverter", "map2Message, records: " + arrayList5);
                                    try {
                                        Object[] array3 = arrayList5.toArray(new NdefRecord[0]);
                                        C87412m.m108592e(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                        ndefMessage = new NdefMessage((NdefRecord[]) array3);
                                        break;
                                    } catch (Exception e9) {
                                        Log.m105928w("MicroMsg.AppBrand.NdefMessageConverter", "create NdefMessage failed since " + e9);
                                    }
                                }
                            }
                        }
                        NdefMessage ndefMessage4 = ndefMessage;
                        if (ndefMessage4 == null) {
                            fVar2.mo109647a(i2, C82863k.m101618a(this, 13012, "fail:parse NdefMessage failed", C90364q0.m113146e(new C13604l("errCode", 13012))));
                        } else {
                            eVar2.mo125636c(ndefMessage4, aVar);
                        }
                    }
                }
            } else {
                fVar2.mo109647a(i2, C82863k.m101618a(this, 13019, "fail:user is not authorized", C90364q0.m113146e(new C13604l("errCode", 13019))));
            }
        }
    }
}
