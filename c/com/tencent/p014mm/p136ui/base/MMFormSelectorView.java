package com.tencent.p014mm.p136ui.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import wq3.C111847h;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.base.MMFormSelectorView */
public class MMFormSelectorView extends LinearLayout implements C111847h {

    /* renamed from: d */
    public Context f24190d;

    /* renamed from: e */
    public TextView f24191e;

    /* renamed from: f */
    public EditText f24192f;

    /* renamed from: g */
    public String f24193g;

    /* renamed from: h */
    public String f24194h;

    /* renamed from: i */
    public int f24195i;

    public MMFormSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f24195i = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C79142a.f232405d, i, 0);
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            this.f24193g = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.f24194h = context.getString(resourceId2);
        }
        this.f24195i = obtainStyledAttributes.getResourceId(2, this.f24195i);
        obtainStyledAttributes.recycle();
        View.inflate(context, this.f24195i, this);
        this.f24190d = context;
    }

    public String getText() {
        EditText editText = this.f24192f;
        if (editText != null) {
            return editText.getText().toString();
        }
        Log.m105920e("MicroMsg.MMFormSelectorView", "contentET is null!");
        return null;
    }

    public void onFinishInflate() {
        this.f24191e = (TextView) findViewById(C0966R.C0970id.knx);
        EditText editText = (EditText) findViewById(C0966R.C0970id.cd7);
        this.f24192f = editText;
        TextView textView = this.f24191e;
        if (textView == null || editText == null) {
            Log.m105929w("MicroMsg.MMFormSelectorView", "titleTV : %s, contentET : %s", textView, editText);
            return;
        }
        String str = this.f24193g;
        if (str != null) {
            textView.setText(str);
        }
        String str2 = this.f24194h;
        if (str2 != null) {
            this.f24192f.setHint(str2);
        }
    }

    public void setHint(String str) {
        EditText editText = this.f24192f;
        if (editText != null) {
            editText.setHint(str);
        } else {
            Log.m105920e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    public void setText(String str) {
        EditText editText = this.f24192f;
        if (editText != null) {
            editText.setText(str);
        } else {
            Log.m105920e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f24191e;
        if (textView != null) {
            textView.setText(str);
        } else {
            Log.m105920e("MicroMsg.MMFormSelectorView", "titleTV is null!");
        }
    }

    public void setHint(int i) {
        EditText editText = this.f24192f;
        if (editText != null) {
            editText.setHint(i);
        } else {
            Log.m105920e("MicroMsg.MMFormSelectorView", "contentET is null!");
        }
    }

    public void setTitle(int i) {
        TextView textView = this.f24191e;
        if (textView != null) {
            textView.setText(i);
        } else {
            Log.m105920e("MicroMsg.MMFormSelectorView", "titleTV is null!");
        }
    }

    public MMFormSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
