package com.tenpay.bankcard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.android.wechat.TenpayUtil;
import com.tenpay.ndk.Encrypt;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import yq3.C79144b;

public final class TenpaySegmentEditText extends LinearLayout {
    private static String mTimeStamp;
    private final int BG_LINE_COLOR;
    private final int BG_LINE_HEIGHT;
    private final int BG_LINE_SIZE;
    private final String TAG;
    private Context mContext;
    private List<EditText> mEditArray;
    public EditState mEditState;
    /* access modifiers changed from: private */
    public MyKeyboardWindow mKeyboard;
    /* access modifiers changed from: private */
    public boolean mNoFocus;
    /* access modifiers changed from: private */
    public View.OnClickListener mOnClickListener;
    private Paint mPaintBg;
    private Paint mPaintSplit;

    public enum EditState {
        DEFAULT,
        BANKCARD,
        BANKCARD_WITH_TAILNUM
    }

    public TenpaySegmentEditText(Context context) {
        this(context, (AttributeSet) null);
        this.mContext = context;
        init();
    }

    private void drawBackgroundLine(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float f = (float) (height - 4);
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, f, (float) width, (float) height, this.mPaintBg);
        float f2 = f - 9.0f;
        int size = this.mEditArray.size();
        canvas2.drawRect(0.0f, f2, 4.0f, f, this.mPaintBg);
        float f3 = 0.0f;
        int i = 0;
        while (i < size) {
            int i2 = i == size + -1 ? -4 : -2;
            float width2 = f3 + ((float) (this.mEditArray.get(i).getWidth() + i2));
            canvas.drawRect(width2, f2, width2 + 4.0f, f, this.mPaintBg);
            f3 = width2 - ((float) i2);
            i++;
        }
    }

    private String getInputText() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < this.mEditArray.size(); i++) {
            stringBuffer.append(this.mEditArray.get(i).getText().toString());
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2 == null || stringBuffer2.length() == 0) {
            return null;
        }
        stringBuffer2.trim().replaceAll(" ", "");
        return stringBuffer2;
    }

    private void init() {
        setBackgroundColor(getResources().getColor(C0966R.color.al6));
        setOrientation(0);
        setIsBankcardFormat(true);
        Paint paint = new Paint();
        this.mPaintSplit = paint;
        paint.setStrokeWidth(0.0f);
        this.mPaintSplit.setColor(-7829368);
        Paint paint2 = new Paint();
        this.mPaintBg = paint2;
        paint2.setColor(-11615450);
        this.mPaintBg.setStyle(Paint.Style.FILL);
    }

    public static void setNoSystemInputOnEditText(EditText editText) {
        Class<EditText> cls = EditText.class;
        try {
            Method method = cls.getMethod("setShowSoftInputOnFocus", new Class[]{Boolean.TYPE});
            method.setAccessible(true);
            method.invoke(editText, new Object[]{Boolean.FALSE});
        } catch (NoSuchMethodException unused) {
            try {
                Method method2 = cls.getMethod("setSoftInputShownOnFocus", new Class[]{Boolean.TYPE});
                method2.setAccessible(true);
                method2.invoke(editText, new Object[]{Boolean.FALSE});
            } catch (Exception unused2) {
                editText.setInputType(0);
            }
        } catch (Exception unused3) {
        }
    }

    public static void setSalt(String str) {
        mTimeStamp = str;
    }

    public void ClearInput() {
    }

    public String get3DesEncrptData() {
        String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        Encrypt encrypt = new Encrypt();
        return encrypt.desedeEncode(inputText, encrypt.getRandomKey());
    }

    public String getEncryptDataWithHash(boolean z) {
        String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        if (z) {
            inputText = TenpayUtil.md5HexDigest(inputText);
        }
        Encrypt encrypt = new Encrypt();
        String str = mTimeStamp;
        if (str != null) {
            encrypt.setTimeStamp(str);
        }
        C79144b.m95773a().mo109091f();
        return encrypt.encryptPasswdWithRSA2048(inputText);
    }

    public int getInputLength() {
        String inputText = getInputText();
        if (inputText == null) {
            return 0;
        }
        return inputText.length();
    }

    public boolean isMatchPattern(String str) {
        if (str != null) {
            try {
                return Pattern.compile(str).matcher(getInputText()).matches();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawBackgroundLine(canvas);
    }

    public void setFocusable(boolean z) {
        LogUtil.m90287d("MyTag", "setFocusable " + z);
        for (int i = 0; i < this.mEditArray.size(); i++) {
            EditText editText = this.mEditArray.get(i);
            editText.setFocusable(z);
            editText.setFocusableInTouchMode(z);
        }
    }

    public void setIsBankcardFormat(boolean z) {
        if (z) {
            this.mEditState = EditState.BANKCARD;
        } else if (EditState.BANKCARD == this.mEditState) {
            this.mEditState = EditState.DEFAULT;
        }
    }

    public void setKeyboard(MyKeyboardWindow myKeyboardWindow) {
        this.mKeyboard = myKeyboardWindow;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnClickListener = onClickListener;
    }

    public void setText(String str) {
        setText(str, (String) null);
    }

    public void setText(String str, String str2) {
        Encrypt encrypt = new Encrypt();
        if (Util.isNullOrNil(str2)) {
            str2 = encrypt.getRandomKey();
        }
        String[] split = encrypt.desedeDecode(str, str2).split("-");
        removeAllViews();
        this.mNoFocus = true;
        this.mEditArray.clear();
        for (int i = 0; i < split.length; i++) {
            final EditText editText = new EditText(this.mContext);
            editText.setText(split[i]);
            editText.setMaxLines(1);
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(split[i].length())});
            editText.setGravity(17);
            editText.setInputType(2);
            editText.setBackgroundColor(0);
            editText.setSelectAllOnFocus(true);
            editText.setOnClickListener(new View.OnClickListener() {
                private byte _hellAccFlag_;

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tenpay/bankcard/TenpaySegmentEditText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    if (TenpaySegmentEditText.this.mOnClickListener != null) {
                        TenpaySegmentEditText.this.mOnClickListener.onClick(view);
                    }
                    if (TenpaySegmentEditText.this.mNoFocus) {
                        TenpaySegmentEditText.this.setFocusable(true);
                        editText.requestFocus();
                        boolean unused = TenpaySegmentEditText.this.mNoFocus = false;
                    }
                    C117292a.m165361g(this, "com/tenpay/bankcard/TenpaySegmentEditText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            setNoSystemInputOnEditText(editText);
            ((InputMethodManager) this.mContext.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 2);
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                public void onFocusChange(View view, boolean z) {
                    LogUtil.m90287d("MyTag", "edit onFocusChange hasFocus=" + z);
                    if (z) {
                        if (TenpaySegmentEditText.this.mOnClickListener != null) {
                            TenpaySegmentEditText.this.mOnClickListener.onClick(view);
                        }
                        if (TenpaySegmentEditText.this.mKeyboard != null) {
                            LogUtil.m90287d("MyTag", "keyboard is not null");
                            TenpaySegmentEditText.this.mKeyboard.setXMode(0);
                            TenpaySegmentEditText.this.mKeyboard.setInputEditText(editText);
                        }
                    }
                }
            });
            addView(editText, new LinearLayout.LayoutParams(-2, -1, (float) split[i].length()));
            this.mEditArray.add(editText);
        }
        setFocusable(false);
    }

    public TenpaySegmentEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "MyTag";
        this.BG_LINE_COLOR = -11615450;
        this.BG_LINE_SIZE = 4;
        this.BG_LINE_HEIGHT = 9;
        this.mOnClickListener = null;
        this.mNoFocus = true;
        this.mEditState = EditState.DEFAULT;
        this.mContext = null;
        this.mEditArray = new ArrayList();
        this.mKeyboard = null;
        this.mContext = context;
        init();
    }

    private boolean isMatchPattern(String str, String str2) {
        if (str2 != null) {
            try {
                return Pattern.compile(str2).matcher(str).matches();
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
