package com.tencent.p014mm.p136ui.chatting;

import a14.C53851a;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import dm3.C86350a;
import dm3.C86351b;
import e61.C86453a;
import e61.C86454b;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.concurrent.CancellationException;
import k20.C9556a;
import ke3.C88144b;
import ky3.C88334c;
import p1085qk.C101203e;
import p51.C110178c;
import p51.C110180d;
import p51.C110181e;
import p51.C110183f;
import p51.C110184g;
import p51.C110185h;
import p51.C110187i;
import p777zp.C112645b;
import r51.C110503b;
import rx3.C13598b0;
import s00.C90110f;
import uc0.C111152d;
import uc0.C111153e;
import uc0.C111154h;
import uc0.C90638g;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: com.tencent.mm.ui.chatting.j3 */
public class C106691j3 {

    /* renamed from: a */
    public Activity f318950a;

    /* renamed from: b */
    public ChattingAnimFrame f318951b = null;

    /* renamed from: c */
    public C86351b f318952c = null;

    /* renamed from: d */
    public boolean f318953d;

    /* renamed from: e */
    public String f318954e;

    /* renamed from: f */
    public C110187i f318955f;

    /* renamed from: g */
    public C110183f f318956g;

    /* renamed from: h */
    public C110180d f318957h;

    /* renamed from: i */
    public int f318958i = 0;

    /* renamed from: j */
    public C86350a f318959j = new C85821a();

    /* renamed from: k */
    public C90638g f318960k;

    /* renamed from: l */
    public C101203e f318961l;

    /* renamed from: m */
    public C111153e f318962m;

    /* renamed from: n */
    public String f318963n;

    /* renamed from: o */
    public long f318964o;

    /* renamed from: p */
    public C110503b f318965p;

    /* renamed from: q */
    public C86454b f318966q;

    /* renamed from: r */
    public boolean f318967r = false;

