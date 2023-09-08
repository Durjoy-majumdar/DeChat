package ip2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: ip2.a */
public final class C98778a {

    /* renamed from: a */
    public final Map<String, String> f289592a = new LinkedHashMap();

    /* renamed from: b */
    public final Map<String, C98779b> f289593b = new LinkedHashMap();

    /* renamed from: c */
    public final Map<String, Map<String, JSONObject>> f289594c = new LinkedHashMap();

    /* renamed from: d */
    public String f289595d = "";

    /* renamed from: a */
    public final void mo138154a(String str, String str2, Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("convert", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        C87412m.m108594g(str, "canvasId");
        C87412m.m108594g(str2, "mbNodeValue");
        C87412m.m108594g(map, "values");
        try {
            if (C87412m.m108589b(this.f289595d, str)) {
                Log.m105928w("LandingPageMagic", "the canvas mb info has been parsed");
                SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                return;
            }
            this.f289595d = str;
            if (mo138158e(str2)) {
                mo138159f(map);
            } else {
                Log.m105928w("LandingPageMagic", "the value, return from parse mb node, is false");
            }
            SnsMethodCalculate.markEndTimeMs("convert", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        } catch (Exception e) {
            Log.m105920e("LandingPageMagic", "parse mb node info failed! exception: [" + e.getMessage() + ']');
        }
    }

    /* renamed from: b */
    public final C98779b mo138155b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = jSONObject;
        SnsMethodCalculate.markStartTimeMs("generateMBNodeInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        String optString = jSONObject2.optString("id");
        String optString2 = jSONObject2.optString("linkId");
        String optString3 = jSONObject2.optString("frameSetName");
        int optInt = jSONObject2.optInt("width");
        int optInt2 = jSONObject2.optInt("height");
        int optInt3 = jSONObject2.optInt("fullScreen");
        JSONObject optJSONObject = jSONObject2.optJSONObject("componentItem");
        if (optJSONObject != null) {
            boolean z = false;
            if (!(optString3 == null || C112551y.m153811k(optString3))) {
                if (!(optString == null || C112551y.m153811k(optString))) {
                    if (optString2 == null || C112551y.m153811k(optString2)) {
                        z = true;
                    }
                    if (!z) {
                        C87412m.m108593f(optString3, "frameSetName");
                        C87412m.m108593f(optString, "id");
                        C87412m.m108593f(optString2, "linkId");
                        C98779b bVar = new C98779b(optString3, optString, optString2, optInt, optInt2, optInt3, optJSONObject, str);
                        SnsMethodCalculate.markEndTimeMs("generateMBNodeInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                        return bVar;
                    }
                }
            }
        }
        Log.m105920e("LandingPageMagic", "generateMBNodeInfo::dsl, frameSetName, id or linkId are null or empty!! ");
        SnsMethodCalculate.markEndTimeMs("generateMBNodeInfo", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        return null;
    }

    /* renamed from: c */
    public final boolean mo138156c(C98779b bVar) {
        SnsMethodCalculate.markStartTimeMs("parseAndCheckMBNode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        String a = bVar.mo138160a();
        SnsMethodCalculate.markStartTimeMs("getComponents", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        JSONObject jSONObject = bVar.f289602g;
        SnsMethodCalculate.markEndTimeMs("getComponents", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
        SnsMethodCalculate.markStartTimeMs("parseAndCheckJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean d = mo138157d(jSONObject, linkedHashMap);
        if (d) {
            this.f289594c.put(a, linkedHashMap);
        }
        SnsMethodCalculate.markEndTimeMs("parseAndCheckJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        if (d) {
            Map<String, String> map = this.f289592a;
            SnsMethodCalculate.markStartTimeMs("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            String str = bVar.f289596a;
            SnsMethodCalculate.markEndTimeMs("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
            String put = map.put(str, bVar.mo138160a());
            if (put != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("there is already an id [");
                sb.append(put);
                sb.append("] with frame set name [");
                SnsMethodCalculate.markStartTimeMs("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                String str2 = bVar.f289596a;
                SnsMethodCalculate.markEndTimeMs("getFrameSetName", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo");
                sb.append(str2);
                sb.append("], the new id is [");
                sb.append(bVar.mo138160a());
                sb.append(']');
                Log.m105928w("LandingPageMagic", sb.toString());
            }
            C98779b put2 = this.f289593b.put(bVar.mo138160a(), bVar);
            if (put2 != null) {
                Log.m105928w("LandingPageMagic", "there is already an node [" + put2 + "] with id [" + bVar.mo138160a() + "], the new node is [" + bVar + ']');
            }
        } else {
            Log.m105928w("LandingPageMagic", "the parseAndCheckJSComponentSummary return false");
        }
        SnsMethodCalculate.markEndTimeMs("parseAndCheckMBNode", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        return d;
    }

    /* renamed from: d */
    public final boolean mo138157d(JSONObject jSONObject, Map<String, JSONObject> map) {
        SnsMethodCalculate.markStartTimeMs("parseJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        int optInt = jSONObject.optInt("type");
        int optInt2 = jSONObject.optInt("subType");
        String optString = jSONObject.optString("id");
        boolean z = false;
        if (optInt != 0) {
            boolean z2 = true;
            if (!(optString == null || C112551y.m153811k(optString))) {
                C87412m.m108593f(optString, "id");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", optInt);
                jSONObject2.put("cid", optString);
                if (optInt2 > 0) {
                    jSONObject2.put("subType", optInt2);
                }
                map.put(optString, jSONObject2);
                if (jSONObject.has("layoutItems")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("layoutItems");
                    Object opt = optJSONObject != null ? optJSONObject.opt("componentItem") : null;
                    if (opt instanceof JSONObject) {
                        z = mo138157d((JSONObject) opt, map);
                    } else if (opt instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) opt;
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            Object opt2 = jSONArray.opt(i);
                            if (opt2 instanceof JSONObject) {
                                z2 = mo138157d((JSONObject) opt2, map);
                            } else {
                                Log.m105928w("LandingPageMagic", "the element is not a json object, sure???");
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                        }
                        z = z2;
                    } else {
                        Log.m105928w("LandingPageMagic", "the componentItem is not JSON ???");
                    }
                    SnsMethodCalculate.markEndTimeMs("parseJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                    return z;
                }
                SnsMethodCalculate.markEndTimeMs("parseJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
                return true;
            }
        }
        Log.m105928w("LandingPageMagic", "the type is 0 or id is empty!!");
        SnsMethodCalculate.markEndTimeMs("parseJSComponentSummary", "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0085 A[LOOP:0: B:9:0x003a->B:19:0x0085, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088 A[EDGE_INSN: B:22:0x0088->B:20:0x0088 ?: BREAK  , SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo138158e(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "parseMBNodeInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            org.json.JSONTokener r2 = new org.json.JSONTokener
            r2.<init>(r10)
            java.lang.Object r2 = r2.nextValue()
            boolean r3 = r2 instanceof org.json.JSONObject
            r4 = 1
            java.lang.String r5 = "LandingPageMagic"
            r6 = 0
            if (r3 == 0) goto L_0x002f
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            ip2.b r10 = r9.mo138155b(r2, r10)
            if (r10 == 0) goto L_0x0027
            boolean r10 = r9.mo138156c(r10)
            r4 = r10
            goto L_0x0088
        L_0x0027:
            java.lang.String r10 = "mb node value is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r10)
            r4 = 0
            goto L_0x0088
        L_0x002f:
            boolean r3 = r2 instanceof org.json.JSONArray
            if (r3 == 0) goto L_0x0088
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            int r3 = r2.length()
            r7 = 0
        L_0x003a:
            if (r7 >= r3) goto L_0x0088
            java.lang.Object r4 = r2.get(r7)
            boolean r8 = r4 instanceof org.json.JSONObject
            if (r8 == 0) goto L_0x006c
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            ip2.b r4 = r9.mo138155b(r4, r10)
            if (r4 == 0) goto L_0x0051
            boolean r4 = r9.mo138156c(r4)
            goto L_0x0082
        L_0x0051:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "mb node value is null, the idx is "
            r4.append(r8)
            r4.append(r7)
            r8 = 33
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
            goto L_0x0081
        L_0x006c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "there is an element that is not JSONObject object!! idx is "
            r4.append(r8)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
        L_0x0081:
            r4 = 0
        L_0x0082:
            if (r4 != 0) goto L_0x0085
            goto L_0x0088
        L_0x0085:
            int r7 = r7 + 1
            goto L_0x003a
        L_0x0088:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ip2.C98778a.mo138158e(java.lang.String):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo138159f(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "replaceNormalLinkedNodeWithMBNode"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.magicbrush.landing.AdLandingPageMBInfoHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.util.Map<java.lang.String, ip2.b> r4 = r0.f289593b
            boolean r4 = r4.isEmpty()
            java.lang.String r5 = "LandingPageMagic"
            if (r4 == 0) goto L_0x0020
            java.lang.String r1 = "the magic node is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x0020:
            java.util.Map<java.lang.String, ip2.b> r4 = r0.f289593b
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L_0x002c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0175
            java.lang.Object r6 = r4.next()
            ip2.b r6 = (ip2.C98779b) r6
            r6.getClass()
            java.lang.String r7 = "getLinkId"
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.magicbrush.landing.MBNodeInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            java.lang.String r9 = r6.f289598c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            java.lang.String r7 = "findValueKeyWithId"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            java.util.Set r10 = r17.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0054:
            boolean r11 = r10.hasNext()
            r12 = 0
            java.lang.String r13 = ".id"
            if (r11 == 0) goto L_0x0089
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r14 = r11.getValue()
            boolean r14 = gy3.C87412m.m108589b(r14, r9)
            if (r14 == 0) goto L_0x0086
            java.lang.Object r14 = r11.getKey()
            java.lang.String r14 = (java.lang.String) r14
            r15 = 0
            r0 = 2
            boolean r0 = z04.C112551y.m153808h(r14, r13, r15, r0, r12)
            if (r0 == 0) goto L_0x0086
            java.lang.Object r0 = r11.getKey()
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            goto L_0x008c
        L_0x0086:
            r0 = r16
            goto L_0x0054
        L_0x0089:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
        L_0x008c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "the found key is ["
            r0.append(r7)
            r0.append(r12)
            r7 = 93
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            if (r12 == 0) goto L_0x0171
            java.lang.String r0 = z04.C112550d0.m153797g0(r12, r13, r12)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r9 = ".type"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            boolean r9 = r1.containsKey(r7)
            if (r9 == 0) goto L_0x0171
            java.lang.String r9 = "150"
            r1.put(r7, r9)
            java.lang.String r7 = r6.mo138160a()
            r1.put(r12, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r9 = ".layoutWidth"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "getWidth"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            int r10 = r6.f289599d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            java.lang.String r9 = java.lang.String.valueOf(r10)
            r1.put(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r9 = ".layoutHeight"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "getHeight"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            int r10 = r6.f289600e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            java.lang.String r9 = java.lang.String.valueOf(r10)
            r1.put(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r9 = ".dsl"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "getCompDsl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            java.lang.String r10 = r6.f289603h
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            r1.put(r7, r10)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r9 = ".frameSetName"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r9 = "getFrameSetName"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            java.lang.String r10 = r6.f289596a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            r1.put(r7, r10)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = ".fullScreen"
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r7 = "getFullScreen"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            int r6 = r6.f289601f
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r1.put(r0, r6)
        L_0x0171:
            r0 = r16
            goto L_0x002c
        L_0x0175:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ip2.C98778a.mo138159f(java.util.Map):void");
    }
}
