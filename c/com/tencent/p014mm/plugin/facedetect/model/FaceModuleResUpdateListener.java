package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.facedetect.model.FaceModuleResUpdateListener */
public class FaceModuleResUpdateListener extends IListener<CheckResUpdateCacheFileEvent> {
    public FaceModuleResUpdateListener() {
        super(C40008f.f107254d);
        this.__eventId = 905296653;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r13) {
        /*
            r12 = this;
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r13 = (com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent) r13
            java.lang.Class<fp.e> r0 = p523fp.C32147e.class
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r13.f78743d
            int r2 = r1.f78744a
            r3 = 42
            r4 = 0
            if (r2 != r3) goto L_0x0115
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r1 = r1.f78745b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r4] = r1
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r1 = r13.f78743d
            java.lang.String r3 = r1.f78746c
            r5 = 1
            r2[r5] = r3
            r3 = 2
            int r1 = r1.f78747d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r3] = r1
            java.lang.String r1 = "MicroMsg.FaceModuleResUpdateListener"
            java.lang.String r3 = "hy: new face file update coming. subtype: %d, file path: %s, file version: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r3, r2)
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r2 = r13.f78743d
            int r3 = r2.f78745b
            int r2 = r2.f78747d
            r6 = -1
            java.lang.String r7 = "LAST_LOGIN_FACE_MODEL_DETECT_VERSION"
            java.lang.String r8 = "LAST_LOGIN_FACE_MODEL_ALIGNMENT_VERSION"
            java.lang.String r9 = "-1"
            if (r3 == 0) goto L_0x0051
            if (r3 == r5) goto L_0x0046
            java.lang.String r2 = "hy: error subtype"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x008f
        L_0x0046:
            eb0.i3 r10 = eb0.C7624i3.f25910c
            java.lang.String r10 = r10.mo19a(r8, r9)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r6)
            goto L_0x005b
        L_0x0051:
            eb0.i3 r10 = eb0.C7624i3.f25910c
            java.lang.String r10 = r10.mo19a(r7, r9)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r10, (int) r6)
        L_0x005b:
            if (r2 <= r6) goto L_0x008f
            java.lang.String r6 = ""
            if (r3 == 0) goto L_0x0079
            if (r3 == r5) goto L_0x0064
            goto L_0x008d
        L_0x0064:
            eb0.i3 r3 = eb0.C7624i3.f25910c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            r3.mo8756d(r8, r2)
            goto L_0x008d
        L_0x0079:
            eb0.i3 r3 = eb0.C7624i3.f25910c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            r3.mo8756d(r7, r2)
        L_0x008d:
            r2 = 1
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            if (r2 != 0) goto L_0x00a9
            java.lang.String r2 = "hy: get lower version"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            fp.e r0 = (p523fp.C32147e) r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r13 = r13.f78743d
            int r1 = r13.f78744a
            int r2 = r13.f78745b
            int r13 = r13.f78747d
            r0.Y40(r1, r2, r13)
            goto L_0x0115
        L_0x00a9:
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r2 = r13.f78743d
            int r3 = r2.f78745b
            java.lang.String r6 = "LAST_LOGIN_FACE_MODEL_SDCARD_PATH_ALIGNMENT"
            java.lang.String r10 = "hy: invalid subtype"
            java.lang.String r11 = "LAST_LOGIN_FACE_MODEL_SDCARD_PATH_DETECT"
            if (r3 != 0) goto L_0x00bd
            eb0.i3 r3 = eb0.C7624i3.f25910c
            java.lang.String r2 = r2.f78746c
            r3.mo8756d(r11, r2)
            goto L_0x00ca
        L_0x00bd:
            if (r3 != r5) goto L_0x00c7
            eb0.i3 r3 = eb0.C7624i3.f25910c
            java.lang.String r2 = r2.f78746c
            r3.mo8756d(r6, r2)
            goto L_0x00ca
        L_0x00c7:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
        L_0x00ca:
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r2 = r13.f78743d
            int r2 = r2.f78745b
            boolean r2 = com.tencent.p014mm.plugin.facedetect.model.C85191v.m105074m(r2)
            if (r2 != 0) goto L_0x00ff
            java.lang.String r0 = "hy: copy failed. reset version code and path"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r13 = r13.f78743d
            int r0 = r13.f78745b
            if (r0 != 0) goto L_0x00ec
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r13 = r13.f78746c
            r0.mo8756d(r11, r13)
            eb0.i3 r13 = eb0.C7624i3.f25910c
            r13.mo8756d(r7, r9)
            goto L_0x0115
        L_0x00ec:
            if (r0 != r5) goto L_0x00fb
            eb0.i3 r0 = eb0.C7624i3.f25910c
            java.lang.String r13 = r13.f78746c
            r0.mo8756d(r6, r13)
            eb0.i3 r13 = eb0.C7624i3.f25910c
            r13.mo8756d(r8, r9)
            goto L_0x0115
        L_0x00fb:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            goto L_0x0115
        L_0x00ff:
            java.lang.String r2 = "hy: load success. mark as not retry"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            fp.e r0 = (p523fp.C32147e) r0
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r13 = r13.f78743d
            int r1 = r13.f78744a
            int r2 = r13.f78745b
            int r13 = r13.f78747d
            r0.Y40(r1, r2, r13)
        L_0x0115:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.model.FaceModuleResUpdateListener.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
