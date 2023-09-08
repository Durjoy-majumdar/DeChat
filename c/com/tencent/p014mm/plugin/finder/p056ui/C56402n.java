package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60183l5;
import java.util.ArrayList;
import o40.C61926c;
import org.json.JSONObject;
import p599lr.C61381b;
import p663qo.C101211h;
import p707tz.C65000f;
import qo1.C63292h;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.ui.n */
public final class C56402n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<GalleryItem$MediaItem> f161242d;

    /* renamed from: e */
    public final /* synthetic */ C60183l5 f161243e;

    /* renamed from: f */
    public final /* synthetic */ FinderAlbumUI f161244f;

    /* renamed from: com.tencent.mm.plugin.finder.ui.n$a */
    public static final class C56403a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60183l5 f161245d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<JSONObject> f161246e;

        /* renamed from: f */
        public final /* synthetic */ String f161247f;

        /* renamed from: g */
        public final /* synthetic */ FinderAlbumUI f161248g;

        /* renamed from: h */
        public final /* synthetic */ ArrayList<GalleryItem$MediaItem> f161249h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56403a(C60183l5 l5Var, C8479f0<JSONObject> f0Var, String str, FinderAlbumUI finderAlbumUI, ArrayList<GalleryItem$MediaItem> arrayList) {
            super(0);
            this.f161245d = l5Var;
            this.f161246e = f0Var;
            this.f161247f = str;
            this.f161248g = finderAlbumUI;
            this.f161249h = arrayList;
        }

        public Object invoke() {
            this.f161245d.mo8913b();
            JSONObject jSONObject = (JSONObject) this.f161246e.f27484d;
            if (C87412m.m108589b(jSONObject != null ? jSONObject.optString("description") : null, "miaojian")) {
                String k7 = ((C101211h) C86312j.m106911c(C101211h.class)).mo140292k7(this.f161247f);
                Log.m105924i("Finder.AlbumUI", "check miaojian, md5:" + k7 + ", path:" + this.f161247f);
                C63292h E80 = ((C61381b) C86312j.m106911c(C61381b.class)).E80();
                C87412m.m108593f(k7, "md5");
                E80.getMiaojianCgiWithLoading(k7, this.f161248g, 500).mo9225i().mo11397F(this.f161248g).mo123420E(new C56400m(this.f161248g, this.f161247f, this.f161249h));
            } else {
                FinderAlbumUI finderAlbumUI = this.f161248g;
                ArrayList<GalleryItem$MediaItem> arrayList = this.f161249h;
                int i = FinderAlbumUI.f161014F1;
                finderAlbumUI.mo79065f8(arrayList);
            }
            return C13598b0.f38549a;
        }
    }

    public C56402n(ArrayList<GalleryItem$MediaItem> arrayList, C60183l5 l5Var, FinderAlbumUI finderAlbumUI) {
        this.f161242d = arrayList;
        this.f161243e = l5Var;
        this.f161244f = finderAlbumUI;
    }

    public final void run() {
        String str = this.f161242d.get(0).f162747d;
        C8479f0 f0Var = new C8479f0();
        try {
            f0Var.f27484d = ((C65000f) C86312j.m106911c(C65000f.class)).mo89175Ov(str);
        } catch (Throwable unused) {
            Log.m105928w("Finder.AlbumUI", "getVideoInfo failed.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("metadata:");
        JSONObject jSONObject = (JSONObject) f0Var.f27484d;
        sb.append(jSONObject != null ? jSONObject.toString() : null);
        Log.m105924i("Finder.AlbumUI", sb.toString());
        C61926c.m72668M(new C56403a(this.f161243e, f0Var, str, this.f161244f, this.f161242d));
    }
}
