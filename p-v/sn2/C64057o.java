package sn2;

import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C97625j3;
import java.io.IOException;
import qc0.C101106m;
import sf0.C48374j0;
import te3.C50874pt2;
import te3.C64672r34;
import tn2.C78073b;

/* renamed from: sn2.o */
public class C64057o {
    /* renamed from: a */
    public static C101106m m75410a(C50874pt2 pt22) {
        if (pt22 == null) {
            return null;
        }
        try {
            C101106m mVar = new C101106m();
            mVar.f295972t = "wx5aa333606550dfd5";
            mVar.f295959d = 4;
            mVar.f295960e = String.valueOf(pt22.f139954e);
            mVar.f295961f = (float) pt22.f139970x;
            mVar.f295964i = pt22.f139958i;
            mVar.f295969q = pt22.f139968v;
            mVar.f295962g = pt22.f139956g;
            mVar.f295963h = pt22.f139957h;
            mVar.f295968p = pt22.f139967u;
            String str = pt22.f139963q;
            mVar.f295966n = str;
            mVar.f295967o = str;
            mVar.f295954P = pt22.f139955f;
            String str2 = pt22.f139960n;
            if (str2 == null) {
                str2 = "";
            }
            mVar.f295965j = str2;
            String str3 = pt22.f139961o;
            if (str3 == null) {
                str3 = "";
            }
            mVar.f295976x = str3;
            mVar.f295958T = true;
            return mVar;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ShakeMusicLogic", e, "", new Object[0]);
            Log.m105928w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
            return null;
        }
    }

    /* renamed from: b */
    public static C101106m m75411b(byte[] bArr, long j) {
        if (bArr != null && bArr.length > 0) {
            try {
                C64672r34 r342 = (C64672r34) new C64672r34().parseFrom(bArr);
                C101106m mVar = new C101106m();
                mVar.f295959d = 4;
                mVar.f295960e = String.valueOf(r342.f185107e);
                mVar.f295961f = r342.f185108f;
                mVar.f295964i = C48374j0.m53717f(r342.f185111i);
                String f = C48374j0.m53717f(r342.f185112j);
                mVar.f295965j = f;
                mVar.f295970r = C78073b.m94203b(f);
                mVar.f295969q = C48374j0.m53717f(r342.f185116q);
                mVar.f295962g = C48374j0.m53717f(r342.f185109g);
                mVar.f295963h = C48374j0.m53717f(r342.f185110h);
                mVar.f295968p = C48374j0.m53717f(r342.f185115p);
                mVar.f295966n = C48374j0.m53717f(r342.f185113n);
                mVar.f295967o = C48374j0.m53717f(r342.f185114o);
                return mVar;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ShakeMusicLogic", e, "", new Object[0]);
                Log.m105928w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m75412c() {
        if (!C97625j3.m125811a()) {
            Log.m105928w("MicroMsg.ShakeMusicLogic", "getSaveDirPath: acc stg has not set uin");
            return null;
        }
        C86009m1 m1Var = new C86009m1(C97625j3.m125812b().mo105891f() + "shakemusic/");
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            Log.m105929w("MicroMsg.ShakeMusicLogic", "storage dir[%s] not perpare, try to create it", m1Var.mo119971i());
            m1Var.mo119987x();
        }
        C86009m1 m1Var2 = new C86009m1(m1Var, FilePathGenerator.NO_MEDIA_FILENAME);
        if (!m1Var2.mo119967g()) {
            Log.m105929w("MicroMsg.ShakeMusicLogic", "no media file[%s] not exists, try to create it", m1Var.mo119971i());
            try {
                m1Var2.mo119964e();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.ShakeMusicLogic", e, "", new Object[0]);
            }
        }
        if (!m1Var.mo119967g()) {
            Log.m105928w("MicroMsg.ShakeMusicLogic", "create storage dir fail");
            return null;
        }
        return m1Var.mo119971i() + "/";
    }
}
