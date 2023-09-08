package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voip.model.C106350h0;
import com.tencent.p014mm.plugin.voip.widget.VoIPControlIconLayout;
import com.tencent.p014mm.plugin.voip.widget.VoIPFuncIconLayout;
import com.tencent.p014mm.plugin.voip.widget.VoipSmallIconButton;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import l33.C109246a;
import l33.C109247e;
import y33.C112390a;
import z33.C91617n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.ui.z */
public final class C106476z {

    /* renamed from: a */
    public C112390a f318031a;

    /* renamed from: b */
    public VoipSmallIconButton f318032b;

    /* renamed from: c */
    public VoIPFuncIconLayout f318033c;

    /* renamed from: d */
    public VoIPFuncIconLayout f318034d;

    /* renamed from: e */
    public VoIPFuncIconLayout f318035e;

    /* renamed from: f */
    public View f318036f;

    /* renamed from: g */
    public C106440b0 f318037g;

    /* renamed from: h */
    public FrameLayout f318038h;

    /* renamed from: i */
    public VoIPControlIconLayout f318039i;

    /* renamed from: j */
    public VoIPControlIconLayout f318040j;

    /* renamed from: k */
    public int f318041k = 1;

    /* renamed from: l */
    public boolean f318042l;

    /* renamed from: m */
    public final View.OnClickListener f318043m;

    /* renamed from: n */
    public final View.OnClickListener f318044n;

    /* renamed from: o */
    public final View.OnClickListener f318045o;

    /* renamed from: p */
    public final View.OnClickListener f318046p;

    /* renamed from: q */
    public final View.OnClickListener f318047q;

    /* renamed from: r */
    public final View.OnClickListener f318048r;

    /* renamed from: com.tencent.mm.plugin.voip.ui.z$a */
    public static final class C106477a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106476z f318049d;

