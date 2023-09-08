package com.tenpay.wphk;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import com.tenpay.ndk.HkWxCryptoUtil;
import java.security.SecureRandom;

public final class HkWxSecureEditText extends AppCompatEditText {
    private static final int DEFAULT_PASSWD_LENGTH = 6;
    private static final int MAX_PASSWD_LENGTH = 32;
    private static final int PASSWD_BLACK_DOT_SIZE = 7;
    private static final int PASSWD_LEFT_PADDING = -1500000;
    private boolean isFixedInputLength = true;
    private char[] mBlackListChar;
    private Drawable mClearBtnImg;
    private float mDensity;
    private Paint mPaintBackground;
    private OnPasswdInputListener mPasswdListener;
    private char[] mWhiteListChar;
    private int maxInputLength = 6;
    private int minInputLength = 6;
    private boolean noUpdate = false;
    private byte[] randomKey = new byte[32];
    private byte[] realContent = new byte[32];
    private int realLength = 0;

    /* renamed from: com.tenpay.wphk.HkWxSecureEditText$2 */
    public static /* synthetic */ class C752722 {
        public static final /* synthetic */ int[] $SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.tenpay.wphk.HkWxSecureEditText$EncryptMode[] r0 = com.tenpay.wphk.HkWxSecureEditText.EncryptMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode = r0
                com.tenpay.wphk.HkWxSecureEditText$EncryptMode r1 = com.tenpay.wphk.HkWxSecureEditText.EncryptMode.RSA2048_WITH_MD5     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tenpay.wphk.HkWxSecureEditText$EncryptMode r1 = com.tenpay.wphk.HkWxSecureEditText.EncryptMode.RSA2048_WITH_PBKDF2     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tenpay.wphk.HkWxSecureEditText.C752722.<clinit>():void");
        }
    }

    public enum EncryptMode {
        RSA2048_WITH_MD5,
        RSA2048_WITH_PBKDF2
    }

    public interface OnPasswdInputListener {
        void onDone();
    }

    public HkWxSecureEditText(Context context) {
        super(context, (AttributeSet) null);
    }

    private void drawPasswdDot(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int i = width / this.maxInputLength;
        int length = getInputText().length();
        for (int i2 = 0; i2 < length; i2++) {
            canvas.drawCircle((float) ((i / 2) + (i2 * i)), (float) (height / 2), this.mDensity * 7.0f, this.mPaintBackground);
        }
    }

    private String getInputText() {
        return super.getText().toString().trim();
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.mDensity = getResources().getDisplayMetrics().density;
        setIsPasswordFormat(true);
        setAccessibilityDelegate(new TenpayAccessibilityDelegate());
    }

    private void setClearBtnDrawableId(int i) {
        try {
            this.mClearBtnImg = getResources().getDrawable(i);
        } catch (Exception unused) {
            this.mClearBtnImg = null;
        }
        Drawable drawable = this.mClearBtnImg;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mClearBtnImg.getIntrinsicHeight());
            setOnFocusChangeListener(new View.OnFocusChangeListener() {
                public void onFocusChange(View view, boolean z) {
                    if (!z) {
                        HkWxSecureEditText hkWxSecureEditText = HkWxSecureEditText.this;
                        hkWxSecureEditText.setCompoundDrawables(hkWxSecureEditText.getCompoundDrawables()[0], hkWxSecureEditText.getCompoundDrawables()[1], (Drawable) null, hkWxSecureEditText.getCompoundDrawables()[3]);
                    }
                }
            });
        }
    }

    private void setIsPasswordFormat(boolean z) {
        if (z) {
            setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            Paint paint = new Paint(1);
            this.mPaintBackground = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mPaintBackground.setColor(-16777216);
            setInputType(2);
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxInputLength)});
            return;
        }
        this.mPaintBackground = null;
    }

    private void updateText(String str) {
        OnPasswdInputListener onPasswdInputListener;
        if (this.noUpdate) {
            this.noUpdate = false;
            return;
        }
        int length = str.length();
        if (this.randomKey != null && length <= this.maxInputLength) {
            if (length == 0) {
                new SecureRandom().nextBytes(this.randomKey);
                this.realLength = 0;
                return;
            }
            int i = this.realLength;
            if (length < i) {
                this.realLength = i - 1;
                return;
            }
            int i2 = length - 1;
            this.realContent[i2] = (byte) (str.charAt(i2) ^ this.randomKey[i2]);
            this.realLength = length;
            this.noUpdate = true;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i3 = 0; i3 < this.realLength; i3++) {
                stringBuffer.append('*');
            }
            setText(stringBuffer.toString());
            setSelection(this.realLength);
            if (this.isFixedInputLength && str.length() == this.maxInputLength && (onPasswdInputListener = this.mPasswdListener) != null) {
                onPasswdInputListener.onDone();
            }
        }
    }

    public String getEncryptData(EncryptMode encryptMode, long j, String str, String str2) {
        int i = this.realLength;
        if (i >= this.minInputLength && i <= this.maxInputLength) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < this.realLength; i2++) {
                bArr[i2] = (byte) (this.realContent[i2] ^ this.randomKey[i2]);
            }
            if (!(i < this.minInputLength || str == null || j == 0)) {
                return HkWxCryptoUtil.encryptPassword(bArr, str.getBytes(), j, str2, C752722.$SwitchMap$com$tenpay$wphk$HkWxSecureEditText$EncryptMode[encryptMode.ordinal()] != 1 ? 2 : 1);
            }
        }
        return null;
    }

    public int getLastError() {
        return HkWxCryptoUtil.getError();
    }

    public String getVersion() {
        return HkWxCryptoUtil.getVersion();
    }

    public void onCreateContextMenu(ContextMenu contextMenu) {
        if ((getInputType() & 128) <= 0) {
            super.onCreateContextMenu(contextMenu);
        }
    }

    public void onDraw(Canvas canvas) {
        drawPasswdDot(canvas);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        updateText(charSequence.toString());
    }

    public boolean onTextContextMenuItem(int i) {
        if ((getInputType() & 128) > 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setInputLength(int i, int i2) {
        this.minInputLength = i;
        this.maxInputLength = i2;
        boolean z = true;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i2)});
        if (i != i2) {
            z = false;
        }
        this.isFixedInputLength = z;
    }

    public void setOnPasswdInputListener(OnPasswdInputListener onPasswdInputListener) {
        this.mPasswdListener = onPasswdInputListener;
    }

    public HkWxSecureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public HkWxSecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
