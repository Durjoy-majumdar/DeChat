package ti0;

import android.graphics.Path;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path.PathArcToActionArg;
import js0.C88020k;
import org.json.JSONArray;

/* renamed from: ti0.c */
public class C110995c implements C110993a {
    /* renamed from: a */
    public boolean mo162678a(Path path, BasePathActionArg basePathActionArg) {
        PathArcToActionArg pathArcToActionArg = (PathArcToActionArg) basePathActionArg;
        if (pathArcToActionArg == null) {
            return false;
        }
        mo162682c(path, pathArcToActionArg.f311149e, pathArcToActionArg.f311150f, pathArcToActionArg.f311151g, pathArcToActionArg.f311152h, pathArcToActionArg.f311153i, pathArcToActionArg.f311154j);
        return true;
    }

    /* renamed from: b */
    public boolean mo162679b(Path path, JSONArray jSONArray) {
        if (jSONArray.length() < 6) {
            return false;
        }
        mo162682c(path, C88020k.m109557h(jSONArray, 0), C88020k.m109557h(jSONArray, 1), C88020k.m109557h(jSONArray, 2), (float) jSONArray.optDouble(3), (float) jSONArray.optDouble(4), jSONArray.optBoolean(5));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo162682c(android.graphics.Path r7, float r8, float r9, float r10, float r11, float r12, boolean r13) {
        /*
            r6 = this;
            float r0 = r8 - r10
            float r1 = r9 - r10
            float r8 = r8 + r10
            float r9 = r9 + r10
            double r2 = (double) r11
            double r2 = java.lang.Math.toDegrees(r2)
            float r11 = (float) r2
            double r2 = (double) r12
            double r2 = java.lang.Math.toDegrees(r2)
            float r12 = (float) r2
            double r2 = (double) r10
            r4 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r2 = r2 * r4
            r4 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r4 = r4 / r2
            float r10 = (float) r4
            r2 = 0
            r3 = 1135869952(0x43b40000, float:360.0)
            if (r13 == 0) goto L_0x0043
            float r13 = r11 - r12
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x002f
            r12 = -1011613696(0xffffffffc3b40000, float:-360.0)
            goto L_0x0060
        L_0x002f:
            float r13 = r11 % r3
            float r12 = r12 % r3
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0037
            float r13 = r13 + r3
        L_0x0037:
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x003c
            float r12 = r12 + r3
        L_0x003c:
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x005f
            float r12 = r12 - r13
            float r12 = r12 - r3
            goto L_0x0060
        L_0x0043:
            float r13 = r12 - r11
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x004c
            r12 = 1135869952(0x43b40000, float:360.0)
            goto L_0x0060
        L_0x004c:
            float r13 = r11 % r3
            float r12 = r12 % r3
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0054
            float r13 = r13 + r3
        L_0x0054:
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0059
            float r12 = r12 + r3
        L_0x0059:
            int r2 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            float r12 = r12 + r3
        L_0x005f:
            float r12 = r12 - r13
        L_0x0060:
            float r13 = r12 % r3
            r2 = 0
            int r3 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x007d
            float r10 = -r10
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x007d
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r0, r1, r8, r9)
            r7.arcTo(r10, r11, r12, r2)
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r0, r1, r8, r9)
            r7.addArc(r10, r11, r12)
            goto L_0x0085
        L_0x007d:
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r0, r1, r8, r9)
            r7.arcTo(r10, r11, r12, r2)
        L_0x0085:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ti0.C110995c.mo162682c(android.graphics.Path, float, float, float, float, float, boolean):boolean");
    }

    public String getMethod() {
        return "arcTo";
    }
}
