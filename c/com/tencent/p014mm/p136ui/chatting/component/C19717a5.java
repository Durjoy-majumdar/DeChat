package com.tencent.p014mm.p136ui.chatting.component;

import a14.C53934p0;
import android.app.Activity;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.CareModeTxt2VoiceUsageStruct;
import com.tencent.p014mm.p136ui.tools.C19843m;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import eb0.C97625j3;
import f40.C86709a0;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import ld0.C21412a;
import ld0.C21421f;
import lg3.C76695c;
import nj3.C76912y0;
import p270xi.C91212b;
import pu0.C110248b;
import rx3.C13598b0;
import sx3.C110823p;
import te3.ea4;
import te3.fa4;
import wx3.C15601d;
import zj3.C79341b1;
import zj3.C79343c0;

@C91212b(exportInterface = C79341b1.class)
/* renamed from: com.tencent.mm.ui.chatting.component.a5 */
public final class C19717a5 extends C73412a implements C79341b1 {

    /* renamed from: e */
    public long f56069e;

    /* renamed from: f */
    public long f56070f;

    /* renamed from: g */
    public final C21421f f56071g = new C21421f(false, 1, (C8480h) null);

    /* renamed from: h */
    public C79341b1.C79342a f56072h;

    /* renamed from: i */
    public MTimerHandler f56073i;

    /* renamed from: j */
    public boolean f56074j;

    /* renamed from: n */
    public fa4 f56075n = new fa4();

    /* renamed from: com.tencent.mm.ui.chatting.component.a5$a */
    public static final class C19718a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67391b f56076d;

        public C19718a(C67391b bVar) {
            this.f56076d = bVar;
        }

