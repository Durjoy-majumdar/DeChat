package w21;

import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import java.util.ArrayList;
import u21.C101955g;

/* renamed from: w21.u */
public class C102324u {

    /* renamed from: a */
    public static final C102304b f301362a;

    /* renamed from: b */
    public static final C102321r f301363b;

    /* renamed from: c */
    public static final C102305c f301364c;

    /* renamed from: d */
    public static final C102312j f301365d;

    /* renamed from: e */
    public static final C102311i f301366e = new C102311i();

    /* renamed from: f */
    public static final ArrayList<C102323t> f301367f;

    static {
        C102304b bVar = new C102304b();
        f301362a = bVar;
        C102321r rVar = new C102321r();
        f301363b = rVar;
        C102305c cVar = new C102305c();
        f301364c = cVar;
        C102312j jVar = new C102312j();
        f301365d = jVar;
        ArrayList<C102323t> arrayList = new ArrayList<>();
        f301367f = arrayList;
        arrayList.add(bVar);
        arrayList.add(cVar);
        arrayList.add(jVar);
        arrayList.add(rVar);
    }

    /* renamed from: a */
    public static void m134967a(WXRTEditText wXRTEditText, C102315m mVar, C102323t... tVarArr) {
        int length = tVarArr.length;
        int i = 0;
        while (i < length) {
            if (mVar != tVarArr[i]) {
                i++;
            } else {
                return;
            }
        }
        mVar.mo141855f(wXRTEditText, (C101955g) null, null);
    }

    /* renamed from: b */
    public static void m134968b(WXRTEditText wXRTEditText, C102323t... tVarArr) {
        m134967a(wXRTEditText, f301366e, tVarArr);
        m134967a(wXRTEditText, f301364c, tVarArr);
        m134967a(wXRTEditText, f301365d, tVarArr);
        m134967a(wXRTEditText, f301363b, tVarArr);
    }
}
