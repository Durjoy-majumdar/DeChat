package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import mu3.C109639a;
import s20.C90122a;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.v */
public final class C81531v extends C86301e implements C68587i1 {

    /* renamed from: d */
    public final MStorage f239143d = new C81532a();

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.v$a */
    public class C81532a extends MStorage {

        /* renamed from: d */
        public final Set<MStorage.IOnStorageChange> f239144d = new HashSet();

        /* renamed from: com.tencent.mm.plugin.appbrand.appusage.v$a$a */
        public class C81533a implements C1256g<Parcel> {
            public C81533a() {
            }

            /* renamed from: a */
            public void mo894a(Object obj) {
                Parcel parcel = (Parcel) obj;
                C81531v.this.doNotify(parcel.readString(), parcel.readInt(), parcel.readString());
            }
        }

        public C81532a() {
        }

        public void add(MStorage.IOnStorageChange iOnStorageChange) {
            add(iOnStorageChange, Looper.getMainLooper());
        }

        public void remove(MStorage.IOnStorageChange iOnStorageChange) {
            if (iOnStorageChange != null) {
                super.remove(iOnStorageChange);
                synchronized (this.f239144d) {
                    ((HashSet) this.f239144d).remove(iOnStorageChange);
                }
            }
        }

        public void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper) {
            boolean z;
            if (iOnStorageChange != null && looper != null) {
                super.add(iOnStorageChange, looper);
                synchronized (this.f239144d) {
                    ((HashSet) this.f239144d).add(iOnStorageChange);
                    z = true;
                    if (((HashSet) this.f239144d).size() != 1) {
                        z = false;
                    }
                }
                if (z) {
                    XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C81536d.class, new C81533a());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.v$b */
    public static final class C81534b implements C80916r<IPCVoid, IPCInteger> {
        private C81534b() {
        }

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            try {
                return new IPCInteger(((C68587i1) C86312j.m106911c(C68587i1.class)).getCount());
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandLocalUsageStorageIPCImpl", e, "ipc getCount", new Object[0]);
                return new IPCInteger(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.v$c */
    public static final class C81535c implements C80916r<Bundle, Parcel> {
        private C81535c() {
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            Class cls = C68587i1.class;
            int i = bundle.getInt("count");
            int i2 = bundle.getInt("versionType", Integer.MAX_VALUE);
            long j = bundle.getLong("maxUpdateTime", MAlarmHandler.NEXT_FIRE_INTERVAL);
            Parcel obtain = Parcel.obtain();
            if (j != MAlarmHandler.NEXT_FIRE_INTERVAL) {
                try {
                    obtain.writeTypedList(((C68587i1) C86312j.m106911c(cls)).mo94250gC(j, i));
                } catch (Exception unused) {
                    obtain.setDataPosition(0);
                    obtain.writeTypedList((List) null);
                }
            } else {
                obtain.writeTypedList(((C68587i1) C86312j.m106911c(cls)).mo94249Xs(i, i2));
            }
            return obtain;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.v$d */
    public static final class C81536d implements C80883e<IPCVoid, Parcel> {
        private C81536d() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C29396w wVar = new C29396w(this, gVar);
            ((C68587i1) C86312j.m106911c(C68587i1.class)).add(wVar);
            ((C90122a) gVar).mo112675d(new C81541x(this, wVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.v$e */
    public static final class C81537e implements C80916r<AppIdentity, IPCBoolean> {
        private C81537e() {
        }

        public Object invoke(Object obj) {
            AppIdentity appIdentity = (AppIdentity) obj;
            try {
                return new IPCBoolean(((C68587i1) C86312j.m106911c(C68587i1.class)).mo94252nw(appIdentity.f239038d, appIdentity.f239039e));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrandLocalUsageStorageIPCImpl", e, "ipc removeUsage", new Object[0]);
                return new IPCBoolean(false);
            }
        }
    }

    public List<LocalUsageInfo> Oe0(int i) {
        return mo94249Xs(i, Integer.MAX_VALUE);
    }

    /* renamed from: Xs */
    public List<LocalUsageInfo> mo94249Xs(int i, int i2) {
        return vx0(i, i2, MAlarmHandler.NEXT_FIRE_INTERVAL);
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        add(iOnStorageChange, Looper.getMainLooper());
    }

    public void addLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f239143d.addLoadedListener(iOnStorageLoaded);
    }

    public void doNotify() {
        this.f239143d.doNotify();
    }

    /* renamed from: gC */
    public List<LocalUsageInfo> mo94250gC(long j, int i) {
        return vx0(i, Integer.MAX_VALUE, j);
    }

    public int getCount() {
        IPCInteger iPCInteger = (IPCInteger) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C81534b.class);
        if (iPCInteger == null) {
            return 0;
        }
        return iPCInteger.f10313d;
    }

    public void lock() {
        this.f239143d.lock();
    }

    public int lockCount() {
        return this.f239143d.lockCount();
    }

    /* renamed from: nw */
    public boolean mo94252nw(String str, int i) {
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new AppIdentity(str, i), C81537e.class);
        if (iPCBoolean == null) {
            return false;
        }
        return iPCBoolean.f10312d;
    }

    public void remove(MStorage.IOnStorageChange iOnStorageChange) {
        this.f239143d.remove(iOnStorageChange);
    }

    public void removeLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f239143d.removeLoadedListener(iOnStorageLoaded);
    }

    public void unlock() {
        this.f239143d.unlock();
    }

    public final List<LocalUsageInfo> vx0(int i, int i2, long j) {
        Bundle bundle = new Bundle();
        bundle.putInt("count", i);
        bundle.putInt("versionType", i2);
        bundle.putLong("maxUpdateTime", j);
        Parcel parcel = (Parcel) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, bundle, C81535c.class);
        if (parcel == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        parcel.readTypedList(arrayList, LocalUsageInfo.CREATOR);
        return arrayList;
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper) {
        this.f239143d.add(iOnStorageChange, looper);
    }

    public void doNotify(String str) {
        this.f239143d.doNotify(str);
    }

    public void add(String str, MStorage.IOnStorageChange iOnStorageChange) {
        this.f239143d.add(str, iOnStorageChange);
    }

    public void doNotify(String str, int i, Object obj) {
        this.f239143d.doNotify(str, i, obj);
    }

    public void add(C109639a aVar, MStorage.IOnStorageChange iOnStorageChange) {
        this.f239143d.add(aVar, iOnStorageChange);
    }
}
