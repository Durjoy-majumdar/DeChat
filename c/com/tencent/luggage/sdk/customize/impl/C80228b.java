package com.tencent.luggage.sdk.customize.impl;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import junit.framework.Assert;
import kotlin.Metadata;
import rk0.C89996i;
import u20.C90594b;

/* renamed from: com.tencent.luggage.sdk.customize.impl.b */
public final class C80228b implements C89996i {

    /* renamed from: d */
    public static final C80228b f234902d = new C80228b();

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.luggage.sdk.customize.impl.b$a */
    public static final class C80229a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C80229a<InputType, ResultType> f234903a = new C80229a<>();

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            boolean gx02 = C80233c.f234907e.gx0();
            Log.m105924i("MicroMsg.AppBrand.LuggageBLEScanStats", "invoke, isScanningTooFrequently, isTooFrequently: " + gx02);
            return new IPCBoolean(gx02);
        }
    }

    @Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.luggage.sdk.customize.impl.b$b */
    public static final class C80230b<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C80230b<InputType, ResultType> f234904a = new C80230b<>();

        public Object invoke(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            int pa = C80233c.f234907e.mo56171pa();
            Log.m105924i("MicroMsg.AppBrand.LuggageBLEScanStats", "invoke, recordScanStart, id: " + pa);
            return new IPCInteger(pa);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCInteger;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.luggage.sdk.customize.impl.b$c */
    public static final class C80231c<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C80231c<InputType, ResultType> f234905d = new C80231c<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCInteger iPCInteger = (IPCInteger) obj;
            int i = iPCInteger != null ? iPCInteger.f10313d : -1;
            Log.m105924i("MicroMsg.AppBrand.LuggageBLEScanStats", "invoke, recordScanStop, id: " + i);
            C80233c.f234907e.mo56170ja(i);
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    /* renamed from: com.tencent.luggage.sdk.customize.impl.b$d */
    public static final class C80232d<T> implements C1256g {

        /* renamed from: d */
        public static final C80232d<T> f234906d = new C80232d<>();

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Log.m105924i("MicroMsg.AppBrand.LuggageBLEScanStats", "onCallback, recordScanStop");
        }
    }

    public boolean gx0() {
        Assert.assertTrue(C90594b.m113493a(C80229a.f234903a.getClass()));
        IPCBoolean iPCBoolean = (IPCBoolean) XIPCInvoker.m98749b(MMApplicationContext.getApplicationId(), null, C80229a.class);
        boolean z = iPCBoolean != null ? iPCBoolean.f10312d : false;
        Log.m105924i("MicroMsg.AppBrand.LuggageBLEScanStats", "isScanningTooFrequently#Agent, isTooFrequently: " + z);
        return z;
    }

    /* renamed from: ja */
    public void mo56170ja(int i) {
        IPCInteger iPCInteger = new IPCInteger(i);
        C80231c<InputType, ResultType> cVar = C80231c.f234905d;
        C80232d<T> dVar = C80232d.f234906d;
        Assert.assertTrue(C90594b.m113493a(cVar.getClass()));
        XIPCInvoker.m98748a(MMApplicationContext.getApplicationId(), iPCInteger, cVar.getClass(), dVar);
    }

    /* renamed from: pa */
    public int mo56171pa() {
        Assert.assertTrue(C90594b.m113493a(C80230b.f234904a.getClass()));
        IPCInteger iPCInteger = (IPCInteger) XIPCInvoker.m98749b(MMApplicationContext.getApplicationId(), null, C80230b.class);
        int i = iPCInteger != null ? iPCInteger.f10313d : -1;
        Log.m105924i("MicroMsg.AppBrand.LuggageBLEScanStats", "recordScanStart#Agent, id: " + i);
        return i;
    }
}
