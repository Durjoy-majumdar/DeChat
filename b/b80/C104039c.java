package b80;

import a80.C103326b;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.tencent.p014mm.sdk.platformtools.Log;
import e80.C107254b;
import l90.C109292b;
import p156gj.C107831f;

/* renamed from: b80.c */
public final class C104039c extends C103326b {

    /* renamed from: e */
    public C107831f f307690e;

    /* renamed from: f */
    public String f307691f = "auto";

    /* renamed from: g */
    public C104037a f307692g;

    /* renamed from: h */
    public C107254b f307693h;

    /* renamed from: i */
    public final Camera.AutoFocusCallback f307694i = new C104040a(this);

    /* renamed from: b80.c$a */
    public static final class C104040a implements Camera.AutoFocusCallback {

        /* renamed from: d */
        public final /* synthetic */ C104039c f307695d;

        public C104040a(C104039c cVar) {
            this.f307695d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
            r0 = r0.f322839a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onAutoFocus(boolean r4, android.hardware.Camera r5) {
            /*
                r3 = this;
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "auto focus callback success "
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                java.lang.String r5 = "MicroMsg.Camera.Camera1FocusHelper"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r4)
                b80.c r4 = r3.f307695d
                r4.getClass()
                gj.f r0 = r4.f307690e     // Catch:{ Exception -> 0x005b }
                r1 = 1
                if (r0 == 0) goto L_0x0029
                gj.z r0 = r0.f322839a     // Catch:{ Exception -> 0x005b }
                if (r0 == 0) goto L_0x0029
                boolean r0 = r0.f322938c     // Catch:{ Exception -> 0x005b }
                if (r0 != r1) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r1 = 0
            L_0x002a:
                if (r1 != 0) goto L_0x0060
                gj.f r0 = r4.f307690e     // Catch:{ Exception -> 0x005b }
                r1 = 0
                if (r0 == 0) goto L_0x003a
                gj.z r0 = r0.f322839a     // Catch:{ Exception -> 0x005b }
                if (r0 == 0) goto L_0x003a
                android.hardware.Camera$Parameters r0 = r0.mo158259c()     // Catch:{ Exception -> 0x005b }
                goto L_0x003b
            L_0x003a:
                r0 = r1
            L_0x003b:
                if (r0 == 0) goto L_0x0042
                java.lang.String r2 = r0.getFocusMode()     // Catch:{ Exception -> 0x005b }
                goto L_0x0043
            L_0x0042:
                r2 = r1
            L_0x0043:
                if (r2 == 0) goto L_0x0060
                java.lang.String r2 = r4.f307691f     // Catch:{ Exception -> 0x005b }
                if (r2 == 0) goto L_0x0060
                r0.setFocusMode(r2)     // Catch:{ Exception -> 0x005b }
                r4.f307691f = r1     // Catch:{ Exception -> 0x005b }
                gj.f r4 = r4.f307690e     // Catch:{ Exception -> 0x005b }
                if (r4 == 0) goto L_0x0054
                gj.z r1 = r4.f322839a     // Catch:{ Exception -> 0x005b }
            L_0x0054:
                if (r1 != 0) goto L_0x0057
                goto L_0x0060
            L_0x0057:
                r1.mo158262f(r0)     // Catch:{ Exception -> 0x005b }
                goto L_0x0060
            L_0x005b:
                java.lang.String r4 = "auto focus return while camera is release"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r4)
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: b80.C104039c.C104040a.onAutoFocus(boolean, android.hardware.Camera):void");
        }
    }

    public C104039c() {
        int i = C109292b.f327190v0;
    }

    /* renamed from: a */
    public void mo143119a(boolean z, int i, int i2, int i3, int i4, int i5) {
        if (i5 <= 0 || i4 <= 0) {
            Log.m105920e("MicroMsg.Camera.Camera1FocusHelper", "updateTransformer fail viewWidth:" + i4 + " viewHeight:" + i5);
            return;
        }
        super.mo143119a(z, i, i2, i3, i4, i5);
        this.f307692g = new C104037a(z, i, this.f304664d);
    }

    /* renamed from: b */
    public final Rect mo145652b(float f, float f2, float f3, int i, int i2) {
        RectF rectF;
        float f4 = ((float) 80) * f3;
        RectF rectF2 = new RectF();
        rectF2.set(Math.max(f - f4, 0.0f), Math.max(f2 - f4, 0.0f), Math.min(f + f4, (float) i), Math.min(f2 + f4, (float) i2));
        C104037a aVar = this.f307692g;
        if (aVar != null) {
            rectF = new RectF();
            aVar.f307681a.mapRect(rectF, rectF2);
        } else {
            rectF = null;
        }
        Rect rect = new Rect();
        if (rectF != null) {
            rectF.round(rect);
        }
        return rect;
    }
}
