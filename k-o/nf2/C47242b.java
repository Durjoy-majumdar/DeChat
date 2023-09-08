package nf2;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.profile.p088ui.tab.list.BizProfileTabMsgFragment;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ke3.C88144b;
import kf2.C46720a;
import kf2.C46721b;
import mf2.C47023f;
import rx3.C13598b0;

/* renamed from: nf2.b */
public final class C47242b extends C87413o implements C32226l<C47023f, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BizProfileTabMsgFragment f126825d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47242b(BizProfileTabMsgFragment bizProfileTabMsgFragment) {
        super(1);
        this.f126825d = bizProfileTabMsgFragment;
    }

    public Object invoke(Object obj) {
        C47023f fVar = (C47023f) obj;
        C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
        Intent intent = new Intent();
        C46721b bVar = new C46721b();
        bVar.f125775a = 2001;
        bVar.f125776b = false;
        C46720a.f125771a.mo71961a(bVar);
        Log.m105924i(this.f126825d.f115700j, "user click topic item");
        intent.putExtra("rawUrl", fVar.f126381d.f133512f);
        intent.putExtra("geta8key_scene", 3);
        C88144b.m109791i(this.f126825d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        return C13598b0.f38549a;
    }
}
