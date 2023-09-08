package lg1;

import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53953u0;
import android.os.Bundle;
import android.view.ViewGroup;
import cl1.C0668l;
import cl1.C0680q1;
import cl1.C0688s1;
import cl1.C39975j;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.storage.C85801v1;
import d60.C58124b;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import jg1.C9400a;
import o40.C61926c;
import qj1.C62660c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49712hj1;
import te3.C50317lw0;
import te3.C64337e61;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: lg1.e */
public final class C10509e extends C62660c {

    /* renamed from: p */
    public final C13601g f31741p;

    /* renamed from: q */
    public final boolean f31742q;

    /* renamed from: r */
    public C0680q1.C0681a f31743r;

    /* renamed from: lg1.e$a */
    public static final class C10510a extends C87413o implements C32224a<C9400a> {

        /* renamed from: d */
        public final /* synthetic */ MMActivity f31744d;

        /* renamed from: e */
        public final /* synthetic */ C10509e f31745e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10510a(MMActivity mMActivity, C10509e eVar) {
            super(0);
            this.f31744d = mMActivity;
            this.f31745e = eVar;
        }

        public Object invoke() {
            return new C9400a(this.f31744d, new C10508d(this.f31745e));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10509e(MMActivity mMActivity, ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f31741p = C36568h.m40985a(new C10510a(mMActivity, this));
        this.f31742q = mMActivity.getIntent().getBooleanExtra("key_enter_live_param_is_from_chat_group", false);
    }

    /* renamed from: Z0 */
    public final C9400a mo10791Z0() {
        return (C9400a) ((C36570n) this.f31741p).getValue();
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return false;
    }

    /* renamed from: g */
    public void mo10792g(int i) {
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return ((C54991o) mo87696x0(C54991o.class)).f154287Z0 != 1;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        String str;
        String str2;
        Bundle bundle2 = bundle;
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        boolean z = true;
        String str3 = null;
        if (ordinal != 209) {
            if (ordinal == 216) {
                if (!(bundle2 != null ? bundle2.getBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW") : false) && !C0668l.m589e3((C0668l) mo87696x0(C0668l.class), (C64337e61) null, 1, (Object) null)) {
                    C9400a Z0 = mo10791Z0();
                    C50317lw0 value = ((C39975j) mo87696x0(C39975j.class)).f107170j.getValue();
                    if (value == null || (str = value.f137677e) == null) {
                        str = "";
                    }
                    C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                    if (z1Var == null) {
                        str2 = MMApplicationContext.getString(C0966R.string.m3r);
                        C87412m.m108593f(str2, "getString(R.string.finde…_gala_bottom_content_box)");
                    } else {
                        str2 = ((C75339i) C86312j.m106911c(C75339i.class)).pv0(z1Var, str);
                        C87412m.m108593f(str2, "getService(IContactCommD…tDisplayName(ct, groupId)");
                    }
                    Z0.f29343f = str2;
                    StringBuilder sb = new StringBuilder();
                    sb.append("isFromChatEnter: ");
                    sb.append(this.f31742q);
                    sb.append(", ");
                    C85801v1 i = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_LIVE_BOX_HINT_INT_SYNC;
                    sb.append(i.mo119689j(aVar, 0) == 0);
                    Log.m105924i("Finder.FinderLiveBoxGroupHintPlugin", sb.toString());
                    if (this.f31742q) {
                        if (C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) != 0) {
                            z = false;
                        }
                        if (z) {
                            C0680q1.C0681a aVar2 = new C0680q1.C0681a(C0680q1.C0682b.LIVE_BOX_TOAST, new C10506b(this), new C10507c(this), (C53953u0) null, 8, (C8480h) null);
                            C61926c.m72668M(new C0688s1((C0680q1) mo87696x0(C0680q1.class), aVar2));
                            this.f31743r = aVar2;
                        }
                    }
                }
            }
        } else if (bundle2 != null && bundle2.getInt("requestCode") == 16) {
            boolean z2 = bundle2.getBoolean("is_share_success");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("current_group_select");
            if (z2) {
                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                    z = false;
                }
                if (!z) {
                    C53895h.m60466d(C53930o0.m60554a(C53872d1.f151119c), (C66212f) null, (C53934p0) null, new C10511f(stringArrayList, this, (C15601d<? super C10511f>) null), 3, (Object) null);
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("handleShareToChatGroup: ");
            sb4.append(z2);
            sb4.append(" groupId: ");
            if (stringArrayList != null) {
                str3 = C110818d0.m150921S(stringArrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null);
            }
            sb4.append(str3);
            Log.m105924i("Finder.FinderLiveBoxGroupHintPlugin", sb4.toString());
        }
    }
}
