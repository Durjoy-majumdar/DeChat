package com.tencent.p014mm.p136ui.chatting.component;

import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.tools.C19843m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C8478d0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import ld0.C21421f;
import te3.ea4;
import te3.fa4;
import z04.C112550d0;
import zj3.C79341b1;

/* renamed from: com.tencent.mm.ui.chatting.component.b5 */
public final class C19723b5 implements TextToSpeech.OnInitListener {

    /* renamed from: a */
    public final /* synthetic */ C19717a5 f56082a;

    /* renamed from: b */
    public final /* synthetic */ C67391b f56083b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList<ea4> f56084c;

    /* renamed from: com.tencent.mm.ui.chatting.component.b5$a */
    public static final class C19724a extends UtteranceProgressListener {

        /* renamed from: a */
        public final /* synthetic */ C19717a5 f56085a;

        /* renamed from: b */
        public final /* synthetic */ C67391b f56086b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList<ea4> f56087c;

        /* renamed from: com.tencent.mm.ui.chatting.component.b5$a$a */
        public static final class C19725a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C67391b f56088d;

            public C19725a(C67391b bVar) {
                this.f56088d = bVar;
            }

            public final void run() {
                this.f56088d.mo91540A();
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.component.b5$a$b */
        public static final class C19726b implements MTimerHandler.CallBack {

            /* renamed from: d */
            public final /* synthetic */ C8478d0 f56089d;

            /* renamed from: e */
            public final /* synthetic */ ea4 f56090e;

            /* renamed from: f */
            public final /* synthetic */ C19717a5 f56091f;

            /* renamed from: g */
            public final /* synthetic */ long f56092g;

            public C19726b(C8478d0 d0Var, ea4 ea4, C19717a5 a5Var, long j) {
                this.f56089d = d0Var;
                this.f56090e = ea4;
                this.f56091f = a5Var;
                this.f56092g = j;
            }

            public final boolean onTimerExpired() {
                C8478d0 d0Var = this.f56089d;
                int i = d0Var.f27483d + 1;
                d0Var.f27483d = i;
                ea4 ea4 = this.f56090e;
                if (i > ea4.f132830e + ea4.f132829d.length()) {
                    Log.m105918d("MicroMsg.TextToSpeechComponent", "notify stopTimer");
                } else {
                    C79341b1.C79342a aVar = this.f56091f.f56072h;
                    if (aVar != null) {
                        aVar.mo103136a(this.f56089d.f27483d, Long.valueOf(this.f56092g));
                    }
                }
                return true;
            }
        }

        public C19724a(C19717a5 a5Var, C67391b bVar, ArrayList<ea4> arrayList) {
            this.f56085a = a5Var;
            this.f56086b = bVar;
            this.f56087c = arrayList;
        }

        public void onDone(String str) {
            C87412m.m108594g(str, "utteranceId");
            List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
            long parseLong = Long.parseLong((String) U.get(0));
            boolean z = true;
            int parseInt = Integer.parseInt((String) U.get(1));
            int i = parseInt + 1;
            ea4 ea4 = this.f56087c.get(parseInt);
            C87412m.m108593f(ea4, "inputText[index]");
            ea4 ea42 = ea4;
            MTimerHandler mTimerHandler = this.f56085a.f56073i;
            C87412m.m108591d(mTimerHandler);
            mTimerHandler.stopTimer();
            Log.m105919d("MicroMsg.TextToSpeechComponent", "play with android tts  onDone:%s", str);
            int length = ea42.f132830e + ea42.f132829d.length();
            C79341b1.C79342a aVar = this.f56085a.f56072h;
            if (aVar != null) {
                aVar.mo103136a(length, Long.valueOf(parseLong));
            }
            if (parseInt == this.f56087c.size() - 1) {
                Log.m105924i("MicroMsg.TextToSpeechComponent", "notify end");
                this.f56085a.mo26164Y5(2);
                this.f56085a.mo26168c6(this.f56086b);
                return;
            }
            ea4 ea43 = this.f56087c.get(i);
            if (ea43 == null || !ea43.f132831f) {
                z = false;
            }
            if (z) {
                C19717a5 a5Var = this.f56085a;
                String str2 = this.f56087c.get(i).f132829d;
                C87412m.m108593f(str2, "inputText[next].subText");
                a5Var.mo26167b6(i, parseLong, str2);
                return;
            }
            Log.m105918d("MicroMsg.TextToSpeechComponent", "play resume");
            C21421f fVar = this.f56085a.f56071g;
            Log.m105924i(fVar.f60620b, "resume");
            fVar.f60623e.mo33543b(false);
        }

        public void onError(String str) {
            C87412m.m108594g(str, "utteranceId");
        }

        public void onStart(String str) {
            C87412m.m108594g(str, "utteranceId");
            List U = C112550d0.m153785U(str, new String[]{"_"}, false, 0, 6, (Object) null);
            long parseLong = Long.parseLong((String) U.get(0));
            int parseInt = Integer.parseInt((String) U.get(1));
            Log.m105925i("MicroMsg.TextToSpeechComponent", "play with android tts onStart:%s, msgId:%s, index:%s", str, Long.valueOf(parseLong), Integer.valueOf(parseInt));
            if (parseInt == 0) {
                Log.m105924i("MicroMsg.TextToSpeechComponent", "notify start");
                this.f56085a.mo26165Z5(this.f56086b);
                this.f56085a.mo26166a6(this.f56086b);
                C19717a5 a5Var = this.f56085a;
                a5Var.f56069e = parseLong;
                a5Var.f56075n.f183102d = parseLong;
                a5Var.f56070f = 0;
                MMHandlerThread.postToMainThread(new C19725a(this.f56086b));
            }
            fa4 fa4 = this.f56085a.f56075n;
            if (parseInt >= fa4.f183103e) {
                fa4.f183103e = parseInt + 1;
            }
            ea4 ea4 = this.f56087c.get(parseInt);
            C87412m.m108593f(ea4, "inputText[index]");
            ea4 ea42 = ea4;
            C8478d0 d0Var = new C8478d0();
            int i = ea42.f132830e;
            d0Var.f27483d = i;
            C79341b1.C79342a aVar = this.f56085a.f56072h;
            if (aVar != null) {
                aVar.mo103136a(i, Long.valueOf(parseLong));
            }
            this.f56085a.f56073i = new MTimerHandler(Looper.getMainLooper(), (MTimerHandler.CallBack) new C19726b(d0Var, ea42, this.f56085a, parseLong), true);
            MTimerHandler mTimerHandler = this.f56085a.f56073i;
            C87412m.m108591d(mTimerHandler);
            mTimerHandler.startTimer(0, 200);
        }
    }

    public C19723b5(C19717a5 a5Var, C67391b bVar, ArrayList<ea4> arrayList) {
        this.f56082a = a5Var;
        this.f56083b = bVar;
        this.f56084c = arrayList;
    }

    public final void onInit(int i) {
        TextToSpeech textToSpeech;
        if (i == 0 && (textToSpeech = C19843m.f56474a) != null) {
            textToSpeech.setOnUtteranceProgressListener(new C19724a(this.f56082a, this.f56083b, this.f56084c));
        }
    }
}
