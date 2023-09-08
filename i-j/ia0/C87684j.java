package ia0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import sx3.C110818d0;

/* renamed from: ia0.j */
public final class C87684j {

    /* renamed from: a */
    public ArrayList<ByteBuffer> f253964a = new ArrayList<>();

    /* renamed from: b */
    public int f253965b;

    /* renamed from: a */
    public final void mo122117a(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) C110818d0.m150916N(this.f253964a);
        if (!(byteBuffer != null && byteBuffer.capacity() == i)) {
            Log.m105924i("MicroMsg.FinderTemplateCorePlugin", "checkInit size:" + i);
            for (ByteBuffer clear : this.f253964a) {
                clear.clear();
            }
            this.f253964a.clear();
            for (int i2 = 0; i2 < 6; i2++) {
                this.f253964a.add(ByteBuffer.allocateDirect(i));
            }
        }
    }
}
