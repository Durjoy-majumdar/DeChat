package th2;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: th2.e */
public final class C64938e {

    /* renamed from: a */
    public static final C64938e f186988a = new C64938e();

    /* renamed from: a */
    public final void mo89090a(boolean z, int i, int i2) {
        boolean z2 = z;
        int i3 = i;
        int i4 = i2;
        Log.m105924i("MicroMsg.StoryRemuxIDKeyStat", "markStoryRemuxResult, isLocalCapture:" + z2 + ", bitrate:" + i3 + ", fps:" + i4);
        if (z2) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(986, 56, 1);
            nVar.mo175913w(986, 60, (long) i3);
            nVar.mo175913w(986, 63, (long) i4);
            return;
        }
        C115669n nVar2 = C115669n.INSTANCE;
        nVar2.mo175913w(986, 57, 1);
        nVar2.mo175913w(986, 66, (long) i3);
        nVar2.mo175913w(986, 69, (long) i4);
    }
}
