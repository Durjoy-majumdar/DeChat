package p007bo;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.wechat.p326mm.biz.BizWechatNotifyDataChange;
import gy3.C87412m;
import kj2.C117407d;
import zt3.C119157j;

/* renamed from: bo.c */
public final class C16798c {

    /* renamed from: a */
    public static final C16798c f45395a = new C16798c();

    /* renamed from: b */
    public static final MultiProcessMMKV f45396b;

    /* renamed from: c */
    public static final BizWechatNotifyDataChange.Callback f45397c = new C16799a();

    /* renamed from: bo.c$a */
    public static final class C16799a implements BizWechatNotifyDataChange.Callback {

        /* renamed from: bo.c$a$a */
        public static final class C16800a implements Runnable {

            /* renamed from: d */
            public static final C16800a f45398d = new C16800a();

            public final void run() {
                C16798c.f45395a.mo17835a();
            }
        }

        public void onDataChangeEvent(int i) {
            ((C119157j) C119157j.f356862d).mo183876g(C16800a.f45398d, "BizFlutterDigestHelper");
        }

        public void onIDKeyEvent(int i, int i2, int i3) {
            C117407d.INSTANCE.mo182089r((long) i, (long) i2, (long) i3);
        }

        public void onInitDoneEvent(boolean z) {
            C16798c cVar = C16798c.f45395a;
            Log.m105924i("MicroMsg.BizFlutterDigestHelper", "onInitDoneEvent dbInitDone=" + z);
            C16813m mVar = C16813m.f45424a;
            C16813m.f45429f = z;
            if (z) {
                C16813m.f45428e = true;
            }
        }

        public void onKVEvent(int i, String str) {
            C115669n.INSTANCE.kvStat(i, str);
        }
    }

    static {
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV("brandService");
        C87412m.m108593f(singleMMKV, "getSingleMMKV(BizConstants.brandService)");
        f45396b = singleMMKV;
    }

