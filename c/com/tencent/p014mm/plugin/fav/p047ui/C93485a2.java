package com.tencent.p014mm.plugin.fav.p047ui;

import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import p663qo.C101211h;
import p749xh.C66261f3;
import p823sg.C90193h;
import pb1.C100695a0;
import pb1.C100703e0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100737r;
import pb1.C100739r1;
import pb1.C100751w0;
import pb1.C100752x0;
import pb1.C100755z;
import pb1.C11883v0;
import qc0.C101106m;
import qc0.C89588n;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C101850ud0;
import te3.C50524nd0;
import te3.C50529ne0;
import te3.C51953xc0;
import te3.C64719t23;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.a2 */
public class C93485a2 extends IStaticListener<FavoriteOperationEvent> {
    public boolean callback(IEvent iEvent) {
        String[] strArr;
        String str;
        C101801kd0 kd02;
        C64719t23 t232;
        LinkedList<C101834rc0> linkedList;
        C64719t23 t233;
        C100755z qq;
        C101801kd0 kd03;
        C101801kd0 kd04;
        FavoriteOperationEvent favoriteOperationEvent = (FavoriteOperationEvent) iEvent;
        Class cls = C101211h.class;
        Class cls2 = C100718j1.class;
        Log.m105924i("MicroMsg.Fav.FavoriteOperationListener", "event.data.type = " + favoriteOperationEvent.f264833d.f264835a);
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        int i = aVar.f264835a;
        if (i == 2) {
            C101834rc0 rc02 = aVar.f264840f;
            if (rc02 != null) {
                C86009m1 m1Var = new C86009m1(C100734q.m131880w(rc02));
                if (m1Var.mo119967g()) {
                    favoriteOperationEvent.f264834e.f264857c = m1Var.mo119971i();
                }
                C86009m1 m1Var2 = new C86009m1(C100734q.m131826Q(favoriteOperationEvent.f264833d.f264840f));
                if (m1Var2.mo119967g()) {
                    favoriteOperationEvent.f264834e.f264858d = m1Var2.mo119971i();
                }
            }
        } else if (i != 4) {
            int i2 = 21;
            if (i == 21) {
                favoriteOperationEvent.f264834e.f264857c = ((String) C68924p1.m81172a(aVar.f264842h, aVar.f264848n)).toString();
            } else if (i != 27) {
                int i3 = 1;
                if (i != 28) {
                    int i4 = 7;
                    switch (i) {
                        case 6:
                            C100751w0 Jq = ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq();
                            favoriteOperationEvent.f264833d.getClass();
                            Jq.add((MStorage.IOnStorageChange) null);
                            favoriteOperationEvent.f264834e.f264855a = 0;
                            break;
                        case 7:
                            C100751w0 Jq2 = ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq();
                            favoriteOperationEvent.f264833d.getClass();
                            Jq2.remove((MStorage.IOnStorageChange) null);
                            favoriteOperationEvent.f264834e.f264855a = 0;
                            break;
                        case 8:
                            favoriteOperationEvent.f264834e.f264861g = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).f302175d;
                            favoriteOperationEvent.f264834e.f264855a = 0;
                            break;
                        case 9:
                            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
                            if (Yt == null) {
                                favoriteOperationEvent.f264834e.f264860f = null;
                            } else {
                                favoriteOperationEvent.f264834e.f264860f = C100734q.m131815F(Yt.field_type, Yt.field_favProto, Yt.field_tagProto);
                            }
                            favoriteOperationEvent.f264834e.f264855a = 0;
                            break;
                        case 10:
                            C100755z Yt2 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
                            FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent.f264833d;
                            ((C100752x0) C86312j.m106911c(C100752x0.class)).mo140172DJ(aVar2.f264842h, Yt2, aVar2.f264853s);
                            favoriteOperationEvent.f264834e.f264855a = 0;
                            break;
                        case 11:
                            C100755z Yt3 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
                            MMHandler mMHandler = favoriteOperationEvent.f264833d.f264843i;
                            if (Yt3 == null) {
                                HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
                                Log.m105928w("MicroMsg.Fav.FavApiLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
                                strArr = null;
                            } else {
                                C101834rc0 D = C100734q.m131813D(Yt3);
                                String[] strArr2 = new String[2];
                                C100737r rVar = new C100737r(Yt3, D);
                                int i5 = Yt3.field_type;
                                if (i5 != 5) {
                                    if (i5 != 18) {
                                        if (i5 == 10) {
                                            C101793jd0 jd02 = Yt3.field_favProto.f298634y;
                                            if (jd02 != null) {
                                                strArr2[1] = jd02.f298515h;
                                            }
                                        } else if (i5 == 11) {
                                            C101793jd0 jd03 = Yt3.field_favProto.f298634y;
                                            if (jd03 != null) {
                                                strArr2[1] = jd03.f298515h;
                                            }
                                        } else if (i5 != 14) {
                                            if (i5 == 15) {
                                                C101850ud0 ud02 = Yt3.field_favProto.f298604C;
                                                if (ud02 != null) {
                                                    strArr2[1] = ud02.f299622h;
                                                }
                                            } else if (D != null) {
                                                strArr2[0] = C100734q.m131826Q(D);
                                                strArr2[1] = D.f299254G;
                                                mMHandler.post(rVar);
                                            }
                                        }
                                    }
                                    LinkedList<C101834rc0> linkedList2 = Yt3.field_favProto.f298618f;
                                    if (linkedList2 != null) {
                                        Iterator<C101834rc0> it = linkedList2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C101834rc0 next = it.next();
                                                int i6 = next.f299258I;
                                                if (i6 == 2) {
                                                    str = C100734q.m131880w(next);
                                                    mMHandler.post(rVar);
                                                } else if (i6 == 15) {
                                                    str = C100734q.m131826Q(next);
                                                    mMHandler.post(rVar);
                                                }
                                            } else {
                                                str = null;
                                            }
                                        }
                                        strArr2[0] = str;
                                    }
                                    strArr2[1] = D.f299254G;
                                } else {
                                    C101756ae0 ae02 = Yt3.field_favProto.f298622j;
                                    if (D != null) {
                                        String str2 = ae02 == null ? null : ae02.f297869j;
                                        if (Util.isNullOrNil(str2)) {
                                            str2 = D.f299254G;
                                        }
                                        strArr2[0] = C100734q.m131826Q(D);
                                        strArr2[1] = str2;
                                        mMHandler.post(rVar);
                                    } else if (ae02 != null) {
                                        strArr2[1] = ae02.f297869j;
                                    }
                                }
                                Log.m105919d("MicroMsg.Fav.FavApiLogic", "GetThumbUrlAndLocalPath thumbPath %s, thumbUrl %s, type %d", strArr2[0], strArr2[1], Integer.valueOf(Yt3.field_type));
                                strArr = strArr2;
                            }
                            FavoriteOperationEvent.C92516b bVar = favoriteOperationEvent.f264834e;
                            bVar.f264858d = strArr[0];
                            bVar.f264859e = strArr[1];
                            bVar.f264855a = 0;
                            break;
                        case 12:
                            C100734q.m131856k(aVar.f264839e, aVar.f264844j, aVar.f264854t);
                            break;
                        case 13:
                            C100755z Yt4 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
                            C100734q.m131844e(Yt4);
                            if (Yt4 == null && (kd02 = favoriteOperationEvent.f264833d.f264838d) != null) {
                                Yt4 = new C100755z();
                                new C101801kd0();
                                Yt4.field_type = 18;
                                Yt4.field_favProto = kd02;
                            }
                            FavoriteOperationEvent.C92515a aVar3 = favoriteOperationEvent.f264833d;
                            C93594f1.m118181i(aVar3.f264842h, aVar3.f264845k, aVar3.f264846l, Yt4, aVar3.f264844j);
                            break;
                        case 14:
                            if (!C100734q.m131834Y(aVar.f264840f)) {
                                favoriteOperationEvent.f264834e.f264855a = 0;
                                break;
                            } else {
                                favoriteOperationEvent.f264834e.f264855a = 1;
                                break;
                            }
                        case 15:
                            C100734q.m131863n0(((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e), true);
                            break;
                        case 16:
                            C100734q.m131861m0(((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e), true);
                            break;
                        case 17:
                            favoriteOperationEvent.f264834e.f264855a = C100734q.m131829T(aVar.f264840f.f299262K);
                            break;
                        case 18:
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(7);
                            ArrayList<C100755z> M = C100734q.m131822M((List<String>) null, (List<String>) null, arrayList, (List<C100755z>) null, (Set<Integer>) null, (C11883v0) null);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<C100755z> it4 = M.iterator();
                            while (it4.hasNext()) {
                                C100755z next2 = it4.next();
                                C101801kd0 kd05 = next2.field_favProto;
                                C101835rd0 rd02 = kd05.f298616d;
                                int i7 = next2.field_type;
                                if (i7 == i4 || i7 == i2) {
                                    C101834rc0 D2 = C100734q.m131813D(next2);
                                    C101106m a = C89588n.m112021a(6, (String) null, D2.f299297d, D2.f299301f, D2.f299242A, D2.f299250E, D2.f299246C, D2.f299280T, C100734q.m131809A(), mo128367d(D2), "", rd02.f299362w);
                                    a.f295976x = D2.f299251E1;
                                    a.f295969q = D2.f299255G1;
                                    C101841sc0 sc02 = D2.f299296c1;
                                    if (!(sc02 == null || (t232 = sc02.f299401C) == null || Util.isNullOrNil(t232.f185470r))) {
                                        a.f295954P = D2.f299296c1.f299401C.f185470r;
                                    }
                                    arrayList2.add(a);
                                } else if (i7 == 14 && (linkedList = kd05.f298618f) != null) {
                                    Iterator<C101834rc0> it5 = linkedList.iterator();
                                    while (it5.hasNext()) {
                                        C101834rc0 next3 = it5.next();
                                        int i8 = next3.f299258I;
                                        if (i8 == i4 || i8 == 29) {
                                            C101106m a2 = C89588n.m112021a(6, (String) null, next3.f299297d, next3.f299301f, next3.f299242A, next3.f299250E, next3.f299246C, next3.f299280T, C100734q.m131809A(), mo128367d(next3), "", rd02.f299362w);
                                            a2.f295976x = next3.f299251E1;
                                            a2.f295969q = next3.f299255G1;
                                            C101841sc0 sc03 = next3.f299296c1;
                                            if (!(sc03 == null || (t233 = sc03.f299401C) == null || Util.isNullOrNil(t233.f185470r))) {
                                                a2.f295954P = next3.f299296c1.f299401C.f185470r;
                                            }
                                            arrayList2.add(a2);
                                            i4 = 7;
                                        }
                                    }
                                }
                                i2 = 21;
                                i4 = 7;
                            }
                            favoriteOperationEvent.f264834e.f264862h = arrayList2;
                            break;
                        case 19:
                            if (Log.isDebug()) {
                                Log.m105919d("MicroMsg.Fav.FavoriteOperationListener", "FavoriteOperationEvent.TYPE_POST_NOTE called begin :%s", favoriteOperationEvent.mo126601a());
                            }
                            FavoriteOperationEvent.C92515a aVar4 = favoriteOperationEvent.f264833d;
                            if (aVar4.f264839e == -1) {
                                C93689q0.m118391c(aVar4.f264836b, aVar4.f264838d.f298618f, -1);
                            } else {
                                C93689q0.m118392d(favoriteOperationEvent);
                            }
                            if (Log.isDebug()) {
                                Log.m105919d("MicroMsg.Fav.FavoriteOperationListener", "FavoriteOperationEvent.TYPE_POST_NOTE called after :%s", favoriteOperationEvent.mo126601a());
                                break;
                            }
                            break;
                        default:
                            switch (i) {
                                case 30:
                                    C100734q.m131852i(favoriteOperationEvent);
                                    break;
                                case 31:
                                    C100739r1 r1Var = (C100739r1) aVar.f264850p;
                                    favoriteOperationEvent.f264834e.f264857c = r1Var.f295143n;
                                    if (!(r1Var.getReqResp() == null || r1Var.getReqResp().getRespObj() == null || r1Var.getReqResp().getRespObj().getRetCode() != -435 || (qq = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142273qq((long) r1Var.f295138f)) == null || (kd03 = qq.field_favProto) == null || kd03.f298618f == null)) {
                                        kd03.mo141222t(kd03.f298606E + 2);
                                        qq.field_itemStatus = 1;
                                        ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).update(qq, C66261f3.COL_LOCALID);
                                        ((C100718j1) C86312j.m106911c(cls2)).C30().run();
                                        break;
                                    }
                                case 32:
                                    C100755z Yt5 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
                                    if (Yt5 == null && (kd04 = favoriteOperationEvent.f264833d.f264838d) != null) {
                                        HashMap<Long, ArrayList<String>> hashMap2 = C100734q.f295126a;
                                        Yt5 = new C100755z();
                                        new C101801kd0();
                                        Yt5.field_type = 18;
                                        Yt5.field_favProto = kd04;
                                    }
                                    C100703e0 e0Var = new C100703e0();
                                    favoriteOperationEvent.f264834e.f264855a = (!e0Var.mo140134c(Yt5) || C100734q.m131841c0(Yt5)) ? 0 : 1;
                                    favoriteOperationEvent.f264834e.f264863i = e0Var.mo140132a(Yt5);
                                    Log.m105924i("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] event.result.ret have set = " + favoriteOperationEvent.f264834e.f264855a);
                                    Log.m105924i("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] event.result.isPause have set = " + favoriteOperationEvent.f264834e.f264863i);
                                    favoriteOperationEvent.f264834e.f264857c = "";
                                    if (Yt5 == null) {
                                        Log.m105920e("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] itemInfo==null,event.result.ret set true");
                                        FavoriteOperationEvent.C92516b bVar2 = favoriteOperationEvent.f264834e;
                                        bVar2.f264863i = true;
                                        bVar2.f264857c = null;
                                        break;
                                    }
                                    break;
                                case 33:
                                    C100755z Yt6 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
                                    if (Yt6 != null) {
                                        Yt6.field_favProto.mo141211f(favoriteOperationEvent.f264833d.f264838d.f298618f);
                                        ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142260DN(Yt6, C66261f3.COL_LOCALID);
                                        break;
                                    }
                                    break;
                                case 34:
                                    C100755z Yt7 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
                                    if (Yt7 != null && Yt7.field_type == 18) {
                                        favoriteOperationEvent.f264833d.f264838d = Yt7.field_favProto;
                                        break;
                                    }
                                case 35:
                                    C100734q.m131836a(aVar.f264842h);
                                    break;
                                case 36:
                                    FavoriteOperationEvent.C92516b bVar3 = favoriteOperationEvent.f264834e;
                                    if (C100734q.m131828S() == 0 || C100734q.m131814E() >= 10485760) {
                                        i3 = 0;
                                    }
                                    bVar3.f264855a = i3;
                                    break;
                                case 37:
                                    C100734q.m131847f0(aVar.f264842h, aVar.f264837c, aVar.f264836b, aVar.f264849o);
                                    break;
                                case 38:
                                    Log.m105925i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_UPLOAD_FAV_ITEM %s", aVar.f264851q);
                                    if (!Util.isNullOrNil(favoriteOperationEvent.f264833d.f264851q)) {
                                        String[] split = favoriteOperationEvent.f264833d.f264851q.split(";");
                                        LinkedList<String> linkedList3 = new LinkedList<>();
                                        linkedList3.addAll(Arrays.asList(split));
                                        if (linkedList3.size() > 0) {
                                            ArrayList arrayList3 = new ArrayList();
                                            for (String valueOf : linkedList3) {
                                                try {
                                                    int intValue = Integer.valueOf(valueOf).intValue();
                                                    if (intValue > 0) {
                                                        C100755z qq4 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142273qq((long) intValue);
                                                        C51953xc0 xc02 = new C51953xc0();
                                                        xc02.f144584d = intValue;
                                                        if (qq4 != null && !Util.isNullOrNil(qq4.field_xml)) {
                                                            xc02.f144585e = qq4.field_xml;
                                                        }
                                                        arrayList3.add(xc02);
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                            ((C100718j1) C86312j.m106911c(cls2)).Lt0(arrayList3);
                                            Log.m105924i("MicroMsg.Fav.FavoriteOperationListener", "do scene NetSceneCheckFavItem");
                                            break;
                                        }
                                    }
                                    break;
                                case 39:
                                    try {
                                        Log.m105925i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_RESEND_FAV_ITEM %s %s", aVar.f264851q, aVar.f264852r);
                                        int i9 = Util.getInt(favoriteOperationEvent.f264833d.f264851q, -1);
                                        ArrayList<String> stringsToList = Util.stringsToList(favoriteOperationEvent.f264833d.f264852r.split(";"));
                                        HashSet hashSet = new HashSet();
                                        hashSet.addAll(stringsToList);
                                        C100755z qq5 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142273qq((long) i9);
                                        if (qq5 != null) {
                                            C50524nd0 nd02 = new C50524nd0();
                                            nd02.f138541d = i9;
                                            boolean z = false;
                                            for (C101834rc0 next4 : qq5.field_favProto.f298618f) {
                                                if (hashSet.remove(next4.f299280T + "#0")) {
                                                    if (Util.isNullOrNil(next4.f299329u)) {
                                                        next4.mo141253f(((C101211h) C86312j.m106911c(cls)).mo140293rN());
                                                        C100695a0.m131727b(2);
                                                    }
                                                    if (C86013q1.m106450k(C100734q.m131880w(next4))) {
                                                        next4.f299330u1 = 1;
                                                        next4.f299332v1 = true;
                                                        C100734q.m131830U(next4, qq5, 0, false);
                                                        C100695a0.m131727b(3);
                                                        z = true;
                                                    } else {
                                                        C100695a0.m131727b(5);
                                                        C50529ne0 ne02 = new C50529ne0();
                                                        ne02.f138547d = next4.f299280T;
                                                        ne02.f138548e = 0;
                                                        ne02.f138549f = 4;
                                                        nd02.f138542e.add(ne02);
                                                    }
                                                }
                                                if (hashSet.remove(next4.f299280T + "#1")) {
                                                    if (Util.isNullOrNil(next4.f299329u)) {
                                                        next4.mo141253f(((C101211h) C86312j.m106911c(cls)).mo140293rN());
                                                        C100695a0.m131727b(2);
                                                    }
                                                    if (C86013q1.m106450k(C100734q.m131826Q(next4))) {
                                                        next4.f299330u1 = -1;
                                                        next4.f299332v1 = true;
                                                        C100734q.m131831V(next4, qq5, 0);
                                                        C100695a0.m131727b(3);
                                                        z = true;
                                                    } else {
                                                        C100695a0.m131727b(5);
                                                        C50529ne0 ne03 = new C50529ne0();
                                                        ne03.f138547d = next4.f299280T;
                                                        ne03.f138548e = 1;
                                                        ne03.f138549f = 4;
                                                        nd02.f138542e.add(ne03);
                                                    }
                                                }
                                            }
                                            if (hashSet.size() > 0) {
                                                Log.m105925i("MicroMsg.Fav.FavoriteOperationListener", "not found url data item %s", hashSet.toString());
                                                C100695a0.m131728c(4, hashSet.size());
                                                Iterator it6 = hashSet.iterator();
                                                while (it6.hasNext()) {
                                                    try {
                                                        String[] split2 = ((String) it6.next()).split("#");
                                                        C50529ne0 ne04 = new C50529ne0();
                                                        ne04.f138547d = split2[0];
                                                        ne04.f138548e = Integer.valueOf(split2[1]).intValue();
                                                        ne04.f138549f = 3;
                                                        nd02.f138542e.add(ne04);
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                            }
                                            if (nd02.f138542e.size() > 0) {
                                                ((C100718j1) C86312j.m106911c(cls2)).mo128214o9(nd02);
                                            }
                                            if (!z) {
                                                C100695a0.m131727b(7);
                                                Log.m105924i("MicroMsg.Fav.FavoriteOperationListener", "do not has upload data item");
                                                break;
                                            } else {
                                                if (qq5.field_type == 18) {
                                                    C101801kd0 kd06 = qq5.field_favProto;
                                                    kd06.mo141222t(kd06.f298606E + 1);
                                                }
                                                qq5.field_itemStatus = 15;
                                                ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).update(qq5, C66261f3.COL_LOCALID);
                                                ((C100718j1) C86312j.m106911c(cls2)).mo128212cl().run();
                                                C100695a0.m131727b(6);
                                                break;
                                            }
                                        } else {
                                            Log.m105925i("MicroMsg.Fav.FavoriteOperationListener", "NotFound %d", Integer.valueOf(i9));
                                            C100695a0.m131727b(8);
                                            break;
                                        }
                                    } catch (Exception e) {
                                        Log.printErrStackTrace("MicroMsg.Fav.FavoriteOperationListener", e, "TYPE_NEW_XML_RESEND_FAV_ITEM", new Object[0]);
                                        break;
                                    }
                                case 40:
                                    favoriteOperationEvent.f264834e.f264864j = C100734q.m131884y(aVar.f264838d);
                                    break;
                            }
                            break;
                    }
                } else {
                    C100755z Yt8 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
                    if (Yt8 == null) {
                        FavoriteOperationEvent.C92515a aVar5 = favoriteOperationEvent.f264833d;
                        C100734q.m131855j0(aVar5.f264840f, true, aVar5.f264847m, aVar5.f264839e);
                        FavoriteOperationEvent.C92515a aVar6 = favoriteOperationEvent.f264833d;
                        C100734q.m131859l0(aVar6.f264840f, true, aVar6.f264847m, aVar6.f264839e);
                    } else if (Util.isNullOrNil(favoriteOperationEvent.f264833d.f264849o)) {
                        C100734q.m131853i0(Yt8, favoriteOperationEvent.f264833d.f264840f, true);
                    } else {
                        C100734q.m131857k0(Yt8, favoriteOperationEvent.f264833d.f264840f, true);
                    }
                }
            } else {
                C101834rc0 rc03 = aVar.f264840f;
                if (rc03 != null) {
                    favoriteOperationEvent.f264834e.f264857c = new C86009m1(C100734q.m131880w(rc03)).mo119971i();
                    favoriteOperationEvent.f264834e.f264858d = new C86009m1(C100734q.m131826Q(favoriteOperationEvent.f264833d.f264840f)).mo119971i();
                }
            }
        } else {
            C100755z Yt9 = ((C102614d) ((C100718j1) C86312j.m106911c(cls2)).mo128199Jq()).mo142266Yt(favoriteOperationEvent.f264833d.f264839e);
            if (!(Yt9 == null || Yt9.field_tagProto.f186495e == null)) {
                favoriteOperationEvent.f264834e.f264856b = new ArrayList();
                ((ArrayList) favoriteOperationEvent.f264834e.f264856b).addAll(Yt9.field_tagProto.f186495e);
            }
        }
        return false;
    }

    /* renamed from: d */
    public final String mo128367d(C101834rc0 rc02) {
        C86009m1 m1Var = new C86009m1(C100734q.m131826Q(rc02));
        if (m1Var.mo119967g()) {
            return m1Var.mo119971i();
        }
        if (rc02.f299254G == null) {
            return "";
        }
        C86009m1 m1Var2 = new C86009m1(C100734q.m131812C() + C90193h.m112878f(rc02.f299254G.getBytes()));
        return m1Var2.mo119967g() ? m1Var2.mo119971i() : "";
    }
}
