package ce1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.google.android.material.bottomsheet.C104428a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.C4059g5;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import de3.C75355a0;
import di3.C86312j;
import er1.C58684b;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kd1.C9579a;
import kd1.C9584f;
import kd1.C9585g;
import l60.C99342a;
import od1.C11405h;
import od1.C11407i;
import org.json.JSONObject;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C48867bk0;
import te3.C51270sn1;
import te3.C52271zj0;
import up1.C27696y;

/* renamed from: ce1.g */
public final class C0465g extends C11407i<C51270sn1> {

    /* renamed from: A */
    public RelativeLayout f1111A;

    /* renamed from: B */
    public TextView f1112B;

    /* renamed from: C */
    public TextView f1113C;

    /* renamed from: D */
    public ProgressBar f1114D;

    /* renamed from: E */
    public RelativeLayout f1115E;

    /* renamed from: F */
    public TextView f1116F;

    /* renamed from: G */
    public WeImageView f1117G;

    /* renamed from: H */
    public TextView f1118H;

    /* renamed from: I */
    public LinearLayout f1119I;

    /* renamed from: J */
    public View f1120J;

    /* renamed from: K */
    public C104428a f1121K;

    /* renamed from: L */
    public String f1122L = "";

    /* renamed from: M */
    public String f1123M = "";

    /* renamed from: N */
    public String f1124N = "";

    /* renamed from: P */
    public int f1125P;

    /* renamed from: Q */
    public String f1126Q = "";

    /* renamed from: R */
    public long f1127R;

    /* renamed from: S */
    public boolean f1128S;

    /* renamed from: T */
    public boolean f1129T = true;

    /* renamed from: U */
    public final DecimalFormat f1130U = new DecimalFormat("0.##");

    /* renamed from: V */
    public JSONObject f1131V;

    /* renamed from: g */
    public TextView f1132g;

    /* renamed from: h */
    public TextView f1133h;

    /* renamed from: i */
    public ImageView f1134i;

    /* renamed from: j */
    public LinearLayout f1135j;

    /* renamed from: n */
    public ImageView f1136n;

    /* renamed from: o */
    public View f1137o;

    /* renamed from: p */
    public TextView f1138p;

    /* renamed from: q */
    public TextView f1139q;

    /* renamed from: r */
    public TextView f1140r;

    /* renamed from: s */
    public RelativeLayout f1141s;

    /* renamed from: t */
    public LinearLayout f1142t;

    /* renamed from: u */
    public TextView f1143u;

    /* renamed from: v */
    public WeImageView f1144v;

    /* renamed from: w */
    public ImageView f1145w;

    /* renamed from: x */
    public WeImageView f1146x;

    /* renamed from: y */
    public TextView f1147y;

    /* renamed from: z */
    public TextView f1148z;

    /* renamed from: ce1.g$a */
    public static final class C0466a extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32226l<String, C13598b0> f1149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0466a(C32226l<? super String, C13598b0> lVar) {
            super(1);
            this.f1149d = lVar;
        }

