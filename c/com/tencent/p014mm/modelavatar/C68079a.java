package com.tencent.p014mm.modelavatar;

import android.graphics.Bitmap;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import o90.C100308d;
import p520fi.C75766h;
import p823sg.C101611g;
import q90.C101062d;

/* renamed from: com.tencent.mm.modelavatar.a */
public final class C68079a {

    /* renamed from: a */
    public C101611g<String, Bitmap> f195672a;

    public C68079a(int i) {
        this.f195672a = new C100308d(i);
    }

    /* renamed from: a */
    public void mo93573a(String str) {
        C101611g<String, Bitmap> gVar = this.f195672a;
        if (gVar != null) {
            ((C101062d) gVar).remove(str);
            return;
        }
        C75766h b = C75766h.C75767a.m91021b("avatar_cache");
        if (b == null) {
            Log.m105920e("MicroMsg.ICacheService.Factory", "null service");
            return;
        }
        try {
            b.remove(str);
        } catch (Exception e) {
            Log.m105920e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
            Log.m105921e("MicroMsg.ICacheService.Factory", "exception:%s", Util.stackTraceToString(e));
        }
    }
}
