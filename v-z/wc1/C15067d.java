package wc1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import xc1.C15641a;

@C113200q(initialMode = 2)
/* renamed from: wc1.d */
public final class C15067d extends C15641a implements C15126w {

    /* renamed from: wc1.d$a */
    public static final class C15068a extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15067d f41201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15068a(C15067d dVar) {
            super(1);
            this.f41201d = dVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41201d.mo14390e3(view, C0966R.C0970id.d5j);
            String string = this.f41201d.getContext().getString(C0966R.string.esn, new Object[]{e3});
            C87412m.m108593f(string, "context.getString(com.te…er_topic_desc, topicName)");
            return string;
        }
    }

    /* renamed from: wc1.d$b */
    public static final class C15069b extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15067d f41202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15069b(C15067d dVar) {
            super(1);
            this.f41202d = dVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41202d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f41202d.mo14390e3(view, C0966R.C0970id.f358033d40);
            CharSequence e36 = this.f41202d.mo14390e3(view, C0966R.C0970id.d3o);
            int d3 = this.f41202d.mo14389d3(view, C0966R.C0970id.d3i);
            int d35 = this.f41202d.mo14389d3(view, C0966R.C0970id.f358039d52);
            this.f41202d.getClass();
            Object tag = view.getTag(C0966R.C0970id.d3v);
            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            C15064b bVar = C15064b.f41199a;
            CharSequence b = bVar.mo14077b(this.f41202d.getContext(), d3);
            CharSequence d = bVar.mo14079d(this.f41202d.getContext(), d35);
            String str = "";
            if (((String) d).length() == 0) {
                return str;
            }
            if (!booleanValue) {
                str = this.f41202d.getContext().getString(C0966R.string.f360454cy3);
                C87412m.m108593f(str, "context.getString(com.te…tring.finder_action_like)");
            }
            String string = this.f41202d.getContext().getString(C0966R.string.emw, new Object[]{e3, d, b, str, e35, e36});
            C87412m.m108593f(string, "context.getString(com.te… action, likeCount, desc)");
            return string;
        }
    }

    /* renamed from: wc1.d$c */
    public static final class C15070c extends C87413o implements C32226l<View, String> {

        /* renamed from: d */
        public final /* synthetic */ C15067d f41203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15070c(C15067d dVar) {
            super(1);
            this.f41203d = dVar;
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            CharSequence e3 = this.f41203d.mo14390e3(view, C0966R.C0970id.d58);
            CharSequence e35 = this.f41203d.mo14390e3(view, C0966R.C0970id.d3o);
            CharSequence e36 = this.f41203d.mo14390e3(view, C0966R.C0970id.d3n);
            int d3 = this.f41203d.mo14389d3(view, C0966R.C0970id.d55);
            if (C87412m.m108589b(e3, this.f41203d.getContext().getString(C0966R.string.d4k))) {
                if (d3 > 0) {
                    String string = this.f41203d.getContext().getString(C0966R.string.d4r, new Object[]{e35});
                    C87412m.m108593f(string, "{\n                      …nt)\n                    }");
                    return string;
                }
                String string2 = this.f41203d.getContext().getString(C0966R.string.d4q, new Object[]{e35});
                C87412m.m108593f(string2, "{\n                      …nt)\n                    }");
                return string2;
            } else if (C87412m.m108589b(e3, this.f41203d.getContext().getString(C0966R.string.d4l))) {
                if (d3 > 0) {
                    String string3 = this.f41203d.getContext().getString(C0966R.string.d4p, new Object[]{e35});
                    C87412m.m108593f(string3, "{\n                      …nt)\n                    }");
                    return string3;
                }
                String string4 = this.f41203d.getContext().getString(C0966R.string.d4o, new Object[]{e35});
                C87412m.m108593f(string4, "{\n                      …nt)\n                    }");
                return string4;
            } else if (d3 > 0) {
                String string5 = this.f41203d.getContext().getString(C0966R.string.d4n, new Object[]{Integer.valueOf(d3), e3, e35, e36});
                C87412m.m108593f(string5, "{\n                      …me)\n                    }");
                return string5;
            } else {
                String string6 = this.f41203d.getContext().getString(C0966R.string.d4m, new Object[]{e3, e35, e36});
                C87412m.m108593f(string6, "{\n                      …me)\n                    }");
                return string6;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15067d(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    public void initConfig() {
        root(C0966R.C0970id.ksa).view(C0966R.C0970id.ksa).desc((C32226l<? super View, String>) new C15068a(this)).expand(4, 4, 4, 4).disableChildren();
        root(C0966R.C0970id.cz_).view(C0966R.C0970id.cz_).desc((C32226l<? super View, String>) new C15069b(this)).disableChildren();
        root(C0966R.C0970id.g4_).view(C0966R.C0970id.g4h).desc((int) C0966R.string.ehl);
        root(C0966R.C0970id.ctc).view(C0966R.C0970id.ctc).desc((int) C0966R.C0970id.hg4);
        root(C0966R.C0970id.f358062d83).view(C0966R.C0970id.f358062d83).desc((C32226l<? super View, String>) new C15070c(this));
    }
}
