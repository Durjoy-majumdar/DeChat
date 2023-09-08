package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.VoiceInputResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.p014mm.plugin.report.kvdata.log_13905;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputFooter;
import com.tencent.p014mm.pluginsdk.p133ui.chat.VoiceInputPanel;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C88989a;
import vd3.C22745f0;
import vd3.C22749l0;
import vd3.C22750m0;
import vd3.C78396g0;
import vd3.n0$$a;
import zt3.C119157j;
import zt3.C119179t;

@C88989a(3)
/* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputUI */
public class VoiceInputUI extends MMActivity implements C7020t0 {

    /* renamed from: w */
    public static final /* synthetic */ int f55045w = 0;

    /* renamed from: d */
    public MMEditText f55046d;

    /* renamed from: e */
    public Button f55047e;

    /* renamed from: f */
    public VoiceInputFooter f55048f;

    /* renamed from: g */
    public int f55049g;

    /* renamed from: h */
    public String f55050h;

    /* renamed from: i */
    public String f55051i;

    /* renamed from: j */
    public String f55052j;

    /* renamed from: n */
    public long f55053n = 0;

    /* renamed from: o */
    public int f55054o = 0;

    /* renamed from: p */
    public boolean f55055p = true;

    /* renamed from: q */
    public boolean f55056q = false;

    /* renamed from: r */
    public KeyboardHeightProvider f55057r;

    /* renamed from: s */
    public View.OnTouchListener f55058s = new C19481b();

    /* renamed from: t */
    public VoiceInputFooter.C19468a f55059t = new C19482c();

    /* renamed from: u */
    public boolean f55060u = false;

