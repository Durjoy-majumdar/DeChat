package com.tencent.p014mm.plugin.gallery.model;

import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.SparseArray;
import c30.C104289g;
import c30.C26827e;
import com.tencent.p014mm.plugin.gallery.model.C93951d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import h81.C32735h;
import hw1.C87599j;
import hw1.C98550k;
import hw1.C98554s;
import hw1.g$$a;
import hw1.g$$b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p823sg.C101611g;
import q90.C101062d;
import qw1.C101316l;
import zt3.C119143b;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.gallery.model.f */
public final class C93958f {

    /* renamed from: m */
    public static boolean f271149m;

    /* renamed from: n */
    public static boolean f271150n;

    /* renamed from: o */
    public static boolean f271151o;

    /* renamed from: p */
    public static boolean f271152p;

    /* renamed from: q */
    public static volatile C93958f f271153q;

    /* renamed from: r */
    public static int f271154r;

    /* renamed from: a */
    public C93970n f271155a;

    /* renamed from: b */
    public C93947c f271156b;

    /* renamed from: c */
    public C93963i f271157c;

    /* renamed from: d */
    public ArrayList<GalleryItem$MediaItem> f271158d = null;

    /* renamed from: e */
    public LinkedHashSet<GalleryItem$MediaItem> f271159e = new LinkedHashSet<>();

    /* renamed from: f */
    public HashSet<GalleryItem$MediaItem> f271160f = new HashSet<>();

    /* renamed from: g */
    public ArrayList<Bundle> f271161g = new ArrayList<>();

    /* renamed from: h */
    public HashMap<Integer, Boolean> f271162h = new HashMap<>();

    /* renamed from: i */
    public final Map<String, String> f271163i = new HashMap();

    /* renamed from: j */
    public final Map<String, Integer> f271164j = new HashMap();

    /* renamed from: k */
    public final List<String> f271165k = new ArrayList();

    /* renamed from: l */
    public SparseArray<C98550k> f271166l = new SparseArray<>();

