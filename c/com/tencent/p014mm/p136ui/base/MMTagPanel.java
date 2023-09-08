package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kg3.C76577a;
import vl3.C102226d;

/* renamed from: com.tencent.mm.ui.base.MMTagPanel */
public class MMTagPanel extends FlowLayout {

    /* renamed from: A */
    public LinkedList<C73208l> f214915A = new LinkedList<>();

    /* renamed from: B */
    public C73201i f214916B;

    /* renamed from: C */
    public int f214917C;

    /* renamed from: D */
    public View f214918D;

    /* renamed from: E */
    public MMEditText f214919E;

    /* renamed from: F */
    public int f214920F;

    /* renamed from: G */
    public boolean f214921G = false;

    /* renamed from: H */
    public View.OnClickListener f214922H = new C73197h();

    /* renamed from: I */
    public boolean f214923I = true;

    /* renamed from: h */
    public boolean f214924h = false;

    /* renamed from: i */
    public boolean f214925i = true;

    /* renamed from: j */
    public boolean f214926j = false;

    /* renamed from: n */
    public boolean f214927n = true;

    /* renamed from: o */
    public boolean f214928o = false;

    /* renamed from: p */
    public boolean f214929p = false;

    /* renamed from: q */
    public int f214930q = C0966R.C0969drawable.ccv;

    /* renamed from: r */
    public int f214931r = 0;

    /* renamed from: s */
    public int f214932s = C0966R.C0969drawable.awa;

    /* renamed from: t */
    public int f214933t = C0966R.color.a7f;

    /* renamed from: u */
    public int f214934u = C0966R.C0969drawable.f357373aw1;

    /* renamed from: v */
    public int f214935v = C0966R.color.akw;

    /* renamed from: w */
    public int f214936w = C0966R.C0969drawable.aw4;

    /* renamed from: x */
    public int f214937x = C0966R.color.al_;

    /* renamed from: y */
    public C73208l f214938y = null;

