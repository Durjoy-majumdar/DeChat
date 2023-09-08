package ht1;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C72916m;
import com.tencent.p014mm.sdk.platformtools.Util;
import te3.C64719t23;

/* renamed from: ht1.v5 */
public final class C60212v5 {
    /* renamed from: a */
    public static final boolean m70422a(C64719t23 t232) {
        if (t232 == null) {
            return true;
        }
        String str = t232.f185459d;
        if (str == null || str.length() == 0) {
            String str2 = t232.f185460e;
            if (str2 == null || str2.length() == 0) {
                String str3 = t232.f185463h;
                if (str3 == null || str3.length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final C64719t23 m70423b(C68070l.C68072b bVar, C72916m mVar) {
        if (mVar == null || bVar == null) {
            return null;
        }
        C64719t23 t232 = new C64719t23();
        t232.f185459d = mVar.f212521d;
        t232.f185460e = mVar.f212522e;
        t232.f185461f = mVar.f212523f;
        t232.f185462g = mVar.f212524g;
        String str = mVar.f212525h;
        if (!(str == null || str.length() == 0)) {
            t232.f185463h = mVar.f212525h;
        } else {
            t232.f185463h = bVar.f195574g;
        }
        t232.f185464i = mVar.f212526i;
        t232.f185466n = mVar.f212527j;
        t232.f185467o = Util.safeParseLong(mVar.f212528k);
        t232.f185468p = mVar.f212529l;
        t232.f185465j = bVar.f195542X;
        t232.f185469q = mVar.f212531n;
        t232.f185471s = mVar.f212532o;
        t232.f185470r = mVar.f212533p;
        t232.f185473u = bVar.f195570f;
        t232.f185474v = mVar.f212520c;
        t232.f185475w = mVar.f212519b;
        return t232;
    }
}
