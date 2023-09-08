package xd0;

import android.os.Parcel;
import android.util.Base64;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.msgsubscription.api.ISubscribeMsgService$Companion$SubscribeMsgListWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;
import zt3.C119157j;

/* renamed from: xd0.d */
public final class C23076d implements C23073a {

    /* renamed from: a */
    public static final C23076d f66292a = new C23076d();

    /* renamed from: b */
    public static final HashMap<String, SubscribeMsgTmpItem> f66293b = new HashMap<>();

    /* renamed from: c */
    public static HashMap<String, Boolean> f66294c = new HashMap<>();

    /* renamed from: xd0.d$a */
    public static final class C23077a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<SubscribeMsgTmpItem> f66295d;

        /* renamed from: e */
        public final /* synthetic */ boolean f66296e;

        /* renamed from: f */
        public final /* synthetic */ String f66297f;

        /* renamed from: g */
        public final /* synthetic */ boolean f66298g;

        /* renamed from: h */
        public final /* synthetic */ boolean f66299h;

        /* renamed from: i */
        public final /* synthetic */ boolean f66300i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23077a(List<SubscribeMsgTmpItem> list, boolean z, String str, boolean z2, boolean z3, boolean z4) {
            super(0);
            this.f66295d = list;
            this.f66296e = z;
            this.f66297f = str;
            this.f66298g = z2;
            this.f66299h = z3;
            this.f66300i = z4;
        }

