package com.tencent.p014mm.vfs;

import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import fy3.C32226l;
import gy3.C87412m;
import java.util.Map;
import rx3.C13604l;
import sx3.C90364q0;

/* renamed from: com.tencent.mm.vfs.d */
public abstract class C75059d {

    /* renamed from: a */
    public final int f220839a;

    public C75059d(int i) {
        this.f220839a = i;
    }

    /* renamed from: a */
    public C32226l<FileSystem, FileSystem> mo104654a() {
        return null;
    }

    /* renamed from: b */
    public Map<String, Object> mo104655b(String str, String str2) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(str2, SharePatchInfo.OAT_DIR);
        return C90364q0.m113147f(new C13604l("name", str), new C13604l(SharePatchInfo.OAT_DIR, str2));
    }
}
