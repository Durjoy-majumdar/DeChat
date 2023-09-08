package qi0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg;
import js0.C88020k;
import org.json.JSONArray;
import pi0.C110229d;
import pi0.C110230e;

/* renamed from: qi0.f */
public class C110412f implements C110408d {

    /* renamed from: qi0.f$a */
    public class C110413a implements C110230e.C110231a {
        public C110413a(C110412f fVar) {
        }

        /* renamed from: a */
        public void mo161637a(C110229d dVar, String str, Bitmap bitmap) {
            dVar.invalidate();
        }
    }

    /* renamed from: qi0.f$b */
    public class C110414b implements C110230e.C110231a {
        public C110414b(C110412f fVar) {
        }

        /* renamed from: a */
        public void mo161637a(C110229d dVar, String str, Bitmap bitmap) {
            dVar.invalidate();
        }
    }

    /* renamed from: a */
    public boolean mo161914a(C110229d dVar, Canvas canvas, DrawActionArg drawActionArg) {
        DrawImageActionArg drawImageActionArg = (DrawImageActionArg) drawActionArg;
        if (drawImageActionArg == null) {
            return false;
        }
        return mo161921c(dVar, canvas, drawImageActionArg.f311063e, drawImageActionArg.f311064f, drawImageActionArg.f311065g, drawImageActionArg.f311066h, drawImageActionArg.f311067i, drawImageActionArg.f311068j, drawImageActionArg.f311069n, drawImageActionArg.f311070o, drawImageActionArg.f311071p, drawImageActionArg.f311072q);
    }

