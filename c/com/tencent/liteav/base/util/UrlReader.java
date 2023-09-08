package com.tencent.liteav.base.util;

import android.net.Uri;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@JNINamespace("liteav")
public class UrlReader {
    private static final int AVSEEK_SIZE = 65536;
    private static final int SEEK_CUR = 1;
    private static final int SEEK_END = 2;
    private static final int SEEK_SET = 0;
    private static final String TAG = "UrlReader";
    private int mFileSize;
    private long mOffset;
    private InputStream mStream;
    private Uri mUri;

    public UrlReader(String str) {
        this.mUri = Uri.parse(str);
        open();
    }

    private void open() {
        try {
            InputStream openInputStream = ContextUtils.getApplicationContext().getContentResolver().openInputStream(this.mUri);
            this.mStream = openInputStream;
            this.mFileSize = openInputStream.available();
        } catch (FileNotFoundException unused) {
            Log.m97546e(TAG, "Fail to open uri " + this.mUri.toString(), new Object[0]);
            this.mStream = null;
        } catch (IOException e) {
            Log.m97546e(TAG, "Fail to get file size " + e.getMessage(), new Object[0]);
            this.mStream = null;
        }
    }

    private long seekFromBegin(long j) {
        if (j < 0) {
            return -1;
        }
        close();
        open();
        InputStream inputStream = this.mStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            long skip = inputStream.skip(j);
            this.mOffset = skip;
            return skip;
        } catch (IOException e) {
            Log.m97546e(TAG, "Fail to seek " + j + " exception " + e.getMessage(), new Object[0]);
            return -1;
        }
    }

    private long seekFromCurrent(long j) {
        if (j < 0) {
            return seekFromBegin(this.mOffset + j);
        }
        try {
            long skip = this.mOffset + this.mStream.skip(j);
            this.mOffset = skip;
            return skip;
        } catch (IOException e) {
            Log.m97546e(TAG, "Fail to seek " + j + " exception " + e.getMessage(), new Object[0]);
            return -1;
        }
    }

    private long seekFromEnd(long j) {
        if (j > 0) {
            return -1;
        }
        long j2 = ((long) this.mFileSize) + j;
        if (j2 < 0) {
            return -1;
        }
        long j3 = this.mOffset;
        if (j2 < j3) {
            return seekFromBegin(j2);
        }
        try {
            long skip = j3 + this.mStream.skip(j2 - j3);
            this.mOffset = skip;
            return skip;
        } catch (IOException e) {
            Log.m97546e(TAG, "Fail to seek " + j + " exception " + e.getMessage(), new Object[0]);
            return -1;
        }
    }

    public void close() {
        InputStream inputStream = this.mStream;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.m97546e(TAG, "Close exception " + e.getMessage(), new Object[0]);
            }
        }
        this.mStream = null;
        this.mOffset = 0;
        this.mFileSize = 0;
    }

    public int read(byte[] bArr, int i) {
        InputStream inputStream = this.mStream;
        int i2 = -1;
        if (inputStream == null) {
            return -1;
        }
        try {
            i2 = inputStream.read(bArr, 0, i);
            this.mOffset += (long) i2;
            return i2;
        } catch (IOException e) {
            Log.m97546e(TAG, "Read exception " + e.getMessage(), new Object[0]);
            return i2;
        }
    }

    public long seek(long j, int i) {
        if (this.mStream == null) {
            return -1;
        }
        if (i == 0) {
            return seekFromBegin(j);
        }
        if (i == 1) {
            return seekFromCurrent(j);
        }
        if (i == 2) {
            return seekFromEnd(j);
        }
        if (i != 65536) {
            return -1;
        }
        return (long) this.mFileSize;
    }
}
