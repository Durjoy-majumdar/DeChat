package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81432q0;
import com.tencent.p014mm.plugin.appbrand.appstorage.FileStructStat;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.s1 */
public class C82480s1 extends C82430g {
    /* renamed from: d */
    public static Map<String, Object> m101241d(FileStructStat fileStructStat, Map<String, Object> map) {
        map.put("mode", Integer.valueOf(fileStructStat.st_mode));
        map.put("size", Long.valueOf(fileStructStat.st_size));
        map.put("lastAccessedTime", Long.valueOf(fileStructStat.st_atime));
        map.put("lastModifiedTime", Long.valueOf(fileStructStat.st_mtime));
        return map;
    }

    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        boolean optBoolean = jSONObject.optBoolean("recursive", false);
        FileStructStat fileStructStat = new FileStructStat();
        C81410b0 stat = fVar.getFileSystem().stat(str, fileStructStat);
        int ordinal = stat.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6 || ordinal == 3) {
                return new C82446i("fail no such file or directory \"%s\"", str);
            } else if (ordinal != 4) {
                return new C82446i("fail " + stat.name(), new Object[0]);
            } else {
                return new C82446i("fail permission denied, open \"%s\"", str);
            }
        } else if (!fileStructStat.isDirectory() || !optBoolean) {
            C82446i iVar = new C82446i("ok", new Object[0]);
            HashMap hashMap = new HashMap();
            m101241d(fileStructStat, hashMap);
            iVar.mo114816a(hashMap);
            return iVar;
        } else {
            LinkedList<C81432q0> linkedList = new LinkedList<>();
            C81410b0 statDir = fVar.getFileSystem().statDir(str, linkedList);
            if (statDir.ordinal() != 0) {
                return new C82446i("fail " + statDir.name(), new Object[0]);
            }
            C82446i iVar2 = new C82446i("ok", new Object[0]);
            for (C81432q0 q0Var : linkedList) {
                String str2 = q0Var.f238976d;
                HashMap hashMap2 = new HashMap();
                m101241d(q0Var, hashMap2);
                ((HashMap) iVar2.f242316a).put(str2, hashMap2);
            }
            return iVar2;
        }
    }
}
