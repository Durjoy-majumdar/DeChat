package h51;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h51.e */
public class C46012e {

    /* renamed from: a */
    public int f124081a;

    /* renamed from: b */
    public String f124082b;

    /* renamed from: c */
    public int f124083c;

    /* renamed from: d */
    public String f124084d;

    /* renamed from: e */
    public String f124085e;

    /* renamed from: f */
    public String f124086f;

    /* renamed from: g */
    public List<String> f124087g;

    /* renamed from: h */
    public long f124088h;

    /* renamed from: i */
    public String f124089i;

    /* renamed from: j */
    public int f124090j;

    /* renamed from: k */
    public String f124091k;

    /* renamed from: l */
    public String f124092l;

    /* renamed from: m */
    public String f124093m;

    /* renamed from: n */
    public String f124094n;

    /* renamed from: o */
    public String f124095o;

    /* renamed from: p */
    public int f124096p;

    /* renamed from: q */
    public String f124097q;

    /* renamed from: a */
    public static void m51292a(Context context, String str) {
        if (!Util.isNullOrNil(str)) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("search_history_href", 0);
            String string = sharedPreferences.getString("search_history_list", "");
            sharedPreferences.edit().putString("search_history_list", string.replace(Base64.encodeToString(str.getBytes(), 0) + ";", "")).commit();
        }
    }

    /* renamed from: b */
    public static List<C46012e> m51293b(Context context) {
        ArrayList arrayList = new ArrayList();
        String string = context.getSharedPreferences("search_history_href", 0).getString("search_history_list", "");
        if (Util.isNullOrNil(string)) {
            return arrayList;
        }
        int i = 0;
        for (String str : string.split(";")) {
            if (!Util.isNullOrNil(str)) {
                C46012e eVar = new C46012e();
                eVar.f124081a = 2;
                eVar.f124082b = new String(Base64.decode(str, 0));
                i++;
                eVar.f124090j = i;
                arrayList.add(eVar);
            }
        }
        if (!Util.isNullOrNil((List) arrayList)) {
            C46012e eVar2 = new C46012e();
            eVar2.f124081a = 1;
            arrayList.add(0, eVar2);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = ((h51.C46012e) r2).f124082b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof h51.C46012e
            if (r0 == 0) goto L_0x0012
            r0 = r2
            h51.e r0 = (h51.C46012e) r0
            java.lang.String r0 = r0.f124082b
            if (r0 == 0) goto L_0x0012
            java.lang.String r2 = r1.f124082b
            boolean r2 = r0.equals(r2)
            return r2
        L_0x0012:
            boolean r2 = super.equals(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h51.C46012e.equals(java.lang.Object):boolean");
    }
}
