package jv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C97625j3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p823sg.C90193h;
import te3.C51018qv3;
import te3.C77926f9;
import te3.C77996sv3;

/* renamed from: jv0.a */
public class C99055a {

    /* renamed from: a */
    public static List<String> f290361a;

    /* renamed from: a */
    public static boolean m129002a(C77926f9 f9Var, int i) {
        if (f9Var.f227347u == i && f9Var.f227345s != null) {
            return true;
        }
        Iterator<C77996sv3> it = f9Var.f227344r.iterator();
        while (it.hasNext()) {
            if (it.next().f228225d == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m129003b() {
        return C97625j3.m125812b().mo105891f() + "backup/";
    }

    /* renamed from: c */
    public static String m129004c(String str) {
        String str2;
        String str3 = "";
        if (str == null) {
            return str3;
        }
        String f = C90193h.m112878f(str.getBytes());
        if (f.length() >= 1) {
            str2 = f.charAt(0) + "/";
        } else {
            str2 = str3;
        }
        if (f.length() >= 2) {
            str3 = f.charAt(1) + "/";
        }
        return str2 + str3;
    }

    /* renamed from: d */
    public static String m129005d(C77926f9 f9Var, int i, String str) {
        C51018qv3 qv32;
        if (f9Var.f227347u == i && (qv32 = f9Var.f227345s) != null) {
            return C90193h.m112878f(qv32.f140574f.f257327a);
        }
        int i2 = 0;
        LinkedList<C77996sv3> linkedList = f9Var.f227344r;
        if (!(linkedList == null || f9Var.f227343q == null)) {
            Iterator<C77996sv3> it = linkedList.iterator();
            while (it.hasNext()) {
                if (it.next().f228225d == i) {
                    String str2 = f9Var.f227343q.get(i2).f141175d;
                    if (!Util.isNullOrNil(str) && !str2.endsWith(str)) {
                        i2++;
                    } else if (C86013q1.m106450k(m129007f(str2))) {
                        return str2;
                    } else {
                        return null;
                    }
                }
                i2++;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static int m129006e(C77926f9 f9Var, int i) {
        if (f9Var.f227347u == i) {
            C51018qv3 qv32 = f9Var.f227345s;
            if (qv32 == null) {
                return 0;
            }
            return qv32.f140574f.f257327a.length;
        }
        LinkedList<C77996sv3> linkedList = f9Var.f227344r;
        if (!(linkedList == null || f9Var.f227343q == null)) {
            Iterator<C77996sv3> it = linkedList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().f228225d == i) {
                    return (int) C86013q1.m106451l(m129007f(f9Var.f227343q.get(i2).f141175d));
                }
                i2++;
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static String m129007f(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        return m129003b() + "backupMeida/" + m129004c(str) + str;
    }

    /* renamed from: g */
    public static byte[] m129008g(C77926f9 f9Var, int i) {
        C51018qv3 qv32;
        if (f9Var.f227347u == i && (qv32 = f9Var.f227345s) != null) {
            return qv32.f140574f.f257327a;
        }
        LinkedList<C77996sv3> linkedList = f9Var.f227344r;
        if (!(linkedList == null || f9Var.f227343q == null)) {
            Iterator<C77996sv3> it = linkedList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().f228225d == i) {
                    String f = m129007f(f9Var.f227343q.get(i2).f141175d);
                    int l = (int) C86013q1.m106451l(f);
                    if (l != 0 && l <= 1048576) {
                        return C86013q1.m106433O(f, 0, -1);
                    }
                    Log.m105920e("MicroMsg.BakUtil", "thumb not exist or  too big!");
                    return null;
                }
                i2++;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static boolean m129009h(C77926f9 f9Var, int i, String str) {
        C51018qv3 qv32;
        if (f9Var.f227347u != i || (qv32 = f9Var.f227345s) == null) {
            String d = m129005d(f9Var, i, (String) null);
            if (Util.isNullOrNil(d)) {
                return false;
            }
            C86013q1.m106442c(m129007f(d), str);
            return true;
        }
        byte[] bArr = qv32.f140574f.f257327a;
        if (bArr.length <= 0) {
            return false;
        }
        C86013q1.m106438T(str, bArr, 0, bArr.length);
        return true;
    }
}
