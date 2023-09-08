package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.tencent.p014mm.C0966R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p1042u.C111055b;
import p1042u.C111057f;
import p1042u.C111058g;
import p1042u.C111060j;
import p1057w2.C90885a;
import p1119i.C108277a;
import p906j4.C108554c;
import p906j4.C108561g;

/* renamed from: androidx.appcompat.widget.f */
public final class C103527f {

    /* renamed from: g */
    public static final PorterDuff.Mode f305720g = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public static C103527f f305721h;

    /* renamed from: i */
    public static final C103530c f305722i = new C103530c(6);

    /* renamed from: j */
    public static final int[] f305723j = {C0966R.C0969drawable.bby, C0966R.C0969drawable.bbw, C0966R.C0969drawable.bap};

    /* renamed from: k */
    public static final int[] f305724k = {C0966R.C0969drawable.bax, C0966R.C0969drawable.f4370an, C0966R.C0969drawable.f357086bb2, C0966R.C0969drawable.bay, C0966R.C0969drawable.baz, C0966R.C0969drawable.f357085bb1, C0966R.C0969drawable.f357084bb0};

    /* renamed from: l */
    public static final int[] f305725l = {C0966R.C0969drawable.bbv, C0966R.C0969drawable.bbx, C0966R.C0969drawable.baw, C0966R.C0969drawable.f4376at, C0966R.C0969drawable.bbp, C0966R.C0969drawable.bbr, C0966R.C0969drawable.bbt, C0966R.C0969drawable.bbq, C0966R.C0969drawable.bbs, C0966R.C0969drawable.bbu};

    /* renamed from: m */
    public static final int[] f305726m = {C0966R.C0969drawable.bbg, C0966R.C0969drawable.f4349a2, C0966R.C0969drawable.bbf};

    /* renamed from: n */
    public static final int[] f305727n = {C0966R.C0969drawable.f4375as, C0966R.C0969drawable.f4377au};

    /* renamed from: o */
    public static final int[] f305728o = {C0966R.C0969drawable.f4345w, C0966R.C0969drawable.f4348a0};

    /* renamed from: a */
    public WeakHashMap<Context, C111060j<ColorStateList>> f305729a;

    /* renamed from: b */
    public C111055b<String, C103531d> f305730b;

    /* renamed from: c */
    public C111060j<String> f305731c;

    /* renamed from: d */
    public final WeakHashMap<Context, C111057f<WeakReference<Drawable.ConstantState>>> f305732d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f305733e;

    /* renamed from: f */
    public boolean f305734f;