        public Object invoke(Object obj) {
            String str = (String) obj;
            C87412m.m108594g(str, "detailSuffix");
            this.f1149d.invoke(str);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ce1.g$b */
    public static final class C0467b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C0465g f1150d;

        /* renamed from: e */
        public final /* synthetic */ FinderContact f1151e;

        public C0467b(C0465g gVar, FinderContact finderContact) {
            this.f1150d = gVar;
            this.f1151e = finderContact;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$setView$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C0465g gVar = this.f1150d;
            String str = this.f1151e.username;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FirebaseAnalytics.C113379b.SOURCE, 2);
            C13598b0 b0Var = C13598b0.f38549a;
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply { put(\"source\", 2) }.toString()");
            C51270sn1 sn12 = (C51270sn1) this.f1150d.f33564d;
            C0465g.m404m3(gVar, str2, jSONObject2, sn12 != null ? sn12.f141633w : null, "link_editnote_avatar_profile", 1, 1, 0, 64, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC$setView$3$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0465g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02d9  */
    /* renamed from: k3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m403k3(ce1.C0465g r32) {
        /*
            r0 = r32
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            com.google.android.material.bottomsheet.a r3 = r0.f1121K
            if (r3 != 0) goto L_0x040a
            android.app.Activity r3 = r32.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 2131494446(0x7f0c062e, float:1.86124E38)
            r5 = 0
            r6 = 0
            android.view.View r3 = r3.inflate(r4, r5, r6)
            com.google.android.material.bottomsheet.a r4 = new com.google.android.material.bottomsheet.a
            android.app.Activity r7 = r32.getContext()
            r8 = 2131886332(0x7f1200fc, float:1.940724E38)
            r4.<init>(r7, r8)
            r0.f1121K = r4
            r4.setContentView((android.view.View) r3)
            com.google.android.material.bottomsheet.a r4 = r0.f1121K
            if (r4 == 0) goto L_0x003c
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L_0x003c
            r7 = 1053609165(0x3ecccccd, float:0.4)
            r4.setDimAmount(r7)
        L_0x003c:
            com.google.android.material.bottomsheet.a r4 = r0.f1121K
            if (r4 == 0) goto L_0x0052
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L_0x0052
            android.view.View r4 = r4.getDecorView()
            if (r4 == 0) goto L_0x0052
            r7 = 2131234749(0x7f080fbd, float:1.8085673E38)
            r4.setBackgroundResource(r7)
        L_0x0052:
            com.google.android.material.bottomsheet.a r4 = r0.f1121K
            if (r4 == 0) goto L_0x005e
            ce1.j r7 = new ce1.j
            r7.<init>(r0)
            r4.setOnDismissListener(r7)
        L_0x005e:
            if (r3 == 0) goto L_0x006a
            r4 = 2131302625(0x7f0918e1, float:1.8223341E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L_0x006b
        L_0x006a:
            r4 = r5
        L_0x006b:
            r7 = 1061997773(0x3f4ccccd, float:0.8)
            if (r4 == 0) goto L_0x0098
            android.text.TextPaint r8 = r4.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r8, r7)
            T r8 = r0.f33564d
            te3.sn1 r8 = (te3.C51270sn1) r8
            if (r8 == 0) goto L_0x008a
            te3.zj0 r8 = r8.f141633w
            if (r8 == 0) goto L_0x008a
            te3.ek0 r8 = r8.f146023y
            if (r8 == 0) goto L_0x008a
            java.lang.String r8 = r8.f132973h
            if (r8 == 0) goto L_0x008a
            goto L_0x0095
        L_0x008a:
            android.content.res.Resources r8 = r4.getResources()
            r9 = 2131826093(0x7f1115ad, float:1.928506E38)
            java.lang.String r8 = r8.getString(r9)
        L_0x0095:
            r4.setText(r8)
        L_0x0098:
            r8 = 2131302620(0x7f0918dc, float:1.8223331E38)
            android.view.View r8 = r3.findViewById(r8)
            r9 = 2131296586(0x7f09014a, float:1.8211093E38)
            android.view.View r9 = r3.findViewById(r9)
            r15 = r9
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r9 = 2131302624(0x7f0918e0, float:1.822334E38)
            android.view.View r9 = r3.findViewById(r9)
            r14 = r9
            android.widget.TextView r14 = (android.widget.TextView) r14
            r9 = 2131302621(0x7f0918dd, float:1.8223333E38)
            android.view.View r9 = r3.findViewById(r9)
            r13 = r9
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r9 = 2131302623(0x7f0918df, float:1.8223337E38)
            android.view.View r9 = r3.findViewById(r9)
            r12 = r9
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r9 = 2131302622(0x7f0918de, float:1.8223335E38)
            android.view.View r9 = r3.findViewById(r9)
            r11 = r9
            android.widget.TextView r11 = (android.widget.TextView) r11
            r9 = 2131302614(0x7f0918d6, float:1.822332E38)
            android.view.View r9 = r3.findViewById(r9)
            r10 = r9
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            r9 = 2131302618(0x7f0918da, float:1.8223327E38)
            android.view.View r9 = r3.findViewById(r9)
            T r5 = r0.f33564d
            te3.sn1 r5 = (te3.C51270sn1) r5
            if (r5 == 0) goto L_0x02fa
            te3.zj0 r5 = r5.f141633w
            if (r5 == 0) goto L_0x02fa
            te3.yj0 r5 = r5.f145995A
            if (r5 == 0) goto L_0x02fa
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r5.f145323d
            if (r5 == 0) goto L_0x02fa
            if (r8 != 0) goto L_0x0105
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r15
            goto L_0x0165
        L_0x0105:
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r16 = k20.C60958c.f173611a
            r16 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r7.mo10233c(r9)
            java.lang.Object[] r17 = r7.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC"
            java.lang.String r19 = "showBottomSheet"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r25 = r16
            r9 = r8
            r26 = r10
            r10 = r17
            r27 = r11
            r11 = r18
            r28 = r12
            r12 = r19
            r29 = r13
            r13 = r20
            r30 = r14
            r14 = r21
            r31 = r15
            r15 = r22
            r16 = r23
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r7 = r7.mo10231a(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8.setVisibility(r7)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC"
            java.lang.String r11 = "showBottomSheet"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0165:
            if (r4 != 0) goto L_0x0168
            goto L_0x016c
        L_0x0168:
            r7 = 4
            r4.setVisibility(r7)
        L_0x016c:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r4.mo10233c(r7)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC"
            java.lang.String r19 = "showBottomSheet"
            java.lang.String r20 = "()V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r25
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r4.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r7 = r25
            r7.setVisibility(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC"
            java.lang.String r18 = "showBottomSheet"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r16 = r7
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            android.text.TextPaint r4 = r30.getPaint()
            r9 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r4, r9)
            java.lang.Class<ny.h> r4 = p629ny.C76979h.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            ny.h r4 = (p629ny.C76979h) r4
            android.app.Activity r9 = r32.getContext()
            java.lang.String r10 = r5.nickname
            android.text.SpannableString r4 = r4.mo107057T1(r9, r10)
            r9 = r30
            r9.setText(r4)
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r9 = r4.mo62446e(r2)
            bl3.c r9 = r9.mo62447c(r1)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11872i2()
            pl1.f r10 = new pl1.f
            java.lang.String r11 = r5.headUrl
            r12 = 2
            r13 = 0
            r10.<init>(r11, r13, r12, r13)
            java.lang.String r11 = "dialogNoteAvatar"
            r14 = r31
            gy3.C87412m.m108593f(r14, r11)
            pl1.e0$a r11 = pl1.C11978e0.C11979a.AVATAR
            bl3.r$a r2 = r4.mo62446e(r2)
            bl3.c r1 = r2.mo62447c(r1)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r11)
            r9.mo85957c(r10, r14, r1)
            kd1.f r15 = kd1.C9584f.f29822a
            android.app.Activity r16 = r32.getContext()
            r18 = 0
            r19 = 2
            r20 = 131(0x83, float:1.84E-43)
            r21 = 0
            r22 = 0
            r23 = 96
            r24 = 0
            java.lang.String r17 = "link_editnote_avatar_profile"
            kd1.C9584f.m9265b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            ce1.k r1 = new ce1.k
            r1.<init>(r0, r5)
            r14.setOnClickListener(r1)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r5.authInfo
            if (r1 == 0) goto L_0x022f
            int r1 = r1.authIconType
            goto L_0x0230
        L_0x022f:
            r1 = 0
        L_0x0230:
            if (r1 <= 0) goto L_0x02f0
            r9 = r29
            r9.setVisibility(r6)
            java.lang.Class<tf0.p1> r1 = tf0.C64916p1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            java.lang.String r2 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            r16 = r1
            tf0.p1 r16 = (tf0.C64916p1) r16
            java.lang.String r1 = "dialogNoteIcon"
            r9 = r28
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r5.authInfo
            r19 = 0
            r20 = 0
            r21 = 12
            r22 = 0
            r17 = r9
            r18 = r1
            tf0.C64916p1.C64917a.m76444k(r16, r17, r18, r19, r20, r21, r22)
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r1 = r5.authInfo
            java.lang.String r2 = "dialogNoteDesc"
            r4 = r27
            gy3.C87412m.m108593f(r4, r2)
            java.lang.String r2 = "dialogNoteGuarantee"
            r5 = r26
            gy3.C87412m.m108593f(r5, r2)
            if (r1 == 0) goto L_0x02e1
            int r2 = r1.authIconType
            java.lang.String r10 = "context.resources.getStr….finder_contact_auth, it)"
            r11 = 2131826337(0x7f1116a1, float:1.9285556E38)
            r13 = 1
            if (r2 == r13) goto L_0x02af
            if (r2 == r12) goto L_0x0296
            r1 = 100
            if (r2 == r1) goto L_0x0281
            goto L_0x02c8
        L_0x0281:
            android.app.Activity r1 = r32.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131826807(0x7f111877, float:1.9286509E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "context.resources.getStr…ing.finder_has_real_name)"
            gy3.C87412m.m108593f(r1, r2)
            goto L_0x02ca
        L_0x0296:
            java.lang.String r1 = r1.authProfession
            if (r1 == 0) goto L_0x02c8
            android.app.Activity r2 = r32.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r6] = r1
            java.lang.String r1 = r2.getString(r11, r13)
            gy3.C87412m.m108593f(r1, r10)
            goto L_0x02ca
        L_0x02af:
            r12 = 1
            java.lang.String r1 = r1.authProfession
            if (r1 == 0) goto L_0x02c8
            android.app.Activity r2 = r32.getContext()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r6] = r1
            java.lang.String r1 = r2.getString(r11, r13)
            gy3.C87412m.m108593f(r1, r10)
            goto L_0x02ca
        L_0x02c8:
            java.lang.String r1 = ""
        L_0x02ca:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x02d9
            r4.setVisibility(r6)
            r4.setText(r1)
            r1 = 8
            goto L_0x02de
        L_0x02d9:
            r1 = 8
            r4.setVisibility(r1)
        L_0x02de:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x02e4
        L_0x02e1:
            r1 = 8
            r2 = r13
        L_0x02e4:
            if (r2 != 0) goto L_0x02f7
            r9.setVisibility(r1)
            r4.setVisibility(r1)
            r5.setVisibility(r1)
            goto L_0x02f7
        L_0x02f0:
            r9 = r29
            r1 = 8
            r9.setVisibility(r1)
        L_0x02f7:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            goto L_0x02fd
        L_0x02fa:
            r7 = r9
            r13 = 0
            r5 = r13
        L_0x02fd:
            if (r5 != 0) goto L_0x0346
            if (r8 != 0) goto L_0x0302
            goto L_0x0346
        L_0x0302:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r4)
            java.lang.Object[] r10 = r1.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC"
            java.lang.String r12 = "showBottomSheet"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r8
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r1 = r1.mo10231a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.setVisibility(r1)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC"
            java.lang.String r11 = "showBottomSheet"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0346:
            r1 = 2131302619(0x7f0918db, float:1.822333E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0356
            java.lang.String r2 = r0.f1124N
            r1.setText(r2)
        L_0x0356:
            if (r7 == 0) goto L_0x0360
            ce1.l r1 = new ce1.l
            r1.<init>(r0)
            r7.setOnClickListener(r1)
        L_0x0360:
            r1 = 2131296552(0x7f090128, float:1.8211024E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x040a
            android.app.Activity r2 = r32.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131826049(0x7f111581, float:1.9284971E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "context.resources.getStr…r_activity_announce_name)"
            gy3.C87412m.m108593f(r2, r3)
            android.app.Activity r3 = r32.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131826232(0x7f111638, float:1.9285343E38)
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r7[r6] = r2
            java.lang.String r3 = r3.getString(r4, r7)
            java.lang.String r4 = "context.resources.getStr…n_announce, announceName)"
            gy3.C87412m.m108593f(r3, r4)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r3)
            com.tencent.mm.plugin.finder.view.g5 r7 = new com.tencent.mm.plugin.finder.view.g5
            android.app.Activity r8 = r32.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131100949(0x7f060515, float:1.7814294E38)
            int r10 = r8.getColor(r9)
            android.app.Activity r8 = r32.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r11 = r8.getColor(r9)
            r12 = 0
            r13 = 0
            ce1.m r14 = new ce1.m
            r14.<init>(r0)
            r8 = r7
            r9 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            int r8 = r3.length()
            int r2 = r2.length()
            int r8 = r8 - r2
            int r2 = r3.length()
            r3 = 17
            r4.setSpan(r7, r8, r2, r3)
            de3.a0 r2 = new de3.a0
            android.app.Activity r3 = r32.getContext()
            r2.<init>(r3)
            r1.setOnTouchListener(r2)
            r1.setText(r4)
            T r2 = r0.f33564d
            te3.sn1 r2 = (te3.C51270sn1) r2
            if (r2 == 0) goto L_0x03fe
            te3.zj0 r2 = r2.f141633w
            if (r2 == 0) goto L_0x03fe
            te3.ek0 r2 = r2.f146023y
            if (r2 == 0) goto L_0x03fe
            boolean r2 = r2.f132974i
            if (r2 != 0) goto L_0x03fe
            r7 = 1
            goto L_0x03ff
        L_0x03fe:
            r7 = 0
        L_0x03ff:
            if (r7 != 0) goto L_0x0405
            r1.setVisibility(r6)
            goto L_0x040a
        L_0x0405:
            r2 = 8
            r1.setVisibility(r2)
        L_0x040a:
            com.google.android.material.bottomsheet.a r0 = r0.f1121K
            if (r0 == 0) goto L_0x0411
            r0.show()
        L_0x0411:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0465g.m403k3(ce1.g):void");
    }

    /* renamed from: m3 */
    public static /* synthetic */ void m404m3(C0465g gVar, String str, String str2, C52271zj0 zj02, String str3, int i, int i2, int i3, int i4, Object obj) {
        String str4 = "";
        String str5 = (i4 & 2) != 0 ? str4 : str2;
        C52271zj0 zj03 = (i4 & 4) != 0 ? null : zj02;
        if ((i4 & 8) == 0) {
            str4 = str3;
        }
        int i5 = 0;
        int i6 = (i4 & 16) != 0 ? 0 : i;
        int i7 = (i4 & 32) != 0 ? 0 : i2;
        if ((i4 & 64) == 0) {
            i5 = i3;
        }
        gVar.mo516l3(str, str5, zj03, str4, i6, i7, i5);
    }

    /* renamed from: F3 */
    public final void mo510F3(int i, int i2) {
        TextView textView = this.f1118H;
        if (textView != null) {
            textView.setTextColor(i2);
        }
        TextView textView2 = this.f1133h;
        if (textView2 != null) {
            textView2.setTextColor(i2);
        }
        TextView textView3 = this.f1140r;
        if (textView3 != null) {
            textView3.setTextColor(i2);
        }
        TextView textView4 = this.f1138p;
        if (textView4 != null) {
            textView4.setTextColor(i2);
        }
        WeImageView weImageView = this.f1117G;
        if (weImageView != null) {
            weImageView.setIconColor(i2);
        }
        TextView textView5 = this.f1139q;
        if (textView5 != null) {
            textView5.setTextColor(i);
        }
        TextView textView6 = this.f1140r;
        if (textView6 != null) {
            textView6.setTextColor(i2);
        }
        TextView textView7 = this.f1147y;
        if (textView7 != null) {
            textView7.setTextColor(i);
        }
        TextView textView8 = this.f1148z;
        if (textView8 != null) {
            textView8.setTextColor(i2);
        }
        TextView textView9 = this.f1112B;
        if (textView9 != null) {
            textView9.setTextColor(i);
        }
        TextView textView10 = this.f1113C;
        if (textView10 != null) {
            textView10.setTextColor(i2);
        }
        TextView textView11 = this.f1116F;
        if (textView11 != null) {
            textView11.setTextColor(i);
        }
        TextView textView12 = this.f1143u;
        if (textView12 != null) {
            textView12.setTextColor(i2);
        }
        WeImageView weImageView2 = this.f1144v;
        if (weImageView2 != null) {
            weImageView2.setIconColor(i2);
        }
        WeImageView weImageView3 = this.f1146x;
        if (weImageView3 != null) {
            weImageView3.setIconColor(i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0205  */
    /* renamed from: G3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo511G3() {
        /*
            r34 = this;
            r6 = r34
            pl1.e0$a r7 = pl1.C11978e0.C11979a.AVATAR
            java.lang.Class<ny.h> r8 = p629ny.C76979h.class
            java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
            java.lang.Class<pl1.s0> r10 = pl1.C11990s0.class
            android.widget.TextView r0 = r6.f1118H
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0011
            goto L_0x0027
        L_0x0011:
            di3.d r2 = di3.C86312j.m106911c(r8)
            ny.h r2 = (p629ny.C76979h) r2
            android.app.Activity r3 = r34.getContext()
            java.lang.String r4 = r6.f1122L
            if (r4 != 0) goto L_0x0020
            r4 = r1
        L_0x0020:
            android.text.SpannableString r2 = r2.mo107057T1(r3, r4)
            r0.setText(r2)
        L_0x0027:
            android.widget.TextView r0 = r6.f1132g
            if (r0 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            java.lang.String r2 = r6.f1123M
            r0.setText(r2)
        L_0x0031:
            boolean r0 = od1.C11405h.C11406a.m11253a(r34)
            android.widget.TextView r2 = r6.f1132g
            if (r2 == 0) goto L_0x0043
            android.text.TextPaint r2 = r2.getPaint()
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r3)
        L_0x0043:
            android.widget.ImageView r2 = r6.f1134i
            java.lang.String r3 = r6.f1126Q
            if (r3 != 0) goto L_0x004a
            r3 = r1
        L_0x004a:
            r11 = 2
            r12 = 0
            if (r2 == 0) goto L_0x007a
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x007a
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62446e(r9)
            bl3.c r5 = r5.mo62447c(r10)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11872i2()
            pl1.f r13 = new pl1.f
            r13.<init>(r3, r12, r11, r12)
            bl3.r$a r3 = r4.mo62446e(r9)
            bl3.c r3 = r3.mo62447c(r10)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r3 = r3.mo11867O2(r7)
            r5.mo85957c(r13, r2, r3)
        L_0x007a:
            android.widget.TextView r2 = r6.f1133h
            r14 = 1
            r15 = 0
            if (r2 == 0) goto L_0x032e
            java.lang.String r3 = r6.f1124N
            if (r3 == 0) goto L_0x008d
            int r3 = r3.length()
            if (r3 != 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r3 = 0
            goto L_0x008e
        L_0x008d:
            r3 = 1
        L_0x008e:
            if (r3 == 0) goto L_0x0092
            goto L_0x032e
        L_0x0092:
            r2.setVisibility(r15)
            T r3 = r6.f33564d
            te3.sn1 r3 = (te3.C51270sn1) r3
            if (r3 == 0) goto L_0x00a7
            te3.zj0 r3 = r3.f141633w
            if (r3 == 0) goto L_0x00a7
            te3.ek0 r3 = r3.f146023y
            if (r3 == 0) goto L_0x00a7
            java.lang.String r3 = r3.f132970e
            if (r3 != 0) goto L_0x00a8
        L_0x00a7:
            r3 = r1
        L_0x00a8:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 != 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = r6.f1124N
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L_0x00db
        L_0x00c0:
            android.content.res.Resources r3 = r2.getResources()
            r4 = 2131826095(0x7f1115af, float:1.9285065E38)
            java.lang.Object[] r5 = new java.lang.Object[r14]
            java.lang.String r13 = r6.f1124N
            if (r13 != 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r1 = r13
        L_0x00cf:
            r5[r15] = r1
            java.lang.String r1 = r3.getString(r4, r5)
            java.lang.String r3 = "{\n                resour…Desc ?: \"\")\n            }"
            gy3.C87412m.m108593f(r1, r3)
        L_0x00db:
            java.lang.String r3 = "\n"
            boolean r3 = z04.C112551y.m153808h(r1, r3, r15, r11, r12)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            if (r3 == 0) goto L_0x00f2
            int r3 = r1.length()
            int r3 = r3 - r14
            java.lang.String r1 = r1.substring(r15, r3)
            gy3.C87412m.m108593f(r1, r4)
        L_0x00f2:
            er1.m3 r3 = er1.C7832m3.f26372a
            java.lang.String r1 = r3.mo8936b(r1)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r3 != 0) goto L_0x030f
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            android.app.Activity r5 = r34.getContext()
            android.view.WindowManager r5 = r5.getWindowManager()
            android.view.Display r5 = r5.getDefaultDisplay()
            r5.getMetrics(r3)
            int r3 = r3.widthPixels
            android.app.Activity r5 = r34.getContext()
            r13 = 2131165355(0x7f0700ab, float:1.7944925E38)
            int r5 = kg3.C76577a.m92155f(r5, r13)
            int r3 = r3 - r5
            android.text.TextPaint r5 = r2.getPaint()
            if (r0 == 0) goto L_0x0136
            android.app.Activity r0 = r34.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r13 = 2131099704(0x7f060038, float:1.7811769E38)
            int r0 = r0.getColor(r13)
            goto L_0x0145
        L_0x0136:
            android.app.Activity r0 = r34.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r13 = 2131099800(0x7f060098, float:1.7811963E38)
            int r0 = r0.getColor(r13)
        L_0x0145:
            r13 = r0
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r18 = 0
            int r19 = r1.length()
            android.text.Layout$Alignment r22 = android.text.Layout.Alignment.ALIGN_NORMAL
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 1
            r16 = r0
            r17 = r1
            r20 = r5
            r21 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r12 = r0.getLineCount()
            r14 = 32
            if (r12 > r11) goto L_0x0255
            T r3 = r6.f33564d
            te3.sn1 r3 = (te3.C51270sn1) r3
            if (r3 == 0) goto L_0x0176
            te3.zj0 r4 = r3.f141633w
            if (r4 == 0) goto L_0x0176
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f146024z
            goto L_0x0177
        L_0x0176:
            r4 = 0
        L_0x0177:
            if (r4 != 0) goto L_0x018c
            if (r3 == 0) goto L_0x0186
            te3.zj0 r3 = r3.f141633w
            if (r3 == 0) goto L_0x0186
            te3.yj0 r3 = r3.f145995A
            if (r3 == 0) goto L_0x0186
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r3.f145323d
            goto L_0x0187
        L_0x0186:
            r3 = 0
        L_0x0187:
            if (r3 == 0) goto L_0x018a
            goto L_0x018c
        L_0x018a:
            r3 = 0
            goto L_0x018d
        L_0x018c:
            r3 = 1
        L_0x018d:
            if (r3 == 0) goto L_0x0205
            int r3 = r0.getLineCount()
            if (r3 != r11) goto L_0x019a
            int r0 = r0.getLineEnd(r15)
            goto L_0x019b
        L_0x019a:
            r0 = 0
        L_0x019b:
            android.text.TextPaint r3 = r2.getPaint()
            int r4 = r1.length()
            java.lang.CharSequence r0 = r1.subSequence(r0, r4)
            java.lang.String r0 = r0.toString()
            float r0 = r3.measureText(r0)
            android.app.Activity r3 = r34.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131166429(0x7f0704dd, float:1.7947103E38)
            float r3 = r3.getDimension(r4)
            float r0 = r0 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            int r4 = (int) r0
            ce1.h r5 = new ce1.h
            r5.<init>(r6)
            r0 = r34
            r1 = r2
            r2 = r3
            r3 = r13
            r0.mo518o3(r1, r2, r3, r4, r5)
            T r0 = r6.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            if (r0 == 0) goto L_0x032e
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x032e
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.f146024z
            if (r0 == 0) goto L_0x032e
            kd1.f r16 = kd1.C9584f.f29822a
            android.app.Activity r17 = r34.getContext()
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 120(0x78, float:1.68E-43)
            r25 = 0
            java.lang.String r18 = "feed_jumpicon"
            kd1.C9584f.m9265b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x032e
        L_0x0205:
            r2.setText(r1)
            android.view.View r0 = r6.f1120J
            if (r0 != 0) goto L_0x020e
            goto L_0x032e
        L_0x020e:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC"
            java.lang.String r29 = "setSuffixedDesc"
            java.lang.String r30 = "(Ljava/lang/String;ILandroid/widget/TextView;Z)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r0
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            java.lang.Object r1 = r1.mo10231a(r15)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC"
            java.lang.String r28 = "setSuffixedDesc"
            java.lang.String r29 = "(Ljava/lang/String;ILandroid/widget/TextView;Z)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x032e
        L_0x0255:
            r12 = 1
            int r19 = r0.getLineEnd(r12)
            int r18 = r0.getLineEnd(r15)
            android.app.Activity r0 = r34.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r12 = 2131166448(0x7f0704f0, float:1.7947142E38)
            float r0 = r0.getDimension(r12)
            int r0 = (int) r0
            android.content.Context r12 = r2.getContext()
            r11 = 2131826454(0x7f111716, float:1.9285793E38)
            java.lang.String r11 = r12.getString(r11)
            java.lang.String r12 = "textView.context.getStri….finder_desc_suffix_text)"
            gy3.C87412m.m108593f(r11, r12)
            android.text.TextPaint r12 = r2.getPaint()
            float r12 = r12.measureText(r11)
            float r3 = (float) r3
            float r12 = r3 - r12
            float r0 = (float) r0
            float r12 = r12 - r0
            android.text.StaticLayout r0 = new android.text.StaticLayout
            int r12 = (int) r12
            android.text.Layout$Alignment r22 = android.text.Layout.Alignment.ALIGN_NORMAL
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 1
            r16 = r0
            r17 = r1
            r20 = r5
            r21 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            int r5 = r0.getLineCount()
            if (r5 <= 0) goto L_0x032e
            int r0 = r0.getLineEnd(r15)
            int r5 = r0 + -1
            char r12 = r1.charAt(r5)
            r14 = 10
            if (r12 != r14) goto L_0x02d2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.substring(r15, r5)
            gy3.C87412m.m108593f(r1, r4)
            r0.append(r1)
            r0.append(r11)
            r5 = 32
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            goto L_0x02ed
        L_0x02d2:
            r5 = 32
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = r1.substring(r15, r0)
            gy3.C87412m.m108593f(r0, r4)
            r12.append(r0)
            r12.append(r11)
            r12.append(r5)
            java.lang.String r0 = r12.toString()
        L_0x02ed:
            r4 = r0
            android.app.Activity r0 = r34.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131166451(0x7f0704f3, float:1.7947148E38)
            float r0 = r0.getDimension(r1)
            float r3 = r3 - r0
            int r5 = (int) r3
            ce1.i r11 = new ce1.i
            r11.<init>(r6)
            r0 = r34
            r1 = r2
            r2 = r4
            r3 = r13
            r4 = r5
            r5 = r11
            r0.mo518o3(r1, r2, r3, r4, r5)
            goto L_0x032e
        L_0x030f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "desc "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", maxLineNum:"
            r0.append(r1)
            r1 = 2
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x032e:
            T r0 = r6.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            r1 = 0
            if (r0 == 0) goto L_0x033d
            te3.zj0 r3 = r0.f141633w
            if (r3 == 0) goto L_0x033d
            long r3 = r3.f146018t
            goto L_0x033e
        L_0x033d:
            r3 = r1
        L_0x033e:
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0385
            er1.w3 r5 = er1.C58784w3.f168295a
            if (r0 == 0) goto L_0x034c
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x034c
            long r1 = r0.f146022x
        L_0x034c:
            r5.getClass()
            r11 = 2
            long r0 = r1 & r11
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x0359
            r14 = 1
            goto L_0x035a
        L_0x0359:
            r14 = 0
        L_0x035a:
            if (r14 != 0) goto L_0x035d
            goto L_0x0385
        L_0x035d:
            android.widget.TextView r0 = r6.f1139q
            if (r0 != 0) goto L_0x0362
            goto L_0x0365
        L_0x0362:
            r0.setVisibility(r15)
        L_0x0365:
            android.widget.TextView r0 = r6.f1140r
            if (r0 != 0) goto L_0x036a
            goto L_0x036d
        L_0x036a:
            r0.setVisibility(r15)
        L_0x036d:
            android.widget.TextView r0 = r6.f1140r
            if (r0 != 0) goto L_0x0372
            goto L_0x039e
        L_0x0372:
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            android.app.Activity r1 = r34.getContext()
            r2 = 2131826235(0x7f11163b, float:1.9285349E38)
            java.lang.String r1 = r5.mo83865E(r3, r1, r2)
            r0.setText(r1)
            goto L_0x039e
        L_0x0385:
            java.lang.String r0 = "FinderActivityEventUIC"
            java.lang.String r1 = "no endTime"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.widget.TextView r0 = r6.f1139q
            r1 = 8
            if (r0 != 0) goto L_0x0393
            goto L_0x0396
        L_0x0393:
            r0.setVisibility(r1)
        L_0x0396:
            android.widget.TextView r0 = r6.f1140r
            if (r0 != 0) goto L_0x039b
            goto L_0x039e
        L_0x039b:
            r0.setVisibility(r1)
        L_0x039e:
            T r0 = r6.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            if (r0 == 0) goto L_0x0422
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x0422
            te3.yj0 r0 = r0.f145995A
            if (r0 == 0) goto L_0x0422
            com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f145323d
            if (r0 == 0) goto L_0x0422
            android.widget.LinearLayout r1 = r6.f1135j
            if (r1 != 0) goto L_0x03b5
            goto L_0x03b8
        L_0x03b5:
            r1.setVisibility(r15)
        L_0x03b8:
            kd1.f r16 = kd1.C9584f.f29822a
            android.app.Activity r17 = r34.getContext()
            r19 = 0
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 112(0x70, float:1.57E-43)
            r25 = 0
            java.lang.String r18 = "link_editnote_avatar_profile"
            kd1.C9584f.m9265b(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            android.widget.ImageView r1 = r6.f1136n
            if (r1 == 0) goto L_0x0407
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r3 = r2.mo62446e(r9)
            bl3.c r3 = r3.mo62447c(r10)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11872i2()
            pl1.f r4 = new pl1.f
            java.lang.String r5 = r0.headUrl
            r11 = 2
            r12 = 0
            r4.<init>(r5, r12, r11, r12)
            bl3.r$a r2 = r2.mo62446e(r9)
            bl3.c r2 = r2.mo62447c(r10)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r7)
            r3.mo85957c(r4, r1, r2)
            ce1.g$b r2 = new ce1.g$b
            r2.<init>(r6, r0)
            r1.setOnClickListener(r2)
        L_0x0407:
            android.widget.TextView r1 = r6.f1138p
            if (r1 != 0) goto L_0x040c
            goto L_0x041f
        L_0x040c:
            di3.d r2 = di3.C86312j.m106911c(r8)
            ny.h r2 = (p629ny.C76979h) r2
            android.app.Activity r3 = r34.getContext()
            java.lang.String r0 = r0.nickname
            android.text.SpannableString r0 = r2.mo107057T1(r3, r0)
            r1.setText(r0)
        L_0x041f:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            goto L_0x0423
        L_0x0422:
            r12 = 0
        L_0x0423:
            if (r12 != 0) goto L_0x042f
            android.widget.LinearLayout r0 = r6.f1135j
            if (r0 != 0) goto L_0x042a
            goto L_0x042f
        L_0x042a:
            r1 = 8
            r0.setVisibility(r1)
        L_0x042f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0465g.mo511G3():void");
    }

    /* renamed from: I3 */
    public final void mo512I3(C52271zj0 zj02, FinderJumpInfo finderJumpInfo) {
        C52271zj0 zj03 = zj02;
        FinderJumpInfo finderJumpInfo2 = finderJumpInfo;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (finderJumpInfo2 != null) {
            Log.m105924i("FinderActivityEventUIC", "showJumpView by jumpInfo");
            if (!Util.isNullOrNil(finderJumpInfo2.wording)) {
                LinearLayout linearLayout = this.f1142t;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                RelativeLayout relativeLayout = this.f1141s;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
                TextView textView = this.f1143u;
                if (textView != null) {
                    textView.setText(finderJumpInfo2.wording);
                }
                WeImageView weImageView = this.f1144v;
                if (weImageView != null) {
                    weImageView.setVisibility(8);
                }
                ImageView imageView = this.f1145w;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                ImageView imageView2 = this.f1145w;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    ((C99342a) ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(finderJumpInfo2.icon_url, C27696y.THUMB_IMAGE), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.LINK_THUMB))).mo85954d(imageView2);
                }
                C9584f.m9265b(C9584f.f29822a, getContext(), "feed_jumpicon", 0, 0, 0, (C52271zj0) null, (C9585g.C9586a) null, 120, (Object) null);
                return;
            }
            LinearLayout linearLayout2 = this.f1142t;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } else if (!Util.isNullOrNil(zj03.f146014p)) {
            LinearLayout linearLayout3 = this.f1142t;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
            RelativeLayout relativeLayout2 = this.f1141s;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            TextView textView2 = this.f1143u;
            if (textView2 != null) {
                textView2.setText(zj03.f146016r);
            }
            WeImageView weImageView2 = this.f1144v;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            ImageView imageView3 = this.f1145w;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            C9584f.m9265b(C9584f.f29822a, getContext(), "link_miniprogram", 0, 0, 0, (C52271zj0) null, (C9585g.C9586a) null, 120, (Object) null);
        } else {
            LinearLayout linearLayout4 = this.f1142t;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
        }
    }

    /* renamed from: c2 */
    public void mo513c2() {
        TextView textView = this.f1132g;
        if (textView != null) {
            textView.setTextColor(getContext().getResources().getColor(C0966R.color.f2975b6));
        }
        mo510F3(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5), getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
        View view = this.f1137o;
        if (view != null) {
            view.setBackgroundColor(getContext().getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        }
        RelativeLayout relativeLayout = this.f1115E;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(C0966R.C0969drawable.cng);
        }
        ProgressBar progressBar = this.f1114D;
        if (progressBar != null) {
            progressBar.setProgressDrawable(getContext().getResources().getDrawable(C0966R.C0969drawable.cmf));
        }
        LinearLayout linearLayout = this.f1142t;
        if (linearLayout != null) {
            linearLayout.setBackground(getContext().getResources().getDrawable(C0966R.C0969drawable.cng));
        }
    }

    /* renamed from: c3 */
    public void mo498c3(int i, String str) {
        FrameLayout frameLayout = this.f33565e;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    /* renamed from: e3 */
    public void mo514e3() {
        super.mo514e3();
        Intent intent = getContext().getIntent();
        this.f1122L = intent.getStringExtra("key_nick_name");
        this.f1123M = intent.getStringExtra("key_activity_name");
        this.f1124N = intent.getStringExtra("key_activity_desc");
        this.f1126Q = intent.getStringExtra("key_avatar_url");
        this.f1125P = intent.getIntExtra("key_activity_participate_count", 0);
        this.f1127R = intent.getLongExtra("key_activity_id", 0);
    }

    /* renamed from: f3 */
    public void mo314f3() {
        super.mo314f3();
        FrameLayout frameLayout = this.f33565e;
        if (frameLayout != null) {
            this.f1132g = (TextView) frameLayout.findViewById(C0966R.C0970id.f5525he);
            this.f1119I = (LinearLayout) frameLayout.findViewById(C0966R.C0970id.f357786br1);
            this.f1133h = (TextView) frameLayout.findViewById(C0966R.C0970id.f5507h1);
            this.f1134i = (ImageView) frameLayout.findViewById(C0966R.C0970id.f5506h0);
            TextView textView = (TextView) frameLayout.findViewById(C0966R.C0970id.f5512h6);
            if (textView != null) {
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
            } else {
                textView = null;
            }
            this.f1118H = textView;
            TextView textView2 = this.f1133h;
            if (textView2 != null) {
                textView2.setOnTouchListener(new C75355a0(textView2.getContext()));
            }
            this.f1139q = (TextView) frameLayout.findViewById(C0966R.C0970id.dzd);
            this.f1140r = (TextView) frameLayout.findViewById(C0966R.C0970id.f5503gx);
            this.f1142t = (LinearLayout) getContext().findViewById(C0966R.C0970id.due);
            this.f1143u = (TextView) getContext().findViewById(C0966R.C0970id.e0s);
            this.f1144v = (WeImageView) getContext().findViewById(C0966R.C0970id.e0r);
            this.f1145w = (ImageView) getContext().findViewById(C0966R.C0970id.dw8);
            this.f1146x = (WeImageView) getContext().findViewById(C0966R.C0970id.odk);
            this.f1141s = (RelativeLayout) getContext().findViewById(C0966R.C0970id.dv4);
            this.f1147y = (TextView) getContext().findViewById(C0966R.C0970id.f357447dc1);
            this.f1148z = (TextView) getContext().findViewById(C0966R.C0970id.f357446dc0);
            this.f1111A = (RelativeLayout) getContext().findViewById(C0966R.C0970id.duk);
            this.f1112B = (TextView) getContext().findViewById(C0966R.C0970id.duw);
            this.f1113C = (TextView) getContext().findViewById(C0966R.C0970id.duv);
            this.f1114D = (ProgressBar) getContext().findViewById(C0966R.C0970id.dua);
            this.f1115E = (RelativeLayout) getContext().findViewById(C0966R.C0970id.nti);
            this.f1116F = (TextView) getContext().findViewById(C0966R.C0970id.ntj);
            this.f1117G = (WeImageView) getContext().findViewById(C0966R.C0970id.e4n);
            RelativeLayout relativeLayout = this.f1115E;
            if (relativeLayout != null) {
                relativeLayout.setOnClickListener(new C0458d(this));
            }
            LinearLayout linearLayout = this.f1142t;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new C0460e(this));
            }
            ImageView imageView = this.f1134i;
            if (imageView != null) {
                imageView.setOnClickListener(new C0463f(this));
            }
            this.f1120J = getContext().findViewById(C0966R.C0970id.f5510h4);
            this.f1135j = (LinearLayout) getContext().findViewById(C0966R.C0970id.f5513h7);
            this.f1136n = (ImageView) getContext().findViewById(C0966R.C0970id.f5514h8);
            this.f1138p = (TextView) getContext().findViewById(C0966R.C0970id.f5516h_);
            this.f1137o = getContext().findViewById(C0966R.C0970id.f5515h9);
            mo511G3();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r10 = r10.f141633w;
     */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo515i3(pe3.C47465a r10) {
        /*
            r9 = this;
            te3.sn1 r10 = (te3.C51270sn1) r10
            super.mo515i3(r10)
            boolean r0 = r9.f1128S
            if (r0 != 0) goto L_0x000f
            r9.mo517n3()
            r0 = 1
            r9.f1128S = r0
        L_0x000f:
            java.lang.Class<dp1.y0> r0 = dp1.C58417y0.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            r1 = r0
            dp1.y0 r1 = (dp1.C58417y0) r1
            r2 = 1
            r4 = 1
            if (r10 == 0) goto L_0x0025
            te3.zj0 r10 = r10.f141633w
            if (r10 == 0) goto L_0x0025
            long r6 = r10.f146005d
            goto L_0x0027
        L_0x0025:
            r6 = 0
        L_0x0027:
            rs1.s8$a r10 = rs1.C13442s8.f38060Q0
            android.app.Activity r0 = r9.getContext()
            rs1.s8 r10 = r10.mo12873f(r0)
            if (r10 == 0) goto L_0x0038
            te3.hj1 r10 = r10.mo12861q3()
            goto L_0x0039
        L_0x0038:
            r10 = 0
        L_0x0039:
            r8 = r10
            r1.Ay0(r2, r4, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0465g.mo515i3(pe3.a):void");
    }

    /* renamed from: j3 */
    public void mo315j3() {
        C52271zj0 zj02;
        C11405h.C11406a.m11254b(this);
        C51270sn1 sn12 = (C51270sn1) this.f33564d;
        if (sn12 != null && (zj02 = sn12.f141633w) != null) {
            this.f1123M = zj02.f146007f;
            this.f1124N = zj02.f146008g;
            this.f1125P = sn12 != null ? sn12.f141619f : 0;
            this.f1127R = zj02.f146005d;
            FinderContact finderContact = zj02.f146006e;
            C13598b0 b0Var = null;
            this.f1122L = finderContact != null ? finderContact.nickname : null;
            this.f1126Q = finderContact != null ? finderContact.headUrl : null;
            Log.m105924i("FinderActivityEventUIC", "avatarUrl: " + this.f1126Q + " activityParticipateCount:" + this.f1125P + " coverUrl:" + getCoverImgUrl() + " nickName:" + this.f1122L + " activityParticipateCount:" + this.f1125P + " displayMask:" + zj02.f146022x);
            if (C58784w3.f168295a.mo83908W0(zj02.f146022x)) {
                LinearLayout linearLayout = this.f1119I;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout2 = this.f1119I;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
            }
            mo511G3();
            FinderJumpInfo finderJumpInfo = zj02.f146020v;
            if (finderJumpInfo != null) {
                if (finderJumpInfo.business_type == 17) {
                    Log.m105924i("FinderActivityEventUIC", "showJumpView by jumpInfo");
                    if (!Util.isNullOrNil(finderJumpInfo.wording)) {
                        RelativeLayout relativeLayout = this.f1141s;
                        if (relativeLayout != null) {
                            relativeLayout.setVisibility(0);
                        }
                        LinearLayout linearLayout3 = this.f1142t;
                        if (linearLayout3 != null) {
                            linearLayout3.setVisibility(8);
                        }
                        C9584f.m9265b(C9584f.f29822a, getContext(), "feed_jumpicon", 0, 0, 0, (C52271zj0) null, (C9585g.C9586a) null, 120, (Object) null);
                    } else {
                        RelativeLayout relativeLayout2 = this.f1141s;
                        if (relativeLayout2 != null) {
                            relativeLayout2.setVisibility(8);
                        }
                    }
                    C48867bk0 bk02 = zj02.f146004J;
                    if (bk02 != null) {
                        ProgressBar progressBar = this.f1114D;
                        if (progressBar != null) {
                            progressBar.setProgress(bk02.f131161e / 100);
                        }
                        RelativeLayout relativeLayout3 = this.f1111A;
                        if (relativeLayout3 != null) {
                            relativeLayout3.setVisibility(0);
                        }
                        TextView textView = this.f1113C;
                        if (textView != null) {
                            StringBuilder sb = new StringBuilder();
                            DecimalFormat decimalFormat = this.f1130U;
                            C48867bk0 bk03 = zj02.f146004J;
                            sb.append(decimalFormat.format(Float.valueOf(((float) (bk03 != null ? bk03.f131161e : 0)) / 100.0f)));
                            sb.append('%');
                            textView.setText(sb.toString());
                        }
                        C48867bk0 bk04 = zj02.f146004J;
                        long j = 0;
                        if (!(bk04 != null && bk04.f131160d == 0)) {
                            C48867bk0 bk05 = zj02.f146004J;
                            if (bk05 != null) {
                                j = bk05.f131160d;
                            }
                            BigDecimal divide = new BigDecimal(j).divide(new BigDecimal(100));
                            this.f1130U.setRoundingMode(RoundingMode.DOWN);
                            TextView textView2 = this.f1148z;
                            if (textView2 != null) {
                                textView2.setText("¥ " + this.f1130U.format(divide.doubleValue()));
                            }
                            TextView textView3 = this.f1148z;
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                            }
                            TextView textView4 = this.f1147y;
                            if (textView4 != null) {
                                textView4.setVisibility(0);
                            }
                        }
                    } else {
                        RelativeLayout relativeLayout4 = this.f1111A;
                        if (relativeLayout4 != null) {
                            relativeLayout4.setVisibility(8);
                        }
                        TextView textView5 = this.f1148z;
                        if (textView5 != null) {
                            textView5.setVisibility(8);
                        }
                        TextView textView6 = this.f1147y;
                        if (textView6 != null) {
                            textView6.setVisibility(8);
                        }
                    }
                } else {
                    mo512I3(zj02, finderJumpInfo);
                }
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                mo512I3(zj02, zj02.f146020v);
            }
        }
    }

    /* renamed from: l3 */
    public final void mo516l3(String str, String str2, C52271zj0 zj02, String str3, int i, int i2, int i3) {
        String str4 = str;
        String str5 = str2;
        Activity context = getContext();
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str4, "username");
        C87412m.m108594g(str5, "kv");
        C87412m.m108594g(str3, "eid");
        Intent intent = new Intent();
        intent.putExtra("finder_username", str4);
        intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
        intent.putExtra("key_udf_kv", str5);
        Activity activity = context;
        C13442s8.C13443a.m12791e(C13442s8.f38060Q0, activity, intent, 0, (String) null, 0, 1, false, 0, 192, (Object) null);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo13272V1(context, intent);
        C9584f.m9265b(C9584f.f29822a, activity, str3, i, i2, i3, zj02, (C9585g.C9586a) null, 64, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r0.f141633w;
     */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo517n3() {
        /*
            r6 = this;
            T r0 = r6.f33564d
            te3.sn1 r0 = (te3.C51270sn1) r0
            r1 = 0
            if (r0 == 0) goto L_0x000e
            te3.zj0 r0 = r0.f141633w
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = r0.f146014p
            goto L_0x000f
        L_0x000e:
            r0 = r1
        L_0x000f:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 != 0) goto L_0x003b
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dp1.y0 r2 = (dp1.C58417y0) r2
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = ""
        L_0x0021:
            r3 = 1
            rs1.s8$a r4 = rs1.C13442s8.f38060Q0
            android.app.Activity r5 = r6.getContext()
            rs1.s8 r4 = r4.mo12873f(r5)
            if (r4 == 0) goto L_0x0032
            te3.hj1 r1 = r4.mo12861q3()
        L_0x0032:
            long r4 = r6.f1127R
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r2.Ey0(r0, r3, r1, r4)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce1.C0465g.mo517n3():void");
    }

    /* renamed from: o3 */
    public final void mo518o3(TextView textView, String str, int i, int i2, C32226l<? super String, C13598b0> lVar) {
        int i3;
        SpannableString spannableString = new SpannableString(str);
        View view = this.f1120J;
        if (view == null) {
            i3 = 0;
        } else {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            i3 = 0;
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityHeaderInfoUIC", "setSuffixedIcon", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((WeImageView) getContext().findViewById(C0966R.C0970id.f5509h3)).setIconColor(i);
        int dimension = (int) getContext().getResources().getDimension(C0966R.dimen.f3736cp);
        TextView textView2 = this.f1133h;
        if (textView2 != null) {
            Paint.FontMetricsInt fontMetricsInt = textView2.getPaint().getFontMetricsInt();
            int i4 = ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - (dimension / 2);
            Log.m105924i("FinderActivityEventUIC", "gap :" + i4);
            View view2 = this.f1120J;
            FrameLayout.LayoutParams layoutParams = null;
            ViewGroup.LayoutParams layoutParams2 = view2 != null ? view2.getLayoutParams() : null;
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            }
            if (layoutParams != null) {
                layoutParams.bottomMargin = i4;
                layoutParams.leftMargin = i2;
                View view3 = this.f1120J;
                if (view3 != null) {
                    view3.setLayoutParams(layoutParams);
                }
            }
        }
        spannableString.setSpan(new C4059g5(str, i, getContext().getResources().getColor(C0966R.color.ahf), false, false, new C0466a(lVar)), i3, str.length(), 17);
        textView.setText(spannableString);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("Finder.ActivityParamStore", "reset");
        C9579a.f29817b = null;
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("Finder.ActivityParamStore", "reset");
        C9579a.f29817b = null;
    }

    public void onResume() {
        super.onResume();
        this.f1131V = null;
        if (this.f1129T) {
            this.f1129T = false;
        } else {
            mo517n3();
        }
    }

    public void setNormalStyle() {
        mo510F3(getContext().getResources().getColor(C0966R.color.FG_1), getContext().getResources().getColor(C0966R.color.FG_0));
        View view = this.f1137o;
        if (view != null) {
            view.setBackgroundColor(getContext().getResources().getColor(C0966R.color.FG_1));
        }
        RelativeLayout relativeLayout = this.f1115E;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(C0966R.C0969drawable.a49);
        }
        ProgressBar progressBar = this.f1114D;
        if (progressBar != null) {
            progressBar.setProgressDrawable(getContext().getResources().getDrawable(C0966R.C0969drawable.cme));
        }
        LinearLayout linearLayout = this.f1142t;
        if (linearLayout != null) {
            linearLayout.setBackground(getContext().getResources().getDrawable(C0966R.C0969drawable.a4a));
        }
    }
}
