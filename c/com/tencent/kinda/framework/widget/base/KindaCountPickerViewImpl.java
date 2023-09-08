package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import com.tencent.kinda.gen.KCountPickerView;
import com.tencent.kinda.gen.KCountPickerViewOnSelectCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;

public class KindaCountPickerViewImpl extends MMKView implements KCountPickerView {
    private Context mContext;
    /* access modifiers changed from: private */
    public KCountPickerViewOnSelectCallback mCountPickerCallback;
    /* access modifiers changed from: private */
    public EditText mEditText;
    /* access modifiers changed from: private */
    public int mSelectCreCountIndex;
    private String[] mTimesArray;

    public View createView(Context context) {
        this.mContext = context;
        this.mTimesArray = new String[100];
        int i = 0;
        while (true) {
            String[] strArr = this.mTimesArray;
            if (i < strArr.length) {
                strArr[i] = this.mContext.getString(C0966R.string.krl, new Object[]{String.valueOf(i)});
                i++;
            } else {
                this.mSelectCreCountIndex = 0;
                EditText editText = new EditText(context);
                this.mEditText = editText;
                editText.setInputType(0);
                this.mEditText.setFocusable(false);
                this.mEditText.setBackground((Drawable) null);
                this.mEditText.setHint(C0966R.string.ko9);
                this.mEditText.setPadding(0, 0, 0, 0);
                this.mEditText.setTextSize(16.0f);
                return this.mEditText;
            }
        }
    }

    public boolean getFocus() {
        EditText editText = this.mEditText;
        if (editText == null) {
            return false;
        }
        return editText.hasFocus();
    }

    public String getValue() {
        return "" + this.mSelectCreCountIndex;
    }

    public void setDefaultCount(int i) {
        this.mSelectCreCountIndex = i;
        this.mEditText.setText(this.mContext.getString(C0966R.string.krl, new Object[]{String.valueOf(i)}));
    }

    public void setFocus(boolean z) {
        if (z) {
            final C7045j jVar = new C7045j(this.mContext, this.mTimesArray);
            jVar.f24869t = new C7045j.C7056k() {
                public void onResult(boolean z, Object obj, Object obj2) {
                    if (z) {
                        int unused = KindaCountPickerViewImpl.this.mSelectCreCountIndex = jVar.mo8099b();
                        KindaCountPickerViewImpl.this.mEditText.setText(obj.toString());
                        KindaCountPickerViewImpl.this.mCountPickerCallback.onSelect(String.valueOf(KindaCountPickerViewImpl.this.mSelectCreCountIndex));
                    }
                    jVar.mo8101d();
                }
            };
            jVar.mo8106i(this.mSelectCreCountIndex);
            jVar.mo8109l();
        }
    }

    public void setOnSelectCallback(KCountPickerViewOnSelectCallback kCountPickerViewOnSelectCallback) {
        this.mCountPickerCallback = kCountPickerViewOnSelectCallback;
    }

    public void setValue(String str) {
    }
}
