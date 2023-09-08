package com.tencent.p014mm.plugin.mmsight.segment;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p823sg.C48380r;

/* renamed from: com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever */
public class FFmpegMetadataRetriever {
    public static final String METADATA_CHAPTER_COUNT = "chapter_count";
    public static final String METADATA_KEY_ALBUM = "album";
    public static final String METADATA_KEY_ALBUM_ARTIST = "album_artist";
    public static final String METADATA_KEY_ARTIST = "artist";
    public static final String METADATA_KEY_AUDIO_CODEC = "audio_codec";
    public static final String METADATA_KEY_CHAPTER_END_TIME = "chapter_end_time";
    public static final String METADATA_KEY_CHAPTER_START_TIME = "chapter_start_time";
    public static final String METADATA_KEY_COMMENT = "comment";
    public static final String METADATA_KEY_COMPOSER = "composer";
    public static final String METADATA_KEY_COPYRIGHT = "copyright";
    public static final String METADATA_KEY_CREATION_TIME = "creation_time";
    public static final String METADATA_KEY_DATE = "date";
    public static final String METADATA_KEY_DISC = "disc";
    public static final String METADATA_KEY_DURATION = "duration";
    public static final String METADATA_KEY_ENCODED_BY = "encoded_by";
    public static final String METADATA_KEY_ENCODER = "encoder";
    public static final String METADATA_KEY_FILENAME = "filename";
    public static final String METADATA_KEY_FILESIZE = "filesize";
    public static final String METADATA_KEY_FRAMERATE = "framerate";
    public static final String METADATA_KEY_GENRE = "genre";
    public static final String METADATA_KEY_ICY_METADATA = "icy_metadata";
    public static final String METADATA_KEY_LANGUAGE = "language";
    public static final String METADATA_KEY_PERFORMER = "performer";
    public static final String METADATA_KEY_PUBLISHER = "publisher";
    public static final String METADATA_KEY_SERVICE_NAME = "service_name";
    public static final String METADATA_KEY_SERVICE_PROVIDER = "service_provider";
    public static final String METADATA_KEY_TITLE = "title";
    public static final String METADATA_KEY_TRACK = "track";
    public static final String METADATA_KEY_VARIANT_BITRATE = "bitrate";
    public static final String METADATA_KEY_VIDEO_CODEC = "video_codec";
    public static final String METADATA_KEY_VIDEO_HEIGHT = "video_height";
    public static final String METADATA_KEY_VIDEO_ROTATION = "rotate";
    public static final String METADATA_KEY_VIDEO_WIDTH = "video_width";
    public static final int OPTION_CLOSEST = 3;
    public static final int OPTION_CLOSEST_SYNC = 2;
    public static final int OPTION_NEXT_SYNC = 1;
    public static final int OPTION_PREVIOUS_SYNC = 0;
    private static final String TAG = "FFmpegMetadataRetriever";
    private long mNativeContext;
    private Bitmap reuse;

    /* renamed from: com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever$a */
    public class C85288a {
        public C85288a() {
        }
    }

    static {
        native_init();
    }

    public FFmpegMetadataRetriever() {
        native_setup();
    }

    private native byte[] _getFrameAtTime(long j, int i);

    private native byte[] _getScaledFrameAtTime(long j, int i, int i2, int i3);

    private native void _setDataSource(String str, String[] strArr, String[] strArr2);

    private void _setDataSourceVFS(String str, String[] strArr, String[] strArr2) {
        _setDataSource(C48380r.m53726a(str, false), strArr, strArr2);
    }

