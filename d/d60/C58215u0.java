package d60;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.pluginsdk.permission.AbsRequestFloatWindowPermissionDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import d60.C58124b;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p447aw.C103918d;
import p447aw.C54369c;
import p50.C62197e;
import vc3.C78382a;

/* renamed from: d60.u0 */
public final class C58215u0 extends C58121a {

    /* renamed from: f */
    public final C58124b f166714f;

    /* renamed from: g */
    public boolean f166715g;

    /* renamed from: h */
    public Context f166716h;

    /* renamed from: i */
    public final RelativeLayout f166717i;

    /* renamed from: d60.u0$a */
    public static final class C58216a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C58215u0 f166718d;

        /* renamed from: d60.u0$a$a */
        public static final class C58217a implements AbsRequestFloatWindowPermissionDialog.C85613a {

            /* renamed from: a */
            public final /* synthetic */ C58215u0 f166719a;

            public C58217a(C58215u0 u0Var) {
                this.f166719a = u0Var;
            }

            /* renamed from: a */
            public void mo247a(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
                if (absRequestFloatWindowPermissionDialog != null) {
                    absRequestFloatWindowPermissionDialog.finish();
                }
                C58215u0 u0Var = this.f166719a;
                if (u0Var.f166715g) {
                    if (u0Var.f166714f.getLiveRole() == 1) {
                        if (C54655b.f153178f1 == null) {
                            C54655b.f153178f1 = new C54655b();
                        }
                        C54655b bVar = C54655b.f153178f1;
                        C87412m.m108591d(bVar);
                        bVar.f172989A.f166254a = true;
                    } else {
                        if (C62197e.f176819i1 == null) {
                            C62197e.f176819i1 = new C62197e();
                        }
                        C62197e eVar = C62197e.f176819i1;
                        C87412m.m108591d(eVar);
                        eVar.f172989A.f166254a = true;
                    }
                    Bundle bundle = new Bundle();
                    C58215u0 u0Var2 = this.f166719a;
                    bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
                    bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
                    u0Var2.f166714f.statusChange(C58124b.C58125b.MINI_WINDOW, bundle);
                }
            }

            /* renamed from: b */
            public void mo248b(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
                C58124b.C7172a.m7372a(this.f166719a.f166714f, C58124b.C58125b.MINI_WINDOW_CANCEL, (Bundle) null, 2, (Object) null);
            }

            /* renamed from: c */
            public void mo249c(AbsRequestFloatWindowPermissionDialog absRequestFloatWindowPermissionDialog) {
                if (absRequestFloatWindowPermissionDialog != null) {
                    absRequestFloatWindowPermissionDialog.finish();
                }
                C58124b.C7172a.m7372a(this.f166719a.f166714f, C58124b.C58125b.MINI_WINDOW_REFUSE, (Bundle) null, 2, (Object) null);
            }
        }

        public C58216a(C58215u0 u0Var) {
            this.f166718d = u0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/live/plugin/LiveMinimizePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!((C103918d) C86312j.m106911c(C103918d.class)).mo125776TW(MMApplicationContext.getContext(), 21)) {
                Log.m105920e("MicroMsg.LiveCoreMini", "showVideoTalking, permission denied");
                C58124b.C7172a.m7372a(this.f166718d.f166714f, C58124b.C58125b.MINI_WINDOW_PERMISSION, (Bundle) null, 2, (Object) null);
                Context context = this.f166718d.f166716h;
                ((C54369c) C86312j.m106911c(C54369c.class)).ff0(context, 21, context.getString(C0966R.string.g_k), new C58217a(this.f166718d), false, C78382a.m94650b());
            } else {
                Bundle bundle = new Bundle();
                C58215u0 u0Var = this.f166718d;
                bundle.putInt("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
                bundle.putInt("PARAM_LIVE_MINI_WINDOW_OP_TYPE", 12);
                u0Var.f166714f.statusChange(C58124b.C58125b.MINI_WINDOW, bundle);
            }
            C117292a.m165361g(this, "com/tencent/mm/live/plugin/LiveMinimizePlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58215u0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166714f = bVar;
        this.f166716h = viewGroup.getContext();
        View findViewById = viewGroup.findViewById(C0966R.C0970id.fwt);
        C87412m.m108593f(findViewById, "root.findViewById(R.id.live_minimiza_icon_btn)");
        View findViewById2 = viewGroup.findViewById(C0966R.C0970id.fwu);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.l…miza_icon_btn_click_area)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById2;
        this.f166717i = relativeLayout;
        mo10792g(4);
        Drawable drawable = this.f166716h.getResources().getDrawable(C0966R.raw.icons_outlined_mini_window);
        C74933u4.m89769f(drawable, -1);
        ((ImageView) findViewById).setImageDrawable(drawable);
        relativeLayout.setOnClickListener(new C58216a(this));
    }

    /* renamed from: l0 */
    public boolean mo3207l0() {
        if (!this.f166714f.isLiving()) {
            return false;
        }
        this.f166717i.performClick();
        return true;
    }

    /* renamed from: q0 */
    public boolean mo82896q0() {
        if (!this.f166714f.isLiving()) {
            return false;
        }
        this.f166717i.performClick();
        return true;
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        int ordinal = bVar.ordinal();
        boolean z = true;
        if (ordinal == 7 || ordinal == 30) {
            mo10792g(0);
            this.f166715g = true;
        } else if (ordinal != 39) {
            if (ordinal == 27 || ordinal == 28) {
                mo10792g(4);
                this.f166715g = false;
            }
        } else if (this.f166714f.getLiveRole() == 0) {
            if (bundle == null || !bundle.getBoolean("PARAM_IS_ENTERING_COMMENT")) {
                z = false;
            }
            if (z) {
                mo10792g(4);
            } else {
                mo10792g(0);
            }
        }
    }
}
