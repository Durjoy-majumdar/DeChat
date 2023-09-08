package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;
import qp3.C118204f;
import qp3.C118207h;

/* renamed from: com.tencent.mm.vfs.StatisticsFileSystem */
public class StatisticsFileSystem extends AbstractFileSystem {
    public static final Parcelable.Creator<StatisticsFileSystem> CREATOR = new C116251a();

    /* renamed from: e */
    public final FileSystem f348840e;

    /* renamed from: f */
    public final C116330v[] f348841f;

    /* renamed from: g */
    public final C116330v[] f348842g;

    /* renamed from: h */
    public final boolean f348843h;

    /* renamed from: com.tencent.mm.vfs.StatisticsFileSystem$a */
    public class C116251a implements Parcelable.Creator<StatisticsFileSystem> {
        public Object createFromParcel(Parcel parcel) {
            return new StatisticsFileSystem(parcel);
        }

        public Object[] newArray(int i) {
            return new StatisticsFileSystem[i];
        }
    }

    /* renamed from: com.tencent.mm.vfs.StatisticsFileSystem$b */
    public class C116252b extends C116309m {

        /* renamed from: e */
        public final FileSystem.C85995c f348844e;

        /* renamed from: f */
        public final List<FileSystem.C85995c> f348845f;

        /* renamed from: g */
        public final String[] f348846g;

        /* renamed from: h */
        public final String[] f348847h;

        /* renamed from: i */
        public long f348848i = Long.MIN_VALUE;

        /* renamed from: j */
        public TreeMap<String, C116254c[]> f348849j;

        /* renamed from: n */
        public C116254c[] f348850n;

        /* renamed from: o */
        public byte[] f348851o;

        /* renamed from: p */
        public C116254c[] f348852p;

        /* renamed from: q */
        public byte[] f348853q;

        /* renamed from: r */
        public int f348854r;

        /* renamed from: com.tencent.mm.vfs.StatisticsFileSystem$b$a */
        public class C116253a implements C118204f.C118205a<C86001b0, C86001b0>, C118207h.C118208a {

            /* renamed from: d */
            public final C116254c[] f348856d;

            /* renamed from: e */
            public final C116254c f348857e;

            /* renamed from: f */
            public final String[] f348858f;

            static {
                Class<StatisticsFileSystem> cls = StatisticsFileSystem.class;
            }

