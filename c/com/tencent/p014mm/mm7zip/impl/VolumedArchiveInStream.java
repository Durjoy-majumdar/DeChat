package com.tencent.p014mm.mm7zip.impl;

import com.tencent.p014mm.mm7zip.IArchiveOpenVolumeCallback;
import com.tencent.p014mm.mm7zip.IInStream;
import com.tencent.p014mm.mm7zip.PropID;
import com.tencent.p014mm.mm7zip.SevenZipException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.mm7zip.impl.VolumedArchiveInStream */
public class VolumedArchiveInStream implements IInStream {
    private static final String SEVEN_ZIP_FIRST_VOLUME_POSTFIX = ".7z.001";
    private long absoluteLength;
    private long absoluteOffset;
    private final IArchiveOpenVolumeCallback archiveOpenVolumeCallback;
    private IInStream currentInStream;
    private int currentIndex;
    private long currentVolumeLength;
    private long currentVolumeOffset;
    private String cuttedVolumeFilename;
    private List<Long> volumePositions;

    public VolumedArchiveInStream(IArchiveOpenVolumeCallback iArchiveOpenVolumeCallback) {
        this((String) iArchiveOpenVolumeCallback.getProperty(PropID.NAME), iArchiveOpenVolumeCallback);
    }

    private void openVolume(int i, boolean z) {
        if (this.currentIndex != i) {
            for (int size = this.volumePositions.size(); size < i && this.absoluteLength == -1; size++) {
                openVolume(size, false);
            }
            if (this.absoluteLength == -1 || this.volumePositions.size() > i) {
                IInStream stream = this.archiveOpenVolumeCallback.getStream(this.cuttedVolumeFilename + MessageFormat.format("{0,number,000}", new Object[]{Integer.valueOf(i)}));
                if (stream == null) {
                    List<Long> list = this.volumePositions;
                    this.absoluteLength = list.get(list.size() - 1).longValue();
                    return;
                }
                this.currentInStream = stream;
                if (this.volumePositions.size() == i) {
                    long seek = this.currentInStream.seek(0, 2);
                    this.currentVolumeLength = seek;
                    if (seek != 0) {
                        List<Long> list2 = this.volumePositions;
                        list2.add(Long.valueOf(list2.get(i - 1).longValue() + this.currentVolumeLength));
                        if (z) {
                            this.currentInStream.seek(0, 0);
                        }
                    } else {
                        throw new RuntimeException("Volume " + i + " is empty");
                    }
                } else {
                    this.currentVolumeLength = this.volumePositions.get(i).longValue() - this.volumePositions.get(i - 1).longValue();
                }
                if (z) {
                    this.currentVolumeOffset = 0;
                    this.absoluteOffset = this.volumePositions.get(i - 1).longValue();
                }
                this.currentIndex = i;
            }
        }
    }

    private void openVolumeToAbsoluteOffset() {
        int size = this.volumePositions.size() - 1;
        long j = this.absoluteLength;
        if (j == -1 || this.absoluteOffset < j) {
            while (this.volumePositions.get(size).longValue() > this.absoluteOffset) {
                size--;
            }
            if (size < this.volumePositions.size() - 1) {
                openVolume(size + 1, false);
                return;
            }
            do {
                size++;
                openVolume(size, false);
                long j2 = this.absoluteLength;
                if ((j2 != -1 && this.absoluteOffset >= j2) || this.volumePositions.get(size).longValue() > this.absoluteOffset) {
                }
                size++;
                openVolume(size, false);
                long j25 = this.absoluteLength;
                return;
            } while (this.volumePositions.get(size).longValue() > this.absoluteOffset);
        }
    }

