package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.file.C82432h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.nio.ByteBuffer;
import java.util.HashMap;
import js0.C9514m;
import org.json.JSONObject;
import p225rc.C89912a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.o1 */
public class C82466o1 extends C82430g {
    /* renamed from: b */
    public C82446i mo114803b(C82381f fVar, String str, JSONObject jSONObject) {
        C82432h hVar;
        long j;
        long j2;
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        String optString = jSONObject2.optString("encoding");
        Log.m105925i("MicroMsg.AppBrand.UnitReadFile", "call, path %s, encoding %s", str2, optString);
        if (Util.isNullOrNil(optString)) {
            hVar = null;
        } else {
            hVar = (C82432h) ((HashMap) C82432h.C82433a.f241519a).get(optString.toLowerCase());
            if (hVar == null) {
                return new C82446i("fail invalid encoding", new Object[0]);
            }
        }
        C82432h hVar2 = hVar;
        if (jSONObject2.has("position") || jSONObject2.has("length")) {
            long optLong = jSONObject2.optLong("position", 0);
            j = jSONObject2.optLong("length", MAlarmHandler.NEXT_FIRE_INTERVAL);
            j2 = optLong;
        } else {
            j2 = Long.MIN_VALUE;
            j = Long.MIN_VALUE;
        }
        C9514m mVar = new C9514m();
        C81410b0 readFile = (j2 == Long.MIN_VALUE || j == Long.MIN_VALUE) ? fVar.getFileSystem().readFile(str2, mVar) : fVar.getFileSystem().readFile(str, j2, j, mVar);
        if (readFile == C81410b0.OK) {
            T t = mVar.f29691a;
            if (hVar2 != null) {
                t = hVar2.mo114814b((ByteBuffer) t);
            }
            if (!(t instanceof ByteBuffer)) {
                C89912a.m112442a((ByteBuffer) mVar.f29691a);
            }
            C82446i iVar = new C82446i("ok", new Object[0]);
            ((HashMap) iVar.f242316a).put("data", t);
            return iVar;
        }
        int ordinal = readFile.ordinal();
        if (ordinal == 4) {
            return new C82446i("fail permission denied, open \"%s\"", str2);
        } else if (ordinal != 6) {
            switch (ordinal) {
                case 10:
                    return new C82446i("fail \"%s\" is not a regular file", str2);
                case 11:
                    return new C82446i("fail the value of \"position\" is out of range", new Object[0]);
                case 12:
                    return new C82446i("fail the value of \"length\" is out of range", new Object[0]);
                default:
                    return new C82446i("fail " + readFile.name(), new Object[0]);
            }
        } else {
            return new C82446i("fail no such file \"%s\"", str2);
        }
    }
}
