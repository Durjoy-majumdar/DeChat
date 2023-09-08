package ps2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import co2.C92435h;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.C95250a;
import com.tencent.p014mm.plugin.sns.storage.AdSnsInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import j20.C117292a;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import p749xh.C102646h;
import qs2.C101255a0;
import qs2.C101256b;
import qs2.C101262e;
import qs2.C101263e0;
import qs2.C101266g;
import qs2.C101278l0;
import qs2.C101286q0;
import qs2.C101287r;
import qs2.C101288r0;
import qs2.C101290s;
import so2.C101665a;
import so2.C101675j;
import so2.C101676k;
import te3.C101804kv2;
import vr2.C102236a0;
import wr2.C91098a;

/* renamed from: ps2.u */
public class C100894u {

    /* renamed from: a */
    public static Set<C100896b> f295460a;

    /* renamed from: ps2.u$b */
    public static class C100896b {

        /* renamed from: a */
        public int f295470a;

        /* renamed from: b */
        public int f295471b;

        /* renamed from: c */
        public int f295472c;

        /* renamed from: a */
        public static /* synthetic */ int m132249a(C100896b bVar, int i) {
            SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            bVar.f295470a = i;
            SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            return i;
        }

        /* renamed from: b */
        public static /* synthetic */ int m132250b(C100896b bVar, int i) {
            SnsMethodCalculate.markStartTimeMs("access$402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            bVar.f295471b = i;
            SnsMethodCalculate.markEndTimeMs("access$402", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            return i;
        }

        /* renamed from: c */
        public static /* synthetic */ int m132251c(C100896b bVar, int i) {
            SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            bVar.f295472c = i;
            SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            return i;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            boolean z = false;
            if (obj instanceof C100896b) {
                C100896b bVar = (C100896b) obj;
                if (bVar.f295470a == this.f295470a && bVar.f295471b == this.f295471b && bVar.f295472c == this.f295472c) {
                    z = true;
                }
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
                return z;
            }
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            return false;
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            int i = this.f295470a + this.f295471b + this.f295472c;
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            return i;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            String str = "[nodeType=" + this.f295470a + ",compType=" + this.f295471b + ",subCompType=" + this.f295472c + "]";
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$TypeTriple");
            return str;
        }
    }

    /* renamed from: A */
    public static C101288r0 m132220A(Map<String, String> map, String str, int i, int i2, int i3) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("parseRadarChart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        C101288r0 r0Var = new C101288r0();
        try {
            String str3 = str + ".radarChart";
            r0Var.f296723z = map.get(str3 + ".borderImg");
            r0Var.f296721G = map.get(str3 + ".maskImg");
            r0Var.f296716B = map.get(str3 + ".coverColor");
            r0Var.f296717C = Color.parseColor(map.get(str3 + ".labelFont.$color"));
            r0Var.f296718D = (int) m132234n(Util.safeParseDouble(map.get(str3 + ".labelFont.$size")), i, i2, i3);
            r0Var.f296719E = Color.parseColor(map.get(str3 + ".scoreFont.$color"));
            r0Var.f296720F = (int) m132234n(Util.safeParseDouble(map.get(str3 + ".scoreFont.$size")), i, i2, i3);
            r0Var.f296715A = m132234n(Util.safeParseDouble(map.get(str3 + ".borderImgWidth")), i, i2, i3);
            String str4 = str3 + ".itemList.item";
            int i4 = 0;
            while (true) {
                if (i4 != 0) {
                    str2 = str4 + i4;
                } else {
                    str2 = str4;
                }
                C101288r0.C101289a aVar = new C101288r0.C101289a();
                aVar.f296724a = map.get(str2 + ".label");
                aVar.f296725b = map.get(str2 + ".score");
                aVar.f296726c = (float) Util.safeParseDouble(map.get(str2 + ".value"));
                if (TextUtils.isEmpty(aVar.f296724a) && TextUtils.isEmpty(aVar.f296725b)) {
                    break;
                }
                ((ArrayList) r0Var.f296722H).add(aVar);
                i4++;
            }
        } catch (Exception e) {
            Log.m105920e("AdLandingPagesParseHelper", Util.stackTraceToString(e));
        }
        SnsMethodCalculate.markEndTimeMs("parseRadarChart", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return r0Var;
    }

    /* renamed from: a */
    public static String m132221a(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        String str = null;
        if (snsInfo == null) {
            Log.m105920e("AdLandingPagesParseHelper", "the snsinfo is null");
            SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        } else if (!snsInfo.isAd()) {
            Log.m105920e("AdLandingPagesParseHelper", "the snsinfo is not a ad");
            SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return null;
        } else {
            AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
            if (adSnsInfo == null) {
                Log.m105920e("AdLandingPagesParseHelper", "the adSnsInfo is null");
                SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return null;
            }
            ADXml adXml = snsInfo.getAdXml();
            if (adXml == null) {
                Log.m105920e("AdLandingPagesParseHelper", "the adxml is null");
                SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return null;
            }
            ADInfo adInfo = snsInfo.getAdInfo();
            if (adInfo == null) {
                Log.m105920e("AdLandingPagesParseHelper", "the adInfo is null");
                SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return null;
            } else if (!adXml.isLandingPagesAd()) {
                Log.m105920e("AdLandingPagesParseHelper", "the snsinfo is not a landingpage");
                SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return null;
            } else {
                HashMap<String, String> hashMap = adInfo.mappedCanvasCardExt;
                if (hashMap == null || hashMap.size() == 0) {
                    Log.m105920e("AdLandingPagesParseHelper", "the mappedCanvasCardExt is empty");
                    SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    return null;
                }
                String str2 = adSnsInfo.field_adxml;
                HashMap<String, String> hashMap2 = adInfo.mappedCanvasCardExt;
                SnsMethodCalculate.markStartTimeMs("ControlLandingPagesLinkedSnsInfoImpl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                if (str2 == null || str2.length() == 0) {
                    Log.m105920e("AdLandingPagesParseHelper", "the adLandingPagesXml is empty");
                    SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfoImpl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                } else if (hashMap2 == null || hashMap2.size() == 0) {
                    Log.m105920e("AdLandingPagesParseHelper", "the mappedCanvasCardExt is empty");
                    SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfoImpl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                } else {
                    LinkedList<C100882l> linkedList = new C100895a(str2, C102646h.COL_ADXML).f295461a;
                    for (String next : hashMap2.keySet()) {
                        if (!Util.isNullOrNil(next)) {
                            String str3 = hashMap2.get(next);
                            if (!Util.isNullOrNil(str3)) {
                                Iterator<C100882l> it = linkedList.iterator();
                                String str4 = null;
                                while (it.hasNext()) {
                                    Iterator<C101255a0> it4 = it.next().f295429d.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            break;
                                        }
                                        C101255a0 next2 = it4.next();
                                        if (next2 instanceof C101266g) {
                                            C101266g gVar = (C101266g) next2;
                                            if (!Util.isNullOrNil(gVar.f296594Z) && gVar.f296594Z.equals(next)) {
                                                str4 = gVar.f296595a0;
                                                continue;
                                                break;
                                            }
                                        }
                                    }
                                    if (str4 != null) {
                                        break;
                                    }
                                }
                                if (!Util.isNullOrNil(str4)) {
                                    Log.m105924i("AdLandingPagesParseHelper", "old card ext is " + str4 + " and new card ext is " + str3);
                                    str2 = str2.replace(str4, str3);
                                    try {
                                        str2 = str2.replace(Util.escapeStringForXml(str4), Util.escapeStringForXml(str3));
                                    } catch (Exception unused) {
                                        Log.m105920e("AdLandingPagesParseHelper", "the xml is error");
                                    }
                                }
                            }
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfoImpl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                    str = str2;
                }
                SnsMethodCalculate.markEndTimeMs("ControlLandingPagesLinkedSnsInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return str;
            }
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C101255a0 m132222b(Map map, int i, int i2, int i3, int i4, String str) {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        C101255a0 g = m132227g(map, i, i2, i3, i4, str);
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return g;
    }

    /* renamed from: c */
    public static String m132223c(String str, String... strArr) {
        SnsMethodCalculate.markStartTimeMs("appendParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (str == null) {
            str = "";
        }
        String str2 = "&";
        String join = TextUtils.join(str2, strArr);
        if (!str.contains("?")) {
            str2 = "?";
        }
        if (str.contains("#")) {
            try {
                int indexOf = str.indexOf("#");
                String str3 = str.substring(0, indexOf) + str2 + join + str.substring(indexOf + 1);
                SnsMethodCalculate.markEndTimeMs("appendParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return str3;
            } catch (Exception e) {
                Log.m105921e("AdLandingPagesParseHelper", "append url params failed, %s", e.toString());
                SnsMethodCalculate.markEndTimeMs("appendParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return str;
            }
        } else {
            String str4 = str + str2 + join;
            SnsMethodCalculate.markEndTimeMs("appendParams", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return str4;
        }
    }

    /* renamed from: d */
    public static String m132224d(String str, String... strArr) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (strArr == null) {
            SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return str;
        }
        URI uri = new URI(str);
        StringBuilder sb = new StringBuilder();
        for (String append : strArr) {
            sb.append(append);
            sb.append("&");
        }
        if (sb.length() > 1) {
            StringBuilder deleteCharAt = sb.deleteCharAt(sb.length() - 1);
            String query = uri.getQuery();
            if (query == null) {
                str2 = deleteCharAt.toString();
            } else {
                str2 = query + "&" + deleteCharAt.toString();
            }
            String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), str2, uri.getFragment()).toString();
            SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return uri2;
        }
        SnsMethodCalculate.markEndTimeMs("appendUri", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return str;
    }

    /* renamed from: e */
    public static void m132225e(List<C95295z> list) {
        SnsMethodCalculate.markStartTimeMs("findAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (list == null || list.isEmpty()) {
            SnsMethodCalculate.markEndTimeMs("findAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C95295z next : list) {
            if (m132237q(next.mo131850h().f296505k)) {
                arrayList.addAll(((C95250a) next).mo130196E());
            }
        }
        if (!arrayList.isEmpty()) {
            m132225e(arrayList);
            list.addAll(arrayList);
        }
        SnsMethodCalculate.markEndTimeMs("findAllComponents", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
    }

    /* renamed from: f */
    public static C101290s m132226f(Map<String, String> map, String str, int i, int i2, int i3, int i4) {
        String str2;
        Map<String, String> map2 = map;
        String str3 = str;
        SnsMethodCalculate.markStartTimeMs("getAdLandingPageCompentGroup", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        C101290s sVar = new C101290s();
        try {
            sVar.f296727A = (Color.parseColor(map.get(str + ".bgColorTheme")) & 16777215) | (((int) (Util.getDouble(map.get(str + ".bgColorAlpha"), 0.0d) * 255.0d)) << 24);
        } catch (Exception e) {
            Log.m105921e("AdLandingPagesParseHelper", "%s", Util.stackTraceToString(e));
            sVar.f296727A = Color.argb(51, 0, 0, 0);
        }
        String str4 = (str + ".componentGroupList") + ".componentItem";
        int i5 = 0;
        while (true) {
            if (i5 == 0) {
                str2 = str4;
            } else {
                str2 = str4 + i5;
            }
            C101255a0 g = m132227g(map, i, i2, i3, i4, str2);
            if (g == null) {
                SnsMethodCalculate.markEndTimeMs("getAdLandingPageCompentGroup", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return sVar;
            }
            if (g.f296511q) {
                sVar.f296728z.add(g);
            }
            i5++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: so2.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static qs2.C101255a0 m132227g(java.util.Map<java.lang.String, java.lang.String> r21, int r22, int r23, int r24, int r25, java.lang.String r26) {
        /*
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r26
            java.lang.String r12 = "getAdLandingPageComponetInfo"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r1 = ".type"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            java.lang.String r1 = "isBackGroundVoiceComponentType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r13)
            r15 = 0
            r2 = 147(0x93, float:2.06E-43)
            if (r0 != r2) goto L_0x003c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r1 = 1
            goto L_0x0040
        L_0x003c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r1 = 0
        L_0x0040:
            java.lang.String r6 = ""
            r16 = 0
            if (r1 == 0) goto L_0x009f
            java.lang.String r0 = "getAdLandingPageBackgroundVoiceCompInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r13)
            so2.a r14 = new so2.a
            r14.<init>()
            r1 = r14
            r2 = r21
            r3 = r26
            r4 = r22
            r5 = r23
            r8 = r6
            r6 = r24
            m132246z(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".voiceUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r8)
            r14.f297593z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".autoPlayType"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r15)
            r14.f297592A = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)
        L_0x009c:
            r1 = r12
            goto L_0x0658
        L_0x009f:
            boolean r1 = m132237q(r0)
            if (r1 != 0) goto L_0x00c7
            r1 = r21
            r2 = r26
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            qs2.a0 r0 = m132229i(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00b7 }
        L_0x00b5:
            r14 = r0
            goto L_0x009c
        L_0x00b7:
            r6 = 0
            r1 = r21
            r2 = r26
            r3 = r22
            r4 = r23
            r5 = r24
            qs2.a0 r0 = m132229i(r1, r2, r3, r4, r5, r6)
            goto L_0x00b5
        L_0x00c7:
            java.lang.String r1 = "isCompentGroupListType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r13)
            r2 = 101(0x65, float:1.42E-43)
            if (r0 != r2) goto L_0x00d6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r1 = 1
            goto L_0x00da
        L_0x00d6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r1 = 0
        L_0x00da:
            java.lang.String r5 = ".componentItem"
            if (r1 == 0) goto L_0x01f1
            java.lang.String r0 = "getAdLandingPageCompentGroupList"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r13)
            qs2.m0 r6 = new qs2.m0
            r6.<init>()
            r1 = r6
            r2 = r21
            r3 = r26
            r4 = r22
            r15 = r5
            r5 = r23
            r14 = r6
            r6 = r24
            m132246z(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".pageCtrType"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r14.f296661A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".isFullScreen"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r2 = 1
            if (r1 != r2) goto L_0x0135
            r2 = 1
            goto L_0x0136
        L_0x0135:
            r2 = 0
        L_0x0136:
            r14.f296662B = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".autoCarousel"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r2 = 1
            if (r1 != r2) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            r14.f296663C = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".componentGroupList.componentGroup"
            r1.append(r2)
            java.lang.String r11 = r1.toString()
            r6 = 0
        L_0x016c:
            if (r6 != 0) goto L_0x0170
            r1 = r11
            goto L_0x017f
        L_0x0170:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
        L_0x017f:
            qs2.s r5 = new qs2.s
            r5.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r15)
            java.lang.String r4 = r2.toString()
            r3 = 0
        L_0x0194:
            if (r3 != 0) goto L_0x0199
            r16 = r4
            goto L_0x01aa
        L_0x0199:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r16 = r1
        L_0x01aa:
            r1 = r21
            r2 = r22
            r17 = r3
            r3 = r23
            r18 = r4
            r4 = r24
            r19 = r12
            r12 = r5
            r5 = r25
            r20 = r6
            r6 = r16
            qs2.a0 r1 = m132227g(r1, r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x01de
            java.util.LinkedList<qs2.a0> r1 = r12.f296728z
            int r1 = r1.size()
            if (r1 != 0) goto L_0x01d4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)
            r16 = r14
            goto L_0x0654
        L_0x01d4:
            java.util.LinkedList<qs2.s> r1 = r14.f296664z
            r1.add(r12)
            int r6 = r20 + 1
            r12 = r19
            goto L_0x016c
        L_0x01de:
            boolean r2 = r1.f296511q
            if (r2 == 0) goto L_0x01e7
            java.util.LinkedList<qs2.a0> r2 = r12.f296728z
            r2.add(r1)
        L_0x01e7:
            int r3 = r17 + 1
            r5 = r12
            r4 = r18
            r12 = r19
            r6 = r20
            goto L_0x0194
        L_0x01f1:
            r15 = r5
            r19 = r12
            r2 = 1
            java.lang.String r1 = "isComponentLinearLayoutType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r13)
            r3 = 103(0x67, float:1.44E-43)
            if (r0 != r3) goto L_0x0204
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r1 = 1
            goto L_0x0208
        L_0x0204:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r1 = 0
        L_0x0208:
            java.lang.String r12 = ".layoutItems.componentItem"
            if (r1 == 0) goto L_0x028e
            java.lang.String r14 = "getAdLandingPageLinearLayoutComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r13)
            qs2.b0 r0 = new qs2.b0
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".subType"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296548A = r1
            qs2.s0 r1 = qs2.C101291s0.m132870b(r7, r11, r8, r9, r10)
            r0.f296549B = r1
            r1 = r0
            r2 = r21
            r3 = r26
            r4 = r22
            r5 = r23
            r6 = r24
            m132246z(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = r1.toString()
            r15 = 0
        L_0x0257:
            if (r15 != 0) goto L_0x025b
            r6 = r11
            goto L_0x026b
        L_0x025b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            r6 = r1
        L_0x026b:
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            qs2.a0 r1 = m132227g(r1, r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0282
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r13)
        L_0x027e:
            r16 = r0
            goto L_0x0654
        L_0x0282:
            boolean r2 = r1.f296511q
            if (r2 == 0) goto L_0x028b
            java.util.LinkedList<qs2.a0> r2 = r0.f296550z
            r2.add(r1)
        L_0x028b:
            int r15 = r15 + 1
            goto L_0x0257
        L_0x028e:
            java.lang.String r1 = "isComponentFrameLayoutType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r13)
            r3 = 104(0x68, float:1.46E-43)
            if (r0 != r3) goto L_0x029d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r1 = 1
            goto L_0x02a1
        L_0x029d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            r1 = 0
        L_0x02a1:
            java.lang.String r14 = ".cornerRadius"
            if (r1 == 0) goto L_0x02fc
            java.lang.String r0 = "getAdLandingPageFrameLayoutComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r13)
            r1 = r21
            r2 = r26
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            java.util.List r1 = m132228h(r1, r2, r3, r4, r5, r6)
            qs2.z r12 = new qs2.z
            r12.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            double r2 = (double) r2
            float r2 = m132234n(r2, r8, r9, r10)
            r12.f296777B = r2
            r12.f296778z = r1
            qs2.s0 r1 = qs2.C101291s0.m132870b(r7, r11, r8, r9, r10)
            r12.f296776A = r1
            r1 = r12
            r2 = r21
            r3 = r26
            r4 = r22
            r5 = r23
            r6 = r24
            m132246z(r1, r2, r3, r4, r5, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)
            r16 = r12
            goto L_0x0654
        L_0x02fc:
            boolean r1 = m132236p(r0)
            if (r1 == 0) goto L_0x0409
            java.lang.String r0 = "getAdLandingPageFloatLayoutComponent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r13)
            r1 = r21
            r2 = r26
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            java.util.List r1 = m132228h(r1, r2, r3, r4, r5, r6)
            qs2.y r15 = new qs2.y
            r15.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            double r2 = (double) r2
            float r2 = m132234n(r2, r8, r9, r10)
            r15.f296770A = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r3 = ".autoShow"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            r15.f296771B = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r3 = ".noAnimation"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            r15.f296772C = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r3 = ".forbiddenToClose"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            r15.f296773D = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r3 = ".noBackground"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            r15.f296774E = r2
            r15.f296775z = r1
            r1 = r15
            r2 = r21
            r3 = r26
            r4 = r22
            r5 = r23
            r6 = r24
            m132246z(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r12)
            java.lang.String r14 = r1.toString()
            r11 = 0
        L_0x03d0:
            if (r11 != 0) goto L_0x03d4
            r6 = r14
            goto L_0x03e4
        L_0x03d4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r6 = r1
        L_0x03e4:
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            qs2.a0 r1 = m132227g(r1, r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x03fb
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)
        L_0x03f7:
            r16 = r15
            goto L_0x0654
        L_0x03fb:
            boolean r2 = r1.f296511q
            if (r2 == 0) goto L_0x0406
            java.util.List<qs2.a0> r2 = r15.f296775z
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.add(r1)
        L_0x0406:
            int r11 = r11 + 1
            goto L_0x03d0
        L_0x0409:
            boolean r1 = m132235o(r0)
            java.lang.String r14 = ".imageUrl"
            if (r1 == 0) goto L_0x0527
            java.lang.String r12 = "getAdLandingPageEggCompInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r1 = r21
            r2 = r26
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            java.util.List r0 = m132228h(r1, r2, r3, r4, r5, r6)
            so2.d r15 = new so2.d
            r15.<init>()
            r15.f297604z = r0
            co2.h$e r0 = co2.C92435h.C92441e.m116270a(r7, r11)
            r15.f297601A = r0
            co2.h$a r0 = co2.C92435h.C92436a.m116269a(r7, r11)
            r15.f297602B = r0
            java.lang.String r1 = "parseFromXml"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingEggCardContainerInfo$RandomEncoreInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f2 }
            r0.<init>()     // Catch:{ all -> 0x04f2 }
            r0.append(r11)     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = ".randomEncoreInfo"
            r0.append(r3)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04f2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f2 }
            r3.<init>()     // Catch:{ all -> 0x04f2 }
            r3.append(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = ".encoreType"
            r3.append(r4)     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x04f2 }
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04f2 }
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)     // Catch:{ all -> 0x04f2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f2 }
            r4.<init>()     // Catch:{ all -> 0x04f2 }
            r4.append(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r5 = ".title"
            r4.append(r5)     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x04f2 }
            java.lang.Object r4 = r7.get(r4)     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)     // Catch:{ all -> 0x04f2 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f2 }
            r5.<init>()     // Catch:{ all -> 0x04f2 }
            r5.append(r0)     // Catch:{ all -> 0x04f2 }
            r5.append(r14)     // Catch:{ all -> 0x04f2 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x04f2 }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x04f2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x04f2 }
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)     // Catch:{ all -> 0x04f2 }
            if (r3 <= 0) goto L_0x050d
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x04f2 }
            if (r6 != 0) goto L_0x050d
            so2.d$a r6 = new so2.d$a     // Catch:{ all -> 0x04f2 }
            r6.<init>()     // Catch:{ all -> 0x04f2 }
            r6.f297605a = r3     // Catch:{ all -> 0x04f2 }
            r6.f297606b = r4     // Catch:{ all -> 0x04f2 }
            r6.f297607c = r5     // Catch:{ all -> 0x04f2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f2 }
            r3.<init>()     // Catch:{ all -> 0x04f2 }
            r3.append(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = ".triggerGForceMin"
            r3.append(r4)     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x04f2 }
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x04f2 }
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)     // Catch:{ all -> 0x04f2 }
            r6.f297608d = r3     // Catch:{ all -> 0x04f2 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f2 }
            r3.<init>()     // Catch:{ all -> 0x04f2 }
            r3.append(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = ".triggerGForceMax"
            r3.append(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x04f2 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x04f2 }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)     // Catch:{ all -> 0x04f2 }
            r6.f297609e = r0     // Catch:{ all -> 0x04f2 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            goto L_0x0512
        L_0x04f2:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "RandomEncoreInfo parseFromXml, exp="
            r3.append(r4)
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "MicroMsg.AdLandingPageComponentInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x050d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            r6 = r16
        L_0x0512:
            r15.f297603C = r6
            r1 = r15
            r2 = r21
            r3 = r26
            r4 = r22
            r5 = r23
            r6 = r24
            m132246z(r1, r2, r3, r4, r5, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            goto L_0x03f7
        L_0x0527:
            java.lang.String r1 = "isFloatLinearBtnsType"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r13)
            r3 = 145(0x91, float:2.03E-43)
            if (r0 != r3) goto L_0x0532
            goto L_0x0533
        L_0x0532:
            r2 = 0
        L_0x0533:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            if (r2 == 0) goto L_0x0638
            java.lang.String r0 = "getAdLandingPageFloatLinearBtnsCompInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r13)
            so2.k r5 = new so2.k
            r5.<init>()
            r1 = r5
            r2 = r21
            r3 = r26
            r4 = r22
            r16 = r0
            r0 = r5
            r5 = r23
            r17 = r14
            r14 = r6
            r6 = r24
            m132246z(r1, r2, r3, r4, r5, r6)
            qs2.s0 r1 = qs2.C101291s0.m132870b(r7, r11, r8, r9, r10)
            r0.f297631z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = ".textColor"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r14)
            r0.f297629A = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f297630B = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r12)
            java.lang.String r11 = r1.toString()
            r12 = 0
        L_0x0590:
            if (r12 != 0) goto L_0x0594
            r6 = r11
            goto L_0x05a4
        L_0x0594:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r6 = r1
        L_0x05a4:
            boolean r1 = r7.containsKey(r6)
            if (r1 == 0) goto L_0x0631
            java.lang.String r5 = "getAdLandingPageFloatBtnsItemCompInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r13)
            so2.i r4 = new so2.i
            r4.<init>()
            r1 = r4
            r2 = r21
            r3 = r6
            r8 = r4
            r4 = r22
            r9 = r5
            r5 = r23
            r10 = r6
            r6 = r24
            m132246z(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r1.append(r15)
            java.lang.String r6 = r1.toString()
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            qs2.a0 r1 = m132227g(r1, r2, r3, r4, r5, r6)
            r8.f297624z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            r2 = r17
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r14)
            r8.f297622A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r3 = ".wording"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r14)
            r8.f297623B = r1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r13)
            java.util.List<so2.i> r1 = r0.f297630B
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r8)
            int r12 = r12 + 1
            r8 = r22
            r9 = r23
            r10 = r24
            goto L_0x0590
        L_0x0631:
            r1 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            goto L_0x027e
        L_0x0638:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "the type"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " is not client known type"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "AdLandingPagesParseHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
        L_0x0654:
            r14 = r16
            r1 = r19
        L_0x0658:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.C100894u.m132227g(java.util.Map, int, int, int, int, java.lang.String):qs2.a0");
    }

    /* renamed from: h */
    public static List<C101255a0> m132228h(Map<String, String> map, String str, int i, int i2, int i3, int i4) {
        String str2;
        SnsMethodCalculate.markStartTimeMs("getAdLandingPageLayoutItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String str3 = str;
        sb.append(str);
        sb.append(".layoutItems.componentItem");
        String sb4 = sb.toString();
        int i5 = 0;
        while (true) {
            if (i5 == 0) {
                str2 = sb4;
            } else {
                str2 = sb4 + i5;
            }
            C101255a0 g = m132227g(map, i, i2, i3, i4, str2);
            if (g == null) {
                SnsMethodCalculate.markEndTimeMs("getAdLandingPageLayoutItems", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return arrayList;
            }
            if (g.f296511q) {
                arrayList.add(g);
            } else {
                Log.m105924i("AdLandingPagesParseHelper", "comp " + g.toString() + " ifCondition is false");
            }
            i5++;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.Map<java.lang.String, java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: qs2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: qs2.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: qs2.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v138, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v18, resolved type: qs2.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: qs2.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: qs2.p0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v209, resolved type: qs2.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v210, resolved type: qs2.q0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v218, resolved type: qs2.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: qs2.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v220, resolved type: qs2.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: qs2.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v221, resolved type: qs2.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: qs2.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v223, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v72, resolved type: qs2.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v224, resolved type: qs2.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v74, resolved type: qs2.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v225, resolved type: qs2.r0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v75, resolved type: qs2.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: qs2.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v384, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v385, resolved type: qs2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v492, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v493, resolved type: qs2.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v494, resolved type: qs2.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v495, resolved type: qs2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v498, resolved type: so2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v499, resolved type: so2.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v500, resolved type: so2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v501, resolved type: so2.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v502, resolved type: ts2.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v503, resolved type: qs2.o0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v504, resolved type: qs2.j0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v505, resolved type: so2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v506, resolved type: so2.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v507, resolved type: so2.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v508, resolved type: so2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v509, resolved type: qs2.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v510, resolved type: qs2.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v511, resolved type: qs2.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v512, resolved type: qs2.c0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v513, resolved type: qs2.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v514, resolved type: qs2.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v515, resolved type: qs2.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v516, resolved type: qs2.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v517, resolved type: qs2.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v518, resolved type: qs2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v519, resolved type: qs2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v520, resolved type: qs2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v521, resolved type: qs2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v522, resolved type: qs2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v523, resolved type: qs2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v524, resolved type: qs2.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v525, resolved type: qs2.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v526, resolved type: qs2.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v527, resolved type: so2.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v528, resolved type: so2.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v529, resolved type: qs2.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v86, resolved type: qs2.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v87, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v88, resolved type: qs2.h0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v530, resolved type: qs2.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v531, resolved type: qs2.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v532, resolved type: qs2.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v533, resolved type: qs2.n0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: qs2.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: qs2.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v534, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v535, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v536, resolved type: qs2.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v538, resolved type: qs2.g0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: qs2.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v540, resolved type: so2.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v541, resolved type: so2.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v542, resolved type: so2.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v543, resolved type: so2.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v544, resolved type: so2.o} */
    /* JADX WARNING: type inference failed for: r2v71 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0641, code lost:
        r6 = new qs2.C101263e0();
        r6.f296573z = com.tencent.p014mm.sdk.platformtools.Util.nullAs(r7.get(r8 + ".backgroundImg"), "");
        r6.f296563B = com.tencent.p014mm.sdk.platformtools.Util.nullAs(r7.get(r8 + ".iconUrl"), "");
        r6.f296564C = com.tencent.p014mm.sdk.platformtools.Util.nullAs(r7.get(r8 + ".title"), "");
        r6.f296565D = com.tencent.p014mm.sdk.platformtools.Util.nullAs(r7.get(r8 + ".desc"), "");
        r6.f296571J = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7.get(r8 + ".onlyShowInTimelineAd"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x06f2, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r7.get(r8 + ".isFullClickable")) != 1) goto L_0x06f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x06f4, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x06f6, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x06f7, code lost:
        r6.f296568G = r0;
        r6.f296569H = (int) m132234n(com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r7.get(r8 + ".appearPaddingTop")), r9, r10, r11);
        r6.f296570I = (int) m132234n(com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r7.get(r8 + ".appearPaddingBottom")), r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r1 = r8 + ".backgroundColorAlpha";
        r6.f296562A = com.tencent.p014mm.sdk.platformtools.Util.nullAs(r7.get(r8 + ".backgroundColor"), "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x076f, code lost:
        if (r7.containsKey(r1) == false) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0777, code lost:
        if (r6.f296562A.length() <= 0) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0779, code lost:
        r2 = new java.lang.Object[2];
        r2[r13] = java.lang.Integer.valueOf((int) (com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r7.get(r1)) * 255.0d));
        r2[1] = r6.f296562A.substring(1);
        r6.f296562A = java.lang.String.format("#%02x%s", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x079e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x079f, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("AdLandingPagesParseHelper", "AdLandingPageComponetFloatBarInfo parse backgroundColor exp=" + r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0920, code lost:
        r12 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0931, code lost:
        r13 = r9;
        r14 = r10;
        r10 = r15;
        r9 = r32;
        r12 = r36;
        r15 = r11;
        r11 = r29;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014e, code lost:
        r36 = r15;
        r15 = r14;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x039e, code lost:
        r36 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x03ad, code lost:
        r36 = r6;
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x08d1  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x1fa1  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x1fa3  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x1fc4  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x1fc6  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x1fe0  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x216f  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static qs2.C101255a0 m132229i(java.util.Map<java.lang.String, java.lang.String> r43, java.lang.String r44, int r45, int r46, int r47, int r48) {
        /*
            r7 = r43
            r8 = r44
            r9 = r45
            r10 = r46
            r11 = r47
            java.lang.String r12 = "getBaseComponetInfo"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".type"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".subType"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r15 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r5 = 1
            java.lang.String r2 = ".fontSize"
            java.lang.String r3 = ".fontColor"
            java.lang.String r4 = ""
            if (r14 == r5) goto L_0x2003
            java.lang.String r0 = ".qrExtInfo"
            java.lang.String r5 = ".location.$poiname"
            java.lang.String r6 = ".location.$label"
            java.lang.String r1 = ".location.$scale"
            r18 = r0
            java.lang.String r0 = ".location.$y"
            r19 = r5
            java.lang.String r5 = ".location.$x"
            r20 = r6
            java.lang.String r6 = ".needUpdateQrUrl"
            r21 = r6
            java.lang.String r6 = ".cornerRadius"
            r22 = r6
            java.lang.String r6 = ".jumpCanvasNoStore"
            r23 = r6
            java.lang.String r6 = ".jumpCanvasExt"
            r24 = r6
            java.lang.String r6 = ".jumpCanvasId"
            r25 = r6
            r6 = 21
            if (r14 == r6) goto L_0x1250
            java.lang.String r6 = ".imageHeight"
            r26 = r1
            java.lang.String r1 = ".imageWidth"
            r27 = r0
            java.lang.String r0 = ".bgColor"
            r28 = r5
            java.lang.String r5 = ".bgColorAlpha"
            r29 = r12
            java.lang.String r12 = "#%02x%s"
            r30 = 4643176031446892544(0x406fe00000000000, double:255.0)
            r32 = r13
            r13 = 41
            r33 = r3
            java.lang.String r3 = ".enableQRScan"
            if (r14 == r13) goto L_0x10a5
            r13 = 102(0x66, float:1.43E-43)
            if (r14 == r13) goto L_0x108d
            r13 = 138(0x8a, float:1.93E-43)
            if (r14 == r13) goto L_0x1080
            r13 = 146(0x92, float:2.05E-43)
            if (r14 == r13) goto L_0x1073
            r13 = 44
            if (r14 == r13) goto L_0x1006
            r13 = 45
            if (r14 == r13) goto L_0x0f94
            java.lang.String r13 = ".floatStartTime"
            java.lang.String r3 = ".floatComponentId"
            r16 = r3
            r3 = 61
            r21 = r13
            java.lang.String r13 = ".floatBarComponentItem"
            r22 = r13
            if (r14 == r3) goto L_0x0d19
            r3 = 62
            if (r14 == r3) goto L_0x0ba4
            r3 = 81
            if (r14 == r3) goto L_0x0b68
            r3 = 82
            if (r14 == r3) goto L_0x0ad1
            r3 = 121(0x79, float:1.7E-43)
            if (r14 == r3) goto L_0x093e
            r3 = 122(0x7a, float:1.71E-43)
            if (r14 == r3) goto L_0x093e
            java.lang.String r3 = "AdLandingPagesParseHelper"
            switch(r14) {
                case 131: goto L_0x02f6;
                case 132: goto L_0x02e5;
                case 133: goto L_0x015c;
                case 134: goto L_0x0155;
                case 135: goto L_0x00f2;
                case 136: goto L_0x00ed;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            r6 = r15
            r15 = r14
            switch(r15) {
                case 140: goto L_0x08dd;
                case 141: goto L_0x063c;
                case 142: goto L_0x03b3;
                case 143: goto L_0x03a9;
                case 144: goto L_0x03a4;
                default: goto L_0x00dd;
            }
        L_0x00dd:
            r36 = r6
            r13 = 0
            r14 = 1
            switch(r15) {
                case 148: goto L_0x092d;
                case 149: goto L_0x0928;
                case 150: goto L_0x0923;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            r6 = r29
            r12 = r32
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r12)
            goto L_0x16c2
        L_0x00ed:
            qs2.e r0 = m132233m(r43, r44, r45, r46, r47, r48)
            goto L_0x014e
        L_0x00f2:
            qs2.q r0 = new qs2.q
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".swipeText"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296681A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".swipeActionType"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296682B = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".jumpUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296683z = r1
        L_0x014e:
            r36 = r15
            r13 = 0
            r15 = r14
            r14 = 1
            goto L_0x0920
        L_0x0155:
            r36 = r15
            r13 = 0
            r15 = r14
        L_0x0159:
            r14 = 1
            goto L_0x0641
        L_0x015c:
            qs2.v r2 = new qs2.v
            r2.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r34 = r15
            java.lang.String r15 = ".sphereThumbUrl"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r13, (java.lang.String) r4)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            java.lang.String r15 = ".displayType"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            java.lang.String r15 = ".gestureDelayTime"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r13)
            r2.f296753z = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            java.lang.String r15 = ".sphereImageUrl"
            r13.append(r15)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r13, (java.lang.String) r4)
            r2.f296751A = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024e }
            r13.<init>()     // Catch:{ Exception -> 0x024e }
            r13.append(r8)     // Catch:{ Exception -> 0x024e }
            r13.append(r0)     // Catch:{ Exception -> 0x024e }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x024e }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x024e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x024e }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x024e }
            r2.f296752B = r0     // Catch:{ Exception -> 0x024e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024e }
            r0.<init>()     // Catch:{ Exception -> 0x024e }
            r0.append(r8)     // Catch:{ Exception -> 0x024e }
            r0.append(r5)     // Catch:{ Exception -> 0x024e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x024e }
            boolean r0 = r7.containsKey(r0)     // Catch:{ Exception -> 0x024e }
            if (r0 == 0) goto L_0x0249
            java.lang.String r0 = r2.f296752B     // Catch:{ Exception -> 0x024e }
            int r0 = r0.length()     // Catch:{ Exception -> 0x024e }
            if (r0 <= 0) goto L_0x0249
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x024e }
            r0.<init>()     // Catch:{ Exception -> 0x024e }
            r0.append(r8)     // Catch:{ Exception -> 0x024e }
            r0.append(r5)     // Catch:{ Exception -> 0x024e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x024e }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x024e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x024e }
            double r15 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)     // Catch:{ Exception -> 0x024e }
            r35 = r14
            double r13 = r15 * r30
            int r0 = (int) r13
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0245 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0245 }
            r13 = 0
            r5[r13] = r0     // Catch:{ Exception -> 0x0243 }
            java.lang.String r0 = r2.f296752B     // Catch:{ Exception -> 0x0243 }
            r14 = 1
            java.lang.String r0 = r0.substring(r14)     // Catch:{ Exception -> 0x0241 }
            r5[r14] = r0     // Catch:{ Exception -> 0x0241 }
            java.lang.String r0 = java.lang.String.format(r12, r5)     // Catch:{ Exception -> 0x0241 }
            r2.f296752B = r0     // Catch:{ Exception -> 0x0241 }
            goto L_0x026b
        L_0x0241:
            r0 = move-exception
            goto L_0x0252
        L_0x0243:
            r0 = move-exception
            goto L_0x0247
        L_0x0245:
            r0 = move-exception
        L_0x0246:
            r13 = 0
        L_0x0247:
            r14 = 1
            goto L_0x0252
        L_0x0249:
            r35 = r14
            r13 = 0
            r14 = 1
            goto L_0x026b
        L_0x024e:
            r0 = move-exception
            r35 = r14
            goto L_0x0246
        L_0x0252:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = "sphereImageView adlandinginfo parse color exp="
            r5.append(r12)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x026b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02aa }
            r0.<init>()     // Catch:{ Exception -> 0x02aa }
            r0.append(r8)     // Catch:{ Exception -> 0x02aa }
            r0.append(r1)     // Catch:{ Exception -> 0x02aa }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02aa }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x02aa }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02aa }
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)     // Catch:{ Exception -> 0x02aa }
            float r0 = m132234n(r0, r9, r10, r11)     // Catch:{ Exception -> 0x02aa }
            r2.f296507m = r0     // Catch:{ Exception -> 0x02aa }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02aa }
            r0.<init>()     // Catch:{ Exception -> 0x02aa }
            r0.append(r8)     // Catch:{ Exception -> 0x02aa }
            r0.append(r6)     // Catch:{ Exception -> 0x02aa }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02aa }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x02aa }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02aa }
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)     // Catch:{ Exception -> 0x02aa }
            float r0 = m132234n(r0, r9, r10, r11)     // Catch:{ Exception -> 0x02aa }
            r2.f296508n = r0     // Catch:{ Exception -> 0x02aa }
            goto L_0x02c9
        L_0x02aa:
            r0 = move-exception
            r1 = 0
            r2.f296507m = r1
            r2.f296508n = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "sphereImageView adlandinginfo parse size exp="
            r1.append(r5)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x02c9:
            java.lang.String r0 = ".adxml.adSphereCardInfo.sphereImageUrl"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            java.lang.String r0 = ".adxml.adSphereCardInfo.sphereThumbUrl"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r36 = r34
            r15 = r35
            goto L_0x08d6
        L_0x02e5:
            r35 = r14
            r34 = r15
            r13 = 0
            r14 = 1
            qs2.r0 r0 = m132220A(r43, r44, r45, r46, r47)
            r2 = r0
            r6 = r34
            r15 = r35
            goto L_0x039e
        L_0x02f6:
            r35 = r14
            r34 = r15
            r13 = 0
            r14 = 1
            qs2.f0 r0 = new qs2.f0
            r0.<init>()
            r15 = r35
            r0.f296496b = r15
            r6 = r34
            r0.f296504j = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r3 = ".label"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296593z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r3 = ".value"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            double r13 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r1)
            float r1 = (float) r13
            r0.f296590B = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r3 = ".foregroundImage"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296591C = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            double r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r1)
            float r1 = m132234n(r1, r9, r10, r11)
            r0.f296589A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".backgroundColor"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296592D = r1
            r2 = r0
        L_0x039e:
            r36 = r6
            r13 = 0
            r14 = 1
            goto L_0x08d6
        L_0x03a4:
            so2.l r0 = so2.C101677l.m133555b(r43, r44, r45, r46, r47, r48)
            goto L_0x03ad
        L_0x03a9:
            so2.s r0 = so2.C101689s.m133569b(r43, r44)
        L_0x03ad:
            r36 = r6
            r13 = 0
            r14 = 1
            goto L_0x0931
        L_0x03b3:
            qs2.f r12 = new qs2.f
            r12.<init>()
            r12.f296496b = r15
            r12.f296504j = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".videoUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r12.f296588z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".thumbUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r12.f296574A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "#000000"
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r1)
            r12.f296575B = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".playerMode"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f296576C = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".displayType"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f296577D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".initWidth"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            r12.f296578E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".initHeight"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            r12.f296579F = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".displayWidth"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            r12.f296507m = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".displayHeight"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            r12.f296508n = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".videoMd5"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".thumbMd5"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".forbiddenControlView"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x0524
            r0 = 1
            goto L_0x0525
        L_0x0524:
            r0 = 0
        L_0x0525:
            r12.f296580G = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".hideVoiceIcon"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x0546
            r0 = 1
            goto L_0x0547
        L_0x0546:
            r0 = 0
        L_0x0547:
            r12.f296581H = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".forbiddenAutoPlay"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x0568
            r0 = 1
            goto L_0x0569
        L_0x0568:
            r0 = 0
        L_0x0569:
            r12.f296582I = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".forbiddenPreload"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x058a
            r0 = 1
            goto L_0x058b
        L_0x058a:
            r0 = 0
        L_0x058b:
            r12.f296583J = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".preloadRatio"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r12.f296584K = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".forceLandscapeWhenTurnToFullScreen"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x05c9
            r0 = 1
            goto L_0x05ca
        L_0x05c9:
            r0 = 0
        L_0x05ca:
            r12.f296585L = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r1 = r22
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            r1 = r43
            r0 = r16
            r3 = r45
            r4 = r46
            r14 = 1
            r5 = r47
            r36 = r6
            r13 = 0
            r6 = r48
            qs2.l0 r1 = m132231k(r1, r2, r3, r4, r5, r6)
            r12.f296587N = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r2 = r21
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x0921
            if (r1 <= 0) goto L_0x0921
            qs2.k0 r2 = new qs2.k0
            r2.<init>()
            r2.f296647a = r0
            r2.f296648b = r1
            r12.f296586M = r2
            goto L_0x0921
        L_0x063c:
            r36 = r6
            r13 = 0
            goto L_0x0159
        L_0x0641:
            qs2.e0 r6 = new qs2.e0
            r6.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".backgroundImg"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r6.f296573z = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".iconUrl"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r6.f296563B = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".title"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r6.f296564C = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".desc"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r6.f296565D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".onlyShowInTimelineAd"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r6.f296571J = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".isFullClickable"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 != r14) goto L_0x06f6
            r0 = 1
            goto L_0x06f7
        L_0x06f6:
            r0 = 0
        L_0x06f7:
            r6.f296568G = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".appearPaddingTop"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            int r0 = (int) r0
            r6.f296569H = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".appearPaddingBottom"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            int r0 = (int) r0
            r6.f296570I = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x079e }
            r0.<init>()     // Catch:{ Exception -> 0x079e }
            r0.append(r8)     // Catch:{ Exception -> 0x079e }
            java.lang.String r1 = ".backgroundColor"
            r0.append(r1)     // Catch:{ Exception -> 0x079e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x079e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x079e }
            r1.<init>()     // Catch:{ Exception -> 0x079e }
            r1.append(r8)     // Catch:{ Exception -> 0x079e }
            java.lang.String r2 = ".backgroundColorAlpha"
            r1.append(r2)     // Catch:{ Exception -> 0x079e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x079e }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x079e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x079e }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x079e }
            r6.f296562A = r0     // Catch:{ Exception -> 0x079e }
            boolean r0 = r7.containsKey(r1)     // Catch:{ Exception -> 0x079e }
            if (r0 == 0) goto L_0x07b7
            java.lang.String r0 = r6.f296562A     // Catch:{ Exception -> 0x079e }
            int r0 = r0.length()     // Catch:{ Exception -> 0x079e }
            if (r0 <= 0) goto L_0x07b7
            java.lang.Object r0 = r7.get(r1)     // Catch:{ Exception -> 0x079e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x079e }
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)     // Catch:{ Exception -> 0x079e }
            double r0 = r0 * r30
            int r0 = (int) r0     // Catch:{ Exception -> 0x079e }
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x079e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x079e }
            r2[r13] = r0     // Catch:{ Exception -> 0x079e }
            java.lang.String r0 = r6.f296562A     // Catch:{ Exception -> 0x079e }
            java.lang.String r0 = r0.substring(r14)     // Catch:{ Exception -> 0x079e }
            r2[r14] = r0     // Catch:{ Exception -> 0x079e }
            java.lang.String r0 = java.lang.String.format(r12, r2)     // Catch:{ Exception -> 0x079e }
            r6.f296562A = r0     // Catch:{ Exception -> 0x079e }
            goto L_0x07b7
        L_0x079e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AdLandingPageComponetFloatBarInfo parse backgroundColor exp="
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x07b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0818 }
            r0.<init>()     // Catch:{ Exception -> 0x0818 }
            r0.append(r8)     // Catch:{ Exception -> 0x0818 }
            java.lang.String r1 = ".titleColor"
            r0.append(r1)     // Catch:{ Exception -> 0x0818 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0818 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0818 }
            r1.<init>()     // Catch:{ Exception -> 0x0818 }
            r1.append(r8)     // Catch:{ Exception -> 0x0818 }
            java.lang.String r2 = ".titleColorAlpha"
            r1.append(r2)     // Catch:{ Exception -> 0x0818 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0818 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0818 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0818 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x0818 }
            r6.f296566E = r0     // Catch:{ Exception -> 0x0818 }
            boolean r0 = r7.containsKey(r1)     // Catch:{ Exception -> 0x0818 }
            if (r0 == 0) goto L_0x0831
            java.lang.String r0 = r6.f296566E     // Catch:{ Exception -> 0x0818 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0818 }
            if (r0 <= 0) goto L_0x0831
            java.lang.Object r0 = r7.get(r1)     // Catch:{ Exception -> 0x0818 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0818 }
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)     // Catch:{ Exception -> 0x0818 }
            double r0 = r0 * r30
            int r0 = (int) r0     // Catch:{ Exception -> 0x0818 }
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0818 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0818 }
            r2[r13] = r0     // Catch:{ Exception -> 0x0818 }
            java.lang.String r0 = r6.f296566E     // Catch:{ Exception -> 0x0818 }
            java.lang.String r0 = r0.substring(r14)     // Catch:{ Exception -> 0x0818 }
            r2[r14] = r0     // Catch:{ Exception -> 0x0818 }
            java.lang.String r0 = java.lang.String.format(r12, r2)     // Catch:{ Exception -> 0x0818 }
            r6.f296566E = r0     // Catch:{ Exception -> 0x0818 }
            goto L_0x0831
        L_0x0818:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AdLandingPageComponetFloatBarInfo parse titleColor exp="
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x0831:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0892 }
            r0.<init>()     // Catch:{ Exception -> 0x0892 }
            r0.append(r8)     // Catch:{ Exception -> 0x0892 }
            java.lang.String r1 = ".descColor"
            r0.append(r1)     // Catch:{ Exception -> 0x0892 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0892 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0892 }
            r1.<init>()     // Catch:{ Exception -> 0x0892 }
            r1.append(r8)     // Catch:{ Exception -> 0x0892 }
            java.lang.String r2 = ".descColorAlpha"
            r1.append(r2)     // Catch:{ Exception -> 0x0892 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0892 }
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x0892 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0892 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)     // Catch:{ Exception -> 0x0892 }
            r6.f296567F = r0     // Catch:{ Exception -> 0x0892 }
            boolean r0 = r7.containsKey(r1)     // Catch:{ Exception -> 0x0892 }
            if (r0 == 0) goto L_0x08ab
            java.lang.String r0 = r6.f296567F     // Catch:{ Exception -> 0x0892 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0892 }
            if (r0 <= 0) goto L_0x08ab
            java.lang.Object r0 = r7.get(r1)     // Catch:{ Exception -> 0x0892 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0892 }
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)     // Catch:{ Exception -> 0x0892 }
            double r0 = r0 * r30
            int r0 = (int) r0     // Catch:{ Exception -> 0x0892 }
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0892 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0892 }
            r1[r13] = r0     // Catch:{ Exception -> 0x0892 }
            java.lang.String r0 = r6.f296567F     // Catch:{ Exception -> 0x0892 }
            java.lang.String r0 = r0.substring(r14)     // Catch:{ Exception -> 0x0892 }
            r1[r14] = r0     // Catch:{ Exception -> 0x0892 }
            java.lang.String r0 = java.lang.String.format(r12, r1)     // Catch:{ Exception -> 0x0892 }
            r6.f296567F = r0     // Catch:{ Exception -> 0x0892 }
            goto L_0x08ab
        L_0x0892:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "AdLandingPageComponetFloatBarInfo parse descColor exp="
            r1.append(r2)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
        L_0x08ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".componentItem"
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            r1 = r43
            r3 = r45
            r4 = r46
            r5 = r47
            r12 = r6
            r6 = r48
            qs2.a0 r0 = m132229i(r1, r2, r3, r4, r5, r6)
            r12.f296572K = r0
            boolean r1 = r0 instanceof qs2.C101256b
            if (r1 == 0) goto L_0x0921
            qs2.b r0 = (qs2.C101256b) r0
            r0.f296544w0 = r14
            goto L_0x0921
        L_0x08d6:
            r37 = r29
            r14 = r36
            r12 = 0
            goto L_0x1003
        L_0x08dd:
            r36 = r6
            r13 = 0
            r14 = 1
            qs2.g0 r0 = new qs2.g0
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".shareText"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r0.f258249z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r3 = r33
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            r0.f258248A = r1
        L_0x0920:
            r12 = r0
        L_0x0921:
            r2 = r12
            goto L_0x08d6
        L_0x0923:
            so2.o r0 = so2.C90269o.m113002b(r43, r44, r45, r46, r47)
            goto L_0x0931
        L_0x0928:
            so2.m r0 = so2.C101679m.m133557d(r43, r44, r45, r46, r47, r48)
            goto L_0x0931
        L_0x092d:
            so2.r r0 = so2.C90270r.m113003b(r43, r44)
        L_0x0931:
            r13 = r9
            r14 = r10
            r10 = r15
            r9 = r32
            r12 = r36
            r3 = 1
            r15 = r11
            r11 = r29
            goto L_0x216d
        L_0x093e:
            r36 = r15
            r6 = r29
            r12 = r32
            r5 = 0
            r15 = r14
            r14 = 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".topLineSize"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            double r0 = (double) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r3 = ".bottomLineSize"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            double r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r2)
            float r2 = m132234n(r2, r9, r10, r11)
            double r2 = (double) r2
            java.lang.String r14 = "isCloseToWhite"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r12)
            r16 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r17 = r48 | r16
            int r13 = r17 - r16
            int r4 = -1 - r17
            if (r13 <= r4) goto L_0x0999
            r4 = 1
            goto L_0x099a
        L_0x0999:
            r4 = 0
        L_0x099a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r12)
            if (r4 == 0) goto L_0x09a6
            r4 = 51
            int r4 = android.graphics.Color.argb(r4, r5, r5, r5)
            goto L_0x09ae
        L_0x09a6:
            r4 = 51
            r13 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.argb(r4, r13, r13, r13)
        L_0x09ae:
            r13 = 121(0x79, float:1.7E-43)
            if (r15 != r13) goto L_0x0a61
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r14 = r28
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            double r29 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r14 = r27
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            double r31 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r14 = r26
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            int r33 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r14 = r20
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            r34 = r13
            java.lang.String r34 = (java.lang.String) r34
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            r14 = r19
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r7.get(r13)
            r35 = r13
            java.lang.String r35 = (java.lang.String) r35
            boolean r13 = android.text.TextUtils.isEmpty(r34)
            if (r13 == 0) goto L_0x0a46
            boolean r13 = android.text.TextUtils.isEmpty(r35)
            if (r13 == 0) goto L_0x0a46
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r12)
            goto L_0x16c2
        L_0x0a46:
            qs2.j r13 = new qs2.j
            qs2.j$a r14 = new qs2.j$a
            r28 = r14
            r28.<init>(r29, r31, r33, r34, r35)
            r29 = r13
            r30 = r0
            r32 = r2
            r34 = r14
            r35 = r4
            r29.<init>(r30, r32, r34, r35)
            r0 = r13
            r19 = r15
            goto L_0x0b5e
        L_0x0a61:
            r13 = 122(0x7a, float:1.71E-43)
            if (r15 != r13) goto L_0x0acc
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r8)
            java.lang.String r14 = ".phoneNumList.phoneNum"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x0a7b:
            if (r5 != 0) goto L_0x0a86
            java.lang.Object r16 = r7.get(r13)
            java.lang.String r16 = (java.lang.String) r16
            r19 = r15
            goto L_0x0a9f
        L_0x0a86:
            r19 = r15
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r13)
            r15.append(r5)
            java.lang.String r15 = r15.toString()
            java.lang.Object r15 = r7.get(r15)
            r16 = r15
            java.lang.String r16 = (java.lang.String) r16
        L_0x0a9f:
            r15 = r16
            boolean r16 = android.text.TextUtils.isEmpty(r15)
            if (r16 != 0) goto L_0x0aaf
            r14.add(r15)
            int r5 = r5 + 1
            r15 = r19
            goto L_0x0a7b
        L_0x0aaf:
            boolean r5 = r14.isEmpty()
            if (r5 != 0) goto L_0x0ac7
            qs2.d r5 = new qs2.d
            r29 = r5
            r30 = r0
            r32 = r2
            r34 = r4
            r35 = r14
            r29.<init>(r30, r32, r34, r35)
            r0 = r5
            goto L_0x0b5e
        L_0x0ac7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r12)
            goto L_0x16c2
        L_0x0acc:
            r19 = r15
            r0 = 0
            goto L_0x0b5e
        L_0x0ad1:
            r19 = r14
            r36 = r15
            r6 = r29
            r12 = r32
            qs2.q0 r0 = new qs2.q0
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".webviewUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296688z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".screenHeightOff"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296684A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r13 = r18
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296686C = r1
            qs2.u0 r1 = new qs2.u0
            r1.<init>(r9, r10, r11)
            r0.f296685B = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".showLoadAnimation"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            if (r1 <= 0) goto L_0x0b5b
            r1 = 1
            goto L_0x0b5c
        L_0x0b5b:
            r1 = 0
        L_0x0b5c:
            r0.f296687D = r1
        L_0x0b5e:
            r13 = r9
            r14 = r10
            r15 = r11
            r9 = r12
            r10 = r19
            r12 = r36
            r3 = 1
            goto L_0x0ba1
        L_0x0b68:
            r19 = r14
            r36 = r15
            r6 = r29
            r12 = r32
            qs2.n0 r0 = new qs2.n0
            r0.<init>()
            r15 = r19
            r0.f296496b = r15
            r14 = r36
            r0.f296504j = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".webviewUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f258250z = r1
            r13 = r9
            r9 = r12
            r12 = r14
            r3 = 1
            r14 = r10
            r10 = r15
            r15 = r11
        L_0x0ba1:
            r11 = r6
            goto L_0x216d
        L_0x0ba4:
            r0 = r16
            r2 = r21
            r1 = r22
            r6 = r29
            r12 = r32
            r40 = r15
            r15 = r14
            r14 = r40
            qs2.p0 r13 = new qs2.p0
            r13.<init>()
            r13.f296496b = r15
            r13.f296504j = r14
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".streamVideoUrl"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r13.f296680z = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".streamVideoThumb"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r13.f296673A = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = ".streamDisplayWidth"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            double r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r3)
            float r3 = m132234n(r3, r9, r10, r11)
            r13.f296507m = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = ".streamDisplayHeight"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            double r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r3)
            float r3 = m132234n(r3, r9, r10, r11)
            r13.f296508n = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = ".streamDisplayType"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            r13.f296674B = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0c9a
            if (r2 <= 0) goto L_0x0c9a
            qs2.k0 r3 = new qs2.k0
            r3.<init>()
            r3.f296647a = r0
            r3.f296648b = r2
            r13.f296675C = r3
        L_0x0c9a:
            java.lang.String r0 = ".adxml.adCanvasInfo.heightRoundingType"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x0caa
            r0 = 1
            goto L_0x0cab
        L_0x0caa:
            r0 = 0
        L_0x0cab:
            r13.f296676D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            r1 = r43
            r3 = r45
            r4 = r46
            r32 = r12
            r12 = 0
            r5 = r47
            r37 = r6
            r6 = r48
            qs2.l0 r0 = m132231k(r1, r2, r3, r4, r5, r6)
            r13.f296677E = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".alwaysAutoPlay"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r1 = 1
            if (r0 != r1) goto L_0x0cf1
            r6 = 1
            goto L_0x0cf2
        L_0x0cf1:
            r6 = 0
        L_0x0cf2:
            r13.f296678F = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".forceLandscapeWhenTurnToFullScreen"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r1 = 1
            if (r0 != r1) goto L_0x0d14
            r6 = 1
            goto L_0x0d15
        L_0x0d14:
            r6 = 0
        L_0x0d15:
            r13.f296679G = r6
            goto L_0x1002
        L_0x0d19:
            r0 = r16
            r2 = r21
            r1 = r22
            r37 = r29
            r12 = 0
            r40 = r15
            r15 = r14
            r14 = r40
            qs2.w r13 = new qs2.w
            r13.<init>()
            r13.f296496b = r15
            r13.f296504j = r14
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".sightVideoUrl"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r13.f296769z = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".sightThumbUrl"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r13.f296754A = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".streamVideoUrl"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r13.f296755B = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".jumpText"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r13.f296756C = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r5 = r25
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r13.f296760G = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r5 = r24
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r13.f296761H = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r4 = r23
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            r13.f296762I = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0e19 }
            r3.<init>()     // Catch:{ Exception -> 0x0e19 }
            r3.append(r8)     // Catch:{ Exception -> 0x0e19 }
            java.lang.String r4 = ".jumpTextColor"
            r3.append(r4)     // Catch:{ Exception -> 0x0e19 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0e19 }
            java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0e19 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0e19 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x0e19 }
            r13.f296757D = r3     // Catch:{ Exception -> 0x0e19 }
            goto L_0x0e21
        L_0x0e19:
            r3 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.rgb(r3, r3, r3)
            r13.f296757D = r4
        L_0x0e21:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0e3f }
            r3.<init>()     // Catch:{ Exception -> 0x0e3f }
            r3.append(r8)     // Catch:{ Exception -> 0x0e3f }
            java.lang.String r4 = ".separatorColor"
            r3.append(r4)     // Catch:{ Exception -> 0x0e3f }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0e3f }
            java.lang.Object r3 = r7.get(r3)     // Catch:{ Exception -> 0x0e3f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0e3f }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x0e3f }
            r13.f296758E = r3     // Catch:{ Exception -> 0x0e3f }
            goto L_0x0e47
        L_0x0e3f:
            r3 = 255(0xff, float:3.57E-43)
            int r3 = android.graphics.Color.rgb(r3, r3, r3)
            r13.f296758E = r3
        L_0x0e47:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = ".sightDisplayWidth"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            double r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r3)
            float r3 = m132234n(r3, r9, r10, r11)
            r13.f296507m = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = ".sightDisplayHeight"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            double r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r3)
            float r3 = m132234n(r3, r9, r10, r11)
            r13.f296508n = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r4 = ".sightDisplayType"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            r13.f296759F = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r2)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x0eeb
            if (r2 <= 0) goto L_0x0eeb
            qs2.k0 r3 = new qs2.k0
            r3.<init>()
            r3.f296647a = r0
            r3.f296648b = r2
            r13.f296763J = r3
        L_0x0eeb:
            java.lang.String r0 = ".adxml.adCanvasInfo.heightRoundingType"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x0efb
            r6 = 1
            goto L_0x0efc
        L_0x0efb:
            r6 = 0
        L_0x0efc:
            r13.f296764K = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r2 = ".downloadVideoByCdn"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x0f1d
            r6 = 1
            goto L_0x0f1e
        L_0x0f1d:
            r6 = 0
        L_0x0f1e:
            r13.f296765L = r6
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0f37 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ all -> 0x0f37 }
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_ad_landing_sight_forbid_cdn     // Catch:{ all -> 0x0f37 }
            int r0 = r0.mo58779Qe(r2, r12)     // Catch:{ all -> 0x0f37 }
            r2 = 1
            if (r0 != r2) goto L_0x0f33
            r6 = 1
            goto L_0x0f34
        L_0x0f33:
            r6 = 0
        L_0x0f34:
            r13.f296766M = r6     // Catch:{ all -> 0x0f37 }
            goto L_0x0f38
        L_0x0f37:
        L_0x0f38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r2 = ".forbiddenControlView"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 <= 0) goto L_0x0f57
            r6 = 1
            goto L_0x0f58
        L_0x0f57:
            r6 = 0
        L_0x0f58:
            r13.f296767N = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            r1 = r43
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            qs2.l0 r0 = m132231k(r1, r2, r3, r4, r5, r6)
            r13.f296768O = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".fileSize"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0)
            goto L_0x1002
        L_0x0f94:
            r37 = r29
            r12 = 0
            r40 = r15
            r15 = r14
            r14 = r40
            qs2.u r13 = new qs2.u
            r13.<init>()
            r13.f296496b = r15
            r13.f296504j = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".fullScreenImageUrl"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r13.f296747z = r0
            r1 = 1
            r13.f296740B = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            if (r0 != r1) goto L_0x0fe2
            r6 = 1
            goto L_0x0fe3
        L_0x0fe2:
            r6 = 0
        L_0x0fe3:
            r13.f296741C = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".scaleType"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r13.f296745G = r0
        L_0x1002:
            r2 = r13
        L_0x1003:
            r0 = r2
            goto L_0x1099
        L_0x1006:
            r37 = r29
            r12 = 0
            r40 = r15
            r15 = r14
            r14 = r40
            qs2.t r0 = new qs2.t
            r0.<init>()
            r0.f296496b = r15
            r0.f296504j = r14
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r3 = ".panoramaImageUrl"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r4)
            r0.f296734z = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            double r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r1)
            float r1 = m132234n(r1, r9, r10, r11)
            r0.f296507m = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            double r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r1)
            float r1 = m132234n(r1, r9, r10, r11)
            r0.f296508n = r1
            goto L_0x1099
        L_0x1073:
            r37 = r29
            r12 = 0
            r40 = r15
            r15 = r14
            r14 = r40
            so2.p r0 = so2.C101687p.m133568b(r43, r44, r45, r46, r47)
            goto L_0x1099
        L_0x1080:
            r37 = r29
            r12 = 0
            r40 = r15
            r15 = r14
            r14 = r40
            so2.j r0 = m132232l(r43, r44, r45, r46, r47, r48)
            goto L_0x1099
        L_0x108d:
            r37 = r29
            r12 = 0
            r40 = r15
            r15 = r14
            r14 = r40
            qs2.s r0 = m132226f(r43, r44, r45, r46, r47, r48)
        L_0x1099:
            r13 = r9
            r12 = r14
            r9 = r32
            r3 = 1
            r14 = r10
            r10 = r15
            r15 = r11
            r11 = r37
            goto L_0x216d
        L_0x10a5:
            r2 = r12
            r13 = r18
            r37 = r29
            r38 = r32
            r40 = r15
            r15 = r14
            r14 = r40
            qs2.u r12 = new qs2.u
            r12.<init>()
            r12.f296496b = r15
            r12.f296504j = r14
            r34 = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r8)
            r35 = r15
            java.lang.String r15 = ".pureImageUrl"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            java.lang.Object r14 = r7.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r14, (java.lang.String) r4)
            r12.f296747z = r14
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r8)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r12.f296739A = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            boolean r0 = r7.containsKey(r0)
            if (r0 == 0) goto L_0x1148
            java.lang.String r0 = r12.f296739A
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x1148
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r14 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            double r14 = r14 * r30
            int r0 = (int) r14
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14 = 0
            r5[r14] = r0
            java.lang.String r0 = r12.f296739A
            r14 = 1
            java.lang.String r0 = r0.substring(r14)
            r5[r14] = r0
            java.lang.String r0 = java.lang.String.format(r2, r5)
            r12.f296739A = r0
        L_0x1148:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            r12.f296507m = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            double r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r0)
            float r0 = m132234n(r0, r9, r10, r11)
            r12.f296508n = r0
            r15 = 0
            r12.f296740B = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r1 = 1
            if (r0 != r1) goto L_0x11a7
            r6 = 1
            goto L_0x11a8
        L_0x11a7:
            r6 = 0
        L_0x11a8:
            r12.f296741C = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r4)
            r12.f296742D = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r1 = r21
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            r1 = 1
            if (r0 != r1) goto L_0x11e5
            r6 = 1
            goto L_0x11e6
        L_0x11e5:
            r6 = 0
        L_0x11e6:
            r12.f296743E = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r1 = r22
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            double r0 = (double) r0
            float r0 = m132234n(r0, r9, r10, r11)
            r12.f296744F = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".fileSize"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".imageMd5"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            r12.f296746H = r0
            r13 = r9
            r14 = r10
            r15 = r11
            r0 = r12
            r12 = r34
            r10 = r35
            r11 = r37
            r9 = r38
        L_0x124d:
            r3 = 1
            goto L_0x216d
        L_0x1250:
            r9 = r0
            r6 = r1
            r37 = r12
            r38 = r13
            r35 = r14
            r12 = r15
            r13 = r18
            r0 = r19
            r15 = r20
            r1 = r21
            r39 = r22
            r10 = r23
            r11 = r24
            r19 = r2
            r14 = r5
            r5 = r25
            java.lang.String r2 = ".btnBorderColorTheme"
            java.lang.String r1 = ".btnBgColorTheme"
            r20 = r13
            r13 = 2
            if (r12 != r13) goto L_0x148e
            qs2.b r0 = new qs2.b
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".appid"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296523b0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".wxAppid"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296524c0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".useGameDownloadWidget"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r6 = 1
            if (r5 != r6) goto L_0x12cc
            r6 = 1
            goto L_0x12cd
        L_0x12cc:
            r6 = 0
        L_0x12cd:
            r0.f296527f0 = r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".appPageUrlAndroid"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296542u0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".channelId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296525d0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".pkg"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296529h0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".platform"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296531j0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".warningAndroid"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296532k0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296533l0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnBgColorThemePressed"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296535n0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnBgColorThemeDisable"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296534m0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296536o0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnBorderColorThemePressed"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296538q0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnBorderColorThemeDisable"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296537p0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296539r0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".fontColorPressed"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296541t0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".fontColorDisable"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296540s0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".showDownloadTip"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296545x0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".toOpenAppText"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296520A0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".marketFlag"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296546y0 = r5
            if (r5 <= 0) goto L_0x15be
            android.content.Intent r5 = m132245y(r43)
            if (r5 == 0) goto L_0x15be
            r0.f296547z0 = r5
            goto L_0x15be
        L_0x148e:
            r13 = 4
            if (r12 != r13) goto L_0x14d2
            qs2.g r0 = new qs2.g
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".cardTpId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296594Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".cardExt"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296595a0 = r5
            goto L_0x15be
        L_0x14d2:
            r13 = 7
            if (r12 != r13) goto L_0x1566
            qs2.m r0 = new qs2.m
            r0.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296656Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296657a0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296658b0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnCanvasEnterType"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296659c0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnCanvasSource"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296660d0 = r5
            goto L_0x15be
        L_0x1566:
            r5 = 8
            java.lang.String r10 = ".weappUserName"
            if (r12 != r5) goto L_0x15c6
            qs2.l r0 = new qs2.l
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296649Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".weappPath"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f296650a0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".miniProgramType"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296651b0 = r5
        L_0x15be:
            r10 = r35
            r11 = r37
            r9 = r38
            goto L_0x1c7d
        L_0x15c6:
            r5 = 9
            if (r12 != r5) goto L_0x1669
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            double r21 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            double r23 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r25 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            r26 = r5
            java.lang.String r26 = (java.lang.String) r26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.Object r0 = r7.get(r0)
            r27 = r0
            java.lang.String r27 = (java.lang.String) r27
            boolean r0 = android.text.TextUtils.isEmpty(r26)
            if (r0 == 0) goto L_0x1657
            boolean r0 = android.text.TextUtils.isEmpty(r27)
            if (r0 == 0) goto L_0x1657
            r11 = r37
            r9 = r38
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r9)
            goto L_0x16c2
        L_0x1657:
            r11 = r37
            r9 = r38
            qs2.i r0 = new qs2.i
            qs2.i$a r5 = new qs2.i$a
            r20 = r5
            r20.<init>(r21, r23, r25, r26, r27)
            r0.<init>(r5)
            goto L_0x1c7b
        L_0x1669:
            r11 = r37
            r9 = r38
            r0 = 10
            if (r12 != r0) goto L_0x16c4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r5 = ".phoneNumList.phoneNum"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
        L_0x1688:
            if (r6 != 0) goto L_0x1691
            java.lang.Object r10 = r7.get(r0)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x16a6
        L_0x1691:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r0)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            java.lang.Object r10 = r7.get(r10)
            java.lang.String r10 = (java.lang.String) r10
        L_0x16a6:
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 != 0) goto L_0x16b2
            r5.add(r10)
            int r6 = r6 + 1
            goto L_0x1688
        L_0x16b2:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x16bf
            qs2.k r0 = new qs2.k
            r0.<init>(r5)
            goto L_0x1c7b
        L_0x16bf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r9)
        L_0x16c2:
            r0 = 0
            return r0
        L_0x16c4:
            r0 = 12
            if (r12 != r0) goto L_0x17a5
            qs2.o r0 = new qs2.o
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f258251Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".weAppID"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f258252a0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".businessId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f258253b0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".sessionFrom"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            r0.f258254c0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".showMessageCard"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f258255d0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".sendMessageTitle"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f258256e0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".sendMessageImg"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f258257f0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".sendMessagePath"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f258258g0 = r5
            goto L_0x1c7b
        L_0x17a5:
            r0 = 13
            if (r12 != r0) goto L_0x17ea
            qs2.p r0 = new qs2.p
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".sid"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296667Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".compid"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296668a0 = r5
            goto L_0x1c7b
        L_0x17ea:
            r0 = 14
            if (r12 != r0) goto L_0x1846
            qs2.h r0 = new qs2.h
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".redEnvelopsSkinBtnDisableWording"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f296596Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".redEnvelopsSkinDisableTime"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r5)
            r0.f296598b0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".redEnvelopesSkinId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f296597a0 = r5
            goto L_0x1c7b
        L_0x1846:
            r0 = 15
            if (r12 != r0) goto L_0x18e2
            qs2.c0 r0 = new qs2.c0
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".qrUrl"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296554Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r6 = r20
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296555a0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r6 = r21
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296556b0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".needRequestLBS"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296558d0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".qrScanDirectJump"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f296557c0 = r5
            goto L_0x1c7b
        L_0x18e2:
            r0 = 16
            if (r12 != r0) goto L_0x18f5
            qs2.d0 r0 = new qs2.d0
            r0.<init>()
            java.lang.String r5 = ".adxml.adScanInfo"
            com.tencent.mm.plugin.sns.storage.ADXml$b r5 = com.tencent.p014mm.plugin.sns.storage.ADXml.C85461b.m105464a(r7, r5)
            r0.f296560Z = r5
            goto L_0x1c7b
        L_0x18f5:
            r0 = 17
            if (r12 != r0) goto L_0x19cb
            qs2.x r0 = new qs2.x
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".brandUsername"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f258259Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".brandHead"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f258260a0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".brandName"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f258261b0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".brandDesc"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f258262c0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnTitleAfterAddBrand"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f258263d0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".compatibleJumpUrl"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f258264e0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".brandDirectJump"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f258265f0 = r5
            goto L_0x1c7b
        L_0x19cb:
            r0 = 18
            if (r12 != r0) goto L_0x19f3
            qs2.n r0 = new qs2.n
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".wxGroupInfo"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f296665Z = r5
            goto L_0x1c7b
        L_0x19f3:
            r0 = 19
            if (r12 != r0) goto L_0x1a4f
            so2.b r0 = new so2.b
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".couponAppId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f297594Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".couponStockId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f297595a0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".onReceiveSuccess"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r5 = com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo.m119629b(r7, r5)
            r0.f297596b0 = r5
            goto L_0x1c7b
        L_0x1a4f:
            r0 = 20
            java.lang.String r5 = ".finderUsername"
            if (r12 != r0) goto L_0x1a94
            so2.g r0 = new so2.g
            r0.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f297614Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".finderLiveNoticeId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f297615a0 = r5
            goto L_0x1c7b
        L_0x1a94:
            r0 = 21
            if (r12 != r0) goto L_0x1aba
            so2.e r0 = new so2.e
            r0.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f297610Z = r5
            goto L_0x1c7b
        L_0x1aba:
            r0 = 22
            if (r12 != r0) goto L_0x1b1a
            so2.f r0 = new so2.f
            r0.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f297613b0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".finderExportId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f297611Z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".finderObjectNonceId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f297612a0 = r5
            goto L_0x1c7b
        L_0x1b1a:
            r0 = 23
            if (r12 != r0) goto L_0x1b42
            qs2.j0 r0 = new qs2.j0
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".emotionProductId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f296645Z = r5
            goto L_0x1c7b
        L_0x1b42:
            r0 = 24
            if (r12 != r0) goto L_0x1b6a
            qs2.o0 r0 = new qs2.o0
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".jumpKefuUrl"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f296666Z = r5
            goto L_0x1c7b
        L_0x1b6a:
            r0 = 25
            if (r12 != r0) goto L_0x1b8c
            ts2.a r0 = new ts2.a
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".appointmentInfo"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            co2.a r5 = co2.C92428a.m116256a(r7, r5)
            r0.f300101Z = r5
            goto L_0x1c7b
        L_0x1b8c:
            r0 = 26
            if (r12 != r0) goto L_0x1bae
            so2.q r0 = new so2.q
            r0.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".finderFollowInfo"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            co2.i r5 = co2.C92442i.m116271a(r7, r5)
            r0.f297696Z = r5
            goto L_0x1c7b
        L_0x1bae:
            r0 = 27
            if (r12 != r0) goto L_0x1c64
            so2.h r0 = new so2.h
            r0.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r10 = ".finderLiveSuccessBtnTitle"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r0.f297616Z = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r10 = ".finderLiveFinishTitle"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r0.f297617a0 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            java.lang.String r10 = ".finderLiveStartTime"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r6)
            r0.f297618b0 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f297619c0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".finderLiveNoticeId"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r0.f297620d0 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".isSimpleFinderLiveNotice"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            r0.f297621e0 = r5
            goto L_0x1c7b
        L_0x1c64:
            r0 = 28
            if (r12 != r0) goto L_0x1c6d
            so2.n r0 = so2.C101683n.m133562c(r43, r44)
            goto L_0x1c7b
        L_0x1c6d:
            r0 = 29
            if (r12 != r0) goto L_0x1c76
            so2.c r0 = so2.C101667c.m133553b(r43, r44)
            goto L_0x1c7b
        L_0x1c76:
            qs2.r r0 = new qs2.r
            r0.<init>()
        L_0x1c7b:
            r10 = r35
        L_0x1c7d:
            r0.f296496b = r10
            r0.f296504j = r12
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnTitle"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296714z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnType"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnJumpUrl"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296689A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            java.lang.String r6 = ".btnJumpApp"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r4)
            r0.f296690B = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r0.f296691C = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r5 = r19
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            double r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r3)
            r13 = r45
            r14 = r46
            r15 = r47
            float r3 = m132234n(r5, r13, r14, r15)
            r0.f296692D = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".btnFontType"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            r0.f296694F = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".btnAlignment"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".borderSize"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            double r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r3)
            float r3 = m132234n(r5, r13, r14, r15)
            r0.f296693E = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            java.lang.String r5 = ".btnHeight"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r7.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            double r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r3)
            float r3 = m132234n(r5, r13, r14, r15)
            r0.f296508n = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296695G = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296696H = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".btnBgImgUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296697I = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".bCanLongPress"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296698J = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".bHideActionSheet"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296699K = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".hideProductActionHeader"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296700L = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".showProductActionCancelButton"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296701M = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".productActionTitle"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296703O = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".productActionBuffer"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296702N = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".productActionIconUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296704P = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r2 = r39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            double r1 = (double) r1
            float r1 = m132234n(r1, r13, r14, r15)
            r0.f296706R = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".btnIconUrl"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296707S = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".btnIconSize"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            double r1 = (double) r1
            float r1 = m132234n(r1, r13, r14, r15)
            r0.f296708T = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".fontColorDisabled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296709U = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".btnBgColorDisabled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296710V = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".btnBorderColorDisabled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296711W = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".isJumpInHalfScreenStyle"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r2 = 1
            if (r1 != r2) goto L_0x1fa3
            r6 = 1
            goto L_0x1fa4
        L_0x1fa3:
            r6 = 0
        L_0x1fa4:
            r0.f296712X = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".autoJump"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r2 = 1
            if (r1 != r2) goto L_0x1fc6
            r6 = 1
            goto L_0x1fc7
        L_0x1fc6:
            r6 = 0
        L_0x1fc7:
            r0.f296713Y = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".productActionItem.componentItem.type"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = r7.containsKey(r1)
            if (r1 == 0) goto L_0x124d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".productActionItem.componentItem"
            r1.append(r2)
            java.lang.String r6 = r1.toString()
            r1 = r43
            r2 = r45
            r3 = r46
            r4 = r47
            r5 = r48
            qs2.a0 r1 = m132227g(r1, r2, r3, r4, r5, r6)
            r0.f296705Q = r1
            goto L_0x124d
        L_0x2003:
            r5 = r2
            r40 = r13
            r13 = r9
            r9 = r40
            r41 = r14
            r14 = r10
            r10 = r41
            r42 = r15
            r15 = r11
            r11 = r12
            r12 = r42
            qs2.h0 r0 = new qs2.h0
            r0.<init>()
            r0.f296496b = r10
            r0.f296504j = r12
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".content"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296609z = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".textAlignment"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296600B = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r4)
            r0.f296601C = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            double r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseDouble(r1)
            float r1 = m132234n(r1, r13, r14, r15)
            r0.f296599A = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".showType"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r3 = 1
            r1 = r1 & r3
            if (r1 <= 0) goto L_0x20b2
            r6 = 1
            goto L_0x20b3
        L_0x20b2:
            r6 = 0
        L_0x20b3:
            r0.f296602D = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r4 = 2
            r1 = r1 & r4
            if (r1 <= 0) goto L_0x20d4
            r6 = 1
            goto L_0x20d5
        L_0x20d4:
            r6 = 0
        L_0x20d5:
            r0.f296603E = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r2 = 4
            r1 = r1 & r2
            if (r1 <= 0) goto L_0x20f6
            r6 = 1
            goto L_0x20f7
        L_0x20f6:
            r6 = 0
        L_0x20f7:
            r0.f296604F = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".maxLines"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296605G = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".fontType"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296606H = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".lineSpace"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            float r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseFloat(r1)
            r0.f296607I = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r2 = ".textVerticalAlignment"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object r1 = r7.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            r0.f296608J = r1
        L_0x216d:
            if (r0 == 0) goto L_0x2199
            java.lang.String r1 = "isCloseToWhite"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r9)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r48 | r2
            int r2 = r4 - r2
            int r4 = -1 - r4
            if (r2 <= r4) goto L_0x2181
            r6 = 1
            goto L_0x2182
        L_0x2181:
            r6 = 0
        L_0x2182:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r9)
            r0.f296503i = r6
            r0.f296505k = r10
            r0.f296504j = r12
            r1 = r0
            r2 = r43
            r3 = r44
            r4 = r45
            r5 = r46
            r6 = r47
            m132246z(r1, r2, r3, r4, r5, r6)
        L_0x2199:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.C100894u.m132229i(java.util.Map, java.lang.String, int, int, int, int):qs2.a0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x004d  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m132230j() {
        /*
            java.lang.String r0 = "AdLandingPagesParseHelper"
            java.lang.String r1 = "getEnableCanvasValidCache"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r3 = 1
            r4 = 0
            java.lang.Class<h81.h> r5 = h81.C32735h.class
            di3.d r5 = di3.C86312j.m106911c(r5)     // Catch:{ all -> 0x0030 }
            h81.h r5 = (h81.C32735h) r5     // Catch:{ all -> 0x0030 }
            h81.h$c r6 = h81.C32735h.C32737c.clicfg_sns_ad_enable_ad_canvas_valid_cache_android     // Catch:{ all -> 0x0030 }
            int r5 = r5.mo58779Qe(r6, r3)     // Catch:{ all -> 0x0030 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
            r6.<init>()     // Catch:{ all -> 0x002e }
            java.lang.String r7 = "getEnableCanvasValidCache called "
            r6.append(r7)     // Catch:{ all -> 0x002e }
            r6.append(r5)     // Catch:{ all -> 0x002e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x002e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)     // Catch:{ all -> 0x002e }
            goto L_0x004a
        L_0x002e:
            r6 = move-exception
            goto L_0x0032
        L_0x0030:
            r6 = move-exception
            r5 = 0
        L_0x0032:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "getEnableCanvasValidCache, exp="
            r7.append(r8)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r6)
        L_0x004a:
            if (r5 <= 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.C100894u.m132230j():boolean");
    }

    /* renamed from: k */
    public static C101278l0 m132231k(Map<String, String> map, String str, int i, int i2, int i3, int i4) {
        Map<String, String> map2 = map;
        String str2 = str;
        SnsMethodCalculate.markStartTimeMs("getFloatBarCompInfoFromMediaVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        C101278l0 l0Var = new C101278l0();
        m132246z(l0Var, map, str, i, i2, i3);
        l0Var.f296655z = Util.nullAs(map.get(str + ".desc"), "");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".isFullClickable");
        l0Var.f296653B = Util.safeParseInt(map.get(sb.toString())) == 1;
        try {
            String str3 = str + ".descColorAlpha";
            l0Var.f296652A = Util.nullAs(map.get(str + ".descColor"), "");
            if (map.containsKey(str3) && l0Var.f296652A.length() > 0) {
                l0Var.f296652A = String.format("#%02x%s", new Object[]{Integer.valueOf((int) (Util.safeParseDouble(map.get(str3)) * 255.0d)), l0Var.f296652A.substring(1)});
            }
        } catch (Exception e) {
            Log.m105920e("AdLandingPagesParseHelper", "AdLandingPageComponetFloatBarInfo parse descColor exp=" + e.toString());
        }
        C101255a0 i5 = m132229i(map, str + ".componentItem", i, i2, i3, i4);
        l0Var.f296654C = i5;
        if (i5 instanceof C101256b) {
            ((C101256b) i5).f296544w0 = true;
        }
        SnsMethodCalculate.markEndTimeMs("getFloatBarCompInfoFromMediaVideo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return l0Var;
    }

    /* renamed from: l */
    public static C101675j m132232l(Map<String, String> map, String str, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("getFloatJumpCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        C101675j jVar = new C101675j();
        jVar.f297628z = Util.nullAs(map.get(str + ".title"), "");
        jVar.f297625A = Util.safeParseInt(map.get(str + ".autoJump"));
        jVar.f297626B = Util.safeParseInt(map.get(str + ".swipeJumpOffset"));
        C101255a0 i5 = m132229i(map, str + ".componentItem", i, i2, i3, i4);
        if (i5 instanceof C101287r) {
            jVar.f297627C = (C101287r) i5;
        }
        SnsMethodCalculate.markEndTimeMs("getFloatJumpCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return jVar;
    }

    /* renamed from: m */
    public static C101262e m132233m(Map<String, String> map, String str, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        C101262e eVar = new C101262e();
        eVar.f296561z = Util.nullAs(map.get(str + ".webViewUrl"), "");
        Util.safeParseInt(map.get(str + ".webViewHeight"));
        Util.safeParseInt(map.get(str + ".webViewWidth"));
        Util.safeParseInt(map.get(str + ".hideWebViewProgress"));
        SnsMethodCalculate.markEndTimeMs("getFloatWebViewCompInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return eVar;
    }

    /* renamed from: n */
    public static float m132234n(double d, int i, int i2, int i3) {
        SnsMethodCalculate.markStartTimeMs("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (i == 0) {
            float f = (float) d;
            SnsMethodCalculate.markEndTimeMs("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return f;
        } else if (i2 == 0) {
            float f2 = (float) d;
            SnsMethodCalculate.markEndTimeMs("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return f2;
        } else {
            int[] b = C95198o2.m121130b(MMApplicationContext.getContext());
            float min = ((((float) d) * ((float) i3)) * ((float) Math.min(b[0], b[1]))) / ((float) i2);
            SnsMethodCalculate.markStartTimeMs("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            int i4 = (int) min;
            if (((double) (min - ((float) i4))) > 0.001d) {
                i4++;
            }
            SnsMethodCalculate.markEndTimeMs("safeParseIntPxFromFloat", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.LandingPageUtil");
            float f3 = (float) i4;
            SnsMethodCalculate.markEndTimeMs("getPointsSizeFromXmlData", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return f3;
        }
    }

    /* renamed from: o */
    public static boolean m132235o(int i) {
        SnsMethodCalculate.markStartTimeMs("isComponentEggCardContainerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        boolean z = i == 139;
        SnsMethodCalculate.markEndTimeMs("isComponentEggCardContainerType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return z;
    }

    /* renamed from: p */
    public static boolean m132236p(int i) {
        SnsMethodCalculate.markStartTimeMs("isComponentFloatLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (i == 105) {
            SnsMethodCalculate.markEndTimeMs("isComponentFloatLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isComponentFloatLayoutType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return false;
    }

    /* renamed from: q */
    public static boolean m132237q(int i) {
        SnsMethodCalculate.markStartTimeMs("isContainerCompentInfoType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (i == 101 || i == 103 || i == 104 || i == 105 || i == 139 || i == 145) {
            SnsMethodCalculate.markEndTimeMs("isContainerCompentInfoType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("isContainerCompentInfoType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return false;
    }

    /* renamed from: r */
    public static boolean m132238r(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("isGameShareCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        boolean z = true;
        if (Util.safeParseInt(Util.nullAs(XmlParser.parseXml(str, "adCanvasInfo", (String) null).get(".adCanvasInfo.bizId"), "")) != 1) {
            z = false;
        }
        SnsMethodCalculate.markEndTimeMs("isGameShareCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return z;
    }

    /* renamed from: s */
    public static boolean m132239s(String str) {
        SnsMethodCalculate.markStartTimeMs("isValidCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        boolean t = m132240t(str, "adCanvasInfo");
        SnsMethodCalculate.markEndTimeMs("isValidCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0154, code lost:
        if (r14 != null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0173, code lost:
        if (r14 != null) goto L_0x0175;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0169 A[Catch:{ IOException -> 0x016a, XmlPullParserException -> 0x015e, all -> 0x015b, all -> 0x017c }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0180 A[SYNTHETIC, Splitter:B:85:0x0180] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0193  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m132240t(java.lang.String r19, java.lang.String r20) {
        /*
            r1 = r19
            r2 = r20
            java.lang.String r3 = "isValidCanvas"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r7 = "isValidCanvasInternal"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            java.lang.String r8 = "AdLandingPagesParseHelper"
            r9 = 1
            if (r0 != 0) goto L_0x03d7
            boolean r0 = android.text.TextUtils.isEmpty(r20)
            if (r0 == 0) goto L_0x0027
            goto L_0x03d7
        L_0x0027:
            boolean r0 = m132230j()
            if (r0 == 0) goto L_0x0068
            com.tencent.mm.plugin.sns.storage.ADXml r0 = com.tencent.p014mm.plugin.sns.storage.AdSnsInfo.getADXmlCache(r19)
            if (r0 == 0) goto L_0x0068
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r11 = r0.adCanvasValidMap
            boolean r11 = r11.containsKey(r2)
            if (r11 == 0) goto L_0x0068
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = r0.adCanvasValidMap
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0068
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "hit xml cache len = "
            r9.append(r11)
            int r11 = r19.length()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            boolean r9 = r0.booleanValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            r17 = r3
            goto L_0x03dd
        L_0x0068:
            java.util.Set<ps2.u$b> r0 = f295460a
            r11 = 0
            r12 = 2
            if (r0 != 0) goto L_0x0187
            java.lang.String r13 = "initValidTypes"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
            java.util.Set<ps2.u$b> r0 = f295460a
            if (r0 == 0) goto L_0x007c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            goto L_0x0187
        L_0x007c:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            f295460a = r0
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ IOException -> 0x016a, XmlPullParserException -> 0x015e, all -> 0x015b }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x016a, XmlPullParserException -> 0x015e, all -> 0x015b }
            java.lang.String r14 = "sns/canvas_valid_type.xml"
            java.io.InputStream r14 = r0.open(r14)     // Catch:{ IOException -> 0x016a, XmlPullParserException -> 0x015e, all -> 0x015b }
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            java.lang.String r15 = "UTF-8"
            r0.setInput(r14, r15)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            int r15 = r0.getEventType()     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r10 = -1
            r16 = -1
            r17 = -1
        L_0x00a8:
            if (r15 == r9) goto L_0x0154
            if (r15 != r12) goto L_0x0146
            java.lang.String r15 = r0.getName()     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            java.lang.String r12 = "canvastype"
            boolean r12 = r12.equals(r15)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            if (r12 == 0) goto L_0x00bb
            r12 = 0
            r15 = 0
            goto L_0x00e0
        L_0x00bb:
            java.lang.String r12 = "pagetype"
            boolean r12 = r12.equals(r15)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            if (r12 == 0) goto L_0x00c7
            r12 = 1
            r15 = 1
            goto L_0x00e0
        L_0x00c7:
            java.lang.String r12 = "componenttype"
            boolean r12 = r12.equals(r15)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            if (r12 == 0) goto L_0x00d2
            r12 = 2
            r15 = 2
            goto L_0x00e0
        L_0x00d2:
            java.lang.String r12 = "subtype"
            boolean r12 = r12.equals(r15)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r15 = r16
            if (r12 == 0) goto L_0x00df
            r12 = 3
            goto L_0x00e0
        L_0x00df:
            r12 = -1
        L_0x00e0:
            if (r12 == r10) goto L_0x0141
            java.lang.String r9 = "android"
            java.lang.String r9 = r0.getAttributeValue(r11, r9)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r10 = 0
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r10)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r10 = 1
            if (r9 != r10) goto L_0x00fe
            java.lang.String r9 = "val"
            java.lang.String r9 = r0.getAttributeValue(r11, r9)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r10 = -1
            int r9 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r9, (int) r10)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r10 = r9
            goto L_0x00ff
        L_0x00fe:
            r10 = -1
        L_0x00ff:
            if (r12 == 0) goto L_0x013f
            r9 = 1
            if (r12 == r9) goto L_0x013f
            r9 = 2
            if (r12 == r9) goto L_0x013f
            r9 = 3
            if (r12 == r9) goto L_0x010b
            goto L_0x0141
        L_0x010b:
            r9 = -1
            if (r15 == r9) goto L_0x0141
            r12 = r17
            if (r12 == r9) goto L_0x0143
            if (r10 == r9) goto L_0x0143
            ps2.u$b r9 = new ps2.u$b     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r9.<init>()     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            ps2.C100894u.C100896b.m132249a(r9, r15)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            ps2.C100894u.C100896b.m132250b(r9, r12)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            ps2.C100894u.C100896b.m132251c(r9, r10)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            java.util.Set<ps2.u$b> r10 = f295460a     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            java.util.HashSet r10 = (java.util.HashSet) r10     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r10.add(r9)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r10.<init>()     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            java.lang.String r11 = "valid canvas type "
            r10.append(r11)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r10.append(r9)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            java.lang.String r9 = r10.toString()     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            goto L_0x0143
        L_0x013f:
            r12 = r10
            goto L_0x0143
        L_0x0141:
            r12 = r17
        L_0x0143:
            r16 = r15
            goto L_0x0148
        L_0x0146:
            r12 = r17
        L_0x0148:
            int r15 = r0.next()     // Catch:{ IOException -> 0x0159, XmlPullParserException -> 0x0157 }
            r17 = r12
            r9 = 1
            r10 = -1
            r11 = 0
            r12 = 2
            goto L_0x00a8
        L_0x0154:
            if (r14 == 0) goto L_0x0178
            goto L_0x0175
        L_0x0157:
            r0 = move-exception
            goto L_0x0160
        L_0x0159:
            r0 = move-exception
            goto L_0x016c
        L_0x015b:
            r0 = move-exception
            r11 = 0
            goto L_0x017e
        L_0x015e:
            r0 = move-exception
            r14 = 0
        L_0x0160:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x017c }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x017c }
            if (r14 == 0) goto L_0x0178
            goto L_0x0175
        L_0x016a:
            r0 = move-exception
            r14 = 0
        L_0x016c:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)     // Catch:{ all -> 0x017c }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r0)     // Catch:{ all -> 0x017c }
            if (r14 == 0) goto L_0x0178
        L_0x0175:
            r14.close()     // Catch:{ IOException -> 0x0178 }
        L_0x0178:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            goto L_0x0187
        L_0x017c:
            r0 = move-exception
            r11 = r14
        L_0x017e:
            if (r11 == 0) goto L_0x0183
            r11.close()     // Catch:{ IOException -> 0x0183 }
        L_0x0183:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            throw r0
        L_0x0187:
            java.util.Set<ps2.u$b> r0 = f295460a
            if (r0 == 0) goto L_0x03d1
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03d1
            r9 = 0
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r2, r9)
            if (r0 == 0) goto L_0x03b6
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L_0x01a2
            goto L_0x03b6
        L_0x01a2:
            ps2.u$b r9 = new ps2.u$b
            r9.<init>()
            r10 = 0
            ps2.C100894u.C100896b.m132249a(r9, r10)
            java.lang.String r10 = ".adCanvasInfo.type"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)
            ps2.C100894u.C100896b.m132250b(r9, r10)
            java.lang.String r10 = ".adCanvasInfo.subtype"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r10 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r10)
            ps2.C100894u.C100896b.m132251c(r9, r10)
            java.util.Set<ps2.u$b> r10 = f295460a
            java.util.HashSet r10 = (java.util.HashSet) r10
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x01ee
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "invalid canvas type "
            r0.append(r10)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
        L_0x01ea:
            r17 = r3
            goto L_0x03dc
        L_0x01ee:
            java.lang.String r10 = ".adCanvasInfo.PageList.Page"
            r11 = 0
        L_0x01f1:
            r12 = 1
            ps2.C100894u.C100896b.m132249a(r9, r12)
            if (r11 != 0) goto L_0x01f9
            r13 = r10
            goto L_0x0208
        L_0x01f9:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r10)
            r13.append(r11)
            java.lang.String r13 = r13.toString()
        L_0x0208:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            java.lang.String r15 = ".componentItemList.componentItem.type"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            boolean r14 = r0.containsKey(r14)
            java.lang.String r15 = "invalid component type "
            java.lang.String r12 = ".subType"
            r16 = r10
            java.lang.String r10 = ".type"
            if (r14 != 0) goto L_0x02ac
            r14 = 2
            ps2.C100894u.C100896b.m132249a(r9, r14)
            java.util.Set r11 = r0.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0234:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x02a4
            java.lang.Object r13 = r11.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r14 = r13.getKey()
            if (r14 == 0) goto L_0x0234
            java.lang.Object r14 = r13.getKey()
            java.lang.String r14 = (java.lang.String) r14
            r16 = r11
            java.lang.String r11 = "[\\s\\S]*\\.componentItem[0-9]*\\.type$"
            boolean r11 = r14.matches(r11)
            if (r11 == 0) goto L_0x02a1
            java.lang.Object r11 = r13.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r13 = r13.getKey()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = r13.replace(r10, r12)
            java.lang.Object r11 = r0.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r11)
            ps2.C100894u.C100896b.m132250b(r9, r11)
            java.lang.Object r11 = r0.get(r13)
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r11)
            ps2.C100894u.C100896b.m132251c(r9, r11)
            java.util.Set<ps2.u$b> r11 = f295460a
            java.util.HashSet r11 = (java.util.HashSet) r11
            boolean r11 = r11.contains(r9)
            if (r11 != 0) goto L_0x02a1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x01ea
        L_0x02a1:
            r11 = r16
            goto L_0x0234
        L_0x02a4:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            r17 = r3
            r9 = 1
            goto L_0x03dd
        L_0x02ac:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r10)
            java.lang.String r14 = r14.toString()
            java.lang.Object r14 = r0.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r14)
            ps2.C100894u.C100896b.m132250b(r9, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            java.lang.Object r14 = r0.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            int r14 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r14)
            ps2.C100894u.C100896b.m132251c(r9, r14)
            java.util.Set<ps2.u$b> r14 = f295460a
            java.util.HashSet r14 = (java.util.HashSet) r14
            boolean r14 = r14.contains(r9)
            if (r14 != 0) goto L_0x0308
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "invalid page type "
            r0.append(r10)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x01ea
        L_0x0308:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            java.lang.String r13 = ".componentItemList.componentItem"
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r14 = 2
            ps2.C100894u.C100896b.m132249a(r9, r14)
            r14 = 0
        L_0x031e:
            if (r14 != 0) goto L_0x0326
            r17 = r3
            r3 = r13
            r18 = r3
            goto L_0x0339
        L_0x0326:
            r17 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            r18 = r13
        L_0x0339:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            boolean r13 = r0.containsKey(r13)
            if (r13 != 0) goto L_0x0356
            int r11 = r11 + 1
            r10 = r16
            r3 = r17
            goto L_0x01f1
        L_0x0356:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            java.lang.Object r13 = r0.get(r13)
            java.lang.String r13 = (java.lang.String) r13
            int r13 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r13)
            ps2.C100894u.C100896b.m132250b(r9, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r3)
            r13.append(r12)
            java.lang.String r3 = r13.toString()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            ps2.C100894u.C100896b.m132251c(r9, r3)
            java.util.Set<ps2.u$b> r3 = f295460a
            java.util.HashSet r3 = (java.util.HashSet) r3
            boolean r3 = r3.contains(r9)
            if (r3 != 0) goto L_0x03ae
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r15)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x03dc
        L_0x03ae:
            int r14 = r14 + 1
            r3 = r17
            r13 = r18
            goto L_0x031e
        L_0x03b6:
            r17 = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "invalid landingpages xml,"
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x03dc
        L_0x03d1:
            r17 = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
            goto L_0x03dc
        L_0x03d7:
            r17 = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r4)
        L_0x03dc:
            r9 = 0
        L_0x03dd:
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r5
            if (r1 == 0) goto L_0x03e9
            int r0 = r19.length()
            goto L_0x03ea
        L_0x03e9:
            r0 = 0
        L_0x03ea:
            boolean r3 = m132230j()
            if (r3 == 0) goto L_0x0424
            if (r1 == 0) goto L_0x0424
            if (r2 == 0) goto L_0x0424
            com.tencent.mm.plugin.sns.storage.ADXml r3 = com.tencent.p014mm.plugin.sns.storage.AdSnsInfo.getADXmlCache(r19)
            if (r3 == 0) goto L_0x0424
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "write xml cache len = "
            r5.append(r6)
            int r1 = r19.length()
            r5.append(r1)
            java.lang.String r1 = " result = "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = r3.adCanvasValidMap
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r1.put(r2, r3)
        L_0x0424:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ""
            r1.append(r3)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "landing_page_valid_canvas_cost"
            r5 = 0
            vr2.C37817q.m41546b(r3, r1, r0, r5, r2)
            r1 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ps2.C100894u.m132240t(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: u */
    public static boolean m132241u(ADXml aDXml, String str) {
        SnsMethodCalculate.markStartTimeMs("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (aDXml == null) {
            SnsMethodCalculate.markEndTimeMs("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        String str2 = aDXml.xml;
        if (Util.isNullOrNil(str2, str)) {
            SnsMethodCalculate.markEndTimeMs("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        } else if (!str2.contains("<adCanvasInfoLeft>")) {
            SnsMethodCalculate.markEndTimeMs("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        } else {
            boolean s = m132239s(str);
            SnsMethodCalculate.markEndTimeMs("isValidLeftCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return s;
        }
    }

    /* renamed from: v */
    public static boolean m132242v(ADXml aDXml, String str) {
        SnsMethodCalculate.markStartTimeMs("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        if (aDXml == null) {
            SnsMethodCalculate.markEndTimeMs("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        String str2 = aDXml.xml;
        if (Util.isNullOrNil(str2, str)) {
            SnsMethodCalculate.markEndTimeMs("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        } else if (!str2.contains("<adCanvasInfoRight>")) {
            SnsMethodCalculate.markEndTimeMs("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        } else {
            boolean s = m132239s(str);
            SnsMethodCalculate.markEndTimeMs("isValidRightCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return s;
        }
    }

    /* renamed from: w */
    public static boolean m132243w(String str, String str2, Context context, boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("jumpToShareWebUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        Map<String, String> parseXml = XmlParser.parseXml(str, C102646h.COL_ADXML, (String) null);
        String str3 = parseXml.get(".adxml.adCanvasInfo.shareWebUrl");
        String str4 = parseXml.get(".adxml.originUxInfo");
        if (TextUtils.isEmpty(str3)) {
            SnsMethodCalculate.markEndTimeMs("jumpToShareWebUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return false;
        }
        if (z) {
            try {
                str3 = m132224d(str3, "exp=_" + i);
            } catch (URISyntaxException unused) {
            }
            Log.m105924i("AdLandingPagesParseHelper", "canvas jump url " + str3);
        }
        if (!Util.isNullOrNil(str4)) {
            str3 = C102236a0.m134734b(str3, str4);
        }
        Log.m105924i("AdLandingPagesParseHelper", "adshare canvas jump url with uxinfo " + str3);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str3);
        intent.putExtra("showShare", true);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        SnsMethodCalculate.markEndTimeMs("jumpToShareWebUrl", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return true;
    }

    /* renamed from: x */
    public static boolean m132244x(TimeLineObject timeLineObject, Activity activity, int i, boolean z) {
        TimeLineObject timeLineObject2 = timeLineObject;
        Activity activity2 = activity;
        SnsMethodCalculate.markStartTimeMs("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        String str = timeLineObject2.canvasInfo;
        long longValue = new BigInteger(timeLineObject2.f283893Id).longValue();
        LinkedList<C101804kv2> linkedList = timeLineObject2.ContentObj.f298427h;
        SnsMethodCalculate.markStartTimeMs("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        boolean z2 = false;
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str) || !m132239s(str)) {
                Log.m105925i("AdLandingPagesParseHelper", "invalid canvas xml %s", str);
            } else {
                m132238r(str, C102646h.COL_ADXML);
                SnsInfo SE = C94866e1.Yx0().mo139806SE(longValue);
                Intent intent = new Intent();
                if (SE != null) {
                    intent.putExtra("sns_landing_pages_share_sns_id", SE.getSnsId());
                    intent.putExtra("sns_landing_pages_rawSnsId", SE.getTimeLine().f283893Id);
                    intent.putExtra("sns_landing_pages_ux_info", SE.getUxinfo());
                    intent.putExtra("sns_landing_pages_aid", SE.getAid());
                    intent.putExtra("sns_landing_pages_traceid", SE.getTraceid());
                    intent.putExtra("sns_landing_pages_rec_src", SE.getAdRecSrc());
                }
                if (linkedList != null && linkedList.size() > 0) {
                    intent.putExtra("sns_landing_pages_share_thumb_url", linkedList.get(0).f298694i);
                }
                intent.putExtra("sns_landing_pages_expid", "");
                intent.putExtra("sns_landig_pages_from_source", i);
                intent.setClass(activity, SnsAdNativeLandingPagesUI.class);
                intent.putExtra("sns_landing_pages_xml", str);
                intent.putExtra("sns_landing_pages_xml_prefix", C102646h.COL_ADXML);
                intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", z);
                intent.putExtra("sns_landing_page_start_time", System.currentTimeMillis());
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper", "openCanvas", "(Ljava/lang/String;JLjava/util/List;Landroid/app/Activity;IZ)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper", "openCanvas", "(Ljava/lang/String;JLjava/util/List;Landroid/app/Activity;IZ)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                z2 = true;
                SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
                return z2;
            }
        }
        SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        SnsMethodCalculate.markEndTimeMs("openCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return z2;
    }

    /* renamed from: y */
    public static Intent m132245y(Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("parseAppMarketIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        C91098a g = C91098a.m114283g(MMApplicationContext.getContext(), map);
        if (g != null) {
            Intent i = g.mo125157i();
            SnsMethodCalculate.markEndTimeMs("parseAppMarketIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
            return i;
        }
        SnsMethodCalculate.markEndTimeMs("parseAppMarketIntent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        return null;
    }

    /* renamed from: z */
    public static void m132246z(C101255a0 a0Var, Map<String, String> map, String str, int i, int i2, int i3) {
        C101255a0 a0Var2 = a0Var;
        Map<String, String> map2 = map;
        String str2 = str;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        SnsMethodCalculate.markStartTimeMs("parseBaseInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
        int safeParseInt = Util.safeParseInt(map2.get(str2 + ".type"));
        a0Var2.f296496b = safeParseInt;
        a0Var2.f296505k = safeParseInt;
        a0Var2.f296495a = Util.nullAs(map2.get(str2 + ".id"), "");
        a0Var2.f296497c = m132234n(Util.safeParseDouble(map2.get(str2 + ".paddingTop")), i4, i5, i6);
        a0Var2.f296498d = m132234n(Util.safeParseDouble(map2.get(str2 + ".paddingBottom")), i4, i5, i6);
        a0Var2.f296499e = m132234n(Util.safeParseDouble(map2.get(str2 + ".paddingLeft")), i4, i5, i6);
        a0Var2.f296500f = m132234n(Util.safeParseDouble(map2.get(str2 + ".paddingRight")), i4, i5, i6);
        a0Var2.f296504j = Util.safeParseInt(map2.get(str2 + ".subType"));
        a0Var2.f296506l = Util.nullAs(map2.get(str2 + ".cellBackgroundColor"), "");
        String str3 = str2 + ".if";
        if (map2.containsKey(str3)) {
            a0Var2.f296511q = "1".equals(map2.get(str3));
        } else {
            a0Var2.f296511q = true;
        }
        String str4 = str2 + ".noReport";
        if (map2.containsKey(str4)) {
            a0Var2.f296512r = "1".equals(map2.get(str4));
        } else {
            a0Var2.f296512r = false;
        }
        String nullAs = Util.nullAs(map2.get(str2 + ".layoutWidth"), "");
        String nullAs2 = Util.nullAs(map2.get(str2 + ".layoutHeight"), "");
        if (!TextUtils.isEmpty(nullAs)) {
            double safeParseDouble = Util.safeParseDouble(nullAs);
            if (safeParseDouble < 0.0d) {
                a0Var2.f296501g = (float) safeParseDouble;
            } else {
                a0Var2.f296501g = m132234n(safeParseDouble, i4, i5, i6);
            }
        } else {
            a0Var2.f296501g = 2.14748365E9f;
        }
        if (!TextUtils.isEmpty(nullAs2)) {
            double safeParseDouble2 = Util.safeParseDouble(nullAs2);
            if (safeParseDouble2 < 0.0d) {
                a0Var2.f296502h = (float) safeParseDouble2;
            } else {
                a0Var2.f296502h = m132234n(safeParseDouble2, i4, i5, i6);
            }
        } else {
            a0Var2.f296502h = 2.14748365E9f;
        }
        String str5 = map2.get(str2 + ".verticalAlignment");
        String str6 = map2.get(str2 + ".horizontalAlignment");
        if (TextUtils.isEmpty(str5)) {
            a0Var2.f296509o = -1;
        } else {
            a0Var2.f296509o = Util.safeParseInt(str5);
        }
        if (TextUtils.isEmpty(str6)) {
            a0Var2.f296510p = -1;
        } else {
            a0Var2.f296510p = Util.safeParseInt(str6);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(".isTwistAnimView");
        a0Var2.f296513s = Util.safeParseInt(map2.get(sb.toString())) == 1;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(".isDefaultTwistCard");
        a0Var2.f296514t = Util.safeParseInt(map2.get(sb4.toString())) == 1;
        a0Var2.f296515u = Util.nullAsNil(map2.get(str2 + ".twistCardId"));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append(".isShakeAnimView");
        a0Var2.f296516v = Util.safeParseInt(map2.get(sb5.toString())) == 1;
        a0Var2.f296517w = Util.nullAsNil(map2.get(str2 + ".jumpExtInfo"));
        String str7 = str2 + ".fileSize";
        if (map2.containsKey(str7)) {
            a0Var2.f296518x = Util.safeParseInt(map2.get(str7));
        }
        if (a0Var2.f296496b == 148) {
            a0Var2.f296502h = (float) C76577a.m92151b(MMApplicationContext.getContext(), 1);
        }
        SnsMethodCalculate.markEndTimeMs("parseBaseInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper");
    }

    /* renamed from: ps2.u$a */
    public static class C100895a {

        /* renamed from: a */
        public LinkedList<C100882l> f295461a = new LinkedList<>();

        /* renamed from: b */
        public C101263e0 f295462b = null;

        /* renamed from: c */
        public C101262e f295463c = null;

        /* renamed from: d */
        public C101675j f295464d = null;

        /* renamed from: e */
        public C92435h f295465e = null;

        /* renamed from: f */
        public C101676k f295466f = null;

        /* renamed from: g */
        public C101665a f295467g = null;

        /* renamed from: h */
        public C101286q0 f295468h;

        /* renamed from: i */
        public long f295469i = 0;

        public C100895a(String str, String str2) {
            long currentTimeMillis = System.currentTimeMillis();
            mo140358a(str, str2, (Context) null);
            this.f295469i = System.currentTimeMillis() - currentTimeMillis;
            Log.m105924i("AdLandingPagesParseHelper", "parse adlanding xml, timeCost=" + this.f295469i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:111:0x0382  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x038e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x03aa  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x03ac  */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x03f7  */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x0456  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x0458  */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x0476  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x049e  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x052a  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x0333 A[EDGE_INSN: B:192:0x0333->B:98:0x0333 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x03dc A[EDGE_INSN: B:197:0x03dc->B:123:0x03dc ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x046e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01f7  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x020d  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x020f  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x027b  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x027d  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0299  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x02a6  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x02ac  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x02b7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo140358a(java.lang.String r27, java.lang.String r28, android.content.Context r29) {
            /*
                r26 = this;
                r1 = r26
                r2 = r28
                java.lang.String r3 = "parseADLandingPageInfos"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$AdLandingPagesParser"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                boolean r0 = android.text.TextUtils.isEmpty(r27)
                if (r0 == 0) goto L_0x0016
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                return
            L_0x0016:
                java.lang.String r0 = "replaceDynamicValue"
                java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
                boolean r6 = android.text.TextUtils.isEmpty(r27)
                java.lang.String r7 = ""
                if (r6 == 0) goto L_0x002c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
                r6 = r27
                goto L_0x0037
            L_0x002c:
                java.lang.String r6 = "\\{\\{.*?\\}\\}"
                r8 = r27
                java.lang.String r6 = r8.replaceAll(r6, r7)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            L_0x0037:
                r8 = 0
                java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r2, r8)
                java.lang.String r9 = "AdLandingPagesParseHelper"
                if (r0 != 0) goto L_0x0058
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = " parse landingpages xml is error ,"
                r0.append(r2)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                return
            L_0x0058:
                java.lang.String r6 = "."
                if (r29 == 0) goto L_0x0166
                boolean r10 = fp2.C32156g.m39639a()
                if (r10 == 0) goto L_0x0166
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r6)
                r10.append(r2)
                java.lang.String r11 = ".adCanvasInfo"
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                fp2.f r11 = fp2.C87070f.f252656a
                java.lang.String r11 = "convertAdLandingPageValuesIfNeed"
                java.lang.String r12 = "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushSnsAdBizManager"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r12)
                boolean r13 = fp2.C32156g.m39639a()
                java.lang.String r14 = "SnsAdMB"
                if (r13 != 0) goto L_0x0096
                java.lang.String r10 = "magic brush switch is off, return directly"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
            L_0x0090:
                r17 = r3
                r22 = r5
                goto L_0x0164
            L_0x0096:
                if (r10 != 0) goto L_0x00a2
                java.lang.String r10 = "the prefix values is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r10)     // Catch:{ Exception -> 0x0153 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ Exception -> 0x0153 }
                goto L_0x0090
            L_0x00a2:
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
                r13.<init>()     // Catch:{ Exception -> 0x0153 }
                r13.append(r10)     // Catch:{ Exception -> 0x0153 }
                java.lang.String r15 = ".mbInfo"
                r13.append(r15)     // Catch:{ Exception -> 0x0153 }
                java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x0153 }
                java.lang.Object r13 = r0.get(r13)     // Catch:{ Exception -> 0x0153 }
                java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0153 }
                if (r13 != 0) goto L_0x00c5
                java.lang.String r10 = "there is no mb info"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)     // Catch:{ Exception -> 0x0153 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ Exception -> 0x0153 }
                goto L_0x0090
            L_0x00c5:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
                r15.<init>()     // Catch:{ Exception -> 0x0153 }
                r15.append(r10)     // Catch:{ Exception -> 0x0153 }
                java.lang.String r10 = ".id"
                r15.append(r10)     // Catch:{ Exception -> 0x0153 }
                java.lang.String r10 = r15.toString()     // Catch:{ Exception -> 0x0153 }
                java.lang.Object r10 = r0.get(r10)     // Catch:{ Exception -> 0x0153 }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0153 }
                if (r10 != 0) goto L_0x00e8
                java.lang.String r10 = "there is no canvasId, are you sure?"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)     // Catch:{ Exception -> 0x0153 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ Exception -> 0x0153 }
                goto L_0x0090
            L_0x00e8:
                int r21 = r29.hashCode()     // Catch:{ Exception -> 0x0153 }
                java.util.Map<java.lang.Integer, fp2.b> r15 = fp2.C87070f.f252657b     // Catch:{ Exception -> 0x0153 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x0153 }
                r22 = r5
                r5 = r15
                java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5     // Catch:{ Exception -> 0x014e }
                java.lang.Object r5 = r5.get(r8)     // Catch:{ Exception -> 0x014e }
                fp2.b r5 = (fp2.C87066b) r5     // Catch:{ Exception -> 0x014e }
                if (r5 != 0) goto L_0x011d
                java.lang.String r5 = "new magic brush manager data."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)     // Catch:{ Exception -> 0x014e }
                fp2.b r5 = new fp2.b     // Catch:{ Exception -> 0x014e }
                r17 = 0
                r18 = 0
                r19 = 6
                r20 = 0
                r8 = r15
                r15 = r5
                r16 = r21
                r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x014e }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x014e }
                r8.put(r15, r5)     // Catch:{ Exception -> 0x014e }
            L_0x011d:
                java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x014e }
                r8.<init>()     // Catch:{ Exception -> 0x014e }
                r8.putAll(r0)     // Catch:{ Exception -> 0x014e }
                ip2.a r15 = r5.mo121532a()     // Catch:{ Exception -> 0x014e }
                if (r15 != 0) goto L_0x0142
                ip2.a r15 = new ip2.a     // Catch:{ Exception -> 0x014e }
                r15.<init>()     // Catch:{ Exception -> 0x014e }
                r16 = r0
                java.lang.String r0 = "setMbInfoHelper"
                r17 = r3
                java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.magicbrush.MagicBrushData"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)     // Catch:{ Exception -> 0x0159 }
                r5.f252649c = r15     // Catch:{ Exception -> 0x0159 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)     // Catch:{ Exception -> 0x0159 }
                goto L_0x0146
            L_0x0142:
                r16 = r0
                r17 = r3
            L_0x0146:
                r15.mo138154a(r10, r13, r8)     // Catch:{ Exception -> 0x0159 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)     // Catch:{ Exception -> 0x0159 }
                r0 = r8
                goto L_0x0164
            L_0x014e:
                r16 = r0
            L_0x0150:
                r17 = r3
                goto L_0x0159
            L_0x0153:
                r16 = r0
                r17 = r3
                r22 = r5
            L_0x0159:
                java.lang.String r0 = "there"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r12)
                r0 = r16
            L_0x0164:
                r3 = r0
                goto L_0x016e
            L_0x0166:
                r16 = r0
                r17 = r3
                r22 = r5
                r3 = r16
            L_0x016e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r0.append(r2)
                java.lang.String r5 = ".adCanvasInfo.sizeType"
                r0.append(r5)
                java.lang.String r0 = r0.toString()
                java.lang.Object r0 = r3.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                int r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r0.append(r2)
                java.lang.String r8 = ".adCanvasInfo.basicRootFontSize"
                r0.append(r8)
                java.lang.String r0 = r0.toString()
                java.lang.Object r0 = r3.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r6)
                r8.append(r2)
                java.lang.String r10 = ".adCanvasInfo.basicWidth"
                r8.append(r10)
                java.lang.String r8 = r8.toString()
                java.lang.Object r8 = r3.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                int r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r8)
                r15 = 1
                if (r0 != 0) goto L_0x01d2
                if (r5 != r15) goto L_0x01d2
                r0 = 10
                r16 = 10
                goto L_0x01d4
            L_0x01d2:
                r16 = r0
            L_0x01d4:
                if (r8 != 0) goto L_0x01da
                if (r5 != r15) goto L_0x01da
                r8 = 750(0x2ee, float:1.051E-42)
            L_0x01da:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                co2.h r0 = co2.C92435h.m116268b(r3, r0, r15)
                r1.f295465e = r0
                java.lang.String r0 = ".adCanvasInfo.PageList.Page"
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)
                if (r10 != 0) goto L_0x0209
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r6)
                r10.append(r2)
                r10.append(r0)
                java.lang.String r0 = r10.toString()
            L_0x0209:
                r14 = r0
                r12 = 0
            L_0x020b:
                if (r12 != 0) goto L_0x020f
                r11 = r14
                goto L_0x021f
            L_0x020f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r14)
                r0.append(r12)
                java.lang.String r0 = r0.toString()
                r11 = r0
            L_0x021f:
                ps2.l r10 = new ps2.l
                r10.<init>()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                java.lang.String r13 = ".backgroundCover"
                r0.append(r13)
                java.lang.String r0 = r0.toString()
                java.lang.Object r0 = r3.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
                r10.f295426a = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                java.lang.String r13 = ".backgroundColor"
                r0.append(r13)
                java.lang.String r0 = r0.toString()
                java.lang.Object r0 = r3.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r0, (java.lang.String) r7)
                r10.f295427b = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                java.lang.String r13 = ".backgroundCover.$isAddBlur"
                r0.append(r13)
                java.lang.String r0 = r0.toString()
                java.lang.Object r0 = r3.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
                if (r0 <= 0) goto L_0x027d
                r0 = 1
                goto L_0x027e
            L_0x027d:
                r0 = 0
            L_0x027e:
                r10.f295428c = r0
                r10.f295432g = r12
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                java.lang.String r13 = ".if"
                r0.append(r13)
                java.lang.String r0 = r0.toString()
                boolean r13 = r3.containsKey(r0)
                if (r13 == 0) goto L_0x02a6
                java.lang.Object r0 = r3.get(r0)
                java.lang.String r13 = "1"
                boolean r0 = r13.equals(r0)
                r10.f295431f = r0
                goto L_0x02a8
            L_0x02a6:
                r10.f295431f = r15
            L_0x02a8:
                boolean r0 = r10.f295431f
                if (r0 != 0) goto L_0x02b7
                r18 = r6
                r21 = r12
                r25 = r14
                r2 = 1
                r6 = 0
                r14 = r4
                goto L_0x051e
            L_0x02b7:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r11)
                java.lang.String r13 = ".componentItemList.componentItem"
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r18 = r4
                r4 = 0
            L_0x02cb:
                if (r4 != 0) goto L_0x02d0
                r19 = r13
                goto L_0x02e1
            L_0x02d0:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r13)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                r19 = r0
            L_0x02e1:
                java.lang.String r0 = r10.f295427b     // Catch:{ Exception -> 0x0310 }
                boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0310 }
                if (r0 != 0) goto L_0x02f3
                java.lang.String r0 = r10.f295427b     // Catch:{ Exception -> 0x0310 }
                int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x0310 }
                r20 = r4
                r4 = r10
                goto L_0x02f7
            L_0x02f3:
                r20 = r4
                r4 = r10
                r0 = 0
            L_0x02f7:
                r10 = r3
                r2 = r11
                r11 = r5
                r21 = r12
                r12 = r8
                r23 = r6
                r24 = r13
                r6 = 0
                r13 = r16
                r25 = r14
                r14 = r0
                r15 = r19
                qs2.a0 r0 = ps2.C100894u.m132222b(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x030e }
                goto L_0x0331
            L_0x030e:
                r0 = move-exception
                goto L_0x031e
            L_0x0310:
                r0 = move-exception
                r20 = r4
                r23 = r6
                r4 = r10
                r2 = r11
                r21 = r12
                r24 = r13
                r25 = r14
                r6 = 0
            L_0x031e:
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                r14 = 0
                r10 = r3
                r11 = r5
                r12 = r8
                r13 = r16
                r15 = r19
                qs2.a0 r0 = ps2.C100894u.m132222b(r10, r11, r12, r13, r14, r15)
            L_0x0331:
                if (r0 != 0) goto L_0x052a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                java.lang.String r2 = ".forbiddenGlobalItems.id"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r13 = 0
            L_0x0345:
                if (r13 != 0) goto L_0x0349
                r2 = r0
                goto L_0x0358
            L_0x0349:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                r2.append(r13)
                java.lang.String r2 = r2.toString()
            L_0x0358:
                java.lang.Object r2 = r3.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r2, (java.lang.String) r7)
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                if (r10 != 0) goto L_0x0370
                java.util.ArrayList<java.lang.String> r10 = r4.f295434i
                r10.add(r2)
                int r13 = r13 + 1
                goto L_0x0345
            L_0x0370:
                java.util.LinkedList<qs2.a0> r0 = r4.f295429d
                int r0 = r0.size()
                if (r0 != 0) goto L_0x04ec
                java.util.LinkedList<ps2.l> r0 = r1.f295461a
                if (r0 == 0) goto L_0x038e
                int r0 = r0.size()
                if (r0 <= 0) goto L_0x038e
                java.util.LinkedList<ps2.l> r0 = r1.f295461a
                java.lang.Object r0 = r0.get(r6)
                ps2.l r0 = (ps2.C100882l) r0
                r2 = 1
                r0.f295433h = r2
                goto L_0x038f
            L_0x038e:
                r2 = 1
            L_0x038f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r4 = r23
                r0.append(r4)
                r7 = r28
                r0.append(r7)
                java.lang.String r10 = ".adCanvasInfo.globalComponentItems.componentItem"
                r0.append(r10)
                java.lang.String r15 = r0.toString()
                r14 = 0
            L_0x03a8:
                if (r14 != 0) goto L_0x03ac
                r13 = r15
                goto L_0x03bc
            L_0x03ac:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r15)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                r13 = r0
            L_0x03bc:
                r0 = 0
                r10 = r3
                r11 = r5
                r12 = r8
                r29 = r13
                r13 = r16
                r19 = r14
                r14 = r0
                r20 = r15
                r15 = r29
                qs2.a0 r0 = ps2.C100894u.m132222b(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x03d0 }
                goto L_0x03da
            L_0x03d0:
                r0 = move-exception
                r10 = r0
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r10)
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                r0 = 0
            L_0x03da:
                if (r0 != 0) goto L_0x049e
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r10 = "parse the item: the global item is null, globalItemsStr = "
                r0.append(r10)
                r15 = r29
                r0.append(r15)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
                qs2.e0 r0 = r1.f295462b
                if (r0 == 0) goto L_0x0440
                java.util.LinkedList<ps2.l> r0 = r1.f295461a
                java.util.Iterator r0 = r0.iterator()
            L_0x03fd:
                boolean r10 = r0.hasNext()
                if (r10 == 0) goto L_0x0440
                java.lang.Object r10 = r0.next()
                ps2.l r10 = (ps2.C100882l) r10
                java.util.ArrayList<java.lang.String> r11 = r10.f295434i
                int r11 = r11.size()
                if (r11 <= 0) goto L_0x03fd
                java.util.ArrayList<java.lang.String> r11 = r10.f295434i
                java.util.Iterator r11 = r11.iterator()
            L_0x0417:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x03fd
                java.lang.Object r12 = r11.next()
                java.lang.String r12 = (java.lang.String) r12
                boolean r13 = android.text.TextUtils.isEmpty(r12)
                if (r13 != 0) goto L_0x0417
                qs2.e0 r13 = r1.f295462b
                java.lang.String r13 = r13.f296495a
                boolean r13 = android.text.TextUtils.isEmpty(r13)
                if (r13 != 0) goto L_0x0417
                qs2.e0 r13 = r1.f295462b
                java.lang.String r13 = r13.f296495a
                boolean r12 = r12.equals(r13)
                if (r12 == 0) goto L_0x0417
                r10.f295435j = r2
                goto L_0x03fd
            L_0x0440:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                r0.append(r7)
                java.lang.String r2 = ".adCanvasInfo.fixedBottomItems.componentItem"
                r0.append(r2)
                java.lang.String r2 = r0.toString()
            L_0x0454:
                if (r6 != 0) goto L_0x0458
                r15 = r2
                goto L_0x0468
            L_0x0458:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                r15 = r0
            L_0x0468:
                boolean r0 = r3.containsKey(r15)
                if (r0 != 0) goto L_0x0476
                r4 = r17
                r7 = r18
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
                return
            L_0x0476:
                r4 = r17
                r7 = r18
                r14 = 0
                r10 = r3
                r11 = r5
                r12 = r8
                r13 = r16
                qs2.a0 r0 = ps2.C100894u.m132222b(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0485 }
                goto L_0x048f
            L_0x0485:
                r0 = move-exception
                r10 = r0
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r10)
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)
                r0 = 0
            L_0x048f:
                boolean r10 = r0 instanceof qs2.C101286q0
                if (r10 == 0) goto L_0x0497
                qs2.q0 r0 = (qs2.C101286q0) r0
                r1.f295468h = r0
            L_0x0497:
                int r6 = r6 + 1
                r17 = r4
                r18 = r7
                goto L_0x0454
            L_0x049e:
                r15 = r29
                r14 = r18
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "parse the item: the global item existed, globalItemsStr = "
                r10.append(r11)
                r10.append(r15)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r10)
                boolean r10 = r0 instanceof qs2.C101263e0
                if (r10 == 0) goto L_0x04c0
                r10 = r0
                qs2.e0 r10 = (qs2.C101263e0) r10
                r1.f295462b = r10
            L_0x04c0:
                boolean r10 = r0 instanceof qs2.C101262e
                if (r10 == 0) goto L_0x04c9
                r10 = r0
                qs2.e r10 = (qs2.C101262e) r10
                r1.f295463c = r10
            L_0x04c9:
                boolean r10 = r0 instanceof so2.C101675j
                if (r10 == 0) goto L_0x04d2
                r10 = r0
                so2.j r10 = (so2.C101675j) r10
                r1.f295464d = r10
            L_0x04d2:
                boolean r10 = r0 instanceof so2.C101676k
                if (r10 == 0) goto L_0x04db
                r10 = r0
                so2.k r10 = (so2.C101676k) r10
                r1.f295466f = r10
            L_0x04db:
                boolean r10 = r0 instanceof so2.C101665a
                if (r10 == 0) goto L_0x04e3
                so2.a r0 = (so2.C101665a) r0
                r1.f295467g = r0
            L_0x04e3:
                int r0 = r19 + 1
                r18 = r14
                r15 = r20
                r14 = r0
                goto L_0x03a8
            L_0x04ec:
                r14 = r18
                r18 = r23
                r2 = 1
                java.util.LinkedList<ps2.l> r0 = r1.f295461a
                r0.add(r4)
                java.util.LinkedList<ps2.l> r0 = r1.f295461a
                int r0 = r0.size()
                int r0 = r0 - r2
                java.lang.String r10 = "processCompInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r14)
                java.util.LinkedList<qs2.a0> r4 = r4.f295429d
                if (r4 == 0) goto L_0x051b
                java.util.Iterator r4 = r4.iterator()
            L_0x050b:
                boolean r11 = r4.hasNext()
                if (r11 == 0) goto L_0x051b
                java.lang.Object r11 = r4.next()
                qs2.a0 r11 = (qs2.C101255a0) r11
                r1.mo140359b(r11, r0)
                goto L_0x050b
            L_0x051b:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r14)
            L_0x051e:
                int r12 = r21 + 1
                r2 = r28
                r4 = r14
                r6 = r18
                r14 = r25
                r15 = 1
                goto L_0x020b
            L_0x052a:
                r14 = r18
                r18 = r23
                r23 = r2
                r2 = 1
                boolean r10 = r0.f296511q
                if (r10 == 0) goto L_0x0560
                java.lang.String r15 = "access$100"
                r13 = r22
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r13)
                r10 = r0
                r11 = r3
                r12 = r19
                r2 = r13
                r13 = r5
                r19 = r14
                r14 = r8
                r6 = r15
                r15 = r16
                ps2.C100894u.m132246z(r10, r11, r12, r13, r14, r15)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r2)
                boolean r6 = r0 instanceof qs2.C101298y
                if (r6 == 0) goto L_0x055a
                java.util.Map<java.lang.String, qs2.a0> r6 = r4.f295430e
                java.lang.String r10 = r0.f296495a
                r6.put(r10, r0)
                goto L_0x0581
            L_0x055a:
                java.util.LinkedList<qs2.a0> r6 = r4.f295429d
                r6.add(r0)
                goto L_0x0581
            L_0x0560:
                r19 = r14
                r2 = r22
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r10 = "comp "
                r6.append(r10)
                java.lang.String r0 = r0.toString()
                r6.append(r0)
                java.lang.String r0 = " ifCondition is false"
                r6.append(r0)
                java.lang.String r0 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            L_0x0581:
                int r0 = r20 + 1
                r22 = r2
                r10 = r4
                r6 = r18
                r18 = r19
                r12 = r21
                r11 = r23
                r13 = r24
                r14 = r25
                r15 = 1
                r2 = r28
                r4 = r0
                goto L_0x02cb
            */
            throw new UnsupportedOperationException("Method not decompiled: ps2.C100894u.C100895a.mo140358a(java.lang.String, java.lang.String, android.content.Context):void");
        }

        /* renamed from: b */
        public final void mo140359b(C101255a0 a0Var, int i) {
            List<C101255a0> a;
            SnsMethodCalculate.markStartTimeMs("setPageIdxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$AdLandingPagesParser");
            a0Var.f296519y = i;
            if (C100894u.m132237q(a0Var.f296505k) && (a = a0Var.mo140732a()) != null) {
                for (C101255a0 b : a) {
                    mo140359b(b, i);
                }
            }
            SnsMethodCalculate.markEndTimeMs("setPageIdxInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$AdLandingPagesParser");
        }

        public C100895a(String str, String str2, Context context) {
            long currentTimeMillis = System.currentTimeMillis();
            mo140358a(str, str2, context);
            this.f295469i = System.currentTimeMillis() - currentTimeMillis;
            Log.m105924i("AdLandingPagesParseHelper", "parse adlanding xml, timeCost=" + this.f295469i);
        }
    }
}
