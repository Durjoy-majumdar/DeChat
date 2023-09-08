package db3;

import bb3.C92230i;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;

/* renamed from: db3.u */
public class C97478u {

    /* renamed from: a */
    public static final C97458b f286108a;

    /* renamed from: b */
    public static final C97466j f286109b;

    /* renamed from: c */
    public static final C97459c f286110c;

    /* renamed from: d */
    public static final C97468l f286111d;

    /* renamed from: e */
    public static final C97464h f286112e = new C97464h();

    /* renamed from: f */
    public static final ArrayList<C97477t> f286113f;

    static {
        C97458b bVar = new C97458b();
        f286108a = bVar;
        C97466j jVar = new C97466j();
        f286109b = jVar;
        C97459c cVar = new C97459c();
        f286110c = cVar;
        C97468l lVar = new C97468l();
        f286111d = lVar;
        ArrayList<C97477t> arrayList = new ArrayList<>();
        f286113f = arrayList;
        arrayList.add(bVar);
        arrayList.add(cVar);
        arrayList.add(lVar);
        arrayList.add(jVar);
    }

    /* renamed from: a */
    public static void m125553a(WXRTEditText wXRTEditText, C97471o oVar, C97477t... tVarArr) {
        int length = tVarArr.length;
        int i = 0;
        while (i < length) {
            if (oVar != tVarArr[i]) {
                i++;
            } else {
                return;
            }
        }
        oVar.mo136724f(wXRTEditText, (C92230i) null, null);
    }

    /* renamed from: b */
    public static void m125554b(WXRTEditText wXRTEditText, C97477t... tVarArr) {
        m125553a(wXRTEditText, f286112e, tVarArr);
        m125553a(wXRTEditText, f286110c, tVarArr);
        m125553a(wXRTEditText, f286111d, tVarArr);
        m125553a(wXRTEditText, f286109b, tVarArr);
    }
}
