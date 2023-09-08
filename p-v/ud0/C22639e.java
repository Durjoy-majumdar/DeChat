package ud0;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestDialogUiData;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;
import sx3.C64197v;
import ud0.C22624a;
import wd0.C22894a;
import zd0.C16142r;
import zd0.C23466p;

/* renamed from: ud0.e */
public final class C22639e implements C23466p.C23483m {

    /* renamed from: a */
    public final /* synthetic */ C22624a.C22626b f65127a;

    /* renamed from: b */
    public final /* synthetic */ SubscribeMsgRequestResult f65128b;

    public C22639e(C22624a.C22626b bVar, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f65127a = bVar;
        this.f65128b = subscribeMsgRequestResult;
    }

    /* renamed from: a */
    public void mo22180a(C16142r rVar, boolean z, C23466p.C23474i iVar, boolean z2) {
        C87412m.m108594g(rVar, TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH);
        C87412m.m108594g(iVar, "item");
    }

    /* renamed from: b */
    public void mo22181b(int i, List<? extends C23466p.C23474i> list) {
        C87412m.m108594g(list, "resultData");
        int i2 = 2;
        Log.m105925i("MicroMsg.BrandSubscribeMsgRequestController", "alvinluo showSubscribeRequestDialog onEvent: %s, result size: %s", Integer.valueOf(i), Integer.valueOf(list.size()));
        if (i == 1 || i == 2 || i == 3) {
            C22624a.C22626b bVar = this.f65127a;
            ArrayList<SubscribeMsgTmpItem> arrayList = this.f65128b.f49004h;
            bVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            for (T next : list) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    SubscribeMsgTmpItem subscribeMsgTmpItem = arrayList.get(i3);
                    if (((C23466p.C23474i) next).f67353a) {
                        subscribeMsgTmpItem.f49023h = 1;
                    } else {
                        subscribeMsgTmpItem.f49023h = 0;
                    }
                    arrayList2.add(subscribeMsgTmpItem);
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
            C22624a.C22626b bVar2 = this.f65127a;
            bVar2.f65086i = this.f65128b.f49004h;
            bVar2.f65079b = C22624a.m26494b(bVar2.f65079b);
            C22624a.C22626b bVar3 = this.f65127a;
            bVar3.f65093p = this.f65128b.f49010q;
            SubscribeMsgRequestDialogUiData.C17805b bVar4 = SubscribeMsgRequestDialogUiData.f48992g;
            List<T> B0 = C110818d0.m150900B0(list);
            C23466p pVar = this.f65127a.f65089l;
            bVar3.f65094q = bVar4.mo21949a(i, B0, pVar != null ? pVar.f67304A.isChecked() : false);
            C22624a aVar = C22624a.f65076a;
            C22624a.C22626b bVar5 = this.f65127a;
            C87412m.m108594g(bVar5, "requestTask");
            bVar5.mo35752c();
            if (!this.f65128b.f49005i) {
                C22624a.C22626b bVar6 = this.f65127a;
                C22894a.C22895a aVar2 = bVar6.f65096s;
                C23466p pVar2 = bVar6.f65089l;
                aVar2.f65807f = (pVar2 == null || !pVar2.f67304A.isChecked()) ? 0 : 1;
            } else {
                this.f65127a.f65096s.f65807f = 2;
            }
            if (i != 1) {
                i2 = i != 2 ? i != 3 ? 0 : 4 : 3;
            }
            C22894a.f65798a.mo36069a(i2, this.f65127a.f65096s);
        }
    }
}
