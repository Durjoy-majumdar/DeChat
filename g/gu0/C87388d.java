package gu0;

import android.content.Context;
import android.util.SparseArray;
import android.webkit.ValueCallback;
import com.eclipsesource.mmv8.V8ScriptEvaluateRequest;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import dq0.C86390a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p284zb.C91627a;
import p774zg.C91735n0;
import u24.C90599h;

/* renamed from: gu0.d */
public class C87388d extends C80681o {

    /* renamed from: f */
    public final SparseArray<C91627a> f253246f = new SparseArray<>(1);

    /* renamed from: g */
    public C86390a f253247g = null;

    /* renamed from: h */
    public final AtomicBoolean f253248h = new AtomicBoolean(false);

    /* renamed from: i */
    public final SparseArray<d$$f> f253249i = new SparseArray<>();

    public C87388d(C91735n0 n0Var) {
        super(n0Var);
        this.f236078d = C84768n1.m104425a();
    }

    /* renamed from: a */
    public void mo112511a(C80669j jVar, ArrayList<C80681o.C80687f> arrayList, C80681o.C80688g gVar) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        d$$c d__c = new d$$c(this, arrayList2, jVar, gVar);
        Iterator<C80681o.C80687f> it = arrayList.iterator();
        while (it.hasNext()) {
            C80681o.C80687f next = it.next();
            Log.m105925i("MicroMsg.V8EngineWorkerManagerLU", "batchInjectWorkEvalItems, about to submit item:%s, valid(%b)", next.f236089a, Boolean.valueOf(next.mo112522a()));
            if (next.mo112522a()) {
                if (mo121811p(next)) {
                    d__c.apply(Boolean.FALSE);
                    if (next.mo112522a()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(next.f236090b);
                        jVar.mo112498b(arrayList3, C84768n1.m104425a(), new C87392f(this, next, currentTimeMillis));
                    }
                } else {
                    String str = next instanceof d$$g ? ((d$$g) next).f253273c : null;
                    if (!C90599h.m113511d(str)) {
                        V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new V8ScriptEvaluateRequest();
                        v8ScriptEvaluateRequest.scriptText = str;
                        v8ScriptEvaluateRequest.scriptType = 3;
                        arrayList2.add(v8ScriptEvaluateRequest);
                    }
                    arrayList2.add(next.f236090b);
                }
            }
        }
        d__c.apply(Boolean.TRUE);
    }

    /* renamed from: b */
    public void mo112512b(C80669j jVar, String str, ValueCallback<String> valueCallback) {
        if (jVar == null) {
            Log.m105928w("MicroMsg.V8EngineWorkerManagerLU", "hy: engine context released");
        } else if (valueCallback != null) {
            jVar.mo112500d(str, new d$$e(this, valueCallback));
        } else {
            jVar.mo112500d(str, (C80669j.C80675f) null);
        }
    }

    /* renamed from: c */
    public void mo112513c(Context context, int i, C82510g gVar, List<String> list, boolean z) {
        Log.m105925i("MicroMsg.V8EngineWorkerManagerLU", "hy: trigger bind to %d", Integer.valueOf(i));
        C80669j jVar = this.f236076b.get(Integer.valueOf(i));
        WeakReference weakReference = new WeakReference(jVar);
        if (jVar == null || gVar == null) {
            Log.m105920e("MicroMsg.V8EngineWorkerManagerLU", "hy: worker not in map!");
            return;
        }
        jVar.f236041b.mo112450v(new d$$d(this, gVar, list, mo112514d(i, weakReference), jVar, i, z));
    }

    /* renamed from: e */
    public void mo112515e(int i, C80669j jVar) {
        C91627a aVar = this.f253246f.get(i);
        if (aVar != null) {
            jVar.f236041b.mo112452x(new d$$a(this, i, aVar));
        }
        synchronized (this.f253249i) {
            this.f253249i.remove(i);
        }
        jVar.mo112499c();
        jVar.f236041b.quit();
    }

    /* renamed from: f */
    public void mo112516f() {
        super.mo112516f();
        this.f253247g = null;
        this.f253246f.clear();
        this.f253249i.clear();
    }

    /* renamed from: h */
    public void mo112518h() {
        if (!this.f253248h.getAndSet(true)) {
            synchronized (this.f253249i) {
                for (int i = 0; i < this.f253249i.size(); i++) {
                    d$$f valueAt = this.f253249i.valueAt(i);
                    valueAt.f253271b.f236041b.mo112450v(new d$$b(this, valueAt, valueAt.f253272c));
                }
            }
        }
    }

    /* renamed from: i */
    public void mo112519i(ArrayList<C80681o.C80687f> arrayList, C83165i iVar, C82510g gVar) {
        if (!(gVar instanceof C81925i2)) {
            Log.m105920e("MicroMsg.V8EngineWorkerManagerLU", "hy: component is not service. do nothing");
            return;
        }
        C86390a l = mo121807l();
        this.f253247g = l;
        C81925i2 i2Var = (C81925i2) gVar;
        l.mo120817e(i2Var, iVar);
        String n0 = i2Var.mo114343n0();
        int i = 0;
        Iterator<C80681o.C80687f> it = arrayList.iterator();
        while (it.hasNext() && !mo121811p(it.next())) {
            i++;
        }
        arrayList.add(i, new C80681o.C80687f(n0 + "node.js", this.f253247g.mo120815a()));
    }

    /* renamed from: l */
    public C86390a mo121807l() {
        return new C86390a();
    }

    /* renamed from: m */
    public final String mo121808m(C82510g gVar) {
        ICommLibReader iCommLibReader = (ICommLibReader) gVar.mo109668l(ICommLibReader.class);
        if (iCommLibReader == null) {
            return "";
        }
        return "v" + iCommLibReader.mo113371a();
    }

    /* renamed from: n */
    public String mo121809n(C82510g gVar) {
        return "";
    }

    /* renamed from: o */
    public String mo121810o() {
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[LOOP:0: B:1:0x0005->B:14:0x003b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a A[SYNTHETIC] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo121811p(com.tencent.p014mm.appbrand.p942v8.C80681o.C80687f r12) {
        /*
            r11 = this;
            java.lang.String[] r0 = p1044ub.C90636f.f260397J0
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0005:
            if (r3 >= r1) goto L_0x003e
            r7 = r0[r3]
            java.lang.String r4 = r12.f236089a
            r10 = 1
            if (r4 == 0) goto L_0x0031
            if (r7 != 0) goto L_0x0011
            goto L_0x0031
        L_0x0011:
            int r5 = r7.length()
            int r6 = r4.length()
            if (r5 <= r6) goto L_0x001c
            goto L_0x0037
        L_0x001c:
            int r5 = r4.length()
            int r6 = r7.length()
            int r6 = r5 - r6
            r8 = 0
            int r9 = r7.length()
            r5 = 0
            boolean r4 = r4.regionMatches(r5, r6, r7, r8, r9)
            goto L_0x0038
        L_0x0031:
            if (r4 != 0) goto L_0x0037
            if (r7 != 0) goto L_0x0037
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            if (r4 == 0) goto L_0x003b
            return r10
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.C87388d.mo121811p(com.tencent.mm.appbrand.v8.o$f):boolean");
    }

    /* renamed from: q */
    public void mo121812q(C80681o.C80687f fVar, long j, long j2, C80669j.C80676g gVar) {
    }
}
