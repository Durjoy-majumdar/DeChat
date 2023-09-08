package com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher;

import com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.C17643a;
import gy3.C87412m;
import java.util.List;
import org.json.JSONObject;
import p301cd.C113283b;
import p301cd.C113284c;
import p301cd.C113285d;
import p301cd.C113286e;
import p301cd.C16925h;
import p301cd.C16926l;

/* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b */
public interface C17648b extends C17643a, C16926l, C16925h {

    /* renamed from: b */
    public static final C17649a f48022b = C17649a.f48023c;

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b$a */
    public static final class C17649a implements C17648b {

        /* renamed from: c */
        public static final /* synthetic */ C17649a f48023c = new C17649a();

        /* renamed from: a */
        public void mo21055a(C17643a.C17646d dVar, String str) {
        }

        /* renamed from: b */
        public void mo21056b(C17643a.C17645c cVar, String str) {
        }

        /* renamed from: c */
        public boolean mo18015c(C113283b bVar) {
            C87412m.m108594g(bVar, "info");
            return false;
        }

        public void clearFilters() {
        }

        /* renamed from: d */
        public boolean mo18016d(C113285d dVar) {
            C87412m.m108594g(dVar, "info");
            return false;
        }

        /* renamed from: f */
        public void mo21058f() {
        }

        /* renamed from: g */
        public boolean mo18020g(C17643a.C17646d dVar, List<StickerItemInfo> list, JSONObject jSONObject) {
            C87412m.m108594g(dVar, "type");
            C87412m.m108594g(list, "stickerInfo");
            return false;
        }

        /* renamed from: i */
        public boolean mo18017i(C113284c cVar) {
            C87412m.m108594g(cVar, "info");
            return false;
        }

        public boolean isEnabled() {
            return false;
        }

        /* renamed from: j */
        public void mo21060j(C17643a.C17644b bVar, float f) {
        }

        /* renamed from: k */
        public boolean mo18018k(C17652c cVar) {
            C87412m.m108594g(cVar, "info");
            return false;
        }

        /* renamed from: l */
        public boolean mo18019l(C113286e eVar) {
            C87412m.m108594g(eVar, "info");
            return false;
        }

        /* renamed from: m */
        public void mo21061m(String str, float f) {
        }

        /* renamed from: n */
        public void mo21062n() {
        }

        public void onDetectFacePoints(float[] fArr) {
        }

        public int onTextureCustomProcess(int i, int i2, int i3) {
            return 0;
        }

        public void onTextureDestoryed() {
        }
    }

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b$b */
    public interface C17650b {

        /* renamed from: a */
        public static final /* synthetic */ int f48024a = 0;

        /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.b$b$a */
        public static final class C17651a implements C17650b {

            /* renamed from: b */
            public static final /* synthetic */ C17651a f48025b = new C17651a();

            public C17648b create() {
                return C17648b.f48022b;
            }
        }

        C17648b create();
    }
}
