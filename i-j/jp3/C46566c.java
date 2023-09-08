package jp3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp3.C9486a;
import junit.framework.Assert;

/* renamed from: jp3.c */
public class C46566c<_Target extends C9486a> implements C9487b<_Target>, C9486a {

    /* renamed from: d */
    public List<WeakReference<_Target>> f125460d = new ArrayList();

    /* renamed from: e */
    public boolean f125461e = true;

    public synchronized void dead() {
        if (this.f125461e) {
            Iterator it = ((ArrayList) this.f125460d).iterator();
            while (it.hasNext()) {
                C9486a aVar = (C9486a) ((WeakReference) it.next()).get();
                if (aVar != null) {
                    aVar.dead();
                }
            }
            ((ArrayList) this.f125460d).clear();
            this.f125461e = false;
        }
    }

    public synchronized void keep(_Target _target) {
        if (!this.f125461e) {
            Assert.assertNotNull(_target);
            _target.dead();
            return;
        }
        ((ArrayList) this.f125460d).add(new WeakReference(_target));
    }
}
