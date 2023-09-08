package kq1;

import a14.C0000n0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import p1081gi.C98124g;
import p663qo.C101213l;
import p707tz.C64999e;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.uic.FinderPostAudioUIC$extractAudio$1", mo125469f = "FinderPostAudioUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: kq1.d */
public final class C61135d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C61136e f174046d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61135d(C61136e eVar, C15601d<? super C61135d> dVar) {
        super(2, dVar);
        this.f174046d = eVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61135d(this.f174046d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61135d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        String AQ = ((C64999e) C86312j.m106911c(C64999e.class)).mo89156AQ(this.f174046d.f174048e);
        Log.m105924i("FinderPostAudioUIC", "extractAudio exists:" + C86013q1.m106450k(AQ) + ", audioPath:" + AQ);
        C61136e eVar = this.f174046d;
        C87412m.m108593f(AQ, "audioPath");
        eVar.getClass();
        if (!C86013q1.m106450k(AQ)) {
            Log.m105924i("FinderPostAudioUIC", "audio track " + AQ + " is not file");
        } else {
            C98124g gVar = new C98124g();
            gVar.f287662f = eVar;
            String str = "upload_" + MD5Util.getMD5String(AQ);
            eVar.f174049f = str;
            gVar.field_mediaId = str;
            gVar.field_fullpath = AQ;
            gVar.field_needStorage = true;
            gVar.field_fileType = 20305;
            gVar.field_appType = 251;
            gVar.f287655L = 8;
            gVar.field_bzScene = 2;
            gVar.f287673t = 60;
            gVar.f287674u = 600;
            gVar.field_priority = 2;
            ((C101213l) C86312j.m106911c(C101213l.class)).if0(gVar);
        }
        return C13598b0.f38549a;
    }
}
