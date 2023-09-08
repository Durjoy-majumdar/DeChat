package qg2;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31543z5;
import gy3.C87412m;
import hc3.C27313m;
import hc3.C27403q0;
import hc3.C27421t0;
import hc3.C27441w0;
import hc3.C98343d;
import hc3.C98347f1;
import hc3.C98377x1;
import hc3.C98381z0;
import java.util.List;
import te3.C64258bf0;
import te3.C64609ok1;
import te3.C64730tk1;
import z04.C112551y;
import z04.C66723k;

/* renamed from: qg2.q0 */
public final class C101164q0 {
    /* renamed from: a */
    public static final void m132675a(C98381z0 z0Var) {
        C98381z0 A;
        C87412m.m108594g(z0Var, "infoItem");
        for (C27313m mVar : z0Var.mo54699M()) {
            if (mVar.mo54546G().length() < 32) {
                String n = C101147j0.m132633n(mVar.toString(), mVar.mo54549J());
                C87412m.m108593f(n, "genDataId(it.toString(), it.dataType)");
                mVar.mo54559T(n);
            }
            C98377x1 C0 = mVar.mo54915C0();
            if (!(C0 == null || (A = C0.mo137667A()) == null)) {
                m132675a(A);
            }
        }
    }

    /* renamed from: b */
    public static final C27441w0 m132676b(C64730tk1 tk12) {
        C87412m.m108594g(tk12, "<this>");
        C27441w0 w0Var = new C27441w0();
        String str = tk12.f185603d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        w0Var.f76099f = str;
        w0Var.f76100g = tk12.f185604e;
        String str3 = tk12.f185605f;
        if (str3 == null) {
            str3 = str2;
        }
        w0Var.f76101h = str3;
        String str4 = tk12.f185606g;
        if (str4 == null) {
            str4 = str2;
        }
        w0Var.f76102i = str4;
        String str5 = tk12.f185608i;
        if (str5 == null) {
            str5 = str2;
        }
        w0Var.f76103j = str5;
        C64609ok1 ok12 = tk12.f185607h;
        if (ok12 != null) {
            C27421t0 t0Var = new C27421t0();
            String str6 = ok12.f184668d;
            if (str6 == null) {
                str6 = str2;
            }
            t0Var.f76054f = str6;
            t0Var.f76055g = ok12.f184669e;
            t0Var.f76056h = ok12.f184670f;
            w0Var.f76104k = t0Var;
        }
        C64258bf0 bf02 = tk12.f185609j;
        if (bf02 != null) {
            C27403q0 q0Var = new C27403q0();
            String str7 = bf02.f182280d;
            if (str7 == null) {
                str7 = str2;
            }
            q0Var.f76011f = str7;
            String str8 = bf02.f182281e;
            if (str8 == null) {
                str8 = str2;
            }
            q0Var.f76012g = str8;
            String str9 = bf02.f182282f;
            if (str9 == null) {
                str9 = str2;
            }
            q0Var.f76013h = str9;
            q0Var.f76014i = bf02.f182284h;
            String str10 = bf02.f182285i;
            if (str10 != null) {
                str2 = str10;
            }
            q0Var.f76015j = str2;
            w0Var.f76105l = q0Var;
        }
        return w0Var;
    }

    /* renamed from: c */
    public static final C98347f1 m132677c(C68070l.C68072b bVar) {
        C87412m.m108594g(bVar, "<this>");
        C98347f1 f1Var = new C98347f1();
        C98343d dVar = new C98343d();
        String str = bVar.f195562d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        dVar.f74635f = str;
        dVar.f74636g = bVar.f195566e;
        String str3 = bVar.f195570f;
        if (str3 == null) {
            str3 = str2;
        }
        dVar.f74637h = str3;
        String str4 = bVar.f195574g;
        if (str4 == null) {
            str4 = str2;
        }
        dVar.f74638i = str4;
        String str5 = bVar.f195591k0;
        if (str5 == null) {
            str5 = str2;
        }
        dVar.f74639j = str5;
        String str6 = bVar.f195578h;
        if (str6 == null) {
            str6 = str2;
        }
        dVar.f74640k = str6;
        dVar.f74641l = bVar.f195582i;
        dVar.f74642m = bVar.f195492H;
        String str7 = bVar.f195598m;
        if (str7 == null) {
            str7 = str2;
        }
        dVar.f74643n = str7;
        String str8 = bVar.f195586j;
        if (str8 == null) {
            str8 = str2;
        }
        dVar.f74644o = str8;
        String str9 = bVar.f195571f0;
        if (str9 != null) {
            str2 = str9;
        }
        dVar.f288263p = str2;
        f1Var.f288296f = dVar;
        return f1Var;
    }

    /* renamed from: d */
    public static final String m132678d(int i, String str, boolean z, String str2) {
        String str3;
        String str4 = "";
        if ((str2 == null || C112551y.m153811k(str2)) || str == null) {
            return str4;
        }
        try {
            if (!C72996z1.m85820U5(str) || z) {
                str3 = str2;
            } else {
                List<String> e = new C66723k("\n").mo90760e(str2, 2);
                str4 = e.get(0) + 10;
                str3 = e.get(1);
            }
            return str4 + m132679e(i, str3);
        } catch (Exception e2) {
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(i);
            int length = str2.length();
            if (length > 500) {
                length = 500;
            }
            objArr[1] = str2.subSequence(0, length);
            Log.printErrStackTrace("MicroMsg.Xml.RecordSerializeUtil", e2, "trimMsgContentRecordXml source:%s originXml:%s", objArr);
            return str2;
        }
    }

    /* renamed from: e */
    public static final String m132679e(int i, String str) {
        long c = C31543z5.m39453c();
        if (str == null || C112551y.m153811k(str)) {
            return "";
        }
        int length = str.length();
        C98343d dVar = new C98343d();
        dVar.mo141099d(str);
        C98381z0 z0Var = new C98381z0();
        z0Var.mo141099d(dVar.mo54768U());
        m132675a(z0Var);
        dVar.mo54769V(z0Var.mo141118z());
        String z = dVar.mo141118z();
        int length2 = z.length();
        long c2 = C31543z5.m39453c();
        Log.m105925i("MicroMsg.Xml.RecordSerializeUtil", "trim record xml source:" + i + " before:" + length + " after:" + length2 + " trimPer: %.02f cost:" + (c2 - c), Float.valueOf((((float) (length - length2)) * 100.0f) / ((float) length)));
        return z;
    }
}
