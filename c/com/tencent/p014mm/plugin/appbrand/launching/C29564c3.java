package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MAutoStorage;
import p749xh.C38601ka;
import te3.C48761au;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.c3 */
public class C29564c3 extends MAutoStorage<C29562b3> {

    /* renamed from: d */
    public static final String[] f80482d = {MAutoStorage.getCreateSQLs(C29562b3.f80479p, "WxaJsApiPluginInfo")};

    public C29564c3(ISQLiteDatabase iSQLiteDatabase) {
        super(iSQLiteDatabase, C29562b3.f80479p, "WxaJsApiPluginInfo", C38601ka.f102883g);
    }

    /* renamed from: Lo */
    public C48761au mo56812Lo(String str) {
        try {
            C29562b3 b3Var = new C29562b3();
            b3Var.field_appId = str;
            if (get(b3Var, new String[0])) {
                Log.m105925i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "found info with appId(%s)", str);
                C48761au auVar = new C48761au();
                auVar.parseFrom(b3Var.field_permissionProtoBlob);
                if (auVar.f130770d.f257327a.length > 0) {
                    return auVar;
                }
                Log.m105925i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "found info with appId(%s) but jsapi_control_bytes invalid", str);
            }
            return null;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.LaunchWxaJsApiPluginInfoStorage", e, "get with appId(%s)", str);
            return null;
        }
    }

    /* renamed from: jo */
    public boolean mo56813jo(String str, byte[] bArr) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(bArr)) {
            Log.m105925i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData,invalid input %s", str);
            return false;
        }
        C29562b3 b3Var = new C29562b3();
        b3Var.field_appId = str;
        boolean z = get(b3Var, new String[0]);
        b3Var.field_permissionProtoBlob = bArr;
        if (!(z ? update(b3Var, new String[0]) : insert(b3Var))) {
            return false;
        }
        Log.m105925i("MicroMsg.LaunchWxaJsApiPluginInfoStorage", "setWxaJsApiPluginInfoData appId:%s ok", str);
        return true;
    }
}
