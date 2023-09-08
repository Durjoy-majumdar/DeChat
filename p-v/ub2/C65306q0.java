package ub2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74783i3;
import gy3.C87412m;
import hb2.C59822f;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76901s0;

/* renamed from: ub2.q0 */
public final class C65306q0 extends C76901s0 {

    /* renamed from: f */
    public final Context f187969f;

    /* renamed from: g */
    public final C65308b f187970g;

    /* renamed from: h */
    public final TextView f187971h;

    /* renamed from: i */
    public final View f187972i;

    /* renamed from: j */
    public final View f187973j;

    /* renamed from: n */
    public boolean f187974n;

    /* renamed from: o */
    public C59822f f187975o;

    /* renamed from: p */
    public long f187976p = 10000;

    /* renamed from: ub2.q0$a */
    public static final class C65307a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C65306q0 f187977d;

        public C65307a(C65306q0 q0Var) {
            this.f187977d = q0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C65306q0 q0Var = this.f187977d;
            C65308b bVar = q0Var.f187970g;
            if (bVar != null) {
                bVar.mo88606a(q0Var.f187975o);
            }
            this.f187977d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ub2.q0$b */
    public interface C65308b {
        /* renamed from: a */
        void mo88606a(C59822f fVar);
    }

    /* renamed from: ub2.q0$c */
    public static final class C65309c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65306q0 f187978d;

        public C65309c(C65306q0 q0Var) {
            this.f187978d = q0Var;
        }

        public final void run() {
            if (this.f187978d.isShowing()) {
                this.f187978d.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65306q0(Context context, C65308b bVar) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f187969f = context;
        this.f187970g = bVar;
        setContentView(LayoutInflater.from(context).inflate(C0966R.C0971layout.bjd, (ViewGroup) null));
        setClippingEnabled(false);
        View findViewById = getContentView().findViewById(C0966R.C0970id.kyk);
        C87412m.m108593f(findViewById, "contentView.findViewById(R.id.tv_tips)");
        this.f187971h = (TextView) findViewById;
        View findViewById2 = getContentView().findViewById(C0966R.C0970id.l2s);
        C87412m.m108593f(findViewById2, "contentView.findViewById(R.id.v_arrow)");
        this.f187972i = findViewById2;
        View findViewById3 = getContentView().findViewById(C0966R.C0970id.grv);
        C87412m.m108593f(findViewById3, "contentView.findViewById(R.id.menu_content)");
        this.f187973j = findViewById3;
        getContentView().setOnClickListener(new C65307a(this));
    }

    /* renamed from: a */
    public final void mo89414a() {
        View contentView = getContentView();
        if (contentView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: b */
    public final void mo89415b() {
        View contentView = getContentView();
        if (contentView != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(contentView, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: c */
    public final void mo89416c(View view) {
        C87412m.m108594g(view, "anchor");
        if (!this.f187974n) {
            getContentView().measure(0, 0);
            this.f187974n = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        C74783i3.C6978a a = C74783i3.m89537a(this.f187969f);
        int i = a.f24704a;
        int i2 = a.f24705b;
        int b = C76577a.m92151b(this.f187969f, 16);
        int i3 = iArr[1] - measuredHeight;
        int i4 = (i - measuredWidth) - b;
        ViewGroup.LayoutParams layoutParams = this.f187972i.getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(((iArr[0] + (view.getWidth() / 2)) - i4) - (this.f187972i.getMeasuredWidth() / 2));
        if (layoutParams2.getMarginStart() < 0) {
            layoutParams2.getMarginStart();
            dismiss();
            return;
        }
        setAnimationStyle(C0966R.style.f8694re);
        showAtLocation(view, 0, i4, i3);
        View contentView = getContentView();
        if (contentView != null) {
            contentView.postDelayed(new C65309c(this), this.f187976p);
        }
        C87412m.m108593f(String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(measuredWidth), Integer.valueOf(measuredHeight)}, 6)), "format(format, *args)");
    }
}
