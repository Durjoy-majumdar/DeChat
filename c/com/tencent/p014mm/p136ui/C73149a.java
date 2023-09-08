package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;

/* renamed from: com.tencent.mm.ui.a */
public class C73149a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f214682d;

    /* renamed from: e */
    public final /* synthetic */ ActionBar f214683e;

    /* renamed from: f */
    public final /* synthetic */ MMActivityController f214684f;

    /* renamed from: g */
    public final /* synthetic */ Menu f214685g;

    /* renamed from: h */
    public final /* synthetic */ View f214686h;

    /* renamed from: i */
    public final /* synthetic */ boolean f214687i;

    public C73149a(View view, ActionBar actionBar, MMActivityController mMActivityController, Menu menu, View view2, boolean z) {
        this.f214682d = view;
        this.f214683e = actionBar;
        this.f214684f = mMActivityController;
        this.f214685g = menu;
        this.f214686h = view2;
        this.f214687i = z;
    }

    public void run() {
        int i;
        Log.m105925i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView measuredWidth inside is %s, customView : %s .", Integer.valueOf(this.f214682d.getMeasuredWidth()), this.f214682d);
        if (this.f214682d != this.f214683e.mo91099j()) {
            View view = this.f214682d;
            Log.m105929w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView is not equals current actionbar's custom, customView width old = %s customView = %s， context : %s.", Integer.valueOf(this.f214682d.getMeasuredWidth()), view, view.getContext());
            if (this.f214683e.mo91099j() != null) {
                Log.m105929w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, customView is not equals current actionbar's custom, customView width new = %s, customView = %s， context : %s.", Integer.valueOf(this.f214683e.mo91099j().getMeasuredWidth()), this.f214683e.mo91099j(), this.f214683e.mo91099j().getContext());
            } else {
                Log.m105928w("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, actionBar.getCustomView() is null.");
            }
        }
        Context context = this.f214682d.getContext();
        int A = C76577a.m92145A(context);
        if (!C85875k4.m106208w()) {
            A = C76577a.m92145A(context);
        } else if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                A = activity.getWindow().getDecorView().getMeasuredWidth();
            }
        }
        int measuredWidth = this.f214682d.getMeasuredWidth();
        if (measuredWidth == 0 && "com.tencent.mm.ui.chatting.ChattingUIFragment".equals(this.f214684f.mo177030r())) {
            Menu menu = this.f214685g;
            if (menu == null || menu.size() <= 0) {
                i = 0;
            } else {
                i = 0;
                for (int i2 = 0; i2 < this.f214685g.size(); i2++) {
                    MenuItem item = this.f214685g.getItem(i2);
                    if (item != null && item.isEnabled() && item.isVisible()) {
                        i++;
                    }
                }
            }
            int dimension = (i > 1 ? i : 1) * ((int) this.f214682d.getContext().getResources().getDimension(C0966R.dimen.f3753d4));
            Log.m105925i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, menu width is %s, defaultMenuWidth: %s.", Integer.valueOf(i * ((int) this.f214682d.getContext().getResources().getDimension(C0966R.dimen.f3753d4))), Integer.valueOf(dimension));
            measuredWidth = A - dimension;
        }
        View view2 = this.f214686h;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/ActionBarCenterHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/ActionBarCenterHelper$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (this.f214686h != null && measuredWidth != 0) {
            View findViewById = this.f214682d.findViewById(C0966R.C0970id.f5470g0);
            int dimension2 = (int) this.f214682d.getResources().getDimension(C0966R.dimen.f3755d6);
            if (findViewById != null) {
                dimension2 = findViewById.getMeasuredWidth();
            }
            if (!this.f214687i) {
                View findViewById2 = this.f214682d.findViewById(C0966R.C0970id.f5457fn);
                if (findViewById2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
                    marginLayoutParams.leftMargin = 0;
                    findViewById2.setLayoutParams(marginLayoutParams);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f214686h.getLayoutParams();
                marginLayoutParams2.leftMargin = dimension2;
                this.f214686h.setLayoutParams(marginLayoutParams2);
                return;
            }
            int left = this.f214682d.getLeft();
            int i3 = (A - measuredWidth) - left;
            int max = Math.max(i3 - left, dimension2);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.f214686h.getLayoutParams();
            marginLayoutParams3.width = A - ((max + left) * 2);
            marginLayoutParams3.leftMargin = max;
            this.f214686h.setLayoutParams(marginLayoutParams3);
            Log.m105925i("MicroMsg.ActionBarCenterHelper", "setActionTitleCenter, backViewWidth: %s, menuAreaWidth: %s, leftMargin: %s, titleWidth: %s, activityWidth: %s, customMeasuredWidth: %s, customPadding: %s, customRealWidth: %s.", Integer.valueOf(dimension2), Integer.valueOf(i3), Integer.valueOf(max), Integer.valueOf(marginLayoutParams3.width), Integer.valueOf(A), Integer.valueOf(measuredWidth), Integer.valueOf(left), Integer.valueOf(this.f214682d.getWidth()));
            if (findViewById != null) {
                if (max != 0) {
                    dimension2 = 0;
                }
                this.f214686h.setPadding(dimension2, 0, dimension2, 0);
            }
        }
    }
}
