package d60;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import i60.C8855f;
import i60.C8858i;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C89779i0;
import rx3.C13598b0;
import rx3.C13604l;
import y50.C53496k;
import z50.C16103b;
import z50.C16104c;
import z50.C16105d;

/* renamed from: d60.q0 */
public final class C7219q0 extends C58121a implements C11385n, View.OnClickListener {

    /* renamed from: A */
    public final ArrayList<Integer> f25251A;

    /* renamed from: B */
    public String f25252B;

    /* renamed from: C */
    public boolean f25253C;

    /* renamed from: f */
    public final C58124b f25254f;

    /* renamed from: g */
    public final String f25255g = "MicroMsg.LiveMembersListPlugin";

    /* renamed from: h */
    public final int f25256h = 1;

    /* renamed from: i */
    public final ImageView f25257i;

    /* renamed from: j */
    public final TextView f25258j;

    /* renamed from: n */
    public final TextView f25259n;

    /* renamed from: o */
    public final TextView f25260o;

    /* renamed from: p */
    public final RecyclerView f25261p;

    /* renamed from: q */
    public final LiveBottomSheetPanel f25262q;

    /* renamed from: r */
    public final ProgressBar f25263r;

    /* renamed from: s */
    public final View f25264s;

    /* renamed from: t */
    public final TextView f25265t;

    /* renamed from: u */
    public final C8855f f25266u;

    /* renamed from: v */
    public final View f25267v;

    /* renamed from: w */
    public C89779i0 f25268w;

    /* renamed from: x */
    public final ArrayList<String> f25269x;

    /* renamed from: y */
    public final ArrayList<String> f25270y;

    /* renamed from: z */
    public final ArrayList<Integer> f25271z;

