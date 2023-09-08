package xy0;

import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import java.util.ArrayList;
import java.util.List;
import p158gt.C98201k;
import yy0.C102970a;
import z51.C102975i;

/* renamed from: xy0.f */
public class C102791f implements C102790e {
    /* renamed from: a */
    public List<C102970a> mo142536a(C72963f4 f4Var) {
        if (f4Var == null) {
            return null;
        }
        C92839m mVar = (C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi();
        C92836k uP = mVar.mo127198uP(f4Var);
        if (uP == null || uP.f267374a == 0) {
            Log.m105929w("MicroMsg.ImageMsgHandler", "%s can not get imgInfo", "image_" + hashCode());
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String TY = mVar.mo127174TY(uP.f267378e, "", "", true);
        C102789d.m135840a(arrayList, f4Var, TY, 20);
        String TY2 = mVar.mo127174TY(uP.f267380g, "", "", true);
        C102789d.m135840a(arrayList, f4Var, TY2, 21);
        String str = mVar.mo127174TY(uP.f267380g, "", "", true) + "hd";
        C102789d.m135840a(arrayList, f4Var, str, 22);
        String TY3 = mVar.mo127174TY(uP.f267379f, "", "", true);
        C102789d.m135840a(arrayList, f4Var, TY3, 26);
        C102975i iVar = (C102975i) C86312j.m106911c(C102975i.class);
        C102789d.m135840a(arrayList, f4Var, iVar.mo141702wt(TY), 27);
        C102789d.m135840a(arrayList, f4Var, iVar.mo141702wt(TY3), 28);
        if (uP.mo127145p()) {
            C92836k TO = mVar.mo127173TO(uP.f267390q);
            String TY4 = mVar.mo127174TY(TO.f267378e, "", "", true);
            if (!Util.isEqual(TY4, TY)) {
                C102789d.m135840a(arrayList, f4Var, TY4, 23);
            }
            String TY5 = mVar.mo127174TY(TO.f267380g, "", "", true);
            if (!Util.isEqual(TY5, TY2)) {
                C102789d.m135840a(arrayList, f4Var, TY5, 24);
            }
            String str2 = mVar.mo127174TY(TO.f267380g, "", "", true) + "hd";
            if (!Util.isEqual(str2, str)) {
                C102789d.m135840a(arrayList, f4Var, str2, 25);
            }
        }
        return arrayList;
    }
}
