package yz2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import az2.C39674e;
import b03.C39693c0;
import b03.C39721r;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusOtherTopicFriendsActivity;
import com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import eb0.C31543z5;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import jz2.C76452b;
import jz2.C76474e;
import jz2.C76485k;
import kg3.C76577a;
import lz2.C76738b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import qo3.C77407n;
import qo3.C89779i0;
import qy2.C47894a0;
import qy2.C47896n;
import qy2.C77446d0;
import qy2.C77448f0;
import qy2.C77453j;
import qy2.C77459z;
import rx3.C13598b0;
import rz2.C48201c;
import rz2.C48206h;
import su0.C13781a;
import vz2.C78501d;
import z04.C112551y;
import zz2.C53848a;

/* renamed from: yz2.k */
public class C79239k implements C77453j, View.OnClickListener, C11385n {

    /* renamed from: A */
    public TextView f232614A;

    /* renamed from: B */
    public TextView f232615B;

    /* renamed from: C */
    public View f232616C;

    /* renamed from: D */
    public ImageView f232617D;

    /* renamed from: E */
    public ImageView f232618E;

    /* renamed from: F */
    public LinearLayout f232619F;

    /* renamed from: G */
    public TextView f232620G;

    /* renamed from: H */
    public LinearLayout f232621H;

    /* renamed from: I */
    public C76485k f232622I;

    /* renamed from: J */
    public String f232623J;

    /* renamed from: K */
    public boolean f232624K;

    /* renamed from: L */
    public C79242c f232625L;

    /* renamed from: M */
    public String f232626M;

    /* renamed from: N */
    public String f232627N;

    /* renamed from: P */
    public String f232628P;

    /* renamed from: Q */
    public String f232629Q;

    /* renamed from: R */
    public String f232630R;

    /* renamed from: S */
    public String f232631S;

    /* renamed from: T */
    public long f232632T;

    /* renamed from: U */
    public final C47896n.C47897a f232633U;

    /* renamed from: V */
    public C77448f0.C77450b f232634V;

    /* renamed from: W */
    public final Rect f232635W;

    /* renamed from: X */
    public C47896n.C47897a f232636X;

    /* renamed from: Y */
    public long f232637Y;

    /* renamed from: Z */
    public long f232638Z;

    /* renamed from: d */
    public final RelativeLayout f232639d;

    /* renamed from: e */
    public final LinearLayout f232640e;

    /* renamed from: f */
    public final View f232641f;

    /* renamed from: g */
    public C89779i0 f232642g;

    /* renamed from: h */
    public TextView f232643h;

    /* renamed from: i */
    public Context f232644i;

    /* renamed from: j */
    public String f232645j;

    /* renamed from: n */
    public TextView f232646n;

    /* renamed from: o */
    public ImageView f232647o;

    /* renamed from: p */
    public RelativeLayout f232648p;

    /* renamed from: q */
    public TextView f232649q;

    /* renamed from: r */
    public View f232650r;

    /* renamed from: s */
    public TextView f232651s;

    /* renamed from: t */
    public View f232652t;

    /* renamed from: u */
    public WeImageView f232653u;

    /* renamed from: v */
    public ImageView f232654v;

    /* renamed from: w */
    public C48201c f232655w;

    /* renamed from: x */
    public ImageView f232656x;

    /* renamed from: y */
    public ImageView f232657y;

    /* renamed from: z */
    public View f232658z;

    /* renamed from: yz2.k$d */
    public static final class C53689d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79239k f150775d;

