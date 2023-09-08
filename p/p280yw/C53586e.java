package p280yw;

import a70.C112760b;
import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.repairer.plc.RepairerLogFSC;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ei3.C86522b;
import ej2.C45659a;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.util.HashSet;
import o40.C61926c;
import p606mm.C47080g;
import p646pn.C110234e;
import z04.C119027c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yw.e */
public final class C53586e extends C98598e implements C47080g {
    public String Ax0() {
        String str = C112760b.m154239k() + "Repairer/";
        if (!C86013q1.m106450k(str)) {
            C86013q1.m106461v(str);
        }
        return str;
    }

    public String Kt0(String str, byte[] bArr, boolean z) {
        if (str == null || bArr == null) {
            return "";
        }
        C86009m1 m1Var = new C86009m1(Ax0() + str);
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "saveFile.absolutePath");
        C61926c.m72661F("RepairerConfigThread", new C16078d(i, bArr, z));
        String i2 = m1Var.mo119971i();
        C87412m.m108593f(i2, "saveFile.absolutePath");
        return i2;
    }

    /* renamed from: UH */
    public String mo72228UH(String str, C72996z1 z1Var) {
        if (str == null || z1Var == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("UIN:" + z1Var.f149503K + 10);
        stringBuffer.append("Username:" + z1Var.getUsername() + 10);
        stringBuffer.append("Alias:" + z1Var.mo62913l2() + 10);
        stringBuffer.append("ConRemark:" + z1Var.mo73969n2() + 10);
        stringBuffer.append("Nickname:" + z1Var.getNickname() + 10);
        stringBuffer.append("ConRemarkPYFull:" + z1Var.mo73970o2() + 10);
        stringBuffer.append("QuanPin:" + z1Var.mo62945z2() + 10);
        stringBuffer.append("Type:" + Integer.toBinaryString(z1Var.getType()) + 10);
        stringBuffer.append("UiType:" + Long.toBinaryString(z1Var.mo73951C2()) + 10);
        stringBuffer.append("VerifyFlag:" + Integer.toBinaryString(z1Var.mo73953E2()) + 10);
        stringBuffer.append("BizType:" + z1Var.f149511R0 + 10);
        stringBuffer.append("UsernameFlag:" + z1Var.mo73952D2() + 10);
        stringBuffer.append("ShowHead:" + z1Var.mo62845A2() + 10);
        StringBuilder sb = new StringBuilder();
        sb.append(Ax0());
        sb.append(str);
        C86009m1 m1Var = new C86009m1(sb.toString());
        String i = m1Var.mo119971i();
        C87412m.m108593f(i, "saveFile.absolutePath");
        String stringBuffer2 = stringBuffer.toString();
        C87412m.m108593f(stringBuffer2, "sb.toString()");
        byte[] bytes = stringBuffer2.getBytes(C119027c.f356488a);
        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
        C61926c.m72661F("RepairerConfigThread", new C16078d(i, bytes, true));
        String i2 = m1Var.mo119971i();
        C87412m.m108593f(i2, "saveFile.absolutePath");
        return i2;
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(RepairerLogFSC.class);
    }

    public void xx0(Context context) {
        C87412m.m108594g(context, "context");
        Class cls = C110234e.class;
        if (((C110234e) C86312j.m106911c(cls)).mo161399pY() != null) {
            ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149101T(25, C45659a.f123461s);
        }
    }

    public void zx0() {
        Class cls = C110234e.class;
        if (((C110234e) C86312j.m106911c(cls)).mo161399pY() != null) {
            ((C110234e) C86312j.m106911c(cls)).mo161399pY().mo149089G(25, C45659a.f123461s);
        }
    }
}