    private Bitmap getBitmapFromPixels(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (i == -1) {
            i = getVideoWidth();
        }
        if (i2 == -1) {
            i2 = getVideoHeight();
        }
        if (i <= 0 || i2 <= 0) {
            throw new IllegalStateException(String.format(Locale.CHINA, "Can not get bitmap width and height [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        Bitmap bitmap = this.reuse;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        }
        bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        return bitmap;
    }

    private native void native_finalize();

    private final native HashMap<String, String> native_getMetadata(boolean z, boolean z2, HashMap<String, String> hashMap);

    private static native void native_init();

    private native void native_setup();

    public native String extractMetadata(String str);

    public native String extractMetadataFromChapter(String str, int i);

    public void finalize() {
        try {
            native_finalize();
        } catch (Exception unused) {
            Log.m105920e(TAG, "do nothing");
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    public Bitmap getFrameAtTime(long j, int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported option: " + i);
        }
        byte[] _getFrameAtTime = _getFrameAtTime(j, i);
        if (_getFrameAtTime != null) {
            return getBitmapFromPixels(_getFrameAtTime, -1, -1);
        }
        return null;
    }

    public C85288a getMetadata() {
        C85288a aVar = new C85288a();
        if (native_getMetadata(false, false, (HashMap<String, String>) null) == null) {
            return null;
        }
        return aVar;
    }

    public Bitmap getScaledFrameAtTime(long j, int i, int i2, int i3) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported option: " + i);
        }
        byte[] _getScaledFrameAtTime = _getScaledFrameAtTime(j, i, i2, i3);
        if (_getScaledFrameAtTime != null) {
            return getBitmapFromPixels(_getScaledFrameAtTime, i2, i3);
        }
        return null;
    }

    public byte[] getScaledFrameAtTimeUndecoded(long j, int i, int i2) {
        return _getScaledFrameAtTime(j, 2, i, i2);
    }

    public int getVideoHeight() {
        String str;
        try {
            String extractMetadata = extractMetadata(METADATA_KEY_VIDEO_ROTATION);
            if (!"90".equals(extractMetadata)) {
                if (!"270".equals(extractMetadata)) {
                    str = extractMetadata(METADATA_KEY_VIDEO_HEIGHT);
                    Log.m105919d(TAG, "video height %s rotate %s", str, extractMetadata);
                    return Integer.valueOf(str).intValue();
                }
            }
            str = extractMetadata(METADATA_KEY_VIDEO_WIDTH);
            Log.m105919d(TAG, "video height %s rotate %s", str, extractMetadata);
            return Integer.valueOf(str).intValue();
        } catch (Exception e) {
            Log.m105921e(TAG, "can not get video height %s", e.getMessage());
            return 0;
        }
    }

    public int getVideoRotation() {
        try {
            return Integer.valueOf(extractMetadata(METADATA_KEY_VIDEO_ROTATION)).intValue();
        } catch (Exception e) {
            Log.m105921e(TAG, "can not get video rotation. %s", e.getMessage());
            return 0;
        }
    }

    public int getVideoWidth() {
        String str;
        try {
            String extractMetadata = extractMetadata(METADATA_KEY_VIDEO_ROTATION);
            if (!"90".equals(extractMetadata)) {
                if (!"270".equals(extractMetadata)) {
                    str = extractMetadata(METADATA_KEY_VIDEO_WIDTH);
                    return Integer.valueOf(str).intValue();
                }
            }
            str = extractMetadata(METADATA_KEY_VIDEO_HEIGHT);
            return Integer.valueOf(str).intValue();
        } catch (Exception e) {
            Log.m105921e(TAG, "can not get video width %s", e.getMessage());
            return 0;
        }
    }

    public native void release();

    public void reuseBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmap2 = this.reuse;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.reuse = bitmap;
        }
    }

    public native void setDataSource(FileDescriptor fileDescriptor, long j, long j2);

    public void setDataSource(String str) {
        _setDataSourceVFS(str, (String[]) null, (String[]) null);
    }

    public void setDataSource(String str, Map<String, String> map) {
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            strArr[i] = (String) next.getKey();
            strArr2[i] = (String) next.getValue();
            i++;
        }
        _setDataSourceVFS(str, strArr, strArr2);
    }

    public Bitmap getFrameAtTime(long j) {
        byte[] _getFrameAtTime = _getFrameAtTime(j, 2);
        if (_getFrameAtTime != null) {
            return getBitmapFromPixels(_getFrameAtTime, -1, -1);
        }
        return null;
    }

    public Bitmap getScaledFrameAtTime(long j, int i, int i2) {
        byte[] _getScaledFrameAtTime = _getScaledFrameAtTime(j, 0, i, i2);
        if (_getScaledFrameAtTime != null) {
            return getBitmapFromPixels(_getScaledFrameAtTime, i, i2);
        }
        return null;
    }

    public Bitmap getFrameAtTime() {
        return getFrameAtTime(-1, 2);
    }

    public void setDataSource(FileDescriptor fileDescriptor) {
        setDataSource(fileDescriptor, 0, 576460752303423487L);
    }

    public void setDataSource(Context context, Uri uri) {
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme == null || scheme.equals("file")) {
                setDataSource(uri.getPath());
                return;
            }
            AssetFileDescriptor assetFileDescriptor = null;
            try {
                assetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptor != null) {
                    FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
                    if (fileDescriptor.valid()) {
                        if (assetFileDescriptor.getDeclaredLength() < 0) {
                            setDataSource(fileDescriptor);
                        } else {
                            setDataSource(fileDescriptor, assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
                        }
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (FileNotFoundException unused2) {
                throw new IllegalArgumentException();
            } catch (SecurityException unused3) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException unused4) {
                    }
                }
                setDataSource(uri.toString());
            } catch (Throwable th) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
