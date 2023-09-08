package p452b4;

import android.database.Cursor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p1188d4.C116562b;
import p1191e4.C116683a;

/* renamed from: b4.d */
public class C113141d {

    /* renamed from: a */
    public final String f338545a;

    /* renamed from: b */
    public final Map<String, C28252a> f338546b;

    /* renamed from: c */
    public final Set<C28253b> f338547c;

    /* renamed from: d */
    public final Set<C28254d> f338548d;

    /* renamed from: b4.d$a */
    public static class C28252a {

        /* renamed from: a */
        public final String f77795a;

        /* renamed from: b */
        public final String f77796b;

        /* renamed from: c */
        public final int f77797c;

        /* renamed from: d */
        public final boolean f77798d;

        /* renamed from: e */
        public final int f77799e;

        /* renamed from: f */
        public final String f77800f;

        /* renamed from: g */
        public final int f77801g;

        public C28252a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f77795a = str;
            this.f77796b = str2;
            this.f77798d = z;
            this.f77799e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.f77797c = i3;
            this.f77800f = str3;
            this.f77801g = i2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x005f, code lost:
            r2 = r5.f77800f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L_0x0004
                return r0
            L_0x0004:
                r1 = 0
                if (r6 == 0) goto L_0x007a
                java.lang.Class<b4.d$a> r2 = p452b4.C113141d.C28252a.class
                java.lang.Class r3 = r6.getClass()
                if (r2 == r3) goto L_0x0011
                goto L_0x007a
            L_0x0011:
                b4.d$a r6 = (p452b4.C113141d.C28252a) r6
                int r2 = r5.f77799e
                int r3 = r6.f77799e
                if (r2 == r3) goto L_0x001a
                return r1
            L_0x001a:
                java.lang.String r2 = r5.f77795a
                java.lang.String r3 = r6.f77795a
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0025
                return r1
            L_0x0025:
                boolean r2 = r5.f77798d
                boolean r3 = r6.f77798d
                if (r2 == r3) goto L_0x002c
                return r1
            L_0x002c:
                int r2 = r5.f77801g
                r3 = 2
                if (r2 != r0) goto L_0x0042
                int r2 = r6.f77801g
                if (r2 != r3) goto L_0x0042
                java.lang.String r2 = r5.f77800f
                if (r2 == 0) goto L_0x0042
                java.lang.String r4 = r6.f77800f
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x0042
                return r1
            L_0x0042:
                int r2 = r5.f77801g
                if (r2 != r3) goto L_0x0057
                int r2 = r6.f77801g
                if (r2 != r0) goto L_0x0057
                java.lang.String r2 = r6.f77800f
                if (r2 == 0) goto L_0x0057
                java.lang.String r3 = r5.f77800f
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0057
                return r1
            L_0x0057:
                int r2 = r5.f77801g
                if (r2 == 0) goto L_0x0071
                int r3 = r6.f77801g
                if (r2 != r3) goto L_0x0071
                java.lang.String r2 = r5.f77800f
                if (r2 == 0) goto L_0x006c
                java.lang.String r3 = r6.f77800f
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L_0x0071
                goto L_0x0070
            L_0x006c:
                java.lang.String r2 = r6.f77800f
                if (r2 == 0) goto L_0x0071
            L_0x0070:
                return r1
            L_0x0071:
                int r2 = r5.f77797c
                int r6 = r6.f77797c
                if (r2 != r6) goto L_0x0078
                goto L_0x0079
            L_0x0078:
                r0 = 0
            L_0x0079:
                return r0
            L_0x007a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p452b4.C113141d.C28252a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (((((this.f77795a.hashCode() * 31) + this.f77797c) * 31) + (this.f77798d ? 1231 : 1237)) * 31) + this.f77799e;
        }

