package com.tencent.p014mm.modelvoiceaddr.p878ui;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.p136ui.contact.ChatroomContactUI;
import com.tencent.p014mm.p136ui.tools.C106757l0;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageButton;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import md0.C117546e;
import od0.C117748a;
import ou0.C110066a;
import ou0.C110071c;
import p331dj.C97481g;
import p716uu.C52617d;
import pu0.C110248b;

/* renamed from: com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout */
public class VoiceSearchLayout extends LinearLayout {

    /* renamed from: t */
    public static final int[] f344079t = {C0966R.C0969drawable.bo4, C0966R.C0969drawable.bo5, C0966R.C0969drawable.bo6, C0966R.C0969drawable.bo7, C0966R.C0969drawable.bnk, C0966R.C0969drawable.bnl, C0966R.C0969drawable.bnm, C0966R.C0969drawable.bnn, C0966R.C0969drawable.bno, C0966R.C0969drawable.bnp, C0966R.C0969drawable.bnq, C0966R.C0969drawable.bnr, C0966R.C0969drawable.bns, C0966R.C0969drawable.bnt};

    /* renamed from: u */
    public static final int[] f344080u = {C0966R.C0969drawable.bo4, C0966R.C0969drawable.bo4, C0966R.C0969drawable.bo4, C0966R.C0969drawable.bo5, C0966R.C0969drawable.bo6, C0966R.C0969drawable.bo5, C0966R.C0969drawable.bo4, C0966R.C0969drawable.bo7, C0966R.C0969drawable.bo4, C0966R.C0969drawable.bo4};

    /* renamed from: v */
    public static final int[] f344081v = {C0966R.C0969drawable.bnu, C0966R.C0969drawable.f357412bo3, C0966R.C0969drawable.f357412bo3, C0966R.C0969drawable.f357412bo3, C0966R.C0969drawable.bnu};

    /* renamed from: d */
    public View f344082d = null;

    /* renamed from: e */
    public C114758d f344083e = null;

    /* renamed from: f */
    public WeImageButton f344084f;

    /* renamed from: g */
    public boolean f344085g = false;

    /* renamed from: h */
    public boolean f344086h = false;

    /* renamed from: i */
    public C68147e f344087i;

    /* renamed from: j */
    public View f344088j;

    /* renamed from: n */
    public C117546e f344089n;

    /* renamed from: o */
    public int f344090o = 0;

    /* renamed from: p */
    public int f344091p = 0;

    /* renamed from: q */
    public int f344092q = 0;

    /* renamed from: r */
    public int f344093r = 0;

    /* renamed from: s */
    public final MTimerHandler f344094s = new MTimerHandler(new C114755a(), true);

    /* renamed from: com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout$e */
    public interface C68147e {
    }

    /* renamed from: com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout$a */
    public class C114755a implements MTimerHandler.CallBack {
        public C114755a() {
        }

