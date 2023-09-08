package d71;

import a71.C91977i;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Matrix;
import b71.C92190b;
import com.google.android.gms.common.util.GmsVersion;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.p014mm.plugin.emojicapture.p841ui.EmojiCaptureUI;
import com.tencent.p014mm.plugin.emojicapture.p841ui.capture.CaptureDecoration;
import com.tencent.p014mm.plugin.emojicapture.p841ui.editor.text.FontAnimTextView;
import com.tencent.p014mm.plugin.emojicapture.proxy.VoiceInputProxy;
import com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import h90.C98324b;
import i72.C108388k;
import i72.C108392r;
import rh3.C101383g;
import y61.C102811a;
import y61.C102812b;

/* renamed from: d71.a */
public final class C97426a implements C102811a {

    /* renamed from: a */
    public Context f285964a;

    /* renamed from: b */
    public C102812b f285965b;

    /* renamed from: c */
    public EmojiCaptureUI.C93283a f285966c;

    /* renamed from: d */
    public final EmojiCaptureReporter f285967d;

    /* renamed from: e */
    public C97428b f285968e = C97428b.RECORD_STATE_IDLE;

    /* renamed from: f */
    public long f285969f;

    /* renamed from: g */
    public boolean f285970g;

    /* renamed from: h */
    public boolean f285971h;

    /* renamed from: i */
    public String f285972i;

    /* renamed from: j */
    public final C92190b f285973j;

    /* renamed from: k */
    public final C96905d f285974k;

    /* renamed from: l */
    public VoiceInputProxy f285975l;

    /* renamed from: m */
    public final MTimerHandler f285976m;

    /* renamed from: d71.a$a */
    public static final class C97427a implements Runnable {

        /* renamed from: d */
        public static final C97427a f285977d = new C97427a();

        public final void run() {
            Log.m105924i("MicroMsg.CapturePresenter", "proxy connected");
        }
    }

    /* renamed from: d71.a$b */
    public enum C97428b {
        RECORD_STATE_IDLE,
        RECORD_STATE_PREVIEW,
        RECORD_STATE_STARTED,
        RECORD_STATE_STOP
    }

    /* renamed from: d71.a$c */
    public static final class C97429c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C97426a f285983d;