    /* renamed from: z */
    public LinkedList<C73208l> f214939z = new LinkedList<>();

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$a */
    public class C73190a implements View.OnKeyListener {
        public C73190a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            LinkedList<C73208l> linkedList;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (keyEvent.getAction() == 0 && 67 == i) {
                Log.m105919d("MicroMsg.MMTagPanel", "on del click, selection[%d, %d]", Integer.valueOf(MMTagPanel.this.f214919E.getSelectionStart()), Integer.valueOf(MMTagPanel.this.f214919E.getSelectionEnd()));
                if (!(MMTagPanel.this.f214919E.getSelectionStart() == 0 && MMTagPanel.this.f214919E.getSelectionStart() == MMTagPanel.this.f214919E.getSelectionEnd())) {
                    C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return false;
                }
                MMTagPanel.this.mo94842m();
                LinkedList<C73208l> linkedList2 = MMTagPanel.this.f214939z;
                if (linkedList2 == null || linkedList2.isEmpty()) {
                    C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                    return false;
                }
                MMTagPanel mMTagPanel = MMTagPanel.this;
                if (mMTagPanel.f214928o || mMTagPanel.f214938y != null) {
                    if (!(mMTagPanel.f214938y == null || (linkedList = mMTagPanel.f214939z) == null || linkedList.getLast() == null || Util.isNullOrNil(MMTagPanel.this.f214938y.f214966a) || Util.isNullOrNil(MMTagPanel.this.f214939z.getLast().f214966a))) {
                        MMTagPanel mMTagPanel2 = MMTagPanel.this;
                        if (!mMTagPanel2.f214938y.f214966a.equals(mMTagPanel2.f214939z.getLast().f214966a)) {
                            Log.m105924i("MicroMsg.MMTagPanel", "change hight");
                            MMTagPanel.this.mo101807h();
                            MMTagPanel mMTagPanel3 = MMTagPanel.this;
                            mMTagPanel3.f214938y = mMTagPanel3.f214939z.getLast();
                            MMTagPanel mMTagPanel4 = MMTagPanel.this;
                            mMTagPanel4.mo101836t(mMTagPanel4.f214938y.f214967b, false, true);
                            MMTagPanel.this.f214919E.setCursorVisible(false);
                        }
                    }
                    String str = MMTagPanel.this.f214939z.getLast().f214966a;
                    MMTagPanel.this.mo101812o(str);
                    C73201i iVar = MMTagPanel.this.f214916B;
                    if (iVar != null) {
                        iVar.mo94790a(str);
                    }
                    MMTagPanel.this.mo101807h();
                } else {
                    mMTagPanel.f214938y = mMTagPanel.f214939z.getLast();
                    MMTagPanel mMTagPanel5 = MMTagPanel.this;
                    mMTagPanel5.mo101836t(mMTagPanel5.f214938y.f214967b, false, true);
                    MMTagPanel.this.f214919E.setCursorVisible(false);
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMTagPanel$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$b */
    public class C73191b implements TextWatcher {
        public C73191b() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            C73201i iVar = MMTagPanel.this.f214916B;
            if (iVar != null) {
                iVar.mo94799h(obj);
            }
            MMTagPanel mMTagPanel = MMTagPanel.this;
            if (mMTagPanel.mo95184c(mMTagPanel.f214919E, editable, obj, this).length() > 0) {
                MMTagPanel.this.mo101807h();
                MMTagPanel mMTagPanel2 = MMTagPanel.this;
                mMTagPanel2.f214919E.setBackground(mMTagPanel2.getResources().getDrawable(C0966R.C0969drawable.abd));
                return;
            }
            MMTagPanel.this.f214919E.setBackground((Drawable) null);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$c */
    public class C73192c implements View.OnFocusChangeListener {
        public C73192c() {
        }

        public void onFocusChange(View view, boolean z) {
            C73201i iVar;
            Log.m105919d("MicroMsg.MMTagPanel", "on edittext focus changed %B", Boolean.valueOf(z));
            if (z && (iVar = MMTagPanel.this.f214916B) != null) {
                iVar.mo94794g();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$d */
    public class C73193d implements View.OnClickListener {
        public C73193d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMTagPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.MMTagPanel", "on edittext click");
            MMTagPanel.this.mo101807h();
            C73201i iVar = MMTagPanel.this.f214916B;
            if (iVar != null) {
                iVar.mo94794g();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMTagPanel$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$e */
    public class C73194e implements TextView.OnEditorActionListener {
        public C73194e(MMTagPanel mMTagPanel) {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            Log.m105919d("MicroMsg.MMTagPanel", "on action %d, %s", Integer.valueOf(i), keyEvent);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$f */
    public class C73195f implements View.OnClickListener {
        public C73195f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMTagPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105919d("MicroMsg.MMTagPanel", "on panel click, enableEditMode %B", Boolean.valueOf(MMTagPanel.this.f214926j));
            MMTagPanel mMTagPanel = MMTagPanel.this;
            if (mMTagPanel.f214926j) {
                mMTagPanel.mo101807h();
                MMTagPanel.this.f214919E.requestFocus();
                MMEditText mMEditText = MMTagPanel.this.f214919E;
                mMEditText.setSelection(mMEditText.getText().length());
                ((InputMethodManager) MMTagPanel.this.getContext().getSystemService("input_method")).showSoftInput(MMTagPanel.this.f214919E, 0);
                Log.m105918d("MicroMsg.MMTagPanel", "on content click");
                C73201i iVar = MMTagPanel.this.f214916B;
                if (iVar != null) {
                    iVar.mo94794g();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMTagPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$g */
    public class C73196g implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ C73206k f214945d;

        public C73196g(C73206k kVar) {
            this.f214945d = kVar;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMTagPanel$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            MMTagPanel mMTagPanel = MMTagPanel.this;
            if (mMTagPanel.f214929p) {
                String editText = mMTagPanel.getEditText();
                if (!Util.isNullOrNil(editText)) {
                    if (this.f214945d != null) {
                        int f = C45078p0.m49927f(editText);
                        this.f214945d.getClass();
                        if (f > 36) {
                            this.f214945d.getClass();
                            int a = 36 - C45078p0.m49922a(editText);
                            if (a < editText.length()) {
                                editText = editText.substring(0, a);
                            }
                        }
                    }
                    MMTagPanel.this.mo95185d(editText, true);
                    C73201i iVar = MMTagPanel.this.f214916B;
                    if (iVar != null) {
                        iVar.mo94791b(editText);
                    }
                    MMTagPanel.this.mo101801g();
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/base/MMTagPanel$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$h */
    public class C73197h implements View.OnClickListener {

        /* renamed from: com.tencent.mm.ui.base.MMTagPanel$h$a */
        public class C73198a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f214948d;

            public C73198a(View view) {
                this.f214948d = view;
            }

            public void run() {
                MMTagPanel.this.f214916B.mo94800i(((TextView) this.f214948d).getText().toString());
            }
        }

        /* renamed from: com.tencent.mm.ui.base.MMTagPanel$h$b */
        public class C73199b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f214950d;

            public C73199b(View view) {
                this.f214950d = view;
            }

            public void run() {
                MMTagPanel.this.f214916B.mo94792d(((TextView) this.f214950d).getText().toString());
            }
        }

        /* renamed from: com.tencent.mm.ui.base.MMTagPanel$h$c */
        public class C73200c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f214952d;

            public C73200c(View view) {
                this.f214952d = view;
            }

            public void run() {
                MMTagPanel.this.f214916B.mo94792d(((TextView) this.f214952d).getText().toString());
            }
        }

        public C73197h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (((Integer) view.getTag()).intValue() == 0) {
                MMTagPanel.this.mo101836t((TextView) view, true, false);
                if (MMTagPanel.this.f214916B != null) {
                    view.post(new C73198a(view));
                }
            } else {
                MMTagPanel mMTagPanel = MMTagPanel.this;
                if (!mMTagPanel.f214926j || mMTagPanel.f214928o) {
                    mMTagPanel.mo101836t((TextView) view, false, false);
                    if (MMTagPanel.this.f214916B != null) {
                        view.post(new C73199b(view));
                    }
                } else {
                    C73208l lVar = mMTagPanel.f214938y;
                    if (lVar == null) {
                        mMTagPanel.f214938y = MMTagPanel.m86181b(mMTagPanel, ((TextView) view).getText().toString());
                        MMTagPanel mMTagPanel2 = MMTagPanel.this;
                        C73208l lVar2 = mMTagPanel2.f214938y;
                        if (lVar2 != null) {
                            mMTagPanel2.mo101836t(lVar2.f214967b, false, true);
                        }
                    } else if (lVar.f214967b == view) {
                        mMTagPanel.f214938y = null;
                        mMTagPanel.mo101836t((TextView) view, false, false);
                        if (MMTagPanel.this.f214916B != null) {
                            view.post(new C73200c(view));
                        }
                    } else {
                        mMTagPanel.mo101807h();
                        MMTagPanel mMTagPanel3 = MMTagPanel.this;
                        mMTagPanel3.f214938y = MMTagPanel.m86181b(mMTagPanel3, ((TextView) view).getText().toString());
                        MMTagPanel mMTagPanel4 = MMTagPanel.this;
                        C73208l lVar3 = mMTagPanel4.f214938y;
                        if (lVar3 != null) {
                            mMTagPanel4.mo101836t(lVar3.f214967b, false, true);
                        }
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/base/MMTagPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$i */
    public interface C73201i {
        /* renamed from: a */
        void mo94790a(String str);

        /* renamed from: b */
        void mo94791b(String str);

        /* renamed from: d */
        void mo94792d(String str);

        /* renamed from: g */
        void mo94794g();

        /* renamed from: h */
        void mo94799h(String str);

        /* renamed from: i */
        void mo94800i(String str);

        /* renamed from: j */
        void mo94801j(boolean z, int i);
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$j */
    public class C73202j implements InputFilter {

        /* renamed from: d */
        public int f214954d;

        /* renamed from: e */
        public List<String> f214955e = new LinkedList();

        /* renamed from: com.tencent.mm.ui.base.MMTagPanel$j$a */
        public class C73203a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ StringBuilder f214957d;

            public C73203a(StringBuilder sb) {
                this.f214957d = sb;
            }

            public void run() {
                MMTagPanel.this.f214916B.mo94791b(this.f214957d.toString());
            }
        }

        /* renamed from: com.tencent.mm.ui.base.MMTagPanel$j$b */
        public class C73204b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f214959d;

            public C73204b(String str) {
                this.f214959d = str;
            }

            public void run() {
                MMTagPanel.this.f214916B.mo94791b(this.f214959d.trim());
            }
        }

        /* renamed from: com.tencent.mm.ui.base.MMTagPanel$j$c */
        public class C73205c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f214961d;

            public C73205c(String str) {
                this.f214961d = str;
            }

            public void run() {
                MMTagPanel.this.f214919E.setText("");
                MMTagPanel.this.f214919E.append(this.f214961d);
            }
        }

        public C73202j() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            String str;
            Log.m105919d("MicroMsg.MMTagPanel", "on create tag filter, %s [%d, %d) %s [%d, %d), maxlength[%B]", charSequence, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(MMTagPanel.this.f214924h));
            this.f214954d = -1;
            ((LinkedList) this.f214955e).clear();
            char[] cArr = new char[(i2 - i)];
            TextUtils.getChars(charSequence, i, i2, cArr, 0);
            if (!MMTagPanel.this.f214927n) {
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                while (i < i2) {
                    char c = cArr[i];
                    if (c == 10) {
                        z = true;
                    } else {
                        sb.append(c);
                    }
                    i++;
                }
                if (!z) {
                    return null;
                }
                String sb4 = sb.toString();
                sb.insert(0, spanned.subSequence(0, i3));
                sb.append(spanned.subSequence(i4, spanned.length()));
                MMTagPanel.this.post(new C73203a(sb));
                return sb4;
            }
            for (int i5 = i; i5 < i2; i5++) {
                char c2 = cArr[i5];
                if (c2 == 10 || c2 == ',' || c2 == ';' || c2 == 12289 || c2 == 65292 || c2 == 65307) {
                    int i6 = this.f214954d;
                    if (-1 == i6) {
                        ((LinkedList) this.f214955e).add((spanned.subSequence(0, i3).toString() + charSequence.subSequence(i, i5)).trim());
                    } else {
                        ((LinkedList) this.f214955e).add(charSequence.subSequence(i6, i5).toString().trim());
                    }
                    this.f214954d = i5 + 1;
                }
            }
            if (MMTagPanel.this.f214921G) {
                int f = C45078p0.m49927f(spanned.toString());
                if (MMTagPanel.this.f214924h && charSequence.equals("\n") && 36 < f) {
                    ((LinkedList) this.f214955e).clear();
                }
            }
            if (this.f214955e.isEmpty()) {
                return null;
            }
            if (MMTagPanel.this.f214916B != null) {
                for (String next : this.f214955e) {
                    if (next.length() > 0) {
                        MMTagPanel.this.post(new C73204b(next));
                    }
                }
            }
            if (this.f214954d >= i2) {
                spanned.length();
                str = spanned.subSequence(i4, spanned.length()).toString();
            } else {
                str = charSequence.subSequence(this.f214954d, i2).toString() + spanned.subSequence(i4, spanned.length());
            }
            MMTagPanel.this.post(new C73205c(str));
            return "";
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$k */
    public class C73206k implements InputFilter {

        /* renamed from: d */
        public int f214963d;

        /* renamed from: com.tencent.mm.ui.base.MMTagPanel$k$a */
        public class C73207a implements Runnable {
            public C73207a() {
            }

            public void run() {
                C73206k kVar = C73206k.this;
                MMTagPanel mMTagPanel = MMTagPanel.this;
                mMTagPanel.f214916B.mo94801j(mMTagPanel.f214924h, C45078p0.m49923b(kVar.f214963d, ""));
            }
        }

        public C73206k() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            int f = C45078p0.m49927f(spanned.toString()) + C45078p0.m49927f(charSequence.toString());
            if (i4 > i3) {
                int i5 = f - (i4 - i3);
                if (i5 > 36) {
                    MMTagPanel.this.f214924h = true;
                    this.f214963d = i5 - 36;
                } else {
                    MMTagPanel.this.f214924h = false;
                }
            } else if (f > 36) {
                MMTagPanel.this.f214924h = true;
                this.f214963d = f - 36;
            } else {
                MMTagPanel.this.f214924h = false;
            }
            if (MMTagPanel.this.f214921G && 1 == this.f214963d && charSequence.equals("\n")) {
                this.f214963d = 0;
            }
            MMTagPanel mMTagPanel = MMTagPanel.this;
            if (mMTagPanel.f214916B != null) {
                mMTagPanel.post(new C73207a());
            }
            return f > 256 ? "" : charSequence;
        }
    }

    /* renamed from: com.tencent.mm.ui.base.MMTagPanel$l */
    public static final class C73208l {

        /* renamed from: a */
        public String f214966a;

        /* renamed from: b */
        public TextView f214967b;

        /* renamed from: c */
        public View f214968c;
    }

    public MMTagPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101810l();
    }

    /* renamed from: b */
    public static C73208l m86181b(MMTagPanel mMTagPanel, String str) {
        mMTagPanel.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.MMTagPanel", "want to get tag info, but it is null or empty");
            return null;
        }
        Iterator<C73208l> it = mMTagPanel.f214939z.iterator();
        while (it.hasNext()) {
            C73208l next = it.next();
            if (str.equals(next.f214966a)) {
                return next;
            }
        }
        Log.m105929w("MicroMsg.MMTagPanel", "want to get tag %s, but it not exsited!", str);
        return null;
    }

    /* renamed from: c */
    public String mo95184c(EditText editText, Editable editable, String str, TextWatcher textWatcher) {
        return str;
    }

    /* renamed from: d */
    public void mo95185d(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.MMTagPanel", "want to add tag, but it is null or empty");
            return;
        }
        String trim = str.trim();
        Log.m105919d("MicroMsg.MMTagPanel", "want to add tag %s, do remove tag first", trim);
        mo101812o(trim);
        Iterator<C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            if (trim.equals(it.next().f214966a)) {
                Log.m105929w("MicroMsg.MMTagPanel", "want to add tag %s, but it exsited!", trim);
                return;
            }
        }
        C73208l i = mo101808i();
        mo101815s(i, trim, z);
        this.f214939z.add(i);
        if (this.f214926j) {
            addView(i.f214967b, getChildCount() - 1);
        } else {
            addView(i.f214967b);
        }
        mo101807h();
    }

    /* renamed from: e */
    public void mo82020e() {
        this.f214939z.clear();
        removeAllViews();
        Iterator<C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            mo101811n(it.next());
        }
    }

    /* renamed from: f */
    public void mo101800f() {
        IBinder windowToken;
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null && mMEditText.isFocused()) {
            Log.m105918d("MicroMsg.MMTagPanel", "do clear edit focus");
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null && (windowToken = this.f214919E.getWindowToken()) != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                this.f214919E.clearFocus();
            }
        }
    }

    /* renamed from: g */
    public void mo101801g() {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null) {
            mMEditText.setText("");
        }
    }

    public String getEditText() {
        MMEditText mMEditText = this.f214919E;
        return mMEditText != null ? mMEditText.getText().toString() : "";
    }

    public int getEditViewLayoutId() {
        return C0966R.C0971layout.bfo;
    }

    public String getEdittextText() {
        return (!this.f214926j || Util.isNullOrNil((CharSequence) this.f214919E.getText())) ? "" : this.f214919E.getText().toString();
    }

    public ArrayList<String> getSelectTagList() {
        TextView textView;
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            C73208l next = it.next();
            if (next != null && !Util.isNullOrNil(next.f214966a) && (textView = next.f214967b) != null && ((Integer) textView.getTag()).intValue() == 1) {
                arrayList.add(next.f214966a);
            }
        }
        return arrayList;
    }

    public int getTagCount() {
        return this.f214939z.size();
    }

    public ArrayList<String> getTagList() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            C73208l next = it.next();
            if (!Util.isNullOrNil(next.f214966a)) {
                arrayList.add(next.f214966a);
            }
        }
        return arrayList;
    }

    public Set<String> getTagSet() {
        TreeSet treeSet = new TreeSet();
        Iterator<C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            C73208l next = it.next();
            if (!Util.isNullOrNil(next.f214966a)) {
                treeSet.add(next.f214966a);
            }
        }
        return treeSet;
    }

    /* renamed from: h */
    public void mo101807h() {
        MMEditText mMEditText = this.f214919E;
        boolean z = true;
        if (mMEditText != null) {
            Log.m105919d("MicroMsg.MMTagPanel", "do clear high light info, edittext is focus %B", Boolean.valueOf(mMEditText.isFocused()));
            this.f214919E.setCursorVisible(true);
        }
        C73208l lVar = this.f214938y;
        if (lVar != null) {
            TextView textView = lVar.f214967b;
            if (((Integer) textView.getTag()).intValue() != 1) {
                z = false;
            }
            mo101836t(textView, z, false);
            this.f214938y = null;
        }
    }

    /* renamed from: i */
    public C73208l mo101808i() {
        if (!this.f214915A.isEmpty()) {
            return this.f214915A.removeFirst();
        }
        C73208l lVar = new C73208l();
        lVar.f214967b = mo95189j();
        return lVar;
    }

    /* renamed from: j */
    public TextView mo95189j() {
        TextView textView = new TextView(getContext());
        textView.setBackgroundResource(this.f214932s);
        textView.setTextColor(getResources().getColor(this.f214933t));
        textView.setTag(0);
        textView.setGravity(17);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.f214930q, 0);
        textView.setOnClickListener(this.f214925i ? this.f214922H : null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        return textView;
    }

    /* renamed from: k */
    public void mo101809k(boolean z) {
        if (z != this.f214926j) {
            this.f214926j = z;
            removeView(this.f214918D);
            if (this.f214926j) {
                addView(this.f214918D);
                mo101800f();
            }
        }
    }

    /* renamed from: l */
    public final void mo101810l() {
        this.f214917C = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3881hq);
        View inflate = LayoutInflater.from(getContext()).inflate(getEditViewLayoutId(), (ViewGroup) null);
        this.f214918D = inflate;
        MMEditText mMEditText = (MMEditText) inflate.findViewById(C0966R.C0970id.cd7);
        this.f214919E = mMEditText;
        mMEditText.setOnKeyListener(new C73190a());
        this.f214919E.addTextChangedListener(new C73191b());
        this.f214919E.setOnFocusChangeListener(new C73192c());
        this.f214919E.setOnClickListener(new C73193d());
        this.f214919E.setOnEditorActionListener(new C73194e(this));
        C73206k kVar = new C73206k();
        C73202j jVar = new C73202j();
        this.f214919E.setFilters(new InputFilter[]{kVar, jVar});
        mo101800f();
        setOnClickListener(new C73195f());
        setOnTouchListener(new C73196g(kVar));
    }

    /* renamed from: m */
    public void mo94842m() {
    }

    /* renamed from: n */
    public void mo101811n(C73208l lVar) {
        lVar.f214967b.setOnClickListener((View.OnClickListener) null);
        if (this.f214915A.size() < 16) {
            this.f214915A.add(lVar);
        }
    }

    /* renamed from: o */
    public void mo101812o(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.MMTagPanel", "want to remove tag, but it is null or empty");
            return;
        }
        Iterator<C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            C73208l next = it.next();
            if (str.equals(next.f214966a)) {
                this.f214939z.remove(next);
                removeView(next.f214967b);
                mo101811n(next);
                mo101807h();
                return;
            }
        }
        Log.m105929w("MicroMsg.MMTagPanel", "want to remove tag %s, but it not exsited!", str);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f214923I) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    /* renamed from: p */
    public void mo101813p() {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null && !mMEditText.isFocused()) {
            this.f214919E.requestFocus();
        }
    }

