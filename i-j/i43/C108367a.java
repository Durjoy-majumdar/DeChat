package i43;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.voip.model.C106333b;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import k43.C108886d;
import m43.C109499b;
import ou0.C110072e;
import p156gj.C107823c;
import p156gj.C107835h0;
import p375qh.C110390f;
import p910lj.C76701a;
import pu0.C110248b;
import qu0.C110472b;
import z33.C112597j;

/* renamed from: i43.a */
public final class C108367a extends C110072e {

    /* renamed from: l */
    public C110390f f324418l;

    /* renamed from: m */
    public C106336d f324419m;

    /* renamed from: i43.a$a */
    public static final class C108368a implements C106333b {

        /* renamed from: a */
        public static final C108368a f324420a = new C108368a();

        /* renamed from: a */
        public final int mo149458a(byte[] bArr, int i) {
            Log.m105918d("MicroMsg.cs.VoIPCsAudioManager", "PlayDevDataCallBack,pcm data len:" + bArr.length);
            int playCallback = C108886d.wx0().f327737a.playCallback(bArr, i);
            if (playCallback != 0) {
                Log.m105918d("MicroMsg.cs.VoIPCsAudioManager", "PlayDevDataCallBack is failure! pc data:" + bArr.length + ",ret:" + playCallback);
            }
            return playCallback != 0 ? 1 : 0;
        }
    }

    /* renamed from: i43.a$b */
    public static final class C108369b implements C110390f.C89659b {
        /* renamed from: a */
        public void mo35508a(byte[] bArr, int i) {
            C87412m.m108594g(bArr, "pcm");
            if (i <= 0) {
                Log.m105920e("MicroMsg.cs.VoIPCsAudioManager", "pcm data len <= 0");
                return;
            }
            Log.m105918d("MicroMsg.cs.VoIPCsAudioManager", "onRecPcmDataReady,pcm data len:" + bArr.length);
            int recordCallback = C108886d.wx0().f327737a.recordCallback(bArr, i);
            Log.m105918d("MicroMsg.cs.VoIPCsAudioManager", "recordCallback,ret:" + recordCallback);
        }

        /* renamed from: b */
        public void mo35509b(int i, int i2) {
            Log.m105925i("MicroMsg.cs.VoIPCsAudioManager", "OnPcmRecListener onRecError %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public C108367a() {
        C108368a aVar = C108368a.f324420a;
        C108369b bVar = new C108369b();
        mo157512y();
        int i = v2protocal.f317532S1;
        C110390f fVar = new C110390f(i, 1, 1);
        this.f324418l = fVar;
        fVar.mo161902g(20);
        C110390f fVar2 = this.f324418l;
        if (fVar2 != null) {
            fVar2.mo161905j(true);
        }
        C110390f fVar3 = this.f324418l;
        if (fVar3 != null) {
            fVar3.mo161901f(true);
        }
        C110390f fVar4 = this.f324418l;
        if (fVar4 != null) {
            fVar4.mo161903h(1, false);
        }
        C110390f fVar5 = this.f324418l;
        if (fVar5 != null) {
            fVar5.mo161904i(true);
        }
        C110390f fVar6 = this.f324418l;
        if (fVar6 != null) {
            fVar6.f330245x = bVar;
        }
        C106336d dVar = new C106336d();
        this.f324419m = dVar;
        dVar.mo152544c(i, 1, 20, 0);
        C106336d dVar2 = this.f324419m;
        if (dVar2 != null) {
            dVar2.mo152543b(MMApplicationContext.getContext(), false);
        }
        C106336d dVar3 = this.f324419m;
        if (dVar3 != null) {
            dVar3.f317212q = aVar;
        }
        C110248b.f329777h.mo161664i(this, "voipcs");
    }

    /* renamed from: R */
    public void mo18021R(int i) {
        super.mo18021R(i);
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 7:
                mo161477T("voipcs");
                mo158858f0(true);
                return;
            case 2:
                mo158858f0(false);
                return;
            case 8:
                mo158858f0(false);
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.kje), 0).show();
                return;
            case 9:
                mo158858f0(true);
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.kjf), 0).show();
                return;
            default:
                return;
        }
    }

    /* renamed from: f0 */
    public final void mo158858f0(boolean z) {
        C106336d dVar;
        C106336d dVar2;
        Log.printDebugStack("MicroMsg.cs.VoIPCsAudioManager", "enableSpeaker: " + z, new Object[0]);
        boolean z2 = C110472b.f330365a.mo161951b() ? false : z;
        C107823c cVar = C107835h0.f322846c;
        if (cVar.f322730a) {
            cVar.mo158230d();
            if (C107835h0.f322846c.f322733b > 0 && (dVar2 = this.f324419m) != null) {
                dVar2.mo152552k(z2);
            }
        }
        C107823c cVar2 = C107835h0.f322846c;
        if ((cVar2.f322692H > -1 || cVar2.f322694I > -1) && (dVar = this.f324419m) != null) {
            dVar.mo152552k(z);
        }
        C106336d dVar3 = this.f324419m;
        if (dVar3 != null) {
            mo161491e0(z, dVar3.mo152548g(), false);
            C109499b wx02 = C108886d.wx0();
            int z3 = z ? wx02.f327737a.mo152852z(401) : wx02.f327737a.mo152852z(402);
            if (z3 < 0) {
                C112597j.m153936a("MicroMsg.VoipCSEngine", "voipContext trySwitchSpeakerPhone ret:" + z3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r5 = r4.f324419m;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo158859g0(boolean r5) {
        /*
            r4 = this;
            pu0.b$a r0 = pu0.C110248b.f329777h
            boolean r1 = r0.mo161665j()
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L_0x000f
            int r2 = r0.mo161658c()
            goto L_0x0025
        L_0x000f:
            if (r5 == 0) goto L_0x0012
            goto L_0x0025
        L_0x0012:
            k43.g r5 = k43.C108886d.xx0()
            int r5 = r5.f326118n
            if (r5 != r2) goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x0025
        L_0x001c:
            com.tencent.mm.plugin.voip.model.d r5 = r4.f324419m
            if (r5 == 0) goto L_0x001a
            int r5 = r5.mo152548g()
            r2 = r5
        L_0x0025:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5[r3] = r0
            java.lang.String r0 = "MicroMsg.cs.VoIPCsAudioManager"
            java.lang.String r1 = "Current StreamType:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i43.C108367a.mo158859g0(boolean):int");
    }

    /* renamed from: h0 */
    public final void mo158860h0() {
        if (mo157504C() || C110472b.f330365a.mo161951b()) {
            mo161478U("voipcs", 4);
            mo158858f0(false);
            return;
        }
        mo161478U("voipcs", 1);
        mo158858f0(true);
    }
}
