package com.tencent.p014mm.plugin.exdevice.model;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d81.C45288e;
import ke3.C88144b;
import p823sg.C90193h;
import te3.C49697hf2;
import te3.C49840if2;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.x */
public class C41175x {
    /* renamed from: a */
    public static void m44615a(C53753b bVar, C49697hf2 hf22, C49840if2 if22) {
        if (bVar != null) {
            if (if22 != null) {
                bVar.field_connProto = if22.f135286g;
                bVar.field_connStrategy = if22.f135287h;
                bVar.field_closeStrategy = if22.f135288i;
                bVar.field_mac = C45288e.m50137h(C45288e.m50140k(if22.f135285f));
                bVar.field_authKey = if22.f135284e;
                bVar.field_brandName = if22.f135283d;
                bVar.f150113y = if22.f135292p;
                bVar.f150090G = if22.f135300x;
                bVar.f150087D = if22.f135297u;
                bVar.f150086C = if22.f135296t;
                bVar.f150085B = if22.f135295s;
                bVar.f150088E = if22.f135298v;
                bVar.f150114z = if22.f135293q;
                bVar.f150089F = if22.f135299w;
                bVar.f150084A = if22.f135294r;
                bVar.f150091H = if22.f135301y;
                bVar.f150092I = if22.f135302z;
                bVar.f150093J = if22.f135281A;
                bVar.f150094K = if22.f135282B;
                bVar.f150108t = true;
            }
            if (hf22 != null) {
                bVar.field_deviceID = hf22.f134597e;
                bVar.field_deviceType = hf22.f134596d;
                bVar.field_md5Str = C90193h.m112878f(new String(hf22.f134596d + hf22.f134597e).getBytes());
                if (Util.isNullOrNil(bVar.field_brandName)) {
                    bVar.field_brandName = hf22.f134596d;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m44616b(C53753b bVar) {
        return bVar != null && (bVar.f150090G & 1) == 1;
    }

    /* renamed from: c */
    public static boolean m44617c(Context context, String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.exdevice.ExdeviceLogic", "Jump to webview failed, url is null or nil.");
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return true;
    }
}
