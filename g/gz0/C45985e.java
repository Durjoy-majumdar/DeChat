package gz0;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import dz0.C31352e;
import f40.C86709a0;
import gz0.C45995o;
import hz0.C46146f;
import hz0.C46153l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import oz0.C47407b;
import pz0.C47718d;
import te3.C22500hn;
import wz0.C22945n;

/* renamed from: gz0.e */
public class C45985e implements C11385n, C45995o.C45997b, C31352e {

    /* renamed from: d */
    public WeakReference<Context> f124002d;

    /* renamed from: e */
    public List<WeakReference<C45986a>> f124003e = new ArrayList();

    /* renamed from: f */
    public HashMap<C45986a, Boolean> f124004f = new HashMap<>();

    /* renamed from: g */
    public HashMap<String, Boolean> f124005g = new HashMap<>();

    /* renamed from: h */
    public HashMap<String, Boolean> f124006h = new HashMap<>();

    /* renamed from: i */
    public C20483c f124007i = null;

    /* renamed from: j */
    public boolean f124008j = false;

    /* renamed from: n */
    public String f124009n;

    /* renamed from: gz0.e$a */
    public interface C45986a {
        /* renamed from: F6 */
        void mo23306F6();

        /* renamed from: V6 */
        void mo23307V6(String str);

        /* renamed from: W5 */
        void mo23308W5();

        /* renamed from: k1 */
        void mo23309k1(C20483c cVar);
    }

