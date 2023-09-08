package p417qz;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import hd0.C98398h0;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98426q0;
import java.util.ArrayList;
import p682rz.C101488s;
import p682rz.C101489t;
import p823sg.C101614i;

@C86522b
/* renamed from: qz.u */
public class C77460u extends C86301e implements C101488s {

    /* renamed from: d */
    public String f225888d = "";

    public C101489t Kj0() {
        return C98398h0.Bx0();
    }

    public void gh0(String str) {
        Log.m105924i("MicroMsg.VideoInfoFeatureService", "setForwardSnsId:" + str);
        this.f225888d = str;
    }

    public String kh0() {
        String str = this.f225888d;
        this.f225888d = "";
        Log.m105924i("MicroMsg.VideoInfoFeatureService", "popForwardSnsId:" + str);
        return str;
    }

    public String yr0(String str) {
        C101614i<String, ArrayList<C98408n0>> iVar = C98410o0.f288586c;
        return C98426q0.m127793a(str);
    }
}
