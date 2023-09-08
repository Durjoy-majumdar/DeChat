package ue2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import ke2.C99129c;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C36570n;
import ve2.C102175b;
import ve2.C102176c;
import ve2.C102178d;
import ve2.C102179e;
import ve2.C102180f;
import wx3.C15601d;
import xe2.C102630a;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader$startPreDownloadNow$2", mo125469f = "C2CMsgPreDownloader.kt", mo125470l = {159}, mo125471m = "invokeSuspend")
/* renamed from: ue2.d */
public final class C102006d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f300339d;

    /* renamed from: e */
    public final /* synthetic */ String f300340e;

    /* renamed from: f */
    public final /* synthetic */ C2CMsgPreDownloader f300341f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102006d(String str, C2CMsgPreDownloader c2CMsgPreDownloader, C15601d<? super C102006d> dVar) {
        super(2, dVar);
        this.f300340e = str;
        this.f300341f = c2CMsgPreDownloader;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C102006d(this.f300340e, this.f300341f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C102006d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f300339d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            C102630a d3 = cVar.f290673z.mo142287d3(this.f300340e);
            if (d3 != null) {
                C2CMsgPreDownloader c2CMsgPreDownloader = this.f300341f;
                String str = this.f300340e;
                if (d3.mo142477s2() == c2CMsgPreDownloader.f272434f && d3.getMsgId() == c2CMsgPreDownloader.f272433e) {
                    Log.m105924i("MicroMsg.C2CMsgPreDownloader", "c2c pre download: task:" + str + " is already in user download list");
                    return C13598b0.f38549a;
                }
                C102179e eVar = null;
                int s2 = d3.mo142477s2();
                if (s2 == 1) {
                    eVar = new C102178d(d3);
                    Log.m105924i("MicroMsg.C2CMsgPreDownloader", "add C2C mid image pre download task now, msgId:" + d3.getMsgId() + ", msgSvrId:" + d3.mo142476r2());
                } else if (s2 == 2) {
                    eVar = new C102176c(d3);
                    Log.m105924i("MicroMsg.C2CMsgPreDownloader", "add C2C large image pre download task now, msgId:" + d3.getMsgId() + ", msgSvrId:" + d3.mo142476r2());
                } else if (s2 == 3) {
                    eVar = new C102180f(d3);
                    Log.m105924i("MicroMsg.C2CMsgPreDownloader", "add C2C video pre download task now, msgId:" + d3.getMsgId() + ", msgSvrId:" + d3.mo142476r2());
                } else if (s2 == 4) {
                    eVar = new C102175b(d3);
                    Log.m105924i("MicroMsg.C2CMsgPreDownloader", "add C2C file pre download task now, msgId:" + d3.getMsgId() + ", msgSvrId:" + d3.mo142476r2());
                }
                if (eVar != null) {
                    eVar.f300858d = c2CMsgPreDownloader;
                    this.f300339d = 1;
                    if (((C102007e) ((C36570n) c2CMsgPreDownloader.f272435g).getValue()).mo141503a(eVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