    /* renamed from: androidx.appcompat.widget.f$a */
    public static class C103528a implements C103531d {
        /* renamed from: a */
        public Drawable mo144331a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C108277a.m146616g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f$b */
    public static class C103529b implements C103531d {
        /* renamed from: a */
        public Drawable mo144331a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C108554c cVar = new C108554c(context, (C108554c.C108556b) null, (Resources) null);
                cVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return cVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f$c */
    public static class C103530c extends C111058g<Integer, PorterDuffColorFilter> {
        public C103530c(int i) {
            super(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.f$d */
    public interface C103531d {
        /* renamed from: a */
        Drawable mo144331a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.f$e */
    public static class C103532e implements C103531d {
        /* renamed from: a */
        public Drawable mo144331a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C108561g gVar = new C108561g();
                gVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return gVar;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: c */
    public static boolean m137544c(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static synchronized C103527f m137545g() {
        C103527f fVar;
        synchronized (C103527f.class) {
            if (f305721h == null) {
                C103527f fVar2 = new C103527f();
                f305721h = fVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    fVar2.mo144323a("vector", new C103532e());
                    fVar2.mo144323a("animated-vector", new C103529b());
                    fVar2.mo144323a("animated-selector", new C103528a());
                }
            }
            fVar = f305721h;
        }
        return fVar;
    }

    /* renamed from: j */
    public static synchronized PorterDuffColorFilter m137546j(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C103527f.class) {
            C103530c cVar = f305722i;
            cVar.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.put(Integer.valueOf(i2 + mode.hashCode()), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: l */
    public static void m137547l(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C103556p.m137671a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f305720g;
        }
        drawable.setColorFilter(m137546j(i, mode));
    }

    /* renamed from: m */
    public static void m137548m(Drawable drawable, C103524d0 d0Var, int[] iArr) {
        if (!C103556p.m137671a(drawable) || drawable.mutate() == drawable) {
            boolean z = d0Var.f305713d;
            if (z || d0Var.f305712c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? d0Var.f305710a : null;
                PorterDuff.Mode mode = d0Var.f305712c ? d0Var.f305711b : f305720g;
                if (!(colorStateList == null || mode == null)) {
                    porterDuffColorFilter = m137546j(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m137549n(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f305720g
            int[] r1 = f305723j
            boolean r1 = m137544c(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0016
            r2 = 2130968850(0x7f040112, float:1.7546365E38)
        L_0x0013:
            r7 = -1
        L_0x0014:
            r1 = 1
            goto L_0x0046
        L_0x0016:
            int[] r1 = f305725l
            boolean r1 = m137544c(r1, r7)
            if (r1 == 0) goto L_0x0022
            r2 = 2130968848(0x7f040110, float:1.7546361E38)
            goto L_0x0013
        L_0x0022:
            int[] r1 = f305726m
            boolean r1 = m137544c(r1, r7)
            if (r1 == 0) goto L_0x002d
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0013
        L_0x002d:
            r1 = 2131230792(0x7f080048, float:1.8077647E38)
            if (r7 != r1) goto L_0x003d
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            goto L_0x0014
        L_0x003d:
            r1 = 2131230767(0x7f08002f, float:1.8077596E38)
            if (r7 != r1) goto L_0x0043
            goto L_0x0013
        L_0x0043:
            r7 = -1
            r1 = 0
            r2 = 0
        L_0x0046:
            if (r1 == 0) goto L_0x0063
            boolean r1 = androidx.appcompat.widget.C103556p.m137671a(r8)
            if (r1 == 0) goto L_0x0052
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0052:
            int r6 = androidx.appcompat.widget.C103518a0.m137530b(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m137546j(r6, r0)
            r8.setColorFilter(r6)
            if (r7 == r3) goto L_0x0062
            r8.setAlpha(r7)
        L_0x0062:
            return r5
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103527f.m137549n(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    public final void mo144323a(String str, C103531d dVar) {
        if (this.f305730b == null) {
            this.f305730b = new C111055b<>();
        }
        this.f305730b.put(str, dVar);
    }

    /* renamed from: b */
    public final synchronized boolean mo144324b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C111057f fVar = this.f305732d.get(context);
        if (fVar == null) {
            fVar = new C111057f();
            this.f305732d.put(context, fVar);
        }
        fVar.mo162756e(j, new WeakReference(constantState));
        return true;
    }

    /* renamed from: d */
    public final ColorStateList mo144325d(Context context, int i) {
        int b = C103518a0.m137530b(context, C0966R.attr.f2732g7);
        int a = C103518a0.m137529a(context, C0966R.attr.f2730g5);
        return new ColorStateList(new int[][]{C103518a0.f305696b, C103518a0.f305698d, C103518a0.f305697c, C103518a0.f305700f}, new int[]{a, C90885a.m114003h(b, i), C90885a.m114003h(b, i), i});
    }

    /* renamed from: e */
    public final Drawable mo144326e(Context context, int i) {
        Drawable i2;
        Drawable i3;
        if (this.f305733e == null) {
            this.f305733e = new TypedValue();
        }
        TypedValue typedValue = this.f305733e;
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable h = mo144328h(context, j);
        if (h != null) {
            return h;
        }
        if (i == C0966R.C0969drawable.f4350a3) {
            Drawable[] drawableArr = new Drawable[2];
            synchronized (this) {
                i2 = mo144329i(context, C0966R.C0969drawable.f4349a2, false);
            }
            drawableArr[0] = i2;
            synchronized (this) {
                i3 = mo144329i(context, C0966R.C0969drawable.baw, false);
            }
            drawableArr[1] = i3;
            h = new LayerDrawable(drawableArr);
        }
        if (h != null) {
            h.setChangingConfigurations(typedValue.changingConfigurations);
            mo144324b(context, j, h);
        }
        return h;
    }

    /* renamed from: f */
    public final ColorStateList mo144327f(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList c = C103518a0.m137531c(context, C0966R.attr.f2738gl);
        if (c == null || !c.isStateful()) {
            iArr[0] = C103518a0.f305696b;
            iArr2[0] = C103518a0.m137529a(context, C0966R.attr.f2738gl);
            iArr[1] = C103518a0.f305699e;
            iArr2[1] = C103518a0.m137530b(context, C0966R.attr.f2731g6);
            iArr[2] = C103518a0.f305700f;
            iArr2[2] = C103518a0.m137530b(context, C0966R.attr.f2738gl);
        } else {
            int[] iArr3 = C103518a0.f305696b;
            iArr[0] = iArr3;
            iArr2[0] = c.getColorForState(iArr3, 0);
            iArr[1] = C103518a0.f305699e;
            iArr2[1] = C103518a0.m137530b(context, C0966R.attr.f2731g6);
            iArr[2] = C103518a0.f305700f;
            iArr2[2] = c.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f332575f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo144328h(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, u.f<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f305732d     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            u.f r0 = (p1042u.C111057f) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo162755d(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f332574e     // Catch:{ all -> 0x0041 }
            int r2 = r0.f332576g     // Catch:{ all -> 0x0041 }
            int r4 = p1042u.C111056e.m151430b(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f332575f     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = p1042u.C111057f.f332572h     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f332573d = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103527f.mo144328h(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.graphics.PorterDuff$Mode} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: android.graphics.PorterDuff$Mode} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    public synchronized android.graphics.drawable.Drawable mo144329i(android.content.Context r12, int r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f305734f     // Catch:{ all -> 0x00ce }
            r1 = 1
            if (r0 == 0) goto L_0x0007
            goto L_0x002f
        L_0x0007:
            r11.f305734f = r1     // Catch:{ all -> 0x00ce }
            r0 = 2131230839(0x7f080077, float:1.8077742E38)
            monitor-enter(r11)     // Catch:{ all -> 0x00ce }
            r2 = 0
            android.graphics.drawable.Drawable r0 = r11.mo144329i(r12, r0, r2)     // Catch:{ all -> 0x01a6 }
            monitor-exit(r11)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x019c
            boolean r3 = r0 instanceof p906j4.C108561g     // Catch:{ all -> 0x00ce }
            if (r3 != 0) goto L_0x002c
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x00ce }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r0 = 0
            goto L_0x002d
        L_0x002c:
            r0 = 1
        L_0x002d:
            if (r0 == 0) goto L_0x019c
        L_0x002f:
            u.b<java.lang.String, androidx.appcompat.widget.f$d> r0 = r11.f305730b     // Catch:{ all -> 0x00ce }
            r2 = 0
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x00e3
            u.j<java.lang.String> r0 = r11.f305731c     // Catch:{ all -> 0x00ce }
            java.lang.String r3 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r0.mo162805e(r13, r2)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00ce }
            boolean r4 = r3.equals(r0)     // Catch:{ all -> 0x00ce }
            if (r4 != 0) goto L_0x00e3
            if (r0 == 0) goto L_0x005f
            u.b<java.lang.String, androidx.appcompat.widget.f$d> r4 = r11.f305730b     // Catch:{ all -> 0x00ce }
            java.lang.Object r0 = r4.getOrDefault(r0, r2)     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x005f
            goto L_0x00e3
        L_0x0058:
            u.j r0 = new u.j     // Catch:{ all -> 0x00ce }
            r0.<init>()     // Catch:{ all -> 0x00ce }
            r11.f305731c = r0     // Catch:{ all -> 0x00ce }
        L_0x005f:
            android.util.TypedValue r0 = r11.f305733e     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x006a
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x00ce }
            r0.<init>()     // Catch:{ all -> 0x00ce }
            r11.f305733e = r0     // Catch:{ all -> 0x00ce }
        L_0x006a:
            android.util.TypedValue r0 = r11.f305733e     // Catch:{ all -> 0x00ce }
            android.content.res.Resources r4 = r12.getResources()     // Catch:{ all -> 0x00ce }
            r4.getValue(r13, r0, r1)     // Catch:{ all -> 0x00ce }
            int r5 = r0.assetCookie     // Catch:{ all -> 0x00ce }
            long r5 = (long) r5     // Catch:{ all -> 0x00ce }
            r7 = 32
            long r5 = r5 << r7
            int r7 = r0.data     // Catch:{ all -> 0x00ce }
            long r7 = (long) r7     // Catch:{ all -> 0x00ce }
            long r5 = r5 | r7
            android.graphics.drawable.Drawable r7 = r11.mo144328h(r12, r5)     // Catch:{ all -> 0x00ce }
            if (r7 == 0) goto L_0x0084
            goto L_0x00e4
        L_0x0084:
            java.lang.CharSequence r8 = r0.string     // Catch:{ all -> 0x00ce }
            if (r8 == 0) goto L_0x00db
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x00ce }
            java.lang.String r9 = ".xml"
            boolean r8 = r8.endsWith(r9)     // Catch:{ all -> 0x00ce }
            if (r8 == 0) goto L_0x00db
            android.content.res.XmlResourceParser r4 = r4.getXml(r13)     // Catch:{ Exception -> 0x00d1 }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r4)     // Catch:{ Exception -> 0x00d1 }
        L_0x009c:
            int r9 = r4.next()     // Catch:{ Exception -> 0x00d1 }
            r10 = 2
            if (r9 == r10) goto L_0x00a6
            if (r9 == r1) goto L_0x00a6
            goto L_0x009c
        L_0x00a6:
            if (r9 != r10) goto L_0x00d3
            java.lang.String r1 = r4.getName()     // Catch:{ Exception -> 0x00d1 }
            u.j<java.lang.String> r9 = r11.f305731c     // Catch:{ Exception -> 0x00d1 }
            r9.mo162800a(r13, r1)     // Catch:{ Exception -> 0x00d1 }
            u.b<java.lang.String, androidx.appcompat.widget.f$d> r9 = r11.f305730b     // Catch:{ Exception -> 0x00d1 }
            java.lang.Object r1 = r9.getOrDefault(r1, r2)     // Catch:{ Exception -> 0x00d1 }
            androidx.appcompat.widget.f$d r1 = (androidx.appcompat.widget.C103527f.C103531d) r1     // Catch:{ Exception -> 0x00d1 }
            if (r1 == 0) goto L_0x00c3
            android.content.res.Resources$Theme r9 = r12.getTheme()     // Catch:{ Exception -> 0x00d1 }
            android.graphics.drawable.Drawable r7 = r1.mo144331a(r12, r4, r8, r9)     // Catch:{ Exception -> 0x00d1 }
        L_0x00c3:
            if (r7 == 0) goto L_0x00db
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00d1 }
            r7.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00d1 }
            r11.mo144324b(r12, r5, r7)     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00db
        L_0x00ce:
            r12 = move-exception
            goto L_0x01a9
        L_0x00d1:
            goto L_0x00db
        L_0x00d3:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d1 }
            throw r0     // Catch:{ Exception -> 0x00d1 }
        L_0x00db:
            if (r7 != 0) goto L_0x00e4
            u.j<java.lang.String> r0 = r11.f305731c     // Catch:{ all -> 0x00ce }
            r0.mo162800a(r13, r3)     // Catch:{ all -> 0x00ce }
            goto L_0x00e4
        L_0x00e3:
            r7 = r2
        L_0x00e4:
            if (r7 != 0) goto L_0x00ea
            android.graphics.drawable.Drawable r7 = r11.mo144326e(r12, r13)     // Catch:{ all -> 0x00ce }
        L_0x00ea:
            if (r7 != 0) goto L_0x00f2
            java.lang.Object r0 = p385u2.C111105a.f332697a     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r7 = p385u2.C111105a.C111110c.m151511b(r12, r13)     // Catch:{ all -> 0x00ce }
        L_0x00f2:
            if (r7 == 0) goto L_0x0195
            android.content.res.ColorStateList r0 = r11.mo144330k(r12, r13)     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x011a
            boolean r12 = androidx.appcompat.widget.C103556p.m137671a(r7)     // Catch:{ all -> 0x00ce }
            if (r12 == 0) goto L_0x0104
            android.graphics.drawable.Drawable r7 = r7.mutate()     // Catch:{ all -> 0x00ce }
        L_0x0104:
            android.graphics.drawable.Drawable r12 = p1162x2.C112019a.m152749g(r7)     // Catch:{ all -> 0x00ce }
            r12.setTintList(r0)     // Catch:{ all -> 0x00ce }
            r14 = 2131230823(0x7f080067, float:1.807771E38)
            if (r13 != r14) goto L_0x0112
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x00ce }
        L_0x0112:
            if (r2 == 0) goto L_0x0117
            r12.setTintMode(r2)     // Catch:{ all -> 0x00ce }
        L_0x0117:
            r2 = r12
            goto L_0x0194
        L_0x011a:
            r0 = 2131230815(0x7f08005f, float:1.8077693E38)
            r1 = 16908301(0x102000d, float:2.3877265E-38)
            r3 = 16908303(0x102000f, float:2.387727E-38)
            r4 = 16908288(0x1020000, float:2.387723E-38)
            r5 = 2130968848(0x7f040110, float:1.7546361E38)
            r6 = 2130968850(0x7f040112, float:1.7546365E38)
            if (r13 != r0) goto L_0x0154
            r13 = r7
            android.graphics.drawable.LayerDrawable r13 = (android.graphics.drawable.LayerDrawable) r13     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r14 = r13.findDrawableByLayerId(r4)     // Catch:{ all -> 0x00ce }
            int r0 = androidx.appcompat.widget.C103518a0.m137530b(r12, r6)     // Catch:{ all -> 0x00ce }
            android.graphics.PorterDuff$Mode r2 = f305720g     // Catch:{ all -> 0x00ce }
            m137547l(r14, r0, r2)     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r14 = r13.findDrawableByLayerId(r3)     // Catch:{ all -> 0x00ce }
            int r0 = androidx.appcompat.widget.C103518a0.m137530b(r12, r6)     // Catch:{ all -> 0x00ce }
            m137547l(r14, r0, r2)     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r13 = r13.findDrawableByLayerId(r1)     // Catch:{ all -> 0x00ce }
            int r12 = androidx.appcompat.widget.C103518a0.m137530b(r12, r5)     // Catch:{ all -> 0x00ce }
            m137547l(r13, r12, r2)     // Catch:{ all -> 0x00ce }
            goto L_0x0193
        L_0x0154:
            r0 = 2131230806(0x7f080056, float:1.8077675E38)
            if (r13 == r0) goto L_0x016d
            r0 = 2131230805(0x7f080055, float:1.8077673E38)
            if (r13 == r0) goto L_0x016d
            r0 = 2131230807(0x7f080057, float:1.8077677E38)
            if (r13 != r0) goto L_0x0164
            goto L_0x016d
        L_0x0164:
            boolean r12 = m137549n(r12, r13, r7)     // Catch:{ all -> 0x00ce }
            if (r12 != 0) goto L_0x0193
            if (r14 == 0) goto L_0x0193
            goto L_0x0194
        L_0x016d:
            r13 = r7
            android.graphics.drawable.LayerDrawable r13 = (android.graphics.drawable.LayerDrawable) r13     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r14 = r13.findDrawableByLayerId(r4)     // Catch:{ all -> 0x00ce }
            int r0 = androidx.appcompat.widget.C103518a0.m137529a(r12, r6)     // Catch:{ all -> 0x00ce }
            android.graphics.PorterDuff$Mode r2 = f305720g     // Catch:{ all -> 0x00ce }
            m137547l(r14, r0, r2)     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r14 = r13.findDrawableByLayerId(r3)     // Catch:{ all -> 0x00ce }
            int r0 = androidx.appcompat.widget.C103518a0.m137530b(r12, r5)     // Catch:{ all -> 0x00ce }
            m137547l(r14, r0, r2)     // Catch:{ all -> 0x00ce }
            android.graphics.drawable.Drawable r13 = r13.findDrawableByLayerId(r1)     // Catch:{ all -> 0x00ce }
            int r12 = androidx.appcompat.widget.C103518a0.m137530b(r12, r5)     // Catch:{ all -> 0x00ce }
            m137547l(r13, r12, r2)     // Catch:{ all -> 0x00ce }
        L_0x0193:
            r2 = r7
        L_0x0194:
            r7 = r2
        L_0x0195:
            if (r7 == 0) goto L_0x019a
            androidx.appcompat.widget.C103556p.m137672b(r7)     // Catch:{ all -> 0x00ce }
        L_0x019a:
            monitor-exit(r11)
            return r7
        L_0x019c:
            r11.f305734f = r2     // Catch:{ all -> 0x00ce }
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ce }
            java.lang.String r13 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r12.<init>(r13)     // Catch:{ all -> 0x00ce }
            throw r12     // Catch:{ all -> 0x00ce }
        L_0x01a6:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00ce }
            throw r12     // Catch:{ all -> 0x00ce }
        L_0x01a9:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103527f.mo144329i(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: android.content.res.ColorStateList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList mo144330k(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, u.j<android.content.res.ColorStateList>> r0 = r3.f305729a     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0025 }
            u.j r0 = (p1042u.C111060j) r0     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.mo162805e(r5, r1)     // Catch:{ all -> 0x0025 }
            r1 = r0
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1     // Catch:{ all -> 0x0025 }
        L_0x0015:
            if (r1 != 0) goto L_0x00e2
            r0 = 2131230768(0x7f080030, float:1.8077598E38)
            if (r5 != r0) goto L_0x0028
            r0 = 2131099983(0x7f06014f, float:1.7812335E38)
            android.content.res.ColorStateList r1 = p1115h.C107922a.m146227a(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x0025:
            r4 = move-exception
            goto L_0x00e4
        L_0x0028:
            r0 = 2131230824(0x7f080068, float:1.8077712E38)
            if (r5 != r0) goto L_0x0036
            r0 = 2131099986(0x7f060152, float:1.781234E38)
            android.content.res.ColorStateList r1 = p1115h.C107922a.m146227a(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x0036:
            r0 = 2131230823(0x7f080067, float:1.807771E38)
            if (r5 != r0) goto L_0x0041
            android.content.res.ColorStateList r1 = r3.mo144327f(r4)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x0041:
            r0 = 2131230757(0x7f080025, float:1.8077576E38)
            if (r5 != r0) goto L_0x0053
            r0 = 2130968847(0x7f04010f, float:1.754636E38)
            int r0 = androidx.appcompat.widget.C103518a0.m137530b(r4, r0)     // Catch:{ all -> 0x0025 }
            android.content.res.ColorStateList r1 = r3.mo144325d(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x0053:
            r0 = 2131230752(0x7f080020, float:1.8077566E38)
            if (r5 != r0) goto L_0x005e
            r0 = 0
            android.content.res.ColorStateList r1 = r3.mo144325d(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x005e:
            r0 = 2131230756(0x7f080024, float:1.8077574E38)
            if (r5 != r0) goto L_0x006f
            r0 = 2130968845(0x7f04010d, float:1.7546355E38)
            int r0 = androidx.appcompat.widget.C103518a0.m137530b(r4, r0)     // Catch:{ all -> 0x0025 }
            android.content.res.ColorStateList r1 = r3.mo144325d(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x006f:
            r0 = 2131230821(0x7f080065, float:1.8077706E38)
            if (r5 == r0) goto L_0x00b7
            r0 = 2131230822(0x7f080066, float:1.8077708E38)
            if (r5 != r0) goto L_0x007a
            goto L_0x00b7
        L_0x007a:
            int[] r0 = f305724k     // Catch:{ all -> 0x0025 }
            boolean r0 = m137544c(r0, r5)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x008a
            r0 = 2130968850(0x7f040112, float:1.7546365E38)
            android.content.res.ColorStateList r1 = androidx.appcompat.widget.C103518a0.m137531c(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x008a:
            int[] r0 = f305727n     // Catch:{ all -> 0x0025 }
            boolean r0 = m137544c(r0, r5)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x009a
            r0 = 2131099982(0x7f06014e, float:1.7812333E38)
            android.content.res.ColorStateList r1 = p1115h.C107922a.m146227a(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x009a:
            int[] r0 = f305728o     // Catch:{ all -> 0x0025 }
            boolean r0 = m137544c(r0, r5)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x00aa
            r0 = 2131099981(0x7f06014d, float:1.781233E38)
            android.content.res.ColorStateList r1 = p1115h.C107922a.m146227a(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x00aa:
            r0 = 2131230813(0x7f08005d, float:1.807769E38)
            if (r5 != r0) goto L_0x00be
            r0 = 2131099984(0x7f060150, float:1.7812337E38)
            android.content.res.ColorStateList r1 = p1115h.C107922a.m146227a(r4, r0)     // Catch:{ all -> 0x0025 }
            goto L_0x00be
        L_0x00b7:
            r0 = 2131099985(0x7f060151, float:1.7812339E38)
            android.content.res.ColorStateList r1 = p1115h.C107922a.m146227a(r4, r0)     // Catch:{ all -> 0x0025 }
        L_0x00be:
            if (r1 == 0) goto L_0x00e2
            java.util.WeakHashMap<android.content.Context, u.j<android.content.res.ColorStateList>> r0 = r3.f305729a     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x00cb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0025 }
            r0.<init>()     // Catch:{ all -> 0x0025 }
            r3.f305729a = r0     // Catch:{ all -> 0x0025 }
        L_0x00cb:
            java.util.WeakHashMap<android.content.Context, u.j<android.content.res.ColorStateList>> r0 = r3.f305729a     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0025 }
            u.j r0 = (p1042u.C111060j) r0     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x00df
            u.j r0 = new u.j     // Catch:{ all -> 0x0025 }
            r0.<init>()     // Catch:{ all -> 0x0025 }
            java.util.WeakHashMap<android.content.Context, u.j<android.content.res.ColorStateList>> r2 = r3.f305729a     // Catch:{ all -> 0x0025 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0025 }
        L_0x00df:
            r0.mo162800a(r5, r1)     // Catch:{ all -> 0x0025 }
        L_0x00e2:
            monitor-exit(r3)
            return r1
        L_0x00e4:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C103527f.mo144330k(android.content.Context, int):android.content.res.ColorStateList");
    }
}
