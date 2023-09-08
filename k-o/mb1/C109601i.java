package mb1;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import mb1.C109603j;
import mb1.C117545m;
import nb1.C109734f;

/* renamed from: mb1.i */
public class C109601i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ byte[][] f328120d;

    /* renamed from: e */
    public final /* synthetic */ int f328121e;

    /* renamed from: f */
    public final /* synthetic */ int f328122f;

    /* renamed from: g */
    public final /* synthetic */ C109603j f328123g;

    /* renamed from: mb1.i$a */
    public class C109602a implements C117545m.C109608a {
        public C109602a() {
        }

        /* renamed from: a */
        public void mo160809a() {
            Log.m105924i("MicroMsg.FaceCheckActionMgr", "on record error");
            C109603j.C109604a aVar = C109601i.this.f328123g.f328137r;
            if (aVar != null) {
                ((C109734f) aVar).mo160960a(2, -1, "", "", 1);
                C115669n.INSTANCE.idkeyStat(917, 47, 1, false);
            }
        }
    }

    public C109601i(C109603j jVar, byte[][] bArr, int i, int i2) {
        this.f328123g = jVar;
        this.f328120d = bArr;
        this.f328121e = i;
        this.f328122f = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r0 = r18
            mb1.j r1 = r0.f328123g
            mb1.m r8 = new mb1.m
            java.lang.String r3 = r1.f328133n
            float r4 = r1.f328135p
            int r5 = r1.f328140u
            int r6 = r1.f328141v
            int r7 = r1.f328142w
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f328127e = r8
            mb1.j r1 = r0.f328123g
            mb1.m r2 = r1.f328127e
            com.tencent.mm.plugin.facedetectaction.ui.FaceActionUI r1 = r1.f328143x
            androidx.appcompat.app.AppCompatActivity r1 = r1.getContext()
            int r1 = r1.hashCode()
            java.lang.String.valueOf(r1)
            r2.getClass()
            mb1.j r1 = r0.f328123g
            mb1.m r1 = r1.f328127e
            mb1.i$a r2 = new mb1.i$a
            r2.<init>()
            r1.f351670f = r2
            byte[][] r2 = r0.f328120d
            int r10 = r0.f328121e
            int r11 = r0.f328122f
            r1.getClass()
            if (r2 == 0) goto L_0x0165
            if (r10 <= 0) goto L_0x0165
            if (r11 <= 0) goto L_0x0165
            r3 = 5
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r4[r7] = r5
            int r5 = r2.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2
            r4[r8] = r5
            int r5 = r1.f351668d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r9 = 3
            r4[r9] = r5
            int r5 = r1.f351669e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r12 = 4
            r4[r12] = r5
            java.lang.String r5 = "MicroMsg.FaceCheckVideoRecordMgr"
            java.lang.String r13 = "recordAllPostDetectFrames, width: %s, height: %s, frames.size: %s, cameraFrameWidth: %s, cameraFrameHeight: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r13, r4)
            com.tencent.mm.modelcontrol.VideoTransPara r4 = new com.tencent.mm.modelcontrol.VideoTransPara
            r4.<init>()
            r4.f267178s = r7
            r4.f267166d = r10
            r4.f267167e = r11
            r13 = 30
            r4.f267168f = r13
            r14 = 10
            r4.f267172j = r14
            r14 = 64000(0xfa00, float:8.9683E-41)
            r4.f267173n = r14
            r4.f267176q = r8
            r4.f267177r = r7
            r14 = 16000(0x3e80, float:2.2421E-41)
            r4.f267174o = r14
            r14 = 15
            r4.f267170h = r14
            int r14 = r2.length
            int r14 = r14 * 30
            r13 = 3686400(0x384000, float:5.165747E-39)
            r4.f267169g = r13
            float r15 = r1.f351666b
            r16 = 0
            int r16 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r16 <= 0) goto L_0x00b1
            float r13 = (float) r13
            float r13 = r13 * r15
            int r13 = (int) r13
            r4.f267169g = r13
        L_0x00b1:
            java.lang.Object[] r13 = new java.lang.Object[r7]
            int r15 = r4.f267169g
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r13[r6] = r15
            java.lang.String r15 = "final video bitrate: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r15, r13)
            int r13 = r1.f351668d
            if (r13 != r10) goto L_0x00c8
            int r13 = r1.f351669e
            if (r13 == r11) goto L_0x00f5
        L_0x00c8:
            java.lang.String r13 = "camera frame size and sdk output size not match!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r13)
            r13 = r2[r6]
            if (r13 == 0) goto L_0x00f5
            java.lang.Object[] r15 = new java.lang.Object[r7]
            int r3 = r13.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r15[r6] = r3
            java.lang.String r3 = "first frame size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r15)
            int r3 = r13.length
            int r5 = r10 * r11
            int r5 = r5 * 3
            int r5 = r5 / r8
            if (r3 == r5) goto L_0x00f5
            int r3 = r13.length
            int r5 = r1.f351668d
            int r13 = r1.f351669e
            int r15 = r5 * r13
            int r15 = r15 * 3
            int r15 = r15 / r8
            if (r3 != r15) goto L_0x00f5
            r15 = r5
            goto L_0x00f7
        L_0x00f5:
            r15 = r10
            r13 = r11
        L_0x00f7:
            jb1.a r5 = jb1.C108680a.m147401e()
            int r3 = r1.f351667c
            r17 = 0
            mb1.k r12 = new mb1.k
            r12.<init>(r1, r14, r4, r2)
            r5.getClass()
            java.lang.String r1 = "MicroMsg.FaceVideoRecorder"
            java.lang.String r2 = "initRecorderForActionVerify"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            r2[r6] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
            r2[r7] = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            r2[r8] = r14
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r2[r9] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8 = 4
            r2[r8] = r6
            r6 = 5
            r2[r6] = r4
            java.lang.String r6 = "hy: cameraOrientation: %d, previewWidth: %d, previewHeight: %d,isLandscape: %b,  degree: %d, param: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r2)
            g72.b r1 = r5.f325483o
            com.tencent.mm.remoteservice.d r2 = r5.f325482n
            zh0.d r1 = (zh0.C112626d) r1
            r1.getClass()
            if (r2 == 0) goto L_0x0149
            com.tencent.mm.plugin.mmsight.model.CaptureMMProxy r6 = new com.tencent.mm.plugin.mmsight.model.CaptureMMProxy
            r6.<init>(r2)
            com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.createProxy(r6)
        L_0x0149:
            i72.C108388k.m146838d(r4)
            i72.r r2 = i72.C108388k.f324540d
            r2.f324551a = r7
            r1.f337279c = r4
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r5.f325471c
            jb1.b r2 = new jb1.b
            r9 = 0
            r6 = r3
            r3 = r2
            r4 = r5
            r5 = r6
            r6 = r13
            r7 = r15
            r8 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.postToWorker(r2)
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb1.C109601i.run():void");
    }
}
