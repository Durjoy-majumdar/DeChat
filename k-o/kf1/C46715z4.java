package kf1;

import ak1.C0077k0;
import ak1.C54067f0;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import c30.C104289g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60216z4;
import ht1.C8777j5;
import je1.C9315i0;
import ls3.C10649f;
import p185kq.C10383h;
import p185kq.C61130g;
import p204mr.C61568m;
import p629ny.C76979h;
import qo3.C47883u;
import qo3.C77407n;
import qo3.C77426q;
import qo3.C89779i0;
import te3.C49310eo0;
import te3.C49712hj1;
import te3.C52083y81;
import te3.C64238ap2;
import te3.C64279c90;

/* renamed from: kf1.z4 */
public final class C46715z4 {

    /* renamed from: a */
    public static final C46715z4 f125755a = new C46715z4();

    /* renamed from: b */
    public static C77407n f125756b;

    /* renamed from: c */
    public static final int f125757c = 1;

    /* renamed from: d */
    public static int f125758d;

    /* renamed from: e */
    public static boolean f125759e = true;

    /* renamed from: kf1.z4$a */
    public static final class C46716a implements C9315i0.C9316a {

        /* renamed from: a */
        public final /* synthetic */ C89779i0 f125760a;

        /* renamed from: b */
        public final /* synthetic */ boolean f125761b;

        /* renamed from: c */
        public final /* synthetic */ MMActivity f125762c;

        /* renamed from: d */
        public final /* synthetic */ String f125763d;

        /* renamed from: e */
        public final /* synthetic */ C60216z4.C8821a<Integer> f125764e;

        /* renamed from: f */
        public final /* synthetic */ C60216z4.C8821a<Integer> f125765f;

        /* renamed from: kf1.z4$a$a */
        public static final class C46717a implements C47883u {

            /* renamed from: a */
            public final /* synthetic */ C49310eo0 f125766a;

            /* renamed from: b */
            public final /* synthetic */ C60216z4.C8821a<Integer> f125767b;

            /* renamed from: c */
            public final /* synthetic */ MMActivity f125768c;

            public C46717a(C49310eo0 eo02, C60216z4.C8821a<Integer> aVar, MMActivity mMActivity) {
                this.f125766a = eo02;
                this.f125767b = aVar;
                this.f125768c = mMActivity;
            }

            /* renamed from: a */
            public final void mo353a(boolean z, String str) {
                if (z) {
                    Intent intent = new Intent();
                    C54067f0 config = ((C8777j5) C86312j.m106911c(C8777j5.class)).getConfig();
                    config.getClass();
                    config.f151445a = "temp_13";
                    String R1 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76802R1(15, 2, 65);
                    C52083y81 y812 = this.f125766a.f133027e;
                    if (y812 != null) {
                        MMActivity mMActivity = this.f125768c;
                        long j = y812.f145169d;
                        long j2 = y812.f145171f;
                        String str2 = y812.f145170e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        C64238ap2 ap22 = new C64238ap2();
                        ap22.f182124d = j;
                        ap22.f182125e = j2;
                        ap22.f182126f = str2;
                        ap22.f182127g = "";
                        ap22.f182128h = "";
                        ap22.f182129i = "";
                        ap22.f182130j = null;
                        C64279c90 c902 = new C64279c90();
                        c902.f182444d = R1;
                        c902.f182445e = "";
                        c902.f182447g = -1;
                        c902.f182448h = -1;
                        c902.f182449i = 1;
                        AppCompatActivity context = mMActivity.getContext();
                        C87412m.m108593f(context, "activity.context");
                        ((C10649f) C86312j.m106911c(C10649f.class)).mo10916tP(context, intent, ap22, false, c902, (C10649f.C10650a) null);
                    }
                    this.f125767b.mo6382a(2);
                    return;
                }
                this.f125767b.mo6382a(1);
            }
        }

        public C46716a(C89779i0 i0Var, boolean z, MMActivity mMActivity, String str, C60216z4.C8821a<Integer> aVar, C60216z4.C8821a<Integer> aVar2) {
            this.f125760a = i0Var;
            this.f125761b = z;
            this.f125762c = mMActivity;
            this.f125763d = str;
            this.f125764e = aVar;
            this.f125765f = aVar2;
        }

