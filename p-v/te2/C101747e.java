package te2;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.util.ArrayList;
import java.util.LinkedList;
import ke2.C99129c;
import ob0.C11385n;
import ob0.C117747y;
import pe2.C100788h;
import pe3.C47465a;
import pe3.C89349b;
import te3.C49847ih3;
import te3.C50680oh;
import te3.C50827ph;
import xe2.C102633e;
import zt3.C119157j;

/* renamed from: te2.e */
public final class C101747e extends C98597b implements C11385n {

    /* renamed from: f */
    public final ArrayList<C50680oh> f297825f = new ArrayList<>();

    /* renamed from: te2.e$a */
    public static final class C101748a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C49847ih3 f297826d;

        public C101748a(C49847ih3 ih32) {
            this.f297826d = ih32;
        }

        public final void run() {
            Class cls = C99129c.class;
            C102633e Cx0 = ((C99129c) C86312j.m106911c(cls)).Cx0();
            LinkedList<C50827ph> linkedList = this.f297826d.f135348d;
            C87412m.m108593f(linkedList, "resp.biz_resps");
            long min = Math.min(this.f297826d.f135349e, C31543z5.m39453c() + ((long) 3600000));
            MultiProcessMMKV multiProcessMMKV = Cx0.f302223f;
            if (multiProcessMMKV != null) {
                multiProcessMMKV.encode(Cx0.f302224g, min);
                for (C50827ph phVar : linkedList) {
                    multiProcessMMKV.removeValueForKey(Cx0.f302225h + phVar.f139761d);
                    String str = Cx0.f302225h + phVar.f139761d;
                    C89349b bVar = phVar.f139762e;
                    multiProcessMMKV.encode(str, bVar != null ? bVar.mo123703f() : null);
                    multiProcessMMKV.encode(Cx0.f302226i + phVar.f139761d, phVar.f139763f);
                    multiProcessMMKV.encode(Cx0.f302227j + phVar.f139761d, 0);
                }
            }
            CdnLogic.setDownloadQuota(((C99129c) C86312j.m106911c(cls)).Cx0().mo142291g3(1), Math.min(this.f297826d.f135349e - C31543z5.m39453c(), 3600000));
            LinkedList<C50827ph> linkedList2 = this.f297826d.f135348d;
            C87412m.m108593f(linkedList2, "resp.biz_resps");
            for (C50827ph phVar2 : linkedList2) {
                if (phVar2.f139761d == 1) {
                    C99129c cVar = (C99129c) C86312j.m106911c(cls);
                    cVar.requireAccountInitialized();
                    cVar.f290655A.mo129639h(true);
                }
            }
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
            cVar2.requireAccountInitialized();
            C100788h hVar = cVar2.f290667t;
            long min2 = Math.min(this.f297826d.f135349e - C31543z5.m39453c(), 3600000);
            C100788h.C100789a aVar = hVar.f295257b;
            if (aVar != null) {
                aVar.sendEmptyMessageDelayed(2, min2);
            }
            Log.m105924i("MicroMsg.PreDownloadCheckPLC", "pre download check end, get c2c quota:" + ((C99129c) C86312j.m106911c(cls)).Cx0().mo142291g3(1));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101747e(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "plugin");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.PreDownloadCheckPLC", "pre download cgi scene end, errType:" + i + ", errCode:" + i2 + ", errMsg:" + str);
        if (i == 0 && i2 == 0) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.priority.model.precheck.NetScenePredownloadCheck");
            C47465a aVar = ((C48640d) yVar).f130180e.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PrevDownloadCheckResponse");
            ((C119157j) C119157j.f356862d).mo183875f(new C101748a((C49847ih3) aVar));
            return;
        }
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        C100788h.C100789a aVar2 = cVar.f290667t.f295257b;
        if (aVar2 != null) {
            aVar2.sendEmptyMessageDelayed(2, 300000);
        }
    }
}
