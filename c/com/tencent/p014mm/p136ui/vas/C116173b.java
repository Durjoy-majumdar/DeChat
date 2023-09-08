package com.tencent.p014mm.p136ui.vas;

import android.view.ViewGroup;
import android.widget.TextView;
import bo3.C113201a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C36568h;

/* renamed from: com.tencent.mm.ui.vas.b */
public final class C116173b implements C113201a {

    /* renamed from: a */
    public final /* synthetic */ VASCommonActivity f348657a;

    /* renamed from: com.tencent.mm.ui.vas.b$a */
    public static final class C116174a extends C87413o implements C32224a<WeImageView> {

        /* renamed from: d */
        public final /* synthetic */ VASCommonActivity f348658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116174a(VASCommonActivity vASCommonActivity) {
            super(0);
            this.f348658d = vASCommonActivity;
        }

        public Object invoke() {
            return (WeImageView) this.f348658d.mo177559I7().findViewById(C0966R.C0970id.f5471g1);
        }
    }

    /* renamed from: com.tencent.mm.ui.vas.b$b */
    public static final class C116175b extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ VASCommonActivity f348659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C116175b(VASCommonActivity vASCommonActivity) {
            super(0);
            this.f348659d = vASCommonActivity;
        }

        public Object invoke() {
            return (TextView) this.f348659d.mo177559I7().findViewById(16908308);
        }
    }

    public C116173b(VASCommonActivity vASCommonActivity) {
        this.f348657a = vASCommonActivity;
        C36568h.m40985a(new C116175b(vASCommonActivity));
        C36568h.m40985a(new C116174a(vASCommonActivity));
    }

    /* renamed from: a */
    public void mo165736a(int i) {
        ViewGroup.LayoutParams layoutParams = this.f348657a.mo177559I7().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            VASCommonActivity vASCommonActivity = this.f348657a;
            marginLayoutParams.topMargin = i;
            vASCommonActivity.mo177559I7().setLayoutParams(marginLayoutParams);
        }
    }
}
