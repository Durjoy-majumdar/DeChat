package com.tencent.p014mm.plugin.finder.view;

import android.view.View;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;
import ob0.C89132b;
import qg1.C12219b;
import rx3.C13598b0;
import te3.C49712hj1;

/* renamed from: com.tencent.mm.plugin.finder.view.l3 */
public final class C4094l3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveVisitorFansRightView f18234d;

    /* renamed from: com.tencent.mm.plugin.finder.view.l3$a */
    public static final class C4095a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ int f18235a;

        /* renamed from: b */
        public final /* synthetic */ FinderLiveVisitorFansRightView f18236b;

        /* renamed from: c */
        public final /* synthetic */ String f18237c;

        public C4095a(int i, FinderLiveVisitorFansRightView finderLiveVisitorFansRightView, String str) {
            this.f18235a = i;
            this.f18236b = finderLiveVisitorFansRightView;
            this.f18237c = str;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256793a == 0 && cVar.f256794b == 0 && this.f18235a == 1) {
                this.f18236b.getNotifyMmkv().putBoolean(this.f18237c, false);
            }
            return C13598b0.f38549a;
        }
    }

    public C4094l3(FinderLiveVisitorFansRightView finderLiveVisitorFansRightView) {
        this.f18234d = finderLiveVisitorFansRightView;
    }

    public final void onClick(View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView$updateContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderLiveVisitorFansRightView finderLiveVisitorFansRightView = this.f18234d;
        finderLiveVisitorFansRightView.mo4634b(!finderLiveVisitorFansRightView.f17881q);
        int i = this.f18234d.f17881q ? 1 : 2;
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        if (oVar == null || (str = oVar.f154345o) == null) {
            str = "";
        }
        new C12219b(str, 1, i, (C49712hj1) null).mo9225i().mo123420E(new C4095a(i, this.f18234d, str));
        FinderLiveVisitorFansRightView finderLiveVisitorFansRightView2 = this.f18234d;
        if (finderLiveVisitorFansRightView2.f17881q) {
            C76912y0.m92768g(finderLiveVisitorFansRightView2.getContext(), this.f18234d.getContext().getResources().getString(C0966R.string.mfq));
        } else {
            C76912y0.m92768g(finderLiveVisitorFansRightView2.getContext(), this.f18234d.getContext().getResources().getString(C0966R.string.mfr));
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView$updateContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
