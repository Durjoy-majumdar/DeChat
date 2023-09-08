package p391w3;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p1042u.C111055b;
import p1057w2.C90885a;

/* renamed from: w3.b */
public final class C22857b {

    /* renamed from: f */
    public static final C22861c f65696f = new C22858a();

    /* renamed from: a */
    public final List<C22862e> f65697a;

    /* renamed from: b */
    public final List<C22864c> f65698b;

    /* renamed from: c */
    public final Map<C22864c, C22862e> f65699c = new C111055b();

    /* renamed from: d */
    public final SparseBooleanArray f65700d = new SparseBooleanArray();

    /* renamed from: e */
    public final C22862e f65701e;

    /* renamed from: w3.b$a */
    public static class C22858a implements C22861c {
        /* renamed from: a */
        public boolean mo36017a(int i, float[] fArr) {
            float f = fArr[2];
            if (f >= 0.95f) {
                return false;
            }
            if (f <= 0.05f) {
                return false;
            }
            float f2 = fArr[0];
            return !((f2 > 10.0f ? 1 : (f2 == 10.0f ? 0 : -1)) >= 0 && (f2 > 37.0f ? 1 : (f2 == 37.0f ? 0 : -1)) <= 0 && (fArr[1] > 0.82f ? 1 : (fArr[1] == 0.82f ? 0 : -1)) <= 0);
        }
    }

    /* renamed from: w3.b$b */
    public static final class C22859b {

        /* renamed from: a */
        public final Bitmap f65702a;

        /* renamed from: b */
        public final List<C22864c> f65703b;

        /* renamed from: c */
        public int f65704c = 16;

        /* renamed from: d */
        public int f65705d = 12544;

        /* renamed from: e */
        public int f65706e = -1;

        /* renamed from: f */
        public final List<C22861c> f65707f;

        /* renamed from: g */
        public Rect f65708g;

        /* renamed from: w3.b$b$a */
        public class C22860a extends AsyncTask<Bitmap, Void, C22857b> {

            /* renamed from: a */
            public final /* synthetic */ C22863d f65709a;

            public C22860a(C22863d dVar) {
                this.f65709a = dVar;
            }

            public Object doInBackground(Object[] objArr) {
                Bitmap[] bitmapArr = (Bitmap[]) objArr;
                try {
                    return C22859b.this.mo36019b();
                } catch (Exception unused) {
                    return null;
                }
            }

            public void onPostExecute(Object obj) {
                this.f65709a.mo36027a((C22857b) obj);
            }
        }

        public C22859b(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f65703b = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f65707f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(C22857b.f65696f);
            this.f65702a = bitmap;
            arrayList.add(C22864c.f65720e);
            arrayList.add(C22864c.f65721f);
            arrayList.add(C22864c.f65722g);
            arrayList.add(C22864c.f65723h);
            arrayList.add(C22864c.f65724i);
            arrayList.add(C22864c.f65725j);
        }

