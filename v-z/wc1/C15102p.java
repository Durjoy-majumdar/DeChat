package wc1;

import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

@C113200q(initialMode = 2)
/* renamed from: wc1.p */
public final class C15102p extends C15641a {

    /* renamed from: wc1.p$a */
    public static final class C15103a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15103a(C15102p pVar) {
            super(1);
            this.f41238d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return this.f41238d.mo14390e3(view, C0966R.C0970id.d5b).toString();
        }
    }

    /* renamed from: wc1.p$b */
    public static final class C15104b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15104b(C15102p pVar) {
            super(1);
            this.f41239d = pVar;
        }

        public Object invoke(Object obj) {
            String str;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            int d3 = this.f41239d.mo14389d3(view, C0966R.C0970id.d3i);
            CharSequence e3 = this.f41239d.mo14390e3(view, C0966R.C0970id.d3j);
            CharSequence e35 = this.f41239d.mo14390e3(view, C0966R.C0970id.d3h);
            if (d3 == 1) {
                if (TextUtils.isEmpty(e35)) {
                    str = this.f41239d.getContext().getString(C0966R.string.d1j, new Object[]{e3});
                } else {
                    str = this.f41239d.getContext().getString(C0966R.string.d1k, new Object[]{e3, e35});
                }
                C87412m.m108593f(str, "{\n                      …                        }");
                return str;
            } else if (d3 == 2) {
                String string = this.f41239d.getContext().getString(C0966R.string.d1g, new Object[]{e3});
                C87412m.m108593f(string, "{\n                      …                        }");
                return string;
            } else if (d3 != 100) {
                return "";
            } else {
                String string2 = this.f41239d.getContext().getString(C0966R.string.d1l);
                C87412m.m108593f(string2, "{\n                      …                        }");
                return string2;
            }
        }
    }

    /* renamed from: wc1.p$c */
    public static final class C15105c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15105c(C15102p pVar) {
            super(1);
            this.f41240d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41240d.mo14390e3(view, C0966R.C0970id.d4q);
            CharSequence e35 = this.f41240d.mo14390e3(view, C0966R.C0970id.d49);
            CharSequence e36 = this.f41240d.mo14390e3(view, C0966R.C0970id.d4o);
            if (TextUtils.isEmpty(e35)) {
                String string = this.f41240d.getContext().getString(C0966R.string.dz8, new Object[]{e3, e36});
                C87412m.m108593f(string, "{\n                      …tr)\n                    }");
                return string;
            }
            String string2 = this.f41240d.getContext().getString(C0966R.string.dzi, new Object[]{e3, e35, e36});
            C87412m.m108593f(string2, "{\n                      …tr)\n                    }");
            return string2;
        }
    }

    /* renamed from: wc1.p$d */
    public static final class C15106d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41241d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15106d(C15102p pVar) {
            super(1);
            this.f41241d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41241d.mo14390e3(view, C0966R.C0970id.d3f);
            CharSequence e35 = this.f41241d.mo14390e3(view, C0966R.C0970id.d3g);
            CharSequence e36 = this.f41241d.mo14390e3(view, C0966R.C0970id.d3e);
            String string = this.f41241d.getContext().getString(C0966R.string.f360458cz1, new Object[]{e3, e35, e36});
            C87412m.m108593f(string, "context.getString(com.te…rticipateStr, endTimeStr)");
            return string;
        }
    }

    /* renamed from: wc1.p$e */
    public static final class C15107e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41242d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15107e(C15102p pVar) {
            super(1);
            this.f41242d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41242d.mo14390e3(view, C0966R.C0970id.f358033d40);
            CharSequence e35 = this.f41242d.mo14390e3(view, C0966R.C0970id.d3o);
            boolean c3 = this.f41242d.mo14388c3(view, C0966R.C0970id.d3z);
            boolean c35 = this.f41242d.mo14388c3(view, C0966R.C0970id.d3y);
            int d3 = this.f41242d.mo14389d3(view, C0966R.C0970id.f358039d52);
            String string = d3 != 2 ? d3 != 4 ? d3 != 9 ? "" : this.f41242d.getContext().getString(C0966R.string.eb9) : this.f41242d.getContext().getString(C0966R.string.eb_) : this.f41242d.getContext().getString(C0966R.string.eb7);
            C87412m.m108593f(string, "when(mediaType) {\n      …e -> \"\"\n                }");
            if (c3) {
                string = this.f41242d.getContext().getString(C0966R.string.esi) + string;
            }
            String string2 = this.f41242d.getContext().getString(c35 ? C0966R.string.cy4 : C0966R.string.f360454cy3);
            C87412m.m108593f(string2, "if (isSelf) context.getS…tring.finder_action_like)");
            String string3 = this.f41242d.getContext().getString(C0966R.string.eke, new Object[]{string, string2, e3, e35});
            C87412m.m108593f(string3, "context.getString(com.te…n, likeCountStr, descStr)");
            return string3;
        }
    }

    /* renamed from: wc1.p$f */
    public static final class C15108f extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41243d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15108f(C15102p pVar) {
            super(1);
            this.f41243d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41243d.mo14390e3(view, C0966R.C0970id.d5i);
            CharSequence e35 = this.f41243d.mo14390e3(view, C0966R.C0970id.d3k);
            String string = this.f41243d.getContext().getString(C0966R.string.ekl, new Object[]{e3, e35});
            C87412m.m108593f(string, "context.getString(com.te…item_desc, title, author)");
            return string;
        }
    }

    /* renamed from: wc1.p$g */
    public static final class C15109g extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41244d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15109g(C15102p pVar) {
            super(1);
            this.f41244d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41244d.mo14390e3(view, C0966R.C0970id.d5i);
            CharSequence e35 = this.f41244d.mo14390e3(view, C0966R.C0970id.d3k);
            CharSequence e36 = this.f41244d.mo14390e3(view, C0966R.C0970id.f358033d40);
            CharSequence e37 = this.f41244d.mo14390e3(view, C0966R.C0970id.d5a);
            String string = this.f41244d.getContext().getString(C0966R.string.ekz, new Object[]{e3, e35, e37, e36});
            C87412m.m108593f(string, "context.getString(com.te…originPercent, likeCount)");
            return string;
        }
    }

    /* renamed from: wc1.p$h */
    public static final class C15110h extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41245d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15110h(C15102p pVar) {
            super(1);
            this.f41245d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41245d.mo14390e3(view, C0966R.C0970id.d5i);
            CharSequence e35 = this.f41245d.mo14390e3(view, C0966R.C0970id.d3r);
            String string = this.f41245d.getContext().getString(C0966R.string.ejy, new Object[]{e3, e35});
            C87412m.m108593f(string, "context.getString(com.te…t_item_desc, title, time)");
            return string;
        }
    }

    /* renamed from: wc1.p$i */
    public static final class C15111i extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41246d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15111i(C15102p pVar) {
            super(1);
            this.f41246d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41246d.mo14390e3(view, C0966R.C0970id.d5i);
            CharSequence e35 = this.f41246d.mo14390e3(view, C0966R.C0970id.d5f);
            String string = this.f41246d.getContext().getString(C0966R.string.el5, new Object[]{e3, e35});
            C87412m.m108593f(string, "context.getString(com.te…_item_desc, title, price)");
            return string;
        }
    }

    /* renamed from: wc1.p$j */
    public static final class C15112j extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15102p f41247d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15112j(C15102p pVar) {
            super(1);
            this.f41247d = pVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41247d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f41247d.mo14390e3(view, C0966R.C0970id.d3o);
            String string = this.f41247d.getContext().getString(C0966R.string.d0x, new Object[]{e3, e35});
            C87412m.m108593f(string, "context.getString(com.te…eed_desc, nickName, desc)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15102p(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.aoh);
        root.view(C0966R.C0970id.e5q).disable();
        root.view(C0966R.C0970id.e4y).desc((int) C0966R.string.d1o).clickAs(C0966R.C0970id.e4x).disableChildren();
        root.view(C0966R.C0970id.e5j).desc((C32226l<? super View, String>) new C15103a(this));
        root.view(C0966R.C0970id.e5b).desc((int) C0966R.string.ek4);
        root.view(C0966R.C0970id.jb6).descFormat(C0966R.string.dn4).valueByView(C0966R.C0970id.e65);
        root.view(C0966R.C0970id.f358263ms3).desc((C32226l<? super View, String>) new C15104b(this)).disableChildren();
        root.view(C0966R.C0970id.e5n).desc((int) C0966R.C0970id.e5o).disableChildren();
        root.view(C0966R.C0970id.e5g).desc((int) C0966R.C0970id.e5h).disableChildren();
        root.view(C0966R.C0970id.gq4).desc((int) C0966R.C0970id.gq6).disableChildren();
        root.view(C0966R.C0970id.f358269e61).desc((int) C0966R.C0970id.e64).disableChildren();
        root.view(C0966R.C0970id.e5w).desc((int) C0966R.C0970id.e5x).disableChildren();
        root.view(C0966R.C0970id.duq).desc((C32226l<? super View, String>) new C15105c(this));
        root.view(C0966R.C0970id.dva).desc((int) C0966R.string.dzp);
        root.view(C0966R.C0970id.i4a).desc((C32226l<? super View, String>) new C15106d(this));
        root(C0966R.C0970id.i5j).view(C0966R.C0970id.i5j).desc((C32226l<? super View, String>) new C15107e(this));
        root(C0966R.C0970id.i69).view(C0966R.C0970id.i69).desc((C32226l<? super View, String>) new C15108f(this));
        root(C0966R.C0970id.i5k).view(C0966R.C0970id.i5k).desc((C32226l<? super View, String>) new C15109g(this));
        root(C0966R.C0970id.i4x).view(C0966R.C0970id.i4x).desc((C32226l<? super View, String>) new C15110h(this));
        root(C0966R.C0970id.i6x).view(C0966R.C0970id.i6x).desc((C32226l<? super View, String>) new C15111i(this));
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.h9i);
        root2.view(C0966R.C0970id.hzh).desc((int) C0966R.string.ekr);
        root2.view(C0966R.C0970id.gyx).desc((int) C0966R.string.eki);
        root(C0966R.C0970id.d_c).view(C0966R.C0970id.d_c).desc((C32226l<? super View, String>) new C15112j(this));
        focusFirst(C0966R.C0970id.a2y);
        focusOrder().next((int) C0966R.C0970id.a2y).next((int) C0966R.C0970id.e4y).next((int) C0966R.C0970id.e5z);
    }
}