        /* renamed from: b */
        public static final void m52012b(MMActivity mMActivity, C49310eo0 eo02, C60216z4.C8821a<Integer> aVar) {
            C77426q qVar = new C77426q(mMActivity);
            AppCompatActivity context = mMActivity.getContext();
            Object[] objArr = new Object[1];
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            AppCompatActivity context2 = mMActivity.getContext();
            FinderContact finderContact = eo02.f133028f;
            objArr[0] = hVar.mo107057T1(context2, finderContact != null ? finderContact.nickname : null);
            qVar.mo107595g(context.getString(C0966R.string.e6f, objArr));
            qVar.mo107590b(new C46717a(eo02, aVar, mMActivity));
            qVar.mo107603o();
        }

        /* JADX WARNING: type inference failed for: r0v5, types: [up1.y, gy3.h] */
        /* JADX WARNING: type inference failed for: r0v43 */
        /* JADX WARNING: type inference failed for: r0v44 */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x032e  */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x0335  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x03ae  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x03b8  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x03e1  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0439  */
        /* JADX WARNING: Removed duplicated region for block: B:151:0x050f  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x051c  */
        /* JADX WARNING: Removed duplicated region for block: B:155:0x0525  */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0530  */
        /* JADX WARNING: Removed duplicated region for block: B:160:0x0538  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo10069a(int r43, int r44, java.lang.String r45, te3.C49310eo0 r46) {
            /*
                r42 = this;
                r0 = r42
                r7 = r46
                java.lang.String r1 = "resp"
                gy3.C87412m.m108594g(r7, r1)
                qo3.i0 r1 = r0.f125760a
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto L_0x0016
                qo3.i0 r1 = r0.f125760a
                r1.dismiss()
            L_0x0016:
                if (r43 != 0) goto L_0x053e
                if (r44 != 0) goto L_0x053e
                te3.d51 r1 = r7.f133026d
                r8 = 1
                if (r1 == 0) goto L_0x0025
                int r1 = r1.f132127p
                if (r1 != r8) goto L_0x0025
                r1 = 1
                goto L_0x0026
            L_0x0025:
                r1 = 0
            L_0x0026:
                r3 = 4
                java.lang.String r4 = "wxData"
                r5 = 2
                r6 = 0
                if (r1 == 0) goto L_0x0123
                boolean r1 = r0.f125761b
                if (r1 == 0) goto L_0x0048
                te3.y81 r1 = r7.f133027e
                if (r1 == 0) goto L_0x003c
                int r1 = r1.f145172g
                if (r1 != r8) goto L_0x003c
                r1 = 1
                goto L_0x003d
            L_0x003c:
                r1 = 0
            L_0x003d:
                if (r1 == 0) goto L_0x0048
                com.tencent.mm.ui.MMActivity r1 = r0.f125762c
                ht1.z4$a<java.lang.Integer> r2 = r0.f125764e
                m52012b(r1, r7, r2)
                goto L_0x0549
            L_0x0048:
                kf1.z4 r9 = kf1.C46715z4.f125755a
                com.tencent.mm.ui.MMActivity r1 = r0.f125762c
                java.lang.String r14 = r0.f125763d
                gy3.C87412m.m108593f(r14, r4)
                ht1.z4$a<java.lang.Integer> r4 = r0.f125764e
                ht1.z4$a<java.lang.Integer> r15 = r0.f125765f
                r9.getClass()
                kf1.y4 r10 = new kf1.y4
                r10.<init>()
                ob0.b0 r11 = f40.C86709a0.m107524d()
                r12 = 6276(0x1884, float:8.795E-42)
                r11.mo123455a(r12, r10)
                java.lang.Class<tf0.q1> r10 = tf0.C13887q1.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                java.lang.String r11 = "getService(IFinderCommonLiveService::class.java)"
                gy3.C87412m.m108593f(r10, r11)
                r16 = r10
                tf0.q1 r16 = (tf0.C13887q1) r16
                com.tencent.mm.protocal.protobuf.FinderContact r10 = r7.f133028f
                java.lang.String r26 = ""
                if (r10 == 0) goto L_0x0083
                java.lang.String r10 = r10.username
                if (r10 != 0) goto L_0x0080
                goto L_0x0083
            L_0x0080:
                r17 = r10
                goto L_0x0085
            L_0x0083:
                r17 = r26
            L_0x0085:
                te3.d51 r10 = r7.f133026d
                if (r10 == 0) goto L_0x008b
                java.lang.String r6 = r10.f132122h
            L_0x008b:
                r18 = r6
                gy3.C87412m.m108591d(r18)
                r20 = 0
                r21 = 0
                r6 = 201(0xc9, float:2.82E-43)
                java.lang.Integer r22 = java.lang.Integer.valueOf(r6)
                r23 = 0
                r24 = 80
                r25 = 0
                r19 = 1
                ob0.y r6 = tf0.C13887q1.C13888a.m13305a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                ob0.b0 r10 = f40.C86709a0.m107524d()
                r10.mo123460f(r6)
                ak1.k0 r10 = ak1.C0077k0.Book
                com.tencent.mm.protocal.protobuf.FinderContact r6 = r7.f133028f
                if (r6 == 0) goto L_0x00ba
                java.lang.String r6 = r6.username
                if (r6 != 0) goto L_0x00b8
                goto L_0x00ba
            L_0x00b8:
                r11 = r6
                goto L_0x00bc
            L_0x00ba:
                r11 = r26
            L_0x00bc:
                te3.y81 r6 = r7.f133027e
                if (r6 == 0) goto L_0x00c3
                long r12 = r6.f145171f
                goto L_0x00c5
            L_0x00c3:
                r12 = 0
            L_0x00c5:
                te3.d51 r6 = r7.f133026d
                if (r6 == 0) goto L_0x00cd
                java.lang.String r6 = r6.f132122h
                if (r6 != 0) goto L_0x00cf
            L_0x00cd:
                r6 = r26
            L_0x00cf:
                r2 = r15
                r15 = r6
                r9.mo71958c(r10, r11, r12, r14, r15)
                r6 = 6
                kf1.C46715z4.f125758d = r6
                te3.d51 r6 = r7.f133026d
                if (r6 == 0) goto L_0x00e2
                java.lang.String r9 = r6.f132126o
                if (r9 != 0) goto L_0x00e0
                goto L_0x00e2
            L_0x00e0:
                r11 = r9
                goto L_0x00e4
            L_0x00e2:
                r11 = r26
            L_0x00e4:
                if (r6 == 0) goto L_0x00ee
                java.lang.String r6 = r6.f132122h
                if (r6 != 0) goto L_0x00eb
                goto L_0x00ee
            L_0x00eb:
                r18 = r6
                goto L_0x00f0
            L_0x00ee:
                r18 = r26
            L_0x00f0:
                te3.y81 r6 = r7.f133027e
                if (r6 == 0) goto L_0x00f9
                int r6 = r6.f145172g
                if (r6 != r5) goto L_0x00f9
                goto L_0x00fa
            L_0x00f9:
                r8 = 0
            L_0x00fa:
                if (r8 == 0) goto L_0x00fe
                kf1.C46715z4.f125758d = r3
            L_0x00fe:
                je1.b0 r3 = new je1.b0
                r12 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r19 = 1
                r20 = 0
                r21 = 30
                r22 = 0
                r10 = r3
                r10.<init>(r11, r12, r13, r14, r16, r18, r19, r20, r21, r22)
                nr3.e r3 = r3.mo9225i()
                kf1.x4 r5 = new kf1.x4
                r5.<init>(r1, r7, r2, r4)
                r3.mo123420E(r5)
                r3.mo11397F(r1)
                goto L_0x0549
            L_0x0123:
                te3.y81 r1 = r7.f133027e
                if (r1 == 0) goto L_0x012d
                int r1 = r1.f145172g
                if (r1 != r8) goto L_0x012d
                r1 = 1
                goto L_0x012e
            L_0x012d:
                r1 = 0
            L_0x012e:
                if (r1 == 0) goto L_0x0139
                com.tencent.mm.ui.MMActivity r1 = r0.f125762c
                ht1.z4$a<java.lang.Integer> r2 = r0.f125764e
                m52012b(r1, r7, r2)
                goto L_0x0549
            L_0x0139:
                kf1.z4 r9 = kf1.C46715z4.f125755a
                com.tencent.mm.ui.MMActivity r10 = r0.f125762c
                java.lang.String r11 = r0.f125763d
                gy3.C87412m.m108593f(r11, r4)
                ht1.z4$a<java.lang.Integer> r12 = r0.f125764e
                ht1.z4$a<java.lang.Integer> r13 = r0.f125765f
                r9.getClass()
                qo3.n r1 = new qo3.n
                androidx.appcompat.app.AppCompatActivity r2 = r10.getContext()
                r4 = 0
                r1.<init>((android.content.Context) r2, (int) r8, (boolean) r4)
                kf1.C46715z4.f125756b = r1
                androidx.appcompat.app.AppCompatActivity r1 = r10.getContext()
                r2 = 2131494981(0x7f0c0845, float:1.8613486E38)
                android.view.View r1 = android.view.View.inflate(r1, r2, r6)
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.RoundedCornerFrameLayout"
                gy3.C87412m.m108592e(r1, r2)
                r14 = r1
                com.tencent.mm.ui.widget.RoundedCornerFrameLayout r14 = (com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout) r14
                r1 = 2131303676(0x7f091cfc, float:1.8225473E38)
                android.view.View r2 = r14.findViewById(r1)
                kf1.b5 r4 = kf1.C46696b5.f125714d
                r2.setOnClickListener(r4)
                r2 = 2131303671(0x7f091cf7, float:1.8225463E38)
                android.view.View r2 = r14.findViewById(r2)
                kf1.c5 r4 = kf1.C46698c5.f125720d
                r2.setOnClickListener(r4)
                androidx.appcompat.app.AppCompatActivity r2 = r10.getContext()
                r4 = 12
                int r2 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r2, r4)
                float r2 = (float) r2
                androidx.appcompat.app.AppCompatActivity r15 = r10.getContext()
                int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r15, r4)
                float r4 = (float) r4
                r15 = 0
                r14.mo153905b(r2, r4, r15, r15)
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                java.lang.Class<pl1.s0> r4 = pl1.C11990s0.class
                java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
                r3 = 2131303679(0x7f091cff, float:1.822548E38)
                r14.findViewById(r3)
                r3 = 2131303675(0x7f091cfb, float:1.8225471E38)
                android.view.View r3 = r14.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r8 = 2131303683(0x7f091d03, float:1.8225487E38)
                android.view.View r8 = r14.findViewById(r8)
                android.widget.TextView r8 = (android.widget.TextView) r8
                r5 = 2131303673(0x7f091cf9, float:1.8225467E38)
                android.view.View r5 = r14.findViewById(r5)
                android.widget.ImageView r5 = (android.widget.ImageView) r5
                r6 = 2131303674(0x7f091cfa, float:1.822547E38)
                android.view.View r6 = r14.findViewById(r6)
                r1 = 2131303685(0x7f091d05, float:1.8225491E38)
                android.view.View r1 = r14.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                r0 = 2131303681(0x7f091d01, float:1.8225483E38)
                android.view.View r0 = r14.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r33 = r12
                r12 = 2131303676(0x7f091cfc, float:1.8225473E38)
                android.view.View r12 = r14.findViewById(r12)
                r34 = r13
                r13 = 2131303677(0x7f091cfd, float:1.8225475E38)
                android.view.View r13 = r14.findViewById(r13)
                r35 = r10
                r10 = 2131303678(0x7f091cfe, float:1.8225477E38)
                android.view.View r10 = r14.findViewById(r10)
                android.widget.TextView r10 = (android.widget.TextView) r10
                r36 = r11
                bl3.r r11 = bl3.C39818r.f106831a
                r37 = r9
                bl3.r$a r9 = r11.mo62446e(r15)
                bl3.c r9 = r9.mo62447c(r4)
                pl1.s0 r9 = (pl1.C11990s0) r9
                k60.d r9 = r9.mo11872i2()
                r38 = r13
                pl1.f r13 = new pl1.f
                r39 = r10
                com.tencent.mm.protocal.protobuf.FinderContact r10 = r7.f133028f
                if (r10 == 0) goto L_0x021b
                java.lang.String r10 = r10.headUrl
                r41 = r0
                r40 = r12
                r0 = 0
                goto L_0x0221
            L_0x021b:
                r41 = r0
                r40 = r12
                r0 = 0
                r10 = 0
            L_0x0221:
                r12 = 2
                r13.<init>(r10, r0, r12, r0)
                java.lang.String r0 = "avatar"
                gy3.C87412m.m108593f(r3, r0)
                pl1.e0$a r0 = pl1.C11978e0.C11979a.AVATAR
                bl3.r$a r10 = r11.mo62446e(r15)
                bl3.c r4 = r10.mo62447c(r4)
                pl1.s0 r4 = (pl1.C11990s0) r4
                n60.f r0 = r4.mo11867O2(r0)
                r9.mo85957c(r13, r3, r0)
                android.text.TextPaint r0 = r8.getPaint()
                r3 = 1061997773(0x3f4ccccd, float:0.8)
                com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r3)
                di3.d r0 = di3.C86312j.m106911c(r2)
                ny.h r0 = (p629ny.C76979h) r0
                android.content.Context r3 = r14.getContext()
                com.tencent.mm.protocal.protobuf.FinderContact r4 = r7.f133028f
                if (r4 == 0) goto L_0x0258
                java.lang.String r4 = r4.nickname
                goto L_0x0259
            L_0x0258:
                r4 = 0
            L_0x0259:
                android.text.SpannableString r0 = r0.mo107057T1(r3, r4)
                r8.setText(r0)
                er1.w3 r17 = er1.C58784w3.f168295a
                java.lang.String r0 = "auth"
                gy3.C87412m.m108593f(r5, r0)
                com.tencent.mm.protocal.protobuf.FinderContact r0 = r7.f133028f
                if (r0 == 0) goto L_0x0270
                com.tencent.mm.protocal.protobuf.FinderAuthInfo r0 = r0.authInfo
                r19 = r0
                goto L_0x0272
            L_0x0270:
                r19 = 0
            L_0x0272:
                r20 = 0
                r21 = 0
                r22 = 12
                r23 = 0
                r18 = r5
                er1.C58784w3.m68429F1(r17, r18, r19, r20, r21, r22, r23)
                int r0 = r5.getVisibility()
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3.mo10233c(r0)
                java.lang.Object[] r26 = r3.mo10232b()
                java.lang.String r27 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r28 = "refreshContentView"
                java.lang.String r29 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Ljava/lang/String;)V"
                java.lang.String r30 = "android/view/View_EXEC_"
                java.lang.String r31 = "setVisibility"
                java.lang.String r32 = "(I)V"
                r25 = r6
                j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
                r0 = 0
                java.lang.Object r3 = r3.mo10231a(r0)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r0 = r3.intValue()
                r6.setVisibility(r0)
                java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r19 = "refreshContentView"
                java.lang.String r20 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Ljava/lang/String;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r17 = r6
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
                android.content.Context r0 = r14.getContext()
                android.content.res.Resources r0 = r0.getResources()
                r3 = 2131828249(0x7f111e19, float:1.9289434E38)
                r4 = 1
                java.lang.Object[] r5 = new java.lang.Object[r4]
                te3.d51 r4 = r7.f133026d
                if (r4 == 0) goto L_0x02ef
                int r4 = r4.f132118d
                long r8 = (long) r4
                r10 = 1000(0x3e8, double:4.94E-321)
                long r18 = r8 * r10
                er1.j4 r17 = er1.C58739j4.f168176a
                r20 = 0
                r21 = 0
                r22 = 6
                r23 = 0
                java.lang.String r4 = er1.C58739j4.m68254u(r17, r18, r20, r21, r22, r23)
                goto L_0x02f0
            L_0x02ef:
                r4 = 0
            L_0x02f0:
                r6 = 0
                r5[r6] = r4
                java.lang.String r0 = r0.getString(r3, r5)
                r1.setText(r0)
                te3.d51 r0 = r7.f133026d
                if (r0 == 0) goto L_0x0327
                java.lang.String r0 = r0.f132121g
                if (r0 == 0) goto L_0x0327
                int r1 = r0.length()
                if (r1 <= 0) goto L_0x030a
                r1 = 1
                goto L_0x030b
            L_0x030a:
                r1 = 0
            L_0x030b:
                if (r1 == 0) goto L_0x030e
                goto L_0x030f
            L_0x030e:
                r0 = 0
            L_0x030f:
                if (r0 == 0) goto L_0x0327
                di3.d r1 = di3.C86312j.m106911c(r2)
                ny.h r1 = (p629ny.C76979h) r1
                android.content.Context r2 = r14.getContext()
                android.text.SpannableString r0 = r1.mo107057T1(r2, r0)
                r1 = r41
                r1.setText(r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                goto L_0x032a
            L_0x0327:
                r1 = r41
                r0 = 0
            L_0x032a:
                r2 = 8
                if (r0 != 0) goto L_0x0331
                r1.setVisibility(r2)
            L_0x0331:
                te3.y81 r0 = r7.f133027e
                if (r0 == 0) goto L_0x03ae
                int r0 = r0.f145172g
                r1 = 2
                if (r0 != r1) goto L_0x039e
                r10 = r39
                r0 = r40
                r3 = 0
                kf1.C46715z4.m52009b(r0, r14, r10, r3)
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                r3.mo10233c(r4)
                java.lang.Object[] r26 = r3.mo10232b()
                java.lang.String r27 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r28 = "refreshContentView"
                java.lang.String r29 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Ljava/lang/String;)V"
                java.lang.String r30 = "android/view/View_EXEC_"
                java.lang.String r31 = "setVisibility"
                java.lang.String r32 = "(I)V"
                r25 = r38
                j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
                r4 = 0
                java.lang.Object r3 = r3.mo10231a(r4)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r4 = r38
                r4.setVisibility(r3)
                java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r19 = "refreshContentView"
                java.lang.String r20 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Ljava/lang/String;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r17 = r4
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
                android.content.Context r3 = r14.getContext()
                r5 = 2131827600(0x7f111b90, float:1.9288117E38)
                java.lang.String r3 = r3.getString(r5)
                r10.setText(r3)
                r3 = 0
                r0.setOnClickListener(r3)
                r3 = 4
                kf1.C46715z4.f125758d = r3
                rx3.b0 r3 = rx3.C13598b0.f38549a
                goto L_0x03b6
            L_0x039e:
                r4 = r38
                r10 = r39
                r0 = r40
                qo3.n r3 = kf1.C46715z4.f125756b
                if (r3 == 0) goto L_0x03b5
                r3.mo107572p()
                rx3.b0 r3 = rx3.C13598b0.f38549a
                goto L_0x03b6
            L_0x03ae:
                r4 = r38
                r10 = r39
                r0 = r40
                r1 = 2
            L_0x03b5:
                r3 = 0
            L_0x03b6:
                if (r3 != 0) goto L_0x050b
                te3.d51 r3 = r7.f133026d
                if (r3 == 0) goto L_0x03c3
                int r5 = r3.f132125n
                r6 = 1
                if (r5 != r6) goto L_0x03c3
                r5 = 1
                goto L_0x03c4
            L_0x03c3:
                r5 = 0
            L_0x03c4:
                r6 = 3
                if (r5 != 0) goto L_0x04a2
                if (r3 == 0) goto L_0x03cf
                int r5 = r3.f132125n
                if (r5 != r6) goto L_0x03cf
                r5 = 1
                goto L_0x03d0
            L_0x03cf:
                r5 = 0
            L_0x03d0:
                if (r5 == 0) goto L_0x03d4
                goto L_0x04a2
            L_0x03d4:
                if (r3 == 0) goto L_0x03dd
                int r3 = r3.f132119e
                r5 = 1
                if (r3 != r5) goto L_0x03de
                r3 = 1
                goto L_0x03df
            L_0x03dd:
                r5 = 1
            L_0x03de:
                r3 = 0
            L_0x03df:
                if (r3 == 0) goto L_0x0439
                kf1.C46715z4.m52009b(r0, r14, r10, r5)
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.mo10233c(r2)
                java.lang.Object[] r26 = r1.mo10232b()
                java.lang.String r27 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r28 = "refreshContentView$lambda-5$refreshReserveBtn"
                java.lang.String r29 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher;Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/ui/MMActivity;)V"
                java.lang.String r30 = "android/view/View_EXEC_"
                java.lang.String r31 = "setVisibility"
                java.lang.String r32 = "(I)V"
                r25 = r4
                j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
                r2 = 0
                java.lang.Object r1 = r1.mo10231a(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r4.setVisibility(r1)
                java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r19 = "refreshContentView$lambda-5$refreshReserveBtn"
                java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher;Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/ui/MMActivity;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r17 = r4
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
                android.content.Context r1 = r14.getContext()
                r2 = 2131827602(0x7f111b92, float:1.9288121E38)
                java.lang.String r1 = r1.getString(r2)
                r10.setText(r1)
                r1 = 5
                kf1.C46715z4.f125758d = r1
                r2 = 1
                goto L_0x0490
            L_0x0439:
                r3 = 0
                kf1.C46715z4.m52009b(r0, r14, r10, r3)
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
                r3.mo10233c(r5)
                java.lang.Object[] r26 = r3.mo10232b()
                java.lang.String r27 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r28 = "refreshContentView$lambda-5$refreshReserveBtn"
                java.lang.String r29 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher;Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/ui/MMActivity;)V"
                java.lang.String r30 = "android/view/View_EXEC_"
                java.lang.String r31 = "setVisibility"
                java.lang.String r32 = "(I)V"
                r25 = r4
                j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
                r5 = 0
                java.lang.Object r3 = r3.mo10231a(r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r4.setVisibility(r3)
                java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r19 = "refreshContentView$lambda-5$refreshReserveBtn"
                java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher;Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/ui/MMActivity;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r17 = r4
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
                android.content.Context r3 = r14.getContext()
                r4 = 2131827603(0x7f111b93, float:1.9288123E38)
                java.lang.String r3 = r3.getString(r4)
                r10.setText(r3)
                kf1.C46715z4.f125758d = r2
                r2 = 2
            L_0x0490:
                kf1.a5 r8 = new kf1.a5
                r1 = r8
                r3 = r37
                r4 = r46
                r5 = r36
                r6 = r35
                r1.<init>(r2, r3, r4, r5, r6)
                r0.setOnClickListener(r8)
                goto L_0x050b
            L_0x04a2:
                r1 = 0
                kf1.C46715z4.m52009b(r0, r14, r10, r1)
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.mo10233c(r2)
                java.lang.Object[] r26 = r1.mo10232b()
                java.lang.String r27 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r28 = "refreshContentView"
                java.lang.String r29 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Ljava/lang/String;)V"
                java.lang.String r30 = "android/view/View_EXEC_"
                java.lang.String r31 = "setVisibility"
                java.lang.String r32 = "(I)V"
                r25 = r4
                j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
                r2 = 0
                java.lang.Object r1 = r1.mo10231a(r2)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r4.setVisibility(r1)
                java.lang.String r18 = "com/tencent/mm/plugin/finder/feed/FinderLiveForMiniAppLauncher"
                java.lang.String r19 = "refreshContentView"
                java.lang.String r20 = "(Lcom/tencent/mm/ui/MMActivity;Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderGetLiveNoticeResponse;Ljava/lang/String;)V"
                java.lang.String r21 = "android/view/View_EXEC_"
                java.lang.String r22 = "setVisibility"
                java.lang.String r23 = "(I)V"
                r17 = r4
                j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
                android.content.Context r1 = r14.getContext()
                r3 = 2131827598(0x7f111b8e, float:1.9288113E38)
                java.lang.String r1 = r1.getString(r3)
                r10.setText(r1)
                r1 = 0
                r0.setOnClickListener(r1)
                te3.d51 r0 = r7.f133026d
                if (r0 == 0) goto L_0x0504
                int r0 = r0.f132125n
                r1 = 1
                if (r0 != r1) goto L_0x0504
                r2 = 1
            L_0x0504:
                if (r2 == 0) goto L_0x0507
                goto L_0x0509
            L_0x0507:
                r6 = 10
            L_0x0509:
                kf1.C46715z4.f125758d = r6
            L_0x050b:
                qo3.n r0 = kf1.C46715z4.f125756b
                if (r0 == 0) goto L_0x051a
                kf1.d5 r1 = new kf1.d5
                r2 = r33
                r3 = r34
                r1.<init>(r3, r2)
                r0.f225761d = r1
            L_0x051a:
                if (r0 == 0) goto L_0x0523
                kf1.e5 r1 = new kf1.e5
                r1.<init>(r14)
                r0.f225771i = r1
            L_0x0523:
                if (r0 == 0) goto L_0x052e
                kf1.f5 r1 = new kf1.f5
                r2 = r36
                r1.<init>(r7, r2)
                r0.f225763e = r1
            L_0x052e:
                if (r0 == 0) goto L_0x0534
                r1 = 1
                r0.mo107559d(r1)
            L_0x0534:
                qo3.n r0 = kf1.C46715z4.f125756b
                if (r0 == 0) goto L_0x053b
                r0.mo107573q()
            L_0x053b:
                r0 = r42
                goto L_0x0549
            L_0x053e:
                r0 = r42
                ht1.z4$a<java.lang.Integer> r1 = r0.f125765f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r44)
                r1.mo6382a(r2)
            L_0x0549:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C46715z4.C46716a.mo10069a(int, int, java.lang.String, te3.eo0):void");
        }
    }

    /* renamed from: kf1.z4$b */
    public static final class C46718b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C60216z4.C8821a<Integer> f125769d;

