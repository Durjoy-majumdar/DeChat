package uz3;

import fy3.C32226l;
import gy3.C87412m;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import sx3.C110818d0;
import sx3.C26234j0;
import sx3.C26235k0;
import sx3.C36907w;
import sx3.C64188i0;
import sx3.C64197v;
import sx3.C90363p0;
import sz3.C26243c;
import tz3.C26349a;
import xz3.C23156c;
import z04.C112551y;

/* renamed from: uz3.g */
public class C26379g implements C26243c {

    /* renamed from: d */
    public static final List<String> f73577d;

    /* renamed from: a */
    public final String[] f73578a;

    /* renamed from: b */
    public final Set<Integer> f73579b;

    /* renamed from: c */
    public final List<C26349a.C26360e.C26363c> f73580c;

    static {
        String S = C110818d0.m150921S(C64197v.m75537f('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
        int i = 16;
        List<String> f = C64197v.m75537f(S + "/Any", S + "/Nothing", S + "/Unit", S + "/Throwable", S + "/Number", S + "/Byte", S + "/Double", S + "/Float", S + "/Int", S + "/Long", S + "/Short", S + "/Boolean", S + "/Char", S + "/CharSequence", S + "/String", S + "/Comparable", S + "/Enum", S + "/Array", S + "/ByteArray", S + "/DoubleArray", S + "/FloatArray", S + "/IntArray", S + "/LongArray", S + "/ShortArray", S + "/BooleanArray", S + "/CharArray", S + "/Cloneable", S + "/Annotation", S + "/collections/Iterable", S + "/collections/MutableIterable", S + "/collections/Collection", S + "/collections/MutableCollection", S + "/collections/List", S + "/collections/MutableList", S + "/collections/Set", S + "/collections/MutableSet", S + "/collections/Map", S + "/collections/MutableMap", S + "/collections/Map.Entry", S + "/collections/MutableMap.MutableEntry", S + "/collections/Iterator", S + "/collections/MutableIterator", S + "/collections/ListIterator", S + "/collections/MutableListIterator");
        f73577d = f;
        Iterable<C64188i0<T>> E0 = C110818d0.m150906E0(f);
        int a = C90363p0.m113142a(C36907w.m41090l(E0, 10));
        if (a >= 16) {
            i = a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        Iterator it = ((C26234j0) E0).iterator();
        while (true) {
            C26235k0 k0Var = (C26235k0) it;
            if (k0Var.hasNext()) {
                C64188i0 i0Var = (C64188i0) k0Var.next();
                linkedHashMap.put((String) i0Var.f181910b, Integer.valueOf(i0Var.f181909a));
            } else {
                return;
            }
        }
    }

    public C26379g(String[] strArr, Set<Integer> set, List<C26349a.C26360e.C26363c> list) {
        C87412m.m108594g(strArr, "strings");
        C87412m.m108594g(set, "localNameIndices");
        C87412m.m108594g(list, "records");
        this.f73578a = strArr;
        this.f73579b = set;
        this.f73580c = list;
    }

    /* renamed from: a */
    public String mo53143a(int i) {
        return getString(i);
    }

    /* renamed from: b */
    public boolean mo53144b(int i) {
        return this.f73579b.contains(Integer.valueOf(i));
    }

    public String getString(int i) {
        String str;
        C26349a.C26360e.C26363c cVar = this.f73580c.get(i);
        int i2 = cVar.f73520e;
        if ((i2 & 4) == 4) {
            Object obj = cVar.f73523h;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                C23156c cVar2 = (C23156c) obj;
                cVar2.getClass();
                try {
                    String u = cVar2.mo36554u("UTF-8");
                    if (cVar2.mo36547n()) {
                        cVar.f73523h = u;
                    }
                    str = u;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            }
        } else {
            if ((i2 & 2) == 2) {
                List<String> list = f73577d;
                int size = list.size();
                int i3 = cVar.f73522g;
                if (i3 >= 0 && i3 < size) {
                    str = list.get(i3);
                }
            }
            str = this.f73578a[i];
        }
        if (cVar.f73525j.size() >= 2) {
            List<Integer> list2 = cVar.f73525j;
            C87412m.m108593f(list2, "substringIndexList");
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            C87412m.m108593f(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                C87412m.m108593f(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String str2 = str;
        if (cVar.f73527o.size() >= 2) {
            List<Integer> list3 = cVar.f73527o;
            C87412m.m108593f(list3, "replaceCharList");
            C87412m.m108593f(str2, "string");
            str2 = C112551y.m153815o(str2, (char) list3.get(0).intValue(), (char) list3.get(1).intValue(), false, 4, (Object) null);
        }
        String str3 = str2;
        C26349a.C26360e.C26363c.C26366c cVar3 = cVar.f73524i;
        if (cVar3 == null) {
            cVar3 = C26349a.C26360e.C26363c.C26366c.NONE;
        }
        int ordinal = cVar3.ordinal();
        if (ordinal == 1) {
            C87412m.m108593f(str3, "string");
            str3 = C112551y.m153815o(str3, '$', '.', false, 4, (Object) null);
        } else if (ordinal == 2) {
            if (str3.length() >= 2) {
                str3 = str3.substring(1, str3.length() - 1);
                C87412m.m108593f(str3, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            str3 = C112551y.m153815o(str3, '$', '.', false, 4, (Object) null);
        }
        C87412m.m108593f(str3, "string");
        return str3;
    }
}
