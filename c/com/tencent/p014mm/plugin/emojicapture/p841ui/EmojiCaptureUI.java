package com.tencent.p014mm.plugin.emojicapture.p841ui;

import a71.C91977i;
import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.KeyEvent;
import b71.C92190b;
import b71.C92200j;
import b71.C92208n;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureContainer;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureDecoration;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.EditorStickerView;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.CaptureEditorContainer;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.text.FontAnimTextView;
import com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureReceiver;
import com.tencent.p014mm.plugin.emojicapture.proxy.VoiceInputProxy;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d71.C31096f;
import d71.C97426a;
import d71.C97432b;
import d71.C97434g;
import d71.C97440h;
import d71.C97442j;
import d71.C97443k;
import di3.C86312j;
import e71.C97604c;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i72.C108388k;
import kotlin.Metadata;
import nj3.C88989a;
import o40.C61926c;
import p156gj.C107822b0;
import p156gj.C107835h0;
import p206nj.C11171e;
import p375qh.C101195p;
import p447aw.C103918d;
import p80.C110193b;
import p911ml.C76778b;
import p914oj.C110052b;
import qo3.C89779i0;
import rh3.C101383g;
import rx3.C13598b0;
import sh3.C101624e;
import te3.C101814mn2;
import te3.C50153kn2;
import th3.C101893b;
import v61.C37680b;
import x61.C102566a;
import y61.C102811a;
import y61.C102813c;
import z04.C112550d0;
import z51.C39315g;
import zb0.C39332f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "a", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(3)
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI */
public final class EmojiCaptureUI extends MMActivity {

    /* renamed from: u */
    public static final /* synthetic */ int f269161u = 0;

    /* renamed from: d */
    public final String f269162d = "MicroMsg.EmojiCaptureUI";

    /* renamed from: e */
    public CaptureContainer f269163e;

    /* renamed from: f */
    public CaptureEditorContainer f269164f;

    /* renamed from: g */
    public C102811a f269165g;

    /* renamed from: h */
    public C102813c f269166h;

    /* renamed from: i */
    public int f269167i;

    /* renamed from: j */
    public long f269168j;

    /* renamed from: n */
    public int f269169n = 2;

    /* renamed from: o */
    public boolean f269170o;

    /* renamed from: p */
    public String f269171p;

    /* renamed from: q */
    public EmojiCaptureReceiver f269172q;

    /* renamed from: r */
    public final EmojiCaptureReporter f269173r = new EmojiCaptureReporter();

    /* renamed from: s */
    public final C93286c f269174s = new C93286c(this);

    /* renamed from: t */
    public final EmojiCaptureUI$hardCoderSystemEventListener$1 f269175t = new EmojiCaptureUI$hardCoderSystemEventListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$a */
    public interface C93283a {

        /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$a$a */
        public static final class C93284a {
            /* renamed from: a */
            public static /* synthetic */ void m117801a(C93283a aVar, boolean z, String str, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = null;
                    }
                    aVar.mo127989d(z, str);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exit");
            }
        }

        /* renamed from: a */
        void mo127986a();

        /* renamed from: b */
        void mo127987b();

        /* renamed from: c */
        void mo127988c(C92190b bVar);

        /* renamed from: d */
        void mo127989d(boolean z, String str);

        /* renamed from: e */
        void mo127990e(String str);

        /* renamed from: f */
        void mo127991f(Context context, CharSequence charSequence, boolean z, int i, DialogInterface.OnCancelListener onCancelListener);

        /* renamed from: g */
        void mo127992g();
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$b */
    public static final class C93285b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ EmojiCaptureUI f269176d;

        /* renamed from: e */
        public final /* synthetic */ long f269177e;

        public C93285b(EmojiCaptureUI emojiCaptureUI, long j) {
            this.f269176d = emojiCaptureUI;
            this.f269177e = j;
        }

