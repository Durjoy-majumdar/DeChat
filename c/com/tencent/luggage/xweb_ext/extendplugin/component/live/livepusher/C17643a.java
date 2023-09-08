package com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher;

import com.tencent.rtmp.TXLivePusher;

/* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a */
public interface C17643a extends TXLivePusher.VideoCustomProcessListener {

    /* renamed from: a */
    public static final C17643a f48006a = new C17647a();

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$b */
    public enum C17644b {
        SKIN_BRIGHT,
        SKIN_SMOOTH,
        FACE_THIN,
        EYE_BIGGER
    }

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$c */
    public enum C17645c {
        MAKEUP_LIP_STICK,
        MAKEUP_EYE_SHADOW,
        MAKEUP_BLUSHER_STICK,
        MAKEUP_FACE_CONTOUR,
        MAKEUP_EYE_BROW
    }

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$d */
    public enum C17646d {
        STICKER_BACK,
        STICKER_FRONT,
        STICKER_2D
    }

    /* renamed from: com.tencent.luggage.xweb_ext.extendplugin.component.live.livepusher.a$a */
    public class C17647a implements C17643a {
        /* renamed from: a */
        public void mo21055a(C17646d dVar, String str) {
        }

        /* renamed from: b */
        public void mo21056b(C17645c cVar, String str) {
        }

        public void clearFilters() {
        }

        /* renamed from: f */
        public void mo21058f() {
        }

        public boolean isEnabled() {
            return false;
        }

        /* renamed from: j */
        public void mo21060j(C17644b bVar, float f) {
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

    /* renamed from: a */
    void mo21055a(C17646d dVar, String str);

    /* renamed from: b */
    void mo21056b(C17645c cVar, String str);

    void clearFilters();

    /* renamed from: f */
    void mo21058f();

    boolean isEnabled();

    /* renamed from: j */
    void mo21060j(C17644b bVar, float f);

    /* renamed from: m */
    void mo21061m(String str, float f);

    /* renamed from: n */
    void mo21062n();
}
