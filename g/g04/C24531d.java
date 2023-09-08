package g04;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sx3.C110818d0;
import sx3.C64186f0;

/* renamed from: g04.d */
public final class C24531d {

    /* renamed from: c */
    public static final C24532a f70094c = new C24532a((C8480h) null);

    /* renamed from: d */
    public static int f70095d = 1;

    /* renamed from: e */
    public static final int f70096e;

    /* renamed from: f */
    public static final int f70097f;

    /* renamed from: g */
    public static final int f70098g;

    /* renamed from: h */
    public static final int f70099h;

    /* renamed from: i */
    public static final int f70100i;

    /* renamed from: j */
    public static final int f70101j;

    /* renamed from: k */
    public static final int f70102k;

    /* renamed from: l */
    public static final int f70103l;

    /* renamed from: m */
    public static final C24531d f70104m;

    /* renamed from: n */
    public static final C24531d f70105n;

    /* renamed from: o */
    public static final C24531d f70106o;

    /* renamed from: p */
    public static final C24531d f70107p;

    /* renamed from: q */
    public static final C24531d f70108q;

    /* renamed from: r */
    public static final List<C24532a.C24533a> f70109r;

    /* renamed from: s */
    public static final List<C24532a.C24533a> f70110s;

    /* renamed from: a */
    public final List<C24528c> f70111a;

    /* renamed from: b */
    public final int f70112b;

    /* renamed from: g04.d$a */
    public static final class C24532a {

        /* renamed from: g04.d$a$a */
        public static final class C24533a {

            /* renamed from: a */
            public final int f70113a;

            /* renamed from: b */
            public final String f70114b;

            public C24533a(int i, String str) {
                C87412m.m108594g(str, "name");
                this.f70113a = i;
                this.f70114b = str;
            }
        }

        public C24532a(C8480h hVar) {
        }
    }

    static {
        C24532a.C24533a aVar;
        C24532a.C24533a aVar2;
        Class<C24531d> cls = C24531d.class;
        int i = f70095d;
        int i2 = i << 1;
        f70096e = i;
        int i3 = i2 << 1;
        f70097f = i2;
        int i4 = i3 << 1;
        f70098g = i3;
        int i5 = i4 << 1;
        f70099h = i4;
        int i6 = i5 << 1;
        f70100i = i5;
        int i7 = i6 << 1;
        f70101j = i6;
        f70095d = i7 << 1;
        int i8 = i7 - 1;
        f70102k = i8;
        int i9 = i | i2 | i3;
        f70103l = i9;
        f70104m = new C24531d(i8, (List) null, 2, (C8480h) null);
        f70105n = new C24531d(i5 | i6, (List) null, 2, (C8480h) null);
        new C24531d(i, (List) null, 2, (C8480h) null);
        new C24531d(i2, (List) null, 2, (C8480h) null);
        new C24531d(i3, (List) null, 2, (C8480h) null);
        f70106o = new C24531d(i9, (List) null, 2, (C8480h) null);
        new C24531d(i4, (List) null, 2, (C8480h) null);
        f70107p = new C24531d(i5, (List) null, 2, (C8480h) null);
        f70108q = new C24531d(i6, (List) null, 2, (C8480h) null);
        new C24531d(i2 | i5 | i6, (List) null, 2, (C8480h) null);
        Field[] fields = cls.getFields();
        C87412m.m108593f(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field2 = (Field) it.next();
            Object obj = field2.get((Object) null);
            C24531d dVar = obj instanceof C24531d ? (C24531d) obj : null;
            if (dVar != null) {
                int i15 = dVar.f70112b;
                String name = field2.getName();
                C87412m.m108593f(name, "field.name");
                aVar2 = new C24532a.C24533a(i15, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f70109r = arrayList2;
        Field[] fields2 = cls.getFields();
        C87412m.m108593f(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (C87412m.m108589b(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            Field field4 = (Field) it5.next();
            Object obj2 = field4.get((Object) null);
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                C87412m.m108593f(name2, "field.name");
                aVar = new C24532a.C24533a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f70110s = arrayList5;
    }

    public C24531d(int i, List<? extends C24528c> list) {
        C87412m.m108594g(list, "excludes");
        this.f70111a = list;
        for (C24528c a : list) {
            i &= ~a.mo51211a();
        }
        this.f70112b = i;
    }

    /* renamed from: a */
    public final boolean mo51213a(int i) {
        return (i & this.f70112b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C87412m.m108589b(C24531d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C87412m.m108592e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C24531d dVar = (C24531d) obj;
        return C87412m.m108589b(this.f70111a, dVar.f70111a) && this.f70112b == dVar.f70112b;
    }

    public int hashCode() {
        return (this.f70111a.hashCode() * 31) + this.f70112b;
    }

    public String toString() {
        T t;
        boolean z;
        Iterator<T> it = f70109r.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C24532a.C24533a) t).f70113a == this.f70112b) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C24532a.C24533a aVar = (C24532a.C24533a) t;
        String str = aVar != null ? aVar.f70114b : null;
        if (str == null) {
            List<C24532a.C24533a> list = f70110s;
            ArrayList arrayList = new ArrayList();
            for (C24532a.C24533a aVar2 : list) {
                String str2 = mo51213a(aVar2.f70113a) ? aVar2.f70114b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = C110818d0.m150921S(arrayList, APLogFileUtil.SEPARATOR_LOG, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        }
        return "DescriptorKindFilter(" + str + ", " + this.f70111a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24531d(int i, List list, int i2, C8480h hVar) {
        this(i, (i2 & 2) != 0 ? C64186f0.f181907d : list);
    }
}
