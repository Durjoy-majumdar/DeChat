package sf2;

import com.tencent.p014mm.sdk.storage.MStorageEx;
import java.lang.ref.WeakReference;

/* renamed from: sf2.b */
public class C48376b implements MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public WeakReference<MStorageEx.IOnStorageChange> f129502d;

    public C48376b(MStorageEx.IOnStorageChange iOnStorageChange) {
        this.f129502d = new WeakReference<>(iOnStorageChange);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (this.f129502d.get() != null) {
            this.f129502d.get().onNotifyChange(i, mStorageEx, obj);
        }
    }
}
