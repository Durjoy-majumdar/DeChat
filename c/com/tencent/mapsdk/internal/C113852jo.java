package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.C113836jj;
import com.tencent.mapsdk.internal.C113849jm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.jo */
public final class C113852jo<D extends C113849jm> extends C113862jt<D> implements C113836jj<D> {

    /* renamed from: a */
    public ArrayList<C113846jl<D>> f340626a = new ArrayList<>();

    /* renamed from: b */
    private boolean f340627b = true;

    /* renamed from: a */
    private void m157285a(boolean z) {
        this.f340627b = z;
    }

    /* renamed from: a */
    public final C113836jj<D> mo172220a() {
        return this;
    }

    /* renamed from: b */
    public final void mo170953b() {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113861js) {
                    ((C113861js) next).mo172244m().mo172241j();
                } else {
                    next.mo170953b();
                }
            }
        }
    }

    /* renamed from: c */
    public final long mo170954c() {
        long c;
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        long j = 0;
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113861js) {
                    c = ((C113861js) next).mo172244m().mo172242k();
                } else {
                    c = next.mo170954c();
                }
                j += c;
            }
        }
        return j;
    }

    /* renamed from: d */
    public final long mo170955d() {
        long d;
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        long j = 0;
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113861js) {
                    d = ((C113861js) next).mo172244m().mo172243l();
                } else {
                    d = next.mo170955d();
                }
                j += d;
            }
        }
        return j;
    }

    /* renamed from: e */
    public final long mo170956e() {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        long j = 0;
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                j += next instanceof C113861js ? ((C113861js) next).mo172244m().mo170956e() : next.mo170956e();
            }
        }
        return j;
    }

    /* renamed from: a */
    private void m157286a(C113846jl<D>... jlVarArr) {
        this.f340626a.addAll(Arrays.asList(jlVarArr));
    }

    /* renamed from: a */
    public final C113846jl<D> mo172236a(int i) {
        if (i >= this.f340626a.size()) {
            return null;
        }
        return this.f340626a.get(i);
    }

    /* renamed from: a */
    public final void mo170951a(String str, D d) {
        int i;
        C113896kq.m157664b(C0949kl.f2245o, str);
        if (d == null) {
            i = 0;
        } else {
            i = d.mo56234a();
        }
        C113896kq.m157656a(C0949kl.f2246p, str, "put data length", (Object) Integer.valueOf(i));
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113861js) {
                    ((C113861js) next).mo172244m().mo172239b(str, d);
                } else {
                    next.mo170951a(str, d);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo172225b(C113836jj.C113837a<Long> aVar) {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113836jj) {
                    ((C113836jj) next).mo172220a().mo172225b(aVar);
                } else if (next instanceof C113861js) {
                    C113861js m = ((C113861js) next).mo172244m();
                    if (aVar != null) {
                        aVar.callback(Long.valueOf(m.mo172242k()));
                    }
                } else if (aVar != null) {
                    aVar.callback(Long.valueOf(next.mo170954c()));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo172226c(C113836jj.C113837a<Long> aVar) {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113836jj) {
                    ((C113836jj) next).mo172220a().mo172226c(aVar);
                } else if (next instanceof C113861js) {
                    C113861js m = ((C113861js) next).mo172244m();
                    if (aVar != null) {
                        aVar.callback(Long.valueOf(m.mo172243l()));
                    }
                } else if (aVar != null) {
                    aVar.callback(Long.valueOf(next.mo170955d()));
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo172227d(C113836jj.C113837a<Long> aVar) {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113836jj) {
                    ((C113836jj) next).mo172220a().mo172227d(aVar);
                } else if (next instanceof C113861js) {
                    C113861js m = ((C113861js) next).mo172244m();
                    if (aVar != null) {
                        aVar.callback(Long.valueOf(m.mo170956e()));
                    }
                } else if (aVar != null) {
                    aVar.callback(Long.valueOf(next.mo170956e()));
                }
            }
        }
    }

    /* renamed from: a */
    private static void m157284a(String str, D d, List<C113846jl<D>> list) {
        for (C113846jl next : list) {
            if (next instanceof C113861js) {
                ((C113861js) next).mo172244m().mo172239b(str, d);
            } else {
                next.mo170951a(str, d);
            }
        }
    }

    /* renamed from: a */
    public final D mo170950a(String str, Class<D> cls) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        D d = null;
        while (true) {
            if (it.hasNext()) {
                C113846jl next = it.next();
                if (next != null) {
                    if (next instanceof C113861js) {
                        d = ((C113861js) next).mo172244m().mo172238b(str, cls);
                    } else {
                        d = next.mo170950a(str, cls);
                    }
                    if (d != null && d.mo56234a() > 0) {
                        C113889km.m157550c(C0949kl.f2236f, "从[" + next + "]缓存中获取数据成功");
                        break;
                    } else if (this.f340627b) {
                        C113896kq.m157655a(C0949kl.f2245o, str, (Object) "back to fill ".concat(String.valueOf(next)));
                        arrayList.add(next);
                    }
                }
            } else {
                break;
            }
        }
        if (d != null && d.mo56234a() > 0 && !arrayList.isEmpty()) {
            m157284a(str, d, arrayList);
        }
        if (d == null) {
            i = 0;
        } else {
            i = d.mo56234a();
        }
        C113896kq.m157656a(C0949kl.f2245o, str, "get data length", (Object) Integer.valueOf(i));
        C113896kq.m157676f(C0949kl.f2245o, str);
        return d;
    }

    /* renamed from: a */
    public final boolean mo170952a(String str) {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113861js) {
                    z = ((C113861js) next).mo172244m().mo172240b(str);
                } else {
                    z = next.mo170952a(str);
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public final void mo172223a(String str, D d, C113836jj.C113837a<Boolean> aVar) {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113836jj) {
                    ((C113836jj) next).mo172220a().mo172223a(str, d, aVar);
                } else if (next instanceof C113861js) {
                    ((C113861js) next).mo172244m().mo172239b(str, d);
                    if (aVar != null) {
                        aVar.callback(Boolean.TRUE);
                    }
                } else {
                    next.mo170951a(str, d);
                    if (aVar != null) {
                        aVar.callback(Boolean.TRUE);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo172224a(String str, Class<D> cls, C113836jj.C113837a<D> aVar) {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113836jj) {
                    ((C113836jj) next).mo172220a().mo172224a(str, cls, aVar);
                } else if (next instanceof C113861js) {
                    C113861js m = ((C113861js) next).mo172244m();
                    if (aVar != null) {
                        aVar.callback(m.mo172238b(str, cls));
                    }
                } else if (aVar != null) {
                    aVar.callback(next.mo170950a(str, cls));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo172222a(String str, C113836jj.C113837a<Boolean> aVar) {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113836jj) {
                    ((C113836jj) next).mo172220a().mo172222a(str, aVar);
                } else if (next instanceof C113861js) {
                    C113861js m = ((C113861js) next).mo172244m();
                    if (aVar != null) {
                        aVar.callback(Boolean.valueOf(m.mo172240b(str)));
                    }
                } else if (aVar != null) {
                    aVar.callback(Boolean.valueOf(next.mo170952a(str)));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo172221a(C113836jj.C113837a<Boolean> aVar) {
        Iterator<C113846jl<D>> it = this.f340626a.iterator();
        while (it.hasNext()) {
            C113846jl next = it.next();
            if (next != null) {
                if (next instanceof C113836jj) {
                    ((C113836jj) next).mo172220a().mo172221a(aVar);
                } else if (next instanceof C113861js) {
                    ((C113861js) next).mo172244m().mo172241j();
                    if (aVar != null) {
                        aVar.callback(Boolean.TRUE);
                    }
                } else {
                    next.mo170953b();
                    if (aVar != null) {
                        aVar.callback(Boolean.TRUE);
                    }
                }
            }
        }
    }
}
