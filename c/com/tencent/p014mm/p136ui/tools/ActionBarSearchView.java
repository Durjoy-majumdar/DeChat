package com.tencent.p014mm.p136ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.p136ui.tools.C106758v1;
import com.tencent.p014mm.p136ui.tools.SearchViewNotRealTimeHelper;
import com.tencent.p014mm.p136ui.widget.AutoMatchKeywordEditText;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import qn3.C77382c;

/* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView */
public class ActionBarSearchView extends LinearLayout implements C106757l0 {

    /* renamed from: u */
    public static final /* synthetic */ int f319069u = 0;

    /* renamed from: d */
    public View f319070d;

    /* renamed from: e */
    public ActionBarEditText f319071e;

    /* renamed from: f */
    public ImageButton f319072f;

    /* renamed from: g */
    public C106734k f319073g = C106734k.CLEAR;

    /* renamed from: h */
    public boolean f319074h = false;

    /* renamed from: i */
    public C106758v1 f319075i;

    /* renamed from: j */
    public View f319076j;

    /* renamed from: n */
    public C106733j f319077n;

    /* renamed from: o */
    public C106732i f319078o;

    /* renamed from: p */
    public TextWatcher f319079p = new C106724a();

    /* renamed from: q */
    public View.OnFocusChangeListener f319080q = new C106725b();

    /* renamed from: r */
    public View.OnFocusChangeListener f319081r;

    /* renamed from: s */
    public View.OnClickListener f319082s = new C106726c();

    /* renamed from: t */
    public View.OnClickListener f319083t = new C106727d();

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$l */
    public class C74830l extends Drawable {

        /* renamed from: a */
        public Paint f219982a;

        /* renamed from: b */
        public String f219983b;

        /* renamed from: c */
        public int f219984c = BackwardSupportUtil.BitmapFactory.fromDPToPix(MMApplicationContext.getContext(), 2.0f);

        /* renamed from: d */
        public float f219985d;

        /* renamed from: e */
        public RectF f219986e;

        public C74830l(ActionBarSearchView actionBarSearchView, EditText editText, String str) {
            Paint paint = new Paint(editText.getPaint());
            this.f219982a = paint;
            this.f219983b = str;
            paint.setColor(MMApplicationContext.getResources().getColor(C0966R.color.f3154h3));
            this.f219985d = this.f219982a.measureText(this.f219983b);
            Paint.FontMetrics fontMetrics = this.f219982a.getFontMetrics();
            float f = this.f219985d;
            float f2 = (float) (this.f219984c * 2);
            setBounds(0, 0, (int) (f + f2 + f2 + 2.0f), (int) ((float) Math.ceil((double) (fontMetrics.bottom - fontMetrics.top))));
        }

        public void draw(Canvas canvas) {
            Paint.FontMetricsInt fontMetricsInt = this.f219982a.getFontMetricsInt();
            Rect bounds = getBounds();
            int i = bounds.right;
            int i2 = bounds.left;
            RectF rectF = this.f219986e;
            float f = rectF.right;
            float f2 = rectF.left;
            int i3 = bounds.top;
            int i4 = fontMetricsInt.top;
            canvas.drawText(this.f219983b, (float) (i2 + 2), (float) ((i3 + ((((bounds.bottom - i3) - fontMetricsInt.bottom) + i4) / 2)) - i4), this.f219982a);
        }

        public int getOpacity() {
            return -3;
        }

