package z31;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kj2.C61103a;
import sx3.C64197v;

/* renamed from: z31.b */
public final class C102972b {

    /* renamed from: a */
    public static final C102972b f303874a = new C102972b();

    /* renamed from: b */
    public static final SparseArray<C61103a> f303875b = new SparseArray<>();

    /* renamed from: c */
    public static final HashMap<String, Long> f303876c = new HashMap<>();

    /* renamed from: d */
    public static final SparseArray<HashSet<C16097e>> f303877d = new SparseArray<>();

    /* renamed from: a */
    public final C61103a mo142707a(int i, boolean z) {
        C61103a aVar;
        C61103a aVar2 = f303875b.get(i);
        if (!z || aVar2 != null) {
            return aVar2;
        }
        try {
            aVar = (C61103a) Class.forName("com.tencent.mm.autogen.mmdata.rpt.Struct" + i).newInstance();
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.KVReportManager", "getInstance " + i + " error");
            aVar = null;
        }
        C61103a aVar3 = aVar;
        f303875b.put(i, aVar3);
        return aVar3;
    }

    /* renamed from: b */
    public final void mo142708b(int i, String str, String str2) {
        Object obj;
        C61103a a;
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "value");
        HashSet hashSet = f303877d.get(i);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C87412m.m108589b(((C16097e) obj).f43248a, str2)) {
                    break;
                }
            }
            C16097e eVar = (C16097e) obj;
            if (eVar != null && !eVar.f43249b.isEmpty() && (a = mo142707a(i, true)) != null) {
                HashSet<String> hashSet2 = eVar.f43249b;
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                for (T next : hashSet2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        sb.append((String) next);
                        if (i2 != hashSet2.size() - 1) {
                            sb.append("|");
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                String sb4 = sb.toString();
                C87412m.m108593f(sb4, "stringBuilder.toString()");
                a.mo86052l(str, sb4);
            }
        }
    }

    /* renamed from: c */
    public final void mo142709c(int i, String str, Object obj) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(obj, "value");
        C61103a a = mo142707a(i, true);
        if (a != null) {
            a.mo86052l(str, obj);
        }
        Log.m105918d("MicroMsg.KVReportManager", "report:" + i + " key:" + str + " value:" + obj);
    }

    /* renamed from: d */
    public final void mo142710d(int i, String str, int i2) {
        C87412m.m108594g(str, "key");
        C61103a a = mo142707a(i, true);
        if (a != null) {
            Object i3 = a.mo86050i(str);
            C87412m.m108592e(i3, "null cannot be cast to non-null type kotlin.Int");
            a.mo86052l(str, Integer.valueOf(((Integer) i3).intValue() + i2));
            Log.m105918d("MicroMsg.KVReportManager", "logid:" + i + " increment key:" + str + " step:" + i2);
        }
    }

    /* renamed from: e */
    public final void mo142711e(int i, String str) {
        long j;
        C87412m.m108594g(str, "key");
        HashMap<String, Long> hashMap = f303876c;
        Long remove = hashMap.remove(i + '-' + str);
        if (remove == null) {
            remove = -1L;
        }
        long longValue = remove.longValue();
        if (longValue <= 0) {
            Log.m105920e("MicroMsg.KVReportManager", "report:" + i + " key:" + str + " error!");
            return;
        }
        C61103a a = mo142707a(i, true);
        if (a != null) {
            Object i2 = a.mo86050i(str);
            if (i2 instanceof Integer) {
                j = (long) ((Number) i2).intValue();
            } else {
                C87412m.m108592e(i2, "null cannot be cast to non-null type kotlin.Long");
                j = ((Long) i2).longValue();
            }
            a.mo86052l(str, Long.valueOf((System.currentTimeMillis() - longValue) + j));
        }
    }

    /* renamed from: f */
    public final void mo142712f(int i, String str) {
        C87412m.m108594g(str, "key");
        HashMap<String, Long> hashMap = f303876c;
        if (!hashMap.containsKey(i + '-' + str)) {
            long currentTimeMillis = System.currentTimeMillis();
            Long valueOf = Long.valueOf(currentTimeMillis);
            hashMap.put(i + '-' + str, valueOf);
            Log.m105918d("MicroMsg.KVReportManager", "report:" + i + " key:" + str + " value:" + currentTimeMillis);
        }
    }

    /* renamed from: g */
    public final void mo142713g(int i, String str, Object obj) {
        Object obj2;
        C87412m.m108594g(str, "key");
        C87412m.m108594g(obj, "unique");
        SparseArray<HashSet<C16097e>> sparseArray = f303877d;
        if (sparseArray.get(i) == null) {
            sparseArray.put(i, new HashSet());
        }
        HashSet hashSet = sparseArray.get(i);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (C87412m.m108589b(((C16097e) obj2).f43248a, str)) {
                    break;
                }
            }
            C16097e eVar = (C16097e) obj2;
            if (eVar == null) {
                eVar = new C16097e(str, (HashSet) null, 2, (C8480h) null);
                hashSet.add(eVar);
            }
            eVar.f43249b.add(obj.toString());
            Log.m105918d("MicroMsg.KVReportManager", "uniqueCount logid:" + i + " key:" + str + " unique:" + obj + " size:" + eVar.f43249b.size());
        }
    }
}
