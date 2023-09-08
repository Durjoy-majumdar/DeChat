package p177ji;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f62.C7994b0;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import p177ji.C9438a;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: ji.b */
public final class C9455b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C89779i0> f29522d;

    /* renamed from: e */
    public final /* synthetic */ int f29523e;

    /* renamed from: f */
    public final /* synthetic */ int f29524f;

    /* renamed from: g */
    public final /* synthetic */ C9438a.C9443d f29525g;

    /* renamed from: h */
    public final /* synthetic */ C7994b0.C7997c f29526h;

    /* renamed from: i */
    public final /* synthetic */ Context f29527i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9455b(C8479f0<C89779i0> f0Var, int i, int i2, C9438a.C9443d dVar, C7994b0.C7997c cVar, Context context) {
        super(0);
        this.f29522d = f0Var;
        this.f29523e = i;
        this.f29524f = i2;
        this.f29525g = dVar;
        this.f29526h = cVar;
        this.f29527i = context;
    }

    public Object invoke() {
        C89779i0 i0Var = (C89779i0) this.f29522d.f27484d;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (this.f29523e == 0 && this.f29524f == 0 && !Util.isNullOrNil(this.f29525g.f127466h)) {
            Log.m105924i("MicroMsg.ChatRoomOpenService", "doAppCreateChatRoom success");
            C7994b0.C7997c cVar = this.f29526h;
            if (cVar != null) {
                cVar.mo1114a(true, (String) null, this.f29525g.f127466h);
            }
        } else {
            C7994b0.C7997c cVar2 = this.f29526h;
            if (cVar2 != null) {
                cVar2.mo1114a(false, (String) null, (String) null);
            }
            String string = this.f29527i.getString(C0966R.string.f360942g51);
            C87412m.m108593f(string, "context.getString(R.stri…ing_create_chatroom_fail)");
            C76912y0.m92767f(MMApplicationContext.getContext(), string);
        }
        return C13598b0.f38549a;
    }
}
