package ds2;

import android.text.TextUtils;
import c03.C92332a;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.datatransport.config.TPProxyConfig;
import com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60200t1;
import org.json.JSONObject;
import xb0.C102609h;

/* renamed from: ds2.j */
public final class C97540j {

    /* renamed from: a */
    public static final C97540j f286244a = new C97540j();

    /* renamed from: b */
    public static final boolean f286245b = C102609h.m135510UY(2);

    /* renamed from: c */
    public static boolean f286246c;

    /* renamed from: a */
    public final boolean mo136809a() {
        SnsMethodCalculate.markStartTimeMs("enable", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        boolean z = false;
        if (!C94867e2.m120282a()) {
            Log.m105920e("MicroMsg.SnsVideoDownloadStrategy", "not enable for can not play online video");
            SnsMethodCalculate.markEndTimeMs("enable", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            return false;
        }
        SnsMethodCalculate.markStartTimeMs("enableTPPlayer", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_sns_tp, true);
        SnsMethodCalculate.markEndTimeMs("enableTPPlayer", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        if (!wf) {
            Log.m105920e("MicroMsg.SnsVideoDownloadStrategy", "not enable for can not use tp player");
            SnsMethodCalculate.markEndTimeMs("enable", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            return false;
        }
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_SNS_VDIEO_DOWNLOAD_INT_SYNC, 0);
        if (j == -2 || j == 1 || j == 2) {
            z = true;
        } else if (j != 3) {
            z = C31280k.f83760a.mo58046a();
        }
        Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "enable:" + z + " lastEnable:" + f286246c);
        if (f286246c != z) {
            f286246c = z;
            C94867e2.f274913a.evictAll();
        }
        SnsMethodCalculate.markEndTimeMs("enable", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: te3.kv2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: te3.kv2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: te3.kv2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: te3.kv2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: te3.kv2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0400 A[Catch:{ Exception -> 0x04fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0409 A[Catch:{ Exception -> 0x04fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x04b3 A[Catch:{ Exception -> 0x04fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04c1 A[Catch:{ Exception -> 0x04d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04c8 A[Catch:{ Exception -> 0x04d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x04d9 A[Catch:{ Exception -> 0x04fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0180  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo136810b(com.tencent.p014mm.plugin.sns.storage.SnsInfo r35, te3.C101804kv2 r36, boolean r37) {
        /*
            r34 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            java.lang.String r3 = ", "
            java.lang.String r4 = "updateMediaDownloadFlag"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            if (r0 != 0) goto L_0x0016
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x0016:
            if (r1 != 0) goto L_0x001c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x001c:
            boolean r6 = r34.mo136809a()
            java.lang.String r7 = "snsInfo.snsId"
            java.lang.String r8 = "media.Id"
            if (r6 == 0) goto L_0x05c7
            boolean r6 = f286245b
            if (r6 != 0) goto L_0x002e
            goto L_0x05c7
        L_0x002e:
            boolean r6 = r35.isAd()
            if (r6 != 0) goto L_0x05c1
            boolean r6 = r1.f298681N
            if (r6 == 0) goto L_0x003a
            goto L_0x05c1
        L_0x003a:
            hd0.n0 r6 = com.tencent.p014mm.plugin.sns.model.C94867e2.m120298q(r36)
            java.lang.String r9 = "MicroMsg.SnsVideoDownloadStrategy"
            r10 = 0
            r11 = 1
            if (r6 == 0) goto L_0x009b
            java.lang.String r0 = r6.f288533A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0055
            r1.f298687U = r10
            java.lang.String r0 = "media already download finish, null flag"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            goto L_0x0097
        L_0x0055:
            java.lang.String r0 = r6.f288533A
            int r0 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 86
            r2.append(r3)
            java.lang.String r3 = r6.f288533A
            java.lang.String r7 = "info.videoFlag"
            gy3.C87412m.m108593f(r3, r7)
            int r0 = r0 - r11
            java.lang.String r0 = r3.substring(r0)
            java.lang.String r3 = "this as java.lang.String).substring(startIndex)"
            gy3.C87412m.m108593f(r0, r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f298687U = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "media already download finish,flag:"
            r0.append(r1)
            java.lang.String r1 = r6.f288533A
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
        L_0x0097:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x009b:
            java.lang.String r6 = r35.getUserName()
            java.lang.String r12 = com.tencent.p014mm.plugin.sns.model.C94866e1.Mx0()
            boolean r17 = r6.equals(r12)
            com.tencent.mm.protocal.protobuf.SnsObject r6 = new com.tencent.mm.protocal.protobuf.SnsObject
            r6.<init>()
            byte[] r12 = r0.field_attrBuf
            pe3.a r6 = r6.parseFrom(r12)
            java.lang.String r12 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject"
            gy3.C87412m.m108592e(r6, r12)
            com.tencent.mm.protocal.protobuf.SnsObject r6 = (com.tencent.p014mm.protocal.protobuf.SnsObject) r6
            int r6 = r6.WeiShangFeedType
            java.lang.String r12 = "getCurrentDownloadVideoInfoFlag"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.SnsVideoLogic"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            java.lang.String r14 = r1.f298689d
            java.util.ArrayList r14 = hd0.C98429r0.m127825p(r14)
            java.lang.String r15 = "V2"
            if (r14 == 0) goto L_0x015b
            int r20 = r14.size()
            if (r20 != 0) goto L_0x00d5
            goto L_0x015b
        L_0x00d5:
            java.util.Iterator r14 = r14.iterator()
        L_0x00d9:
            boolean r20 = r14.hasNext()
            if (r20 == 0) goto L_0x0157
            java.lang.Object r20 = r14.next()
            r11 = r20
            hd0.n0 r11 = (hd0.C98408n0) r11
            java.lang.String r10 = r11.f288533A
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = r11.f288533A
            boolean r10 = r10.contains(r15)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = r11.f288533A
            java.lang.String r0 = "V1"
            boolean r0 = r10.contains(r0)
            if (r0 != 0) goto L_0x010f
            java.lang.String r0 = r11.f288533A
            java.lang.String r10 = "V0"
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r0 = r35
            goto L_0x00d9
        L_0x010f:
            r0 = 3
            java.lang.Object[] r10 = new java.lang.Object[r0]
            java.lang.String r0 = r1.f298689d
            r14 = 0
            r10[r14] = r0
            java.lang.String r0 = r11.f288533A
            r14 = 1
            r10[r14] = r0
            java.lang.String r0 = r11.f288534B
            r14 = 2
            r10[r14] = r0
            java.lang.String r0 = "MicroMsg.SnsVideoLogic"
            java.lang.String r14 = "getCurrentDownloadVideoInfoFlag for play mediaid:%s flag:%s path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r14, r10)
            java.lang.String r0 = r11.f288533A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0134
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            goto L_0x015e
        L_0x0134:
            java.lang.String r0 = r11.f288533A
            int r0 = r0.length()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r14 = "V"
            r10.append(r14)
            java.lang.String r11 = r11.f288533A
            r14 = 1
            int r0 = r0 - r14
            java.lang.String r0 = r11.substring(r0)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            goto L_0x015f
        L_0x0157:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            goto L_0x015e
        L_0x015b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
        L_0x015e:
            r0 = 0
        L_0x015f:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x0180
            r1.f298687U = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "resume hd video download,flag:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x0180:
            float r10 = r1.f298684R
            r11 = 1000(0x3e8, float:1.401E-42)
            float r11 = (float) r11
            float r10 = r10 * r11
            int r11 = c03.C92332a.f264193g
            float r11 = (float) r11
            java.lang.String r12 = "media.downloadFlag"
            java.lang.String r14 = " flag:"
            java.lang.String r13 = " smallWindow:"
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 > 0) goto L_0x01fb
            if (r0 != 0) goto L_0x0198
            goto L_0x0199
        L_0x0198:
            r15 = r0
        L_0x0199:
            r1.f298687U = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "duration limit ms ,updateMediaDownloadFlag mediaId:"
            r0.append(r3)
            java.lang.String r3 = r1.f298689d
            r0.append(r3)
            r0.append(r13)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r2 = r1.f298687U
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            l03.f r13 = l03.C99279f.f291124a
            java.lang.String r0 = r1.f298689d
            r14 = r0
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r0 = r35.getSnsId()
            r15 = r0
            gy3.C87412m.m108593f(r0, r7)
            r18 = 0
            r19 = 0
            java.lang.String r0 = r1.f298687U
            r20 = r0
            gy3.C87412m.m108593f(r0, r12)
            r21 = 8
            r22 = 0
            r24 = 0
            ds2.k r0 = ds2.C31280k.f83760a
            boolean r25 = r0.mo58047b()
            int r26 = r0.mo58048c()
            boolean r27 = r0.mo58049d()
            r28 = 784(0x310, float:1.099E-42)
            r29 = 0
            r16 = r6
            l03.C99279f.m129430c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x01fb:
            if (r2 == 0) goto L_0x0548
            java.lang.String r10 = " mediaid:"
            java.lang.String r11 = "snsid:"
            if (r17 == 0) goto L_0x0269
            if (r0 != 0) goto L_0x0207
            goto L_0x0208
        L_0x0207:
            r15 = r0
        L_0x0208:
            r1.f298687U = r15
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r2 = r35.getSnsId()
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = r1.f298689d
            r0.append(r2)
            java.lang.String r2 = " get high media for self"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            l03.f r13 = l03.C99279f.f291124a
            java.lang.String r0 = r1.f298689d
            r14 = r0
            gy3.C87412m.m108593f(r0, r8)
            java.lang.String r0 = r35.getSnsId()
            r15 = r0
            gy3.C87412m.m108593f(r0, r7)
            r18 = 0
            r19 = 0
            java.lang.String r0 = r1.f298687U
            r20 = r0
            gy3.C87412m.m108593f(r0, r12)
            r21 = 10
            r22 = 0
            r24 = 0
            ds2.k r0 = ds2.C31280k.f83760a
            boolean r25 = r0.mo58047b()
            int r26 = r0.mo58048c()
            boolean r27 = r0.mo58049d()
            r28 = 784(0x310, float:1.099E-42)
            r29 = 0
            r16 = r6
            l03.C99279f.m129430c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            return
        L_0x0269:
            ds2.k r12 = ds2.C31280k.f83760a
            r21 = r13
            int r13 = r12.mo58048c()
            r30 = r4
            java.lang.String r4 = "error"
            r31 = r5
            java.lang.String r5 = "downloadFlag"
            java.lang.String r2 = "snsId"
            r22 = r15
            java.lang.String r15 = "Id"
            r23 = r14
            java.lang.String r14 = "V4"
            r24 = -2
            r25 = r8
            java.lang.String r8 = " get low media for weishang"
            r26 = r3
            r3 = 2
            if (r13 != r3) goto L_0x0316
            r3 = 1
            if (r6 != r3) goto L_0x02c6
            boolean r3 = r12.mo58049d()     // Catch:{ Exception -> 0x02c0 }
            if (r3 == 0) goto L_0x02c6
            r1.f298687U = r14     // Catch:{ Exception -> 0x02c0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02c0 }
            r0.<init>()     // Catch:{ Exception -> 0x02c0 }
            r0.append(r11)     // Catch:{ Exception -> 0x02c0 }
            java.lang.String r3 = r35.getSnsId()     // Catch:{ Exception -> 0x02c0 }
            r0.append(r3)     // Catch:{ Exception -> 0x02c0 }
            r0.append(r10)     // Catch:{ Exception -> 0x02c0 }
            java.lang.String r3 = r1.f298689d     // Catch:{ Exception -> 0x02c0 }
            r0.append(r3)     // Catch:{ Exception -> 0x02c0 }
            r0.append(r8)     // Catch:{ Exception -> 0x02c0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x02c0 }
            r18 = 1
            r19 = -2
            goto L_0x02d0
        L_0x02c0:
            r0 = move-exception
            r5 = r21
            r10 = r23
            goto L_0x030a
        L_0x02c6:
            if (r0 != 0) goto L_0x02ca
            r0 = r22
        L_0x02ca:
            r1.f298687U = r0     // Catch:{ Exception -> 0x02c0 }
            r18 = 0
            r19 = 2
        L_0x02d0:
            l03.f r13 = l03.C99279f.f291124a     // Catch:{ Exception -> 0x02c0 }
            java.lang.String r14 = r1.f298689d     // Catch:{ Exception -> 0x02c0 }
            java.lang.String r0 = r35.getSnsId()     // Catch:{ Exception -> 0x02c0 }
            java.lang.String r3 = r1.f298687U     // Catch:{ Exception -> 0x02c0 }
            boolean r25 = r12.mo58047b()     // Catch:{ Exception -> 0x02c0 }
            int r26 = r12.mo58048c()     // Catch:{ Exception -> 0x02c0 }
            boolean r27 = r12.mo58049d()     // Catch:{ Exception -> 0x02c0 }
            gy3.C87412m.m108593f(r14, r15)     // Catch:{ Exception -> 0x02c0 }
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x02c0 }
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x02c0 }
            r2 = 7
            r7 = 0
            r24 = 0
            r28 = 768(0x300, float:1.076E-42)
            r29 = 0
            r5 = r21
            r10 = r23
            r15 = r0
            r16 = r6
            r20 = r3
            r21 = r2
            r22 = r7
            l03.C99279f.m129430c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0309 }
            goto L_0x0310
        L_0x0309:
            r0 = move-exception
        L_0x030a:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r4, r2)
        L_0x0310:
            r33 = r5
            r32 = r10
            goto L_0x058e
        L_0x0316:
            r3 = r23
            int r13 = r12.mo58048c()
            r32 = r3
            r3 = 1
            if (r13 != r3) goto L_0x050c
            if (r6 != r3) goto L_0x0391
            boolean r3 = r12.mo58049d()     // Catch:{ Exception -> 0x0389 }
            if (r3 == 0) goto L_0x0391
            r1.f298687U = r14     // Catch:{ Exception -> 0x0389 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0389 }
            r0.<init>()     // Catch:{ Exception -> 0x0389 }
            r0.append(r11)     // Catch:{ Exception -> 0x0389 }
            java.lang.String r3 = r35.getSnsId()     // Catch:{ Exception -> 0x0389 }
            r0.append(r3)     // Catch:{ Exception -> 0x0389 }
            r0.append(r10)     // Catch:{ Exception -> 0x0389 }
            java.lang.String r3 = r1.f298689d     // Catch:{ Exception -> 0x0389 }
            r0.append(r3)     // Catch:{ Exception -> 0x0389 }
            r0.append(r8)     // Catch:{ Exception -> 0x0389 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0389 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x0389 }
            l03.f r13 = l03.C99279f.f291124a     // Catch:{ Exception -> 0x0389 }
            java.lang.String r14 = r1.f298689d     // Catch:{ Exception -> 0x0389 }
            java.lang.String r0 = r35.getSnsId()     // Catch:{ Exception -> 0x0389 }
            java.lang.String r3 = r1.f298687U     // Catch:{ Exception -> 0x0389 }
            boolean r25 = r12.mo58047b()     // Catch:{ Exception -> 0x0389 }
            int r26 = r12.mo58048c()     // Catch:{ Exception -> 0x0389 }
            boolean r27 = r12.mo58049d()     // Catch:{ Exception -> 0x0389 }
            gy3.C87412m.m108593f(r14, r15)     // Catch:{ Exception -> 0x0389 }
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x0389 }
            r18 = 1
            r19 = -2
            gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x0389 }
            r2 = 11
            r22 = 0
            r24 = 0
            r28 = 768(0x300, float:1.076E-42)
            r29 = 0
            r8 = r21
            r15 = r0
            r16 = r6
            r20 = r3
            r21 = r2
            l03.C99279f.m129430c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x04ff }
            r33 = r8
            goto L_0x058e
        L_0x0389:
            r0 = move-exception
            r8 = r21
        L_0x038c:
            r1 = r4
            r33 = r8
            goto L_0x0502
        L_0x0391:
            r8 = r21
            ds2.h r3 = ds2.C97535h.f286229a     // Catch:{ Exception -> 0x04ff }
            java.lang.String r10 = r35.getSnsId()     // Catch:{ Exception -> 0x04ff }
            gy3.C87412m.m108593f(r10, r7)     // Catch:{ Exception -> 0x04ff }
            ds2.a r3 = r3.mo136805e(r10)     // Catch:{ Exception -> 0x04ff }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04ff }
            r7.<init>()     // Catch:{ Exception -> 0x04ff }
            java.lang.String r10 = "getPredictType >> "
            r7.append(r10)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r10 = r35.getSnsId()     // Catch:{ Exception -> 0x04ff }
            r7.append(r10)     // Catch:{ Exception -> 0x04ff }
            r10 = r26
            r7.append(r10)     // Catch:{ Exception -> 0x04ff }
            java.lang.String r11 = "getPredictType"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.model.config.KaraPredictItem"
            if (r3 == 0) goto L_0x03cc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)     // Catch:{ Exception -> 0x03c7 }
            r33 = r8
            ds2.b r8 = r3.f286211a     // Catch:{ Exception -> 0x04fd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)     // Catch:{ Exception -> 0x04fd }
            goto L_0x03cf
        L_0x03c7:
            r0 = move-exception
            r33 = r8
            goto L_0x04bf
        L_0x03cc:
            r33 = r8
            r8 = 0
        L_0x03cf:
            r7.append(r8)     // Catch:{ Exception -> 0x04fd }
            r7.append(r10)     // Catch:{ Exception -> 0x04fd }
            java.lang.String r8 = r1.f298689d     // Catch:{ Exception -> 0x04fd }
            r7.append(r8)     // Catch:{ Exception -> 0x04fd }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x04fd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)     // Catch:{ Exception -> 0x04fd }
            if (r3 == 0) goto L_0x03f6
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r13)     // Catch:{ Exception -> 0x04fd }
            ds2.b r7 = r3.f286211a     // Catch:{ Exception -> 0x04fd }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r13)     // Catch:{ Exception -> 0x04fd }
            if (r7 == 0) goto L_0x03f6
            int r7 = r7.getType()     // Catch:{ Exception -> 0x04fd }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x04fd }
            goto L_0x03f7
        L_0x03f6:
            r10 = 0
        L_0x03f7:
            ds2.b r7 = ds2.C97530b.FINISH_V4     // Catch:{ Exception -> 0x04fd }
            int r7 = r7.getType()     // Catch:{ Exception -> 0x04fd }
            r8 = 4
            if (r10 != 0) goto L_0x0403
        L_0x0400:
            r11 = r25
            goto L_0x041b
        L_0x0403:
            int r11 = r10.intValue()     // Catch:{ Exception -> 0x04fd }
            if (r11 != r7) goto L_0x0400
            r1.f298687U = r14     // Catch:{ Exception -> 0x04fd }
            l03.e r0 = l03.C34152e.f92126a     // Catch:{ Exception -> 0x04fd }
            java.lang.String r7 = r1.f298689d     // Catch:{ Exception -> 0x04fd }
            r11 = r25
            gy3.C87412m.m108593f(r7, r11)     // Catch:{ Exception -> 0x04fd }
            r0.mo59467a(r7, r8)     // Catch:{ Exception -> 0x04fd }
            r11 = 1
            r19 = -2
            goto L_0x043e
        L_0x041b:
            ds2.b r7 = ds2.C97530b.FINISH_V2     // Catch:{ Exception -> 0x04fd }
            int r7 = r7.getType()     // Catch:{ Exception -> 0x04fd }
            if (r10 != 0) goto L_0x0424
            goto L_0x0443
        L_0x0424:
            int r14 = r10.intValue()     // Catch:{ Exception -> 0x04fd }
            if (r14 != r7) goto L_0x0443
            if (r0 != 0) goto L_0x042e
            r0 = r22
        L_0x042e:
            r1.f298687U = r0     // Catch:{ Exception -> 0x04fd }
            l03.e r0 = l03.C34152e.f92126a     // Catch:{ Exception -> 0x04fd }
            java.lang.String r7 = r1.f298689d     // Catch:{ Exception -> 0x04fd }
            gy3.C87412m.m108593f(r7, r11)     // Catch:{ Exception -> 0x04fd }
            r10 = 3
            r0.mo59467a(r7, r10)     // Catch:{ Exception -> 0x04fd }
            r11 = 0
            r19 = 2
        L_0x043e:
            r18 = r11
            r21 = 4
            goto L_0x04a7
        L_0x0443:
            ds2.b r7 = ds2.C97530b.SUBMIT     // Catch:{ Exception -> 0x04fd }
            int r7 = r7.getType()     // Catch:{ Exception -> 0x04fd }
            if (r10 != 0) goto L_0x044c
            goto L_0x0465
        L_0x044c:
            int r8 = r10.intValue()     // Catch:{ Exception -> 0x04fd }
            if (r8 != r7) goto L_0x0465
            if (r0 != 0) goto L_0x0456
            r0 = r22
        L_0x0456:
            r1.f298687U = r0     // Catch:{ Exception -> 0x04fd }
            l03.e r0 = l03.C34152e.f92126a     // Catch:{ Exception -> 0x04fd }
            java.lang.String r7 = r1.f298689d     // Catch:{ Exception -> 0x04fd }
            gy3.C87412m.m108593f(r7, r11)     // Catch:{ Exception -> 0x04fd }
            r8 = 1
            r0.mo59467a(r7, r8)     // Catch:{ Exception -> 0x04fd }
            r8 = 2
            goto L_0x0486
        L_0x0465:
            ds2.b r7 = ds2.C97530b.START     // Catch:{ Exception -> 0x04fd }
            int r7 = r7.getType()     // Catch:{ Exception -> 0x04fd }
            if (r10 != 0) goto L_0x046f
        L_0x046d:
            r8 = 2
            goto L_0x048e
        L_0x046f:
            int r8 = r10.intValue()     // Catch:{ Exception -> 0x04fd }
            if (r8 != r7) goto L_0x046d
            if (r0 != 0) goto L_0x0479
            r0 = r22
        L_0x0479:
            r1.f298687U = r0     // Catch:{ Exception -> 0x04fd }
            l03.e r0 = l03.C34152e.f92126a     // Catch:{ Exception -> 0x04fd }
            java.lang.String r7 = r1.f298689d     // Catch:{ Exception -> 0x04fd }
            gy3.C87412m.m108593f(r7, r11)     // Catch:{ Exception -> 0x04fd }
            r8 = 2
            r0.mo59467a(r7, r8)     // Catch:{ Exception -> 0x04fd }
        L_0x0486:
            r0 = 6
            r18 = 0
            r19 = 2
            r21 = 6
            goto L_0x04a7
        L_0x048e:
            if (r0 != 0) goto L_0x0492
            r0 = r22
        L_0x0492:
            r1.f298687U = r0     // Catch:{ Exception -> 0x04fd }
            l03.e r0 = l03.C34152e.f92126a     // Catch:{ Exception -> 0x04fd }
            java.lang.String r7 = r1.f298689d     // Catch:{ Exception -> 0x04fd }
            gy3.C87412m.m108593f(r7, r11)     // Catch:{ Exception -> 0x04fd }
            r10 = 5
            r0.mo59467a(r7, r10)     // Catch:{ Exception -> 0x04fd }
            r0 = 9
            r18 = 0
            r19 = 2
            r21 = 9
        L_0x04a7:
            l03.f r0 = l03.C99279f.f291124a     // Catch:{ Exception -> 0x04fd }
            java.lang.String r14 = r1.f298689d     // Catch:{ Exception -> 0x04fd }
            java.lang.String r7 = r35.getSnsId()     // Catch:{ Exception -> 0x04fd }
            java.lang.String r8 = r1.f298687U     // Catch:{ Exception -> 0x04fd }
            if (r3 == 0) goto L_0x04c1
            java.lang.String r10 = "getPredictStartTime"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r13)     // Catch:{ Exception -> 0x04fd }
            r11 = r0
            long r0 = r3.f286212b     // Catch:{ Exception -> 0x04d7 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r13)     // Catch:{ Exception -> 0x04d7 }
            goto L_0x04c4
        L_0x04bf:
            r1 = r4
            goto L_0x0502
        L_0x04c1:
            r11 = r0
            r0 = 0
        L_0x04c4:
            r22 = r0
            if (r3 == 0) goto L_0x04d9
            java.lang.String r0 = "getPredictCost"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r13)     // Catch:{ Exception -> 0x04d7 }
            r1 = r4
            long r3 = r3.f286213c     // Catch:{ Exception -> 0x04fb }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r13)     // Catch:{ Exception -> 0x04fb }
            int r0 = (int) r3     // Catch:{ Exception -> 0x04fb }
            r24 = r0
            goto L_0x04dc
        L_0x04d7:
            r0 = move-exception
            goto L_0x04bf
        L_0x04d9:
            r1 = r4
            r24 = 0
        L_0x04dc:
            boolean r25 = r12.mo58047b()     // Catch:{ Exception -> 0x04fb }
            int r26 = r12.mo58048c()     // Catch:{ Exception -> 0x04fb }
            boolean r27 = r12.mo58049d()     // Catch:{ Exception -> 0x04fb }
            gy3.C87412m.m108593f(r14, r15)     // Catch:{ Exception -> 0x04fb }
            gy3.C87412m.m108593f(r7, r2)     // Catch:{ Exception -> 0x04fb }
            gy3.C87412m.m108593f(r8, r5)     // Catch:{ Exception -> 0x04fb }
            r13 = r11
            r15 = r7
            r16 = r6
            r20 = r8
            r13.mo138690b(r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27)     // Catch:{ Exception -> 0x04fb }
            goto L_0x0508
        L_0x04fb:
            r0 = move-exception
            goto L_0x0502
        L_0x04fd:
            r0 = move-exception
            goto L_0x04bf
        L_0x04ff:
            r0 = move-exception
            goto L_0x038c
        L_0x0502:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r1, r2)
        L_0x0508:
            r1 = r36
            goto L_0x058e
        L_0x050c:
            r33 = r21
            r1.f298687U = r14
            l03.f r13 = l03.C99279f.f291124a
            java.lang.String r0 = r1.f298689d
            r14 = r0
            java.lang.String r3 = r35.getSnsId()
            r4 = r15
            r15 = r3
            java.lang.String r7 = r1.f298687U
            r20 = r7
            boolean r25 = r12.mo58047b()
            int r26 = r12.mo58048c()
            boolean r27 = r12.mo58049d()
            gy3.C87412m.m108593f(r0, r4)
            gy3.C87412m.m108593f(r3, r2)
            r18 = 1
            r19 = -2
            gy3.C87412m.m108593f(r7, r5)
            r21 = 7
            r22 = 0
            r24 = 0
            r28 = 768(0x300, float:1.076E-42)
            r29 = 0
            r16 = r6
            l03.C99279f.m129430c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29)
            goto L_0x058e
        L_0x0548:
            r30 = r4
            r31 = r5
            r11 = r8
            r33 = r13
            r32 = r14
            r22 = r15
            if (r0 != 0) goto L_0x0558
            r15 = r22
            goto L_0x0559
        L_0x0558:
            r15 = r0
        L_0x0559:
            r1.f298687U = r15
            l03.f r13 = l03.C99279f.f291124a
            java.lang.String r0 = r1.f298689d
            r14 = r0
            gy3.C87412m.m108593f(r0, r11)
            java.lang.String r0 = r35.getSnsId()
            r15 = r0
            gy3.C87412m.m108593f(r0, r7)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            ds2.k r0 = ds2.C31280k.f83760a
            boolean r25 = r0.mo58047b()
            int r26 = r0.mo58048c()
            boolean r27 = r0.mo58049d()
            r28 = 1008(0x3f0, float:1.413E-42)
            r29 = 0
            r16 = r6
            l03.C99279f.m129430c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29)
        L_0x058e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "updateMediaDownloadFlag mediaId:"
            r0.append(r2)
            java.lang.String r2 = r1.f298689d
            r0.append(r2)
            r2 = r33
            r0.append(r2)
            r2 = r37
            r0.append(r2)
            r2 = r32
            r0.append(r2)
            java.lang.String r1 = r1.f298687U
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r2 = r30
            r3 = r31
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x05c1:
            r2 = r4
            r3 = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        L_0x05c7:
            r2 = r4
            r3 = r5
            r11 = r8
            l03.f r12 = l03.C99279f.f291124a
            java.lang.String r0 = r1.f298689d
            r13 = r0
            gy3.C87412m.m108593f(r0, r11)
            java.lang.String r0 = r35.getSnsId()
            r14 = r0
            gy3.C87412m.m108593f(r0, r7)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            ds2.k r0 = ds2.C31280k.f83760a
            boolean r24 = r0.mo58047b()
            int r25 = r0.mo58048c()
            boolean r26 = r0.mo58049d()
            r27 = 1020(0x3fc, float:1.43E-42)
            r28 = 0
            l03.C99279f.m129430c(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ds2.C97540j.mo136810b(com.tencent.mm.plugin.sns.storage.SnsInfo, te3.kv2, boolean):void");
    }

    /* renamed from: c */
    public final void mo136811c() {
        SnsMethodCalculate.markStartTimeMs("updateTPPlayerConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
        if (mo136809a()) {
            Log.m105924i("MicroMsg.SnsVideoDownloadStrategy", "updateTPPlayerConfig");
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_sns_switch_video_config, "");
            C87412m.m108593f(Y60, "getService(IExptService:…_switch_video_config, \"\")");
            Log.m105924i("MicroMsg.TPConfig", "updateTPConfig serverConfig:" + Y60);
            if (!TextUtils.isEmpty(Y60)) {
                try {
                    JSONObject jSONObject = new JSONObject(Y60);
                    C92332a.f264187a = jSONObject.optInt("local_buffer_kb", C92332a.f264187a);
                    C92332a.f264188b = jSONObject.optInt("local_send_socket_kb", C92332a.f264188b);
                    C92332a.f264189c = jSONObject.optBoolean("switch_strategy_enable", C92332a.f264189c);
                    C92332a.f264190d = jSONObject.optLong("buffer_packet_ms", C92332a.f264190d);
                    C92332a.f264191e = jSONObject.optLong("left_packet_queue_ms", C92332a.f264191e);
                    C92332a.f264192f = jSONObject.optInt("tcp_recv_buffer_kb", C92332a.f264192f);
                    C92332a.f264193g = jSONObject.optInt("switch_video_limit_ms", C92332a.f264193g);
                    Log.m105924i("MicroMsg.TPConfig", "updateTPConfig TP_LOCAL_BUFFER_KB:" + C92332a.f264187a + " TP_LOCAL_SEND_SOCKET_KB:" + C92332a.f264188b + " TP_SWITCH_STRATEGY_ENABLE:" + C92332a.f264189c + " TP_BUFFER_PACKET_MS:" + C92332a.f264190d + " TP_LEFT_PACKET_QUEUE_MS:" + C92332a.f264191e + " TP_TCP_RECV_BUFFER_KB:" + C92332a.f264192f);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.TPConfig", e, "updateTPConfig parse json error!", new Object[0]);
                }
            }
            TPProxyServiceConfig tPProxyServiceConfig = new TPProxyServiceConfig();
            tPProxyServiceConfig.serviceType = 100;
            tPProxyServiceConfig.dataDir = ((C60200t1) C86312j.m106911c(C60200t1.class)).lr0();
            JSONObject jSONObject2 = new JSONObject();
            int i = C92332a.f264187a;
            if (i * 1024 > 0) {
                jSONObject2.put("key_localserver_buffer_size", i * 1024);
            }
            int i2 = C92332a.f264188b;
            if (i2 * 1024 > 0) {
                jSONObject2.put("key_localserver_send_socket_buffer_size", i2 * 1024);
            }
            tPProxyServiceConfig.initConfig = jSONObject2.toString();
            TPProxyConfig.setProxyConfig(tPProxyServiceConfig);
        }
        SnsMethodCalculate.markEndTimeMs("updateTPPlayerConfig", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
    }
}
