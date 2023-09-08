package p371ph;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.p136ui.chatting.AutoPlay;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C7335d;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import kd0.C21320e0;
import kd0.C21323o;
import kd0.C21329r;
import kd0.C76550x;
import kd0.C76552z;
import nc3.C34767b;
import ob0.C76996p;
import ou0.C110066a;
import ou0.C110071c;
import p206nj.C11171e;
import p302ch.C16928a;
import p375qh.C22086d;
import pu0.C110248b;
import qu0.C110472b;

/* renamed from: ph.a */
public class C21967a implements C76996p {

    /* renamed from: n */
    public static String f62199n;

    /* renamed from: a */
    public C22086d f62200a;

    /* renamed from: b */
    public Context f62201b;

    /* renamed from: c */
    public boolean f62202c;

    /* renamed from: d */
    public int f62203d;

    /* renamed from: e */
    public C76996p.C76997c f62204e;

    /* renamed from: f */
    public C76996p.C76999e f62205f;

    /* renamed from: g */
    public String f62206g;

    /* renamed from: h */
    public boolean f62207h;

    /* renamed from: i */
    public boolean f62208i;

    /* renamed from: j */
    public List<C76996p.C76998d> f62209j;

    /* renamed from: k */
    public C16928a f62210k;

    /* renamed from: l */
    public C76996p.C77001b f62211l;

    /* renamed from: m */
    public C76996p.C77000a f62212m;

    /* renamed from: ph.a$b */
    public class C21968b implements C22086d.C22089c {
        public C21968b() {
        }

        /* renamed from: a */
        public void mo35071a(long j) {
            for (int i = 0; i < ((ArrayList) C21967a.this.f62209j).size(); i++) {
                ((C76996p.C76998d) ((ArrayList) C21967a.this.f62209j).get(i)).mo102018a(j);
            }
        }
    }

    /* renamed from: ph.a$a */
    public class C21969a implements C34767b.C21622a {
        public C21969a() {
        }

        /* renamed from: a */
        public void mo17997a(boolean z) {
            String str;
            Log.m105925i("MicroMsg.SceneVoicePlayer", "onPause: %b", Boolean.valueOf(z));
            if (C21967a.this.mo35058b()) {
                String str2 = C21967a.this.f62206g;
                if (str2 == null || (str = C21967a.f62199n) == null || str2.equals(str)) {
                    if (!Util.isEqual(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_target26_voice_focus_shield_sw, 0), 0)) {
                        Log.m105924i("MicroMsg.SceneVoicePlayer", "no shield");
                    } else if (z && C11171e.m11046c(26)) {
                        Log.m105925i("MicroMsg.SceneVoicePlayer", "focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK %s", Integer.valueOf(Build.VERSION.SDK_INT));
                        return;
                    }
                    Log.m105924i("MicroMsg.SceneVoicePlayer", "real onPause: ");
                    C21967a.this.mo35059c(false);
                }
            }
        }

        public void onResume() {
            Log.m105924i("MicroMsg.SceneVoicePlayer", "onResume: audioFocusChange");
            C21967a.this.mo35060d();
        }

