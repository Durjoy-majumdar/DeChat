package p632o5;

import a14.C53896h0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import gy3.C8480h;
import gy3.C87412m;
import p1152s5.C110740c;
import p643p5.C110166b;

/* renamed from: o5.c */
public final class C109951c {

    /* renamed from: m */
    public static final C109951c f328954m = new C109951c((C53896h0) null, (C110740c) null, (C110166b) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (C109950b) null, (C109950b) null, (C109950b) null, 4095, (C8480h) null);

    /* renamed from: a */
    public final C53896h0 f328955a;

    /* renamed from: b */
    public final C110740c f328956b;

    /* renamed from: c */
    public final C110166b f328957c;

    /* renamed from: d */
    public final Bitmap.Config f328958d;

    /* renamed from: e */
    public final boolean f328959e;

    /* renamed from: f */
    public final boolean f328960f;

    /* renamed from: g */
    public final Drawable f328961g;

    /* renamed from: h */
    public final Drawable f328962h;

    /* renamed from: i */
    public final Drawable f328963i;

    /* renamed from: j */
    public final C109950b f328964j;

    /* renamed from: k */
    public final C109950b f328965k;

    /* renamed from: l */
    public final C109950b f328966l;

    public C109951c() {
        this((C53896h0) null, (C110740c) null, (C110166b) null, (Bitmap.Config) null, false, false, (Drawable) null, (Drawable) null, (Drawable) null, (C109950b) null, (C109950b) null, (C109950b) null, 4095, (C8480h) null);
    }

    public C109951c(C53896h0 h0Var, C110740c cVar, C110166b bVar, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, C109950b bVar2, C109950b bVar3, C109950b bVar4) {
        C87412m.m108594g(h0Var, "dispatcher");
        C87412m.m108594g(cVar, "transition");
        C87412m.m108594g(bVar, "precision");
        C87412m.m108594g(config, "bitmapConfig");
        C87412m.m108594g(bVar2, "memoryCachePolicy");
        C87412m.m108594g(bVar3, "diskCachePolicy");
        C87412m.m108594g(bVar4, "networkCachePolicy");
        this.f328955a = h0Var;
        this.f328956b = cVar;
        this.f328957c = bVar;
        this.f328958d = config;
        this.f328959e = z;
        this.f328960f = z2;
        this.f328961g = drawable;
        this.f328962h = drawable2;
        this.f328963i = drawable3;
        this.f328964j = bVar2;
        this.f328965k = bVar3;
        this.f328966l = bVar4;
    }

