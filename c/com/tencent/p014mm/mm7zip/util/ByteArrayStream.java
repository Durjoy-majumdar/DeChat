package com.tencent.p014mm.mm7zip.util;

import com.tencent.p014mm.mm7zip.IInStream;
import com.tencent.p014mm.mm7zip.IOutStream;
import com.tencent.p014mm.mm7zip.SevenZipException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.mm7zip.util.ByteArrayStream */
public class ByteArrayStream implements IInStream, IOutStream {
    private static final int INPUT_STREAM_READ_BUFFER_SIZE = 16384;
    private static final int MAX_CHUNK_SIZE = 1048576;
    private final List<byte[]> chunkList;
    private int currentChunkIndex;
    private int currentPosition;
    private int currentPositionInChunk;
    private final int initialSize;
    private final int maxSize;
    private int seekToPosition;
    private int size;

    public ByteArrayStream(byte[] bArr, boolean z, int i) {
        this(1024, i);
        setBytes(bArr, z);
    }

    private void allocateNextChunk(int i) {
        int i2 = this.currentChunkIndex;
        if (i2 == -1 || (i2 == this.chunkList.size() - 1 && this.chunkList.get(this.currentChunkIndex).length == this.currentPositionInChunk)) {
            this.currentPositionInChunk = 0;
            this.currentChunkIndex++;
        }
        if (this.size < this.maxSize) {
            int size2 = this.chunkList.size() - 1;
            int length = size2 == -1 ? this.initialSize : this.chunkList.get(size2).length << 1;
            if (length < 0 || length > 1048576) {
                length = 1048576;
            }
            int i3 = this.size;
            int i4 = i3 + length;
            int i5 = this.maxSize;
            if (i4 > i5) {
                length = i5 - i3;
            }
            if (i == -1 || length >= i) {
                i = length;
            } else if (i3 + i >= i5) {
                throw new RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.maxSize + ")");
            }
            this.chunkList.add(new byte[i]);
            return;
        }
        throw new RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.maxSize + ")");
    }

    private void endWriting() {
        if (this.size == this.currentPosition && this.currentPositionInChunk == 0) {
            int i = this.currentChunkIndex;
            if (i == 0) {
                init();
                return;
            }
            List<byte[]> list = this.chunkList;
            this.currentChunkIndex = i - 1;
            list.remove(i);
            this.currentPositionInChunk = this.chunkList.get(this.currentChunkIndex).length;
        }
    }

    private void init() {
        this.chunkList.clear();
        this.currentPosition = 0;
        this.currentPositionInChunk = 0;
        this.currentChunkIndex = -1;
        this.size = 0;
        this.seekToPosition = -1;
    }

    private void performDelayedSeek() {
        int i = this.seekToPosition;
        if (i != -1) {
            if (this.currentPosition == i) {
                this.seekToPosition = -1;
            } else if (i > this.size) {
                setSize((long) i, true);
                this.seekToPosition = -1;
            } else {
                int i2 = 0;
                for (int i3 = 0; i3 < this.chunkList.size(); i3++) {
                    int length = this.chunkList.get(i3).length;
                    i2 += length;
                    int i4 = this.seekToPosition;
                    if (i2 > i4) {
                        this.currentChunkIndex = i3;
                        this.currentPositionInChunk = length - (i2 - i4);
                        this.currentPosition = i4;
                        this.seekToPosition = -1;
                        return;
                    }
                }
                int size2 = this.chunkList.size() - 1;
                this.currentChunkIndex = size2;
                this.currentPositionInChunk = this.chunkList.get(size2).length;
                this.currentPosition = this.size;
                this.seekToPosition = -1;
            }
        }
    }

    private void startWriting() {
        int i = this.currentChunkIndex;
        if (i == -1 || this.currentPositionInChunk >= this.chunkList.get(i).length) {
            allocateNextChunk(-1);
        }
    }

    public void close() {
    }

    public synchronized byte[] getBytes() {
        byte[] bArr;
        bArr = new byte[this.size];
        int i = 0;
        for (byte[] next : this.chunkList) {
            int length = next.length + i;
            int i2 = this.size;
            int length2 = length > i2 ? i2 - i : next.length;
            System.arraycopy(next, 0, bArr, i, length2);
            i += length2;
        }
        return bArr;
    }

    public synchronized int getCurrentPosition() {
        int i = this.seekToPosition;
        if (i != -1) {
            return i;
        }
        return this.currentPosition;
    }

    public InputStream getDetachedInputStream() {
        throw new IllegalStateException("Not implemented");
    }

    public InputStream getInputStream() {
        throw new IllegalStateException("Not implemented");
    }

    public OutputStream getOutputStream() {
        throw new IllegalStateException("Not implemented");
    }

    public synchronized int getSize() {
        return this.size;
    }

    public synchronized boolean isEOF() {
        return getCurrentPosition() >= this.size;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized void rewind() {
        this.seekToPosition = 0;
    }

    public synchronized long seek(long j, int i) {
        int i2;
        if (i != 0) {
            if (i == 1) {
                i2 = this.seekToPosition;
                if (i2 == -1) {
                    i2 = this.currentPosition;
                }
            } else if (i == 2) {
                try {
                    i2 = this.size;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new SevenZipException("Seek: unknown origin: " + i);
            }
            j += (long) i2;
        }
        if (j <= ((long) this.maxSize)) {
            this.seekToPosition = (int) j;
        } else {
            throw new RuntimeException("Maximal size of the byte array stream was reached by seek to " + j + ", maximal size is " + this.maxSize + " bytes");
        }
        return j;
    }

    public synchronized void setBytes(byte[] bArr, boolean z) {
        init();
        int length = bArr.length;
        if (z) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        this.chunkList.add(bArr);
        this.currentChunkIndex = 0;
        this.currentPosition = 0;
        this.currentPositionInChunk = 0;
        this.size = length;
    }

    public synchronized void setSize(long j) {
        setSize(j, false);
    }

    public synchronized void truncate() {
        init();
    }

    public int write(byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void writeFromInputStream(java.io.InputStream r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.performDelayedSeek()     // Catch:{ all -> 0x0094 }
            int r0 = r4.size     // Catch:{ all -> 0x0094 }
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x007f
            r4.init()     // Catch:{ all -> 0x0094 }
            int r0 = r5.available()     // Catch:{ all -> 0x0094 }
            int r3 = r4.maxSize     // Catch:{ all -> 0x0094 }
            if (r0 > r3) goto L_0x0061
            int r3 = r4.initialSize     // Catch:{ all -> 0x0094 }
            if (r0 <= r3) goto L_0x0030
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0094 }
            int r3 = r5.read(r0)     // Catch:{ all -> 0x0094 }
            if (r3 != r2) goto L_0x0023
            monitor-exit(r4)
            return
        L_0x0023:
            r4.size = r3     // Catch:{ all -> 0x0094 }
            r4.currentPosition = r3     // Catch:{ all -> 0x0094 }
            r4.currentPositionInChunk = r3     // Catch:{ all -> 0x0094 }
            r4.currentChunkIndex = r1     // Catch:{ all -> 0x0094 }
            java.util.List<byte[]> r1 = r4.chunkList     // Catch:{ all -> 0x0094 }
            r1.add(r0)     // Catch:{ all -> 0x0094 }
        L_0x0030:
            r4.startWriting()     // Catch:{ all -> 0x0094 }
        L_0x0033:
            java.util.List<byte[]> r0 = r4.chunkList     // Catch:{ all -> 0x0094 }
            int r1 = r4.currentChunkIndex     // Catch:{ all -> 0x0094 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0094 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0094 }
            int r1 = r4.currentPositionInChunk     // Catch:{ all -> 0x0094 }
            int r3 = r0.length     // Catch:{ all -> 0x0094 }
            int r3 = r3 - r1
            int r1 = r5.read(r0, r1, r3)     // Catch:{ all -> 0x0094 }
            if (r1 != r2) goto L_0x004f
            int r0 = r4.currentPosition     // Catch:{ all -> 0x0094 }
            r4.size = r0     // Catch:{ all -> 0x0094 }
            r4.endWriting()     // Catch:{ all -> 0x0094 }
            goto L_0x0089
        L_0x004f:
            int r3 = r4.currentPosition     // Catch:{ all -> 0x0094 }
            int r3 = r3 + r1
            r4.currentPosition = r3     // Catch:{ all -> 0x0094 }
            int r3 = r4.currentPositionInChunk     // Catch:{ all -> 0x0094 }
            int r3 = r3 + r1
            r4.currentPositionInChunk = r3     // Catch:{ all -> 0x0094 }
            int r0 = r0.length     // Catch:{ all -> 0x0094 }
            int r0 = r0 - r3
            if (r0 != 0) goto L_0x0033
            r4.allocateNextChunk(r2)     // Catch:{ all -> 0x0094 }
            goto L_0x0033
        L_0x0061:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0094 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            r6.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "Maximal size of the byte array stream was reached. (Max size = "
            r6.append(r0)     // Catch:{ all -> 0x0094 }
            int r0 = r4.maxSize     // Catch:{ all -> 0x0094 }
            r6.append(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = ")"
            r6.append(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0094 }
            r5.<init>(r6)     // Catch:{ all -> 0x0094 }
            throw r5     // Catch:{ all -> 0x0094 }
        L_0x007f:
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0094 }
        L_0x0083:
            int r3 = r5.read(r0)     // Catch:{ all -> 0x0094 }
            if (r3 != r2) goto L_0x0090
        L_0x0089:
            if (r6 == 0) goto L_0x008e
            r5.close()     // Catch:{ all -> 0x0094 }
        L_0x008e:
            monitor-exit(r4)
            return
        L_0x0090:
            r4.write(r0, r1, r3)     // Catch:{ all -> 0x0094 }
            goto L_0x0083
        L_0x0094:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.util.ByteArrayStream.writeFromInputStream(java.io.InputStream, boolean):void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void writeToOutputStream(java.io.OutputStream r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List<byte[]> r0 = r6.chunkList     // Catch:{ all -> 0x002a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002a }
            r1 = 0
            r2 = 0
        L_0x0009:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x0023
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x002a }
            byte[] r3 = (byte[]) r3     // Catch:{ all -> 0x002a }
            int r4 = r3.length     // Catch:{ all -> 0x002a }
            int r4 = r4 + r2
            int r5 = r6.size     // Catch:{ all -> 0x002a }
            if (r4 <= r5) goto L_0x001d
            int r5 = r5 - r2
            goto L_0x001e
        L_0x001d:
            int r5 = r3.length     // Catch:{ all -> 0x002a }
        L_0x001e:
            r7.write(r3, r1, r5)     // Catch:{ all -> 0x002a }
            int r2 = r2 + r5
            goto L_0x0009
        L_0x0023:
            if (r8 == 0) goto L_0x0028
            r7.close()     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            monitor-exit(r6)
            return
        L_0x002a:
            r0 = move-exception
            if (r8 == 0) goto L_0x0030
            r7.close()     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.util.ByteArrayStream.writeToOutputStream(java.io.OutputStream, boolean):void");
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            if (bArr.length >= i + i2) {
                if (this.seekToPosition > this.size) {
                    return 0;
                }
                performDelayedSeek();
                int i3 = this.currentPosition;
                int i4 = i3 + i2;
                int i5 = this.size;
                if (i4 > i5) {
                    i2 = i5 - i3;
                }
                int i6 = i2;
                while (i6 > 0) {
                    int length = this.chunkList.get(this.currentChunkIndex).length;
                    int i7 = length - this.currentPositionInChunk;
                    if (i6 <= i7) {
                        i7 = i6;
                    }
                    System.arraycopy(this.chunkList.get(this.currentChunkIndex), this.currentPositionInChunk, bArr, i, i7);
                    i += i7;
                    int i8 = this.currentPositionInChunk + i7;
                    this.currentPositionInChunk = i8;
                    i6 -= i7;
                    if (i8 >= length && this.currentChunkIndex < this.chunkList.size() - 1) {
                        int i9 = this.currentChunkIndex + 1;
                        this.currentChunkIndex = i9;
                        this.currentPositionInChunk = 0;
                        int length2 = this.chunkList.get(i9).length;
                    }
                }
                this.currentPosition += i2;
                return i2;
            }
        }
        throw new IllegalStateException("Invalid start position (" + i + ") and length (" + i2 + ")");
    }

    public synchronized int write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            if (bArr.length >= i + i2) {
                if (i2 == 0) {
                    return 0;
                }
                performDelayedSeek();
                startWriting();
                do {
                    byte[] bArr2 = this.chunkList.get(this.currentChunkIndex);
                    int length = bArr2.length;
                    int i3 = this.currentPositionInChunk;
                    int i4 = length - i3;
                    if (i4 >= i2) {
                        i4 = i2;
                    }
                    System.arraycopy(bArr, i, bArr2, i3, i4);
                    int i5 = this.currentPositionInChunk + i4;
                    this.currentPositionInChunk = i5;
                    this.currentPosition += i4;
                    i += i4;
                    i2 -= i4;
                    if (i5 >= bArr2.length) {
                        this.currentPositionInChunk = 0;
                        int i6 = this.currentChunkIndex + 1;
                        this.currentChunkIndex = i6;
                        if (i6 >= this.chunkList.size()) {
                            allocateNextChunk(-1);
                            continue;
                        } else {
                            continue;
                        }
                    }
                } while (i2 > 0);
                int i7 = this.currentPosition;
                if (i7 > this.size) {
                    this.size = i7;
                }
                endWriting();
                return bArr.length;
            }
        }
        throw new IllegalStateException("Invalid start position (" + i + ") and length (" + i2 + ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ByteArrayStream(byte[] bArr, boolean z) {
        this(1024 > bArr.length ? bArr.length : 1024, bArr.length);
        setBytes(bArr, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void setSize(long r6, boolean r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000c
            r5.truncate()     // Catch:{ all -> 0x0104 }
            monitor-exit(r5)
            return
        L_0x000c:
            int r0 = r5.maxSize     // Catch:{ all -> 0x0104 }
            long r0 = (long) r0     // Catch:{ all -> 0x0104 }
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00de
            int r0 = r5.size     // Catch:{ all -> 0x0104 }
            long r1 = (long) r0     // Catch:{ all -> 0x0104 }
            r3 = 0
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x007e
            if (r0 != 0) goto L_0x0029
            java.util.List<byte[]> r0 = r5.chunkList     // Catch:{ all -> 0x0104 }
            int r1 = (int) r6     // Catch:{ all -> 0x0104 }
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x0104 }
            r0.add(r2)     // Catch:{ all -> 0x0104 }
            r5.currentChunkIndex = r3     // Catch:{ all -> 0x0104 }
            r5.size = r1     // Catch:{ all -> 0x0104 }
        L_0x0029:
            int r0 = r5.size     // Catch:{ all -> 0x0104 }
            long r0 = (long) r0     // Catch:{ all -> 0x0104 }
            long r0 = r6 - r0
            int r1 = (int) r0     // Catch:{ all -> 0x0104 }
            r0 = 0
            r2 = 0
        L_0x0031:
            java.util.List<byte[]> r4 = r5.chunkList     // Catch:{ all -> 0x0104 }
            int r4 = r4.size()     // Catch:{ all -> 0x0104 }
            if (r0 >= r4) goto L_0x0046
            java.util.List<byte[]> r4 = r5.chunkList     // Catch:{ all -> 0x0104 }
            java.lang.Object r4 = r4.get(r0)     // Catch:{ all -> 0x0104 }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x0104 }
            int r4 = r4.length     // Catch:{ all -> 0x0104 }
            int r2 = r2 + r4
            int r0 = r0 + 1
            goto L_0x0031
        L_0x0046:
            int r0 = r5.size     // Catch:{ all -> 0x0104 }
            int r2 = r2 - r0
            if (r2 >= r1) goto L_0x0057
            int r0 = r0 + r2
            r5.size = r0     // Catch:{ all -> 0x0104 }
            int r1 = r1 - r2
            r5.allocateNextChunk(r1)     // Catch:{ all -> 0x0104 }
            if (r8 == 0) goto L_0x006c
            r5.currentPositionInChunk = r1     // Catch:{ all -> 0x0104 }
            goto L_0x006c
        L_0x0057:
            if (r8 == 0) goto L_0x006c
            java.util.List<byte[]> r0 = r5.chunkList     // Catch:{ all -> 0x0104 }
            int r4 = r0.size()     // Catch:{ all -> 0x0104 }
            int r4 = r4 + -1
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0104 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0104 }
            int r0 = r0.length     // Catch:{ all -> 0x0104 }
            int r0 = r0 - r2
            int r0 = r0 + r1
            r5.currentPositionInChunk = r0     // Catch:{ all -> 0x0104 }
        L_0x006c:
            if (r8 == 0) goto L_0x007b
            java.util.List<byte[]> r8 = r5.chunkList     // Catch:{ all -> 0x0104 }
            int r8 = r8.size()     // Catch:{ all -> 0x0104 }
            int r8 = r8 + -1
            r5.currentChunkIndex = r8     // Catch:{ all -> 0x0104 }
            int r8 = (int) r6     // Catch:{ all -> 0x0104 }
            r5.currentPosition = r8     // Catch:{ all -> 0x0104 }
        L_0x007b:
            int r8 = (int) r6     // Catch:{ all -> 0x0104 }
            r5.size = r8     // Catch:{ all -> 0x0104 }
        L_0x007e:
            int r8 = r5.size     // Catch:{ all -> 0x0104 }
            long r0 = (long) r8     // Catch:{ all -> 0x0104 }
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x00dc
            r8 = 0
        L_0x0086:
            java.util.List<byte[]> r0 = r5.chunkList     // Catch:{ all -> 0x0104 }
            int r0 = r0.size()     // Catch:{ all -> 0x0104 }
            if (r3 >= r0) goto L_0x00dc
            java.util.List<byte[]> r0 = r5.chunkList     // Catch:{ all -> 0x0104 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0104 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0104 }
            int r0 = r0.length     // Catch:{ all -> 0x0104 }
            int r8 = r8 + r0
            long r0 = (long) r8     // Catch:{ all -> 0x0104 }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x00d9
            java.util.List<byte[]> r0 = r5.chunkList     // Catch:{ all -> 0x0104 }
            int r0 = r0.size()     // Catch:{ all -> 0x0104 }
            int r0 = r0 + -1
        L_0x00a5:
            if (r0 <= r3) goto L_0x00af
            java.util.List<byte[]> r1 = r5.chunkList     // Catch:{ all -> 0x0104 }
            r1.remove(r0)     // Catch:{ all -> 0x0104 }
            int r0 = r0 + -1
            goto L_0x00a5
        L_0x00af:
            int r0 = r5.seekToPosition     // Catch:{ all -> 0x0104 }
            r1 = -1
            if (r0 == r1) goto L_0x00bd
            long r0 = (long) r0     // Catch:{ all -> 0x0104 }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00bd
            int r0 = (int) r6     // Catch:{ all -> 0x0104 }
            r5.seekToPosition = r0     // Catch:{ all -> 0x0104 }
            goto L_0x00d6
        L_0x00bd:
            int r0 = r5.currentPosition     // Catch:{ all -> 0x0104 }
            long r0 = (long) r0     // Catch:{ all -> 0x0104 }
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00d6
            int r0 = (int) r6     // Catch:{ all -> 0x0104 }
            r5.currentPosition = r0     // Catch:{ all -> 0x0104 }
            int r0 = r0 - r8
            java.util.List<byte[]> r1 = r5.chunkList     // Catch:{ all -> 0x0104 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0104 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0104 }
            int r1 = r1.length     // Catch:{ all -> 0x0104 }
            int r0 = r0 + r1
            r5.currentPositionInChunk = r0     // Catch:{ all -> 0x0104 }
            r5.currentChunkIndex = r3     // Catch:{ all -> 0x0104 }
        L_0x00d6:
            int r0 = (int) r6     // Catch:{ all -> 0x0104 }
            r5.size = r0     // Catch:{ all -> 0x0104 }
        L_0x00d9:
            int r3 = r3 + 1
            goto L_0x0086
        L_0x00dc:
            monitor-exit(r5)
            return
        L_0x00de:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x0104 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0104 }
            r0.<init>()     // Catch:{ all -> 0x0104 }
            java.lang.String r1 = "Maximal size of the byte array stream was reached by setSize("
            r0.append(r1)     // Catch:{ all -> 0x0104 }
            r0.append(r6)     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = "). Maximal size is "
            r0.append(r6)     // Catch:{ all -> 0x0104 }
            int r6 = r5.maxSize     // Catch:{ all -> 0x0104 }
            r0.append(r6)     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = " bytes"
            r0.append(r6)     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0104 }
            r8.<init>(r6)     // Catch:{ all -> 0x0104 }
            throw r8     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mm7zip.util.ByteArrayStream.setSize(long, boolean):void");
    }

    public ByteArrayStream(int i) {
        this(1024, i);
    }

    public ByteArrayStream(int i, int i2) {
        this.chunkList = new ArrayList();
        this.initialSize = i;
        if (i2 < 0) {
            throw new IllegalStateException("Maximal size of the byte array stream should be >0");
        } else if (i >= 0) {
            this.maxSize = i2;
            init();
        } else {
            throw new IllegalStateException("Initial size of the byte array stream should be >0");
        }
    }
}
