package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.content.Intent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoicePrintNoiseDetectResultEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import k33.C117375l;
import k33.C117380p;
import k33.C33823m;
import k33.C60966g;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoiceCreateUI */
public class VoiceCreateUI extends BaseVoicePrintUI implements C117375l.C117376a {

    /* renamed from: E */
    public static final /* synthetic */ int f347516E = 0;

    /* renamed from: A */
    public Button f347517A = null;

    /* renamed from: B */
    public int f347518B = 1;

    /* renamed from: C */
    public int f347519C = 0;

    /* renamed from: D */
    public IListener f347520D = new IListener<VoicePrintNoiseDetectResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 438744715;
        }

        public boolean callback(IEvent iEvent) {
            VoicePrintNoiseDetectResultEvent voicePrintNoiseDetectResultEvent = (VoicePrintNoiseDetectResultEvent) iEvent;
            Log.m105919d("MicroMsg.VoiceCreateUI", "detect finish, noise:%b", Boolean.valueOf(voicePrintNoiseDetectResultEvent.f343640d.f343641a));
            if (voicePrintNoiseDetectResultEvent.f343640d.f343641a) {
                VoiceCreateUI voiceCreateUI = VoiceCreateUI.this;
                int i = VoiceCreateUI.f347516E;
                voiceCreateUI.getClass();
                C115669n.INSTANCE.mo160131h(11390, 4);
                NoiseDetectMaskView noiseDetectMaskView = voiceCreateUI.f347524z;
                ProgressBar progressBar = noiseDetectMaskView.f347510d;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                noiseDetectMaskView.f347512f.setText(C0966R.string.kdi);
                noiseDetectMaskView.f347513g.setVisibility(0);
            } else {
                VoiceCreateUI voiceCreateUI2 = VoiceCreateUI.this;
                View view = voiceCreateUI2.f347523y;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = voiceCreateUI2.f347488f;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "resumeToCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                NoiseDetectMaskView noiseDetectMaskView2 = voiceCreateUI2.f347524z;
                C115838c cVar = new C115838c(voiceCreateUI2);
                TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, -1.0f, 1, 0.0f, 1, 0.0f);
                translateAnimation.setDuration(200);
                translateAnimation.setFillAfter(true);
                translateAnimation.setRepeatCount(0);
                translateAnimation.setAnimationListener(new C115849u(cVar));
                noiseDetectMaskView2.startAnimation(translateAnimation);
            }
            return false;
        }
    };

    /* renamed from: w */
    public C117375l f347521w;

    /* renamed from: x */
    public C117380p f347522x = null;

    /* renamed from: y */
    public View f347523y;

    /* renamed from: z */
    public NoiseDetectMaskView f347524z;

    /* renamed from: J7 */
    public void mo176324J7() {
        this.f347521w = new C117375l(this);
        View findViewById = findViewById(C0966R.C0970id.itd);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "initCustomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f347490h.setTitleText((int) C0966R.string.kdj);
        this.f347490h.f347555f.setVisibility(8);
        this.f347487e.setEnabled(false);
        this.f347522x = new C117380p();
        this.f347523y = findViewById(C0966R.C0970id.la4);
        this.f347524z = (NoiseDetectMaskView) findViewById(C0966R.C0970id.gol);
        Button button = (Button) findViewById(C0966R.C0970id.itd);
        this.f347517A = button;
        button.setVisibility(8);
        this.f347517A.setOnClickListener(new VoiceCreateUI$$b(this));
        this.f347524z.setOnClickRetryCallback(new VoiceCreateUI$$c(this));
        setBackBtn(new VoiceCreateUI$$a(this), C0966R.raw.actionbar_icon_dark_close);
        this.f347520D.alive();
        mo176337Q7();
    }

    /* renamed from: K7 */
    public void mo176325K7() {
        Log.m105919d("MicroMsg.VoiceCreateUI", "sendVoice, filename:%s", this.f347493n);
        if (!Util.isNullOrNil(this.f347493n)) {
            this.f347487e.setEnabled(false);
            mo176326L7();
            int i = this.f347518B;
            if (i == 1) {
                C117375l lVar = this.f347521w;
                C60966g gVar = new C60966g(this.f347493n, 71, lVar.f351401f, 0);
                gVar.f173639h = true;
                C97625j3.m125815e().mo123460f(gVar);
                lVar.f351399d = 71;
            } else if (i == 2) {
                C117375l lVar2 = this.f347521w;
                C60966g gVar2 = new C60966g(this.f347493n, 72, lVar2.f351401f, lVar2.f351402g);
                gVar2.f173639h = true;
                C97625j3.m125815e().mo123460f(gVar2);
                lVar2.f351399d = 72;
            }
        }
    }

    /* renamed from: N7 */
    public void mo176334N7(boolean z, int i) {
        Class<VoicePrintCreateFinishUI> cls = VoicePrintCreateFinishUI.class;
        Log.m105919d("MicroMsg.VoiceCreateUI", "onCreate, result:%b, step:%d", Boolean.valueOf(z), Integer.valueOf(i));
        if (z) {
            if (i == 71) {
                Log.m105918d("MicroMsg.VoiceCreateUI", "finish create step 1");
                this.f347487e.setEnabled(false);
                this.f347518B = 2;
                mo176323I7();
                C115843s.m162942b(this.f347490h, this, new C115839d(this));
            } else if (i == 72) {
                this.f347519C = 0;
                Log.m105918d("MicroMsg.VoiceCreateUI", "finish create step 2");
                Intent intent = new Intent();
                intent.putExtra("KIsCreateSuccess", true);
                setResult(-1, intent);
                Intent intent2 = new Intent();
                intent2.setClass(this, cls);
                intent2.putExtra("kscene_type", 72);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "finishCreateSecondStep", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "finishCreateSecondStep", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
            }
        } else if (i == 72) {
            mo176336P7();
            int i2 = this.f347519C + 1;
            this.f347519C = i2;
            if (i2 >= 2) {
                Log.m105918d("MicroMsg.VoiceCreateUI", "in second step, verify two times failed");
                this.f347519C = 0;
                Intent intent3 = new Intent(this, cls);
                intent3.putExtra("kscene_type", 75);
                startActivityForResult(intent3, 1);
                overridePendingTransition(C0966R.C0968anim.f2503er, C0966R.C0968anim.f2498em);
                finish();
                return;
            }
            this.f347487e.setEnabled(true);
            mo176322H7();
            this.f347490h.setErr((int) C0966R.string.kdl);
            this.f347490h.mo176351c();
        }
    }

    /* renamed from: O7 */
    public void mo176335O7(String str) {
        Log.m105918d("MicroMsg.VoiceCreateUI", "onGetSecondText");
        this.f347494o = str;
        mo176322H7();
        this.f347490h.mo176352d();
        this.f347490h.setTipText(str);
        this.f347487e.setEnabled(true);
    }

    /* renamed from: P7 */
    public final void mo176336P7() {
        Intent intent = new Intent();
        intent.putExtra("KIsCreateSuccess", false);
        setResult(-1, intent);
    }

    /* renamed from: Q7 */
    public final void mo176337Q7() {
        Log.m105918d("MicroMsg.VoiceCreateUI", "start create");
        this.f347522x.mo182070a();
        NoiseDetectMaskView noiseDetectMaskView = this.f347524z;
        ProgressBar progressBar = noiseDetectMaskView.f347510d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        noiseDetectMaskView.f347512f.setText(C0966R.string.kdc);
        noiseDetectMaskView.f347513g.setVisibility(8);
        Log.m105918d("MicroMsg.VoiceCreateUI", "start noise detect");
        View view = this.f347523y;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(4);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view3 = this.f347488f;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(4);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/voiceprint/ui/VoiceCreateUI", "startNoiseDetect", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f347524z.setVisibility(0);
        C117380p pVar = this.f347522x;
        pVar.getClass();
        Log.m105918d("MicroMsg.VoicePrintNoiseDetector", "start detect noise");
        pVar.mo182070a();
        if (!pVar.f351411a.startRecord(C33823m.m40152a("voice_pt_voice_print_noise_detect.rec", true))) {
            pVar.f351411a.stopRecord();
            pVar.mo182070a();
            Log.m105918d("MicroMsg.VoicePrintNoiseDetector", "start record fail");
        } else {
            Log.m105918d("MicroMsg.VoicePrintNoiseDetector", "start record");
        }
        pVar.f351412b.startTimer(100);
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo176336P7();
    }

    public void onDestroy() {
        super.onDestroy();
        C117375l lVar = this.f347521w;
        lVar.getClass();
        C97625j3.m125815e().mo123470p(611, lVar);
        C97625j3.m125815e().mo123470p(612, lVar);
        lVar.f351403h = null;
        this.f347520D.dead();
    }
}
