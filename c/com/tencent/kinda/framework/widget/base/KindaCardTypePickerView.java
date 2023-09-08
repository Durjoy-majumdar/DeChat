package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.kinda.framework.widget.tools.MMKViewUtil;
import com.tencent.kinda.gen.KCardTypePickerView;
import com.tencent.kinda.gen.KCardTypePickerViewOnSelectCallback;
import com.tencent.kinda.gen.Option;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.Iterator;

public class KindaCardTypePickerView extends MMKView<View> implements KCardTypePickerView {
    public String TAG = "KindaCardTypePickerView";
    /* access modifiers changed from: private */
    public KCardTypePickerViewOnSelectCallback mCallBack;
    /* access modifiers changed from: private */
    public LinearLayout mContainer;
    private Context mContext;
    /* access modifiers changed from: private */
    public EditText mEditText;
    /* access modifiers changed from: private */
    public C7045j mOptionPiker;
    private ArrayList<Option> mOptions;
    /* access modifiers changed from: private */
    public int selected = -1;

    public View createView(Context context) {
        EditText editText = new EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground((Drawable) null);
        this.mEditText.setTextSize(1, MMKViewUtil.getScaleSize(context) * 17.0f);
        this.mEditText.setPadding(0, 0, 0, 0);
        this.mContext = context;
        this.mEditText.setHintTextColor(context.getResources().getColor(C0966R.color.FG_0));
        this.mEditText.setTextColor(context.getResources().getColor(C0966R.color.FG_0));
        LayoutWrapper layoutWrapper = new LayoutWrapper(context, this.mEditText);
        this.mContainer = layoutWrapper;
        return layoutWrapper;
    }

    public boolean getEnabled() {
        return this.mEditText.isEnabled();
    }

    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    public void select(int i) {
        this.selected = i;
        this.mEditText.setText(this.mOptions.get(i).mContent);
        this.mContainer.setContentDescription(this.mOptions.get(i).mContent);
    }

    public void setEnabled(boolean z) {
        this.mEditText.setEnabled(z);
        if (z) {
            this.mEditText.setTextColor(this.mContext.getResources().getColor(C0966R.color.FG_0));
        } else {
            this.mEditText.setTextColor(this.mContext.getResources().getColor(C0966R.color.FG_1));
        }
    }

    public void setFocus(boolean z) {
        if (z && this.mEditText.isEnabled()) {
            ArrayList arrayList = new ArrayList();
            Iterator<Option> it = this.mOptions.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mContent);
            }
            C7045j jVar = new C7045j(this.mContext, (ArrayList<String>) arrayList);
            this.mOptionPiker = jVar;
            jVar.f24869t = new C7045j.C7056k() {
                public void onResult(boolean z, Object obj, Object obj2) {
                    KindaCardTypePickerView.this.mOptionPiker.mo8101d();
                    if (z) {
                        String str = (String) obj;
                        KindaCardTypePickerView.this.mEditText.setText(str);
                        KindaCardTypePickerView.this.mContainer.setContentDescription(str);
                        KindaCardTypePickerView kindaCardTypePickerView = KindaCardTypePickerView.this;
                        int unused = kindaCardTypePickerView.selected = kindaCardTypePickerView.mOptionPiker.mo8099b();
                        KindaCardTypePickerView.this.mCallBack.onSelect(KindaCardTypePickerView.this.mOptionPiker.mo8099b());
                    }
                }
            };
            int i = this.selected;
            if (i != -1) {
                this.mOptionPiker.mo8106i(i);
            }
            this.mOptionPiker.mo8109l();
        }
    }

    public void setHint(String str) {
        EditText editText = this.mEditText;
        if (editText != null) {
            editText.setHint(str);
            if (this.mContainer != null && Util.isNullOrNil((CharSequence) this.mEditText.getText())) {
                this.mContainer.setContentDescription(str);
            }
        }
    }

    public void setOnSelectCallback(KCardTypePickerViewOnSelectCallback kCardTypePickerViewOnSelectCallback) {
        this.mCallBack = kCardTypePickerViewOnSelectCallback;
    }

    public void setOptions(ArrayList<Option> arrayList) {
        this.mEditText.setText("");
        this.mContainer.setContentDescription("");
        this.mOptions = arrayList;
    }

    public void setTextSize(float f) {
        if (f > 0.0f) {
            float f2 = 1.0f;
            if (getSupportDynamicSize()) {
                f2 = MMKViewUtil.getScaleSize(MMApplicationContext.getContext());
            }
            this.mEditText.setTextSize(1, f * f2);
            notifyChanged();
        }
    }
}
