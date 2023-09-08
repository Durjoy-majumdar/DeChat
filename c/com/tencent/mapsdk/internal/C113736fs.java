package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.lib.models.GeoPoint;
import com.tencent.map.tools.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.fs */
public final class C113736fs {

    /* renamed from: a */
    public static final int f340244a = 0;

    /* renamed from: b */
    public static final int f340245b = 1;

    /* renamed from: c */
    public static final int f340246c = 2;

    /* renamed from: d */
    public static final int f340247d = 3;

    /* renamed from: e */
    public static final int f340248e = 9;

    /* renamed from: f */
    public static final int f340249f = -1;

    /* renamed from: g */
    public static final float f340250g = 200.0f;

    /* renamed from: h */
    public static final float f340251h = 60.0f;

    /* renamed from: i */
    public static final String f340252i = "color_texture_flat_style.png";

    /* renamed from: j */
    public static final String f340253j = "color_point_texture.png";

    /* renamed from: k */
    public static final String f340254k = "color_texture_line_v2.png";

    /* renamed from: A */
    public float f340255A = 1.0f;

    /* renamed from: B */
    public boolean f340256B = true;

    /* renamed from: C */
    public int f340257C = 0;

    /* renamed from: D */
    public boolean f340258D = false;

    /* renamed from: E */
    public boolean f340259E = false;

    /* renamed from: F */
    public Rect f340260F = new Rect();

    /* renamed from: G */
    public int f340261G = 0;

    /* renamed from: H */
    public String f340262H = "";

    /* renamed from: I */
    public float f340263I = -1.0f;

    /* renamed from: J */
    public int f340264J = -1;

    /* renamed from: K */
    public int f340265K = -15248742;

    /* renamed from: L */
    public List<Integer> f340266L = null;

    /* renamed from: M */
    public int f340267M = 2;

    /* renamed from: N */
    public int f340268N = -7829368;

    /* renamed from: O */
    public boolean f340269O;

    /* renamed from: l */
    public ArrayList<GeoPoint> f340270l;

    /* renamed from: m */
    public ArrayList<GeoPoint> f340271m;

    /* renamed from: n */
    public int[] f340272n;

    /* renamed from: o */
    public int[] f340273o;

    /* renamed from: p */
    public String[] f340274p;

    /* renamed from: q */
    public int[] f340275q;

    /* renamed from: r */
    public int[] f340276r;

    /* renamed from: s */
    public int[] f340277s;

    /* renamed from: t */
    public int[] f340278t;

    /* renamed from: u */
    public float f340279u;

    /* renamed from: v */
    public boolean f340280v;

    /* renamed from: w */
    public boolean f340281w;

    /* renamed from: x */
    public float f340282x = 9.0f;

    /* renamed from: y */
    public String f340283y = "";

    /* renamed from: z */
    public boolean f340284z = true;

    /* renamed from: com.tencent.mapsdk.internal.fs$a */
    public static class C28645a {

        /* renamed from: a */
        public static final int f78592a = 0;

        /* renamed from: b */
        public static final int f78593b = 1;

        /* renamed from: c */
        public static final int f78594c = 2;

        /* renamed from: d */
        public static final int f78595d = 3;

        /* renamed from: e */
        public static final int f78596e = 4;

        /* renamed from: f */
        public static final int f78597f = 5;

        /* renamed from: g */
        public static final int f78598g = 6;

        /* renamed from: h */
        public static final int f78599h = 7;

        /* renamed from: i */
        public static final int f78600i = 8;

        /* renamed from: j */
        public static final int f78601j = 9;

        /* renamed from: k */
        public static final int f78602k = 33;

        /* renamed from: l */
        public static final int f78603l = 19;

        /* renamed from: m */
        public static final int f78604m = 20;
    }

    /* renamed from: com.tencent.mapsdk.internal.fs$b */
    public class C113737b {

        /* renamed from: a */
        public int f340285a;

        /* renamed from: b */
        public int f340286b;

        public C113737b(int i, int i2) {
            this.f340286b = i;
            this.f340285a = i2;
        }

