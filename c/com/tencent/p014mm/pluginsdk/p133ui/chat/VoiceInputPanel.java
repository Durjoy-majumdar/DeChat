package com.tencent.p014mm.pluginsdk.p133ui.chat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.VoiceInputResultEvent;
import com.tencent.p014mm.autogen.events.VoiceInputStartEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.StreamVoiceInputStruct;
import com.tencent.p014mm.model.newabtest.SubCoreNewABTest;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.p014mm.plugin.report.kvdata.log_13905;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputLayout;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputLayoutImpl;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputScrollView;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputUI;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C96980c;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C7335d;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import ou0.C110066a;
import ou0.C110071c;
import p141db.C86219d;
import p910lj.C76701a;
import pd0.C35455b;
import pd0.C35457d;
import pu0.C110248b;
import qo3.C77398g;
import vd3.C102172j0;

/* renamed from: com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel */
public class VoiceInputPanel extends LinearLayout {

    /* renamed from: A */
    public boolean f55067A = false;

    /* renamed from: B */
    public boolean f55068B = false;

    /* renamed from: C */
    public long f55069C = 0;

    /* renamed from: D */
    public long f55070D = 0;

    /* renamed from: E */
    public long f55071E = 0;

    /* renamed from: F */
    public boolean f55072F = false;

    /* renamed from: G */
    public boolean f55073G = false;

    /* renamed from: H */
    public boolean f55074H = false;

    /* renamed from: I */
    public String f55075I = "";

    /* renamed from: J */
    public Toast f55076J;

    /* renamed from: K */
    public List<String> f55077K = new ArrayList();

    /* renamed from: L */
    public C102172j0 f55078L;

    /* renamed from: M */
    public IListener<VoiceInputResultEvent> f55079M;

    /* renamed from: N */
    public TelephonyManager f55080N;

    /* renamed from: P */
    public C35457d f55081P;

    /* renamed from: Q */
    public String f55082Q = "";

    /* renamed from: R */
    public int f55083R = 0;

    /* renamed from: S */
    public ArrayList<String> f55084S = new ArrayList<>();

    /* renamed from: T */
    public ArrayList<Integer> f55085T = new ArrayList<>();

    /* renamed from: U */
    public VoiceInputLayout.C19472d f55086U = new C19486a();

    /* renamed from: V */
    public C19489d f55087V;

    /* renamed from: W */
    public VoiceInputLayout.C19473e f55088W = new C19487b();

    /* renamed from: d */
    public VoiceInputLayout f55089d;

    /* renamed from: e */
    public ImageButton f55090e;

    /* renamed from: f */
    public Button f55091f;

    /* renamed from: g */
    public Button f55092g;

    /* renamed from: h */
    public TextView f55093h;

    /* renamed from: i */
    public C19488c f55094i;

    /* renamed from: j */
    public MMEditText f55095j;

    /* renamed from: n */
    public MMEditText f55096n = null;

    /* renamed from: o */
    public VoiceInputScrollView f55097o;

    /* renamed from: p */
    public C77398g f55098p;

    /* renamed from: p0 */
    public int f55099p0 = C76577a.m92151b(getContext(), C86219d.CTRL_INDEX);

    /* renamed from: q */
    public TextView f55100q;

    /* renamed from: r */
    public Context f55101r;

    /* renamed from: s */
    public long f55102s = 0;

    /* renamed from: t */
    public boolean f55103t = false;

    /* renamed from: u */
    public float f55104u = 0.0f;

    /* renamed from: v */
    public boolean f55105v = false;

    /* renamed from: w */
    public boolean f55106w = false;

    /* renamed from: x */
    public boolean f55107x = false;

    /* renamed from: x0 */
    public boolean f55108x0 = true;

    /* renamed from: y */
    public boolean f55109y = false;

    /* renamed from: z */
    public int f55110z = 300;

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel$a */
    public class C19486a implements VoiceInputLayout.C19472d {
        public C19486a() {
        }

