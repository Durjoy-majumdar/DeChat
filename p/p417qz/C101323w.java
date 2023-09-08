package p417qz;

import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import hd0.C98385a0;
import hd0.C98391b0;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98429r0;
import java.util.ArrayList;
import java.util.Iterator;
import p206nj.C76861g;
import p682rz.C101485o;
import p682rz.C101491u;

@C86522b
/* renamed from: qz.w */
public class C101323w extends C86301e implements C101491u, C101485o {
    /* renamed from: FT */
    public int mo140797FT(String str) {
        return C98429r0.m127803I(str);
    }

    /* renamed from: HL */
    public int mo140798HL(long j) {
        Iterator it = ((ArrayList) C98398h0.Bx0().mo137722h(j)).iterator();
        while (it.hasNext()) {
            C98408n0 n0Var = (C98408n0) it.next();
            int i = n0Var.f288562i;
            n0Var.f288562i = 200;
            Log.m105918d("MicroMsg.VideoLogic", C76861g.m92660c() + "startSend file:" + n0Var.mo137700d() + " status:[" + i + "->" + n0Var.f288562i + "]");
            n0Var.f288565l = Util.nowSecond();
            n0Var.f288564k = Util.nowSecond();
            n0Var.f288548P = 3328;
            if (!C98429r0.m127808N(n0Var)) {
                Log.m105920e("MicroMsg.VideoLogic", "ERR on start MassSend:" + C76861g.m92660c() + " update failed: " + n0Var.mo137700d());
                return 0 - C76861g.m92658a();
            }
        }
        C98385a0 zx02 = C98398h0.zx0();
        zx02.getClass();
        C86709a0.m107525e().postToWorker(new C98391b0(zx02));
        return 0;
    }

    /* renamed from: IH */
    public boolean mo140799IH(C98408n0 n0Var, int i) {
        if (n0Var == null) {
            return false;
        }
        n0Var.f288537E = i;
        n0Var.f288548P = 268435456;
        return C98429r0.m127808N(n0Var);
    }

    /* renamed from: Ic */
    public int mo140800Ic(String str) {
        return C98429r0.m127805K(str);
    }

    public void Jm0(String str) {
        C98429r0.m127815f(str);
    }

    public int M00(String str) {
        return C98429r0.m127804J(str);
    }

    /* renamed from: PS */
    public boolean mo140803PS(String str, PInt pInt, PInt pInt2) {
        return C98429r0.m127821l(str, pInt, pInt2);
    }

    public boolean Tk0(String str, int i) {
        C98408n0 i2 = C98429r0.m127818i(str);
        if (i2 == null) {
            return false;
        }
        i2.f288537E = i;
        i2.f288548P = 268435456;
        return C98429r0.m127808N(i2);
    }

    public boolean We0(String str) {
        return C98429r0.m127799E(str);
    }

    /* renamed from: Zd */
    public C98408n0 mo140806Zd(String str) {
        return C98429r0.m127818i(str);
    }

    /* renamed from: aL */
    public boolean mo140807aL(Runnable runnable) {
        return C98398h0.m127698aL(runnable);
    }

    /* renamed from: fO */
    public boolean mo140808fO(Runnable runnable, long j) {
        return C98398h0.m127699fO(runnable, j);
    }

    /* renamed from: kU */
    public boolean mo140809kU(String str) {
        return C98429r0.m127812c(str);
    }
}
