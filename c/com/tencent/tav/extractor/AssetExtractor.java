package com.tencent.tav.extractor;

import android.media.MediaFormat;
import com.tencent.tav.ResourceLoadUtil;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.decoder.DecoderUtils;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.extractor.wrapper.ExtractorLoader;
import com.tencent.tav.extractor.wrapper.ExtractorWrapperPool;
import j20.C117292a;
import java.io.FileDescriptor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.Map;
import k20.C9556a;

public class AssetExtractor implements Cloneable {
    public static boolean DOWNGRADING = false;
    public static final int SAMPLE_FLAG_ENCRYPTED = 2;
    public static final int SAMPLE_FLAG_SYNC = 1;
    public static final int SEEK_TO_CLOSEST_SYNC = 2;
    public static final int SEEK_TO_NEXT_SYNC = 1;
    public static final int SEEK_TO_PREVIOUS_SYNC = 0;
    private final String TAG;
    private byte _hellAccFlag_;
    private IExtractorDelegate delegate;
    private long duration;
    private long mNativeContext;
    private int preferRotation;
    private boolean released;
    private CGSize size;
    private String sourcePath;

    @Retention(RetentionPolicy.SOURCE)
    public @interface SampleFlag {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SeekMode {
    }

    static {
        if (ResourceLoadUtil.isLoaded()) {
            nativeInit();
        } else {
            System.out.println("loadlibrary : tav start");
            try {
                C9556a aVar = new C9556a();
                aVar.mo10233c("tav");
                Object obj = new Object();
                C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/tav/extractor/AssetExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                System.loadLibrary((String) aVar.mo10231a(0));
                C117292a.m165359e(obj, "com/tencent/tav/extractor/AssetExtractor", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
                ResourceLoadUtil.setLoaded(true);
                nativeInit();
            } catch (Throwable unused) {
            }
        }
    }

    public AssetExtractor() {
        this(DOWNGRADING);
    }

    private native synchronized boolean advanceNative();

    private native synchronized long getSampleTimeNative();

    private native synchronized int getSampleTrackIndexNative();

    private final native synchronized int getTrackCountNative();

    private native synchronized Map<String, Object> getTrackFormatNative(int i);

    private final native synchronized void nativeFinalize();

    private static final native synchronized void nativeInit();

    private native synchronized int readSampleDataNative(ByteBuffer byteBuffer, int i);

    private final native synchronized void releaseNative();

    private native void seekToNative(long j, int i);

    private native synchronized void selectTrackNative(int i);

    private native synchronized void unselectTrackNative(int i);

    public synchronized boolean advance() {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.advance();
        } else if (this.released) {
            return false;
        } else {
            return advanceNative();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void dispose() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.sourcePath     // Catch:{ all -> 0x003a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r3)
            return
        L_0x000b:
            boolean r0 = r3.released     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x002e
            com.tencent.tav.extractor.IExtractorDelegate r0 = r3.delegate     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r3.TAG     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r1.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "dispose: sourcePath = "
            r1.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = r3.sourcePath     // Catch:{ all -> 0x003a }
            r1.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003a }
            com.tencent.tav.decoder.logger.Logger.m144646i(r0, r1)     // Catch:{ all -> 0x003a }
            r3.releaseNative()     // Catch:{ all -> 0x003a }
        L_0x002e:
            com.tencent.tav.extractor.IExtractorDelegate r0 = r3.delegate     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0038
            r0.release()     // Catch:{ all -> 0x003a }
            r0 = 0
            r3.delegate = r0     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r3)
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.extractor.AssetExtractor.dispose():void");
    }

    public void finalize() {
        if (this.delegate == null && !this.released) {
            synchronized (this) {
                if (!this.released) {
                    this.released = true;
                    nativeFinalize();
                }
            }
        }
    }

    public synchronized long getAudioDuration() {
        return DecoderUtils.getAudioDuration(this);
    }

    public synchronized long getDuration() {
        if (this.duration == 0) {
            this.duration = DecoderUtils.getDuration(this);
        }
        return this.duration;
    }

    public synchronized int getPreferRotation() {
        if (this.preferRotation == -1) {
            this.preferRotation = ExtractorUtils.getPreferRotation(this);
        }
        return this.preferRotation;
    }

    public native int getSampleFlags();

