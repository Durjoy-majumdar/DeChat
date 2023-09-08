package com.tenpay.android.wechat;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tenpay.ndk.Encrypt;
import com.tenpay.ndk.WxSmCryptoUtil;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kg3.C76577a;

public final class TempSecureEditText extends EditText {
    public static final int AREA_ID_CARD_TYPE_HUIXIANG = 5;
    public static final int AREA_ID_CARD_TYPE_SHENFEN = 1;
    public static final int AREA_ID_CARD_TYPE_TAIBAO = 9;
    private static int BANK_CARD_LENGTH_LIMIT = 14;
    private static int CARD_TAIL_SPACE = 15;
    private static int CVV_4_PAYMENT_LENGTH = 4;
    private static int CVV_PAYMENT_LENGTH = 3;
    private static int PASSWD_BLACK_DOT_SIZE = 7;
    private static int PASSWD_LEFT_PADDING = -1500000;
    private static int VALID_THRU_LEN = 4;
    private static String mTimeStamp;
    private int PASSWD_LENGTH;
    private String mCardTailNum;
    /* access modifiers changed from: private */
    public Drawable mClearBtnImg;
    private float mDensity;
    public EditState mEditState;
    private char[] mFilterChar;
    private String mFixedHeaderText;
    private Paint mIDCardPaint;
    private ISecureEncrypt mIEncrypt;
    private boolean mIsCardTailNumCanDisplay;
    private boolean mIsSelfSet;
    private boolean mIsUseOfKinda;
    /* access modifiers changed from: private */
    public IKindaEditTextCallBackListener mKindaEditTextCallBackListener;
    private boolean mNewPwdStyle;
    private Paint mPaintBackground;
    private Paint mPasswdBgPaint;
    private OnPasswdInputListener mPasswdListener;
    private Paint mPasswdSeparedPaint;
    private Paint mTitlePaint;
    private String regExFilterInput;

