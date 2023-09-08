package x82;

import b92.C104065a;
import com.tencent.p014mm.plugin.multitalk.model.C105798e1;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import java.nio.ByteBuffer;

/* renamed from: x82.v */
public final class C112131v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ByteBuffer f335726d;

    /* renamed from: e */
    public final /* synthetic */ int f335727e;

    /* renamed from: f */
    public final /* synthetic */ int f335728f;

    public C112131v(C104065a aVar, ByteBuffer byteBuffer, int i, int i2) {
        this.f335726d = byteBuffer;
        this.f335727e = i;
        this.f335728f = i2;
    }

    public final void run() {
        ByteBuffer byteBuffer = this.f335726d;
        int i = this.f335727e;
        int i2 = this.f335728f;
        byteBuffer.position(0);
        int capacity = byteBuffer.capacity();
        byte[] bArr = new byte[capacity];
        byteBuffer.get(bArr);
        ((C105798e1) C105851w0.zx0().mo150677r()).mo150747b(false);
        ((C105798e1) C105851w0.zx0().mo150677r()).mo150746a(bArr, (long) capacity, i, i2, 4);
    }
}
