package gz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import dz0.C20483c;
import f40.C86709a0;
import hz0.C33154h;
import hz0.C33156j;
import hz0.C46143d0;
import hz0.C46151g0;
import hz0.C46153l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import te3.C49436fk3;
import te3.C49573gk3;
import te3.C51509u83;
import wz0.C118792g;
import wz0.C22945n;
import wz0.C53247c;
import wz0.C53267r;

/* renamed from: gz0.h */
public class C45988h implements C11385n {

    /* renamed from: d */
    public List<WeakReference<C45990b>> f124012d = new ArrayList();

    /* renamed from: e */
    public C53247c f124013e;

    /* renamed from: f */
    public int f124014f;

    /* renamed from: g */
    public MTimerHandler f124015g = new MTimerHandler(new C45989a(), false);

    /* renamed from: gz0.h$a */
    public class C45989a implements MTimerHandler.CallBack {
        public C45989a() {
        }

        public boolean onTimerExpired() {
            C45990b bVar;
            Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onTimerExpired, do refresh code!");
            C45988h hVar = C45988h.this;
            hVar.getClass();
            Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onShowTimeExpired()");
            if (hVar.f124012d == null) {
                return true;
            }
            for (int i = 0; i < ((ArrayList) hVar.f124012d).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) hVar.f124012d).get(i);
                if (!(weakReference == null || (bVar = (C45990b) weakReference.get()) == null)) {
                    bVar.mo23364d();
                }
            }
            return true;
        }
    }

    /* renamed from: gz0.h$b */
    public interface C45990b {
        /* renamed from: a */
        void mo23361a(int i, String str);

        /* renamed from: b */
        void mo23362b(C53247c cVar);

        /* renamed from: c */
        void mo23363c(C53247c cVar);

        /* renamed from: d */
        void mo23364d();
    }

    /* renamed from: a */
    public final C33154h mo71384a(C49573gk3 gk32) {
        C33154h hVar = new C33154h();
        hVar.field_card_id = gk32.f134102d;
        hVar.field_lower_bound = gk32.f134103e;
        hVar.field_expire_time_interval = gk32.f134106h;
        hVar.field_need_insert_show_timestamp = gk32.f134104f;
        hVar.field_show_expire_interval = gk32.f134107i;
        hVar.field_show_timestamp_encrypt_key = gk32.f134105g;
        hVar.field_fetch_time = System.currentTimeMillis();
        return hVar;
    }

    /* renamed from: b */
    public final C51509u83 mo71385b(String str, String str2, C53247c cVar) {
        C51509u83 u832 = new C51509u83();
        u832.f142679d = str;
        u832.f142680e = str2;
        u832.f142681f = new Long(System.currentTimeMillis() / 1000).intValue();
        u832.f142682g = cVar == null ? -1 : cVar.f148589d;
        return u832;
    }

    /* renamed from: c */
    public final void mo71386c(String str, C53267r rVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("doNetSceneGetDynamicQrcode, cardId:");
        sb.append(str);
        sb.append(",scene :");
        int i = 0;
        sb.append(rVar == null ? 0 : rVar.f148609d);
        Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", sb.toString());
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        if (rVar != null) {
            i = rVar.f148609d;
        }
        C46143d0 d0Var = new C46143d0(linkedList, i);
        C86709a0.m107529k().f251779b.mo123455a(1382, this);
        C86709a0.m107529k().f251779b.mo123460f(d0Var);
    }

    /* renamed from: d */
    public final void mo71387d(String str, String str2, C53247c cVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(mo71385b(str, str2, cVar));
        Log.m105925i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport, operate_list=%d,refreshAction=%d", Integer.valueOf(linkedList.size()), Integer.valueOf(cVar.f148589d));
        mo71389f(linkedList);
    }

    /* renamed from: e */
    public final void mo71388e(String str, List<C33156j> list, C53247c cVar) {
        if (cVar == null) {
            Log.m105920e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doNetSceneReport error! CardCodeRefreshAction is null! cannot report!");
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (C33156j jVar : list) {
            linkedList.add(mo71385b(str, jVar.field_code_id, cVar));
        }
        mo71389f(linkedList);
    }

    /* renamed from: f */
    public final void mo71389f(LinkedList<C51509u83> linkedList) {
        C86709a0.m107529k().f251779b.mo123455a(1275, this);
        C86709a0.m107529k().f251779b.mo123460f(new C46151g0(linkedList));
    }

    /* renamed from: g */
    public final void mo71390g(C20483c cVar, C53267r rVar) {
        boolean z = false;
        if (cVar != null) {
            if (cVar.mo23263J0() == null || !cVar.mo23263J0().f63938E) {
                Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get cardInfo is_commom_card is false!");
            } else {
                z = true;
            }
        }
        if (!z) {
            Log.m105920e("MicroMsg.CardDynamicQrcodeOfflineMgr", "cannot  get qrCode !");
            mo71393j(2, "");
        } else if (!C22945n.m27024x(MMApplicationContext.getContext())) {
            Log.m105920e("MicroMsg.CardDynamicQrcodeOfflineMgr", "isNetworkAvailable false cannot connet network!");
            mo71393j(-1, "");
        } else if (this.f124014f >= 3) {
            Log.m105920e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doRequestNetSceneGetDynamicQrcode is  limit requestcount:" + this.f124014f + ",cannot request!");
        } else {
            mo71386c(cVar.getCardId(), rVar);
            this.f124014f++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0110  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo71391h(wz0.C53267r r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r10.f148609d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "MicroMsg.CardDynamicQrcodeOfflineMgr"
            java.lang.String r4 = "doUpdateOfflineQrcodeByDynaimicCard! fromScene=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r4, r1)
            hz0.c r1 = hz0.C46153l0.Gx0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r1 = r1.f124344d
            java.lang.String r4 = "1"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.String r5 = "select * from UserCardInfo where is_dynamic=?"
            android.database.Cursor r1 = r1.rawQuery(r5, r4)
            java.lang.String r4 = "MicroMsg.CardInfoStorage"
            if (r1 != 0) goto L_0x0031
            java.lang.String r1 = "getCardInfoList by is_dynamic is failure! cu is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
            r1 = 0
            goto L_0x005d
        L_0x0031:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0036:
            boolean r6 = r1.moveToNext()     // Catch:{ Exception -> 0x004b }
            if (r6 == 0) goto L_0x0059
            com.tencent.mm.plugin.card.model.CardInfo r6 = new com.tencent.mm.plugin.card.model.CardInfo     // Catch:{ Exception -> 0x004b }
            r6.<init>()     // Catch:{ Exception -> 0x004b }
            r6.convertFrom(r1)     // Catch:{ Exception -> 0x004b }
            r5.add(r6)     // Catch:{ Exception -> 0x004b }
            goto L_0x0036
        L_0x0048:
            r10 = move-exception
            goto L_0x0137
        L_0x004b:
            r6 = move-exception
            java.lang.String r7 = "getCardInfoList by is_dynamic is failure! is_dynamic = true"
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0048 }
            r8[r3] = r6     // Catch:{ all -> 0x0048 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r7, r8)     // Catch:{ all -> 0x0048 }
        L_0x0059:
            r1.close()
            r1 = r5
        L_0x005d:
            if (r1 == 0) goto L_0x0127
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x0067
            goto L_0x0127
        L_0x0067:
            java.util.Iterator r1 = r1.iterator()
        L_0x006b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0126
            java.lang.Object r4 = r1.next()
            com.tencent.mm.plugin.card.model.CardInfo r4 = (com.tencent.p014mm.plugin.card.model.CardInfo) r4
            if (r4 != 0) goto L_0x0089
            java.lang.Object[] r4 = new java.lang.Object[r0]
            int r5 = r10.f148609d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r3] = r5
            java.lang.String r5 = "doUpdateOfflineQrcodeByDynaimicCard  is failure! cardInfo is null fromScene=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r5, r4)
            goto L_0x006b
        L_0x0089:
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = r4.field_card_id
            r6[r3] = r7
            int r7 = r10.f148609d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r0] = r7
            java.lang.String r7 = "doUpdateOfflineQrcodeByDynaimicCard  get dynamic code! cardId= %s,fromScene=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r6)
            te3.hn r6 = r4.mo23263J0()
            if (r6 == 0) goto L_0x00ad
            te3.hn r6 = r4.mo23263J0()
            boolean r6 = r6.f63938E
            if (r6 == 0) goto L_0x00ad
            r6 = 1
            goto L_0x00b3
        L_0x00ad:
            java.lang.String r6 = "get cardInfo is_commom_card is false!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
            r6 = 0
        L_0x00b3:
            if (r6 != 0) goto L_0x00c1
            java.lang.Object[] r5 = new java.lang.Object[r0]
            java.lang.String r4 = r4.field_card_id
            r5[r3] = r4
            java.lang.String r4 = "cannot  get qrCode ! cardId =%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r5)
            goto L_0x006b
        L_0x00c1:
            java.lang.String r6 = r4.field_card_id
            hz0.i r7 = hz0.C46153l0.Dx0()
            hz0.h r7 = r7.mo58987jo(r6)
            if (r7 != 0) goto L_0x00ce
            goto L_0x00f6
        L_0x00ce:
            hz0.k r8 = hz0.C46153l0.Ex0()
            java.util.List r6 = r8.mo58990Lo(r6)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x00df
            goto L_0x00f6
        L_0x00df:
            int r6 = r6.size()
            int r8 = r7.field_lower_bound
            if (r6 >= r8) goto L_0x00ec
            wz0.c r6 = wz0.C53247c.CARDCODEREFRESHACTION_UPDATECHANGE
            r9.f124013e = r6
            goto L_0x00f6
        L_0x00ec:
            boolean r6 = r9.mo71392i(r7)
            if (r6 == 0) goto L_0x00f8
            wz0.c r6 = wz0.C53247c.CARDCODEREFRESHACTION_UNSHOWN_TIMEOUT
            r9.f124013e = r6
        L_0x00f6:
            r6 = 1
            goto L_0x00f9
        L_0x00f8:
            r6 = 0
        L_0x00f9:
            if (r6 != 0) goto L_0x0110
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r4 = r4.field_card_id
            r5[r3] = r4
            int r4 = r10.f148609d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5[r0] = r4
            java.lang.String r4 = "do not need  get qrCode!  cardId =%s,fromScene=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r4, r5)
            goto L_0x006b
        L_0x0110:
            java.lang.Object[] r5 = new java.lang.Object[r0]
            int r6 = r10.f148609d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5[r3] = r6
            java.lang.String r6 = "doUpdateOfflineQrcodeByDynaimicCard doNetSceneGetDynamicQrcode! fromScene=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r5)
            java.lang.String r4 = r4.field_card_id
            r9.mo71386c(r4, r10)
            goto L_0x006b
        L_0x0126:
            return
        L_0x0127:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r10 = r10.f148609d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0[r3] = r10
            java.lang.String r10 = "doUpdateOfflineQrcodeByDynaimicCard do update all offileQrcode is failure! is dynamic cardList is empyt!fromScene=%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r10, r0)
            return
        L_0x0137:
            r1.close()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.C45988h.mo71391h(wz0.r):void");
    }

    /* renamed from: i */
    public final boolean mo71392i(C33154h hVar) {
        if (System.currentTimeMillis() - hVar.field_fetch_time <= ((long) (hVar.field_expire_time_interval * 1000))) {
            return false;
        }
        Log.m105925i("MicroMsg.CardDynamicQrcodeOfflineMgr", "code  expire time is true! currentTime= %s,codeFetchTime=%s,field_expire_time_interval=%s", Long.valueOf(System.currentTimeMillis()), Long.valueOf(hVar.field_fetch_time), Integer.valueOf(hVar.field_expire_time_interval));
        return true;
    }

    /* renamed from: j */
    public final void mo71393j(int i, String str) {
        C45990b bVar;
        Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onFail()");
        if (this.f124012d != null) {
            for (int i2 = 0; i2 < ((ArrayList) this.f124012d).size(); i2++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) this.f124012d).get(i2);
                if (!(weakReference == null || (bVar = (C45990b) weakReference.get()) == null)) {
                    bVar.mo23361a(i, str);
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo71394k(C53247c cVar) {
        C45990b bVar;
        Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onReceiveCodeUnavailable()");
        if (this.f124012d != null) {
            for (int i = 0; i < ((ArrayList) this.f124012d).size(); i++) {
                WeakReference weakReference = (WeakReference) ((ArrayList) this.f124012d).get(i);
                if (!(weakReference == null || (bVar = (C45990b) weakReference.get()) == null)) {
                    bVar.mo23362b(cVar);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo71395l() {
        Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "stopRefreshCodeTimer!");
        if (!this.f124015g.stopped()) {
            this.f124015g.stopTimer();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C45990b bVar;
        C53247c cVar;
        StringBuilder sb = new StringBuilder();
        sb.append("onSceneEnd, errType = ");
        sb.append(i);
        sb.append(" errCode = ");
        sb.append(i2);
        sb.append(",NetSceneBase=");
        String str2 = "";
        sb.append(yVar != null ? yVar.getClass() : str2);
        Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", sb.toString());
        int i3 = 0;
        if (i != 0 || i2 != 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("onSceneEnd, errType = ");
            sb4.append(i);
            sb4.append(" errCode = ");
            sb4.append(i2);
            sb4.append(" cmd:");
            if (yVar != null) {
                i3 = yVar.getType();
            }
            sb4.append(i3);
            sb4.append("  NetSceneBase=");
            Object obj = str2;
            if (yVar != null) {
                obj = yVar.getClass();
            }
            sb4.append(obj);
            Log.m105920e("MicroMsg.CardDynamicQrcodeOfflineMgr", sb4.toString());
            if (yVar instanceof C46143d0) {
                mo71393j(i2, str);
                C86709a0.m107529k().f251779b.mo123470p(1382, this);
                return;
            }
            C86709a0.m107529k().f251779b.mo123470p(1275, this);
        } else if (yVar instanceof C46143d0) {
            C49573gk3 gk32 = ((C46143d0) yVar).f124353f;
            if (gk32 == null) {
                Log.m105920e("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSceneEnd, resp  qr_code_item_list is null ");
                return;
            }
            String str3 = gk32.f134102d;
            if (C46153l0.Dx0().mo58987jo(str3) == null) {
                C46153l0.Dx0().insert(mo71384a(gk32));
            } else {
                C46153l0.Dx0().update(mo71384a(gk32), new String[0]);
            }
            List<C33156j> Lo = C46153l0.Ex0().mo58990Lo(str3);
            if (!((ArrayList) Lo).isEmpty() && C46153l0.Ex0().mo58991c(str3) && (cVar = this.f124013e) != null) {
                mo71388e(str3, Lo, cVar);
            }
            Iterator<C49436fk3> it = gk32.f134108j.iterator();
            while (it.hasNext()) {
                C49436fk3 next = it.next();
                C33156j jVar = new C33156j();
                jVar.field_card_id = str3;
                jVar.field_code_id = next.f133566d;
                String str4 = next.f133567e;
                String str5 = null;
                if (str4 != null && str4.length() > 0) {
                    int g = C86709a0.m107523b().mo121110g();
                    try {
                        str5 = C118792g.m167487c("CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + g + "_" + str3, str4);
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", e, str2, new Object[0]);
                    }
                }
                jVar.field_code = str5;
                C46153l0.Ex0().insert(jVar);
            }
            C53247c cVar2 = this.f124013e;
            Log.m105924i("MicroMsg.CardDynamicQrcodeOfflineMgr", "onSuccess()");
            if (this.f124012d != null) {
                while (i3 < ((ArrayList) this.f124012d).size()) {
                    WeakReference weakReference = (WeakReference) ((ArrayList) this.f124012d).get(i3);
                    if (!(weakReference == null || (bVar = (C45990b) weakReference.get()) == null)) {
                        bVar.mo23363c(cVar2);
                    }
                    i3++;
                }
            }
            C86709a0.m107529k().f251779b.mo123470p(1382, this);
        } else {
            C86709a0.m107529k().f251779b.mo123470p(1275, this);
        }
    }
}
