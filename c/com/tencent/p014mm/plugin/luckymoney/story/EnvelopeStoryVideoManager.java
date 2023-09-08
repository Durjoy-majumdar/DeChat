package com.tencent.p014mm.plugin.luckymoney.story;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcdntran.C92755e0;
import com.tencent.p014mm.modelvideo.C55394a;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import h81.C32735h;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p1081gi.C98127h;
import p206nj.C100115c;
import p663qo.C101213l;
import p682rz.C101487r;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager */
public class EnvelopeStoryVideoManager implements C0124r {

    /* renamed from: j */
    public static Set<String> f272049j = new HashSet();

    /* renamed from: d */
    public MMActivity f272050d;

    /* renamed from: e */
    public int f272051e = -1;

    /* renamed from: f */
    public boolean f272052f = false;

    /* renamed from: g */
    public C100115c f272053g = new C100115c(MMApplicationContext.getContext());

    /* renamed from: h */
    public boolean f272054h = false;

    /* renamed from: i */
    public Map<Integer, C94180e> f272055i = new HashMap();

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$a */
    public class C69306a implements C98124g.C98125a {

        /* renamed from: d */
        public final /* synthetic */ String f199573d;

        public C69306a(String str) {
            this.f199573d = str;
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "task callback: %s", Integer.valueOf(i));
            if (i != 0) {
                C86013q1.m106447h(this.f199573d);
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return new byte[0];
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$b */
    public class C69307b implements C98124g.C98126b {

        /* renamed from: d */
        public final /* synthetic */ String f199574d;

        /* renamed from: e */
        public final /* synthetic */ long f199575e;

        public C69307b(String str, long j) {
            this.f199574d = str;
            this.f199575e = j;
        }

        /* renamed from: b */
        public void mo31987b(String str, C98121d dVar) {
            Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "preload complete: %s %s", str, Integer.valueOf(dVar.field_retCode));
            ((HashSet) EnvelopeStoryVideoManager.f272049j).remove(str);
            C115669n.INSTANCE.mo160131h(19228, this.f199574d, 0, 4, 0, 0, 0, Long.valueOf((SystemClock.elapsedRealtime() - this.f199575e) / 1000), 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$c */
    public static class C94175c implements C98127h.C98128a {

        /* renamed from: d */
        public WeakReference<C94180e> f272056d;

        /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$c$a */
        public class C94176a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C94180e f272057d;

            /* renamed from: e */
            public final /* synthetic */ String f272058e;

            /* renamed from: f */
            public final /* synthetic */ long f272059f;

            /* renamed from: g */
            public final /* synthetic */ long f272060g;

            /* renamed from: h */
            public final /* synthetic */ CdnLogic.VideoInfo f272061h;

            public C94176a(C94175c cVar, C94180e eVar, String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
                this.f272057d = eVar;
                this.f272058e = str;
                this.f272059f = j;
                this.f272060g = j2;
                this.f272061h = videoInfo;
            }

            public void run() {
                this.f272057d.f272081m.mo76639l(this.f272058e, this.f272059f, this.f272060g, this.f272061h.svrFlag);
            }
        }

        public C94175c(C94180e eVar) {
            this.f272056d = new WeakReference<>(eVar);
        }

        /* renamed from: e */
        public void mo17917e(String str, long j, long j2) {
            C94180e eVar = this.f272056d.get();
            if (eVar != null) {
                eVar.f272081m.mo76638e(str, j, j2);
            }
        }

        /* renamed from: g */
        public void mo17918g(String str, int i, C98121d dVar) {
            if (dVar != null && dVar.field_retCode == 0) {
                Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "download finish: %s", str);
                EnvelopeStoryVideoManager.m119068b().putInt(str, 1).commit();
            }
            C94180e eVar = this.f272056d.get();
            if (eVar != null) {
                eVar.f272081m.mo76640m(str, i);
            }
        }

        public void onDataAvailable(String str, long j, long j2) {
            C94180e eVar = this.f272056d.get();
            if (eVar != null) {
                eVar.f272081m.onDataAvailable(str, j, j2);
            }
        }

        public void onM3U8Ready(String str, String str2) {
        }

        public void onMoovReady(String str, long j, long j2, CdnLogic.VideoInfo videoInfo) {
            C94180e eVar = this.f272056d.get();
            if (eVar != null) {
                MMHandlerThread.postToMainThread(new C94176a(this, eVar, str, j, j2, videoInfo));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$d */
    public static class C94177d implements C55394a {

        /* renamed from: d */
        public WeakReference<C94180e> f272062d;

        /* renamed from: e */
        public WeakReference<EnvelopeStoryVideoManager> f272063e;

        /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$d$a */
        public class C94178a implements C98124g.C98125a {

            /* renamed from: d */
            public final /* synthetic */ String f272064d;

            /* renamed from: e */
            public final /* synthetic */ String f272065e;

            /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$d$a$a */
            public class C94179a extends C7089c0 {

                /* renamed from: g */
                public final /* synthetic */ C94180e f272067g;

                public C94179a(C94180e eVar) {
                    this.f272067g = eVar;
                }

                /* renamed from: a */
                public void mo2066a(View view) {
                    Log.m105924i("MicroMsg.EnvelopeStoryVideoManager", "click retry btn");
                    this.f272067g.f272070b = UUID.randomUUID().toString();
                    C94180e eVar = this.f272067g;
                    eVar.f272081m.setSessionId(eVar.f272070b);
                    this.f272067g.f272081m.setLocal(false);
                    EnvelopeStoryVideoManager envelopeStoryVideoManager = C94177d.this.f272063e.get();
                    if (envelopeStoryVideoManager != null) {
                        C94180e eVar2 = this.f272067g;
                        Set<String> set = EnvelopeStoryVideoManager.f272049j;
                        envelopeStoryVideoManager.mo129405d(eVar2);
                    }
                }
            }

            public C94178a(String str, String str2) {
                this.f272064d = str;
                this.f272065e = str2;
            }

            /* renamed from: g0 */
            public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
                Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "cdn callback: %s, %s", str, Integer.valueOf(i));
                if (i != 0) {
                    C86013q1.m106447h(this.f272064d);
                    C94180e eVar = C94177d.this.f272062d.get();
                    if (eVar != null && eVar.f272069a.equals(str)) {
                        Log.m105929w("MicroMsg.EnvelopeStoryVideoManager", "download video fail: %s", this.f272065e);
                        eVar.f272086r.setVisibility(0);
                        eVar.f272086r.setOnClickListener(new C94179a(eVar));
                        C115669n.INSTANCE.mo160131h(19228, eVar.f272071c, Integer.valueOf(eVar.f272081m.getVideoDurationSec()), 2, Integer.valueOf(eVar.f272077i), Integer.valueOf(eVar.f272081m.getRealPlayDurationSec()), Integer.valueOf(eVar.f272076h), 0, -9999);
                    }
                }
                return 0;
            }

            /* renamed from: h */
            public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            }

            /* renamed from: j */
            public byte[] mo1775j(String str, byte[] bArr) {
                return new byte[0];
            }
        }

        public C94177d(C94180e eVar, EnvelopeStoryVideoManager envelopeStoryVideoManager) {
            this.f272062d = new WeakReference<>(eVar);
            this.f272063e = new WeakReference<>(envelopeStoryVideoManager);
        }

        /* renamed from: a */
        public void mo36227a(String str) {
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126984h(str, (Object[]) null);
        }

        /* renamed from: b */
        public void mo36228b(C55394a.C55395a aVar) {
        }

        /* renamed from: c */
        public boolean mo36229c(String str, int i, int i2) {
            return ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126989m(str, i, i2);
        }

        /* renamed from: d */
        public void mo36230d(String str, int i, int i2) {
            Log.m105919d("MicroMsg.EnvelopeStoryVideoManager", "request video data: %s", str);
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126990n(str, i, i2, 0);
        }

        /* renamed from: f */
        public void mo36231f(String str, String str2, String str3) {
            C94180e eVar = this.f272062d.get();
            if (eVar != null) {
                String str4 = str;
                String str5 = str2;
                String str6 = str3;
                EnvelopeStoryVideoManager.m119070f(str4, str5, str6, (String) null, false, new C94178a(str2, str3), new C94175c(eVar));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager$e */
    public static class C94180e {

        /* renamed from: a */
        public String f272069a;

        /* renamed from: b */
        public String f272070b;

        /* renamed from: c */
        public String f272071c;

        /* renamed from: d */
        public boolean f272072d;

        /* renamed from: e */
        public boolean f272073e = false;

        /* renamed from: f */
        public boolean f272074f = false;

        /* renamed from: g */
        public int f272075g = 0;

        /* renamed from: h */
        public int f272076h = 0;

        /* renamed from: i */
        public int f272077i;

        /* renamed from: j */
        public long f272078j;

        /* renamed from: k */
        public long f272079k;

        /* renamed from: l */
        public AtomicInteger f272080l = new AtomicInteger(1);

        /* renamed from: m */
        public EnvelopeStoryVideoView f272081m;

        /* renamed from: n */
        public ViewGroup f272082n;

        /* renamed from: o */
        public ImageView f272083o;

        /* renamed from: p */
        public ImageView f272084p;

        /* renamed from: q */
        public ImageView f272085q;

        /* renamed from: r */
        public ViewGroup f272086r;

        /* renamed from: s */
        public ProgressBar f272087s;

        /* renamed from: t */
        public ViewGroup f272088t;
    }

    /* renamed from: a */
    public static String m119067a(String str) {
        return EnvelopeStoryVideoView.f272089m1 + "MMVideo_" + str.hashCode() + ".mp4";
    }

    /* renamed from: b */
    public static MultiProcessMMKV m119068b() {
        return MultiProcessMMKV.getMMKV(MMApplicationContext.getPackageName() + "_luckymoney_story_video");
    }

    /* renamed from: c */
    public static boolean m119069c(int i, String str) {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_lucky_money_envelope_load_local_video_res_config, true);
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "[static luckymoney resource switch] canGetLuckyMoneyEnvelopeLocalVideoRes ：%s", Boolean.valueOf(wf));
        boolean z = i > 0 && !Util.isNullOrNil(str) && C86013q1.m106450k(str) && wf;
        if (z) {
            Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "[static luckymoney resource] use local：LuckyMoneyEnvelopeLocalVideoRes：%s", Integer.valueOf(i));
        } else {
            Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "[static luckymoney resource] use net: LuckyMoneyEnvelopeLocalVideoRes:%s", Integer.valueOf(i));
        }
        return z;
    }

