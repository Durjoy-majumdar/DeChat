package com.tencent.p014mm.p136ui.tools;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.tools.ActionBarSearchView;
import com.tencent.p014mm.p136ui.tools.SearchViewNotRealTimeHelper;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.ui.tools.l0 */
public interface C106757l0 {
    /* renamed from: a */
    boolean mo153789a();

    /* renamed from: b */
    void mo153790b();

    /* renamed from: c */
    boolean mo153791c();

    /* renamed from: d */
    void mo153792d(boolean z);

    /* renamed from: e */
    void mo153793e(boolean z);

    String getSearchContent();

    void setAutoMatchKeywords(boolean z);

    void setBackClickCallback(ActionBarSearchView.C106732i iVar);

    void setCallBack(ActionBarSearchView.C106733j jVar);

    void setEditTextEnabled(boolean z);

    void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener);

    void setHint(CharSequence charSequence);

    void setImeScene(int i);

    void setKeywords(ArrayList<String> arrayList);

    void setNotRealCallBack(SearchViewNotRealTimeHelper.C45055f fVar);

    void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener);

    void setSearchContent(String str);

    void setSelectedTag(String str);

    void setStatusBtnEnabled(boolean z);
}
