package p1121i5;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import gy3.C87412m;
import iy3.C60641c;
import java.util.ArrayList;
import java.util.List;
import my3.C61595o;
import p643p5.C110168e;
import p906j4.C108553b;
import p972h5.C108138d;

/* renamed from: i5.a */
public final class C108370a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: d */
    public final C110168e f324421d;

    /* renamed from: e */
    public final int f324422e;

    /* renamed from: f */
    public final boolean f324423f;

    /* renamed from: g */
    public final boolean f324424g;

    /* renamed from: h */
    public final List<C108553b> f324425h = new ArrayList();

    /* renamed from: i */
    public final int f324426i;

    /* renamed from: j */
    public final int f324427j;

    /* renamed from: n */
    public Drawable f324428n;

    /* renamed from: o */
    public final Drawable f324429o;

    /* renamed from: p */
    public long f324430p;

    /* renamed from: q */
    public int f324431q;

    /* renamed from: r */
    public int f324432r;

    public C108370a(Drawable drawable, Drawable drawable2, C110168e eVar, int i, boolean z, boolean z2) {
        C87412m.m108594g(eVar, "scale");
        this.f324421d = eVar;
        this.f324422e = i;
        this.f324423f = z;
        this.f324424g = z2;
        Drawable drawable3 = null;
        this.f324426i = mo158861a(drawable == null ? null : Integer.valueOf(drawable.getIntrinsicWidth()), drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicWidth()));
        this.f324427j = mo158861a(drawable == null ? null : Integer.valueOf(drawable.getIntrinsicHeight()), drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicHeight()));
        this.f324428n = drawable == null ? null : drawable.mutate();
        drawable3 = drawable2 != null ? drawable2.mutate() : drawable3;
        this.f324429o = drawable3;
        this.f324431q = 255;
        if (i > 0) {
            Drawable drawable4 = this.f324428n;
            if (drawable4 != null) {
                drawable4.setCallback(this);
            }
            if (drawable3 != null) {
                drawable3.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.".toString());
    }

    /* renamed from: a */
    public final int mo158861a(Integer num, Integer num2) {
        int i = -1;
        if (!this.f324424g) {
            if (num != null && num.intValue() == -1) {
                return -1;
            }
            if (num2 != null && num2.intValue() == -1) {
                return -1;
            }
        }
        int intValue = num == null ? -1 : num.intValue();
        if (num2 != null) {
            i = num2.intValue();
        }
        return Math.max(intValue, i);
    }

    /* renamed from: b */
    public final void mo158862b() {
        this.f324432r = 2;
        this.f324428n = null;
        ArrayList arrayList = (ArrayList) this.f324425h;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ((C108553b) arrayList.get(i)).mo159436a(this);
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo158863c(Drawable drawable, Rect rect) {
        C87412m.m108594g(drawable, "drawable");
        C87412m.m108594g(rect, "targetBounds");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double d = C108138d.m146474d(intrinsicWidth, intrinsicHeight, width, height, this.f324421d);
        double d2 = (double) 2;
        int a = C60641c.m70920a((((double) width) - (((double) intrinsicWidth) * d)) / d2);
        int a2 = C60641c.m70920a((((double) height) - (d * ((double) intrinsicHeight))) / d2);
        drawable.setBounds(rect.left + a, rect.top + a2, rect.right - a, rect.bottom - a2);
    }

    public void draw(Canvas canvas) {
        Drawable drawable;
        C87412m.m108594g(canvas, "canvas");
        int i = this.f324432r;
        if (i == 0) {
            Drawable drawable2 = this.f324428n;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f324431q);
                int save = canvas.save();
                try {
                    drawable2.draw(canvas);
                } finally {
                    canvas.restoreToCount(save);
                }
            }
        } else if (i == 2) {
            Drawable drawable3 = this.f324429o;
            if (drawable3 != null) {
                drawable3.setAlpha(this.f324431q);
                int save2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } else {
            double uptimeMillis = ((double) (SystemClock.uptimeMillis() - this.f324430p)) / ((double) this.f324422e);
            double c = C61595o.m72295c(uptimeMillis, 0.0d, 1.0d);
            int i2 = this.f324431q;
            int i3 = (int) (c * ((double) i2));
            if (this.f324423f) {
                i2 -= i3;
            }
            boolean z = uptimeMillis >= 1.0d;
            if (!z && (drawable = this.f324428n) != null) {
                drawable.setAlpha(i2);
                int save3 = canvas.save();
                try {
                    drawable.draw(canvas);
                } finally {
                    canvas.restoreToCount(save3);
                }
            }
            Drawable drawable4 = this.f324429o;
            if (drawable4 != null) {
                drawable4.setAlpha(i3);
                int save4 = canvas.save();
                try {
                    drawable4.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
            if (z) {
                mo158862b();
            } else {
                invalidateSelf();
            }
        }
    }

    public int getAlpha() {
        return this.f324431q;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable;
        int i = this.f324432r;
        if (i == 0) {
            Drawable drawable2 = this.f324428n;
            if (drawable2 == null) {
                return null;
            }
            return drawable2.getColorFilter();
        } else if (i == 1) {
            Drawable drawable3 = this.f324429o;
            ColorFilter colorFilter = drawable3 == null ? null : drawable3.getColorFilter();
            if (colorFilter != null) {
                return colorFilter;
            }
            Drawable drawable4 = this.f324428n;
            if (drawable4 == null) {
                return null;
            }
            return drawable4.getColorFilter();
        } else if (i == 2 && (drawable = this.f324429o) != null) {
            return drawable.getColorFilter();
        } else {
            return null;
        }
    }

    public int getIntrinsicHeight() {
        return this.f324427j;
    }

    public int getIntrinsicWidth() {
        return this.f324426i;
    }

    public int getOpacity() {
        Drawable drawable = this.f324428n;
        Drawable drawable2 = this.f324429o;
        int i = this.f324432r;
        if (i == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        } else if (i == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
        } else if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        } else {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        C87412m.m108594g(drawable, "who");
        invalidateSelf();
    }

    public boolean isRunning() {
        return this.f324432r == 1;
    }

    public void onBoundsChange(Rect rect) {
        C87412m.m108594g(rect, "bounds");
        Drawable drawable = this.f324428n;
        if (drawable != null) {
            mo158863c(drawable, rect);
        }
        Drawable drawable2 = this.f324429o;
        if (drawable2 != null) {
            mo158863c(drawable2, rect);
        }
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.f324428n;
        boolean level = drawable == null ? false : drawable.setLevel(i);
        Drawable drawable2 = this.f324429o;
        return level || (drawable2 == null ? false : drawable2.setLevel(i));
    }

    public boolean onStateChange(int[] iArr) {
        C87412m.m108594g(iArr, "state");
        Drawable drawable = this.f324428n;
        boolean state = drawable == null ? false : drawable.setState(iArr);
        Drawable drawable2 = this.f324429o;
        return state || (drawable2 == null ? false : drawable2.setState(iArr));
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C87412m.m108594g(drawable, "who");
        C87412m.m108594g(runnable, "what");
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        boolean z = false;
        if (i >= 0 && i <= 255) {
            z = true;
        }
        if (z) {
            this.f324431q = i;
            return;
        }
        throw new IllegalArgumentException(C87412m.m108600m("Invalid alpha: ", Integer.valueOf(i)).toString());
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f324428n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f324429o;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f324428n;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f324429o;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    public void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f324428n;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f324429o;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f324428n;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f324429o;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f324428n;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f324429o;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.f324428n
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0.start()
        L_0x0011:
            android.graphics.drawable.Drawable r0 = r4.f324429o
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x001a
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x001a:
            if (r2 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            r2.start()
        L_0x0020:
            int r0 = r4.f324432r
            if (r0 == 0) goto L_0x0025
            return
        L_0x0025:
            r0 = 1
            r4.f324432r = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.f324430p = r0
            java.util.List<j4.b> r0 = r4.f324425h
            r1 = 0
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x004b
        L_0x003b:
            int r3 = r1 + 1
            java.lang.Object r1 = r0.get(r1)
            j4.b r1 = (p906j4.C108553b) r1
            r1.getClass()
            if (r3 <= r2) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r1 = r3
            goto L_0x003b
        L_0x004b:
            r4.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1121i5.C108370a.start():void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stop() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.f324428n
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            r2 = 0
            if (r1 == 0) goto L_0x000a
            android.graphics.drawable.Animatable r0 = (android.graphics.drawable.Animatable) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            if (r0 != 0) goto L_0x000e
            goto L_0x0011
        L_0x000e:
            r0.stop()
        L_0x0011:
            android.graphics.drawable.Drawable r0 = r3.f324429o
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L_0x001a
            r2 = r0
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
        L_0x001a:
            if (r2 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            r2.stop()
        L_0x0020:
            int r0 = r3.f324432r
            r1 = 2
            if (r0 == r1) goto L_0x0028
            r3.mo158862b()
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1121i5.C108370a.stop():void");
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C87412m.m108594g(drawable, "who");
        C87412m.m108594g(runnable, "what");
        unscheduleSelf(runnable);
    }
}