            public C116253a(C116254c[] cVarArr, C116254c cVar) {
                this.f348856d = cVarArr;
                this.f348857e = cVar;
                this.f348858f = C116252b.this.f348847h;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
                if (r3.charAt(r0.length()) == '/') goto L_0x0035;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
                if (r0 == false) goto L_0x003c;
             */
            /* renamed from: f */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object mo105957f(java.lang.Object r10) {
                /*
                    r9 = this;
                    com.tencent.mm.vfs.b0 r10 = (com.tencent.p014mm.vfs.C86001b0) r10
                    java.lang.String[] r0 = r9.f348858f
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L_0x003c
                    java.lang.String r3 = r10.f250471a
                    int r4 = java.util.Arrays.binarySearch(r0, r3)
                    if (r4 < 0) goto L_0x0011
                    goto L_0x0035
                L_0x0011:
                    int r4 = -r4
                    int r4 = r4 + -2
                    if (r4 >= 0) goto L_0x0017
                    goto L_0x0037
                L_0x0017:
                    r0 = r0[r4]
                    boolean r4 = r3.startsWith(r0)
                    if (r4 == 0) goto L_0x0037
                    int r4 = r3.length()
                    int r5 = r0.length()
                    if (r4 == r5) goto L_0x0035
                    int r0 = r0.length()
                    char r0 = r3.charAt(r0)
                    r3 = 47
                    if (r0 != r3) goto L_0x0037
                L_0x0035:
                    r0 = 1
                    goto L_0x0038
                L_0x0037:
                    r0 = 0
                L_0x0038:
                    if (r0 == 0) goto L_0x003c
                    goto L_0x00ee
                L_0x003c:
                    boolean r0 = r10.f250476f
                    if (r0 == 0) goto L_0x006e
                    com.tencent.mm.vfs.StatisticsFileSystem$c[] r0 = r9.f348856d
                    if (r0 == 0) goto L_0x006e
                    com.tencent.mm.vfs.StatisticsFileSystem$b r0 = com.tencent.p014mm.vfs.StatisticsFileSystem.C116252b.this
                    java.util.TreeMap<java.lang.String, com.tencent.mm.vfs.StatisticsFileSystem$c[]> r0 = r0.f348849j
                    java.lang.String r3 = r10.f250471a
                    java.lang.Object r0 = r0.get(r3)
                    com.tencent.mm.vfs.StatisticsFileSystem$c[] r0 = (com.tencent.p014mm.vfs.StatisticsFileSystem.C116254c[]) r0
                    if (r0 == 0) goto L_0x0063
                    int r3 = r0.length
                    com.tencent.mm.vfs.StatisticsFileSystem$c[] r4 = r9.f348856d
                    int r4 = r4.length
                    int r5 = r3 + r4
                    com.tencent.mm.vfs.StatisticsFileSystem$c[] r5 = new com.tencent.p014mm.vfs.StatisticsFileSystem.C116254c[r5]
                    java.lang.System.arraycopy(r0, r2, r5, r2, r3)
                    com.tencent.mm.vfs.StatisticsFileSystem$c[] r0 = r9.f348856d
                    java.lang.System.arraycopy(r0, r2, r5, r3, r4)
                    goto L_0x0065
                L_0x0063:
                    com.tencent.mm.vfs.StatisticsFileSystem$c[] r5 = r9.f348856d
                L_0x0065:
                    com.tencent.mm.vfs.StatisticsFileSystem$b r0 = com.tencent.p014mm.vfs.StatisticsFileSystem.C116252b.this
                    java.util.TreeMap<java.lang.String, com.tencent.mm.vfs.StatisticsFileSystem$c[]> r0 = r0.f348849j
                    java.lang.String r3 = r10.f250471a
                    r0.put(r3, r5)
                L_0x006e:
                    com.tencent.mm.vfs.StatisticsFileSystem$c r0 = r9.f348857e
                    if (r0 != 0) goto L_0x0079
                    com.tencent.mm.vfs.StatisticsFileSystem$c[] r0 = r9.f348856d
                    java.util.List r0 = java.util.Arrays.asList(r0)
                    goto L_0x0098
                L_0x0079:
                    com.tencent.mm.vfs.StatisticsFileSystem$c[] r3 = r9.f348856d
                    if (r3 != 0) goto L_0x0082
                    java.util.Set r0 = java.util.Collections.singleton(r0)
                    goto L_0x0098
                L_0x0082:
                    qp3.e r0 = new qp3.e
                    r4 = 2
                    java.lang.Iterable[] r4 = new java.lang.Iterable[r4]
                    java.util.List r3 = java.util.Arrays.asList(r3)
                    r4[r2] = r3
                    com.tencent.mm.vfs.StatisticsFileSystem$c r2 = r9.f348857e
                    java.util.Set r2 = java.util.Collections.singleton(r2)
                    r4[r1] = r2
                    r0.<init>(r4)
                L_0x0098:
                    java.util.Iterator r0 = r0.iterator()
                L_0x009c:
                    boolean r2 = r0.hasNext()
                    if (r2 == 0) goto L_0x00ee
                    java.lang.Object r2 = r0.next()
                    com.tencent.mm.vfs.StatisticsFileSystem$c r2 = (com.tencent.p014mm.vfs.StatisticsFileSystem.C116254c) r2
                    long r3 = r2.f348864h
                    long r5 = r10.f250474d
                    long r3 = r3 + r5
                    r2.f348864h = r3
                    boolean r3 = r10.f250476f
                    if (r3 == 0) goto L_0x00b9
                    int r3 = r2.f348866j
                    int r3 = r3 + r1
                    r2.f348866j = r3
                    goto L_0x009c
                L_0x00b9:
                    int r3 = r2.f348865i
                    int r3 = r3 + r1
                    r2.f348865i = r3
                    long r3 = r10.f250473c
                    long r5 = r2.f348869p
                    int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r7 <= 0) goto L_0x00c8
                    r2.f348869p = r3
                L_0x00c8:
                    long r3 = r10.f250475e
                    r5 = 0
                    int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r7 <= 0) goto L_0x00d9
                    long r5 = r2.f348867n
                    long r7 = r2.f348862f
                    long r7 = r7 - r3
                    long r5 = r5 + r7
                    r2.f348867n = r5
                    goto L_0x00de
                L_0x00d9:
                    int r3 = r2.f348870q
                    int r3 = r3 + r1
                    r2.f348870q = r3
                L_0x00de:
                    java.lang.String r3 = r10.f250471a
                    int r3 = com.tencent.p014mm.vfs.StatisticsFileSystem.m163763b(r3)
                    int r4 = r2.f348863g
                    int r3 = r3 - r4
                    int r4 = r2.f348868o
                    if (r3 <= r4) goto L_0x009c
                    r2.f348868o = r3
                    goto L_0x009c
                L_0x00ee:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.StatisticsFileSystem.C116252b.C116253a.mo105957f(java.lang.Object):java.lang.Object");
            }

            /* renamed from: h */
            public void mo177698h() {
                C116252b bVar = C116252b.this;
                bVar.f348854r--;
            }
        }

        public C116252b(FileSystem.C85995c cVar, String[] strArr, String[] strArr2, Map<String, Object> map) {
            super(StatisticsFileSystem.this, map);
            this.f348844e = cVar;
            this.f348845f = Collections.singletonList(cVar);
            this.f348846g = strArr;
            this.f348847h = strArr2;
        }

        /* renamed from: G */
        public List<FileSystem.C85995c> mo119926G() {
            return this.f348845f;
        }

        /* renamed from: H */
        public FileSystem.C85995c mo119927H(String str, int i) {
            return this.f348844e;
        }

        /* renamed from: N */
        public final void mo177759N(C116254c cVar) {
            Object[] objArr = new Object[16];
            objArr[0] = "relPath";
            objArr[1] = cVar.f348860d;
            objArr[2] = "recursive";
            objArr[3] = Boolean.valueOf(cVar.f348861e);
            objArr[4] = "totalSize";
            objArr[5] = Long.valueOf(cVar.f348864h);
            objArr[6] = "fileCount";
            objArr[7] = Integer.valueOf(cVar.f348865i);
            objArr[8] = "dirCount";
            objArr[9] = Integer.valueOf(cVar.f348866j);
            objArr[10] = "averageAge";
            int i = cVar.f348865i;
            int i2 = cVar.f348870q;
            objArr[11] = Long.valueOf(i - i2 == 0 ? 0 : cVar.f348867n / ((long) (i - i2)));
            objArr[12] = "maxDepth";
            objArr[13] = Integer.valueOf(cVar.f348868o);
            objArr[14] = "maxFileSize";
            objArr[15] = Long.valueOf(cVar.f348869p);
            mo177781F(2, objArr);
        }

        /* renamed from: O */
        public final void mo177760O() {
            long i = C116281f0.C116289i.f348994a.mo177796i();
            if (this.f348848i != i || this.f348850n == null) {
                this.f348848i = i;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                this.f348849j = new TreeMap<>();
                this.f348854r = 0;
                for (String str : this.f348846g) {
                    boolean z = !str.endsWith("\u0000");
                    if (!z) {
                        str = str.substring(0, str.length() - 1);
                    }
                    C116254c cVar = new C116254c(str, z);
                    if (z) {
                        arrayList.add(cVar);
                        this.f348849j.put(str, new C116254c[]{cVar});
                    } else {
                        arrayList2.add(cVar);
                    }
                }
                C116254c[] cVarArr = new C116254c[0];
                this.f348850n = (C116254c[]) arrayList.toArray(cVarArr);
                C116254c[] cVarArr2 = (C116254c[]) arrayList2.toArray(cVarArr);
                this.f348852p = cVarArr2;
                this.f348851o = new byte[this.f348850n.length];
                this.f348853q = new byte[cVarArr2.length];
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public void mo119928a(CancellationSignal cancellationSignal) {
            try {
                if (StatisticsFileSystem.this.f348843h && C116281f0.C116289i.f348994a.mo177796i() != Long.MIN_VALUE) {
                    if (this.f348854r != 0) {
                        this.f348849j = null;
                        this.f348850n = null;
                        this.f348852p = null;
                        this.f348853q = null;
                        this.f348854r = 0;
                    }
                    mo177760O();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        C116254c[] cVarArr = this.f348852p;
                        if (i >= cVarArr.length) {
                            break;
                        }
                        if (this.f348853q[i] <= 0) {
                            Iterable<C86001b0> list = list(cVarArr[i].f348860d);
                            if (list != null) {
                                for (C86001b0 next : list) {
                                    i2++;
                                    if ((i2 & 16) == 0) {
                                        cancellationSignal.throwIfCanceled();
                                    }
                                }
                            }
                        }
                        i++;
                    }
                    while (!this.f348849j.isEmpty()) {
                        Iterable<C86001b0> list2 = list(this.f348849j.lastKey());
                        if (list2 != null) {
                            for (C86001b0 next2 : list2) {
                                i2++;
                                if ((i2 & 16) == 0) {
                                    cancellationSignal.throwIfCanceled();
                                }
                            }
                        }
                    }
                }
                if (this.f348850n != null && this.f348852p != null && this.f348854r == 0) {
                    int i3 = 0;
                    while (true) {
                        C116254c[] cVarArr2 = this.f348850n;
                        if (i3 >= cVarArr2.length) {
                            break;
                        }
                        if (this.f348851o[i3] == 1) {
                            C116254c cVar = cVarArr2[i3];
                            String ceilingKey = this.f348849j.ceilingKey(cVar.f348860d);
                            if (ceilingKey != null) {
                                if (!ceilingKey.equals(cVar.f348860d)) {
                                    if (ceilingKey.startsWith(cVar.f348860d + XVFSFile.SEPARATOR_CHAR)) {
                                    }
                                }
                            }
                            mo177759N(cVar);
                        }
                        i3++;
                    }
                    int i4 = 0;
                    while (true) {
                        C116254c[] cVarArr3 = this.f348852p;
                        if (i4 >= cVarArr3.length) {
                            break;
                        }
                        if (this.f348853q[i4] == 1) {
                            mo177759N(cVarArr3[i4]);
                        }
                        i4++;
                    }
                }
                this.f348848i = Long.MIN_VALUE;
                this.f348849j = null;
                this.f348850n = null;
                this.f348851o = null;
                this.f348852p = null;
                this.f348853q = null;
                this.f348854r = 0;
                cancellationSignal.throwIfCanceled();
                super.mo119928a(cancellationSignal);
            } catch (Throwable th) {
                this.f348848i = Long.MIN_VALUE;
                this.f348849j = null;
                this.f348850n = null;
                this.f348851o = null;
                this.f348852p = null;
                this.f348853q = null;
                this.f348854r = 0;
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C116252b)) {
                return false;
            }
            C116252b bVar = (C116252b) obj;
            return this.f348844e.equals(bVar.f348844e) && Arrays.equals(this.f348846g, bVar.f348846g) && Arrays.equals(this.f348847h, bVar.f348847h) && StatisticsFileSystem.this.f348843h == StatisticsFileSystem.this.f348843h;
        }

        public int hashCode() {
            int hashCode = C116252b.class.hashCode();
            Object[] objArr = {this.f348844e, this.f348846g, this.f348847h, Boolean.valueOf(StatisticsFileSystem.this.f348843h)};
            Pattern pattern = C116299g2.f349012a;
            return hashCode ^ Arrays.deepHashCode(objArr);
        }

        public Iterable<C86001b0> list(String str) {
            C116254c cVar;
            Iterable<C86001b0> list = super.list(str);
            if (C116281f0.C116289i.f348994a.mo177796i() == Long.MIN_VALUE) {
                return list;
            }
            mo177760O();
            String k = C116299g2.m163855k(str, true, true);
            C116254c[] remove = this.f348849j.remove(k);
            int binarySearch = Arrays.binarySearch(this.f348852p, k);
            if (remove == null && binarySearch < 0) {
                return list;
            }
            int i = 2;
            if (binarySearch < 0) {
                cVar = null;
            } else {
                cVar = this.f348852p[binarySearch];
                this.f348853q[binarySearch] = (byte) (list == null ? 2 : 1);
            }
            int binarySearch2 = Arrays.binarySearch(this.f348850n, k);
            if (binarySearch2 >= 0) {
                byte[] bArr = this.f348851o;
                if (list != null) {
                    i = 1;
                }
                bArr[binarySearch2] = (byte) i;
            }
            if (list == null) {
                return null;
            }
            this.f348854r++;
            C116253a aVar = new C116253a(remove, cVar);
            return new C118207h(new C118204f(list, aVar, false), aVar);
        }

        public String toString() {
            return "stat <- " + this.f348844e;
        }

        /* renamed from: u */
        public FileSystem mo119930u() {
            return StatisticsFileSystem.this;
        }
    }

