package com.tencent.p014mm.plugin.appbrand.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.ipc.C81964j;
import com.tencent.p014mm.plugin.appbrand.jsapi.h5_interact.SendDataToMiniProgramFromH5Event;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83105a;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kr0.C10403n0;
import lp3.C88633e;
import lp3.C88643g;
import nr3.C89059e;
import nr3.C89060f;
import org.json.JSONObject;
import p210o.C11323a;
import x20.C15618a;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess */
public final class ServiceForWebViewAnyProcess extends C81152d1 {

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Parcel;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$a */
    public static final class C1504a implements C80883e<Parcel, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            Parcel parcel = (Parcel) obj;
            if (parcel != null) {
                try {
                    ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                    if (createStringArrayList != null) {
                        ((C10403n0) C86312j.m106911c(C10403n0.class)).a30(createStringArrayList);
                    }
                } catch (Exception unused) {
                }
            }
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$d;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$d */
    public static final class C1505d implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10718hK(iPCString != null ? iPCString.f10315d : null);
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$e;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Parcel;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$e */
    public static final class C1506e implements C80916r<Parcel, IPCVoid> {
        public Object invoke(Object obj) {
            Parcel parcel = (Parcel) obj;
            if (parcel != null) {
                ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10719kK(parcel.readString(), parcel.readString());
            }
            IPCVoid iPCVoid = IPCVoid.f10316d;
            C87412m.m108593f(iPCVoid, "VOID");
            return iPCVoid;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$h */
    public static final class C1507h<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C1507h<InputType, ResultType> f10861d = new C1507h<>();

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            String str = iPCString != null ? iPCString.f10315d : null;
            if (!(str == null || str.length() == 0)) {
                ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10722vN(str, new C1509j1(gVar));
            } else if (gVar != null) {
                gVar.mo894a(new IPCString("fail invalid appId"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$i */
    public static final class C1508i<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C11323a<String, Boolean> f10862d;

        public C1508i(C11323a<String, Boolean> aVar) {
            this.f10862d = aVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCString iPCString = (IPCString) obj;
            C11323a<String, Boolean> aVar = this.f10862d;
            if (aVar != null) {
                Boolean apply = aVar.apply(iPCString != null ? iPCString.f10315d : null);
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult */
    public static final class IPCReportMiniProgramPageDataResult implements Parcelable {
        public static final Parcelable.Creator<IPCReportMiniProgramPageDataResult> CREATOR = new C81138a();

        /* renamed from: d */
        public final int f238450d;

        /* renamed from: e */
        public final boolean f238451e;

        /* renamed from: f */
        public final String f238452f;

        /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult$a */
        public static final class C81138a implements Parcelable.Creator<IPCReportMiniProgramPageDataResult> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new IPCReportMiniProgramPageDataResult(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
            }

            public Object[] newArray(int i) {
                return new IPCReportMiniProgramPageDataResult[i];
            }
        }

        public IPCReportMiniProgramPageDataResult(int i, boolean z, String str) {
            this.f238450d = i;
            this.f238451e = z;
            this.f238452f = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IPCReportMiniProgramPageDataResult)) {
                return false;
            }
            IPCReportMiniProgramPageDataResult iPCReportMiniProgramPageDataResult = (IPCReportMiniProgramPageDataResult) obj;
            return this.f238450d == iPCReportMiniProgramPageDataResult.f238450d && this.f238451e == iPCReportMiniProgramPageDataResult.f238451e && C87412m.m108589b(this.f238452f, iPCReportMiniProgramPageDataResult.f238452f);
        }

        public int hashCode() {
            int i = this.f238450d * 31;
            boolean z = this.f238451e;
            if (z) {
                z = true;
            }
            int i2 = (i + (z ? 1 : 0)) * 31;
            String str = this.f238452f;
            return i2 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "IPCReportMiniProgramPageDataResult(reportId=" + this.f238450d + ", isSucceed=" + this.f238451e + ", errMsg=" + this.f238452f + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f238450d);
            parcel.writeInt(this.f238451e ? 1 : 0);
            parcel.writeString(this.f238452f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$b */
    public static final class C81139b {
        public C81139b(C8480h hVar) {
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$c;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$IPCReportMiniProgramPageDataResult;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$c */
    public static final class C81140c implements C1255d<IPCString, IPCReportMiniProgramPageDataResult> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            String str = iPCString != null ? iPCString.f10315d : null;
            if (str != null) {
                ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10715TP(str).mo114038a(new C81165h1(gVar)).mo123065b(new C81166i1(gVar));
            } else if (gVar != null) {
                gVar.mo894a(new IPCReportMiniProgramPageDataResult(0, false, "invalid appId"));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/app/ServiceForWebViewAnyProcess$f;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/appbrand/jsapi/h5_interact/SendDataToMiniProgramFromH5Event;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$f */
    public static final class C81141f implements C80883e<SendDataToMiniProgramFromH5Event, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            SendDataToMiniProgramFromH5Event sendDataToMiniProgramFromH5Event = (SendDataToMiniProgramFromH5Event) obj;
            if (sendDataToMiniProgramFromH5Event != null) {
                C81964j.m100679b(sendDataToMiniProgramFromH5Event.f241627d, sendDataToMiniProgramFromH5Event);
            }
            if (gVar != null) {
                gVar.mo894a(IPCVoid.f10316d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$g */
    public static final class C81142g<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ Parcel f238453d;

        public C81142g(Parcel parcel) {
            this.f238453d = parcel;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            this.f238453d.recycle();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.app.ServiceForWebViewAnyProcess$j */
    public static final class C81143j<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ String f238454a;

        public C81143j(String str) {
            this.f238454a = str;
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            String str = this.f238454a;
            boolean z = false;
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (z) {
                C88643g.m110544b().mo72091a("invalid appId");
            } else {
                C15618a.m14626b(new IPCString(this.f238454a), new C81140c(), new C81167k1(C88643g.m110545c()));
            }
            return 0;
        }
    }

    static {
        new C81139b((C8480h) null);
    }

    /* renamed from: TP */
    public C88633e<Integer> mo10715TP(String str) {
        C89059e<Void> a = C89060f.m111322a();
        a.mo123420E(new C81143j(str));
        return a;
    }

    public void a30(List<String> list) {
        if (list != null) {
            Parcel obtain = Parcel.obtain();
            obtain.setDataPosition(0);
            obtain.writeStringList(list);
            obtain.setDataPosition(0);
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, obtain, C1504a.class, new C81142g(obtain));
        }
    }

    /* renamed from: hK */
    public void mo10718hK(String str) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(str), C1505d.class, (C1256g) null);
    }

    /* renamed from: kK */
    public void mo10719kK(String str, String str2) {
        if (str2 != null && str != null) {
            Parcel obtain = Parcel.obtain();
            obtain.setDataPosition(0);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.setDataPosition(0);
            try {
                IPCVoid iPCVoid = (IPCVoid) XIPCInvoker.m98749b(WeChatProcess.PROCESS_MAIN, obtain, C1506e.class);
            } finally {
                obtain.recycle();
            }
        }
    }

    public void li0(String str, String str2, int i) {
        String str3 = WeChatProcess.PROCESS_MAIN;
        SendDataToMiniProgramFromH5Event sendDataToMiniProgramFromH5Event = new SendDataToMiniProgramFromH5Event();
        sendDataToMiniProgramFromH5Event.f241627d = str;
        sendDataToMiniProgramFromH5Event.f241628e = str2;
        sendDataToMiniProgramFromH5Event.f241629f = i;
        XIPCInvoker.m98748a(str3, sendDataToMiniProgramFromH5Event, C81141f.class, (C1256g) null);
    }

    /* renamed from: rJ */
    public void mo10721rJ(int i, String str, Object obj) {
        C40478h hVar;
        SparseArray<C40478h> sparseArray = C83105a.f242910a;
        synchronized (sparseArray) {
            hVar = sparseArray.get(i);
        }
        if (hVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("htmlId", hVar.getCoverViewId());
            jSONObject.put("name", str);
            jSONObject.put("arg", obj);
            hVar.mo63248m0(jSONObject);
        }
    }

    /* renamed from: vN */
    public void mo10722vN(String str, C11323a<String, Boolean> aVar) {
        C15618a.m14626b(new IPCString(str), C1507h.f10861d, new C1508i(aVar));
    }
}
