package p905j3;

import android.graphics.Rect;
import java.util.Comparator;
import p1108f3.C107453d;
import p905j3.C108539a;

/* renamed from: j3.b */
public class C108543b {

    /* renamed from: j3.b$a */
    public interface C108544a<T> {
    }

    /* renamed from: j3.b$b */
    public interface C108545b<T, V> {
    }

    /* renamed from: j3.b$c */
    public static class C108546c<T> implements Comparator<T> {

        /* renamed from: d */
        public final Rect f324906d = new Rect();

        /* renamed from: e */
        public final Rect f324907e = new Rect();

        /* renamed from: f */
        public final boolean f324908f;

        /* renamed from: g */
        public final C108544a<T> f324909g;

        public C108546c(boolean z, C108544a<T> aVar) {
            this.f324908f = z;
            this.f324909g = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f324906d;
            Rect rect2 = this.f324907e;
            ((C108539a.C108540a) this.f324909g).getClass();
            ((C107453d) t).mo157842d(rect);
            ((C108539a.C108540a) this.f324909g).getClass();
            ((C107453d) t2).mo157842d(rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f324908f ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f324908f ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f324908f ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f324908f ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r10.right <= r12.left) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        if (r10.top >= r12.bottom) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r10.left >= r12.right) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m147106a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = m147107b(r9, r10, r11)
            boolean r1 = m147107b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x007e
            if (r0 != 0) goto L_0x000f
            goto L_0x007e
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x0040
            if (r9 == r3) goto L_0x0039
            if (r9 == r4) goto L_0x0032
            if (r9 != r1) goto L_0x002c
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x002a
        L_0x0028:
            r7 = 1
            goto L_0x0047
        L_0x002a:
            r7 = 0
            goto L_0x0047
        L_0x002c:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0032:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x002a
            goto L_0x0028
        L_0x0039:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x002a
            goto L_0x0028
        L_0x0040:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x002a
            goto L_0x0028
        L_0x0047:
            if (r7 != 0) goto L_0x004a
            return r6
        L_0x004a:
            if (r9 == r5) goto L_0x007d
            if (r9 != r4) goto L_0x004f
            goto L_0x007d
        L_0x004f:
            int r11 = m147109d(r9, r10, r11)
            if (r9 == r5) goto L_0x0070
            if (r9 == r3) goto L_0x006b
            if (r9 == r4) goto L_0x0066
            if (r9 != r1) goto L_0x0060
            int r9 = r12.bottom
            int r10 = r10.bottom
            goto L_0x0074
        L_0x0060:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0066:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0074
        L_0x006b:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0074
        L_0x0070:
            int r9 = r10.left
            int r10 = r12.left
        L_0x0074:
            int r9 = r9 - r10
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x007c
            r2 = 1
        L_0x007c:
            return r2
        L_0x007d:
            return r6
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p905j3.C108543b.m147106a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* renamed from: b */
    public static boolean m147107b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static boolean m147108c(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: d */
    public static int m147109d(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i2);
    }

    /* renamed from: e */
    public static int m147110e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
