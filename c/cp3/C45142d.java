package cp3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;

/* renamed from: cp3.d */
public class C45142d {
    /* renamed from: a */
    public static void m49970a(String str) {
        C86009m1[] u;
        Log.m105925i("MicroMsg.MMPhotoEditUtil", "[deleteDirAllFile] dir:%s", str);
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && (u = m1Var.mo119984u()) != null) {
            for (C86009m1 m1Var2 : u) {
                if (m1Var2.mo119978p() && !Util.isNullOrNil(m1Var2.getName()) && m1Var2.getName().startsWith("wx_photo_edit_")) {
                    m1Var2.mo119966f();
                }
            }
        }
    }

    /* renamed from: b */
    public static int m49971b(float f) {
        return (int) ((f * MMApplicationContext.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }
}
