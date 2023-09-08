package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C116344z0;
import gy3.C87412m;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.j */
public final class C116303j implements C116344z0.C116345a {

    /* renamed from: a */
    public static final C116303j f349018a = new C116303j();

    /* renamed from: a */
    public final void mo177613a(String str, FileSystem fileSystem, int i, Map<String, Object> map) {
        String str2;
        C87412m.m108594g(str, "id");
        C87412m.m108594g(fileSystem, "<anonymous parameter 1>");
        C87412m.m108594g(map, "p");
        Object obj = map.get("op");
        String str3 = C116308l.f349027b.get(obj);
        if (str3 == null) {
            str3 = String.valueOf(obj);
        }
        Object obj2 = map.get("result");
        String str4 = C116308l.f349028c.get(obj2);
        if (str4 == null) {
            str4 = String.valueOf(obj2);
        }
        Object obj3 = map.get("path");
        Object obj4 = map.get("targetFS");
        Object obj5 = map.get("targetPath");
        if (obj4 == null) {
            str2 = '[' + str + "] (" + str3 + ") " + obj3 + " : " + str4;
        } else {
            str2 = '[' + str + "] (" + str3 + ") " + obj3 + " -> " + obj5 + '(' + obj4 + ") : " + str4;
        }
        if (C87412m.m108589b(map.get("result"), 2)) {
            AssertionError assertionError = new AssertionError("Operation rejected: " + str2);
            if ((C116306k.f349021a || (!WeChatEnvironment.hasDebugger() && !BuildInfo.DEBUG)) && C116299g2.m163853i("vfs_db_protect_assert") <= 0) {
                Log.printErrStackTrace("VFS.AccessLog", assertionError, "", new Object[0]);
                return;
            }
            throw assertionError;
        }
        Log.m105924i("VFS.AccessLog", str2);
    }
}
