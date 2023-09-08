package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.p056ui.FinderActivityDescUI;
import di3.C86312j;
import dp1.C7458x0;
import er1.C58684b;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.view.t1 */
public final class C4177t1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderExtendActivityView f18429d;

    public C4177t1(FinderExtendActivityView finderExtendActivityView) {
        this.f18429d = finderExtendActivityView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/view/FinderExtendActivityView$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7458x0.f25666a.mo8608a("1", C66785b.f191882e.mo90662O5(), new C104289g().put("vst_id", this.f18429d.getVstId()));
        FinderExtendActivityView finderExtendActivityView = this.f18429d;
        switch (finderExtendActivityView.f17673n) {
            case 100:
                if (finderExtendActivityView.f17669g == null) {
                    C4191v0 v0Var = new C4191v0(finderExtendActivityView.getContext());
                    v0Var.mo5070e(C0966R.C0971layout.a8h);
                    RelativeLayout relativeLayout = (RelativeLayout) v0Var.f18463f.findViewById(C0966R.C0970id.d6d);
                    if (finderExtendActivityView.f17685z) {
                        TextView textView = (TextView) v0Var.f18463f.findViewById(C0966R.C0970id.f5476g7);
                        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                        layoutParams2.topMargin = C76577a.m92151b(finderExtendActivityView.getContext(), 4);
                        layoutParams2.bottomMargin = C76577a.m92151b(finderExtendActivityView.getContext(), 4);
                        textView.setLayoutParams(layoutParams2);
                        textView.setTextColor(finderExtendActivityView.getResources().getColor(C0966R.color.FG_0));
                        textView.setAlpha(1.0f);
                        ((TextView) v0Var.f18463f.findViewById(C0966R.C0970id.f5475g6)).setVisibility(8);
                        relativeLayout.setBackground(finderExtendActivityView.getContext().getResources().getDrawable(C0966R.C0969drawable.f5036ut));
                    }
                    v0Var.f18463f.findViewById(C0966R.C0970id.d6d).setOnClickListener(new C4184u1(finderExtendActivityView, v0Var));
                    v0Var.f18463f.findViewById(C0966R.C0970id.d6p).setOnClickListener(new C4193v1(finderExtendActivityView, v0Var));
                    v0Var.f18463f.findViewById(C0966R.C0970id.d6j).setOnClickListener(new C4198w1(v0Var));
                    v0Var.f18472r = new C4205x1(finderExtendActivityView);
                    finderExtendActivityView.f17669g = v0Var;
                }
                C4191v0 v0Var2 = finderExtendActivityView.f17669g;
                if (v0Var2 != null && !v0Var2.mo5069d()) {
                    v0Var2.mo5073h();
                    break;
                }
            case 101:
            case 102:
                finderExtendActivityView.getClass();
                Intent intent = new Intent();
                finderExtendActivityView.setIntentParam(intent);
                Context context = finderExtendActivityView.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivity mMActivity = (MMActivity) context;
                ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                intent.setClass(mMActivity, FinderActivityDescUI.class);
                intent.putExtra("key_activity_already_participate", false);
                mMActivity.startActivityForResult(intent, 20002);
                break;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/view/FinderExtendActivityView$onClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
