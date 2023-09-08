package h60;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d60.C45272n;
import d60.C58124b;
import d60.C58130e0;
import d60.C58192o0;
import d60.C7174c;
import d60.C7182d1;
import d60.C7187e1;
import d60.C7197i;
import d60.C7232x0;
import d60.C7233y;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import kg3.C76577a;
import nj3.C76912y0;
import qo3.C77426q;
import rx3.C13598b0;
import z04.C112550d0;

/* renamed from: h60.f */
public final class C59755f extends C87413o implements C32230s<Boolean, Boolean, String, Integer, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorPluginLayout f170648d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59755f(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        super(5);
        this.f170648d = liveAnchorPluginLayout;
    }

    /* renamed from: D */
    public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        String str = (String) obj3;
        int intValue = ((Number) obj4).intValue();
        String str2 = (String) obj5;
        C87412m.m108594g(str, "verifyUrl");
        C87412m.m108594g(str2, "errMsg");
        if (booleanValue) {
            C58124b.C7172a.m7372a(this.f170648d, C58124b.C58125b.READY, (Bundle) null, 2, (Object) null);
        } else if (booleanValue2) {
            C7187e1 e1Var = this.f170648d.f157286g;
            if (e1Var != null) {
                e1Var.mo10792g(8);
            }
            C7233y yVar = this.f170648d.f157287h;
            if (yVar != null) {
                yVar.mo10792g(0);
            }
            C7174c cVar = this.f170648d.f157289j;
            if (cVar != null) {
                cVar.mo10792g(4);
            }
            C45272n nVar = this.f170648d.f157292p;
            if (nVar != null) {
                nVar.mo10792g(8);
            }
            C58130e0 e0Var = this.f170648d.f157296t;
            if (e0Var != null) {
                e0Var.mo10792g(8);
            }
            C7182d1 d1Var = this.f170648d.f157294r;
            if (d1Var != null) {
                d1Var.mo10792g(8);
            }
            C7232x0 x0Var = this.f170648d.f157291o;
            if (x0Var != null) {
                x0Var.mo10792g(8);
            }
            C7197i iVar = this.f170648d.f157298v;
            if (iVar != null) {
                iVar.mo10792g(8);
            }
            C58192o0 o0Var = this.f170648d.f157302z;
            if (o0Var != null) {
                o0Var.mo10792g(8);
            }
            RoomLiveService.C1270b bVar = RoomLiveService.f157210u;
            bVar.getClass();
            bVar.f10323b = str;
            RoomLiveService.f157210u.f10324c = true;
            this.f170648d.statusChange(C58124b.C58125b.START_FACE_VERIFY, new Bundle());
        } else if (intValue == -100064) {
            Bundle bundle = new Bundle();
            bundle.putInt("PARAM_FACE_VERIFY_ERROR", C0966R.string.g7h);
            this.f170648d.statusChange(C58124b.C58125b.BEFORE_LIVE, bundle);
        } else if (intValue == -100066) {
            Bundle bundle2 = new Bundle();
            String string = this.f170648d.getContext().getResources().getString(C0966R.string.g76);
            C87412m.m108593f(string, "context.resources.getStr…eption_desc_forbid_visit)");
            SpannableString spannableString = new SpannableString(string);
            int E = C112550d0.m153769E(spannableString, "《", 0, false, 6, (Object) null);
            if (E != -1) {
                spannableString.setSpan(new ForegroundColorSpan(this.f170648d.getContext().getResources().getColor(C0966R.color.f2958ae)), E, spannableString.length(), 0);
                spannableString.setSpan(new C59754e(this.f170648d), E, spannableString.length(), 0);
            }
            bundle2.putString("PARAM_LIVE_EXCEPTION_TITLE", this.f170648d.getContext().getResources().getString(C0966R.string.g77));
            bundle2.putCharSequence("PARAM_LIVE_EXCEPTION_DESC", spannableString);
            bundle2.putInt("PARAM_LIVE_EXCEPTION_ICON_RES", C0966R.raw.icons_filled_live_err_red);
            this.f170648d.statusChange(C58124b.C58125b.LIVE_STATUS_EXCEPTION, bundle2);
        } else if (intValue == -100065) {
            LiveAnchorPluginLayout liveAnchorPluginLayout = this.f170648d;
            int i = LiveAnchorPluginLayout.f157266T;
            liveAnchorPluginLayout.mo76509m();
        } else if (intValue == -100002) {
            C77426q qVar = new C77426q(this.f170648d.getContext());
            qVar.mo107606r(this.f170648d.getContext().getResources().getString(C0966R.string.g6u));
            qVar.mo107601m(C0966R.string.f8028zq);
            qVar.mo107600l(C59750a.f170643a);
            qVar.mo107593e(new C59751b(this.f170648d));
            qVar.mo107603o();
        } else if (intValue == -100069) {
            if (Util.isNullOrNil(str2)) {
                str2 = this.f170648d.getContext().getResources().getString(C0966R.string.g8y);
            }
            C87412m.m108593f(str2, "if (Util.isNullOrNil(err… errMsg\n                }");
            C77426q qVar2 = new C77426q(this.f170648d.getContext());
            qVar2.mo107595g(str2);
            qVar2.mo107601m(C0966R.string.f8028zq);
            qVar2.mo107600l(C59752c.f170645a);
            qVar2.mo107593e(new C59753d(this.f170648d));
            qVar2.mo107603o();
        } else {
            String str3 = "create live fail, errCode:" + intValue;
            C87412m.m108594g(str3, "debugText");
            Log.m105924i("MicroMsg.LiveCoreError", str3);
            C76912y0.makeText(this.f170648d.getContext(), (CharSequence) C76577a.m92166q(this.f170648d.getContext(), C0966R.string.g_1), 0).show();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("live_user_exit_reason", intValue);
            this.f170648d.statusChange(C58124b.C58125b.LIVE_START_LIVE_FAILED, bundle3);
        }
        return C13598b0.f38549a;
    }
}
