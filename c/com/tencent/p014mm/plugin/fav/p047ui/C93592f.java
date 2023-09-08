package com.tencent.p014mm.plugin.fav.p047ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FavAddQualityStruct;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import pb1.C100694a;
import pb1.C100698b0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100739r1;
import pb1.C100745t;
import pb1.C100755z;
import te3.C101801kd0;
import te3.C101836ry2;
import te3.C101854uy2;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.f */
public class C93592f extends IStaticListener<DoFavoriteEvent> {
    public boolean callback(IEvent iEvent) {
        int i;
        boolean z;
        DoFavoriteEvent doFavoriteEvent = (DoFavoriteEvent) iEvent;
        Class cls = C100718j1.class;
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        int i2 = -2;
        if (-2 == aVar.f264678c) {
            long j = Util.getLong(aVar.f264681f, -1);
            if (0 >= j) {
                Log.m105928w("MicroMsg.Fav.FavAddItemListener", "error fav info local id");
            } else {
                C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142266Yt(j);
                if (Yt == null) {
                    Log.m105928w("MicroMsg.Fav.FavAddItemListener", "error fav info null");
                } else {
                    if (Util.isNullOrNil(Yt.field_favProto.f298624o)) {
                        C115669n.INSTANCE.mo160131h(10873, 6);
                    } else {
                        C115669n.INSTANCE.mo160131h(10874, 6);
                    }
                    C101801kd0 kd02 = Yt.field_favProto;
                    kd02.f298624o = doFavoriteEvent.f264674d.f264680e;
                    kd02.f298625p = true;
                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(Yt, "rowid");
                    String str = doFavoriteEvent.f264674d.f264680e;
                    int i3 = Yt.field_id;
                    if (i3 <= 0) {
                        Log.m105929w("MicroMsg.Fav.FavAddItemListener", "modRemark favid:%d", Integer.valueOf(i3));
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        LinkedList linkedList = new LinkedList();
                        C101836ry2 ry22 = new C101836ry2();
                        ry22.f299366d = 4;
                        ry22.f299367e = 0;
                        linkedList.add(ry22);
                        LinkedList linkedList2 = new LinkedList();
                        C101854uy2 uy22 = new C101854uy2();
                        uy22.f299650d = "favitem.remark";
                        uy22.f299652f = str;
                        linkedList2.add(uy22);
                        C101854uy2 uy23 = new C101854uy2();
                        uy23.f299650d = "favitem.remark";
                        uy23.f299651e = "time";
                        uy23.f299652f = currentTimeMillis + "";
                        linkedList2.add(uy23);
                        C86709a0.m107524d().mo123460f(new C100739r1(Yt.field_id, linkedList, linkedList2, 0));
                    }
                }
            }
        } else {
            DoFavoriteEvent.C1001b bVar = doFavoriteEvent.f264675e;
            HashSet<String> hashSet = C100745t.f295154a;
            long currentTimeMillis2 = System.currentTimeMillis();
            C100698b0 b0Var = C100698b0.f295038a;
            b0Var.mo140130f(1, currentTimeMillis2);
            Log.m105924i("MicroMsg.FavApiUtil", "[startFavAddReportEnv] session = " + currentTimeMillis2);
            FavAddQualityStruct b = b0Var.mo140126b();
            DoFavoriteEvent.C92474a aVar2 = doFavoriteEvent.f264674d;
            b.f265498d = aVar2.f264678c;
            if (aVar2.f264676a == null) {
                Log.m105928w("MicroMsg.Fav.FavAddService", "handleEvent error, event is null");
                DoFavoriteEvent.C92474a aVar3 = doFavoriteEvent.f264674d;
                if (aVar3.f264687l == 0) {
                    aVar3.f264687l = C0966R.string.f360421co1;
                }
                i = aVar3.f264687l;
            } else {
                i = 0;
            }
            DoFavoriteEvent.C92474a aVar4 = doFavoriteEvent.f264674d;
            if (aVar4.f264684i == null && aVar4.f264685j == null) {
                Log.m105924i("MicroMsg.Fav.FavAddService", "handleEvent context = null && frament = null");
            }
            DoFavoriteEvent.C92474a aVar5 = doFavoriteEvent.f264674d;
            int i4 = aVar5.f264687l;
            if (i4 > 0) {
                i2 = i4;
            } else {
                int i5 = aVar5.f264678c;
                HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
                int[] iArr = C100694a.f295012a;
                int i6 = 0;
                while (true) {
                    if (i6 >= 8) {
                        z = false;
                        break;
                    } else if (iArr[i6] == i5) {
                        z = true;
                        break;
                    } else {
                        i6++;
                    }
                }
                if (z) {
                    FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                    favoriteOperationEvent.f264833d.f264835a = 36;
                    favoriteOperationEvent.publish();
                    if (favoriteOperationEvent.f264834e.f264855a != 1) {
                        DoFavoriteEvent.C92474a aVar6 = doFavoriteEvent.f264674d;
                        i2 = aVar6.f264687l;
                        aVar6.f264691p = new C93657h(doFavoriteEvent);
                    }
                } else {
                    i2 = i;
                }
            }
            if (doFavoriteEvent.f264674d.f264690o && ((Integer) C86709a0.m107535s().mo121142i().mo119684e(225281, 0)).intValue() != 1) {
                Log.m105924i("MicroMsg.Fav.FavAddService", "try show intro ui");
                C100734q.m131875t0(doFavoriteEvent.f264674d.f264684i, ".ui.FavTipsUI", new Intent(), (Bundle) null);
                C86709a0.m107535s().mo121142i().mo119676J(225281, 1);
            }
            DoFavoriteEvent.C92474a aVar7 = doFavoriteEvent.f264674d;
            C93693r.m118404e(aVar7.f264678c, i2, aVar7.f264688m, aVar7.f264684i, aVar7.f264685j, aVar7.f264686k, aVar7.f264692q, aVar7.f264691p, (C75018a.C75024d) null, aVar7.f264693r);
            Log.m105925i("MicroMsg.Fav.FavAddService", "err Type = %d", Integer.valueOf(i2));
            if (i2 == -9) {
                b.f265499e = i2;
                C93658i.m118348c(doFavoriteEvent);
            } else if (i2 != 0) {
                b.f265499e = i2;
                b.mo86054n();
                C100698b0.f295038a.mo140131g(1);
                bVar.f9046a = i2;
            } else {
                b.f265499e = i2;
                C93658i.m118348c(doFavoriteEvent);
            }
            i2 = 0;
            bVar.f9046a = i2;
        }
        return false;
    }
}
