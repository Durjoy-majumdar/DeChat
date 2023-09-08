package rz3;

import gy3.C8480h;
import gy3.C87412m;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import my3.C61594j;
import sx3.C110818d0;
import sx3.C36904l0;
import sx3.C36907w;
import sz3.C110828a;

/* renamed from: rz3.a */
public final class C110670a extends C110828a {

    /* renamed from: f */
    public static final C110671a f331079f = new C110671a((C8480h) null);

    /* renamed from: g */
    public static final C110670a f331080g = new C110670a(1, 0, 7);

    /* renamed from: rz3.a$a */
    public static final class C110671a {
        public C110671a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C110670a mo162238a(InputStream inputStream) {
            C87412m.m108594g(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            C61594j jVar = new C61594j(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C36907w.m41090l(jVar, 10));
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                ((C36904l0) it).mo59695a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] x0 = C110818d0.m150952x0(arrayList);
            return new C110670a(Arrays.copyOf(x0, x0.length));
        }
    }

    static {
        new C110670a(new int[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110670a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C87412m.m108594g(iArr, "numbers");
    }
}
