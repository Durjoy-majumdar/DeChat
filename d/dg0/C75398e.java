package dg0;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import hg0.C46067w;
import hg0.C46070y;
import hg0.C76168b;
import hg0.C76169b1;
import hg0.C76175p;
import hg0.C76185s;
import hg0.C76187y0;
import hg0.C76189z0;
import java.util.LinkedList;
import te3.C49174do2;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: dg0.e */
public class C75398e extends C86301e {

    /* renamed from: d */
    public C76168b f221655d;

    /* renamed from: e */
    public C76175p f221656e;

    /* renamed from: f */
    public C76185s f221657f;

    /* renamed from: g */
    public C76189z0 f221658g;

    /* renamed from: h */
    public C76169b1 f221659h;

    /* renamed from: i */
    public C46070y f221660i;

    /* renamed from: j */
    public C46067w f221661j;

    /* renamed from: n */
    public C76187y0 f221662n;

    /* renamed from: o */
    public LinkedList<C49174do2> f221663o = null;

    public static C76169b1 Ax0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f221659h == null) {
            wx0().f221659h = new C76169b1(C86709a0.m107535s().f251811i);
        }
        return wx0().f221659h;
    }

    public static C76168b vx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f221655d == null) {
            wx0().f221655d = new C76168b(C86709a0.m107535s().f251811i);
        }
        return wx0().f221655d;
    }

    public static synchronized C75398e wx0() {
        C75398e eVar;
        Class cls = C75398e.class;
        synchronized (cls) {
            eVar = (C75398e) C86312j.m106911c(cls);
        }
        return eVar;
    }

    public static C76175p xx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f221656e == null) {
            wx0().f221656e = new C76175p(C86709a0.m107535s().f251811i);
        }
        return wx0().f221656e;
    }

    public static C46067w yx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f221661j == null) {
            wx0().f221661j = new C46067w(C86709a0.m107535s().f251811i);
        }
        return wx0().f221661j;
    }

    public static C46070y zx0() {
        C86709a0.m107523b().mo121108c();
        if (wx0().f221660i == null) {
            wx0().f221660i = new C46070y(C86709a0.m107535s().f251811i);
        }
        return wx0().f221660i;
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
    }
}
