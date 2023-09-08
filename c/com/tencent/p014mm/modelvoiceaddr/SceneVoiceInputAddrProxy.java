package com.tencent.p014mm.modelvoiceaddr;

import com.tencent.p014mm.modelvoiceaddr.C17800a;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ef3.C86513a;
import ef3.C86514b;
import java.util.List;

/* renamed from: com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy */
public class SceneVoiceInputAddrProxy extends C96897a implements C17800a {

    /* renamed from: i */
    public static SceneVoiceInputAddrProxy f267516i;

    /* renamed from: f */
    public C17800a f267517f;

    /* renamed from: g */
    public C17800a.C17801a f267518g;

    /* renamed from: h */
    public C96905d f267519h;

    /* renamed from: com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy$a */
    public class C92864a implements Runnable {
        public C92864a(SceneVoiceInputAddrProxy sceneVoiceInputAddrProxy) {
        }

        public void run() {
            Log.m105924i("SceneVoiceInputAddrProxy", "remote service connected");
        }
    }

    /* renamed from: com.tencent.mm.modelvoiceaddr.SceneVoiceInputAddrProxy$b */
    public class C92865b implements C17800a.C17801a {
        public C92865b() {
        }

        /* renamed from: a */
        public void mo21933a() {
            SceneVoiceInputAddrProxy.this.CLIENT_CALL("onRecognizeFinishCli", new Object[0]);
        }

        /* renamed from: b */
        public void mo21934b(String[] strArr, List<String> list) {
            SceneVoiceInputAddrProxy.this.CLIENT_CALL("onResCli", strArr, list);
        }

        /* renamed from: c */
        public void mo21935c(int i, int i2, int i3, long j) {
            SceneVoiceInputAddrProxy.this.CLIENT_CALL("onErrorCli", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Long.valueOf(j));
        }

        /* renamed from: d */
        public void mo21936d() {
            SceneVoiceInputAddrProxy.this.CLIENT_CALL("onRecordFinCli", new Object[0]);
        }
    }

    public SceneVoiceInputAddrProxy(C96905d dVar) {
        super(dVar);
        if (dVar != null) {
            this.f267519h = dVar;
            dVar.mo135257a(new C92864a(this));
        }
    }

    public static void create(C96905d dVar) {
        f267516i = new SceneVoiceInputAddrProxy(dVar);
    }

    public static SceneVoiceInputAddrProxy getInstance() {
        if (f267516i == null) {
            create(new C96905d(MMApplicationContext.getContext()));
        }
        return f267516i;
    }

    @C86513a
    public void cancel(boolean z) {
        REMOTE_CALL("cancelMM", Boolean.valueOf(z));
    }

    @C86514b
    public void cancelMM(boolean z) {
        if (getInstance().f267517f != null) {
            ((C92866b) getInstance().f267517f).cancel(z);
        }
    }

    public void connect(Runnable runnable) {
        C96905d dVar = this.f267519h;
        if (dVar != null) {
            dVar.mo135257a(runnable);
        }
    }

    @C86513a
    public int getMaxAmplitudeRate() {
        Integer num = (Integer) REMOTE_CALL("getMaxAmplitudeRateMM", new Object[0]);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @C86514b
    public int getMaxAmplitudeRateMM() {
        if (getInstance().f267517f != null) {
            return ((C92866b) getInstance().f267517f).getMaxAmplitudeRate();
        }
        return 0;
    }

    public void init(int i, int i2, C17800a.C17801a aVar) {
        getInstance().f267518g = aVar;
        REMOTE_CALL("initMM", Integer.valueOf(i), Integer.valueOf(i2));
    }

    @C86514b
    public void initMM(int i, int i2) {
        getInstance().f267517f = new C92866b(i, i2, new C92865b());
    }

    public boolean isConnected() {
        C96905d dVar = this.f267519h;
        if (dVar == null) {
            return false;
        }
        return dVar.mo135259c();
    }

    @C86513a
    public void onErrorCli(int i, int i2, int i3, long j) {
        if (getInstance().f267518g != null) {
            getInstance().f267518g.mo21935c(i, i2, i3, j);
        }
    }

    @C86513a
    public void onRecognizeFinishCli() {
        if (getInstance().f267518g != null) {
            getInstance().f267518g.mo21933a();
        }
    }

    @C86513a
    public void onRecordFinCli() {
        if (getInstance().f267518g != null) {
            getInstance().f267518g.mo21936d();
        }
    }

    @C86513a
    public void onResCli(String[] strArr, List<String> list) {
        if (getInstance().f267518g != null) {
            getInstance().f267518g.mo21934b(strArr, list);
        }
    }

    @C86513a
    public void start() {
        REMOTE_CALL("startMM", new Object[0]);
    }

    @C86514b
    public void startMM() {
        if (getInstance().f267517f != null) {
            ((C92866b) getInstance().f267517f).start();
        }
    }

    @C86513a
    public void stop(boolean z) {
        REMOTE_CALL("stopMM", Boolean.valueOf(z));
    }

    @C86514b
    public void stopMM(boolean z) {
        if (getInstance().f267517f != null) {
            ((C92866b) getInstance().f267517f).stop(z);
        }
    }
}