    /* renamed from: b */
    public boolean mo161915b(C110229d dVar, Canvas canvas, JSONArray jSONArray) {
        JSONArray jSONArray2 = jSONArray;
        int length = jSONArray.length();
        if (length < 3) {
            return false;
        }
        return mo161921c(dVar, canvas, length, jSONArray2.optString(0), C88020k.m109557h(jSONArray2, 1), C88020k.m109557h(jSONArray2, 2), C88020k.m109557h(jSONArray2, 3), C88020k.m109557h(jSONArray2, 4), jSONArray2.optInt(5), jSONArray2.optInt(6), jSONArray2.optInt(7), jSONArray2.optInt(8));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo161921c(pi0.C110229d r17, android.graphics.Canvas r18, int r19, java.lang.String r20, float r21, float r22, float r23, float r24, int r25, int r26, int r27, int r28) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r23
            r6 = r24
            r7 = r27
            r8 = r28
            boolean r9 = android.text.TextUtils.isEmpty(r20)
            r10 = 0
            if (r9 == 0) goto L_0x001a
            return r10
        L_0x001a:
            r9 = 5
            r11 = 1
            r12 = 0
            if (r3 < r9) goto L_0x003b
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x003a
            int r9 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0028
            goto L_0x003a
        L_0x0028:
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x0030
            float r9 = r21 + r5
            float r5 = -r5
            goto L_0x0032
        L_0x0030:
            r9 = r21
        L_0x0032:
            int r13 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r13 >= 0) goto L_0x003d
            float r13 = r22 + r6
            float r6 = -r6
            goto L_0x003f
        L_0x003a:
            return r11
        L_0x003b:
            r9 = r21
        L_0x003d:
            r13 = r22
        L_0x003f:
            float r14 = r9 + r5
            float r15 = r13 + r6
            r12 = 9
            if (r3 < r12) goto L_0x00cd
            if (r7 == 0) goto L_0x00cb
            if (r8 != 0) goto L_0x004d
            goto L_0x00cb
        L_0x004d:
            if (r7 >= 0) goto L_0x0053
            int r3 = r25 + r7
            int r7 = -r7
            goto L_0x0055
        L_0x0053:
            r3 = r25
        L_0x0055:
            if (r8 >= 0) goto L_0x005b
            int r12 = r26 + r8
            int r8 = -r8
            goto L_0x005d
        L_0x005b:
            r12 = r26
        L_0x005d:
            int r14 = r3 + r7
            if (r14 <= 0) goto L_0x00c9
            int r15 = r12 + r8
            if (r15 > 0) goto L_0x0066
            goto L_0x00c9
        L_0x0066:
            if (r3 <= 0) goto L_0x006a
            r11 = r3
            goto L_0x006b
        L_0x006a:
            r11 = 0
        L_0x006b:
            if (r12 <= 0) goto L_0x006e
            r10 = r12
        L_0x006e:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r11, r10, r14, r15)
            pi0.e r14 = r1.f329750g
            qi0.f$a r15 = new qi0.f$a
            r15.<init>(r0)
            android.graphics.Bitmap r2 = r14.mo157759Ds(r1, r4, r2, r15)
            if (r2 == 0) goto L_0x00c7
            boolean r4 = r2.isRecycled()
            if (r4 == 0) goto L_0x0087
            goto L_0x00c7
        L_0x0087:
            int r3 = js0.C88020k.m109553d(r3)
            int r4 = js0.C88020k.m109553d(r12)
            int r7 = js0.C88020k.m109553d(r7)
            int r8 = js0.C88020k.m109553d(r8)
            int r11 = js0.C88020k.m109553d(r11)
            int r10 = js0.C88020k.m109553d(r10)
            int r12 = r2.getWidth()
            int r12 = js0.C88020k.m109553d(r12)
            int r14 = r2.getHeight()
            int r14 = js0.C88020k.m109553d(r14)
            float r7 = (float) r7
            float r5 = r5 / r7
            float r7 = (float) r8
            float r6 = r6 / r7
            int r11 = r11 - r3
            float r3 = (float) r11
            float r3 = r3 * r5
            float r9 = r9 + r3
            int r10 = r10 - r4
            float r3 = (float) r10
            float r3 = r3 * r6
            float r13 = r13 + r3
            float r3 = (float) r12
            float r3 = r3 * r5
            float r3 = r3 + r9
            float r4 = (float) r14
            float r4 = r4 * r6
            float r15 = r13 + r4
            goto L_0x0101
        L_0x00c7:
            r1 = 0
            return r1
        L_0x00c9:
            r1 = 1
            return r1
        L_0x00cb:
            r1 = 1
            return r1
        L_0x00cd:
            pi0.e r2 = r1.f329750g
            qi0.f$b r3 = new qi0.f$b
            r3.<init>(r0)
            android.graphics.Bitmap r2 = r2.mo157760Q4(r1, r4, r3)
            if (r2 == 0) goto L_0x0126
            boolean r3 = r2.isRecycled()
            if (r3 == 0) goto L_0x00e1
            goto L_0x0126
        L_0x00e1:
            r3 = 0
            int r4 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x00f1
            int r4 = r2.getWidth()
            int r4 = js0.C88020k.m109553d(r4)
            float r4 = (float) r4
            float r14 = r9 + r4
        L_0x00f1:
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0100
            int r3 = r2.getHeight()
            int r3 = js0.C88020k.m109553d(r3)
            float r3 = (float) r3
            float r15 = r13 + r3
        L_0x0100:
            r3 = r14
        L_0x0101:
            android.graphics.PaintFlagsDrawFilter r4 = new android.graphics.PaintFlagsDrawFilter
            r5 = 3
            r6 = 0
            r4.<init>(r6, r5)
            r5 = r18
            r5.setDrawFilter(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r7 = r2.getWidth()
            int r8 = r2.getHeight()
            r4.<init>(r6, r6, r7, r8)
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r9, r13, r3, r15)
            si0.a r1 = r1.f329745b
            r5.drawBitmap(r2, r4, r6, r1)
            r1 = 1
            return r1
        L_0x0126:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qi0.C110412f.mo161921c(pi0.d, android.graphics.Canvas, int, java.lang.String, float, float, float, float, int, int, int, int):boolean");
    }

    public String getMethod() {
        return "drawImage";
    }
}
