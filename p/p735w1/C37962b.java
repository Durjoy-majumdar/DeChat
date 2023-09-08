package p735w1;

import gy3.C8480h;
import java.util.ArrayList;
import java.util.List;
import p735w1.C37958a;

/* renamed from: w1.b */
public final class C37962b {

    /* renamed from: a */
    public static final C37958a f100430a = new C37958a("", (List) null, (List) null, 6, (C8480h) null);

    /* renamed from: a */
    public static final List m41689a(List list, int i, int i2) {
        if (i <= i2) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = list.get(i3);
                C37958a.C37961b bVar = (C37958a.C37961b) obj;
                if (m41690b(i, i2, bVar.f100427b, bVar.f100428c)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C37958a.C37961b bVar2 = (C37958a.C37961b) arrayList.get(i4);
                arrayList2.add(new C37958a.C37961b(bVar2.f100426a, Math.max(i, bVar2.f100427b) - i, Math.min(i2, bVar2.f100428c) - i, bVar2.f100429d));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if ((r6 == r7) == (r4 == r5)) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        if ((r4 == r5) == (r6 == r7)) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m41690b(int r4, int r5, int r6, int r7) {
        /*
            int r0 = java.lang.Math.max(r4, r6)
            int r1 = java.lang.Math.min(r5, r7)
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L_0x003a
            if (r4 > r6) goto L_0x0020
            if (r7 > r5) goto L_0x0020
            if (r5 != r7) goto L_0x001e
            if (r6 != r7) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r4 != r5) goto L_0x001b
            r1 = 1
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            if (r0 != r1) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r0 != 0) goto L_0x003a
            if (r6 > r4) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            if (r7 != r5) goto L_0x0035
            if (r4 != r5) goto L_0x002d
            r4 = 1
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            if (r6 != r7) goto L_0x0032
            r5 = 1
            goto L_0x0033
        L_0x0032:
            r5 = 0
        L_0x0033:
            if (r4 != r5) goto L_0x0037
        L_0x0035:
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            if (r4 == 0) goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p735w1.C37962b.m41690b(int, int, int, int):boolean");
    }
}
