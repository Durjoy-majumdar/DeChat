package lh2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.p014mm.hardcoder.C40318k;
import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.ABAPrams;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import fh2.C97882i;
import fy3.C32228q;
import fy3.C32229r;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import h90.C98324b;
import hi2.C98453h;
import hi2.C98464o;
import java.util.ArrayList;
import lc3.C10485b;
import p156gj.C107835h0;
import rx3.C13598b0;
import th2.C101891f;
import th2.C110992d;
import zg2.C103021n;

/* renamed from: lh2.g1 */
public final class C99443g1 extends C87413o implements C32229r<String, String, Boolean, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C99431f1 f291560d;

    /* renamed from: e */
    public final /* synthetic */ C97882i f291561e;

    /* renamed from: f */
    public final /* synthetic */ C97882i.C97883a f291562f;

    /* renamed from: g */
    public final /* synthetic */ VideoMixer f291563g;

    /* renamed from: h */
    public final /* synthetic */ C8478d0 f291564h;

    /* renamed from: i */
    public final /* synthetic */ long f291565i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99443g1(C99431f1 f1Var, C97882i iVar, C97882i.C97883a aVar, VideoMixer videoMixer, C8478d0 d0Var, long j) {
        super(4);
        this.f291560d = f1Var;
        this.f291561e = iVar;
        this.f291562f = aVar;
        this.f291563g = videoMixer;
        this.f291564h = d0Var;
        this.f291565i = j;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ((Number) obj4).intValue();
        C87412m.m108594g(str, "mixVideoPath");
        C87412m.m108594g(str2, "mixThumbPath");
        Log.m105924i("MicroMsg.RemuxPlugin", "mixVideoPath: " + str + " ,mixThumbPath: " + str2 + " ,ret: " + booleanValue);
        C32228q<? super String, ? super String, ? super Boolean, C13598b0> qVar = this.f291560d.f291536n;
        if (qVar != null) {
            qVar.invoke(str, str2, Boolean.valueOf(booleanValue));
        }
        C103021n nVar = C103021n.f303991a;
        nVar.getClass();
        Log.m105924i("MicroMsg.mix_background.VideoMixHandler", "VideoMixHandler resumeBgMix!");
        C103021n.f303993c = false;
        C103021n.f303996f = null;
        nVar.mo142741b();
        boolean z = true;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_remux_fail_use_x264, true);
        if (booleanValue || !wf) {
            if (TextUtils.isEmpty(str)) {
                C101891f.f300035a.mo141379m(1003);
                Context context = this.f291560d.f291529d;
                C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).setResult(1003);
                Context context2 = this.f291560d.f291529d;
                C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context2).finish();
            } else {
                C98464o.C98465a a = C98464o.f288797a.mo137832a(str);
                Log.m105924i("MicroMsg.RemuxPlugin", "videoInfo : " + a);
                C99431f1 f1Var = this.f291560d;
                RecordConfigProvider recordConfigProvider = f1Var.f291532g;
                if (recordConfigProvider != null && recordConfigProvider.f272905F == 2) {
                    if (a != null) {
                        a.f288806i = this.f291563g.f272868s;
                    }
                    C97882i.C97883a aVar = this.f291562f;
                    long l = C86013q1.m106451l(str);
                    Class cls = C10485b.class;
                    float f = (float) 1024;
                    float f2 = ((((float) l) * 1.0f) / f) / f;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fileSize : ");
                    sb.append(f2);
                    sb.append(" M fileLength: ");
                    sb.append(l);
                    sb.append(" Byte   duration:");
                    sb.append(a != null ? Integer.valueOf(a.f288800c) : null);
                    Log.m105924i("MicroMsg.RemuxPlugin", sb.toString());
                    if (a != null) {
                        boolean z2 = C107835h0.f322852i.f322662k == 1;
                        boolean z3 = Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("MMSightCheckSendVideoBitrate"), 0) == 1;
                        float f3 = Util.getFloat(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("MMSightCheckSendVideoBitrateLimit"), 1.3f);
                        if (aVar.f287163m == 2) {
                            f3 = 2.0f;
                        }
                        RecordConfigProvider recordConfigProvider2 = f1Var.f291532g;
                        C87412m.m108591d(recordConfigProvider2);
                        Log.m105925i("MicroMsg.RemuxPlugin", "deviceConfigCheckBitrate: %s, serverConfigCheckBitrate: %s, bitrateLimitRatio: %s, actualBR %s, targetBR: %s", Boolean.valueOf(z2), Boolean.valueOf(z3), Float.valueOf(f3), Integer.valueOf(a.f288802e), Integer.valueOf(recordConfigProvider2.f272926n.f267169g));
                        boolean z4 = z2 || z3;
                        int i = a.f288806i;
                        if (i == 0) {
                            if (z4) {
                                RecordConfigProvider recordConfigProvider3 = f1Var.f291532g;
                                C87412m.m108591d(recordConfigProvider3);
                                if (((float) a.f288802e) >= ((float) recordConfigProvider3.f272926n.f267169g) * f3) {
                                    f1Var.mo138873h(aVar);
                                }
                            }
                        } else if (i > 0 && z4) {
                            RecordConfigProvider recordConfigProvider4 = f1Var.f291532g;
                            C87412m.m108591d(recordConfigProvider4);
                            if (((float) a.f288802e) >= ((float) recordConfigProvider4.f272926n.f267169g) * 2.0f) {
                                f1Var.mo138873h(aVar);
                            }
                        }
                    }
                    C101891f.f300035a.mo141386t(0);
                }
                if (this.f291564h.f27483d != 0) {
                    C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcEncodeVideoEnable(), this.f291564h.f27483d);
                    Log.m105925i("MicroMsg.RemuxPlugin", "hardcoder summerPerformance stopPerformance %s", Integer.valueOf(this.f291564h.f27483d));
                    this.f291564h.f27483d = 0;
                }
                this.f291560d.mo138877l(str);
                C99431f1.m129761b(this.f291560d);
                C99431f1 f1Var2 = this.f291560d;
                C97882i.C97883a aVar2 = this.f291562f;
                f1Var2.getClass();
                if (a != null) {
                    if (aVar2.f287163m > 0) {
                        RecordConfigProvider recordConfigProvider5 = f1Var2.f291532g;
                        C87412m.m108591d(recordConfigProvider5);
                        if (((double) a.f288802e) >= ((double) recordConfigProvider5.f272926n.f267169g) * 1.1d) {
                            RecordConfigProvider recordConfigProvider6 = f1Var2.f291532g;
                            C87412m.m108591d(recordConfigProvider6);
                            int i2 = recordConfigProvider6.f272926n.f267169g;
                        }
                    }
                    RecordConfigProvider recordConfigProvider7 = f1Var2.f291532g;
                    C87412m.m108591d(recordConfigProvider7);
                    Log.m105925i("MicroMsg.RemuxPlugin", "steve: qpswitch:%d , actualBR : %d, targetBR: %d, tuneRatio:[%d]", Integer.valueOf(aVar2.f287163m), Integer.valueOf(a.f288802e), Integer.valueOf(recordConfigProvider7.f272926n.f267169g), null);
                }
                C98453h hVar = C98453h.f288774a;
                C99431f1 f1Var3 = this.f291560d;
                RecordConfigProvider recordConfigProvider8 = f1Var3.f291532g;
                C98324b bVar = f1Var3.f291531f;
                boolean z5 = bVar != null ? bVar.f288182c : false;
                boolean z6 = this.f291562f.f287160j;
                Log.m105924i("MicroMsg.MediaFileUtil", "configProvider : " + recordConfigProvider8 + "  isCaptureMedia:" + z5 + "   change:" + z6);
                if (recordConfigProvider8 != null) {
                    boolean z7 = recordConfigProvider8.f272937y;
                    String str3 = recordConfigProvider8.f272900A;
                    C87412m.m108593f(str3, "inputVideoPath");
                    String str4 = recordConfigProvider8.f272901B;
                    C87412m.m108593f(str4, "outputVideoPath");
                    hVar.mo137817o(z7, str3, str4, recordConfigProvider8.f272938z, z5, z6);
                }
                if (this.f291562f.f287163m > 0) {
                    this.f291560d.getClass();
                    SightVideoJNI.addReportMetadata(str, (ABAPrams) null, 0, this.f291562f.f287163m);
                }
                C110992d dVar = C110992d.f332425a;
                dVar.mo162677k("KEY_REMUX_VIDEO_COST_MS_INT", Long.valueOf(System.currentTimeMillis() - this.f291565i));
                C101891f fVar = C101891f.f300035a;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                Log.m105924i("MicroMsg.VideoWidgetReporter", "setMuxEndTimeStamp >> " + elapsedRealtime);
                C101891f.f300036b.f265883Q = elapsedRealtime;
                C98324b bVar2 = this.f291560d.f291531f;
                if (bVar2 != null) {
                    CaptureDataManager.f272890c.f272892b.putBoolean("key_is_capture_video", bVar2.f288182c);
                    Bundle bundle = CaptureDataManager.f272890c.f272892b;
                    ArrayList<String> arrayList = bVar2.f288190k;
                    bundle.putBoolean("key_is_photo_video", !(arrayList == null || arrayList.isEmpty()));
                    ArrayList<String> arrayList2 = bVar2.f288190k;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        z = false;
                    }
                    if (!z) {
                        CaptureDataManager.f272890c.f272892b.putStringArrayList("key_src_list", bVar2.f288190k);
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(bVar2.f288180a);
                        CaptureDataManager.f272890c.f272892b.putStringArrayList("key_src_list", arrayList3);
                    }
                }
                fVar.mo141378l(str);
                fVar.mo141379m(0);
                C99431f1 f1Var4 = this.f291560d;
                Boolean valueOf = Boolean.valueOf(booleanValue);
                C97882i iVar = this.f291561e;
                f1Var4.mo138872g(new CaptureDataManager.CaptureVideoNormalModel(valueOf, str, str2, Long.valueOf((long) (iVar.f287147g - iVar.f287146f)), Boolean.FALSE, dVar.mo162676j()));
            }
        } else if (this.f291560d.f291539q >= 1 || !MultiProcessMMKV.getSingleDefault().getBoolean("mediacodec_create_error", false)) {
            C101891f.f300035a.mo141379m(1002);
            Context context3 = this.f291560d.f291529d;
            C87412m.m108592e(context3, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context3).setResult(1002);
            Context context4 = this.f291560d.f291529d;
            C87412m.m108592e(context4, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context4).finish();
        } else {
            this.f291560d.f291539q++;
            C115669n.INSTANCE.idkeyStat(985, 146, 1, false);
            Log.m105924i("MicroMsg.RemuxPlugin", "markReserveEncoder");
            C99431f1 f1Var5 = this.f291560d;
            this.f291560d.mo138875j(f1Var5.mo138871f(this.f291561e, f1Var5.f291535j), this.f291561e, this.f291562f);
        }
        return C13598b0.f38549a;
    }
}
