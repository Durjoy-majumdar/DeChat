package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.p136ui.base.MMAutoSwitchEditTextView;
import com.tencent.p014mm.plugin.account.p024ui.EmailVerifyUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditText */
public class MMAutoSwitchEditText extends EditText {

    /* renamed from: d */
    public C116051a f348185d;

    /* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditText$a */
    public static class C116051a implements TextWatcher, View.OnKeyListener {

        /* renamed from: d */
        public C116053c f348186d;

        /* renamed from: e */
        public C116052b f348187e;

        /* renamed from: f */
        public C116054d f348188f;

        /* renamed from: g */
        public EditText f348189g;

        /* renamed from: h */
        public int f348190h = 0;

        /* renamed from: i */
        public int f348191i = 4;

        /* renamed from: j */
        public String f348192j;

        public C116051a(EditText editText) {
            this.f348189g = editText;
        }

        public void afterTextChanged(Editable editable) {
            C116053c cVar;
            MMAutoSwitchEditText mMAutoSwitchEditText;
            this.f348192j = editable.toString();
            C116054d dVar = this.f348188f;
            String str = "";
            if (dVar != null) {
                MMAutoSwitchEditTextView.C116058d dVar2 = (MMAutoSwitchEditTextView.C116058d) dVar;
                Iterator<MMAutoSwitchEditText> it = MMAutoSwitchEditTextView.this.f348198i.iterator();
                String str2 = str;
                while (it.hasNext()) {
                    MMAutoSwitchEditText next = it.next();
                    if (!Util.isNullOrNil(next.getText().toString().trim())) {
                        str2 = str2 + next.getText().toString().trim();
                    }
                }
                MMAutoSwitchEditTextView.C116057c cVar2 = MMAutoSwitchEditTextView.this.f348201o;
                if (cVar2 != null) {
                    EmailVerifyUI.this.enableOptionMenu(false);
                }
            }
            String str3 = str;
            int i = 0;
            for (int i2 = 0; i2 < this.f348192j.length() && (i = i + 1) <= this.f348191i; i2++) {
                str3 = str3 + this.f348192j.charAt(i2);
            }
            if (i > this.f348191i) {
                this.f348189g.setText(str3);
                this.f348189g.setSelection(str3.length());
            }
            if (i >= this.f348191i && (cVar = this.f348186d) != null) {
                int i3 = this.f348190h;
                MMAutoSwitchEditTextView.C116058d dVar3 = (MMAutoSwitchEditTextView.C116058d) cVar;
                Iterator<MMAutoSwitchEditText> it4 = MMAutoSwitchEditTextView.this.f348198i.iterator();
                while (it4.hasNext()) {
                    MMAutoSwitchEditText next2 = it4.next();
                    if (!Util.isNullOrNil(next2.getText().toString().trim())) {
                        str = str + next2.getText().toString().trim();
                    }
                }
                if (!Util.isNullOrNil(str)) {
                    int length = str.length();
                    MMAutoSwitchEditTextView mMAutoSwitchEditTextView = MMAutoSwitchEditTextView.this;
                    if (length == mMAutoSwitchEditTextView.f348193d * mMAutoSwitchEditTextView.f348194e) {
                        MMAutoSwitchEditTextView.C116056b bVar = mMAutoSwitchEditTextView.f348200n;
                        if (bVar != null) {
                            EmailVerifyUI.C114916a aVar = (EmailVerifyUI.C114916a) bVar;
                            EmailVerifyUI.this.enableOptionMenu(true);
                            EmailVerifyUI.m161824H7(EmailVerifyUI.this, str);
                            return;
                        }
                        return;
                    }
                }
                MMAutoSwitchEditTextView.C116057c cVar3 = MMAutoSwitchEditTextView.this.f348201o;
                if (cVar3 != null) {
                    EmailVerifyUI.this.enableOptionMenu(false);
                }
                ArrayList<MMAutoSwitchEditText> arrayList = MMAutoSwitchEditTextView.this.f348198i;
                if (arrayList != null && i3 < arrayList.size() - 1 && (mMAutoSwitchEditText = MMAutoSwitchEditTextView.this.f348198i.get(i3 + 1)) != null) {
                    mMAutoSwitchEditText.requestFocus();
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            C116052b bVar;
            MMAutoSwitchEditText mMAutoSwitchEditText;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMAutoSwitchEditText$AutoSwitchEditTextWatcher", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (i == 67 && this.f348189g.getText().toString().trim().length() == 0 && (bVar = this.f348187e) != null) {
                int i2 = this.f348190h;
                MMAutoSwitchEditTextView.C116058d dVar = (MMAutoSwitchEditTextView.C116058d) bVar;
                ArrayList<MMAutoSwitchEditText> arrayList2 = MMAutoSwitchEditTextView.this.f348198i;
                if (!(arrayList2 == null || i2 >= arrayList2.size() || i2 == 0 || (mMAutoSwitchEditText = MMAutoSwitchEditTextView.this.f348198i.get(i2 - 1)) == null)) {
                    mMAutoSwitchEditText.requestFocus();
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMAutoSwitchEditText$AutoSwitchEditTextWatcher", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditText$b */
    public interface C116052b {
    }

    /* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditText$c */
    public interface C116053c {
    }

    /* renamed from: com.tencent.mm.ui.base.MMAutoSwitchEditText$d */
    public interface C116054d {
    }

    public MMAutoSwitchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C116051a aVar = new C116051a(this);
        this.f348185d = aVar;
        addTextChangedListener(aVar);
        setOnKeyListener(this.f348185d);
    }

    public void setIndex(int i) {
        this.f348185d.f348190h = i;
    }

    public void setMaxInputCount(int i) {
        this.f348185d.f348191i = i;
    }

    public void setOnDelAllContent(C116052b bVar) {
        this.f348185d.f348187e = bVar;
    }

    public void setOnExceedMaxLimitCount(C116053c cVar) {
        this.f348185d.f348186d = cVar;
    }

    public void setOnTextInputChanged(C116054d dVar) {
        this.f348185d.f348188f = dVar;
    }
}
