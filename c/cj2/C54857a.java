package cj2;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Arrays;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: cj2.a */
public final class C54857a extends MMBaseAccessibilityConfig {

    /* renamed from: cj2.a$a */
    public static final class C54858a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C54858a f153786d = new C54858a();

        public C54858a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            return "图片按钮";
        }
    }

    /* renamed from: cj2.a$b */
    public static final class C54859b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C54859b f153787d = new C54859b();

        public C54859b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            return "图片按钮";
        }
    }

    /* renamed from: cj2.a$c */
    public static final class C54860c extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public static final C54860c f153788d = new C54860c();

        public C54860c() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            MMSwitchBtn mMSwitchBtn = view instanceof MMSwitchBtn ? (MMSwitchBtn) view : null;
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setCheck(false);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj2.a$d */
    public static final class C54861d extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public static final C54861d f153789d = new C54861d();

        public C54861d() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            MMSwitchBtn mMSwitchBtn = view instanceof MMSwitchBtn ? (MMSwitchBtn) view : null;
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setCheck(true);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: cj2.a$e */
    public static final class C54862e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C54862e f153790d = new C54862e();

        public C54862e() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            ViewParent parent = view.getParent();
            Object obj2 = null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                obj2 = view2.getTag(C0966R.C0970id.f359346ke3);
            }
            String format = String.format("这是%s的头像", Arrays.copyOf(new Object[]{String.valueOf(obj2)}, 1));
            C87412m.m108593f(format, "format(format, *args)");
            return format;
        }
    }

    /* renamed from: cj2.a$f */
    public static final class C54863f extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C54863f f153791d = new C54863f();

        public C54863f() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence charSequence = null;
            TextView textView = view instanceof TextView ? (TextView) view : null;
            if (textView != null) {
                charSequence = textView.getText();
            }
            return Boolean.valueOf(C87412m.m108589b(String.valueOf(charSequence), "I am warning!"));
        }
    }

    /* renamed from: cj2.a$g */
    public static final class C54864g extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public static final C54864g f153792d = new C54864g();

        public C54864g() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((View) obj, LocaleUtil.ITALIAN);
            return "开关";
        }
    }

    /* renamed from: cj2.a$h */
    public static final class C54865h extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C54865h f153793d = new C54865h();

        public C54865h() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            MMSwitchBtn mMSwitchBtn = view instanceof MMSwitchBtn ? (MMSwitchBtn) view : null;
            return Boolean.valueOf(mMSwitchBtn != null ? mMSwitchBtn.f220433y : false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54857a(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.iog);
        root.view(C0966R.C0970id.ion).desc((C32226l<? super View, String>) C54858a.f153786d);
        root.view(C0966R.C0970id.io9).desc((int) C0966R.string.i3l);
        root.view(C0966R.C0970id.ioj).disable();
        root.view(C0966R.C0970id.iol).descFormat(C0966R.string.i3o).valueByView(C0966R.C0970id.iom);
        root.view(C0966R.C0970id.iob).descFormat(C0966R.string.i3n).valueByView(C0966R.C0970id.ioa).valueByKey("number_key");
        root.view(C0966R.C0970id.ion).type(ViewType.Button).desc((C32226l<? super View, String>) C54859b.f153787d);
        root.view(C0966R.C0970id.ioa).descFormat(C0966R.string.i3m).valueByView(C0966R.C0970id.ioa);
        root(C0966R.C0971layout.bs8).view(C0966R.C0970id.ioc).desc((C32226l<? super View, String>) C54862e.f153790d);
        MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0970id.iog);
        root2.disable(C0966R.C0970id.iok);
        root2.disable(C0966R.C0970id.iom);
        root2.disable(C0966R.C0970id.iog);
        focusFirst(C0966R.C0970id.ion);
        focusOrder().next((int) C0966R.C0970id.ion).next((int) C0966R.C0970id.io9).next((int) C0966R.C0970id.iov).next((int) C0966R.C0970id.iow);
        focusOrder().next((int) C0966R.C0970id.io_).next((int) C0966R.C0970id.ioa);
        MMBaseAccessibilityConfig.ConfigHelper root3 = root(C0966R.C0971layout.f359945bs1);
        for (Number intValue : C64197v.m75537f(Integer.valueOf(C0966R.C0970id.io9), Integer.valueOf(C0966R.C0970id.io_), Integer.valueOf(C0966R.C0970id.iol))) {
            root3.view(intValue.intValue()).type(ViewType.Button);
        }
        root(C0966R.C0971layout.f359945bs1).view(C0966R.C0970id.iow).talkOn(C0966R.string.i3q, C54863f.f153791d);
        root(C0966R.C0971layout.f359945bs1).view(C0966R.C0970id.ioi).clickAs(C0966R.C0970id.ioh);
        root(C0966R.C0971layout.f359945bs1).view(C0966R.C0970id.ioi).disableChildren();
        root(C0966R.C0971layout.f359945bs1).view(C0966R.C0970id.io_).expand(40, 40, 40, 40);
        root(C0966R.C0971layout.f359945bs1).view(C0966R.C0970id.iot).disExpand();
        view(C0966R.C0971layout.f359945bs1, C0966R.C0970id.iou).desc((C32226l<? super View, String>) C54864g.f153792d).checkOn(C54865h.f153793d);
        view(C0966R.C0971layout.f359945bs1, C0966R.C0970id.iou).type(ViewType.SeekBar).onSeekForward(C54860c.f153788d).onSeekBackward(C54861d.f153789d);
    }
}
