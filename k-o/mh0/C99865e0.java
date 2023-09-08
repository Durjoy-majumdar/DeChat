package mh0;

import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.sdk.storage.executor.ReplaceExecutor;
import com.tencent.p014mm.sdk.storage.executor.UpdateExecutor;
import com.tencent.p014mm.sdk.storage.observer.IStorageObserver;
import com.tencent.p014mm.sdk.storage.observer.StorageEventId;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverEvent;
import com.tencent.p014mm.sdk.storage.observer.StorageObserverOwner;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.storage.C57594e4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gy3.C8480h;
import gy3.C87412m;
import i40.C60247c;
import i40.C98597b;
import i40.C98598e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38172g;
import p749xh.C102645g6;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: mh0.e0 */
public final class C99865e0 extends C98597b implements C75875l.C75877b {

    /* renamed from: f */
    public final MStorageEvent<C99869e, C102645g6> f292640f;

    /* renamed from: g */
    public final IStorageObserver<C102645g6> f292641g;

    /* renamed from: mh0.e0$b */
    public static final class C34562b extends IStaticListener<RevokeMsgEvent> {
        public boolean callback(IEvent iEvent) {
            RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
            C87412m.m108594g(revokeMsgEvent, "event");
            RevokeMsgEvent.C28810a aVar = revokeMsgEvent.f78943d;
            C72963f4 f4Var = aVar.f78946c;
            long j = aVar.f78948e;
            C72963f4 f4Var2 = aVar.f78947d;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(f4Var != null);
            objArr[1] = Long.valueOf(j);
            Log.m105925i("MicroMsg.AlbumMsgRevokeMsgListener", "revokeMsg callback msgInfoNotNull:%s srvId:%s", objArr);
            if (!(f4Var2 == null || j == 0 || !f4Var2.mo101016t3())) {
                ((C119157j) C119157j.f356862d).mo183885p(new C99877f0(f4Var), "MicroMsg.MsgExtInfoStorageFSC_deleteFileAndTask");
                StringBuilder sb = new StringBuilder();
                sb.append("delete extra msg info and all cdn info. msgId: ");
                sb.append(f4Var != null ? Long.valueOf(f4Var.getMsgId()) : null);
                Log.m105924i("MicroMsg.MsgExtInfoStorageFSC", sb.toString());
            }
            return false;
        }
    }

    /* renamed from: mh0.e0$c */
    public static final class C34563c extends IStaticListener<RevokeNativeMsgEvent> {
        public boolean callback(IEvent iEvent) {
            RevokeNativeMsgEvent revokeNativeMsgEvent = (RevokeNativeMsgEvent) iEvent;
            C87412m.m108594g(revokeNativeMsgEvent, "event");
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(revokeNativeMsgEvent.f78950d.f78951a);
            long y2 = b002.mo108774y2();
            Log.m105925i("MicroMsg.AlbumRevokeNativeMessageListener", "revokeNativeMsg callback srvId:%s", Long.valueOf(y2));
            if (y2 != 0 && b002.mo101016t3()) {
                ((C119157j) C119157j.f356862d).mo183885p(new C99877f0(b002), "MicroMsg.MsgExtInfoStorageFSC_deleteFileAndTask");
                Log.m105924i("MicroMsg.MsgExtInfoStorageFSC", "delete extra msg info and all cdn info. msgId: " + Long.valueOf(b002.getMsgId()));
            }
            return false;
        }
    }

    /* renamed from: mh0.e0$a */
    public static final class C99866a implements C99869e {

        /* renamed from: mh0.e0$a$a */
        public static final class C99867a<T extends C15510f> implements C38172g {

            /* renamed from: a */
            public final /* synthetic */ C102645g6 f292642a;

            public C99867a(C102645g6 g6Var) {
                this.f292642a = g6Var;
            }

            public boolean invoke(C15510f fVar) {
                C99869e eVar = (C99869e) fVar;
                C87412m.m108594g(eVar, "iMsgExtInfoStorageChanged");
                eVar.mo108219so(this.f292642a);
                return false;
            }
        }

