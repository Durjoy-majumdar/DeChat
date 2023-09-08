package kx0;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C54492n;
import com.tencent.p014mm.autogen.mmdata.rpt.BizRecentReadReportStruct;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import ex0.C45696d;
import f40.C86709a0;
import gy3.C87412m;
import jq3.C60897k;
import jq3.C9493c;
import ke3.C88144b;
import mx0.C47111e;
import mx0.C47118m;
import te3.C49280eg;
import uo3.C78253a;

/* renamed from: kx0.b */
public final class C46760b implements C60897k<C47111e> {

    /* renamed from: a */
    public final /* synthetic */ C46754a f125862a;

    public C46760b(C46754a aVar) {
        this.f125862a = aVar;
    }

    /* renamed from: a */
    public boolean mo2039a(View view, C9493c cVar, int i) {
        C47111e eVar = (C47111e) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(eVar, "data");
        if (eVar.f126588e != C47118m.RECORD) {
            return false;
        }
        C46754a aVar = this.f125862a;
        aVar.getClass();
        Log.m105924i(C54492n.TAG, "popMenu, title:" + eVar.f126587d.f132910f + ", url:" + eVar.f126587d.f132909e);
        C78253a aVar2 = new C78253a(aVar.getContext());
        aVar2.f229257z = false;
        aVar2.mo108273h(view, new C46766f(aVar), new C46767g(aVar, eVar, i), aVar.f125854q, aVar.f125855r);
        return true;
    }

    /* renamed from: b */
    public boolean mo2040b(View view, MotionEvent motionEvent, C9493c cVar, int i) {
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(motionEvent, "event");
        C87412m.m108594g((C47111e) cVar, "item");
        if (motionEvent.getAction() != 0) {
            return false;
        }
        this.f125862a.f125854q = (int) motionEvent.getRawX();
        this.f125862a.f125855r = (int) motionEvent.getRawY();
        return false;
    }

    /* renamed from: c */
    public void mo2041c(View view, C9493c cVar, int i) {
        C47111e eVar = (C47111e) cVar;
        C87412m.m108594g(view, "itemView");
        C87412m.m108594g(eVar, "data");
        if (eVar.f126588e == C47118m.RECORD) {
            this.f125862a.f125844d.add(eVar);
            BizRecentReadReportStruct bizRecentReadReportStruct = new BizRecentReadReportStruct();
            C46754a aVar = this.f125862a;
            bizRecentReadReportStruct.f107859d = 1;
            AppCompatActivity activity = aVar.getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
            bizRecentReadReportStruct.f107860e = ((BizPCRecentReadUI) activity).f109267e;
            bizRecentReadReportStruct.f107861f = bizRecentReadReportStruct.mo86045b("bizuin", eVar.f126587d.f132915n, true);
            C49280eg egVar = eVar.f126587d;
            bizRecentReadReportStruct.f107862g = (long) egVar.f132916o;
            bizRecentReadReportStruct.f107863h = (long) egVar.f132917p;
            bizRecentReadReportStruct.f107864i = 0;
            bizRecentReadReportStruct.f107865j = System.currentTimeMillis();
            bizRecentReadReportStruct.mo86054n();
            C46754a aVar2 = this.f125862a;
            aVar2.getClass();
            Class cls = C45696d.class;
            Log.m105924i(C54492n.TAG, "onClick jump to title:" + eVar.f126587d.f132910f + ", url:" + eVar.f126587d.f132909e);
            Intent intent = new Intent();
            String a = C92721n.m116873a(eVar.f126587d.f132909e, 90, WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES, ((int) System.currentTimeMillis()) / 1000);
            intent.putExtra("rawUrl", a);
            intent.putExtra("geta8key_scene", 56);
            intent.putExtra("srcDisplayname", eVar.f126587d.f132911g);
            if (!((C45696d) C86709a0.m107533q(cls)).mo70957E5(1) || !((C45696d) C86709a0.m107533q(cls)).Ms0(aVar2.getContext(), a, eVar.f126587d.f132914j, false, 90, WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES, intent)) {
                C88144b.m109791i(aVar2.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            } else {
                Log.m105924i(C54492n.TAG, "jump to TmplWebview");
            }
        }
    }
}