        /* renamed from: a */
        public AsyncTask<Bitmap, Void, C22857b> mo36018a(C22863d dVar) {
            if (dVar != null) {
                return new C22860a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.f65702a});
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        /* JADX WARNING: Removed duplicated region for block: B:108:0x020e A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01ad  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p391w3.C22857b mo36019b() {
            /*
                r20 = this;
                r0 = r20
                android.graphics.Bitmap r1 = r0.f65702a
                if (r1 == 0) goto L_0x0232
                int r2 = r0.f65705d
                r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                if (r2 <= 0) goto L_0x0022
                int r2 = r1.getWidth()
                int r5 = r1.getHeight()
                int r2 = r2 * r5
                int r5 = r0.f65705d
                if (r2 <= r5) goto L_0x0039
                double r3 = (double) r5
                double r5 = (double) r2
                double r3 = r3 / r5
                double r3 = java.lang.Math.sqrt(r3)
                goto L_0x0039
            L_0x0022:
                int r2 = r0.f65706e
                if (r2 <= 0) goto L_0x0039
                int r2 = r1.getWidth()
                int r5 = r1.getHeight()
                int r2 = java.lang.Math.max(r2, r5)
                int r5 = r0.f65706e
                if (r2 <= r5) goto L_0x0039
                double r3 = (double) r5
                double r5 = (double) r2
                double r3 = r3 / r5
            L_0x0039:
                r5 = 0
                r2 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 > 0) goto L_0x0041
                goto L_0x005d
            L_0x0041:
                int r5 = r1.getWidth()
                double r5 = (double) r5
                double r5 = r5 * r3
                double r5 = java.lang.Math.ceil(r5)
                int r5 = (int) r5
                int r6 = r1.getHeight()
                double r6 = (double) r6
                double r6 = r6 * r3
                double r3 = java.lang.Math.ceil(r6)
                int r3 = (int) r3
                android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r5, r3, r2)
            L_0x005d:
                android.graphics.Rect r3 = r0.f65708g
                android.graphics.Bitmap r4 = r0.f65702a
                if (r1 == r4) goto L_0x00b2
                if (r3 == 0) goto L_0x00b2
                int r4 = r1.getWidth()
                double r4 = (double) r4
                android.graphics.Bitmap r6 = r0.f65702a
                int r6 = r6.getWidth()
                double r6 = (double) r6
                double r4 = r4 / r6
                int r6 = r3.left
                double r6 = (double) r6
                double r6 = r6 * r4
                double r6 = java.lang.Math.floor(r6)
                int r6 = (int) r6
                r3.left = r6
                int r6 = r3.top
                double r6 = (double) r6
                double r6 = r6 * r4
                double r6 = java.lang.Math.floor(r6)
                int r6 = (int) r6
                r3.top = r6
                int r6 = r3.right
                double r6 = (double) r6
                double r6 = r6 * r4
                double r6 = java.lang.Math.ceil(r6)
                int r6 = (int) r6
                int r7 = r1.getWidth()
                int r6 = java.lang.Math.min(r6, r7)
                r3.right = r6
                int r6 = r3.bottom
                double r6 = (double) r6
                double r6 = r6 * r4
                double r4 = java.lang.Math.ceil(r6)
                int r4 = (int) r4
                int r5 = r1.getHeight()
                int r4 = java.lang.Math.min(r4, r5)
                r3.bottom = r4
            L_0x00b2:
                w3.a r11 = new w3.a
                int r12 = r1.getWidth()
                int r10 = r1.getHeight()
                int r3 = r12 * r10
                int[] r13 = new int[r3]
                r5 = 0
                r7 = 0
                r8 = 0
                r3 = r1
                r4 = r13
                r6 = r12
                r9 = r12
                r3.getPixels(r4, r5, r6, r7, r8, r9, r10)
                android.graphics.Rect r3 = r0.f65708g
                if (r3 != 0) goto L_0x00cf
                goto L_0x00f3
            L_0x00cf:
                int r3 = r3.width()
                android.graphics.Rect r4 = r0.f65708g
                int r4 = r4.height()
                int r5 = r3 * r4
                int[] r5 = new int[r5]
                r6 = 0
            L_0x00de:
                if (r6 >= r4) goto L_0x00f2
                android.graphics.Rect r7 = r0.f65708g
                int r8 = r7.top
                int r8 = r8 + r6
                int r8 = r8 * r12
                int r7 = r7.left
                int r8 = r8 + r7
                int r7 = r6 * r3
                java.lang.System.arraycopy(r13, r8, r5, r7, r3)
                int r6 = r6 + 1
                goto L_0x00de
            L_0x00f2:
                r13 = r5
            L_0x00f3:
                int r3 = r0.f65704c
                java.util.List<w3.b$c> r4 = r0.f65707f
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                boolean r4 = r4.isEmpty()
                if (r4 == 0) goto L_0x0101
                r4 = 0
                goto L_0x0114
            L_0x0101:
                java.util.List<w3.b$c> r4 = r0.f65707f
                r6 = r4
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                int r6 = r6.size()
                w3.b$c[] r6 = new p391w3.C22857b.C22861c[r6]
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.lang.Object[] r4 = r4.toArray(r6)
                w3.b$c[] r4 = (p391w3.C22857b.C22861c[]) r4
            L_0x0114:
                r11.<init>(r13, r3, r4)
                android.graphics.Bitmap r3 = r0.f65702a
                if (r1 == r3) goto L_0x011e
                r1.recycle()
            L_0x011e:
                java.util.List<w3.b$e> r1 = r11.f65683c
                w3.b r3 = new w3.b
                java.util.List<w3.c> r4 = r0.f65703b
                r3.<init>(r1, r4)
                int r1 = r4.size()
                r4 = 0
            L_0x012c:
                if (r4 >= r1) goto L_0x022c
                java.util.List<w3.c> r6 = r3.f65698b
                java.lang.Object r6 = r6.get(r4)
                w3.c r6 = (p391w3.C22864c) r6
                float[] r7 = r6.f65728c
                int r7 = r7.length
                r8 = 0
                r9 = 0
                r10 = 0
            L_0x013c:
                if (r9 >= r7) goto L_0x014a
                float[] r11 = r6.f65728c
                r11 = r11[r9]
                int r12 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r12 <= 0) goto L_0x0147
                float r10 = r10 + r11
            L_0x0147:
                int r9 = r9 + 1
                goto L_0x013c
            L_0x014a:
                int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r7 == 0) goto L_0x0162
                float[] r7 = r6.f65728c
                int r7 = r7.length
                r9 = 0
            L_0x0152:
                if (r9 >= r7) goto L_0x0162
                float[] r11 = r6.f65728c
                r12 = r11[r9]
                int r13 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                if (r13 <= 0) goto L_0x015f
                float r12 = r12 / r10
                r11[r9] = r12
            L_0x015f:
                int r9 = r9 + 1
                goto L_0x0152
            L_0x0162:
                java.util.Map<w3.c, w3.b$e> r7 = r3.f65699c
                java.util.List<w3.b$e> r9 = r3.f65697a
                int r9 = r9.size()
                r10 = 0
                r11 = 0
                r12 = 0
            L_0x016d:
                r13 = 1
                if (r10 >= r9) goto L_0x0214
                java.util.List<w3.b$e> r14 = r3.f65697a
                java.lang.Object r14 = r14.get(r10)
                w3.b$e r14 = (p391w3.C22857b.C22862e) r14
                float[] r15 = r14.mo36023b()
                r16 = r15[r13]
                float[] r5 = r6.f65726a
                r17 = r5[r2]
                r18 = 2
                int r17 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
                if (r17 < 0) goto L_0x01aa
                r5 = r5[r18]
                int r5 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
                if (r5 > 0) goto L_0x01aa
                r5 = r15[r18]
                float[] r15 = r6.f65727b
                r16 = r15[r2]
                int r16 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
                if (r16 < 0) goto L_0x01aa
                r15 = r15[r18]
                int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
                if (r5 > 0) goto L_0x01aa
                android.util.SparseBooleanArray r5 = r3.f65700d
                int r15 = r14.f65714d
                boolean r5 = r5.get(r15)
                if (r5 != 0) goto L_0x01aa
                r5 = 1
                goto L_0x01ab
            L_0x01aa:
                r5 = 0
            L_0x01ab:
                if (r5 == 0) goto L_0x020e
                float[] r5 = r14.mo36023b()
                w3.b$e r15 = r3.f65701e
                if (r15 == 0) goto L_0x01b8
                int r15 = r15.f65715e
                goto L_0x01b9
            L_0x01b8:
                r15 = 1
            L_0x01b9:
                float[] r13 = r6.f65728c
                r13 = r13[r2]
                r17 = 1065353216(0x3f800000, float:1.0)
                int r19 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r19 <= 0) goto L_0x01d6
                r16 = 1
                r19 = r5[r16]
                float[] r2 = r6.f65726a
                r2 = r2[r16]
                float r19 = r19 - r2
                float r2 = java.lang.Math.abs(r19)
                float r2 = r17 - r2
                float r13 = r13 * r2
                goto L_0x01d9
            L_0x01d6:
                r16 = 1
                r13 = 0
            L_0x01d9:
                float[] r2 = r6.f65728c
                r2 = r2[r16]
                int r19 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r19 <= 0) goto L_0x01f1
                r5 = r5[r18]
                float[] r8 = r6.f65727b
                r8 = r8[r16]
                float r5 = r5 - r8
                float r5 = java.lang.Math.abs(r5)
                float r17 = r17 - r5
                float r2 = r2 * r17
                goto L_0x01f2
            L_0x01f1:
                r2 = 0
            L_0x01f2:
                float[] r5 = r6.f65728c
                r5 = r5[r18]
                r8 = 0
                int r16 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r16 <= 0) goto L_0x0203
                int r8 = r14.f65715e
                float r8 = (float) r8
                float r15 = (float) r15
                float r8 = r8 / r15
                float r5 = r5 * r8
                goto L_0x0204
            L_0x0203:
                r5 = 0
            L_0x0204:
                float r13 = r13 + r2
                float r13 = r13 + r5
                if (r11 == 0) goto L_0x020c
                int r2 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
                if (r2 <= 0) goto L_0x020e
            L_0x020c:
                r12 = r13
                r11 = r14
            L_0x020e:
                int r10 = r10 + 1
                r2 = 0
                r8 = 0
                goto L_0x016d
            L_0x0214:
                if (r11 == 0) goto L_0x0222
                boolean r2 = r6.f65729d
                if (r2 == 0) goto L_0x0222
                android.util.SparseBooleanArray r2 = r3.f65700d
                int r5 = r11.f65714d
                r8 = 1
                r2.append(r5, r8)
            L_0x0222:
                u.i r7 = (p1042u.C111059i) r7
                r7.put(r6, r11)
                int r4 = r4 + 1
                r2 = 0
                goto L_0x012c
            L_0x022c:
                android.util.SparseBooleanArray r1 = r3.f65700d
                r1.clear()
                return r3
            L_0x0232:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p391w3.C22857b.C22859b.mo36019b():w3.b");
        }
    }

    /* renamed from: w3.b$c */
    public interface C22861c {
        /* renamed from: a */
        boolean mo36017a(int i, float[] fArr);
    }

