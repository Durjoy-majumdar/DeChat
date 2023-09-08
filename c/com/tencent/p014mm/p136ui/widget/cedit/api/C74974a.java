package com.tencent.p014mm.p136ui.widget.cedit.api;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputConnection;
import cj3.C67383b;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import ro3.C110588j;
import ro3.C77558f;

/* renamed from: com.tencent.mm.ui.widget.cedit.api.a */
public interface C74974a {

    /* renamed from: com.tencent.mm.ui.widget.cedit.api.a$a */
    public interface C74975a {
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.api.a$b */
    public interface C74976b {
        /* renamed from: a */
        boolean mo93502a(C74974a aVar, int i, KeyEvent keyEvent);
    }

    /* renamed from: com.tencent.mm.ui.widget.cedit.api.a$c */
    public interface C74977c {
        /* renamed from: a */
        void mo71794a(int i, int i2, Layout layout);
    }

    /* renamed from: a */
    void mo104239a(boolean z);

    void addOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);

    void addTextChangedListener(TextWatcher textWatcher);

    void append(CharSequence charSequence);

    /* renamed from: b */
    void mo104240b();

    /* renamed from: c */
    void mo104241c();

    void clearComposingText();

    void clearFocus();

    /* renamed from: d */
    void mo104242d(C77558f fVar);

    void destroy();

    /* renamed from: e */
    void mo104244e(String str, String str2, C110588j.C110590c cVar, C110588j.C77559a.C77560a aVar);

    /* renamed from: f */
    void mo104245f(boolean z);

    /* renamed from: g */
    void mo104247g();

    CharSequence getContentDescription();

    CharSequence getHint();

    int getImeOptions();

    InputConnection getInputConnection();

    Bundle getInputExtras(boolean z);

    int getInputType();

    Layout getLayout();

    int getLineCount();

    int getMeasuredHeight();

    int getMinimumHeight();

    TextPaint getPaint();

    CharSequence getPasterContent();

    int getPasterLen();

    C110588j getSelectHelper();

    int getSelectionStart();

    boolean getSimilarPasteChange();

    String getSimilarPasteSeqStr();

    C67383b getSizeAnimController();

    Object getTag(int i);

    Editable getText();

    float getTextSize();

    int getVisibility();

    /* renamed from: h */
    Context mo104251h();

    /* renamed from: i */
    boolean mo104252i();

    /* renamed from: j */
    ViewParent mo104253j();

    /* renamed from: k */
    void mo104254k(C74976b bVar);

    /* renamed from: l */
    int mo104255l();

    int length();

    /* renamed from: m */
    boolean mo104256m();

    /* renamed from: n */
    View mo104257n();

    /* renamed from: o */
    void mo98046o(String str);

    void onPause();

    /* renamed from: p */
    void mo104453p();

    void removeOnLayoutChangeListener(View.OnLayoutChangeListener onLayoutChangeListener);

    void removeTextChangedListener(TextWatcher textWatcher);

    void setAlpha(float f);

    void setBackListener(MMEditText.C74949b bVar);

    void setBreakStrategy(int i);

    void setContentDescription(CharSequence charSequence);

    void setCustomSelectionActionModeCallback(ActionMode.Callback callback);

    void setEnableSendBtn(boolean z);

    void setFilters(InputFilter[] inputFilterArr);

    void setHint(CharSequence charSequence);

    void setImeOptions(int i);

    void setImeSendImageCallback(C74975a aVar);

    void setInputType(int i);

    void setKeyCodeEnterListener(MMEditText.C74951e eVar);

    void setMaxHeight(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnDragListener(View.OnDragListener onDragListener);

    void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener);

    void setOnKeyListener(View.OnKeyListener onKeyListener);

    void setOnLongClickListener(View.OnLongClickListener onLongClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setPasterLen(int i);

    void setSelection(int i);

    void setSelectionChangedListener(C74977c cVar);

    void setTag(int i, Object obj);

    void setText(CharSequence charSequence);

    void setTextColor(int i);

    void setTextCursorDrawable(Drawable drawable);

    void setTextSize(int i, float f);

    void setVisibility(int i);

    View view();
}
