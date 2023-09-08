package p348ih;

import android.media.MediaDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

/* renamed from: ih.i */
public class C21086i extends MediaDataSource {

    /* renamed from: d */
    public IDataSource f59636d;

    public C21086i(IDataSource iDataSource) {
        this.f59636d = iDataSource;
    }

    public void close() {
        IDataSource iDataSource = this.f59636d;
        if (iDataSource != null) {
            iDataSource.close();
            this.f59636d = null;
        }
    }

    public long getSize() {
        IDataSource iDataSource = this.f59636d;
        if (iDataSource != null) {
            return iDataSource.getSize();
        }
        return -1;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        IDataSource iDataSource = this.f59636d;
        if (iDataSource != null) {
            return iDataSource.readAt(j, bArr, i, i2);
        }
        return -1;
    }
}
