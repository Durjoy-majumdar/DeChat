package p1119i;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import p1042u.C111057f;
import p1042u.C111060j;
import p1119i.C108285b;
import p1119i.C108290d;
import p906j4.C108554c;

/* renamed from: i.a */
public class C108277a extends C108290d {

    /* renamed from: v */
    public C108280c f324180v;

    /* renamed from: w */
    public C108284g f324181w;

    /* renamed from: x */
    public int f324182x;

    /* renamed from: y */
    public int f324183y;

    /* renamed from: z */
    public boolean f324184z;

    /* renamed from: i.a$b */
    public static class C108279b extends C108284g {

        /* renamed from: a */
        public final Animatable f324185a;

        public C108279b(Animatable animatable) {
            super((C108278a) null);
            this.f324185a = animatable;
        }

        /* renamed from: c */
        public void mo158671c() {
            this.f324185a.start();
        }

        /* renamed from: d */
        public void mo158672d() {
            this.f324185a.stop();
        }
    }

    /* renamed from: i.a$c */
    public static class C108280c extends C108290d.C108291a {

        /* renamed from: I */
        public C111057f<Long> f324186I;

        /* renamed from: J */
        public C111060j<Integer> f324187J;

        public C108280c(C108280c cVar, C108277a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f324186I = cVar.f324186I;
                this.f324187J = cVar.f324187J;
                return;
            }
            this.f324186I = new C111057f<>();
            this.f324187J = new C111060j<>();
        }

        /* renamed from: e */
        public void mo158673e() {
            this.f324186I = this.f324186I.clone();
            this.f324187J = this.f324187J.clone();
        }

        public Drawable newDrawable() {
            return new C108277a(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C108277a(this, resources);
        }
    }

    /* renamed from: i.a$d */
    public static class C108281d extends C108284g {

        /* renamed from: a */
        public final C108554c f324188a;

        public C108281d(C108554c cVar) {
            super((C108278a) null);
            this.f324188a = cVar;
        }

        /* renamed from: c */
        public void mo158671c() {
            this.f324188a.start();
        }

        /* renamed from: d */
        public void mo158672d() {
            this.f324188a.stop();
        }
    }

    /* renamed from: i.a$e */
    public static class C108282e extends C108284g {

        /* renamed from: a */
        public final ObjectAnimator f324189a;

        /* renamed from: b */
        public final boolean f324190b;