    /* renamed from: com.tencent.mm.ui.chatting.j3$a */
    public class C85821a implements C86350a {
        public C85821a() {
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.j3$b */
    public class C106692b implements C32226l<C110503b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111153e f318968d;

        public C106692b(C111153e eVar) {
            this.f318968d = eVar;
        }

        public Object invoke(Object obj) {
            C110503b bVar = (C110503b) obj;
            C111153e eVar = this.f318968d;
            if (eVar.f332885o.f332915x == null && eVar.f332890t != 1) {
                return null;
            }
            C106691j3.m144078b(C106691j3.this, eVar, bVar);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.j3$c */
    public class C106693c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C111153e f318970d;

        public C106693c(C111153e eVar) {
            this.f318970d = eVar;
        }

        public void run() {
            C106691j3.m144078b(C106691j3.this, this.f318970d, (C110503b) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.j3$d */
    public class C106694d implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111153e f318972d;

        public C106694d(C111153e eVar) {
            this.f318972d = eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            String str = (String) obj2;
            Log.m105925i("MicroMsg.EggMgr", "show %s, %s", bool, str);
            if (!bool.booleanValue() || Util.isNullOrNil(str)) {
                return null;
            }
            ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
            C110503b bVar = new C110503b();
            bVar.f330433f = str;
            C111153e eVar = this.f318972d;
            if (eVar.f332889s.f332897e == null) {
                return null;
            }
            C106691j3.m144078b(C106691j3.this, eVar, bVar);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.j3$e */
    public class C106695e implements C32227p<Boolean, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C111153e f318974d;

        public C106695e(C111153e eVar) {
            this.f318974d = eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            String str = (String) obj2;
            Log.m105925i("MicroMsg.EggMgr", "show %s, data:%s", bool, str);
            if (bool.booleanValue() && !Util.isNullOrNil(str)) {
                C106691j3.m144078b(C106691j3.this, this.f318974d, (C110503b) null);
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m144077a(C106691j3 j3Var, C110503b bVar, C111153e eVar, Activity activity, boolean z) {
        j3Var.getClass();
        if (eVar != null) {
            int i = eVar.f332887q;
            if (i == 3) {
                if (bVar != null) {
                    String str = bVar.f330428a;
                    String str2 = bVar.f330430c;
                    String str3 = bVar.f330429b;
                    int i2 = SpringLuckyEggActivity.f312420n;
                    C87412m.m108594g(activity, "context");
                    C87412m.m108594g(str, "keyword");
                    Intent intent = new Intent(activity, SpringLuckyEggActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("keyword", str);
                    bundle.putString("trace_id", str3);
                    bundle.putString("app_id", str2);
                    bundle.putString("egg_name", eVar.f332878e);
                    bundle.putString("background", eVar.f332885o.f332905n);
                    bundle.putBoolean("is_chat_room", z);
                    intent.putExtras(bundle);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/ui/chatting/EggMgr", "onLuckyClick", "(Lcom/tencent/mm/plugin/eggspring/model/LuckyBagInfo;Lcom/tencent/mm/modelpackage/EggInfo;Landroid/app/Activity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(activity, "com/tencent/mm/ui/chatting/EggMgr", "onLuckyClick", "(Lcom/tencent/mm/plugin/eggspring/model/LuckyBagInfo;Lcom/tencent/mm/modelpackage/EggInfo;Landroid/app/Activity;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (i == 2) {
                C111152d dVar = eVar.f332888r;
                if (dVar != null && !Util.isNullOrNil(dVar.f332875f)) {
                    String str4 = eVar.f332888r.f332875f;
                    Intent intent2 = new Intent();
                    intent2.putExtra("rawUrl", str4);
                    intent2.putExtra("from_shortcut", true);
                    intent2.putExtra("disable_minimize", true);
                    intent2.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
                    intent2.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
                    C88144b.m109795m(activity, "webview", ".ui.tools.WebViewUI", intent2, 3001);
                    activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                }
            } else if (i == 4) {
                if (bVar != null && !Util.isNullOrNil(bVar.f330433f)) {
                    String str5 = bVar.f330433f;
                    Intent intent3 = new Intent();
                    intent3.putExtra("rawUrl", str5);
                    intent3.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2333y);
                    intent3.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
                    C88144b.m109795m(activity, "webview", ".ui.tools.WebViewUI", intent3, 3001);
                    activity.overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2333y);
                }
            } else if (i == 5) {
                C111154h hVar = eVar.f332892v;
                String str6 = hVar.f332895e;
                Activity activity2 = activity;
                ((C112645b) C86312j.m106911c(C112645b.class)).mo164199Ob(activity2, hVar.f332894d, str6, 1189, j3Var.f318957h.f329609f);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if ((r10.f318854R != null && (r10.f318861f > 0 || r10.f318853Q)) == false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m144078b(com.tencent.p014mm.p136ui.chatting.C106691j3 r9, uc0.C111153e r10, r51.C110503b r11) {
        /*
            r9.getClass()
            java.lang.String r0 = "MicroMsg.EggMgr"
            java.lang.String r1 = "playLuckyEffect: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            int r10 = r10.f332890t
            r1 = 1
            r2 = 3
            if (r10 != r1) goto L_0x0026
            r9.f318965p = r11
            p51.g r10 = p51.C110184g.f329618a
            java.lang.String r11 = p51.C110184g.f329625h
            r10.mo161587a(r2, r11)
            e61.b r4 = r9.f318966q
            r5 = 1
            java.lang.String r6 = r9.f318963n
            long r7 = r9.f318964o
            r3 = r9
            r3.mo153652f(r4, r5, r6, r7)
            goto L_0x0091
        L_0x0026:
            uc0.e r10 = r9.f318962m
            if (r10 != 0) goto L_0x002b
            goto L_0x0048
        L_0x002b:
            int r10 = r10.f332887q
            if (r10 > 0) goto L_0x0030
            goto L_0x0048
        L_0x0030:
            boolean r10 = r9.f318967r
            r3 = 0
            if (r10 != 0) goto L_0x0049
            com.tencent.mm.ui.chatting.ChattingAnimFrame r10 = r9.f318951b
            uc0.e r4 = r10.f318854R
            if (r4 == 0) goto L_0x0045
            int r4 = r10.f318861f
            if (r4 > 0) goto L_0x0043
            boolean r10 = r10.f318853Q
            if (r10 == 0) goto L_0x0045
        L_0x0043:
            r10 = 1
            goto L_0x0046
        L_0x0045:
            r10 = 0
        L_0x0046:
            if (r10 != 0) goto L_0x0049
        L_0x0048:
            r3 = 1
        L_0x0049:
            if (r3 == 0) goto L_0x0051
            java.lang.String r9 = "lucky anim is not playing, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r9)
            goto L_0x0091
        L_0x0051:
            r9.f318965p = r11
            com.tencent.mm.ui.chatting.ChattingAnimFrame r10 = r9.f318951b
            r10.mo153605b()
            com.tencent.mm.ui.chatting.ChattingAnimFrame r9 = r9.f318951b
            r9.getClass()
            java.lang.String r10 = "MicroMsg.ChattingAnimFrame"
            java.lang.String r0 = "showLuckyBag: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
            com.tencent.mm.plugin.gif.MMAnimateView r0 = r9.f318873u
            if (r0 == 0) goto L_0x0091
            android.animation.ValueAnimator r0 = r9.f318850M
            if (r0 == 0) goto L_0x0091
            boolean r0 = r9.f318853Q
            if (r0 != 0) goto L_0x0091
            p51.g r0 = p51.C110184g.f329618a
            java.lang.String r3 = p51.C110184g.f329625h
            r0.mo161587a(r2, r3)
            r9.f318853Q = r1
            r9.f318855S = r11
            android.widget.FrameLayout r11 = r9.f318859d
            com.tencent.mm.plugin.gif.MMAnimateView r0 = r9.f318873u
            r11.addView(r0)
            java.lang.String r11 = "lucky bag start anim!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            android.animation.ValueAnimator r10 = r9.f318850M
            r10.start()
            com.tencent.mm.plugin.gif.MMAnimateView r9 = r9.f318873u
            r9.mo129236w()
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C106691j3.m144078b(com.tencent.mm.ui.chatting.j3, uc0.e, r51.b):void");
    }

    /* renamed from: d */
    public static boolean m144079d(C111153e eVar) {
        if (eVar == null) {
            return false;
        }
        int i = eVar.f332887q;
        return i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
    }

    /* renamed from: e */
    public static boolean m144080e(C111153e eVar, C111153e eVar2) {
        return eVar != null && eVar2 != null && Util.isEqual(eVar.f332878e, eVar2.f332878e) && Util.isEqual(eVar.f332891u, eVar2.f332891u);
    }

    /* renamed from: c */
    public final void mo153651c(C111153e eVar, String str) {
        int i;
        boolean z = true;
        if (eVar == null || Util.isNullOrNil(str)) {
            Object[] objArr = new Object[1];
            if (eVar == null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105921e("MicroMsg.EggMgr", "egg info or keyWord err!!! info != null:[%s].", objArr);
            return;
        }
        C110184g.f329618a.mo161587a(2, C110184g.f329625h);
        if (m144079d(eVar)) {
            int i2 = eVar.f332887q;
            if (i2 == 3) {
                if (this.f318955f == null) {
                    this.f318955f = new C110187i();
                }
                C110187i iVar = this.f318955f;
                iVar.f329637e = new C106692b(eVar);
                String str2 = eVar.f332885o.f332898d;
                C87412m.m108594g(str, "keyword");
                Log.m105924i("MicroMsg.SpringLuckyEggHelper", "start check egg: appId=" + str2 + ", keyword=" + str);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = iVar.f329635c;
                if (j > 0 && (i = iVar.f329636d) > 0) {
                    long j2 = elapsedRealtime - j;
                    if (j2 < ((long) (i * 1000))) {
                        Log.m105928w("MicroMsg.SpringLuckyEggHelper", "The check is too frequent, interval=" + iVar.f329636d + ", delta=" + j2);
                        return;
                    }
                }
                iVar.f329635c = elapsedRealtime;
                C53973z1 z1Var = iVar.f329634b;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                iVar.f329634b = C53895h.m60466d(iVar.f329633a, (C66212f) null, (C53934p0) null, new C110185h(iVar, str, str2, (C15601d<? super C110185h>) null), 3, (Object) null);
            } else if (i2 == 2) {
                Log.m105925i("MicroMsg.EggMgr", "initLuckyBagOrNot: game lucky egg %s", eVar.f332888r.f332873d);
                ChattingAnimFrame chattingAnimFrame = this.f318951b;
                if (chattingAnimFrame != null) {
                    chattingAnimFrame.post(new C106693c(eVar));
                    ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
                }
            } else if (i2 == 4) {
                if (this.f318956g == null) {
                    this.f318956g = new C110183f();
                }
                C110183f fVar = this.f318956g;
                fVar.f329617e = new C106694d(eVar);
                Log.m105924i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: ");
                long currentTicks = Util.currentTicks();
                if (Util.ticksToNow(fVar.f329615c) <= ((long) fVar.f329616d)) {
                    Log.m105928w("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: " + fVar.f329615c + ", " + fVar.f329616d + ", " + currentTicks);
                    return;
                }
                int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_egg_red_envelope_percent, 100);
                int g = C88334c.f255322d.mo122718g(100);
                Log.m105924i("MicroMsg.EggRedEnvelopeHelper", "checkShowEgg: percent " + Qe + ", " + g);
                if (g < Qe) {
                    fVar.f329615c = currentTicks;
                    C53973z1 z1Var2 = fVar.f329614b;
                    if (z1Var2 != null) {
                        C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
                    }
                    fVar.f329614b = C53895h.m60466d(fVar.f329613a, (C66212f) null, (C53934p0) null, new C110181e(fVar, (C15601d<? super C110181e>) null), 3, (Object) null);
                }
            } else if (i2 == 5) {
                if (this.f318957h == null) {
                    this.f318957h = new C110180d();
                }
                C110180d dVar = this.f318957h;
                dVar.f329608e = new C106695e(eVar);
                Long l = C110184g.f329622e;
                Log.m105924i("MicroMsg.EggMiniAppHelper", "checkShowEgg: " + l);
                long currentTicks2 = Util.currentTicks();
                if (Util.ticksToNow(dVar.f329606c) <= ((long) dVar.f329607d)) {
                    Log.m105928w("MicroMsg.EggMiniAppHelper", "checkShowEgg: " + dVar.f329606c + ", " + dVar.f329607d + ", " + currentTicks2);
                } else if (((C112645b) C86312j.m106911c(C112645b.class)).mo164200XE()) {
                    dVar.f329606c = currentTicks2;
                    C53973z1 z1Var3 = dVar.f329605b;
                    if (z1Var3 != null) {
                        C53973z1.C53974a.m60623a(z1Var3, (CancellationException) null, 1, (Object) null);
                    }
                    dVar.f329605b = C53895h.m60466d(dVar.f329604a, (C66212f) null, (C53934p0) null, new C110178c(dVar, l, (C15601d<? super C110178c>) null), 3, (Object) null);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo153652f(C86454b bVar, boolean z, String str, long j) {
        if (bVar == null) {
            Log.m105928w("MicroMsg.EggMgr", "meta is null");
            return;
        }
        Log.m105925i("MicroMsg.EggMgr", "playMagicEgg: %s, %s, %s, %s, %s", bVar.f251247a, bVar.f251248b, Boolean.valueOf(z), str, Long.valueOf(j));
        if (str == null) {
            str = "";
        }
        C86453a aVar = new C86453a(str, j);
        C86351b bVar2 = this.f318952c;
        if (bVar2 != null) {
            if (z) {
                C86453a aVar2 = C86453a.f251243c;
                aVar = C86453a.f251243c;
            }
            bVar2.getClass();
            C87412m.m108594g(aVar, "ext");
            if (!C87412m.m108589b(bVar2.f251060f, C86454b.f251246d) && !C87412m.m108589b(bVar2.f251060f, bVar)) {
                Log.m105928w("MicroMsg.MEChattingMgr", "[ME]: markMagicEgg trying to override eggMeta");
                bVar2.mo120734h0(bVar2.f251060f, 2);
            }
            if (!C87412m.m108589b(bVar2.f251060f, bVar)) {
                bVar2.mo120735i0();
                bVar2.f251060f = bVar;
            }
            Log.m105924i("MicroMsg.MEChattingMgr", "[ME]: markMagicEgg: " + bVar + ' ' + z + ' ' + aVar);
            if (!bVar2.f251062h.isEmpty()) {
                bVar2.f251062h.add(new C86351b.C86353b(System.currentTimeMillis(), z, aVar));
            } else if (z) {
                bVar2.mo120737k0(bVar2.f251060f, true, aVar);
            } else if (bVar2.f251057c.invoke(Long.valueOf(aVar.f251245b)).booleanValue()) {
                bVar2.mo120737k0(bVar2.f251060f, false, aVar);
            } else {
                bVar2.f251062h.add(new C86351b.C86353b(System.currentTimeMillis(), z, aVar));
            }
        }
    }

    /* renamed from: g */
    public void mo153653g() {
        ChattingAnimFrame chattingAnimFrame = this.f318951b;
        if (chattingAnimFrame != null) {
            chattingAnimFrame.mo153608e();
        }
        C110187i iVar = this.f318955f;
        if (iVar != null) {
            iVar.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("dispose: job is running: ");
            C53973z1 z1Var = iVar.f329634b;
            sb.append(z1Var != null ? Boolean.valueOf(((C53851a) z1Var).mo74466a()) : null);
            Log.m105924i("MicroMsg.SpringLuckyEggHelper", sb.toString());
            C53973z1 z1Var2 = iVar.f329634b;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
            iVar.f329634b = null;
        }
        C110183f fVar = this.f318956g;
        if (fVar != null) {
            fVar.getClass();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("dispose: ");
            C53973z1 z1Var3 = fVar.f329614b;
            sb4.append(z1Var3 != null ? Boolean.valueOf(((C53851a) z1Var3).mo74466a()) : null);
            Log.m105924i("MicroMsg.EggRedEnvelopeHelper", sb4.toString());
            C53973z1 z1Var4 = fVar.f329614b;
            if (z1Var4 != null) {
                C53973z1.C53974a.m60623a(z1Var4, (CancellationException) null, 1, (Object) null);
            }
            fVar.f329614b = null;
            fVar.f329617e = null;
        }
        this.f318967r = false;
        this.f318963n = "";
        this.f318964o = 0;
        Log.m105925i("MicroMsg.EggMgr", "egg has been stop, %s", this.f318951b);
    }
}
