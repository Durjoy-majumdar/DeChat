package com.tencent.p014mm.feature.brandservice.flutter.model;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import c00.C0405n;
import c00.C0406o;
import com.google.android.gms.common.Scopes;
import com.tencent.matrix.lifecycle.C80401d;
import com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderLiveSwitchEvent;
import com.tencent.p014mm.autogen.events.FollowUserEvent;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTestUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.BizTimeLineNewMsgUI;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C18441b;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.multitask.C105918j;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C19607d1;
import com.tencent.p014mm.storage.C19615i1;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.p0$$f;
import com.tencent.p014mm.storage.p0$$g;
import com.tencent.p014mm.storage.p0$$h;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.pigeon.BizPigeon;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d62.C75339i;
import di3.C86312j;
import eb0.C86484b;
import ex0.C45696d;
import f12.C7970a;
import f40.C86709a0;
import f62.C75700k0;
import fx0.C45821d;
import fx0.C45823f;
import fx0.C45825h;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jw0.C9533e;
import k20.C9556a;
import ke3.C88144b;
import kotlin.ResultKt;
import lc3.C10485b;
import o40.C61926c;
import p007bo.C16801f;
import p007bo.C16804h;
import p007bo.C16811k;
import p007bo.C16812l;
import p007bo.C16813m;
import p007bo.C16815n;
import p007bo.C39824g;
import p151er.C58676k;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p196ln.C76706g;
import p227rn.C22240c0;
import p248ug.C102027b;
import p248ug.C37468y;
import p248ug.C52558c;
import p357lo.C21449a;
import p357lo.C21450b;
import p357lo.C21453c;
import p357lo.C21454d;
import p357lo.C21455e;
import p493do.C86380f;
import p493do.C86382i;
import p823sg.C90193h;
import pe3.C89349b;
import rb0.C48009v0;
import rx0.C22270n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90363p0;
import sx3.C90364q0;
import te3.C110964i13;
import te3.C118459qf;
import te3.C118474vf;
import te3.C64459j13;
import te3.fz4;
import te3.i25;
import te3.mg4;
import u73.C14136q0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import z04.C119027c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin */
public final class FlutterBizPlugin implements BizPigeon.BizApi, FlutterPlugin, ActivityAware, MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public BizPigeon.BizCallbackApi f48843d;

    /* renamed from: e */
    public Activity f48844e;

    /* renamed from: f */
    public final IListener<FinderLiveSwitchEvent> f48845f;

    /* renamed from: g */
    public final p0$$h f48846g = new C17740e(this);

    /* renamed from: h */
    public final IListener<?> f48847h;

    /* renamed from: i */
    public final IListener<FollowUserEvent> f48848i;

    /* renamed from: j */
    public final p0$$h f48849j;

    /* renamed from: n */
    public final C13601g f48850n;

    /* renamed from: o */
    public boolean f48851o;

    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$a */
    public static final class C17736a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BizPigeon.Result<List<BizPigeon.ContactInfo>> f48852d;

        /* renamed from: e */
        public final /* synthetic */ List<String> f48853e;

        public C17736a(BizPigeon.Result<List<BizPigeon.ContactInfo>> result, List<String> list) {
            this.f48852d = result;
            this.f48853e = list;
        }

        public final void run() {
            BizPigeon.Result<List<BizPigeon.ContactInfo>> result = this.f48852d;
            if (result != null) {
                List<String> list = this.f48853e;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (String c : list) {
                    arrayList.add(C16801f.f45399a.mo17843c(c));
                }
                result.success(arrayList);
            }
        }
    }

    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$b */
    public static final class C17737b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BizPigeon.Result<BizPigeon.OftenReadAccountInfo> f48854d;

        /* renamed from: e */
        public final /* synthetic */ String f48855e;

        public C17737b(BizPigeon.Result<BizPigeon.OftenReadAccountInfo> result, String str) {
            this.f48854d = result;
            this.f48855e = str;
        }

        public final void run() {
            BizPigeon.Result<BizPigeon.OftenReadAccountInfo> result = this.f48854d;
            if (result != null) {
                result.success(C16815n.f45432a.mo17860a(this.f48855e));
            }
        }
    }

    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$c */
    public static final class C17738c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ BizPigeon.Result<Map<String, BizPigeon.OftenReadAccountInfo>> f48856d;

        /* renamed from: e */
        public final /* synthetic */ List<String> f48857e;

        public C17738c(BizPigeon.Result<Map<String, BizPigeon.OftenReadAccountInfo>> result, List<String> list) {
            this.f48856d = result;
            this.f48857e = list;
        }

        public final void run() {
            BizPigeon.Result<Map<String, BizPigeon.OftenReadAccountInfo>> result = this.f48856d;
            if (result != null) {
                List<String> list = this.f48857e;
                int a = C90363p0.m113142a(C36907w.m41090l(list, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (T next : list) {
                    linkedHashMap.put(next, C16815n.f45432a.mo17860a((String) next));
                }
                result.success(C90364q0.m113155n(linkedHashMap));
            }
        }
    }

    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$d */
    public static final class C17739d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ FlutterBizPlugin f48858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17739d(FlutterBizPlugin flutterBizPlugin) {
            super(0);
            this.f48858d = flutterBizPlugin;
        }

        public Object invoke() {
            String i = C86013q1.m106448i(C7970a.m8129c(), false);
            C87412m.m108591d(i);
            String unused = this.f48858d.getClass();
            Log.m105924i("MicroMsg.FlutterBizPlugin", "imgCacheDirectory=" + i);
            return i;
        }
    }

    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$e */
    public static final class C17740e implements p0$$h {

        /* renamed from: a */
        public final /* synthetic */ FlutterBizPlugin f48859a;

        /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$e$a */
        public static final class C17741a<T> implements BizPigeon.BizCallbackApi.Reply {

            /* renamed from: a */
            public static final C17741a<T> f48860a = new C17741a<>();

            public /* bridge */ /* synthetic */ void reply(Object obj) {
                Void voidR = (Void) obj;
            }
        }

        /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$e$b */
        public static final class C17742b<T> implements BizPigeon.BizCallbackApi.Reply {

            /* renamed from: a */
            public static final C17742b<T> f48861a = new C17742b<>();

            public /* bridge */ /* synthetic */ void reply(Object obj) {
                Void voidR = (Void) obj;
            }
        }

        /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$e$c */
        public static final class C17743c<T> implements BizPigeon.BizCallbackApi.Reply {

            /* renamed from: a */
            public static final C17743c<T> f48862a = new C17743c<>();

            public /* bridge */ /* synthetic */ void reply(Object obj) {
                Void voidR = (Void) obj;
            }
        }

        /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$e$d */
        public static final class C17744d<T> implements BizPigeon.BizCallbackApi.Reply {

            /* renamed from: a */
            public static final C17744d<T> f48863a = new C17744d<>();

            public /* bridge */ /* synthetic */ void reply(Object obj) {
                Void voidR = (Void) obj;
            }
        }

        public C17740e(FlutterBizPlugin flutterBizPlugin) {
            this.f48859a = flutterBizPlugin;
        }

        /* renamed from: p */
        public final void mo21358p(Object obj, p0$$f p0__f) {
            BizPigeon.BizCallbackApi bizCallbackApi;
            if ((p0__f == null || !p0__f.f55566e) && !C16804h.f45407a.mo17846a("notifyInfo") && !C16804h.f45409c && !((C22240c0) C86312j.m106911c(C22240c0.class)).mo35407eG()) {
                p0$$g p0__g = p0__f.f55562a;
                if (p0__g == p0$$g.INSERT && p0__f.f55563b != null) {
                    BizPigeon.BizCallbackApi bizCallbackApi2 = this.f48859a.f48843d;
                    if (bizCallbackApi2 != null) {
                        BizPigeon.BizNotifyInfo bizNotifyInfo = new BizPigeon.BizNotifyInfo();
                        bizNotifyInfo.setEventType(Long.valueOf((long) BizPigeon.BizNotifyEventType.eventTypeNewMsg.ordinal()));
                        C16801f fVar = C16801f.f45399a;
                        C19623o0 o0Var = p0__f.f55563b;
                        C87412m.m108593f(o0Var, "notifyInfo.info");
                        bizNotifyInfo.setMsgInfo(fVar.mo17841a(o0Var));
                        bizCallbackApi2.onDataChange(bizNotifyInfo, C17741a.f48860a);
                    }
                } else if (p0__g == p0$$g.RE_SORT) {
                    BizPigeon.BizCallbackApi bizCallbackApi3 = this.f48859a.f48843d;
                    if (bizCallbackApi3 != null) {
                        BizPigeon.BizNotifyInfo bizNotifyInfo2 = new BizPigeon.BizNotifyInfo();
                        bizNotifyInfo2.setEventType(Long.valueOf((long) BizPigeon.BizNotifyEventType.eventTypeResort.ordinal()));
                        bizCallbackApi3.onDataChange(bizNotifyInfo2, C17742b.f48861a);
                    }
                } else if (p0__g == p0$$g.DELETE) {
                    BizPigeon.BizCallbackApi bizCallbackApi4 = this.f48859a.f48843d;
                    if (bizCallbackApi4 != null) {
                        BizPigeon.BizNotifyInfo bizNotifyInfo3 = new BizPigeon.BizNotifyInfo();
                        bizNotifyInfo3.setTalker(p0__f.f55564c);
                        bizNotifyInfo3.setEventType(Long.valueOf((long) BizPigeon.BizNotifyEventType.eventTypeDelete.ordinal()));
                        bizCallbackApi4.onDataChange(bizNotifyInfo3, C17743c.f48862a);
                    }
                } else if (p0__g == p0$$g.UPDATE && (bizCallbackApi = this.f48859a.f48843d) != null) {
                    BizPigeon.BizNotifyInfo bizNotifyInfo4 = new BizPigeon.BizNotifyInfo();
                    bizNotifyInfo4.setEventType(Long.valueOf((long) BizPigeon.BizNotifyEventType.eventTypeUpdate.ordinal()));
                    bizNotifyInfo4.setItems(new LinkedList());
                    List<C19623o0> list = p0__f.f55565d;
                    if (list != null) {
                        for (C19623o0 o0Var2 : list) {
                            List<BizPigeon.MassSendCardMsg> items = bizNotifyInfo4.getItems();
                            if (items != null) {
                                C16801f fVar2 = C16801f.f45399a;
                                C87412m.m108593f(o0Var2, "info");
                                items.add(fVar2.mo17841a(o0Var2));
                            }
                        }
                    }
                    bizCallbackApi.onDataChange(bizNotifyInfo4, C17744d.f48863a);
                }
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$onMinimizeArticle$1", mo125469f = "FlutterBizPlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$f */
    public static final class C17745f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C64459j13 f48864d;

        /* renamed from: e */
        public final /* synthetic */ BizPigeon.BizMinimizeInfo f48865e;

        /* renamed from: f */
        public final /* synthetic */ FlutterBizPlugin f48866f;

        /* renamed from: g */
        public final /* synthetic */ i25 f48867g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17745f(C64459j13 j132, BizPigeon.BizMinimizeInfo bizMinimizeInfo, FlutterBizPlugin flutterBizPlugin, i25 i25, C15601d<? super C17745f> dVar) {
            super(2, dVar);
            this.f48864d = j132;
            this.f48865e = bizMinimizeInfo;
            this.f48866f = flutterBizPlugin;
            this.f48867g = i25;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C17745f(this.f48864d, this.f48865e, this.f48866f, this.f48867g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C17745f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            ResultKt.throwOnFailure(obj);
            C64459j13 j132 = this.f48864d;
            C22270n.C22271a aVar = C22270n.f63119d;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            Long itemShowType = this.f48865e.getItemShowType();
            int longValue = itemShowType != null ? (int) itemShowType.longValue() : 0;
            String userName = this.f48865e.getUserName();
            String str = "";
            if (userName == null) {
                userName = str;
            }
            String title = this.f48865e.getTitle();
            if (title != null) {
                str = title;
            }
            j132.f183752e = aVar.mo35424a(context, longValue, userName, str);
            byte[] bArr = null;
            try {
                bitmap = BitmapUtil.decodeByteArray(this.f48865e.getCoverImage());
            } catch (Exception e) {
                String unused = this.f48866f.getClass();
                Log.printErrStackTrace("MicroMsg.FlutterBizPlugin", e, "onMinimizeArticle", new Object[0]);
                bitmap = null;
            }
            byte[] byteArray = this.f48867g.toByteArray();
            String url = this.f48865e.getUrl();
            if (url != null) {
                bArr = url.getBytes(C119027c.f356488a);
                C87412m.m108593f(bArr, "this as java.lang.String).getBytes(charset)");
            }
            String str2 = this.f48865e.getLocalId() + '_' + C90193h.m112878f(bArr);
            String unused2 = this.f48866f.getClass();
            Log.m105924i("MicroMsg.FlutterBizPlugin", "addTaskInfoByBitmap, id = " + str2);
            ((C105918j) C86312j.m106911c(C105918j.class)).mo151023l0(str2, 2, this.f48864d, bitmap, byteArray, (C110964i13) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$g */
    public static final class C17746g implements p0$$h {

        /* renamed from: a */
        public final /* synthetic */ FlutterBizPlugin f48868a;

        /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$g$a */
        public static final class C17747a<T> implements BizPigeon.BizCallbackApi.Reply {

            /* renamed from: a */
            public static final C17747a<T> f48869a = new C17747a<>();

            public /* bridge */ /* synthetic */ void reply(Object obj) {
                Void voidR = (Void) obj;
            }
        }

        public C17746g(FlutterBizPlugin flutterBizPlugin) {
            this.f48868a = flutterBizPlugin;
        }

        /* renamed from: p */
        public final void mo21358p(Object obj, p0$$f p0__f) {
            BizPigeon.BizNotifyTipsInfo b = C16801f.f45399a.mo17842b();
            BizPigeon.BizCallbackApi bizCallbackApi = this.f48868a.f48843d;
            if (bizCallbackApi != null) {
                bizCallbackApi.onNotifyChange(b, C17747a.f48869a);
            }
        }
    }

    /* renamed from: com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin$h */
    public static final class C17748h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FlutterBizPlugin f48870d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<Object> f48871e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17748h(FlutterBizPlugin flutterBizPlugin, C8479f0<Object> f0Var) {
            super(0);
            this.f48870d = flutterBizPlugin;
            this.f48871e = f0Var;
        }

        public Object invoke() {
            BizPigeon.BizCallbackApi bizCallbackApi = this.f48870d.f48843d;
            if (bizCallbackApi != null) {
                BizPigeon.BizNotifyInfo bizNotifyInfo = new BizPigeon.BizNotifyInfo();
                C8479f0<Object> f0Var = this.f48871e;
                bizNotifyInfo.setEventType(Long.valueOf((long) BizPigeon.BizNotifyEventType.eventTypeContactUpdate.ordinal()));
                bizNotifyInfo.setTalker((String) f0Var.f27484d);
                bizCallbackApi.onDataChange(bizNotifyInfo, C17755f.f48882a);
            }
            return C13598b0.f38549a;
        }
    }

    public FlutterBizPlugin() {
        C40008f fVar = C40008f.f107254d;
        this.f48845f = new FlutterBizPlugin$finderLiveSwitchEventListener$1(this, fVar);
        this.f48847h = new FlutterBizPlugin$appMsgRelatedInfoUpdateEventListener$1(this, fVar);
        this.f48848i = new FlutterBizPlugin$finderFollowUserEventIListener$1(this, fVar);
        this.f48849j = new C17746g(this);
        this.f48850n = C36568h.m40985a(new C17739d(this));
    }

    public void addToPreload(String str, Long l, Long l2) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        C87412m.m108594g(str, "url");
        ((C45696d) C86709a0.m107533q(C45696d.class)).Tn0(str, (int) longValue, (int) longValue2, new Object[0]);
    }

    /* renamed from: b */
    public final BizPigeon.BizFinderLiveInfo mo21311b(C118459qf qfVar) {
        BizPigeon.WeApp_Data weApp_Data;
        BizPigeon.BizFinderLiveInfo bizFinderLiveInfo = new BizPigeon.BizFinderLiveInfo();
        bizFinderLiveInfo.setBizusername(qfVar.f354270d);
        bizFinderLiveInfo.setFinder_feed_export_id(qfVar.f354271e);
        bizFinderLiveInfo.setRefresh_interval(Long.valueOf((long) qfVar.f354272f));
        bizFinderLiveInfo.setTitle(qfVar.f354273g);
        bizFinderLiveInfo.setLive_scene(Long.valueOf((long) qfVar.f354274h));
        bizFinderLiveInfo.setCover(qfVar.f354275i);
        bizFinderLiveInfo.setUse_weapp(Boolean.valueOf(qfVar.f354276j));
        fz4 fz4 = qfVar.f354277n;
        if (fz4 != null) {
            weApp_Data = new BizPigeon.WeApp_Data();
            weApp_Data.setAppid(fz4.f354021d);
            weApp_Data.setVersion_type(Long.valueOf((long) fz4.f354022e));
            weApp_Data.setData_buffer(fz4.f354023f.mo123703f());
            weApp_Data.setPath(fz4.f354024g);
        } else {
            weApp_Data = null;
        }
        bizFinderLiveInfo.setWeapp_data(weApp_Data);
        return bizFinderLiveInfo;
    }

    public void createMagicAdBrandService(Long l) {
        ((C86382i) C86312j.m106911c(C86382i.class)).mo120802DN((int) l.longValue(), this.f48844e);
    }

    public void createMagicBrandService(Long l) {
        ((C86380f) C86312j.m106911c(C86380f.class)).mo120802DN((int) l.longValue(), this.f48844e);
    }

    public Boolean deleteByMsgId(Long l) {
        long longValue = l.longValue();
        ((C119157j) C119157j.f356862d).mo183876g(new C21449a(this, longValue), "FlutterBizThread");
        return Boolean.TRUE;
    }

    public Boolean deleteByTalker(String str) {
        C87412m.m108594g(str, "userName");
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        C52558c SE = C48009v0.Fx0().mo72757SE(str);
        Log.m105924i("MicroMsg.FlutterBizPlugin", "deleteByTalker, username = " + str);
        ((C37468y) C86312j.m106911c(C37468y.class)).mo61116ee(SE, this.f48844e, z1Var, false);
        return Boolean.TRUE;
    }

    public void doSearch() {
        C16801f fVar = C16801f.f45399a;
        Class cls = C0406o.class;
        Class cls2 = C0405n.class;
        Context context = MMApplicationContext.getContext();
        if (C43471q.m46984h(0)) {
            boolean yv02 = ((C0406o) C86312j.m106911c(cls)).yv0(11, 2);
            Intent O20 = ((C0405n) C86312j.m106911c(cls2)).O20();
            O20.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getString(C0966R.string.f3r));
            O20.putExtra("searchbar_tips", context.getString(C0966R.string.f3r));
            O20.putExtra("KRightBtn", true);
            O20.putExtra("ftsneedkeyboard", !yv02);
            O20.putExtra("publishIdPrefix", "bs");
            O20.putExtra("ftsType", 2);
            O20.putExtra("ftsbizscene", 11);
            Map<String, String> hn = ((C0405n) C86312j.m106911c(cls2)).mo280hn(11, true, 2);
            String lh02 = ((C0405n) C86312j.m106911c(cls2)).lh0(Util.safeParseInt(hn.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)));
            hn.put("sessionId", lh02);
            O20.putExtra("sessionId", lh02);
            O20.putExtra("rawUrl", ((C0405n) C86312j.m106911c(cls2)).mo277Vw(hn));
            O20.putExtra("key_load_js_without_delay", true);
            O20.putExtra("key_preload_biz", 4);
            O20.addFlags(67108864);
            String Fb = ((C0406o) C86312j.m106911c(cls)).mo447Fb("bizAccountTopSearch");
            if (!TextUtils.isEmpty(Fb)) {
                O20.putExtra("key_search_input_hint", Fb);
            }
            O20.putExtra("KOpenArticleSceneFromScene", 90);
            C88144b.m109806x(context, O20, (Bundle) null);
            C14136q0.m13469a(11, lh02, lh02, false, "", 2, "", false, "");
            return;
        }
        Log.m105920e("MicroMsg.BizFlutterHelper", "fts h5 template not avail");
    }

    public BizPigeon.BizEnterStatusInfo getBizEnterStatusInfo() {
        BizPigeon.BizEnterStatusInfo bizEnterStatusInfo = C16812l.f45421a;
        C16812l.f45421a = null;
        C16812l.f45422b = false;
        return bizEnterStatusInfo;
    }

    public void getBizFinderLivesInfo(Boolean bool, BizPigeon.Result result) {
        boolean booleanValue = bool.booleanValue();
        boolean z = C18441b.f51194t;
        ArrayList arrayList = new ArrayList();
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C21450b(this, 2, arrayList, booleanValue, (C15601d<? super C21450b>) null), 2, (Object) null);
        C19428d dVar = C19428d.f54856a;
        C118474vf g = dVar.mo25173g();
        if (g != null) {
            long decodeLong = dVar.mo25176k().decodeLong("live_bar_list_last_refresh_time", 0);
            int decodeInt = dVar.mo25176k().decodeInt("bar_list_keep_data_interval-2", 0);
            if (decodeInt < 60) {
                decodeInt = 60;
            }
            if (System.currentTimeMillis() - decodeLong < ((long) (decodeInt * 1000))) {
                Log.m105924i("MicroMsg.FlutterBizPlugin", "initFinderLivesBar use cache");
                dVar.mo25155H(75);
                LinkedList<C118459qf> linkedList = g.f354494d;
                C87412m.m108593f(linkedList, "resp.live_info");
                List<C118459qf> p = dVar.mo25181p(linkedList, booleanValue);
                if (result != null) {
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(p, 10));
                    for (C118459qf b : p) {
                        arrayList2.add(mo21311b(b));
                    }
                    result.success(C110818d0.m150900B0(arrayList2));
                }
            } else if (result != null) {
                result.success(new ArrayList());
            }
        } else if (result != null) {
            result.success(new ArrayList());
        }
    }

    public String getBizImgCacheDirectory() {
        String str = (String) ((C36570n) this.f48850n).getValue();
        C87412m.m108593f(str, "imgCacheDirectory");
        return str;
    }

    public String getCdnUrlList() {
        String str = C102027b.f300465c;
        if (str == null) {
            try {
                C102027b.f300465c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("BizEnableWxPicUrl");
            } catch (C86484b unused) {
                Log.m105928w("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList fail, AccountNotReady");
            } catch (Exception e) {
                Log.m105919d("MicroMsg.BizImageStrategy", "alvinluo initCdnUrlList error: %s", e.getMessage());
            }
            str = Util.nullAsNil(C102027b.f300465c);
        }
        C87412m.m108593f(str, "getCdnUrlList()");
        return str;
    }

    public BizPigeon.ContactInfo getContactInfo(String str) {
        C87412m.m108594g(str, "userName");
        return C16801f.f45399a.mo17843c(str);
    }

    public void getContactInfoBatch(List<String> list, BizPigeon.Result<List<BizPigeon.ContactInfo>> result) {
        C87412m.m108594g(list, "userNames");
        ((C119157j) C119157j.f356862d).mo183875f(new C17736a(result, list));
    }

    public void getMassSendData(Long l, Boolean bool, Boolean bool2, BizPigeon.Result result) {
        long longValue = l.longValue();
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        ((C119157j) C119157j.f356862d).mo183875f(new C21453c(result, longValue, booleanValue, booleanValue2));
    }

    public BizPigeon.BizNotifyTipsInfo getNotifyTipsInfo() {
        return C16801f.f45399a.mo17842b();
    }

    public void getOftenReadAccountInfo(String str, BizPigeon.Result<BizPigeon.OftenReadAccountInfo> result) {
        C87412m.m108594g(str, "userName");
        ((C119157j) C119157j.f356862d).mo183875f(new C17737b(result, str));
    }

    public void getOftenReadAccountInfoBatch(List<String> list, BizPigeon.Result<Map<String, BizPigeon.OftenReadAccountInfo>> result) {
        C87412m.m108594g(list, "userNames");
        ((C119157j) C119157j.f356862d).mo183875f(new C17738c(result, list));
    }

    public Long getUnReadCount() {
        return Long.valueOf((long) C48009v0.Jx0().mo25792TY(C48009v0.Jx0().mo25791TO() << 32));
    }

    public void gotoBizTestUI() {
        Activity activity;
        if (C9533e.f29713a.mo10211d() && (activity = this.f48844e) != null) {
            Intent intent = new Intent(activity, BizTestUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizPlugin", "gotoBizTestUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizPlugin", "gotoBizTestUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if ((r7 == null || z04.C112551y.m153811k(r7)) == false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void gotoFinder(com.tencent.pigeon.BizPigeon.BizFinderJumpInfo r13) {
        /*
            r12 = this;
            java.lang.String r0 = "jumpInfo"
            gy3.C87412m.m108594g(r13, r0)
            android.app.Activity r0 = r12.f48844e
            if (r0 == 0) goto L_0x00df
            com.tencent.pigeon.BizPigeon$BizFinderLiveInfo r0 = r13.getTargetInfo()
            if (r0 == 0) goto L_0x00df
            java.lang.Long r0 = r13.getScene()
            r1 = 0
            if (r0 == 0) goto L_0x001d
            long r2 = r0.longValue()
            int r0 = (int) r2
            r6 = r0
            goto L_0x001e
        L_0x001d:
            r6 = 0
        L_0x001e:
            java.util.List r0 = r13.getAllInfoList()
            r2 = 0
            if (r0 == 0) goto L_0x00a5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0066
            java.lang.Object r5 = r0.next()
            r7 = r5
            com.tencent.pigeon.BizPigeon$BizFinderLiveInfo r7 = (com.tencent.pigeon.BizPigeon.BizFinderLiveInfo) r7
            java.lang.Long r8 = r7.getLive_scene()
            r9 = 1
            if (r8 != 0) goto L_0x0044
            goto L_0x005f
        L_0x0044:
            long r10 = r8.longValue()
            int r8 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x005f
            java.lang.String r7 = r7.getFinder_feed_export_id()
            if (r7 == 0) goto L_0x005b
            boolean r7 = z04.C112551y.m153811k(r7)
            if (r7 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r7 = 0
            goto L_0x005c
        L_0x005b:
            r7 = 1
        L_0x005c:
            if (r7 != 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r9 = 0
        L_0x0060:
            if (r9 == 0) goto L_0x002f
            r4.add(r5)
            goto L_0x002f
        L_0x0066:
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 10
            int r5 = sx3.C36907w.m41090l(r4, r5)
            r0.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0075:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a6
            java.lang.Object r5 = r4.next()
            com.tencent.pigeon.BizPigeon$BizFinderLiveInfo r5 = (com.tencent.pigeon.BizPigeon.BizFinderLiveInfo) r5
            te3.qf r7 = new te3.qf
            r7.<init>()
            java.lang.String r8 = r5.getBizusername()
            r7.f354270d = r8
            java.lang.String r8 = r5.getFinder_feed_export_id()
            r7.f354271e = r8
            java.lang.Long r5 = r5.getLive_scene()
            if (r5 == 0) goto L_0x009e
            long r8 = r5.longValue()
            int r5 = (int) r8
            goto L_0x009f
        L_0x009e:
            r5 = 0
        L_0x009f:
            r7.f354274h = r5
            r0.add(r7)
            goto L_0x0075
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            r8 = r0
            com.tencent.mm.pluginsdk.model.d r0 = com.tencent.p014mm.pluginsdk.model.C19428d.f54856a
            android.app.Activity r1 = r12.f48844e
            gy3.C87412m.m108591d(r1)
            com.tencent.pigeon.BizPigeon$BizFinderLiveInfo r4 = r13.getTargetInfo()
            gy3.C87412m.m108591d(r4)
            java.lang.String r4 = r4.getBizusername()
            com.tencent.pigeon.BizPigeon$BizFinderLiveInfo r5 = r13.getTargetInfo()
            gy3.C87412m.m108591d(r5)
            java.lang.String r5 = r5.getFinder_feed_export_id()
            com.tencent.pigeon.BizPigeon$BizFinderLiveInfo r13 = r13.getTargetInfo()
            gy3.C87412m.m108591d(r13)
            java.lang.Long r13 = r13.getLive_scene()
            if (r13 != 0) goto L_0x00d5
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
        L_0x00d5:
            long r2 = r13.longValue()
            int r7 = (int) r2
            r2 = r0
            r3 = r1
            r2.mo25190y(r3, r4, r5, r6, r7, r8)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.brandservice.flutter.model.FlutterBizPlugin.gotoFinder(com.tencent.pigeon.BizPigeon$BizFinderJumpInfo):void");
    }

    public void gotoOldList(Long l, Long l2) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        C16801f fVar = C16801f.f45399a;
        if (((Boolean) ((C36570n) C16801f.f45401c).getValue()).booleanValue()) {
            Intent intent = new Intent();
            intent.addFlags(67108864);
            intent.putExtra("biz_from_scene", 2);
            intent.putExtra("biz_time_line_line_session_id", longValue);
            intent.putExtra("biz_enter_source", longValue2);
            Context context = this.f48844e;
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            C88144b.m109791i(context, "brandservice", ".ui.personalcenter.BizPersonalCenterActivity", intent, (Bundle) null);
            return;
        }
        Intent intent2 = new Intent();
        intent2.addFlags(67108864);
        intent2.putExtra("biz_from_scene", 2);
        intent2.putExtra("biz_time_line_line_session_id", (int) longValue);
        intent2.putExtra("biz_enter_source", (int) longValue2);
        Context context2 = this.f48844e;
        if (context2 == null) {
            context2 = MMApplicationContext.getContext();
        }
        C88144b.m109801s(context2, ".ui.conversation.NewBizConversationUI", intent2, (Bundle) null);
    }

    public void gotoProfile(String str, Long l, Long l2) {
        long longValue = l.longValue();
        long longValue2 = l2.longValue();
        C87412m.m108594g(str, "userName");
        Intent intent = new Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("Contact_Scene", (int) longValue);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("KOpenArticleSceneFromScene", (int) longValue2);
        if (!C112551y.m153811k(str)) {
            ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69778p0(str);
        }
        Context context = this.f48844e;
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
    }

    public Boolean isFinderContactFollow(String str) {
        C87412m.m108594g(str, "finderUsername");
        return Boolean.valueOf(!((C58676k) C86312j.m106911c(C58676k.class)).Ha0(str));
    }

    public Boolean isPaid(String str) {
        C87412m.m108594g(str, "url");
        return Boolean.valueOf(C45821d.f123719a.mo71284b(str));
    }

    public void launchBizFinderFeed(BizPigeon.BizFinderPigeonInfo bizFinderPigeonInfo) {
        long j;
        boolean z;
        Long finderMediaType;
        C87412m.m108594g(bizFinderPigeonInfo, "info");
        Intent intent = new Intent();
        String objectId = bizFinderPigeonInfo.getObjectId();
        boolean z2 = true;
        if (!(objectId == null || objectId.length() == 0)) {
            j = C61926c.m72671P(bizFinderPigeonInfo.getObjectId());
            intent.putExtra("feed_object_id", j);
        } else {
            j = 0;
        }
        if (j == 0) {
            intent.putExtra("feedID", bizFinderPigeonInfo.getExportId());
        }
        intent.putExtra("nonceID", bizFinderPigeonInfo.getNonceId());
        intent.putExtra("key_session_id", bizFinderPigeonInfo.getFromSessionIdInfo());
        Long mediaType = bizFinderPigeonInfo.getMediaType();
        intent.putExtra("key_need_related_list", (mediaType != null && mediaType.longValue() == 9) ? 1 : 0);
        intent.putExtra("from_user", bizFinderPigeonInfo.getEncryptUsername());
        intent.putExtra("key_extra_info", bizFinderPigeonInfo.getReportInfo());
        if (bizFinderPigeonInfo.getFinderWidth() == null || bizFinderPigeonInfo.getFinderHeight() == null || bizFinderPigeonInfo.getAlignment() == null || bizFinderPigeonInfo.getFinderMediaType() == null) {
            z = false;
        } else {
            Long finderWidth = bizFinderPigeonInfo.getFinderWidth();
            C87412m.m108591d(finderWidth);
            long longValue = finderWidth.longValue();
            Long finderHeight = bizFinderPigeonInfo.getFinderHeight();
            C87412m.m108591d(finderHeight);
            long longValue2 = finderHeight.longValue();
            Long alignment = bizFinderPigeonInfo.getAlignment();
            if (alignment == null || alignment.longValue() != 1 || (finderMediaType = bizFinderPigeonInfo.getFinderMediaType()) == null || finderMediaType.longValue() != 4 || longValue <= longValue2) {
                z2 = false;
            }
            z = z2;
        }
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        if (t1Var != null) {
            Context context = this.f48844e;
            if (context == null) {
                context = MMApplicationContext.getContext();
            }
            Context context2 = context;
            C87412m.m108593f(context2, "activity ?: MMApplicationContext.getContext()");
            t1Var.mo76787NL(26, 2, 25, context2, intent, (View) null, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013 A[Catch:{ Exception -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadLocalOftenReadInfo(com.tencent.pigeon.BizPigeon.Result<byte[]> r3) {
        /*
            r2 = this;
            r0 = 0
            te3.mg4 r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread.C29763t.m38870a()     // Catch:{ Exception -> 0x0017 }
            if (r1 != 0) goto L_0x000a
        L_0x0007:
            byte[] r1 = new byte[r0]     // Catch:{ Exception -> 0x0017 }
            goto L_0x0011
        L_0x000a:
            byte[] r1 = r1.getData()     // Catch:{ Exception -> 0x0017 }
            if (r1 != 0) goto L_0x0011
            goto L_0x0007
        L_0x0011:
            if (r3 == 0) goto L_0x001f
            r3.success(r1)     // Catch:{ Exception -> 0x0017 }
            goto L_0x001f
        L_0x0017:
            if (r3 == 0) goto L_0x001f
            byte[] r0 = new byte[r0]
            r3.success(r0)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.brandservice.flutter.model.FlutterBizPlugin.loadLocalOftenReadInfo(com.tencent.pigeon.BizPigeon$Result):void");
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        Log.m105924i("MicroMsg.FlutterBizPlugin", "onAttachedToActivity");
        this.f48844e = activityPluginBinding.getActivity();
        C16801f fVar = C16801f.f45399a;
        ((C119157j) C119157j.f356862d).mo183876g(C39824g.f106840d, "FlutterBizThread");
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        BizPigeon.BizApi.CC.m21673L(flutterPluginBinding.getBinaryMessenger(), this);
        this.f48843d = new BizPigeon.BizCallbackApi(flutterPluginBinding.getBinaryMessenger());
        C19625p0 Jx0 = C48009v0.Jx0();
        Jx0.f55551e.add(this.f48846g, Looper.getMainLooper());
        C19607d1 Kx0 = C48009v0.Kx0();
        Kx0.f55478e.add(this.f48849j, Looper.getMainLooper());
        this.f48847h.alive();
        this.f48848i.alive();
        this.f48845f.alive();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().add(this);
    }

    public void onClickNotifyTips() {
        C19623o0 kD = C48009v0.Kx0().mo25740kD();
        if (kD != null) {
            C19615i1.m21063j(kD);
            C19615i1.m21062i(kD);
        }
        Intent intent = new Intent(this.f48844e, BizTimeLineNewMsgUI.class);
        intent.putExtra("biz_time_line_line_session_id", C19636w0.f55626c);
        intent.putExtra("biz_time_line_line_enter_scene", 1);
        Activity activity = this.f48844e;
        if (activity != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Activity activity2 = activity;
            C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizPlugin", "onClickNotifyTips", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity2, "com/tencent/mm/feature/brandservice/flutter/model/FlutterBizPlugin", "onClickNotifyTips", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public void onDetachedFromActivity() {
        StringBuilder sb = new StringBuilder();
        sb.append("onDetachedFromActivity ");
        Activity activity = this.f48844e;
        sb.append(activity != null ? Boolean.valueOf(activity.isFinishing()) : null);
        Log.m105924i("MicroMsg.FlutterBizPlugin", sb.toString());
        Activity activity2 = this.f48844e;
        if (activity2 != null && activity2.isFinishing()) {
            C16801f fVar = C16801f.f45399a;
            ((C119157j) C119157j.f356862d).mo183876g(C39824g.f106840d, "FlutterBizThread");
            C19428d.f54856a.mo25157J();
            C16804h hVar = C16804h.f45407a;
            C19636w0.f55627d = false;
            if (fVar.mo17845e()) {
                C16813m mVar = C16813m.f45424a;
                mVar.mo17857c().onExitAsync(mVar.mo17858d());
            }
            C16804h.f45408b = true;
            C16804h.f45410d = System.currentTimeMillis();
            C16804h.f45411e = false;
            long e = ((long) C19636w0.m21163e()) * 1000;
            Log.m105924i("MicroMsg.BizFlutterInstantsHelper", "onUIDestroy startTimer delay=" + e);
            long j = C16804h.f45410d;
            C119179t tVar = C119157j.f356862d;
            C16811k kVar = new C16811k(j);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183889t(kVar, e, (String) null);
            ProcessDeepBackgroundOwner.INSTANCE.addLifecycleCallback((C80401d) C16804h.f45414h);
            int i = C45823f.f123722a;
            C45825h hVar2 = C45825h.f123727a;
            this.f48844e = null;
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.f48844e = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        BizPigeon.BizApi.CC.m21673L(flutterPluginBinding.getBinaryMessenger(), (BizPigeon.BizApi) null);
        C19625p0 Jx0 = C48009v0.Jx0();
        Jx0.f55551e.remove(this.f48846g);
        C19607d1 Kx0 = C48009v0.Kx0();
        Kx0.f55478e.remove(this.f48849j);
        this.f48847h.dead();
        this.f48848i.dead();
        this.f48845f.dead();
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().remove(this);
        this.f48843d = null;
    }

    public Boolean onExpand(Long l) {
        long longValue = l.longValue();
        ((C119157j) C119157j.f356862d).mo183876g(new C21454d(longValue), "FlutterBizThread");
        return Boolean.TRUE;
    }

    public void onExposed(Long l, String str, Boolean bool, Boolean bool2) {
        long longValue = l.longValue();
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        C87412m.m108594g(str, "userName");
        ((C119157j) C119157j.f356862d).mo183876g(new C21455e(longValue, str, booleanValue, booleanValue2), "FlutterBizThread");
    }

    public void onMinimizeArticle(BizPigeon.BizMinimizeInfo bizMinimizeInfo) {
        C87412m.m108594g(bizMinimizeInfo, "info");
        Log.m105924i("MicroMsg.FlutterBizPlugin", "onMinimizeArticle url = " + bizMinimizeInfo.getUrl());
        C64459j13 j132 = new C64459j13();
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(bizMinimizeInfo.getUserName());
        C68097n Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(bizMinimizeInfo.getUserName());
        String f = Lo != null ? Lo.mo93597f() : null;
        j132.f183751d = displayName;
        j132.f183752e = bizMinimizeInfo.getTitle();
        j132.f183753f = f;
        j132.f183756i = f;
        j132.f183758n = false;
        i25 i25 = new i25();
        i25.f135052f = bizMinimizeInfo.getUrl();
        i25.f135051e = bizMinimizeInfo.getUrl();
        i25.f135063t = 90;
        C53895h.m60466d(C53930o0.m60555b(), (C66212f) null, (C53934p0) null, new C17745f(j132, bizMinimizeInfo, this, i25, (C15601d<? super C17745f>) null), 3, (Object) null);
    }

    public void onMinimizeFinder(BizPigeon.BizFinderPigeonInfo bizFinderPigeonInfo) {
        C87412m.m108594g(bizFinderPigeonInfo, "info");
        Log.m105924i("MicroMsg.FlutterBizPlugin", "doFinderMultiTask, objectId = " + bizFinderPigeonInfo.getObjectId());
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        long P = C61926c.m72671P(bizFinderPigeonInfo.getObjectId());
        String title = bizFinderPigeonInfo.getTitle();
        if (title == null) {
            title = "";
        }
        String coverImgUrl = bizFinderPigeonInfo.getCoverImgUrl();
        if (coverImgUrl == null) {
            coverImgUrl = "";
        }
        String nickName = bizFinderPigeonInfo.getNickName();
        if (nickName == null) {
            nickName = "";
        }
        String headImgUrl = bizFinderPigeonInfo.getHeadImgUrl();
        if (headImgUrl == null) {
            headImgUrl = "";
        }
        Long finderDuration = bizFinderPigeonInfo.getFinderDuration();
        t1Var.mo76875sW(P, title, coverImgUrl, nickName, headImgUrl, finderDuration != null ? finderDuration.longValue() : 0);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (obj == null || !(obj instanceof String)) {
            Log.m105925i("MicroMsg.FlutterBizPlugin", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
        } else if (!C16804h.f45407a.mo17846a("notifyInfo") && !C16804h.f45409c) {
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = obj;
            Log.m105919d("MicroMsg.FlutterBizPlugin", "onNotifyChange userName:%s", obj);
            C61926c.m72668M(new C17748h(this, f0Var));
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "binding");
        this.f48844e = activityPluginBinding.getActivity();
    }

    public void openFinderContact(BizPigeon.BizFinderPigeonInfo bizFinderPigeonInfo) {
        Class cls = C60200t1.class;
        C87412m.m108594g(bizFinderPigeonInfo, "info");
        Intent intent = new Intent();
        intent.putExtra("finder_username", bizFinderPigeonInfo.getEncryptUsername());
        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(26, 2, 32, intent);
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(cls);
        Context context = this.f48844e;
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C87412m.m108593f(context, "activity ?: MMApplicationContext.getContext()");
        t1Var.mo76819V1(context, intent);
    }

    public void openUrl(BizPigeon.BizArticleInfo bizArticleInfo) {
        C87412m.m108594g(bizArticleInfo, "info");
        C16801f fVar = C16801f.f45399a;
        Context context = this.f48844e;
        if (context == null) {
            context = MMApplicationContext.getContext();
        }
        C87412m.m108593f(context, "activity ?: MMApplicationContext.getContext()");
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        Log.m105925i("MicroMsg.BizFlutterHelper", "onWebViewClick = %d", Long.valueOf(currentTimeMillis));
        Intent intent = new Intent();
        Long openScene = bizArticleInfo.getOpenScene();
        C87412m.m108591d(openScene);
        int longValue = (int) openScene.longValue();
        Long subScene = bizArticleInfo.getSubScene();
        C87412m.m108591d(subScene);
        int longValue2 = (int) subScene.longValue();
        intent.putExtra("message_id", bizArticleInfo.getMsgId());
        intent.putExtra("srcUsername", bizArticleInfo.getUserName());
        intent.putExtra("srcDisplayname", bizArticleInfo.getNickName());
        intent.putExtra("geta8key_username", bizArticleInfo.getUserName());
        intent.putExtra("geta8key_scene", 56);
        intent.putExtra(C74928u.C45093i.f122318j, bizArticleInfo.getItemShowType());
        intent.putExtra("start_activity_time", currentTimeMillis);
        Bundle bundle = new Bundle();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(bizArticleInfo.getUserName());
        if (z1Var != null && z1Var.mo62916m3()) {
            i = 4;
        }
        bundle.putInt("snsWebSource", i);
        intent.putExtra("msg_id", bizArticleInfo.getMsgId());
        intent.putExtra("KPublisherId", "msg_" + bizArticleInfo.getMsgId());
        intent.putExtra("pre_username", bizArticleInfo.getUserName());
        intent.putExtra("prePublishId", "msg_" + bizArticleInfo.getSvrId());
        intent.putExtra("preUsername", bizArticleInfo.getUserName());
        intent.putExtra("preChatName", bizArticleInfo.getUserName());
        intent.putExtra("preChatTYPE", 7);
        intent.putExtra("preMsgIndex", bizArticleInfo.getPosInCard());
        String userName = bizArticleInfo.getUserName();
        Bundle bundle2 = new Bundle();
        bundle2.putString("share_report_pre_msg_url", bizArticleInfo.getUrl());
        bundle2.putString("share_report_pre_msg_title", bizArticleInfo.getTitle());
        bundle2.putString("share_report_pre_msg_icon_url", bizArticleInfo.getCoverUrl());
        bundle2.putString("share_report_pre_msg_appid", "");
        bundle2.putInt("share_report_from_scene", 5);
        bundle2.putString("share_report_biz_username", userName);
        intent.putExtras(bundle2);
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("message_index", bizArticleInfo.getPosInCard());
        intent.putExtra("from_scence", 1);
        intent.putExtra("mode", 1);
        String url = bizArticleInfo.getUrl();
        C87412m.m108591d(url);
        int i2 = (int) (currentTimeMillis / ((long) 1000));
        Long pos = bizArticleInfo.getPos();
        String c = C92721n.m116875c(url, longValue, longValue2, i2, (C19623o0) null, "", pos != null ? (int) pos.longValue() : -1);
        intent.putExtra("rawUrl", c);
        intent.putExtra("webpageTitle", bizArticleInfo.getTitle());
        intent.putExtra("thumbUrl", bizArticleInfo.getCoverUrl());
        intent.addFlags(536870912);
        Long itemShowType = bizArticleInfo.getItemShowType();
        C87412m.m108591d(itemShowType);
        if (!((C45696d) C86709a0.m107533q(C45696d.class)).Ms0(context, c, (int) itemShowType.longValue(), true, longValue, longValue2, intent)) {
            C88144b.m109791i(context, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        }
    }

    public void resetRedDot() {
        C16801f fVar = C16801f.f45399a;
        ((C119157j) C119157j.f356862d).mo183876g(C39824g.f106840d, "FlutterBizThread");
    }

    public void saveFinderLivesInfoBatch(List<BizPigeon.BizFinderLiveInfo> list, BizPigeon.Result<Void> result) {
        fz4 fz4;
        C87412m.m108594g(list, "infos");
        Log.m105924i("MicroMsg.FlutterBizPlugin", "saveFinderLivesInfoBatch infos size=" + list.size());
        for (BizPigeon.BizFinderLiveInfo bizFinderLiveInfo : list) {
            C19428d dVar = C19428d.f54856a;
            C118459qf qfVar = new C118459qf();
            qfVar.f354270d = bizFinderLiveInfo.getBizusername();
            qfVar.f354271e = bizFinderLiveInfo.getFinder_feed_export_id();
            Long refresh_interval = bizFinderLiveInfo.getRefresh_interval();
            int i = 0;
            qfVar.f354272f = refresh_interval != null ? (int) refresh_interval.longValue() : 0;
            qfVar.f354273g = bizFinderLiveInfo.getTitle();
            Long live_scene = bizFinderLiveInfo.getLive_scene();
            qfVar.f354274h = live_scene != null ? (int) live_scene.longValue() : 0;
            qfVar.f354275i = bizFinderLiveInfo.getCover();
            Boolean use_weapp = bizFinderLiveInfo.getUse_weapp();
            qfVar.f354276j = use_weapp == null ? false : use_weapp.booleanValue();
            BizPigeon.WeApp_Data weapp_data = bizFinderLiveInfo.getWeapp_data();
            if (weapp_data != null) {
                fz4 = new fz4();
                fz4.f354021d = weapp_data.getAppid();
                Long version_type = weapp_data.getVersion_type();
                if (version_type != null) {
                    i = (int) version_type.longValue();
                }
                fz4.f354022e = i;
                fz4.f354023f = new C89349b(weapp_data.getData_buffer());
                fz4.f354024g = weapp_data.getPath();
            } else {
                fz4 = null;
            }
            qfVar.f354277n = fz4;
            dVar.mo25159L(qfVar);
        }
    }

    public void saveLocalOftenReadInfo(byte[] bArr, BizPigeon.Result<Void> result) {
        C87412m.m108594g(bArr, "infoBuffer");
        try {
            mg4 mg4 = new mg4();
            mg4.parseFrom(bArr);
            C29763t.m38872c(mg4);
        } catch (Exception unused) {
        }
    }

    public void setPayStatus(String str, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C87412m.m108594g(str, "url");
        C45821d.f123719a.mo71287e(str, booleanValue);
    }

    public void unfollowFinderContact(BizPigeon.BizFinderPigeonInfo bizFinderPigeonInfo) {
        C87412m.m108594g(bizFinderPigeonInfo, "info");
        String objectId = bizFinderPigeonInfo.getObjectId();
        long P = !(objectId == null || objectId.length() == 0) ? C61926c.m72671P(bizFinderPigeonInfo.getObjectId()) : 0;
        String encryptUsername = bizFinderPigeonInfo.getEncryptUsername();
        if (Util.isNullOrNil(encryptUsername)) {
            Log.m105928w("MicroMsg.FlutterBizPlugin", "unfollow finder contact fail, encryptUsername is empty!");
            return;
        }
        C87412m.m108591d(encryptUsername);
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76768Iz(encryptUsername, P);
    }

    public void updateBizFinderLivesInfo(List<String> list, BizPigeon.Result<List<BizPigeon.BizFinderLiveInfo>> result) {
        C87412m.m108594g(list, "usernameList");
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            if (C19428d.f54856a.mo25165R((String) next)) {
                arrayList.add(next);
            }
        }
        List B0 = C110818d0.m150900B0(arrayList);
        boolean z = C18441b.f51194t;
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C21450b(this, 3, B0, false, (C15601d<? super C21450b>) null), 2, (Object) null);
    }
}
