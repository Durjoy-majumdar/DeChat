package yd2;

import android.os.Looper;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.C82086j;
import com.tencent.p014mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76868a0;
import vd2.C78386e;
import vd2.C78388f;
import xd2.C78800c;

/* renamed from: yd2.b */
public class C79069b implements C38994a {

    /* renamed from: f */
    public static final int f232194f = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_pat_double_click_avatar_delay_interval, ViewConfiguration.getDoubleTapTimeout());

    /* renamed from: a */
    public C78386e f232195a;

    /* renamed from: b */
    public C78388f f232196b;

    /* renamed from: c */
    public C78800c f232197c;

    /* renamed from: d */
    public View.OnClickListener f232198d = new C79070a();

    /* renamed from: e */
    public MMHandler f232199e = new C79071b(Looper.getMainLooper());

    /* renamed from: yd2.b$a */
    public class C79070a implements View.OnClickListener {
        public C79070a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/patmsg/ui/PatHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            MMHandler mMHandler = C79069b.this.f232199e;
            mMHandler.sendMessageAtFrontOfQueue(mMHandler.obtainMessage(C82086j.CTRL_INDEX, view));
            C117292a.m165361g(this, "com/tencent/mm/plugin/patmsg/ui/PatHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yd2.b$b */
    public class C79071b extends MMHandler {

        /* renamed from: a */
        public long f232201a = 0;

        public C79071b(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x022d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                int r4 = r1.what
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r5 = 0
                r3[r5] = r4
                java.lang.String r4 = "MicroMsg.PatHandler"
                java.lang.String r6 = "click msg %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
                int r3 = r1.what
                switch(r3) {
                    case 290: goto L_0x027e;
                    case 291: goto L_0x0258;
                    case 292: goto L_0x002b;
                    case 293: goto L_0x001e;
                    default: goto L_0x001c;
                }
            L_0x001c:
                goto L_0x02bf
            L_0x001e:
                yd2.b r1 = yd2.C79069b.this
                vd2.f r1 = r1.f232196b
                com.tencent.mm.plugin.patmsg.ui.AvatarPatTipImageView r1 = (com.tencent.p014mm.plugin.patmsg.p086ui.AvatarPatTipImageView) r1
                com.tencent.mm.plugin.patmsg.ui.PatPopupWindow r1 = r1.f202258i
                r1.dismiss()
                goto L_0x02bf
            L_0x002b:
                yd2.b r3 = yd2.C79069b.this
                vd2.e r3 = r3.f232195a
                if (r3 == 0) goto L_0x0048
                vd2.e$a r3 = r3.getDoubleClickListener()
                if (r3 == 0) goto L_0x0048
                yd2.b r3 = yd2.C79069b.this
                vd2.e r3 = r3.f232195a
                vd2.e$a r3 = r3.getDoubleClickListener()
                java.lang.Object r1 = r1.obj
                android.view.View r1 = (android.view.View) r1
                boolean r1 = r3.mo96620a(r1)
                goto L_0x0049
            L_0x0048:
                r1 = 0
            L_0x0049:
                if (r1 != 0) goto L_0x0253
                yd2.b r1 = yd2.C79069b.this
                vd2.e r3 = r1.f232195a
                if (r3 == 0) goto L_0x0253
                java.lang.Class<ud2.h> r8 = ud2.C78150h.class
                java.lang.Class<vd2.d> r9 = vd2.C78384d.class
                java.lang.String r3 = r3.getTagUsername()
                vd2.e r10 = r1.f232195a
                java.lang.String r10 = r10.getTagTalker()
                vd2.e r11 = r1.f232195a
                int r11 = r11.getTagScene()
                r12 = 3
                java.lang.Object[] r13 = new java.lang.Object[r12]
                java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
                r13[r5] = r14
                r13[r2] = r10
                r14 = 2
                r13[r14] = r3
                java.lang.String r15 = "scene %d, sendPatMsg to %s, pattedUser %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r15, r13)
                java.lang.String[] r13 = new java.lang.String[r14]
                r13[r5] = r3
                r13[r2] = r10
                boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String[]) r13)
                if (r13 == 0) goto L_0x008d
                java.lang.String r1 = "tagUsername or talker is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r1)
                goto L_0x0253
            L_0x008d:
                di3.d r13 = di3.C86312j.m106911c(r9)
                vd2.d r13 = (vd2.C78384d) r13
                boolean r13 = r13.mo108127cu(r11, r10, r3)
                if (r13 != 0) goto L_0x00ac
                java.lang.Object[] r1 = new java.lang.Object[r12]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r11)
                r1[r5] = r8
                r1[r2] = r10
                r1[r14] = r3
                java.lang.String r2 = "cannot pat, scene %d, talker %s, user %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r4, r2, r1)
                goto L_0x0253
            L_0x00ac:
                xd2.c r4 = r1.f232197c
                if (r4 == 0) goto L_0x0145
                android.util.Pair<java.lang.Long, java.lang.Long> r4 = r4.f230565e
                if (r4 == 0) goto L_0x0145
                di3.d r4 = di3.C86312j.m106911c(r9)
                vd2.d r4 = (vd2.C78384d) r4
                xd2.c r13 = r1.f232197c
                android.util.Pair<java.lang.Long, java.lang.Long> r13 = r13.f230565e
                boolean r4 = r4.mo108119FY(r13)
                if (r4 == 0) goto L_0x0145
                di3.d r4 = di3.C86312j.m106911c(r8)
                ud2.h r4 = (ud2.C78150h) r4
                vd2.e r5 = r1.f232195a
                android.view.View r5 = (android.view.View) r5
                java.lang.String r8 = eb0.C75592q0.m90789s()
                boolean r3 = r8.equals(r3)
                r4.getClass()
                if (r3 == 0) goto L_0x00ea
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r4 = 2130771997(0x7f01001d, float:1.71471E38)
                android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4)
                r5.startAnimation(r3)
                goto L_0x00f8
            L_0x00ea:
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r4 = 2130771996(0x7f01001c, float:1.7147098E38)
                android.view.animation.Animation r3 = android.view.animation.AnimationUtils.loadAnimation(r3, r4)
                r5.startAnimation(r3)
            L_0x00f8:
                vd2.e r3 = r1.f232195a
                android.view.View r3 = (android.view.View) r3
                r3.performHapticFeedback(r12, r14)
                vd2.e r3 = r1.f232195a
                android.view.View r3 = (android.view.View) r3
                android.content.Context r3 = r3.getContext()
                xd2.c r4 = r1.f232197c
                android.util.Pair<java.lang.Long, java.lang.Long> r4 = r4.f230565e
                qo3.n r5 = new qo3.n
                r5.<init>((android.content.Context) r3, (int) r2, (boolean) r2)
                android.content.res.Resources r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r9 = 2131834859(0x7f1137eb, float:1.930284E38)
                java.lang.String r8 = r8.getString(r9)
                r9 = 14
                int r9 = kg3.C76577a.m92151b(r3, r9)
                r5.mo107568m(r8, r2, r9)
                yd2.c r2 = new yd2.c
                r2.<init>(r1, r3)
                r5.f225771i = r2
                yd2.d r2 = new yd2.d
                r2.<init>(r1)
                r5.f225773j = r2
                yd2.e r2 = new yd2.e
                r2.<init>(r1, r4)
                r5.f225782p = r2
                yd2.f r2 = new yd2.f
                r2.<init>(r1, r4)
                r5.f225787r = r2
                r5.mo107573q()
                goto L_0x0253
            L_0x0145:
                xd2.c r4 = new xd2.c
                r4.<init>()
                r1.f232197c = r4
                r4.f230562b = r11
                r4.f230563c = r10
                r4.f230564d = r3
                com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PAT_PROFILE_AVATAR_BOOLEAN_SYNC
                di3.d r12 = di3.C86312j.m106911c(r8)
                ud2.h r12 = (ud2.C78150h) r12
                boolean r12 = r12.zx0()
                r13 = 5
                if (r12 == 0) goto L_0x01c9
                f40.o r12 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r12 = r12.mo121142i()
                com.tencent.mm.storage.y1$a r15 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PAT_AVATAR_REVOKE_TIP_BOOLEAN_SYNC
                boolean r12 = r12.mo119686g(r15, r2)
                if (r12 == 0) goto L_0x01c9
                if (r11 != r13) goto L_0x018d
                f40.o r12 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r12 = r12.mo121142i()
                boolean r12 = r12.mo119686g(r4, r2)
                if (r12 == 0) goto L_0x018d
                android.content.res.Resources r12 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r6 = 2131834858(0x7f1137ea, float:1.9302838E38)
                java.lang.String r6 = r12.getString(r6)
                goto L_0x0198
            L_0x018d:
                android.content.res.Resources r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r7 = 2131834864(0x7f1137f0, float:1.930285E38)
                java.lang.String r6 = r6.getString(r7)
            L_0x0198:
                android.content.res.Resources r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r12 = 2131834865(0x7f1137f1, float:1.9302852E38)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
                r2[r5] = r16
                java.lang.String r2 = r7.getString(r12, r2)
                r1.mo109013b(r6, r2)
                f40.o r2 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()
                java.lang.Boolean r6 = java.lang.Boolean.FALSE
                r2.mo119677K(r15, r6)
                if (r11 != r13) goto L_0x01ff
                f40.o r2 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()
                r2.mo119677K(r4, r6)
                goto L_0x01ff
            L_0x01c9:
                if (r11 != r13) goto L_0x01ff
                f40.o r6 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r6 = r6.mo121142i()
                boolean r2 = r6.mo119686g(r4, r2)
                if (r2 == 0) goto L_0x01ff
                android.content.res.Resources r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r6 = 2131834157(0x7f11352d, float:1.9301416E38)
                java.lang.String r2 = r2.getString(r6)
                android.content.res.Resources r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getResources()
                r7 = 2131834156(0x7f11352c, float:1.9301414E38)
                java.lang.String r6 = r6.getString(r7)
                r1.mo109013b(r2, r6)
                f40.o r2 = f40.C86709a0.m107535s()
                com.tencent.mm.storage.v1 r2 = r2.mo121142i()
                java.lang.Boolean r6 = java.lang.Boolean.FALSE
                r2.mo119677K(r4, r6)
            L_0x01ff:
                di3.d r2 = di3.C86312j.m106911c(r8)
                ud2.h r2 = (ud2.C78150h) r2
                vd2.e r4 = r1.f232195a
                android.view.View r4 = (android.view.View) r4
                r2.getClass()
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                r6 = 2130772000(0x7f010020, float:1.7147106E38)
                android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r2, r6)
                r4.startAnimation(r2)
                vd2.e r2 = r1.f232195a
                android.view.View r2 = (android.view.View) r2
                r2.performHapticFeedback(r5, r14)
                di3.d r2 = di3.C86312j.m106911c(r9)
                vd2.d r2 = (vd2.C78384d) r2
                android.util.Pair r2 = r2.mo108133vk(r11, r10, r3)
                if (r2 == 0) goto L_0x0253
                xd2.c r4 = r1.f232197c
                r4.f230565e = r2
                vd2.f r2 = r1.f232196b
                if (r2 == 0) goto L_0x0253
                di3.d r4 = di3.C86312j.m106911c(r9)
                vd2.d r4 = (vd2.C78384d) r4
                vd2.f r5 = r1.f232196b
                float r5 = r5.getTipTextSize()
                int r5 = (int) r5
                float r5 = (float) r5
                java.lang.CharSequence r3 = r4.mo108131re(r3, r10, r5)
                r2.mo96445o(r3)
                com.tencent.mm.sdk.platformtools.MMHandler r1 = r1.f232199e
                r2 = 293(0x125, float:4.1E-43)
                r3 = 3000(0xbb8, double:1.482E-320)
                r1.sendEmptyMessageDelayed(r2, r3)
            L_0x0253:
                r1 = 0
                r0.f232201a = r1
                goto L_0x02bf
            L_0x0258:
                yd2.b r2 = yd2.C79069b.this
                vd2.e r2 = r2.f232195a
                if (r2 == 0) goto L_0x0279
                android.view.View$OnClickListener r2 = r2.getOnClickListener()
                if (r2 == 0) goto L_0x0279
                java.lang.String r2 = "single click"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                yd2.b r2 = yd2.C79069b.this
                vd2.e r2 = r2.f232195a
                android.view.View$OnClickListener r2 = r2.getOnClickListener()
                java.lang.Object r1 = r1.obj
                android.view.View r1 = (android.view.View) r1
                r2.onClick(r1)
            L_0x0279:
                r2 = 0
                r0.f232201a = r2
                goto L_0x02bf
            L_0x027e:
                r2 = 0
                long r5 = java.lang.System.currentTimeMillis()
                long r7 = r0.f232201a
                r9 = 291(0x123, float:4.08E-43)
                int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r10 <= 0) goto L_0x02ad
                long r2 = r5 - r7
                int r7 = yd2.C79069b.f232194f
                long r7 = (long) r7
                int r10 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r10 >= 0) goto L_0x02ad
                java.lang.String r2 = "double click"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)
                r0.removeMessages(r9)
                yd2.b r2 = yd2.C79069b.this
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.f232199e
                r3 = 292(0x124, float:4.09E-43)
                java.lang.Object r1 = r1.obj
                android.os.Message r1 = r2.obtainMessage(r3, r1)
                r0.sendMessage(r1)
                goto L_0x02bd
            L_0x02ad:
                yd2.b r2 = yd2.C79069b.this
                com.tencent.mm.sdk.platformtools.MMHandler r2 = r2.f232199e
                java.lang.Object r1 = r1.obj
                android.os.Message r1 = r2.obtainMessage(r9, r1)
                int r2 = yd2.C79069b.f232194f
                long r2 = (long) r2
                r0.sendMessageDelayed(r1, r2)
            L_0x02bd:
                r0.f232201a = r5
            L_0x02bf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yd2.C79069b.C79071b.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: yd2.b$c */
    public class C79072c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76868a0 f232203d;

        public C79072c(C76868a0 a0Var) {
            this.f232203d = a0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/patmsg/ui/PatHandler$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f232203d.mo140680z();
            C78800c cVar = C79069b.this.f232197c;
            C117292a.m165361g(this, "com/tencent/mm/plugin/patmsg/ui/PatHandler$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public void mo109012a() {
        Log.m105918d("MicroMsg.PatHandler", "onDetachPatMsgView");
        this.f232199e.removeMessages(JsApiSetAudioState.CTRL_INDEX);
        this.f232197c = null;
    }

    /* renamed from: b */
    public final void mo109013b(String str, String str2) {
        C76868a0 a0Var = new C76868a0(((View) this.f232195a).getContext());
        a0Var.f224686L.setText(str);
        a0Var.f224687M.setText(str2);
        a0Var.f224688N.setOnClickListener(new C79072c(a0Var));
        a0Var.mo140655A();
    }
}
