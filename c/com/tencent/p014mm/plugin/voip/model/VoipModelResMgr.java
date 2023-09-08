package com.tencent.p014mm.plugin.voip.model;

import a70.C112760b;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import p523fp.C32147e;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.voip.model.VoipModelResMgr */
public final class VoipModelResMgr {

    /* renamed from: a */
    public static final VoipModelResMgr f207454a = new VoipModelResMgr();

    /* renamed from: b */
    public static final IListener<CheckResUpdateCacheFileEvent> f207455b = new VoipModelResMgr$checkResUpdateCacheFileEventListener$1(C40008f.f107254d);

    /* renamed from: c */
    public static final String f207456c = ((C112760b.m154231g() + "voip") + XVFSFile.SEPARATOR_CHAR + "Models");

    /* renamed from: com.tencent.mm.plugin.voip.model.VoipModelResMgr$a */
    public static final class C71578a implements Runnable {

        /* renamed from: d */
        public static final C71578a f207457d = new C71578a();

        public final void run() {
            ((C32147e) C86312j.m106911c(C32147e.class)).Yi0(112);
        }
    }

    /* renamed from: a */
    public final void mo98749a(int i, int i2) {
        String AD = ((C32147e) C86312j.m106911c(C32147e.class)).mo58507AD(i, i2);
        switch (i2) {
            case 1:
                String str = f207456c + "/rnnoise_16k.bin";
                Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + AD + " modelfile: " + str);
                long d = C86013q1.m106443d(AD, str, false);
                StringBuilder sb = new StringBuilder();
                sb.append("results ");
                sb.append(d);
                Log.m105924i("MicroMsg.VoipModelResMgr", sb.toString());
                return;
            case 2:
                String str2 = f207456c + "/rnnoise_48k.bin";
                Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + AD + " modelfile: " + str2);
                long d2 = C86013q1.m106443d(AD, str2, false);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("results ");
                sb4.append(d2);
                Log.m105924i("MicroMsg.VoipModelResMgr", sb4.toString());
                return;
            case 3:
                String str3 = f207456c + "/cldnn_ns_16k.bin";
                Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + AD + " modelfile: " + str3);
                long d3 = C86013q1.m106443d(AD, str3, false);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("results ");
                sb5.append(d3);
                Log.m105924i("MicroMsg.VoipModelResMgr", sb5.toString());
                return;
            case 4:
                String str4 = f207456c + "/cldnn_ns_48k.bin";
                Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + AD + " modelfile: " + str4);
                long d4 = C86013q1.m106443d(AD, str4, false);
                StringBuilder sb6 = new StringBuilder();
                sb6.append("results ");
                sb6.append(d4);
                Log.m105924i("MicroMsg.VoipModelResMgr", sb6.toString());
                return;
            case 5:
                String str5 = f207456c + "/fsnet_16k.bin";
                Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + AD + " modelfile: " + str5);
                long d5 = C86013q1.m106443d(AD, str5, false);
                StringBuilder sb7 = new StringBuilder();
                sb7.append("results ");
                sb7.append(d5);
                Log.m105924i("MicroMsg.VoipModelResMgr", sb7.toString());
                return;
            case 6:
                String str6 = f207456c + "/fsnet_48k.bin";
                Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + AD + " modelfile: " + str6);
                long d6 = C86013q1.m106443d(AD, str6, false);
                StringBuilder sb8 = new StringBuilder();
                sb8.append("results ");
                sb8.append(d6);
                Log.m105924i("MicroMsg.VoipModelResMgr", sb8.toString());
                return;
            case 7:
                String str7 = f207456c + "/rnnhowlsup_16k.bin";
                Log.m105924i("MicroMsg.VoipModelResMgr", "activePath: " + AD + " modelfile: " + str7);
                long d7 = C86013q1.m106443d(AD, str7, false);
                StringBuilder sb9 = new StringBuilder();
                sb9.append("results ");
                sb9.append(d7);
                Log.m105924i("MicroMsg.VoipModelResMgr", sb9.toString());
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final void mo98750b(StringBuilder sb) {
        C87412m.m108594g(sb, "stringBuilder");
        sb.append(f207456c);
    }

    /* renamed from: c */
    public final void mo98751c(StringBuilder sb, int i, int i2) {
        C87412m.m108594g(sb, "stringBuilder");
        sb.append(((C32147e) C86312j.m106911c(C32147e.class)).mo58513e6(i, i2));
    }

    /* renamed from: d */
    public final void mo98752d() {
        Log.m105924i("MicroMsg.VoipModelResMgr", "init: ");
        f207455b.alive();
        ((C119157j) C119157j.f356862d).mo183878i(C71578a.f207457d, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        boolean v = C86013q1.m106461v(f207456c);
        Log.m105924i("MicroMsg.VoipModelResMgr", "mkdirresults: " + v);
        mo98749a(112, 1);
        mo98749a(112, 2);
        mo98749a(112, 3);
        mo98749a(112, 4);
        mo98749a(112, 5);
        mo98749a(112, 6);
        mo98749a(112, 7);
    }
}
