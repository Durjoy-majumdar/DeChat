package lv1;

import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kv1.C99249c;
import kv1.C99255j;
import mv1.C100004a;
import mv1.C100005b;
import mv1.C100006c;

/* renamed from: lv1.i */
public class C99672i {

    /* renamed from: f */
    public static final C99674b f292119f = new C99673a();

    /* renamed from: a */
    public String f292120a;

    /* renamed from: b */
    public String f292121b;

    /* renamed from: c */
    public String[] f292122c;

    /* renamed from: d */
    public String[] f292123d;

    /* renamed from: e */
    public List<C99676d> f292124e = new ArrayList();

    /* renamed from: lv1.i$a */
    public class C99673a implements C99674b {
        /* renamed from: a */
        public String[] mo128830a(String str, int i) {
            return C99249c.C99250a.f291024f.split(str, i);
        }

        /* renamed from: b */
        public String[] mo128831b(String str) {
            return C99249c.C99250a.f291024f.split(str);
        }
    }

    /* renamed from: lv1.i$b */
    public interface C99674b {
        /* renamed from: a */
        String[] mo128830a(String str, int i);

        /* renamed from: b */
        String[] mo128831b(String str);
    }

    /* renamed from: lv1.i$c */
    public static class C99675c {

        /* renamed from: a */
        public C99677e f292125a;

        /* renamed from: b */
        public String f292126b;

        /* renamed from: c */
        public List<String> f292127c;
    }

    /* renamed from: lv1.i$d */
    public static class C99676d {

        /* renamed from: a */
        public List<C99675c> f292128a = new ArrayList();

