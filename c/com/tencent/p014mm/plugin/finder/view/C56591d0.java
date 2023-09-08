package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import je1.C33560t2;
import nj3.C76912y0;
import sx3.C64186f0;
import te3.C64772vh0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.finder.view.d0 */
public final class C56591d0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ View f162231d;

    /* renamed from: e */
    public final /* synthetic */ FinderAdFeedbackWindow f162232e;

    /* renamed from: com.tencent.mm.plugin.finder.view.d0$a */
    public static final class C56592a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderAdFeedbackWindow f162233d;

        public C56592a(FinderAdFeedbackWindow finderAdFeedbackWindow) {
            this.f162233d = finderAdFeedbackWindow;
        }

        public final void run() {
            C64186f0 f0Var = C64186f0.f181907d;
            FinderAdFeedbackWindow finderAdFeedbackWindow = this.f162233d;
            long j = finderAdFeedbackWindow.f161999g;
            int i = finderAdFeedbackWindow.f162001i;
            C64772vh0 vh02 = finderAdFeedbackWindow.f162002j;
            String str = vh02.f185889g;
            String str2 = str == null ? "" : str;
            String str3 = vh02.f185890h;
            C86709a0.m107524d().mo123460f(new C33560t2(true, f0Var, j, i, str2, str3 == null ? "" : str3));
            Context context = this.f162233d.f161998f;
            C76912y0.m92768g(context, context.getResources().getString(C0966R.string.f8067dh));
            FinderAdFeedbackWindow finderAdFeedbackWindow2 = this.f162233d;
            finderAdFeedbackWindow2.f162004o = 1;
            finderAdFeedbackWindow2.dismiss();
        }
    }

    public C56591d0(View view, FinderAdFeedbackWindow finderAdFeedbackWindow) {
        this.f162231d = view;
        this.f162232e = finderAdFeedbackWindow;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((TextView) this.f162231d.findViewById(C0966R.C0970id.ohq)).setTextColor(this.f162232e.f161998f.getResources().getColor(C0966R.color.f2939n));
        ((WeImageView) this.f162231d.findViewById(C0966R.C0970id.oo4)).setIconColor(this.f162232e.f161998f.getResources().getColor(C0966R.color.f2939n));
        this.f162231d.setBackgroundDrawable(this.f162232e.f161998f.getResources().getDrawable(C0966R.C0969drawable.f5041ux));
        C119179t tVar = C119157j.f356862d;
        C56592a aVar = new C56592a(this.f162232e);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar, 200, false);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderAdFeedbackWindow$initFirstPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
