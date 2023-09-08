package com.tencent.p014mm.plugin.facedetect.service;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.plugin.facedetect.model.C115422j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.MMService;
import hb1.C8500c;

/* renamed from: com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService */
public class FaceDetectProcessService extends MMService {

    /* renamed from: i */
    public C115422j f345985i = null;

    /* renamed from: j */
    public Messenger f345986j = null;

    /* renamed from: n */
    public C8500c f345987n = null;

    /* renamed from: com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService$a */
    public class C115427a extends Binder {
        public C115427a() {
        }
    }

    public FaceDetectProcessService() {
        new C115427a();
    }

    /* renamed from: b */
    public String mo63928b() {
        return "MicroMsg.FaceDetectProcessService";
    }

    /* renamed from: c */
    public IBinder mo93614c(Intent intent) {
        Log.m105925i("MicroMsg.FaceDetectProcessService", "alvinluo service onBind hashCode: %d", Integer.valueOf(hashCode()));
        return new C115427a();
    }

    /* renamed from: d */
    public void mo112546d() {
        Log.m105925i("MicroMsg.FaceDetectProcessService", "alvinluo service onCreate hashCode: %d", Integer.valueOf(hashCode()));
        super.mo112546d();
        this.f345985i = new C115422j();
    }

    /* renamed from: e */
    public void mo112547e() {
        Log.m105924i("MicroMsg.FaceDetectProcessService", "alvinluo service onDestroy");
        super.mo112547e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        if (r2 == jb1.C108680a.C108691g.STOPPED) goto L_0x00dc;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo93615g(android.content.Intent r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.FaceDetectProcessService"
            java.lang.String r1 = "alvinluo onStartCommand"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r0 = 0
            if (r11 != 0) goto L_0x0015
            java.lang.String r1 = "MicroMsg.FaceDetectProcessService"
            java.lang.String r2 = "intent is null!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            super.mo93615g(r11, r12, r13)
            return r0
        L_0x0015:
            java.lang.String r1 = "k_messenger"
            android.os.Parcelable r1 = r11.getParcelableExtra(r1)
            android.os.Messenger r1 = (android.os.Messenger) r1
            if (r1 == 0) goto L_0x0025
            r10.f345986j = r1
            super.mo93615g(r11, r12, r13)
            return r0
        L_0x0025:
            java.lang.String r1 = "k_cmd"
            r2 = -1
            int r1 = r11.getIntExtra(r1, r2)
            java.lang.String r2 = "MicroMsg.FaceDetectProcessService"
            java.lang.String r3 = "hy: get command: %d"
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5[r0] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r5)
            r2 = 5
            r3 = 2
            if (r1 == 0) goto L_0x0117
            if (r1 == r4) goto L_0x0106
            r5 = 4
            if (r1 == r5) goto L_0x00f8
            if (r1 == r2) goto L_0x0071
            r2 = 6
            if (r1 == r2) goto L_0x0053
            java.lang.String r1 = "MicroMsg.FaceDetectProcessService"
            java.lang.String r2 = "hy: unsupported cmd"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            goto L_0x01ac
        L_0x0053:
            java.lang.String r1 = "key_bio_buffer_path"
            java.lang.String r1 = r11.getStringExtra(r1)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "key_bio_buffer_path"
            r3.putString(r4, r1)
            android.os.Message r1 = android.os.Message.obtain()
            r1.what = r2
            r1.setData(r3)
            r10.mo175313k(r1)
            goto L_0x01ac
        L_0x0071:
            hb1.c r1 = r10.f345987n
            if (r1 == 0) goto L_0x01ac
            hb1.e r1 = (hb1.C8502e) r1
            java.lang.String r2 = "k_bio_id"
            r5 = -1
            long r5 = r11.getLongExtra(r2, r5)
            r1.f27527a = r5
            java.lang.String r2 = "key_app_id"
            java.lang.String r2 = r11.getStringExtra(r2)
            r1.f27528b = r2
            java.lang.Object[] r2 = new java.lang.Object[r3]
            long r5 = r1.f27527a
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r2[r0] = r3
            java.lang.String r3 = r1.f27528b
            r2[r4] = r3
            java.lang.String r3 = "MicroMsg.FaceDetectServiceControllerMp"
            java.lang.String r4 = "hy: got bioid: %d, appid: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r2)
            java.lang.String r2 = "hy: requesting release and send video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            jb1.a r2 = jb1.C108680a.m147401e()
            boolean r2 = r2.f325476h
            if (r2 == 0) goto L_0x00f1
            jb1.a r2 = jb1.C108680a.m147401e()
            java.lang.Object r4 = r2.f325470b
            monitor-enter(r4)
            jb1.a$g r2 = r2.f325472d     // Catch:{ all -> 0x00ee }
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            jb1.a$g r4 = jb1.C108680a.C108691g.STARTED
            if (r2 == r4) goto L_0x00dc
            jb1.a r2 = jb1.C108680a.m147401e()
            java.lang.Object r4 = r2.f325470b
            monitor-enter(r4)
            jb1.a$g r2 = r2.f325472d     // Catch:{ all -> 0x00d9 }
            monitor-exit(r4)     // Catch:{ all -> 0x00d9 }
            jb1.a$g r4 = jb1.C108680a.C108691g.STOPPING
            if (r2 == r4) goto L_0x00dc
            jb1.a r2 = jb1.C108680a.m147401e()
            java.lang.Object r4 = r2.f325470b
            monitor-enter(r4)
            jb1.a$g r2 = r2.f325472d     // Catch:{ all -> 0x00d6 }
            monitor-exit(r4)     // Catch:{ all -> 0x00d6 }
            jb1.a$g r4 = jb1.C108680a.C108691g.STOPPED
            if (r2 != r4) goto L_0x00f1
            goto L_0x00dc
        L_0x00d6:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d6 }
            throw r11
        L_0x00d9:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d9 }
            throw r11
        L_0x00dc:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            jb1.a r4 = jb1.C108680a.m147401e()
            hb1.d r5 = new hb1.d
            r5.<init>(r1, r2)
            r4.mo159702j(r5)
            goto L_0x01ac
        L_0x00ee:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00ee }
            throw r11
        L_0x00f1:
            java.lang.String r1 = "hy: not recording video"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            goto L_0x01ac
        L_0x00f8:
            java.lang.String r1 = "needVideo"
            boolean r1 = r11.getBooleanExtra(r1, r0)
            jb1.a r2 = jb1.C108680a.m147401e()
            r2.f325476h = r1
            goto L_0x01ac
        L_0x0106:
            hb1.a r1 = new hb1.a
            r1.<init>(r10)
            hb1.b r2 = new hb1.b
            r2.<init>(r10, r1)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = com.tencent.p014mm.plugin.facedetect.model.C105227i.f312610f
            r1.postToWorker(r2)
            goto L_0x01ac
        L_0x0117:
            java.lang.String r1 = "k_bio_id"
            java.lang.String r1 = r11.getStringExtra(r1)
            java.lang.String r5 = "k_bio_config"
            byte[] r5 = r11.getByteArrayExtra(r5)
            java.lang.String r6 = "k_ontext_data"
            android.os.Parcelable r6 = r11.getParcelableExtra(r6)
            com.tencent.mm.plugin.facedetect.model.FaceContextData r6 = (com.tencent.p014mm.plugin.facedetect.model.FaceContextData) r6
            r7 = 0
            if (r6 != 0) goto L_0x0131
            com.tencent.p014mm.plugin.facedetect.model.FaceContextData.f312602e = r7
            goto L_0x0148
        L_0x0131:
            com.tencent.mm.plugin.facedetect.model.FaceContextData r8 = com.tencent.p014mm.plugin.facedetect.model.FaceContextData.f312602e
            if (r8 == 0) goto L_0x0139
            com.tencent.p014mm.plugin.facedetect.model.FaceContextData.m141308a(r6)
            goto L_0x0148
        L_0x0139:
            java.lang.Class<com.tencent.mm.plugin.facedetect.model.FaceContextData> r8 = com.tencent.p014mm.plugin.facedetect.model.FaceContextData.class
            monitor-enter(r8)
            com.tencent.mm.plugin.facedetect.model.FaceContextData r9 = com.tencent.p014mm.plugin.facedetect.model.FaceContextData.f312602e     // Catch:{ all -> 0x01b0 }
            if (r9 == 0) goto L_0x0145
            com.tencent.p014mm.plugin.facedetect.model.FaceContextData.m141308a(r6)     // Catch:{ all -> 0x01b0 }
            monitor-exit(r8)     // Catch:{ all -> 0x01b0 }
            goto L_0x0148
        L_0x0145:
            com.tencent.p014mm.plugin.facedetect.model.FaceContextData.f312602e = r6     // Catch:{ all -> 0x01b0 }
            monitor-exit(r8)     // Catch:{ all -> 0x01b0 }
        L_0x0148:
            java.lang.String r6 = "scene"
            int r6 = r11.getIntExtra(r6, r3)
            if (r6 == r3) goto L_0x0154
            if (r6 == r2) goto L_0x0154
            goto L_0x0159
        L_0x0154:
            hb1.e r7 = new hb1.e
            r7.<init>()
        L_0x0159:
            r10.f345987n = r7
            com.tencent.mm.plugin.facedetect.model.j r2 = r10.f345985i
            com.tencent.mm.plugin.facedetect.FaceProNative r3 = r2.f345972a
            java.lang.String r6 = "MicroMsg.FaceDetectNativeManager"
            if (r3 == 0) goto L_0x016b
            java.lang.String r3 = "hy: last detection not destroyed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r3)
            r2.mo175307a()
        L_0x016b:
            boolean r3 = com.tencent.p014mm.plugin.facedetect.model.C85191v.m105064c(r4)
            if (r3 != 0) goto L_0x0178
            java.lang.String r1 = "hy: model file not valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            r1 = -4
            goto L_0x01a9
        L_0x0178:
            boolean r3 = com.tencent.p014mm.plugin.facedetect.C85185b.vx0()
            if (r3 != 0) goto L_0x0185
            java.lang.String r1 = "expansions file is not yet installed"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            r1 = -5
            goto L_0x01a9
        L_0x0185:
            com.tencent.mm.plugin.facedetect.FaceProNative r3 = new com.tencent.mm.plugin.facedetect.FaceProNative
            r3.<init>()
            r2.f345972a = r3
            java.lang.String r2 = com.tencent.p014mm.plugin.facedetect.model.C85191v.m105069h()
            java.lang.String r2 = com.tencent.p014mm.vfs.C86013q1.m106448i(r2, r4)
            java.lang.String r7 = com.tencent.p014mm.plugin.facedetect.model.C85191v.m105067f()
            int r1 = r3.engineInit(r1, r5, r2, r7)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r0] = r3
            java.lang.String r3 = "hy: init result : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r2)
        L_0x01a9:
            r10.mo175312j(r0, r1)
        L_0x01ac:
            super.mo93615g(r11, r12, r13)
            return r0
        L_0x01b0:
            r11 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01b0 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.facedetect.service.FaceDetectProcessService.mo93615g(android.content.Intent, int, int):int");
    }

    /* renamed from: h */
    public boolean mo119619h(Intent intent) {
        Log.m105924i("MicroMsg.FaceDetectProcessService", "alvinluo service onUnbind");
        super.mo119619h(intent);
        return false;
    }

    /* renamed from: j */
    public final void mo175312j(int i, int i2) {
        Log.m105925i("MicroMsg.FaceDetectProcessService", "alvinluo replyToClient requestCode: %d, resultCode: %d", Integer.valueOf(i), Integer.valueOf(i2));
        Message message = new Message();
        message.what = i;
        message.arg1 = i2;
        mo175313k(message);
    }

    /* renamed from: k */
    public final void mo175313k(Message message) {
        try {
            if (this.f345986j != null) {
                Log.m105925i("MicroMsg.FaceDetectProcessService", "alvinluo serivce send msg to client: %d, msg: %s, client hashCode: %d", Integer.valueOf(message.what), message.toString(), Integer.valueOf(this.f345986j.hashCode()));
                this.f345986j.send(message);
            }
        } catch (RemoteException e) {
            Log.printErrStackTrace("MicroMsg.FaceDetectProcessService", e, "", new Object[0]);
        }
    }

    /* renamed from: l */
    public FaceProNative.FaceResult mo175314l() {
        C115422j jVar = this.f345985i;
        if (jVar.f345972a == null) {
            Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: release out not init");
            return null;
        }
        try {
            long currentTicks = Util.currentTicks();
            FaceProNative.FaceResult engineReleaseOut = jVar.f345972a.engineReleaseOut();
            Log.m105925i("MicroMsg.FaceDetectNativeManager", "hy: uninitialize result : %d, using: %d ms", Integer.valueOf(engineReleaseOut.result), Long.valueOf(Util.currentTicks() - currentTicks));
            jVar.f345972a = null;
            return engineReleaseOut;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.FaceDetectNativeManager", th, "hy: face lib release crash!!!", new Object[0]);
            jVar.f345972a.engineRelease();
            jVar.f345972a = null;
            return null;
        }
    }
}
