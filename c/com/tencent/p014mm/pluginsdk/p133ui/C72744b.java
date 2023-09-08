package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.contact.ContactRemarkInfoModUI;
import eb0.C45628s0;
import java.util.ArrayList;
import pc0.C77064b0;

/* renamed from: com.tencent.mm.pluginsdk.ui.b */
public class C72744b implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MMPhoneNumberEditText f211682d;

    /* renamed from: e */
    public final /* synthetic */ ProfileEditPhoneNumberView f211683e;

    public C72744b(ProfileEditPhoneNumberView profileEditPhoneNumberView, MMPhoneNumberEditText mMPhoneNumberEditText) {
        this.f211683e = profileEditPhoneNumberView;
        this.f211682d = mMPhoneNumberEditText;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f211683e;
        profileEditPhoneNumberView.f211631e = "";
        C45628s0.m50759X(ContactRemarkInfoModUI.this.f218566y);
        C77064b0.yn0().mo182766j(7);
        ProfileEditPhoneNumberView profileEditPhoneNumberView2 = this.f211683e;
        MMPhoneNumberEditText mMPhoneNumberEditText = this.f211682d;
        profileEditPhoneNumberView2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < profileEditPhoneNumberView2.f211634h.getChildCount(); i2++) {
            View childAt = profileEditPhoneNumberView2.f211634h.getChildAt(i2);
            if (childAt.findViewById(C0966R.C0970id.hv4) == mMPhoneNumberEditText) {
                arrayList.add(childAt);
            }
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            profileEditPhoneNumberView2.f211634h.removeView((View) arrayList.get(i3));
        }
        LinearLayout linearLayout = profileEditPhoneNumberView2.f211634h;
        linearLayout.getChildAt(linearLayout.getChildCount() - 1).requestFocus();
        if (this.f211683e.f211634h.getChildCount() <= 5) {
            this.f211683e.mo100278f();
        }
    }
}
