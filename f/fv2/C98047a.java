package fv2;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.recordvideo.background.VideoMixer;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.sns.p106ui.NewSightWidget;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;
import hi2.C98453h;
import hi2.C98461l;
import qo3.C89779i0;
import te3.C101773e70;
import zg2.C103020m;
import zg2.C103021n;
import zg2.C53784a;
import zg2.C53789d;
import zt3.C119157j;

/* renamed from: fv2.a */
public class C98047a implements C53789d {

    /* renamed from: a */
    public MMActivity f287467a;

    /* renamed from: b */
    public C101773e70 f287468b;

    /* renamed from: c */
    public VideoMixer.MixConfig f287469c;

    /* renamed from: d */
    public String f287470d;

    /* renamed from: e */
    public C98048a f287471e;

    /* renamed from: f */
    public boolean f287472f = true;

    /* renamed from: fv2.a$a */
    public interface C98048a {
    }

    public C98047a(MMActivity mMActivity, C98048a aVar) {
        Log.m105924i("MicroMsg.SnsFakeVLogHelper", "SnsFakeVLogHelper");
        this.f287467a = mMActivity;
        this.f287471e = aVar;
    }

    /* renamed from: a */
    public void mo74358a(String str) {
        SnsMethodCalculate.markStartTimeMs("onInit", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        Log.m105925i("MicroMsg.SnsFakeVLogHelper", "onInit, taskId:%s", str);
        String str2 = C103020m.f303985a.mo142735c(str).mo74365p0().f298299o;
        C103021n.f303991a.mo142741b();
        this.f287470d = str;
        SnsMethodCalculate.markEndTimeMs("onInit", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }

    /* renamed from: b */
    public void mo74359b(String str) {
        SnsMethodCalculate.markStartTimeMs("onWait", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        Log.m105925i("MicroMsg.SnsFakeVLogHelper", "onWait, taskId:%s", str);
        SnsMethodCalculate.markEndTimeMs("onWait", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }

    /* renamed from: c */
    public void mo74360c(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("onRun", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        Log.m105925i("MicroMsg.SnsFakeVLogHelper", "onRun, taskId:%s", str);
        SnsMethodCalculate.markEndTimeMs("onRun", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
    }

    /* renamed from: d */
    public void mo74361d(String str, boolean z, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel) {
        String str2;
        String str3;
        String str4;
        String str5 = str;
        CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel2 = captureVideoNormalModel;
        SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper");
        Log.m105925i("MicroMsg.SnsFakeVLogHelper", "onFinish,success:%b taskId:%s", Boolean.valueOf(z), str5);
        if (str5 == null || !str5.equals(this.f287470d)) {
            str2 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
        } else {
            this.f287472f = true;
            C53784a.f150949a.mo74353c(7, this);
            C98453h hVar = C98453h.f288774a;
            if (captureVideoNormalModel2 != null && captureVideoNormalModel2.f272893d.booleanValue() && C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true)) {
                ((C119157j) C119157j.f356862d).mo183876g(new C98461l(captureVideoNormalModel2), "mux_save_work");
            }
            NewSightWidget newSightWidget = (NewSightWidget) this.f287471e;
            newSightWidget.getClass();
            SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.NewSightWidget");
            newSightWidget.f277049h = captureVideoNormalModel2.f272894e;
            newSightWidget.f277047g = captureVideoNormalModel2.f272895f;
            newSightWidget.f277039c.getIntent().putExtra("KSightThumbPath", newSightWidget.f277047g);
            newSightWidget.f277039c.getIntent().putExtra("KSightPath", newSightWidget.f277049h);
            newSightWidget.f277051i = C86013q1.m106456q(captureVideoNormalModel2.f272894e);
            C89779i0 i0Var = newSightWidget.f277018H;
            if (i0Var == null || !i0Var.isShowing()) {
                str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                str4 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
            } else {
                newSightWidget.f277018H.dismiss();
                str4 = "com.tencent.mm.plugin.sns.ui.vlog.SnsFakeVLogHelper";
                str3 = "com.tencent.mm.plugin.sns.ui.NewSightWidget";
                newSightWidget.mo132127e(newSightWidget.f277035Y, newSightWidget.f277036Z, newSightWidget.f277037a0, newSightWidget.f277038b0, newSightWidget.f277040c0, newSightWidget.f277042d0, newSightWidget.f277044e0, newSightWidget.f277046f0, newSightWidget.f277048g0, newSightWidget.f277050h0, newSightWidget.f277052i0, newSightWidget.f277054j0, newSightWidget.f277056k0, newSightWidget.f277058l0);
            }
            SnsMethodCalculate.markEndTimeMs("onFinish", str3);
            str2 = str4;
        }
        SnsMethodCalculate.markEndTimeMs("onFinish", str2);
    }
}
