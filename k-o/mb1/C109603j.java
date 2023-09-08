package mb1;

import android.os.Bundle;
import au1.C0222b;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.facedetect.C85185b;
import com.tencent.p014mm.plugin.facedetectaction.p046ui.FaceActionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.youtu.ytfacetrack.YTFaceTrack;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface;
import f40.C86709a0;
import jb1.C108680a;
import lb1.C46838a;
import mb1.C109595c;
import ob0.C11385n;

/* renamed from: mb1.j */
public class C109603j implements C11385n {

    /* renamed from: A */
    public static C109603j f328125A = new C109603j();

    /* renamed from: d */
    public C109599e f328126d;

    /* renamed from: e */
    public C117545m f328127e;

    /* renamed from: f */
    public int f328128f;

    /* renamed from: g */
    public String f328129g;

    /* renamed from: h */
    public String f328130h;

    /* renamed from: i */
    public String f328131i;

    /* renamed from: j */
    public String f328132j;

    /* renamed from: n */
    public String f328133n;

    /* renamed from: o */
    public String f328134o;

    /* renamed from: p */
    public float f328135p;

    /* renamed from: q */
    public String f328136q;

    /* renamed from: r */
    public C109604a f328137r;

    /* renamed from: s */
    public MMActivity f328138s;

    /* renamed from: t */
    public MMHandler f328139t;

    /* renamed from: u */
    public int f328140u;

    /* renamed from: v */
    public int f328141v;

    /* renamed from: w */
    public int f328142w;

    /* renamed from: x */
    public FaceActionUI f328143x;

    /* renamed from: y */
    public int f328144y = 0;

    /* renamed from: z */
    public boolean f328145z = false;

    /* renamed from: mb1.j$a */
    public interface C109604a {
    }

    /* renamed from: a */
    public void mo160810a() {
        FaceActionUI faceActionUI = this.f328143x;
        if (faceActionUI != null) {
            int i = this.f328144y;
            if (i == 0 || i == 1) {
                faceActionUI.mo149631I7("cancel", 90004, (Bundle) null, Boolean.valueOf(faceActionUI.f312690w));
            } else if (i == 2) {
                faceActionUI.mo149631I7("cancel", 0, (Bundle) null, Boolean.valueOf(faceActionUI.f312690w));
            } else if (i == 3) {
                faceActionUI.mo149631I7("cancel", 90006, (Bundle) null, Boolean.valueOf(faceActionUI.f312690w));
            }
        }
    }

