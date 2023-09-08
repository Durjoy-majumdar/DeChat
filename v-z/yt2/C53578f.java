package yt2;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53896h0;
import a14.C53934p0;
import ad0.C91998s;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0317e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsEditDraftStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.SnsLongMsgUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.C95006y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import f14.C58901s;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import hi2.C46072b;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import l31.C99333f;
import nj3.C76879j;
import os2.C35285a0;
import p447aw.C103918d;
import qo3.C77407n;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ut2.C102084a;
import vr2.C102236a0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: yt2.f */
public final class C53578f extends C102084a {

    /* renamed from: d */
    public final C13601g f150579d = C36568h.m40985a(new C27711a(this));

    /* renamed from: e */
    public final C13601g f150580e = C36568h.m40985a(new C53579b(this));

    /* renamed from: yt2.f$a */
    public static final class C27711a extends C87413o implements C32224a<C77407n> {

        /* renamed from: d */
        public final /* synthetic */ C53578f f76722d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27711a(C53578f fVar) {
            super(0);
            this.f76722d = fVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$bottomSheet$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$bottomSheet$2");
            C53578f fVar = this.f76722d;
            SnsMethodCalculate.markStartTimeMs("access$setupBottomSheet", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("setupBottomSheet", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            C77407n nVar = new C77407n((Context) fVar.getContext(), 1, false);
            nVar.f225771i = new C27712h(fVar);
            nVar.f225782p = new C39168i(fVar);
            nVar.f225761d = C27713j.f76724a;
            SnsMethodCalculate.markEndTimeMs("setupBottomSheet", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            SnsMethodCalculate.markEndTimeMs("access$setupBottomSheet", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$bottomSheet$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$bottomSheet$2");
            return nVar;
        }
    }

    /* renamed from: yt2.f$c */
    public static final class C39161c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53578f f105394d;

        public C39161c(C53578f fVar) {
            this.f105394d = fVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onCreate$1");
            Log.m105924i("MicroMsg.Improve.ToolBarUIC", "click appbar back img,finish page");
            this.f105394d.getActivity().finish();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onCreate$1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1", mo125469f = "ImproveToolBarUIC.kt", mo125470l = {298}, mo125471m = "invokeSuspend")
    /* renamed from: yt2.f$f */
    public static final class C39162f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f105395d;

        /* renamed from: e */
        public final /* synthetic */ C53578f f105396e;

        /* renamed from: yt2.f$f$a */
        public static final class C39163a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public static final C39163a f105397d = new C39163a();

            public C39163a() {
                super(1);
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1$1");
                ((Boolean) obj).booleanValue();
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1$1");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39162f(C53578f fVar, C15601d<? super C39162f> dVar) {
            super(2, dVar);
            this.f105396e = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
            C39162f fVar = new C39162f(this.f105396e, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
            Object invokeSuspend = ((C39162f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C102906k kVar;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f105395d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Iterator it = C53578f.m60109d3(this.f105396e).entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kVar = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue() instanceof C102906k) {
                        Object value = entry.getValue();
                        if (value != null) {
                            kVar = (C102906k) value;
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.component.toolbar.RecordEntrance");
                            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
                            throw nullPointerException;
                        }
                    }
                }
                if (kVar != null) {
                    C39163a aVar2 = C39163a.f105397d;
                    this.f105395d = 1;
                    if (kVar.mo61965b(aVar2, this) == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$1");
            return b0Var;
        }
    }

    /* renamed from: yt2.f$g */
    public static final class C39164g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53578f f105398d;

        public C39164g(C53578f fVar) {
            this.f105398d = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$2");
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(this.f105398d.getContext());
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$2");
        }
    }

    /* renamed from: yt2.f$h */
    public static final class C39165h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public static final C39165h f105399d = new C39165h();

        public final void onClick(DialogInterface dialogInterface, int i) {
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$3");
            dialogInterface.dismiss();
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$3");
        }
    }

    /* renamed from: yt2.f$b */
    public static final class C53579b extends C87413o implements C32224a<LinkedHashMap<Integer, C39160b>> {

        /* renamed from: d */
        public final /* synthetic */ C53578f f150581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53579b(C53578f fVar) {
            super(0);
            this.f150581d = fVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$entranceMap$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$entranceMap$2");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C53578f fVar = this.f150581d;
            C53578f.m60108c3(fVar, linkedHashMap, new C102906k(fVar.getContext()));
            C53578f fVar2 = this.f150581d;
            C53578f.m60108c3(fVar2, linkedHashMap, new C102905a(fVar2.getContext()));
            C53578f fVar3 = this.f150581d;
            C53578f.m60108c3(fVar3, linkedHashMap, new C53573d(fVar3.getContext()));
            C53578f fVar4 = this.f150581d;
            C53578f.m60108c3(fVar4, linkedHashMap, new C53582m(fVar4.getContext()));
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$entranceMap$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$entranceMap$2");
            return linkedHashMap;
        }
    }

    /* renamed from: yt2.f$d */
    public static final class C53580d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53578f f150582d;

        public C53580d(C53578f fVar) {
            this.f150582d = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x017b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r25) {
            /*
                r24 = this;
                r6 = r24
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = r25
                r0.add(r1)
                java.lang.Object[] r5 = r0.toArray()
                r0.clear()
                java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC$onCreate$2"
                java.lang.String r1 = "android/view/View$OnClickListener"
                java.lang.String r2 = "onClick"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r24
                j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
                java.lang.String r0 = "onClick"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onCreate$2"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.String r2 = "MicroMsg.Improve.ToolBarUIC"
                java.lang.String r3 = "click appbar camera img"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
                java.lang.Class<l31.f> r3 = l31.C99333f.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                l31.f r3 = (l31.C99333f) r3
                r4 = 12076(0x2f2c, float:1.6922E-41)
                java.lang.String r5 = "ClickNewPostTime"
                r3.um0(r4, r5)
                yt2.f r7 = r6.f150582d
                java.lang.String r3 = "access$postMediaContent"
                java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                r7.getClass()
                java.lang.String r5 = "postMediaContent"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r4)
                java.lang.String r8 = "postMediaContent: "
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
                k21.c$a r8 = k21.C60960c.f173618a
                java.lang.String r9 = "SnsPublishProcess"
                r8.mo85918a(r9)
                java.lang.String r9 = vr2.C102236a0.m134754l()
                java.lang.String r10 = "checkSnsPostSessionId()"
                gy3.C87412m.m108593f(r9, r10)
                java.lang.String r10 = "RecordMediaReporter"
                java.lang.String r11 = "moment_sessionid_"
                r8.mo85926j(r10, r11, r9)
                com.tencent.mm.plugin.sns.statistics.SnsReportHelper r8 = com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper.f275506m0
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = eb0.C75592q0.m90789s()
                r9.append(r10)
                r10 = 95
                r9.append(r10)
                long r10 = java.lang.System.currentTimeMillis()
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.f275523Q = r9
                os2.b0 r8 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
                r9 = 0
                r8.mo60187jo(r9)
                com.tencent.mm.storage.y1$a r8 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_DRAFT_LAST_SESSIONID_STRING
                java.lang.String r10 = "checkAndPostWithMediaDraft"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
                os2.b0 r11 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
                java.lang.String r12 = "draft_normal"
                os2.a0 r11 = r11.mo60188qq(r12)
                if (r11 == 0) goto L_0x00ad
                byte[] r14 = r11.field_draft
                goto L_0x00ae
            L_0x00ad:
                r14 = 0
            L_0x00ae:
                r15 = 1
                if (r14 == 0) goto L_0x0171
                java.lang.String r14 = "checkAndPostWithMediaDraft, directly goto SnsUploadUI with draftInfo"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r14)
                byte[] r11 = r11.field_draft
                boolean r14 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r11)
                if (r14 != 0) goto L_0x0171
                f40.o r14 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r14 = r14.mo121142i()
                java.lang.String r13 = ""
                java.lang.Object r14 = r14.mo119685f(r8, r13)
                java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
                gy3.C87412m.m108592e(r14, r9)
                java.lang.String r14 = (java.lang.String) r14
                com.tencent.mm.autogen.mmdata.rpt.SnsEditDraftStruct r9 = new com.tencent.mm.autogen.mmdata.rpt.SnsEditDraftStruct
                r9.<init>()
                r9.mo126630s()
                java.lang.String r6 = "SessionId"
                java.lang.String r6 = r9.mo86045b(r6, r14, r15)
                r9.f266008d = r6
                r9.mo86054n()
                android.os.Parcel r6 = android.os.Parcel.obtain()
                java.lang.String r9 = "obtain()"
                gy3.C87412m.m108593f(r6, r9)
                int r9 = r11.length
                r15 = 0
                r6.unmarshall(r11, r15, r9)
                r6.setDataPosition(r15)
                android.os.Parcelable$Creator r9 = android.content.Intent.CREATOR     // Catch:{ Exception -> 0x015d }
                java.lang.Object r6 = r9.createFromParcel(r6)     // Catch:{ Exception -> 0x015d }
                android.content.Intent r6 = (android.content.Intent) r6     // Catch:{ Exception -> 0x015d }
                r9 = 268435456(0x10000000, float:2.5243549E-29)
                r6.addFlags(r9)     // Catch:{ Exception -> 0x015d }
                android.app.Activity r9 = r7.getContext()     // Catch:{ Exception -> 0x015d }
                java.lang.Class<com.tencent.mm.plugin.sns.ui.SnsUploadUI> r11 = com.tencent.p014mm.plugin.sns.p106ui.SnsUploadUI.class
                r6.setClass(r9, r11)     // Catch:{ Exception -> 0x015d }
                java.lang.String r9 = "KSessionID"
                r6.putExtra(r9, r14)     // Catch:{ Exception -> 0x015d }
                java.lang.String r9 = "Kis_from_sns_drafg_stg"
                r11 = 1
                r6.putExtra(r9, r11)     // Catch:{ Exception -> 0x015d }
                android.app.Activity r9 = r7.getContext()     // Catch:{ Exception -> 0x015d }
                k20.a r14 = new k20.a     // Catch:{ Exception -> 0x015d }
                r14.<init>()     // Catch:{ Exception -> 0x015d }
                r14.mo10233c(r6)     // Catch:{ Exception -> 0x015d }
                java.lang.Object[] r17 = r14.mo10232b()     // Catch:{ Exception -> 0x015d }
                java.lang.String r18 = "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC"
                java.lang.String r19 = "checkAndPostWithMediaDraft"
                java.lang.String r20 = "()Z"
                java.lang.String r21 = "Undefined"
                java.lang.String r22 = "startActivity"
                java.lang.String r23 = "(Landroid/content/Intent;)V"
                r16 = r9
                j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x015d }
                r6 = 0
                java.lang.Object r14 = r14.mo10231a(r6)     // Catch:{ Exception -> 0x015d }
                android.content.Intent r14 = (android.content.Intent) r14     // Catch:{ Exception -> 0x015d }
                r9.startActivity(r14)     // Catch:{ Exception -> 0x015d }
                java.lang.String r17 = "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC"
                java.lang.String r18 = "checkAndPostWithMediaDraft"
                java.lang.String r19 = "()Z"
                java.lang.String r20 = "Undefined"
                java.lang.String r21 = "startActivity"
                java.lang.String r22 = "(Landroid/content/Intent;)V"
                r16 = r9
                j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x015d }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)     // Catch:{ Exception -> 0x015d }
                r15 = 1
                goto L_0x0175
            L_0x015d:
                os2.b0 r6 = com.tencent.p014mm.plugin.sns.model.C94866e1.Wx0()
                r9 = 0
                r11 = 0
                r6.mo60186Yt(r12, r9, r11)
                f40.o r6 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r6 = r6.mo121142i()
                r6.mo119677K(r8, r13)
            L_0x0171:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
                r15 = 0
            L_0x0175:
                if (r15 == 0) goto L_0x017b
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                goto L_0x01cc
            L_0x017b:
                r6 = 705(0x2c1, float:9.88E-43)
                ad0.C91998s.m115550d(r6)
                java.lang.System.currentTimeMillis()
                java.lang.String r6 = "isCancelCameraSheet"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
                java.lang.String r8 = "clicfg_sns_cancel_camera_sheet"
                r9 = 0
                boolean r8 = p761yd.C38993b.m41995e(r8, r9)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
                if (r8 == 0) goto L_0x01ae
                java.lang.String r6 = "CancelCameraSheet, jump gallery"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                a14.h0 r2 = a14.C53872d1.f151117a
                a14.k2 r8 = f14.C58901s.f168555a
                r9 = 0
                yt2.g r10 = new yt2.g
                r2 = 0
                r10.<init>(r7, r2)
                r11 = 2
                r12 = 0
                bl3.C0317e.launch$default(r7, r8, r9, r10, r11, r12)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
                goto L_0x01cc
            L_0x01ae:
                java.lang.String r6 = "show post sheet select"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
                java.lang.String r2 = "getBottomSheet"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
                rx3.g r6 = r7.f150579d
                rx3.n r6 = (rx3.C36570n) r6
                java.lang.Object r6 = r6.getValue()
                qo3.n r6 = (qo3.C77407n) r6
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
                r6.mo107573q()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r4)
            L_0x01cc:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                java.lang.String r1 = "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC$onCreate$2"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "(Landroid/view/View;)V"
                r4 = r24
                j20.C117292a.m165361g(r4, r1, r2, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yt2.C53578f.C53580d.onClick(android.view.View):void");
        }
    }

    /* renamed from: yt2.f$e */
    public static final class C53581e implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C53578f f150583d;

        public C53581e(C53578f fVar) {
            this.f150583d = fVar;
        }

        public final boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC$onCreate$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onCreate$3");
            ((C99333f) C86312j.m106911c(C99333f.class)).um0(12076, "ClickNewPostTime");
            C53578f fVar = this.f150583d;
            SnsMethodCalculate.markStartTimeMs("access$postTextOnly", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            fVar.getClass();
            SnsMethodCalculate.markStartTimeMs("postTextOnly", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            Log.m105924i("MicroMsg.Improve.ToolBarUIC", "postTextOnly");
            Object e = C86709a0.m107535s().mo121142i().mo119684e(7490, Boolean.TRUE);
            C87412m.m108592e(e, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) e).booleanValue();
            C94866e1.Wx0().mo60187jo(true);
            C35285a0 qq = C94866e1.Wx0().mo60188qq("draft_text");
            if (qq != null) {
                byte[] bArr = qq.field_draft;
                if (!Util.isNullOrNil(bArr)) {
                    Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_SNS_OPEN_UPLOAD_DRAFT_NEWTEXT_LAST_SESSIONID_STRING, "");
                    C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
                    SnsEditDraftStruct snsEditDraftStruct = new SnsEditDraftStruct();
                    snsEditDraftStruct.mo126630s();
                    snsEditDraftStruct.f266008d = snsEditDraftStruct.mo86045b("SessionId", (String) f, true);
                    snsEditDraftStruct.mo86054n();
                    Parcel obtain = Parcel.obtain();
                    C87412m.m108593f(obtain, "obtain()");
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    try {
                        Intent intent = (Intent) Intent.CREATOR.createFromParcel(obtain);
                        SnsMethodCalculate.markStartTimeMs("checkTextIntent", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                        boolean z = intent != null && intent.getIntExtra("Ksnsupload_type", 0) == 9;
                        SnsMethodCalculate.markEndTimeMs("checkTextIntent", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                        if (z) {
                            Activity context = fVar.getContext();
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(9);
                            aVar.mo10233c(intent);
                            C117292a.m165364j(context, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC", "postTextOnly", "()Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                            SnsMethodCalculate.markEndTimeMs("postTextOnly", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                            SnsMethodCalculate.markEndTimeMs("access$postTextOnly", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onCreate$3");
                            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC$onCreate$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                            return true;
                        }
                        C94866e1.Wx0().mo60186Yt("draft_text", (byte[]) null, 0);
                    } catch (Exception unused) {
                        C94866e1.Wx0().mo60186Yt("draft_text", (byte[]) null, 0);
                    }
                }
            }
            if (!booleanValue) {
                Intent intent2 = new Intent();
                intent2.setClass(fVar.getContext(), SnsUploadUI.class);
                intent2.putExtra("KSnsPostManu", true);
                intent2.putExtra("KTouchCameraTime", Util.nowSecond());
                intent2.putExtra("sns_comment_type", 1);
                intent2.putExtra("Ksnsupload_type", 9);
                C91998s d = C91998s.m115550d(705);
                System.currentTimeMillis();
                C95006y.f275639b.mo131396a(d);
                d.mo125842g(intent2);
                Activity context2 = fVar.getContext();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(9);
                aVar2.mo10233c(intent2);
                C117292a.m165364j(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC", "postTextOnly", "()Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            } else {
                Activity context3 = fVar.getContext();
                Intent intent3 = new Intent().setClass(fVar.getContext(), SnsLongMsgUI.class);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(intent3);
                Activity activity = context3;
                C117292a.m165358d(activity, aVar3.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC", "postTextOnly", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context3.startActivity((Intent) aVar3.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC", "postTextOnly", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C86709a0.m107535s().mo121142i().mo119676J(7490, Boolean.FALSE);
            }
            SnsMethodCalculate.markEndTimeMs("postTextOnly", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            SnsMethodCalculate.markEndTimeMs("access$postTextOnly", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onCreate$3");
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/sns/ui/improve/component/toolbar/ImproveToolBarUIC$onCreate$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53578f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m60108c3(C53578f fVar, HashMap hashMap, C39160b bVar) {
        SnsMethodCalculate.markStartTimeMs("access$addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        fVar.getClass();
        SnsMethodCalculate.markStartTimeMs("addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        if (bVar.show()) {
            hashMap.put(Integer.valueOf(bVar.type()), bVar);
        }
        SnsMethodCalculate.markEndTimeMs("addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        SnsMethodCalculate.markEndTimeMs("access$addEntrance", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    /* renamed from: d3 */
    public static final LinkedHashMap m60109d3(C53578f fVar) {
        SnsMethodCalculate.markStartTimeMs("access$getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        fVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((C36570n) fVar.f150580e).getValue();
        SnsMethodCalculate.markEndTimeMs("getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        SnsMethodCalculate.markEndTimeMs("access$getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        return linkedHashMap;
    }

    /* renamed from: e3 */
    public final void mo74224e3(int i, int i2) {
        C53582m mVar;
        C53573d dVar;
        int i3 = i;
        SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        int i4 = 2;
        int i5 = C46072b.f124220a.mo71508b(getContext(), "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF") ? 1 : 2;
        Iterator it = m60109d3(this).entrySet().iterator();
        while (true) {
            mVar = null;
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() instanceof C53573d) {
                Object value = entry.getValue();
                if (value != null) {
                    dVar = (C53573d) value;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
                    SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                    throw nullPointerException;
                }
            }
        }
        boolean z = dVar != null;
        Iterator it4 = m60109d3(this).entrySet().iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it4.next();
            if (entry2.getValue() instanceof C53582m) {
                Object value2 = entry2.getValue();
                if (value2 != null) {
                    mVar = (C53582m) value2;
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.component.toolbar.SecondCutEntrance");
                    SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
                    throw nullPointerException2;
                }
            }
        }
        boolean z2 = mVar != null;
        C53572c cVar = C53572c.FINDER;
        int i6 = !z ? 0 : cVar.mo74217a() == i3 ? 2 : 1;
        int i7 = i3 == C53572c.RECORD.mo74217a() ? 1 : i3 == C53572c.ALBUM.mo74217a() ? 2 : (i3 == cVar.mo74217a() || i3 == C53572c.SECOND_CUT.mo74217a()) ? 3 : 0;
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[8];
        objArr[0] = Long.valueOf(C31543z5.m39453c());
        objArr[1] = Integer.valueOf(z ? 1 : 2);
        objArr[2] = Integer.valueOf(i6);
        objArr[3] = C102236a0.m134754l();
        if (z2) {
            i4 = 1;
        }
        objArr[4] = Integer.valueOf(i4);
        objArr[5] = Integer.valueOf(i7);
        objArr[6] = Integer.valueOf(i5);
        objArr[7] = Integer.valueOf(i2);
        nVar.mo160131h(20838, objArr);
        SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        super.onActivityResult(i, i2, intent);
        SnsMethodCalculate.markStartTimeMs("getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        SnsMethodCalculate.markEndTimeMs("getEntranceMap", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        for (Map.Entry value : ((LinkedHashMap) ((C36570n) this.f150580e).getValue()).entrySet()) {
            ((C39160b) value.getValue()).onActivityResult(i, i2, intent);
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    public void onCreate(Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        super.onCreate(bundle);
        findViewById(C0966R.C0970id.f359396kp1).setOnClickListener(new C39161c(this));
        View findViewById = findViewById(C0966R.C0970id.oiz);
        findViewById.setOnClickListener(new C53580d(this));
        findViewById.setOnLongClickListener(new C53581e(this));
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        SnsMethodCalculate.markStartTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (iArr.length == 0) {
            Log.m105920e("MicroMsg.Improve.ToolBarUIC", "error requestCode:" + i);
            SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
            return;
        }
        Log.m105924i("MicroMsg.Improve.ToolBarUIC", "requestCode:" + i + ",grantResults:" + iArr[0]);
        if (i == 16) {
            if (iArr[0] == 0) {
                C53896h0 h0Var = C53872d1.f151117a;
                C0317e.launch$default(this, C58901s.f168555a, (C53934p0) null, new C39162f(this, (C15601d<? super C39162f>) null), 2, (Object) null);
            } else {
                int i2 = C87412m.m108589b("android.permission.CAMERA", strArr[0]) ? C0966R.string.hhq : C0966R.string.f361130hi2;
                if (iArr[0] != 0) {
                    C76879j.m92709C(getContext(), getString(i2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C39164g(this), C39165h.f105399d);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onRequestPermissionsResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC");
    }
}
