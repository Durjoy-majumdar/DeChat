package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.tav.extractor.ExtractorDelegateFactory;
import com.tencent.tav.extractor.IExtractorDelegate;

/* renamed from: com.tencent.mm.plugin.vlog.model.o0 */
public final class C106203o0 implements ExtractorDelegateFactory.IExtractorDelegateCreator {
    public IExtractorDelegate createExtractorDelegate() {
        return new VLogAssetExtractor();
    }
}
