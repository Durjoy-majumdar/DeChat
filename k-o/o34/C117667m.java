package o34;

import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import java.util.concurrent.atomic.AtomicLong;
import l34.C117454g;
import o34.C117668n;

/* renamed from: o34.m */
public class C117667m implements C117454g {

    /* renamed from: d */
    public final /* synthetic */ C117668n.C117669a f351947d;

    public C117667m(C117668n.C117669a aVar) {
        this.f351947d = aVar;
    }

    /* renamed from: h */
    public void mo123768h(long j) {
        long j2;
        long j3;
        if (j > 0) {
            AtomicLong atomicLong = this.f351947d.f351958r;
            do {
                j2 = atomicLong.get();
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                }
            } while (!atomicLong.compareAndSet(j2, j3));
            this.f351947d.mo182377j();
        }
    }
}
