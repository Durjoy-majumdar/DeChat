package iv1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ev1.C31726h;
import ev1.C58848l;
import fy3.C32226l;
import gy3.C87412m;
import kr0.C76629w0;
import rx3.C13598b0;

/* renamed from: iv1.b */
public final class C60636b implements C76629w0.C61144a {

    /* renamed from: a */
    public final /* synthetic */ C31726h f172744a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<C58848l, C13598b0> f172745b;

    public C60636b(C31726h hVar, C32226l<? super C58848l, C13598b0> lVar) {
        this.f172744a = hVar;
        this.f172745b = lVar;
    }

    /* renamed from: a */
    public final void mo21208a(WxaAttributes wxaAttributes) {
        if (wxaAttributes != null) {
            Log.m105924i("ForceNotifyUtil", "transformMsgItem, forcePushId:" + this.f172744a.field_ForcePushId + " username:" + this.f172744a.field_UserName + " nickname:" + this.f172744a.field_Description + " avatarUrl:" + wxaAttributes.field_brandIconURL);
            C32226l<C58848l, C13598b0> lVar = this.f172745b;
            C31726h hVar = this.f172744a;
            String str = hVar.field_ForcePushId;
            String str2 = hVar.field_UserName;
            String str3 = hVar.field_Description;
            long j = hVar.field_CreateTime;
            String string = MMApplicationContext.getContext().getString(C0966R.string.f1n);
            String str4 = wxaAttributes.field_brandIconURL;
            C87412m.m108593f(str, "field_ForcePushId");
            C87412m.m108593f(str2, "field_UserName");
            C87412m.m108593f(str3, "field_Description");
            C87412m.m108593f(string, "getString(R.string.force_notify_receive_a_msg)");
            lVar.invoke(new C58848l(str, str2, str3, string, j, str4));
        }
    }
}