    /* JADX WARNING: type inference failed for: r2v30, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0345  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17835a() {
        /*
            r22 = this;
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            bo.f r1 = p007bo.C16801f.f45399a
            boolean r1 = r1.mo17845e()
            if (r1 != 0) goto L_0x000b
            return
        L_0x000b:
            k40.a r1 = f40.C86709a0.m107533q(r0)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.v3 r1 = r1.mo96094Ku()
            com.tencent.mm.storage.i2 r1 = (com.tencent.p014mm.storage.C44660i2) r1
            java.lang.String r2 = "officialaccounts"
            com.tencent.mm.storage.h2 r3 = r1.mo69771j(r2)
            if (r3 != 0) goto L_0x0026
            com.tencent.mm.storage.h2 r3 = new com.tencent.mm.storage.h2
            r3.<init>(r2)
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            com.tencent.mm.storage.d1 r7 = rb0.C48009v0.Kx0()
            zh3.f r7 = r7.f55477d
            java.lang.String r8 = "SELECT * FROM BizTimeLineSingleMsgInfo order by createTime DESC limit 1"
            r9 = 0
            android.database.Cursor r7 = r7.rawQuery(r8, r9)
            boolean r8 = r7.moveToFirst()
            if (r8 == 0) goto L_0x0043
            com.tencent.mm.storage.o0 r8 = new com.tencent.mm.storage.o0
            r8.<init>()
            r8.convertFrom(r7)
            goto L_0x0044
        L_0x0043:
            r8 = r9
        L_0x0044:
            r7.close()
            bo.m r7 = p007bo.C16813m.f45424a
            com.tencent.wechat.mm.biz.BizManager r10 = r7.mo17857c()
            int r10 = r10.getLastMsgTime()
            long r10 = (long) r10
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            com.tencent.wechat.mm.biz.BizManager r12 = r7.mo17857c()
            com.tencent.wechat.mm.biz.BizProto$BizMsgInfo r12 = r12.getLastMsgInfo()
            if (r8 == 0) goto L_0x0063
            long r13 = r8.field_createTime
            goto L_0x0065
        L_0x0063:
            r13 = 0
        L_0x0065:
            r9 = 256(0x100, float:3.59E-43)
            r3.mo108373l3(r9)
            r9 = 128(0x80, float:1.794E-43)
            r3.mo108373l3(r9)
            long r16 = java.lang.Math.max(r10, r13)
            com.tencent.mm.pluginsdk.model.d$a r9 = com.tencent.p014mm.pluginsdk.model.C19428d.m20722S(r16)
            boolean r15 = r9.f54898a
            if (r15 == 0) goto L_0x0082
            boolean r9 = com.tencent.p014mm.storage.C19636w0.m21162d(r3, r6, r1, r9)
            if (r9 == 0) goto L_0x0082
            return
        L_0x0082:
            if (r12 == 0) goto L_0x008d
            com.tencent.wechat.mm.biz.BizManager r7 = r7.mo17857c()
            int r7 = r7.getUnReadCount()
            goto L_0x008e
        L_0x008d:
            r7 = 0
        L_0x008e:
            com.tencent.mm.storage.d1 r9 = rb0.C48009v0.Kx0()
            int r9 = r9.mo25734SE()
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x009d
            r18 = r13
            goto L_0x009f
        L_0x009d:
            r18 = r10
        L_0x009f:
            java.lang.String r15 = "BizLastMsgIsNotifyMsg"
            java.lang.String r4 = "BizLastMsgId"
            java.lang.String r5 = "MicroMsg.BizFlutterDigestHelper"
            r20 = r0
            r0 = 58
            if (r9 <= 0) goto L_0x021f
            int r21 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r21 > 0) goto L_0x00c8
            if (r8 == 0) goto L_0x00bc
            com.tencent.mm.storage.c0 r10 = com.tencent.p014mm.storage.C19601c0.f55446a
            long r13 = r8.field_msgId
            boolean r10 = r10.mo25720i(r13, r7)
            if (r10 == 0) goto L_0x00bc
            goto L_0x00c8
        L_0x00bc:
            r10 = 16
            r3.mo108371j3(r10)
            r3.mo108812g3(r7)
            r13 = r18
            goto L_0x0229
        L_0x00c8:
            r10 = 16
            r3.mo108373l3(r10)
            r3.mo108812g3(r9)
            gy3.C87412m.m108591d(r8)
            long r9 = r8.field_msgId
            long r11 = com.tencent.p014mm.storage.C19636w0.m21164f()
            r7 = 64
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x00e3
            r3.mo108373l3(r7)
            goto L_0x00e6
        L_0x00e3:
            r3.mo108371j3(r7)
        L_0x00e6:
            com.tencent.mm.storage.f4 r7 = new com.tencent.mm.storage.f4
            r7.<init>()
            java.lang.String r9 = r8.field_content
            r7.mo108732L2(r9)
            java.lang.String r9 = r8.field_talker
            r7.mo108749c3(r9)
            int r9 = r8.field_status
            r7.mo100991d(r9)
            long r9 = r8.field_createTime
            r7.mo108733M2(r9)
            long r9 = r8.field_msgId
            r7.setMsgId(r9)
            int r9 = r8.field_type
            r7.setType(r9)
            java.lang.String r9 = r8.f356046F
            r7.mo101012p4(r9)
            java.lang.String r9 = r8.field_imgPath
            r7.mo108739S2(r9)
            long r9 = eb0.C31543z5.m39453c()
            long r11 = r3.mo108821o2()
            long r9 = java.lang.Math.min(r9, r11)
            r3.mo101164o3(r7)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r7.mo108768t()
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = r7.getContent()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r3.mo108792M2(r0)
            int r0 = r7.getType()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r3.mo108806b3(r0)
            com.tencent.mm.storage.v3$b r0 = r1.mo69741L()
            if (r0 == 0) goto L_0x01b7
            com.tencent.mm.pointers.PString r0 = new com.tencent.mm.pointers.PString
            r0.<init>()
            com.tencent.mm.pointers.PString r11 = new com.tencent.mm.pointers.PString
            r11.<init>()
            com.tencent.mm.pointers.PInt r12 = new com.tencent.mm.pointers.PInt
            r12.<init>()
            r7.mo108749c3(r2)
            java.lang.String r2 = r3.getContent()
            r7.mo108732L2(r2)
            boolean r2 = r8.mo25760H2()
            if (r2 != 0) goto L_0x0181
            boolean r2 = r8.mo25756D2()
            if (r2 != 0) goto L_0x0181
            boolean r2 = r8.mo25755C2()
            if (r2 == 0) goto L_0x017c
            goto L_0x0181
        L_0x017c:
            r2 = 1
            p875ci.C67379u.m79740d(r7, r0, r11, r12, r2)
            goto L_0x018d
        L_0x0181:
            java.lang.String r2 = com.tencent.p014mm.storage.C19615i1.m21057d(r8)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r7 != 0) goto L_0x018d
            r0.value = r2
        L_0x018d:
            boolean r2 = r8.mo25757E2()
            if (r2 == 0) goto L_0x01a8
            com.tencent.mm.storage.i0 r2 = r8.f55532q1
            if (r2 == 0) goto L_0x019a
            java.lang.String r2 = r2.f55493c
            goto L_0x01a6
        L_0x019a:
            jw0.c r2 = jw0.C21290c.f60147a
            java.lang.String r7 = r8.field_content
            com.tencent.mm.storage.i0 r2 = r2.mo33268a(r7)
            r8.f55532q1 = r2
            java.lang.String r2 = r2.f55493c
        L_0x01a6:
            r0.value = r2
        L_0x01a8:
            java.lang.String r0 = r0.value
            r3.mo108794O2(r0)
            java.lang.String r0 = r11.value
            r3.mo108795P2(r0)
            int r0 = r12.value
            r3.mo108801W2(r0)
        L_0x01b7:
            r13 = r18
            long r9 = java.lang.Math.max(r9, r13)
            r3.mo108793N2(r9)
            if (r6 == 0) goto L_0x01c8
            long r0 = r1.mo69751W(r3)
            r2 = 1
            goto L_0x01d2
        L_0x01c8:
            java.lang.String r0 = r3.getUsername()
            r2 = 1
            int r0 = r1.mo69775m0(r3, r0, r2, r2)
            long r0 = (long) r0
        L_0x01d2:
            java.lang.String r7 = "brandService"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getSingleMMKV(r7)
            java.lang.String r9 = "getSingleMMKV(BizConstants.brandService)"
            gy3.C87412m.m108593f(r7, r9)
            long r9 = r8.field_msgId
            r7.encode((java.lang.String) r4, (long) r9)
            r7.encode((java.lang.String) r15, (boolean) r2)
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            r4[r1] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r4[r2] = r0
            r0 = 2
            long r1 = r3.mo108821o2()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4[r0] = r1
            r0 = 3
            int r1 = r3.mo108786G2()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r0] = r1
            r0 = 4
            long r1 = r8.field_msgId
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4[r0] = r1
            r0 = 5
            java.lang.String r1 = r8.field_talker
            r4[r0] = r1
            java.lang.String r0 = "doUpdateNotifyMsgDigest ret %d, shouldOfInsert %b, time %d, unread %d, msgId %d, talker:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r4)
            return
        L_0x021f:
            r13 = r18
            r2 = 16
            r3.mo108371j3(r2)
            r3.mo108812g3(r7)
        L_0x0229:
            long r7 = r12.getLocalId()
            r9 = 0
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x0258
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "doUpdateBizMainCell timeLineInfo is null, msgViewType: "
            r0.append(r2)
            int r2 = r12.getMsgViewType()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
            r3.mo101162m3()
            if (r6 != 0) goto L_0x0257
            java.lang.String r0 = r3.getUsername()
            r1.mo69773k0(r3, r0)
        L_0x0257:
            return
        L_0x0258:
            k40.a r2 = f40.C86709a0.m107533q(r20)
            f62.k0 r2 = (f62.C75700k0) r2
            com.tencent.mm.storage.u3 r2 = r2.mo96097Ni()
            java.lang.String r7 = r12.getUserName()
            com.tencent.mm.storage.z1 r2 = r2.get(r7)
            if (r2 == 0) goto L_0x0275
            boolean r2 = r2.mo62940x3()
            r7 = 1
            if (r2 != r7) goto L_0x0275
            r2 = 1
            goto L_0x0276
        L_0x0275:
            r2 = 0
        L_0x0276:
            r7 = 32
            if (r2 == 0) goto L_0x027e
            r3.mo108371j3(r7)
            goto L_0x0281
        L_0x027e:
            r3.mo108373l3(r7)
        L_0x0281:
            long r7 = eb0.C31543z5.m39453c()
            long r9 = r3.mo108821o2()
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0290
            r18 = r9
            goto L_0x0292
        L_0x0290:
            r18 = r7
        L_0x0292:
            boolean r2 = jw0.C21289b.m23812f(r12)
            java.lang.String r7 = ""
            if (r2 == 0) goto L_0x029d
            java.lang.String r2 = "285212721"
            goto L_0x02b7
        L_0x029d:
            boolean r2 = jw0.C21289b.m23810d(r12)
            if (r2 == 0) goto L_0x02a6
            java.lang.String r2 = "637534257"
            goto L_0x02b7
        L_0x02a6:
            boolean r2 = jw0.C21289b.m23811e(r12)
            if (r2 != 0) goto L_0x02b5
            boolean r2 = jw0.C21289b.m23813g(r12)
            if (r2 == 0) goto L_0x02b3
            goto L_0x02b5
        L_0x02b3:
            r2 = r7
            goto L_0x02b7
        L_0x02b5:
            java.lang.String r2 = "620757041"
        L_0x02b7:
            r3.mo108806b3(r2)
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            boolean r8 = jw0.C21289b.m23812f(r12)
            if (r8 == 0) goto L_0x02e2
            com.tencent.wechat.mm.biz.BizProto$BizMsgItemContent r8 = r12.getContent()
            java.util.List r8 = r8.getItemsList()
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            com.tencent.wechat.mm.biz.BizProto$BizMsgItem r8 = (com.tencent.wechat.p326mm.biz.BizProto.BizMsgItem) r8
            java.lang.String r8 = r8.getTitle()
            java.lang.String r9 = "content.itemsList[0].title"
            gy3.C87412m.m108593f(r8, r9)
            goto L_0x0346
        L_0x02e2:
            boolean r8 = jw0.C21289b.m23810d(r12)
            if (r8 == 0) goto L_0x02f9
            android.content.res.Resources r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r9 = 2131822626(0x7f110822, float:1.9278029E38)
            java.lang.String r8 = r8.getString(r9)
            java.lang.String r9 = "getResources().getString…R.string.biz_msg_ad_card)"
            gy3.C87412m.m108593f(r8, r9)
            goto L_0x0346
        L_0x02f9:
            boolean r8 = jw0.C21289b.m23811e(r12)
            if (r8 != 0) goto L_0x0308
            boolean r8 = jw0.C21289b.m23813g(r12)
            if (r8 == 0) goto L_0x0306
            goto L_0x0308
        L_0x0306:
            r8 = r7
            goto L_0x0346
        L_0x0308:
            boolean r8 = jw0.C21289b.m23813g(r12)
            if (r8 == 0) goto L_0x0319
            com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendArticle r8 = jw0.C21289b.m23809c(r12)
            if (r8 == 0) goto L_0x0324
            java.lang.String r9 = r8.getRecSummary()
            goto L_0x0325
        L_0x0319:
            com.tencent.wechat.mm.biz.BizCgiCardProto$BizRecommendExptMsg r8 = jw0.C21289b.m23807a(r12)
            if (r8 == 0) goto L_0x0324
            java.lang.String r9 = r8.getRecSummary()
            goto L_0x0325
        L_0x0324:
            r9 = 0
        L_0x0325:
            if (r9 == 0) goto L_0x0330
            boolean r8 = z04.C112551y.m153811k(r9)
            if (r8 == 0) goto L_0x032e
            goto L_0x0330
        L_0x032e:
            r8 = 0
            goto L_0x0331
        L_0x0330:
            r8 = 1
        L_0x0331:
            if (r8 == 0) goto L_0x0345
            android.content.res.Resources r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
            r9 = 2131822628(0x7f110824, float:1.9278033E38)
            java.lang.String r8 = r8.getString(r9)
            java.lang.String r9 = "{\n            MMApplicat…z_msg_rec_card)\n        }"
            gy3.C87412m.m108593f(r8, r9)
            goto L_0x0346
        L_0x0345:
            r8 = r9
        L_0x0346:
            java.lang.String r2 = r2.mo107067gL(r8)
            boolean r8 = jw0.C21289b.m23812f(r12)
            if (r8 == 0) goto L_0x0385
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r12.getUserName()
            r7.append(r8)
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = r7.toString()
            r3.mo108792M2(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "%s:"
            r0.append(r7)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.mo108794O2(r0)
            java.lang.String r0 = r12.getUserName()
            r3.mo108795P2(r0)
            goto L_0x038e
        L_0x0385:
            r3.mo108792M2(r2)
            r3.mo108794O2(r2)
            r3.mo108795P2(r7)
        L_0x038e:
            int r0 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0393
            goto L_0x0395
        L_0x0393:
            r13 = r18
        L_0x0395:
            r3.mo108793N2(r13)
            if (r6 == 0) goto L_0x039f
            long r0 = r1.mo69751W(r3)
            goto L_0x03a9
        L_0x039f:
            java.lang.String r0 = r3.getUsername()
            r2 = 1
            int r0 = r1.mo69775m0(r3, r0, r2, r2)
            long r0 = (long) r0
        L_0x03a9:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = f45396b
            if (r2 == 0) goto L_0x03b8
            long r7 = r12.getLocalId()
            r2.encode((java.lang.String) r4, (long) r7)
            r4 = 0
            r2.encode((java.lang.String) r15, (boolean) r4)
        L_0x03b8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "doUpdateBizMainCell ret "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = ", shouldOfInsert "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = ", time "
            r2.append(r0)
            long r0 = r3.mo108821o2()
            r2.append(r0)
            java.lang.String r0 = ", unreadCount "
            r2.append(r0)
            int r0 = r3.mo108786G2()
            r2.append(r0)
            java.lang.String r0 = ", msgId "
            r2.append(r0)
            long r0 = r12.getLocalId()
            r2.append(r0)
            java.lang.String r0 = ", userName:"
            r2.append(r0)
            java.lang.String r0 = r12.getUserName()
            r2.append(r0)
            java.lang.String r0 = ", msgViewType: "
            r2.append(r0)
            int r0 = r12.getMsgViewType()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007bo.C16798c.mo17835a():void");
    }
}
