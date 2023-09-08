package com.tencent.p014mm.modelvoiceaddr.p878ui;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.Menu;
import com.tencent.p014mm.modelvoiceaddr.p878ui.VoiceSearchLayout;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.tools.C106757l0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import md0.C117546e;
import od0.C117748a;
import p182kk.C61104a;
import p447aw.C103918d;
import p716uu.C52617d;

/* renamed from: com.tencent.mm.modelvoiceaddr.ui.b */
public class C114760b extends C106742j1 implements C52617d {

    /* renamed from: r */
    public boolean f344097r = true;

    /* renamed from: s */
    public int f344098s;

    /* renamed from: t */
    public int f344099t;

    /* renamed from: u */
    public C52617d.C52618a f344100u;

    /* renamed from: v */
    public VoiceSearchLayout f344101v;

    /* renamed from: w */
    public VoiceSearchLayout.C114758d f344102w = new C114761a();

    /* renamed from: com.tencent.mm.modelvoiceaddr.ui.b$a */
    public class C114761a implements VoiceSearchLayout.C114758d {
        public C114761a() {
        }

        /* renamed from: a */
        public void mo174408a(boolean z, String[] strArr, long j) {
            Log.m105919d("MicroMsg.VoiceSearchViewHelper", "on voice search return, success %B, voice id %d", Boolean.valueOf(z), Long.valueOf(j));
            C114760b bVar = C114760b.this;
            C52617d.C52618a aVar = bVar.f344100u;
            if (aVar != null) {
                aVar.mo63485H1(z, strArr, j, bVar.f344099t);
            }
        }
    }

    public C114760b() {
    }

    /* renamed from: h */
    public boolean mo23881h() {
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.f344097r);
        if (this.f344101v == null) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        Log.m105919d("MicroMsg.VoiceSearchViewHelper", "check has voice search, Enable %B, layout is null ? %B", objArr);
        return this.f344097r;
    }

    /* renamed from: l */
    public boolean mo153857l(int i, KeyEvent keyEvent) {
        if (4 == i) {
            VoiceSearchLayout voiceSearchLayout = this.f344101v;
            boolean z = voiceSearchLayout != null && voiceSearchLayout.getVisibility() == 0;
            Log.m105919d("MicroMsg.VoiceSearchViewHelper", "on back key down, try hide voice search panel, it is visiable[%B]", Boolean.valueOf(z));
            mo174407s();
            if (z) {
                return true;
            }
        }
        Log.m105918d("MicroMsg.VoiceSearchViewHelper", "not match key code, pass to super");
        return super.mo153857l(i, keyEvent);
    }

    /* renamed from: m */
    public void mo153858m(Activity activity, Menu menu) {
        super.mo153858m(activity, menu);
        VoiceSearchLayout voiceSearchLayout = this.f344101v;
        if (voiceSearchLayout != null) {
            voiceSearchLayout.setOnSearchListener(this.f344102w);
        }
    }

    /* renamed from: n */
    public void mo136223n(Menu menu) {
        mo174407s();
    }

    /* renamed from: p */
    public void mo23883p() {
        Log.m105918d("MicroMsg.VoiceSearchViewHelper", "do require voice search");
        C106757l0 l0Var = this.f319121i;
        if (l0Var != null) {
            l0Var.setEditTextEnabled(false);
            this.f319121i.setStatusBtnEnabled(false);
        }
        VoiceSearchLayout voiceSearchLayout = this.f344101v;
        if (voiceSearchLayout != null && voiceSearchLayout.getVisibility() == 8) {
            Log.m105918d("MicroMsg.VoiceSearchViewHelper", "do voice search layout start");
            VoiceSearchLayout voiceSearchLayout2 = this.f344101v;
            int i = this.f344099t;
            voiceSearchLayout2.getClass();
            Class cls = C103918d.class;
            boolean Lb0 = ((C103918d) C86312j.m106911c(cls)).Lb0(voiceSearchLayout2.getContext(), "android.permission.RECORD_AUDIO");
            Log.m105925i("MicroMsg.VoiceSearchLayout", "summerper checkPermission checkMicrophone[%b]", Boolean.valueOf(Lb0));
            if (Lb0) {
                Log.m105918d("MicroMsg.VoiceSearchLayout", "doStart " + voiceSearchLayout2.f344085g);
                voiceSearchLayout2.f344085g = true;
                voiceSearchLayout2.f344086h = false;
                VoiceSearchLayout.C114758d dVar = voiceSearchLayout2.f344083e;
                if (dVar != null) {
                    C114761a aVar = (C114761a) dVar;
                    if (!C61104a.m71669y(MMApplicationContext.getContext()) && !C61104a.m71665u(MMApplicationContext.getContext()) && !C61104a.m71649e(MMApplicationContext.getContext())) {
                        Log.m105918d("MicroMsg.VoiceSearchViewHelper", "on voice search start");
                        C115669n.INSTANCE.mo160131h(10453, Integer.valueOf(C114760b.this.f344098s), 3);
                        C52617d.C52618a aVar2 = C114760b.this.f344100u;
                        if (aVar2 != null) {
                            aVar2.mo63486T3();
                        }
                    }
                }
                voiceSearchLayout2.setVisibility(0);
                voiceSearchLayout2.f344094s.startTimer(50);
                voiceSearchLayout2.mo174397e(true, (C117748a) null);
                voiceSearchLayout2.f344093r = 0;
                C117546e eVar = new C117546e(new C114759a(voiceSearchLayout2), i);
                voiceSearchLayout2.f344089n = eVar;
                Log.m105924i("MicroMsg.SceneVoiceAddr", "start record");
                boolean z = eVar.f351676d == 0 && NetStatusUtil.is2G(MMApplicationContext.getContext());
                eVar.f351681i = z;
                Log.m105925i("MicroMsg.SceneVoiceAddr", "mEnableAmrMode: %b", Boolean.valueOf(z));
                ThreadPool.post(new C117546e.C117549c(), "SceneVoiceAddr_record");
            } else if (voiceSearchLayout2.getContext() instanceof Activity) {
                ((C103918d) C86312j.m106911c(cls)).mo125790zt((Activity) voiceSearchLayout2.getContext(), "android.permission.RECORD_AUDIO", 80);
            }
        }
    }

    /* renamed from: s */
    public void mo174407s() {
        Log.m105918d("MicroMsg.VoiceSearchViewHelper", "do cancel");
        VoiceSearchLayout voiceSearchLayout = this.f344101v;
        if (voiceSearchLayout != null) {
            voiceSearchLayout.mo174395c();
        }
        C106757l0 l0Var = this.f319121i;
        if (l0Var != null) {
            l0Var.setEditTextEnabled(true);
            this.f319121i.setStatusBtnEnabled(true);
        }
    }

    public C114760b(boolean z, boolean z2) {
        super(z, z2);
    }
}
