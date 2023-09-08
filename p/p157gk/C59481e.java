package p157gk;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import android.util.Pair;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.storage.C57593a4;
import com.tencent.p014mm.storage.C57602s1;
import com.tencent.p014mm.storage.C57603t1;
import com.tencent.p014mm.storage.C57604w3;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58085t0;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32227p;
import gq3.C59649r;
import gy3.C87412m;
import gy3.C87413o;
import i40.C60247c;
import ig3.C60280b;
import ig3.C60283e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import o40.C61926c;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: gk.e */
public final class C59481e {

    /* renamed from: a */
    public volatile C59477b f169961a = C59477b.IDLE;

    /* renamed from: b */
    public volatile C59649r f169962b = C59649r.NORMAL;

    /* renamed from: c */
    public int f169963c;

    /* renamed from: d */
    public int f169964d = -2;

    /* renamed from: e */
    public volatile boolean f169965e;

    /* renamed from: f */
    public final IStorageObserver<C57602s1> f169966f = new C59482a(this);

    /* renamed from: g */
    public final C54219z<C59479c> f169967g;

    /* renamed from: h */
    public LiveData<C59479c> f169968h;

    /* renamed from: i */
    public C58085t0<ArrayList<QueryImageData>> f169969i;

    /* renamed from: j */
    public C58085t0<Pair<ArrayList<C32466a>, ArrayList<QueryImageData>>> f169970j;

    /* renamed from: gk.e$a */
    public static final class C59482a<T extends IAutoDBItem> implements IStorageObserver {

        /* renamed from: d */
        public final /* synthetic */ C59481e f169971d;

        public C59482a(C59481e eVar) {
            this.f169971d = eVar;
        }

        public void onChanged(Object obj) {
            StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
            C87412m.m108594g(storageObserverEvent, "event");
            this.f169971d.mo84580b(storageObserverEvent);
        }
    }

    /* renamed from: gk.e$b */
    public static final class C59483b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59481e f169972d;

        /* renamed from: e */
        public final /* synthetic */ boolean f169973e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59483b(C59481e eVar, boolean z) {
            super(0);
            this.f169972d = eVar;
            this.f169973e = z;
        }

