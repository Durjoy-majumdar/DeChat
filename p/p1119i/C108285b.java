package p1119i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import p1119i.C108290d;

/* renamed from: i.b */
public class C108285b extends Drawable implements Drawable.Callback {

    /* renamed from: s */
    public static final /* synthetic */ int f324194s = 0;

    /* renamed from: d */
    public C108288c f324195d;

    /* renamed from: e */
    public Rect f324196e;

    /* renamed from: f */
    public Drawable f324197f;

    /* renamed from: g */
    public Drawable f324198g;

    /* renamed from: h */
    public int f324199h = 255;

    /* renamed from: i */
    public boolean f324200i;

    /* renamed from: j */
    public int f324201j = -1;

    /* renamed from: n */
    public boolean f324202n;

    /* renamed from: o */
    public Runnable f324203o;

    /* renamed from: p */
    public long f324204p;

    /* renamed from: q */
    public long f324205q;

    /* renamed from: r */
    public C108287b f324206r;

    /* renamed from: i.b$a */
    public class C108286a implements Runnable {
        public C108286a() {
        }

        public void run() {
            C108285b.this.mo158679a(true);
            C108285b.this.invalidateSelf();
        }
    }

    /* renamed from: i.b$b */
    public static class C108287b implements Drawable.Callback {

        /* renamed from: d */
        public Drawable.Callback f324208d;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f324208d;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f324208d;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: i.b$c */
    public static abstract class C108288c extends Drawable.ConstantState {

        /* renamed from: A */
        public boolean f324209A;

        /* renamed from: B */
        public ColorFilter f324210B;

        /* renamed from: C */
        public boolean f324211C;

        /* renamed from: D */
        public ColorStateList f324212D;

        /* renamed from: E */
        public PorterDuff.Mode f324213E;

        /* renamed from: F */
        public boolean f324214F;

        /* renamed from: G */
        public boolean f324215G;

        /* renamed from: a */
        public final C108285b f324216a;

        /* renamed from: b */
        public Resources f324217b;

        /* renamed from: c */
        public int f324218c = 160;

        /* renamed from: d */
        public int f324219d;

        /* renamed from: e */
        public int f324220e;

        /* renamed from: f */
        public SparseArray<Drawable.ConstantState> f324221f;

        /* renamed from: g */
        public Drawable[] f324222g;

        /* renamed from: h */
        public int f324223h;

        /* renamed from: i */
        public boolean f324224i;

        /* renamed from: j */
        public boolean f324225j;

        /* renamed from: k */
        public Rect f324226k;

        /* renamed from: l */
        public boolean f324227l;

        /* renamed from: m */
        public boolean f324228m;

        /* renamed from: n */
        public int f324229n;

        /* renamed from: o */
        public int f324230o;

        /* renamed from: p */
        public int f324231p;

        /* renamed from: q */
        public int f324232q;

        /* renamed from: r */
        public boolean f324233r;

        /* renamed from: s */
        public int f324234s;

        /* renamed from: t */
        public boolean f324235t;

        /* renamed from: u */
        public boolean f324236u;

        /* renamed from: v */
        public boolean f324237v;

        /* renamed from: w */
        public boolean f324238w;

        /* renamed from: x */
        public int f324239x;

        /* renamed from: y */
        public int f324240y;

        /* renamed from: z */
        public int f324241z;

