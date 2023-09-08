package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.tencent.mm.plugin.appbrand.page.e */
public abstract class C83787e implements C83859n4 {

    /* renamed from: d */
    public final C83866o4 f244625d;

    /* renamed from: e */
    public final LinkedList<C83853m4> f244626e = new LinkedList<>();

    public C83787e(C83866o4 o4Var) {
        this.f244625d = o4Var;
    }

    public void clear() {
        this.f244626e.clear();
    }

    /* renamed from: f */
    public C83853m4 mo116248f() {
        return this.f244626e.peekLast();
    }

    /* renamed from: h */
    public boolean mo116249h(int i) {
        Iterator<C83853m4> it = this.f244626e.iterator();
        while (it.hasNext()) {
            if (it.next().f244833c == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo116250i() {
        if (size() < 1) {
            return false;
        }
        C83853m4 removeLast = this.f244626e.removeLast();
        if (this.f244625d != null) {
            MMHandlerThread.postToMainThread(new e$$a(this, removeLast));
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f244626e.isEmpty();
    }

    public Iterator<C83853m4> iterator() {
        ListIterator listIterator = (ListIterator) this.f244626e.iterator();
        return new e$$b(this, listIterator, listIterator);
    }

    /* renamed from: j */
    public void mo116237j(C83853m4 m4Var) {
        this.f244626e.addLast(m4Var);
    }

    public int size() {
        return this.f244626e.size();
    }
}
