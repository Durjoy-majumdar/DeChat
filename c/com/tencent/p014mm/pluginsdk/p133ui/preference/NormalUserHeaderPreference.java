package com.tencent.p014mm.pluginsdk.p133ui.preference;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.profile.C70142g;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileDescribeView;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileHdHeadImg;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileLabelView;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileMobilePhoneView;
import com.tencent.p014mm.pluginsdk.p133ui.preference.C72893b;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import g62.C45888s;
import j20.C117292a;
import java.util.ArrayList;
import jr2.C99019x;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C11184p0;
import nj3.C76879j;
import os2.C11766m0;
import p196ln.C10579k;
import p196ln.C76705f;
import p629ny.C76979h;
import uo3.C78253a;

@Deprecated
/* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference */
public class NormalUserHeaderPreference extends Preference implements C10579k.C10580a, MStorageEx.IOnStorageChange, C45888s.C45889a {

    /* renamed from: J */
    public ImageView f212411J;

    /* renamed from: K */
    public TextView f212412K;

    /* renamed from: L */
    public TextView f212413L;

    /* renamed from: M */
    public TextView f212414M;

    /* renamed from: N */
    public TextView f212415N;

    /* renamed from: P */
    public TextView f212416P;

    /* renamed from: Q */
    public View f212417Q;

    /* renamed from: Q0 */
    public C72996z1 f212418Q0;

    /* renamed from: R */
    public Button f212419R;

    /* renamed from: R0 */
    public boolean f212420R0 = false;

    /* renamed from: S */
    public Button f212421S;

    /* renamed from: S0 */
    public MMActivity f212422S0;

    /* renamed from: T */
    public ImageView f212423T;

    /* renamed from: T0 */
    public boolean f212424T0 = false;

    /* renamed from: U */
    public ImageView f212425U;

    /* renamed from: U0 */
    public boolean f212426U0 = false;

    /* renamed from: V */
    public CheckBox f212427V;

    /* renamed from: V0 */
    public boolean f212428V0 = false;

    /* renamed from: W */
    public ImageView f212429W;

    /* renamed from: W0 */
    public boolean f212430W0 = false;

    /* renamed from: X */
    public ImageView f212431X;

    /* renamed from: X0 */
    public boolean f212432X0 = false;

    /* renamed from: Y */
    public LinearLayout f212433Y;

    /* renamed from: Y0 */
    public ProfileMobilePhoneView f212434Y0;

    /* renamed from: Z */
    public Button f212435Z;

    /* renamed from: Z0 */
    public ProfileDescribeView f212436Z0;

    /* renamed from: a1 */
    public ProfileLabelView f212437a1;

    /* renamed from: b1 */
    public TextView f212438b1;

    /* renamed from: p0 */
    public FMessageListView f212439p0;

    /* renamed from: x0 */
    public RelativeLayout f212440x0;

