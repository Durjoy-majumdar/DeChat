package p371ph;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.PlaySound;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import p156gj.C107835h0;
import p302ch.C16928a;
import p375qh.C22086d;

/* renamed from: ph.c */
public class C21972c implements C22086d.C22087a {

    /* renamed from: a */
    public final /* synthetic */ C21967a f62217a;

    /* renamed from: ph.c$a */
    public class C21973a implements Runnable {

        /* renamed from: ph.c$a$a */
        public class C21974a implements Runnable {

            /* renamed from: ph.c$a$a$a */
            public class C21975a implements PlaySound.OnPlayCompletionListener {
                public C21975a() {
                }

                public void onCompletion() {
                    Log.m105924i("MicroMsg.SceneVoicePlayer", "play sound end onCompletion");
                    if (!C21972c.this.f62217a.mo35058b()) {
                        Log.m105925i("MicroMsg.SceneVoicePlayer", "onCompletion() continuousPlay:%s", Boolean.valueOf(C21972c.this.f62217a.f62202c));
                        C21967a aVar = C21972c.this.f62217a;
                        aVar.f62210k.mo18023f0(aVar.f62202c);
                        C21967a aVar2 = C21972c.this.f62217a;
                        aVar2.f62202c = false;
                        C21972c.this.f62217a.getClass();
                        Log.m105925i("MicroMsg.SceneVoicePlayer", "onCompletion() abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", Boolean.valueOf(aVar2.f62207h), Boolean.FALSE);
                        Log.m105924i("MicroMsg.SceneVoicePlayer", "onCompletion() resetSpeaker");
                    }
                }
            }

            /* renamed from: ph.c$a$a$b */
            public class C21976b implements Runnable {
                public C21976b() {
                }

                public void run() {
                    if (C21972c.this.f62217a.f62212m != null) {
                        Log.m105924i("MicroMsg.SceneVoicePlayer", "intOnCompletion onCompletion()");
                        C21972c.this.f62217a.f62212m.onCompletion();
                        return;
                    }
                    Log.m105920e("MicroMsg.SceneVoicePlayer", "intOnCompletion is null!!!");
                }
            }

            public C21974a() {
            }

            public void run() {
                C16928a aVar = C21972c.this.f62217a.f62210k;
                aVar.mo18028n(aVar.f45754r);
                C21967a aVar2 = C21972c.this.f62217a;
                aVar2.getClass();
                PlaySound.play(aVar2.f62201b, C0966R.string.hjz, aVar2.f62210k.f45754r, false, new C21975a());
                MMHandlerThread.postToMainThread(new C21976b());
            }
        }

        public C21973a() {
        }

        public void run() {
            try {
                if (C107835h0.f322846c.f322749j == 1) {
                    Thread.sleep(300);
                }
                Log.m105925i("MicroMsg.SceneVoicePlayer", "onCompletion, intOnCompletion: %s, shouldPlayComplete: %s", C21972c.this.f62217a.f62212m, Boolean.TRUE);
                MMHandlerThread.postToMainThread(new C21974a());
                C22086d dVar = C21972c.this.f62217a.f62200a;
                if (dVar != null) {
                    dVar.mo33328d((C22086d.C22087a) null);
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SceneVoicePlayer", "exception:%s", Util.stackTraceToString(e));
            }
        }
    }

    public C21972c(C21967a aVar) {
        this.f62217a = aVar;
    }

    public void onCompletion() {
        ThreadPool.post(new C21973a(), "SceneVoice_onCompletion");
    }
}
