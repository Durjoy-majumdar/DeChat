package com.tencent.p014mm.sdk.storage.mvvm;

import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39630m0;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.Set;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\n\u001a\u00020\tH\u0014R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/sdk/storage/mvvm/BaseMvvmDB;", "Landroidx/lifecycle/i0;", "Landroidx/lifecycle/n0;", "Lcom/tencent/mm/sdk/storage/mvvm/IMvvmDBProvider;", "Landroidx/lifecycle/m0;", "getViewModelStore", "", "Lcom/tencent/mm/sdk/storage/IAutoDBItem;", "getAutoDBItemSet", "Lrx3/b0;", "onCleared", "storageOwner", "Landroidx/lifecycle/m0;", "<init>", "()V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.storage.mvvm.BaseMvvmDB */
public abstract class BaseMvvmDB extends C39622i0 implements C0123n0, IMvvmDBProvider {
    private final C39630m0 storageOwner = new C39630m0();

    public abstract Set<IAutoDBItem> getAutoDBItemSet();

    public C39630m0 getViewModelStore() {
        return this.storageOwner;
    }

    public void onCleared() {
        super.onCleared();
        this.storageOwner.mo62188a();
    }
}
