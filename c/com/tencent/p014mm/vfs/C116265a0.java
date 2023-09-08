package com.tencent.p014mm.vfs;

import com.tencent.p014mm.vfs.C116344z0;
import com.tencent.stubs.logger.Log;
import gy3.C87412m;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.a0 */
public final class C116265a0 implements C116344z0.C116345a {

    /* renamed from: a */
    public static final C116265a0 f348896a = new C116265a0();

    /* renamed from: a */
    public void mo177613a(String str, FileSystem fileSystem, int i, Map<String, ? extends Object> map) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(fileSystem, "fs");
        C87412m.m108594g(map, "p");
        Object obj = map.get("deleteFiles");
        Object obj2 = map.get("deleteSize");
        Log.m106505i("VFS.Expire", '[' + str + "] deleted count: " + obj + ", size: " + obj2);
    }
}
