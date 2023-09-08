package xy0;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p158gt.C98201k;
import qg2.C101147j0;
import te3.C101834rc0;
import te3.C77915dp3;
import yy0.C102970a;

/* renamed from: xy0.c */
public class C102788c implements C102790e {
    /* renamed from: a */
    public List<C102970a> mo142536a(C72963f4 f4Var) {
        if (f4Var == null) {
            return null;
        }
        String processXml = Util.processXml(f4Var.getContent());
        C68070l.C68072b u = processXml != null ? C68070l.C68072b.m80422u(processXml, (String) null) : null;
        if (u == null) {
            Log.m105920e("MicroMsg.AppMsgMsgHandler", "content is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = u.f195582i;
        if (i == 2) {
            C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
            if (qq != null) {
                C102789d.m135840a(arrayList, f4Var, qq.field_fileFullPath, 30);
            }
            mo142537b(arrayList, f4Var, 31);
        } else if (i == 19 || i == 24) {
            mo142538c(arrayList, i == 24 ? 41 : 39, f4Var, u.f195571f0);
        } else if (i == 6) {
            C72683d qq4 = C72709y1.vx0().mo100154qq(u.f195606o);
            if (qq4 != null) {
                C102789d.m135840a(arrayList, f4Var, qq4.field_fileFullPath, 34);
            }
            mo142537b(arrayList, f4Var, 35);
        } else if (i == 7) {
            C72683d qq5 = C72709y1.vx0().mo100154qq(u.f195606o);
            if (qq5 != null) {
                C102789d.m135840a(arrayList, f4Var, qq5.field_fileFullPath, 32);
            }
            mo142537b(arrayList, f4Var, 33);
        } else if (Util.isNullOrNil(f4Var.mo108765s2())) {
            return null;
        } else {
            mo142537b(arrayList, f4Var, 38);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo142537b(List<C102970a> list, C72963f4 f4Var, int i) {
        String v102 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true);
        if (v102 != null) {
            C102789d.m135840a(list, f4Var, v102, i);
        }
    }

    /* renamed from: c */
    public final void mo142538c(List<C102970a> list, int i, C72963f4 f4Var, String str) {
        C77915dp3 x = C101147j0.m132643x(str);
        if (x != null) {
            Iterator<C101834rc0> it = x.f227155f.iterator();
            while (it.hasNext()) {
                C101834rc0 next = it.next();
                if (next.f299258I == 17) {
                    mo142538c(list, i, f4Var, next.f299326s1);
                } else {
                    C102789d.m135840a(list, f4Var, C101147j0.m132636q(next, f4Var.getMsgId(), 1), i);
                    C102789d.m135840a(list, f4Var, C101147j0.m132611D(next, f4Var.getMsgId(), 1), i + 1);
                }
            }
        }
    }
}
