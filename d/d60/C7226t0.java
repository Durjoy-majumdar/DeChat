package d60;

import a60.C53979a;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.plugin.gif.MMAnimateView;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import d60.C58124b;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import o40.C61926c;
import p50.C62197e;
import p629ny.C76979h;
import rx3.C13598b0;
import y50.C53496k;

/* renamed from: d60.t0 */
public final class C7226t0 extends C58121a {

    /* renamed from: f */
    public final C58124b f25284f;

    /* renamed from: g */
    public final TextView f25285g;

    /* renamed from: d60.t0$a */
    public static final class C7227a extends C87413o implements C32229r<Long, String, String, String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7226t0 f25286d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f25287e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7227a(C7226t0 t0Var, ViewGroup viewGroup) {
            super(4);
            this.f25286d = t0Var;
            this.f25287e = viewGroup;
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            ((Number) obj).longValue();
            String str = (String) obj2;
            String str2 = (String) obj4;
            C87412m.m108594g(str, "uid");
            C87412m.m108594g((String) obj3, "headImg");
            C87412m.m108594g(str2, "nickName");
            RoomLiveService.f157207r = str;
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
            if (z1Var != null) {
                C61926c.m72668M(new C7224r0(this.f25286d, this.f25287e, z1Var, str));
                String nickname = z1Var.getNickname();
                C87412m.m108593f(nickname, "contact.nickname");
                RoomLiveService.f157206q = nickname;
                C53496k kVar = C53496k.f150436a;
                String nickname2 = z1Var.getNickname();
                C87412m.m108593f(nickname2, "contact.nickname");
                kVar.mo74168a(true, nickname2);
            }
            if (z1Var == null) {
                C61926c.m72668M(new C7225s0(this.f25286d, this.f25287e, str2, str));
                RoomLiveService.f157206q = str2;
                C53496k.f150436a.mo74168a(true, str2);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7226t0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25284f = bVar;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.fwo);
        this.f25285g = textView;
        viewGroup.setVisibility(4);
        C53979a aVar = RoomLiveService.f157185Q;
        C7227a aVar2 = new C7227a(this, viewGroup);
        aVar.getClass();
        aVar.f151230e = aVar2;
        textView.requestLayout();
        ((MMAnimateView) viewGroup.findViewById(C0966R.C0970id.fwm)).setImageResource(C0966R.raw.live_micing_icon);
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C60735a aVar;
        C72996z1 z1Var;
        Class cls = C76979h.class;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 7) {
            if (this.f25284f.getLiveRole() == 1) {
                if (C54655b.f153178f1 == null) {
                    C54655b.f153178f1 = new C54655b();
                }
                aVar = C54655b.f153178f1;
                C87412m.m108591d(aVar);
            } else {
                if (C62197e.f176819i1 == null) {
                    C62197e.f176819i1 = new C62197e();
                }
                aVar = C62197e.f176819i1;
                C87412m.m108591d(aVar);
            }
            if (aVar.f172989A.mo82884f() || aVar.f172989A.mo82882d()) {
                mo10792g(0);
                if (this.f25284f.getLiveRole() == 1) {
                    TextView textView = this.f25285g;
                    Context context = this.f166287d.getContext();
                    Context context2 = this.f166287d.getContext();
                    RoomLiveService roomLiveService = RoomLiveService.f157190a;
                    textView.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(context, context2.getString(C0966R.string.g_b, new Object[]{RoomLiveService.f157206q})));
                    return;
                }
                RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
                if (Util.isEqual(RoomLiveService.f157207r, C75592q0.m90789s())) {
                    this.f25285g.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f166287d.getContext(), this.f166287d.getContext().getString(C0966R.string.g_d)));
                    return;
                }
                this.f25285g.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f166287d.getContext(), this.f166287d.getContext().getString(C0966R.string.g_c, new Object[]{RoomLiveService.f157206q})));
            }
        } else if (ordinal == 16 || ordinal == 18) {
            mo10792g(8);
            C53496k kVar = C53496k.f150436a;
            RoomLiveService roomLiveService3 = RoomLiveService.f157190a;
            kVar.mo74168a(false, RoomLiveService.f157206q);
            RoomLiveService.f157206q = "";
            RoomLiveService.f157207r = "";
        } else if (ordinal != 27) {
            switch (ordinal) {
                case 12:
                    if (bundle != null) {
                        String string = bundle.getString("PARAM_LIVE_WXID", "");
                        if (!TextUtils.isEmpty(string) && (z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(string)) != null) {
                            this.f25285g.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(this.f166287d.getContext(), this.f166287d.getContext().getString(C0966R.string.g_b, new Object[]{z1Var.getNickname()})));
                            return;
                        }
                        return;
                    }
                    return;
                case 13:
                    mo10792g(0);
                    return;
                case 14:
                    mo10792g(0);
                    return;
                default:
                    return;
            }
        } else {
            mo10792g(8);
        }
    }
}
