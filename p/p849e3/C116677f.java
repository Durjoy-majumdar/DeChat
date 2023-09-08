package p849e3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: e3.f */
public class C116677f {

    /* renamed from: a */
    public final Runnable f349929a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<C116678i> f349930b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<C116678i, f$$c> f349931c = new HashMap();

    public C116677f(Runnable runnable) {
        this.f349929a = runnable;
    }

    /* renamed from: a */
    public void mo180679a(C116678i iVar) {
        this.f349930b.remove(iVar);
        f$$c f__c = (f$$c) ((HashMap) this.f349931c).remove(iVar);
        if (f__c != null) {
            f__c.f349937a.removeObserver(f__c.f349938b);
            f__c.f349938b = null;
        }
        this.f349929a.run();
    }
}
