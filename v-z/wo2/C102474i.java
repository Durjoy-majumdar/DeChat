package wo2;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import np2.C100150a;
import pp2.C62489a;
import qp2.C101232a;
import rx3.C13598b0;

/* renamed from: wo2.i */
public final class C102474i {

    /* renamed from: a */
    public static final C102475a f301752a = new C102475a((C8480h) null);

    /* renamed from: b */
    public static final Map<String, C32226l<Parcelable, C13598b0>> f301753b = new LinkedHashMap();

    /* renamed from: c */
    public static C62489a f301754c;

    /* renamed from: wo2.i$a */
    public static final class C102475a {
        public C102475a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo142082a() {
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
            return "AdToolsIPCProxy";
        }
    }

    /* renamed from: a */
    public static final void m135260a() {
        SnsMethodCalculate.markStartTimeMs("createChannel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        C102475a aVar = f301752a;
        SnsMethodCalculate.markStartTimeMs("createChannel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
        C100150a aVar2 = new C100150a();
        aVar2.mo139441d(new C102471g());
        aVar2.mo139440c(C102473h.f301751a);
        C62489a a = aVar2.mo139438a();
        SnsMethodCalculate.markStartTimeMs("access$setIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        f301754c = a;
        SnsMethodCalculate.markEndTimeMs("access$setIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        SnsMethodCalculate.markStartTimeMs("access$getIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        C62489a aVar3 = f301754c;
        SnsMethodCalculate.markEndTimeMs("access$getIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        if (aVar3 != null) {
            ((C101232a) aVar3).mo140693c(new Bundle());
        }
        SnsMethodCalculate.markStartTimeMs("access$getIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        C62489a aVar4 = f301754c;
        SnsMethodCalculate.markEndTimeMs("access$getIpcRequester$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        if (aVar4 == null) {
            aVar.mo142082a();
            Log.m105920e("AdToolsIPCProxy", "the ipc request object is null, please check the log to find the reason!");
        }
        SnsMethodCalculate.markEndTimeMs("createChannel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
        SnsMethodCalculate.markEndTimeMs("createChannel", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
    }

    /* renamed from: b */
    public static final void m135261b(String str, C32226l<? super Parcelable, C13598b0> lVar) {
        SnsMethodCalculate.markStartTimeMs("injectProcessor", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        SnsMethodCalculate.markStartTimeMs("injectProcessor", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
        C87412m.m108594g(str, "className");
        C87412m.m108594g(lVar, "processor");
        SnsMethodCalculate.markStartTimeMs("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        Map<String, C32226l<Parcelable, C13598b0>> map = f301753b;
        SnsMethodCalculate.markEndTimeMs("access$getProcessors$cp", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
        map.put(str, lVar);
        SnsMethodCalculate.markEndTimeMs("injectProcessor", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy$Companion");
        SnsMethodCalculate.markEndTimeMs("injectProcessor", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdToolsIPCProxy");
    }
}
