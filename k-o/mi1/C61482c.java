package mi1;

import al1.C54130j;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import cl1.C55001u;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.JsApiNFCStartHCE;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83031z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import fj1.C45795b;
import fy3.C32226l;
import gi1.C32458d;
import gi1.C32459e;
import gi1.C59463a;
import gi1.C59465f;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import o40.C61926c;
import org.json.JSONArray;
import org.json.JSONObject;
import sx3.C36907w;
import sx3.C77813z;
import ux3.C65486b;
import z04.C66730w;

/* renamed from: mi1.c */
public final class C61482c {

    /* renamed from: a */
    public static final C61482c f174809a = new C61482c();

    /* renamed from: mi1.c$a */
    public static final class C61483a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C59463a) t).f169895b.f169901e), Integer.valueOf(((C59463a) t2).f169895b.f169901e));
        }
    }

    /* renamed from: mi1.c$b */
    public static final class C61484b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Integer.valueOf(((C59463a) t).f169895b.f169902f), Integer.valueOf(((C59463a) t2).f169895b.f169902f));
        }
    }

    /* renamed from: a */
    public final LinkedList<C59463a> mo86454a(Point point, LinkedList<C59463a> linkedList, LinkedHashMap<String, Rect> linkedHashMap) {
        Point point2 = point;
        LinkedList<C59463a> linkedList2 = linkedList;
        LinkedHashMap<String, Rect> linkedHashMap2 = linkedHashMap;
        C87412m.m108594g(point2, "windowSize");
        C87412m.m108594g(linkedList2, "tempList");
        C87412m.m108594g(linkedHashMap2, "rectMap");
        int i = point2.x;
        int i2 = point2.y;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        Iterator<T> it = linkedList.iterator();
        while (it.hasNext()) {
            C59463a aVar = (C59463a) it.next();
            C54130j jVar = aVar.f169894a;
            C59465f fVar = aVar.f169895b;
            Iterator<T> it4 = it;
            ArrayList arrayList2 = arrayList;
            C59465f fVar2 = r8;
            C59465f fVar3 = new C59465f(fVar.f165729a, fVar.f165730b, fVar.f165731c, fVar.f165732d, fVar.f169901e, fVar.f169902f, fVar.f169903g, fVar.f169904h, fVar.f169905i);
            C59463a aVar2 = new C59463a(jVar, fVar2);
            C59465f fVar4 = aVar2.f169895b;
            boolean z = true;
            if (!(fVar4.f165731c == 1.0f)) {
                if (fVar4.f165732d != 1.0f) {
                    z = false;
                }
                if (!z) {
                    Rect rect = linkedHashMap2.get(aVar2.mo84561a());
                    float f = 0.0f;
                    float f2 = (float) i;
                    fVar4.f165729a = (rect != null ? (float) rect.left : 0.0f) / f2;
                    C59465f fVar5 = aVar2.f169895b;
                    Rect rect2 = linkedHashMap2.get(aVar2.mo84561a());
                    float f3 = (float) i2;
                    fVar5.f165730b = (rect2 != null ? (float) rect2.top : 0.0f) / f3;
                    C59465f fVar6 = aVar2.f169895b;
                    Rect rect3 = linkedHashMap2.get(aVar2.mo84561a());
                    fVar6.f165731c = (rect3 != null ? (float) rect3.width() : 0.0f) / f2;
                    C59465f fVar7 = aVar2.f169895b;
                    Rect rect4 = linkedHashMap2.get(aVar2.mo84561a());
                    if (rect4 != null) {
                        f = (float) rect4.height();
                    }
                    fVar7.f165732d = f / f3;
                }
            }
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(aVar2);
            arrayList = arrayList3;
            it = it4;
        }
        return new LinkedList<>(arrayList);
    }

    /* renamed from: b */
    public final boolean mo86455b(String str, JSONObject jSONObject, C32458d dVar) {
        T t;
        String str2;
        String str3;
        String str4;
        float f;
        float f2;
        String str5;
        String str6;
        String str7;
        int i;
        float f3;
        float f4;
        ArrayList arrayList;
        Object obj;
        String str8;
        int i2;
        Integer num;
        String str9;
        int i3;
        int i4;
        C59465f fVar;
        C59465f fVar2;
        C59465f fVar3;
        C59465f fVar4;
        C59465f fVar5;
        C59465f fVar6;
        String str10;
        String optString;
        Float d;
        String optString2;
        Float d2;
        String optString3;
        Float d3;
        String optString4;
        Float d4;
        C59465f fVar7;
        C59465f fVar8;
        C59465f fVar9;
        C59465f fVar10;
        C59465f fVar11;
        Float d5;
        Float d6;
        Float d7;
        Float d8;
        Float d9;
        String str11 = str;
        JSONObject jSONObject2 = jSONObject;
        C32458d dVar2 = dVar;
        C87412m.m108594g(str11, "curAnchorUid");
        if (jSONObject2 == null || dVar2 == null) {
            C32458d dVar3 = dVar2;
            return (jSONObject2 == null && dVar3 != null) || (jSONObject2 != null && dVar3 == null);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("list");
        int optInt = jSONObject2.optInt("m");
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        String str12 = "FinderLiveMicRatioUtil";
        if ((str.length() == 0) || (dVar2.f86243a.size() == 1 && C87412m.m108589b(dVar2.f86243a.get(0).mo84561a(), str11) && length == 0 && optInt == dVar2.f86244b)) {
            Log.m105924i(str12, "diffLastMicCoverDataList data is same return false curSize: " + length);
            return false;
        }
        String optString5 = jSONObject2.optString("x");
        float floatValue = (optString5 == null || (d9 = C66730w.m78730d(optString5)) == null) ? 0.0f : d9.floatValue();
        String optString6 = jSONObject2.optString("y");
        float floatValue2 = (optString6 == null || (d8 = C66730w.m78730d(optString6)) == null) ? 0.0f : d8.floatValue();
        String optString7 = jSONObject2.optString("w");
        float floatValue3 = (optString7 == null || (d7 = C66730w.m78730d(optString7)) == null) ? 0.0f : d7.floatValue();
        String optString8 = jSONObject2.optString("h");
        float floatValue4 = (optString8 == null || (d6 = C66730w.m78730d(optString8)) == null) ? 0.0f : d6.floatValue();
        String optString9 = jSONObject2.optString("a");
        float floatValue5 = (optString9 == null || (d5 = C66730w.m78730d(optString9)) == null) ? 0.0f : d5.floatValue();
        int optInt2 = jSONObject2.optInt("f");
        String str13 = "f";
        Iterator<T> it = dVar2.f86243a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Iterator<T> it4 = it;
            if (C87412m.m108589b(((C59463a) t).mo84561a(), str11)) {
                break;
            }
            it = it4;
        }
        C59463a aVar = (C59463a) t;
        if (aVar != null) {
            str2 = "h";
            str3 = aVar.mo84561a();
        } else {
            str2 = "h";
            str3 = "";
        }
        String str14 = "w";
        float f5 = (aVar == null || (fVar11 = aVar.f169895b) == null) ? 0.0f : fVar11.f165729a;
        String str15 = "y";
        float f6 = (aVar == null || (fVar10 = aVar.f169895b) == null) ? 0.0f : fVar10.f165730b;
        String str16 = "x";
        float f7 = (aVar == null || (fVar9 = aVar.f169895b) == null) ? 0.0f : fVar9.f165731c;
        JSONArray jSONArray = optJSONArray;
        float f8 = (aVar == null || (fVar8 = aVar.f169895b) == null) ? 0.0f : fVar8.f165732d;
        float f9 = floatValue5;
        float f15 = dVar2.f86245c;
        int i5 = (aVar == null || (fVar7 = aVar.f169895b) == null) ? 0 : fVar7.f169903g;
        float f16 = f15;
        int i6 = dVar2.f86244b;
        if (!TextUtils.equals(str11, str3)) {
            Log.m105924i(str12, "diffLastMicCoverDataList diff curAnchorUid: " + str11 + " lastAnchorUid: " + str3);
            return true;
        }
        String str17 = " lastAnchorUid: ";
        String str18 = str3;
        String str19 = " curFocus: ";
        String str20 = " lastFocus: ";
        String str21 = " lastMode: ";
        if (optInt == i6 && optInt2 == i5) {
            if (floatValue == f5) {
                if (floatValue2 == f6) {
                    if (floatValue3 == f7) {
                        if (floatValue4 == f8) {
                            if (!(f9 == f16)) {
                                f2 = f8;
                                str4 = str12;
                                f = floatValue4;
                                str6 = str19;
                                str7 = str17;
                                str5 = str20;
                                Log.m105924i(str4, "diffLastMicCoverDataList diff curMode: " + optInt + str21 + i6 + str6 + optInt2 + str5 + i5 + "curAnchorUid: " + str11 + str7 + str18 + "  curAnchorX: " + floatValue + " lastAnchorX: " + f5 + " curAnchorY: " + floatValue2 + " lastAnchorY: " + f6 + " curAnchorW: " + floatValue3 + " lastAnchorW: " + f7 + " curAnchorH: " + f + " lastAnchorH: " + f2 + " curVideoRate: " + f9 + " lastVideoRate: " + f16);
                                return true;
                            }
                            LinkedList<C59463a> linkedList = dVar.f86243a;
                            ArrayList arrayList2 = new ArrayList();
                            for (T next : linkedList) {
                                C59463a aVar2 = (C59463a) next;
                                if (!C87412m.m108589b(aVar2.mo84561a(), str11) && !aVar2.f169895b.f169904h) {
                                    arrayList2.add(next);
                                }
                            }
                            if (jSONArray == null) {
                                return true;
                            }
                            if (jSONArray.length() != arrayList2.size()) {
                                Log.m105924i(str12, "diffLastMicCoverDataList curList size: " + jSONArray.length() + " lastList size: " + arrayList2.size());
                                return true;
                            }
                            int length2 = jSONArray.length();
                            int i7 = 0;
                            while (i7 < length2) {
                                JSONArray jSONArray2 = jSONArray;
                                JSONObject optJSONObject = jSONArray2.optJSONObject(i7);
                                String optString10 = optJSONObject != null ? optJSONObject.optString(DownloadInfo.UID) : null;
                                String str22 = str16;
                                float floatValue6 = (optJSONObject == null || (optString4 = optJSONObject.optString(str22)) == null || (d4 = C66730w.m78730d(optString4)) == null) ? 0.0f : d4.floatValue();
                                String str23 = str15;
                                float floatValue7 = (optJSONObject == null || (optString3 = optJSONObject.optString(str23)) == null || (d3 = C66730w.m78730d(optString3)) == null) ? 0.0f : d3.floatValue();
                                String str24 = str14;
                                if (optJSONObject == null || (optString2 = optJSONObject.optString(str24)) == null || (d2 = C66730w.m78730d(optString2)) == null) {
                                    i = length2;
                                    f3 = 0.0f;
                                } else {
                                    i = length2;
                                    f3 = d2.floatValue();
                                }
                                jSONArray = jSONArray2;
                                String str25 = str2;
                                if (optJSONObject == null || (optString = optJSONObject.optString(str25)) == null || (d = C66730w.m78730d(optString)) == null) {
                                    str10 = str25;
                                    f4 = 0.0f;
                                } else {
                                    float floatValue8 = d.floatValue();
                                    str10 = str25;
                                    f4 = floatValue8;
                                }
                                str16 = str22;
                                int optInt3 = optJSONObject != null ? optJSONObject.optInt("us") : 0;
                                str15 = str23;
                                String str26 = str13;
                                int optInt4 = optJSONObject != null ? optJSONObject.optInt(str26) : 0;
                                Iterator it5 = arrayList2.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        arrayList = arrayList2;
                                        obj = null;
                                        break;
                                    }
                                    obj = it5.next();
                                    arrayList = arrayList2;
                                    if (C87412m.m108589b(((C59463a) obj).mo84561a(), optString10)) {
                                        break;
                                    }
                                    arrayList2 = arrayList;
                                }
                                C59463a aVar3 = (C59463a) obj;
                                if (aVar3 != null) {
                                    str13 = str26;
                                    str8 = aVar3.mo84561a();
                                } else {
                                    str13 = str26;
                                    str8 = "";
                                }
                                str14 = str24;
                                float f17 = (aVar3 == null || (fVar6 = aVar3.f169895b) == null) ? 0.0f : fVar6.f165729a;
                                String str27 = str19;
                                float f18 = (aVar3 == null || (fVar5 = aVar3.f169895b) == null) ? 0.0f : fVar5.f165730b;
                                String str28 = str21;
                                float f19 = (aVar3 == null || (fVar4 = aVar3.f169895b) == null) ? 0.0f : fVar4.f165731c;
                                int i8 = i7;
                                float f25 = (aVar3 == null || (fVar3 = aVar3.f169895b) == null) ? 0.0f : fVar3.f165732d;
                                int i9 = optInt3;
                                Integer valueOf = (aVar3 == null || (fVar2 = aVar3.f169895b) == null) ? null : Integer.valueOf(fVar2.f169903g);
                                int i15 = (aVar3 == null || (fVar = aVar3.f169895b) == null) ? 0 : fVar.f169905i;
                                float f26 = f25;
                                if (!TextUtils.equals(optString10, str8)) {
                                    Log.m105924i(str12, "diffLastMicCoverDataList diff curUid: " + optString10 + " lastUid: " + str8);
                                    return true;
                                }
                                if (optInt != i6 || valueOf == null) {
                                    str9 = str12;
                                } else {
                                    str9 = str12;
                                    if (optInt4 == valueOf.intValue()) {
                                        if (floatValue6 == f17) {
                                            if (floatValue7 == f18) {
                                                if (f3 == f19) {
                                                    if (f4 == f26) {
                                                        num = valueOf;
                                                        int i16 = i9;
                                                        i3 = optInt4;
                                                        boolean u = C61926c.m72696u(i16, 2);
                                                        i2 = i16;
                                                        i4 = i15;
                                                        if (u != C61926c.m72696u(i4, 2)) {
                                                            Log.m105924i(str9, "diffLastMicCoverDataList diff curUid: " + optString10 + " lastUid: " + str8 + " curX: " + floatValue6 + " lastX: " + f17 + " curY: " + floatValue7 + " lastY: " + f18 + " curW: " + f3 + " lastW: " + f19 + " curH: " + f4 + " lastH: " + f26 + " curMode: " + optInt + str28 + i6 + str27 + i3 + str20 + num + " curUs: " + i2 + " lastUs: " + i4);
                                                            return true;
                                                        }
                                                        i7 = i8 + 1;
                                                        length2 = i;
                                                        arrayList2 = arrayList;
                                                        str19 = str27;
                                                        str21 = str28;
                                                        str12 = str9;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                num = valueOf;
                                i2 = i9;
                                i4 = i15;
                                i3 = optInt4;
                                Log.m105924i(str9, "diffLastMicCoverDataList diff curUid: " + optString10 + " lastUid: " + str8 + " curX: " + floatValue6 + " lastX: " + f17 + " curY: " + floatValue7 + " lastY: " + f18 + " curW: " + f3 + " lastW: " + f19 + " curH: " + f4 + " lastH: " + f26 + " curMode: " + optInt + str28 + i6 + str27 + i3 + str20 + num + " curUs: " + i2 + " lastUs: " + i4);
                                return true;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        f2 = f8;
        str4 = str12;
        str6 = str19;
        str7 = str17;
        str5 = str20;
        f = floatValue4;
        Log.m105924i(str4, "diffLastMicCoverDataList diff curMode: " + optInt + str21 + i6 + str6 + optInt2 + str5 + i5 + "curAnchorUid: " + str11 + str7 + str18 + "  curAnchorX: " + floatValue + " lastAnchorX: " + f5 + " curAnchorY: " + floatValue2 + " lastAnchorY: " + f6 + " curAnchorW: " + floatValue3 + " lastAnchorW: " + f7 + " curAnchorH: " + f + " lastAnchorH: " + f2 + " curVideoRate: " + f9 + " lastVideoRate: " + f16);
        return true;
    }

    /* renamed from: c */
    public final LinkedHashMap<String, Rect> mo86456c(C45795b bVar, Point point, LinkedList<C59463a> linkedList, float f) {
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(point, "windowSize");
        String str = ((C55001u) bVar.mo71262a(C55001u.class)).f154419p.f182319n;
        if (str == null) {
            str = "";
        }
        return mo86457d(str, point, linkedList, f);
    }

    /* renamed from: d */
    public final LinkedHashMap<String, Rect> mo86457d(String str, Point point, LinkedList<C59463a> linkedList, float f) {
        LinkedHashMap<String, Rect> linkedHashMap;
        String str2;
        String str3;
        String str4 = str;
        Point point2 = point;
        float f2 = f;
        C87412m.m108594g(str4, "anchorUid");
        C87412m.m108594g(point2, "windowSize");
        String str5 = "FinderLiveMicRatioUtil";
        if (((float) point2.y) > ((float) point2.x) / f2) {
            linkedHashMap = new LinkedHashMap<>();
            int i = point2.x;
            int i2 = point2.y;
            float f3 = (float) i2;
            float f4 = f2 * f3;
            int i3 = (int) ((f4 - ((float) i)) / ((float) 2));
            if ((linkedList != null ? linkedList.size() : 0) > 0) {
                if (linkedList != null) {
                    Iterator<T> it = linkedList.iterator();
                    while (it.hasNext()) {
                        C59463a aVar = (C59463a) it.next();
                        C59465f fVar = aVar.f169895b;
                        float f5 = fVar.f165729a;
                        float f6 = fVar.f165730b;
                        linkedHashMap.put(aVar.mo84561a(), new Rect(((int) (f5 * f4)) - i3, (int) (f6 * f3), ((int) ((f5 + fVar.f165731c) * f4)) - i3, (int) ((f6 + fVar.f165732d) * f3)));
                        it = it;
                        float f7 = f;
                        str5 = str5;
                    }
                }
                str3 = str5;
            } else {
                str3 = str5;
                linkedHashMap.put(str4, new Rect(0, 0, i, i2));
            }
            Log.m105924i(str3, "genMicFocusRectMapFixedByHeight windowWidth:" + i + " windowHeight:" + i2 + " realVideoWidth:" + f4 + " leftOffestMargin: " + i3 + " videoRate:" + f);
        } else {
            String str6 = str5;
            linkedHashMap = new LinkedHashMap<>();
            int i4 = point2.x;
            int i5 = point2.y;
            float f8 = (float) i4;
            float f9 = f8 / f2;
            int i6 = (int) ((f9 - ((float) i5)) / ((float) 2));
            if ((linkedList != null ? linkedList.size() : 0) > 0) {
                if (linkedList != null) {
                    Iterator<T> it4 = linkedList.iterator();
                    while (it4.hasNext()) {
                        C59463a aVar2 = (C59463a) it4.next();
                        C59465f fVar2 = aVar2.f169895b;
                        float f15 = fVar2.f165729a;
                        float f16 = fVar2.f165730b;
                        linkedHashMap.put(aVar2.mo84561a(), new Rect((int) (f15 * f8), ((int) (f16 * f9)) - i6, (int) ((f15 + fVar2.f165731c) * f8), ((int) ((f16 + fVar2.f165732d) * f9)) - i6));
                        it4 = it4;
                        float f17 = f;
                        str6 = str6;
                    }
                }
                str2 = str6;
            } else {
                str2 = str6;
                linkedHashMap.put(str4, new Rect(0, 0, i4, i5));
            }
            Log.m105924i(str2, "genMicFocusRectMapFixedByWidth windowWidth:" + i4 + " windowHeight:" + i5 + " realVideoHeight:" + f9 + " topOffestMargin: " + i6 + " videoRate:" + f);
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public final LinkedList<C59463a> mo86458e(JSONObject jSONObject, C54130j jVar, C32226l<? super String, C54130j> lVar) {
        String str;
        String optString;
        Float d;
        String optString2;
        Float d2;
        String optString3;
        Float d3;
        String optString4;
        Float d4;
        String optString5;
        Float d5;
        String optString6;
        Float d6;
        String optString7;
        Float d7;
        String optString8;
        Float d8;
        String optString9;
        Float d9;
        String optString10;
        Float d15;
        String optString11;
        Float d16;
        String optString12;
        Float d17;
        JSONObject jSONObject2 = jSONObject;
        C32226l<? super String, C54130j> lVar2 = lVar;
        C87412m.m108594g(lVar2, "userFilterBlock");
        LinkedList<C59463a> linkedList = new LinkedList<>();
        JSONArray optJSONArray = jSONObject2 != null ? jSONObject2.optJSONArray("list") : null;
        JSONArray optJSONArray2 = jSONObject2 != null ? jSONObject2.optJSONArray("gl") : null;
        float floatValue = (jSONObject2 == null || (optString12 = jSONObject2.optString("x")) == null || (d17 = C66730w.m78730d(optString12)) == null) ? 0.0f : d17.floatValue();
        float floatValue2 = (jSONObject2 == null || (optString11 = jSONObject2.optString("y")) == null || (d16 = C66730w.m78730d(optString11)) == null) ? 0.0f : d16.floatValue();
        float floatValue3 = (jSONObject2 == null || (optString10 = jSONObject2.optString("w")) == null || (d15 = C66730w.m78730d(optString10)) == null) ? 0.0f : d15.floatValue();
        float floatValue4 = (jSONObject2 == null || (optString9 = jSONObject2.optString("h")) == null || (d9 = C66730w.m78730d(optString9)) == null) ? 0.0f : d9.floatValue();
        String str2 = "i";
        JSONArray jSONArray = optJSONArray2;
        String str3 = "h";
        int optInt = jSONObject2 != null ? jSONObject2.optInt("i") : 0;
        String str4 = "w";
        linkedList.add(new C59463a(jVar, new C59465f(floatValue, floatValue2, floatValue3, floatValue4, optInt, 0, 0, false, 0, JsApiNFCStartHCE.CTRL_INDEX, (C8480h) null)));
        if ((optJSONArray != null ? optJSONArray.length() : 0) > 0) {
            LinkedList linkedList2 = new LinkedList();
            int length = optJSONArray != null ? optJSONArray.length() : 0;
            int i = 0;
            while (i < length) {
                JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(i) : null;
                float floatValue5 = (optJSONObject == null || (optString8 = optJSONObject.optString("x")) == null || (d8 = C66730w.m78730d(optString8)) == null) ? 0.0f : d8.floatValue();
                float floatValue6 = (optJSONObject == null || (optString7 = optJSONObject.optString("y")) == null || (d7 = C66730w.m78730d(optString7)) == null) ? 0.0f : d7.floatValue();
                float floatValue7 = (optJSONObject == null || (optString6 = optJSONObject.optString(str4)) == null || (d6 = C66730w.m78730d(optString6)) == null) ? 0.0f : d6.floatValue();
                float floatValue8 = (optJSONObject == null || (optString5 = optJSONObject.optString(str3)) == null || (d5 = C66730w.m78730d(optString5)) == null) ? 0.0f : d5.floatValue();
                String optString13 = optJSONObject != null ? optJSONObject.optString(DownloadInfo.UID) : null;
                int optInt2 = optJSONObject != null ? optJSONObject.optInt("us") : 0;
                String str5 = str2;
                int optInt3 = optJSONObject != null ? optJSONObject.optInt(str5) : 0;
                if (optString13 == null) {
                    optString13 = "";
                }
                C54130j invoke = lVar2.invoke(optString13);
                if (invoke != null) {
                    invoke.f152018v = optInt2;
                    linkedList2.add(new C59463a(invoke, new C59465f(floatValue5, floatValue6, floatValue7, floatValue8, optInt3, 0, 0, false, optInt2, 96, (C8480h) null)));
                } else {
                    linkedList2.add(new C59463a((C54130j) null, new C59465f(floatValue5, floatValue6, floatValue7, floatValue8, optInt3, 0, 0, true, 0, JsApiNFCStartHCE.CTRL_INDEX, (C8480h) null)));
                }
                i++;
                str2 = str5;
            }
            str = str2;
            linkedList.addAll(linkedList2);
        } else {
            str = str2;
        }
        if ((jSONArray != null ? jSONArray.length() : 0) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("genMicGrabModeDataList glListSize: ");
            sb.append(jSONArray != null ? Integer.valueOf(jSONArray.length()) : null);
            sb.append(' ');
            Log.m105924i("FinderLiveMicRatioUtil", sb.toString());
            LinkedList linkedList3 = new LinkedList();
            int length2 = jSONArray != null ? jSONArray.length() : 0;
            int i2 = 0;
            while (i2 < length2) {
                JSONArray jSONArray2 = jSONArray;
                JSONObject optJSONObject2 = jSONArray != null ? jSONArray2.optJSONObject(i2) : null;
                linkedList3.add(new C59463a((C54130j) null, new C59465f((optJSONObject2 == null || (optString4 = optJSONObject2.optString("x")) == null || (d4 = C66730w.m78730d(optString4)) == null) ? 0.0f : d4.floatValue(), (optJSONObject2 == null || (optString3 = optJSONObject2.optString("y")) == null || (d3 = C66730w.m78730d(optString3)) == null) ? 0.0f : d3.floatValue(), (optJSONObject2 == null || (optString2 = optJSONObject2.optString(str4)) == null || (d2 = C66730w.m78730d(optString2)) == null) ? 0.0f : d2.floatValue(), (optJSONObject2 == null || (optString = optJSONObject2.optString(str3)) == null || (d = C66730w.m78730d(optString)) == null) ? 0.0f : d.floatValue(), optJSONObject2 != null ? optJSONObject2.optInt(str) : 0, 0, 0, true, 0, JsApiNFCStartHCE.CTRL_INDEX, (C8480h) null)));
                i2++;
                jSONArray = jSONArray2;
            }
            linkedList.addAll(linkedList3);
        }
        if (linkedList.size() > 1) {
            C77813z.m93909o(linkedList, new C61483a());
        }
        return linkedList;
    }

    /* renamed from: f */
    public final LinkedList<C32459e> mo86459f(JSONObject jSONObject) {
        String optString;
        Float d;
        String optString2;
        Float d2;
        String optString3;
        Float d3;
        String optString4;
        Float d4;
        LinkedList<C32459e> linkedList = new LinkedList<>();
        JSONArray optJSONArray = jSONObject != null ? jSONObject.optJSONArray("hl") : null;
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray != null ? optJSONArray.optJSONObject(i) : null;
            float f = 0.0f;
            float floatValue = (optJSONObject == null || (optString4 = optJSONObject.optString("x")) == null || (d4 = C66730w.m78730d(optString4)) == null) ? 0.0f : d4.floatValue();
            float floatValue2 = (optJSONObject == null || (optString3 = optJSONObject.optString("y")) == null || (d3 = C66730w.m78730d(optString3)) == null) ? 0.0f : d3.floatValue();
            float floatValue3 = (optJSONObject == null || (optString2 = optJSONObject.optString("w")) == null || (d2 = C66730w.m78730d(optString2)) == null) ? 0.0f : d2.floatValue();
            if (!(optJSONObject == null || (optString = optJSONObject.optString("h")) == null || (d = C66730w.m78730d(optString)) == null)) {
                f = d.floatValue();
            }
            linkedList.add(new C32459e(floatValue, floatValue2, floatValue3, f));
        }
        return linkedList;
    }

    /* renamed from: g */
    public final LinkedList<C59463a> mo86460g(JSONObject jSONObject, C54130j jVar, C32226l<? super String, C54130j> lVar) {
        LinkedList<C59463a> linkedList;
        LinkedList<C59463a> linkedList2;
        int i;
        int i2;
        JSONObject jSONObject2;
        String optString;
        Float d;
        String optString2;
        Float d2;
        String optString3;
        Float d3;
        String optString4;
        Float d4;
        String optString5;
        Float d5;
        String optString6;
        Float d6;
        String optString7;
        Float d7;
        String optString8;
        Float d8;
        JSONObject jSONObject3 = jSONObject;
        C54130j jVar2 = jVar;
        C32226l<? super String, C54130j> lVar2 = lVar;
        C87412m.m108594g(lVar2, "userFilterBlock");
        LinkedList<C59463a> linkedList3 = new LinkedList<>();
        JSONArray optJSONArray = jSONObject3 != null ? jSONObject3.optJSONArray("list") : null;
        if ((optJSONArray != null ? optJSONArray.length() : 0) > 0) {
            float floatValue = (jSONObject3 == null || (optString8 = jSONObject3.optString("x")) == null || (d8 = C66730w.m78730d(optString8)) == null) ? 0.0f : d8.floatValue();
            float floatValue2 = (jSONObject3 == null || (optString7 = jSONObject3.optString("y")) == null || (d7 = C66730w.m78730d(optString7)) == null) ? 0.0f : d7.floatValue();
            float floatValue3 = (jSONObject3 == null || (optString6 = jSONObject3.optString("w")) == null || (d6 = C66730w.m78730d(optString6)) == null) ? 0.0f : d6.floatValue();
            float floatValue4 = (jSONObject3 == null || (optString5 = jSONObject3.optString("h")) == null || (d5 = C66730w.m78730d(optString5)) == null) ? 0.0f : d5.floatValue();
            String str = "f";
            int optInt = jSONObject3 != null ? jSONObject3.optInt(str) : 0;
            int optInt2 = jSONObject3 != null ? jSONObject3.optInt("z") : 0;
            LinkedList linkedList4 = new LinkedList();
            if (optJSONArray != null) {
                linkedList2 = linkedList3;
                i = optJSONArray.length();
            } else {
                linkedList2 = linkedList3;
                i = 0;
            }
            int i3 = 0;
            while (i3 < i) {
                if (optJSONArray != null) {
                    i2 = i;
                    jSONObject2 = optJSONArray.optJSONObject(i3);
                } else {
                    i2 = i;
                    jSONObject2 = null;
                }
                float floatValue5 = (jSONObject2 == null || (optString4 = jSONObject2.optString("x")) == null || (d4 = C66730w.m78730d(optString4)) == null) ? 0.0f : d4.floatValue();
                float floatValue6 = (jSONObject2 == null || (optString3 = jSONObject2.optString("y")) == null || (d3 = C66730w.m78730d(optString3)) == null) ? 0.0f : d3.floatValue();
                float floatValue7 = (jSONObject2 == null || (optString2 = jSONObject2.optString("w")) == null || (d2 = C66730w.m78730d(optString2)) == null) ? 0.0f : d2.floatValue();
                float floatValue8 = (jSONObject2 == null || (optString = jSONObject2.optString("h")) == null || (d = C66730w.m78730d(optString)) == null) ? 0.0f : d.floatValue();
                int optInt3 = jSONObject2 != null ? jSONObject2.optInt(str) : 0;
                int optInt4 = jSONObject2 != null ? jSONObject2.optInt("z") : 0;
                String str2 = str;
                String optString9 = jSONObject2 != null ? jSONObject2.optString(DownloadInfo.UID) : null;
                JSONArray jSONArray = optJSONArray;
                int optInt5 = jSONObject2 != null ? jSONObject2.optInt("us") : 0;
                if (optString9 == null) {
                    optString9 = "";
                }
                C54130j invoke = lVar2.invoke(optString9);
                if (invoke != null) {
                    invoke.f152018v = optInt5;
                    linkedList4.add(new C59463a(invoke, new C59465f(floatValue5, floatValue6, floatValue7, floatValue8, 0, optInt4, optInt3, false, optInt5, 144, (C8480h) null)));
                }
                i3++;
                i = i2;
                str = str2;
                optJSONArray = jSONArray;
            }
            if (linkedList4.size() > 0) {
                linkedList = linkedList2;
                linkedList.add(new C59463a(jVar, new C59465f(floatValue, floatValue2, floatValue3, floatValue4, 0, optInt2, optInt, false, 0, 400, (C8480h) null)));
                linkedList.addAll(linkedList4);
            } else {
                linkedList = linkedList2;
                linkedList.add(new C59463a(jVar, new C59465f(0.0f, 0.0f, 1.0f, 1.0f, 0, 0, 0, false, 0, C83031z.CTRL_INDEX, (C8480h) null)));
            }
        } else {
            linkedList = linkedList3;
            Log.m105924i("FinderLiveMicRatioUtil", "genMicDataList add anchorLinkMicUser default ");
            linkedList.add(new C59463a(jVar2, new C59465f(0.0f, 0.0f, 1.0f, 1.0f, 0, 0, 0, false, 0, C83031z.CTRL_INDEX, (C8480h) null)));
        }
        if (linkedList.size() > 1) {
            C77813z.m93909o(linkedList, new C61484b());
        }
        return linkedList;
    }

    /* renamed from: h */
    public final String mo86461h(LinkedList<C59463a> linkedList) {
        C87412m.m108594g(linkedList, "dataList");
        for (C59463a aVar : linkedList) {
            if (aVar.f169895b.f169903g == 1) {
                return aVar.mo84561a();
            }
        }
        return "";
    }
}
