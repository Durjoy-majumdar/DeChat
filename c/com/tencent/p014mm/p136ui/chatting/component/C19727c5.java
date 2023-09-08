package com.tencent.p014mm.p136ui.chatting.component;

import ck3.C67391b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import gy3.C8477a0;
import gy3.C8478d0;
import gy3.C87412m;
import java.util.ArrayList;
import ld0.C21416c;
import ld0.C21421f;
import te3.ea4;
import te3.fa4;
import zj3.C79341b1;

/* renamed from: com.tencent.mm.ui.chatting.component.c5 */
public final class C19727c5 implements C21416c {

    /* renamed from: a */
    public final /* synthetic */ ArrayList<ea4> f56093a;

    /* renamed from: b */
    public final /* synthetic */ C19717a5 f56094b;

    /* renamed from: c */
    public final /* synthetic */ C8477a0 f56095c;

    /* renamed from: d */
    public final /* synthetic */ C67391b f56096d;

    /* renamed from: e */
    public final /* synthetic */ long f56097e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f56098f;

    /* renamed from: g */
    public final /* synthetic */ C8477a0 f56099g;

    /* renamed from: com.tencent.mm.ui.chatting.component.c5$a */
    public static final class C19728a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C67391b f56100d;

        public C19728a(C67391b bVar) {
            this.f56100d = bVar;
        }

        public final void run() {
            this.f56100d.mo91540A();
        }
    }

    public C19727c5(ArrayList<ea4> arrayList, C19717a5 a5Var, C8477a0 a0Var, C67391b bVar, long j, C8478d0 d0Var, C8477a0 a0Var2) {
        this.f56093a = arrayList;
        this.f56094b = a5Var;
        this.f56095c = a0Var;
        this.f56096d = bVar;
        this.f56097e = j;
        this.f56098f = d0Var;
        this.f56099g = a0Var2;
    }

    /* renamed from: a */
    public void mo26182a(String str, int i, float f) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        if (i < this.f56093a.size()) {
            fa4 fa4 = this.f56094b.f56075n;
            if (i >= fa4.f183103e) {
                fa4.f183103e = i + 1;
                fa4.f183104f++;
            }
            if (i == 0 && !this.f56095c.f27482d) {
                Log.m105924i("MicroMsg.TextToSpeechComponent", "notify start");
                this.f56094b.mo26165Z5(this.f56096d);
                this.f56094b.mo26166a6(this.f56096d);
                C19717a5 a5Var = this.f56094b;
                long j = this.f56097e;
                a5Var.f56069e = j;
                a5Var.f56075n.f183102d = j;
                a5Var.f56070f = 0;
                this.f56095c.f27482d = true;
                MMHandlerThread.postToMainThread(new C19728a(this.f56096d));
            }
            ea4 ea4 = this.f56093a.get(i);
            C87412m.m108593f(ea4, "inputText[audioIndexPos]");
            ea4 ea42 = ea4;
            int i2 = ea42.f132830e;
            String str2 = ea42.f132829d;
            int ceil = i2 + ((int) Math.ceil((double) (((float) (str2 != null ? str2.length() : 0)) * f)));
            if (ceil != this.f56098f.f27483d) {
                C79341b1.C79342a aVar = this.f56094b.f56072h;
                if (aVar != null) {
                    aVar.mo103136a(ceil, Long.valueOf(this.f56097e));
                }
                this.f56098f.f27483d = ceil;
            }
        }
    }

    /* renamed from: b */
    public void mo26183b(String str, int i) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        Log.m105924i("MicroMsg.TextToSpeechComponent", "MicroMsg.MSP " + str + " oncomp");
        if (i < this.f56093a.size() && this.f56093a.size() > 0 && str.length() > 0) {
            if (i == this.f56093a.size() - 1 && !this.f56099g.f27482d) {
                Log.m105924i("MicroMsg.TextToSpeechComponent", "notify end");
                this.f56099g.f27482d = true;
                this.f56094b.mo26164Y5(2);
                this.f56094b.mo26168c6(this.f56096d);
            }
            ea4 ea4 = this.f56093a.get(i);
            C87412m.m108593f(ea4, "inputText[audioIndexPos]");
            ea4 ea42 = ea4;
            int i2 = ea42.f132830e;
            String str2 = ea42.f132829d;
            int length = i2 + (str2 != null ? str2.length() : 0);
            if (length != this.f56098f.f27483d) {
                C79341b1.C79342a aVar = this.f56094b.f56072h;
                if (aVar != null) {
                    aVar.mo103136a(length, Long.valueOf(this.f56097e));
                }
                this.f56098f.f27483d = length;
            }
            int i3 = i + 1;
            if (i3 < this.f56093a.size()) {
                ea4 ea43 = this.f56093a.get(i3);
                if (ea43 != null && ea43.f132831f) {
                    Log.m105925i("MicroMsg.TextToSpeechComponent", "notify pausePlay, index: %s", Integer.valueOf(i));
                    C21421f fVar = this.f56094b.f56071g;
                    Log.m105924i(fVar.f60620b, "pausePlay");
                    fVar.f60623e.mo33543b(true);
                    C19717a5 a5Var = this.f56094b;
                    long j = this.f56097e;
                    ea4 ea44 = this.f56093a.get(i3);
                    String str3 = ea44 != null ? ea44.f132829d : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    a5Var.mo26167b6(i3, j, str3);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo26184c() {
        Log.m105924i("MicroMsg.TextToSpeechComponent", "MicroMsg.MSP onPlayInterrupt");
        this.f56094b.mo26168c6(this.f56096d);
    }
}
