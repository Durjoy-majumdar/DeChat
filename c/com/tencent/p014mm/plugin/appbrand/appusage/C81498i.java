package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Looper;
import android.os.Parcel;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.appusage.C68585h1;
import com.tencent.p014mm.plugin.appbrand.appusage.C81504j;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.storage.IStorage;
import com.tencent.p014mm.sdk.storage.MStorage;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mu3.C109639a;
import x20.C15618a;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND})
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.i */
public final class C81498i extends C86301e implements C68585h1, IStorage {

    /* renamed from: d */
    public final /* synthetic */ C81504j.C81505a f239098d = C81504j.f239105a;

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/plugin/appbrand/appusage/AppIdentity;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.appbrand.appusage.i$a */
    public static final class C81499a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C81499a<InputType, ResultType> f239099a = new C81499a<>();

        public Object invoke(Object obj) {
            boolean z;
            AppIdentity appIdentity = (AppIdentity) obj;
            if (!C86709a0.m107522a() || appIdentity == null) {
                z = false;
            } else {
                C81504j.C81505a aVar = C81504j.f239105a;
                z = ((C68585h1) C86312j.m106911c(C68585h1.class)).mo94240G7(appIdentity.f239038d, appIdentity.f239039e);
            }
            return new IPCBoolean(z);
        }
    }

    public boolean Fq0(List<LocalUsageInfo> list, int i) {
        return false;
    }

    /* renamed from: G7 */
    public boolean mo94240G7(String str, int i) {
        IPCBoolean iPCBoolean;
        if (!(str == null || str.length() == 0) && (iPCBoolean = (IPCBoolean) C15618a.m14628d(new AppIdentity(str, i), C81499a.f239099a)) != null) {
            return iPCBoolean.f10312d;
        }
        return false;
    }

    /* renamed from: Tk */
    public int mo94241Tk() {
        IPCInteger iPCInteger = (IPCInteger) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C81513m1.class);
        return iPCInteger != null ? iPCInteger.f10313d : C81506j0.m99996a();
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange) {
        this.f239098d.add(iOnStorageChange);
    }

    public void add(MStorage.IOnStorageChange iOnStorageChange, Looper looper) {
        this.f239098d.add(iOnStorageChange, looper);
    }

    public void add(String str, MStorage.IOnStorageChange iOnStorageChange) {
        this.f239098d.add(str, iOnStorageChange);
    }

    public void add(C109639a aVar, MStorage.IOnStorageChange iOnStorageChange) {
        this.f239098d.add(aVar, iOnStorageChange);
    }

    public void addLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f239098d.addLoadedListener(iOnStorageLoaded);
    }

    public void doNotify() {
        this.f239098d.doNotify();
    }

    public void doNotify(String str) {
        this.f239098d.doNotify(str);
    }

    public void doNotify(String str, int i, Object obj) {
        this.f239098d.doNotify(str, i, obj);
    }

    public int getCount() {
        IPCInteger iPCInteger = (IPCInteger) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C81525s0.class);
        if (iPCInteger != null) {
            return iPCInteger.f10313d;
        }
        return 0;
    }

    /* renamed from: l8 */
    public boolean mo94243l8(String str, int i) {
        IPCBoolean iPCBoolean;
        if (!(str == null || str.length() == 0) && (iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new AppIdentity(str, i), C81509l1.class)) != null) {
            return iPCBoolean.f10312d;
        }
        return false;
    }

    public void lock() {
        this.f239098d.lock();
    }

    public int lockCount() {
        return this.f239098d.lockCount();
    }

    /* renamed from: mJ */
    public boolean mo94244mJ(String str, int i) {
        IPCBoolean iPCBoolean;
        if (!(str == null || str.length() == 0) && (iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new AppIdentity(str, i), C81520p1.class)) != null) {
            return iPCBoolean.f10312d;
        }
        return false;
    }

    /* renamed from: pM */
    public List<LocalUsageInfo> mo94245pM(int i, C68585h1.C68586a aVar) {
        return tl0(i, aVar, Integer.MAX_VALUE);
    }

    public void remove(MStorage.IOnStorageChange iOnStorageChange) {
        this.f239098d.remove(iOnStorageChange);
    }

    public void removeLoadedListener(MStorage.IOnStorageLoaded iOnStorageLoaded) {
        this.f239098d.removeLoadedListener(iOnStorageLoaded);
    }

    public int rg0(String str, int i) {
        IPCInteger iPCInteger;
        if (!(str == null || str.length() == 0) && (iPCInteger = (IPCInteger) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new AppIdentity(str, i), C81467a.class)) != null) {
            return iPCInteger.f10313d;
        }
        return -1;
    }

    public List<LocalUsageInfo> tl0(int i, C68585h1.C68586a aVar, int i2) {
        Parcel parcel = (Parcel) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, new QueryParams(i, aVar, i2), C81518o1.class);
        if (parcel == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, LocalUsageInfo.CREATOR);
        return arrayList;
    }

    public void unlock() {
        this.f239098d.unlock();
    }
}
