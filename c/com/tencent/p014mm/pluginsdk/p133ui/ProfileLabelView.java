package com.tencent.p014mm.pluginsdk.p133ui;

import a22.C67001a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import b22.C28250a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C97625j3;
import java.util.ArrayList;
import kg3.C76577a;
import p629ny.C76979h;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileLabelView */
public class ProfileLabelView extends ProfileItemView {

    /* renamed from: e */
    public TextView f211647e;

    /* renamed from: f */
    public TextView f211648f;

    public ProfileLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo5918a() {
        this.f211647e = (TextView) findViewById(C0966R.C0970id.bny);
        this.f211648f = (TextView) findViewById(C0966R.C0970id.bnz);
        setClickable(true);
    }

    /* renamed from: b */
    public boolean mo100283b() {
        C44673z4 z4Var;
        Class cls = C76979h.class;
        TextView textView = this.f211648f;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(getContext(), C0966R.dimen.f3815f9);
            this.f211648f.setLayoutParams(layoutParams);
        }
        if (!this.f24012d.mo62927s3()) {
            String v2 = this.f24012d.mo73978v2();
            if (!Util.isNullOrNil(v2)) {
                z4Var = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(v2);
            } else {
                z4Var = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f24012d.getUsername());
            }
            if (z4Var != null) {
                String str = z4Var.field_contactLabels;
                ArrayList arrayList = (ArrayList) ((C67001a) C28250a.m38138a()).mo90969g(str);
                if (!Util.isNullOrNil(str) && arrayList != null && arrayList.size() > 0) {
                    this.f211647e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), Util.listToString(arrayList, getContext().getResources().getString(C0966R.string.bid))));
                    return true;
                }
            }
            setVisibility(8);
            return false;
        } else if (C75592q0.m90764L(this.f24012d.getUsername())) {
            setVisibility(8);
            return false;
        } else {
            String r2 = this.f24012d.mo73974r2();
            ArrayList arrayList2 = (ArrayList) ((C67001a) C28250a.m38138a()).mo90972j(r2);
            if (Util.isNullOrNil(r2) || arrayList2 == null || arrayList2.size() <= 0) {
                setVisibility(8);
                return false;
            }
            this.f211647e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(getContext(), Util.listToString(arrayList2, getContext().getResources().getString(C0966R.string.bid))));
            return true;
        }
    }

    public int getLayout() {
        return C0966R.C0971layout.boj;
    }

    public ProfileLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
