package iz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C86497v5;
import hz0.C46153l0;
import ob0.C35136m;
import sf0.C48374j0;

/* renamed from: iz0.c */
public class C33468c implements C86497v5.C31521b {

    /* renamed from: iz0.c$a */
    public class C33469a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f90642d;

        /* renamed from: e */
        public final /* synthetic */ C35136m.C35137a f90643e;

        public C33469a(C33468c cVar, String str, C35136m.C35137a aVar) {
            this.f90642d = str;
            this.f90643e = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:174:0x0894  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x089b  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x08f4  */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x092a  */
        /* JADX WARNING: Removed duplicated region for block: B:191:0x0950  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x096f  */
        /* JADX WARNING: Removed duplicated region for block: B:226:0x0ac7  */
        /* JADX WARNING: Removed duplicated region for block: B:260:0x0b82  */
        /* JADX WARNING: Removed duplicated region for block: B:268:0x0ba1  */
        /* JADX WARNING: Removed duplicated region for block: B:276:0x0bc1  */
        /* JADX WARNING: Removed duplicated region for block: B:279:0x0bd4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                gz0.o r2 = hz0.C46153l0.Bx0()
                java.lang.String r0 = r1.f90642d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = ""
                r3.append(r4)
                ob0.m$a r5 = r1.f90643e
                te3.j3 r5 = r5.f94242a
                long r5 = r5.f227638r
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r2.getClass()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "card onReceiveMsg msgId is "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "MicroMsg.CardMsgManager"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 == 0) goto L_0x0040
                goto L_0x0d22
            L_0x0040:
                java.lang.String r5 = "sysmsg"
                r7 = 0
                java.util.Map r5 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r5, r7)
                java.lang.String r8 = ".code_id"
                r9 = 100
                r10 = 2
                r11 = 1
                r12 = 0
                if (r5 != 0) goto L_0x0055
                r13 = r7
                r11 = r8
                goto L_0x0737
            L_0x0055:
                hz0.f r13 = new hz0.f
                r13.<init>()
                java.lang.String r0 = ".sysmsg.carditemmsg.card_type"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r14 = android.text.TextUtils.isEmpty(r0)
                if (r14 != 0) goto L_0x0075
                boolean r14 = wz0.C22945n.m27025y(r0)
                if (r14 == 0) goto L_0x0075
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
                r13.field_card_type = r0
                goto L_0x0077
            L_0x0075:
                r13.field_card_type = r12
            L_0x0077:
                java.lang.String r0 = ".sysmsg.carditemmsg.title"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_title = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.description"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_description = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.logo_url"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_logo_url = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.logo_color"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_logo_color = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.time"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r14 = android.text.TextUtils.isEmpty(r0)
                r15 = 2147483647(0x7fffffff, float:NaN)
                r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
                r18 = 1000(0x3e8, double:4.94E-321)
                if (r14 != 0) goto L_0x00d1
                boolean r14 = wz0.C22945n.m27025y(r0)
                if (r14 == 0) goto L_0x00d1
                r20 = r8
                r7 = 0
                long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r0, r7)
                int r21 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
                if (r21 < 0) goto L_0x00ca
                r13.field_time = r15
                goto L_0x00dc
            L_0x00ca:
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
                r13.field_time = r0
                goto L_0x00dc
            L_0x00d1:
                r20 = r8
                long r7 = java.lang.System.currentTimeMillis()
                long r7 = r7 / r18
                int r0 = (int) r7
                r13.field_time = r0
            L_0x00dc:
                java.lang.String r0 = ".sysmsg.carditemmsg.card_id"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_card_id = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.card_tp_id"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_card_tp_id = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.msg_id"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_msg_id = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.msg_type"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                if (r7 != 0) goto L_0x0115
                boolean r7 = wz0.C22945n.m27025y(r0)
                if (r7 == 0) goto L_0x0115
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
                r13.field_msg_type = r0
                goto L_0x0117
            L_0x0115:
                r13.field_msg_type = r12
            L_0x0117:
                java.lang.String r0 = ".sysmsg.carditemmsg.jump_type"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                if (r7 != 0) goto L_0x0132
                boolean r7 = wz0.C22945n.m27025y(r0)
                if (r7 == 0) goto L_0x0132
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
                r13.field_jump_type = r0
                goto L_0x0134
            L_0x0132:
                r13.field_jump_type = r11
            L_0x0134:
                java.lang.String r0 = ".sysmsg.carditemmsg.url"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_url = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.button.text"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                java.lang.String r8 = "MicroMsg.CardMsgInfo"
                if (r7 != 0) goto L_0x0199
                te3.fn r7 = new te3.fn
                r7.<init>()
                r7.f133591e = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.button.url"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r7.f133592f = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.button.action_type"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r21 = android.text.TextUtils.isEmpty(r0)
                if (r21 != 0) goto L_0x017a
                boolean r21 = wz0.C22945n.m27025y(r0)
                if (r21 == 0) goto L_0x017a
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
                r7.f133590d = r0
                goto L_0x017c
            L_0x017a:
                r7.f133590d = r12
            L_0x017c:
                r13.f124367X0 = r7
                byte[] r0 = r7.toByteArray()     // Catch:{ Exception -> 0x0185 }
                r13.field_buttonData = r0     // Catch:{ Exception -> 0x0185 }
                goto L_0x0199
            L_0x0185:
                r0 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r11]
                java.lang.String r21 = r0.getMessage()
                r7[r12] = r21
                java.lang.String r14 = "setCardButton fail, ex = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r14, r7)
                java.lang.Object[] r7 = new java.lang.Object[r12]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r4, r7)
            L_0x0199:
                java.lang.String r0 = ".sysmsg.carditemmsg.opt_region.text"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                if (r7 != 0) goto L_0x0225
                te3.yn r7 = new te3.yn
                r7.<init>()
                r7.f145414e = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.opt_region.url"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r7.f145415f = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.opt_region.type"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r14 = android.text.TextUtils.isEmpty(r0)
                if (r14 != 0) goto L_0x01d3
                boolean r14 = wz0.C22945n.m27025y(r0)
                if (r14 == 0) goto L_0x01d3
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
                r7.f145413d = r0
                goto L_0x01d5
            L_0x01d3:
                r7.f145413d = r12
            L_0x01d5:
                java.lang.String r0 = ".sysmsg.carditemmsg.opt_region.endtime"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r14 = android.text.TextUtils.isEmpty(r0)
                if (r14 != 0) goto L_0x01ff
                boolean r14 = wz0.C22945n.m27025y(r0)
                if (r14 == 0) goto L_0x01ff
                java.lang.Long r14 = java.lang.Long.valueOf(r0)
                long r18 = r14.longValue()
                int r14 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
                if (r14 < 0) goto L_0x01f8
                r7.f145416g = r15
                goto L_0x0208
            L_0x01f8:
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
                r7.f145416g = r0
                goto L_0x0208
            L_0x01ff:
                long r14 = java.lang.System.currentTimeMillis()
                long r14 = r14 / r18
                int r0 = (int) r14
                r7.f145416g = r0
            L_0x0208:
                r13.f124368Y0 = r7
                byte[] r0 = r7.toByteArray()     // Catch:{ Exception -> 0x0211 }
                r13.field_operData = r0     // Catch:{ Exception -> 0x0211 }
                goto L_0x0225
            L_0x0211:
                r0 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r11]
                java.lang.String r14 = r0.getMessage()
                r7[r12] = r14
                java.lang.String r14 = "setOperationRegion fail, ex = %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r14, r7)
                java.lang.Object[] r7 = new java.lang.Object[r12]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r0, r4, r7)
            L_0x0225:
                java.lang.String r0 = ".sysmsg.carditemmsg.report_scene"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                if (r7 != 0) goto L_0x0240
                boolean r7 = wz0.C22945n.m27025y(r0)
                if (r7 == 0) goto L_0x0240
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r12)
                r13.field_report_scene = r0
                goto L_0x0242
            L_0x0240:
                r13.field_report_scene = r10
            L_0x0242:
                r13.field_read_state = r11
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r7 = 0
            L_0x024a:
                java.lang.String r8 = "</title>"
                java.lang.String r14 = "<title>"
                java.lang.String r15 = ".title"
                java.lang.String r10 = ".sysmsg.carditemmsg"
                if (r7 >= r9) goto L_0x0407
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r10)
                java.lang.String r12 = ".accept_buttons"
                r11.append(r12)
                if (r7 <= 0) goto L_0x0268
                java.lang.Integer r12 = java.lang.Integer.valueOf(r7)
                goto L_0x0269
            L_0x0268:
                r12 = r4
            L_0x0269:
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r11)
                java.lang.String r9 = ".card_id"
                r12.append(r9)
                java.lang.String r12 = r12.toString()
                java.lang.Object r12 = r5.get(r12)
                java.lang.String r12 = (java.lang.String) r12
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                java.lang.Object r1 = r5.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
                if (r12 == 0) goto L_0x02aa
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 == 0) goto L_0x02aa
                goto L_0x0407
            L_0x02aa:
                java.lang.String r1 = "<accept_buttons>"
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r14)
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r11)
                r10.append(r15)
                java.lang.String r10 = r10.toString()
                java.lang.Object r10 = r5.get(r10)
                java.lang.String r10 = (java.lang.String) r10
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
                java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r10)
                r1.append(r10)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "<sub_title>"
                r1.append(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r11)
                java.lang.String r10 = ".sub_title"
                r8.append(r10)
                java.lang.String r8 = r8.toString()
                java.lang.Object r8 = r5.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r8)
                r1.append(r8)
                java.lang.String r8 = "</sub_title>"
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "<card_id>"
                r1.append(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r11)
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.Object r8 = r5.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r8)
                r1.append(r8)
                java.lang.String r8 = "</card_id>"
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "<card_ext>"
                r1.append(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r11)
                java.lang.String r9 = ".card_ext"
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.Object r8 = r5.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r8)
                r1.append(r8)
                java.lang.String r8 = "</card_ext>"
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "<end_time>"
                r1.append(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r11)
                java.lang.String r9 = ".end_time"
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.Object r8 = r5.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r8)
                r1.append(r8)
                java.lang.String r8 = "</end_time>"
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "<action_type>"
                r1.append(r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r11)
                java.lang.String r9 = ".action_type"
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.Object r8 = r5.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r8)
                r1.append(r8)
                java.lang.String r8 = "</action_type>"
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "</accept_buttons>"
                r0.append(r1)
                int r7 = r7 + 1
                r1 = r22
                r9 = 100
                r10 = 2
                r11 = 1
                r12 = 0
                goto L_0x024a
            L_0x0407:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = r0.toString()
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x0427
                java.lang.String r7 = "<accept_buttons_list>"
                r1.append(r7)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
                java.lang.String r0 = "</accept_buttons_list>"
                r1.append(r0)
            L_0x0427:
                java.lang.String r0 = r1.toString()
                r13.field_accept_buttons = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            L_0x0433:
                r7 = 100
                if (r1 >= r7) goto L_0x0558
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r10)
                java.lang.String r9 = ".jump_buttons"
                r7.append(r9)
                if (r1 <= 0) goto L_0x044b
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                goto L_0x044c
            L_0x044b:
                r9 = r4
            L_0x044c:
                r7.append(r9)
                java.lang.String r7 = r7.toString()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r7)
                r9.append(r15)
                java.lang.String r9 = r9.toString()
                java.lang.Object r9 = r5.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x0470
                goto L_0x0558
            L_0x0470:
                java.lang.String r9 = "<jump_buttons>"
                r0.append(r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r14)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r7)
                r11.append(r15)
                java.lang.String r11 = r11.toString()
                java.lang.Object r11 = r5.get(r11)
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r11)
                r9.append(r11)
                r9.append(r8)
                java.lang.String r9 = r9.toString()
                r0.append(r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "<description>"
                r9.append(r11)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r7)
                java.lang.String r12 = ".description"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.Object r11 = r5.get(r11)
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r11)
                r9.append(r11)
                java.lang.String r11 = "</description>"
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                r0.append(r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "<button_wording>"
                r9.append(r11)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r7)
                java.lang.String r12 = ".button_wording"
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                java.lang.Object r11 = r5.get(r11)
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
                java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r11)
                r9.append(r11)
                java.lang.String r11 = "</button_wording>"
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                r0.append(r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "<jump_url>"
                r9.append(r11)
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r7)
                java.lang.String r7 = ".jump_url"
                r11.append(r7)
                java.lang.String r7 = r11.toString()
                java.lang.Object r7 = r5.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
                java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r7)
                r9.append(r7)
                java.lang.String r7 = "</jump_url>"
                r9.append(r7)
                java.lang.String r7 = r9.toString()
                r0.append(r7)
                java.lang.String r7 = "</jump_buttons>"
                r0.append(r7)
                int r1 = r1 + 1
                goto L_0x0433
            L_0x0558:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = r0.toString()
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r7 != 0) goto L_0x0578
                java.lang.String r7 = "<jump_buttons_list>"
                r1.append(r7)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
                java.lang.String r0 = "</jump_buttons_list>"
                r1.append(r0)
            L_0x0578:
                java.lang.String r0 = r1.toString()
                r13.field_jump_buttons = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.get_layout_scene"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x059a
                boolean r1 = wz0.C22945n.m27025y(r0)
                if (r1 == 0) goto L_0x059a
                r1 = 0
                int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
                r13.f124371b1 = r0
                goto L_0x059d
            L_0x059a:
                r1 = 0
                r13.f124371b1 = r1
            L_0x059d:
                java.lang.String r0 = ".sysmsg.carditemmsg.consumed_box_id"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.field_consumed_box_id = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.reddot_wording"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.f124361R0 = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.reddot_buff"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.f124362S0 = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.reddot_icon_url"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.f124363T0 = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.msg_tips.title"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.f124364U0 = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.msg_tips.icon_url"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r13.f124365V0 = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.msg_scene"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x0609
                boolean r1 = wz0.C22945n.m27025y(r0)
                if (r1 == 0) goto L_0x0609
                r1 = 0
                int r7 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
                r13.f124372c1 = r7
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "msg_scene is "
                r1.append(r7)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x060c
            L_0x0609:
                r1 = 0
                r13.f124372c1 = r1
            L_0x060c:
                java.lang.String r0 = ".sysmsg.carditemmsg.need_check"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r7 = "need_check:"
                r1.append(r7)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                java.lang.String r7 = "true"
                if (r1 != 0) goto L_0x0638
                boolean r1 = r0.equals(r7)
                r13.f124366W0 = r1
                goto L_0x063b
            L_0x0638:
                r1 = 0
                r13.f124366W0 = r1
            L_0x063b:
                java.lang.String r1 = ".sysmsg.carditemmsg.all_unavailable"
                java.lang.Object r1 = r5.get(r1)
                java.lang.String r1 = (java.lang.String) r1
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "all_Unavailable:"
                r8.append(r9)
                r8.append(r0)
                java.lang.String r0 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto L_0x0664
                boolean r0 = r1.equals(r7)
                r13.f124373d1 = r0
                goto L_0x0667
            L_0x0664:
                r1 = 0
                r13.f124373d1 = r1
            L_0x0667:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            L_0x066d:
                r8 = 100
                if (r1 >= r8) goto L_0x06f1
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r10)
                java.lang.String r9 = ".unavailable_qr_code_list"
                r8.append(r9)
                if (r1 <= 0) goto L_0x0685
                java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                goto L_0x0686
            L_0x0685:
                r9 = r4
            L_0x0686:
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                r11 = r20
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                java.lang.Object r9 = r5.get(r9)
                java.lang.String r9 = (java.lang.String) r9
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 == 0) goto L_0x06ab
                goto L_0x06f3
            L_0x06ab:
                java.lang.String r9 = "<unavailable_qr_codes>"
                r0.append(r9)
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r12 = "<code_id>"
                r9.append(r12)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                r12.append(r8)
                r12.append(r11)
                java.lang.String r8 = r12.toString()
                java.lang.Object r8 = r5.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
                java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r8)
                r9.append(r8)
                java.lang.String r8 = "</code_id>"
                r9.append(r8)
                java.lang.String r8 = r9.toString()
                r0.append(r8)
                java.lang.String r8 = "</unavailable_qr_codes>"
                r0.append(r8)
                int r1 = r1 + 1
                r20 = r11
                goto L_0x066d
            L_0x06f1:
                r11 = r20
            L_0x06f3:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = r0.toString()
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                if (r8 != 0) goto L_0x0713
                java.lang.String r8 = "<unavailable_qr_code_list>"
                r1.append(r8)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
                java.lang.String r0 = "</unavailable_qr_code_list>"
                r1.append(r0)
            L_0x0713:
                java.lang.String r0 = r1.toString()
                r13.field_unavailable_qr_code_list = r0
                java.lang.String r0 = ".sysmsg.carditemmsg.need_pull_card_entrance"
                java.lang.Object r1 = r5.get(r0)
                boolean r1 = r7.equals(r1)
                if (r1 != 0) goto L_0x0734
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r1 = "1"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L_0x0732
                goto L_0x0734
            L_0x0732:
                r0 = 0
                goto L_0x0735
            L_0x0734:
                r0 = 1
            L_0x0735:
                r13.field_need_pull_card_entrance = r0
            L_0x0737:
                if (r13 != 0) goto L_0x0740
                java.lang.String r0 = "card msg == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
                goto L_0x0d22
            L_0x0740:
                java.lang.String r0 = r13.field_card_id
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x074d
                java.lang.String r0 = "card id == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            L_0x074d:
                java.lang.String r0 = r13.field_msg_id
                r13.field_msg_id = r3
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 == 0) goto L_0x0759
                r13.field_msg_id = r0
            L_0x0759:
                java.lang.String r0 = r13.field_msg_id
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0776
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r4)
                long r7 = java.lang.System.currentTimeMillis()
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                r13.field_msg_id = r0
            L_0x0776:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "msg.field_msg_id : "
                r0.append(r1)
                java.lang.String r1 = r13.field_msg_id
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "msg for msg_type ==  "
                r0.append(r1)
                int r1 = r13.field_msg_type
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                com.tencent.mm.storage.y1$a r0 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_REDOT_ICON_URL_STRING_SYNC
                com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC
                com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_REDOT_WORDING_STRING_SYNC
                java.lang.Class<ct.c> r7 = p327ct.C30914c.class
                int r8 = r13.f124371b1
                if (r8 == 0) goto L_0x07c3
                f40.o r8 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r8 = r8.mo121142i()
                com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_GET_LAYOUT_SCENE_INT_SYNC
                int r10 = r13.f124371b1
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r8.mo119677K(r9, r10)
            L_0x07c3:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "reddot_buff is "
                r8.append(r9)
                java.lang.String r9 = r13.f124362S0
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                java.lang.String r8 = r13.f124362S0
                boolean r8 = android.text.TextUtils.isEmpty(r8)
                if (r8 != 0) goto L_0x07f2
                f40.o r8 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r8 = r8.mo121142i()
                com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_REDOT_BUFF_STRING_SYNC
                java.lang.String r10 = r13.f124362S0
                r8.mo119677K(r9, r10)
                goto L_0x07f8
            L_0x07f2:
                java.lang.String r8 = "reddot_buff is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
            L_0x07f8:
                int r8 = r13.field_msg_type
                r9 = 1
                r8 = r8 & r9
                if (r8 == 0) goto L_0x0848
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "msg_tips_title is "
                r8.append(r9)
                java.lang.String r9 = r13.f124364U0
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "msg_tips_icon_url is "
                r8.append(r9)
                java.lang.String r9 = r13.f124365V0
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                f40.o r8 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r8 = r8.mo121142i()
                com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_MSG_TIPS_TITLE_STRING_SYNC
                java.lang.String r10 = r13.f124364U0
                r8.mo119677K(r9, r10)
                f40.o r8 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r8 = r8.mo121142i()
                com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_MSG_TIPS_ICON_URL_STRING_SYNC
                java.lang.String r10 = r13.f124365V0
                r8.mo119677K(r9, r10)
            L_0x0848:
                int r8 = r13.field_msg_type
                r9 = r8 & 64
                r10 = 266241(0x41001, float:3.73083E-40)
                r12 = 65536(0x10000, float:9.18355E-41)
                r14 = 262152(0x40008, float:3.67353E-40)
                if (r9 == 0) goto L_0x0867
                di3.d r8 = di3.C86312j.m106911c(r7)
                ct.c r8 = (p327ct.C30914c) r8
                ct.d r8 = r8.mo17862sM()
                l20.a r8 = (l20.C21388a) r8
                r9 = 1
                r8.mo33509r(r14, r9)
                goto L_0x088f
            L_0x0867:
                r9 = 1
                r8 = r8 & 16384(0x4000, float:2.2959E-41)
                if (r8 == 0) goto L_0x0891
                di3.d r8 = di3.C86312j.m106911c(r7)
                ct.c r8 = (p327ct.C30914c) r8
                ct.d r8 = r8.mo17862sM()
                l20.a r8 = (l20.C21388a) r8
                r8.mo33509r(r14, r9)
                int r8 = r13.field_msg_type
                r8 = r8 & r12
                if (r8 != 0) goto L_0x088f
                di3.d r8 = di3.C86312j.m106911c(r7)
                ct.c r8 = (p327ct.C30914c) r8
                ct.d r8 = r8.mo17862sM()
                l20.a r8 = (l20.C21388a) r8
                r8.mo33499h(r14, r10)
            L_0x088f:
                r8 = 1
                goto L_0x0892
            L_0x0891:
                r8 = 0
            L_0x0892:
                if (r8 == 0) goto L_0x089b
                java.lang.String r0 = "has card new msg, return"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
                goto L_0x0ac1
            L_0x089b:
                java.lang.String r8 = "not has new!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                int r8 = r13.field_msg_type
                r9 = r8 & 32
                if (r9 == 0) goto L_0x08bc
                di3.d r8 = di3.C86312j.m106911c(r7)
                ct.c r8 = (p327ct.C30914c) r8
                ct.d r8 = r8.mo17862sM()
                l20.a r8 = (l20.C21388a) r8
                r9 = 1
                r8.mo33507p(r14, r9)
                java.lang.String r8 = "has reddot"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)
                goto L_0x08e4
            L_0x08bc:
                r9 = 1
                r8 = r8 & 8192(0x2000, float:1.14794E-41)
                if (r8 == 0) goto L_0x08e6
                di3.d r8 = di3.C86312j.m106911c(r7)
                ct.c r8 = (p327ct.C30914c) r8
                ct.d r8 = r8.mo17862sM()
                l20.a r8 = (l20.C21388a) r8
                r8.mo33507p(r14, r9)
                int r8 = r13.field_msg_type
                r8 = r8 & r12
                if (r8 != 0) goto L_0x08e4
                di3.d r8 = di3.C86312j.m106911c(r7)
                ct.c r8 = (p327ct.C30914c) r8
                ct.d r8 = r8.mo17862sM()
                l20.a r8 = (l20.C21388a) r8
                r8.mo33499h(r14, r10)
            L_0x08e4:
                r8 = 1
                goto L_0x08ec
            L_0x08e6:
                java.lang.String r8 = "not has reddot!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r8)
                r8 = 0
            L_0x08ec:
                java.lang.String r9 = r13.f124361R0
                boolean r9 = android.text.TextUtils.isEmpty(r9)
                if (r9 != 0) goto L_0x092a
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "reddot_wording is "
                r9.append(r10)
                java.lang.String r10 = r13.f124361R0
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                f40.o r9 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r9 = r9.mo121142i()
                java.lang.String r10 = r13.f124361R0
                r9.mo119677K(r5, r10)
                di3.d r9 = di3.C86312j.m106911c(r7)
                ct.c r9 = (p327ct.C30914c) r9
                ct.d r9 = r9.mo17862sM()
                l20.a r9 = (l20.C21388a) r9
                r10 = 1
                r9.mo33510s(r3, r10)
                r9 = 1
                goto L_0x0931
            L_0x092a:
                java.lang.String r9 = "reddot_wording is empty!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r9)
                r9 = 0
            L_0x0931:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r12 = "reddot_icon_url is "
                r10.append(r12)
                java.lang.String r12 = r13.f124363T0
                r10.append(r12)
                java.lang.String r10 = r10.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
                java.lang.String r10 = r13.f124363T0
                boolean r10 = android.text.TextUtils.isEmpty(r10)
                if (r10 != 0) goto L_0x096f
                f40.o r10 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r10 = r10.mo121142i()
                java.lang.String r12 = r13.f124363T0
                r10.mo119677K(r1, r12)
                di3.d r10 = di3.C86312j.m106911c(r7)
                ct.c r10 = (p327ct.C30914c) r10
                ct.d r10 = r10.mo17862sM()
                l20.a r10 = (l20.C21388a) r10
                r12 = 1
                r10.mo33510s(r0, r12)
                r10 = 1
                goto L_0x0976
            L_0x096f:
                java.lang.String r10 = "reddot_icon_url is empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r10)
                r10 = 0
            L_0x0976:
                if (r8 == 0) goto L_0x097e
                if (r9 == 0) goto L_0x097e
                if (r10 == 0) goto L_0x097e
                goto L_0x0a79
            L_0x097e:
                if (r8 == 0) goto L_0x09a1
                if (r9 == 0) goto L_0x09a1
                if (r10 != 0) goto L_0x09a1
                di3.d r3 = di3.C86312j.m106911c(r7)
                ct.c r3 = (p327ct.C30914c) r3
                ct.d r3 = r3.mo17862sM()
                l20.a r3 = (l20.C21388a) r3
                r5 = 0
                r3.mo33510s(r0, r5)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r0.mo119677K(r1, r4)
                goto L_0x0a79
            L_0x09a1:
                if (r8 == 0) goto L_0x09c4
                if (r9 != 0) goto L_0x09c4
                if (r10 == 0) goto L_0x09c4
                di3.d r0 = di3.C86312j.m106911c(r7)
                ct.c r0 = (p327ct.C30914c) r0
                ct.d r0 = r0.mo17862sM()
                l20.a r0 = (l20.C21388a) r0
                r1 = 0
                r0.mo33510s(r3, r1)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r0.mo119677K(r5, r4)
                goto L_0x0a79
            L_0x09c4:
                if (r8 != 0) goto L_0x09dc
                if (r9 == 0) goto L_0x09dc
                if (r10 == 0) goto L_0x09dc
                di3.d r0 = di3.C86312j.m106911c(r7)
                ct.c r0 = (p327ct.C30914c) r0
                ct.d r0 = r0.mo17862sM()
                l20.a r0 = (l20.C21388a) r0
                r1 = 0
                r0.mo33507p(r14, r1)
                goto L_0x0a79
            L_0x09dc:
                if (r8 == 0) goto L_0x0a18
                if (r9 != 0) goto L_0x0a18
                if (r10 != 0) goto L_0x0a18
                di3.d r12 = di3.C86312j.m106911c(r7)
                ct.c r12 = (p327ct.C30914c) r12
                ct.d r12 = r12.mo17862sM()
                l20.a r12 = (l20.C21388a) r12
                r14 = 0
                r12.mo33510s(r0, r14)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r0.mo119677K(r1, r4)
                di3.d r0 = di3.C86312j.m106911c(r7)
                ct.c r0 = (p327ct.C30914c) r0
                ct.d r0 = r0.mo17862sM()
                l20.a r0 = (l20.C21388a) r0
                r0.mo33510s(r3, r14)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r0.mo119677K(r5, r4)
                goto L_0x0a79
            L_0x0a18:
                if (r8 != 0) goto L_0x0a49
                if (r9 == 0) goto L_0x0a49
                if (r10 != 0) goto L_0x0a49
                di3.d r3 = di3.C86312j.m106911c(r7)
                ct.c r3 = (p327ct.C30914c) r3
                ct.d r3 = r3.mo17862sM()
                l20.a r3 = (l20.C21388a) r3
                r5 = 0
                r3.mo33510s(r0, r5)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r0.mo119677K(r1, r4)
                di3.d r0 = di3.C86312j.m106911c(r7)
                ct.c r0 = (p327ct.C30914c) r0
                ct.d r0 = r0.mo17862sM()
                l20.a r0 = (l20.C21388a) r0
                r0.mo33507p(r14, r5)
                goto L_0x0a79
            L_0x0a49:
                if (r8 != 0) goto L_0x0a79
                if (r9 != 0) goto L_0x0a79
                if (r10 == 0) goto L_0x0a79
                di3.d r0 = di3.C86312j.m106911c(r7)
                ct.c r0 = (p327ct.C30914c) r0
                ct.d r0 = r0.mo17862sM()
                l20.a r0 = (l20.C21388a) r0
                r1 = 0
                r0.mo33510s(r3, r1)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r0.mo119677K(r5, r4)
                di3.d r0 = di3.C86312j.m106911c(r7)
                ct.c r0 = (p327ct.C30914c) r0
                ct.d r0 = r0.mo17862sM()
                l20.a r0 = (l20.C21388a) r0
                r0.mo33507p(r14, r1)
            L_0x0a79:
                if (r8 != 0) goto L_0x0a7f
                if (r9 != 0) goto L_0x0a7f
                if (r10 == 0) goto L_0x0ac1
            L_0x0a7f:
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_MSG_CARD_ID_STRING_SYNC
                java.lang.String r3 = r13.field_card_id
                r0.mo119677K(r1, r3)
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_CARD_MSG_NEED_CHECK_BOOLEAN_SYNC
                boolean r3 = r13.f124366W0
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.mo119677K(r1, r3)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "card_id:"
                r0.append(r1)
                java.lang.String r1 = r13.field_card_id
                r0.append(r1)
                java.lang.String r1 = "  need_check:"
                r0.append(r1)
                boolean r1 = r13.f124366W0
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            L_0x0ac1:
                int r0 = r13.field_msg_type
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L_0x0b7c
                java.lang.String r0 = r13.field_msg_id
                java.util.List<hz0.f> r1 = r2.f124033b
                if (r1 == 0) goto L_0x0afa
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L_0x0ad4
                goto L_0x0afa
            L_0x0ad4:
                r1 = 0
            L_0x0ad5:
                java.util.List<hz0.f> r3 = r2.f124033b
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x0afa
                java.util.List<hz0.f> r3 = r2.f124033b
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                java.lang.Object r3 = r3.get(r1)
                hz0.f r3 = (hz0.C46146f) r3
                if (r3 == 0) goto L_0x0af7
                java.lang.String r3 = r3.field_msg_id
                if (r3 == 0) goto L_0x0af7
                boolean r3 = r3.equals(r0)
                if (r3 == 0) goto L_0x0af7
                r0 = 1
                goto L_0x0afb
            L_0x0af7:
                int r1 = r1 + 1
                goto L_0x0ad5
            L_0x0afa:
                r0 = 0
            L_0x0afb:
                if (r0 != 0) goto L_0x0b14
                java.util.List<hz0.f> r0 = r2.f124033b
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r13)
                r2.mo71406e(r13)
                int r0 = r13.field_msg_type
                r0 = r0 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0b3e
                int r0 = r2.f124034c
                r1 = 1
                int r0 = r0 + r1
                r2.f124034c = r0
                goto L_0x0b3e
            L_0x0b14:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "msg for id "
                r0.append(r1)
                java.lang.String r1 = r13.field_msg_id
                r0.append(r1)
                java.lang.String r1 = " is exist!!"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
                java.lang.String r0 = r13.field_msg_id
                r2.mo71403b(r0)
                java.util.List<hz0.f> r0 = r2.f124033b
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r13)
                r2.mo71406e(r13)
            L_0x0b3e:
                f40.o r0 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()
                r1 = 139268(0x22004, float:1.95156E-40)
                int r3 = r2.f124034c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0.mo119676J(r1, r3)
                java.util.List<java.lang.ref.WeakReference<gz0.o$b>> r0 = r2.f124032a
                if (r0 != 0) goto L_0x0b57
                goto L_0x0b7c
            L_0x0b57:
                r0 = 0
            L_0x0b58:
                java.util.List<java.lang.ref.WeakReference<gz0.o$b>> r1 = r2.f124032a
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                int r1 = r1.size()
                if (r0 >= r1) goto L_0x0b7c
                java.util.List<java.lang.ref.WeakReference<gz0.o$b>> r1 = r2.f124032a
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                java.lang.Object r1 = r1.get(r0)
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                if (r1 == 0) goto L_0x0b79
                java.lang.Object r1 = r1.get()
                gz0.o$b r1 = (gz0.C45995o.C45997b) r1
                if (r1 == 0) goto L_0x0b79
                r1.mo63787D7(r13)
            L_0x0b79:
                int r0 = r0 + 1
                goto L_0x0b58
            L_0x0b7c:
                int r0 = r13.field_msg_type
                r1 = 2
                r0 = r0 & r1
                if (r0 == 0) goto L_0x0b8b
                gz0.c r0 = hz0.C46153l0.vx0()
                int r1 = r13.f124371b1
                r0.mo58722a(r1)
            L_0x0b8b:
                int r0 = r13.field_msg_type
                r0 = r0 & 4
                if (r0 == 0) goto L_0x0bbb
                java.util.List<java.lang.ref.WeakReference<gz0.o$b>> r0 = r2.f124032a
                if (r0 != 0) goto L_0x0b96
                goto L_0x0bbb
            L_0x0b96:
                r0 = 0
            L_0x0b97:
                java.util.List<java.lang.ref.WeakReference<gz0.o$b>> r1 = r2.f124032a
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                int r1 = r1.size()
                if (r0 >= r1) goto L_0x0bbb
                java.util.List<java.lang.ref.WeakReference<gz0.o$b>> r1 = r2.f124032a
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                java.lang.Object r1 = r1.get(r0)
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
                if (r1 == 0) goto L_0x0bb8
                java.lang.Object r1 = r1.get()
                gz0.o$b r1 = (gz0.C45995o.C45997b) r1
                if (r1 == 0) goto L_0x0bb8
                r1.onChange()
            L_0x0bb8:
                int r0 = r0 + 1
                goto L_0x0b97
            L_0x0bbb:
                int r0 = r13.field_msg_type
                r0 = r0 & 8
                if (r0 == 0) goto L_0x0bce
                gz0.p r0 = hz0.C46153l0.Jx0()
                java.lang.String r1 = r13.field_card_id
                java.lang.String r2 = r13.field_card_tp_id
                int r3 = r13.field_report_scene
                r0.mo71409a(r1, r2, r3)
            L_0x0bce:
                int r0 = r13.field_msg_type
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0d0f
                java.util.List<hz0.f$c> r0 = r13.f124374e1
                if (r0 != 0) goto L_0x0c55
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r13.f124374e1 = r0
                java.lang.String r0 = r13.field_unavailable_qr_code_list
                boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r0 == 0) goto L_0x0be8
                goto L_0x0c55
            L_0x0be8:
                java.lang.String r0 = r13.field_unavailable_qr_code_list
                java.lang.String r1 = "unavailable_qr_code_list"
                r2 = 0
                java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r1, r2)
                if (r0 != 0) goto L_0x0bf5
                goto L_0x0c55
            L_0x0bf5:
                r1 = 0
                r2 = 100
            L_0x0bf8:
                if (r1 >= r2) goto L_0x0c55
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = ".unavailable_qr_code_list.unavailable_qr_codes"
                r3.append(r5)
                if (r1 <= 0) goto L_0x0c0b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
                goto L_0x0c0c
            L_0x0c0b:
                r5 = r4
            L_0x0c0c:
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r3)
                r5.append(r11)
                java.lang.String r5 = r5.toString()
                java.lang.Object r5 = r0.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r5 == 0) goto L_0x0c2f
                goto L_0x0c55
            L_0x0c2f:
                hz0.f$c r5 = new hz0.f$c
                r5.<init>(r13)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r3)
                r6.append(r11)
                java.lang.String r3 = r6.toString()
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                r5.f124384a = r3
                java.util.List<hz0.f$c> r3 = r13.f124374e1
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r3.add(r5)
                int r1 = r1 + 1
                goto L_0x0bf8
            L_0x0c55:
                gz0.h r0 = hz0.C46153l0.zx0()
                r0.getClass()
                wz0.c r1 = wz0.C53247c.CARDCODEREFRESHACTION_BANCODE
                java.lang.String r2 = "MicroMsg.CardDynamicQrcodeOfflineMgr"
                java.lang.String r3 = r13.field_card_id
                hz0.k r4 = hz0.C46153l0.Ex0()
                boolean r5 = r13.f124373d1
                if (r5 == 0) goto L_0x0c9a
                hz0.k r5 = hz0.C46153l0.Ex0()
                java.util.List r5 = r5.mo58990Lo(r3)
                hz0.j r6 = r4.mo58993qq(r3)
                r7 = 1
                java.lang.Object[] r8 = new java.lang.Object[r7]
                r9 = 0
                r8[r9] = r3
                java.lang.String r10 = "get msg allUnavailable is true! delete all card code data by card_id=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r10, r8)
                boolean r4 = r4.mo58991c(r3)
                if (r4 == 0) goto L_0x0d0f
                if (r6 == 0) goto L_0x0c95
                java.lang.Object[] r4 = new java.lang.Object[r7]
                r4[r9] = r3
                java.lang.String r6 = "code is showing card_id= %s,notify ui to refresh!"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r4)
                r0.mo71394k(r1)
            L_0x0c95:
                r0.mo71388e(r3, r5, r1)
                goto L_0x0d0f
            L_0x0c9a:
                java.util.List<hz0.f$c> r5 = r13.f124374e1
                if (r5 != 0) goto L_0x0caa
                r6 = 1
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r7 = 0
                r0[r7] = r3
                java.lang.String r1 = "get msg allUnavailable is false! unavailableQrCodeList is empty, do nothing! card_id=%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
                goto L_0x0d0f
            L_0x0caa:
                r6 = 1
                r7 = 0
                r8 = 2
                java.lang.Object[] r9 = new java.lang.Object[r8]
                r9[r7] = r3
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                int r7 = r5.size()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r9[r6] = r7
                java.lang.String r6 = "get msg allUnavailable is false! delete card code data by unavailableQrCodeList, card_id=%s，unavailableQrCodeList size= %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r9)
                hz0.j r4 = r4.mo58993qq(r3)
                java.util.LinkedList r6 = new java.util.LinkedList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L_0x0ccf:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x0cf1
                java.lang.Object r7 = r5.next()
                hz0.f$c r7 = (hz0.C46146f.C46149c) r7
                hz0.k r8 = hz0.C46153l0.Ex0()
                java.lang.String r9 = r7.f124384a
                boolean r8 = r8.mo58992jo(r3, r9)
                if (r8 == 0) goto L_0x0ccf
                java.lang.String r7 = r7.f124384a
                te3.u83 r7 = r0.mo71385b(r3, r7, r1)
                r6.add(r7)
                goto L_0x0ccf
            L_0x0cf1:
                if (r4 == 0) goto L_0x0d06
                r5 = 2
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r7 = 0
                r5[r7] = r3
                java.lang.String r3 = r4.field_code_id
                r4 = 1
                r5[r4] = r3
                java.lang.String r3 = "code is showing card_id= %s,code_id= %s, notify ui to refresh!"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
                r0.mo71394k(r1)
            L_0x0d06:
                boolean r1 = r6.isEmpty()
                if (r1 != 0) goto L_0x0d0f
                r0.mo71389f(r6)
            L_0x0d0f:
                int r0 = r13.field_msg_type
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x0d1f
                boolean r0 = r13.field_need_pull_card_entrance
                if (r0 == 0) goto L_0x0d1f
                kz0.l$a r0 = kz0.C46820l.f125957i
                r1 = 1
                r0.mo72032a(r1)
            L_0x0d1f:
                wz0.C22945n.m26997J()
            L_0x0d22:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: iz0.C33468c.C33469a.run():void");
        }
    }

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        String g = C48374j0.m53718g(aVar.f94242a.f227631h);
        if (g == null || g.length() == 0) {
            Log.m105920e("MicroMsg.SubCoreCard.CardMsgListener", "onReceiveMsg, msgContent is null");
        } else {
            C46153l0.Hx0().f124409y.post(new C33469a(this, g, aVar));
        }
    }
}
