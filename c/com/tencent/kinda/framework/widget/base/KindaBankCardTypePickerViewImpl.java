package com.tencent.kinda.framework.widget.base;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import com.tencent.kinda.framework.C67448R;
import com.tencent.kinda.gen.BankCardType;
import com.tencent.kinda.gen.KBankCardTypePickerView;
import com.tencent.kinda.gen.KBankCardTypePickerViewOnSelectCallback;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.p136ui.widget.picker.CustomOptionPickNew;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class KindaBankCardTypePickerViewImpl extends MMKView<EditText> implements KBankCardTypePickerView {
    public String TAG = "KindaBankCardTypePickerViewImpl";
    private ArrayList<BankCardType> mBankCardTypeArray;
    private Context mContext;
    /* access modifiers changed from: private */
    public EditText mEditText;
    private ArrayList<String> mFirstOptionList = null;
    /* access modifiers changed from: private */
    public int mFirstSelectedIndex = -1;
    /* access modifiers changed from: private */
    public KBankCardTypePickerViewOnSelectCallback mOnSelectCallback;
    /* access modifiers changed from: private */
    public C7045j mOptionPiker;
    /* access modifiers changed from: private */
    public ArrayList<List<BankCardType>> mSecondOptionList = null;
    private Map<String, ArrayList<BankCardType>> mSecondOptionMap = null;
    private ArrayList<List<String>> mSecondOptionStringList = null;
    private Map<String, ArrayList<String>> mSecondOptionStringMap = null;
    /* access modifiers changed from: private */
    public int mSecondSelectedIndex = -1;
    /* access modifiers changed from: private */
    public BankCardType mSelectedBankCardType;

    public boolean getFocus() {
        return this.mEditText.isFocused();
    }

    public String getValue() {
        return this.mSelectedBankCardType.mBankType;
    }

    public void setBankCardType(ArrayList<BankCardType> arrayList) {
        this.mBankCardTypeArray = arrayList;
        this.mFirstOptionList = new ArrayList<>();
        this.mSecondOptionMap = new HashMap();
        this.mSecondOptionStringMap = new HashMap();
        Iterator<BankCardType> it = this.mBankCardTypeArray.iterator();
        while (it.hasNext()) {
            BankCardType next = it.next();
            if (!this.mSecondOptionMap.containsKey(next.mBankName)) {
                this.mFirstOptionList.add(next.mBankName);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(next);
                this.mSecondOptionMap.put(next.mBankName, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(next.mBankaccTypeName);
                this.mSecondOptionStringMap.put(next.mBankName, arrayList3);
            } else {
                ArrayList arrayList4 = this.mSecondOptionMap.get(next.mBankName);
                arrayList4.add(next);
                this.mSecondOptionMap.put(next.mBankName, arrayList4);
                ArrayList arrayList5 = this.mSecondOptionStringMap.get(next.mBankName);
                arrayList5.add(next.mBankaccTypeName);
                this.mSecondOptionStringMap.put(next.mBankName, arrayList5);
            }
        }
        this.mSecondOptionList = new ArrayList<>();
        this.mSecondOptionStringList = new ArrayList<>();
        Iterator<String> it4 = this.mFirstOptionList.iterator();
        while (it4.hasNext()) {
            String next2 = it4.next();
            this.mSecondOptionList.add(this.mSecondOptionMap.get(next2));
            this.mSecondOptionStringList.add(this.mSecondOptionStringMap.get(next2));
        }
    }

    public void setFocus(boolean z) {
        if (z) {
            C7045j jVar = new C7045j(this.mContext, this.mFirstOptionList, this.mSecondOptionStringList);
            this.mOptionPiker = jVar;
            jVar.f24869t = new C7045j.C7056k() {
                public void onResult(boolean z, Object obj, Object obj2) {
                    KindaBankCardTypePickerViewImpl.this.mOptionPiker.mo8101d();
                    if (z) {
                        EditText access$100 = KindaBankCardTypePickerViewImpl.this.mEditText;
                        access$100.setText(((String) obj) + " " + ((String) obj2));
                        KindaBankCardTypePickerViewImpl kindaBankCardTypePickerViewImpl = KindaBankCardTypePickerViewImpl.this;
                        int unused = kindaBankCardTypePickerViewImpl.mFirstSelectedIndex = kindaBankCardTypePickerViewImpl.mOptionPiker.mo8099b();
                        KindaBankCardTypePickerViewImpl kindaBankCardTypePickerViewImpl2 = KindaBankCardTypePickerViewImpl.this;
                        CustomOptionPickNew customOptionPickNew = kindaBankCardTypePickerViewImpl2.mOptionPiker.f24867r;
                        int unused2 = kindaBankCardTypePickerViewImpl2.mSecondSelectedIndex = customOptionPickNew != null ? customOptionPickNew.getValue() : 0;
                        if (KindaBankCardTypePickerViewImpl.this.mFirstSelectedIndex >= 0 && KindaBankCardTypePickerViewImpl.this.mSecondSelectedIndex >= 0) {
                            BankCardType bankCardType = (BankCardType) ((List) KindaBankCardTypePickerViewImpl.this.mSecondOptionList.get(KindaBankCardTypePickerViewImpl.this.mFirstSelectedIndex)).get(KindaBankCardTypePickerViewImpl.this.mSecondSelectedIndex);
                            BankCardType unused3 = KindaBankCardTypePickerViewImpl.this.mSelectedBankCardType = bankCardType;
                            KindaBankCardTypePickerViewImpl.this.mOnSelectCallback.onSelect(bankCardType.mBankType);
                        }
                    }
                }
            };
            int i = this.mFirstSelectedIndex;
            if (i >= 0) {
                int i2 = this.mSecondSelectedIndex;
                if (i2 >= 0) {
                    this.mOptionPiker.mo8107j(i, i2);
                } else {
                    this.mOptionPiker.mo8106i(i);
                }
            }
            this.mOptionPiker.mo8109l();
        }
    }

    public void setOnSelectCallback(KBankCardTypePickerViewOnSelectCallback kBankCardTypePickerViewOnSelectCallback) {
        this.mOnSelectCallback = kBankCardTypePickerViewOnSelectCallback;
    }

    public void setSelectedBankCardType(BankCardType bankCardType) {
        if (bankCardType != null && !bankCardType.mIsMaintainance && bankCardType.mForbidWord.length() <= 0) {
            this.mSelectedBankCardType = bankCardType;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.mFirstOptionList.size()) {
                    break;
                } else if (this.mFirstOptionList.get(i2).equals(bankCardType.mBankName)) {
                    this.mFirstSelectedIndex = i2;
                    break;
                } else {
                    i2++;
                }
            }
            while (true) {
                if (i >= this.mSecondOptionList.get(this.mFirstSelectedIndex).size()) {
                    break;
                } else if (((BankCardType) this.mSecondOptionList.get(this.mFirstSelectedIndex).get(i)).mBankType.equals(bankCardType.mBankType)) {
                    this.mSecondSelectedIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            int i3 = this.mFirstSelectedIndex;
            String str = "";
            String str2 = i3 >= 0 ? this.mFirstOptionList.get(i3) : str;
            int i4 = this.mFirstSelectedIndex;
            if (i4 >= 0 && this.mSecondSelectedIndex >= 0) {
                str = (String) this.mSecondOptionStringList.get(i4).get(this.mSecondSelectedIndex);
            }
            this.mEditText.setText(str2 + " " + str);
        }
    }

    public void setValue(String str) {
    }

    public EditText createView(Context context) {
        this.mContext = context;
        EditText editText = new EditText(context);
        this.mEditText = editText;
        editText.setInputType(0);
        this.mEditText.setFocusable(false);
        this.mEditText.setBackground((Drawable) null);
        this.mEditText.setTextSize(16.0f);
        this.mEditText.setText(C67448R.string.lcz);
        this.mContext = context;
        return this.mEditText;
    }
}
