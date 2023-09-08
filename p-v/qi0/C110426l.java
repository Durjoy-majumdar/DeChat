package qi0;

import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;

/* renamed from: qi0.l */
public class C110426l implements C110408d {
    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        DrawTextActionArg drawTextActionArg = (DrawTextActionArg) drawActionArg;
        if (drawTextActionArg == null) {
            return false;
        }
        mo161927c(dVar, canvas, drawTextActionArg.f311077e, drawTextActionArg.f311078f, drawTextActionArg.f311079g, drawTextActionArg.f311080h);
        return true;
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() < 3) {
            return false;
        }
        mo161927c(dVar, canvas, jSONArray.optString(0), C88020k.m109557h(jSONArray, 1), C88020k.m109557h(jSONArray, 2), C88020k.m109557h(jSONArray, 3));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161927c(pi0.C110229d r4, android.graphics.Canvas r5, java.lang.String r6, float r7, float r8, float r9) {
        /*
            r3 = this;
            si0.a r0 = r4.f329744a
            android.graphics.Paint$FontMetrics r0 = r0.getFontMetrics()
            si0.a r1 = r4.f329744a
            si0.a$a r1 = r1.f331431d
            si0.a$a r2 = si0.C110791a.C110792a.TOP
            if (r1 != r2) goto L_0x0016
            float r0 = r0.ascent
            float r0 = java.lang.Math.abs(r0)
        L_0x0014:
            float r8 = r8 + r0
            goto L_0x0034
        L_0x0016:
            si0.a$a r2 = si0.C110791a.C110792a.MIDDLE
            if (r1 != r2) goto L_0x0029
            float r1 = r0.ascent
            float r1 = -r1
            float r0 = r0.descent
            float r1 = r1 + r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            goto L_0x0014
        L_0x0029:
            si0.a$a r2 = si0.C110791a.C110792a.BOTTOM
            if (r1 != r2) goto L_0x0034
            float r0 = r0.descent
            float r0 = java.lang.Math.abs(r0)
            float r8 = r8 - r0
        L_0x0034:
            si0.a r4 = r4.f329745b
            float r0 = r4.measureText(r6)
            r1 = 0
            int r2 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0056
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0056
            r5.save()
            float r9 = r9 / r0
            r5.translate(r7, r8)
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.scale(r9, r7)
            r5.drawText(r6, r1, r1, r4)
            r5.restore()
            goto L_0x0059
        L_0x0056:
            r5.drawText(r6, r7, r8, r4)
        L_0x0059:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qi0.C110426l.mo161927c(pi0.d, android.graphics.Canvas, java.lang.String, float, float, float):boolean");
    }

    public String getMethod() {
        return "fillText";
    }
}
