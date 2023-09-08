package com.tencent.p014mm.mm7zip;

import java.io.PrintStream;

/* renamed from: com.tencent.mm.mm7zip.IOutArchiveBase */
public interface IOutArchiveBase {
    PrintStream getTracePrintStream();

    boolean isTrace();

    void setTrace(boolean z);

    void setTracePrintStream(PrintStream printStream);
}
