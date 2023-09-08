package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.opensdk.channel.MMessageActV2;
import com.tencent.p014mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hu0.C87593a;
import kotlin.Metadata;
import nr3.C89059e;
import ob0.C89132b;
import te3.a75;
import x20.C15618a;
import yq0.C91548e;

/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess */
public final class NewSDKInvokeProcess implements C83596o {

    /* renamed from: a */
    public final C83588k f244075a;

    /* renamed from: b */
    public WechatNativeExtraDataInvokeFunctionalPage f244076b;

    /* renamed from: c */
    public final int f244077c = (hashCode() & 65535);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData */
    public static final class NewSdkInvokeBackData implements Parcelable {
        public static final Parcelable.Creator<NewSdkInvokeBackData> CREATOR = new C83549a();

        /* renamed from: d */
        public final WechatNativeExtraDataInvokeFunctionalPage f244078d;

        /* renamed from: e */
        public final String f244079e;

        /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$NewSdkInvokeBackData$a */
        public static final class C83549a implements Parcelable.Creator<NewSdkInvokeBackData> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new NewSdkInvokeBackData(WechatNativeExtraDataInvokeFunctionalPage.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new NewSdkInvokeBackData[i];
            }
        }

        public NewSdkInvokeBackData(WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage, String str) {
            C87412m.m108594g(wechatNativeExtraDataInvokeFunctionalPage, "invokeReq");
            this.f244078d = wechatNativeExtraDataInvokeFunctionalPage;
            this.f244079e = str;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewSdkInvokeBackData)) {
                return false;
            }
            NewSdkInvokeBackData newSdkInvokeBackData = (NewSdkInvokeBackData) obj;
            return C87412m.m108589b(this.f244078d, newSdkInvokeBackData.f244078d) && C87412m.m108589b(this.f244079e, newSdkInvokeBackData.f244079e);
        }

        public int hashCode() {
            int hashCode = this.f244078d.hashCode() * 31;
            String str = this.f244079e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "NewSdkInvokeBackData(invokeReq=" + this.f244078d + ", backData=" + this.f244079e + ')';
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            this.f244078d.writeToParcel(parcel, i);
            parcel.writeString(this.f244079e);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$a */
    public static final class C83550a<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C83550a<InputType, ResultType> f244080d = new C83550a<>();

        /* renamed from: a */
        public static void m102543a(NewSdkInvokeBackData newSdkInvokeBackData, C1256g gVar, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            C87593a aVar = C87593a.f253677a;
            String str2 = newSdkInvokeBackData.f244078d.f244091d;
            C87412m.m108591d(str2);
            aVar.mo122047a(str2);
            Bundle bundle = new Bundle();
            WXLaunchWxaRedirectingPage.Resp resp = new WXLaunchWxaRedirectingPage.Resp(Bundle.EMPTY);
            String str3 = newSdkInvokeBackData.f244078d.f244091d;
            C87412m.m108591d(str3);
            resp.invokeTicket = str3;
            resp.callbackActivity = newSdkInvokeBackData.f244078d.f244098n;
            resp.errStr = str;
            resp.toBundle(bundle);
            C72688j0.m85021g(bundle);
            C72688j0.m85022h(bundle);
            Context context = MMApplicationContext.getContext();
            MMessageActV2.Args args = new MMessageActV2.Args();
            args.targetPkgName = newSdkInvokeBackData.f244078d.f244097j;
            args.bundle = bundle;
            C72688j0.m85024j(args);
            MMessageActV2.send(context, args);
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }

        public void invoke(Object obj, C1256g gVar) {
            NewSdkInvokeBackData newSdkInvokeBackData = (NewSdkInvokeBackData) obj;
            String str = newSdkInvokeBackData.f244078d.f244091d;
            C87412m.m108591d(str);
            C89059e<C89132b.C89134c<a75>> i = new C40491a(str, 3, newSdkInvokeBackData.f244079e, (C8480h) null).mo9225i();
            i.mo114038a(new C83598r(newSdkInvokeBackData, gVar));
            i.mo123065b(new C83599s(newSdkInvokeBackData, gVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$b */
    public static final class C83551b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ NewSDKInvokeProcess f244081d;

        public C83551b(NewSDKInvokeProcess newSDKInvokeProcess) {
            this.f244081d = newSDKInvokeProcess;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            C83588k kVar = this.f244081d.f244075a;
            kVar.mo113176H1(new C83593l(kVar, kVar.mo113026R()));
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/NewSDKInvokeProcess$NewSdkInvokeBackData;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$c */
    public static final class C83552c<InputType, ResultType> implements C1255d {

        /* renamed from: d */
        public static final C83552c<InputType, ResultType> f244082d = new C83552c<>();

        public void invoke(Object obj, C1256g gVar) {
            NewSdkInvokeBackData newSdkInvokeBackData = (NewSdkInvokeBackData) obj;
            String str = newSdkInvokeBackData.f244078d.f244091d;
            C87412m.m108591d(str);
            new C40491a(str, 3, newSdkInvokeBackData.f244079e, (C8480h) null).mo9225i();
            if (gVar != null) {
                C15618a.m14625a(gVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$d */
    public static final class C83553d implements C91548e.C91554e {

        /* renamed from: a */
        public final /* synthetic */ C32224a<String> f244083a;

        /* renamed from: b */
        public final /* synthetic */ NewSDKInvokeProcess f244084b;

        /* renamed from: c */
        public final /* synthetic */ String f244085c;

        /* renamed from: d */
        public final /* synthetic */ String f244086d;

        public C83553d(C32224a<String> aVar, NewSDKInvokeProcess newSDKInvokeProcess, String str, String str2) {
            this.f244083a = aVar;
            this.f244084b = newSDKInvokeProcess;
            this.f244085c = str;
            this.f244086d = str2;
        }

        /* renamed from: a */
        public void mo115867a() {
            this.f244083a.invoke();
        }

        /* renamed from: b */
        public void mo115868b(String str) {
            NewSDKInvokeProcess newSDKInvokeProcess = this.f244084b;
            String str2 = this.f244085c;
            StringBuilder sb = new StringBuilder();
            sb.append("fail ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            newSDKInvokeProcess.mo115859d(str2, C1931d.m1941a(sb.toString(), this.f244086d));
        }

        public void onCancel() {
            this.f244084b.mo115859d(this.f244085c, C1931d.m1941a("fail:auth canceled", this.f244086d));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$e */
    public static final class C83554e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C1938p f244087d;

        /* renamed from: e */
        public final /* synthetic */ String f244088e;

        /* renamed from: f */
        public final /* synthetic */ String f244089f;

        /* renamed from: g */
        public final /* synthetic */ NewSDKInvokeProcess f244090g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83554e(C1938p pVar, String str, String str2, NewSDKInvokeProcess newSDKInvokeProcess) {
            super(0);
            this.f244087d = pVar;
            this.f244088e = str;
            this.f244089f = str2;
            this.f244090g = newSDKInvokeProcess;
        }

        public Object invoke() {
            C1938p pVar = this.f244087d;
            C87412m.m108592e(pVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponentImpl");
            return ((C82510g) pVar).mo114844O(this.f244088e, this.f244089f, "", this.f244090g.f244077c);
        }
    }

    public NewSDKInvokeProcess(C83588k kVar) {
        C87412m.m108594g(kVar, "runtime");
        this.f244075a = kVar;
    }

    /* renamed from: a */
    public void mo115856a(C1938p pVar, int i, String str) {
        C87412m.m108594g(pVar, "component");
        C87412m.m108594g(str, "data");
        Log.m105924i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "onCallback, instance(" + hashCode() + ", callbackId(" + i + "), data(" + str + ')');
        if (this.f244077c == i) {
            WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage = this.f244076b;
            if (wechatNativeExtraDataInvokeFunctionalPage != null) {
                mo115859d(wechatNativeExtraDataInvokeFunctionalPage.f244099o, str);
            } else {
                C87412m.m108603p("newSdkInvokeArgs");
                throw null;
            }
        }
    }

    /* renamed from: b */
    public void mo115857b(C1938p pVar, int i, String str) {
        C87412m.m108594g(pVar, "component");
        C87412m.m108594g(str, "callbackStr");
        Log.m105924i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "onPayAheadCallback, instance(" + hashCode() + ", callbackId(" + i + "), callbackStr(" + str + ')');
        WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage = this.f244076b;
        if (wechatNativeExtraDataInvokeFunctionalPage != null) {
            C15618a.m14627c(new NewSdkInvokeBackData(wechatNativeExtraDataInvokeFunctionalPage, str), C83552c.f244082d, (C1256g) null, 4, (Object) null);
        } else {
            C87412m.m108603p("newSdkInvokeArgs");
            throw null;
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [com.tencent.mm.plugin.appbrand.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115858c(java.lang.String r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "invokeData"
            gy3.C87412m.m108594g(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "performInvoke with instance("
            r2.append(r3)
            int r3 = r21.hashCode()
            r2.append(r3)
            java.lang.String r3 = ") callbackId("
            r2.append(r3)
            int r3 = r0.f244077c
            r2.append(r3)
            java.lang.String r3 = ") appId("
            r2.append(r3)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r3 = r0.f244075a
            java.lang.String r3 = r3.f238147j
            r2.append(r3)
            java.lang.String r3 = ") data("
            r2.append(r3)
            r2.append(r1)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage r2 = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage
            r4 = r2
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 16383(0x3fff, float:2.2957E-41)
            r20 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r1)
            r2.mo115870b(r3)
            r0.f244076b = r2
            java.lang.String r1 = r2.f244092e
            java.lang.String r3 = r2.f244093f
            java.lang.String r10 = r2.f244099o
            java.lang.String r2 = r2.f244103s
            if (r2 == 0) goto L_0x0082
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r4 = r0.f244075a
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j r4 = r4.mo113178J1()
            gy3.C87412m.m108591d(r4)
            r4.mo116199u1(r2)
        L_0x0082:
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage r2 = r0.f244076b
            r4 = 0
            java.lang.String r5 = "newSdkInvokeArgs"
            if (r2 == 0) goto L_0x0174
            java.lang.String r2 = r2.f244104t
            if (r2 == 0) goto L_0x0096
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r0.f244075a
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j r2 = r2.mo113178J1()
            gy3.C87412m.m108591d(r2)
        L_0x0096:
            r2 = 0
            r6 = 1
            if (r1 == 0) goto L_0x00a3
            int r7 = r1.length()
            if (r7 != 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r7 = 0
            goto L_0x00a4
        L_0x00a3:
            r7 = 1
        L_0x00a4:
            if (r7 != 0) goto L_0x016e
            if (r3 == 0) goto L_0x00ae
            int r7 = r3.length()
            if (r7 != 0) goto L_0x00af
        L_0x00ae:
            r2 = 1
        L_0x00af:
            if (r2 == 0) goto L_0x00b3
            goto L_0x016e
        L_0x00b3:
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage r2 = r0.f244076b
            if (r2 == 0) goto L_0x016a
            boolean r6 = r2.f244095h
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalPageView"
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.FunctionalAppService"
            if (r6 == 0) goto L_0x00fc
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r0.f244075a
            com.tencent.mm.plugin.appbrand.i2 r2 = r2.f238150p
            kr0.e r2 = (kr0.C88267e) r2
            com.tencent.mm.plugin.appbrand.jsapi.p r2 = r2.mo109675v(r1)
            if (r2 == 0) goto L_0x00d7
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r0.f244075a
            com.tencent.mm.plugin.appbrand.i2 r2 = r2.f238150p
            kr0.e r2 = (kr0.C88267e) r2
            gy3.C87412m.m108592e(r2, r8)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e r2 = (com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83557e) r2
            goto L_0x012c
        L_0x00d7:
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r0.f244075a
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j r2 = r2.mo113178J1()
            gy3.C87412m.m108591d(r2)
            com.tencent.mm.plugin.appbrand.jsapi.p r2 = r2.mo109675v(r1)
            if (r2 == 0) goto L_0x00f0
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r0.f244075a
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j r2 = r2.mo113178J1()
            gy3.C87412m.m108592e(r2, r7)
            goto L_0x012c
        L_0x00f0:
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r0.f244075a
            com.tencent.mm.plugin.appbrand.i2 r2 = r2.f238150p
            kr0.e r2 = (kr0.C88267e) r2
            gy3.C87412m.m108592e(r2, r8)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e r2 = (com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83557e) r2
            goto L_0x012c
        L_0x00fc:
            if (r2 == 0) goto L_0x0166
            java.lang.String r2 = r2.f244094g
            java.lang.String r6 = "appservice"
            boolean r6 = gy3.C87412m.m108589b(r2, r6)
            if (r6 == 0) goto L_0x0114
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r0.f244075a
            com.tencent.mm.plugin.appbrand.i2 r2 = r2.f238150p
            kr0.e r2 = (kr0.C88267e) r2
            gy3.C87412m.m108592e(r2, r8)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.e r2 = (com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83557e) r2
            goto L_0x012c
        L_0x0114:
            java.lang.String r6 = "webview"
            boolean r2 = gy3.C87412m.m108589b(r2, r6)
            if (r2 == 0) goto L_0x0157
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.k r2 = r0.f244075a
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r2 = r2.mo113212m1()
            com.tencent.mm.plugin.appbrand.page.d1 r2 = r2.getPageView()
            gy3.C87412m.m108592e(r2, r7)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.j r2 = (com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C83563j) r2
        L_0x012c:
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$e r11 = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$e
            r11.<init>(r2, r1, r3, r0)
            r3 = 3
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.WechatNativeExtraDataInvokeFunctionalPage r6 = r0.f244076b
            if (r6 == 0) goto L_0x0153
            int r4 = r6.f244096i
            if (r3 != r4) goto L_0x014f
            yq0.m r3 = new yq0.m
            r7 = 0
            r8 = 0
            int r9 = r0.f244077c
            r4 = r3
            r5 = r2
            r6 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$d r2 = new com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$d
            r2.<init>(r11, r0, r10, r1)
            yq0.C91548e.m114887d(r3, r2)
            goto L_0x0152
        L_0x014f:
            r11.invoke()
        L_0x0152:
            return
        L_0x0153:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x0157:
            java.lang.String r2 = "fail invalid jsapiType"
            java.lang.String r1 = com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.C1931d.m1941a(r2, r1)
            r0.mo115859d(r10, r1)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>()
            throw r1
        L_0x0166:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x016a:
            gy3.C87412m.m108603p(r5)
            throw r4
        L_0x016e:
            java.lang.String r1 = "fail invalid args"
            r0.mo115859d(r10, r1)
            return
        L_0x0174:
            gy3.C87412m.m108603p(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess.mo115858c(java.lang.String):void");
    }

    /* renamed from: d */
    public final void mo115859d(String str, String str2) {
        Log.m105924i("MicroMsg.AppBrand.FunctionalAPIInvokeManager.NewSDKInvokeProcess", "navigateBack, instance(" + hashCode() + ", invokeResult(" + str2 + ')');
        this.f244075a.mo113024P0(new NewSDKInvokeProcess$navigateBack$1(this));
        WechatNativeExtraDataInvokeFunctionalPage wechatNativeExtraDataInvokeFunctionalPage = this.f244076b;
        if (wechatNativeExtraDataInvokeFunctionalPage != null) {
            C15618a.m14626b(new NewSdkInvokeBackData(wechatNativeExtraDataInvokeFunctionalPage, str2), C83550a.f244080d, new C83551b(this));
        } else {
            C87412m.m108603p("newSdkInvokeArgs");
            throw null;
        }
    }
}
