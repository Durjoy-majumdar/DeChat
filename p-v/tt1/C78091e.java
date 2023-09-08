package tt1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import st1.C77761h0;

/* renamed from: tt1.e */
public class C78091e {

    /* renamed from: a */
    public int f228890a = -1;

    /* renamed from: b */
    public int f228891b = 0;

    /* renamed from: c */
    public C78089c f228892c;

    /* renamed from: d */
    public boolean f228893d = false;

    /* renamed from: a */
    public static C78091e m94238a(C78089c cVar) {
        C78091e eVar = new C78091e();
        eVar.f228892c = cVar;
        int i = cVar.f228884a;
        if (i == 0) {
            eVar.f228890a = 0;
        } else if (i == 2002) {
            eVar.f228890a = 1;
        } else if (i == 2007 || i == 10308 || i == 2004 || i == 2005 || i == 2009 || i == 2010) {
            eVar.f228890a = 2;
            MMApplicationContext.getContext().getString(C0966R.string.jle);
            int i2 = cVar.f228884a;
            if (i2 == 10308) {
                MMApplicationContext.getContext().getString(C0966R.string.jlf);
            } else if (i2 == 2007) {
                C77761h0.IML.f226592f = true;
                eVar.f228893d = true;
            } else if (i2 == 2005) {
                MMApplicationContext.getContext().getString(C0966R.string.jlh);
            }
        }
        return eVar;
    }
}
