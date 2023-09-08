package af3;

import df3.C86274c;
import java.util.ArrayList;

/* renamed from: af3.a */
public class C16465a extends C16467c {
    public C16465a(String str) {
        super(str);
    }

    /* renamed from: b */
    public void mo14948b() {
        ((ArrayList) this.f57487a).add(new C86274c.C20456b.C20458b(".cmd.diagnostic.MemoryHook.$enable", false));
        ((ArrayList) this.f57487a).add(new C86274c.C20456b.C20458b(".cmd.diagnostic.PthreadHook.$enable", false));
        ((ArrayList) this.f57487a).add(new C86274c.C20456b.C20459c(".cmd.diagnostic.MemoryHook.crash", Integer.MAX_VALUE));
        ((ArrayList) this.f57487a).add(new C86274c.C20456b.C20459c(".cmd.diagnostic.PthreadHook.crash", Integer.MAX_VALUE));
    }
}