        public String toString() {
            return "Column{name='" + this.f77795a + '\'' + ", type='" + this.f77796b + '\'' + ", affinity='" + this.f77797c + '\'' + ", notNull=" + this.f77798d + ", primaryKeyPosition=" + this.f77799e + ", defaultValue='" + this.f77800f + '\'' + '}';
        }
    }

    /* renamed from: b4.d$b */
    public static class C28253b {

        /* renamed from: a */
        public final String f77802a;

        /* renamed from: b */
        public final String f77803b;

        /* renamed from: c */
        public final String f77804c;

        /* renamed from: d */
        public final List<String> f77805d;

        /* renamed from: e */
        public final List<String> f77806e;

        public C28253b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f77802a = str;
            this.f77803b = str2;
            this.f77804c = str3;
            this.f77805d = Collections.unmodifiableList(list);
            this.f77806e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C28253b.class != obj.getClass()) {
                return false;
            }
            C28253b bVar = (C28253b) obj;
            if (this.f77802a.equals(bVar.f77802a) && this.f77803b.equals(bVar.f77803b) && this.f77804c.equals(bVar.f77804c) && this.f77805d.equals(bVar.f77805d)) {
                return this.f77806e.equals(bVar.f77806e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f77802a.hashCode() * 31) + this.f77803b.hashCode()) * 31) + this.f77804c.hashCode()) * 31) + this.f77805d.hashCode()) * 31) + this.f77806e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f77802a + '\'' + ", onDelete='" + this.f77803b + '\'' + ", onUpdate='" + this.f77804c + '\'' + ", columnNames=" + this.f77805d + ", referenceColumnNames=" + this.f77806e + '}';
        }
    }

    /* renamed from: b4.d$d */
    public static class C28254d {

        /* renamed from: a */
        public final String f77807a;

        /* renamed from: b */
        public final boolean f77808b;

        /* renamed from: c */
        public final List<String> f77809c;

        public C28254d(String str, boolean z, List<String> list) {
            this.f77807a = str;
            this.f77808b = z;
            this.f77809c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C28254d.class != obj.getClass()) {
                return false;
            }
            C28254d dVar = (C28254d) obj;
            if (this.f77808b == dVar.f77808b && this.f77809c.equals(dVar.f77809c)) {
                return this.f77807a.startsWith("index_") ? dVar.f77807a.startsWith("index_") : this.f77807a.equals(dVar.f77807a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f77807a.startsWith("index_") ? -1184239155 : this.f77807a.hashCode()) * 31) + (this.f77808b ? 1 : 0)) * 31) + this.f77809c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f77807a + '\'' + ", unique=" + this.f77808b + ", columns=" + this.f77809c + '}';
        }
    }

    /* renamed from: b4.d$c */
    public static class C113142c implements Comparable<C113142c> {

        /* renamed from: d */
        public final int f338549d;

        /* renamed from: e */
        public final int f338550e;

        /* renamed from: f */
        public final String f338551f;

        /* renamed from: g */
        public final String f338552g;

        public C113142c(int i, int i2, String str, String str2) {
            this.f338549d = i;
            this.f338550e = i2;
            this.f338551f = str;
            this.f338552g = str2;
        }

        public int compareTo(Object obj) {
            C113142c cVar = (C113142c) obj;
            int i = this.f338549d - cVar.f338549d;
            return i == 0 ? this.f338550e - cVar.f338550e : i;
        }
    }

    public C113141d(String str, Map<String, C28252a> map, Set<C28253b> set, Set<C28254d> set2) {
        this.f338545a = str;
        this.f338546b = Collections.unmodifiableMap(map);
        this.f338547c = Collections.unmodifiableSet(set);
        this.f338548d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C113141d m154799a(C116562b bVar, String str) {
        int i;
        List<C113142c> list;
        int i2;
        int i3;
        String str2 = str;
        C116683a aVar = (C116683a) bVar;
        Cursor e = aVar.mo180687e("PRAGMA table_info(`" + str2 + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (e.getColumnCount() > 0) {
                int columnIndex = e.getColumnIndex("name");
                int columnIndex2 = e.getColumnIndex("type");
                int columnIndex3 = e.getColumnIndex("notnull");
                int columnIndex4 = e.getColumnIndex("pk");
                int columnIndex5 = e.getColumnIndex("dflt_value");
                while (e.moveToNext()) {
                    String string = e.getString(columnIndex);
                    C28252a aVar2 = r14;
                    C28252a aVar3 = new C28252a(string, e.getString(columnIndex2), e.getInt(columnIndex3) != 0, e.getInt(columnIndex4), e.getString(columnIndex5), 2);
                    hashMap.put(string, aVar2);
                }
            }
            e.close();
            HashSet hashSet = new HashSet();
            Cursor e2 = aVar.mo180687e("PRAGMA foreign_key_list(`" + str2 + "`)");
            try {
                int columnIndex6 = e2.getColumnIndex("id");
                int columnIndex7 = e2.getColumnIndex(TPReportKeys.Common.COMMON_SEQ);
                int columnIndex8 = e2.getColumnIndex("table");
                int columnIndex9 = e2.getColumnIndex("on_delete");
                int columnIndex10 = e2.getColumnIndex("on_update");
                List<C113142c> b = m154800b(e2);
                int count = e2.getCount();
                int i4 = 0;
                while (i4 < count) {
                    e2.moveToPosition(i4);
                    if (e2.getInt(columnIndex7) != 0) {
                        i3 = columnIndex6;
                        i2 = columnIndex7;
                        list = b;
                        i = count;
                    } else {
                        int i5 = e2.getInt(columnIndex6);
                        i3 = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) b).iterator();
                        while (it.hasNext()) {
                            List<C113142c> list2 = b;
                            C113142c cVar = (C113142c) it.next();
                            int i6 = count;
                            if (cVar.f338549d == i5) {
                                arrayList.add(cVar.f338551f);
                                arrayList2.add(cVar.f338552g);
                            }
                            b = list2;
                            count = i6;
                        }
                        list = b;
                        i = count;
                        hashSet.add(new C28253b(e2.getString(columnIndex8), e2.getString(columnIndex9), e2.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i4++;
                    columnIndex6 = i3;
                    columnIndex7 = i2;
                    b = list;
                    count = i;
                }
                e2.close();
                Cursor e3 = aVar.mo180687e("PRAGMA index_list(`" + str2 + "`)");
                try {
                    int columnIndex11 = e3.getColumnIndex("name");
                    int columnIndex12 = e3.getColumnIndex(FirebaseAnalytics.C113379b.ORIGIN);
                    int columnIndex13 = e3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1) {
                        if (columnIndex13 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (e3.moveToNext()) {
                                if ("c".equals(e3.getString(columnIndex12))) {
                                    C28254d c = m154801c(aVar, e3.getString(columnIndex11), e3.getInt(columnIndex13) == 1);
                                    if (c != null) {
                                        hashSet3.add(c);
                                    }
                                }
                            }
                            e3.close();
                            hashSet2 = hashSet3;
                            return new C113141d(str2, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new C113141d(str2, hashMap, hashSet, hashSet2);
                } finally {
                    e3.close();
                }
            } catch (Throwable th) {
                e2.close();
                throw th;
            }
        } catch (Throwable th4) {
            e.close();
            throw th4;
        }
    }

    /* renamed from: b */
    public static List<C113142c> m154800b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex(TPReportKeys.Common.COMMON_SEQ);
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C113142c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static C28254d m154801c(C116562b bVar, String str, boolean z) {
        Cursor e = ((C116683a) bVar).mo180687e("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = e.getColumnIndex("seqno");
            int columnIndex2 = e.getColumnIndex("cid");
            int columnIndex3 = e.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (e.moveToNext()) {
                        if (e.getInt(columnIndex2) >= 0) {
                            int i = e.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), e.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C28254d dVar = new C28254d(str, z, arrayList);
                    e.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            e.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C28254d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || C113141d.class != obj.getClass()) {
            return false;
        }
        C113141d dVar = (C113141d) obj;
        String str = this.f338545a;
        if (str == null ? dVar.f338545a != null : !str.equals(dVar.f338545a)) {
            return false;
        }
        Map<String, C28252a> map = this.f338546b;
        if (map == null ? dVar.f338546b != null : !map.equals(dVar.f338546b)) {
            return false;
        }
        Set<C28253b> set2 = this.f338547c;
        if (set2 == null ? dVar.f338547c != null : !set2.equals(dVar.f338547c)) {
            return false;
        }
        Set<C28254d> set3 = this.f338548d;
        if (set3 == null || (set = dVar.f338548d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f338545a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C28252a> map = this.f338546b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C28253b> set = this.f338547c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f338545a + '\'' + ", columns=" + this.f338546b + ", foreignKeys=" + this.f338547c + ", indices=" + this.f338548d + '}';
    }
}