    /* renamed from: com.tenpay.android.wechat.TempSecureEditText$6 */
    public static /* synthetic */ class C752546 {

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TempSecureEditText$EditState */
        public static final /* synthetic */ int[] f221389xafbfea98;

        /* renamed from: $SwitchMap$com$tenpay$android$wechat$TempSecureEditText$EncryptMode */
        public static final /* synthetic */ int[] f221390xd544bb59;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.tenpay.android.wechat.TempSecureEditText$EncryptMode[] r0 = com.tenpay.android.wechat.TempSecureEditText.EncryptMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f221390xd544bb59 = r0
                r1 = 1
                com.tenpay.android.wechat.TempSecureEditText$EncryptMode r2 = com.tenpay.android.wechat.TempSecureEditText.EncryptMode.RSA1024_WITH_MD5     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f221390xd544bb59     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tenpay.android.wechat.TempSecureEditText$EncryptMode r3 = com.tenpay.android.wechat.TempSecureEditText.EncryptMode.RSA2048_WITH_MD5     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f221390xd544bb59     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tenpay.android.wechat.TempSecureEditText$EncryptMode r4 = com.tenpay.android.wechat.TempSecureEditText.EncryptMode.SM2_WITH_MD5     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f221390xd544bb59     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tenpay.android.wechat.TempSecureEditText$EncryptMode r5 = com.tenpay.android.wechat.TempSecureEditText.EncryptMode.SM2_WITH_PKKDF2     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tenpay.android.wechat.TempSecureEditText$EditState[] r4 = com.tenpay.android.wechat.TempSecureEditText.EditState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f221389xafbfea98 = r4
                com.tenpay.android.wechat.TempSecureEditText$EditState r5 = com.tenpay.android.wechat.TempSecureEditText.EditState.BANKCARD     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f221389xafbfea98     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tenpay.android.wechat.TempSecureEditText$EditState r4 = com.tenpay.android.wechat.TempSecureEditText.EditState.BANKCARD_WITH_TAILNUM     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f221389xafbfea98     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tenpay.android.wechat.TempSecureEditText$EditState r1 = com.tenpay.android.wechat.TempSecureEditText.EditState.VALID_THRU     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f221389xafbfea98     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.tenpay.android.wechat.TempSecureEditText$EditState r1 = com.tenpay.android.wechat.TempSecureEditText.EditState.SECURITY_ANSWER     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f221389xafbfea98     // Catch:{ NoSuchFieldError -> 0x006d }
                com.tenpay.android.wechat.TempSecureEditText$EditState r1 = com.tenpay.android.wechat.TempSecureEditText.EditState.PASSWORD     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f221389xafbfea98     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.tenpay.android.wechat.TempSecureEditText$EditState r1 = com.tenpay.android.wechat.TempSecureEditText.EditState.CVV_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f221389xafbfea98     // Catch:{ NoSuchFieldError -> 0x0083 }
                com.tenpay.android.wechat.TempSecureEditText$EditState r1 = com.tenpay.android.wechat.TempSecureEditText.EditState.CVV_4_PAYMENT     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f221389xafbfea98     // Catch:{ NoSuchFieldError -> 0x008f }
                com.tenpay.android.wechat.TempSecureEditText$EditState r1 = com.tenpay.android.wechat.TempSecureEditText.EditState.DEFAULT     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tenpay.android.wechat.TempSecureEditText.C752546.<clinit>():void");
        }
    }

    public enum EditState {
        DEFAULT,
        PASSWORD,
        BANKCARD,
        BANKCARD_WITH_TAILNUM,
        VALID_THRU,
        MONEY_AMOUNT,
        CVV_PAYMENT,
        CVV_4_PAYMENT,
        SECURITY_ANSWER,
        IDCARD_TAIL
    }

    public enum EncryptMode {
        RSA1024_WITH_MD5,
        RSA2048_WITH_MD5,
        SM2_WITH_MD5,
        SM2_WITH_PKKDF2
    }

    public interface IKindaEditTextCallBackListener {
        void onCallBackKinda();
    }

    public TempSecureEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    private void drawCardTailNum(Canvas canvas) {
        if (EditState.BANKCARD_WITH_TAILNUM == this.mEditState && this.mIsCardTailNumCanDisplay) {
            int baseline = getBaseline();
            if (baseline == -1) {
                baseline = 44;
            }
            canvas.drawText(this.mCardTailNum, (((float) CARD_TAIL_SPACE) * this.mDensity) + getPaint().measureText(getText().toString()), (float) baseline, this.mTitlePaint);
        }
    }

    private void drawCvv4PaymentDot(Canvas canvas) {
        if (EditState.CVV_4_PAYMENT == this.mEditState && this.mPaintBackground != null) {
            int width = getWidth();
            int height = getHeight();
            int i = width / CVV_4_PAYMENT_LENGTH;
            int length = getText().length();
            for (int i2 = 0; i2 < length; i2++) {
                canvas.drawCircle((float) ((i / 2) + (i2 * i)), (float) (height / 2), ((float) PASSWD_BLACK_DOT_SIZE) * this.mDensity, this.mPaintBackground);
            }
        }
    }

    private void drawCvvPaymentDot(Canvas canvas) {
        if (EditState.CVV_PAYMENT == this.mEditState && this.mPaintBackground != null) {
            int width = getWidth();
            int height = getHeight();
            int i = width / CVV_PAYMENT_LENGTH;
            int length = getText().length();
            for (int i2 = 0; i2 < length; i2++) {
                canvas.drawCircle((float) ((i / 2) + (i2 * i)), (float) (height / 2), ((float) PASSWD_BLACK_DOT_SIZE) * this.mDensity, this.mPaintBackground);
            }
        }
    }

    private void drawIdCardTail(Canvas canvas) {
        if (EditState.IDCARD_TAIL == this.mEditState && this.mIDCardPaint != null) {
            int width = getWidth() / 4;
            String obj = getText().toString();
            int length = obj.length();
            this.mIDCardPaint.setTextSize(getTextSize());
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                canvas.drawText(obj.substring(i, i2), (float) ((width / 2) + (i * width)), (float) getBaseline(), this.mIDCardPaint);
                i = i2;
            }
        }
    }

    private void drawPasswdDot(Canvas canvas) {
        if (EditState.PASSWORD == this.mEditState && this.mPaintBackground != null) {
            int width = getWidth();
            int height = getHeight();
            int i = width / this.PASSWD_LENGTH;
            int length = getText().length();
            int i2 = 0;
            if (!this.mNewPwdStyle) {
                while (i2 < length) {
                    canvas.drawCircle((float) ((i / 2) + (i2 * i)), (float) (height / 2), ((float) PASSWD_BLACK_DOT_SIZE) * this.mDensity, this.mPaintBackground);
                    i2++;
                }
                for (int i3 = 1; i3 < this.PASSWD_LENGTH; i3++) {
                    float f = (float) (i * i3);
                    canvas.drawLine(f, 0.0f, f, (float) height, this.mPasswdSeparedPaint);
                }
                return;
            }
            int b = C76577a.m92151b(getContext(), 8);
            int i4 = this.PASSWD_LENGTH;
            int i5 = (width - ((i4 - 1) * b)) / i4;
            int i6 = height - i5;
            while (i2 < this.PASSWD_LENGTH) {
                float f2 = (float) ((i5 + b) * i2);
                float f3 = (float) i5;
                float f4 = f2 + f3;
                float f5 = (float) i6;
                RectF rectF = new RectF(f2, f5, f4, (float) (i5 + i6));
                float b2 = (float) C76577a.m92151b(getContext(), 4);
                canvas.drawRoundRect(rectF, b2, b2, this.mPasswdBgPaint);
                if (i2 < length) {
                    canvas.drawCircle((f2 + f4) / 2.0f, (f3 / 2.0f) + f5, (float) C76577a.m92151b(getContext(), 4), this.mPaintBackground);
                }
                i2++;
            }
        }
    }

    private String getInputText() {
        String obj = this.mEditState == EditState.SECURITY_ANSWER ? getText().toString() : getText().toString().trim();
        if (obj == null || obj.length() == 0) {
            return null;
        }
        int i = C752546.f221389xafbfea98[this.mEditState.ordinal()];
        if (i == 1) {
            obj = obj.replaceAll(" ", "");
        } else if (i == 2) {
            obj = obj.replaceAll(" ", "");
            String str = this.mCardTailNum;
            if (str != null && str.length() > 0) {
                obj = obj + this.mCardTailNum;
            }
        } else if (i == 3) {
            obj = obj.replaceAll("/", "");
            if (obj != null && obj.length() == VALID_THRU_LEN) {
                String substring = obj.substring(0, 2);
                obj = obj.substring(2) + substring;
            }
        } else if (i != 4) {
            obj = obj.replaceAll(" ", "").replaceAll("x", "X");
        }
        if (Util.isNullOrNil(this.regExFilterInput)) {
            return obj;
        }
        String trim = Pattern.compile(this.regExFilterInput).matcher(obj).replaceAll("").trim();
        Log.m105924i("TempSecureEditText", "use filter");
        return trim;
    }

    private void init(Context context, AttributeSet attributeSet) {
        int[] resourceDeclareStyleableIntArray;
        TypedArray obtainStyledAttributes;
        this.mDensity = getResources().getDisplayMetrics().density;
        if (!(attributeSet == null || (resourceDeclareStyleableIntArray = TenpayUtil.getResourceDeclareStyleableIntArray(context, "TempSecureEditText")) == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resourceDeclareStyleableIntArray)) == null)) {
            setIsPasswordFormat(obtainStyledAttributes.getBoolean(TenpayUtil.getResourceDeclareStyleableIndex(context, "TempSecureEditText_isPassword"), false), true);
            setIsBankcardFormat(obtainStyledAttributes.getBoolean(TenpayUtil.getResourceDeclareStyleableIndex(context, "TempSecureEditText_isBankcard"), false));
            setIsValidThru(obtainStyledAttributes.getBoolean(TenpayUtil.getResourceDeclareStyleableIndex(context, "TempSecureEditText_isValidThru"), false));
            setBankcardTailNum(obtainStyledAttributes.getString(TenpayUtil.getResourceDeclareStyleableIndex(context, "TempSecureEditText_bankcardTailNum")));
            int resourceId = obtainStyledAttributes.getResourceId(TenpayUtil.getResourceDeclareStyleableIndex(context, "TempSecureEditText_rightClearDrawable"), 0);
            if (resourceId != 0) {
                setClearBtnDrawableId(resourceId);
            }
            obtainStyledAttributes.recycle();
        }
        addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    public static void setSalt(String str) {
        Log.m105925i("TempSecureEditText", "check salt: %s", str);
        if ((Integer.decode(BuildInfo.CLIENT_VERSION).intValue() & 255) < 48) {
            Log.m105925i("TempSecureEditText", "check salt stack: %s", Util.getStack());
        }
        mTimeStamp = str;
    }

    public void ClearInput() {
        setText("");
    }

    public String get3DesEncrptData() {
        String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        if (iSecureEncrypt != null) {
            return iSecureEncrypt.desedeEncode(inputText, mTimeStamp);
        }
        return new Encrypt().desedeEncode(inputText);
    }

    public String get3DesVerifyCode() {
        String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        return iSecureEncrypt != null ? iSecureEncrypt.desedeVerifyCode(inputText, mTimeStamp) : new Encrypt().desedeVerifyCode(inputText);
    }

    public Drawable getClearBtnDrawable() {
        return this.mClearBtnImg;
    }

    public EditState getEditState() {
        return this.mEditState;
    }

    public String getEncryptDataWithHash(boolean z) {
        return getEncryptDataWithHash(z, false);
    }

    public String getEncryptPassword(EncryptMode encryptMode, long j, String str) {
        String inputText = getInputText();
        String str2 = null;
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        String md5HexDigest = TenpayUtil.md5HexDigest(inputText);
        int i = C752546.f221390xd544bb59[encryptMode.ordinal()];
        if (i == 1) {
            Encrypt encrypt = new Encrypt();
            String str3 = mTimeStamp;
            if (str3 != null) {
                encrypt.setTimeStamp(str3);
            }
            return encrypt.encryptPasswd(md5HexDigest);
        } else if (i == 2) {
            Encrypt encrypt2 = new Encrypt();
            String str4 = mTimeStamp;
            if (str4 != null) {
                encrypt2.setTimeStamp(str4);
            }
            return encrypt2.encryptPasswdWithRSA2048(md5HexDigest);
        } else if (i == 3) {
            try {
                str2 = WxSmCryptoUtil.getInstance().encryptPassword(md5HexDigest, j, str, 6);
            } catch (Exception e) {
                Log.printErrStackTrace("WxSmCryptoUtil", e, "", new Object[0]);
            }
            int lastError = WxSmCryptoUtil.getInstance().getLastError();
            if (lastError != 0) {
                Log.m105921e("WxSmCryptoUtil", "SM2_WITH_MD5 encryptPassword error, error code:%d", Integer.valueOf(lastError));
            }
            return str2;
        } else if (i != 4) {
            return null;
        } else {
            try {
                str2 = WxSmCryptoUtil.getInstance().encryptPassword(md5HexDigest, j, str, 7);
            } catch (Exception e2) {
                Log.printErrStackTrace("WxSmCryptoUtil", e2, "", new Object[0]);
            }
            int lastError2 = WxSmCryptoUtil.getInstance().getLastError();
            if (lastError2 != 0) {
                Log.m105921e("WxSmCryptoUtil", "SM2_WITH_PBKDF2 encryptPassword error, error code:%d", Integer.valueOf(lastError2));
            }
            return str2;
        }
    }

    public int getInputLength() {
        String inputText = getInputText();
        if (inputText == null) {
            return 0;
        }
        return inputText.length();
    }

    public boolean isAreaIDCardNum(int i) {
        String trim = getText().toString().trim();
        if (trim == null || trim.length() == 0) {
            return false;
        }
        trim.replaceAll(" ", "");
        if (i != 1) {
            return true;
        }
        return isUserIdNum();
    }

    public boolean isBankcardNum() {
        return getInputLength() >= BANK_CARD_LENGTH_LIMIT || getText().toString().contains("**");
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

    public boolean isMoneyAmount() {
        return isMatchPattern("^\\d+(\\.\\d{0,2})?$");
    }

    public boolean isPhoneNum() {
        return getText().toString().trim().length() == 11 || getText().toString().contains("**");
    }

    public boolean isUserIdNum() {
        return getInputLength() == 15 ? isMatchPattern("^\\d{15}$") : TenpayUtil.invalidateID(getText().toString().trim());
    }

    public boolean isValidThru() {
        return isMatchPattern("[1-9][0-9]0[1-9]$|[1-9][0-9]1[0-2]$");
    }

    public void onCreateContextMenu(ContextMenu contextMenu) {
        EditState editState;
        if ((getInputType() & 128) <= 0 && EditState.PASSWORD != (editState = this.mEditState) && EditState.CVV_PAYMENT != editState && EditState.CVV_4_PAYMENT != editState) {
            super.onCreateContextMenu(contextMenu);
        }
    }

    public void onDraw(Canvas canvas) {
        EditState editState = this.mEditState;
        if (editState == EditState.IDCARD_TAIL) {
            drawIdCardTail(canvas);
        } else if (editState == EditState.PASSWORD || editState == EditState.CVV_PAYMENT || editState == EditState.CVV_4_PAYMENT) {
            drawPasswdDot(canvas);
            drawCvvPaymentDot(canvas);
            drawCvv4PaymentDot(canvas);
        } else {
            super.onDraw(canvas);
            drawCardTailNum(canvas);
        }
        if (!TextUtils.isEmpty(this.mFixedHeaderText)) {
            canvas.drawText(this.mFixedHeaderText, 0.0f, ((((float) getMeasuredHeight()) - getTextSize()) / 2.0f) + getTextSize(), getPaint());
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int length;
        int length2;
        OnPasswdInputListener onPasswdInputListener;
        OnPasswdInputListener onPasswdInputListener2;
        OnPasswdInputListener onPasswdInputListener3;
        EditState editState;
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.mFilterChar != null && !TextUtils.isEmpty(charSequence)) {
            for (int i5 = i; i5 < i + i3; i5++) {
                for (char c : this.mFilterChar) {
                    if (c == charSequence.charAt(i5)) {
                        String charSequence2 = charSequence.toString();
                        setText(charSequence2.substring(0, i5) + charSequence2.substring(i5 + 1));
                        setSelection(i5);
                        return;
                    }
                }
            }
        }
        String obj = getText().toString();
        this.mIsCardTailNumCanDisplay = obj != null && obj.length() > 0;
        int i6 = 3;
        if (!(!isFocused() || this.mClearBtnImg == null || EditState.PASSWORD == (editState = this.mEditState) || EditState.CVV_PAYMENT == editState || EditState.CVV_4_PAYMENT == editState)) {
            if (getText().toString().equals("")) {
                setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], (Drawable) null, getCompoundDrawables()[3]);
            } else {
                setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.mClearBtnImg, getCompoundDrawables()[3]);
            }
        }
        EditState editState2 = this.mEditState;
        if (editState2 != null) {
            try {
                int i7 = C752546.f221389xafbfea98[editState2.ordinal()];
                if (i7 == 1 || i7 == 2) {
                    if (!this.mIsSelfSet) {
                        int i8 = i + i3;
                        if (obj.length() > 0) {
                            if (i8 <= obj.length()) {
                                String substring = obj.substring(0, i8);
                                i4 = substring.length() - substring.replaceAll(" ", "").length();
                            } else {
                                i4 = 0;
                            }
                            String replaceAll = obj.replaceAll(" ", "");
                            StringBuffer stringBuffer = new StringBuffer();
                            int length3 = replaceAll.length();
                            int i9 = 0;
                            while (true) {
                                int i15 = i9 + 4;
                                if (i15 >= length3) {
                                    break;
                                }
                                stringBuffer.append(replaceAll.substring(i9, i15));
                                stringBuffer.append(" ");
                                i9 = i15;
                            }
                            stringBuffer.append(replaceAll.substring(i9));
                            String stringBuffer2 = stringBuffer.toString();
                            if (i8 <= stringBuffer2.length()) {
                                String substring2 = stringBuffer2.substring(0, i8);
                                String replaceAll2 = substring2.replaceAll(" ", "");
                                length = substring2.length();
                                length2 = replaceAll2.length();
                            } else {
                                String replaceAll3 = stringBuffer2.replaceAll(" ", "");
                                length = stringBuffer2.length();
                                length2 = replaceAll3.length();
                            }
                            this.mIsSelfSet = true;
                            setText(stringBuffer2);
                            setSelection((i8 + (length - length2)) - i4);
                            return;
                        }
                        return;
                    }
                    this.mIsSelfSet = false;
                } else if (i7 != 3) {
                    if (i7 != 5) {
                        if (i7 != 6) {
                            if (i7 == 7) {
                                if (obj.length() == CVV_4_PAYMENT_LENGTH && (onPasswdInputListener3 = this.mPasswdListener) != null) {
                                    onPasswdInputListener3.onDone();
                                }
                            }
                        } else if (obj.length() == CVV_PAYMENT_LENGTH && (onPasswdInputListener2 = this.mPasswdListener) != null) {
                            onPasswdInputListener2.onDone();
                        }
                    } else if (obj.length() == this.PASSWD_LENGTH && (onPasswdInputListener = this.mPasswdListener) != null) {
                        onPasswdInputListener.onDone();
                    }
                } else if (!this.mIsSelfSet) {
                    int length4 = obj.length();
                    if (length4 == 0) {
                        return;
                    }
                    if (length4 != 1) {
                        String replace = obj.replace("/", "");
                        if (length4 != 2 || !obj.contains("/")) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(replace.substring(0, 2));
                            sb.append("/");
                            if (replace.length() > 2) {
                                sb.append(replace.substring(2));
                            }
                            replace = sb.toString();
                        }
                        int selectionStart = getSelectionStart();
                        this.mIsSelfSet = true;
                        setText(replace);
                        if (length4 != 2) {
                            setSelection(selectionStart);
                        } else if (obj.contains("/")) {
                            setSelection(1);
                        } else if (selectionStart == 2) {
                            if (i3 <= i2) {
                                i6 = 2;
                            }
                            setSelection(i6);
                        }
                    }
                } else {
                    this.mIsSelfSet = false;
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean onTextContextMenuItem(int i) {
        EditState editState;
        if ((getInputType() & 128) > 0 || EditState.PASSWORD == (editState = this.mEditState) || EditState.CVV_PAYMENT == editState || EditState.CVV_4_PAYMENT == editState || editState == EditState.IDCARD_TAIL) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.mIsUseOfKinda) {
            clearFocus();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void set3DesEncrptData(String str) {
        if (str != null && str.length() != 0) {
            Encrypt encrypt = new Encrypt();
            setText(encrypt.desedeDecode(str, encrypt.getRandomKey()));
        }
    }

    public void setBankcardTailNum(String str) {
        this.mCardTailNum = str;
        if (str != null && str.length() > 0) {
            this.mEditState = EditState.BANKCARD_WITH_TAILNUM;
            Paint paint = new Paint();
            this.mTitlePaint = paint;
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            this.mTitlePaint.setAntiAlias(true);
            this.mTitlePaint.setTextSize(getTextSize());
            this.mIDCardPaint.setColor(getResources().getColor(C0966R.color.f3133gi));
        }
    }

    public void setClearBtnDrawableId(int i) {
        setClearBtnDrawableId(i, 0);
    }

    public void setCursorStyle(int i) {
        if (i != -1) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
                declaredField.setAccessible(true);
                declaredField.set(this, Integer.valueOf(i));
            } catch (Exception unused) {
            }
        }
    }

    public void setFilterChar(char[] cArr) {
        this.mFilterChar = cArr;
    }

    public void setFixedHeaderText(String str) {
        this.mFixedHeaderText = str;
        setPadding(((int) getPaint().measureText(this.mFixedHeaderText)) + getPaddingLeft(), getPaddingTop(), getPaddingBottom(), getPaddingRight());
        invalidate();
    }

    public void setIsBankcardFormat(boolean z) {
        if (z) {
            this.mEditState = EditState.BANKCARD;
        } else if (EditState.BANKCARD == this.mEditState) {
            this.mEditState = EditState.DEFAULT;
        }
    }

    public void setIsCvv4PaymentFormat(boolean z) {
        if (z) {
            setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            Paint paint = new Paint(1);
            this.mPaintBackground = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mIDCardPaint.setColor(getResources().getColor(C0966R.color.f3133gi));
            this.mEditState = EditState.CVV_4_PAYMENT;
            return;
        }
        this.mPaintBackground = null;
        if (EditState.CVV_4_PAYMENT == this.mEditState) {
            this.mEditState = EditState.DEFAULT;
        }
    }

    public void setIsCvvPaymentFormat(boolean z) {
        if (z) {
            setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            Paint paint = new Paint(1);
            this.mPaintBackground = paint;
            paint.setStyle(Paint.Style.FILL);
            this.mIDCardPaint.setColor(getResources().getColor(C0966R.color.f3133gi));
            this.mEditState = EditState.CVV_PAYMENT;
            return;
        }
        this.mPaintBackground = null;
        if (EditState.CVV_PAYMENT == this.mEditState) {
            this.mEditState = EditState.DEFAULT;
        }
    }

    public void setIsIdCardTailFormat(boolean z) {
        if (z) {
            setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            this.mEditState = EditState.IDCARD_TAIL;
            Paint paint = new Paint();
            this.mIDCardPaint = paint;
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            this.mIDCardPaint.setTextAlign(Paint.Align.CENTER);
            this.mIDCardPaint.setAntiAlias(true);
            this.mIDCardPaint.setTextSize(getTextSize());
            this.mIDCardPaint.setColor(getResources().getColor(C0966R.color.f3133gi));
            return;
        }
        this.mEditState = EditState.DEFAULT;
    }

    public void setIsMoneyAmountFormat(boolean z) {
        if (z) {
            this.mEditState = EditState.MONEY_AMOUNT;
        } else if (EditState.MONEY_AMOUNT == this.mEditState) {
            this.mEditState = EditState.DEFAULT;
        }
    }

    public void setIsPasswordFormat(boolean z, boolean z2) {
        if (z) {
            this.mNewPwdStyle = z2;
            setPadding(PASSWD_LEFT_PADDING, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            Paint paint = new Paint(1);
            this.mPaintBackground = paint;
            paint.setStyle(Paint.Style.FILL);
            if (C85875k4.m106211z()) {
                this.mPaintBackground.setColor(getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            } else {
                this.mPaintBackground.setColor(getResources().getColor(C0966R.color.BW_0));
            }
            this.mEditState = EditState.PASSWORD;
            Paint paint2 = new Paint(1);
            this.mPasswdSeparedPaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.mPasswdSeparedPaint.setStrokeWidth(1.5f);
            if (C85875k4.m106211z()) {
                this.mPasswdSeparedPaint.setColor(getResources().getColor(C0966R.color.FG_4));
            } else {
                this.mPasswdSeparedPaint.setColor(getResources().getColor(C0966R.color.FG_3));
            }
            Paint paint3 = new Paint(1);
            this.mPasswdBgPaint = paint3;
            paint3.setStyle(Paint.Style.FILL);
            if (C85875k4.m106211z()) {
                this.mPasswdBgPaint.setColor(218103807);
            } else {
                this.mPasswdBgPaint.setColor(getResources().getColor(C0966R.color.f2927a));
            }
        } else {
            this.mPaintBackground = null;
            if (EditState.PASSWORD == this.mEditState) {
                this.mEditState = EditState.DEFAULT;
            }
        }
    }

    public void setIsSecurityAnswerFormat(boolean z) {
        if (z) {
            this.mEditState = EditState.SECURITY_ANSWER;
        } else {
            this.mEditState = EditState.DEFAULT;
        }
    }

    public void setIsValidThru(boolean z) {
        if (z) {
            this.mEditState = EditState.VALID_THRU;
        } else if (EditState.VALID_THRU == this.mEditState) {
            this.mEditState = EditState.DEFAULT;
        }
    }

    public void setKindaEditTextCallBackListener(IKindaEditTextCallBackListener iKindaEditTextCallBackListener) {
        this.mKindaEditTextCallBackListener = iKindaEditTextCallBackListener;
    }

    public void setOnPasswdInputListener(OnPasswdInputListener onPasswdInputListener) {
        this.mPasswdListener = onPasswdInputListener;
    }

    public void setPwdLength(int i) {
        this.PASSWD_LENGTH = i;
    }

    public void setSecureEncrypt(ISecureEncrypt iSecureEncrypt) {
        this.mIEncrypt = iSecureEncrypt;
    }

    public void setUseOfKinda(boolean z) {
        this.mIsUseOfKinda = z;
    }

    public void setValidThru(String str) {
        if (str != null && str.length() == VALID_THRU_LEN) {
            setText(str);
            this.mEditState = EditState.VALID_THRU;
        }
    }

    public void setregExFilterInput(String str) {
        this.regExFilterInput = str;
    }

    public TempSecureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mEditState = EditState.DEFAULT;
        this.mNewPwdStyle = true;
        this.PASSWD_LENGTH = 6;
        this.mIEncrypt = new TenpaySecureEncrypt();
        init(context, attributeSet);
    }

    public String getEncryptDataWithHash(boolean z, boolean z2) {
        String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return null;
        }
        Log.m105925i("TempSecureEditText", "timestamp: %s, 2048: %s", mTimeStamp, Boolean.valueOf(z2));
        ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        if (iSecureEncrypt == null) {
            if (z) {
                inputText = TenpayUtil.md5HexDigest(inputText);
            }
            Encrypt encrypt = new Encrypt();
            String str = mTimeStamp;
            if (str != null) {
                encrypt.setTimeStamp(str);
            }
            if (z2) {
                return encrypt.encryptPasswdWithRSA2048(inputText);
            }
            return encrypt.encryptPasswd(inputText);
        } else if (z2) {
            return iSecureEncrypt.encryptPasswdWithRSA2048(z, inputText, mTimeStamp);
        } else {
            return iSecureEncrypt.encryptPasswd(z, inputText, mTimeStamp);
        }
    }

    public void setClearBtnDrawableId(int i, int i2) {
        setClearBtnDrawableId(i, i2, 0, 0);
    }

    public void setClearBtnDrawableId(int i, int i2, int i3, int i4) {
        try {
            Drawable drawable = getResources().getDrawable(i);
            this.mClearBtnImg = drawable;
            if (i2 != 0) {
                drawable.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
            }
        } catch (Exception unused) {
            this.mClearBtnImg = null;
        }
        Drawable drawable2 = this.mClearBtnImg;
        if (drawable2 != null) {
            if (i3 == 0 || i4 == 0) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.mClearBtnImg.getIntrinsicHeight());
            } else {
                drawable2.setBounds(0, 0, C74942w4.m89784a(getContext(), i3), C74942w4.m89784a(getContext(), i4));
            }
            setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
                    r6 = com.tenpay.android.wechat.TempSecureEditText.EditState.PASSWORD;
                    r2 = r4.this$0;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onFocusChange(android.view.View r5, boolean r6) {
                    /*
                        r4 = this;
                        r5 = 3
                        r0 = 1
                        r1 = 0
                        if (r6 != 0) goto L_0x0022
                        com.tenpay.android.wechat.TempSecureEditText r6 = com.tenpay.android.wechat.TempSecureEditText.this
                        android.graphics.drawable.Drawable[] r2 = r6.getCompoundDrawables()
                        r1 = r2[r1]
                        com.tenpay.android.wechat.TempSecureEditText r2 = com.tenpay.android.wechat.TempSecureEditText.this
                        android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawables()
                        r0 = r2[r0]
                        r2 = 0
                        com.tenpay.android.wechat.TempSecureEditText r3 = com.tenpay.android.wechat.TempSecureEditText.this
                        android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
                        r5 = r3[r5]
                        r6.setCompoundDrawables(r1, r0, r2, r5)
                        goto L_0x0063
                    L_0x0022:
                        com.tenpay.android.wechat.TempSecureEditText r6 = com.tenpay.android.wechat.TempSecureEditText.this
                        android.text.Editable r6 = r6.getText()
                        java.lang.String r6 = r6.toString()
                        java.lang.String r2 = ""
                        boolean r6 = r6.equals(r2)
                        if (r6 != 0) goto L_0x0063
                        com.tenpay.android.wechat.TempSecureEditText$EditState r6 = com.tenpay.android.wechat.TempSecureEditText.EditState.PASSWORD
                        com.tenpay.android.wechat.TempSecureEditText r2 = com.tenpay.android.wechat.TempSecureEditText.this
                        com.tenpay.android.wechat.TempSecureEditText$EditState r3 = r2.mEditState
                        if (r6 == r3) goto L_0x0063
                        com.tenpay.android.wechat.TempSecureEditText$EditState r6 = com.tenpay.android.wechat.TempSecureEditText.EditState.CVV_PAYMENT
                        if (r6 == r3) goto L_0x0063
                        com.tenpay.android.wechat.TempSecureEditText$EditState r6 = com.tenpay.android.wechat.TempSecureEditText.EditState.CVV_4_PAYMENT
                        if (r6 == r3) goto L_0x0063
                        android.graphics.drawable.Drawable[] r6 = r2.getCompoundDrawables()
                        r6 = r6[r1]
                        com.tenpay.android.wechat.TempSecureEditText r1 = com.tenpay.android.wechat.TempSecureEditText.this
                        android.graphics.drawable.Drawable[] r1 = r1.getCompoundDrawables()
                        r0 = r1[r0]
                        com.tenpay.android.wechat.TempSecureEditText r1 = com.tenpay.android.wechat.TempSecureEditText.this
                        android.graphics.drawable.Drawable r1 = r1.mClearBtnImg
                        com.tenpay.android.wechat.TempSecureEditText r3 = com.tenpay.android.wechat.TempSecureEditText.this
                        android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
                        r5 = r3[r5]
                        r2.setCompoundDrawables(r6, r0, r1, r5)
                    L_0x0063:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tenpay.android.wechat.TempSecureEditText.C752502.onFocusChange(android.view.View, boolean):void");
                }
            });
            setOnTouchListener(new View.OnTouchListener() {
                private byte _hellAccFlag_;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    arrayList.add(motionEvent);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tenpay/android/wechat/TempSecureEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                    EditState editState = EditState.PASSWORD;
                    TempSecureEditText tempSecureEditText = TempSecureEditText.this;
                    EditState editState2 = tempSecureEditText.mEditState;
                    if (!(editState == editState2 || EditState.CVV_PAYMENT == editState2 || EditState.CVV_4_PAYMENT == editState2)) {
                        if (motionEvent.getAction() == 1 && !tempSecureEditText.isFocused() && TempSecureEditText.this.mKindaEditTextCallBackListener != null) {
                            TempSecureEditText.this.mKindaEditTextCallBackListener.onCallBackKinda();
                        }
                        if (tempSecureEditText.getCompoundDrawables()[2] == null) {
                            C117292a.m165362h(false, this, "com/tenpay/android/wechat/TempSecureEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        } else if (motionEvent.getAction() != 1) {
                            C117292a.m165362h(false, this, "com/tenpay/android/wechat/TempSecureEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        } else if (motionEvent.getX() > ((float) ((tempSecureEditText.getWidth() - tempSecureEditText.getPaddingRight()) - TempSecureEditText.this.mClearBtnImg.getIntrinsicWidth()))) {
                            tempSecureEditText.setText("");
                        }
                    }
                    C117292a.m165362h(false, this, "com/tenpay/android/wechat/TempSecureEditText$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
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
            private byte _hellAccFlag_;

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tenpay/android/wechat/TempSecureEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                C117292a.m165362h(false, this, "com/tenpay/android/wechat/TempSecureEditText$5", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        });
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

    public String get3DesEncrptData(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ISecureEncrypt iSecureEncrypt = this.mIEncrypt;
        if (iSecureEncrypt != null) {
            return iSecureEncrypt.desedeEncode(str, mTimeStamp);
        }
        return new Encrypt().desedeEncode(str);
    }

    public TempSecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEditState = EditState.DEFAULT;
        this.mNewPwdStyle = true;
        this.PASSWD_LENGTH = 6;
        this.mIEncrypt = new TenpaySecureEncrypt();
        init(context, attributeSet);
    }
}
