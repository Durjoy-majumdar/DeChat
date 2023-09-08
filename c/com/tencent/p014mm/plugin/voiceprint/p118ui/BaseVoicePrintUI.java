package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.vfs.C86009m1;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k33.C117381q;
import k33.C33823m;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI */
public abstract class BaseVoicePrintUI extends MMActivity {

    /* renamed from: v */
    public static final /* synthetic */ int f347485v = 0;

    /* renamed from: d */
    public Button f347486d;

    /* renamed from: e */
    public View f347487e;

    /* renamed from: f */
    public View f347488f;

    /* renamed from: g */
    public VoicePrintVolumeMeter f347489g;

    /* renamed from: h */
    public VoiceTipInfoView f347490h;

    /* renamed from: i */
    public C117381q f347491i = null;

    /* renamed from: j */
    public boolean f347492j = false;

    /* renamed from: n */
    public String f347493n = null;

    /* renamed from: o */
    public String f347494o = null;

    /* renamed from: p */
    public View f347495p;

    /* renamed from: q */
    public View f347496q;

    /* renamed from: r */
    public final C117381q.C117383b f347497r = new BaseVoicePrintUI$$b(this);

    /* renamed from: s */
    public final MTimerHandler f347498s = new MTimerHandler(new BaseVoicePrintUI$$c(this), true);

    /* renamed from: t */
    public MTimerHandler f347499t = new MTimerHandler(new BaseVoicePrintUI$$d(this), true);

    /* renamed from: u */
    public MMHandler f347500u = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) new BaseVoicePrintUI$$e(this));

    /* renamed from: H7 */
    public void mo176322H7() {
        Log.m105924i("MicroMsg.BaseVoicePrintUI", "hideLoadingProgress: ");
        View view = this.f347496q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f347486d.setVisibility(0);
    }

    /* renamed from: I7 */
    public void mo176323I7() {
        View view = this.f347495p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideRecorderBtnTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideRecorderBtnTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: J7 */
    public abstract void mo176324J7();

    /* renamed from: K7 */
    public abstract void mo176325K7();

    /* renamed from: L7 */
    public void mo176326L7() {
        Log.m105924i("MicroMsg.BaseVoicePrintUI", "showLoadingProgress: ");
        View view = this.f347496q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "showLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "showLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f347486d.setVisibility(8);
    }

    /* renamed from: M7 */
    public void mo176327M7() {
        View view = this.f347495p;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "startRecoderBtnPressCheck", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "startRecoderBtnPressCheck", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void finish() {
        super.finish();
        if (getIntent().hasExtra("trans_out_anim")) {
            overridePendingTransition(C0966R.C0968anim.f2333y, getIntent().getIntExtra("trans_out_anim", 0));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cxb;
    }

    public final void init() {
        this.f347490h = (VoiceTipInfoView) findViewById(C0966R.C0970id.kmk);
        this.f347486d = (Button) findViewById(C0966R.C0970id.igm);
        this.f347487e = findViewById(C0966R.C0970id.nyc);
        this.f347495p = findViewById(C0966R.C0970id.nxx);
        this.f347496q = findViewById(C0966R.C0970id.nyd);
        this.f347488f = findViewById(C0966R.C0970id.ldw);
        this.f347489g = (VoicePrintVolumeMeter) findViewById(C0966R.C0970id.ldx);
        this.f347490h.mo176349a();
        this.f347489g.setArchView(this.f347486d);
        C117381q qVar = new C117381q();
        this.f347491i = qVar;
        qVar.f351423h = this.f347497r;
        this.f347486d.setOnTouchListener(new BaseVoicePrintUI$$f(this));
        setBackBtn(new BaseVoicePrintUI$$a(this), C0966R.raw.actionbar_icon_dark_close);
        mo176324J7();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        init();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f347489g.f347545i.stopTimer();
        Log.m105918d("MicroMsg.VoicePrintVolumeMeter", "destroy, quit factor thread");
        C117381q qVar = this.f347491i;
        if (qVar != null) {
            qVar.f351423h = null;
        }
        Log.m105918d("MicroMsg.VoicePrintLogic", "delete voiceprint voice file");
        C86009m1 m1Var = new C86009m1(C33823m.m40152a("voice_pt_voice_print_record.rec", false));
        if (m1Var.mo119967g()) {
            m1Var.mo119966f();
        }
        C86009m1 m1Var2 = new C86009m1(C33823m.m40152a("voice_pt_voice_print_noise_detect.rec", false));
        if (m1Var2.mo119967g()) {
            m1Var2.mo119966f();
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.BaseVoicePrintUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
        } else if (i == 80 && iArr[0] != 0) {
            ((BaseVoicePrintUI$$b) this.f347497r).mo176329a();
        }
    }
}
