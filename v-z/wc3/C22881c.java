package wc3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.wechat.p326mm.biz.BizCgiCardProto;
import com.tencent.wechat.p326mm.biz.BizManager;
import com.tencent.wechat.p326mm.biz.BizProto;
import di3.C86312j;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32224a;
import gw0.C76073b;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hc0.C20937c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import jw0.C21289b;
import nf3.C34828c;
import p1035sf.C90183c;
import p227rn.C22240c0;
import p243tn.C14050a;
import p248ug.C102027b;
import rb0.C48009v0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s90.C77627f;
import s90.C77630j;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C64197v;
import te3.C22521pi1;
import wd3.C22908r;
import zt3.C119157j;

/* renamed from: wc3.c */
public final class C22881c {

    /* renamed from: a */
    public static final C22881c f65777a = new C22881c();

    /* renamed from: b */
    public static boolean f65778b;

    /* renamed from: c */
    public static final C13601g f65779c = C36568h.m40985a(C22887b.f65789d);

    /* renamed from: d */
    public static final C13601g f65780d = C36568h.m40985a(C22886e.f65788d);

    /* renamed from: e */
    public static final C13601g f65781e = C36568h.m40985a(C22884a.f65786d);

    /* renamed from: f */
    public static final C13601g f65782f = C36568h.m40985a(C22883f.f65785d);

    /* renamed from: g */
    public static final C13601g f65783g = C36568h.m40985a(C22885c.f65787d);

    /* renamed from: wc3.c$d */
    public static final class C22882d implements Runnable {

        /* renamed from: d */
        public static final C22882d f65784d = new C22882d();

