package com.tencent.tav.extractor;

public class ExtractorDelegateFactory {
    private static IExtractorDelegateCreator extractorDelegateCreator = new IExtractorDelegateCreator() {
        public IExtractorDelegate createExtractorDelegate() {
            return new ApiExtractorDelegate();
        }
    };

    public interface IExtractorDelegateCreator {
        IExtractorDelegate createExtractorDelegate();
    }

    public static IExtractorDelegate createDelegate() {
        return extractorDelegateCreator.createExtractorDelegate();
    }

    public static void setExtractorDelegateCreator(IExtractorDelegateCreator iExtractorDelegateCreator) {
        extractorDelegateCreator = iExtractorDelegateCreator;
    }
}