        public final boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C113737b bVar = (C113737b) obj;
            return bVar.f340285a == this.f340285a && bVar.f340286b == this.f340286b;
        }
    }

    /* renamed from: b */
    private C113736fs m156864b(String str) {
        this.f340283y = str;
        return this;
    }

    /* renamed from: c */
    private C113736fs m156868c(float f) {
        this.f340282x = f;
        return this;
    }

    /* renamed from: d */
    private C113736fs m156873d(float f) {
        this.f340279u = f;
        return this;
    }

    /* renamed from: e */
    private C113736fs m156880e(boolean z) {
        this.f340259E = z;
        return this;
    }

    /* renamed from: f */
    private int m156881f() {
        return this.f340267M;
    }

    /* renamed from: a */
    public final C113736fs mo172099a(List<GeoPoint> list) {
        if (list == null || list.size() < 2) {
            C113889km.m157544b("参数points不能小于2!");
            return this;
        }
        ArrayList<GeoPoint> arrayList = new ArrayList<>(list.size());
        this.f340271m = arrayList;
        arrayList.addAll(list);
        if (this.f340271m.size() < 2) {
            C113889km.m157544b("参数points存在null值");
            return this;
        }
        ArrayList<GeoPoint> arrayList2 = new ArrayList<>(list.size());
        this.f340270l = arrayList2;
        arrayList2.addAll(this.f340271m);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C113736fs.class == obj.getClass()) {
            C113736fs fsVar = (C113736fs) obj;
            return Float.compare(fsVar.f340279u, this.f340279u) == 0 && this.f340280v == fsVar.f340280v && this.f340281w == fsVar.f340281w && Float.compare(fsVar.f340282x, this.f340282x) == 0 && this.f340284z == fsVar.f340284z && Float.compare(fsVar.f340255A, this.f340255A) == 0 && this.f340256B == fsVar.f340256B && this.f340257C == fsVar.f340257C && this.f340258D == fsVar.f340258D && this.f340259E == fsVar.f340259E && this.f340261G == fsVar.f340261G && Float.compare(fsVar.f340263I, this.f340263I) == 0 && this.f340264J == fsVar.f340264J && this.f340265K == fsVar.f340265K && this.f340267M == fsVar.f340267M && this.f340268N == fsVar.f340268N && this.f340269O == fsVar.f340269O && Util.equals(this.f340270l, fsVar.f340270l) && Util.equals(this.f340271m, fsVar.f340271m) && Arrays.equals(this.f340272n, fsVar.f340272n) && Arrays.equals(this.f340273o, fsVar.f340273o) && Arrays.equals(this.f340274p, fsVar.f340274p) && Arrays.equals(this.f340275q, fsVar.f340275q) && Arrays.equals(this.f340276r, fsVar.f340276r) && Arrays.equals(this.f340277s, fsVar.f340277s) && Arrays.equals(this.f340278t, fsVar.f340278t) && Util.equals(this.f340283y, fsVar.f340283y) && Util.equals(this.f340260F, fsVar.f340260F) && Util.equals(this.f340262H, fsVar.f340262H) && Util.equals(this.f340266L, fsVar.f340266L);
        }
    }

    public final int hashCode() {
        return (((((((((((((Util.hash(this.f340270l, this.f340271m, Float.valueOf(this.f340279u), Boolean.valueOf(this.f340280v), Boolean.valueOf(this.f340281w), Float.valueOf(this.f340282x), this.f340283y, Boolean.valueOf(this.f340284z), Float.valueOf(this.f340255A), Boolean.valueOf(this.f340256B), Integer.valueOf(this.f340257C), Boolean.valueOf(this.f340258D), Boolean.valueOf(this.f340259E), this.f340260F, Integer.valueOf(this.f340261G), this.f340262H, Float.valueOf(this.f340263I), Integer.valueOf(this.f340264J), Integer.valueOf(this.f340265K), this.f340266L, Integer.valueOf(this.f340267M), Integer.valueOf(this.f340268N), Boolean.valueOf(this.f340269O)) * 31) + Arrays.hashCode(this.f340272n)) * 31) + Arrays.hashCode(this.f340273o)) * 31) + Arrays.hashCode(this.f340274p)) * 31) + Arrays.hashCode(this.f340275q)) * 31) + Arrays.hashCode(this.f340276r)) * 31) + Arrays.hashCode(this.f340277s)) * 31) + Arrays.hashCode(this.f340278t);
    }

    @Deprecated
    /* renamed from: b */
    private void m156866b(float f) {
        this.f340255A = f;
    }

    /* renamed from: c */
    private C113736fs m156871c(boolean z) {
        this.f340256B = z;
        return this;
    }

    /* renamed from: d */
    private C113736fs m156874d(boolean z) {
        this.f340258D = z;
        return this;
    }

    /* renamed from: e */
    private C113736fs m156879e(float f) {
        this.f340263I = f;
        return this;
    }

    /* renamed from: c */
    private int m156867c() {
        return this.f340257C;
    }

    /* renamed from: d */
    private C113736fs m156875d(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            C113889km.m157544b("参数endNums不能为空!");
            return this;
        }
        this.f340273o = iArr;
        return this;
    }

    /* renamed from: e */
    private float m156878e() {
        return this.f340263I;
    }

    /* renamed from: b */
    public final C113736fs mo172104b(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            C113889km.m157544b("参数colors不能为空!");
            return this;
        } else if (!this.f340280v) {
            this.f340276r = iArr;
            return this;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(this.f340268N));
            for (int i = 0; i < iArr.length; i++) {
                if (!arrayList.contains(Integer.valueOf(iArr[i]))) {
                    arrayList.add(Integer.valueOf(iArr[i]));
                }
                iArr[i] = arrayList.indexOf(Integer.valueOf(iArr[i]));
            }
            this.f340276r = iArr;
            int size = arrayList.size();
            this.f340277s = new int[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f340277s[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            return this;
        }
    }

    /* renamed from: c */
    private C113736fs m156869c(int i) {
        this.f340261G = i;
        return this;
    }

    /* renamed from: c */
    private C113736fs m156870c(String str) {
        this.f340262H = str;
        return this;
    }

    /* renamed from: c */
    private C113736fs m156872c(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            C113889km.m157544b("参数startNums不能为空!");
            return this;
        }
        this.f340272n = iArr;
        return this;
    }

    /* renamed from: d */
    private int[] m156877d() {
        return new int[]{this.f340264J, this.f340265K};
    }

    /* renamed from: d */
    private void m156876d(int i) {
        this.f340267M = i;
    }

    /* renamed from: a */
    public final C113736fs mo172100a(int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            C113889km.m157544b("参数startIndexes不能为空!");
            return this;
        }
        this.f340275q = iArr;
        return this;
    }

    /* renamed from: a */
    private C113736fs m156857a(int i) {
        this.f340268N = i;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    private void m156860a(String str) {
        this.f340283y = str;
    }

    @Deprecated
    /* renamed from: a */
    private void m156861a(boolean z) {
        this.f340284z = z;
    }

    /* renamed from: a */
    private C113736fs m156856a(float f) {
        this.f340255A = f;
        return this;
    }

    /* renamed from: a */
    public final C113736fs mo172101a(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length <= 0 || iArr2 == null || iArr2.length <= 0) {
            C113889km.m157544b("参数colors 、borderColors为空，或者两者长度不同");
            return this;
        } else if (!this.f340280v) {
            this.f340276r = iArr;
            return this;
        } else {
            if (iArr2.length < iArr.length) {
                int[] iArr3 = new int[iArr.length];
                for (int i = 0; i < iArr.length; i++) {
                    if (i < iArr2.length) {
                        iArr3[i] = iArr2[i];
                    } else {
                        iArr3[i] = iArr2[iArr2.length - 1];
                    }
                }
                iArr2 = iArr3;
            }
            ArrayList arrayList = new ArrayList();
            int i2 = this.f340268N;
            arrayList.add(new C113737b(i2, i2));
            this.f340276r = new int[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                C113737b bVar = new C113737b(iArr[i3], iArr2[i3]);
                if (!arrayList.contains(bVar)) {
                    arrayList.add(bVar);
                }
                this.f340276r[i3] = arrayList.indexOf(bVar);
            }
            int size = arrayList.size();
            this.f340277s = new int[size];
            this.f340278t = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                this.f340277s[i4] = ((C113737b) arrayList.get(i4)).f340286b;
                this.f340278t[i4] = ((C113737b) arrayList.get(i4)).f340285a;
            }
            return this;
        }
    }

    /* renamed from: b */
    private C113736fs m156862b() {
        this.f340280v = true;
        return this;
    }

    /* renamed from: b */
    private C113736fs m156865b(boolean z) {
        this.f340281w = z;
        return this;
    }

    /* renamed from: b */
    private C113736fs m156863b(int i) {
        this.f340257C = i;
        return this;
    }

    /* renamed from: b */
    public final C113736fs mo172103b(List<Integer> list) {
        if (!(list == null || list.size() % 2 == 0)) {
            list.add(list.get(list.size() - 1));
        }
        this.f340266L = list;
        return this;
    }

    /* renamed from: a */
    private C113736fs m156859a(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            C113889km.m157544b("参数roadNames不能为空!");
            return this;
        }
        this.f340274p = strArr;
        return this;
    }

    /* renamed from: a */
    private C113736fs m156858a(int i, int i2) {
        this.f340264J = i;
        this.f340265K = i2;
        return this;
    }

    /* renamed from: a */
    public final boolean mo172102a() {
        ArrayList<GeoPoint> arrayList = this.f340271m;
        if (arrayList == null || arrayList.size() < 2) {
            C113889km.m157544b("LineOptions中点的个数不能小于2");
            return false;
        }
        int[] iArr = this.f340275q;
        if (iArr == null || iArr.length <= 0) {
            C113889km.m157544b("参数startIndexes不能为空!");
            return false;
        }
        int[] iArr2 = this.f340276r;
        if (iArr2 != null && iArr2.length > 0) {
            return true;
        }
        C113889km.m157544b("参数colors不能为空!");
        return false;
    }
}
