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
import java.util.List;
import p158gt.C98201k;
import yy0.C102970a;

/* renamed from: xy0.b */
public class C102787b implements C102790e {
    /* renamed from: a */
    public List<C102970a> mo142536a(C72963f4 f4Var) {
        if (f4Var == null) {
            return null;
        }
        String processXml = Util.processXml(f4Var.getContent());
        C68070l.C68072b u = processXml != null ? C68070l.C68072b.m80422u(processXml, (String) null) : null;
        if (u == null) {
            Log.m105920e("MicroMsg.AppMsgImgMsgHandler", "content is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        C72683d qq = C72709y1.vx0().mo100154qq(u.f195606o);
        if (qq != null) {
            C102789d.m135840a(arrayList, f4Var, qq.field_fileFullPath, 30);
        }
        C102789d.m135840a(arrayList, f4Var, ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).v10(f4Var.mo108765s2(), true), 31);
        return arrayList;
    }
}