        public final void run() {
            long j;
            int i;
            String str = this.f269176d.f269162d;
            Log.m105924i(str, "connect cost " + Util.ticksToNow(this.f269177e));
            EmojiCaptureUI emojiCaptureUI = this.f269176d;
            emojiCaptureUI.getClass();
            Class cls = C103918d.class;
            Class cls2 = C39315g.class;
            C91977i.f263322a = ((C39315g) C86312j.m106911c(cls2)).getProvider().mo138017d();
            if (C39332f.m42087b().mo62022a()) {
                C115669n.INSTANCE.mo175912v(933, 0);
            } else {
                C115669n.INSTANCE.mo175912v(933, 1);
            }
            C102566a aVar = C102566a.f302002b;
            C91977i.f263324c = ((C102566a.C102567a) aVar.mo138761d()).f302006c;
            C91977i.f263325d = ((C37680b) C86312j.m106911c(C37680b.class)).mo61287ru();
            Class cls3 = C32735h.class;
            aVar.f291329a = new C102566a.C102567a(0, false, 0, 0, false, 31, (C8480h) null);
            Object systemService = MMApplicationContext.getContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager activityManager = (ActivityManager) systemService;
            int largeMemoryClass = activityManager.getLargeMemoryClass();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j2 = (long) 1024;
            long j3 = (memoryInfo.totalMem / j2) / j2;
            int Qe = ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_emoji_high_mem_class, 512);
            int Qe2 = ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_emoji_high_total_mem, 2048);
            boolean z = C11171e.m11046c(23) && largeMemoryClass >= Qe && j3 >= ((long) Qe2);
            C102566a.f302003c = z;
            if (z) {
                j = j3;
                C115669n.INSTANCE.mo175912v(1012, 56);
            } else {
                j = j3;
                C115669n.INSTANCE.mo175912v(1012, 57);
            }
            Log.m105924i("MicroMsg.EmojiCameraElementConfig", "checkHighPerformance: device: " + largeMemoryClass + ", " + j + "; high: " + Qe + ", " + Qe2 + "; " + C102566a.f302003c);
            if (C102566a.f302003c) {
                ((C102566a.C102567a) aVar.mo138762e()).f302006c = ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_emoji_high_preview_size, 640);
                ((C102566a.C102567a) aVar.mo138762e()).f302007d = ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_emoji_high_sample_size, 1);
            } else {
                ((C102566a.C102567a) aVar.mo138762e()).f302006c = ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_emoji_low_preview_size, 480);
                ((C102566a.C102567a) aVar.mo138762e()).f302007d = ((C32735h) C86312j.m106911c(cls3)).mo58779Qe(C32735h.C32737c.clicfg_emoji_low_sample_size, 1);
            }
            C107822b0 b0Var = C107835h0.f322852i;
            int i2 = b0Var.f322665n;
            int i3 = b0Var.f322666o;
            if (i2 != -1) {
                Log.m105924i("MicroMsg.EmojiCameraElementConfig", "setPreviewConfig: use device preview " + i2);
                ((C102566a.C102567a) aVar.mo138762e()).f302006c = i2;
            }
            if (i3 != -1) {
                Log.m105924i("MicroMsg.EmojiCameraElementConfig", "setPreviewConfig: use device sample size " + i3);
                ((C102566a.C102567a) aVar.mo138762e()).f302007d = i3;
            }
            Log.m105924i("MicroMsg.EmojiCameraElementConfig", "setPreviewConfig: " + ((C102566a.C102567a) aVar.mo138762e()).f302006c + ", " + ((C102566a.C102567a) aVar.mo138762e()).f302007d);
            boolean z2 = aVar.mo138763f("VideoRecordUseCpuCrop", 0) == 1;
            int i4 = C107835h0.f322853j.f322663l;
            Log.m105924i("MicroMsg.EmojiCameraElementConfig", "setServerUseCpuCrop, serverConfigUseCpuCrop:" + z2 + ", deviceConfigUseCpuCrop:" + i4);
            if (z2) {
                i = 1;
                ((C102566a.C102567a) aVar.mo138762e()).f302005b = true;
            } else {
                i = 1;
            }
            if (i4 != -1) {
                ((C102566a.C102567a) aVar.mo138762e()).f302005b = i4 == i;
            }
            Log.m105924i("MicroMsg.EmojiCameraElementConfig", "final set useCpuCrop:" + ((C102566a.C102567a) aVar.mo138762e()).f302005b);
            boolean z3 = ((C102566a.C102567a) aVar.mo138761d()).f302005b;
            String str2 = emojiCaptureUI.f269162d;
            Log.m105924i(str2, "onCreate useCpuCrop:" + z3);
            VideoTransPara videoTransPara = (VideoTransPara) emojiCaptureUI.getIntent().getParcelableExtra("key_video_params");
            String stringExtra = emojiCaptureUI.getIntent().getStringExtra("key_imitated_md5");
            String stringExtra2 = emojiCaptureUI.getIntent().getStringExtra("lens_id");
            EmojiInfo H2 = ((C39315g) C86312j.m106911c(cls2)).getProvider().mo138001H2(stringExtra);
            emojiCaptureUI.f269170o = emojiCaptureUI.getIntent().getBooleanExtra("sticker_enable", emojiCaptureUI.f269170o);
            EmojiCaptureReporter emojiCaptureReporter = emojiCaptureUI.f269173r;
            emojiCaptureReporter.f269147z = H2 != null ? H2.field_lensId : null;
            emojiCaptureReporter.f269126F = C91977i.f263325d;
            CaptureContainer captureContainer = emojiCaptureUI.f269163e;
            if (captureContainer != null) {
                C87412m.m108591d(videoTransPara);
                C97426a aVar2 = r3;
                CaptureContainer captureContainer2 = captureContainer;
                C97426a aVar3 = new C97426a(emojiCaptureUI, captureContainer, videoTransPara, emojiCaptureUI.f269174s, emojiCaptureUI.f269173r);
                emojiCaptureUI.f269165g = aVar2;
                captureContainer2.setPresenter(aVar2);
                captureContainer2.setReporter(emojiCaptureUI.f269173r);
                boolean z4 = emojiCaptureUI.f269170o;
                String str3 = emojiCaptureUI.f269171p;
                String str4 = captureContainer2.f269219d;
                StringBuilder sb = new StringBuilder();
                sb.append("setup: ");
                sb.append(z4);
                sb.append(", ");
                sb.append(H2 != null ? H2.getMd5() : null);
                sb.append(", ");
                sb.append(stringExtra2);
                Log.m105924i(str4, sb.toString());
                captureContainer2.f269235w = z4;
                captureContainer2.f269228p.setImitateEmoji(H2);
                if (z4) {
                    String str5 = H2 != null ? H2.field_lensId : null;
                    if (!(str5 == null || str5.length() == 0)) {
                        stringExtra2 = H2 != null ? H2.field_lensId : null;
                    }
                    EditorStickerView editorStickerView = captureContainer2.f269226n;
                    EmojiCaptureReporter emojiCaptureReporter2 = captureContainer2.f269233u;
                    long j4 = emojiCaptureReporter2 != null ? emojiCaptureReporter2.f269128d : 0;
                    boolean z5 = H2 != null;
                    String str6 = editorStickerView.f269267d;
                    Log.m105924i(str6, "setup: " + j4 + ", " + stringExtra2);
                    if (Util.isNullOrNil(str3)) {
                        EmojiCaptureReporter emojiCaptureReporter3 = editorStickerView.f269273j;
                        if (emojiCaptureReporter3 != null) {
                            emojiCaptureReporter3.f269125E = 1;
                        }
                    } else {
                        EmojiCaptureReporter emojiCaptureReporter4 = editorStickerView.f269273j;
                        if (emojiCaptureReporter4 != null) {
                            emojiCaptureReporter4.f269125E = 2;
                        }
                    }
                    C92200j jVar = editorStickerView.f269274n;
                    jVar.getClass();
                    C50153kn2 kn22 = new C50153kn2();
                    kn22.f136897e = String.valueOf(j4);
                    kn22.f136896d = str3;
                    jVar.f263903j = kn22.toByteArray();
                    jVar.f263904k = Util.isNullOrNil(str3) ^ true ? 1 : 0;
                    if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                        C92208n nVar = editorStickerView.f269275o;
                        nVar.f263919e = stringExtra2;
                        nVar.f263921g = true;
                        C92200j jVar2 = editorStickerView.f269274n;
                        jVar2.getClass();
                        C87412m.m108594g(stringExtra2, "lensId");
                        C101814mn2 mn22 = new C101814mn2();
                        mn22.f298862d = stringExtra2;
                        jVar2.mo126164a(mn22);
                    } else if (z5) {
                        editorStickerView.f269275o.f263920f = 0;
                    }
                    C101624e.f297484a.mo141088e(editorStickerView.f269282v);
                    captureContainer2.f269226n.setReporter(captureContainer2.f269233u);
                    captureContainer2.f269226n.setShow(true);
                } else {
                    captureContainer2.f269226n.setShow(false);
                    captureContainer2.f269228p.setStickerInfo((C101383g) null);
                }
            }
            CaptureEditorContainer captureEditorContainer = emojiCaptureUI.f269164f;
            if (captureEditorContainer != null) {
                C97434g gVar = new C97434g(emojiCaptureUI, captureEditorContainer, emojiCaptureUI.f269174s, stringExtra, emojiCaptureUI.f269173r);
                emojiCaptureUI.f269166h = gVar;
                captureEditorContainer.setPresenter(gVar);
                captureEditorContainer.setReporter(emojiCaptureUI.f269173r);
            }
            if (((C103918d) C86312j.m106911c(cls)).Gd0(emojiCaptureUI, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
                CaptureContainer captureContainer3 = emojiCaptureUI.f269163e;
                if (captureContainer3 != null) {
                    captureContainer3.mo128031h();
                }
            } else {
                ((C103918d) C86312j.m106911c(cls)).M70(1001, new C97604c(emojiCaptureUI), new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"});
                Log.m105924i(emojiCaptureUI.f269162d, "initOnCreateAfterConnected: no permission");
            }
            emojiCaptureUI.f269175t.alive();
            emojiCaptureUI.f269172q = new EmojiCaptureReceiver();
            IntentFilter intentFilter = new IntentFilter("com.tencent.mm.Emoji_Capture_Res");
            intentFilter.addAction("com.tencent.mm.Emoji_Capture_Upload");
            emojiCaptureUI.registerReceiver(emojiCaptureUI.f269172q, intentFilter);
            EmojiCaptureReporter.m117777c(0, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$c */
    public static final class C93286c implements C93283a {

        /* renamed from: a */
        public C89779i0 f269178a;

        /* renamed from: b */
        public final /* synthetic */ EmojiCaptureUI f269179b;

        /* renamed from: com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI$c$a */
        public static final class C93287a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C93286c f269180d;

            /* renamed from: e */
            public final /* synthetic */ Context f269181e;

            /* renamed from: f */
            public final /* synthetic */ CharSequence f269182f;

            /* renamed from: g */
            public final /* synthetic */ boolean f269183g;

            /* renamed from: h */
            public final /* synthetic */ int f269184h;

            /* renamed from: i */
            public final /* synthetic */ DialogInterface.OnCancelListener f269185i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C93287a(C93286c cVar, Context context, CharSequence charSequence, boolean z, int i, DialogInterface.OnCancelListener onCancelListener) {
                super(0);
                this.f269180d = cVar;
                this.f269181e = context;
                this.f269182f = charSequence;
                this.f269183g = z;
                this.f269184h = i;
                this.f269185i = onCancelListener;
            }

            public Object invoke() {
                C89779i0 i0Var = this.f269180d.f269178a;
                if (i0Var != null) {
                    i0Var.dismiss();
                }
                this.f269180d.f269178a = C89779i0.m112248e(this.f269181e, this.f269182f, this.f269183g, this.f269184h, this.f269185i);
                return C13598b0.f38549a;
            }
        }

        public C93286c(EmojiCaptureUI emojiCaptureUI) {
            this.f269179b = emojiCaptureUI;
        }

        /* renamed from: a */
        public void mo127986a() {
            Log.m105924i(this.f269179b.f269162d, "go2Capture");
            CaptureContainer captureContainer = this.f269179b.f269163e;
            if (captureContainer != null) {
                captureContainer.setVisibility(0);
            }
            CaptureEditorContainer captureEditorContainer = this.f269179b.f269164f;
            if (captureEditorContainer != null) {
                captureEditorContainer.setVisibility(8);
            }
            CaptureContainer captureContainer2 = this.f269179b.f269163e;
            if (captureContainer2 != null) {
                captureContainer2.mo128031h();
            }
            this.f269179b.f269167i = 0;
        }

        /* renamed from: b */
        public void mo127987b() {
            Log.m105924i(this.f269179b.f269162d, "onEditorPrepared");
            EmojiCaptureUI emojiCaptureUI = this.f269179b;
            if (emojiCaptureUI.f269167i == 2) {
                CaptureEditorContainer captureEditorContainer = emojiCaptureUI.f269164f;
                if (captureEditorContainer != null) {
                    captureEditorContainer.setAlpha(1.0f);
                }
                CaptureContainer captureContainer = this.f269179b.f269163e;
                if (captureContainer != null) {
                    captureContainer.setVisibility(8);
                }
                mo127992g();
                this.f269179b.f269167i = 1;
            }
        }

        /* renamed from: c */
        public void mo127988c(C92190b bVar) {
            boolean z;
            C87412m.m108594g(bVar, "emojiCaptureInfo");
            String str = this.f269179b.f269162d;
            Log.m105924i(str, "prepareEditor " + bVar.f263863c);
            String str2 = bVar.f263863c;
            C87412m.m108594g(str2, "videoPath");
            if (C86013q1.m106451l(str2) > 0) {
                C110052b bVar2 = new C110052b();
                try {
                    bVar2.mo161392k(str2);
                    if (bVar2.mo161385d() < 1) {
                        try {
                            bVar2.mo161388g();
                        } catch (Exception e) {
                            Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e, "checkVideoValid, release extractor error", new Object[0]);
                        }
                    } else {
                        int d = bVar2.mo161385d();
                        for (int i = 0; i < d; i++) {
                            MediaFormat e2 = bVar2.mo161386e(i);
                            C87412m.m108593f(e2, "extractor.getTrackFormat(i)");
                            if (e2.containsKey("mime")) {
                                String string = e2.getString("mime");
                                if (string != null && C112550d0.m153801u(string, "video", false)) {
                                    try {
                                        bVar2.mo161388g();
                                    } catch (Exception e3) {
                                        Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e3, "checkVideoValid, release extractor error", new Object[0]);
                                    }
                                    z = true;
                                    break;
                                }
                            }
                        }
                        try {
                            bVar2.mo161388g();
                        } catch (Exception e4) {
                            Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e4, "checkVideoValid, release extractor error", new Object[0]);
                        }
                    }
                } catch (Exception e5) {
                    Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e5, "checkVideoValid error", new Object[0]);
                    try {
                        bVar2.mo161388g();
                    } catch (Exception e6) {
                        Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e6, "checkVideoValid, release extractor error", new Object[0]);
                    }
                } catch (Throwable th) {
                    Throwable th4 = th;
                    try {
                        bVar2.mo161388g();
                    } catch (Exception e7) {
                        Log.printErrStackTrace("MicroMsg.EmojiCaptureUtil", e7, "checkVideoValid, release extractor error", new Object[0]);
                    }
                    throw th4;
                }
            }
            z = false;
            if (!z) {
                Log.m105924i(this.f269179b.f269162d, "prepareEditor: video invalid");
                EmojiCaptureReporter.m117777c(2, 1);
                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markVideoRecordFailed");
                C115669n.INSTANCE.mo175913w(1012, 10, 1);
                mo127986a();
                return;
            }
            CaptureEditorContainer captureEditorContainer = this.f269179b.f269164f;
            if (captureEditorContainer != null) {
                captureEditorContainer.setVisibility(0);
            }
            CaptureEditorContainer captureEditorContainer2 = this.f269179b.f269164f;
            if (captureEditorContainer2 != null) {
                captureEditorContainer2.setAlpha(0.0f);
            }
            C102813c cVar = this.f269179b.f269166h;
            if (cVar != null) {
                C97434g gVar = (C97434g) cVar;
                Log.m105924i("MicroMsg.EditorPresenter", "setup");
                gVar.f286001n = bVar;
                boolean z2 = bVar.f263868h;
                gVar.f285998k = z2;
                gVar.f285994g = bVar.f263866f;
                gVar.f285989b.mo128095d(bVar, bVar.f263863c, bVar.f263867g, z2, new C97442j(gVar));
                C61926c.m72657B("EditorPresenter_setup", true, new C97443k(bVar));
            }
            C102811a aVar = this.f269179b.f269165g;
            if (aVar != null) {
                C97426a aVar2 = (C97426a) aVar;
                Log.m105924i("MicroMsg.CapturePresenter", "pauseCapture " + aVar2.f285971h);
                String str3 = aVar2.f285972i;
                if (str3 != null || aVar2.f285971h) {
                    aVar2.f285966c.mo127990e(str3);
                } else {
                    MMHandlerThread.postToMainThreadDelayed(new C97432b(aVar2), 1500);
                }
            }
            this.f269179b.f269167i = 2;
        }

        /* renamed from: d */
        public void mo127989d(boolean z, String str) {
            Intent intent = new Intent();
            if (z) {
                intent.putExtra("key_enter_time", this.f269179b.f269168j);
                intent.putExtra("gif_md5", str);
                this.f269179b.setResult(-1, intent);
            } else {
                EmojiCaptureReporter emojiCaptureReporter = this.f269179b.f269173r;
                long currentTimeMillis = System.currentTimeMillis();
                EmojiCaptureReporter emojiCaptureReporter2 = this.f269179b.f269173r;
                long j = emojiCaptureReporter2.f269128d;
                emojiCaptureReporter.f269137p = currentTimeMillis - j;
                EmojiCaptureReporter.m117776b(6, j, emojiCaptureReporter2.f269137p, 0, 0, 0, 0, 0, 0, emojiCaptureReporter2.f269127G);
                this.f269179b.setResult(0);
            }
            this.f269179b.finish();
        }

        /* renamed from: e */
        public void mo127990e(String str) {
            C102813c cVar = this.f269179b.f269166h;
            if (cVar != null) {
                C97434g gVar = (C97434g) cVar;
                Log.m105924i("MicroMsg.EditorPresenter", "voice text callback");
                C97440h hVar = new C97440h(gVar, str);
                if (Util.isNullOrNil(str)) {
                    hVar.invoke(Boolean.FALSE);
                } else {
                    gVar.f286000m.cgiEmojiTextSpam(str, new C31096f(hVar));
                }
            }
        }

        /* renamed from: f */
        public void mo127991f(Context context, CharSequence charSequence, boolean z, int i, DialogInterface.OnCancelListener onCancelListener) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(charSequence, "msg");
            C61926c.m72668M(new C93287a(this, context, charSequence, z, i, onCancelListener));
            String str = this.f269179b.f269162d;
            Log.m105924i(str, "showLoading: " + this.f269178a);
        }

        /* renamed from: g */
        public void mo127992g() {
            C89779i0 i0Var = this.f269178a;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            String str = this.f269179b.f269162d;
            Log.m105924i(str, "dismissLoading: " + this.f269178a);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(-1, C0966R.C0968anim.f2331s);
    }

    public int getForceOrientation() {
        EmojiCaptureProxy.C93278a aVar = EmojiCaptureProxy.f269148h;
        return EmojiCaptureProxy.f269149i.getEnableAutoRotate() ? 7 : 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a1d;
    }

    public void onBackPressed() {
        C102813c cVar = this.f269166h;
        boolean z = true;
        if (cVar == null || !((C97434g) cVar).mo136696a()) {
            z = false;
        }
        if (!z) {
            C93283a.C93284a.m117801a(this.f269174s, false, (String) null, 2, (Object) null);
        }
    }

    public void onCreate(Bundle bundle) {
        Log.m105924i(this.f269162d, "onCreate");
        overridePendingTransition(C0966R.C0968anim.f2330r, -1);
        supportRequestWindowFeature(1);
        setSelfNavigationBarVisible(8);
        super.onCreate(bundle);
        getWindow().addFlags(67109888);
        this.f269169n = getIntent().getIntExtra("enter_scene", this.f269169n);
        this.f269168j = getIntent().getLongExtra("key_enter_time", 0);
        this.f269171p = getIntent().getStringExtra("username");
        EmojiCaptureReporter emojiCaptureReporter = this.f269173r;
        emojiCaptureReporter.f269127G = this.f269169n;
        emojiCaptureReporter.f269128d = this.f269168j;
        C108388k.m146839e();
        boolean z = C101195p.f296202a;
        int intExtra = getIntent().getIntExtra("key_capture_max_duration", 5);
        String stringExtra = getIntent().getStringExtra("key_imitated_md5");
        C91977i.f263323b = intExtra;
        this.f269173r.f269145x = stringExtra;
        this.f269163e = (CaptureContainer) findViewById(C0966R.C0970id.f357611ar2);
        this.f269164f = (CaptureEditorContainer) findViewById(C0966R.C0970id.cc9);
        long currentTicks = Util.currentTicks();
        EmojiCaptureProxy.f269148h.mo127970a();
        C96905d serverProxy = EmojiCaptureProxy.f269149i.getServerProxy();
        if (serverProxy != null) {
            serverProxy.mo135257a(new C93285b(this, currentTicks));
        }
        Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markEmojiCaptureUIOnCreate");
        C115669n.INSTANCE.mo175913w(1012, 0, 1);
    }

    public void onDestroy() {
        this.f269175t.dead();
        super.onDestroy();
        C102811a aVar = this.f269165g;
        if (aVar != null) {
            C97426a aVar2 = (C97426a) aVar;
            aVar2.f285974k.mo135260d();
            VoiceInputProxy voiceInputProxy = aVar2.f285975l;
            if (voiceInputProxy != null) {
                voiceInputProxy.setUiCallback((VoiceInputProxy.C93281a) null);
            }
        }
        CaptureContainer captureContainer = this.f269163e;
        if (captureContainer != null) {
            EditorStickerView editorStickerView = captureContainer.f269226n;
            editorStickerView.getClass();
            C101624e.f297484a.mo141089f(editorStickerView.f269282v);
            editorStickerView.f269274n.getClass();
            C101893b.f300049h = null;
        }
        C102813c cVar = this.f269166h;
        if (cVar != null) {
            C97434g gVar = (C97434g) cVar;
            Log.m105924i("MicroMsg.EditorPresenter", "destroy");
            EmojiVideoPlayTextureView videoPlayView = gVar.f285989b.getVideoPlayView();
            if (videoPlayView != null) {
                videoPlayView.stop();
            }
            gVar.f285989b.getItemContainer().mo128121b();
            gVar.f285989b.destroy();
            gVar.f285999l.mo135260d();
            gVar.f286000m.setCallback((C32226l<? super Boolean, C13598b0>) null);
            C76778b.f224582a.mo107031b(gVar.f286001n.f263862b, gVar.f286003p);
        }
        EmojiCaptureReceiver emojiCaptureReceiver = this.f269172q;
        if (emojiCaptureReceiver != null) {
            unregisterReceiver(emojiCaptureReceiver);
        }
        EmojiCaptureProxy.f269148h.mo127971b();
        Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markEmojiCaptureUIOnDestroy");
        C115669n.INSTANCE.mo175913w(1012, 1, 1);
        C110193b.f329648a.mo161593c();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C87412m.m108594g(keyEvent, "event");
        boolean z = true;
        if (C107835h0.f322845b.f322807f == 1 && i == 700) {
            CaptureContainer captureContainer = this.f269163e;
            if (captureContainer == null || !captureContainer.f269238z) {
                z = false;
            }
            if (z && captureContainer != null) {
                captureContainer.mo128032i();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        super.onPause();
        if (this.f269167i == 0) {
            CaptureContainer captureContainer = this.f269163e;
            if (captureContainer != null) {
                Log.m105924i(captureContainer.f269219d, "PauseCapture");
                CaptureDecoration decoration = captureContainer.getDecoration();
                decoration.f269262v.mo128121b();
                FontAnimTextView fontAnimTextView = decoration.f269263w;
                fontAnimTextView.removeCallbacks(fontAnimTextView.f312570g);
                captureContainer.f269237y.mo157937k();
                return;
            }
            return;
        }
        C102813c cVar = this.f269166h;
        if (cVar != null) {
            ((C97434g) cVar).mo136704j();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f269167i != 0) {
            C102813c cVar = this.f269166h;
            if (cVar != null) {
                ((C97434g) cVar).mo136705k();
            }
        } else if (((C103918d) C86312j.m106911c(C103918d.class)).Gd0(this, "android.permission.CAMERA", "android.permission.RECORD_AUDIO")) {
            CaptureContainer captureContainer = this.f269163e;
            if (captureContainer != null) {
                captureContainer.mo128031h();
            }
        } else {
            Log.m105924i(this.f269162d, "initOnCreateAfterConnected: no permission");
        }
    }
}