        /* renamed from: a */
        public void mo25250a(boolean z) {
            VoiceInputPanel.m20864a(VoiceInputPanel.this, C0966R.string.kcu);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel$b */
    public class C19487b implements VoiceInputLayout.C19473e {
        public C19487b() {
        }

        /* renamed from: a */
        public void mo25251a() {
            VoiceInputPanel.this.f55094i.mo25292c(false);
            VoiceInputPanel.this.f55095j.setHint((CharSequence) null);
            VoiceInputPanel voiceInputPanel = VoiceInputPanel.this;
            voiceInputPanel.f55093h.setVisibility((voiceInputPanel.f55085T.size() < 2 || VoiceInputPanel.this.f55095j.getText().length() > 0) ? 8 : 0);
            VoiceInputStartEvent voiceInputStartEvent = new VoiceInputStartEvent();
            voiceInputStartEvent.f194002d.f194003a = false;
            voiceInputStartEvent.publish();
        }

        /* renamed from: b */
        public void mo25252b() {
            Class cls = C110248b.class;
            VoiceInputPanel.this.f55069C = System.currentTimeMillis();
            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", Long.valueOf(VoiceInputPanel.this.f55069C));
            Log.m105919d("VOICEDEBUG", "Start Record Time = %s", Long.valueOf(VoiceInputPanel.this.f55069C));
            VoiceInputPanel voiceInputPanel = VoiceInputPanel.this;
            voiceInputPanel.f55067A = false;
            voiceInputPanel.f55068B = true;
            voiceInputPanel.f55074H = true;
            voiceInputPanel.f55070D = 0;
            voiceInputPanel.f55071E = 0;
            voiceInputPanel.mo25283m();
            VoiceInputPanel.this.f55100q.setVisibility(8);
            VoiceInputPanel voiceInputPanel2 = VoiceInputPanel.this;
            voiceInputPanel2.f55068B = false;
            C102172j0 j0Var = voiceInputPanel2.f55078L;
            j0Var.f300857i = 3;
            j0Var.mo141713c(voiceInputPanel2.f55095j);
            VoiceInputPanel.this.getClass();
            Log.m105924i("MicroMsg.VoiceInputPanel", "pauseMusic");
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
            C110066a aVar = ((C110248b) c).f329779e;
            if (aVar == null) {
                aVar = new C110071c();
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
                ((C110248b) c2).f329781g[0] = "music";
            }
            aVar.f329358h.setStreamMute(3, true);
            MMEditText mMEditText = VoiceInputPanel.this.f55095j;
            if (mMEditText != null) {
                if (mMEditText.getText() != null && VoiceInputPanel.this.f55095j.getText().length() > 0) {
                    VoiceInputPanel.this.f55095j.setCursorVisible(true);
                }
                VoiceInputPanel.this.f55095j.requestFocus();
                Util.hideVKB(VoiceInputPanel.this.f55089d);
            }
            Context context = VoiceInputPanel.this.f55101r;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().addFlags(128);
            }
            VoiceInputPanel.this.f55092g.setVisibility(4);
            VoiceInputPanel.this.f55090e.setVisibility(4);
            VoiceInputPanel.this.f55091f.setVisibility(8);
            VoiceInputPanel voiceInputPanel3 = VoiceInputPanel.this;
            voiceInputPanel3.f55095j.setHint(voiceInputPanel3.getResources().getString(C0966R.string.kcs));
            VoiceInputPanel.this.f55094i.mo25292c(true);
            VoiceInputPanel.this.f55093h.setVisibility(8);
            VoiceInputPanel.this.mo25281k(1);
            VoiceInputStartEvent voiceInputStartEvent = new VoiceInputStartEvent();
            voiceInputStartEvent.f194002d.f194003a = true;
            voiceInputStartEvent.publish();
        }

        /* renamed from: c */
        public void mo25253c(int i, int i2, int i3) {
            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(System.currentTimeMillis()));
            VoiceInputPanel.m20866c(VoiceInputPanel.this);
            VoiceInputPanel voiceInputPanel = VoiceInputPanel.this;
            voiceInputPanel.f55078L.mo141714d(voiceInputPanel.f55095j);
            VoiceInputPanel.this.mo25283m();
            Context context = VoiceInputPanel.this.f55101r;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(128);
            }
            VoiceInputPanel voiceInputPanel2 = VoiceInputPanel.this;
            voiceInputPanel2.getClass();
            VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
            voiceInputBehavior.fail = i;
            voiceInputPanel2.mo25279i(voiceInputBehavior);
            voiceInputPanel2.mo25277g(i);
            if (i == 12) {
                VoiceInputPanel.m20864a(VoiceInputPanel.this, C0966R.string.kct);
            } else {
                VoiceInputPanel.m20864a(VoiceInputPanel.this, C0966R.string.f7966xq);
            }
            VoiceInputPanel.this.f55094i.mo25292c(false);
            VoiceInputPanel.this.f55095j.setHint((CharSequence) null);
            VoiceInputStartEvent voiceInputStartEvent = new VoiceInputStartEvent();
            voiceInputStartEvent.f194002d.f194003a = false;
            voiceInputStartEvent.publish();
        }

        /* renamed from: d */
        public void mo25254d(String[] strArr, List<String> list) {
            if (strArr != null && strArr.length > 0 && strArr[0].length() > 0) {
                VoiceInputPanel voiceInputPanel = VoiceInputPanel.this;
                if (voiceInputPanel.f55074H) {
                    voiceInputPanel.f55074H = false;
                    MMEditText mMEditText = voiceInputPanel.f55095j;
                    if (!(mMEditText == null || mMEditText.getText() == null || voiceInputPanel.f55095j.getText().length() <= 0)) {
                        if (voiceInputPanel.f55075I.equalsIgnoreCase("。") || voiceInputPanel.f55075I.equalsIgnoreCase(".")) {
                            if (!voiceInputPanel.f55103t || voiceInputPanel.f55095j.getSelectionStart() >= voiceInputPanel.f55095j.getText().length()) {
                                voiceInputPanel.f55078L.mo141715e(voiceInputPanel.f55095j, voiceInputPanel.f55075I, true);
                                voiceInputPanel.f55078L.mo141713c(voiceInputPanel.f55095j);
                            }
                            voiceInputPanel.f55075I = "";
                        }
                        String obj = voiceInputPanel.f55095j.getText().toString();
                        Log.m105925i("MicroMsg.VoiceInputPanel", "addPunctuation msg = %s,msg.length() = %s", Util.secPrint(obj), Integer.valueOf(obj.length()));
                    }
                }
                VoiceInputPanel voiceInputPanel2 = VoiceInputPanel.this;
                voiceInputPanel2.f55078L.mo141715e(voiceInputPanel2.f55095j, strArr[0], true);
                if (VoiceInputPanel.this.f55095j.getText().length() != 0) {
                    VoiceInputPanel.this.f55095j.setCursorVisible(true);
                    VoiceInputPanel.this.f55095j.requestFocus();
                    Util.hideVKB(VoiceInputPanel.this.f55089d);
                }
                if (!VoiceInputPanel.this.f55067A && strArr[0].length() != 0) {
                    VoiceInputPanel voiceInputPanel3 = VoiceInputPanel.this;
                    voiceInputPanel3.f55067A = true;
                    voiceInputPanel3.f55070D = System.currentTimeMillis();
                    VoiceInputPanel voiceInputPanel4 = VoiceInputPanel.this;
                    Log.m105919d("VOICEDEBUG", "First Text Time = %s Corss Time = %s", Long.valueOf(System.currentTimeMillis()), Long.valueOf(voiceInputPanel4.f55070D - voiceInputPanel4.f55069C));
                }
                ((ArrayList) VoiceInputPanel.this.f55077K).addAll(list);
            }
        }

