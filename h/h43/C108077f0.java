package h43;

import android.app.KeyguardManager;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.util.Size;
import b43.C104031a;
import b43.C104034c;
import bp3.C104160f;
import bp3.C79758p;
import c30.C104289g;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipCameraModularReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipEncoderReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipOpReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.VoipSettingReportStruct;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.NewVoipMgr;
import com.tencent.p014mm.plugin.voip.model.NewVoipMgr$$e;
import com.tencent.p014mm.plugin.voip.model.NewVoipMgr$$f;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.plugin.voip.video.render.VoIPRenderEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tavkit.component.TAVExporter;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import d43.C106987a;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import h43.C108065b0;
import h81.C32735h;
import i72.C98607d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l33.C109247e;
import nj3.C76879j;
import p206nj.C11171e;
import p447aw.C103918d;
import p625nu.C61901d;
import p903ij.C76359b;
import qo3.C77398g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import t33.C110900a;
import u33.C111129a;
import u33.C111130b;
import uu1.C111224d;
import v33.C111382a;
import v33.C111383b;
import v33.C111384c;
import w33.C111714a;
import w33.C111717b;
import w33.C111719c;
import w33.C111721d;
import w33.C111725u;
import w33.C111727w;
import w33.C111728x;
import w33.C111729y;
import w33.C111730z;
import x33.C112039b;
import z04.C112551y;
import z33.C112593f;
import z33.C112595h;
import zt3.C119157j;

/* renamed from: h43.f0 */
public final class C108077f0 {

    /* renamed from: A */
    public final C108059a f323630A;

    /* renamed from: B */
    public final C13601g f323631B;

    /* renamed from: C */
    public final C108081c f323632C;

    /* renamed from: D */
    public boolean f323633D;

    /* renamed from: E */
    public final int f323634E;

    /* renamed from: F */
    public int f323635F;

    /* renamed from: G */
    public final long f323636G;

    /* renamed from: H */
    public int f323637H;

    /* renamed from: I */
    public MTimerHandler f323638I;

    /* renamed from: J */
    public long f323639J;

    /* renamed from: K */
    public C108079b f323640K;

    /* renamed from: a */
    public boolean f323641a;

    /* renamed from: b */
    public C104031a f323642b;

    /* renamed from: c */
    public boolean f323643c;

    /* renamed from: d */
    public boolean f323644d;

    /* renamed from: e */
    public boolean f323645e = true;

    /* renamed from: f */
    public C108126x0 f323646f;

    /* renamed from: g */
    public boolean f323647g;

    /* renamed from: h */
    public boolean f323648h = C112595h.m153920f();

    /* renamed from: i */
    public boolean f323649i = C112595h.m153919e();

    /* renamed from: j */
    public C32224a<C13598b0> f323650j;

    /* renamed from: k */
    public boolean f323651k;

    /* renamed from: l */
    public boolean f323652l;

    /* renamed from: m */
    public int f323653m;

    /* renamed from: n */
    public final boolean f323654n = C112595h.m153927n();

    /* renamed from: o */
    public final boolean f323655o;

    /* renamed from: p */
    public final int f323656p;

    /* renamed from: q */
    public final boolean f323657q;

    /* renamed from: r */
    public C111728x f323658r;

    /* renamed from: s */
    public final boolean f323659s;

    /* renamed from: t */
    public int f323660t;

    /* renamed from: u */
    public int f323661u;

    /* renamed from: v */
    public C108071e f323662v;

    /* renamed from: w */
    public C108065b0 f323663w;

    /* renamed from: x */
    public final long f323664x;

    /* renamed from: y */
    public C111224d f323665y;

    /* renamed from: z */
    public C98607d f323666z;

    /* renamed from: h43.f0$a */
    public static final class C108078a implements C61901d.C61902a {

        /* renamed from: d */
        public final /* synthetic */ C108077f0 f323667d;

        public C108078a(C108077f0 f0Var) {
            this.f323667d = f0Var;
        }

        public final void onOrientationChange(int i) {
            C108077f0 f0Var = this.f323667d;
            f0Var.getClass();
            if (C109247e.vx0().f333441a != i) {
                C111383b vx02 = C109247e.vx0();
                vx02.f333441a = i;
                if (MMHandlerThread.isMainThread()) {
                    vx02.f333442b.setValue(Integer.valueOf(i));
                } else {
                    vx02.f333442b.postValue(Integer.valueOf(i));
                }
                Log.m105924i("MicroMsg.VoIPRenderMgr", "analysisCurrentOriWithPhysicalOri, orientation:" + i);
                f0Var.mo158496k(i);
            }
            int j = C75044y4.m89998j(MMApplicationContext.getContext());
            int i2 = 0;
            if (j != 0) {
                if (j == 1) {
                    i2 = 90;
                } else if (j == 2) {
                    i2 = 180;
                } else if (j == 3) {
                    i2 = 270;
                }
            }
            f0Var.f323660t = i2;
            if (f0Var.f323661u != i) {
                f0Var.f323653m = i2;
                f0Var.f323661u = i;
                f0Var.f323658r.mo163440b(true, i2);
                C109247e.vx0().f333443c = f0Var.f323660t;
                f0Var.f323658r.f334526a.mo162594a(25);
            }
        }
    }

    /* renamed from: h43.f0$b */
    public static final class C108079b implements C104034c {

        /* renamed from: d */
        public final /* synthetic */ C108077f0 f323668d;

        /* renamed from: h43.f0$b$a */
        public static final class C108080a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C108077f0 f323669d;

            public C108080a(C108077f0 f0Var) {
                this.f323669d = f0Var;
            }

            public final void run() {
                C108077f0 f0Var;
                C104031a aVar;
                C108071e eVar = this.f323669d.f323662v;
                if (eVar != null) {
                    NewVoipMgr newVoipMgr = (NewVoipMgr) eVar;
                    if (newVoipMgr.f317053C || newVoipMgr.f317093h == null || newVoipMgr.f317093h.mo152927i3() == null || (f0Var = newVoipMgr.f317092g) == null || (aVar = f0Var.f323642b) == null) {
                        Log.m105918d("MicroMsg.Voip.NewVoipMgr", "onCameraError, already show");
                    } else if (!aVar.mo145635g()) {
                        if (Build.MANUFACTURER.equalsIgnoreCase("meizu") && !C76359b.m91785b() && C11171e.m11044a(29)) {
                            Log.m105918d("MicroMsg.Voip.NewVoipMgr", "onCameraError, meizu machine");
                        } else if (!C11171e.m11046c(28) || !((KeyguardManager) MMApplicationContext.getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                            Log.m105918d("MicroMsg.Voip.NewVoipMgr", "onCameraError, show dialog");
                            C115669n.INSTANCE.mo160131h(11306, 0, 0);
                            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125775MJ(newVoipMgr.f317093h.mo152927i3(), "android.permission.CAMERA", 19, "", "", new NewVoipMgr$$e(newVoipMgr))) {
                                newVoipMgr.f317053C = true;
                                return;
                            }
                            C77398g gVar = null;
                            try {
                                gVar = C76879j.m92754y(newVoipMgr.f317093h.mo152927i3(), newVoipMgr.f317093h.mo152927i3().getString(C0966R.string.khw), (String) null, newVoipMgr.f317093h.mo152927i3().getString(C0966R.string.f8028zq), new NewVoipMgr$$f(newVoipMgr));
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.Voip.NewVoipMgr", e, "failed to show alert", new Object[0]);
                            }
                            if (gVar == null) {
                                Log.m105920e("MicroMsg.Voip.NewVoipMgr", "new dialog failed");
                                return;
                            }
                            gVar.setCancelable(false);
                            gVar.setCanceledOnTouchOutside(false);
                            gVar.show();
                            newVoipMgr.f317053C = true;
                        } else {
                            Log.m105925i("MicroMsg.Voip.NewVoipMgr", "api level: %s, in keyguard, ignore", Integer.valueOf(Build.VERSION.SDK_INT));
                        }
                    }
                }
            }
        }

        public C108079b(C108077f0 f0Var) {
            this.f323668d = f0Var;
        }

        /* renamed from: D */
        public void mo145645D(int i) {
            ArrayList<C110900a> arrayList = C111382a.f333440a;
            Iterator<C110900a> it = C111382a.f333440a.iterator();
            while (it.hasNext()) {
                it.next().mo162594a(i);
            }
        }

        /* renamed from: I */
        public void mo145646I(byte[] bArr, long j, int i, int i2, int i3, int i4, double d) {
        }

        /* renamed from: c */
        public void mo145647c(int i) {
        }

        /* renamed from: k */
        public void mo145648k() {
            ((C119157j) C119157j.f356862d).mo183895z(new C108080a(this.f323668d));
            C111730z zVar = C111730z.f334576a;
            C111730z.f334580e = 1;
        }