    /* renamed from: com.tencent.mm.vfs.StatisticsFileSystem$c */
    public static final class C116254c implements Comparable<String> {

        /* renamed from: d */
        public final String f348860d;

        /* renamed from: e */
        public final boolean f348861e;

        /* renamed from: f */
        public final long f348862f = System.currentTimeMillis();

        /* renamed from: g */
        public final int f348863g;

        /* renamed from: h */
        public long f348864h;

        /* renamed from: i */
        public int f348865i;

        /* renamed from: j */
        public int f348866j;

        /* renamed from: n */
        public long f348867n;

        /* renamed from: o */
        public int f348868o;

        /* renamed from: p */
        public long f348869p;

        /* renamed from: q */
        public int f348870q;

        public C116254c(String str, boolean z) {
            this.f348860d = str;
            this.f348861e = z;
            this.f348863g = StatisticsFileSystem.m163763b(str);
        }

        public int compareTo(Object obj) {
            return this.f348860d.compareTo((String) obj);
        }
    }

    public StatisticsFileSystem(FileSystem fileSystem, boolean z) {
        this.f348840e = fileSystem;
        this.f348841f = null;
        this.f348842g = null;
        this.f348843h = z;
    }

    /* renamed from: b */
    public static int m163763b(String str) {
        int i = 1;
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str.isEmpty()) {
            return 0;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '/') {
                i++;
            }
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StatisticsFileSystem)) {
            return false;
        }
        StatisticsFileSystem statisticsFileSystem = (StatisticsFileSystem) obj;
        return this.f348840e.equals(statisticsFileSystem.f348840e) && this.f348843h == statisticsFileSystem.f348843h && Arrays.equals(this.f348841f, statisticsFileSystem.f348841f) && Arrays.equals(this.f348842g, statisticsFileSystem.f348842g);
    }

    public int hashCode() {
        int hashCode = StatisticsFileSystem.class.hashCode();
        Object[] objArr = {this.f348840e, this.f348841f, this.f348842g, Boolean.valueOf(this.f348843h)};
        Pattern pattern = C116299g2.f349012a;
        return hashCode ^ Arrays.deepHashCode(objArr);
    }

    public String toString() {
        return "stat <- " + this.f348840e;
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        List list;
        TreeSet treeSet;
        FileSystem.C85995c cVar = (FileSystem.C85995c) this.f348840e.mo177578v(map);
        if (cVar == NullFileSystem.m163697z()) {
            return cVar;
        }
        if (this.f348841f == null) {
            list = Collections.singletonList("");
        } else {
            TreeSet treeSet2 = new TreeSet();
            for (C116330v b : this.f348841f) {
                String[] b2 = b.mo177822b(map);
                if (b2 != null) {
                    for (String str : b2) {
                        boolean z = !str.endsWith("\u0000");
                        if (!z) {
                            str = str.substring(0, str.length() - 1);
                        }
                        String k = C116299g2.m163855k(str, true, true);
                        if (!z) {
                            k = k + 0;
                        }
                        treeSet2.add(k);
                    }
                }
            }
            list = treeSet2;
        }
        String[] strArr = null;
        if (this.f348842g == null) {
            treeSet = null;
        } else {
            treeSet = new TreeSet();
            for (C116330v b3 : this.f348842g) {
                String[] b4 = b3.mo177822b(map);
                if (b4 != null) {
                    for (String k2 : b4) {
                        treeSet.add(C116299g2.m163855k(k2, true, true));
                    }
                }
            }
            Iterator it = treeSet.iterator();
            String str2 = null;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str2 == null || !str3.startsWith(str2) || str3.charAt(str2.length()) != '/') {
                    str2 = str3;
                } else {
                    it.remove();
                }
            }
        }
        String[] strArr2 = (String[]) list.toArray(new String[0]);
        if (treeSet != null) {
            strArr = (String[]) treeSet.toArray(new String[0]);
        }
        return new C116252b(cVar, strArr2, strArr, map);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C116299g2.m163866v(parcel, StatisticsFileSystem.class, 2);
        parcel.writeParcelable(this.f348840e, i);
        C116330v[] vVarArr = this.f348841f;
        if (vVarArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(vVarArr.length);
            for (C116330v vVar : this.f348841f) {
                parcel.writeString(vVar.f349099a);
            }
        }
        C116330v[] vVarArr2 = this.f348842g;
        if (vVarArr2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(vVarArr2.length);
            for (C116330v vVar2 : this.f348842g) {
                parcel.writeString(vVar2.f349099a);
            }
        }
        parcel.writeByte(this.f348843h ? (byte) 1 : 0);
    }

    public StatisticsFileSystem(FileSystem fileSystem, boolean z, Collection<String> collection, Collection<String> collection2) {
        this.f348840e = fileSystem;
        this.f348843h = z;
        int i = 0;
        if (collection == null || collection.isEmpty()) {
            this.f348841f = null;
        } else {
            this.f348841f = new C116330v[collection.size()];
            int i2 = 0;
            for (String vVar : collection) {
                this.f348841f[i2] = new C116330v(vVar);
                i2++;
            }
        }
        if (collection2 == null) {
            this.f348842g = null;
            return;
        }
        this.f348842g = new C116330v[collection2.size()];
        for (String vVar2 : collection2) {
            this.f348842g[i] = new C116330v(vVar2);
            i++;
        }
    }

    public StatisticsFileSystem(Parcel parcel) {
        C116299g2.m163845a(parcel, StatisticsFileSystem.class, 2);
        FileSystem fileSystem = (FileSystem) parcel.readParcelable(getClass().getClassLoader());
        this.f348840e = fileSystem;
        if (fileSystem != null) {
            int readInt = parcel.readInt();
            boolean z = false;
            if (readInt == 0) {
                this.f348841f = null;
            } else {
                this.f348841f = new C116330v[readInt];
                for (int i = 0; i < readInt; i++) {
                    this.f348841f[i] = new C116330v(parcel.readString());
                }
            }
            int readInt2 = parcel.readInt();
            if (readInt2 == 0) {
                this.f348842g = null;
            } else {
                this.f348842g = new C116330v[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    this.f348842g[i2] = new C116330v(parcel.readString());
                }
            }
            this.f348843h = parcel.readByte() != 0 ? true : z;
            return;
        }
        throw new IllegalArgumentException("Wrong wrapped filesystem.");
    }
}
