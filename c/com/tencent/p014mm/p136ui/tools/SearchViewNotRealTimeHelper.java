package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.tools.ActionBarSearchView;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gx0.C45977n;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import qn3.C77382c;

/* renamed from: com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper */
public class SearchViewNotRealTimeHelper extends LinearLayout implements C106757l0 {

    /* renamed from: d */
    public View f319096d;

    /* renamed from: e */
    public EditText f319097e;

    /* renamed from: f */
    public ImageButton f319098f;

    /* renamed from: g */
    public Button f319099g;

    /* renamed from: h */
    public C45055f f319100h;

    /* renamed from: i */
    public ActionBarSearchView.C106732i f319101i;

    /* renamed from: com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper$f */
    public interface C45055f {
    }

    /* renamed from: com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper$a */
    public class C106736a implements TextWatcher {
        public C106736a() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() <= 0) {
                SearchViewNotRealTimeHelper.this.f319098f.setVisibility(8);
                SearchViewNotRealTimeHelper.this.f319099g.setEnabled(false);
                return;
            }
            SearchViewNotRealTimeHelper.this.f319098f.setVisibility(0);
            SearchViewNotRealTimeHelper.this.f319099g.setEnabled(true);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper$b */
    public class C106737b implements TextView.OnEditorActionListener {
        public C106737b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r0.f319103d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            /*
                r0 = this;
                r1 = 3
                if (r1 != r2) goto L_0x0014
                com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper r1 = com.tencent.p014mm.p136ui.tools.SearchViewNotRealTimeHelper.this
                com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper$f r2 = r1.f319100h
                if (r2 == 0) goto L_0x0014
                java.lang.String r1 = r1.getSearchContent()
                gx0.n r2 = (gx0.C45977n) r2
                r2.mo71368a(r1)
                r1 = 1
                return r1
            L_0x0014:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.tools.SearchViewNotRealTimeHelper.C106737b.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper$c */
    public class C106738c implements View.OnClickListener {
        public C106738c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SearchViewNotRealTimeHelper.this.f319097e.setText("");
            C45055f fVar = SearchViewNotRealTimeHelper.this.f319100h;
            if (fVar != null) {
                ((C45977n) fVar).f123995a.showVKB();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper$d */
    public class C106739d implements View.OnClickListener {
        public C106739d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105926v("MicroMsg.SearchViewNotRealTimeHelper", "home btn click");
            C45055f fVar = SearchViewNotRealTimeHelper.this.f319100h;
            if (fVar != null) {
                fVar.getClass();
            }
            ActionBarSearchView.C106732i iVar = SearchViewNotRealTimeHelper.this.f319101i;
            if (iVar != null) {
                ((C106742j1.C106750h) iVar).mo153864a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper$e */
    public class C106740e implements View.OnClickListener {
        public C106740e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SearchViewNotRealTimeHelper searchViewNotRealTimeHelper = SearchViewNotRealTimeHelper.this;
            C45055f fVar = searchViewNotRealTimeHelper.f319100h;
            if (fVar != null) {
                ((C45977n) fVar).mo71368a(searchViewNotRealTimeHelper.getSearchContent());
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public SearchViewNotRealTimeHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo153829f();
    }

    /* renamed from: a */
    public boolean mo153789a() {
        return false;
    }

    /* renamed from: b */
    public void mo153790b() {
        this.f319097e.clearFocus();
    }

    /* renamed from: c */
    public boolean mo153791c() {
        return false;
    }

    /* renamed from: d */
    public void mo153792d(boolean z) {
    }

    /* renamed from: e */
    public void mo153793e(boolean z) {
        if (!z) {
            this.f319097e.setText("");
        } else {
            this.f319097e.setText("");
        }
    }

    /* renamed from: f */
    public final void mo153829f() {
        C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.f6309ba, this, true);
        this.f319097e = (EditText) findViewById(C0966R.C0970id.cd7);
        this.f319098f = (ImageButton) findViewById(C0966R.C0970id.k17);
        this.f319096d = findViewById(C0966R.C0970id.f5290b2);
        Button button = (Button) findViewById(C0966R.C0970id.anq);
        this.f319099g = button;
        button.setEnabled(false);
        this.f319097e.addTextChangedListener(new C106736a());
        this.f319097e.setOnEditorActionListener(new C106737b());
        C77382c b = C77382c.m93286b(this.f319097e);
        b.f225611e = 0;
        b.f225610d = 100;
        b.mo107499d((C77382c.C77383a) null);
        this.f319098f.setOnClickListener(new C106738c());
        this.f319096d.setOnClickListener(new C106739d());
        this.f319099g.setOnClickListener(new C106740e());
    }

    public String getSearchContent() {
        Editable editableText = this.f319097e.getEditableText();
        return editableText == null ? "" : editableText.toString();
    }

    public int getSelectionEnd() {
        return -1;
    }

    public int getSelectionStart() {
        return -1;
    }

    public boolean hasFocus() {
        return false;
    }

    public void setAutoMatchKeywords(boolean z) {
    }

    public void setBackClickCallback(ActionBarSearchView.C106732i iVar) {
        this.f319101i = iVar;
    }

    public void setCallBack(ActionBarSearchView.C106733j jVar) {
    }

    public void setCallBack(C45055f fVar) {
        this.f319100h = fVar;
    }

    public void setEditTextEnabled(boolean z) {
    }

    public void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
    }

    public void setHint(CharSequence charSequence) {
        setSearchHint(charSequence);
    }

    public void setImeScene(int i) {
        EditText editText = this.f319097e;
        if (editText != null) {
            editText.getInputExtras(true).putInt("wechat_scene", i);
        }
    }

    public void setKeywords(ArrayList<String> arrayList) {
    }

    public void setNotRealCallBack(C45055f fVar) {
        this.f319100h = fVar;
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
    }

    public void setSearchBtnText(CharSequence charSequence) {
        this.f319099g.setText(charSequence);
    }

    public void setSearchColor(int i) {
        this.f319097e.setTextColor(i);
    }

    public void setSearchContent(CharSequence charSequence) {
        this.f319097e.setText("");
        this.f319097e.append(charSequence);
    }

    public void setSearchHint(CharSequence charSequence) {
        this.f319097e.setHint(charSequence);
    }

    public void setSearchHintColor(int i) {
        this.f319097e.setHintTextColor(i);
    }

    public void setSearchIcon(int i) {
        this.f319097e.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public void setSearchTipIcon(int i) {
    }

    public void setSelectedTag(String str) {
    }

    public void setShowBackIcon(boolean z) {
        View view = this.f319096d;
        if (view == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view3 = view;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setStatusBtnEnabled(boolean z) {
    }

    public SearchViewNotRealTimeHelper(Context context) {
        super(context);
        mo153829f();
    }

    public void setSearchContent(String str) {
        setSearchContent((CharSequence) str);
    }
}
