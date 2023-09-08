package yt2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import ht1.C60200t1;
import kg3.C76577a;
import nj3.C76875f0;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;

/* renamed from: yt2.d */
public final class C53573d implements C39160b {

    /* renamed from: a */
    public final Context f150569a;

    /* renamed from: b */
    public final C13601g f150570b = C36568h.m40985a(C53574a.f150572d);

    /* renamed from: c */
    public final C13601g f150571c = C36568h.m40985a(C53575b.f150573d);

    /* renamed from: yt2.d$a */
    public static final class C53574a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C53574a f150572d = new C53574a();

        public C53574a() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$curFinderStatus$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$curFinderStatus$2");
            Integer valueOf = Integer.valueOf(Util.isNullOrNil(C75592q0.m90778h()) ? 0 : !((C60200t1) C86312j.m106911c(C60200t1.class)).u60() ? 1 : 2);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$curFinderStatus$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$curFinderStatus$2");
            return valueOf;
        }
    }

    /* renamed from: yt2.d$b */
    public static final class C53575b extends C87413o implements C32224a<C53577e> {

        /* renamed from: d */
        public static final C53575b f150573d = new C53575b();

        public C53575b() {
            super(0);
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
            String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_clip_page_finder_promotion_entrance, (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) ? "{\"enable\":2,\"max_count_no_user\":0,\"max_count_no_feed\":0,\"max_count_normal\":0}" : "");
            C53577e eVar = new C53577e(0, 0, 0, 0, 15, (C8480h) null);
            if (!Util.isNullOrNil(Y60)) {
                try {
                    JSONObject jSONObject = new JSONObject(Y60);
                    int i = jSONObject.getInt("enable");
                    SnsMethodCalculate.markStartTimeMs("setFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                    eVar.f150575a = i;
                    SnsMethodCalculate.markEndTimeMs("setFinderEntranceEnableType", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                    int i2 = jSONObject.getInt("max_count_no_user");
                    SnsMethodCalculate.markStartTimeMs("setFinderEntranceMaxCountNoUser", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                    eVar.f150576b = i2;
                    SnsMethodCalculate.markEndTimeMs("setFinderEntranceMaxCountNoUser", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                    int i3 = jSONObject.getInt("max_count_no_feed");
                    SnsMethodCalculate.markStartTimeMs("setFinderEntranceMaxCountNoFeed", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                    eVar.f150577c = i3;
                    SnsMethodCalculate.markEndTimeMs("setFinderEntranceMaxCountNoFeed", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                    int i4 = jSONObject.getInt("max_count_normal");
                    SnsMethodCalculate.markStartTimeMs("setFinderEntranceMaxCountNormal", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                    eVar.f150578d = i4;
                    SnsMethodCalculate.markEndTimeMs("setFinderEntranceMaxCountNormal", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData");
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.Improve.ToolBarUIC", "parse SnsFinderEntranceConfig fail. %s", e.getMessage());
                }
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$finderEntranceData$2");
            return eVar;
        }
    }

    /* renamed from: yt2.d$c */
    public static final class C53576c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53573d f150574d;

        public C53576c(C53573d dVar) {
            this.f150574d = dVar;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$handleSelect$2");
            C53573d dVar = this.f150574d;
            dVar.getClass();
            SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
            Context context = dVar.f150569a;
            SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).finish();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance$handleSelect$2");
        }
    }

    public C53573d(Context context) {
        C87412m.m108594g(context, "context");
        this.f150569a = context;
    }

    /* renamed from: a */
    public C76875f0 mo61964a() {
        SnsMethodCalculate.markStartTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        C76875f0 f0Var = new C76875f0(this.f150569a, 6, 0);
        f0Var.f224717i = C76577a.m92166q(this.f150569a, mo74218c().mo74220a() == 1 ? C0966R.string.c38 : C0966R.string.c39);
        if (mo74218c().mo74220a() == 2) {
            C85801v1 i = C86709a0.m107535s().mo121142i();
            C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_SNS_JUMP_FINDER_POST_EXPOSE_COUNT_INT_SYNC;
            Object f = i.mo119685f(aVar, 0);
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(((Integer) f).intValue() + 1));
        }
        SnsMethodCalculate.markEndTimeMs("buildMenuItem", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return f0Var;
    }

    /* renamed from: b */
    public Object mo61965b(C32226l<? super Boolean, C13598b0> lVar, C15601d<? super C13598b0> dVar) {
        Class cls = C60200t1.class;
        SnsMethodCalculate.markStartTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        lVar.invoke(Boolean.TRUE);
        Intent intent = new Intent();
        if (mo74218c().mo74220a() == 1) {
            intent.putExtra("key_finder_post_router", 6);
            intent.putExtra("key_finder_sns_post_type", 1);
            ((C60200t1) C86312j.m106911c(cls)).mo76837c0(this.f150569a, intent);
        } else {
            ((C60200t1) C86312j.m106911c(cls)).mo76842e7(4, 5, 44, intent);
            intent.putExtra("key_form_sns", true);
            ((C60200t1) C86312j.m106911c(cls)).Hm0(this.f150569a, intent);
            MMHandlerThread.postToMainThread(new C53576c(this));
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("handleSelect", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return b0Var;
    }

    /* renamed from: c */
    public final C53577e mo74218c() {
        SnsMethodCalculate.markStartTimeMs("getFinderEntranceData", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        C53577e eVar = (C53577e) ((C36570n) this.f150571c).getValue();
        SnsMethodCalculate.markEndTimeMs("getFinderEntranceData", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return eVar;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c8, code lost:
        if (r5 == false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e1, code lost:
        if (((ht1.C60200t1) di3.C86312j.m106911c(ht1.C60200t1.class)).mo76879tO() != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e3, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("show", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e6, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean show() {
        /*
            r9 = this;
            java.lang.String r0 = "show"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r2 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.MomentChannels
            boolean r2 = r2.banned()
            r3 = 0
            if (r2 != 0) goto L_0x00e7
            yt2.e r2 = r9.mo74218c()
            int r2 = r2.mo74220a()
            r4 = 1
            if (r2 != r4) goto L_0x00ca
            java.lang.String r2 = "checkFinderExposeCount"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            java.lang.String r5 = "getExposeMaxCountByFinderStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            java.lang.String r6 = "getCurFinderStatus"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            rx3.g r7 = r9.f150570b
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntranceData"
            if (r7 != 0) goto L_0x0052
            yt2.e r6 = r9.mo74218c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNoUser"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            int r6 = r6.f150576b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L_0x008b
        L_0x0052:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r1)
            rx3.g r7 = r9.f150570b
            rx3.n r7 = (rx3.C36570n) r7
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r1)
            if (r7 != r4) goto L_0x007a
            yt2.e r6 = r9.mo74218c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNoFeed"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            int r6 = r6.f150577c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
            goto L_0x008b
        L_0x007a:
            yt2.e r6 = r9.mo74218c()
            r6.getClass()
            java.lang.String r7 = "getFinderEntranceMaxCountNormal"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
            int r6 = r6.f150578d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
        L_0x008b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_SNS_FINDER_EXPOSE_COUNT_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r5.mo119685f(r7, r8)
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r5, r8)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 < r6) goto L_0x00b4
            r8 = -1
            if (r6 != r8) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r5 = 0
            goto L_0x00c5
        L_0x00b4:
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            int r5 = r5 + r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.mo119677K(r7, r5)
            r5 = 1
        L_0x00c5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            if (r5 != 0) goto L_0x00e3
        L_0x00ca:
            yt2.e r2 = r9.mo74218c()
            int r2 = r2.mo74220a()
            r5 = 2
            if (r2 != r5) goto L_0x00e7
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            boolean r2 = r2.mo76879tO()
            if (r2 == 0) goto L_0x00e7
        L_0x00e3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L_0x00e7:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yt2.C53573d.show():boolean");
    }

    public int type() {
        SnsMethodCalculate.markStartTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        int a = C53572c.FINDER.mo74217a();
        SnsMethodCalculate.markEndTimeMs("type", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.FinderEntrance");
        return a;
    }
}
