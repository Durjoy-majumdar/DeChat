package com.tencent.p014mm.plugin.emoji.p040ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.plugin.emoji.ui.widget.MMCopiableTextView */
public class MMCopiableTextView extends EditText implements View.OnLongClickListener {

    /* renamed from: d */
    public int f197884d;

    /* renamed from: e */
    public int f197885e;

    public MMCopiableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnLongClickListener(this);
        setLongClickable(true);
    }

    public boolean getDefaultEditable() {
        return false;
    }

    public void onCreateContextMenu(ContextMenu contextMenu) {
    }

    public boolean onLongClick(View view) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/emoji/ui/widget/MMCopiableTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        String obj = getEditableText().toString();
        if (!Util.isNullOrNil(obj) && (i = this.f197884d) > 0 && (i2 = this.f197885e) > 0 && i2 > i) {
            ClipboardHelper.setText(obj.substring(i, i2).trim());
            C76701a.makeText(getContext(), (int) C0966R.string.f7938wv, 0).show();
        }
        C117292a.m165362h(false, this, "com/tencent/mm/plugin/emoji/ui/widget/MMCopiableTextView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }

    public void setEndIndex(int i) {
        this.f197885e = i;
    }

    public void setStartIndex(int i) {
        this.f197884d = i;
    }

    public MMCopiableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOnLongClickListener(this);
        setLongClickable(true);
    }
}