    public C93958f() {
        if (this.f271155a == null) {
            this.f271155a = new C93970n();
        }
        if (this.f271157c == null) {
            this.f271157c = new C93963i();
        }
        if (this.f271156b == null) {
            this.f271156b = new C93947c();
        }
        String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_album_local_name, "");
        Log.m105925i("MicroMsg.GalleryCore", "localAlbumName: %s.", Y60);
        try {
            C26827e l = new C104289g(Y60).optJSONArray("localAlbumName");
            for (int i = 0; i < l.length(); i++) {
                C104289g p = l.optJSONObject(i);
                C98550k kVar = new C98550k();
                kVar.f289002a = p.optString("key");
                kVar.f289003b = p.optString("path");
                kVar.f289004c = p.optString("default");
                kVar.f289005d = C101316l.m132903b(kVar.f289003b);
                Log.m105919d("MicroMsg.GalleryCore", "albumName info: %s.", kVar);
                this.f271166l.put(kVar.f289005d, kVar);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m118741a(String str, String str2, int i) {
        ((HashMap) m118749i().f271164j).put(str2, Integer.valueOf(i));
        ((HashMap) m118749i().f271164j).put(str, Integer.valueOf(i));
        ((ArrayList) m118749i().f271165k).add(str2);
        Iterator it = ((HashMap) m118749i().f271163i).keySet().iterator();
        String str3 = null;
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str4 = (String) it.next();
            if (str4 != null) {
                str3 = (String) ((HashMap) m118749i().f271163i).get(str4);
                z = str.equals(str4) || (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && str3.equals(str2));
                if (z) {
                    ((HashMap) m118749i().f271163i).put(str4, str2);
                    Log.m105925i("MicroMsg.GalleryCore", "alreadyFind, key = %s, editPath = %s, rawPath = %s", str4, str2, str);
                    break;
                }
            }
        }
        if (z) {
            return str3;
        }
        ((HashMap) m118749i().f271163i).put(str, str2);
        Log.m105925i("MicroMsg.GalleryCore", "rawPath = %s start to do edit, editPath = %s", str, str2);
        return null;
    }

    /* renamed from: b */
    public static boolean m118742b() {
        int i = f271154r;
        if (i > 0) {
            f271154r = i - 1;
        }
        Log.m105925i("MicroMsg.GalleryCore", "pennqin, defGallery %d.", Integer.valueOf(f271154r));
        if (f271154r != 0) {
            return false;
        }
        if (!(f271153q == null || f271153q.f271157c == null || f271153q.f271156b == null)) {
            if (f271154r != 0) {
                Log.m105928w("MicroMsg.GalleryCore", "oh, ref count not right!!! Maybe because quick enter/back.");
            } else {
                if (m118749i().f271156b != null) {
                    C98554s sVar = C98554s.f289007d;
                    sVar.f289008a.clear();
                    sVar.f289009b.clear();
                    m118747g().mo128874b();
                    f271153q.f271156b.mo128878f((C93951d.C93956e) null);
                    C93951d dVar = f271153q.f271156b.f271113a;
                    C101611g<String, C93951d.C93955d> gVar = dVar.f271141a;
                    if (gVar != null) {
                        ((C101062d) gVar).mo122812a(new C93957e(dVar));
                        dVar.f271141a = null;
                    }
                    synchronized (dVar.f271146f) {
                        C87599j jVar = dVar.f271142b;
                        if (jVar != null) {
                            jVar.mo122056i();
                            jVar.mo122049b();
                            MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0).edit().putInt("com.tencent.mm.gallery.cache.suffix", jVar.f253694e).apply();
                            dVar.f271142b = null;
                        }
                    }
                    f271153q.f271156b = null;
                }
                f271153q.f271155a = null;
                if (f271153q.f271157c != null) {
                    C93963i iVar = f271153q.f271157c;
                    if (iVar.f271180d == null && iVar.f271178b != null) {
                        iVar.f271180d = new MMHandler(iVar.f271178b.getLooper());
                    }
                    MMHandler mMHandler = iVar.f271180d;
                    if (mMHandler != null) {
                        mMHandler.removeCallbacksAndMessages((Object) null);
                    } else {
                        Log.m105928w("MicroMsg.GalleryHandlerThread", "assistHandler is null.");
                    }
                    f271153q.f271157c.mo128893a().removeCallbacksAndMessages((Object) null);
                    C93963i iVar2 = f271153q.f271157c;
                    if (iVar2.f271186j == null && iVar2.f271185i != null) {
                        iVar2.f271186j = new MMHandler(iVar2.f271185i.getLooper());
                    }
                    MMHandler mMHandler2 = iVar2.f271186j;
                    if (mMHandler2 != null) {
                        mMHandler2.removeCallbacksAndMessages((Object) null);
                    } else {
                        Log.m105928w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
                    }
                    C93963i iVar3 = f271153q.f271157c;
                    if (iVar3.f271179c == null && iVar3.f271177a != null) {
                        iVar3.f271179c = new MMHandler(iVar3.f271177a.getLooper());
                    }
                    MMHandler mMHandler3 = iVar3.f271179c;
                    if (mMHandler3 != null) {
                        mMHandler3.removeCallbacksAndMessages((Object) null);
                    } else {
                        Log.m105928w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
                    }
                    C93963i iVar4 = f271153q.f271157c;
                    HandlerThread handlerThread = iVar4.f271178b;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        iVar4.f271178b = null;
                    }
                    iVar4.f271180d = null;
                    iVar4.f271181e = null;
                    ExecutorService executorService = iVar4.f271182f;
                    if (executorService != null) {
                        ((C119143b) executorService).shutdown();
                        iVar4.f271182f = null;
                    }
                    ExecutorService executorService2 = iVar4.f271183g;
                    if (executorService2 != null) {
                        ((C119143b) executorService2).shutdown();
                        iVar4.f271183g = null;
                    }
                    ExecutorService executorService3 = iVar4.f271184h;
                    if (executorService3 != null) {
                        ((C119143b) executorService3).shutdown();
                        iVar4.f271184h = null;
                    }
                    HandlerThread handlerThread2 = iVar4.f271185i;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        iVar4.f271185i = null;
                    }
                    iVar4.f271186j = null;
                    HandlerThread handlerThread3 = iVar4.f271177a;
                    if (handlerThread3 != null) {
                        handlerThread3.quit();
                        iVar4.f271177a = null;
                    }
                    iVar4.f271179c = null;
                    f271153q.f271157c = null;
                }
                f271153q = null;
                Log.m105924i("MicroMsg.GalleryCore", "stopServices: finish.");
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m118743c() {
        Map<String, String> map = m118749i().f271163i;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = (HashMap) map;
        for (String str : hashMap.keySet()) {
            String str2 = (String) hashMap.get(str);
            arrayList.add(str2);
            Log.m105924i("MicroMsg.GalleryCore", "[deleteAllEditMedia] origin path = " + str + ", album edit path = " + str2);
        }
        ((HashMap) m118749i().f271163i).clear();
        ((ArrayList) m118749i().f271165k).clear();
        ((HashMap) m118749i().f271164j).clear();
        ((C119157j) C119157j.f356862d).mo183884o(new g$$a(arrayList));
    }

    /* renamed from: d */
    public static void m118744d(ArrayList<String> arrayList) {
        Map<String, String> map = m118749i().f271163i;
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = (HashMap) map;
        for (String str : hashMap.keySet()) {
            String str2 = (String) hashMap.get(str);
            arrayList2.add(str2);
            Log.m105924i("MicroMsg.GalleryCore", "origin path = " + str + ", album edit path = " + str2);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.remove(arrayList.get(i));
        }
        ((HashMap) m118749i().f271163i).clear();
        ((ArrayList) m118749i().f271165k).clear();
        ((C119157j) C119157j.f356862d).mo183884o(new g$$b(arrayList2, !((ArrayList) m118749i().f271165k).isEmpty(), arrayList));
    }

    /* renamed from: e */
    public static GalleryItem$MediaItem m118745e(String str) {
        int indexOf;
        GalleryItem$MediaItem c = GalleryItem$MediaItem.m65488c(0, 0, str, "", "");
        if (m118751k() == null || (indexOf = m118751k().indexOf(c)) < 0) {
            return null;
        }
        return m118751k().get(indexOf);
    }

    /* renamed from: f */
    public static GalleryItem$MediaItem m118746f(String str) {
        if (m118751k() == null) {
            return null;
        }
        Iterator<GalleryItem$MediaItem> it = m118751k().iterator();
        while (it.hasNext()) {
            GalleryItem$MediaItem next = it.next();
            String str2 = next.f162748e;
            if (str2 != null && str2.equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C93947c m118747g() {
        if (m118749i().f271156b == null) {
            m118749i().f271156b = new C93947c();
        }
        return m118749i().f271156b;
    }

    /* renamed from: h */
    public static HashSet<GalleryItem$MediaItem> m118748h() {
        return m118749i().f271160f;
    }

    /* renamed from: i */
    public static C93958f m118749i() {
        if (f271153q == null) {
            f271153q = new C93958f();
        }
        return f271153q;
    }

    /* renamed from: j */
    public static C93970n m118750j() {
        if (m118749i().f271155a == null) {
            m118749i().f271155a = new C93970n();
        }
        return m118749i().f271155a;
    }

    /* renamed from: k */
    public static ArrayList<GalleryItem$MediaItem> m118751k() {
        return m118749i().f271158d;
    }

    /* renamed from: l */
    public static LinkedHashSet<GalleryItem$MediaItem> m118752l() {
        return m118749i().f271159e;
    }

    /* renamed from: m */
    public static C93963i m118753m() {
        if (m118749i().f271157c == null) {
            m118749i().f271157c = new C93963i();
        }
        return m118749i().f271157c;
    }

    /* renamed from: n */
    public static void m118754n() {
        int i = f271154r + 1;
        f271154r = i;
        Log.m105925i("MicroMsg.GalleryCore", "pennqin, refGallery %d.", Integer.valueOf(i));
    }

    /* renamed from: o */
    public static void m118755o(ArrayList<GalleryItem$MediaItem> arrayList) {
        m118749i().f271158d = arrayList;
    }
}
