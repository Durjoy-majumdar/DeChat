package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.p014mm.vfs.MigrationFileSystem;
import java.io.IOException;

/* renamed from: com.tencent.mm.vfs.n0 */
public class C116313n0 implements C116299g2.C86006b<C86001b0> {

    /* renamed from: a */
    public final /* synthetic */ boolean[] f349032a;

    /* renamed from: b */
    public final /* synthetic */ FileSystem.C85995c f349033b;

    /* renamed from: c */
    public final /* synthetic */ FileSystem.C85995c f349034c;

    public C116313n0(MigrationFileSystem.C116222b bVar, boolean[] zArr, FileSystem.C85995c cVar, FileSystem.C85995c cVar2) {
        this.f349032a = zArr;
        this.f349033b = cVar;
        this.f349034c = cVar2;
    }

    public boolean accept(Object obj) {
        C86001b0 b0Var = (C86001b0) obj;
        try {
            boolean[] zArr = this.f349032a;
            FileSystem.C85995c cVar = this.f349033b;
            String str = b0Var.f250471a;
            zArr[0] = cVar.mo119946t(str, this.f349034c, str);
            return true ^ this.f349032a[0];
        } catch (IOException unused) {
            this.f349032a[0] = false;
            return true;
        }
    }
}