        /* renamed from: e */
        public void mo25255e() {
            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", Long.valueOf(System.currentTimeMillis()));
            VoiceInputPanel voiceInputPanel = VoiceInputPanel.this;
            voiceInputPanel.f55078L.mo141714d(voiceInputPanel.f55095j);
            VoiceInputPanel.this.mo25283m();
            Context context = VoiceInputPanel.this.f55101r;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(128);
            }
            VoiceInputPanel.this.mo25277g(3);
            VoiceInputPanel.this.f55094i.mo25292c(false);
            VoiceInputPanel.this.f55095j.setHint((CharSequence) null);
            VoiceInputStartEvent voiceInputStartEvent = new VoiceInputStartEvent();
            voiceInputStartEvent.f194002d.f194003a = false;
            voiceInputStartEvent.publish();
        }

        /* renamed from: f */
        public void mo25256f() {
            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", Long.valueOf(System.currentTimeMillis()));
            VoiceInputPanel.m20866c(VoiceInputPanel.this);
            VoiceInputPanel voiceInputPanel = VoiceInputPanel.this;
            voiceInputPanel.f55078L.mo141714d(voiceInputPanel.f55095j);
            VoiceInputPanel.this.mo25283m();
            Context context = VoiceInputPanel.this.f55101r;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(128);
            }
            VoiceInputPanel voiceInputPanel2 = VoiceInputPanel.this;
            voiceInputPanel2.getClass();
            VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
            voiceInputBehavior.fail = 1;
            voiceInputPanel2.mo25279i(voiceInputBehavior);
            voiceInputPanel2.mo25277g(1);
            VoiceInputPanel.this.f55094i.mo25292c(false);
            VoiceInputPanel.this.f55095j.setHint((CharSequence) null);
            VoiceInputStartEvent voiceInputStartEvent = new VoiceInputStartEvent();
            voiceInputStartEvent.f194002d.f194003a = false;
            voiceInputStartEvent.publish();
        }

        /* renamed from: g */
        public void mo25257g() {
            Log.m105924i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + System.currentTimeMillis());
            VoiceInputPanel.m20866c(VoiceInputPanel.this);
            VoiceInputPanel voiceInputPanel = VoiceInputPanel.this;
            voiceInputPanel.f55078L.mo141714d(voiceInputPanel.f55095j);
            VoiceInputPanel.this.mo25283m();
            Context context = VoiceInputPanel.this.f55101r;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(128);
            }
            VoiceInputPanel.this.mo25277g(2);
            VoiceInputPanel.this.f55094i.mo25292c(false);
            VoiceInputPanel.this.f55095j.setHint((CharSequence) null);
            VoiceInputPanel voiceInputPanel2 = VoiceInputPanel.this;
            voiceInputPanel2.f55093h.setVisibility((voiceInputPanel2.f55085T.size() < 2 || VoiceInputPanel.this.f55095j.getText().length() > 0) ? 8 : 0);
            VoiceInputStartEvent voiceInputStartEvent = new VoiceInputStartEvent();
            voiceInputStartEvent.f194002d.f194003a = false;
            voiceInputStartEvent.publish();
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel$c */
    public interface C19488c {
        /* renamed from: a */
        void mo25290a();

        /* renamed from: b */
        void mo25291b(String str);

        /* renamed from: c */
        void mo25292c(boolean z);
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel$d */
    public static class C19489d extends PhoneStateListener {

        /* renamed from: a */
        public VoiceInputLayout f55114a;

        public C19489d(VoiceInputLayout voiceInputLayout) {
            this.f55114a = voiceInputLayout;
        }

        public void onCallStateChanged(int i, String str) {
            int i2;
            super.onCallStateChanged(i, str);
            VoiceInputLayout voiceInputLayout = this.f55114a;
            if (voiceInputLayout != null) {
                i2 = voiceInputLayout.getCurrentState();
                this.f55114a.mo25236a();
            } else {
                i2 = -1;
            }
            Log.m105919d("MicroMsg.VoiceInputPanel", "onCallStateChanged :%s, currentState: %s", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public VoiceInputPanel(Context context, boolean z, MMEditText mMEditText) {
        super(context);
        MMEditText mMEditText2;
        this.f55101r = context;
        this.f55103t = z;
        this.f55096n = mMEditText;
        Log.m105918d("MicroMsg.VoiceInputPanel", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        View.inflate(getContext(), C0966R.C0971layout.cci, this);
        this.f55090e = (ImageButton) findViewById(C0966R.C0970id.lai);
        this.f55091f = (Button) findViewById(C0966R.C0970id.lah);
        this.f55093h = (TextView) findViewById(C0966R.C0970id.lal);
        this.f55092g = (Button) findViewById(C0966R.C0970id.lan);
        this.f55100q = (TextView) findViewById(C0966R.C0970id.k1e);
        if (this.f55103t) {
            this.f55090e.setVisibility(4);
        } else {
            this.f55090e.setVisibility(0);
        }
        this.f55092g.setVisibility(4);
        this.f55091f.setVisibility(8);
        if (!this.f55103t || (mMEditText2 = this.f55096n) == null) {
            MMEditText mMEditText3 = (MMEditText) findViewById(C0966R.C0970id.lap);
            this.f55095j = mMEditText3;
            mMEditText3.setHintTextColor(getResources().getColor(C0966R.color.a7b));
            this.f55095j.setClickable(true);
            this.f55095j.setOnClickListener(new C72874z1(this));
            this.f55095j.setOnLongClickListener(new C72766a2(this));
            this.f55095j.setOnTouchListener(new C72770b2(this));
        } else {
            this.f55095j = mMEditText2;
        }
        this.f55097o = (VoiceInputScrollView) findViewById(C0966R.C0970id.lam);
        this.f55090e.setOnClickListener(new C72775c2(this));
        this.f55092g.setOnClickListener(new C72779d2(this));
        this.f55091f.setOnClickListener(new C19490e2(this));
        this.f55093h.setOnClickListener(new C19491f2(this));
        if ((this.f55095j.getText() != null && this.f55095j.getText().length() > 0) || (this.f55095j.getHint() != null && this.f55095j.getHint().length() > 0)) {
            this.f55093h.setVisibility(8);
        }
        this.f55095j.addTextChangedListener(new C72790g2(this));
        this.f55097o.setOnTouchListener(new C72795h2(this));
        this.f55078L = new C102172j0(this.f55101r);
        long nanoTime = System.nanoTime();
        String str = "MicroMsg.VoiceInputPanel" + String.valueOf(nanoTime);
        this.f55082Q = str;
        Log.m105925i("MicroMsg.VoiceInputPanel", "mToUser %s", str);
        mo25278h();
        int b = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("VoiceInputLanguageSupportType", 1);
        if (LocaleUtil.isChineseAppLang()) {
            this.f55084S.add(getContext().getString(C0966R.string.kcp));
            this.f55085T.add(1);
            if ((b & 2) != 0) {
                this.f55084S.add(getContext().getString(C0966R.string.kco));
                this.f55085T.add(2);
            }
            if ((b & 4) != 0) {
                this.f55084S.add(getContext().getString(C0966R.string.kcq));
                this.f55085T.add(4);
            }
            if ((b & 8) != 0) {
                this.f55084S.add(getContext().getString(C0966R.string.kcr));
                this.f55085T.add(8);
            }
        } else if (LocaleUtil.getApplicationLanguage().equals("en")) {
            this.f55084S.add(getContext().getString(C0966R.string.kcq));
            this.f55085T.add(4);
            this.f55084S.add(getContext().getString(C0966R.string.kcp));
            this.f55085T.add(1);
            if ((b & 2) != 0) {
                this.f55084S.add(getContext().getString(C0966R.string.kco));
                this.f55085T.add(2);
            }
        }
        this.f55083R = 0;
        this.f55093h.setText(this.f55084S.get(0));
        this.f55089d.setLangType(this.f55085T.get(this.f55083R).intValue());
        if (this.f55085T.size() < 2) {
            this.f55093h.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static void m20864a(VoiceInputPanel voiceInputPanel, int i) {
        Toast toast = voiceInputPanel.f55076J;
        if (toast != null) {
            toast.cancel();
        }
        Context context = voiceInputPanel.f55101r;
        Toast makeText = C76701a.makeText(context, (CharSequence) context.getResources().getString(i), 0);
        voiceInputPanel.f55076J = makeText;
        makeText.setGravity(17, 0, 0);
        voiceInputPanel.f55076J.show();
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x011e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m20865b(com.tencent.p014mm.pluginsdk.p133ui.chat.VoiceInputPanel r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7.getClass()
            int r0 = r9.getAction()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0024
            com.tencent.mm.pluginsdk.ui.VoiceInputScrollView r0 = r7.f55097o
            int r0 = r0.getScrollY()
            if (r0 > 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0020
            r7.f55106w = r2
            float r9 = r9.getRawY()
            r7.f55104u = r9
        L_0x0020:
            r7.f55109y = r2
            goto L_0x011a
        L_0x0024:
            int r0 = r9.getAction()
            r3 = 2
            if (r0 != r3) goto L_0x002f
            r7.f55105v = r2
            goto L_0x011a
        L_0x002f:
            int r0 = r9.getAction()
            if (r0 != r2) goto L_0x011a
            boolean r0 = r7.f55105v
            r3 = 0
            if (r0 == 0) goto L_0x0046
            boolean r0 = r7.f55106w
            if (r0 == 0) goto L_0x0046
            float r0 = r9.getRawY()
            float r4 = r7.f55104u
            float r0 = r0 - r4
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r7.f55109y = r1
            r7.f55105v = r1
            r7.f55106w = r1
            r7.f55104u = r3
            int r3 = r7.f55110z
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0096
            com.tencent.mm.ui.widget.MMEditText r9 = r7.f55095j
            if (r9 == 0) goto L_0x0091
            android.text.Editable r9 = r9.getText()
            if (r9 == 0) goto L_0x0091
            com.tencent.mm.ui.widget.MMEditText r9 = r7.f55095j
            android.text.Editable r9 = r9.getText()
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0091
            android.content.SharedPreferences r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getDefaultPreference()
            if (r9 == 0) goto L_0x0091
            android.content.SharedPreferences$Editor r9 = r9.edit()
            com.tencent.mm.ui.widget.MMEditText r0 = r7.f55095j
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "voiceinput_downdistance_content"
            android.content.SharedPreferences$Editor r9 = r9.putString(r3, r0)
            r9.apply()
            java.lang.String r9 = "MicroMsg.VoiceInputPanel"
            java.lang.String r0 = "onDownDistance save memory content"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
        L_0x0091:
            r7.mo25275e()
            goto L_0x0115
        L_0x0096:
            boolean r0 = r7.f55107x
            if (r0 == 0) goto L_0x009e
            r7.f55107x = r1
            goto L_0x0115
        L_0x009e:
            boolean r0 = r8 instanceof com.tencent.p014mm.p136ui.widget.MMEditText
            if (r0 == 0) goto L_0x0115
            com.tencent.mm.ui.widget.MMEditText r0 = r7.f55095j
            if (r0 == 0) goto L_0x0115
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0115
            com.tencent.mm.ui.widget.MMEditText r0 = r7.f55095j
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0115
            r0 = r8
            com.tencent.mm.ui.widget.MMEditText r0 = (com.tencent.p014mm.p136ui.widget.MMEditText) r0
            android.text.Editable r3 = r0.getText()
            android.text.Spannable$Factory r4 = android.text.Spannable.Factory.getInstance()
            android.text.Spannable r3 = r4.newSpannable(r3)
            r9.getAction()
            float r4 = r9.getX()
            int r4 = (int) r4
            float r5 = r9.getY()
            int r5 = (int) r5
            int r6 = r0.getTotalPaddingLeft()
            int r4 = r4 - r6
            int r6 = r0.getTotalPaddingTop()
            int r5 = r5 - r6
            int r6 = r0.getScrollX()
            int r4 = r4 + r6
            int r6 = r0.getScrollY()
            int r5 = r5 + r6
            android.text.Layout r6 = r0.getLayout()
            int r5 = r6.getLineForVertical(r5)
            float r4 = (float) r4
            int r4 = r6.getOffsetForHorizontal(r5, r4)
            java.lang.Class<android.text.style.ClickableSpan> r5 = android.text.style.ClickableSpan.class
            java.lang.Object[] r3 = r3.getSpans(r4, r4, r5)
            android.text.style.ClickableSpan[] r3 = (android.text.style.ClickableSpan[]) r3
            int r4 = r3.length
            if (r4 == 0) goto L_0x0106
            r7 = r3[r1]
            r7.onClick(r8)
            goto L_0x0115
        L_0x0106:
            float r3 = r9.getX()
            float r9 = r9.getY()
            int r9 = r0.getOffsetForPosition(r3, r9)
            r7.mo25284n(r9)
        L_0x0115:
            boolean r7 = r8 instanceof com.tencent.p014mm.p136ui.widget.MMEditText
            if (r7 == 0) goto L_0x011f
            goto L_0x011e
        L_0x011a:
            boolean r7 = r8 instanceof com.tencent.p014mm.p136ui.widget.MMEditText
            if (r7 == 0) goto L_0x011f
        L_0x011e:
            r1 = 1
        L_0x011f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.p133ui.chat.VoiceInputPanel.m20865b(com.tencent.mm.pluginsdk.ui.chat.VoiceInputPanel, android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: c */
    public static void m20866c(VoiceInputPanel voiceInputPanel) {
        MMEditText mMEditText = voiceInputPanel.f55095j;
        if (mMEditText != null && mMEditText.getText() != null) {
            String obj = voiceInputPanel.f55095j.getText().toString();
            if (obj.length() <= 0) {
                return;
            }
            if (!voiceInputPanel.f55103t || voiceInputPanel.f55095j.getSelectionStart() >= obj.length()) {
                voiceInputPanel.f55075I = obj.substring(obj.length() - 1, obj.length());
                Log.m105925i("MicroMsg.VoiceInputPanel", "delPunctuation msg = %s ,msg.length() = %s, punctuation = %s", Util.secPrint(obj), Integer.valueOf(obj.length()), voiceInputPanel.f55075I);
                if (voiceInputPanel.f55075I.equalsIgnoreCase("。") || voiceInputPanel.f55075I.equalsIgnoreCase(".")) {
                    voiceInputPanel.f55095j.setText(obj.substring(0, obj.length() - 1));
                }
            }
        }
    }

    /* renamed from: d */
    public static void m20867d(VoiceInputPanel voiceInputPanel, int i) {
        voiceInputPanel.getClass();
        Log.m105918d("MicroMsg.VoiceInputPanel", "sendMsg");
        MMEditText mMEditText = voiceInputPanel.f55095j;
        if (mMEditText == null || mMEditText.getText() == null) {
            C77398g gVar = voiceInputPanel.f55098p;
            if (gVar == null || !gVar.isShowing()) {
                voiceInputPanel.f55098p = C76879j.m92738i(voiceInputPanel.getContext(), C0966R.string.b7l, C0966R.string.a3h);
                return;
            }
            return;
        }
        String obj = voiceInputPanel.f55095j.getText().toString();
        if (obj.trim().length() == 0 && obj.length() == 0) {
            C77398g gVar2 = voiceInputPanel.f55098p;
            if (gVar2 == null || !gVar2.isShowing()) {
                voiceInputPanel.f55098p = C76879j.m92738i(voiceInputPanel.getContext(), C0966R.string.b7l, C0966R.string.a3h);
            }
        } else if (voiceInputPanel.f55094i != null) {
            if (!voiceInputPanel.f55103t) {
                VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
                voiceInputBehavior.send = 1;
                if (voiceInputPanel.f55073G) {
                    voiceInputBehavior.send = 2;
                }
                if (i != 1) {
                    if (i == 4) {
                        voiceInputBehavior.send = 4;
                    }
                    voiceInputPanel.mo25279i(voiceInputBehavior);
                }
                if (i == 1 || i == 2 || i == 4) {
                    Log.m105925i("MicroMsg.VoiceInputPanel", "cgiReport size = %s", Integer.valueOf(((ArrayList) voiceInputPanel.f55077K).size()));
                    if (voiceInputPanel.f55081P == null) {
                        voiceInputPanel.f55081P = new C35457d();
                    }
                    C96980c Lo = SubCoreNewABTest.wx0().mo57622Lo("100235");
                    int i2 = Lo.isValid() ? Util.getInt(Lo.mo135598l2().get("MMVoipVadOn"), 0) : 0;
                    Log.m105925i("MicroMsg.VoiceInputPanel", "cgiReport: abTestFlag = [%s]", Integer.valueOf(i2));
                    C35457d dVar = voiceInputPanel.f55081P;
                    List<String> list = voiceInputPanel.f55077K;
                    String valueOf = String.valueOf(i2);
                    dVar.getClass();
                    C86709a0.m107525e().postToWorker(new C35455b(dVar, new ArrayList(list), obj, valueOf));
                    ((ArrayList) voiceInputPanel.f55077K).clear();
                }
            }
            int i3 = 5;
            if (i == 2) {
                if (!voiceInputPanel.f55103t) {
                    i3 = 6;
                }
                voiceInputPanel.mo25281k(i3);
            } else if (i == 1) {
                voiceInputPanel.mo25281k(5);
            }
            Log.m105924i("MicroMsg.VoiceInputPanel", "sendMsg onSendMsg");
            voiceInputPanel.f55094i.mo25291b(obj);
        }
    }

    /* renamed from: e */
    public void mo25275e() {
        Log.m105918d("MicroMsg.VoiceInputPanel", "closePanel");
        if (this.f55094i != null) {
            this.f55072F = true;
            Log.m105924i("MicroMsg.VoiceInputPanel", "closePanel onClearBtnDown");
            VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
            MMEditText mMEditText = this.f55095j;
            if (mMEditText == null || mMEditText.getText() == null || this.f55095j.getText().length() <= 0) {
                if (this.f55072F) {
                    voiceInputBehavior.cancel = 2;
                } else {
                    voiceInputBehavior.cancel = 15;
                }
            } else if (this.f55072F) {
                voiceInputBehavior.cancel = 14;
            } else {
                voiceInputBehavior.cancel = 16;
            }
            long j = this.f55102s;
            if (j != 0) {
                voiceInputBehavior.voiceInputTime = Util.ticksToNow(j);
                this.f55102s = 0;
            }
            mo25279i(voiceInputBehavior);
            this.f55094i.mo25290a();
        }
    }

    /* renamed from: f */
    public void mo25276f() {
        C19489d dVar;
        Log.m105924i("MicroMsg.VoiceInputPanel", "destroy");
        mo25282l();
        IListener<VoiceInputResultEvent> iListener = this.f55079M;
        if (iListener != null) {
            iListener.dead();
            this.f55079M = null;
        }
        VoiceInputLayout voiceInputLayout = this.f55089d;
        if (voiceInputLayout != null) {
            voiceInputLayout.setVoiceDetectListener((VoiceInputLayout.C19473e) null);
            this.f55089d = null;
        }
        if (this.f55081P != null) {
            this.f55081P = null;
        }
        TelephonyManager telephonyManager = this.f55080N;
        if (!(telephonyManager == null || (dVar = this.f55087V) == null)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(dVar);
            C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel", "destroy", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel", "destroy", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            this.f55087V.f55114a = null;
            this.f55087V = null;
        }
        this.f55080N = null;
        this.f55096n = null;
        if (!this.f55082Q.startsWith("MicroMsg.VoiceInputPanel")) {
            this.f55078L.mo141712b(this.f55082Q, this.f55085T.get(this.f55083R).intValue());
        }
        VoiceInputLayoutImpl voiceInputLayoutImpl = (VoiceInputLayoutImpl) findViewById(C0966R.C0970id.laq);
        if (voiceInputLayoutImpl != null) {
            Log.m105924i("MicroMsg.VoiceInputPanel", "voiceInputLayout do stop!");
            voiceInputLayoutImpl.mo25239d();
            MMHandler mMHandler = voiceInputLayoutImpl.f55025o;
            if (mMHandler != null) {
                mMHandler.removeCallbacksAndMessages((Object) null);
            }
            MMHandler mMHandler2 = voiceInputLayoutImpl.f55026p;
            if (mMHandler2 != null) {
                mMHandler2.removeCallbacksAndMessages((Object) null);
            }
            MTimerHandler mTimerHandler = voiceInputLayoutImpl.f55027q;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
        }
    }

    /* renamed from: g */
    public final void mo25277g(int i) {
        Log.m105925i("MicroMsg.VoiceInputPanel", "idkReport type = %s", Integer.valueOf(i));
        C115669n.INSTANCE.idkeyStat(455, (long) i, 1, false);
    }

    /* renamed from: h */
    public void mo25278h() {
        this.f55102s = Util.currentTicks();
        if (this.f55079M == null) {
            Log.m105924i("MicroMsg.VoiceInputPanel", " initVoiceResultListener");
            C1948511 r0 = new IListener<VoiceInputResultEvent>(C40008f.f107254d) {
                {
                    this.__eventId = -191167627;
                }

                public boolean callback(IEvent iEvent) {
                    VoiceInputResultEvent.C17693a aVar;
                    VoiceInputResultEvent voiceInputResultEvent = (VoiceInputResultEvent) iEvent;
                    if (!(voiceInputResultEvent instanceof VoiceInputResultEvent)) {
                        Log.m105918d("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent mismatched event");
                        return false;
                    } else if (voiceInputResultEvent == null || (aVar = voiceInputResultEvent.f48133d) == null) {
                        Log.m105920e("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent event data is null");
                        return false;
                    } else {
                        VoiceInputPanel voiceInputPanel = VoiceInputPanel.this;
                        if (voiceInputPanel.f55103t) {
                            Log.m105924i("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent fromFullScreen true");
                            return false;
                        } else if (!aVar.f48137d.equalsIgnoreCase(voiceInputPanel.f55082Q)) {
                            Log.m105920e("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent userCode not equals!");
                            VoiceInputPanel.this.mo25276f();
                            return false;
                        } else {
                            VoiceInputPanel voiceInputPanel2 = VoiceInputPanel.this;
                            voiceInputPanel2.setToUser(voiceInputPanel2.f55082Q);
                            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent action = %s, textChange: %b", Integer.valueOf(voiceInputResultEvent.f48133d.f48134a), Integer.valueOf(voiceInputResultEvent.f48133d.f48135b));
                            VoiceInputResultEvent.C17693a aVar2 = voiceInputResultEvent.f48133d;
                            int i = aVar2.f48134a;
                            if (i == 2) {
                                if (aVar2.f48135b == 1) {
                                    VoiceInputPanel.this.f55073G = true;
                                } else {
                                    VoiceInputPanel.this.f55073G = false;
                                }
                                String str = aVar2.f48136c;
                                VoiceInputPanel voiceInputPanel3 = VoiceInputPanel.this;
                                voiceInputPanel3.f55078L.mo141713c(voiceInputPanel3.f55095j);
                                VoiceInputPanel voiceInputPanel4 = VoiceInputPanel.this;
                                voiceInputPanel4.f55078L.mo141715e(voiceInputPanel4.f55095j, str, false);
                                VoiceInputPanel voiceInputPanel5 = VoiceInputPanel.this;
                                voiceInputPanel5.f55078L.mo141714d(voiceInputPanel5.f55095j);
                                VoiceInputPanel voiceInputPanel6 = VoiceInputPanel.this;
                                voiceInputPanel6.f55078L.mo141713c(voiceInputPanel6.f55095j);
                                VoiceInputPanel.this.mo25283m();
                                VoiceInputPanel.this.f55097o.fullScroll(130);
                            } else if (i == 3) {
                                C19488c cVar = VoiceInputPanel.this.f55094i;
                                if (cVar != null) {
                                    cVar.mo25290a();
                                }
                            } else if (i == 1 || i == 4) {
                                if (aVar2.f48135b == 1) {
                                    VoiceInputPanel.this.f55073G = true;
                                } else {
                                    VoiceInputPanel.this.f55073G = false;
                                }
                                String str2 = aVar2.f48136c;
                                VoiceInputPanel voiceInputPanel7 = VoiceInputPanel.this;
                                voiceInputPanel7.f55078L.mo141715e(voiceInputPanel7.f55095j, str2, false);
                                VoiceInputPanel voiceInputPanel8 = VoiceInputPanel.this;
                                voiceInputPanel8.f55078L.mo141714d(voiceInputPanel8.f55095j);
                                VoiceInputPanel voiceInputPanel9 = VoiceInputPanel.this;
                                voiceInputPanel9.f55078L.mo141713c(voiceInputPanel9.f55095j);
                                VoiceInputPanel.this.mo25283m();
                                VoiceInputPanel.this.f55097o.fullScroll(130);
                                VoiceInputPanel.m20867d(VoiceInputPanel.this, voiceInputResultEvent.f48133d.f48134a);
                            } else {
                                VoiceInputPanel.this.mo25282l();
                            }
                            return true;
                        }
                    }
                }
            };
            this.f55079M = r0;
            r0.alive();
        }
        if (this.f55089d == null) {
            VoiceInputLayout voiceInputLayout = (VoiceInputLayout) findViewById(C0966R.C0970id.laq);
            this.f55089d = voiceInputLayout;
            voiceInputLayout.setVoiceDetectListener(this.f55088W);
            this.f55089d.setLongClickLisnter(this.f55086U);
            this.f55089d.setFromFullScreen(this.f55103t);
        }
        this.f55100q.setVisibility(0);
        if (this.f55081P == null) {
            this.f55081P = new C35457d();
        }
        SharedPreferences defaultPreference = MMApplicationContext.getDefaultPreference();
        if (defaultPreference != null) {
            String string = defaultPreference.getString("voiceinput_downdistance_content", "");
            if (!string.equalsIgnoreCase("")) {
                Log.m105919d("MicroMsg.VoiceInputPanel", "init memoryContent length=%s", Integer.valueOf(string.length()));
                this.f55078L.mo141713c(this.f55095j);
                this.f55078L.mo141715e(this.f55095j, string, false);
                this.f55078L.mo141714d(this.f55095j);
                this.f55078L.mo141713c(this.f55095j);
                mo25283m();
                this.f55097o.fullScroll(130);
                defaultPreference.edit().remove("voiceinput_downdistance_content").apply();
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        this.f55080N = telephonyManager;
        if (telephonyManager != null) {
            if (this.f55087V == null) {
                this.f55087V = new C19489d(this.f55089d);
            }
            TelephonyManager telephonyManager2 = this.f55080N;
            C19489d dVar = this.f55087V;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(32);
            aVar.mo10233c(dVar);
            TelephonyManager telephonyManager3 = telephonyManager2;
            C117292a.m165358d(telephonyManager3, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel", "initAllListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager2.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager3, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel", "initAllListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        }
    }

    /* renamed from: i */
    public final void mo25279i(VoiceInputBehavior voiceInputBehavior) {
        Log.m105925i("MicroMsg.VoiceInputPanel", "report cancel = %s send = %s click = %s longClick = %s longClickTime = %s textClick = %s textChangeCount = %s textChangeTime = %s textChangeReturn = %s voiceInputTime = %s fail = %s clear = %s smileIconClick = %s voiceIconClick = %s fullScreenVoiceLongClick = %s fullScreenVoiceLongClickTime = %s", Integer.valueOf(voiceInputBehavior.cancel), Integer.valueOf(voiceInputBehavior.send), Integer.valueOf(voiceInputBehavior.click), Integer.valueOf(voiceInputBehavior.longClick), Long.valueOf(voiceInputBehavior.longClickTime), Integer.valueOf(voiceInputBehavior.textClick), Integer.valueOf(voiceInputBehavior.textChangeCount), Long.valueOf(voiceInputBehavior.textChangeTime), Integer.valueOf(voiceInputBehavior.textChangeReturn), Long.valueOf(voiceInputBehavior.voiceInputTime), Integer.valueOf(voiceInputBehavior.fail), Integer.valueOf(voiceInputBehavior.clear), Integer.valueOf(voiceInputBehavior.smileIconClick), Integer.valueOf(voiceInputBehavior.voiceIconClick), Integer.valueOf(voiceInputBehavior.fullScreenVoiceLongClick), Long.valueOf(voiceInputBehavior.fullScreenVoiceLongClickTime));
        log_13905 log_13905 = new log_13905();
        log_13905.viOp_ = voiceInputBehavior;
        C115669n.INSTANCE.mo175916z(13905, log_13905, false, false);
    }

    /* renamed from: j */
    public void mo25280j() {
        Log.m105924i("MicroMsg.VoiceInputPanel", "pause");
        VoiceInputLayout voiceInputLayout = this.f55089d;
        if (voiceInputLayout != null) {
            voiceInputLayout.mo25236a();
        }
        this.f55104u = 0.0f;
        this.f55105v = false;
        this.f55106w = false;
        this.f55107x = false;
        this.f55109y = false;
        this.f55072F = false;
        this.f55108x0 = true;
    }

    /* renamed from: k */
    public void mo25281k(int i) {
        Log.m105925i("MicroMsg.VoiceInputPanel", "action:%d, applang:%s, voiceLang:%s", Integer.valueOf(i), LocaleUtil.getApplicationLanguage(), this.f55085T.get(this.f55083R).toString());
        StreamVoiceInputStruct streamVoiceInputStruct = new StreamVoiceInputStruct();
        streamVoiceInputStruct.f343833d = (long) i;
        streamVoiceInputStruct.f343834e = streamVoiceInputStruct.mo86045b("WechatLanguage", LocaleUtil.getApplicationLanguage(), true);
        streamVoiceInputStruct.f343835f = streamVoiceInputStruct.mo86045b("InputLanguage", this.f55085T.get(this.f55083R).toString(), true);
        streamVoiceInputStruct.mo86054n();
    }

    /* renamed from: l */
    public void mo25282l() {
        Log.m105924i("MicroMsg.VoiceInputPanel", "VoiceInputPanel reset");
        mo25280j();
        this.f55073G = false;
        ((ArrayList) this.f55077K).clear();
        MMEditText mMEditText = this.f55095j;
        if (mMEditText != null) {
            C102172j0 j0Var = this.f55078L;
            if (j0Var != null) {
                j0Var.mo141713c(mMEditText);
                this.f55078L.mo141715e(this.f55095j, "", false);
                this.f55078L.mo141714d(this.f55095j);
                this.f55078L.mo141713c(this.f55095j);
            }
            mo25283m();
        }
    }

    /* renamed from: m */
    public final void mo25283m() {
        Class cls = C110248b.class;
        Log.m105918d("MicroMsg.VoiceInputPanel", "setTextHintAndColor");
        MMEditText mMEditText = this.f55095j;
        if (mMEditText == null || mMEditText.getText() == null || this.f55095j.getText().length() != 0) {
            MMEditText mMEditText2 = this.f55095j;
            if (mMEditText2 != null) {
                mMEditText2.setCursorVisible(true);
            }
            this.f55092g.setVisibility(0);
            if (!this.f55103t) {
                this.f55090e.setVisibility(8);
                this.f55091f.setVisibility(0);
            }
            this.f55100q.setVisibility(8);
        } else {
            this.f55095j.setSelection(0);
            this.f55095j.setCursorVisible(false);
            this.f55092g.setVisibility(4);
            if (!this.f55103t) {
                this.f55090e.setVisibility(0);
            }
            this.f55091f.setVisibility(8);
            this.f55100q.setVisibility(0);
        }
        if (this.f55103t) {
            MMEditText mMEditText3 = this.f55096n;
            if (mMEditText3 == null || mMEditText3.getText() == null || this.f55096n.getText().length() != 0) {
                this.f55092g.setVisibility(0);
            } else {
                this.f55092g.setVisibility(4);
            }
        }
        MMEditText mMEditText4 = this.f55095j;
        if (mMEditText4 != null) {
            mMEditText4.clearFocus();
        }
        Log.m105924i("MicroMsg.VoiceInputPanel", "resumeMusic");
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
        C110066a aVar = ((C110248b) c).f329779e;
        if (aVar == null) {
            aVar = new C110071c();
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
            ((C110248b) c2).f329781g[0] = "music";
        }
        aVar.f329358h.setStreamMute(3, false);
        if (!this.f55068B) {
            this.f55068B = true;
            long currentTimeMillis = System.currentTimeMillis();
            this.f55071E = currentTimeMillis;
            Log.m105919d("VOICEDEBUG", "Last Text Time = %s Corss Time = %s", Long.valueOf(currentTimeMillis), Long.valueOf(this.f55071E - this.f55070D));
        }
    }

    /* renamed from: n */
    public void mo25284n(int i) {
        Log.m105925i("MicroMsg.VoiceInputPanel", "startVoiceInputUIActivity offset = %s", Integer.valueOf(i));
        if (this.f55089d != null) {
            VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
            voiceInputBehavior.textClick = this.f55089d.getCurrentState();
            mo25279i(voiceInputBehavior);
        }
        Intent intent = new Intent();
        intent.setClass(getContext(), VoiceInputUI.class);
        intent.putExtra("offset", i);
        intent.putExtra("userCode", this.f55082Q);
        MMEditText mMEditText = this.f55095j;
        if (!(mMEditText == null || mMEditText.getText() == null)) {
            intent.putExtra(MimeTypes.BASE_TYPE_TEXT, this.f55095j.getText().toString());
            C102172j0 j0Var = this.f55078L;
            if (j0Var != null) {
                j0Var.mo141713c(this.f55095j);
            }
        }
        if (this.f55075I.equalsIgnoreCase("。") || this.f55075I.equalsIgnoreCase(".")) {
            intent.putExtra("punctuation", this.f55075I);
        }
        this.f55078L.mo141712b(this.f55082Q, this.f55085T.get(this.f55083R).intValue());
        Context context = getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel", "startVoiceInputUIActivity", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel", "startVoiceInputUIActivity", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        VoiceInputLayout voiceInputLayout = this.f55089d;
        if (voiceInputLayout != null) {
            Util.hideVKB(voiceInputLayout);
            this.f55089d.mo25236a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public void setCallback(C19488c cVar) {
        this.f55094i = cVar;
    }

    public void setFullScreenData(String str) {
        if (str != null) {
            this.f55075I = str;
        }
        mo25283m();
    }

    public void setPortHeightPX(int i) {
        Log.m105919d("MicroMsg.VoiceInputPanel", "setPortHeightPX DISPLAY_HEIGHT_PORT_IN_PX %s,value %s", Integer.valueOf(this.f55099p0), Integer.valueOf(i));
        if (this.f55099p0 != i) {
            this.f55099p0 = i;
            this.f55108x0 = true;
        }
    }

    public void setToUser(String str) {
        int intValue;
        if (!Util.isNullOrNil(str)) {
            this.f55082Q = str;
            this.f55083R = 0;
            C102172j0 j0Var = this.f55078L;
            synchronized (j0Var) {
                if (C102172j0.f300848j.size() == 0) {
                    j0Var.mo141711a();
                }
                intValue = C102172j0.f300848j.check(str) ? C102172j0.f300848j.get(str).intValue() : 0;
            }
            for (int i = 0; i < this.f55085T.size(); i++) {
                if (intValue == this.f55085T.get(i).intValue()) {
                    this.f55083R = i;
                    this.f55093h.setText(this.f55084S.get(i));
                    this.f55089d.setLangType(this.f55085T.get(this.f55083R).intValue());
                    if (this.f55085T.size() < 2) {
                        this.f55093h.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        Log.m105920e("MicroMsg.VoiceInputPanel", "setToUser toUser is isNullOrNil");
    }
}
