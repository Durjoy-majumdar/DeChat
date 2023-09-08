package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116296g;
import com.tencent.stubs.logger.Log;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.y0 */
public class C116342y0<Base extends C116296g<State>, State> {

    /* renamed from: a */
    public final Base f349131a;

    /* renamed from: b */
    public State f349132b;

    public C116342y0(Base base) {
        this.f349131a = base;
    }

    /* renamed from: a */
    public State mo177854a(Map<String, Object> map, String str) {
        if (this.f349132b == null) {
            this.f349132b = this.f349131a.mo177578v(map);
            Log.m106505i("VFS.FileSystemManager", "configure: " + str + " => " + this.f349132b);
        }
        return this.f349132b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C116342y0) && this.f349131a.equals(((C116342y0) obj).f349131a);
    }

    public int hashCode() {
        return C116342y0.class.hashCode() ^ this.f349131a.hashCode();
    }

    public String toString() {
        Base base = this.f349131a;
        return base == null ? "[NULL]" : base.toString();
    }
}
