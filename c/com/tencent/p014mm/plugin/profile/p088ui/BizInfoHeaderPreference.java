package com.tencent.p014mm.plugin.profile.p088ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileHdHeadImg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import k20.C9556a;
import p196ln.C10579k;
import p196ln.C76706g;
import p248ug.C52558c;
import sf2.C48375a;
import sf2.C48376b;

/* renamed from: com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference */
public class BizInfoHeaderPreference extends Preference implements C10579k.C10580a, MStorageEx.IOnStorageChange {

    /* renamed from: J */
    public ImageView f115313J;

    /* renamed from: K */
    public ImageView f115314K;

    /* renamed from: L */
    public View f115315L;

    /* renamed from: M */
    public TextView f115316M;

    /* renamed from: N */
    public TextView f115317N;

    /* renamed from: P */
    public C72996z1 f115318P;

    /* renamed from: Q */
    public String f115319Q;

    /* renamed from: R */
    public C52558c f115320R;

    /* renamed from: S */
    public boolean f115321S = false;

    /* renamed from: T */
    public MMActivity f115322T;

    /* renamed from: U */
    public C48375a f115323U = new C48375a(this);

    /* renamed from: V */
    public C48376b f115324V = new C48376b(this);

    /* renamed from: com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference$a */
    public class C42606a implements View.OnClickListener {
        public C42606a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String username = BizInfoHeaderPreference.this.f115318P.getUsername();
            Intent intent = new Intent(BizInfoHeaderPreference.this.f115322T, ProfileHdHeadImg.class);
            intent.putExtra("username", username);
            intent.putExtra("brand_icon_url", BizInfoHeaderPreference.this.f115319Q);
            MMActivity mMActivity = BizInfoHeaderPreference.this.f115322T;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MMActivity mMActivity2 = mMActivity;
            C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/BizInfoHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public BizInfoHeaderPreference(Context context) {
        super(context);
        this.f115322T = (MMActivity) context;
        this.f115321S = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x016a  */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo66730I() {
        /*
            r7 = this;
            boolean r0 = r7.f115321S
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            com.tencent.mm.storage.z1 r0 = r7.f115318P
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            if (r0 != 0) goto L_0x0032
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "initView : bindView = "
            r0.append(r1)
            boolean r1 = r7.f115321S
            r0.append(r1)
            java.lang.String r1 = "contact = "
            r0.append(r1)
            com.tencent.mm.storage.z1 r1 = r7.f115318P
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.BizInfoHeaderPreference"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            return
        L_0x0032:
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            com.tencent.mm.ui.MMActivity r3 = r7.f115322T
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.tencent.mm.storage.z1 r5 = r7.f115318P
            java.lang.String r5 = r5.mo62909j3()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r4.append(r5)
            java.lang.String r5 = " "
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.widget.TextView r5 = r7.f115316M
            float r5 = r5.getTextSize()
            android.text.SpannableString r0 = r0.yp0(r3, r4, r5)
            android.widget.TextView r3 = r7.f115316M
            com.tencent.mm.ui.MMActivity r4 = r7.f115322T
            com.tencent.mm.storage.z1 r5 = r7.f115318P
            java.lang.String r5 = r5.getUsername()
            android.text.SpannableString r0 = com.tencent.p014mm.plugin.profile.C70142g.m82632d(r4, r5, r0)
            r3.setText(r0)
            ug.c r0 = r7.f115320R
            if (r0 != 0) goto L_0x0082
            com.tencent.mm.storage.z1 r0 = r7.f115318P
            java.lang.String r0 = r0.getUsername()
            ug.c r0 = rb0.C47984k.m53328b(r0)
            r7.f115320R = r0
        L_0x0082:
            ug.c r0 = r7.f115320R
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.field_brandIconURL
            r7.f115319Q = r0
        L_0x008a:
            android.widget.ImageView r0 = r7.f115313J
            com.tencent.mm.storage.z1 r3 = r7.f115318P
            java.lang.String r4 = r7.f115319Q
            fx0.C45829j.m51128a(r0, r3, r4, r2)
            android.widget.ImageView r0 = r7.f115313J
            com.tencent.mm.storage.z1 r3 = r7.f115318P
            java.lang.String r3 = r3.getUsername()
            r0.setTag(r3)
            android.view.View r0 = r7.f115315L
            com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference$a r3 = new com.tencent.mm.plugin.profile.ui.BizInfoHeaderPreference$a
            r3.<init>()
            r0.setOnClickListener(r3)
            com.tencent.mm.storage.z1 r0 = r7.f115318P
            boolean r0 = r0.mo62927s3()
            r3 = 8
            if (r0 == 0) goto L_0x0157
            ug.c r0 = r7.f115320R
            if (r0 != 0) goto L_0x00b7
            goto L_0x00bb
        L_0x00b7:
            boolean r1 = r0.mo72810e0()
        L_0x00bb:
            if (r1 == 0) goto L_0x0157
            com.tencent.mm.storage.z1 r0 = r7.f115318P
            java.lang.String r0 = r0.mo62913l2()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00ff
            android.widget.TextView r0 = r7.f115317N
            r0.setVisibility(r2)
            android.widget.TextView r0 = r7.f115317N
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r4 = r7.f121274d
            com.tencent.mm.storage.z1 r5 = r7.f115318P
            java.lang.String r5 = r5.getUsername()
            java.lang.String r4 = com.tencent.p014mm.plugin.profile.C70142g.m82630b(r4, r5)
            r1.append(r4)
            com.tencent.mm.storage.z1 r4 = r7.f115318P
            java.lang.String r4 = r4.getUsername()
            com.tencent.mm.storage.z1 r5 = r7.f115318P
            java.lang.String r5 = r5.mo62913l2()
            java.lang.String r4 = com.tencent.p014mm.plugin.profile.C70142g.m82631c(r4, r5)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            goto L_0x015c
        L_0x00ff:
            com.tencent.mm.storage.z1 r0 = r7.f115318P
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85802I4(r0)
            if (r0 != 0) goto L_0x0151
            com.tencent.mm.storage.z1 r0 = r7.f115318P
            java.lang.String r0 = r0.getUsername()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85796D5(r0)
            if (r0 != 0) goto L_0x0151
            com.tencent.mm.storage.z1 r0 = r7.f115318P
            java.lang.String r0 = r0.mo62911k3()
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            android.widget.TextView r1 = r7.f115317N
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r5 = r7.f121274d
            com.tencent.mm.storage.z1 r6 = r7.f115318P
            java.lang.String r6 = r6.getUsername()
            java.lang.String r5 = com.tencent.p014mm.plugin.profile.C70142g.m82630b(r5, r6)
            r4.append(r5)
            com.tencent.mm.storage.z1 r5 = r7.f115318P
            java.lang.String r5 = r5.getUsername()
            java.lang.String r0 = com.tencent.p014mm.plugin.profile.C70142g.m82631c(r5, r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.setText(r0)
            android.widget.TextView r0 = r7.f115317N
            r0.setVisibility(r2)
            goto L_0x015c
        L_0x0151:
            android.widget.TextView r0 = r7.f115317N
            r0.setVisibility(r3)
            goto L_0x015c
        L_0x0157:
            android.widget.TextView r0 = r7.f115317N
            r0.setVisibility(r3)
        L_0x015c:
            com.tencent.mm.storage.z1 r0 = r7.f115318P
            boolean r0 = r0.mo62934u3()
            if (r0 == 0) goto L_0x016a
            android.widget.ImageView r0 = r7.f115314K
            r0.setVisibility(r2)
            goto L_0x016f
        L_0x016a:
            android.widget.ImageView r0 = r7.f115314K
            r0.setVisibility(r3)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.profile.p088ui.BizInfoHeaderPreference.mo66730I():void");
    }

    /* renamed from: J */
    public void mo66731J(C72996z1 z1Var, String str, C52558c cVar) {
        this.f115319Q = str;
        this.f115320R = cVar;
        mo66732K();
        C97625j3.m125812b().mo105907v().add(this.f115324V);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93556a(this.f115323U);
        this.f115318P = z1Var;
        Assert.assertTrue("initView: contact username is null", Util.nullAsNil(z1Var.getUsername()).length() > 0);
        mo66730I();
    }

    /* renamed from: K */
    public void mo66732K() {
        C97625j3.m125812b().mo105907v().remove(this.f115324V);
        C10579k RE = ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE();
        ((AvatarStorage) RE).f195667a.remove(this.f115323U);
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        if (!(this.f115321S && this.f115318P != null)) {
            Log.m105920e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.f115321S + "contact = " + this.f115318P);
        } else if (Util.nullAsNil(str).length() <= 0) {
            Log.m105920e("MicroMsg.BizInfoHeaderPreference", "notifyChanged: user = " + str);
        } else if (str.equals(this.f115318P.getUsername())) {
            mo66730I();
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        C72996z1 z1Var;
        boolean z = true;
        if (obj == null || !(obj instanceof String)) {
            Log.m105919d("MicroMsg.BizInfoHeaderPreference", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        if (!this.f115321S || this.f115318P == null) {
            z = false;
        }
        if (!z) {
            Log.m105920e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.f115321S + "contact = " + this.f115318P);
            return;
        }
        String str = (String) obj;
        if (Util.nullAsNil(str).length() > 0 && (z1Var = this.f115318P) != null && z1Var.getUsername().equals(str)) {
            this.f115318P = C97625j3.m125812b().mo105907v().get(str);
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        Log.m105918d("MicroMsg.BizInfoHeaderPreference", "onBindView");
        this.f115316M = (TextView) view.findViewById(C0966R.C0970id.bo9);
        this.f115317N = (TextView) view.findViewById(C0966R.C0970id.boz);
        this.f115314K = (ImageView) view.findViewById(C0966R.C0970id.a_x);
        this.f115313J = (ImageView) view.findViewById(C0966R.C0970id.bmx);
        this.f115315L = view.findViewById(C0966R.C0970id.bmy);
        this.f115321S = true;
        mo66730I();
        super.mo1086w(view);
    }

    public BizInfoHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f115322T = (MMActivity) context;
        this.f115321S = false;
    }

    public BizInfoHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f115322T = (MMActivity) context;
        this.f115321S = false;
    }
}
