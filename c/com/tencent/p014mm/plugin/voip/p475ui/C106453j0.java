package com.tencent.p014mm.plugin.voip.p475ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voip.widget.BaseSmallView;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import l33.C109247e;
import o33.C109935a;
import p447aw.C103918d;
import p447aw.C54369c;
import p646pn.C110234e;
import uu1.C111222b;
import vc3.C78382a;
import z33.C112595h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.ui.j0 */
public class C106453j0 {

    /* renamed from: a */
    public VoipViewFragment f317987a;

    /* renamed from: b */
    public C106443e f317988b;

    /* renamed from: c */
    public MTimerHandler f317989c;

    /* renamed from: d */
    public boolean f317990d = false;

    /* renamed from: com.tencent.mm.plugin.voip.ui.j0$a */
    public class C106454a implements AbsRequestFloatWindowPermissionDialog.C85613a {

        /* renamed from: a */
        public final /* synthetic */ C106443e f317991a;

        /* renamed from: b */
        public final /* synthetic */ Intent f317992b;

        /* renamed from: c */
        public final /* synthetic */ boolean f317993c;

        /* renamed from: d */
        public final /* synthetic */ boolean f317994d;

        public C106454a(C106443e eVar, Intent intent, boolean z, boolean z2) {
            this.f317991a = eVar;
            this.f317992b = intent;
            this.f317993c = z;
            this.f317994d = z2;
        }

        /* renamed from: a */
        public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
            this.f317991a.mo150078b();
            if (this.f317991a.mo150077a()) {
                C106453j0.this.mo153006b(this.f317992b, this.f317993c, this.f317994d);
            }
        }

