package com.tencent.p014mm.vfs;

import android.util.Pair;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import qp3.C118196a;
import qp3.C118197b;
import qp3.C118201e;
import rx3.C13604l;
import sx3.C64186f0;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.vfs.c0 */
public final class C116271c0 {

    /* renamed from: a */
    public static final C116271c0 f348905a = new C116271c0();

    /* renamed from: b */
    public static final Map<String, Integer> f348906b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<String, Integer> f348907c = new LinkedHashMap();

    /* renamed from: d */
    public static final List<C13604l<String, String>> f348908d = new ArrayList();

    /* renamed from: e */
    public static final List<C13604l<String, String>> f348909e = new ArrayList();

    /* renamed from: com.tencent.mm.vfs.c0$a */
    public static final class C116272a<S, T> implements C118196a.C89789a {

        /* renamed from: a */
        public final /* synthetic */ Map<String, Object> f348910a;

        /* renamed from: b */
        public final /* synthetic */ SortedMap<String, Integer> f348911b;

        /* renamed from: c */
        public final /* synthetic */ SortedMap<String, C32227p<C86001b0, Integer, Integer>> f348912c;

        /* renamed from: d */
        public final /* synthetic */ C116273c1 f348913d;

        public C116272a(Map<String, ? extends Object> map, SortedMap<String, Integer> sortedMap, SortedMap<String, C32227p<C86001b0, Integer, Integer>> sortedMap2, C116273c1 c1Var) {
            this.f348910a = map;
            this.f348911b = sortedMap;
            this.f348912c = sortedMap2;
            this.f348913d = c1Var;
        }

        /* renamed from: a */
        public Iterable mo119949a(Object obj) {
            String str = (String) obj;
            String a = new C116330v(str).mo177821a(this.f348910a);
            if (a == null) {
                return C64186f0.f181907d;
            }
            FileSystem.C85995c d = new NativeFileSystem(str).mo177578v(this.f348910a);
            C87412m.m108593f(d, "NativeFileSystem(path).configure(env)");
            Integer num = this.f348911b.get(a);
            int intValue = num != null ? num.intValue() : 0;
            Iterable<C86001b0> list = d.list("");
            return list == null ? C64186f0.f181907d : new C118196a(list, new C116279e1(intValue, a, this.f348912c.get(a), this.f348913d));
        }
    }

    static {
        int length = C116274d0.f348922b.length;
        int length2 = C116274d0.f348923c.length;
        int length3 = C116274d0.f348929i.length;
        int length4 = C116274d0.f348930j.length;
        int length5 = C116274d0.f348932l.length;
        int length6 = C116274d0.f348933m.length;
    }

