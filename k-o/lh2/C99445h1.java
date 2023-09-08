package lh2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import fh2.C97882i;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C101781gb0;

/* renamed from: lh2.h1 */
public final class C99445h1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C99431f1 f291571d;

    /* renamed from: e */
    public final /* synthetic */ VideoMixer f291572e;

    /* renamed from: f */
    public final /* synthetic */ C97882i.C97883a f291573f;

    /* renamed from: g */
    public final /* synthetic */ C97882i f291574g;

    /* renamed from: h */
    public final /* synthetic */ C101781gb0 f291575h;

    /* renamed from: i */
    public final /* synthetic */ long f291576i;

    /* renamed from: j */
    public final /* synthetic */ int f291577j;

    /* renamed from: lh2.h1$a */
    public static final class C99446a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C99431f1 f291578d;

        /* renamed from: e */
        public final /* synthetic */ VideoMixer f291579e;

        /* renamed from: f */
        public final /* synthetic */ String f291580f;

        /* renamed from: g */
        public final /* synthetic */ C101781gb0 f291581g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99446a(C99431f1 f1Var, VideoMixer videoMixer, String str, C101781gb0 gb02) {
            super(0);
            this.f291578d = f1Var;
            this.f291579e = videoMixer;
            this.f291580f = str;
            this.f291581g = gb02;
        }

        public Object invoke() {
            C99431f1.m129761b(this.f291578d);
            Intent intent = new Intent();
            intent.putExtra("key_thumb_path", this.f291579e.f272850a.f263370a.f287129e);
            intent.putExtra("key_bg_mix_task_id", this.f291580f);
            intent.putExtra("key_video_duration", this.f291581g.f298291d);
            intent.putExtra("key_extra_data", CaptureDataManager.f272890c.f272892b);
            Context context = this.f291578d.f291529d;
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).setResult(888, intent);
            Context context2 = this.f291578d.f291529d;
            C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context2).finish();
            return C13598b0.f38549a;
        }
    }

    public C99445h1(C99431f1 f1Var, VideoMixer videoMixer, C97882i.C97883a aVar, C97882i iVar, C101781gb0 gb02, long j, int i) {
        this.f291571d = f1Var;
        this.f291572e = videoMixer;
        this.f291573f = aVar;
        this.f291574g = iVar;
        this.f291575h = gb02;
        this.f291576i = j;
        this.f291577j = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: float[]} */
    /* JADX WARNING: type inference failed for: r17v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x039f A[Catch:{ Exception -> 0x0589 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03ab A[Catch:{ Exception -> 0x0589 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04be A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x04ff A[Catch:{ Exception -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0502 A[Catch:{ Exception -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0506 A[Catch:{ Exception -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0509 A[Catch:{ Exception -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0511 A[Catch:{ Exception -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0526 A[Catch:{ Exception -> 0x0577 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x057b A[Catch:{ Exception -> 0x0584 }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x060d A[Catch:{ Exception -> 0x0693 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x065c A[Catch:{ Exception -> 0x0693 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x06a6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1 A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fe A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105 A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010a A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010d A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111 A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114 A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012b A[Catch:{ Exception -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012e A[Catch:{ Exception -> 0x0586 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r1 = r31
            lh2.f1 r0 = r1.f291571d
            h90.b r0 = r0.f291531f
            r3 = 1
            if (r0 == 0) goto L_0x0064
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r4 = r4.f272892b
            boolean r5 = r0.f288182c
            java.lang.String r6 = "key_is_capture_video"
            r4.putBoolean(r6, r5)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r4 = r4.f272892b
            java.util.ArrayList<java.lang.String> r5 = r0.f288190k
            if (r5 == 0) goto L_0x0026
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r5 = 0
            goto L_0x0027
        L_0x0026:
            r5 = 1
        L_0x0027:
            r5 = r5 ^ r3
            java.lang.String r6 = "key_is_photo_video"
            r4.putBoolean(r6, r5)
            java.util.ArrayList<java.lang.String> r4 = r0.f288190k
            if (r4 == 0) goto L_0x003b
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r4 = 0
            goto L_0x003c
        L_0x003b:
            r4 = 1
        L_0x003c:
            java.lang.String r5 = "key_src_list"
            if (r4 != 0) goto L_0x004f
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r4 = r4.mo129796c()
            java.util.ArrayList r0 = r0.mo137614d()
            r4.putStringArrayList(r5, r0)
            goto L_0x0064
        L_0x004f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = r0.mo137617f()
            r4.add(r0)
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r0 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c
            android.os.Bundle r0 = r0.mo129796c()
            r0.putStringArrayList(r5, r4)
        L_0x0064:
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r4 = r1.f291572e
            ah2.a r0 = r4.f272850a
            fh2.c r5 = r0.f263370a
            fh2.i$a r13 = r1.f291573f
            java.lang.String r6 = "#ff000000"
            java.lang.String r14 = "markCreateThumbFailed"
            java.lang.String r15 = "MicroMsg.StoryRemuxIDKeyStat"
            java.lang.String r12 = "MicroMsg.Media.VideoMixer"
            java.lang.String r0 = "captureInfo"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "config"
            gy3.C87412m.m108594g(r13, r0)
            java.lang.String r7 = r5.f287129e     // Catch:{ Exception -> 0x0586 }
            long r8 = r5.f287130f     // Catch:{ Exception -> 0x0586 }
            r16 = 0
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            r8 = r16
        L_0x008c:
            int r10 = r4.f272863n     // Catch:{ Exception -> 0x0586 }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)     // Catch:{ Exception -> 0x0586 }
            if (r0 != 0) goto L_0x03d8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0586 }
            r0.<init>()     // Catch:{ Exception -> 0x0586 }
            java.lang.String r11 = "create thumb bitmap : "
            r0.append(r11)     // Catch:{ Exception -> 0x0586 }
            r0.append(r8)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0586 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x0586 }
            boolean r0 = r5.f287132h     // Catch:{ Exception -> 0x0586 }
            if (r0 != 0) goto L_0x0197
            java.lang.String r0 = r5.f287128d     // Catch:{ Exception -> 0x0586 }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x0586 }
            if (r0 != 0) goto L_0x0197
            java.lang.String r0 = r5.f287128d     // Catch:{ Exception -> 0x0586 }
            r6 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r6     // Catch:{ Exception -> 0x0586 }
            long r8 = r8 * r2
            android.graphics.Bitmap r0 = f72.C97842b.m126301r(r0, r8)     // Catch:{ Exception -> 0x0586 }
            ah2.a r2 = r4.f272850a     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = r2.f263380k     // Catch:{ Exception -> 0x0586 }
            if (r2 == 0) goto L_0x00ce
            int r2 = r2.length()     // Catch:{ Exception -> 0x0586 }
            if (r2 != 0) goto L_0x00cc
            goto L_0x00ce
        L_0x00cc:
            r2 = 0
            goto L_0x00cf
        L_0x00ce:
            r2 = 1
        L_0x00cf:
            if (r2 != 0) goto L_0x00f8
            ah2.a r2 = r4.f272850a     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = r2.f263380k     // Catch:{ Exception -> 0x0586 }
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)     // Catch:{ Exception -> 0x0586 }
            if (r2 != 0) goto L_0x00dc
            goto L_0x00f8
        L_0x00dc:
            int r2 = r13.f287151a     // Catch:{ Exception -> 0x0586 }
            int r3 = r13.f287152b     // Catch:{ Exception -> 0x0586 }
            int r2 = java.lang.Math.min(r2, r3)     // Catch:{ Exception -> 0x0586 }
            int r3 = r0.getWidth()     // Catch:{ Exception -> 0x0586 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0586 }
            float r6 = (float) r2     // Catch:{ Exception -> 0x0586 }
            float r3 = r3 / r6
            int r6 = r0.getHeight()     // Catch:{ Exception -> 0x0586 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x0586 }
            float r6 = r6 / r3
            int r3 = (int) r6     // Catch:{ Exception -> 0x0586 }
            r6 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r3, r6)     // Catch:{ Exception -> 0x0586 }
            goto L_0x0155
        L_0x00f8:
            int r2 = r13.f287156f     // Catch:{ Exception -> 0x0586 }
            r3 = 270(0x10e, float:3.78E-43)
            if (r2 == r3) goto L_0x0105
            r3 = 90
            if (r2 != r3) goto L_0x0103
            goto L_0x0107
        L_0x0103:
            r2 = 0
            goto L_0x0108
        L_0x0105:
            r3 = 90
        L_0x0107:
            r2 = 1
        L_0x0108:
            if (r2 == 0) goto L_0x010d
            int r6 = r13.f287152b     // Catch:{ Exception -> 0x0586 }
            goto L_0x010f
        L_0x010d:
            int r6 = r13.f287151a     // Catch:{ Exception -> 0x0586 }
        L_0x010f:
            if (r2 == 0) goto L_0x0114
            int r2 = r13.f287151a     // Catch:{ Exception -> 0x0586 }
            goto L_0x0116
        L_0x0114:
            int r2 = r13.f287152b     // Catch:{ Exception -> 0x0586 }
        L_0x0116:
            float r8 = (float) r6     // Catch:{ Exception -> 0x0586 }
            float r9 = (float) r2     // Catch:{ Exception -> 0x0586 }
            float r11 = r8 / r9
            int r3 = r0.getWidth()     // Catch:{ Exception -> 0x0586 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0586 }
            r16 = r2
            int r2 = r0.getHeight()     // Catch:{ Exception -> 0x0586 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x0586 }
            float r3 = r3 / r2
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x012e
            float r8 = r8 / r3
            int r2 = (int) r8     // Catch:{ Exception -> 0x0586 }
            goto L_0x0133
        L_0x012e:
            float r9 = r9 * r3
            int r6 = (int) r9     // Catch:{ Exception -> 0x0586 }
            r2 = r16
        L_0x0133:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0586 }
            r3.<init>()     // Catch:{ Exception -> 0x0586 }
            java.lang.String r8 = "thumbHeight:"
            r3.append(r8)     // Catch:{ Exception -> 0x0586 }
            r3.append(r2)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r8 = " thumbWidth:"
            r3.append(r8)     // Catch:{ Exception -> 0x0586 }
            r3.append(r6)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0586 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r3)     // Catch:{ Exception -> 0x0586 }
            r3 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r6, r2, r3)     // Catch:{ Exception -> 0x0586 }
        L_0x0155:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0586 }
            r2.<init>()     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "createGraffitiThumb not capture, thumb size:["
            r2.append(r3)     // Catch:{ Exception -> 0x0586 }
            int r3 = r0.getWidth()     // Catch:{ Exception -> 0x0586 }
            r2.append(r3)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = ", "
            r2.append(r3)     // Catch:{ Exception -> 0x0586 }
            int r3 = r0.getHeight()     // Catch:{ Exception -> 0x0586 }
            r2.append(r3)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = "], thumbRotate:"
            r2.append(r3)     // Catch:{ Exception -> 0x0586 }
            r2.append(r10)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = ", drawingRect:"
            r2.append(r3)     // Catch:{ Exception -> 0x0586 }
            ah2.a r3 = r4.f272850a     // Catch:{ Exception -> 0x0586 }
            float[] r3 = r3.f263372c     // Catch:{ Exception -> 0x0586 }
            java.lang.String r3 = java.util.Arrays.toString(r3)     // Catch:{ Exception -> 0x0586 }
            r2.append(r3)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0586 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r2)     // Catch:{ Exception -> 0x0586 }
            goto L_0x01a5
        L_0x0192:
            r1 = r12
            r17 = 0
            goto L_0x058e
        L_0x0197:
            java.util.ArrayList<java.lang.String> r0 = r5.f287136o     // Catch:{ Exception -> 0x0586 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0586 }
            if (r0 != 0) goto L_0x01ac
            java.lang.String r0 = r5.f287128d     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap r0 = f72.C97842b.m126301r(r0, r8)     // Catch:{ Exception -> 0x0586 }
        L_0x01a5:
            r29 = r4
            r24 = r10
            r3 = 0
            goto L_0x039d
        L_0x01ac:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0586 }
            r0.<init>()     // Catch:{ Exception -> 0x0586 }
            r2 = 1
            r0.inJustDecodeBounds = r2     // Catch:{ Exception -> 0x0586 }
            java.util.ArrayList<java.lang.String> r2 = r5.f287136o     // Catch:{ Exception -> 0x0586 }
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0586 }
            android.graphics.BitmapFactory.decodeFile(r2, r0)     // Catch:{ Exception -> 0x0586 }
            int r2 = r0.outWidth     // Catch:{ Exception -> 0x0586 }
            int r3 = r0.outHeight     // Catch:{ Exception -> 0x0586 }
            fh2.f r8 = fh2.C97881f.f287137a     // Catch:{ Exception -> 0x0586 }
            int r9 = r8.mo137201a()     // Catch:{ Exception -> 0x0586 }
            android.graphics.Point r11 = new android.graphics.Point     // Catch:{ Exception -> 0x0586 }
            r11.<init>(r2, r3)     // Catch:{ Exception -> 0x0586 }
            if (r2 <= r3) goto L_0x01e4
            if (r3 <= r9) goto L_0x01e1
            r11.y = r9     // Catch:{ Exception -> 0x0586 }
            float r1 = (float) r2     // Catch:{ Exception -> 0x0586 }
            float r9 = (float) r9     // Catch:{ Exception -> 0x0586 }
            r24 = r10
            float r10 = (float) r3     // Catch:{ Exception -> 0x0586 }
            float r9 = r9 / r10
            float r1 = r1 * r9
            int r1 = (int) r1     // Catch:{ Exception -> 0x0586 }
            r11.x = r1     // Catch:{ Exception -> 0x0586 }
            goto L_0x01f3
        L_0x01e1:
            r24 = r10
            goto L_0x01f3
        L_0x01e4:
            r24 = r10
            if (r2 <= r9) goto L_0x01f3
            r11.x = r9     // Catch:{ Exception -> 0x0586 }
            float r1 = (float) r3     // Catch:{ Exception -> 0x0586 }
            float r9 = (float) r9     // Catch:{ Exception -> 0x0586 }
            float r1 = r1 * r9
            float r9 = (float) r2     // Catch:{ Exception -> 0x0586 }
            float r1 = r1 / r9
            int r1 = (int) r1     // Catch:{ Exception -> 0x0586 }
            r11.y = r1     // Catch:{ Exception -> 0x0586 }
        L_0x01f3:
            int r1 = r8.mo137201a()     // Catch:{ Exception -> 0x0586 }
            int r9 = r8.mo137201a()     // Catch:{ Exception -> 0x0586 }
            int r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.calculateInSampleSize(r2, r3, r1, r9)     // Catch:{ Exception -> 0x0586 }
            r0.inSampleSize = r1     // Catch:{ Exception -> 0x0586 }
            r1 = 0
            r0.inJustDecodeBounds = r1     // Catch:{ Exception -> 0x0586 }
            r9 = 1
            r0.inMutable = r9     // Catch:{ Exception -> 0x0586 }
            java.util.ArrayList<java.lang.String> r9 = r5.f287136o     // Catch:{ Exception -> 0x0586 }
            java.lang.Object r9 = r9.get(r1)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap r16 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r9, r0)     // Catch:{ Exception -> 0x0586 }
            int r1 = r8.mo137201a()     // Catch:{ Exception -> 0x0586 }
            int r1 = r1 / 2
            int r8 = r8.mo137201a()     // Catch:{ Exception -> 0x0586 }
            int r8 = r8 / 2
            int r1 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.calculateInSampleSize(r2, r3, r1, r8)     // Catch:{ Exception -> 0x0586 }
            r0.inSampleSize = r1     // Catch:{ Exception -> 0x0586 }
            tj3.h r1 = new tj3.h     // Catch:{ Exception -> 0x0586 }
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ Exception -> 0x0586 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0586 }
            java.util.ArrayList<java.lang.String> r2 = r5.f287136o     // Catch:{ Exception -> 0x0586 }
            r3 = 0
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.graphics.MMBitmapFactory.m98735d(r2, r0)     // Catch:{ Exception -> 0x0586 }
            r2 = 1082130432(0x40800000, float:4.0)
            r1.mo162692b(r0, r2)     // Catch:{ Exception -> 0x0241 }
            goto L_0x0274
        L_0x0241:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "rsblur exception"
            r3 = 0
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0586 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r2, r0, r8)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r0 = "rsblur exception, path:%s"
            r2 = 1
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0586 }
            java.util.ArrayList<java.lang.String> r2 = r5.f287136o     // Catch:{ Exception -> 0x0586 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Exception -> 0x0586 }
            r8[r3] = r2     // Catch:{ Exception -> 0x0586 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r8)     // Catch:{ Exception -> 0x0586 }
            fh2.f r0 = fh2.C97881f.f287137a     // Catch:{ Exception -> 0x0586 }
            android.graphics.Point r0 = r0.mo137202b()     // Catch:{ Exception -> 0x0586 }
            int r2 = android.graphics.Color.parseColor(r6)     // Catch:{ Exception -> 0x0586 }
            int r3 = r0.x     // Catch:{ Exception -> 0x0586 }
            int r0 = r0.y     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r2, r3, r0)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = "createColorBitmap(Color.…0000\"), point.x, point.y)"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ Exception -> 0x0586 }
        L_0x0274:
            r1.destroy()     // Catch:{ Exception -> 0x0586 }
            if (r16 == 0) goto L_0x02c5
            java.util.ArrayList<java.lang.String> r1 = r5.f287136o     // Catch:{ Exception -> 0x0586 }
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r2 = "captureInfo.fakeVideoImageList[0]"
            gy3.C87412m.m108593f(r1, r2)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0586 }
            int r1 = r4.mo129786g(r1)     // Catch:{ Exception -> 0x0586 }
            if (r1 == 0) goto L_0x02c5
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0586 }
            r2.<init>()     // Catch:{ Exception -> 0x0586 }
            float r1 = (float) r1     // Catch:{ Exception -> 0x0586 }
            r2.postRotate(r1)     // Catch:{ Exception -> 0x0586 }
            r17 = 0
            r18 = 0
            int r19 = r16.getWidth()     // Catch:{ Exception -> 0x0586 }
            int r20 = r16.getHeight()     // Catch:{ Exception -> 0x0586 }
            r22 = 1
            r21 = r2
            android.graphics.Bitmap r16 = android.graphics.Bitmap.createBitmap(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0586 }
            r18 = 0
            r19 = 0
            int r20 = r0.getWidth()     // Catch:{ Exception -> 0x0586 }
            int r21 = r0.getHeight()     // Catch:{ Exception -> 0x0586 }
            r23 = 1
            r17 = r0
            r22 = r2
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0586 }
            java.lang.String r1 = "createBitmap(bmBg, 0, 0,…mBg.height, matrix, true)"
            gy3.C87412m.m108593f(r0, r1)     // Catch:{ Exception -> 0x0586 }
        L_0x02c5:
            r1 = r16
            fh2.f r2 = fh2.C97881f.f287137a     // Catch:{ Exception -> 0x0586 }
            android.graphics.Point r2 = r2.mo137202b()     // Catch:{ Exception -> 0x0586 }
            gy3.C87412m.m108591d(r1)     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap$Config r3 = r1.getConfig()     // Catch:{ Exception -> 0x0586 }
            if (r3 == 0) goto L_0x02e3
            int r3 = r2.x     // Catch:{ Exception -> 0x0586 }
            int r6 = r2.y     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap$Config r8 = r1.getConfig()     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r6, r8)     // Catch:{ Exception -> 0x0586 }
            goto L_0x02ef
        L_0x02e3:
            int r3 = android.graphics.Color.parseColor(r6)     // Catch:{ Exception -> 0x0586 }
            int r6 = r2.x     // Catch:{ Exception -> 0x0586 }
            int r8 = r2.y     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r3, r6, r8)     // Catch:{ Exception -> 0x0586 }
        L_0x02ef:
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch:{ Exception -> 0x0586 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x0586 }
            int r8 = r0.getWidth()     // Catch:{ Exception -> 0x0586 }
            int r9 = r0.getHeight()     // Catch:{ Exception -> 0x0586 }
            int r10 = r2.x     // Catch:{ Exception -> 0x0586 }
            if (r8 != r10) goto L_0x0314
            int r11 = r2.y     // Catch:{ Exception -> 0x0586 }
            if (r9 == r11) goto L_0x0305
            goto L_0x0314
        L_0x0305:
            r8 = 0
            r9 = 0
            r6.drawBitmap(r0, r8, r8, r9)     // Catch:{ Exception -> 0x030f }
            r18 = r3
            r29 = r4
            goto L_0x034b
        L_0x030f:
            r0 = move-exception
            r17 = r9
            goto L_0x04e5
        L_0x0314:
            int r11 = r2.y     // Catch:{ Exception -> 0x0586 }
            r18 = r3
            int r3 = r8 * r11
            r29 = r4
            int r4 = r9 * r10
            if (r3 <= r4) goto L_0x032e
            float r3 = (float) r11     // Catch:{ Exception -> 0x0586 }
            float r4 = (float) r9     // Catch:{ Exception -> 0x0586 }
            float r3 = r3 / r4
            float r4 = (float) r10     // Catch:{ Exception -> 0x0586 }
            float r8 = (float) r8     // Catch:{ Exception -> 0x0586 }
            float r8 = r8 * r3
            float r4 = r4 - r8
            r16 = 1056964608(0x3f000000, float:0.5)
            float r8 = r4 * r16
            r4 = 0
            goto L_0x033c
        L_0x032e:
            r16 = 1056964608(0x3f000000, float:0.5)
            float r3 = (float) r10     // Catch:{ Exception -> 0x0586 }
            float r4 = (float) r8     // Catch:{ Exception -> 0x0586 }
            float r3 = r3 / r4
            float r4 = (float) r11     // Catch:{ Exception -> 0x0586 }
            float r8 = (float) r9     // Catch:{ Exception -> 0x0586 }
            float r8 = r8 * r3
            float r4 = r4 - r8
            float r8 = r4 * r16
            r4 = r8
            r8 = 0
        L_0x033c:
            android.graphics.Matrix r9 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0586 }
            r9.<init>()     // Catch:{ Exception -> 0x0586 }
            r9.setScale(r3, r3)     // Catch:{ Exception -> 0x0586 }
            r9.postTranslate(r8, r4)     // Catch:{ Exception -> 0x0586 }
            r3 = 0
            r6.drawBitmap(r0, r9, r3)     // Catch:{ Exception -> 0x0589 }
        L_0x034b:
            int r0 = r1.getWidth()     // Catch:{ Exception -> 0x0586 }
            int r3 = r1.getHeight()     // Catch:{ Exception -> 0x0586 }
            int r4 = r2.x     // Catch:{ Exception -> 0x0586 }
            if (r0 != r4) goto L_0x0366
            int r8 = r2.y     // Catch:{ Exception -> 0x0586 }
            if (r3 == r8) goto L_0x035c
            goto L_0x0366
        L_0x035c:
            r2 = 0
            r8 = 0
            r6.drawBitmap(r1, r8, r8, r2)     // Catch:{ Exception -> 0x0363 }
            r3 = 0
            goto L_0x039b
        L_0x0363:
            r0 = move-exception
            goto L_0x0192
        L_0x0366:
            r8 = 0
            int r2 = r2.y     // Catch:{ Exception -> 0x0586 }
            int r9 = r0 * r2
            int r10 = r4 * r3
            if (r9 <= r10) goto L_0x037d
            float r4 = (float) r4     // Catch:{ Exception -> 0x0586 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0586 }
            float r4 = r4 / r0
            float r0 = (float) r2     // Catch:{ Exception -> 0x0586 }
            float r2 = (float) r3     // Catch:{ Exception -> 0x0586 }
            float r2 = r2 * r4
            float r0 = r0 - r2
            r9 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r9
            r11 = 0
            goto L_0x038c
        L_0x037d:
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = (float) r2     // Catch:{ Exception -> 0x0586 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x0586 }
            float r2 = r2 / r3
            float r3 = (float) r4     // Catch:{ Exception -> 0x0586 }
            float r0 = (float) r0     // Catch:{ Exception -> 0x0586 }
            float r0 = r0 * r2
            float r3 = r3 - r0
            float r3 = r3 * r9
            r4 = r2
            r11 = r3
            r0 = 0
        L_0x038c:
            android.graphics.Matrix r2 = new android.graphics.Matrix     // Catch:{ Exception -> 0x0586 }
            r2.<init>()     // Catch:{ Exception -> 0x0586 }
            r2.setScale(r4, r4)     // Catch:{ Exception -> 0x0586 }
            r2.postTranslate(r11, r0)     // Catch:{ Exception -> 0x0586 }
            r3 = 0
            r6.drawBitmap(r1, r2, r3)     // Catch:{ Exception -> 0x0589 }
        L_0x039b:
            r0 = r18
        L_0x039d:
            if (r7 == 0) goto L_0x03a8
            int r1 = r7.length()     // Catch:{ Exception -> 0x0589 }
            if (r1 != 0) goto L_0x03a6
            goto L_0x03a8
        L_0x03a6:
            r1 = 0
            goto L_0x03a9
        L_0x03a8:
            r1 = 1
        L_0x03a9:
            if (r1 == 0) goto L_0x03ee
            hi2.h r1 = hi2.C98453h.f288774a     // Catch:{ Exception -> 0x0589 }
            long r1 = eb0.C31543z5.m39453c()     // Catch:{ Exception -> 0x0589 }
            java.lang.String r4 = hi2.C98453h.f288775b     // Catch:{ Exception -> 0x0589 }
            com.tencent.p014mm.vfs.C86013q1.m106461v(r4)     // Catch:{ Exception -> 0x0589 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0589 }
            r6.<init>()     // Catch:{ Exception -> 0x0589 }
            r6.append(r4)     // Catch:{ Exception -> 0x0589 }
            java.lang.String r4 = "thumb"
            r6.append(r4)     // Catch:{ Exception -> 0x0589 }
            r6.append(r1)     // Catch:{ Exception -> 0x0589 }
            java.lang.String r1 = ".jpg"
            r6.append(r1)     // Catch:{ Exception -> 0x0589 }
            java.lang.String r7 = r6.toString()     // Catch:{ Exception -> 0x0589 }
            java.lang.String r1 = "<set-?>"
            gy3.C87412m.m108594g(r7, r1)     // Catch:{ Exception -> 0x0589 }
            r5.f287129e = r7     // Catch:{ Exception -> 0x0589 }
            goto L_0x03ee
        L_0x03d8:
            r29 = r4
            r24 = r10
            r3 = 0
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0589 }
            r0.<init>()     // Catch:{ Exception -> 0x0589 }
            java.lang.String r1 = "exist thumb bitmap "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)     // Catch:{ Exception -> 0x0589 }
            r1 = 1
            r0.inMutable = r1     // Catch:{ Exception -> 0x0589 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(r7, r0)     // Catch:{ Exception -> 0x0589 }
        L_0x03ee:
            r1 = r7
            if (r0 != 0) goto L_0x0408
            java.lang.String r0 = "createGraffitiThumb thumb is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x0589 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)     // Catch:{ Exception -> 0x0589 }
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0589 }
            r5 = 986(0x3da, double:4.87E-321)
            r7 = 9
            r9 = 1
            r4.mo175913w(r5, r7, r9)     // Catch:{ Exception -> 0x0589 }
            r17 = r3
            goto L_0x05a4
        L_0x0408:
            int r2 = r13.f287151a     // Catch:{ Exception -> 0x0589 }
            int r4 = r13.f287152b     // Catch:{ Exception -> 0x0589 }
            android.graphics.Point r6 = new android.graphics.Point     // Catch:{ Exception -> 0x0589 }
            r7 = 1
            int r2 = r2 * 1
            int r4 = r4 * 1
            r6.<init>(r2, r4)     // Catch:{ Exception -> 0x0589 }
            hi2.o r2 = hi2.C98464o.f288797a     // Catch:{ Exception -> 0x0589 }
            java.lang.String r4 = r5.f287128d     // Catch:{ Exception -> 0x0589 }
            hi2.o$a r2 = r2.mo137832a(r4)     // Catch:{ Exception -> 0x0589 }
            boolean r4 = r5.f287132h     // Catch:{ Exception -> 0x0589 }
            if (r4 != 0) goto L_0x0464
            if (r2 == 0) goto L_0x042a
            boolean r4 = r2.f288804g     // Catch:{ Exception -> 0x0589 }
            if (r4 != 0) goto L_0x042a
            r4 = 1
            goto L_0x042b
        L_0x042a:
            r4 = 0
        L_0x042b:
            if (r4 == 0) goto L_0x0464
            ei2.d r4 = new ei2.d     // Catch:{ Exception -> 0x0589 }
            r5 = r29
            ah2.a r7 = r5.f272850a     // Catch:{ Exception -> 0x0589 }
            float[] r8 = r7.f263372c     // Catch:{ Exception -> 0x0589 }
            float[] r9 = r7.f263373d     // Catch:{ Exception -> 0x0589 }
            java.util.List<bi2.a> r10 = r7.f263371b     // Catch:{ Exception -> 0x0589 }
            int r11 = r6.x     // Catch:{ Exception -> 0x0589 }
            int r6 = r6.y     // Catch:{ Exception -> 0x0589 }
            int r3 = r2.f288798a     // Catch:{ Exception -> 0x0586 }
            int r2 = r2.f288799b     // Catch:{ Exception -> 0x0586 }
            r25 = 0
            java.lang.String r7 = r7.f263380k     // Catch:{ Exception -> 0x0586 }
            r27 = 256(0x100, float:3.59E-43)
            r28 = 0
            r16 = r4
            r17 = r8
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r6
            r22 = r3
            r23 = r2
            r26 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0586 }
            ei2.g r2 = new ei2.g     // Catch:{ Exception -> 0x0586 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0586 }
            goto L_0x0497
        L_0x0464:
            r5 = r29
            ei2.d r2 = new ei2.d     // Catch:{ Exception -> 0x0586 }
            ah2.a r3 = r5.f272850a     // Catch:{ Exception -> 0x0586 }
            float[] r4 = r3.f263372c     // Catch:{ Exception -> 0x0586 }
            float[] r7 = r3.f263373d     // Catch:{ Exception -> 0x0586 }
            java.util.List<bi2.a> r8 = r3.f263371b     // Catch:{ Exception -> 0x0586 }
            int r9 = r6.x     // Catch:{ Exception -> 0x0586 }
            int r6 = r6.y     // Catch:{ Exception -> 0x0586 }
            r22 = 0
            r23 = 0
            r25 = 0
            java.lang.String r3 = r3.f263380k     // Catch:{ Exception -> 0x0586 }
            r27 = 256(0x100, float:3.59E-43)
            r28 = 0
            r16 = r2
            r17 = r4
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r6
            r26 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0586 }
            ei2.g r3 = new ei2.g     // Catch:{ Exception -> 0x0586 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0586 }
            r2 = r3
        L_0x0497:
            r5.f272854e = r2     // Catch:{ Exception -> 0x0586 }
            r2.mo136912e()     // Catch:{ Exception -> 0x0586 }
            fy3.l<java.lang.Long, android.graphics.Bitmap> r2 = r5.f272873x     // Catch:{ Exception -> 0x0586 }
            r3 = 1
            java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0586 }
            com.tencent.mm.plugin.recordvideo.background.VideoMixer$a r2 = (com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.C94396a) r2     // Catch:{ Exception -> 0x0586 }
            java.lang.Object r2 = r2.invoke(r6)     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ Exception -> 0x0586 }
            fy3.l<java.lang.Long, android.graphics.Bitmap> r6 = r5.f272874y     // Catch:{ Exception -> 0x0586 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0586 }
            com.tencent.mm.plugin.recordvideo.background.VideoMixer$b r6 = (com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.C94397b) r6     // Catch:{ Exception -> 0x0586 }
            java.lang.Object r3 = r6.invoke(r3)     // Catch:{ Exception -> 0x0586 }
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ Exception -> 0x0586 }
            ei2.g r4 = r5.f272854e     // Catch:{ Exception -> 0x0586 }
            if (r4 == 0) goto L_0x057b
            r4.mo136911d()     // Catch:{ Exception -> 0x0586 }
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x04e8
            r9 = 0
            int r6 = r13.f287152b     // Catch:{ Exception -> 0x04e2 }
            int r7 = r0.getHeight()     // Catch:{ Exception -> 0x04e2 }
            int r6 = r6 - r7
            float r6 = (float) r6
            float r10 = r6 / r4
            r11 = 4
            r16 = 0
            r6 = r5
            r7 = r0
            r8 = r3
            r4 = 90
            r17 = 0
            r30 = r12
            r12 = r16
            com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.m119413d(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0577 }
            goto L_0x04ef
        L_0x04e2:
            r0 = move-exception
            r17 = 0
        L_0x04e5:
            r1 = r12
            goto L_0x058e
        L_0x04e8:
            r30 = r12
            r4 = 90
            r17 = 0
            r3 = r0
        L_0x04ef:
            if (r2 == 0) goto L_0x054b
            int r6 = r13.f287156f     // Catch:{ Exception -> 0x0577 }
            r7 = 270(0x10e, float:3.78E-43)
            if (r6 == r7) goto L_0x04fc
            if (r6 != r4) goto L_0x04fa
            goto L_0x04fc
        L_0x04fa:
            r4 = 0
            goto L_0x04fd
        L_0x04fc:
            r4 = 1
        L_0x04fd:
            if (r4 == 0) goto L_0x0502
            int r6 = r13.f287152b     // Catch:{ Exception -> 0x0577 }
            goto L_0x0504
        L_0x0502:
            int r6 = r13.f287151a     // Catch:{ Exception -> 0x0577 }
        L_0x0504:
            if (r4 == 0) goto L_0x0509
            int r4 = r13.f287151a     // Catch:{ Exception -> 0x0577 }
            goto L_0x050b
        L_0x0509:
            int r4 = r13.f287152b     // Catch:{ Exception -> 0x0577 }
        L_0x050b:
            int r7 = r0.getWidth()     // Catch:{ Exception -> 0x0577 }
            if (r7 <= r6) goto L_0x0526
            int r0 = r0.getWidth()     // Catch:{ Exception -> 0x0577 }
            int r0 = r0 - r6
            float r0 = (float) r0     // Catch:{ Exception -> 0x0577 }
            r4 = 1073741824(0x40000000, float:2.0)
            float r9 = r0 / r4
            r10 = 0
            r11 = 8
            r12 = 0
            r6 = r5
            r7 = r2
            r8 = r3
            com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.m119413d(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0577 }
            goto L_0x054b
        L_0x0526:
            int r6 = r0.getHeight()     // Catch:{ Exception -> 0x0577 }
            if (r6 <= r4) goto L_0x0540
            r9 = 0
            int r0 = r0.getHeight()     // Catch:{ Exception -> 0x0577 }
            int r0 = r0 - r4
            float r0 = (float) r0     // Catch:{ Exception -> 0x0577 }
            r4 = 1073741824(0x40000000, float:2.0)
            float r10 = r0 / r4
            r11 = 4
            r12 = 0
            r6 = r5
            r7 = r2
            r8 = r3
            com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.m119413d(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0577 }
            goto L_0x054b
        L_0x0540:
            r9 = 0
            r10 = 0
            r11 = 12
            r12 = 0
            r6 = r5
            r7 = r2
            r8 = r3
            com.tencent.p014mm.plugin.recordvideo.background.VideoMixer.m119413d(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0577 }
        L_0x054b:
            r0 = 70
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0577 }
            r5 = 1
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r3, r0, r4, r1, r5)     // Catch:{ Exception -> 0x0577 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0577 }
            r0.<init>()     // Catch:{ Exception -> 0x0577 }
            java.lang.String r3 = "createGraffitiThumb : "
            r0.append(r3)     // Catch:{ Exception -> 0x0577 }
            r0.append(r1)     // Catch:{ Exception -> 0x0577 }
            java.lang.String r1 = "   graffiti : "
            r0.append(r1)     // Catch:{ Exception -> 0x0577 }
            if (r2 != 0) goto L_0x0569
            r1 = 1
            goto L_0x056a
        L_0x0569:
            r1 = 0
        L_0x056a:
            r0.append(r1)     // Catch:{ Exception -> 0x0577 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0577 }
            r1 = r30
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)     // Catch:{ Exception -> 0x0584 }
            goto L_0x05a4
        L_0x0577:
            r0 = move-exception
            r1 = r30
            goto L_0x058e
        L_0x057b:
            r1 = r12
            r17 = 0
            java.lang.String r0 = "frameRetriever"
            gy3.C87412m.m108603p(r0)     // Catch:{ Exception -> 0x0584 }
            throw r17     // Catch:{ Exception -> 0x0584 }
        L_0x0584:
            r0 = move-exception
            goto L_0x058e
        L_0x0586:
            r0 = move-exception
            goto L_0x0192
        L_0x0589:
            r0 = move-exception
            r17 = r3
            goto L_0x04e5
        L_0x058e:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r2 = "createGraffitiThumb error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r3)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r14)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 986(0x3da, double:4.87E-321)
            r7 = 9
            r9 = 1
            r4.mo175913w(r5, r7, r9)
        L_0x05a4:
            zg2.m r0 = zg2.C103020m.f303985a
            r1 = r31
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r2 = r1.f291572e
            fh2.i r3 = r1.f291574g
            java.util.ArrayList<ai2.a> r4 = r3.f287144d
            te3.gb0 r5 = r1.f291575h
            long r6 = r1.f291576i
            java.lang.String r3 = r3.f287149i
            int r8 = r1.f291577j
            java.lang.String r9 = ""
            java.lang.String r10 = "MicroMsg.mix_background.VideoEditStorageUtil"
            java.lang.String r11 = "videoMixer"
            gy3.C87412m.m108594g(r2, r11)
            java.lang.String r11 = "editorData"
            gy3.C87412m.m108594g(r4, r11)
            java.lang.String r11 = "extraConfig"
            gy3.C87412m.m108594g(r5, r11)
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0693 }
            zg2.f r13 = new zg2.f     // Catch:{ Exception -> 0x0693 }
            r13.<init>()     // Catch:{ Exception -> 0x0693 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0693 }
            r14.<init>()     // Catch:{ Exception -> 0x0693 }
            int r15 = r13.hashCode()     // Catch:{ Exception -> 0x0693 }
            r16 = 2147483647(0x7fffffff, float:NaN)
            r15 = r15 & r16
            r14.append(r15)     // Catch:{ Exception -> 0x0693 }
            r15 = 35
            r14.append(r15)     // Catch:{ Exception -> 0x0693 }
            r14.append(r11)     // Catch:{ Exception -> 0x0693 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0693 }
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r14)     // Catch:{ Exception -> 0x0693 }
            r13.field_taskId = r14     // Catch:{ Exception -> 0x0693 }
            r13.field_timeStamp = r11     // Catch:{ Exception -> 0x0693 }
            r14 = 0
            r13.field_mixRetryTime = r14     // Catch:{ Exception -> 0x0693 }
            byte[] r4 = r0.mo142740h(r2, r11, r4)     // Catch:{ Exception -> 0x0693 }
            r13.field_baseItemData = r4     // Catch:{ Exception -> 0x0693 }
            r4 = 1
            r13.field_status = r4     // Catch:{ Exception -> 0x0693 }
            r11 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r4 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x060e
            r6 = r11
        L_0x060e:
            r13.field_expiredTime = r6     // Catch:{ Exception -> 0x0693 }
            com.tencent.mm.plugin.recordvideo.background.VideoMixer$MixConfig r2 = r2.mo129785f()     // Catch:{ Exception -> 0x0693 }
            int r4 = r2.f272876d     // Catch:{ Exception -> 0x0693 }
            r13.field_targetWidth = r4     // Catch:{ Exception -> 0x0693 }
            int r4 = r2.f272877e     // Catch:{ Exception -> 0x0693 }
            r13.field_targetHeight = r4     // Catch:{ Exception -> 0x0693 }
            int r4 = r2.f272878f     // Catch:{ Exception -> 0x0693 }
            r13.field_videoBitrate = r4     // Catch:{ Exception -> 0x0693 }
            int r4 = r2.f272879g     // Catch:{ Exception -> 0x0693 }
            r13.field_audioBitrate = r4     // Catch:{ Exception -> 0x0693 }
            int r4 = r2.f272880h     // Catch:{ Exception -> 0x0693 }
            r13.field_audioSampleRate = r4     // Catch:{ Exception -> 0x0693 }
            int r4 = r2.f272881i     // Catch:{ Exception -> 0x0693 }
            r13.field_audioChannelCount = r4     // Catch:{ Exception -> 0x0693 }
            int r4 = r2.f272882j     // Catch:{ Exception -> 0x0693 }
            r13.field_frameRate = r4     // Catch:{ Exception -> 0x0693 }
            int r4 = r2.f272883n     // Catch:{ Exception -> 0x0693 }
            r13.field_videoRotate = r4     // Catch:{ Exception -> 0x0693 }
            byte[] r4 = r5.toByteArray()     // Catch:{ Exception -> 0x0693 }
            r13.field_extraConfig = r4     // Catch:{ Exception -> 0x0693 }
            th2.d r4 = th2.C110992d.f332425a     // Catch:{ Exception -> 0x0693 }
            com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo r4 = r4.mo162676j()     // Catch:{ Exception -> 0x0693 }
            r4.getClass()     // Catch:{ Exception -> 0x0693 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0693 }
            java.util.HashMap r4 = r4.f272939d     // Catch:{ Exception -> 0x0693 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0693 }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x0693 }
            r13.field_reportInfo = r4     // Catch:{ Exception -> 0x0693 }
            com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager r4 = com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager.f272890c     // Catch:{ Exception -> 0x0693 }
            android.os.Bundle r4 = r4.f272892b     // Catch:{ Exception -> 0x0693 }
            java.lang.String r0 = r0.mo142734b(r4)     // Catch:{ Exception -> 0x0693 }
            r13.field_userData = r0     // Catch:{ Exception -> 0x0693 }
            if (r3 != 0) goto L_0x065d
            r3 = r9
        L_0x065d:
            r13.field_blurBgPath = r3     // Catch:{ Exception -> 0x0693 }
            r13.field_fromScene = r8     // Catch:{ Exception -> 0x0693 }
            zg2.g r0 = zg2.C103020m.f303986b     // Catch:{ Exception -> 0x0693 }
            boolean r0 = r0.insert(r13)     // Catch:{ Exception -> 0x0693 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0693 }
            r3.<init>()     // Catch:{ Exception -> 0x0693 }
            java.lang.String r4 = "insertRemuxTask:"
            r3.append(r4)     // Catch:{ Exception -> 0x0693 }
            r3.append(r2)     // Catch:{ Exception -> 0x0693 }
            java.lang.String r2 = ", ret:"
            r3.append(r2)     // Catch:{ Exception -> 0x0693 }
            r3.append(r0)     // Catch:{ Exception -> 0x0693 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0693 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)     // Catch:{ Exception -> 0x0693 }
            zg2.a r0 = zg2.C53784a.f150949a     // Catch:{ Exception -> 0x0693 }
            java.lang.String r2 = r13.field_taskId     // Catch:{ Exception -> 0x0693 }
            java.lang.String r3 = "videoEditorData.field_taskId"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ Exception -> 0x0693 }
            r0.mo74352b(r8, r2)     // Catch:{ Exception -> 0x0693 }
            java.lang.String r11 = r13.field_taskId     // Catch:{ Exception -> 0x0693 }
            goto L_0x069c
        L_0x0693:
            r0 = move-exception
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r10, r0, r9, r2)
            r11 = r17
        L_0x069c:
            zg2.n r0 = zg2.C103021n.f303991a
            r0.mo142741b()
            int r0 = r1.f291577j
            r2 = 3
            if (r0 != r2) goto L_0x06e4
            te3.gb0 r0 = r1.f291575h
            boolean r0 = r0.f298294g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "markRemuxStartUniq, isCaptureVideo:"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.StoryRemuxDetailIDKeyStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r5 = 1005(0x3ed, double:4.965E-321)
            r7 = 101(0x65, double:5.0E-322)
            r9 = 1
            r4 = r2
            r4.mo175913w(r5, r7, r9)
            if (r0 == 0) goto L_0x06da
            r5 = 1005(0x3ed, double:4.965E-321)
            r7 = 102(0x66, double:5.04E-322)
            r9 = 1
            r4 = r2
            r4.mo175913w(r5, r7, r9)
            goto L_0x06e4
        L_0x06da:
            r5 = 1005(0x3ed, double:4.965E-321)
            r7 = 103(0x67, double:5.1E-322)
            r9 = 1
            r4 = r2
            r4.mo175913w(r5, r7, r9)
        L_0x06e4:
            lh2.h1$a r0 = new lh2.h1$a
            lh2.f1 r2 = r1.f291571d
            com.tencent.mm.plugin.recordvideo.background.VideoMixer r3 = r1.f291572e
            te3.gb0 r4 = r1.f291575h
            r0.<init>(r2, r3, r11, r4)
            o40.C61926c.m72668M(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lh2.C99445h1.run():void");
    }
}
