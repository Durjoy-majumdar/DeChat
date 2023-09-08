package com.tencent.p014mm.p136ui.search;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import oa1.C117731d;
import qn3.C77382c;
import t40.C77853a;
import vl3.C102226d;

/* renamed from: com.tencent.mm.ui.search.FTSEditTextView */
public class FTSEditTextView extends LinearLayout {

    /* renamed from: H */
    public static final /* synthetic */ int f122147H = 0;

    /* renamed from: A */
    public C45049j f122148A;

    /* renamed from: B */
    public boolean f122149B;

    /* renamed from: C */
    public View.OnClickListener f122150C = new C45046g();

    /* renamed from: D */
    public C45051l f122151D;

    /* renamed from: E */
    public final ArrayList<C45050k> f122152E = new ArrayList<>();

    /* renamed from: F */
    public C45052m f122153F = C45052m.UserInput;

    /* renamed from: G */
    public View.OnFocusChangeListener f122154G = new C45048i();

    /* renamed from: d */
    public WeImageView f122155d;

    /* renamed from: e */
    public View f122156e;

    /* renamed from: f */
    public ImageButton f122157f;

    /* renamed from: g */
    public EditText f122158g;

    /* renamed from: h */
    public List<FTSSearchView.C6996f> f122159h;

    /* renamed from: i */
    public TextView f122160i;

    /* renamed from: j */
    public TextView f122161j;

    /* renamed from: n */
    public TextView f122162n;

    /* renamed from: o */
    public String f122163o;

    /* renamed from: p */
    public String f122164p;

    /* renamed from: q */
    public View f122165q;

    /* renamed from: r */
    public boolean f122166r = true;

    /* renamed from: s */
    public boolean f122167s = false;

    /* renamed from: t */
    public boolean f122168t = false;

    /* renamed from: u */
    public boolean f122169u = false;

    /* renamed from: v */
    public int f122170v = 0;

    /* renamed from: w */
    public String f122171w = "";

    /* renamed from: x */
    public TextView f122172x;

    /* renamed from: y */
    public View f122173y;

