package d60;

import a11.C39479c;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.LiveComplaintStruct;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.p136ui.widget.RoundCornerImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import d60.C58124b;
import di3.C86312j;
import e60.C58532b;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import p196ln.C76705f;
import p629ny.C76979h;
import qo3.C77407n;
import rx3.C13598b0;
import te3.C49317ep2;
import y50.C66519j0;
import y50.C66524m;

/* renamed from: d60.p0 */
public final class C58197p0 extends C58121a implements View.OnClickListener {

    /* renamed from: f */
    public final C58124b f166665f;

    /* renamed from: g */
    public final String f166666g = "MicroMsg.LiveMemberProfilePlugin";

    /* renamed from: h */
    public final int f166667h = 1;

    /* renamed from: i */
    public final View f166668i;

    /* renamed from: j */
    public final TextView f166669j;

    /* renamed from: n */
    public final TextView f166670n;

    /* renamed from: o */
    public final TextView f166671o;

    /* renamed from: p */
    public final TextView f166672p;

    /* renamed from: q */
    public final TextView f166673q;

    /* renamed from: r */
    public final TextView f166674r;

    /* renamed from: s */
    public final RoundCornerImageView f166675s;

    /* renamed from: t */
    public final View f166676t;

    /* renamed from: u */
    public final View f166677u;

    /* renamed from: v */
    public final LiveBottomSheetPanel f166678v;

    /* renamed from: w */
    public C77407n f166679w;

    /* renamed from: x */
    public boolean f166680x;

    /* renamed from: y */
    public String f166681y;

    /* renamed from: z */
    public boolean f166682z;

