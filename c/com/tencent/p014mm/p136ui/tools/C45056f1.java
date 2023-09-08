package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import wc3.C78538u;

/* renamed from: com.tencent.mm.ui.tools.f1 */
public class C45056f1 {

    /* renamed from: com.tencent.mm.ui.tools.f1$a */
    public class C45057a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f122197d;

        /* renamed from: e */
        public final /* synthetic */ View f122198e;

        /* renamed from: f */
        public final /* synthetic */ Context f122199f;

        /* renamed from: g */
        public final /* synthetic */ int f122200g;

        /* renamed from: h */
        public final /* synthetic */ View f122201h;

        /* renamed from: i */
        public final /* synthetic */ float f122202i;

        /* renamed from: j */
        public final /* synthetic */ ViewGroup f122203j;

        /* renamed from: n */
        public final /* synthetic */ boolean f122204n;

        public C45057a(View view, View view2, Context context, int i, View view3, float f, ViewGroup viewGroup, boolean z) {
            this.f122197d = view;
            this.f122198e = view2;
            this.f122199f = context;
            this.f122200g = i;
            this.f122201h = view3;
            this.f122202i = f;
            this.f122203j = viewGroup;
            this.f122204n = z;
        }

        public void run() {
            View view;
            if (this.f122197d != null && (view = this.f122198e) != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i = marginLayoutParams.topMargin;
                int b = C76577a.m92151b(this.f122199f, this.f122200g);
                if (this.f122197d.getMeasuredHeight() > 0 && this.f122201h != null) {
                    int c = (int) (((float) (C85875k4.m106184h(this.f122199f).y - C75044y4.m89991c(this.f122199f))) - this.f122202i);
                    Log.m105919d("MicroMsg.ScrollViewHelper", "setViewToScrollViewBottom screenHeight:%s", Integer.valueOf(c));
                    int[] iArr = new int[2];
                    View view2 = this.f122201h;
                    if (view2.getTag(view2.getId()) == null) {
                        this.f122201h.getLocationOnScreen(iArr);
                        View view3 = this.f122201h;
                        view3.setTag(view3.getId(), iArr);
                    } else {
                        View view4 = this.f122201h;
                        iArr = (int[]) view4.getTag(view4.getId());
                    }
                    if (this.f122203j != null && c >= iArr[1] + this.f122201h.getMeasuredHeight() + b + this.f122198e.getMeasuredHeight()) {
                        int h = ((c - C75044y4.m89996h(this.f122199f)) - (this.f122204n ? 0 : C78538u.m94865a(this.f122199f))) - this.f122198e.getMeasuredHeight();
                        if (!Util.isEqual(i, h)) {
                            ViewGroup viewGroup = (ViewGroup) this.f122203j.getChildAt(0);
                            if (Util.isEqual(this.f122198e.getTag(), (Object) "no_first")) {
                                ((ViewGroup) this.f122198e.getParent()).removeView(this.f122198e);
                                viewGroup.addView(this.f122198e);
                            } else {
                                this.f122203j.removeView(viewGroup);
                                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
                                RelativeLayout relativeLayout = new RelativeLayout(this.f122199f);
                                relativeLayout.addView(viewGroup);
                                relativeLayout.setLayoutParams(layoutParams);
                                this.f122203j.addView(relativeLayout);
                                ((ViewGroup) this.f122198e.getParent()).removeView(this.f122198e);
                                relativeLayout.addView(this.f122198e);
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f122198e.getLayoutParams();
                            marginLayoutParams2.topMargin = h;
                            marginLayoutParams2.bottomMargin = 0;
                            this.f122198e.setLayoutParams(marginLayoutParams2);
                            View view5 = this.f122198e;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view6 = view5;
                            C117292a.m165358d(view6, aVar.mo10232b(), "com/tencent/mm/ui/tools/ScrollViewHelper$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view5.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view6, "com/tencent/mm/ui/tools/ScrollViewHelper$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            this.f122198e.setTag("no_first");
                            this.f122203j.requestLayout();
                            return;
                        }
                        return;
                    } else if (!Util.isEqual(i, b)) {
                        ((ViewGroup) this.f122198e.getParent()).removeView(this.f122198e);
                        ((ViewGroup) this.f122201h.getParent()).addView(this.f122198e);
                        marginLayoutParams.topMargin = b;
                    } else {
                        return;
                    }
                } else if (!Util.isEqual(i, b)) {
                    marginLayoutParams.topMargin = b;
                } else {
                    return;
                }
                View view7 = this.f122198e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view8 = view7;
                C117292a.m165358d(view8, aVar2.mo10232b(), "com/tencent/mm/ui/tools/ScrollViewHelper$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/ui/tools/ScrollViewHelper$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f122198e.setLayoutParams(marginLayoutParams);
                this.f122198e.requestLayout();
            }
        }
    }

    /* renamed from: a */
    public static void m49908a(Context context, ViewGroup viewGroup, View view, View view2, View view3, int i) {
        m49909b(context, viewGroup, view, view2, view3, i, 0.0f, false);
    }

    /* renamed from: b */
    public static void m49909b(Context context, ViewGroup viewGroup, View view, View view2, View view3, int i, float f, boolean z) {
        if (viewGroup != null) {
            viewGroup.post(new C45057a(view, view3, context, i, view2, f, viewGroup, z));
        }
    }
}