        public C97429c(C97426a aVar) {
            this.f285983d = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f285983d.f285966c.mo127986a();
        }
    }

    /* renamed from: d71.a$d */
    public static final class C97430d implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C97426a f285984d;

        public C97430d(C97426a aVar) {
            this.f285984d = aVar;
        }

        public final boolean onTimerExpired() {
            VoiceInputProxy voiceInputProxy = this.f285984d.f285975l;
            boolean z = false;
            int maxAmplitudeRate = (voiceInputProxy == null || voiceInputProxy == null) ? 0 : voiceInputProxy.getMaxAmplitudeRate();
            C102812b bVar = this.f285984d.f285965b;
            if (maxAmplitudeRate > 10) {
                z = true;
            }
            bVar.mo128016c(z);
            return true;
        }
    }

    /* renamed from: d71.a$e */
    public static final class C97431e implements VoiceInputProxy.C93281a {

        /* renamed from: a */
        public final /* synthetic */ C97426a f285985a;

        public C97431e(C97426a aVar) {
            this.f285985a = aVar;
        }

        /* renamed from: a */
        public void mo127983a() {
            Log.m105924i("MicroMsg.CapturePresenter", "onRecognizeFinish voice finish called");
            C97426a aVar = this.f285985a;
            if (!aVar.f285971h) {
                aVar.f285966c.mo127990e(aVar.f285972i);
            }
            this.f285985a.f285971h = true;
        }

        /* renamed from: b */
        public void mo127984b(String str) {
            Log.m105924i("MicroMsg.CapturePresenter", "onRes " + str);
            this.f285985a.f285972i = str;
        }
    }

    public C97426a(Context context, C102812b bVar, VideoTransPara videoTransPara, EmojiCaptureUI.C93283a aVar, EmojiCaptureReporter emojiCaptureReporter) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "view");
        C87412m.m108594g(videoTransPara, "videoPara");
        C87412m.m108594g(aVar, "uiNavigation");
        C87412m.m108594g(emojiCaptureReporter, "reporter");
        this.f285964a = context;
        this.f285965b = bVar;
        this.f285966c = aVar;
        this.f285967d = emojiCaptureReporter;
        C92190b bVar2 = new C92190b();
        this.f285973j = bVar2;
        C96905d dVar = new C96905d(this.f285964a);
        this.f285974k = dVar;
        this.f285975l = new VoiceInputProxy(new C97431e(this), dVar);
        this.f285976m = new MTimerHandler(new C97430d(this), true);
        CaptureMMProxy.createProxy(new CaptureMMProxy(dVar));
        dVar.mo135257a(C97427a.f285977d);
        int i = C91977i.f263324c;
        videoTransPara.f267166d = i;
        videoTransPara.f267167e = i;
        videoTransPara.f267169g = GmsVersion.VERSION_LONGHORN;
        C108392r rVar = C108388k.f324540d;
        rVar.f324554d = GmsVersion.VERSION_LONGHORN;
        rVar.f324552b = videoTransPara;
        bVar2.f263861a = emojiCaptureReporter.f269127G;
        bVar2.f263862b = emojiCaptureReporter.f269128d;
    }

    /* renamed from: a */
    public void mo136688a(C101383g gVar) {
        Log.m105924i("MicroMsg.CapturePresenter", "changeSticker:" + gVar);
        this.f285973j.f263865e = gVar;
        this.f285965b.mo128014a(gVar);
    }

    /* renamed from: b */
    public void mo136689b(C98324b bVar, boolean z) {
        C87412m.m108594g(bVar, "info");
        Log.m105924i("MicroMsg.CapturePresenter", "stopRecord: videoRecorder stop");
        C92190b bVar2 = this.f285973j;
        String str = bVar.f288180a;
        bVar2.getClass();
        C87412m.m108594g(str, "<set-?>");
        bVar2.f263863c = str;
        C92190b bVar3 = this.f285973j;
        String str2 = bVar.f288181b;
        bVar3.getClass();
        C87412m.m108594g(str2, "<set-?>");
        bVar3.f263864d = str2;
        this.f285973j.getClass();
        this.f285973j.f263866f = this.f285965b.getDecoration().getTextColor();
        C92190b bVar4 = this.f285973j;
        C101383g gVar = bVar4.f263865e;
        boolean z2 = false;
        boolean z3 = (gVar != null ? gVar.f296984i : null) == null;
        bVar4.f263867g = z3;
        if (!z3 || !z) {
            z2 = true;
        }
        bVar4.f263868h = z2;
        bVar4.f263869i = this.f285965b.getDecoration().getAttachEmoji();
        C92190b bVar5 = this.f285973j;
        Matrix attachEmojiMatrix = this.f285965b.getDecoration().getAttachEmojiMatrix();
        bVar5.getClass();
        C87412m.m108594g(attachEmojiMatrix, "<set-?>");
        bVar5.f263870j = attachEmojiMatrix;
        this.f285966c.mo127988c(this.f285973j);
    }

    /* renamed from: c */
    public void mo136690c() {
        Log.m105924i("MicroMsg.CapturePresenter", "start record " + this.f285968e);
        C92190b bVar = this.f285973j;
        bVar.getClass();
        bVar.f263863c = "";
        C92190b bVar2 = this.f285973j;
        bVar2.getClass();
        bVar2.f263864d = "";
        this.f285972i = this.f285965b.getDecoration().getText();
        this.f285965b.getDecoration().getClass();
        String str = this.f285972i;
        this.f285970g = str == null || str.length() == 0;
        Log.m105924i("MicroMsg.CapturePresenter", "startRecord: useVoiceInput " + this.f285970g);
        if (this.f285970g && (!C87412m.m108589b("NON_NETWORK", NetStatusUtil.getNetTypeString(MMApplicationContext.getContext())))) {
            VoiceInputProxy voiceInputProxy = this.f285975l;
            if (voiceInputProxy != null) {
                voiceInputProxy.start();
            }
            this.f285976m.startTimer(50);
        }
        this.f285971h = false;
        this.f285968e = C97428b.RECORD_STATE_STARTED;
        this.f285969f = Util.currentTicks();
        this.f285967d.f269129e = System.currentTimeMillis();
        EmojiCaptureReporter emojiCaptureReporter = this.f285967d;
        emojiCaptureReporter.getClass();
        C115669n.INSTANCE.mo160131h(15982, 3, Long.valueOf(emojiCaptureReporter.f269128d), 0, 0, 0, 0, 0, 0, 0, Integer.valueOf(emojiCaptureReporter.f269127G), emojiCaptureReporter.f269121A, Integer.valueOf(emojiCaptureReporter.f269122B), 0, Integer.valueOf(emojiCaptureReporter.f269123C), emojiCaptureReporter.f269124D, Integer.valueOf(emojiCaptureReporter.f269125E), Integer.valueOf(emojiCaptureReporter.f269126F));
    }

    public void exit() {
        EmojiCaptureUI.C93283a.C93284a.m117801a(this.f285966c, false, (String) null, 2, (Object) null);
    }

    public boolean stopRecord() {
        Log.m105924i("MicroMsg.CapturePresenter", "stop record " + this.f285968e);
        C97428b bVar = this.f285968e;
        C97428b bVar2 = C97428b.RECORD_STATE_STOP;
        if (bVar == bVar2) {
            return true;
        }
        this.f285968e = bVar2;
        if (Util.ticksToNow(this.f285969f) < 600) {
            VoiceInputProxy voiceInputProxy = this.f285975l;
            if (voiceInputProxy != null) {
                voiceInputProxy.stop(true);
            }
            this.f285968e = C97428b.RECORD_STATE_PREVIEW;
            return false;
        }
        EmojiCaptureUI.C93283a aVar = this.f285966c;
        Context context = this.f285964a;
        String string = context.getString(C0966R.string.gas);
        C87412m.m108593f(string, "context.getString(com.te…ui.R.string.loading_tips)");
        aVar.mo127991f(context, string, true, 0, new C97429c(this));
        CaptureDecoration decoration = this.f285965b.getDecoration();
        decoration.f269262v.mo128121b();
        FontAnimTextView fontAnimTextView = decoration.f269263w;
        fontAnimTextView.removeCallbacks(fontAnimTextView.f312570g);
        if (this.f285970g) {
            VoiceInputProxy voiceInputProxy2 = this.f285975l;
            if (voiceInputProxy2 != null) {
                voiceInputProxy2.stop(true);
            }
            this.f285976m.stopTimer();
        }
        this.f285967d.f269130f = System.currentTimeMillis();
        EmojiCaptureReporter emojiCaptureReporter = this.f285967d;
        long j = emojiCaptureReporter.f269130f - emojiCaptureReporter.f269129e;
        emojiCaptureReporter.f269135n = j;
        EmojiCaptureReporter.m117776b(4, emojiCaptureReporter.f269128d, 0, j, 0, 0, 0, 0, 0, emojiCaptureReporter.f269127G);
        return true;
    }
}
