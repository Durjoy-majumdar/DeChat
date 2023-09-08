package xk1;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import er1.C58777u0;
import er1.C7919x;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import tf0.C13883o1;

/* renamed from: xk1.i */
public final class C15738i extends UIComponent {

    /* renamed from: d */
    public View f42456d;

    /* renamed from: xk1.i$a */
    public static final class C15739a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f42457d;

        public C15739a(View view) {
            this.f42457d = view;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f42457d.getHitRect(rect);
            rect.inset(rect.width() * -2, -rect.width());
            ViewParent parent = this.f42457d.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).setTouchDelegate(new TouchDelegate(rect, this.f42457d));
        }
    }

    /* renamed from: xk1.i$b */
    public static final class C15740b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15738i f42458d;

        public C15740b(C15738i iVar) {
            this.f42458d = iVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f42458d.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: xk1.i$c */
    public static final class C15741c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C15738i f42459d;

        public C15741c(C15738i iVar) {
            this.f42459d = iVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C58777u0 u0Var = C58777u0.f168283a;
            if (C58777u0.f168284b == 19) {
                u0Var.mo83833b(4);
            }
            Intent intent = new Intent();
            intent.putExtra("key_create_scene", 4);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            intent.putExtra("key_router_to_profile", false);
            ((C13883o1) C86312j.m106911c(C13883o1.class)).mo13297zc(this.f42459d.getActivity(), intent);
            C115669n.INSTANCE.mo160131h(20694, 1);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15738i(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo14463c3() {
        View view = this.f42456d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveCreateAccountUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("root");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.em4);
        C87412m.m108593f(findViewById, "findViewById(R.id.game_live_create_account_area)");
        this.f42456d = findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f358342ei3);
        findViewById2.post(new C15739a(findViewById2));
        findViewById2.setOnClickListener(new C15740b(this));
        View findViewById3 = findViewById(C0966R.C0970id.bw_);
        C87412m.m108593f(findViewById3, "findViewById<TextView>(R.id.create_title_tv)");
        C7919x.m8091a((TextView) findViewById3);
        findViewById(C0966R.C0970id.bvz).setOnClickListener(new C15741c(this));
    }
}