        public boolean onTimerExpired() {
            VoiceSearchLayout voiceSearchLayout = VoiceSearchLayout.this;
            C117546e eVar = voiceSearchLayout.f344089n;
            if (eVar == null) {
                return true;
            }
            int i = voiceSearchLayout.f344093r;
            int[] iArr = VoiceSearchLayout.f344081v;
            if (i < 5) {
                voiceSearchLayout.f344093r = i + 1;
                voiceSearchLayout.setAmpImage(iArr[i]);
                return true;
            }
            eVar.getClass();
            Log.m105918d("MicroMsg.SceneVoiceAddr", "cAmplitude " + eVar.f351677e);
            int i2 = eVar.f351677e;
            eVar.f351677e = 0;
            if (i2 > C117546e.f351675v) {
                C117546e.f351675v = i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(" map: ");
            sb.append(i2);
            sb.append(" max:");
            sb.append(C117546e.f351675v);
            sb.append(" per:");
            int i3 = i2 * 100;
            sb.append(i3 / C117546e.f351675v);
            Log.m105918d("getMaxAmplitude", sb.toString());
            int i4 = i3 / C117546e.f351675v;
            Log.m105918d("MicroMsg.VoiceSearchLayout", "addr vol:" + i4);
            VoiceSearchLayout voiceSearchLayout2 = VoiceSearchLayout.this;
            int i5 = voiceSearchLayout2.f344090o;
            int i6 = voiceSearchLayout2.f344091p;
            if (i5 == i6) {
                if (i4 <= 10) {
                    int i7 = voiceSearchLayout2.f344092q + 1;
                    voiceSearchLayout2.f344092q = i7;
                    int[] iArr2 = VoiceSearchLayout.f344080u;
                    if (i7 >= 10) {
                        voiceSearchLayout2.f344092q = 0;
                    }
                    voiceSearchLayout2.setAmpImage(iArr2[voiceSearchLayout2.f344092q]);
                    return true;
                }
                int i8 = i4 / 5;
                int[] iArr3 = VoiceSearchLayout.f344079t;
                if (i8 >= 14) {
                    i8 = 13;
                }
                Log.m105918d("MicroMsg.VoiceSearchLayout", "addr mvol:" + i8);
                VoiceSearchLayout.this.f344091p = i8;
            } else if (i5 > i6) {
                voiceSearchLayout2.f344090o = i5 - 1;
            } else {
                voiceSearchLayout2.f344090o = i5 + 1;
            }
            VoiceSearchLayout.this.setAmpImage(VoiceSearchLayout.f344079t[i5]);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout$b */
    public class C114756b implements MediaPlayer.OnCompletionListener {
        public C114756b(VoiceSearchLayout voiceSearchLayout, C117748a aVar) {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.release();
        }
    }

    /* renamed from: com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout$c */
    public class C114757c implements MediaPlayer.OnErrorListener {
        public C114757c(VoiceSearchLayout voiceSearchLayout, C117748a aVar) {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout$d */
    public interface C114758d {
    }

    public VoiceSearchLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo174396d(context);
    }

    /* renamed from: a */
    public static void m161446a(VoiceSearchLayout voiceSearchLayout) {
        voiceSearchLayout.f344086h = true;
        voiceSearchLayout.setSearchStartBtnView(true);
    }

    /* access modifiers changed from: private */
    public void setAmpImage(int i) {
        WeImageButton weImageButton = this.f344084f;
        if (weImageButton != null) {
            weImageButton.setBackgroundResource(i);
        }
    }

    private void setSearchStartBtnView(boolean z) {
        if (z) {
            this.f344084f.setBackgroundResource(C0966R.C0969drawable.f357406b02);
            AnimationDrawable animationDrawable = (AnimationDrawable) this.f344084f.getBackground();
            if (animationDrawable != null) {
                animationDrawable.start();
                return;
            }
            return;
        }
        this.f344084f.setBackgroundResource(C0966R.C0969drawable.bnj);
    }

    /* renamed from: c */
    public void mo174395c() {
        Log.m105918d("MicroMsg.VoiceSearchLayout", "doCancel " + this.f344085g);
        if (this.f344085g) {
            this.f344085g = false;
            C114758d dVar = this.f344083e;
            if (dVar != null) {
                C114760b.C114761a aVar = (C114760b.C114761a) dVar;
                Log.m105918d("MicroMsg.VoiceSearchViewHelper", "on voice search cancel");
                C115669n.INSTANCE.mo160131h(10453, Integer.valueOf(C114760b.this.f344098s), 4);
                C106757l0 l0Var = C114760b.this.f319121i;
                if (l0Var != null) {
                    l0Var.setEditTextEnabled(true);
                    C114760b.this.f319121i.setStatusBtnEnabled(true);
                }
                C52617d.C52618a aVar2 = C114760b.this.f344100u;
                if (aVar2 != null) {
                    aVar2.mo63487U1();
                }
            }
        }
        mo174398f();
        if (getVisibility() == 0) {
            setVisibility(8);
            C68147e eVar = this.f344087i;
            if (eVar != null) {
                ((ChatroomContactUI.C74372d) eVar).mo103336a(false);
            }
        }
        Class cls = C110248b.class;
        Log.m105918d("MicroMsg.VoiceSearchLayout", "resumeMusic");
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
        C110066a aVar3 = ((C110248b) c).f329779e;
        if (aVar3 == null) {
            aVar3 = new C110071c();
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
            ((C110248b) c2).f329781g[0] = "music";
        }
        aVar3.f329358h.setStreamMute(3, false);
        C117546e eVar2 = this.f344089n;
        if (eVar2 != null) {
            eVar2.f351682j = null;
            eVar2.mo182282b();
        }
        MTimerHandler mTimerHandler = this.f344094s;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }

    /* renamed from: d */
    public final void mo174396d(Context context) {
        View inflate = View.inflate(context, C0966R.C0971layout.ccp, this);
        this.f344082d = inflate;
        this.f344084f = (WeImageButton) inflate.findViewById(C0966R.C0970id.lbl);
        this.f344088j = this.f344082d.findViewById(C0966R.C0970id.lbj);
        setSearchStartBtnView(false);
        mo174398f();
    }

    /* renamed from: e */
    public final void mo174397e(boolean z, C117748a aVar) {
        Class cls = C110248b.class;
        if (z) {
            Log.m105918d("MicroMsg.VoiceSearchLayout", "pauseMusic");
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
            C110066a aVar2 = ((C110248b) c).f329779e;
            if (aVar2 == null) {
                aVar2 = new C110071c();
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
                ((C110248b) c2).f329781g[0] = "music";
            }
            aVar2.f329358h.setStreamMute(3, true);
        } else {
            Log.m105918d("MicroMsg.VoiceSearchLayout", "resumeMusic");
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(SubCoreAudio::class.java)");
            C110066a aVar3 = ((C110248b) c3).f329779e;
            if (aVar3 == null) {
                aVar3 = new C110071c();
                C7335d c4 = C86312j.m106911c(cls);
                C87412m.m108593f(c4, "getService(SubCoreAudio::class.java)");
                ((C110248b) c4).f329781g[0] = "music";
            }
            aVar3.f329358h.setStreamMute(3, false);
        }
        C97481g gVar = new C97481g();
        if (z) {
            try {
                Context context = getContext();
                gVar.setDataSource(context, Uri.parse("android.resource://" + getContext().getPackageName() + "/" + C0966R.raw.f7253on));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VoiceSearchLayout", e, "", new Object[0]);
                gVar.release();
                return;
            }
        } else {
            Context context2 = getContext();
            gVar.setDataSource(context2, Uri.parse("android.resource://" + getContext().getPackageName() + "/" + C0966R.raw.off));
        }
        gVar.setAudioStreamType(5);
        gVar.setOnCompletionListener(new C114756b(this, aVar));
        gVar.setOnErrorListener(new C114757c(this, aVar));
        gVar.prepare();
        gVar.setLooping(false);
        gVar.start();
    }

    /* renamed from: f */
    public void mo174398f() {
        setSearchStartBtnView(false);
        this.f344085g = false;
        this.f344086h = false;
        this.f344084f.setBackgroundResource(C0966R.C0969drawable.bnj);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f344086h) {
            return true;
        }
        Log.m105918d("MicroMsg.VoiceSearchLayout", "checkStop " + this.f344085g);
        if (!this.f344085g) {
            return true;
        }
        mo174395c();
        this.f344085g = false;
        return true;
    }

    public void setOnSearchListener(C114758d dVar) {
        this.f344083e = dVar;
    }

    public void setOnVisibleChangeListener(C68147e eVar) {
        this.f344087i = eVar;
    }

    public void setTopMargin(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f344088j.getLayoutParams();
        layoutParams.topMargin = i;
        this.f344088j.setLayoutParams(layoutParams);
    }

    public void setVisibility(int i) {
        if (super.getVisibility() != i) {
            startAnimation(i == 8 ? AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2394bx) : AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2393bw));
            super.setVisibility(i);
            C68147e eVar = this.f344087i;
            if (eVar != null) {
                ((ChatroomContactUI.C74372d) eVar).mo103336a(i == 0);
            }
        }
    }

    public VoiceSearchLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo174396d(context);
    }

    public VoiceSearchLayout(Context context) {
        super(context);
        mo174396d(context);
    }
}
