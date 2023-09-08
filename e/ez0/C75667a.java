package ez0;

import android.graphics.Bitmap;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import di3.C86312j;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import fz0.C98061b;
import p1081gi.C98121d;
import p158gt.C98201k;
import p206nj.C76861g;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ez0.a */
public class C75667a extends C86301e implements C98061b {
    /* renamed from: JX */
    public int mo106013JX(C68070l.C68072b bVar, String str, String str2, String str3, byte[] bArr) {
        return ((Integer) C72695v.m85052E(bVar, str, str2, str3, (String) null, bArr).first).intValue();
    }

    /* renamed from: y0 */
    public int mo106014y0(C68070l.C68072b bVar, String str, String str2, String str3, String str4, byte[] bArr, boolean z) {
        C72963f4 f4Var = new C72963f4();
        if (bArr != null && bArr.length > 0) {
            String zx02 = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).zx0(bArr, bVar.f195582i == 2, Bitmap.CompressFormat.PNG, false);
            if (!Util.isNullOrNil(zx02)) {
                f4Var.mo108739S2(zx02);
                Log.m105920e("MicroMsg.CardCompatService", "new thumbnail saved, path" + zx02);
            }
        }
        f4Var.mo108732L2(C68070l.C68072b.m80420s(bVar, (String) null, (C98121d) null));
        if (z) {
            f4Var.mo100991d(2);
        } else {
            f4Var.mo100991d(5);
        }
        f4Var.mo108749c3(str3);
        f4Var.mo108733M2(C75604z3.m90843o(str3));
        f4Var.mo108740T2(1);
        f4Var.setType(C72695v.m85070l(bVar));
        long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
        Log.m105918d("MicroMsg.CardCompatService", C76861g.m92660c() + " msginfo insert id: " + my02);
        if (my02 < 0) {
            Log.m105920e("MicroMsg.CardCompatService", C76861g.m92660c() + "insert msg failed :" + my02);
            return 0 - C76861g.m92658a();
        }
        Log.m105924i("MicroMsg.CardCompatService", C76861g.m92658a() + " new msg inserted to db , local id = " + my02);
        f4Var.setMsgId(my02);
        C68070l lVar = new C68070l();
        lVar.field_xml = f4Var.getContent();
        lVar.field_title = bVar.f195570f;
        lVar.field_type = bVar.f195582i;
        lVar.field_description = bVar.f195574g;
        lVar.field_msgId = my02;
        lVar.field_source = str2;
        C72709y1.Ax0().insert(lVar);
        return 0;
    }
}
