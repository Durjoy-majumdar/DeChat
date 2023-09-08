package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.ArchiveFormat;
import com.tencent.p014mm.mm7zip.ExtractAskMode;
import com.tencent.p014mm.mm7zip.ExtractOperationResult;
import com.tencent.p014mm.mm7zip.IArchiveExtractCallback;
import com.tencent.p014mm.mm7zip.IInArchive;
import com.tencent.p014mm.mm7zip.IOutItemAllFormats;
import com.tencent.p014mm.mm7zip.IOutItemBase;
import com.tencent.p014mm.mm7zip.IOutUpdateArchive;
import com.tencent.p014mm.mm7zip.IOutUpdateArchive7z;
import com.tencent.p014mm.mm7zip.IOutUpdateArchiveZip;
import com.tencent.p014mm.mm7zip.ISequentialOutStream;
import com.tencent.p014mm.mm7zip.NFileTimeType;
import com.tencent.p014mm.mm7zip.PropID;
import com.tencent.p014mm.mm7zip.PropertyInfo;
import com.tencent.p014mm.mm7zip.SevenZipException;
import com.tencent.p014mm.mm7zip.simple.ISimpleInArchive;
import com.tencent.p014mm.mm7zip.simple.impl.SimpleInArchiveImpl;

/* renamed from: com.tencent.mm.mm7zip.impl.InArchiveImpl */
public final class InArchiveImpl implements IInArchive {
    private ArchiveFormat archiveFormat;
    private boolean closed;
    private long jbindingSession;
    private int numberOfItems = -1;
    private OutArchiveImpl<?> outArchiveImpl;
    private long sevenZipArchiveInstance;
    private long sevenZipInStreamInstance;