        public final void run() {
            C76912y0.m92769h(this.f56076d.mo91565f(), this.f56076d.mo91565f().getString(C0966R.string.b58), C0966R.raw.icons_filled_bluetooth);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.a5$b */
    public static final class C19719b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67391b f56077d;

        public C19719b(C67391b bVar) {
            this.f56077d = bVar;
        }

        public final void run() {
            C76912y0.m92769h(this.f56077d.mo91565f(), this.f56077d.mo91565f().getString(C0966R.string.b59), C0966R.raw.icons_filled_ear);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.a5$c */
    public static final class C19720c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67391b f56078d;

        public C19720c(C67391b bVar) {
            this.f56078d = bVar;
        }

        public final void run() {
            C76912y0.m92769h(this.f56078d.mo91565f(), this.f56078d.mo91565f().getString(C0966R.string.m9o), C0966R.raw.icons_filled_volume_off);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.a5$d */
    public static final class C19721d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67391b f56079d;

        public C19721d(C67391b bVar) {
            this.f56079d = bVar;
        }

        public final void run() {
            this.f56079d.mo91540A();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.component.a5$e */
    public static final class C19722e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C19717a5 f56080d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f56081e;

        public C19722e(C19717a5 a5Var, C67391b bVar) {
            this.f56080d = a5Var;
            this.f56081e = bVar;
        }

        public final void run() {
            C19843m.m21550a();
            this.f56080d.f56069e = 0;
            this.f56081e.mo91540A();
        }
    }

    /* renamed from: G2 */
    public void mo26159G2(C79341b1.C79342a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f56072h = aVar;
    }

    /* renamed from: G4 */
    public void mo26160G4() {
        if (this.f56071g.mo33554c()) {
            C21421f.m24186e(this.f56071g, false, false, 3, (Object) null);
            this.f56071g.mo33553b();
        }
        mo26164Y5(1);
        this.f56069e = 0;
        this.f56070f = 0;
        C21421f fVar = this.f56071g;
        Log.m105924i(fVar.f60620b, "setAudioFilePlayStateListener");
        fVar.f60625g = null;
        C19843m.m21550a();
    }

    /* renamed from: K5 */
    public void mo26161K5(C67391b bVar) {
        TextToSpeech textToSpeech;
        C87412m.m108594g(bVar, "ui");
        if (this.f56071g.mo33554c()) {
            C21421f.m24186e(this.f56071g, true, false, 2, (Object) null);
            this.f56071g.mo33553b();
        }
        TextToSpeech textToSpeech2 = C19843m.f56474a;
        if (!(textToSpeech2 == null || !textToSpeech2.isSpeaking() || (textToSpeech = C19843m.f56474a) == null)) {
            textToSpeech.stop();
        }
        mo26164Y5(1);
        this.f56069e = 0;
        this.f56070f = 0;
        mo26168c6(bVar);
        C21421f fVar = this.f56071g;
        Log.m105924i(fVar.f60620b, "setAudioFilePlayStateListener");
        fVar.f60625g = null;
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        ((C79343c0) this.f215752d.f193278b.mo102812a(C79343c0.class)).mo102613b4((!C76695c.m92341b() || !C76695c.m92343d()) ? 8 : 0);
    }

    /* renamed from: T4 */
    public long mo26163T4() {
        return this.f56070f;
    }

    /* renamed from: Y5 */
    public final void mo26164Y5(int i) {
        fa4 fa4 = this.f56075n;
        if (fa4 != null && fa4.f183102d != 0 && !fa4.f183105g) {
            CareModeTxt2VoiceUsageStruct careModeTxt2VoiceUsageStruct = new CareModeTxt2VoiceUsageStruct();
            fa4 fa42 = this.f56075n;
            careModeTxt2VoiceUsageStruct.f48247d = (long) fa42.f183103e;
            careModeTxt2VoiceUsageStruct.f48248e = (long) fa42.f183104f;
            if (fa42.f183106h) {
                careModeTxt2VoiceUsageStruct.f48251h = 2;
            } else {
                careModeTxt2VoiceUsageStruct.f48251h = 1;
            }
            careModeTxt2VoiceUsageStruct.f48252i = fa42.f183102d;
            careModeTxt2VoiceUsageStruct.f48253j = (long) i;
            careModeTxt2VoiceUsageStruct.mo86054n();
            this.f56075n.f183105g = true;
            this.f56075n = new fa4();
        }
    }

    /* renamed from: Z5 */
    public final void mo26165Z5(C67391b bVar) {
        C87412m.m108594g(bVar, "ui");
        C110248b.C110249a aVar = C110248b.f329777h;
        boolean k = aVar.mo161666k();
        boolean j = aVar.mo161665j();
        if (k || !j) {
            Object e = C97625j3.m125812b().mo105906u().mo119684e(26, Boolean.FALSE);
            if ((e == null || !(e instanceof Boolean)) ? false : ((Boolean) e).booleanValue()) {
                MMHandlerThread.postToMainThread(new C19719b(bVar));
            }
        } else if (!this.f56074j) {
            MMHandlerThread.postToMainThread(new C19718a(bVar));
            this.f56074j = true;
        }
    }

    /* renamed from: a6 */
    public final void mo26166a6(C67391b bVar) {
        C87412m.m108594g(bVar, "ui");
        Object systemService = MMApplicationContext.getContext().getSystemService("audio");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        if (((AudioManager) systemService).getStreamVolume(3) == 0) {
            MMHandlerThread.postToMainThread(new C19720c(bVar));
        }
    }

    /* renamed from: b6 */
    public final void mo26167b6(int i, long j, String str) {
        C87412m.m108594g(str, "subText");
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        hashMap.put("utteranceId", sb.toString());
        if (C19843m.f56474a != null && !TextUtils.isEmpty(str)) {
            C19843m.f56474a.speak(str.toString(), 1, hashMap);
        }
    }

    /* renamed from: c6 */
    public final void mo26168c6(C67391b bVar) {
        C87412m.m108594g(bVar, "ui");
        MMHandlerThread.postToMainThread(new C19722e(this, bVar));
    }

    /* renamed from: i3 */
    public long mo26169i3() {
        return this.f56069e;
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        if (this.f56071g.mo33554c()) {
            C21421f.m24186e(this.f56071g, false, false, 3, (Object) null);
            this.f56071g.mo33553b();
        }
        mo26164Y5(1);
        this.f56069e = 0;
        this.f56070f = 0;
        C21421f fVar = this.f56071g;
        Log.m105924i(fVar.f60620b, "setAudioFilePlayStateListener");
        fVar.f60625g = null;
        C19843m.m21550a();
    }

    /* renamed from: w */
    public void mo26171w(C67391b bVar, C72963f4 f4Var, CharSequence charSequence) {
        C67391b bVar2 = bVar;
        CharSequence charSequence2 = charSequence;
        C87412m.m108594g(bVar2, "ui");
        C87412m.m108594g(f4Var, "msg");
        C87412m.m108594g(charSequence2, "chatText");
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"。", "，", "?", "？", "!", "！", ";", "；", "\n"};
        String[] strArr2 = {",", "~", "～", "、", "-", "—", "(", ")", "（", "）", " "};
        int length = charSequence.length();
        String[] strArr3 = new String[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = i + 1;
            String obj = charSequence2.subSequence(i, i4).toString();
            strArr3[i] = obj;
            if (i >= i2 + 10) {
                if (i < i2 + 22) {
                    if (C110823p.m151009y(strArr, obj)) {
                        ea4 ea4 = new ea4();
                        ea4.f132829d = charSequence2.subSequence(i2, i4).toString();
                        ea4.f132830e = i2;
                        arrayList.add(ea4);
                        Log.m105919d("MicroMsg.TextToSpeechComponent", "textList 1 ,start:%s, end:%s", Integer.valueOf(i2), Integer.valueOf(i4));
                    }
                } else if (C110823p.m151009y(strArr, obj) || C110823p.m151009y(strArr2, strArr3[i])) {
                    ea4 ea42 = new ea4();
                    ea42.f132829d = charSequence2.subSequence(i2, i4).toString();
                    ea42.f132830e = i2;
                    arrayList.add(ea42);
                    Log.m105919d("MicroMsg.TextToSpeechComponent", "textList 2,start:%s, end:%s", Integer.valueOf(i2), Integer.valueOf(i4));
                }
                i2 = i4;
                i3 = i2;
            }
            if (i == length - 1 && (i == 0 || i3 < i)) {
                ea4 ea43 = new ea4();
                ea43.f132829d = charSequence2.subSequence(i2, i4).toString();
                ea43.f132830e = i2;
                arrayList.add(ea43);
                Log.m105919d("MicroMsg.TextToSpeechComponent", "textList 3,start:%s, end:%s", Integer.valueOf(i2), Integer.valueOf(i4));
                i3 = i4;
            }
            C72963f4 f4Var2 = f4Var;
            i = i4;
        }
        long msgId = f4Var.getMsgId();
        this.f56075n.f183106h = C72996z1.m85820U5(f4Var.mo108768t());
        this.f56070f = msgId;
        MMHandlerThread.postToMainThread(new C19721d(bVar2));
        C8477a0 a0Var = new C8477a0();
        C8477a0 a0Var2 = new C8477a0();
        C8478d0 d0Var = new C8478d0();
        Activity f = bVar.mo91565f();
        C19723b5 b5Var = new C19723b5(this, bVar2, arrayList);
        if (C19843m.f56474a == null) {
            C19843m.f56474a = new TextToSpeech(f.getApplicationContext(), b5Var);
        }
        AudioManager audioManager = (AudioManager) f.getSystemService("audio");
        C19843m.f56475b = audioManager;
        audioManager.setMode(0);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        Boolean bool = Boolean.FALSE;
        Object e = u.mo119684e(26, bool);
        boolean z = !((e == null || !(e instanceof Boolean)) ? false : ((Boolean) e).booleanValue());
        AudioManager audioManager2 = C19843m.f56475b;
        if (audioManager2 != null) {
            if (z) {
                audioManager2.setSpeakerphoneOn(true);
                C19843m.f56475b.setMode(0);
            } else {
                audioManager2.setSpeakerphoneOn(false);
                C19843m.f56475b.setMode(3);
            }
        }
        this.f56071g.mo33553b();
        C21421f fVar = this.f56071g;
        Object e2 = C97625j3.m125812b().mo105906u().mo119684e(26, bool);
        boolean z2 = !((e2 == null || !(e2 instanceof Boolean)) ? false : ((Boolean) e2).booleanValue());
        Log.m105924i(fVar.f60620b, "switchSpeaker: " + z2);
        C21412a aVar = fVar.f60623e;
        int i5 = aVar.f60594d;
        Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "setPlayParams " + z2 + ", sampleRate: " + i5 + "; curPR: " + aVar.f60593c + ", curSR: " + aVar.f60594d);
        synchronized (aVar.f60596f) {
            Log.m105924i("MicroMsg.MSP.AudioTrackAudioPlayer", "real do");
            AudioTrack audioTrack = aVar.f60592b;
            if (audioTrack != null) {
                if (audioTrack.getPlayState() == 3) {
                    aVar.mo33544c(z2, i5);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            aVar.f60593c = z2;
            aVar.f60594d = i5;
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
        this.f56071g.mo33555d();
        C21421f fVar2 = this.f56071g;
        C19727c5 c5Var = new C19727c5(arrayList, this, a0Var, bVar, msgId, d0Var, a0Var2);
        Log.m105924i(fVar2.f60620b, "setAudioFilePlayStateListener");
        fVar2.f60625g = c5Var;
        LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
        if (lifecycleScope != null) {
            LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C44819d5(arrayList, this, msgId, (C15601d<? super C44819d5>) null), 1, (Object) null);
        }
    }
}