    /* renamed from: a */
    public static C109951c m149462a(C109951c cVar, C53896h0 h0Var, C110740c cVar2, C110166b bVar, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, C109950b bVar2, C109950b bVar3, C109950b bVar4, int i, Object obj) {
        C109951c cVar3 = cVar;
        int i2 = i;
        C53896h0 h0Var2 = (i2 & 1) != 0 ? cVar3.f328955a : h0Var;
        C110740c cVar4 = (i2 & 2) != 0 ? cVar3.f328956b : cVar2;
        C110166b bVar5 = (i2 & 4) != 0 ? cVar3.f328957c : bVar;
        Bitmap.Config config2 = (i2 & 8) != 0 ? cVar3.f328958d : config;
        boolean z3 = (i2 & 16) != 0 ? cVar3.f328959e : z;
        boolean z4 = (i2 & 32) != 0 ? cVar3.f328960f : z2;
        Drawable drawable4 = (i2 & 64) != 0 ? cVar3.f328961g : drawable;
        Drawable drawable5 = (i2 & 128) != 0 ? cVar3.f328962h : drawable2;
        Drawable drawable6 = (i2 & 256) != 0 ? cVar3.f328963i : drawable3;
        C109950b bVar6 = (i2 & 512) != 0 ? cVar3.f328964j : bVar2;
        C109950b bVar7 = (i2 & 1024) != 0 ? cVar3.f328965k : bVar3;
        C109950b bVar8 = (i2 & 2048) != 0 ? cVar3.f328966l : bVar4;
        cVar.getClass();
        C87412m.m108594g(h0Var2, "dispatcher");
        C87412m.m108594g(cVar4, "transition");
        C87412m.m108594g(bVar5, "precision");
        C87412m.m108594g(config2, "bitmapConfig");
        C87412m.m108594g(bVar6, "memoryCachePolicy");
        C87412m.m108594g(bVar7, "diskCachePolicy");
        C87412m.m108594g(bVar8, "networkCachePolicy");
        return new C109951c(h0Var2, cVar4, bVar5, config2, z3, z4, drawable4, drawable5, drawable6, bVar6, bVar7, bVar8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C109951c) {
            C109951c cVar = (C109951c) obj;
            return C87412m.m108589b(this.f328955a, cVar.f328955a) && C87412m.m108589b(this.f328956b, cVar.f328956b) && this.f328957c == cVar.f328957c && this.f328958d == cVar.f328958d && this.f328959e == cVar.f328959e && this.f328960f == cVar.f328960f && C87412m.m108589b(this.f328961g, cVar.f328961g) && C87412m.m108589b(this.f328962h, cVar.f328962h) && C87412m.m108589b(this.f328963i, cVar.f328963i) && this.f328964j == cVar.f328964j && this.f328965k == cVar.f328965k && this.f328966l == cVar.f328966l;
        }
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((((((((this.f328955a.hashCode() * 31) + this.f328956b.hashCode()) * 31) + this.f328957c.hashCode()) * 31) + this.f328958d.hashCode()) * 31) + (this.f328959e ? 1231 : 1237)) * 31;
        if (!this.f328960f) {
            i = 1237;
        }
        int i2 = (hashCode + i) * 31;
        Drawable drawable = this.f328961g;
        int i3 = 0;
        int hashCode2 = (i2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f328962h;
        int hashCode3 = (hashCode2 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.f328963i;
        if (drawable3 != null) {
            i3 = drawable3.hashCode();
        }
        return ((((((hashCode3 + i3) * 31) + this.f328964j.hashCode()) * 31) + this.f328965k.hashCode()) * 31) + this.f328966l.hashCode();
    }

    public String toString() {
        return "DefaultRequestOptions(dispatcher=" + this.f328955a + ", transition=" + this.f328956b + ", precision=" + this.f328957c + ", bitmapConfig=" + this.f328958d + ", allowHardware=" + this.f328959e + ", allowRgb565=" + this.f328960f + ", placeholder=" + this.f328961g + ", error=" + this.f328962h + ", fallback=" + this.f328963i + ", memoryCachePolicy=" + this.f328964j + ", diskCachePolicy=" + this.f328965k + ", networkCachePolicy=" + this.f328966l + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C109951c(a14.C53896h0 r14, p1152s5.C110740c r15, p643p5.C110166b r16, android.graphics.Bitmap.Config r17, boolean r18, boolean r19, android.graphics.drawable.Drawable r20, android.graphics.drawable.Drawable r21, android.graphics.drawable.Drawable r22, p632o5.C109950b r23, p632o5.C109950b r24, p632o5.C109950b r25, int r26, gy3.C8480h r27) {
        /*
            r13 = this;
            r0 = r26
            o5.b r1 = p632o5.C109950b.ENABLED
            r2 = r0 & 1
            if (r2 == 0) goto L_0x000b
            a14.h0 r2 = a14.C53872d1.f151119c
            goto L_0x000c
        L_0x000b:
            r2 = r14
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0015
            int r3 = p1152s5.C110740c.f331207a
            s5.b r3 = p1152s5.C110739b.f331206b
            goto L_0x0016
        L_0x0015:
            r3 = r15
        L_0x0016:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001d
            p5.b r4 = p643p5.C110166b.AUTOMATIC
            goto L_0x001f
        L_0x001d:
            r4 = r16
        L_0x001f:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x002a
            t5.j r5 = p864t5.C110910j.f331721a
            android.graphics.Bitmap$Config r5 = r5.mo162601a()
            goto L_0x002c
        L_0x002a:
            r5 = r17
        L_0x002c:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0032
            r6 = 1
            goto L_0x0034
        L_0x0032:
            r6 = r18
        L_0x0034:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x003a
            r7 = 0
            goto L_0x003c
        L_0x003a:
            r7 = r19
        L_0x003c:
            r8 = r0 & 64
            r9 = 0
            if (r8 == 0) goto L_0x0043
            r8 = r9
            goto L_0x0045
        L_0x0043:
            r8 = r20
        L_0x0045:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004b
            r10 = r9
            goto L_0x004d
        L_0x004b:
            r10 = r21
        L_0x004d:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r9 = r22
        L_0x0054:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x005a
            r11 = r1
            goto L_0x005c
        L_0x005a:
            r11 = r23
        L_0x005c:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0062
            r12 = r1
            goto L_0x0064
        L_0x0062:
            r12 = r24
        L_0x0064:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r1 = r25
        L_0x006b:
            r14 = r13
            r15 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r10
            r23 = r9
            r24 = r11
            r25 = r12
            r26 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p632o5.C109951c.<init>(a14.h0, s5.c, p5.b, android.graphics.Bitmap$Config, boolean, boolean, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, o5.b, o5.b, o5.b, int, gy3.h):void");
    }
}