        public Object invoke() {
            List<SubscribeMsgTmpItem> list = this.f66295d;
            if (list != null) {
                String str = this.f66297f;
                boolean z = this.f66299h;
                boolean z2 = this.f66300i;
                boolean z3 = this.f66296e;
                C23076d dVar = C23076d.f66292a;
                C23075c cVar = new C23075c(z, z2, z3);
                for (SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
                    HashMap<String, SubscribeMsgTmpItem> hashMap = C23076d.f66293b;
                    C23076d dVar2 = C23076d.f66292a;
                    if (hashMap.containsKey(dVar2.mo36481b(str, subscribeMsgTmpItem.f49021f))) {
                        cVar.invoke(hashMap.get(dVar2.mo36481b(str, subscribeMsgTmpItem.f49021f)), subscribeMsgTmpItem);
                    } else {
                        hashMap.put(dVar2.mo36481b(str, subscribeMsgTmpItem.f49021f), subscribeMsgTmpItem);
                        cVar.invoke(hashMap.get(dVar2.mo36481b(str, subscribeMsgTmpItem.f49021f)), subscribeMsgTmpItem);
                    }
                }
            }
            if (this.f66296e) {
                C23076d.f66292a.mo36484e(this.f66297f, this.f66298g);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: xd0.d$b */
    public static final class C23078b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f66301d;

        /* renamed from: e */
        public final /* synthetic */ String f66302e;

        /* renamed from: f */
        public final /* synthetic */ List<SubscribeMsgTmpItem> f66303f;

        /* renamed from: g */
        public final /* synthetic */ boolean f66304g;

        public C23078b(int i, String str, List<SubscribeMsgTmpItem> list, boolean z) {
            this.f66301d = i;
            this.f66302e = str;
            this.f66303f = list;
            this.f66304g = z;
        }

        public final void run() {
            C23076d dVar = C23076d.f66292a;
            int i = this.f66301d;
            String str = this.f66302e;
            List<SubscribeMsgTmpItem> list = this.f66303f;
            boolean z = this.f66304g;
            Log.m105925i("MicroMsg.BrandSubscribeStorageManager", "alvinluo saveSubscribeMsgList bizUsername: %s, scene: %d, size: %d, isOpened: %b", str, Integer.valueOf(i), Integer.valueOf(list.size()), Boolean.valueOf(z));
            if (i == 1) {
                for (SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
                    subscribeMsgTmpItem.f49028p = true;
                }
            }
            MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(dVar.mo36482c());
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            ISubscribeMsgService$Companion$SubscribeMsgListWrapper p2 = dVar.mo36474p2(str);
            List<SubscribeMsgTmpItem> list2 = p2 != null ? p2.f49048d : null;
            ArrayList arrayList2 = new ArrayList();
            if (list2 != null) {
                for (SubscribeMsgTmpItem subscribeMsgTmpItem2 : list2) {
                    Iterator it = arrayList.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        SubscribeMsgTmpItem subscribeMsgTmpItem3 = (SubscribeMsgTmpItem) it.next();
                        subscribeMsgTmpItem3.f49028p = i == 1;
                        if (subscribeMsgTmpItem2.f49021f.equals(subscribeMsgTmpItem3.f49021f)) {
                            z2 = true;
                        }
                    }
                    if (!z2 && !subscribeMsgTmpItem2.f49028p) {
                        arrayList2.add(subscribeMsgTmpItem2);
                    }
                }
            }
            arrayList2.addAll(arrayList);
            ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = new ISubscribeMsgService$Companion$SubscribeMsgListWrapper(arrayList2, z);
            Parcel obtain = Parcel.obtain();
            C87412m.m108593f(obtain, "obtain()");
            iSubscribeMsgService$Companion$SubscribeMsgListWrapper.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            String encodeToString = Base64.encodeToString(marshall, 0);
            C87412m.m108593f(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
            mmkv.putString(str, encodeToString);
            if (MMHandlerThread.isMainThread()) {
                dVar.mo36483d(str, arrayList2);
            } else {
                MMHandlerThread.postToMainThread(new C23079f(str, arrayList2));
            }
            dVar.mo36484e(str, z);
        }
    }

    /* renamed from: a */
    public final void mo36480a(String str, List<SubscribeMsgTmpItem> list, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(mo36482c());
        ISubscribeMsgService$Companion$SubscribeMsgListWrapper p2 = mo36474p2(str);
        List<SubscribeMsgTmpItem> list2 = p2 != null ? p2.f49048d : null;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
                if (list2 != null) {
                    z5 = false;
                    for (SubscribeMsgTmpItem subscribeMsgTmpItem2 : list2) {
                        if (subscribeMsgTmpItem2.f49021f.equals(subscribeMsgTmpItem.f49021f)) {
                            if (z2) {
                                subscribeMsgTmpItem2.f49025j = subscribeMsgTmpItem.f49025j;
                            }
                            if (z4) {
                                Log.m105925i("MicroMsg.BrandSubscribeStorageManager", "alvinluo doSaveSubscribeStatus timestamp: %s", Long.valueOf(subscribeMsgTmpItem.f49027o));
                                subscribeMsgTmpItem2.f49027o = subscribeMsgTmpItem.f49027o;
                            }
                            subscribeMsgTmpItem2.f49033u = subscribeMsgTmpItem.f49033u;
                            z5 = true;
                        }
                    }
                } else {
                    z5 = false;
                }
                if (!z5) {
                    arrayList.add(subscribeMsgTmpItem);
                }
            }
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        Log.m105925i("MicroMsg.BrandSubscribeStorageManager", "alvinluo saveSubscribeMsgUiStatus finalList: %d, switchOpen: %b, needUpateSwitchOpen: %b", Integer.valueOf(arrayList.size()), Boolean.valueOf(z), Boolean.valueOf(z3));
        ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = new ISubscribeMsgService$Companion$SubscribeMsgListWrapper(arrayList, z3 ? z : p2 != null ? p2.f49049e : false);
        Parcel obtain = Parcel.obtain();
        C87412m.m108593f(obtain, "obtain()");
        iSubscribeMsgService$Companion$SubscribeMsgListWrapper.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        String encodeToString = Base64.encodeToString(marshall, 0);
        C87412m.m108593f(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        String str2 = str;
        mmkv.putString(str, encodeToString);
        C23077a aVar = new C23077a(list, z3, str, z, z2, z4);
        if (MMHandlerThread.isMainThread()) {
            aVar.invoke();
        } else {
            ((C119157j) C119157j.f356862d).mo183895z(new C38485e(aVar));
        }
    }

    /* renamed from: b */
    public final String mo36481b(String str, String str2) {
        return str + str2;
    }

    /* renamed from: c */
    public final String mo36482c() {
        return C86709a0.m107523b().mo121111i() + "_subscribe_msg_storage";
    }

    /* renamed from: d */
    public final void mo36483d(String str, List<SubscribeMsgTmpItem> list) {
        for (SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
            f66293b.put(f66292a.mo36481b(str, subscribeMsgTmpItem.f49021f), subscribeMsgTmpItem);
        }
    }

    /* renamed from: e */
    public final void mo36484e(String str, boolean z) {
        Log.m105925i("MicroMsg.BrandSubscribeStorageManager", "alvinluo updateSwitchOpen: %b", Boolean.valueOf(z));
        f66294c.put(str, Boolean.valueOf(z));
    }

    /* renamed from: n2 */
    public void mo36472n2() {
        Log.m105924i("MicroMsg.BrandSubscribeStorageManager", "alvinluo SubscribeMsg clearStorage");
        MultiProcessMMKV.getMMKV(mo36482c()).clear();
    }

    /* renamed from: o2 */
    public void mo36473o2(int i, String str, List<SubscribeMsgTmpItem> list, boolean z) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(list, "subscribeMsgList");
        ((C119157j) C119157j.f356862d).mo183876g(new C23078b(i, str, list, z), "SubscribeMsgSaveTag");
    }

