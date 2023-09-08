package ac3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import p490dl.C97484a;
import p523fp.C32147e;
import z04.C112551y;

/* renamed from: ac3.c1 */
public final class C91990c1 {

    /* renamed from: a */
    public static final C91990c1 f263329a = new C91990c1();

    /* renamed from: a */
    public final boolean mo125826a() {
        C91996t0 t0Var = C91992q0.f263342l;
        if (!t0Var.mo125839h()) {
            Log.m105928w("MicroMsg.WeVisModelResMgr", "checkModelConfig: list is invalid");
            return false;
        }
        LinkedList linkedList = new LinkedList();
        boolean z = true;
        for (C91995s0 s0Var : t0Var.f263356d) {
            if (!(s0Var.f263349d == s0Var.f263352g)) {
                z = false;
            }
            if ((s0Var.f263351f.length() == 0) || !C87412m.m108589b(s0Var.f263351f, s0Var.f263353h)) {
                Log.m105924i("MicroMsg.WeVisModelResMgr", "modelNeedUpdate " + s0Var.f263347b);
                String AD = ((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(101, s0Var.f263348c);
                if (C86013q1.m106450k(AD)) {
                    f263329a.mo125827b(s0Var.f263348c, AD);
                    C91992q0.f263331a.mo125830d(s0Var);
                }
                if ((s0Var.f263351f.length() == 0) || !C87412m.m108589b(s0Var.f263351f, s0Var.f263353h)) {
                    Log.m105924i("MicroMsg.WeVisModelResMgr", "checkModelConfig cache invalid " + s0Var.f263347b);
                    linkedList.add(s0Var.f263347b);
                }
            }
        }
        if (linkedList.size() > 0) {
            Log.m105924i("MicroMsg.WeVisModelResMgr", "checkModelConfig: check update " + linkedList);
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo125827b(int i, String str) {
        String str2;
        T t;
        C86001b0 b0Var;
        boolean z;
        if (str == null) {
            Log.m105928w("MicroMsg.WeVisModelResMgr", "unzipModelRes: " + i + "; path is null");
            return false;
        }
        C91992q0 q0Var = C91992q0.f263331a;
        String str3 = C91992q0.f263335e;
        C86013q1.m106445f(str3);
        C86013q1.m106461v(str3);
        int R = C86013q1.m106436R(str, str3);
        if (R != 0) {
            Log.m105928w("MicroMsg.WeVisModelResMgr", "unzipModelRes: unzip failed " + R);
            return false;
        }
        Iterator<T> it = C91992q0.f263342l.f263356d.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C91995s0) t).f263348c == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C91995s0 s0Var = (C91995s0) t;
        String h = s0Var != null ? s0Var.mo125837h() : null;
        if (h == null) {
            Iterable<C86001b0> t2 = C86013q1.m106459t(str3, false);
            if (t2 != null) {
                Iterator<C86001b0> it4 = t2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        b0Var = null;
                        break;
                    }
                    b0Var = it4.next();
                    String str4 = b0Var.f250472b;
                    C87412m.m108593f(str4, "it.name");
                    if (C112551y.m153808h(str4, ".xml", false, 2, (Object) null)) {
                        break;
                    }
                }
                C86001b0 b0Var2 = b0Var;
                if (b0Var2 != null) {
                    str2 = b0Var2.f250472b;
                }
            }
            h = str2;
        }
        if (h == null) {
            Log.m105928w("MicroMsg.WeVisModelResMgr", "unzipModelRes: no config file name");
            return false;
        }
        C91995s0 s0Var2 = new C91995s0();
        C97484a.f286123a.mo136755a(str3 + XVFSFile.SEPARATOR_CHAR + h, s0Var2);
        if (s0Var == null || s0Var2.f263349d == s0Var.f263352g) {
            if (s0Var2.f263347b.length() == 0) {
                Log.m105928w("MicroMsg.WeVisModelResMgr", "unzipModelRes: key is empty");
                return false;
            }
            C103352e1 e1Var = C103352e1.f304762a;
            String b = e1Var.mo143215b(str3 + XVFSFile.SEPARATOR_CHAR + s0Var2.f263350e);
            if (Util.isEqual(b, s0Var2.f263351f)) {
                if (s0Var != null) {
                    if (s0Var.f263350e.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        C91992q0 q0Var2 = C91992q0.f263331a;
                        sb.append(C91992q0.f263334d);
                        sb.append(XVFSFile.SEPARATOR_CHAR);
                        sb.append(s0Var.f263350e);
                        C86013q1.m106447h(sb.toString());
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                C91992q0 q0Var3 = C91992q0.f263331a;
                String str5 = C91992q0.f263334d;
                sb4.append(str5);
                sb4.append(XVFSFile.SEPARATOR_CHAR);
                sb4.append(s0Var2.f263350e);
                C86013q1.m106463x(str3 + XVFSFile.SEPARATOR_CHAR + s0Var2.f263350e, sb4.toString());
                C86013q1.m106463x(str3 + XVFSFile.SEPARATOR_CHAR + h, str5 + XVFSFile.SEPARATOR_CHAR + h);
                if (!C87412m.m108589b(b, e1Var.mo143215b(str5 + XVFSFile.SEPARATOR_CHAR + s0Var2.f263350e))) {
                    C86013q1.m106447h(str5 + XVFSFile.SEPARATOR_CHAR + s0Var2.f263350e);
                    return false;
                }
                if (s0Var != null) {
                    s0Var.f263347b = s0Var2.f263347b;
                    s0Var.f263348c = s0Var2.f263348c;
                    s0Var.f263349d = s0Var2.f263349d;
                    s0Var.f263350e = s0Var2.f263350e;
                    s0Var.f263351f = s0Var2.f263351f;
                }
                return true;
            }
            C86013q1.m106445f(str3);
            return false;
        }
        Log.m105924i("MicroMsg.WeVisModelResMgr", "unzipModelRes: new config is not valid");
        return false;
    }
}
