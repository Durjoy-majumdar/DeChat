package nd2;

import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.order.model.C70050a;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import qd2.C35831b;
import yq3.C79143a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: nd2.c */
public class C76853c extends C86301e {

    /* renamed from: d */
    public MMHandler f224680d = new MMHandler(Looper.getMainLooper());

    /* renamed from: e */
    public C35831b f224681e;

    /* renamed from: f */
    public C70050a f224682f = null;

    /* renamed from: g */
    public List<WeakReference<C76854a>> f224683g = new ArrayList();

    /* renamed from: nd2.c$a */
    public interface C76854a {
        void onChange();
    }

    static {
        C79143a.m95769h("ShowOrdersInfoProcess", C76852b.class);
    }

    public static C76853c vx0() {
        return (C76853c) C86312j.m106911c(C76853c.class);
    }

    public C70050a wx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224682f == null) {
            vx0().f224682f = new C70050a();
        }
        return vx0().f224682f;
    }

    public C35831b xx0() {
        C86709a0.m107523b().mo121108c();
        if (vx0().f224681e == null) {
            C76853c vx02 = vx0();
            C86709a0.m107528h();
            vx02.f224681e = new C35831b(C86709a0.m107535s().f251811i);
        }
        return vx0().f224681e;
    }
}