        /* renamed from: t */
        public void mo145649t(int i, int i2) {
            Log.printInfoStack("MicroMsg.VoIPRenderMgr", "camera preview size apply is " + i2 + " and " + i, new Object[0]);
            C108126x0 x0Var = this.f323668d.f323646f;
            if (x0Var != null) {
                C108115u uVar = x0Var.f323774a;
                if (uVar != null) {
                    uVar.mo158525e(new Size(i2, i));
                }
                C108115u uVar2 = x0Var.f323774a;
                if (uVar2 != null) {
                    uVar2.f323738a = i2;
                }
                if (uVar2 != null) {
                    uVar2.f323739b = i;
                }
                C108061b bVar = x0Var.f323777d;
                if (bVar != null) {
                    bVar.mo158467k(new Size(i2, i));
                }
                C108128y0 y0Var = x0Var.f323775b;
                if (y0Var != null) {
                    y0Var.mo158467k(new Size(i2, i));
                }
            }
            C109247e.vx0().f333456p = new Size(i2, i);
            this.f323668d.getClass();
            C111714a aVar = C111384c.f333462a;
            if (aVar != null) {
                C112039b.C112040a aVar2 = aVar.f334396b.get(aVar.f334399e);
                String str = aVar2 != null ? aVar2.f335407g == null ? aVar2.f335401a : aVar2.f335410j : null;
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -2057948716) {
                        if (hashCode != 931431321) {
                            if (hashCode == 1776673909 && str.equals("InitCamera")) {
                                aVar.mo163389a();
                                aVar.f334399e = null;
                            }
                        } else if (str.equals("SwitchCamera")) {
                            C112039b.C112040a aVar3 = aVar.f334396b.get(aVar.f334402h);
                            if (aVar3 != null) {
                                aVar3.mo163758b();
                            }
                            C111714a.C111715a aVar4 = aVar.f334395a;
                            if (aVar4 != null) {
                                if (aVar4.f334407a == 1) {
                                    C112039b.C112040a aVar5 = aVar.f334396b.get("SwitchCamera_1");
                                    if (aVar5 != null) {
                                        long milliSecondsToNow = aVar.f334404j + Util.milliSecondsToNow(aVar5.f335408h);
                                        aVar.f334404j = milliSecondsToNow;
                                        aVar.f334404j = milliSecondsToNow / ((long) 2);
                                    }
                                } else {
                                    C112039b.C112040a aVar6 = aVar.f334396b.get("CameraIDChanged_0");
                                    if (aVar6 != null) {
                                        long milliSecondsToNow2 = aVar.f334404j + Util.milliSecondsToNow(aVar6.f335408h);
                                        aVar.f334404j = milliSecondsToNow2;
                                        aVar.f334404j = milliSecondsToNow2 / ((long) 2);
                                    }
                                }
                            }
                            Log.m105924i("MicroMsg.VoIPCameraParamsReport", "switchCamera end cost " + aVar.f334404j);
                            aVar.f334399e = null;
                        }
                    } else if (str.equals("SwitchPreview")) {
                        C112039b.C112040a aVar7 = aVar.f334396b.get("SwitchPreview");
                        if (aVar7 != null) {
                            aVar7.mo163758b();
                        }
                        aVar.f334399e = null;
                    }
                }
                aVar.mo163389a();
                aVar.f334399e = null;
            }
            C104031a aVar8 = this.f323668d.f323642b;
            if (aVar8 != null) {
                aVar8.mo145636h();
            }
        }
    }

    /* renamed from: h43.f0$c */
    public static final class C108081c implements DisplayManager.DisplayListener {

        /* renamed from: d */
        public final /* synthetic */ C108077f0 f323670d;

        public C108081c(C108077f0 f0Var) {
            this.f323670d = f0Var;
        }

        public void onDisplayAdded(int i) {
            Log.m105924i("MicroMsg.VoIPRenderMgr", "onDisplayAdded: " + i);
            this.f323670d.mo158488c();
        }

        public void onDisplayChanged(int i) {
            Log.m105924i("MicroMsg.VoIPRenderMgr", "onDisplayChanged: " + i);
            this.f323670d.mo158488c();
        }

        public void onDisplayRemoved(int i) {
            Log.m105924i("MicroMsg.VoIPRenderMgr", "onDisplayRemoved: " + i);
            this.f323670d.mo158488c();
        }
    }

    /* renamed from: h43.f0$d */
    public static final class C108082d extends C87413o implements C32224a<DisplayManager> {

        /* renamed from: d */
        public static final C108082d f323671d = new C108082d();

        public C108082d() {
            super(0);
        }

        public Object invoke() {
            Object systemService = MMApplicationContext.getContext().getSystemService("display");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            return (DisplayManager) systemService;
        }
    }

    /* renamed from: h43.f0$e */
    public static final class C108083e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108077f0 f323672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108083e(C108077f0 f0Var) {
            super(0);
            this.f323672d = f0Var;
        }

        public Object invoke() {
            String str;
            long j;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            Object obj;
            String str9;
            Long l;
            Integer num;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            String str10;
            String str11;
            String str12;
            String str13;
            Object obj6;
            Object obj7;
            Object obj8;
            String str14;
            String str15;
            Long l2;
            String str16;
            Long l3;
            String str17;
            Long l4;
            String str18;
            Long l5;
            String str19;
            Object obj9;
            Object obj10;
            Object obj11;
            Object obj12;
            C108077f0 f0Var = this.f323672d;
            C104031a aVar = f0Var.f323642b;
            if (aVar != null) {
                try {
                    ((C106987a) aVar).mo145640l();
                } catch (Exception e) {
                    Log.m105918d("MicroMsg.VoIPRenderMgr", "stop capture error:" + e);
                }
                f0Var.f323642b = null;
            }
            C108077f0 f0Var2 = this.f323672d;
            if (f0Var2.f323633D) {
                f0Var2.f323633D = false;
                C111725u uVar = C111384c.f333465d;
                if (uVar != null) {
                    uVar.mo163434p(true, Util.milliSecondsToNow(f0Var2.f323639J));
                }
            }
            long j2 = 0;
            this.f323672d.f323639J = 0;
            C111729y yVar = new C111729y();
            C111384c.f333468g = yVar;
            String str20 = ",";
            yVar.f334542a = C112551y.m153814n(String.valueOf(C109247e.vx0().f333454n), str20, ";", false);
            long j3 = C109247e.vx0().f333459s;
            long milliSecondsToNow = j3 != 0 ? Util.milliSecondsToNow(j3) : 0;
            C111714a aVar2 = C111384c.f333462a;
            if (aVar2 != null) {
                C112039b.C112040a aVar3 = aVar2.f334396b.get(aVar2.f334401g);
                if (aVar3 != null) {
                    aVar3.mo163757a();
                }
                C112039b.C112040a aVar4 = aVar2.f334396b.get(aVar2.f334400f);
                if (aVar4 != null) {
                    aVar4.mo163757a();
                }
                C112039b.C112040a aVar5 = aVar2.f334396b.get(aVar2.f334399e);
                if (aVar5 != null) {
                    aVar5.mo163757a();
                }
                boolean z = aVar2.f334398d;
                VoipCameraModularReportStruct voipCameraModularReportStruct = new VoipCameraModularReportStruct();
                if (z) {
                    j2 = 1;
                }
                voipCameraModularReportStruct.f310358i = j2;
                C111714a.C111715a aVar6 = aVar2.f334395a;
                voipCameraModularReportStruct.f310362m = voipCameraModularReportStruct.mo86045b("CameraSdk", String.valueOf(aVar6 != null ? Integer.valueOf(aVar6.f334410d) : null), true);
                Object obj13 = "InitCameraError";
                voipCameraModularReportStruct.f310355f = aVar2.f334397c.get("InitCameraError") != null ? 1 : 0;
                C112039b.C112040a aVar7 = aVar2.f334397c.get("PreviewSizeError");
                if (aVar7 != null) {
                    voipCameraModularReportStruct.f310361l = voipCameraModularReportStruct.mo86045b("PreviewSizeError", aVar7.f335407g, true);
                }
                voipCameraModularReportStruct.f310360k = aVar2.f334397c.get("SwitchPreviewError") != null ? 1 : 0;
                voipCameraModularReportStruct.f310353d = Math.max(100 - (aVar2.f334397c.size() * 20), 0);
                Object obj14 = "PreviewSizeError";
                voipCameraModularReportStruct.f310370u = aVar2.f334403i;
                j = milliSecondsToNow;
                voipCameraModularReportStruct.f310356g = aVar2.f334397c.get("StartPreviewError") != null ? 1 : 0;
                Object obj15 = obj14;
                voipCameraModularReportStruct.f310357h = aVar2.f334397c.get("StopPreviewError") != null ? 1 : 0;
                Object obj16 = "SwitchPreviewError";
                voipCameraModularReportStruct.f310359j = aVar2.f334397c.get("SwitchCameraError") != null ? 1 : 0;
                voipCameraModularReportStruct.f310372w = aVar2.f334404j;
                voipCameraModularReportStruct.f310371v = aVar2.f334405k;
                C112039b.C112040a aVar8 = aVar2.f334396b.get("SwitchCamera_1");
                int i = aVar8 != null ? aVar8.mo163759c().f335399a : 0;
                str = "CameraSdk";
                C112039b.C112040a aVar9 = aVar2.f334396b.get("SwitchCamera_0");
                voipCameraModularReportStruct.f310363n = i + (aVar9 != null ? aVar9.mo163759c().f335399a : 0);
                C112039b.C112040a aVar10 = aVar2.f334396b.get("SwitchPreview");
                voipCameraModularReportStruct.f310364o = aVar10 != null ? aVar10.mo163759c().f335399a : 0;
                Object obj17 = obj15;
                C112039b.C112040a aVar11 = aVar2.f334396b.get("CameraPreviewSizeChanged_640*480");
                if (aVar11 != null) {
                    obj9 = "SwitchCameraError";
                    obj10 = "StartPreviewError";
                    voipCameraModularReportStruct.f310367r = aVar11.mo163759c().f335400b;
                } else {
                    obj9 = "SwitchCameraError";
                    obj10 = "StartPreviewError";
                }
                C112039b.C112040a aVar12 = aVar2.f334396b.get("CameraPreviewSizeChanged_1280*720");
                if (aVar12 != null) {
                    obj11 = obj13;
                    voipCameraModularReportStruct.f310368s = aVar12.mo163759c().f335400b;
                } else {
                    obj11 = obj13;
                }
                C112039b.C112040a aVar13 = aVar2.f334396b.get("CameraPreviewSizeChanged_1920*1080");
                if (aVar13 != null) {
                    obj12 = "CameraPreviewSizeChanged_1920*1080";
                    voipCameraModularReportStruct.f310369t = aVar13.mo163759c().f335400b;
                } else {
                    obj12 = "CameraPreviewSizeChanged_1920*1080";
                }
                voipCameraModularReportStruct.f310365p = 0;
                voipCameraModularReportStruct.f310366q = 0;
                voipCameraModularReportStruct.f310354e = Util.milliSecondsToNow(C109247e.vx0().f333458r);
                voipCameraModularReportStruct.f310373x = aVar2.f334406l;
                voipCameraModularReportStruct.mo86054n();
                C111729y yVar2 = C111384c.f333468g;
                if (yVar2 != null) {
                    C104289g gVar = new C104289g();
                    gVar.mo145953n("rating", Math.max(100 - (aVar2.f334397c.size() * 20), 0));
                    String gVar2 = gVar.toString();
                    C87412m.m108593f(gVar2, "json.toString()");
                    yVar2.f334543b = C112551y.m153814n(gVar2, str20, ";", false);
                }
                C111729y yVar3 = C111384c.f333468g;
                if (yVar3 != null) {
                    C112039b.C112040a aVar14 = aVar2.f334396b.get("SwitchCamera_1");
                    int i2 = aVar14 != null ? aVar14.mo163759c().f335399a : 0;
                    C112039b.C112040a aVar15 = aVar2.f334396b.get("SwitchCamera_0");
                    int i3 = aVar15 != null ? aVar15.mo163759c().f335399a : 0;
                    int i4 = i2 + i3;
                    C112039b.C112040a aVar16 = aVar2.f334396b.get("SwitchPreview");
                    int i5 = aVar16 != null ? aVar16.mo163759c().f335399a : 0;
                    C104289g gVar3 = new C104289g();
                    gVar3.mo145953n("switchIDTimes", i4);
                    gVar3.mo145953n("switchFrontTimes", i2);
                    gVar3.mo145953n("switchBackTimes", i3);
                    gVar3.mo145953n("switchPreviewTimes", i5);
                    String gVar4 = gVar3.toString();
                    C87412m.m108593f(gVar4, "retInfo.toString()");
                    yVar3.f334544c = C112551y.m153814n(gVar4, str20, ";", false);
                }
                if (C111384c.f333468g != null) {
                    C112039b.C112040a aVar17 = aVar2.f334396b.get("CameraPreviewSizeChanged_640*480");
                    Long valueOf = aVar17 != null ? Long.valueOf(aVar17.mo163759c().f335400b) : null;
                    C112039b.C112040a aVar18 = aVar2.f334396b.get("CameraPreviewSizeChanged_1280*720");
                    Long valueOf2 = aVar18 != null ? Long.valueOf(aVar18.mo163759c().f335400b) : null;
                    C112039b.C112040a aVar19 = aVar2.f334396b.get(obj12);
                    Long valueOf3 = aVar19 != null ? Long.valueOf(aVar19.mo163759c().f335400b) : null;
                    C104289g gVar5 = new C104289g();
                    gVar5.mo145954o("totalFrontIdTime", 0);
                    gVar5.mo145954o("totalBackIdTime", 0);
                    gVar5.put("total480PTime", valueOf);
                    gVar5.put("total720PTime", valueOf2);
                    gVar5.put("total1080PTime", valueOf3);
                    String gVar6 = gVar5.toString();
                    C87412m.m108593f(gVar6, "retInfo.toString()");
                    C112551y.m153814n(gVar6, str20, ";", false);
                }
                if (C111384c.f333468g != null) {
                    C104289g gVar7 = new C104289g();
                    gVar7.mo145954o("switchCost", aVar2.f334404j);
                    gVar7.mo145954o("switchPreview720Cost", 0);
                    gVar7.mo145954o("startPreviewCost", aVar2.f334406l);
                    gVar7.mo145954o("switchPreview1080Cost", 0);
                    String gVar8 = gVar7.toString();
                    C87412m.m108593f(gVar8, "retInfo.toString()");
                    C112551y.m153814n(gVar8, str20, ";", false);
                }
                C111729y yVar4 = C111384c.f333468g;
                if (yVar4 != null) {
                    C104289g gVar9 = new C104289g();
                    gVar9.mo145953n(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, aVar2.f334397c.get(obj11) != null ? 1 : 0);
                    gVar9.mo145953n("startPreview", aVar2.f334397c.get(obj10) != null ? 1 : 0);
                    gVar9.mo145953n("stopPreview", aVar2.f334397c.get("StopPreviewError") != null ? 1 : 0);
                    gVar9.mo145953n("switchCamera", aVar2.f334397c.get(obj9) != null ? 1 : 0);
                    gVar9.mo145953n("switchPreview", aVar2.f334397c.get(obj16) != null ? 1 : 0);
                    C112039b.C112040a aVar20 = aVar2.f334397c.get(obj17);
                    gVar9.put("previewSize", aVar20 != null ? aVar20.f335407g : null);
                    gVar9.mo145966q("leak", aVar2.f334398d);
                    String gVar10 = gVar9.toString();
                    C87412m.m108593f(gVar10, "retInfo.toString()");
                    yVar4.f334545d = C112551y.m153814n(gVar10, str20, ";", false);
                }
                C111384c.f333462a = null;
            } else {
                j = milliSecondsToNow;
                str = "CameraSdk";
            }
            C111717b bVar = C111384c.f333466e;
            if (bVar != null) {
                C112039b.C112040a aVar21 = bVar.f334411a.get(bVar.f334413c);
                if (aVar21 != null) {
                    aVar21.mo163757a();
                }
                C112039b.C112040a aVar22 = bVar.f334411a.get(bVar.f334413c);
                if (!(aVar22 == null || (str19 = aVar22.f335407g) == null)) {
                    HashMap<String, C112039b.C112040a> hashMap = bVar.f334412b;
                    C112039b.C112040a aVar23 = hashMap.get("EncodeBadFrame_" + str19);
                    if (aVar23 != null) {
                        aVar23.mo163757a();
                    }
                }
                C112039b.C112040a aVar24 = bVar.f334411a.get(bVar.f334414d);
                if (aVar24 != null) {
                    aVar24.mo163757a();
                }
                C112039b.C112040a aVar25 = bVar.f334412b.get("EncoderSourceTimeoutNotFrame");
                if (aVar25 != null) {
                    aVar25.mo163757a();
                }
                VoipEncoderReportStruct voipEncoderReportStruct = new VoipEncoderReportStruct();
                C112039b.C112040a aVar26 = bVar.f334411a.get("EncoderDrawSizeChanged_320");
                if (aVar26 != null) {
                    C112039b c = aVar26.mo163759c();
                    voipEncoderReportStruct.f310376f = c.f335399a;
                    voipEncoderReportStruct.f310375e = (int) c.f335400b;
                }
                C112039b.C112040a aVar27 = bVar.f334411a.get("EncoderDrawSizeChanged_480");
                if (aVar27 != null) {
                    C112039b c2 = aVar27.mo163759c();
                    voipEncoderReportStruct.f310378h = c2.f335399a;
                    voipEncoderReportStruct.f310377g = (int) c2.f335400b;
                }
                C112039b.C112040a aVar28 = bVar.f334411a.get("EncoderDrawSizeChanged_640");
                if (aVar28 != null) {
                    C112039b c3 = aVar28.mo163759c();
                    voipEncoderReportStruct.f310380j = c3.f335399a;
                    voipEncoderReportStruct.f310379i = (int) c3.f335400b;
                }
                C112039b.C112040a aVar29 = bVar.f334411a.get("EncoderDrawSizeChanged_1280");
                if (aVar29 != null) {
                    C112039b c4 = aVar29.mo163759c();
                    voipEncoderReportStruct.f310382l = c4.f335399a;
                    voipEncoderReportStruct.f310381k = (int) c4.f335400b;
                }
                C112039b.C112040a aVar30 = bVar.f334411a.get("EncoderDrawSizeChanged_1920");
                if (aVar30 != null) {
                    C112039b c5 = aVar30.mo163759c();
                    voipEncoderReportStruct.f310384n = c5.f335399a;
                    obj2 = "EncoderSourceTimeoutNotFrame";
                    voipEncoderReportStruct.f310383m = (int) c5.f335400b;
                } else {
                    obj2 = "EncoderSourceTimeoutNotFrame";
                }
                C112039b.C112040a aVar31 = bVar.f334411a.get("EncoderModeChangeSoft");
                if (aVar31 != null) {
                    C112039b c6 = aVar31.mo163759c();
                    obj3 = "EncoderModeChangeSoft";
                    voipEncoderReportStruct.f310385o = (int) c6.f335400b;
                    voipEncoderReportStruct.f310387q = c6.f335399a;
                } else {
                    obj3 = "EncoderModeChangeSoft";
                }
                C112039b.C112040a aVar32 = bVar.f334411a.get("EncoderModeChangeHard");
                if (aVar32 != null) {
                    C112039b c7 = aVar32.mo163759c();
                    obj4 = "EncoderModeChangeHard";
                    voipEncoderReportStruct.f310386p = (int) c7.f335400b;
                    voipEncoderReportStruct.f310388r = c7.f335399a;
                } else {
                    obj4 = "EncoderModeChangeHard";
                }
                Object obj18 = obj2;
                C112039b.C112040a aVar33 = bVar.f334412b.get(obj18);
                if (aVar33 != null) {
                    C112039b c8 = aVar33.mo163759c();
                    obj5 = obj18;
                    voipEncoderReportStruct.f310391u = (int) c8.f335400b;
                    voipEncoderReportStruct.f310392v = c8.f335399a;
                } else {
                    obj5 = obj18;
                }
                C112039b.C112040a aVar34 = bVar.f334412b.get("EncodeBadFrame_EncoderModeChangeSoft");
                if (aVar34 != null) {
                    voipEncoderReportStruct.f310389s = aVar34.mo163759c().f335399a;
                }
                C112039b.C112040a aVar35 = bVar.f334412b.get("EncodeBadFrame_EncoderModeChangeHard");
                if (aVar35 != null) {
                    voipEncoderReportStruct.f310390t = aVar35.mo163759c().f335399a;
                }
                str3 = "retInfo.toString()";
                voipEncoderReportStruct.f310395y = voipEncoderReportStruct.mo86045b("encodeFrameRate", C112551y.m153814n(bVar.mo163396d(), str20, ";", false), true);
                Object obj19 = "EncodeBadFrame_EncoderModeChangeHard";
                voipEncoderReportStruct.f310394x = voipEncoderReportStruct.mo86045b("encodeBitrate", C112551y.m153814n(bVar.mo163395c(), str20, ";", false), true);
                voipEncoderReportStruct.f310374d = Math.max(100 - (bVar.f334412b.size() * 20), 0);
                Object obj20 = "EncoderDrawSizeChanged_320";
                long j4 = C109247e.vx0().f333459s;
                if (j4 == 0) {
                    voipEncoderReportStruct.f310393w = 0;
                } else {
                    voipEncoderReportStruct.f310393w = (int) Util.milliSecondsToNow(j4);
                }
                voipEncoderReportStruct.mo86054n();
                C111729y yVar5 = C111384c.f333468g;
                if (yVar5 != null) {
                    C104289g gVar11 = new C104289g();
                    gVar11.mo145953n("rating", Math.max(100 - (bVar.f334412b.size() * 20), 0));
                    gVar11.put("encodeBitrate", bVar.mo163395c());
                    gVar11.put("encodeFrameRate", bVar.mo163396d());
                    String gVar12 = gVar11.toString();
                    C87412m.m108593f(gVar12, "json.toString()");
                    yVar5.f334546e = C112551y.m153814n(gVar12, str20, ";", false);
                }
                C111729y yVar6 = C111384c.f333468g;
                str2 = "rating";
                Object obj21 = "EncodeBadFrame_EncoderModeChangeSoft";
                if (yVar6 == null) {
                    str10 = "soft";
                    Object obj22 = obj3;
                    str13 = "hard";
                    obj8 = obj4;
                    str12 = "json.toString()";
                    str4 = ";";
                    obj6 = obj20;
                    str11 = "1080";
                    obj7 = obj22;
                } else {
                    C111729y yVar7 = yVar6;
                    C104289g gVar13 = new C104289g();
                    String str21 = str20;
                    String str22 = ";";
                    obj6 = obj20;
                    C112039b.C112040a aVar36 = bVar.f334411a.get(obj6);
                    gVar13.put("320", aVar36 != null ? Integer.valueOf(aVar36.mo163759c().f335399a) : null);
                    C112039b.C112040a aVar37 = bVar.f334411a.get("EncoderDrawSizeChanged_480");
                    gVar13.put("480", aVar37 != null ? Integer.valueOf(aVar37.mo163759c().f335399a) : null);
                    C112039b.C112040a aVar38 = bVar.f334411a.get("EncoderDrawSizeChanged_640");
                    gVar13.put("640", aVar38 != null ? Integer.valueOf(aVar38.mo163759c().f335399a) : null);
                    C112039b.C112040a aVar39 = bVar.f334411a.get("EncoderDrawSizeChanged_1280");
                    gVar13.put("720", aVar39 != null ? Integer.valueOf(aVar39.mo163759c().f335399a) : null);
                    C112039b.C112040a aVar40 = bVar.f334411a.get("EncoderDrawSizeChanged_1920");
                    gVar13.put("1080", aVar40 != null ? Integer.valueOf(aVar40.mo163759c().f335399a) : null);
                    str11 = "1080";
                    obj7 = obj3;
                    C112039b.C112040a aVar41 = bVar.f334411a.get(obj7);
                    gVar13.put("hard", aVar41 != null ? Integer.valueOf(aVar41.mo163759c().f335399a) : null);
                    str13 = "hard";
                    obj8 = obj4;
                    C112039b.C112040a aVar42 = bVar.f334411a.get(obj8);
                    gVar13.put("soft", aVar42 != null ? Integer.valueOf(aVar42.mo163759c().f335399a) : null);
                    String gVar14 = gVar13.toString();
                    C87412m.m108593f(gVar14, "json.toString()");
                    str10 = "soft";
                    str12 = "json.toString()";
                    str20 = str21;
                    str4 = str22;
                    yVar7.f334547f = C112551y.m153814n(gVar14, str20, str4, false);
                }
                C111729y yVar8 = C111384c.f333468g;
                if (yVar8 == null) {
                    str5 = str20;
                    str14 = str12;
                } else {
                    C104289g gVar15 = new C104289g();
                    C111729y yVar9 = yVar8;
                    C112039b.C112040a aVar43 = bVar.f334411a.get(obj6);
                    if (aVar43 != null) {
                        str15 = str20;
                        l2 = Long.valueOf(aVar43.mo163759c().f335400b);
                    } else {
                        str15 = str20;
                        l2 = null;
                    }
                    gVar15.put("320", l2);
                    C112039b.C112040a aVar44 = bVar.f334411a.get("EncoderDrawSizeChanged_480");
                    gVar15.put("480", aVar44 != null ? Long.valueOf(aVar44.mo163759c().f335400b) : null);
                    C112039b.C112040a aVar45 = bVar.f334411a.get("EncoderDrawSizeChanged_640");
                    gVar15.put("640", aVar45 != null ? Long.valueOf(aVar45.mo163759c().f335400b) : null);
                    C112039b.C112040a aVar46 = bVar.f334411a.get("EncoderDrawSizeChanged_1280");
                    gVar15.put("720", aVar46 != null ? Long.valueOf(aVar46.mo163759c().f335400b) : null);
                    C112039b.C112040a aVar47 = bVar.f334411a.get("EncoderDrawSizeChanged_1920");
                    if (aVar47 != null) {
                        l3 = Long.valueOf(aVar47.mo163759c().f335400b);
                        str16 = str11;
                    } else {
                        str16 = str11;
                        l3 = null;
                    }
                    gVar15.put(str16, l3);
                    C112039b.C112040a aVar48 = bVar.f334411a.get(obj7);
                    if (aVar48 != null) {
                        l4 = Long.valueOf(aVar48.mo163759c().f335400b);
                        str17 = str13;
                    } else {
                        str17 = str13;
                        l4 = null;
                    }
                    gVar15.put(str17, l4);
                    C112039b.C112040a aVar49 = bVar.f334411a.get(obj8);
                    if (aVar49 != null) {
                        l5 = Long.valueOf(aVar49.mo163759c().f335400b);
                        str18 = str10;
                    } else {
                        str18 = str10;
                        l5 = null;
                    }
                    gVar15.put(str18, l5);
                    String gVar16 = gVar15.toString();
                    str14 = str12;
                    C87412m.m108593f(gVar16, str14);
                    str5 = str15;
                    yVar9.f334548g = C112551y.m153814n(gVar16, str5, str4, false);
                }
                C111729y yVar10 = C111384c.f333468g;
                if (yVar10 != null) {
                    C104289g gVar17 = new C104289g();
                    C112039b.C112040a aVar50 = bVar.f334412b.get(obj5);
                    if (aVar50 != null) {
                        C112039b c9 = aVar50.mo163759c();
                        gVar17.mo145953n("total", (int) c9.f335400b);
                        gVar17.mo145953n("times", c9.f335399a);
                    }
                    C104289g gVar18 = new C104289g();
                    C112039b.C112040a aVar51 = bVar.f334412b.get(obj21);
                    if (aVar51 != null) {
                        C112039b c15 = aVar51.mo163759c();
                        gVar18.mo145953n("total", (int) c15.f335400b);
                        gVar18.mo145953n("times", c15.f335399a);
                    }
                    C104289g gVar19 = new C104289g();
                    C112039b.C112040a aVar52 = bVar.f334412b.get(obj19);
                    if (aVar52 != null) {
                        C112039b c16 = aVar52.mo163759c();
                        gVar19.mo145953n("total", (int) c16.f335400b);
                        gVar19.mo145953n("times", c16.f335399a);
                    }
                    C104289g gVar20 = new C104289g();
                    String gVar21 = gVar17.toString();
                    C87412m.m108593f(gVar21, "notFrame.toString()");
                    gVar20.put("notframe", C112551y.m153814n(gVar21, str5, str4, false));
                    String gVar22 = gVar18.toString();
                    C87412m.m108593f(gVar22, "softBadFrame.toString()");
                    gVar20.put("softBadFrame", C112551y.m153814n(gVar22, str5, str4, false));
                    String gVar23 = gVar19.toString();
                    C87412m.m108593f(gVar23, "hardBadFrame.toString()");
                    gVar20.put("hardBadFrame", C112551y.m153814n(gVar23, str5, str4, false));
                    String gVar24 = gVar20.toString();
                    C87412m.m108593f(gVar24, str14);
                    yVar10.f334549h = C112551y.m153814n(gVar24, str5, str4, false);
                }
                C111384c.f333466e = null;
            } else {
                str2 = "rating";
                str5 = str20;
                str4 = ";";
                str3 = "retInfo.toString()";
            }
            C111719c cVar = C111384c.f333463b;
            if (cVar != null) {
                long j5 = C109247e.vx0().f333458r;
                VoipOpReportStruct voipOpReportStruct = new VoipOpReportStruct();
                C112039b.C112040a aVar53 = cVar.f334429a.get(cVar.f334430b);
                if (aVar53 != null) {
                    aVar53.mo163757a();
                }
                C112039b.C112040a aVar54 = cVar.f334429a.get("EnterFullscreen");
                if (aVar54 != null) {
                    C112039b c17 = aVar54.mo163759c();
                    voipOpReportStruct.f310431e = c17.f335399a;
                    voipOpReportStruct.f310432f = (int) c17.f335400b;
                }
                C112039b.C112040a aVar55 = cVar.f334429a.get("EnterMiniScreen");
                if (aVar55 != null) {
                    C112039b c18 = aVar55.mo163759c();
                    voipOpReportStruct.f310433g = c18.f335399a;
                    voipOpReportStruct.f310434h = (int) c18.f335400b;
                }
                voipOpReportStruct.f310430d = (int) Util.milliSecondsToNow(j5);
                C112039b.C112040a aVar56 = cVar.f334429a.get("RotateDevice_0");
                if (aVar56 != null) {
                    C112039b c19 = aVar56.mo163759c();
                    voipOpReportStruct.f310435i = c19.f335399a;
                    voipOpReportStruct.f310439m = (int) c19.f335400b;
                }
                C112039b.C112040a aVar57 = cVar.f334429a.get("RotateDevice_90");
                if (aVar57 != null) {
                    C112039b c25 = aVar57.mo163759c();
                    voipOpReportStruct.f310436j = c25.f335399a;
                    voipOpReportStruct.f310440n = (int) c25.f335400b;
                }
                C112039b.C112040a aVar58 = cVar.f334429a.get("RotateDevice_180");
                if (aVar58 != null) {
                    C112039b c26 = aVar58.mo163759c();
                    voipOpReportStruct.f310437k = c26.f335399a;
                    voipOpReportStruct.f310441o = (int) c26.f335400b;
                }
                C112039b.C112040a aVar59 = cVar.f334429a.get("RotateDevice_270");
                if (aVar59 != null) {
                    C112039b c27 = aVar59.mo163759c();
                    voipOpReportStruct.f310438l = c27.f335399a;
                    voipOpReportStruct.f310442p = (int) c27.f335400b;
                }
                voipOpReportStruct.mo86054n();
                C111729y yVar11 = C111384c.f333468g;
                if (yVar11 == null) {
                    obj = "EnterFullscreen";
                    str6 = str3;
                } else {
                    C104289g gVar25 = new C104289g();
                    C112039b.C112040a aVar60 = cVar.f334429a.get("EnterFullscreen");
                    if (aVar60 != null) {
                        num = Integer.valueOf(aVar60.mo163759c().f335399a);
                        obj = "EnterFullscreen";
                    } else {
                        obj = "EnterFullscreen";
                        num = null;
                    }
                    gVar25.put("enterFull", num);
                    C112039b.C112040a aVar61 = cVar.f334429a.get("EnterMiniScreen");
                    gVar25.put("enterMini", aVar61 != null ? Integer.valueOf(aVar61.mo163759c().f335399a) : null);
                    C112039b.C112040a aVar62 = cVar.f334429a.get("RotateDevice_0");
                    gVar25.put("rotate0", aVar62 != null ? Integer.valueOf(aVar62.mo163759c().f335399a) : null);
                    C112039b.C112040a aVar63 = cVar.f334429a.get("RotateDevice_90");
                    gVar25.put("rotate90", aVar63 != null ? Integer.valueOf(aVar63.mo163759c().f335399a) : null);
                    C112039b.C112040a aVar64 = cVar.f334429a.get("RotateDevice_180");
                    gVar25.put("rotate180", aVar64 != null ? Integer.valueOf(aVar64.mo163759c().f335399a) : null);
                    C112039b.C112040a aVar65 = cVar.f334429a.get("RotateDevice_270");
                    gVar25.put("rotate270", aVar65 != null ? Integer.valueOf(aVar65.mo163759c().f335399a) : null);
                    String gVar26 = gVar25.toString();
                    str6 = str3;
                    C87412m.m108593f(gVar26, str6);
                    yVar11.f334557p = C112551y.m153814n(gVar26, str5, str4, false);
                }
                C111729y yVar12 = C111384c.f333468g;
                if (yVar12 == null) {
                    str7 = str5;
                } else {
                    C104289g gVar27 = new C104289g();
                    C111729y yVar13 = yVar12;
                    C112039b.C112040a aVar66 = cVar.f334429a.get(obj);
                    if (aVar66 != null) {
                        str9 = str5;
                        l = Long.valueOf(aVar66.mo163759c().f335400b);
                    } else {
                        str9 = str5;
                        l = null;
                    }
                    gVar27.put("full", l);
                    C112039b.C112040a aVar67 = cVar.f334429a.get("EnterMiniScreen");
                    gVar27.put("mini", aVar67 != null ? Long.valueOf(aVar67.mo163759c().f335400b) : null);
                    C112039b.C112040a aVar68 = cVar.f334429a.get("RotateDevice_0");
                    gVar27.put("rotate0", aVar68 != null ? Long.valueOf(aVar68.mo163759c().f335400b) : null);
                    C112039b.C112040a aVar69 = cVar.f334429a.get("RotateDevice_90");
                    gVar27.put("rotate90", aVar69 != null ? Long.valueOf(aVar69.mo163759c().f335400b) : null);
                    C112039b.C112040a aVar70 = cVar.f334429a.get("RotateDevice_180");
                    gVar27.put("rotate180", aVar70 != null ? Long.valueOf(aVar70.mo163759c().f335400b) : null);
                    C112039b.C112040a aVar71 = cVar.f334429a.get("RotateDevice_270");
                    gVar27.put("rotate270", aVar71 != null ? Long.valueOf(aVar71.mo163759c().f335400b) : null);
                    String gVar28 = gVar27.toString();
                    C87412m.m108593f(gVar28, str6);
                    str7 = str9;
                    yVar13.f334558q = C112551y.m153814n(gVar28, str7, str4, false);
                }
                cVar.f334429a.clear();
                C111384c.f333463b = null;
            } else {
                str7 = str5;
                str6 = str3;
            }
            C111727w wVar = C111384c.f333464c;
            if (wVar != null) {
                VoipSettingReportStruct voipSettingReportStruct = new VoipSettingReportStruct();
                voipSettingReportStruct.f310509f = voipSettingReportStruct.mo86045b(str, wVar.f334523c, true);
                voipSettingReportStruct.f310508e = wVar.f334522b ? 1 : 0;
                voipSettingReportStruct.f310510g = wVar.f334524d ? 1 : 0;
                voipSettingReportStruct.f310507d = wVar.f334521a ? 1 : 0;
                voipSettingReportStruct.f310511h = wVar.f334525e ? 1 : 0;
                voipSettingReportStruct.mo86054n();
                C111729y yVar14 = C111384c.f333468g;
                if (yVar14 != null) {
                    C104289g gVar29 = new C104289g();
                    gVar29.mo145966q("faceBeauty", wVar.f334521a);
                    gVar29.mo145966q("cameraSdk", wVar.f334521a);
                    String gVar30 = gVar29.toString();
                    C87412m.m108593f(gVar30, str6);
                    yVar14.f334550i = C112551y.m153814n(gVar30, str7, str4, false);
                }
                C111384c.f333464c = null;
            }
            C111725u uVar2 = C111384c.f333465d;
            if (uVar2 != null) {
                uVar2.mo163419a();
                C111729y yVar15 = C111384c.f333468g;
                if (yVar15 == null) {
                    str8 = str2;
                } else {
                    C104289g gVar31 = new C104289g();
                    str8 = str2;
                    gVar31.mo145953n(str8, Math.max(100 - (uVar2.f334497c.size() * 20), 0));
                    String gVar32 = gVar31.toString();
                    C87412m.m108593f(gVar32, "valueJson.toString()");
                    yVar15.f334559r = C112551y.m153814n(gVar32, str7, str4, false);
                }
                C111729y yVar16 = C111384c.f333468g;
                if (yVar16 != null) {
                    yVar16.f334560s = uVar2.mo163427i();
                }
                C111729y yVar17 = C111384c.f333468g;
                if (yVar17 != null) {
                    yVar17.f334561t = uVar2.mo163428j();
                }
                C111729y yVar18 = C111384c.f333468g;
                if (yVar18 != null) {
                    yVar18.f334562u = uVar2.mo163421c();
                }
                C111729y yVar19 = C111384c.f333468g;
                if (yVar19 != null) {
                    yVar19.f334563v = uVar2.mo163424f();
                }
                C111729y yVar20 = C111384c.f333468g;
                if (yVar20 != null) {
                    yVar20.f334564w = uVar2.mo163422d();
                }
                C111729y yVar21 = C111384c.f333468g;
                if (yVar21 != null) {
                    yVar21.f334565x = uVar2.mo163425g();
                }
                C111729y yVar22 = C111384c.f333468g;
                if (yVar22 != null) {
                    yVar22.f334566y = uVar2.mo163420b();
                }
                C111729y yVar23 = C111384c.f333468g;
                if (yVar23 != null) {
                    yVar23.f334567z = uVar2.mo163423e();
                }
                C111729y yVar24 = C111384c.f333468g;
                if (yVar24 != null) {
                    yVar24.f334541A = uVar2.mo163426h();
                }
                C111384c.f333465d = null;
            } else {
                str8 = str2;
            }
            C111721d dVar = C111384c.f333467f;
            if (dVar != null) {
                dVar.mo163402a();
                C111729y yVar25 = C111384c.f333468g;
                if (yVar25 != null) {
                    C104289g gVar33 = new C104289g();
                    gVar33.mo145953n(str8, Math.max(100 - (dVar.f334456d.size() * 20), 0));
                    String gVar34 = gVar33.toString();
                    C87412m.m108593f(gVar34, str6);
                    yVar25.f334551j = C112551y.m153814n(gVar34, str7, str4, false);
                }
                C111729y yVar26 = C111384c.f333468g;
                if (yVar26 != null) {
                    yVar26.f334552k = dVar.mo163408g();
                }
                C111729y yVar27 = C111384c.f333468g;
                if (yVar27 != null) {
                    yVar27.f334553l = dVar.mo163407f();
                }
                C111729y yVar28 = C111384c.f333468g;
                if (yVar28 != null) {
                    yVar28.f334554m = dVar.mo163405d();
                }
                C111729y yVar29 = C111384c.f333468g;
                if (yVar29 != null) {
                    yVar29.f334555n = dVar.mo163410i();
                }
                C111729y yVar30 = C111384c.f333468g;
                if (yVar30 != null) {
                    yVar30.f334556o = dVar.mo163403b();
                }
                dVar.mo163416o();
                C111384c.f333467f = null;
            }
            long j6 = C109247e.vx0().f333458r;
            long milliSecondsToNow2 = j6 != 0 ? Util.milliSecondsToNow(j6) : 0;
            C111729y yVar31 = C111384c.f333468g;
            if (yVar31 != null) {
                yVar31.mo163443a(milliSecondsToNow2, j);
            }
            C111382a.f333440a.clear();
            C111383b vx02 = C109247e.vx0();
            for (Map.Entry<Integer, C111130b> value : vx02.f333453m.entrySet()) {
                C111130b bVar2 = (C111130b) value.getValue();
                bVar2.getClass();
                Log.m105924i("MicroMsg.VoipThread", "release voip render thread " + bVar2.f332734a);
                MMHandler mMHandler = bVar2.f332735b;
                if (mMHandler != null) {
                    mMHandler.removeCallbacksAndMessages((Object) null);
                }
                bVar2.mo162869c(new C111129a(bVar2));
            }
            vx02.f333453m.clear();
            this.f323672d.f323658r.mo163442d();
            new VoIPRenderEvent(2).publish();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: h43.f0$f */
    public static final class C108084f extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C108077f0 f323673d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C108084f(C108077f0 f0Var) {
            super(1);
            this.f323673d = f0Var;
        }

        public Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            this.f323673d.mo158496k(C109247e.vx0().f333441a);
            return C13598b0.f38549a;
        }
    }

    public C108077f0(boolean z) {
        Class cls = C32735h.class;
        this.f323641a = z;
        C79758p pVar = C79758p.f233760a;
        C104160f fVar = C104160f.RepairerConfig_VOIP_CameraChangePreviewSizeLow_Int;
        this.f323655o = pVar.mo109882e(fVar, 0) != 0 ? pVar.mo109882e(fVar, 0) == 1 : ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_voip_camera_change_previewsize_lower, false);
        this.f323656p = pVar.mo109882e(fVar, 0) != 0 ? 0 : ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_temperature_threshold, 38);
        this.f323657q = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_voip_render_mgr_update_render_size, true);
        this.f323658r = new C111728x();
        this.f323659s = C112595h.m153928o();
        this.f323663w = new C108065b0();
        this.f323664x = (long) C112595h.m153917a();
        C108059a aVar = new C108059a(new C108084f(this));
        this.f323630A = aVar;
        C13601g a = C36568h.m40985a(C108082d.f323671d);
        this.f323631B = a;
        C108081c cVar = new C108081c(this);
        this.f323632C = cVar;
        if (this.f323648h) {
            C109247e.vx0().mo163048b(2, new C111130b("encode"));
        }
        C109247e.vx0().f333458r = Util.nowMilliSecond();
        C109247e.vx0().mo163048b(0, new C111130b("camera"));
        C109247e.vx0().mo163048b(1, new C111130b("decode"));
        if (this.f323649i) {
            C109247e.vx0().mo163048b(3, new C111130b("D-Independence"));
        }
        C98607d dVar = new C98607d(MMApplicationContext.getContext());
        this.f323666z = dVar;
        dVar.f289116g = new C108078a(this);
        dVar.enable();
        MMApplicationContext.getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), true, aVar);
        C108115u uVar = null;
        ((DisplayManager) ((C36570n) a).getValue()).registerDisplayListener(cVar, (Handler) null);
        Size e = mo158490e();
        C108126x0 x0Var = new C108126x0();
        this.f323646f = x0Var;
        x0Var.f323774a = new C108115u(e.getWidth(), e.getHeight());
        x0Var.f323775b = new C108128y0(true);
        x0Var.f323776c = new C108117v();
        x0Var.f323777d = new C108061b();
        C108126x0 x0Var2 = this.f323646f;
        if (x0Var2 != null) {
            C108090i0 i0Var = new C108090i0(this);
            x0Var2.f323778e = i0Var;
            C108128y0 y0Var = x0Var2.f323775b;
            if (y0Var != null) {
                y0Var.f323624q = i0Var;
            }
            C108117v vVar = x0Var2.f323776c;
            if (vVar != null) {
                vVar.f323624q = i0Var;
            }
            C108061b bVar = x0Var2.f323777d;
            if (bVar != null) {
                bVar.f323624q = i0Var;
            }
        }
        C108126x0 x0Var3 = this.f323646f;
        uVar = x0Var3 != null ? x0Var3.f323774a : uVar;
        if (uVar != null) {
            uVar.f323752o = new C108093j0(this);
        }
        C108126x0 x0Var4 = this.f323646f;
        if (x0Var4 != null) {
            C108097l0 l0Var = new C108097l0(this);
            C108115u uVar2 = x0Var4.f323774a;
            if (uVar2 != null) {
                C108112s0 s0Var = new C108112s0(x0Var4, l0Var);
                if (uVar2.f323740c != null || uVar2.f323746i) {
                    s0Var.invoke(uVar2);
                }
                uVar2.mo158524c(new C108094k(uVar2, s0Var));
            }
            C108115u uVar3 = x0Var4.f323774a;
            if (uVar3 != null) {
                Log.m105924i("MicroMsg.PboSurfaceRender", IXWebBroadcastListener.STAGE_START);
                uVar3.mo158524c(new C108106q(uVar3));
            }
        }
        mo158488c();
        C112593f.f337156a.mo164363a();
        C104160f fVar2 = C104160f.RepairerConfig_VOIP_CameraChangePreviewSizeRetryTimes_Int;
        this.f323634E = pVar.mo109882e(fVar2, 1) != 1 ? pVar.mo109882e(fVar2, 1) : ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_voip_camera_retrytimes_change_previewsize, 1);
        this.f323636G = (long) C112595h.m153917a();
        this.f323640K = new C108079b(this);
        C112595h.m153923j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = r0.mo162971a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m146404a(h43.C108077f0 r7) {
        /*
            boolean r0 = r7.f323652l
            if (r0 == 0) goto L_0x0006
            goto L_0x00c3
        L_0x0006:
            uu1.d r0 = r7.f323665y
            r1 = 0
            if (r0 == 0) goto L_0x0014
            uu1.c r0 = r0.mo162971a()
            if (r0 == 0) goto L_0x0014
            uu1.e r0 = r0.f333050c
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 != 0) goto L_0x0019
            goto L_0x00c3
        L_0x0019:
            h43.j r2 = new h43.j
            android.graphics.SurfaceTexture r3 = r0.f333054d
            java.lang.String r4 = "localSurfaceTexture.st"
            gy3.C87412m.m108593f(r3, r4)
            r4 = 0
            r2.<init>((android.graphics.SurfaceTexture) r3, (int) r4, (int) r4)
            h43.x0 r3 = r7.f323646f
            r5 = 1
            if (r3 == 0) goto L_0x0033
            boolean r3 = r3.mo158529b(r2)
            if (r3 != r5) goto L_0x0033
            r3 = 1
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            if (r3 == 0) goto L_0x00bc
            h43.x0 r3 = r7.f323646f
            if (r3 == 0) goto L_0x003d
            r3.mo158528a(r2, r4)
        L_0x003d:
            r7.mo158493h(r2, r4)
            h43.x0 r3 = r7.f323646f
            if (r3 == 0) goto L_0x0047
            r3.mo158531d()
        L_0x0047:
            h43.b0 r3 = r7.f323663w
            android.graphics.SurfaceTexture r6 = r0.f333054d
            h43.b0$a r3 = r3.f323592a
            r3.f323594a = r6
            r3.f323595b = r2
            h43.n0 r3 = new h43.n0
            r3.<init>(r7, r2)
            r0.f333055e = r3
            r3.mo158517c(r6)
            zt3.t r2 = zt3.C119157j.f356862d
            uu1.e$$a r3 = new uu1.e$$a
            r3.<init>(r0)
            zt3.j r2 = (zt3.C119157j) r2
            r2.mo183895z(r3)
            uu1.d r0 = r7.f323665y
            if (r0 == 0) goto L_0x0073
            uu1.c r0 = r0.mo162972b()
            if (r0 == 0) goto L_0x0073
            uu1.e r1 = r0.f333050c
        L_0x0073:
            if (r1 != 0) goto L_0x0076
            goto L_0x00c3
        L_0x0076:
            h43.j r0 = new h43.j
            android.graphics.SurfaceTexture r2 = r1.f333054d
            java.lang.String r3 = "remoteSurfaceTexture.st"
            gy3.C87412m.m108593f(r2, r3)
            r0.<init>((android.graphics.SurfaceTexture) r2, (int) r4, (int) r4)
            h43.x0 r2 = r7.f323646f
            if (r2 == 0) goto L_0x008d
            boolean r2 = r2.mo158529b(r0)
            if (r2 != r5) goto L_0x008d
            r4 = 1
        L_0x008d:
            if (r4 == 0) goto L_0x00c3
            h43.x0 r2 = r7.f323646f
            if (r2 == 0) goto L_0x0096
            r2.mo158528a(r0, r5)
        L_0x0096:
            r7.mo158493h(r0, r5)
            h43.b0 r2 = r7.f323663w
            android.graphics.SurfaceTexture r3 = r1.f333054d
            h43.b0$a r2 = r2.f323593b
            r2.f323594a = r3
            r2.f323595b = r0
            h43.o0 r2 = new h43.o0
            r2.<init>(r7, r0)
            r1.f333055e = r2
            r2.mo158518c(r3)
            zt3.t r0 = zt3.C119157j.f356862d
            uu1.e$$a r2 = new uu1.e$$a
            r2.<init>(r1)
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183895z(r2)
            r7.f323652l = r5
            goto L_0x00c3
        L_0x00bc:
            java.lang.String r7 = "MicroMsg.VoIPRenderMgr"
            java.lang.String r0 = "create surface failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h43.C108077f0.m146404a(h43.f0):void");
    }

    /* renamed from: b */
    public final void mo158487b(int i, int i2) {
        C108126x0 x0Var;
        if (i != 0 && i2 != 0) {
            if (!this.f323647g) {
                C108126x0 x0Var2 = this.f323646f;
                if (x0Var2 != null) {
                    this.f323647g = true;
                    Size size = new Size(i2, i);
                    C108117v vVar = x0Var2.f323776c;
                    if (vVar != null) {
                        vVar.mo158467k(size);
                    }
                }
            } else if (this.f323657q && (x0Var = this.f323646f) != null) {
                Size size2 = new Size(i2, i);
                C108117v vVar2 = x0Var.f323776c;
                if (vVar2 != null) {
                    vVar2.mo158467k(size2);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo158488c() {
        int i;
        int j = C75044y4.m89998j(MMApplicationContext.getContext());
        if (j != 0) {
            if (j == 1) {
                i = 90;
            } else if (j == 2) {
                i = 180;
            } else if (j == 3) {
                i = 270;
            }
            this.f323660t = i;
            this.f323658r.mo163440b(true, i);
            this.f323658r.f334526a.mo162594a(25);
        }
        i = 0;
        this.f323660t = i;
        this.f323658r.mo163440b(true, i);
        this.f323658r.f334526a.mo162594a(25);
    }

    /* renamed from: d */
    public final void mo158489d(C108115u uVar, boolean z) {
        C104031a aVar;
        Size d;
        boolean z2 = false;
        Log.printInfoStack("MicroMsg.VoIPRenderMgr", "bindCameraRenderer", new Object[0]);
        if (!this.f323644d) {
            Log.m105925i("MicroMsg.VoIPRenderMgr", "setCameraCaptureBind,  isFace: %s", Boolean.valueOf(z));
            Size e = mo158490e();
            if (this.f323642b == null) {
                this.f323642b = new C106987a(e.getWidth(), e.getHeight());
            }
        }
        SurfaceTexture surfaceTexture = uVar.f323742e;
        if (surfaceTexture != null && (aVar = this.f323642b) != null) {
            if (!((C103918d) C86312j.m106911c(C103918d.class)).Gd0(MMApplicationContext.getContext(), "android.permission.CAMERA")) {
                Log.m105920e("MicroMsg.VoIPRenderMgr", "camera start failed casue no permisson");
                return;
            }
            if (aVar.mo145633e(this.f323640K, z) == 1) {
                z2 = true;
            }
            this.f323645e = z2;
            if (z2) {
                aVar.mo145629a(surfaceTexture);
                C109247e.xx0().mo152591E(aVar.mo145630b());
                if (this.f323642b != null && aVar.mo145632d() != null) {
                    C104031a aVar2 = this.f323642b;
                    if (aVar2 != null) {
                        aVar2.mo145638j();
                    }
                    this.f323644d = true;
                    C104031a aVar3 = this.f323642b;
                    if (aVar3 != null && (d = aVar3.mo145632d()) != null) {
                        mo158497l(d);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final Size mo158490e() {
        Size j = C112595h.m153923j();
        if (j != null) {
            return j;
        }
        int i = 640;
        int i2 = 480;
        if (v2protocal.f317536W1) {
            i = 1280;
            i2 = TAVExporter.VIDEO_EXPORT_WIDTH;
        }
        return new Size(i, i2);
    }

    /* renamed from: f */
    public final void mo158491f() {
        C108115u uVar;
        Size d;
        C104031a aVar = this.f323642b;
        if (aVar != null) {
            aVar.mo145640l();
            if (!((C103918d) C86312j.m106911c(C103918d.class)).Gd0(MMApplicationContext.getContext(), "android.permission.CAMERA")) {
                Log.m105920e("MicroMsg.VoIPRenderMgr", "camera start failed casue no permisson");
                return;
            }
            C108126x0 x0Var = this.f323646f;
            if (x0Var != null && (uVar = x0Var.f323774a) != null) {
                boolean z = aVar.mo145633e(this.f323640K, true) == 1;
                this.f323645e = z;
                if (z) {
                    SurfaceTexture surfaceTexture = uVar.f323742e;
                    if (surfaceTexture != null) {
                        aVar.mo145629a(surfaceTexture);
                    }
                    C109247e.xx0().mo152591E(aVar.mo145630b());
                    if (this.f323642b != null && aVar.mo145632d() != null) {
                        C104031a aVar2 = this.f323642b;
                        if (aVar2 != null) {
                            aVar2.mo145637i(this.f323653m);
                        }
                        C104031a aVar3 = this.f323642b;
                        if (aVar3 != null) {
                            aVar3.mo145638j();
                        }
                        this.f323644d = true;
                        C104031a aVar4 = this.f323642b;
                        if (aVar4 != null && (d = aVar4.mo145632d()) != null) {
                            mo158497l(d);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo158492g(C108091j jVar, int i, int i2, int i3) {
        C87412m.m108594g(jVar, "renderGLSurface");
        jVar.mo158511d(0, 0, i, i2);
        C108126x0 x0Var = this.f323646f;
        if (x0Var != null) {
            C108128y0 y0Var = x0Var.f323775b;
            if (y0Var != null) {
                if (i3 == 0) {
                    y0Var.f323612e = jVar;
                } else {
                    y0Var.f323613f = jVar;
                }
            }
            C108117v vVar = x0Var.f323776c;
            if (vVar != null) {
                if (i3 == 0) {
                    vVar.f323612e = jVar;
                } else {
                    vVar.f323613f = jVar;
                }
            }
        }
        if (x0Var != null) {
            x0Var.mo158531d();
        }
    }

    /* renamed from: h */
    public final void mo158493h(C108091j jVar, int i) {
        C87412m.m108594g(jVar, "renderGLSurface");
        C108126x0 x0Var = this.f323646f;
        if (x0Var != null) {
            C108128y0 y0Var = x0Var.f323775b;
            if (y0Var != null) {
                if (i == 0) {
                    y0Var.f323612e = jVar;
                } else {
                    y0Var.f323613f = jVar;
                }
            }
            C108117v vVar = x0Var.f323776c;
            if (vVar != null) {
                if (i == 0) {
                    vVar.f323612e = jVar;
                } else {
                    vVar.f323613f = jVar;
                }
            }
        }
        if (x0Var != null) {
            x0Var.mo158531d();
        }
    }

    /* renamed from: i */
    public final void mo158494i(boolean z) {
        Log.m105924i("MicroMsg.VoIPRenderMgr", "pause local video trans");
        C109247e.vx0().f333450j = Boolean.valueOf(z);
    }

    /* renamed from: j */
    public final void mo158495j() {
        Log.m105924i("MicroMsg.VoIPRenderMgr", "release voip render mgr ");
        MTimerHandler mTimerHandler = this.f323638I;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = this.f323638I;
        if (mTimerHandler2 != null) {
            mTimerHandler2.quitSafely();
        }
        this.f323638I = null;
        C98607d dVar = this.f323666z;
        if (dVar != null) {
            dVar.disable();
        }
        C98607d dVar2 = this.f323666z;
        if (dVar2 != null) {
            dVar2.f289116g = null;
        }
        C108065b0 b0Var = this.f323663w;
        C108065b0.C108066a aVar = b0Var.f323593b;
        aVar.f323594a = null;
        C108065b0.C108066a aVar2 = b0Var.f323592a;
        aVar2.f323594a = null;
        aVar2.f323595b = null;
        aVar.f323595b = null;
        this.f323665y = null;
        C112593f.f337156a.mo164363a();
        MMApplicationContext.getContext().getContentResolver().unregisterContentObserver(this.f323630A);
        ((DisplayManager) ((C36570n) this.f323631B).getValue()).unregisterDisplayListener(this.f323632C);
        C108126x0 x0Var = this.f323646f;
        if (x0Var != null) {
            C108083e eVar = new C108083e(this);
            C108115u uVar = x0Var.f323774a;
            if (uVar != null) {
                uVar.mo158524c(new C108124w0(x0Var, eVar));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r0 != false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r0 != false) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo158496k(int r7) {
        /*
            r6 = this;
            b43.a r0 = r6.f323642b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000f
            d43.a r0 = (d43.C106987a) r0
            boolean r0 = r0.f320236a
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r3 = 2
            r4 = 4
            if (r7 == 0) goto L_0x002b
            r5 = 90
            if (r7 == r5) goto L_0x0026
            r5 = 180(0xb4, float:2.52E-43)
            if (r7 == r5) goto L_0x0024
            r5 = 270(0x10e, float:3.78E-43)
            if (r7 == r5) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            if (r0 == 0) goto L_0x002c
            goto L_0x0029
        L_0x0024:
            r3 = 3
            goto L_0x002c
        L_0x0026:
            if (r0 == 0) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r3 = 4
            goto L_0x002c
        L_0x002b:
            r3 = 1
        L_0x002c:
            com.tencent.mm.plugin.voip.model.h0 r7 = l33.C109247e.xx0()
            v33.b r0 = l33.C109247e.vx0()
            boolean r0 = r0.mo163050d()
            if (r0 == 0) goto L_0x004f
            boolean r0 = z33.C112595h.f337172g
            if (r0 == 0) goto L_0x0043
            boolean r0 = z33.C112595h.f337173h
            if (r0 == 0) goto L_0x0043
            r1 = 1
        L_0x0043:
            if (r1 == 0) goto L_0x004e
            v33.b r0 = l33.C109247e.vx0()
            boolean r0 = r0.f333446f
            if (r0 == 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r2 = r3
        L_0x004f:
            com.tencent.mm.plugin.voip.model.m0 r7 = r7.f317332a
            com.tencent.mm.plugin.voip.model.r r7 = r7.f317396a
            r7.getClass()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r0.order(r1)
            byte r1 = (byte) r2
            r0.put(r1)
            com.tencent.mm.plugin.voip.model.v2protocal r7 = r7.f317500x
            byte[] r0 = r0.array()
            r1 = 21
            int r7 = r7.setAppCmd(r1, r0, r4)
            if (r7 >= 0) goto L_0x0088
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "voipContext setOrientation ret:"
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "MicroMsg.Voip.VoipContext"
            z33.C112597j.m153938c(r0, r7)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h43.C108077f0.mo158496k(int):void");
    }

    /* renamed from: l */
    public final void mo158497l(Size size) {
        C108126x0 x0Var = this.f323646f;
        if (x0Var != null) {
            Size size2 = new Size(size.getHeight(), size.getWidth());
            C108115u uVar = x0Var.f323774a;
            if (uVar != null) {
                uVar.mo158525e(size2);
                C108128y0 y0Var = x0Var.f323775b;
                if (y0Var != null) {
                    y0Var.mo158467k(size2);
                }
                C108061b bVar = x0Var.f323777d;
                if (bVar != null) {
                    bVar.mo158467k(size2);
                }
            }
        }
        C111730z zVar = C111730z.f334576a;
        StringBuilder sb = new StringBuilder();
        sb.append(size.getHeight());
        sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        sb.append(size.getWidth());
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "<set-?>");
        C111730z.f334581f = sb4;
    }

    /* renamed from: m */
    public final void mo158498m(int i) {
        C108117v vVar;
        C108109r0 r0Var;
        Log.m105925i("MicroMsg.VoIPRenderMgr", "setHWDecMode, hwdec: %d, before changeSurfaceRender :%d", Integer.valueOf(i), 0);
        C108126x0 x0Var = this.f323646f;
        if (!(x0Var == null || (vVar = x0Var.f323776c) == null || (r0Var = vVar.f323617j) == null)) {
            r0Var.mo158478B(0);
        }
        this.f323658r.f334526a.mo162594a(26);
    }

    /* renamed from: n */
    public final void mo158499n(boolean z) {
        MMHandler mMHandler;
        MMHandler mMHandler2;
        C108126x0 x0Var = this.f323646f;
        if (x0Var != null) {
            C108115u uVar = x0Var.f323774a;
            if (uVar != null) {
                uVar.f323744g = !z;
            }
            C108061b bVar = x0Var.f323777d;
            if (bVar != null) {
                bVar.f323610c = !z;
            }
            C108061b bVar2 = x0Var.f323777d;
            if (bVar2 == null) {
                return;
            }
            if (bVar2.f323584v) {
                C111130b a = C109247e.vx0().mo163047a(2);
                if (a != null && (mMHandler2 = a.f332735b) != null) {
                    mMHandler2.removeCallbacksAndMessages((Object) null);
                    return;
                }
                return;
            }
            C111130b a2 = C109247e.vx0().mo163047a(0);
            if (a2 != null && (mMHandler = a2.f332735b) != null) {
                mMHandler.removeCallbacksAndMessages((Object) null);
            }
        }
    }
}
