package com.tencent.p014mm.plugin.appbrand.appcache;

import android.database.Cursor;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.y1 */
public final class C29313y1 {
    /* renamed from: a */
    public static final List<String> m38622a(String str) {
        C87412m.m108594g(str, "appId");
        LinkedList linkedList = new LinkedList();
        C81161g2.requireAccountInitializedOnDemand();
        C81258h3 h3Var = C81161g2.f238471g;
        h3Var.getClass();
        Locale locale = Locale.ENGLISH;
        String format = String.format(locale, "%s =?", new Object[]{"appId"});
        String[] strArr = {str + '$' + ModulePkgInfo.PLUGIN_CODE};
        String format2 = String.format(locale, "select * from %s where %s", new Object[]{h3Var.mo113531o(), format});
        LinkedList<C29315z2> linkedList2 = new LinkedList<>();
        Cursor rawQuery = h3Var.f238664d.rawQuery(format2, strArr, 2);
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToFirst()) {
                    do {
                        C29315z2 z2Var = new C29315z2();
                        z2Var.convertFrom(rawQuery);
                        linkedList2.add(z2Var);
                    } while (rawQuery.moveToNext());
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        for (C29315z2 z2Var2 : linkedList2) {
            if (C81289m.C81290a.m99664b(z2Var2.field_debugType)) {
                String jo = ((C29233p3) C81161g2.Bx0(C29233p3.class)).mo56530jo(str, z2Var2.field_version);
                if (!(jo == null || jo.length() == 0)) {
                    linkedList.add('v' + jo + '(' + z2Var2.field_version + ')');
                }
            }
        }
        return linkedList;
        throw th;
    }
}