        /* renamed from: a */
        public String mo139045a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) this.f292128a).iterator();
            while (it.hasNext()) {
                C99675c cVar = (C99675c) it.next();
                if (!arrayList.contains(cVar.f292126b)) {
                    arrayList.add(cVar.f292126b);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < arrayList.size(); i++) {
                String str = (String) arrayList.get(i);
                sb.append(FastJsonResponse.QUOTE);
                sb.append(str);
                char charAt = str.charAt(str.length() - 1);
                if (C99255j.m129318b(charAt) || C99255j.f291046i.mo138630a(charAt)) {
                    sb.append("\"*");
                } else {
                    sb.append(FastJsonResponse.QUOTE);
                }
                if (i != arrayList.size() - 1) {
                    sb.append(" OR ");
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: lv1.i$e */
    public enum C99677e {
        FullPY,
        ShortPY,
        OTHER
    }

    /* renamed from: a */
    public static C99672i m130094a(String str, boolean z) {
        return m130095b(str, z, f292119f);
    }

    /* renamed from: b */
    public static C99672i m130095b(String str, boolean z, C99674b bVar) {
        boolean z2;
        String[] strArr;
        int i;
        C100004a aVar;
        C100006c cVar;
        C100006c cVar2;
        C99674b bVar2 = bVar;
        C99672i iVar = new C99672i();
        iVar.f292120a = str;
        String c = C99255j.m129319c(str.toLowerCase());
        iVar.f292121b = c;
        iVar.f292122c = bVar2.mo128831b(c);
        iVar.f292123d = bVar2.mo128830a(iVar.f292121b, 2);
        String[] strArr2 = iVar.f292122c;
        int length = strArr2.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            String str2 = strArr2[i3];
            List<C99676d> list = iVar.f292124e;
            C99677e eVar = C99677e.OTHER;
            if (z) {
                int i4 = 0;
                while (true) {
                    if (i4 >= str2.length()) {
                        break;
                    } else if (!C99255j.m129318b(str2.charAt(i4))) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            z2 = z;
            C99676d dVar = new C99676d();
            if (z2) {
                C100005b bVar3 = C99255j.f291047j;
                bVar3.getClass();
                ArrayList arrayList = new ArrayList();
                char[] charArray = str2.toLowerCase().toCharArray();
                int i5 = 0;
                while (true) {
                    if (i5 >= charArray.length) {
                        break;
                    }
                    char c2 = charArray[i5];
                    if (bVar3.f293002b.f293003a[c2 - 'a'] == null) {
                        arrayList.clear();
                        break;
                    }
                    arrayList.add(String.valueOf(c2));
                    i5++;
                }
                if (arrayList.size() > 0) {
                    C99675c cVar3 = new C99675c();
                    cVar3.f292125a = C99677e.ShortPY;
                    cVar3.f292126b = Util.listToString(arrayList, "​");
                    cVar3.f292127c = arrayList;
                    ((ArrayList) dVar.f292128a).add(cVar3);
                }
                C100005b bVar4 = C99255j.f291047j;
                bVar4.getClass();
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.offer(new C100004a(i2, i2, (C100004a) null));
                char[] charArray2 = str2.toLowerCase().toCharArray();
                ArrayList arrayList2 = new ArrayList();
                while (!arrayDeque.isEmpty() && (aVar = (C100004a) arrayDeque.poll()) != null) {
                    int i6 = aVar.f292997b;
                    C100006c cVar4 = bVar4.f293002b;
                    String[] strArr3 = strArr2;
                    while (i6 < charArray2.length && (cVar = cVar4.f293003a[charArray2[i6] - 'a']) != null) {
                        int i7 = length;
                        if (cVar.f293004b || i6 == charArray2.length - 1) {
                            if (aVar.f292999d == null) {
                                aVar.f292999d = new ArrayList();
                            }
                            cVar2 = cVar;
                            C100004a aVar2 = new C100004a(aVar.f292997b, i6 + 1, aVar);
                            ((ArrayList) aVar.f292999d).add(aVar2);
                            if (aVar2.f292997b == charArray2.length) {
                                aVar2.f293000e = true;
                            }
                            arrayDeque.offer(aVar2);
                        } else {
                            cVar2 = cVar;
                        }
                        i6++;
                        length = i7;
                        cVar4 = cVar2;
                    }
                    int i8 = length;
                    if (aVar.f293000e) {
                        ArrayList arrayList3 = new ArrayList();
                        while (aVar != null) {
                            int i9 = aVar.f292997b;
                            int i15 = aVar.f292996a;
                            if (i9 > i15) {
                                arrayList3.add(str2.substring(i15, i9));
                            }
                            aVar = aVar.f292998c;
                        }
                        Collections.reverse(arrayList3);
                        arrayList2.add(arrayList3);
                    }
                    strArr2 = strArr3;
                    length = i8;
                }
                strArr = strArr2;
                i = length;
                if (arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        List<String> list2 = (List) it.next();
                        if (list2.size() > 0) {
                            C99675c cVar5 = new C99675c();
                            cVar5.f292125a = C99677e.FullPY;
                            cVar5.f292126b = Util.listToString(list2, "​");
                            cVar5.f292127c = list2;
                            ((ArrayList) dVar.f292128a).add(cVar5);
                        }
                    }
                }
                C99675c cVar6 = new C99675c();
                cVar6.f292125a = eVar;
                cVar6.f292126b = str2;
                ((ArrayList) dVar.f292128a).add(cVar6);
            } else {
                strArr = strArr2;
                i = length;
                C99675c cVar7 = new C99675c();
                cVar7.f292125a = eVar;
                cVar7.f292126b = str2;
                ((ArrayList) dVar.f292128a).add(cVar7);
            }
            ((ArrayList) list).add(dVar);
            i3++;
            strArr2 = strArr;
            length = i;
            i2 = 0;
        }
        return iVar;
    }

    /* renamed from: c */
    public static C99672i m130096c(List<String> list) {
        C99672i iVar = new C99672i();
        iVar.f292120a = "";
        iVar.f292121b = "";
        for (String split : list) {
            String[] split2 = split.split(",");
            C99676d dVar = new C99676d();
            for (String str : split2) {
                C99675c cVar = new C99675c();
                cVar.f292125a = C99677e.OTHER;
                cVar.f292126b = str;
                ((ArrayList) dVar.f292128a).add(cVar);
            }
            ((ArrayList) iVar.f292124e).add(dVar);
        }
        return iVar;
    }

    /* renamed from: d */
    public String mo139044d() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ((ArrayList) this.f292124e).size(); i++) {
            stringBuffer.append("(");
            stringBuffer.append(((C99676d) ((ArrayList) this.f292124e).get(i)).mo139045a());
            stringBuffer.append(")");
            if (i != ((ArrayList) this.f292124e).size() - 1) {
                stringBuffer.append(" AND ");
            }
        }
        return stringBuffer.toString();
    }
}
