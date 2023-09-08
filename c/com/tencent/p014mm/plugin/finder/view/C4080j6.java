package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.w$$c;

/* renamed from: com.tencent.mm.plugin.finder.view.j6 */
public final class C4080j6 extends w$$c {

    /* renamed from: com.tencent.mm.plugin.finder.view.j6$a */
    public static final class C4081a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C4080j6 f18211d;

        public C4081a(C4080j6 j6Var) {
            this.f18211d = j6Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/view/GameTeamCoinNoteBottomPage$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f18211d.mo12476d();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/GameTeamCoinNoteBottomPage$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public View mo4781a(Context context) {
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.acs, (ViewGroup) null, false);
        ((WeImageView) inflate.findViewById(C0966R.C0970id.deb)).setOnClickListener(new C4081a(this));
        return inflate;
    }
}