        public void onStop() {
            Log.m105924i("MicroMsg.SceneVoicePlayer", "onStop: audioFocusChange");
            C21967a.this.mo35070n(false);
        }
    }

    public C21967a(Context context) {
        this(context, 0);
    }

    /* renamed from: a */
    public boolean mo35057a() {
        C22086d dVar = this.f62200a;
        return dVar != null && dVar.getStatus() == 2;
    }

    /* renamed from: b */
    public boolean mo35058b() {
        C22086d dVar = this.f62200a;
        if (dVar == null) {
            return false;
        }
        return dVar.isPlaying();
    }

    /* renamed from: c */
    public boolean mo35059c(boolean z) {
        C76996p.C76997c cVar;
        C22086d dVar;
        Class cls = C110248b.class;
        if (this.f62200a == null) {
            return false;
        }
        Log.m105924i("MicroMsg.SceneVoicePlayer", "pause");
        C16928a aVar = this.f62210k;
        C22086d dVar2 = aVar.f45755s;
        boolean b = (!(dVar2 != null && dVar2.isPlaying()) || (dVar = aVar.f45755s) == null) ? false : dVar.mo33326b(z);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(SubCoreAudio::class.java)");
        C110066a aVar2 = ((C110248b) c).f329779e;
        if (aVar2 == null) {
            aVar2 = new C110071c();
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(SubCoreAudio::class.java)");
            ((C110248b) c2).f329781g[0] = "music";
        }
        aVar2.mo157511t();
        if (aVar.f45752p) {
            C34767b.C34768c cVar2 = aVar.f45749m;
            if (cVar2 != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar2);
            }
            aVar.f45749m = null;
            aVar.f45752p = false;
        }
        if (b && (cVar = this.f62204e) != null) {
            Log.m105929w("MicroMsg.AutoPlay", "voice play pause. %b", Boolean.valueOf(z));
            ((AutoPlay) cVar).mo102008k();
        }
        Log.m105925i("MicroMsg.SceneVoicePlayer", "jacks Player abandonFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", Boolean.valueOf(this.f62207h), Boolean.FALSE);
        return b;
    }

    /* renamed from: d */
    public boolean mo35060d() {
        if (this.f62200a == null) {
            return false;
        }
        Log.m105924i("MicroMsg.SceneVoicePlayer", "resume");
        C16928a aVar = this.f62210k;
        C22086d dVar = aVar.f45755s;
        boolean resume = dVar != null ? dVar.resume() : false;
        if (resume) {
            aVar.mo161478U("music", 2);
            if (C110472b.f330365a.mo161951b()) {
                aVar.f45754r = false;
            }
            aVar.mo107365b0(aVar.f45754r);
        }
        if (!aVar.f45752p) {
            C34767b.C34768c el = ((C34767b) C86312j.m106911c(C34767b.class)).mo34192el(C34767b.C34769b.C34785o.f93468c, aVar.f45748l);
            aVar.f45749m = el;
            aVar.f45752p = el != null ? el.mo34198a() : false;
        }
        Log.m105925i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", Boolean.valueOf(this.f62207h), Boolean.FALSE);
        return resume;
    }

    /* renamed from: e */
    public void mo35061e(boolean z) {
        Log.m105925i("MicroMsg.SceneVoicePlayer", "setContinuousPlay() continuousPlay:%s", Boolean.valueOf(z));
        this.f62202c = z;
    }

    /* renamed from: f */
    public void mo35062f(C76996p.C77000a aVar) {
        this.f62212m = aVar;
    }

    /* renamed from: g */
    public void mo35063g(C76996p.C77001b bVar) {
        this.f62211l = bVar;
    }

    /* renamed from: h */
    public void mo35064h(C76996p.C76997c cVar) {
        this.f62204e = cVar;
    }

    /* renamed from: i */
    public void mo35065i(C76996p.C76999e eVar) {
        this.f62205f = eVar;
    }

    /* renamed from: j */
    public void mo35066j(boolean z) {
        this.f62210k.mo18028n(z);
    }

    /* renamed from: k */
    public boolean mo35067k(String str, boolean z) {
        return mo35068l(str, z, false, -1);
    }

    /* renamed from: l */
    public boolean mo35068l(String str, boolean z, boolean z2, int i) {
        Log.m105925i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i), Integer.valueOf(this.f62203d));
        Assert.assertTrue(str.length() > 0);
        f62199n = this.f62206g;
        this.f62206g = str;
        if (!C86013q1.m106450k(z2 ? str : C76552z.m92075m(str))) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (!z2) {
                str = C76552z.m92075m(str);
            }
            objArr[1] = str;
            Log.m105921e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", objArr);
            return false;
        }
        if (i == -1) {
            i = C76550x.m92054c(str, this.f62203d, z2);
        }
        if (i == 0) {
            Context context = this.f62201b;
            if (context != null) {
                this.f62200a = new C21320e0(context);
            } else {
                this.f62200a = new C21320e0();
            }
        } else if (i == 1) {
            Context context2 = this.f62201b;
            if (context2 != null) {
                this.f62200a = new C21329r(context2);
            } else {
                this.f62200a = new C21329r();
            }
        } else if (i == 2) {
            if (this.f62201b != null) {
                this.f62200a = new C21323o(this.f62201b);
            } else {
                this.f62200a = new C21323o();
            }
            this.f62200a.mo33333h(new C21968b());
        }
        if (this.f62200a != null) {
            Log.m105925i("MicroMsg.SceneVoicePlayer", "init player success %s", Integer.valueOf(hashCode()));
            this.f62210k.mo18025h0(this.f62200a);
        } else {
            Log.m105921e("MicroMsg.SceneVoicePlayer", "init player failed %s", Integer.valueOf(hashCode()));
        }
        this.f62210k.mo18024g0();
        this.f62210k.mo18026i0(z);
        if (C110248b.zx0() || C110248b.Jh0()) {
            Log.m105925i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", Boolean.valueOf(C110248b.zx0()), Boolean.valueOf(C110248b.Jh0()));
            this.f62210k.mo18026i0(false);
        }
        C16928a aVar = this.f62210k;
        aVar.mo107365b0(aVar.mo18022e0());
        C21972c cVar = new C21972c(this);
        C22086d dVar = this.f62200a;
        if (dVar != null) {
            dVar.mo33328d(cVar);
        }
        C21970b bVar = new C21970b(this);
        C22086d dVar2 = this.f62200a;
        if (dVar2 != null) {
            dVar2.mo33334i(bVar);
        }
        if (!z2) {
            str = this.f62203d == 0 ? C76552z.m92075m(str) : null;
        }
        this.f62210k.mo18027j0(str, 0);
        Log.m105925i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s", Boolean.valueOf(this.f62207h));
        return true;
    }

    /* renamed from: m */
    public void mo35069m() {
        mo35070n(false);
    }

    /* renamed from: n */
    public void mo35070n(boolean z) {
        C76996p.C76999e eVar;
        C22086d dVar = this.f62200a;
        if (dVar == null) {
            Log.m105921e("MicroMsg.SceneVoicePlayer", "stop player failed cause player is null %s", Integer.valueOf(hashCode()));
            return;
        }
        dVar.stop();
        this.f62200a.mo33328d((C22086d.C22087a) null);
        this.f62200a.mo33333h((C22086d.C22089c) null);
        Log.m105925i("MicroMsg.SceneVoicePlayer", "stop player abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s, abandonFocusOnStop: %s", Boolean.valueOf(this.f62207h), Boolean.FALSE, Boolean.valueOf(this.f62208i));
        C16928a aVar = this.f62210k;
        aVar.mo157511t();
        if (aVar.f45752p && aVar.f45751o) {
            C34767b.C34768c cVar = aVar.f45749m;
            if (cVar != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
            }
            aVar.f45749m = null;
            aVar.f45752p = false;
        }
        if (!z && (eVar = this.f62205f) != null) {
            ((AutoPlay) eVar).mo102008k();
        }
    }

    public C21967a(Context context, int i) {
        this.f62200a = null;
        this.f62201b = null;
        this.f62202c = false;
        this.f62203d = 0;
        this.f62206g = null;
        this.f62207h = true;
        this.f62208i = true;
        this.f62209j = new ArrayList();
        this.f62211l = null;
        this.f62201b = context instanceof Activity ? MMApplicationContext.getContext() : context;
        this.f62203d = i;
        this.f62210k = new C16928a(context, new C21969a());
    }
}
