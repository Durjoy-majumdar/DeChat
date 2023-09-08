package w33;

import android.hardware.Camera;
import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import l33.C109247e;
import v33.C111384c;
import x33.C112039b;

/* renamed from: w33.a */
public final class C111714a {

    /* renamed from: m */
    public static final C111716b f334394m = new C111716b((C8480h) null);

    /* renamed from: a */
    public C111715a f334395a;

    /* renamed from: b */
    public HashMap<String, C112039b.C112040a> f334396b = new HashMap<>();

    /* renamed from: c */
    public HashMap<String, C112039b.C112040a> f334397c = new HashMap<>();

    /* renamed from: d */
    public boolean f334398d;

    /* renamed from: e */
    public String f334399e;

    /* renamed from: f */
    public String f334400f;

    /* renamed from: g */
    public String f334401g;

    /* renamed from: h */
    public String f334402h;

    /* renamed from: i */
    public long f334403i;

    /* renamed from: j */
    public long f334404j;

    /* renamed from: k */
    public long f334405k;

    /* renamed from: l */
    public long f334406l;

    /* renamed from: w33.a$a */
    public static final class C111715a {

        /* renamed from: a */
        public int f334407a;

        /* renamed from: b */
        public String[] f334408b;

        /* renamed from: c */
        public Size f334409c;

        /* renamed from: d */
        public int f334410d;

        public C111715a(int i) {
            this.f334407a = i;
            String[] strArr = new String[2];
            for (int i2 = 0; i2 < 2; i2++) {
                strArr[i2] = "";
            }
            this.f334408b = strArr;
        }

        public int hashCode() {
            return (int) Util.nowMilliSecond();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("apiLevel ");
            sb.append(this.f334410d);
            sb.append(",cameraid: ");
            sb.append(this.f334407a);
            sb.append(" and preview size is");
            Size size = this.f334409c;
            Integer num = null;
            sb.append(size != null ? Integer.valueOf(size.getWidth()) : null);
            sb.append('*');
            Size size2 = this.f334409c;
            if (size2 != null) {
                num = Integer.valueOf(size2.getHeight());
            }
            sb.append(num);
            return sb.toString();
        }
    }

    /* renamed from: w33.a$b */
    public static final class C111716b {
        public C111716b(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo163392a(Camera.Parameters parameters, int i) {
            C87412m.m108594g(parameters, "parameters");
            C111714a aVar = C111384c.f333462a;
            if (aVar != null) {
                C111715a aVar2 = new C111715a(i);
                parameters.flatten();
                aVar2.f334408b[0] = String.valueOf(parameters.getPreviewFrameRate());
                int[] iArr = new int[2];
                parameters.getPreviewFpsRange(iArr);
                String[] strArr = aVar2.f334408b;
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                sb.append(iArr[0]);
                sb.append(',');
                sb.append(iArr[1]);
                sb.append(']');
                strArr[1] = sb.toString();
                C87412m.m108593f(parameters.getFocusMode(), "parameters.focusMode");
                aVar2.f334407a = i;
                Camera.Size previewSize = parameters.getPreviewSize();
                Integer num = null;
                if (previewSize != null) {
                    Size size = new Size(previewSize.width, previewSize.height);
                    aVar2.f334409c = size;
                    C111714a aVar3 = C111384c.f333462a;
                    if (aVar3 != null) {
                        C112039b.C112040a aVar4 = aVar3.f334396b.get(aVar3.f334401g);
                        if (aVar4 != null) {
                            aVar4.mo163758b();
                        }
                        C112039b.C112040a aVar5 = aVar3.f334396b.get("CameraPreviewSizeChanged_" + null + '*' + null);
                        if (aVar5 != null) {
                            long milliSecondsToNow = aVar3.f334405k + Util.milliSecondsToNow(aVar5.f335408h);
                            aVar3.f334405k = milliSecondsToNow;
                            aVar3.f334405k = milliSecondsToNow / ((long) 2);
                        }
                        Log.m105924i("MicroMsg.VoIPCameraParamsReport", "onCameraPreviewSizeChanged " + size.getWidth() + " * " + size.getHeight() + " cost " + aVar3.f334405k);
                        long j = C109247e.vx0().f333458r;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("CameraPreviewSizeChanged_");
                        sb4.append(size.getWidth());
                        sb4.append('*');
                        sb4.append(size.getHeight());
                        String sb5 = sb4.toString();
                        C112039b.C112040a aVar6 = aVar3.f334396b.get(sb5);
                        if (aVar6 == null) {
                            aVar6 = new C112039b.C112040a();
                        }
                        aVar6.mo163760d(Util.milliSecondsToNow(j));
                        aVar6.mo163762f(sb5);
                        aVar6.f335410j = "CameraPreviewSizeChanged";
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(size.getWidth());
                        sb6.append('*');
                        sb6.append(size.getHeight());
                        aVar6.mo163763g(sb6.toString());
                        aVar3.f334396b.put(sb5, aVar6);
                        aVar3.f334401g = sb5;
                    }
                }
                C111714a aVar7 = C111384c.f333462a;
                if (aVar7 != null) {
                    int i2 = aVar2.f334407a;
                    Log.m105924i("MicroMsg.VoIPCameraParamsReport", "onCameraIdPreviewSelect id " + i2);
                    C112039b.C112040a aVar8 = aVar7.f334396b.get(aVar7.f334400f);
                    if (aVar8 != null) {
                        aVar8.mo163758b();
                    }
                    long j2 = C109247e.vx0().f333458r;
                    String str = "CameraIDChanged_" + i2;
                    C112039b.C112040a aVar9 = aVar7.f334396b.get(str);
                    if (aVar9 == null) {
                        aVar9 = new C112039b.C112040a();
                    }
                    aVar9.mo163760d(Util.milliSecondsToNow(j2));
                    aVar9.mo163762f(str);
                    aVar9.f335410j = "CameraIDChanged";
                    C111715a aVar10 = aVar7.f334395a;
                    if (aVar10 != null) {
                        num = Integer.valueOf(aVar10.f334407a);
                    }
                    aVar9.f335407g = String.valueOf(num);
                    aVar7.f334396b.put(str, aVar9);
                    aVar7.f334400f = str;
                }
                aVar2.f334410d = 1;
                aVar.f334395a = aVar2;
            }
        }
    }

    /* renamed from: a */
    public final void mo163389a() {
        C112039b.C112040a aVar;
        C112039b.C112040a aVar2 = this.f334396b.get("InitCamera");
        if (aVar2 != null) {
            aVar2.mo163757a();
        }
        if (this.f334403i == 0 && (aVar = this.f334396b.get("InitCamera")) != null) {
            this.f334403i = aVar.f335409i;
            Log.m105924i("MicroMsg.VoIPCameraParamsReport", "onCameraInitFinish cost " + this.f334403i);
        }
    }
}