        public C108282e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super((C108278a) null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C108283f fVar = new C108283f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) fVar.f324193c);
            ofInt.setInterpolator(fVar);
            this.f324190b = z2;
            this.f324189a = ofInt;
        }

        /* renamed from: a */
        public boolean mo158676a() {
            return this.f324190b;
        }

        /* renamed from: b */
        public void mo158677b() {
            this.f324189a.reverse();
        }

        /* renamed from: c */
        public void mo158671c() {
            this.f324189a.start();
        }

        /* renamed from: d */
        public void mo158672d() {
            this.f324189a.cancel();
        }
    }

    /* renamed from: i.a$f */
    public static class C108283f implements TimeInterpolator {

        /* renamed from: a */
        public int[] f324191a;

        /* renamed from: b */
        public int f324192b;

        /* renamed from: c */
        public int f324193c;

        public C108283f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f324192b = numberOfFrames;
            int[] iArr = this.f324191a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f324191a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f324191a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f324193c = i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f324193c)) + 0.5f);
            int i2 = this.f324192b;
            int[] iArr = this.f324191a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f324193c) : 0.0f);
        }
    }

    /* renamed from: i.a$g */
    public static abstract class C108284g {
        public C108284g(C108278a aVar) {
        }

        /* renamed from: a */
        public boolean mo158676a() {
            return false;
        }

        /* renamed from: b */
        public void mo158677b() {
        }

        /* renamed from: c */
        public abstract void mo158671c();

        /* renamed from: d */
        public abstract void mo158672d();
    }

    static {
        Class<C108277a> cls = C108277a.class;
    }

    public C108277a() {
        this((C108280c) null, (Resources) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x025f, code lost:
        return r5;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p1119i.C108277a m146616g(android.content.Context r21, android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            java.lang.String r5 = r23.getName()
            java.lang.String r6 = "animated-selector"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0260
            i.a r5 = new i.a
            r5.<init>()
            int[] r6 = p433g.C107593a.f321907g
            android.content.res.TypedArray r6 = p1050v2.C111331h.m151821h(r1, r4, r3, r6)
            r7 = 1
            boolean r8 = r6.getBoolean(r7, r7)
            r5.setVisible(r8, r7)
            i.a$c r8 = r5.f324180v
            int r9 = r8.f324219d
            int r10 = r6.getChangingConfigurations()
            r9 = r9 | r10
            r8.f324219d = r9
            boolean r9 = r8.f324224i
            r10 = 2
            boolean r9 = r6.getBoolean(r10, r9)
            r8.f324224i = r9
            boolean r9 = r8.f324227l
            r11 = 3
            boolean r9 = r6.getBoolean(r11, r9)
            r8.f324227l = r9
            int r9 = r8.f324240y
            r12 = 4
            int r9 = r6.getInt(r12, r9)
            r8.f324240y = r9
            r9 = 5
            int r13 = r8.f324241z
            int r9 = r6.getInt(r9, r13)
            r8.f324241z = r9
            boolean r8 = r8.f324238w
            r9 = 0
            boolean r8 = r6.getBoolean(r9, r8)
            r5.setDither(r8)
            i.b$c r8 = r5.f324195d
            if (r1 == 0) goto L_0x007d
            r8.f324217b = r1
            android.util.DisplayMetrics r13 = r22.getDisplayMetrics()
            int r13 = r13.densityDpi
            if (r13 != 0) goto L_0x0072
            r13 = 160(0xa0, float:2.24E-43)
        L_0x0072:
            int r14 = r8.f324218c
            r8.f324218c = r13
            if (r14 == r13) goto L_0x0080
            r8.f324228m = r9
            r8.f324225j = r9
            goto L_0x0080
        L_0x007d:
            r8.getClass()
        L_0x0080:
            r6.recycle()
            int r6 = r23.getDepth()
            int r6 = r6 + r7
        L_0x0088:
            int r8 = r23.next()
            if (r8 == r7) goto L_0x0258
            int r13 = r23.getDepth()
            if (r13 >= r6) goto L_0x0096
            if (r8 == r11) goto L_0x0258
        L_0x0096:
            if (r8 == r10) goto L_0x0099
            goto L_0x0088
        L_0x0099:
            if (r13 <= r6) goto L_0x009c
            goto L_0x0088
        L_0x009c:
            java.lang.String r8 = r23.getName()
            java.lang.String r13 = "item"
            boolean r8 = r8.equals(r13)
            r13 = -1
            r14 = 0
            if (r8 == 0) goto L_0x0163
            int[] r8 = p433g.C107593a.f321908h
            android.content.res.TypedArray r8 = p1050v2.C111331h.m151821h(r1, r4, r3, r8)
            int r15 = r8.getResourceId(r9, r9)
            int r13 = r8.getResourceId(r7, r13)
            if (r13 <= 0) goto L_0x00be
            android.graphics.drawable.Drawable r14 = p1115h.C107922a.m146228b(r0, r13)
        L_0x00be:
            r8.recycle()
            int r8 = r24.getAttributeCount()
            int[] r13 = new int[r8]
            r7 = 0
            r11 = 0
        L_0x00c9:
            if (r11 >= r8) goto L_0x00ed
            int r10 = r3.getAttributeNameResource(r11)
            if (r10 == 0) goto L_0x00e8
            r12 = 16842960(0x10100d0, float:2.369414E-38)
            if (r10 == r12) goto L_0x00e8
            r12 = 16843161(0x1010199, float:2.3694704E-38)
            if (r10 == r12) goto L_0x00e8
            int r12 = r7 + 1
            boolean r17 = r3.getAttributeBooleanValue(r11, r9)
            if (r17 == 0) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            int r10 = -r10
        L_0x00e5:
            r13[r7] = r10
            r7 = r12
        L_0x00e8:
            int r11 = r11 + 1
            r10 = 2
            r12 = 4
            goto L_0x00c9
        L_0x00ed:
            int[] r7 = android.util.StateSet.trimStateSet(r13, r7)
            java.lang.String r8 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r14 != 0) goto L_0x0133
        L_0x00f5:
            int r10 = r23.next()
            r11 = 4
            if (r10 != r11) goto L_0x00fd
            goto L_0x00f5
        L_0x00fd:
            r11 = 2
            if (r10 != r11) goto L_0x011a
            java.lang.String r10 = r23.getName()
            java.lang.String r11 = "vector"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0115
            j4.g r14 = new j4.g
            r14.<init>()
            r14.inflate(r1, r2, r3, r4)
            goto L_0x0133
        L_0x0115:
            android.graphics.drawable.Drawable r14 = android.graphics.drawable.Drawable.createFromXmlInner(r22, r23, r24, r25)
            goto L_0x0133
        L_0x011a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0133:
            if (r14 == 0) goto L_0x014a
            i.a$c r8 = r5.f324180v
            int r10 = r8.mo158716a(r14)
            int[][] r11 = r8.f324245H
            r11[r10] = r7
            u.j<java.lang.Integer> r7 = r8.f324187J
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            r7.mo162807g(r10, r8)
            goto L_0x024d
        L_0x014a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0163:
            java.lang.String r7 = r23.getName()
            java.lang.String r8 = "transition"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x024d
            int[] r7 = p433g.C107593a.f321909i
            android.content.res.TypedArray r7 = p1050v2.C111331h.m151821h(r1, r4, r3, r7)
            r8 = 2
            int r10 = r7.getResourceId(r8, r13)
            r8 = 1
            int r11 = r7.getResourceId(r8, r13)
            int r12 = r7.getResourceId(r9, r13)
            if (r12 <= 0) goto L_0x018a
            android.graphics.drawable.Drawable r12 = p1115h.C107922a.m146228b(r0, r12)
            goto L_0x018b
        L_0x018a:
            r12 = r14
        L_0x018b:
            r15 = 3
            boolean r16 = r7.getBoolean(r15, r9)
            r7.recycle()
            java.lang.String r7 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r12 != 0) goto L_0x01d6
        L_0x0197:
            int r12 = r23.next()
            r8 = 4
            if (r12 != r8) goto L_0x01a0
            r8 = 1
            goto L_0x0197
        L_0x01a0:
            r8 = 2
            if (r12 != r8) goto L_0x01bd
            java.lang.String r12 = r23.getName()
            java.lang.String r8 = "animated-vector"
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x01b8
            j4.c r12 = new j4.c
            r12.<init>(r0, r14, r14)
            r12.inflate(r1, r2, r3, r4)
            goto L_0x01d6
        L_0x01b8:
            android.graphics.drawable.Drawable r12 = android.graphics.drawable.Drawable.createFromXmlInner(r22, r23, r24, r25)
            goto L_0x01d6
        L_0x01bd:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01d6:
            if (r12 == 0) goto L_0x0234
            if (r10 == r13) goto L_0x0219
            if (r11 == r13) goto L_0x0219
            i.a$c r7 = r5.f324180v
            int r8 = r7.mo158716a(r12)
            long r12 = (long) r10
            r10 = 32
            long r17 = r12 << r10
            long r9 = (long) r11
            long r14 = r9 | r17
            if (r16 == 0) goto L_0x01f2
            r17 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x01f4
        L_0x01f2:
            r17 = 0
        L_0x01f4:
            u.f<java.lang.Long> r11 = r7.f324186I
            long r0 = (long) r8
            long r19 = r0 | r17
            java.lang.Long r8 = java.lang.Long.valueOf(r19)
            r11.mo162750a(r14, r8)
            if (r16 == 0) goto L_0x024d
            r8 = 32
            long r8 = r9 << r8
            long r8 = r8 | r12
            u.f<java.lang.Long> r7 = r7.f324186I
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 | r10
            long r0 = r0 | r17
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r7.mo162750a(r8, r0)
            goto L_0x024d
        L_0x0219:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0234:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x024d:
            r0 = r21
            r1 = r22
            r7 = 1
            r9 = 0
            r10 = 2
            r11 = 3
            r12 = 4
            goto L_0x0088
        L_0x0258:
            int[] r0 = r5.getState()
            r5.onStateChange(r0)
            return r5
        L_0x0260:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r23.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1119i.C108277a.m146616g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):i.a");
    }

    /* renamed from: b */
    public C108285b.C108288c mo158664b() {
        return new C108280c(this.f324180v, this, (Resources) null);
    }

    /* renamed from: e */
    public void mo158665e(C108285b.C108288c cVar) {
        super.mo158665e(cVar);
        if (cVar instanceof C108280c) {
            this.f324180v = (C108280c) cVar;
        }
    }

    /* renamed from: f */
    public C108290d.C108291a mo158666f() {
        return new C108280c(this.f324180v, this, (Resources) null);
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C108284g gVar = this.f324181w;
        if (gVar != null) {
            gVar.mo158672d();
            this.f324181w = null;
            mo158683d(this.f324182x);
            this.f324182x = -1;
            this.f324183y = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f324184z) {
            super.mutate();
            this.f324180v.mo158673e();
            this.f324184z = true;
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        if (mo158683d(r3) == false) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            i.a$c r2 = r0.f324180v
            int r3 = r2.mo158751g(r1)
            if (r3 < 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            int[] r3 = android.util.StateSet.WILD_CARD
            int r3 = r2.mo158751g(r3)
        L_0x0013:
            int r2 = r0.f324201j
            r4 = 1
            r5 = 0
            if (r3 == r2) goto L_0x010e
            i.a$g r6 = r0.f324181w
            if (r6 == 0) goto L_0x003d
            int r2 = r0.f324182x
            if (r3 != r2) goto L_0x0023
            goto L_0x0102
        L_0x0023:
            int r2 = r0.f324183y
            if (r3 != r2) goto L_0x0038
            boolean r2 = r6.mo158676a()
            if (r2 == 0) goto L_0x0038
            r6.mo158677b()
            int r2 = r0.f324183y
            r0.f324182x = r2
            r0.f324183y = r3
            goto L_0x0102
        L_0x0038:
            int r2 = r0.f324182x
            r6.mo158672d()
        L_0x003d:
            r6 = 0
            r0.f324181w = r6
            r6 = -1
            r0.f324183y = r6
            r0.f324182x = r6
            i.a$c r6 = r0.f324180v
            if (r2 >= 0) goto L_0x004e
            r6.getClass()
            r7 = 0
            goto L_0x005e
        L_0x004e:
            u.j<java.lang.Integer> r7 = r6.f324187J
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r7.mo162805e(r2, r8)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x005e:
            if (r3 >= 0) goto L_0x0062
            r8 = 0
            goto L_0x0072
        L_0x0062:
            u.j<java.lang.Integer> r8 = r6.f324187J
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            java.lang.Object r8 = r8.mo162805e(r3, r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
        L_0x0072:
            if (r8 == 0) goto L_0x0104
            if (r7 != 0) goto L_0x0078
            goto L_0x0104
        L_0x0078:
            long r9 = (long) r7
            r7 = 32
            long r9 = r9 << r7
            long r7 = (long) r8
            long r7 = r7 | r9
            u.f<java.lang.Long> r9 = r6.f324186I
            r10 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)
            java.lang.Object r9 = r9.mo162755d(r7, r12)
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            int r9 = (int) r12
            if (r9 >= 0) goto L_0x0095
            goto L_0x0104
        L_0x0095:
            u.f<java.lang.Long> r12 = r6.f324186I
            java.lang.Long r13 = java.lang.Long.valueOf(r10)
            java.lang.Object r12 = r12.mo162755d(r7, r13)
            java.lang.Long r12 = (java.lang.Long) r12
            long r12 = r12.longValue()
            r14 = 8589934592(0x200000000, double:4.243991582E-314)
            long r12 = r12 & r14
            r14 = 0
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x00b3
            r12 = 1
            goto L_0x00b4
        L_0x00b3:
            r12 = 0
        L_0x00b4:
            r0.mo158683d(r9)
            android.graphics.drawable.Drawable r9 = r0.f324197f
            boolean r13 = r9 instanceof android.graphics.drawable.AnimationDrawable
            if (r13 == 0) goto L_0x00e2
            u.f<java.lang.Long> r6 = r6.f324186I
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r6 = r6.mo162755d(r7, r10)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            long r6 = r6 & r10
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x00d9
            r6 = 1
            goto L_0x00da
        L_0x00d9:
            r6 = 0
        L_0x00da:
            i.a$e r7 = new i.a$e
            android.graphics.drawable.AnimationDrawable r9 = (android.graphics.drawable.AnimationDrawable) r9
            r7.<init>(r9, r6, r12)
            goto L_0x00f9
        L_0x00e2:
            boolean r6 = r9 instanceof p906j4.C108554c
            if (r6 == 0) goto L_0x00ee
            i.a$d r7 = new i.a$d
            j4.c r9 = (p906j4.C108554c) r9
            r7.<init>(r9)
            goto L_0x00f9
        L_0x00ee:
            boolean r6 = r9 instanceof android.graphics.drawable.Animatable
            if (r6 == 0) goto L_0x0104
            i.a$b r7 = new i.a$b
            android.graphics.drawable.Animatable r9 = (android.graphics.drawable.Animatable) r9
            r7.<init>(r9)
        L_0x00f9:
            r7.mo158671c()
            r0.f324181w = r7
            r0.f324183y = r2
            r0.f324182x = r3
        L_0x0102:
            r2 = 1
            goto L_0x0105
        L_0x0104:
            r2 = 0
        L_0x0105:
            if (r2 != 0) goto L_0x010f
            boolean r2 = r0.mo158683d(r3)
            if (r2 == 0) goto L_0x010e
            goto L_0x010f
        L_0x010e:
            r4 = 0
        L_0x010f:
            android.graphics.drawable.Drawable r2 = r0.f324197f
            if (r2 == 0) goto L_0x0118
            boolean r1 = r2.setState(r1)
            r4 = r4 | r1
        L_0x0118:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p1119i.C108277a.onStateChange(int[]):boolean");
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        C108284g gVar = this.f324181w;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.mo158671c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public C108277a(C108280c cVar, Resources resources) {
        super((C108290d.C108291a) null);
        this.f324182x = -1;
        this.f324183y = -1;
        mo158665e(new C108280c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
