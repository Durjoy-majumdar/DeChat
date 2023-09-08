package com.tencent.p014mm.plugin.webview.p128ui.tools.media;

import android.os.Bundle;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import eb0.C75592q0;
import eb0.C86493v0;
import gy3.C87412m;
import java.util.LinkedList;
import kotlin.Metadata;
import s90.C48300n;
import te3.C101755ad0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import te3.C101841sc0;
import te3.C49399fa;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.u */
public final class C96674u {

    /* renamed from: a */
    public static final C96674u f283144a = new C96674u();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/media/u$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/media/MpVideoDataParcelable;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.u$a */
    public static final class C44087a implements C80883e<MpVideoDataParcelable, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            MpVideoDataParcelable mpVideoDataParcelable = (MpVideoDataParcelable) obj;
            C87412m.m108594g(mpVideoDataParcelable, "data");
            C87412m.m108594g(gVar, "callback");
            C96674u.f283144a.mo134852b(mpVideoDataParcelable.f119400h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.media.u$b */
    public static final class C44088b<T> implements C1256g {

        /* renamed from: d */
        public static final C44088b<T> f119437d = new C44088b<>();

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
        }
    }

    /* renamed from: a */
    public final void mo134851a(C48300n nVar) {
        C87412m.m108594g(nVar, "msgInfo");
        MpVideoDataParcelable mpVideoDataParcelable = new MpVideoDataParcelable();
        mpVideoDataParcelable.f119400h = nVar;
        C80907o.m98781d(WeChatProcess.PROCESS_MAIN, mpVideoDataParcelable, C44087a.class, C44088b.f119437d);
    }

    /* renamed from: b */
    public final void mo134852b(C49399fa faVar) {
        if (faVar == null) {
            Log.m105928w("MicroMsg.MpShareVideoMsgFav", "doFav msgInfo is null");
            return;
        }
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C86493v0.C86495c c = C86493v0.m107224d().mo120947c(C86493v0.m107223a(Util.nullAsNil(faVar.f133377r)), true);
        C87412m.m108591d(c);
        c.mo120962i("sendAppMsgScene", 2);
        c.mo120962i("preChatName", faVar.f133378s);
        c.mo120962i("prePublishId", faVar.f133377r);
        c.mo120962i("preUsername", faVar.f133379t);
        c.mo120962i("referUrl", faVar.f133374o);
        doFavoriteEvent.f264674d.f264688m = 36;
        C101801kd0 kd02 = new C101801kd0();
        C101835rd0 rd02 = new C101835rd0();
        rd02.mo141275k(C75592q0.m90789s());
        rd02.mo141279o(C75592q0.m90789s());
        rd02.mo141277m(4);
        rd02.mo141273f(Util.nowMilliSecond());
        rd02.mo141276l(faVar.f133374o);
        kd02.mo141219q(rd02);
        C101834rc0 rc02 = new C101834rc0();
        rc02.f299284V = "";
        rc02.mo141267w(faVar.f133370h);
        rc02.mo141259o(MD5Util.getMD5String(faVar.f133368f + faVar.f133366d));
        rc02.mo141266v(faVar.f133371i);
        rc02.mo141246U(faVar.f133369g);
        rc02.mo141242Q(faVar.f133374o);
        rc02.mo141231E(true);
        rc02.mo141232F(true);
        C101755ad0 ad02 = new C101755ad0();
        ad02.f297854j = faVar.f133368f;
        ad02.f297861t = faVar.f133367e;
        ad02.f297860s = faVar.f133366d;
        ad02.f297855n = faVar.f133375p;
        ad02.f297856o = faVar.f133376q;
        ad02.f297859r = faVar.f133370h;
        ad02.f297850f = faVar.f133372j;
        ad02.f297851g = faVar.f133373n;
        ad02.f297853i = faVar.f133371i;
        C101841sc0 sc02 = new C101841sc0();
        sc02.f299422x = ad02;
        rc02.f299296c1 = sc02;
        LinkedList linkedList = new LinkedList();
        linkedList.add(rc02);
        kd02.mo141211f(linkedList);
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264676a = kd02;
        aVar.f264678c = 4;
        rc02.mo141260p(4);
        doFavoriteEvent.publish();
    }
}
