package com.tencent.p014mm.pluginsdk.p133ui.websearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
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
import com.tencent.p014mm.p136ui.websearch.WebSearchVoiceUI;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.report.kvdata.VoiceInputBehavior;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputLayout;
import com.tencent.p014mm.pluginsdk.p133ui.VoiceInputScrollView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fo3.C116890a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputPanel */
public class WebSearchVoiceInputPanel extends LinearLayout {

    /* renamed from: I */
    public static final /* synthetic */ int f55407I = 0;

    /* renamed from: A */
    public TelephonyManager f55408A;

    /* renamed from: B */
    public String f55409B = "";

    /* renamed from: C */
    public AudioManager f55410C;

    /* renamed from: D */
    public VoiceInputLayout.C19472d f55411D = new C19584a();

    /* renamed from: E */
    public PhoneStateListener f55412E = new C19585b();

    /* renamed from: F */
    public VoiceInputLayout.C19473e f55413F = new C19586c();

    /* renamed from: G */
    public int f55414G = C76577a.m92151b(getContext(), 280);

    /* renamed from: H */
    public boolean f55415H = true;

    /* renamed from: d */
    public VoiceInputLayout f55416d;

    /* renamed from: e */
    public ImageButton f55417e;

    /* renamed from: f */
    public Button f55418f;

    /* renamed from: g */
    public Button f55419g;

    /* renamed from: h */
    public C19587d f55420h;

    /* renamed from: i */
    public MMEditText f55421i;

    /* renamed from: j */
    public TextView f55422j;

    /* renamed from: n */
    public Context f55423n;

    /* renamed from: o */
    public long f55424o = 0;

    /* renamed from: p */
    public boolean f55425p = false;

    /* renamed from: q */
    public boolean f55426q = false;

    /* renamed from: r */
    public long f55427r = 0;

    /* renamed from: s */
    public long f55428s = 0;

    /* renamed from: t */
    public long f55429t = 0;

    /* renamed from: u */
    public boolean f55430u = false;

    /* renamed from: v */
    public boolean f55431v = false;

    /* renamed from: w */
    public boolean f55432w = false;

    /* renamed from: x */
    public Toast f55433x;

    /* renamed from: y */
    public List<String> f55434y = new ArrayList();

    /* renamed from: z */
    public IListener<VoiceInputResultEvent> f55435z;

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputPanel$a */
    public class C19584a implements VoiceInputLayout.C19472d {
        public C19584a() {
        }

