package u71;

import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import junit.framework.Assert;

/* renamed from: u71.a */
public class C52450a {

    /* renamed from: a */
    public SparseArray<WeakReference<C52453e>> f146564a;

    /* renamed from: a */
    public void mo73404a(String str, C52452d dVar) {
        Assert.assertTrue(dVar != null);
        if (this.f146564a == null) {
            Log.m105918d("MicroMsg.ExdeviceRankCallbackManager", "hy: callback pool is null. abort");
            return;
        }
        for (int i = 0; i < this.f146564a.size(); i++) {
            C52453e eVar = (C52453e) this.f146564a.get(this.f146564a.keyAt(i)).get();
            if (eVar != null) {
                eVar.mo64352I6(str, dVar);
            }
        }
        Log.m105918d("MicroMsg.ExdeviceRankCallbackManager", "hy: publish end");
    }

    /* renamed from: b */
    public void mo73405b(C52453e eVar) {
        Assert.assertTrue(eVar != null);
        if (this.f146564a == null) {
            this.f146564a = new SparseArray<>();
        }
        this.f146564a.put(eVar.hashCode(), new WeakReference(eVar));
    }

    /* renamed from: c */
    public void mo73406c(C52453e eVar) {
        Assert.assertTrue(eVar != null);
        SparseArray<WeakReference<C52453e>> sparseArray = this.f146564a;
        if (sparseArray == null) {
            Log.m105918d("MicroMsg.ExdeviceRankCallbackManager", "hy: callback pool is null. abort ");
        } else {
            sparseArray.remove(eVar.hashCode());
        }
    }
}
