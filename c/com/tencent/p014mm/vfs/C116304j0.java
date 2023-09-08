package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.stubs.logger.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import gy3.C87412m;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.j0 */
public final class C116304j0 implements C116344z0.C116345a {

    /* renamed from: a */
    public static final C116304j0 f349019a = new C116304j0();

    /* renamed from: a */
    public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, ? extends Object> map) {
        String str2;
        C87412m.m108594g(str, "id");
        C87412m.m108594g(fileSystem, "fs");
        C87412m.m108594g(map, "p");
        Object obj = map.get("op");
        String str3 = C75071z1.f220856b.get(obj);
        if (str3 == null) {
            str3 = String.valueOf(obj);
        }
        String str4 = "ok";
        if (!C87412m.m108589b(map.get(str4), Boolean.TRUE)) {
            str4 = StateEvent.ProcessResult.FAILED;
        }
        Object obj2 = map.get("path");
        Object obj3 = map.get("targetFS");
        Object obj4 = map.get("targetPath");
        if (obj3 == null) {
            str2 = '[' + str + "] (" + str3 + ") " + obj2 + " : " + str4;
        } else {
            str2 = '[' + str + "] (" + str3 + ") " + obj2 + " -> " + obj4 + '(' + obj3 + ") : " + str4;
        }
        Log.m106505i("VFS.AccessLog", str2);
    }
}
