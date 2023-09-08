package com.tencent.p014mm.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;

/* renamed from: com.tencent.mm.view.SmileyGrid */
public class SmileyGrid extends GridView {

    /* renamed from: d */
    public ListAdapter f122382d;

    /* renamed from: e */
    public int f122383e = 20;

    /* renamed from: f */
    public C72837v1 f122384f;

    public SmileyGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = ChatFooterPanel.f211589f;
    }

    public int getSmileyType() {
        return this.f122383e;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setCallback(C72837v1 v1Var) {
        this.f122384f = v1Var;
    }

    public void setOnTextOperationListener(ChatFooterPanel.C72719a aVar) {
    }

    public void setScene(int i) {
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f122382d = listAdapter;
    }
}
