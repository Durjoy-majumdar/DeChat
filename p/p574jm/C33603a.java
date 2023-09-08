package p574jm;

import com.tencent.p014mm.storage.C30740g;
import di3.C86301e;
import ei3.C86522b;
import java.util.List;
import p586km.C46733b;
import p749xh.C38577i;
import yh0.C39021b;

@C86522b
/* renamed from: jm.a */
public class C33603a extends C86301e implements C46733b {
    public void Mt0(List<C38577i> list) {
        C30740g vx02 = C39021b.wx0().vx0();
        vx02.getClass();
        if (list != null && list.size() != 0) {
            long beginTransaction = vx02.f82669e.beginTransaction(Thread.currentThread().getId());
            for (C38577i replace : list) {
                vx02.replace(replace);
            }
            vx02.f82669e.endTransaction(beginTransaction);
        }
    }

    /* renamed from: Oi */
    public C38577i mo59220Oi() {
        return new C30740g.C30741a();
    }

    public void zi0(String str, int i, String str2) {
        C39021b.wx0().vx0().zi0(str, i, str2);
    }
}
