package dj1;

import cj1.C0639y1;
import cj1.C0644z1;
import cl1.C0653a0;
import cl1.C0696x;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import ig1.C8916d;
import ik1.C8925e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import je1.C46523h2;
import kt1.C46744d;
import o40.C61926c;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import p165hr.C60106t;
import p749xh.C38596k3;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64197v;
import sx3.C77813z;
import te3.C48830ba3;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50290lo0;
import te3.C50427mo0;
import te3.C50767p11;
import te3.C51163rv3;
import te3.C51328t11;
import te3.C51548uh3;
import te3.C51875wt3;
import zc1.C66785b;

/* renamed from: dj1.l */
public final class C7341l extends C58286q<C50427mo0> {

    /* renamed from: x */
    public static final C7342a f25459x = new C7342a((C8480h) null);

    /* renamed from: t */
    public final String f25460t = "Finder.CgiFinderGetLiveGiftList";

    /* renamed from: u */
    public final JSONObject f25461u = new JSONObject();

    /* renamed from: v */
    public final JSONObject f25462v;

    /* renamed from: w */
    public C50290lo0 f25463w;

    /* renamed from: dj1.l$a */
    public static final class C7342a {
        public C7342a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo8515a(C50767p11 p112) {
            C87412m.m108594g(p112, "gift");
            return "remoteGift : [id:" + p112.f139507d + ", businessType:" + p112.f139508e + ", thumbnailFileUrl:" + p112.f139509f + ", previewUrl:" + p112.f139510g + ", animationUrl:" + p112.f139511h + ", thumbnailMd5:" + p112.f139512i + ", previewMd5:" + p112.f139513j + ", animationMd5:" + p112.f139514n + ", type:" + p112.f139517q + ", name:" + p112.f139515o + ", price:" + p112.f139516p + "，flag:" + p112.f139519s + ", landscapeUrl" + p112.f139520t + ", landscapeMd5" + p112.f139521u + ']';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7341l(long j, long j2, String str, String str2, int i, byte[] bArr, int i2, int i3) {
        super((C49712hj1) null, 1, (C8480h) null);
        long j3 = j;
        long j4 = j2;
        String str3 = str;
        String str4 = str2;
        int i4 = i3;
        C87412m.m108594g(str3, "objectNonceId");
        C89349b bVar = null;
        JSONObject jSONObject = new JSONObject();
        this.f25462v = jSONObject;
        C50290lo0 lo02 = new C50290lo0();
        this.f25463w = lo02;
        lo02.f137534d = C46523h2.f125330a.mo71859a(4053);
        C50290lo0 lo03 = this.f25463w;
        lo03.f137535e = j3;
        lo03.f137536f = j4;
        lo03.f137537g = str3;
        lo03.f137538h = str4;
        FinderLiveService.f159376d.getClass();
        lo03.f137539i = FinderLiveService.f159353F;
        C50290lo0 lo04 = this.f25463w;
        lo04.f137540j = i;
        lo04.f137541n = bArr != null ? C89349b.m111674a(bArr) : bVar;
        this.f25463w.f137542o = C66785b.f191882e.mo90662O5();
        C50290lo0 lo05 = this.f25463w;
        lo05.f137543p = i2;
        lo05.f137544q = i4;
        jSONObject.put("liveId", j3);
        jSONObject.put("objectId", j4);
        jSONObject.put("username", str4);
        Log.m105924i("Finder.CgiFinderGetLiveGiftList", "liveId:" + j3 + " pull_scene:" + i4 + " objectId:" + j4 + " objectNonceId:" + str3 + " username:" + str4 + ",scene:" + this.f25463w.f137540j);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = this.f25463w;
        C50427mo0 mo02 = new C50427mo0();
        mo02.setBaseResponse(new C49966ja());
        mo02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = mo02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/findergetliverewardgiftlist";
        bVar2.f127069d = 4053;
        mo123453j(bVar2.mo72403a());
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f25462v;
    }

    /* renamed from: R0 */
    public JSONObject mo8510R0() {
        return this.f25461u;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        String str2;
        C50427mo0 mo02 = (C50427mo0) eu32;
        Class cls = C0653a0.class;
        C87412m.m108594g(mo02, "resp");
        Log.m105924i(this.f25460t, "[onCgiBack] scene:" + this.f25463w.f137540j + ",errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        if (i == 0 && i2 == 0) {
            Log.m105924i(this.f25460t, "resp = " + C61937h.m72709h(mo02));
            if (!Util.isNullOrNil((List) mo02.f138130i)) {
                FinderLiveService finderLiveService = FinderLiveService.f159376d;
                C0653a0 a0Var = (C0653a0) finderLiveService.mo77630e(cls);
                boolean z = a0Var != null ? a0Var.f1543g : false;
                C0653a0 a0Var2 = (C0653a0) finderLiveService.mo77630e(cls);
                if (a0Var2 != null) {
                    a0Var2.f1543g = z || this.f25463w.f137544q == 2;
                }
                LinkedList<C50767p11> linkedList = mo02.f138125d;
                C87412m.m108593f(linkedList, "resp.gift_list");
                mo8511s(linkedList);
                LinkedList linkedList2 = new LinkedList();
                LinkedList<C51328t11> linkedList3 = mo02.f138130i;
                if (linkedList3 != null) {
                    for (C51328t11 t112 : linkedList3) {
                        linkedList2.addAll(t112.f141898e);
                    }
                }
                C0639y1 y1Var = C0639y1.f1510a;
                C0639y1.f1522m = mo02.f138129h;
                C0639y1.f1523n = mo02.f138132n;
                mo8514v(mo02.f138130i);
                mo8513u(linkedList2, mo02.f138131j);
                C48830ba3 ba32 = mo02.f138131j;
                if (ba32 != null) {
                    Log.m105924i("Finder.FinderLiveGiftLoader", "[savePkgGiftInfo] pkgResInfo:" + C61937h.m72709h(ba32));
                    C0639y1.f1518i.clear();
                    C0639y1.f1519j.clear();
                    C0639y1.f1520k = ba32.f131026e;
                    LinkedList<C51875wt3> linkedList4 = ba32.f131025d;
                    C87412m.m108593f(linkedList4, "pkgResInfo.resource_list");
                    for (C51875wt3 wt32 : linkedList4) {
                        C50767p11 p112 = wt32.f144287d;
                        if (!(p112 == null || (str2 = p112.f139507d) == null)) {
                            if (!(str2.length() > 0)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                LinkedList<C51548uh3> linkedList5 = wt32.f144288e;
                                C87412m.m108593f(linkedList5, "resInfo.batch_list");
                                ArrayList arrayList = new ArrayList();
                                for (T next : linkedList5) {
                                    if (((C51548uh3) next).f142859f > C31543z5.m39455e()) {
                                        arrayList.add(next);
                                    }
                                }
                                if (!(!arrayList.isEmpty())) {
                                    arrayList = null;
                                }
                                if (arrayList != null) {
                                    Map<String, LinkedList<C51548uh3>> map = C0639y1.f1518i;
                                    if (map.containsKey(str2)) {
                                        LinkedList linkedList6 = map.get(str2);
                                        if (linkedList6 != null) {
                                            linkedList6.addAll(arrayList);
                                        }
                                    } else {
                                        map.put(str2, new LinkedList(arrayList));
                                    }
                                }
                                Map<String, LinkedList<C51548uh3>> map2 = C0639y1.f1518i;
                                LinkedList linkedList7 = map2.get(str2);
                                if (linkedList7 != null) {
                                    C77813z.m93909o(linkedList7, C0644z1.f1531d);
                                }
                                C50767p11 p113 = wt32.f144287d;
                                if (p113 != null) {
                                    Collection collection = map2.get(str2);
                                    if (!(collection == null || collection.isEmpty())) {
                                        C8916d a = C8916d.f28211b1.mo9727a(p113);
                                        Map<String, C8916d> map3 = C0639y1.f1519j;
                                        C87412m.m108593f(map3, "pkgGiftCache");
                                        map3.put(str2, a);
                                    }
                                }
                                C0639y1.f1510a.mo618j(str2);
                            }
                        }
                    }
                    Log.m105924i("Finder.FinderLiveGiftLoader", "[updateGiftPage] pkgGiftList = " + C0639y1.f1519j.keySet() + ", batchInfoList = " + C0639y1.f1518i.keySet());
                }
            } else if (!Util.isNullOrNil((List) mo02.f138125d)) {
                mo8514v((LinkedList<C51328t11>) null);
                LinkedList<C50767p11> linkedList8 = mo02.f138125d;
                C87412m.m108593f(linkedList8, "resp.gift_list");
                mo8511s(linkedList8);
                LinkedList<C50767p11> linkedList9 = mo02.f138125d;
                C87412m.m108593f(linkedList9, "resp.gift_list");
                mo8513u(linkedList9, (C48830ba3) null);
            } else {
                Log.m105928w(this.f25460t, "resp.gift_list is nullOrNil");
            }
        }
    }

    /* renamed from: s */
    public final void mo8511s(List<? extends C50767p11> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C61926c.m72696u(((C50767p11) t).f139519s, 4)) {
                break;
            }
        }
        C50767p11 p112 = (C50767p11) t;
        if (p112 != null) {
            C0696x xVar = (C0696x) FinderLiveService.f159376d.mo77630e(C0696x.class);
            if (xVar != null) {
                xVar.mo661e3(C8916d.f28211b1.mo9727a(p112));
            }
            String str = this.f25460t;
            Log.m105924i(str, "join fans club Gift : [id:" + p112.f139507d + ", type:" + p112.f139517q + ", name:" + p112.f139515o + ", price:" + p112.f139516p + "，flag:" + p112.f139519s + ']');
        }
    }

