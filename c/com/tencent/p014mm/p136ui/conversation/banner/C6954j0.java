package com.tencent.p014mm.p136ui.conversation.banner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import xd3.C78802b;

/* renamed from: com.tencent.mm.ui.conversation.banner.j0 */
public class C6954j0 extends C78802b {

    /* renamed from: h */
    public View f24657h;

    /* renamed from: i */
    public View f24658i;

    /* renamed from: j */
    public TextView f24659j;

    /* renamed from: n */
    public WeImageView f24660n;

    /* renamed from: com.tencent.mm.ui.conversation.banner.j0$a */
    public class C6955a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f24661d;

        public C6955a(Intent intent) {
            this.f24661d = intent;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/conversation/banner/OtherOnlineBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C88144b.m109791i(C6954j0.this.f230570g.get(), "webwx", ".ui.WebWXLogoutUI", this.f24661d, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C6954j0(Context context) {
        super(context);
        View view = this.f230569f;
        if (view != null) {
            this.f24658i = view.findViewById(C0966R.C0970id.a7e);
            this.f24657h = this.f230569f.findViewById(C0966R.C0970id.a7i);
            WeImageView weImageView = (WeImageView) this.f230569f.findViewById(C0966R.C0970id.a7g);
            this.f24660n = weImageView;
            weImageView.setIconColor(this.f230570g.get().getResources().getColor(C0966R.color.BW_50));
            this.f24659j = (TextView) this.f230569f.findViewById(C0966R.C0970id.a7j);
        }
    }

    /* renamed from: a */
    public void mo7968a() {
    }

    /* renamed from: b */
    public int mo7969b() {
        return C0966R.C0971layout.bm5;
    }

    /* renamed from: c */
    public int mo7974c() {
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03b3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7970e() {
        /*
            r12 = this;
            boolean r0 = r12.f230567d
            r1 = 0
            if (r0 == 0) goto L_0x0017
            boolean r2 = r12.f230568e
            if (r2 == 0) goto L_0x0017
            android.view.View r0 = r12.f24658i
            r2 = 2131235307(0x7f0811eb, float:1.8086804E38)
            r0.setBackgroundResource(r2)
            android.widget.TextView r0 = r12.f24659j
            r0.setBackground(r1)
            goto L_0x0055
        L_0x0017:
            r2 = 2131233600(0x7f080b40, float:1.8083342E38)
            r3 = 2131233605(0x7f080b45, float:1.8083352E38)
            if (r0 == 0) goto L_0x0032
            android.view.View r0 = r12.f24657h
            r0.setBackgroundResource(r3)
            android.view.View r0 = r12.f24658i
            r3 = 2131233603(0x7f080b43, float:1.8083348E38)
            r0.setBackgroundResource(r3)
            android.widget.TextView r0 = r12.f24659j
            r0.setBackgroundResource(r2)
            goto L_0x0055
        L_0x0032:
            boolean r0 = r12.f230568e
            if (r0 == 0) goto L_0x0046
            android.view.View r0 = r12.f24657h
            r0.setBackgroundResource(r3)
            android.view.View r0 = r12.f24658i
            r0.setBackgroundResource(r2)
            android.widget.TextView r0 = r12.f24659j
            r0.setBackground(r1)
            goto L_0x0055
        L_0x0046:
            android.view.View r0 = r12.f24657h
            r0.setBackgroundResource(r3)
            android.view.View r0 = r12.f24658i
            r0.setBackground(r1)
            android.widget.TextView r0 = r12.f24659j
            r0.setBackgroundResource(r2)
        L_0x0055:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105884J()
            r2 = 8
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x009a
            eb0.c r0 = eb0.C97625j3.m125812b()
            r0.getClass()
            f40.C86709a0.m107528h()
            f40.e r0 = f40.C86709a0.m107523b()
            int r0 = r0.f251760k
            int r5 = e62.C75554c.f221953h
            if (r5 != r0) goto L_0x0079
            r0 = 0
            goto L_0x007a
        L_0x0079:
            r0 = 1
        L_0x007a:
            if (r0 == 0) goto L_0x009a
            ob0.b0 r0 = eb0.C97625j3.m125815e()
            e62.c r1 = new e62.c
            eb0.c r3 = eb0.C97625j3.m125812b()
            r3.getClass()
            f40.C86709a0.m107528h()
            f40.e r3 = f40.C86709a0.m107523b()
            int r3 = r3.f251760k
            r1.<init>(r3)
            r0.mo123460f(r1)
            goto L_0x03ac
        L_0x009a:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105884J()
            r5 = 2131757045(0x7f1007f5, float:1.9145015E38)
            r6 = 2
            if (r0 == 0) goto L_0x0359
            java.lang.String r0 = e62.C75554c.f221950e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0359
            int r0 = e62.C75554c.f221955j
            r0 = r0 & r6
            if (r0 == 0) goto L_0x00b7
            r0 = 1
            goto L_0x00b8
        L_0x00b7:
            r0 = 0
        L_0x00b8:
            if (r0 != 0) goto L_0x0359
            java.util.ArrayList<e62.c$b> r0 = e62.C75554c.f221952g
            if (r0 == 0) goto L_0x00c6
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x00c6
            r0 = 1
            goto L_0x00c7
        L_0x00c6:
            r0 = 0
        L_0x00c7:
            if (r0 == 0) goto L_0x0147
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 2131833822(0x7f1133de, float:1.9300737E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.util.ArrayList r11 = e62.C75554c.m90589l1()
            int r11 = r11.size()
            r10.append(r11)
            java.lang.String r11 = ""
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9[r4] = r10
            java.lang.String r7 = r7.getString(r8, r9)
            r0.<init>(r7)
            java.util.ArrayList r7 = e62.C75554c.m90589l1()
            java.util.Iterator r7 = r7.iterator()
        L_0x00fe:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0113
            java.lang.Object r8 = r7.next()
            e62.c$b r8 = (e62.C75554c.C75555b) r8
            boolean r9 = r8.f221970x
            if (r9 != 0) goto L_0x00fe
            boolean r9 = r8.f221959A
            if (r9 == 0) goto L_0x00fe
            r1 = r8
        L_0x0113:
            boolean r7 = eb0.C75592q0.m90765M()
            java.lang.String r8 = "，"
            if (r7 == 0) goto L_0x0127
            if (r1 == 0) goto L_0x0140
            r0.append(r8)
            java.lang.String r1 = r1.f221965s
            r0.append(r1)
            goto L_0x0140
        L_0x0127:
            r0.append(r8)
            if (r1 == 0) goto L_0x0132
            java.lang.String r1 = r1.f221966t
            r0.append(r1)
            goto L_0x0140
        L_0x0132:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r7 = 2131833821(0x7f1133dd, float:1.9300735E38)
            java.lang.String r1 = r1.getString(r7)
            r0.append(r1)
        L_0x0140:
            android.widget.TextView r1 = r12.f24659j
            r1.setText(r0)
            goto L_0x01b6
        L_0x0147:
            e62.c$b r0 = e62.C75554c.m90588k1()
            boolean r1 = eb0.C75592q0.m90765M()
            java.lang.String r7 = " "
            if (r1 == 0) goto L_0x0181
            if (r0 == 0) goto L_0x0165
            boolean r1 = r0.f221970x
            if (r1 != 0) goto L_0x0165
            boolean r1 = r0.f221959A
            if (r1 == 0) goto L_0x0165
            android.widget.TextView r1 = r12.f24659j
            java.lang.String r0 = r0.f221965s
            r1.setText(r0)
            goto L_0x01b6
        L_0x0165:
            android.widget.TextView r0 = r12.f24659j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = e62.C75554c.f221950e
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = e62.C75554c.f221951f
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            goto L_0x01b6
        L_0x0181:
            if (r0 == 0) goto L_0x019b
            boolean r1 = r0.f221970x
            if (r1 != 0) goto L_0x0193
            boolean r1 = r0.f221959A
            if (r1 == 0) goto L_0x0193
            android.widget.TextView r1 = r12.f24659j
            java.lang.String r0 = r0.f221966t
            r1.setText(r0)
            goto L_0x01b6
        L_0x0193:
            android.widget.TextView r1 = r12.f24659j
            java.lang.String r0 = r0.f221963q
            r1.setText(r0)
            goto L_0x01b6
        L_0x019b:
            android.widget.TextView r0 = r12.f24659j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = e62.C75554c.f221950e
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = e62.C75554c.f221951f
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
        L_0x01b6:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.ref.WeakReference<android.content.Context> r1 = r12.f230570g
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            android.content.res.Resources r1 = r1.getResources()
            r7 = 2131099710(0x7f06003e, float:1.781178E38)
            int r1 = r1.getColor(r7)
            r0.setIconColor(r1)
            int r0 = e62.C75554c.f221954i
            if (r0 != r3) goto L_0x01f1
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131756280(0x7f1004f8, float:1.9143463E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x01f1:
            if (r0 != r6) goto L_0x023b
            e62.c$b r0 = e62.C75554c.m90588k1()
            if (r0 == 0) goto L_0x021c
            boolean r0 = r0.f221959A
            if (r0 == 0) goto L_0x021c
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131756326(0x7f100526, float:1.9143556E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x021c:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131756325(0x7f100525, float:1.9143554E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x023b:
            r1 = 3
            if (r0 != r1) goto L_0x025d
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131756392(0x7f100568, float:1.914369E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x025d:
            r1 = 6
            if (r0 != r1) goto L_0x027f
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131756242(0x7f1004d2, float:1.9143386E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x027f:
            r1 = 7
            if (r0 != r1) goto L_0x02a1
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131755438(0x7f1001ae, float:1.9141755E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x02a1:
            if (r0 != r2) goto L_0x02c2
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131756219(0x7f1004bb, float:1.914334E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x02c2:
            r1 = 9
            if (r0 != r1) goto L_0x02e4
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131756376(0x7f100558, float:1.9143658E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x02e4:
            r1 = 10
            if (r0 != r1) goto L_0x0306
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131756317(0x7f10051d, float:1.9143538E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x0306:
            r1 = 13
            if (r0 != r1) goto L_0x0328
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            r1 = 2131755442(0x7f1001b2, float:1.9141763E38)
            boolean r0 = r12.mo7976h(r0, r1)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.setTag(r5)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r1)
            goto L_0x0342
        L_0x0328:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Object r0 = r0.getTag()
            boolean r0 = r12.mo7976h(r0, r5)
            if (r0 == 0) goto L_0x0342
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0.setTag(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r12.f24660n
            r0.setImageResource(r5)
        L_0x0342:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            int r1 = e62.C75554c.f221953h
            java.lang.String r5 = "intent.key.online_version"
            r0.putExtra(r5, r1)
            android.view.View r1 = r12.f230569f
            com.tencent.mm.ui.conversation.banner.j0$a r5 = new com.tencent.mm.ui.conversation.banner.j0$a
            r5.<init>(r0)
            r1.setOnClickListener(r5)
            goto L_0x03ad
        L_0x0359:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.EX_DEVICE_LOGIN
            if (r0 != 0) goto L_0x0363
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106210y()
            if (r0 == 0) goto L_0x03ac
        L_0x0363:
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105884J()
            if (r0 == 0) goto L_0x03ac
            int r0 = e62.C75554c.f221956n
            int r7 = e62.C75554c.f221954i
            if (r7 != 0) goto L_0x03ac
            if (r0 == r6) goto L_0x0377
            if (r0 != r3) goto L_0x03ac
        L_0x0377:
            android.view.View r7 = r12.f230569f
            r7.setOnClickListener(r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r12.f24660n
            java.lang.Object r1 = r1.getTag()
            boolean r1 = r12.mo7976h(r1, r5)
            if (r1 == 0) goto L_0x0396
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r12.f24660n
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r1.setTag(r7)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r12.f24660n
            r1.setImageResource(r5)
        L_0x0396:
            if (r0 != r6) goto L_0x03a1
            android.widget.TextView r0 = r12.f24659j
            r1 = 2131825271(0x7f111277, float:1.9283393E38)
            r0.setText(r1)
            goto L_0x03ad
        L_0x03a1:
            if (r0 != r3) goto L_0x03ad
            android.widget.TextView r0 = r12.f24659j
            r1 = 2131825273(0x7f111279, float:1.9283397E38)
            r0.setText(r1)
            goto L_0x03ad
        L_0x03ac:
            r3 = 0
        L_0x03ad:
            if (r3 == 0) goto L_0x03b3
            r12.mo7975g(r4)
            goto L_0x03b6
        L_0x03b3:
            r12.mo7975g(r2)
        L_0x03b6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.conversation.banner.C6954j0.mo7970e():boolean");
    }

    /* renamed from: g */
    public void mo7975g(int i) {
        View view = this.f24658i;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: h */
    public final boolean mo7976h(Object obj, int i) {
        return obj == null || ((Integer) obj).intValue() != i;
    }
}