    /* renamed from: d60.q0$a */
    public static final class C7220a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7219q0 f25272d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7220a(C7219q0 q0Var) {
            super(1);
            this.f25272d = q0Var;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type kotlin.String");
            C7219q0 q0Var = this.f25272d;
            q0Var.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", (String) tag);
            bundle.putBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE", true);
            q0Var.f25262q.mo78802a();
            q0Var.f25254f.statusChange(C58124b.C58125b.LIVE_STATUS_OPEN_MEMBER_PROFILE, bundle);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.q0$b */
    public static final class C7221b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7219q0 f25273d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7221b(C7219q0 q0Var) {
            super(1);
            this.f25273d = q0Var;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                C58124b.C7172a.m7372a(this.f25273d.f25254f, C58124b.C58125b.HIDE_MEMBERS_LIST, (Bundle) null, 2, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.q0$c */
    public static final class C7222c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C7219q0 f25274d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7222c(C7219q0 q0Var) {
            super(0);
            this.f25274d = q0Var;
        }

        public Object invoke() {
            if (this.f25274d.mo14483f0() == 0) {
                Log.m105924i(this.f25274d.f25255g, "onlineCntChanged in LiveMembersListPlugin, will update");
                String str = RoomLiveService.f157192c;
                C87412m.m108594g(str, "wechatRoomId");
                C86709a0.m107529k().f251779b.mo123460f(new C16104c(RoomLiveService.f157197h.f133050d, str, true));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: d60.q0$d */
    public static final class C7223d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C7219q0 f25275d;

        public C7223d(C7219q0 q0Var) {
            this.f25275d = q0Var;
        }

        public final void run() {
            this.f25275d.f25262q.mo78804d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7219q0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f25254f = bVar;
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fvr);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.l…ist_single_room_icon_btn)");
        ImageView imageView = (ImageView) findViewById;
        this.f25257i = imageView;
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fvt);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.l…ist_single_room_title_tv)");
        this.f25258j = (TextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(C0966R.C0970id.fvq);
        C87412m.m108593f(findViewById3, "root.findViewById(R.id.l…e_members_list_retry_tip)");
        TextView textView = (TextView) findViewById3;
        this.f25259n = textView;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.fvo);
        C87412m.m108593f(findViewById4, "root.findViewById(R.id.l…e_members_list_empty_tip)");
        this.f25260o = (TextView) findViewById4;
        View findViewById5 = viewGroup.findViewById(C0966R.C0970id.fvu);
        C87412m.m108593f(findViewById5, "root.findViewById(R.id.l…rs_list_single_room_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.f25261p = recyclerView;
        View findViewById6 = viewGroup.findViewById(C0966R.C0970id.fvn);
        C87412m.m108593f(findViewById6, "root.findViewById(R.id.l…embers_list_content_area)");
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) findViewById6;
        this.f25262q = liveBottomSheetPanel;
        View findViewById7 = viewGroup.findViewById(C0966R.C0970id.fvp);
        C87412m.m108593f(findViewById7, "root.findViewById(R.id.live_members_list_loading)");
        this.f25263r = (ProgressBar) findViewById7;
        View findViewById8 = viewGroup.findViewById(C0966R.C0970id.fvm);
        C87412m.m108593f(findViewById8, "root.findViewById(R.id.l…_members_list_blank_area)");
        this.f25264s = findViewById8;
        View findViewById9 = viewGroup.findViewById(C0966R.C0970id.fvv);
        C87412m.m108593f(findViewById9, "root.findViewById(R.id.l…list_single_sub_title_tv)");
        this.f25265t = (TextView) findViewById9;
        C8855f fVar = new C8855f();
        this.f25266u = fVar;
        View findViewById10 = viewGroup.findViewById(C0966R.C0970id.fvs);
        C87412m.m108593f(findViewById10, "root.findViewById(R.id.l…_single_room_title_group)");
        this.f25267v = findViewById10;
        this.f25269x = new ArrayList<>();
        this.f25270y = new ArrayList<>();
        this.f25271z = new ArrayList<>();
        this.f25251A = new ArrayList<>();
        this.f25252B = "";
        fVar.f28107e = new C7220a(this);
        recyclerView.setLayoutManager(new GridLayoutManager(viewGroup.getContext(), 5));
        recyclerView.setAdapter(fVar);
        liveBottomSheetPanel.setTranslationY((float) C75044y4.m89990b(viewGroup.getContext()).y);
        liveBottomSheetPanel.setOnVisibilityListener(new C7221b(this));
        if (!mo82893g0()) {
            liveBottomSheetPanel.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom() + C75044y4.m89991c(viewGroup.getContext()));
        } else {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).width = C75044y4.m89990b(viewGroup.getContext()).y;
        }
        findViewById8.setOnClickListener(this);
        imageView.setOnClickListener(this);
        textView.setOnClickListener(this);
        C53496k kVar = C53496k.f150436a;
        C53496k.f150441f.put(mo82894j0(), new C7222c(this));
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        C86709a0.m107529k().f251779b.mo123455a(3806, this);
        C86709a0.m107529k().f251779b.mo123455a(3662, this);
        C86709a0.m107529k().f251779b.mo123455a(3700, this);
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (this.f166287d.getVisibility() != 0) {
            return false;
        }
        this.f25262q.mo78802a();
        return true;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/live/plugin/LiveMembersListPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fvr) {
            this.f25262q.mo78802a();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fvq) {
            C86709a0.m107529k().f251779b.mo123460f(new C16103b(RoomLiveService.f157197h.f133050d, RoomLiveService.f157192c, false));
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.fvm) {
            this.f25262q.mo78802a();
        }
        C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveMembersListPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        ArrayList arrayList;
        C117747y yVar2 = yVar;
        if (!(yVar2 instanceof C16104c)) {
            boolean z = yVar2 instanceof C16105d;
        } else if (!(i == 0 && i2 == 0) && !((C16104c) yVar2).f43261e) {
            Log.m105924i(this.f25255g, "onGetLiveOnlineByRoomFail");
            if (!this.f25253C) {
                this.f25259n.setVisibility(0);
                this.f25263r.setVisibility(8);
                View view = this.f25267v;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveMembersListPlugin", "onGetLiveOnlineByRoomFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/live/plugin/LiveMembersListPlugin", "onGetLiveOnlineByRoomFail", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f25261p.setVisibility(8);
                this.f25260o.setVisibility(8);
            }
        } else if (i == 0 && i2 == 0) {
            String str2 = ((C16104c) yVar2).f43260d;
            this.f25252B = RoomLiveService.f157192c;
            ArrayList arrayList2 = new ArrayList();
            C13604l lVar = RoomLiveService.f157194e.get(this.f25252B);
            ArrayList<String> arrayList3 = lVar != null ? (ArrayList) lVar.f38555d : null;
            if (arrayList3 != null) {
                for (String iVar : arrayList3) {
                    arrayList2.add(new C8858i(iVar));
                }
            }
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f25260o.setVisibility(0);
                this.f25263r.setVisibility(8);
                View view3 = this.f25267v;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/live/plugin/LiveMembersListPlugin", "onGetLiveOnlineByRoomSuccess", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/live/plugin/LiveMembersListPlugin", "onGetLiveOnlineByRoomSuccess", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f25261p.setVisibility(8);
                this.f25259n.setVisibility(8);
                TextView textView = this.f25258j;
                String string = this.f166287d.getContext().getResources().getString(C0966R.string.g8f);
                C87412m.m108593f(string, "root.context.resources.g…ember_list_visitor_title)");
                Object[] objArr = new Object[1];
                objArr[0] = Integer.valueOf(arrayList3 != null ? arrayList3.size() : 0);
                String format = String.format(string, Arrays.copyOf(objArr, 1));
                C87412m.m108593f(format, "format(format, *args)");
                textView.setText(format);
            } else {
                this.f25260o.setVisibility(8);
                this.f25263r.setVisibility(8);
                View view5 = this.f25267v;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/live/plugin/LiveMembersListPlugin", "onGetLiveOnlineByRoomSuccess", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/live/plugin/LiveMembersListPlugin", "onGetLiveOnlineByRoomSuccess", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f25261p.setVisibility(0);
                this.f25259n.setVisibility(8);
                TextView textView2 = this.f25258j;
                String string2 = this.f166287d.getContext().getResources().getString(C0966R.string.g8f);
                C87412m.m108593f(string2, "root.context.resources.g…ember_list_visitor_title)");
                String format2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(arrayList3.size())}, 1));
                C87412m.m108593f(format2, "format(format, *args)");
                textView2.setText(format2);
                C8855f fVar = this.f25266u;
                fVar.getClass();
                fVar.f28106d.clear();
                fVar.f28106d.addAll(arrayList2);
                this.f25266u.notifyDataSetChanged();
            }
            String str3 = this.f25255g;
            StringBuilder sb = new StringBuilder();
            sb.append("onGetLiveOnlineByRoomSuccess curWechatRoom:");
            sb.append(this.f25252B);
            sb.append(" size:");
            C13604l lVar2 = RoomLiveService.f157194e.get(this.f25252B);
            sb.append((lVar2 == null || (arrayList = (ArrayList) lVar2.f38555d) == null) ? null : Integer.valueOf(arrayList.size()));
            Log.m105924i(str3, sb.toString());
        }
    }

    /* renamed from: r0 */
    public void mo8358r0() {
    }

    /* renamed from: s0 */
    public void mo3209s0() {
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        if (ordinal == 19) {
            mo10792g(0);
            mo8395y0();
        } else if (ordinal == 20 || ordinal == 27 || ordinal == 28) {
            mo10792g(4);
        } else if (ordinal == 40) {
            mo10792g(0);
            mo8395y0();
            if (this.f25268w == null) {
                this.f25268w = C89779i0.m112248e(this.f166287d.getContext(), this.f166287d.getContext().getString(C0966R.string.g88), true, 2, (DialogInterface.OnCancelListener) null);
            }
            C89779i0 i0Var = this.f25268w;
            if (i0Var != null) {
                i0Var.show();
            }
        } else if (ordinal == 45) {
            mo10792g(0);
            mo8395y0();
        }
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        C86709a0.m107529k().f251779b.mo123470p(3806, this);
        C86709a0.m107529k().f251779b.mo123470p(3662, this);
        C86709a0.m107529k().f251779b.mo123470p(3700, this);
    }

    /* renamed from: x0 */
    public final void mo8394x0(LiveConfig liveConfig) {
        C87412m.m108594g(liveConfig, "config");
        boolean z = liveConfig.f157063d == 0;
        this.f25253C = z;
        if (z) {
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            if (RoomLiveService.f157194e.size() > 1) {
                ImageView imageView = this.f25257i;
                Drawable drawable = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_back);
                C74933u4.m89769f(drawable, -1);
                imageView.setImageDrawable(drawable);
            } else {
                ImageView imageView2 = this.f25257i;
                Drawable drawable2 = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_close);
                C74933u4.m89769f(drawable2, -1);
                imageView2.setImageDrawable(drawable2);
            }
            this.f25265t.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g8d));
            this.f25269x.add(this.f166287d.getContext().getString(C0966R.string.f360958g83));
            this.f25269x.add(this.f166287d.getContext().getString(C0966R.string.g84));
            this.f25271z.add(Integer.valueOf(this.f25256h));
            this.f25271z.add(0);
            return;
        }
        ImageView imageView3 = this.f25257i;
        Drawable drawable3 = this.f166287d.getContext().getResources().getDrawable(C0966R.raw.icons_filled_close);
        C74933u4.m89769f(drawable3, -1);
        imageView3.setImageDrawable(drawable3);
        this.f25265t.setText(this.f166287d.getContext().getResources().getString(C0966R.string.g8d));
        this.f25270y.add(this.f166287d.getContext().getString(C0966R.string.f360958g83));
        this.f25251A.add(Integer.valueOf(this.f25256h));
    }

    /* renamed from: y0 */
    public final void mo8395y0() {
        C13604l lVar = RoomLiveService.f157194e.get(RoomLiveService.f157192c);
        ArrayList arrayList = lVar != null ? (ArrayList) lVar.f38555d : null;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f25263r.setVisibility(0);
            this.f25259n.setVisibility(8);
            this.f25260o.setVisibility(8);
            View view = this.f25267v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/live/plugin/LiveMembersListPlugin", "showMembersList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/live/plugin/LiveMembersListPlugin", "showMembersList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f25261p.setVisibility(8);
        } else {
            this.f25263r.setVisibility(8);
            this.f25259n.setVisibility(8);
            this.f25260o.setVisibility(8);
            View view2 = this.f25267v;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/live/plugin/LiveMembersListPlugin", "showMembersList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/live/plugin/LiveMembersListPlugin", "showMembersList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f25261p.setVisibility(0);
        }
        String str = RoomLiveService.f157192c;
        C87412m.m108594g(str, "wechatRoomId");
        C86709a0.m107529k().f251779b.mo123460f(new C16104c(RoomLiveService.f157197h.f133050d, str, false));
        this.f25262q.post(new C7223d(this));
    }
}