    /* renamed from: v */
    public boolean f55061v = false;

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputUI$a */
    public class C19480a implements MenuItem.OnMenuItemClickListener {
        public C19480a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            VoiceInputUI.this.mo25268H7(1);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputUI$b */
    public class C19481b implements View.OnTouchListener {
        public C19481b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/VoiceInputUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            boolean z = true;
            if (motionEvent.getAction() == 0) {
                VoiceInputUI.this.f55054o++;
            } else if (motionEvent.getAction() == 1) {
                if (VoiceInputUI.this.f55048f.f55009p.getVisibility() == 0) {
                    VoiceInputFooter voiceInputFooter = VoiceInputUI.this.f55048f;
                    voiceInputFooter.mo25233i();
                    voiceInputFooter.setVisibility(8);
                }
                if (VoiceInputUI.this.f55048f.f55008o.getVisibility() != 0) {
                    z = false;
                }
                if (z) {
                    VoiceInputFooter voiceInputFooter2 = VoiceInputUI.this.f55048f;
                    voiceInputFooter2.mo25231e();
                    voiceInputFooter2.setVisibility(8);
                }
                VoiceInputFooter voiceInputFooter3 = VoiceInputUI.this.f55048f;
                voiceInputFooter3.setVisibility(0);
                ImageButton imageButton = voiceInputFooter3.f55011r;
                if (imageButton != null) {
                    imageButton.setImageResource(C0966R.C0969drawable.f4802nb);
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/pluginsdk/ui/VoiceInputUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputUI$c */
    public class C19482c implements VoiceInputFooter.C19468a {
        public C19482c() {
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputUI$d */
    public class C19483d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: com.tencent.mm.pluginsdk.ui.VoiceInputUI$d$a */
        public class C19484a implements Runnable {
            public C19484a() {
            }

            public void run() {
                VoiceInputUI.this.f55046d.requestFocus();
                C119179t tVar = C119157j.f356862d;
                n0$$a n0__a = new n0$$a(this);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(n0__a, 200, false);
            }
        }

        public C19483d() {
        }

        public void onGlobalLayout() {
            VoiceInputUI.this.f55046d.post(new C19484a());
            VoiceInputUI.this.f55046d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: H7 */
    public void mo25268H7(int i) {
        Log.m105925i("VoiceInputUI", "alvinluo voiceinputui finish type: %d, call stack: %s", Integer.valueOf(i), Util.getStack().toString());
        this.f55060u = true;
        if (i == 8) {
            mo25270J7(7);
        } else {
            mo25270J7(i);
        }
        VoiceInputResultEvent voiceInputResultEvent = new VoiceInputResultEvent();
        if (i == 7) {
            voiceInputResultEvent.f48133d.f48134a = 1;
        } else if (i == 8) {
            voiceInputResultEvent.f48133d.f48134a = 4;
        } else {
            voiceInputResultEvent.f48133d.f48134a = 2;
        }
        if (this.f55056q) {
            voiceInputResultEvent.f48133d.f48135b = 1;
        } else {
            voiceInputResultEvent.f48133d.f48135b = 2;
        }
        voiceInputResultEvent.f48133d.f48136c = this.f55046d.getText().toString();
        voiceInputResultEvent.f48133d.f48137d = this.f55052j;
        VoiceInputFooter voiceInputFooter = this.f55048f;
        if (voiceInputFooter != null) {
            ChatFooterPanel chatFooterPanel = voiceInputFooter.f55008o;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100200l();
                voiceInputFooter.f55008o.mo100189b();
            }
            VoiceInputPanel voiceInputPanel = voiceInputFooter.f55009p;
            if (voiceInputPanel != null) {
                voiceInputPanel.mo25276f();
            }
        }
        voiceInputResultEvent.publish();
        Util.hideVKB(this.f55046d);
        if (this.f55061v) {
            super.finish();
        }
    }

    /* renamed from: I7 */
    public final void mo25269I7(VoiceInputBehavior voiceInputBehavior) {
        Log.m105925i("VoiceInputUI", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", Integer.valueOf(voiceInputBehavior.cancel), Integer.valueOf(voiceInputBehavior.send), Integer.valueOf(voiceInputBehavior.click), Integer.valueOf(voiceInputBehavior.longClick), Long.valueOf(voiceInputBehavior.longClickTime), Integer.valueOf(voiceInputBehavior.textClick), Integer.valueOf(voiceInputBehavior.textChangeCount), Long.valueOf(voiceInputBehavior.textChangeTime), Integer.valueOf(voiceInputBehavior.textChangeReturn), Long.valueOf(voiceInputBehavior.voiceInputTime), Integer.valueOf(voiceInputBehavior.fail), Integer.valueOf(voiceInputBehavior.clear), Integer.valueOf(voiceInputBehavior.smileIconClick), Integer.valueOf(voiceInputBehavior.voiceIconClick), Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime));
        log_13905 log_13905 = new log_13905();
        log_13905.viOp_ = voiceInputBehavior;
        C115669n.INSTANCE.mo175916z(13905, log_13905, false, false);
    }

    /* renamed from: J7 */
    public final void mo25270J7(int i) {
        VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
        voiceInputBehavior.textChangeCount = this.f55054o;
        voiceInputBehavior.textChangeReturn = i;
        long j = this.f55053n;
        if (j != 0) {
            voiceInputBehavior.textChangeTime = Util.ticksToNow(j);
            this.f55053n = 0;
        }
        mo25269I7(voiceInputBehavior);
    }

    /* renamed from: Q1 */
    public void mo531Q1(int i, boolean z) {
        if (i <= 0) {
            this.f55061v = true;
            if (this.f55060u) {
                super.finish();
            }
        } else {
            this.f55061v = false;
        }
        float f = (float) (-i);
        this.f55048f.setTranslationY(f);
        this.f55047e.setTranslationY(f);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ccj;
    }

    public final void init() {
        this.f55053n = Util.currentTicks();
        this.f55054o = 0;
        this.f55056q = false;
        this.f55055p = true;
        this.f55046d = (MMEditText) findViewById(C0966R.C0970id.lad);
        this.f55047e = (Button) findViewById(C0966R.C0970id.lac);
        this.f55046d.addTextChangedListener(new C22749l0(this));
        this.f55047e.setOnClickListener(new C22750m0(this));
        setMMTitle(getString(C0966R.string.kcw));
        enableOptionMenu(true);
        setBackBtn(new C19480a());
        this.f55046d.setOnTouchListener(this.f55058s);
        this.f55046d.mo98046o(this.f55050h);
        int i = this.f55049g;
        if (i != -1) {
            this.f55046d.setSelection(i);
        }
        VoiceInputFooter voiceInputFooter = (VoiceInputFooter) findViewById(C0966R.C0970id.j0v);
        this.f55048f = voiceInputFooter;
        MMEditText mMEditText = this.f55046d;
        String str = this.f55051i;
        String str2 = this.f55052j;
        voiceInputFooter.f55010q = mMEditText;
        mMEditText.setOnClickListener(new C22745f0(voiceInputFooter));
        mMEditText.setOnEditorActionListener(new C78396g0(voiceInputFooter));
        if (voiceInputFooter.f55009p == null) {
            VoiceInputPanel voiceInputPanel = new VoiceInputPanel(voiceInputFooter.getContext(), true, voiceInputFooter.f55010q);
            voiceInputFooter.f55009p = voiceInputPanel;
            voiceInputPanel.setCallback(new C19494d(voiceInputFooter));
            voiceInputFooter.f55009p.setPortHeightPX(KeyBoardUtil.getValidPanelHeight(voiceInputFooter.getContext()));
        }
        voiceInputFooter.f55009p.mo25278h();
        VoiceInputPanel voiceInputPanel2 = voiceInputFooter.f55009p;
        Log.m105919d("MicroMsg.VoiceInputPanel", "refreshHeight DISPLAY_HEIGHT_PORT_IN_PX %s,needRefreshProtHeight %s", Integer.valueOf(voiceInputPanel2.f55099p0), Boolean.valueOf(voiceInputPanel2.f55108x0));
        if (voiceInputPanel2.f55108x0) {
            voiceInputPanel2.f55108x0 = false;
            View findViewById = voiceInputPanel2.findViewById(C0966R.C0970id.laj);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i2 = voiceInputPanel2.f55099p0;
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-1, i2);
            }
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
            voiceInputPanel2.mo25283m();
            voiceInputPanel2.requestLayout();
        }
        voiceInputFooter.f55009p.setVisibility(8);
        voiceInputFooter.f55009p.setToUser(str2);
        voiceInputFooter.f55009p.setFullScreenData(str);
        voiceInputFooter.f55013t.addView(voiceInputFooter.f55009p, -1, 0);
        ViewGroup.LayoutParams layoutParams2 = voiceInputFooter.f55009p.getLayoutParams();
        layoutParams2.height = KeyBoardUtil.getValidPanelHeight(voiceInputFooter.getContext());
        voiceInputFooter.f55009p.setLayoutParams(layoutParams2);
        this.f55048f.setVoiceInputFooterListener(this.f55059t);
        KeyboardHeightProvider keyboardHeightProvider = new KeyboardHeightProvider(this);
        this.f55057r = keyboardHeightProvider;
        keyboardHeightProvider.f220015b = this;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        Intent intent = getIntent();
        if (intent != null) {
            this.f55050h = intent.getStringExtra(MimeTypes.BASE_TYPE_TEXT);
            this.f55049g = intent.getIntExtra("offset", -1);
            this.f55051i = intent.getStringExtra("punctuation");
            this.f55052j = intent.getStringExtra("userCode");
        }
        getWindow().setSoftInputMode(32);
        init();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            mo25268H7(2);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.f55057r.mo104021d();
    }

    public void onResume() {
        super.onResume();
        this.f55046d.requestFocus();
        this.f55046d.getViewTreeObserver().addOnGlobalLayoutListener(new C19483d());
        this.f55057r.mo104022e();
    }

    public void onSwipeBack() {
        mo25268H7(3);
        super.onSwipeBack();
    }

    public void onWindowFocusChanged(boolean z) {
        if (z) {
            this.f55057r.mo104022e();
        } else {
            this.f55057r.mo104021d();
        }
    }
}