        /* renamed from: b */
        public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            this.f317991a.mo150079c();
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
        }

        /* renamed from: c */
        public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
            this.f317991a.mo150079c();
            if (absRequestFloatWindowPermissionDialog != null) {
                absRequestFloatWindowPermissionDialog.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.j0$b */
    public class C106455b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f317996d;

        /* renamed from: f */
        public final /* synthetic */ boolean f317998f;

        /* renamed from: com.tencent.mm.plugin.voip.ui.j0$b$a */
        public class C106456a implements MTimerHandler.CallBack {
            public C106456a() {
            }

            public boolean onTimerExpired() {
                Log.m105924i("MicroMsg.VoipVoiceMiniManager", "click small view and time is up we remove it..");
                C106453j0.this.mo153005a(false);
                MTimerHandler mTimerHandler = C106453j0.this.f317989c;
                if (mTimerHandler == null) {
                    return true;
                }
                mTimerHandler.stopTimer();
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.voip.ui.j0$b$b */
        public class C106457b implements Runnable {
            public C106457b() {
            }

            public void run() {
                C106453j0.this.mo153005a(false);
            }
        }

        public C106455b(boolean z, Intent intent) {
            this.f317998f = z;
            this.f317996d = intent;
        }

        public void onClick(View view) {
            Intent intent;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/ui/VoipMiniViewManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C109935a aVar = C109935a.C109937b.f328933a;
            aVar.f311726d.f311683H.f311721j = 3;
            ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149142r(aVar.f311726d);
            if (!C112595h.f337167b || this.f317998f) {
                this.f317996d.addFlags(268435456);
                Context context = MMApplicationContext.getContext();
                Intent intent2 = this.f317996d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                Context context2 = context;
                C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                C106453j0.this.getClass();
                String str = C109247e.xx0().f317332a.f317413r;
                boolean z = C109247e.xx0().f317332a.f317414s;
                if (TextUtils.isEmpty(str)) {
                    Log.m105928w("MicroMsg.VoipVoiceMiniManager", "null talkName");
                    intent = null;
                } else {
                    intent = ((C111222b) C86312j.m106911c(C111222b.class)).mo161937r8(MMApplicationContext.getContext(), str, z);
                }
                if (intent != null) {
                    Context context3 = MMApplicationContext.getContext();
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent);
                    Context context4 = context3;
                    C117292a.m165358d(context4, aVar3.mo10232b(), "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context3.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(context4, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            C106453j0.this.f317989c = new MTimerHandler(new C106456a(), false);
            C106453j0.this.f317989c.startTimer(2000);
            MMHandlerThread.postToMainThreadDelayed(new C106457b(), 200);
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/ui/VoipMiniViewManager$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.voip.ui.j0$c */
    public class C106458c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f318001d;

        /* renamed from: com.tencent.mm.plugin.voip.ui.j0$c$a */
        public class C106459a implements Runnable {
            public C106459a() {
            }

            public void run() {
                C106458c cVar = C106458c.this;
                C106453j0 j0Var = C106453j0.this;
                VoipViewFragment voipViewFragment = j0Var.f317987a;
                if (voipViewFragment != null && !j0Var.f317990d) {
                    voipViewFragment.mo152987b(cVar.f318001d);
                }
            }
        }

        public C106458c(boolean z) {
            this.f318001d = z;
        }

        public void run() {
            ((C119157j) C119157j.f356862d).mo183895z(new C106459a());
        }
    }

    /* renamed from: a */
    public void mo153005a(boolean z) {
        Log.m105925i("MicroMsg.VoipVoiceMiniManager", "dismiss now.. isFinish: %b, smallView: %s", Boolean.valueOf(z), this.f317987a);
        VoipViewFragment voipViewFragment = this.f317987a;
        if (voipViewFragment != null) {
            if (z) {
                C109935a.C109937b.f328933a.mo161254w0(voipViewFragment);
            }
            VoipViewFragment voipViewFragment2 = this.f317987a;
            if (voipViewFragment2 != null) {
                voipViewFragment2.getClass();
                try {
                    BaseSmallView baseSmallView = voipViewFragment2.f317951e;
                    if (baseSmallView != null) {
                        baseSmallView.mo153123k();
                    }
                } catch (Exception unused) {
                    Log.m105920e("MicroMsg.VoipViewFragment", "recycle bitmap failed");
                }
                this.f317987a.setOnClickListener((View.OnClickListener) null);
                this.f317987a = null;
            }
        } else if (z) {
            C109935a.C109937b.f328933a.mo68418k();
        }
    }

    /* renamed from: b */
    public final void mo153006b(Intent intent, boolean z, boolean z2) {
        Log.m105924i("MicroMsg.VoipVoiceMiniManager", "mini now..");
        VoipViewFragment voipViewFragment = this.f317987a;
        if (voipViewFragment != null) {
            this.f317988b.mo150080d(intent, voipViewFragment.mo152986a(z, false));
            return;
        }
        Context context = MMApplicationContext.getContext();
        C87412m.m108594g(context, "context");
        this.f317987a = new VoipViewFragment(context, (AttributeSet) null);
        this.f317990d = false;
        MTimerHandler mTimerHandler = this.f317989c;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        this.f317987a.setOnClickListener(new C106455b(z2, intent));
        if (z) {
            C109935a.C109937b.f328933a.mo161253v0(4, false, this.f317987a);
        } else {
            C109935a.C109937b.f328933a.mo161253v0(8, false, this.f317987a);
        }
        this.f317988b.mo150080d(intent, this.f317987a.mo152986a(z, false));
        mo153009e(C109247e.xx0().mo152622u());
    }

    /* renamed from: c */
    public void mo153007c(boolean z) {
        if (this.f317987a != null && !this.f317990d) {
            ((C119157j) C119157j.f356862d).mo183894y("showIcon");
            ((C119157j) C119157j.f356862d).mo183876g(new C106458c(z), "showIcon");
        }
    }

    /* renamed from: d */
    public void mo153008d(Intent intent, boolean z, boolean z2, C106443e eVar) {
        C106443e eVar2 = eVar;
        if (intent == null) {
            Log.m105920e("MicroMsg.VoipVoiceMiniManager", "showMini, intent cannot be null!");
        } else if (eVar2 == null) {
            Log.m105920e("MicroMsg.VoipVoiceMiniManager", "showMini, VoipMiniCallBack cannot be null!");
        } else {
            this.f317988b = eVar2;
            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(MMApplicationContext.getContext(), 9)) {
                Log.m105920e("MicroMsg.VoipVoiceMiniManager", "mini, permission denied");
                Context context = MMApplicationContext.getContext();
                ((C54369c) C86312j.m106911c(C54369c.class)).xh0(context, 9, context.getString(C0966R.string.kgq), new C106454a(eVar, intent, z, z2), C78382a.m94650b());
                return;
            }
            eVar.mo150078b();
            mo153006b(intent, z, z2);
        }
    }

    /* renamed from: e */
    public void mo153009e(boolean z) {
        VoipViewFragment voipViewFragment = this.f317987a;
        if (voipViewFragment != null) {
            voipViewFragment.getClass();
            Log.m105924i("MicroMsg.VoipViewFragment", "showRemoteCaptureState pause is " + z);
            BaseSmallView baseSmallView = voipViewFragment.f317951e;
            if (baseSmallView != null) {
                baseSmallView.mo153122j(z);
            }
        }
    }
}
