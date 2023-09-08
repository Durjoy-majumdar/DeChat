package androidx.camera.core.internal;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.utils.ExifData;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;

public class YuvToJpegProcessor implements CaptureProcessor {
    private static final String TAG = "YuvToJpegProcessor";
    private static final Rect UNINITIALIZED_RECT = new Rect(0, 0, 0, 0);
    public C117512b.C117513a<Void> mCloseCompleter;
    private C112608f<Void> mCloseFuture;
    private boolean mClosed = false;
    private Rect mImageRect = UNINITIALIZED_RECT;
    private ImageWriter mImageWriter;
    private final Object mLock = new Object();
    private final int mMaxImages;
    private int mProcessingImages = 0;
    private int mQuality;
    private int mRotationDegrees = 0;

    public YuvToJpegProcessor(int i, int i2) {
        this.mQuality = i;
        this.mMaxImages = i2;
    }

    private static ExifData getExifData(ImageProxy imageProxy, int i) {
        ExifData.Builder builderForDevice = ExifData.builderForDevice();
        imageProxy.getImageInfo().populateExifData(builderForDevice);
        builderForDevice.setOrientationDegrees(i);
        return builderForDevice.setImageWidth(imageProxy.getWidth()).setImageHeight(imageProxy.getHeight()).build();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$getCloseFuture$0(C117512b.C117513a aVar) {
        synchronized (this.mLock) {
            this.mCloseCompleter = aVar;
        }
        return "YuvToJpegProcessor-close";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r1.mo182231a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mLock
            monitor-enter(r0)
            boolean r1 = r4.mClosed     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0009:
            r1 = 1
            r4.mClosed = r1     // Catch:{ all -> 0x0033 }
            int r1 = r4.mProcessingImages     // Catch:{ all -> 0x0033 }
            r2 = 0
            if (r1 != 0) goto L_0x0024
            android.media.ImageWriter r1 = r4.mImageWriter     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = "YuvToJpegProcessor"
            java.lang.String r3 = "No processing in progress. Closing immediately."
            androidx.camera.core.Logger.m15471d(r1, r3)     // Catch:{ all -> 0x0033 }
            android.media.ImageWriter r1 = r4.mImageWriter     // Catch:{ all -> 0x0033 }
            r1.close()     // Catch:{ all -> 0x0033 }
            m2.b$a<java.lang.Void> r1 = r4.mCloseCompleter     // Catch:{ all -> 0x0033 }
            goto L_0x002c
        L_0x0024:
            java.lang.String r1 = "YuvToJpegProcessor"
            java.lang.String r3 = "close() called while processing. Will close after completion."
            androidx.camera.core.Logger.m15471d(r1, r3)     // Catch:{ all -> 0x0033 }
            r1 = r2
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0032
            r1.mo182231a(r2)
        L_0x0032:
            return
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.YuvToJpegProcessor.close():void");
    }

    public C112608f<Void> getCloseFuture() {
        C112608f<Void> fVar;
        synchronized (this.mLock) {
            if (!this.mClosed || this.mProcessingImages != 0) {
                if (this.mCloseFuture == null) {
                    this.mCloseFuture = C117512b.m165760a(new YuvToJpegProcessor$$a(this));
                }
                fVar = Futures.nonCancellationPropagating(this.mCloseFuture);
            } else {
                fVar = Futures.immediateFuture(null);
            }
        }
        return fVar;
    }

    public void onOutputSurface(Surface surface, int i) {
        C20434g.m22021e(i == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.mLock) {
            if (this.mClosed) {
                Logger.m15477w(TAG, "Cannot set output surface. Processor is closed.");
            } else if (this.mImageWriter == null) {
                this.mImageWriter = ImageWriterCompat.newInstance(surface, this.mMaxImages, i);
            } else {
                throw new IllegalStateException("Output surface already set.");
            }
        }
    }

    public void onResolutionUpdate(Size size) {
        synchronized (this.mLock) {
            this.mImageRect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0143  */
    public void process(androidx.camera.core.impl.ImageProxyBundle r20) {
        /*
            r19 = this;
            r1 = r19
            java.util.List r0 = r20.getCaptureIds()
            int r2 = r0.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0010
            r2 = 1
            goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Processing image bundle have single capture id, but found "
            r5.append(r6)
            int r6 = r0.size()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            p329d3.C20434g.m22018b(r2, r5)
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2 = r20
            z8.f r0 = r2.getImageProxy(r0)
            boolean r2 = r0.isDone()
            p329d3.C20434g.m22017a(r2)
            java.lang.Object r2 = r1.mLock
            monitor-enter(r2)
            android.media.ImageWriter r5 = r1.mImageWriter     // Catch:{ all -> 0x01ce }
            boolean r6 = r1.mClosed     // Catch:{ all -> 0x01ce }
            if (r6 != 0) goto L_0x004b
            r6 = 1
            goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            android.graphics.Rect r7 = r1.mImageRect     // Catch:{ all -> 0x01ce }
            if (r6 == 0) goto L_0x0055
            int r8 = r1.mProcessingImages     // Catch:{ all -> 0x01ce }
            int r8 = r8 + r4
            r1.mProcessingImages = r8     // Catch:{ all -> 0x01ce }
        L_0x0055:
            int r8 = r1.mQuality     // Catch:{ all -> 0x01ce }
            int r9 = r1.mRotationDegrees     // Catch:{ all -> 0x01ce }
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
            r2 = 0
            java.lang.Object r10 = r0.get()     // Catch:{ Exception -> 0x013e, all -> 0x013a }
            androidx.camera.core.ImageProxy r10 = (androidx.camera.core.ImageProxy) r10     // Catch:{ Exception -> 0x013e, all -> 0x013a }
            if (r6 != 0) goto L_0x0099
            java.lang.String r0 = "YuvToJpegProcessor"
            java.lang.String r7 = "Image enqueued for processing on closed processor."
            androidx.camera.core.Logger.m15477w(r0, r7)     // Catch:{ Exception -> 0x0137, all -> 0x0134 }
            r10.close()     // Catch:{ Exception -> 0x0137, all -> 0x0134 }
            java.lang.Object r7 = r1.mLock
            monitor-enter(r7)
            if (r6 == 0) goto L_0x0082
            int r0 = r1.mProcessingImages     // Catch:{ all -> 0x0080 }
            int r6 = r0 + -1
            r1.mProcessingImages = r6     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0082
            boolean r0 = r1.mClosed     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0082
        L_0x0080:
            r0 = move-exception
            goto L_0x0097
        L_0x0082:
            m2.b$a<java.lang.Void> r0 = r1.mCloseCompleter     // Catch:{ all -> 0x0080 }
            monitor-exit(r7)     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0096
            r5.close()
            java.lang.String r3 = "YuvToJpegProcessor"
            java.lang.String r4 = "Closed after completion of last image processed."
            androidx.camera.core.Logger.m15471d(r3, r4)
            if (r0 == 0) goto L_0x0096
            r0.mo182231a(r2)
        L_0x0096:
            return
        L_0x0097:
            monitor-exit(r7)     // Catch:{ all -> 0x0080 }
            throw r0
        L_0x0099:
            android.media.Image r11 = r5.dequeueInputImage()     // Catch:{ Exception -> 0x0137, all -> 0x0134 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0132 }
            r12 = r0
            androidx.camera.core.ImageProxy r12 = (androidx.camera.core.ImageProxy) r12     // Catch:{ Exception -> 0x0132 }
            int r0 = r12.getFormat()     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            r10 = 35
            if (r0 != r10) goto L_0x00ae
            r0 = 1
            goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            java.lang.String r10 = "Input image is not expected YUV_420_888 image format"
            p329d3.C20434g.m22021e(r0, r10)     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            byte[] r14 = androidx.camera.core.internal.utils.ImageUtil.yuv_420_888toNv21(r12)     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            android.graphics.YuvImage r0 = new android.graphics.YuvImage     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            r15 = 17
            int r16 = r12.getWidth()     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            int r17 = r12.getHeight()     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            r18 = 0
            r13 = r0
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            android.media.Image$Plane[] r10 = r11.getPlanes()     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            r10 = r10[r3]     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            java.nio.ByteBuffer r10 = r10.getBuffer()     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            int r13 = r10.position()     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            androidx.camera.core.impl.utils.ExifOutputStream r14 = new androidx.camera.core.impl.utils.ExifOutputStream     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            androidx.camera.core.internal.YuvToJpegProcessor$ByteBufferOutputStream r15 = new androidx.camera.core.internal.YuvToJpegProcessor$ByteBufferOutputStream     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            r15.<init>(r10)     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            androidx.camera.core.impl.utils.ExifData r9 = getExifData(r12, r9)     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            r14.<init>(r15, r9)     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            r0.compressToJpeg(r7, r8, r14)     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            r12.close()     // Catch:{ Exception -> 0x012f, all -> 0x012c }
            int r0 = r10.position()     // Catch:{ Exception -> 0x0129, all -> 0x0126 }
            r10.limit(r0)     // Catch:{ Exception -> 0x0129, all -> 0x0126 }
            r10.position(r13)     // Catch:{ Exception -> 0x0129, all -> 0x0126 }
            r5.queueInputImage(r11)     // Catch:{ Exception -> 0x0129, all -> 0x0126 }
            java.lang.Object r7 = r1.mLock
            monitor-enter(r7)
            if (r6 == 0) goto L_0x010e
            int r0 = r1.mProcessingImages     // Catch:{ all -> 0x010c }
            int r6 = r0 + -1
            r1.mProcessingImages = r6     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x010e
            boolean r0 = r1.mClosed     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x010e
            r3 = 1
            goto L_0x010e
        L_0x010c:
            r0 = move-exception
            goto L_0x0124
        L_0x010e:
            m2.b$a<java.lang.Void> r0 = r1.mCloseCompleter     // Catch:{ all -> 0x010c }
            monitor-exit(r7)     // Catch:{ all -> 0x010c }
            if (r3 == 0) goto L_0x01cb
            r5.close()
            java.lang.String r3 = "YuvToJpegProcessor"
            java.lang.String r4 = "Closed after completion of last image processed."
            androidx.camera.core.Logger.m15471d(r3, r4)
            if (r0 == 0) goto L_0x01cb
        L_0x011f:
            r0.mo182231a(r2)
            goto L_0x01cb
        L_0x0124:
            monitor-exit(r7)     // Catch:{ all -> 0x010c }
            throw r0
        L_0x0126:
            r0 = move-exception
            r10 = r2
            goto L_0x0163
        L_0x0129:
            r0 = move-exception
            r10 = r2
            goto L_0x0141
        L_0x012c:
            r0 = move-exception
            r10 = r12
            goto L_0x0163
        L_0x012f:
            r0 = move-exception
            r10 = r12
            goto L_0x0141
        L_0x0132:
            r0 = move-exception
            goto L_0x0141
        L_0x0134:
            r0 = move-exception
            r11 = r2
            goto L_0x0163
        L_0x0137:
            r0 = move-exception
            r11 = r2
            goto L_0x0141
        L_0x013a:
            r0 = move-exception
            r10 = r2
            r11 = r10
            goto L_0x0163
        L_0x013e:
            r0 = move-exception
            r10 = r2
            r11 = r10
        L_0x0141:
            if (r6 == 0) goto L_0x0199
            java.lang.String r7 = "YuvToJpegProcessor"
            java.lang.String r8 = "Failed to process YUV -> JPEG"
            androidx.camera.core.Logger.m15474e(r7, r8, r0)     // Catch:{ all -> 0x0162 }
            android.media.Image r11 = r5.dequeueInputImage()     // Catch:{ all -> 0x0162 }
            android.media.Image$Plane[] r0 = r11.getPlanes()     // Catch:{ all -> 0x0162 }
            r0 = r0[r3]     // Catch:{ all -> 0x0162 }
            java.nio.ByteBuffer r0 = r0.getBuffer()     // Catch:{ all -> 0x0162 }
            r0.rewind()     // Catch:{ all -> 0x0162 }
            r0.limit(r3)     // Catch:{ all -> 0x0162 }
            r5.queueInputImage(r11)     // Catch:{ all -> 0x0162 }
            goto L_0x0199
        L_0x0162:
            r0 = move-exception
        L_0x0163:
            java.lang.Object r7 = r1.mLock
            monitor-enter(r7)
            if (r6 == 0) goto L_0x0178
            int r6 = r1.mProcessingImages     // Catch:{ all -> 0x0176 }
            int r8 = r6 + -1
            r1.mProcessingImages = r8     // Catch:{ all -> 0x0176 }
            if (r6 != 0) goto L_0x0178
            boolean r6 = r1.mClosed     // Catch:{ all -> 0x0176 }
            if (r6 == 0) goto L_0x0178
            r3 = 1
            goto L_0x0178
        L_0x0176:
            r0 = move-exception
            goto L_0x0197
        L_0x0178:
            m2.b$a<java.lang.Void> r4 = r1.mCloseCompleter     // Catch:{ all -> 0x0176 }
            monitor-exit(r7)     // Catch:{ all -> 0x0176 }
            if (r11 == 0) goto L_0x0180
            r11.close()
        L_0x0180:
            if (r10 == 0) goto L_0x0185
            r10.close()
        L_0x0185:
            if (r3 == 0) goto L_0x0196
            r5.close()
            java.lang.String r3 = "YuvToJpegProcessor"
            java.lang.String r5 = "Closed after completion of last image processed."
            androidx.camera.core.Logger.m15471d(r3, r5)
            if (r4 == 0) goto L_0x0196
            r4.mo182231a(r2)
        L_0x0196:
            throw r0
        L_0x0197:
            monitor-exit(r7)     // Catch:{ all -> 0x0176 }
            throw r0
        L_0x0199:
            java.lang.Object r7 = r1.mLock
            monitor-enter(r7)
            if (r6 == 0) goto L_0x01ae
            int r0 = r1.mProcessingImages     // Catch:{ all -> 0x01ac }
            int r6 = r0 + -1
            r1.mProcessingImages = r6     // Catch:{ all -> 0x01ac }
            if (r0 != 0) goto L_0x01ae
            boolean r0 = r1.mClosed     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x01ae
            r3 = 1
            goto L_0x01ae
        L_0x01ac:
            r0 = move-exception
            goto L_0x01cc
        L_0x01ae:
            m2.b$a<java.lang.Void> r0 = r1.mCloseCompleter     // Catch:{ all -> 0x01ac }
            monitor-exit(r7)     // Catch:{ all -> 0x01ac }
            if (r11 == 0) goto L_0x01b6
            r11.close()
        L_0x01b6:
            if (r10 == 0) goto L_0x01bb
            r10.close()
        L_0x01bb:
            if (r3 == 0) goto L_0x01cb
            r5.close()
            java.lang.String r3 = "YuvToJpegProcessor"
            java.lang.String r4 = "Closed after completion of last image processed."
            androidx.camera.core.Logger.m15471d(r3, r4)
            if (r0 == 0) goto L_0x01cb
            goto L_0x011f
        L_0x01cb:
            return
        L_0x01cc:
            monitor-exit(r7)     // Catch:{ all -> 0x01ac }
            throw r0
        L_0x01ce:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01ce }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.YuvToJpegProcessor.process(androidx.camera.core.impl.ImageProxyBundle):void");
    }

    public void setJpegQuality(int i) {
        synchronized (this.mLock) {
            this.mQuality = i;
        }
    }

    public void setRotationDegrees(int i) {
        synchronized (this.mLock) {
            this.mRotationDegrees = i;
        }
    }

    public static final class ByteBufferOutputStream extends OutputStream {
        private final ByteBuffer mByteBuffer;

        public ByteBufferOutputStream(ByteBuffer byteBuffer) {
            this.mByteBuffer = byteBuffer;
        }

        public void write(int i) {
            if (this.mByteBuffer.hasRemaining()) {
                this.mByteBuffer.put((byte) i);
                return;
            }
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }

        public void write(byte[] bArr, int i, int i2) {
            int i3;
            bArr.getClass();
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            } else if (i2 != 0) {
                if (this.mByteBuffer.remaining() >= i2) {
                    this.mByteBuffer.put(bArr, i, i2);
                    return;
                }
                throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
            }
        }
    }
}
