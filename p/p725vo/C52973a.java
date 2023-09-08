package p725vo;

import a11.C39479c;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import eb0.C45612m0;
import eb0.C75592q0;
import ei3.C86522b;
import f40.C86709a0;
import java.util.List;
import p740wo.C53193b;
import te3.C51866wq2;

@C86522b
/* renamed from: vo.a */
public class C52973a extends C86301e implements C53193b {
    /* renamed from: AO */
    public boolean mo73721AO(String str, boolean z) {
        return C45612m0.m50705v(str, z);
    }

    public boolean Go0(String str) {
        return !Util.isNullOrNil(str) && C72996z1.m85820U5(str) && ((C39479c) C86709a0.m107533q(C39479c.class)).mo62086r1(str);
    }

    /* renamed from: Hd */
    public boolean mo73723Hd(String str) {
        return C45612m0.m50706w(str);
    }

    public boolean Z60(String str) {
        return C45612m0.m50703t(str);
    }

    /* renamed from: eL */
    public boolean mo73725eL(String str) {
        return !Util.isNullOrNil(str) && C72996z1.m85820U5(str) && !C45612m0.m50705v(str, false);
    }

    public boolean i90(String str) {
        return C45612m0.m50705v(str, false);
    }

    /* renamed from: k5 */
    public List<String> mo73727k5(String str) {
        return C45612m0.m50695l(str);
    }

    /* renamed from: mX */
    public List<String> mo73728mX(String str) {
        return C45612m0.m50696m(str);
    }

    /* renamed from: p1 */
    public int mo73729p1(String str) {
        if (Util.isNullOrNil(str)) {
            return 0;
        }
        return C45612m0.m50697n(str);
    }

    /* renamed from: sj */
    public boolean mo73730sj(String str) {
        C51866wq2 wq22 = C45612m0.f123381a;
        String qq = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69809qq(str);
        String s = C75592q0.m90789s();
        return !Util.isNullOrNil(qq) && !Util.isNullOrNil(s) && qq.equals(s);
    }
}
