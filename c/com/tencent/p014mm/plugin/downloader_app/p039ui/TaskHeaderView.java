package com.tencent.p014mm.plugin.downloader_app.p039ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.downloader_app.model.C40990e0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import wq3.C111847h;

/* renamed from: com.tencent.mm.plugin.downloader_app.ui.TaskHeaderView */
public class TaskHeaderView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public TextView f12235d;

    /* renamed from: e */
    public TextView f12236e;

    /* renamed from: f */
    public View f12237f;

    public TaskHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo2094a(C40990e0 e0Var, boolean z) {
        C40990e0 e0Var2 = e0Var;
        int i = e0Var2.f110332c;
        if (i == 1) {
            this.f12235d.setText(getResources().getString(C0966R.string.c1p));
            this.f12236e.setVisibility(8);
        } else if (i == 3) {
            this.f12235d.setText(getResources().getString(C0966R.string.k7b));
            this.f12236e.setText(getResources().getString(C0966R.string.k7a, new Object[]{Integer.valueOf(e0Var2.f110341l)}));
            this.f12236e.setVisibility(0);
        } else if (i == 5) {
            this.f12235d.setText(getResources().getString(C0966R.string.c19));
            this.f12236e.setVisibility(8);
        }
        if (z) {
            View view = this.f12237f;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view3 = this.f12237f;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/downloader_app/ui/TaskHeaderView", "setData", "(Lcom/tencent/mm/plugin/downloader_app/model/TaskInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (e0Var2.f110330a) {
            this.f12235d.setTextColor(getContext().getResources().getColor(C0966R.color.f3310nc));
            this.f12236e.setVisibility(8);
            return;
        }
        this.f12235d.setTextColor(getContext().getResources().getColor(C0966R.color.a0m));
        this.f12236e.setVisibility(0);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12237f = findViewById(C0966R.C0970id.c7o);
        this.f12235d = (TextView) findViewById(C0966R.C0970id.fmx);
        this.f12236e = (TextView) findViewById(C0966R.C0970id.iu8);
    }
}
