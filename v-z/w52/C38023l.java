package w52;

import ad3.C67027a;
import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import di3.C86312j;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import p482cu.C30916b;
import y52.C79038a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: w52.l */
public class C38023l extends C86301e implements C30916b {

    /* renamed from: d */
    public C78518e f100529d;

    /* renamed from: e */
    public C53078f f100530e;

    public static C38023l vx0() {
        return (C38023l) C86312j.m106911c(C38023l.class);
    }

    public static C78518e wx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f100529d == null) {
            vx0().f100529d = new C78518e(C97625j3.m125812b().mo105909x());
        }
        return vx0().f100529d;
    }

    public static C53078f xx0() {
        if (vx0().f100530e == null) {
            vx0().f100530e = new C53078f();
        }
        return vx0().f100530e;
    }

    /* renamed from: r */
    public C67027a mo57886r(Context context, String str) {
        return new C79038a(context);
    }
}
