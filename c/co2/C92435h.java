package co2;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Map;
import ps2.C118127b0;
import vr2.C102260r;

/* renamed from: co2.h */
public class C92435h {

    /* renamed from: a */
    public int f264511a;
    @C118127b0(resType = 7)

    /* renamed from: b */
    public C92441e f264512b;

    /* renamed from: c */
    public C92440d f264513c;
    @C118127b0(resType = 7)

    /* renamed from: d */
    public C92436a f264514d;
    @C118127b0(resType = 7)

    /* renamed from: e */
    public C92438b f264515e;
    @C118127b0(resType = 7)

    /* renamed from: f */
    public C92439c f264516f;

    /* renamed from: co2.h$a */
    public static class C92436a {

        /* renamed from: a */
        public ArrayList<C92437a> f264517a;
        @C118127b0(resType = 2)

        /* renamed from: b */
        public String f264518b;

        /* renamed from: c */
        public String f264519c;

        /* renamed from: co2.h$a$a */
        public static class C92437a {

            /* renamed from: a */
            public String f264520a;

            /* renamed from: b */
            public String f264521b;
        }

        /* renamed from: a */
        public static C92436a m116269a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
            try {
                String nullAsNil = Util.nullAsNil(map.get(str + ".transitionAnimationUrl"));
                String nullAsNil2 = Util.nullAsNil(map.get(str + ".transitionAnimationMD5"));
                ArrayList<C92437a> arrayList = new ArrayList<>();
                int i = 0;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".transitionImgInfos.transitionImgInfo");
                    String str2 = "";
                    sb.append(i == 0 ? str2 : Integer.valueOf(i));
                    String sb4 = sb.toString();
                    if (!map.containsKey(sb4)) {
                        break;
                    }
                    String nullAsNil3 = Util.nullAsNil(map.get(sb4 + ".transitionImg"));
                    String nullAsNil4 = Util.nullAsNil(map.get(sb4 + ".transitionColor"));
                    str2 = C102260r.m134851T(nullAsNil4, Util.nullAsNil(map.get(sb4 + ".transitionColorAlpha")));
                    if (!TextUtils.isEmpty(nullAsNil3) || !TextUtils.isEmpty(str2)) {
                        C92437a aVar = new C92437a();
                        aVar.f264520a = nullAsNil3;
                        aVar.f264521b = str2;
                        arrayList.add(aVar);
                    }
                    i++;
                }
                if (arrayList.size() > 0) {
                    C92436a aVar2 = new C92436a();
                    aVar2.f264517a = arrayList;
                    aVar2.f264518b = nullAsNil;
                    aVar2.f264519c = nullAsNil2;
                    SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
                    return aVar2;
                }
            } catch (Exception e) {
                Log.m105920e("AdEggAnimationInfo", "parseFromXml ShakeCardInfo parse color exp=" + e.toString());
            } catch (Throwable th) {
                Log.m105920e("AdEggAnimationInfo", "ShakeCardInfo parseFromXml, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$DropCardAnimInfo");
            return null;
        }
    }

    /* renamed from: co2.h$b */
    public static class C92438b {
        @C118127b0(resType = 2)

        /* renamed from: a */
        public String f264522a;

        /* renamed from: b */
        public String f264523b;
    }

    /* renamed from: co2.h$c */
    public static class C92439c {

        /* renamed from: a */
        public int f264524a;

        /* renamed from: b */
        public int f264525b;

        /* renamed from: c */
        public int f264526c;
        @C118127b0(resType = 1)

        /* renamed from: d */
        public String f264527d;
    }

    /* renamed from: co2.h$d */
    public static class C92440d {

        /* renamed from: a */
        public boolean f264528a;
    }

    /* renamed from: co2.h$e */
    public static class C92441e {

        /* renamed from: a */
        public boolean f264529a;
        @C118127b0(resType = 1)

        /* renamed from: b */
        public String f264530b;

        /* renamed from: c */
        public String f264531c;

        /* renamed from: a */
        public static C92441e m116270a(Map<String, String> map, String str) {
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
            if (map.containsKey(str)) {
                C92441e eVar = new C92441e();
                boolean z = true;
                if (Util.safeParseInt(map.get(str + ".clockwise")) != 1) {
                    z = false;
                }
                eVar.f264529a = z;
                eVar.f264530b = Util.nullAsNil(map.get(str + ".transitionImg"));
                String nullAsNil = Util.nullAsNil(map.get(str + ".transitionColor"));
                eVar.f264531c = C102260r.m134851T(nullAsNil, Util.nullAsNil(map.get(str + ".transitionColorAlpha")));
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
                return eVar;
            }
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$TwistCardAnimInfo");
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: co2.h$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: co2.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: co2.h$c} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static co2.C92435h m116267a(java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "doParse"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            co2.h r2 = new co2.h
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r4 = ".animationType"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object r3 = r8.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r3)
            r2.f264511a = r3
            r4 = 1
            if (r3 == r4) goto L_0x01b4
            r5 = 2
            java.lang.String r6 = "parse"
            r7 = 0
            if (r3 == r5) goto L_0x0165
            r4 = 3
            if (r3 == r4) goto L_0x014a
            r4 = 4
            if (r3 == r4) goto L_0x00e2
            r4 = 5
            if (r3 == r4) goto L_0x0040
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        L_0x0040:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = ".randomSpriteAnimInfo"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$RandomSpriteAnimInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            boolean r4 = r8.containsKey(r9)
            if (r4 == 0) goto L_0x00d9
            co2.h$c r7 = new co2.h$c
            r7.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r5 = ".spriteType"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r8.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            r7.f264524a = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r5 = ".spriteSizeType"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r8.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            r7.f264525b = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r5 = ".spriteDuration"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r8.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r4)
            r7.f264526c = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r9 = ".spriteImageUrl"
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r7.f264527d = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L_0x00dc
        L_0x00d9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L_0x00dc:
            r2.f264516f = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x00e2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = ".pagThemeAnimInfo"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$PagThemeAnimInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            boolean r4 = r8.containsKey(r9)
            if (r4 == 0) goto L_0x0141
            co2.h$b r7 = new co2.h$b
            r7.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r5 = ".simpleTransitionAnimationUrl"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object r4 = r8.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            r7.f264522a = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r9 = ".simpleTransitionAnimationMD5"
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            r7.f264523b = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L_0x0144
        L_0x0141:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L_0x0144:
            r2.f264515e = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x014a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = ".dropCardAnimInfo"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            co2.h$a r8 = co2.C92435h.C92436a.m116269a(r8, r9)
            r2.f264514d = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0165:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = ".simpleTwistAnimInfo"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo$SimpleTwistAnimInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r3)
            boolean r5 = r8.containsKey(r9)
            if (r5 == 0) goto L_0x01ab
            co2.h$d r7 = new co2.h$d
            r7.<init>()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            java.lang.String r9 = ".clockwise"
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r8)
            if (r8 != r4) goto L_0x01a4
            goto L_0x01a5
        L_0x01a4:
            r4 = 0
        L_0x01a5:
            r7.f264528a = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
            goto L_0x01ae
        L_0x01ab:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r3)
        L_0x01ae:
            r2.f264513c = r7
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x01b4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r9)
            java.lang.String r9 = ".hugeDiskInfo"
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            co2.h$e r8 = co2.C92435h.C92441e.m116270a(r8, r9)
            r2.f264512b = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: co2.C92435h.m116267a(java.util.Map, java.lang.String):co2.h");
    }

    /* renamed from: b */
    public static C92435h m116268b(Map<String, String> map, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        if (map == null || map.size() == 0 || TextUtils.isEmpty(str)) {
            SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
            return null;
        }
        if (i == 2) {
            String str2 = str + ".adCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str2)) {
                C92435h a = m116267a(map, str2);
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a;
            }
            String str3 = str + ".adFullCardGestureCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str3)) {
                C92435h a2 = m116267a(map, str3);
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a2;
            }
        } else {
            String str4 = str + ".adCanvasInfo.eggAnimationInfo";
            if (map.containsKey(str4)) {
                C92435h a3 = m116267a(map, str4);
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
                return a3;
            }
        }
        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.ad.adxml.AdEggAnimationInfo");
        return null;
    }
}
