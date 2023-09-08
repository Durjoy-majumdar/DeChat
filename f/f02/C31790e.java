package f02;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.Message;
import c02.C28462d;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.config.GetOnLineInfoInfoResult;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.handoff.model.HandOffFile;
import com.tencent.p014mm.plugin.handoff.model.HandOffFinderLive;
import com.tencent.p014mm.plugin.handoff.model.HandOffURL;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ex0.C45696d;
import f02.C31817l;
import f40.C86709a0;
import fy3.C32224a;
import g02.C32294f;
import g02.C98064a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import nj3.C76912y0;
import org.json.JSONArray;
import org.json.JSONObject;
import p1042u.C111055b;
import p272xq.C38804g;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C90364q0;

@C86522b(creator = C31817l.C31818a.class, dependencies = {C28462d.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: f02.e */
public final class C31790e extends C86301e implements C92331c, MStorage.IOnStorageChange {

    /* renamed from: d */
    public static final C31790e f84852d = new C31790e();

    /* renamed from: e */
    public static HandOff f84853e;

    /* renamed from: f */
    public static HandOff f84854f;

    /* renamed from: g */
    public static ConcurrentHashMap<String, HandOff> f84855g = new ConcurrentHashMap<>();

    /* renamed from: h */
    public static final C111055b<String, C13604l<HandOffFile, C72683d>> f84856h = new C111055b<>();

    /* renamed from: i */
    public static final C31791a f84857i;

    /* renamed from: j */
    public static GetOnLineInfoInfoResult f84858j;

    /* renamed from: n */
    public static boolean f84859n = true;

    /* renamed from: o */
    public static boolean f84860o;

    /* renamed from: p */
    public static final C31867q f84861p;

    /* renamed from: q */
    public static final C97776c f84862q;

    /* renamed from: f02.e$a */
    public static final class C31791a extends MMHandler {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31791a(Looper looper) {
            super(looper);
            C87412m.m108594g(looper, "looper");
        }

        public void handleMessage(Message message) {
            boolean z;
            boolean z2;
            C31790e.f84852d.getClass();
            Log.m105924i("HandOffService", "do fix handoff");
            ConcurrentHashMap<String, HandOff> concurrentHashMap = C31790e.f84855g;
            if (!concurrentHashMap.isEmpty()) {
                Iterator<Map.Entry<String, HandOff>> it = concurrentHashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry next = it.next();
                    if (((HandOff) next.getValue()).getHandOffType() != 1 || (next.getValue() instanceof HandOffFinderLive)) {
                        z2 = false;
                        continue;
                    } else {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                ConcurrentHashMap<String, HandOff> concurrentHashMap2 = C31790e.f84855g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry next2 : concurrentHashMap2.entrySet()) {
                    if (((HandOff) next2.getValue()).getHandOffType() == 1 && !(next2.getValue() instanceof HandOffFinderLive)) {
                        linkedHashMap.put(next2.getKey(), next2.getValue());
                    }
                }
                Log.m105924i("HandOffService", "in launcherUI, handoff not clear[exist:" + linkedHashMap.size() + "]! try to fix...");
                if (!linkedHashMap.isEmpty()) {
                    Log.m105924i("HandOffService", "in launcherUI, handoff exist, send all list");
                    for (String remove : linkedHashMap.keySet()) {
                        C31790e.f84855g.remove(remove);
                    }
                    C31867q qVar = C31790e.f84861p;
                    Collection<HandOff> values = C31790e.f84855g.values();
                    C87412m.m108593f(values, "items.values");
                    qVar.mo58394e(values);
                }
            }
        }
    }

    /* renamed from: f02.e$b */
    public static final class C31792b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84863d;

        /* renamed from: e */
        public final /* synthetic */ C31790e f84864e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31792b(HandOff handOff, C31790e eVar) {
            super(0);
            this.f84863d = handOff;
            this.f84864e = eVar;
        }

        public Object invoke() {
            C31790e.f84857i.removeMessages(1);
            C31790e.f84855g.put(this.f84863d.getKey(), this.f84863d);
            HandOff handOff = this.f84863d;
            if ((handOff instanceof HandOffFile) && ((HandOffFile) handOff).getSource() == 2 && C87412m.m108589b(this.f84863d.getId(), "-1")) {
                ((C38804g) C86312j.m106911c(C38804g.class)).add(this.f84864e);
            }
            C31790e eVar = C31790e.f84852d;
            if (eVar.yx0() || C31790e.vx0(eVar, this.f84863d)) {
                C31867q qVar = C31790e.f84861p;
                HandOff handOff2 = this.f84863d;
                qVar.getClass();
                C87412m.m108594g(handOff2, "handOff");
                Log.m105924i("HandOff.StatusManager", "add " + handOff2.getId());
                if (!qVar.f84924p.containsKey(handOff2.getKey())) {
                    qVar.f84924p.put(handOff2.getKey(), Boolean.FALSE);
                }
                qVar.f84923o.remove(handOff2.getKey());
                qVar.f84921j.put(handOff2.getKey(), handOff2);
                qVar.mo58390a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$c */
    public static final class C31793c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskInfo f84865d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31793c(MultiTaskInfo multiTaskInfo) {
            super(0);
            this.f84865d = multiTaskInfo;
        }

        public Object invoke() {
            HandOff b = C98064a.f287510a.mo137360b(this.f84865d);
            if (b != null) {
                C31790e.f84852d.wx0(b);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$d */
    public static final class C31794d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C31794d f84866d = new C31794d();

        public C31794d() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("HandOffService", "do all list");
            C31790e eVar = C31790e.f84852d;
            if (!eVar.yx0()) {
                Collection<HandOff> values = C31790e.f84855g.values();
                C87412m.m108593f(values, "items.values");
                ArrayList arrayList = new ArrayList();
                for (T next : values) {
                    HandOff handOff = (HandOff) next;
                    C31790e eVar2 = C31790e.f84852d;
                    C87412m.m108593f(handOff, LocaleUtil.ITALIAN);
                    if (C31790e.vx0(eVar2, handOff)) {
                        arrayList.add(next);
                    }
                }
                List o0 = C110818d0.m150943o0(arrayList, new C31813h());
                C31867q qVar = C31790e.f84861p;
                qVar.getClass();
                qVar.mo58392c();
                qVar.f84926r = o0;
                qVar.mo58390a();
            } else if (C31790e.f84859n) {
                Collection<HandOff> values2 = C31790e.f84855g.values();
                C87412m.m108593f(values2, "items.values");
                List<T> o05 = C110818d0.m150943o0(values2, new C31811f());
                if (!eVar.zx0()) {
                    o05 = C110818d0.m150947s0(o05, 5);
                }
                C31867q qVar2 = C31790e.f84861p;
                qVar2.getClass();
                qVar2.mo58392c();
                qVar2.f84926r = o05;
                qVar2.mo58390a();
            } else {
                Collection<HandOff> values3 = C31790e.f84855g.values();
                C87412m.m108593f(values3, "items.values");
                ArrayList arrayList2 = new ArrayList();
                for (T next2 : values3) {
                    HandOff handOff2 = (HandOff) next2;
                    boolean z = true;
                    if (handOff2.getHandOffType() != 2 && (!C31790e.f84860o || handOff2.getDataType() != 1)) {
                        z = false;
                    }
                    if (z) {
                        arrayList2.add(next2);
                    }
                }
                List o06 = C110818d0.m150943o0(arrayList2, new C31812g());
                if (!C31790e.f84852d.zx0()) {
                    o06 = C110818d0.m150947s0(o06, 5);
                }
                C31867q qVar3 = C31790e.f84861p;
                qVar3.getClass();
                qVar3.mo58392c();
                qVar3.f84926r = o06;
                qVar3.mo58390a();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$e */
    public static final class C31795e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f84867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31795e(String str) {
            super(0);
            this.f84867d = str;
        }

        public Object invoke() {
            C31790e.f84857i.removeMessages(1);
            HandOff remove = C31790e.f84855g.remove(this.f84867d);
            if (remove != null) {
                C31790e eVar = C31790e.f84852d;
                if (eVar.yx0() || C31790e.vx0(eVar, remove)) {
                    C31790e.f84861p.mo58393d(remove);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$f */
    public static final class C31796f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84868d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31796f(HandOff handOff) {
            super(0);
            this.f84868d = handOff;
        }

        public Object invoke() {
            C31790e.f84857i.removeMessages(1);
            HandOff handOff = C31790e.f84855g.get(this.f84868d.getKey());
            if (handOff != null) {
                HandOff handOff2 = this.f84868d;
                if (handOff.update(handOff2)) {
                    C31790e eVar = C31790e.f84852d;
                    if (eVar.yx0() || C31790e.vx0(eVar, handOff2)) {
                        C31867q qVar = C31790e.f84861p;
                        qVar.getClass();
                        Log.m105924i("HandOff.StatusManager", "mod " + handOff.getId());
                        if (!qVar.f84924p.containsKey(handOff.getKey())) {
                            qVar.f84924p.put(handOff.getKey(), Boolean.TRUE);
                            qVar.f84925q.put(handOff.getKey(), handOff.getId());
                        }
                        qVar.f84923o.remove(handOff.getKey());
                        if (qVar.f84921j.containsKey(handOff.getKey())) {
                            Object obj = ((LinkedHashMap) qVar.f84921j).get(handOff.getKey());
                            C87412m.m108591d(obj);
                            ((HandOff) obj).update(handOff);
                        } else {
                            qVar.f84922n.put(handOff.getKey(), handOff);
                        }
                        qVar.mo58390a();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$g */
    public static final class C31797g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84869d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31797g(HandOff handOff) {
            super(0);
            this.f84869d = handOff;
        }

        public Object invoke() {
            C31790e.f84852d.Gg0(this.f84869d);
            Log.m105924i("HandOffService", "onFileCreate: handOff id = " + this.f84869d.getId() + ", key = " + this.f84869d.getKey());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$h */
    public static final class C31798h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84870d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31798h(HandOff handOff) {
            super(0);
            this.f84870d = handOff;
        }

        public Object invoke() {
            C31790e.f84852d.mo58349Bn(this.f84870d.getKey());
            Log.m105924i("HandOffService", "onFileDestroy: handOff id = " + this.f84870d.getId() + ", key = " + this.f84870d.getKey());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$i */
    public static final class C31799i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31799i(HandOff handOff) {
            super(0);
            this.f84871d = handOff;
        }

        public Object invoke() {
            Log.m105924i("HandOffService", "onQBFileCreate");
            C31790e.f84860o = true;
            HandOff handOff = this.f84871d;
            C31790e.f84854f = handOff;
            C31790e.f84852d.mo58377tt(handOff);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$j */
    public static final class C31800j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C31800j f84872d = new C31800j();

        public C31800j() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("HandOffService", "onQBFileDestroy");
            C31790e.f84860o = false;
            HandOff handOff = C31790e.f84854f;
            if (handOff != null) {
                C31790e.f84852d.A70(handOff);
                C31790e.f84854f = null;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$k */
    public static final class C31801k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84873d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31801k(HandOff handOff) {
            super(0);
            this.f84873d = handOff;
        }

        public Object invoke() {
            Log.m105924i("HandOffService", "onQBFileDestroy");
            HandOff handOff = C31790e.f84854f;
            if (handOff != null) {
                handOff.update(this.f84873d);
                C31790e.f84852d.Gg0(handOff);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$l */
    public static final class C31802l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84874d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31802l(HandOff handOff) {
            super(0);
            this.f84874d = handOff;
        }

        public Object invoke() {
            C31790e.f84852d.Gg0(this.f84874d);
            Log.m105924i("HandOffService", "onWebViewCreate: handOff id = " + this.f84874d.getId() + ", key = " + this.f84874d.getKey());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$m */
    public static final class C31803m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84875d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31803m(HandOff handOff) {
            super(0);
            this.f84875d = handOff;
        }

        public Object invoke() {
            C31790e.f84852d.mo58349Bn(this.f84875d.getKey());
            Log.m105924i("HandOffService", "onWebViewDestroy: handOff id = " + this.f84875d.getId() + ", key = " + this.f84875d.getKey());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$o */
    public static final class C31804o extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f84876d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31804o(String str) {
            super(0);
            this.f84876d = str;
        }

        public Object invoke() {
            C31790e.f84852d.mo58349Bn(this.f84876d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$p */
    public static final class C31805p extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<MultiTaskInfo> f84877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31805p(List<? extends MultiTaskInfo> list) {
            super(0);
            this.f84877d = list;
        }

        public Object invoke() {
            Log.m105924i("HandOffService", "restore from multiTaskInfoList");
            C31790e.f84855g.clear();
            C31790e.f84856h.clear();
            List<MultiTaskInfo> list = this.f84877d;
            ArrayList arrayList = new ArrayList();
            for (MultiTaskInfo b : list) {
                HandOff b2 = C98064a.f287510a.mo137360b(b);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                HandOff handOff = (HandOff) it.next();
                arrayList2.add(new C13604l(handOff.getKey(), handOff));
            }
            C90364q0.m113153l(arrayList2, C31790e.f84855g);
            try {
                C31867q qVar = C31790e.f84861p;
                Collection<HandOff> values = C31790e.f84855g.values();
                C87412m.m108593f(values, "items.values");
                qVar.mo58394e(values);
            } catch (Exception e) {
                Log.printErrStackTrace("HandOffService", e, "restoreFromMultiTaskInfoList fail, exp:%s", e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$q */
    public static final class C31806q implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f84878d;

        public C31806q(C32224a aVar) {
            this.f84878d = aVar;
        }

        public final /* synthetic */ void run() {
            this.f84878d.invoke();
        }
    }

    /* renamed from: f02.e$r */
    public static final class C31807r extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84879d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31807r(HandOff handOff) {
            super(0);
            this.f84879d = handOff;
        }

        public Object invoke() {
            C31867q qVar = C31790e.f84861p;
            List b = C26236u.m33719b(this.f84879d);
            qVar.getClass();
            qVar.mo58397h(10, b);
            if (this.f84879d instanceof HandOffFile) {
                int i = !NetStatusUtil.isConnected(MMApplicationContext.getContext()) ? -1 : !C31790e.f84858j.f80325f ? -2 : 0;
                if (C31790e.f84860o) {
                    C31790e.f84852d.getClass();
                    Intent intent = new Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
                    intent.setPackage("com.tencent.mtt");
                    if (i == -2) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i);
                        jSONObject.put("des", MMApplicationContext.getContext().getString(C0966R.string.hfg));
                        intent.putExtra("key_reader_sdk_toast", jSONObject.toString());
                    } else if (i == -1) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i);
                        jSONObject2.put("des", MMApplicationContext.getContext().getString(C0966R.string.hff));
                        intent.putExtra("key_reader_sdk_toast", jSONObject2.toString());
                    } else if (i == 0) {
                        try {
                            Bitmap decodeResource = BitmapFactory.decodeResource(MMApplicationContext.getResources(), C0966R.C0969drawable.icon_toast_ok);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(OpenSDKTool4Assistant.EXTRA_ERROR_CODE, 0);
                            jSONObject3.put("des", MMApplicationContext.getContext().getString(C0966R.string.cvp));
                            intent.putExtra("key_reader_sdk_toast", jSONObject3.toString());
                            intent.putExtra("key_reader_sdk_toast_icon", decodeResource);
                        } catch (Exception e) {
                            Log.m105921e("HandOffService", "notifyQbOpenResult() Exception%s %s", e.getClass().getSimpleName(), e.getMessage());
                        }
                    }
                    MMApplicationContext.getContext().sendBroadcast(intent);
                } else {
                    C31790e.f84852d.getClass();
                    if (i == -2) {
                        C76912y0.m92769h(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.hfg), 0);
                    } else if (i == -1) {
                        C76912y0.m92769h(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.hff), 0);
                    } else if (i == 0) {
                        C76912y0.m92768g(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.hfh));
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$s */
    public static final class C31808s extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MultiTaskInfo f84880d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31808s(MultiTaskInfo multiTaskInfo) {
            super(0);
            this.f84880d = multiTaskInfo;
        }

        public Object invoke() {
            HandOff b = C98064a.f287510a.mo137360b(this.f84880d);
            if (b != null) {
                C31790e.f84852d.Ax0(b);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$t */
    public static final class C31809t extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ HandOff f84881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31809t(HandOff handOff) {
            super(0);
            this.f84881d = handOff;
        }

        public Object invoke() {
            C31790e.f84857i.removeMessages(1);
            if (C31790e.f84855g.containsKey(this.f84881d.getKey())) {
                C31790e.f84852d.Ax0(this.f84881d.copy());
            } else {
                C31790e.f84852d.wx0(this.f84881d.copy());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: f02.e$n */
    public static final class C31810n extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f84882d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31810n(String str) {
            super(0);
            this.f84882d = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00fd  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r8 = this;
                f02.c r0 = f02.C31790e.f84862q
                java.lang.String r1 = r8.f84882d
                r0.getClass()
                java.lang.String r2 = "message"
                gy3.C87412m.m108594g(r1, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "receive handoff request:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "HandOff.RequestProcessor"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                e02.c r2 = new e02.c
                r2.<init>()
                r4 = 0
                r5 = 0
                java.nio.charset.Charset r6 = z04.C119027c.f356488a     // Catch:{ Exception -> 0x0061 }
                java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0061 }
                byte[] r1 = r1.getBytes(r6)     // Catch:{ Exception -> 0x0061 }
                java.lang.String r6 = "this as java.lang.String).getBytes(charset)"
                gy3.C87412m.m108593f(r1, r6)     // Catch:{ Exception -> 0x0061 }
                r7.<init>(r1)     // Catch:{ Exception -> 0x0061 }
                org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
                java.lang.String r6 = "newPullParser()"
                gy3.C87412m.m108593f(r1, r6)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
                java.lang.String r6 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
                r1.setFeature(r6, r4)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
                r1.setInput(r7, r5)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
                r1.nextTag()     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
                r2.mo136827a(r1)     // Catch:{ Exception -> 0x005b, all -> 0x0058 }
                r7.close()
                goto L_0x0071
            L_0x0058:
                r0 = move-exception
                goto L_0x00fb
            L_0x005b:
                r1 = move-exception
                r5 = r7
                goto L_0x0062
            L_0x005e:
                r0 = move-exception
                goto L_0x00fa
            L_0x0061:
                r1 = move-exception
            L_0x0062:
                java.lang.String r6 = "MicroMsg.BaseXmlContent"
                java.lang.String r7 = "safeParse error"
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x005e }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r7, r4)     // Catch:{ all -> 0x005e }
                if (r5 == 0) goto L_0x0071
                r5.close()
            L_0x0071:
                d02.c r1 = r2.f286283a
                java.util.Collection<? extends com.tencent.mm.plugin.handoff.model.HandOff> r2 = r1.f83274b
                java.util.Iterator r2 = r2.iterator()
            L_0x0079:
                boolean r4 = r2.hasNext()
                r5 = 1
                if (r4 == 0) goto L_0x00e2
                java.lang.Object r4 = r2.next()
                com.tencent.mm.plugin.handoff.model.HandOff r4 = (com.tencent.p014mm.plugin.handoff.model.HandOff) r4
                int r6 = r1.f83273a
                if (r6 == r5) goto L_0x00b8
                r5 = 2
                if (r6 == r5) goto L_0x008e
                goto L_0x0079
            L_0x008e:
                java.util.Map<java.lang.String, java.lang.Boolean> r5 = r0.f286855c
                java.lang.String r6 = r4.getId()
                boolean r5 = r5.containsKey(r6)
                if (r5 != 0) goto L_0x00a5
                java.util.Map<java.lang.String, java.lang.Boolean> r5 = r0.f286855c
                java.lang.String r6 = r4.getId()
                java.lang.Boolean r7 = java.lang.Boolean.TRUE
                r5.put(r6, r7)
            L_0x00a5:
                java.util.Map<java.lang.String, com.tencent.mm.plugin.handoff.model.HandOff> r5 = r0.f286853a
                java.lang.String r6 = r4.getId()
                r5.remove(r6)
                java.util.Map<java.lang.String, com.tencent.mm.plugin.handoff.model.HandOff> r5 = r0.f286854b
                java.lang.String r6 = r4.getId()
                r5.put(r6, r4)
                goto L_0x0079
            L_0x00b8:
                java.util.Map<java.lang.String, java.lang.Boolean> r5 = r0.f286855c
                java.lang.String r6 = r4.getId()
                boolean r5 = r5.containsKey(r6)
                if (r5 != 0) goto L_0x00cf
                java.util.Map<java.lang.String, java.lang.Boolean> r5 = r0.f286855c
                java.lang.String r6 = r4.getId()
                java.lang.Boolean r7 = java.lang.Boolean.FALSE
                r5.put(r6, r7)
            L_0x00cf:
                java.util.Map<java.lang.String, com.tencent.mm.plugin.handoff.model.HandOff> r5 = r0.f286854b
                java.lang.String r6 = r4.getId()
                r5.remove(r6)
                java.util.Map<java.lang.String, com.tencent.mm.plugin.handoff.model.HandOff> r5 = r0.f286853a
                java.lang.String r6 = r4.getId()
                r5.put(r6, r4)
                goto L_0x0079
            L_0x00e2:
                f02.c$b r1 = r0.f286856d
                boolean r1 = r1.hasMessages(r5)
                if (r1 != 0) goto L_0x00f7
                java.lang.String r1 = "plan commit task"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r1)
                f02.c$b r0 = r0.f286856d
                r1 = 1000(0x3e8, double:4.94E-321)
                r0.sendEmptyMessageDelayed(r5, r1)
            L_0x00f7:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x00fa:
                r7 = r5
            L_0x00fb:
                if (r7 == 0) goto L_0x0100
                r7.close()
            L_0x0100:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: f02.C31790e.C31810n.invoke():java.lang.Object");
        }
    }

    static {
        Looper looper = C86709a0.m107525e().getLooper();
        C87412m.m108593f(looper, "getPizzaWorkerThread().looper");
        f84857i = new C31791a(looper);
        GetOnLineInfoInfoResult getOnLineInfoInfoResult = new GetOnLineInfoInfoResult();
        C32294f.f85763a.mo58560b(getOnLineInfoInfoResult);
        f84858j = getOnLineInfoInfoResult;
        Looper looper2 = C86709a0.m107525e().getLooper();
        C87412m.m108593f(looper2, "getPizzaWorkerThread().looper");
        f84861p = new C31867q(looper2);
        Looper looper3 = C86709a0.m107525e().getLooper();
        C87412m.m108593f(looper3, "getPizzaWorkerThread().looper");
        f84862q = new C97776c(looper3);
    }

    public static final boolean vx0(C31790e eVar, HandOff handOff) {
        eVar.getClass();
        return (handOff instanceof HandOffURL) && handOff.getHandOffType() == 2 && ((C45696d) C86709a0.m107533q(C45696d.class)).mo70989eQ(((HandOffURL) handOff).getUrl());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.tencent.mm.plugin.handoff.model.HandOffMP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.tencent.mm.plugin.handoff.model.HandOffURL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.tencent.mm.plugin.handoff.model.HandOffMP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: com.tencent.mm.plugin.handoff.model.HandOffMP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: com.tencent.mm.plugin.handoff.model.HandOffMP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: com.tencent.mm.plugin.handoff.model.HandOffMP} */
    /* JADX WARNING: type inference failed for: r1v16, types: [com.tencent.mm.plugin.handoff.model.HandOffFile] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.handoff.model.HandOff xx0(com.tencent.p014mm.plugin.ball.model.BallInfo r18) {
        /*
            r0 = r18
            int r1 = r0.f311686d
            java.lang.String r2 = "title"
            java.lang.String r3 = "icon"
            r4 = 1
            r5 = 0
            if (r1 == r4) goto L_0x0072
            r6 = 2
            if (r1 == r6) goto L_0x0020
            r6 = 4
            if (r1 == r6) goto L_0x0018
            r6 = 5
            if (r1 == r6) goto L_0x0020
            r1 = r5
            goto L_0x00b2
        L_0x0018:
            com.tencent.mm.plugin.handoff.model.HandOffFile$b r1 = com.tencent.p014mm.plugin.handoff.model.HandOffFile.Companion
            com.tencent.mm.plugin.handoff.model.HandOffFile r1 = r1.mo129299a(r0)
            goto L_0x00b2
        L_0x0020:
            java.lang.String r1 = r0.f311699t
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.os.Bundle r1 = r0.f311678C
            java.lang.String r6 = "handoff#shareUrl"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.os.Bundle r6 = r0.f311678C
            java.lang.String r8 = "rawUrl"
            java.lang.String r6 = r6.getString(r8)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            java.lang.String r8 = r0.f311695p
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r8)
            com.tencent.mm.plugin.handoff.model.HandOffURL r16 = new com.tencent.mm.plugin.handoff.model.HandOffURL
            gy3.C87412m.m108593f(r7, r2)
            java.lang.String r2 = "shareUrl"
            gy3.C87412m.m108593f(r1, r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            if (r4 == 0) goto L_0x005a
            r8 = r1
            goto L_0x005b
        L_0x005a:
            r8 = r6
        L_0x005b:
            java.lang.String r1 = "if (shareUrl.isNotEmpty()) shareUrl else url"
            gy3.C87412m.m108593f(r8, r1)
            gy3.C87412m.m108593f(r9, r3)
            r10 = 2
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 112(0x70, float:1.57E-43)
            r15 = 0
            r6 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r16
            goto L_0x00b2
        L_0x0072:
            java.lang.String r1 = r0.f311695p
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            java.lang.String r1 = r0.f311699t
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.os.Bundle r1 = r0.f311678C
            java.lang.String r4 = "appId"
            java.lang.String r1 = r1.getString(r4)
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            android.os.Bundle r1 = r0.f311678C
            java.lang.String r6 = "username"
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
            com.tencent.mm.plugin.handoff.model.HandOffMP r1 = new com.tencent.mm.plugin.handoff.model.HandOffMP
            gy3.C87412m.m108593f(r7, r3)
            gy3.C87412m.m108593f(r8, r2)
            gy3.C87412m.m108593f(r9, r4)
            gy3.C87412m.m108593f(r11, r6)
            r12 = 2
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 448(0x1c0, float:6.28E-43)
            r17 = 0
            java.lang.String r10 = ""
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x00b2:
            if (r1 == 0) goto L_0x00d1
            java.lang.String r2 = r0.f311688f
            java.lang.String r3 = "ballInfo.key"
            gy3.C87412m.m108593f(r2, r3)
            r1.setKey(r2)
            long r2 = r0.f311704y
            r1.setCreateTime(r2)
            android.os.Bundle r0 = r0.f311678C
            java.lang.String r2 = "handoff#id"
            java.lang.String r0 = r0.getString(r2)
            if (r0 == 0) goto L_0x00d0
            r1.setId(r0)
        L_0x00d0:
            r5 = r1
        L_0x00d1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f02.C31790e.xx0(com.tencent.mm.plugin.ball.model.BallInfo):com.tencent.mm.plugin.handoff.model.HandOff");
    }

    public void A70(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31798h(handOff));
    }

    public void Ax0(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31796f(handOff));
    }

    /* renamed from: Bn */
    public void mo58349Bn(String str) {
        C87412m.m108594g(str, "key");
        Bx0(new C31795e(str));
    }

    public final void Bx0(C32224a<C13598b0> aVar) {
        Thread currentThread = Thread.currentThread();
        C31791a aVar2 = f84857i;
        if (C87412m.m108589b(currentThread, aVar2.getLooper().getThread())) {
            aVar.invoke();
        } else {
            aVar2.post(new C31806q(aVar));
        }
    }

    public void Cd0(String str) {
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        Bx0(new C31810n(str));
    }

    public void Eq0(String str, String str2, String str3) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "cdnURL");
        C87412m.m108594g(str3, "aesKey");
        C111055b<String, C13604l<HandOffFile, C72683d>> bVar = f84856h;
        C13604l orDefault = bVar.getOrDefault(str, null);
        if (orDefault != null) {
            ((HandOffFile) orDefault.f38555d).setCdnURL(str2);
            ((HandOffFile) orDefault.f38555d).setAesKey(str3);
            C31867q qVar = f84861p;
            HandOff handOff = (HandOff) orDefault.f38555d;
            qVar.getClass();
            C87412m.m108594g(handOff, "handOff");
            qVar.mo58397h(3, C26236u.m33719b(handOff));
            bVar.remove(str);
            return;
        }
        Log.m105920e("HandOffService", "error in file upload success, handoff with id [" + str + "] lost!");
    }

    /* renamed from: Fi */
    public void mo58353Fi() {
        C31791a aVar = f84857i;
        aVar.removeMessages(1);
        aVar.sendEmptyMessageDelayed(1, 10000);
    }

    public void Gg0(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31809t(handOff));
    }

    /* renamed from: Hk */
    public void mo58355Hk(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31799i(handOff));
    }

    public void I10(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(C31800j.f84872d);
    }

    /* renamed from: LH */
    public boolean mo58357LH() {
        GetOnLineInfoInfoResult getOnLineInfoInfoResult = f84858j;
        if (getOnLineInfoInfoResult.f80325f) {
            int i = getOnLineInfoInfoResult.f80323d;
            if ((i == 1) && getOnLineInfoInfoResult.f80324e >= 1661009920) {
                return true;
            }
            return (i == 2) && getOnLineInfoInfoResult.f80324e >= 318898176;
        }
    }

    public void Ll0(BallInfo ballInfo) {
        C87412m.m108594g(ballInfo, "ballInfo");
        HandOff xx02 = xx0(ballInfo);
        if (xx02 != null) {
            f84852d.wx0(xx02);
        }
    }

    /* renamed from: Ls */
    public void mo58359Ls(String str) {
        C87412m.m108594g(str, "key");
        Bx0(new C31804o(str));
    }

    public void V70(List<? extends BallInfo> list) {
        C87412m.m108594g(list, "ballInfoList");
    }

    /* renamed from: Xv */
    public void mo58361Xv(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31802l(handOff));
    }

    /* renamed from: bE */
    public void mo58362bE(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31801k(handOff));
    }

    public void co0(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31803m(handOff));
    }

    /* renamed from: cv */
    public HandOff mo58364cv(String str) {
        T t;
        C87412m.m108594g(str, "id");
        Collection<HandOff> values = f84855g.values();
        C87412m.m108593f(values, "items.values");
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((HandOff) t).getId(), str)) {
                break;
            }
        }
        return (HandOff) t;
    }

    public boolean f70(String str, C72683d dVar) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(dVar, "info");
        for (Map.Entry<String, HandOff> value : f84855g.entrySet()) {
            HandOff handOff = (HandOff) value.getValue();
            if ((handOff instanceof HandOffFile) && C87412m.m108589b(handOff.getId(), str)) {
                f84856h.put(str, new C13604l(handOff, dVar));
                return true;
            }
        }
        return false;
    }

    /* renamed from: gP */
    public boolean mo58366gP(BallInfo ballInfo, boolean z) {
        C87412m.m108594g(ballInfo, "ballInfo");
        return false;
    }

    /* renamed from: jO */
    public HandOff mo58367jO() {
        return f84853e;
    }

    public void k00(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31807r(handOff));
    }

    public HandOff lt0(String str) {
        C87412m.m108594g(str, "key");
        HandOff handOff = f84855g.get(str);
        if (handOff != null) {
            return handOff.copy();
        }
        return null;
    }

    public void m50() {
        Bx0(C31794d.f84866d);
    }

    public void nd0(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        Bx0(new C31808s(multiTaskInfo));
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b A[EDGE_INSN: B:31:0x008b->B:28:0x008b ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotifyChange(java.lang.String r8, com.tencent.p014mm.sdk.storage.MStorageEventData r9) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "eventData"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.Class<xq.g> r0 = p272xq.C38804g.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            xq.g r0 = (p272xq.C38804g) r0
            long r1 = java.lang.Long.parseLong(r8)
            xh.r2 r8 = r0.mo61772XM(r1)
            if (r8 == 0) goto L_0x00b3
            int r0 = r8.field_type
            r1 = 8
            if (r0 != r1) goto L_0x00b3
            int r9 = r9.eventId
            r0 = 3
            if (r9 != r0) goto L_0x00b3
            te3.kd0 r9 = r8.field_favProto
            java.util.LinkedList<te3.rc0> r9 = r9.f298618f
            java.lang.String r0 = "favItemInfo.field_favProto.dataList"
            gy3.C87412m.m108593f(r9, r0)
            java.lang.Object r9 = sx3.C110818d0.m150916N(r9)
            te3.rc0 r9 = (te3.C101834rc0) r9
            if (r9 == 0) goto L_0x00b3
            java.lang.String r0 = r9.f299325s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0047
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r0 = 0
            goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = r9.f299266M
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.plugin.handoff.model.HandOff> r3 = f84855g
            java.util.Collection r3 = r3.values()
            java.lang.String r4 = "items.values"
            gy3.C87412m.m108593f(r3, r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x005b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.tencent.mm.plugin.handoff.model.HandOff r5 = (com.tencent.p014mm.plugin.handoff.model.HandOff) r5
            boolean r6 = r5 instanceof com.tencent.p014mm.plugin.handoff.model.HandOffFile
            if (r6 == 0) goto L_0x0086
            com.tencent.mm.plugin.handoff.model.HandOffFile r5 = (com.tencent.p014mm.plugin.handoff.model.HandOffFile) r5
            java.lang.String r6 = r5.getMd5()
            boolean r6 = gy3.C87412m.m108589b(r6, r0)
            if (r6 == 0) goto L_0x0086
            java.lang.String r5 = r5.getSvrId()
            java.lang.String r6 = "-1"
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            if (r5 == 0) goto L_0x005b
            goto L_0x008b
        L_0x008a:
            r4 = 0
        L_0x008b:
            com.tencent.mm.plugin.handoff.model.HandOff r4 = (com.tencent.p014mm.plugin.handoff.model.HandOff) r4
            if (r4 == 0) goto L_0x00b3
            f02.e r0 = f84852d
            com.tencent.mm.plugin.handoff.model.HandOffFile r4 = (com.tencent.p014mm.plugin.handoff.model.HandOffFile) r4
            java.lang.String r1 = r9.f299325s
            java.lang.String r2 = "favDataItem.cdnDataUrl"
            gy3.C87412m.m108593f(r1, r2)
            r4.setCdnURL(r1)
            java.lang.String r9 = r9.f299329u
            java.lang.String r1 = "favDataItem.cdnDataKey"
            gy3.C87412m.m108593f(r9, r1)
            r4.setAesKey(r9)
            int r8 = r8.field_id
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r4.setSvrId(r8)
            r0.Ax0(r4)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f02.C31790e.onNotifyChange(java.lang.String, com.tencent.mm.sdk.storage.MStorageEventData):void");
    }

    public void oq0(String str) {
        C87412m.m108594g(str, "id");
        C111055b<String, C13604l<HandOffFile, C72683d>> bVar = f84856h;
        C13604l orDefault = bVar.getOrDefault(str, null);
        if (orDefault != null) {
            ((C72683d) orDefault.f38556e).field_status = 105;
            bVar.remove(str);
            return;
        }
        Log.m105920e("HandOffService", "error in cancel file upload, handoff with md5 [" + str + "] lost!");
    }

    public void pi0(List<? extends MultiTaskInfo> list) {
        C87412m.m108594g(list, "multiTaskInfoList");
        Bx0(new C31805p(list));
    }

    /* renamed from: qN */
    public void mo58374qN(GetOnLineInfoInfoResult getOnLineInfoInfoResult) {
        boolean z;
        C87412m.m108594g(getOnLineInfoInfoResult, "onlineInfo");
        Log.m105924i("HandOffService", "notifyUserStatusChange: " + getOnLineInfoInfoResult);
        if (!C87412m.m108589b(f84858j, getOnLineInfoInfoResult)) {
            f84858j = getOnLineInfoInfoResult;
            C32294f.f85763a.mo58560b(getOnLineInfoInfoResult);
        }
        if (f84860o) {
            Intent intent = new Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
            intent.setPackage("com.tencent.mtt");
            try {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", 3);
                HandOff handOff = f84854f;
                String str = null;
                HandOffFile handOffFile = handOff instanceof HandOffFile ? (HandOffFile) handOff : null;
                if (handOffFile != null) {
                    str = handOffFile.getFullPath();
                }
                String o = C86013q1.m106454o(str);
                if (mo58357LH()) {
                    HandOffFile.Companion.getClass();
                    if (AbsHandOffFile.Companion.mo23889a(o)) {
                        z = true;
                        jSONObject.put("isShow", z);
                        jSONArray.put(jSONObject);
                        intent.putExtra("menuItems", jSONArray.toString());
                        MMApplicationContext.getContext().sendBroadcast(intent);
                    }
                }
                z = false;
                jSONObject.put("isShow", z);
                jSONArray.put(jSONObject);
                intent.putExtra("menuItems", jSONArray.toString());
                MMApplicationContext.getContext().sendBroadcast(intent);
            } catch (Exception e) {
                Log.m105921e("HandOffService", "UpdateQbMenuIfNeed() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }

    /* renamed from: rt */
    public void mo58375rt(HandOff handOff) {
        f84853e = handOff != null ? handOff.copy() : null;
    }

    public boolean sc0(String str, long j) {
        C87412m.m108594g(str, "id");
        C13604l orDefault = f84856h.getOrDefault(str, null);
        if (orDefault != null) {
            C31867q qVar = f84861p;
            HandOff handOff = (HandOff) orDefault.f38555d;
            qVar.getClass();
            C87412m.m108594g(handOff, "handOff");
            qVar.mo58397h(7, C26236u.m33719b(handOff));
            return true;
        }
        Log.m105928w("HandOffService", "error in file uploading, handoff with id [" + str + "] lost!");
        return false;
    }

    /* renamed from: tt */
    public void mo58377tt(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31797g(handOff));
    }

    /* renamed from: uG */
    public void mo58378uG(MultiTaskInfo multiTaskInfo) {
        C87412m.m108594g(multiTaskInfo, "multiTaskInfo");
        Bx0(new C31793c(multiTaskInfo));
    }

    public void wx0(HandOff handOff) {
        C87412m.m108594g(handOff, "handOff");
        Bx0(new C31792b(handOff, this));
    }

    public void x20(String str, String str2, int i, String str3) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "appId");
        C87412m.m108594g(str3, "mediaId");
        C111055b<String, C13604l<HandOffFile, C72683d>> bVar = f84856h;
        C13604l orDefault = bVar.getOrDefault(str, null);
        if (orDefault != null) {
            ((HandOffFile) orDefault.f38555d).setAppId(str2);
            ((HandOffFile) orDefault.f38555d).setSdkVersion(i);
            ((HandOffFile) orDefault.f38555d).setMediaId(str3);
            C31867q qVar = f84861p;
            HandOff handOff = (HandOff) orDefault.f38555d;
            qVar.getClass();
            C87412m.m108594g(handOff, "handOff");
            qVar.mo58397h(3, C26236u.m33719b(handOff));
            bVar.remove(str);
            return;
        }
        Log.m105920e("HandOffService", "error in file upload success, handoff with md5 [" + str + "] lost!");
    }

    public final boolean yx0() {
        GetOnLineInfoInfoResult getOnLineInfoInfoResult = f84858j;
        if (getOnLineInfoInfoResult.f80325f) {
            int i = getOnLineInfoInfoResult.f80323d;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return true;
            }
        }
        return false;
    }

    public void zw0(String str, String str2) {
        C87412m.m108594g(str, "id");
        C87412m.m108594g(str2, "arg");
        C111055b<String, C13604l<HandOffFile, C72683d>> bVar = f84856h;
        C13604l orDefault = bVar.getOrDefault(str, null);
        if (orDefault != null) {
            C31867q qVar = f84861p;
            HandOff handOff = (HandOff) orDefault.f38555d;
            qVar.getClass();
            C87412m.m108594g(handOff, "handOff");
            qVar.mo58397h(8, C26236u.m33719b(handOff));
            bVar.remove(str);
            return;
        }
        Pattern compile = Pattern.compile("opcode=\"\\d+\"");
        C87412m.m108593f(compile, "compile(pattern)");
        String replaceAll = compile.matcher(str2).replaceAll("opcode=\"8\"");
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        Pattern compile2 = Pattern.compile("seq=\"\\d+\"");
        C87412m.m108593f(compile2, "compile(pattern)");
        String replaceAll2 = compile2.matcher(replaceAll).replaceAll("seq=\"<![CSEQ]>\"");
        C87412m.m108593f(replaceAll2, "nativePattern.matcher(in…).replaceAll(replacement)");
        C31867q qVar2 = f84861p;
        qVar2.getClass();
        qVar2.f84916e.add(replaceAll2);
        qVar2.mo58395f();
        Log.m105928w("HandOffService", "error in file upload fail, handoff with id [" + str + "] lost!");
    }

    public final boolean zx0() {
        GetOnLineInfoInfoResult getOnLineInfoInfoResult = f84858j;
        if (getOnLineInfoInfoResult.f80325f) {
            if ((getOnLineInfoInfoResult.f80323d == 1) && getOnLineInfoInfoResult.f80324e >= 1661075456) {
                return true;
            }
        }
        return (getOnLineInfoInfoResult.f80323d == 2) && getOnLineInfoInfoResult.f80324e >= 302383616;
    }
}
