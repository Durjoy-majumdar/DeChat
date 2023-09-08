package oa3;

import android.text.TextUtils;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import gl0.C87269g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import la3.C117468g;
import la3.C117470l;
import la3.C117472m;
import ra3.C118229a;
import ta3.C118415d;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: oa3.d */
public class C35123d extends C86301e implements C35122c {

    /* renamed from: oa3.d$a */
    public class C35124a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f94215d;

        /* renamed from: e */
        public final /* synthetic */ List f94216e;

        /* renamed from: f */
        public final /* synthetic */ List f94217f;

        public C35124a(List list, List list2, List list3) {
            this.f94215d = list;
            this.f94216e = list2;
            this.f94217f = list3;
        }

        public void run() {
            long j;
            int i;
            int i2;
            C35123d dVar = C35123d.this;
            List list = this.f94215d;
            List<C117733g> list2 = this.f94216e;
            List<Integer> list3 = this.f94217f;
            dVar.getClass();
            long currentTicks = Util.currentTicks();
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            if (list2 != null && !list2.isEmpty()) {
                for (C117733g gVar : list2) {
                    int i3 = gVar.f352071b;
                    if (i3 == 1) {
                        hashSet.add(gVar.f352070a);
                    } else {
                        if (i3 == 2) {
                            hashSet2.add(gVar.f352070a);
                        }
                    }
                }
            }
            int i4 = 3;
            if (list3 != null && !list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (Integer num : list3) {
                    C118229a aVar = new C118229a();
                    aVar.field_expId = num.toString();
                    C117468g.f351552c.mo182174c().get(aVar, "expId");
                    if (!TextUtils.isEmpty(aVar.field_LabsAppId)) {
                        aVar.field_Switch = i4;
                        aVar.field_endtime = Util.nowSecond() - 1;
                        arrayList.add(aVar);
                        Log.m105925i("MicroMsg.XExptForWelabBridge", "welab app[%s] stop now", aVar);
                        String str = aVar.field_LabsAppId;
                        String str2 = aVar.field_expId;
                        C117470l.C117471a aVar2 = new C117470l.C117471a();
                        aVar2.f351555a = str;
                        aVar2.f351557c = 9;
                        aVar2.f351558d = System.currentTimeMillis();
                        aVar2.f351556b = str2;
                        aVar2.f351559e = false;
                        C117470l.m165699b(aVar2);
                    }
                    i4 = 3;
                }
                if (!arrayList.isEmpty()) {
                    C117468g.f351552c.mo182174c().mo140536Lo(arrayList);
                }
            }
            if (list == null || list.isEmpty()) {
                j = currentTicks;
            } else {
                HashMap hashMap = new HashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C117732f fVar = (C117732f) it.next();
                    C118229a aVar3 = new C118229a();
                    aVar3.field_expId = String.valueOf(fVar.f352065a);
                    aVar3.field_sequence = (long) fVar.f352066b;
                    long j2 = fVar.f352067c;
                    if (j2 <= 0) {
                        j2 = System.currentTimeMillis() / 1000;
                    }
                    aVar3.field_starttime = j2;
                    long j3 = fVar.f352068d;
                    if (j3 <= 0) {
                        j3 = MAlarmHandler.NEXT_FIRE_INTERVAL;
                    }
                    aVar3.field_endtime = j3;
                    String str3 = "xlab_" + fVar.f352065a;
                    HashMap<String, String> hashMap2 = fVar.f352069e;
                    aVar3.field_AllVer = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "AllVer")));
                    aVar3.field_BizType = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "BizType")));
                    aVar3.field_Desc_cn = hashMap2.get(C117472m.m165701b(str3, "Desc_cn"));
                    aVar3.field_Desc_en = hashMap2.get(C117472m.m165701b(str3, "Desc_en"));
                    aVar3.field_Desc_hk = hashMap2.get(C117472m.m165701b(str3, "Desc_hk"));
                    aVar3.field_Desc_tw = hashMap2.get(C117472m.m165701b(str3, "Desc_tw"));
                    aVar3.field_DetailURL = hashMap2.get(C117472m.m165701b(str3, "DetailURL"));
                    aVar3.field_Introduce_cn = hashMap2.get(C117472m.m165701b(str3, "Introduce_cn"));
                    aVar3.field_Introduce_en = hashMap2.get(C117472m.m165701b(str3, "Introduce_en"));
                    aVar3.field_Introduce_hk = hashMap2.get(C117472m.m165701b(str3, "Introduce_hk"));
                    aVar3.field_Introduce_tw = hashMap2.get(C117472m.m165701b(str3, "Introduce_tw"));
                    aVar3.field_Pos = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "Pos")));
                    aVar3.field_Type = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "Type")));
                    aVar3.field_Switch = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "Switch")));
                    aVar3.field_WeAppPath = hashMap2.get(C117472m.m165701b(str3, "WeAppPath"));
                    aVar3.field_WeAppUser = hashMap2.get(C117472m.m165701b(str3, "WeAppUser"));
                    aVar3.field_LabsAppId = hashMap2.get(C117472m.m165701b(str3, "LabsAppId"));
                    aVar3.field_TitleKey_android = hashMap2.get(C117472m.m165701b(str3, "TitleKey_android"));
                    aVar3.field_Title_cn = hashMap2.get(C117472m.m165701b(str3, "Title_cn"));
                    aVar3.field_Title_en = hashMap2.get(C117472m.m165701b(str3, "Title_en"));
                    aVar3.field_Title_hk = hashMap2.get(C117472m.m165701b(str3, "Title_hk"));
                    aVar3.field_Title_tw = hashMap2.get(C117472m.m165701b(str3, "Title_tw"));
                    aVar3.field_ThumbUrl_cn = hashMap2.get(C117472m.m165701b(str3, "ThumbUrl_cn"));
                    aVar3.field_ThumbUrl_en = hashMap2.get(C117472m.m165701b(str3, "ThumbUrl_en"));
                    aVar3.field_ThumbUrl_hk = hashMap2.get(C117472m.m165701b(str3, "ThumbUrl_hk"));
                    aVar3.field_ThumbUrl_tw = hashMap2.get(C117472m.m165701b(str3, "ThumbUrl_tw"));
                    Iterator it4 = it;
                    long j4 = currentTicks;
                    aVar3.field_ImgUrl_android_cn = C117472m.m165700a(hashMap2, C117472m.m165701b(str3, "ImgUrl_android_cn")).replace(',', ';');
                    aVar3.field_ImgUrl_android_tw = C117472m.m165700a(hashMap2, C117472m.m165701b(str3, "ImgUrl_android_tw")).replace(',', ';');
                    aVar3.field_ImgUrl_android_en = C117472m.m165700a(hashMap2, C117472m.m165701b(str3, "ImgUrl_android_en")).replace(',', ';');
                    aVar3.field_ImgUrl_android_hk = C117472m.m165700a(hashMap2, C117472m.m165701b(str3, "ImgUrl_android_hk")).replace(',', ';');
                    if (TextUtils.isEmpty(aVar3.field_ImgUrl_android_cn)) {
                        aVar3.field_ImgUrl_android_cn = hashMap2.get(C117472m.m165701b(str3, "ImgUrl_cn"));
                    }
                    if (TextUtils.isEmpty(aVar3.field_ImgUrl_android_en)) {
                        aVar3.field_ImgUrl_android_en = hashMap2.get(C117472m.m165701b(str3, "ImgUrl_en"));
                    }
                    if (TextUtils.isEmpty(aVar3.field_ImgUrl_android_hk)) {
                        aVar3.field_ImgUrl_android_hk = hashMap2.get(C117472m.m165701b(str3, "ImgUrl_hk"));
                    }
                    if (TextUtils.isEmpty(aVar3.field_ImgUrl_android_tw)) {
                        aVar3.field_ImgUrl_android_tw = hashMap2.get(C117472m.m165701b(str3, "ImgUrl_tw"));
                    }
                    aVar3.field_RedPoint = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "RedPoint")));
                    aVar3.field_WeAppDebugMode = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "WeAppDebugMode")));
                    aVar3.field_TitleKey_android = hashMap2.get(C117472m.m165701b(str3, "TitleKey_android"));
                    aVar3.field_Icon = hashMap2.get(C117472m.m165701b(str3, "Icon"));
                    aVar3.field_bItemFromXExpt = 1;
                    aVar3.field_status = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "status")));
                    aVar3.field_idkey = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "idkey")));
                    aVar3.field_idkeyValue = Util.safeParseInt(hashMap2.get(C117472m.m165701b(str3, "idkeyValue")));
                    if (aVar3.isValid()) {
                        if (!hashMap.containsKey(aVar3.field_LabsAppId)) {
                            hashMap.put(aVar3.field_LabsAppId, aVar3);
                        } else if (Util.getInt(((C118229a) hashMap.get(aVar3.field_LabsAppId)).field_expId, 0) < Util.getInt(aVar3.field_expId, 0)) {
                            hashMap.put(aVar3.field_LabsAppId, aVar3);
                        }
                        int i5 = aVar3.field_idkey;
                        if (i5 > 0 && (i2 = aVar3.field_idkeyValue) >= 0) {
                            C115669n.INSTANCE.idkeyStat((long) i5, (long) i2, 1, false);
                        }
                    }
                    it = it4;
                    currentTicks = j4;
                }
                j = currentTicks;
                ArrayList arrayList2 = new ArrayList();
                for (C118229a aVar4 : hashMap.values()) {
                    C117468g gVar2 = C117468g.f351552c;
                    C118229a b = gVar2.mo182173b(aVar4.field_LabsAppId);
                    if (!(b.field_bItemFromXExpt == 1) || Util.getInt(b.field_expId, 0) <= Util.getInt(aVar4.field_expId, 0)) {
                        if (aVar4.field_status == 1) {
                            gVar2.mo182174c().delete(aVar4, "expId");
                        } else {
                            arrayList2.add(aVar4);
                            linkedList.add(aVar4);
                            C118415d dVar2 = C118415d.f353896c;
                            dVar2.mo183209c(aVar4);
                            String str4 = aVar4.field_LabsAppId;
                            String str5 = aVar4.field_expId;
                            boolean a = dVar2.mo183207a(aVar4);
                            C117470l.C117471a aVar5 = new C117470l.C117471a();
                            aVar5.f351555a = str4;
                            aVar5.f351557c = 8;
                            aVar5.f351558d = System.currentTimeMillis();
                            aVar5.f351556b = str5;
                            aVar5.f351559e = a;
                            C117470l.m165699b(aVar5);
                        }
                    } else {
                        Log.m105929w("MicroMsg.XExptForWelabBridge", "it had local welab item, don't update.local[%s] new[%s]", b, aVar4);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    C117468g.f351552c.mo182174c().mo140536Lo(arrayList2);
                }
                C115669n.INSTANCE.mo175911u(C87269g.CTRL_INDEX, 20);
            }
            if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                Iterator it5 = ((ArrayList) C117468g.f351552c.mo182174c().mo140537jo()).iterator();
                while (it5.hasNext()) {
                    C118229a aVar6 = (C118229a) it5.next();
                    if (aVar6 != null && aVar6.isValid()) {
                        if (aVar6.field_bItemFromXExpt == 1) {
                            if (!hashSet.contains(aVar6.field_LabsAppId) || aVar6.field_Switch != 1) {
                                i = 2;
                            } else {
                                i = 2;
                                aVar6.field_Switch = 2;
                                arrayList3.add(aVar6);
                            }
                            if (hashSet2.contains(aVar6.field_LabsAppId) && aVar6.field_Switch == i) {
                                aVar6.field_Switch = 1;
                                arrayList3.add(aVar6);
                            }
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C117468g.f351552c.mo182174c().mo140536Lo(arrayList3);
                }
            }
            C117468g.f351552c.mo182177f(linkedList);
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(list != null ? list.size() : 0);
            objArr[1] = Integer.valueOf(list3 != null ? list3.size() : 0);
            objArr[2] = Long.valueOf(Util.ticksToNow(j));
            objArr[3] = hashSet;
            objArr[4] = hashSet2;
            Log.m105925i("MicroMsg.XExptForWelabBridge", "itemList [%d] delList[%d] cost[%d] openAppId[%s] closeAppId[%s]", objArr);
        }
    }

    public void hb0(List<C117732f> list, List<C117733g> list2, List<Integer> list3) {
        ((C119157j) C119157j.f356862d).mo183876g(new C35124a(list, list2, list3), "cross_welab");
    }
}