    /* renamed from: w3.b$e */
    public static final class C22862e {

        /* renamed from: a */
        public final int f65711a;

        /* renamed from: b */
        public final int f65712b;

        /* renamed from: c */
        public final int f65713c;

        /* renamed from: d */
        public final int f65714d;

        /* renamed from: e */
        public final int f65715e;

        /* renamed from: f */
        public boolean f65716f;

        /* renamed from: g */
        public int f65717g;

        /* renamed from: h */
        public int f65718h;

        /* renamed from: i */
        public float[] f65719i;

        public C22862e(int i, int i2) {
            this.f65711a = Color.red(i);
            this.f65712b = Color.green(i);
            this.f65713c = Color.blue(i);
            this.f65714d = i;
            this.f65715e = i2;
        }

        /* renamed from: a */
        public final void mo36022a() {
            if (!this.f65716f) {
                int g = C90885a.m114002g(-1, this.f65714d, 4.5f);
                int g2 = C90885a.m114002g(-1, this.f65714d, 3.0f);
                if (g == -1 || g2 == -1) {
                    int g3 = C90885a.m114002g(-16777216, this.f65714d, 4.5f);
                    int g4 = C90885a.m114002g(-16777216, this.f65714d, 3.0f);
                    if (g3 == -1 || g4 == -1) {
                        this.f65718h = g != -1 ? C90885a.m114007l(-1, g) : C90885a.m114007l(-16777216, g3);
                        this.f65717g = g2 != -1 ? C90885a.m114007l(-1, g2) : C90885a.m114007l(-16777216, g4);
                        this.f65716f = true;
                        return;
                    }
                    this.f65718h = C90885a.m114007l(-16777216, g3);
                    this.f65717g = C90885a.m114007l(-16777216, g4);
                    this.f65716f = true;
                    return;
                }
                this.f65718h = C90885a.m114007l(-1, g);
                this.f65717g = C90885a.m114007l(-1, g2);
                this.f65716f = true;
            }
        }

