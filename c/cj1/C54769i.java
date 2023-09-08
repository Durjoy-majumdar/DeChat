package cj1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.text.TextUtils;
import c50.C54655b;
import cl1.C0702z0;
import cl1.C54946b0;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d50.C58115i;
import di3.C86312j;
import dj1.C45403z0;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import j50.C60735a;
import k20.C9556a;
import o40.C61926c;
import ok1.C62042e;
import pt1.C35640b;
import rx3.C13598b0;
import rx3.C36570n;
import te3.C64481k21;
import te3.C64674r41;
import tf0.C13883o1;
import wk1.C78604f;
import y50.C53496k;
import z04.C112550d0;
import z04.C112551y;
import zp3.C79406f;

/* renamed from: cj1.i */
public final class C54769i {

    /* renamed from: a */
    public final C45795b f153503a;

    /* renamed from: b */
    public C56032b f153504b;

    /* renamed from: c */
    public int f153505c;

    /* renamed from: d */
    public String f153506d;

    /* renamed from: e */
    public String f153507e;

    /* renamed from: f */
    public int f153508f;

    /* renamed from: g */
    public String f153509g;

    /* renamed from: h */
    public int f153510h;

    /* renamed from: i */
    public String f153511i;

    /* renamed from: j */
    public String f153512j;

    /* renamed from: k */
    public int f153513k;

    /* renamed from: l */
    public final C32226l<Boolean, C13598b0> f153514l = new C54771b(this);

    /* renamed from: m */
    public MTimerHandler f153515m = new MTimerHandler("FinderLiveAnchorVerifyManager::Timer", (MTimerHandler.CallBack) new C54770a(this), true);

    /* renamed from: n */
    public final C78604f f153516n = new C78604f(C79406f.m96347a(MMApplicationContext.getContext(), 22.0f));

    /* renamed from: cj1.i$a */
    public static final class C54770a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C54769i f153517d;

        public C54770a(C54769i iVar) {
            this.f153517d = iVar;
        }

