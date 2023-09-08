package wa2;

import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSourceFactory;
import com.tencent.qqmusic.mediaplayer.upstream.INativeDataSource;
import java.nio.ByteBuffer;
import nb0.C88915e;

/* renamed from: wa2.c */
public class C90903c implements IDataSourceFactory {

    /* renamed from: a */
    public C88915e f260893a;

    /* renamed from: b */
    public ByteBuffer f260894b;

    public C90903c(C88915e eVar) {
        this.f260893a = eVar;
    }

    public IDataSource createDataSource() {
        ByteBuffer byteBuffer = this.f260894b;
        return byteBuffer != null ? new C90901a(byteBuffer) : new C90902b(this.f260893a);
    }

    public INativeDataSource createNativeDataSource() {
        return null;
    }

    public C90903c(ByteBuffer byteBuffer) {
        this.f260894b = byteBuffer;
    }
}
