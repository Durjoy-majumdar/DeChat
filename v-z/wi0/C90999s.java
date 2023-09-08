package wi0;

import android.os.Looper;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.storage.IStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import mu3.C109639a;

/* renamed from: wi0.s */
public abstract class C90999s implements IStorage {

    /* renamed from: d */
    public final /* synthetic */ C90978e0 f261083d = C81161g2.Cx0();

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        this.f261083d.add(iOnStorageChange);
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper) {
        this.f261083d.add(iOnStorageChange, looper);
    }

    public void add(String str, MStorage.IOnStorageChange iOnStorageChange) {
        this.f261083d.add(str, iOnStorageChange);
    }

    public void add(C109639a aVar, MStorage.IOnStorageChange iOnStorageChange) {
        this.f261083d.add(aVar, iOnStorageChange);
    }

    public void addLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f261083d.addLoadedListener(iOnStorageLoaded);
    }

    public void doNotify() {
        this.f261083d.doNotify();
    }

    public void doNotify(String str) {
        this.f261083d.doNotify(str);
    }

    public void doNotify(String str, int i, Object obj) {
        this.f261083d.doNotify(str, i, obj);
    }

    public void lock() {
        this.f261083d.lock();
    }

    public int lockCount() {
        return this.f261083d.lockCount();
    }

    public void remove(MStorage.IOnStorageChange iOnStorageChange) {
        this.f261083d.remove(iOnStorageChange);
    }

    public void removeLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f261083d.removeLoadedListener(iOnStorageLoaded);
    }

    public void unlock() {
        this.f261083d.unlock();
    }
}