    /* renamed from: D7 */
    public void mo63787D7(C46146f fVar) {
        String str;
        String str2;
        Log.m105924i("MicroMsg.CardConsumedMgr", "onChange()");
        Log.m105924i("MicroMsg.CardConsumedMgr", "card msg card id is " + fVar.field_card_id);
        if (this.f124007i == null) {
            Log.m105920e("MicroMsg.CardConsumedMgr", "onChange(), do nothing, mCardInfo == null");
            mo71376a();
            return;
        }
        Log.m105924i("MicroMsg.CardConsumedMgr", "card msg card id is " + fVar.field_card_id);
        if (this.f124007i.mo23267O() && (str2 = fVar.field_card_id) != null && str2.equals(this.f124007i.getCardId()) && fVar.f124372c1 == 3) {
            Log.m105924i("MicroMsg.CardConsumedMgr", "it is card type, don't do NetSceneGetShareCardConsumedInfo! finish UI");
            mo71376a();
        } else if (!this.f124007i.mo23272T0()) {
            Log.m105924i("MicroMsg.CardConsumedMgr", "it is not card type, don't update share card data!");
            mo71376a();
        } else if (fVar.f124372c1 == 3 || ((str = fVar.field_card_id) != null && str.equals(this.f124007i.getCardId()) && !TextUtils.isEmpty(fVar.field_consumed_box_id))) {
            long currentTimeMillis = System.currentTimeMillis();
            Log.m105924i("MicroMsg.CardConsumedMgr", "consumed share card msg,  update share card data!");
            String str3 = fVar.field_card_id;
            if (str3 != null && str3.equals(this.f124007i.getCardId())) {
                ShareCardInfo jo = C46153l0.Lx0().mo72543jo(this.f124007i.getCardId());
                if (!(jo == null || jo.mo23263J0() == null)) {
                    int i = this.f124007i.mo23263J0().f63942d;
                    Log.m105919d("MicroMsg.CardConsumedMgr", "onChange() current oldState %s, newStatus %s, shareCardStatus %s", Integer.valueOf(i), Integer.valueOf(jo.mo23263J0().f63942d), Integer.valueOf(((ShareCardInfo) this.f124007i).field_status));
                    if (jo.mo23263J0().f63942d != i) {
                        mo71378c();
                    } else if (i != 1) {
                        Log.m105924i("MicroMsg.CardConsumedMgr", "share card oldState status is " + i);
                        C22500hn J0 = this.f124007i.mo23263J0();
                        J0.f63942d = 1;
                        C20483c cVar = this.f124007i;
                        ((ShareCardInfo) cVar).field_status = 1;
                        cVar.mo23273U0(J0);
                        C22945n.m27000M(this.f124007i);
                    }
                }
            } else if (fVar.field_card_id != null) {
                ShareCardInfo jo4 = C46153l0.Lx0().mo72543jo(fVar.field_card_id);
                if (jo4 == null || jo4.mo23263J0() == null) {
                    Log.m105928w("MicroMsg.CardConsumedMgr", "tempCard is null");
                } else {
                    Log.m105919d("MicroMsg.CardConsumedMgr", "onChange() not current oldState %s,shareCardStatus %s", Integer.valueOf(jo4.mo23263J0().f63942d), Integer.valueOf(jo4.field_status));
                    if (jo4.mo23263J0().f63942d != 1) {
                        C22500hn J02 = jo4.mo23263J0();
                        J02.f63942d = 1;
                        jo4.field_status = 1;
                        jo4.mo23273U0(J02);
                        C22945n.m27000M(jo4);
                    }
                }
            }
            mo71377b(this.f124007i);
            Boolean bool = this.f124005g.get(this.f124007i.getCardId());
            if (bool == null || !bool.booleanValue()) {
                Log.m105924i("MicroMsg.CardConsumedMgr", "consume share card, card id is " + this.f124007i.getCardId());
                C47407b.m52748p(this.f124002d.get(), this.f124007i);
                this.f124005g.put(this.f124007i.getCardId(), Boolean.TRUE);
                long currentTimeMillis2 = System.currentTimeMillis();
                ArrayList arrayList = new ArrayList();
                IDKey iDKey = new IDKey();
                iDKey.SetID(281);
                iDKey.SetKey(30);
                iDKey.SetValue(1);
                IDKey iDKey2 = new IDKey();
                iDKey2.SetID(281);
                iDKey2.SetKey(31);
                iDKey2.SetValue((long) ((int) (currentTimeMillis2 - currentTimeMillis)));
                arrayList.add(iDKey);
                arrayList.add(iDKey2);
                C115669n.INSTANCE.mo160124a(arrayList, true);
            } else {
                Log.m105924i("MicroMsg.CardConsumedMgr", "consumed:" + bool.booleanValue());
            }
            mo71379d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5  */
    /* renamed from: H4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58084H4() {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.CardConsumedMgr"
            java.lang.String r1 = "onDBchange()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            dz0.c r1 = r12.f124007i
            if (r1 != 0) goto L_0x0011
            java.lang.String r1 = "onDBchange(), do nothing, mCardInfo == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return
        L_0x0011:
            boolean r1 = r1.mo23272T0()
            if (r1 == 0) goto L_0x0026
            pz0.j r1 = hz0.C46153l0.Lx0()
            dz0.c r2 = r12.f124007i
            java.lang.String r2 = r2.getCardId()
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r1 = r1.mo72543jo(r2)
            goto L_0x0034
        L_0x0026:
            hz0.c r1 = hz0.C46153l0.Gx0()
            dz0.c r2 = r12.f124007i
            java.lang.String r2 = r2.getCardId()
            com.tencent.mm.plugin.card.model.CardInfo r1 = r1.mo71595Lo(r2)
        L_0x0034:
            if (r1 == 0) goto L_0x01a1
            te3.hn r2 = r1.mo23263J0()
            if (r2 == 0) goto L_0x01a1
            dz0.c r2 = r12.f124007i
            if (r2 == 0) goto L_0x01a1
            te3.hn r2 = r2.mo23263J0()
            if (r2 == 0) goto L_0x01a1
            dz0.c r2 = r12.f124007i
            te3.hn r2 = r2.mo23263J0()
            int r2 = r2.f63942d
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = 0
            r3[r5] = r4
            te3.hn r4 = r1.mo23263J0()
            int r4 = r4.f63942d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = 1
            r3[r6] = r4
            r4 = 2
            boolean r7 = r12.f124008j
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3[r4] = r7
            r4 = 3
            dz0.c r7 = r12.f124007i
            boolean r7 = r7.mo23272T0()
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3[r4] = r7
            java.lang.String r4 = "onDBchange() oldState %s, newStatus %s, isDoingConsumedInfo %s, isShareCard %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r4, r3)
            dz0.c r3 = r12.f124007i
            boolean r3 = r3.mo23272T0()
            if (r3 == 0) goto L_0x00a0
            dz0.c r3 = r12.f124007i
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo
            if (r4 == 0) goto L_0x00a0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo r3 = (com.tencent.p014mm.plugin.card.sharecard.model.ShareCardInfo) r3
            int r3 = r3.field_status
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r5] = r3
            java.lang.String r3 = "onDBchange() shareCardState %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r3, r4)
            goto L_0x00ad
        L_0x00a0:
            dz0.c r3 = r12.f124007i
            boolean r3 = r3.mo23272T0()
            if (r3 == 0) goto L_0x00ad
            java.lang.String r3 = "onDBchange() mCardInfo is ShareCard, but not the ShareCardInfo instance!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r3)
        L_0x00ad:
            te3.hn r3 = r1.mo23263J0()
            int r3 = r3.f63942d
            if (r3 == r2) goto L_0x019c
            r12.mo71378c()
            dz0.c r2 = r12.f124007i
            boolean r2 = r2.mo23272T0()
            if (r2 == 0) goto L_0x017d
            boolean r2 = r12.f124008j
            if (r2 != 0) goto L_0x017d
            te3.hn r2 = r1.mo23263J0()
            int r2 = r2.f63942d
            if (r2 != r6) goto L_0x017d
            java.lang.String r2 = "onDBchange(), need to get the consumedinfo , don't finish UI!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r2 = r12.f124005g
            dz0.c r3 = r12.f124007i
            java.lang.String r3 = r3.getCardId()
            java.lang.Object r2 = r2.get(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x0101
            boolean r3 = r2.booleanValue()
            if (r3 != 0) goto L_0x00e8
            goto L_0x0101
        L_0x00e8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "consumed:"
            r3.append(r4)
            boolean r2 = r2.booleanValue()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0179
        L_0x0101:
            java.lang.String r2 = "consumed is null or consumed is false!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.ref.WeakReference<android.content.Context> r4 = r12.f124002d
            java.lang.Object r4 = r4.get()
            android.content.Context r4 = (android.content.Context) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "consume share card, card id is "
            r5.append(r7)
            dz0.c r7 = r12.f124007i
            java.lang.String r7 = r7.getCardId()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            dz0.c r5 = r12.f124007i
            oz0.C47407b.m52748p(r4, r5)
            java.util.HashMap<java.lang.String, java.lang.Boolean> r4 = r12.f124005g
            dz0.c r5 = r12.f124007i
            java.lang.String r5 = r5.getCardId()
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r4.put(r5, r7)
            long r4 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            com.tencent.mars.smc.IDKey r8 = new com.tencent.mars.smc.IDKey
            r8.<init>()
            r9 = 281(0x119, float:3.94E-43)
            r8.SetID(r9)
            r10 = 30
            r8.SetKey(r10)
            r10 = 1
            r8.SetValue(r10)
            com.tencent.mars.smc.IDKey r10 = new com.tencent.mars.smc.IDKey
            r10.<init>()
            r10.SetID(r9)
            r9 = 31
            r10.SetKey(r9)
            long r4 = r4 - r2
            int r2 = (int) r4
            long r2 = (long) r2
            r10.SetValue(r2)
            r7.add(r8)
            r7.add(r10)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2.mo160124a(r7, r6)
        L_0x0179:
            r12.mo71379d()
            goto L_0x0197
        L_0x017d:
            dz0.c r2 = r12.f124007i
            boolean r2 = r2.mo23272T0()
            if (r2 == 0) goto L_0x018f
            boolean r2 = r12.f124008j
            if (r2 == 0) goto L_0x018f
            java.lang.String r2 = "onDBchange(), is getting the consumedinfo!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            goto L_0x0197
        L_0x018f:
            java.lang.String r2 = "onDBchange(),finish CardConsumeCodeUI!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r12.mo71376a()
        L_0x0197:
            java.lang.String r2 = "onDBchange(),card coupon is consumde success!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x019c:
            r12.f124007i = r1
            r12.mo71377b(r1)
        L_0x01a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.C45985e.mo58084H4():void");
    }

    /* renamed from: a */
    public final void mo71376a() {
        C45986a aVar;
        Log.m105924i("MicroMsg.CardConsumedMgr", "doFinishUI()");
        if (this.f124003e != null) {
            for (int i = 0; i < ((ArrayList) this.f124003e).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) this.f124003e).get(i);
                if (!(weakReference == null || (aVar = (C45986a) weakReference.get()) == null)) {
                    aVar.mo23306F6();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo71377b(C20483c cVar) {
        C45986a aVar;
        Log.m105924i("MicroMsg.CardConsumedMgr", "doUpdateCardInfo()");
        if (this.f124003e != null) {
            for (int i = 0; i < ((ArrayList) this.f124003e).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) this.f124003e).get(i);
                if (!(weakReference == null || (aVar = (C45986a) weakReference.get()) == null)) {
                    aVar.mo23309k1(cVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo71378c() {
        C45986a aVar;
        Log.m105924i("MicroMsg.CardConsumedMgr", "doVibrate()");
        if (this.f124003e != null) {
            for (int i = 0; i < ((ArrayList) this.f124003e).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) this.f124003e).get(i);
                if (!(weakReference == null || (aVar = (C45986a) weakReference.get()) == null)) {
                    aVar.mo23308W5();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo71379d() {
        Log.m105924i("MicroMsg.CardConsumedMgr", "needDoConsumedInfo(), need to do NetSceneGetShareCardConsumedInfo. ");
        synchronized (this) {
            if (this.f124008j) {
                Log.m105924i("MicroMsg.CardConsumedMgr", "isDoingConsumedInfo is true, is doing NetSceneGetShareCardConsumedInfo. return");
                return;
            }
            Log.m105924i("MicroMsg.CardConsumedMgr", "isDoingConsumedInfo is false, do NetSceneGetShareCardConsumedInfo. ");
            this.f124008j = true;
            C86709a0.m107529k().f251779b.mo123460f(new C47718d(this.f124007i.getCardId(), 20, "", ""));
        }
    }

    /* renamed from: e */
    public void mo71380e(C45986a aVar, boolean z) {
        if (this.f124004f == null) {
            this.f124004f = new HashMap<>();
        }
        this.f124004f.put(aVar, Boolean.valueOf(z));
    }

    /* renamed from: f */
    public void mo71381f(C45986a aVar) {
        C45986a aVar2;
        if (this.f124003e != null && aVar != null) {
            int i = 0;
            while (i < this.f124003e.size()) {
                WeakReference weakReference = this.f124003e.get(i);
                if (weakReference == null || (aVar2 = (C45986a) weakReference.get()) == null || !aVar2.equals(aVar)) {
                    i++;
                } else {
                    this.f124003e.remove(weakReference);
                    return;
                }
            }
        }
    }

    public void onChange() {
        mo71378c();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.CardConsumedMgr", "onSceneEnd, errType = " + i + " errCode = " + i2);
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C47718d) {
                C47718d dVar = (C47718d) yVar;
                if (!TextUtils.isEmpty(dVar.f128200f)) {
                    String str2 = dVar.f128200f;
                    Log.m105924i("MicroMsg.CardConsumedMgr", "startConsumedSuccUI()");
                    if (this.f124003e != null) {
                        boolean z = false;
                        for (int i3 = 0; i3 < ((ArrayList) this.f124003e).size(); i3++) {
                            WeakReference weakReference = (WeakReference) ((ArrayList) this.f124003e).get(i3);
                            if (weakReference != null) {
                                C45986a aVar = (C45986a) weakReference.get();
                                Boolean bool = this.f124004f.get(aVar);
                                if (!(aVar == null || bool == null || !bool.booleanValue())) {
                                    aVar.mo23307V6(str2);
                                    z = true;
                                }
                            }
                        }
                        Boolean bool2 = this.f124005g.get(this.f124007i.getCardId());
                        if (z) {
                            Log.m105924i("MicroMsg.CardConsumedMgr", "onStartConsumedSuccUI is handled!");
                            this.f124009n = "";
                        } else if (bool2 != null && bool2.booleanValue()) {
                            Log.m105924i("MicroMsg.CardConsumedMgr", "add to launch pending list!");
                            this.f124009n = str2;
                            this.f124006h.put(this.f124007i.getCardId(), Boolean.TRUE);
                        }
                    }
                } else {
                    Log.m105920e("MicroMsg.CardConsumedMgr", "consumed return json is empty!");
                }
                this.f124008j = false;
                Log.m105920e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo ok! finish UI!");
                mo71376a();
            }
        } else if (yVar instanceof C47718d) {
            this.f124008j = false;
            Log.m105920e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo failed! finish UI!");
            mo71376a();
        }
    }
}
