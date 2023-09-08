package j10;

import a14.C0000n0;
import android.util.Base64;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import f10.C45736a;
import fy3.C32227p;
import g10.C59346f;
import gy3.C87412m;
import hz2.C60235a;
import j10.C60711a;
import java.util.LinkedList;
import kotlin.ResultKt;
import l10.C61186f;
import l10.C61187k;
import p773yy.C53636g;
import p773yy.C66709i;
import p773yy.C66710j;
import rx3.C13598b0;
import sx3.C110818d0;
import uz2.C52678e0;
import uz2.C52725x;
import uz2.C65488a0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

@C91590f(mo125468c = "com.tencent.mm.flutter.plugin.data_sources.text_status.TextStatusDataSource$getStatus$2", mo125469f = "TextStatusDataSource.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: j10.c */
public final class C60715c extends C91594j implements C32227p<C0000n0, C15601d<? super C61186f>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f172929d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60715c(String str, C15601d<? super C60715c> dVar) {
        super(2, dVar);
        this.f172929d = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60715c(this.f172929d, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60715c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        Class cls = C66709i.class;
        Class cls2 = C53636g.class;
        ResultKt.throwOnFailure(obj);
        C61186f fVar = new C61186f();
        if (C45736a.m51015a(this.f172929d)) {
            Log.m105924i("MicroMsg.TextStatusDataSource", "do not show text status cause in black list!");
            return fVar;
        }
        C66710j MM = ((C66709i) C86312j.m106911c(cls)).mo90746MM(this.f172929d);
        if (MM == null) {
            return fVar;
        }
        C61187k kVar = new C61187k();
        kVar.f174183d = MM.mo72942h1();
        kVar.f174192p = MM.mo72935H1();
        int mediaType = MM.getMediaType();
        boolean z = true;
        kVar.f174185f = (mediaType != 1 ? mediaType != 2 ? C60711a.C60712a.None : C60711a.C60712a.Video : C60711a.C60712a.Image).ordinal();
        kVar.f174190n = MM.mo72936N1();
        kVar.f174191o = MM.mo72937S1();
        kVar.f174184e = ((long) MM.getCreateTime()) * 1000;
        kVar.f174189j = MM.getDescription();
        C52725x eC = ((C53636g) C86312j.m106911c(cls2)).mo74102eC(((C53636g) C86312j.m106911c(cls2)).mo74103iM(MM.mo72949x()));
        String str = null;
        if (eC == null) {
            eC = ((C53636g) C86312j.m106911c(cls2)).mo74100Cg(C66710j.C53637a.m60171a(MM, false, 1, (Object) null).f147093j);
        }
        C52678e0 a = C66710j.C53637a.m60171a(MM, false, 1, (Object) null);
        kVar.f174198v = "0";
        String d = C60235a.m70504d(a);
        if (d != null && !C112551y.m153811k(d)) {
            z = false;
        }
        if (!z) {
            C65488a0 ef = ((C66709i) C86312j.m106911c(cls)).mo90747ef(a.f147090g);
            if (ef != null && C87412m.m108589b(ef.f188439d, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY)) {
                byte[] decode = Base64.decode(ef.f188441f, 0);
                FinderObject finderObject = new FinderObject();
                finderObject.parseFrom(decode);
                kVar.f174194r = C59346f.m69264a(finderObject);
            }
            LinkedList<C65488a0> linkedList = a.f147090g;
            C87412m.m108593f(linkedList, "topicInfo.jumpInfos");
            C65488a0 a0Var = (C65488a0) C110818d0.m150916N(linkedList);
            if (a0Var != null) {
                kVar.f174198v = a0Var.f188439d;
            }
        }
        kVar.f174196t = C60235a.m70503c(a);
        kVar.f174197u = C60235a.m70505e(a);
        kVar.f174187h = ((C53636g) C86312j.m106911c(cls2)).mo74101GC(a);
        if (eC != null) {
            str = eC.f147281d;
        }
        kVar.f174186g = str;
        kVar.f174188i = a.f147088e;
        kVar.f174195s = MM.mo72933B0();
        kVar.f174193q = MM.mo72934H0();
        if (!C87412m.m108589b(kVar.f174198v, "0")) {
            kVar.f174185f = 0;
            kVar.f174193q = "text_state_default_image_2";
        }
        fVar.f174182d = kVar;
        return fVar;
    }
}
