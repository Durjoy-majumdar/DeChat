package p1106e5;

import android.graphics.Bitmap;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import p1110f5.C107480a;
import p864t5.C110902a;
import sx3.C64175a0;
import sx3.C90364q0;

/* renamed from: e5.h */
public final class C107235h implements C107229b {

    /* renamed from: b */
    public final C107480a<Integer, Bitmap> f320862b = new C107480a<>();

    /* renamed from: c */
    public final TreeMap<Integer, Integer> f320863c = new TreeMap<>();

    /* renamed from: a */
    public String mo157696a(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(C110902a.m151198a(bitmap));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: b */
    public void mo157697b(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        int a = C110902a.m151198a(bitmap);
        C107480a<Integer, Bitmap> aVar = this.f320862b;
        Integer valueOf = Integer.valueOf(a);
        HashMap<K, C107480a.C107481a<K, V>> hashMap = aVar.f321587b;
        C107480a.C107481a<K, V> aVar2 = hashMap.get(valueOf);
        if (aVar2 == null) {
            aVar2 = new C107480a.C107481a<>(valueOf);
            C107480a.C107481a<K, V> aVar3 = aVar2.f321590c;
            C107480a.C107481a<K, V> aVar4 = aVar2.f321591d;
            aVar3.getClass();
            C87412m.m108594g(aVar4, "<set-?>");
            aVar3.f321591d = aVar4;
            C107480a.C107481a<K, V> aVar5 = aVar2.f321591d;
            C107480a.C107481a<K, V> aVar6 = aVar2.f321590c;
            aVar5.getClass();
            C87412m.m108594g(aVar6, "<set-?>");
            aVar5.f321590c = aVar6;
            C107480a.C107481a<K, V> aVar7 = aVar.f321586a.f321590c;
            C87412m.m108594g(aVar7, "<set-?>");
            aVar2.f321590c = aVar7;
            C107480a.C107481a<K, V> aVar8 = aVar.f321586a;
            C87412m.m108594g(aVar8, "<set-?>");
            aVar2.f321591d = aVar8;
            aVar8.f321590c = aVar2;
            C107480a.C107481a<K, V> aVar9 = aVar2.f321590c;
            aVar9.getClass();
            aVar9.f321591d = aVar2;
            hashMap.put(valueOf, aVar2);
        }
        C107480a.C107481a aVar10 = aVar2;
        List list = aVar10.f321589b;
        if (list == null) {
            list = new ArrayList();
            aVar10.f321589b = list;
        }
        list.add(bitmap);
        Integer num = this.f320863c.get(Integer.valueOf(a));
        TreeMap<Integer, Integer> treeMap = this.f320863c;
        Integer valueOf2 = Integer.valueOf(a);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        treeMap.put(valueOf2, Integer.valueOf(i));
    }

    /* renamed from: c */
    public Bitmap mo157698c(int i, int i2, Bitmap.Config config) {
        C87412m.m108594g(config, "config");
        int b = i * i2 * C110902a.m151199b(config);
        Integer ceilingKey = this.f320863c.ceilingKey(Integer.valueOf(b));
        Object obj = null;
        if (ceilingKey != null) {
            if (!(ceilingKey.intValue() <= b * 4)) {
                ceilingKey = null;
            }
            if (ceilingKey != null) {
                b = ceilingKey.intValue();
            }
        }
        C107480a<Integer, Bitmap> aVar = this.f320862b;
        Integer valueOf = Integer.valueOf(b);
        HashMap<K, C107480a.C107481a<K, V>> hashMap = aVar.f321587b;
        C107480a.C107481a<K, V> aVar2 = hashMap.get(valueOf);
        if (aVar2 == null) {
            aVar2 = new C107480a.C107481a<>(valueOf);
            hashMap.put(valueOf, aVar2);
        }
        C107480a.C107481a<K, V> aVar3 = aVar2;
        C107480a.C107481a<K, V> aVar4 = aVar3.f321590c;
        C107480a.C107481a<K, V> aVar5 = aVar3.f321591d;
        aVar4.getClass();
        C87412m.m108594g(aVar5, "<set-?>");
        aVar4.f321591d = aVar5;
        C107480a.C107481a<K, V> aVar6 = aVar3.f321591d;
        C107480a.C107481a<K, V> aVar7 = aVar3.f321590c;
        aVar6.getClass();
        C87412m.m108594g(aVar7, "<set-?>");
        aVar6.f321590c = aVar7;
        C107480a.C107481a<K, V> aVar8 = aVar.f321586a;
        C87412m.m108594g(aVar8, "<set-?>");
        aVar3.f321590c = aVar8;
        C107480a.C107481a<K, V> aVar9 = aVar.f321586a.f321591d;
        C87412m.m108594g(aVar9, "<set-?>");
        aVar3.f321591d = aVar9;
        aVar9.f321590c = aVar3;
        C107480a.C107481a<K, V> aVar10 = aVar3.f321590c;
        aVar10.getClass();
        aVar10.f321591d = aVar3;
        List<V> list = aVar3.f321589b;
        if (list != null) {
            obj = C64175a0.m75516x(list);
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            mo157710e(b);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* renamed from: d */
    public String mo157699d(int i, int i2, Bitmap.Config config) {
        C87412m.m108594g(config, "config");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(i * i2 * C110902a.m151199b(config));
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: e */
    public final void mo157710e(int i) {
        int intValue = ((Number) C90364q0.m113145d(this.f320863c, Integer.valueOf(i))).intValue();
        if (intValue == 1) {
            this.f320863c.remove(Integer.valueOf(i));
        } else {
            this.f320863c.put(Integer.valueOf(i), Integer.valueOf(intValue - 1));
        }
    }

    public Bitmap removeLast() {
        Object obj;
        C107480a<Integer, Bitmap> aVar = this.f320862b;
        C107480a.C107481a<K, V> aVar2 = aVar.f321586a.f321590c;
        while (true) {
            obj = null;
            if (C87412m.m108589b(aVar2, aVar.f321586a)) {
                break;
            }
            List<V> list = aVar2.f321589b;
            if (list != null) {
                obj = C64175a0.m75516x(list);
            }
            if (obj != null) {
                break;
            }
            C107480a.C107481a<K, V> aVar3 = aVar2.f321590c;
            C107480a.C107481a<K, V> aVar4 = aVar2.f321591d;
            aVar3.getClass();
            C87412m.m108594g(aVar4, "<set-?>");
            aVar3.f321591d = aVar4;
            C107480a.C107481a<K, V> aVar5 = aVar2.f321591d;
            C107480a.C107481a<K, V> aVar6 = aVar2.f321590c;
            aVar5.getClass();
            C87412m.m108594g(aVar6, "<set-?>");
            aVar5.f321590c = aVar6;
            HashMap<K, C107480a.C107481a<K, V>> hashMap = aVar.f321587b;
            K k = aVar2.f321588a;
            if (hashMap != null) {
                C24564k0.m30739c(hashMap).remove(k);
                aVar2 = aVar2.f321590c;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            mo157710e(bitmap.getAllocationByteCount());
        }
        return bitmap;
    }

    public String toString() {
        return "SizeStrategy: entries=" + this.f320862b + ", sizes=" + this.f320863c;
    }
}