    /* renamed from: z */
    public int f122174z = 2;

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$a */
    public class C45040a implements View.OnKeyListener {
        public C45040a() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/FTSEditTextView$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            if (keyEvent.getAction() == 0 && 67 == i) {
                int selectionStart = FTSEditTextView.this.f122158g.getSelectionStart();
                int selectionEnd = FTSEditTextView.this.f122158g.getSelectionEnd();
                if (selectionStart == 0 && selectionEnd == 0 && ((ArrayList) FTSEditTextView.this.f122159h).size() > 0) {
                    FTSEditTextView fTSEditTextView = FTSEditTextView.this;
                    if (fTSEditTextView.f122166r) {
                        List<FTSSearchView.C6996f> list = fTSEditTextView.f122159h;
                        ((ArrayList) list).remove(((ArrayList) list).size() - 1);
                        FTSEditTextView.this.mo70379t();
                        FTSEditTextView.m49881a(FTSEditTextView.this);
                    }
                }
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/search/FTSEditTextView$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$b */
    public class C45041b implements TextWatcher {
        public C45041b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String totalQuery = FTSEditTextView.this.getTotalQuery();
            String str = FTSEditTextView.this.f122171w;
            if (totalQuery != str && !totalQuery.equals(str)) {
                FTSEditTextView fTSEditTextView = FTSEditTextView.this;
                fTSEditTextView.f122171w = totalQuery;
                if (!fTSEditTextView.f122167s) {
                    if (totalQuery.length() > 0) {
                        FTSEditTextView.this.f122157f.setVisibility(0);
                    } else {
                        FTSEditTextView.this.f122157f.setVisibility(8);
                    }
                    FTSEditTextView.m49881a(FTSEditTextView.this);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$c */
    public class C45042c implements TextView.OnEditorActionListener {
        public C45042c() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            C45051l lVar;
            if (3 != i || (lVar = FTSEditTextView.this.f122151D) == null) {
                return false;
            }
            return lVar.mo3009y();
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$d */
    public class C45043d implements View.OnClickListener {
        public C45043d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/FTSEditTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSEditTextView.this.mo70336d();
            FTSEditTextView.this.f122158g.setEllipsize((TextUtils.TruncateAt) null);
            FTSEditTextView.this.f122158g.setKeyListener(new TextKeyListener(TextKeyListener.Capitalize.NONE, false));
            C45051l lVar = FTSEditTextView.this.f122151D;
            if (lVar != null) {
                lVar.onClickClearTextBtn(view);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/search/FTSEditTextView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$e */
    public class C45044e implements View.OnClickListener {
        public C45044e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/FTSEditTextView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            FTSEditTextView fTSEditTextView = FTSEditTextView.this;
            C45049j jVar = fTSEditTextView.f122148A;
            if (jVar != null) {
                jVar.mo3920L2(fTSEditTextView.f122172x);
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/search/FTSEditTextView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$f */
    public class C45045f implements Runnable {
        public C45045f() {
        }

        public void run() {
            ((InputMethodManager) FTSEditTextView.this.getContext().getSystemService("input_method")).showSoftInput(FTSEditTextView.this.f122158g, 0);
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$g */
    public class C45046g implements View.OnClickListener {
        public C45046g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/search/FTSEditTextView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int i = -1;
            if (view.getId() == C0966R.C0970id.kdb) {
                i = 0;
            } else if (view.getId() == C0966R.C0970id.kdf) {
                i = 1;
            } else if (view.getId() == C0966R.C0970id.kdj) {
                i = 2;
            }
            FTSEditTextView fTSEditTextView = FTSEditTextView.this;
            C45051l lVar = fTSEditTextView.f122151D;
            if (lVar != null && i >= 0) {
                lVar.mo3004m7(i, (FTSSearchView.C6996f) ((ArrayList) fTSEditTextView.f122159h).get(i));
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/search/FTSEditTextView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$h */
    public class C45047h implements View.OnFocusChangeListener {
        public C45047h() {
        }

        public void onFocusChange(View view, boolean z) {
            C45051l lVar = FTSEditTextView.this.f122151D;
            if (lVar != null) {
                lVar.mo3000D(z);
            }
            if (z) {
                FTSEditTextView.this.f122158g.setEllipsize((TextUtils.TruncateAt) null);
                FTSEditTextView.this.f122158g.setKeyListener(new TextKeyListener(TextKeyListener.Capitalize.NONE, false));
                FTSEditTextView.this.mo70355k();
                FTSEditTextView.this.mo70360p();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$i */
    public class C45048i implements View.OnFocusChangeListener {
        public C45048i() {
        }

        public void onFocusChange(View view, boolean z) {
            C45051l lVar = FTSEditTextView.this.f122151D;
            if (lVar != null) {
                lVar.mo3000D(z);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$j */
    public interface C45049j {
        /* renamed from: L2 */
        boolean mo3920L2(View view);
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$k */
    public interface C45050k {
        /* renamed from: b3 */
        void mo3001b3(String str, String str2, List<FTSSearchView.C6996f> list, C45052m mVar);
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$l */
    public interface C45051l extends C45050k {
        /* renamed from: D */
        void mo3000D(boolean z);

        /* renamed from: m7 */
        void mo3004m7(int i, FTSSearchView.C6996f fVar);

        void onClickClearTextBtn(View view);

        /* renamed from: y */
        boolean mo3009y();
    }

    /* renamed from: com.tencent.mm.ui.search.FTSEditTextView$m */
    public enum C45052m {
        UserInput,
        ClearText,
        SetText
    }

    public FTSEditTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo67642i(attributeSet);
    }

    /* renamed from: a */
    public static void m49881a(FTSEditTextView fTSEditTextView) {
        String inEditTextQuery = fTSEditTextView.getInEditTextQuery();
        String totalQuery = fTSEditTextView.getTotalQuery();
        C45051l lVar = fTSEditTextView.f122151D;
        if (lVar != null) {
            lVar.mo3001b3(totalQuery, inEditTextQuery, fTSEditTextView.f122159h, fTSEditTextView.f122153F);
        }
        if (inEditTextQuery.length() == 0) {
            if (!Util.isNullOrNil(fTSEditTextView.f122163o)) {
                fTSEditTextView.f122158g.setHint(fTSEditTextView.f122163o);
            } else {
                fTSEditTextView.f122158g.setHint(fTSEditTextView.f122164p);
            }
        }
        Iterator<C45050k> it = fTSEditTextView.f122152E.iterator();
        while (it.hasNext()) {
            it.next().mo3001b3(totalQuery, inEditTextQuery, fTSEditTextView.f122159h, fTSEditTextView.f122153F);
        }
    }

    public static int getSearchInputType() {
        return C117731d.m166007c().mo182443e("clicfg_websearch_input_type", 0, true, true);
    }

    /* renamed from: b */
    public boolean mo67636b() {
        return false;
    }

    /* renamed from: c */
    public void mo70335c() {
        this.f122158g.clearFocus();
    }

    /* renamed from: d */
    public void mo70336d() {
        this.f122153F = C45052m.ClearText;
        if (this.f122166r) {
            ((ArrayList) this.f122159h).clear();
        }
        this.f122158g.setText("");
        if (!Util.isNullOrNil(this.f122163o)) {
            this.f122158g.setHint(this.f122163o);
        } else {
            this.f122158g.setHint(this.f122164p);
        }
        this.f122157f.setVisibility(8);
        mo70379t();
        this.f122153F = C45052m.UserInput;
    }

    /* renamed from: e */
    public void mo70337e() {
        if (this.f122168t) {
            this.f122157f.setVisibility(0);
        } else {
            this.f122157f.setVisibility(8);
        }
        Log.m105925i("MicroMsg.FTS.FTSEditTextView", "hideClearBtn， forceEditToBeTextView = %s. forceShowClearBtn = %s", Util.getStack(), Boolean.valueOf(this.f122168t));
    }

    /* renamed from: f */
    public void mo70338f() {
        this.f122155d.setVisibility(8);
    }

    /* renamed from: g */
    public void mo70339g() {
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f122158g.getWindowToken(), 0);
    }

    public ImageButton getClearBtn() {
        return this.f122157f;
    }

    public EditText getEditText() {
        return this.f122158g;
    }

    public int getHighlightColor() {
        return this.f122158g.getHighlightColor();
    }

    public View getIconMargin() {
        return this.f122156e;
    }

    public WeImageView getIconView() {
        return this.f122155d;
    }

    public String getInEditTextQuery() {
        return this.f122158g.getText().toString().trim();
    }

    public int getLimitInputLength() {
        return 100;
    }

    public String getRecommendSearchHint() {
        return this.f122163o;
    }

    public View getSearchDone() {
        return this.f122172x;
    }

    public View getSearchInputBackground() {
        return this.f122173y;
    }

    public List<FTSSearchView.C6996f> getTagList() {
        return this.f122159h;
    }

    public View getTagPanel() {
        return this.f122165q;
    }

    public C45052m getTextChangeStatus() {
        return this.f122153F;
    }

    public String getTotalQuery() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = ((ArrayList) this.f122159h).iterator();
        while (it.hasNext()) {
            stringBuffer.append(((FTSSearchView.C6996f) it.next()).mo8025SE());
            stringBuffer.append(" ");
        }
        stringBuffer.append(this.f122158g.getText().toString());
        return stringBuffer.toString().trim();
    }

    /* renamed from: h */
    public void mo67641h(int i) {
        if (i == this.f122174z) {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.cqt, this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.d4w, this, true);
        }
    }

    /* renamed from: i */
    public void mo67642i(AttributeSet attributeSet) {
        int i;
        ImageButton imageButton;
        this.f122170v = getSearchInputType();
        if (getContext() instanceof Activity) {
            this.f122149B = ((Activity) getContext()).getIntent().getBooleanExtra("fts_need_sos_edittext_tobe_touch_only", false);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C77853a.f226860f);
            i = obtainStyledAttributes.getInt(4, 0);
            obtainStyledAttributes.recycle();
        } else {
            i = 0;
        }
        mo67641h(i);
        this.f122165q = findViewById(C0966R.C0970id.kei);
        this.f122155d = (WeImageView) findViewById(C0966R.C0970id.f15);
        this.f122158g = (EditText) findViewById(C0966R.C0970id.cd7);
        this.f122157f = (ImageButton) findViewById(C0966R.C0970id.bde);
        this.f122160i = (TextView) findViewById(C0966R.C0970id.kdb);
        this.f122161j = (TextView) findViewById(C0966R.C0970id.kdf);
        this.f122162n = (TextView) findViewById(C0966R.C0970id.kdj);
        this.f122173y = findViewById(C0966R.C0970id.lwn);
        this.f122156e = findViewById(C0966R.C0970id.m9x);
        this.f122172x = (TextView) findViewById(C0966R.C0970id.m6r);
        this.f122158g.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3635t)) * C76577a.m92161l(getContext()));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, C77853a.f226860f);
            int i2 = obtainStyledAttributes2.getInt(0, 0);
            if (i2 != 0) {
                this.f122158g.setHintTextColor(i2);
            }
            int i3 = obtainStyledAttributes2.getInt(3, 0);
            if (i3 != 0) {
                this.f122158g.setTextColor(i3);
            }
            int resourceId = obtainStyledAttributes2.getResourceId(1, 0);
            if (!(resourceId == 0 || (imageButton = this.f122157f) == null)) {
                imageButton.setImageResource(resourceId);
            }
            obtainStyledAttributes2.recycle();
        }
        TextView textView = this.f122172x;
        if (textView != null) {
            textView.setTextSize(0, ((float) C76577a.m92155f(getContext(), C0966R.dimen.f3879hn)) * C76577a.m92161l(getContext()));
        }
        this.f122159h = new ArrayList();
        this.f122158g.setOnKeyListener(new C45040a());
        this.f122158g.addTextChangedListener(new C45041b());
        this.f122158g.setOnFocusChangeListener(this.f122154G);
        this.f122158g.setOnEditorActionListener(new C45042c());
        WeImageView weImageView = this.f122155d;
        if (weImageView != null) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) weImageView.getLayoutParams();
            if (mo67636b()) {
                layoutParams.width = (int) (getResources().getDimension(C0966R.dimen.f3743cv) * C76577a.m92165p(getContext()));
                layoutParams.height = (int) (getResources().getDimension(C0966R.dimen.f3743cv) * C76577a.m92165p(getContext()));
                layoutParams.rightMargin = 0;
            } else {
                layoutParams.width = (int) (getResources().getDimension(C0966R.dimen.f3738cr) * C76577a.m92161l(getContext()));
                layoutParams.height = (int) (getResources().getDimension(C0966R.dimen.f3738cr) * C76577a.m92161l(getContext()));
                layoutParams.rightMargin = (int) getResources().getDimension(C0966R.dimen.f3766df);
            }
            this.f122155d.setLayoutParams(layoutParams);
        }
        this.f122160i.setOnClickListener(this.f122150C);
        this.f122161j.setOnClickListener(this.f122150C);
        this.f122162n.setOnClickListener(this.f122150C);
        this.f122157f.setOnClickListener(new C45043d());
        C77382c b = C77382c.m93286b(this.f122158g);
        int limitInputLength = getLimitInputLength();
        b.f225611e = 0;
        b.f225610d = limitInputLength;
        b.f225612f = C45078p0.C45079a.MODE_CHINESE_AS_1;
        b.mo107499d((C77382c.C77383a) null);
        if (C85875k4.m106211z() || (this instanceof FTSEditTextViewNightMode)) {
            this.f122157f.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        }
        this.f122157f.setContentDescription(getResources().getString(C0966R.string.fgq));
        if (getSearchDone() != null) {
            getSearchDone().setOnClickListener(new C45044e());
        }
    }

    /* renamed from: j */
    public boolean mo70354j() {
        return this.f122158g.hasFocus();
    }

    /* renamed from: k */
    public void mo70355k() {
        this.f122158g.requestFocus();
    }

    /* renamed from: l */
    public void mo70356l(String str, List<FTSSearchView.C6996f> list) {
        mo70357m(str, list, C45052m.UserInput, false);
    }

    /* renamed from: m */
    public void mo70357m(String str, List<FTSSearchView.C6996f> list, C45052m mVar, boolean z) {
        String trim = Util.nullAs(str, "").trim();
        if (trim.length() > getLimitInputLength()) {
            trim = trim.substring(0, getLimitInputLength()).replace("\n", " ");
        }
        this.f122159h.clear();
        if (list != null) {
            this.f122159h.addAll(list);
        }
        Log.m105925i("MicroMsg.FTS.FTSEditTextView", "setText: %s %d", trim, Integer.valueOf(this.f122159h.size()));
        this.f122153F = C45052m.SetText;
        this.f122158g.setText(trim);
        if (z) {
            Selection.setSelection(this.f122158g.getText(), 0);
            this.f122158g.clearFocus();
        } else {
            Selection.setSelection(this.f122158g.getText(), this.f122158g.getText().length());
        }
        mo70379t();
        this.f122153F = mVar;
        if (!Util.isNullOrNil(trim)) {
            mo70363s();
        }
    }

    /* renamed from: n */
    public void mo70358n(String str, List<FTSSearchView.C6996f> list, boolean z) {
        mo70357m(str, list, C45052m.UserInput, z);
    }

    /* renamed from: o */
    public void mo70359o() {
        Log.m105924i("MicroMsg.FTS.FTSEditTextView", "showClearBtn， forceEditToBeTextView = " + this.f122167s);
        if (this.f122167s) {
            this.f122157f.setVisibility(8);
        } else {
            this.f122157f.setVisibility(0);
        }
    }

    /* renamed from: p */
    public void mo70360p() {
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f122158g, 0);
    }

    /* renamed from: q */
    public void mo70361q() {
        postDelayed(new C45045f(), 128);
    }

    /* renamed from: r */
    public void mo70362r(boolean z) {
        Log.m105924i("MicroMsg.FTS.FTSEditTextView", "updateActionDonePos, getSosEditTextView().getSearchBarCancelTextContainer().getVisibility() = " + z);
        if (getSearchDone() == null) {
            return;
        }
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getSearchDone().getLayoutParams();
            marginLayoutParams.rightMargin = 0;
            getSearchDone().setLayoutParams(marginLayoutParams);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getSearchDone().getLayoutParams();
        marginLayoutParams2.rightMargin = (int) getResources().getDimension(C0966R.dimen.f3736cp);
        getSearchDone().setLayoutParams(marginLayoutParams2);
    }

    /* renamed from: s */
    public void mo70363s() {
        this.f122158g.setKeyListener((KeyListener) null);
        this.f122158g.setEllipsize(TextUtils.TruncateAt.END);
        this.f122158g.setOnFocusChangeListener(new C45047h());
    }

    public void setActionSearchDoneListener(C45049j jVar) {
        this.f122148A = jVar;
    }

    public void setCanDeleteTag(boolean z) {
        this.f122166r = z;
    }

    public void setClearBtnVisable(int i) {
        ImageButton imageButton = this.f122157f;
        if (imageButton != null) {
            imageButton.setVisibility(i);
        }
    }

    public void setEditTextDrawableLeft(int i) {
        if (i == -1) {
            this.f122158g.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable drawable = getContext().getResources().getDrawable(i);
        drawable.setBounds(0, 0, C76577a.m92151b(getContext(), 15), C76577a.m92151b(getContext(), 15));
        this.f122158g.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setForceDisable(boolean z) {
        this.f122167s = z;
    }

    public void setForceHideSearchIconBtn(boolean z) {
        this.f122169u = z;
    }

    public void setForceShowClearBtn(boolean z) {
        this.f122168t = z;
    }

    public void setFtsEditTextListener(C45051l lVar) {
        this.f122151D = lVar;
    }

    public void setHint(String str) {
        if (!Util.isNullOrNil(this.f122163o)) {
            this.f122158g.setHint(this.f122163o);
        } else {
            this.f122158g.setHint(str);
        }
        this.f122164p = str;
    }

    public void setHintColor(int i) {
        this.f122158g.setHintTextColor(i);
    }

    public void setIconMarginVisable(int i) {
        View view = this.f122156e;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/search/FTSEditTextView", "setIconMarginVisable", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/search/FTSEditTextView", "setIconMarginVisable", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setRecommendSearchHint(String str) {
        this.f122158g.setHint(str);
        this.f122163o = str;
    }

    public void setSearchIconGone(int i) {
        if (getSearchDone() != null) {
            View searchDone = getSearchDone();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view = searchDone;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/search/FTSEditTextView", "setSearchIconGone", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            searchDone.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/search/FTSEditTextView", "setSearchIconGone", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setSearchIconVisable(int i) {
        WeImageView weImageView = this.f122155d;
        if (weImageView != null) {
            weImageView.setVisibility(8);
        }
    }

    public void setTextColor(int i) {
        this.f122158g.setTextColor(i);
    }

    /* renamed from: t */
    public final void mo70379t() {
        Log.m105925i("MicroMsg.FTS.FTSEditTextView", "updateTagView %s", Integer.valueOf(this.f122159h.size()));
        C76577a.m92157h(getContext(), C0966R.dimen.f3927j7);
        if (this.f122159h.size() >= 1) {
            this.f122160i.setVisibility(0);
            this.f122160i.setText(C102226d.m134696a(getContext(), this.f122159h.get(0).mo8025SE()));
        } else {
            this.f122160i.setVisibility(8);
        }
        if (this.f122159h.size() >= 2) {
            this.f122161j.setVisibility(0);
            this.f122161j.setText(C102226d.m134696a(getContext(), this.f122159h.get(1).mo8025SE()));
        } else {
            this.f122161j.setVisibility(8);
        }
        if (this.f122159h.size() >= 3) {
            this.f122162n.setVisibility(0);
            this.f122162n.setText(C102226d.m134696a(getContext(), this.f122159h.get(2).mo8025SE()));
            return;
        }
        this.f122162n.setVisibility(8);
    }

    public FTSEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo67642i(attributeSet);
    }
}
