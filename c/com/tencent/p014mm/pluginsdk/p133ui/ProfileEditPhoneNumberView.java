package com.tencent.p014mm.pluginsdk.p133ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.contact.C1233a;
import com.tencent.p014mm.p136ui.contact.ContactRemarkInfoModUI;
import com.tencent.p014mm.pluginsdk.p133ui.MMPhoneNumberEditText;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import vd3.C78413s;

/* renamed from: com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView */
public class ProfileEditPhoneNumberView extends ProfileItemView implements MMPhoneNumberEditText.C72723d {

    /* renamed from: n */
    public static final /* synthetic */ int f211630n = 0;

    /* renamed from: e */
    public String f211631e;

    /* renamed from: f */
    public String f211632f;

    /* renamed from: g */
    public String[] f211633g;

    /* renamed from: h */
    public LinearLayout f211634h;

    /* renamed from: i */
    public View f211635i;

    /* renamed from: j */
    public C72736c f211636j;

    /* renamed from: com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView$a */
    public class C72734a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f211637d;

        public C72734a(View view) {
            this.f211637d = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ProfileEditPhoneNumberView.this.f211634h.removeView(this.f211637d);
            ProfileEditPhoneNumberView.this.mo100278f();
            C117292a.m165361g(this, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView$b */
    public class C72735b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MMPhoneNumberEditText f211639d;

        public C72735b(ProfileEditPhoneNumberView profileEditPhoneNumberView, MMPhoneNumberEditText mMPhoneNumberEditText) {
            this.f211639d = mMPhoneNumberEditText;
        }

        public void run() {
            MMPhoneNumberEditText mMPhoneNumberEditText = this.f211639d;
            mMPhoneNumberEditText.setSelection(mMPhoneNumberEditText.getText().length());
            ((InputMethodManager) this.f211639d.getContext().getSystemService("input_method")).showSoftInput(this.f211639d, 0);
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView$c */
    public interface C72736c {
    }

    public ProfileEditPhoneNumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo5918a() {
        this.f211634h = (LinearLayout) findViewById(C0966R.C0970id.gkw);
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bog, (ViewGroup) null);
        this.f211635i = inflate;
        ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.f5596jd);
        View findViewById = this.f211635i.findViewById(C0966R.C0970id.f358921hv2);
        findViewById.setPadding(findViewById.getPaddingLeft(), 0, findViewById.getPaddingRight(), 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        findViewById.setOnClickListener(new C78413s(this));
        this.f211634h.addView(this.f211635i, layoutParams);
    }

    /* renamed from: b */
    public final void mo100273b(String str, boolean z, boolean z2) {
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.boh, (ViewGroup) null);
        MMPhoneNumberEditText mMPhoneNumberEditText = (MMPhoneNumberEditText) inflate.findViewById(C0966R.C0970id.hv4);
        View findViewById = inflate.findViewById(C0966R.C0970id.c0h);
        View findViewById2 = inflate.findViewById(C0966R.C0970id.fo5);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C72734a(inflate));
        }
        mMPhoneNumberEditText.setHint(getResources().getString(C0966R.string.f7391ex));
        if (z) {
            mMPhoneNumberEditText.f211595f = true;
            Drawable drawable = mMPhoneNumberEditText.getResources().getDrawable(C0966R.raw.info_icon);
            mMPhoneNumberEditText.f211593d = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), mMPhoneNumberEditText.f211593d.getIntrinsicHeight());
            mMPhoneNumberEditText.setFocusable(false);
            mMPhoneNumberEditText.setCompoundDrawablesWithIntrinsicBounds(mMPhoneNumberEditText.getCompoundDrawables()[0], mMPhoneNumberEditText.getCompoundDrawables()[1], mMPhoneNumberEditText.f211593d, mMPhoneNumberEditText.getCompoundDrawables()[3]);
        }
        mMPhoneNumberEditText.setCallback(this);
        mMPhoneNumberEditText.setText(str);
        mMPhoneNumberEditText.setSelection(mMPhoneNumberEditText.getText().length());
        mMPhoneNumberEditText.setBackgroundColor(getResources().getColor(C0966R.color.ahf));
        View findViewById3 = inflate.findViewById(C0966R.C0970id.hv5);
        findViewById3.setPadding(findViewById3.getPaddingLeft(), 0, findViewById3.getPaddingRight(), 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        LinearLayout linearLayout = this.f211634h;
        linearLayout.addView(inflate, linearLayout.getChildCount() - 1, layoutParams);
        mMPhoneNumberEditText.setPadding(0, 0, 0, 0);
        mMPhoneNumberEditText.requestFocus();
        if (z2) {
            mMPhoneNumberEditText.postDelayed(new C72735b(this, mMPhoneNumberEditText), 100);
        }
        C72736c cVar = this.f211636j;
        if (cVar != null) {
            ContactRemarkInfoModUI.this.hideVKB(mMPhoneNumberEditText);
        }
        if (findViewById2 == null) {
            return;
        }
        if (this.f211634h.getChildCount() > 5) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "addView", "(Ljava/lang/String;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: c */
    public final void mo100274c() {
        View view = this.f211635i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "hideBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "hideBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C72736c cVar = this.f211636j;
        if (cVar != null) {
            ((ContactRemarkInfoModUI.C74383i) cVar).mo103361a();
        }
    }

    public void clearFocus() {
        for (int i = 1; i < this.f211634h.getChildCount(); i++) {
            this.f211634h.getChildAt(i).clearFocus();
        }
    }

    /* renamed from: d */
    public final void mo100276d() {
        C72736c cVar = this.f211636j;
        if (cVar != null) {
            ContactRemarkInfoModUI contactRemarkInfoModUI = ContactRemarkInfoModUI.this;
            int i = ContactRemarkInfoModUI.f218496o1;
            contactRemarkInfoModUI.mo103344O7();
        }
    }

    /* renamed from: e */
    public boolean mo100277e() {
        int i;
        int i2 = 1;
        if (!Util.isNullOrNil(this.f211631e)) {
            mo100273b(this.f211631e, true, false);
            i = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        if (!Util.isNullOrNil(this.f211632f)) {
            String[] d = C1233a.m1357d(this.f24012d, this.f211632f);
            this.f211633g = d;
            if (d != null) {
                while (true) {
                    String[] strArr = this.f211633g;
                    if (i2 >= strArr.length + i) {
                        break;
                    }
                    mo100273b(strArr[i2 - i].trim(), false, false);
                    i2++;
                }
            }
        }
        if (i2 < 5) {
            mo100278f();
        } else {
            mo100274c();
        }
        return false;
    }

    /* renamed from: f */
    public final void mo100278f() {
        View view = this.f211635i;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "showBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView", "showBottomView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C72736c cVar = this.f211636j;
        if (cVar != null) {
            ((ContactRemarkInfoModUI.C74383i) cVar).mo103361a();
        }
    }

    public int getLayout() {
        return C0966R.C0971layout.boi;
    }

    public ArrayList<String> getPhoneNumberList() {
        int childCount = this.f211634h.getChildCount();
        if (childCount == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>(childCount);
        for (int i = 0; i < childCount; i++) {
            View findViewById = this.f211634h.getChildAt(i).findViewById(C0966R.C0970id.hv4);
            if (findViewById instanceof MMPhoneNumberEditText) {
                String obj = ((MMPhoneNumberEditText) findViewById).getText().toString();
                if (!Util.isNullOrNil(obj) && !obj.trim().equals("")) {
                    arrayList.add(obj);
                }
            }
        }
        if (!Util.isNullOrNil(this.f211631e) && arrayList.size() > 0) {
            arrayList.remove(0);
        }
        return arrayList;
    }

    public ProfileEditPhoneNumberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
