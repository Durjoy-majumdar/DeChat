package vk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;

public class o$$b$$b implements C90813d {

    /* renamed from: a */
    public final /* synthetic */ o$$b f260768a;

    public o$$b$$b(o$$b o__b) {
        this.f260768a = o__b;
    }

    /* renamed from: a */
    public void mo124934a(String str, int i, int i2, int i3) {
        if (!Util.isNullOrNil(str)) {
            o$$b o__b = this.f260768a;
            C82381f fVar = o__b.f260774e;
            int i4 = o__b.f260775f;
            C90820o oVar = o__b.f260776g;
            fVar.mo109647a(i4, oVar.mo115109j("fail:" + str));
            return;
        }
        Log.m105919d("MicroMsg.JsApiOperateCamera", "onListenFrameChange bufferId:%d width:%d height:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        HashMap hashMap = new HashMap();
        hashMap.put("bufferId", Integer.valueOf(i));
        hashMap.put("width", Integer.valueOf(i2));
        hashMap.put("height", Integer.valueOf(i3));
        o$$b o__b2 = this.f260768a;
        o__b2.f260774e.mo109647a(o__b2.f260775f, o__b2.f260776g.mo115112m("ok", hashMap));
    }
}