    /* renamed from: t */
    public final String mo8512t(C38596k3 k3Var) {
        return "localGift : [id:" + k3Var.field_rewardProductId + ", businessType:" + k3Var.field_businessType + ", thumbnailFileUrl:" + k3Var.field_thumbnailFileUrl + ", previewUrl:" + k3Var.field_previewPagUrl + ", animationUrl:" + k3Var.field_animationPagUrl + ", thumbnailMd5:" + k3Var.field_thumbnailMd5 + ", previewMd5:" + k3Var.field_previewPagMd5 + ", animationMd5:" + k3Var.field_animationPagMd5 + ", type:" + k3Var.field_giftType + ", name:" + k3Var.field_name + ", price:" + k3Var.field_price + "，flag:" + k3Var.field_flag + ", state:" + k3Var.field_state + ", landscapeUrl" + k3Var.field_landscapePagUrl + ", landscapeMd5" + k3Var.field_landscapePagMd5 + ']';
    }

    /* renamed from: u */
    public final void mo8513u(List<? extends C50767p11> list, C48830ba3 ba32) {
        Object obj;
        Object obj2;
        LinkedList<C51875wt3> linkedList;
        Object obj3;
        C48830ba3 ba33 = ba32;
        Class cls = C60106t.class;
        C8925e zx02 = ((C60106t) C86312j.m106911c(cls)).zx0();
        List<C8916d> jo = zx02.mo9740jo();
        LinkedList linkedList2 = new LinkedList(list);
        Object obj4 = null;
        if (!(ba33 == null || (linkedList = ba33.f131025d) == null)) {
            for (C51875wt3 wt32 : linkedList) {
                C50767p11 p112 = wt32.f144287d;
                if (p112 != null) {
                    Iterator it = linkedList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it.next();
                        String str = ((C50767p11) obj3).f139507d;
                        String str2 = p112.f139507d;
                        if (str2 == null) {
                            str2 = "";
                        }
                        if (C87412m.m108589b(str, str2)) {
                            break;
                        }
                    }
                    if (obj3 == null) {
                        linkedList2.add(p112);
                    }
                }
            }
        }
        int i = 0;
        if (jo.isEmpty()) {
            for (Object next : linkedList2) {
                int i2 = i + 1;
                if (i >= 0) {
                    C50767p11 p113 = (C50767p11) next;
                    C8916d a = C8916d.f28211b1.mo9727a(p113);
                    a.field_giftIndex = i;
                    ((C60106t) C86312j.m106911c(cls)).zx0().mo9741qq(a);
                    Log.m105924i(this.f25460t, f25459x.mo8515a(p113));
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        } else {
            ArrayList<C8916d> arrayList = new ArrayList<>();
            HashMap hashMap = new HashMap();
            for (C8916d dVar : jo) {
                Iterator it4 = linkedList2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = obj4;
                        break;
                    }
                    obj = it4.next();
                    if (Util.isEqual(((C50767p11) obj).f139507d, dVar.field_rewardProductId)) {
                        break;
                    }
                }
                boolean z = obj == null;
                Iterator it5 = linkedList2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it5.next();
                    C50767p11 p114 = (C50767p11) obj2;
                    if (Util.isEqual(p114.f139507d, dVar.field_rewardProductId) && (!Util.isEqual(p114.f139509f, dVar.field_thumbnailFileUrl) || !Util.isEqual(p114.f139510g, dVar.field_previewPagUrl) || !Util.isEqual(p114.f139511h, dVar.field_animationPagUrl) || !Util.isEqual(p114.f139520t, dVar.field_landscapePagUrl))) {
                        break;
                    }
                }
                boolean z2 = obj2 != null;
                String str3 = dVar.field_rewardProductId;
                C87412m.m108593f(str3, "localGiftInfo.field_rewardProductId");
                hashMap.put(str3, Integer.valueOf(dVar.field_state));
                if (z || z2) {
                    arrayList.add(dVar);
                    String str4 = dVar.field_rewardProductId;
                    C87412m.m108593f(str4, "localGiftInfo.field_rewardProductId");
                    hashMap.put(str4, 0);
                }
                Log.m105924i(this.f25460t, "localGiftDeprecated:" + z + ", localGiftUrlDeprecated:" + z2 + ' ' + mo8512t(dVar));
                obj4 = null;
            }
            for (C8916d dVar2 : arrayList) {
                String str5 = dVar2.field_rewardProductId;
                int delete = zx02.f28231e.delete("FinderLiveGiftInfo", "rewardProductId=?", new String[]{"" + str5});
                Log.m105924i(this.f25460t, "remove " + delete + ' ' + mo8512t(dVar2));
            }
            int i3 = 0;
            for (Object next2 : linkedList2) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C50767p11 p115 = (C50767p11) next2;
                    C8916d a2 = C8916d.f28211b1.mo9727a(p115);
                    Integer num = (Integer) hashMap.get(p115.f139507d);
                    a2.field_state = num != null ? num.intValue() : 0;
                    a2.field_giftIndex = i3;
                    ((C60106t) C86312j.m106911c(cls)).zx0().mo9741qq(a2);
                    Log.m105924i(this.f25460t, f25459x.mo8515a(p115));
                    i3 = i4;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
        C0639y1 y1Var = C0639y1.f1510a;
        C0639y1.f1513d.clear();
        ArrayList arrayList2 = (ArrayList) ((C60106t) C86312j.m106911c(cls)).zx0().mo9740jo();
        if (arrayList2.isEmpty()) {
            Log.m105928w("Finder.FinderLiveGiftLoader", "skip fetch gift, giftList from db is nullOrNil");
        }
        Map<String, C8916d> map = C0639y1.f1514e;
        C87412m.m108593f(map, "giftFromMsgCache");
        synchronized (map) {
            for (Map.Entry next3 : map.entrySet()) {
                if (!(next3.getKey() == null || next3.getValue() == null)) {
                    Map<String, C8916d> map2 = C0639y1.f1513d;
                    C87412m.m108593f(map2, "giftCache");
                    map2.put(next3.getKey(), next3.getValue());
                }
            }
        }
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            C8916d dVar3 = (C8916d) it6.next();
            Map<String, C8916d> map3 = C0639y1.f1513d;
            C87412m.m108593f(map3, "giftCache");
            map3.put(dVar3.field_rewardProductId, dVar3);
        }
        C0639y1.f1512c.clear();
        LinkedHashMap<String, List<String>> Lo = ((C60106t) C86312j.m106911c(cls)).zx0().mo9739Lo();
        if (Lo != null) {
            C0639y1.f1512c = Collections.synchronizedMap(Lo);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cur gift cache:");
        Map<String, C8916d> map4 = C0639y1.f1513d;
        sb.append(map4);
        sb.append(", giftTabInfoList:");
        sb.append(C0639y1.f1512c);
        Log.m105924i("Finder.FinderLiveGiftLoader", sb.toString());
        C87412m.m108593f(map4, "giftCache");
        synchronized (map4) {
            for (Map.Entry next4 : map4.entrySet()) {
                C8916d dVar4 = (C8916d) next4.getValue();
                C0639y1 y1Var2 = C0639y1.f1510a;
                C87412m.m108593f(dVar4, "giftInfo");
                y1Var2.mo619k(dVar4, (String) next4.getKey());
            }
        }
    }

    /* renamed from: v */
    public final void mo8514v(LinkedList<C51328t11> linkedList) {
        C13598b0 b0Var;
        ((C60106t) C86312j.m106911c(C60106t.class)).zx0().getClass();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_GIFT_TAB_INFO_STRING_SYNC;
        if (linkedList != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (C51328t11 t112 : linkedList) {
                    String str = t112.f141897d;
                    JSONArray jSONArray = new JSONArray();
                    LinkedList<C50767p11> linkedList2 = t112.f141898e;
                    if (linkedList2 != null) {
                        for (C50767p11 p112 : linkedList2) {
                            jSONArray.put(p112.f139507d);
                        }
                    }
                    C13598b0 b0Var2 = C13598b0.f38549a;
                    jSONObject.put(str, jSONArray);
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, jSONObject.toString());
            } catch (Exception e) {
                Log.m105924i("Finder.FinderLiveGiftStorage", "[saveLiveGiftTabInfo] e:" + e.getMessage());
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar, "");
        }
    }
}
