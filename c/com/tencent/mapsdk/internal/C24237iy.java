package com.tencent.mapsdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.mapsdk.internal.C24212ij;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.tencent.mapsdk.internal.iy */
public class C24237iy extends C24212ij {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static long f69373G = f69374b;

    /* renamed from: b */
    private static final long f69374b = 10;

    /* renamed from: c */
    public static final int f69375c = 0;

    /* renamed from: d */
    public static final int f69376d = 1;

    /* renamed from: e */
    public static final int f69377e = 0;

    /* renamed from: f */
    public static final int f69378f = 1;

    /* renamed from: g */
    public static final int f69379g = 2;

    /* renamed from: n */
    public static final int f69380n = 1;

    /* renamed from: o */
    public static final int f69381o = 2;

    /* renamed from: p */
    public static final int f69382p = -1;

    /* renamed from: q */
    private static ThreadLocal<C24238a> f69383q = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final ThreadLocal<ArrayList<C24237iy>> f69384r = new ThreadLocal<ArrayList<C24237iy>>() {
        /* renamed from: a */
        private static ArrayList<C24237iy> m30336a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object initialValue() {
            return new ArrayList();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final ThreadLocal<ArrayList<C24237iy>> f69385s = new ThreadLocal<ArrayList<C24237iy>>() {
        /* renamed from: a */
        private static ArrayList<C24237iy> m30337a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object initialValue() {
            return new ArrayList();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final ThreadLocal<ArrayList<C24237iy>> f69386t = new ThreadLocal<ArrayList<C24237iy>>() {
        /* renamed from: a */
        private static ArrayList<C24237iy> m30338a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object initialValue() {
            return new ArrayList();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final ThreadLocal<ArrayList<C24237iy>> f69387u = new ThreadLocal<ArrayList<C24237iy>>() {
        /* renamed from: a */
        private static ArrayList<C24237iy> m30339a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object initialValue() {
            return new ArrayList();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final ThreadLocal<ArrayList<C24237iy>> f69388v = new ThreadLocal<ArrayList<C24237iy>>() {
        /* renamed from: a */
        private static ArrayList<C24237iy> m30340a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object initialValue() {
            return new ArrayList();
        }
    };

    /* renamed from: w */
    private static final Interpolator f69389w = new LinearInterpolator();

    /* renamed from: A */
    private boolean f69390A = false;

    /* renamed from: B */
    private long f69391B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f69392C = false;

    /* renamed from: D */
    private boolean f69393D = false;

    /* renamed from: E */
    private long f69394E = 300;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public long f69395F = 0;

    /* renamed from: H */
    private int f69396H = 0;

    /* renamed from: I */
    private int f69397I = 1;

    /* renamed from: J */
    private Interpolator f69398J = f69389w;

    /* renamed from: K */
    private ArrayList<C24244b> f69399K = null;

    /* renamed from: h */
    public long f69400h;

    /* renamed from: i */
    public long f69401i = -1;

    /* renamed from: j */
    public int f69402j = 0;

    /* renamed from: k */
    public C24230iu[] f69403k;

    /* renamed from: l */
    public HashMap<Integer, C24230iu> f69404l;

    /* renamed from: m */
    public C24211ig f69405m;

    /* renamed from: x */
    private boolean f69406x = false;

    /* renamed from: y */
    private int f69407y = 0;

    /* renamed from: z */
    private float f69408z = 0.0f;

    /* renamed from: com.tencent.mapsdk.internal.iy$a */
    public static class C24238a extends Handler {
        public C24238a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z;
            ArrayList arrayList = (ArrayList) C24237iy.f69384r.get();
            ArrayList arrayList2 = (ArrayList) C24237iy.f69386t.get();
            int i = message.what;
            if (i == 0) {
                ArrayList arrayList3 = (ArrayList) C24237iy.f69385s.get();
                z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C24237iy iyVar = (C24237iy) arrayList4.get(i2);
                        if (iyVar.f69395F == 0) {
                            iyVar.m30316y();
                        } else {
                            arrayList2.add(iyVar);
                        }
                    }
                }
            } else if (i == 1) {
                z = true;
            } else {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList5 = (ArrayList) C24237iy.f69388v.get();
            ArrayList arrayList6 = (ArrayList) C24237iy.f69387u.get();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                C24237iy iyVar2 = (C24237iy) arrayList2.get(i3);
                if (C24237iy.m30289a(iyVar2, uptimeMillis)) {
                    arrayList5.add(iyVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i4 = 0; i4 < size3; i4++) {
                    C24237iy iyVar3 = (C24237iy) arrayList5.get(i4);
                    iyVar3.m30316y();
                    boolean unused = iyVar3.f69392C = true;
                    arrayList2.remove(iyVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                C24237iy iyVar4 = (C24237iy) arrayList.get(i5);
                if (iyVar4.mo41011c(uptimeMillis)) {
                    arrayList6.add(iyVar4);
                }
                if (arrayList.size() == size4) {
                    i5++;
                } else {
                    size4--;
                    arrayList6.remove(iyVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                    ((C24237iy) arrayList6.get(i6)).m30315x();
                }
                arrayList6.clear();
            }
            if (!z) {
                return;
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                sendEmptyMessageDelayed(1, Math.max(0, C24237iy.f69373G - (SystemClock.uptimeMillis() - uptimeMillis)));
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.iy$b */
    public interface C24244b {
        /* renamed from: a */
        void mo41022a();
    }

    public C24237iy(C24211ig igVar) {
        this.f69405m = igVar;
    }

    /* renamed from: A */
    private static int m30279A() {
        return f69384r.get().size();
    }

    /* renamed from: B */
    private static void m30280B() {
        f69384r.get().clear();
        f69385s.get().clear();
        f69386t.get().clear();
    }

    /* renamed from: C */
    private static void m30281C() {
    }

    /* renamed from: o */
    private C24230iu[] m30306o() {
        return this.f69403k;
    }

    /* renamed from: p */
    private long m30307p() {
        if (this.f69402j == 0) {
            return 0;
        }
        return SystemClock.uptimeMillis() - this.f69400h;
    }

    /* renamed from: q */
    private static long m30308q() {
        return f69373G;
    }

    /* renamed from: r */
    private Object m30309r() {
        C24230iu[] iuVarArr = this.f69403k;
        if (iuVarArr == null || iuVarArr.length <= 0) {
            return null;
        }
        return iuVarArr[0].mo41007b();
    }

    /* renamed from: s */
    private int m30310s() {
        return this.f69396H;
    }

    /* renamed from: t */
    private int m30311t() {
        return this.f69397I;
    }

    /* renamed from: u */
    private void m30312u() {
        ArrayList<C24244b> arrayList = this.f69399K;
        if (arrayList != null) {
            arrayList.clear();
            this.f69399K = null;
        }
    }

    /* renamed from: v */
    private Interpolator m30313v() {
        return this.f69398J;
    }

    /* renamed from: w */
    private void m30314w() {
        this.f69406x = !this.f69406x;
        if (this.f69402j == 1) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f69400h = uptimeMillis - (this.f69394E - (uptimeMillis - this.f69400h));
            return;
        }
        m30288a(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m30315x() {
        ArrayList<C24212ij.C24213a> arrayList;
        f69384r.get().remove(this);
        f69385s.get().remove(this);
        f69386t.get().remove(this);
        this.f69402j = 0;
        if (this.f69392C && (arrayList = this.f69306a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((C24212ij.C24213a) arrayList2.get(i)).mo40980b(this);
            }
        }
        this.f69392C = false;
        this.f69393D = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m30316y() {
        ArrayList<C24212ij.C24213a> arrayList;
        f69384r.get().add(this);
        if (this.f69395F > 0 && (arrayList = this.f69306a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((C24212ij.C24213a) arrayList2.get(i)).mo40978a(this);
            }
        }
    }

    /* renamed from: z */
    private float m30317z() {
        return this.f69408z;
    }

    /* renamed from: e */
    public final long mo40973e() {
        return this.f69394E;
    }

    /* renamed from: f */
    public final boolean mo40974f() {
        return this.f69402j == 1 || this.f69392C;
    }

    /* renamed from: g */
    public final boolean mo40975g() {
        return this.f69393D;
    }

    /* renamed from: h */
    public C24212ij clone() {
        C24237iy iyVar = (C24237iy) super.clone();
        ArrayList<C24244b> arrayList = this.f69399K;
        if (arrayList != null) {
            iyVar.f69399K = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                iyVar.f69399K.add(arrayList.get(i));
            }
        }
        iyVar.f69401i = -1;
        iyVar.f69406x = false;
        iyVar.f69407y = 0;
        iyVar.f69402j = 0;
        iyVar.f69390A = false;
        C24230iu[] iuVarArr = this.f69403k;
        if (iuVarArr != null) {
            int length = iuVarArr.length;
            iyVar.f69403k = new C24230iu[length];
            iyVar.f69404l = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                C24230iu a = iuVarArr[i2].clone();
                iyVar.f69403k[i2] = a;
                iyVar.f69404l.put(Integer.valueOf(a.f69362a), a);
            }
        }
        return iyVar;
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f69403k != null) {
            for (int i = 0; i < this.f69403k.length; i++) {
                str = str + "\n    " + this.f69403k[i].toString();
            }
        }
        return str;
    }

    /* renamed from: a */
    private static C24237iy m30284a(C24211ig igVar, int... iArr) {
        C24237iy iyVar = new C24237iy(igVar);
        iyVar.mo40997a(iArr);
        return iyVar;
    }

    /* renamed from: b */
    public static C24237iy m30290b(double... dArr) {
        C24237iy iyVar = new C24237iy((C24211ig) null);
        iyVar.mo40996a(dArr);
        return iyVar;
    }

    /* renamed from: c */
    private void m30294c(int i) {
        this.f69397I = i;
    }

    /* renamed from: e */
    private void m30298e(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f69402j != 1) {
            this.f69401i = j;
            this.f69402j = 2;
        }
        this.f69400h = uptimeMillis - j;
        mo41011c(uptimeMillis);
    }

    /* renamed from: f */
    private boolean m30299f(long j) {
        if (!this.f69390A) {
            this.f69390A = true;
            this.f69391B = j;
            return false;
        }
        long j2 = j - this.f69391B;
        long j3 = this.f69395F;
        if (j2 <= j3) {
            return false;
        }
        this.f69400h = j - (j2 - j3);
        this.f69402j = 1;
        return true;
    }

    /* renamed from: d */
    public final long mo40972d() {
        return this.f69395F;
    }

    /* renamed from: d */
    public static void m30296d(long j) {
        f69373G = j;
    }

    /* renamed from: c */
    public final void mo40970c() {
        if (!f69384r.get().contains(this) && !f69385s.get().contains(this)) {
            this.f69390A = false;
            m30316y();
        }
        int i = this.f69396H;
        if (i <= 0 || (i & 1) != 1) {
            mo41010a(1.0f);
        } else {
            mo41010a(0.0f);
        }
        m30315x();
    }

    /* renamed from: a */
    private static C24237iy m30285a(C24211ig igVar, C24230iu... iuVarArr) {
        C24237iy iyVar = new C24237iy(igVar);
        iyVar.mo41015a(iuVarArr);
        return iyVar;
    }

    /* renamed from: b */
    public C24212ij mo40967b(long j) {
        if (j >= 0) {
            this.f69394E = j;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: ".concat(String.valueOf(j)));
    }

    /* renamed from: a */
    private static C24237iy m30283a(C24211ig igVar, C24236ix<?> ixVar, Object[] objArr) {
        C24237iy iyVar = new C24237iy(igVar);
        iyVar.mo40998a(objArr);
        iyVar.mo41014a(ixVar);
        return iyVar;
    }

    /* renamed from: b */
    private void m30291b(int i) {
        this.f69396H = i;
    }

    /* renamed from: b */
    private void m30292b(C24244b bVar) {
        ArrayList<C24244b> arrayList = this.f69399K;
        if (arrayList != null) {
            arrayList.remove(bVar);
            if (this.f69399K.size() == 0) {
                this.f69399K = null;
            }
        }
    }

    /* renamed from: a */
    public void mo40997a(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            C24230iu[] iuVarArr = this.f69403k;
            if (iuVarArr == null || iuVarArr.length == 0) {
                mo41015a(C24230iu.m30247a(0, iArr));
                return;
            }
            iuVarArr[0].mo41005a(iArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo41011c(long r10) {
        /*
            r9 = this;
            int r0 = r9.f69402j
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L_0x001a
            r9.f69402j = r3
            long r4 = r9.f69401i
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0012
            r9.f69400h = r10
            goto L_0x001a
        L_0x0012:
            long r4 = r10 - r4
            r9.f69400h = r4
            r4 = -1
            r9.f69401i = r4
        L_0x001a:
            int r0 = r9.f69402j
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L_0x0023
            if (r0 == r4) goto L_0x0023
            goto L_0x007c
        L_0x0023:
            long r6 = r9.f69394E
            r0 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x0032
            long r1 = r9.f69400h
            long r10 = r10 - r1
            float r10 = (float) r10
            float r11 = (float) r6
            float r10 = r10 / r11
            goto L_0x0034
        L_0x0032:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x0034:
            int r11 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0071
            int r11 = r9.f69407y
            int r1 = r9.f69396H
            if (r11 < r1) goto L_0x0047
            r11 = -1
            if (r1 != r11) goto L_0x0042
            goto L_0x0047
        L_0x0042:
            float r10 = java.lang.Math.min(r10, r0)
            goto L_0x0072
        L_0x0047:
            java.util.ArrayList<com.tencent.mapsdk.internal.ij$a> r11 = r9.f69306a
            if (r11 == 0) goto L_0x005a
            int r11 = r11.size()
            r1 = 0
        L_0x0050:
            if (r1 >= r11) goto L_0x005a
            java.util.ArrayList<com.tencent.mapsdk.internal.ij$a> r2 = r9.f69306a
            r2.get(r1)
            int r1 = r1 + 1
            goto L_0x0050
        L_0x005a:
            int r11 = r9.f69397I
            if (r11 != r4) goto L_0x0063
            boolean r11 = r9.f69406x
            r11 = r11 ^ r3
            r9.f69406x = r11
        L_0x0063:
            int r11 = r9.f69407y
            int r1 = (int) r10
            int r11 = r11 + r1
            r9.f69407y = r11
            float r10 = r10 % r0
            long r1 = r9.f69400h
            long r3 = r9.f69394E
            long r1 = r1 + r3
            r9.f69400h = r1
        L_0x0071:
            r3 = 0
        L_0x0072:
            boolean r11 = r9.f69406x
            if (r11 == 0) goto L_0x0078
            float r10 = r0 - r10
        L_0x0078:
            r9.mo41010a((float) r10)
            r5 = r3
        L_0x007c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C24237iy.mo41011c(long):boolean");
    }

    /* renamed from: b */
    public final void mo40968b() {
        ArrayList<C24212ij.C24213a> arrayList;
        if (this.f69402j != 0 || f69385s.get().contains(this) || f69386t.get().contains(this)) {
            if (this.f69392C && (arrayList = this.f69306a) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((C24212ij.C24213a) it.next()).mo40977a();
                }
            }
            m30315x();
        }
    }

    /* renamed from: a */
    public void mo40996a(double... dArr) {
        if (dArr != null && dArr.length != 0) {
            C24230iu[] iuVarArr = this.f69403k;
            if (iuVarArr == null || iuVarArr.length == 0) {
                mo41015a(C24230iu.m30246a(0, dArr));
                return;
            }
            iuVarArr[0].mo41004a(dArr);
        }
    }

    /* renamed from: a */
    public void mo40998a(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            C24230iu[] iuVarArr = this.f69403k;
            if (iuVarArr == null || iuVarArr.length == 0) {
                mo41015a(C24230iu.m30249a(0, objArr));
                return;
            }
            iuVarArr[0].mo41006a(objArr);
        }
    }

    /* renamed from: a */
    public final void mo41015a(C24230iu... iuVarArr) {
        this.f69403k = iuVarArr;
        this.f69404l = new HashMap<>(r0);
        for (C24230iu iuVar : iuVarArr) {
            this.f69404l.put(Integer.valueOf(iuVar.f69362a), iuVar);
        }
    }

    /* renamed from: a */
    public final void mo40964a(long j) {
        this.f69395F = j;
    }

    /* renamed from: a */
    private Object m30286a(int i) {
        C24230iu iuVar = this.f69404l.get(Integer.valueOf(i));
        if (iuVar != null) {
            return iuVar.mo41007b();
        }
        return null;
    }

    /* renamed from: a */
    private void m30287a(C24244b bVar) {
        if (this.f69399K == null) {
            this.f69399K = new ArrayList<>();
        }
        this.f69399K.add(bVar);
    }

    /* renamed from: a */
    public final void mo40965a(Interpolator interpolator) {
        if (interpolator != null) {
            this.f69398J = interpolator;
        } else {
            this.f69398J = new LinearInterpolator();
        }
    }

    /* renamed from: a */
    public final void mo41014a(C24236ix<?> ixVar) {
        C24230iu[] iuVarArr;
        if (ixVar != null && (iuVarArr = this.f69403k) != null && iuVarArr.length > 0) {
            iuVarArr[0].mo41003a((C24236ix) ixVar);
        }
    }

    /* renamed from: a */
    private void m30288a(boolean z) {
        this.f69406x = z;
        this.f69407y = 0;
        this.f69402j = 0;
        this.f69393D = true;
        this.f69390A = false;
        f69385s.get().add(this);
        long j = 0;
        if (this.f69395F == 0) {
            if (this.f69402j != 0) {
                j = SystemClock.uptimeMillis() - this.f69400h;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.f69402j != 1) {
                this.f69401i = j;
                this.f69402j = 2;
            }
            this.f69400h = uptimeMillis - j;
            mo41011c(uptimeMillis);
            this.f69402j = 0;
            this.f69392C = true;
            ArrayList<C24212ij.C24213a> arrayList = this.f69306a;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C24212ij.C24213a) arrayList2.get(i)).mo40978a(this);
                }
            }
        }
        C24238a aVar = f69383q.get();
        if (aVar == null) {
            aVar = new C24238a(Looper.getMainLooper());
            f69383q.set(aVar);
        } else {
            aVar.removeMessages(0);
            aVar.removeMessages(1);
        }
        aVar.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public final void mo40963a() {
        m30288a(false);
    }

    /* renamed from: a */
    public void mo41010a(float f) {
        float interpolation = this.f69398J.getInterpolation(f);
        this.f69408z = interpolation;
        int length = this.f69403k.length;
        for (int i = 0; i < length; i++) {
            this.f69403k[i].mo41001a(interpolation);
            C24211ig igVar = this.f69405m;
            if (igVar != null) {
                C24230iu iuVar = this.f69403k[i];
                igVar.mo40962a(iuVar.f69362a, iuVar.mo41007b());
            }
        }
        ArrayList<C24244b> arrayList = this.f69399K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f69399K.get(i2);
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m30289a(C24237iy iyVar, long j) {
        if (!iyVar.f69390A) {
            iyVar.f69390A = true;
            iyVar.f69391B = j;
            return false;
        }
        long j2 = j - iyVar.f69391B;
        long j3 = iyVar.f69395F;
        if (j2 <= j3) {
            return false;
        }
        iyVar.f69400h = j - (j2 - j3);
        iyVar.f69402j = 1;
        return true;
    }
}