    /* renamed from: a */
    public final Iterable<C97318g1> mo177785a(boolean z, C116300h1 h1Var) {
        String[] strArr;
        char c;
        List<Pair<String, String>> c2 = VFSStrategy.m163775c();
        HashMap hashMap = new HashMap(C116281f0.C116289i.f348994a.mo177791d());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = (ArrayList) c2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.first;
            C87412m.m108593f(obj, "ap.first");
            linkedHashSet.add(obj);
            Object obj2 = pair.second;
            C87412m.m108593f(obj2, "ap.second");
            linkedHashSet.add(obj2);
        }
        C24564k0.m30737a(linkedHashSet).remove(hashMap.get("account"));
        C24564k0.m30737a(linkedHashSet).remove(hashMap.get("accountSalt"));
        int i = 0;
        Object[] array = linkedHashSet.toArray(new String[0]);
        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        hashMap.put("accountAllOther", array);
        Object[] array2 = C116274d0.f348935o.toArray(new String[0]);
        C87412m.m108592e(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        hashMap.put("xwebKeep", array2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeMap treeMap = new TreeMap();
        C90364q0.m113151j(treeMap, new C13604l[0]);
        Object obj3 = hashMap.get("account");
        int i2 = 2;
        C118197b bVar = new C118197b(Arrays.asList(new Iterable[]{f348909e, f348908d}).iterator(), C118201e.f353343e);
        while (bVar.hasNext()) {
            C13604l lVar = (C13604l) bVar.next();
            String[] b = new C116330v((String) lVar.f38555d).mo177822b(hashMap);
            if (b != null) {
                for (String put : b) {
                    treeMap.put(put, lVar.f38556e);
                }
            }
        }
        C118197b bVar2 = new C118197b(Arrays.asList(new Iterable[]{((LinkedHashMap) f348907c).entrySet(), ((LinkedHashMap) f348906b).entrySet()}).iterator(), C118201e.f353343e);
        while (bVar2.hasNext()) {
            Map.Entry entry = (Map.Entry) bVar2.next();
            FileSystem fileSystem = ((C116340x0) C116281f0.C116289i.f348994a.mo177788a()).mo177848c().get(entry.getKey());
            if (fileSystem != null) {
                Object key = entry.getKey();
                Object v = fileSystem.mo177578v(hashMap);
                C87412m.m108593f(v, "fs.configure(env)");
                linkedHashMap.put(key, new C116302i1(((Number) entry.getValue()).intValue(), (String) entry.getKey(), (FileSystem.C85995c) v));
            }
        }
        HashMap hashMap2 = new HashMap(hashMap);
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            Pair pair2 = (Pair) it4.next();
            if (!C87412m.m108589b(pair2.first, obj3)) {
                hashMap2.put("account", pair2.first);
                hashMap2.put("accountSalt", pair2.second);
                if (C87412m.m108589b(pair2.first, pair2.second)) {
                    strArr = new String[1];
                    strArr[i] = (String) pair2.first;
                } else {
                    strArr = new String[i2];
                    strArr[i] = (String) pair2.first;
                    strArr[1] = (String) pair2.second;
                }
                hashMap2.put("accountSd", strArr);
                Iterator it5 = ((ArrayList) f348908d).iterator();
                while (true) {
                    c = '-';
                    if (!it5.hasNext()) {
                        break;
                    }
                    C13604l lVar2 = (C13604l) it5.next();
                    String str = ((String) lVar2.f38556e) + '-' + ((String) pair2.first);
                    String[] b2 = new C116330v((String) lVar2.f38555d).mo177822b(hashMap2);
                    if (b2 != null) {
                        for (String put2 : b2) {
                            treeMap.put(put2, str);
                        }
                    }
                }
                for (Map.Entry entry2 : ((LinkedHashMap) f348906b).entrySet()) {
                    String str2 = ((String) entry2.getKey()) + c + ((String) pair2.first);
                    FileSystem fileSystem2 = ((C116340x0) C116281f0.C116289i.f348994a.mo177788a()).mo177848c().get(entry2.getKey());
                    if (fileSystem2 != null) {
                        Object v2 = fileSystem2.mo177578v(hashMap2);
                        C87412m.m108593f(v2, "fs.configure(accEnv)");
                        linkedHashMap.put(str2, new C116302i1(((Number) entry2.getValue()).intValue(), (String) entry2.getKey(), (FileSystem.C85995c) v2));
                        i = 0;
                        c = '-';
                    }
                }
                i2 = 2;
            }
        }
        TreeMap treeMap2 = new TreeMap();
        C90364q0.m113151j(treeMap2, new C13604l[i]);
        TreeMap treeMap3 = new TreeMap();
        C90364q0.m113151j(treeMap3, new C13604l[i]);
        String[] strArr2 = C116274d0.f348922b;
        int length = strArr2.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str3 = strArr2[i3];
            int i5 = i4 + 1;
            int intValue = C116274d0.f348923c[i4].intValue();
            String[] b3 = new C116330v(str3).mo177822b(hashMap);
            if (b3 != null) {
                for (String put3 : b3) {
                    treeMap2.put(put3, Integer.valueOf(intValue));
                }
            }
            i3++;
            i4 = i5;
        }
        String[] strArr3 = C116274d0.f348929i;
        int length2 = strArr3.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length2) {
            String str4 = strArr3[i6];
            int i8 = i7 + 1;
            C32227p<C86001b0, Integer, Integer> pVar = C116274d0.f348930j[i7];
            String[] b4 = new C116330v(str4).mo177822b(hashMap);
            if (b4 != null) {
                for (String put4 : b4) {
                    treeMap3.put(put4, pVar);
                }
            }
            i6++;
            i7 = i8;
        }
        HashMap hashMap3 = new HashMap();
        String[] strArr4 = C116274d0.f348932l;
        int length3 = strArr4.length;
        int i9 = 0;
        while (i < length3) {
            hashMap3.put(strArr4[i], C116274d0.f348933m[i9]);
            i++;
            i9++;
        }
        return new C118196a(C116274d0.f348921a, new C116272a(hashMap, treeMap2, treeMap3, new C116273c1(linkedHashMap, treeMap, treeMap2, treeMap3, hashMap3, z, h1Var)));
    }
}