    public void close() {
        throw new RuntimeException("close() method not supported. The user should implement its own caching and closing stratagies within the IArchiveOpenVolumeCallback.getStream() implementation.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.absoluteLength     // Catch:{ all -> 0x0032 }
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            long r2 = r5.absoluteOffset     // Catch:{ all -> 0x0032 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L_0x0012
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x0012:
            com.tencent.mm.mm7zip.IInStream r0 = r5.currentInStream     // Catch:{ all -> 0x0032 }
            int r6 = r0.read(r6)     // Catch:{ all -> 0x0032 }
            long r0 = r5.absoluteOffset     // Catch:{ all -> 0x0032 }
            long r2 = (long) r6     // Catch:{ all -> 0x0032 }
            long r0 = r0 + r2
            r5.absoluteOffset = r0     // Catch:{ all -> 0x0032 }
            long r0 = r5.currentVolumeOffset     // Catch:{ all -> 0x0032 }
            long r0 = r0 + r2
            r5.currentVolumeOffset = r0     // Catch:{ all -> 0x0032 }
            long r2 = r5.currentVolumeLength     // Catch:{ all -> 0x0032 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0030
            int r0 = r5.currentIndex     // Catch:{ all -> 0x0032 }
            r1 = 1
            int r0 = r0 + r1
            r5.openVolume(r0, r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r5)
            return r6
        L_0x0032:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.impl.VolumedArchiveInStream.read(byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058 A[Catch:{ all -> 0x003a }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long seek(long r8, int r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = -1
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L_0x003c
            if (r10 == r2) goto L_0x0036
            r4 = 2
            if (r10 != r4) goto L_0x001f
            long r4 = r7.absoluteLength     // Catch:{ all -> 0x003a }
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x001a
            r10 = 2147483647(0x7fffffff, float:NaN)
            r7.openVolume(r10, r3)     // Catch:{ all -> 0x003a }
            r10 = 1
            goto L_0x001b
        L_0x001a:
            r10 = 0
        L_0x001b:
            long r4 = r7.absoluteLength     // Catch:{ all -> 0x003a }
            long r8 = r8 + r4
            goto L_0x003d
        L_0x001f:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r9.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "Seek: unknown origin: "
            r9.append(r0)     // Catch:{ all -> 0x003a }
            r9.append(r10)     // Catch:{ all -> 0x003a }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x003a }
            r8.<init>(r9)     // Catch:{ all -> 0x003a }
            throw r8     // Catch:{ all -> 0x003a }
        L_0x0036:
            long r4 = r7.absoluteOffset     // Catch:{ all -> 0x003a }
            long r8 = r8 + r4
            goto L_0x003c
        L_0x003a:
            r8 = move-exception
            goto L_0x0077
        L_0x003c:
            r10 = 0
        L_0x003d:
            long r4 = r7.absoluteOffset     // Catch:{ all -> 0x003a }
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0047
            if (r10 != 0) goto L_0x0047
            monitor-exit(r7)
            return r8
        L_0x0047:
            r7.absoluteOffset = r8     // Catch:{ all -> 0x003a }
            r7.openVolumeToAbsoluteOffset()     // Catch:{ all -> 0x003a }
            long r4 = r7.absoluteLength     // Catch:{ all -> 0x003a }
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x005c
            long r0 = r7.absoluteOffset     // Catch:{ all -> 0x003a }
            int r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x005c
            r7.absoluteOffset = r4     // Catch:{ all -> 0x003a }
            monitor-exit(r7)
            return r4
        L_0x005c:
            long r0 = r7.absoluteOffset     // Catch:{ all -> 0x003a }
            java.util.List<java.lang.Long> r10 = r7.volumePositions     // Catch:{ all -> 0x003a }
            int r4 = r7.currentIndex     // Catch:{ all -> 0x003a }
            int r4 = r4 - r2
            java.lang.Object r10 = r10.get(r4)     // Catch:{ all -> 0x003a }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x003a }
            long r4 = r10.longValue()     // Catch:{ all -> 0x003a }
            long r0 = r0 - r4
            r7.currentVolumeOffset = r0     // Catch:{ all -> 0x003a }
            com.tencent.mm.mm7zip.IInStream r10 = r7.currentInStream     // Catch:{ all -> 0x003a }
            r10.seek(r0, r3)     // Catch:{ all -> 0x003a }
            monitor-exit(r7)
            return r8
        L_0x0077:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.impl.VolumedArchiveInStream.seek(long, int):long");
    }

    public VolumedArchiveInStream(String str, IArchiveOpenVolumeCallback iArchiveOpenVolumeCallback) {
        this.absoluteLength = -1;
        this.currentIndex = -1;
        ArrayList arrayList = new ArrayList();
        this.volumePositions = arrayList;
        this.archiveOpenVolumeCallback = iArchiveOpenVolumeCallback;
        arrayList.add(0L);
        if (str.endsWith(SEVEN_ZIP_FIRST_VOLUME_POSTFIX)) {
            this.cuttedVolumeFilename = str.substring(0, str.length() - 3);
            openVolume(1, true);
            return;
        }
        throw new SevenZipException("The first 7z volume filename '" + str + "' don't ends with the postfix: '" + SEVEN_ZIP_FIRST_VOLUME_POSTFIX + "'. Can't proceed");
    }
}
