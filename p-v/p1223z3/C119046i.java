package p1223z3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p1188d4.C116567d;
import p1188d4.C116568e;

/* renamed from: z3.i */
public class C119046i implements C116568e, C116567d {

    /* renamed from: o */
    public static final TreeMap<Integer, C119046i> f356547o = new TreeMap<>();

    /* renamed from: d */
    public volatile String f356548d;

    /* renamed from: e */
    public final long[] f356549e;

    /* renamed from: f */
    public final double[] f356550f;

    /* renamed from: g */
    public final String[] f356551g;

    /* renamed from: h */
    public final byte[][] f356552h;

    /* renamed from: i */
    public final int[] f356553i;

    /* renamed from: j */
    public final int f356554j;

    /* renamed from: n */
    public int f356555n;

    public C119046i(int i) {
        this.f356554j = i;
        int i2 = i + 1;
        this.f356553i = new int[i2];
        this.f356549e = new long[i2];
        this.f356550f = new double[i2];
        this.f356551g = new String[i2];
        this.f356552h = new byte[i2][];
    }

    /* renamed from: c */
    public static C119046i m167801c(String str, int i) {
        TreeMap<Integer, C119046i> treeMap = f356547o;
        synchronized (treeMap) {
            Map.Entry<Integer, C119046i> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C119046i value = ceilingEntry.getValue();
                value.f356548d = str;
                value.f356555n = i;
                return value;
            }
            C119046i iVar = new C119046i(i);
            iVar.f356548d = str;
            iVar.f356555n = i;
            return iVar;
        }
    }

    /* renamed from: a */
    public String mo180538a() {
        return this.f356548d;
    }

    /* renamed from: b */
    public void mo180539b(C116567d dVar) {
        for (int i = 1; i <= this.f356555n; i++) {
            int i2 = this.f356553i[i];
            if (i2 == 1) {
                dVar.bindNull(i);
            } else if (i2 == 2) {
                dVar.bindLong(i, this.f356549e[i]);
            } else if (i2 == 3) {
                dVar.bindDouble(i, this.f356550f[i]);
            } else if (i2 == 4) {
                dVar.bindString(i, this.f356551g[i]);
            } else if (i2 == 5) {
                dVar.bindBlob(i, this.f356552h[i]);
            }
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f356553i[i] = 5;
        this.f356552h[i] = bArr;
    }

    public void bindDouble(int i, double d) {
        this.f356553i[i] = 3;
        this.f356550f[i] = d;
    }

    public void bindLong(int i, long j) {
        this.f356553i[i] = 2;
        this.f356549e[i] = j;
    }

    public void bindNull(int i) {
        this.f356553i[i] = 1;
    }

    public void bindString(int i, String str) {
        this.f356553i[i] = 4;
        this.f356551g[i] = str;
    }

    public void close() {
    }

    /* renamed from: d */
    public void mo183710d() {
        TreeMap<Integer, C119046i> treeMap = f356547o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f356554j), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }
}
