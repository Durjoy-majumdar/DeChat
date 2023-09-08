package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116344z0;

/* renamed from: com.tencent.mm.vfs.AbstractFileSystem */
public abstract class AbstractFileSystem implements FileSystem {

    /* renamed from: d */
    public C116344z0 f348691d = null;

    /* renamed from: a */
    public AbstractFileSystem mo177573a(String str, C116344z0.C116345a aVar) {
        this.f348691d = aVar == null ? null : new C116297g0(str, aVar);
        return this;
    }

    public int describeContents() {
        return 0;
    }
}