    public synchronized long getSampleTime() {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.getSampleTime();
        } else if (this.released) {
            return -1;
        } else {
            return getSampleTimeNative();
        }
    }

    public synchronized int getSampleTrackIndex() {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.getSampleTrackIndex();
        } else if (this.released) {
            return -1;
        } else {
            return getSampleTrackIndexNative();
        }
    }

    public synchronized CGSize getSize() {
        if (this.size == null) {
            this.size = ExtractorUtils.getVideoSize(this);
        }
        return this.size;
    }

    public String getSourcePath() {
        return this.sourcePath;
    }

    public final synchronized int getTrackCount() {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.getTrackCount();
        } else if (this.released) {
            return 0;
        } else {
            return getTrackCountNative();
        }
    }

    public synchronized MediaFormat getTrackFormat(int i) {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            MediaFormat trackFormat = iExtractorDelegate.getTrackFormat(i);
            String str = this.TAG;
            Logger.m144648v(str, "getTrackFormat(delegate): index = " + i + ", format = " + trackFormat);
            return trackFormat;
        }
        MediaFormat mediaFormat = new MediaFormat();
        if (this.released) {
            return mediaFormat;
        }
        Map<String, Object> trackFormatNative = getTrackFormatNative(i);
        try {
            Field declaredField = MediaFormat.class.getDeclaredField("mMap");
            declaredField.setAccessible(true);
            declaredField.set(mediaFormat, trackFormatNative);
        } catch (Exception e) {
            e.getMessage();
        }
        String str2 = this.TAG;
        Logger.m144648v(str2, "getTrackFormat: index = " + i + ", format = " + mediaFormat);
        return mediaFormat;
    }

    public boolean isReleased() {
        return this.released;
    }

    public boolean needMirror() {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            return iExtractorDelegate.needMirror();
        }
        return true;
    }

    public synchronized int readSampleData(ByteBuffer byteBuffer, int i) {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            int readSampleData = iExtractorDelegate.readSampleData(byteBuffer, i);
            String str = this.TAG;
            Logger.m144648v(str, "readSampleData(delegate): ret = " + readSampleData + ", buf = " + byteBuffer);
            return readSampleData;
        } else if (this.released) {
            return -1;
        } else {
            int readSampleDataNative = readSampleDataNative(byteBuffer, i);
            String str2 = this.TAG;
            Logger.m144648v(str2, "readSampleData: ret = " + readSampleDataNative + ", buf = " + byteBuffer);
            return readSampleDataNative;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void release() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.tav.extractor.IExtractorDelegate r0 = r1.delegate     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x000d
            r0.release()     // Catch:{ all -> 0x0019 }
            r0 = 0
            r1.delegate = r0     // Catch:{ all -> 0x0019 }
            monitor-exit(r1)
            return
        L_0x000d:
            boolean r0 = r1.released     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            r1.releaseNative()     // Catch:{ all -> 0x0019 }
            r0 = 1
            r1.released = r0     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r1)
            return
        L_0x0019:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.extractor.AssetExtractor.release():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void seekTo(long r4, int r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.TAG     // Catch:{ all -> 0x0036 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "seekTo() called with: timeUs = ["
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            r1.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "], mode = ["
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            r1.append(r6)     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "]"
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0036 }
            com.tencent.tav.decoder.logger.Logger.m144648v(r0, r1)     // Catch:{ all -> 0x0036 }
            com.tencent.tav.extractor.IExtractorDelegate r0 = r3.delegate     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x002d
            r0.seekTo(r4, r6)     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)
            return
        L_0x002d:
            boolean r0 = r3.released     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0034
            r3.seekToNative(r4, r6)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r3)
            return
        L_0x0036:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.extractor.AssetExtractor.seekTo(long, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void selectTrack(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.tav.extractor.IExtractorDelegate r0 = r1.delegate     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x000a
            r0.selectTrack(r2)     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return
        L_0x000a:
            boolean r0 = r1.released     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0011
            r1.selectTrackNative(r2)     // Catch:{ all -> 0x0013 }
        L_0x0011:
            monitor-exit(r1)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.extractor.AssetExtractor.selectTrack(int):void");
    }

    public final native void setDataSource(FileDescriptor fileDescriptor, long j, long j2);

    public final synchronized void setDataSource(String str) {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.setDataSource(str);
        }
        this.sourcePath = str;
        if (ExtractorWrapperPool.contains(str)) {
            ExtractorWrapperPool.fillIn(this.sourcePath, this);
        } else {
            ExtractorLoader.cacheExtractor(str);
        }
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public synchronized void setIsSoft(boolean z) {
        IExtractorDelegate iExtractorDelegate = this.delegate;
        if (iExtractorDelegate != null) {
            iExtractorDelegate.setIsSoft(z);
        }
    }

    public void setPreferRotation(int i) {
        this.preferRotation = i;
    }

    public void setSize(CGSize cGSize) {
        this.size = cGSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void unselectTrack(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.tencent.tav.extractor.IExtractorDelegate r0 = r1.delegate     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x000a
            r0.unselectTrack(r2)     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return
        L_0x000a:
            boolean r0 = r1.released     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0011
            r1.unselectTrackNative(r2)     // Catch:{ all -> 0x0013 }
        L_0x0011:
            monitor-exit(r1)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.extractor.AssetExtractor.unselectTrack(int):void");
    }

    public AssetExtractor(boolean z) {
        this.TAG = "AssetExtractor@" + Integer.toHexString(hashCode());
        this.released = false;
        this.mNativeContext = 0;
        this.sourcePath = "";
        this.duration = 0;
        this.size = null;
        this.preferRotation = -1;
        if (z) {
            this.delegate = ExtractorDelegateFactory.createDelegate();
        }
    }

    public AssetExtractor clone() {
        AssetExtractor assetExtractor = new AssetExtractor();
        assetExtractor.setSize(getSize());
        assetExtractor.setPreferRotation(getPreferRotation());
        assetExtractor.setDuration(getDuration());
        assetExtractor.setDataSource(this.sourcePath);
        return assetExtractor;
    }
}
