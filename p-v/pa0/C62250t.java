package pa0;

import com.tencent.p014mm.mj_template.sns.compose.widget.C55366y1;
import gy3.C87412m;
import i21.C60242i;
import ja0.C24789f;
import java.util.ArrayList;
import k21.C60960c;

/* renamed from: pa0.t */
public final class C62250t implements C55366y1.C55367a {

    /* renamed from: a */
    public final /* synthetic */ C62211a f176955a;

    public C62250t(C62211a aVar) {
        this.f176955a = aVar;
    }

    /* renamed from: a */
    public void mo76624a(String str) {
        C87412m.m108594g(str, "templateId");
        C60960c.C60961a aVar = C60960c.f173618a;
        C60242i iVar = C60242i.APPEND;
        aVar.mo85927k("SnsTemplate", "egviewcnt", 1, iVar);
        aVar.mo85931o("SnsTemplate", "egdetail", "egids", str, iVar, "#");
        if (C87412m.m108589b(str, "@@miaojian@@")) {
            C24789f fVar = C24789f.f70694a;
            C24789f.f70695b.f69531l = 1;
            return;
        }
        C24789f fVar2 = C24789f.f70694a;
        ArrayList arrayList = (ArrayList) C24789f.f70697d;
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0045, code lost:
        r2 = r2.f153252d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo76625b(java.lang.String r28, int r29) {
        /*
            r27 = this;
            r0 = r27
            r12 = r28
            java.lang.String r1 = "templateId"
            gy3.C87412m.m108594g(r12, r1)
            k21.c$a r11 = k21.C60960c.f173618a
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            i21.i r10 = i21.C60242i.APPEND
            java.lang.String r3 = "SnsTemplate"
            java.lang.String r4 = "egpreviewcnt"
            r11.mo85927k(r3, r4, r2, r10)
            long r2 = java.lang.System.currentTimeMillis()
            pa0.a r4 = r0.f176955a
            long r4 = r4.f176880z
            long r2 = r2 - r4
            java.lang.Long r17 = java.lang.Long.valueOf(r2)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 224(0xe0, float:3.14E-43)
            r23 = 0
            java.lang.String r14 = "SnsTemplate"
            java.lang.String r15 = "editdetail"
            java.lang.String r16 = "egpreviewtime"
            r13 = r11
            r18 = r10
            k21.C60960c.C60961a.m71445p(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            pa0.a r2 = r0.f176955a
            ca0.f0 r2 = r2.f176868n
            r24 = 0
            if (r2 == 0) goto L_0x0057
            j0.k2<java.lang.Boolean> r2 = r2.f153252d
            if (r2 == 0) goto L_0x0057
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != r1) goto L_0x0057
            r2 = 1
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            r2 = r2 ^ r1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r2)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 240(0xf0, float:3.36E-43)
            r23 = 0
            java.lang.String r14 = "SnsTemplate"
            java.lang.String r15 = "editdetail"
            java.lang.String r16 = "musicStatus"
            r13 = r11
            k21.C60960c.C60961a.m71445p(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            pa0.a r2 = r0.f176955a
            ca0.f0 r2 = r2.f176868n
            if (r2 == 0) goto L_0x008b
            j0.k2<java.lang.Boolean> r2 = r2.f153253e
            if (r2 == 0) goto L_0x008b
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != r1) goto L_0x008b
            r2 = 1
            goto L_0x008c
        L_0x008b:
            r2 = 0
        L_0x008c:
            r1 = r1 ^ r2
            java.lang.Integer r17 = java.lang.Integer.valueOf(r1)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 240(0xf0, float:3.36E-43)
            r23 = 0
            java.lang.String r14 = "SnsTemplate"
            java.lang.String r15 = "editdetail"
            java.lang.String r16 = "oriMusicStatus"
            r13 = r11
            k21.C60960c.C60961a.m71445p(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            pa0.a r1 = r0.f176955a
            int r1 = r1.f176872r
            java.lang.Integer r17 = java.lang.Integer.valueOf(r1)
            r18 = 0
            r19 = 1
            r21 = 0
            r22 = 144(0x90, float:2.02E-43)
            r23 = 0
            java.lang.String r14 = "SnsTemplate"
            java.lang.String r15 = "editdetail"
            java.lang.String r16 = "td"
            java.lang.String r20 = "egtd"
            r13 = r11
            k21.C60960c.C60961a.m71445p(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r17 = ja0.C60781a.f173118a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 240(0xf0, float:3.36E-43)
            r23 = 0
            java.lang.String r14 = "SnsTemplate"
            java.lang.String r15 = "editdetail"
            java.lang.String r16 = "maasSessionKey"
            r13 = r11
            k21.C60960c.C60961a.m71445p(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r13 = 240(0xf0, float:3.36E-43)
            r14 = 0
            java.lang.String r2 = "SnsTemplate"
            java.lang.String r3 = "editdetail"
            java.lang.String r4 = "egid"
            r1 = r11
            r5 = r28
            r25 = r10
            r10 = r13
            r26 = r11
            r11 = r14
            k21.C60960c.C60961a.m71445p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r29)
            java.lang.String r14 = "SnsTemplate"
            java.lang.String r15 = "editdetail"
            java.lang.String r16 = "eglocation"
            r13 = r26
            k21.C60960c.C60961a.m71445p(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r24)
            java.lang.String r14 = "SnsTemplate"
            java.lang.String r15 = "editdetail"
            java.lang.String r16 = "musicSearchFlag"
            k21.C60960c.C60961a.m71445p(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r24)
            r22 = 224(0xe0, float:3.14E-43)
            java.lang.String r14 = "SnsTemplate"
            java.lang.String r15 = "editdetail"
            java.lang.String r16 = "musiccnt"
            r18 = r25
            k21.C60960c.C60961a.m71445p(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            ja0.f r1 = ja0.C24789f.f70694a
            java.lang.String r2 = ""
            r1.mo51769a(r12, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pa0.C62250t.mo76625b(java.lang.String, int):void");
    }
}
