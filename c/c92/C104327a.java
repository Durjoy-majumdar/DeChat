package c92;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105714w;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import nw3.C109779e;

/* renamed from: c92.a */
public final class C104327a {

    /* renamed from: a */
    public static final C104327a f308804a = new C104327a();

    /* renamed from: a */
    public final int mo146022a(int i, int i2) {
        boolean z;
        if (C105851w0.zx0().f314506t != null) {
            z = C105851w0.zx0().mo150681w(C105851w0.zx0().f314506t.f320042d);
        } else {
            z = false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.order(ByteOrder.LITTLE_ENDIAN).putInt(i2);
        if (z) {
            C105724z zVar = C105724z.INSTANCE;
            byte[] array = allocate.array();
            zVar.getClass();
            return C105714w.m141918c(i, array, 4);
        }
        return ((C109779e) C105851w0.xx0().f314798d).mo161038i(i, allocate.array(), 4);
    }

    /* renamed from: b */
    public final int mo146023b(boolean z, int i) {
        if (!z) {
            i = -1;
        }
        int a = mo146022a(22, i);
        if (a < 0) {
            return -1;
        }
        return a;
    }
}