        public C108288c(C108288c cVar, C108285b bVar, Resources resources) {
            int i = 160;
            this.f324224i = false;
            this.f324227l = false;
            this.f324238w = true;
            this.f324240y = 0;
            this.f324241z = 0;
            this.f324216a = bVar;
            this.f324217b = resources != null ? resources : cVar != null ? cVar.f324217b : null;
            int i2 = cVar != null ? cVar.f324218c : 0;
            int i3 = C108285b.f324194s;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i = i2 != 0 ? i2 : i;
            this.f324218c = i;
            if (cVar != null) {
                this.f324219d = cVar.f324219d;
                this.f324220e = cVar.f324220e;
                this.f324236u = true;
                this.f324237v = true;
                this.f324224i = cVar.f324224i;
                this.f324227l = cVar.f324227l;
                this.f324238w = cVar.f324238w;
                this.f324239x = cVar.f324239x;
                this.f324240y = cVar.f324240y;
                this.f324241z = cVar.f324241z;
                this.f324209A = cVar.f324209A;
                this.f324210B = cVar.f324210B;
                this.f324211C = cVar.f324211C;
                this.f324212D = cVar.f324212D;
                this.f324213E = cVar.f324213E;
                this.f324214F = cVar.f324214F;
                this.f324215G = cVar.f324215G;
                if (cVar.f324218c == i) {
                    if (cVar.f324225j) {
                        this.f324226k = new Rect(cVar.f324226k);
                        this.f324225j = true;
                    }
                    if (cVar.f324228m) {
                        this.f324229n = cVar.f324229n;
                        this.f324230o = cVar.f324230o;
                        this.f324231p = cVar.f324231p;
                        this.f324232q = cVar.f324232q;
                        this.f324228m = true;
                    }
                }
                if (cVar.f324233r) {
                    this.f324234s = cVar.f324234s;
                    this.f324233r = true;
                }
                if (cVar.f324235t) {
                    this.f324235t = true;
                }
                Drawable[] drawableArr = cVar.f324222g;
                this.f324222g = new Drawable[drawableArr.length];
                this.f324223h = cVar.f324223h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f324221f;
                if (sparseArray != null) {
                    this.f324221f = sparseArray.clone();
                } else {
                    this.f324221f = new SparseArray<>(this.f324223h);
                }
                int i4 = this.f324223h;
                for (int i5 = 0; i5 < i4; i5++) {
                    Drawable drawable = drawableArr[i5];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f324221f.put(i5, constantState);
                        } else {
                            this.f324222g[i5] = drawableArr[i5];
                        }
                    }
                }
                return;
            }
            this.f324222g = new Drawable[10];
            this.f324223h = 0;
        }

        /* renamed from: a */
        public final int mo158716a(Drawable drawable) {
            int i = this.f324223h;
            if (i >= this.f324222g.length) {
                int i2 = i + 10;
                C108290d.C108291a aVar = (C108290d.C108291a) this;
                Drawable[] drawableArr = new Drawable[i2];
                System.arraycopy(aVar.f324222g, 0, drawableArr, 0, i);
                aVar.f324222g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(aVar.f324245H, 0, iArr, 0, i);
                aVar.f324245H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f324216a);
            this.f324222g[i] = drawable;
            this.f324223h++;
            this.f324220e = drawable.getChangingConfigurations() | this.f324220e;
            this.f324233r = false;
            this.f324235t = false;
            this.f324226k = null;
            this.f324225j = false;
            this.f324228m = false;
            this.f324236u = false;
            return i;
        }

