package com.tencent.p014mm.p136ui.chatting;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C7865r3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.ui.chatting.a4 */
public final class C57667a4 extends C73849t3 {

    /* renamed from: h */
    public final C13601g f165066h = C36568h.m40985a(new C57669b(this));

    /* renamed from: i */
    public final C13601g f165067i;

    /* renamed from: com.tencent.mm.ui.chatting.a4$a */
    public static final class C57668a extends C87413o implements C32224a {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f165068d;

        /* renamed from: e */
        public final /* synthetic */ C57667a4 f165069e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57668a(AppCompatActivity appCompatActivity, C57667a4 a4Var) {
            super(0);
            this.f165068d = appCompatActivity;
            this.f165069e = a4Var;
        }

        public Object invoke() {
            ChattingUIFragment chattingUIFragment;
            MMActivityController controller;
            AppCompatActivity appCompatActivity = this.f165068d;
            ChattingUI chattingUI = appCompatActivity instanceof ChattingUI ? (ChattingUI) appCompatActivity : null;
            if (!(chattingUI == null || (chattingUIFragment = chattingUI.f215277j) == null || (controller = chattingUIFragment.getController()) == null)) {
                controller.mo177084l0(this.f165069e.getResources().getDimensionPixelSize(C0966R.dimen.f3813z3), true);
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.a4$b */
    public static final class C57669b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C57667a4 f165070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57669b(C57667a4 a4Var) {
            super(0);
            this.f165070d = a4Var;
        }

        public Object invoke() {
            return Integer.valueOf(C7865r3.f26468a.mo8969b(this.f165070d.getContext()));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57667a4(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f165067i = C36568h.m40985a(new C57668a(appCompatActivity, this));
    }

    /* renamed from: g3 */
    public int mo82031g3() {
        return (int) (((float) ((Number) ((C36570n) this.f165066h).getValue()).intValue()) * 0.75f);
    }

    public void onResume() {
        super.onResume();
        Void voidR = (Void) ((C36570n) this.f165067i).getValue();
    }
}
