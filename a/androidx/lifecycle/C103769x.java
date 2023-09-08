package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p1135n.C109660b;

/* renamed from: androidx.lifecycle.x */
public class C103769x<T> extends C54219z<T> {
    private C109660b<LiveData<?>, C103770a<?>> mSources = new C109660b<>();

    /* renamed from: androidx.lifecycle.x$a */
    public static class C103770a<V> implements C0120a0<V> {

        /* renamed from: d */
        public final LiveData<V> f306542d;

        /* renamed from: e */
        public final C0120a0<? super V> f306543e;

        /* renamed from: f */
        public int f306544f = -1;

        public C103770a(LiveData<V> liveData, C0120a0<? super V> a0Var) {
            this.f306542d = liveData;
            this.f306543e = a0Var;
        }

        public void onChanged(V v) {
            if (this.f306544f != this.f306542d.getVersion()) {
                this.f306544f = this.f306542d.getVersion();
                this.f306543e.onChanged(v);
            }
        }
    }

    public <S> void addSource(LiveData<S> liveData, C0120a0<? super S> a0Var) {
        C103770a aVar = new C103770a(liveData, a0Var);
        C103770a h = this.mSources.mo160872h(liveData, aVar);
        if (h != null && h.f306543e != a0Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (h == null && hasActiveObservers()) {
            liveData.observeForever(aVar);
        }
    }

    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, C103770a<?>>> it = this.mSources.iterator();
        while (true) {
            C109660b.C109665e eVar = (C109660b.C109665e) it;
            if (eVar.hasNext()) {
                C103770a aVar = (C103770a) ((Map.Entry) eVar.next()).getValue();
                aVar.f306542d.observeForever(aVar);
            } else {
                return;
            }
        }
    }

    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, C103770a<?>>> it = this.mSources.iterator();
        while (true) {
            C109660b.C109665e eVar = (C109660b.C109665e) it;
            if (eVar.hasNext()) {
                C103770a aVar = (C103770a) ((Map.Entry) eVar.next()).getValue();
                aVar.f306542d.removeObserver(aVar);
            } else {
                return;
            }
        }
    }

    public <S> void removeSource(LiveData<S> liveData) {
        C103770a i = this.mSources.mo160873i(liveData);
        if (i != null) {
            i.f306542d.removeObserver(i);
        }
    }
}
