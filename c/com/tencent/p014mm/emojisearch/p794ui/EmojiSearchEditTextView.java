package com.tencent.p014mm.emojisearch.p794ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import qn3.C77382c;

/* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView */
public class EmojiSearchEditTextView extends LinearLayout {

    /* renamed from: d */
    public WeImageView f108322d;

    /* renamed from: e */
    public ImageButton f108323e;

    /* renamed from: f */
    public EditText f108324f;

    /* renamed from: g */
    public String f108325g;

    /* renamed from: h */
    public View f108326h;

    /* renamed from: i */
    public String f108327i = "";

    /* renamed from: j */
    public C40302g f108328j = C40302g.UserInput;

    /* renamed from: n */
    public View.OnFocusChangeListener f108329n = new C40300e();

    /* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView$a */
    public class C40296a implements View.OnKeyListener {
        public C40296a(EmojiSearchEditTextView emojiSearchEditTextView) {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emojisearch/ui/EmojiSearchEditTextView$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            keyEvent.getAction();
            C117292a.m165362h(false, this, "com/tencent/mm/emojisearch/ui/EmojiSearchEditTextView$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView$b */
    public class C40297b implements TextWatcher {
        public C40297b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String totalQuery = EmojiSearchEditTextView.this.getTotalQuery();
            String str = EmojiSearchEditTextView.this.f108327i;
            if (totalQuery != str && !totalQuery.equals(str)) {
                EmojiSearchEditTextView.this.f108327i = totalQuery;
                if (totalQuery.length() > 0) {
                    EmojiSearchEditTextView.this.f108323e.setVisibility(0);
                } else {
                    EmojiSearchEditTextView.this.f108323e.setVisibility(8);
                }
                EmojiSearchEditTextView emojiSearchEditTextView = EmojiSearchEditTextView.this;
                String inEditTextQuery = emojiSearchEditTextView.getInEditTextQuery();
                emojiSearchEditTextView.getClass();
                if (inEditTextQuery.length() == 0) {
                    emojiSearchEditTextView.f108324f.setHint(emojiSearchEditTextView.f108325g);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView$c */
    public class C40298c implements TextView.OnEditorActionListener {
        public C40298c() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (3 != i) {
                return false;
            }
            EmojiSearchEditTextView.this.getClass();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView$d */
    public class C40299d implements View.OnClickListener {
        public C40299d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/emojisearch/ui/EmojiSearchEditTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            EmojiSearchEditTextView emojiSearchEditTextView = EmojiSearchEditTextView.this;
            emojiSearchEditTextView.f108328j = C40302g.ClearText;
            emojiSearchEditTextView.f108324f.setText("");
            emojiSearchEditTextView.f108324f.setHint(emojiSearchEditTextView.f108325g);
            emojiSearchEditTextView.f108323e.setVisibility(8);
            emojiSearchEditTextView.f108328j = C40302g.UserInput;
            EmojiSearchEditTextView.this.getClass();
            C117292a.m165361g(this, "com/tencent/mm/emojisearch/ui/EmojiSearchEditTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView$e */
    public class C40300e implements View.OnFocusChangeListener {
        public C40300e() {
        }

        public void onFocusChange(View view, boolean z) {
            EmojiSearchEditTextView.this.getClass();
        }
    }

    /* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView$f */
    public interface C40301f {
        /* renamed from: D */
        void mo62971D(boolean z);

        /* renamed from: E */
        void mo62972E(String str, String str2, C40302g gVar);

        void onClickClearTextBtn(View view);

        /* renamed from: y */
        boolean mo62974y();
    }

    /* renamed from: com.tencent.mm.emojisearch.ui.EmojiSearchEditTextView$g */
    public enum C40302g {
        UserInput,
        ClearText,
        SetText
    }

    public EmojiSearchEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo62949a();
    }

    /* renamed from: a */
    public void mo62949a() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(getLayoutById(), this, true);
        this.f108326h = findViewById(C0966R.C0970id.kei);
        this.f108322d = (WeImageView) findViewById(C0966R.C0970id.f15);
        this.f108324f = (EditText) findViewById(C0966R.C0970id.cd7);
        this.f108323e = (ImageButton) findViewById(C0966R.C0970id.bde);
        this.f108324f.setOnKeyListener(new C40296a(this));
        this.f108324f.addTextChangedListener(new C40297b());
        this.f108324f.setOnFocusChangeListener(this.f108329n);
        this.f108324f.setOnEditorActionListener(new C40298c());
        this.f108323e.setOnClickListener(new C40299d());
        C77382c b = C77382c.m93286b(this.f108324f);
        b.f225611e = 0;
        b.f225610d = 100;
        b.mo107499d((C77382c.C77383a) null);
        if (C85875k4.m106211z()) {
            this.f108323e.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public ImageButton getClearBtn() {
        return this.f108323e;
    }

    public EditText getEditText() {
        return this.f108324f;
    }

    public int getHighlightColor() {
        return this.f108324f.getHighlightColor();
    }

    public WeImageView getIconView() {
        return this.f108322d;
    }

    public String getInEditTextQuery() {
        return this.f108324f.getText().toString().trim();
    }

    public int getLayoutById() {
        return C0966R.C0971layout.a2_;
    }

    public View getTagPanel() {
        return this.f108326h;
    }

    public C40302g getTextChangeStatus() {
        return this.f108328j;
    }

    public String getTotalQuery() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f108324f.getText().toString());
        return stringBuffer.toString().trim();
    }

    public void setEditTextDrawableLeft(int i) {
        if (i == -1) {
            this.f108324f.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable drawable = getContext().getResources().getDrawable(i);
        drawable.setBounds(0, 0, C76577a.m92151b(getContext(), 15), C76577a.m92151b(getContext(), 15));
        this.f108324f.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setEmojiSearchEditTextListener(C40301f fVar) {
    }

    public void setHint(String str) {
        this.f108324f.setHint(str);
        this.f108325g = str;
    }

    public void setText(SpannableString spannableString) {
        C40302g gVar = C40302g.UserInput;
        Log.m105925i("MicroMsg.EmojiSearch", "setText: %s", spannableString);
        this.f108328j = C40302g.SetText;
        this.f108324f.setText(spannableString);
        Selection.setSelection(this.f108324f.getText(), this.f108324f.getText().length());
        this.f108328j = gVar;
    }

    public EmojiSearchEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo62949a();
    }

    public void setText(String str) {
        C40302g gVar = C40302g.UserInput;
        Log.m105925i("MicroMsg.EmojiSearch", "setText: %s", str);
        this.f108328j = C40302g.SetText;
        this.f108324f.setText(str);
        Selection.setSelection(this.f108324f.getText(), this.f108324f.getText().length());
        this.f108328j = gVar;
    }
}
