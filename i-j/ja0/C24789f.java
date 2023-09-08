package ja0;

import com.tencent.maas.analytics.MJAnalyticsS12;
import com.tencent.p014mm.autogen.mmdata.rpt.MaasRecommendReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import z04.C112551y;

/* renamed from: ja0.f */
public final class C24789f {

    /* renamed from: a */
    public static final C24789f f70694a = new C24789f();

    /* renamed from: b */
    public static MaasRecommendReportStruct f70695b = new MaasRecommendReportStruct();

    /* renamed from: c */
    public static boolean f70696c;

    /* renamed from: d */
    public static final List<String> f70697d = new ArrayList();

    /* renamed from: e */
    public static List<? extends JSONObject> f70698e = C64186f0.f181907d;

    /* renamed from: f */
    public static final List<C24791a> f70699f = new ArrayList();

    /* renamed from: ja0.f$b */
    public /* synthetic */ class C24790b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70700a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f70701b;

        static {
            int[] iArr = new int[MJAnalyticsS12.MJAnalyticsMusicSourceType.values().length];
            iArr[MJAnalyticsS12.MJAnalyticsMusicSourceType.RECOMMEND.ordinal()] = 1;
            iArr[MJAnalyticsS12.MJAnalyticsMusicSourceType.OTHERS.ordinal()] = 2;
            iArr[MJAnalyticsS12.MJAnalyticsMusicSourceType.TEMPLATE.ordinal()] = 3;
            f70700a = iArr;
            int[] iArr2 = new int[MJAnalyticsS12.MJAnalyticsTemplateSourceType.values().length];
            iArr2[MJAnalyticsS12.MJAnalyticsTemplateSourceType.UNKNOWN.ordinal()] = 1;
            iArr2[MJAnalyticsS12.MJAnalyticsTemplateSourceType.FIXED.ordinal()] = 2;
            iArr2[MJAnalyticsS12.MJAnalyticsTemplateSourceType.RECOMMEND_V2.ordinal()] = 3;
            iArr2[MJAnalyticsS12.MJAnalyticsTemplateSourceType.RECOMMEND_V3.ordinal()] = 4;
            f70701b = iArr2;
        }
    }

    /* renamed from: ja0.f$a */
    public static final class C24791a {

        /* renamed from: a */
        public final String f70702a;

        /* renamed from: b */
        public final List<String> f70703b;

        public C24791a(String str, List<String> list) {
            C87412m.m108594g(str, "tmplId");
            C87412m.m108594g(list, "exposeMusic");
            this.f70702a = str;
            this.f70703b = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24791a)) {
                return false;
            }
            C24791a aVar = (C24791a) obj;
            return C87412m.m108589b(this.f70702a, aVar.f70702a) && C87412m.m108589b(this.f70703b, aVar.f70703b);
        }

        public int hashCode() {
            return (this.f70702a.hashCode() * 31) + this.f70703b.hashCode();
        }

        public String toString() {
            return "TemplateMusicExpose(tmplId=" + this.f70702a + ", exposeMusic=" + this.f70703b + ')';
        }
    }

    /* renamed from: a */
    public final void mo51769a(String str, String str2) {
        C87412m.m108594g(str, "templateId");
        C87412m.m108594g(str2, "musicId");
        List<C24791a> list = f70699f;
        C24791a aVar = (C24791a) C110818d0.m150925W(list);
        if (aVar != null) {
            if (!C87412m.m108589b(aVar.f70702a, str)) {
                aVar = null;
            }
            if (aVar != null) {
                if (!aVar.f70703b.contains(str2)) {
                    aVar.f70703b.add(str2);
                    return;
                }
                return;
            }
        }
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(new C24791a(str, C64197v.m75539h(str2)));
    }

    /* renamed from: b */
    public final void mo51770b(int i) {
        if (!f70696c) {
            Log.m105924i("MicroMsg.Maas.MaasReport25621", "has not started");
            return;
        }
        Log.m105924i("MicroMsg.Maas.MaasReport25621", "report");
        f70696c = false;
        MaasRecommendReportStruct maasRecommendReportStruct = f70695b;
        maasRecommendReportStruct.f69533n = maasRecommendReportStruct.mo86045b("editres", i != 1 ? i != 2 ? i != 3 ? "unknown" : "exit" : "editmore" : "save", true);
        C24789f fVar = f70694a;
        List<String> list = f70697d;
        maasRecommendReportStruct.f69529j = maasRecommendReportStruct.mo86045b("exposeids", fVar.mo51772d(list), true);
        maasRecommendReportStruct.mo86054n();
        f70698e = C64186f0.f181907d;
        ((ArrayList) list).clear();
        ((ArrayList) f70699f).clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: ja0.f$a} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x03af  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51771c(com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMovieSession r18) {
        /*
            r17 = this;
            java.lang.String r0 = "sdkData"
            r1 = r18
            gy3.C87412m.m108594g(r1, r0)
            java.lang.String r0 = "MicroMsg.Maas.MaasReport25621"
            java.lang.String r2 = "setReportData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct r0 = f70695b
            long r2 = java.lang.System.currentTimeMillis()
            r0.f69524e = r2
            java.lang.String r2 = r18.getExportTemplateId()
            java.lang.String r3 = "sdkData.exportTemplateId"
            gy3.C87412m.m108593f(r2, r3)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            r5 = 0
            java.lang.String r2 = z04.C112551y.m153814n(r2, r3, r4, r5)
            java.lang.String r6 = "savetid"
            r7 = 1
            java.lang.String r2 = r0.mo86045b(r6, r2, r7)
            r0.f69534o = r2
            java.lang.String r2 = r18.getExportMusicId()
            java.lang.String r6 = "sdkData.exportMusicId"
            gy3.C87412m.m108593f(r2, r6)
            java.lang.String r2 = z04.C112551y.m153814n(r2, r3, r4, r5)
            java.lang.String r6 = "savesid"
            java.lang.String r2 = r0.mo86045b(r6, r2, r7)
            r0.f69535p = r2
            java.lang.String r2 = r18.getExportMusicSongName()
            java.lang.String r6 = "sdkData.exportMusicSongName"
            gy3.C87412m.m108593f(r2, r6)
            java.lang.String r2 = z04.C112551y.m153814n(r2, r3, r4, r5)
            java.lang.String r6 = "song_name"
            java.lang.String r2 = r0.mo86045b(r6, r2, r7)
            r0.f69543x = r2
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMusicSourceType r2 = r18.getExportMusicSourceType()
            java.lang.String r8 = "sdkData.exportMusicSourceType"
            gy3.C87412m.m108593f(r2, r8)
            int[] r8 = ja0.C24789f.C24790b.f70700a
            int r2 = r2.ordinal()
            r2 = r8[r2]
            r8 = 2
            if (r2 == r7) goto L_0x0075
            if (r2 == r8) goto L_0x0073
            r2 = 2
            goto L_0x0076
        L_0x0073:
            r2 = 1
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            r0.f69542w = r2
            int r2 = r18.getAssetsCount()
            r0.f69526g = r2
            java.util.List r2 = r18.getAssetsList()
            java.lang.String r9 = "sdkData.assetsList"
            gy3.C87412m.m108593f(r2, r9)
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0090:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L_0x01c1
            java.lang.Object r10 = r2.next()
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsAsset r10 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsAsset) r10
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMediaType r12 = r10.getMediaType()
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMediaType r13 = com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsMediaType.IMAGE
            java.lang.String r14 = "cred"
            java.lang.String r15 = "visTag"
            java.lang.String r8 = "mediaType"
            java.lang.String r7 = "it"
            if (r12 != r13) goto L_0x010e
            java.lang.String r12 = "image"
            r11.put(r8, r12)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.List r12 = r10.getImageClassExceedsList()
            if (r12 == 0) goto L_0x00dc
            java.util.Iterator r12 = r12.iterator()
        L_0x00c5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00dc
            java.lang.Object r13 = r12.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            gy3.C87412m.m108593f(r13, r7)
            int r13 = r13.intValue()
            r8.put(r13)
            goto L_0x00c5
        L_0x00dc:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r11.put(r15, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.List r12 = r10.getImageClassExceedsList()
            if (r12 == 0) goto L_0x0107
            java.util.Iterator r12 = r12.iterator()
        L_0x00f0:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0107
            java.lang.Object r13 = r12.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            gy3.C87412m.m108593f(r13, r7)
            int r13 = r13.intValue()
            r8.put(r13)
            goto L_0x00f0
        L_0x0107:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r11.put(r14, r8)
            goto L_0x0196
        L_0x010e:
            java.lang.String r12 = "video"
            r11.put(r8, r12)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.List r12 = r10.getVideoClassVisualLabelsList()
            if (r12 == 0) goto L_0x0139
            java.util.Iterator r12 = r12.iterator()
        L_0x0122:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0139
            java.lang.Object r13 = r12.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            gy3.C87412m.m108593f(r13, r7)
            int r13 = r13.intValue()
            r8.put(r13)
            goto L_0x0122
        L_0x0139:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r11.put(r15, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.List r12 = r10.getVideoClassVisualExceedsList()
            if (r12 == 0) goto L_0x0164
            java.util.Iterator r12 = r12.iterator()
        L_0x014d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0164
            java.lang.Object r13 = r12.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            gy3.C87412m.m108593f(r13, r7)
            int r13 = r13.intValue()
            r8.put(r13)
            goto L_0x014d
        L_0x0164:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r11.put(r14, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.List r12 = r10.getVideoClassAudioLabelsList()
            if (r12 == 0) goto L_0x018f
            java.util.Iterator r12 = r12.iterator()
        L_0x0178:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x018f
            java.lang.Object r13 = r12.next()
            java.lang.Integer r13 = (java.lang.Integer) r13
            gy3.C87412m.m108593f(r13, r7)
            int r13 = r13.intValue()
            r8.put(r13)
            goto L_0x0178
        L_0x018f:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            java.lang.String r7 = "audTag"
            r11.put(r7, r8)
        L_0x0196:
            java.lang.String r7 = r10.getAspectRatio()
            java.lang.String r8 = "aspectRatio"
            r11.put(r8, r7)
            long r7 = r10.getDurationMs()
            java.lang.String r12 = "duration"
            r11.put(r12, r7)
            java.lang.String r7 = r10.getAiTags()
            java.lang.String r8 = "aiTag"
            r11.put(r8, r7)
            boolean r7 = r10.getIsOverThreshold()
            java.lang.String r8 = "isOverThreshold"
            r11.put(r8, r7)
            r9.put(r11)
            r7 = 1
            r8 = 2
            goto L_0x0090
        L_0x01c1:
            java.lang.String r2 = r9.toString()
            java.lang.String r7 = "JSONArray().also { jsonA…   }\n        }.toString()"
            gy3.C87412m.m108593f(r2, r7)
            java.lang.String r2 = z04.C112551y.m153814n(r2, r3, r4, r5)
            java.lang.String r8 = "mediadetail"
            r9 = 1
            java.lang.String r2 = r0.mo86045b(r8, r2, r9)
            r0.f69527h = r2
            java.util.List r2 = r18.getTemplateActionsList()
            java.lang.String r8 = "sdkData.templateActionsList"
            gy3.C87412m.m108593f(r2, r8)
            org.json.JSONArray r8 = new org.json.JSONArray
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
            r9 = 0
        L_0x01ea:
            boolean r10 = r2.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x02ee
            java.lang.Object r10 = r2.next()
            int r12 = r9 + 1
            if (r9 < 0) goto L_0x02ea
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewTemplateAction r10 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewTemplateAction) r10
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r14 = r10.getPreviewTemplateId()
            java.lang.String r15 = "tid"
            r13.put(r15, r14)
            java.util.List<ja0.f$a> r14 = f70699f
            java.lang.Object r9 = sx3.C110818d0.m150917O(r14, r9)
            ja0.f$a r9 = (ja0.C24789f.C24791a) r9
            if (r9 == 0) goto L_0x026c
            java.lang.String r14 = r9.f70702a
            java.lang.String r15 = r10.getPreviewTemplateId()
            boolean r14 = gy3.C87412m.m108589b(r14, r15)
            if (r14 == 0) goto L_0x0220
            r11 = r9
        L_0x0220:
            if (r11 == 0) goto L_0x026c
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.List<java.lang.String> r11 = r11.f70703b
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x0232:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0251
            java.lang.Object r15 = r11.next()
            r16 = r15
            java.lang.String r16 = (java.lang.String) r16
            int r16 = r16.length()
            if (r16 <= 0) goto L_0x0249
            r16 = 1
            goto L_0x024b
        L_0x0249:
            r16 = 0
        L_0x024b:
            if (r16 == 0) goto L_0x0232
            r14.add(r15)
            goto L_0x0232
        L_0x0251:
            java.util.Iterator r11 = r14.iterator()
        L_0x0255:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0265
            java.lang.Object r14 = r11.next()
            java.lang.String r14 = (java.lang.String) r14
            r9.put(r14)
            goto L_0x0255
        L_0x0265:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            java.lang.String r11 = "esids"
            r13.put(r11, r9)
        L_0x026c:
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.List r10 = r10.getMusicActionsList()
            java.lang.String r11 = "actionInfo.musicActionsList"
            gy3.C87412m.m108593f(r10, r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x027e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x02db
            java.lang.Object r11 = r10.next()
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsPreviewMusicAction r11 = (com.tencent.maas.analytics.MJAnalyticsS12.MJAnalyticsPreviewMusicAction) r11
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = r11.getPreviewMusicId()
            java.lang.String r5 = "sid"
            r14.put(r5, r15)
            r5 = r2
            long r1 = r11.getTimelineDurationMs()
            java.lang.String r15 = "videolen"
            r14.put(r15, r1)
            long r1 = r11.getPreviewDurationMs()
            java.lang.String r15 = "staytime"
            r14.put(r15, r1)
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMusicSourceType r1 = r11.getPreviewMusicSourceType()
            java.lang.String r2 = "mjAnalyticsPreviewMusicA…on.previewMusicSourceType"
            gy3.C87412m.m108593f(r1, r2)
            int[] r2 = ja0.C24789f.C24790b.f70700a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L_0x02c6
            r2 = 2
            if (r1 == r2) goto L_0x02c4
            r1 = 2
            goto L_0x02c7
        L_0x02c4:
            r1 = 1
            goto L_0x02c7
        L_0x02c6:
            r1 = 0
        L_0x02c7:
            java.lang.String r2 = "song_source"
            r14.put(r2, r1)
            java.lang.String r1 = r11.getPreviewMusicSongName()
            r14.put(r6, r1)
            r9.put(r14)
            r1 = r18
            r2 = r5
            r5 = 0
            goto L_0x027e
        L_0x02db:
            r5 = r2
            java.lang.String r1 = "musicseq"
            r13.put(r1, r9)
            r8.put(r13)
            r1 = r18
            r9 = r12
            r5 = 0
            goto L_0x01ea
        L_0x02ea:
            sx3.C64197v.m75542k()
            throw r11
        L_0x02ee:
            java.lang.String r1 = r8.toString()
            gy3.C87412m.m108593f(r1, r7)
            r2 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r2)
            java.lang.String r2 = "previewseq"
            r5 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r5)
            r0.f69530k = r1
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation r1 = r18.getTemplateRecommendation()
            java.lang.String r1 = r1.getCreationId()
            java.lang.String r2 = "creation_id"
            java.lang.String r1 = r0.mo86045b(r2, r1, r5)
            r0.f69540u = r1
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation r1 = r18.getTemplateRecommendation()
            long r1 = r1.getRequestId()
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            int r2 = r1.signum()
            if (r2 >= 0) goto L_0x0331
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            r5 = 64
            java.math.BigInteger r2 = r2.shiftLeft(r5)
            java.math.BigInteger r1 = r1.add(r2)
        L_0x0331:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "b.toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = "request_id"
            r5 = 1
            java.lang.String r1 = r0.mo86045b(r2, r1, r5)
            r0.f69538s = r1
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation r1 = r18.getTemplateRecommendation()
            java.lang.String r1 = r1.getProjectClassification()
            java.lang.String r2 = "projectClassification"
            java.lang.String r1 = r0.mo86045b(r2, r1, r5)
            r0.f69537r = r1
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation r1 = r18.getTemplateRecommendation()
            java.lang.String r1 = r1.getSceneTag()
            java.lang.String r2 = "sdkData.templateRecommendation.sceneTag"
            gy3.C87412m.m108593f(r1, r2)
            r2 = 0
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r2)
            java.lang.String r2 = "scenetag"
            java.lang.String r1 = r0.mo86045b(r2, r1, r5)
            r0.f69536q = r1
            java.lang.Class<hy.s0> r1 = p166hy.C8830s0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            hy.s0 r1 = (p166hy.C8830s0) r1
            java.lang.String r1 = r1.mo9667ey()
            java.lang.String r2 = "session_id"
            java.lang.String r1 = r0.mo86045b(r2, r1, r5)
            r0.f69539t = r1
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateSourceType r1 = r18.getExportTemplateSourceType()
            java.lang.String r2 = "sdkData.exportTemplateSourceType"
            gy3.C87412m.m108593f(r1, r2)
            int[] r2 = ja0.C24789f.C24790b.f70701b
            int r1 = r1.ordinal()
            r1 = r2[r1]
            if (r1 == r5) goto L_0x03a2
            r2 = 2
            if (r1 == r2) goto L_0x03a0
            r5 = 3
            if (r1 == r5) goto L_0x039e
            r5 = 4
            if (r1 == r5) goto L_0x039e
            goto L_0x03a2
        L_0x039e:
            r8 = 2
            goto L_0x03a3
        L_0x03a0:
            r8 = 1
            goto L_0x03a3
        L_0x03a2:
            r8 = 0
        L_0x03a3:
            r0.f69544y = r8
            com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsTemplateRecommendation r1 = r18.getTemplateRecommendation()
            java.lang.String r1 = r1.getAttachmentsJson()
            if (r1 == 0) goto L_0x03b4
            r2 = 0
            java.lang.String r11 = z04.C112551y.m153814n(r1, r3, r4, r2)
        L_0x03b4:
            java.lang.String r1 = "sdkinfo"
            r2 = 1
            java.lang.String r1 = r0.mo86045b(r1, r11, r2)
            r0.f69545z = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ja0.C24789f.mo51771c(com.tencent.maas.analytics.MJAnalyticsS12$MJAnalyticsMovieSession):void");
    }

    /* renamed from: d */
    public final String mo51772d(Collection<String> collection) {
        JSONArray jSONArray = new JSONArray();
        for (String put : collection) {
            jSONArray.put(put);
        }
        String jSONArray2 = jSONArray.toString();
        C87412m.m108593f(jSONArray2, "JSONArray().also { jsonA…       }\n    }.toString()");
        return C112551y.m153814n(jSONArray2, ",", ";", false);
    }
}