    /* renamed from: com.tencent.mm.mm7zip.impl.InArchiveImpl$1 */
    public static /* synthetic */ class C177901 {
        public static final /* synthetic */ int[] $SwitchMap$com$tencent$mm$mm7zip$PropID;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tencent.mm.mm7zip.PropID[] r0 = com.tencent.p014mm.mm7zip.PropID.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tencent$mm$mm7zip$PropID = r0
                com.tencent.mm.mm7zip.PropID r1 = com.tencent.p014mm.mm7zip.PropID.SIZE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tencent$mm$mm7zip$PropID     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.mm.mm7zip.PropID r1 = com.tencent.p014mm.mm7zip.PropID.PACKED_SIZE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tencent$mm$mm7zip$PropID     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.mm.mm7zip.PropID r1 = com.tencent.p014mm.mm7zip.PropID.IS_FOLDER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$tencent$mm$mm7zip$PropID     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.mm.mm7zip.PropID r1 = com.tencent.p014mm.mm7zip.PropID.ENCRYPTED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$tencent$mm$mm7zip$PropID     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tencent.mm.mm7zip.PropID r1 = com.tencent.p014mm.mm7zip.PropID.TIME_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.impl.InArchiveImpl.C177901.<clinit>():void");
        }
    }

    /* renamed from: com.tencent.mm.mm7zip.impl.InArchiveImpl$ExtractSlowCallback */
    public static class ExtractSlowCallback implements IArchiveExtractCallback {
        private ExtractOperationResult extractOperationResult;
        public ISequentialOutStream sequentialOutStreamParam;

        public ExtractSlowCallback(ISequentialOutStream iSequentialOutStream) {
            this.sequentialOutStreamParam = iSequentialOutStream;
        }

        public ExtractOperationResult getExtractOperationResult() {
            return this.extractOperationResult;
        }

        public ISequentialOutStream getStream(int i, ExtractAskMode extractAskMode) {
            if (extractAskMode.equals(ExtractAskMode.EXTRACT)) {
                return this.sequentialOutStreamParam;
            }
            return null;
        }

        public void prepareOperation(ExtractAskMode extractAskMode) {
        }

        public void setCompleted(long j) {
        }

        public void setOperationResult(ExtractOperationResult extractOperationResult2) {
            this.extractOperationResult = extractOperationResult2;
        }

        public void setTotal(long j) {
        }
    }

    private void createConnectedOutArchive() {
        if (this.archiveFormat.isOutArchiveSupported()) {
            try {
                OutArchiveImpl<?> outArchiveImpl2 = (OutArchiveImpl) this.archiveFormat.getOutArchiveImplementation().newInstance();
                this.outArchiveImpl = outArchiveImpl2;
                outArchiveImpl2.setInArchive(this);
                this.outArchiveImpl.setArchiveFormat(this.archiveFormat);
                nativeConnectOutArchive(this.outArchiveImpl, this.archiveFormat);
            } catch (Exception unused) {
                throw new IllegalStateException("Internal error: Can't create new instance of the class " + this.archiveFormat.getOutArchiveImplementation() + " using default constructor.");
            }
        } else {
            throw new IllegalStateException("Archive format '" + this.archiveFormat + "' doesn't support archive manipulations.");
        }
    }

    private void ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat archiveFormat2) {
        if (getArchiveFormat() != archiveFormat2) {
            throw new SevenZipException("Archive format specific update API for " + archiveFormat2.getMethodName() + "-archives can't work with the currently opened " + getArchiveFormat().getMethodName() + "-archive");
        }
    }

    private <T extends IOutItemBase> IOutUpdateArchive<T> getConnectedOutArchiveIntern() {
        if (this.outArchiveImpl == null) {
            createConnectedOutArchive();
        }
        return this.outArchiveImpl;
    }

    private native void nativeClose();

    private native void nativeConnectOutArchive(OutArchiveImpl<?> outArchiveImpl2, ArchiveFormat archiveFormat2);

    private native void nativeExtract(int[] iArr, boolean z, IArchiveExtractCallback iArchiveExtractCallback);

    private native Object nativeGetArchiveProperty(int i);

    private native PropertyInfo nativeGetArchivePropertyInfo(int i);

    private native int nativeGetNumberOfArchiveProperties();

    private native int nativeGetNumberOfItems();

    private native int nativeGetNumberOfProperties();

    private native Object nativeGetProperty(int i, int i2);

    private native PropertyInfo nativeGetPropertyInfo(int i);

    private native String nativeGetStringArchiveProperty(int i);

    private native String nativeGetStringProperty(int i, int i2);

    private void setArchiveFormat(String str) {
        for (ArchiveFormat archiveFormat2 : ArchiveFormat.values()) {
            if (archiveFormat2.getMethodName().equalsIgnoreCase(str)) {
                this.archiveFormat = archiveFormat2;
                return;
            }
        }
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            nativeClose();
        }
    }

    public void ensureOpened() {
        if (this.closed) {
            throw new SevenZipException("InArchive closed");
        }
    }

    public void extract(int[] iArr, boolean z, IArchiveExtractCallback iArchiveExtractCallback) {
        ensureOpened();
        nativeExtract(iArr, z, iArchiveExtractCallback);
    }

    public ExtractOperationResult extractSlow(int i, ISequentialOutStream iSequentialOutStream) {
        ensureOpened();
        ExtractSlowCallback extractSlowCallback = new ExtractSlowCallback(iSequentialOutStream);
        nativeExtract(new int[]{i}, false, extractSlowCallback);
        return extractSlowCallback.getExtractOperationResult();
    }

    public ArchiveFormat getArchiveFormat() {
        return this.archiveFormat;
    }

    public Object getArchiveProperty(PropID propID) {
        ensureOpened();
        return nativeGetArchiveProperty(propID.getPropIDIndex());
    }

    public PropertyInfo getArchivePropertyInfo(int i) {
        ensureOpened();
        return nativeGetArchivePropertyInfo(i);
    }

    public IOutUpdateArchive<IOutItemAllFormats> getConnectedOutArchive() {
        ensureOpened();
        return getConnectedOutArchiveIntern();
    }

    public IOutUpdateArchive7z getConnectedOutArchive7z() {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.SEVEN_ZIP);
        return (IOutUpdateArchive7z) getConnectedOutArchiveIntern();
    }

    public IOutUpdateArchiveZip getConnectedOutArchiveZip() {
        ensureOpened();
        ensureArchiveFormatForArchiveFormatSpecificUpdateAPI(ArchiveFormat.ZIP);
        return (IOutUpdateArchiveZip) getConnectedOutArchiveIntern();
    }

    public int getNumberOfArchiveProperties() {
        ensureOpened();
        return nativeGetNumberOfArchiveProperties();
    }

    public int getNumberOfItems() {
        ensureOpened();
        if (this.numberOfItems == -1) {
            this.numberOfItems = nativeGetNumberOfItems();
        }
        return this.numberOfItems;
    }

    public int getNumberOfProperties() {
        ensureOpened();
        return nativeGetNumberOfProperties();
    }

    public Object getProperty(int i, PropID propID) {
        ensureOpened();
        if (i < 0 || i >= getNumberOfItems()) {
            throw new SevenZipException("Index out of range. Index: " + i + ", NumberOfItems: " + getNumberOfItems());
        }
        Object nativeGetProperty = nativeGetProperty(i, propID.getPropIDIndex());
        int i2 = C177901.$SwitchMap$com$tencent$mm$mm7zip$PropID[propID.ordinal()];
        return (i2 == 1 || i2 == 2) ? nativeGetProperty instanceof Integer ? Long.valueOf(((Integer) nativeGetProperty).longValue()) : nativeGetProperty : i2 != 3 ? i2 != 4 ? (i2 == 5 && nativeGetProperty != null) ? NFileTimeType.values()[((Integer) nativeGetProperty).intValue()] : nativeGetProperty : nativeGetProperty == null ? Boolean.FALSE : nativeGetProperty : nativeGetProperty == null ? Boolean.FALSE : nativeGetProperty;
    }

    public PropertyInfo getPropertyInfo(int i) {
        ensureOpened();
        return nativeGetPropertyInfo(i);
    }

    public ISimpleInArchive getSimpleInterface() {
        return new SimpleInArchiveImpl(this);
    }

    public String getStringArchiveProperty(PropID propID) {
        ensureOpened();
        return nativeGetStringArchiveProperty(propID.getPropIDIndex());
    }

    public String getStringProperty(int i, PropID propID) {
        ensureOpened();
        if (i >= 0 && i < getNumberOfItems()) {
            return nativeGetStringProperty(i, propID.getPropIDIndex());
        }
        throw new SevenZipException("Index out of range. Index: " + i + ", NumberOfItems: " + getNumberOfItems());
    }
}
