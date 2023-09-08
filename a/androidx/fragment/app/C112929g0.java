package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.g0 */
public class C112929g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Object f338069d;

    /* renamed from: e */
    public final /* synthetic */ C112941l0 f338070e;

    /* renamed from: f */
    public final /* synthetic */ View f338071f;

    /* renamed from: g */
    public final /* synthetic */ Fragment f338072g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f338073h;

    /* renamed from: i */
    public final /* synthetic */ ArrayList f338074i;

    /* renamed from: j */
    public final /* synthetic */ ArrayList f338075j;

    /* renamed from: n */
    public final /* synthetic */ Object f338076n;

    public C112929g0(Object obj, C112941l0 l0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f338069d = obj;
        this.f338070e = l0Var;
        this.f338071f = view;
        this.f338072g = fragment;
        this.f338073h = arrayList;
        this.f338074i = arrayList2;
        this.f338075j = arrayList3;
        this.f338076n = obj2;
    }

    public void run() {
        Object obj = this.f338069d;
        if (obj != null) {
            this.f338070e.mo16818n(obj, this.f338071f);
            this.f338074i.addAll(C112935j0.m154512g(this.f338070e, this.f338069d, this.f338072g, this.f338073h, this.f338071f));
        }
        if (this.f338075j != null) {
            if (this.f338076n != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f338071f);
                this.f338070e.mo16819o(this.f338076n, this.f338075j, arrayList);
            }
            this.f338075j.clear();
            this.f338075j.add(this.f338071f);
        }
    }
}
