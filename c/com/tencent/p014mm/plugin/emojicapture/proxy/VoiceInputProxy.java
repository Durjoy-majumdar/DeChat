package com.tencent.p014mm.plugin.emojicapture.proxy;

import com.tencent.p014mm.modelvoiceaddr.C92866b;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import ef3.C86513a;
import ef3.C86514b;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u0002H\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, mo182094d2 = {"Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy;", "Lcom/tencent/mm/remoteservice/a;", "Lrx3/b0;", "start", "", "fromUI", "stop", "", "voiceText", "onRes", "onRecongnizeFinish", "", "getMaxAmplitudeRate", "startRemote", "getMaxAmplitudeRateRemote", "stopRemote", "Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$a;", "f", "Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$a;", "getUiCallback", "()Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$a;", "setUiCallback", "(Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$a;)V", "uiCallback", "Lcom/tencent/mm/remoteservice/d;", "serverProxy", "<init>", "(Lcom/tencent/mm/plugin/emojicapture/proxy/VoiceInputProxy$a;Lcom/tencent/mm/remoteservice/d;)V", "a", "plugin-emojicapture_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emojicapture.proxy.VoiceInputProxy */
public final class VoiceInputProxy extends C96897a {

    /* renamed from: h */
    public static C92866b f269157h;

    /* renamed from: f */
    public C93281a f269158f;

    /* renamed from: g */
    public final String f269159g = "MicroMsg.VoiceInputProxy";

    /* renamed from: com.tencent.mm.plugin.emojicapture.proxy.VoiceInputProxy$a */
    public interface C93281a {
        /* renamed from: a */
        void mo127983a();

        /* renamed from: b */
        void mo127984b(String str);
    }

    /* renamed from: com.tencent.mm.plugin.emojicapture.proxy.VoiceInputProxy$b */
    public static final class C93282b implements C92866b.C68146d {

        /* renamed from: a */
        public final /* synthetic */ VoiceInputProxy f269160a;

        public C93282b(VoiceInputProxy voiceInputProxy) {
            this.f269160a = voiceInputProxy;
        }

        /* renamed from: a */
        public void mo21933a() {
            Log.m105924i(this.f269160a.f269159g, "onRecognizeFinish");
            this.f269160a.CLIENT_CALL("onRecognizeFinish", new Object[0]);
        }

        /* renamed from: b */
        public void mo21934b(String[] strArr, List<String> list) {
            if (strArr != null) {
                if (!(strArr.length == 0)) {
                    if (strArr[0].length() > 0) {
                        String str = strArr[0];
                        String access$getTAG$p = this.f269160a.f269159g;
                        Log.m105924i(access$getTAG$p, "onRes remote " + str);
                        int H = C112550d0.m153772H(str, "。", 0, false, 6, (Object) null);
                        if (H >= 0) {
                            str = str.substring(0, H);
                            C87412m.m108593f(str, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        this.f269160a.CLIENT_CALL("onRes", str);
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo21935c(int i, int i2, int i3, long j) {
            String access$getTAG$p = this.f269160a.f269159g;
            Log.m105928w(access$getTAG$p, "onError " + i + ' ' + i2 + ' ' + i3 + ' ' + j);
        }

        /* renamed from: d */
        public void mo21936d() {
            Log.m105924i(this.f269160a.f269159g, "onRecordFin");
        }
    }

    public VoiceInputProxy(C93281a aVar, C96905d dVar) {
        super(dVar);
        this.f269158f = aVar;
    }

    @C86513a
    public final int getMaxAmplitudeRate() {
        Object REMOTE_CALL = REMOTE_CALL("getMaxAmplitudeRateRemote", new Object[0]);
        if (REMOTE_CALL == null || !(REMOTE_CALL instanceof Integer)) {
            return 0;
        }
        return ((Number) REMOTE_CALL).intValue();
    }

    @C86514b
    public final int getMaxAmplitudeRateRemote() {
        String str = this.f269159g;
        Log.m105918d(str, "getMaxAmplitudeRateRemote call " + f269157h);
        C92866b bVar = f269157h;
        if (bVar == null) {
            return 0;
        }
        C87412m.m108591d(bVar);
        return bVar.getMaxAmplitudeRate();
    }

    public final C93281a getUiCallback() {
        return this.f269158f;
    }

    @C86513a
    public final void onRecongnizeFinish() {
        C93281a aVar = this.f269158f;
        if (aVar != null) {
            aVar.mo127983a();
        }
    }

    @C86513a
    public final void onRes(String str) {
        C93281a aVar = this.f269158f;
        if (aVar != null) {
            aVar.mo127984b(str);
        }
    }

    public final void setUiCallback(C93281a aVar) {
        this.f269158f = aVar;
    }

    @C86513a
    public final void start() {
        REMOTE_CALL("startRemote", new Object[0]);
    }

    @C86514b
    public final void startRemote() {
        C92866b bVar = new C92866b(1, 9, new C93282b(this));
        f269157h = bVar;
        bVar.start();
    }

    @C86513a
    public final void stop(boolean z) {
        REMOTE_CALL("stopRemote", Boolean.valueOf(z));
    }

    @C86514b
    public final void stopRemote(boolean z) {
        C92866b bVar = f269157h;
        if (bVar != null) {
            bVar.stop(z);
        }
        f269157h = null;
    }
}