    /* renamed from: q */
    public void mo95190q(Collection<String> collection, List<String> list) {
        mo82020e();
        if (this.f214926j) {
            addView(this.f214918D);
        }
        if (list != null && !list.isEmpty()) {
            for (String next : list) {
                mo95185d(next, collection == null ? false : collection.contains(next));
            }
        }
    }

    /* renamed from: r */
    public void mo101814r(String str, boolean z) {
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.MMTagPanel", "want to update tag status, but it is null or empty");
            return;
        }
        Iterator<C73208l> it = this.f214939z.iterator();
        while (it.hasNext()) {
            C73208l next = it.next();
            if (str.equals(next.f214966a)) {
                mo101815s(next, str, z);
                mo101807h();
                return;
            }
        }
        Log.m105929w("MicroMsg.MMTagPanel", "want to update tag %s status, but it not exsited!", str);
    }

    /* renamed from: s */
    public void mo101815s(C73208l lVar, String str, boolean z) {
        lVar.f214966a = str;
        lVar.f214967b.setText(C102226d.m134696a(getContext(), str));
        lVar.f214967b.setOnClickListener(this.f214925i ? this.f214922H : null);
        mo101836t(lVar.f214967b, z, false);
    }

    public void setCallBack(C73201i iVar) {
        this.f214916B = iVar;
    }

    public void setEditHint(String str) {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null) {
            mMEditText.setHint(str);
        }
    }

    public void setEditTextColor(int i) {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null) {
            mMEditText.setTextColor(i);
        }
    }

    public void setEditTextEnable(boolean z) {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null) {
            mMEditText.setEnabled(z);
        }
    }

    public void setEditTextEnableEdit(boolean z) {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null) {
            mMEditText.setCursorVisible(z);
            this.f214919E.setFocusable(z);
            this.f214919E.setFocusableInTouchMode(z);
        }
    }

    public void setEditTextHit(boolean z) {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText == null) {
            return;
        }
        if (z) {
            mMEditText.setHint(C0966R.string.f7399f8);
        } else {
            mMEditText.setHint("");
        }
    }

    public void setEditTextOnClickListener(View.OnClickListener onClickListener) {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null) {
            mMEditText.setClickable(true);
            this.f214919E.setOnClickListener(onClickListener);
        }
    }

    public void setEditTextSize(float f) {
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null) {
            mMEditText.setTextSize(0, f);
        }
    }

    public void setEdittextMaxSize(int i) {
        this.f214920F = i;
        MMEditText mMEditText = this.f214919E;
        if (mMEditText != null) {
            mMEditText.setMaxEms(i);
        }
    }

    public void setHintTextSize(int i) {
        this.f214917C = i;
    }

    public void setIsAllowEnterCharacter(boolean z) {
        this.f214921G = z;
    }

    public void setPanelClickable(boolean z) {
        this.f214923I = z;
    }

    public void setTagEditTextBG(int i) {
        this.f214931r = i;
        if (this.f214919E != null) {
            C76577a.m92151b(getContext(), 6);
            getResources().getDimensionPixelSize(C0966R.dimen.f3926j6);
            this.f214919E.setBackgroundResource(this.f214931r);
        }
    }

    public void setTagHighlineBG(int i) {
        this.f214936w = i;
    }

    public void setTagNormalBG(int i) {
        this.f214932s = i;
    }

    public void setTagNormalTextColorRes(int i) {
        this.f214933t = i;
    }

    public void setTagSelectedBG(int i) {
        this.f214934u = i;
    }

    public void setTagSelectedTextColorRes(int i) {
        this.f214935v = i;
    }

    public void setTagTipsDrawable(int i) {
        this.f214930q = i;
    }

    public void setTaghighlineTextColorRes(int i) {
        this.f214937x = i;
    }

    /* renamed from: t */
    public void mo101836t(TextView textView, boolean z, boolean z2) {
        textView.setTextSize(0, ((float) this.f214917C) * C76577a.m92165p(getContext()));
        if (z2) {
            textView.setBackgroundResource(this.f214936w);
            textView.setTextColor(getResources().getColor(this.f214937x));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.f214930q, 0);
            textView.setContentDescription(getContext().getResources().getString(C0966R.string.n6i, new Object[]{textView.getText()}));
        } else if (z) {
            textView.setTag(1);
            textView.setBackgroundResource(this.f214934u);
            textView.setTextColor(getResources().getColor(this.f214935v));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView.setContentDescription(textView.getText() + getContext().getResources().getString(C0966R.string.cp5) + getContext().getResources().getString(C0966R.string.f7398f7));
        } else {
            textView.setTag(0);
            textView.setBackgroundResource(this.f214932s);
            textView.setTextColor(getResources().getColor(this.f214933t));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            textView.setContentDescription(textView.getText() + getContext().getResources().getString(C0966R.string.cp5) + getContext().getResources().getString(C0966R.string.f7400f9));
        }
    }

    public MMTagPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101810l();
    }
}
