package vk0;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: vk0.a */
public class C90809a {

    /* renamed from: a */
    public boolean f260759a = true;

    /* renamed from: b */
    public boolean f260760b = true;

    /* renamed from: c */
    public boolean f260761c = false;

    /* renamed from: d */
    public SparseArray<WeakReference<C90815g>> f260762d = new SparseArray<>();

    /* renamed from: vk0.a$b */
    public static class C90811b {

        /* renamed from: a */
        public static C90809a f260763a = new C90809a((C90810a) null);
    }

    public C90809a(C90810a aVar) {
    }

    /* renamed from: a */
    public int[] mo124931a() {
        SparseArray<WeakReference<C90815g>> sparseArray = this.f260762d;
        if (sparseArray == null || sparseArray.size() == 0) {
            return new int[0];
        }
        int[] iArr = new int[this.f260762d.size()];
        for (int i = 0; i < this.f260762d.size(); i++) {
            iArr[i] = this.f260762d.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: b */
    public boolean mo124932b(int i, boolean z) {
        if (this.f260762d.indexOfKey(i) < 0) {
            return false;
        }
        WeakReference weakReference = this.f260762d.get(i);
        if (weakReference != null) {
            C90815g gVar = (C90815g) weakReference.get();
            if (gVar != null) {
                gVar.release();
            } else {
                Log.m105924i("MicroMsg.AppBrandCameraMrg", "release a recycled camera instance");
            }
        } else {
            Log.m105924i("MicroMsg.AppBrandCameraMrg", "release client fail, weak reference not exist");
        }
        if (!z) {
            return true;
        }
        this.f260762d.remove(i);
        return true;
    }
}
