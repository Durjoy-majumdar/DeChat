package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import kg3.C76577a;
import p629ny.C76979h;
import xc0.C78795g;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileDescribeView */
public class ProfileDescribeView extends ProfileItemView {

    /* renamed from: e */
    public TextView f211627e;

    /* renamed from: f */
    public TextView f211628f;

    /* renamed from: g */
    public ImageView f211629g;

    public ProfileDescribeView(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public void mo5918a() {
        this.f211627e = (TextView) findViewById(C0966R.C0970id.bnm);
        this.f211628f = (TextView) findViewById(C0966R.C0970id.bno);
        this.f211629g = (ImageView) findViewById(C0966R.C0970id.nsy);
        setClickable(true);
    }

    /* renamed from: b */
    public boolean mo100270b() {
        Class cls = C76979h.class;
        TextView textView = this.f211628f;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = C76577a.m92157h(getContext(), C0966R.dimen.f3815f9);
            this.f211628f.setLayoutParams(layoutParams);
        }
        C72996z1 z1Var = this.f24012d;
        if (z1Var != null) {
            String str = z1Var.f149513S0;
            boolean z = !Util.isNullOrNil(z1Var.f149515T0) || C78795g.m95196e().mo108708f(this.f24012d.getUsername());
            this.f211629g.setVisibility(z ? 0 : 8);
            if (!this.f24012d.mo62927s3()) {
                C44673z4 z4Var = null;
                String v2 = this.f24012d.mo73978v2();
                if (!Util.isNullOrNil(v2)) {
                    z4Var = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(v2);
                }
                if (z4Var != null && z4Var.systemRowid < 0) {
                    z4Var = ((C44651a5) C97625j3.m125812b().mo105880F()).mo69630Lo(this.f24012d.getUsername());
                }
                if (z4Var == null || Util.isNullOrNil(z4Var.field_conDescription)) {
                    Log.m105924i("MicroMsg.ProfileDescribeView", "ProfileDescribeView gone");
                    setVisibility(8);
                    return false;
                }
                this.f211627e.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), Util.nullAsNil(z4Var.field_conDescription), this.f211627e.getTextSize()));
                return true;
            } else if (!Util.isNullOrNil(str) && z) {
                this.f211627e.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), new SpannableString("  " + str), this.f211627e.getTextSize()));
                return true;
            } else if (!Util.isNullOrNil(str) && !z) {
                this.f211627e.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), Util.nullAsNil(str), this.f211627e.getTextSize()));
                return true;
            } else if (Util.isNullOrNil(str) && z) {
                return true;
            } else {
                if (!Util.isNullOrNil(str) || z) {
                    Log.m105924i("MicroMsg.ProfileDescribeView", "ProfileDescribeView gone,isContact");
                    setVisibility(8);
                    return false;
                }
                Log.m105924i("MicroMsg.ProfileDescribeView", "ProfileDescribeView gone,isContact");
                setVisibility(8);
                return false;
            }
        } else {
            setVisibility(8);
            return false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public int getLayout() {
        return C0966R.C0971layout.bof;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public ProfileDescribeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProfileDescribeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
