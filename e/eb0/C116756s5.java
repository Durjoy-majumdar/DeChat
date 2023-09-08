package eb0;

import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import f40.C86718e;
import f62.C75700k0;
import g62.C32330n;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import tc0.C77885p;
import te3.C64753ul2;
import te3.C64778vl2;

/* renamed from: eb0.s5 */
public final class C116756s5 {

    /* renamed from: c */
    public static final int f350054c = (500547758 + 1);

    /* renamed from: d */
    public static final int f350055d = (500547758 + 2);

    /* renamed from: e */
    public static C116756s5 f350056e;

    /* renamed from: a */
    public long f350057a = 0;

    /* renamed from: b */
    public Map<Integer, C116757a> f350058b;

    /* renamed from: eb0.s5$a */
    public abstract class C116757a {
        public C116757a(C116756s5 s5Var, C116732g5 g5Var) {
        }

        /* renamed from: a */
        public abstract boolean mo180719a(C58543t4 t4Var);

        /* renamed from: b */
        public C58543t4 mo180724b(int i, Object... objArr) {
            int i2 = 1;
            if (objArr != null && objArr.length > 0) {
                i2 = Util.nullAsInt(objArr[0], 1);
            }
            C58543t4 t4Var = new C58543t4();
            t4Var.f167583d = i;
            t4Var.f167584e = "" + i2;
            t4Var.f167585f = 0;
            return t4Var;
        }

        /* renamed from: c */
        public void mo180725c(C58543t4 t4Var, Object... objArr) {
            int i = 1;
            if (objArr != null && objArr.length > 0) {
                i = Util.nullAsInt(objArr[0], 1);
            }
            t4Var.f167584e = "" + (Util.getInt(t4Var.f167584e, 0) + i);
        }
    }

    public C116756s5() {
        HashMap hashMap = new HashMap();
        this.f350058b = hashMap;
        hashMap.put(Integer.valueOf(f350054c), new C116732g5(this));
        this.f350058b.put(Integer.valueOf(f350055d), new C116745k5(this));
        this.f350058b.put(24, new C116747l5(this));
        this.f350058b.put(25, new C116748m5(this));
        this.f350058b.put(26, new C116750n5(this));
        this.f350058b.put(10071, new C116751o5(this));
        this.f350058b.put(10076, new C116752p5(this));
        this.f350058b.put(19, new C116753q5(this));
        this.f350058b.put(10112, new C116754r5(this));
        this.f350058b.put(10113, new C116760w4(this));
        this.f350058b.put(10114, new C116761x4(this));
        this.f350058b.put(10115, new C116762y4(this));
        this.f350058b.put(Integer.valueOf(Task.EXTRAS_LIMIT_BYTES), new C116763z4(this));
        this.f350058b.put(10241, new C116721a5(this));
        this.f350058b.put(15, new C116722b5(this));
        this.f350058b.put(16, new C116723c5(this));
        this.f350058b.put(27, new C116727d5(this));
        this.f350058b.put(38, new C116730e5(this));
        this.f350058b.put(10090, new C116731f5(this));
        this.f350058b.put(10237, new C116733h5(this));
        this.f350058b.put(10238, new C116741i5(this));
        this.f350058b.put(10239, new C116743j5(this));
    }

    /* renamed from: b */
    public static void m164689b(int i, String str) {
        LinkedList linkedList = new LinkedList();
        C64753ul2 ul22 = new C64753ul2();
        ul22.f185759d = i;
        ul22.f185760e = str;
        linkedList.add(ul22);
        m164690c(linkedList);
    }

    /* renamed from: c */
    public static void m164690c(LinkedList<C64753ul2> linkedList) {
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                C64778vl2 vl22 = new C64778vl2();
                vl22.f185957e = linkedList;
                vl22.f185956d = linkedList != null ? linkedList.size() : 0;
                ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(36, vl22));
            }
        }
    }

    /* renamed from: d */
    public static C116756s5 m164691d() {
        if (f350056e == null) {
            f350056e = new C116756s5();
        }
        return f350056e;
    }

    /* renamed from: a */
    public void mo180727a(int i, Object... objArr) {
        C116757a aVar = (C116757a) ((HashMap) this.f350058b).get(Integer.valueOf(i));
        if (aVar != null) {
            C58544u4 e = mo180728e();
            Iterator<C58543t4> it = e.f167586d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    e.f167586d.add(aVar.mo180724b(i, objArr));
                    break;
                }
                C58543t4 next = it.next();
                if (next.f167583d == i) {
                    aVar.mo180725c(next, objArr);
                    break;
                }
            }
            mo180729f(e);
        }
    }

    /* renamed from: e */
    public final C58544u4 mo180728e() {
        if (C86709a0.m107523b().mo121114l()) {
            C86709a0.m107523b();
            if (!C86718e.m107551r() && C86709a0.m107535s().mo121142i() != null) {
                byte[] decodeHexString = Util.decodeHexString((String) C86709a0.m107535s().mo121142i().mo119684e(8215, (Object) null));
                if (decodeHexString == null || decodeHexString.length <= 0) {
                    return new C58544u4();
                }
                try {
                    C58544u4 u4Var = new C58544u4();
                    u4Var.parseFrom(decodeHexString);
                    return u4Var;
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.StatisticsKVReportLogic", "exception:%s", Util.stackTraceToString(e));
                }
            }
        }
        return new C58544u4();
    }

    /* renamed from: f */
    public final void mo180729f(C58544u4 u4Var) {
        if (u4Var != null && C86709a0.m107523b().mo121114l() && C86709a0.m107535s().mo121142i() != null) {
            C86709a0.m107523b();
            if (!C86718e.m107551r()) {
                try {
                    C86709a0.m107535s().mo121142i().mo119676J(8215, Util.encodeHexString(u4Var.toByteArray()));
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.StatisticsKVReportLogic", "exception:%s", Util.stackTraceToString(e));
                }
            }
        }
    }
}
