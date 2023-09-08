package p981ie;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: ie.w */
public final class C117187w {

    /* renamed from: ie.w$a */
    public class C117188a implements Comparator<C117192d.C117193a> {
        public int compare(Object obj, Object obj2) {
            int i = (((long) (((C117192d.C117193a) obj).f351078b - ((C117192d.C117193a) obj2).f351078b)) > 0 ? 1 : (((long) (((C117192d.C117193a) obj).f351078b - ((C117192d.C117193a) obj2).f351078b)) == 0 ? 0 : -1));
            if (i == 0) {
                return 0;
            }
            return i > 0 ? -1 : 1;
        }
    }

    /* renamed from: ie.w$c */
    public static final class C117191c {

        /* renamed from: a */
        public long f351072a;

        /* renamed from: b */
        public long f351073b;
    }

    /* renamed from: ie.w$d */
    public static final class C117192d {

        /* renamed from: a */
        public long f351074a;

        /* renamed from: b */
        public List<C117193a> f351075b = Collections.emptyList();

        /* renamed from: c */
        public boolean f351076c = true;

        /* renamed from: ie.w$d$a */
        public static final class C117193a {

            /* renamed from: a */
            public final String f351077a;

            /* renamed from: b */
            public final int f351078b;

            /* renamed from: c */
            public long f351079c = 0;

            public C117193a(String str, int i) {
                this.f351077a = str;
                this.f351078b = i;
            }
        }

        /* renamed from: a */
        public int mo181113a(String str) {
            for (C117193a next : this.f351075b) {
                String str2 = next.f351077a;
                if (str2 != null && str2.equals(str)) {
                    return next.f351078b;
                }
            }
            return 0;
        }

        /* renamed from: b */
        public C117193a mo181114b() {
            if (this.f351075b.size() >= 1) {
                return this.f351075b.get(0);
            }
            return null;
        }

        /* renamed from: c */
        public C117193a mo181115c() {
            if (this.f351075b.size() >= 2) {
                return this.f351075b.get(1);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C117192d m165273a(List<? extends C117189b> list, long j, long j2, C117189b.C117190a aVar) {
        long j3;
        ArrayList arrayList = new ArrayList(list);
        if (!arrayList.isEmpty()) {
            C117189b a = aVar.mo173647a("CURR_STAMP");
            if (a.f351070b - ((C117189b) arrayList.get(0)).f351070b > j2) {
                arrayList.add(0, a);
            }
        }
        HashMap hashMap = new HashMap();
        if (j > 0) {
            Iterator it = arrayList.iterator();
            long j4 = Long.MIN_VALUE;
            long j5 = Long.MIN_VALUE;
            j3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C117189b bVar = (C117189b) it.next();
                if (j4 != Long.MIN_VALUE) {
                    long j6 = bVar.f351070b;
                    if (j4 < j6) {
                        break;
                    }
                    long j7 = j4 - j6;
                    long j8 = j3 + j7;
                    if (j8 >= j) {
                        long j9 = j - j3;
                        j3 += j9;
                        C117191c cVar = (C117191c) hashMap.get(bVar.f351069a);
                        if (cVar == null) {
                            cVar = new C117191c();
                            hashMap.put(bVar.f351069a, cVar);
                        }
                        cVar.f351072a += j9;
                        cVar.f351073b = (long) (((float) cVar.f351073b) + (((float) (j5 - bVar.f351071c)) * (((float) j9) / ((float) j7))));
                    } else {
                        C117191c cVar2 = (C117191c) hashMap.get(bVar.f351069a);
                        if (cVar2 == null) {
                            cVar2 = new C117191c();
                            hashMap.put(bVar.f351069a, cVar2);
                        }
                        cVar2.f351072a += j7;
                        cVar2.f351073b += j5 - bVar.f351071c;
                        j3 = j8;
                    }
                }
                j4 = bVar.f351070b;
                j5 = bVar.f351071c;
            }
        } else {
            Iterator it4 = arrayList.iterator();
            long j15 = Long.MIN_VALUE;
            long j16 = Long.MIN_VALUE;
            j3 = 0;
            while (it4.hasNext()) {
                C117189b bVar2 = (C117189b) it4.next();
                if (j15 != Long.MIN_VALUE) {
                    long j17 = bVar2.f351070b;
                    if (j15 < j17) {
                        break;
                    }
                    long j18 = j15 - j17;
                    j3 += j18;
                    C117191c cVar3 = (C117191c) hashMap.get(bVar2.f351069a);
                    if (cVar3 == null) {
                        cVar3 = new C117191c();
                        hashMap.put(bVar2.f351069a, cVar3);
                    }
                    cVar3.f351072a += j18;
                    cVar3.f351073b += j16 - bVar2.f351071c;
                }
                j15 = bVar2.f351070b;
                j16 = bVar2.f351071c;
            }
        }
        C117192d dVar = new C117192d();
        if (j3 <= 0) {
            dVar.f351076c = false;
        } else {
            if (j > j3) {
                dVar.f351076c = false;
            }
            dVar.f351074a = j3;
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                C117191c cVar4 = (C117191c) entry.getValue();
                long round = Math.round((((double) cVar4.f351072a) / ((double) j3)) * 100.0d);
                C117192d.C117193a aVar2 = new C117192d.C117193a(str, round >= 100 ? 100 : round <= 0 ? 0 : (int) round);
                aVar2.f351079c = cVar4.f351073b;
                arrayList2.add(aVar2);
            }
            Collections.sort(arrayList2, new C117188a());
            dVar.f351075b = arrayList2;
        }
        return dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = r2.size();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m165274b(java.util.List<?> r2) {
        /*
            if (r2 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r2.size()
            int r1 = r0 / 2
            int r0 = r0 + -1
            if (r1 >= r0) goto L_0x0014
            java.util.List r2 = r2.subList(r1, r0)
            r2.clear()
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p981ie.C117187w.m165274b(java.util.List):void");
    }

    /* renamed from: ie.w$b */
    public static class C117189b {

        /* renamed from: a */
        public final String f351069a;

        /* renamed from: b */
        public final long f351070b;

        /* renamed from: c */
        public final long f351071c;

        /* renamed from: ie.w$b$a */
        public interface C117190a {
            /* renamed from: a */
            C117189b mo173647a(String str);
        }

        public C117189b(String str) {
            this.f351069a = str;
            this.f351070b = SystemClock.uptimeMillis();
            this.f351071c = System.currentTimeMillis();
        }

        public String toString() {
            return "Stamp{key='" + this.f351069a + '\'' + ", upTime=" + this.f351070b + ", statMillis=" + this.f351071c + '}';
        }

        public C117189b(String str, long j) {
            this.f351069a = str;
            this.f351070b = j;
            this.f351071c = System.currentTimeMillis();
        }
    }
}