    /* renamed from: f */
    public static void m119070f(String str, String str2, String str3, String str4, boolean z, C98124g.C98125a aVar, C98127h.C98128a aVar2) {
        boolean z2;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        C98124g.C98125a aVar3 = aVar;
        Class cls = C101213l.class;
        int i = 2;
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "trigger download video: %s, %s, %s", str5, str6, str7);
        if (z) {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_close_redenv_story_video_preload_config, 1) == 0) {
                Log.m105924i("MicroMsg.EnvelopeStoryVideoManager", "can not preload video");
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                return;
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C98127h hVar = new C98127h();
        hVar.f287660d = "task_EnvelopeStoryVideoManager";
        hVar.field_mediaId = str5;
        hVar.field_fileId = str5;
        hVar.f287705p0 = str7;
        if (!z) {
            i = 1;
        }
        hVar.f287689V = i;
        hVar.field_preloadRatio = 20;
        hVar.f287656M = new C69307b(str7, elapsedRealtime);
        if (aVar3 != null) {
            hVar.f287662f = aVar3;
        } else {
            hVar.f287662f = new C69306a(str2);
        }
        hVar.f287655L = 3;
        hVar.field_fullpath = str6;
        hVar.field_filemd5 = str4;
        hVar.f287678y = true;
        hVar.f287704f1 = aVar2;
        hVar.field_fileType = 4;
        hVar.field_requestVideoFormat = 1;
        hVar.f287654K = i;
        if (!z) {
            if (((HashSet) f272049j).contains(str)) {
                Log.m105924i("MicroMsg.EnvelopeStoryVideoManager", "need cancel preload task");
                ((C101213l) C86312j.m106911c(cls)).Gm0(str);
            }
            ((C92755e0) ((C101487r) C86312j.m106911c(C101487r.class)).mo140795W6()).mo126982f(hVar);
        } else if (((HashSet) f272049j).contains(str)) {
            Log.m105929w("MicroMsg.EnvelopeStoryVideoManager", "contains preload task: %s", str5);
        } else {
            ((HashSet) f272049j).add(str);
            ((C101213l) C86312j.m106911c(cls)).xf0(hVar);
        }
    }

