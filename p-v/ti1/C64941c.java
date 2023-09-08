package ti1;

import al1.C54130j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.Guideline;
import bl3.C39818r;
import c60.C54667b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.RoundCornerConstraintLayout;
import com.tencent.p014mm.plugin.finder.live.mic.view.PotholingImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import dl1.C58321a;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import java.util.ArrayList;
import k60.C60979d;
import l60.C99344b;
import nh1.C61738h;
import o40.C61926c;
import p192l4.C10462b;
import p996kj.C88155a;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11985o;
import pl1.C11990s0;
import pl1.C11991t;
import pl1.C62345f;
import r60.C101350i;
import rx3.C13598b0;
import t60.C64207e;
import up1.C27696y;
import x60.C102564a;
import zt3.C119157j;

/* renamed from: ti1.c */
public class C64941c extends RelativeLayout {

    /* renamed from: d */
    public final int f186993d;

    /* renamed from: e */
    public final String f186994e;

    /* renamed from: f */
    public final int f186995f;

    /* renamed from: g */
    public C64943e f186996g;

    /* renamed from: h */
    public final C61738h f186997h;

    /* renamed from: i */
    public C54130j f186998i;

    /* renamed from: j */
    public boolean f186999j;

    /* renamed from: n */
    public int f187000n;

    /* renamed from: o */
    public ArrayList<RectF> f187001o;

    /* renamed from: p */
    public C58321a f187002p;

    /* renamed from: ti1.c$a */
    public static final class C64942a<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C64941c f187003a;

        /* renamed from: b */
        public final /* synthetic */ boolean f187004b;

