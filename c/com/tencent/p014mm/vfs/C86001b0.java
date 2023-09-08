package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.FileSystem;

/* renamed from: com.tencent.mm.vfs.b0 */
public class C86001b0 {

    /* renamed from: a */
    public final String f250471a;

    /* renamed from: b */
    public final String f250472b;

    /* renamed from: c */
    public final long f250473c;

    /* renamed from: d */
    public final long f250474d;

    /* renamed from: e */
    public final long f250475e;

    /* renamed from: f */
    public final boolean f250476f;

    /* renamed from: g */
    public final FileSystem.C85995c f250477g;

    public C86001b0(FileSystem.C85995c cVar, String str, String str2, long j, long j2, long j3, boolean z) {
        this.f250477g = cVar;
        this.f250471a = str;
        this.f250472b = str2;
        this.f250473c = j;
        this.f250474d = j2;
        this.f250475e = j3;
        this.f250476f = z;
    }

    /* renamed from: a */
    public boolean mo119954a() {
        return mo119955b(true);
    }

    /* renamed from: b */
    public boolean mo119955b(boolean z) {
        return this.f250476f ? this.f250477g.mo119942o(this.f250471a, z) : this.f250477g.mo119933c(this.f250471a);
    }

    /* renamed from: c */
    public boolean mo119956c() {
        return this instanceof C116326t0;
    }

    /* renamed from: d */
    public Iterable<C86001b0> mo119957d() {
        if (this.f250476f) {
            return this.f250477g.list(this.f250471a);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        if (this.f250476f) {
            sb.append("[DIR] ");
        }
        sb.append(this.f250471a);
        sb.append(" -> ");
        sb.append(this.f250477g);
        return sb.toString();
    }
}
