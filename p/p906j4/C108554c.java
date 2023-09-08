package p906j4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p1042u.C111055b;
import p1162x2.C112019a;

/* renamed from: j4.c */
public class C108554c extends C108560f implements Animatable {

    /* renamed from: e */
    public C108556b f324949e;

    /* renamed from: f */
    public Context f324950f;

    /* renamed from: g */
    public final Drawable.Callback f324951g;

    /* renamed from: j4.c$a */
    public class C108555a implements Drawable.Callback {
        public C108555a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C108554c.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C108554c.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C108554c.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: j4.c$b */
    public static class C108556b extends Drawable.ConstantState {

        /* renamed from: a */
        public int f324953a;

        /* renamed from: b */
        public C108561g f324954b;

        /* renamed from: c */
        public AnimatorSet f324955c;

        /* renamed from: d */
        public ArrayList<Animator> f324956d;

        /* renamed from: e */
        public C111055b<Animator, String> f324957e;

        public C108556b(Context context, C108556b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f324953a = bVar.f324953a;
                C108561g gVar = bVar.f324954b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f324954b = (C108561g) constantState.newDrawable(resources);
                    } else {
                        this.f324954b = (C108561g) constantState.newDrawable();
                    }
                    C108561g gVar2 = this.f324954b;
                    gVar2.mutate();
                    this.f324954b = gVar2;
                    gVar2.setCallback(callback);
                    this.f324954b.setBounds(bVar.f324954b.getBounds());
                    this.f324954b.f324966i = false;
                }
                ArrayList<Animator> arrayList = bVar.f324956d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f324956d = new ArrayList<>(size);
                    this.f324957e = new C111055b<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f324956d.get(i);
                        Animator clone = animator.clone();
                        String orDefault = bVar.f324957e.getOrDefault(animator, null);
                        clone.setTarget(this.f324954b.f324962e.f325014b.f325012o.getOrDefault(orDefault, null));
                        this.f324956d.add(clone);
                        this.f324957e.put(clone, orDefault);
                    }
                    if (this.f324955c == null) {
                        this.f324955c = new AnimatorSet();
                    }
                    this.f324955c.playTogether(this.f324956d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f324953a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public C108554c() {
        this((Context) null, (C108556b) null, (Resources) null);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f324949e.f324954b.draw(canvas);
        if (this.f324949e.f324955c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getAlpha() : this.f324949e.f324954b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f324949e.f324953a;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f324960d == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C108557c(this.f324960d.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f324949e.f324954b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f324949e.f324954b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.getOpacity() : this.f324949e.f324954b.getOpacity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ IOException | XmlPullParserException -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0083 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r24
            r3 = r25
            android.graphics.drawable.Drawable r4 = r1.f324960d
            if (r4 == 0) goto L_0x0012
            r5 = r23
            r4.inflate(r0, r5, r2, r3)
            return
        L_0x0012:
            r5 = r23
            int r4 = r23.getEventType()
            int r6 = r23.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001e:
            if (r4 == r7) goto L_0x0181
            int r8 = r23.getDepth()
            if (r8 >= r6) goto L_0x0029
            r8 = 3
            if (r4 == r8) goto L_0x0181
        L_0x0029:
            r8 = 2
            if (r4 != r8) goto L_0x017b
            java.lang.String r4 = r23.getName()
            java.lang.String r9 = "animated-vector"
            boolean r9 = r9.equals(r4)
            r10 = 24
            r11 = 0
            r12 = 0
            if (r9 == 0) goto L_0x00a6
            int[] r4 = p906j4.C108552a.f324942e
            android.content.res.TypedArray r4 = p1050v2.C111331h.m151821h(r0, r3, r2, r4)
            int r9 = r4.getResourceId(r11, r11)
            if (r9 == 0) goto L_0x00a1
            android.graphics.PorterDuff$Mode r13 = p906j4.C108561g.f324961p
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L_0x0067
            j4.g r8 = new j4.g
            r8.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r10 = p1050v2.C111325g.f333301a
            android.graphics.drawable.Drawable r9 = r0.getDrawable(r9, r3)
            r8.f324960d = r9
            j4.g$h r9 = new j4.g$h
            android.graphics.drawable.Drawable r10 = r8.f324960d
            android.graphics.drawable.Drawable$ConstantState r10 = r10.getConstantState()
            r9.<init>(r10)
            goto L_0x008d
        L_0x0067:
            android.content.res.XmlResourceParser r9 = r0.getXml(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
        L_0x006f:
            int r13 = r9.next()     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            if (r13 == r8) goto L_0x0078
            if (r13 == r7) goto L_0x0078
            goto L_0x006f
        L_0x0078:
            if (r13 != r8) goto L_0x0083
            j4.g r8 = new j4.g     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            r8.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            r8.inflate(r0, r9, r10, r3)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            goto L_0x008d
        L_0x0083:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            java.lang.String r9 = "No start tag found"
            r8.<init>(r9)     // Catch:{ IOException | XmlPullParserException -> 0x008b }
            throw r8     // Catch:{ IOException | XmlPullParserException -> 0x008b }
        L_0x008b:
            r8 = r12
        L_0x008d:
            r8.f324966i = r11
            android.graphics.drawable.Drawable$Callback r9 = r1.f324951g
            r8.setCallback(r9)
            j4.c$b r9 = r1.f324949e
            j4.g r9 = r9.f324954b
            if (r9 == 0) goto L_0x009d
            r9.setCallback(r12)
        L_0x009d:
            j4.c$b r9 = r1.f324949e
            r9.f324954b = r8
        L_0x00a1:
            r4.recycle()
            goto L_0x017b
        L_0x00a6:
            java.lang.String r8 = "target"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x017b
            int[] r4 = p906j4.C108552a.f324943f
            android.content.res.TypedArray r4 = r0.obtainAttributes(r2, r4)
            java.lang.String r8 = r4.getString(r11)
            int r9 = r4.getResourceId(r7, r11)
            if (r9 == 0) goto L_0x0178
            android.content.Context r13 = r1.f324950f
            if (r13 == 0) goto L_0x016d
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 < r10) goto L_0x00cb
            android.animation.Animator r9 = android.animation.AnimatorInflater.loadAnimator(r13, r9)
            goto L_0x00ec
        L_0x00cb:
            android.content.res.Resources r14 = r13.getResources()
            android.content.res.Resources$Theme r15 = r13.getTheme()
            java.lang.String r10 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r11 = r14.getAnimation(r9)     // Catch:{ XmlPullParserException -> 0x014a, IOException -> 0x012d }
            android.util.AttributeSet r17 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0125, all -> 0x0122 }
            r18 = 0
            r19 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r16 = r11
            android.animation.Animator r9 = p906j4.C108558d.m147147a(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ XmlPullParserException -> 0x0128, IOException -> 0x0125, all -> 0x0122 }
            r11.close()
        L_0x00ec:
            j4.c$b r10 = r1.f324949e
            j4.g r10 = r10.f324954b
            j4.g$g r10 = r10.f324962e
            j4.g$f r10 = r10.f325014b
            u.b<java.lang.String, java.lang.Object> r10 = r10.f325012o
            java.lang.Object r10 = r10.getOrDefault(r8, r12)
            r9.setTarget(r10)
            j4.c$b r10 = r1.f324949e
            java.util.ArrayList<android.animation.Animator> r11 = r10.f324956d
            if (r11 != 0) goto L_0x0113
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f324956d = r11
            j4.c$b r10 = r1.f324949e
            u.b r11 = new u.b
            r11.<init>()
            r10.f324957e = r11
        L_0x0113:
            j4.c$b r10 = r1.f324949e
            java.util.ArrayList<android.animation.Animator> r10 = r10.f324956d
            r10.add(r9)
            j4.c$b r10 = r1.f324949e
            u.b<android.animation.Animator, java.lang.String> r10 = r10.f324957e
            r10.put(r9, r8)
            goto L_0x0178
        L_0x0122:
            r0 = move-exception
            r12 = r11
            goto L_0x0167
        L_0x0125:
            r0 = move-exception
            r12 = r11
            goto L_0x012e
        L_0x0128:
            r0 = move-exception
            r12 = r11
            goto L_0x014b
        L_0x012b:
            r0 = move-exception
            goto L_0x0167
        L_0x012d:
            r0 = move-exception
        L_0x012e:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x012b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012b }
            r3.<init>()     // Catch:{ all -> 0x012b }
            r3.append(r10)     // Catch:{ all -> 0x012b }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x012b }
            r3.append(r4)     // Catch:{ all -> 0x012b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012b }
            r2.<init>(r3)     // Catch:{ all -> 0x012b }
            r2.initCause(r0)     // Catch:{ all -> 0x012b }
            throw r2     // Catch:{ all -> 0x012b }
        L_0x014a:
            r0 = move-exception
        L_0x014b:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x012b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x012b }
            r3.<init>()     // Catch:{ all -> 0x012b }
            r3.append(r10)     // Catch:{ all -> 0x012b }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x012b }
            r3.append(r4)     // Catch:{ all -> 0x012b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x012b }
            r2.<init>(r3)     // Catch:{ all -> 0x012b }
            r2.initCause(r0)     // Catch:{ all -> 0x012b }
            throw r2     // Catch:{ all -> 0x012b }
        L_0x0167:
            if (r12 == 0) goto L_0x016c
            r12.close()
        L_0x016c:
            throw r0
        L_0x016d:
            r4.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0178:
            r4.recycle()
        L_0x017b:
            int r4 = r23.next()
            goto L_0x001e
        L_0x0181:
            j4.c$b r0 = r1.f324949e
            android.animation.AnimatorSet r2 = r0.f324955c
            if (r2 != 0) goto L_0x018e
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f324955c = r2
        L_0x018e:
            android.animation.AnimatorSet r2 = r0.f324955c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f324956d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p906j4.C108554c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.isAutoMirrored() : this.f324949e.f324954b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f324960d;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f324949e.f324955c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.isStateful() : this.f324949e.f324954b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f324949e.f324954b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.setLevel(i) : this.f324949e.f324954b.setLevel(i);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f324960d;
        return drawable != null ? drawable.setState(iArr) : this.f324949e.f324954b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f324949e.f324954b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f324949e.f324954b.setAutoMirrored(z);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f324949e.f324954b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            C112019a.m152746d(drawable, i);
        } else {
            this.f324949e.f324954b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            C112019a.m152747e(drawable, colorStateList);
        } else {
            this.f324949e.f324954b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            C112019a.m152748f(drawable, mode);
        } else {
            this.f324949e.f324954b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f324949e.f324954b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f324949e.f324955c.isStarted()) {
            this.f324949e.f324955c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f324960d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f324949e.f324955c.end();
        }
    }

    public C108554c(Context context, C108556b bVar, Resources resources) {
        C108555a aVar = new C108555a();
        this.f324951g = aVar;
        this.f324950f = context;
        if (bVar != null) {
            this.f324949e = bVar;
        } else {
            this.f324949e = new C108556b(context, bVar, aVar, resources);
        }
    }

    /* renamed from: j4.c$c */
    public static class C108557c extends Drawable.ConstantState {

        /* renamed from: a */
        public final Drawable.ConstantState f324958a;

        public C108557c(Drawable.ConstantState constantState) {
            this.f324958a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f324958a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f324958a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C108554c cVar = new C108554c();
            Drawable newDrawable = this.f324958a.newDrawable();
            cVar.f324960d = newDrawable;
            newDrawable.setCallback(cVar.f324951g);
            return cVar;
        }

        public Drawable newDrawable(Resources resources) {
            C108554c cVar = new C108554c();
            Drawable newDrawable = this.f324958a.newDrawable(resources);
            cVar.f324960d = newDrawable;
            newDrawable.setCallback(cVar.f324951g);
            return cVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C108554c cVar = new C108554c();
            Drawable newDrawable = this.f324958a.newDrawable(resources, theme);
            cVar.f324960d = newDrawable;
            newDrawable.setCallback(cVar.f324951g);
            return cVar;
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
