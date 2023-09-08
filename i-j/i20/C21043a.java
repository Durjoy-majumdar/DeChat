package i20;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import fi3.C86868b;
import g91.C20813c;
import gy3.C87412m;
import h81.C20928j;
import i91.C21060a;
import i91.C21062c;
import ia1.C98625h;
import j20.C117292a;
import j20.C117293c;
import j20.C21152b;
import j20.C21153d;
import j20.C21154e;
import j91.C21200b;
import j91.C21203d;
import j91.C21207e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k91.C117394e;
import o91.C21787e;
import op3.C117877b;
import r91.C22217a;
import s91.C22316b;
import s91.C22317c;
import s91.C22320d;
import s91.C22323e;
import s91.C22326f;
import s91.C22329g;
import s91.C22332h;
import s91.C22335i;
import s91.C22338j;
import s91.C22341k;
import s91.C22344l;
import s91.C22347m;
import s91.C22350n;
import s91.C22353o;
import t91.C22466j;
import t91.C64208c;
import te3.C118482z53;
import te3.fh4;
import z91.C23462b;

/* renamed from: i20.a */
public final class C21043a {

    /* renamed from: c */
    public static C21043a f59536c;

    /* renamed from: a */
    public C117129d f59537a = null;

    /* renamed from: b */
    public C21045c f59538b = null;

    /* renamed from: h */
    public static C21043a m23197h() {
        if (f59536c == null) {
            synchronized (C21043a.class) {
                if (f59536c == null) {
                    f59536c = new C21043a();
                }
            }
        }
        return f59536c;
    }