        /* renamed from: a */
        public void mo25250a(boolean z) {
            WebSearchVoiceInputPanel.m20984a(WebSearchVoiceInputPanel.this, C0966R.string.kcu);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputPanel$b */
    public class C19585b extends PhoneStateListener {
        public C19585b() {
        }

        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            VoiceInputLayout voiceInputLayout = WebSearchVoiceInputPanel.this.f55416d;
            int currentState = voiceInputLayout != null ? voiceInputLayout.getCurrentState() : -1;
            Log.m105919d("MicroMsg.VoiceInputPanel", "onCallStateChanged :%s, currentState: %s", Integer.valueOf(i), Integer.valueOf(currentState));
            WebSearchVoiceInputPanel webSearchVoiceInputPanel = WebSearchVoiceInputPanel.this;
            VoiceInputLayout voiceInputLayout2 = webSearchVoiceInputPanel.f55416d;
            if (currentState == 2) {
                Log.m105924i("MicroMsg.VoiceInputPanel", "pause");
                VoiceInputLayout voiceInputLayout3 = webSearchVoiceInputPanel.f55416d;
                if (voiceInputLayout3 != null) {
                    voiceInputLayout3.mo25236a();
                }
                webSearchVoiceInputPanel.f55430u = false;
                webSearchVoiceInputPanel.f55415H = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputPanel$c */
    public class C19586c implements VoiceInputLayout.C19473e {
        public C19586c() {
        }

        /* renamed from: a */
        public void mo25251a() {
            WebSearchVoiceInputPanel.this.f55420h.getClass();
            WebSearchVoiceInputPanel.this.f55421i.setHint((CharSequence) null);
        }

        /* renamed from: b */
        public void mo25252b() {
            WebSearchVoiceInputPanel.this.f55427r = System.currentTimeMillis();
            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectStart time %s", Long.valueOf(WebSearchVoiceInputPanel.this.f55427r));
            Log.m105919d("VOICEDEBUG", "Start Record Time = %s", Long.valueOf(WebSearchVoiceInputPanel.this.f55427r));
            WebSearchVoiceInputPanel webSearchVoiceInputPanel = WebSearchVoiceInputPanel.this;
            webSearchVoiceInputPanel.f55425p = false;
            webSearchVoiceInputPanel.f55426q = true;
            webSearchVoiceInputPanel.f55432w = true;
            webSearchVoiceInputPanel.f55428s = 0;
            webSearchVoiceInputPanel.f55429t = 0;
            webSearchVoiceInputPanel.mo25397f();
            WebSearchVoiceInputPanel.this.f55422j.setVisibility(8);
            WebSearchVoiceInputPanel webSearchVoiceInputPanel2 = WebSearchVoiceInputPanel.this;
            webSearchVoiceInputPanel2.f55426q = false;
            AudioManager audioManager = webSearchVoiceInputPanel2.f55410C;
            if (audioManager != null) {
                audioManager.setStreamMute(3, true);
            }
            Context context = WebSearchVoiceInputPanel.this.f55423n;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().addFlags(128);
            }
            WebSearchVoiceInputPanel.this.f55419g.setVisibility(4);
            WebSearchVoiceInputPanel.this.f55417e.setVisibility(4);
            WebSearchVoiceInputPanel.this.f55418f.setVisibility(8);
            WebSearchVoiceInputPanel webSearchVoiceInputPanel3 = WebSearchVoiceInputPanel.this;
            webSearchVoiceInputPanel3.f55421i.setHint(webSearchVoiceInputPanel3.getResources().getString(C0966R.string.kcs));
            C116890a aVar = (C116890a) WebSearchVoiceInputPanel.this.f55420h;
            aVar.getClass();
            C115669n nVar = C115669n.INSTANCE;
            WebSearchVoiceUI webSearchVoiceUI = aVar.f350309a;
            nVar.mo160131h(15178, 2, Long.valueOf(System.currentTimeMillis()), "", webSearchVoiceUI.f348668f, webSearchVoiceUI.f348669g, Integer.valueOf(webSearchVoiceUI.f348670h), Integer.valueOf(aVar.f350309a.f348671i));
        }

        /* renamed from: c */
        public void mo25253c(int i, int i2, int i3) {
            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectError localerrorType = %s errorType = %s errCode = %s time %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(System.currentTimeMillis()));
            WebSearchVoiceInputPanel.this.mo25397f();
            Context context = WebSearchVoiceInputPanel.this.f55423n;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(128);
            }
            if (i == 12) {
                WebSearchVoiceInputPanel.m20984a(WebSearchVoiceInputPanel.this, C0966R.string.kct);
            } else {
                WebSearchVoiceInputPanel.m20984a(WebSearchVoiceInputPanel.this, C0966R.string.f7966xq);
            }
            WebSearchVoiceInputPanel.this.f55420h.getClass();
            WebSearchVoiceInputPanel.this.f55421i.setHint((CharSequence) null);
        }

        /* renamed from: d */
        public void mo25254d(String[] strArr, List<String> list) {
            if (strArr != null && strArr.length > 0 && strArr[0].length() > 0) {
                WebSearchVoiceInputPanel webSearchVoiceInputPanel = WebSearchVoiceInputPanel.this;
                if (webSearchVoiceInputPanel.f55432w) {
                    webSearchVoiceInputPanel.f55432w = false;
                }
                Log.m105925i("MicroMsg.VoiceInputPanel", "onDetected %s", strArr[0]);
                WebSearchVoiceInputPanel.this.f55421i.setText(strArr[0]);
                if (!WebSearchVoiceInputPanel.this.f55425p && strArr[0].length() != 0) {
                    WebSearchVoiceInputPanel webSearchVoiceInputPanel2 = WebSearchVoiceInputPanel.this;
                    webSearchVoiceInputPanel2.f55425p = true;
                    webSearchVoiceInputPanel2.f55428s = System.currentTimeMillis();
                    WebSearchVoiceInputPanel webSearchVoiceInputPanel3 = WebSearchVoiceInputPanel.this;
                    Log.m105919d("VOICEDEBUG", "First Text Time = %s Corss Time = %s", Long.valueOf(System.currentTimeMillis()), Long.valueOf(webSearchVoiceInputPanel3.f55428s - webSearchVoiceInputPanel3.f55427r));
                }
                ((ArrayList) WebSearchVoiceInputPanel.this.f55434y).addAll(list);
            }
        }

        /* renamed from: e */
        public void mo25255e() {
            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onStateReset time %s", Long.valueOf(System.currentTimeMillis()));
            WebSearchVoiceInputPanel.this.mo25397f();
            Context context = WebSearchVoiceInputPanel.this.f55423n;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(128);
            }
            WebSearchVoiceInputPanel.this.f55420h.getClass();
            WebSearchVoiceInputPanel.this.f55421i.setHint((CharSequence) null);
        }