    /* renamed from: d60.p0$a */
    public static final class C58198a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58197p0 f166683d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58198a(C58197p0 p0Var) {
            super(1);
            this.f166683d = p0Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f166683d.mo10792g(8);
                C58197p0 p0Var = this.f166683d;
                if (p0Var.f166682z) {
                    C58124b.C7172a.m7372a(p0Var.f166665f, C58124b.C58125b.LIVE_STATUS_CLOSE_MEMBER_PROFILE, (Bundle) null, 2, (Object) null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.p0$b */
    public static final class C58199b implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ int f166684d;

        /* renamed from: e */
        public final /* synthetic */ C58197p0 f166685e;

        /* renamed from: f */
        public final /* synthetic */ int f166686f;

        public C58199b(int i, C58197p0 p0Var, int i2) {
            this.f166684d = i;
            this.f166685e = p0Var;
            this.f166686f = i2;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.clear();
            if (this.f166684d == 0) {
                C58197p0 p0Var = this.f166685e;
                e0Var.mo107142f(p0Var.f166667h, p0Var.f166287d.getContext().getResources().getString(this.f166686f));
                return;
            }
            C58197p0 p0Var2 = this.f166685e;
            e0Var.mo107140d(p0Var2.f166667h, p0Var2.f166287d.getContext().getResources().getColor(this.f166684d), this.f166685e.f166287d.getContext().getResources().getString(this.f166686f));
        }
    }

    /* renamed from: d60.p0$c */
    public static final class C58200c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C58197p0 f166687d;

        /* renamed from: e */
        public final /* synthetic */ C32224a<C13598b0> f166688e;

        public C58200c(C58197p0 p0Var, C32224a<C13598b0> aVar) {
            this.f166687d = p0Var;
            this.f166688e = aVar;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            C87412m.m108594g(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            this.f166687d.getClass();
            if (itemId != 0) {
                C58197p0 p0Var = this.f166687d;
                if (itemId == p0Var.f166667h) {
                    this.f166688e.invoke();
                    C77407n nVar = this.f166687d.f166679w;
                    if (nVar != null) {
                        nVar.mo107572p();
                        return;
                    }
                    return;
                }
                C77407n nVar2 = p0Var.f166679w;
                if (nVar2 != null) {
                    nVar2.mo107572p();
                }
            }
        }
    }

    /* renamed from: d60.p0$d */
    public static final class C58201d implements C77407n.C12924o {

        /* renamed from: a */
        public final /* synthetic */ C32224a<C13598b0> f166689a;

        public C58201d(C32224a<C13598b0> aVar) {
            this.f166689a = aVar;
        }

        /* renamed from: a */
        public final void mo2362a() {
            C32224a<C13598b0> aVar = this.f166689a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: d60.p0$e */
    public static final class C58202e implements C77407n.C47880p {

        /* renamed from: a */
        public final /* synthetic */ C58197p0 f166690a;

        public C58202e(C58197p0 p0Var) {
            this.f166690a = p0Var;
        }

        public final void onDismiss() {
            this.f166690a.f166679w = null;
        }
    }

    /* renamed from: d60.p0$f */
    public static final class C58203f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58197p0 f166691d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58203f(C58197p0 p0Var) {
            super(0);
            this.f166691d = p0Var;
        }

        public Object invoke() {
            Bundle bundle = new Bundle();
            String str = this.f166691d.f166681y;
            if (str == null) {
                str = "";
            }
            bundle.putString("PARAM_LIVE_KICK_USERNAME", str);
            this.f166691d.f166665f.statusChange(C58124b.C58125b.LIVE_STATUS_KICK_MEMBER, bundle);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.p0$g */
    public static final class C58204g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C58204g f166692d = new C58204g();

        public C58204g() {
            super(0);
        }

        public Object invoke() {
            C66519j0.f191358d.mo90597a(true);
            String str = RoomLiveService.f157192c;
            long j = RoomLiveService.f157197h.f133050d;
            String str2 = RoomLiveService.f157199j;
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            C58532b.m67947c(str, j, str2, 11, 2, s, RoomLiveService.f157197h.f133055i);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.p0$h */
    public static final class C58205h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C58205h f166693d = new C58205h();

        public C58205h() {
            super(0);
        }

        public Object invoke() {
            String str = RoomLiveService.f157192c;
            long j = RoomLiveService.f157197h.f133050d;
            String str2 = RoomLiveService.f157199j;
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            C58532b.m67947c(str, j, str2, 11, 3, s, RoomLiveService.f157197h.f133055i);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58197p0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166665f = bVar;
        this.f166668i = viewGroup.findViewById(C0966R.C0970id.fw8);
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.fw7);
        this.f166669j = textView;
        TextView textView2 = (TextView) viewGroup.findViewById(C0966R.C0970id.fw9);
        this.f166670n = textView2;
        TextView textView3 = (TextView) viewGroup.findViewById(C0966R.C0970id.fw6);
        this.f166671o = textView3;
        this.f166672p = (TextView) viewGroup.findViewById(C0966R.C0970id.f358578fw1);
        this.f166673q = (TextView) viewGroup.findViewById(C0966R.C0970id.f358579fw2);
        this.f166674r = (TextView) viewGroup.findViewById(C0966R.C0970id.f358580fw3);
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) viewGroup.findViewById(C0966R.C0970id.fw5);
        this.f166675s = roundCornerImageView;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fvy);
        this.f166676t = findViewById;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fvx);
        this.f166677u = findViewById2;
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) viewGroup.findViewById(C0966R.C0970id.fvz);
        this.f166678v = liveBottomSheetPanel;
        liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(viewGroup.getContext()).y);
        liveBottomSheetPanel.setOnVisibilityListener(new C58198a(this));
        if (liveBottomSheetPanel != null) {
            ViewGroup.LayoutParams layoutParams = liveBottomSheetPanel.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                if (!mo82893g0()) {
                    liveBottomSheetPanel.setPadding(liveBottomSheetPanel.getPaddingLeft(), liveBottomSheetPanel.getPaddingTop(), liveBottomSheetPanel.getPaddingRight(), C75044y4.m89991c(viewGroup.getContext()));
                } else {
                    layoutParams.width = C75044y4.m89990b(viewGroup.getContext()).y;
                    ((LinearLayout.LayoutParams) layoutParams).gravity = 1;
                }
            }
        }
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        roundCornerImageView.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        textView3.setOnClickListener(this);
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (mo14483f0() != 0) {
            return false;
        }
        this.f166678v.mo78802a();
        return true;
    }

    public void onClick(View view) {
        int i;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        boolean z = false;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fw7) {
            C58124b.C7172a.m7372a(this.f166665f, C58124b.C58125b.LIVE_STATUS_EXPOSE_MEMBER, (Bundle) null, 2, (Object) null);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            String str = RoomLiveService.f157192c;
            long j = RoomLiveService.f157197h.f133050d;
            String str2 = RoomLiveService.f157199j;
            String s = C75592q0.m90789s();
            C87412m.m108593f(s, "getUsernameFromUserInfo()");
            C58532b.m67947c(str, j, str2, 10, 1, s, RoomLiveService.f157197h.f133055i);
            String str3 = RoomLiveService.f157192c;
            C49317ep2 ep22 = RoomLiveService.f157197h;
            long j2 = ep22.f133050d;
            String str4 = ep22.f133051e;
            int i2 = ep22.f133055i;
            String str5 = RoomLiveService.f157199j;
            C87412m.m108594g(str3, "roomId");
            C87412m.m108594g(str5, "liveUserName");
            LiveComplaintStruct liveComplaintStruct = new LiveComplaintStruct();
            liveComplaintStruct.f156366e = liveComplaintStruct.mo86045b("roomid", str3, true);
            liveComplaintStruct.f156367f = j2;
            liveComplaintStruct.f156372k = liveComplaintStruct.mo86045b("liveusername", str5, true);
            liveComplaintStruct.f156365d = 1;
            liveComplaintStruct.f156368g = liveComplaintStruct.mo86045b("topic", str4, true);
            liveComplaintStruct.f156371j = (long) i2;
            String s2 = C75592q0.m90789s();
            C87412m.m108593f(s2, "getUsernameFromUserInfo()");
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(str3);
            if (Lo != null && Lo.mo69793u2(s2)) {
                i = 2;
            } else {
                i = Lo != null && Lo.mo69796x2(s2) ? 1 : 3;
            }
            liveComplaintStruct.f156370i = (long) i;
            liveComplaintStruct.mo86054n();
            Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markComplaintAnchor");
            C115669n.INSTANCE.mo175913w(1381, 4, 1);
            Intent intent = new Intent();
            intent.putExtra("showShare", false);
            String str6 = C66524m.f191363a;
            String format = String.format(C66524m.f191363a, Arrays.copyOf(new Object[]{59, Long.valueOf(RoomLiveService.f157197h.f133050d), this.f166681y, RoomLiveService.f157192c}, 4));
            C87412m.m108593f(format, "format(format, *args)");
            intent.putExtra("rawUrl", format);
            C88144b.m109791i(this.f166287d.getContext(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fw9) {
            mo82956x0(C0966R.string.g85, C0966R.string.g84, C0966R.color.BW_0_Alpha_0_5, C0966R.color.f356948a24, new C58203f(this), (C32224a<C13598b0>) null);
            C77407n nVar = this.f166679w;
            if (nVar != null) {
                nVar.mo107573q();
            }
        } else if (valueOf == null || valueOf.intValue() != C0966R.C0970id.fw5) {
            if ((valueOf != null && valueOf.intValue() == C0966R.C0970id.fvy) || (valueOf != null && valueOf.intValue() == C0966R.C0970id.fvx)) {
                z = true;
            }
            if (z) {
                this.f166678v.mo78802a();
            } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fw6) {
                RoomLiveService roomLiveService2 = RoomLiveService.f157190a;
                String str7 = RoomLiveService.f157192c;
                long j3 = RoomLiveService.f157197h.f133050d;
                String str8 = RoomLiveService.f157199j;
                String s3 = C75592q0.m90789s();
                C87412m.m108593f(s3, "getUsernameFromUserInfo()");
                C58532b.m67947c(str7, j3, str8, 11, 1, s3, RoomLiveService.f157197h.f133055i);
                mo82956x0(C0966R.string.g8h, C0966R.string.g8g, C0966R.color.BW_0_Alpha_0_5, C0966R.color.f356948a24, C58204g.f166692d, C58205h.f166693d);
                C77407n nVar2 = this.f166679w;
                if (nVar2 != null) {
                    nVar2.mo107573q();
                }
                this.f166678v.mo78802a();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 40) {
            this.f166678v.mo78802a();
        } else if (ordinal == 46) {
            mo10792g(0);
            String string = bundle != null ? bundle.getString("PARAM_MEMBERS_PROFILE_USERNAME") : null;
            this.f166682z = bundle != null ? bundle.getBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE") : false;
            String str = this.f166666g;
            Log.m105924i(str, "updateProfileInfo:" + string);
            this.f166681y = string;
            if (string != null) {
                ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f166675s, string);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(string);
                if (z1Var != null) {
                    this.f166672p.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f166287d.getContext(), RoomLiveService.f157190a.mo76443a(string), this.f166672p.getTextSize()));
                    StringBuffer stringBuffer = new StringBuffer();
                    int i = z1Var.f149500H;
                    if (i == 1) {
                        stringBuffer.append(this.f166287d.getContext().getResources().getString(C0966R.string.f361346j32));
                        stringBuffer.append(" ");
                    } else if (i == 2) {
                        stringBuffer.append(this.f166287d.getContext().getResources().getString(C0966R.string.f361345j31));
                        stringBuffer.append(" ");
                    }
                    stringBuffer.append(z1Var.f149518V);
                    stringBuffer.append(" ");
                    stringBuffer.append(z1Var.f149520W);
                    if (Util.isNullOrNil((CharSequence) stringBuffer)) {
                        this.f166673q.setVisibility(8);
                    } else {
                        this.f166673q.setVisibility(0);
                        this.f166673q.setText(stringBuffer);
                    }
                    if (Util.isNullOrNil(z1Var.f149516U)) {
                        this.f166674r.setVisibility(8);
                    } else {
                        this.f166674r.setVisibility(0);
                        this.f166674r.setText(z1Var.f149516U);
                    }
                }
            }
            C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69799Lo(RoomLiveService.f157192c);
            if (this.f166680x) {
                if (Util.isEqual(C75592q0.m90789s(), string)) {
                    View view = this.f166668i;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    this.f166671o.setVisibility(8);
                    this.f166670n.setVisibility(0);
                    this.f166669j.setVisibility(0);
                    View view3 = this.f166668i;
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    View view4 = view3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else if (Util.isEqual(C75592q0.m90789s(), string)) {
                View view5 = this.f166668i;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(4);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (Util.isEqual(string, RoomLiveService.f157199j)) {
                this.f166671o.setVisibility(8);
                this.f166670n.setVisibility(8);
                this.f166669j.setVisibility(0);
                View view7 = this.f166668i;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar4.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (Lo != null) {
                    if (Lo.mo69796x2(C75592q0.m90789s()) || Lo.mo69793u2(C75592q0.m90789s())) {
                        this.f166671o.setVisibility(0);
                    } else {
                        this.f166671o.setVisibility(8);
                    }
                }
            } else {
                this.f166671o.setVisibility(8);
                this.f166670n.setVisibility(8);
                this.f166669j.setVisibility(0);
                View view9 = this.f166668i;
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view10 = view9;
                C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/live/plugin/LiveMemberProfilePlugin", "updateProfileInfo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f166678v.mo78804d();
        }
    }

    /* renamed from: x0 */
    public final void mo82956x0(int i, int i2, int i3, int i4, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2) {
        if (this.f166679w == null) {
            C77407n nVar = new C77407n(this.f166287d.getContext(), 1, true);
            this.f166679w = nVar;
            nVar.f225775k1 = true;
            View inflate = View.inflate(this.f166287d.getContext(), C0966R.C0971layout.b6k, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.fs_)).setText(this.f166287d.getContext().getString(i));
            C77407n nVar2 = this.f166679w;
            if (nVar2 != null) {
                nVar2.mo107569n(inflate, false);
            }
        }
        C77407n nVar3 = this.f166679w;
        if (nVar3 != null) {
            nVar3.mo107570o(true);
        }
        C77407n nVar4 = this.f166679w;
        if (nVar4 != null) {
            nVar4.mo107567l((View) null);
        }
        C77407n nVar5 = this.f166679w;
        if (nVar5 != null) {
            nVar5.f225771i = new C58199b(i4, this, i2);
        }
        if (nVar5 != null) {
            nVar5.f225782p = new C58200c(this, aVar);
        }
        if (nVar5 != null) {
            nVar5.f225802y = new C58201d(aVar2);
        }
        if (nVar5 != null) {
            nVar5.f225761d = new C58202e(this);
        }
    }
}
