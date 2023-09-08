package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81463z;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import js0.C9514m;
import org.json.JSONArray;
import org.json.JSONObject;
import p225rc.C89914c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.n1 */
public class C82463n1 extends C82430g {
    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        LinkedList<C81463z> linkedList = new LinkedList<>();
        C9514m mVar = new C9514m();
        C81410b0 readDir = fVar.getFileSystem().readDir(str, mVar);
        C89914c.m112445a(linkedList, (List) mVar.f29691a);
        int ordinal = readDir.ordinal();
        if (ordinal != 0) {
            if (ordinal != 6) {
                if (ordinal == 8) {
                    return new C82446i("fail not a directory \"%s\"", str);
                } else if (ordinal == 10) {
                    return new C82446i("fail \"%s\" is not a regular file", str);
                } else if (ordinal != 3) {
                    if (ordinal != 4) {
                        return new C82446i("fail " + readDir.name(), new Object[0]);
                    }
                    return new C82446i("fail permission denied, open \"%s\"", str);
                }
            }
            return new C82446i("fail no such file or directory \"%s\"", str);
        }
        JSONArray jSONArray = new JSONArray();
        for (C81463z zVar : linkedList) {
            jSONArray.put(zVar.f239026a);
        }
        C82446i iVar = new C82446i("ok", new Object[0]);
        ((HashMap) iVar.f242316a).put("files", jSONArray);
        return iVar;
    }
}
