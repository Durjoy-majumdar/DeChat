package com.tenpay.view;

import android.content.Context;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.tenpay.ndk.WxSmCryptoUtil;
import java.util.Objects;
import java.util.regex.Pattern;

public final class TenpaySecureInputView extends AppCompatEditText {
    private static final int DEFAULT_MAX_LENGTH = 32;
    private DataType inputDataType = DataType.Text;
    private boolean isSelfSet;
    private char[] mBlackListChar;
    private char[] mWhiteListChar;
    private int maxInputLength = 32;
    private int minInputLength = 0;
    private OnInputListener onInputListener;

    public enum DataType {
        Text,
        ID,
        BankCard,
        PhoneNum,
        Digits
    }

    public interface OnInputListener {
        void onInputChanged(int i);
    }

    public TenpaySecureInputView(Context context) {
        super(context, (AttributeSet) null);
    }

    private String getInputText() {
        return super.getText().toString().replaceAll(" ", "");
    }

    private void init(Context context, AttributeSet attributeSet) {
        setInputType(0);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxInputLength)});
    }

    private boolean isValidChar(char c) {
        boolean z;
        if (this.inputDataType == DataType.BankCard && c == ' ') {
            return true;
        }
        char[] cArr = this.mWhiteListChar;
        if (cArr != null) {
            int length = cArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                } else if (cArr[i] == c) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return false;
            }
        }
        if (this.mBlackListChar != null) {
            for (char c2 : this.mWhiteListChar) {
                if (c2 == c) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkInputData(String str) {
        String inputText = getInputText();
        if (inputText.length() < this.minInputLength) {
            return false;
        }
        return Pattern.compile(str).matcher(inputText).matches();
    }

    public void clearInput() {
        setText("");
    }

    public String getDataHash(String str) {
        return WxSmCryptoUtil.getInstance().getGenericDataHash(getInputText(), str);
    }

    public String getEncryptData(String str, String str2) {
        return WxSmCryptoUtil.getInstance().encryptGenericDataWithCert(str, getInputText(), str2);
    }

    public int getInputLength() {
        return getText().length();
    }

    public int getLastError() {
        return WxSmCryptoUtil.getInstance().getLastError();
    }

    public String getVersion() {
        return WxSmCryptoUtil.getInstance().getVersion();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!TextUtils.isEmpty(charSequence)) {
            for (int i4 = i; i4 < i + i3; i4++) {
                if (!isValidChar(charSequence.charAt(i4))) {
                    String charSequence2 = charSequence.toString();
                    setText(charSequence2.substring(0, i4) + charSequence2.substring(i4 + 1));
                    setSelection(i4);
                    return;
                }
            }
        }
        Objects.toString(this.inputDataType);
        if (this.inputDataType == DataType.BankCard) {
            if (!this.isSelfSet) {
                String inputText = getInputText();
                int length = inputText.length();
                if (length > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i5 = 0; i5 < length; i5++) {
                        stringBuffer.append(inputText.charAt(i5));
                        if (i5 % 4 == 3 && stringBuffer.length() < this.maxInputLength) {
                            stringBuffer.append(' ');
                        }
                    }
                    this.isSelfSet = true;
                    setText(stringBuffer.toString());
                    setSelection(stringBuffer.length());
                }
            } else {
                this.isSelfSet = false;
            }
        }
        OnInputListener onInputListener2 = this.onInputListener;
        if (onInputListener2 != null) {
            onInputListener2.onInputChanged(getInputText().length());
        }
    }

    public void setDataType(DataType dataType) {
        this.inputDataType = dataType;
        if (dataType == DataType.Text) {
            setInputType(1);
            return;
        }
        setInputType(0);
        if (dataType == DataType.ID) {
            setInputRange(18, 18);
            setWhiteListChar(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'X', 'x'});
        } else if (dataType == DataType.BankCard) {
            setWhiteListChar(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        } else if (dataType == DataType.PhoneNum) {
            setWhiteListChar(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
        } else if (dataType == DataType.Digits) {
            setWhiteListChar(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '.'});
        }
    }

    public void setInputRange(int i, int i2) {
        this.minInputLength = i;
        this.maxInputLength = i2;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
    }

    public void setOnInputListener(OnInputListener onInputListener2) {
        this.onInputListener = onInputListener2;
    }

    public void setWhiteListChar(char[] cArr) {
        this.mWhiteListChar = cArr;
    }

    public TenpaySecureInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public TenpaySecureInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