    /* renamed from: p2 */
    public ISubscribeMsgService$Companion$SubscribeMsgListWrapper mo36474p2(String str) {
        C87412m.m108594g(str, "bizUsername");
        Log.m105927v("MicroMsg.BrandSubscribeStorageManager", "alvinluo getSubscribeMsgListWrapper bizUsername: %s, hashCode: %s", str, Integer.valueOf(hashCode()));
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV(mo36482c());
        try {
            String string = mmkv.getString(str, (String) null);
            if (string == null) {
                return null;
            }
            ISubscribeMsgService$Companion$SubscribeMsgListWrapper.C17809a aVar = ISubscribeMsgService$Companion$SubscribeMsgListWrapper.CREATOR;
            C87412m.m108594g(aVar, "creator");
            byte[] decode = Base64.decode(string, 0);
            Parcel obtain = Parcel.obtain();
            C87412m.m108593f(obtain, "obtain()");
            obtain.unmarshall(decode, 0, decode.length);
            obtain.setDataPosition(0);
            Object createFromParcel = aVar.createFromParcel(obtain);
            obtain.recycle();
            ISubscribeMsgService$Companion$SubscribeMsgListWrapper iSubscribeMsgService$Companion$SubscribeMsgListWrapper = (ISubscribeMsgService$Companion$SubscribeMsgListWrapper) createFromParcel;
            List<T> B0 = C110818d0.m150900B0(iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f49048d);
            if (MMHandlerThread.isMainThread()) {
                mo36483d(str, B0);
            } else {
                MMHandlerThread.postToMainThread(new C23079f(str, B0));
            }
            mo36484e(str, iSubscribeMsgService$Companion$SubscribeMsgListWrapper.f49049e);
            return iSubscribeMsgService$Companion$SubscribeMsgListWrapper;
        } catch (Exception unused) {
            mmkv.putString(str, (String) null);
            return null;
        }
    }

    /* renamed from: q2 */
    public void mo36475q2(String str, List<SubscribeMsgTmpItem> list, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(str, "bizUsername");
        Object[] objArr = new Object[5];
        objArr[0] = str;
        objArr[1] = list != null ? Integer.valueOf(list.size()) : null;
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = Boolean.valueOf(z2);
        objArr[4] = Boolean.valueOf(z3);
        Log.m105925i("MicroMsg.BrandSubscribeStorageManager", "alvinluo saveSubscribeMsgSubscribeStatus bizUsername: %s, size: %s, switchOpened: %b, needUpdateSwitchOpen: %b, needUpdateTimestamp: %b", objArr);
        mo36480a(str, list, z, true, z2, z3);
    }

    /* renamed from: r2 */
    public boolean mo36476r2(String str) {
        C87412m.m108594g(str, "bizUsername");
        Boolean bool = f66294c.get(str);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: s2 */
    public void mo36477s2(String str, List<SubscribeMsgTmpItem> list) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(list, "subscribeMsgList");
        Log.m105925i("MicroMsg.BrandSubscribeStorageManager", "alvinluo updateSubscribeMsgUiStatusTimestamp bizUsername: %s, size: %s", str, Integer.valueOf(list.size()));
        mo36480a(str, list, false, false, false, true);
    }

    /* renamed from: t2 */
    public SubscribeMsgTmpItem mo36478t2(String str, String str2) {
        C87412m.m108594g(str, "bizUsername");
        C87412m.m108594g(str2, "templateId");
        return f66293b.get(mo36481b(str, str2));
    }
}
