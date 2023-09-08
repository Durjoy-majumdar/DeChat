package xz2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bl3.C39818r;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import go3.C59600d;
import gy3.C87412m;
import ht1.C60200t1;
import k60.C60979d;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import qy2.C36206l;
import qy2.C77455o;
import up1.C27696y;
import uz2.C52689i1;
import uz2.C65488a0;
import uz2.C65490m;
import z04.C112551y;

/* renamed from: xz2.i */
public final class C66462i implements C36206l {

    /* renamed from: xz2.i$a */
    public static final class C66463a extends C77455o {

        /* renamed from: d */
        public C52689i1 f191228d;

        public C66463a(String str) {
            super(str);
        }

        /* renamed from: d */
        public boolean mo84142d(Context context, Bundle bundle) {
            Class cls = C60200t1.class;
            C65488a0 a0Var = this.f225886b;
            if (a0Var != null && C87412m.m108589b(a0Var.f188439d, "8")) {
                C52689i1 i1Var = this.f191228d;
                String str = i1Var != null ? i1Var.f147139d : null;
                if (!(str == null || C112551y.m153811k(str))) {
                    Intent intent = new Intent();
                    boolean b = C87412m.m108589b(str, C75592q0.m90778h());
                    intent.putExtra("finder_username", str);
                    if (!b) {
                        ((C60200t1) C86312j.m106911c(cls)).mo76842e7(20, 2, 32, intent);
                        if (context != null) {
                            ((C60200t1) C86312j.m106911c(cls)).mo76819V1(context, intent);
                        }
                    } else if (context != null) {
                        ((C60200t1) C86312j.m106911c(cls)).mo76836bn(context, intent, 20, 2);
                    }
                    return true;
                }
            }
            return false;
        }

        /* renamed from: j */
        public boolean mo84146j() {
            return false;
        }

        /* renamed from: m */
        public void mo84147m(String str, C65488a0 a0Var) {
            this.f225886b = a0Var;
            this.f225887c = str;
            if (a0Var != null && C87412m.m108589b(a0Var.f188439d, "8")) {
                byte[] decode = Base64.decode(a0Var.f188442g, 0);
                C52689i1 i1Var = new C52689i1();
                i1Var.parseFrom(decode);
                this.f191228d = i1Var;
            }
        }

        /* renamed from: n */
        public void mo84148n() {
        }

        /* renamed from: p */
        public boolean mo84851p(FrameLayout frameLayout) {
            C87412m.m108594g(frameLayout, "container");
            ImageView imageView = (ImageView) frameLayout.findViewWithTag("FinderTextStatusProfileService");
            if (imageView == null) {
                imageView = new ImageView(frameLayout.getContext());
            }
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            frameLayout.removeAllViews();
            frameLayout.addView(imageView);
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C52689i1 i1Var = this.f191228d;
            String str = null;
            if (i1Var != null) {
                str = i1Var.f147140e;
            }
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> i2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11872i2();
            C7335d c = C86312j.m106911c(C62368t0.class);
            C87412m.m108593f(c, "getService(IFinderLoaderDataService::class.java)");
            C62368t0 t0Var = (C62368t0) c;
            if (str == null) {
                str = "";
            }
            i2.mo85957c(t0Var.Rt0(str, C27696y.MEDIUM_AVATAR_IMAGE), imageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            return true;
        }
    }

    /* renamed from: IT */
    public C59600d mo84138IT(String str, FrameLayout frameLayout, C65488a0 a0Var, C65490m mVar) {
        C87412m.m108594g(frameLayout, "container");
        C87412m.m108594g(mVar, "pullDownParam");
        return null;
    }

    public C77455o l30(String str) {
        return new C66463a(str);
    }

    public void release() {
    }
}
