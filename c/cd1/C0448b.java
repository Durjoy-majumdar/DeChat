package cd1;

import com.tencent.p014mm.sdk.platformtools.MD5Util;
import java.util.ArrayList;
import java.util.List;
import pe3.C47465a;
import sx3.C36907w;

/* renamed from: cd1.b */
public final class C0448b {

    /* renamed from: a */
    public static final C0448b f1074a = new C0448b();

    /* renamed from: a */
    public final String mo490a(List<?> list) {
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (T next : list) {
            arrayList.add(next instanceof C47465a ? MD5Util.getMD5String(((C47465a) next).toByteArray()) : String.valueOf(next));
        }
        return arrayList.toString();
    }
}
