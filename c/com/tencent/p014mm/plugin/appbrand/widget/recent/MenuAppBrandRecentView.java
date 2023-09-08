package com.tencent.p014mm.plugin.appbrand.widget.recent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82262v;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.widget.recent.AppBrandRecentView;
import com.tencent.p014mm.plugin.appbrand.widget.recent.BaseAppBrandRecentView;
import di3.C86312j;
import kr0.C76630x0;
import xt0.C78981f;
import xt0.C91343g;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.MenuAppBrandRecentView */
public class MenuAppBrandRecentView extends BaseAppBrandRecentView {

    /* renamed from: R1 */
    public static final int f247779R1;

    /* renamed from: S1 */
    public static final int f247780S1;

    /* renamed from: Q1 */
    public AppBrandRecentView.C85013a f247781Q1;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.MenuAppBrandRecentView$a */
    public class C85026a implements AppBrandRecentView.C85013a {
        public C85026a() {
        }

        /* renamed from: a */
        public boolean mo116539a(View view, C91343g gVar, float f, float f2) {
            AppBrandRecentView.C85013a aVar = MenuAppBrandRecentView.this.f247781Q1;
            if (aVar != null) {
                return aVar.mo116539a(view, gVar, f, f2);
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo116540b(View view, C91343g gVar, float f, float f2) {
            AppBrandRecentView.C85013a aVar = MenuAppBrandRecentView.this.f247781Q1;
            if (aVar != null ? aVar.mo116540b(view, gVar, f, f2) : false) {
                return true;
            }
            gVar.getClass();
            AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
            appBrandStatObject.f245533f = C82262v.CTRL_INDEX;
            Context context = MenuAppBrandRecentView.this.getContext();
            LocalUsageInfo localUsageInfo = gVar.f261985a;
            ((C76630x0) C86312j.m106911c(C76630x0.class)).Ko0(context, localUsageInfo.f239040d, (String) null, localUsageInfo.f239042f, -1, (String) null, appBrandStatObject);
            return false;
        }
    }

    static {
        int i = C78981f.f231928e;
        f247779R1 = i - 1;
        f247780S1 = i;
    }

    public MenuAppBrandRecentView(Context context) {
        super(context);
    }

    /* renamed from: A1 */
    public void mo117965A1(Context context) {
        super.mo117965A1(context);
        super.setOnItemClickListener(new C85026a());
    }

    /* renamed from: B1 */
    public void mo117966B1(BaseAppBrandRecentView.C85021d dVar, C91343g gVar, int i) {
        super.mo117966B1(dVar, gVar, i);
        dVar.f247766B.setTextColor(getContext().getResources().getColor(C0966R.color.a7f));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6511gu;
    }

    public int getLoadCount() {
        return f247780S1;
    }

    public int getShowCount() {
        return f247779R1;
    }

    public String getType() {
        Class<MenuAppBrandRecentView> cls = MenuAppBrandRecentView.class;
        return "MenuAppBrandRecentView";
    }

    public void setOnItemClickListener(AppBrandRecentView.C85013a aVar) {
        this.f247781Q1 = aVar;
    }

    public MenuAppBrandRecentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