        public C64942a(C64941c cVar, boolean z) {
            this.f187003a = cVar;
            this.f187004b = z;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            C61926c.m72668M(new C64940b((Bitmap) obj, this.f187003a, this.f187004b));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64941c(Context context, int i, String str, int i2) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "coverUrl");
        this.f186993d = i;
        this.f186994e = str;
        this.f186995f = i2;
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.cyi, this, false);
        RoundCornerConstraintLayout roundCornerConstraintLayout = (RoundCornerConstraintLayout) inflate;
        int i3 = C0966R.C0970id.n__;
        Guideline guideline = (Guideline) C10462b.m10395a(inflate, C0966R.C0970id.n__);
        if (guideline != null) {
            i3 = C0966R.C0970id.nb4;
            PotholingImageView potholingImageView = (PotholingImageView) C10462b.m10395a(inflate, C0966R.C0970id.nb4);
            if (potholingImageView != null) {
                i3 = C0966R.C0970id.nb5;
                ImageView imageView = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.nb5);
                if (imageView != null) {
                    i3 = C0966R.C0970id.nb8;
                    ImageView imageView2 = (ImageView) C10462b.m10395a(inflate, C0966R.C0970id.nb8);
                    if (imageView2 != null) {
                        this.f186997h = new C61738h(roundCornerConstraintLayout, roundCornerConstraintLayout, guideline, potholingImageView, imageView, imageView2);
                        this.f187002p = C58321a.NORMAL_4_MODE;
                        addView(roundCornerConstraintLayout);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    private final int getRadius() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        r0 = r0.f169895b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89093a(ti1.C64944f r7) {
        /*
            r6 = this;
            java.lang.String r0 = "params"
            gy3.C87412m.m108594g(r7, r0)
            dl1.a r0 = r7.f187009b
            r6.f187002p = r0
            ti1.e r1 = r7.f187013f
            r6.f186996g = r1
            dl1.a r1 = dl1.C58321a.NORMAL_FOCUS
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 != r1) goto L_0x0030
            gi1.a r0 = r7.f187008a
            if (r0 == 0) goto L_0x0023
            gi1.f r0 = r0.f169895b
            if (r0 == 0) goto L_0x0023
            int r0 = r0.f169903g
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0024
        L_0x0023:
            r0 = r4
        L_0x0024:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r0 = gy3.C87412m.m108589b(r0, r5)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r6.f186999j = r0
            int r0 = r7.f187011d
            r6.f187000n = r0
            java.util.ArrayList<android.graphics.RectF> r0 = r7.f187012e
            r6.f187001o = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "start bindData isAudioMode: "
            r0.append(r5)
            boolean r5 = r7.f187010c
            r0.append(r5)
            java.lang.String r5 = " isNormalFocusMode: "
            r0.append(r5)
            boolean r5 = r6.f186999j
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.mo89096e(r0)
            gi1.a r0 = r7.f187008a
            if (r0 == 0) goto L_0x0062
            al1.j r4 = r0.f169894a
        L_0x0062:
            r6.f186998i = r4
            dl1.a r0 = r6.f187002p
            if (r0 == r1) goto L_0x006a
            r0 = 1
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            java.lang.String r1 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            if (r0 != 0) goto L_0x0087
            nh1.h r0 = r6.f186997h
            android.widget.ImageView r0 = r0.f175455d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            gy3.C87412m.m108592e(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            boolean r4 = r6.f186999j
            if (r4 == 0) goto L_0x0083
            r4 = 1048576000(0x3e800000, float:0.25)
            goto L_0x0085
        L_0x0083:
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0085:
            r0.f44422N = r4
        L_0x0087:
            r6.setCorner(r3)
            int r0 = r6.f186993d
            if (r0 == r2) goto L_0x00b3
            r4 = 2
            if (r0 == r4) goto L_0x009e
            r4 = 3
            if (r0 == r4) goto L_0x0098
            r4 = 4
            if (r0 == r4) goto L_0x0098
            goto L_0x00b6
        L_0x0098:
            boolean r7 = r7.f187010c
            r6.mo89095c(r7)
            goto L_0x00b6
        L_0x009e:
            al1.j r7 = r6.f186998i
            if (r7 == 0) goto L_0x00b6
            nh1.h r7 = r6.f186997h
            android.widget.ImageView r7 = r7.f175455d
            r0 = 8
            r7.setVisibility(r0)
            nh1.h r7 = r6.f186997h
            android.widget.ImageView r7 = r7.f175456e
            r7.setVisibility(r0)
            goto L_0x00b6
        L_0x00b3:
            r6.mo89091d()
        L_0x00b6:
            nh1.h r7 = r6.f186997h
            androidx.constraintlayout.widget.Guideline r7 = r7.f175453b
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            gy3.C87412m.m108592e(r7, r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r7
            boolean r0 = r6.f186999j
            if (r0 == 0) goto L_0x00cd
            int r0 = r6.f186993d
            if (r0 != r2) goto L_0x00cd
            int r3 = r6.f187000n
        L_0x00cd:
            r7.f44437b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ti1.C64941c.mo89093a(ti1.f):void");
    }

    /* renamed from: b */
    public final void mo89094b(boolean z) {
        C13598b0 b0Var;
        if (z) {
            ArrayList<RectF> arrayList = this.f187001o;
            if (arrayList != null) {
                this.f186997h.f175454c.mo77599q((float) getRadius(), arrayList);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                this.f186997h.f175454c.mo77598p();
                return;
            }
            return;
        }
        this.f186997h.f175454c.mo77598p();
    }

    /* renamed from: c */
    public final void mo89095c(boolean z) {
        this.f186997h.f175455d.setVisibility(8);
        this.f186997h.f175456e.setVisibility(8);
        Log.m105924i("MicCommonFocusWidget", "fillAnchorContent: " + z + " coverUrl: " + this.f186994e + " drawable: " + this.f186997h.f175454c.getDrawable() + " micType: " + this.f186993d);
        if (z) {
            boolean z2 = false;
            this.f186997h.f175454c.setVisibility(0);
            if (this.f186997h.f175454c.getDrawable() == null || this.f186997h.f175454c.getVisibility() == 8) {
                Log.m105924i("MicCommonFocusWidget", "fillAnchorContent load anchorBitmap");
                String str = this.f186994e;
                if (str == null || str.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    C60979d<C100810g0> f2 = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2();
                    String str2 = this.f186994e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C99344b<C100810g0, Bitmap> a = f2.mo85955a(new C11991t(str2));
                    C64942a aVar = new C64942a(this, z);
                    a.getClass();
                    a.f291320d = aVar;
                    a.mo85951a();
                    return;
                }
                return;
            }
            return;
        }
        C64943e eVar = this.f186996g;
        if (eVar != null && eVar.f187007c >= eVar.f187005a) {
            eVar.f187006b.invoke();
        }
        this.f186997h.f175454c.setVisibility(4);
    }

    /* renamed from: d */
    public void mo89091d() {
        C54130j jVar = this.f186998i;
        if (jVar != null) {
            boolean z = true;
            if (this.f187002p != C58321a.NORMAL_FOCUS) {
                this.f186997h.f175455d.setVisibility(8);
                ImageView imageView = this.f186997h.f175456e;
                C87412m.m108593f(imageView, "viewBinding.micNormalHead");
                mo89098g(jVar, imageView);
            } else {
                this.f186997h.f175456e.setVisibility(8);
                ImageView imageView2 = this.f186997h.f175455d;
                C87412m.m108593f(imageView2, "viewBinding.micFocusHead");
                mo89098g(jVar, imageView2);
            }
            PotholingImageView potholingImageView = this.f186997h.f175454c;
            C87412m.m108593f(potholingImageView, "viewBinding.micBg");
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            String str = jVar.f151998b;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            if (z) {
                Bitmap decodeResource = C88155a.decodeResource(getContext().getResources(), C0966R.raw.default_avatar, (BitmapFactory.Options) null);
                int color = getContext().getResources().getColor(C0966R.color.UN_BW_0_Alpha_0_4);
                ((C119157j) C119157j.f356862d).mo183875f(new C54667b(decodeResource, new C13928d(potholingImageView), 20.0f, color));
            } else {
                C39818r rVar = C39818r.f106831a;
                ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11873j2().mo85957c(new C11985o(jVar.f151998b, C27696y.THUMB_IMAGE), potholingImageView, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            }
            mo89094b(this.f186999j);
        }
    }

    /* renamed from: e */
    public final void mo89096e(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("LiveMicMiniFocusWidget_");
        sb.append(this.f186993d);
        sb.append('_');
        C54130j jVar = this.f186998i;
        sb.append(jVar != null ? jVar.f151997a : null);
        Log.m105924i(sb.toString(), str);
    }

    /* renamed from: f */
    public final void mo89097f(boolean z) {
        int i = this.f186993d;
        if (i == 3 || i == 4) {
            mo89096e("onAnchorAudioChange: " + z);
            mo89095c(z);
        }
    }

    /* renamed from: g */
    public final void mo89098g(C54130j jVar, ImageView imageView) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        imageView.setVisibility(0);
        if (C72996z1.m85817T4(jVar.f151999c)) {
            ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11872i2().mo85957c(new C62345f(jVar.f151998b, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.AVATAR));
            return;
        }
        ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11865K1().mo85957c(new C62345f(jVar.f151998b, (C27696y) null, 2, (C8480h) null), imageView, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.WX_AVATAR));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f151997a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getBindSdkUserId() {
        /*
            r1 = this;
            al1.j r0 = r1.f186998i
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.f151997a
            if (r0 != 0) goto L_0x000a
        L_0x0008:
            java.lang.String r0 = ""
        L_0x000a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ti1.C64941c.getBindSdkUserId():java.lang.String");
    }

    public final String getCoverUrl() {
        return this.f186994e;
    }

    public final int getMicType() {
        return this.f186993d;
    }

    public final C58321a getMicWidgetMode() {
        return this.f187002p;
    }

    public final ArrayList<RectF> getPotholingRectList() {
        return this.f187001o;
    }

    public final int getRightOffestSize() {
        return this.f187000n;
    }

    public final int getScene() {
        return this.f186995f;
    }

    public final C61738h getViewBinding() {
        return this.f186997h;
    }

    public final void setCorner(int i) {
        this.f186997h.f175452a.setRadius((float) i);
    }

    public final void setMicWidgetMode(C58321a aVar) {
        C87412m.m108594g(aVar, "<set-?>");
        this.f187002p = aVar;
    }

    public final void setNormalFocusMode(boolean z) {
        this.f186999j = z;
    }

    public final void setPotholingRectList(ArrayList<RectF> arrayList) {
        this.f187001o = arrayList;
    }

    public final void setRightOffestSize(int i) {
        this.f187000n = i;
    }
}
