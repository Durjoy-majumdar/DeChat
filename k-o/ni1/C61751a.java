package ni1;

import al1.C54130j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import c60.C54667b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveInterceptTouchRelativeLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import di3.C7335d;
import di3.C86312j;
import dl1.C58321a;
import fy3.C32226l;
import gi1.C59463a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ok1.C62042e;
import p996kj.C88155a;
import pl1.C11978e0;
import pl1.C11985o;
import pl1.C11990s0;
import pl1.C62345f;
import rx3.C13598b0;
import tf0.C64916p1;
import up1.C27696y;
import wk1.C15432i;
import wk1.C15435j;
import zt3.C119157j;

/* renamed from: ni1.a */
public abstract class C61751a extends FinderLiveInterceptTouchRelativeLayout {

    /* renamed from: e */
    public C58321a f175538e = C58321a.NORMAL_4_MODE;

    /* renamed from: f */
    public C54130j f175539f;

    /* renamed from: g */
    public C59463a f175540g;

    /* renamed from: ni1.a$b */
    public static final class C11168b extends C87413o implements C32226l<C15435j, C13598b0> {

        /* renamed from: d */
        public static final C11168b f32963d = new C11168b();

        public C11168b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C15435j jVar = (C15435j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            C15432i.C15433a.C15434a aVar = jVar.f41876a;
            aVar.f41857a = 0;
            aVar.f41858b = 0;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ni1.a$a */
    public static final class C61752a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImageView f175541d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61752a(ImageView imageView) {
            super(1);
            this.f175541d = imageView;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                this.f175541d.setImageDrawable(new BitmapDrawable(MMApplicationContext.getContext().getResources(), bitmap));
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61751a(Context context) {
        super(context, (AttributeSet) null, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: c */
    public void mo86637c(C58321a aVar, C59463a aVar2) {
        C87412m.m108594g(aVar, "widgetMode");
        C87412m.m108594g(aVar2, "data");
        this.f175538e = aVar;
        this.f175540g = aVar2;
        this.f175539f = aVar2.f169894a;
    }

    /* renamed from: d */
    public final void mo86638d(ImageView imageView) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(imageView, "bgView");
        C54130j jVar = this.f175539f;
        if (jVar != null) {
            String str = jVar.f151998b;
            int i = 0;
            if (str == null || str.length() == 0) {
                Bitmap decodeResource = C88155a.decodeResource(getContext().getResources(), C0966R.raw.default_avatar, (BitmapFactory.Options) null);
                int color = getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_4);
                float f = 0.0f;
                C61752a aVar = new C61752a(imageView);
                if (!true || !true) {
                    i = color;
                }
                if (true && true) {
                    f = 20.0f;
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C54667b(decodeResource, aVar, f, i));
                return;
            }
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11873j2().mo85957c(new C11985o(jVar.f151998b, C27696y.THUMB_IMAGE), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
        }
    }

    /* renamed from: e */
    public final void mo86639e(ImageView imageView) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(imageView, "avatarView");
        C54130j jVar = this.f175539f;
        if (jVar != null) {
            imageView.setVisibility(0);
            if (C72996z1.m85817T4(jVar.f151999c)) {
                ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(jVar.f151998b, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
                return;
            }
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85957c(new C62345f(jVar.f151998b, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: wk1.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86640f(android.widget.TextView r15, wk1.C15484y r16) {
        /*
            r14 = this;
            r9 = r15
            java.lang.String r0 = "userLevel"
            gy3.C87412m.m108594g(r15, r0)
            java.lang.String r0 = "size"
            r5 = r16
            gy3.C87412m.m108594g(r5, r0)
            gy3.f0 r10 = new gy3.f0
            r10.<init>()
            r11 = r14
            al1.j r0 = r11.f175539f
            if (r0 == 0) goto L_0x007d
            te3.hx0 r0 = r0.f152014r
            if (r0 == 0) goto L_0x007d
            java.util.LinkedList<te3.aw0> r0 = r0.f134930r
            if (r0 == 0) goto L_0x007d
            boolean r1 = r0.isEmpty()
            r12 = 1
            r1 = r1 ^ r12
            r13 = 0
            if (r1 == 0) goto L_0x002c
            r2 = r0
            goto L_0x002d
        L_0x002c:
            r2 = r13
        L_0x002d:
            if (r2 == 0) goto L_0x007d
            wk1.n r0 = wk1.C15440n.f41895a
            r3 = 0
            r4 = 0
            ni1.a$b r6 = ni1.C61751a.C11168b.f32963d
            r7 = 12
            r8 = 0
            r1 = r15
            r5 = r16
            java.util.List r0 = wk1.C15440n.m14442r(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r12
            if (r1 == 0) goto L_0x007d
            android.text.SpannableString r1 = new android.text.SpannableString
            java.lang.String r2 = "  "
            r1.<init>(r2)
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r2 = 0
            java.lang.Object r3 = r0.get(r2)
            r4 = 33
            r1.setSpan(r3, r2, r12, r4)
            r10.f27484d = r1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r15.setText(r1)
            android.view.ViewGroup$LayoutParams r1 = r15.getLayoutParams()
            if (r1 == 0) goto L_0x007d
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof wk1.C15432i
            if (r2 == 0) goto L_0x0071
            r13 = r0
            wk1.i r13 = (wk1.C15432i) r13
        L_0x0071:
            if (r13 == 0) goto L_0x007d
            int r0 = r1.width
            if (r0 > 0) goto L_0x007d
            wk1.i$a$a r0 = r13.f41856d
            int r0 = r0.f41875s
            r1.width = r0
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ni1.C61751a.mo86640f(android.widget.TextView, wk1.y):void");
    }

    /* renamed from: g */
    public final void mo86641g(TextView textView) {
        C87412m.m108594g(textView, "nickText");
        C54130j jVar = this.f175539f;
        if (jVar != null) {
            C7335d c = C86312j.m106911c(C64916p1.class);
            C87412m.m108593f(c, "getService(IFinderCommon…atureService::class.java)");
            textView.setText(C64916p1.C64917a.m76442i((C64916p1) c, textView, C62042e.m72808l0(C62042e.f176370a, jVar.f151999c, jVar.f152000d, false, 4, (Object) null), 0, 4, (Object) null));
        }
    }

    public final C54130j getBindLinkMicUser() {
        return this.f175539f;
    }

    public final C59463a getBindMicData() {
        return this.f175540g;
    }

    public final C58321a getCurWidgetMode() {
        return this.f175538e;
    }

    public final void setBindLinkMicUser(C54130j jVar) {
        this.f175539f = jVar;
    }

    public final void setBindMicData(C59463a aVar) {
        this.f175540g = aVar;
    }

    public final void setCurWidgetMode(C58321a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f175538e = aVar;
    }
}
