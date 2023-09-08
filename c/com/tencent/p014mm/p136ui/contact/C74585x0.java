package com.tencent.p014mm.p136ui.contact;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import eb0.C97625j3;
import fd0.C75743h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p154fy.C87121j;

/* renamed from: com.tencent.mm.ui.contact.x0 */
public class C74585x0 extends RelativeLayout {

    /* renamed from: n */
    public static Boolean f219236n = Boolean.TRUE;

    /* renamed from: d */
    public Context f219237d = null;

    /* renamed from: e */
    public View f219238e = null;

    /* renamed from: f */
    public View f219239f = null;

    /* renamed from: g */
    public boolean f219240g = true;

    /* renamed from: h */
    public final MTimerHandler f219241h = new MTimerHandler(new C6940a(), true);

    /* renamed from: i */
    public MStorage.IOnStorageChange f219242i = new C6941b();

    /* renamed from: j */
    public boolean f219243j = false;

    /* renamed from: com.tencent.mm.ui.contact.x0$a */
    public class C6940a implements MTimerHandler.CallBack {
        public C6940a() {
        }

        public boolean onTimerExpired() {
            Log.m105918d("MicroMsg.FMessageContactView", "refresh timer expired, update");
            C74585x0.this.mo103638c();
            C74585x0.this.mo103636a();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.x0$b */
    public class C6941b implements MStorage.IOnStorageChange {
        public C6941b() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Log.m105918d("MicroMsg.FMessageContactView", "onNotifyChange, fmsg change");
            if (!C74585x0.this.f219241h.stopped()) {
                C74585x0.this.f219241h.stopTimer();
            }
            C74585x0 x0Var = C74585x0.this;
            x0Var.f219241h.startTimer(x0Var.f219243j ? 500 : 1000);
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.x0$c */
    public class C6942c implements View.OnTouchListener {
        public C6942c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/contact/FMessageContactView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            Context context = C74585x0.this.f219237d;
            if (context instanceof MMActivity) {
                ((MMActivity) context).hideVKB();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/contact/FMessageContactView$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public C74585x0(Context context) {
        super(context);
        this.f219237d = context;
        C75743h.vx0().add(this.f219242i);
        mo103638c();
        mo103636a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x039a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x03a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103636a() {
        /*
            r27 = this;
            r0 = r27
            java.lang.Class<ln.f> r1 = p196ln.C76705f.class
            com.tencent.mm.storage.l3 r2 = fd0.C75743h.vx0()
            r2.getClass()
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 4
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 0
            r4[r7] = r6
            java.lang.String r6 = "MicroMsg.FMessageConversationStorage"
            java.lang.String r8 = "getNewLimit, limit = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r6, r8, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f212805d
            java.lang.String r6 = "select * from fmessage_conversation  where isNew = 1 ORDER BY lastModifiedTime DESC limit 4"
            r8 = 0
            r9 = 2
            android.database.Cursor r2 = r2.rawQuery(r6, r8, r9)
        L_0x002c:
            boolean r6 = r2.moveToNext()
            if (r6 == 0) goto L_0x0046
            com.tencent.mm.storage.k3 r6 = new com.tencent.mm.storage.k3
            r6.<init>()
            r6.convertFrom(r2)
            java.lang.String r10 = r6.field_talker
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x002c
            r4.add(r6)
            goto L_0x002c
        L_0x0046:
            r2.close()
            int r2 = r4.size()
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r6[r7] = r10
            java.lang.String r10 = "MicroMsg.FMessageContactView"
            java.lang.String r11 = "init new fconv size = %d (max is 4)"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r11, r6)
            r27.removeAllViews()
            java.lang.String r11 = ""
            r13 = 2131305012(0x7f092234, float:1.8228183E38)
            if (r2 > 0) goto L_0x00d8
            android.content.Context r1 = r0.f219237d
            if (r1 != 0) goto L_0x0070
            java.lang.String r1 = "initNoNew failed. context is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            goto L_0x00d3
        L_0x0070:
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r1)
            r2 = 2131495636(0x7f0c0ad4, float:1.8614814E38)
            android.view.View r1 = r1.inflate(r2, r0)
            r0.f219238e = r1
            r2 = 2131305031(0x7f092247, float:1.8228221E38)
            android.view.View r1 = r1.findViewById(r2)
            r0.f219239f = r1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.content.Context r2 = r0.f219237d
            r4 = 2131165246(0x7f07003e, float:1.7944704E38)
            int r2 = kg3.C76577a.m92155f(r2, r4)
            float r2 = (float) r2
            android.content.Context r4 = r0.f219237d
            float r4 = kg3.C76577a.m92175z(r4)
            float r2 = r2 * r4
            int r2 = (int) r2
            r1.height = r2
            android.view.View r2 = r0.f219239f
            r2.setLayoutParams(r1)
            android.view.View r1 = r0.f219238e
            com.tencent.mm.ui.contact.y0 r2 = new com.tencent.mm.ui.contact.y0
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f219238e
            android.view.View r1 = r1.findViewById(r13)
            com.tencent.mm.ui.base.MaskLayout r1 = (com.tencent.p014mm.p136ui.base.MaskLayout) r1
            java.lang.Class<ln.g> r2 = p196ln.C76706g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ln.g r2 = (p196ln.C76706g) r2
            ln.k r2 = r2.mo106826RE()
            com.tencent.mm.modelavatar.AvatarStorage r2 = (com.tencent.p014mm.modelavatar.AvatarStorage) r2
            java.lang.String r4 = "fmessage"
            android.graphics.Bitmap r2 = r2.mo93563l(r4)
            android.view.View r1 = r1.getContentView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1.setImageBitmap(r2)
        L_0x00d3:
            r2 = 2131305017(0x7f092239, float:1.8228193E38)
            goto L_0x0316
        L_0x00d8:
            if (r2 != r3) goto L_0x0245
            java.lang.Object r2 = r4.get(r7)
            com.tencent.mm.storage.k3 r2 = (com.tencent.p014mm.storage.C72979k3) r2
            android.content.Context r4 = r0.f219237d
            if (r4 != 0) goto L_0x00ea
            java.lang.String r1 = "initSingleNew failed. context is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            goto L_0x00d3
        L_0x00ea:
            boolean r4 = kg3.C76577a.m92147C(r4)
            if (r4 == 0) goto L_0x0100
            android.content.Context r4 = r0.f219237d
            android.view.LayoutInflater r4 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r4)
            r15 = 2131495639(0x7f0c0ad7, float:1.861482E38)
            android.view.View r4 = r4.inflate(r15, r0)
            r0.f219238e = r4
            goto L_0x010f
        L_0x0100:
            android.content.Context r4 = r0.f219237d
            android.view.LayoutInflater r4 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r4)
            r15 = 2131495638(0x7f0c0ad6, float:1.8614818E38)
            android.view.View r4 = r4.inflate(r15, r0)
            r0.f219238e = r4
        L_0x010f:
            android.view.View r4 = r0.f219238e
            r15 = 2131305036(0x7f09224c, float:1.8228231E38)
            android.view.View r4 = r4.findViewById(r15)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.Class<ny.h> r15 = p629ny.C76979h.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            ny.h r15 = (p629ny.C76979h) r15
            android.content.Context r8 = r0.f219237d
            java.lang.String r13 = r2.field_displayName
            android.text.SpannableString r8 = r15.mo107057T1(r8, r13)
            r4.setText(r8)
            android.view.View r4 = r0.f219238e
            r8 = 2131305035(0x7f09224b, float:1.822823E38)
            android.view.View r4 = r4.findViewById(r8)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.storage.n3 r8 = fd0.C75743h.wx0()
            java.lang.String r13 = r2.field_talker
            com.tencent.mm.storage.m3 r8 = r8.mo101187Ow(r13)
            android.content.Context r13 = r0.f219237d
            int r15 = r8.field_type
            int r12 = r2.field_addScene
            java.lang.String r6 = r8.field_msgContent
            boolean r8 = r8.mo101179l2()
            r8 = r8 ^ r3
            java.lang.Object[] r14 = new java.lang.Object[r5]
            java.lang.Integer r20 = java.lang.Integer.valueOf(r15)
            r14[r7] = r20
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14[r3] = r12
            r14[r9] = r6
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            r12 = 3
            r14[r12] = r9
            java.lang.String r9 = "MicroMsg.FMessageProvider"
            java.lang.String r12 = "setDigest, fmsgType = %d, fmsgScene = %d, fmsgContent = %s, isSend = %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r12, r14)
            if (r15 != 0) goto L_0x01e2
            if (r6 != 0) goto L_0x0179
            java.lang.String r5 = "setDigest fail, fmsgContent is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r5)
            r8 = 0
            goto L_0x0203
        L_0x0179:
            com.tencent.mm.storage.f4$b r6 = com.tencent.p014mm.storage.C72963f4.C72964b.m85654f(r6)
            int r8 = r6.f212681g
            if (r8 == r5) goto L_0x01da
            r5 = 10
            if (r8 == r5) goto L_0x01b4
            r5 = 11
            if (r8 == r5) goto L_0x01b4
            r5 = 31
            if (r8 == r5) goto L_0x01ac
            r5 = 32
            if (r8 == r5) goto L_0x01a4
            switch(r8) {
                case 58: goto L_0x019c;
                case 59: goto L_0x019c;
                case 60: goto L_0x019c;
                default: goto L_0x0194;
            }
        L_0x0194:
            r5 = 2131823466(0x7f110b6a, float:1.9279732E38)
            java.lang.String r5 = r13.getString(r5)
            goto L_0x0202
        L_0x019c:
            r5 = 2131823460(0x7f110b64, float:1.927972E38)
            java.lang.String r5 = r13.getString(r5)
            goto L_0x0202
        L_0x01a4:
            r5 = 2131823467(0x7f110b6b, float:1.9279734E38)
            java.lang.String r5 = r13.getString(r5)
            goto L_0x0202
        L_0x01ac:
            r5 = 2131823473(0x7f110b71, float:1.9279747E38)
            java.lang.String r5 = r13.getString(r5)
            goto L_0x0202
        L_0x01b4:
            com.tencent.mm.autogen.events.FMsgGetNameEvent r5 = new com.tencent.mm.autogen.events.FMsgGetNameEvent
            r5.<init>()
            com.tencent.mm.autogen.events.FMsgGetNameEvent$a r8 = r5.f193611d
            java.lang.String r9 = r6.f212682h
            r8.f193613a = r9
            java.lang.String r6 = r6.f212683i
            r8.f193614b = r6
            r5.publish()
            r6 = 2131823462(0x7f110b66, float:1.9279724E38)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            com.tencent.mm.autogen.events.FMsgGetNameEvent$b r5 = r5.f193612e
            java.lang.String r5 = r5.f193615a
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r11)
            r8[r7] = r5
            java.lang.String r5 = r13.getString(r6, r8)
            goto L_0x0202
        L_0x01da:
            r5 = 2131823457(0x7f110b61, float:1.9279714E38)
            java.lang.String r5 = r13.getString(r5)
            goto L_0x0202
        L_0x01e2:
            if (r8 == 0) goto L_0x01e6
            r8 = r6
            goto L_0x0203
        L_0x01e6:
            com.tencent.mm.storage.f4$h r5 = com.tencent.p014mm.storage.C72963f4.C72971h.m85668v(r6)
            java.lang.String r6 = r5.f212742f
            if (r6 == 0) goto L_0x01fb
            java.lang.String r6 = r6.trim()
            boolean r6 = r6.equals(r11)
            if (r6 != 0) goto L_0x01fb
            java.lang.String r5 = r5.f212742f
            goto L_0x0202
        L_0x01fb:
            r5 = 2131830284(0x7f11260c, float:1.929356E38)
            java.lang.String r5 = r13.getString(r5)
        L_0x0202:
            r8 = r5
        L_0x0203:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r5 == 0) goto L_0x020f
            r5 = 8
            r4.setVisibility(r5)
            goto L_0x0212
        L_0x020f:
            r4.setText(r8)
        L_0x0212:
            android.view.View r4 = r0.f219238e
            r5 = 2131305017(0x7f092239, float:1.8228193E38)
            android.view.View r4 = r4.findViewById(r5)
            r0.f219239f = r4
            android.view.View r4 = r0.f219238e
            com.tencent.mm.ui.contact.z0 r5 = new com.tencent.mm.ui.contact.z0
            r5.<init>(r0)
            r4.setOnClickListener(r5)
            android.view.View r4 = r0.f219238e
            r5 = 2131305012(0x7f092234, float:1.8228183E38)
            android.view.View r4 = r4.findViewById(r5)
            com.tencent.mm.ui.base.MaskLayout r4 = (com.tencent.p014mm.p136ui.base.MaskLayout) r4
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.f r1 = (p196ln.C76705f) r1
            android.view.View r4 = r4.getContentView()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.String r2 = r2.field_talker
            r1.mo106849z(r4, r2)
            goto L_0x00d3
        L_0x0245:
            android.content.Context r2 = r0.f219237d
            if (r2 != 0) goto L_0x0250
            java.lang.String r1 = "initMultiNew failed. context is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r1)
            goto L_0x00d3
        L_0x0250:
            r5 = 2131495637(0x7f0c0ad5, float:1.8614816E38)
            android.view.View r2 = android.view.View.inflate(r2, r5, r0)
            r0.f219238e = r2
            int r2 = r4.size()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5[r7] = r6
            java.lang.String r6 = "initMultiNew, newList size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r6, r5)
            java.lang.Object r5 = r4.get(r7)
            com.tencent.mm.storage.k3 r5 = (com.tencent.p014mm.storage.C72979k3) r5
            android.view.View r6 = r0.f219238e
            r8 = 2131305012(0x7f092234, float:1.8228183E38)
            android.view.View r6 = r6.findViewById(r8)
            com.tencent.mm.ui.base.MaskLayout r6 = (com.tencent.p014mm.p136ui.base.MaskLayout) r6
            di3.d r8 = di3.C86312j.m106911c(r1)
            ln.f r8 = (p196ln.C76705f) r8
            android.view.View r12 = r6.getContentView()
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            java.lang.String r5 = r5.field_talker
            r8.mo106849z(r12, r5)
            r6.setVisibility(r7)
            java.lang.Object r5 = r4.get(r3)
            com.tencent.mm.storage.k3 r5 = (com.tencent.p014mm.storage.C72979k3) r5
            android.view.View r6 = r0.f219238e
            r8 = 2131305013(0x7f092235, float:1.8228185E38)
            android.view.View r6 = r6.findViewById(r8)
            com.tencent.mm.ui.base.MaskLayout r6 = (com.tencent.p014mm.p136ui.base.MaskLayout) r6
            di3.d r8 = di3.C86312j.m106911c(r1)
            ln.f r8 = (p196ln.C76705f) r8
            android.view.View r12 = r6.getContentView()
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            java.lang.String r5 = r5.field_talker
            r8.mo106849z(r12, r5)
            r6.setVisibility(r7)
            if (r2 <= r9) goto L_0x02db
            java.lang.Object r5 = r4.get(r9)
            com.tencent.mm.storage.k3 r5 = (com.tencent.p014mm.storage.C72979k3) r5
            android.view.View r6 = r0.f219238e
            r8 = 2131305014(0x7f092236, float:1.8228187E38)
            android.view.View r6 = r6.findViewById(r8)
            com.tencent.mm.ui.base.MaskLayout r6 = (com.tencent.p014mm.p136ui.base.MaskLayout) r6
            di3.d r8 = di3.C86312j.m106911c(r1)
            ln.f r8 = (p196ln.C76705f) r8
            android.view.View r9 = r6.getContentView()
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            java.lang.String r5 = r5.field_talker
            r8.mo106849z(r9, r5)
            r6.setVisibility(r7)
        L_0x02db:
            r5 = 3
            if (r2 <= r5) goto L_0x0303
            java.lang.Object r2 = r4.get(r5)
            com.tencent.mm.storage.k3 r2 = (com.tencent.p014mm.storage.C72979k3) r2
            android.view.View r4 = r0.f219238e
            r5 = 2131305015(0x7f092237, float:1.8228189E38)
            android.view.View r4 = r4.findViewById(r5)
            com.tencent.mm.ui.base.MaskLayout r4 = (com.tencent.p014mm.p136ui.base.MaskLayout) r4
            di3.d r1 = di3.C86312j.m106911c(r1)
            ln.f r1 = (p196ln.C76705f) r1
            android.view.View r5 = r4.getContentView()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.lang.String r2 = r2.field_talker
            r1.mo106849z(r5, r2)
            r4.setVisibility(r7)
        L_0x0303:
            android.view.View r1 = r0.f219238e
            r2 = 2131305017(0x7f092239, float:1.8228193E38)
            android.view.View r1 = r1.findViewById(r2)
            r0.f219239f = r1
            com.tencent.mm.ui.contact.a1 r4 = new com.tencent.mm.ui.contact.a1
            r4.<init>(r0)
            r1.setOnClickListener(r4)
        L_0x0316:
            android.view.View r1 = r0.f219238e
            android.view.View r12 = r1.findViewById(r2)
            if (r12 == 0) goto L_0x0365
            boolean r1 = r0.f219240g
            if (r1 == 0) goto L_0x0324
            r5 = 0
            goto L_0x0326
        L_0x0324:
            r5 = 8
        L_0x0326:
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1.mo10233c(r2)
            java.lang.Object[] r20 = r1.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/contact/FMessageContactView"
            java.lang.String r22 = "init"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r12
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r1 = r1.mo10231a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r12.setVisibility(r1)
            java.lang.String r13 = "com/tencent/mm/ui/contact/FMessageContactView"
            java.lang.String r14 = "init"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
        L_0x0365:
            android.view.View r1 = r0.f219239f
            com.tencent.mm.ui.contact.x0$c r2 = new com.tencent.mm.ui.contact.x0$c
            r2.<init>()
            r1.setOnTouchListener(r2)
            com.tencent.mm.storage.l3 r1 = fd0.C75743h.vx0()
            int r1 = r1.mo101166Ow()
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r7] = r3
            java.lang.String r3 = "init totalNewSize = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r3, r2)
            android.view.View r2 = r0.f219238e
            r3 = 2131305029(0x7f092245, float:1.8228217E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r3 = r0.f219237d
            int r3 = com.tencent.p014mm.p136ui.tools.C45081s1.m49932a(r3)
            r2.setBackgroundResource(r3)
            if (r1 > 0) goto L_0x03a4
            r3 = 8
            r2.setVisibility(r3)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            f219236n = r1
            goto L_0x03d4
        L_0x03a4:
            r2.setVisibility(r7)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            f219236n = r3
            r3 = 99
            if (r1 <= r3) goto L_0x03b9
            r2.setText(r11)
            r1 = 2131755223(0x7f1000d7, float:1.914132E38)
            r2.setBackgroundResource(r1)
            goto L_0x03d4
        L_0x03b9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r11)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
            android.content.Context r3 = r0.f219237d
            int r1 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r3, r1)
            r2.setBackgroundResource(r1)
        L_0x03d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.contact.C74585x0.mo103636a():void");
    }

    /* renamed from: b */
    public void mo103637b() {
        if (C97625j3.m125812b().mo105906u().mo119688i(143618, 0) > 0) {
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71215V9("fmessage", 2);
        }
        C97625j3.m125812b().mo105906u().mo119676J(143618, 0);
    }

    /* renamed from: c */
    public final void mo103638c() {
        int Ow = C75743h.vx0().mo101166Ow();
        Log.m105927v("MicroMsg.FMessageContactView", "updateAddressTabUnread, newCount update to = %d", Integer.valueOf(Ow));
        if (Ow > 0) {
            C97625j3.m125812b().mo105906u().mo119676J(143618, Integer.valueOf(Ow));
        }
    }

    public void setFrontGround(boolean z) {
        this.f219243j = z;
    }

    public void setVisible(boolean z) {
        Log.m105918d("MicroMsg.FMessageContactView", "setVisible visible = " + z);
        View findViewById = this.f219238e.findViewById(C0966R.C0970id.eau);
        if (findViewById != null) {
            int i = z ? 0 : 8;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/contact/FMessageContactView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/contact/FMessageContactView", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f219240g = z;
    }
}
