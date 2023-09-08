package yz2;

import android.text.TextUtils;
import b03.C39696f;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import hz2.C60235a;
import hz2.C60236c;
import java.util.LinkedList;
import qy2.C77455o;
import rz2.C48201c;
import uz2.C52678e0;
import uz2.C65488a0;

/* renamed from: yz2.c */
public final class C79224c {
    /* renamed from: a */
    public static final boolean m95929a(C52678e0 e0Var, C52678e0 e0Var2) {
        C87412m.m108594g(e0Var, "<this>");
        if (e0Var2 == null || !C87412m.m108589b(C60235a.m70504d(e0Var), C60235a.m70504d(e0Var2))) {
            return false;
        }
        LinkedList<C65488a0> linkedList = e0Var2.f147090g;
        if (!(linkedList != null && C60236c.m70511a(linkedList, e0Var.f147090g))) {
            return false;
        }
        return C60236c.m70511a(C60235a.m70502b(e0Var2), C60235a.m70502b(e0Var));
    }

    /* renamed from: b */
    public static final boolean m95930b(C48201c cVar, C77455o oVar) {
        boolean z;
        String str = cVar != null ? cVar.field_UserName : null;
        if (str == null) {
            str = "";
        }
        if (C86013q1.m106450k(C39696f.f106501a.mo62321d("thumb", str))) {
            z = true;
        } else {
            boolean z2 = false;
            if (!(oVar != null && oVar.mo84146j()) && cVar != null && TextUtils.isEmpty(cVar.field_MediaThumbUrl)) {
                z2 = true;
            }
            z = !z2;
        }
        return !z;
    }
}