        /* renamed from: so */
        public void mo108219so(C102645g6 g6Var) {
            C38166b.m41755b(C99869e.class, new C99867a(g6Var));
        }
    }

    /* renamed from: mh0.e0$d */
    public static final class C99868d {
        public C99868d(C8480h hVar) {
        }
    }

    /* renamed from: mh0.e0$e */
    public interface C99869e extends C15510f {
        /* renamed from: so */
        void mo108219so(C102645g6 g6Var);
    }

    /* renamed from: mh0.e0$f */
    public static final class C99870f<T extends IAutoDBItem> implements IStorageObserver {

        /* renamed from: d */
        public final /* synthetic */ C99865e0 f292643d;

        public C99870f(C99865e0 e0Var) {
            this.f292643d = e0Var;
        }

        public void onChanged(Object obj) {
            StorageObserverEvent storageObserverEvent = (StorageObserverEvent) obj;
            C87412m.m108594g(storageObserverEvent, LocaleUtil.ITALIAN);
            StorageEventId eventId = storageObserverEvent.getEventId();
            StorageEventId.Companion companion = StorageEventId.Companion;
            Integer num = null;
            if (C87412m.m108589b(eventId, companion.getUPDATE())) {
                StringBuilder sb = new StringBuilder();
                sb.append("dbObserver update event, status: ");
                C102645g6 g6Var = (C102645g6) storageObserverEvent.getObj();
                if (g6Var != null) {
                    num = Integer.valueOf(g6Var.getStatus());
                }
                sb.append(num);
                Log.m105918d("MicroMsg.MsgExtInfoStorageFSC", sb.toString());
                this.f292643d.f292640f.event(storageObserverEvent.getObj());
                this.f292643d.f292640f.doNotify();
            } else if (C87412m.m108589b(eventId, companion.getBATCH_EVENT())) {
                HashMap objEventMap = storageObserverEvent.getObjEventMap();
                if (objEventMap != null) {
                    C99865e0 e0Var = this.f292643d;
                    for (Map.Entry value : objEventMap.entrySet()) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("dbObserver batch event, status: ");
                        C102645g6 g6Var2 = (C102645g6) ((StorageObserverEvent) value.getValue()).getObj();
                        sb4.append(g6Var2 != null ? Integer.valueOf(g6Var2.getStatus()) : null);
                        Log.m105918d("MicroMsg.MsgExtInfoStorageFSC", sb4.toString());
                        e0Var.f292640f.event(storageObserverEvent.getObj());
                        e0Var.f292640f.doNotify();
                    }
                }
            } else if (C87412m.m108589b(eventId, companion.getINSERT())) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("dbObserver insert event, status: ");
                C102645g6 g6Var3 = (C102645g6) storageObserverEvent.getObj();
                if (g6Var3 != null) {
                    num = Integer.valueOf(g6Var3.getStatus());
                }
                sb5.append(num);
                Log.m105918d("MicroMsg.MsgExtInfoStorageFSC", sb5.toString());
                this.f292643d.f292640f.event(storageObserverEvent.getObj());
                this.f292643d.f292640f.doNotify();
            }
        }
    }

    /* renamed from: mh0.e0$g */
    public static final class C99871g extends MStorageEvent<C99869e, C102645g6> {
        public void processEvent(Object obj, Object obj2) {
            C99869e eVar = (C99869e) obj;
            C87412m.m108594g(eVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            eVar.mo108219so((C102645g6) obj2);
        }
    }

    static {
        new C99868d((C8480h) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99865e0(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
        C99871g gVar = new C99871g();
        this.f292640f = gVar;
        C99870f fVar = new C99870f(this);
        this.f292641g = fVar;
        C102645g6.f302370B.observe(eVar, fVar);
        gVar.add(new C99866a(), Looper.getMainLooper());
    }

    /* renamed from: i3 */
    public static void m130419i3(C99865e0 e0Var, C99862a aVar, String str, long j, long j2, boolean z, int i, Object obj) {
        long incrementAndGet;
        ReplaceExecutor replaceExecutor;
        C102645g6 f3;
        C99862a aVar2 = aVar;
        boolean z2 = (i & 16) != 0 ? true : z;
        e0Var.getClass();
        SelectSql q2 = C102645g6.m135569q2(j);
        C57594e4.C57595a aVar3 = C57594e4.f164913n;
        if (((C102645g6) q2.singleQuery(aVar3.mo81948a().getDB(), C102645g6.class)) != null) {
            e0Var.mo139219k3(aVar, str, j, j2, z2);
        } else if (aVar2 != null) {
            C57594e4 a = aVar3.mo81948a();
            synchronized (a) {
                if (a.f164915j.longValue() == a.f164914i && (f3 = a.mo81947f3()) != null) {
                    a.f164915j.set(f3.mo142303n2());
                }
                incrementAndGet = a.f164915j.incrementAndGet();
            }
            aVar.mo55370I(incrementAndGet);
            C102645g6 g6Var = new C102645g6();
            g6Var.setLocalId(aVar.mo55364C());
            long j3 = j;
            g6Var.mo142309t2(j);
            long j4 = j2;
            g6Var.mo142310u2(j2);
            g6Var.mo142298d(aVar.mo55367F());
            g6Var.mo142306r2(aVar.mo55363B());
            g6Var.mo142312w2(aVar.mo55368G());
            g6Var.mo142311v2(aVar.mo55366E());
            byte[] bytes = aVar.mo55365D().mo141118z().getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            g6Var.mo142307s2(bytes);
            ISQLiteDatabase db = aVar3.mo81948a().getDB();
            if (z2) {
                StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getUPDATE(), String.valueOf(g6Var.getPrimaryKeyValue()), "MicroMsg.SDK.BaseMsgExtraInfo");
                storageObserverEvent.setObj(g6Var);
                replaceExecutor = new ReplaceExecutor(g6Var, storageObserverEvent, C102645g6.f302370B, "MicroMsg.SDK.BaseMsgExtraInfo");
            } else {
                replaceExecutor = new ReplaceExecutor(g6Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseMsgExtraInfo");
            }
            replaceExecutor.execute(db);
        }
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C39622i0 a;
        C87412m.m108594g(context, "context");
        Class cls = C57594e4.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C57594e4 e4Var = (C57594e4) a;
        e4Var.getClass();
        e4Var.mo85232c3(C86709a0.m107535s().f251807e + "MsgExtraInfo-1.db");
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101137qq(this, Looper.getMainLooper());
    }

    /* renamed from: f3 */
    public void mo57311f3() {
        C102645g6.f302370B.removeObserver(this.f292641g);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).sy0(this);
    }

    /* renamed from: g3 */
    public final C99862a mo139217g3(long j) {
        C39622i0 a;
        SelectSql q2 = C102645g6.m135569q2(j);
        Class cls = C57594e4.class;
        synchronized (C60247c.f171776h) {
            C86709a0.m107523b().mo121108c();
            if (C60247c.class.isAssignableFrom(cls)) {
                a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
            } else {
                throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
        }
        C102645g6 g6Var = (C102645g6) q2.singleQuery(((C57594e4) a).getDB(), C102645g6.class);
        if (g6Var == null) {
            g6Var = new C102645g6();
        }
        C99862a aVar = new C99862a();
        aVar.f292634f = g6Var.getLocalId();
        aVar.f292636h = g6Var.getStatus();
        aVar.f292639k = g6Var.mo142301l2();
        aVar.f292638j = g6Var.mo142305p2();
        aVar.f292637i = g6Var.mo142304o2();
        byte[] m2 = g6Var.mo142302m2();
        if (m2 != null) {
            C99889n nVar = new C99889n();
            nVar.mo141099d(new String(m2, C119027c.f356488a));
            aVar.f292635g = nVar;
        }
        return aVar;
    }

    /* renamed from: j3 */
    public final void mo139218j3(C99862a aVar, C72963f4 f4Var, boolean z) {
        String t = f4Var != null ? f4Var.mo108768t() : null;
        if (t == null) {
            t = "";
        }
        String str = t;
        long j = 0;
        long msgId = f4Var != null ? f4Var.getMsgId() : 0;
        if (f4Var != null) {
            j = f4Var.mo108774y2();
        }
        mo139219k3(aVar, str, msgId, j, z);
    }

    /* renamed from: k3 */
    public final void mo139219k3(C99862a aVar, String str, long j, long j2, boolean z) {
        C39622i0 a;
        UpdateExecutor updateExecutor;
        if (aVar != null) {
            C102645g6 g6Var = new C102645g6();
            g6Var.setLocalId(aVar.mo55364C());
            g6Var.mo142309t2(j);
            g6Var.mo142310u2(j2);
            g6Var.mo142298d(aVar.mo55367F());
            g6Var.mo142306r2(aVar.mo55363B());
            g6Var.mo142312w2(aVar.mo55368G());
            g6Var.mo142311v2(aVar.mo55366E());
            byte[] bytes = aVar.mo55365D().mo141118z().getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            g6Var.mo142307s2(bytes);
            Class cls = C57594e4.class;
            synchronized (C60247c.f171776h) {
                C86709a0.m107523b().mo121108c();
                if (C60247c.class.isAssignableFrom(cls)) {
                    a = new C54209k0((C0123n0) C86709a0.m107523b().f251755f, (C54209k0.C54210b) new C60247c.C60248a.C60249a()).mo75002a(cls);
                } else {
                    throw new IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
            }
            ISQLiteDatabase db = ((C57594e4) a).getDB();
            if (z) {
                StorageObserverEvent storageObserverEvent = new StorageObserverEvent(StorageEventId.getUPDATE(), String.valueOf(g6Var.getPrimaryKeyValue()), "MicroMsg.SDK.BaseMsgExtraInfo");
                storageObserverEvent.setObj(g6Var);
                updateExecutor = new UpdateExecutor(g6Var, storageObserverEvent, C102645g6.f302370B, "MicroMsg.SDK.BaseMsgExtraInfo");
            } else {
                updateExecutor = new UpdateExecutor(g6Var, (StorageObserverEvent<? extends IAutoDBItem>) null, (StorageObserverOwner<?>) null, "MicroMsg.SDK.BaseMsgExtraInfo");
            }
            updateExecutor.execute(db);
        }
    }

    /* renamed from: w5 */
    public void mo26106w5(C75875l lVar, C75875l.C45886e eVar) {
        if (C86709a0.m107522a()) {
            if (C87412m.m108589b(eVar != null ? eVar.f123845b : null, "delete") && eVar.f123849f > 0) {
                ArrayList<C72963f4> arrayList = eVar.f123846c;
                C87412m.m108593f(arrayList, "notifyInfo.msgList");
                ArrayList arrayList2 = new ArrayList();
                Iterator<C72963f4> it = arrayList.iterator();
                while (it.hasNext()) {
                    C72963f4 next = it.next();
                    if (next.mo101016t3()) {
                        arrayList2.add(next);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C72963f4 f4Var = (C72963f4) it4.next();
                    ((C119157j) C119157j.f356862d).mo183885p(new C99877f0(f4Var), "MicroMsg.MsgExtInfoStorageFSC_deleteFileAndTask");
                    StringBuilder sb = new StringBuilder();
                    sb.append("delete extra msg info and all cdn info. msgId: ");
                    sb.append(f4Var != null ? Long.valueOf(f4Var.getMsgId()) : null);
                    Log.m105924i("MicroMsg.MsgExtInfoStorageFSC", sb.toString());
                }
            }
        }
    }
}
