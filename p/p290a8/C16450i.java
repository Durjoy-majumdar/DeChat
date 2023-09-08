package p290a8;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p333e8.C20528a;
import p333e8.C20551y;
import p383t7.C22439a;
import p383t7.C22442d;

/* renamed from: a8.i */
public final class C16450i implements C22442d {

    /* renamed from: d */
    public final List<C16442e> f43911d;

    /* renamed from: e */
    public final int f43912e;

    /* renamed from: f */
    public final long[] f43913f;

    /* renamed from: g */
    public final long[] f43914g;

    public C16450i(List<C16442e> list) {
        this.f43911d = list;
        int size = list.size();
        this.f43912e = size;
        this.f43913f = new long[(size * 2)];
        for (int i = 0; i < this.f43912e; i++) {
            C16442e eVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f43913f;
            jArr[i2] = eVar.f43881g;
            jArr[i2 + 1] = eVar.f43882h;
        }
        long[] jArr2 = this.f43913f;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f43914g = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: a */
    public long mo14896a(int i) {
        boolean z = true;
        C20528a.m22237a(i >= 0);
        if (i >= this.f43914g.length) {
            z = false;
        }
        C20528a.m22237a(z);
        return this.f43914g[i];
    }

    /* renamed from: b */
    public int mo14897b() {
        return this.f43914g.length;
    }

    /* renamed from: c */
    public int mo14898c(long j) {
        int b = C20551y.m22312b(this.f43914g, j, false, false);
        if (b < this.f43914g.length) {
            return b;
        }
        return -1;
    }

    /* renamed from: e */
    public List<C22439a> mo14899e(long j) {
        ArrayList arrayList;
        C16442e eVar = null;
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < this.f43912e; i++) {
            long[] jArr = this.f43913f;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                C16442e eVar2 = this.f43911d.get(i);
                if (!(eVar2.f63566e == Float.MIN_VALUE && eVar2.f63567f == Float.MIN_VALUE)) {
                    arrayList2.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else if (spannableStringBuilder == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append(eVar.f63565d).append("\n").append(eVar2.f63565d);
                    spannableStringBuilder = spannableStringBuilder2;
                } else {
                    spannableStringBuilder.append("\n").append(eVar2.f63565d);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList = arrayList2;
            arrayList.add(new C16442e(0, 0, spannableStringBuilder, (Layout.Alignment) null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
        } else {
            arrayList = arrayList2;
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }
}
