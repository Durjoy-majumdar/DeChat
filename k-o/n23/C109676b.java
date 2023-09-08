package n23;

import a70.C112760b;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d23.C106976a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import qr3.C110465b;
import rr3.C110636m;
import rx3.C13604l;
import sx3.C110821n;
import sx3.C90364q0;
import z04.C119027c;

/* renamed from: n23.b */
public final class C109676b {

    /* renamed from: a */
    public static final C109676b f328306a = new C109676b();

    /* renamed from: b */
    public static final String f328307b = (C112760b.m154225d() + "imageEnhancementSceneFilterSettings.json");

    /* renamed from: c */
    public static final HashMap<Integer, List<C110465b>> f328308c = new HashMap<>();

    /* renamed from: d */
    public static final HashMap<Integer, List<C110465b>> f328309d = new HashMap<>();

    /* renamed from: e */
    public static float f328310e = 0.45f;

    /* renamed from: f */
    public static float f328311f = 0.1f;

    /* renamed from: g */
    public static float f328312g = 0.1f;

    /* renamed from: h */
    public static float f328313h = 0.2f;

    /* renamed from: i */
    public static float f328314i = 0.4f;

    /* renamed from: j */
    public static final Map<C110465b.C110467b, Integer> f328315j = C90364q0.m113147f(new C13604l(C110465b.C110467b.SkinSmooth, 0), new C13604l(C110465b.C110467b.EyeBright, 1), new C13604l(C110465b.C110467b.SkinBright, 2), new C13604l(C110465b.C110467b.EyeMorph, 3), new C13604l(C110465b.C110467b.FaceMorph, 4));

    /* renamed from: k */
    public static final float[] f328316k = {f328310e, f328314i, f328313h, f328311f, f328312g};

