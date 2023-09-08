package wc1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

@C113200q(initialMode = 2)
/* renamed from: wc1.f */
public final class C26425f extends C15641a implements C15127x {

    /* renamed from: wc1.f$a */
    public static final class C26426a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C26425f f73698d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26426a(C26425f fVar) {
            super(1);
            this.f73698d = fVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f73698d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f73698d.mo14390e3(view, C0966R.C0970id.d3n);
            CharSequence e36 = this.f73698d.mo14390e3(view, C0966R.C0970id.d3l);
            int d3 = this.f73698d.mo14389d3(view, C0966R.C0970id.f358033d40);
            String string = this.f73698d.getContext().getString(C0966R.string.d3u, new Object[]{e3, e35, e36, Integer.valueOf(d3)});
            C87412m.m108593f(string, "context.getString(com.te…ommentContent, likeCount)");
            return string;
        }
    }

    /* renamed from: wc1.f$b */
    public static final class C26427b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C26425f f73699d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26427b(C26425f fVar) {
            super(1);
            this.f73699d = fVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            int d3 = this.f73699d.mo14389d3(view, C0966R.C0970id.f358033d40);
            boolean c3 = this.f73699d.mo14388c3(view, C0966R.C0970id.d3w);
            String string = this.f73699d.getContext().getString(C0966R.string.f360477mv1, new Object[]{Integer.valueOf(d3)});
            C87412m.m108593f(string, "context.getString(com.te…ent_like_desc, likeCount)");
            if (c3) {
                return string + "已赞";
            }
            return string + "未赞";
        }
    }

    /* renamed from: wc1.f$c */
    public static final class C26428c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C26425f f73700d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26428c(C26425f fVar) {
            super(1);
            this.f73700d = fVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f73700d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f73700d.mo14390e3(view, C0966R.C0970id.d3n);
            CharSequence e36 = this.f73700d.mo14390e3(view, C0966R.C0970id.d3l);
            CharSequence e37 = this.f73700d.mo14390e3(view, C0966R.C0970id.d5d);
            String string = this.f73700d.getContext().getString(C0966R.string.d3v, new Object[]{e3, e35, e37, e36});
            C87412m.m108593f(string, "context.getString(com.te…Nickname, commentContent)");
            return string;
        }
    }

    /* renamed from: wc1.f$d */
    public static final class C26429d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C26425f f73701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26429d(C26425f fVar) {
            super(1);
            this.f73701d = fVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            int d3 = this.f73701d.mo14389d3(view, C0966R.C0970id.f358033d40);
            boolean c3 = this.f73701d.mo14388c3(view, C0966R.C0970id.d3w);
            String string = this.f73701d.getContext().getString(C0966R.string.f360477mv1, new Object[]{Integer.valueOf(d3)});
            C87412m.m108593f(string, "context.getString(com.te…ent_like_desc, likeCount)");
            if (c3) {
                return string + "已赞";
            }
            return string + "未赞";
        }
    }

    /* renamed from: wc1.f$e */
    public static final class C26430e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C26425f f73702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26430e(C26425f fVar) {
            super(1);
            this.f73702d = fVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            return String.valueOf(this.f73702d.mo14390e3(view, C0966R.C0970id.d3s));
        }
    }

    /* renamed from: wc1.f$f */
    public static final class C26431f extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C26425f f73703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26431f(C26425f fVar) {
            super(1);
            this.f73703d = fVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f73703d.mo14390e3(view, C0966R.C0970id.d5e);
            String string = this.f73703d.getContext().getString(C0966R.string.etf, new Object[]{e3});
            C87412m.m108593f(string, "context.getString(com.te…_scene_comment, selfName)");
            return string;
        }
    }

    /* renamed from: wc1.f$g */
    public static final class C26432g extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C26425f f73704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26432g(C26425f fVar) {
            super(1);
            this.f73704d = fVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f73704d.mo14390e3(view, C0966R.C0970id.d58);
            String string = this.f73704d.getContext().getString(C0966R.string.d6x, new Object[]{e3});
            C87412m.m108593f(string, "context.getString(com.te…e_liked_format, nickname)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26425f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.f357885ca0).view(C0966R.C0970id.be_).desc((int) C0966R.string.bfj);
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.cyd);
        root.view(C0966R.C0970id.cyd).desc((C32226l<? super View, String>) new C26426a(this));
        ViewSetter view = root.view(C0966R.C0970id.bj4);
        view.disable();
        view.disableChildren();
        root.view(C0966R.C0970id.lwb).desc((C32226l<? super View, String>) new C26427b(this));
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.cye);
        root2.view(C0966R.C0970id.cye).desc((C32226l<? super View, String>) new C26428c(this));
        ViewSetter view2 = root2.view(C0966R.C0970id.bj4);
        view2.disable();
        view2.disableChildren();
        root2.view(C0966R.C0970id.lwb).desc((C32226l<? super View, String>) new C26429d(this));
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0970id.bji);
        root3.view(C0966R.C0970id.bjh).desc((C32226l<? super View, String>) new C26430e(this)).disableChildren();
        root3.view(C0966R.C0970id.f357747bk2).desc((C32226l<? super View, String>) new C26431f(this)).disableChildren();
        root3.view(C0966R.C0970id.jni).desc((int) C0966R.string.b3j);
        MMBaseAccessibilityConfig.ConfigHelper root4 = root(C0966R.C0970id.f357888ca3);
        root4.view(C0966R.C0970id.be_).desc((int) C0966R.string.bfj);
        root4.view(C0966R.C0970id.ca4).desc((int) C0966R.string.d6w);
        root(C0966R.C0970id.dab).view(C0966R.C0970id.e8i).desc((C32226l<? super View, String>) new C26432g(this)).disableChildren();
    }
}
