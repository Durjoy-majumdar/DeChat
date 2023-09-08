package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat;
import com.tencent.qqmusic.mediaplayer.formatdetector.FormatDetector;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDataSource implements IDataSource {
    private long currentPosition;
    private InputStream currentStream;
    private final InputStreamFactory factory;
    private long size;

    public interface InputStreamFactory {
        InputStream create();
    }

    public InputStreamDataSource(InputStreamFactory inputStreamFactory) {
        this.factory = inputStreamFactory;
    }

    public void close() {
        InputStream inputStream = this.currentStream;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public AudioFormat.AudioType getAudioType() {
        return FormatDetector.getAudioFormat((IDataSource) this, false);
    }

    public long getSize() {
        return this.size;
    }

    public void open() {
        InputStream inputStream = this.currentStream;
        if (inputStream != null) {
            inputStream.close();
        }
        InputStream create = this.factory.create();
        this.currentStream = create;
        this.size = (long) create.available();
        this.currentPosition = 0;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        int i3;
        long j2 = this.currentPosition;
        if (j < j2) {
            open();
            return readAt(j, bArr, i, i2);
        }
        if (j > j2) {
            long j3 = j - j2;
            while (true) {
                long skip = this.currentStream.skip(j3);
                j3 -= skip;
                i3 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                if (i3 <= 0 && skip > 0) {
                    break;
                }
            }
            if (i3 >= 0) {
                this.currentPosition = j;
            } else {
                throw new IOException("skipped too much bytes");
            }
        }
        int read = this.currentStream.read(bArr, i, i2);
        if (read > 0) {
            this.currentPosition += (long) read;
        }
        return read;
    }
}
