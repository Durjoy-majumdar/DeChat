package i40;

import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import f40.C86709a0;
import zh3.C91753f;

/* renamed from: i40.d */
public final class C46166d implements IMvvmDBProvider {
    public ISQLiteDatabase getDB() {
        C91753f fVar = C86709a0.m107535s().f251811i;
        if (fVar.mo125628r()) {
            return fVar;
        }
        return null;
    }
}