        public void setAlpha(int i) {
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            Paint.FontMetrics fontMetrics = this.f219982a.getFontMetrics();
            int i5 = this.f219984c;
            this.f219986e = new RectF((float) (i + i5), ((float) i2) + (fontMetrics.ascent - fontMetrics.top), (float) (i3 - i5), (float) i4);
            invalidateSelf();
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText */
    public static class ActionBarEditText extends AutoMatchKeywordEditText {
        public ActionBarEditText(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public void setSearchView(ActionBarSearchView actionBarSearchView) {
        }

        public ActionBarEditText(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$a */
    public class C106724a implements TextWatcher {
        public C106724a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditText editText;
            String str;
            String str2;
            ActionBarSearchView actionBarSearchView = ActionBarSearchView.this;
            int i4 = ActionBarSearchView.f319069u;
            actionBarSearchView.mo153795g();
            C106758v1 v1Var = ActionBarSearchView.this.f319075i;
            String str3 = "";
            if (v1Var.f319157e && (editText = v1Var.f319154b.get()) != null) {
                if (((charSequence == null || charSequence.toString() == null || charSequence.toString().length() == 0) && ((str2 = v1Var.f319156d) == null || str2.length() == 0)) || !((str = v1Var.f319156d) == null || charSequence == null || !str.equals(charSequence.toString()))) {
                    Log.m105919d("MicroMsg.WordsChecker", "text not change, new : %s, old : %s", charSequence, v1Var.f319156d);
                } else {
                    String charSequence2 = charSequence != null ? charSequence.toString() : str3;
                    v1Var.f319156d = charSequence2;
                    v1Var.f319153a = C106758v1.m144164a(charSequence2, v1Var.f319155c);
                    if (C106758v1.m144165b(editText, v1Var.f319155c)) {
                        Log.m105918d("MicroMsg.WordsChecker", "decorate text succ.");
                    }
                }
            }
            C106733j jVar = ActionBarSearchView.this.f319077n;
            if (jVar != null) {
                if (charSequence != null) {
                    str3 = charSequence.toString();
                }
                C106742j1 j1Var = C106742j1.this;
                if (!j1Var.f319115c) {
                    Log.m105927v(j1Var.f319113a, "onSearchTextChange %s, but not in searching", str3);
                    return;
                }
                C106742j1.C106756o oVar = j1Var.f319122j;
                if (oVar != null) {
                    oVar.mo1324l3(str3);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$b */
    public class C106725b implements View.OnFocusChangeListener {
        public C106725b() {
        }

        public void onFocusChange(View view, boolean z) {
            Log.m105927v("MicroMsg.ActionBarSearchView", "on edittext focus changed, hasFocus %B", Boolean.valueOf(z));
            View.OnFocusChangeListener onFocusChangeListener = ActionBarSearchView.this.f319081r;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$c */
    public class C106726c implements View.OnClickListener {
        public C106726c() {
        }

        public void onClick(View view) {
            C106742j1.C106756o oVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/ActionBarSearchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C106734k.CLEAR == ActionBarSearchView.this.f319073g) {
                Log.m105918d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is clear");
                ActionBarSearchView.this.mo153793e(true);
                C106733j jVar = ActionBarSearchView.this.f319077n;
                if (!(jVar == null || (oVar = C106742j1.this.f319122j) == null)) {
                    oVar.mo1325l5();
                }
            } else {
                Log.m105918d("MicroMsg.ActionBarSearchView", "on status btn click, cur status is voice search");
                C106733j jVar2 = ActionBarSearchView.this.f319077n;
                if (jVar2 != null) {
                    C106742j1 j1Var = C106742j1.this;
                    if (!j1Var.f319115c) {
                        Log.m105926v(j1Var.f319113a, "onVoiceSearchRequired, but not in searching");
                    } else {
                        j1Var.mo23883p();
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/ActionBarSearchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$d */
    public class C106727d implements View.OnClickListener {
        public C106727d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/ActionBarSearchView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C106732i iVar = ActionBarSearchView.this.f319078o;
            if (iVar != null) {
                ((C106742j1.C106750h) iVar).mo153864a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/ActionBarSearchView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$e */
    public class C106728e implements Runnable {
        public C106728e() {
        }

        public void run() {
            C106742j1.C106756o oVar;
            ActionBarSearchView.this.f319071e.setText("");
            C106733j jVar = ActionBarSearchView.this.f319077n;
            if (jVar != null && (oVar = C106742j1.this.f319122j) != null) {
                oVar.mo1326y4();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$f */
    public class C106729f implements View.OnKeyListener {
        public C106729f() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            EditText editText;
            C106758v1.C106759b c;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(keyEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
            boolean z = false;
            if (i == 67) {
                Log.m105918d("MicroMsg.ActionBarSearchView", "on back key click.");
                C106758v1 v1Var = ActionBarSearchView.this.f319075i;
                if (!(!v1Var.f319157e || (editText = v1Var.f319154b.get()) == null || v1Var.f319153a == null)) {
                    Editable text = editText.getText();
                    int selectionStart = editText.getSelectionStart();
                    if (selectionStart == editText.getSelectionEnd() && (c = v1Var.mo153870c(text, selectionStart)) != null && c.f319160c) {
                        int i2 = c.f319158a;
                        text.delete(i2, c.f319159b + i2);
                        editText.setTextKeepState(text);
                        editText.setSelection(c.f319158a);
                        z = true;
                    }
                }
                C117292a.m165362h(z, this, "com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
                return z;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$g */
    public class C106730g implements AutoMatchKeywordEditText.C106761a {
        public C106730g() {
        }

        /* renamed from: a */
        public void mo153823a(EditText editText, int i, int i2) {
            EditText editText2;
            Log.m105919d("MicroMsg.ActionBarSearchView", "start : %d, stop : %d", Integer.valueOf(i), Integer.valueOf(i2));
            C106758v1 v1Var = ActionBarSearchView.this.f319075i;
            if (v1Var.f319157e && (editText2 = v1Var.f319154b.get()) != null && editText == editText2) {
                Editable text = editText2.getText();
                int selectionStart = editText2.getSelectionStart();
                int selectionEnd = editText2.getSelectionEnd();
                if (selectionStart >= 0 && selectionEnd >= selectionStart) {
                    if (selectionStart == selectionEnd) {
                        C106758v1.C106759b c = v1Var.mo153870c(text, selectionStart);
                        if (c != null && c.f319160c) {
                            editText2.setTextKeepState(text);
                            editText2.setSelection(c.f319158a + c.f319159b);
                            return;
                        }
                        return;
                    }
                    C106758v1.C106759b c2 = v1Var.mo153870c(text, selectionStart);
                    if (c2 != null && c2.f319160c) {
                        selectionStart = c2.f319158a + c2.f319159b;
                    }
                    if (selectionStart >= selectionEnd) {
                        editText2.setTextKeepState(text);
                        editText2.setSelection(selectionStart);
                        return;
                    }
                    C106758v1.C106759b c3 = v1Var.mo153870c(text, selectionEnd);
                    if (c3 != null && c3.f319160c) {
                        int i3 = c3.f319158a;
                        editText2.setTextKeepState(text);
                        editText2.setSelection(selectionStart, i3);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$h */
    public class C106731h implements View.OnClickListener {
        public C106731h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/tools/ActionBarSearchView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ActionBarSearchView.this.mo153791c();
            ActionBarSearchView actionBarSearchView = ActionBarSearchView.this;
            ((InputMethodManager) actionBarSearchView.getContext().getSystemService("input_method")).showSoftInput(actionBarSearchView.f319071e, 0);
            C117292a.m165361g(this, "com/tencent/mm/ui/tools/ActionBarSearchView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$i */
    public interface C106732i {
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$j */
    public interface C106733j {
    }

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$k */
    public enum C106734k {
        CLEAR,
        VOICE_SEARCH
    }

    public ActionBarSearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo153794f();
    }

    /* renamed from: a */
    public boolean mo153789a() {
        ActionBarEditText actionBarEditText = this.f319071e;
        if (actionBarEditText != null) {
            return actionBarEditText.hasFocus();
        }
        return false;
    }

    /* renamed from: b */
    public void mo153790b() {
        this.f319071e.clearFocus();
    }

    /* renamed from: c */
    public boolean mo153791c() {
        ActionBarEditText actionBarEditText = this.f319071e;
        if (actionBarEditText != null) {
            return actionBarEditText.requestFocus();
        }
        return false;
    }

    /* renamed from: d */
    public void mo153792d(boolean z) {
        this.f319074h = z;
        mo153795g();
    }

    /* renamed from: e */
    public void mo153793e(boolean z) {
        if (!z) {
            this.f319071e.removeTextChangedListener(this.f319079p);
            this.f319071e.setText("");
            this.f319071e.addTextChangedListener(this.f319079p);
            return;
        }
        this.f319071e.setText("");
    }

    /* renamed from: f */
    public final void mo153794f() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(getLayoutId(), this, true);
        View findViewById = findViewById(C0966R.C0970id.apy);
        this.f319070d = findViewById;
        findViewById.setOnClickListener(this.f319083t);
        ActionBarEditText actionBarEditText = (ActionBarEditText) findViewById(C0966R.C0970id.cd7);
        this.f319071e = actionBarEditText;
        this.f319075i = new C106758v1(actionBarEditText);
        this.f319071e.setSearchView(this);
        this.f319076j = (WeImageView) findViewById(C0966R.C0970id.j5t);
        this.f319071e.post(new C106728e());
        this.f319072f = (ImageButton) findViewById(C0966R.C0970id.k17);
        this.f319071e.addTextChangedListener(this.f319079p);
        this.f319071e.setOnKeyListener(new C106729f());
        this.f319071e.setOnSelectionChangeListener(new C106730g());
        this.f319071e.setOnFocusChangeListener(this.f319080q);
        C77382c b = C77382c.m93286b(this.f319071e);
        b.f225611e = 0;
        b.f225610d = 100;
        b.mo107499d((C77382c.C77383a) null);
        this.f319072f.setOnClickListener(this.f319082s);
        if (this.f319072f.getDrawable() != null) {
            this.f319072f.getDrawable().setColorFilter(getResources().getColor(C0966R.color.FG_0), PorterDuff.Mode.SRC_ATOP);
        }
        View view = this.f319076j;
        if (view != null) {
            view.setOnClickListener(new C106731h());
        }
    }

    /* renamed from: g */
    public final void mo153795g() {
        C106734k kVar = C106734k.CLEAR;
        if (this.f319071e.getEditableText() != null && !Util.isNullOrNil(this.f319071e.getEditableText().toString())) {
            this.f319072f.setImageResource(C0966R.C0969drawable.aq8);
            this.f319073g = kVar;
        } else if (this.f319074h) {
            this.f319072f.setImageResource(C0966R.C0969drawable.b0d);
            this.f319073g = C106734k.VOICE_SEARCH;
        } else {
            this.f319072f.setImageResource(0);
            this.f319073g = kVar;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6308b_;
    }

    public String getSearchContent() {
        return this.f319071e.getEditableText() != null ? this.f319071e.getEditableText().toString() : "";
    }

    public int getSelectionEnd() {
        ActionBarEditText actionBarEditText = this.f319071e;
        if (actionBarEditText != null) {
            return actionBarEditText.getSelectionEnd();
        }
        return -1;
    }

    public int getSelectionStart() {
        ActionBarEditText actionBarEditText = this.f319071e;
        if (actionBarEditText != null) {
            return actionBarEditText.getSelectionStart();
        }
        return -1;
    }

    public void setAutoMatchKeywords(boolean z) {
        C106758v1 v1Var = this.f319075i;
        if (v1Var != null) {
            v1Var.f319157e = z;
        }
    }

    public void setBackClickCallback(C106732i iVar) {
        this.f319078o = iVar;
    }

    public void setCallBack(C106733j jVar) {
        this.f319077n = jVar;
    }

    public void setEditTextClickListener(View.OnClickListener onClickListener) {
        ActionBarEditText actionBarEditText = this.f319071e;
        if (actionBarEditText != null) {
            actionBarEditText.setFocusable(false);
            this.f319071e.setOnClickListener(onClickListener);
        }
    }

    public void setEditTextEnabled(boolean z) {
        this.f319071e.setEnabled(z);
    }

    public void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f319081r = onFocusChangeListener;
    }

    public void setHint(CharSequence charSequence) {
        this.f319071e.setHint(charSequence);
    }

    public void setImeScene(int i) {
        ActionBarEditText actionBarEditText = this.f319071e;
        if (actionBarEditText != null) {
            actionBarEditText.getInputExtras(true).putInt("wechat_scene", i);
        }
    }

    public void setKeywords(ArrayList<String> arrayList) {
        EditText editText;
        C106758v1 v1Var = this.f319075i;
        if (v1Var != null) {
            v1Var.f319155c = arrayList;
            if (v1Var.f319157e && (editText = v1Var.f319154b.get()) != null) {
                C106758v1.m144165b(editText, v1Var.f319155c);
            }
        }
    }

    public void setNotRealCallBack(SearchViewNotRealTimeHelper.C45055f fVar) {
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.f319071e.setOnEditorActionListener(onEditorActionListener);
    }

    public void setSearchContent(String str) {
        if (str == null) {
            str = "";
        }
        this.f319071e.setText(str);
        this.f319071e.setSelection(str.length());
    }

    public void setSearchTipIcon(int i) {
        ActionBarEditText actionBarEditText = this.f319071e;
        if (actionBarEditText != null) {
            actionBarEditText.setCompoundDrawables(MMApplicationContext.getResources().getDrawable(i), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void setSelectedTag(String str) {
        ActionBarEditText actionBarEditText = this.f319071e;
        if (actionBarEditText != null) {
            actionBarEditText.setCompoundDrawables(new C74830l(this, this.f319071e, str), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f319071e.setHint("");
        }
    }

    public void setStatusBtnEnabled(boolean z) {
        this.f319072f.setEnabled(z);
    }

    public ActionBarSearchView(Context context) {
        super(context);
        mo153794f();
    }
}
