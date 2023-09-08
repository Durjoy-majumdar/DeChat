package hi2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.ResultKt;
import mp3.C88819d;
import ob0.C89132b;
import org.json.JSONObject;
import p663qo.C101211h;
import q40.C89456b;
import rx3.C13598b0;
import te3.C51860wo0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;

@C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.util.RemuxCheckThirdPartyVideo$checkThirdPartyVideo$2", mo125469f = "RemuxCheckThirdPartyVideo.kt", mo125470l = {32}, mo125471m = "invokeSuspend")
/* renamed from: hi2.s */
public final class C46074s extends C91594j implements C32227p<C0000n0, C15601d<? super C46073r>, Object> {

    /* renamed from: d */
    public int f124223d;

    /* renamed from: e */
    public final /* synthetic */ String f124224e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46074s(String str, C15601d<? super C46074s> dVar) {
        super(2, dVar);
        this.f124224e = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C46074s(this.f124224e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C46074s) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f124223d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String videoMetaData = SightVideoJNI.getVideoMetaData(this.f124224e);
            if (videoMetaData == null || videoMetaData.length() == 0) {
                return null;
            }
            try {
                String optString = new JSONObject(videoMetaData).optString("description");
                if (C87412m.m108589b(optString != null ? C112550d0.m153799i0(optString).toString() : null, "miaojian")) {
                    String k7 = ((C101211h) C86312j.m106911c(C101211h.class)).mo140292k7(this.f124224e);
                    Log.m105924i("MicroMsg.RemuxCheckThirdPartyVideo", "checkThirdPartyVideo md5:" + k7 + ", videoPath:" + this.f124224e);
                    C89132b<C51860wo0> miaojianCgi = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76861l7().getMiaojianCgi(k7);
                    C87412m.m108593f(miaojianCgi, "cgi");
                    this.f124223d = 1;
                    obj = C89456b.m111831a(miaojianCgi, 0, (C88819d) null, this, 3, (Object) null);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        } else if (i == 1) {
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.RemuxCheckThirdPartyVideo", e, "miaojian cgi error:" + e, new Object[0]);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C51860wo0 wo02 = (C51860wo0) obj;
        if (wo02 == null) {
            return null;
        }
        Log.m105924i("MicroMsg.RemuxCheckThirdPartyVideo", "checkThirdPartyVideo exist:" + wo02.f144169d + ", jianTongKuanMeta:" + wo02.f144170e);
        boolean z = wo02.f144169d;
        String str = wo02.f144170e;
        if (str == null) {
            str = "";
        }
        return new C46073r(z, str);
    }
}