        /* renamed from: f */
        public void mo25256f() {
            Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectFinish  time %s", Long.valueOf(System.currentTimeMillis()));
            WebSearchVoiceInputPanel.this.mo25397f();
            Context context = WebSearchVoiceInputPanel.this.f55423n;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(128);
            }
            WebSearchVoiceInputPanel.this.f55420h.getClass();
            WebSearchVoiceInputPanel.this.f55421i.setHint((CharSequence) null);
            WebSearchVoiceInputPanel.m20985b(WebSearchVoiceInputPanel.this, 2);
        }

        /* renamed from: g */
        public void mo25257g() {
            Log.m105924i("MicroMsg.VoiceInputPanel", "VoiceDetectListener onDetectCancel time " + System.currentTimeMillis());
            WebSearchVoiceInputPanel.this.mo25397f();
            Context context = WebSearchVoiceInputPanel.this.f55423n;
            if (context instanceof Activity) {
                ((Activity) context).getWindow().clearFlags(128);
            }
            WebSearchVoiceInputPanel.this.f55420h.getClass();
            WebSearchVoiceInputPanel.this.f55421i.setHint((CharSequence) null);
            WebSearchVoiceInputPanel.m20985b(WebSearchVoiceInputPanel.this, 2);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.websearch.WebSearchVoiceInputPanel$d */
    public interface C19587d {
    }

    public WebSearchVoiceInputPanel(Context context, boolean z, MMEditText mMEditText) {
        super(context);
        this.f55423n = context;
        Log.m105918d("MicroMsg.VoiceInputPanel", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        View.inflate(getContext(), C0966R.C0971layout.chr, this);
        this.f55417e = (ImageButton) findViewById(C0966R.C0970id.lai);
        this.f55418f = (Button) findViewById(C0966R.C0970id.lah);
        this.f55419g = (Button) findViewById(C0966R.C0970id.lan);
        this.f55422j = (TextView) findViewById(C0966R.C0970id.k1e);
        this.f55417e.setVisibility(0);
        this.f55419g.setVisibility(4);
        this.f55418f.setVisibility(8);
        MMEditText mMEditText2 = (MMEditText) findViewById(C0966R.C0970id.lap);
        this.f55421i = mMEditText2;
        mMEditText2.setHintTextColor(getResources().getColor(C0966R.color.a7b));
        this.f55421i.setClickable(false);
        VoiceInputScrollView voiceInputScrollView = (VoiceInputScrollView) findViewById(C0966R.C0970id.lam);
        this.f55417e.setOnClickListener(new C19589b(this));
        this.f55421i.clearFocus();
        this.f55421i.setFocusable(false);
        this.f55421i.setClickable(false);
        this.f55421i.setLongClickable(false);
        this.f55410C = (AudioManager) getContext().getSystemService("audio");
        String valueOf = String.valueOf(System.nanoTime());
        this.f55409B = valueOf;
        Log.m105925i("MicroMsg.VoiceInputPanel", "mToUser %s", valueOf);
        mo25395d();
    }

    /* renamed from: a */
    public static void m20984a(WebSearchVoiceInputPanel webSearchVoiceInputPanel, int i) {
        Toast toast = webSearchVoiceInputPanel.f55433x;
        if (toast != null) {
            toast.cancel();
        }
        Context context = webSearchVoiceInputPanel.f55423n;
        Toast makeText = C76701a.makeText(context, (CharSequence) context.getResources().getString(i), 0);
        webSearchVoiceInputPanel.f55433x = makeText;
        makeText.setGravity(17, 0, 0);
        webSearchVoiceInputPanel.f55433x.show();
    }

    /* renamed from: b */
    public static void m20985b(WebSearchVoiceInputPanel webSearchVoiceInputPanel, int i) {
        webSearchVoiceInputPanel.getClass();
        Log.m105918d("MicroMsg.VoiceInputPanel", "sendMsg");
        MMEditText mMEditText = webSearchVoiceInputPanel.f55421i;
        if (mMEditText != null && mMEditText.getText() != null) {
            String obj = webSearchVoiceInputPanel.f55421i.getText().toString();
            if ((obj.trim().length() != 0 || obj.length() != 0) && webSearchVoiceInputPanel.f55420h != null) {
                VoiceInputBehavior voiceInputBehavior = new VoiceInputBehavior();
                voiceInputBehavior.send = 1;
                if (webSearchVoiceInputPanel.f55431v) {
                    voiceInputBehavior.send = 2;
                }
                if (i != 1 && i == 4) {
                    voiceInputBehavior.send = 4;
                }
                Log.m105924i("MicroMsg.VoiceInputPanel", "sendMsg onSendMsg");
                C116890a aVar = (C116890a) webSearchVoiceInputPanel.f55420h;
                aVar.getClass();
                if (!TextUtils.isEmpty(obj) && obj.length() > 2) {
                    obj = obj.substring(0, obj.length() - 1);
                }
                Intent intent = new Intent();
                intent.putExtra(MimeTypes.BASE_TYPE_TEXT, obj);
                aVar.f350309a.setResult(0, intent);
                C115669n nVar = C115669n.INSTANCE;
                WebSearchVoiceUI webSearchVoiceUI = aVar.f350309a;
                nVar.mo160131h(15178, 3, Long.valueOf(System.currentTimeMillis()), obj, webSearchVoiceUI.f348668f, webSearchVoiceUI.f348669g, Integer.valueOf(webSearchVoiceUI.f348670h), Integer.valueOf(aVar.f350309a.f348671i));
                aVar.f350309a.finish();
            }
        }
    }

    /* renamed from: c */
    public void mo25394c() {
        PhoneStateListener phoneStateListener;
        Log.m105924i("MicroMsg.VoiceInputPanel", "destroy");
        mo25396e();
        IListener<VoiceInputResultEvent> iListener = this.f55435z;
        if (iListener != null) {
            iListener.dead();
            this.f55435z = null;
        }
        VoiceInputLayout voiceInputLayout = this.f55416d;
        if (voiceInputLayout != null) {
            voiceInputLayout.mo25236a();
            this.f55416d.setVoiceDetectListener((VoiceInputLayout.C19473e) null);
            this.f55416d.mo25239d();
            VoiceInputLayout voiceInputLayout2 = this.f55416d;
            MMHandler mMHandler = voiceInputLayout2.f55025o;
            if (mMHandler != null) {
                mMHandler.removeCallbacksAndMessages((Object) null);
            }
            MMHandler mMHandler2 = voiceInputLayout2.f55026p;
            if (mMHandler2 != null) {
                mMHandler2.removeCallbacksAndMessages((Object) null);
            }
            MTimerHandler mTimerHandler = voiceInputLayout2.f55027q;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            this.f55416d = null;
        }
        TelephonyManager telephonyManager = this.f55408A;
        if (!(telephonyManager == null || (phoneStateListener = this.f55412E) == null)) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(phoneStateListener);
            C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel", "destroy", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel", "destroy", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            this.f55412E = null;
        }
        this.f55408A = null;
        this.f55423n = null;
    }

    /* renamed from: d */
    public void mo25395d() {
        this.f55424o = Util.currentTicks();
        if (this.f55435z == null) {
            Log.m105924i("MicroMsg.VoiceInputPanel", " initVoiceResultListener");
            C195833 r0 = new IListener<VoiceInputResultEvent>(C40008f.f107254d) {
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
                    } else if (!aVar.f48137d.equalsIgnoreCase(WebSearchVoiceInputPanel.this.f55409B)) {
                        Log.m105920e("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent userCode not equals!");
                        WebSearchVoiceInputPanel.this.mo25394c();
                        return false;
                    } else {
                        Log.m105925i("MicroMsg.VoiceInputPanel", "VoiceInputResultEvent action = %s, textChange: %b", Integer.valueOf(voiceInputResultEvent.f48133d.f48134a), Integer.valueOf(voiceInputResultEvent.f48133d.f48135b));
                        VoiceInputResultEvent.C17693a aVar2 = voiceInputResultEvent.f48133d;
                        int i = aVar2.f48134a;
                        if (i == 2) {
                            if (aVar2.f48135b == 1) {
                                WebSearchVoiceInputPanel.this.f55431v = true;
                            } else {
                                WebSearchVoiceInputPanel.this.f55431v = false;
                            }
                            WebSearchVoiceInputPanel.this.f55421i.setText(aVar2.f48136c);
                            WebSearchVoiceInputPanel.this.mo25397f();
                        } else if (i == 3) {
                            C19587d dVar = WebSearchVoiceInputPanel.this.f55420h;
                            if (dVar != null) {
                                ((C116890a) dVar).mo180856a();
                            }
                        } else if (i == 1 || i == 4) {
                            if (aVar2.f48135b == 1) {
                                WebSearchVoiceInputPanel.this.f55431v = true;
                            } else {
                                WebSearchVoiceInputPanel.this.f55431v = false;
                            }
                            WebSearchVoiceInputPanel.this.f55421i.setText(aVar2.f48136c);
                            WebSearchVoiceInputPanel.this.mo25397f();
                            WebSearchVoiceInputPanel.m20985b(WebSearchVoiceInputPanel.this, voiceInputResultEvent.f48133d.f48134a);
                        } else {
                            WebSearchVoiceInputPanel.this.mo25396e();
                        }
                        return true;
                    }
                }
            };
            this.f55435z = r0;
            r0.alive();
        }
        if (this.f55416d == null) {
            VoiceInputLayout voiceInputLayout = (VoiceInputLayout) findViewById(C0966R.C0970id.laq);
            this.f55416d = voiceInputLayout;
            voiceInputLayout.setVoiceDetectListener(this.f55413F);
            this.f55416d.setLongClickLisnter(this.f55411D);
        }
        this.f55422j.setVisibility(0);
        if (this.f55408A == null) {
            TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
            this.f55408A = telephonyManager;
            PhoneStateListener phoneStateListener = this.f55412E;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(32);
            aVar.mo10233c(phoneStateListener);
            C117292a.m165358d(telephonyManager, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel", "initAllListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
            telephonyManager.listen((PhoneStateListener) aVar.mo10231a(0), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(telephonyManager, "com/tencent/mm/pluginsdk/ui/websearch/WebSearchVoiceInputPanel", "initAllListener", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
        }
    }

    /* renamed from: e */
    public void mo25396e() {
        Log.m105924i("MicroMsg.VoiceInputPanel", "VoiceInputPanel reset");
        Log.m105924i("MicroMsg.VoiceInputPanel", "pause");
        VoiceInputLayout voiceInputLayout = this.f55416d;
        if (voiceInputLayout != null) {
            voiceInputLayout.mo25236a();
        }
        this.f55430u = false;
        this.f55415H = true;
        this.f55431v = false;
        ((ArrayList) this.f55434y).clear();
        MMEditText mMEditText = this.f55421i;
        if (mMEditText != null) {
            mMEditText.setText("");
            mo25397f();
        }
    }

    /* renamed from: f */
    public final void mo25397f() {
        Log.m105918d("MicroMsg.VoiceInputPanel", "setTextHintAndColor");
        MMEditText mMEditText = this.f55421i;
        if (mMEditText == null || mMEditText.getText() == null || this.f55421i.getText().length() != 0) {
            this.f55417e.setVisibility(4);
            this.f55422j.setVisibility(8);
        } else {
            this.f55419g.setVisibility(4);
            this.f55417e.setVisibility(0);
            this.f55418f.setVisibility(8);
            this.f55422j.setVisibility(0);
        }
        AudioManager audioManager = this.f55410C;
        if (audioManager != null) {
            audioManager.setStreamMute(3, false);
        }
        if (!this.f55426q) {
            this.f55426q = true;
            long currentTimeMillis = System.currentTimeMillis();
            this.f55429t = currentTimeMillis;
            Log.m105919d("VOICEDEBUG", "Last Text Time = %s Corss Time = %s", Long.valueOf(currentTimeMillis), Long.valueOf(this.f55429t - this.f55428s));
        }
    }

    public void setCallback(C19587d dVar) {
        this.f55420h = dVar;
    }

    public void setToUser(String str) {
        if (!Util.isNullOrNil(str)) {
            this.f55409B = str;
        } else {
            Log.m105920e("MicroMsg.VoiceInputPanel", "setToUser toUser is isNullOrNil");
        }
    }
}
