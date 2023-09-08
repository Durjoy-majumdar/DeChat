package wc1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

@C113200q(initialMode = 2)
/* renamed from: wc1.v */
public final class C78529v extends C15641a implements C15129z {

    /* renamed from: wc1.v$a */
    public static final class C78530a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C78529v f230014d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78530a(C78529v vVar) {
            super(1);
            this.f230014d = vVar;
        }

        public Object invoke(Object obj) {
            String str;
            String string;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f230014d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f230014d.mo14390e3(view, C0966R.C0970id.d3k);
            CharSequence e36 = this.f230014d.mo14390e3(view, C0966R.C0970id.d56);
            CharSequence e37 = this.f230014d.mo14390e3(view, C0966R.C0970id.d5d);
            if (Util.isNullOrNil(e36) || Util.isNullOrNil(e37)) {
                if (Util.isNullOrNil(e35)) {
                    string = this.f230014d.getContext().getString(C0966R.string.edk, new Object[]{e3});
                } else {
                    string = this.f230014d.getContext().getString(C0966R.string.edj, new Object[]{e3, e35});
                }
                C87412m.m108593f(str, "{\n                    if…      }\n                }");
            } else {
                if (Util.isNullOrNil(e35)) {
                    str = this.f230014d.getContext().getString(C0966R.string.ede, new Object[]{e3, e36});
                } else {
                    str = this.f230014d.getContext().getString(C0966R.string.edd, new Object[]{e3, e35, e37, e36});
                }
                C87412m.m108593f(str, "{\n                    if…      }\n                }");
            }
            return str;
        }
    }

    /* renamed from: wc1.v$b */
    public static final class C78531b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C78529v f230015d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78531b(C78529v vVar) {
            super(1);
            this.f230015d = vVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f230015d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f230015d.mo14390e3(view, C0966R.C0970id.d5d);
            if (Util.isNullOrNil(e35)) {
                String string = this.f230015d.getContext().getString(C0966R.string.edk, new Object[]{e3});
                C87412m.m108593f(string, "context.getString(com.te…ke_video_desc2, nickName)");
                return string;
            }
            String string2 = this.f230015d.getContext().getString(C0966R.string.edj, new Object[]{e3, e35});
            C87412m.m108593f(string2, "context.getString(com.te…sc, nickName, authorName)");
            return string2;
        }
    }

    /* renamed from: wc1.v$c */
    public static final class C78532c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C78529v f230016d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78532c(C78529v vVar) {
            super(1);
            this.f230016d = vVar;
        }

        public Object invoke(Object obj) {
            String str;
            String string;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f230016d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f230016d.mo14390e3(view, C0966R.C0970id.d3k);
            CharSequence e36 = this.f230016d.mo14390e3(view, C0966R.C0970id.d54);
            CharSequence e37 = this.f230016d.mo14390e3(view, C0966R.C0970id.d56);
            CharSequence e38 = this.f230016d.mo14390e3(view, C0966R.C0970id.d5d);
            if (Util.isNullOrNil(e37) || Util.isNullOrNil(e38)) {
                if (Util.isNullOrNil(e35)) {
                    string = this.f230016d.getContext().getString(C0966R.string.f360717ed1, new Object[]{e3, e36});
                } else {
                    string = this.f230016d.getContext().getString(C0966R.string.f360716ed0, new Object[]{e3, e36, e35});
                }
                C87412m.m108593f(str, "{\n                    if…      }\n                }");
            } else {
                if (Util.isNullOrNil(e35)) {
                    str = this.f230016d.getContext().getString(C0966R.string.ecz, new Object[]{e3, e36, e38, e37});
                } else {
                    str = this.f230016d.getContext().getString(C0966R.string.ecy, new Object[]{e3, e36, e35, e38, e37});
                }
                C87412m.m108593f(str, "{\n                    if…      }\n                }");
            }
            return str;
        }
    }

    /* renamed from: wc1.v$d */
    public static final class C78533d extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C78529v f230017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78533d(C78529v vVar) {
            super(1);
            this.f230017d = vVar;
        }

        public Object invoke(Object obj) {
            String str;
            String string;
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f230017d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f230017d.mo14390e3(view, C0966R.C0970id.d3k);
            CharSequence e36 = this.f230017d.mo14390e3(view, C0966R.C0970id.d54);
            CharSequence e37 = this.f230017d.mo14390e3(view, C0966R.C0970id.d56);
            CharSequence e38 = this.f230017d.mo14390e3(view, C0966R.C0970id.d5d);
            if (Util.isNullOrNil(e37) || Util.isNullOrNil(e38)) {
                if (Util.isNullOrNil(e35)) {
                    string = this.f230017d.getContext().getString(C0966R.string.f360717ed1, new Object[]{e3, e36});
                } else {
                    string = this.f230017d.getContext().getString(C0966R.string.f360716ed0, new Object[]{e3, e36, e35});
                }
                C87412m.m108593f(str, "{\n                    if…      }\n                }");
            } else {
                if (Util.isNullOrNil(e35)) {
                    str = this.f230017d.getContext().getString(C0966R.string.ecz, new Object[]{e3, e36, e38, e37});
                } else {
                    str = this.f230017d.getContext().getString(C0966R.string.ecy, new Object[]{e3, e36, e35, e38, e37});
                }
                C87412m.m108593f(str, "{\n                    if…      }\n                }");
            }
            return str;
        }
    }

    /* renamed from: wc1.v$e */
    public static final class C78534e extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C78529v f230018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78534e(C78529v vVar) {
            super(1);
            this.f230018d = vVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f230018d.mo14390e3(view, C0966R.C0970id.d58);
            String string = this.f230018d.getContext().getString(C0966R.string.ed7, new Object[]{e3});
            C87412m.m108593f(string, "context.getString(com.te…sg_follow_desc, nickName)");
            return string;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78529v(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.h1v).view(C0966R.C0970id.h1v).desc((C32226l<? super View, String>) new C78530a(this));
        root(C0966R.C0970id.h1u).view(C0966R.C0970id.h1u).desc((C32226l<? super View, String>) new C78531b(this));
        root(C0966R.C0970id.h1s).view(C0966R.C0970id.h1s).desc((C32226l<? super View, String>) new C78532c(this));
        root(C0966R.C0970id.h1r).view(C0966R.C0970id.h1r).desc((C32226l<? super View, String>) new C78533d(this));
        root(C0966R.C0970id.h1t).view(C0966R.C0970id.h1t).desc((C32226l<? super View, String>) new C78534e(this));
    }
}
