package bj2;

import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import gy3.C87412m;

/* renamed from: bj2.r */
public final class C54472r extends MvvmStorage<C54473v> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54472r(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    public String getLogTag() {
        return "MicroMsg.DemoStorage";
    }
}