        public Object invoke() {
            C59481e eVar = this.f169972d;
            int i = eVar.f169963c + 1;
            eVar.f169963c = i;
            if (i == 2 || !this.f169973e) {
                int i2 = eVar.f169964d + 2;
                eVar.f169964d = i2;
                eVar.f169963c = 0;
                C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C59487h(eVar, i2, !this.f169973e, (C15601d<? super C59487h>) null), 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.data.ImageDataManager$startIdentifyWithNoRecData$3", mo125469f = "ImageDataManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: gk.e$c */
    public static final class C59484c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<QueryImageData> f169974d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<QueryImageData> f169975e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59484c(ArrayList<QueryImageData> arrayList, ArrayList<QueryImageData> arrayList2, C15601d<? super C59484c> dVar) {
            super(2, dVar);
            this.f169974d = arrayList;
            this.f169975e = arrayList2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59484c(this.f169974d, this.f169975e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59484c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f169974d.addAll(this.f169975e);
            C60283e.f171885h = (long) this.f169974d.size();
            C59503r.f170040a.mo84588i(this.f169974d);
            return C13598b0.f38549a;
        }
    }

    public C59481e() {
        C54219z<C59479c> zVar = new C54219z<>(C59479c.INIT);
        this.f169967g = zVar;
        this.f169968h = zVar;
    }

    /* renamed from: a */
    public final void mo84579a(AppCompatActivity appCompatActivity) {
        C39622i0 a;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f169963c = 0;
        this.f169964d = -2;
        StringBuilder sb = new StringBuilder();
        sb.append("addClsDbObserver >> dataType: ");
        sb.append(this.f169961a);
        sb.append(", currentIdentifyType: ");
        C59503r rVar = C59503r.f170040a;
        rVar.getClass();
        sb.append(C59503r.f170053n);
        Log.m105924i("MicroMsg.ImageDataManager", sb.toString());
        if (this.f169961a != C59477b.ALL_OLD) {
            rVar.getClass();
            if (C59503r.f170053n != C59479c.STOP) {
                Log.m105924i("MicroMsg.ImageDataManager", "go to addClsDbObserver");
                Class cls = C57604w3.class;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (C60247c.class.isAssignableFrom(cls)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                ((C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class)).observe((C0125s) appCompatActivity, this.f169966f);
            }
        }
    }

    /* renamed from: b */
    public final void mo84580b(StorageObserverEvent<C57602s1> storageObserverEvent) {
        HashMap<String, StorageObserverEvent<C57602s1>> objEventMap;
        C39622i0 a;
        StorageEventId eventId = storageObserverEvent.getEventId();
        StorageEventId.Companion companion = StorageEventId.Companion;
        if (C87412m.m108589b(eventId, companion.getINSERT())) {
            C57602s1 obj = storageObserverEvent.getObj();
            if (obj != null) {
                Log.m105924i("MicroMsg.ImageDataManager", "observe insert cls >> labelId: " + obj.field_label_id + ", cropLabelId: " + obj.field_crop_label_id);
            }
        } else if (C87412m.m108589b(eventId, companion.getUPDATE())) {
            C57602s1 obj2 = storageObserverEvent.getObj();
            if (obj2 != null) {
                String str = C59491j.f169997b;
                Class cls = C57604w3.class;
                synchronized (C60247c.f171776h) {
                    C86709a0.m107523b().mo121108c();
                    if (C60247c.class.isAssignableFrom(cls)) {
                        a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                    } else {
                        throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                }
                List<C57602s1> d3 = ((C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class)).mo81952d3(str, "0", 0, 1);
                StringBuilder sb = new StringBuilder();
                sb.append("isExitNoRecImage >> ");
                sb.append(str);
                sb.append(' ');
                sb.append(!d3.isEmpty());
                Log.m105924i("MicroMsg.ImageQueryStorage", sb.toString());
                C61926c.m72668M(new C59483b(this, !d3.isEmpty()));
                Log.m105918d("MicroMsg.ImageDataManager", "observe update cls >> labelId: " + obj2.field_label_id + ", cropLabelId: " + obj2.field_crop_label_id + ", ocr result: " + obj2.field_ocr_result);
            }
        } else if (C87412m.m108589b(eventId, companion.getDELETE())) {
            C57602s1 obj3 = storageObserverEvent.getObj();
            if (obj3 != null) {
                Log.m105918d("MicroMsg.ImageDataManager", "observe delete cls >> labelId: " + obj3.field_label_id + ", cropLabelId: " + obj3.field_crop_label_id + ", imagePath: " + obj3.field_origin_image_path);
            }
        } else if (C87412m.m108589b(eventId, companion.getBATCH_EVENT()) && (objEventMap = storageObserverEvent.getObjEventMap()) != null) {
            for (Map.Entry<String, StorageObserverEvent<C57602s1>> value : objEventMap.entrySet()) {
                mo84580b((StorageObserverEvent) value.getValue());
            }
        }
    }

    /* renamed from: c */
    public final Object mo84581c(ArrayList<QueryImageData> arrayList, ArrayList<QueryImageData> arrayList2, C15601d<? super C13598b0> dVar) {
        if (this.f169965e) {
            Log.m105924i("MicroMsg.ImageDataManager", "startIdentify >> isDoingWork");
            return C13598b0.f38549a;
        }
        this.f169965e = true;
        long currentTimeMillis = System.currentTimeMillis();
        C60283e eVar = C60283e.f171878a;
        C60283e.f171879b = currentTimeMillis;
        Log.m105924i("MicroMsg.ImageQueryConsumeTimeReporter", "setStartTimeStamp >> " + currentTimeMillis);
        C60280b.f171845b = currentTimeMillis;
        C60283e.f171894q = (long) 2;
        C60283e.f171883f = (long) arrayList.size();
        C60283e.f171884g = (long) arrayList2.size();
        if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
            this.f169961a = C59477b.NEW;
            this.f169967g.postValue(C59479c.RUNNING);
            Log.m105924i("MicroMsg.ImageDataManager", "startIdentifyWithNoRecData >> data: " + arrayList.size() + " oldNoRecData: " + arrayList2.size() + ", " + Thread.currentThread());
            for (QueryImageData c : arrayList) {
                C57593a4.f164912a.mo81938c(c, C59491j.f169997b);
            }
            C53896h0 h0Var = C53872d1.f151117a;
            Object g = C53895h.m60469g(C58901s.f168555a, new C59484c(arrayList, arrayList2, (C15601d<? super C59484c>) null), dVar);
            return g == C15911a.COROUTINE_SUSPENDED ? g : C13598b0.f38549a;
        }
        Log.m105924i("MicroMsg.ImageDataManager", "startIdentifyWithNoRecData >> no new image need to rec");
        this.f169961a = C59477b.ALL_OLD;
        this.f169967g.postValue(C59479c.STOP);
        eVar.mo85270a(6, 0, 0);
        return C13598b0.f38549a;
    }

    /* renamed from: d */
    public final void mo84582d() {
        C39622i0 a;
        Log.m105924i("MicroMsg.ImageDataManager", "stopCurrentRoomIdentify");
        Class cls = C57604w3.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C57603t1 t1Var = (C57603t1) ((C57604w3) a).mo85233d3(C57603t1.class);
        if (t1Var.hasObserver()) {
            Log.m105924i("MicroMsg.ImageDataManager", "removeClsDbObserver");
            t1Var.removeObserver(this.f169966f);
        }
        this.f169969i = null;
        this.f169970j = null;
    }
}
