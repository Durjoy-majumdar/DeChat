package com.tencent.magicbrush.ext_texture;

import android.graphics.SurfaceTexture;
import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import p1027rd.C89926a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/magicbrush/ext_texture/MBExternalTextureMgr;", "", "", "id", "", "type", "texId", "Landroid/graphics/SurfaceTexture;", "onSurfaceTextureLoad", "Lrx3/b0;", "onSurfaceTextureUnload", "lib-magicbrush-nano_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
public final class MBExternalTextureMgr {

    /* renamed from: a */
    public final HashMap<String, C89926a> f235107a = new HashMap<>();

    /* renamed from: a */
    public final C89926a mo111602a(String str) {
        C87412m.m108594g(str, "name");
        HashMap<String, C89926a> hashMap = this.f235107a;
        String lowerCase = str.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        C89926a aVar = hashMap.get(lowerCase);
        C87412m.m108591d(aVar);
        return aVar;
    }

    /* renamed from: b */
    public final void mo111603b(String str, C89926a aVar) {
        C87412m.m108594g(str, "type");
        C87412m.m108594g(aVar, "plugin");
        this.f235107a.get(str);
        this.f235107a.put(str, aVar);
    }

    public final SurfaceTexture onSurfaceTextureLoad(int i, String str, int i2) {
        C87412m.m108594g(str, "type");
        SurfaceTexture surfaceTexture = new SurfaceTexture(i2);
        C89926a aVar = this.f235107a.get(str);
        if (aVar != null) {
            aVar.mo124242b(i, surfaceTexture);
        }
        return surfaceTexture;
    }

    public final void onSurfaceTextureUnload(int i, String str) {
        C87412m.m108594g(str, "type");
        C89926a aVar = this.f235107a.get(str);
        if (aVar != null) {
            aVar.mo124243c(i);
        }
    }
}