        /* renamed from: b */
        public void mo158717b() {
            this.f324228m = true;
            mo158718c();
            int i = this.f324223h;
            Drawable[] drawableArr = this.f324222g;
            this.f324230o = -1;
            this.f324229n = -1;
            this.f324232q = 0;
            this.f324231p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f324229n) {
                    this.f324229n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f324230o) {
                    this.f324230o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f324231p) {
                    this.f324231p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f324232q) {
                    this.f324232q = minimumHeight;
                }
            }
        }

        /* renamed from: c */
        public final void mo158718c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f324221f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int keyAt = this.f324221f.keyAt(i);
                    Drawable[] drawableArr = this.f324222g;
                    Drawable newDrawable = this.f324221f.valueAt(i).newDrawable(this.f324217b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        newDrawable.setLayoutDirection(this.f324239x);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f324216a);
                    drawableArr[keyAt] = mutate;
                }
                this.f324221f = null;
            }
        }

        public boolean canApplyTheme() {
            int i = this.f324223h;
            Drawable[] drawableArr = this.f324222g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f324221f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final Drawable mo158720d(int i) {
            int indexOfKey;
            Drawable drawable = this.f324222g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f324221f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f324221f.valueAt(indexOfKey).newDrawable(this.f324217b);
            if (Build.VERSION.SDK_INT >= 23) {
                newDrawable.setLayoutDirection(this.f324239x);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f324216a);
            this.f324222g[i] = mutate;
            this.f324221f.removeAt(indexOfKey);
            if (this.f324221f.size() == 0) {
                this.f324221f = null;
            }
            return mutate;
        }

        /* renamed from: e */
        public abstract void mo158673e();

        /* renamed from: f */
        public final boolean mo158721f(int i, int i2) {
            int i3 = this.f324223h;
            Drawable[] drawableArr = this.f324222g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawable.setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f324239x = i;
            return z;
        }

        public int getChangingConfigurations() {
            return this.f324219d | this.f324220e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158679a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f324200i = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f324197f
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f324204p
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f324199h
            r3.setAlpha(r9)
            r13.f324204p = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            i.b$c r9 = r13.f324195d
            int r9 = r9.f324240y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f324199h
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f324204p = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f324198g
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f324205q
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f324198g = r0
            r13.f324205q = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$c r4 = r13.f324195d
            int r4 = r4.f324241z
            int r3 = r3 / r4
            int r4 = r13.f324199h
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f324205q = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f324203o
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1119i.C108285b.mo158679a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        C108288c cVar = this.f324195d;
        if (theme != null) {
            cVar.mo158718c();
            int i = cVar.f324223h;
            Drawable[] drawableArr = cVar.f324222g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    cVar.f324220e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                cVar.f324217b = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = cVar.f324218c;
                cVar.f324218c = i3;
                if (i4 != i3) {
                    cVar.f324228m = false;
                    cVar.f324225j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    /* renamed from: b */
    public C108288c mo158664b() {
        throw null;
    }

    /* renamed from: c */
    public final void mo158681c(Drawable drawable) {
        if (this.f324206r == null) {
            this.f324206r = new C108287b();
        }
        C108287b bVar = this.f324206r;
        bVar.f324208d = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f324195d.f324240y <= 0 && this.f324200i) {
                drawable.setAlpha(this.f324199h);
            }
            C108288c cVar = this.f324195d;
            if (cVar.f324211C) {
                drawable.setColorFilter(cVar.f324210B);
            } else {
                if (cVar.f324214F) {
                    drawable.setTintList(cVar.f324212D);
                }
                C108288c cVar2 = this.f324195d;
                if (cVar2.f324215G) {
                    drawable.setTintMode(cVar2.f324213E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f324195d.f324238w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            drawable.setAutoMirrored(this.f324195d.f324209A);
            Rect rect = this.f324196e;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C108287b bVar2 = this.f324206r;
            Drawable.Callback callback = bVar2.f324208d;
            bVar2.f324208d = null;
            drawable.setCallback(callback);
        }
    }

    public boolean canApplyTheme() {
        return this.f324195d.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo158683d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f324201j
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$c r0 = r9.f324195d
            int r0 = r0.f324241z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f324198g
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f324197f
            if (r0 == 0) goto L_0x0029
            r9.f324198g = r0
            i.b$c r0 = r9.f324195d
            int r0 = r0.f324241z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f324205q = r0
            goto L_0x0035
        L_0x0029:
            r9.f324198g = r4
            r9.f324205q = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f324197f
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            i.b$c r0 = r9.f324195d
            int r1 = r0.f324223h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo158720d(r10)
            r9.f324197f = r0
            r9.f324201j = r10
            if (r0 == 0) goto L_0x005a
            i.b$c r10 = r9.f324195d
            int r10 = r10.f324240y
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f324204p = r2
        L_0x0051:
            r9.mo158681c(r0)
            goto L_0x005a
        L_0x0055:
            r9.f324197f = r4
            r10 = -1
            r9.f324201j = r10
        L_0x005a:
            long r0 = r9.f324204p
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f324205q
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f324203o
            if (r0 != 0) goto L_0x0073
            i.b$a r0 = new i.b$a
            r0.<init>()
            r9.f324203o = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo158679a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p1119i.C108285b.mo158683d(int):boolean");
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f324197f;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f324198g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public void mo158665e(C108288c cVar) {
        throw null;
    }

    public int getAlpha() {
        return this.f324199h;
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C108288c cVar = this.f324195d;
        return changingConfigurations | cVar.f324220e | cVar.f324219d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r0.f324237v = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        /*
            r7 = this;
            i.b$c r0 = r7.f324195d
            monitor-enter(r0)
            boolean r1 = r0.f324236u     // Catch:{ all -> 0x003b }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x000d
            boolean r2 = r0.f324237v     // Catch:{ all -> 0x003b }
            monitor-exit(r0)
            goto L_0x002c
        L_0x000d:
            r0.mo158718c()     // Catch:{ all -> 0x003b }
            r0.f324236u = r3     // Catch:{ all -> 0x003b }
            int r1 = r0.f324223h     // Catch:{ all -> 0x003b }
            android.graphics.drawable.Drawable[] r4 = r0.f324222g     // Catch:{ all -> 0x003b }
            r5 = 0
        L_0x0017:
            if (r5 >= r1) goto L_0x0028
            r6 = r4[r5]     // Catch:{ all -> 0x003b }
            android.graphics.drawable.Drawable$ConstantState r6 = r6.getConstantState()     // Catch:{ all -> 0x003b }
            if (r6 != 0) goto L_0x0025
            r0.f324237v = r2     // Catch:{ all -> 0x003b }
            monitor-exit(r0)
            goto L_0x002c
        L_0x0025:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0028:
            r0.f324237v = r3     // Catch:{ all -> 0x003b }
            monitor-exit(r0)
            r2 = 1
        L_0x002c:
            if (r2 == 0) goto L_0x0039
            i.b$c r0 = r7.f324195d
            int r1 = r7.getChangingConfigurations()
            r0.f324219d = r1
            i.b$c r0 = r7.f324195d
            return r0
        L_0x0039:
            r0 = 0
            return r0
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1119i.C108285b.getConstantState():android.graphics.drawable.Drawable$ConstantState");
    }

    public Drawable getCurrent() {
        return this.f324197f;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f324196e;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        C108288c cVar = this.f324195d;
        if (cVar.f324227l) {
            if (!cVar.f324228m) {
                cVar.mo158717b();
            }
            return cVar.f324230o;
        }
        Drawable drawable = this.f324197f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        C108288c cVar = this.f324195d;
        if (cVar.f324227l) {
            if (!cVar.f324228m) {
                cVar.mo158717b();
            }
            return cVar.f324229n;
        }
        Drawable drawable = this.f324197f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        C108288c cVar = this.f324195d;
        if (cVar.f324227l) {
            if (!cVar.f324228m) {
                cVar.mo158717b();
            }
            return cVar.f324232q;
        }
        Drawable drawable = this.f324197f;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        C108288c cVar = this.f324195d;
        if (cVar.f324227l) {
            if (!cVar.f324228m) {
                cVar.mo158717b();
            }
            return cVar.f324231p;
        }
        Drawable drawable = this.f324197f;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f324197f;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C108288c cVar = this.f324195d;
        if (cVar.f324233r) {
            return cVar.f324234s;
        }
        cVar.mo158718c();
        int i2 = cVar.f324223h;
        Drawable[] drawableArr = cVar.f324222g;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        cVar.f324234s = i;
        cVar.f324233r = true;
        return i;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f324197f;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        C108288c cVar = this.f324195d;
        Rect rect2 = null;
        boolean z2 = true;
        if (!cVar.f324224i) {
            Rect rect3 = cVar.f324226k;
            if (rect3 != null || cVar.f324225j) {
                rect2 = rect3;
            } else {
                cVar.mo158718c();
                Rect rect4 = new Rect();
                int i = cVar.f324223h;
                Drawable[] drawableArr = cVar.f324222g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.f324225j = true;
                cVar.f324226k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f324197f;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (!this.f324195d.f324209A || getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C108288c cVar = this.f324195d;
        if (cVar != null) {
            cVar.f324233r = false;
            cVar.f324235t = false;
        }
        if (drawable == this.f324197f && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f324195d.f324209A;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f324198g;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f324198g = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f324197f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f324200i) {
                this.f324197f.setAlpha(this.f324199h);
            }
        }
        if (this.f324205q != 0) {
            this.f324205q = 0;
            z = true;
        }
        if (this.f324204p != 0) {
            this.f324204p = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f324202n && super.mutate() == this) {
            C108288c b = mo158664b();
            b.mo158673e();
            mo158665e(b);
            this.f324202n = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f324198g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f324197f;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f324195d.mo158721f(i, this.f324201j);
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f324198g;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f324197f;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f324198g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f324197f;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f324197f && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f324200i || this.f324199h != i) {
            this.f324200i = true;
            this.f324199h = i;
            Drawable drawable = this.f324197f;
            if (drawable == null) {
                return;
            }
            if (this.f324204p == 0) {
                drawable.setAlpha(i);
            } else {
                mo158679a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C108288c cVar = this.f324195d;
        if (cVar.f324209A != z) {
            cVar.f324209A = z;
            Drawable drawable = this.f324197f;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C108288c cVar = this.f324195d;
        cVar.f324211C = true;
        if (cVar.f324210B != colorFilter) {
            cVar.f324210B = colorFilter;
            Drawable drawable = this.f324197f;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C108288c cVar = this.f324195d;
        if (cVar.f324238w != z) {
            cVar.f324238w = z;
            Drawable drawable = this.f324197f;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f324197f;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f324196e;
        if (rect == null) {
            this.f324196e = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f324197f;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C108288c cVar = this.f324195d;
        cVar.f324214F = true;
        if (cVar.f324212D != colorStateList) {
            cVar.f324212D = colorStateList;
            this.f324197f.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C108288c cVar = this.f324195d;
        cVar.f324215G = true;
        if (cVar.f324213E != mode) {
            cVar.f324213E = mode;
            this.f324197f.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f324198g;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f324197f;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f324197f && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
