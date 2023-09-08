package ry1;

import android.content.Context;
import com.tencent.wechat.aff.ting.TingClientProto;

/* renamed from: ry1.q0 */
public class C48151q0 extends C48109c {
    public C48151q0(Context context, int i) {
        super(context, TingClientProto.TingScene.TingScene_ChatHistory_VALUE);
        this.f128972e = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r15) {
        /*
            r14 = this;
            java.lang.Object r15 = r15.getTag()
            java.lang.String r0 = "MicroMsg.GameMessageOnClickListener"
            r1 = 0
            if (r15 != 0) goto L_0x0010
            java.lang.String r15 = "Tag is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r15)
        L_0x000e:
            r15 = r1
            goto L_0x0035
        L_0x0010:
            boolean r2 = r15 instanceof java.lang.Long
            if (r2 != 0) goto L_0x001a
            java.lang.String r15 = "The tag of action listener is not instance of Long"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r15)
            goto L_0x000e
        L_0x001a:
            java.lang.Class<sw1.q> r0 = sw1.C48484q.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            sw1.q r0 = (sw1.C48484q) r0
            com.tencent.mm.plugin.game.model.b0 r0 = r0.xi0()
            java.lang.Long r15 = (java.lang.Long) r15
            long r2 = r15.longValue()
            com.tencent.mm.plugin.game.model.w r15 = r0.mo66000Ow(r2)
            if (r15 == 0) goto L_0x0035
            r15.mo66075l2()
        L_0x0035:
            if (r15 != 0) goto L_0x003f
            java.lang.String r15 = "MicroMsg.GameMessageContentClickListener"
            java.lang.String r0 = "The game message is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            return
        L_0x003f:
            java.lang.String r0 = r15.f113474g2
            java.lang.String r13 = com.tencent.p014mm.game.report.C40314g.m43482a(r1, r1, r0, r1)
            int r0 = r15.field_msgType
            r2 = 5
            if (r0 == r2) goto L_0x00da
            r2 = 6
            if (r0 == r2) goto L_0x00b4
            r2 = 10
            if (r0 == r2) goto L_0x0072
            r2 = 11
            if (r0 == r2) goto L_0x0072
            android.content.Context r0 = r14.f128971d
            int r6 = r14.mo72853a(r0, r15)
            android.content.Context r2 = r14.f128971d
            r3 = 13
            r4 = 1301(0x515, float:1.823E-42)
            r5 = 3
            r7 = 0
            java.lang.String r8 = r15.field_appId
            int r9 = r14.f128972e
            int r10 = r15.field_msgType
            java.lang.String r11 = r15.field_gameMsgId
            java.lang.String r12 = r15.f113472f2
            com.tencent.p014mm.game.report.C40314g.m43485d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00ff
        L_0x0072:
            java.lang.String r0 = r15.f113477i1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0098
            android.content.Context r0 = r14.f128971d
            java.lang.String r2 = r15.f113477i1
            int r6 = uy1.C52642c.m59002t(r0, r2, r1)
            android.content.Context r2 = r14.f128971d
            r3 = 13
            r4 = 1301(0x515, float:1.823E-42)
            r5 = 3
            r7 = 0
            java.lang.String r8 = r15.field_appId
            int r9 = r14.f128972e
            int r10 = r15.field_msgType
            java.lang.String r11 = r15.field_gameMsgId
            java.lang.String r12 = r15.f113472f2
            com.tencent.p014mm.game.report.C40314g.m43485d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00ff
        L_0x0098:
            android.content.Context r0 = r14.f128971d
            int r6 = r14.mo72853a(r0, r15)
            android.content.Context r2 = r14.f128971d
            r3 = 13
            r4 = 1301(0x515, float:1.823E-42)
            r5 = 3
            r7 = 0
            java.lang.String r8 = r15.field_appId
            int r9 = r14.f128972e
            int r10 = r15.field_msgType
            java.lang.String r11 = r15.field_gameMsgId
            java.lang.String r12 = r15.f113472f2
            com.tencent.p014mm.game.report.C40314g.m43485d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00ff
        L_0x00b4:
            java.lang.String r0 = r15.f113445F1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00ff
            android.content.Context r0 = r14.f128971d
            java.lang.String r2 = r15.f113445F1
            int r6 = uy1.C52642c.m59002t(r0, r2, r1)
            android.content.Context r2 = r14.f128971d
            r3 = 13
            r4 = 1301(0x515, float:1.823E-42)
            r5 = 3
            r7 = 0
            java.lang.String r8 = r15.field_appId
            int r9 = r14.f128972e
            int r10 = r15.field_msgType
            java.lang.String r11 = r15.field_gameMsgId
            java.lang.String r12 = r15.f113472f2
            com.tencent.p014mm.game.report.C40314g.m43485d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00ff
        L_0x00da:
            java.lang.String r0 = r15.f113448I1
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00ff
            android.content.Context r0 = r14.f128971d
            java.lang.String r2 = r15.f113448I1
            int r6 = uy1.C52642c.m59002t(r0, r2, r1)
            android.content.Context r2 = r14.f128971d
            r3 = 13
            r4 = 1301(0x515, float:1.823E-42)
            r5 = 3
            r7 = 0
            java.lang.String r8 = r15.field_appId
            int r9 = r14.f128972e
            int r10 = r15.field_msgType
            java.lang.String r11 = r15.field_gameMsgId
            java.lang.String r12 = r15.f113472f2
            com.tencent.p014mm.game.report.C40314g.m43485d(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ry1.C48151q0.onClick(android.view.View):void");
    }
}