        public C46718b(C60216z4.C8821a<Integer> aVar) {
            this.f125769d = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f125769d.mo6382a(9);
        }
    }

    /* renamed from: b */
    public static final void m52009b(View view, View view2, TextView textView, boolean z) {
        if (z) {
            view.setBackground(view2.getContext().getResources().getDrawable(C0966R.C0969drawable.f4651j4));
            textView.setTextColor(view2.getContext().getResources().getColor(C0966R.color.f2975b6));
            return;
        }
        view.setBackground(view2.getContext().getResources().getDrawable(C0966R.C0969drawable.a0y));
        textView.setTextColor(view2.getContext().getResources().getColor(C0966R.color.BW_0_Alpha_0_3));
    }

    /* renamed from: a */
    public final void mo71957a(MMActivity mMActivity, String str, C60216z4.C8821a<Integer> aVar, C60216z4.C8821a<Integer> aVar2, boolean z) {
        MMActivity mMActivity2 = mMActivity;
        String str2 = str;
        C60216z4.C8821a<Integer> aVar3 = aVar;
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(str2, "jsonStr");
        C87412m.m108594g(aVar3, "successCallback");
        C60216z4.C8821a<Integer> aVar4 = aVar2;
        C87412m.m108594g(aVar4, "failCallback");
        C104289g gVar = new C104289g(str2);
        String optString = gVar.optString("appId");
        String optString2 = gVar.optString("noticeId");
        String optString3 = gVar.optString("wxData");
        boolean optBoolean = gVar.optBoolean("preferEnterLive", false);
        f125759e = z;
        C89779i0 e = C89779i0.m112248e(mMActivity.getContext(), mMActivity.getContext().getString(C0966R.string.a4d), true, 3, new C46718b(aVar3));
        C87412m.m108593f(optString2, "noticeId");
        C87412m.m108593f(optString, "appId");
        new C9315i0(optString2, optString, (String) null, 0, new C46716a(e, optBoolean, mMActivity, optString3, aVar3, aVar4), (C49712hj1) null, 0, 108, (C8480h) null).mo9225i().mo11397F(mMActivity2);
    }

    /* renamed from: c */
    public final void mo71958c(C0077k0 k0Var, String str, long j, String str2, String str3) {
        Class cls = C61568m.class;
        String str4 = f125759e ? "temp_13" : "39";
        ((C61130g) C86312j.m106911c(C61130g.class)).mo33246ry(str4);
        ((C10383h) C86312j.m106911c(C10383h.class)).mo10697OK(((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76802R1(15, 2, 65));
        ((C61568m) C86312j.m106911c(cls)).mo74891sS(str2);
        C7335d c = C86312j.m106911c(cls);
        C87412m.m108593f(c, "getService(IHellLiveVisitorReoprter::class.java)");
        C61568m.C61569a.m72263a((C61568m) c, k0Var, str, j, 0, str4, "", 0L, "", "", (String) null, (String) null, str3, (String) null, 0, 0, 30208, (Object) null);
    }
}
