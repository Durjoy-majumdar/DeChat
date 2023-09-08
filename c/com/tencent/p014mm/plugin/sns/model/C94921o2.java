package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import sf0.C90188n0;
import te3.C101789j00;
import te3.C101804kv2;
import te3.C101817mv2;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.o2 */
public class C94921o2 implements C94896n {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C94923b> f275081a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static ConcurrentHashMap<String, WeakReference<C94923b>> f275082b = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.sns.model.o2$a */
    public class C94922a {

        /* renamed from: a */
        public long f275083a = -1;

        /* renamed from: b */
        public C101817mv2 f275084b;

        /* renamed from: c */
        public String f275085c;

        /* renamed from: d */
        public int f275086d;

        public C94922a(C94921o2 o2Var) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.o2$b */
    public class C94923b {

        /* renamed from: a */
        public long f275087a = -1;

        /* renamed from: b */
        public long f275088b = -1;

        /* renamed from: c */
        public long f275089c = -1;

        /* renamed from: d */
        public int f275090d = 0;

        /* renamed from: e */
        public int f275091e = 0;

        /* renamed from: f */
        public long f275092f = -1;

        /* renamed from: g */
        public long f275093g = 0;

        /* renamed from: h */
        public ArrayList<String> f275094h = new ArrayList<>();

        /* renamed from: i */
        public boolean f275095i = false;

        /* renamed from: j */
        public HashMap<String, C94922a> f275096j = new HashMap<>();

        public C94923b(C94921o2 o2Var) {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ ConcurrentHashMap m120481a() {
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        ConcurrentHashMap<String, C94923b> concurrentHashMap = f275081a;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        return concurrentHashMap;
    }

    /* renamed from: b */
    public static C94923b m120482b(String str) {
        C94923b bVar;
        SnsMethodCalculate.markStartTimeMs("getMediaToInfo", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        WeakReference weakReference = f275082b.get(str);
        if (weakReference == null || (bVar = (C94923b) weakReference.get()) == null) {
            SnsMethodCalculate.markEndTimeMs("getMediaToInfo", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
            return null;
        }
        SnsMethodCalculate.markEndTimeMs("getMediaToInfo", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        return bVar;
    }

    /* renamed from: e */
    public static void m120483e(String str, int i) {
        C94923b bVar;
        HashMap<String, C94922a> hashMap;
        C94922a aVar;
        SnsMethodCalculate.markStartTimeMs("recordEndLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        if (C90188n0.f258912F) {
            Log.m105919d("MicroMsg.TimelineSmallPicStat", "recordEndLoadSmallPic, mediaId:%s", str);
        }
        WeakReference weakReference = f275082b.get(str);
        if (weakReference == null || (bVar = (C94923b) weakReference.get()) == null) {
            SnsMethodCalculate.markEndTimeMs("recordEndLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
            return;
        }
        if (bVar.f275088b == -1 && (hashMap = bVar.f275096j) != null && hashMap.containsKey(str) && (aVar = hashMap.get(str)) != null && aVar.f275083a == -1) {
            aVar.f275083a = 1;
            aVar.f275086d = i;
            bVar.f275091e++;
        }
        SnsMethodCalculate.markEndTimeMs("recordEndLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
    }

    /* renamed from: f */
    public static void m120484f(String str) {
        SnsMethodCalculate.markStartTimeMs("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        if (C90188n0.f258912F) {
            Log.m105919d("MicroMsg.TimelineSmallPicStat", "recordStartLoadSmallPic, mediaId:%s", str);
        }
        C94923b b = m120482b(str);
        if (b != null) {
            b.f275095i = true;
        }
        SnsMethodCalculate.markEndTimeMs("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
    }

    /* renamed from: c */
    public void mo131181c(int i, String str, TimeLineObject timeLineObject) {
        C101789j00 j002;
        LinkedList<C101804kv2> linkedList;
        SnsMethodCalculate.markStartTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        if (!f275081a.containsKey(str)) {
            if (C90188n0.f258912F) {
                Log.m105919d("MicroMsg.TimelineSmallPicStat", "put localId:%s into reportData", str);
            }
            if (timeLineObject != null && (j002 = timeLineObject.ContentObj) != null && j002.f298424e == 1 && (linkedList = j002.f298427h) != null && linkedList.size() > 0) {
                C94923b bVar = new C94923b(this);
                bVar.f275090d = timeLineObject.ContentObj.f298427h.size();
                bVar.f275091e = 0;
                bVar.f275092f = C102236a0.m134706B0(timeLineObject.f283893Id);
                bVar.f275096j = new HashMap<>();
                Iterator<C101804kv2> it = timeLineObject.ContentObj.f298427h.iterator();
                while (it.hasNext()) {
                    C101804kv2 next = it.next();
                    C94922a aVar = new C94922a(this);
                    String str2 = next.f298689d;
                    aVar.f275084b = next.f298698p;
                    String e = C94938q1.m120518e(C94866e1.m120262YO(), next.f298689d);
                    String X = C102236a0.m134729X(next);
                    aVar.f275085c = e + X;
                    bVar.f275094h.add(next.f298689d);
                    bVar.f275096j.put(next.f298689d, aVar);
                    f275082b.put(next.f298689d, new WeakReference(bVar));
                }
                bVar.f275087a = System.currentTimeMillis();
                f275081a.put(str, bVar);
            } else if (C90188n0.f258912F) {
                Log.m105918d("MicroMsg.TimelineSmallPicStat", "onItemAdd error, timelineObject is nulli");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onItemAdd", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
    }

    /* renamed from: d */
    public void mo131182d(int i, String str, TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
        if (f275081a.containsKey(str)) {
            if (C90188n0.f258912F) {
                Log.m105919d("MicroMsg.TimelineSmallPicStat", "load finish localId:%s", str);
            }
            C94923b bVar = f275081a.get(str);
            if (!(bVar == null || bVar.f275087a == -1 || bVar.f275088b != -1)) {
                bVar.f275089c = System.currentTimeMillis() - bVar.f275087a;
                if (bVar.f275091e == bVar.f275090d) {
                    bVar.f275088b = 1;
                } else {
                    bVar.f275088b = 2;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onItemRemove", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
    }
}
