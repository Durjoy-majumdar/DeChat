package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import a14.C0000n0;
import az0.C39666f;
import az0.C39667h;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yq0.C91566l;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.n0 */
public final class C82194n0 implements C91566l.C91570c {

    /* renamed from: a */
    public final /* synthetic */ C82185m0 f241060a;

    /* renamed from: b */
    public final /* synthetic */ C81879g f241061b;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.auth.WxaCarLicensePlateChooserViewController$initHalfScreenDialog$1$onMsg$1", mo125469f = "JsApiChooseLicensePlate.kt", mo125470l = {188}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.n0$a */
    public static final class C40454a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f108729d;

        /* renamed from: e */
        public final /* synthetic */ String f108730e;

        /* renamed from: f */
        public final /* synthetic */ C81879g f108731f;

        /* renamed from: g */
        public final /* synthetic */ boolean f108732g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40454a(String str, C81879g gVar, boolean z, C15601d<? super C40454a> dVar) {
            super(2, dVar);
            this.f108730e = str;
            this.f108731f = gVar;
            this.f108732g = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C40454a(this.f108730e, this.f108731f, this.f108732g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C40454a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f108729d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f108730e;
                String appId = this.f108731f.getAppId();
                C87412m.m108593f(appId, "env.appId");
                C39667h hVar = new C39667h(str, appId, this.f108732g);
                this.f108729d = 1;
                if (hVar.mo62235e(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (C39666f unused) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C82194n0(C82185m0 m0Var, C81879g gVar) {
        this.f241060a = m0Var;
        this.f241061b = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003b, code lost:
        r9 = r9.f247996d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo114536a(int r9, java.util.ArrayList<java.lang.String> r10, int r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "resultData"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "prompt onMsg, resultCode:"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r0 = ", id:"
            r10.append(r0)
            r10.append(r11)
            java.lang.String r0 = "  userAgreementChecked:"
            r10.append(r0)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            java.lang.String r0 = "MicroMsg.WxaCarLicensePlateChooserViewController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r10)
            r10 = 1
            if (r10 != r9) goto L_0x0089
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0 r9 = r8.f241060a
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel r9 = r9.mo114595h()
            com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo r9 = r9.f248031d
            r1 = 0
            if (r9 == 0) goto L_0x0046
            java.util.ArrayList<java.lang.String> r9 = r9.f247996d
            if (r9 == 0) goto L_0x0046
            java.lang.Object r9 = sx3.C110818d0.m150917O(r9, r11)
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x0047
        L_0x0046:
            r9 = r1
        L_0x0047:
            if (r9 == 0) goto L_0x0051
            int r2 = r9.length()
            if (r2 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r10 = 0
        L_0x0051:
            if (r10 != 0) goto L_0x0073
            a14.n0 r2 = a14.C53930o0.m60555b()
            r3 = 0
            r4 = 0
            com.tencent.mm.plugin.appbrand.jsapi.auth.n0$a r5 = new com.tencent.mm.plugin.appbrand.jsapi.auth.n0$a
            com.tencent.mm.plugin.appbrand.g r10 = r8.f241061b
            r5.<init>(r9, r10, r12, r1)
            r6 = 3
            r7 = 0
            a14.C53895h.m60466d(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0 r10 = r8.f241060a
            com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct r11 = r10.f241043h
            r0 = 3
            r11.f236459i = r0
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$g r10 = r10.f241044i
            r10.mo114597a(r9)
            goto L_0x0096
        L_0x0073:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "prompt onMsg, invalid avatarId(index):"
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r9)
            goto L_0x0096
        L_0x0089:
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0 r9 = r8.f241060a
            com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct r10 = r9.f241043h
            r11 = 4
            r10.f236459i = r11
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$g r9 = r9.f241044i
            r9.onUserCancel()
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82194n0.mo114536a(int, java.util.ArrayList, int, boolean):void");
    }
}
