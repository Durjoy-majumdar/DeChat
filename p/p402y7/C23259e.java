package p402y7;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p333e8.C20551y;
import p383t7.C22439a;
import p383t7.C22442d;

/* renamed from: y7.e */
public final class C23259e implements C22442d {

    /* renamed from: d */
    public final C23256b f66856d;

    /* renamed from: e */
    public final long[] f66857e;

    /* renamed from: f */
    public final Map<String, C23258d> f66858f;

    /* renamed from: g */
    public final Map<String, C23257c> f66859g;

    public C23259e(C23256b bVar, Map<String, C23258d> map, Map<String, C23257c> map2) {
        this.f66856d = bVar;
        this.f66859g = map2;
        this.f66858f = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        bVar.getClass();
        TreeSet treeSet = new TreeSet();
        int i = 0;
        bVar.mo36730b(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f66857e = jArr;
    }

    /* renamed from: a */
    public long mo14896a(int i) {
        return this.f66857e[i];
    }

    /* renamed from: b */
    public int mo14897b() {
        return this.f66857e.length;
    }

    /* renamed from: c */
    public int mo14898c(long j) {
        int b = C20551y.m22312b(this.f66857e, j, false, false);
        if (b < this.f66857e.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: e */
    public List<C22439a> mo14899e(long j) {
        int i;
        int i2;
        C23256b bVar = this.f66856d;
        Map<String, C23258d> map = this.f66858f;
        Map<String, C23257c> map2 = this.f66859g;
        bVar.getClass();
        TreeMap treeMap = new TreeMap();
        bVar.mo36732e(j, false, bVar.f66832g, treeMap);
        bVar.mo36731d(map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            C23257c cVar = map2.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            int length = spannableStringBuilder.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                        i6++;
                    }
                    int i7 = i6 - i5;
                    if (i7 > 0) {
                        spannableStringBuilder.delete(i4, i4 + i7);
                        length -= i7;
                    }
                }
            }
            if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
                length--;
            }
            int i8 = 0;
            while (true) {
                i = length - 1;
                if (i8 >= i) {
                    break;
                }
                if (spannableStringBuilder.charAt(i8) == 10) {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == ' ') {
                        spannableStringBuilder.delete(i9, i8 + 2);
                        length = i;
                    }
                }
                i8++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
                spannableStringBuilder.delete(i, length);
                length = i;
            }
            while (true) {
                i2 = length - 1;
                if (i3 >= i2) {
                    break;
                }
                if (spannableStringBuilder.charAt(i3) == ' ') {
                    int i15 = i3 + 1;
                    if (spannableStringBuilder.charAt(i15) == 10) {
                        spannableStringBuilder.delete(i3, i15);
                        length = i2;
                    }
                }
                i3++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i2) == 10) {
                spannableStringBuilder.delete(i2, length);
            }
            arrayList.add(new C22439a(spannableStringBuilder, (Layout.Alignment) null, cVar.f66839c, cVar.f66840d, cVar.f66841e, cVar.f66838b, Integer.MIN_VALUE, cVar.f66842f));
        }
        return arrayList;
    }
}