        public C53689d(C79239k kVar) {
            this.f150775d = kVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$addStatusListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C77448f0.m93394f()) {
                C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN, false);
            }
            ImageView imageView = this.f150775d.f232654v;
            if (imageView != null && imageView.getVisibility() == 0) {
                String str = this.f150775d.f232623J;
                if (str != null) {
                    C78501d.m94805g(C78501d.f229945a, 32, str, (String) null, 0, (String) null, 0, 60, (Object) null);
                    IStatusIconHelperKt.m39109a().mo62287Q(str);
                }
                IStatusIconHelperKt.m39109a().mo62286P(C31543z5.m39451a() / ((long) 1000));
            } else {
                C78501d.m94805g(C78501d.f229945a, 32, "", (String) null, 0, (String) null, 0, 60, (Object) null);
            }
            C79239k.m95936w(this.f150775d, 0, 1, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$addStatusListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yz2.k$a */
    public static final class C79240a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C79239k f232659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79240a(C79239k kVar) {
            super(0);
            this.f232659d = kVar;
        }

        public Object invoke() {
            this.f232659d.mo109250t();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: yz2.k$b */
    public static final class C79241b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79239k f232660d;

        /* renamed from: e */
        public final /* synthetic */ Context f232661e;

        public C79241b(C79239k kVar, Context context) {
            this.f232660d = kVar;
            this.f232661e = context;
        }

        public final void onClick(View view) {
            int i;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77448f0.C77450b bVar = this.f232660d.f232634V;
            SimpleDateFormat simpleDateFormat = C77448f0.f225876a;
            int i2 = 1;
            if (!(bVar == null || (i = bVar.f225883a) == 0)) {
                String c = C77448f0.m93391c(String.valueOf(i), bVar.f225884b);
                Log.m105919d("MicroMsg.TextStatus.TextStatusSwitch", "setFriendsStatusBtnClick:%s", c);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_TEXT_STATUS_FRIENDS_BUTTON_STYLE_CLICK_TAG_STRING, c);
            }
            TextStatusOtherTopicFriendsActivity.C30508a.m39108a(TextStatusOtherTopicFriendsActivity.f116976t, this.f232661e, (String) null, 1, 0, 10, (Object) null);
            C78501d dVar = C78501d.f229945a;
            C48206h t0 = C39674e.f106452d.mo62255t0();
            String[] strArr = C48206h.f129188f;
            String valueOf = String.valueOf(t0.mo72965TE((String) null));
            int i3 = this.f232660d.f232634V.f225883a;
            if (i3 == 1) {
                i2 = 2;
            } else if (i3 == 2) {
                i2 = 3;
            }
            C78501d.m94805g(dVar, 21, valueOf, (String) null, (long) i2, (String) null, 0, 52, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yz2.k$c */
    public enum C79242c {
        ADD,
        NORMAL
    }

    /* renamed from: yz2.k$e */
    public static final class C79243e implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ C79239k f232665d;

        public C79243e(C79239k kVar) {
            this.f232665d = kVar;
        }

        public final void onCreateMMMenu(C76874e0 e0Var) {
            e0Var.mo107142f(C0966R.C0970id.gsm, this.f232665d.f232644i.getString(C0966R.string.k1r));
            e0Var.mo107142f(C0966R.C0970id.gsb, this.f232665d.f232644i.getString(C0966R.string.k15));
            C48201c cVar = this.f232665d.f232655w;
            int e = (cVar != null ? cVar.field_ExpireTime : 0) - C31543z5.m39455e();
            int i = e < 0 ? 0 : e / 3600;
            String string = i >= 1 ? this.f232665d.f232644i.getString(C0966R.string.k0c, new Object[]{Integer.valueOf(i)}) : this.f232665d.f232644i.getString(C0966R.string.k0a);
            C87412m.m108593f(string, "if(expireTimeLeftInHour …r_tips)\n                }");
            e0Var.mo107154n(C0966R.C0970id.gs4, this.f232665d.f232644i.getString(C0966R.string.k0b), string, 0);
        }
    }

    /* renamed from: yz2.k$f */
    public static final class C79244f implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C79239k f232666d;

        public C79244f(C79239k kVar) {
            this.f232666d = kVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0105, code lost:
            r1 = r0.f232666d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMMMenuItemSelected(android.view.MenuItem r25, int r26) {
            /*
                r24 = this;
                r0 = r24
                int r1 = r25.getItemId()
                r2 = 2131309159(0x7f093267, float:1.8236594E38)
                if (r1 != r2) goto L_0x0021
                yz2.k r1 = r0.f232666d
                r1.getClass()
                java.lang.Class<yy.k> r2 = p773yy.C79168k.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                yy.k r2 = (p773yy.C79168k) r2
                android.content.Context r3 = r1.f232644i
                java.lang.String r1 = r1.f232645j
                r2.mo74107By(r3, r1)
                goto L_0x013e
            L_0x0021:
                r2 = 2131309143(0x7f093257, float:1.8236561E38)
                r3 = 1
                r4 = 0
                if (r1 != r2) goto L_0x0077
                yz2.k r1 = r0.f232666d
                rz2.c r2 = r1.f232655w
                if (r2 != 0) goto L_0x002f
                goto L_0x005a
            L_0x002f:
                qy2.z r2 = new qy2.z
                r2.<init>()
                qy2.z r2 = new qy2.z
                r2.<init>()
                java.lang.String r5 = r1.f232626M
                r2.f229403h = r5
                r5 = 6
                r2.f229404i = r5
                r2.f229411s = r3
                java.lang.String r3 = su0.C13781a.m13082a()
                r2.f229412t = r3
                b03.c r3 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
                boolean r3 = r3.mo62276F()
                r2.f229418z = r3
                qy2.d0 r3 = qy2.C77446d0.f225875a
                android.content.Context r1 = r1.f232644i
                r3.mo107615b(r1, r2, r4)
            L_0x005a:
                vz2.d r5 = vz2.C78501d.f229945a
                yz2.k r1 = r0.f232666d
                android.content.Context r6 = r1.f232644i
                r7 = 35
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = 0
                r15 = 0
                r17 = 0
                r19 = 0
                r20 = 508(0x1fc, float:7.12E-43)
                r21 = 0
                vz2.C78501d.m94806h(r5, r6, r7, r9, r10, r11, r13, r15, r17, r19, r20, r21)
                goto L_0x013e
            L_0x0077:
                r2 = 2131309155(0x7f093263, float:1.8236586E38)
                if (r1 != r2) goto L_0x009f
                yz2.k r1 = r0.f232666d
                r2 = 0
                yz2.C79239k.m95936w(r1, r2, r3, r4)
                vz2.d r5 = vz2.C78501d.f229945a
                yz2.k r1 = r0.f232666d
                android.content.Context r6 = r1.f232644i
                r7 = 32
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = 0
                r15 = 0
                r17 = 0
                r19 = 0
                r20 = 508(0x1fc, float:7.12E-43)
                r21 = 0
                vz2.C78501d.m94806h(r5, r6, r7, r9, r10, r11, r13, r15, r17, r19, r20, r21)
                goto L_0x013e
            L_0x009f:
                r2 = 2131309135(0x7f09324f, float:1.8236545E38)
                r4 = 5967(0x174f, float:8.362E-42)
                java.lang.String r5 = "this.field_StatusID"
                r6 = 2131837867(0x7f1143ab, float:1.9308941E38)
                if (r1 != r2) goto L_0x0100
                yz2.k r1 = r0.f232666d
                rz2.c r2 = r1.f232655w
                if (r2 == 0) goto L_0x00e4
                android.content.Context r7 = r1.f232644i
                java.lang.String r8 = r7.getString(r6)
                android.content.Context r9 = r1.f232644i
                java.lang.String r9 = r9.getString(r6)
                r10 = 0
                r11 = 0
                r12 = 0
                qo3.i0 r6 = nj3.C76879j.m92723Q(r7, r8, r9, r10, r11, r12)
                r1.f232642g = r6
                lz2.a r6 = new lz2.a
                java.lang.String r2 = r2.field_StatusID
                gy3.C87412m.m108593f(r2, r5)
                r6.<init>(r2, r3)
                ob0.b0 r2 = f40.C86709a0.m107524d()
                jz2.m r3 = new jz2.m
                r3.<init>(r1)
                r2.mo123455a(r4, r3)
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r1.mo123460f(r6)
            L_0x00e4:
                vz2.d r7 = vz2.C78501d.f229945a
                yz2.k r1 = r0.f232666d
                android.content.Context r8 = r1.f232644i
                r9 = 33
                r11 = 0
                r12 = 0
                r13 = 0
                r15 = 0
                r17 = 0
                r19 = 0
                r21 = 0
                r22 = 508(0x1fc, float:7.12E-43)
                r23 = 0
                vz2.C78501d.m94806h(r7, r8, r9, r11, r12, r13, r15, r17, r19, r21, r22, r23)
                goto L_0x013e
            L_0x0100:
                r2 = 2131309130(0x7f09324a, float:1.8236535E38)
                if (r1 != r2) goto L_0x013e
                yz2.k r1 = r0.f232666d
                rz2.c r2 = r1.f232655w
                if (r2 == 0) goto L_0x013e
                android.content.Context r7 = r1.f232644i
                java.lang.String r8 = r7.getString(r6)
                android.content.Context r3 = r1.f232644i
                java.lang.String r9 = r3.getString(r6)
                r10 = 0
                r11 = 0
                r12 = 0
                qo3.i0 r3 = nj3.C76879j.m92723Q(r7, r8, r9, r10, r11, r12)
                r1.f232642g = r3
                lz2.a r3 = new lz2.a
                java.lang.String r2 = r2.field_StatusID
                gy3.C87412m.m108593f(r2, r5)
                r5 = 2
                r3.<init>(r2, r5)
                ob0.b0 r2 = f40.C86709a0.m107524d()
                jz2.m r5 = new jz2.m
                r5.<init>(r1)
                r2.mo123455a(r4, r5)
                ob0.b0 r1 = f40.C86709a0.m107524d()
                r1.mo123460f(r3)
            L_0x013e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yz2.C79239k.C79244f.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: yz2.k$g */
    public static final class C79245g implements C77407n.C12924o {

        /* renamed from: a */
        public final /* synthetic */ C79239k f232667a;

        public C79245g(C79239k kVar) {
            this.f232667a = kVar;
        }

        /* renamed from: a */
        public final void mo2362a() {
            C78501d.m94806h(C78501d.f229945a, this.f232667a.f232644i, 34, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
        }
    }

    /* renamed from: yz2.k$h */
    public static final class C79246h implements C47896n.C47897a {

        /* renamed from: a */
        public final /* synthetic */ C79239k f232668a;

        public C79246h(C79239k kVar) {
            this.f232668a = kVar;
        }

        /* renamed from: a */
        public void mo67431a(int i, Object obj) {
            if (i == 3) {
                C79239k kVar = this.f232668a;
                C78501d.m94805g(C78501d.f229945a, 43, kVar.f232630R, kVar.f232631S, kVar.f232632T, (String) null, 0, 48, (Object) null);
            }
        }
    }

    public C79239k(Context context, RelativeLayout relativeLayout, LinearLayout linearLayout, int i) {
        C87412m.m108594g(context, "context");
        this.f232639d = relativeLayout;
        this.f232640e = linearLayout;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c9f, (ViewGroup) null, false);
        C87412m.m108593f(inflate, "from(context).inflate(getLayoutId(), null, false)");
        this.f232641f = inflate;
        this.f232644i = context;
        new HashMap();
        C47894a0 a0Var = new C47894a0();
        a0Var.f128516d |= 4;
        a0Var.mo72637c(true);
        a0Var.f128520h = false;
        a0Var.f128521i = true;
        C76452b bVar = new C76452b(a0Var);
        this.f232622I = bVar;
        bVar.mo106674h(inflate);
        ((C76474e) this.f232622I).f223870W = new C79240a(this);
        this.f232643h = (TextView) inflate.findViewById(C0966R.C0970id.kyg);
        this.f232646n = (TextView) inflate.findViewById(C0966R.C0970id.kxy);
        LongTextView longTextView = (LongTextView) inflate.findViewById(C0966R.C0970id.f359429kw2);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.kxe);
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.alu);
        View findViewById = inflate.findViewById(C0966R.C0970id.alw);
        C87412m.m108593f(findViewById, "cardView.findViewById(R.id.btn_like)");
        ImageView imageView2 = (ImageView) findViewById;
        ImageView imageView3 = (ImageView) inflate.findViewById(C0966R.C0970id.f2o);
        this.f232649q = (TextView) inflate.findViewById(C0966R.C0970id.ky8);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f1g);
        C87412m.m108593f(findViewById2, "cardView.findViewById(R.id.icon_avatar_notify)");
        this.f232656x = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.f359430kw3);
        C87412m.m108593f(findViewById3, "cardView.findViewById(R.id.tv_desc_notify)");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.fkw);
        C87412m.m108593f(findViewById4, "cardView.findViewById(R.id.layout_notify)");
        LinearLayout linearLayout2 = (LinearLayout) findViewById4;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.f1h);
        C87412m.m108593f(findViewById5, "cardView.findViewById(R.…_avatar_notify_no_status)");
        this.f232657y = (ImageView) findViewById5;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.kw4);
        C87412m.m108593f(findViewById6, "cardView.findViewById(R.…tv_desc_notify_no_status)");
        ((TextView) findViewById6).setTextSize(0, (float) C76577a.m92155f(context, C0966R.dimen.f3684bd));
        View findViewById7 = inflate.findViewById(C0966R.C0970id.fkx);
        C87412m.m108593f(findViewById7, "cardView.findViewById(R.….layout_notify_no_status)");
        LinearLayout linearLayout3 = (LinearLayout) findViewById7;
        this.f232658z = inflate.findViewById(C0966R.C0970id.f358524m62);
        this.f232614A = (TextView) inflate.findViewById(C0966R.C0970id.mkc);
        View findViewById8 = inflate.findViewById(C0966R.C0970id.f359441kx1);
        C87412m.m108593f(findViewById8, "cardView.findViewById(R.id.tv_like_num)");
        TextView textView3 = (TextView) findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.kx9);
        C87412m.m108593f(findViewById9, "cardView.findViewById(R.id.tv_new_invisible)");
        this.f232615B = (TextView) findViewById9;
        this.f232647o = (ImageView) inflate.findViewById(C0966R.C0970id.l2t);
        this.f232648p = (RelativeLayout) inflate.findViewById(C0966R.C0970id.fkc);
        View findViewById10 = inflate.findViewById(C0966R.C0970id.fkv);
        C87412m.m108593f(findViewById10, "cardView.findViewById(R.id.layout_no_status)");
        this.f232650r = findViewById10;
        View findViewById11 = inflate.findViewById(C0966R.C0970id.kvd);
        C87412m.m108593f(findViewById11, "cardView.findViewById(R.id.tv_add_status)");
        TextView textView4 = (TextView) findViewById11;
        this.f232651s = textView4;
        textView4.setTextSize(0, (float) C76577a.m92155f(context, C0966R.dimen.f3684bd));
        this.f232652t = inflate.findViewById(C0966R.C0970id.fjy);
        this.f232653u = (WeImageView) inflate.findViewById(C0966R.C0970id.m2f);
        this.f232654v = (ImageView) inflate.findViewById(C0966R.C0970id.m2j);
        mo109253z();
        this.f232617D = (ImageView) inflate.findViewById(C0966R.C0970id.fdp);
        this.f232618E = (ImageView) inflate.findViewById(C0966R.C0970id.fdq);
        this.f232619F = (LinearLayout) inflate.findViewById(C0966R.C0970id.fl4);
        this.f232621H = (LinearLayout) inflate.findViewById(C0966R.C0970id.fld);
        int color = context.getResources().getColor(C0966R.color.FG_1);
        Drawable drawable = context.getResources().getDrawable(C0966R.raw.icons_filled_more);
        C74933u4.m89769f(drawable, color);
        drawable.setAlpha(Color.alpha(color));
        ImageView imageView4 = this.f232617D;
        if (imageView4 != null) {
            imageView4.setImageDrawable(drawable);
        }
        TextView textView5 = (TextView) inflate.findViewById(C0966R.C0970id.kyq);
        this.f232620G = textView5;
        if (textView5 != null) {
            textView5.setTextSize(0, (float) C76577a.m92155f(context, C0966R.dimen.f3684bd));
        }
        View findViewById12 = inflate.findViewById(C0966R.C0970id.m2q);
        C87412m.m108593f(findViewById12, "cardView.findViewById(R.id.layout_des_content)");
        this.f232616C = findViewById12;
        ImageView imageView5 = this.f232656x;
        float a = (float) C76577a.m92150a(context, 10.0f);
        if (imageView5 != null) {
            imageView5.setOutlineProvider(new C39693c0(true, true, a));
        }
        if (imageView5 != null) {
            imageView5.setClipToOutline(true);
        }
        ImageView imageView6 = this.f232657y;
        float a2 = (float) C76577a.m92150a(context, 10.0f);
        if (imageView6 != null) {
            imageView6.setOutlineProvider(new C39693c0(true, true, a2));
        }
        if (imageView6 != null) {
            imageView6.setClipToOutline(true);
        }
        inflate.setOnClickListener(this);
        C53689d dVar = new C53689d(this);
        View view = this.f232652t;
        if (view != null) {
            C39721r.m42515a(view, 0, dVar, (C32224a) null, 5, (Object) null);
        }
        LinearLayout linearLayout4 = this.f232621H;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new C79241b(this, context));
        }
        C53848a aVar = (C53848a) C39818r.f106831a.mo62443b(context).mo62449e(C53848a.class);
        if (aVar != null) {
            aVar.f151088e = new WeakReference<>(this);
        }
        this.f232625L = C79242c.ADD;
        this.f232626M = "";
        this.f232627N = "";
        this.f232628P = "";
        this.f232629Q = "";
        this.f232630R = "";
        this.f232631S = "";
        this.f232632T = 12;
        this.f232633U = new C79246h(this);
        this.f232634V = new C77448f0.C77450b();
        this.f232635W = new Rect();
    }

    /* renamed from: w */
    public static void m95936w(C79239k kVar, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                i = -1;
            }
            kVar.getClass();
            Bundle bundle = new Bundle();
            if (i != -1) {
                bundle.putInt("KEY_DEFAULT_BACKGROUND_ID", i);
            }
            C77459z zVar = new C77459z();
            zVar.f229403h = kVar.f232626M;
            zVar.f229404i = kVar.f232655w == null ? 3 : 4;
            zVar.f229418z = IStatusIconHelperKt.m39109a().mo62276F();
            C77446d0.f225875a.mo107615b(kVar.f232644i, zVar, (ResultReceiver) null);
            C78501d.m94805g(C78501d.f229945a, 16, (String) null, (String) null, 0, (String) null, 0, 62, (Object) null);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpToPickAndEdit");
    }

    /* renamed from: c */
    public void mo72647c() {
        mo109251x();
        RelativeLayout relativeLayout = this.f232639d;
        if (relativeLayout != null) {
            relativeLayout.removeView(this.f232641f);
        }
        RelativeLayout relativeLayout2 = this.f232639d;
        ViewGroup.LayoutParams layoutParams = relativeLayout2 != null ? relativeLayout2.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        LinearLayout linearLayout = this.f232640e;
        if (linearLayout != null) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), C76577a.m92151b(this.f232644i, 40));
        }
    }

    /* renamed from: e */
    public void mo96596e() {
        this.f232622I.getClass();
    }

    /* renamed from: f */
    public void mo72640f(C47896n.C47897a aVar) {
        this.f232636X = aVar;
    }

    public View getView() {
        return this.f232641f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0929, code lost:
        if ((r3 == null || z04.C112551y.m153811k(r3)) != false) goto L_0x09e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x075d A[EDGE_INSN: B:424:0x075d->B:293:0x075d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x026a  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo72650h(java.lang.String r40) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            android.view.View r2 = r0.f232641f
            int r2 = r2.getWidth()
            r3 = 1
            if (r2 <= 0) goto L_0x0016
            android.view.View r2 = r0.f232641f
            android.graphics.Rect r4 = r0.f232635W
            boolean r2 = r2.getGlobalVisibleRect(r4)
            goto L_0x0017
        L_0x0016:
            r2 = 1
        L_0x0017:
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r6] = r1
            android.view.View r8 = r0.f232641f
            int r8 = r8.getWidth()
            if (r8 <= 0) goto L_0x0032
            android.view.View r8 = r0.f232641f
            android.graphics.Rect r9 = r0.f232635W
            boolean r8 = r8.getGlobalVisibleRect(r9)
            goto L_0x0033
        L_0x0032:
            r8 = 1
        L_0x0033:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r5[r3] = r8
            com.tencent.mm.sdk.platformtools.MMStack r8 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r9 = 2
            r5[r9] = r8
            java.lang.String r8 = "MicroMsg.TextStatus.MoreTabCardView"
            java.lang.String r10 = "[update] username:%s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r10, r5)
            if (r1 == 0) goto L_0x0052
            boolean r5 = z04.C112551y.m153811k(r40)
            if (r5 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r5 = 0
            goto L_0x0053
        L_0x0052:
            r5 = 1
        L_0x0053:
            if (r5 != 0) goto L_0x0aa4
            if (r2 != 0) goto L_0x0059
            goto L_0x0aa4
        L_0x0059:
            lz2.m$k r2 = new lz2.m$k
            r2.<init>(r1, r0)
            yz2.k$c r2 = yz2.C79239k.C79242c.NORMAL
            yz2.k$c r5 = yz2.C79239k.C79242c.ADD
            java.lang.Class<mm.h> r10 = p606mm.C99933h.class
            java.lang.Class<uz2.f0> r11 = uz2.C78315f0.class
            java.lang.Class<ox.b> r12 = p640ox.C77049b.class
            r0.f232645j = r1
            lz2.m$k r13 = new lz2.m$k
            r13.<init>(r1, r0)
            az2.e r13 = az2.C39674e.f106452d
            rz2.c r14 = r13.mo62253n0(r1)
            r0.f232655w = r14
            di3.d r14 = di3.C86312j.m106911c(r12)
            ox.b r14 = (p640ox.C77049b) r14
            android.content.Context r15 = r0.f232644i
            r4 = 9
            pe3.a r14 = r14.Wi0(r15, r4, r11)
            uz2.f0 r14 = (uz2.C78315f0) r14
            java.lang.String r15 = "TextStatusCardExposed"
            java.lang.String r9 = "it.sessionId"
            java.lang.String r3 = ""
            if (r14 == 0) goto L_0x00c9
            rz2.c r6 = r0.f232655w
            if (r6 == 0) goto L_0x0096
            java.lang.String r6 = r6.field_StatusID
            goto L_0x0097
        L_0x0096:
            r6 = 0
        L_0x0097:
            if (r6 != 0) goto L_0x009a
            r6 = r3
        L_0x009a:
            java.lang.String r4 = r0.f232628P
            boolean r4 = android.text.TextUtils.equals(r6, r4)
            if (r4 != 0) goto L_0x00b0
            java.lang.Class<qy2.x> r4 = qy2.C47904x.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            qy2.x r4 = (qy2.C47904x) r4
            java.lang.String r4 = r4.j10()
            r14.f229428d = r4
        L_0x00b0:
            java.lang.String r4 = r14.f229428d
            gy3.C87412m.m108593f(r4, r9)
            r0.f232626M = r4
            r14.f229429e = r1
            r4 = 5
            r14.f229434j = r4
            di3.d r4 = di3.C86312j.m106911c(r10)     // Catch:{ all -> 0x00c8 }
            mm.h r4 = (p606mm.C99933h) r4     // Catch:{ all -> 0x00c8 }
            r6 = 9
            r4.mo84407yo(r6, r15, r14)     // Catch:{ all -> 0x00c8 }
            goto L_0x00c9
        L_0x00c8:
        L_0x00c9:
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_HISTORY_HAS_REGISTER_REDPOINT_BOOLEAN
            r14 = 0
            boolean r4 = r4.mo119686g(r6, r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r19 = r15
            java.lang.String r15 = "[checkFirstPostEnd] hasRegister:"
            r14.append(r15)
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r14)
            if (r4 == 0) goto L_0x00f6
            r21 = r9
            r20 = r10
            goto L_0x0170
        L_0x00f6:
            rz2.c r4 = r0.f232655w
            if (r4 == 0) goto L_0x00fd
            java.lang.String r4 = r4.field_StatusID
            goto L_0x00fe
        L_0x00fd:
            r4 = 0
        L_0x00fe:
            if (r4 != 0) goto L_0x0101
            r4 = r3
        L_0x0101:
            f40.o r14 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r14 = r14.mo121142i()
            com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_FIRST_TIME_STATUS_ID_STRING
            java.lang.String r14 = r14.mo119675I(r15, r3)
            r20 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r21 = r9
            java.lang.String r9 = "[checkFirstPostEnd] curStatusId:"
            r10.append(r9)
            r10.append(r4)
            java.lang.String r9 = " firstPosStatusId:"
            r10.append(r9)
            r10.append(r14)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r9)
            if (r14 == 0) goto L_0x013a
            boolean r9 = z04.C112551y.m153811k(r14)
            if (r9 == 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r9 = 0
            goto L_0x013b
        L_0x013a:
            r9 = 1
        L_0x013b:
            if (r9 == 0) goto L_0x014f
            boolean r6 = z04.C112551y.m153811k(r4)
            if (r6 != 0) goto L_0x0170
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r6.mo119677K(r15, r4)
            goto L_0x0170
        L_0x014f:
            boolean r4 = android.text.TextUtils.equals(r14, r4)
            if (r4 != 0) goto L_0x0170
            java.lang.String r4 = "[checkFirstPostEnd] registerLocalNewTips"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r4)
            com.tencent.mm.plugin.newtips.model.l r4 = gc2.C116945b.yx0()
            java.lang.String r9 = "100001001_1"
            r4.mo175768i(r9)
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r4.mo119677K(r6, r9)
        L_0x0170:
            jz2.k r4 = r0.f232622I
            jz2.e r4 = (jz2.C76474e) r4
            r4.getClass()
            az2.e r6 = az2.C39674e.f106452d
            rz2.c r6 = r6.mo62253n0(r1)
            uz2.j0 r9 = new uz2.j0
            r9.<init>()
            boolean r4 = r4.mo106661a(r1, r6, r9)
            android.content.Context r6 = r0.f232644i
            boolean r6 = qy2.C63347a.m74685c(r6)
            r9 = 1
            r6 = r6 ^ r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "beforeFixLayout res:"
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = " isLanscape:"
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            if (r4 == 0) goto L_0x01b0
            if (r6 != 0) goto L_0x01b0
            r9 = 1
            goto L_0x01b1
        L_0x01b0:
            r9 = 0
        L_0x01b1:
            r10 = 16
            if (r9 != 0) goto L_0x01ee
            android.widget.LinearLayout r9 = r0.f232640e
            if (r9 == 0) goto L_0x01d1
            int r15 = r9.getPaddingLeft()
            int r14 = r9.getPaddingTop()
            int r1 = r9.getPaddingRight()
            r23 = r3
            android.content.Context r3 = r0.f232644i
            int r3 = kg3.C76577a.m92151b(r3, r10)
            r9.setPadding(r15, r14, r1, r3)
            goto L_0x01d3
        L_0x01d1:
            r23 = r3
        L_0x01d3:
            android.view.View r1 = r0.f232641f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r3 = -2
            r1.height = r3
            android.widget.RelativeLayout r1 = r0.f232639d
            if (r1 == 0) goto L_0x01e5
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x01e6
        L_0x01e5:
            r1 = 0
        L_0x01e6:
            if (r1 != 0) goto L_0x01ea
            goto L_0x02d0
        L_0x01ea:
            r1.height = r3
            goto L_0x02d0
        L_0x01ee:
            r23 = r3
            android.content.Context r1 = r0.f232644i
            com.tencent.p014mm.p136ui.C74783i3.m89537a(r1)
            rz2.c r1 = r0.f232655w
            jz2.k r3 = r0.f232622I
            jz2.e r3 = (jz2.C76474e) r3
            qy2.i r3 = r3.mo106711c()
            boolean r1 = yz2.C79224c.m95930b(r1, r3)
            if (r1 == 0) goto L_0x022b
            rz2.c r1 = r0.f232655w
            if (r1 == 0) goto L_0x0225
            uz2.s r1 = r1.mo72945n2()
            java.lang.String r1 = r1.f147197d
            if (r1 == 0) goto L_0x021c
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x0218
            goto L_0x021c
        L_0x0218:
            r1 = 1
            r17 = 0
            goto L_0x021f
        L_0x021c:
            r1 = 1
            r17 = 1
        L_0x021f:
            r3 = r17 ^ 1
            if (r3 != r1) goto L_0x0225
            r1 = 1
            goto L_0x0226
        L_0x0225:
            r1 = 0
        L_0x0226:
            if (r1 == 0) goto L_0x0229
            goto L_0x022b
        L_0x0229:
            r1 = 0
            goto L_0x022c
        L_0x022b:
            r1 = 1
        L_0x022c:
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            if (r1 == 0) goto L_0x026a
            android.widget.RelativeLayout r1 = r0.f232639d
            if (r1 == 0) goto L_0x0239
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x023a
        L_0x0239:
            r1 = 0
        L_0x023a:
            if (r1 != 0) goto L_0x023d
            goto L_0x0251
        L_0x023d:
            android.content.Context r9 = r0.f232644i
            int[] r9 = qy2.C63347a.m74683a(r9)
            r14 = 1
            r15 = r9[r14]
            float r15 = (float) r15
            r17 = 1071877689(0x3fe38e39, float:1.7777778)
            float r15 = r15 / r17
            int r15 = (int) r15
            r9[r14] = r15
            r1.height = r15
        L_0x0251:
            android.view.View r1 = r0.f232616C
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r9 = 0
            r1.height = r9
            android.view.View r1 = r0.f232616C
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r1, r3)
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.weight = r3
            goto L_0x0290
        L_0x026a:
            android.widget.RelativeLayout r1 = r0.f232639d
            if (r1 == 0) goto L_0x0273
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto L_0x0274
        L_0x0273:
            r1 = 0
        L_0x0274:
            r9 = -2
            if (r1 != 0) goto L_0x0278
            goto L_0x027a
        L_0x0278:
            r1.height = r9
        L_0x027a:
            android.view.View r1 = r0.f232616C
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r9
            android.view.View r1 = r0.f232616C
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r1, r3)
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r3 = 0
            r1.weight = r3
        L_0x0290:
            android.widget.RelativeLayout r1 = r0.f232639d
            if (r1 == 0) goto L_0x02a2
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x02a2
            android.widget.RelativeLayout r3 = r0.f232639d
            if (r3 != 0) goto L_0x029f
            goto L_0x02a2
        L_0x029f:
            r3.setLayoutParams(r1)
        L_0x02a2:
            android.widget.LinearLayout r1 = r0.f232640e
            if (r1 == 0) goto L_0x02bb
            int r3 = r1.getPaddingLeft()
            int r9 = r1.getPaddingTop()
            int r14 = r1.getPaddingRight()
            android.content.Context r15 = r0.f232644i
            int r10 = kg3.C76577a.m92151b(r15, r10)
            r1.setPadding(r3, r9, r14, r10)
        L_0x02bb:
            android.widget.RelativeLayout r1 = r0.f232639d
            if (r1 == 0) goto L_0x02d0
            r3 = 2131316062(0x7f094d5e, float:1.8250595E38)
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x02d0
            yz2.l r3 = new yz2.l
            r3.<init>(r0)
            r1.setOnClickListener(r3)
        L_0x02d0:
            android.view.View r1 = r0.f232641f
            r3 = 8
            if (r6 == 0) goto L_0x02d9
            r9 = 8
            goto L_0x02da
        L_0x02d9:
            r9 = 0
        L_0x02da:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.mo10233c(r9)
            java.lang.Object[] r25 = r10.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r27 = "initData"
            java.lang.String r28 = "(Ljava/lang/String;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r1
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = 0
            java.lang.Object r10 = r10.mo10231a(r9)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r1.setVisibility(r9)
            java.lang.String r25 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r26 = "initData"
            java.lang.String r27 = "(Ljava/lang/String;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            if (r6 == 0) goto L_0x0321
            r39.mo109251x()
            goto L_0x0a90
        L_0x0321:
            r1 = -1
            java.lang.String r6 = "layoutNoStatus"
            if (r4 != 0) goto L_0x039b
            android.widget.RelativeLayout r4 = r0.f232648p
            if (r4 != 0) goto L_0x032b
            goto L_0x032e
        L_0x032b:
            r4.setVisibility(r3)
        L_0x032e:
            android.widget.ImageView r4 = r0.f232647o
            if (r4 != 0) goto L_0x0333
            goto L_0x0336
        L_0x0333:
            r4.setVisibility(r3)
        L_0x0336:
            android.view.View r4 = r0.f232650r
            if (r4 == 0) goto L_0x0396
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r7)
            java.lang.Object[] r25 = r6.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r27 = "initData"
            java.lang.String r28 = "(Ljava/lang/String;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r4
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r25 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r26 = "initData"
            java.lang.String r27 = "(Ljava/lang/String;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            r39.mo109251x()
            boolean r4 = qy2.C77448f0.m93394f()
            if (r4 != 0) goto L_0x037e
            goto L_0x038c
        L_0x037e:
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_NEW_TIPS_SHOW_BOOLEAN
            r9 = 0
            r4.mo119686g(r6, r9)
        L_0x038c:
            android.widget.TextView r4 = r0.f232615B
            r4.setVisibility(r3)
            r0.f232625L = r5
            r6 = 1
            goto L_0x0444
        L_0x0396:
            gy3.C87412m.m108603p(r6)
            r1 = 0
            throw r1
        L_0x039b:
            android.widget.RelativeLayout r4 = r0.f232648p
            r9 = 0
            if (r4 != 0) goto L_0x03a1
            goto L_0x03a4
        L_0x03a1:
            r4.setVisibility(r9)
        L_0x03a4:
            android.widget.ImageView r4 = r0.f232647o
            if (r4 != 0) goto L_0x03a9
            goto L_0x03ac
        L_0x03a9:
            r4.setVisibility(r9)
        L_0x03ac:
            android.view.View r4 = r0.f232650r
            if (r4 == 0) goto L_0x0a9f
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r6.mo10233c(r9)
            java.lang.Object[] r25 = r6.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r27 = "initData"
            java.lang.String r28 = "(Ljava/lang/String;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r4
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = 0
            java.lang.Object r6 = r6.mo10231a(r9)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r25 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r26 = "initData"
            java.lang.String r27 = "(Ljava/lang/String;)V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
            android.widget.LinearLayout r4 = r0.f232640e
            if (r4 == 0) goto L_0x0406
            r6 = 2131316023(0x7f094d37, float:1.8250516E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0406
            r4.setTextColor(r1)
            r6 = 1058642330(0x3f19999a, float:0.6)
            r4.setAlpha(r6)
        L_0x0406:
            android.widget.LinearLayout r4 = r0.f232640e
            if (r4 == 0) goto L_0x0418
            r6 = 2131310269(0x7f0936bd, float:1.8238845E38)
            android.view.View r4 = r4.findViewById(r6)
            com.tencent.mm.ui.base.NoMeasuredTextView r4 = (com.tencent.p014mm.p136ui.base.NoMeasuredTextView) r4
            if (r4 == 0) goto L_0x0418
            r4.setTextColor((int) r1)
        L_0x0418:
            android.widget.LinearLayout r4 = r0.f232640e
            if (r4 == 0) goto L_0x042a
            r6 = 2131311611(0x7f093bfb, float:1.8241567E38)
            android.view.View r4 = r4.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x042a
            r4.setIconColor(r1)
        L_0x042a:
            android.widget.LinearLayout r4 = r0.f232640e
            if (r4 == 0) goto L_0x043c
            r6 = 2131297308(0x7f09041c, float:1.8212557E38)
            android.view.View r4 = r4.findViewById(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
            if (r4 == 0) goto L_0x043c
            r4.setIconColor(r1)
        L_0x043c:
            r4 = 0
            r6 = 1
            r9 = 0
            az2.C39674e.m42302T0(r13, r9, r6, r4)
            r0.f232625L = r2
        L_0x0444:
            yz2.k$c r4 = r0.f232625L
            if (r4 != r5) goto L_0x0790
            nz2.a r4 = r13.mo62248f0()
            int r5 = r4.mo72361a()
            if (r5 != r6) goto L_0x04eb
            int r5 = r4.f126986b
            android.widget.TextView r6 = r0.f232614A
            if (r6 != 0) goto L_0x0459
            goto L_0x047d
        L_0x0459:
            jz2.k r9 = r0.f232622I
            jz2.e r9 = (jz2.C76474e) r9
            r10 = 99
            if (r5 <= r10) goto L_0x0473
            android.content.Context r5 = r9.mo106716y()
            r9 = 2131837946(0x7f1143fa, float:1.9309101E38)
            java.lang.String r5 = r5.getString(r9)
            java.lang.String r9 = "{\n            context.ge…oo_many_simple)\n        }"
            gy3.C87412m.m108593f(r5, r9)
            goto L_0x047a
        L_0x0473:
            r9.getClass()
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x047a:
            r6.setText(r5)
        L_0x047d:
            android.view.View r5 = r0.f232658z
            if (r5 != 0) goto L_0x0482
            goto L_0x04bc
        L_0x0482:
            k20.a r6 = new k20.a
            r6.<init>()
            r6.mo10233c(r7)
            java.lang.Object[] r25 = r6.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r27 = "handleNotifyV2"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r5
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r7 = 0
            java.lang.Object r6 = r6.mo10231a(r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r25 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r26 = "handleNotifyV2"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x04bc:
            android.view.View r5 = r0.f232658z
            if (r5 == 0) goto L_0x04c8
            yz2.m r6 = new yz2.m
            r6.<init>(r0, r4)
            r5.post(r6)
        L_0x04c8:
            android.view.View r5 = r0.f232658z
            if (r5 == 0) goto L_0x04d4
            yz2.n r6 = new yz2.n
            r6.<init>(r0, r4)
            r5.setOnClickListener(r6)
        L_0x04d4:
            di3.d r5 = di3.C86312j.m106911c(r12)
            ox.b r5 = (p640ox.C77049b) r5
            android.content.Context r6 = r0.f232644i
            r7 = 9
            pe3.a r5 = r5.Wi0(r6, r7, r11)
            uz2.f0 r5 = (uz2.C78315f0) r5
            if (r5 == 0) goto L_0x052e
            int r4 = r4.f126986b
            r5.f229435n = r4
            goto L_0x052e
        L_0x04eb:
            android.view.View r4 = r0.f232658z
            if (r4 != 0) goto L_0x04f0
            goto L_0x052e
        L_0x04f0:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5.mo10233c(r6)
            java.lang.Object[] r25 = r5.mo10232b()
            java.lang.String r26 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r27 = "handleNotifyV2"
            java.lang.String r28 = "()V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            r24 = r4
            j20.C117292a.m165358d(r24, r25, r26, r27, r28, r29, r30, r31)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r25 = "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView"
            java.lang.String r26 = "handleNotifyV2"
            java.lang.String r27 = "()V"
            java.lang.String r28 = "android/view/View_EXEC_"
            java.lang.String r29 = "setVisibility"
            java.lang.String r30 = "(I)V"
            j20.C117292a.m165359e(r24, r25, r26, r27, r28, r29, r30)
        L_0x052e:
            java.text.SimpleDateFormat r4 = qy2.C77448f0.f225876a
            rz2.h r4 = r13.mo62255t0()
            java.lang.String[] r5 = rz2.C48206h.f129188f
            r5 = 0
            int r4 = r4.mo72965TE(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "SquareEntry isOpenTopicSquare:"
            r5.append(r6)
            r6 = 1
            r5.append(r6)
            java.lang.String r6 = " totalStatusNum:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r5)
            android.widget.LinearLayout r5 = r0.f232621H
            if (r5 != 0) goto L_0x055d
            goto L_0x0561
        L_0x055d:
            r6 = 0
            r5.setVisibility(r6)
        L_0x0561:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.Class<lc3.b> r7 = lc3.C10485b.class
            k40.a r7 = f40.C86709a0.m107533q(r7)
            lc3.b r7 = (lc3.C10485b) r7
            pj.f r7 = r7.vh0()
            java.lang.String r8 = "StatusFriendsButtonStyleConfig"
            java.lang.String r7 = r7.mo107405c(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r9 = "MicroMsg.TextStatus.TextStatusSwitch"
            if (r8 != 0) goto L_0x0599
            qy2.f0$b r8 = qy2.C77448f0.m93389a(r7)
            r10 = 2
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r15 = 0
            r14[r15] = r7
            int r7 = r8.f225883a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r17 = 1
            r14[r17] = r7
            java.lang.String r7 = "btnStyle convert dConfig src:%s style:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r7, r14)
            goto L_0x05b2
        L_0x0599:
            r10 = 2
            r15 = 0
            r17 = 1
            qy2.f0$b r8 = qy2.C77448f0.m93389a(r23)
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r15] = r23
            int r14 = r8.f225883a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r7[r17] = r14
            java.lang.String r14 = "btnStyle convert xConfig src:%s style:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r14, r7)
        L_0x05b2:
            java.lang.Object[] r7 = new java.lang.Object[r10]
            r7[r15] = r8
            long r14 = java.lang.System.currentTimeMillis()
            long r14 = r14 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r14)
            r7[r17] = r5
            java.lang.String r5 = "btnStyle final:%s cost:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r5, r7)
            r0.f232634V = r8
            if (r4 != 0) goto L_0x05d1
            qy2.f0$b r5 = new qy2.f0$b
            r5.<init>()
            r0.f232634V = r5
        L_0x05d1:
            qy2.f0$b r5 = r0.f232634V
            int r5 = r5.f225883a
            if (r5 == 0) goto L_0x073c
            r6 = 2131837982(0x7f11441e, float:1.9309174E38)
            r7 = 1
            if (r5 == r7) goto L_0x06fe
            r7 = 2
            if (r5 == r7) goto L_0x05e2
            goto L_0x075d
        L_0x05e2:
            android.widget.LinearLayout r5 = r0.f232619F
            r7 = 0
            if (r5 != 0) goto L_0x05e8
            goto L_0x05eb
        L_0x05e8:
            r5.setVisibility(r7)
        L_0x05eb:
            android.widget.TextView r5 = r0.f232620G
            if (r5 != 0) goto L_0x05f0
            goto L_0x05f3
        L_0x05f0:
            r5.setVisibility(r7)
        L_0x05f3:
            android.widget.ImageView r5 = r0.f232617D
            if (r5 != 0) goto L_0x05f8
            goto L_0x05fb
        L_0x05f8:
            r5.setVisibility(r3)
        L_0x05fb:
            android.widget.ImageView r5 = r0.f232618E
            if (r5 != 0) goto L_0x0600
            goto L_0x0603
        L_0x0600:
            r5.setVisibility(r3)
        L_0x0603:
            android.widget.TextView r3 = r0.f232620G
            if (r3 != 0) goto L_0x0608
            goto L_0x063a
        L_0x0608:
            r5 = 3
            if (r4 > r5) goto L_0x0620
            android.content.Context r5 = r0.f232644i
            android.content.res.Resources r5 = r5.getResources()
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9 = 0
            r8[r9] = r4
            java.lang.String r4 = r5.getString(r6, r8)
            goto L_0x0637
        L_0x0620:
            r7 = 1
            r9 = 0
            android.content.Context r5 = r0.f232644i
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131837983(0x7f11441f, float:1.9309176E38)
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8[r9] = r4
            java.lang.String r4 = r5.getString(r6, r8)
        L_0x0637:
            r3.setText(r4)
        L_0x063a:
            android.widget.LinearLayout r3 = r0.f232619F
            if (r3 == 0) goto L_0x0641
            r3.removeAllViews()
        L_0x0641:
            rz2.h r3 = r13.mo62255t0()
            java.lang.String r4 = su0.C13781a.m13082a()
            r5 = 0
            java.util.List r3 = r3.mo72964SE(r5, r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x0653:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x075d
            java.lang.Object r5 = r3.next()
            rz2.h$b r5 = (rz2.C48206h.C48208b) r5
            java.util.List<rz2.c> r6 = r5.f129193b
            int r6 = r6.size()
            if (r6 > 0) goto L_0x0669
            r6 = 0
            goto L_0x067a
        L_0x0669:
            java.util.List<rz2.c> r6 = r5.f129193b
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            rz2.c r6 = (rz2.C48201c) r6
            b03.c r7 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r6 = r7.mo62314z(r6)
        L_0x067a:
            if (r6 == 0) goto L_0x06f9
            java.util.List<rz2.c> r5 = r5.f129193b
            java.util.Iterator r5 = r5.iterator()
        L_0x0682:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x06f9
            java.lang.Object r6 = r5.next()
            rz2.c r6 = (rz2.C48201c) r6
            android.widget.ImageView r7 = new android.widget.ImageView
            android.content.Context r8 = r0.f232644i
            r7.<init>(r8)
            android.widget.LinearLayout r8 = r0.f232619F
            if (r8 == 0) goto L_0x069c
            r8.addView(r7)
        L_0x069c:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r9 = r8 instanceof android.widget.LinearLayout.LayoutParams
            if (r9 == 0) goto L_0x06a7
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            goto L_0x06a8
        L_0x06a7:
            r8 = 0
        L_0x06a8:
            if (r8 != 0) goto L_0x06ac
            r9 = -2
            goto L_0x06af
        L_0x06ac:
            r9 = -2
            r8.width = r9
        L_0x06af:
            if (r8 != 0) goto L_0x06b2
            goto L_0x06b4
        L_0x06b2:
            r8.height = r1
        L_0x06b4:
            r10 = 1
            r7.setAdjustViewBounds(r10)
            android.content.Context r13 = r0.f232644i
            int r13 = kg3.C76577a.m92151b(r13, r10)
            r7.setPadding(r13, r13, r13, r13)
            r7.setBackgroundColor(r1)
            r13 = 1056964608(0x3f000000, float:0.5)
            b03.d0 r14 = new b03.d0
            r14.<init>(r13)
            r7.setOutlineProvider(r14)
            r7.setClipToOutline(r10)
            r13 = 2131755464(0x7f1001c8, float:1.9141808E38)
            r7.setImageResource(r13)
            java.lang.Class<ln.f> r13 = p196ln.C76705f.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            ln.f r13 = (p196ln.C76705f) r13
            java.lang.String r6 = r6.field_UserName
            r13.mo106822J5(r7, r6)
            int r4 = r4 + 1
            if (r4 <= r10) goto L_0x06f5
            if (r8 != 0) goto L_0x06eb
            goto L_0x06f5
        L_0x06eb:
            android.content.Context r6 = r0.f232644i
            r7 = -4
            int r6 = kg3.C76577a.m92151b(r6, r7)
            r8.setMarginStart(r6)
        L_0x06f5:
            r6 = 3
            if (r4 < r6) goto L_0x0682
            goto L_0x06fb
        L_0x06f9:
            r6 = 3
            r9 = -2
        L_0x06fb:
            if (r4 < r6) goto L_0x0653
            goto L_0x075d
        L_0x06fe:
            android.widget.ImageView r1 = r0.f232618E
            r5 = 0
            if (r1 != 0) goto L_0x0704
            goto L_0x0707
        L_0x0704:
            r1.setVisibility(r5)
        L_0x0707:
            android.widget.TextView r1 = r0.f232620G
            if (r1 != 0) goto L_0x070c
            goto L_0x070f
        L_0x070c:
            r1.setVisibility(r5)
        L_0x070f:
            android.widget.ImageView r1 = r0.f232617D
            if (r1 != 0) goto L_0x0714
            goto L_0x0717
        L_0x0714:
            r1.setVisibility(r3)
        L_0x0717:
            android.widget.LinearLayout r1 = r0.f232619F
            if (r1 != 0) goto L_0x071c
            goto L_0x071f
        L_0x071c:
            r1.setVisibility(r3)
        L_0x071f:
            android.widget.TextView r1 = r0.f232620G
            if (r1 != 0) goto L_0x0724
            goto L_0x075d
        L_0x0724:
            android.content.Context r3 = r0.f232644i
            android.content.res.Resources r3 = r3.getResources()
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r7[r5] = r4
            java.lang.String r3 = r3.getString(r6, r7)
            r1.setText(r3)
            goto L_0x075d
        L_0x073c:
            r5 = 0
            android.widget.ImageView r1 = r0.f232617D
            if (r1 != 0) goto L_0x0742
            goto L_0x0745
        L_0x0742:
            r1.setVisibility(r5)
        L_0x0745:
            android.widget.ImageView r1 = r0.f232618E
            if (r1 != 0) goto L_0x074a
            goto L_0x074d
        L_0x074a:
            r1.setVisibility(r3)
        L_0x074d:
            android.widget.LinearLayout r1 = r0.f232619F
            if (r1 != 0) goto L_0x0752
            goto L_0x0755
        L_0x0752:
            r1.setVisibility(r3)
        L_0x0755:
            android.widget.TextView r1 = r0.f232620G
            if (r1 != 0) goto L_0x075a
            goto L_0x075d
        L_0x075a:
            r1.setVisibility(r3)
        L_0x075d:
            vz2.d r24 = vz2.C78501d.f229945a
            r25 = 20
            java.lang.String r1 = su0.C13781a.m13082a()
            java.lang.String r3 = "username()"
            gy3.C87412m.m108593f(r1, r3)
            r28 = 0
            qy2.f0$b r3 = r0.f232634V
            int r3 = r3.f225883a
            r4 = 1
            if (r3 != r4) goto L_0x0776
            r9 = 2
            goto L_0x077c
        L_0x0776:
            r4 = 2
            if (r3 != r4) goto L_0x077b
            r9 = 3
            goto L_0x077c
        L_0x077b:
            r9 = 1
        L_0x077c:
            long r3 = (long) r9
            r31 = 0
            r32 = 0
            r34 = 52
            r35 = 0
            r27 = r1
            r29 = r3
            vz2.C78501d.m94805g(r24, r25, r27, r28, r29, r31, r32, r34, r35)
            r6 = r23
            goto L_0x0917
        L_0x0790:
            jz2.k r1 = r0.f232622I
            jz2.e r1 = (jz2.C76474e) r1
            r1.getClass()
            java.lang.Class<h81.h> r4 = h81.C32735h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            h81.h r4 = (h81.C32735h) r4
            h81.h$c r5 = h81.C32735h.C32737c.clicfg_text_state_square_reddot_and
            r6 = r23
            java.lang.String r4 = r4.Y60(r5, r6)
            b03.h r5 = new b03.h
            r7 = 3
            r8 = 0
            r9 = 0
            r5.<init>(r9, r8, r7, r8)
            if (r4 == 0) goto L_0x07ba
            boolean r7 = z04.C112551y.m153811k(r4)
            if (r7 == 0) goto L_0x07b8
            goto L_0x07ba
        L_0x07b8:
            r7 = 0
            goto L_0x07bb
        L_0x07ba:
            r7 = 1
        L_0x07bb:
            java.lang.String r8 = "MicroMsg.TextStatus.TextStatusRedDotHelper"
            if (r7 != 0) goto L_0x086a
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0869 }
            r7.<init>(r4)     // Catch:{ all -> 0x0869 }
            java.lang.String r4 = "durations"
            org.json.JSONArray r4 = r7.optJSONArray(r4)     // Catch:{ all -> 0x0869 }
            java.util.List r4 = qy2.C77448f0.C77449a.m93397b(r4)     // Catch:{ all -> 0x0869 }
            r7 = r4
            java.util.LinkedList r7 = (java.util.LinkedList) r7     // Catch:{ all -> 0x0869 }
            int r7 = r7.size()     // Catch:{ all -> 0x0869 }
            if (r7 <= 0) goto L_0x086a
            long r9 = eb0.C31543z5.m39453c()     // Catch:{ all -> 0x0869 }
            java.util.Calendar r7 = qy2.C77448f0.m93390b(r9)     // Catch:{ all -> 0x0869 }
            if (r7 == 0) goto L_0x086a
            r9 = 11
            int r9 = r7.get(r9)     // Catch:{ all -> 0x0869 }
            r10 = 12
            int r7 = r7.get(r10)     // Catch:{ all -> 0x0869 }
            int r10 = r9 * 60
            int r10 = r10 + r7
            java.lang.String r13 = "squareRedDotConfig cur h:%s, m:%s, tm:%s"
            r14 = 3
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x0869 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0869 }
            r14 = 0
            r15[r14] = r9     // Catch:{ all -> 0x0869 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0869 }
            r9 = 1
            r15[r9] = r7     // Catch:{ all -> 0x0869 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0869 }
            r9 = 2
            r15[r9] = r7     // Catch:{ all -> 0x0869 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r13, r15)     // Catch:{ all -> 0x0869 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0869 }
        L_0x0812:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0869 }
            if (r7 == 0) goto L_0x086a
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x0869 }
            qy2.f0$a r7 = (qy2.C77448f0.C77449a) r7     // Catch:{ all -> 0x0869 }
            java.lang.String r9 = "squareRedDotConfig DurationData:%s"
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ all -> 0x0869 }
            r13 = 0
            r14[r13] = r7     // Catch:{ all -> 0x0869 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r9, r14)     // Catch:{ all -> 0x0869 }
            boolean r9 = r7.mo107617a(r10)     // Catch:{ all -> 0x0869 }
            if (r9 == 0) goto L_0x0812
            f40.o r9 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x0869 }
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()     // Catch:{ all -> 0x0869 }
            com.tencent.mm.storage.y1$a r13 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_SQUARE_RED_DOT_TAG_STRING     // Catch:{ all -> 0x0869 }
            java.lang.String r9 = r9.mo119675I(r13, r6)     // Catch:{ all -> 0x0869 }
            java.lang.String r13 = "storage().configStg.getS…E_RED_DOT_TAG_STRING, \"\")"
            gy3.C87412m.m108593f(r9, r13)     // Catch:{ all -> 0x0869 }
            java.lang.String r13 = "squrered"
            java.lang.String r13 = qy2.C77448f0.m93391c(r13, r7)     // Catch:{ all -> 0x0869 }
            java.lang.String r14 = "squareRedDotConfig curtag:%s, targetTag:%s"
            r15 = 2
            java.lang.Object[] r3 = new java.lang.Object[r15]     // Catch:{ all -> 0x0869 }
            r18 = 0
            r3[r18] = r9     // Catch:{ all -> 0x0869 }
            r15 = 1
            r3[r15] = r13     // Catch:{ all -> 0x0869 }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r14, r3)     // Catch:{ all -> 0x0869 }
            boolean r3 = android.text.TextUtils.equals(r9, r13)     // Catch:{ all -> 0x0869 }
            if (r3 != 0) goto L_0x0866
            r5.f192744a = r15     // Catch:{ all -> 0x0869 }
            r5.f192745b = r7     // Catch:{ all -> 0x0869 }
            goto L_0x086a
        L_0x0866:
            r3 = 8
            goto L_0x0812
        L_0x0869:
        L_0x086a:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r3 = 0
            r4[r3] = r5
            java.lang.String r3 = "getSquareRedDotResult() called res:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r3, r4)
            r1.f223872Y = r5
            android.view.View r1 = r1.f223864Q
            if (r1 != 0) goto L_0x087d
            goto L_0x0917
        L_0x087d:
            boolean r3 = r5.f192744a
            if (r3 != 0) goto L_0x0883
            r3 = 0
            goto L_0x08d0
        L_0x0883:
            az2.e r3 = az2.C39674e.f106452d
            rz2.h r3 = r3.mo62255t0()
            r3.getClass()
            java.lang.String r4 = su0.C13781a.m13082a()
            java.util.concurrent.ConcurrentHashMap r3 = r3.mo72966Yt()
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x089c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x08c0
            java.lang.Object r5 = r3.next()
            rz2.c r5 = (rz2.C48201c) r5
            java.lang.String r7 = r5.field_UserName
            boolean r7 = gy3.C87412m.m108589b(r7, r4)
            if (r7 == 0) goto L_0x08b1
            goto L_0x089c
        L_0x08b1:
            boolean r7 = r5.mo72946o2()
            if (r7 == 0) goto L_0x08b8
            goto L_0x089c
        L_0x08b8:
            boolean r5 = r5.mo72947p2()
            if (r5 != 0) goto L_0x089c
            r3 = 1
            goto L_0x08c1
        L_0x08c0:
            r3 = 0
        L_0x08c1:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r7 = 0
            r5[r7] = r4
            java.lang.String r4 = "isShowAfterMatchUnRead %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r4, r5)
        L_0x08d0:
            if (r3 == 0) goto L_0x08d5
            r16 = 0
            goto L_0x08d7
        L_0x08d5:
            r16 = 8
        L_0x08d7:
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            r3.mo10233c(r4)
            java.lang.Object[] r23 = r3.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r25 = "handleTopicSquareEntryWithStatusIcon"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r23 = "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogic"
            java.lang.String r24 = "handleTopicSquareEntryWithStatusIcon"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x0917:
            rz2.c r1 = r0.f232655w
            if (r1 == 0) goto L_0x092d
            java.lang.String r3 = r1.field_StatusID
            if (r3 == 0) goto L_0x0928
            boolean r3 = z04.C112551y.m153811k(r3)
            if (r3 == 0) goto L_0x0926
            goto L_0x0928
        L_0x0926:
            r14 = 0
            goto L_0x0929
        L_0x0928:
            r14 = 1
        L_0x0929:
            if (r14 == 0) goto L_0x092d
            goto L_0x09e0
        L_0x092d:
            di3.d r3 = di3.C86312j.m106911c(r12)
            ox.b r3 = (p640ox.C77049b) r3
            android.content.Context r4 = r0.f232644i
            r5 = 9
            pe3.a r3 = r3.Wi0(r4, r5, r11)
            uz2.f0 r3 = (uz2.C78315f0) r3
            if (r3 == 0) goto L_0x0942
            java.lang.String r3 = r3.f229428d
            goto L_0x0943
        L_0x0942:
            r3 = 0
        L_0x0943:
            if (r3 != 0) goto L_0x0947
            goto L_0x09e0
        L_0x0947:
            az2.e r4 = az2.C39674e.f106452d
            nz2.a r4 = r4.mo62248f0()
            int r4 = r4.f126986b
            if (r1 == 0) goto L_0x0954
            int r14 = r1.field_LikeCount
            goto L_0x0955
        L_0x0954:
            r14 = 0
        L_0x0955:
            if (r1 == 0) goto L_0x095a
            int r5 = r1.field_referenceCount
            goto L_0x095b
        L_0x095a:
            r5 = 0
        L_0x095b:
            int r14 = r14 + r5
            if (r4 != 0) goto L_0x0963
            if (r14 == 0) goto L_0x0961
            goto L_0x0963
        L_0x0961:
            r5 = r6
            goto L_0x0977
        L_0x0963:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            r7 = 59
            r5.append(r7)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
        L_0x0977:
            if (r4 <= 0) goto L_0x097c
            r7 = 11
            goto L_0x097e
        L_0x097c:
            r7 = 12
        L_0x097e:
            if (r1 == 0) goto L_0x0983
            java.lang.String r1 = r1.field_StatusID
            goto L_0x0984
        L_0x0983:
            r1 = 0
        L_0x0984:
            if (r1 != 0) goto L_0x0987
            r1 = r6
        L_0x0987:
            if (r5 == 0) goto L_0x0992
            boolean r4 = z04.C112551y.m153811k(r5)
            if (r4 == 0) goto L_0x0990
            goto L_0x0992
        L_0x0990:
            r14 = 0
            goto L_0x0993
        L_0x0992:
            r14 = 1
        L_0x0993:
            if (r14 != 0) goto L_0x09d8
            java.lang.String r4 = r0.f232629Q
            boolean r4 = gy3.C87412m.m108589b(r3, r4)
            if (r4 != 0) goto L_0x09b3
            vz2.d r22 = vz2.C78501d.f229945a
            r23 = 41
            r26 = 0
            r27 = 0
            r32 = 12
            r33 = 0
            r25 = r5
            r29 = r1
            r30 = r7
            vz2.C78501d.m94805g(r22, r23, r25, r26, r27, r29, r30, r32, r33)
            goto L_0x09d8
        L_0x09b3:
            java.lang.String r4 = r0.f232630R
            boolean r4 = gy3.C87412m.m108589b(r5, r4)
            if (r4 == 0) goto L_0x09c3
            java.lang.String r4 = r0.f232631S
            boolean r4 = gy3.C87412m.m108589b(r1, r4)
            if (r4 != 0) goto L_0x09d8
        L_0x09c3:
            vz2.d r22 = vz2.C78501d.f229945a
            r23 = 42
            r26 = 0
            r27 = 0
            r32 = 12
            r33 = 0
            r25 = r5
            r29 = r1
            r30 = r7
            vz2.C78501d.m94805g(r22, r23, r25, r26, r27, r29, r30, r32, r33)
        L_0x09d8:
            r0.f232629Q = r3
            r0.f232630R = r5
            r0.f232631S = r1
            r0.f232632T = r7
        L_0x09e0:
            b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            rz2.c r3 = r0.f232655w
            if (r3 == 0) goto L_0x09f0
            r4 = 0
            r5 = 1
            r7 = 0
            uz2.e0 r3 = p773yy.C66710j.C53637a.m60171a(r3, r7, r5, r4)
            goto L_0x09f1
        L_0x09f0:
            r3 = 0
        L_0x09f1:
            java.lang.String r1 = r1.mo62301m(r3)
            android.widget.TextView r3 = r0.f232643h
            if (r3 != 0) goto L_0x09fa
            goto L_0x0a15
        L_0x09fa:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = r0.f232644i
            r7 = 2131837972(0x7f114414, float:1.9309154E38)
            java.lang.String r5 = r5.getString(r7)
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.setText(r1)
        L_0x0a15:
            di3.d r1 = di3.C86312j.m106911c(r12)
            ox.b r1 = (p640ox.C77049b) r1
            android.content.Context r3 = r0.f232644i
            r4 = 9
            pe3.a r1 = r1.Wi0(r3, r4, r11)
            uz2.f0 r1 = (uz2.C78315f0) r1
            if (r1 == 0) goto L_0x0a85
            java.lang.String r3 = r1.f229428d
            java.lang.String r4 = r0.f232627N
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0a32
            goto L_0x0a90
        L_0x0a32:
            yz2.k$c r3 = r0.f232625L
            if (r3 != r2) goto L_0x0a60
            vz2.d r22 = vz2.C78501d.f229945a
            android.content.Context r2 = r0.f232644i
            r23 = r2
            jz2.k r2 = r0.f232622I
            jz2.e r2 = (jz2.C76474e) r2
            r3 = 3
            long r34 = r2.mo106691B(r3)
            r24 = 1
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r32 = 0
            r36 = 0
            r37 = 380(0x17c, float:5.32E-43)
            r38 = 0
            vz2.C78501d.m94806h(r22, r23, r24, r26, r27, r28, r30, r32, r34, r36, r37, r38)
            long r2 = eb0.C31543z5.m39453c()
            r0.f232637Y = r2
        L_0x0a60:
            java.lang.String r2 = r1.f229428d
            r3 = r21
            gy3.C87412m.m108593f(r2, r3)
            r0.f232627N = r2
            rz2.c r2 = r0.f232655w
            if (r2 == 0) goto L_0x0a70
            java.lang.String r2 = r2.field_StatusID
            goto L_0x0a71
        L_0x0a70:
            r2 = 0
        L_0x0a71:
            if (r2 != 0) goto L_0x0a75
            r3 = r6
            goto L_0x0a76
        L_0x0a75:
            r3 = r2
        L_0x0a76:
            r0.f232628P = r3
            di3.d r2 = di3.C86312j.m106911c(r20)     // Catch:{ all -> 0x0a85 }
            mm.h r2 = (p606mm.C99933h) r2     // Catch:{ all -> 0x0a85 }
            r3 = r19
            r4 = 9
            r2.mo84407yo(r4, r3, r1)     // Catch:{ all -> 0x0a85 }
        L_0x0a85:
            az2.e r1 = az2.C39674e.f106452d
            rz2.h r1 = r1.mo62255t0()
            r2 = r40
            r1.mo72971mI(r2)
        L_0x0a90:
            r39.mo109252y()
            r39.mo109253z()
            jz2.k r1 = r0.f232622I
            qy2.n$a r2 = r0.f232633U
            jz2.e r1 = (jz2.C76474e) r1
            r1.f223871X = r2
            goto L_0x0aa4
        L_0x0a9f:
            gy3.C87412m.m108603p(r6)
            r1 = 0
            throw r1
        L_0x0aa4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79239k.mo72650h(java.lang.String):void");
    }

    /* renamed from: i */
    public void mo96597i(int i) {
        this.f232622I.getClass();
    }

    /* renamed from: j */
    public boolean mo107629j(View view, View view2) {
        return !C87412m.m108589b(view, this.f232639d) && !C87412m.m108589b(view2, this.f232640e);
    }

    /* renamed from: k */
    public void mo72648k() {
        mo72650h(this.f232645j);
    }

    /* renamed from: m */
    public void mo72649m() {
    }

    /* renamed from: n */
    public void mo96598n() {
        this.f232622I.getClass();
    }

    /* renamed from: o */
    public void mo72642o(boolean z) {
    }

    public void onBackPressed() {
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.kin) {
            mo109250t();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onPostClose() {
        ((C76452b) this.f232622I).onPostClose();
        this.f232624K = false;
        mo109252y();
    }

    public void onPostOpen(boolean z) {
        ((C76452b) this.f232622I).onPostOpen(z);
        this.f232624K = true;
        mo109252y();
    }

    public void onPreClose() {
        ((C76452b) this.f232622I).onPreClose();
    }

    public void onPreOpen() {
        C78501d.m94805g(C78501d.f229945a, 17, "1", (String) null, 0, (String) null, 0, 60, (Object) null);
        ((C76452b) this.f232622I).onPreOpen();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        if (yVar instanceof C76738b) {
            C89137b0 d = C86709a0.m107524d();
            ((C76738b) yVar).getClass();
            d.mo123470p(5293, this);
            if (i == 0 && i2 == 0) {
                z = true;
            } else {
                Context context = this.f232644i;
                C76879j.m92748s(context, context.getString(C0966R.string.jzj), "");
                z = false;
            }
            C47896n.C47897a aVar = this.f232636X;
            if (aVar != null) {
                aVar.mo67431a(0, Boolean.valueOf(z));
            }
        }
        C89779i0 i0Var = this.f232642g;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    /* renamed from: p */
    public void mo72644p(long j) {
        long c = C31543z5.m39453c();
        long j2 = this.f232637Y;
        long j3 = c - j2;
        C78501d.m94806h(C78501d.f229945a, this.f232644i, 2, (String) null, (C48201c) null, j, (j3 < 0 || j2 == 0) ? 0 : j3, 0, 0, (Integer) null, 460, (Object) null);
    }

    /* renamed from: q */
    public void mo96603q(int i) {
        this.f232622I.getClass();
    }

    /* renamed from: s */
    public void mo72645s(boolean z) {
    }

    /* renamed from: t */
    public final void mo109250t() {
        C79242c cVar;
        if (TextUtils.equals(this.f232645j, C13781a.m13082a()) && (cVar = this.f232625L) != C79242c.ADD) {
            if (cVar != C79242c.NORMAL || !this.f232624K) {
                long currentTimeMillis = System.currentTimeMillis();
                if (Math.abs(currentTimeMillis - this.f232638Z) >= 1000) {
                    this.f232638Z = currentTimeMillis;
                    Context context = this.f232644i;
                    LayoutInflater.from(context);
                    C77407n nVar = new C77407n(context, 1, false);
                    C76874e0 e0Var = new C76874e0(context);
                    new C76874e0(context);
                    C79243e eVar = new C79243e(this);
                    C79244f fVar = new C79244f(this);
                    nVar.f225802y = new C79245g(this);
                    e0Var.clear();
                    C76874e0 e0Var2 = new C76874e0(context);
                    eVar.onCreateMMMenu(e0Var2);
                    if (e0Var2.mo107176v()) {
                        Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                    } else {
                        nVar.f225771i = eVar;
                        nVar.f225782p = fVar;
                        nVar.f225761d = null;
                        nVar.f225725D = null;
                        nVar.mo107573q();
                    }
                    C78501d.m94806h(C78501d.f229945a, this.f232644i, 31, (String) null, (C48201c) null, 0, 0, 0, 0, (Integer) null, 508, (Object) null);
                }
            }
        }
    }

    /* renamed from: u */
    public void mo96604u(int i) {
        this.f232622I.getClass();
    }

    /* renamed from: v */
    public void mo106676v(float f, float f2, float f3) {
        ((C76452b) this.f232622I).mo106676v(f, f2, f3);
    }

    /* renamed from: x */
    public final void mo109251x() {
        WeImageView weImageView;
        WeImageView weImageView2;
        TextView textView;
        NoMeasuredTextView noMeasuredTextView;
        LinearLayout linearLayout = this.f232640e;
        if (!(linearLayout == null || (noMeasuredTextView = (NoMeasuredTextView) linearLayout.findViewById(C0966R.C0970id.hfq)) == null)) {
            noMeasuredTextView.setTextColor(this.f232644i.getResources().getColor(C0966R.color.FG_0));
        }
        LinearLayout linearLayout2 = this.f232640e;
        if (!(linearLayout2 == null || (textView = (TextView) linearLayout2.findViewById(C0966R.C0970id.l29)) == null)) {
            textView.setTextColor(this.f232644i.getResources().getColor(C0966R.color.FG_1));
            textView.setAlpha(1.0f);
        }
        LinearLayout linearLayout3 = this.f232640e;
        if (!(linearLayout3 == null || (weImageView2 = (WeImageView) linearLayout3.findViewById(C0966R.C0970id.i_f)) == null)) {
            weImageView2.setIconColor(this.f232644i.getResources().getColor(C0966R.color.FG_1));
        }
        LinearLayout linearLayout4 = this.f232640e;
        if (linearLayout4 != null && (weImageView = (WeImageView) linearLayout4.findViewById(C0966R.C0970id.f6145yj)) != null) {
            weImageView.setIconColor(this.f232644i.getResources().getColor(C0966R.color.FG_2));
        }
    }

    /* renamed from: y */
    public final void mo109252y() {
        TextView textView = this.f232646n;
        boolean z = true;
        if (textView != null && textView.getVisibility() == 0) {
            TextView textView2 = this.f232646n;
            CharSequence text = textView2 != null ? textView2.getText() : null;
            if (text != null && !C112551y.m153811k(text)) {
                z = false;
            }
            if (!z) {
                TextView textView3 = this.f232649q;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    return;
                }
                return;
            }
        }
        TextView textView4 = this.f232649q;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo109253z() {
        /*
            r18 = this;
            r0 = r18
            b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            java.lang.String r1 = r1.mo62293e()
            r0.f232623J = r1
            java.lang.String r14 = "tvAddStatus"
            r15 = 0
            r16 = 0
            r13 = 8
            if (r1 == 0) goto L_0x0063
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f232653u
            if (r2 != 0) goto L_0x001b
            goto L_0x001e
        L_0x001b:
            r2.setVisibility(r13)
        L_0x001e:
            android.widget.TextView r2 = r0.f232651s
            if (r2 == 0) goto L_0x005f
            android.content.Context r3 = r0.f232644i
            r4 = 2131837848(0x7f114398, float:1.9308903E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
            android.widget.ImageView r3 = r0.f232654v
            if (r3 == 0) goto L_0x0063
            r3.setVisibility(r15)
            b03.c r2 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            r5 = 0
            qy2.a$b r6 = qy2.C63347a.C47891b.FG_1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 116(0x74, float:1.63E-43)
            r11 = 0
            r4 = r1
            b03.C39691c.m42340S(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            vz2.d r2 = vz2.C78501d.f229945a
            r3 = 31
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 60
            r17 = 0
            r5 = r1
            r1 = 8
            r13 = r17
            vz2.C78501d.m94805g(r2, r3, r5, r6, r7, r9, r10, r12, r13)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0067
        L_0x005f:
            gy3.C87412m.m108603p(r14)
            throw r16
        L_0x0063:
            r1 = 8
            r2 = r16
        L_0x0067:
            if (r2 != 0) goto L_0x00a0
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f232653u
            if (r2 != 0) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r2.setVisibility(r15)
        L_0x0071:
            android.widget.ImageView r2 = r0.f232654v
            if (r2 != 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            r2.setVisibility(r1)
        L_0x0079:
            android.widget.TextView r1 = r0.f232651s
            if (r1 == 0) goto L_0x009c
            android.content.Context r2 = r0.f232644i
            r3 = 2131837849(0x7f114399, float:1.9308905E38)
            java.lang.String r2 = r2.getString(r3)
            r1.setText(r2)
            vz2.d r3 = vz2.C78501d.f229945a
            r4 = 31
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 60
            r14 = 0
            java.lang.String r6 = ""
            vz2.C78501d.m94805g(r3, r4, r6, r7, r8, r10, r11, r13, r14)
            goto L_0x00a0
        L_0x009c:
            gy3.C87412m.m108603p(r14)
            throw r16
        L_0x00a0:
            b03.c r1 = com.tencent.p014mm.plugin.textstatus.util.IStatusIconHelperKt.m39109a()
            boolean r1 = r1.mo62309u()
            if (r1 == 0) goto L_0x013e
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_TEXT_STATUS_LAST_CLIENT_VERSION_FOR_EMOJI_APPBRAND_PANEL_INT
            int r1 = r1.mo119689j(r2, r15)
            int r3 = qe3.C89625d.f257841g
            if (r1 == r3) goto L_0x00be
            r3 = 1
            goto L_0x00bf
        L_0x00be:
            r3 = 0
        L_0x00bf:
            java.lang.Class<kr0.b1> r4 = kr0.C33987b1.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            kr0.b1 r4 = (kr0.C33987b1) r4
            java.lang.String r5 = "wxb1320569c2a2b6d2"
            if (r4 == 0) goto L_0x00d4
            boolean r4 = r4.mo59391Ef(r5, r15)
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r4)
        L_0x00d4:
            r4 = r16
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r6 = gy3.C87412m.m108589b(r4, r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "updateCoverAgendaView: lastClientVersion:"
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = "  CLIENT_VERSION:"
            r7.append(r1)
            int r1 = qe3.C89625d.f257841g
            r7.append(r1)
            java.lang.String r1 = " isClientVersionChange:"
            r7.append(r1)
            r7.append(r3)
            java.lang.String r1 = " isNeedPreDownLoad:"
            r7.append(r1)
            r7.append(r6)
            java.lang.String r1 = " isPkgCached:"
            r7.append(r1)
            r7.append(r4)
            r1 = 32
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            java.lang.String r3 = "MicroMsg.TextStatus.MoreTabCardView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            if (r6 == 0) goto L_0x013e
            java.lang.Class<kr0.c1> r1 = kr0.C88262c1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kr0.c1 r1 = (kr0.C88262c1) r1
            r3 = 14
            java.lang.String r4 = "gh_8672f34b4389@app"
            java.lang.String r6 = "pages/emoji-panel/emoji-panel.html"
            r1.mo113581Re(r4, r5, r6, r3)
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            int r3 = qe3.C89625d.f257841g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo119677K(r2, r3)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yz2.C79239k.mo109253z():void");
    }
}