    /* renamed from: a */
    public final void mo160900a() {
        if (MultiProcessMMKV.getMMKV("FINDER_CONFIG_USER_KEY").getInt("USERINFO_FINDER_SHOW_IMAGE_ENHANCEMENT_SETTING_INT_SYNC", 0) == 1) {
            mo160903d();
            HashMap<Integer, List<C110465b>> hashMap = f328309d;
            C87412m.m108594g(hashMap, "infoMap");
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : hashMap.entrySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, ((Number) next.getKey()).intValue());
                List<C110465b> list = (List) next.getValue();
                C87412m.m108594g(list, "filtersInfo");
                JSONArray jSONArray2 = new JSONArray();
                for (C110465b bVar : list) {
                    C87412m.m108594g(bVar, "info");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", bVar.f330336a.ordinal());
                    jSONObject2.put("filterWeight", Float.valueOf(bVar.f330337b));
                    jSONObject2.put("filterPath", bVar.f330338c);
                    jSONObject2.put("builtinLutFilterType", bVar.f330339d.ordinal());
                    JSONArray jSONArray3 = new JSONArray();
                    float[] fArr = bVar.f330340e;
                    C87412m.m108593f(fArr, "info.filterWeights");
                    for (float valueOf : fArr) {
                        jSONArray3.put(Float.valueOf(valueOf));
                    }
                    jSONObject2.put("filterWeights", jSONArray3);
                    jSONArray2.put(jSONObject2);
                }
                jSONObject.put("filters", jSONArray2);
                jSONArray.put(jSONObject);
            }
            String str = f328307b;
            String jSONArray4 = jSONArray.toString();
            C87412m.m108593f(jSONArray4, "json.toString()");
            byte[] bytes = jSONArray4.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            C86013q1.m106438T(str, bytes, 0, bytes.length);
        }
        String N = C86013q1.m106432N(f328307b);
        C106976a aVar = C106976a.f320208a;
        C87412m.m108593f(N, "settingsJson");
        C106976a.C106977b bVar2 = C106976a.f320213f;
        if (bVar2 != null && bVar2.mo157411a() > 0) {
            C110636m mVar = bVar2.f320221a;
            if (mVar != null) {
                VLogEffectJNI.INSTANCE.setConfigJson$renderlib_release(mVar.f330969c, N);
            }
            Log.m105924i("MicroMsg.LocalEffectManager", "setImageEnhancementSceneFilterSettingsByJson:" + N);
            Log.m105924i("MicroMsg.LocalEffectManager", "setImageEnhancementSceneFilterSettingsByJson, ret:" + true + ", effectId:" + bVar2.mo157411a());
        }
    }

    /* renamed from: b */
    public final String mo160901b(int i) {
        Context context = MMApplicationContext.getContext();
        if (i == 0) {
            String string = context.getString(C0966R.string.kap);
            C87412m.m108593f(string, "context.getString(R.string.video_label_pet)");
            return string;
        } else if (i == 1) {
            String string2 = context.getString(C0966R.string.kao);
            C87412m.m108593f(string2, "context.getString(R.string.video_label_people)");
            return string2;
        } else if (i == 2) {
            String string3 = context.getString(C0966R.string.kal);
            C87412m.m108593f(string3, "context.getString(R.string.video_label_food)");
            return string3;
        } else if (i == 3) {
            String string4 = context.getString(C0966R.string.kaq);
            C87412m.m108593f(string4, "context.getString(R.string.video_label_plant)");
            return string4;
        } else if (i == 4) {
            String string5 = context.getString(C0966R.string.kak);
            C87412m.m108593f(string5, "context.getString(R.string.video_label_flower)");
            return string5;
        } else if (i == 5) {
            String string6 = context.getString(C0966R.string.kas);
            C87412m.m108593f(string6, "context.getString(R.string.video_label_sky)");
            return string6;
        } else if (i == 6) {
            String string7 = context.getString(C0966R.string.kau);
            C87412m.m108593f(string7, "context.getString(R.stri…ideo_label_sunrisesunset)");
            return string7;
        } else if (i == 7) {
            String string8 = context.getString(C0966R.string.kat);
            C87412m.m108593f(string8, "context.getString(R.string.video_label_snow)");
            return string8;
        } else if (i == 8) {
            String string9 = context.getString(C0966R.string.kai);
            C87412m.m108593f(string9, "context.getString(R.string.video_label_city)");
            return string9;
        } else if (i == 9) {
            String string10 = context.getString(C0966R.string.kam);
            C87412m.m108593f(string10, "context.getString(R.string.video_label_night)");
            return string10;
        } else if (i == 10) {
            String string11 = context.getString(C0966R.string.kar);
            C87412m.m108593f(string11, "context.getString(R.string.video_label_room)");
            return string11;
        } else if (i == 11) {
            String string12 = context.getString(C0966R.string.kaj);
            C87412m.m108593f(string12, "context.getString(R.string.video_label_doc)");
            return string12;
        } else if (i != 12) {
            return "Unknown type";
        } else {
            String string13 = context.getString(C0966R.string.kan);
            C87412m.m108593f(string13, "context.getString(R.string.video_label_origin)");
            return string13;
        }
    }

    /* renamed from: c */
    public final HashMap<Integer, List<C110465b>> mo160902c(JSONArray jSONArray) {
        C110465b.C110468c cVar;
        C110465b.C110466a aVar;
        JSONArray jSONArray2 = jSONArray;
        C87412m.m108594g(jSONArray2, "json");
        HashMap<Integer, List<C110465b>> hashMap = new HashMap<>();
        int length = jSONArray.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            JSONObject jSONObject = jSONArray2.getJSONObject(i2);
            int optInt = jSONObject.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
            JSONArray optJSONArray = jSONObject.optJSONArray("filters");
            if (optInt >= 0 && optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                int length2 = optJSONArray.length();
                int i3 = 0;
                while (i3 < length2) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    C87412m.m108593f(jSONObject2, "jsonArray.getJSONObject(i)");
                    C110465b bVar = new C110465b();
                    int optInt2 = jSONObject2.optInt("type", i);
                    C110465b.C110468c[] values = C110465b.C110468c.values();
                    int length3 = values.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length3) {
                            cVar = C110465b.C110468c.Unknown;
                            break;
                        }
                        cVar = values[i4];
                        if (cVar.ordinal() == optInt2) {
                            break;
                        }
                        i4++;
                    }
                    bVar.f330336a = cVar;
                    bVar.f330337b = (float) jSONObject2.optDouble("filterWeight", 0.0d);
                    bVar.f330338c = jSONObject2.optString("filterPath");
                    int optInt3 = jSONObject2.optInt("builtinLutFilterType", 0);
                    C110465b.C110466a[] values2 = C110465b.C110466a.values();
                    int length4 = values2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length4) {
                            aVar = C110465b.C110466a.Unknown;
                            break;
                        }
                        aVar = values2[i5];
                        if (aVar.ordinal() == optInt3) {
                            break;
                        }
                        i5++;
                    }
                    bVar.f330339d = aVar;
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("filterWeights");
                    if (optJSONArray2 != null) {
                        bVar.f330340e = new float[optJSONArray2.length()];
                        int length5 = optJSONArray2.length();
                        for (int i6 = 0; i6 < length5; i6++) {
                            bVar.f330340e[i6] = (float) optJSONArray2.getDouble(i6);
                        }
                    }
                    arrayList.add(bVar);
                    i3++;
                    i = 0;
                }
                hashMap.put(Integer.valueOf(optInt), arrayList);
            }
            i2++;
            i = 0;
        }
        return hashMap;
    }

    /* renamed from: d */
    public final void mo160903d() {
        Object obj;
        boolean z;
        List list = f328309d.get(1);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((C110465b) obj).f330336a == C110465b.C110468c.FACE_BEAUTY) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C110465b bVar = (C110465b) obj;
            if (bVar != null) {
                float[] fArr = bVar.f330340e;
                int length = fArr.length;
                float[] fArr2 = f328316k;
                if (length == fArr2.length) {
                    C87412m.m108593f(fArr, "it.filterWeights");
                    C110821n.m150964k(fArr, fArr2, 0, 0, 0, 14, (Object) null);
                } else {
                    float[] fArr3 = new float[fArr2.length];
                    bVar.f330340e = fArr3;
                    C110821n.m150964k(fArr2, fArr3, 0, 0, 0, 14, (Object) null);
                }
            }
        }
        Log.m105924i("MicroMsg.ImageEnhancementFilterSettingLogic", "loadFaceBeautySettings, skinSmooth:" + f328310e + ", skinBright:" + f328313h + ", faceMorph:" + f328312g + ", eyeBright:" + f328314i + ", eyeMorph:" + f328311f);
    }
}
