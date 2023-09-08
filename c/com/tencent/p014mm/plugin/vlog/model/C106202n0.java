package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.tav.extractor.ApiExtractorDelegate;
import com.tencent.tav.extractor.ExtractorDelegateFactory;
import com.tencent.tav.extractor.IExtractorDelegate;

/* renamed from: com.tencent.mm.plugin.vlog.model.n0 */
public final class C106202n0 implements ExtractorDelegateFactory.IExtractorDelegateCreator {
    public IExtractorDelegate createExtractorDelegate() {
        return new ApiExtractorDelegate();
    }
}