        public final void run() {
            Class cls = C22240c0.class;
            C22881c cVar = C22881c.f65777a;
            int i = cVar.mo36059d().getInt("biz_time_line_need_preload_top_num", 4);
            Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy preloadTopNum %d", Integer.valueOf(i));
            cVar.mo36057b();
            if (((C22240c0) C86312j.m106911c(cls)).mo35407eG()) {
                ((C22240c0) C86312j.m106911c(cls)).mo35406dK();
                BizProto.BizMsgInfoList topNData = BizManager.getInstance().getTopNData(i);
                C87412m.m108593f(topNData, "getInstance().getTopNData(preloadNum)");
                ArrayList arrayList = new ArrayList();
                List<BizProto.BizMsgInfo> msgListList = topNData.getMsgListList();
                C87412m.m108593f(msgListList, "infoList.msgListList");
                for (BizProto.BizMsgInfo bizMsgInfo : msgListList) {
                    C87412m.m108593f(bizMsgInfo, "info");
                    if (C21289b.m23812f(bizMsgInfo)) {
                        List<BizProto.BizMsgItem> itemsList = bizMsgInfo.getContent().getItemsList();
                        C87412m.m108593f(itemsList, "info.content.itemsList");
                        int i2 = 0;
                        for (T next : C110818d0.m150947s0(itemsList, 2)) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                BizProto.BizMsgItem bizMsgItem = (BizProto.BizMsgItem) next;
                                if (i2 == 0) {
                                    arrayList.add(bizMsgItem.getCover());
                                    arrayList.add(bizMsgItem.getCover11());
                                } else {
                                    arrayList.add(!C90183c.m112859g(bizMsgItem.getCover11()) ? bizMsgItem.getCover11() : bizMsgItem.getCover());
                                }
                                i2 = i3;
                            } else {
                                C64197v.m75542k();
                                throw null;
                            }
                        }
                        continue;
                    } else if (C21289b.m23813g(bizMsgInfo)) {
                        BizCgiCardProto.BizRecommendArticle bizAccountRecommend = bizMsgInfo.getContent().getViewMsgCard().getNativeRecCardInfo().getCardInfo().getBizAccountRecommend();
                        if (bizAccountRecommend.getStyle() == 104) {
                            List<BizCgiCardProto.FinderRecommendData> finderFeedsList = bizAccountRecommend.getNativeFinderFeeds().getFinderFeedsList();
                            C87412m.m108593f(finderFeedsList, "nativeFinderFeedsList");
                            List<T> s0 = C110818d0.m150947s0(finderFeedsList, 4);
                            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(s0, 10));
                            for (T coverImgUrl : s0) {
                                arrayList2.add(coverImgUrl.getCoverImgUrl());
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
                ArrayList<String> arrayList3 = new ArrayList<>();
                for (Object next2 : arrayList) {
                    if (!Util.isNullOrNil((String) next2)) {
                        arrayList3.add(next2);
                    }
                }
                for (String addLast : arrayList3) {
                    C22881c.f65777a.mo36058c().addLast(addLast);
                }
            } else {
                List<C19623o0> bF = C48009v0.Jx0().mo25798bF(i);
                ArrayList arrayList4 = new ArrayList();
                for (C19623o0 o0Var : bF) {
                    ArrayList arrayList5 = new ArrayList();
                    if (o0Var.mo25754B2()) {
                        C77627f JZ = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(o0Var.field_msgId, o0Var.field_content);
                        List<C77630j> list = JZ.f226295i;
                        C87412m.m108593f(list, "reader.items");
                        if (!o0Var.field_isExpand) {
                            list = C110818d0.m150947s0(list, 2);
                        }
                        int i4 = 0;
                        for (C77630j jVar : list) {
                            int i5 = i4 + 1;
                            if (i4 != 0) {
                                arrayList5.add(!C90183c.m112859g(jVar.f226312D) ? jVar.f226312D : jVar.f226330i);
                            } else if (((C45696d) C86709a0.m107533q(C45696d.class)).mo70970Q2(o0Var, JZ.f226295i.getFirst(), 1)) {
                                arrayList5.add(jVar.f226330i);
                            } else {
                                arrayList5.add(jVar.f226312D);
                            }
                            i4 = i5;
                        }
                    } else if (o0Var.mo25758F2() && o0Var.mo25774x2() != null && o0Var.mo25774x2().f64521j == 104) {
                        LinkedList<C22521pi1> linkedList = o0Var.mo25774x2().f64529u.f186439e;
                        C87412m.m108593f(linkedList, "it.tlRecCardWrapper.nativeFinderFeeds.finder_feeds");
                        for (T t : C110818d0.m150947s0(linkedList, 4)) {
                            arrayList5.add(t.f64434q);
                        }
                    }
                    C64175a0.m75508p(arrayList4, arrayList5);
                }
                ArrayList<String> arrayList6 = new ArrayList<>();
                for (Object next3 : arrayList4) {
                    if (!Util.isNullOrNil((String) next3)) {
                        arrayList6.add(next3);
                    }
                }
                for (String addLast2 : arrayList6) {
                    C22881c.f65777a.mo36058c().addLast(addLast2);
                }
            }
            C22881c cVar2 = C22881c.f65777a;
            cVar2.mo36059d().putLong("biz_time_line_need_last_load_time", System.currentTimeMillis());
            C22881c.m26865a(cVar2);
        }
    }

    /* renamed from: wc3.c$f */
    public static final class C22883f extends C87413o implements C32224a<MTimerHandler> {

        /* renamed from: d */
        public static final C22883f f65785d = new C22883f();

        public C22883f() {
            super(0);
        }

        public Object invoke() {
            return new MTimerHandler(C22893e.f65797d, false);
        }
    }

    /* renamed from: wc3.c$a */
    public static final class C22884a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C22884a f65786d = new C22884a();

        public C22884a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C34828c()) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: wc3.c$c */
    public static final class C22885c extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C22885c f65787d = new C22885c();

