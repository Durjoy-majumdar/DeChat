package dp1;

import android.util.Base64;
import com.tencent.p014mm.autogen.mmdata.rpt.DiscoveryTabsRedDotImpClickStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRedDotPushDropStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.RedDotFakeClickClearStruct;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowDiscoveryExtInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import h81.C59774i;
import ht1.C60165e4;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C61926c;
import o40.C61937h;
import org.json.JSONObject;
import p185kq.C10383h;
import pe3.C89349b;
import te3.C49712hj1;
import te3.C51978xi1;
import te3.C64355f00;
import te3.C64586nn1;
import te3.C64702s7;
import te3.wc4;
import z04.C112551y;
import z04.C119027c;

/* renamed from: dp1.v0 */
public final class C58413v0 {

    /* renamed from: a */
    public static final C58413v0 f167346a = new C58413v0();

    /* renamed from: b */
    public static String f167347b = "";

    /* renamed from: f */
    public static /* synthetic */ void m67778f(C58413v0 v0Var, String str, C55718s0 s0Var, C64586nn1 nn12, int i, String str2, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i5;
        v0Var.mo83271e(str, s0Var, nn12, i, (i6 & 16) != 0 ? "" : str2, (i6 & 32) != 0 ? 0 : i2, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? 0 : i4);
    }