        /* renamed from: b */
        public float[] mo36023b() {
            if (this.f65719i == null) {
                this.f65719i = new float[3];
            }
            C90885a.m113996a(this.f65711a, this.f65712b, this.f65713c, this.f65719i);
            return this.f65719i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C22862e.class != obj.getClass()) {
                return false;
            }
            C22862e eVar = (C22862e) obj;
            return this.f65715e == eVar.f65715e && this.f65714d == eVar.f65714d;
        }

        public int hashCode() {
            return (this.f65714d * 31) + this.f65715e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(C22862e.class.getSimpleName());
            sb.append(" [RGB: #");
            sb.append(Integer.toHexString(this.f65714d));
            sb.append(']');
            sb.append(" [HSL: ");
            sb.append(Arrays.toString(mo36023b()));
            sb.append(']');
            sb.append(" [Population: ");
            sb.append(this.f65715e);
            sb.append(']');
            sb.append(" [Title Text: #");
            mo36022a();
            sb.append(Integer.toHexString(this.f65717g));
            sb.append(']');
            sb.append(" [Body Text: #");
            mo36022a();
            sb.append(Integer.toHexString(this.f65718h));
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: w3.b$d */
    public interface C22863d {
        /* renamed from: a */
        void mo36027a(C22857b bVar);
    }

    public C22857b(List<C22862e> list, List<C22864c> list2) {
        this.f65697a = list;
        this.f65698b = list2;
        int size = list.size();
        int i = Integer.MIN_VALUE;
        C22862e eVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            C22862e eVar2 = this.f65697a.get(i2);
            int i3 = eVar2.f65715e;
            if (i3 > i) {
                eVar = eVar2;
                i = i3;
            }
        }
        this.f65701e = eVar;
    }
}