        public boolean onTimerExpired() {
            C54769i iVar = this.f153517d;
            int i = iVar.f153508f - 1;
            iVar.f153508f = i;
            if (i >= 0) {
                if (iVar.f153505c == 5) {
                    int i2 = iVar.f153510h;
                    if (i2 >= 0) {
                        C61926c.m72668M(new C54799p(iVar, i2, iVar.f153509g));
                        C54769i iVar2 = this.f153517d;
                        iVar2.f153510h--;
                    }
                    C54769i iVar3 = this.f153517d;
                    int i3 = iVar3.f153513k;
                    if (i3 > 0 && iVar3.f153508f <= i3) {
                        C61926c.m72668M(new C54802q(iVar3));
                    }
                } else {
                    C61926c.m72668M(new C54802q(iVar));
                }
                return true;
            }
            Log.m105924i("Finder.FinderLiveAnchorVerifyManager", "backupTimer onTimerExpired: currentVerifyMode:" + this.f153517d.f153505c + ", currentVerifyId:" + this.f153517d.f153506d);
            C54769i iVar4 = this.f153517d;
            int i4 = iVar4.f153505c;
            if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 5) {
                C54769i.m61633c(iVar4, false);
            }
            return false;
        }
    }

    /* renamed from: cj1.i$b */
    public static final class C54771b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54769i f153518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54771b(C54769i iVar) {
            super(1);
            this.f153518d = iVar;
        }

        public Object invoke(Object obj) {
            MTimerHandler mTimerHandler;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C54769i iVar = this.f153518d;
            if (!(iVar.f153505c == 2 || (mTimerHandler = iVar.f153515m) == null)) {
                mTimerHandler.stopTimer();
            }
            C54769i.m61633c(this.f153518d, booleanValue);
            return C13598b0.f38549a;
        }
    }

    public C54769i(C45795b bVar, C56032b bVar2) {
        C87412m.m108594g(bVar, "curLiveContext");
        this.f153503a = bVar;
        this.f153504b = bVar2;
    }

    /* renamed from: a */
    public static final void m61631a(C54769i iVar, int i) {
        MTimerHandler mTimerHandler = iVar.f153515m;
        boolean z = true;
        if (mTimerHandler == null || !mTimerHandler.stopped()) {
            z = false;
        }
        if (z) {
            iVar.f153508f = i;
            MTimerHandler mTimerHandler2 = iVar.f153515m;
            if (mTimerHandler2 != null) {
                mTimerHandler2.startTimer(1000);
            }
        } else if (i < iVar.f153508f) {
            iVar.f153508f = i;
        }
    }

    /* renamed from: b */
    public static final CharSequence m61632b(C54769i iVar, String str, int i) {
        iVar.getClass();
        if (str == null || i < 0) {
            return null;
        }
        int E = C112550d0.m153769E(str, "@", 0, false, 6, (Object) null);
        String valueOf = String.valueOf(i);
        SpannableString spannableString = new SpannableString(C112551y.m153814n(str, "@", valueOf, false));
        spannableString.setSpan(iVar.f153516n, E, valueOf.length() + E, 17);
        return spannableString;
    }

    /* renamed from: c */
    public static final void m61633c(C54769i iVar, boolean z) {
        C54769i iVar2 = iVar;
        boolean z2 = z;
        iVar.getClass();
        Class cls = C55001u.class;
        Log.m105924i("Finder.FinderLiveAnchorVerifyManager", "postVerifyRequest: success:" + z2 + ", currentVerifyMode:" + iVar2.f153505c + ", verification_id:" + iVar2.f153506d);
        int i = iVar2.f153505c;
        int i2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : z2 ? 32 : 33 : 23 : z2 ? 21 : 22 : z2 ? 11 : 12 : z2 ? 1 : 2;
        Activity activity = null;
        C54790m mVar = (i == 3 || i == 4) ? new C54790m(z2, iVar2) : null;
        long j = ((C55001u) iVar2.f153503a.mo71262a(cls)).f154420q.f182392d;
        long j2 = ((C55001u) iVar2.f153503a.mo71262a(cls)).f154416j;
        String str = iVar2.f153506d;
        if (str == null) {
            str = "";
        }
        new C45403z0(j, j2, i2, str, mVar).mo9225i();
        int i3 = iVar2.f153505c;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    C61926c.m72668M(new C54780k(iVar2));
                } else if (i3 == 4) {
                    C61926c.m72668M(new C54786l(iVar2));
                } else if (i3 == 5 && z2) {
                    C61926c.m72668M(new C54793n(iVar2));
                }
            } else if (z2) {
                Log.m105924i("Finder.FinderLiveAnchorVerifyManager", "gotoVerificationH5: verificationUrl:" + iVar2.f153507e);
                if (iVar2.f153507e != null) {
                    C56032b bVar = iVar2.f153504b;
                    Context context = bVar != null ? bVar.getContext() : null;
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                    }
                    if (activity != null) {
                        Intent intent = new Intent();
                        intent.putExtra("KEY_URL", iVar2.f153507e);
                        ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13256Hl(activity, intent);
                    }
                }
            } else {
                Context context2 = MMApplicationContext.getContext();
                C35640b bVar2 = C35640b.f95284a;
                Intent intent2 = new Intent(context2, (Class) ((C36570n) C35640b.f95288e).getValue());
                intent2.addFlags(872415232);
                Context context3 = MMApplicationContext.getContext();
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                Context context4 = context3;
                C117292a.m165358d(context4, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/model/FinderLiveAnchorVerifyManager", "postVerifyRequest", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(context4, "com/tencent/mm/plugin/finder/live/model/FinderLiveAnchorVerifyManager", "postVerifyRequest", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (z2) {
            C61926c.m72668M(new C54793n(iVar2));
        }
    }

    /* renamed from: d */
    public final void mo75675d(boolean z) {
        if (!z || !((C54946b0) this.f153503a.mo71262a(C54946b0.class)).f153983g) {
            String string = z ? MMApplicationContext.getContext().getResources().getString(C0966R.string.e1l) : MMApplicationContext.getContext().getResources().getString(C0966R.string.e1q);
            C87412m.m108593f(string, "if (isVerifying) {\n     …y_comment_tips)\n        }");
            int i = this.f153505c;
            if (i == 1 || i == 2 || i == 3 || i == 5) {
                C62042e eVar = C62042e.f176370a;
                C45795b bVar = this.f153503a;
                eVar.getClass();
                C87412m.m108594g(bVar, "liveData");
                C64674r41 r412 = new C64674r41();
                r412.f185127g = 10001;
                r412.f185126f = string;
                ((C0702z0) ((C54991o) bVar.mo71262a(C54991o.class)).business(C0702z0.class)).f1672f.add(new C0556j5(r412));
                C53496k.f150436a.mo74169b();
                if (z) {
                    FinderLiveService.f159376d.getClass();
                    C60735a aVar = FinderLiveService.f159378f;
                    if (aVar != null) {
                        aVar.mo85674O(2);
                        return;
                    }
                    return;
                }
                FinderLiveService.f159376d.getClass();
                C60735a aVar2 = FinderLiveService.f159378f;
                if (aVar2 != null) {
                    aVar2.mo85691j0(2);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo75676e(boolean z) {
        C64481k21 k212;
        C54655b b;
        C58115i iVar;
        Class cls = C54946b0.class;
        if (((C54991o) this.f153503a.mo71262a(C54991o.class)).mo75999e4() && (k212 = ((C54946b0) this.f153503a.mo71262a(cls)).f153982f) != null) {
            if (!TextUtils.equals(this.f153506d, k212.f183862f) || this.f153505c != k212.f183860d || z) {
                Log.m105924i("Finder.FinderLiveAnchorVerifyManager", "updateVerifyInfo: verify_mode:" + k212.f183860d + ", verification_id:" + k212.f183862f + ", remaining_seconds:" + k212.f183863g);
                this.f153505c = k212.f183860d;
                this.f153506d = k212.f183862f;
                this.f153507e = k212.f183864h;
                C61926c.m72668M(new C54803r(k212, this));
                boolean z2 = true;
                mo75675d(true);
                ((C54946b0) this.f153503a.mo71262a(cls)).f153983g = true;
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                C54655b b2 = finderLiveService.mo77626b();
                if (b2 == null || (iVar = b2.f172989A) == null || !iVar.f166263j) {
                    z2 = false;
                }
                if (!z2 && (b = finderLiveService.mo77626b()) != null) {
                    b.mo85689g0();
                    return;
                }
                return;
            }
            Log.m105924i("Finder.FinderLiveAnchorVerifyManager", "checkAnchorVerify: same id and mode, ignore. currentVerifyMode:" + this.f153505c + ", currentVerifyId:" + this.f153506d);
        }
    }

    /* renamed from: f */
    public final void mo75677f() {
        Log.m105924i("Finder.FinderLiveAnchorVerifyManager", "reset");
        this.f153505c = 0;
        this.f153506d = null;
        this.f153507e = null;
        this.f153508f = 0;
        this.f153509g = null;
        this.f153510h = 0;
        this.f153511i = null;
        this.f153512j = null;
        this.f153513k = 0;
        MTimerHandler mTimerHandler = this.f153515m;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
    }
}