    /* renamed from: g */
    public static void m67779g(C58413v0 v0Var, String str, C55718s0 s0Var, C64586nn1 nn12, int i, String str2, int i2, String str3, String str4, int i3, C60165e4.C46105a aVar, int i4, Object obj) {
        int i5 = i4;
        String str5 = "";
        String str6 = (i5 & 16) != 0 ? str5 : str2;
        int i6 = (i5 & 32) != 0 ? 0 : i2;
        String str7 = (i5 & 64) != 0 ? str5 : str3;
        String str8 = (i5 & 128) != 0 ? str5 : str4;
        int i7 = (i5 & 256) != 0 ? 0 : i3;
        C60165e4.C46105a aVar2 = (i5 & 512) != 0 ? new C60165e4.C46105a(0, 0, 3, (C8480h) null) : aVar;
        v0Var.getClass();
        C87412m.m108594g(str, "currUI");
        C87412m.m108594g(s0Var, "ctrInfo");
        C87412m.m108594g(nn12, "showInfo");
        C87412m.m108594g(str6, "contextId");
        C87412m.m108594g(str7, "clickTabContextId");
        C87412m.m108594g(str8, "clickSubTabContextid");
        C87412m.m108594g(aVar2, "dslRenderInfo");
        C49712hj1 hj12 = new C49712hj1();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb != null) {
            str5 = Wb;
        }
        hj12.f134670d = str5;
        hj12.f134671e = str6;
        hj12.f134672f = str7;
        m67780h(v0Var, str, s0Var, nn12, i, hj12, i6, 0, str8, i7, 0, (String) null, 0, aVar2, 3648, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: rx3.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: rx3.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: rx3.l<java.lang.String, java.lang.Integer>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a3 A[LOOP:0: B:55:0x019d->B:57:0x01a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02af  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m67780h(dp1.C58413v0 r23, java.lang.String r24, com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 r25, te3.C64586nn1 r26, int r27, te3.C49712hj1 r28, int r29, int r30, java.lang.String r31, int r32, int r33, java.lang.String r34, int r35, ht1.C60165e4.C46105a r36, int r37, java.lang.Object r38) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r37
            r5 = r4 & 16
            r6 = 0
            if (r5 == 0) goto L_0x0011
            r5 = r6
            goto L_0x0013
        L_0x0011:
            r5 = r28
        L_0x0013:
            r7 = r4 & 32
            r8 = 0
            if (r7 == 0) goto L_0x001a
            r7 = 0
            goto L_0x001c
        L_0x001a:
            r7 = r29
        L_0x001c:
            r9 = r4 & 64
            if (r9 == 0) goto L_0x0022
            r9 = 0
            goto L_0x0024
        L_0x0022:
            r9 = r30
        L_0x0024:
            r10 = r4 & 128(0x80, float:1.794E-43)
            java.lang.String r11 = ""
            if (r10 == 0) goto L_0x002c
            r10 = r11
            goto L_0x002e
        L_0x002c:
            r10 = r31
        L_0x002e:
            r12 = r4 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0034
            r12 = 0
            goto L_0x0036
        L_0x0034:
            r12 = r32
        L_0x0036:
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x003c
            r13 = 0
            goto L_0x003e
        L_0x003c:
            r13 = r33
        L_0x003e:
            r14 = r4 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r11 = r34
        L_0x0045:
            r14 = r4 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x004b
            r14 = 0
            goto L_0x004d
        L_0x004b:
            r14 = r35
        L_0x004d:
            r4 = r4 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0058
            ht1.e4$a r4 = new ht1.e4$a
            r15 = 3
            r4.<init>(r8, r8, r15, r6)
            goto L_0x005a
        L_0x0058:
            r4 = r36
        L_0x005a:
            r23.getClass()
            java.lang.String r15 = "currUI"
            gy3.C87412m.m108594g(r1, r15)
            java.lang.String r15 = "ctrInfo"
            gy3.C87412m.m108594g(r2, r15)
            java.lang.String r15 = "showInfo"
            gy3.C87412m.m108594g(r3, r15)
            java.lang.String r15 = "clickSubTabContextid"
            gy3.C87412m.m108594g(r10, r15)
            java.lang.String r15 = "title"
            gy3.C87412m.m108594g(r11, r15)
            java.lang.String r15 = "dslRenderInfo"
            gy3.C87412m.m108594g(r4, r15)
            com.tencent.mm.autogen.mmdata.rpt.FinderRedDotNewStruct r15 = new com.tencent.mm.autogen.mmdata.rpt.FinderRedDotNewStruct
            r15.<init>()
            te3.xi1 r6 = r2.field_ctrInfo
            int r6 = r6.f144670e
            r29 = r9
            long r8 = (long) r6
            r15.f155951d = r8
            java.lang.String r6 = r2.field_tipsId
            java.lang.String r8 = "RedDotTipsID"
            r9 = 1
            java.lang.String r6 = r15.mo86045b(r8, r6, r9)
            r15.f155952e = r6
            java.lang.String r6 = r3.f184507i
            java.lang.String r8 = "RedDotShowInfoPath"
            java.lang.String r6 = r15.mo86045b(r8, r6, r9)
            r15.f155953f = r6
            java.lang.String r6 = r3.f184508j
            java.lang.String r8 = "RedDotShowInfoParentPath"
            java.lang.String r6 = r15.mo86045b(r8, r6, r9)
            r15.f155954g = r6
            int r6 = r3.f184502d
            r8 = r10
            long r9 = (long) r6
            r15.f155955h = r9
            int r6 = r3.f184503e
            long r9 = (long) r6
            r15.f155956i = r9
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r6 = r25.mo77309p2()
            org.json.JSONObject r6 = o40.C61937h.m72709h(r6)
            int r9 = r4.f124275a
            java.lang.String r9 = r0.mo83267a(r3, r6, r9, r11)
            java.lang.String r10 = ";"
            java.lang.String r11 = ","
            if (r9 == 0) goto L_0x00d1
            r31 = r8
            r8 = 0
            java.lang.String r9 = z04.C112551y.m153814n(r9, r11, r10, r8)
            goto L_0x00d4
        L_0x00d1:
            r31 = r8
            r9 = 0
        L_0x00d4:
            java.lang.String r8 = "RedDotShowInfoTitle"
            r32 = r4
            r4 = 1
            java.lang.String r8 = r15.mo86045b(r8, r9, r4)
            r15.f155957j = r8
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r4 = r25.mo77309p2()
            long r8 = r4.object_id
            java.lang.String r4 = o40.C61926c.m72691p(r8)
            java.lang.String r8 = "object_id"
            r6.put(r8, r4)
            te3.xi1 r4 = r2.field_ctrInfo
            int r4 = r4.f144670e
            r8 = 15
            java.lang.String r9 = "RedDotShowInfoExt"
            if (r4 != r8) goto L_0x0174
            java.lang.String r4 = r3.f184507i
            if (r4 == 0) goto L_0x0174
            java.lang.String r8 = "CreatorCenter"
            r16 = r12
            r38 = r13
            r0 = 0
            r12 = 2
            r13 = 0
            boolean r4 = z04.C112551y.m153810j(r4, r8, r0, r12, r13)
            if (r4 == 0) goto L_0x0179
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_finder_reddot_report_creator_center_new
            int r4 = r4.mo58779Qe(r8, r0)
            r0 = 1
            if (r4 != r0) goto L_0x0179
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r0 = r25.mo77309p2()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r6 = r25.mo77309p2()
            long r10 = r6.object_id
            java.lang.String r6 = o40.C61926c.m72691p(r10)
            r4.append(r6)
            r6 = 59
            r4.append(r6)
            java.lang.String r8 = r0.object_nonce_id
            r4.append(r8)
            r4.append(r6)
            int r8 = r0.tab_type
            r4.append(r8)
            r4.append(r6)
            java.lang.String r0 = r0.username
            r4.append(r0)
            r4.append(r6)
            te3.xi1 r0 = r2.field_ctrInfo
            if (r0 == 0) goto L_0x0156
            java.lang.String r0 = r0.f144682t
            goto L_0x0157
        L_0x0156:
            r0 = r13
        L_0x0157:
            r4.append(r0)
            java.lang.String r17 = r4.toString()
            r20 = 0
            r21 = 4
            r22 = 0
            java.lang.String r18 = ","
            java.lang.String r19 = ";"
            java.lang.String r0 = z04.C112551y.m153816p(r17, r18, r19, r20, r21, r22)
            r4 = 1
            java.lang.String r0 = r15.mo86045b(r9, r0, r4)
            r15.f155958k = r0
            goto L_0x018e
        L_0x0174:
            r16 = r12
            r38 = r13
            r13 = 0
        L_0x0179:
            java.lang.String r0 = r6.toString()
            java.lang.String r4 = "extInfo.toString()"
            gy3.C87412m.m108593f(r0, r4)
            r4 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r11, r10, r4)
            r4 = 1
            java.lang.String r0 = r15.mo86045b(r9, r0, r4)
            r15.f155958k = r0
        L_0x018e:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r4 = r25.mo77309p2()
            java.util.LinkedList<java.lang.String> r4 = r4.multi_username
            java.util.Iterator r4 = r4.iterator()
        L_0x019d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01ad
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.put(r6)
            goto L_0x019d
        L_0x01ad:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r6 = "multi_usernames"
            r4.put(r6, r0)
            r0 = 1
            if (r14 != r0) goto L_0x01bf
            java.lang.String r6 = "isClientTextLimitFallbackDot"
            r4.put(r6, r0)
        L_0x01bf:
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "reportExt2Json.toString()"
            gy3.C87412m.m108593f(r0, r4)
            java.nio.charset.Charset r4 = z04.C119027c.f356488a
            byte[] r0 = r0.getBytes(r4)
            java.lang.String r4 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r4)
            r4 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)
            java.lang.String r4 = "ReportExtInfo2"
            r6 = 1
            java.lang.String r0 = r15.mo86045b(r4, r0, r6)
            r15.f155948E = r0
            r0 = r27
            long r8 = (long) r0
            r15.f155959l = r8
            java.lang.String r0 = "CurrUI"
            java.lang.String r0 = r15.mo86045b(r0, r1, r6)
            r15.f155960m = r0
            if (r5 == 0) goto L_0x01f4
            java.lang.String r0 = r5.f134671e
            goto L_0x01f5
        L_0x01f4:
            r0 = r13
        L_0x01f5:
            java.lang.String r4 = "ContextID"
            java.lang.String r0 = r15.mo86045b(r4, r0, r6)
            r15.f155961n = r0
            if (r5 == 0) goto L_0x0202
            java.lang.String r0 = r5.f134672f
            goto L_0x0203
        L_0x0202:
            r0 = r13
        L_0x0203:
            java.lang.String r4 = "ClickTabContextID"
            java.lang.String r0 = r15.mo86045b(r4, r0, r6)
            r15.f155962o = r0
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99420i1
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r10 = 1
            r4 = 1
            if (r0 != r4) goto L_0x0223
            r8 = r10
            goto L_0x0225
        L_0x0223:
            r8 = 0
        L_0x0225:
            r15.f155963p = r8
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            boolean r0 = r0.mo77253Y5()
            if (r0 == 0) goto L_0x023b
            r8 = r10
            goto L_0x023d
        L_0x023b:
            r8 = 0
        L_0x023d:
            r15.f155964q = r8
            if (r7 != 0) goto L_0x0243
            r8 = r10
            goto L_0x0245
        L_0x0243:
            r8 = 0
        L_0x0245:
            r15.f155965r = r8
            r15.f155966s = r10
            if (r5 == 0) goto L_0x024e
            java.lang.String r0 = r5.f134670d
            goto L_0x024f
        L_0x024e:
            r0 = r13
        L_0x024f:
            java.lang.String r4 = "SessionID"
            r5 = 1
            java.lang.String r0 = r15.mo86045b(r4, r0, r5)
            r15.f155967t = r0
            long r6 = r2.field_time
            r15.f155968u = r6
            java.lang.String r0 = r3.f184505g
            java.lang.String r4 = "RedDotShowInfoIconUrl"
            java.lang.String r0 = r15.mo86045b(r4, r0, r5)
            r15.f155969v = r0
            r8 = r29
            long r4 = (long) r8
            r15.f155970w = r4
            er1.w3 r0 = er1.C58784w3.f168295a
            boolean r0 = r0.mo83983z0()
            r4 = 2
            if (r0 == 0) goto L_0x0277
            r6 = r10
            goto L_0x0278
        L_0x0277:
            r6 = r4
        L_0x0278:
            r15.f155971x = r6
            long r6 = eb0.C31543z5.m39453c()
            r15.f155972y = r6
            r0 = r23
            java.lang.String r0 = r0.mo83268b(r2, r3)
            java.lang.String r3 = "RedDotCountNumDetail"
            r6 = 1
            java.lang.String r0 = r15.mo86045b(r3, r0, r6)
            r15.f155973z = r0
            boolean r0 = p182kk.C61104a.m71660p()
            if (r0 == 0) goto L_0x0296
            r10 = r4
        L_0x0296:
            r15.f155944A = r10
            java.lang.String r0 = "ClickSubTabContextid"
            r11 = r31
            java.lang.String r0 = r15.mo86045b(r0, r11, r6)
            r15.f155945B = r0
            r8 = r38
            long r3 = (long) r8
            r15.f155947D = r3
            java.lang.String r0 = "1"
            boolean r0 = gy3.C87412m.m108589b(r1, r0)
            if (r0 == 0) goto L_0x02ed
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            if (r0 == 0) goto L_0x02c4
            ht1.b4 r0 = r0.Nt0()
            if (r0 == 0) goto L_0x02c4
            rx3.l r0 = r0.mo77254Z5()
            goto L_0x02c5
        L_0x02c4:
            r0 = r13
        L_0x02c5:
            if (r0 == 0) goto L_0x02cd
            A r1 = r0.f38555d
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x02ce
        L_0x02cd:
            r6 = r13
        L_0x02ce:
            java.lang.String r1 = r2.field_tipsId
            boolean r1 = gy3.C87412m.m108589b(r6, r1)
            if (r1 == 0) goto L_0x02e8
            if (r0 == 0) goto L_0x02e2
            B r0 = r0.f38556e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            goto L_0x02e5
        L_0x02e2:
            r8 = r16
            long r0 = (long) r8
        L_0x02e5:
            r15.f155946C = r0
            goto L_0x02ed
        L_0x02e8:
            r8 = r16
            long r0 = (long) r8
            r15.f155946C = r0
        L_0x02ed:
            r4 = r32
            int r0 = r4.f124275a
            long r0 = (long) r0
            r15.f155949F = r0
            int r0 = r4.f124276b
            long r0 = (long) r0
            r15.f155950G = r0
            r15.mo86054n()
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dp1.y0 r0 = (dp1.C58417y0) r0
            r0.Ec0(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58413v0.m67780h(dp1.v0, java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.s0, te3.nn1, int, te3.hj1, int, int, java.lang.String, int, int, java.lang.String, int, ht1.e4$a, int, java.lang.Object):void");
    }

    /* renamed from: i */
    public static void m67781i(C58413v0 v0Var, String str, C55718s0 s0Var, C64586nn1 nn12, int i, C49712hj1 hj12, int i2, String str2, int i3, int i4, int i5, Object obj) {
        int i6 = i5;
        C49712hj1 hj13 = (i6 & 16) != 0 ? null : hj12;
        int i7 = (i6 & 32) != 0 ? 0 : i2;
        String str3 = (i6 & 64) != 0 ? "" : str2;
        int i8 = (i6 & 128) != 0 ? 0 : i3;
        int i9 = (i6 & 256) != 0 ? 0 : i4;
        v0Var.getClass();
        C87412m.m108594g(str, "currUI");
        C55718s0 s0Var2 = s0Var;
        C87412m.m108594g(s0Var2, "ctrInfo");
        C64586nn1 nn13 = nn12;
        C87412m.m108594g(nn13, "showInfo");
        C87412m.m108594g(str3, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        m67780h(v0Var, str, s0Var2, nn13, i, hj13, i9, i8, "", i7, 0, str3, 0, (C60165e4.C46105a) null, 6656, (Object) null);
    }

    /* renamed from: j */
    public static void m67782j(C58413v0 v0Var, C55718s0 s0Var, C64586nn1 nn12, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 2;
        }
        if ((i3 & 16) != 0) {
            str = "";
        }
        if ((i3 & 32) != 0) {
            str2 = "";
        }
        v0Var.getClass();
        C87412m.m108594g(s0Var, "ctrInfo");
        C87412m.m108594g(nn12, "showInfo");
        C87412m.m108594g(str, "whiteListReddotList");
        C87412m.m108594g(str2, "overwriteTipsId");
        RedDotFakeClickClearStruct redDotFakeClickClearStruct = new RedDotFakeClickClearStruct();
        redDotFakeClickClearStruct.f156767d = (long) s0Var.field_ctrInfo.f144670e;
        redDotFakeClickClearStruct.f156768e = (long) nn12.f184502d;
        redDotFakeClickClearStruct.f156769f = (long) i;
        redDotFakeClickClearStruct.f156770g = redDotFakeClickClearStruct.mo86045b("RedDotTipsID", s0Var.field_tipsId, true);
        redDotFakeClickClearStruct.f156771h = redDotFakeClickClearStruct.mo86045b("RedDotShowInfoPath", nn12.f184507i, true);
        redDotFakeClickClearStruct.f156772i = (long) i2;
        redDotFakeClickClearStruct.f156773j = redDotFakeClickClearStruct.mo86045b("WhiteListReddotList", str, true);
        redDotFakeClickClearStruct.f156774k = redDotFakeClickClearStruct.mo86045b("OverwriteRedDotTipsID", str2, true);
        redDotFakeClickClearStruct.f156775l = C31543z5.m39453c();
        JSONObject h = C61937h.m72709h(s0Var.mo77309p2());
        h.put("object_id", C61926c.m72691p(s0Var.mo77309p2().object_id));
        String jSONObject = h.toString();
        C87412m.m108593f(jSONObject, "extInfo.toString()");
        redDotFakeClickClearStruct.f156776m = redDotFakeClickClearStruct.mo86045b("RedDotShowInfoExt", C112551y.m153814n(jSONObject, ",", ";", false), true);
        redDotFakeClickClearStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(redDotFakeClickClearStruct);
    }

    /* renamed from: l */
    public static /* synthetic */ void m67783l(C58413v0 v0Var, C55718s0 s0Var, C64586nn1 nn12, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            j = 0;
        }
        v0Var.mo83272k(s0Var, nn12, i, str2, j);
    }

    /* renamed from: m */
    public static void m67784m(C58413v0 v0Var, C51978xi1 xi12, C64586nn1 nn12, int i, String str, long j, int i2, Object obj) {
        String str2 = "";
        if ((i2 & 8) != 0) {
            str = str2;
        }
        if ((i2 & 16) != 0) {
            j = 0;
        }
        v0Var.getClass();
        C87412m.m108594g(xi12, "ctrlInfo");
        C87412m.m108594g(nn12, "showInfo");
        FinderRedDotPushDropStruct finderRedDotPushDropStruct = new FinderRedDotPushDropStruct();
        finderRedDotPushDropStruct.f155974d = (long) xi12.f144670e;
        finderRedDotPushDropStruct.f155975e = finderRedDotPushDropStruct.mo86045b("RedDotTipsID", xi12.f144673h, true);
        finderRedDotPushDropStruct.f155976f = finderRedDotPushDropStruct.mo86045b("RedDotShowInfoPath", nn12.f184507i, true);
        finderRedDotPushDropStruct.f155977g = finderRedDotPushDropStruct.mo86045b("RedDotShowInfoParentPath", nn12.f184508j, true);
        C55718s0 s0Var = new C55718s0();
        s0Var.mo77305l2(xi12, 0);
        finderRedDotPushDropStruct.f155979i = finderRedDotPushDropStruct.mo86045b("objectId", C61926c.m72691p(s0Var.mo77309p2().object_id), true);
        finderRedDotPushDropStruct.f155980j = finderRedDotPushDropStruct.mo86045b("username", s0Var.mo77309p2().username, true);
        String jSONObject = C61937h.m72709h(s0Var.mo77309p2()).toString();
        C87412m.m108593f(jSONObject, "extInfo.toString()");
        finderRedDotPushDropStruct.f155981k = finderRedDotPushDropStruct.mo86045b("reportExtInfo", C112551y.m153814n(jSONObject, ",", ";", false), true);
        finderRedDotPushDropStruct.f155982l = (long) i;
        if (Util.isNullOrNil(str)) {
            str = f167347b;
        }
        finderRedDotPushDropStruct.f155983m = finderRedDotPushDropStruct.mo86045b("ContextID", str, true);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb != null) {
            str2 = Wb;
        }
        finderRedDotPushDropStruct.f155986p = finderRedDotPushDropStruct.mo86045b("sessionId", str2, true);
        finderRedDotPushDropStruct.f155987q = j;
        finderRedDotPushDropStruct.f155985o = C31543z5.m39453c();
        finderRedDotPushDropStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderRedDotPushDropStruct);
    }

    /* renamed from: a */
    public final String mo83267a(C64586nn1 nn12, JSONObject jSONObject, int i, String str) {
        String str2;
        JSONObject jSONObject2;
        Object obj;
        if (!Util.isNullOrNil(str)) {
            return str;
        }
        if (nn12.f184502d != 999) {
            return nn12.f184504f;
        }
        boolean z = false;
        if (jSONObject.has("report_ext_info")) {
            byte[] decode = Base64.decode(jSONObject.getString("report_ext_info"), 0);
            C87412m.m108593f(decode, "decode(extInfo.getString…t_info\"), Base64.DEFAULT)");
            str2 = new String(decode, C119027c.f356488a);
        } else {
            str2 = "";
        }
        if (str2.length() == 0) {
            z = true;
        }
        if (!z) {
            try {
                Result.Companion companion = Result.Companion;
                obj = Result.m168114constructorimpl(new JSONObject(str2));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m168120isFailureimpl(obj)) {
                obj = null;
            }
            jSONObject2 = (JSONObject) obj;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
        } else {
            jSONObject2 = new JSONObject();
        }
        if (i != 1) {
            if (i != 2) {
                if (jSONObject2.has("thumbnail_text")) {
                    return jSONObject2.getString("thumbnail_text");
                }
            } else if (jSONObject2.has("thumbnail_text")) {
                return jSONObject2.getString("thumbnail_text");
            }
        } else if (jSONObject2.has("complete_text")) {
            return jSONObject2.getString("complete_text");
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        if (r0.put("has_finderuser_info", 1) != null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        if (r0.put("has_other_info", 1) == null) goto L_0x00c2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo83268b(com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0 r12, te3.C64586nn1 r13) {
        /*
            r11 = this;
            te3.xi1 r12 = r12.field_ctrInfo
            int r12 = r12.f144670e
            java.lang.String r0 = r13.f184507i
            java.lang.String r1 = "FinderEntrance"
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            java.lang.String r2 = ";"
            java.lang.String r3 = ","
            java.lang.String r4 = "has_finderuser_info"
            java.lang.String r5 = "FinderMentionEntrance"
            r6 = 0
            r7 = 2
            r8 = 1
            r9 = 0
            if (r0 != 0) goto L_0x0060
            java.lang.String r0 = r13.f184507i
            boolean r0 = gy3.C87412m.m108589b(r0, r5)
            if (r0 == 0) goto L_0x0023
            goto L_0x0060
        L_0x0023:
            if (r12 == r7) goto L_0x0037
            r0 = 1006(0x3ee, float:1.41E-42)
            if (r12 == r0) goto L_0x0037
            r0 = 1007(0x3ef, float:1.411E-42)
            if (r12 == r0) goto L_0x0037
            if (r12 == r8) goto L_0x0037
            r0 = 1008(0x3f0, float:1.413E-42)
            if (r12 != r0) goto L_0x0034
            goto L_0x0037
        L_0x0034:
            java.lang.String r12 = ""
            return r12
        L_0x0037:
            org.json.JSONObject r12 = r11.mo83269c()
            int r0 = r13.f184502d
            if (r0 != r7) goto L_0x0045
            int r0 = r13.f184503e
            if (r0 <= 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r13 = r6
        L_0x004a:
            if (r13 == 0) goto L_0x004f
            r12.put(r4, r8)
        L_0x004f:
            r11.mo83270d(r12)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "json.toString()"
            gy3.C87412m.m108593f(r12, r13)
            java.lang.String r12 = z04.C112551y.m153814n(r12, r3, r2, r9)
            return r12
        L_0x0060:
            java.lang.String r12 = r13.f184507i     // Catch:{ Exception -> 0x00c7 }
            boolean r12 = gy3.C87412m.m108589b(r12, r1)     // Catch:{ Exception -> 0x00c7 }
            if (r12 != 0) goto L_0x0070
            java.lang.String r12 = r13.f184507i     // Catch:{ Exception -> 0x00c7 }
            boolean r12 = gy3.C87412m.m108589b(r12, r5)     // Catch:{ Exception -> 0x00c7 }
            if (r12 == 0) goto L_0x00d1
        L_0x0070:
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r12 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r12 = di3.C86312j.m106911c(r12)     // Catch:{ Exception -> 0x00c7 }
            com.tencent.mm.plugin.FinderCommonFeatureService r12 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r12     // Catch:{ Exception -> 0x00c7 }
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r12 = r12.Nt0()     // Catch:{ Exception -> 0x00c7 }
            org.json.JSONObject r0 = r11.mo83269c()     // Catch:{ Exception -> 0x00c7 }
            r11.mo83270d(r0)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r10 = r13.f184507i     // Catch:{ Exception -> 0x00c7 }
            boolean r10 = gy3.C87412m.m108589b(r10, r1)     // Catch:{ Exception -> 0x00c7 }
            if (r10 == 0) goto L_0x00ac
            te3.nn1 r12 = r12.mo77246R5(r5)     // Catch:{ Exception -> 0x00c7 }
            if (r12 == 0) goto L_0x00a8
            int r13 = r12.f184502d     // Catch:{ Exception -> 0x00c7 }
            if (r13 != r7) goto L_0x009b
            int r13 = r12.f184503e     // Catch:{ Exception -> 0x00c7 }
            if (r13 <= 0) goto L_0x009b
            r13 = 1
            goto L_0x009c
        L_0x009b:
            r13 = 0
        L_0x009c:
            if (r13 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r12 = r6
        L_0x00a0:
            if (r12 == 0) goto L_0x00a8
            org.json.JSONObject r12 = r0.put(r4, r8)     // Catch:{ Exception -> 0x00c7 }
            if (r12 != 0) goto L_0x00c5
        L_0x00a8:
            r0.put(r4, r9)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00c5
        L_0x00ac:
            java.lang.String r13 = r13.f184507i     // Catch:{ Exception -> 0x00c7 }
            boolean r13 = gy3.C87412m.m108589b(r13, r5)     // Catch:{ Exception -> 0x00c7 }
            if (r13 == 0) goto L_0x00c5
            te3.nn1 r12 = r12.mo77246R5(r1)     // Catch:{ Exception -> 0x00c7 }
            java.lang.String r13 = "has_other_info"
            if (r12 == 0) goto L_0x00c2
            org.json.JSONObject r12 = r0.put(r13, r8)     // Catch:{ Exception -> 0x00c7 }
            if (r12 != 0) goto L_0x00c5
        L_0x00c2:
            r0.put(r13, r9)     // Catch:{ Exception -> 0x00c7 }
        L_0x00c5:
            r6 = r0
            goto L_0x00d1
        L_0x00c7:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r0 = "FinderRedDotReporter"
            java.lang.String r1 = "reportFinderEntranceNumDetail"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r12, r1, r13)
        L_0x00d1:
            java.lang.String r12 = java.lang.String.valueOf(r6)
            java.lang.String r12 = z04.C112551y.m153814n(r12, r3, r2, r9)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C58413v0.mo83268b(com.tencent.mm.plugin.finder.extension.reddot.s0, te3.nn1):java.lang.String");
    }

    /* renamed from: c */
    public final JSONObject mo83269c() {
        Class cls = FinderCommonFeatureService.class;
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("NotificationCenterLike");
        int i = R5 != null ? R5.f184503e : 0;
        C64586nn1 R52 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("NotificationCenterComment");
        int i2 = R52 != null ? R52.f184503e : 0;
        C64586nn1 R53 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("NotificationCenterFollow");
        int i3 = R53 != null ? R53.f184503e : 0;
        int i4 = i + i2 + i3;
        C64586nn1 R54 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("finder_private_msg_entrance");
        int i5 = R54 != null ? R54.f184503e : 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("PrivateMsg", i5);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("unreadFollowCnt", i3);
            jSONObject2.put("unreadCommentCnt", i2);
            jSONObject2.put("unreadLikeCount", i);
            jSONObject2.put("totalCnt", i4);
            jSONObject.put("FinderMsg", jSONObject2);
        } catch (Exception e) {
            Log.printErrStackTrace("FinderRedDotReporter", e, "optMessageDetailJson", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final JSONObject mo83270d(JSONObject jSONObject) {
        Class cls = FinderCommonFeatureService.class;
        C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("WxMessageLike");
        int i = R5 != null ? R5.f184503e : 0;
        C64586nn1 R52 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("WxMessageComment");
        int i2 = R52 != null ? R52.f184503e : 0;
        int i3 = i + i2;
        C64586nn1 R53 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77246R5("finder_wx_private_msg_entrance");
        int i4 = R53 != null ? R53.f184503e : 0;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("WXPrivateMsg", i4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("unreadLikeCnt", i);
            jSONObject2.put("unreadComment", i2);
            jSONObject2.put("totalCnt", i3);
            jSONObject.put("WXUnreadMsg", jSONObject2);
        } catch (Exception e) {
            Log.printErrStackTrace("FinderRedDotReporter", e, "optWxMessageDetailJson", new Object[0]);
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final void mo83271e(String str, C55718s0 s0Var, C64586nn1 nn12, int i, String str2, int i2, int i3, int i4) {
        String str3 = str2;
        C87412m.m108594g(str, "currUI");
        C87412m.m108594g(s0Var, "ctrInfo");
        C87412m.m108594g(nn12, "showInfo");
        C87412m.m108594g(str3, "contextId");
        C49712hj1 hj12 = new C49712hj1();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        hj12.f134670d = Wb;
        hj12.f134671e = str3;
        hj12.f134672f = "";
        m67780h(this, str, s0Var, nn12, i, hj12, i2, 0, (String) null, i3, 0, (String) null, i4, (C60165e4.C46105a) null, 5824, (Object) null);
    }

    /* renamed from: k */
    public final void mo83272k(C55718s0 s0Var, C64586nn1 nn12, int i, String str, long j) {
        FinderRedDotPushDropStruct finderRedDotPushDropStruct = new FinderRedDotPushDropStruct();
        if (s0Var != null) {
            finderRedDotPushDropStruct.f155974d = (long) s0Var.field_ctrType;
            finderRedDotPushDropStruct.f155975e = finderRedDotPushDropStruct.mo86045b("RedDotTipsID", s0Var.field_tipsId, true);
            finderRedDotPushDropStruct.f155979i = finderRedDotPushDropStruct.mo86045b("objectId", C61926c.m72691p(s0Var.mo77309p2().object_id), true);
            finderRedDotPushDropStruct.f155980j = finderRedDotPushDropStruct.mo86045b("username", s0Var.mo77309p2().username, true);
            String jSONObject = C61937h.m72709h(s0Var.mo77309p2()).toString();
            C87412m.m108593f(jSONObject, "extInfo.toString()");
            finderRedDotPushDropStruct.f155981k = finderRedDotPushDropStruct.mo86045b("reportExtInfo", C112551y.m153814n(jSONObject, ",", ";", false), true);
        }
        if (nn12 != null) {
            finderRedDotPushDropStruct.f155976f = finderRedDotPushDropStruct.mo86045b("RedDotShowInfoPath", nn12.f184507i, true);
            finderRedDotPushDropStruct.f155977g = finderRedDotPushDropStruct.mo86045b("RedDotShowInfoParentPath", nn12.f184508j, true);
            finderRedDotPushDropStruct.f155978h = finderRedDotPushDropStruct.mo86045b("RedDotShowInfoType", String.valueOf(nn12.f184502d), true);
        }
        finderRedDotPushDropStruct.f155982l = (long) i;
        if (Util.isNullOrNil(str)) {
            str = f167347b;
        }
        finderRedDotPushDropStruct.f155983m = finderRedDotPushDropStruct.mo86045b("ContextID", str, true);
        finderRedDotPushDropStruct.f155987q = j;
        finderRedDotPushDropStruct.f155985o = C31543z5.m39453c();
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb == null) {
            Wb = "";
        }
        finderRedDotPushDropStruct.f155986p = finderRedDotPushDropStruct.mo86045b("sessionId", Wb, true);
        finderRedDotPushDropStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderRedDotPushDropStruct);
    }

    /* renamed from: n */
    public final void mo83273n(int i, long j, C55718s0 s0Var, C64586nn1 nn12, String str) {
        String str2;
        C64355f00 f002;
        wc4 wc4;
        C87412m.m108594g(str, "detail");
        DiscoveryTabsRedDotImpClickStruct discoveryTabsRedDotImpClickStruct = new DiscoveryTabsRedDotImpClickStruct();
        discoveryTabsRedDotImpClickStruct.f154978f = (long) i;
        discoveryTabsRedDotImpClickStruct.f154982j = j;
        discoveryTabsRedDotImpClickStruct.f154985m = C31543z5.m39453c();
        if (s0Var != null) {
            discoveryTabsRedDotImpClickStruct.f154976d = (long) s0Var.field_ctrInfo.f144670e;
            discoveryTabsRedDotImpClickStruct.f154979g = discoveryTabsRedDotImpClickStruct.mo86045b("feedid", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(s0Var.mo77309p2().object_id), true);
            discoveryTabsRedDotImpClickStruct.f154980h = discoveryTabsRedDotImpClickStruct.mo86045b("username", s0Var.f158585F.f186560u, true);
            discoveryTabsRedDotImpClickStruct.f154983k = discoveryTabsRedDotImpClickStruct.mo86045b("RedDotTipsID", s0Var.field_tipsId, true);
        }
        if (nn12 != null) {
            FinderTipsShowDiscoveryExtInfo finderTipsShowDiscoveryExtInfo = new FinderTipsShowDiscoveryExtInfo();
            if (nn12.f184509n == 3) {
                C89349b bVar = nn12.f184510o;
                finderTipsShowDiscoveryExtInfo.parseFrom(bVar != null ? bVar.mo123703f() : null);
            }
            String str3 = finderTipsShowDiscoveryExtInfo.show_ext_info;
            discoveryTabsRedDotImpClickStruct.f154977e = discoveryTabsRedDotImpClickStruct.mo86045b("showinfopath", "Discovery", true);
            discoveryTabsRedDotImpClickStruct.f154986n = nn12.f184506h;
            discoveryTabsRedDotImpClickStruct.f154981i = discoveryTabsRedDotImpClickStruct.mo86045b("reportext", str3, true);
            discoveryTabsRedDotImpClickStruct.f154984l = discoveryTabsRedDotImpClickStruct.mo86045b("RedDotShowInfoTitle", nn12.f184504f, true);
            discoveryTabsRedDotImpClickStruct.f154990r = (long) nn12.f184502d;
            C64702s7 s7Var = nn12.f184519x;
            if (s7Var == null || (f002 = s7Var.f185355d) == null || (wc4 = f002.f183066e) == null || (str2 = wc4.f186073d) == null) {
                str2 = "";
            }
            discoveryTabsRedDotImpClickStruct.f154989q = discoveryTabsRedDotImpClickStruct.mo86045b("subtitle", str2, true);
            discoveryTabsRedDotImpClickStruct.f154988p = (long) nn12.f184503e;
            discoveryTabsRedDotImpClickStruct.f154987o = discoveryTabsRedDotImpClickStruct.mo86045b("RedDotCountNumDetail", str, true);
        }
        discoveryTabsRedDotImpClickStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(discoveryTabsRedDotImpClickStruct);
    }
}
