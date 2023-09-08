package ma3;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import java.util.HashMap;
import la3.C117468g;
import la3.C117470l;
import na3.C88908g;
import ra3.C118229a;
import tc0.C77885p;
import te3.C64585nm2;
import te3.C64611om2;

@C86522b(creator = C117544e.class, onProcess = {C80625v0.MATCH_MM})
/* renamed from: ma3.e */
public class C117544e extends C86301e implements C88908g {
    public C117544e(Context context) {
        new HashMap();
    }

    public boolean Ib0(String str) {
        C118229a b = C117468g.f351552c.mo182173b(str);
        StringBuilder sb = new StringBuilder();
        sb.append("hitExp ");
        sb.append(str);
        sb.append(", ");
        sb.append(b.mo183028q2());
        Log.m105924i("LabAppLifeService", sb.toString());
        return b.mo183028q2();
    }

    /* renamed from: c8 */
    public int mo123292c8(String str) {
        return C117468g.f351552c.mo182173b(str).field_WeAppDebugMode;
    }

    public void o20(String str, boolean z) {
        Log.m105924i("LabAppLifeService", "switchEntry " + str + "," + z);
        C117468g gVar = C117468g.f351552c;
        C118229a b = gVar.mo182173b(str);
        int i = 1;
        int i2 = z ? 2 : 1;
        if (b.field_Switch != i2) {
            b.field_Switch = i2;
            gVar.mo182174c().update(b, new String[0]);
            C64611om2 om22 = new C64611om2();
            C64585nm2 nm22 = new C64585nm2();
            nm22.f184497d = b.field_bItemFromXExpt == 1 ? 0 : Util.safeParseInt(b.field_expId);
            nm22.f184498e = b.field_LabsAppId;
            if (b.field_Switch != 2) {
                i = 2;
            }
            nm22.f184499f = i;
            om22.f184677d.add(nm22);
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(207, om22));
            C117470l.m165698a(str, b.field_Switch == 2 ? 4 : 5, false);
        }
    }

    public void open(String str) {
        C118229a b = C117468g.f351552c.mo182173b(str);
        C117470l.C117471a aVar = new C117470l.C117471a();
        aVar.f351555a = str;
        aVar.f351556b = b.field_expId;
        aVar.f351558d = System.currentTimeMillis();
        aVar.f351557c = 3;
        C117470l.m165699b(aVar);
    }

    /* renamed from: sB */
    public String mo123295sB(String str) {
        return C117468g.f351552c.mo182173b(str).field_WeAppUser;
    }

    /* renamed from: x */
    public boolean mo123296x(String str) {
        if (C117468g.f351552c.mo182173b(str).field_Switch == 2) {
            Log.m105925i("LabAppLifeService", "appid %s is open ", str);
            return true;
        }
        Log.m105925i("LabAppLifeService", "appid %s is close", str);
        return false;
    }

    public boolean xl0(String str) {
        C118229a b = C117468g.f351552c.mo182173b(str);
        StringBuilder sb = new StringBuilder();
        sb.append("isOnline ");
        sb.append(str);
        sb.append(", ");
        sb.append(b.mo183027p2());
        Log.m105924i("LabAppLifeService", sb.toString());
        return b.mo183027p2();
    }
}