        public C106477a(C106476z zVar) {
            this.f318049d = zVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mClickIgnoreLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112390a.C112391a.m153348a(this.f318049d.f318031a, C112390a.C112392b.IGNORE_BTN_CLICK, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mClickIgnoreLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.z$b */
    public static final class C106478b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106476z f318050d;

        public C106478b(C106476z zVar) {
            this.f318050d = zVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mMuteClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C106476z zVar = this.f318050d;
            VoIPControlIconLayout voIPControlIconLayout = zVar.f318040j;
            if (voIPControlIconLayout != null) {
                boolean a = voIPControlIconLayout.mo98766a();
                Log.m105925i("MicroMsg.VoIPBottomControlUI", "onMicClick, status: %b", Boolean.valueOf(a));
                Bundle bundle = new Bundle();
                bundle.putBoolean("mute", !a);
                zVar.f318031a.mo152898v(C112390a.C112392b.MUTE_BTN_CLICK, bundle);
                zVar.f318042l = !a;
                voIPControlIconLayout.setChecked(a);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mMuteClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.z$c */
    public static final class C106479c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106476z f318051d;

        /* renamed from: com.tencent.mm.plugin.voip.ui.z$c$a */
        public static final class C106480a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C106476z f318052d;

            /* renamed from: e */
            public final /* synthetic */ Bundle f318053e;

            public C106480a(C106476z zVar, Bundle bundle) {
                this.f318052d = zVar;
                this.f318053e = bundle;
            }

            public final void run() {
                this.f318052d.f318031a.mo152898v(C112390a.C112392b.SPEAKER_BTN_CLICK, this.f318053e);
            }
        }

        public C106479c(C106476z zVar) {
            this.f318051d = zVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mSpeakerClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C106476z zVar = this.f318051d;
            VoIPControlIconLayout voIPControlIconLayout = zVar.f318039i;
            if (voIPControlIconLayout != null) {
                boolean a = voIPControlIconLayout.mo98766a();
                int i = 1;
                Log.m105925i("MicroMsg.VoIPBottomControlUI", "onSpeakerClick, status: %b", Boolean.valueOf(a));
                Bundle bundle = new Bundle();
                bundle.putBoolean("speaker", a);
                ((C119157j) C119157j.f356862d).mo183875f(new C106480a(zVar, bundle));
                if (!a) {
                    i = 2;
                }
                zVar.f318041k = i;
                voIPControlIconLayout.setChecked(a);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mSpeakerClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.z$d */
    public static final class C106481d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106476z f318054d;

        public C106481d(C106476z zVar) {
            this.f318054d = zVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mSwitchAudioAcceptClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112390a.C112391a.m153348a(this.f318054d.f318031a, C112390a.C112392b.ACCEPT_USE_VOICE, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mSwitchAudioAcceptClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.z$e */
    public static final class C106482e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106476z f318055d;

        public C106482e(C106476z zVar) {
            this.f318055d = zVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mSwitchAudioClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112390a.C112391a.m153348a(this.f318055d.f318031a, C112390a.C112392b.SWITCH_TO_VOICE_BTN_CLICK, (Bundle) null, 2, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mSwitchAudioClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.z$f */
    public static final class C106483f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C106476z f318056d;

        public C106483f(C106476z zVar) {
            this.f318056d = zVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mSwitchCameraClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C112390a.C112391a.m153348a(this.f318056d.f318031a, C112390a.C112392b.SWITCH_CAMERA_BTN_CLICK, (Bundle) null, 2, (Object) null);
            this.f318056d.mo153046f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoIPBottomControlUI$mSwitchCameraClickLsn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C106476z(C112390a aVar) {
        C87412m.m108594g(aVar, "statusManager");
        this.f318031a = aVar;
        this.f318037g = new C106440b0(aVar);
        this.f318043m = new C106483f(this);
        this.f318044n = new C106481d(this);
        this.f318045o = new C106482e(this);
        this.f318046p = new C106477a(this);
        this.f318047q = new C106478b(this);
        this.f318048r = new C106479c(this);
    }

    /* renamed from: a */
    public final void mo153041a(boolean z) {
        VoipSmallIconButton voipSmallIconButton = this.f318032b;
        if (voipSmallIconButton != null) {
            voipSmallIconButton.setVisibility(8);
        }
        VoIPControlIconLayout voIPControlIconLayout = this.f318040j;
        if (voIPControlIconLayout != null) {
            voIPControlIconLayout.setVisibility(8);
        }
        VoIPControlIconLayout voIPControlIconLayout2 = this.f318039i;
        if (voIPControlIconLayout2 != null) {
            voIPControlIconLayout2.setVisibility(8);
        }
        VoIPFuncIconLayout voIPFuncIconLayout = this.f318033c;
        if (voIPFuncIconLayout != null) {
            voIPFuncIconLayout.setVisibility(8);
        }
        C106440b0 b0Var = this.f318037g;
        if (b0Var == null) {
            return;
        }
        if (!z) {
            VoIPFuncIconLayout voIPFuncIconLayout2 = b0Var.f317969h;
            if (voIPFuncIconLayout2 != null) {
                voIPFuncIconLayout2.setIconEnabled(false);
            }
            VoIPFuncIconLayout voIPFuncIconLayout3 = b0Var.f317969h;
            if (voIPFuncIconLayout3 != null) {
                voIPFuncIconLayout3.setVisibility(0);
            }
            VoIPFuncIconLayout voIPFuncIconLayout4 = b0Var.f317967f;
            if (voIPFuncIconLayout4 != null) {
                voIPFuncIconLayout4.setVisibility(0);
            }
            VoIPFuncIconLayout voIPFuncIconLayout5 = b0Var.f317967f;
            if (voIPFuncIconLayout5 != null) {
                voIPFuncIconLayout5.setOnClickListener(new C106439a0(b0Var));
            }
            VoIPFuncIconLayout voIPFuncIconLayout6 = b0Var.f317968g;
            if (voIPFuncIconLayout6 != null) {
                voIPFuncIconLayout6.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout7 = b0Var.f317966e;
            if (voIPFuncIconLayout7 != null) {
                voIPFuncIconLayout7.setVisibility(8);
                return;
            }
            return;
        }
        VoIPFuncIconLayout voIPFuncIconLayout8 = b0Var.f317968g;
        if (voIPFuncIconLayout8 != null) {
            voIPFuncIconLayout8.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo153042b(boolean z) {
        if (C91617n.m114966d("VOIPBlockIgnoreButton", 0) == 0) {
            VoipSmallIconButton voipSmallIconButton = this.f318032b;
            if (voipSmallIconButton != null) {
                voipSmallIconButton.setVisibility(0);
            }
        } else {
            VoipSmallIconButton voipSmallIconButton2 = this.f318032b;
            if (voipSmallIconButton2 != null) {
                voipSmallIconButton2.setVisibility(8);
            }
        }
        if (z) {
            VoIPFuncIconLayout voIPFuncIconLayout = this.f318033c;
            if (voIPFuncIconLayout != null) {
                voIPFuncIconLayout.setVisibility(0);
            }
        } else {
            VoIPFuncIconLayout voIPFuncIconLayout2 = this.f318033c;
            if (voIPFuncIconLayout2 != null) {
                voIPFuncIconLayout2.setVisibility(8);
            }
        }
        VoIPFuncIconLayout voIPFuncIconLayout3 = this.f318035e;
        if (voIPFuncIconLayout3 != null) {
            voIPFuncIconLayout3.setVisibility(8);
        }
        VoIPFuncIconLayout voIPFuncIconLayout4 = this.f318034d;
        if (voIPFuncIconLayout4 != null) {
            voIPFuncIconLayout4.setVisibility(8);
        }
        VoIPControlIconLayout voIPControlIconLayout = this.f318040j;
        if (voIPControlIconLayout != null) {
            voIPControlIconLayout.setVisibility(8);
        }
        VoIPControlIconLayout voIPControlIconLayout2 = this.f318039i;
        if (voIPControlIconLayout2 != null) {
            voIPControlIconLayout2.setVisibility(8);
        }
        C106440b0 b0Var = this.f318037g;
        if (b0Var != null) {
            VoIPFuncIconLayout voIPFuncIconLayout5 = b0Var.f317969h;
            if (voIPFuncIconLayout5 != null) {
                voIPFuncIconLayout5.setVisibility(0);
            }
            VoIPFuncIconLayout voIPFuncIconLayout6 = b0Var.f317967f;
            if (voIPFuncIconLayout6 != null) {
                voIPFuncIconLayout6.setVisibility(0);
            }
            VoIPFuncIconLayout voIPFuncIconLayout7 = b0Var.f317968g;
            if (voIPFuncIconLayout7 != null) {
                voIPFuncIconLayout7.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout8 = b0Var.f317966e;
            if (voIPFuncIconLayout8 != null) {
                voIPFuncIconLayout8.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout9 = b0Var.f317970i;
            if (voIPFuncIconLayout9 != null) {
                voIPFuncIconLayout9.setVisibility(8);
            }
        }
    }

    /* renamed from: c */
    public final void mo153043c(boolean z) {
        VoipSmallIconButton voipSmallIconButton = this.f318032b;
        if (voipSmallIconButton != null) {
            voipSmallIconButton.setVisibility(8);
        }
        VoIPControlIconLayout voIPControlIconLayout = this.f318040j;
        if (voIPControlIconLayout != null) {
            voIPControlIconLayout.setIconEnabled(false);
        }
        C106440b0 b0Var = this.f318037g;
        if (b0Var != null && !z) {
            VoIPFuncIconLayout voIPFuncIconLayout = b0Var.f317969h;
            if (voIPFuncIconLayout != null) {
                voIPFuncIconLayout.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout2 = b0Var.f317967f;
            if (voIPFuncIconLayout2 != null) {
                voIPFuncIconLayout2.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout3 = b0Var.f317968g;
            if (voIPFuncIconLayout3 != null) {
                voIPFuncIconLayout3.setVisibility(0);
            }
            VoIPFuncIconLayout voIPFuncIconLayout4 = b0Var.f317966e;
            if (voIPFuncIconLayout4 != null) {
                voIPFuncIconLayout4.setVisibility(8);
            }
        }
    }

    /* renamed from: d */
    public final void mo153044d(boolean z) {
        VoIPFuncIconLayout voIPFuncIconLayout;
        VoipSmallIconButton voipSmallIconButton = this.f318032b;
        if (voipSmallIconButton != null) {
            voipSmallIconButton.setVisibility(8);
        }
        if (!z) {
            VoIPControlIconLayout voIPControlIconLayout = this.f318040j;
            if (voIPControlIconLayout != null) {
                voIPControlIconLayout.setVisibility(0);
            }
            VoIPControlIconLayout voIPControlIconLayout2 = this.f318040j;
            if (voIPControlIconLayout2 != null) {
                voIPControlIconLayout2.setIconEnabled(true);
            }
            VoIPControlIconLayout voIPControlIconLayout3 = this.f318040j;
            if (voIPControlIconLayout3 != null) {
                voIPControlIconLayout3.setChecked(true);
            }
            VoIPControlIconLayout voIPControlIconLayout4 = this.f318039i;
            if (voIPControlIconLayout4 != null) {
                voIPControlIconLayout4.setVisibility(0);
            }
        } else {
            VoIPFuncIconLayout voIPFuncIconLayout2 = this.f318034d;
            if (voIPFuncIconLayout2 != null) {
                voIPFuncIconLayout2.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout3 = this.f318035e;
            if (voIPFuncIconLayout3 != null) {
                voIPFuncIconLayout3.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout4 = this.f318033c;
            if (voIPFuncIconLayout4 != null) {
                voIPFuncIconLayout4.setVisibility(8);
            }
        }
        C106440b0 b0Var = this.f318037g;
        if (b0Var != null) {
            VoIPFuncIconLayout voIPFuncIconLayout5 = b0Var.f317969h;
            if (voIPFuncIconLayout5 != null) {
                voIPFuncIconLayout5.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout6 = b0Var.f317967f;
            if (voIPFuncIconLayout6 != null) {
                voIPFuncIconLayout6.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout7 = b0Var.f317968g;
            if (voIPFuncIconLayout7 != null) {
                voIPFuncIconLayout7.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout8 = b0Var.f317966e;
            if (voIPFuncIconLayout8 != null) {
                voIPFuncIconLayout8.setVisibility(0);
            }
            if (z && (voIPFuncIconLayout = b0Var.f317970i) != null) {
                voIPFuncIconLayout.setVisibility(0);
            }
        }
    }

    /* renamed from: e */
    public final void mo153045e() {
        VoipSmallIconButton voipSmallIconButton = this.f318032b;
        if (voipSmallIconButton != null) {
            voipSmallIconButton.setVisibility(8);
        }
        VoIPFuncIconLayout voIPFuncIconLayout = this.f318034d;
        if (voIPFuncIconLayout != null) {
            voIPFuncIconLayout.setVisibility(0);
        }
        VoIPFuncIconLayout voIPFuncIconLayout2 = this.f318035e;
        if (voIPFuncIconLayout2 != null) {
            voIPFuncIconLayout2.setVisibility(0);
        }
        mo153046f();
        C106440b0 b0Var = this.f318037g;
        if (b0Var != null) {
            VoIPFuncIconLayout voIPFuncIconLayout3 = b0Var.f317966e;
            if (voIPFuncIconLayout3 != null) {
                voIPFuncIconLayout3.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout4 = b0Var.f317968g;
            if (voIPFuncIconLayout4 != null) {
                voIPFuncIconLayout4.setVisibility(0);
            }
            VoIPFuncIconLayout voIPFuncIconLayout5 = b0Var.f317969h;
            if (voIPFuncIconLayout5 != null) {
                voIPFuncIconLayout5.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout6 = b0Var.f317967f;
            if (voIPFuncIconLayout6 != null) {
                voIPFuncIconLayout6.setVisibility(8);
            }
            VoIPFuncIconLayout voIPFuncIconLayout7 = b0Var.f317970i;
            if (voIPFuncIconLayout7 != null) {
                voIPFuncIconLayout7.setVisibility(8);
            }
        }
        VoIPFuncIconLayout voIPFuncIconLayout8 = this.f318033c;
        if (voIPFuncIconLayout8 != null) {
            voIPFuncIconLayout8.setVisibility(8);
        }
        VoIPControlIconLayout voIPControlIconLayout = this.f318039i;
        if (voIPControlIconLayout != null) {
            voIPControlIconLayout.setVisibility(0);
        }
        VoIPControlIconLayout voIPControlIconLayout2 = this.f318040j;
        if (voIPControlIconLayout2 != null) {
            voIPControlIconLayout2.setVisibility(0);
        }
        VoIPControlIconLayout voIPControlIconLayout3 = this.f318040j;
        if (voIPControlIconLayout3 != null) {
            voIPControlIconLayout3.setIconEnabled(true);
        }
        VoIPControlIconLayout voIPControlIconLayout4 = this.f318040j;
        if (voIPControlIconLayout4 != null) {
            voIPControlIconLayout4.setOnClickListener(this.f318047q);
        }
        VoIPControlIconLayout voIPControlIconLayout5 = this.f318040j;
        if (voIPControlIconLayout5 != null) {
            voIPControlIconLayout5.setChecked(true ^ this.f318042l);
        }
        if (this.f318042l) {
            this.f318047q.onClick(this.f318040j);
        }
    }

    /* renamed from: f */
    public final void mo153046f() {
        Context context;
        Context context2;
        C109246a aVar;
        C106350h0 xx02 = C109247e.xx0();
        boolean z = false;
        if (!(xx02 == null || (aVar = xx02.f317333b) == null || aVar.mo152455Y())) {
            z = true;
        }
        String str = null;
        if (!z) {
            VoIPFuncIconLayout voIPFuncIconLayout = this.f318034d;
            if (voIPFuncIconLayout != null) {
                View view = this.f318036f;
                if (!(view == null || (context2 = view.getContext()) == null)) {
                    str = context2.getString(C0966R.string.kgs);
                }
                voIPFuncIconLayout.setContentDescription(str);
                return;
            }
            return;
        }
        VoIPFuncIconLayout voIPFuncIconLayout2 = this.f318034d;
        if (voIPFuncIconLayout2 != null) {
            View view2 = this.f318036f;
            if (!(view2 == null || (context = view2.getContext()) == null)) {
                str = context.getString(C0966R.string.ker);
            }
            voIPFuncIconLayout2.setContentDescription(str);
        }
    }

    /* renamed from: g */
    public final void mo153047g() {
        VoIPControlIconLayout voIPControlIconLayout = this.f318039i;
        if (voIPControlIconLayout == null) {
            Log.m105920e("MicroMsg.VoIPBottomControlUI", "speaker is null");
            return;
        }
        int i = this.f318041k;
        if (4 == i || 3 == i) {
            if (voIPControlIconLayout != null) {
                voIPControlIconLayout.setChecked(false);
            }
            VoIPControlIconLayout voIPControlIconLayout2 = this.f318039i;
            if (voIPControlIconLayout2 != null) {
                voIPControlIconLayout2.setIconEnabled(false);
            }
            Log.m105924i("MicroMsg.VoIPBottomControlUI", "updateSpeakerStatus, disable mCbVoiceSpeakerSwitcher");
            return;
        }
        boolean z = i == 1;
        if (voIPControlIconLayout != null) {
            voIPControlIconLayout.setIconEnabled(true);
        }
        VoIPControlIconLayout voIPControlIconLayout3 = this.f318039i;
        if (voIPControlIconLayout3 != null) {
            voIPControlIconLayout3.setChecked(z);
        }
        Log.m105925i("MicroMsg.VoIPBottomControlUI", "updateSpeakerStatus, set mCbVoiceSpeakerSwitcher isChecked:%s", Boolean.valueOf(z));
    }
}
