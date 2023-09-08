package com.tencent.p014mm.mm7zip;

/* renamed from: com.tencent.mm.mm7zip.ExtractAskMode */
public enum ExtractAskMode {
    EXTRACT,
    TEST,
    SKIP,
    UNKNOWN_ASK_MODE;

    public static ExtractAskMode getExtractAskModeByIndex(int i) {
        return (i < 0 || i >= values().length) ? UNKNOWN_ASK_MODE : values()[i];
    }
}
