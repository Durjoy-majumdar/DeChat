package com.tencent.p014mm.p136ui.conversation;

import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.ui.conversation.d1 */
public final class C6959d1 extends MMBaseAccessibilityConfig {

    /* renamed from: com.tencent.mm.ui.conversation.d1$a */
    public static final class C6960a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C6959d1 f24665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6960a(C6959d1 d1Var) {
            super(1);
            this.f24665d = d1Var;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.hg4)).getText().toString();
            ViewParent parent = view.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            if (C87412m.m108589b(((View) parent).getTag(C0966R.C0970id.acl), Boolean.TRUE)) {
                obj2 = obj2 + 65292 + this.f24665d.getContext().getResources().getString(C0966R.string.aqm);
            }
            return obj2 + 65292 + ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.l0s)).getText().toString() + 65292 + ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.fhs)).getText().toString();
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.d1$b */
    public static final class C6961b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C6959d1 f24666d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6961b(C6959d1 d1Var) {
            super(1);
            this.f24666d = d1Var;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            String obj2 = ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.hg4)).getText().toString();
            ViewParent parent = view.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.View");
            if (C87412m.m108589b(((View) parent).getTag(C0966R.C0970id.acl), Boolean.TRUE)) {
                obj2 = obj2 + 65292 + this.f24666d.getContext().getResources().getString(C0966R.string.aqm);
            }
            return obj2 + 65292 + ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.l0s)).getText().toString() + 65292 + ((NoMeasuredTextView) view.findViewById(C0966R.C0970id.fhs)).getText().toString();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6959d1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        ViewSetter disableChildren = root(C0966R.C0971layout.f7097y6).view(C0966R.C0970id.btg).disableChildren();
        ViewType viewType = ViewType.Button;
        disableChildren.type(viewType).desc((C32226l<? super View, String>) new C6960a(this));
        root(C0966R.C0971layout.f7098y7).view(C0966R.C0970id.btg).disableChildren().type(viewType).desc((C32226l<? super View, String>) new C6961b(this));
    }
}
