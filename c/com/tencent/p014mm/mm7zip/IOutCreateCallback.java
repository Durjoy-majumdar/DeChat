package com.tencent.p014mm.mm7zip;

import com.tencent.p014mm.mm7zip.IOutItemBase;
import com.tencent.p014mm.mm7zip.impl.OutItemFactory;

/* renamed from: com.tencent.mm.mm7zip.IOutCreateCallback */
public interface IOutCreateCallback<T extends IOutItemBase> extends IProgress {
    T getItemInformation(int i, OutItemFactory<T> outItemFactory);

    ISequentialInStream getStream(int i);

    void setOperationResult(boolean z);
}
