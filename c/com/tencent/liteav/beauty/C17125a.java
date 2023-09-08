package com.tencent.liteav.beauty;

import android.util.SparseBooleanArray;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.liteav.beauty.p305b.C17158l;
import com.tencent.liteav.videobase.videobase.IVideoReporter;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.JsApiUpdateAppContact;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import com.tencent.wechat.aff.ting.TingClientProto;
import kt0.C46743b;

/* renamed from: com.tencent.liteav.beauty.a */
public final class C17125a {

    /* renamed from: a */
    private static final C17126a[] f46179a = {new C17126a(C17158l.C17159a.FACE_SLIM, 1206, "reportFaceSlimDua", (byte) 0), new C17126a(C17158l.C17159a.EYE_SCALE, 1205, "reportEyeScaleDua", (byte) 0), new C17126a(C17158l.C17159a.FACE_V_SHAPE, 1214, "reportFaceVDua", (byte) 0), new C17126a(C17158l.C17159a.FACE_SHORT, C1824s.CTRL_INDEX, "reportFaceShortDua", (byte) 0), new C17126a(C17158l.C17159a.CHIN_SCALE, 1215, "reportChinDua", (byte) 0), new C17126a(C17158l.C17159a.NOSE_SLIM, 1217, "reportNoseSlimDua", (byte) 0), new C17126a(C17158l.C17159a.FOREHEAD, 1221, "reportForeheadDua", (byte) 0), new C17126a(C17158l.C17159a.EYE_DISTANCE, 1222, "reportEyeDistanceDua", (byte) 0), new C17126a(C17158l.C17159a.EYE_ANGLE, 1223, "reportEyeAngleDua", (byte) 0), new C17126a(C17158l.C17159a.MOUTH_SHAPE, 1224, "reportMouthShapeDua", (byte) 0), new C17126a(C17158l.C17159a.NOSE_WING, 1225, "reportNoseWingDua", (byte) 0), new C17126a(C17158l.C17159a.NOSE_POSITION, 1226, "reportNosePositionDua", (byte) 0), new C17126a(C17158l.C17159a.LIPS_THICKNESS, C46743b.CTRL_INDEX, "reportLipsThicknessDua", (byte) 0), new C17126a(C17158l.C17159a.BASIC3, JsApiUpdateAppContact.CTRL_INDEX, "reportFaceBeautyDua", (byte) 0), new C17126a(C17158l.C17159a.EYE_LIGHTEN, 1229, "reportEyeLightenDua", (byte) 0), new C17126a(C17158l.C17159a.TOOTH_WHITEN, 1230, "reportToothWhitenDua", (byte) 0), new C17126a(C17158l.C17159a.REMOVE_WRINKLES, 1218, "reportWrinkleRemoveDua", (byte) 0), new C17126a(C17158l.C17159a.REMOVE_POUNCH, 1219, "reportPounchRemoveDua", (byte) 0), new C17126a(C17158l.C17159a.REMOVE_SMILE_LINES, 1220, "reportSmileLinesRemoveDua", (byte) 0)};

    /* renamed from: b */
    private static final SparseBooleanArray f46180b = new SparseBooleanArray();

    /* renamed from: com.tencent.liteav.beauty.a$a */
    public static class C17126a {

        /* renamed from: a */
        public final C17158l.C17159a f46181a;

        /* renamed from: b */
        public final int f46182b;

        /* renamed from: c */
        public final String f46183c;

        public /* synthetic */ C17126a(C17158l.C17159a aVar, int i, String str, byte b) {
            this(aVar, i, str);
        }

        private C17126a(C17158l.C17159a aVar, int i, String str) {
            this.f46181a = aVar;
            this.f46182b = i;
            this.f46183c = str;
        }
    }

    /* renamed from: a */
    public static void m16947a(IVideoReporter iVideoReporter) {
        f46180b.clear();
        m16948a(iVideoReporter, 1201, "reportSDKInit!");
    }

    /* renamed from: b */
    public static void m16950b(IVideoReporter iVideoReporter) {
        m16948a(iVideoReporter, TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, "reportBeautyDua");
    }

    /* renamed from: c */
    public static void m16951c(IVideoReporter iVideoReporter) {
        m16948a(iVideoReporter, TXLiteAVCode.WARNING_MICROPHONE_NOT_AUTHORIZED, "reportWhiteDua");
    }

    /* renamed from: d */
    public static void m16952d(IVideoReporter iVideoReporter) {
        m16948a(iVideoReporter, 1210, "reportSharpDua");
    }

    /* renamed from: e */
    public static void m16953e(IVideoReporter iVideoReporter) {
        m16948a(iVideoReporter, 1204, "reportRuddyDua");
    }

    /* renamed from: f */
    public static void m16954f(IVideoReporter iVideoReporter) {
        m16948a(iVideoReporter, 1208, "reportFilterImageDua");
    }

    /* renamed from: g */
    public static void m16955g(IVideoReporter iVideoReporter) {
        m16948a(iVideoReporter, 1211, "reportTemplateDua");
    }

    /* renamed from: h */
    public static void m16956h(IVideoReporter iVideoReporter) {
        m16948a(iVideoReporter, TingClientProto.TingScene.TingScene_BrandProfile_VALUE, "reportWarterMarkDua");
    }

    /* renamed from: a */
    public static void m16949a(IVideoReporter iVideoReporter, C17158l.C17159a aVar) {
        for (C17126a aVar2 : f46179a) {
            if (aVar2.f46181a == aVar) {
                m16948a(iVideoReporter, aVar2.f46182b, aVar2.f46183c);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m16948a(com.tencent.liteav.videobase.videobase.IVideoReporter r6, int r7, java.lang.String r8) {
        /*
            java.lang.Class<com.tencent.liteav.beauty.a> r0 = com.tencent.liteav.beauty.C17125a.class
            monitor-enter(r0)
            android.util.SparseBooleanArray r1 = f46180b     // Catch:{ all -> 0x0042 }
            boolean r2 = r1.get(r7)     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r0)
            return
        L_0x000d:
            r2 = 1
            r1.put(r7, r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "ReportDauManager"
            java.lang.String r3 = "report DAU eventId: %d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0042 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0042 }
            r5 = 0
            r2[r5] = r4     // Catch:{ all -> 0x0042 }
            com.tencent.liteav.base.util.LiteavLog.m16902i(r1, r3, r2)     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0040
            com.tencent.liteav.videobase.videobase.h$b r1 = com.tencent.liteav.videobase.videobase.C17263h.C17269b.EVT_VIDEO_PREPROCESS_COSMETIC_FIRST_USE     // Catch:{ all -> 0x0042 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "report DAU eventId:"
            r2.<init>(r3)     // Catch:{ all -> 0x0042 }
            r2.append(r7)     // Catch:{ all -> 0x0042 }
            java.lang.String r7 = " errorInfo:"
            r2.append(r7)     // Catch:{ all -> 0x0042 }
            r2.append(r8)     // Catch:{ all -> 0x0042 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0042 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0042 }
            r6.notifyEvent(r1, r7, r8)     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)
            return
        L_0x0042:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.beauty.C17125a.m16948a(com.tencent.liteav.videobase.videobase.IVideoReporter, int, java.lang.String):void");
    }
}
