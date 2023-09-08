package com.tencent.p014mm.plugin.performance.watchdogs;

import com.tencent.p014mm.matrix.dice.C80982a;
import h81.C32735h;
import p761yd.C38993b;

/* renamed from: com.tencent.mm.plugin.performance.watchdogs.MemoryWatchDog$$c */
public class MemoryWatchDog$$c implements C80982a.C80983a {

    /* renamed from: d */
    public final /* synthetic */ MemoryWatchDog f248598d;

    public MemoryWatchDog$$c(MemoryWatchDog memoryWatchDog) {
        this.f248598d = memoryWatchDog;
    }

    /* renamed from: S1 */
    public double mo55862S1() {
        return 1.0d / ((double) C38993b.m41991a(C32735h.C32737c.clicfg_diagnostic_memory_hook_auto_trigger_rate_denominator, -1));
    }

    public long b00() {
        return 0;
    }

    /* renamed from: kD */
    public void mo55864kD(double d) {
        this.f248598d.f248590u = true;
    }

    public String key() {
        return "MicroMsg.MemoryWatchDog";
    }
}
