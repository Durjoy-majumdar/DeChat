package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.ArchiveFormat;
import com.tencent.p014mm.mm7zip.IInArchive;
import com.tencent.p014mm.mm7zip.IOutArchive;
import com.tencent.p014mm.mm7zip.IOutCreateCallback;
import com.tencent.p014mm.mm7zip.IOutItemBase;
import com.tencent.p014mm.mm7zip.ISequentialOutStream;
import com.tencent.p014mm.mm7zip.SevenZipException;
import java.io.PrintStream;

/* renamed from: com.tencent.mm.mm7zip.impl.OutArchiveImpl */
public class OutArchiveImpl<T extends IOutItemBase> implements IOutArchive<T> {
    private ArchiveFormat archiveFormat;
    private boolean closed;
    private int compressionLevel = -1;
    private Boolean headerEncryption;
    private IInArchive inArchive;
    private long jbindingSession;
    private long sevenZipArchiveInstance;
    private int threadCount = -1;
    private boolean trace;
    private PrintStream tracePrintStream;

    private void doUpdateItems(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback<?> iOutCreateCallback) {
        applyFeatures();
        nativeUpdateItems(iSequentialOutStream, i, iOutCreateCallback);
    }

    private void ensureOpened() {
        if (!this.closed) {
            IInArchive iInArchive = this.inArchive;
            if (iInArchive != null) {
                ((InArchiveImpl) iInArchive).ensureOpened();
                return;
            }
            return;
        }
        throw new SevenZipException("OutArchive closed");
    }

    private native void nativeClose();

    private native void nativeUpdateItems(ISequentialOutStream iSequentialOutStream, int i, Object obj);

    private final void traceMessage(String str) {
        if (this.trace) {
            PrintStream printStream = this.tracePrintStream;
            if (printStream == null) {
                System.out.println(str);
            } else {
                printStream.println(str);
            }
        }
    }

    public void applyFeatures() {
        ensureOpened();
        int i = this.compressionLevel;
        if (i != -1) {
            nativeSetLevel(i);
        }
        Boolean bool = this.headerEncryption;
        if (bool != null) {
            nativeSetHeaderEncryption(bool.booleanValue());
        }
        int i2 = this.threadCount;
        if (i2 >= 0) {
            nativeSetMultithreading(i2);
        }
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            if (this.inArchive == null) {
                nativeClose();
            }
        }
    }

    public void createArchive(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback<? extends T> iOutCreateCallback) {
        ensureOpened();
        doUpdateItems(iSequentialOutStream, i, iOutCreateCallback);
    }

    public void featureSetHeaderEncryption(boolean z) {
        this.headerEncryption = Boolean.valueOf(z);
    }

    public void featureSetLevel(int i) {
        this.compressionLevel = i;
    }

    public void featureSetThreadCount(int i) {
        this.threadCount = i;
    }

    public ArchiveFormat getArchiveFormat() {
        return this.archiveFormat;
    }

    public IInArchive getConnectedInArchive() {
        return this.inArchive;
    }

    public PrintStream getTracePrintStream() {
        return this.tracePrintStream;
    }

    public boolean isTrace() {
        return this.trace;
    }

    public native void nativeSetHeaderEncryption(boolean z);

    public native void nativeSetLevel(int i);

    public native void nativeSetMultithreading(int i);

    public native void nativeSetSolidSpec(String str);

    public void setArchiveFormat(ArchiveFormat archiveFormat2) {
        this.archiveFormat = archiveFormat2;
    }

    public void setInArchive(IInArchive iInArchive) {
        this.inArchive = iInArchive;
    }

    public void setTrace(boolean z) {
        this.trace = z;
    }

    public void setTracePrintStream(PrintStream printStream) {
        this.tracePrintStream = printStream;
    }

    public void updateItems(ISequentialOutStream iSequentialOutStream, int i, IOutCreateCallback<T> iOutCreateCallback) {
        ensureOpened();
        doUpdateItems(iSequentialOutStream, i, iOutCreateCallback);
    }
}