        public C22885c() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getSingleMMKV("brandService");
        }
    }

    /* renamed from: wc3.c$e */
    public static final class C22886e extends C87413o implements C32224a<ConcurrentHashMap<Long, Integer>> {

        /* renamed from: d */
        public static final C22886e f65788d = new C22886e();

        public C22886e() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: wc3.c$b */
    public static final class C22887b extends C87413o implements C32224a<ConcurrentLinkedDeque<String>> {

        /* renamed from: d */
        public static final C22887b f65789d = new C22887b();

        public C22887b() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentLinkedDeque();
        }
    }

    /* renamed from: a */
    public static final void m26865a(C22881c cVar) {
        if (C19636w0.f55627d) {
            cVar.mo36058c().clear();
            Log.m105924i("MicroMsg.BizImagePreloadStrategy", "isInTimeLine clear");
            return;
        }
        String pollFirst = cVar.mo36058c().pollFirst();
        Log.m105924i("MicroMsg.BizImagePreloadStrategy", "residue url count = " + cVar.mo36058c().size() + ", current download url = " + pollFirst);
        if (!Util.isNullOrNil(pollFirst)) {
            long currentTimeMillis = System.currentTimeMillis() / ((long) CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            C13601g gVar = f65780d;
            Integer num = (Integer) ((ConcurrentHashMap) ((C36570n) gVar).getValue()).get(Long.valueOf(currentTimeMillis));
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue();
            int i = cVar.mo36059d().getInt("biz_time_line_pic_limit_minute", 60);
            Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy preloadPicLimitInMinute %d", Integer.valueOf(i));
            if (intValue > i) {
                Log.m105925i("MicroMsg.BizImagePreloadStrategy", "download too much in one minute, count:%d", num);
                return;
            }
            long j = cVar.mo36059d().getLong("biz_time_line_pic_download_gap", 200);
            Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy imageDownloadGap %d", Long.valueOf(j));
            String a = C102027b.m134386a(pollFirst, 1, true);
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59346b = true;
            bVar.f59369y = new C22908r(0);
            bVar.f59350f = C14050a.m13405b(a);
            C20937c a2 = bVar.mo32666a();
            ((ConcurrentHashMap) ((C36570n) gVar).getValue()).put(Long.valueOf(currentTimeMillis), Integer.valueOf(num.intValue() + 1));
            MMHandlerThread.postToMainThread(new C22888d(a, a2, j));
        }
    }

    /* renamed from: b */
    public final void mo36057b() {
        mo36058c().clear();
        Log.m105924i("MicroMsg.BizImagePreloadStrategy", "do clearQueue");
    }

    /* renamed from: c */
    public final ConcurrentLinkedDeque<String> mo36058c() {
        return (ConcurrentLinkedDeque) ((C36570n) f65779c).getValue();
    }

    /* renamed from: d */
    public final MultiProcessMMKV mo36059d() {
        return (MultiProcessMMKV) ((C36570n) f65783g).getValue();
    }

    /* renamed from: e */
    public final boolean mo36060e() {
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_biz_time_line_img_preload, 1) == 1;
        Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy isClientSwitchOn: %b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: f */
    public final boolean mo36061f() {
        if (C19636w0.f55627d) {
            return false;
        }
        boolean z = mo36059d().getBoolean("biz_time_line_need_preload", false);
        Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy needPreload %b", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: g */
    public final void mo36062g() {
        if (!C19636w0.f55627d) {
            if (f65778b) {
                try {
                    f65778b = false;
                    ((MTimerHandler) ((C36570n) f65782f).getValue()).startTimer(mo36063h());
                    return;
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.BizImagePreloadStrategy", e.getMessage());
                }
            }
            f65778b = false;
            ((C119157j) C119157j.f356862d).mo183875f(C22882d.f65784d);
        }
    }

    /* renamed from: h */
    public final long mo36063h() {
        long j = mo36059d().getLong("biz_time_line_msg_sync_gap", 500);
        Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy syncGap %d", Long.valueOf(j));
        return j;
    }

    /* renamed from: i */
    public final void mo36064i() {
        if (mo36060e() && mo36061f()) {
            long j = mo36059d().getLong("biz_time_line_need_last_load_time", 0);
            int i = mo36059d().getInt("biz_time_line_need_preload_interval", CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            Log.m105919d("MicroMsg.BizImagePreloadStrategy", "ImageStrategy preloadInterval %d", Integer.valueOf(i));
            if (System.currentTimeMillis() - j <= ((long) i)) {
                Log.m105924i("MicroMsg.BizImagePreloadStrategy", "tryDownloadTopNImage delta <= interval");
                return;
            }
            try {
                C13601g gVar = f65782f;
                if (!((MTimerHandler) ((C36570n) gVar).getValue()).stopped()) {
                    ((MTimerHandler) ((C36570n) gVar).getValue()).stopTimer();
                }
                f65778b = false;
                ((MTimerHandler) ((C36570n) gVar).getValue()).startTimer(mo36063h());
            } catch (Exception e) {
                Log.m105920e("MicroMsg.BizImagePreloadStrategy", e.getMessage());
            }
        }
    }
}
