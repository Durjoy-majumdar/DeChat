package k32;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.LinkedList;
import m32.C76741b;
import m32.C76744d;
import ob0.C89132b;
import te3.C64754ul3;

/* renamed from: k32.g */
public abstract class C76489g<T> implements C87581a<Void, T> {
    public Object call(Object obj) {
        C76744d.C76745a aVar = (C76744d.C76745a) this;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        C76744d dVar = C76744d.this;
        dVar.f224513e = false;
        if (dVar.f224509a == null) {
            Log.m105920e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB got its response. but ui is destroyed.");
            return null;
        }
        int i = cVar.f256793a;
        if (i == 0 && cVar.f256794b == 0) {
            C64754ul3 ul32 = (C64754ul3) cVar.f256796d;
            int i2 = ul32.f185778x;
            if (i2 != 0) {
                Log.m105921e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB error wxahb_status = [%d] errorwording = [%s]", Integer.valueOf(i2), ((C64754ul3) cVar.f256796d).f185779y);
                C76744d dVar2 = C76744d.this;
                String str = ((C64754ul3) cVar.f256796d).f185779y;
                Intent putExtra = new Intent().putExtra("result_error_code", -1);
                Intent putExtra2 = putExtra.putExtra("result_error_msg", "fail:system error {{service error query red packet fail errStatus = " + ((C64754ul3) cVar.f256796d).f185778x + ",errMsg" + ((C64754ul3) cVar.f256796d).f185779y + "}}");
                C76741b bVar = dVar2.f224509a;
                if (bVar == null) {
                    Log.m105920e("MicroMsg.WxaLuckyMoneyLogicDetail", "fail ui == null");
                    return null;
                }
                bVar.mo95258s1();
                dVar2.f224509a.error(str);
                dVar2.f224509a.mo95254b5(putExtra2);
                return null;
            }
            Log.m105925i("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB succeed. hasmore = [%b] rcvd_user_list.size() = [%d], currentlist.size = [%d]", Integer.valueOf(ul32.f185774t), Integer.valueOf(((C64754ul3) cVar.f256796d).f185767j.size()), Integer.valueOf(((LinkedList) C76744d.this.f224514f).size()));
            C76744d dVar3 = C76744d.this;
            C64754ul3 ul33 = (C64754ul3) cVar.f256796d;
            dVar3.f224512d = ul33.f185774t;
            ((LinkedList) dVar3.f224514f).addAll(ul33.f185767j);
            C76744d.this.f224509a.mo95258s1();
            if (aVar.f224515a == 0) {
                C76744d.this.f224509a.mo95257r2((C64754ul3) cVar.f256796d);
                return null;
            }
            C76744d dVar4 = C76744d.this;
            dVar4.f224509a.mo95252Q4(dVar4.f224512d, ((C64754ul3) cVar.f256796d).f185767j, dVar4.f224514f);
            return null;
        }
        Log.m105921e("MicroMsg.WxaLuckyMoneyLogicDetail", "CgiQueryWxaHB failed [%d, %d, %s]", Integer.valueOf(i), Integer.valueOf(cVar.f256794b), cVar.f256795c);
        C76744d dVar5 = C76744d.this;
        String str2 = cVar.f256795c;
        Intent putExtra3 = new Intent().putExtra("result_error_code", -1);
        Intent putExtra4 = putExtra3.putExtra("result_error_msg", "fail:system error {{service error query errType = " + cVar.f256793a + ",errCode" + cVar.f256794b + "}}");
        C76741b bVar2 = dVar5.f224509a;
        if (bVar2 == null) {
            Log.m105920e("MicroMsg.WxaLuckyMoneyLogicDetail", "fail ui == null");
            return null;
        }
        bVar2.mo95258s1();
        dVar5.f224509a.error(str2);
        dVar5.f224509a.mo95254b5(putExtra4);
        return null;
    }
}
