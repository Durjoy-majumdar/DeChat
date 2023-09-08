package com.tenpay.miniapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.ContextMenu;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.exifinterface.media.ExifInterface;
import com.tenpay.ndk.FitScUtil;

public final class MiniAppSecureEditText extends AppCompatEditText {
    private static final int DEFAULT_PASSWD_LENGTH = 6;
    private static final int MAX_PASSWD_LENGTH = 32;
    private static final int PASSWD_BLACK_DOT_SIZE = 7;
    private static final int PASSWD_LEFT_PADDING = -1500000;
    private String certPem;
    private byte[] customHash;
    private FitScUtil fitScUtil;
    private boolean isFixedInputLength = true;
    private char[] mBlackListChar;
    private Drawable mClearBtnImg;
    private float mDensity;
    private Paint mPaintBackground;
    private OnPasswdInputListener mPasswdListener;
    private char[] mWhiteListChar;
    private int maxInputLength = 6;
    private int minInputLength = 6;
    private long nonce;
    private String salt;
    private long timeStamp;

    /* renamed from: com.tenpay.miniapp.MiniAppSecureEditText$5 */
    public static /* synthetic */ class C752685 {
        public static final /* synthetic */ int[] $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tenpay.miniapp.MiniAppSecureEditText$EEncodeType[] r0 = com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType = r0
                com.tenpay.miniapp.MiniAppSecureEditText$EEncodeType r1 = com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType.TBase64     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tenpay.miniapp.MiniAppSecureEditText$EEncodeType r1 = com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType.THexLowerCase     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tenpay.miniapp.MiniAppSecureEditText$EEncodeType r1 = com.tenpay.miniapp.MiniAppSecureEditText.EEncodeType.THexUpperCase     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tenpay.miniapp.MiniAppSecureEditText.C752685.<clinit>():void");
        }
    }

    public enum EEncodeType {
        THexLowerCase,
        THexUpperCase,
        TBase64
    }

    public interface OnPasswdInputListener {
        void onDone();
    }

    public MiniAppSecureEditText(Context context) {
        super(context, (AttributeSet) null);
    }

    private static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & ExifInterface.MARKER);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString.toLowerCase());
        }
        return sb.toString();
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

    private boolean isValidChar(char c) {
        boolean z;
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

    private void setBlackListChar(char[] cArr) {
        this.mBlackListChar = cArr;
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
                        MiniAppSecureEditText miniAppSecureEditText = MiniAppSecureEditText.this;
                        miniAppSecureEditText.setCompoundDrawables(miniAppSecureEditText.getCompoundDrawables()[0], MiniAppSecureEditText.this.getCompoundDrawables()[1], (Drawable) null, MiniAppSecureEditText.this.getCompoundDrawables()[3]);
                    }
                }
            });
            setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    return false;
                }
            });
            return;
        }
        setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
            }
        });
        setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return false;
            }
        });
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

    private void setWhiteListChar(char[] cArr) {
        this.mWhiteListChar = cArr;
    }

    public void beginCustomHash() {
        if (!TextUtils.isEmpty(getInputText())) {
            this.customHash = getInputText().getBytes();
        }
    }

    public void customAppendSalt(String str) {
        if (!TextUtils.isEmpty(getInputText())) {
            byte[] bArr = new byte[(this.customHash.length + str.length())];
            byte[] bArr2 = this.customHash;
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
            System.arraycopy(str.getBytes(), 0, bArr, this.customHash.length, str.length());
            this.customHash = bArr;
        }
    }

    public void customInsertSalt(String str) {
        if (!TextUtils.isEmpty(getInputText())) {
            byte[] bArr = new byte[(this.customHash.length + str.length())];
            System.arraycopy(str.getBytes(), 0, bArr, 0, str.length());
            System.arraycopy(this.customHash, 0, bArr, str.length(), this.customHash.length);
            this.customHash = bArr;
        }
    }

    public void customPasswdEncode(EEncodeType eEncodeType) {
        if (!TextUtils.isEmpty(getInputText())) {
            int i = C752685.$SwitchMap$com$tenpay$miniapp$MiniAppSecureEditText$EEncodeType[eEncodeType.ordinal()];
            if (i == 1) {
                this.customHash = Base64.encodeToString(this.customHash, 0).trim().getBytes();
            } else if (i == 2) {
                this.customHash = bytesToHex(this.customHash).getBytes();
            } else if (i == 3) {
                this.customHash = bytesToHex(this.customHash).toUpperCase().getBytes();
            }
        }
    }

    public void customPasswdMd5() {
        if (!TextUtils.isEmpty(getInputText())) {
            this.customHash = this.fitScUtil.md5(this.customHash);
        }
    }

    public void customPasswdSha1() {
        if (!TextUtils.isEmpty(getInputText())) {
            this.customHash = this.fitScUtil.sha1(this.customHash);
        }
    }

    public void customPasswdSha256() {
        if (!TextUtils.isEmpty(getInputText())) {
            this.customHash = this.fitScUtil.sha256(this.customHash);
        }
    }

    public void customPasswdSm3() {
        if (!TextUtils.isEmpty(getInputText())) {
            this.customHash = this.fitScUtil.sm3(this.customHash);
        }
    }

    public String endCustomHashAndEncrypt(long j, long j2) {
        byte[] bArr;
        String inputText = getInputText();
        if (TextUtils.isEmpty(inputText) || inputText.length() < this.minInputLength || this.fitScUtil == null || (bArr = this.customHash) == null || j == 0 || j2 == 0) {
            return null;
        }
        long j3 = j;
        String encryptPassWithCert = this.fitScUtil.encryptPassWithCert(this.certPem, bytesToHex(bArr).getBytes(), (byte[]) null, j3, String.valueOf(j2), 0, false);
        this.customHash = null;
        return encryptPassWithCert;
    }

    public String getEncryptedData() {
        String inputText = getInputText();
        if (TextUtils.isEmpty(inputText) || inputText.length() < this.minInputLength || this.salt == null || this.timeStamp == 0 || this.nonce == 0) {
            return null;
        }
        return this.fitScUtil.encryptPassWithCert(this.certPem, inputText.getBytes(), this.salt.getBytes(), this.timeStamp, String.valueOf(this.nonce), 7, false);
    }

    public int getLastError() {
        return this.fitScUtil.getLastError();
    }

    public String getVersion() {
        return this.fitScUtil.getVersion();
    }

    public void onCreateContextMenu(ContextMenu contextMenu) {
        if ((getInputType() & 128) <= 0) {
            super.onCreateContextMenu(contextMenu);
        }
    }

    public void onDetachedFromWindow() {
        FitScUtil fitScUtil2 = this.fitScUtil;
        if (fitScUtil2 != null) {
            fitScUtil2.release();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        drawPasswdDot(canvas);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        OnPasswdInputListener onPasswdInputListener;
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
            if (this.isFixedInputLength && charSequence.length() == this.maxInputLength && (onPasswdInputListener = this.mPasswdListener) != null) {
                onPasswdInputListener.onDone();
            }
        }
    }

    public boolean onTextContextMenuItem(int i) {
        if ((getInputType() & 128) > 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public boolean setCertContext(String str, String str2, String str3) {
        FitScUtil fitScUtil2 = new FitScUtil();
        this.fitScUtil = fitScUtil2;
        this.certPem = str;
        return fitScUtil2.init(str2, str3, (String) null, (String) null);
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

    public void setNonce(long j) {
        this.nonce = j;
    }

    public void setOnPasswdInputListener(OnPasswdInputListener onPasswdInputListener) {
        this.mPasswdListener = onPasswdInputListener;
    }

    public void setSalt(String str) {
        this.salt = str;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public MiniAppSecureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public MiniAppSecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