    /* renamed from: y0 */
    public ImageView f212441y0;

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$a */
    public class C6679a implements View.OnClickListener {
        public C6679a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String username = NormalUserHeaderPreference.this.f212418Q0.getUsername();
            if (C72996z1.m85811N4(username)) {
                username = C72996z1.m85829Z5(username);
            }
            Intent intent = new Intent(NormalUserHeaderPreference.this.f212422S0, ProfileHdHeadImg.class);
            intent.putExtra("username", username);
            MMActivity mMActivity = NormalUserHeaderPreference.this.f212422S0;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MMActivity mMActivity2 = mMActivity;
            C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity2, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$b */
    public class C6680b implements View.OnClickListener {
        public C6680b(NormalUserHeaderPreference normalUserHeaderPreference) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$c */
    public class C6681c implements View.OnClickListener {
        public C6681c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            NormalUserHeaderPreference normalUserHeaderPreference = NormalUserHeaderPreference.this;
            normalUserHeaderPreference.f212432X0 = false;
            normalUserHeaderPreference.getClass();
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(normalUserHeaderPreference.f212418Q0.getUsername());
            if (!(z1Var == null || ((int) z1Var.f108320R1) == 0 || !z1Var.getUsername().equals(normalUserHeaderPreference.f212418Q0.getUsername()))) {
                normalUserHeaderPreference.f212418Q0 = z1Var;
            }
            if (!normalUserHeaderPreference.f212418Q0.mo62927s3()) {
                Intent intent = new Intent();
                intent.setClassName(normalUserHeaderPreference.f121274d, "com.tencent.mm.ui.contact.ModRemarkNameUI");
                intent.putExtra("Contact_Scene", 0);
                intent.putExtra("Contact_mode_name_type", 0);
                intent.putExtra("Contact_ModStrangerRemark", true);
                intent.putExtra("Contact_User", normalUserHeaderPreference.f212418Q0.getUsername());
                intent.putExtra("Contact_Nick", normalUserHeaderPreference.f212418Q0.getNickname());
                intent.putExtra("Contact_RemarkName", normalUserHeaderPreference.f212418Q0.mo73969n2());
                Activity activity = (Activity) normalUserHeaderPreference.f121274d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "dealModRemarkEvent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "dealModRemarkEvent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                Intent intent2 = new Intent();
                intent2.setClassName(normalUserHeaderPreference.f121274d, "com.tencent.mm.ui.contact.ContactRemarkInfoModUI");
                intent2.putExtra("Contact_Scene", 0);
                intent2.putExtra("Contact_User", normalUserHeaderPreference.f212418Q0.getUsername());
                intent2.putExtra("Contact_RoomNickname", normalUserHeaderPreference.f212422S0.getIntent().getStringExtra("Contact_RoomNickname"));
                Activity activity3 = (Activity) normalUserHeaderPreference.f121274d;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                Activity activity4 = activity3;
                C117292a.m165358d(activity4, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "dealModRemarkEvent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity3.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(activity4, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "dealModRemarkEvent", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$d */
    public class C6682d implements View.OnClickListener {
        public C6682d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("sns_permission_userName", NormalUserHeaderPreference.this.f212418Q0.getUsername());
            intent.putExtra("sns_permission_anim", true);
            intent.putExtra("sns_permission_block_scene", 3);
            C88144b.m109791i(NormalUserHeaderPreference.this.f212422S0, "sns", ".ui.SnsPermissionUI", intent, (Bundle) null);
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$e */
    public class C72883e implements View.OnLongClickListener {

        /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$e$a */
        public class C72884a implements View.OnCreateContextMenuListener {
            public C72884a() {
            }

            public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
                contextMenu.add(NormalUserHeaderPreference.this.f212422S0.getString(C0966R.string.f7936wt));
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$e$b */
        public class C72885b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ String f212444d;

            public C72885b(String str) {
                this.f212444d = str;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                if (i == 0) {
                    ClipboardHelper.setText(this.f212444d);
                    MMActivity mMActivity = NormalUserHeaderPreference.this.f212422S0;
                    C76879j.m92729W(mMActivity, mMActivity.getString(C0966R.string.f7938wv));
                }
            }
        }

        /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$e$c */
        public class C72886c implements PopupWindow.OnDismissListener {
            public C72886c() {
            }

            public void onDismiss() {
                NormalUserHeaderPreference.this.mo100729J();
            }
        }

        public C72883e() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (NormalUserHeaderPreference.this.f212413L.getText() != null) {
                String charSequence = NormalUserHeaderPreference.this.f212413L.getText().toString();
                int indexOf = charSequence.indexOf(58);
                if (indexOf >= 0 && indexOf < charSequence.length()) {
                    charSequence = charSequence.substring(indexOf + 1).trim();
                }
                SpannableString spannableString = new SpannableString(NormalUserHeaderPreference.this.f212413L.getText());
                spannableString.setSpan(new BackgroundColorSpan(NormalUserHeaderPreference.this.f212422S0.getResources().getColor(C0966R.color.a16)), indexOf + 1, NormalUserHeaderPreference.this.f212413L.getText().length(), 33);
                NormalUserHeaderPreference.this.f212413L.setText(spannableString);
                NormalUserHeaderPreference normalUserHeaderPreference = NormalUserHeaderPreference.this;
                C78253a aVar = new C78253a(normalUserHeaderPreference.f212422S0, normalUserHeaderPreference.f212413L);
                aVar.f229249r = new C72884a();
                aVar.f229251t = new C72885b(charSequence);
                aVar.f229227C = new C72886c();
                aVar.mo70679m();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference$5", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$f */
    public class C72887f implements Runnable {
        public C72887f() {
        }

        public void run() {
            NormalUserHeaderPreference.this.mo100731L();
            NormalUserHeaderPreference.this.mo100730K();
            NormalUserHeaderPreference.this.mo100732M();
            NormalUserHeaderPreference normalUserHeaderPreference = NormalUserHeaderPreference.this;
            FMessageListView fMessageListView = normalUserHeaderPreference.f212439p0;
            if (fMessageListView != null) {
                fMessageListView.setReplyBtnVisible(!normalUserHeaderPreference.f212418Q0.mo62927s3());
            }
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.preference.NormalUserHeaderPreference$g */
    public class C72888g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C44673z4 f212448d;

        public C72888g(C44673z4 z4Var) {
            this.f212448d = z4Var;
        }

        public void run() {
            C72996z1 z1Var = NormalUserHeaderPreference.this.f212418Q0;
            if (z1Var != null && this.f212448d != null && z1Var.getUsername().equals(this.f212448d.field_encryptUsername)) {
                NormalUserHeaderPreference.this.f212418Q0.mo62860K2(this.f212448d.field_conRemark);
                NormalUserHeaderPreference normalUserHeaderPreference = NormalUserHeaderPreference.this;
                if (!(normalUserHeaderPreference.f212420R0 && normalUserHeaderPreference.f212418Q0 != null)) {
                    Log.m105920e("MicroMsg.ContactInfoHeader", "initView : bindView = " + NormalUserHeaderPreference.this.f212420R0 + "contact = " + NormalUserHeaderPreference.this.f212418Q0.getUsername());
                    return;
                }
                normalUserHeaderPreference.mo100731L();
            }
        }
    }

    public NormalUserHeaderPreference(Context context) {
        super(context);
        this.f212422S0 = (MMActivity) context;
        this.f212420R0 = false;
    }

    /* renamed from: I */
    public final void mo100728I() {
        Class cls = C76979h.class;
        if (!(this.f212420R0 && this.f212418Q0 != null)) {
            Log.m105928w("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.f212420R0 + "contact = " + this.f212418Q0);
            return;
        }
        boolean N4 = C72996z1.m85811N4(this.f212418Q0.getUsername());
        if (N4) {
            this.f212412K.setText("");
            if (C72996z1.m85829Z5(C75592q0.m90789s()).equals(this.f212418Q0.getUsername())) {
                this.f212435Z.setVisibility(8);
            }
        } else {
            TextView textView = this.f212412K;
            MMActivity mMActivity = this.f212422S0;
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(mMActivity, Util.nullAsNil(this.f212418Q0.getNickname()) + " ", this.f212412K.getTextSize()));
        }
        this.f212423T.setVisibility(0);
        this.f212428V0 = true;
        int i = this.f212418Q0.f149500H;
        if (i == 1) {
            this.f212423T.setImageDrawable(C76577a.m92158i(this.f212422S0, C0966R.raw.ic_sex_male));
            this.f212423T.setContentDescription(this.f121274d.getString(C0966R.string.ho7));
        } else if (i == 2) {
            this.f212423T.setImageDrawable(C76577a.m92158i(this.f212422S0, C0966R.raw.ic_sex_female));
            this.f212423T.setContentDescription(this.f121274d.getString(C0966R.string.ho6));
        } else if (i == 0) {
            this.f212423T.setVisibility(8);
            this.f212428V0 = false;
        }
        if (this.f212418Q0.mo73953E2() != 0) {
            this.f212425U.setVisibility(0);
            this.f212425U.setImageBitmap((Bitmap) null);
        }
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f212411J, this.f212418Q0.getUsername());
        if (this.f212411J != null) {
            int h = C76577a.m92157h(this.f121274d, C0966R.dimen.f3624h);
            int b = C76577a.m92151b(this.f212422S0, 88);
            if (h > b) {
                h = b;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(h, h);
            layoutParams.setMargins(0, 0, C76577a.m92155f(this.f121274d, C0966R.dimen.f3898i9), 0);
            this.f212411J.setLayoutParams(layoutParams);
        }
        this.f212440x0.setVisibility(8);
        this.f212411J.setOnClickListener(new C6679a());
        this.f212441y0.setOnClickListener(new C6680b(this));
        if (C72996z1.m85848s5(this.f212418Q0.getUsername())) {
            TextView textView2 = this.f212413L;
            textView2.setText(this.f121274d.getString(C0966R.string.f7986ye) + this.f212418Q0.mo62911k3());
        } else if (C72996z1.m85798E5(this.f212418Q0.getUsername())) {
            TextView textView3 = this.f212413L;
            textView3.setText(this.f121274d.getString(C0966R.string.f8001yw) + this.f212418Q0.mo62911k3());
        } else if (N4) {
            TextView textView4 = this.f212413L;
            textView4.setText((Util.nullAsNil(((C75339i) C86312j.m106911c(C75339i.class)).K90(this.f212418Q0.f149518V)) + " " + Util.nullAsNil(this.f212418Q0.f149520W)).trim());
        } else if (C72996z1.m85852w5(this.f212418Q0.getUsername())) {
            this.f212413L.setVisibility(8);
        } else if (!this.f212422S0.getIntent().getBooleanExtra("Contact_ShowUserName", true)) {
            this.f212413L.setVisibility(8);
        } else if (Util.isNullOrNil(this.f212418Q0.mo62913l2()) && (C72996z1.m85802I4(this.f212418Q0.getUsername()) || C72996z1.m85796D5(this.f212418Q0.getUsername()))) {
            this.f212413L.setVisibility(8);
        } else if (this.f212418Q0.mo62927s3()) {
            mo100729J();
        } else {
            this.f212413L.setVisibility(8);
        }
        if (C72996z1.m85816S4(this.f212418Q0.getUsername())) {
            this.f212416P.setVisibility(0);
        } else {
            this.f212416P.setVisibility(8);
        }
        mo100731L();
        mo100732M();
        mo100730K();
        if (Util.isNullOrNil((String) null)) {
            this.f212414M.setVisibility(8);
        } else {
            if (!C75592q0.m90764L(this.f212418Q0.getUsername()) && Util.nullAsNil(this.f212418Q0.mo73969n2()).length() > 0) {
                this.f212413L.setVisibility(8);
            }
            this.f212414M.setVisibility(0);
            TextView textView5 = this.f212414M;
            MMActivity mMActivity2 = this.f212422S0;
            textView5.setText(((C76979h) C86312j.m106911c(cls)).yp0(mMActivity2, this.f212422S0.getString(C0966R.string.ble) + null, this.f212414M.getTextSize()));
        }
        this.f212419R.setOnClickListener(new C6681c());
        this.f212421S.setOnClickListener(new C6682d());
        int b2 = (this.f212428V0 ? C76577a.m92151b(this.f212422S0, 17) + 0 : 0) + 0;
        if (this.f212424T0) {
            b2 += C76577a.m92151b(this.f212422S0, 27);
        }
        if (this.f212426U0) {
            b2 += C76577a.m92151b(this.f212422S0, 27);
        }
        if (this.f212430W0) {
            b2 += C76577a.m92151b(this.f212422S0, 30);
        }
        this.f212412K.setMaxWidth(this.f212422S0.getResources().getDisplayMetrics().widthPixels - ((b2 + (C76577a.m92147C(this.f121274d) ? C76577a.m92151b(this.f212422S0, 88) : C76577a.m92151b(this.f212422S0, 64))) + C76577a.m92151b(this.f212422S0, 60)));
        this.f212413L.setLongClickable(true);
        this.f212413L.setOnLongClickListener(new C72883e());
    }

    /* renamed from: J */
    public void mo100729J() {
        this.f212413L.setVisibility(0);
        if (!Util.isNullOrNil(this.f212418Q0.mo62913l2())) {
            TextView textView = this.f212413L;
            textView.setText(C70142g.m82630b(this.f121274d, this.f212418Q0.getUsername()) + C70142g.m82631c(this.f212418Q0.getUsername(), this.f212418Q0.mo62913l2()));
        } else if (C72996z1.m85802I4(this.f212418Q0.getUsername()) || C72996z1.m85796D5(this.f212418Q0.getUsername())) {
            this.f212413L.setVisibility(8);
        } else {
            String nullAsNil = Util.nullAsNil(this.f212418Q0.mo62911k3());
            TextView textView2 = this.f212413L;
            textView2.setText(C70142g.m82630b(this.f121274d, this.f212418Q0.getUsername()) + C70142g.m82631c(this.f212418Q0.getUsername(), nullAsNil));
        }
    }

    /* renamed from: K */
    public final void mo100730K() {
        this.f212427V.setClickable(false);
        if ((C72996z1.m85818T5(this.f212418Q0.getUsername()) || C72996z1.m85843n5(this.f212418Q0.getUsername())) && this.f212418Q0.mo62927s3() && !C75592q0.m90764L(this.f212418Q0.getUsername())) {
            this.f212427V.setVisibility(0);
            if (this.f212418Q0.mo62934u3()) {
                this.f212427V.setChecked(true);
                this.f212430W0 = true;
                return;
            }
            this.f212427V.setChecked(false);
            this.f212427V.setVisibility(8);
            this.f212430W0 = false;
            return;
        }
        this.f212430W0 = false;
        this.f212427V.setVisibility(8);
    }

    /* renamed from: L */
    public final void mo100731L() {
        View findViewById;
        Class cls = C76979h.class;
        if (C75592q0.m90764L(this.f212418Q0.getUsername()) || Util.nullAsNil(this.f212418Q0.mo73969n2()).length() <= 0) {
            this.f212415N.setVisibility(8);
            TextView textView = this.f212412K;
            MMActivity mMActivity = this.f212422S0;
            textView.setText(((C76979h) C86312j.m106911c(cls)).yp0(mMActivity, Util.nullAsNil(this.f212418Q0.mo62909j3()) + " ", this.f212412K.getTextSize()));
            if (this.f212432X0) {
                this.f212419R.setVisibility(0);
                this.f212438b1.setVisibility(8);
            } else {
                if (this.f212418Q0.mo62927s3()) {
                    this.f212419R.setVisibility(8);
                }
                ProfileDescribeView profileDescribeView = this.f212436Z0;
                profileDescribeView.f24012d = this.f212418Q0;
                boolean b = profileDescribeView.mo100270b();
                ProfileLabelView profileLabelView = this.f212437a1;
                profileLabelView.f24012d = this.f212418Q0;
                boolean b2 = profileLabelView.mo100283b();
                if (b || b2) {
                    this.f212438b1.setVisibility(8);
                }
            }
        } else {
            TextView textView2 = this.f212412K;
            MMActivity mMActivity2 = this.f212422S0;
            textView2.setText(((C76979h) C86312j.m106911c(cls)).yp0(mMActivity2, Util.nullAsNil(this.f212418Q0.mo73969n2()) + " ", this.f212412K.getTextSize()));
            this.f212415N.setVisibility(0);
            TextView textView3 = this.f212415N;
            MMActivity mMActivity3 = this.f212422S0;
            textView3.setText(((C76979h) C86312j.m106911c(cls)).yp0(mMActivity3, this.f121274d.getString(C0966R.string.boo) + this.f212418Q0.mo62909j3(), this.f212415N.getTextSize()));
            this.f212419R.setVisibility(8);
        }
        if (C72996z1.m85843n5(this.f212418Q0.getUsername())) {
            this.f212438b1.setText(C0966R.string.buk);
            LinearLayout linearLayout = this.f212433Y;
            if (!(linearLayout == null || (findViewById = linearLayout.findViewById(C0966R.C0970id.foi)) == null)) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "hideName", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "hideName", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f212421S.setVisibility(8);
        if (C72996z1.m85811N4(this.f212418Q0.getUsername())) {
            this.f212412K.setText("");
        }
        if (this.f212421S.getVisibility() == 0 && this.f212415N.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f212415N.getLayoutParams();
            layoutParams.topMargin = this.f121274d.getResources().getDimensionPixelSize(C0966R.dimen.f3956le);
            this.f212415N.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: M */
    public final void mo100732M() {
        int i = 8;
        if (this.f212429W != null && C72996z1.m85818T5(this.f212418Q0.getUsername())) {
            boolean y3 = this.f212418Q0.mo62943y3();
            this.f212426U0 = y3;
            this.f212429W.setVisibility(y3 ? 0 : 8);
        }
        if (this.f212431X != null && C72996z1.m85818T5(this.f212418Q0.getUsername())) {
            boolean bD = C99019x.m128974f() != null ? ((C11766m0) C99019x.m128974f()).mo11654bD(this.f212418Q0.getUsername(), 5) : false;
            this.f212424T0 = bD;
            ImageView imageView = this.f212431X;
            if (bD) {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: O3 */
    public void mo71318O3(C44673z4 z4Var) {
        MMHandlerThread.postToMainThread(new C72888g(z4Var));
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        if (!(this.f212420R0 && this.f212418Q0 != null)) {
            Log.m105920e("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.f212420R0 + "contact = " + this.f212418Q0);
        } else if (Util.nullAsNil(str).length() <= 0) {
            Log.m105920e("MicroMsg.ContactInfoHeader", "notifyChanged: user = " + str);
        } else if (str.equals(this.f212418Q0.getUsername())) {
            mo100728I();
        }
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        C72996z1 z1Var;
        boolean z = false;
        Log.m105919d("MicroMsg.ContactInfoHeader", "onNotifyChange event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
        if (obj == null || !(obj instanceof String)) {
            Log.m105921e("MicroMsg.ContactInfoHeader", "onNotifyChange obj not String event:%d stg:%s obj:%s", Integer.valueOf(i), mStorageEx, obj);
            return;
        }
        String str = (String) obj;
        Log.m105918d("MicroMsg.ContactInfoHeader", "onNotifyChange username = " + str + ", contact = " + this.f212418Q0);
        if (this.f212420R0 && this.f212418Q0 != null) {
            z = true;
        }
        if (!z) {
            Log.m105920e("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.f212420R0 + "contact = " + this.f212418Q0);
        } else if (Util.nullAsNil(str).length() > 0 && (z1Var = this.f212418Q0) != null && z1Var.getUsername().equals(str)) {
            this.f212418Q0 = C97625j3.m125812b().mo105907v().get(str);
            MMHandlerThread.postToMainThread(new C72887f());
        }
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        View view2 = view;
        Log.m105918d("MicroMsg.ContactInfoHeader", "onBindView");
        this.f212412K = (TextView) view2.findViewById(C0966R.C0970id.bo9);
        this.f212413L = (TextView) view2.findViewById(C0966R.C0970id.boz);
        TextView textView = (TextView) view2.findViewById(C0966R.C0970id.bmv);
        this.f212414M = (TextView) view2.findViewById(C0966R.C0970id.bnk);
        this.f212415N = (TextView) view2.findViewById(C0966R.C0970id.bo_);
        this.f212419R = (Button) view2.findViewById(C0966R.C0970id.bog);
        this.f212421S = (Button) view2.findViewById(C0966R.C0970id.boo);
        ProfileMobilePhoneView profileMobilePhoneView = (ProfileMobilePhoneView) view2.findViewById(C0966R.C0970id.gwb);
        this.f212434Y0 = profileMobilePhoneView;
        ((Boolean) C97625j3.m125812b().mo105906u().mo119685f(C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN, Boolean.FALSE)).booleanValue();
        profileMobilePhoneView.getClass();
        this.f212436Z0 = (ProfileDescribeView) view2.findViewById(C0966R.C0970id.c2b);
        this.f212437a1 = (ProfileLabelView) view2.findViewById(C0966R.C0970id.fgu);
        this.f212438b1 = (TextView) view2.findViewById(C0966R.C0970id.jct);
        this.f212436Z0.setOnClickListener((View.OnClickListener) null);
        this.f212437a1.setOnClickListener((View.OnClickListener) null);
        this.f212438b1.setOnClickListener((View.OnClickListener) null);
        if (C75592q0.m90764L(this.f212418Q0.getUsername()) || (!Util.isNullOrNil(this.f212418Q0.getUsername()) && C72996z1.m85816S4(this.f212418Q0.getUsername()))) {
            this.f212438b1.setVisibility(8);
            this.f212434Y0.setVisibility(8);
            this.f212436Z0.setVisibility(8);
            this.f212437a1.setVisibility(8);
        } else {
            ProfileMobilePhoneView profileMobilePhoneView2 = this.f212434Y0;
            profileMobilePhoneView2.f24012d = this.f212418Q0;
            Log.m105925i("MicroMsg.ProfileMobilePhoneView", "phoneNumberByMD5:%s phoneNumberList:%s", null, null);
            profileMobilePhoneView2.f24014e = null;
            profileMobilePhoneView2.f24015f = null;
            profileMobilePhoneView2.mo7594b();
            if (!this.f212418Q0.mo62927s3()) {
                this.f212434Y0.setVisibility(8);
            } else {
                this.f212434Y0.setVisibility(0);
            }
            ProfileDescribeView profileDescribeView = this.f212436Z0;
            profileDescribeView.f24012d = this.f212418Q0;
            boolean b = profileDescribeView.mo100270b();
            ProfileLabelView profileLabelView = this.f212437a1;
            profileLabelView.f24012d = this.f212418Q0;
            boolean b2 = profileLabelView.mo100283b();
            if (b || b2) {
                this.f212438b1.setVisibility(8);
            } else if (this.f212432X0) {
                this.f212438b1.setVisibility(8);
            } else {
                this.f212438b1.setVisibility(0);
            }
        }
        this.f212416P = (TextView) view2.findViewById(C0966R.C0970id.bnw);
        this.f212435Z = (Button) view2.findViewById(C0966R.C0970id.bnp);
        FMessageListView fMessageListView = (FMessageListView) view2.findViewById(C0966R.C0970id.bnq);
        this.f212439p0 = fMessageListView;
        MMActivity mMActivity = this.f212422S0;
        if (mMActivity != null) {
            fMessageListView.setForceHideReply(mMActivity.getIntent().getBooleanExtra("Contact_Conversation_IsForceHideReplyBtn", false));
        }
        C72893b.C72895b bVar = new C72893b.C72895b();
        bVar.f212466a = this.f212418Q0.getUsername();
        bVar.f212467b = 0;
        bVar.f212468c = null;
        bVar.f212470e = this.f212418Q0.f149527Z0;
        bVar.f212469d = 0;
        if (C75604z3.m90853y(0)) {
            bVar.f212469d = 2;
        }
        this.f212439p0.setFMessageArgs(bVar);
        this.f212417Q = view2.findViewById(C0966R.C0970id.jn7);
        this.f212433Y = (LinearLayout) view2.findViewById(C0966R.C0970id.eu7);
        this.f212411J = (ImageView) view2.findViewById(C0966R.C0970id.bmx);
        this.f212423T = (ImageView) view2.findViewById(C0966R.C0970id.bol);
        this.f212425U = (ImageView) view2.findViewById(C0966R.C0970id.bp6);
        this.f212427V = (CheckBox) view2.findViewById(C0966R.C0970id.bop);
        this.f212429W = (ImageView) view2.findViewById(C0966R.C0970id.bon);
        this.f212431X = (ImageView) view2.findViewById(C0966R.C0970id.bom);
        this.f212441y0 = (ImageView) view2.findViewById(C0966R.C0970id.bow);
        this.f212440x0 = (RelativeLayout) view2.findViewById(C0966R.C0970id.box);
        this.f212420R0 = true;
        mo100728I();
        if (this.f212418Q0.mo62927s3()) {
            Log.m105918d("MicroMsg.ContactInfoHeader", "initAddContent, showFMessageList false");
            this.f212439p0.setVisibility(8);
            if (this.f212439p0.getVisibility() == 8 && this.f212438b1.getVisibility() == 8 && this.f212437a1.getVisibility() == 8 && this.f212436Z0.getVisibility() == 8 && this.f212416P.getVisibility() == 8) {
                View view3 = this.f212417Q;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "initAddContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "initAddContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            Log.m105918d("MicroMsg.ContactInfoHeader", "initAddContent, FMessageListView gone, addScene = 0, verifyTicket = null");
            this.f212439p0.setVisibility(8);
            if (this.f212439p0.getVisibility() == 8 && this.f212438b1.getVisibility() == 8 && this.f212437a1.getVisibility() == 8 && this.f212436Z0.getVisibility() == 8 && this.f212416P.getVisibility() == 8) {
                View view5 = this.f212417Q;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "initAddContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference", "initAddContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        super.mo1086w(view);
    }

    /* renamed from: x */
    public View mo1087x(ViewGroup viewGroup) {
        FMessageListView fMessageListView = this.f212439p0;
        if (fMessageListView != null) {
            fMessageListView.mo100719b();
        }
        return super.mo1087x(viewGroup);
    }

    public NormalUserHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f212422S0 = (MMActivity) context;
        this.f212420R0 = false;
    }

    public NormalUserHeaderPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f212422S0 = (MMActivity) context;
        this.f212420R0 = false;
    }
}