    /* renamed from: a */
    public void mo32748a(Object obj, int i) {
        C22350n nVar;
        C22341k kVar;
        C22344l lVar;
        C22317c cVar;
        C22332h hVar;
        C22320d dVar;
        C22323e eVar;
        C22335i iVar;
        C22347m mVar;
        C22317c cVar2;
        C21045c cVar3;
        if (!(obj instanceof Context) || !(obj instanceof Activity)) {
            return;
        }
        if (i == 0) {
            C21045c cVar4 = this.f59538b;
            if (cVar4 != null) {
                C21203d.C21204a aVar = (C21203d.C21204a) cVar4;
                Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onCreate: %s, %d", obj.getClass().getName(), Integer.valueOf(obj.hashCode()));
                if (C21203d.this.f59975a != null) {
                    Activity activity = (Activity) obj;
                    if (C86868b.m107886a(activity)) {
                        C21207e eVar2 = C21203d.this.f59975a;
                        Intent intent = activity.getIntent();
                        C21200b bVar = (C21200b) eVar2;
                        if (bVar.f59972d) {
                            C118482z53 a = bVar.f59971c.mo33177a(intent, activity);
                            fh4 fh4 = a.f354614d;
                            long j = fh4.f354003f;
                            C22466j jVar = C22466j.f63621a;
                            C22466j.m26186g(fh4.f354001d);
                            C20813c.m22810a().mo32508c(200, a);
                        } else {
                            String canonicalName = activity.getClass().getCanonicalName();
                            int hashCode = activity.hashCode();
                            C117394e.m165538d(canonicalName, (String) null, 104);
                            C21200b.m23663c((Activity) null, intent, (String) null, canonicalName, hashCode);
                            C21062c.m23249d().mo32777h(canonicalName, hashCode, C21060a.CREATE);
                        }
                        Iterator it = ((CopyOnWriteArrayList) bVar.f59969a).iterator();
                        while (it.hasNext()) {
                            ((C20928j.C20932d) it.next()).mo32638E(intent, activity);
                        }
                    }
                }
            }
        } else if (i == 2) {
            C21045c cVar5 = this.f59538b;
            if (cVar5 != null) {
                ((C21203d.C21204a) cVar5).mo33184c(obj);
            }
        } else if (i == 3) {
            C21045c cVar6 = this.f59538b;
            if (cVar6 != null) {
                ((C21203d.C21204a) cVar6).mo33182a(obj);
            }
        } else if (i == 4) {
            C21045c cVar7 = this.f59538b;
            if (cVar7 != null) {
                ((C21203d.C21204a) cVar7).mo33185d(obj);
            }
        } else if (i == 5) {
            C21045c cVar8 = this.f59538b;
            if (cVar8 != null) {
                C21203d.C21204a aVar2 = (C21203d.C21204a) cVar8;
                Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onDestroy: %s, %d", obj.getClass().getName(), Integer.valueOf(obj.hashCode()));
                if (C21203d.this.f59975a != null) {
                    Activity activity2 = (Activity) obj;
                    if (C86868b.m107886a(activity2)) {
                        C21200b bVar2 = (C21200b) C21203d.this.f59975a;
                        if (bVar2.f59972d) {
                            bVar2.f59971c.getClass();
                            fh4 fh42 = new fh4();
                            fh42.f354001d = activity2.getClass().getCanonicalName();
                            fh42.f354002e = activity2.hashCode();
                            fh42.f354003f = System.currentTimeMillis();
                            C20813c.m22810a().mo32508c(207, fh42);
                            String str = fh42.f354001d;
                            C87412m.m108594g(str, "pageName");
                            switch (str.hashCode()) {
                                case -2031553009:
                                    if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI") && (nVar = C22316b.f63280d) != null) {
                                        nVar.mo35486e(2, "com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI", activity2);
                                        break;
                                    }
                                case -1615773847:
                                    if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI") && (kVar = C22316b.f63282f) != null) {
                                        kVar.mo35483e(2, "com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI", activity2);
                                        break;
                                    }
                                case -1605333887:
                                    if (str.equals("com.tencent.mm.plugin.finder.search.FinderFeedSearchUI") && (lVar = C22316b.f63283g) != null) {
                                        lVar.mo35484e(2, "com.tencent.mm.plugin.finder.search.FinderFeedSearchUI", activity2);
                                        break;
                                    }
                                case -1490149623:
                                    if (str.equals("com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI") && (cVar = C22316b.f63279c) != null) {
                                        cVar.mo35475e(2, "com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI", activity2);
                                        break;
                                    }
                                case -936307702:
                                    if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI") && (hVar = C22316b.f63286j) != null) {
                                        hVar.mo35481e(2, "com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI", activity2);
                                        break;
                                    }
                                case 1670085563:
                                    if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI") && (dVar = C22316b.f63285i) != null) {
                                        dVar.mo35479e(2, "com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI", activity2);
                                        break;
                                    }
                                case 1670607163:
                                    if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelTimelineUI") && (eVar = C22316b.f63284h) != null) {
                                        eVar.mo35480e(2, "com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelTimelineUI", activity2);
                                        break;
                                    }
                                case 1878606788:
                                    if (str.equals("com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI") && (iVar = C22316b.f63281e) != null) {
                                        iVar.mo35482e(2, "com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI", activity2);
                                        break;
                                    }
                                case 1966129866:
                                    if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI") && (mVar = C22316b.f63278b) != null) {
                                        mVar.mo35485e(2, str, activity2);
                                        break;
                                    }
                                case 2029821223:
                                    if (str.equals("com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI") && (cVar2 = C22316b.f63279c) != null) {
                                        cVar2.mo35475e(2, "com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI", activity2);
                                        break;
                                    }
                            }
                            C98625h.m128225a().mo138056b(2, fh42.f354001d, activity2);
                            String str2 = fh42.f354001d;
                            C22466j jVar2 = C22466j.f63621a;
                            if (C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str2) || C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5", str2) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str2) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str2)) {
                                C21787e eVar3 = C22466j.f63629i;
                                eVar3.getClass();
                                Log.m105924i("HABBYGE-MALI.FragmentFeedStatistics", "stop: free...");
                                C22353o oVar = eVar3.f61744a;
                                if (oVar != null) {
                                    ((C22326f) oVar).mo35472b();
                                }
                                eVar3.f61744a = null;
                                C22353o oVar2 = eVar3.f61745b;
                                if (oVar2 != null) {
                                    ((C22329g) oVar2).mo35472b();
                                }
                                eVar3.f61745b = null;
                                C22353o oVar3 = eVar3.f61746c;
                                if (oVar3 != null) {
                                    ((C22338j) oVar3).mo35472b();
                                }
                                eVar3.f61746c = null;
                            }
                        } else {
                            String canonicalName2 = activity2.getClass().getCanonicalName();
                            int hashCode2 = activity2.hashCode();
                            C117394e.m165538d(canonicalName2, (String) null, 108);
                            C21062c.m23249d().mo32777h(canonicalName2, hashCode2, C21060a.DESTROY);
                        }
                        Iterator it4 = ((CopyOnWriteArrayList) bVar2.f59969a).iterator();
                        while (it4.hasNext()) {
                            ((C20928j.C20932d) it4.next()).mo32660v(activity2);
                        }
                    }
                }
            }
        } else if (i == 6 && (cVar3 = this.f59538b) != null) {
            ((C21203d.C21204a) cVar3).mo33183b(obj);
        }
    }

    /* renamed from: b */
    public void mo32749b(Object obj) {
        C21045c cVar;
        if ((obj instanceof Activity) && (cVar = this.f59538b) != null) {
            Activity activity = (Activity) obj;
            C21203d.C21204a aVar = (C21203d.C21204a) cVar;
            aVar.getClass();
            Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, finish: %s, %d", activity.getClass().getName(), Integer.valueOf(activity.hashCode()));
            if (C21203d.this.f59975a != null && C86868b.m107886a(activity)) {
                C21200b bVar = (C21200b) C21203d.this.f59975a;
                if (bVar.f59972d) {
                    bVar.f59971c.getClass();
                    fh4 fh4 = new fh4();
                    fh4.f354001d = activity.getClass().getCanonicalName();
                    fh4.f354002e = activity.hashCode();
                    long currentTimeMillis = System.currentTimeMillis();
                    fh4.f354003f = currentTimeMillis;
                    C22466j.m26185b(activity, currentTimeMillis);
                    C64208c.f181939F = fh4.f354001d;
                    C20813c.m22810a().mo32508c(101, fh4);
                    C23462b.m28021f().mo36917a(activity, 2);
                    C22217a.m25719a(activity.getClass().getCanonicalName(), Integer.valueOf(activity.hashCode()), 1);
                } else {
                    C117877b<String, Integer> b = C21200b.m23662b(activity);
                    if (b != null) {
                        String str = (String) b.mo182596a(0);
                        ((Integer) b.mo182596a(1)).intValue();
                        if (!TextUtils.isEmpty(str)) {
                            C117394e.m165538d(str, (String) null, 102);
                            bVar.mo33176d(str, true);
                        }
                    }
                }
                Iterator it = ((CopyOnWriteArrayList) bVar.f59969a).iterator();
                while (it.hasNext()) {
                    ((C20928j.C20932d) it.next()).mo32655p(activity);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo32750c(Object obj, int i) {
        C117129d dVar;
        if (obj instanceof Fragment) {
            if (i == 7) {
                C117129d dVar2 = this.f59537a;
                if (dVar2 != null) {
                    dVar2.mo180798g(obj);
                }
            } else if (i == 8) {
                C117129d dVar3 = this.f59537a;
                if (dVar3 != null) {
                    dVar3.mo180792a(obj);
                }
            } else if (i == 9) {
                C117129d dVar4 = this.f59537a;
                if (dVar4 != null) {
                    dVar4.mo180793b(obj);
                }
            } else if (i == 12) {
                C117129d dVar5 = this.f59537a;
                if (dVar5 != null) {
                    dVar5.mo180796e(obj);
                }
            } else if (i == 13 && (dVar = this.f59537a) != null) {
                dVar.mo180794c(obj);
            }
        }
    }

    /* renamed from: d */
    public Object mo32751d(String str, String str2, String str3, String str4, String str5, String str6, Object obj, Object[] objArr) {
        C117293c cVar;
        Map<String, C21154e> map = C117292a.f351156a;
        StringBuilder sb = new StringBuilder();
        String str7 = str4;
        sb.append(str4);
        sb.append("__HOOK__|");
        String str8 = str5;
        sb.append(str5);
        sb.append("|");
        sb.append(str6);
        C21154e eVar = (C21154e) ((ConcurrentHashMap) C117292a.f351156a).get(sb.toString());
        if (eVar == null || (cVar = eVar.f59801c) == null) {
            return null;
        }
        return cVar.mo109570a(str, str2, str3, str5, str6, obj, objArr);
    }

    /* renamed from: e */
    public void mo32752e(String str, String str2, String str3, String str4, String str5, String str6, Object obj, Object[] objArr) {
        List<C21152b> list;
        List<C21153d> list2;
        String str7 = str4;
        String str8 = str5;
        String str9 = str6;
        if (str2 == null && str3 == null) {
            Map<String, C21154e> map = C117292a.f351156a;
            C21154e eVar = (C21154e) ((ConcurrentHashMap) C117292a.f351156a).get(str4 + "|" + str8 + "|" + str9);
            if (eVar != null && (list2 = eVar.f59799a) != null && !((CopyOnWriteArrayList) list2).isEmpty()) {
                Iterator it = ((CopyOnWriteArrayList) eVar.f59799a).iterator();
                while (it.hasNext()) {
                    C21153d dVar = (C21153d) it.next();
                    if (dVar != null) {
                        dVar.mo32410b(str, str5, str6, obj, objArr);
                    }
                }
                return;
            }
            return;
        }
        Map<String, C21154e> map2 = C117292a.f351156a;
        C21154e eVar2 = (C21154e) ((ConcurrentHashMap) C117292a.f351156a).get(str4 + "|" + str8 + "|" + str9);
        if (eVar2 != null && (list = eVar2.f59800b) != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it4 = ((CopyOnWriteArrayList) eVar2.f59800b).iterator();
            while (it4.hasNext()) {
                C21152b bVar = (C21152b) it4.next();
                if (bVar != null) {
                    bVar.mo33108a(str, str2, str3, str5, str6, obj, objArr);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo32753f(String str, String str2, String str3, String str4, String str5, String str6, Object obj, Object obj2) {
        List<C21152b> list;
        List<C21153d> list2;
        String str7 = str4;
        String str8 = str5;
        String str9 = str6;
        if (str2 == null && str3 == null) {
            Map<String, C21154e> map = C117292a.f351156a;
            C21154e eVar = (C21154e) ((ConcurrentHashMap) C117292a.f351156a).get(str4 + "|" + str8 + "|" + str9);
            if (eVar != null && (list2 = eVar.f59799a) != null && !((CopyOnWriteArrayList) list2).isEmpty()) {
                Iterator it = ((CopyOnWriteArrayList) eVar.f59799a).iterator();
                while (it.hasNext()) {
                    C21153d dVar = (C21153d) it.next();
                    if (dVar != null) {
                        dVar.mo32409a(str, str5, str6, obj, obj2);
                    }
                }
                return;
            }
            return;
        }
        Map<String, C21154e> map2 = C117292a.f351156a;
        C21154e eVar2 = (C21154e) ((ConcurrentHashMap) C117292a.f351156a).get(str4 + "|" + str8 + "|" + str9);
        if (eVar2 != null && (list = eVar2.f59800b) != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it4 = ((CopyOnWriteArrayList) eVar2.f59800b).iterator();
            while (it4.hasNext()) {
                C21152b bVar = (C21152b) it4.next();
                if (bVar != null) {
                    bVar.mo33109b(str, str2, str3, str5, str6, obj, obj2);
                }
            }
        }
    }

    /* renamed from: g */
    public void mo32754g(Object obj, Intent intent) {
        C21045c cVar;
        if (C21044b.m23215a(obj) && (cVar = this.f59538b) != null) {
            C21203d.C21204a aVar = (C21203d.C21204a) cVar;
            aVar.getClass();
            Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivity: %s, %d", obj.getClass().getName(), Integer.valueOf(obj.hashCode()));
            C21207e eVar = C21203d.this.f59975a;
            if (eVar == null) {
                return;
            }
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (C86868b.m107886a(activity)) {
                    ((C21200b) C21203d.this.f59975a).mo33175a(activity, intent);
                    return;
                }
                return;
            }
            ((C21200b) eVar).mo33175a((Activity) null, intent);
        }
    }

    /* renamed from: i */
    public void mo32755i(List<Pair<String, String>> list, C21152b bVar) {
        Map<String, C21154e> map = C117292a.f351156a;
        if (list != null && !list.isEmpty() && bVar != null) {
            for (Pair next : list) {
                String str = "Undefined|" + ((String) next.first) + "|" + ((String) next.second);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                if (concurrentHashMap.containsKey(str)) {
                    C21154e eVar = (C21154e) concurrentHashMap.get(str);
                    if (eVar == null) {
                        eVar = new C21154e();
                    }
                    if (!((CopyOnWriteArrayList) eVar.f59800b).contains(bVar)) {
                        ((CopyOnWriteArrayList) eVar.f59800b).add(bVar);
                        concurrentHashMap.put(str, eVar);
                    }
                } else {
                    C21154e eVar2 = new C21154e();
                    ((CopyOnWriteArrayList) eVar2.f59800b).add(bVar);
                    concurrentHashMap.put(str, eVar2);
                }
            }
        }
    }

    /* renamed from: j */
    public void mo32756j(Map<String, List<Pair<String, String>>> map, C21152b bVar) {
        Map<String, C21154e> map2 = C117292a.f351156a;
        if (map != null && !map.isEmpty() && bVar != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                List<Pair> list = (List) next.getValue();
                if (list != null) {
                    for (Pair pair : list) {
                        String str2 = str + "_EXEC_|" + ((String) pair.first) + "|" + ((String) pair.second);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                        if (concurrentHashMap.containsKey(str2)) {
                            C21154e eVar = (C21154e) concurrentHashMap.get(str2);
                            if (eVar == null) {
                                eVar = new C21154e();
                            }
                            if (!((CopyOnWriteArrayList) eVar.f59800b).contains(bVar)) {
                                ((CopyOnWriteArrayList) eVar.f59800b).add(bVar);
                                concurrentHashMap.put(str2, eVar);
                            }
                        } else {
                            C21154e eVar2 = new C21154e();
                            ((CopyOnWriteArrayList) eVar2.f59800b).add(bVar);
                            concurrentHashMap.put(str2, eVar2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public void mo32757k(Map<String, List<Pair<String, String>>> map, C117293c cVar) {
        Map<String, C21154e> map2 = C117292a.f351156a;
        if (map == null || map.isEmpty() || cVar == null) {
            throw new NullPointerException("HABBYGE-MALI.hellhound, registerHookCallback, exception:register arguments mayby is null !");
        }
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            List<Pair> list = (List) next.getValue();
            if (list != null) {
                for (Pair pair : list) {
                    C21154e eVar = new C21154e();
                    eVar.f59801c = cVar;
                    ((ConcurrentHashMap) C117292a.f351156a).put(str + "__HOOK__|" + ((String) pair.first) + "|" + ((String) pair.second), eVar);
                }
            }
        }
    }

    /* renamed from: l */
    public void mo32758l(Map<String, List<Pair<String, String>>> map, C21153d dVar) {
        Map<String, C21154e> map2 = C117292a.f351156a;
        if (map != null && !map.isEmpty() && dVar != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                List<Pair> list = (List) next.getValue();
                if (list != null) {
                    for (Pair pair : list) {
                        String str2 = str + "|" + ((String) pair.first) + "|" + ((String) pair.second);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                        if (concurrentHashMap.containsKey(str2)) {
                            C21154e eVar = (C21154e) concurrentHashMap.get(str2);
                            if (eVar == null) {
                                eVar = new C21154e();
                            }
                            if (!((CopyOnWriteArrayList) eVar.f59799a).contains(dVar)) {
                                ((CopyOnWriteArrayList) eVar.f59799a).add(dVar);
                                concurrentHashMap.put(str2, eVar);
                            }
                        } else {
                            C21154e eVar2 = new C21154e();
                            ((CopyOnWriteArrayList) eVar2.f59799a).add(dVar);
                            concurrentHashMap.put(str2, eVar2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public void mo32759m(Map<String, Pair<String, List<Pair<String, String>>>> map, C21153d dVar) {
        Map<String, C21154e> map2 = C117292a.f351156a;
        if (map != null && !map.isEmpty() && dVar != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Pair pair = (Pair) next.getValue();
                if (pair != null) {
                    for (Pair pair2 : (List) pair.second) {
                        String str2 = str + ((String) pair.first) + "|" + ((String) pair2.first) + "|" + ((String) pair2.second);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                        if (concurrentHashMap.containsKey(str2)) {
                            C21154e eVar = (C21154e) concurrentHashMap.get(str2);
                            if (eVar == null) {
                                eVar = new C21154e();
                            }
                            if (!((CopyOnWriteArrayList) eVar.f59799a).contains(dVar)) {
                                ((CopyOnWriteArrayList) eVar.f59799a).add(dVar);
                                concurrentHashMap.put(str2, eVar);
                            }
                        } else {
                            C21154e eVar2 = new C21154e();
                            ((CopyOnWriteArrayList) eVar2.f59799a).add(dVar);
                            concurrentHashMap.put(str2, eVar2);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public void mo32760n(Map<String, Map<String, List<Pair<String, String>>>> map, C21153d dVar) {
        Map<String, C21154e> map2 = C117292a.f351156a;
        if (map != null && !map.isEmpty() && dVar != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Map map3 = (Map) next.getValue();
                if (map3 != null) {
                    for (Map.Entry entry : map3.entrySet()) {
                        String str2 = (String) entry.getKey();
                        for (Pair pair : (List) entry.getValue()) {
                            String str3 = str + str2 + "|" + ((String) pair.first) + "|" + ((String) pair.second);
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                            if (concurrentHashMap.containsKey(str3)) {
                                C21154e eVar = (C21154e) concurrentHashMap.get(str3);
                                if (eVar == null) {
                                    eVar = new C21154e();
                                }
                                if (!((CopyOnWriteArrayList) eVar.f59799a).contains(dVar)) {
                                    ((CopyOnWriteArrayList) eVar.f59799a).add(dVar);
                                    concurrentHashMap.put(str3, eVar);
                                }
                            } else {
                                C21154e eVar2 = new C21154e();
                                ((CopyOnWriteArrayList) eVar2.f59799a).add(dVar);
                                concurrentHashMap.put(str3, eVar2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void mo32761o(List<Pair<String, String>> list, C21152b bVar) {
        List<C21152b> list2;
        Map<String, C21154e> map = C117292a.f351156a;
        if (list != null && !list.isEmpty() && bVar != null) {
            for (Pair next : list) {
                String str = "Undefined|" + ((String) next.first) + "|" + ((String) next.second);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                C21154e eVar = (C21154e) concurrentHashMap.get(str);
                if (eVar != null && (list2 = eVar.f59800b) != null && !((CopyOnWriteArrayList) list2).isEmpty() && ((CopyOnWriteArrayList) eVar.f59800b).contains(bVar)) {
                    ((CopyOnWriteArrayList) eVar.f59800b).remove(bVar);
                    if (((CopyOnWriteArrayList) eVar.f59800b).isEmpty() && ((CopyOnWriteArrayList) eVar.f59799a).isEmpty()) {
                        concurrentHashMap.remove(str);
                    }
                }
            }
        }
    }

    /* renamed from: p */
    public void mo32762p(Map<String, List<Pair<String, String>>> map, C21153d dVar) {
        List<C21153d> list;
        Map<String, C21154e> map2 = C117292a.f351156a;
        if (map != null && dVar != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                List<Pair> list2 = (List) next.getValue();
                if (list2 != null) {
                    for (Pair pair : list2) {
                        String str2 = str + "|" + ((String) pair.first) + "|" + ((String) pair.second);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                        C21154e eVar = (C21154e) concurrentHashMap.get(str2);
                        if (eVar != null && (list = eVar.f59799a) != null && !((CopyOnWriteArrayList) list).isEmpty() && ((CopyOnWriteArrayList) eVar.f59799a).contains(dVar)) {
                            ((CopyOnWriteArrayList) eVar.f59799a).remove(dVar);
                            if (((CopyOnWriteArrayList) eVar.f59799a).isEmpty() && ((CopyOnWriteArrayList) eVar.f59800b).isEmpty()) {
                                concurrentHashMap.remove(str2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    public void mo32763q(Map<String, Pair<String, List<Pair<String, String>>>> map, C21153d dVar) {
        List<C21153d> list;
        Map<String, C21154e> map2 = C117292a.f351156a;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Pair pair = (Pair) next.getValue();
                if (pair != null) {
                    for (Pair pair2 : (List) pair.second) {
                        String str2 = str + ((String) pair.first) + "|" + ((String) pair2.first) + "|" + ((String) pair2.second);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                        C21154e eVar = (C21154e) concurrentHashMap.get(str2);
                        if (eVar != null && (list = eVar.f59799a) != null && !((CopyOnWriteArrayList) list).isEmpty() && ((CopyOnWriteArrayList) eVar.f59799a).contains(dVar)) {
                            ((CopyOnWriteArrayList) eVar.f59799a).remove(dVar);
                            if (((CopyOnWriteArrayList) eVar.f59799a).isEmpty() && ((CopyOnWriteArrayList) eVar.f59800b).isEmpty()) {
                                concurrentHashMap.remove(str2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: r */
    public void mo32764r(Map<String, Map<String, List<Pair<String, String>>>> map, C21153d dVar) {
        List<C21153d> list;
        Map<String, C21154e> map2 = C117292a.f351156a;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Map map3 = (Map) next.getValue();
                if (map3 != null) {
                    for (Map.Entry entry : map3.entrySet()) {
                        String str2 = (String) entry.getKey();
                        for (Pair pair : (List) entry.getValue()) {
                            String str3 = str + str2 + "|" + ((String) pair.first) + "|" + ((String) pair.second);
                            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C117292a.f351156a;
                            C21154e eVar = (C21154e) concurrentHashMap.get(str3);
                            if (eVar != null && (list = eVar.f59799a) != null && !((CopyOnWriteArrayList) list).isEmpty() && ((CopyOnWriteArrayList) eVar.f59799a).contains(dVar)) {
                                ((CopyOnWriteArrayList) eVar.f59799a).remove(dVar);
                                if (((CopyOnWriteArrayList) eVar.f59799a).isEmpty() && ((CopyOnWriteArrayList) eVar.f59800b).isEmpty()) {
                                    concurrentHashMap.remove(str3);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