    /* renamed from: d */
    public final void mo129405d(C94180e eVar) {
        if (!eVar.f272072d) {
            boolean k = C86013q1.m106450k(m119067a(eVar.f272071c));
            boolean z = false;
            boolean z2 = m119068b().getInt(eVar.f272069a, 0) == 1;
            Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "can play local: %s, %s", Boolean.valueOf(k), Boolean.valueOf(z2));
            if (!k || !z2) {
                if (k) {
                    eVar.f272077i = 3;
                } else {
                    eVar.f272077i = 2;
                }
                m119068b().putInt(eVar.f272069a, 0);
            } else {
                eVar.f272077i = 1;
                z = true;
            }
            if (z) {
                eVar.f272081m.setLocal(true);
            }
        }
        eVar.f272083o.bringToFront();
        eVar.f272081m.start();
        eVar.f272078j = 0;
        eVar.f272079k = 0;
        eVar.f272080l.set(1);
        if (!this.f272054h) {
            this.f272053g.mo139415b();
            this.f272054h = true;
        }
        eVar.f272073e = true;
        C69315e0.f199594d++;
        ((HashSet) C69315e0.f199593c).add(eVar.f272071c);
    }

    /* renamed from: e */
    public void mo129406e() {
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "release video view: %s, %s", Integer.valueOf(((HashMap) this.f272055i).size()), Util.getStack());
        if (this.f272054h) {
            this.f272053g.mo139414a();
            this.f272054h = false;
        }
        for (Map.Entry entry : ((HashMap) this.f272055i).entrySet()) {
            Log.m105918d("MicroMsg.EnvelopeStoryVideoManager", "do stop");
            C94180e eVar = (C94180e) entry.getValue();
            if (eVar.f272075g > 0) {
                eVar.f272076h = (int) (((long) eVar.f272076h) + ((SystemClock.elapsedRealtime() / 1000) - ((long) eVar.f272075g)));
            }
            C115669n.INSTANCE.mo160131h(19228, eVar.f272071c, Integer.valueOf(eVar.f272081m.getVideoDurationSec()), 1, Integer.valueOf(eVar.f272077i), Integer.valueOf(eVar.f272081m.getRealPlayDurationSec()), Integer.valueOf(eVar.f272076h), 0, 0);
            if (((C94180e) entry.getValue()).f272081m.getParent() != null) {
                ((ViewGroup) ((C94180e) entry.getValue()).f272081m.getParent()).removeView(((C94180e) entry.getValue()).f272081m);
                eVar.f272081m.stop();
            }
        }
        ((HashMap) this.f272055i).clear();
        this.f272051e = -1;
    }

    /* renamed from: g */
    public void mo129407g(Context context, FrameLayout frameLayout, ImageView imageView, ProgressBar progressBar, String str, String str2, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        Context context2 = context;
        FrameLayout frameLayout2 = frameLayout;
        String str3 = str;
        int i4 = i3;
        boolean z4 = z3;
        Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "update position: %s, %s, %s, %s", Integer.valueOf(this.f272051e), Integer.valueOf(i3), Boolean.valueOf(z3), str3);
        C94180e eVar = (C94180e) ((HashMap) this.f272055i).get(Integer.valueOf(i3));
        if (eVar != null) {
            eVar.f272074f = z4;
            mo129409i(eVar);
            mo129408h(eVar);
        }
        int i5 = this.f272051e;
        if (i4 != i5) {
            C94180e eVar2 = (C94180e) ((HashMap) this.f272055i).get(Integer.valueOf(i5));
            if (eVar2 != null) {
                Log.m105924i("MicroMsg.EnvelopeStoryVideoManager", "pause previous video");
                if (eVar2.f272073e) {
                    eVar2.f272079k = (long) eVar2.f272081m.getCurrPosSec();
                    eVar2.f272081m.mo79614b();
                }
            }
            this.f272051e = i4;
            if (z) {
                Log.m105925i("MicroMsg.EnvelopeStoryVideoManager", "preapre video view: %s", Boolean.valueOf(z2));
                C94180e eVar3 = (C94180e) ((HashMap) this.f272055i).get(Integer.valueOf(i3));
                if (eVar3 == null || eVar3.f272081m == null) {
                    C94180e eVar4 = new C94180e();
                    EnvelopeStoryVideoView envelopeStoryVideoView = new EnvelopeStoryVideoView(context);
                    eVar4.f272081m = envelopeStoryVideoView;
                    envelopeStoryVideoView.setContentDescription(context.getString(C0966R.string.gfd));
                    eVar4.f272071c = str3;
                    eVar4.f272070b = UUID.randomUUID().toString();
                    eVar4.f272083o = imageView;
                    eVar4.f272087s = progressBar;
                    eVar4.f272072d = z2;
                    eVar4.f272074f = z4;
                    eVar4.f272082n = (ViewGroup) frameLayout.findViewById(C0966R.C0970id.gjr);
                    eVar4.f272084p = (ImageView) frameLayout.findViewById(C0966R.C0970id.gjs);
                    eVar4.f272085q = (ImageView) frameLayout.findViewById(C0966R.C0970id.gdy);
                    eVar4.f272086r = (ViewGroup) frameLayout.findViewById(C0966R.C0970id.gdw);
                    eVar4.f272088t = frameLayout2;
                    eVar4.f272081m.setIsShowBasicControls(false);
                    EnvelopeStoryVideoView envelopeStoryVideoView2 = eVar4.f272081m;
                    envelopeStoryVideoView2.f272094k1 = new C94185y(this, eVar4);
                    envelopeStoryVideoView2.setIMMVideoViewCallback(new C94186z(this, eVar4));
                    eVar4.f272084p.setOnClickListener(new C94182a0(this, eVar4));
                    eVar4.f272082n.setOnClickListener(new C94183b0(this, eVar4));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
                    layoutParams.gravity = 17;
                    frameLayout.addView(eVar4.f272081m, 0, layoutParams);
                    eVar4.f272082n.setLayoutParams(layoutParams);
                    ((HashMap) this.f272055i).put(Integer.valueOf(i3), eVar4);
                    MMHandlerThread.postToMainThread(new C69331w(this, eVar4));
                    eVar4.f272081m.setSessionId(eVar4.f272070b);
                    eVar4.f272081m.setIOnlineVideoProxy(new C94177d(eVar4, this));
                    eVar4.f272081m.setLocalPreDownloadVideo(eVar4.f272072d);
                    eVar4.f272081m.mo76636h(false, eVar4.f272071c, 0);
                    eVar4.f272069a = eVar4.f272081m.getMediaId();
                    mo129409i(eVar4);
                    mo129408h(eVar4);
                    mo129405d(eVar4);
                    return;
                }
                eVar3.f272074f = z4;
                mo129409i(eVar3);
                mo129408h(eVar3);
                MMHandlerThread.postToMainThreadDelayed(new C94184x(this, eVar3), 200);
                return;
            }
            return;
        }
        Log.m105928w("MicroMsg.EnvelopeStoryVideoManager", "skip same position");
    }

    /* renamed from: h */
    public final void mo129408h(C94180e eVar) {
        boolean z = eVar.f272081m.f272091h1;
        if (z) {
            eVar.f272085q.setImageResource(C0966R.raw.lucky_money_mute_icon);
        } else {
            eVar.f272085q.setImageResource(C0966R.raw.lucky_money_unmute_icon);
        }
        eVar.f272088t.setTag(C0966R.C0970id.l6i, Boolean.valueOf(z));
    }

    /* renamed from: i */
    public final void mo129409i(C94180e eVar) {
        if (eVar.f272074f) {
            eVar.f272085q.setVisibility(4);
            eVar.f272081m.setMute(true);
            return;
        }
        eVar.f272085q.setVisibility(0);
        eVar.f272081m.setMute(this.f272052f);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onUIDestroy() {
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onUIPause() {
        if (this.f272054h) {
            this.f272053g.mo139414a();
            this.f272054h = false;
        }
        C94180e eVar = (C94180e) ((HashMap) this.f272055i).get(Integer.valueOf(this.f272051e));
        if (eVar != null) {
            eVar.f272081m.mo79614b();
        }
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onUIResume() {
        C94180e eVar = (C94180e) ((HashMap) this.f272055i).get(Integer.valueOf(this.f272051e));
        if (eVar != null) {
            eVar.f272081m.mo79617f();
            if (eVar.f272081m.isPlaying()) {
                this.f272053g.mo139415b();
                this.f272054h = true;
            }
        }
    }
}
