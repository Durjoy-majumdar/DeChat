package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import wc3.C78538u;

/* renamed from: com.tencent.mm.ui.tools.g1 */
public class C45058g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f122205d;

    /* renamed from: e */
    public final /* synthetic */ View f122206e;

    /* renamed from: f */
    public final /* synthetic */ Context f122207f;

    /* renamed from: g */
    public final /* synthetic */ int f122208g;

    /* renamed from: h */
    public final /* synthetic */ View f122209h;

    /* renamed from: i */
    public final /* synthetic */ float f122210i;

    /* renamed from: j */
    public final /* synthetic */ NestedScrollView f122211j;

    /* renamed from: n */
    public final /* synthetic */ boolean f122212n;

    public C45058g1(View view, View view2, Context context, int i, View view3, float f, NestedScrollView nestedScrollView, boolean z) {
        this.f122205d = view;
        this.f122206e = view2;
        this.f122207f = context;
        this.f122208g = i;
        this.f122209h = view3;
        this.f122210i = f;
        this.f122211j = nestedScrollView;
        this.f122212n = z;
    }

    public void run() {
        View view;
        if (this.f122205d != null && (view = this.f122206e) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i = marginLayoutParams.topMargin;
            int b = C76577a.m92151b(this.f122207f, this.f122208g);
            if (this.f122205d.getMeasuredHeight() > 0 && this.f122209h != null) {
                int height = (int) (((float) ((WindowManager) this.f122207f.getSystemService("window")).getDefaultDisplay().getHeight()) - this.f122210i);
                Log.m105919d("MicroMsg.ScrollViewHelper", "setViewToScrollViewBottom screenHeight:%s", Integer.valueOf(height));
                int[] iArr = new int[2];
                View view2 = this.f122209h;
                if (view2.getTag(view2.getId()) == null) {
                    this.f122209h.getLocationOnScreen(iArr);
                    View view3 = this.f122209h;
                    view3.setTag(view3.getId(), iArr);
                } else {
                    View view4 = this.f122209h;
                    iArr = (int[]) view4.getTag(view4.getId());
                }
                if (this.f122211j != null && height >= iArr[1] + this.f122209h.getMeasuredHeight() + b + this.f122206e.getMeasuredHeight()) {
                    int h = ((height - C75044y4.m89996h(this.f122207f)) - (this.f122212n ? 0 : C78538u.m94865a(this.f122207f))) - this.f122206e.getMeasuredHeight();
                    if (!Util.isEqual(i, h)) {
                        ViewGroup viewGroup = (ViewGroup) this.f122211j.getChildAt(0);
                        if (Util.isEqual(this.f122206e.getTag(), (Object) "no_first")) {
                            ((ViewGroup) this.f122206e.getParent()).removeView(this.f122206e);
                            viewGroup.addView(this.f122206e);
                        } else {
                            this.f122211j.removeView(viewGroup);
                            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                            RelativeLayout relativeLayout = new RelativeLayout(this.f122207f);
                            relativeLayout.addView(viewGroup);
                            relativeLayout.setLayoutParams(layoutParams);
                            this.f122211j.addView(relativeLayout);
                            ((ViewGroup) this.f122206e.getParent()).removeView(this.f122206e);
                            relativeLayout.addView(this.f122206e);
                        }
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f122206e.getLayoutParams();
                        marginLayoutParams2.topMargin = h;
                        marginLayoutParams2.bottomMargin = 0;
                        this.f122206e.setLayoutParams(marginLayoutParams2);
                        View view5 = this.f122206e;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view6 = view5;
                        C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view6, "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        this.f122206e.setTag("no_first");
                        this.f122211j.requestLayout();
                        return;
                    }
                    return;
                } else if (!Util.isEqual(i, b)) {
                    ViewParent parent = this.f122206e.getParent();
                    ((ViewGroup) this.f122206e.getParent()).removeView(this.f122206e);
                    ((ViewGroup) this.f122209h.getParent()).addView(this.f122206e);
                    if ((this.f122209h.getParent() instanceof LinearLayout) && (parent instanceof RelativeLayout)) {
                        marginLayoutParams = new LinearLayout.LayoutParams(marginLayoutParams);
                    }
                    marginLayoutParams.topMargin = b;
                } else {
                    return;
                }
            } else if (!Util.isEqual(i, b)) {
                marginLayoutParams.topMargin = b;
            } else {
                return;
            }
            View view7 = this.f122206e;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar2.mo10232b(), "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/ui/tools/ScrollViewHelper$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f122206e.setLayoutParams(marginLayoutParams);
            this.f122206e.requestLayout();
        }
    }
}