    /* renamed from: b */
    public void mo160811b(boolean z) {
        Log.m105925i("MicroMsg.FaceCheckActionMgr", "release, recreate: %s", Boolean.valueOf(z));
        C109599e eVar = this.f328126d;
        if (eVar != null) {
            eVar.getClass();
            try {
                Log.m105924i("MicroMsg.FaceCheckActionEngine", "release");
                if (C85185b.vx0()) {
                    YTPoseDetectInterface.releaseModel();
                    YTFaceTrack.GlobalRelease();
                    C109595c.C109597b.f328115a.f328113j = null;
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FaceCheckActionEngine", e, "release error", new Object[0]);
            }
            this.f328126d = new C109599e();
        }
        C117545m mVar = this.f328127e;
        if (mVar != null) {
            mVar.getClass();
            if (C108680a.m147401e().mo159700h()) {
                C108680a.m147401e().mo159697d();
            }
            this.f328127e = null;
        }
        if (z) {
            MMHandler mMHandler = this.f328139t;
            if (mMHandler != null) {
                mMHandler.getSerial().f328238b.mo182313f();
                this.f328139t = null;
            }
            f328125A = new C109603j();
        }
    }

    /* renamed from: c */
    public void mo160812c(FaceActionUI faceActionUI) {
        C0222b.m172k("reqCfg");
        C46838a aVar = new C46838a(this.f328128f, this.f328129g, this.f328130h);
        C86709a0.m107524d().mo123455a(2696, this);
        C86709a0.m107524d().mo123460f(aVar);
        this.f328143x = faceActionUI;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r31, int r32, java.lang.String r33, ob0.C117747y r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r3 = r32
            r2 = r34
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r31)
            r7 = 0
            r5[r7] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r32)
            r8 = 1
            r5[r8] = r6
            r6 = 2
            r5[r6] = r33
            r9 = 3
            r5[r9] = r2
            java.lang.String r10 = "MicroMsg.FaceCheckActionMgr"
            java.lang.String r11 = "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r5)
            boolean r5 = r2 instanceof lb1.C46838a
            java.lang.String r11 = "MicroMsg.FaceActionUI"
            if (r5 == 0) goto L_0x022b
            ob0.b0 r5 = f40.C86709a0.m107524d()
            r12 = 2696(0xa88, float:3.778E-42)
            r5.mo123470p(r12, r0)
            lb1.a r2 = (lb1.C46838a) r2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            java.lang.String r12 = "#"
            r5.append(r12)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r12 = "errorType"
            au1.C0222b.m173l(r12, r5)
            if (r1 != 0) goto L_0x0213
            if (r3 != 0) goto L_0x0213
            te3.i02 r1 = r2.f125988f
            com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogPayStruct r2 = au1.C0222b.m164c()
            int r3 = r1.f134997d
            r2.f9715h = r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "rspCfg"
            au1.C0222b.m173l(r3, r2)
            java.lang.String r2 = r1.f134998e
            java.lang.String r3 = "msgCfg"
            au1.C0222b.m173l(r3, r2)
            r2 = 5
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r5 = r1.f134997d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r7] = r5
            java.lang.String r5 = r1.f134998e
            r3[r8] = r5
            java.lang.String r5 = r1.f135000g
            r3[r6] = r5
            float r5 = r1.f135001h
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r3[r9] = r5
            java.lang.String r5 = r1.f135002i
            r3[r4] = r5
            java.lang.String r4 = "GetFaceCheckAction, ret_code: %s, ret_msg: %s, action_data: %s, reduction_ratio: %s, take_message: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r4, r3)
            int r14 = r1.f134997d
            if (r14 != 0) goto L_0x0200
            java.lang.String r3 = r1.f134999f
            r0.f328133n = r3
            java.lang.String r3 = r1.f135000g
            r0.f328134o = r3
            float r4 = r1.f135001h
            r0.f328135p = r4
            java.lang.String r4 = r1.f135002i
            r0.f328136q = r4
            r4 = -1
            int r3 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r3, (int) r4)
            if (r3 == r8) goto L_0x00b6
            if (r3 == r9) goto L_0x00b6
            if (r3 == r2) goto L_0x00b4
            r2 = -1
            goto L_0x00b7
        L_0x00b4:
            r2 = 2
            goto L_0x00b7
        L_0x00b6:
            r2 = 1
        L_0x00b7:
            if (r2 != r4) goto L_0x00cc
            mb1.j$a r1 = r0.f328137r
            if (r1 == 0) goto L_0x02c3
            r3 = 1
            r4 = -1
            r7 = 1
            r2 = r1
            nb1.f r2 = (nb1.C109734f) r2
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r2.mo160960a(r3, r4, r5, r6, r7)
            goto L_0x02c3
        L_0x00cc:
            java.lang.String r1 = r1.f135003j
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r3[r7] = r5
            r3[r8] = r1
            java.lang.String r5 = "onGetLiveTypeFinish, liveType: %s, actionHint: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r3)
            mb1.e r3 = r0.f328126d
            com.tencent.mm.ui.MMActivity r5 = r0.f328138s
            r3.getClass()
            mb1.C109599e.m148897a()
            boolean r6 = com.tencent.p014mm.plugin.facedetect.C85185b.vx0()
            if (r6 != 0) goto L_0x00ee
            goto L_0x0128
        L_0x00ee:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r9 = "rel_wechat_2055-12-06.lic1.2"
            java.lang.String r12 = ""
            int r6 = com.tencent.ytcommon.auth.Auth.m144677b(r6, r9, r12, r7)
            if (r6 != 0) goto L_0x0104
            com.tencent.ytcommon.auth.Auth.m144676a()
            com.tencent.ytcommon.auth.Auth.getFailedReason(r6)
            goto L_0x010a
        L_0x0104:
            com.tencent.ytcommon.auth.Auth.m144676a()
            com.tencent.ytcommon.auth.Auth.getFailedReason(r6)
        L_0x010a:
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r9[r7] = r12
            java.lang.String r12 = "MicroMsg.FaceCheckActionEngine"
            java.lang.String r13 = "initAuth ret: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r9)
            if (r6 == 0) goto L_0x012b
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 917(0x395, double:4.53E-321)
            r17 = 58
            r19 = 1
            r21 = 0
            r14.idkeyStat(r15, r17, r19, r21)
        L_0x0128:
            r4 = 0
            goto L_0x01cf
        L_0x012b:
            com.tencent.mm.plugin.report.service.n r22 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r23 = 917(0x395, double:4.53E-321)
            r25 = 57
            r27 = 1
            r29 = 0
            r22.idkeyStat(r23, r25, r27, r29)
            java.lang.String r6 = "initYoutuInstance()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r6)
            boolean r6 = com.tencent.p014mm.plugin.facedetect.C85185b.vx0()
            if (r6 == 0) goto L_0x0160
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = com.tencent.p014mm.plugin.facedetect.model.C85191v.m105070i()
            java.lang.String r6 = p823sg.C48380r.m53726a(r6, r7)
            r4.append(r6)
            java.lang.String r6 = "/"
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            int r4 = com.tencent.youtu.ytfacetrack.YTFaceTrack.GlobalInit(r4)
        L_0x0160:
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r6[r7] = r9
            java.lang.String r9 = "YTPoseDetectInterface.initModel ret: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r9, r6)
            if (r4 == 0) goto L_0x0170
            goto L_0x01b4
        L_0x0170:
            com.tencent.youtu.ytfacetrack.YTFaceTrack r4 = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance()
            com.tencent.youtu.ytfacetrack.param.YTFaceDetectParam r4 = r4.GetFaceDetectParam()
            r4.bigger_face_mode = r8
            r6 = 50
            r4.min_face_size = r6
            com.tencent.youtu.ytfacetrack.YTFaceTrack r6 = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance()
            r6.SetFaceDetectParam(r4)
            com.tencent.youtu.ytfacetrack.YTFaceTrack r4 = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance()
            com.tencent.youtu.ytfacetrack.param.YTFaceTrackParam r4 = r4.GetFaceTrackParam()
            r4.need_pose_estimate = r8
            r6 = 20
            r4.detect_interval = r6
            com.tencent.youtu.ytfacetrack.YTFaceTrack r6 = com.tencent.youtu.ytfacetrack.YTFaceTrack.getInstance()
            r6.SetFaceTrackParam(r4)
            int r4 = com.tencent.youtu.ytposedetect.YTPoseDetectInterface.initModel()
            if (r4 == 0) goto L_0x01b6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "YTFaceTraceInterface.initModel failed，return:"
            r6.append(r9)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r4)
        L_0x01b4:
            r4 = 0
            goto L_0x01ba
        L_0x01b6:
            com.tencent.youtu.ytposedetect.YTPoseDetectInterface.setSafetyLevel(r8)
            r4 = 1
        L_0x01ba:
            if (r4 == 0) goto L_0x01c3
            r4 = 255(0xff, float:3.57E-43)
            com.tencent.youtu.ytcommon.YTCommonExInterface.setAppBrightness(r5, r4)
            r4 = 1
            goto L_0x01c4
        L_0x01c3:
            r4 = 0
        L_0x01c4:
            mb1.d r5 = new mb1.d
            r5.<init>(r3)
            r3.f328117a = r5
            mb1.c r3 = mb1.C109595c.C109597b.f328115a
            r3.f328113j = r5
        L_0x01cf:
            if (r4 != 0) goto L_0x01d8
            java.lang.String r1 = "init face actionsource failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x02c3
        L_0x01d8:
            r0.f328144y = r7
            mb1.e r3 = r0.f328126d
            mb1.h r4 = new mb1.h
            r4.<init>(r0)
            r3.f328118b = r4
            mb1.j$a r3 = r0.f328137r
            if (r3 == 0) goto L_0x02c3
            nb1.f r3 = (nb1.C109734f) r3
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r7] = r5
            java.lang.String r5 = "onInitFaceCheckFinish: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r5, r4)
            nb1.c r4 = new nb1.c
            r4.<init>(r3, r2, r1)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r4)
            goto L_0x02c3
        L_0x0200:
            mb1.j$a r2 = r0.f328137r
            if (r2 == 0) goto L_0x02c3
            r13 = 1
            java.lang.String r15 = r1.f134998e
            r17 = 1
            r12 = r2
            nb1.f r12 = (nb1.C109734f) r12
            java.lang.String r16 = ""
            r12.mo160960a(r13, r14, r15, r16, r17)
            goto L_0x02c3
        L_0x0213:
            java.lang.String r1 = "get face check action failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            mb1.j$a r1 = r0.f328137r
            if (r1 == 0) goto L_0x02c3
            r2 = 1
            r6 = 1
            nb1.f r1 = (nb1.C109734f) r1
            java.lang.String r5 = ""
            r3 = r32
            r4 = r33
            r1.mo160960a(r2, r3, r4, r5, r6)
            goto L_0x02c3
        L_0x022b:
            boolean r4 = r2 instanceof lb1.C117473c
            if (r4 == 0) goto L_0x02c3
            lb1.c r2 = (lb1.C117473c) r2
            ob0.b0 r4 = f40.C86709a0.m107524d()
            r5 = 2726(0xaa6, float:3.82E-42)
            r4.mo123470p(r5, r0)
            te3.m02 r2 = r2.f351564g
            java.lang.Object[] r4 = new java.lang.Object[r9]
            int r5 = r2.f184190d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r7] = r5
            java.lang.String r5 = r2.f184191e
            r4[r8] = r5
            java.lang.String r5 = r2.f184194h
            r4[r6] = r5
            java.lang.String r5 = "get face check result, ret_code: %s, ret_msg: %s serialId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r5, r4)
            int r4 = r2.f184190d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "rspVerify"
            au1.C0222b.m173l(r5, r4)
            java.lang.String r4 = r2.f184191e
            java.lang.String r5 = "msgVerify"
            au1.C0222b.m173l(r5, r4)
            com.tencent.mm.autogen.mmdata.rpt.FaceFlashLogPayStruct r4 = au1.C0222b.m164c()
            int r14 = r2.f184190d
            r4.f9717j = r14
            if (r1 != 0) goto L_0x02ac
            if (r3 != 0) goto L_0x02ac
            if (r14 == 0) goto L_0x028a
            mb1.j$a r1 = r0.f328137r
            if (r1 == 0) goto L_0x02c3
            r13 = 3
            java.lang.String r15 = r2.f184191e
            java.lang.String r3 = r2.f184194h
            int r2 = r2.f184193g
            r12 = r1
            nb1.f r12 = (nb1.C109734f) r12
            r16 = r3
            r17 = r2
            r12.mo160960a(r13, r14, r15, r16, r17)
            goto L_0x02c3
        L_0x028a:
            java.lang.String r1 = "on verify finish!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            mb1.j$a r1 = r0.f328137r
            if (r1 == 0) goto L_0x02c3
            nb1.f r1 = (nb1.C109734f) r1
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r4 = r2.f184192f
            r3[r7] = r4
            java.lang.String r4 = "onVerifyFinish:   authToken ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r4, r3)
            nb1.e r3 = new nb1.e
            r3.<init>(r1, r2)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r3)
            r0.f328144y = r6
            goto L_0x02c3
        L_0x02ac:
            java.lang.String r1 = "get face check result failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
            mb1.j$a r1 = r0.f328137r
            if (r1 == 0) goto L_0x02c3
            r4 = 3
            java.lang.String r5 = r2.f184194h
            r6 = 1
            nb1.f r1 = (nb1.C109734f) r1
            r2 = r4
            r3 = r32
            r4 = r33
            r1.mo160960a(r2, r3, r4, r5, r6)
        L_0x02c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb1.C109603j.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
